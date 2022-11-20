// 
// Decompiled by Procyon v0.6.0
// 

public final class do6
{
    public final mfv a;
    public boolean b;
    public final long c;
    public final h0p d;
    public final g1t e;
    public final ylu f;
    public final ylu g;
    public final uil h;
    public final qum i;
    public final i1d j;
    
    public do6(final long c, final mfv a, final h0p d, final g1t e, final ylu f, final ylu g, final uil h, final qum i, final i1d j) {
        this.b = false;
        this.c = c;
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final bo6$b a(final bo6$b bo6$b) {
        if (this.c != bo6$b.a.o(false)) {
            return bo6$b;
        }
        final mfv a = this.a;
        if (a != null && !this.b) {
            bo6$b.r = a;
        }
        final h0p d = this.d;
        if (d != null) {
            bo6$b.n = d;
        }
        final g1t e = this.e;
        if (e != null) {
            bo6$b.x = e;
        }
        final ylu f = this.f;
        if (f != null) {
            bo6$b.A = f;
        }
        if (this.g != null && asa.b().b("soft_interventions_inner_qt_forward_pivot_enabled", false)) {
            bo6$b.B = this.g;
            final bo6$b bo6$b2 = new bo6$b(bo6$b.f);
            bo6$b2.A = this.g;
            bo6$b.y((bo6)((n4j)bo6$b2).e());
        }
        final uil h = this.h;
        if (h != null) {
            bo6$b.k = h;
        }
        final qum i = this.i;
        if (i != null) {
            bo6$b.h = true;
            final long a2 = i.a;
            final qum$a c = bo6$b.c;
            c.a = a2;
            c.b = i.b;
            c.e = i.e;
            c.c = i.c;
            c.d = i.d;
        }
        final i1d j = this.j;
        if (j != null) {
            bo6$b.s = j;
        }
        return bo6$b;
    }
    
    public final bo6 b(final bo6 bo6) {
        bo6 bo7 = bo6;
        if (this.c == bo6.D()) {
            final bo6$b bo6$b = new bo6$b(bo6);
            this.a(bo6$b);
            bo7 = (bo6)((n4j)bo6$b).e();
        }
        return bo7;
    }
}
