import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.moduleconfiguration.overview.ModuleOverviewViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hoh extends pue implements ptb<vzv>
{
    public final ModuleOverviewViewModel F0;
    
    public hoh(final ModuleOverviewViewModel f0) {
        this.F0 = f0;
        super(0);
    }
    
    public final Object invoke() {
        final ModuleOverviewViewModel f0 = this.F0;
        final xmh$f xmh$f = new xmh$f(false);
        final ape[] b1 = ModuleOverviewViewModel.b1;
        ((MviViewModel)f0).V((Object)xmh$f);
        return vzv.a;
    }
}
