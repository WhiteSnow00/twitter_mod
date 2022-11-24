// 
// Decompiled by Procyon v0.6.0
// 

public final class rw extends pue implements hub<d86, Integer, vzv>
{
    public final hub<d86, Integer, vzv> F0;
    public final int G0;
    
    public rw(final hub<? super d86, ? super Integer, vzv> f0, final int g0) {
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
            ef6.a(new nml[] { ((lml<Float>)xl6.a).b(Float.valueOf(d4j.L(d86))) }, (hub)w9y.i(d86, 2115920639, new qw((hub)this.F0, this.G0)), d86, 56);
        }
        return vzv.a;
    }
}
