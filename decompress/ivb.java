import android.view.View;
import android.content.res.Configuration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivb extends ste implements qsb<Configuration, fzv>
{
    public final fvb D0;
    
    public ivb(final fvb d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Configuration configuration = (Configuration)o;
        final View z1 = this.D0.z1;
        if (z1 != null) {
            z1.setVisibility(8);
        }
        final fvb d0 = this.D0;
        d0.z1 = null;
        d0.e1.g(configuration);
        return fzv.a;
    }
}
