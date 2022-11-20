import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o8s
{
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final long f;
    
    static {
        a = 48;
        b = 72;
        c = 16;
        d = 14;
        e = 6;
        f = fli.b0(20);
    }
    
    public static final void a(final boolean b, final nsb<fzv> nsb, okh companion, boolean b2, ftb<? super x66, ? super Integer, fzv> ftb, ftb<? super x66, ? super Integer, fzv> ftb2, sth sth, long a, long b3, final x66 x66, final int n, final int n2) {
        czd.f((Object)nsb, "onClick");
        final x66 h = x66.h(-1486097588);
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
        Label_0207: {
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
                    break Label_0207;
                }
            }
            n10 = n8;
        }
        final int n11 = n2 & 0x8;
        int n14 = 0;
        Label_0281: {
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
                    break Label_0281;
                }
            }
            n14 = n12;
        }
        final int n15 = n2 & 0x10;
        int n18 = 0;
        Label_0355: {
            int n16;
            if (n15 != 0) {
                n16 = (n14 | 0x6000);
            }
            else {
                n16 = n14;
                if ((0xE000 & n) == 0x0) {
                    int n17;
                    if (h.P((Object)ftb)) {
                        n17 = 16384;
                    }
                    else {
                        n17 = 8192;
                    }
                    n18 = (n14 | n17);
                    break Label_0355;
                }
            }
            n18 = n16;
        }
        final int n19 = n2 & 0x20;
        int n22 = 0;
        Label_0426: {
            int n20;
            if (n19 != 0) {
                n20 = (n18 | 0x30000);
            }
            else {
                n20 = n18;
                if ((0x70000 & n) == 0x0) {
                    int n21;
                    if (h.P((Object)ftb2)) {
                        n21 = 131072;
                    }
                    else {
                        n21 = 65536;
                    }
                    n22 = (n18 | n21);
                    break Label_0426;
                }
            }
            n22 = n20;
        }
        final int n23 = n2 & 0x40;
        int n26 = 0;
        Label_0497: {
            int n24;
            if (n23 != 0) {
                n24 = (n22 | 0x180000);
            }
            else {
                n24 = n22;
                if ((0x380000 & n) == 0x0) {
                    int n25;
                    if (h.P((Object)sth)) {
                        n25 = 1048576;
                    }
                    else {
                        n25 = 524288;
                    }
                    n26 = (n22 | n25);
                    break Label_0497;
                }
            }
            n26 = n24;
        }
        if ((n & 0x1C00000) == 0x0) {
            int n27;
            if ((n2 & 0x80) == 0x0 && h.e(a)) {
                n27 = 8388608;
            }
            else {
                n27 = 4194304;
            }
            n26 |= n27;
        }
        if ((0xE000000 & n) == 0x0) {
            int n28;
            if ((n2 & 0x100) == 0x0 && h.e(b3)) {
                n28 = 67108864;
            }
            else {
                n28 = 33554432;
            }
            n26 |= n28;
        }
        okh okh;
        ftb<? super x66, ? super Integer, fzv> ftb5;
        sth sth2;
        long n29;
        if ((0xB6DB6DB & n26) == 0x2492492 && h.i()) {
            h.H();
            final ftb<? super x66, ? super Integer, fzv> ftb3 = ftb;
            final ftb<? super x66, ? super Integer, fzv> ftb4 = ftb2;
            okh = companion;
            ftb2 = ftb3;
            ftb5 = ftb4;
            sth2 = sth;
            n29 = b3;
        }
        else {
            h.C();
            final ftb<? super x66, ? super Integer, fzv> ftb6 = null;
            sth sth3;
            okh okh3;
            if ((n & 0x1) != 0x0 && !h.K()) {
                h.H();
                int n30 = n26;
                if ((n2 & 0x80) != 0x0) {
                    n30 = (n26 & 0xFE3FFFFF);
                }
                n26 = n30;
                if ((n2 & 0x100) != 0x0) {
                    n26 = (n30 & 0xF1FFFFFF);
                }
                final okh okh2 = companion;
                sth3 = sth;
                final long n31 = a;
                a = b3;
                b3 = n31;
                okh3 = okh2;
            }
            else {
                if (n7 != 0) {
                    companion = (okh)okh.Companion;
                }
                if (n11 != 0) {
                    b2 = true;
                }
                if (n15 != 0) {
                    ftb = null;
                }
                if (n19 != 0) {
                    ftb2 = null;
                }
                if (n23 != 0) {
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
                if ((n2 & 0x80) != 0x0) {
                    a = ((nq4)h.m((wd6)sk6.a)).a;
                    n26 &= 0xFE3FFFFF;
                }
                if ((n2 & 0x100) != 0x0) {
                    b3 = nq4.b(a, rp9.a0(h));
                    n26 &= 0xF1FFFFFF;
                }
                final long n32 = a;
                final sth sth4 = sth;
                a = b3;
                okh3 = companion;
                sth3 = sth4;
                b3 = n32;
            }
            h.s();
            final n96$b a2 = n96.a;
            Object g = ftb6;
            if (ftb != null) {
                g = io7.g(h, -1729014781, (Object)new ftb<x66, Integer, fzv>(ftb, n26) {
                    public final ftb<x66, Integer, fzv> D0;
                    public final int E0;
                    
                    public final Object invoke(final Object o, final Object o2) {
                        final x66 x66 = (x66)o;
                        if ((((Number)o2).intValue() & 0xB) == 0x2 && x66.i()) {
                            x66.H();
                        }
                        else {
                            final n96$b a = n96.a;
                            final sjs k = ((wnv)x66.m((wd6)xnv.a)).k;
                            Objects.requireNonNull(mes.Companion);
                            ris.a(sjs.a(k, 0L, 0L, (pkb)null, (pjb)null, (ffs)null, new mes(3), (jfs)null, 0L, 245759), this.D0, x66, this.E0 >> 9 & 0x70);
                        }
                        return fzv.a;
                    }
                });
            }
            final s26 g2 = io7.g(h, -178151495, (Object)new itb<pr4, x66, Integer, fzv>(g, ftb2, n26) {
                public final ftb<x66, Integer, fzv> D0;
                public final ftb<x66, Integer, fzv> E0;
                public final int F0;
                
                public final Object h0(final Object o, final Object o2, final Object o3) {
                    final pr4 pr4 = (pr4)o;
                    final x66 x66 = (x66)o2;
                    final int intValue = ((Number)o3).intValue();
                    czd.f((Object)pr4, "$this$Tab");
                    if ((intValue & 0x51) == 0x10 && x66.i()) {
                        x66.H();
                    }
                    else {
                        final n96$b a = n96.a;
                        o8s.d(this.D0, this.E0, x66, this.F0 >> 12 & 0x70);
                    }
                    return fzv.a;
                }
            });
            final int n33 = n26 >> 6;
            b(b, nsb, okh3, b2, sth3, b3, a, (itb<? super pr4, ? super x66, ? super Integer, fzv>)g2, h, 0xC00000 | (n26 & 0xE) | (n26 & 0x70) | (n26 & 0x380) | (n26 & 0x1C00) | (0xE000 & n33) | (0x70000 & n33) | (n33 & 0x380000), 0);
            sth2 = sth3;
            ftb5 = ftb2;
            n29 = a;
            a = b3;
            ftb2 = ftb;
            okh = okh3;
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ftb<x66, Integer, fzv>(b, nsb, okh, b2, ftb2, ftb5, sth2, a, n29, n, n2) {
                public final boolean D0;
                public final nsb<fzv> E0;
                public final okh F0;
                public final boolean G0;
                public final ftb<x66, Integer, fzv> H0;
                public final ftb<x66, Integer, fzv> I0;
                public final sth J0;
                public final long K0;
                public final long L0;
                public final int M0;
                public final int N0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final x66 x66 = (x66)o;
                    ((Number)o2).intValue();
                    o8s.a(this.D0, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, this.L0, x66, this.M0 | 0x1, this.N0);
                    return fzv.a;
                }
            });
        }
    }
    
    public static final void b(final boolean b, final nsb<fzv> nsb, okh companion, boolean b2, sth sth, long a, long n, final itb<? super pr4, ? super x66, ? super Integer, fzv> itb, final x66 x66, final int n2, final int n3) {
        czd.f((Object)nsb, "onClick");
        czd.f((Object)itb, "content");
        final x66 h = x66.h(713679175);
        int n4;
        if ((n3 & 0x1) != 0x0) {
            n4 = (n2 | 0x6);
        }
        else if ((n2 & 0xE) == 0x0) {
            int n5;
            if (h.a(b)) {
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
        int n6;
        if ((n3 & 0x2) != 0x0) {
            n6 = (n4 | 0x30);
        }
        else {
            n6 = n4;
            if ((n2 & 0x70) == 0x0) {
                int n7;
                if (h.P((Object)nsb)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        final int n8 = n3 & 0x4;
        int n11 = 0;
        Label_0214: {
            int n9;
            if (n8 != 0) {
                n9 = (n6 | 0x180);
            }
            else {
                n9 = n6;
                if ((n2 & 0x380) == 0x0) {
                    int n10;
                    if (h.P((Object)companion)) {
                        n10 = 256;
                    }
                    else {
                        n10 = 128;
                    }
                    n11 = (n6 | n10);
                    break Label_0214;
                }
            }
            n11 = n9;
        }
        final int n12 = n3 & 0x8;
        int n15 = 0;
        Label_0288: {
            int n13;
            if (n12 != 0) {
                n13 = (n11 | 0xC00);
            }
            else {
                n13 = n11;
                if ((n2 & 0x1C00) == 0x0) {
                    int n14;
                    if (h.a(b2)) {
                        n14 = 2048;
                    }
                    else {
                        n14 = 1024;
                    }
                    n15 = (n11 | n14);
                    break Label_0288;
                }
            }
            n15 = n13;
        }
        final int n16 = n3 & 0x10;
        int n19 = 0;
        Label_0362: {
            int n17;
            if (n16 != 0) {
                n17 = (n15 | 0x6000);
            }
            else {
                n17 = n15;
                if ((0xE000 & n2) == 0x0) {
                    int n18;
                    if (h.P((Object)sth)) {
                        n18 = 16384;
                    }
                    else {
                        n18 = 8192;
                    }
                    n19 = (n15 | n18);
                    break Label_0362;
                }
            }
            n19 = n17;
        }
        if ((0x70000 & n2) == 0x0) {
            int n20;
            if ((n3 & 0x20) == 0x0 && h.e(a)) {
                n20 = 131072;
            }
            else {
                n20 = 65536;
            }
            n19 |= n20;
        }
        int n22;
        if ((0x380000 & n2) == 0x0) {
            int n21;
            if ((n3 & 0x40) == 0x0 && h.e(n)) {
                n21 = 1048576;
            }
            else {
                n21 = 524288;
            }
            n22 = (n19 | n21);
        }
        else {
            n22 = n19;
        }
        int n24 = 0;
        Label_0522: {
            int n23;
            if ((n3 & 0x80) != 0x0) {
                n23 = 12582912;
            }
            else {
                n24 = n22;
                if ((0x1C00000 & n2) != 0x0) {
                    break Label_0522;
                }
                if (h.P((Object)itb)) {
                    n23 = 8388608;
                }
                else {
                    n23 = 4194304;
                }
            }
            n24 = (n22 | n23);
        }
        okh okh;
        sth sth2 = null;
        long n25;
        if ((0x16DB6DB & n24) == 0x492492 && h.i()) {
            h.H();
            okh = companion;
            sth2 = sth;
            n25 = n;
        }
        else {
            h.C();
            okh okh3 = null;
            Label_0831: {
                if ((n2 & 0x1) != 0x0 && !h.K()) {
                    h.H();
                    int n26 = n24;
                    if ((n3 & 0x20) != 0x0) {
                        n26 = (n24 & 0xFFF8FFFF);
                    }
                    n24 = n26;
                    if ((n3 & 0x40) != 0x0) {
                        n24 = (n26 & 0xFFC7FFFF);
                    }
                }
                else {
                    if (n8 != 0) {
                        companion = (okh)okh.Companion;
                    }
                    if (n12 != 0) {
                        b2 = true;
                    }
                    if (n16 != 0) {
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
                    if ((n3 & 0x20) != 0x0) {
                        a = ((nq4)h.m((wd6)sk6.a)).a;
                        n24 &= 0xFFF8FFFF;
                    }
                    if ((n3 & 0x40) != 0x0) {
                        final long b3 = nq4.b(a, rp9.a0(h));
                        final okh okh2 = companion;
                        sth2 = sth;
                        n24 &= 0xFFC7FFFF;
                        n = a;
                        a = b3;
                        okh3 = okh2;
                        break Label_0831;
                    }
                }
                final sth sth3 = sth;
                final long n27 = n;
                n = a;
                okh3 = companion;
                a = n27;
                sth2 = sth3;
            }
            h.s();
            final n96$b a2 = n96.a;
            final s26 g = io7.g(h, -1237246709, (Object)new ftb<x66, Integer, fzv>(okh3, b, sth2, yzm.a(true, 0.0f, n, h, (n24 >> 9 & 0x380) | 0x6, 2), b2, nsb, itb, n24) {
                public final okh D0;
                public final boolean E0;
                public final sth F0;
                public final ikd G0;
                public final boolean H0;
                public final nsb<fzv> I0;
                public final itb<pr4, x66, Integer, fzv> J0;
                public final int K0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final x66 x66 = (x66)o;
                    if ((((Number)o2).intValue() & 0xB) == 0x2 && x66.i()) {
                        x66.H();
                    }
                    else {
                        final n96$b a = n96.a;
                        Objects.requireNonNull(d0n.Companion);
                        final okh i = kdq.i(gep.a(this.D0, this.E0, this.F0, this.G0, this.H0, new d0n(4), (nsb)this.I0));
                        Objects.requireNonNull(ex.Companion);
                        final bw1.a o3 = ex.a.o;
                        final ds0 a2 = ds0.a;
                        final ds0$b f = ds0.f;
                        final itb<pr4, x66, Integer, fzv> j0 = this.J0;
                        final int n = (this.K0 >> 12 & 0x1C00) | 0x1B0;
                        x66.x(-483455358);
                        final fqg a3 = nr4.a((ds0.l)f, (ex.b)o3, x66);
                        x66.x(-1323940314);
                        final lo8 lo8 = (lo8)x66.m((wd6)yd6.e);
                        final fve fve = (fve)x66.m((wd6)yd6.k);
                        final t6x t6x = (t6x)x66.m((wd6)yd6.o);
                        Objects.requireNonNull(q66.Companion);
                        final vve$a b = q66.a.b;
                        final itb a4 = ove.a(i);
                        final int n2 = ((n << 3 & 0x70) << 9 & 0x1C00) | 0x6;
                        if (!(x66.j() instanceof qr0)) {
                            wd.t();
                            throw null;
                        }
                        x66.E();
                        if (x66.f()) {
                            x66.A((nsb)b);
                        }
                        else {
                            x66.o();
                        }
                        x66.F();
                        mru.p(x66, (Object)a3, (ftb)q66.a.e);
                        mru.p(x66, (Object)lo8, (ftb)q66.a.d);
                        mru.p(x66, (Object)fve, (ftb)q66.a.f);
                        ((t26)a4).h0((Object)g4k.C(x66, t6x, q66.a.g, x66), (Object)x66, (Object)(n2 >> 3 & 0x70));
                        x66.x(2058660585);
                        x66.x(-1163856341);
                        if ((n2 >> 9 & 0xE & 0xB) == 0x2 && x66.i()) {
                            x66.H();
                        }
                        else {
                            j0.h0((Object)qr4.a, (Object)x66, (Object)((n >> 6 & 0x70) | 0x6));
                        }
                        c0.D(x66);
                    }
                    return fzv.a;
                }
            });
            final int n28 = n24 >> 15;
            c(n, a, b, (ftb<? super x66, ? super Integer, fzv>)g, h, (n28 & 0x70) | ((n28 & 0xE) | 0xC00) | (n24 << 6 & 0x380));
            n25 = a;
            a = n;
            okh = okh3;
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ftb<x66, Integer, fzv>(b, nsb, okh, b2, sth2, a, n25, itb, n2, n3) {
                public final boolean D0;
                public final nsb<fzv> E0;
                public final okh F0;
                public final boolean G0;
                public final sth H0;
                public final long I0;
                public final long J0;
                public final itb<pr4, x66, Integer, fzv> K0;
                public final int L0;
                public final int M0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final x66 x66 = (x66)o;
                    ((Number)o2).intValue();
                    o8s.b(this.D0, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, x66, this.L0 | 0x1, this.M0);
                    return fzv.a;
                }
            });
        }
    }
    
    public static final void c(final long n, final long n2, final boolean b, final ftb<? super x66, ? super Integer, fzv> ftb, final x66 x66, final int n3) {
        final x66 h = x66.h(-405571117);
        int n5;
        if ((n3 & 0xE) == 0x0) {
            int n4;
            if (h.e(n)) {
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
            if (h.e(n2)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n5 | n7);
        }
        if ((n3 & 0x380) == 0x0) {
            int n8;
            if (h.a(b)) {
                n8 = 256;
            }
            else {
                n8 = 128;
            }
            n6 |= n8;
        }
        int n9 = n6;
        if ((n3 & 0x1C00) == 0x0) {
            int n10;
            if (h.P((Object)ftb)) {
                n10 = 2048;
            }
            else {
                n10 = 1024;
            }
            n9 = (n6 | n10);
        }
        if ((n9 & 0x16DB) == 0x492 && h.i()) {
            h.H();
        }
        else {
            final n96$b a = n96.a;
            final int n11 = n9 >> 6;
            final mzt c = e0u.c((Object)b, (String)null, h, n11 & 0xE, 2);
            final itb<mzt$b<Boolean>, x66, Integer, uza<nq4>> d0 = (itb<mzt$b<Boolean>, x66, Integer, uza<nq4>>)o8s$g.D0;
            h.x(-1462136984);
            final boolean booleanValue = (boolean)c.f();
            h.x(1445938070);
            long n12;
            if (booleanValue) {
                n12 = n;
            }
            else {
                n12 = n2;
            }
            h.O();
            final yq4 f = nq4.f(n12);
            h.x(-3686930);
            final boolean p6 = h.P((Object)f);
            final Object y = h.y();
            Object o = null;
            Label_0395: {
                if (!p6) {
                    Objects.requireNonNull(x66.Companion);
                    if ((o = y) != x66$a.b) {
                        break Label_0395;
                    }
                }
                hr4.b(nq4.Companion);
                o = hr4.a.invoke((Object)f);
                h.p(o);
            }
            h.O();
            final zhv zhv = (zhv)o;
            h.x(1847725064);
            final boolean booleanValue2 = (boolean)c.b();
            h.x(1445938070);
            long n13;
            if (booleanValue2) {
                n13 = n;
            }
            else {
                n13 = n2;
            }
            h.O();
            final nq4 nq4 = new nq4(n13);
            final boolean booleanValue3 = (boolean)c.f();
            h.x(1445938070);
            long n14;
            if (booleanValue3) {
                n14 = n;
            }
            else {
                n14 = n2;
            }
            h.O();
            final m8r b2 = e0u.b(c, (Object)nq4, (Object)new nq4(n14), (uza)d0.h0(c.d(), h, 0), zhv, "ColorAnimation", h);
            h.O();
            h.O();
            final eo9 a2 = sk6.a;
            final mzt$d mzt$d = (mzt$d)b2;
            xd6.a(new bml[] { a2.b((Object)new nq4(nq4.b(((nq4)mzt$d.getValue()).a, 1.0f))), rk6.a.b((Object)nq4.d(((nq4)mzt$d.getValue()).a)) }, (ftb)ftb, h, (n11 & 0x70) | 0x8);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ftb<x66, Integer, fzv>(n, n2, b, ftb, n3) {
                public final long D0;
                public final long E0;
                public final boolean F0;
                public final ftb<x66, Integer, fzv> G0;
                public final int H0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final x66 x66 = (x66)o;
                    ((Number)o2).intValue();
                    o8s.c(this.D0, this.E0, this.F0, this.G0, x66, this.H0 | 0x1);
                    return fzv.a;
                }
            });
        }
    }
    
    public static final void d(final ftb ftb, final ftb ftb2, x66 h, final int n) {
        h = h.h(1249848471);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (h.P((Object)ftb)) {
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
            if (h.P((Object)ftb2)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if ((n4 & 0x5B) == 0x12 && h.i()) {
            h.H();
        }
        else {
            final n96$b a = n96.a;
            final p8s p8s = new p8s(ftb, ftb2);
            h.x(-1323940314);
            final okh$a companion = okh.Companion;
            final iar e = yd6.e;
            final lo8 lo8 = (lo8)h.m((wd6)e);
            final iar k = yd6.k;
            final fve fve = (fve)h.m((wd6)k);
            final iar o = yd6.o;
            final t6x t6x = (t6x)h.m((wd6)o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b = q66.a.b;
            final itb a2 = ove.a((okh)companion);
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
            mru.p(h, (Object)p8s, (ftb)e2);
            final q66$a$a d = q66.a.d;
            mru.p(h, (Object)lo8, (ftb)d);
            final q66$a$b f = q66.a.f;
            mru.p(h, (Object)fve, (ftb)f);
            final q66$a$e g = q66.a.g;
            ((t26)a2).h0((Object)g4k.C(h, t6x, g, h), (Object)h, (Object)0);
            sk0.D(h, 2058660585, 1142473408, -2141028452);
            if (ftb != null) {
                final okh e3 = nza.E1(g63.U((okh)companion, (Object)"text"), o8s.c, 0.0f, 2);
                h.x(733328855);
                Objects.requireNonNull(ex.Companion);
                final fqg d2 = bb2.d((ex)ex.a.b, false, h);
                h.x(-1323940314);
                final lo8 lo9 = (lo8)h.m((wd6)e);
                final fve fve2 = (fve)h.m((wd6)k);
                final t6x t6x2 = (t6x)h.m((wd6)o);
                final itb a3 = ove.a(e3);
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
                ((t26)a3).h0((Object)mw.x(h, h, d2, e2, h, lo9, d, h, fve2, f, h, t6x2, g, h), (Object)h, (Object)0);
                sk0.D(h, 2058660585, -2137368960, -459869377);
                ftb.invoke((Object)h, (Object)(n4 & 0xE));
                h.O();
                h.O();
                h.O();
                h.r();
                h.O();
                h.O();
            }
            h.O();
            if (ftb2 != null) {
                final okh u = g63.U((okh)companion, (Object)"icon");
                h.x(733328855);
                Objects.requireNonNull(ex.Companion);
                final fqg d3 = bb2.d((ex)ex.a.b, false, h);
                h.x(-1323940314);
                final lo8 lo10 = (lo8)h.m((wd6)e);
                final fve fve3 = (fve)h.m((wd6)k);
                final t6x t6x3 = (t6x)h.m((wd6)o);
                final itb a4 = ove.a(u);
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
                ((t26)a4).h0((Object)mw.x(h, h, d3, e2, h, lo10, d, h, fve3, f, h, t6x3, g, h), (Object)h, (Object)0);
                sk0.D(h, 2058660585, -2137368960, 892169960);
                ftb2.invoke((Object)h, (Object)(n4 >> 3 & 0xE));
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
            i.a((ftb)new q8s(ftb, ftb2, n));
        }
    }
}
