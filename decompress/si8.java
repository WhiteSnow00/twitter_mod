// 
// Decompiled by Procyon v0.6.0
// 

public final class si8 implements k7d$a
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
        f = tpz.t("GIF87a");
        g = tpz.t("GIF89a");
        i = (h = tpz.t("BM")).length;
        final byte[] array3;
        final byte[] j2 = array3 = new byte[4];
        array3[1] = (array3[0] = 0);
        array3[2] = 1;
        array3[3] = 0;
        j = j2;
        k = j2.length;
        l = tpz.t("ftyp");
        m = new byte[][] { tpz.t("heic"), tpz.t("heix"), tpz.t("hevc"), tpz.t("hevx"), tpz.t("mif1"), tpz.t("msf1") };
        final byte[] array4;
        final byte[] n2 = array4 = new byte[4];
        array4[1] = (array4[0] = 73);
        array4[2] = 42;
        array4[3] = 0;
        n = n2;
        o = new byte[] { 77, 77, 0, 42 };
        p = n2.length;
    }
    
    public si8() {
        final int[] array = new int[8];
        array[0] = 21;
        int i = 1;
        array[1] = 20;
        array[2] = si8.c;
        array[3] = si8.e;
        array[4] = 6;
        array[5] = si8.i;
        array[6] = si8.k;
        array[7] = 12;
        xd.D(Boolean.TRUE);
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
    
    public static k7d c(final byte[] array, int n) {
        xd.D(cox.b(array, n));
        if (cox.d(array, 12, cox.e)) {
            return shw.O0;
        }
        if (cox.d(array, 12, cox.f)) {
            return shw.P0;
        }
        final int n2 = 1;
        if (n >= 21 && cox.d(array, 12, cox.g)) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n == 0) {
            return k7d.b;
        }
        final byte[] g = cox.g;
        final boolean d = cox.d(array, 12, g);
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
            return shw.S0;
        }
        final boolean d2 = cox.d(array, 12, g);
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
            return shw.R0;
        }
        return shw.Q0;
    }
    
    public final k7d a(final byte[] array, int n) {
        if (cox.b(array, n)) {
            return c(array, n);
        }
        final byte[] b = si8.b;
        final int n2 = 1;
        if (n >= 3 && tpz.J(array, b, 0)) {
            return shw.J0;
        }
        final byte[] d = si8.d;
        if (n >= 8 && tpz.J(array, d, 0)) {
            return shw.K0;
        }
        boolean b2 = false;
        Label_0129: {
            if (n >= 6) {
                if (tpz.J(array, si8.f, 0) || tpz.J(array, si8.g, 0)) {
                    b2 = true;
                    break Label_0129;
                }
            }
            b2 = false;
        }
        if (b2) {
            return shw.L0;
        }
        final byte[] h = si8.h;
        if (n >= h.length && tpz.J(array, h, 0)) {
            return shw.M0;
        }
        final byte[] j = si8.j;
        if (n >= j.length && tpz.J(array, j, 0)) {
            return shw.N0;
        }
        boolean b3 = false;
        Label_0287: {
            if (n >= 12) {
                if (array[3] >= 8) {
                    if (tpz.J(array, si8.l, 4)) {
                        final byte[][] m = si8.m;
                        for (int length = m.length, i = 0; i < length; ++i) {
                            if (tpz.J(array, m[i], 8)) {
                                b3 = true;
                                break Label_0287;
                            }
                        }
                    }
                }
            }
            b3 = false;
        }
        if (b3) {
            return shw.T0;
        }
        Label_0335: {
            if (n >= si8.p) {
                n = n2;
                if (tpz.J(array, si8.n, 0)) {
                    break Label_0335;
                }
                if (tpz.J(array, si8.o, 0)) {
                    n = n2;
                    break Label_0335;
                }
            }
            n = 0;
        }
        if (n != 0) {
            return shw.U0;
        }
        return k7d.b;
    }
    
    public final int b() {
        return this.a;
    }
}
