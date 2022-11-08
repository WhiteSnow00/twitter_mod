import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t0u<T> implements o0u<T>
{
    public final q0u a;
    public final String b;
    public final j4a c;
    public final nyt<T, byte[]> d;
    public final u0u e;
    
    public t0u(final q0u a, final String b, final j4a c, final nyt<T, byte[]> d, final u0u e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final haa<T> haa) {
        this.b(haa, (y0u)m71.F0);
    }
    
    public final void b(final haa<T> haa, final y0u y0u) {
        final u0u e = this.e;
        final q0u a = this.a;
        Objects.requireNonNull(a, "Null transportContext");
        final String b = this.b;
        Objects.requireNonNull(b, "Null transportName");
        final nyt<T, byte[]> d = this.d;
        Objects.requireNonNull(d, "Null transformer");
        final j4a c = this.c;
        Objects.requireNonNull(c, "Null encoding");
        final w0u w0u = (w0u)e;
        final pvo c2 = w0u.c;
        final za1 za1 = (za1)haa;
        final azk b2 = za1.b;
        final q0u$a a2 = q0u.a();
        a2.a(a.b());
        final hc1$a hc1$a = (hc1$a)a2;
        Objects.requireNonNull(b2, "Null priority");
        hc1$a.c = b2;
        hc1$a.b = a.c();
        final q0u b3 = hc1$a.b();
        final cca$a a3 = cca.a();
        a3.e(w0u.a.B());
        a3.g(w0u.b.B());
        final ab1$b ab1$b = (ab1$b)a3;
        ab1$b.a = b;
        ab1$b.c = new d4a(c, (byte[])d.apply((Object)za1.a));
        ab1$b.b = null;
        c2.a(b3, ab1$b.c(), y0u);
    }
}
