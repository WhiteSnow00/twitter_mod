// 
// Decompiled by Procyon v0.6.0
// 

public final class l0f extends pue implements hub<d86, Integer, vzv>
{
    public final q0f F0;
    public final int G0;
    
    public l0f(final q0f f0, final int g0) {
        this.F0 = f0;
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
            this.F0.e(this.G0, d86, 0);
        }
        return vzv.a;
    }
}
