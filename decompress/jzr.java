import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jzr
{
    public static final void a(jkh companion, oqp a, long l, long b, a82 a2, float n, final gub<? super m76, ? super Integer, oyv> gub, final m76 m76, final int n2, final int n3) {
        zzd.f((Object)gub, "content");
        final m76 h = m76.h(1412203386);
        final int n4 = n3 & 0x1;
        int n5;
        if (n4 != 0) {
            n5 = (n2 | 0x6);
        }
        else if ((n2 & 0xE) == 0x0) {
            int n6;
            if (h.P((Object)companion)) {
                n6 = 4;
            }
            else {
                n6 = 2;
            }
            n5 = (n6 | n2);
        }
        else {
            n5 = n2;
        }
        final int n7 = n3 & 0x2;
        int n10 = 0;
        Label_0150: {
            int n8;
            if (n7 != 0) {
                n8 = (n5 | 0x30);
            }
            else {
                n8 = n5;
                if ((n2 & 0x70) == 0x0) {
                    int n9;
                    if (h.P((Object)a)) {
                        n9 = 32;
                    }
                    else {
                        n9 = 16;
                    }
                    n10 = (n5 | n9);
                    break Label_0150;
                }
            }
            n10 = n8;
        }
        if ((n2 & 0x380) == 0x0) {
            int n11;
            if ((n3 & 0x4) == 0x0 && h.e(l)) {
                n11 = 256;
            }
            else {
                n11 = 128;
            }
            n10 |= n11;
        }
        if ((n2 & 0x1C00) == 0x0) {
            int n12;
            if ((n3 & 0x8) == 0x0 && h.e(b)) {
                n12 = 2048;
            }
            else {
                n12 = 1024;
            }
            n10 |= n12;
        }
        final int n13 = n3 & 0x10;
        int n14;
        if (n13 != 0) {
            n14 = (n10 | 0x6000);
        }
        else {
            n14 = n10;
            if ((0xE000 & n2) == 0x0) {
                int n15;
                if (h.P((Object)a2)) {
                    n15 = 16384;
                }
                else {
                    n15 = 8192;
                }
                n14 = (n10 | n15);
            }
        }
        final int n16 = n3 & 0x20;
        int n17;
        if (n16 != 0) {
            n17 = (n14 | 0x30000);
        }
        else {
            n17 = n14;
            if ((n2 & 0x70000) == 0x0) {
                int n18;
                if (h.b(n)) {
                    n18 = 131072;
                }
                else {
                    n18 = 65536;
                }
                n17 = (n14 | n18);
            }
        }
        int n20 = 0;
        Label_0443: {
            int n19;
            if ((n3 & 0x40) != 0x0) {
                n19 = 1572864;
            }
            else {
                n20 = n17;
                if ((n2 & 0x380000) != 0x0) {
                    break Label_0443;
                }
                if (h.P((Object)gub)) {
                    n19 = 1048576;
                }
                else {
                    n19 = 524288;
                }
            }
            n20 = (n17 | n19);
        }
        jkh jkh2 = null;
        oqp oqp2 = null;
        Label_0856: {
            if ((n20 & 0x2DB6DB) != 0x92492 || !h.i()) {
                h.C();
                while (true) {
                    a82 a3 = null;
                    long n22 = 0L;
                    long n23 = 0L;
                    oqp oqp = null;
                    int n24 = 0;
                    jkh jkh = null;
                    Label_0574: {
                        int n25;
                        if ((n2 & 0x1) != 0x0 && !h.K()) {
                            h.H();
                            int n21 = n20;
                            if ((n3 & 0x4) != 0x0) {
                                n21 = (n20 & 0xFFFFFC7F);
                            }
                            if ((n3 & 0x8) == 0x0) {
                                a3 = a2;
                                n22 = b;
                                n23 = l;
                                oqp = a;
                                n24 = n21;
                                jkh = companion;
                                break Label_0574;
                            }
                            n25 = (n21 & 0xFFFFE3FF);
                        }
                        else {
                            if (n4 != 0) {
                                companion = jkh.Companion;
                            }
                            if (n7 != 0) {
                                a = (oqp)v5m.a;
                            }
                            int n26 = n20;
                            if ((n3 & 0x4) != 0x0) {
                                final ea6$b a4 = ea6.a;
                                l = ((ks4)h.m((re6)ls4.a)).l();
                                n26 = (n20 & 0xFFFFFC7F);
                            }
                            n25 = n26;
                            if ((n3 & 0x8) != 0x0) {
                                b = ls4.b(l, h);
                                n25 = (n26 & 0xFFFFE3FF);
                            }
                            if (n13 != 0) {
                                a2 = null;
                            }
                            jkh = companion;
                            n24 = n25;
                            oqp = a;
                            n23 = l;
                            n22 = b;
                            a3 = a2;
                            if (n16 == 0) {
                                break Label_0574;
                            }
                            n = 0;
                        }
                        h.s();
                        final ea6$b a5 = ea6.a;
                        final xo9 b2 = ry9.b;
                        final float n27 = ((e99)h.m((re6)b2)).C0 + n;
                        se6.a(new oll[] { ((mll)ll6.a).b((Object)new pr4(b)), ((mll)b2).b((Object)new e99(n27)) }, (gub)m8y.j(h, -1822160838, new jzr$a(companion, a, l, n27, n25, a2, n, (gub)gub)), h, 56);
                        jkh2 = companion;
                        oqp2 = a;
                        break Label_0856;
                    }
                    companion = jkh;
                    int n25 = n24;
                    a = oqp;
                    l = n23;
                    b = n22;
                    a2 = a3;
                    continue;
                }
            }
            h.H();
            jkh2 = companion;
            oqp2 = a;
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new jzr$b(jkh2, oqp2, l, b, a2, n, (gub)gub, n2, n3));
        }
    }
    
    public static final void b(final otb<oyv> otb, jkh companion, boolean b, oqp a, long l, long b2, a82 a2, float n, oth oth, final gub<? super m76, ? super Integer, oyv> gub, m76 m76, final int n2, final int n3) {
        zzd.f((Object)otb, "onClick");
        zzd.f((Object)gub, "content");
        final m76 h = m76.h(1560876237);
        int n4;
        if ((n3 & 0x1) != 0x0) {
            n4 = (n2 | 0x6);
        }
        else if ((n2 & 0xE) == 0x0) {
            int n5;
            if (h.P((Object)otb)) {
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
        int n9 = 0;
        Label_0152: {
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
                    n9 = (n4 | n8);
                    break Label_0152;
                }
            }
            n9 = n7;
        }
        final int n10 = n3 & 0x4;
        int n13 = 0;
        Label_0225: {
            int n11;
            if (n10 != 0) {
                n11 = (n9 | 0x180);
            }
            else {
                n11 = n9;
                if ((n2 & 0x380) == 0x0) {
                    int n12;
                    if (h.a(b)) {
                        n12 = 256;
                    }
                    else {
                        n12 = 128;
                    }
                    n13 = (n9 | n12);
                    break Label_0225;
                }
            }
            n13 = n11;
        }
        final int n14 = n3 & 0x8;
        int n15;
        if (n14 != 0) {
            n15 = (n13 | 0xC00);
        }
        else {
            n15 = n13;
            if ((n2 & 0x1C00) == 0x0) {
                int n16;
                if (h.P((Object)a)) {
                    n16 = 2048;
                }
                else {
                    n16 = 1024;
                }
                n15 = (n13 | n16);
            }
        }
        if ((0xE000 & n2) == 0x0) {
            int n17;
            if ((n3 & 0x10) == 0x0 && h.e(l)) {
                n17 = 16384;
            }
            else {
                n17 = 8192;
            }
            n15 |= n17;
        }
        if ((0x70000 & n2) == 0x0) {
            int n18;
            if ((n3 & 0x20) == 0x0 && h.e(b2)) {
                n18 = 131072;
            }
            else {
                n18 = 65536;
            }
            n15 |= n18;
        }
        final int n19 = n3 & 0x40;
        int n20;
        if (n19 != 0) {
            n20 = (n15 | 0x180000);
        }
        else {
            n20 = n15;
            if ((n2 & 0x380000) == 0x0) {
                int n21;
                if (h.P((Object)a2)) {
                    n21 = 1048576;
                }
                else {
                    n21 = 524288;
                }
                n20 = (n15 | n21);
            }
        }
        final int n22 = n3 & 0x80;
        int n23;
        if (n22 != 0) {
            n23 = (n20 | 0xC00000);
        }
        else {
            n23 = n20;
            if ((n2 & 0x1C00000) == 0x0) {
                int n24;
                if (h.b(n)) {
                    n24 = 8388608;
                }
                else {
                    n24 = 4194304;
                }
                n23 = (n20 | n24);
            }
        }
        final int n25 = n3 & 0x100;
        int n26;
        if (n25 != 0) {
            n26 = (n23 | 0x6000000);
        }
        else {
            n26 = n23;
            if ((n2 & 0xE000000) == 0x0) {
                int n27;
                if (h.P((Object)oth)) {
                    n27 = 67108864;
                }
                else {
                    n27 = 33554432;
                }
                n26 = (n23 | n27);
            }
        }
        int n29 = 0;
        Label_0647: {
            int n28;
            if ((n3 & 0x200) != 0x0) {
                n28 = 805306368;
            }
            else {
                n29 = n26;
                if ((0x70000000 & n2) != 0x0) {
                    break Label_0647;
                }
                if (h.P((Object)gub)) {
                    n28 = 536870912;
                }
                else {
                    n28 = 268435456;
                }
            }
            n29 = (n26 | n28);
        }
        a82 a3;
        oth oth2;
        jkh jkh2;
        oqp oqp2;
        if ((0x5B6DB6DB & n29) == 0x12492492 && h.i()) {
            h.H();
            final jkh jkh = companion;
            final oqp oqp = a;
            a3 = a2;
            oth2 = oth;
            jkh2 = jkh;
            oqp2 = oqp;
        }
        else {
            h.C();
            oth oth3;
            int n32;
            a82 a5;
            if ((n2 & 0x1) != 0x0 && !h.K()) {
                h.H();
                int n30 = n29;
                if ((n3 & 0x10) != 0x0) {
                    n30 = (n29 & 0xFFFF1FFF);
                }
                int n31 = n30;
                if ((n3 & 0x20) != 0x0) {
                    n31 = (n30 & 0xFFF8FFFF);
                }
                final jkh jkh3 = companion;
                final a82 a4 = a2;
                oth3 = oth;
                n32 = n31;
                jkh2 = jkh3;
                oqp2 = a;
                a5 = a4;
            }
            else {
                if (n6 != 0) {
                    companion = jkh.Companion;
                }
                if (n10 != 0) {
                    b = true;
                }
                if (n14 != 0) {
                    a = (oqp)v5m.a;
                }
                if ((n3 & 0x10) != 0x0) {
                    final ea6$b a6 = ea6.a;
                    l = ((ks4)h.m((re6)ls4.a)).l();
                    n29 &= 0xFFFF1FFF;
                }
                n32 = n29;
                if ((n3 & 0x20) != 0x0) {
                    b2 = ls4.b(l, h);
                    n32 = (n29 & 0xFFF8FFFF);
                }
                if (n19 != 0) {
                    a2 = null;
                }
                if (n22 != 0) {
                    n = 0;
                }
                if (n25 != 0) {
                    h.x(-492369756);
                    final Object y = h.y();
                    Objects.requireNonNull(m76.Companion);
                    Object c;
                    if ((c = y) == m76$a.b) {
                        c = bl0.c(h);
                    }
                    h.O();
                    oth = (oth)c;
                }
                final oth oth4 = oth;
                final oqp oqp3 = a;
                a5 = a2;
                final jkh jkh4 = companion;
                oth3 = oth4;
                oqp2 = oqp3;
                jkh2 = jkh4;
            }
            h.s();
            final ea6$b a7 = ea6.a;
            final xo9 b3 = ry9.b;
            final float n33 = ((e99)h.m((re6)b3)).C0 + n;
            final oll b4 = ((mll)ll6.a).b((Object)new pr4(b2));
            final oll b5 = ((mll)b3).b((Object)new e99(n33));
            m76 = h;
            se6.a(new oll[] { b4, b5 }, (gub)m8y.j(m76, 2031491085, new jzr$c(jkh2, oqp2, l, n33, n32, a5, n, oth3, b, (otb)otb, (gub)gub)), m76, 56);
            final a82 a8 = a5;
            oth2 = oth3;
            a3 = a8;
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new jzr$d((otb)otb, jkh2, b, oqp2, l, b2, a3, n, oth2, (gub)gub, n2, n3));
        }
    }
    
    public static final jkh c(jkh jkh, final oqp oqp, final long n, final a82 a82, final float n2) {
        final jkh b0 = oyz.b0(jkh, n2, oqp, 0L, 0L, 24);
        if (a82 != null) {
            jkh = t72.a(jkh.Companion, a82, oqp);
        }
        else {
            jkh = jkh.Companion;
        }
        return rp2.A(h6q.i(b0.E(jkh), n, oqp), oqp);
    }
    
    public static final long d(final long n, final qy9 qy9, final float n2, final m76 m76, final int n3) {
        m76.x(1561611256);
        final ea6$b a = ea6.a;
        long a2 = n;
        if (pr4.c(n, ((ks4)m76.m((re6)ls4.a)).l())) {
            a2 = n;
            if (qy9 != null) {
                a2 = qy9.a(n, n2, m76, (n3 & 0xE) | (n3 >> 3 & 0x70) | (n3 << 3 & 0x380));
            }
        }
        m76.O();
        return a2;
    }
}
