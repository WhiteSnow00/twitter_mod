// 
// Decompiled by Procyon v0.6.0
// 

public final class io4 extends ste implements ftb<x66, Integer, fzv>
{
    public final hdd<cgv> D0;
    public final qsb<cgv, fzv> E0;
    public final qsb<cgv, fzv> F0;
    public final okh G0;
    public final int H0;
    public final int I0;
    
    public io4(final hdd<? extends cgv> d0, final qsb<? super cgv, fzv> e0, final qsb<? super cgv, fzv> f0, final okh g0, final int h0, final int i0) {
        this.D0 = (hdd<cgv>)d0;
        this.E0 = (qsb<cgv, fzv>)e0;
        this.F0 = (qsb<cgv, fzv>)f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final x66 x66 = (x66)o;
        ((Number)o2).intValue();
        co4.f((hdd)this.D0, (qsb)this.E0, (qsb)this.F0, this.G0, x66, this.H0 | 0x1, this.I0);
        return fzv.a;
    }
}
