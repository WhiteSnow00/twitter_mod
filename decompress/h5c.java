import android.os.Handler;
import java.util.concurrent.Executor;
import android.content.ServiceConnection;
import android.content.Context;
import android.os.HandlerThread;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class h5c
{
    public static final Object a;
    public static bxz b;
    public static HandlerThread c;
    
    static {
        a = new Object();
    }
    
    public static h5c a(final Context context) {
        synchronized (h5c.a) {
            if (h5c.b == null) {
                h5c.b = new bxz(context.getApplicationContext(), context.getMainLooper());
            }
            return h5c.b;
        }
    }
    
    public static HandlerThread b() {
        synchronized (h5c.a) {
            final HandlerThread c = h5c.c;
            if (c != null) {
                return c;
            }
            ((Thread)(h5c.c = new HandlerThread("GoogleApiHandler", 9))).start();
            return h5c.c;
        }
    }
    
    public final void c(final String s, String string, int n, final ServiceConnection serviceConnection, final boolean b) {
        final grz grz = new grz(s, string, n, b);
        final bxz bxz = (bxz)this;
        synchronized (bxz.d) {
            final wsz wsz = bxz.d.get(grz);
            if (wsz == null) {
                final String string2 = grz.toString();
                n = string2.length();
                final StringBuilder sb = new StringBuilder(n + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(string2);
                throw new IllegalStateException(sb.toString());
            }
            if (wsz.C0.containsKey(serviceConnection)) {
                wsz.C0.remove(serviceConnection);
                if (wsz.C0.isEmpty()) {
                    ((Handler)bxz.f).sendMessageDelayed(((Handler)bxz.f).obtainMessage(0, (Object)grz), bxz.h);
                }
                return;
            }
            string = grz.toString();
            n = string.length();
            final StringBuilder sb2 = new StringBuilder(n + 76);
            sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
            sb2.append(string);
            throw new IllegalStateException(sb2.toString());
        }
    }
    
    public abstract boolean d(final grz p0, final ServiceConnection p1, final String p2, final Executor p3);
}
