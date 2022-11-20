import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class exe
{
    public static final void a(final t7c t7c, okh companion, mye mye, zrj zrj, boolean b, ds0.l l, ds0.d b2, w5b w5b, boolean b3, final qsb<? super iye, fzv> qsb, final x66 x66, final int n, final int n2) {
        czd.f((Object)t7c, "columns");
        czd.f((Object)qsb, "content");
        final x66 h = x66.h(1485410512);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)t7c)) {
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
                n6 = (n3 | n7);
            }
        }
        if ((n & 0x380) == 0x0) {
            int n8;
            if ((n2 & 0x4) == 0x0 && h.P((Object)mye)) {
                n8 = 256;
            }
            else {
                n8 = 128;
            }
            n6 |= n8;
        }
        final int n9 = n2 & 0x8;
        int n10;
        if (n9 != 0) {
            n10 = (n6 | 0xC00);
        }
        else {
            n10 = n6;
            if ((n & 0x1C00) == 0x0) {
                int n11;
                if (h.P((Object)zrj)) {
                    n11 = 2048;
                }
                else {
                    n11 = 1024;
                }
                n10 = (n6 | n11);
            }
        }
        final int n12 = n2 & 0x10;
        int n13;
        if (n12 != 0) {
            n13 = (n10 | 0x6000);
        }
        else {
            n13 = n10;
            if ((n & 0xE000) == 0x0) {
                int n14;
                if (h.a(b)) {
                    n14 = 16384;
                }
                else {
                    n14 = 8192;
                }
                n13 = (n10 | n14);
            }
        }
        if ((0x70000 & n) == 0x0) {
            int n15;
            if ((n2 & 0x20) == 0x0 && h.P((Object)l)) {
                n15 = 131072;
            }
            else {
                n15 = 65536;
            }
            n13 |= n15;
        }
        final int n16 = n2 & 0x40;
        int n17;
        if (n16 != 0) {
            n17 = (n13 | 0x180000);
        }
        else {
            n17 = n13;
            if ((n & 0x380000) == 0x0) {
                int n18;
                if (h.P((Object)b2)) {
                    n18 = 1048576;
                }
                else {
                    n18 = 524288;
                }
                n17 = (n13 | n18);
            }
        }
        if ((n & 0x1C00000) == 0x0) {
            int n19;
            if ((n2 & 0x80) == 0x0 && h.P((Object)w5b)) {
                n19 = 8388608;
            }
            else {
                n19 = 4194304;
            }
            n17 |= n19;
        }
        final int n20 = n2 & 0x100;
        int n21;
        if (n20 != 0) {
            n21 = (n17 | 0x6000000);
        }
        else {
            n21 = n17;
            if ((n & 0xE000000) == 0x0) {
                int n22;
                if (h.a(b3)) {
                    n22 = 67108864;
                }
                else {
                    n22 = 33554432;
                }
                n21 = (n17 | n22);
            }
        }
        int n24 = 0;
        Label_0624: {
            int n23;
            if ((n2 & 0x200) != 0x0) {
                n23 = 805306368;
            }
            else {
                n24 = n21;
                if ((n & 0x70000000) != 0x0) {
                    break Label_0624;
                }
                if (h.P((Object)qsb)) {
                    n23 = 536870912;
                }
                else {
                    n23 = 268435456;
                }
            }
            n24 = (n21 | n23);
        }
        ds0.d d;
        okh okh;
        mye mye3;
        zrj zrj3;
        ds0.l j;
        w5b w5b2;
        if ((0x5B6DB6DB & n24) == 0x12492492 && h.i()) {
            h.H();
            final mye mye2 = mye;
            final zrj zrj2 = zrj;
            d = b2;
            final ds0.l i = l;
            okh = companion;
            mye3 = mye2;
            zrj3 = zrj2;
            j = i;
            w5b2 = w5b;
        }
        else {
            h.C();
            zrj zrj4;
            okh okh3;
            ds0.l k;
            w5b w5b4;
            if ((n & 0x1) != 0x0 && !h.K()) {
                h.H();
                int n25 = n24;
                if ((n2 & 0x4) != 0x0) {
                    n25 = (n24 & 0xFFFFFC7F);
                }
                int n26 = n25;
                if ((n2 & 0x20) != 0x0) {
                    n26 = (n25 & 0xFFF8FFFF);
                }
                int n27 = n26;
                if ((n2 & 0x80) != 0x0) {
                    n27 = (n26 & 0xFE3FFFFF);
                }
                final okh okh2 = companion;
                final mye mye4 = mye;
                final w5b w5b3 = w5b;
                zrj4 = zrj;
                okh3 = okh2;
                n24 = n27;
                d = b2;
                mye3 = mye4;
                k = l;
                w5b4 = w5b3;
            }
            else {
                if (n5 != 0) {
                    companion = (okh)okh.Companion;
                }
                if ((n2 & 0x4) != 0x0) {
                    h.x(29186956);
                    final n96$b a = n96.a;
                    Objects.requireNonNull(mye.Companion);
                    final uto<Object, Object> u = (uto<Object, Object>)mye.u;
                    h.x(511388516);
                    final boolean p13 = h.P((Object)0);
                    final boolean p14 = h.P((Object)0);
                    Object y = h.y();
                    Label_0947: {
                        if (!(p13 | p14)) {
                            Objects.requireNonNull(x66.Companion);
                            if (y != x66$a.b) {
                                break Label_0947;
                            }
                        }
                        y = new oye(0, 0);
                        h.p(y);
                    }
                    h.O();
                    mye = (mye)uoz.T(new Object[0], (uto)u, (String)null, (nsb)y, h, 4);
                    h.O();
                    n24 &= 0xFFFFFC7F;
                }
                final boolean b4 = false;
                if (n9 != 0) {
                    final float n28 = 0;
                    zrj = (zrj)new asj(n28, n28, n28, n28);
                }
                if (n12 != 0) {
                    b = b4;
                }
                if ((n2 & 0x20) != 0x0) {
                    final ds0 a2 = ds0.a;
                    if (!b) {
                        l = (ds0.l)ds0.d;
                    }
                    else {
                        l = (ds0.l)ds0.e;
                    }
                    n24 &= 0xFFF8FFFF;
                }
                if (n16 != 0) {
                    final ds0 a3 = ds0.a;
                    b2 = (ds0.d)ds0.b;
                }
                if ((n2 & 0x80) != 0x0) {
                    h.x(1107739818);
                    final n96$b a4 = n96.a;
                    final bb8 a5 = h2r.a(h);
                    h.x(1157296644);
                    final boolean p15 = h.P((Object)a5);
                    final Object y2 = h.y();
                    wg8 wg8 = null;
                    Label_1200: {
                        if (!p15) {
                            Objects.requireNonNull(x66.Companion);
                            if ((wg8 = (wg8)y2) != x66$a.b) {
                                break Label_1200;
                            }
                        }
                        wg8 = new wg8(a5);
                        h.p((Object)wg8);
                    }
                    h.O();
                    w5b = (w5b)wg8;
                    h.O();
                    n24 &= 0xFE3FFFFF;
                }
                if (n20 != 0) {
                    b3 = true;
                }
                final ds0.l m = l;
                final zrj zrj5 = zrj;
                d = b2;
                w5b4 = w5b;
                okh3 = companion;
                k = m;
                mye3 = mye;
                zrj4 = zrj5;
            }
            h.s();
            final n96$b a6 = n96.a;
            final int n29 = n24 >> 3;
            h.x(-1355301804);
            h.x(1618982084);
            final boolean p16 = h.P((Object)t7c);
            final boolean p17 = h.P((Object)d);
            final boolean p18 = h.P((Object)zrj4);
            final Object y3 = h.y();
            Object o = null;
            Label_1394: {
                if (!(p16 | p17 | p18)) {
                    Objects.requireNonNull(x66.Companion);
                    if ((o = y3) != x66$a.b) {
                        break Label_1394;
                    }
                }
                o = new fxe(zrj4, t7c, d);
                h.p(o);
            }
            h.O();
            final ftb ftb = (ftb)o;
            h.O();
            final int n30 = n24 << 9;
            wxe.a(okh3, mye3, ftb, zrj4, b, true, w5b4, b3, k, d, (qsb)qsb, h, (n29 & 0x1C00000) | (0x30000 | (n29 & 0xE) | (n29 & 0x70) | (n24 & 0x1C00) | (0xE000 & n24) | (n29 & 0x380000)) | (n30 & 0xE000000) | (n30 & 0x70000000), n24 >> 27 & 0xE, 0);
            j = k;
            w5b2 = w5b4;
            zrj3 = zrj4;
            okh = okh3;
        }
        final lxo k2 = h.k();
        if (k2 != null) {
            k2.a((ftb)new exe$a(t7c, okh, mye3, zrj3, b, j, d, w5b2, b3, (qsb)qsb, n, n2));
        }
    }
}
