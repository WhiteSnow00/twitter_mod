import tv.periscope.model.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class af2 implements o0v
{
    public final b b;
    public final vo6 c;
    public final long d;
    public final th2 e;
    public final mf2 f;
    
    public af2(final b b, final vo6 c, final long d, final th2 e, final mf2 f) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final lev a(final j6 j6) {
        final iof$a iof$a = new iof$a();
        iof$a.p(this.g());
        iof$a.o(this.b.s());
        final sxf$a sxf$a = new sxf$a();
        final vo6 c = this.c;
        final int n = 1;
        lev lev = null;
        Label_0245: {
            if (c != null) {
                final eca c2 = j6.c;
                if (!(c2 instanceof wvf) || !((wvf)c2).c.equals("LexHero")) {
                    final lev i = yf4.j(j6.a, this.c, this.b.w());
                    iof$a.b = this.b.w();
                    sxf$a.g = this.c.G();
                    final String d = this.d();
                    lev = i;
                    if (d != null) {
                        sxf$a.c = d;
                        lev = i;
                    }
                    break Label_0245;
                }
            }
            final lev lev2 = new lev();
            lev2.b = this.b.w();
            lev2.c0 = new c1p(0, null, 0L, -1, true);
            iof$a.a = this.b.w();
            final String d2 = this.d();
            lev = lev2;
            if (d2 != null) {
                sxf$a.a = d2;
                lev = lev2;
            }
        }
        final long f = this.f(j6);
        if (f > 0L) {
            final c1p c3 = lev.c0;
            if (c3 != null) {
                c3.h = f;
            }
        }
        lev.i0 = (iof)((h4j)iof$a).e();
        sxf h0 = (sxf)((h4j)sxf$a).e();
        int n2;
        if (vjr.b((CharSequence)h0.a) && vjr.b((CharSequence)h0.c)) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            h0 = null;
        }
        lev.h0 = h0;
        return lev;
    }
    
    public final String b() {
        final vo6 c = this.c;
        String x2;
        if (c != null) {
            x2 = c.X2();
        }
        else {
            x2 = null;
        }
        return x2;
    }
    
    public final lg4 c(final j6 j6) {
        final String i = this.b.I();
        fwg a;
        if (i != null) {
            a = fwg.Companion.a(i);
        }
        else {
            a = null;
        }
        Object a2;
        if (a != null) {
            a2 = new gwg(a);
        }
        else {
            a2 = uyv.a;
        }
        final lg4$a lg4$a = new lg4$a((w00)a2);
        lg4$a.b = new yi2(this.b.w(), this.g());
        final String d = this.d();
        if (d != null) {
            try {
                lg4$a.c = Long.valueOf(d);
            }
            catch (final NumberFormatException ex) {
                e9a.d((Throwable)ex);
            }
        }
        final long f = this.f(j6);
        if (f > 0L) {
            lg4$a.e = f;
        }
        if (this.c != null) {
            final eca c = j6.c;
            if (!(c instanceof wvf) || !((wvf)c).c.equals("LexHero")) {
                lg4$a.d = this.c.G();
            }
        }
        return (lg4)((h4j)lg4$a).e();
    }
    
    public final String d() {
        final vo6 c = this.c;
        if (c != null) {
            final tj3 w0 = c.C0.W0;
            if (w0 != null && (w0.p() || w0.m())) {
                return this.c.C0.W0.g("event_id");
            }
        }
        final qof qof = (qof)((yqe)this.e).get((Object)this.b.w());
        if (qof != null) {
            return qof.a;
        }
        return null;
    }
    
    public final hil e() {
        final vo6 c = this.c;
        hil d0;
        if (c != null) {
            d0 = c.D0;
        }
        else {
            d0 = null;
        }
        return d0;
    }
    
    public final long f(final j6 j6) {
        if (this.d > 0L) {
            final d3 e = j6.e;
            if (e != null) {
                final long v = pf8.V(e);
                final long d = this.d;
                if (v >= d) {
                    return d;
                }
            }
        }
        return -1L;
    }
    
    public final boolean g() {
        final b b = (b)((f4e)this.f).j(this.b.w());
        final b b2 = this.b;
        b b3 = b;
        if (b == null) {
            b3 = b2;
        }
        return b3.F() ^ true;
    }
}
