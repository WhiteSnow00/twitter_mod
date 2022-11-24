import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kye implements jye, q0f
{
    public final gzd<dye> a;
    public final boolean b;
    public final ij8 c;
    public final ize d;
    
    public kye(final gzd<dye> a, final boolean b, final kud kud) {
        e0e.f((Object)a, "intervals");
        e0e.f((Object)kud, "nearestItemsRange");
        this.a = a;
        this.b = b;
        final u56 a2 = u56.a;
        this.c = (ij8)jty.e(a, kud, (mub)u56.b);
        this.d = new ize((jye)this);
    }
    
    public final int a() {
        return this.c.a();
    }
    
    public final Object b(final int n) {
        return this.c.b(n);
    }
    
    @Override
    public final boolean c() {
        return this.b;
    }
    
    public final void e(final int n, final d86 d86, final int n2) {
        final d86 h = d86.h(1355196996);
        int n4;
        if ((n2 & 0xE) == 0x0) {
            int n3;
            if (h.d(n)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n2);
        }
        else {
            n4 = n2;
        }
        int n5 = n4;
        if ((n2 & 0x70) == 0x0) {
            int n6;
            if (h.P((Object)this)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        if ((n5 & 0x5B) == 0x12 && h.i()) {
            h.H();
        }
        else {
            final sa6$b a = sa6.a;
            this.c.e(n, h, n5 & 0xE);
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new hub<d86, Integer, vzv>(this, n, n2) {
                public final kye F0;
                public final int G0;
                public final int H0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final d86 d86 = (d86)o;
                    ((Number)o2).intValue();
                    this.F0.e(this.G0, d86, this.H0 | 0x1);
                    return vzv.a;
                }
            });
        }
    }
    
    public final Map<Object, Integer> f() {
        return this.c.c;
    }
    
    public final Object g(final int n) {
        return this.c.g(n);
    }
    
    @Override
    public final long i(final int n) {
        final ize$b a = ize$b.a;
        final gzd$a value = this.a.get(n);
        return ((w8c)((dye)value.c).b.invoke((Object)a, (Object)(n - value.a))).a;
    }
    
    @Override
    public final ize j() {
        return this.d;
    }
}
