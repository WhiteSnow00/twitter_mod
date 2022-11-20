import androidx.fragment.app.Fragment;
import com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wef extends ste implements qsb<LinkModuleConfigurationViewModel.b, fzv>
{
    public final pef D0;
    
    public wef(final pef d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final LinkModuleConfigurationViewModel.b b = (LinkModuleConfigurationViewModel.b)o;
        czd.f((Object)b, "$this$distinct");
        if (b.a) {
            final pef d0 = this.D0;
            if (d0.V0 == null) {
                final jhl n2 = jhl.n2(2131955984);
                ((Fragment)n2).S1();
                n2.p2(d0.H0, "loading_dialog");
                d0.V0 = n2;
            }
        }
        else {
            final pef d2 = this.D0;
            final jhl v0 = d2.V0;
            if (v0 != null) {
                v0.m2();
            }
            d2.V0 = null;
        }
        return fzv.a;
    }
}
