import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel$clearAllData$1$2$1", f = "BusinessInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class dz2 extends xzr implements gub<oyv, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessInfoViewModel C0;
    
    public dz2(final BusinessInfoViewModel c0, final ap6<? super dz2> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new dz2(this.C0, (ap6<? super dz2>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final dz2 dz2 = (dz2)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        dz2.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        this.C0.R0.f();
        final BusinessInfoViewModel c0 = this.C0;
        c0.a1.clearAllData();
        ((MviViewModel)c0).Q((rtb)lz2.C0);
        ((MviViewModel)this.C0).V((Object)new ax2$a(true, 2));
        return oyv.a;
    }
}
