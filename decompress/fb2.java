import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fb2
{
    public static final void a(okh companion, ex b, boolean b2, final itb<? super gb2, ? super x66, ? super Integer, fzv> itb, final x66 x66, final int n, final int n2) {
        czd.f((Object)itb, "content");
        final x66 h = x66.h(1781813501);
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
        final int n6 = n2 & 0x2;
        int n9 = 0;
        Label_0149: {
            int n7;
            if (n6 != 0) {
                n7 = (n4 | 0x30);
            }
            else {
                n7 = n4;
                if ((n & 0x70) == 0x0) {
                    int n8;
                    if (h.P((Object)b)) {
                        n8 = 32;
                    }
                    else {
                        n8 = 16;
                    }
                    n9 = (n4 | n8);
                    break Label_0149;
                }
            }
            n9 = n7;
        }
        final int n10 = n2 & 0x4;
        int n13 = 0;
        Label_0222: {
            int n11;
            if (n10 != 0) {
                n11 = (n9 | 0x180);
            }
            else {
                n11 = n9;
                if ((n & 0x380) == 0x0) {
                    int n12;
                    if (h.a(b2)) {
                        n12 = 256;
                    }
                    else {
                        n12 = 128;
                    }
                    n13 = (n9 | n12);
                    break Label_0222;
                }
            }
            n13 = n11;
        }
        int n14;
        if ((n2 & 0x8) != 0x0) {
            n14 = (n13 | 0xC00);
        }
        else {
            n14 = n13;
            if ((n & 0x1C00) == 0x0) {
                int n15;
                if (h.P((Object)itb)) {
                    n15 = 2048;
                }
                else {
                    n15 = 1024;
                }
                n14 = (n13 | n15);
            }
        }
        if ((n14 & 0x16DB) == 0x492 && h.i()) {
            h.H();
        }
        else {
            if (n3 != 0) {
                companion = (okh)okh.Companion;
            }
            if (n6 != 0) {
                Objects.requireNonNull(ex.Companion);
                b = ex.a.b;
            }
            if (n10 != 0) {
                b2 = false;
            }
            final n96$b a = n96.a;
            final fqg d = bb2.d(b, b2, h);
            h.x(511388516);
            final boolean p7 = h.P((Object)itb);
            final boolean p8 = h.P((Object)d);
            final Object y = h.y();
            Object o = null;
            Label_0461: {
                if (!(p7 | p8)) {
                    Objects.requireNonNull(x66.Companion);
                    if ((o = y) != x66$a.b) {
                        break Label_0461;
                    }
                }
                o = new fb2$a(d, (itb)itb, n14);
                h.p(o);
            }
            h.O();
            vlr.a(companion, (ftb)o, h, n14 & 0xE, 0);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new fb2$b(companion, b, b2, (itb)itb, n, n2));
        }
    }
}
