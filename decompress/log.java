// 
// Decompiled by Procyon v0.6.0
// 

public final class log extends pue implements hub<d86, Integer, vzv>
{
    public final hub<d86, Integer, vzv> F0;
    public final int G0;
    
    public log(final hub<? super d86, ? super Integer, vzv> f0, final int g0) {
        this.F0 = (hub<d86, Integer, vzv>)f0;
        this.G0 = g0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d86 d86 = (d86)o;
        if ((((Number)o2).intValue() & 0xB) == 0x2 && d86.i()) {
            d86.H();
        }
        else {
            final sa6$b a = sa6.a;
            oog.a(this.F0, d86, this.G0 >> 9 & 0xE);
        }
        return vzv.a;
    }
}
