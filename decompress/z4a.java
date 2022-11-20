// 
// Decompiled by Procyon v0.6.0
// 

public final class z4a extends ste implements qsb<o7c, fzv>
{
    public final m8r<Float> D0;
    public final m8r<Float> E0;
    public final m8r<vyt> F0;
    
    public z4a(final m8r<Float> d0, final m8r<Float> e0, final m8r<vyt> f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final o7c o7c = (o7c)o;
        czd.f((Object)o7c, "$this$graphicsLayer");
        o7c.b(((Number)this.D0.getValue()).floatValue());
        o7c.l(((Number)this.E0.getValue()).floatValue());
        o7c.t(((Number)this.E0.getValue()).floatValue());
        o7c.T(((vyt)this.F0.getValue()).a);
        return fzv.a;
    }
}
