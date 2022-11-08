import android.view.View;
import android.content.Context;
import android.widget.ImageView;
import com.twitter.common.ui.settings.MoreSettingsView;
import android.content.res.ColorStateList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dzn extends gue implements rtb<qzn, oyv>
{
    public final /* synthetic */ qxn C0;
    
    public dzn(final qxn c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final qzn qzn = (qzn)o;
        zzd.f((Object)qzn, "$this$distinct");
        ((View)this.C0.V0).setEnabled(qzn.C);
        final qxn c0 = this.C0;
        final ImageView v0 = c0.V0;
        final Context context = c0.C0.getContext();
        zzd.e((Object)context, "rootView.context");
        int n;
        if (qzn.C) {
            n = 2130969091;
        }
        else {
            n = 2130969089;
        }
        v0.setImageTintList(ColorStateList.valueOf(goz.J(context, n)));
        if (qzn.D) {
            final MoreSettingsView moreSettingsView = (MoreSettingsView)this.C0.q1.b;
            moreSettingsView.O0 = qzn.C;
            final l5o p = moreSettingsView.P0;
            if (p != null) {
                ((View)p).setVisibility(0);
            }
            moreSettingsView.N0 = true;
        }
        else {
            final MoreSettingsView moreSettingsView2 = (MoreSettingsView)this.C0.q1.b;
            final l5o p2 = moreSettingsView2.P0;
            if (p2 != null) {
                ((View)p2).setVisibility(8);
            }
            moreSettingsView2.N0 = false;
        }
        return oyv.a;
    }
}
