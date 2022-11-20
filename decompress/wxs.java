import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wxs implements vxs
{
    public final op1 a;
    public final uxs b;
    public final w7w c;
    
    public wxs(final op1 a, final uxs b, final w7w c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final cxs cxs, final String s) {
        final gfv d = this.c.d(cxs, (efv)null);
        if (cxs instanceof yqv) {
            d.v = ((yqv)cxs).k.a.a;
        }
        final op1 a = this.a;
        Objects.requireNonNull(a);
        final af4 a2 = a.a(rqv.b(cxs.f()), s, "impression");
        ((u0p)a2).i((j0p)d);
        cbw.b((elm)a2);
    }
    
    public final void b(final cxs cxs) {
        final op1 a = this.a;
        final gfv d = this.c.d(cxs, (efv)null);
        Objects.requireNonNull(a);
        final af4 a2 = a.a(rqv.b(cxs.f()), rqv.c(cxs.f()), "impression");
        ((u0p)a2).i((j0p)d);
        cbw.b((elm)a2);
    }
    
    public final void c(final String s) {
        final af4 a = this.a.a(s, "see_more", "impression");
        ((u0p)a).i((j0p)null);
        cbw.b((elm)a);
    }
    
    public final void d(final cxs cxs, final String s) {
        final gfv d = this.c.d(cxs, (efv)null);
        if (cxs instanceof yqv) {
            d.v = ((yqv)cxs).k.a.a;
        }
        final op1 a = this.a;
        final gfv d2 = this.c.d(cxs, (efv)null);
        Objects.requireNonNull(a);
        final af4 a2 = a.a(rqv.b(cxs.f()), s, "click");
        if (cxs instanceof yqv) {
            final l6p$a l6p$a = new l6p$a();
            l6p$a.a = ((yqv)cxs).k.c;
            ((u0p)a2).x = (l6p)((n4j)l6p$a).e();
            final int a3 = c5j.a;
        }
        ((u0p)a2).i((j0p)d2);
        cbw.b((elm)a2);
    }
    
    public final void e() {
        if (!((List)this.b.F0).isEmpty()) {
            final op1 a = this.a;
            final vth$a f0 = this.b.F0;
            final af4 a2 = a.a((String)null, (String)null, "results");
            ((u0p)a2).g((List)f0);
            cbw.b((elm)a2);
            ((List)this.b.F0).clear();
        }
    }
    
    public final efv f() {
        final op1 a = this.a;
        Objects.requireNonNull(a);
        final efv efv = new efv();
        ((lzo)efv).c(((bca)a.a).b());
        ((lzo)efv).d(a.a.d());
        return efv;
    }
    
    public final void g(final h0p h0p, final String s, final j0p j0p) {
        this.h(rqv.b(h0p), rqv.c(h0p), s, j0p);
    }
    
    public final void h(final String s, final String s2, final String s3, final j0p j0p) {
        final af4 a = this.a.a(s, s2, s3);
        ((u0p)a).i(j0p);
        cbw.b((elm)a);
    }
    
    public final void i(final cxs cxs) {
        final op1 a = this.a;
        final gfv d = this.c.d(cxs, (efv)null);
        Objects.requireNonNull(a);
        final af4 a2 = a.a(rqv.b(cxs.f()), rqv.c(cxs.f()), "click");
        ((u0p)a2).i((j0p)d);
        cbw.b((elm)a2);
    }
    
    public final void j(final cxs cxs) {
        final uxs b = this.b;
        final gfv d = this.c.d(cxs, (efv)null);
        Objects.requireNonNull(b);
        if ((!cxs.k() || !cxs.c().t) && ((iz)b).g((Object)cxs.a)) {
            ((List<gfv>)b.F0).add(d);
        }
    }
}
