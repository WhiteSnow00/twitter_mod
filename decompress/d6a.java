// 
// Decompiled by Procyon v0.6.0
// 

public final class d6a extends pue implements stb<q8c, vzv>
{
    public final l9r<Float> F0;
    public final l9r<Float> G0;
    public final l9r<ozt> H0;
    
    public d6a(final l9r<Float> f0, final l9r<Float> g0, final l9r<ozt> h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final q8c q8c = (q8c)o;
        e0e.f((Object)q8c, "$this$graphicsLayer");
        q8c.b(((Number)this.F0.getValue()).floatValue());
        q8c.l(((Number)this.G0.getValue()).floatValue());
        q8c.t(((Number)this.G0.getValue()).floatValue());
        q8c.T(((ozt)this.H0.getValue()).a);
        return vzv.a;
    }
}
