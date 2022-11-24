// 
// Decompiled by Procyon v0.6.0
// 

public final class np4 extends pue implements hub<d86, Integer, vzv>
{
    public final hed<qgv> F0;
    public final stb<qgv, vzv> G0;
    public final stb<qgv, vzv> H0;
    public final dlh I0;
    public final int J0;
    public final int K0;
    
    public np4(final hed<? extends qgv> f0, final stb<? super qgv, vzv> g0, final stb<? super qgv, vzv> h0, final dlh i0, final int j0, final int k0) {
        this.F0 = (hed<qgv>)f0;
        this.G0 = (stb<qgv, vzv>)g0;
        this.H0 = (stb<qgv, vzv>)h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d86 d86 = (d86)o;
        ((Number)o2).intValue();
        hp4.f(this.F0, this.G0, this.H0, this.I0, d86, this.J0 | 0x1, this.K0);
        return vzv.a;
    }
}
