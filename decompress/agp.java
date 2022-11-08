import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agp extends wsd implements zfp
{
    public static final agp.agp$a Companion;
    public static AtomicInteger E0;
    public final xfp D0;
    
    static {
        Companion = new agp.agp$a();
        agp.E0 = new AtomicInteger(0);
    }
    
    public agp(final boolean d0, final boolean e0, final rtb<? super ngp, oyv> rtb, final rtb<? super vsd, oyv> rtb2) {
        zzd.f((Object)rtb, "properties");
        zzd.f((Object)rtb2, "inspectorInfo");
        super((rtb)rtb2);
        final xfp d2 = new xfp();
        d2.D0 = d0;
        d2.E0 = e0;
        rtb.invoke((Object)d2);
        this.D0 = d2;
    }
    
    public final Object X(final Object o, final gub gub) {
        zzd.f((Object)gub, "operation");
        return gub.invoke(o, (Object)this);
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof agp && zzd.a((Object)this.D0, (Object)((agp)o).D0));
    }
    
    public final int hashCode() {
        return this.D0.hashCode();
    }
    
    public final xfp z() {
        return this.D0;
    }
}
