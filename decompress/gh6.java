import java.util.Iterator;
import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.onboarding.sso.core.connectedaccounts.ConnectedAccountsViewModel;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gh6
{
    public static final float a;
    
    static {
        final fzq a2 = fzq.a;
        a = fzq.d;
    }
    
    public static final void a(jkh companion, m76 h, final int n, final int n2) {
        h = h.h(-67737489);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n5;
            if (h.P((Object)companion)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n);
        }
        else {
            n4 = n;
        }
        if ((n4 & 0xB) == 0x2 && h.i()) {
            h.H();
        }
        else {
            if (n3 != 0) {
                companion = jkh.Companion;
            }
            final ea6$b a = ea6.a;
            final jkh i = tcq.i(companion);
            Objects.requireNonNull(dx.Companion);
            final gw1$b l = dx$a.l;
            final ks0 a2 = ks0.a;
            final ks0$c c = ks0.c;
            h.x(693286680);
            final gqg a3 = glo.a((ks0$d)c, (dx$c)l, h);
            h.x(-1323940314);
            final dp8 dp8 = (dp8)h.m((re6)te6.e);
            final tve tve = (tve)h.m((re6)te6.k);
            final z5x z5x = (z5x)h.m((re6)te6.o);
            Objects.requireNonNull(f76.Companion);
            final jwe$a b = f76.a.b;
            final jub a4 = cwe.a(i);
            if (!(h.j() instanceof xr0)) {
                ukg.l0();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((otb)b);
            }
            else {
                h.o();
            }
            h.F();
            r9x.v(h, (Object)a3, (gub)f76.a.e);
            r9x.v(h, (Object)dp8, (gub)f76.a.d);
            r9x.v(h, (Object)tve, (gub)f76.a.f);
            ((j36)a4).h0((Object)hvl.b(h, z5x, f76.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-678309503);
            hpc.a(gpc.w, (String)null, oyz.S(jkh.Companion, gh6.a, 0.0f, 2), ((aqc)h.m((re6)fqc.a)).i(), false, h, 440, 16);
            final String d1 = ukg.d1(2131957678, h);
            final bpc a5 = bpc.a;
            xhs.a(d1, (jkh)null, bpc.H, 0L, (nlb)null, (rlb)null, (rkb)null, 0L, (kes)null, (rds)null, 0L, 0, false, 0, (xis)null, false, h, 0, 0, 65530);
            dia.u(h);
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new gub<m76, Integer, oyv>() {
                public final Object invoke(final Object o, final Object o2) {
                    final m76 m76 = (m76)o;
                    ((Number)o2).intValue();
                    gh6.a(companion, m76, n | 0x1, n2);
                    return oyv.a;
                }
            });
        }
    }
    
    public static final void b(jkh companion, m76 h, final int n, final int n2) {
        h = h.h(1768428082);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n5;
            if (h.P((Object)companion)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n);
        }
        else {
            n4 = n;
        }
        if ((n4 & 0xB) == 0x2 && h.i()) {
            h.H();
        }
        else {
            if (n3 != 0) {
                companion = jkh.Companion;
            }
            final ea6$b a = ea6.a;
            final jkh n6 = gzq.n(tcq.i(companion));
            final t46 a2 = t46.a;
            jzr.a(n6, null, 0L, 0L, null, 0.0f, (gub<? super m76, ? super Integer, oyv>)t46.b, h, 1572864, 62);
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new gub<m76, Integer, oyv>() {
                public final Object invoke(final Object o, final Object o2) {
                    final m76 m76 = (m76)o;
                    ((Number)o2).intValue();
                    gh6.b(companion, m76, n | 0x1, n2);
                    return oyv.a;
                }
            });
        }
    }
    
    public static final void c(final String s, jkh companion, m76 h, final int n, final int n2) {
        h = h.h(437014973);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)s)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n3 = (n4 | n);
        }
        else {
            n3 = n;
        }
        final int n5 = n2 & 0x2;
        int n6;
        if (n5 != 0) {
            n6 = (n3 | 0x30);
        }
        else {
            n6 = n3;
            if ((n & 0x70) == 0x0) {
                int n7;
                if (h.P((Object)companion)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n3 | n7);
            }
        }
        if ((n6 & 0x5B) == 0x12 && h.i()) {
            h.H();
        }
        else {
            if (n5 != 0) {
                companion = jkh.Companion;
            }
            final ea6$b a = ea6.a;
            xhs.a(s, companion, ((aqc)h.m((re6)fqc.a)).j(), 0L, (nlb)null, (rlb)null, (rkb)null, 0L, (kes)null, (rds)null, 0L, 0, false, 0, (xis)null, false, h, (n6 & 0xE) | (n6 & 0x70), 0, 65528);
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new gub<m76, Integer, oyv>() {
                public final Object invoke(final Object o, final Object o2) {
                    final m76 m76 = (m76)o;
                    ((Number)o2).intValue();
                    gh6.c(s, companion, m76, n | 0x1, n2);
                    return oyv.a;
                }
            });
        }
    }
    
    public static final void d(final vll vll, final o4r o4r, final rtb<? super q4r, oyv> rtb, final m76 m76, final int n) {
        final m76 h = m76.h(-970173924);
        final ea6$b a = ea6.a;
        final jkh.a companion = jkh.Companion;
        final jkh k = x3j.K((jkh)companion, true, (rtb)gh6$d.C0);
        h.x(-483455358);
        final ks0 a2 = ks0.a;
        final ks0$k d = ks0.d;
        Objects.requireNonNull(dx.Companion);
        final gw1$a n2 = dx$a.n;
        final gqg a3 = ps4.a((ks0$l)d, (dx$b)n2, h);
        h.x(-1323940314);
        final n9r e = te6.e;
        final dp8 dp8 = (dp8)h.m((re6)e);
        final n9r i = te6.k;
        final tve tve = (tve)h.m((re6)i);
        final n9r o = te6.o;
        final z5x z5x = (z5x)h.m((re6)o);
        Objects.requireNonNull(f76.Companion);
        final jwe$a b = f76.a.b;
        final jub a4 = cwe.a(k);
        if (!(h.j() instanceof xr0)) {
            ukg.l0();
            throw null;
        }
        h.E();
        if (h.f()) {
            h.A((otb)b);
        }
        else {
            h.o();
        }
        h.F();
        final f76$a$c e2 = f76.a.e;
        r9x.v(h, (Object)a3, (gub)e2);
        final f76$a$a d2 = f76.a.d;
        r9x.v(h, (Object)dp8, (gub)d2);
        final f76$a$b f = f76.a.f;
        r9x.v(h, (Object)tve, (gub)f);
        final f76$a$e g = f76.a.g;
        ((j36)a4).h0((Object)hvl.b(h, z5x, g, h), (Object)h, (Object)0);
        h.x(2058660585);
        h.x(-1163856341);
        final fzq a5 = fzq.a;
        final jkh s = oyz.S(companion, fzq.g, 0.0f, 2);
        h.x(693286680);
        final ks0$j b2 = ks0.b;
        final gw1$b j = dx$a.k;
        final gqg a6 = glo.a((ks0$d)b2, (dx$c)j, h);
        h.x(-1323940314);
        final dp8 dp9 = (dp8)h.m((re6)e);
        final tve tve2 = (tve)h.m((re6)i);
        final z5x z5x2 = (z5x)h.m((re6)o);
        final jub a7 = cwe.a(s);
        if (!(h.j() instanceof xr0)) {
            ukg.l0();
            throw null;
        }
        h.E();
        if (h.f()) {
            h.A((otb)b);
        }
        else {
            h.o();
        }
        ((j36)a7).h0((Object)af.x(h, h, a6, e2, h, dp9, d2, h, tve2, f, h, z5x2, g, h), (Object)h, (Object)0);
        h.x(2058660585);
        h.x(-678309503);
        final jlo a8 = jlo.a;
        final jkh a9 = a8.a(companion, 1.0f, true);
        h.x(-483455358);
        final gqg a10 = ps4.a((ks0$l)d, (dx$b)n2, h);
        h.x(-1323940314);
        final dp8 dp10 = (dp8)h.m((re6)e);
        final tve tve3 = (tve)h.m((re6)i);
        final z5x z5x3 = (z5x)h.m((re6)o);
        final jub a11 = cwe.a(a9);
        if (!(h.j() instanceof xr0)) {
            ukg.l0();
            throw null;
        }
        h.E();
        if (h.f()) {
            h.A((otb)b);
        }
        else {
            h.o();
        }
        ((j36)a11).h0((Object)af.x(h, h, a10, e2, h, dp10, d2, h, tve3, f, h, z5x3, g, h), (Object)h, (Object)0);
        h.x(2058660585);
        h.x(-1163856341);
        final gw1$b l = dx$a.l;
        h.x(693286680);
        final gqg a12 = glo.a((ks0$d)b2, (dx$c)l, h);
        h.x(-1323940314);
        final dp8 dp11 = (dp8)h.m((re6)e);
        final tve tve4 = (tve)h.m((re6)i);
        final z5x z5x4 = (z5x)h.m((re6)o);
        final jub a13 = cwe.a((jkh)companion);
        if (!(h.j() instanceof xr0)) {
            ukg.l0();
            throw null;
        }
        h.E();
        if (h.f()) {
            h.A((otb)b);
        }
        else {
            h.o();
        }
        ((j36)a13).h0((Object)af.x(h, h, a12, e2, h, dp11, d2, h, tve4, f, h, z5x4, g, h), (Object)h, (Object)0);
        h.x(2058660585);
        h.x(-678309503);
        final int n3 = n << 3 & 0x70;
        vll.c((jkh)null, h, n3, 1);
        vll.b(oyz.S(companion, gh6.a, 0.0f, 2), h, n3 | 0x6, 0);
        h.O();
        h.O();
        h.r();
        h.O();
        h.O();
        h.O();
        h.O();
        h.r();
        h.O();
        h.O();
        final jkh a14 = a8.a(companion, 1.0f, true);
        h.x(-483455358);
        final gqg a15 = ps4.a((ks0$l)d, (dx$b)n2, h);
        h.x(-1323940314);
        final dp8 dp12 = (dp8)h.m((re6)e);
        final tve tve5 = (tve)h.m((re6)i);
        final z5x z5x5 = (z5x)h.m((re6)o);
        final jub a16 = cwe.a(a14);
        if (h.j() instanceof xr0) {
            h.E();
            if (h.f()) {
                h.A((otb)b);
            }
            else {
                h.o();
            }
            ((j36)a16).h0((Object)af.x(h, h, a15, e2, h, dp12, d2, h, tve5, f, h, z5x5, g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-1163856341);
            a(null, h, 0, 1);
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
            final String c = o4r.c;
            h.x(315965523);
            if (c != null) {
                gzq.c(h, 0);
                h.x(693286680);
                final gqg a17 = glo.a((ks0$d)b2, (dx$c)j, h);
                h.x(-1323940314);
                final dp8 dp13 = (dp8)h.m((re6)e);
                final tve tve6 = (tve)h.m((re6)i);
                final z5x z5x6 = (z5x)h.m((re6)o);
                final jub a18 = cwe.a(s);
                if (!(h.j() instanceof xr0)) {
                    ukg.l0();
                    throw null;
                }
                h.E();
                if (h.f()) {
                    h.A((otb)b);
                }
                else {
                    h.o();
                }
                ((j36)a18).h0((Object)af.x(h, h, a17, e2, h, dp13, d2, h, tve6, f, h, z5x6, g, h), (Object)h, (Object)0);
                h.x(2058660585);
                h.x(-678309503);
                c(c, null, h, 0, 2);
                h.O();
                h.O();
                h.r();
                h.O();
                h.O();
            }
            h.O();
            gzq.d(h, 0);
            b(je4.d(companion, false, null, null, (otb)new otb<oyv>() {
                public final Object invoke() {
                    rtb.invoke((Object)vll.d());
                    return oyv.a;
                }
            }, 7), h, 0, 0);
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
            final vwo k2 = h.k();
            if (k2 != null) {
                k2.a((gub)new gub<m76, Integer, oyv>() {
                    public final Object invoke(final Object o, final Object o2) {
                        final m76 m76 = (m76)o;
                        ((Number)o2).intValue();
                        gh6.d(vll, o4r, rtb, m76, n | 0x1);
                        return oyv.a;
                    }
                });
            }
            return;
        }
        ukg.l0();
        throw null;
    }
    
    public static final void e(final dh6 dh6, ConnectedAccountsViewModel connectedAccountsViewModel, final m76 m76, final int n, final int n2) {
        zzd.f((Object)dh6, "effectHandler");
        final m76 h = m76.h(1131350049);
        if ((n2 & 0x2) != 0x0) {
            connectedAccountsViewModel = (ConnectedAccountsViewModel)((n8x)h.m((re6)skx.a)).a.c((a9x)new a9x$b(new r8x((Class)ConnectedAccountsViewModel.class, "")));
        }
        final ea6$b a = ea6.a;
        final jkh u = zi8.U(tcq.i(jkh.Companion), zi8.O(h));
        h.x(-483455358);
        final ks0 a2 = ks0.a;
        final ks0$k d = ks0.d;
        Objects.requireNonNull(dx.Companion);
        final gqg a3 = ps4.a((ks0$l)d, (dx$b)dx$a.n, h);
        h.x(-1323940314);
        final dp8 dp8 = (dp8)h.m((re6)te6.e);
        final tve tve = (tve)h.m((re6)te6.k);
        final z5x z5x = (z5x)h.m((re6)te6.o);
        Objects.requireNonNull(f76.Companion);
        final jwe$a b = f76.a.b;
        final jub a4 = cwe.a(u);
        if (h.j() instanceof xr0) {
            h.E();
            if (h.f()) {
                h.A((otb)b);
            }
            else {
                h.o();
            }
            h.F();
            r9x.v(h, (Object)a3, (gub)f76.a.e);
            r9x.v(h, (Object)dp8, (gub)f76.a.d);
            r9x.v(h, (Object)tve, (gub)f76.a.f);
            ((j36)a4).h0((Object)hvl.b(h, z5x, f76.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-1163856341);
            f(h, 0);
            final q7r a5 = k3j.A((MviViewModel)connectedAccountsViewModel, (voe)gh6$h.C0, h, 72);
            h.x(-2088733469);
            final gub<kh6, ap6<? super oyv>, Object> gub = (gub<kh6, ap6<? super oyv>, Object>)new gub<kh6, ap6<? super oyv>, Object>(dh6);
            h.x(1941511575);
            h.x(-301010798);
            final Object y = af.y(h, 773894976, -492369756);
            Objects.requireNonNull(m76.Companion);
            Object d2 = y;
            if (y == m76$a.b) {
                d2 = rb0.d(jgw.A(h), h);
            }
            h.O();
            final yy6 c0 = ((ue6)d2).C0;
            h.O();
            jgw.g((Object)connectedAccountsViewModel, (Object)c0, (gub)new gh6$k((MviViewModel)connectedAccountsViewModel, c0, nkz.v((Object)gub, h), (ap6)null), h);
            h.O();
            h.O();
            h.O();
            final Iterator<Object> iterator = ((Iterable<Object>)a5.getValue()).iterator();
            int n3 = 0;
            while (iterator.hasNext()) {
                final gvj next = iterator.next();
                if (n3 < 0) {
                    tdy.V0();
                    throw null;
                }
                final gvj gvj = next;
                final o4r o4r = (o4r)gvj.C0;
                final vll vll = (vll)gvj.D0;
                h.x(414995766);
                if (n3 > 0) {
                    l39.a((jkh)null, 0L, 0.0f, 0.0f, h, 0, 15);
                    gzq.c(h, 0);
                }
                h.O();
                d(vll, o4r, (rtb<? super q4r, oyv>)new gh6$g((Object)connectedAccountsViewModel), h, 64);
                ++n3;
            }
            dia.u(h);
            final ea6$b a6 = ea6.a;
            final vwo k = h.k();
            if (k != null) {
                k.a((gub)new gub<m76, Integer, oyv>() {
                    public final Object invoke(final Object o, final Object o2) {
                        final m76 m76 = (m76)o;
                        ((Number)o2).intValue();
                        gh6.e(dh6, connectedAccountsViewModel, m76, n | 0x1, n2);
                        return oyv.a;
                    }
                });
            }
            return;
        }
        ukg.l0();
        throw null;
    }
    
    public static final void f(m76 h, final int n) {
        h = h.h(1649063428);
        if (n == 0 && h.i()) {
            h.H();
        }
        else {
            final ea6$b a = ea6.a;
            xhs.a(ukg.d1(2131957679, h), gzq.n((jkh)jkh.Companion), ((aqc)h.m((re6)fqc.a)).j(), 0L, (nlb)null, (rlb)null, (rkb)null, 0L, (kes)null, (rds)null, 0L, 0, false, 0, hqc.Companion.a(h).i, false, h, 0, 0, 49144);
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new gub<m76, Integer, oyv>() {
                public final Object invoke(final Object o, final Object o2) {
                    final m76 m76 = (m76)o;
                    ((Number)o2).intValue();
                    gh6.f(m76, n | 0x1);
                    return oyv.a;
                }
            });
        }
    }
}
