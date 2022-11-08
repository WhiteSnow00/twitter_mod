import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.moduleconfiguration.overview.deeplink.ModuleOverviewRedirectViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.business.moduleconfiguration.overview.deeplink.ModuleOverviewRedirectViewModel$redirect$1$2", f = "ModuleOverviewRedirectViewModel.kt", l = {}, m = "invokeSuspend")
public final class nmh extends xzr implements gub<Throwable, ap6<? super oyv>, Object>
{
    public final /* synthetic */ ModuleOverviewRedirectViewModel C0;
    
    public nmh(final ModuleOverviewRedirectViewModel c0, final ap6<? super nmh> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new nmh(this.C0, (ap6<? super nmh>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final nmh nmh = (nmh)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        nmh.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final ModuleOverviewRedirectViewModel c0 = this.C0;
        final kmh$a a = kmh$a.a;
        final soe[] o2 = ModuleOverviewRedirectViewModel.O0;
        ((MviViewModel)c0).V((Object)a);
        return oyv.a;
    }
}
