// 
// Decompiled by Procyon v0.6.0
// 

public final class kgp extends pue implements stb<v99, vzv>
{
    public final rp8 F0;
    public final fvh<nud> G0;
    
    public kgp(final rp8 f0, final fvh<nud> g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final long a = ((v99)o).a;
        final fvh<nud> g0 = this.G0;
        final rp8 f0 = this.F0;
        g0.setValue((Object)new nud(shw.f(f0.S(v99.b(a)), f0.S(v99.a(a)))));
        return vzv.a;
    }
}
