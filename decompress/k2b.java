// 
// Decompiled by Procyon v0.6.0
// 

public final class k2b implements qcp
{
    public final l2b a;
    public final long b;
    
    public k2b(final l2b a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public final qcp$a d(long n) {
        omi.r((Object)this.a.k);
        final l2b a = this.a;
        final l2b$a k = a.k;
        final long[] a2 = k.a;
        final long[] b = k.b;
        int f = rnw.f(a2, a.f(n), false);
        long n2 = 0L;
        long n3;
        if (f == -1) {
            n3 = 0L;
        }
        else {
            n3 = a2[f];
        }
        if (f != -1) {
            n2 = b[f];
        }
        final long n4 = this.a.e;
        final long n5 = n3 * 1000000L / n4;
        final long b2 = this.b;
        final scp scp = new scp(n5, n2 + b2);
        if (n5 != n && f != a2.length - 1) {
            ++f;
            final long n6 = a2[f];
            n = b[f];
            return new qcp$a(scp, new scp(n6 * 1000000L / n4, b2 + n));
        }
        return new qcp$a(scp, scp);
    }
    
    public final boolean f() {
        return true;
    }
    
    public final long h() {
        return this.a.c();
    }
}
