import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c2u<T> implements x1u<T>
{
    public final z1u a;
    public final String b;
    public final v4a c;
    public final wzt<T, byte[]> d;
    public final d2u e;
    
    public c2u(final z1u a, final String b, final v4a c, final wzt<T, byte[]> d, final d2u e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final vaa<T> vaa) {
        this.b(vaa, (g2u)m71.I0);
    }
    
    public final void b(final vaa<T> vaa, final g2u g2u) {
        final d2u e = this.e;
        final z1u a = this.a;
        Objects.requireNonNull(a, "Null transportContext");
        final String b = this.b;
        Objects.requireNonNull(b, "Null transportName");
        final wzt<T, byte[]> d = this.d;
        Objects.requireNonNull(d, "Null transformer");
        final v4a c = this.c;
        Objects.requireNonNull(c, "Null encoding");
        final e2u e2u = (e2u)e;
        final axo c2 = e2u.c;
        final za1 za1 = (za1)vaa;
        final zzk b2 = za1.b;
        final z1u$a a2 = z1u.a();
        a2.a(a.b());
        final hc1.a a3 = (hc1.a)a2;
        Objects.requireNonNull(b2, "Null priority");
        a3.c = b2;
        a3.b = a.c();
        final z1u b3 = a3.b();
        final sca.a a4 = sca.a();
        a4.e(e2u.a.B());
        a4.g(e2u.b.B());
        final ab1$b ab1$b = (ab1$b)a4;
        ab1$b.a = b;
        ab1$b.c = new p4a(c, (byte[])d.apply((Object)za1.a));
        ab1$b.b = null;
        c2.a(b3, ab1$b.c(), g2u);
    }
}
