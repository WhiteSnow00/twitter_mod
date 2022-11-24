// 
// Decompiled by Procyon v0.6.0
// 

public final class v2f
{
    public final p1f a;
    public final v0f b;
    public final frg c;
    public final long d;
    
    public v2f(final long n, final boolean b, final p1f a, final v0f b2, final frg c) {
        this.a = a;
        this.b = b2;
        this.c = c;
        int g = Integer.MAX_VALUE;
        int h;
        if (b) {
            h = vj6.h(n);
        }
        else {
            h = Integer.MAX_VALUE;
        }
        if (!b) {
            g = vj6.g(n);
        }
        this.d = xd.m(h, g, 5);
    }
    
    public final t2f a(final int n) {
        return this.c.a(n, ((q0f)this.a).g(n), this.b.L(n, this.d));
    }
}
