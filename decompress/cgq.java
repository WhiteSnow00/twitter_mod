import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgq extends qwe
{
    public final f0u$a<hud, jc0> F0;
    public final l9r<yfq> G0;
    public final l9r<yfq> H0;
    public final stb<f0u$b<a6a>, w0b<hud>> I0;
    
    public cgq(final f0u$a<hud, jc0> f0, final l9r<yfq> g0, final l9r<yfq> h0) {
        e0e.f((Object)f0, "lazyAnimation");
        e0e.f((Object)g0, "slideIn");
        e0e.f((Object)h0, "slideOut");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = new stb<f0u$b<a6a>, w0b<hud>>(this) {
            public final cgq F0;
            
            public final Object invoke(final Object o) {
                final f0u$b f0u$b = (f0u$b)o;
                e0e.f((Object)f0u$b, "$this$null");
                final a6a f0 = a6a.F0;
                final a6a g0 = a6a.G0;
                Object o2;
                if (f0u$b.c((Object)f0, (Object)g0)) {
                    final yfq yfq = (yfq)this.F0.G0.getValue();
                    if (yfq == null || (o2 = yfq.b) == null) {
                        o2 = b6a.d;
                    }
                }
                else if (f0u$b.c((Object)g0, (Object)a6a.H0)) {
                    final yfq yfq2 = (yfq)this.F0.H0.getValue();
                    if (yfq2 == null || (o2 = yfq2.b) == null) {
                        o2 = b6a.d;
                    }
                }
                else {
                    o2 = b6a.d;
                }
                return o2;
            }
        };
    }
    
    public final arg u(final crg crg, final wqg wqg, long f) {
        e0e.f((Object)crg, "$this$measure");
        final khk w = wqg.W(f);
        f = shw.f(w.F0, w.G0);
        return crg.J(w.F0, w.G0, (Map)m3a.F0, (stb)new stb<khk$a, vzv>(this, w, f) {
            public final cgq F0;
            public final khk G0;
            public final long H0;
            
            public final Object invoke(final Object o) {
                final khk$a khk$a = (khk$a)o;
                e0e.f((Object)khk$a, "$this$layout");
                final cgq f0 = this.F0;
                khk$a.m(khk$a, this.G0, ((f0u$a.a<hud, V>)f0.F0.a((stb)f0.I0, (stb)new bgq(f0, this.H0))).getValue().a, 0.0f, (stb)null, 6, (Object)null);
                return vzv.a;
            }
        });
    }
}
