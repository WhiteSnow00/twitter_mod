import android.net.NetworkInfo;
import android.content.Context;
import android.net.ConnectivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adi
{
    public boolean a;
    public final ConnectivityManager b;
    
    public adi(final Context context) {
        this.b = (ConnectivityManager)context.getSystemService("connectivity");
        this.a();
    }
    
    public final void a() {
        final NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        boolean a = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                a = true;
            }
            this.a = a;
            activeNetworkInfo.getType();
        }
        else {
            this.a = false;
        }
    }
}
