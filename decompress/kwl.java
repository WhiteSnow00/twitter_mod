// 
// Decompiled by Procyon v0.6.0
// 

public final class kwl extends fje
{
    public final byte[] d;
    public final int e;
    public final int f;
    
    public kwl(final int e, final int f, final int[] array) {
        super(e, f);
        this.e = e;
        this.f = f;
        this.d = new byte[e * f];
        for (int i = 0; i < f; ++i) {
            for (int j = 0; j < e; ++j) {
                final int n = i * e + j;
                final int n2 = array[n];
                final int n3 = n2 >> 16 & 0xFF;
                final int n4 = n2 >> 8 & 0xFF;
                final int n5 = n2 & 0xFF;
                if (n3 == n4 && n4 == n5) {
                    this.d[n] = (byte)n3;
                }
                else {
                    this.d[n] = (byte)((n4 * 2 + n3 + n5) / 4);
                }
            }
        }
    }
    
    public final byte[] a() {
        final int b = super.b;
        final int c = super.c;
        final int e = this.e;
        if (b == e && c == this.f) {
            return this.d;
        }
        final int n = b * c;
        final byte[] array = new byte[n];
        int i = 0;
        int n2 = 0 * e + 0;
        if (b == e) {
            System.arraycopy(this.d, n2, array, 0, n);
            return array;
        }
        final byte[] d = this.d;
        while (i < c) {
            System.arraycopy(d, n2, array, i * b, b);
            n2 += this.e;
            ++i;
        }
        return array;
    }
    
    public final byte[] b(final int n, final byte[] array) {
        if (n >= 0 && n < super.c) {
            final int b = super.b;
            byte[] array2 = null;
            Label_0038: {
                if (array != null) {
                    array2 = array;
                    if (array.length >= b) {
                        break Label_0038;
                    }
                }
                array2 = new byte[b];
            }
            System.arraycopy(this.d, (n + 0) * this.e + 0, array2, 0, b);
            return array2;
        }
        throw new IllegalArgumentException(rk0.B("Requested row is outside the image: ", n));
    }
}
