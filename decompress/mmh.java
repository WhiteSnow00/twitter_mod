import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.moduleconfiguration.overview.deeplink.ModuleOverviewRedirectViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.business.moduleconfiguration.overview.deeplink.ModuleOverviewRedirectViewModel$redirect$1$1", f = "ModuleOverviewRedirectViewModel.kt", l = {}, m = "invokeSuspend")
public final class mmh extends xzr implements gub<snj<v3l>, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ ModuleOverviewRedirectViewModel D0;
    
    public mmh(final ModuleOverviewRedirectViewModel d0, final ap6<? super mmh> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final mmh mmh = new mmh(this.D0, (ap6<? super mmh>)ap6);
        mmh.C0 = c0;
        return (ap6<oyv>)mmh;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final mmh mmh = (mmh)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        mmh.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final snj snj = (snj)this.C0;
        final ModuleOverviewRedirectViewModel d0 = this.D0;
        Object o2;
        if (snj.f()) {
            o2 = kmh$b.a;
        }
        else {
            o2 = kmh$a.a;
        }
        final soe[] o3 = ModuleOverviewRedirectViewModel.O0;
        ((MviViewModel)d0).V(o2);
        return oyv.a;
    }
}
