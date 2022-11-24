// 
// Decompiled by Procyon v0.6.0
// 

public final class eiq extends pue implements hub<d86, Integer, vzv>
{
    public final hub<d86, Integer, vzv> F0;
    public final int G0;
    
    public eiq(final hub<? super d86, ? super Integer, vzv> f0, final int g0) {
        this.F0 = (hub<d86, Integer, vzv>)f0;
        this.G0 = g0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d86 d86 = (d86)o;
        ((Number)o2).intValue();
        aiq.e((hub)this.F0, d86, this.G0 | 0x1);
        return vzv.a;
    }
}
