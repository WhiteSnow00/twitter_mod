import android.view.View;
import com.twitter.common.ui.settings.MoreSettingsView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czn extends ste implements qsb<d0o, fzv>
{
    public final dyn D0;
    
    public czn(final dyn d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final d0o d0o = (d0o)o;
        czd.f((Object)d0o, "$this$distinct");
        if (djo.x() && d0o.c) {
            final MoreSettingsView moreSettingsView = (MoreSettingsView)this.D0.r1.b;
            final a6o n0 = moreSettingsView.N0;
            if (n0 != null) {
                ((View)n0).setVisibility(0);
            }
            moreSettingsView.M0 = true;
        }
        return fzv.a;
    }
}
