// 
// Decompiled by Procyon v0.6.0
// 

public final class cf
{
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    
    static {
        a = new int[] { 1, 2, 3, 6 };
        b = new int[] { 48000, 44100, 32000 };
        c = new int[] { 24000, 22050, 16000 };
        d = new int[] { 2, 1, 2, 3, 3, 4, 4, 5 };
        e = new int[] { 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640 };
        f = new int[] { 69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393 };
    }
    
    public static int a(int n, int n2) {
        final int n3 = n2 / 2;
        if (n >= 0) {
            final int[] b = cf.b;
            if (n < 3 && n2 >= 0) {
                final int[] f = cf.f;
                if (n3 < 19) {
                    n = b[n];
                    if (n == 44100) {
                        return (n2 % 2 + f[n3]) * 2;
                    }
                    n2 = cf.e[n3];
                    if (n == 32000) {
                        return n2 * 6;
                    }
                    return n2 * 4;
                }
            }
        }
        return -1;
    }
}
