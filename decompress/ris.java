import java.util.Objects;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ris
{
    public static final zll<sjs> a;
    
    static {
        ris.a = (eo9)xd6.b((hiq)mlr.a, (nsb)ris$a.D0);
    }
    
    public static final void a(final sjs sjs, final ftb<? super x66, ? super Integer, fzv> ftb, x66 h, final int n) {
        czd.f((Object)sjs, "value");
        czd.f((Object)ftb, "content");
        h = h.h(1772272796);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (h.P((Object)sjs)) {
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
            if (h.P((Object)ftb)) {
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
            final n96$b a = n96.a;
            final eo9 a2 = ris.a;
            xd6.a(new bml[] { a2.b((Object)((sjs)h.m((wd6)a2)).e(sjs)) }, (ftb)ftb, h, (n4 & 0x70) | 0x8);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ris$b(sjs, (ftb)ftb, n));
        }
    }
    
    public static final void b(final xc0 xc0, okh companion, long g, long c, lkb lkb, pkb pkb, final pjb pjb, long c2, final ffs ffs, final mes mes, long c3, int n, boolean b, int n2, final Map<String, upd> map, qsb<? super yis, fzv> qsb, sjs sjs, final x66 x66, final int n3, final int n4, final int n5) {
        czd.f((Object)xc0, "text");
        final x66 h = x66.h(-422393234);
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
                if (h.P((Object)lkb)) {
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
                if (h.P((Object)pkb)) {
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
                if (h.P((Object)pjb)) {
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
                if (h.P((Object)ffs)) {
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
                if (h.P((Object)mes)) {
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
                    if (h.P((Object)qsb)) {
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
            if ((n5 & 0x10000) == 0x0 && h.P((Object)sjs)) {
                n54 = 1048576;
            }
            else {
                n54 = 524288;
            }
            n53 |= n54;
        }
        mes mes2 = null;
        Object d0 = null;
        sjs sjs2;
        lkb lkb3;
        pkb pkb3;
        pjb pjb2;
        ffs ffs2;
        if (n48 == 16384 && (0x5B6DB6DB & n34) == 0x12492492 && (0x2DB6DB & n53) == 0x92492 && h.i()) {
            h.H();
            final long n55 = c;
            final lkb lkb2 = lkb;
            final pkb pkb2 = pkb;
            mes2 = mes;
            c = c3;
            d0 = map;
            sjs2 = sjs;
            c3 = n55;
            lkb3 = lkb2;
            pkb3 = pkb2;
            pjb2 = pjb;
            ffs2 = ffs;
        }
        else {
            h.C();
            int n57 = 0;
            pjb pjb3 = null;
            ffs ffs4 = null;
            Object d2 = null;
            Label_1727: {
                Object o;
                long n58;
                long n59;
                long n60;
                pkb pkb4;
                Object o2;
                lkb lkb4;
                int n61;
                mes mes3;
                boolean b2;
                int n62;
                okh okh;
                long n63;
                ffs ffs3;
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
                    o = qsb;
                    n58 = c;
                    n59 = c2;
                    n60 = g;
                    pjb3 = pjb;
                    pkb4 = pkb;
                    o2 = map;
                    lkb4 = lkb;
                    n61 = n2;
                    mes3 = mes;
                    b2 = b;
                    n62 = n;
                    okh = companion;
                    n63 = c3;
                    ffs3 = ffs;
                }
                else {
                    if (n8 != 0) {
                        companion = (okh)okh.Companion;
                    }
                    if (n11 != 0) {
                        Objects.requireNonNull(nq4.Companion);
                        g = nq4.g;
                    }
                    if (n14 != 0) {
                        Objects.requireNonNull(xjs.Companion);
                        c = xjs.c;
                    }
                    final mes mes4 = null;
                    if (n18 != 0) {
                        lkb = null;
                    }
                    if (n21 != 0) {
                        pkb = null;
                    }
                    pjb pjb4;
                    if (n24 != 0) {
                        pjb4 = null;
                    }
                    else {
                        pjb4 = pjb;
                    }
                    if (n27 != 0) {
                        Objects.requireNonNull(xjs.Companion);
                        c2 = xjs.c;
                    }
                    if (n30 != 0) {
                        ffs4 = null;
                    }
                    else {
                        ffs4 = ffs;
                    }
                    if (n33 != 0) {
                        mes2 = mes4;
                    }
                    else {
                        mes2 = mes;
                    }
                    if (n36 != 0) {
                        Objects.requireNonNull(xjs.Companion);
                        c3 = xjs.c;
                    }
                    if (n39 != 0) {
                        Objects.requireNonNull(ejs.Companion);
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
                        d0 = k2a.D0;
                        n64 = (n53 & 0xFFFF1FFF);
                    }
                    else {
                        d0 = map;
                        n64 = n53;
                    }
                    if (n50 != 0) {
                        d2 = ris$e.D0;
                    }
                    else {
                        d2 = qsb;
                    }
                    ffs3 = ffs4;
                    n63 = c3;
                    okh = companion;
                    n62 = n;
                    b2 = b;
                    n57 = n64;
                    mes3 = mes2;
                    n61 = n2;
                    lkb4 = lkb;
                    o2 = d0;
                    pkb4 = pkb;
                    o = d2;
                    pjb3 = pjb4;
                    n60 = g;
                    n59 = c2;
                    n58 = c;
                    if ((n5 & 0x10000) != 0x0) {
                        sjs = (sjs)h.m((wd6)ris.a);
                        n57 = (n64 & 0xFFC7FFFF);
                        pjb3 = pjb4;
                        break Label_1727;
                    }
                }
                ffs4 = ffs3;
                c3 = n63;
                companion = okh;
                n = n62;
                b = b2;
                mes2 = mes3;
                n2 = n61;
                lkb = lkb4;
                d0 = o2;
                pkb = pkb4;
                d2 = o;
                g = n60;
                c2 = n59;
                c = n58;
            }
            h.s();
            final n96$b a = n96.a;
            h.x(1557618192);
            Objects.requireNonNull(nq4.Companion);
            final long g2 = nq4.g;
            long n65;
            if (g != g2) {
                n65 = g;
            }
            else {
                n65 = sjs.d();
                if (n65 == g2) {
                    n65 = nq4.b(((nq4)h.m((wd6)sk6.a)).a, ((Number)h.m((wd6)rk6.a)).floatValue());
                }
            }
            h.O();
            final sjs e = sjs.e(new sjs(n65, c, pkb, lkb, pjb3, c2, ffs4, mes2, c3, 175952));
            final int n66 = n57 << 9;
            ks1.a(xc0, companion, e, (qsb<? super yis, fzv>)d2, n, b, n2, (Map<String, upd>)d0, h, (n34 & 0x70) | (0x1000000 | (n34 & 0xE)) | (n57 >> 6 & 0x1C00) | (n66 & 0xE000) | (n66 & 0x70000) | (n66 & 0x380000), 0);
            final qsb<? super yis, fzv> qsb2 = (qsb<? super yis, fzv>)d2;
            final pjb pjb5 = pjb3;
            final lkb lkb5 = lkb;
            final long n67 = c;
            sjs2 = sjs;
            qsb = qsb2;
            c = c3;
            ffs2 = ffs4;
            pjb2 = pjb5;
            pkb3 = pkb;
            lkb3 = lkb5;
            c3 = n67;
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ris$f(xc0, companion, g, c3, lkb3, pkb3, pjb2, c2, ffs2, mes2, c, n, b, n2, (Map)d0, (qsb)qsb, sjs2, n3, n4, n5));
        }
    }
    
    public static final void c(final String s, okh companion, long g, long c, lkb lkb, final pkb pkb, pjb pjb, long c2, final ffs ffs, final mes mes, long c3, int n, boolean b, int n2, final qsb<? super yis, fzv> qsb, sjs sjs, final x66 x66, final int n3, final int n4, final int n5) {
        czd.f((Object)s, "text");
        final x66 h = x66.h(-366126944);
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
                if (h.P((Object)lkb)) {
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
                if (h.P((Object)pkb)) {
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
                if (h.P((Object)pjb)) {
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
                if (h.P((Object)ffs)) {
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
                if (h.P((Object)mes)) {
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
                    if (h.P((Object)qsb)) {
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
                if (h.P((Object)sjs)) {
                    n55 = 131072;
                }
            }
            n54 |= n55;
        }
        sjs sjs2;
        pkb pkb2;
        pjb pjb3;
        ffs ffs2;
        mes mes2 = null;
        qsb<? super yis, fzv> qsb2;
        if ((n36 & 0x5B6DB6DB) == 0x12492492 && (0x5B6DB & n54) == 0x12492 && h.i()) {
            h.H();
            final pjb pjb2 = pjb;
            final long n56 = c3;
            sjs2 = sjs;
            c3 = g;
            pkb2 = pkb;
            pjb3 = pjb2;
            ffs2 = ffs;
            mes2 = mes;
            g = n56;
            qsb2 = qsb;
        }
        else {
            h.C();
            int n57 = 0;
            pkb pkb4 = null;
            ffs ffs4 = null;
            Object d0 = null;
            Label_1636: {
                Object o;
                long n58;
                long n59;
                long n60;
                pjb pjb4;
                pkb pkb3;
                lkb lkb2;
                int n61;
                mes mes3;
                int n62;
                boolean b2;
                okh okh;
                long n63;
                ffs ffs3;
                if ((n3 & 0x1) != 0x0 && !h.K()) {
                    h.H();
                    n57 = n54;
                    if ((n5 & 0x8000) != 0x0) {
                        n57 = (n54 & 0xFFF8FFFF);
                    }
                    o = qsb;
                    n58 = c;
                    n59 = c2;
                    n60 = g;
                    pjb4 = pjb;
                    pkb3 = pkb;
                    lkb2 = lkb;
                    n61 = n2;
                    mes3 = mes;
                    n62 = n;
                    b2 = b;
                    okh = companion;
                    n63 = c3;
                    ffs3 = ffs;
                }
                else {
                    if (n8 != 0) {
                        companion = (okh)okh.Companion;
                    }
                    if (n11 != 0) {
                        Objects.requireNonNull(nq4.Companion);
                        g = nq4.g;
                    }
                    if (n14 != 0) {
                        Objects.requireNonNull(xjs.Companion);
                        c = xjs.c;
                    }
                    final mes mes4 = null;
                    if (n18 != 0) {
                        lkb = null;
                    }
                    if (n22 != 0) {
                        pkb4 = null;
                    }
                    else {
                        pkb4 = pkb;
                    }
                    if (n26 != 0) {
                        pjb = null;
                    }
                    if (n29 != 0) {
                        Objects.requireNonNull(xjs.Companion);
                        c2 = xjs.c;
                    }
                    if (n32 != 0) {
                        ffs4 = null;
                    }
                    else {
                        ffs4 = ffs;
                    }
                    if (n35 != 0) {
                        mes2 = mes4;
                    }
                    else {
                        mes2 = mes;
                    }
                    if (n38 != 0) {
                        Objects.requireNonNull(xjs.Companion);
                        c3 = xjs.c;
                    }
                    if (n41 != 0) {
                        Objects.requireNonNull(ejs.Companion);
                        n = 1;
                    }
                    if (n44 != 0) {
                        b = true;
                    }
                    if (n47 != 0) {
                        n2 = Integer.MAX_VALUE;
                    }
                    if (n51 != 0) {
                        d0 = ris$c.D0;
                    }
                    else {
                        d0 = qsb;
                    }
                    ffs3 = ffs4;
                    n63 = c3;
                    okh = companion;
                    b2 = b;
                    n57 = n54;
                    n62 = n;
                    mes3 = mes2;
                    n61 = n2;
                    lkb2 = lkb;
                    o = d0;
                    pkb3 = pkb4;
                    pjb4 = pjb;
                    n60 = g;
                    n59 = c2;
                    n58 = c;
                    if ((n5 & 0x8000) != 0x0) {
                        sjs = (sjs)h.m((wd6)ris.a);
                        n57 = (n54 & 0xFFF8FFFF);
                        break Label_1636;
                    }
                }
                ffs4 = ffs3;
                c3 = n63;
                companion = okh;
                b = b2;
                n = n62;
                mes2 = mes3;
                n2 = n61;
                lkb = lkb2;
                d0 = o;
                pkb4 = pkb3;
                pjb = pjb4;
                g = n60;
                c2 = n59;
                c = n58;
            }
            h.s();
            final n96$b a = n96.a;
            h.x(1557613088);
            Objects.requireNonNull(nq4.Companion);
            final long g2 = nq4.g;
            long n64;
            if (g != g2) {
                n64 = g;
            }
            else {
                n64 = sjs.d();
                if (n64 == g2) {
                    n64 = nq4.b(((nq4)h.m((wd6)sk6.a)).a, ((Number)h.m((wd6)rk6.a)).floatValue());
                }
            }
            h.O();
            final sjs e = sjs.e(new sjs(n64, c, pkb4, lkb, pjb, c2, ffs4, mes2, c3, 175952));
            final int n65 = n57 << 9;
            ks1.b(s, companion, e, (qsb<? super yis, fzv>)d0, n, b, n2, h, (n36 & 0x70) | (n36 & 0xE) | (n57 >> 3 & 0x1C00) | (n65 & 0xE000) | (n65 & 0x70000) | (n65 & 0x380000), 0);
            final qsb<? super yis, fzv> qsb3 = (qsb<? super yis, fzv>)d0;
            sjs2 = sjs;
            final pjb pjb5 = pjb;
            final long n66 = c3;
            c3 = g;
            qsb2 = qsb3;
            g = n66;
            ffs2 = ffs4;
            pjb3 = pjb5;
            pkb2 = pkb4;
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ris$d(s, companion, c3, c, lkb, pkb2, pjb3, c2, ffs2, mes2, g, n, b, n2, (qsb)qsb2, sjs2, n3, n4, n5));
        }
    }
}
