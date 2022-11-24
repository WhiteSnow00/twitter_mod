import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pjq
{
    public final gxj a;
    public int b;
    
    public pjq() {
        this.a = new gxj(8);
    }
    
    public final long a(final roa roa) throws IOException {
        final byte[] a = this.a.a;
        final vh8 vh8 = (vh8)roa;
        int i = 0;
        vh8.c(a, 0, 1, false);
        final int n = this.a.a[0] & 0xFF;
        if (n == 0) {
            return Long.MIN_VALUE;
        }
        int n2;
        int n3;
        for (n2 = 128, n3 = 0; (n & n2) == 0x0; n2 >>= 1, ++n3) {}
        int n4 = n & ~n2;
        ((vh8)roa).c(this.a.a, 1, n3, false);
        while (i < n3) {
            final byte[] a2 = this.a.a;
            ++i;
            n4 = (a2[i] & 0xFF) + (n4 << 8);
        }
        this.b += n3 + 1;
        return n4;
    }
}
