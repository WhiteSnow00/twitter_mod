import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a4k implements vah
{
    public String a;
    public final pml<c10> b;
    
    public a4k(final br0 br0, final pml<c10> b) {
        this.b = b;
        this.a = flr.p(64);
        br0.b().f().subscribe((rk6)new bes((Object)this, 13));
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof a4k;
    }
    
    public final void h(final nah nah) {
        final nah$b d = nah.d;
        if (d != erf.R0 && cn1.a.nextInt(10000) < d.c()) {
            final qu8 a = qu8.a();
            Object o;
            if (nah instanceof o4h) {
                o = new s4h(nah.e(), nah.e, (Map)((o4h)nah).C(), a);
                ((o1p)o).j = nah.d();
                final int a2 = o5j.a;
            }
            else {
                final x3k x3k = new x3k(nah.e(), nah.e, a);
                final Long f = nah.f();
                if (nah instanceof vz6) {
                    final long d2 = nah.d();
                    final long longValue = f;
                    x3k.p0 = 2;
                    x3k.t0 = d2;
                    x3k.u0 = longValue;
                }
                else if (f != null) {
                    final long d3 = nah.d();
                    final long longValue2 = f;
                    x3k.p0 = 3;
                    x3k.t0 = d3;
                    x3k.u0 = longValue2;
                }
                else {
                    x3k.D(nah.d());
                }
                final String g = nah.g();
                o = x3k;
                if (g != null) {
                    x3k.s0 = g;
                    o = x3k;
                }
            }
            ((o1p)o).v = this.a;
            final int a3 = o5j.a;
            ((c10)this.b.get()).b(((o1p)o).r, (Object)((o1p)o).toString());
        }
        nda.a().b(nah.e, (tlm)new a4k$a(nah));
    }
    
    @Override
    public final int hashCode() {
        return a4k.class.getName().hashCode();
    }
}
