import android.widget.TextView;
import android.view.View;
import android.view.View$OnClickListener;
import com.twitter.ui.widget.BadgeView;
import com.twitter.media.ui.image.MediaImageView;
import android.widget.ImageView;
import com.twitter.media.ui.image.UserImageView;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hph implements cph
{
    public final ViewGroup D0;
    public final a E0;
    public final UserImageView F0;
    public final ImageView G0;
    public final UserImageView H0;
    public final MediaImageView I0;
    public final BadgeView J0;
    public final int K0;
    public final int L0;
    public View$OnClickListener M0;
    
    public hph(final ViewGroup d0, final a e0, final UserImageView f0, final ImageView g0, final UserImageView h0, final BadgeView j0, final MediaImageView i0, final ImageView imageView, final int k0, final int l0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.J0 = j0;
        this.I0 = i0;
        this.K0 = k0;
        this.L0 = l0;
        imageView.setImageResource(fd9.a(((View)d0).getContext(), 2130969731, 2131232194));
        aoo.f((View)d0).subscribe((lj6)new fkk((Object)this, 7));
    }
    
    public final void a() {
        ((View)this.H0).setVisibility(8);
    }
    
    public final void b(final String text) {
        final a e0 = this.E0;
        e0.e.setText((CharSequence)text);
        ((View)e0.e).setVisibility(0);
    }
    
    public final void g(final String text) {
        final a e0 = this.E0;
        final int k0 = this.K0;
        e0.b.setText((CharSequence)text);
        e0.b.setTextColor(k0);
        ((View)e0.b).setVisibility(0);
    }
    
    public final View getView() {
        return (View)this.D0;
    }
    
    public static final class a extends s69
    {
        public final TextView e;
        
        public a(final ViewGroup viewGroup) {
            super(viewGroup);
            this.e = (TextView)((View)viewGroup).findViewById(2131430839);
            final TextView b = super.b;
            b.setTypeface(b.getTypeface(), 1);
        }
    }
}
