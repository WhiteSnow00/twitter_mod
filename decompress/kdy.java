import android.os.BaseBundle;
import android.os.RemoteException;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kdy extends cdy
{
    public final int G0;
    public final ffz H0;
    public final shy I0;
    
    public kdy(final shy i0, final ffz ffz, final int g0, final ffz h0) {
        this.I0 = i0;
        this.G0 = g0;
        this.H0 = h0;
        super((ffz<?>)ffz);
    }
    
    @Override
    public final void a() {
        try {
            final shy i0 = this.I0;
            final yzz yzz = i0.d.n;
            final String a = i0.a;
            final int g0 = this.G0;
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putInt("session_id", g0);
            yzz.B0(a, bundle, shy.g(), (u000)new sgy(this.I0, this.H0));
        }
        catch (final RemoteException ex) {
            shy.g.k((Throwable)ex, "notifySessionFailed", new Object[0]);
        }
    }
}
