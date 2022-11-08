import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.moduleconfiguration.mobileappmodule.MobileAppModuleConfigurationViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.business.moduleconfiguration.mobileappmodule.MobileAppModuleConfigurationViewModel$deleteAppModule$1$2$2", f = "MobileAppModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class eeh extends xzr implements rtb<ap6<? super oyv>, Object>
{
    public final /* synthetic */ MobileAppModuleConfigurationViewModel C0;
    
    public eeh(final MobileAppModuleConfigurationViewModel c0, final ap6<? super eeh> ap6) {
        this.C0 = c0;
        super(1, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final ap6<?> ap6) {
        return (ap6<oyv>)new eeh(this.C0, (ap6<? super eeh>)ap6);
    }
    
    public final Object invoke(final Object o) {
        final eeh eeh = (eeh)this.create((ap6<?>)o);
        final oyv a = oyv.a;
        eeh.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final MobileAppModuleConfigurationViewModel c0 = this.C0;
        final eeh$a c2 = eeh$a.C0;
        final soe[] x0 = MobileAppModuleConfigurationViewModel.X0;
        ((MviViewModel)c0).Q((rtb)c2);
        return oyv.a;
    }
}
