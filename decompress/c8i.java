import android.content.res.Resources;
import android.content.Context;
import com.twitter.core.ui.styles.icons.implementation.Icon;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c8i
{
    public static final void a(final String s, jkh companion, m76 m76, final int n, final int n2) {
        zzd.f((Object)s, "trustedFriendsTitle");
        final m76 h = m76.h(1877619399);
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
            final fzq a2 = fzq.a;
            final jkh j = tcq.j(oyz.U(companion, fzq.f, 0.0f, 0.0f, 0.0f, 14), xd.A(2131166693, h));
            h.x(1157296644);
            final boolean p5 = h.P((Object)s);
            final Object y = h.y();
            Object o = null;
            Label_0280: {
                if (!p5) {
                    Objects.requireNonNull(m76.Companion);
                    if ((o = y) != m76$a.b) {
                        break Label_0280;
                    }
                }
                o = new c8i$a(s);
                h.p(o);
            }
            h.O();
            final jkh k = x3j.K(j, false, (rtb)o);
            final ks0 a3 = ks0.a;
            final ks0$e f = (ks0$e)ks0.f;
            h.x(-483455358);
            Objects.requireNonNull(dx.Companion);
            final gqg a4 = ps4.a((ks0$l)f, (dx$b)dx$a.n, h);
            h.x(-1323940314);
            final dp8 dp8 = (dp8)h.m((re6)te6.e);
            final tve tve = (tve)h.m((re6)te6.k);
            final z5x z5x = (z5x)h.m((re6)te6.o);
            Objects.requireNonNull(f76.Companion);
            final jwe$a b = f76.a.b;
            final jub a5 = cwe.a(k);
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
            r9x.v(h, (Object)a4, (gub)f76.a.e);
            r9x.v(h, (Object)dp8, (gub)f76.a.d);
            r9x.v(h, (Object)tve, (gub)f76.a.f);
            ((j36)a5).h0((Object)hvl.b(h, z5x, f76.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-1163856341);
            final xis g = hqc.Companion.a(h).g;
            m76 = h;
            xhs.a(s, (jkh)null, 0L, 0L, (nlb)null, (rlb)null, (rkb)null, 0L, (kes)null, (rds)null, 0L, 0, false, 0, g, false, m76, n6 & 0xE, 0, 49150);
            dia.u(m76);
        }
        final vwo i = h.k();
        if (i != null) {
            i.a((gub)new c8i$b(s, companion, n, n2));
        }
    }
    
    public static final void b(final x8i$d x8i$d, final boolean b, final rtb<? super g9i, oyv> rtb, final otb<oyv> otb, jkh companion, final m76 m76, final int n, final int n2) {
        zzd.f((Object)x8i$d, "item");
        zzd.f((Object)rtb, "onClick");
        zzd.f((Object)otb, "onEditButtonClick");
        final m76 h = m76.h(872612301);
        if ((n2 & 0x10) != 0x0) {
            companion = jkh.Companion;
        }
        final ea6$b a = ea6.a;
        final String d1 = ukg.d1(2131955300, h);
        final jkh.a companion2 = jkh.Companion;
        final jkh b2 = pdp.b(tcq.i(companion2), b, (otb)new c8i$c((rtb)rtb, x8i$d));
        final fzq a2 = fzq.a;
        final jkh e = oyz.U(b2, 0.0f, fzq.g, 0.0f, fzq.e, 5).E(companion);
        h.x(693286680);
        final ks0 a3 = ks0.a;
        final ks0$j b3 = ks0.b;
        Objects.requireNonNull(dx.Companion);
        final gqg a4 = glo.a((ks0$d)b3, (dx$c)dx$a.k, h);
        h.x(-1323940314);
        final dp8 dp8 = (dp8)h.m((re6)te6.e);
        final tve tve = (tve)h.m((re6)te6.k);
        final z5x z5x = (z5x)h.m((re6)te6.o);
        Objects.requireNonNull(f76.Companion);
        final jwe$a b4 = f76.a.b;
        final jub a5 = cwe.a(e);
        if (!(h.j() instanceof xr0)) {
            ukg.l0();
            throw null;
        }
        h.E();
        if (h.f()) {
            h.A((otb)b4);
        }
        else {
            h.o();
        }
        h.F();
        r9x.v(h, (Object)a4, (gub)f76.a.e);
        r9x.v(h, (Object)dp8, (gub)f76.a.d);
        r9x.v(h, (Object)tve, (gub)f76.a.f);
        ((j36)a5).h0((Object)hvl.b(h, z5x, f76.a.g, h), (Object)h, (Object)0);
        h.x(2058660585);
        h.x(-678309503);
        e(b, tcq.o(oyz.S(companion2, 0.0f, 0.0f, 3), xd.A(2131166692, h), xd.A(2131166692, h)), h, n >> 3 & 0xE, 0);
        if (x8i$d.a != 0L) {
            h.x(-329238305);
            c(d1, x8i$d.b, null, h, 0, 4);
            h.O();
        }
        else {
            h.x(-329238129);
            a(d1, null, h, 0, 2);
            h.O();
        }
        if (1.0f > 0.0) {
            final ssd$a a6 = ssd.a;
            final ssd$a a7 = ssd.a;
            final cxe cxe = new cxe(1.0f, true);
            companion2.E((jkh)cxe);
            ukg.o((jkh)cxe, h, 0);
            if (x8i$d.a != 0L) {
                final String d2 = ukg.d1(2131955298, h);
                final o53 o53 = new o53(t53.D0, (a5f)a5f$f.F0);
                final k53$b k53$b = new k53$b(false);
                h.x(1157296644);
                final boolean p8 = h.P((Object)otb);
                final Object y = h.y();
                Object o54 = null;
                Label_0651: {
                    if (!p8) {
                        Objects.requireNonNull(m76.Companion);
                        if ((o54 = y) != m76$a.b) {
                            break Label_0651;
                        }
                    }
                    o54 = new c8i$d((otb)otb);
                    h.p(o54);
                }
                h.O();
                zoc.b(o53, (jkh)null, d2, (k53)k53$b, (Icon)null, (String)null, false, (otb)o54, h, 4096, 114);
            }
            final vwo w = yk.w(h);
            if (w != null) {
                w.a((gub)new c8i$e(x8i$d, b, (rtb)rtb, (otb)otb, companion, n, n2));
            }
            return;
        }
        throw new IllegalArgumentException(xk0.A("invalid weight ", 1.0f, "; must be greater than zero").toString());
    }
    
    public static final void c(final String s, final int n, jkh companion, m76 m76, final int n2, final int n3) {
        zzd.f((Object)s, "trustedFriendsTitle");
        final m76 h = m76.h(433899557);
        int n4;
        if ((n3 & 0x1) != 0x0) {
            n4 = (n2 | 0x6);
        }
        else if ((n2 & 0xE) == 0x0) {
            int n5;
            if (h.P((Object)s)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n2);
        }
        else {
            n4 = n2;
        }
        int n6;
        if ((n3 & 0x2) != 0x0) {
            n6 = (n4 | 0x30);
        }
        else {
            n6 = n4;
            if ((n2 & 0x70) == 0x0) {
                int n7;
                if (h.d(n)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        final int n8 = n3 & 0x4;
        int n9;
        if (n8 != 0) {
            n9 = (n6 | 0x180);
        }
        else {
            n9 = n6;
            if ((n2 & 0x380) == 0x0) {
                int n10;
                if (h.P((Object)companion)) {
                    n10 = 256;
                }
                else {
                    n10 = 128;
                }
                n9 = (n6 | n10);
            }
        }
        if ((n9 & 0x2DB) == 0x92 && h.i()) {
            h.H();
        }
        else {
            if (n8 != 0) {
                companion = jkh.Companion;
            }
            final ea6$b a = ea6.a;
            final Resources resources = ((Context)h.m((re6)a30.b)).getResources();
            h.x(1157296644);
            final boolean p6 = h.P((Object)n);
            final Object y = h.y();
            Object h2 = null;
            Label_0343: {
                if (!p6) {
                    Objects.requireNonNull(m76.Companion);
                    if ((h2 = y) != m76$a.b) {
                        break Label_0343;
                    }
                }
                h2 = j2d.h(resources, (long)n, true);
                h.p(h2);
            }
            h.O();
            zzd.e(h2, "remember(peopleCount) {\n\u2026e\n            )\n        }");
            final String n11 = ukg.N0(2131820620, n, new Object[] { h2 }, h);
            final fzq a2 = fzq.a;
            final jkh j = tcq.j(oyz.U(companion, fzq.f, 0.0f, 0.0f, 0.0f, 14), xd.A(2131166693, h));
            h.x(511388516);
            final boolean p7 = h.P((Object)s);
            final boolean p8 = h.P((Object)n11);
            final Object y2 = h.y();
            Object o = null;
            Label_0489: {
                if (!(p7 | p8)) {
                    Objects.requireNonNull(m76.Companion);
                    if ((o = y2) != m76$a.b) {
                        break Label_0489;
                    }
                }
                o = new c8i$f(s, n11);
                h.p(o);
            }
            h.O();
            final jkh k = x3j.K(j, false, (rtb)o);
            final ks0 a3 = ks0.a;
            final ks0$e f = (ks0$e)ks0.f;
            h.x(-483455358);
            Objects.requireNonNull(dx.Companion);
            final gqg a4 = ps4.a((ks0$l)f, (dx$b)dx$a.n, h);
            h.x(-1323940314);
            final n9r e = te6.e;
            final dp8 dp8 = (dp8)h.m((re6)e);
            final n9r i = te6.k;
            final tve tve = (tve)h.m((re6)i);
            final n9r o2 = te6.o;
            final z5x z5x = (z5x)h.m((re6)o2);
            Objects.requireNonNull(f76.Companion);
            final jwe$a b = f76.a.b;
            final jub a5 = cwe.a(k);
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
            r9x.v(h, (Object)a4, (gub)e2);
            final f76$a$a d = f76.a.d;
            r9x.v(h, (Object)dp8, (gub)d);
            final f76$a$b f2 = f76.a.f;
            r9x.v(h, (Object)tve, (gub)f2);
            final f76$a$e g = f76.a.g;
            ((j36)a5).h0((Object)hvl.b(h, z5x, g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-1163856341);
            final hqc$a companion2 = hqc.Companion;
            xhs.a(s, (jkh)null, 0L, 0L, (nlb)null, (rlb)null, (rkb)null, 0L, (kes)null, (rds)null, 0L, 0, false, 0, companion2.a(h).g, false, h, n9 & 0xE, 0, 49150);
            m76 = h;
            gzq.e(m76, 0);
            m76.x(693286680);
            final jkh.a companion3 = jkh.Companion;
            final gqg a6 = glo.a((ks0$d)ks0.b, (dx$c)dx$a.k, m76);
            m76.x(-1323940314);
            final dp8 dp9 = (dp8)m76.m((re6)e);
            final tve tve2 = (tve)m76.m((re6)i);
            final z5x z5x2 = (z5x)m76.m((re6)o2);
            final jub a7 = cwe.a((jkh)companion3);
            if (!(m76.j() instanceof xr0)) {
                ukg.l0();
                throw null;
            }
            m76.E();
            if (m76.f()) {
                m76.A((otb)b);
            }
            else {
                m76.o();
            }
            ((j36)a7).h0((Object)af.x(m76, m76, a6, e2, m76, dp9, d, m76, tve2, f2, m76, z5x2, g, m76), (Object)m76, (Object)0);
            m76.x(2058660585);
            m76.x(-678309503);
            xhs.a(n11, (jkh)null, ((aqc)m76.m((re6)fqc.a)).j(), 0L, (nlb)null, (rlb)null, (rkb)null, 0L, (kes)null, (rds)null, 0L, 0, false, 0, companion2.a(m76).j, false, m76, 0, 0, 49146);
            m76.O();
            m76.O();
            m76.r();
            m76.O();
            m76.O();
            m76.O();
            m76.O();
            m76.r();
            m76.O();
            m76.O();
        }
        final vwo l = h.k();
        if (l != null) {
            l.a((gub)new c8i$g(s, n, companion, n2, n3));
        }
    }
    
    public static final void d(jkh companion, m76 h, final int n, final int n2) {
        h = h.h(32895421);
        final int n3 = n2 & 0x1;
        final int n4 = 4;
        int n5;
        if (n3 != 0) {
            n5 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n6;
            if (h.P((Object)companion)) {
                n6 = 4;
            }
            else {
                n6 = 2;
            }
            n5 = (n6 | n);
        }
        else {
            n5 = n;
        }
        if ((n5 & 0xB) == 0x2 && h.i()) {
            h.H();
        }
        else {
            if (n3 != 0) {
                companion = jkh.Companion;
            }
            final ea6$b a = ea6.a;
            final int n7 = n5 & 0xE;
            h.x(733328855);
            Objects.requireNonNull(dx.Companion);
            final gqg d = ib2.d((dx)dx$a.b, false, h);
            h.x(-1323940314);
            final dp8 dp8 = (dp8)h.m((re6)te6.e);
            final tve tve = (tve)h.m((re6)te6.k);
            final z5x z5x = (z5x)h.m((re6)te6.o);
            Objects.requireNonNull(f76.Companion);
            final jwe$a b = f76.a.b;
            final jub a2 = cwe.a(companion);
            final int n8 = ((n7 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
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
            r9x.v(h, (Object)d, (gub)f76.a.e);
            r9x.v(h, (Object)dp8, (gub)f76.a.d);
            r9x.v(h, (Object)tve, (gub)f76.a.f);
            ((j36)a2).h0((Object)hvl.b(h, z5x, f76.a.g, h), (Object)h, (Object)(n8 >> 3 & 0x70));
            h.x(2058660585);
            h.x(-2137368960);
            if ((n8 >> 9 & 0xE & 0xB) == 0x2 && h.i()) {
                h.H();
            }
            else {
                final asy i0 = asy.I0;
                int n10;
                final int n9 = n10 = ((n7 >> 6 & 0x70) | 0x6);
                if ((n9 & 0xE) == 0x0) {
                    int n11;
                    if (h.P((Object)i0)) {
                        n11 = n4;
                    }
                    else {
                        n11 = 2;
                    }
                    n10 = (n9 | n11);
                }
                if ((n10 & 0x5B) == 0x12 && h.i()) {
                    h.H();
                }
                else {
                    final jkh.a companion2 = jkh.Companion;
                    final bpc a3 = bpc.a;
                    ib2.a(i0.n0(h6q.j((jkh)companion2, bpc.H)), h, 0);
                    n7d.a(oyz.V(gpc.X0.getDrawableRes(), h), (String)null, i0.d((jkh)companion2, (dx)dx$a.f), (dx)null, (ym6)null, 0.0f, sr4$a.b(sr4.Companion, bpc.B1), h, 56, 56);
                }
            }
            dia.u(h);
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new c8i$h(companion, n, n2));
        }
    }
    
    public static final void e(final boolean b, jkh companion, m76 h, final int n, final int n2) {
        h = h.h(444122362);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.a(b)) {
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
            final int n8 = n6 >> 3 & 0xE;
            h.x(733328855);
            Objects.requireNonNull(dx.Companion);
            final gqg d = ib2.d((dx)dx$a.b, false, h);
            h.x(-1323940314);
            final n9r e = te6.e;
            final dp8 dp8 = (dp8)h.m((re6)e);
            final n9r k = te6.k;
            final tve tve = (tve)h.m((re6)k);
            final n9r o = te6.o;
            final z5x z5x = (z5x)h.m((re6)o);
            Objects.requireNonNull(f76.Companion);
            final jwe$a b2 = f76.a.b;
            final jub a2 = cwe.a(companion);
            final int n9 = ((n8 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
            if (!(h.j() instanceof xr0)) {
                ukg.l0();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((otb)b2);
            }
            else {
                h.o();
            }
            h.F();
            final f76$a$c e2 = f76.a.e;
            r9x.v(h, (Object)d, (gub)e2);
            final f76$a$a d2 = f76.a.d;
            r9x.v(h, (Object)dp8, (gub)d2);
            final f76$a$b f = f76.a.f;
            r9x.v(h, (Object)tve, (gub)f);
            final f76$a$e g = f76.a.g;
            ((j36)a2).h0((Object)hvl.b(h, z5x, g, h), (Object)h, (Object)(n9 >> 3 & 0x70));
            h.x(2058660585);
            h.x(-2137368960);
            final int n10 = 2;
            if ((n9 >> 9 & 0xE & 0xB) == 0x2 && h.i()) {
                h.H();
            }
            else {
                final asy i0 = asy.I0;
                int n12;
                final int n11 = n12 = ((n8 >> 6 & 0x70) | 0x6);
                if ((n11 & 0xE) == 0x0) {
                    int n13 = n10;
                    if (h.P((Object)i0)) {
                        n13 = 4;
                    }
                    n12 = (n11 | n13);
                }
                if ((n12 & 0x5B) == 0x12 && h.i()) {
                    h.H();
                }
                else {
                    h.x(-483455358);
                    final jkh.a companion2 = jkh.Companion;
                    final ks0 a3 = ks0.a;
                    final gqg a4 = ps4.a((ks0$l)ks0.d, (dx$b)dx$a.n, h);
                    h.x(-1323940314);
                    final dp8 dp9 = (dp8)h.m((re6)e);
                    final tve tve2 = (tve)h.m((re6)k);
                    final z5x z5x2 = (z5x)h.m((re6)o);
                    final jub a5 = cwe.a((jkh)companion2);
                    if (!(h.j() instanceof xr0)) {
                        ukg.l0();
                        throw null;
                    }
                    h.E();
                    if (h.f()) {
                        h.A((otb)b2);
                    }
                    else {
                        h.o();
                    }
                    ((j36)a5).h0((Object)af.x(h, h, a4, e2, h, dp9, d2, h, tve2, f, h, z5x2, g, h), (Object)h, (Object)0);
                    h.x(2058660585);
                    h.x(-1163856341);
                    final jkh o2 = tcq.o(companion2, xd.A(2131166693, h), xd.A(2131166693, h));
                    final float n14 = 12;
                    d(rp2.A(o2, (oqp)qko.d(n14, n14, n14, n14)), h, 0, 0);
                    gzq.l(h, 0);
                    h.O();
                    h.O();
                    h.r();
                    h.O();
                    h.O();
                    if (b) {
                        r6i.a(i0.d((jkh)companion2, (dx)dx$a.j), h, 0, 0);
                    }
                }
            }
            dia.u(h);
        }
        final vwo j = h.k();
        if (j != null) {
            j.a((gub)new c8i$i(b, companion, n, n2));
        }
    }
}
