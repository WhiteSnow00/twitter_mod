// 
// Decompiled by Procyon v0.6.0
// 

public final class hm4 extends zpc
{
    public hm4(final v76 v76) {
        e0e.f((Object)v76, "composeTwitterDependencies");
        super(v76);
    }
    
    public final void b(d86 h, final int n) {
        h = h.h(-639165468);
        if ((n & 0x1) == 0x0 && h.i()) {
            h.H();
        }
        else {
            final sa6$b a = sa6.a;
            d4j.i((dlh)null, (nw8)null, (fci)null, h, 0, 7);
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new hub<d86, Integer, vzv>(this, n) {
                public final hm4 F0;
                public final int G0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final d86 d86 = (d86)o;
                    ((Number)o2).intValue();
                    this.F0.b(d86, this.G0 | 0x1);
                    return vzv.a;
                }
            });
        }
    }
}
