import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ach implements mwe
{
    public final long F0;
    
    public ach(final long f0) {
        this.F0 = f0;
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
        ach ach;
        if (o instanceof ach) {
            ach = (ach)o;
        }
        else {
            ach = null;
        }
        boolean b = false;
        if (ach == null) {
            return false;
        }
        final long f0 = this.F0;
        final long f2 = ach.F0;
        final v99.a companion = v99.Companion;
        if (f0 == f2) {
            b = true;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return v99.c(this.F0);
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
    public final arg u(final crg crg, final wqg wqg, final long n) {
        e0e.f((Object)crg, "$this$measure");
        final khk w = wqg.W(n);
        final int max = Math.max(w.F0, ((rp8)crg).S(v99.b(this.F0)));
        final int max2 = Math.max(w.G0, ((rp8)crg).S(v99.a(this.F0)));
        return crg.J(max, max2, (Map)m3a.F0, (stb)new stb<khk$a, vzv>(max, w, max2) {
            public final int F0;
            public final khk G0;
            public final int H0;
            
            public final Object invoke(final Object o) {
                final khk$a khk$a = (khk$a)o;
                e0e.f((Object)khk$a, "$this$layout");
                khk$a.d(khk$a, this.G0, jb2.B0((this.F0 - this.G0.F0) / 2.0f), jb2.B0((this.H0 - this.G0.G0) / 2.0f), 0.0f, 4, (Object)null);
                return vzv.a;
            }
        });
    }
    
    @Override
    public final int w(final b0e b0e, final jzd jzd, final int n) {
        return d1.b((mwe)this, b0e, jzd, n);
    }
}
