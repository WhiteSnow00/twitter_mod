import android.net.Network;
import android.net.ConnectivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hci
{
    public static final Network a(final ConnectivityManager connectivityManager) {
        czd.f((Object)connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
