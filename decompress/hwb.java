import android.view.View;
import android.content.res.Configuration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hwb extends gue implements rtb<Configuration, oyv>
{
    public final /* synthetic */ ewb C0;
    
    public hwb(final ewb c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Configuration configuration = (Configuration)o;
        final View y1 = this.C0.y1;
        if (y1 != null) {
            y1.setVisibility(8);
        }
        final ewb c0 = this.C0;
        c0.y1 = null;
        c0.d1.g(configuration);
        return oyv.a;
    }
}
