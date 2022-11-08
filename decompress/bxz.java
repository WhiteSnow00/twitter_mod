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

public final class bxz extends h5c
{
    public final HashMap<grz, wsz> d;
    public final Context e;
    public volatile xdz f;
    public final sh6 g;
    public final long h;
    public final long i;
    
    public bxz(final Context context, final Looper looper) {
        this.d = new HashMap<grz, wsz>();
        final awz awz = new awz(this);
        this.e = context.getApplicationContext();
        this.f = new xdz(looper, (Handler$Callback)awz);
        this.g = sh6.b();
        this.h = 5000L;
        this.i = 300000L;
    }
    
    @Override
    public final boolean d(final grz grz, final ServiceConnection serviceConnection, String string, final Executor executor) {
        synchronized (this.d) {
            final wsz wsz = this.d.get(grz);
            wsz wsz3;
            if (wsz == null) {
                final wsz wsz2 = new wsz(this, grz);
                wsz2.C0.put(serviceConnection, serviceConnection);
                wsz2.a(string, executor);
                this.d.put(grz, wsz2);
                wsz3 = wsz2;
            }
            else {
                ((Handler)this.f).removeMessages(0, (Object)grz);
                if (wsz.C0.containsKey(serviceConnection)) {
                    string = grz.toString();
                    final StringBuilder sb = new StringBuilder(string.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                wsz.C0.put(serviceConnection, serviceConnection);
                final int d0 = wsz.D0;
                if (d0 != 1) {
                    if (d0 != 2) {
                        wsz3 = wsz;
                    }
                    else {
                        wsz.a(string, executor);
                        wsz3 = wsz;
                    }
                }
                else {
                    serviceConnection.onServiceConnected(wsz.H0, wsz.F0);
                    wsz3 = wsz;
                }
            }
            return wsz3.E0;
        }
    }
}
