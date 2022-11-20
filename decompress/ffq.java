import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ffq extends tve
{
    public final mzt$a<ftd, ic0> D0;
    public final m8r<bfq> E0;
    public final m8r<bfq> F0;
    public final qsb<mzt$b<w4a>, uza<ftd>> G0;
    
    public ffq(final mzt$a<ftd, ic0> d0, final m8r<bfq> e0, final m8r<bfq> f0) {
        czd.f((Object)d0, "lazyAnimation");
        czd.f((Object)e0, "slideIn");
        czd.f((Object)f0, "slideOut");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = new ffq$b(this);
    }
    
    public final gqg u(final iqg iqg, final cqg cqg, long t) {
        czd.f((Object)iqg, "$this$measure");
        final wgk w = cqg.W(t);
        t = rp9.t(w.D0, w.E0);
        return iqg.J(w.D0, w.E0, (Map)k2a.D0, (qsb)new ffq$a(this, w, t));
    }
}
