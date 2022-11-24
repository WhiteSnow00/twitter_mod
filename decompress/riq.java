// 
// Decompiled by Procyon v0.6.0
// 

public final class riq
{
    public int a;
    public int[] b;
    public int[] c;
    public int[] d;
    public int e;
    
    public riq() {
        this.b = new int[16];
        this.c = new int[16];
        final int[] d = new int[16];
        int n;
        for (int i = 0; i < 16; i = n) {
            n = i + 1;
            d[i] = n;
        }
        this.d = d;
    }
    
    public final int a(final int n) {
        final int a = this.a;
        final int[] b = this.b;
        final int length = b.length;
        if (a + 1 > length) {
            final int n2 = length * 2;
            final int[] b2 = new int[n2];
            final int[] c = new int[n2];
            et0.I0(b, b2, 0, 14);
            et0.I0(this.c, c, 0, 14);
            this.b = b2;
            this.c = c;
        }
        final int n3 = this.a++;
        final int length2 = this.d.length;
        if (this.e >= length2) {
            final int n4 = length2 * 2;
            final int[] d = new int[n4];
            int n5;
            for (int i = 0; i < n4; i = n5) {
                n5 = i + 1;
                d[i] = n5;
            }
            et0.I0(this.d, d, 0, 14);
            this.d = d;
        }
        final int e = this.e;
        final int[] d2 = this.d;
        this.e = d2[e];
        this.b[n3] = n;
        this.c[n3] = e;
        this.b(d2[e] = n3);
        return e;
    }
    
    public final void b(int i) {
        final int[] b = this.b;
        final int n = b[i];
        while (i > 0) {
            final int n2 = (i + 1 >> 1) - 1;
            if (b[n2] <= n) {
                break;
            }
            this.c(n2, i);
            i = n2;
        }
    }
    
    public final void c(final int n, final int n2) {
        final int[] b = this.b;
        final int[] c = this.c;
        final int[] d = this.d;
        final int n3 = b[n];
        b[n] = b[n2];
        b[n2] = n3;
        final int n4 = c[n];
        c[n] = c[n2];
        c[n2] = n4;
        d[c[n]] = n;
        d[c[n2]] = n2;
    }
}
