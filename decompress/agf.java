import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;
import com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$clearAllData$1$2$3", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class agf extends xzr implements gub<Throwable, ap6<? super oyv>, Object>
{
    public final /* synthetic */ LinkModuleConfigurationViewModel C0;
    
    public agf(final LinkModuleConfigurationViewModel c0, final ap6<? super agf> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new agf(this.C0, (ap6<? super agf>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final agf agf = (agf)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        agf.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        this.C0.Q0.d();
        ((MviViewModel)this.C0).Q((rtb)agf$a.C0);
        final LinkModuleConfigurationViewModel c0 = this.C0;
        Objects.requireNonNull(c0);
        ((MviViewModel)c0).V((Object)new qef$g(2131953078));
        return oyv.a;
    }
}
