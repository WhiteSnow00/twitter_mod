import android.view.View;
import com.twitter.common.ui.settings.MoreSettingsView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l3n extends ste implements qsb<t6n, fzv>
{
    public final l1n D0;
    
    public l3n(final l1n d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final t6n t6n = (t6n)o;
        czd.f((Object)t6n, "$this$distinct");
        if (t6n.k) {
            final MoreSettingsView moreSettingsView = (MoreSettingsView)this.D0.y1.b;
            final a6o j0 = moreSettingsView.J0;
            if (j0 != null) {
                ((View)j0).setVisibility(0);
            }
            moreSettingsView.I0 = true;
        }
        else {
            final MoreSettingsView moreSettingsView2 = (MoreSettingsView)this.D0.y1.b;
            final a6o j2 = moreSettingsView2.J0;
            if (j2 != null) {
                ((View)j2).setVisibility(8);
            }
            moreSettingsView2.I0 = false;
        }
        return fzv.a;
    }
}
