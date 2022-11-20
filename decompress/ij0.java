// 
// Decompiled by Procyon v0.6.0
// 

public final class ij0
{
    public static final float a;
    public static final float b;
    public static final okh c;
    public static final okh d;
    
    static {
        a = 56;
        final float n = b = 4;
        final okh$a companion = okh.Companion;
        c = kdq.r((okh)companion, 16 - n);
        d = kdq.r(kdq.f((okh)companion), 72 - n);
    }
    
    public static final void a(final long n, final long n2, final float n3, final zrj zrj, final frp frp, okh companion, final itb<? super wlo, ? super x66, ? super Integer, fzv> itb, x66 h, final int n4, final int n5) {
        h = h.h(-1249680788);
        int n6;
        if ((n5 & 0x1) != 0x0) {
            n6 = (n4 | 0x6);
        }
        else if ((n4 & 0xE) == 0x0) {
            int n7;
            if (h.e(n)) {
                n7 = 4;
            }
            else {
                n7 = 2;
            }
            n6 = (n7 | n4);
        }
        else {
            n6 = n4;
        }
        int n10 = 0;
        Label_0135: {
            int n8;
            if ((n5 & 0x2) != 0x0) {
                n8 = (n6 | 0x30);
            }
            else {
                n8 = n6;
                if ((n4 & 0x70) == 0x0) {
                    int n9;
                    if (h.e(n2)) {
                        n9 = 32;
                    }
                    else {
                        n9 = 16;
                    }
                    n10 = (n6 | n9);
                    break Label_0135;
                }
            }
            n10 = n8;
        }
        int n11;
        if ((n5 & 0x4) != 0x0) {
            n11 = (n10 | 0x180);
        }
        else {
            n11 = n10;
            if ((n4 & 0x380) == 0x0) {
                int n12;
                if (h.b(n3)) {
                    n12 = 256;
                }
                else {
                    n12 = 128;
                }
                n11 = (n10 | n12);
            }
        }
        int n13;
        if ((n5 & 0x8) != 0x0) {
            n13 = (n11 | 0xC00);
        }
        else {
            n13 = n11;
            if ((n4 & 0x1C00) == 0x0) {
                int n14;
                if (h.P((Object)zrj)) {
                    n14 = 2048;
                }
                else {
                    n14 = 1024;
                }
                n13 = (n11 | n14);
            }
        }
        int n17 = 0;
        Label_0335: {
            int n15;
            if ((n5 & 0x10) != 0x0) {
                n15 = (n13 | 0x6000);
            }
            else {
                n15 = n13;
                if ((0xE000 & n4) == 0x0) {
                    int n16;
                    if (h.P((Object)frp)) {
                        n16 = 16384;
                    }
                    else {
                        n16 = 8192;
                    }
                    n17 = (n13 | n16);
                    break Label_0335;
                }
            }
            n17 = n15;
        }
        final int n18 = n5 & 0x20;
        int n21 = 0;
        Label_0406: {
            int n19;
            if (n18 != 0) {
                n19 = (n17 | 0x30000);
            }
            else {
                n19 = n17;
                if ((n4 & 0x70000) == 0x0) {
                    int n20;
                    if (h.P((Object)companion)) {
                        n20 = 131072;
                    }
                    else {
                        n20 = 65536;
                    }
                    n21 = (n17 | n20);
                    break Label_0406;
                }
            }
            n21 = n19;
        }
        int n22;
        if ((n5 & 0x40) != 0x0) {
            n22 = (n21 | 0x180000);
        }
        else {
            n22 = n21;
            if ((0x380000 & n4) == 0x0) {
                int n23;
                if (h.P((Object)itb)) {
                    n23 = 1048576;
                }
                else {
                    n23 = 524288;
                }
                n22 = (n21 | n23);
            }
        }
        if ((0x2DB6DB & n22) == 0x92492 && h.i()) {
            h.H();
        }
        else {
            if (n18 != 0) {
                companion = (okh)okh.Companion;
            }
            final n96$b a = n96.a;
            final s26 g = io7.g(h, -1027830352, (Object)new ij0$a(zrj, (itb)itb, n22));
            final int n24 = n22 << 6;
            c0s.a(companion, frp, n, n2, (t72)null, n3, (ftb)g, h, (n22 >> 15 & 0xE) | 0x180000 | (n22 >> 9 & 0x70) | (n24 & 0x380) | (n24 & 0x1C00) | (n22 << 9 & 0x70000), 16);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ij0$b(n, n2, n3, zrj, frp, companion, (itb)itb, n4, n5));
        }
    }
    
    public static final void b(okh companion, long c, long b, float b2, final zrj zrj, final itb<? super wlo, ? super x66, ? super Integer, fzv> itb, final x66 x66, final int n, final int n2) {
        czd.f((Object)itb, "content");
        final x66 h = x66.h(1897058582);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n5;
            if (h.P((Object)companion)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n);
        }
        else {
            n4 = n;
        }
        if ((n & 0x70) == 0x0) {
            int n6;
            if ((n2 & 0x2) == 0x0 && h.e(c)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n4 |= n6;
        }
        if ((n & 0x380) == 0x0) {
            int n7;
            if ((n2 & 0x4) == 0x0 && h.e(b)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n4 |= n7;
        }
        final int n8 = n2 & 0x8;
        int n11 = 0;
        Label_0253: {
            int n9;
            if (n8 != 0) {
                n9 = (n4 | 0xC00);
            }
            else {
                n9 = n4;
                if ((n & 0x1C00) == 0x0) {
                    int n10;
                    if (h.b(b2)) {
                        n10 = 2048;
                    }
                    else {
                        n10 = 1024;
                    }
                    n11 = (n4 | n10);
                    break Label_0253;
                }
            }
            n11 = n9;
        }
        final int n12 = n2 & 0x10;
        int n13;
        if (n12 != 0) {
            n13 = (n11 | 0x6000);
        }
        else {
            n13 = n11;
            if ((0xE000 & n) == 0x0) {
                int n14;
                if (h.P((Object)zrj)) {
                    n14 = 16384;
                }
                else {
                    n14 = 8192;
                }
                n13 = (n11 | n14);
            }
        }
        int n16 = 0;
        Label_0380: {
            int n15;
            if ((n2 & 0x20) != 0x0) {
                n15 = 196608;
            }
            else {
                n16 = n13;
                if ((n & 0x70000) != 0x0) {
                    break Label_0380;
                }
                if (h.P((Object)itb)) {
                    n15 = 131072;
                }
                else {
                    n15 = 65536;
                }
            }
            n16 = (n13 | n15);
        }
        okh okh = null;
        zrj zrj2 = null;
        if ((0x5B6DB & n16) == 0x12492 && h.i()) {
            h.H();
            final long n17 = b;
            okh = companion;
            b = c;
            c = n17;
            zrj2 = zrj;
        }
        else {
            h.C();
            int n25 = 0;
            Label_0685: {
                okh okh2;
                int n20;
                long n21;
                long n22;
                float n23;
                if ((n & 0x1) != 0x0 && !h.K()) {
                    h.H();
                    int n18 = n16;
                    if ((n2 & 0x2) != 0x0) {
                        n18 = (n16 & 0xFFFFFF8F);
                    }
                    int n19 = n18;
                    if ((n2 & 0x4) != 0x0) {
                        n19 = (n18 & 0xFFFFFC7F);
                    }
                    okh2 = companion;
                    n20 = n19;
                    n21 = c;
                    n22 = b;
                    n23 = b2;
                }
                else {
                    if (n3 != 0) {
                        companion = (okh)okh.Companion;
                    }
                    int n24 = n16;
                    if ((n2 & 0x2) != 0x0) {
                        final n96$b a = n96.a;
                        c = jr4.c((ir4)h.m((wd6)jr4.a));
                        n24 = (n16 & 0xFFFFFF8F);
                    }
                    n25 = n24;
                    if ((n2 & 0x4) != 0x0) {
                        b = jr4.b(c, h);
                        n25 = (n24 & 0xFFFFFC7F);
                    }
                    if (n8 != 0) {
                        final gj0 a2 = gj0.a;
                        b2 = gj0.b;
                    }
                    okh2 = companion;
                    n20 = n25;
                    n21 = c;
                    n22 = b;
                    n23 = b2;
                    if (n12 != 0) {
                        final gj0 a3 = gj0.a;
                        final asj c2 = gj0.c;
                        final long n26 = c;
                        c = b;
                        okh = companion;
                        b = n26;
                        zrj2 = (zrj)c2;
                        break Label_0685;
                    }
                }
                b = n21;
                c = n22;
                b2 = n23;
                zrj2 = zrj;
                okh = okh2;
                n25 = n20;
            }
            h.s();
            final n96$b a4 = n96.a;
            final k6m$a a5 = k6m.a;
            final int n27 = n25 >> 3;
            a(b, c, b2, zrj2, (frp)a5, okh, itb, h, (n27 & 0x1C00) | ((n27 & 0xE) | 0x6000 | (n27 & 0x70) | (n27 & 0x380)) | (n25 << 15 & 0x70000) | (0x380000 & n25 << 3), 0);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ij0$e(okh, b, c, b2, zrj2, (itb)itb, n, n2));
        }
    }
    
    public static final void c(final ftb<? super x66, ? super Integer, fzv> ftb, okh companion, final ftb<? super x66, ? super Integer, fzv> ftb2, final itb<? super wlo, ? super x66, ? super Integer, fzv> itb, long c, long b, float b2, final x66 x66, final int n, final int n2) {
        czd.f((Object)ftb, "title");
        final x66 h = x66.h(-2087748139);
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
        final int n5 = n2 & 0x2;
        int n8 = 0;
        Label_0145: {
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
                    break Label_0145;
                }
            }
            n8 = n6;
        }
        final int n9 = n2 & 0x4;
        int n12 = 0;
        Label_0218: {
            int n10;
            if (n9 != 0) {
                n10 = (n8 | 0x180);
            }
            else {
                n10 = n8;
                if ((n & 0x380) == 0x0) {
                    int n11;
                    if (h.P((Object)ftb2)) {
                        n11 = 256;
                    }
                    else {
                        n11 = 128;
                    }
                    n12 = (n8 | n11);
                    break Label_0218;
                }
            }
            n12 = n10;
        }
        final int n13 = n2 & 0x8;
        int n16 = 0;
        Label_0292: {
            int n14;
            if (n13 != 0) {
                n14 = (n12 | 0xC00);
            }
            else {
                n14 = n12;
                if ((n & 0x1C00) == 0x0) {
                    int n15;
                    if (h.P((Object)itb)) {
                        n15 = 2048;
                    }
                    else {
                        n15 = 1024;
                    }
                    n16 = (n12 | n15);
                    break Label_0292;
                }
            }
            n16 = n14;
        }
        if ((0xE000 & n) == 0x0) {
            int n17;
            if ((n2 & 0x10) == 0x0 && h.e(c)) {
                n17 = 16384;
            }
            else {
                n17 = 8192;
            }
            n16 |= n17;
        }
        int n19;
        if ((n & 0x70000) == 0x0) {
            int n18;
            if ((n2 & 0x20) == 0x0 && h.e(b)) {
                n18 = 131072;
            }
            else {
                n18 = 65536;
            }
            n19 = (n16 | n18);
        }
        else {
            n19 = n16;
        }
        final int n20 = n2 & 0x40;
        int n21;
        if (n20 != 0) {
            n21 = (n19 | 0x180000);
        }
        else {
            n21 = n19;
            if ((n & 0x380000) == 0x0) {
                int n22;
                if (h.b(b2)) {
                    n22 = 1048576;
                }
                else {
                    n22 = 524288;
                }
                n21 = (n19 | n22);
            }
        }
        Object b3;
        ftb<? super x66, ? super Integer, fzv> ftb3;
        if ((n21 & 0x2DB6DB) == 0x92492 && h.i()) {
            h.H();
            b3 = itb;
            ftb3 = ftb2;
        }
        else {
            h.C();
            if ((n & 0x1) != 0x0 && !h.K()) {
                h.H();
                int n23 = n21;
                if ((n2 & 0x10) != 0x0) {
                    n23 = (n21 & 0xFFFF1FFF);
                }
                n21 = n23;
                if ((n2 & 0x20) != 0x0) {
                    n21 = (n23 & 0xFFF8FFFF);
                }
                b3 = itb;
                ftb3 = ftb2;
            }
            else {
                if (n5 != 0) {
                    companion = (okh)okh.Companion;
                }
                ftb<? super x66, ? super Integer, fzv> ftb4;
                if (n9 != 0) {
                    ftb4 = null;
                }
                else {
                    ftb4 = ftb2;
                }
                if (n13 != 0) {
                    final z26 a = z26.a;
                    b3 = z26.b;
                }
                else {
                    b3 = itb;
                }
                if ((n2 & 0x10) != 0x0) {
                    final n96$b a2 = n96.a;
                    c = jr4.c((ir4)h.m((wd6)jr4.a));
                    n21 &= 0xFFFF1FFF;
                }
                if ((n2 & 0x20) != 0x0) {
                    b = jr4.b(c, h);
                    n21 &= 0xFFF8FFFF;
                }
                if (n20 != 0) {
                    final gj0 a3 = gj0.a;
                    b2 = gj0.b;
                }
                ftb3 = ftb4;
            }
            h.s();
            final n96$b a4 = n96.a;
            final gj0 a5 = gj0.a;
            final asj c2 = gj0.c;
            final k6m$a a6 = k6m.a;
            final s26 g = io7.g(h, -1484077694, (Object)new ij0$c((ftb)ftb3, n21, (ftb)ftb, (itb)b3));
            final int n24 = n21 >> 12;
            a(c, b, b2, (zrj)c2, (frp)a6, companion, (itb<? super wlo, ? super x66, ? super Integer, fzv>)g, h, 0x186C00 | (n24 & 0xE) | (n24 & 0x70) | (n24 & 0x380) | (n21 << 12 & 0x70000), 0);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ij0$d((ftb)ftb, companion, (ftb)ftb3, (itb)b3, c, b, b2, n, n2));
        }
    }
}
