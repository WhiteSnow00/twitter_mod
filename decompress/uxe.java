import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uxe
{
    public static final void a(final s8c s8c, jkh companion, cze cze, urj urj, boolean b, ks0$l ks0$l, ks0$d b2, z6b z6b, boolean b3, final rtb<? super yye, oyv> rtb, final m76 m76, final int n, final int n2) {
        zzd.f((Object)s8c, "columns");
        zzd.f((Object)rtb, "content");
        final m76 h = m76.h(1485410512);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)s8c)) {
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
        if ((n & 0x380) == 0x0) {
            int n8;
            if ((n2 & 0x4) == 0x0 && h.P((Object)cze)) {
                n8 = 256;
            }
            else {
                n8 = 128;
            }
            n6 |= n8;
        }
        final int n9 = n2 & 0x8;
        int n10;
        if (n9 != 0) {
            n10 = (n6 | 0xC00);
        }
        else {
            n10 = n6;
            if ((n & 0x1C00) == 0x0) {
                int n11;
                if (h.P((Object)urj)) {
                    n11 = 2048;
                }
                else {
                    n11 = 1024;
                }
                n10 = (n6 | n11);
            }
        }
        final int n12 = n2 & 0x10;
        int n13;
        if (n12 != 0) {
            n13 = (n10 | 0x6000);
        }
        else {
            n13 = n10;
            if ((n & 0xE000) == 0x0) {
                int n14;
                if (h.a(b)) {
                    n14 = 16384;
                }
                else {
                    n14 = 8192;
                }
                n13 = (n10 | n14);
            }
        }
        if ((0x70000 & n) == 0x0) {
            int n15;
            if ((n2 & 0x20) == 0x0 && h.P((Object)ks0$l)) {
                n15 = 131072;
            }
            else {
                n15 = 65536;
            }
            n13 |= n15;
        }
        final ks0$l ks0$l2 = ks0$l;
        final int n16 = n2 & 0x40;
        int n17;
        if (n16 != 0) {
            n17 = (n13 | 0x180000);
        }
        else {
            n17 = n13;
            if ((n & 0x380000) == 0x0) {
                int n18;
                if (h.P((Object)b2)) {
                    n18 = 1048576;
                }
                else {
                    n18 = 524288;
                }
                n17 = (n13 | n18);
            }
        }
        final ks0$d ks0$d = b2;
        if ((n & 0x1C00000) == 0x0) {
            int n19;
            if ((n2 & 0x80) == 0x0 && h.P((Object)z6b)) {
                n19 = 8388608;
            }
            else {
                n19 = 4194304;
            }
            n17 |= n19;
        }
        final int n20 = n2 & 0x100;
        int n21;
        if (n20 != 0) {
            n21 = (n17 | 0x6000000);
        }
        else {
            n21 = n17;
            if ((n & 0xE000000) == 0x0) {
                int n22;
                if (h.a(b3)) {
                    n22 = 67108864;
                }
                else {
                    n22 = 33554432;
                }
                n21 = (n17 | n22);
            }
        }
        boolean b4 = b3;
        int n24 = 0;
        Label_0636: {
            int n23;
            if ((n2 & 0x200) != 0x0) {
                n23 = 805306368;
            }
            else {
                n24 = n21;
                if ((n & 0x70000000) != 0x0) {
                    break Label_0636;
                }
                if (h.P((Object)rtb)) {
                    n23 = 536870912;
                }
                else {
                    n23 = 268435456;
                }
            }
            n24 = (n21 | n23);
        }
        jkh jkh;
        cze cze2;
        ks0$l ks0$l3;
        ks0$d ks0$d2;
        z6b z6b2;
        if ((0x5B6DB6DB & n24) == 0x12492492 && h.i()) {
            h.H();
            jkh = companion;
            cze2 = cze;
            ks0$l3 = ks0$l2;
            ks0$d2 = ks0$d;
            z6b2 = z6b;
        }
        else {
            h.C();
            z6b z6b3;
            urj urj2;
            jkh jkh3;
            ks0$d ks0$d3;
            if ((n & 0x1) != 0x0 && !h.K()) {
                h.H();
                int n25 = n24;
                if ((n2 & 0x4) != 0x0) {
                    n25 = (n24 & 0xFFFFFC7F);
                }
                int n26 = n25;
                if ((n2 & 0x20) != 0x0) {
                    n26 = (n25 & 0xFFF8FFFF);
                }
                int n27 = n26;
                if ((n2 & 0x80) != 0x0) {
                    n27 = (n26 & 0xFE3FFFFF);
                }
                final jkh jkh2 = companion;
                cze2 = cze;
                ks0$l3 = ks0$l2;
                b3 = b4;
                z6b3 = z6b;
                urj2 = urj;
                jkh3 = jkh2;
                n24 = n27;
                ks0$d3 = ks0$d;
            }
            else {
                if (n5 != 0) {
                    companion = jkh.Companion;
                }
                if ((n2 & 0x4) != 0x0) {
                    h.x(29186956);
                    final ea6$b a = ea6.a;
                    Objects.requireNonNull(cze.Companion);
                    final dto<Object, Object> u = (dto<Object, Object>)cze.u;
                    h.x(511388516);
                    final boolean p13 = h.P((Object)0);
                    final boolean p14 = h.P((Object)0);
                    Object y = h.y();
                    Label_0943: {
                        if (!(p13 | p14)) {
                            Objects.requireNonNull(m76.Companion);
                            if (y != m76$a.b) {
                                break Label_0943;
                            }
                        }
                        y = new eze(0, 0);
                        h.p(y);
                    }
                    h.O();
                    cze = (cze)rez.E(new Object[0], (dto)u, (String)null, (otb)y, h, 4);
                    h.O();
                    n24 &= 0xFFFFFC7F;
                }
                final boolean b5 = false;
                if (n9 != 0) {
                    final float n28 = 0;
                    urj = (urj)new vrj(n28, n28, n28, n28);
                }
                if (n12 != 0) {
                    b = b5;
                }
                if ((n2 & 0x20) != 0x0) {
                    final ks0 a2 = ks0.a;
                    if (!b) {
                        ks0$l = (ks0$l)ks0.d;
                    }
                    else {
                        ks0$l = (ks0$l)ks0.e;
                    }
                    n24 &= 0xFFF8FFFF;
                }
                if (n16 != 0) {
                    final ks0 a3 = ks0.a;
                    b2 = (ks0$d)ks0.b;
                }
                if ((n2 & 0x80) != 0x0) {
                    h.x(1107739818);
                    final ea6$b a4 = ea6.a;
                    final qb8 a5 = o1r.a(h);
                    h.x(1157296644);
                    final boolean p15 = h.P((Object)a5);
                    final Object y2 = h.y();
                    nh8 nh8 = null;
                    Label_1196: {
                        if (!p15) {
                            Objects.requireNonNull(m76.Companion);
                            if ((nh8 = (nh8)y2) != m76$a.b) {
                                break Label_1196;
                            }
                        }
                        nh8 = new nh8(a5);
                        h.p((Object)nh8);
                    }
                    h.O();
                    z6b = (z6b)nh8;
                    h.O();
                    n24 &= 0xFE3FFFFF;
                }
                if (n20 != 0) {
                    b3 = true;
                }
                final ks0$l ks0$l4 = ks0$l;
                final ks0$d ks0$d4 = b2;
                z6b3 = z6b;
                jkh3 = companion;
                ks0$l3 = ks0$l4;
                cze2 = cze;
                urj2 = urj;
                ks0$d3 = ks0$d4;
            }
            h.s();
            final ea6$b a6 = ea6.a;
            final int n29 = n24 >> 3;
            h.x(-1355301804);
            h.x(1618982084);
            final boolean p16 = h.P((Object)s8c);
            final boolean p17 = h.P((Object)ks0$d3);
            final boolean p18 = h.P((Object)urj2);
            final Object y3 = h.y();
            Object o = null;
            Label_1390: {
                if (!(p16 | p17 | p18)) {
                    Objects.requireNonNull(m76.Companion);
                    if ((o = y3) != m76$a.b) {
                        break Label_1390;
                    }
                }
                o = new vxe(urj2, s8c, ks0$d3);
                h.p(o);
            }
            h.O();
            final gub gub = (gub)o;
            h.O();
            final int n30 = n24 << 9;
            mye.a(jkh3, cze2, gub, urj2, b, true, z6b3, b3, ks0$l3, ks0$d3, (rtb)rtb, h, (n29 & 0x1C00000) | (0x30000 | (n29 & 0xE) | (n29 & 0x70) | (n24 & 0x1C00) | (0xE000 & n24) | (n29 & 0x380000)) | (n30 & 0xE000000) | (n30 & 0x70000000), n24 >> 27 & 0xE, 0);
            ks0$d2 = ks0$d3;
            urj = urj2;
            b4 = b3;
            z6b2 = z6b3;
            jkh = jkh3;
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new uxe$a(s8c, jkh, cze2, urj, b, ks0$l3, ks0$d2, z6b2, b4, (rtb)rtb, n, n2));
        }
    }
}
