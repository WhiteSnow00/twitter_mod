// 
// Decompiled by Procyon v0.6.0
// 

public final class agn extends gue implements otb<oyv>
{
    public final /* synthetic */ yfn C0;
    public final /* synthetic */ tfn D0;
    
    public agn(final yfn c0, final tfn d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(0);
    }
    
    public final Object invoke() {
        final zml m0 = this.C0.M0;
        final tfn$c tfn$c = (tfn$c)this.D0;
        m0.onNext((Object)new wfn$m(tfn$c.a, tfn$c.b));
        return oyv.a;
    }
}
