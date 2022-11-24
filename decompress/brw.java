// 
// Decompiled by Procyon v0.6.0
// 

public final class brw<V extends lc0> implements uqw<V>
{
    public final int a;
    public final int b;
    public final nq9 c;
    public final vqw<V> d;
    
    public brw(final int a, final int b, final nq9 c) {
        e0e.f((Object)c, "easing");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (vqw<V>)new vqw((i7b)new t7b(a, b, c));
    }
    
    public final boolean a() {
        return false;
    }
    
    @Override
    public final int b() {
        return this.b;
    }
    
    @Override
    public final int c() {
        return this.a;
    }
    
    public final lc0 d(final lc0 lc0, final lc0 lc2, final lc0 lc3) {
        return mqb.b((qqw)this, lc0, lc2, lc3);
    }
    
    public final V e(final long n, final V v, final V v2, final V v3) {
        e0e.f((Object)v, "initialValue");
        e0e.f((Object)v2, "targetValue");
        e0e.f((Object)v3, "initialVelocity");
        return (V)this.d.e(n, (lc0)v, (lc0)v2, (lc0)v3);
    }
    
    public final V f(final long n, final V v, final V v2, final V v3) {
        e0e.f((Object)v, "initialValue");
        e0e.f((Object)v2, "targetValue");
        e0e.f((Object)v3, "initialVelocity");
        return (V)this.d.f(n, (lc0)v, (lc0)v2, (lc0)v3);
    }
    
    public final long g(final lc0 lc0, final lc0 lc2, final lc0 lc3) {
        return tf8.c((uqw)this, lc0, lc2, lc3);
    }
}
