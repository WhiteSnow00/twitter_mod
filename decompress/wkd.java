// 
// Decompiled by Procyon v0.6.0
// 

public final class wkd implements ebp
{
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean d;
    
    public wkd(final long[] a, final long[] b, final long c) {
        ri4.k(a.length == b.length);
        final int length = b.length;
        final boolean d = length > 0;
        this.d = d;
        if (d && b[0] > 0L) {
            final int n = length + 1;
            final long[] a2 = new long[n];
            this.a = a2;
            final long[] b2 = new long[n];
            this.b = b2;
            System.arraycopy(a, 0, a2, 1, length);
            System.arraycopy(b, 0, b2, 1, length);
        }
        else {
            this.a = a;
            this.b = b;
        }
        this.c = c;
    }
    
    public final ebp$a d(final long n) {
        if (!this.d) {
            final gbp c = gbp.c;
            return new ebp$a(c, c);
        }
        int f = imw.f(this.b, n, true);
        final long[] b = this.b;
        final long n2 = b[f];
        final long[] a = this.a;
        final gbp gbp = new gbp(n2, a[f]);
        if (n2 != n && f != b.length - 1) {
            ++f;
            return new ebp$a(gbp, new gbp(b[f], a[f]));
        }
        return new ebp$a(gbp, gbp);
    }
    
    public final boolean f() {
        return this.d;
    }
    
    public final long h() {
        return this.c;
    }
}
