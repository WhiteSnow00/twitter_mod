import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.model.phone.PreviewOpenTimesData;
import com.twitter.business.features.linkmodule.model.LinkModuleDomainConfig;
import com.twitter.business.moduleconfiguration.overview.ModuleOverviewViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qnh extends ste implements qsb<boh, fzv>
{
    public final ModuleOverviewViewModel D0;
    public final poh E0;
    public final LinkModuleDomainConfig F0;
    public final String G0;
    
    public qnh(final ModuleOverviewViewModel d0, final poh e0, final LinkModuleDomainConfig f0, final String g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final boh boh = (boh)o;
        czd.f((Object)boh, "state");
        final ModuleOverviewViewModel d0 = this.D0;
        final imh$c imh$c = new imh$c(this.E0, (blh)this.F0, this.G0, false, (PreviewOpenTimesData)null, boh.c, 24);
        final coe[] z0 = ModuleOverviewViewModel.Z0;
        ((MviViewModel)d0).V((Object)imh$c);
        return fzv.a;
    }
}
