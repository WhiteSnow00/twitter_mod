import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jud
{
    public final /* synthetic */ int a;
    public int[] b;
    public int c;
    
    public jud() {
        this.a = 0;
        this.b = new int[10];
    }
    
    public jud(final int n) {
        this.a = 1;
        this.b = new int[n];
    }
    
    public final int a(int n) {
        final int c = this.c;
        if (c > 0) {
            n = this.b[c - 1];
        }
        return n;
    }
    
    public final int b() {
        switch (this.a) {
            default: {
                final int[] b = this.b;
                final int c = this.c - 1;
                this.c = c;
                return b[c];
            }
            case 0: {
                final int[] b2 = this.b;
                final int c2 = this.c - 1;
                this.c = c2;
                return b2[c2];
            }
        }
    }
    
    public final void c(final int n) {
        final int c = this.c;
        final int[] b = this.b;
        if (c >= b.length) {
            final int[] copy = Arrays.copyOf(b, b.length * 2);
            zzd.e((Object)copy, "copyOf(this, newSize)");
            this.b = copy;
        }
        this.b[this.c++] = n;
    }
    
    public final void d(final int n, final int n2, final int n3) {
        final int c = this.c;
        final int c2 = c + 3;
        final int[] b = this.b;
        if (c2 >= b.length) {
            final int[] copy = Arrays.copyOf(b, b.length * 2);
            zzd.e((Object)copy, "copyOf(this, newSize)");
            this.b = copy;
        }
        final int[] b2 = this.b;
        b2[c + 0] = n + n3;
        b2[c + 1] = n2 + n3;
        b2[c + 2] = n3;
        this.c = c2;
    }
    
    public final void e(final int n, final int n2, final int n3, final int n4) {
        final int c = this.c;
        final int c2 = c + 4;
        final int[] b = this.b;
        if (c2 >= b.length) {
            final int[] copy = Arrays.copyOf(b, b.length * 2);
            zzd.e((Object)copy, "copyOf(this, newSize)");
            this.b = copy;
        }
        final int[] b2 = this.b;
        b2[c + 0] = n;
        b2[c + 1] = n2;
        b2[c + 2] = n3;
        b2[c + 3] = n4;
        this.c = c2;
    }
    
    public final void f(final int n, final int n2) {
        if (n < n2) {
            int n3 = n - 3;
            int n6;
            for (int i = n; i < n2; i += 3, n3 = n6) {
                final int[] b = this.b;
                final int n4 = b[i];
                final int n5 = b[n2];
                final boolean b2 = n4 < n5 || (n4 == n5 && b[i + 1] <= b[n2 + 1]);
                n6 = n3;
                if (b2) {
                    n6 = n3 + 3;
                    this.g(n6, i);
                }
            }
            final int n7 = n3 + 3;
            this.g(n7, n2);
            this.f(n, n7 - 3);
            this.f(n7 + 3, n2);
        }
    }
    
    public final void g(int n, int n2) {
        final int[] b = this.b;
        q0b.c(b, n, n2);
        final int n3 = n + 1;
        final int n4 = n2 + 1;
        final int n5 = b[n3];
        b[n3] = b[n4];
        b[n4] = n5;
        n += 2;
        n2 += 2;
        final int n6 = b[n];
        b[n] = b[n2];
        b[n2] = n6;
    }
}
