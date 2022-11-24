// 
// Decompiled by Procyon v0.6.0
// 

public final class ogz implements Runnable
{
    public final jdy F0;
    public final int G0;
    public final long H0;
    public final boolean I0;
    public final jdy J0;
    public final ahz K0;
    
    public ogz(final ahz k0, final jdy f0, final int g0, final long h0, final boolean i0, final jdy j0) {
        this.K0 = k0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    @Override
    public final void run() {
        this.K0.A(this.F0);
        ahz.J(this.K0, this.F0, this.G0, this.H0, false, this.I0);
        ywz.c();
        if (((ocz)this.K0).F0.L0.t((String)null, s0z.E0)) {
            ahz.I(this.K0, this.F0, this.J0);
        }
    }
}
