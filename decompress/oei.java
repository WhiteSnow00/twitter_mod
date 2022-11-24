import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build$VERSION;
import android.net.ConnectivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oei
{
    public static final String a;
    
    static {
        final String g = jag.g("NetworkStateTracker");
        e0e.e((Object)g, "tagWithPrefix(\"NetworkStateTracker\")");
        a = g;
    }
    
    public static final mei a(final ConnectivityManager connectivityManager) {
        e0e.f((Object)connectivityManager, "<this>");
        final NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean b = true;
        final boolean b2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean b3 = false;
        Label_0088: {
            if (Build$VERSION.SDK_INT >= 23) {
                try {
                    final NetworkCapabilities a = xci.a(connectivityManager, yci.a(connectivityManager));
                    if (a != null) {
                        b3 = xci.b(a, 16);
                        break Label_0088;
                    }
                }
                catch (final SecurityException ex) {
                    jag.e().d(oei.a, "Unable to validate active network", (Throwable)ex);
                }
            }
            b3 = false;
        }
        final boolean a2 = mi6.a(connectivityManager);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            b = false;
        }
        return new mei(b2, b3, a2, b);
    }
}
