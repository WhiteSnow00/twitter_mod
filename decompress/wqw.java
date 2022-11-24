// 
// Decompiled by Procyon v0.6.0
// 

public final class wqw<V extends lc0> implements tqw<V>
{
    public final n7b a;
    public V b;
    public V c;
    public V d;
    public final float e;
    
    public wqw(final n7b a) {
        e0e.f((Object)a, "floatDecaySpec");
        (this.a = a).a();
        this.e = 0.0f;
    }
    
    public final float a() {
        return this.e;
    }
    
    public final V b(final long n, final V v, final V v2) {
        e0e.f((Object)v, "initialValue");
        e0e.f((Object)v2, "initialVelocity");
        if (this.c == null) {
            this.c = (V)kqe.a0(v);
        }
        int i = 0;
        final lc0 c = this.c;
        if (c == null) {
            e0e.m("velocityVector");
            throw null;
        }
        while (i < c.b()) {
            final lc0 c2 = this.c;
            if (c2 == null) {
                e0e.m("velocityVector");
                throw null;
            }
            final n7b a = this.a;
            v.a(i);
            c2.e(i, a.d(n, v2.a(i)));
            ++i;
        }
        final lc0 c3 = this.c;
        if (c3 != null) {
            return (V)c3;
        }
        e0e.m("velocityVector");
        throw null;
    }
    
    public final V c(final long n, final V v, final V v2) {
        e0e.f((Object)v, "initialValue");
        e0e.f((Object)v2, "initialVelocity");
        if (this.b == null) {
            this.b = (V)kqe.a0(v);
        }
        int i = 0;
        final lc0 b = this.b;
        if (b == null) {
            e0e.m("valueVector");
            throw null;
        }
        while (i < b.b()) {
            final lc0 b2 = this.b;
            if (b2 == null) {
                e0e.m("valueVector");
                throw null;
            }
            b2.e(i, this.a.e(n, v.a(i), v2.a(i)));
            ++i;
        }
        final lc0 b3 = this.b;
        if (b3 != null) {
            return (V)b3;
        }
        e0e.m("valueVector");
        throw null;
    }
    
    public final V d(final V v, final V v2) {
        e0e.f((Object)v, "initialValue");
        e0e.f((Object)v2, "initialVelocity");
        if (this.d == null) {
            this.d = (V)kqe.a0(v);
        }
        int i = 0;
        final lc0 d = this.d;
        if (d == null) {
            e0e.m("targetVector");
            throw null;
        }
        while (i < d.b()) {
            final lc0 d2 = this.d;
            if (d2 == null) {
                e0e.m("targetVector");
                throw null;
            }
            d2.e(i, this.a.c(v.a(i), v2.a(i)));
            ++i;
        }
        final lc0 d3 = this.d;
        if (d3 != null) {
            return (V)d3;
        }
        e0e.m("targetVector");
        throw null;
    }
    
    public final long e(final V v, final V v2) {
        e0e.f((Object)v, "initialValue");
        e0e.f((Object)v2, "initialVelocity");
        if (this.c == null) {
            this.c = (V)kqe.a0(v);
        }
        int i = 0;
        final lc0 c = this.c;
        if (c != null) {
            final int b = c.b();
            long max = 0L;
            while (i < b) {
                final n7b a = this.a;
                v.a(i);
                max = Math.max(max, a.b(v2.a(i)));
                ++i;
            }
            return max;
        }
        e0e.m("velocityVector");
        throw null;
    }
}
