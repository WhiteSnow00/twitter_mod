import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r9s
{
    static {
        eg8.M0(250, 0, (nq9)pq9.a, 2);
    }
    
    public static final void a(final int n, dlh companion, long c, long b, kub<? super List<m9s>, ? super d86, ? super Integer, vzv> i, hub<? super d86, ? super Integer, vzv> b2, final hub<? super d86, ? super Integer, vzv> hub, final d86 d86, final int n2, final int n3) {
        e0e.f((Object)hub, "tabs");
        final d86 h = d86.h(-249175289);
        int n4;
        if ((n3 & 0x1) != 0x0) {
            n4 = (n2 | 0x6);
        }
        else if ((n2 & 0xE) == 0x0) {
            int n5;
            if (h.d(n)) {
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
        Label_0146: {
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
                    break Label_0146;
                }
            }
            n9 = n7;
        }
        if ((n2 & 0x380) == 0x0) {
            int n10;
            if ((n3 & 0x4) == 0x0 && h.e(c)) {
                n10 = 256;
            }
            else {
                n10 = 128;
            }
            n9 |= n10;
        }
        if ((n2 & 0x1C00) == 0x0) {
            int n11;
            if ((n3 & 0x8) == 0x0 && h.e(b)) {
                n11 = 2048;
            }
            else {
                n11 = 1024;
            }
            n9 |= n11;
        }
        final int n12 = n3 & 0x10;
        int n15 = 0;
        Label_0322: {
            int n13;
            if (n12 != 0) {
                n13 = (n9 | 0x6000);
            }
            else {
                n13 = n9;
                if ((0xE000 & n2) == 0x0) {
                    int n14;
                    if (h.P(i)) {
                        n14 = 16384;
                    }
                    else {
                        n14 = 8192;
                    }
                    n15 = (n9 | n14);
                    break Label_0322;
                }
            }
            n15 = n13;
        }
        final int n16 = n3 & 0x20;
        int n17;
        if (n16 != 0) {
            n17 = (n15 | 0x30000);
        }
        else {
            n17 = n15;
            if ((0x70000 & n2) == 0x0) {
                int n18;
                if (h.P((Object)b2)) {
                    n18 = 131072;
                }
                else {
                    n18 = 65536;
                }
                n17 = (n15 | n18);
            }
        }
        int n19;
        if ((n3 & 0x40) != 0x0) {
            n19 = (n17 | 0x180000);
        }
        else {
            n19 = n17;
            if ((0x380000 & n2) == 0x0) {
                int n20;
                if (h.P((Object)hub)) {
                    n20 = 1048576;
                }
                else {
                    n20 = 524288;
                }
                n19 = (n17 | n20);
            }
        }
        Object o;
        dlh dlh2;
        z36 z36;
        if ((0x2DB6DB & n19) == 0x92492 && h.i()) {
            h.H();
            final dlh dlh = companion;
            o = i;
            dlh2 = dlh;
            z36 = b2;
        }
        else {
            h.C();
            Label_0748: {
                int n23;
                dlh dlh3;
                long n24;
                long n25;
                Object o2;
                if ((n2 & 0x1) != 0x0 && !h.K()) {
                    h.H();
                    int n21 = n19;
                    if ((n3 & 0x4) != 0x0) {
                        n21 = (n19 & 0xFFFFFC7F);
                    }
                    int n22 = n21;
                    if ((n3 & 0x8) != 0x0) {
                        n22 = (n21 & 0xFFFFE3FF);
                    }
                    n23 = n22;
                    dlh3 = companion;
                    n24 = c;
                    n25 = b;
                    o2 = i;
                }
                else {
                    if (n6 != 0) {
                        companion = (dlh)dlh.Companion;
                    }
                    if ((n3 & 0x4) != 0x0) {
                        final sa6$b a = sa6.a;
                        c = ps4.c((os4)h.m((df6)ps4.a));
                        n19 &= 0xFFFFFC7F;
                    }
                    if ((n3 & 0x8) != 0x0) {
                        b = ps4.b(c, h);
                        n19 &= 0xFFFFE3FF;
                    }
                    if (n12 != 0) {
                        i = w9y.i(h, -553782708, new r9s$a(n));
                    }
                    n23 = n19;
                    dlh3 = companion;
                    n24 = c;
                    n25 = b;
                    o2 = i;
                    if (n16 != 0) {
                        final p66 a2 = p66.a;
                        b2 = p66.b;
                        break Label_0748;
                    }
                }
                n19 = n23;
                i = o2;
                b = n25;
                c = n24;
                companion = dlh3;
            }
            h.s();
            final sa6$b a3 = sa6.a;
            e0e.f((Object)companion, "<this>");
            y0s.a(jty.W(companion, false, (stb)yep.F0), (asp)null, c, b, (f82)null, 0.0f, (hub)w9y.i(h, -1961746365, new r9s$b((hub)hub, (hub)b2, (kub)i, n19)), h, (n19 & 0x380) | 0x180000 | (n19 & 0x1C00), 50);
            z36 = b2;
            final dlh dlh4 = companion;
            o = i;
            dlh2 = dlh4;
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new r9s$c(n, dlh2, c, b, (kub)o, (hub)z36, (hub)hub, n2, n3));
        }
    }
}
