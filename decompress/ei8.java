// 
// Decompiled by Procyon v0.6.0
// 

public final class ei8 implements a
{
    public static final byte[] b;
    public static final int c;
    public static final byte[] d;
    public static final int e;
    public static final byte[] f;
    public static final byte[] g;
    public static final byte[] h;
    public static final int i;
    public static final byte[] j;
    public static final int k;
    public static final byte[] l;
    public static final byte[][] m;
    public static final byte[] n;
    public static final byte[] o;
    public static final int p;
    public final int a;
    
    static {
        final byte[] array;
        final byte[] b2 = array = new byte[3];
        array[0] = -1;
        array[1] = -40;
        array[2] = -1;
        b = b2;
        c = b2.length;
        final byte[] array2;
        final byte[] d2 = array2 = new byte[8];
        array2[0] = -119;
        array2[1] = 80;
        array2[2] = 78;
        array2[3] = 71;
        array2[4] = 13;
        array2[5] = 10;
        array2[6] = 26;
        array2[7] = 10;
        d = d2;
        e = d2.length;
        f = goz.e("GIF87a");
        g = goz.e("GIF89a");
        i = (h = goz.e("BM")).length;
        final byte[] array3;
        final byte[] j2 = array3 = new byte[4];
        array3[1] = (array3[0] = 0);
        array3[2] = 1;
        array3[3] = 0;
        j = j2;
        k = j2.length;
        l = goz.e("ftyp");
        m = new byte[][] { goz.e("heic"), goz.e("heix"), goz.e("hevc"), goz.e("hevx"), goz.e("mif1"), goz.e("msf1") };
        final byte[] array4;
        final byte[] n2 = array4 = new byte[4];
        array4[1] = (array4[0] = 73);
        array4[2] = 42;
        array4[3] = 0;
        n = n2;
        o = new byte[] { 77, 77, 0, 42 };
        p = n2.length;
    }
    
    public ei8() {
        final int[] array = new int[8];
        array[0] = 21;
        int i = 1;
        array[1] = 20;
        array[2] = ei8.c;
        array[3] = ei8.e;
        array[4] = 6;
        array[5] = ei8.i;
        array[6] = ei8.k;
        array[7] = 12;
        ri4.j(Boolean.TRUE);
        int a = array[0];
        while (i < 8) {
            int n;
            if (array[i] > (n = a)) {
                n = array[i];
            }
            ++i;
            a = n;
        }
        this.a = a;
    }
    
    public static f7d c(final byte[] array, int n) {
        ri4.j(Boolean.valueOf(tmx.b(array, n)));
        if (tmx.d(array, 12, tmx.e)) {
            return bp7.J0;
        }
        if (tmx.d(array, 12, tmx.f)) {
            return bp7.K0;
        }
        final int n2 = 1;
        if (n >= 21 && tmx.d(array, 12, tmx.g)) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n == 0) {
            return f7d.b;
        }
        final byte[] g = tmx.g;
        final boolean d = tmx.d(array, 12, g);
        if ((array[20] & 0x2) == 0x2) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (d && n != 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            return bp7.N0;
        }
        final boolean d2 = tmx.d(array, 12, g);
        if ((array[20] & 0x10) == 0x10) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (d2 && n != 0) {
            n = n2;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            return bp7.M0;
        }
        return bp7.L0;
    }
    
    @Override
    public final f7d a(final byte[] array, int n) {
        if (tmx.b(array, n)) {
            return c(array, n);
        }
        final byte[] b = ei8.b;
        final int n2 = 1;
        if (n >= 3 && goz.y(array, b, 0)) {
            return bp7.E0;
        }
        final byte[] d = ei8.d;
        if (n >= 8 && goz.y(array, d, 0)) {
            return bp7.F0;
        }
        boolean b2 = false;
        Label_0133: {
            if (n >= 6) {
                if (goz.y(array, ei8.f, 0) || goz.y(array, ei8.g, 0)) {
                    b2 = true;
                    break Label_0133;
                }
            }
            b2 = false;
        }
        if (b2) {
            return bp7.G0;
        }
        final byte[] h = ei8.h;
        if (n >= h.length && goz.y(array, h, 0)) {
            return bp7.H0;
        }
        final byte[] j = ei8.j;
        if (n >= j.length && goz.y(array, j, 0)) {
            return bp7.I0;
        }
        boolean b3 = false;
        Label_0288: {
            if (n >= 12) {
                if (array[3] >= 8) {
                    if (goz.y(array, ei8.l, 4)) {
                        final byte[][] m = ei8.m;
                        for (int length = m.length, i = 0; i < length; ++i) {
                            if (goz.y(array, m[i], 8)) {
                                b3 = true;
                                break Label_0288;
                            }
                        }
                    }
                }
            }
            b3 = false;
        }
        if (b3) {
            return bp7.O0;
        }
        Label_0337: {
            if (n >= ei8.p) {
                n = n2;
                if (goz.y(array, ei8.n, 0)) {
                    break Label_0337;
                }
                if (goz.y(array, ei8.o, 0)) {
                    n = n2;
                    break Label_0337;
                }
            }
            n = 0;
        }
        if (n != 0) {
            return bp7.P0;
        }
        return f7d.b;
    }
    
    @Override
    public final int b() {
        return this.a;
    }
}
