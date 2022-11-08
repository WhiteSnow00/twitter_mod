import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v7s
{
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final long f;
    
    static {
        a = 48;
        b = 72;
        c = 16;
        d = 14;
        e = 6;
        f = ri4.J(20);
    }
    
    public static final void a(final boolean b, final otb<oyv> otb, jkh companion, boolean b2, gub<? super m76, ? super Integer, oyv> gub, gub<? super m76, ? super Integer, oyv> gub2, oth oth, long a, long b3, final m76 m76, final int n, final int n2) {
        zzd.f((Object)otb, "onClick");
        final m76 h = m76.h(-1486097588);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.a(b)) {
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
                if (h.P((Object)otb)) {
                    n6 = 32;
                }
                else {
                    n6 = 16;
                }
                n5 = (n3 | n6);
            }
        }
        final int n7 = n2 & 0x4;
        int n10 = 0;
        Label_0207: {
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
                    n10 = (n5 | n9);
                    break Label_0207;
                }
            }
            n10 = n8;
        }
        final int n11 = n2 & 0x8;
        int n14 = 0;
        Label_0281: {
            int n12;
            if (n11 != 0) {
                n12 = (n10 | 0xC00);
            }
            else {
                n12 = n10;
                if ((n & 0x1C00) == 0x0) {
                    int n13;
                    if (h.a(b2)) {
                        n13 = 2048;
                    }
                    else {
                        n13 = 1024;
                    }
                    n14 = (n10 | n13);
                    break Label_0281;
                }
            }
            n14 = n12;
        }
        final int n15 = n2 & 0x10;
        int n18 = 0;
        Label_0355: {
            int n16;
            if (n15 != 0) {
                n16 = (n14 | 0x6000);
            }
            else {
                n16 = n14;
                if ((0xE000 & n) == 0x0) {
                    int n17;
                    if (h.P((Object)gub)) {
                        n17 = 16384;
                    }
                    else {
                        n17 = 8192;
                    }
                    n18 = (n14 | n17);
                    break Label_0355;
                }
            }
            n18 = n16;
        }
        final int n19 = n2 & 0x20;
        int n22 = 0;
        Label_0426: {
            int n20;
            if (n19 != 0) {
                n20 = (n18 | 0x30000);
            }
            else {
                n20 = n18;
                if ((0x70000 & n) == 0x0) {
                    int n21;
                    if (h.P((Object)gub2)) {
                        n21 = 131072;
                    }
                    else {
                        n21 = 65536;
                    }
                    n22 = (n18 | n21);
                    break Label_0426;
                }
            }
            n22 = n20;
        }
        final int n23 = n2 & 0x40;
        int n26 = 0;
        Label_0497: {
            int n24;
            if (n23 != 0) {
                n24 = (n22 | 0x180000);
            }
            else {
                n24 = n22;
                if ((0x380000 & n) == 0x0) {
                    int n25;
                    if (h.P((Object)oth)) {
                        n25 = 1048576;
                    }
                    else {
                        n25 = 524288;
                    }
                    n26 = (n22 | n25);
                    break Label_0497;
                }
            }
            n26 = n24;
        }
        if ((n & 0x1C00000) == 0x0) {
            int n27;
            if ((n2 & 0x80) == 0x0 && h.e(a)) {
                n27 = 8388608;
            }
            else {
                n27 = 4194304;
            }
            n26 |= n27;
        }
        if ((0xE000000 & n) == 0x0) {
            int n28;
            if ((n2 & 0x100) == 0x0 && h.e(b3)) {
                n28 = 67108864;
            }
            else {
                n28 = 33554432;
            }
            n26 |= n28;
        }
        gub<? super m76, ? super Integer, oyv> gub3;
        jkh jkh;
        gub<? super m76, ? super Integer, oyv> gub4;
        oth oth2;
        long n29;
        if ((0xB6DB6DB & n26) == 0x2492492 && h.i()) {
            h.H();
            gub3 = gub;
            jkh = companion;
            gub4 = gub2;
            oth2 = oth;
            n29 = b3;
        }
        else {
            h.C();
            final gub gub5 = null;
            oth oth3;
            jkh jkh3;
            if ((n & 0x1) != 0x0 && !h.K()) {
                h.H();
                int n30 = n26;
                if ((n2 & 0x80) != 0x0) {
                    n30 = (n26 & 0xFE3FFFFF);
                }
                n26 = n30;
                if ((n2 & 0x100) != 0x0) {
                    n26 = (n30 & 0xF1FFFFFF);
                }
                final jkh jkh2 = companion;
                oth3 = oth;
                final long n31 = a;
                a = b3;
                b3 = n31;
                jkh3 = jkh2;
            }
            else {
                if (n7 != 0) {
                    companion = jkh.Companion;
                }
                if (n11 != 0) {
                    b2 = true;
                }
                if (n15 != 0) {
                    gub = null;
                }
                if (n19 != 0) {
                    gub2 = null;
                }
                if (n23 != 0) {
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
                if ((n2 & 0x80) != 0x0) {
                    a = ((pr4)h.m((re6)ll6.a)).a;
                    n26 &= 0xFE3FFFFF;
                }
                if ((n2 & 0x100) != 0x0) {
                    b3 = pr4.b(a, x3j.F(h));
                    n26 &= 0xF1FFFFFF;
                }
                final long n32 = a;
                final oth oth4 = oth;
                a = b3;
                jkh3 = companion;
                oth3 = oth4;
                b3 = n32;
            }
            h.s();
            final ea6$b a2 = ea6.a;
            Object j = gub5;
            if (gub != null) {
                j = m8y.j(h, -1729014781, new v7s$e((gub)gub, n26));
            }
            final i36 i = m8y.j(h, -178151495, new v7s$a((gub)j, (gub)gub2, n26));
            final int n33 = n26 >> 6;
            b(b, otb, jkh3, b2, oth3, b3, a, (jub<? super rs4, ? super m76, ? super Integer, oyv>)i, h, 0xC00000 | (n26 & 0xE) | (n26 & 0x70) | (n26 & 0x380) | (n26 & 0x1C00) | (0xE000 & n33) | (0x70000 & n33) | (n33 & 0x380000), 0);
            final gub<? super m76, ? super Integer, oyv> gub6 = gub2;
            n29 = a;
            a = b3;
            oth2 = oth3;
            gub4 = gub6;
            gub3 = gub;
            jkh = jkh3;
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new v7s$b(b, (otb)otb, jkh, b2, (gub)gub3, (gub)gub4, oth2, a, n29, n, n2));
        }
    }
    
    public static final void b(final boolean b, final otb<oyv> otb, jkh companion, boolean b2, oth oth, long a, long n, final jub<? super rs4, ? super m76, ? super Integer, oyv> jub, final m76 m76, final int n2, final int n3) {
        zzd.f((Object)otb, "onClick");
        zzd.f((Object)jub, "content");
        final m76 h = m76.h(713679175);
        int n4;
        if ((n3 & 0x1) != 0x0) {
            n4 = (n2 | 0x6);
        }
        else if ((n2 & 0xE) == 0x0) {
            int n5;
            if (h.a(b)) {
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
                if (h.P((Object)otb)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        final int n8 = n3 & 0x4;
        int n11 = 0;
        Label_0214: {
            int n9;
            if (n8 != 0) {
                n9 = (n6 | 0x180);
            }
            else {
                n9 = n6;
                if ((n2 & 0x380) == 0x0) {
                    int n10;
                    if (h.P((Object)companion)) {
                        n10 = 256;
                    }
                    else {
                        n10 = 128;
                    }
                    n11 = (n6 | n10);
                    break Label_0214;
                }
            }
            n11 = n9;
        }
        final int n12 = n3 & 0x8;
        int n15 = 0;
        Label_0288: {
            int n13;
            if (n12 != 0) {
                n13 = (n11 | 0xC00);
            }
            else {
                n13 = n11;
                if ((n2 & 0x1C00) == 0x0) {
                    int n14;
                    if (h.a(b2)) {
                        n14 = 2048;
                    }
                    else {
                        n14 = 1024;
                    }
                    n15 = (n11 | n14);
                    break Label_0288;
                }
            }
            n15 = n13;
        }
        final int n16 = n3 & 0x10;
        int n17;
        if (n16 != 0) {
            n17 = (n15 | 0x6000);
        }
        else {
            n17 = n15;
            if ((0xE000 & n2) == 0x0) {
                int n18;
                if (h.P((Object)oth)) {
                    n18 = 16384;
                }
                else {
                    n18 = 8192;
                }
                n17 = (n15 | n18);
            }
        }
        if ((0x70000 & n2) == 0x0) {
            int n19;
            if ((n3 & 0x20) == 0x0 && h.e(a)) {
                n19 = 131072;
            }
            else {
                n19 = 65536;
            }
            n17 |= n19;
        }
        if ((0x380000 & n2) == 0x0) {
            int n20;
            if ((n3 & 0x40) == 0x0 && h.e(n)) {
                n20 = 1048576;
            }
            else {
                n20 = 524288;
            }
            n17 |= n20;
        }
        int n22 = 0;
        Label_0514: {
            int n21;
            if ((n3 & 0x80) != 0x0) {
                n21 = 12582912;
            }
            else {
                n22 = n17;
                if ((0x1C00000 & n2) != 0x0) {
                    break Label_0514;
                }
                if (h.P((Object)jub)) {
                    n21 = 8388608;
                }
                else {
                    n21 = 4194304;
                }
            }
            n22 = (n17 | n21);
        }
        jkh jkh;
        long n23;
        if ((0x16DB6DB & n22) == 0x492492 && h.i()) {
            h.H();
            jkh = companion;
            n23 = n;
        }
        else {
            h.C();
            jkh jkh2 = null;
            oth oth3 = null;
            Label_0820: {
                if ((n2 & 0x1) != 0x0 && !h.K()) {
                    h.H();
                    int n24 = n22;
                    if ((n3 & 0x20) != 0x0) {
                        n24 = (n22 & 0xFFF8FFFF);
                    }
                    n22 = n24;
                    if ((n3 & 0x40) != 0x0) {
                        n22 = (n24 & 0xFFC7FFFF);
                    }
                }
                else {
                    if (n8 != 0) {
                        companion = jkh.Companion;
                    }
                    if (n12 != 0) {
                        b2 = true;
                    }
                    if (n16 != 0) {
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
                    if ((n3 & 0x20) != 0x0) {
                        a = ((pr4)h.m((re6)ll6.a)).a;
                        n22 &= 0xFFF8FFFF;
                    }
                    if ((n3 & 0x40) != 0x0) {
                        final long b3 = pr4.b(a, x3j.F(h));
                        final oth oth2 = oth;
                        n22 &= 0xFFC7FFFF;
                        jkh2 = companion;
                        oth3 = oth2;
                        n = a;
                        a = b3;
                        break Label_0820;
                    }
                }
                final long n25 = n;
                n = a;
                final jkh jkh3 = companion;
                a = n25;
                oth3 = oth;
                jkh2 = jkh3;
            }
            h.s();
            final ea6$b a2 = ea6.a;
            final i36 j = m8y.j(h, -1237246709, new v7s$c(jkh2, b, oth3, jzm.a(true, 0.0f, n, h, (n22 >> 9 & 0x380) | 0x6, 2), b2, (otb)otb, (jub)jub, n22));
            final int n26 = n22 >> 15;
            c(n, a, b, (gub<? super m76, ? super Integer, oyv>)j, h, (n26 & 0x70) | ((n26 & 0xE) | 0xC00) | (n22 << 6 & 0x380));
            jkh = jkh2;
            n23 = a;
            a = n;
            oth = oth3;
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new v7s$d(b, (otb)otb, jkh, b2, oth, a, n23, (jub)jub, n2, n3));
        }
    }
    
    public static final void c(final long n, final long n2, final boolean b, final gub<? super m76, ? super Integer, oyv> gub, final m76 m76, final int n3) {
        final m76 h = m76.h(-405571117);
        int n5;
        if ((n3 & 0xE) == 0x0) {
            int n4;
            if (h.e(n)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n5 = (n4 | n3);
        }
        else {
            n5 = n3;
        }
        int n6 = n5;
        if ((n3 & 0x70) == 0x0) {
            int n7;
            if (h.e(n2)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n5 | n7);
        }
        int n9;
        if ((n3 & 0x380) == 0x0) {
            int n8;
            if (h.a(b)) {
                n8 = 256;
            }
            else {
                n8 = 128;
            }
            n9 = (n6 | n8);
        }
        else {
            n9 = n6;
        }
        int n10 = n9;
        if ((n3 & 0x1C00) == 0x0) {
            int n11;
            if (h.P((Object)gub)) {
                n11 = 2048;
            }
            else {
                n11 = 1024;
            }
            n10 = (n9 | n11);
        }
        if ((n10 & 0x16DB) == 0x492 && h.i()) {
            h.H();
        }
        else {
            final ea6$b a = ea6.a;
            final int n12 = n10 >> 6;
            final wyt c = ozt.c((Object)b, (String)null, h, n12 & 0xE, 2);
            final v7s$g c2 = v7s$g.C0;
            h.x(-1462136984);
            final boolean booleanValue = (boolean)c.f();
            h.x(1445938070);
            long n13;
            if (booleanValue) {
                n13 = n;
            }
            else {
                n13 = n2;
            }
            h.O();
            final as4 f = pr4.f(n13);
            h.x(-3686930);
            final boolean p6 = h.P((Object)f);
            final Object y = h.y();
            Object o = null;
            Label_0398: {
                if (!p6) {
                    Objects.requireNonNull(m76.Companion);
                    if ((o = y) != m76$a.b) {
                        break Label_0398;
                    }
                }
                js4.b(pr4.Companion);
                o = js4.a.invoke((Object)f);
                h.p(o);
            }
            h.O();
            final chv chv = (chv)o;
            h.x(1847725064);
            final boolean booleanValue2 = (boolean)c.b();
            h.x(1445938070);
            long n14;
            if (booleanValue2) {
                n14 = n;
            }
            else {
                n14 = n2;
            }
            h.O();
            final pr4 pr4 = new pr4(n14);
            final boolean booleanValue3 = (boolean)c.f();
            h.x(1445938070);
            long n15;
            if (booleanValue3) {
                n15 = n;
            }
            else {
                n15 = n2;
            }
            h.O();
            final q7r b2 = ozt.b(c, (Object)pr4, (Object)new pr4(n15), (x0b)c2.h0((Object)c.d(), (Object)h, (Object)0), chv, "ColorAnimation", h);
            h.O();
            h.O();
            final xo9 a2 = ll6.a;
            final wyt$d wyt$d = (wyt$d)b2;
            se6.a(new oll[] { ((mll)a2).b((Object)new pr4(pr4.b(((pr4)wyt$d.getValue()).a, 1.0f))), ((mll)kl6.a).b((Object)pr4.d(((pr4)wyt$d.getValue()).a)) }, (gub)gub, h, (n12 & 0x70) | 0x8);
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new v7s$f(n, n2, b, (gub)gub, n3));
        }
    }
    
    public static final void d(final gub gub, final gub gub2, m76 h, final int n) {
        h = h.h(1249848471);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (h.P((Object)gub)) {
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
            if (h.P((Object)gub2)) {
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
            final ea6$b a = ea6.a;
            final w7s w7s = new w7s((gub<? super m76, ? super Integer, oyv>)gub, (gub<? super m76, ? super Integer, oyv>)gub2);
            h.x(-1323940314);
            final jkh.a companion = jkh.Companion;
            final n9r e = te6.e;
            final dp8 dp8 = (dp8)h.m((re6)e);
            final n9r k = te6.k;
            final tve tve = (tve)h.m((re6)k);
            final n9r o = te6.o;
            final z5x z5x = (z5x)h.m((re6)o);
            Objects.requireNonNull(f76.Companion);
            final jwe$a b = f76.a.b;
            final jub a2 = cwe.a((jkh)companion);
            if (!(h.j() instanceof xr0)) {
                ukg.l0();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((otb)b);
            }
            else {
                h.o();
            }
            h.F();
            final f76$a$c e2 = f76.a.e;
            r9x.v(h, (Object)w7s, (gub)e2);
            final f76$a$a d = f76.a.d;
            r9x.v(h, (Object)dp8, (gub)d);
            final f76$a$b f = f76.a.f;
            r9x.v(h, (Object)tve, (gub)f);
            final f76$a$e g = f76.a.g;
            ((j36)a2).h0((Object)hvl.b(h, z5x, g, h), (Object)h, (Object)0);
            nh.y(h, 2058660585, 1142473408, -2141028452);
            if (gub != null) {
                final jkh s = oyz.S(rqu.z((jkh)companion, (Object)"text"), v7s.c, 0.0f, 2);
                h.x(733328855);
                Objects.requireNonNull(dx.Companion);
                final gqg d2 = ib2.d((dx)dx$a.b, false, h);
                h.x(-1323940314);
                final dp8 dp9 = (dp8)h.m((re6)e);
                final tve tve2 = (tve)h.m((re6)k);
                final z5x z5x2 = (z5x)h.m((re6)o);
                final jub a3 = cwe.a(s);
                if (!(h.j() instanceof xr0)) {
                    ukg.l0();
                    throw null;
                }
                h.E();
                if (h.f()) {
                    h.A((otb)b);
                }
                else {
                    h.o();
                }
                ((j36)a3).h0((Object)af.x(h, h, d2, e2, h, dp9, d, h, tve2, f, h, z5x2, g, h), (Object)h, (Object)0);
                nh.y(h, 2058660585, -2137368960, -459869377);
                gub.invoke((Object)h, (Object)(n4 & 0xE));
                h.O();
                h.O();
                h.O();
                h.r();
                h.O();
                h.O();
            }
            h.O();
            if (gub2 != null) {
                final jkh z = rqu.z((jkh)companion, (Object)"icon");
                h.x(733328855);
                Objects.requireNonNull(dx.Companion);
                final gqg d3 = ib2.d((dx)dx$a.b, false, h);
                h.x(-1323940314);
                final dp8 dp10 = (dp8)h.m((re6)e);
                final tve tve3 = (tve)h.m((re6)k);
                final z5x z5x3 = (z5x)h.m((re6)o);
                final jub a4 = cwe.a(z);
                if (!(h.j() instanceof xr0)) {
                    ukg.l0();
                    throw null;
                }
                h.E();
                if (h.f()) {
                    h.A((otb)b);
                }
                else {
                    h.o();
                }
                ((j36)a4).h0((Object)af.x(h, h, d3, e2, h, dp10, d, h, tve3, f, h, z5x3, g, h), (Object)h, (Object)0);
                nh.y(h, 2058660585, -2137368960, 892169960);
                gub2.invoke((Object)h, (Object)(n4 >> 3 & 0xE));
                h.O();
                h.O();
                h.O();
                h.r();
                h.O();
                h.O();
            }
            h.O();
            h.O();
            h.r();
            h.O();
        }
        final vwo i = h.k();
        if (i != null) {
            i.a((gub)new x7s(gub, gub2, n));
        }
    }
}
