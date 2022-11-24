// 
// Decompiled by Procyon v0.6.0
// 

public final class zqw<V extends lc0> implements uqw<V>
{
    public final int a;
    
    public zqw(final int a) {
        this.a = a;
    }
    
    public final boolean a() {
        return false;
    }
    
    @Override
    public final int b() {
        return this.a;
    }
    
    @Override
    public final int c() {
        return 0;
    }
    
    public final lc0 d(final lc0 lc0, final lc0 lc2, final lc0 lc3) {
        return mqb.b((qqw)this, lc0, lc2, lc3);
    }
    
    public final V e(final long n, final V v, final V v2, final V v3) {
        e0e.f((Object)v, "initialValue");
        e0e.f((Object)v2, "targetValue");
        e0e.f((Object)v3, "initialVelocity");
        return v3;
    }
    
    public final V f(final long n, final V v, final V v2, final V v3) {
        e0e.f((Object)v, "initialValue");
        e0e.f((Object)v2, "targetValue");
        e0e.f((Object)v3, "initialVelocity");
        if (n < this.a * 1000000L) {
            return v;
        }
        return v2;
    }
    
    public final long g(final lc0 lc0, final lc0 lc2, final lc0 lc3) {
        return tf8.c((uqw)this, lc0, lc2, lc3);
    }
}
