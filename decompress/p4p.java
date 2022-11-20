import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p4p implements pve
{
    public final n3p D0;
    public final boolean E0;
    public final boolean F0;
    public final vqj G0;
    
    public p4p(final n3p d0, final boolean e0, final boolean f0, final vqj g0) {
        czd.f((Object)d0, "scrollerState");
        czd.f((Object)g0, "overscrollEffect");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final okh E(final okh okh) {
        return k6e.a((okh)this, okh);
    }
    
    public final boolean H(final qsb qsb) {
        return da8.a((okh$b)this, qsb);
    }
    
    public final Object X(final Object o, final ftb ftb) {
        czd.f((Object)ftb, "operation");
        return ftb.invoke(o, (Object)this);
    }
    
    public final int e(final zyd zyd, final hyd hyd, int n) {
        czd.f((Object)zyd, "<this>");
        if (this.F0) {
            n = hyd.H(Integer.MAX_VALUE);
        }
        else {
            n = hyd.H(n);
        }
        return n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof p4p)) {
            return false;
        }
        final p4p p4p = (p4p)o;
        return czd.a((Object)this.D0, (Object)p4p.D0) && this.E0 == p4p.E0 && this.F0 == p4p.F0 && czd.a((Object)this.G0, (Object)p4p.G0);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.D0.hashCode();
        final int e0 = this.E0 ? 1 : 0;
        int n = 1;
        int n2 = e0;
        if (e0 != 0) {
            n2 = 1;
        }
        final int f0 = this.F0 ? 1 : 0;
        if (f0 == 0) {
            n = f0;
        }
        return this.G0.hashCode() + ((hashCode * 31 + n2) * 31 + n) * 31;
    }
    
    public final int k(final zyd zyd, final hyd hyd, int n) {
        czd.f((Object)zyd, "<this>");
        if (this.F0) {
            n = hyd.e(n);
        }
        else {
            n = hyd.e(Integer.MAX_VALUE);
        }
        return n;
    }
    
    public final int m(final zyd zyd, final hyd hyd, int n) {
        czd.f((Object)zyd, "<this>");
        if (this.F0) {
            n = hyd.x(n);
        }
        else {
            n = hyd.x(Integer.MAX_VALUE);
        }
        return n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("ScrollingLayoutModifier(scrollerState=");
        j.append(this.D0);
        j.append(", isReversed=");
        j.append(this.E0);
        j.append(", isVertical=");
        j.append(this.F0);
        j.append(", overscrollEffect=");
        j.append(this.G0);
        j.append(')');
        return j.toString();
    }
    
    public final gqg u(final iqg iqg, final cqg cqg, final long n) {
        czd.f((Object)iqg, "$this$measure");
        ooj ooj;
        if (this.F0) {
            ooj = ooj.D0;
        }
        else {
            ooj = ooj.E0;
        }
        z6q.d(n, ooj);
        int g;
        if (this.F0) {
            g = Integer.MAX_VALUE;
        }
        else {
            g = pi6.g(n);
        }
        int h;
        if (this.F0) {
            h = pi6.h(n);
        }
        else {
            h = Integer.MAX_VALUE;
        }
        final wgk w = cqg.W(pi6.a(n, 0, h, 0, g, 5));
        final int d0 = w.D0;
        final int h2 = pi6.h(n);
        int n2 = d0;
        if (d0 > h2) {
            n2 = h2;
        }
        final int e0 = w.E0;
        final int g2 = pi6.g(n);
        int n3;
        if ((n3 = e0) > g2) {
            n3 = g2;
        }
        int n4 = w.E0 - n3;
        final int d2 = w.D0;
        if (!this.F0) {
            n4 = d2 - n2;
        }
        this.G0.setEnabled(n4 != 0);
        final n3p d3 = this.D0;
        d3.c.setValue((Object)n4);
        if (d3.d() > n4) {
            d3.a.setValue((Object)n4);
        }
        return iqg.J(n2, n3, (Map)k2a.D0, (qsb)new qsb<wgk$a, fzv>(this, n4, w) {
            public final p4p D0;
            public final int E0;
            public final wgk F0;
            
            public final Object invoke(final Object o) {
                final wgk$a wgk$a = (wgk$a)o;
                czd.f((Object)wgk$a, "$this$layout");
                final int p = rrz.p(this.D0.D0.d(), 0, this.E0);
                final p4p d0 = this.D0;
                int n;
                if (d0.E0) {
                    n = p - this.E0;
                }
                else {
                    n = -p;
                }
                final boolean f0 = d0.F0;
                int n2;
                if (f0) {
                    n2 = 0;
                }
                else {
                    n2 = n;
                }
                if (!f0) {
                    n = 0;
                }
                wgk$a.i(wgk$a, this.F0, n2, n, 0.0f, (qsb)null, 12, (Object)null);
                return fzv.a;
            }
        });
    }
    
    public final int w(final zyd zyd, final hyd hyd, int n) {
        czd.f((Object)zyd, "<this>");
        if (this.F0) {
            n = hyd.K(Integer.MAX_VALUE);
        }
        else {
            n = hyd.K(n);
        }
        return n;
    }
}
