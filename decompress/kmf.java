// 
// Decompiled by Procyon v0.6.0
// 

public final class kmf implements fda
{
    public final t5j F0;
    public final k9x G0;
    
    public kmf(final t5j f0, final k9x g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final t5j v0() {
        final t5j f0 = this.F0;
        final k9x g0 = this.G0;
        e0e.f((Object)f0, "$observable");
        e0e.f((Object)g0, "$viewLifecycle");
        final t5j compose = f0.compose((bcj)new dbf(g0));
        e0e.e((Object)compose, "observable.compose(Lifec\u2026ansformer(viewLifecycle))");
        return compose;
    }
}
