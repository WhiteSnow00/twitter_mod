import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v0f implements t0f, tze
{
    public final List<Integer> a;
    public final rye b;
    public final di8 c;
    
    public v0f(final eyd<n0f> eyd, final itd itd, final List<Integer> b, final rye rye) {
        final f2a d0 = f2a.D0;
        czd.f((Object)eyd, "intervals");
        czd.f((Object)itd, "nearestItemsRange");
        czd.f((Object)b, "itemScope");
        this.a = (List<Integer>)d0;
        this.b = (rye)b;
        this.c = (di8)msy.b((eyd)eyd, itd, (ktb)io7.h(-1230121334, true, (Object)new u0f((rye)b)));
    }
    
    public final int a() {
        return this.c.a();
    }
    
    public final Object b(final int n) {
        return this.c.b(n);
    }
    
    public final rye d() {
        return this.b;
    }
    
    public final void e(final int n, x66 h, final int n2) {
        h = h.h(-1645068522);
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
            final n96$b a = n96.a;
            this.c.e(n, h, n5 & 0xE);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new v0f$a(this, n, n2));
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
