import android.os.Handler;
import java.util.concurrent.Executor;
import android.content.ServiceConnection;
import android.os.Handler$Callback;
import android.os.Looper;
import android.content.Context;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class myz extends l5c
{
    public final HashMap<tsz, iuz> d;
    public final Context e;
    public volatile kfz f;
    public final ei6 g;
    public final long h;
    public final long i;
    
    public myz(final Context context, final Looper looper) {
        this.d = new HashMap<tsz, iuz>();
        final lxz lxz = new lxz(this);
        this.e = context.getApplicationContext();
        this.f = new kfz(looper, (Handler$Callback)lxz);
        this.g = ei6.b();
        this.h = 5000L;
        this.i = 300000L;
    }
    
    public final boolean d(final tsz tsz, final ServiceConnection serviceConnection, final String s, final Executor executor) {
        synchronized (this.d) {
            final iuz iuz = this.d.get(tsz);
            iuz iuz3;
            if (iuz == null) {
                final iuz iuz2 = new iuz(this, tsz);
                iuz2.F0.put(serviceConnection, serviceConnection);
                iuz2.a(s, executor);
                this.d.put(tsz, iuz2);
                iuz3 = iuz2;
            }
            else {
                ((Handler)this.f).removeMessages(0, (Object)tsz);
                if (iuz.F0.containsKey(serviceConnection)) {
                    final String string = tsz.toString();
                    final StringBuilder sb = new StringBuilder(string.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                iuz.F0.put(serviceConnection, serviceConnection);
                final int g0 = iuz.G0;
                if (g0 != 1) {
                    if (g0 != 2) {
                        iuz3 = iuz;
                    }
                    else {
                        iuz.a(s, executor);
                        iuz3 = iuz;
                    }
                }
                else {
                    serviceConnection.onServiceConnected(iuz.K0, iuz.I0);
                    iuz3 = iuz;
                }
            }
            return iuz3.H0;
        }
    }
}
