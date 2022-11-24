// 
// Decompiled by Procyon v0.6.0
// 

public class zi6 implements qcp
{
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;
    
    public zi6(long n, final long b, final int e, final int n2, final boolean g) {
        this.a = n;
        this.b = b;
        int c = n2;
        if (n2 == -1) {
            c = 1;
        }
        this.c = c;
        this.e = e;
        this.g = g;
        if (n == -1L) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        }
        else {
            n -= b;
            this.d = n;
            this.f = Math.max(0L, n) * 8L * 1000000L / e;
        }
    }
    
    public final long a(final long n) {
        return Math.max(0L, n - this.b) * 8L * 1000000L / this.e;
    }
    
    public final qcp$a d(long n) {
        final long d = this.d;
        if (d == -1L && !this.g) {
            final scp scp = new scp(0L, this.b);
            return new qcp$a(scp, scp);
        }
        final long n2 = this.e * n / 8000000L;
        final long n3 = this.c;
        long min = n2 / n3 * n3;
        if (d != -1L) {
            min = Math.min(min, d - n3);
        }
        final long n4 = this.b + Math.max(min, 0L);
        final long a = this.a(n4);
        final scp scp2 = new scp(a, n4);
        if (this.d != -1L && a < n) {
            final int c = this.c;
            if (c + n4 < this.a) {
                n = n4 + c;
                return new qcp$a(scp2, new scp(this.a(n), n));
            }
        }
        return new qcp$a(scp2, scp2);
    }
    
    public final boolean f() {
        return this.d != -1L || this.g;
    }
    
    public final long h() {
        return this.f;
    }
}
