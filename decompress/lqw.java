// 
// Decompiled by Procyon v0.6.0
// 

public final class lqw<V extends kc0> implements fqw<V>
{
    public final int a;
    public final int b;
    public final jp9 c;
    public final gqw<V> d;
    
    public lqw(final int a, final int b, final jp9 c) {
        czd.f((Object)c, "easing");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (gqw<V>)new gqw((g6b)new s6b(a, b, c));
    }
    
    public final boolean a() {
        return false;
    }
    
    public final int b() {
        return this.b;
    }
    
    public final int c() {
        return this.a;
    }
    
    public final kc0 d(final kc0 kc0, final kc0 kc2, final kc0 kc3) {
        return oqf.a((bqw)this, kc0, kc2, kc3);
    }
    
    public final V e(final long n, final V v, final V v2, final V v3) {
        czd.f((Object)v, "initialValue");
        czd.f((Object)v2, "targetValue");
        czd.f((Object)v3, "initialVelocity");
        return (V)this.d.e(n, (kc0)v, (kc0)v2, (kc0)v3);
    }
    
    public final V f(final long n, final V v, final V v2, final V v3) {
        czd.f((Object)v, "initialValue");
        czd.f((Object)v2, "targetValue");
        czd.f((Object)v3, "initialVelocity");
        return (V)this.d.f(n, (kc0)v, (kc0)v2, (kc0)v3);
    }
    
    public final long g(final kc0 kc0, final kc0 kc2, final kc0 kc3) {
        return hee.a((fqw)this, kc0, kc2, kc3);
    }
}
