import java.util.Map;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iia extends qwe
{
    public final f0u$a<nud, jc0> F0;
    public final f0u$a<hud, jc0> G0;
    public final l9r<up3> H0;
    public final l9r<up3> I0;
    public final l9r<ex> J0;
    public ex K0;
    public final stb<f0u$b<a6a>, w0b<nud>> L0;
    
    public iia(final f0u$a<nud, jc0> f0, final f0u$a<hud, jc0> g0, final l9r<up3> h0, final l9r<up3> i0, final l9r<? extends ex> j0) {
        e0e.f((Object)f0, "sizeAnimation");
        e0e.f((Object)g0, "offsetAnimation");
        e0e.f((Object)h0, "expand");
        e0e.f((Object)i0, "shrink");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = (l9r<ex>)j0;
        this.L0 = new iia$e(this);
    }
    
    public final arg u(final crg crg, final wqg wqg, long n) {
        e0e.f((Object)crg, "$this$measure");
        final khk w = wqg.W(n);
        n = shw.f(w.F0, w.G0);
        final long a = ((f0u$a.a)this.F0.a((stb)this.L0, (stb)new iia$b(this, n))).getValue().a;
        final long a2 = ((f0u$a.a)this.G0.a((stb)iia$c.F0, (stb)new iia$d(this, n))).getValue().a;
        final ex k0 = this.K0;
        if (k0 != null) {
            n = k0.a(n, a, cwe.F0);
        }
        else {
            Objects.requireNonNull(hud.Companion);
            n = hud.b;
        }
        return crg.J((int)(a >> 32), nud.b(a), (Map)m3a.F0, (stb)new iia$a(w, n, a2));
    }
}
