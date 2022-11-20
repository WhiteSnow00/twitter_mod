import android.net.NetworkInfo;
import android.net.ConnectivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n3z extends zmz
{
    public n3z(final poz poz) {
        super(poz);
    }
    
    public final void j() {
    }
    
    public final boolean k() {
        this.h();
        final ConnectivityManager connectivityManager = (ConnectivityManager)((pbz)this).D0.D0.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo;
        final NetworkInfo networkInfo = activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            }
            catch (final SecurityException ex) {
                activeNetworkInfo = networkInfo;
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
