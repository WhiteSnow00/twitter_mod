import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.moduleconfiguration.overview.ModuleOverviewViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class onh extends gue implements rtb<wnh, oyv>
{
    public final /* synthetic */ ModuleOverviewViewModel C0;
    public final /* synthetic */ ual D0;
    
    public onh(final ModuleOverviewViewModel c0, final ual d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final wnh wnh = (wnh)o;
        zzd.f((Object)wnh, "state");
        final ModuleOverviewViewModel c0 = this.C0;
        final dmh.d d = new dmh.d(this.D0 != null, wnh.c);
        final soe[] y0 = ModuleOverviewViewModel.Y0;
        ((MviViewModel)c0).V((Object)d);
        return oyv.a;
    }
}
