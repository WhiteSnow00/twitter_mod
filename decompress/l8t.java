import java.util.Iterator;
import j$.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import com.twitter.util.InvalidDataException;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l8t extends fys implements fys$a
{
    public final o7t j;
    
    public l8t(final String s, final long n, final b1p b1p, final kws kws, final long n2, final o7t j, final boolean b, final c2t c2t, final pmh pmh) {
        super(s, n, b1p, kws, n2, b, c2t, pmh);
        this.j = j;
    }
    
    public final tvs.a a(final y4c y4c, final lsm lsm) {
        final o7t j = this.j;
        if (j.h != null) {
            final esv.a a = new esv.a();
            a.p = new csv("Inline", this.j.h, null);
            a.c = ((yvs)this).c;
            final String b = ((yvs)this).b;
            a.a = b;
            a.b = b;
            return a;
        }
        final oh0 c = y4c.c(j.a);
        final gjl b2 = this.j.b;
        gjl s;
        if ((s = b2) != null) {
            final qgv f = y4c.f(String.valueOf(b2.e));
            s = b2;
            if (f != null) {
                final gjl$a gjl$a = new gjl$a(this.j.b);
                gjl$a.f = f.c();
                gjl$a.g = f.M0;
                s = (gjl)((z4j)gjl$a).e();
            }
        }
        final kws f2 = super.f;
        cwa a2;
        if (f2 != null) {
            a2 = lsm.a(f2);
        }
        else {
            a2 = null;
        }
        final p7t x = this.j.x;
        eeu n = null;
        Label_0283: {
            if (x != null) {
                final kws d = x.d;
                if (d != null) {
                    final cwa a3 = lsm.a(d);
                    final eeu$a eeu$a = new eeu$a();
                    eeu$a.a = x.a;
                    eeu$a.b = x.b;
                    eeu$a.c = x.c;
                    eeu$a.d = a3;
                    n = (eeu)((z4j)eeu$a).e();
                    break Label_0283;
                }
            }
            n = null;
        }
        final u5t$a u5t$a = new u5t$a();
        u5t$a.p = c;
        final String d2 = this.j.d;
        u5t$a.q = d2;
        u5t$a.s = s;
        ((tvs.a)u5t$a).c = ((yvs)this).c;
        ((tvs.a)u5t$a).a = ((yvs)this).b;
        String b3;
        if (c != null && "SelfThread".equals(d2) && c.K0.b()) {
            b3 = String.valueOf(c.K0.n1);
        }
        else {
            b3 = ((yvs)this).b;
        }
        ((tvs.a)u5t$a).b = b3;
        ((tvs.a)u5t$a).f = super.e;
        ((tvs.a)u5t$a).g = a2;
        ((tvs.a)u5t$a).h = this.j.c;
        List t;
        if (c != null) {
            final bvh bvh = new bvh(new fym(c.L0.a, ezm.a((Iterable)this.j.f)));
            xd.j0(bvh, null, true);
            bvh.m(-1, -c.L0.b);
            final ojf h = ojf.H();
            final Iterator iterator = bvh.iterator();
            while (iterator.hasNext()) {
                final yuh f3 = iterator.next().F0;
                final olc.a a4 = new olc.a();
                final int a5 = f3.a;
                a4.a = a5;
                final int a6 = o5j.a;
                a4.b = a5;
                a4.c = f3.b;
                h.p((Object)a4.e());
            }
            t = (List)((z4j)h).e();
        }
        else {
            t = null;
        }
        u5t$a.t = t;
        final o7t i = this.j;
        u5t$a.r = i.e;
        u5t$a.u = i.g;
        ((tvs.a)u5t$a).n = super.h;
        u5t$a.v = i.i;
        u5t$a.w = i.j;
        u5t$a.x = i.k;
        u5t$a.y = i.l;
        u5t$a.z = i.m;
        u5t$a.A = i.n;
        u5t$a.B = i.o;
        u5t$a.C = i.p;
        u5t$a.F = i.s;
        u5t$a.G = i.t;
        u5t$a.H = i.u;
        u5t$a.I = i.v;
        ((tvs.a)u5t$a).o = super.i;
        List l;
        if (a2 == null) {
            l = null;
        }
        else {
            final ojf h2 = ojf.H();
            final Iterator iterator2 = a2.a.iterator();
            while (iterator2.hasNext()) {
                final uxm k = ((jva)iterator2.next()).k;
                if (k instanceof cym) {
                    final int a7 = o5j.a;
                    final gdv gdv = y4c.j.get(String.valueOf(((cym)k).b));
                    if (gdv == null) {
                        continue;
                    }
                    if (gdv.V0 != null) {
                        h2.p((Object)gdv);
                    }
                    else {
                        final qgv f4 = y4c.f(String.valueOf(gdv.N0));
                        if (f4 != null) {
                            final gdv$a gdv$a = new gdv$a(gdv);
                            gdv$a.o(f4);
                            h2.p((Object)((z4j)gdv$a).e());
                        }
                        else {
                            r9a.c(new m9a((Throwable)new InvalidDataException("Referenced List object received without a creator")));
                        }
                    }
                }
            }
            l = (List)((z4j)h2).e();
        }
        u5t$a.L = l;
        final o5t c2 = this.j.c;
        final ojf h3 = ojf.H();
        if (a2 != null) {
            for (final jva jva : a2.a) {
                this.c(y4c, (ojf<lxd>)h3, jva);
                final Iterator iterator4 = jva.g.iterator();
                while (iterator4.hasNext()) {
                    this.c(y4c, (ojf<lxd>)h3, (jva)iterator4.next());
                }
            }
        }
        if (c2 instanceof bmt) {
            this.b(y4c, (ojf<lxd>)h3, ((bmt)c2).F0);
        }
        u5t$a.M = (List)((z4j)h3).e();
        final o7t m = this.j;
        u5t$a.K = m.w;
        u5t$a.N = n;
        u5t$a.J = m.y;
        u5t$a.O = m.z;
        Object p2 = null;
        Label_1226: {
            if (a2 != null) {
                final Iterator iterator5 = a2.a.iterator();
                while (iterator5.hasNext()) {
                    final uxm k2 = ((jva)iterator5.next()).k;
                    if (k2 instanceof xxm) {
                        final int a8 = o5j.a;
                        p2 = ((xxm)k2).b;
                        break Label_1226;
                    }
                }
            }
            p2 = tdk.G0;
        }
        u5t$a.P = (tdk)p2;
        final rmv b4 = ita.b();
        final boolean b5 = false;
        final boolean b6 = false;
        if (b4.b("soft_interventions_inner_qt_forward_pivot_enabled", false)) {
            u5t$a.D = this.j.q;
        }
        if (ita.b().b("tweet_with_visibility_results_prefer_gql_tweet_interstitials_enabled", false)) {
            u5t$a.E = this.j.r;
        }
        if (ita.b().b("unified_cards_dpa_ignore_single_slide_mdc_tweet_android", false)) {
            int anyMatch = b5 ? 1 : 0;
            if (c != null) {
                final vg3 k3 = c.K0;
                anyMatch = (b5 ? 1 : 0);
                if (k3 != null) {
                    anyMatch = (b5 ? 1 : 0);
                    if (k3.a1 != null) {
                        int n2 = b6 ? 1 : 0;
                        if (ita.b().b("unified_cards_use_promoted_content_unified_card_override", false)) {
                            n2 = (b6 ? 1 : 0);
                            if (s != null) {
                                final rq k4 = s.k;
                                n2 = (b6 ? 1 : 0);
                                if (k4 != null) {
                                    n2 = (b6 ? 1 : 0);
                                    if (k4.b != null) {
                                        n2 = 1;
                                    }
                                }
                            }
                        }
                        uwv uwv;
                        if (n2 != 0) {
                            uwv = s.k.b;
                        }
                        else {
                            uwv = c.K0.a1;
                        }
                        anyMatch = (Collection$_EL.stream((Collection)uwv.k).anyMatch((Predicate)new dm3((Object)ita.b().g("unified_cards_dpa_placeholder_media_key"), 1)) ? 1 : 0);
                    }
                }
            }
            if (anyMatch != 0) {
                ((tvs.a)u5t$a).a = null;
            }
        }
        return (tvs.a)u5t$a;
    }
    
    public final void b(final y4c y4c, final ojf<lxd> ojf, final String s) {
        final lxd e = y4c.e(s);
        if (e != null) {
            ojf.p((Object)e);
        }
    }
    
    public final void c(final y4c y4c, final ojf<lxd> ojf, final jva jva) {
        final uxm k = jva.k;
        if (k instanceof aym) {
            final int a = o5j.a;
            this.b(y4c, ojf, ((aym)k).b);
        }
        else if (k instanceof wxm) {
            final int a2 = o5j.a;
            this.b(y4c, ojf, ((wxm)k).b);
        }
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && l8t.class == o.getClass()) {
            final l8t l8t = (l8t)o;
            if (!super.equals(o) || !o5j.a((Object)this.j, (Object)l8t.j)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return o5j.g((Object)this.j, (Object)super.hashCode());
    }
}
