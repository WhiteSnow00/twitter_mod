// 
// Decompiled by Procyon v0.6.0
// 

public final class ehs extends pue implements hub<d86, Integer, vzv>
{
    public final Float F0;
    public final hub<d86, Integer, vzv> G0;
    public final int H0;
    public final long I0;
    
    public ehs(final Float f0, final hub<? super d86, ? super Integer, vzv> g0, final int h0, final long i0) {
        this.F0 = f0;
        this.G0 = (hub<d86, Integer, vzv>)g0;
        this.H0 = h0;
        this.I0 = i0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d86 d86 = (d86)o;
        if ((((Number)o2).intValue() & 0xB) == 0x2 && d86.i()) {
            d86.H();
        }
        else {
            final sa6$b a = sa6.a;
            if (this.F0 != null) {
                d86.x(-452622131);
                ef6.a(new nml[] { ((lml<Float>)xl6.a).b(this.F0) }, (hub)this.G0, d86, (this.H0 >> 6 & 0x70) | 0x8);
                d86.O();
            }
            else {
                d86.x(-452621951);
                ef6.a(new nml[] { ((lml<Float>)xl6.a).b(Float.valueOf(sr4.d(this.I0))) }, (hub)this.G0, d86, (this.H0 >> 6 & 0x70) | 0x8);
                d86.O();
            }
        }
        return vzv.a;
    }
}
