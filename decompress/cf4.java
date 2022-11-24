// 
// Decompiled by Procyon v0.6.0
// 

public final class cf4 extends pue implements stb<cip, vzv>
{
    public final t0n F0;
    public final String G0;
    public final ptb<vzv> H0;
    public final String I0;
    public final boolean J0;
    public final ptb<vzv> K0;
    
    public cf4(final t0n f0, final String g0, final ptb<vzv> h0, final String i0, final boolean j0, final ptb<vzv> k0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final cip cip = (cip)o;
        e0e.f((Object)cip, "$this$semantics");
        final t0n f0 = this.F0;
        if (f0 != null) {
            zhp.j(cip, f0.a);
        }
        final String g0 = this.G0;
        final af4 af4 = new af4(this.K0);
        final ape<Object>[] a = zhp.a;
        final lhp a2 = lhp.a;
        cip.e((bip<qf>)lhp.c, new qf(g0, (utb)af4));
        final ptb<vzv> h0 = this.H0;
        if (h0 != null) {
            cip.e((bip<qf>)lhp.d, new qf(this.I0, (utb)new bf4((ptb)h0)));
        }
        if (!this.J0) {
            zhp.a(cip);
        }
        return vzv.a;
    }
}
