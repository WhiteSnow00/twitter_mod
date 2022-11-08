import com.twitter.business.model.AboutModuleDomainData;
import com.twitter.business.model.AboutModuleGoogleData;
import com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel$fetchMapsImageUrlAndUpdatePreview$2$2", f = "BusinessInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class jz2 extends xzr implements gub<snj<String>, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ BusinessInfoViewModel D0;
    
    public jz2(final BusinessInfoViewModel d0, final ap6<? super jz2> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final jz2 jz2 = new jz2(this.D0, (ap6<? super jz2>)ap6);
        jz2.C0 = c0;
        return (ap6<oyv>)jz2;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final jz2 jz2 = (jz2)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        jz2.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final snj snj = (snj)this.C0;
        if (snj.f()) {
            this.D0.Q0.a(bx2.i);
            final AboutModuleDomainData a1 = this.D0.a1;
            a1.setGoogleMapsData(AboutModuleGoogleData.copy$default(a1.getGoogleMapsData(), false, (String)snj.c(), 1, (Object)null));
            BusinessInfoViewModel.Y(this.D0);
        }
        return oyv.a;
    }
}
