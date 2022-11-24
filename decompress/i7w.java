import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.content.Context;
import com.twitter.ui.components.button.legacy.ToggleTwitterButton;
import com.twitter.ui.tweet.TweetHeaderView;
import com.twitter.media.ui.image.UserImageView;
import android.widget.TextView;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i7w implements g7w
{
    public final View F0;
    public final FrescoMediaImageView G0;
    public final TextView H0;
    public final UserImageView I0;
    public final TweetHeaderView J0;
    public final ToggleTwitterButton K0;
    public final Context L0;
    public final TextView M0;
    public final View N0;
    public final x3c O0;
    public final View P0;
    public final ImageView Q0;
    public final ImageButton R0;
    public final klb S0;
    
    public i7w(final View f0, final FrescoMediaImageView g0, final TextView h0, final UserImageView i0, final TweetHeaderView j0, final ToggleTwitterButton k0, final TextView m0, final View n0, final ViewStub viewStub, final View p13, final ImageView q0, final ImageButton r0, final klb s0) {
        this.F0 = f0;
        this.L0 = f0.getContext();
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.M0 = m0;
        this.N0 = n0;
        this.O0 = new x3c(viewStub);
        this.P0 = p13;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
    }
    
    public final void a(final String s, final boolean toggledOn) {
        this.K0.setToggledOn(toggledOn);
        final ToggleTwitterButton k0 = this.K0;
        final Resources resources = this.L0.getResources();
        int n;
        if (toggledOn) {
            n = 2131952058;
        }
        else {
            n = 2131955467;
        }
        ((View)k0).setContentDescription((CharSequence)resources.getString(n, new Object[] { s }));
    }
    
    public final void b(final boolean b) {
        Drawable imageDrawable;
        if (b) {
            final Context l0 = this.L0;
            final Object a = qo6.a;
            imageDrawable = qo6$c.b(l0, 2131232347);
        }
        else {
            final Context l2 = this.L0;
            final Object a2 = qo6.a;
            imageDrawable = qo6$c.b(l2, 2131232349);
        }
        final Context l3 = this.L0;
        int n;
        if (b) {
            n = 2130968591;
        }
        else {
            n = 2130968585;
        }
        ie9.c(imageDrawable, b1b.B(l3, n));
        ((ImageView)this.R0).setImageDrawable(imageDrawable);
        final ImageButton r0 = this.R0;
        final Context l4 = this.L0;
        int n2;
        if (b) {
            n2 = 2131954488;
        }
        else {
            n2 = 2131954489;
        }
        ((View)r0).setContentDescription((CharSequence)l4.getString(n2));
    }
    
    public final View getView() {
        return this.F0;
    }
}
