import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.moduleconfiguration.mobileappmodule.MobileAppModuleConfigurationViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.business.moduleconfiguration.mobileappmodule.MobileAppModuleConfigurationViewModel$deleteAppModule$1$2$1", f = "MobileAppModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class deh extends xzr implements gub<oyv, ap6<? super oyv>, Object>
{
    public final /* synthetic */ MobileAppModuleConfigurationViewModel C0;
    
    public deh(final MobileAppModuleConfigurationViewModel c0, final ap6<? super deh> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new deh(this.C0, (ap6<? super deh>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final deh deh = (deh)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        deh.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        this.C0.Q0.f();
        final MobileAppModuleConfigurationViewModel c0 = this.C0;
        c0.V0.clearAllData();
        ((MviViewModel)c0).Q((rtb)heh.C0);
        ((MviViewModel)this.C0).V((Object)new bdh$a(true, 2));
        return oyv.a;
    }
}
