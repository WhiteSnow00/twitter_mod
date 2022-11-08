import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vbg
{
    public int a;
    public long[] b;
    
    public vbg() {
        this.b = new long[32];
    }
    
    public final void a(final long n) {
        final int a = this.a;
        final long[] b = this.b;
        if (a == b.length) {
            this.b = Arrays.copyOf(b, a * 2);
        }
        this.b[this.a++] = n;
    }
    
    public final long b(final int n) {
        if (n >= 0 && n < this.a) {
            return this.b[n];
        }
        final int a = this.a;
        final StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(n);
        sb.append(", size is ");
        sb.append(a);
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
