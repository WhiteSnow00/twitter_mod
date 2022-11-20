import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kuj
{
    public static final void a(final nuj nuj, okh companion, int intValue, qsb<? super Integer, Integer> d0, long b, long b2, float n, float n2, float n3, frp a, final x66 x66, final int n4, final int n5) {
        czd.f((Object)nuj, "pagerState");
        final x66 h = x66.h(1678773673);
        int n6;
        if ((n5 & 0x1) != 0x0) {
            n6 = (n4 | 0x6);
        }
        else if ((n4 & 0xE) == 0x0) {
            int n7;
            if (h.P((Object)nuj)) {
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
                    if (h.P(d0)) {
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
        frp frp;
        okh okh2;
        if ((n22 & 0x5B6DB6DB) == 0x12492492 && h.i()) {
            h.H();
            final okh okh = companion;
            frp = a;
            final float n26 = n;
            n = n3;
            okh2 = okh;
            n3 = n26;
        }
        else {
            h.C();
            int n32 = 0;
            Label_1125: {
                float n33;
                okh okh3;
                int n34;
                Object o;
                long n35;
                float n36;
                float n37;
                long n38;
                if ((n4 & 0x1) != 0x0 && !h.K()) {
                    h.H();
                    int n27 = n22;
                    if ((n5 & 0x4) != 0x0) {
                        n27 = (n22 & 0xFFFFFC7F);
                    }
                    int n28 = n27;
                    if ((n5 & 0x10) != 0x0) {
                        n28 = (n27 & 0xFFFF1FFF);
                    }
                    int n29 = n28;
                    if ((n5 & 0x20) != 0x0) {
                        n29 = (n28 & 0xFFF8FFFF);
                    }
                    int n30 = n29;
                    if ((n5 & 0x80) != 0x0) {
                        n30 = (n29 & 0xFE3FFFFF);
                    }
                    int n31 = n30;
                    if ((n5 & 0x100) != 0x0) {
                        n31 = (n30 & 0xF1FFFFFF);
                    }
                    n32 = n31;
                    if ((n5 & 0x200) != 0x0) {
                        n32 = (n31 & 0x8FFFFFFF);
                    }
                    n33 = n2;
                    okh3 = companion;
                    n34 = intValue;
                    o = d0;
                    n35 = b;
                    n36 = n;
                    n37 = n3;
                    n38 = b2;
                }
                else {
                    if (n8 != 0) {
                        companion = (okh)okh.Companion;
                    }
                    if ((n5 & 0x4) != 0x0) {
                        intValue = nuj.d.getValue().intValue();
                        n22 &= 0xFFFFFC7F;
                    }
                    if (n13 != 0) {
                        d0 = kuj$a.D0;
                    }
                    int n39;
                    if ((n5 & 0x10) != 0x0) {
                        b = nq4.b(((nq4)h.m((wd6)sk6.a)).a, ((Number)h.m((wd6)rk6.a)).floatValue());
                        n39 = (n22 & 0xFFFF1FFF);
                    }
                    else {
                        n39 = n22;
                    }
                    int n40 = n39;
                    if ((n5 & 0x20) != 0x0) {
                        b2 = nq4.b(b, rp9.U(h, 8));
                        n40 = (n39 & 0xFFF8FFFF);
                    }
                    if (n19 != 0) {
                        n = 8;
                    }
                    if ((n5 & 0x80) != 0x0) {
                        n40 &= 0xFE3FFFFF;
                        n2 = n;
                    }
                    int n41;
                    if ((n5 & 0x100) != 0x0) {
                        n41 = (n40 & 0xF1FFFFFF);
                        n3 = n;
                    }
                    else {
                        n41 = n40;
                    }
                    n33 = n2;
                    okh3 = companion;
                    n34 = intValue;
                    o = d0;
                    n35 = b;
                    n36 = n;
                    n37 = n3;
                    n38 = b2;
                    n32 = n41;
                    if ((n5 & 0x200) != 0x0) {
                        a = (frp)elo.a;
                        n32 = (n41 & 0x8FFFFFFF);
                        break Label_1125;
                    }
                }
                b2 = n38;
                n3 = n37;
                n = n36;
                b = n35;
                d0 = o;
                intValue = n34;
                companion = okh3;
                n2 = n33;
            }
            h.s();
            final n96$b a2 = n96.a;
            final iar e = yd6.e;
            final int s = ((lo8)h.m((wd6)e)).S(n);
            final int s2 = ((lo8)h.m((wd6)e)).S(n3);
            Objects.requireNonNull(ex.Companion);
            final bw1 e2 = ex.a.e;
            final int n42 = (n32 >> 3 & 0xE) | 0x30;
            h.x(733328855);
            final fqg d2 = bb2.d((ex)e2, false, h);
            h.x(-1323940314);
            final lo8 lo8 = (lo8)h.m((wd6)e);
            final iar k = yd6.k;
            final fve fve = (fve)h.m((wd6)k);
            final iar o2 = yd6.o;
            final t6x t6x = (t6x)h.m((wd6)o2);
            Objects.requireNonNull(q66.Companion);
            final vve$a b3 = q66.a.b;
            final itb a3 = ove.a(companion);
            final int n43 = ((n42 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
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
            final q66$a$c e3 = q66.a.e;
            mru.p(h, (Object)d2, (ftb)e3);
            final q66$a$a d3 = q66.a.d;
            mru.p(h, (Object)lo8, (ftb)d3);
            final q66$a$b f = q66.a.f;
            mru.p(h, (Object)fve, (ftb)f);
            final q66$a$e g = q66.a.g;
            ((t26)a3).h0((Object)g4k.C(h, t6x, g, h), (Object)h, (Object)(n43 >> 3 & 0x70));
            h.x(2058660585);
            h.x(-2137368960);
            if ((n43 >> 9 & 0xE & 0xB) == 0x2 && h.i()) {
                h.H();
            }
            else if ((((n42 >> 6 & 0x70) | 0x6) & 0x51) == 0x10 && h.i()) {
                h.H();
            }
            else {
                final ds0.ds0$e g2 = ds0.a.g(n3);
                final bw1.b l = ex.a.l;
                h.x(693286680);
                final okh$a companion2 = okh.Companion;
                final fqg a4 = ulo.a((ds0.d)g2, l, h);
                h.x(-1323940314);
                final lo8 lo9 = (lo8)h.m((wd6)e);
                final fve fve2 = (fve)h.m((wd6)k);
                final t6x t6x2 = (t6x)h.m((wd6)o2);
                final itb a5 = ove.a((okh)companion2);
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
                ((t26)a5).h0((Object)mw.x(h, h, a4, e3, h, lo9, d3, h, fve2, f, h, t6x2, g, h), (Object)h, (Object)0);
                h.x(2058660585);
                h.x(-678309503);
                final okh d4 = gmw.d(kdq.o((okh)companion2, n, n2), b2, a);
                h.x(-29724645);
                for (int i = 0; i < intValue; ++i) {
                    bb2.a(d4, h, 0);
                }
                h.O();
                h.O();
                h.O();
                h.r();
                h.O();
                h.O();
                final okh$a companion3 = okh.Companion;
                h.x(-568225417);
                int j = 0;
                boolean b4 = false;
                while (j < 5) {
                    b4 |= h.P((new Object[] { d0, nuj, intValue, s2, s })[j]);
                    ++j;
                }
                final Object y = h.y();
                Object o3 = null;
                Label_2020: {
                    if (!b4) {
                        Objects.requireNonNull(x66.Companion);
                        if ((o3 = y) != x66$a.b) {
                            break Label_2020;
                        }
                    }
                    o3 = new kuj$b((qsb)d0, nuj, intValue, s2, s);
                    h.p(o3);
                }
                h.O();
                bb2.a(gmw.d(kdq.o(mru.k((okh)companion3, (qsb)o3), n, n2), b, a), h, 0);
            }
            c0.D(h);
            final n96$b a6 = n96.a;
            final frp frp2 = a;
            final float n44 = n3;
            okh2 = companion;
            n3 = n;
            frp = frp2;
            n = n44;
        }
        final lxo m = h.k();
        if (m != null) {
            m.a((ftb)new kuj$c(nuj, okh2, intValue, (qsb)d0, b, b2, n3, n2, n, frp, n4, n5));
        }
    }
}
