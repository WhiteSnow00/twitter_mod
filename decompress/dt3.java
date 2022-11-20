import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dt3
{
    public static final char[] a;
    public static final byte[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    
    static {
        final int length = (a = "0123456789ABCDEF".toCharArray()).length;
        b = new byte[length];
        final int n = 0;
        for (int j = 0; j < length; ++j) {
            dt3.b[j] = (byte)dt3.a[j];
        }
        final int[] c2 = new int[256];
        for (int k = 0; k < 32; ++k) {
            c2[k] = -1;
        }
        c2[92] = (c2[34] = 1);
        c = c2;
        final int length2 = c2.length;
        final int[] d2 = new int[length2];
        System.arraycopy(c2, 0, d2, 0, length2);
        for (int l = 128; l < 256; ++l) {
            int n2;
            if ((l & 0xE0) == 0xC0) {
                n2 = 2;
            }
            else if ((l & 0xF0) == 0xE0) {
                n2 = 3;
            }
            else if ((l & 0xF8) == 0xF0) {
                n2 = 4;
            }
            else {
                n2 = -1;
            }
            d2[l] = n2;
        }
        d = d2;
        final int[] e2 = new int[256];
        Arrays.fill(e2, -1);
        for (int n3 = 33; n3 < 256; ++n3) {
            if (Character.isJavaIdentifierPart((char)n3)) {
                e2[n3] = 0;
            }
        }
        e2[64] = 0;
        e2[42] = (e2[35] = 0);
        e2[43] = (e2[45] = 0);
        e = e2;
        final int[] f2 = new int[256];
        System.arraycopy(e2, 0, f2, 0, 256);
        Arrays.fill(f2, 128, 128, 0);
        f = f2;
        final int[] g2 = new int[256];
        final int[] d3 = dt3.d;
        System.arraycopy(d3, 128, g2, 128, 128);
        Arrays.fill(g2, 0, 32, -1);
        g2[9] = 0;
        g2[10] = 10;
        g2[13] = 13;
        g2[42] = 42;
        g = g2;
        final int[] array = new int[256];
        System.arraycopy(d3, 128, array, 128, 128);
        Arrays.fill(array, 0, 32, -1);
        array[9] = (array[32] = 1);
        array[10] = 10;
        array[13] = 13;
        array[47] = 47;
        array[35] = 35;
        final int[] h2 = new int[128];
        for (int n4 = 0; n4 < 32; ++n4) {
            h2[n4] = -1;
        }
        h2[34] = 34;
        h2[92] = 92;
        h2[8] = 98;
        h2[9] = 116;
        h2[12] = 102;
        h2[10] = 110;
        h2[13] = 114;
        h = h2;
        Arrays.fill(i = new int[128], -1);
        int n5 = 0;
        int n6;
        while (true) {
            n6 = n;
            if (n5 >= 10) {
                break;
            }
            dt3.i[n5 + 48] = n5;
            ++n5;
        }
        while (n6 < 6) {
            final int[] m = dt3.i;
            m[n6 + 65] = (m[n6 + 97] = n6 + 10);
            ++n6;
        }
    }
}
