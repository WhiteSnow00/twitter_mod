import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qep
{
    public static final void a(okh companion, final ftb<? super x66, ? super Integer, fzv> ftb, final x66 x66, final int n, final int n2) {
        czd.f((Object)ftb, "content");
        final x66 h = x66.h(-1075498320);
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
        int n6;
        if ((n2 & 0x2) != 0x0) {
            n6 = (n4 | 0x30);
        }
        else {
            n6 = n4;
            if ((n & 0x70) == 0x0) {
                int n7;
                if (h.P((Object)ftb)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        if ((n6 & 0x5B) == 0x12 && h.i()) {
            h.H();
        }
        else {
            if (n3 != 0) {
                companion = (okh)okh.Companion;
            }
            final n96$b a = n96.a;
            h.x(-492369756);
            final Object y = h.y();
            Objects.requireNonNull(x66.Companion);
            final x66$a$a b = x66$a.b;
            puh q;
            if ((q = (puh)y) == b) {
                q = blz.Q(null);
                h.p((Object)q);
            }
            h.O();
            final puh puh = q;
            final kep kep = (kep)((m8r)puh).getValue();
            h.x(1157296644);
            final boolean p5 = h.P((Object)puh);
            final Object y2 = h.y();
            Object o;
            if (p5 || (o = y2) == b) {
                o = new qep$a(puh);
                h.p(o);
            }
            h.O();
            b(companion, kep, (qsb<? super kep, fzv>)o, ftb, h, (n6 & 0xE) | (n6 << 6 & 0x1C00), 0);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new qep$b(companion, (ftb)ftb, n, n2));
        }
    }
    
    public static final void b(okh companion, final kep value, final qsb<? super kep, fzv> c, final ftb<? super x66, ? super Integer, fzv> ftb, final x66 x66, final int n, final int n2) {
        czd.f((Object)c, "onSelectionChange");
        czd.f((Object)ftb, "children");
        final x66 h = x66.h(2078139907);
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
        int n6;
        if ((n2 & 0x2) != 0x0) {
            n6 = (n4 | 0x30);
        }
        else {
            n6 = n4;
            if ((n & 0x70) == 0x0) {
                int n7;
                if (h.P((Object)value)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        int n8;
        if ((n2 & 0x4) != 0x0) {
            n8 = (n6 | 0x180);
        }
        else {
            n8 = n6;
            if ((n & 0x380) == 0x0) {
                int n9;
                if (h.P((Object)c)) {
                    n9 = 256;
                }
                else {
                    n9 = 128;
                }
                n8 = (n6 | n9);
            }
        }
        int n10;
        if ((n2 & 0x8) != 0x0) {
            n10 = (n8 | 0xC00);
        }
        else {
            n10 = n8;
            if ((n & 0x1C00) == 0x0) {
                int n11;
                if (h.P((Object)ftb)) {
                    n11 = 2048;
                }
                else {
                    n11 = 1024;
                }
                n10 = (n8 | n11);
            }
        }
        if ((n10 & 0x16DB) == 0x492 && h.i()) {
            h.H();
        }
        else {
            if (n3 != 0) {
                companion = (okh)okh.Companion;
            }
            final n96$b a = n96.a;
            h.x(-492369756);
            final Object y = h.y();
            Objects.requireNonNull(x66.Companion);
            final x66$a$a b = x66$a.b;
            tfp tfp;
            if ((tfp = (tfp)y) == b) {
                tfp = new tfp();
                h.p((Object)tfp);
            }
            h.O();
            final tfp tfp2 = tfp;
            h.x(-492369756);
            Object y2;
            if ((y2 = h.y()) == b) {
                y2 = new cfp(tfp2);
                h.p(y2);
            }
            h.O();
            final cfp cfp = (cfp)y2;
            cfp.d = (sbc)h.m((wd6)yd6.i);
            cfp.e = (jh4)h.m((wd6)yd6.d);
            cfp.f = (vjs)h.m((wd6)yd6.m);
            cfp.c = c;
            cfp.b.setValue((Object)value);
            if (value != null) {
                cfp.o();
            }
            qn6.a(cfp, (ftb)io7.g(h, -123806316, (Object)new qep$c(tfp2, companion, cfp, (ftb)ftb, n10)), h, 56);
            npe.c((Object)cfp, (qsb)new qep$d(cfp), h);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new qep$e(companion, value, (qsb)c, (ftb)ftb, n, n2));
        }
    }
}
