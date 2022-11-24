import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h90<S> implements f0u$b<S>
{
    public final f0u<S> a;
    public ex b;
    public final wwj c;
    public final Map<S, l9r<nud>> d;
    public l9r<nud> e;
    
    public h90(final f0u<S> a, final ex b, final cwe cwe) {
        e0e.f((Object)a, "transition");
        e0e.f((Object)b, "contentAlignment");
        e0e.f((Object)cwe, "layoutDirection");
        this.a = a;
        this.b = b;
        Objects.requireNonNull(nud.Companion);
        this.c = (wwj)zzz.W((Object)new nud(0L));
        this.d = new LinkedHashMap();
    }
    
    public final S a() {
        return (S)this.a.d().a();
    }
    
    public final S b() {
        return (S)this.a.d().b();
    }
    
    public final boolean c(final Object o, final Object o2) {
        return qee.f((f0u$b)this, o, o2);
    }
    
    public final class b extends qwe
    {
        public final f0u$a<nud, jc0> F0;
        public final l9r<keq> G0;
        public final h90<S> H0;
        
        public b(final h90 h0, final f0u$a<nud, jc0> f0, final l9r<? extends keq> g0) {
            e0e.f((Object)f0, "sizeAnimation");
            this.H0 = h0;
            this.F0 = f0;
            this.G0 = (l9r<keq>)g0;
        }
        
        public final arg u(final crg crg, final wqg wqg, long n) {
            e0e.f((Object)crg, "$this$measure");
            final khk w = wqg.W(n);
            final l9r a = this.F0.a((stb)new h90$b$b((h90)this.H0, this), (stb)new h90$b$c((h90)this.H0));
            final h90<S> h0 = this.H0;
            h0.e = (l9r<nud>)a;
            final ex b = h0.b;
            n = shw.f(w.F0, w.G0);
            final f0u$a.a<nud, V> a2 = (f0u$a.a<nud, V>)a;
            n = b.a(n, a2.getValue().a, cwe.F0);
            return crg.J((int)(a2.getValue().a >> 32), nud.b(a2.getValue().a), (Map)m3a.F0, (stb)new h90$b$a(w, n));
        }
    }
}
