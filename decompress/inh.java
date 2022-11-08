import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.moduleconfiguration.overview.ModuleOverviewViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class inh extends gue implements rtb<wnh, oyv>
{
    public final /* synthetic */ ModuleOverviewViewModel C0;
    
    public inh(final ModuleOverviewViewModel c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final wnh wnh = (wnh)o;
        zzd.f((Object)wnh, "it");
        final ModuleOverviewViewModel c0 = this.C0;
        final dmh.b b = new dmh.b(wnh.e);
        final soe[] y0 = ModuleOverviewViewModel.Y0;
        ((MviViewModel)c0).V((Object)b);
        return oyv.a;
    }
}
