// 
// Decompiled by Procyon v0.6.0
// 

public final class lpw<V extends oc0> implements gpw
{
    public final pc0 a;
    public V b;
    public V c;
    public V d;
    
    public lpw(final j7b j7b) {
        zzd.f((Object)j7b, "anim");
        final pc0 a = new pc0() {
            @Override
            public final j7b get(final int n) {
                return j7b;
            }
        };
        this.a = a;
    }
    
    public lpw(final pc0 a) {
        this.a = a;
    }
    
    @Override
    public final V d(final V v, final V v2, final V v3) {
        zzd.f((Object)v, "initialValue");
        zzd.f((Object)v2, "targetValue");
        if (this.d == null) {
            this.d = (V)dml.h0((oc0)v3);
        }
        int i = 0;
        final oc0 d = this.d;
        if (d == null) {
            zzd.m("endVelocityVector");
            throw null;
        }
        while (i < d.b()) {
            final oc0 d2 = this.d;
            if (d2 == null) {
                zzd.m("endVelocityVector");
                throw null;
            }
            d2.e(i, this.a.get(i).b(v.a(i), v2.a(i), v3.a(i)));
            ++i;
        }
        final oc0 d3 = this.d;
        if (d3 != null) {
            return (V)d3;
        }
        zzd.m("endVelocityVector");
        throw null;
    }
    
    @Override
    public final V e(final long n, final V v, final V v2, final V v3) {
        zzd.f((Object)v, "initialValue");
        zzd.f((Object)v2, "targetValue");
        zzd.f((Object)v3, "initialVelocity");
        if (this.c == null) {
            this.c = (V)dml.h0((oc0)v3);
        }
        int i = 0;
        final oc0 c = this.c;
        if (c == null) {
            zzd.m("velocityVector");
            throw null;
        }
        while (i < c.b()) {
            final oc0 c2 = this.c;
            if (c2 == null) {
                zzd.m("velocityVector");
                throw null;
            }
            c2.e(i, this.a.get(i).d(n, v.a(i), v2.a(i), v3.a(i)));
            ++i;
        }
        final oc0 c3 = this.c;
        if (c3 != null) {
            return (V)c3;
        }
        zzd.m("velocityVector");
        throw null;
    }
    
    @Override
    public final V f(final long n, final V v, final V v2, final V v3) {
        zzd.f((Object)v, "initialValue");
        zzd.f((Object)v2, "targetValue");
        zzd.f((Object)v3, "initialVelocity");
        if (this.b == null) {
            this.b = (V)dml.h0((oc0)v);
        }
        int i = 0;
        final oc0 b = this.b;
        if (b == null) {
            zzd.m("valueVector");
            throw null;
        }
        while (i < b.b()) {
            final oc0 b2 = this.b;
            if (b2 == null) {
                zzd.m("valueVector");
                throw null;
            }
            b2.e(i, this.a.get(i).c(n, v.a(i), v2.a(i), v3.a(i)));
            ++i;
        }
        final oc0 b3 = this.b;
        if (b3 != null) {
            return (V)b3;
        }
        zzd.m("valueVector");
        throw null;
    }
    
    @Override
    public final long g(final V v, final V v2, final V v3) {
        zzd.f((Object)v, "initialValue");
        zzd.f((Object)v2, "targetValue");
        final bud j = ((dud)pf8.v0(0, v.b())).j();
        long max = 0L;
        while (((eud)j).E0) {
            final int a = j.a();
            max = Math.max(max, this.a.get(a).e(v.a(a), v2.a(a), v3.a(a)));
        }
        return max;
    }
}
