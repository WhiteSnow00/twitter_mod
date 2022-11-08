import android.os.IInterface;
import android.os.RemoteException;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j1w implements ServiceConnection
{
    public y3d C0;
    public zpm<Integer> D0;
    public final Context E0;
    public boolean F0;
    
    public j1w(final Context e0) {
        this.C0 = null;
        this.F0 = false;
        this.E0 = e0;
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        final int a = y3d$a.a;
        Object c0;
        if (binder == null) {
            c0 = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            if (queryLocalInterface != null && queryLocalInterface instanceof y3d) {
                c0 = queryLocalInterface;
            }
            else {
                c0 = new y3d$a$a(binder);
            }
        }
        this.C0 = (y3d)c0;
        try {
            ((y3d)c0).S((x3d)new i1w(this));
        }
        catch (final RemoteException ex) {
            this.D0.n(0);
        }
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        this.C0 = null;
    }
}
