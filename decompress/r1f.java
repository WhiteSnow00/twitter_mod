import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r1f implements p1f, q0f
{
    public final List<Integer> a;
    public final oze b;
    public final ij8 c;
    
    public r1f(final gzd<k1f> gzd, final kud kud, final List<Integer> b, final oze oze) {
        final h3a f0 = h3a.F0;
        e0e.f((Object)gzd, "intervals");
        e0e.f((Object)kud, "nearestItemsRange");
        e0e.f((Object)b, "itemScope");
        this.a = (List<Integer>)f0;
        this.b = (oze)b;
        this.c = (ij8)jty.e(gzd, kud, (mub)w9y.j(-1230121334, true, new q1f((oze)b)));
    }
    
    public final int a() {
        return this.c.a();
    }
    
    public final Object b(final int n) {
        return this.c.b(n);
    }
    
    public final oze d() {
        return this.b;
    }
    
    public final void e(final int n, final d86 d86, final int n2) {
        final d86 h = d86.h(-1645068522);
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
            k.a((hub)new r1f$a(this, n, n2));
        }
    }
    
    public final Map<Object, Integer> f() {
        return this.c.c;
    }
    
    public final Object g(final int n) {
        return this.c.g(n);
    }
    
    public final List<Integer> h() {
        return this.a;
    }
}
