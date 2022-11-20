import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y40
{
    public static final void a(final boolean b, final nsb<fzv> nsb, okh companion, long e, urk urk, final itb<? super pr4, ? super x66, ? super Integer, fzv> itb, final x66 x66, final int n, final int n2) {
        czd.f((Object)nsb, "onDismissRequest");
        czd.f((Object)itb, "content");
        final x66 h = x66.h(-840283139);
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
        Label_0214: {
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
                    break Label_0214;
                }
            }
            n10 = n8;
        }
        final int n11 = n2 & 0x8;
        int n12;
        if (n11 != 0) {
            n12 = (n10 | 0xC00);
        }
        else {
            n12 = n10;
            if ((n & 0x1C00) == 0x0) {
                int n13;
                if (h.e(e)) {
                    n13 = 2048;
                }
                else {
                    n13 = 1024;
                }
                n12 = (n10 | n13);
            }
        }
        if ((0xE000 & n) == 0x0) {
            int n14;
            if ((n2 & 0x10) == 0x0 && h.P((Object)urk)) {
                n14 = 16384;
            }
            else {
                n14 = 8192;
            }
            n12 |= n14;
        }
        int n16 = 0;
        Label_0392: {
            int n15;
            if ((n2 & 0x20) != 0x0) {
                n15 = 196608;
            }
            else {
                n16 = n12;
                if ((0x70000 & n) != 0x0) {
                    break Label_0392;
                }
                if (h.P((Object)itb)) {
                    n15 = 131072;
                }
                else {
                    n15 = 65536;
                }
            }
            n16 = (n12 | n15);
        }
        if ((0x5B6DB & n16) == 0x12492 && h.i()) {
            h.H();
        }
        else {
            h.C();
            if ((n & 0x1) != 0x0 && !h.K()) {
                h.H();
                int n17 = n16;
                if ((n2 & 0x10) != 0x0) {
                    n17 = (n16 & 0xFFFF1FFF);
                }
                n16 = n17;
            }
            else {
                if (n7 != 0) {
                    companion = (okh)okh.Companion;
                }
                if (n11 != 0) {
                    final float n18 = 0;
                    e = lp.e(n18, n18);
                }
                if ((n2 & 0x10) != 0x0) {
                    urk = new urk(true, false, 62);
                    n16 &= 0xFFFF1FFF;
                }
            }
            h.s();
            final n96$b a = n96.a;
            h.x(-492369756);
            final Object y = h.y();
            Objects.requireNonNull(x66.Companion);
            final x66$a$a b2 = x66$a.b;
            Object o = y;
            if (y == b2) {
                o = new ruh((Object)Boolean.FALSE);
                h.p(o);
            }
            h.O();
            final ruh ruh = (ruh)o;
            ruh.b.setValue((Object)b);
            if ((boolean)ruh.a.getValue() || (boolean)ruh.b.getValue()) {
                h.x(-492369756);
                Object o2;
                if ((o2 = h.y()) == b2) {
                    Objects.requireNonNull(vyt.Companion);
                    o2 = blz.Q(new vyt(vyt.b));
                    h.p(o2);
                }
                h.O();
                final puh puh = (puh)o2;
                final lo8 lo8 = (lo8)h.m((wd6)yd6.e);
                h.x(1157296644);
                final boolean p9 = h.P((Object)puh);
                final Object y2 = h.y();
                Object o3;
                if (p9 || (o3 = y2) == b2) {
                    o3 = new y40$c(puh);
                    h.p(o3);
                }
                h.O();
                n50.a((trk)new dj9(e, lo8, (ftb)o3, (rf8)null), (nsb)nsb, urk, (ftb)io7.g(h, 79632374, (Object)new y40$a(ruh, puh, companion, (itb)itb, n16)), h, (n16 & 0x70) | 0xC00 | (n16 >> 6 & 0x380), 0);
            }
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new y40$b(b, (nsb)nsb, companion, e, urk, (itb)itb, n, n2));
        }
    }
    
    public static final void b(final nsb<fzv> nsb, okh companion, boolean b, zrj b2, sth sth, final itb<? super wlo, ? super x66, ? super Integer, fzv> itb, final x66 x66, final int n, final int n2) {
        czd.f((Object)nsb, "onClick");
        czd.f((Object)itb, "content");
        final x66 h = x66.h(-1988562892);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)nsb)) {
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
        final int n9 = n2 & 0x4;
        int n12 = 0;
        Label_0225: {
            int n10;
            if (n9 != 0) {
                n10 = (n8 | 0x180);
            }
            else {
                n10 = n8;
                if ((n & 0x380) == 0x0) {
                    int n11;
                    if (h.a(b)) {
                        n11 = 256;
                    }
                    else {
                        n11 = 128;
                    }
                    n12 = (n8 | n11);
                    break Label_0225;
                }
            }
            n12 = n10;
        }
        final int n13 = n2 & 0x8;
        int n16 = 0;
        Label_0299: {
            int n14;
            if (n13 != 0) {
                n14 = (n12 | 0xC00);
            }
            else {
                n14 = n12;
                if ((n & 0x1C00) == 0x0) {
                    int n15;
                    if (h.P((Object)b2)) {
                        n15 = 2048;
                    }
                    else {
                        n15 = 1024;
                    }
                    n16 = (n12 | n15);
                    break Label_0299;
                }
            }
            n16 = n14;
        }
        final int n17 = n2 & 0x10;
        int n20 = 0;
        Label_0373: {
            int n18;
            if (n17 != 0) {
                n18 = (n16 | 0x6000);
            }
            else {
                n18 = n16;
                if ((n & 0xE000) == 0x0) {
                    int n19;
                    if (h.P((Object)sth)) {
                        n19 = 16384;
                    }
                    else {
                        n19 = 8192;
                    }
                    n20 = (n16 | n19);
                    break Label_0373;
                }
            }
            n20 = n18;
        }
        int n22 = 0;
        Label_0430: {
            int n21;
            if ((n2 & 0x20) != 0x0) {
                n21 = 196608;
            }
            else {
                n22 = n20;
                if ((n & 0x70000) != 0x0) {
                    break Label_0430;
                }
                if (h.P((Object)itb)) {
                    n21 = 131072;
                }
                else {
                    n21 = 65536;
                }
            }
            n22 = (n20 | n21);
        }
        zrj zrj;
        okh okh;
        sth sth2;
        if ((0x5B6DB & n22) == 0x12492 && h.i()) {
            h.H();
            zrj = b2;
            okh = companion;
            sth2 = sth;
        }
        else {
            if (n5 != 0) {
                companion = (okh)okh.Companion;
            }
            if (n9 != 0) {
                b = true;
            }
            if (n13 != 0) {
                final l4h a = l4h.a;
                b2 = (zrj)l4h.b;
            }
            if (n17 != 0) {
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
            final n96$b a2 = n96.a;
            c5h.b(nsb, companion, b, b2, sth, itb, h, (n22 & 0xE) | (n22 & 0x70) | (n22 & 0x380) | (n22 & 0x1C00) | (n22 & 0xE000) | (n22 & 0x70000), 0);
            final sth sth3 = sth;
            final okh okh2 = companion;
            sth2 = sth3;
            zrj = b2;
            okh = okh2;
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new y40$d((nsb)nsb, okh, b, zrj, sth2, (itb)itb, n, n2));
        }
    }
}
