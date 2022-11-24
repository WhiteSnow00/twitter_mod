// 
// Decompiled by Procyon v0.6.0
// 

public final class mm4 extends pue implements hub<d86, Integer, vzv>
{
    public final dlh F0;
    public final nw8 G0;
    public final fci<?> H0;
    public final int I0;
    public final int J0;
    
    public mm4(final dlh f0, final nw8 g0, final fci<?> h0, final int i0, final int j0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d86 d86 = (d86)o;
        ((Number)o2).intValue();
        d4j.i(this.F0, this.G0, (fci)this.H0, d86, this.I0 | 0x1, this.J0);
        return vzv.a;
    }
}
