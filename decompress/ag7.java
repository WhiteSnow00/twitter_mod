import java.util.Collection;
import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ag7
{
    public static final okh a;
    
    static {
        a = rrz.l((okh)okh.Companion, (frp)elo.a);
    }
    
    public static final void a(final String s, final ae1 ae1, final nsb<fzv> nsb, okh companion, String s2, final x66 x66, final int n, final int n2) {
        czd.f((Object)s, "customAvatarUrl");
        czd.f((Object)ae1, "avatarSize");
        czd.f((Object)nsb, "onClick");
        final x66 h = x66.h(-2132891283);
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
        int n5;
        if ((n2 & 0x2) != 0x0) {
            n5 = (n3 | 0x30);
        }
        else {
            n5 = n3;
            if ((n & 0x70) == 0x0) {
                int n6;
                if (h.P((Object)ae1)) {
                    n6 = 32;
                }
                else {
                    n6 = 16;
                }
                n5 = (n3 | n6);
            }
        }
        int n7;
        if ((n2 & 0x4) != 0x0) {
            n7 = (n5 | 0x180);
        }
        else {
            n7 = n5;
            if ((n & 0x380) == 0x0) {
                int n8;
                if (h.P((Object)nsb)) {
                    n8 = 256;
                }
                else {
                    n8 = 128;
                }
                n7 = (n5 | n8);
            }
        }
        final int n9 = n2 & 0x8;
        int n12 = 0;
        Label_0282: {
            int n10;
            if (n9 != 0) {
                n10 = (n7 | 0xC00);
            }
            else {
                n10 = n7;
                if ((n & 0x1C00) == 0x0) {
                    int n11;
                    if (h.P((Object)companion)) {
                        n11 = 2048;
                    }
                    else {
                        n11 = 1024;
                    }
                    n12 = (n7 | n11);
                    break Label_0282;
                }
            }
            n12 = n10;
        }
        final int n13 = n2 & 0x10;
        int n14;
        if (n13 != 0) {
            n14 = (n12 | 0x6000);
        }
        else {
            n14 = n12;
            if ((n & 0xE000) == 0x0) {
                int n15;
                if (h.P((Object)s2)) {
                    n15 = 16384;
                }
                else {
                    n15 = 8192;
                }
                n14 = (n12 | n15);
            }
        }
        if ((0xB6DB & n14) == 0x2492 && h.i()) {
            h.H();
        }
        else {
            if (n9 != 0) {
                companion = (okh)okh.Companion;
            }
            if (n13 != 0) {
                s2 = null;
            }
            final n96$b a = n96.a;
            h.x(-492369756);
            final Object y = h.y();
            Objects.requireNonNull(x66.Companion);
            Object f;
            if ((f = y) == x66$a.b) {
                f = h91.f(h);
            }
            h.O();
            final sth sth = (sth)f;
            mcw.c(s, s2, jes.a(ld4.c(companion, sth, (ikd)null, false, (String)null, (d0n)null, (nsb)nsb, 28), "Custom image tag"), (fud)sth, ae1, (frp)null, 0.0f, (qq4)null, (qsb)null, (iqb)null, (itb)null, (itb)null, h, (n14 & 0xE) | 0xC00 | (n14 >> 9 & 0x70) | 0x0 | (n14 << 9 & 0xE000), 0, 4064);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ag7$a(s, ae1, (nsb)nsb, companion, s2, n, n2));
        }
    }
    
    public static final void b(final ae1 ae1, okh companion, x66 h, final int n, final int n2) {
        czd.f((Object)ae1, "avatarSize");
        h = h.h(88045827);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)ae1)) {
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
            Objects.requireNonNull(ex.Companion);
            final bw1 f = ex.a.f;
            final okh m = kdq.m(companion.E(ag7.a), ae1.a());
            h.x(733328855);
            final fqg d = bb2.d((ex)f, false, h);
            h.x(-1323940314);
            final lo8 lo8 = (lo8)h.m((wd6)yd6.e);
            final fve fve = (fve)h.m((wd6)yd6.k);
            final t6x t6x = (t6x)h.m((wd6)yd6.o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b = q66.a.b;
            final itb a2 = ove.a(m);
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
            mru.p(h, (Object)d, (ftb)q66.a.e);
            mru.p(h, (Object)lo8, (ftb)q66.a.d);
            mru.p(h, (Object)fve, (ftb)q66.a.f);
            ((t26)a2).h0((Object)g4k.C(h, t6x, q66.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            mcw.d((okh)null, 0L, h, 0, 3);
            c0.D(h);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ag7$b(ae1, companion, n, n2));
        }
    }
    
    public static final void c(final int n, final ae1 ae1, final nsb<fzv> nsb, okh companion, final ftb<? super x66, ? super Integer, fzv> ftb, x66 h, final int n2, final int n3) {
        czd.f((Object)ae1, "avatarSize");
        czd.f((Object)nsb, "onClick");
        czd.f((Object)ftb, "AvatarContent");
        h = h.h(-645734258);
        int n4;
        if ((n3 & 0x1) != 0x0) {
            n4 = (n2 | 0x6);
        }
        else if ((n2 & 0xE) == 0x0) {
            int n5;
            if (h.d(n)) {
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
                if (h.P((Object)ae1)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        int n8;
        if ((n3 & 0x4) != 0x0) {
            n8 = (n6 | 0x180);
        }
        else {
            n8 = n6;
            if ((n2 & 0x380) == 0x0) {
                int n9;
                if (h.P((Object)nsb)) {
                    n9 = 256;
                }
                else {
                    n9 = 128;
                }
                n8 = (n6 | n9);
            }
        }
        final int n10 = n3 & 0x8;
        int n13 = 0;
        Label_0285: {
            int n11;
            if (n10 != 0) {
                n11 = (n8 | 0xC00);
            }
            else {
                n11 = n8;
                if ((n2 & 0x1C00) == 0x0) {
                    int n12;
                    if (h.P((Object)companion)) {
                        n12 = 2048;
                    }
                    else {
                        n12 = 1024;
                    }
                    n13 = (n8 | n12);
                    break Label_0285;
                }
            }
            n13 = n11;
        }
        int n14;
        if ((n3 & 0x10) != 0x0) {
            n14 = (n13 | 0x6000);
        }
        else {
            n14 = n13;
            if ((0xE000 & n2) == 0x0) {
                int n15;
                if (h.P((Object)ftb)) {
                    n15 = 16384;
                }
                else {
                    n15 = 8192;
                }
                n14 = (n13 | n15);
            }
        }
        if ((n14 & 0xB6DB) == 0x2492 && h.i()) {
            h.H();
        }
        else {
            if (n10 != 0) {
                companion = (okh)okh.Companion;
            }
            final n96$b a = n96.a;
            Objects.requireNonNull(ex.Companion);
            final bw1 j = ex.a.j;
            final okh m = kdq.m(ld4.d(companion, false, (String)null, (d0n)null, (nsb)nsb, 7), ae1.a());
            h.x(733328855);
            final fqg d = bb2.d((ex)j, false, h);
            h.x(-1323940314);
            final iar e = yd6.e;
            final lo8 lo8 = (lo8)h.m((wd6)e);
            final iar k = yd6.k;
            final fve fve = (fve)h.m((wd6)k);
            final iar o = yd6.o;
            final t6x t6x = (t6x)h.m((wd6)o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b = q66.a.b;
            final itb a2 = ove.a(m);
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
            final q66$a$c e2 = q66.a.e;
            mru.p(h, (Object)d, (ftb)e2);
            final q66$a$a d2 = q66.a.d;
            mru.p(h, (Object)lo8, (ftb)d2);
            final q66$a$b f = q66.a.f;
            mru.p(h, (Object)fve, (ftb)f);
            final q66$a$e g = q66.a.g;
            ((t26)a2).h0((Object)g4k.C(h, t6x, g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            final okh e3 = kdq.g((okh)okh.Companion).E(ag7.a);
            h.x(733328855);
            final fqg d3 = bb2.d((ex)ex.a.b, false, h);
            h.x(-1323940314);
            final lo8 lo9 = (lo8)h.m((wd6)e);
            final fve fve2 = (fve)h.m((wd6)k);
            final t6x t6x2 = (t6x)h.m((wd6)o);
            final itb a3 = ove.a(e3);
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
            ((t26)a3).h0((Object)mw.x(h, h, d3, e2, h, lo9, d2, h, fve2, f, h, t6x2, g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            ftb.invoke((Object)h, (Object)(n14 >> 12 & 0xE));
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
            i(n, null, h, n14 & 0xE, 2);
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
        }
        final lxo i = h.k();
        if (i != null) {
            i.a((ftb)new ag7$c(n, ae1, (nsb)nsb, companion, (ftb)ftb, n2, n3));
        }
    }
    
    public static final void d(final hdd<? extends cgv> hdd, final int n, final ae1 ae1, final nsb<fzv> nsb, okh companion, String s, final x66 x66, final int n2, final int n3) {
        czd.f((Object)hdd, "users");
        czd.f((Object)ae1, "avatarSize");
        czd.f((Object)nsb, "onClick");
        final x66 h = x66.h(-1864018820);
        if ((n3 & 0x10) != 0x0) {
            companion = (okh)okh.Companion;
        }
        if ((n3 & 0x20) != 0x0) {
            s = null;
        }
        final n96$b a = n96.a;
        final okh d = ld4.d(kdq.g(companion), false, (String)null, (d0n)null, (nsb)nsb, 7);
        h.x(1157296644);
        final boolean p9 = h.P((Object)s);
        final Object y = h.y();
        Object o = null;
        Label_0156: {
            if (!p9) {
                Objects.requireNonNull(x66.Companion);
                if ((o = y) != x66$a.b) {
                    break Label_0156;
                }
            }
            o = new ag7$d(s);
            h.p(o);
        }
        h.O();
        final okh a2 = jes.a(oj7.n(d, false, (qsb)o), "Group image tag");
        h.x(693286680);
        final ds0 a3 = ds0.a;
        final ds0$j b = ds0.b;
        Objects.requireNonNull(ex.Companion);
        final fqg a4 = ulo.a((ds0.d)b, ex.a.k, h);
        h.x(-1323940314);
        final lo8 lo8 = (lo8)h.m((wd6)yd6.e);
        final fve fve = (fve)h.m((wd6)yd6.k);
        final t6x t6x = (t6x)h.m((wd6)yd6.o);
        Objects.requireNonNull(q66.Companion);
        final vve$a b2 = q66.a.b;
        final itb a5 = ove.a(a2);
        if (h.j() instanceof qr0) {
            h.E();
            if (h.f()) {
                h.A((nsb)b2);
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
            final xlo a6 = xlo.a;
            if (n > 2) {
                h.x(-206806668);
                String e0;
                if ((e0 = ((List<cgv>)hdd).get(1).E0) == null) {
                    e0 = "";
                }
                String e2 = ((List<cgv>)hdd).get(2).E0;
                if (e2 == null) {
                    e2 = "";
                }
                final okh a7 = a6.a((okh)okh.Companion, 0.5f, true);
                final yzq a8 = yzq.a;
                h(e0, e2, ae1, nza.G1(a7, 0.0f, 0.0f, yzq.b, 0.0f, 11), h, (n2 & 0x380) | 0x0, 0);
                h.O();
            }
            else if (n == 2) {
                h.x(-206806257);
                String e3;
                if ((e3 = ((List<cgv>)hdd).get(1).E0) == null) {
                    e3 = "";
                }
                final okh a9 = a6.a((okh)okh.Companion, 0.5f, true);
                final yzq a10 = yzq.a;
                g(e3, ae1, nza.G1(a9, 0.0f, 0.0f, yzq.b, 0.0f, 11), h, (n2 >> 3 & 0x70) | 0x0, 0);
                h.O();
            }
            else {
                h.x(-206805962);
                h.O();
            }
            if (n > 1) {
                h.x(-206805926);
                String e4;
                if ((e4 = ((List<cgv>)hdd).get(0).E0) == null) {
                    e4 = "";
                }
                final okh a11 = a6.a((okh)okh.Companion, 0.5f, true);
                final yzq a12 = yzq.a;
                g(e4, ae1, nza.G1(a11, yzq.b, 0.0f, 0.0f, 0.0f, 14), h, (n2 >> 3 & 0x70) | 0x0, 0);
                h.O();
            }
            else if (true ^ ((Collection)hdd).isEmpty()) {
                h.x(-206805599);
                String e5;
                if ((e5 = ((List<cgv>)hdd).get(0).E0) == null) {
                    e5 = "";
                }
                g(e5, ae1, kdq.g((okh)okh.Companion), h, (n2 >> 3 & 0x70) | 0x180, 0);
                h.O();
            }
            else {
                h.x(-206805300);
                h.O();
            }
            final lxo y2 = wk0.y(h);
            if (y2 != null) {
                y2.a((ftb)new ag7$e((hdd)hdd, n, ae1, (nsb)nsb, companion, s, n2, n3));
            }
            return;
        }
        wd.t();
        throw null;
    }
    
    public static final void e(final hdd<? extends cgv> hdd, final int n, final boolean b, final String s, final nsb<fzv> nsb, okh companion, ae1 b2, String s2, x66 h, final int n2, final int n3) {
        czd.f((Object)hdd, "users");
        czd.f((Object)nsb, "onClick");
        h = h.h(-1879153610);
        if ((n3 & 0x20) != 0x0) {
            companion = (okh)okh.Companion;
        }
        int n4;
        if ((n3 & 0x40) != 0x0) {
            b2 = (ae1)ae1$b.b;
            n4 = (n2 & 0xFFC7FFFF);
        }
        else {
            n4 = n2;
        }
        if ((n3 & 0x80) != 0x0) {
            s2 = null;
        }
        final n96$b a = n96.a;
        if (b) {
            h.x(1727700112);
            final s26 g = io7.g(h, -266941523, (Object)new ag7$f(s, b2, (nsb)nsb, s2, n4, (hdd)hdd, n));
            final int n5 = n4 >> 6;
            c(n, b2, nsb, companion, (ftb<? super x66, ? super Integer, fzv>)g, h, (n4 >> 3 & 0xE) | 0x6000 | 0x0 | (n4 >> 15 & 0x70) | (n5 & 0x380) | (n5 & 0x1C00), 0);
            h.O();
        }
        else {
            h.x(1727700969);
            final cgv cgv = (cgv)fq4.q((List)hdd);
            final int n6 = n4 >> 6;
            f(cgv, b2, nsb, companion, null, h, (n4 >> 15 & 0x70) | 0x8 | (n6 & 0x380) | (n6 & 0x1C00), 16);
            h.O();
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ag7$g((hdd)hdd, n, b, s, (nsb)nsb, companion, b2, s2, n2, n3));
        }
    }
    
    public static final void f(final cgv cgv, final ae1 ae1, final nsb<fzv> nsb, okh companion, String s, final x66 x66, final int n, final int n2) {
        czd.f((Object)ae1, "avatarSize");
        czd.f((Object)nsb, "onClick");
        final x66 h = x66.h(410826396);
        if ((n2 & 0x8) != 0x0) {
            companion = (okh)okh.Companion;
        }
        if ((n2 & 0x10) != 0x0) {
            s = null;
        }
        final n96$b a = n96.a;
        h.x(-492369756);
        final Object y = h.y();
        Objects.requireNonNull(x66.Companion);
        Object f;
        if ((f = y) == x66$a.b) {
            f = h91.f(h);
        }
        h.O();
        final sth sth = (sth)f;
        if (cgv != null) {
            h.x(1731915760);
            mcw.b(cgv, jes.a(ld4.c(companion, sth, (ikd)null, false, (String)null, (d0n)null, (nsb)nsb, 28), "User image tag"), (fud)sth, s, ae1, (frp)null, 0.0f, (qq4)null, (qsb)null, (iqb)null, (itb)null, (itb)null, h, 0x0 | ((n >> 3 & 0x1C00) | 0x188) | (0xE000 & n << 9), 0, 4064);
            h.O();
        }
        else {
            h.x(1731916237);
            b(ae1, companion, h, (n >> 3 & 0xE) | 0x0 | (n >> 6 & 0x70), 0);
            h.O();
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ag7$h(cgv, ae1, (nsb)nsb, companion, s, n, n2));
        }
    }
    
    public static final void g(final String s, final ae1 ae1, okh companion, final x66 x66, final int n, final int n2) {
        czd.f((Object)s, "userProfileImageUrl");
        czd.f((Object)ae1, "avatarSize");
        final x66 h = x66.h(-1585201095);
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
        int n5;
        if ((n2 & 0x2) != 0x0) {
            n5 = (n3 | 0x30);
        }
        else {
            n5 = n3;
            if ((n & 0x70) == 0x0) {
                int n6;
                if (h.P((Object)ae1)) {
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
            final okh a2 = jes.a(kdq.f(companion), "Single column image tag");
            h.x(733328855);
            Objects.requireNonNull(ex.Companion);
            final fqg d = bb2.d((ex)ex.a.b, false, h);
            h.x(-1323940314);
            final lo8 lo8 = (lo8)h.m((wd6)yd6.e);
            final fve fve = (fve)h.m((wd6)yd6.k);
            final t6x t6x = (t6x)h.m((wd6)yd6.o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b = q66.a.b;
            final itb a3 = ove.a(a2);
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
            mru.p(h, (Object)d, (ftb)q66.a.e);
            mru.p(h, (Object)lo8, (ftb)q66.a.d);
            mru.p(h, (Object)fve, (ftb)q66.a.f);
            ((t26)a3).h0((Object)g4k.C(h, t6x, q66.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            h.x(1157296644);
            final boolean p6 = h.P((Object)s);
            final Object y = h.y();
            Object o = null;
            Label_0575: {
                if (!p6) {
                    Objects.requireNonNull(x66.Companion);
                    if ((o = y) != x66$a.b) {
                        break Label_0575;
                    }
                }
                o = new ag7$i(s);
                h.p(o);
            }
            h.O();
            acv.c((qsb)o, kdq.m((okh)okh.Companion, ae1.a()), (String)null, (ex)null, (em6)null, 0.0f, (qq4)null, false, false, (hvj)null, (qsb)null, (iqb)null, (itb)null, (itb)null, h, 0, 0, 16380);
            c0.D(h);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ag7$j(s, ae1, companion, n, n2));
        }
    }
    
    public static final void h(final String s, final String s2, final ae1 ae1, okh companion, final x66 x66, final int n, final int n2) {
        czd.f((Object)s, "topUserProfileImageUrl");
        czd.f((Object)s2, "bottomUserProfileImageUrl");
        czd.f((Object)ae1, "avatarSize");
        final x66 h = x66.h(1311472576);
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
        int n5;
        if ((n2 & 0x2) != 0x0) {
            n5 = (n3 | 0x30);
        }
        else {
            n5 = n3;
            if ((n & 0x70) == 0x0) {
                int n6;
                if (h.P((Object)s2)) {
                    n6 = 32;
                }
                else {
                    n6 = 16;
                }
                n5 = (n3 | n6);
            }
        }
        int n7;
        if ((n2 & 0x4) != 0x0) {
            n7 = (n5 | 0x180);
        }
        else {
            n7 = n5;
            if ((n & 0x380) == 0x0) {
                int n8;
                if (h.P((Object)ae1)) {
                    n8 = 256;
                }
                else {
                    n8 = 128;
                }
                n7 = (n5 | n8);
            }
        }
        final int n9 = n2 & 0x8;
        int n10;
        if (n9 != 0) {
            n10 = (n7 | 0xC00);
        }
        else {
            n10 = n7;
            if ((n & 0x1C00) == 0x0) {
                int n11;
                if (h.P((Object)companion)) {
                    n11 = 2048;
                }
                else {
                    n11 = 1024;
                }
                n10 = (n7 | n11);
            }
        }
        if ((n10 & 0x16DB) == 0x492 && h.i()) {
            h.H();
        }
        else {
            if (n9 != 0) {
                companion = (okh)okh.Companion;
            }
            final n96$b a = n96.a;
            final okh a2 = jes.a(kdq.f(companion), "Split column image tag");
            h.x(-483455358);
            final ds0 a3 = ds0.a;
            final ds0$k d = ds0.d;
            Objects.requireNonNull(ex.Companion);
            final fqg a4 = nr4.a((ds0.l)d, (ex.b)ex.a.n, h);
            h.x(-1323940314);
            final iar e = yd6.e;
            final lo8 lo8 = (lo8)h.m((wd6)e);
            final iar k = yd6.k;
            final fve fve = (fve)h.m((wd6)k);
            final iar o = yd6.o;
            final t6x t6x = (t6x)h.m((wd6)o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b = q66.a.b;
            final itb a5 = ove.a(a2);
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
            final q66$a$c e2 = q66.a.e;
            mru.p(h, (Object)a4, (ftb)e2);
            final q66$a$a d2 = q66.a.d;
            mru.p(h, (Object)lo8, (ftb)d2);
            final q66$a$b f = q66.a.f;
            mru.p(h, (Object)fve, (ftb)f);
            final q66$a$e g = q66.a.g;
            ((t26)a5).h0((Object)g4k.C(h, t6x, g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-1163856341);
            final qr4 a6 = qr4.a;
            final okh$a companion2 = okh.Companion;
            final yzq a7 = yzq.a;
            final float b2 = yzq.b;
            final okh i = kdq.i(go0.H((pr4)a6, nza.G1((okh)companion2, 0.0f, 0.0f, 0.0f, b2, 7), 0.5f, false, 2, (Object)null));
            h.x(733328855);
            final bw1 b3 = ex.a.b;
            final fqg d3 = bb2.d((ex)b3, false, h);
            h.x(-1323940314);
            final lo8 lo9 = (lo8)h.m((wd6)e);
            final fve fve2 = (fve)h.m((wd6)k);
            final t6x t6x2 = (t6x)h.m((wd6)o);
            final itb a8 = ove.a(i);
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
            ((t26)a8).h0((Object)mw.x(h, h, d3, e2, h, lo9, d2, h, fve2, f, h, t6x2, g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            h.x(1157296644);
            final boolean p7 = h.P((Object)s);
            final Object y = h.y();
            Object o2 = null;
            Label_0943: {
                if (!p7) {
                    Objects.requireNonNull(x66.Companion);
                    if ((o2 = y) != x66$a.b) {
                        break Label_0943;
                    }
                }
                o2 = new ag7$k(s);
                h.p(o2);
            }
            h.O();
            final qsb qsb = (qsb)o2;
            final float a9 = ae1.a();
            final float n12 = 2;
            acv.c(qsb, kdq.m((okh)companion2, a9 / n12), (String)null, (ex)null, (em6)null, 0.0f, (qq4)null, false, false, (hvj)null, (qsb)null, (iqb)null, (itb)null, (itb)null, h, 0, 0, 16380);
            c0.D(h);
            final okh j = kdq.i(go0.H((pr4)a6, nza.G1((okh)companion2, 0.0f, b2, 0.0f, 0.0f, 13), 0.5f, false, 2, (Object)null));
            final fqg g2 = w9.g(h, 733328855, b3, false, h, -1323940314);
            final lo8 lo10 = (lo8)h.m((wd6)e);
            final fve fve3 = (fve)h.m((wd6)k);
            final t6x t6x3 = (t6x)h.m((wd6)o);
            final itb a10 = ove.a(j);
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
            ((t26)a10).h0((Object)mw.x(h, h, g2, e2, h, lo10, d2, h, fve3, f, h, t6x3, g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            h.x(1157296644);
            final boolean p8 = h.P((Object)s2);
            final Object y2 = h.y();
            Object o3 = null;
            Label_1290: {
                if (!p8) {
                    Objects.requireNonNull(x66.Companion);
                    if ((o3 = y2) != x66$a.b) {
                        break Label_1290;
                    }
                }
                o3 = new ag7$l(s2);
                h.p(o3);
            }
            h.O();
            acv.c((qsb)o3, kdq.m((okh)companion2, ae1.a() / n12), (String)null, (ex)null, (em6)null, 0.0f, (qq4)null, false, false, (hvj)null, (qsb)null, (iqb)null, (itb)null, (itb)null, h, 0, 0, 16380);
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
        final lxo l = h.k();
        if (l != null) {
            l.a((ftb)new ag7$m(s, s2, ae1, companion, n, n2));
        }
    }
    
    public static final void i(final int n, okh companion, x66 h, final int n2, final int n3) {
        h = h.h(1239900545);
        int n4;
        if ((n3 & 0x1) != 0x0) {
            n4 = (n2 | 0x6);
        }
        else if ((n2 & 0xE) == 0x0) {
            int n5;
            if (h.d(n)) {
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
        final int n6 = n3 & 0x2;
        int n7;
        if (n6 != 0) {
            n7 = (n4 | 0x30);
        }
        else {
            n7 = n4;
            if ((n2 & 0x70) == 0x0) {
                int n8;
                if (h.P((Object)companion)) {
                    n8 = 32;
                }
                else {
                    n8 = 16;
                }
                n7 = (n4 | n8);
            }
        }
        if ((n7 & 0x5B) == 0x12 && h.i()) {
            h.H();
        }
        else {
            if (n6 != 0) {
                companion = (okh)okh.Companion;
            }
            final n96$b a = n96.a;
            final eoc a2 = eoc.a;
            final long q = eoc.q;
            final long y = eoc.y;
            final long h2 = s9i.h(q, y, y, h);
            final iar a3 = ipc.a;
            final long h3 = s9i.h(((dpc)h.m((wd6)a3)).i(), ((dpc)h.m((wd6)a3)).i(), eoc.o, h);
            Objects.requireNonNull(ex.Companion);
            final bw1 f = ex.a.f;
            final okh a4 = ag7.a;
            final okh e = companion.E(a4);
            final yzq a5 = yzq.a;
            final okh e2 = gmw.e(kdq.m(e, yzq.i), ((dpc)h.m((wd6)a3)).c());
            h.x(733328855);
            final fqg d = bb2.d((ex)f, false, h);
            h.x(-1323940314);
            final iar e3 = yd6.e;
            final lo8 lo8 = (lo8)h.m((wd6)e3);
            final iar k = yd6.k;
            final fve fve = (fve)h.m((wd6)k);
            final iar o = yd6.o;
            final t6x t6x = (t6x)h.m((wd6)o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b = q66.a.b;
            final itb a6 = ove.a(e2);
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
            final q66$a$c e4 = q66.a.e;
            mru.p(h, (Object)d, (ftb)e4);
            final q66$a$a d2 = q66.a.d;
            mru.p(h, (Object)lo8, (ftb)d2);
            final q66$a$b f2 = q66.a.f;
            mru.p(h, (Object)fve, (ftb)f2);
            final q66$a$e g = q66.a.g;
            ((t26)a6).h0((Object)g4k.C(h, t6x, g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            final okh e5 = gmw.e(kdq.g(nza.C1((okh)okh.Companion, yzq.b)).E(a4), h2);
            h.x(733328855);
            final fqg d3 = bb2.d((ex)f, false, h);
            h.x(-1323940314);
            final lo8 lo9 = (lo8)h.m((wd6)e3);
            final fve fve2 = (fve)h.m((wd6)k);
            final t6x t6x2 = (t6x)h.m((wd6)o);
            final itb a7 = ove.a(e5);
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
            ((t26)a7).h0((Object)mw.x(h, h, d3, e4, h, lo9, d2, h, fve2, f2, h, t6x2, g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            final sjs i = kpc.Companion.a(h).k;
            Objects.requireNonNull(pkb.Companion);
            sis.a(String.valueOf(n), (okh)null, h3, 0L, (lkb)null, (pkb)null, (pjb)null, 0L, (ffs)null, (mes)null, 0L, 0, false, 1, sjs.a(i, 0L, 0L, pkb.K0, (pjb)null, (ffs)null, (mes)null, (jfs)null, 0L, 262139), false, h, 0, 3072, 40954);
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
        final lxo j = h.k();
        if (j != null) {
            j.a((ftb)new ag7$n(n, companion, n2, n3));
        }
    }
}
