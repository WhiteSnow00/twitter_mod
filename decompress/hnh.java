import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.moduleconfiguration.overview.ModuleOverviewViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.business.moduleconfiguration.overview.ModuleOverviewViewModel$exitActivityIfNotProfessional$1", f = "ModuleOverviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class hnh extends xzr implements gub<snj<v3l>, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ ModuleOverviewViewModel D0;
    
    public hnh(final ModuleOverviewViewModel d0, final ap6<? super hnh> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final hnh hnh = new hnh(this.D0, (ap6<? super hnh>)ap6);
        hnh.C0 = c0;
        return (ap6<oyv>)hnh;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final hnh hnh = (hnh)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        hnh.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        if (((snj)this.C0).e()) {
            final ModuleOverviewViewModel d0 = this.D0;
            final dmh.a a = dmh.a.a;
            final soe[] y0 = ModuleOverviewViewModel.Y0;
            ((MviViewModel)d0).V((Object)a);
        }
        return oyv.a;
    }
}
