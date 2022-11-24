import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zuj
{
    public static final void a(final cvj cvj, dlh companion, int intValue, stb<? super Integer, Integer> f0, long b, long b2, float n, float n2, float n3, asp a, final d86 d86, final int n4, final int n5) {
        e0e.f((Object)cvj, "pagerState");
        final d86 h = d86.h(1678773673);
        int n6;
        if ((n5 & 0x1) != 0x0) {
            n6 = (n4 | 0x6);
        }
        else if ((n4 & 0xE) == 0x0) {
            int n7;
            if (h.P((Object)cvj)) {
                n7 = 4;
            }
            else {
                n7 = 2;
            }
            n6 = (n7 | n4);
        }
        else {
            n6 = n4;
        }
        final int n8 = n5 & 0x2;
        int n11 = 0;
        Label_0145: {
            int n9;
            if (n8 != 0) {
                n9 = (n6 | 0x30);
            }
            else {
                n9 = n6;
                if ((n4 & 0x70) == 0x0) {
                    int n10;
                    if (h.P((Object)companion)) {
                        n10 = 32;
                    }
                    else {
                        n10 = 16;
                    }
                    n11 = (n6 | n10);
                    break Label_0145;
                }
            }
            n11 = n9;
        }
        if ((n4 & 0x380) == 0x0) {
            int n12;
            if ((n5 & 0x4) == 0x0 && h.d(intValue)) {
                n12 = 256;
            }
            else {
                n12 = 128;
            }
            n11 |= n12;
        }
        final int n13 = n5 & 0x8;
        int n16 = 0;
        Label_0269: {
            int n14;
            if (n13 != 0) {
                n14 = (n11 | 0xC00);
            }
            else {
                n14 = n11;
                if ((n4 & 0x1C00) == 0x0) {
                    int n15;
                    if (h.P(f0)) {
                        n15 = 2048;
                    }
                    else {
                        n15 = 1024;
                    }
                    n16 = (n11 | n15);
                    break Label_0269;
                }
            }
            n16 = n14;
        }
        if ((0xE000 & n4) == 0x0) {
            int n17;
            if ((n5 & 0x10) == 0x0 && h.e(b)) {
                n17 = 16384;
            }
            else {
                n17 = 8192;
            }
            n16 |= n17;
        }
        if ((0x70000 & n4) == 0x0) {
            int n18;
            if ((n5 & 0x20) == 0x0 && h.e(b2)) {
                n18 = 131072;
            }
            else {
                n18 = 65536;
            }
            n16 |= n18;
        }
        final int n19 = n5 & 0x40;
        int n22 = 0;
        Label_0440: {
            int n20;
            if (n19 != 0) {
                n20 = (n16 | 0x180000);
            }
            else {
                n20 = n16;
                if ((0x380000 & n4) == 0x0) {
                    int n21;
                    if (h.b(n)) {
                        n21 = 1048576;
                    }
                    else {
                        n21 = 524288;
                    }
                    n22 = (n16 | n21);
                    break Label_0440;
                }
            }
            n22 = n20;
        }
        if ((n4 & 0x1C00000) == 0x0) {
            int n23;
            if ((n5 & 0x80) == 0x0 && h.b(n2)) {
                n23 = 8388608;
            }
            else {
                n23 = 4194304;
            }
            n22 |= n23;
        }
        if ((n4 & 0xE000000) == 0x0) {
            int n24;
            if ((n5 & 0x100) == 0x0 && h.b(n3)) {
                n24 = 67108864;
            }
            else {
                n24 = 33554432;
            }
            n22 |= n24;
        }
        if ((n4 & 0x70000000) == 0x0) {
            int n25;
            if ((n5 & 0x200) == 0x0 && h.P((Object)a)) {
                n25 = 536870912;
            }
            else {
                n25 = 268435456;
            }
            n22 |= n25;
        }
        dlh dlh;
        Object o2;
        if ((n22 & 0x5B6DB6DB) == 0x12492492 && h.i()) {
            h.H();
            final Object o = f0;
            dlh = companion;
            o2 = o;
        }
        else {
            h.C();
            int n31 = 0;
            Label_1111: {
                float n32;
                dlh dlh2;
                int n33;
                Object o3;
                long n34;
                float n35;
                float n36;
                long n37;
                if ((n4 & 0x1) != 0x0 && !h.K()) {
                    h.H();
                    int n26 = n22;
                    if ((n5 & 0x4) != 0x0) {
                        n26 = (n22 & 0xFFFFFC7F);
                    }
                    int n27 = n26;
                    if ((n5 & 0x10) != 0x0) {
                        n27 = (n26 & 0xFFFF1FFF);
                    }
                    int n28 = n27;
                    if ((n5 & 0x20) != 0x0) {
                        n28 = (n27 & 0xFFF8FFFF);
                    }
                    int n29 = n28;
                    if ((n5 & 0x80) != 0x0) {
                        n29 = (n28 & 0xFE3FFFFF);
                    }
                    int n30 = n29;
                    if ((n5 & 0x100) != 0x0) {
                        n30 = (n29 & 0xF1FFFFFF);
                    }
                    n31 = n30;
                    if ((n5 & 0x200) != 0x0) {
                        n31 = (n30 & 0x8FFFFFFF);
                    }
                    n32 = n2;
                    dlh2 = companion;
                    n33 = intValue;
                    o3 = f0;
                    n34 = b;
                    n35 = n;
                    n36 = n3;
                    n37 = b2;
                }
                else {
                    if (n8 != 0) {
                        companion = (dlh)dlh.Companion;
                    }
                    if ((n5 & 0x4) != 0x0) {
                        intValue = cvj.d.getValue().intValue();
                        n22 &= 0xFFFFFC7F;
                    }
                    if (n13 != 0) {
                        f0 = zuj$a.F0;
                    }
                    if ((n5 & 0x10) != 0x0) {
                        b = sr4.b(((sr4)h.m((df6)yl6.a)).a, ((Number)h.m((df6)xl6.a)).floatValue());
                        n22 &= 0xFFFF1FFF;
                    }
                    int n38 = n22;
                    if ((n5 & 0x20) != 0x0) {
                        b2 = sr4.b(b, d4j.E(h, 8));
                        n38 = (n22 & 0xFFF8FFFF);
                    }
                    if (n19 != 0) {
                        n = 8;
                    }
                    int n39;
                    if ((n5 & 0x80) != 0x0) {
                        n39 = (n38 & 0xFE3FFFFF);
                        n2 = n;
                    }
                    else {
                        n39 = n38;
                    }
                    int n40;
                    if ((n5 & 0x100) != 0x0) {
                        n40 = (n39 & 0xF1FFFFFF);
                        n3 = n;
                    }
                    else {
                        n40 = n39;
                    }
                    n32 = n2;
                    dlh2 = companion;
                    n33 = intValue;
                    o3 = f0;
                    n34 = b;
                    n35 = n;
                    n36 = n3;
                    n37 = b2;
                    n31 = n40;
                    if ((n5 & 0x200) != 0x0) {
                        a = (asp)ylo.a;
                        n31 = (n40 & 0x8FFFFFFF);
                        break Label_1111;
                    }
                }
                b2 = n37;
                n3 = n36;
                n = n35;
                b = n34;
                f0 = o3;
                intValue = n33;
                companion = dlh2;
                n2 = n32;
            }
            h.s();
            final sa6$b a2 = sa6.a;
            final gbr e = ff6.e;
            final int s = ((rp8)h.m((df6)e)).S(n);
            final int s2 = ((rp8)h.m((df6)e)).S(n3);
            Objects.requireNonNull(ex.Companion);
            final jw1 e2 = ex$a.e;
            final int n41 = (n31 >> 3 & 0xE) | 0x30;
            h.x(733328855);
            final zqg d87 = ob2.d((ex)e2, false, h);
            h.x(-1323940314);
            final rp8 rp8 = (rp8)h.m((df6)e);
            final gbr k = ff6.k;
            final cwe cwe = (cwe)h.m((df6)k);
            final gbr o4 = ff6.o;
            final l7x l7x = (l7x)h.m((df6)o4);
            Objects.requireNonNull(w76.Companion);
            final swe$a b3 = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a3 = lwe.a(companion);
            final int n42 = ((n41 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
            if (!(h.j() instanceof tr0)) {
                kqe.W();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((ptb)b3);
            }
            else {
                h.o();
            }
            h.F();
            final w76$a$c e3 = w76.a.e;
            jty.X(h, d87, (hub)e3);
            final w76$a$a d88 = w76.a.d;
            jty.X(h, rp8, (hub)d88);
            final w76$a$b f2 = w76.a.f;
            jty.X(h, cwe, (hub)f2);
            final w76$a$e g = w76.a.g;
            ((z36)a3).h0((Object)af.y(h, l7x, g, h), (Object)h, (Object)(n42 >> 3 & 0x70));
            h.x(2058660585);
            h.x(-2137368960);
            if ((n42 >> 9 & 0xE & 0xB) == 0x2 && h.i()) {
                h.H();
            }
            else if ((((n41 >> 6 & 0x70) | 0x6) & 0x51) == 0x10 && h.i()) {
                h.H();
            }
            else {
                final gs0.e g2 = gs0.a.g(n3);
                final jw1.b l = ex$a.l;
                h.x(693286680);
                final dlh.a companion2 = dlh.Companion;
                final zqg a4 = omo.a((gs0$d)g2, (ex$c)l, h);
                h.x(-1323940314);
                final rp8 rp9 = (rp8)h.m((df6)e);
                final cwe cwe2 = (cwe)h.m((df6)k);
                final l7x l7x2 = (l7x)h.m((df6)o4);
                final kub<weq<w76>, d86, Integer, vzv> a5 = lwe.a((dlh)companion2);
                if (!(h.j() instanceof tr0)) {
                    kqe.W();
                    throw null;
                }
                h.E();
                if (h.f()) {
                    h.A((ptb)b3);
                }
                else {
                    h.o();
                }
                ((z36)a5).h0((Object)mw.y(h, h, a4, e3, h, rp9, d88, h, cwe2, f2, h, l7x2, g, h), (Object)h, (Object)0);
                h.x(2058660585);
                h.x(-678309503);
                final dlh j = p4j.j(heq.o((dlh)companion2, n, n2), b2, a);
                h.x(-29724645);
                for (int i = 0; i < intValue; ++i) {
                    ob2.a(j, h, 0);
                }
                h.O();
                h.O();
                h.O();
                h.r();
                h.O();
                h.O();
                final dlh.a companion3 = dlh.Companion;
                h.x(-568225417);
                int n43 = 0;
                boolean b4 = false;
                while (n43 < 5) {
                    b4 |= h.P((new Object[] { f0, cvj, intValue, s2, s })[n43]);
                    ++n43;
                }
                final Object y = h.y();
                Object o5 = null;
                Label_2006: {
                    if (!b4) {
                        Objects.requireNonNull(d86.Companion);
                        if ((o5 = y) != d86$a.b) {
                            break Label_2006;
                        }
                    }
                    o5 = new zuj$b((stb)f0, cvj, intValue, s2, s);
                    h.p(o5);
                }
                h.O();
                ob2.a(p4j.j(heq.o(jty.O((dlh)companion3, (stb)o5), n, n2), b, a), h, 0);
            }
            awg.g(h);
            final sa6$b a6 = sa6.a;
            final stb stb = (stb)f0;
            dlh = companion;
            o2 = stb;
        }
        final gyo m = h.k();
        if (m != null) {
            m.a((hub)new zuj$c(cvj, dlh, intValue, (stb)o2, b, b2, n, n2, n3, a, n4, n5));
        }
    }
}
