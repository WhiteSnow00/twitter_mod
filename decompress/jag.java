import android.os.Build$VERSION;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jag
{
    public static void a(String d, final String s, final Object o) {
        d = d(d);
        if (Log.isLoggable(d, 3)) {
            Log.d(d, String.format(s, o));
        }
    }
    
    public static void b(String d, final String s, final Object... array) {
        d = d(d);
        if (Log.isLoggable(d, 3)) {
            Log.d(d, String.format(s, array));
        }
    }
    
    public static void c(String d, final String s, final Throwable t) {
        d = d(d);
        if (Log.isLoggable(d, 6)) {
            Log.e(d, s, t);
        }
    }
    
    public static String d(String s) {
        if (Build$VERSION.SDK_INT < 24) {
            final String s2 = s = l7k.c("TRuntime.", s);
            if (s2.length() > 23) {
                s = s2.substring(0, 23);
            }
            return s;
        }
        return l7k.c("TRuntime.", s);
    }
    
    public static void e(final String s, final Object o) {
        final String d = d("CctTransportBackend");
        if (Log.isLoggable(d, 4)) {
            Log.i(d, String.format(s, o));
        }
    }
}
