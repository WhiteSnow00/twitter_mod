// 
// Decompiled by Procyon v0.6.0
// 

public final class lqw extends pue implements hub<d86, Integer, vzv>
{
    public final mub<Float, Float, d86, Integer, vzv> F0;
    public final kqw G0;
    
    public lqw(final mub<? super Float, ? super Float, ? super d86, ? super Integer, vzv> f0, final kqw g0) {
        this.F0 = (mub<Float, Float, d86, Integer, vzv>)f0;
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
            this.F0.I((Object)this.G0.M0.g, (Object)this.G0.M0.h, (Object)d86, (Object)0);
        }
        return vzv.a;
    }
}
