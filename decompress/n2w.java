import android.os.IInterface;
import android.os.RemoteException;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n2w implements ServiceConnection
{
    public d4d F0;
    public erm<Integer> G0;
    public final Context H0;
    public boolean I0;
    
    public n2w(final Context h0) {
        this.F0 = null;
        this.I0 = false;
        this.H0 = h0;
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        final int a = d4d.a.a;
        Object f0;
        if (binder == null) {
            f0 = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            if (queryLocalInterface != null && queryLocalInterface instanceof d4d) {
                f0 = queryLocalInterface;
            }
            else {
                f0 = new d4d.a.a(binder);
            }
        }
        this.F0 = (d4d)f0;
        try {
            ((d4d)f0).S((c4d)new m2w(this));
        }
        catch (final RemoteException ex) {
            this.G0.n(0);
        }
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        this.F0 = null;
    }
}
