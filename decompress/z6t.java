import java.util.Iterator;
import j$.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import com.twitter.util.InvalidDataException;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z6t extends wws implements wws$a
{
    public final c6t j;
    
    public z6t(final String s, final long n, final qzo qzo, final cvs cvs, final long n2, final c6t j, final boolean b, final t0t t0t, final vlh vlh) {
        super(s, n, qzo, cvs, n2, b, t0t, vlh);
        this.j = j;
    }
    
    public final kus.a a(final u4c u4c, final frm frm) {
        final c6t j = this.j;
        if (j.h != null) {
            final yqv$a yqv$a = new yqv$a();
            yqv$a.p = new wqv("Inline", this.j.h, (c6t)null);
            ((kus.a)yqv$a).c = ((pus)this).c;
            final String b = ((pus)this).b;
            ((kus.a)yqv$a).a = b;
            ((kus.a)yqv$a).b = b;
            return (kus.a)yqv$a;
        }
        final rh0 c = u4c.c(j.a);
        final hil b2 = this.j.b;
        hil s;
        if ((s = b2) != null) {
            final hfv f = u4c.f(String.valueOf(b2.e));
            s = b2;
            if (f != null) {
                final hil$a hil$a = new hil$a(this.j.b);
                hil$a.f = f.c();
                hil$a.g = f.J0;
                s = (hil)((h4j)hil$a).e();
            }
        }
        final cvs f2 = super.f;
        cwa a;
        if (f2 != null) {
            a = frm.a(f2);
        }
        else {
            a = null;
        }
        final d6t x = this.j.x;
        ycu n = null;
        Label_0273: {
            if (x != null) {
                final cvs d = x.d;
                if (d != null) {
                    final cwa a2 = frm.a(d);
                    final ycu$a ycu$a = new ycu$a();
                    ycu$a.a = x.a;
                    ycu$a.b = x.b;
                    ycu$a.c = x.c;
                    ycu$a.d = a2;
                    n = (ycu)((h4j)ycu$a).e();
                    break Label_0273;
                }
            }
            n = null;
        }
        final j4t$a j4t$a = new j4t$a();
        j4t$a.p = c;
        final String d2 = this.j.d;
        j4t$a.q = d2;
        j4t$a.s = s;
        ((kus.a)j4t$a).c = ((pus)this).c;
        ((kus.a)j4t$a).a = ((pus)this).b;
        String b3;
        if (c != null && "SelfThread".equals(d2) && c.H0.b()) {
            b3 = String.valueOf(c.H0.k1);
        }
        else {
            b3 = ((pus)this).b;
        }
        ((kus.a)j4t$a).b = b3;
        ((kus.a)j4t$a).f = super.e;
        ((kus.a)j4t$a).g = a;
        ((kus.a)j4t$a).h = this.j.c;
        boolean b4 = true;
        List t;
        if (c != null) {
            final huh huh = new huh((xwm<xes>)new xwm(c.I0.a, wxm.a((Iterable)this.j.f)));
            goz.t(huh, (List)null, true);
            huh.m(-1, -c.I0.b);
            final ijf h = ijf.H();
            final Iterator iterator = huh.iterator();
            while (iterator.hasNext()) {
                final euh c2 = ((fuh)iterator.next()).C0;
                final olc$a olc$a = new olc$a();
                final int a3 = c2.a;
                ((d7a.a)olc$a).a = a3;
                final int a4 = w4j.a;
                ((d7a.a)olc$a).b = a3;
                ((d7a.a)olc$a).c = c2.b;
                h.p((Object)((h4j)olc$a).e());
            }
            t = (List)((h4j)h).e();
        }
        else {
            t = null;
        }
        j4t$a.t = t;
        final c6t i = this.j;
        j4t$a.r = i.e;
        j4t$a.u = i.g;
        ((kus.a)j4t$a).n = super.h;
        j4t$a.v = i.i;
        j4t$a.w = i.j;
        j4t$a.x = i.k;
        j4t$a.y = i.l;
        j4t$a.z = i.m;
        j4t$a.A = i.n;
        j4t$a.B = i.o;
        j4t$a.C = i.p;
        j4t$a.F = i.s;
        j4t$a.G = i.t;
        j4t$a.H = i.u;
        j4t$a.I = i.v;
        ((kus.a)j4t$a).o = super.i;
        List l;
        if (a == null) {
            l = null;
        }
        else {
            final ijf h2 = ijf.H();
            final Iterator<iva> iterator2 = a.a.iterator();
            while (iterator2.hasNext()) {
                final nwm k = iterator2.next().k;
                if (k instanceof vwm) {
                    final int a5 = w4j.a;
                    final xbv xbv = u4c.j.get(String.valueOf(((vwm)k).b));
                    if (xbv == null) {
                        continue;
                    }
                    if (xbv.S0 != null) {
                        h2.p((Object)xbv);
                    }
                    else {
                        final hfv f3 = u4c.f(String.valueOf(xbv.K0));
                        if (f3 != null) {
                            final xbv$a xbv$a = new xbv$a(xbv);
                            xbv$a.o(f3);
                            h2.p((Object)((h4j)xbv$a).e());
                        }
                        else {
                            e9a.c(new z8a((Throwable)new InvalidDataException("Referenced List object received without a creator")));
                        }
                    }
                }
            }
            l = (List)((h4j)h2).e();
        }
        j4t$a.L = l;
        final d4t c3 = this.j.c;
        final ijf h3 = ijf.H();
        if (a != null) {
            for (final iva iva : a.a) {
                this.c(u4c, (ijf<gxd>)h3, iva);
                final Iterator iterator4 = iva.g.iterator();
                while (iterator4.hasNext()) {
                    this.c(u4c, (ijf<gxd>)h3, (iva)iterator4.next());
                }
            }
        }
        if (c3 instanceof skt) {
            this.b(u4c, (ijf<gxd>)h3, ((skt)c3).C0);
        }
        j4t$a.M = (List)((h4j)h3).e();
        final c6t m = this.j;
        j4t$a.K = m.w;
        j4t$a.N = n;
        j4t$a.J = m.y;
        j4t$a.O = m.z;
        zck p2 = null;
        Label_1223: {
            if (a != null) {
                final Iterator<iva> iterator5 = a.a.iterator();
                while (iterator5.hasNext()) {
                    final nwm k2 = iterator5.next().k;
                    if (k2 instanceof qwm) {
                        final int a6 = w4j.a;
                        p2 = ((qwm)k2).b;
                        break Label_1223;
                    }
                }
            }
            p2 = zck.D0;
        }
        j4t$a.P = p2;
        final hlv b5 = dta.b();
        final boolean b6 = false;
        if (b5.b("soft_interventions_inner_qt_forward_pivot_enabled", false)) {
            j4t$a.D = this.j.q;
        }
        if (dta.b().b("tweet_with_visibility_results_prefer_gql_tweet_interstitials_enabled", false)) {
            j4t$a.E = this.j.r;
        }
        if (dta.b().b("unified_cards_dpa_ignore_single_slide_mdc_tweet_android", false)) {
            int anyMatch = b6 ? 1 : 0;
            if (c != null) {
                final mg3 h4 = c.H0;
                anyMatch = (b6 ? 1 : 0);
                if (h4 != null) {
                    anyMatch = (b6 ? 1 : 0);
                    if (h4.X0 != null) {
                        Label_1370: {
                            if (dta.b().b("unified_cards_use_promoted_content_unified_card_override", false) && s != null) {
                                final pq k3 = s.k;
                                if (k3 != null && k3.b != null) {
                                    break Label_1370;
                                }
                            }
                            b4 = false;
                        }
                        ovv ovv;
                        if (b4) {
                            ovv = s.k.b;
                        }
                        else {
                            ovv = c.H0.X0;
                        }
                        anyMatch = (Collection$_EL.stream((Collection)ovv.k).anyMatch((Predicate)new y6t(dta.b().g("unified_cards_dpa_placeholder_media_key"))) ? 1 : 0);
                    }
                }
            }
            if (anyMatch != 0) {
                ((kus.a)j4t$a).a = null;
            }
        }
        return (kus.a)j4t$a;
    }
    
    public final void b(final u4c u4c, final ijf<gxd> ijf, final String s) {
        final gxd e = u4c.e(s);
        if (e != null) {
            ijf.p((Object)e);
        }
    }
    
    public final void c(final u4c u4c, final ijf<gxd> ijf, final iva iva) {
        final nwm k = iva.k;
        if (k instanceof twm) {
            final int a = w4j.a;
            this.b(u4c, ijf, ((twm)k).b);
        }
        else if (k instanceof pwm) {
            final int a2 = w4j.a;
            this.b(u4c, ijf, ((pwm)k).b);
        }
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && z6t.class == o.getClass()) {
            final z6t z6t = (z6t)o;
            if (!super.equals(o) || !w4j.a((Object)this.j, (Object)z6t.j)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return w4j.g((Object)this.j, (Object)super.hashCode());
    }
}
