// 
// Decompiled by Procyon v0.6.0
// 

public final class r0c
{
    public static final r0c h;
    public static final r0c i;
    public static final r0c j;
    public static final r0c k;
    public static final r0c l;
    public static final r0c m;
    public final int[] a;
    public final int[] b;
    public final s0c c;
    public final s0c d;
    public final int e;
    public final int f;
    public final int g;
    
    static {
        h = new r0c(4201, 4096, 1);
        i = new r0c(1033, 1024, 1);
        j = new r0c(67, 64, 1);
        k = new r0c(19, 16, 1);
        l = new r0c(285, 256, 0);
        m = new r0c(301, 256, 1);
    }
    
    public r0c(int i, final int e, int g) {
        this.f = i;
        this.e = e;
        this.g = g;
        this.a = new int[e];
        this.b = new int[e];
        int j = 0;
        g = 1;
        while (j < e) {
            this.a[j] = g;
            final int n = g * 2;
            if ((g = n) >= e) {
                g = ((n ^ i) & e - 1);
            }
            ++j;
        }
        for (i = 0; i < e - 1; ++i) {
            this.b[this.a[i]] = i;
        }
        this.c = new s0c(this, new int[] { 0 });
        this.d = new s0c(this, new int[] { 1 });
    }
    
    public final s0c a(final int n, final int n2) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n2 == 0) {
            return this.c;
        }
        final int[] array = new int[n + 1];
        array[0] = n2;
        return new s0c(this, array);
    }
    
    public final int b(final int n) {
        if (n != 0) {
            return this.a[this.e - this.b[n] - 1];
        }
        throw new ArithmeticException();
    }
    
    public final int c(final int n, final int n2) {
        if (n != 0 && n2 != 0) {
            final int[] a = this.a;
            final int[] b = this.b;
            return a[(b[n] + b[n2]) % (this.e - 1)];
        }
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("GF(0x");
        g.append(Integer.toHexString(this.f));
        g.append(',');
        return y70.y(g, this.e, ')');
    }
}
