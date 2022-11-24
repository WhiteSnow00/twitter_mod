import android.os.Handler;
import android.content.ServiceConnection;
import android.content.ComponentName;
import java.util.Objects;
import android.util.Log;
import android.os.Message;
import android.os.Handler$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lxz implements Handler$Callback
{
    public final myz F0;
    
    public lxz(final myz f0) {
        this.F0 = f0;
    }
    
    public final boolean handleMessage(final Message message) {
        final int what = message.what;
        if (what != 0) {
            if (what != 1) {
                return false;
            }
            synchronized (this.F0.d) {
                final tsz tsz = (tsz)message.obj;
                final iuz iuz = this.F0.d.get(tsz);
                if (iuz != null && iuz.G0 == 3) {
                    final String value = String.valueOf(tsz);
                    final StringBuilder sb = new StringBuilder(value.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(value);
                    Log.e("GmsClientSupervisor", sb.toString(), (Throwable)new Exception());
                    ComponentName k0;
                    if ((k0 = iuz.K0) == null) {
                        Objects.requireNonNull(tsz);
                        k0 = null;
                    }
                    ComponentName componentName;
                    if ((componentName = k0) == null) {
                        componentName = new(android.content.ComponentName.class)();
                        final String b = tsz.b;
                        iuk.C((Object)b);
                        new ComponentName(b, "unknown");
                    }
                    iuz.onServiceDisconnected(componentName);
                }
                return true;
            }
        }
        synchronized (this.F0.d) {
            final tsz tsz2 = (tsz)message.obj;
            final iuz iuz2 = this.F0.d.get(tsz2);
            if (iuz2 != null && iuz2.F0.isEmpty()) {
                if (iuz2.H0) {
                    ((Handler)iuz2.L0.f).removeMessages(1, (Object)iuz2.J0);
                    final myz l0 = iuz2.L0;
                    l0.g.c(l0.e, (ServiceConnection)iuz2);
                    iuz2.H0 = false;
                    iuz2.G0 = 2;
                }
                this.F0.d.remove(tsz2);
            }
            return true;
        }
    }
}
