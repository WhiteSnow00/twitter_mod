import com.twitter.model.liveevent.LiveEventConfiguration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class awf extends ste implements qsb<Long, lcq<? extends yvf>>
{
    public final zvf D0;
    public final LiveEventConfiguration E0;
    
    public awf(final zvf d0, final LiveEventConfiguration e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        czd.f((Object)o, "it");
        return this.D0.F0.a(this.E0);
    }
}
