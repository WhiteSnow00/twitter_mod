import android.os.RemoteException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ucy extends cdy
{
    public final int G0;
    public final String H0;
    public final String I0;
    public final int J0;
    public final ffz K0;
    public final shy L0;
    
    public ucy(final shy l0, final ffz ffz, final int g0, final String h0, final String i0, final int j0, final ffz k0) {
        this.L0 = l0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        super((ffz<?>)ffz);
    }
    
    @Override
    public final void a() {
        try {
            final shy l0 = this.L0;
            l0.d.n.S0(l0.a, shy.k(this.G0, this.H0, this.I0, this.J0), shy.g(), (u000)new agy((ffz<Void>)this.K0));
        }
        catch (final RemoteException ex) {
            shy.g.k((Throwable)ex, "notifyChunkTransferred", new Object[0]);
        }
    }
}
