import android.os.Handler;
import android.os.IInterface;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kxy implements ServiceConnection
{
    public final int D0;
    public final bm1 E0;
    
    public kxy(final bm1 e0, final int d0) {
        this.E0 = e0;
        this.D0 = d0;
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        final bm1 e0 = this.E0;
        if (binder == null) {
            bm1.K(e0);
            return;
        }
        synchronized (e0.P0) {
            final bm1 e2 = this.E0;
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            Object q0;
            if (queryLocalInterface != null && queryLocalInterface instanceof a2d) {
                q0 = queryLocalInterface;
            }
            else {
                q0 = new lay(binder);
            }
            e2.Q0 = (a2d)q0;
            monitorexit(e0.P0);
            final bm1 e3 = this.E0;
            final int d0 = this.D0;
            final uiy n0 = e3.N0;
            ((Handler)n0).sendMessage(((Handler)n0).obtainMessage(7, d0, -1, (Object)new t6z(e3, 0)));
        }
    }
    
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName = (ComponentName)this.E0.P0;
        synchronized (componentName) {
            final bm1 e0 = this.E0;
            e0.Q0 = null;
            monitorexit(componentName);
            componentName = (ComponentName)e0.N0;
            ((Handler)componentName).sendMessage(((Handler)componentName).obtainMessage(6, this.D0, 1));
        }
    }
}
