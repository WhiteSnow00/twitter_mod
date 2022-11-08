import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build$VERSION;
import android.net.ConnectivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tdi
{
    public static final String a;
    
    static {
        final String g = y9g.g("NetworkStateTracker");
        zzd.e((Object)g, "tagWithPrefix(\"NetworkStateTracker\")");
        a = g;
    }
    
    public static final rdi a(final ConnectivityManager connectivityManager) {
        zzd.f((Object)connectivityManager, "<this>");
        final NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean b = true;
        final boolean b2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean b3 = false;
        Label_0087: {
            if (Build$VERSION.SDK_INT >= 23) {
                try {
                    final NetworkCapabilities a = eci.a(connectivityManager, fci.a(connectivityManager));
                    if (a != null) {
                        b3 = eci.b(a, 16);
                        break Label_0087;
                    }
                }
                catch (final SecurityException ex) {
                    y9g.e().d(tdi.a, "Unable to validate active network", (Throwable)ex);
                }
            }
            b3 = false;
        }
        final boolean a2 = ai6.a(connectivityManager);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            b = false;
        }
        return new rdi(b2, b3, a2, b);
    }
}
