import android.content.res.Resources;
import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t6i
{
    public static final void a(final String s, final long n, okh companion, final x66 x66, final int n2, final int n3) {
        czd.f((Object)s, "name");
        final x66 h = x66.h(1939682524);
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
                if (h.e(n)) {
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
                companion = (okh)okh.Companion;
            }
            final n96$b a = n96.a;
            final Resources resources = ((Context)h.m((wd6)z20.b)).getResources();
            final int n11 = (int)n;
            h.x(1157296644);
            final boolean p6 = h.P((Object)n);
            final Object y = h.y();
            Object h2 = null;
            Label_0350: {
                if (!p6) {
                    Objects.requireNonNull(x66.Companion);
                    if ((h2 = y) != x66$a.b) {
                        break Label_0350;
                    }
                }
                h2 = o1d.h(resources, n, true);
                h.p(h2);
            }
            h.O();
            czd.e(h2, "remember(memberCount) {\n\u2026e\n            )\n        }");
            final String v = wd.v(2131820619, n11, new Object[] { h2 }, h);
            final yzq a2 = yzq.a;
            final okh j = kdq.j(nza.G1(companion, yzq.f, 0.0f, 0.0f, 0.0f, 14), xli.E(2131166693, h));
            h.x(511388516);
            final boolean p7 = h.P((Object)s);
            final boolean p8 = h.P((Object)v);
            final Object y2 = h.y();
            Object o = null;
            Label_0500: {
                if (!(p7 | p8)) {
                    Objects.requireNonNull(x66.Companion);
                    if ((o = y2) != x66$a.b) {
                        break Label_0500;
                    }
                }
                o = new t6i$a(s, v);
                h.p(o);
            }
            h.O();
            final okh n12 = oj7.n(j, false, (qsb)o);
            final ds0 a3 = ds0.a;
            final ds0$b f = ds0.f;
            h.x(-483455358);
            Objects.requireNonNull(ex.Companion);
            final fqg a4 = nr4.a((ds0.l)f, (ex.b)ex.a.n, h);
            h.x(-1323940314);
            final lo8 lo8 = (lo8)h.m((wd6)yd6.e);
            final fve fve = (fve)h.m((wd6)yd6.k);
            final t6x t6x = (t6x)h.m((wd6)yd6.o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b = q66.a.b;
            final itb a5 = ove.a(n12);
            if (!(h.j() instanceof qr0)) {
                wd.t();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((nsb)b);
            }
            else {
                h.o();
            }
            h.F();
            mru.p(h, (Object)a4, (ftb)q66.a.e);
            mru.p(h, (Object)lo8, (ftb)q66.a.d);
            mru.p(h, (Object)fve, (ftb)q66.a.f);
            ((t26)a5).h0((Object)g4k.C(h, t6x, q66.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-1163856341);
            final kpc$a companion2 = kpc.Companion;
            sis.a(s, (okh)null, 0L, 0L, (lkb)null, (pkb)null, (pjb)null, 0L, (ffs)null, (mes)null, 0L, 0, false, 0, companion2.a(h).g, false, h, n9 & 0xE, 0, 49150);
            zzq.e(h, 0);
            sis.a(v, (okh)null, ((dpc)h.m((wd6)ipc.a)).j(), 0L, (lkb)null, (pkb)null, (pjb)null, 0L, (ffs)null, (mes)null, 0L, 0, false, 0, companion2.a(h).i, false, h, 0, 0, 49146);
            c0.D(h);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new t6i$b(s, n, companion, n2, n3));
        }
    }
    
    public static final void b(final String s, okh companion, x66 h, final int n, final int n2) {
        h = h.h(1923667816);
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
                companion = (okh)okh.Companion;
            }
            final n96$b a = n96.a;
            final int n8 = n6 >> 3 & 0xE;
            h.x(733328855);
            Objects.requireNonNull(ex.Companion);
            final bw1 b = ex.a.b;
            boolean b2 = false;
            final fqg d = bb2.d((ex)b, false, h);
            h.x(-1323940314);
            final lo8 lo8 = (lo8)h.m((wd6)yd6.e);
            final fve fve = (fve)h.m((wd6)yd6.k);
            final t6x t6x = (t6x)h.m((wd6)yd6.o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b3 = q66.a.b;
            final itb a2 = ove.a(companion);
            final int n9 = ((n8 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
            if (!(h.j() instanceof qr0)) {
                wd.t();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((nsb)b3);
            }
            else {
                h.o();
            }
            h.F();
            mru.p(h, (Object)d, (ftb)q66.a.e);
            mru.p(h, (Object)lo8, (ftb)q66.a.d);
            mru.p(h, (Object)fve, (ftb)q66.a.f);
            ((t26)a2).h0((Object)g4k.C(h, t6x, q66.a.g, h), (Object)h, (Object)(n9 >> 3 & 0x70));
            h.x(2058660585);
            h.x(-2137368960);
            if ((n9 >> 9 & 0xE & 0xB) == 0x2 && h.i()) {
                h.H();
            }
            else if ((((n8 >> 6 & 0x70) | 0x6) & 0x51) == 0x10 && h.i()) {
                h.H();
            }
            else {
                if (s == null || vkr.V((CharSequence)s)) {
                    b2 = true;
                }
                if (!b2) {
                    acv.d(s, kdq.o((okh)okh.Companion, xli.E(2131166693, h), xli.E(2131166693, h)), (String)null, (k6w)hmg.b().e2().a(), (ftb)t6i$c.D0, (ex)null, (em6)null, 0.0f, (qq4)null, false, false, (hvj)null, (qsb)null, (iqb)null, (itb)null, (itb)null, h, (n6 & 0xE) | 0x7000, 0, 65508);
                }
            }
            c0.D(h);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new t6i$d(s, companion, n, n2));
        }
    }
    
    public static final void c(final boolean b, final String s, okh companion, x66 h, final int n, final int n2) {
        h = h.h(1242749791);
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
        int n5;
        if ((n2 & 0x2) != 0x0) {
            n5 = (n3 | 0x30);
        }
        else {
            n5 = n3;
            if ((n & 0x70) == 0x0) {
                int n6;
                if (h.P((Object)s)) {
                    n6 = 32;
                }
                else {
                    n6 = 16;
                }
                n5 = (n3 | n6);
            }
        }
        final int n7 = n2 & 0x4;
        int n8;
        if (n7 != 0) {
            n8 = (n5 | 0x180);
        }
        else {
            n8 = n5;
            if ((n & 0x380) == 0x0) {
                int n9;
                if (h.P((Object)companion)) {
                    n9 = 256;
                }
                else {
                    n9 = 128;
                }
                n8 = (n5 | n9);
            }
        }
        if ((n8 & 0x2DB) == 0x92 && h.i()) {
            h.H();
        }
        else {
            if (n7 != 0) {
                companion = (okh)okh.Companion;
            }
            final n96$b a = n96.a;
            final int n10 = n8 >> 6 & 0xE;
            h.x(733328855);
            Objects.requireNonNull(ex.Companion);
            final fqg d = bb2.d((ex)ex.a.b, false, h);
            h.x(-1323940314);
            final iar e = yd6.e;
            final lo8 lo8 = (lo8)h.m((wd6)e);
            final iar k = yd6.k;
            final fve fve = (fve)h.m((wd6)k);
            final iar o = yd6.o;
            final t6x t6x = (t6x)h.m((wd6)o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b2 = q66.a.b;
            final itb a2 = ove.a(companion);
            final int n11 = ((n10 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
            if (!(h.j() instanceof qr0)) {
                wd.t();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((nsb)b2);
            }
            else {
                h.o();
            }
            h.F();
            final q66$a$c e2 = q66.a.e;
            mru.p(h, (Object)d, (ftb)e2);
            final q66$a$a d2 = q66.a.d;
            mru.p(h, (Object)lo8, (ftb)d2);
            final q66$a$b f = q66.a.f;
            mru.p(h, (Object)fve, (ftb)f);
            final q66$a$e g = q66.a.g;
            ((t26)a2).h0((Object)g4k.C(h, t6x, g, h), (Object)h, (Object)(n11 >> 3 & 0x70));
            h.x(2058660585);
            h.x(-2137368960);
            final int n12 = 2;
            if ((n11 >> 9 & 0xE & 0xB) == 0x2 && h.i()) {
                h.H();
            }
            else {
                final rp9 d3 = rp9.D0;
                int n14;
                final int n13 = n14 = ((n10 >> 6 & 0x70) | 0x6);
                if ((n13 & 0xE) == 0x0) {
                    int n15 = n12;
                    if (h.P((Object)d3)) {
                        n15 = 4;
                    }
                    n14 = (n13 | n15);
                }
                if ((n14 & 0x5B) == 0x12 && h.i()) {
                    h.H();
                }
                else {
                    h.x(-483455358);
                    final okh$a companion2 = okh.Companion;
                    final ds0 a3 = ds0.a;
                    final fqg a4 = nr4.a((ds0.l)ds0.d, (ex.b)ex.a.n, h);
                    h.x(-1323940314);
                    final lo8 lo9 = (lo8)h.m((wd6)e);
                    final fve fve2 = (fve)h.m((wd6)k);
                    final t6x t6x2 = (t6x)h.m((wd6)o);
                    final itb a5 = ove.a((okh)companion2);
                    if (!(h.j() instanceof qr0)) {
                        wd.t();
                        throw null;
                    }
                    h.E();
                    if (h.f()) {
                        h.A((nsb)b2);
                    }
                    else {
                        h.o();
                    }
                    ((t26)a5).h0((Object)mw.x(h, h, a4, e2, h, lo9, d2, h, fve2, f, h, t6x2, g, h), (Object)h, (Object)0);
                    h.x(2058660585);
                    h.x(-1163856341);
                    final okh o2 = kdq.o((okh)companion2, xli.E(2131166693, h), xli.E(2131166693, h));
                    final float n16 = 12;
                    b(s, rrz.l(o2, (frp)elo.d(n16, n16, n16, n16)), h, n8 >> 3 & 0xE, 0);
                    zzq.l(h, 0);
                    h.O();
                    h.O();
                    h.r();
                    h.O();
                    h.O();
                    if (b) {
                        s6i.a(d3.m((okh)companion2, ex.a.j), h, 0, 0);
                    }
                }
            }
            c0.D(h);
        }
        final lxo i = h.k();
        if (i != null) {
            i.a((ftb)new t6i$e(b, s, companion, n, n2));
        }
    }
    
    public static final void d(final y8i$a y8i$a, final boolean b, okh companion, final qsb<? super h9i, fzv> qsb, x66 h, final int n, final int n2) {
        czd.f((Object)y8i$a, "item");
        czd.f((Object)qsb, "onClick");
        h = h.h(-87058632);
        if ((n2 & 0x4) != 0x0) {
            companion = (okh)okh.Companion;
        }
        final n96$b a = n96.a;
        final okh$a companion2 = okh.Companion;
        final okh b2 = gep.b(kdq.i((okh)companion2), b, (nsb)new t6i$f((qsb)qsb, y8i$a));
        final yzq a2 = yzq.a;
        final okh e = nza.E1(b2, 0.0f, yzq.g, 1).E(companion);
        h.x(693286680);
        final ds0 a3 = ds0.a;
        final ds0$j b3 = ds0.b;
        Objects.requireNonNull(ex.Companion);
        final fqg a4 = ulo.a((ds0.d)b3, ex.a.k, h);
        h.x(-1323940314);
        final lo8 lo8 = (lo8)h.m((wd6)yd6.e);
        final fve fve = (fve)h.m((wd6)yd6.k);
        final t6x t6x = (t6x)h.m((wd6)yd6.o);
        Objects.requireNonNull(q66.Companion);
        final vve$a b4 = q66.a.b;
        final itb a5 = ove.a(e);
        if (h.j() instanceof qr0) {
            h.E();
            if (h.f()) {
                h.A((nsb)b4);
            }
            else {
                h.o();
            }
            h.F();
            mru.p(h, (Object)a4, (ftb)q66.a.e);
            mru.p(h, (Object)lo8, (ftb)q66.a.d);
            mru.p(h, (Object)fve, (ftb)q66.a.f);
            ((t26)a5).h0((Object)g4k.C(h, t6x, q66.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-678309503);
            c(b, y8i$a.e, kdq.o((okh)companion2, xli.E(2131166692, h), xli.E(2131166692, h)), h, n >> 3 & 0xE, 0);
            a(y8i$a.a, y8i$a.b, null, h, 0, 4);
            final lxo y = wk0.y(h);
            if (y != null) {
                y.a((ftb)new t6i$g(y8i$a, b, companion, (qsb)qsb, n, n2));
            }
            return;
        }
        wd.t();
        throw null;
    }
    
    public static final void e(okh companion, x66 h, final int n, final int n2) {
        h = h.h(1653151518);
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
                companion = (okh)okh.Companion;
            }
            final n96$b a = n96.a;
            final String a2 = wd.A(2131955296, h);
            final sjs a3 = sjs.a(kpc.Companion.a(h).h, 0L, fli.b0(15), (pkb)null, (pjb)null, (ffs)null, (mes)null, (jfs)null, 0L, 262141);
            Objects.requireNonNull(pkb.Companion);
            sis.a(a2, oj7.n(companion, false, (qsb)y6i.D0), 0L, 0L, (lkb)null, pkb.N0, (pjb)null, 0L, (ffs)null, (mes)null, 0L, 0, false, 0, a3, false, h, 196608, 0, 49116);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new z6i(companion, n, n2));
        }
    }
}
