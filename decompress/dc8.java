// 
// Decompiled by Procyon v0.6.0
// 

public final class dc8<T, V extends lc0> implements gb0<T, V>
{
    public final tqw<V> a;
    public final liv<T, V> b;
    public final T c;
    public final V d;
    public final V e;
    public final V f;
    public final T g;
    public final long h;
    
    public dc8(final ec8<T> ec8, final liv<T, V> b, final T c, final V v) {
        e0e.f((Object)ec8, "animationSpec");
        e0e.f((Object)b, "typeConverter");
        e0e.f((Object)v, "initialVelocityVector");
        final tqw a = ec8.a((liv)b);
        e0e.f((Object)a, "animationSpec");
        this.a = (tqw<V>)a;
        this.b = b;
        this.c = c;
        final lc0 d = (lc0)b.a().invoke((Object)c);
        this.d = (V)d;
        this.e = (V)kqe.E(v);
        this.g = (T)b.b().invoke((Object)a.d(d, (lc0)v));
        final long e = a.e(d, (lc0)v);
        this.h = e;
        final lc0 e2 = kqe.E(a.b(e, d, (lc0)v));
        this.f = (V)e2;
        for (int i = 0; i < e2.b(); ++i) {
            final lc0 f = this.f;
            f.e(i, jb2.E(f.a(i), -this.a.a(), this.a.a()));
        }
    }
    
    public final boolean a() {
        return false;
    }
    
    public final V b(final long n) {
        if (!this.c(n)) {
            return (V)this.a.b(n, (lc0)this.d, (lc0)this.e);
        }
        return this.f;
    }
    
    public final boolean c(final long n) {
        return n >= this.d();
    }
    
    public final long d() {
        return this.h;
    }
    
    public final liv<T, V> e() {
        return this.b;
    }
    
    public final T f(final long n) {
        if (!this.c(n)) {
            return (T)this.b.b().invoke((Object)this.a.c(n, (lc0)this.d, (lc0)this.e));
        }
        return this.g;
    }
    
    public final T g() {
        return this.g;
    }
}
