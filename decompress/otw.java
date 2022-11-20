import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class otw implements pve
{
    public final jhs D0;
    public final int E0;
    public final czt F0;
    public final nsb<zis> G0;
    
    public otw(final jhs d0, final int e0, final czt f0, final nsb<zis> g0) {
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
    
    public final int e(final zyd zyd, final hyd hyd, final int n) {
        return k0c.f((pve)this, zyd, hyd, n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof otw)) {
            return false;
        }
        final otw otw = (otw)o;
        return czd.a((Object)this.D0, (Object)otw.D0) && this.E0 == otw.E0 && czd.a((Object)this.F0, (Object)otw.F0) && czd.a((Object)this.G0, (Object)otw.G0);
    }
    
    @Override
    public final int hashCode() {
        return this.G0.hashCode() + (this.F0.hashCode() + (this.D0.hashCode() * 31 + this.E0) * 31) * 31;
    }
    
    public final int k(final zyd zyd, final hyd hyd, final int n) {
        return k0c.b((pve)this, zyd, hyd, n);
    }
    
    public final int m(final zyd zyd, final hyd hyd, final int n) {
        return k0c.e((pve)this, zyd, hyd, n);
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("VerticalScrollLayoutModifier(scrollerPosition=");
        j.append(this.D0);
        j.append(", cursorOffset=");
        j.append(this.E0);
        j.append(", transformedText=");
        j.append(this.F0);
        j.append(", textLayoutResultProvider=");
        j.append(this.G0);
        j.append(')');
        return j.toString();
    }
    
    public final gqg u(final iqg iqg, final cqg cqg, final long n) {
        czd.f((Object)iqg, "$this$measure");
        final wgk w = cqg.W(pi6.a(n, 0, 0, 0, Integer.MAX_VALUE, 7));
        final int min = Math.min(w.E0, pi6.g(n));
        return iqg.J(w.D0, min, (Map)k2a.D0, (qsb)new qsb<wgk$a, fzv>(iqg, this, w, min) {
            public final iqg D0;
            public final otw E0;
            public final wgk F0;
            public final int G0;
            
            public final Object invoke(final Object o) {
                final wgk$a wgk$a = (wgk$a)o;
                czd.f((Object)wgk$a, "$this$layout");
                final iqg d0 = this.D0;
                final otw e0 = this.E0;
                final int e2 = e0.E0;
                final czt f0 = e0.F0;
                final zis zis = (zis)e0.G0.invoke();
                yis a;
                if (zis != null) {
                    a = zis.a;
                }
                else {
                    a = null;
                }
                this.E0.D0.e(ooj.D0, eli.d((lo8)d0, e2, f0, a, false, this.F0.D0), this.G0, this.F0.E0);
                wgk$a.h(wgk$a, this.F0, 0, zyz.n(-this.E0.D0.b()), 0.0f, 4, (Object)null);
                return fzv.a;
            }
        });
    }
    
    public final int w(final zyd zyd, final hyd hyd, final int n) {
        return k0c.c((pve)this, zyd, hyd, n);
    }
}
