// 
// Decompiled by Procyon v0.6.0
// 

public final class rgs
{
    public static final rgs a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    
    static {
        a = new rgs();
        b = 56;
        c = 280;
        d = 1;
        e = 2;
    }
    
    public final void a(final String s, final hub<? super d86, ? super Integer, vzv> hub, final boolean b, final boolean b2, final bgx bgx, final hvd hvd, boolean b3, hub<? super d86, ? super Integer, vzv> hub2, hub<? super d86, ? super Integer, vzv> hub3, hub<? super d86, ? super Integer, vzv> hub4, hub<? super d86, ? super Integer, vzv> hub5, lgs lgs, final osj osj, final d86 d86, final int n, final int n2, final int n3) {
        e0e.f((Object)s, "value");
        e0e.f((Object)hub, "innerTextField");
        e0e.f((Object)bgx, "visualTransformation");
        e0e.f((Object)hvd, "interactionSource");
        final d86 h = d86.h(1171040065);
        int n4;
        if ((n3 & 0x1) != 0x0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n5;
            if (h.P((Object)s)) {
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
        if ((n3 & 0x2) != 0x0) {
            n6 = (n4 | 0x30);
        }
        else {
            n6 = n4;
            if ((n & 0x70) == 0x0) {
                int n7;
                if (h.P((Object)hub)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        int n10 = 0;
        Label_0223: {
            int n8;
            if ((n3 & 0x4) != 0x0) {
                n8 = (n6 | 0x180);
            }
            else {
                n8 = n6;
                if ((n & 0x380) == 0x0) {
                    int n9;
                    if (h.a(b)) {
                        n9 = 256;
                    }
                    else {
                        n9 = 128;
                    }
                    n10 = (n6 | n9);
                    break Label_0223;
                }
            }
            n10 = n8;
        }
        final int n11 = 1024;
        int n12;
        if ((n3 & 0x8) != 0x0) {
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
                n12 = (n10 | n13);
            }
        }
        int n14;
        if ((n3 & 0x10) != 0x0) {
            n14 = (n12 | 0x6000);
        }
        else {
            n14 = n12;
            if ((n & 0xE000) == 0x0) {
                int n15;
                if (h.P((Object)bgx)) {
                    n15 = 16384;
                }
                else {
                    n15 = 8192;
                }
                n14 = (n12 | n15);
            }
        }
        int n17 = 0;
        Label_0415: {
            int n16;
            if ((n3 & 0x20) != 0x0) {
                n16 = 196608;
            }
            else {
                n17 = n14;
                if ((n & 0x70000) != 0x0) {
                    break Label_0415;
                }
                if (h.P((Object)hvd)) {
                    n16 = 131072;
                }
                else {
                    n16 = 65536;
                }
            }
            n17 = (n14 | n16);
        }
        final int n18 = n3 & 0x40;
        int n19;
        if (n18 != 0) {
            n19 = (n17 | 0x180000);
        }
        else {
            n19 = n17;
            if ((n & 0x380000) == 0x0) {
                int n20;
                if (h.a(b3)) {
                    n20 = 1048576;
                }
                else {
                    n20 = 524288;
                }
                n19 = (n17 | n20);
            }
        }
        final int n21 = n3 & 0x80;
        int n22;
        if (n21 != 0) {
            n22 = (n19 | 0xC00000);
        }
        else {
            n22 = n19;
            if ((n & 0x1C00000) == 0x0) {
                int n23;
                if (h.P((Object)hub2)) {
                    n23 = 8388608;
                }
                else {
                    n23 = 4194304;
                }
                n22 = (n19 | n23);
            }
        }
        final int n24 = n3 & 0x100;
        int n25;
        if (n24 != 0) {
            n25 = (n22 | 0x6000000);
        }
        else {
            n25 = n22;
            if ((n & 0xE000000) == 0x0) {
                int n26;
                if (h.P((Object)hub3)) {
                    n26 = 67108864;
                }
                else {
                    n26 = 33554432;
                }
                n25 = (n22 | n26);
            }
        }
        final int n27 = n3 & 0x200;
        int n28;
        if (n27 != 0) {
            n28 = (n25 | 0x30000000);
        }
        else {
            n28 = n25;
            if ((n & 0x70000000) == 0x0) {
                int n29;
                if (h.P((Object)hub4)) {
                    n29 = 536870912;
                }
                else {
                    n29 = 268435456;
                }
                n28 = (n25 | n29);
            }
        }
        final int n30 = n3 & 0x400;
        int n31;
        if (n30 != 0) {
            n31 = (n2 | 0x6);
        }
        else if ((n2 & 0xE) == 0x0) {
            int n32;
            if (h.P((Object)hub5)) {
                n32 = 4;
            }
            else {
                n32 = 2;
            }
            n31 = (n2 | n32);
        }
        else {
            n31 = n2;
        }
        if ((n2 & 0x70) == 0x0) {
            int n33;
            if ((n3 & 0x800) == 0x0 && h.P((Object)lgs)) {
                n33 = 32;
            }
            else {
                n33 = 16;
            }
            n31 |= n33;
        }
        if ((n2 & 0x380) == 0x0) {
            int n34;
            if ((n3 & 0x1000) == 0x0 && h.P((Object)osj)) {
                n34 = 256;
            }
            else {
                n34 = 128;
            }
            n31 |= n34;
        }
        final int n35 = n31;
        int n36;
        if ((n3 & 0x2000) != 0x0) {
            n36 = (n35 | 0xC00);
        }
        else {
            n36 = n35;
            if ((n2 & 0x1C00) == 0x0) {
                int n37 = n11;
                if (h.P((Object)this)) {
                    n37 = 2048;
                }
                n36 = (n35 | n37);
            }
        }
        hub<? super d86, ? super Integer, vzv> hub6;
        osj osj2;
        if ((n28 & 0x5B6DB6DB) == 0x12492492 && (n36 & 0x16DB) == 0x492 && h.i()) {
            h.H();
            hub6 = hub2;
            osj2 = osj;
        }
        else {
            h.C();
            lgs lgs2;
            if ((n & 0x1) != 0x0 && !h.K()) {
                h.H();
                int n38 = n36;
                if ((n3 & 0x800) != 0x0) {
                    n38 = (n36 & 0xFFFFFF8F);
                }
                n36 = n38;
                if ((n3 & 0x1000) != 0x0) {
                    n36 = (n38 & 0xFFFFFC7F);
                }
                final hub<? super d86, ? super Integer, vzv> hub7 = hub2;
                final hub<? super d86, ? super Integer, vzv> hub8 = hub4;
                hub4 = hub5;
                osj2 = osj;
                lgs2 = lgs;
                hub5 = hub8;
                hub6 = hub7;
            }
            else {
                if (n18 != 0) {
                    b3 = false;
                }
                final hub<? super d86, ? super Integer, vzv> hub9 = null;
                hub<? super d86, ? super Integer, vzv> hub10;
                if (n21 != 0) {
                    hub10 = null;
                }
                else {
                    hub10 = hub2;
                }
                hub<? super d86, ? super Integer, vzv> hub11 = hub3;
                if (n24 != 0) {
                    hub11 = null;
                }
                if (n27 != 0) {
                    hub2 = null;
                }
                else {
                    hub2 = hub4;
                }
                if (n30 != 0) {
                    hub4 = hub9;
                }
                else {
                    hub4 = hub5;
                }
                lgs b4;
                if ((n3 & 0x800) != 0x0) {
                    b4 = this.b(0L, 0L, 0L, 0L, h, 2097151);
                    n36 &= 0xFFFFFF8F;
                }
                else {
                    b4 = lgs;
                }
                Object o;
                if ((n3 & 0x1000) != 0x0) {
                    psj psj;
                    if (hub10 == null) {
                        final float b5 = dhs.b;
                        psj = new psj(b5, b5, b5, b5);
                    }
                    else {
                        final float b6 = dhs.b;
                        final float a = rhs.a;
                        psj = new psj(b6, rhs.a, b6, rhs.b);
                    }
                    n36 &= 0xFFFFFC7F;
                    lgs = b4;
                    o = psj;
                }
                else {
                    hub5 = hub2;
                    o = osj;
                }
                final lgs lgs3 = b4;
                hub6 = hub10;
                hub3 = hub11;
                hub5 = hub2;
                lgs2 = lgs3;
                osj2 = (osj)o;
            }
            h.s();
            final sa6$b a2 = sa6.a;
            final ris f0 = ris.F0;
            final int n39 = n28 << 3;
            final int n40 = n28 >> 9;
            dhs.a(f0, s, (hub)hub, bgx, (hub)hub6, (hub)hub3, (hub)hub5, (hub)hub4, b2, b, b3, hvd, osj2, lgs2, (hub)null, h, (n39 & 0x380) | ((n39 & 0x70) | 0x6) | (n28 >> 3 & 0x1C00) | (n40 & 0xE000) | (n40 & 0x70000) | (n40 & 0x380000) | (n36 << 21 & 0x1C00000) | (n28 << 15 & 0xE000000) | (n28 << 21 & 0x70000000), (n28 >> 18 & 0xE) | (n28 >> 12 & 0x70) | (n36 & 0x380) | (n36 << 6 & 0x1C00), 16384);
            final hub<? super d86, ? super Integer, vzv> hub12 = hub5;
            lgs = lgs2;
            hub5 = hub4;
            hub4 = hub12;
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new hub<d86, Integer, vzv>(this, s, hub, b, b2, bgx, hvd, b3, hub6, hub3, hub4, hub5, lgs, osj2, n, n2, n3) {
                public final rgs F0;
                public final String G0;
                public final hub<d86, Integer, vzv> H0;
                public final boolean I0;
                public final boolean J0;
                public final bgx K0;
                public final hvd L0;
                public final boolean M0;
                public final hub<d86, Integer, vzv> N0;
                public final hub<d86, Integer, vzv> O0;
                public final hub<d86, Integer, vzv> P0;
                public final hub<d86, Integer, vzv> Q0;
                public final lgs R0;
                public final osj S0;
                public final int T0;
                public final int U0;
                public final int V0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final d86 d86 = (d86)o;
                    ((Number)o2).intValue();
                    this.F0.a(this.G0, this.H0, this.I0, this.J0, this.K0, this.L0, this.M0, this.N0, this.O0, this.P0, this.Q0, this.R0, this.S0, d86, this.T0 | 0x1, this.U0, this.V0);
                    return vzv.a;
                }
            });
        }
    }
    
    public final lgs b(long b, long b2, long b3, long b4, final d86 d86, final int n) {
        d86.x(231892599);
        long b5;
        if ((n & 0x1) != 0x0) {
            b5 = sr4.b(((sr4)d86.m((df6)yl6.a)).a, ((Number)d86.m((df6)xl6.a)).floatValue());
        }
        else {
            b5 = b;
        }
        long b6;
        if ((n & 0x2) != 0x0) {
            b6 = sr4.b(b5, d4j.E(d86, 6));
        }
        else {
            b6 = 0L;
        }
        if ((n & 0x4) != 0x0) {
            final sa6$b a = sa6.a;
            b2 = sr4.b(((os4)d86.m((df6)ps4.a)).g(), 0.12f);
        }
        long h;
        if ((n & 0x8) != 0x0) {
            final sa6$b a2 = sa6.a;
            h = ((os4)d86.m((df6)ps4.a)).h();
        }
        else {
            h = 0L;
        }
        long b7;
        if ((n & 0x10) != 0x0) {
            final sa6$b a3 = sa6.a;
            b7 = ((os4)d86.m((df6)ps4.a)).b();
        }
        else {
            b7 = 0L;
        }
        if ((n & 0x20) != 0x0) {
            final sa6$b a4 = sa6.a;
            b3 = sr4.b(((os4)d86.m((df6)ps4.a)).h(), d4j.I(d86));
        }
        if ((n & 0x40) != 0x0) {
            final sa6$b a5 = sa6.a;
            b4 = sr4.b(((os4)d86.m((df6)ps4.a)).g(), 0.42f);
        }
        long b8;
        if ((n & 0x80) != 0x0) {
            b8 = sr4.b(b4, d4j.E(d86, 6));
        }
        else {
            b8 = 0L;
        }
        long b9;
        if ((n & 0x100) != 0x0) {
            final sa6$b a6 = sa6.a;
            b9 = ((os4)d86.m((df6)ps4.a)).b();
        }
        else {
            b9 = 0L;
        }
        if ((n & 0x200) != 0x0) {
            final sa6$b a7 = sa6.a;
            b = sr4.b(((os4)d86.m((df6)ps4.a)).g(), 0.54f);
        }
        else {
            b = 0L;
        }
        long b10;
        if ((n & 0x400) != 0x0) {
            b10 = sr4.b(b, d4j.E(d86, 6));
        }
        else {
            b10 = 0L;
        }
        long n2;
        if ((n & 0x800) != 0x0) {
            n2 = b;
        }
        else {
            n2 = 0L;
        }
        long b11;
        if ((n & 0x1000) != 0x0) {
            final sa6$b a8 = sa6.a;
            b11 = sr4.b(((os4)d86.m((df6)ps4.a)).g(), 0.54f);
        }
        else {
            b11 = 0L;
        }
        long b12;
        if ((n & 0x2000) != 0x0) {
            b12 = sr4.b(b11, d4j.E(d86, 6));
        }
        else {
            b12 = 0L;
        }
        long b13;
        if ((n & 0x4000) != 0x0) {
            final sa6$b a9 = sa6.a;
            b13 = ((os4)d86.m((df6)ps4.a)).b();
        }
        else {
            b13 = 0L;
        }
        long b14;
        if ((0x8000 & n) != 0x0) {
            final sa6$b a10 = sa6.a;
            b14 = sr4.b(((os4)d86.m((df6)ps4.a)).h(), d4j.I(d86));
        }
        else {
            b14 = 0L;
        }
        long b15;
        if ((0x10000 & n) != 0x0) {
            final sa6$b a11 = sa6.a;
            b15 = sr4.b(((os4)d86.m((df6)ps4.a)).g(), d4j.L(d86));
        }
        else {
            b15 = 0L;
        }
        long b16;
        if ((0x20000 & n) != 0x0) {
            b16 = sr4.b(b15, d4j.E(d86, 6));
        }
        else {
            b16 = 0L;
        }
        long b17;
        if ((0x40000 & n) != 0x0) {
            final sa6$b a12 = sa6.a;
            b17 = ((os4)d86.m((df6)ps4.a)).b();
        }
        else {
            b17 = 0L;
        }
        long b18;
        if ((0x80000 & n) != 0x0) {
            final sa6$b a13 = sa6.a;
            b18 = sr4.b(((os4)d86.m((df6)ps4.a)).g(), d4j.L(d86));
        }
        else {
            b18 = 0L;
        }
        long b19;
        if ((n & 0x100000) != 0x0) {
            b19 = sr4.b(b18, d4j.E(d86, 6));
        }
        else {
            b19 = 0L;
        }
        final sa6$b a14 = sa6.a;
        final zk8 zk8 = new zk8(b5, b6, h, b7, b3, b4, b9, b8, b, b10, n2, b11, b12, b13, b2, b14, b15, b16, b17, b18, b19);
        d86.O();
        return (lgs)zk8;
    }
}
