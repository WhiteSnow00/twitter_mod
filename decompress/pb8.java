// 
// Decompiled by Procyon v0.6.0
// 

public final class pb8<T, V extends oc0> implements hb0<T, V>
{
    public final jpw<V> a;
    public final chv<T, V> b;
    public final T c;
    public final V d;
    public final V e;
    public final V f;
    public final T g;
    public final long h;
    
    public pb8(final qb8<T> qb8, final chv<T, V> b, final T c, final V v) {
        zzd.f((Object)qb8, "animationSpec");
        zzd.f((Object)b, "typeConverter");
        zzd.f((Object)v, "initialVelocityVector");
        final jpw a = qb8.a((chv)b);
        zzd.f((Object)a, "animationSpec");
        this.a = a;
        this.b = b;
        this.c = c;
        final oc0 d = (oc0)b.a().invoke((Object)c);
        this.d = (V)d;
        this.e = (V)dml.q((oc0)v);
        this.g = (T)b.b().invoke((Object)a.d(d, v));
        final long e = a.e(d, v);
        this.h = e;
        final oc0 q = dml.q((oc0)a.b(e, d, v));
        this.f = (V)q;
        for (int i = 0; i < q.b(); ++i) {
            final oc0 f = this.f;
            f.e(i, pf8.u(f.a(i), -this.a.a(), this.a.a()));
        }
    }
    
    @Override
    public final boolean a() {
        return false;
    }
    
    @Override
    public final V b(final long n) {
        if (!this.c(n)) {
            return this.a.b(n, this.d, this.e);
        }
        return this.f;
    }
    
    @Override
    public final boolean c(final long n) {
        return n >= this.d();
    }
    
    @Override
    public final long d() {
        return this.h;
    }
    
    @Override
    public final chv<T, V> e() {
        return this.b;
    }
    
    @Override
    public final T f(final long n) {
        if (!this.c(n)) {
            return (T)this.b.b().invoke((Object)this.a.c(n, this.d, this.e));
        }
        return this.g;
    }
    
    @Override
    public final T g() {
        return this.g;
    }
}
