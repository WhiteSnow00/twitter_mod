// 
// Decompiled by Procyon v0.6.0
// 

public final class k9s extends pue implements hub<d86, Integer, vzv>
{
    public final hub<d86, Integer, vzv> F0;
    public final hub<d86, Integer, vzv> G0;
    public final int H0;
    
    public k9s(final hub<? super d86, ? super Integer, vzv> f0, final hub<? super d86, ? super Integer, vzv> g0, final int h0) {
        this.F0 = (hub<d86, Integer, vzv>)f0;
        this.G0 = (hub<d86, Integer, vzv>)g0;
        this.H0 = h0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d86 d86 = (d86)o;
        ((Number)o2).intValue();
        i9s.d((hub)this.F0, (hub)this.G0, d86, this.H0 | 0x1);
        return vzv.a;
    }
}
