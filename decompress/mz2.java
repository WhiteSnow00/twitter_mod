import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mz2 extends pue implements stb<d03, vzv>
{
    public final BusinessInfoViewModel F0;
    
    public mz2(final BusinessInfoViewModel f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        e0e.f((Object)o, "it");
        final BusinessInfoViewModel f0 = this.F0;
        ((MviViewModel)f0).Q((stb)new xz2(f0, f0.d1.hasData() || f0.d1.hasModuleId()));
        BusinessInfoViewModel.Y(this.F0);
        return vzv.a;
    }
}
