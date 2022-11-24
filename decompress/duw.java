import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class duw implements mwe
{
    public final bis F0;
    public final int G0;
    public final vzt H0;
    public final ptb<rjs> I0;
    
    public duw(final bis f0, final int g0, final vzt h0, final ptb<rjs> i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final dlh E(final dlh dlh) {
        return z9a.i((dlh)this, dlh);
    }
    
    public final boolean H(final stb stb) {
        return k5b.a((b)this, stb);
    }
    
    public final Object X(final Object o, final hub hub) {
        e0e.f((Object)hub, "operation");
        return hub.invoke(o, (Object)this);
    }
    
    @Override
    public final int e(final b0e b0e, final jzd jzd, final int n) {
        return d1.d((mwe)this, b0e, jzd, n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof duw)) {
            return false;
        }
        final duw duw = (duw)o;
        return e0e.a((Object)this.F0, (Object)duw.F0) && this.G0 == duw.G0 && e0e.a((Object)this.H0, (Object)duw.H0) && e0e.a((Object)this.I0, (Object)duw.I0);
    }
    
    @Override
    public final int hashCode() {
        return this.I0.hashCode() + (this.H0.hashCode() + (this.F0.hashCode() * 31 + this.G0) * 31) * 31;
    }
    
    @Override
    public final int k(final b0e b0e, final jzd jzd, final int n) {
        return d1.a((mwe)this, b0e, jzd, n);
    }
    
    @Override
    public final int m(final b0e b0e, final jzd jzd, final int n) {
        return d1.c((mwe)this, b0e, jzd, n);
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("VerticalScrollLayoutModifier(scrollerPosition=");
        f.append(this.F0);
        f.append(", cursorOffset=");
        f.append(this.G0);
        f.append(", transformedText=");
        f.append(this.H0);
        f.append(", textLayoutResultProvider=");
        f.append(this.I0);
        f.append(')');
        return f.toString();
    }
    
    @Override
    public final arg u(final crg crg, final wqg wqg, final long n) {
        e0e.f((Object)crg, "$this$measure");
        final khk w = wqg.W(vj6.a(n, 0, 0, 0, Integer.MAX_VALUE, 7));
        final int min = Math.min(w.G0, vj6.g(n));
        return crg.J(w.F0, min, (Map)m3a.F0, (stb)new stb<khk$a, vzv>(crg, this, w, min) {
            public final crg F0;
            public final duw G0;
            public final khk H0;
            public final int I0;
            
            public final Object invoke(final Object o) {
                final khk$a khk$a = (khk$a)o;
                e0e.f((Object)khk$a, "$this$layout");
                final crg f0 = this.F0;
                final duw g0 = this.G0;
                final int g2 = g0.G0;
                final vzt h0 = g0.H0;
                final rjs rjs = (rjs)g0.I0.invoke();
                qjs a;
                if (rjs != null) {
                    a = rjs.a;
                }
                else {
                    a = null;
                }
                this.G0.F0.e(dpj.F0, d4j.l((rp8)f0, g2, h0, a, false, this.H0.F0), this.I0, this.H0.G0);
                khk$a.h(khk$a, this.H0, 0, jb2.B0(-this.G0.F0.b()), 0.0f, 4, (Object)null);
                return vzv.a;
            }
        });
    }
    
    @Override
    public final int w(final b0e b0e, final jzd jzd, final int n) {
        return d1.b((mwe)this, b0e, jzd, n);
    }
}
