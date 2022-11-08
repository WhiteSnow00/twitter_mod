import android.net.Network;
import android.net.ConnectivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fci
{
    public static final Network a(final ConnectivityManager connectivityManager) {
        zzd.f((Object)connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
