import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yya extends wsd implements dwe
{
    public final int D0;
    public final float E0;
    
    public yya(final Object d0, final float e0, final rtb<? super vsd, oyv> rtb) {
        k1b.i((int)d0, "direction");
        super((rtb)rtb);
        this.D0 = (int)d0;
        this.E0 = e0;
    }
    
    public final Object X(final Object o, final gub gub) {
        zzd.f((Object)gub, "operation");
        return gub.invoke(o, (Object)this);
    }
    
    public final boolean equals(final Object o) {
        final boolean b = o instanceof yya;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final int d0 = this.D0;
            final yya yya = (yya)o;
            b3 = b2;
            if (d0 == yya.D0) {
                final boolean b4 = this.E0 == yya.E0;
                b3 = b2;
                if (b4) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    public final int hashCode() {
        return Float.floatToIntBits(this.E0) + nb0.D(this.D0) * 31;
    }
    
    public final hqg u(final jqg jqg, final dqg dqg, final long n) {
        zzd.f((Object)jqg, "$this$measure");
        int n2;
        int j;
        if (jj6.d(n) && this.D0 != 1) {
            j = (n2 = pf8.v(q0b.p(jj6.h(n) * this.E0), jj6.j(n), jj6.h(n)));
        }
        else {
            j = jj6.j(n);
            n2 = jj6.h(n);
        }
        int n3;
        int i;
        if (jj6.c(n) && this.D0 != 2) {
            i = (n3 = pf8.v(q0b.p(jj6.g(n) * this.E0), jj6.i(n), jj6.g(n)));
        }
        else {
            i = jj6.i(n);
            n3 = jj6.g(n);
        }
        final qgk w = dqg.W(fk7.d(j, n2, i, n3));
        return jqg.J(w.C0, w.D0, (Map<ex, Integer>)a3a.C0, (rtb<? super qgk$a, oyv>)new rtb<qgk$a, oyv>() {
            public final Object invoke(final Object o) {
                final qgk$a qgk$a = (qgk$a)o;
                zzd.f((Object)qgk$a, "$this$layout");
                qgk$a.h(qgk$a, w, 0, 0, 0.0f, 4, (Object)null);
                return oyv.a;
            }
        });
    }
}
