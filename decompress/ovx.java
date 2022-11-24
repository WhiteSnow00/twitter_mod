// 
// Decompiled by Procyon v0.6.0
// 

public final class ovx implements tcp
{
    public final long a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long[] f;
    
    public ovx(long n, final int b, long c, final long d, final long[] f) {
        this.a = n;
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = d;
        c = -1L;
        if (d == -1L) {
            n = c;
        }
        else {
            n += d;
        }
        this.e = n;
    }
    
    public final qcp$a d(long j) {
        if (!this.f()) {
            final scp scp = new scp(0L, this.a + this.b);
            return new qcp$a(scp, scp);
        }
        final long i = rnw.j(j, 0L, this.c);
        final double n = i * 100.0 / this.c;
        double n2 = 0.0;
        if (n > 0.0) {
            if (n >= 100.0) {
                n2 = 256.0;
            }
            else {
                final int n3 = (int)n;
                final long[] f = this.f;
                omi.r((Object)f);
                final long[] array = f;
                final double n4 = (double)array[n3];
                double n5;
                if (n3 == 99) {
                    n5 = 256.0;
                }
                else {
                    n5 = (double)array[n3 + 1];
                }
                n2 = n4 + (n5 - n4) * (n - n3);
            }
        }
        j = rnw.j(Math.round(n2 / 256.0 * this.d), (long)this.b, this.d - 1L);
        final scp scp2 = new scp(i, this.a + j);
        return new qcp$a(scp2, scp2);
    }
    
    @Override
    public final long e() {
        return this.e;
    }
    
    public final boolean f() {
        return this.f != null;
    }
    
    @Override
    public final long g(long c) {
        c -= this.a;
        if (this.f() && c > this.b) {
            final long[] f = this.f;
            omi.r((Object)f);
            final double n = c * 256.0 / this.d;
            final int f2 = rnw.f(f, (long)n, true);
            c = this.c;
            final long n2 = f2 * c / 100L;
            final long n3 = f[f2];
            final int n4 = f2 + 1;
            final long n5 = c * n4 / 100L;
            if (f2 == 99) {
                c = 256L;
            }
            else {
                c = f[n4];
            }
            double n6;
            if (n3 == c) {
                n6 = 0.0;
            }
            else {
                n6 = (n - n3) / (c - n3);
            }
            return Math.round(n6 * (n5 - n2)) + n2;
        }
        return 0L;
    }
    
    public final long h() {
        return this.c;
    }
}
