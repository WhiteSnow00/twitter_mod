import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.android.liveevent.di.view.LiveEventLandingViewObjectGraph;
import com.twitter.android.liveevent.landing.hero.audiospace.AudioSpaceHeroViewModel;
import com.twitter.core.ui.styles.icons.implementation.Icon;
import android.content.res.Resources;
import java.text.SimpleDateFormat;
import android.content.Context;
import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r11
{
    public static final u3s a;
    public static final u3s b;
    
    static {
        a = (u3s)rp2.z0((otb)r11$f.C0);
        b = (u3s)rp2.z0((otb)r11$l.C0);
    }
    
    public static final void a(final fpf fpf, final jkh jkh, final rtb<? super f21, oyv> rtb, final m76 m76, final int n, final int n2) {
        final m76 h = m76.h(-182611103);
        jkh companion;
        if ((n2 & 0x2) != 0x0) {
            companion = jkh.Companion;
        }
        else {
            companion = jkh;
        }
        final ea6$b a = ea6.a;
        final hfv j = fpf.j;
        final String s = null;
        pr4 pr4 = null;
        Label_0080: {
            if (j != null) {
                final List q1 = j.q1;
                if (q1 != null) {
                    final Integer h2 = tdy.H(q1);
                    if (h2 != null) {
                        pr4 = new pr4(m0n.p(h2.intValue()));
                        break Label_0080;
                    }
                }
            }
            pr4 = null;
        }
        h.x(-892379155);
        long n3;
        if (pr4 == null) {
            h.x(-625249759);
            n3 = ri4.A(2131099763, h);
            h.O();
        }
        else {
            n3 = pr4.a;
        }
        h.O();
        final jkh i = h6q.j(oyz.i(tcq.i(companion), 1.7777778f), n3);
        h.x(1157296644);
        final boolean p6 = h.P((Object)rtb);
        final Object y = h.y();
        Object o = null;
        Label_0218: {
            if (!p6) {
                Objects.requireNonNull(m76.Companion);
                if ((o = y) != m76$a.b) {
                    break Label_0218;
                }
            }
            o = new r11$a((rtb)rtb);
            h.p(o);
        }
        h.O();
        final jkh d = je4.d(i, false, null, null, (otb)o, 7);
        h.x(733328855);
        Objects.requireNonNull(dx.Companion);
        final gqg d2 = ib2.d((dx)dx$a.b, false, h);
        h.x(-1323940314);
        final dp8 dp8 = (dp8)h.m((re6)te6.e);
        final tve tve = (tve)h.m((re6)te6.k);
        final z5x z5x = (z5x)h.m((re6)te6.o);
        Objects.requireNonNull(f76.Companion);
        final jwe$a b = f76.a.b;
        final jub a2 = cwe.a(d);
        if (h.j() instanceof xr0) {
            h.E();
            if (h.f()) {
                h.A((otb)b);
            }
            else {
                h.o();
            }
            h.F();
            r9x.v(h, (Object)d2, (gub)f76.a.e);
            r9x.v(h, (Object)dp8, (gub)f76.a.d);
            r9x.v(h, (Object)tve, (gub)f76.a.f);
            ((j36)a2).h0((Object)hvl.b(h, z5x, f76.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            final hfv k = fpf.j;
            String k2 = null;
            Label_0509: {
                if (k != null) {
                    final String d3 = k.D0;
                    if (d3 != null) {
                        k2 = ckr.k1(d3, "_normal.", ".", false);
                        break Label_0509;
                    }
                }
                k2 = null;
            }
            String s2 = k2;
            if (k2 == null) {
                s2 = "";
            }
            final hfv l = fpf.j;
            String j2 = s;
            if (l != null) {
                j2 = l.J0;
            }
            String s3;
            if ((s3 = j2) == null) {
                s3 = "";
            }
            final jkh.a companion2 = jkh.Companion;
            final gw1 f = dx$a.f;
            zzd.f((Object)companion2, "<this>");
            final ssd$a a3 = ssd.a;
            final ssd$a a4 = ssd.a;
            bcw.c(s2, s3, oyz.i(oyz.S((jkh)new hb2((dx)f, false), 0.0f, 20, 1), 1.0f), (cvd)null, (ee1)null, (oqp)null, 0.0f, (sr4)null, (rtb)null, (lrb)null, (jub)null, (jub)null, h, 0, 0, 4088);
            final vwo w = yk.w(h);
            if (w != null) {
                w.a((gub)new r11$b(fpf, companion, (rtb)rtb, n, n2));
            }
            return;
        }
        ukg.l0();
        throw null;
    }
    
    public static final void b(final fpf fpf, final mdq mdq, final boolean b, final boolean b2, jkh companion, final rtb<? super f21, oyv> rtb, m76 h, final int n, final int n2) {
        h = h.h(108762779);
        if ((n2 & 0x10) != 0x0) {
            companion = jkh.Companion;
        }
        final ea6$b a = ea6.a;
        if (fpf != null) {
            h.x(1980746272);
            final int n3 = n >> 3;
            c(fpf, b, b2, companion, rtb, h, (n3 & 0x70) | 0x8 | (n3 & 0x380) | (n3 & 0x1C00) | (n3 & 0xE000), 0);
            h.O();
        }
        else if (mdq != null) {
            h.x(1980746504);
            final bpc a2 = bpc.a;
            ndq.d(mdq, (vo6)null, (dtg)null, h6q.j(companion, bpc.C1), h, 440, 0);
            h.O();
        }
        else {
            h.x(1980746701);
            ndq.b(companion, h, n >> 12 & 0xE, 0);
            h.O();
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new r11$c(fpf, mdq, b, b2, companion, (rtb)rtb, n, n2));
        }
    }
    
    public static final void c(final fpf fpf, final boolean b, final boolean b2, jkh companion, final rtb<? super f21, oyv> rtb, m76 h, final int n, final int n2) {
        h = h.h(-1383912171);
        if ((n2 & 0x8) != 0x0) {
            companion = jkh.Companion;
        }
        final ea6$b a = ea6.a;
        final int n3 = n >> 9 & 0xE;
        h.x(733328855);
        Objects.requireNonNull(dx.Companion);
        final gqg d = ib2.d((dx)dx$a.b, false, h);
        h.x(-1323940314);
        final dp8 dp8 = (dp8)h.m((re6)te6.e);
        final tve tve = (tve)h.m((re6)te6.k);
        final z5x z5x = (z5x)h.m((re6)te6.o);
        Objects.requireNonNull(f76.Companion);
        final jwe$a b3 = f76.a.b;
        final jub a2 = cwe.a(companion);
        final int n4 = ((n3 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
        if (h.j() instanceof xr0) {
            h.E();
            if (h.f()) {
                h.A((otb)b3);
            }
            else {
                h.o();
            }
            h.F();
            r9x.v(h, (Object)d, (gub)f76.a.e);
            r9x.v(h, (Object)dp8, (gub)f76.a.d);
            r9x.v(h, (Object)tve, (gub)f76.a.f);
            ((j36)a2).h0((Object)hvl.b(h, z5x, f76.a.g, h), (Object)h, (Object)(n4 >> 3 & 0x70));
            h.x(2058660585);
            h.x(-2137368960);
            if ((n4 >> 9 & 0xE & 0xB) == 0x2 && h.i()) {
                h.H();
            }
            else if ((((n3 >> 6 & 0x70) | 0x6) & 0x51) == 0x10 && h.i()) {
                h.H();
            }
            else {
                a(fpf, null, rtb, h, (n >> 6 & 0x380) | 0x8, 2);
                d(fpf, b, b2, null, rtb, h, (n & 0x70) | 0x8 | (n & 0x380) | (0xE000 & n), 8);
            }
            final vwo w = yk.w(h);
            if (w != null) {
                w.a((gub)new r11$d(fpf, b, b2, companion, (rtb)rtb, n, n2));
            }
            return;
        }
        ukg.l0();
        throw null;
    }
    
    public static final void d(final fpf fpf, final boolean b, final boolean b2, jkh companion, final rtb<? super f21, oyv> rtb, m76 h, final int n, final int n2) {
        h = h.h(-1017921345);
        if ((n2 & 0x8) != 0x0) {
            companion = jkh.Companion;
        }
        final ea6$b a = ea6.a;
        final jkh j = h6q.j(oyz.i(tcq.i(companion), 1.7777778f), pr4.b(ri4.A(2131099921, h), 0.35f));
        h.x(733328855);
        Objects.requireNonNull(dx.Companion);
        final gqg d = ib2.d((dx)dx$a.b, false, h);
        h.x(-1323940314);
        final dp8 dp8 = (dp8)h.m((re6)te6.e);
        final tve tve = (tve)h.m((re6)te6.k);
        final z5x z5x = (z5x)h.m((re6)te6.o);
        Objects.requireNonNull(f76.Companion);
        final jwe$a b3 = f76.a.b;
        final jub a2 = cwe.a(j);
        if (h.j() instanceof xr0) {
            h.E();
            if (h.f()) {
                h.A((otb)b3);
            }
            else {
                h.o();
            }
            h.F();
            r9x.v(h, (Object)d, (gub)f76.a.e);
            r9x.v(h, (Object)dp8, (gub)f76.a.d);
            r9x.v(h, (Object)tve, (gub)f76.a.f);
            ((j36)a2).h0((Object)hvl.b(h, z5x, f76.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            final asy i0 = asy.I0;
            h((kb2)i0, fpf, b2, rtb, h, (n & 0x380) | 0x46 | (n >> 3 & 0x1C00));
            f((kb2)i0, fpf, b, h, (n << 3 & 0x380) | 0x46);
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
            final vwo k = h.k();
            if (k != null) {
                k.a((gub)new r11$e(fpf, b, b2, companion, (rtb)rtb, n, n2));
            }
            return;
        }
        ukg.l0();
        throw null;
    }
    
    public static final void e(final ilo ilo, final boolean b, final m76 m76, final int n) {
        final m76 h = m76.h(1962905073);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (h.P((Object)ilo)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        int n4 = n3;
        if ((n & 0x70) == 0x0) {
            int n5;
            if (h.a(b)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if ((n4 & 0x5B) == 0x12 && h.i()) {
            h.H();
        }
        else {
            final ea6$b a = ea6.a;
            final jkh.a companion = jkh.Companion;
            Objects.requireNonNull(dx.Companion);
            final jkh u = oyz.U(ilo.b((jkh)companion, (dx$c)dx$a.l), 6, 0.0f, 0.0f, 0.0f, 14);
            final r11$g j0 = r11$g.J0;
            h.x(1157296644);
            final boolean p4 = h.P((Object)b);
            final Object y = h.y();
            Object o = null;
            Label_0237: {
                if (!p4) {
                    Objects.requireNonNull(m76.Companion);
                    if ((o = y) != m76$a.b) {
                        break Label_0237;
                    }
                }
                o = new r11$h(b);
                h.p(o);
            }
            h.O();
            u70.a((rtb)j0, u, (rtb)o, h, 0, 0);
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new r11$i(ilo, b, n));
        }
    }
    
    public static final void f(final kb2 kb2, final fpf fpf, final boolean b, final m76 m76, final int n) {
        final m76 h = m76.h(279609789);
        final ea6$b a = ea6.a;
        final jkh.a companion = jkh.Companion;
        Objects.requireNonNull(dx.Companion);
        final jkh d = kb2.d((jkh)companion, (dx)dx$a.i);
        final float n2 = 12;
        final float n3 = 8;
        final jkh i = tcq.i(oyz.U(d, n3, 0.0f, n3, n2, 2));
        h.x(693286680);
        final ks0 a2 = ks0.a;
        final ks0$j b2 = ks0.b;
        final gw1$b k = dx$a.k;
        final gqg a3 = glo.a((ks0$d)b2, (dx$c)k, h);
        h.x(-1323940314);
        final n9r e = te6.e;
        final dp8 dp8 = (dp8)h.m((re6)e);
        final n9r j = te6.k;
        final tve tve = (tve)h.m((re6)j);
        final n9r o = te6.o;
        final z5x z5x = (z5x)h.m((re6)o);
        Objects.requireNonNull(f76.Companion);
        final jwe$a b3 = f76.a.b;
        final jub a4 = cwe.a(i);
        if (!(h.j() instanceof xr0)) {
            ukg.l0();
            throw null;
        }
        h.E();
        if (h.f()) {
            h.A((otb)b3);
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
        h.x(-678309503);
        final jlo a5 = jlo.a;
        final bpc a6 = bpc.a;
        final jkh l = h6q.j((jkh)companion, bpc.H0);
        h.x(693286680);
        final gqg a7 = glo.a((ks0$d)b2, (dx$c)k, h);
        h.x(-1323940314);
        final dp8 dp9 = (dp8)h.m((re6)e);
        final tve tve2 = (tve)h.m((re6)j);
        final z5x z5x2 = (z5x)h.m((re6)o);
        final jub a8 = cwe.a(l);
        if (!(h.j() instanceof xr0)) {
            ukg.l0();
            throw null;
        }
        h.E();
        if (h.f()) {
            h.A((otb)b3);
        }
        else {
            h.o();
        }
        ((j36)a8).h0((Object)af.x(h, h, a7, e2, h, dp9, d2, h, tve2, f, h, z5x2, g, h), (Object)h, (Object)0);
        nh.y(h, 2058660585, -678309503, -796056819);
        if (Objects.equals(fpf.c, "RUNNING")) {
            e((ilo)a5, b, h, (n >> 3 & 0x70) | 0x6);
        }
        h.O();
        h.x(-2096599974);
        if (!fpf.b()) {
            g(fpf, h, 8);
        }
        h.O();
        h.O();
        h.O();
        h.r();
        h.O();
        h.O();
        final jkh i2 = h6q.i((jkh)companion, pr4.b(bpc.A, 0.6f), (oqp)v5m.a);
        h.x(733328855);
        final gqg d3 = ib2.d((dx)dx$a.b, false, h);
        h.x(-1323940314);
        final dp8 dp10 = (dp8)h.m((re6)e);
        final tve tve3 = (tve)h.m((re6)j);
        final z5x z5x3 = (z5x)h.m((re6)o);
        final jub a9 = cwe.a(i2);
        if (h.j() instanceof xr0) {
            h.E();
            if (h.f()) {
                h.A((otb)b3);
            }
            else {
                h.o();
            }
            ((j36)a9).h0((Object)af.x(h, h, d3, e2, h, dp10, d2, h, tve3, f, h, z5x3, g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            final jkh s = oyz.S(companion, 6, 0.0f, 2);
            h.x(437741665);
            final Resources resources = ((Context)h.m((re6)a30.b)).getResources();
            String s2;
            if (fpf.b()) {
                h.x(-1647923540);
                h.x(660267555);
                final Long h2 = fpf.h;
                if (h2 == null) {
                    h.O();
                    s2 = "";
                }
                else {
                    h.x(1157296644);
                    final boolean p5 = h.P((Object)h2);
                    final Object y = h.y();
                    gvj gvj = null;
                    Label_1062: {
                        if (!p5) {
                            Objects.requireNonNull(m76.Companion);
                            if ((gvj = (gvj)y) != m76$a.b) {
                                break Label_1062;
                            }
                        }
                        gvj = new gvj((Object)((SimpleDateFormat)r11.a.getValue()).format(fpf.h), (Object)((SimpleDateFormat)r11.b.getValue()).format(fpf.h));
                        h.p((Object)gvj);
                    }
                    h.O();
                    final gvj gvj2 = gvj;
                    final String s3 = (String)gvj2.C0;
                    final String s4 = (String)gvj2.D0;
                    zzd.e((Object)s3, "date");
                    zzd.e((Object)s4, "time");
                    s2 = ukg.e1(2131954742, new Object[] { s3, s4 }, h);
                    h.O();
                }
                h.O();
            }
            else if (fpf.a()) {
                h.x(-1647923493);
                final Integer g2 = fpf.g;
                Integer value = 0;
                Integer n4;
                if ((n4 = g2) == null) {
                    n4 = value;
                }
                final int intValue = n4;
                final Integer f2 = fpf.f;
                if (f2 != null) {
                    value = f2;
                }
                final String g3 = j2d.g(resources, (long)(value.intValue() + intValue));
                zzd.e((Object)g3, "tweetNumberFormat(resour\u2026s, totalTunedIn.toLong())");
                s2 = ukg.e1(2131954740, new Object[] { g3 }, h);
                h.O();
            }
            else {
                h.x(-1647923298);
                Integer n5;
                if ((n5 = fpf.f) == null) {
                    n5 = 0;
                }
                final String g4 = j2d.g(resources, (long)n5);
                zzd.e((Object)g4, "tweetNumberFormat(resour\u2026Listeners ?: 0).toLong())");
                s2 = ukg.e1(2131954738, new Object[] { g4 }, h);
                h.O();
            }
            h.O();
            xhs.a(s2, s, bpc.B1, 0L, (nlb)null, (rlb)null, (rkb)null, 0L, (kes)null, (rds)null, 0L, 0, false, 0, j(h), false, h, 48, 0, 49144);
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
            final vwo k2 = h.k();
            if (k2 != null) {
                k2.a((gub)new r11$j(kb2, fpf, b, n));
            }
            return;
        }
        ukg.l0();
        throw null;
    }
    
    public static final void g(final fpf fpf, final m76 m76, final int n) {
        final m76 h = m76.h(86678429);
        final ea6$b a = ea6.a;
        final jkh s = oyz.S(jkh.Companion, 6, 0.0f, 2);
        String s2;
        if (fpf.b()) {
            h.x(1069641);
            h.O();
            s2 = "";
        }
        else if (fpf.a()) {
            s2 = zi.x(h, -1662533439, 2131954741, h);
        }
        else {
            s2 = zi.x(h, -1662533344, 2131954739, h);
        }
        final xis j = j(h);
        final bpc a2 = bpc.a;
        xhs.a(s2, s, bpc.B1, 0L, (nlb)null, (rlb)null, (rkb)null, 0L, (kes)null, (rds)null, 0L, 0, false, 0, j, false, h, 48, 0, 49144);
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new r11$k(fpf, n));
        }
    }
    
    public static final void h(final kb2 kb2, final fpf fpf, final boolean b, final rtb<? super f21, oyv> rtb, m76 m76, final int n) {
        final m76 h = m76.h(2059006134);
        final ea6$b a = ea6.a;
        final jkh.a companion = jkh.Companion;
        Objects.requireNonNull(dx.Companion);
        final jkh d = kb2.d((jkh)companion, (dx)dx$a.f);
        h.x(-483455358);
        final ks0 a2 = ks0.a;
        final gqg a3 = ps4.a((ks0$l)ks0.d, (dx$b)dx$a.n, h);
        h.x(-1323940314);
        final dp8 dp8 = (dp8)h.m((re6)te6.e);
        final tve tve = (tve)h.m((re6)te6.k);
        final z5x z5x = (z5x)h.m((re6)te6.o);
        Objects.requireNonNull(f76.Companion);
        final jwe$a b2 = f76.a.b;
        final jub a4 = cwe.a(d);
        if (h.j() instanceof xr0) {
            h.E();
            if (h.f()) {
                h.A((otb)b2);
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
            final gw1$a o = dx$a.o;
            zzd.f((Object)companion, "<this>");
            final ssd$a a5 = ssd.a;
            final ssd$a a6 = ssd.a;
            final jkh s = oyz.S((jkh)new iqc((dx$b)o), 16, 0.0f, 2);
            Objects.requireNonNull(rds.Companion);
            Objects.requireNonNull(jis.Companion);
            String d2;
            if ((d2 = fpf.d) == null) {
                d2 = "";
            }
            final bpc a7 = bpc.a;
            final long b3 = bpc.B1;
            h.x(-920489270);
            final xis g = hqc.Companion.a(h).g;
            Objects.requireNonNull(rlb.Companion);
            final xis a8 = xis.a(g, 0L, 0L, rlb.M0, null, null, null, null, 0L, 262139);
            h.O();
            xhs.a(d2, s, b3, 0L, (nlb)null, (rlb)null, (rkb)null, 0L, (kes)null, new rds(3), 0L, 2, false, 2, a8, false, h, 0, 3120, 38392);
            final jkh u = oyz.U(companion, 0.0f, 12, 0.0f, 0.0f, 13);
            zzd.f((Object)u, "<this>");
            final jkh e = u.E((jkh)new iqc((dx$b)o));
            o53 o2;
            if (b) {
                o2 = new o53(t53.D0, (a5f)a5f$d.F0);
            }
            else {
                final t53 c0 = t53.C0;
                final p5f p5f = new p5f(pr4.b(b3, 0.9f), bpc.C1);
                o2 = new o53(c0, (a5f)new a5f$b(p5f, p5f, p5f));
            }
            final k53$a k53$a = new k53$a(false);
            String s2;
            if (fpf.b() && !b) {
                m76 = h;
                s2 = zi.x(m76, -379719091, 2131954736, m76);
            }
            else {
                m76 = h;
                if (fpf.b() && b) {
                    s2 = zi.x(m76, -379718986, 2131954737, m76);
                }
                else if (fpf.a() && !b) {
                    s2 = zi.x(m76, -379718872, 2131954734, m76);
                }
                else if (fpf.a() && b) {
                    s2 = zi.x(m76, -379718772, 2131954735, m76);
                }
                else if (!b) {
                    s2 = zi.x(m76, -379718673, 2131954732, m76);
                }
                else {
                    s2 = zi.x(m76, -379718588, 2131954733, m76);
                }
            }
            final m76 m77 = h;
            m77.x(1157296644);
            final boolean p6 = m77.P((Object)rtb);
            final Object y = m77.y();
            Object o3 = null;
            Label_0824: {
                if (!p6) {
                    Objects.requireNonNull(m76.Companion);
                    if ((o3 = y) != m76$a.b) {
                        break Label_0824;
                    }
                }
                o3 = new r11$m((rtb)rtb);
                m77.p(o3);
            }
            m77.O();
            zoc.b(o2, e, s2, (k53)k53$a, (Icon)null, (String)null, false, (otb)o3, m77, 4096, 112);
            final vwo w = yk.w(m77);
            if (w != null) {
                w.a((gub)new r11$n(kb2, fpf, b, (rtb)rtb, n));
            }
            return;
        }
        ukg.l0();
        throw null;
    }
    
    public static final void i(jkh companion, vxf q3, AudioSpaceHeroViewModel audioSpaceHeroViewModel, e21 e21, final m76 m76, final int n, final int n2) {
        final m76 h = m76.h(607022279);
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
            n4 = (n | n5);
        }
        else {
            n4 = n;
        }
        final int n6 = n2 & 0x2;
        int n7 = n4;
        if (n6 != 0) {
            n7 = (n4 | 0x10);
        }
        final int n8 = n2 & 0x4;
        int n9 = n7;
        if (n8 != 0) {
            n9 = (n7 | 0x80);
        }
        final int n10 = n2 & 0x8;
        int n11 = n9;
        if (n10 != 0) {
            n11 = (n9 | 0x400);
        }
        jkh jkh;
        vxf vxf2;
        if ((n2 & 0xE) == 0xE && (n11 & 0x16DB) == 0x492 && h.i()) {
            h.H();
            final vxf vxf = q3;
            jkh = companion;
            vxf2 = vxf;
        }
        else {
            h.C();
            e21 e22;
            vxf vxf4;
            AudioSpaceHeroViewModel audioSpaceHeroViewModel3;
            if ((n & 0x1) != 0x0 && !h.K()) {
                h.H();
                final vxf vxf3 = q3;
                final AudioSpaceHeroViewModel audioSpaceHeroViewModel2 = audioSpaceHeroViewModel;
                e22 = e21;
                jkh = companion;
                vxf4 = vxf3;
                audioSpaceHeroViewModel3 = audioSpaceHeroViewModel2;
            }
            else {
                if (n3 != 0) {
                    companion = jkh.Companion;
                }
                if (n6 != 0) {
                    q3 = ((LiveEventLandingViewObjectGraph)j4p.a(h).n()).Q3();
                    zzd.e((Object)q3, "viewObjectGraph<LiveEven\u2026).scrollDockingController");
                }
                if (n8 != 0) {
                    audioSpaceHeroViewModel = (AudioSpaceHeroViewModel)((n8x)h.m((re6)skx.a)).a.c((a9x)new a9x$b(new r8x((Class)AudioSpaceHeroViewModel.class, "")));
                }
                if (n10 != 0) {
                    final e21 k7 = j4p.a(h).z0(b41.class).k7();
                    final jkh jkh2 = companion;
                    final vxf vxf5 = q3;
                    audioSpaceHeroViewModel3 = audioSpaceHeroViewModel;
                    e22 = k7;
                    jkh = jkh2;
                    vxf4 = vxf5;
                }
                else {
                    final jkh jkh3 = companion;
                    audioSpaceHeroViewModel3 = audioSpaceHeroViewModel;
                    e22 = e21;
                    vxf4 = q3;
                    jkh = jkh3;
                }
            }
            h.s();
            final ea6$b a = ea6.a;
            h.x(-2088733469);
            final s11 s11 = new s11((Object)e22);
            h.x(1941511575);
            h.x(-301010798);
            final Object y = af.y(h, 773894976, -492369756);
            Objects.requireNonNull(m76.Companion);
            final m76$a$a b = m76$a.b;
            Object d = y;
            if (y == b) {
                d = rb0.d(jgw.A(h), h);
            }
            h.O();
            final yy6 c0 = ((ue6)d).C0;
            h.O();
            jgw.g((Object)audioSpaceHeroViewModel3, (Object)c0, (gub)new u11((MviViewModel)audioSpaceHeroViewModel3, c0, nkz.v((Object)s11, h), (ap6)null), h);
            h.O();
            h.O();
            h.O();
            final y11 c2 = y11.C0;
            final z11 c3 = z11.C0;
            final a21 c4 = a21.C0;
            final b21 c5 = b21.C0;
            final c21 c6 = c21.C0;
            zzd.f((Object)audioSpaceHeroViewModel3, "<this>");
            zzd.f((Object)c2, "property1");
            zzd.f((Object)c3, "property2");
            zzd.f((Object)c4, "property3");
            zzd.f((Object)c5, "property4");
            zzd.f((Object)c6, "property5");
            h.x(-345127543);
            final zj8 a2 = r19.a;
            final nhg k8 = rhg.a.K0();
            h.x(8066681);
            final q7r z = k3j.z((MviViewModel)audioSpaceHeroViewModel3, (oy6)k8, h, 0);
            h.x(-492369756);
            Object o;
            if ((o = h.y()) == b) {
                o = nkz.k((otb)new jkx(z, (voe)c2, (voe)c3, (voe)c4, (voe)c5, (voe)c6));
                h.p(o);
            }
            h.O();
            final q7r q7r = (q7r)o;
            h.O();
            h.O();
            final sau sau = (sau)q7r.getValue();
            final fpf fpf = (fpf)sau.a;
            final boolean booleanValue = (boolean)sau.b;
            final mdq mdq = (mdq)sau.c;
            final boolean booleanValue2 = (boolean)sau.d;
            final boolean booleanValue3 = (boolean)sau.e;
            jgw.k((otb)new v11(booleanValue2, vxf4), h);
            b(fpf, mdq, booleanValue3, booleanValue, oyz.i(tcq.i(jkh), 1.7777778f), (rtb<? super f21, oyv>)new w11(audioSpaceHeroViewModel3), h, 72, 0);
            final vxf vxf6 = vxf4;
            e21 = e22;
            audioSpaceHeroViewModel = audioSpaceHeroViewModel3;
            vxf2 = vxf6;
        }
        final vwo i = h.k();
        if (i != null) {
            i.a((gub)new x11(jkh, vxf2, audioSpaceHeroViewModel, e21, n, n2));
        }
    }
    
    public static final xis j(final m76 m76) {
        m76.x(1425172484);
        final ea6$b a = ea6.a;
        final xis i = hqc.Companion.a(m76).i;
        Objects.requireNonNull(rlb.Companion);
        final xis a2 = xis.a(i, 0L, 0L, rlb.M0, null, null, null, null, 0L, 262139);
        m76.O();
        return a2;
    }
}
