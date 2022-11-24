import android.view.View;
import com.twitter.media.ui.image.UserImageView;
import java.util.Set;
import android.widget.TextView;
import com.twitter.rooms.model.helpers.CohostInvite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e9n extends pue implements stb<i9n, vzv>
{
    public final c9n F0;
    
    public e9n(final c9n f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final i9n i9n = (i9n)o;
        e0e.f((Object)i9n, "$this$distinct");
        final c9n f0 = this.F0;
        final TextView i0 = f0.I0;
        final Set b = i9n.b;
        final String string = f0.F0.getContext().getString(2131951961);
        e0e.e((Object)string, "rootView.context.getStri\u2026s.R.string.and_separator)");
        i0.setText((CharSequence)xli.j(b, string));
        final String avatarUrl = ((CohostInvite)rr4.B1((Iterable)i9n.b)).getAvatarUrl();
        if (flr.g((CharSequence)avatarUrl) && i9n.b.size() == 1) {
            final UserImageView s0 = this.F0.S0;
            s0.L(avatarUrl);
            s0.setSize(((View)s0).getRootView().getResources().getDimensionPixelSize(2131167443));
            ((View)s0).setVisibility(0);
            this.F0.T0.setVisibility(0);
            this.F0.U0.setVisibility(8);
        }
        else {
            this.F0.U0.setVisibility(0);
            this.F0.T0.setVisibility(8);
            ((View)this.F0.S0).setVisibility(8);
        }
        return vzv.a;
    }
}
