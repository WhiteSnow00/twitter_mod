// 
// Decompiled by Procyon v0.6.0
// 

public final class zgk extends yie
{
    public final byte[] d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    
    public zgk(final byte[] d, final int e, final int f, final int g, final int h, final int n, final int n2) {
        super(n, n2);
        if (n + g <= e && n2 + h <= f) {
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
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
        int n2 = this.h * e + this.g;
        int i = 0;
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
            Label_0035: {
                if (array != null) {
                    array2 = array;
                    if (array.length >= b) {
                        break Label_0035;
                    }
                }
                array2 = new byte[b];
            }
            System.arraycopy(this.d, (n + this.h) * this.e + this.g, array2, 0, b);
            return array2;
        }
        throw new IllegalArgumentException(yk.y("Requested row is outside the image: ", n));
    }
}
