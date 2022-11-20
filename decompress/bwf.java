// 
// Decompiled by Procyon v0.6.0
// 

public final class bwf extends ste implements qsb<yvf, lcq<? extends ztf>>
{
    public final zvf D0;
    
    public bwf(final zvf d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final yvf yvf = (yvf)o;
        czd.f((Object)yvf, "request");
        final buf g0 = this.D0.G0;
        final mvf b = yvf.b;
        czd.e((Object)b, "request.liveEventMetadata");
        final ynj b2 = ynj.b;
        final int a = c5j.a;
        return g0.d(b, b2);
    }
}
