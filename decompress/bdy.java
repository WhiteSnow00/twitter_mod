import android.os.BaseBundle;
import android.os.RemoteException;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bdy extends cdy
{
    public final int G0;
    public final String H0;
    public final ffz I0;
    public final int J0;
    public final shy K0;
    
    public bdy(final shy k0, final ffz ffz, final int g0, final String h0, final ffz i0, final int j0) {
        this.K0 = k0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        super((ffz<?>)ffz);
    }
    
    @Override
    public final void a() {
        try {
            final shy k0 = this.K0;
            final yzz yzz = k0.d.n;
            final String a = k0.a;
            final int g0 = this.G0;
            final String h0 = this.H0;
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putInt("session_id", g0);
            ((BaseBundle)bundle).putString("module_name", h0);
            yzz.v0(a, bundle, shy.g(), (u000)new jgy(this.K0, this.I0, this.G0, this.H0, this.J0));
        }
        catch (final RemoteException ex) {
            shy.g.k((Throwable)ex, "notifyModuleCompleted", new Object[0]);
        }
    }
}
