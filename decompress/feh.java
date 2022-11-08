import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;
import com.twitter.business.moduleconfiguration.mobileappmodule.MobileAppModuleConfigurationViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.business.moduleconfiguration.mobileappmodule.MobileAppModuleConfigurationViewModel$deleteAppModule$1$2$3", f = "MobileAppModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class feh extends xzr implements gub<Throwable, ap6<? super oyv>, Object>
{
    public final /* synthetic */ MobileAppModuleConfigurationViewModel C0;
    
    public feh(final MobileAppModuleConfigurationViewModel c0, final ap6<? super feh> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new feh(this.C0, (ap6<? super feh>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final feh feh = (feh)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        feh.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        this.C0.Q0.d();
        ((MviViewModel)this.C0).Q((rtb)feh$a.C0);
        final MobileAppModuleConfigurationViewModel c0 = this.C0;
        Objects.requireNonNull(c0);
        ((MviViewModel)c0).V((Object)new bdh$e(2131953078));
        return oyv.a;
    }
}
