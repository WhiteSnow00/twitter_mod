// 
// Decompiled by Procyon v0.6.0
// 

public final class o2p extends gue implements rtb<ngp, oyv>
{
    public final /* synthetic */ boolean C0;
    public final /* synthetic */ boolean D0;
    public final /* synthetic */ boolean E0;
    public final /* synthetic */ v2p F0;
    public final /* synthetic */ yy6 G0;
    
    public o2p(final boolean c0, final boolean d0, final boolean e0, final v2p f0, final yy6 g0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ngp ngp = (ngp)o;
        zzd.f((Object)ngp, "$this$semantics");
        final a2p a2p = new a2p((otb)new m2p(this.F0), (otb)new n2p(this.F0), this.C0);
        if (this.D0) {
            kgp.n(ngp, a2p);
        }
        else {
            kgp.h(ngp, a2p);
        }
        if (this.E0) {
            kgp.e(ngp, (gub)new l2p(this.G0, this.D0, this.F0));
        }
        return oyv.a;
    }
}
