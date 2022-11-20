import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class js1
{
    public static final void a(final ais ais, final qsb<? super ais, fzv> qsb, final okh okh, boolean b, boolean b2, final sjs sjs, final wqe wqe, final rqe rqe, boolean b3, int n, jfx jfx, final qsb<? super yis, fzv> qsb2, final sth sth, final fq2 fq2, final itb<? super ftb<? super x66, ? super Integer, fzv>, ? super x66, ? super Integer, fzv> itb, final x66 x66, final int n2, final int n3, final int n4) {
        czd.f((Object)ais, "value");
        czd.f((Object)qsb, "onValueChange");
        final x66 h = x66.h(-560482651);
        int n5;
        if ((n4 & 0x1) != 0x0) {
            n5 = (n2 | 0x6);
        }
        else if ((n2 & 0xE) == 0x0) {
            int n6;
            if (h.P((Object)ais)) {
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
        int n7;
        if ((n4 & 0x2) != 0x0) {
            n7 = (n5 | 0x30);
        }
        else {
            n7 = n5;
            if ((n2 & 0x70) == 0x0) {
                int n8;
                if (h.P((Object)qsb)) {
                    n8 = 32;
                }
                else {
                    n8 = 16;
                }
                n7 = (n5 | n8);
            }
        }
        final int n9 = n4 & 0x4;
        int n12 = 0;
        Label_0213: {
            int n10;
            if (n9 != 0) {
                n10 = (n7 | 0x180);
            }
            else {
                n10 = n7;
                if ((n2 & 0x380) == 0x0) {
                    int n11;
                    if (h.P((Object)okh)) {
                        n11 = 256;
                    }
                    else {
                        n11 = 128;
                    }
                    n12 = (n7 | n11);
                    break Label_0213;
                }
            }
            n12 = n10;
        }
        final int n13 = n4 & 0x8;
        int n16 = 0;
        Label_0287: {
            int n14;
            if (n13 != 0) {
                n14 = (n12 | 0xC00);
            }
            else {
                n14 = n12;
                if ((n2 & 0x1C00) == 0x0) {
                    int n15;
                    if (h.a(b)) {
                        n15 = 2048;
                    }
                    else {
                        n15 = 1024;
                    }
                    n16 = (n12 | n15);
                    break Label_0287;
                }
            }
            n16 = n14;
        }
        final int n17 = n4 & 0x10;
        int n20 = 0;
        Label_0361: {
            int n18;
            if (n17 != 0) {
                n18 = (n16 | 0x6000);
            }
            else {
                n18 = n16;
                if ((n2 & 0xE000) == 0x0) {
                    int n19;
                    if (h.a(b2)) {
                        n19 = 16384;
                    }
                    else {
                        n19 = 8192;
                    }
                    n20 = (n16 | n19);
                    break Label_0361;
                }
            }
            n20 = n18;
        }
        final int n21 = n4 & 0x20;
        int n22;
        if (n21 != 0) {
            n22 = (n20 | 0x30000);
        }
        else {
            n22 = n20;
            if ((n2 & 0x70000) == 0x0) {
                int n23;
                if (h.P((Object)sjs)) {
                    n23 = 131072;
                }
                else {
                    n23 = 65536;
                }
                n22 = (n20 | n23);
            }
        }
        final int n24 = n4 & 0x40;
        int n25;
        if (n24 != 0) {
            n25 = (n22 | 0x180000);
        }
        else {
            n25 = n22;
            if ((n2 & 0x380000) == 0x0) {
                int n26;
                if (h.P((Object)wqe)) {
                    n26 = 1048576;
                }
                else {
                    n26 = 524288;
                }
                n25 = (n22 | n26);
            }
        }
        final int n27 = n4 & 0x80;
        int n28;
        if (n27 != 0) {
            n28 = (n25 | 0xC00000);
        }
        else {
            n28 = n25;
            if ((n2 & 0x1C00000) == 0x0) {
                int n29;
                if (h.P((Object)rqe)) {
                    n29 = 8388608;
                }
                else {
                    n29 = 4194304;
                }
                n28 = (n25 | n29);
            }
        }
        final int n30 = n4 & 0x100;
        int n31;
        if (n30 != 0) {
            n31 = (n28 | 0x6000000);
        }
        else {
            n31 = n28;
            if ((n2 & 0xE000000) == 0x0) {
                int n32;
                if (h.a(b3)) {
                    n32 = 67108864;
                }
                else {
                    n32 = 33554432;
                }
                n31 = (n28 | n32);
            }
        }
        final int n33 = n4 & 0x200;
        int n34;
        if (n33 != 0) {
            n34 = (n31 | 0x30000000);
        }
        else {
            n34 = n31;
            if ((n2 & 0x70000000) == 0x0) {
                int n35;
                if (h.d(n)) {
                    n35 = 536870912;
                }
                else {
                    n35 = 268435456;
                }
                n34 = (n31 | n35);
            }
        }
        final int n36 = n4 & 0x400;
        int n37;
        if (n36 != 0) {
            n37 = (n3 | 0x6);
        }
        else if ((n3 & 0xE) == 0x0) {
            int n38;
            if (h.P((Object)jfx)) {
                n38 = 4;
            }
            else {
                n38 = 2;
            }
            n37 = (n3 | n38);
        }
        else {
            n37 = n3;
        }
        final int n39 = n4 & 0x800;
        int n40;
        if (n39 != 0) {
            n40 = (n37 | 0x30);
        }
        else {
            n40 = n37;
            if ((n3 & 0x70) == 0x0) {
                int n41;
                if (h.P((Object)qsb2)) {
                    n41 = 32;
                }
                else {
                    n41 = 16;
                }
                n40 = (n37 | n41);
            }
        }
        final int n42 = n40;
        final int n43 = n4 & 0x1000;
        int n44;
        if (n43 != 0) {
            n44 = (n42 | 0x180);
        }
        else {
            n44 = n42;
            if ((n3 & 0x380) == 0x0) {
                int n45;
                if (h.P((Object)sth)) {
                    n45 = 256;
                }
                else {
                    n45 = 128;
                }
                n44 = (n42 | n45);
            }
        }
        if ((n3 & 0x1C00) == 0x0) {
            int n46;
            if ((n4 & 0x2000) == 0x0 && h.P((Object)fq2)) {
                n46 = 2048;
            }
            else {
                n46 = 1024;
            }
            n44 |= n46;
        }
        final int n47 = n4 & 0x4000;
        int n48;
        if (n47 != 0) {
            n48 = (n44 | 0x6000);
        }
        else {
            n48 = n44;
            if ((n3 & 0xE000) == 0x0) {
                int n49;
                if (h.P((Object)itb)) {
                    n49 = 16384;
                }
                else {
                    n49 = 8192;
                }
                n48 = (n44 | n49);
            }
        }
        jfx jfx2;
        qsb<? super yis, fzv> qsb3;
        okh okh2;
        sjs sjs2;
        wqe wqe2;
        rqe rqe2;
        int n50;
        sth sth2;
        fq2 fq3;
        itb<? super ftb<? super x66, ? super Integer, fzv>, ? super x66, ? super Integer, fzv> itb2;
        if ((n34 & 0x5B6DB6DB) == 0x12492492 && (0xB6DB & n48) == 0x2492 && h.i()) {
            h.H();
            jfx2 = jfx;
            qsb3 = qsb2;
            okh2 = okh;
            sjs2 = sjs;
            wqe2 = wqe;
            rqe2 = rqe;
            n50 = (b3 ? 1 : 0);
            sth2 = sth;
            fq3 = fq2;
            itb2 = itb;
        }
        else {
            h.C();
            boolean b5;
            boolean b6;
            qsb<? super yis, fzv> qsb4;
            sth sth3;
            fq2 fq4;
            itb<? super ftb<? super x66, ? super Integer, fzv>, ? super x66, ? super Integer, fzv> itb3;
            if ((n2 & 0x1) != 0x0 && !h.K()) {
                h.H();
                int n51 = n48;
                if ((n4 & 0x2000) != 0x0) {
                    n51 = (n48 & 0xFFFFE3FF);
                }
                final boolean b4 = b3;
                n48 = n51;
                wqe2 = wqe;
                okh2 = okh;
                b5 = b;
                sjs2 = sjs;
                rqe2 = rqe;
                b6 = b4;
                qsb4 = qsb2;
                sth3 = sth;
                fq4 = fq2;
                itb3 = itb;
            }
            else {
                Object companion;
                if (n9 != 0) {
                    companion = okh.Companion;
                }
                else {
                    companion = okh;
                }
                if (n13 != 0) {
                    b = true;
                }
                final boolean b7 = false;
                if (n17 != 0) {
                    b2 = false;
                }
                sjs d;
                if (n21 != 0) {
                    Objects.requireNonNull(sjs.Companion);
                    d = sjs.d;
                }
                else {
                    d = sjs;
                }
                wqe e;
                if (n24 != 0) {
                    Objects.requireNonNull(wqe.Companion);
                    e = wqe.e;
                }
                else {
                    e = wqe;
                }
                rqe g;
                if (n27 != 0) {
                    Objects.requireNonNull(rqe.Companion);
                    final rqe$a companion2 = rqe.Companion;
                    g = rqe.g;
                }
                else {
                    g = rqe;
                }
                if (n30 != 0) {
                    b3 = b7;
                }
                if (n33 != 0) {
                    n = Integer.MAX_VALUE;
                }
                Object a;
                if (n36 != 0) {
                    Objects.requireNonNull(jfx.Companion);
                    a = jfx$a$a.a;
                }
                else {
                    a = jfx;
                }
                Object d2;
                if (n39 != 0) {
                    d2 = js1$e.D0;
                }
                else {
                    d2 = qsb2;
                }
                sth sth4;
                if (n43 != 0) {
                    h.x(-492369756);
                    final Object y = h.y();
                    Objects.requireNonNull(x66.Companion);
                    Object f;
                    if ((f = y) == x66$a.b) {
                        f = h91.f(h);
                    }
                    h.O();
                    sth4 = (sth)f;
                }
                else {
                    sth4 = sth;
                }
                Object o;
                if ((n4 & 0x2000) != 0x0) {
                    Objects.requireNonNull(nq4.Companion);
                    o = new mlq(nq4.b);
                    n48 &= 0xFFFFE3FF;
                }
                else {
                    o = fq2;
                }
                Object c;
                if (n47 != 0) {
                    final a36 a2 = a36.a;
                    c = a36.c;
                }
                else {
                    c = itb;
                }
                okh2 = (okh)companion;
                final boolean b8 = b;
                final Object o2 = c;
                b6 = b3;
                final Object o3 = a;
                qsb4 = (qsb<? super yis, fzv>)d2;
                final rqe rqe3 = g;
                sth3 = sth4;
                final sjs sjs3 = d;
                final wqe wqe3 = e;
                itb3 = (itb<? super ftb<? super x66, ? super Integer, fzv>, ? super x66, ? super Integer, fzv>)o2;
                fq4 = (fq2)o;
                jfx = (jfx)o3;
                rqe2 = rqe3;
                sjs2 = sjs3;
                b5 = b8;
                wqe2 = wqe3;
            }
            h.s();
            final n96$b a3 = n96.a;
            Objects.requireNonNull(wqe2);
            final z8d z8d = new z8d(b6, wqe2.a, wqe2.b, wqe2.c, wqe2.d);
            int n52;
            if (b6) {
                n52 = 1;
            }
            else {
                n52 = n;
            }
            h.x(511388516);
            final boolean p19 = h.P((Object)ais);
            final boolean p20 = h.P((Object)qsb);
            final Object y2 = h.y();
            Object o4 = null;
            Label_1758: {
                if (!(p19 | p20)) {
                    Objects.requireNonNull(x66.Companion);
                    if ((o4 = y2) != x66$a.b) {
                        break Label_1758;
                    }
                }
                o4 = new js1$f(ais, (qsb)qsb);
                h.p(o4);
            }
            h.O();
            final qsb qsb5 = (qsb)o4;
            final int n53 = n48 << 12;
            final int n54 = n34 >> 3;
            pw6.a(ais, qsb5, okh2, sjs2, jfx, (qsb)qsb4, sth3, fq4, b6 ^ true, n52, z8d, rqe2, b5, b2, (itb)itb3, h, (n34 & 0xE) | (n34 & 0x380) | (n34 >> 6 & 0x1C00) | (n53 & 0xE000) | (n53 & 0x70000) | (n53 & 0x380000) | (n53 & 0x1C00000), (n34 >> 18 & 0x70) | (n54 & 0x380) | (n54 & 0x1C00) | (0xE000 & n48), 0);
            final jfx jfx3 = jfx;
            qsb3 = qsb4;
            fq3 = fq4;
            itb2 = itb3;
            sth2 = sth3;
            jfx2 = jfx3;
            n50 = (b6 ? 1 : 0);
            b = b5;
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new js1$g(ais, (qsb)qsb, okh2, b, b2, sjs2, wqe2, rqe2, (boolean)(n50 != 0), n, jfx2, (qsb)qsb3, sth2, fq3, (itb)itb2, n2, n3, n4));
        }
    }
    
    public static final void b(final String s, final qsb<? super String, fzv> qsb, final okh okh, boolean b, boolean b2, final sjs sjs, final wqe wqe, rqe g, boolean b3, int n, final jfx jfx, final qsb<? super yis, fzv> qsb2, sth sth, fq2 fq2, final itb<? super ftb<? super x66, ? super Integer, fzv>, ? super x66, ? super Integer, fzv> itb, final x66 x66, final int n2, final int n3, final int n4) {
        czd.f((Object)s, "value");
        czd.f((Object)qsb, "onValueChange");
        final x66 h = x66.h(-454732590);
        int n5;
        if ((n4 & 0x1) != 0x0) {
            n5 = (n2 | 0x6);
        }
        else if ((n2 & 0xE) == 0x0) {
            int n6;
            if (h.P((Object)s)) {
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
        int n7;
        if ((n4 & 0x2) != 0x0) {
            n7 = (n5 | 0x30);
        }
        else {
            n7 = n5;
            if ((n2 & 0x70) == 0x0) {
                int n8;
                if (h.P((Object)qsb)) {
                    n8 = 32;
                }
                else {
                    n8 = 16;
                }
                n7 = (n5 | n8);
            }
        }
        final int n9 = n4 & 0x4;
        int n12 = 0;
        Label_0213: {
            int n10;
            if (n9 != 0) {
                n10 = (n7 | 0x180);
            }
            else {
                n10 = n7;
                if ((n2 & 0x380) == 0x0) {
                    int n11;
                    if (h.P((Object)okh)) {
                        n11 = 256;
                    }
                    else {
                        n11 = 128;
                    }
                    n12 = (n7 | n11);
                    break Label_0213;
                }
            }
            n12 = n10;
        }
        final int n13 = n4 & 0x8;
        int n16 = 0;
        Label_0287: {
            int n14;
            if (n13 != 0) {
                n14 = (n12 | 0xC00);
            }
            else {
                n14 = n12;
                if ((n2 & 0x1C00) == 0x0) {
                    int n15;
                    if (h.a(b)) {
                        n15 = 2048;
                    }
                    else {
                        n15 = 1024;
                    }
                    n16 = (n12 | n15);
                    break Label_0287;
                }
            }
            n16 = n14;
        }
        final int n17 = n4 & 0x10;
        int n20 = 0;
        Label_0361: {
            int n18;
            if (n17 != 0) {
                n18 = (n16 | 0x6000);
            }
            else {
                n18 = n16;
                if ((n2 & 0xE000) == 0x0) {
                    int n19;
                    if (h.a(b2)) {
                        n19 = 16384;
                    }
                    else {
                        n19 = 8192;
                    }
                    n20 = (n16 | n19);
                    break Label_0361;
                }
            }
            n20 = n18;
        }
        final int n21 = n4 & 0x20;
        int n22;
        if (n21 != 0) {
            n22 = (n20 | 0x30000);
        }
        else {
            n22 = n20;
            if ((n2 & 0x70000) == 0x0) {
                int n23;
                if (h.P((Object)sjs)) {
                    n23 = 131072;
                }
                else {
                    n23 = 65536;
                }
                n22 = (n20 | n23);
            }
        }
        final int n24 = n4 & 0x40;
        int n25;
        if (n24 != 0) {
            n25 = (n22 | 0x180000);
        }
        else {
            n25 = n22;
            if ((n2 & 0x380000) == 0x0) {
                int n26;
                if (h.P((Object)wqe)) {
                    n26 = 1048576;
                }
                else {
                    n26 = 524288;
                }
                n25 = (n22 | n26);
            }
        }
        final int n27 = n4 & 0x80;
        int n28;
        if (n27 != 0) {
            n28 = (n25 | 0xC00000);
        }
        else {
            n28 = n25;
            if ((n2 & 0x1C00000) == 0x0) {
                int n29;
                if (h.P((Object)g)) {
                    n29 = 8388608;
                }
                else {
                    n29 = 4194304;
                }
                n28 = (n25 | n29);
            }
        }
        final int n30 = n4 & 0x100;
        int n31;
        if (n30 != 0) {
            n31 = (n28 | 0x6000000);
        }
        else {
            n31 = n28;
            if ((n2 & 0xE000000) == 0x0) {
                int n32;
                if (h.a(b3)) {
                    n32 = 67108864;
                }
                else {
                    n32 = 33554432;
                }
                n31 = (n28 | n32);
            }
        }
        final int n33 = n4 & 0x200;
        int n34;
        if (n33 != 0) {
            n34 = (n31 | 0x30000000);
        }
        else {
            n34 = n31;
            if ((n2 & 0x70000000) == 0x0) {
                int n35;
                if (h.d(n)) {
                    n35 = 536870912;
                }
                else {
                    n35 = 268435456;
                }
                n34 = (n31 | n35);
            }
        }
        final int n36 = n4 & 0x400;
        int n37;
        if (n36 != 0) {
            n37 = (n3 | 0x6);
        }
        else if ((n3 & 0xE) == 0x0) {
            int n38;
            if (h.P((Object)jfx)) {
                n38 = 4;
            }
            else {
                n38 = 2;
            }
            n37 = (n3 | n38);
        }
        else {
            n37 = n3;
        }
        final int n39 = n4 & 0x800;
        int n40;
        if (n39 != 0) {
            n40 = (n37 | 0x30);
        }
        else {
            n40 = n37;
            if ((n3 & 0x70) == 0x0) {
                int n41;
                if (h.P((Object)qsb2)) {
                    n41 = 32;
                }
                else {
                    n41 = 16;
                }
                n40 = (n37 | n41);
            }
        }
        final int n42 = n40;
        final int n43 = n4 & 0x1000;
        int n44;
        if (n43 != 0) {
            n44 = (n42 | 0x180);
        }
        else {
            n44 = n42;
            if ((n3 & 0x380) == 0x0) {
                int n45;
                if (h.P((Object)sth)) {
                    n45 = 256;
                }
                else {
                    n45 = 128;
                }
                n44 = (n42 | n45);
            }
        }
        if ((n3 & 0x1C00) == 0x0) {
            int n46;
            if ((n4 & 0x2000) == 0x0 && h.P((Object)fq2)) {
                n46 = 2048;
            }
            else {
                n46 = 1024;
            }
            n44 |= n46;
        }
        final int n47 = n4 & 0x4000;
        int n48;
        if (n47 != 0) {
            n48 = (n44 | 0x6000);
        }
        else {
            n48 = n44;
            if ((n3 & 0xE000) == 0x0) {
                int n49;
                if (h.P((Object)itb)) {
                    n49 = 16384;
                }
                else {
                    n49 = 8192;
                }
                n48 = (n44 | n49);
            }
        }
        qsb qsb3;
        okh okh2;
        boolean b6;
        boolean b7;
        wqe wqe2;
        rqe rqe2;
        sjs sjs2;
        boolean b8;
        jfx jfx2;
        itb<? super ftb<? super x66, ? super Integer, fzv>, ? super x66, ? super Integer, fzv> itb2;
        if ((n34 & 0x5B6DB6DB) == 0x12492492 && (0xB6DB & n48) == 0x2492 && h.i()) {
            h.H();
            final boolean b4 = b2;
            final rqe rqe = g;
            final boolean b5 = b3;
            qsb3 = qsb2;
            okh2 = okh;
            b6 = b;
            b7 = b4;
            wqe2 = wqe;
            rqe2 = rqe;
            sjs2 = sjs;
            b8 = b5;
            jfx2 = jfx;
            itb2 = itb;
        }
        else {
            h.C();
            sjs d;
            Object d2;
            Object b10;
            okh okh3;
            sth sth3;
            jfx jfx3;
            wqe wqe3;
            if ((n2 & 0x1) != 0x0 && !h.K()) {
                h.H();
                int n50 = n48;
                if ((n4 & 0x2000) != 0x0) {
                    n50 = (n48 & 0xFFFFE3FF);
                }
                final boolean b9 = b2;
                d = sjs;
                d2 = qsb2;
                final sth sth2 = sth;
                n48 = n50;
                b10 = itb;
                okh3 = okh;
                b6 = b;
                b8 = b3;
                sth3 = sth2;
                b7 = b9;
                jfx3 = jfx;
                wqe3 = wqe;
            }
            else {
                Object companion;
                if (n9 != 0) {
                    companion = okh.Companion;
                }
                else {
                    companion = okh;
                }
                if (n13 != 0) {
                    b = true;
                }
                if (n17 != 0) {
                    b2 = false;
                }
                if (n21 != 0) {
                    Objects.requireNonNull(sjs.Companion);
                    d = sjs.d;
                }
                else {
                    d = sjs;
                }
                wqe e;
                if (n24 != 0) {
                    Objects.requireNonNull(wqe.Companion);
                    e = wqe.e;
                }
                else {
                    e = wqe;
                }
                if (n27 != 0) {
                    Objects.requireNonNull(rqe.Companion);
                    final rqe$a companion2 = rqe.Companion;
                    g = rqe.g;
                }
                if (n30 != 0) {
                    b3 = false;
                }
                if (n33 != 0) {
                    n = Integer.MAX_VALUE;
                }
                Object a;
                if (n36 != 0) {
                    Objects.requireNonNull(jfx.Companion);
                    a = jfx$a$a.a;
                }
                else {
                    a = jfx;
                }
                if (n39 != 0) {
                    d2 = js1$a.D0;
                }
                else {
                    d2 = qsb2;
                }
                sth sth4;
                if (n43 != 0) {
                    h.x(-492369756);
                    final Object y = h.y();
                    Objects.requireNonNull(x66.Companion);
                    Object f;
                    if ((f = y) == x66$a.b) {
                        f = h91.f(h);
                    }
                    h.O();
                    sth4 = (sth)f;
                }
                else {
                    sth4 = sth;
                }
                Object o;
                if ((n4 & 0x2000) != 0x0) {
                    Objects.requireNonNull(nq4.Companion);
                    o = new mlq(nq4.b);
                    n48 &= 0xFFFFE3FF;
                }
                else {
                    o = fq2;
                }
                if (n47 != 0) {
                    final a36 a2 = a36.a;
                    b10 = a36.b;
                }
                else {
                    b10 = itb;
                }
                sth3 = sth4;
                fq2 = (fq2)o;
                final boolean b11 = b;
                b8 = b3;
                wqe3 = e;
                jfx3 = (jfx)a;
                b7 = b2;
                b6 = b11;
                okh3 = (okh)companion;
            }
            h.s();
            final n96$b a3 = n96.a;
            h.x(-492369756);
            Object o2 = h.y();
            Objects.requireNonNull(x66.Companion);
            final x66$a$a b12 = x66$a.b;
            if (o2 == b12) {
                o2 = blz.Q(new ais(s, 0L, 6));
                h.p(o2);
            }
            h.O();
            final puh puh = (puh)o2;
            final ais ais = (ais)((m8r)puh).getValue();
            final ais$c companion3 = ais.Companion;
            final ais ais2 = new ais(new xc0(s, (List)null, 6), ais.b, ais.c);
            h.x(511388516);
            final boolean p19 = h.P((Object)ais2);
            final boolean p20 = h.P((Object)puh);
            final Object y2 = h.y();
            Object o3;
            if ((p19 | p20) || (o3 = y2) == b12) {
                o3 = new js1$b(ais2, puh);
                h.p(o3);
            }
            h.O();
            npe.m((nsb)o3, h);
            h.x(1157296644);
            final boolean p21 = h.P((Object)s);
            final Object y3 = h.y();
            puh q;
            if (p21 || (q = (puh)y3) == b12) {
                q = blz.Q(s);
                h.p((Object)q);
            }
            h.O();
            final puh puh2 = q;
            Objects.requireNonNull(wqe3);
            final z8d z8d = new z8d(b8, wqe3.a, wqe3.b, wqe3.c, wqe3.d);
            int n51;
            if (b8) {
                n51 = 1;
            }
            else {
                n51 = n;
            }
            h.x(1618982084);
            final boolean p22 = h.P((Object)puh);
            final boolean p23 = h.P((Object)puh2);
            final boolean p24 = h.P((Object)qsb);
            final Object y4 = h.y();
            Object o4;
            if ((p22 | p23 | p24) || (o4 = y4) == b12) {
                o4 = new js1$c((qsb)qsb, puh, puh2);
                h.p(o4);
            }
            h.O();
            final qsb qsb4 = (qsb)o4;
            final int n52 = n48 << 12;
            final int n53 = n34 >> 3;
            pw6.a(ais2, qsb4, okh3, d, jfx3, (qsb)d2, sth3, fq2, b8 ^ true, n51, z8d, g, b6, b7, (itb)b10, h, (n34 & 0x380) | (n34 >> 6 & 0x1C00) | (n52 & 0xE000) | (n52 & 0x70000) | (n52 & 0x380000) | (n52 & 0x1C00000), (n53 & 0x1C00) | ((n34 >> 18 & 0x70) | (n53 & 0x380)) | (n48 & 0xE000), 0);
            final itb itb3 = (itb)b10;
            final rqe rqe3 = g;
            qsb3 = (qsb)d2;
            final okh okh4 = okh3;
            sth = sth3;
            itb2 = (itb<? super ftb<? super x66, ? super Integer, fzv>, ? super x66, ? super Integer, fzv>)itb3;
            jfx2 = jfx3;
            sjs2 = d;
            rqe2 = rqe3;
            wqe2 = wqe3;
            okh2 = okh4;
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new js1$d(s, (qsb)qsb, okh2, b6, b7, sjs2, wqe2, rqe2, b8, n, jfx2, qsb3, sth, fq2, (itb)itb2, n2, n3, n4));
        }
    }
}
