import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel$clearAllData$1$2$2", f = "BusinessInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class ez2 extends xzr implements rtb<ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessInfoViewModel C0;
    
    public ez2(final BusinessInfoViewModel c0, final ap6<? super ez2> ap6) {
        this.C0 = c0;
        super(1, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final ap6<?> ap6) {
        return (ap6<oyv>)new ez2(this.C0, (ap6<? super ez2>)ap6);
    }
    
    public final Object invoke(final Object o) {
        final ez2 ez2 = (ez2)this.create((ap6<?>)o);
        final oyv a = oyv.a;
        ez2.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final BusinessInfoViewModel c0 = this.C0;
        final ez2$a c2 = ez2$a.C0;
        final soe[] c3 = BusinessInfoViewModel.c1;
        ((MviViewModel)c0).Q((rtb)c2);
        return oyv.a;
    }
}
