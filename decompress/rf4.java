import java.util.Map;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rf4
{
    public static final void a(final xc0 xc0, dlh companion, kks d, boolean b, int n, int n2, stb<? super qjs, vzv> f0, final stb<? super Integer, vzv> stb, final d86 d2, final int n3, final int n4) {
        e0e.f((Object)xc0, "text");
        e0e.f((Object)stb, "onClick");
        final d86 h = d2.h(-246609449);
        int n5;
        if ((n4 & 0x1) != 0x0) {
            n5 = (n3 | 0x6);
        }
        else if ((n3 & 0xE) == 0x0) {
            int n6;
            if (h.P((Object)xc0)) {
                n6 = 4;
            }
            else {
                n6 = 2;
            }
            n5 = (n6 | n3);
        }
        else {
            n5 = n3;
        }
        final int n7 = n4 & 0x2;
        int n10 = 0;
        Label_0152: {
            int n8;
            if (n7 != 0) {
                n8 = (n5 | 0x30);
            }
            else {
                n8 = n5;
                if ((n3 & 0x70) == 0x0) {
                    int n9;
                    if (h.P((Object)companion)) {
                        n9 = 32;
                    }
                    else {
                        n9 = 16;
                    }
                    n10 = (n5 | n9);
                    break Label_0152;
                }
            }
            n10 = n8;
        }
        final int n11 = n4 & 0x4;
        int n14 = 0;
        Label_0225: {
            int n12;
            if (n11 != 0) {
                n12 = (n10 | 0x180);
            }
            else {
                n12 = n10;
                if ((n3 & 0x380) == 0x0) {
                    int n13;
                    if (h.P((Object)d)) {
                        n13 = 256;
                    }
                    else {
                        n13 = 128;
                    }
                    n14 = (n10 | n13);
                    break Label_0225;
                }
            }
            n14 = n12;
        }
        final int n15 = n4 & 0x8;
        int n18 = 0;
        Label_0299: {
            int n16;
            if (n15 != 0) {
                n16 = (n14 | 0xC00);
            }
            else {
                n16 = n14;
                if ((n3 & 0x1C00) == 0x0) {
                    int n17;
                    if (h.a(b)) {
                        n17 = 2048;
                    }
                    else {
                        n17 = 1024;
                    }
                    n18 = (n14 | n17);
                    break Label_0299;
                }
            }
            n18 = n16;
        }
        final int n19 = n4 & 0x10;
        int n22 = 0;
        Label_0373: {
            int n20;
            if (n19 != 0) {
                n20 = (n18 | 0x6000);
            }
            else {
                n20 = n18;
                if ((n3 & 0xE000) == 0x0) {
                    int n21;
                    if (h.d(n)) {
                        n21 = 16384;
                    }
                    else {
                        n21 = 8192;
                    }
                    n22 = (n18 | n21);
                    break Label_0373;
                }
            }
            n22 = n20;
        }
        final int n23 = n4 & 0x20;
        int n24;
        if (n23 != 0) {
            n24 = (n22 | 0x30000);
        }
        else {
            n24 = n22;
            if ((n3 & 0x70000) == 0x0) {
                int n25;
                if (h.d(n2)) {
                    n25 = 131072;
                }
                else {
                    n25 = 65536;
                }
                n24 = (n22 | n25);
            }
        }
        final int n26 = n4 & 0x40;
        int n27;
        if (n26 != 0) {
            n27 = (n24 | 0x180000);
        }
        else {
            n27 = n24;
            if ((n3 & 0x380000) == 0x0) {
                int n28;
                if (h.P((Object)f0)) {
                    n28 = 1048576;
                }
                else {
                    n28 = 524288;
                }
                n27 = (n24 | n28);
            }
        }
        int n30 = 0;
        Label_0559: {
            int n29;
            if ((n4 & 0x80) != 0x0) {
                n29 = 12582912;
            }
            else {
                n30 = n27;
                if ((0x1C00000 & n3) != 0x0) {
                    break Label_0559;
                }
                if (h.P((Object)stb)) {
                    n29 = 8388608;
                }
                else {
                    n29 = 4194304;
                }
            }
            n30 = (n27 | n29);
        }
        if ((0x16DB6DB & n30) == 0x492492 && h.i()) {
            h.H();
        }
        else {
            if (n7 != 0) {
                companion = (dlh)dlh.Companion;
            }
            if (n11 != 0) {
                Objects.requireNonNull(kks.Companion);
                d = kks.d;
            }
            if (n15 != 0) {
                b = true;
            }
            if (n19 != 0) {
                Objects.requireNonNull(wjs.Companion);
                n = 1;
            }
            if (n23 != 0) {
                n2 = Integer.MAX_VALUE;
            }
            if (n26 != 0) {
                f0 = rf4$a.F0;
            }
            final sa6$b a = sa6.a;
            h.x(-492369756);
            final Object y = h.y();
            Objects.requireNonNull(d86.Companion);
            final d86$a$a b2 = d86$a.b;
            fvh w;
            if ((w = (fvh)y) == b2) {
                w = zzz.W((Object)null);
                h.p((Object)w);
            }
            h.O();
            final fvh fvh = w;
            final dlh.a companion2 = dlh.Companion;
            h.x(511388516);
            final boolean p11 = h.P((Object)fvh);
            final boolean p12 = h.P((Object)stb);
            final Object y2 = h.y();
            Object o;
            if ((p11 | p12) || (o = y2) == b2) {
                o = new rf4$d(fvh, (stb)stb, (mp6)null);
                h.p(o);
            }
            h.O();
            final dlh e = companion.E(q1s.a((dlh)companion2, (Object)stb, (hub)o));
            h.x(511388516);
            final boolean p13 = h.P((Object)fvh);
            final boolean p14 = h.P((Object)f0);
            final Object y3 = h.y();
            Object o2;
            if ((p13 | p14) || (o2 = y3) == b2) {
                o2 = new rf4$b(fvh, (stb)f0);
                h.p(o2);
            }
            h.O();
            rs1.a(xc0, e, d, (stb)o2, n, b, n2, (Map)null, h, (n30 & 0xE) | (n30 & 0x380) | (0xE000 & n30) | (n30 << 6 & 0x70000) | (n30 << 3 & 0x380000), 128);
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new rf4$c(xc0, companion, d, b, n, n2, (stb)f0, (stb)stb, n3, n4));
        }
    }
}
