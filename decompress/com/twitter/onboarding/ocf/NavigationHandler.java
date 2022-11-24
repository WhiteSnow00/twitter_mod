// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.onboarding.ocf;

import java.util.Objects;
import com.twitter.onboarding.ocf.analytics.OcfEventReporter;

@a91
public class NavigationHandler
{
    public rrd a;
    public final kej b;
    public final bbi c;
    public final OcfEventReporter d;
    public final e39 e;
    public final z3g f;
    public final a g;
    public final r9a h;
    
    public NavigationHandler(final duo duo, final kej b, final bbi c, final z3g f, final a g, final OcfEventReporter d, final OwnerLogoutMonitor ownerLogoutMonitor, final r9a h, final kcm kcm, final mf1 mf1) {
        final e39 e = new e39();
        this.e = e;
        this.b = b;
        this.c = c;
        this.f = f;
        this.g = g;
        this.d = d;
        this.h = h;
        duo.b(this);
        mf1.a((mf1$a)new lbi(this));
        if (this.a != null) {
            this.g(b.d());
        }
        ownerLogoutMonitor.b = this;
        kcm.i((sj)new azf(e, 2));
    }
    
    public final boolean a() {
        return this.b.b();
    }
    
    public final boolean b() {
        final boolean b = this.b.b() ^ true;
        if (!b) {
            this.j();
            if (this.b.a()) {
                this.c();
                return true;
            }
        }
        return b;
    }
    
    public final void c() {
        this.d(new rrd(new dtv((qbi)new tes(), "cancel_flow_back_navigation")), null);
    }
    
    public final void d(final rrd a, final String s) {
        final OcfEventReporter d = this.d;
        Objects.requireNonNull(d);
        final fg4 fg4 = new fg4(zba.b);
        final dtv a2 = a.a;
        if (!a2.d) {
            d.b(fg4, a2.b);
            d.a(a2.e, ia3.J0);
        }
        this.a = a;
        this.g(this.b.c(a, s));
    }
    
    public final void e(final dtv dtv) {
        this.d(new rrd(dtv), null);
    }
    
    public final void f(final obi obi) {
        if (obi instanceof f8r) {
            this.c.a(((f8r)obi).a);
        }
        if (obi instanceof r8r) {
            final bbi c = this.c;
            Objects.requireNonNull((r8r)obi);
            c.b();
        }
        if (obi instanceof eno) {
            ((eno)obi).a.run();
        }
        if (obi instanceof i5q) {
            final a g = this.g;
            if (g != null) {
                final i5q i5q = (i5q)obi;
                g.a(i5q.a);
                if (i5q instanceof h5q) {
                    this.f(((h5q)i5q).b);
                }
            }
        }
        final boolean b = obi instanceof za2;
    }
    
    public final void g(final bbq<obi> bbq) {
        this.k();
        final e39 e = this.e;
        final n0p n0p = new n0p((Object)this, 21);
        Objects.requireNonNull(bbq);
        e.c(((bbq)new wbq((idq)bbq, (sj)n0p)).G((rk6)new a3x((Object)this, 5), (rk6)lvb.e));
    }
    
    public final void h() {
        final z3g f = this.f;
        if (f != null) {
            f.b();
        }
    }
    
    public final boolean i() {
        return this.b.a();
    }
    
    public final void j() {
        this.d.d();
    }
    
    public final void k() {
        final z3g f = this.f;
        if (f != null) {
            f.a();
        }
    }
    
    public interface a
    {
        void a(final String p0);
    }
}
