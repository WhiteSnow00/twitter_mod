import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class epp extends ste implements qsb<bqp, bqp>
{
    public final List<oap> D0;
    public final String E0;
    
    public epp(final List<oap> d0, final String e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        czd.f((Object)o, "$this$setState");
        final List<oap> d0 = this.D0;
        final String e0 = this.E0;
        czd.f((Object)d0, "results");
        czd.f((Object)e0, "query");
        return new bqp(d0, e0);
    }
}
