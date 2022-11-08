import android.view.View$OnClickListener;
import android.view.View;
import com.twitter.onboarding.ocf.NavigationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e3q implements ay9<d3q>
{
    public final NavigationHandler C0;
    public final mf1 D0;
    
    public e3q(final NavigationHandler c0, final mf1 d0) {
        zzd.f((Object)c0, "navigationHandler");
        zzd.f((Object)d0, "backButtonHandler");
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final void s(final Object o) {
        final d3q d3q = (d3q)o;
        zzd.f((Object)d3q, "effect");
        if (d3q instanceof d3q$a) {
            this.D0.d((View)null, (View$OnClickListener)null);
        }
        else if (d3q instanceof d3q$b) {
            this.C0.d(new mrd(((d3q$b)d3q).a, (prd)null, 2, (hg8)null), (String)null);
        }
    }
}
