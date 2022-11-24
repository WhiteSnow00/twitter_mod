import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r9v implements q9v
{
    public final ah1 a;
    public final pz6 b;
    public final pz6 c;
    public final pz6 d;
    public final pz6 e;
    public final lzi f;
    public final wy8 g;
    public final vg5 h;
    public final de6 i;
    
    public r9v(final kcm kcm, final ah1 a, final pz6 b, final pz6 d, final pz6 c, final pz6 e, final lzi f, final wy8 g, final vg5 h) {
        final de6 i = new de6();
        this.i = i;
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        Objects.requireNonNull(i);
        kcm.i((sj)new tdv(i, 13));
    }
    
    public final void a(final oz6 oz6) {
        this.b.b(oz6);
        final de6 i = this.i;
        final ah1 a = this.a;
        Objects.requireNonNull(this.f);
        final t5j<wg1> a2 = a.a("ntab");
        final lzi f = this.f;
        Objects.requireNonNull(f);
        i.a(a2.subscribe((rk6)new g3c((Object)f, 6)));
    }
    
    public final void b(final oz6 oz6) {
        this.d.b(oz6);
        final de6 i = this.i;
        final ah1 a = this.a;
        Objects.requireNonNull(this.g);
        final t5j<wg1> a2 = a.a("dm_tab");
        final wy8 g = this.g;
        Objects.requireNonNull(g);
        i.a(a2.subscribe((rk6)new i9f((Object)g, 10)));
    }
    
    public final void c(final int n) {
        this.c.a(n);
    }
    
    public final void d(final oz6 oz6) {
        this.c.b(oz6);
    }
    
    public final void e(final oz6 oz6) {
        this.e.b(oz6);
        final de6 i = this.i;
        final ah1 a = this.a;
        Objects.requireNonNull(this.h);
        final t5j<wg1> a2 = a.a("communities_tab");
        final vg5 h = this.h;
        Objects.requireNonNull(h);
        i.a(a2.subscribe((rk6)new iug((Object)h, 12)));
    }
    
    public final int f() {
        final oz6 c = this.c.c;
        int count;
        if (c != null) {
            count = c.getCount();
        }
        else {
            count = 0;
        }
        return count;
    }
}
