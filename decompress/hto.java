import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hto
{
    public static final mll<qpa> a;
    public static final float b;
    
    static {
        hto.a = (n9r)se6.d((otb)hto$a.C0);
        b = 16;
    }
    
    public static final void a(jkh jkh, final qto qto, gub<? super m76, ? super Integer, oyv> c, gub<? super m76, ? super Integer, oyv> o, final jub<? super fgq, ? super m76, ? super Integer, oyv> jub, final gub<? super m76, ? super Integer, oyv> gub, int n, boolean b, final jub<? super rs4, ? super m76, ? super Integer, oyv> jub2, boolean b2, final oqp oqp, float b3, long b4, long a, long a2, long b5, long n2, final jub<? super urj, ? super m76, ? super Integer, oyv> jub3, final m76 m76, final int n3, final int n4, final int n5) {
        zzd.f((Object)jub3, "content");
        final m76 h = m76.h(1037492569);
        final int n6 = n5 & 0x1;
        int n7;
        if (n6 != 0) {
            n7 = (n3 | 0x6);
        }
        else if ((n3 & 0xE) == 0x0) {
            int n8;
            if (h.P((Object)jkh)) {
                n8 = 4;
            }
            else {
                n8 = 2;
            }
            n7 = (n8 | n3);
        }
        else {
            n7 = n3;
        }
        if ((n3 & 0x70) == 0x0) {
            int n9;
            if ((n5 & 0x2) == 0x0 && h.P((Object)qto)) {
                n9 = 32;
            }
            else {
                n9 = 16;
            }
            n7 |= n9;
        }
        final int n10 = n5 & 0x4;
        int n13 = 0;
        Label_0201: {
            int n11;
            if (n10 != 0) {
                n11 = (n7 | 0x180);
            }
            else {
                n11 = n7;
                if ((n3 & 0x380) == 0x0) {
                    int n12;
                    if (h.P(c)) {
                        n12 = 256;
                    }
                    else {
                        n12 = 128;
                    }
                    n13 = (n7 | n12);
                    break Label_0201;
                }
            }
            n13 = n11;
        }
        final int n14 = n5 & 0x8;
        int n17 = 0;
        Label_0275: {
            int n15;
            if (n14 != 0) {
                n15 = (n13 | 0xC00);
            }
            else {
                n15 = n13;
                if ((n3 & 0x1C00) == 0x0) {
                    int n16;
                    if (h.P(o)) {
                        n16 = 2048;
                    }
                    else {
                        n16 = 1024;
                    }
                    n17 = (n13 | n16);
                    break Label_0275;
                }
            }
            n17 = n15;
        }
        final int n18 = n5 & 0x10;
        final int n19 = 8192;
        int n20;
        if (n18 != 0) {
            n20 = (n17 | 0x6000);
        }
        else {
            n20 = n17;
            if ((n3 & 0xE000) == 0x0) {
                int n21;
                if (h.P((Object)jub)) {
                    n21 = 16384;
                }
                else {
                    n21 = 8192;
                }
                n20 = (n17 | n21);
            }
        }
        final int n22 = n5 & 0x20;
        int n23;
        if (n22 != 0) {
            n23 = (n20 | 0x30000);
        }
        else {
            n23 = n20;
            if ((n3 & 0x70000) == 0x0) {
                int n24;
                if (h.P((Object)gub)) {
                    n24 = 131072;
                }
                else {
                    n24 = 65536;
                }
                n23 = (n20 | n24);
            }
        }
        final int n25 = n5 & 0x40;
        final int n26 = 1048576;
        int n27;
        if (n25 != 0) {
            n27 = (n23 | 0x180000);
        }
        else {
            n27 = n23;
            if ((n3 & 0x380000) == 0x0) {
                int n28;
                if (h.d(n)) {
                    n28 = 1048576;
                }
                else {
                    n28 = 524288;
                }
                n27 = (n23 | n28);
            }
        }
        final int n29 = n5 & 0x80;
        final int n30 = 12582912;
        int n31;
        if (n29 != 0) {
            n31 = (n27 | 0xC00000);
        }
        else {
            n31 = n27;
            if ((n3 & 0x1C00000) == 0x0) {
                int n32;
                if (h.a(b)) {
                    n32 = 8388608;
                }
                else {
                    n32 = 4194304;
                }
                n31 = (n27 | n32);
            }
        }
        final int n33 = n5 & 0x100;
        int n34;
        if (n33 != 0) {
            n34 = (n31 | 0x6000000);
        }
        else {
            n34 = n31;
            if ((n3 & 0xE000000) == 0x0) {
                int n35;
                if (h.P((Object)jub2)) {
                    n35 = 67108864;
                }
                else {
                    n35 = 33554432;
                }
                n34 = (n31 | n35);
            }
        }
        final int n36 = n5 & 0x200;
        int n37;
        if (n36 != 0) {
            n37 = (n34 | 0x30000000);
        }
        else {
            n37 = n34;
            if ((n3 & 0x70000000) == 0x0) {
                int n38;
                if (h.a(b2)) {
                    n38 = 536870912;
                }
                else {
                    n38 = 268435456;
                }
                n37 = (n34 | n38);
            }
        }
        int n40;
        if ((n4 & 0xE) == 0x0) {
            int n39;
            if ((n5 & 0x400) == 0x0 && h.P((Object)oqp)) {
                n39 = 4;
            }
            else {
                n39 = 2;
            }
            n40 = (n4 | n39);
        }
        else {
            n40 = n4;
        }
        final int n41 = n5 & 0x800;
        int n42;
        if (n41 != 0) {
            n42 = (n40 | 0x30);
        }
        else {
            n42 = n40;
            if ((n4 & 0x70) == 0x0) {
                int n43;
                if (h.b(b3)) {
                    n43 = 32;
                }
                else {
                    n43 = 16;
                }
                n42 = (n40 | n43);
            }
        }
        if ((n4 & 0x380) == 0x0) {
            int n44;
            if ((n5 & 0x1000) == 0x0 && h.e(b4)) {
                n44 = 256;
            }
            else {
                n44 = 128;
            }
            n42 |= n44;
        }
        if ((n4 & 0x1C00) == 0x0) {
            int n45;
            if ((n5 & 0x2000) == 0x0 && h.e(a)) {
                n45 = 2048;
            }
            else {
                n45 = 1024;
            }
            n42 |= n45;
        }
        if ((n4 & 0xE000) == 0x0) {
            int n46;
            if ((n5 & 0x4000) == 0x0) {
                n46 = n19;
                if (h.e(a2)) {
                    n46 = 16384;
                }
            }
            else {
                n46 = n19;
            }
            n42 |= n46;
        }
        if ((n4 & 0x70000) == 0x0) {
            int n47;
            if ((n5 & 0x8000) == 0x0 && h.e(b5)) {
                n47 = 131072;
            }
            else {
                n47 = 65536;
            }
            n42 |= n47;
        }
        int n49;
        if ((n4 & 0x380000) == 0x0) {
            int n48;
            if ((n5 & 0x10000) == 0x0 && h.e(n2)) {
                n48 = n26;
            }
            else {
                n48 = 524288;
            }
            n49 = (n42 | n48);
        }
        else {
            n49 = n42;
        }
        int n51 = 0;
        Label_1115: {
            int n50;
            if ((n5 & 0x20000) != 0x0) {
                n50 = n30;
            }
            else {
                n51 = n49;
                if ((n4 & 0x1C00000) != 0x0) {
                    break Label_1115;
                }
                if (h.P((Object)jub3)) {
                    n50 = 8388608;
                }
                else {
                    n50 = 4194304;
                }
            }
            n51 = (n49 | n50);
        }
        jub<? super rs4, ? super m76, ? super Integer, oyv> jub4;
        oqp oqp2;
        qto qto2;
        Object o2;
        jub<? super fgq, ? super m76, ? super Integer, oyv> jub5;
        boolean b7;
        boolean b8;
        if ((n37 & 0x5B6DB6DB) == 0x12492492 && (n51 & 0x16DB6DB) == 0x492492 && h.i()) {
            h.H();
            final gub gub2 = (gub)o;
            jub4 = jub2;
            final boolean b6 = b2;
            final long n52 = n2;
            oqp2 = oqp;
            qto2 = qto;
            o = c;
            o2 = gub2;
            jub5 = jub;
            c = gub;
            b7 = b;
            b8 = b6;
            n2 = a2;
            a2 = n52;
        }
        else {
            h.C();
            Object b9;
            oqp oqp3;
            jub<? super rs4, ? super m76, ? super Integer, oyv> jub6;
            Object e;
            if ((n3 & 0x1) != 0x0 && !h.K()) {
                h.H();
                int n53 = n37;
                if ((n5 & 0x2) != 0x0) {
                    n53 = (n37 & 0xFFFFFF8F);
                }
                int n54 = n51;
                if ((n5 & 0x400) != 0x0) {
                    n54 = (n51 & 0xFFFFFFF1);
                }
                int n56;
                final int n55 = n56 = n54;
                if ((n5 & 0x1000) != 0x0) {
                    n56 = (n55 & 0xFFFFFC7F);
                }
                int n57 = n56;
                if ((n5 & 0x2000) != 0x0) {
                    n57 = (n56 & 0xFFFFE3FF);
                }
                int n58 = n57;
                if ((n5 & 0x4000) != 0x0) {
                    n58 = (n57 & 0xFFFF1FFF);
                }
                int n59 = n58;
                if ((n5 & 0x8000) != 0x0) {
                    n59 = (n58 & 0xFFF8FFFF);
                }
                int n60 = n59;
                if ((n5 & 0x10000) != 0x0) {
                    n60 = (n59 & 0xFFC7FFFF);
                }
                b9 = c;
                final gub gub3 = (gub)o;
                oqp3 = oqp;
                final long n61 = a2;
                a2 = b5;
                b5 = n2;
                n51 = n60;
                n37 = n53;
                jub6 = jub2;
                final boolean b10 = b2;
                b7 = b;
                o2 = gub3;
                qto2 = qto;
                jub5 = jub;
                e = gub;
                b8 = b10;
                n2 = n61;
            }
            else {
                jkh companion;
                if (n6 != 0) {
                    companion = jkh.Companion;
                }
                else {
                    companion = jkh;
                }
                qto c2;
                if ((n5 & 0x2) != 0x0) {
                    c2 = c(h);
                    n37 &= 0xFFFFFF8F;
                }
                else {
                    c2 = qto;
                }
                if (n10 != 0) {
                    final q56 a3 = q56.a;
                    b9 = q56.b;
                }
                else {
                    b9 = c;
                }
                if (n14 != 0) {
                    final q56 a4 = q56.a;
                    c = q56.c;
                }
                else {
                    c = o;
                }
                Object d;
                if (n18 != 0) {
                    final q56 a5 = q56.a;
                    d = q56.d;
                }
                else {
                    d = jub;
                }
                if (n22 != 0) {
                    final q56 a6 = q56.a;
                    e = q56.e;
                }
                else {
                    e = gub;
                }
                final boolean b11 = true;
                if (n25 != 0) {
                    Objects.requireNonNull(rpa.Companion);
                    n = 1;
                }
                if (n29 != 0) {
                    b = false;
                }
                jub<? super rs4, ? super m76, ? super Integer, oyv> jub7;
                if (n33 != 0) {
                    jub7 = null;
                }
                else {
                    jub7 = jub2;
                }
                if (n36 != 0) {
                    b2 = b11;
                }
                Object c3;
                if ((n5 & 0x400) != 0x0) {
                    final ea6$b a7 = ea6.a;
                    c3 = ((krp)h.m((re6)lrp.a)).c;
                    n51 &= 0xFFFFFFF1;
                }
                else {
                    c3 = oqp;
                }
                if (n41 != 0) {
                    final yf9 a8 = yf9.a;
                    b3 = yf9.b;
                }
                long l;
                if ((n5 & 0x1000) != 0x0) {
                    final ea6$b a9 = ea6.a;
                    l = ((ks4)h.m((re6)ls4.a)).l();
                    n51 &= 0xFFFFFC7F;
                }
                else {
                    l = b4;
                }
                if ((n5 & 0x2000) != 0x0) {
                    b4 = ls4.b(l, h);
                    n51 &= 0xFFFFE3FF;
                }
                else {
                    b4 = a;
                }
                if ((n5 & 0x4000) != 0x0) {
                    final yf9 a10 = yf9.a;
                    a = yf9.a(h);
                    n51 &= 0xFFFF1FFF;
                }
                else {
                    a = a2;
                }
                if ((n5 & 0x8000) != 0x0) {
                    final ea6$b a11 = ea6.a;
                    a2 = ((ks4)h.m((re6)ls4.a)).a();
                    n51 &= 0xFFF8FFFF;
                }
                else {
                    a2 = b5;
                }
                if ((n5 & 0x10000) != 0x0) {
                    b5 = ls4.b(a2, h);
                    n51 &= 0xFFC7FFFF;
                }
                else {
                    b5 = n2;
                }
                final jub<? super rs4, ? super m76, ? super Integer, oyv> jub8 = jub7;
                final boolean b12 = b;
                n2 = a;
                a = b4;
                b4 = l;
                b8 = b2;
                jub5 = (jub<? super fgq, ? super m76, ? super Integer, oyv>)d;
                qto2 = c2;
                o2 = c;
                oqp3 = (oqp)c3;
                jub6 = jub8;
                b7 = b12;
                jkh = companion;
            }
            h.s();
            final ea6$b a12 = ea6.a;
            final i36 j = m8y.j(h, 1823402604, new hto$d(a2, b5, n51, b7, n, (gub)b9, (jub)jub3, (gub)e, (gub)o2, n37, (jub)jub5, qto2));
            if (jub6 != null) {
                h.x(-1013848234);
                final oi9 a13 = qto2.a;
                final i36 i = m8y.j(h, 100842932, new hto$b((jub)j));
                final int n62 = n51 << 12;
                wh9.a((jub)jub6, jkh, a13, b8, oqp3, b3, b4, a, n2, (gub)i, h, (n62 & 0xE000000) | (0x30000000 | (n37 >> 24 & 0xE) | (n37 << 3 & 0x70) | (n37 >> 18 & 0x1C00) | (0xE000 & n62) | (n62 & 0x70000) | (n62 & 0x380000) | (n62 & 0x1C00000)), 0);
                h.O();
            }
            else {
                h.x(-1013847725);
                ((j36)j).h0((Object)jkh, (Object)h, (Object)((n37 & 0xE) | 0x30));
                h.O();
            }
            final long n63 = b5;
            final jub<? super rs4, ? super m76, ? super Integer, oyv> jub9 = jub6;
            o = b9;
            final oqp oqp4 = oqp3;
            c = e;
            b5 = a2;
            a2 = n63;
            oqp2 = oqp4;
            jub4 = jub9;
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new hto$c(jkh, qto2, (gub)o, (gub)o2, (jub)jub5, (gub)c, n, b7, (jub)jub4, b8, oqp2, b3, b4, a, n2, b5, a2, (jub)jub3, n3, n4, n5));
        }
    }
    
    public static final void b(final boolean b, final int n, final gub gub, final jub jub, final gub gub2, final gub gub3, final gub gub4, final m76 m76, final int n2) {
        final m76 h = m76.h(-1401632215);
        int n4;
        if ((n2 & 0xE) == 0x0) {
            int n3;
            if (h.a(b)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n2);
        }
        else {
            n4 = n2;
        }
        int n5 = n4;
        if ((n2 & 0x70) == 0x0) {
            int n6;
            if (h.d(n)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        int n7 = n5;
        if ((n2 & 0x380) == 0x0) {
            int n8;
            if (h.P((Object)gub)) {
                n8 = 256;
            }
            else {
                n8 = 128;
            }
            n7 = (n5 | n8);
        }
        int n9 = n7;
        if ((n2 & 0x1C00) == 0x0) {
            int n10;
            if (h.P((Object)jub)) {
                n10 = 2048;
            }
            else {
                n10 = 1024;
            }
            n9 = (n7 | n10);
        }
        int n11 = n9;
        if ((0xE000 & n2) == 0x0) {
            int n12;
            if (h.P((Object)gub2)) {
                n12 = 16384;
            }
            else {
                n12 = 8192;
            }
            n11 = (n9 | n12);
        }
        int n13 = n11;
        if ((0x70000 & n2) == 0x0) {
            int n14;
            if (h.P((Object)gub3)) {
                n14 = 131072;
            }
            else {
                n14 = 65536;
            }
            n13 = (n11 | n14);
        }
        int n15 = n13;
        if ((0x380000 & n2) == 0x0) {
            int n16;
            if (h.P((Object)gub4)) {
                n16 = 1048576;
            }
            else {
                n16 = 524288;
            }
            n15 = (n13 | n16);
        }
        if ((n15 & 0x2DB6DB) == 0x92492 && h.i()) {
            h.H();
        }
        else {
            final ea6$b a = ea6.a;
            final rpa rpa = new rpa(n);
            h.x(-568225417);
            int i = 0;
            boolean b2 = false;
            while (i < 7) {
                b2 |= h.P((new Object[] { gub, gub2, gub3, rpa, b, gub4, jub })[i]);
                ++i;
            }
            Object y = h.y();
            Label_0508: {
                if (!b2) {
                    Objects.requireNonNull(m76.Companion);
                    if (y != m76$a.b) {
                        break Label_0508;
                    }
                }
                y = new nto(gub, gub2, gub3, n, b, gub4, n15, jub);
                h.p(y);
            }
            final m76 m77 = h;
            m77.O();
            clr.a((jkh)null, (gub)y, m77, 0, 1);
            final ea6$b a2 = ea6.a;
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new oto(b, n, (gub<? super m76, ? super Integer, oyv>)gub, (jub<? super urj, ? super m76, ? super Integer, oyv>)jub, (gub<? super m76, ? super Integer, oyv>)gub2, (gub<? super m76, ? super Integer, oyv>)gub3, (gub<? super m76, ? super Integer, oyv>)gub4, n2));
        }
    }
    
    public static final qto c(final m76 m76) {
        m76.x(1569641925);
        final oi9 c = wh9.c(m76);
        m76.x(-492369756);
        final Object y = m76.y();
        final m76$a companion = m76.Companion;
        Objects.requireNonNull(companion);
        final m76$a$a b = m76$a.b;
        Object o = y;
        if (y == b) {
            o = new fgq();
            m76.p(o);
        }
        m76.O();
        final fgq fgq = (fgq)o;
        final ea6$b a = ea6.a;
        m76.x(-492369756);
        final Object y2 = m76.y();
        Objects.requireNonNull(companion);
        qto qto;
        if ((qto = (qto)y2) == b) {
            qto = new qto(c, fgq);
            m76.p((Object)qto);
        }
        m76.O();
        final qto qto2 = qto;
        m76.O();
        return qto2;
    }
}
