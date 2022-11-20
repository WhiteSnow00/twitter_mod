import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nw
{
    public static final okh a;
    public static final okh b;
    public static final long c;
    public static final long d;
    public static final long e;
    
    static {
        final okh$a companion = okh.Companion;
        final float n = 24;
        a = nza.G1((okh)companion, n, 0.0f, n, 0.0f, 10);
        b = nza.G1((okh)companion, n, 0.0f, n, (float)28, 2);
        c = fli.b0(40);
        d = fli.b0(36);
        e = fli.b0(38);
    }
    
    public static final void a(final pr4 pr4, final ftb<? super x66, ? super Integer, fzv> ftb, final ftb<? super x66, ? super Integer, fzv> ftb2, x66 h, final int n) {
        czd.f((Object)pr4, "<this>");
        h = h.h(-555573207);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (h.P((Object)pr4)) {
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
            if (h.P((Object)ftb)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0x380) == 0x0) {
            int n7;
            if (h.P((Object)ftb2)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        if ((n6 & 0x2DB) == 0x92 && h.i()) {
            h.H();
        }
        else {
            final n96$b a = n96.a;
            final okh a2 = pr4.a((okh)okh.Companion, 1.0f, false);
            final nw$a a3 = nw$a.a;
            h.x(-1323940314);
            final iar e = yd6.e;
            final lo8 lo8 = (lo8)h.m((wd6)e);
            final iar k = yd6.k;
            final fve fve = (fve)h.m((wd6)k);
            final iar o = yd6.o;
            final t6x t6x = (t6x)h.m((wd6)o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b = q66.a.b;
            final itb a4 = ove.a(a2);
            if (!(h.j() instanceof qr0)) {
                wd.t();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((nsb)b);
            }
            else {
                h.o();
            }
            h.F();
            final q66$a$c e2 = q66.a.e;
            mru.p(h, (Object)a3, (ftb)e2);
            final q66$a$a d = q66.a.d;
            mru.p(h, (Object)lo8, (ftb)d);
            final q66$a$b f = q66.a.f;
            mru.p(h, (Object)fve, (ftb)f);
            final q66$a$e g = q66.a.g;
            ((t26)a4).h0((Object)g4k.C(h, t6x, g, h), (Object)h, (Object)0);
            sk0.D(h, 2058660585, 1454034642, -1160646206);
            if (ftb != null) {
                final okh u = g63.U(nw.a, (Object)"title");
                Objects.requireNonNull(ex.Companion);
                final okh b2 = pr4.b(u, (ex.b)ex.a.n);
                h.x(733328855);
                final fqg d2 = bb2.d((ex)ex.a.b, false, h);
                h.x(-1323940314);
                final lo8 lo9 = (lo8)h.m((wd6)e);
                final fve fve2 = (fve)h.m((wd6)k);
                final t6x t6x2 = (t6x)h.m((wd6)o);
                final itb a5 = ove.a(b2);
                if (!(h.j() instanceof qr0)) {
                    wd.t();
                    throw null;
                }
                h.E();
                if (h.f()) {
                    h.A((nsb)b);
                }
                else {
                    h.o();
                }
                ((t26)a5).h0((Object)mw.x(h, h, d2, e2, h, lo9, d, h, fve2, f, h, t6x2, g, h), (Object)h, (Object)0);
                h.x(2058660585);
                h.x(-2137368960);
                h.x(472489145);
                ftb.invoke((Object)h, (Object)0);
                h.O();
                h.O();
                h.O();
                h.r();
                h.O();
                h.O();
            }
            h.O();
            if (ftb2 != null) {
                final okh u2 = g63.U(nw.b, (Object)"text");
                Objects.requireNonNull(ex.Companion);
                final okh b3 = pr4.b(u2, (ex.b)ex.a.n);
                h.x(733328855);
                final fqg d3 = bb2.d((ex)ex.a.b, false, h);
                h.x(-1323940314);
                final lo8 lo10 = (lo8)h.m((wd6)e);
                final fve fve3 = (fve)h.m((wd6)k);
                final t6x t6x3 = (t6x)h.m((wd6)o);
                final itb a6 = ove.a(b3);
                if (!(h.j() instanceof qr0)) {
                    wd.t();
                    throw null;
                }
                h.E();
                if (h.f()) {
                    h.A((nsb)b);
                }
                else {
                    h.o();
                }
                ((t26)a6).h0((Object)mw.x(h, h, d3, e2, h, lo10, d, h, fve3, f, h, t6x3, g, h), (Object)h, (Object)0);
                h.x(2058660585);
                h.x(-2137368960);
                h.x(-272722206);
                ftb2.invoke((Object)h, (Object)0);
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
        final lxo i = h.k();
        if (i != null) {
            i.a((ftb)new nw$b(pr4, (ftb)ftb, (ftb)ftb2, n));
        }
    }
    
    public static final void b(final ftb<? super x66, ? super Integer, fzv> ftb, okh okh, ftb<? super x66, ? super Integer, fzv> ftb2, ftb<? super x66, ? super Integer, fzv> ftb3, frp b, long l, long b2, final x66 x66, final int n, final int n2) {
        czd.f((Object)ftb, "buttons");
        final x66 h = x66.h(-453679601);
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
        Label_0147: {
            int n6;
            if (n5 != 0) {
                n6 = (n3 | 0x30);
            }
            else {
                n6 = n3;
                if ((n & 0x70) == 0x0) {
                    int n7;
                    if (h.P((Object)okh)) {
                        n7 = 32;
                    }
                    else {
                        n7 = 16;
                    }
                    n8 = (n3 | n7);
                    break Label_0147;
                }
            }
            n8 = n6;
        }
        final int n9 = n2 & 0x4;
        int n12 = 0;
        Label_0220: {
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
                    break Label_0220;
                }
            }
            n12 = n10;
        }
        ftb<? super x66, ? super Integer, fzv> ftb4 = ftb2;
        final int n13 = n2 & 0x8;
        int n16 = 0;
        Label_0297: {
            int n14;
            if (n13 != 0) {
                n14 = (n12 | 0xC00);
            }
            else {
                n14 = n12;
                if ((n & 0x1C00) == 0x0) {
                    int n15;
                    if (h.P((Object)ftb3)) {
                        n15 = 2048;
                    }
                    else {
                        n15 = 1024;
                    }
                    n16 = (n12 | n15);
                    break Label_0297;
                }
            }
            n16 = n14;
        }
        if ((0xE000 & n) == 0x0) {
            int n17;
            if ((n2 & 0x10) == 0x0 && h.P((Object)b)) {
                n17 = 16384;
            }
            else {
                n17 = 8192;
            }
            n16 |= n17;
        }
        if ((0x70000 & n) == 0x0) {
            int n18;
            if ((n2 & 0x20) == 0x0 && h.e(l)) {
                n18 = 131072;
            }
            else {
                n18 = 65536;
            }
            n16 |= n18;
        }
        if ((0x380000 & n) == 0x0) {
            int n19;
            if ((n2 & 0x40) == 0x0 && h.e(b2)) {
                n19 = 1048576;
            }
            else {
                n19 = 524288;
            }
            n16 |= n19;
        }
        frp frp;
        ftb<? super x66, ? super Integer, fzv> ftb6;
        long n20 = 0L;
        if ((0x2DB6DB & n16) == 0x92492 && h.i()) {
            h.H();
            ftb2 = ftb4;
            final ftb<? super x66, ? super Integer, fzv> ftb5 = ftb3;
            frp = b;
            ftb3 = ftb2;
            ftb6 = ftb5;
            n20 = l;
        }
        else {
            h.C();
            int n24 = 0;
            Object companion = null;
            ftb<? super x66, ? super Integer, fzv> ftb9 = null;
            Label_0823: {
                Object o;
                ftb<? super x66, ? super Integer, fzv> ftb7;
                frp frp2;
                if ((n & 0x1) != 0x0 && !h.K()) {
                    h.H();
                    int n21 = n16;
                    if ((n2 & 0x10) != 0x0) {
                        n21 = (n16 & 0xFFFF1FFF);
                    }
                    int n22 = n21;
                    if ((n2 & 0x20) != 0x0) {
                        n22 = (n21 & 0xFFF8FFFF);
                    }
                    int n23 = n22;
                    if ((n2 & 0x40) != 0x0) {
                        n23 = (n22 & 0xFFC7FFFF);
                    }
                    n24 = n23;
                    o = okh;
                    ftb7 = ftb3;
                    frp2 = b;
                    n20 = l;
                }
                else {
                    if (n5 != 0) {
                        companion = okh.Companion;
                    }
                    else {
                        companion = okh;
                    }
                    final ftb<? super x66, ? super Integer, fzv> ftb8 = null;
                    ftb9 = ftb4;
                    if (n9 != 0) {
                        ftb9 = null;
                    }
                    if (n13 != 0) {
                        ftb3 = ftb8;
                    }
                    if ((n2 & 0x10) != 0x0) {
                        final n96$b a = n96.a;
                        b = (frp)((bsp)h.m((wd6)csp.a)).b;
                        n16 &= 0xFFFF1FFF;
                    }
                    int n25;
                    if ((n2 & 0x20) != 0x0) {
                        final n96$b a2 = n96.a;
                        l = ((ir4)h.m((wd6)jr4.a)).l();
                        n25 = (n16 & 0xFFF8FFFF);
                    }
                    else {
                        n25 = n16;
                    }
                    n24 = n25;
                    o = companion;
                    ftb7 = ftb3;
                    frp2 = b;
                    ftb4 = ftb9;
                    n20 = l;
                    if ((n2 & 0x40) != 0x0) {
                        b2 = jr4.b(l, h);
                        n24 = (n25 & 0xFFC7FFFF);
                        n20 = l;
                        l = b2;
                        break Label_0823;
                    }
                }
                l = b2;
                ftb9 = ftb4;
                b = frp2;
                ftb3 = ftb7;
                companion = o;
            }
            h.s();
            final n96$b a3 = n96.a;
            final s26 g = io7.g(h, 629950291, (Object)new nw$c((ftb)ftb9, (ftb)ftb3, (ftb)ftb, n24));
            final int n26 = n24 >> 9;
            c0s.a((okh)companion, b, n20, l, (t72)null, 0.0f, (ftb)g, h, 0x180000 | (n24 >> 3 & 0xE) | (n26 & 0x70) | (n26 & 0x380) | (n26 & 0x1C00), 48);
            b2 = l;
            frp = b;
            ftb6 = ftb3;
            ftb3 = ftb9;
            okh = (okh)companion;
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new nw$d((ftb)ftb, okh, (ftb)ftb3, (ftb)ftb6, frp, n20, b2, n, n2));
        }
    }
    
    public static final void c(final float n, final float n2, final ftb<? super x66, ? super Integer, fzv> ftb, x66 h, final int n3) {
        czd.f((Object)ftb, "content");
        h = h.h(73434452);
        int n5;
        if ((n3 & 0xE) == 0x0) {
            int n4;
            if (h.b(n)) {
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
            if (h.b(n2)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n5 | n7);
        }
        int n8 = n6;
        if ((n3 & 0x380) == 0x0) {
            int n9;
            if (h.P((Object)ftb)) {
                n9 = 256;
            }
            else {
                n9 = 128;
            }
            n8 = (n6 | n9);
        }
        if ((n8 & 0x2DB) == 0x92 && h.i()) {
            h.H();
        }
        else {
            final n96$b a = n96.a;
            final nw$e nw$e = new nw$e(n, n2);
            h.x(-1323940314);
            final okh$a companion = okh.Companion;
            final lo8 lo8 = (lo8)h.m((wd6)yd6.e);
            final fve fve = (fve)h.m((wd6)yd6.k);
            final t6x t6x = (t6x)h.m((wd6)yd6.o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b = q66.a.b;
            final itb a2 = ove.a((okh)companion);
            final int n10 = ((n8 >> 6 & 0xE) << 9 & 0x1C00) | 0x6;
            if (!(h.j() instanceof qr0)) {
                wd.t();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((nsb)b);
            }
            else {
                h.o();
            }
            h.F();
            mru.p(h, (Object)nw$e, (ftb)q66.a.e);
            mru.p(h, (Object)lo8, (ftb)q66.a.d);
            mru.p(h, (Object)fve, (ftb)q66.a.f);
            ((t26)a2).h0((Object)g4k.C(h, t6x, q66.a.g, h), (Object)h, (Object)(n10 >> 3 & 0x70));
            h.x(2058660585);
            ftb.invoke((Object)h, (Object)(n10 >> 9 & 0xE));
            h.O();
            h.r();
            h.O();
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new nw$f(n, n2, (ftb)ftb, n3));
        }
    }
}
