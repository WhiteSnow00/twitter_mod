// 
// Decompiled by Procyon v0.6.0
// 

public final class rgy
{
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Boolean k;
    
    public rgy(final String a, final String b, final long c, final long d, final long e, final long f, final long g, final Long h, final Long i, final Long j, final Boolean k) {
        iuk.z(a);
        iuk.z(b);
        final boolean b2 = true;
        iuk.p(c >= 0L);
        iuk.p(d >= 0L);
        iuk.p(e >= 0L);
        iuk.p(g >= 0L && b2);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final rgy a(final Long n, final Long n2, Boolean b) {
        if (b != null && !b) {
            b = null;
        }
        return new rgy(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, n, n2, b);
    }
    
    public final rgy b(final long n, final long n2) {
        return new rgy(this.a, this.b, this.c, this.d, this.e, this.f, n, n2, this.i, this.j, this.k);
    }
    
    public final rgy c(final long n) {
        return new rgy(this.a, this.b, this.c, this.d, this.e, n, this.g, this.h, this.i, this.j, this.k);
    }
}
