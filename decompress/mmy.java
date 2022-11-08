import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.gms.dynamite.DynamiteModule$a;
import com.google.android.gms.dynamite.DynamiteModule;
import android.os.IInterface;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import android.os.IBinder;
import android.util.Log;
import java.util.Objects;
import android.annotation.SuppressLint;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mmy
{
    @SuppressLint({ "StaticFieldLeak" })
    public static Context a;
    public static jwy b;
    
    public static <T> T a(final Class<?> clazz) {
        try {
            return clazz.newInstance();
        }
        catch (final IllegalAccessException ex) {
            final String name = clazz.getName();
            String concat;
            if (name.length() != 0) {
                concat = "Unable to call the default constructor of ".concat(name);
            }
            else {
                concat = new String("Unable to call the default constructor of ");
            }
            throw new IllegalStateException(concat);
        }
        catch (final InstantiationException ex2) {
            final String name2 = clazz.getName();
            String concat2;
            if (name2.length() != 0) {
                concat2 = "Unable to instantiate the dynamic class ".concat(name2);
            }
            else {
                concat2 = new String("Unable to instantiate the dynamic class ");
            }
            throw new IllegalStateException(concat2);
        }
    }
    
    public static jwy b(final Context context) throws GooglePlayServicesNotAvailableException {
        Objects.requireNonNull(context, "null reference");
        final jwy b = mmy.b;
        if (b != null) {
            return b;
        }
        final int e = b6c.e;
        final int b2 = c6c.b(context, 13400000);
        if (b2 == 0) {
            Log.i("mmy", "Making Creator dynamically");
            final ClassLoader classLoader = c(context).getClassLoader();
            try {
                Objects.requireNonNull(classLoader, "null reference");
                final IBinder binder = a(classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
                Object b3;
                if (binder == null) {
                    b3 = null;
                }
                else {
                    final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                    if (queryLocalInterface instanceof jwy) {
                        b3 = queryLocalInterface;
                    }
                    else {
                        b3 = new f1z(binder);
                    }
                }
                mmy.b = (jwy)b3;
                try {
                    ((jwy)b3).C0((g3d)new x4j((Object)c(context).getResources()));
                    return mmy.b;
                }
                catch (final RemoteException ex) {
                    throw new RuntimeRemoteException(ex);
                }
            }
            catch (final ClassNotFoundException ex2) {
                throw new IllegalStateException("Unable to find dynamic class ".concat("com.google.android.gms.maps.internal.CreatorImpl"));
            }
        }
        throw new GooglePlayServicesNotAvailableException(b2);
    }
    
    public static Context c(Context a) {
        final Context a2 = mmy.a;
        if (a2 != null) {
            return a2;
        }
        try {
            a = DynamiteModule.c(a, (DynamiteModule$a)DynamiteModule.b, "com.google.android.gms.maps_dynamite").a;
        }
        catch (final Exception ex) {
            Log.e("mmy", "Failed to load maps module, use legacy", (Throwable)ex);
            final int e = b6c.e;
            try {
                a = a.createPackageContext("com.google.android.gms", 3);
            }
            catch (final PackageManager$NameNotFoundException ex2) {
                a = null;
            }
        }
        return mmy.a = a;
    }
}
