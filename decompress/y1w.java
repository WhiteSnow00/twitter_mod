import android.os.IInterface;
import android.os.RemoteException;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y1w implements ServiceConnection
{
    public d3d D0;
    public qqm<Integer> E0;
    public final Context F0;
    public boolean G0;
    
    public y1w(final Context f0) {
        this.D0 = null;
        this.G0 = false;
        this.F0 = f0;
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        final int a = d3d$a.a;
        Object d0;
        if (binder == null) {
            d0 = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            if (queryLocalInterface != null && queryLocalInterface instanceof d3d) {
                d0 = queryLocalInterface;
            }
            else {
                d0 = new d3d$a$a(binder);
            }
        }
        this.D0 = (d3d)d0;
        try {
            ((d3d)d0).S((c3d)new x1w(this));
        }
        catch (final RemoteException ex) {
            this.E0.n((Object)0);
        }
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        this.D0 = null;
    }
}
