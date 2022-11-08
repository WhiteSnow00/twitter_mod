import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fea implements jva<oea>
{
    public final jva<nws> a;
    public final sil b;
    
    public fea(final jva<nws> a, final sil b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final nws nws, final iva$c iva$c, final jev jev) {
        final oea oea = (oea)nws;
        this.a.a((nws)oea, iva$c, jev);
        final til j = oea.k.j;
        if (j != null) {
            final sil b = this.b;
            final long b2 = j.b;
            final String g = j.g;
            Objects.requireNonNull(b);
            final hil$a hil$a = new hil$a();
            hil$a.c = b2;
            hil$a.a = g;
            b.a.b((kil)((h4j)kil.e(jil.K0, (hil)((h4j)hil$a).e())).e());
        }
    }
}
