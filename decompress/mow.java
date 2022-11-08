// 
// Decompiled by Procyon v0.6.0
// 

public final class mow implements hbp
{
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    
    public mow(final long[] a, final long[] b, final long c, final long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final ebp$a d(final long n) {
        int f = imw.f(this.a, n, true);
        final long[] a = this.a;
        final long n2 = a[f];
        final long[] b = this.b;
        final gbp gbp = new gbp(n2, b[f]);
        if (n2 < n && f != a.length - 1) {
            ++f;
            return new ebp$a(gbp, new gbp(a[f], b[f]));
        }
        return new ebp$a(gbp, gbp);
    }
    
    public final long e() {
        return this.d;
    }
    
    public final boolean f() {
        return true;
    }
    
    public final long g(final long n) {
        return this.a[imw.f(this.b, n, true)];
    }
    
    public final long h() {
        return this.c;
    }
}
