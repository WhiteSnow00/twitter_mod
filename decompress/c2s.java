import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c2s
{
    public static final e2s a;
    public static final e2s b;
    
    static {
        a = new e2s((float)40, (float)7.5, (float)2.5, (float)10, (float)5);
        b = new e2s((float)56, (float)11, (float)3, (float)12, (float)6);
    }
    
    public static final void a(final l2s l2s, final float n, final dlh dlh, boolean b, boolean b2, boolean b3, long l, long b4, asp asp, float n2, boolean b5, float min, final d86 d86, final int n3, final int n4, final int n5) {
        e0e.f((Object)l2s, "state");
        final d86 h = d86.h(373456677);
        int n6;
        if ((n5 & 0x1) != 0x0) {
            n6 = (n3 | 0x6);
        }
        else if ((n3 & 0xE) == 0x0) {
            int n7;
            if (h.P((Object)l2s)) {
                n7 = 4;
            }
            else {
                n7 = 2;
            }
            n6 = (n7 | n3);
        }
        else {
            n6 = n3;
        }
        int n8;
        if ((n5 & 0x2) != 0x0) {
            n8 = (n6 | 0x30);
        }
        else {
            n8 = n6;
            if ((n3 & 0x70) == 0x0) {
                int n9;
                if (h.b(n)) {
                    n9 = 32;
                }
                else {
                    n9 = 16;
                }
                n8 = (n6 | n9);
            }
        }
        final int n10 = n5 & 0x4;
        int n13 = 0;
        Label_0207: {
            int n11;
            if (n10 != 0) {
                n11 = (n8 | 0x180);
            }
            else {
                n11 = n8;
                if ((n3 & 0x380) == 0x0) {
                    int n12;
                    if (h.P((Object)dlh)) {
                        n12 = 256;
                    }
                    else {
                        n12 = 128;
                    }
                    n13 = (n8 | n12);
                    break Label_0207;
                }
            }
            n13 = n11;
        }
        final int n14 = n5 & 0x8;
        int n17 = 0;
        Label_0281: {
            int n15;
            if (n14 != 0) {
                n15 = (n13 | 0xC00);
            }
            else {
                n15 = n13;
                if ((n3 & 0x1C00) == 0x0) {
                    int n16;
                    if (h.a(b)) {
                        n16 = 2048;
                    }
                    else {
                        n16 = 1024;
                    }
                    n17 = (n13 | n16);
                    break Label_0281;
                }
            }
            n17 = n15;
        }
        final int n18 = n5 & 0x10;
        int n21 = 0;
        Label_0355: {
            int n19;
            if (n18 != 0) {
                n19 = (n17 | 0x6000);
            }
            else {
                n19 = n17;
                if ((0xE000 & n3) == 0x0) {
                    int n20;
                    if (h.a(b2)) {
                        n20 = 16384;
                    }
                    else {
                        n20 = 8192;
                    }
                    n21 = (n17 | n20);
                    break Label_0355;
                }
            }
            n21 = n19;
        }
        final int n22 = n5 & 0x20;
        int n23;
        if (n22 != 0) {
            n23 = (n21 | 0x30000);
        }
        else {
            n23 = n21;
            if ((0x70000 & n3) == 0x0) {
                int n24;
                if (h.a(b3)) {
                    n24 = 131072;
                }
                else {
                    n24 = 65536;
                }
                n23 = (n21 | n24);
            }
        }
        if ((0x380000 & n3) == 0x0) {
            int n25;
            if ((n5 & 0x40) == 0x0 && h.e(l)) {
                n25 = 1048576;
            }
            else {
                n25 = 524288;
            }
            n23 |= n25;
        }
        if ((n3 & 0x1C00000) == 0x0) {
            int n26;
            if ((n5 & 0x80) == 0x0 && h.e(b4)) {
                n26 = 8388608;
            }
            else {
                n26 = 4194304;
            }
            n23 |= n26;
        }
        if ((0xE000000 & n3) == 0x0) {
            int n27;
            if ((n5 & 0x100) == 0x0 && h.P((Object)asp)) {
                n27 = 67108864;
            }
            else {
                n27 = 33554432;
            }
            n23 |= n27;
        }
        final int n28 = n5 & 0x200;
        int n29;
        if (n28 != 0) {
            n29 = (n23 | 0x30000000);
        }
        else {
            n29 = n23;
            if ((n3 & 0x70000000) == 0x0) {
                int n30;
                if (h.b(n2)) {
                    n30 = 536870912;
                }
                else {
                    n30 = 268435456;
                }
                n29 = (n23 | n30);
            }
        }
        final int n31 = n5 & 0x400;
        int n32;
        if (n31 != 0) {
            n32 = (n4 | 0x6);
        }
        else if ((n4 & 0xE) == 0x0) {
            int n33;
            if (h.a(b5)) {
                n33 = 4;
            }
            else {
                n33 = 2;
            }
            n32 = (n4 | n33);
        }
        else {
            n32 = n4;
        }
        final int n34 = n5 & 0x800;
        int n35;
        if (n34 != 0) {
            n35 = (n32 | 0x30);
        }
        else {
            n35 = n32;
            if ((n4 & 0x70) == 0x0) {
                int n36;
                if (h.b(min)) {
                    n36 = 32;
                }
                else {
                    n36 = 16;
                }
                n35 = (n32 | n36);
            }
        }
        float n37 = 0.0f;
        boolean b7;
        Object companion = null;
        boolean b8;
        Object b9 = null;
        if ((n29 & 0x5B6DB6DB) == 0x12492492 && (n35 & 0x5B) == 0x12 && h.i()) {
            h.H();
            final boolean b6 = b3;
            n37 = n2;
            b7 = b5;
            n2 = min;
            companion = dlh;
            b8 = b6;
            b9 = asp;
        }
        else {
            h.C();
            Label_0997: {
                int n40;
                Object o;
                long n41;
                long n42;
                boolean b10;
                boolean b11;
                boolean b12;
                boolean b13;
                if ((n3 & 0x1) != 0x0 && !h.K()) {
                    h.H();
                    int n38 = n29;
                    if ((n5 & 0x40) != 0x0) {
                        n38 = (n29 & 0xFFC7FFFF);
                    }
                    int n39 = n38;
                    if ((n5 & 0x80) != 0x0) {
                        n39 = (n38 & 0xFE3FFFFF);
                    }
                    n40 = n39;
                    if ((n5 & 0x100) != 0x0) {
                        n40 = (n39 & 0xF1FFFFFF);
                    }
                    o = dlh;
                    n41 = b4;
                    n42 = l;
                    b10 = b3;
                    b11 = b2;
                    b12 = b;
                    b13 = b5;
                }
                else {
                    if (n10 != 0) {
                        companion = dlh.Companion;
                    }
                    else {
                        companion = dlh;
                    }
                    if (n14 != 0) {
                        b = true;
                    }
                    if (n18 != 0) {
                        b2 = false;
                    }
                    if (n22 != 0) {
                        b3 = true;
                    }
                    if ((n5 & 0x40) != 0x0) {
                        final sa6$b a = sa6.a;
                        l = ((os4)h.m((df6)ps4.a)).l();
                        n29 &= 0xFFC7FFFF;
                    }
                    if ((n5 & 0x80) != 0x0) {
                        b4 = ps4.b(l, h);
                        n29 &= 0xFE3FFFFF;
                    }
                    if ((n5 & 0x100) != 0x0) {
                        final sa6$b a2 = sa6.a;
                        final sy6 a3 = ((wsp)h.m((df6)xsp.a)).a;
                        final wy6 a4 = xy6.a(50);
                        Objects.requireNonNull(a3);
                        b9 = a3.b(a4, a4, a4, a4);
                        n29 &= 0xF1FFFFFF;
                    }
                    else {
                        b9 = asp;
                    }
                    if (n28 != 0) {
                        n37 = 16;
                    }
                    else {
                        n37 = n2;
                    }
                    if (n31 != 0) {
                        b5 = false;
                    }
                    n40 = n29;
                    asp = (asp)b9;
                    b13 = b5;
                    b12 = b;
                    b11 = b2;
                    b10 = b3;
                    n42 = l;
                    n2 = n37;
                    n41 = b4;
                    o = companion;
                    if (n34 != 0) {
                        n2 = 6;
                        break Label_0997;
                    }
                }
                companion = o;
                b4 = n41;
                n37 = n2;
                l = n42;
                b3 = b10;
                b2 = b11;
                n2 = min;
                b = b12;
                b5 = b13;
                b9 = asp;
                n29 = n40;
            }
            h.s();
            final sa6$b a5 = sa6.a;
            e2s e2s;
            if (b5) {
                e2s = c2s.b;
            }
            else {
                e2s = c2s.a;
            }
            final gbr e = ff6.e;
            final float t0 = ((rp8)h.m((df6)e)).t0(n);
            final int s = ((rp8)h.m((df6)e)).S(e2s.a);
            final float t2 = ((rp8)h.m((df6)e)).t0(n37);
            final float a6 = l2s.a();
            h.x(-2136847435);
            min = Math.min(1.0f, a6 / t0);
            final float n43 = Math.max(min - 0.4f, 0.0f) * 5 / 3;
            final float abs = Math.abs(a6);
            final float n44 = 2;
            final float n45 = Math.max(0.0f, Math.min(abs - t0, t0 * n44) / t0) / 4;
            final float n46 = (n45 - (float)Math.pow(n45, 2)) * n44;
            final int n47 = (int)(min * t0 + t0 * n46 * n44);
            final float n48 = 0.8f;
            min = n43 * 0.8f;
            if (min > 0.8f) {
                min = n48;
            }
            final float g = d10.g(n46, n44, 0.4f * n43 - 0.25f, 0.5f);
            final float min2 = Math.min(1.0f, n43);
            h.x(-492369756);
            final Object y = h.y();
            Objects.requireNonNull(d86.Companion);
            final d86$a$a b14 = d86$a.b;
            jgq jgq;
            if ((jgq = (jgq)y) == b14) {
                jgq = new jgq();
                h.p((Object)jgq);
            }
            h.O();
            final jgq jgq2 = jgq;
            ((cjq<Integer>)jgq2.a).setValue(Integer.valueOf(n47 + s - s));
            ((cjq<Float>)jgq2.b).setValue(Float.valueOf(0.0f));
            ((cjq<Float>)jgq2.c).setValue(Float.valueOf(min));
            ((cjq<Float>)jgq2.d).setValue(Float.valueOf(g));
            ((cjq<Float>)jgq2.e).setValue(Float.valueOf(min2));
            h.O();
            h.x(-492369756);
            Object o2;
            if ((o2 = h.y()) == b14) {
                o2 = zzz.W((Object)0.0f);
                h.p(o2);
            }
            h.O();
            final fvh fvh = (fvh)o2;
            h.x(1303400601);
            if (l2s.c()) {
                fvh.setValue((Object)((cjq<Number>)jgq2.a).getValue().intValue());
            }
            else {
                final boolean b15 = l2s.b();
                h.x(-568225417);
                int i = 0;
                boolean b16 = false;
                while (i < 4) {
                    b16 |= h.P((new Object[] { fvh, l2s, s, t2 })[i]);
                    ++i;
                }
                final Object y2 = h.y();
                Object o3 = null;
                Label_1920: {
                    if (!b16) {
                        Objects.requireNonNull(d86.Companion);
                        if ((o3 = y2) != d86$a.b) {
                            break Label_1920;
                        }
                    }
                    o3 = new c2s$a(l2s, s, t2, fvh, (mp6)null);
                    h.p(o3);
                }
                h.O();
                shw.h((Object)b15, (hub)o3, h);
            }
            h.O();
            Label_1989: {
                if (!l2s.b()) {
                    if (((Number)((l9r)fvh).getValue()).floatValue() <= 0.5f) {
                        min = 0;
                        break Label_1989;
                    }
                }
                min = n2;
            }
            int j = 0;
            final dlh m = heq.m((dlh)companion, e2s.a);
            h.x(-568225417);
            boolean b17 = false;
            while (j < 5) {
                b17 |= h.P((new Object[] { fvh, s, b2, l2s, t0 })[j]);
                ++j;
            }
            final Object y3 = h.y();
            Object o4 = null;
            Label_2141: {
                if (!b17) {
                    Objects.requireNonNull(d86.Companion);
                    if ((o4 = y3) != d86$a.b) {
                        break Label_2141;
                    }
                }
                o4 = new c2s$b(s, b2, l2s, t0, fvh);
                h.p(o4);
            }
            h.O();
            y0s.a(kqe.T(m, (stb)o4), (asp)b9, l, 0L, (f82)null, min, (hub)w9y.i(h, 1903298153, new c2s$c(e2s, b3, l2s, b4, b, t0, jgq2, n29)), h, 0x180000 | (n29 >> 21 & 0x70) | (n29 >> 12 & 0x380), 24);
            final sa6$b a7 = sa6.a;
            final boolean b18 = b3;
            b7 = b5;
            b8 = b18;
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new c2s$d(l2s, n, (dlh)companion, b, b2, b8, l, b4, (asp)b9, n37, b7, n2, n3, n4, n5));
        }
    }
    
    public static final float b(final fvh fvh) {
        return ((Number)((l9r)fvh).getValue()).floatValue();
    }
}
