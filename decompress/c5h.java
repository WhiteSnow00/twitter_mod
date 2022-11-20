import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c5h
{
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    
    static {
        final float d2 = a = 8;
        final float g2 = b = 48;
        c = 16;
        d = d2;
        e = 112;
        f = 280;
        g = g2;
    }
    
    public static final void a(final ruh<Boolean> ruh, final puh<vyt> puh, okh companion, final itb<? super pr4, ? super x66, ? super Integer, fzv> itb, final x66 x66, final int n, final int n2) {
        czd.f((Object)ruh, "expandedStates");
        czd.f((Object)puh, "transformOriginState");
        czd.f((Object)itb, "content");
        final x66 h = x66.h(1164283597);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)ruh)) {
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
                if (h.P((Object)puh)) {
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
        Label_0219: {
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
                    break Label_0219;
                }
            }
            n10 = n8;
        }
        int n11;
        if ((n2 & 0x8) != 0x0) {
            n11 = (n10 | 0xC00);
        }
        else {
            n11 = n10;
            if ((n & 0x1C00) == 0x0) {
                int n12;
                if (h.P((Object)itb)) {
                    n12 = 2048;
                }
                else {
                    n12 = 1024;
                }
                n11 = (n10 | n12);
            }
        }
        if ((n11 & 0x16DB) == 0x492 && h.i()) {
            h.H();
        }
        else {
            if (n7 != 0) {
                companion = (okh)okh.Companion;
            }
            final n96$b a = n96.a;
            h.x(882913843);
            h.x(1157296644);
            final boolean p7 = h.P((Object)ruh);
            final Object y = h.y();
            mzt mzt = null;
            Label_0416: {
                if (!p7) {
                    Objects.requireNonNull(x66.Companion);
                    if ((mzt = (mzt)y) != x66$a.b) {
                        break Label_0416;
                    }
                }
                mzt = new mzt((ruh)ruh, "DropDownMenu");
                h.p((Object)mzt);
            }
            h.O();
            final mzt mzt2 = mzt;
            mzt2.a(ruh.b.getValue(), h, 0);
            h.x(1157296644);
            final boolean p8 = h.P((Object)mzt2);
            final Object y2 = h.y();
            Object o = null;
            Label_0518: {
                if (!p8) {
                    Objects.requireNonNull(x66.Companion);
                    if ((o = y2) != x66$a.b) {
                        break Label_0518;
                    }
                }
                o = new g0u(mzt2);
                h.p(o);
            }
            h.O();
            npe.c((Object)mzt2, (qsb)o, h);
            h.O();
            final c5h$e d0 = c5h$e.D0;
            h.x(1399891485);
            final aiv a2 = npw.a;
            final aiv a3 = npw.a;
            h.x(1847725064);
            final boolean booleanValue = (boolean)mzt2.b();
            h.x(-1958825495);
            float n13 = 0.8f;
            final float n14 = 1.0f;
            float n15;
            if (booleanValue) {
                n15 = 1.0f;
            }
            else {
                n15 = 0.8f;
            }
            h.O();
            final boolean booleanValue2 = (boolean)mzt2.f();
            h.x(-1958825495);
            if (booleanValue2) {
                n13 = 1.0f;
            }
            h.O();
            final m8r b = e0u.b(mzt2, (Object)n15, (Object)n13, (uza)d0.h0((Object)mzt2.d(), (Object)h, (Object)0), (zhv)a3, "FloatAnimation", h);
            h.O();
            h.O();
            final c5h$d d2 = c5h$d.D0;
            h.x(1399891485);
            h.x(1847725064);
            final boolean booleanValue3 = (boolean)mzt2.b();
            h.x(-1541356035);
            float n16;
            if (booleanValue3) {
                n16 = 1.0f;
            }
            else {
                n16 = 0.0f;
            }
            h.O();
            final boolean booleanValue4 = (boolean)mzt2.f();
            h.x(-1541356035);
            float n17;
            if (booleanValue4) {
                n17 = n14;
            }
            else {
                n17 = 0.0f;
            }
            h.O();
            final m8r b2 = e0u.b(mzt2, (Object)n16, (Object)n17, (uza)d2.h0((Object)mzt2.d(), (Object)h, (Object)0), (zhv)a3, "FloatAnimation", h);
            h.O();
            h.O();
            final okh$a companion2 = okh.Companion;
            h.x(1618982084);
            final boolean p9 = h.P((Object)b);
            final boolean p10 = h.P((Object)b2);
            final boolean p11 = h.P((Object)puh);
            final Object y3 = h.y();
            Object o2 = null;
            Label_0995: {
                if (!(p9 | p10 | p11)) {
                    Objects.requireNonNull(x66.Companion);
                    if ((o2 = y3) != x66$a.b) {
                        break Label_0995;
                    }
                }
                o2 = new c5h$a((puh)puh, b, b2);
                h.p(o2);
            }
            h.O();
            c9y.b(wj1.n((okh)companion2, (qsb)o2), (frp)null, (t72)null, c5h.a, (ftb)io7.g(h, -242468534, (Object)new c5h$b(companion, (itb)itb, n11)), h, 1769472, 30);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new c5h$c((ruh)ruh, (puh)puh, companion, (itb)itb, n, n2));
        }
    }
    
    public static final void b(final nsb<fzv> nsb, okh companion, boolean b, zrj b2, sth sth, final itb<? super wlo, ? super x66, ? super Integer, fzv> itb, final x66 x66, final int n, final int n2) {
        czd.f((Object)nsb, "onClick");
        czd.f((Object)itb, "content");
        final x66 h = x66.h(87134531);
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
                if ((0xE000 & n) == 0x0) {
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
                if ((0x70000 & n) != 0x0) {
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
        if ((0x5B6DB & n22) == 0x12492 && h.i()) {
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
            final okh b3 = nza.B1(kdq.q(kdq.i(ld4.c(companion, sth, yzm.a(true, 0.0f, 0L, h, 6, 6), b, (String)null, (d0n)null, (nsb)nsb, 24)), c5h.e, c5h.g, c5h.f, 8), b2);
            Objects.requireNonNull(ex.Companion);
            final bw1.b l = ex.a.l;
            h.x(693286680);
            final ds0 a3 = ds0.a;
            final fqg a4 = ulo.a((ds0.d)ds0.b, l, h);
            h.x(-1323940314);
            final lo8 lo8 = (lo8)h.m((wd6)yd6.e);
            final fve fve = (fve)h.m((wd6)yd6.k);
            final t6x t6x = (t6x)h.m((wd6)yd6.o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b4 = q66.a.b;
            final itb a5 = ove.a(b3);
            if (!(h.j() instanceof qr0)) {
                wd.t();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((nsb)b4);
            }
            else {
                h.o();
            }
            h.F();
            mru.p(h, (Object)a4, (ftb)q66.a.e);
            mru.p(h, (Object)lo8, (ftb)q66.a.d);
            mru.p(h, (Object)fve, (ftb)q66.a.f);
            ((t26)a5).h0((Object)g4k.C(h, t6x, q66.a.g, h), (Object)h, (Object)0);
            sk0.D(h, 2058660585, -678309503, 1664959143);
            ris.a(((wnv)h.m((wd6)xnv.a)).g, (ftb<? super x66, ? super Integer, fzv>)io7.g(h, 1190489496, (Object)new c5h$f(b, (itb)itb, n22)), h, 48);
            h.O();
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new c5h$g((nsb)nsb, companion, b, b2, sth, (itb)itb, n, n2));
        }
    }
}
