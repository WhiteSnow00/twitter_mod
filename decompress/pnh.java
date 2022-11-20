import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.moduleconfiguration.overview.ModuleOverviewViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pnh extends ste implements nsb<fzv>
{
    public final ModuleOverviewViewModel D0;
    
    public pnh(final ModuleOverviewViewModel d0) {
        this.D0 = d0;
        super(0);
    }
    
    public final Object invoke() {
        final ModuleOverviewViewModel d0 = this.D0;
        final imh$f imh$f = new imh$f(true);
        final coe[] z0 = ModuleOverviewViewModel.Z0;
        ((MviViewModel)d0).V((Object)imh$f);
        return fzv.a;
    }
}
