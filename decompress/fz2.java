import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;
import com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel$clearAllData$1$2$3", f = "BusinessInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class fz2 extends xzr implements gub<Throwable, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessInfoViewModel C0;
    
    public fz2(final BusinessInfoViewModel c0, final ap6<? super fz2> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new fz2(this.C0, (ap6<? super fz2>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final fz2 fz2 = (fz2)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        fz2.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        this.C0.R0.d();
        ((MviViewModel)this.C0).Q((rtb)fz2$a.C0);
        final BusinessInfoViewModel c0 = this.C0;
        Objects.requireNonNull(c0);
        ((MviViewModel)c0).V((Object)new ax2$i(2131953078));
        return oyv.a;
    }
}
