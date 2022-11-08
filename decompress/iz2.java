import com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel$fetchMapsImageUrlAndUpdatePreview$2$1", f = "BusinessInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class iz2 extends xzr implements gub<Throwable, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessInfoViewModel C0;
    
    public iz2(final BusinessInfoViewModel c0, final ap6<? super iz2> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new iz2(this.C0, (ap6<? super iz2>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final iz2 iz2 = (iz2)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        iz2.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        this.C0.Q0.a(bx2.j);
        return oyv.a;
    }
}
