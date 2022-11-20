import androidx.appcompat.app.f;
import com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eff extends ste implements qsb<LinkModuleConfigurationViewModel.b, fzv>
{
    public final pef D0;
    
    public eff(final pef d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final LinkModuleConfigurationViewModel.b b = (LinkModuleConfigurationViewModel.b)o;
        czd.f((Object)b, "$this$distinct");
        final fef k0 = this.D0.K0;
        k0.F0 = b.d;
        ((f)k0.E0).invalidateOptionsMenu();
        return fzv.a;
    }
}
