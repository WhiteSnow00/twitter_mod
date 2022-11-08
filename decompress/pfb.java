// 
// Decompiled by Procyon v0.6.0
// 

public final class pfb extends wsd implements lkh, okh<pfb>
{
    public final rtb<kfb, oyv> D0;
    public final cwj E0;
    public final nll<pfb> F0;
    
    public pfb(final rtb<? super kfb, oyv> d0, final rtb<? super vsd, oyv> rtb) {
        final ssd$a a = ssd.a;
        zzd.f((Object)d0, "focusPropertiesScope");
        zzd.f((Object)a, "inspectorInfo");
        super((rtb)a);
        this.D0 = (rtb<kfb, oyv>)d0;
        this.E0 = (cwj)nkz.r((Object)null);
        this.F0 = mfb.a;
    }
    
    public final void A(final pkh pkh) {
        zzd.f((Object)pkh, "scope");
        ((nhq)this.E0).setValue((Object)pkh.g((kkh<pfb>)mfb.a));
    }
    
    public final Object X(final Object o, final gub gub) {
        zzd.f((Object)gub, "operation");
        return gub.invoke(o, (Object)this);
    }
    
    public final void b(final kfb kfb) {
        zzd.f((Object)kfb, "focusProperties");
        this.D0.invoke((Object)kfb);
        final pfb pfb = (pfb)((nhq)this.E0).getValue();
        if (pfb != null) {
            pfb.b(kfb);
        }
    }
    
    public final boolean equals(final Object o) {
        return o instanceof pfb && zzd.a((Object)this.D0, (Object)((pfb)o).D0);
    }
    
    public final nll<pfb> getKey() {
        return this.F0;
    }
    
    public final Object getValue() {
        return this;
    }
    
    public final int hashCode() {
        return this.D0.hashCode();
    }
}
