import java.util.Map;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d1w extends wsd implements dwe
{
    public final float D0;
    public final float E0;
    
    public d1w(final float d0, final float e0) {
        super((rtb)ssd.a);
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final Object X(final Object o, final gub gub) {
        zzd.f((Object)gub, "operation");
        return gub.invoke(o, (Object)this);
    }
    
    public final int e(final wzd wzd, final ezd ezd, int s) {
        zzd.f((Object)wzd, "<this>");
        final int h = ezd.H(s);
        final float d0 = this.D0;
        Objects.requireNonNull(e99.Companion);
        if (!e99.b(d0, Float.NaN)) {
            s = ((dp8)wzd).S(this.D0);
        }
        else {
            s = 0;
        }
        int n = h;
        if (h < s) {
            n = s;
        }
        return n;
    }
    
    public final boolean equals(final Object o) {
        final boolean b = o instanceof d1w;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final float d0 = this.D0;
        final d1w d1w = (d1w)o;
        boolean b3 = b2;
        if (e99.b(d0, d1w.D0)) {
            b3 = b2;
            if (e99.b(this.E0, d1w.E0)) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public final int hashCode() {
        return Float.floatToIntBits(this.E0) + Float.floatToIntBits(this.D0) * 31;
    }
    
    public final int k(final wzd wzd, final ezd ezd, int s) {
        zzd.f((Object)wzd, "<this>");
        final int e = ezd.e(s);
        final float e2 = this.E0;
        Objects.requireNonNull(e99.Companion);
        if (!e99.b(e2, Float.NaN)) {
            s = ((dp8)wzd).S(this.E0);
        }
        else {
            s = 0;
        }
        int n = e;
        if (e < s) {
            n = s;
        }
        return n;
    }
    
    public final int m(final wzd wzd, final ezd ezd, int s) {
        zzd.f((Object)wzd, "<this>");
        final int x = ezd.x(s);
        final float e0 = this.E0;
        Objects.requireNonNull(e99.Companion);
        if (!e99.b(e0, Float.NaN)) {
            s = ((dp8)wzd).S(this.E0);
        }
        else {
            s = 0;
        }
        int n = x;
        if (x < s) {
            n = s;
        }
        return n;
    }
    
    public final hqg u(final jqg jqg, final dqg dqg, final long n) {
        zzd.f((Object)jqg, "$this$measure");
        final float d0 = this.D0;
        Objects.requireNonNull(e99.Companion);
        final boolean b = e99.b(d0, Float.NaN);
        final int n2 = 0;
        int j;
        if (!b && jj6.j(n) == 0) {
            final int s = ((dp8)jqg).S(this.D0);
            final int h = jj6.h(n);
            int n3;
            if ((n3 = s) > h) {
                n3 = h;
            }
            if ((j = n3) < 0) {
                j = 0;
            }
        }
        else {
            j = jj6.j(n);
        }
        final int h2 = jj6.h(n);
        int i;
        if (!e99.b(this.E0, Float.NaN) && jj6.i(n) == 0) {
            final int s2 = ((dp8)jqg).S(this.E0);
            final int g = jj6.g(n);
            if ((i = s2) > g) {
                i = g;
            }
            if (i < 0) {
                i = n2;
            }
        }
        else {
            i = jj6.i(n);
        }
        final qgk w = dqg.W(fk7.d(j, h2, i, jj6.g(n)));
        return jqg.J(w.C0, w.D0, (Map<ex, Integer>)a3a.C0, (rtb<? super qgk$a, oyv>)new rtb<qgk$a, oyv>() {
            public final Object invoke(final Object o) {
                final qgk$a qgk$a = (qgk$a)o;
                zzd.f((Object)qgk$a, "$this$layout");
                qgk$a.h(qgk$a, w, 0, 0, 0.0f, 4, (Object)null);
                return oyv.a;
            }
        });
    }
    
    public final int w(final wzd wzd, final ezd ezd, int s) {
        zzd.f((Object)wzd, "<this>");
        final int k = ezd.K(s);
        final float d0 = this.D0;
        Objects.requireNonNull(e99.Companion);
        if (!e99.b(d0, Float.NaN)) {
            s = ((dp8)wzd).S(this.D0);
        }
        else {
            s = 0;
        }
        int n = k;
        if (k < s) {
            n = s;
        }
        return n;
    }
}
