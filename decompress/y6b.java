import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y6b
{
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    
    static {
        a = 56;
        b = 48;
        c = 12;
        d = 20;
    }
    
    public static final void a(final ftb<? super x66, ? super Integer, fzv> ftb, final nsb<fzv> nsb, okh okh, ftb<? super x66, ? super Integer, fzv> ftb2, final sth sth, frp frp, long j, long b, final u6b u6b, final x66 x66, final int n, final int n2) {
        czd.f((Object)ftb, "text");
        czd.f((Object)nsb, "onClick");
        final x66 h = x66.h(-1555720195);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)ftb)) {
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
                if (h.P((Object)nsb)) {
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
        Label_0213: {
            int n8;
            if (n7 != 0) {
                n8 = (n5 | 0x180);
            }
            else {
                n8 = n5;
                if ((n & 0x380) == 0x0) {
                    int n9;
                    if (h.P((Object)okh)) {
                        n9 = 256;
                    }
                    else {
                        n9 = 128;
                    }
                    n10 = (n5 | n9);
                    break Label_0213;
                }
            }
            n10 = n8;
        }
        final int n11 = n2 & 0x8;
        int n14 = 0;
        Label_0287: {
            int n12;
            if (n11 != 0) {
                n12 = (n10 | 0xC00);
            }
            else {
                n12 = n10;
                if ((n & 0x1C00) == 0x0) {
                    int n13;
                    if (h.P((Object)ftb2)) {
                        n13 = 2048;
                    }
                    else {
                        n13 = 1024;
                    }
                    n14 = (n10 | n13);
                    break Label_0287;
                }
            }
            n14 = n12;
        }
        final int n15 = n2 & 0x10;
        int n18 = 0;
        Label_0361: {
            int n16;
            if (n15 != 0) {
                n16 = (n14 | 0x6000);
            }
            else {
                n16 = n14;
                if ((0xE000 & n) == 0x0) {
                    int n17;
                    if (h.P((Object)sth)) {
                        n17 = 16384;
                    }
                    else {
                        n17 = 8192;
                    }
                    n18 = (n14 | n17);
                    break Label_0361;
                }
            }
            n18 = n16;
        }
        if ((0x70000 & n) == 0x0) {
            int n19;
            if ((n2 & 0x20) == 0x0 && h.P((Object)frp)) {
                n19 = 131072;
            }
            else {
                n19 = 65536;
            }
            n18 |= n19;
        }
        if ((0x380000 & n) == 0x0) {
            int n20;
            if ((n2 & 0x40) == 0x0 && h.e(j)) {
                n20 = 1048576;
            }
            else {
                n20 = 524288;
            }
            n18 |= n20;
        }
        if ((0x1C00000 & n) == 0x0) {
            int n21;
            if ((n2 & 0x80) == 0x0 && h.e(b)) {
                n21 = 8388608;
            }
            else {
                n21 = 4194304;
            }
            n18 |= n21;
        }
        if ((0xE000000 & n) == 0x0) {
            int n22;
            if ((n2 & 0x100) == 0x0 && h.P((Object)u6b)) {
                n22 = 67108864;
            }
            else {
                n22 = 33554432;
            }
            n18 |= n22;
        }
        frp frp2;
        sth sth2;
        long n23;
        u6b u6b2;
        if ((n18 & 0xB6DB6DB) == 0x2492492 && h.i()) {
            h.H();
            frp2 = frp;
            sth2 = sth;
            n23 = j;
            j = b;
            u6b2 = u6b;
        }
        else {
            h.C();
            int n27;
            ftb<? super x66, ? super Integer, fzv> ftb3;
            okh okh3;
            if ((n & 0x1) != 0x0 && !h.K()) {
                h.H();
                int n24 = n18;
                if ((n2 & 0x20) != 0x0) {
                    n24 = (n18 & 0xFFF8FFFF);
                }
                int n25 = n24;
                if ((n2 & 0x40) != 0x0) {
                    n25 = (n24 & 0xFFC7FFFF);
                }
                int n26 = n25;
                if ((n2 & 0x80) != 0x0) {
                    n26 = (n25 & 0xFE3FFFFF);
                }
                n27 = n26;
                if ((n2 & 0x100) != 0x0) {
                    n27 = (n26 & 0xF1FFFFFF);
                }
                final long n28 = b;
                u6b2 = u6b;
                final okh okh2 = okh;
                ftb3 = ftb2;
                okh3 = okh2;
                sth2 = sth;
                b = j;
                j = n28;
            }
            else {
                Object companion;
                if (n7 != 0) {
                    companion = okh.Companion;
                }
                else {
                    companion = okh;
                }
                if (n11 != 0) {
                    ftb3 = null;
                }
                else {
                    ftb3 = ftb2;
                }
                sth sth3;
                if (n15 != 0) {
                    h.x(-492369756);
                    final Object y = h.y();
                    Objects.requireNonNull(x66.Companion);
                    Object f;
                    if ((f = y) == x66$a.b) {
                        f = h91.f(h);
                    }
                    h.O();
                    sth3 = (sth)f;
                }
                else {
                    sth3 = sth;
                }
                Object b2;
                if ((n2 & 0x20) != 0x0) {
                    final n96$b a = n96.a;
                    final mx6 a2 = ((bsp)h.m((wd6)csp.a)).a;
                    final qx6 a3 = rx6.a(50);
                    Objects.requireNonNull(a2);
                    b2 = a2.b(a3, a3, a3, a3);
                    n18 &= 0xFFF8FFFF;
                }
                else {
                    b2 = frp;
                }
                int n29 = n18;
                if ((n2 & 0x40) != 0x0) {
                    final n96$b a4 = n96.a;
                    j = ((ir4)h.m((wd6)jr4.a)).j();
                    n29 = (n18 & 0xFFC7FFFF);
                }
                if ((n2 & 0x80) != 0x0) {
                    b = jr4.b(j, h);
                    n27 = (n29 & 0xFE3FFFFF);
                }
                else {
                    n27 = n29;
                }
                u6b n30;
                if ((n2 & 0x100) != 0x0) {
                    n30 = rpb.n(h);
                    n27 &= 0xF1FFFFFF;
                }
                else {
                    n30 = u6b;
                }
                final Object o = b2;
                final long n31 = b;
                u6b2 = n30;
                b = j;
                j = n31;
                frp = (frp)o;
                sth2 = sth3;
                okh3 = (okh)companion;
            }
            h.s();
            final n96$b a5 = n96.a;
            final float b3 = y6b.b;
            final okh q = kdq.q(okh3, b3, b3, 0.0f, 12);
            final s26 g = io7.g(h, 1418981691, (Object)new y6b$a((ftb)ftb3, n27, (ftb)ftb));
            final int n32 = n27 >> 6;
            b(nsb, q, sth2, frp, b, j, u6b2, (ftb<? super x66, ? super Integer, fzv>)g, h, 0xC00000 | (n27 >> 3 & 0xE) | (n32 & 0x380) | (n32 & 0x1C00) | (0xE000 & n32) | (0x70000 & n32) | (n32 & 0x380000), 0);
            frp2 = frp;
            final okh okh4 = okh3;
            n23 = b;
            ftb2 = ftb3;
            okh = okh4;
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new y6b$b((ftb)ftb, (nsb)nsb, okh, (ftb)ftb2, sth2, frp2, n23, j, u6b2, n, n2));
        }
    }
    
    public static final void b(final nsb<fzv> nsb, okh companion, sth sth, frp b, long j, long b2, u6b n, final ftb<? super x66, ? super Integer, fzv> ftb, final x66 x66, final int n2, final int n3) {
        czd.f((Object)nsb, "onClick");
        czd.f((Object)ftb, "content");
        final x66 h = x66.h(1028985328);
        int n4;
        if ((n3 & 0x1) != 0x0) {
            n4 = (n2 | 0x6);
        }
        else if ((n2 & 0xE) == 0x0) {
            int n5;
            if (h.P((Object)nsb)) {
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
                    if (h.P((Object)sth)) {
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
        if ((n2 & 0x1C00) == 0x0) {
            int n14;
            if ((n3 & 0x8) == 0x0 && h.P((Object)b)) {
                n14 = 2048;
            }
            else {
                n14 = 1024;
            }
            n13 |= n14;
        }
        if ((0xE000 & n2) == 0x0) {
            int n15;
            if ((n3 & 0x10) == 0x0 && h.e(j)) {
                n15 = 16384;
            }
            else {
                n15 = 8192;
            }
            n13 |= n15;
        }
        if ((0x70000 & n2) == 0x0) {
            int n16;
            if ((n3 & 0x20) == 0x0 && h.e(b2)) {
                n16 = 131072;
            }
            else {
                n16 = 65536;
            }
            n13 |= n16;
        }
        int n18;
        if ((0x380000 & n2) == 0x0) {
            int n17;
            if ((n3 & 0x40) == 0x0 && h.P((Object)n)) {
                n17 = 1048576;
            }
            else {
                n17 = 524288;
            }
            n18 = (n13 | n17);
        }
        else {
            n18 = n13;
        }
        int n20 = 0;
        Label_0487: {
            int n19;
            if ((n3 & 0x80) != 0x0) {
                n19 = 12582912;
            }
            else {
                n20 = n18;
                if ((0x1C00000 & n2) != 0x0) {
                    break Label_0487;
                }
                if (h.P((Object)ftb)) {
                    n19 = 8388608;
                }
                else {
                    n19 = 4194304;
                }
            }
            n20 = (n18 | n19);
        }
        u6b u6b;
        okh okh2;
        if ((0x16DB6DB & n20) == 0x492492 && h.i()) {
            h.H();
            final okh okh = companion;
            u6b = n;
            okh2 = okh;
        }
        else {
            h.C();
            if ((n2 & 0x1) != 0x0 && !h.K()) {
                h.H();
                int n21 = n20;
                if ((n3 & 0x8) != 0x0) {
                    n21 = (n20 & 0xFFFFE3FF);
                }
                int n22 = n21;
                if ((n3 & 0x10) != 0x0) {
                    n22 = (n21 & 0xFFFF1FFF);
                }
                int n23 = n22;
                if ((n3 & 0x20) != 0x0) {
                    n23 = (n22 & 0xFFF8FFFF);
                }
                n20 = n23;
                if ((n3 & 0x40) != 0x0) {
                    n20 = (n23 & 0xFFC7FFFF);
                }
                final okh okh3 = companion;
                u6b = n;
                okh2 = okh3;
            }
            else {
                if (n6 != 0) {
                    companion = (okh)okh.Companion;
                }
                if (n10 != 0) {
                    h.x(-492369756);
                    final Object y = h.y();
                    Objects.requireNonNull(x66.Companion);
                    Object f;
                    if ((f = y) == x66$a.b) {
                        f = h91.f(h);
                    }
                    h.O();
                    sth = (sth)f;
                }
                if ((n3 & 0x8) != 0x0) {
                    final n96$b a = n96.a;
                    final mx6 a2 = ((bsp)h.m((wd6)csp.a)).a;
                    final qx6 a3 = rx6.a(50);
                    Objects.requireNonNull(a2);
                    b = (frp)a2.b(a3, a3, a3, a3);
                    n20 &= 0xFFFFE3FF;
                }
                if ((n3 & 0x10) != 0x0) {
                    final n96$b a4 = n96.a;
                    j = ((ir4)h.m((wd6)jr4.a)).j();
                    n20 &= 0xFFFF1FFF;
                }
                if ((n3 & 0x20) != 0x0) {
                    b2 = jr4.b(j, h);
                    n20 &= 0xFFF8FFFF;
                }
                if ((n3 & 0x40) != 0x0) {
                    n = rpb.n(h);
                    n20 &= 0xFFC7FFFF;
                }
                final u6b u6b2 = n;
                okh2 = companion;
                u6b = u6b2;
            }
            h.s();
            final n96$b a5 = n96.a;
            c0s.b((nsb)nsb, okh2, false, b, j, b2, (t72)null, ((m89)u6b.a((fud)sth, h, (n20 >> 6 & 0xE) | (n20 >> 15 & 0x70)).getValue()).D0, sth, (ftb)io7.g(h, 1972871863, (Object)new y6b$c(b2, (ftb)ftb, n20)), h, 0x30000000 | (n20 & 0xE) | (n20 & 0x70) | (n20 & 0x1C00) | (0xE000 & n20) | (0x70000 & n20) | (n20 << 18 & 0xE000000), 68);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new y6b$d((nsb)nsb, okh2, sth, b, j, b2, u6b, (ftb)ftb, n2, n3));
        }
    }
}
