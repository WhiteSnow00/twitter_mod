// 
// Decompiled by Procyon v0.6.0
// 

public final class llb
{
    public static final int[][] c;
    public static final int[] d;
    public final a8a a;
    public final byte b;
    
    static {
        c = new int[][] { { 21522, 0 }, { 20773, 1 }, { 24188, 2 }, { 23371, 3 }, { 17913, 4 }, { 16590, 5 }, { 20375, 6 }, { 19104, 7 }, { 30660, 8 }, { 29427, 9 }, { 32170, 10 }, { 30877, 11 }, { 26159, 12 }, { 25368, 13 }, { 27713, 14 }, { 26998, 15 }, { 5769, 16 }, { 5054, 17 }, { 7399, 18 }, { 6608, 19 }, { 1890, 20 }, { 597, 21 }, { 3340, 22 }, { 2107, 23 }, { 13663, 24 }, { 12392, 25 }, { 16177, 26 }, { 14854, 27 }, { 9396, 28 }, { 8579, 29 }, { 11994, 30 }, { 11245, 31 } };
        d = new int[] { 0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4 };
    }
    
    public llb(final int n) {
        final int n2 = n >> 3 & 0x3;
        if (n2 >= 0) {
            final a8a[] g0 = a8a.G0;
            if (n2 < 4) {
                this.a = g0[n2];
                this.b = (byte)(n & 0x7);
                return;
            }
        }
        throw new IllegalArgumentException();
    }
    
    public static llb a(final int n, final int n2) {
        final int[][] c = llb.c;
        int n3 = Integer.MAX_VALUE;
        int i = 0;
        int n4 = 0;
        while (i < 32) {
            final int[] array = c[i];
            final int n5 = array[0];
            if (n5 == n || n5 == n2) {
                return new llb(array[1]);
            }
            final int b = b(n, n5);
            int n6;
            if (b < (n6 = n3)) {
                n4 = array[1];
                n6 = b;
            }
            n3 = n6;
            int n7 = n4;
            if (n != n2) {
                final int b2 = b(n2, n5);
                n3 = n6;
                n7 = n4;
                if (b2 < n6) {
                    n7 = array[1];
                    n3 = b2;
                }
            }
            ++i;
            n4 = n7;
        }
        if (n3 <= 3) {
            return new llb(n4);
        }
        return null;
    }
    
    public static int b(int n, final int n2) {
        n ^= n2;
        final int[] d = llb.d;
        return d[n & 0xF] + d[n >>> 4 & 0xF] + d[n >>> 8 & 0xF] + d[n >>> 12 & 0xF] + d[n >>> 16 & 0xF] + d[n >>> 20 & 0xF] + d[n >>> 24 & 0xF] + d[n >>> 28 & 0xF];
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof llb;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final llb llb = (llb)o;
        boolean b3 = b2;
        if (this.a == llb.a) {
            b3 = b2;
            if (this.b == llb.b) {
                b3 = true;
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return this.a.ordinal() << 3 | this.b;
    }
}
