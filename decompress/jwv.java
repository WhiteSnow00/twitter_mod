// 
// Decompiled by Procyon v0.6.0
// 

public final class jwv implements mwv<sjl>
{
    public final String F0;
    public final String G0;
    public final long H0;
    public final String I0;
    public final String J0;
    public final String K0;
    public final String L0;
    public final String M0;
    
    public jwv(final String f0, final String g0, final long h0, final String i0, final String j0, final String k0, final String l0, final String m0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
    }
    
    public final Object b(final y4c y4c, final lsm lsm) {
        if (flr.g((CharSequence)this.F0)) {
            final qgv f = y4c.f(this.F0);
            if (f != null) {
                final a61 a = a61.a(f);
                return new sjl(this.G0, this.H0, this.I0, this.J0, a, this.K0, this.L0, this.M0);
            }
        }
        final a61 a = null;
        return new sjl(this.G0, this.H0, this.I0, this.J0, a, this.K0, this.L0, this.M0);
    }
}
