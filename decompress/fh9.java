import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fh9
{
    public static final float a;
    public static final float b;
    public static final tbu<Float> c;
    
    static {
        a = 56;
        b = 400;
        c = new tbu(256, (jp9)null, 6);
    }
    
    public static final void a(final itb<? super pr4, ? super x66, ? super Integer, fzv> itb, okh companion, xh9 c, boolean b, frp c2, float b2, long l, long b3, long a, final ftb<? super x66, ? super Integer, fzv> ftb, final x66 x66, final int n, final int n2) {
        czd.f((Object)itb, "drawerContent");
        czd.f((Object)ftb, "content");
        final x66 h = x66.h(1305806945);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)itb)) {
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
        int n8 = 0;
        Label_0152: {
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
                    n8 = (n3 | n7);
                    break Label_0152;
                }
            }
            n8 = n6;
        }
        if ((n & 0x380) == 0x0) {
            int n9;
            if ((n2 & 0x4) == 0x0 && h.P((Object)c)) {
                n9 = 256;
            }
            else {
                n9 = 128;
            }
            n8 |= n9;
        }
        final int n10 = n2 & 0x8;
        int n13 = 0;
        Label_0276: {
            int n11;
            if (n10 != 0) {
                n11 = (n8 | 0xC00);
            }
            else {
                n11 = n8;
                if ((n & 0x1C00) == 0x0) {
                    int n12;
                    if (h.a(b)) {
                        n12 = 2048;
                    }
                    else {
                        n12 = 1024;
                    }
                    n13 = (n8 | n12);
                    break Label_0276;
                }
            }
            n13 = n11;
        }
        if ((0xE000 & n) == 0x0) {
            int n14;
            if ((n2 & 0x10) == 0x0 && h.P((Object)c2)) {
                n14 = 16384;
            }
            else {
                n14 = 8192;
            }
            n13 |= n14;
        }
        final int n15 = n2 & 0x20;
        int n18 = 0;
        Label_0398: {
            int n16;
            if (n15 != 0) {
                n16 = (n13 | 0x30000);
            }
            else {
                n16 = n13;
                if ((0x70000 & n) == 0x0) {
                    int n17;
                    if (h.b(b2)) {
                        n17 = 131072;
                    }
                    else {
                        n17 = 65536;
                    }
                    n18 = (n13 | n17);
                    break Label_0398;
                }
            }
            n18 = n16;
        }
        if ((0x380000 & n) == 0x0) {
            int n19;
            if ((n2 & 0x40) == 0x0 && h.e(l)) {
                n19 = 1048576;
            }
            else {
                n19 = 524288;
            }
            n18 |= n19;
        }
        int n21;
        if ((n & 0x1C00000) == 0x0) {
            int n20;
            if ((n2 & 0x80) == 0x0 && h.e(b3)) {
                n20 = 8388608;
            }
            else {
                n20 = 4194304;
            }
            n21 = (n18 | n20);
        }
        else {
            n21 = n18;
        }
        if ((n & 0xE000000) == 0x0) {
            int n22;
            if ((n2 & 0x100) == 0x0 && h.e(a)) {
                n22 = 67108864;
            }
            else {
                n22 = 33554432;
            }
            n21 |= n22;
        }
        int n24 = 0;
        Label_0609: {
            int n23;
            if ((n2 & 0x200) != 0x0) {
                n23 = 805306368;
            }
            else {
                n24 = n21;
                if ((0x70000000 & n) != 0x0) {
                    break Label_0609;
                }
                if (h.P((Object)ftb)) {
                    n23 = 536870912;
                }
                else {
                    n23 = 268435456;
                }
            }
            n24 = (n21 | n23);
        }
        frp frp;
        okh okh;
        xh9 xh10;
        long n25;
        if ((0x5B6DB6DB & n24) == 0x12492492 && h.i()) {
            h.H();
            final xh9 xh9 = c;
            frp = c2;
            okh = companion;
            xh10 = xh9;
            n25 = l;
            l = a;
        }
        else {
            h.C();
            frp frp2;
            if ((n & 0x1) != 0x0 && !h.K()) {
                h.H();
                int n26 = n24;
                if ((n2 & 0x4) != 0x0) {
                    n26 = (n24 & 0xFFFFFC7F);
                }
                int n27 = n26;
                if ((n2 & 0x10) != 0x0) {
                    n27 = (n26 & 0xFFFF1FFF);
                }
                int n28 = n27;
                if ((n2 & 0x40) != 0x0) {
                    n28 = (n27 & 0xFFC7FFFF);
                }
                int n29 = n28;
                if ((n2 & 0x80) != 0x0) {
                    n29 = (n28 & 0xFE3FFFFF);
                }
                int n30 = n29;
                if ((n2 & 0x100) != 0x0) {
                    n30 = (n29 & 0xF1FFFFFF);
                }
                final okh okh2 = companion;
                final long n31 = a;
                frp2 = c2;
                n24 = n30;
                okh = okh2;
                a = l;
                l = n31;
            }
            else {
                if (n5 != 0) {
                    companion = (okh)okh.Companion;
                }
                if ((n2 & 0x4) != 0x0) {
                    c = c(h);
                    n24 &= 0xFFFFFC7F;
                }
                if (n10 != 0) {
                    b = true;
                }
                if ((n2 & 0x10) != 0x0) {
                    final n96$b a2 = n96.a;
                    c2 = (frp)((bsp)h.m((wd6)csp.a)).c;
                    n24 &= 0xFFFF1FFF;
                }
                if (n15 != 0) {
                    final gf9 a3 = gf9.a;
                    b2 = gf9.b;
                }
                if ((n2 & 0x40) != 0x0) {
                    final n96$b a4 = n96.a;
                    l = ((ir4)h.m((wd6)jr4.a)).l();
                    n24 &= 0xFFC7FFFF;
                }
                if ((n2 & 0x80) != 0x0) {
                    b3 = jr4.b(l, h);
                    n24 &= 0xFE3FFFFF;
                }
                if ((n2 & 0x100) != 0x0) {
                    final gf9 a5 = gf9.a;
                    a = gf9.a(h);
                    n24 &= 0xF1FFFFFF;
                }
                final frp frp3 = c2;
                final long n32 = l;
                l = a;
                okh = companion;
                a = n32;
                frp2 = frp3;
            }
            h.s();
            final n96$b a6 = n96.a;
            final Object y = nb0.y(h, 773894976, -492369756);
            Objects.requireNonNull(x66.Companion);
            Object g = y;
            if (y == x66$a.b) {
                g = mb0.g(npe.C(h), h);
            }
            h.O();
            final cy6 d0 = ((zd6)g).D0;
            h.O();
            fb2.a(kdq.g(okh), null, false, (itb<? super gb2, ? super x66, ? super Integer, fzv>)io7.g(h, 816674999, (Object)new fh9$a(c, b, n24, l, frp2, a, b3, b2, (ftb)ftb, d0, (itb)itb)), h, 3072, 6);
            final xh9 xh11 = c;
            n25 = a;
            frp = frp2;
            xh10 = xh11;
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new fh9$b((itb)itb, okh, xh10, b, frp, b2, n25, b3, l, (ftb)ftb, n, n2));
        }
    }
    
    public static final void b(final boolean b, final nsb nsb, final nsb nsb2, final long n, final x66 x66, final int n2) {
        final x66 h = x66.h(1983403750);
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
            if (h.P((Object)nsb)) {
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
            if (h.P((Object)nsb2)) {
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
            if (h.e(n)) {
                n10 = 2048;
            }
            else {
                n10 = 1024;
            }
            n9 = (n7 | n10);
        }
        if ((n9 & 0x16DB) == 0x492 && h.i()) {
            h.H();
        }
        else {
            final n96$b a = n96.a;
            Objects.requireNonNull(mkr.Companion);
            final String g = z6q.g(1, h);
            h.x(1010554047);
            Object o3;
            if (b) {
                final okh$a companion = okh.Companion;
                h.x(1157296644);
                final boolean p6 = h.P((Object)nsb);
                final Object y = h.y();
                Object o = null;
                Label_0327: {
                    if (!p6) {
                        Objects.requireNonNull(x66.Companion);
                        if ((o = y) != x66$a.b) {
                            break Label_0327;
                        }
                    }
                    o = new ih9((nsb<fzv>)nsb, null);
                    h.p(o);
                }
                h.O();
                final okh a2 = u0s.a((okh)companion, (Object)nsb, (ftb)o);
                h.x(511388516);
                final boolean p7 = h.P((Object)g);
                final boolean p8 = h.P((Object)nsb);
                final Object y2 = h.y();
                Object o2 = null;
                Label_0435: {
                    if (!(p7 | p8)) {
                        Objects.requireNonNull(x66.Companion);
                        if ((o2 = y2) != x66$a.b) {
                            break Label_0435;
                        }
                    }
                    o2 = new kh9(g, nsb);
                    h.p(o2);
                }
                h.O();
                o3 = oj7.n(a2, true, (qsb)o2);
            }
            else {
                o3 = okh.Companion;
            }
            h.O();
            final okh e = kdq.g((okh)okh.Companion).E((okh)o3);
            final nq4 nq4 = new nq4(n);
            h.x(511388516);
            final boolean p9 = h.P((Object)nq4);
            final boolean p10 = h.P((Object)nsb2);
            final Object y3 = h.y();
            Object o4 = null;
            Label_0582: {
                if (!(p9 | p10)) {
                    Objects.requireNonNull(x66.Companion);
                    if ((o4 = y3) != x66$a.b) {
                        break Label_0582;
                    }
                }
                o4 = new gh9(n, nsb2);
                h.p(o4);
            }
            h.O();
            eg3.a(e, (qsb)o4, h, 0);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new hh9(b, nsb, nsb2, n, n2));
        }
    }
    
    public static final xh9 c(final hi9 hi9, final qsb<? super hi9, Boolean> qsb, final x66 x66, final int n, final int n2) {
        final hi9 d0 = hi9.D0;
        ((x66)hi9).x(-1435874229);
        final lh9 d2 = lh9.D0;
        final n96$b a = n96.a;
        Objects.requireNonNull(xh9.Companion);
        czd.f((Object)d2, "confirmStateChange");
        final uto a2 = vto.a((ftb)vh9.D0, (qsb)new wh9((qsb)d2));
        ((x66)hi9).x(511388516);
        final boolean p5 = ((x66)hi9).P((Object)d0);
        final boolean p6 = ((x66)hi9).P((Object)d2);
        final Object y = ((x66)hi9).y();
        Object o = null;
        Label_0130: {
            if (!(p5 | p6)) {
                Objects.requireNonNull(x66.Companion);
                if ((o = y) != x66$a.b) {
                    break Label_0130;
                }
            }
            o = new mh9((qsb)d2);
            ((x66)hi9).p(o);
        }
        ((x66)hi9).O();
        final xh9 xh9 = (xh9)uoz.T(new Object[0], a2, (String)null, (nsb)o, (x66)hi9, 4);
        ((x66)hi9).O();
        return xh9;
    }
}
