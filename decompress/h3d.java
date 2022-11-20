import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h3d
{
    public static final float a;
    
    static {
        a = 24;
    }
    
    public static final void a(final nsb<fzv> nsb, okh companion, boolean b, sth sth, final ftb<? super x66, ? super Integer, fzv> ftb, final x66 x66, final int n, final int n2) {
        czd.f((Object)nsb, "onClick");
        czd.f((Object)ftb, "content");
        final x66 h = x66.h(-111063634);
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
                    if (h.P((Object)sth)) {
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
        int n17;
        if ((n2 & 0x10) != 0x0) {
            n17 = (n16 | 0x6000);
        }
        else {
            n17 = n16;
            if ((0xE000 & n) == 0x0) {
                int n18;
                if (h.P((Object)ftb)) {
                    n18 = 16384;
                }
                else {
                    n18 = 8192;
                }
                n17 = (n16 | n18);
            }
        }
        if ((0xB6DB & n17) == 0x2492 && h.i()) {
            h.H();
        }
        else {
            if (n5 != 0) {
                companion = (okh)okh.Companion;
            }
            if (n9 != 0) {
                b = true;
            }
            if (n13 != 0) {
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
            final n96$b a = n96.a;
            final okh a2 = lut.a(companion);
            Objects.requireNonNull(d0n.Companion);
            final okh c = ld4.c(a2, sth, yzm.a(false, h3d.a, 0L, h, 54, 4), b, (String)null, new d0n(0), (nsb)nsb, 8);
            Objects.requireNonNull(ex.Companion);
            final fqg g = w9.g(h, 733328855, ex.a.f, false, h, -1323940314);
            final lo8 lo8 = (lo8)h.m((wd6)yd6.e);
            final fve fve = (fve)h.m((wd6)yd6.k);
            final t6x t6x = (t6x)h.m((wd6)yd6.o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b2 = q66.a.b;
            final itb a3 = ove.a(c);
            if (!(h.j() instanceof qr0)) {
                wd.t();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((nsb)b2);
            }
            else {
                h.o();
            }
            h.F();
            mru.p(h, (Object)g, (ftb)q66.a.e);
            mru.p(h, (Object)lo8, (ftb)q66.a.d);
            mru.p(h, (Object)fve, (ftb)q66.a.f);
            ((t26)a3).h0((Object)g4k.C(h, t6x, q66.a.g, h), (Object)h, (Object)0);
            sk0.D(h, 2058660585, -2137368960, -2146259096);
            float n19;
            if (b) {
                h.x(753555775);
                n19 = ((Number)h.m((wd6)rk6.a)).floatValue();
            }
            else {
                h.x(753555801);
                n19 = rp9.U(h, 6);
            }
            h.O();
            xd6.a(new bml[] { rk6.a.b((Object)n19) }, (ftb)ftb, h, (n17 >> 9 & 0x70) | 0x8);
            h.O();
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new h3d$a((nsb)nsb, companion, b, sth, (ftb)ftb, n, n2));
        }
    }
    
    public static final void b(final boolean b, final qsb<? super Boolean, fzv> qsb, okh companion, boolean b2, sth sth, final ftb<? super x66, ? super Integer, fzv> ftb, final x66 x66, final int n, final int n2) {
        czd.f((Object)qsb, "onCheckedChange");
        czd.f((Object)ftb, "content");
        final x66 h = x66.h(-54657793);
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
                if (h.P((Object)qsb)) {
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
        Label_0216: {
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
                    break Label_0216;
                }
            }
            n10 = n8;
        }
        final int n11 = n2 & 0x8;
        int n14 = 0;
        Label_0290: {
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
                    break Label_0290;
                }
            }
            n14 = n12;
        }
        final int n15 = n2 & 0x10;
        int n18 = 0;
        Label_0364: {
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
                    break Label_0364;
                }
            }
            n18 = n16;
        }
        int n20 = 0;
        Label_0425: {
            int n19;
            if ((n2 & 0x20) != 0x0) {
                n19 = 196608;
            }
            else {
                n20 = n18;
                if ((0x70000 & n) != 0x0) {
                    break Label_0425;
                }
                if (h.P((Object)ftb)) {
                    n19 = 131072;
                }
                else {
                    n19 = 65536;
                }
            }
            n20 = (n18 | n19);
        }
        okh okh;
        sth sth3;
        if ((n20 & 0x5B6DB) == 0x12492 && h.i()) {
            h.H();
            final sth sth2 = sth;
            okh = companion;
            sth3 = sth2;
        }
        else {
            if (n7 != 0) {
                companion = (okh)okh.Companion;
            }
            if (n11 != 0) {
                b2 = true;
            }
            if (n15 != 0) {
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
            final n96$b a = n96.a;
            final okh a2 = lut.a(companion);
            Objects.requireNonNull(d0n.Companion);
            final okh a3 = fht.a(a2, b, sth, yzm.a(false, h3d.a, 0L, h, 54, 4), b2, new d0n(1), qsb);
            Objects.requireNonNull(ex.Companion);
            final fqg g = w9.g(h, 733328855, ex.a.f, false, h, -1323940314);
            final lo8 lo8 = (lo8)h.m((wd6)yd6.e);
            final fve fve = (fve)h.m((wd6)yd6.k);
            final t6x t6x = (t6x)h.m((wd6)yd6.o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b3 = q66.a.b;
            final itb a4 = ove.a(a3);
            if (!(h.j() instanceof qr0)) {
                wd.t();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((nsb)b3);
            }
            else {
                h.o();
            }
            h.F();
            mru.p(h, (Object)g, (ftb)q66.a.e);
            mru.p(h, (Object)lo8, (ftb)q66.a.d);
            mru.p(h, (Object)fve, (ftb)q66.a.f);
            ((t26)a4).h0((Object)g4k.C(h, t6x, q66.a.g, h), (Object)h, (Object)0);
            sk0.D(h, 2058660585, -2137368960, -430124743);
            float n21;
            if (b2) {
                h.x(-1866758102);
                n21 = ((Number)h.m((wd6)rk6.a)).floatValue();
            }
            else {
                h.x(-1866758076);
                n21 = rp9.U(h, 6);
            }
            h.O();
            xd6.a(new bml[] { rk6.a.b((Object)n21) }, (ftb)ftb, h, (n20 >> 12 & 0x70) | 0x8);
            h.O();
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
            final okh okh2 = companion;
            sth3 = sth;
            okh = okh2;
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new h3d$b(b, (qsb)qsb, okh, b2, sth3, (ftb)ftb, n, n2));
        }
    }
}
