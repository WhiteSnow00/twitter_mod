import java.util.Objects;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjs
{
    public static final lml<kks> a;
    
    static {
        jjs.a = (jp9)ef6.b((djq)jmr.a, (ptb)jjs$a.F0);
    }
    
    public static final void a(final kks kks, final hub<? super d86, ? super Integer, vzv> hub, d86 h, final int n) {
        e0e.f((Object)kks, "value");
        e0e.f((Object)hub, "content");
        h = h.h(1772272796);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (h.P((Object)kks)) {
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
            if (h.P((Object)hub)) {
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
            final sa6$b a = sa6.a;
            final jp9 a2 = jjs.a;
            ef6.a(new nml[] { ((lml<kks>)a2).b(((kks)h.m((df6)a2)).e(kks)) }, (hub)hub, h, (n4 & 0x70) | 0x8);
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new jjs$b(kks, (hub)hub, n));
        }
    }
    
    public static final void b(final xc0 xc0, dlh companion, long g, long c, mlb mlb, final qlb qlb, final qkb qkb, long c2, final xfs xfs, final efs efs, long c3, int n, boolean b, int n2, Map<String, wqd> map, stb<? super qjs, vzv> stb, kks kks, final d86 d86, final int n3, final int n4, final int n5) {
        e0e.f((Object)xc0, "text");
        final d86 h = d86.h(-422393234);
        int n6;
        if ((n5 & 0x1) != 0x0) {
            n6 = (n3 | 0x6);
        }
        else if ((n3 & 0xE) == 0x0) {
            int n7;
            if (h.P((Object)xc0)) {
                n7 = 4;
            }
            else {
                n7 = 2;
            }
            n6 = (n7 | n3);
        }
        else {
            n6 = n3;
        }
        final int n8 = n5 & 0x2;
        int n9;
        if (n8 != 0) {
            n9 = (n6 | 0x30);
        }
        else {
            n9 = n6;
            if ((n3 & 0x70) == 0x0) {
                int n10;
                if (h.P((Object)companion)) {
                    n10 = 32;
                }
                else {
                    n10 = 16;
                }
                n9 = (n6 | n10);
            }
        }
        final int n11 = n5 & 0x4;
        int n12;
        if (n11 != 0) {
            n12 = (n9 | 0x180);
        }
        else {
            n12 = n9;
            if ((n3 & 0x380) == 0x0) {
                int n13;
                if (h.e(g)) {
                    n13 = 256;
                }
                else {
                    n13 = 128;
                }
                n12 = (n9 | n13);
            }
        }
        final int n14 = n5 & 0x8;
        final int n15 = 1024;
        int n16;
        if (n14 != 0) {
            n16 = (n12 | 0xC00);
        }
        else {
            n16 = n12;
            if ((n3 & 0x1C00) == 0x0) {
                int n17;
                if (h.e(c)) {
                    n17 = 2048;
                }
                else {
                    n17 = 1024;
                }
                n16 = (n12 | n17);
            }
        }
        final int n18 = n5 & 0x10;
        int n19;
        if (n18 != 0) {
            n19 = (n16 | 0x6000);
        }
        else {
            n19 = n16;
            if ((n3 & 0xE000) == 0x0) {
                int n20;
                if (h.P((Object)mlb)) {
                    n20 = 16384;
                }
                else {
                    n20 = 8192;
                }
                n19 = (n16 | n20);
            }
        }
        final int n21 = n5 & 0x20;
        int n22;
        if (n21 != 0) {
            n22 = (n19 | 0x30000);
        }
        else {
            n22 = n19;
            if ((n3 & 0x70000) == 0x0) {
                int n23;
                if (h.P((Object)qlb)) {
                    n23 = 131072;
                }
                else {
                    n23 = 65536;
                }
                n22 = (n19 | n23);
            }
        }
        final int n24 = n5 & 0x40;
        int n25;
        if (n24 != 0) {
            n25 = (n22 | 0x180000);
        }
        else {
            n25 = n22;
            if ((n3 & 0x380000) == 0x0) {
                int n26;
                if (h.P((Object)qkb)) {
                    n26 = 1048576;
                }
                else {
                    n26 = 524288;
                }
                n25 = (n22 | n26);
            }
        }
        final int n27 = n5 & 0x80;
        int n28;
        if (n27 != 0) {
            n28 = (n25 | 0xC00000);
        }
        else {
            n28 = n25;
            if ((n3 & 0x1C00000) == 0x0) {
                int n29;
                if (h.e(c2)) {
                    n29 = 8388608;
                }
                else {
                    n29 = 4194304;
                }
                n28 = (n25 | n29);
            }
        }
        final int n30 = n5 & 0x100;
        int n31;
        if (n30 != 0) {
            n31 = (n28 | 0x6000000);
        }
        else {
            n31 = n28;
            if ((n3 & 0xE000000) == 0x0) {
                int n32;
                if (h.P((Object)xfs)) {
                    n32 = 67108864;
                }
                else {
                    n32 = 33554432;
                }
                n31 = (n28 | n32);
            }
        }
        final int n33 = n5 & 0x200;
        int n34;
        if (n33 != 0) {
            n34 = (n31 | 0x30000000);
        }
        else {
            n34 = n31;
            if ((n3 & 0x70000000) == 0x0) {
                int n35;
                if (h.P((Object)efs)) {
                    n35 = 536870912;
                }
                else {
                    n35 = 268435456;
                }
                n34 = (n31 | n35);
            }
        }
        final int n36 = n5 & 0x400;
        int n37;
        if (n36 != 0) {
            n37 = (n4 | 0x6);
        }
        else if ((n4 & 0xE) == 0x0) {
            int n38;
            if (h.e(c3)) {
                n38 = 4;
            }
            else {
                n38 = 2;
            }
            n37 = (n4 | n38);
        }
        else {
            n37 = n4;
        }
        final int n39 = n5 & 0x800;
        if (n39 != 0) {
            n37 |= 0x30;
        }
        else if ((n4 & 0x70) == 0x0) {
            int n40;
            if (h.d(n)) {
                n40 = 32;
            }
            else {
                n40 = 16;
            }
            n37 |= n40;
        }
        final int n41 = n37;
        final int n42 = n5 & 0x1000;
        int n43;
        if (n42 != 0) {
            n43 = (n41 | 0x180);
        }
        else {
            n43 = n41;
            if ((n4 & 0x380) == 0x0) {
                int n44;
                if (h.a(b)) {
                    n44 = 256;
                }
                else {
                    n44 = 128;
                }
                n43 = (n41 | n44);
            }
        }
        final int n45 = n5 & 0x2000;
        int n46;
        if (n45 != 0) {
            n46 = (n43 | 0xC00);
        }
        else {
            n46 = n43;
            if ((n4 & 0x1C00) == 0x0) {
                int n47 = n15;
                if (h.d(n2)) {
                    n47 = 2048;
                }
                n46 = (n43 | n47);
            }
        }
        final int n48 = n5 & 0x4000;
        int n49 = n46;
        if (n48 != 0) {
            n49 = (n46 | 0x2000);
        }
        final int n50 = n5 & 0x8000;
        int n53 = 0;
        Label_1043: {
            int n51;
            if (n50 != 0) {
                n51 = (n49 | 0x30000);
            }
            else {
                n51 = n49;
                if ((n4 & 0x70000) == 0x0) {
                    int n52;
                    if (h.P((Object)stb)) {
                        n52 = 131072;
                    }
                    else {
                        n52 = 65536;
                    }
                    n53 = (n49 | n52);
                    break Label_1043;
                }
            }
            n53 = n51;
        }
        if ((n4 & 0x380000) == 0x0) {
            int n54;
            if ((n5 & 0x10000) == 0x0 && h.P((Object)kks)) {
                n54 = 1048576;
            }
            else {
                n54 = 524288;
            }
            n53 |= n54;
        }
        stb stb2;
        kks kks2;
        qlb qlb2 = null;
        qkb qkb2;
        xfs xfs2 = null;
        efs efs2;
        if (n48 == 16384 && (0x5B6DB6DB & n34) == 0x12492492 && (0x2DB6DB & n53) == 0x92492 && h.i()) {
            h.H();
            final int n55 = n;
            n = n2;
            stb2 = stb;
            kks2 = kks;
            qlb2 = qlb;
            qkb2 = qkb;
            xfs2 = xfs;
            efs2 = efs;
            n2 = n55;
        }
        else {
            h.C();
            int n57 = 0;
            qkb qkb3 = null;
            efs efs5 = null;
            Object f0 = null;
            Object f2 = null;
            Label_1719: {
                Object o;
                long n58;
                long n59;
                long n60;
                qlb qlb3;
                mlb mlb2;
                int n61;
                efs efs3;
                boolean b2;
                int n62;
                dlh dlh;
                long n63;
                xfs xfs3;
                if ((n3 & 0x1) != 0x0 && !h.K()) {
                    h.H();
                    int n56 = n53;
                    if (n48 != 0) {
                        n56 = (n53 & 0xFFFF1FFF);
                    }
                    n57 = n56;
                    if ((n5 & 0x10000) != 0x0) {
                        n57 = (n56 & 0xFFC7FFFF);
                    }
                    o = map;
                    n58 = c;
                    n59 = c2;
                    n60 = g;
                    qkb3 = qkb;
                    qlb3 = qlb;
                    mlb2 = mlb;
                    n61 = n2;
                    efs3 = efs;
                    b2 = b;
                    n62 = n;
                    dlh = companion;
                    n63 = c3;
                    xfs3 = xfs;
                }
                else {
                    if (n8 != 0) {
                        companion = (dlh)dlh.Companion;
                    }
                    if (n11 != 0) {
                        Objects.requireNonNull(sr4.Companion);
                        g = sr4.g;
                    }
                    if (n14 != 0) {
                        Objects.requireNonNull(pks.Companion);
                        c = pks.c;
                    }
                    final efs efs4 = null;
                    if (n18 != 0) {
                        mlb = null;
                    }
                    if (n21 != 0) {
                        qlb2 = null;
                    }
                    else {
                        qlb2 = qlb;
                    }
                    qkb qkb4;
                    if (n24 != 0) {
                        qkb4 = null;
                    }
                    else {
                        qkb4 = qkb;
                    }
                    if (n27 != 0) {
                        Objects.requireNonNull(pks.Companion);
                        c2 = pks.c;
                    }
                    if (n30 != 0) {
                        xfs2 = null;
                    }
                    else {
                        xfs2 = xfs;
                    }
                    if (n33 != 0) {
                        efs5 = efs4;
                    }
                    else {
                        efs5 = efs;
                    }
                    if (n36 != 0) {
                        Objects.requireNonNull(pks.Companion);
                        c3 = pks.c;
                    }
                    if (n39 != 0) {
                        Objects.requireNonNull(wjs.Companion);
                        n = 1;
                    }
                    if (n42 != 0) {
                        b = true;
                    }
                    if (n45 != 0) {
                        n2 = Integer.MAX_VALUE;
                    }
                    int n64;
                    if (n48 != 0) {
                        f0 = m3a.F0;
                        n64 = (n53 & 0xFFFF1FFF);
                    }
                    else {
                        f0 = map;
                        n64 = n53;
                    }
                    if (n50 != 0) {
                        f2 = jjs$e.F0;
                    }
                    else {
                        f2 = stb;
                    }
                    xfs3 = xfs2;
                    n63 = c3;
                    dlh = companion;
                    n62 = n;
                    b2 = b;
                    n57 = n64;
                    efs3 = efs5;
                    n61 = n2;
                    mlb2 = mlb;
                    o = f0;
                    qlb3 = qlb2;
                    stb = (stb)f2;
                    qkb3 = qkb4;
                    n60 = g;
                    n59 = c2;
                    n58 = c;
                    if ((n5 & 0x10000) != 0x0) {
                        kks = (kks)h.m((df6)jjs.a);
                        n57 = (n64 & 0xFFC7FFFF);
                        qkb3 = qkb4;
                        break Label_1719;
                    }
                }
                xfs2 = xfs3;
                c3 = n63;
                companion = dlh;
                n = n62;
                b = b2;
                efs5 = efs3;
                n2 = n61;
                mlb = mlb2;
                f0 = o;
                qlb2 = qlb3;
                f2 = stb;
                g = n60;
                c2 = n59;
                c = n58;
            }
            h.s();
            final sa6$b a = sa6.a;
            h.x(1557618192);
            Objects.requireNonNull(sr4.Companion);
            final long g2 = sr4.g;
            long n65;
            if (g != g2) {
                n65 = g;
            }
            else {
                n65 = kks.d();
                if (n65 == g2) {
                    n65 = sr4.b(((sr4)h.m((df6)yl6.a)).a, ((Number)h.m((df6)xl6.a)).floatValue());
                }
            }
            h.O();
            final kks e = kks.e(new kks(n65, c, qlb2, mlb, qkb3, c2, xfs2, efs5, c3, 175952));
            final int n66 = n57 << 9;
            rs1.a(xc0, companion, e, (stb)f2, n, b, n2, (Map)f0, h, (n34 & 0x70) | (0x1000000 | (n34 & 0xE)) | (n57 >> 6 & 0x1C00) | (n66 & 0xE000) | (n66 & 0x70000) | (n66 & 0x380000), 0);
            efs2 = efs5;
            final int n67 = n2;
            stb2 = (stb)f2;
            qkb2 = qkb3;
            map = (Map)f0;
            n2 = n;
            kks2 = kks;
            n = n67;
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new jjs$f(xc0, companion, g, c, mlb, qlb2, qkb2, c2, xfs2, efs2, c3, n2, b, n, map, stb2, kks2, n3, n4, n5));
        }
    }
    
    public static final void c(final String s, dlh companion, long g, long c, mlb mlb, final qlb qlb, qkb qkb, long c2, final xfs xfs, final efs efs, long c3, int n, boolean b, int n2, final stb<? super qjs, vzv> stb, kks kks, final d86 d86, final int n3, final int n4, final int n5) {
        e0e.f((Object)s, "text");
        final d86 h = d86.h(-366126944);
        int n6;
        if ((n5 & 0x1) != 0x0) {
            n6 = (n3 | 0x6);
        }
        else if ((n3 & 0xE) == 0x0) {
            int n7;
            if (h.P((Object)s)) {
                n7 = 4;
            }
            else {
                n7 = 2;
            }
            n6 = (n7 | n3);
        }
        else {
            n6 = n3;
        }
        final int n8 = n5 & 0x2;
        int n9;
        if (n8 != 0) {
            n9 = (n6 | 0x30);
        }
        else {
            n9 = n6;
            if ((n3 & 0x70) == 0x0) {
                int n10;
                if (h.P((Object)companion)) {
                    n10 = 32;
                }
                else {
                    n10 = 16;
                }
                n9 = (n6 | n10);
            }
        }
        final int n11 = n5 & 0x4;
        int n12;
        if (n11 != 0) {
            n12 = (n9 | 0x180);
        }
        else {
            n12 = n9;
            if ((n3 & 0x380) == 0x0) {
                int n13;
                if (h.e(g)) {
                    n13 = 256;
                }
                else {
                    n13 = 128;
                }
                n12 = (n9 | n13);
            }
        }
        final int n14 = n5 & 0x8;
        final int n15 = 1024;
        int n16;
        if (n14 != 0) {
            n16 = (n12 | 0xC00);
        }
        else {
            n16 = n12;
            if ((n3 & 0x1C00) == 0x0) {
                int n17;
                if (h.e(c)) {
                    n17 = 2048;
                }
                else {
                    n17 = 1024;
                }
                n16 = (n12 | n17);
            }
        }
        final int n18 = n5 & 0x10;
        final int n19 = 8192;
        int n20;
        if (n18 != 0) {
            n20 = (n16 | 0x6000);
        }
        else {
            n20 = n16;
            if ((n3 & 0xE000) == 0x0) {
                int n21;
                if (h.P((Object)mlb)) {
                    n21 = 16384;
                }
                else {
                    n21 = 8192;
                }
                n20 = (n16 | n21);
            }
        }
        final int n22 = n5 & 0x20;
        final int n23 = 65536;
        int n24;
        if (n22 != 0) {
            n24 = (n20 | 0x30000);
        }
        else {
            n24 = n20;
            if ((n3 & 0x70000) == 0x0) {
                int n25;
                if (h.P((Object)qlb)) {
                    n25 = 131072;
                }
                else {
                    n25 = 65536;
                }
                n24 = (n20 | n25);
            }
        }
        final int n26 = n5 & 0x40;
        int n27;
        if (n26 != 0) {
            n27 = (n24 | 0x180000);
        }
        else {
            n27 = n24;
            if ((n3 & 0x380000) == 0x0) {
                int n28;
                if (h.P((Object)qkb)) {
                    n28 = 1048576;
                }
                else {
                    n28 = 524288;
                }
                n27 = (n24 | n28);
            }
        }
        final int n29 = n5 & 0x80;
        int n30;
        if (n29 != 0) {
            n30 = (n27 | 0xC00000);
        }
        else {
            n30 = n27;
            if ((n3 & 0x1C00000) == 0x0) {
                int n31;
                if (h.e(c2)) {
                    n31 = 8388608;
                }
                else {
                    n31 = 4194304;
                }
                n30 = (n27 | n31);
            }
        }
        final int n32 = n5 & 0x100;
        int n33;
        if (n32 != 0) {
            n33 = (n30 | 0x6000000);
        }
        else {
            n33 = n30;
            if ((n3 & 0xE000000) == 0x0) {
                int n34;
                if (h.P((Object)xfs)) {
                    n34 = 67108864;
                }
                else {
                    n34 = 33554432;
                }
                n33 = (n30 | n34);
            }
        }
        final int n35 = n5 & 0x200;
        int n36;
        if (n35 != 0) {
            n36 = (n33 | 0x30000000);
        }
        else {
            n36 = n33;
            if ((n3 & 0x70000000) == 0x0) {
                int n37;
                if (h.P((Object)efs)) {
                    n37 = 536870912;
                }
                else {
                    n37 = 268435456;
                }
                n36 = (n33 | n37);
            }
        }
        final int n38 = n5 & 0x400;
        int n39;
        if (n38 != 0) {
            n39 = (n4 | 0x6);
        }
        else if ((n4 & 0xE) == 0x0) {
            int n40;
            if (h.e(c3)) {
                n40 = 4;
            }
            else {
                n40 = 2;
            }
            n39 = (n4 | n40);
        }
        else {
            n39 = n4;
        }
        final int n41 = n5 & 0x800;
        int n42;
        if (n41 != 0) {
            n42 = (n39 | 0x30);
        }
        else {
            n42 = n39;
            if ((n4 & 0x70) == 0x0) {
                int n43;
                if (h.d(n)) {
                    n43 = 32;
                }
                else {
                    n43 = 16;
                }
                n42 = (n39 | n43);
            }
        }
        final int n44 = n5 & 0x1000;
        int n45;
        if (n44 != 0) {
            n45 = (n42 | 0x180);
        }
        else {
            n45 = n42;
            if ((n4 & 0x380) == 0x0) {
                int n46;
                if (h.a(b)) {
                    n46 = 256;
                }
                else {
                    n46 = 128;
                }
                n45 = (n42 | n46);
            }
        }
        final int n47 = n5 & 0x2000;
        int n50 = 0;
        Label_0954: {
            int n48;
            if (n47 != 0) {
                n48 = (n45 | 0xC00);
            }
            else {
                n48 = n45;
                if ((n4 & 0x1C00) == 0x0) {
                    int n49 = n15;
                    if (h.d(n2)) {
                        n49 = 2048;
                    }
                    n50 = (n45 | n49);
                    break Label_0954;
                }
            }
            n50 = n48;
        }
        final int n51 = n5 & 0x4000;
        int n54 = 0;
        Label_1025: {
            int n52;
            if (n51 != 0) {
                n52 = (n50 | 0x6000);
            }
            else {
                n52 = n50;
                if ((n4 & 0xE000) == 0x0) {
                    int n53 = n19;
                    if (h.P((Object)stb)) {
                        n53 = 16384;
                    }
                    n54 = (n50 | n53);
                    break Label_1025;
                }
            }
            n54 = n52;
        }
        if ((n4 & 0x70000) == 0x0) {
            int n55 = n23;
            if ((n5 & 0x8000) == 0x0) {
                n55 = n23;
                if (h.P((Object)kks)) {
                    n55 = 131072;
                }
            }
            n54 |= n55;
        }
        stb stb2;
        kks kks2;
        qlb qlb2;
        xfs xfs2;
        efs efs2;
        if ((n36 & 0x5B6DB6DB) == 0x12492492 && (0x5B6DB & n54) == 0x12492 && h.i()) {
            h.H();
            stb2 = stb;
            kks2 = kks;
            qlb2 = qlb;
            xfs2 = xfs;
            efs2 = efs;
        }
        else {
            h.C();
            int n56 = 0;
            qlb qlb4 = null;
            xfs xfs4 = null;
            efs efs5 = null;
            Object f0 = null;
            Label_1622: {
                Object o;
                long n57;
                long n58;
                long n59;
                qkb qkb2;
                qlb qlb3;
                mlb mlb2;
                int n60;
                efs efs3;
                int n61;
                boolean b2;
                dlh dlh;
                long n62;
                xfs xfs3;
                if ((n3 & 0x1) != 0x0 && !h.K()) {
                    h.H();
                    n56 = n54;
                    if ((n5 & 0x8000) != 0x0) {
                        n56 = (n54 & 0xFFF8FFFF);
                    }
                    o = stb;
                    n57 = c;
                    n58 = c2;
                    n59 = g;
                    qkb2 = qkb;
                    qlb3 = qlb;
                    mlb2 = mlb;
                    n60 = n2;
                    efs3 = efs;
                    n61 = n;
                    b2 = b;
                    dlh = companion;
                    n62 = c3;
                    xfs3 = xfs;
                }
                else {
                    if (n8 != 0) {
                        companion = (dlh)dlh.Companion;
                    }
                    if (n11 != 0) {
                        Objects.requireNonNull(sr4.Companion);
                        g = sr4.g;
                    }
                    if (n14 != 0) {
                        Objects.requireNonNull(pks.Companion);
                        c = pks.c;
                    }
                    final efs efs4 = null;
                    if (n18 != 0) {
                        mlb = null;
                    }
                    if (n22 != 0) {
                        qlb4 = null;
                    }
                    else {
                        qlb4 = qlb;
                    }
                    if (n26 != 0) {
                        qkb = null;
                    }
                    if (n29 != 0) {
                        Objects.requireNonNull(pks.Companion);
                        c2 = pks.c;
                    }
                    if (n32 != 0) {
                        xfs4 = null;
                    }
                    else {
                        xfs4 = xfs;
                    }
                    if (n35 != 0) {
                        efs5 = efs4;
                    }
                    else {
                        efs5 = efs;
                    }
                    if (n38 != 0) {
                        Objects.requireNonNull(pks.Companion);
                        c3 = pks.c;
                    }
                    if (n41 != 0) {
                        Objects.requireNonNull(wjs.Companion);
                        n = 1;
                    }
                    if (n44 != 0) {
                        b = true;
                    }
                    if (n47 != 0) {
                        n2 = Integer.MAX_VALUE;
                    }
                    if (n51 != 0) {
                        f0 = jjs$c.F0;
                    }
                    else {
                        f0 = stb;
                    }
                    xfs3 = xfs4;
                    n62 = c3;
                    dlh = companion;
                    b2 = b;
                    n56 = n54;
                    n61 = n;
                    efs3 = efs5;
                    n60 = n2;
                    mlb2 = mlb;
                    o = f0;
                    qlb3 = qlb4;
                    qkb2 = qkb;
                    n59 = g;
                    n58 = c2;
                    n57 = c;
                    if ((n5 & 0x8000) != 0x0) {
                        kks = (kks)h.m((df6)jjs.a);
                        n56 = (n54 & 0xFFF8FFFF);
                        break Label_1622;
                    }
                }
                xfs4 = xfs3;
                c3 = n62;
                companion = dlh;
                b = b2;
                n = n61;
                efs5 = efs3;
                n2 = n60;
                mlb = mlb2;
                f0 = o;
                qlb4 = qlb3;
                qkb = qkb2;
                g = n59;
                c2 = n58;
                c = n57;
            }
            h.s();
            final sa6$b a = sa6.a;
            h.x(1557613088);
            Objects.requireNonNull(sr4.Companion);
            final long g2 = sr4.g;
            long n63;
            if (g != g2) {
                n63 = g;
            }
            else {
                n63 = kks.d();
                if (n63 == g2) {
                    n63 = sr4.b(((sr4)h.m((df6)yl6.a)).a, ((Number)h.m((df6)xl6.a)).floatValue());
                }
            }
            h.O();
            final kks e = kks.e(new kks(n63, c, qlb4, mlb, qkb, c2, xfs4, efs5, c3, 175952));
            final int n64 = n56 << 9;
            rs1.b(s, companion, e, (stb)f0, n, b, n2, h, (n36 & 0x70) | (n36 & 0xE) | (n56 >> 3 & 0x1C00) | (n64 & 0xE000) | (n64 & 0x70000) | (n64 & 0x380000), 0);
            efs2 = efs5;
            stb2 = (stb)f0;
            final kks kks3 = kks;
            xfs2 = xfs4;
            qlb2 = qlb4;
            kks2 = kks3;
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new jjs$d(s, companion, g, c, mlb, qlb2, qkb, c2, xfs2, efs2, c3, n, b, n2, stb2, kks2, n3, n4, n5));
        }
    }
}
