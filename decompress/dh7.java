import java.util.Collection;
import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dh7
{
    public static final dlh a;
    
    static {
        a = iuk.I((dlh)dlh.Companion, (asp)ylo.a);
    }
    
    public static final void a(final String s, final de1 de1, final ptb<vzv> ptb, dlh companion, String s2, final d86 d86, final int n, final int n2) {
        e0e.f((Object)s, "customAvatarUrl");
        e0e.f((Object)de1, "avatarSize");
        e0e.f((Object)ptb, "onClick");
        final d86 h = d86.h(-2132891283);
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
                if (h.P((Object)de1)) {
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
                if (h.P((Object)ptb)) {
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
                companion = (dlh)dlh.Companion;
            }
            if (n13 != 0) {
                s2 = null;
            }
            final sa6$b a = sa6.a;
            h.x(-492369756);
            final Object y = h.y();
            Objects.requireNonNull(d86.Companion);
            Object d87;
            if ((d87 = y) == d86$a.b) {
                d87 = zk.d(h);
            }
            h.O();
            final iuh iuh = (iuh)d87;
            cdw.c(s, s2, bfs.a(pe4.c(companion, iuh, null, false, null, null, ptb, 28), "Custom image tag"), (hvd)iuh, de1, (asp)null, 0.0f, (vr4)null, (stb)null, (krb)null, (kub)null, (kub)null, h, (n14 & 0xE) | 0xC00 | (n14 >> 9 & 0x70) | 0x0 | (n14 << 9 & 0xE000), 0, 4064);
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new dh7$a(s, de1, (ptb)ptb, companion, s2, n, n2));
        }
    }
    
    public static final void b(final de1 de1, dlh companion, d86 h, final int n, final int n2) {
        e0e.f((Object)de1, "avatarSize");
        h = h.h(88045827);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)de1)) {
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
            Objects.requireNonNull(ex.Companion);
            final jw1 f = ex$a.f;
            final dlh m = heq.m(companion.E(dh7.a), de1.a());
            h.x(733328855);
            final zqg d = ob2.d((ex)f, false, h);
            h.x(-1323940314);
            final rp8 rp8 = (rp8)h.m((df6)ff6.e);
            final cwe cwe = (cwe)h.m((df6)ff6.k);
            final l7x l7x = (l7x)h.m((df6)ff6.o);
            Objects.requireNonNull(w76.Companion);
            final swe$a b = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a2 = lwe.a(m);
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
            ((z36)a2).h0((Object)af.y(h, l7x, w76.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            cdw.d((dlh)null, 0L, h, 0, 3);
            awg.g(h);
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new dh7$b(de1, companion, n, n2));
        }
    }
    
    public static final void c(final int n, final de1 de1, final ptb<vzv> ptb, dlh companion, final hub<? super d86, ? super Integer, vzv> hub, d86 h, final int n2, final int n3) {
        e0e.f((Object)de1, "avatarSize");
        e0e.f((Object)ptb, "onClick");
        e0e.f((Object)hub, "AvatarContent");
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
                if (h.P((Object)de1)) {
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
                if (h.P((Object)ptb)) {
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
                if (h.P((Object)hub)) {
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
                companion = (dlh)dlh.Companion;
            }
            final sa6$b a = sa6.a;
            Objects.requireNonNull(ex.Companion);
            final jw1 j = ex$a.j;
            final dlh m = heq.m(pe4.d(companion, false, null, null, ptb, 7), de1.a());
            h.x(733328855);
            final zqg d = ob2.d((ex)j, false, h);
            h.x(-1323940314);
            final gbr e = ff6.e;
            final rp8 rp8 = (rp8)h.m((df6)e);
            final gbr k = ff6.k;
            final cwe cwe = (cwe)h.m((df6)k);
            final gbr o = ff6.o;
            final l7x l7x = (l7x)h.m((df6)o);
            Objects.requireNonNull(w76.Companion);
            final swe$a b = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a2 = lwe.a(m);
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
            jty.X(h, d, (hub)e2);
            final w76$a$a d2 = w76.a.d;
            jty.X(h, rp8, (hub)d2);
            final w76$a$b f = w76.a.f;
            jty.X(h, cwe, (hub)f);
            final w76$a$e g = w76.a.g;
            ((z36)a2).h0((Object)af.y(h, l7x, g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            final dlh e3 = heq.g((dlh)dlh.Companion).E(dh7.a);
            h.x(733328855);
            final zqg d3 = ob2.d((ex)ex$a.b, false, h);
            h.x(-1323940314);
            final rp8 rp9 = (rp8)h.m((df6)e);
            final cwe cwe2 = (cwe)h.m((df6)k);
            final l7x l7x2 = (l7x)h.m((df6)o);
            final kub<weq<w76>, d86, Integer, vzv> a3 = lwe.a(e3);
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
            ((z36)a3).h0((Object)mw.y(h, h, d3, e2, h, rp9, d2, h, cwe2, f, h, l7x2, g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            hub.invoke((Object)h, (Object)(n14 >> 12 & 0xE));
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
        final gyo i = h.k();
        if (i != null) {
            i.a((hub)new dh7$c(n, de1, (ptb)ptb, companion, (hub)hub, n2, n3));
        }
    }
    
    public static final void d(final hed<? extends qgv> hed, final int n, final de1 de1, final ptb<vzv> ptb, dlh companion, String s, final d86 d86, final int n2, final int n3) {
        e0e.f((Object)hed, "users");
        e0e.f((Object)de1, "avatarSize");
        e0e.f((Object)ptb, "onClick");
        final d86 h = d86.h(-1864018820);
        if ((n3 & 0x10) != 0x0) {
            companion = (dlh)dlh.Companion;
        }
        if ((n3 & 0x20) != 0x0) {
            s = null;
        }
        final sa6$b a = sa6.a;
        final dlh d87 = pe4.d(heq.g(companion), false, null, null, ptb, 7);
        h.x(1157296644);
        final boolean p9 = h.P((Object)s);
        final Object y = h.y();
        Object o = null;
        Label_0156: {
            if (!p9) {
                Objects.requireNonNull(d86.Companion);
                if ((o = y) != d86$a.b) {
                    break Label_0156;
                }
            }
            o = new dh7$d(s);
            h.p(o);
        }
        h.O();
        final dlh a2 = bfs.a(jty.W(d87, false, (stb)o), "Group image tag");
        h.x(693286680);
        final gs0 a3 = gs0.a;
        final gs0$d b = (gs0$d)gs0.b;
        Objects.requireNonNull(ex.Companion);
        final zqg a4 = omo.a((gs0$d)b, (ex$c)ex$a.k, h);
        h.x(-1323940314);
        final rp8 rp8 = (rp8)h.m((df6)ff6.e);
        final cwe cwe = (cwe)h.m((df6)ff6.k);
        final l7x l7x = (l7x)h.m((df6)ff6.o);
        Objects.requireNonNull(w76.Companion);
        final swe$a b2 = w76.a.b;
        final kub<weq<w76>, d86, Integer, vzv> a5 = lwe.a(a2);
        if (h.j() instanceof tr0) {
            h.E();
            if (h.f()) {
                h.A((ptb)b2);
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
            final rmo a6 = rmo.a;
            if (n > 2) {
                h.x(-206806668);
                String g0;
                if ((g0 = ((List<qgv>)hed).get(1).G0) == null) {
                    g0 = "";
                }
                String g2 = ((List<qgv>)hed).get(2).G0;
                if (g2 == null) {
                    g2 = "";
                }
                final dlh a7 = a6.a((dlh)dlh.Companion, 0.5f, true);
                final v0r a8 = v0r.a;
                h(g0, g2, de1, zzz.d0(a7, 0.0f, 0.0f, v0r.b, 0.0f, 11), h, (n2 & 0x380) | 0x0, 0);
                h.O();
            }
            else if (n == 2) {
                h.x(-206806257);
                String g3;
                if ((g3 = ((List<qgv>)hed).get(1).G0) == null) {
                    g3 = "";
                }
                final dlh a9 = a6.a((dlh)dlh.Companion, 0.5f, true);
                final v0r a10 = v0r.a;
                g(g3, de1, zzz.d0(a9, 0.0f, 0.0f, v0r.b, 0.0f, 11), h, (n2 >> 3 & 0x70) | 0x0, 0);
                h.O();
            }
            else {
                h.x(-206805962);
                h.O();
            }
            if (n > 1) {
                h.x(-206805926);
                String g4;
                if ((g4 = ((List<qgv>)hed).get(0).G0) == null) {
                    g4 = "";
                }
                final dlh a11 = a6.a((dlh)dlh.Companion, 0.5f, true);
                final v0r a12 = v0r.a;
                g(g4, de1, zzz.d0(a11, v0r.b, 0.0f, 0.0f, 0.0f, 14), h, (n2 >> 3 & 0x70) | 0x0, 0);
                h.O();
            }
            else if (true ^ ((Collection)hed).isEmpty()) {
                h.x(-206805599);
                String g5;
                if ((g5 = ((List<qgv>)hed).get(0).G0) == null) {
                    g5 = "";
                }
                g(g5, de1, heq.g((dlh)dlh.Companion), h, (n2 >> 3 & 0x70) | 0x180, 0);
                h.O();
            }
            else {
                h.x(-206805300);
                h.O();
            }
            final gyo y2 = lr0.y(h);
            if (y2 != null) {
                y2.a((hub)new dh7$e((hed)hed, n, de1, (ptb)ptb, companion, s, n2, n3));
            }
            return;
        }
        kqe.W();
        throw null;
    }
    
    public static final void e(final hed<? extends qgv> hed, final int n, final boolean b, final String s, final ptb<vzv> ptb, dlh companion, de1 b2, String s2, d86 h, final int n2, final int n3) {
        e0e.f((Object)hed, "users");
        e0e.f((Object)ptb, "onClick");
        h = h.h(-1879153610);
        if ((n3 & 0x20) != 0x0) {
            companion = (dlh)dlh.Companion;
        }
        int n4;
        if ((n3 & 0x40) != 0x0) {
            b2 = (de1)de1$b.b;
            n4 = (n2 & 0xFFC7FFFF);
        }
        else {
            n4 = n2;
        }
        if ((n3 & 0x80) != 0x0) {
            s2 = null;
        }
        final sa6$b a = sa6.a;
        if (b) {
            h.x(1727700112);
            final y36 i = w9y.i(h, -266941523, new dh7$f(s, b2, (ptb)ptb, s2, n4, (hed)hed, n));
            final int n5 = n4 >> 6;
            c(n, b2, ptb, companion, (hub<? super d86, ? super Integer, vzv>)i, h, (n4 >> 3 & 0xE) | 0x6000 | 0x0 | (n4 >> 15 & 0x70) | (n5 & 0x380) | (n5 & 0x1C00), 0);
            h.O();
        }
        else {
            h.x(1727700969);
            final qgv qgv = (qgv)kr4.q((List)hed);
            final int n6 = n4 >> 6;
            f(qgv, b2, ptb, companion, null, h, (n4 >> 15 & 0x70) | 0x8 | (n6 & 0x380) | (n6 & 0x1C00), 16);
            h.O();
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new dh7$g((hed)hed, n, b, s, (ptb)ptb, companion, b2, s2, n2, n3));
        }
    }
    
    public static final void f(final qgv qgv, final de1 de1, final ptb<vzv> ptb, dlh companion, String s, final d86 d86, final int n, final int n2) {
        e0e.f((Object)de1, "avatarSize");
        e0e.f((Object)ptb, "onClick");
        final d86 h = d86.h(410826396);
        if ((n2 & 0x8) != 0x0) {
            companion = (dlh)dlh.Companion;
        }
        if ((n2 & 0x10) != 0x0) {
            s = null;
        }
        final sa6$b a = sa6.a;
        h.x(-492369756);
        final Object y = h.y();
        Objects.requireNonNull(d86.Companion);
        Object d87;
        if ((d87 = y) == d86$a.b) {
            d87 = zk.d(h);
        }
        h.O();
        final iuh iuh = (iuh)d87;
        if (qgv != null) {
            h.x(1731915760);
            cdw.b(qgv, bfs.a(pe4.c(companion, iuh, null, false, null, null, ptb, 28), "User image tag"), (hvd)iuh, s, de1, (asp)null, 0.0f, (vr4)null, (stb)null, (krb)null, (kub)null, (kub)null, h, 0x0 | ((n >> 3 & 0x1C00) | 0x188) | (0xE000 & n << 9), 0, 4064);
            h.O();
        }
        else {
            h.x(1731916237);
            b(de1, companion, h, (n >> 3 & 0xE) | 0x0 | (n >> 6 & 0x70), 0);
            h.O();
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new dh7$h(qgv, de1, (ptb)ptb, companion, s, n, n2));
        }
    }
    
    public static final void g(final String s, final de1 de1, dlh companion, final d86 d86, final int n, final int n2) {
        e0e.f((Object)s, "userProfileImageUrl");
        e0e.f((Object)de1, "avatarSize");
        final d86 h = d86.h(-1585201095);
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
                if (h.P((Object)de1)) {
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
                companion = (dlh)dlh.Companion;
            }
            final sa6$b a = sa6.a;
            final dlh a2 = bfs.a(heq.f(companion), "Single column image tag");
            h.x(733328855);
            Objects.requireNonNull(ex.Companion);
            final zqg d87 = ob2.d((ex)ex$a.b, false, h);
            h.x(-1323940314);
            final rp8 rp8 = (rp8)h.m((df6)ff6.e);
            final cwe cwe = (cwe)h.m((df6)ff6.k);
            final l7x l7x = (l7x)h.m((df6)ff6.o);
            Objects.requireNonNull(w76.Companion);
            final swe$a b = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a3 = lwe.a(a2);
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
            jty.X(h, d87, (hub)w76.a.e);
            jty.X(h, rp8, (hub)w76.a.d);
            jty.X(h, cwe, (hub)w76.a.f);
            ((z36)a3).h0((Object)af.y(h, l7x, w76.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            h.x(1157296644);
            final boolean p6 = h.P((Object)s);
            final Object y = h.y();
            Object o = null;
            Label_0575: {
                if (!p6) {
                    Objects.requireNonNull(d86.Companion);
                    if ((o = y) != d86$a.b) {
                        break Label_0575;
                    }
                }
                o = new dh7$i(s);
                h.p(o);
            }
            h.O();
            pcv.c((stb)o, heq.m((dlh)dlh.Companion, de1.a()), (String)null, (ex)null, (kn6)null, 0.0f, (vr4)null, false, false, (wvj)null, (stb)null, (krb)null, (kub)null, (kub)null, h, 0, 0, 16380);
            awg.g(h);
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new dh7$j(s, de1, companion, n, n2));
        }
    }
    
    public static final void h(final String s, final String s2, final de1 de1, dlh companion, final d86 d86, final int n, final int n2) {
        e0e.f((Object)s, "topUserProfileImageUrl");
        e0e.f((Object)s2, "bottomUserProfileImageUrl");
        e0e.f((Object)de1, "avatarSize");
        final d86 h = d86.h(1311472576);
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
                if (h.P((Object)de1)) {
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
                companion = (dlh)dlh.Companion;
            }
            final sa6$b a = sa6.a;
            final dlh a2 = bfs.a(heq.f(companion), "Split column image tag");
            h.x(-483455358);
            final gs0 a3 = gs0.a;
            final gs0$l d87 = (gs0$l)gs0.d;
            Objects.requireNonNull(ex.Companion);
            final zqg a4 = ts4.a((gs0$l)d87, (ex$b)ex$a.n, h);
            h.x(-1323940314);
            final gbr e = ff6.e;
            final rp8 rp8 = (rp8)h.m((df6)e);
            final gbr k = ff6.k;
            final cwe cwe = (cwe)h.m((df6)k);
            final gbr o = ff6.o;
            final l7x l7x = (l7x)h.m((df6)o);
            Objects.requireNonNull(w76.Companion);
            final swe$a b = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a5 = lwe.a(a2);
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
            final w76$a$b f = w76.a.f;
            jty.X(h, cwe, (hub)f);
            final w76$a$e g = w76.a.g;
            ((z36)a5).h0((Object)af.y(h, l7x, g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-1163856341);
            final ws4 a6 = ws4.a;
            final dlh.a companion2 = dlh.Companion;
            final v0r a7 = v0r.a;
            final float b2 = v0r.b;
            final dlh i = heq.i(lr0.E((vs4)a6, zzz.d0((dlh)companion2, 0.0f, 0.0f, 0.0f, b2, 7), 0.5f, false, 2, (Object)null));
            h.x(733328855);
            final jw1 b3 = ex$a.b;
            final zqg d89 = ob2.d((ex)b3, false, h);
            h.x(-1323940314);
            final rp8 rp9 = (rp8)h.m((df6)e);
            final cwe cwe2 = (cwe)h.m((df6)k);
            final l7x l7x2 = (l7x)h.m((df6)o);
            final kub<weq<w76>, d86, Integer, vzv> a8 = lwe.a(i);
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
            ((z36)a8).h0((Object)mw.y(h, h, d89, e2, h, rp9, d88, h, cwe2, f, h, l7x2, g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            h.x(1157296644);
            final boolean p7 = h.P((Object)s);
            final Object y = h.y();
            Object o2 = null;
            Label_0943: {
                if (!p7) {
                    Objects.requireNonNull(d86.Companion);
                    if ((o2 = y) != d86$a.b) {
                        break Label_0943;
                    }
                }
                o2 = new dh7$k(s);
                h.p(o2);
            }
            h.O();
            final stb stb = (stb)o2;
            final float a9 = de1.a();
            final float n12 = 2;
            pcv.c(stb, heq.m((dlh)companion2, a9 / n12), (String)null, (ex)null, (kn6)null, 0.0f, (vr4)null, false, false, (wvj)null, (stb)null, (krb)null, (kub)null, (kub)null, h, 0, 0, 16380);
            awg.g(h);
            final dlh j = heq.i(lr0.E((vs4)a6, zzz.d0((dlh)companion2, 0.0f, b2, 0.0f, 0.0f, 13), 0.5f, false, 2, (Object)null));
            final zqg s3 = z9a.s(h, 733328855, b3, false, h, -1323940314);
            final rp8 rp10 = (rp8)h.m((df6)e);
            final cwe cwe3 = (cwe)h.m((df6)k);
            final l7x l7x3 = (l7x)h.m((df6)o);
            final kub<weq<w76>, d86, Integer, vzv> a10 = lwe.a(j);
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
            ((z36)a10).h0((Object)mw.y(h, h, s3, e2, h, rp10, d88, h, cwe3, f, h, l7x3, g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            h.x(1157296644);
            final boolean p8 = h.P((Object)s2);
            final Object y2 = h.y();
            Object o3 = null;
            Label_1290: {
                if (!p8) {
                    Objects.requireNonNull(d86.Companion);
                    if ((o3 = y2) != d86$a.b) {
                        break Label_1290;
                    }
                }
                o3 = new dh7$l(s2);
                h.p(o3);
            }
            h.O();
            pcv.c((stb)o3, heq.m((dlh)companion2, de1.a() / n12), (String)null, (ex)null, (kn6)null, 0.0f, (vr4)null, false, false, (wvj)null, (stb)null, (krb)null, (kub)null, (kub)null, h, 0, 0, 16380);
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
        final gyo l = h.k();
        if (l != null) {
            l.a((hub)new dh7$m(s, s2, de1, companion, n, n2));
        }
    }
    
    public static final void i(final int n, dlh companion, d86 h, final int n2, final int n3) {
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
                companion = (dlh)dlh.Companion;
            }
            final sa6$b a = sa6.a;
            final epc a2 = epc.a;
            final long q = epc.q;
            final long y = epc.y;
            final long a3 = cmi.a(q, y, y, h);
            final gbr a4 = iqc.a;
            final long a5 = cmi.a(((dqc)h.m((df6)a4)).i(), ((dqc)h.m((df6)a4)).i(), epc.o, h);
            Objects.requireNonNull(ex.Companion);
            final jw1 f = ex$a.f;
            final dlh a6 = dh7.a;
            final dlh e = companion.E(a6);
            final v0r a7 = v0r.a;
            final dlh k = p4j.k(heq.m(e, v0r.i), ((dqc)h.m((df6)a4)).c());
            h.x(733328855);
            final zqg d = ob2.d((ex)f, false, h);
            h.x(-1323940314);
            final gbr e2 = ff6.e;
            final rp8 rp8 = (rp8)h.m((df6)e2);
            final gbr i = ff6.k;
            final cwe cwe = (cwe)h.m((df6)i);
            final gbr o = ff6.o;
            final l7x l7x = (l7x)h.m((df6)o);
            Objects.requireNonNull(w76.Companion);
            final swe$a b = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a8 = lwe.a(k);
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
            final w76$a$c e3 = w76.a.e;
            jty.X(h, d, (hub)e3);
            final w76$a$a d2 = w76.a.d;
            jty.X(h, rp8, (hub)d2);
            final w76$a$b f2 = w76.a.f;
            jty.X(h, cwe, (hub)f2);
            final w76$a$e g = w76.a.g;
            ((z36)a8).h0((Object)af.y(h, l7x, g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            final dlh j = p4j.k(heq.g(zzz.Z((dlh)dlh.Companion, v0r.b)).E(a6), a3);
            h.x(733328855);
            final zqg d3 = ob2.d((ex)f, false, h);
            h.x(-1323940314);
            final rp8 rp9 = (rp8)h.m((df6)e2);
            final cwe cwe2 = (cwe)h.m((df6)i);
            final l7x l7x2 = (l7x)h.m((df6)o);
            final kub<weq<w76>, d86, Integer, vzv> a9 = lwe.a(j);
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
            ((z36)a9).h0((Object)mw.y(h, h, d3, e3, h, rp9, d2, h, cwe2, f2, h, l7x2, g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            final kks l = kqc.Companion.a(h).k;
            Objects.requireNonNull(qlb.Companion);
            kjs.a(String.valueOf(n), (dlh)null, a5, 0L, (mlb)null, (qlb)null, (qkb)null, 0L, (xfs)null, (efs)null, 0L, 0, false, 1, kks.a(l, 0L, 0L, qlb.M0, (qkb)null, (xfs)null, (efs)null, (bgs)null, 0L, 262139), false, h, 0, 3072, 40954);
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
        final gyo m = h.k();
        if (m != null) {
            m.a((hub)new dh7$n(n, companion, n2, n3));
        }
    }
}
