import android.graphics.drawable.Drawable;
import android.view.View;
import com.twitter.media.ui.image.UserImageView;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.twitter.media.ui.fresco.FrescoMediaImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rsf extends sl8
{
    public final FrescoMediaImageView G0;
    public final TextView H0;
    public final ImageView I0;
    public final TextView J0;
    public final TextView K0;
    public final TextView L0;
    public final ViewGroup M0;
    public final UserImageView N0;
    
    public rsf(final View view) {
        super(view);
        this.M0 = (ViewGroup)view.findViewById(2131428126);
        this.G0 = (FrescoMediaImageView)view.findViewById(2131428127);
        this.H0 = (TextView)view.findViewById(2131428120);
        this.I0 = (ImageView)view.findViewById(2131428130);
        this.J0 = (TextView)view.findViewById(2131428121);
        this.K0 = (TextView)view.findViewById(2131428124);
        this.L0 = (TextView)view.findViewById(2131428125);
        this.N0 = (UserImageView)view.findViewById(2131428129);
    }
    
    public final void l0() {
        ((View)this.N0).setVisibility(8);
        ((View)this.K0).setBackground((Drawable)null);
        this.K0.setText((CharSequence)null);
        ((View)this.L0).setVisibility(8);
        this.L0.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.L0.setCompoundDrawablePadding(0);
    }
    
    public final boolean m0(final CharSequence text, final int n, final int backgroundResource) {
        if (flr.e(text)) {
            this.n0(n);
            return false;
        }
        ((View)this.K0).setBackgroundResource(backgroundResource);
        this.L0.setCompoundDrawablesWithIntrinsicBounds(2131232585, 0, 0, 0);
        ((View)this.L0).setVisibility(0);
        this.L0.setText(text);
        this.L0.setCompoundDrawablePadding(super.F0.getResources().getDimensionPixelOffset(2131167439));
        return true;
    }
    
    public final void n0(final int backgroundResource) {
        ((View)this.K0).setBackgroundResource(backgroundResource);
        ((View)this.L0).setVisibility(8);
        this.L0.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.L0.setCompoundDrawablePadding(0);
    }
}
