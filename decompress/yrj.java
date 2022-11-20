import java.util.Map;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yrj extends asd implements pve
{
    public final float E0;
    public final float F0;
    public final float G0;
    public final float H0;
    public final boolean I0;
    
    public yrj(final float e0, final float f0, final float g0, final float h0) {
        super((qsb)wrd.a);
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        final boolean b = true;
        this.I0 = true;
        int n = 0;
        Label_0140: {
            Label_0137: {
                if (e0 < 0.0f) {
                    Objects.requireNonNull(m89.Companion);
                    if (!m89.b(e0, Float.NaN)) {
                        break Label_0137;
                    }
                }
                if (f0 < 0.0f) {
                    Objects.requireNonNull(m89.Companion);
                    if (!m89.b(f0, Float.NaN)) {
                        break Label_0137;
                    }
                }
                if (g0 < 0.0f) {
                    Objects.requireNonNull(m89.Companion);
                    if (!m89.b(g0, Float.NaN)) {
                        break Label_0137;
                    }
                }
                n = (b ? 1 : 0);
                if (h0 >= 0.0f) {
                    break Label_0140;
                }
                Objects.requireNonNull(m89.Companion);
                if (m89.b(h0, Float.NaN)) {
                    n = (b ? 1 : 0);
                    break Label_0140;
                }
            }
            n = 0;
        }
        if (n != 0) {
            return;
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
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
    
    public final boolean equals(final Object o) {
        yrj yrj;
        if (o instanceof yrj) {
            yrj = (yrj)o;
        }
        else {
            yrj = null;
        }
        final boolean b = false;
        if (yrj == null) {
            return false;
        }
        boolean b2 = b;
        if (m89.b(this.E0, yrj.E0)) {
            b2 = b;
            if (m89.b(this.F0, yrj.F0)) {
                b2 = b;
                if (m89.b(this.G0, yrj.G0)) {
                    b2 = b;
                    if (m89.b(this.H0, yrj.H0)) {
                        b2 = b;
                        if (this.I0 == yrj.I0) {
                            b2 = true;
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    public final int hashCode() {
        final int g = c0.g(this.H0, c0.g(this.G0, c0.g(this.F0, Float.floatToIntBits(this.E0) * 31, 31), 31), 31);
        int n;
        if (this.I0) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        return g + n;
    }
    
    public final int k(final zyd zyd, final hyd hyd, final int n) {
        return k0c.b((pve)this, zyd, hyd, n);
    }
    
    public final int m(final zyd zyd, final hyd hyd, final int n) {
        return k0c.e((pve)this, zyd, hyd, n);
    }
    
    public final gqg u(final iqg iqg, final cqg cqg, final long n) {
        czd.f((Object)iqg, "$this$measure");
        final int n2 = ((lo8)iqg).S(this.G0) + ((lo8)iqg).S(this.E0);
        final int n3 = ((lo8)iqg).S(this.H0) + ((lo8)iqg).S(this.F0);
        final wgk w = cqg.W(uoz.Q(n, -n2, -n3));
        return iqg.J(uoz.u(n, w.D0 + n2), uoz.t(n, w.E0 + n3), (Map)k2a.D0, (qsb)new qsb<wgk$a, fzv>(this, w, iqg) {
            public final yrj D0;
            public final wgk E0;
            public final iqg F0;
            
            public final Object invoke(final Object o) {
                final wgk$a wgk$a = (wgk$a)o;
                czd.f((Object)wgk$a, "$this$layout");
                final yrj d0 = this.D0;
                if (d0.I0) {
                    wgk$a.h(wgk$a, this.E0, ((lo8)this.F0).S(d0.E0), ((lo8)this.F0).S(this.D0.F0), 0.0f, 4, (Object)null);
                }
                else {
                    wgk$a.d(wgk$a, this.E0, ((lo8)this.F0).S(d0.E0), ((lo8)this.F0).S(this.D0.F0), 0.0f, 4, (Object)null);
                }
                return fzv.a;
            }
        });
    }
    
    public final int w(final zyd zyd, final hyd hyd, final int n) {
        return k0c.c((pve)this, zyd, hyd, n);
    }
}
