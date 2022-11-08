// 
// Decompiled by Procyon v0.6.0
// 

public final class i76 extends wsd implements b
{
    public final jub<jkh, m76, Integer, jkh> D0;
    
    public i76(final rtb<? super vsd, oyv> rtb, final jub<? super jkh, ? super m76, ? super Integer, ? extends jkh> d0) {
        zzd.f((Object)rtb, "inspectorInfo");
        zzd.f((Object)d0, "factory");
        super((rtb)rtb);
        this.D0 = (jub<jkh, m76, Integer, jkh>)d0;
    }
    
    public final Object X(final Object o, final gub gub) {
        zzd.f((Object)gub, "operation");
        return gub.invoke(o, (Object)this);
    }
}
