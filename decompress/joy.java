import android.os.Build$VERSION;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class joy extends ClassLoader
{
    public final Class<?> loadClass(final String s, final boolean b) throws ClassNotFoundException {
        if ("com.google.android.gms.iid.MessengerCompat".equals(s)) {
            if (Log.isLoggable("CloudMessengerCompat", 3) || (Build$VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3))) {
                Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
            }
            return mty.class;
        }
        return super.loadClass(s, b);
    }
}
