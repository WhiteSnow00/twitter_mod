import android.content.res.Resources;
import android.content.Context;
import com.twitter.core.ui.styles.icons.implementation.Icon;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w8i
{
    public static final void a(final String s, dlh companion, final d86 d86, final int n, final int n2) {
        e0e.f((Object)s, "trustedFriendsTitle");
        final d86 h = d86.h(1877619399);
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
                companion = (dlh)dlh.Companion;
            }
            final sa6$b a = sa6.a;
            final v0r a2 = v0r.a;
            final dlh j = heq.j(zzz.d0(companion, v0r.f, 0.0f, 0.0f, 0.0f, 14), amz.r(2131166693, h));
            h.x(1157296644);
            final boolean p5 = h.P((Object)s);
            final Object y = h.y();
            Object o = null;
            Label_0280: {
                if (!p5) {
                    Objects.requireNonNull(d86.Companion);
                    if ((o = y) != d86$a.b) {
                        break Label_0280;
                    }
                }
                o = new w8i$a(s);
                h.p(o);
            }
            h.O();
            final dlh w = jty.W(j, false, (stb)o);
            final gs0 a3 = gs0.a;
            final gs0.e f = gs0.f;
            h.x(-483455358);
            Objects.requireNonNull(ex.Companion);
            final zqg a4 = ts4.a((gs0$l)f, (ex$b)ex$a.n, h);
            h.x(-1323940314);
            final rp8 rp8 = (rp8)h.m((df6)ff6.e);
            final cwe cwe = (cwe)h.m((df6)ff6.k);
            final l7x l7x = (l7x)h.m((df6)ff6.o);
            Objects.requireNonNull(w76.Companion);
            final swe$a b = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a5 = lwe.a(w);
            if (!(h.j() instanceof tr0)) {
                kqe.W();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((ptb)b);
            }
            else {
                h.o();
            }
            h.F();
            jty.X(h, a4, (hub)w76.a.e);
            jty.X(h, rp8, (hub)w76.a.d);
            jty.X(h, cwe, (hub)w76.a.f);
            ((z36)a5).h0((Object)af.y(h, l7x, w76.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-1163856341);
            kjs.a(s, (dlh)null, 0L, 0L, (mlb)null, (qlb)null, (qkb)null, 0L, (xfs)null, (efs)null, 0L, 0, false, 0, kqc.Companion.a(h).g, false, h, n6 & 0xE, 0, 49150);
            awg.g(h);
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new w8i$b(s, companion, n, n2));
        }
    }
    
    public static final void b(final r9i.d d, final boolean b, final stb<? super aai, vzv> stb, final ptb<vzv> ptb, dlh companion, final d86 d2, final int n, final int n2) {
        e0e.f((Object)d, "item");
        e0e.f((Object)stb, "onClick");
        e0e.f((Object)ptb, "onEditButtonClick");
        final d86 h = d2.h(872612301);
        if ((n2 & 0x10) != 0x0) {
            companion = (dlh)dlh.Companion;
        }
        final sa6$b a = sa6.a;
        final String r0 = kqe.r0(2131955300, h);
        final dlh.a companion2 = dlh.Companion;
        final dlh b2 = dfp.b(heq.i((dlh)companion2), b, (ptb)new w8i$c((stb)stb, d));
        final v0r a2 = v0r.a;
        final dlh e = zzz.d0(b2, 0.0f, v0r.g, 0.0f, v0r.e, 5).E(companion);
        h.x(693286680);
        final gs0 a3 = gs0.a;
        final gs0$d b3 = (gs0$d)gs0.b;
        Objects.requireNonNull(ex.Companion);
        final zqg a4 = omo.a((gs0$d)b3, (ex$c)ex$a.k, h);
        h.x(-1323940314);
        final rp8 rp8 = (rp8)h.m((df6)ff6.e);
        final cwe cwe = (cwe)h.m((df6)ff6.k);
        final l7x l7x = (l7x)h.m((df6)ff6.o);
        Objects.requireNonNull(w76.Companion);
        final swe$a b4 = w76.a.b;
        final kub<weq<w76>, d86, Integer, vzv> a5 = lwe.a(e);
        if (!(h.j() instanceof tr0)) {
            kqe.W();
            throw null;
        }
        h.E();
        if (h.f()) {
            h.A((ptb)b4);
        }
        else {
            h.o();
        }
        h.F();
        jty.X(h, a4, (hub)w76.a.e);
        jty.X(h, rp8, (hub)w76.a.d);
        jty.X(h, cwe, (hub)w76.a.f);
        ((z36)a5).h0((Object)af.y(h, l7x, w76.a.g, h), (Object)h, (Object)0);
        h.x(2058660585);
        h.x(-678309503);
        e(b, heq.o(zzz.b0((dlh)companion2, 0.0f, 0.0f, 3), amz.r(2131166692, h), amz.r(2131166692, h)), h, n >> 3 & 0xE, 0);
        if (d.a != 0L) {
            h.x(-329238305);
            c(r0, d.b, null, h, 0, 4);
            h.O();
        }
        else {
            h.x(-329238129);
            a(r0, null, h, 0, 2);
            h.O();
        }
        if (1.0f > 0.0) {
            final ysd$a a6 = ysd.a;
            final ysd$a a7 = ysd.a;
            final jxe jxe = new jxe(1.0f, true);
            ((dlh)companion2).E((dlh)jxe);
            kqe.f((dlh)jxe, h, 0);
            if (d.a != 0L) {
                final String r2 = kqe.r0(2131955298, h);
                final y53 y53 = new y53(d63.G0, (h5f)h5f$f.I0);
                final u53$b u53$b = new u53$b(false);
                h.x(1157296644);
                final boolean p8 = h.P((Object)ptb);
                final Object y54 = h.y();
                Object o = null;
                Label_0651: {
                    if (!p8) {
                        Objects.requireNonNull(d86.Companion);
                        if ((o = y54) != d86$a.b) {
                            break Label_0651;
                        }
                    }
                    o = new w8i$d((ptb)ptb);
                    h.p(o);
                }
                h.O();
                cpc.b(y53, (dlh)null, r2, (u53)u53$b, (Icon)null, (String)null, false, (ptb)o, h, 4096, 114);
            }
            final gyo y55 = lr0.y(h);
            if (y55 != null) {
                y55.a((hub)new w8i$e(d, b, (stb)stb, (ptb)ptb, companion, n, n2));
            }
            return;
        }
        throw new IllegalArgumentException(qd.B("invalid weight ", 1.0f, "; must be greater than zero").toString());
    }
    
    public static final void c(final String s, final int n, dlh companion, final d86 d86, final int n2, final int n3) {
        e0e.f((Object)s, "trustedFriendsTitle");
        final d86 h = d86.h(433899557);
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
                companion = (dlh)dlh.Companion;
            }
            final sa6$b a = sa6.a;
            final Resources resources = ((Context)h.m((df6)z20.b)).getResources();
            h.x(1157296644);
            final boolean p6 = h.P((Object)n);
            final Object y = h.y();
            Object h2 = null;
            Label_0343: {
                if (!p6) {
                    Objects.requireNonNull(d86.Companion);
                    if ((h2 = y) != d86$a.b) {
                        break Label_0343;
                    }
                }
                h2 = o2d.h(resources, (long)n, true);
                h.p(h2);
            }
            h.O();
            e0e.e(h2, "remember(peopleCount) {\n\u2026e\n            )\n        }");
            final String d87 = kqe.d0(2131820620, n, new Object[] { h2 }, h);
            final v0r a2 = v0r.a;
            final dlh j = heq.j(zzz.d0(companion, v0r.f, 0.0f, 0.0f, 0.0f, 14), amz.r(2131166693, h));
            h.x(511388516);
            final boolean p7 = h.P((Object)s);
            final boolean p8 = h.P((Object)d87);
            final Object y2 = h.y();
            Object o = null;
            Label_0489: {
                if (!(p7 | p8)) {
                    Objects.requireNonNull(d86.Companion);
                    if ((o = y2) != d86$a.b) {
                        break Label_0489;
                    }
                }
                o = new w8i$f(s, d87);
                h.p(o);
            }
            h.O();
            final dlh w = jty.W(j, false, (stb)o);
            final gs0 a3 = gs0.a;
            final gs0.e f = gs0.f;
            h.x(-483455358);
            Objects.requireNonNull(ex.Companion);
            final zqg a4 = ts4.a((gs0$l)f, (ex$b)ex$a.n, h);
            h.x(-1323940314);
            final gbr e = ff6.e;
            final rp8 rp8 = (rp8)h.m((df6)e);
            final gbr k = ff6.k;
            final cwe cwe = (cwe)h.m((df6)k);
            final gbr o2 = ff6.o;
            final l7x l7x = (l7x)h.m((df6)o2);
            Objects.requireNonNull(w76.Companion);
            final swe$a b = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a5 = lwe.a(w);
            if (!(h.j() instanceof tr0)) {
                kqe.W();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((ptb)b);
            }
            else {
                h.o();
            }
            h.F();
            final w76$a$c e2 = w76.a.e;
            jty.X(h, a4, (hub)e2);
            final w76$a$a d88 = w76.a.d;
            jty.X(h, rp8, (hub)d88);
            final w76$a$b f2 = w76.a.f;
            jty.X(h, cwe, (hub)f2);
            final w76$a$e g = w76.a.g;
            ((z36)a5).h0((Object)af.y(h, l7x, g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-1163856341);
            final kqc$a companion2 = kqc.Companion;
            kjs.a(s, (dlh)null, 0L, 0L, (mlb)null, (qlb)null, (qkb)null, 0L, (xfs)null, (efs)null, 0L, 0, false, 0, companion2.a(h).g, false, h, n9 & 0xE, 0, 49150);
            w0r.e(h, 0);
            h.x(693286680);
            final dlh.a companion3 = dlh.Companion;
            final zqg a6 = omo.a((gs0$d)gs0.b, (ex$c)ex$a.k, h);
            h.x(-1323940314);
            final rp8 rp9 = (rp8)h.m((df6)e);
            final cwe cwe2 = (cwe)h.m((df6)k);
            final l7x l7x2 = (l7x)h.m((df6)o2);
            final kub<weq<w76>, d86, Integer, vzv> a7 = lwe.a((dlh)companion3);
            if (!(h.j() instanceof tr0)) {
                kqe.W();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((ptb)b);
            }
            else {
                h.o();
            }
            ((z36)a7).h0((Object)mw.y(h, h, a6, e2, h, rp9, d88, h, cwe2, f2, h, l7x2, g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-678309503);
            kjs.a(d87, (dlh)null, ((dqc)h.m((df6)iqc.a)).j(), 0L, (mlb)null, (qlb)null, (qkb)null, 0L, (xfs)null, (efs)null, 0L, 0, false, 0, companion2.a(h).j, false, h, 0, 0, 49146);
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
        }
        final gyo i = h.k();
        if (i != null) {
            i.a((hub)new w8i$g(s, n, companion, n2, n3));
        }
    }
    
    public static final void d(dlh companion, d86 h, final int n, final int n2) {
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
                companion = (dlh)dlh.Companion;
            }
            final sa6$b a = sa6.a;
            final int n7 = n5 & 0xE;
            h.x(733328855);
            Objects.requireNonNull(ex.Companion);
            final zqg d = ob2.d((ex)ex$a.b, false, h);
            h.x(-1323940314);
            final rp8 rp8 = (rp8)h.m((df6)ff6.e);
            final cwe cwe = (cwe)h.m((df6)ff6.k);
            final l7x l7x = (l7x)h.m((df6)ff6.o);
            Objects.requireNonNull(w76.Companion);
            final swe$a b = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a2 = lwe.a(companion);
            final int n8 = ((n7 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
            if (!(h.j() instanceof tr0)) {
                kqe.W();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((ptb)b);
            }
            else {
                h.o();
            }
            h.F();
            jty.X(h, d, (hub)w76.a.e);
            jty.X(h, rp8, (hub)w76.a.d);
            jty.X(h, cwe, (hub)w76.a.f);
            ((z36)a2).h0((Object)af.y(h, l7x, w76.a.g, h), (Object)h, (Object)(n8 >> 3 & 0x70));
            h.x(2058660585);
            h.x(-2137368960);
            if ((n8 >> 9 & 0xE & 0xB) == 0x2 && h.i()) {
                h.H();
            }
            else {
                final bs4 k0 = bs4.K0;
                int n10;
                final int n9 = n10 = ((n7 >> 6 & 0x70) | 0x6);
                if ((n9 & 0xE) == 0x0) {
                    int n11;
                    if (h.P((Object)k0)) {
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
                    final dlh.a companion2 = dlh.Companion;
                    final epc a3 = epc.a;
                    ob2.a(k0.V(p4j.k((dlh)companion2, epc.H)), h, 0);
                    s7d.a(zzz.e0(jpc.X0.getDrawableRes(), h), (String)null, k0.e((dlh)companion2, (ex)ex$a.f), (ex)null, (kn6)null, 0.0f, vr4$a.b(vr4.Companion, epc.B1), h, 56, 56);
                }
            }
            awg.g(h);
        }
        final gyo i = h.k();
        if (i != null) {
            i.a((hub)new w8i$h(companion, n, n2));
        }
    }
    
    public static final void e(final boolean b, dlh companion, d86 h, final int n, final int n2) {
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
                companion = (dlh)dlh.Companion;
            }
            final sa6$b a = sa6.a;
            final int n8 = n6 >> 3 & 0xE;
            h.x(733328855);
            Objects.requireNonNull(ex.Companion);
            final zqg d = ob2.d((ex)ex$a.b, false, h);
            h.x(-1323940314);
            final gbr e = ff6.e;
            final rp8 rp8 = (rp8)h.m((df6)e);
            final gbr k = ff6.k;
            final cwe cwe = (cwe)h.m((df6)k);
            final gbr o = ff6.o;
            final l7x l7x = (l7x)h.m((df6)o);
            Objects.requireNonNull(w76.Companion);
            final swe$a b2 = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a2 = lwe.a(companion);
            final int n9 = ((n8 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
            if (!(h.j() instanceof tr0)) {
                kqe.W();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((ptb)b2);
            }
            else {
                h.o();
            }
            h.F();
            final w76$a$c e2 = w76.a.e;
            jty.X(h, d, (hub)e2);
            final w76$a$a d2 = w76.a.d;
            jty.X(h, rp8, (hub)d2);
            final w76$a$b f = w76.a.f;
            jty.X(h, cwe, (hub)f);
            final w76$a$e g = w76.a.g;
            ((z36)a2).h0((Object)af.y(h, l7x, g, h), (Object)h, (Object)(n9 >> 3 & 0x70));
            h.x(2058660585);
            h.x(-2137368960);
            final int n10 = 2;
            if ((n9 >> 9 & 0xE & 0xB) == 0x2 && h.i()) {
                h.H();
            }
            else {
                final bs4 k2 = bs4.K0;
                int n12;
                final int n11 = n12 = ((n8 >> 6 & 0x70) | 0x6);
                if ((n11 & 0xE) == 0x0) {
                    int n13 = n10;
                    if (h.P((Object)k2)) {
                        n13 = 4;
                    }
                    n12 = (n11 | n13);
                }
                if ((n12 & 0x5B) == 0x12 && h.i()) {
                    h.H();
                }
                else {
                    h.x(-483455358);
                    final dlh.a companion2 = dlh.Companion;
                    final gs0 a3 = gs0.a;
                    final zqg a4 = ts4.a((gs0$l)gs0.d, (ex$b)ex$a.n, h);
                    h.x(-1323940314);
                    final rp8 rp9 = (rp8)h.m((df6)e);
                    final cwe cwe2 = (cwe)h.m((df6)k);
                    final l7x l7x2 = (l7x)h.m((df6)o);
                    final kub<weq<w76>, d86, Integer, vzv> a5 = lwe.a((dlh)companion2);
                    if (!(h.j() instanceof tr0)) {
                        kqe.W();
                        throw null;
                    }
                    h.E();
                    if (h.f()) {
                        h.A((ptb)b2);
                    }
                    else {
                        h.o();
                    }
                    ((z36)a5).h0((Object)mw.y(h, h, a4, e2, h, rp9, d2, h, cwe2, f, h, l7x2, g, h), (Object)h, (Object)0);
                    h.x(2058660585);
                    h.x(-1163856341);
                    final dlh o2 = heq.o((dlh)companion2, amz.r(2131166693, h), amz.r(2131166693, h));
                    final float n14 = 12;
                    d(iuk.I(o2, (asp)ylo.d(n14, n14, n14, n14)), h, 0, 0);
                    w0r.l(h, 0);
                    h.O();
                    h.O();
                    h.r();
                    h.O();
                    h.O();
                    if (b) {
                        l7i.a(k2.e((dlh)companion2, (ex)ex$a.j), h, 0, 0);
                    }
                }
            }
            awg.g(h);
        }
        final gyo i = h.k();
        if (i != null) {
            i.a((hub)new w8i$i(b, companion, n, n2));
        }
    }
}
