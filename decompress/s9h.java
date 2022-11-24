import android.os.BaseBundle;
import java.util.Iterator;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentName;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import android.util.Log;
import java.util.HashMap;
import android.content.Context;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s9h implements uf1
{
    public final a a;
    public final d67 b;
    public final Map<String, y1u> c;
    
    public s9h(final Context context, final d67 b) {
        final a a = new a(context);
        this.c = new HashMap();
        this.a = a;
        this.b = b;
    }
    
    public final y1u a(final String s) {
        synchronized (this) {
            if (this.c.containsKey(s)) {
                return this.c.get(s);
            }
            final tf1 a = this.a.a(s);
            if (a == null) {
                return null;
            }
            final d67 b = this.b;
            final y1u create = a.create(new wa1(b.a, b.b, b.c, s));
            this.c.put(s, create);
            return create;
        }
    }
    
    public static final class a
    {
        public final Context a;
        public Map<String, String> b;
        
        public a(final Context a) {
            this.b = null;
            this.a = a;
        }
        
        public final tf1 a(String s) {
            if (this.b == null) {
                final Context a = this.a;
                Object metaData = null;
                Label_0101: {
                    try {
                        final PackageManager packageManager = a.getPackageManager();
                        if (packageManager == null) {
                            Log.w("BackendRegistry", "Context has no PackageManager.");
                        }
                        else {
                            final ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(a, (Class)TransportBackendDiscovery.class), 128);
                            if (serviceInfo != null) {
                                metaData = serviceInfo.metaData;
                                break Label_0101;
                            }
                            Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                        }
                    }
                    catch (final PackageManager$NameNotFoundException ex) {
                        Log.w("BackendRegistry", "Application info not found.");
                    }
                    metaData = null;
                }
                Object emptyMap;
                if (metaData == null) {
                    Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                    emptyMap = Collections.emptyMap();
                }
                else {
                    final HashMap<String, String> hashMap = new HashMap<String, String>();
                    for (final String s2 : ((BaseBundle)metaData).keySet()) {
                        final Object value = ((BaseBundle)metaData).get(s2);
                        if (value instanceof String && s2.startsWith("backend:")) {
                            final String[] split = ((String)value).split(",", -1);
                            for (int length = split.length, i = 0; i < length; ++i) {
                                final String trim = split[i].trim();
                                if (!trim.isEmpty()) {
                                    hashMap.put(trim, s2.substring(8));
                                }
                            }
                        }
                    }
                    emptyMap = hashMap;
                }
                this.b = (Map<String, String>)emptyMap;
            }
            s = this.b.get(s);
            if (s == null) {
                return null;
            }
            try {
                return (tf1)Class.forName(s).asSubclass(tf1.class).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            }
            catch (final InvocationTargetException ex2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", s), (Throwable)ex2);
            }
            catch (final NoSuchMethodException ex3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", s), (Throwable)ex3);
            }
            catch (final InstantiationException ex4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", s), (Throwable)ex4);
            }
            catch (final IllegalAccessException ex5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", s), (Throwable)ex5);
            }
            catch (final ClassNotFoundException ex6) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", s), (Throwable)ex6);
            }
            return null;
        }
    }
}
