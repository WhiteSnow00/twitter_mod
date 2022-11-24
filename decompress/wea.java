import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wea implements kva<cfa>
{
    public final kva<vxs> a;
    public final rjl b;
    
    public wea(final kva<vxs> a, final rjl b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final vxs vxs, final jva$c jva$c, final sfv sfv) {
        final cfa cfa = (cfa)vxs;
        this.a.a((vxs)cfa, jva$c, sfv);
        final sjl j = cfa.k.j;
        if (j != null) {
            final rjl b = this.b;
            final long b2 = j.b;
            final String g = j.g;
            Objects.requireNonNull(b);
            final gjl$a gjl$a = new gjl$a();
            gjl$a.c = b2;
            gjl$a.a = g;
            b.a.b((jjl)((z4j)jjl.e(ijl.N0, (gjl)((z4j)gjl$a).e())).e());
        }
    }
}
