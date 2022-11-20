import androidx.appcompat.widget.AppCompatImageView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.a;
import android.app.Dialog;
import android.view.View$OnClickListener;
import com.twitter.ui.widget.TintableImageView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.view.ViewGroup;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h8n extends c92
{
    public static final int V0 = 0;
    public final ltn S0;
    public final cbw T0;
    public final View U0;
    
    public h8n(final Context context, final boolean b, final ltn s0, final cbw t0) {
        czd.f((Object)context, "context");
        czd.f((Object)s0, "roomOpenSettingsViewEventDispatcher");
        czd.f((Object)t0, "userEventReporter");
        super(context);
        this.S0 = s0;
        this.T0 = t0;
        final View inflate = ((Dialog)this).getLayoutInflater().inflate(2131625491, (ViewGroup)null, false);
        czd.e((Object)inflate, "layoutInflater.inflate(R\u2026_nux_layout, null, false)");
        this.U0 = inflate;
        final View viewById = inflate.findViewById(2131431377);
        czd.e((Object)viewById, "contents.findViewById(R.id.settings_button)");
        final TypefacesTextView typefacesTextView = (TypefacesTextView)viewById;
        final View viewById2 = inflate.findViewById(2131429642);
        czd.e((Object)viewById2, "contents.findViewById(R.id.intro)");
        final TypefacesTextView typefacesTextView2 = (TypefacesTextView)viewById2;
        final View viewById3 = inflate.findViewById(2131430642);
        czd.e((Object)viewById3, "contents.findViewById(R.id.point_two_title)");
        final TypefacesTextView typefacesTextView3 = (TypefacesTextView)viewById3;
        final View viewById4 = inflate.findViewById(2131430640);
        czd.e((Object)viewById4, "contents.findViewById(R.id.point_two_desc)");
        final TypefacesTextView typefacesTextView4 = (TypefacesTextView)viewById4;
        final View viewById5 = inflate.findViewById(2131430641);
        czd.e((Object)viewById5, "contents.findViewById(R.id.point_two_icon)");
        final TintableImageView tintableImageView = (TintableImageView)viewById5;
        final View viewById6 = inflate.findViewById(2131430639);
        czd.e((Object)viewById6, "contents.findViewById(R.id.point_three_title)");
        final TypefacesTextView typefacesTextView5 = (TypefacesTextView)viewById6;
        final View viewById7 = inflate.findViewById(2131430637);
        czd.e((Object)viewById7, "contents.findViewById(R.id.point_three_desc)");
        final TypefacesTextView typefacesTextView6 = (TypefacesTextView)viewById7;
        final View viewById8 = inflate.findViewById(2131430638);
        czd.e((Object)viewById8, "contents.findViewById(R.id.point_three_icon)");
        final TintableImageView tintableImageView2 = (TintableImageView)viewById8;
        ((a)this).setContentView(inflate);
        ((a)this).l().H = true;
        ((a)this).l().H(3);
        final TypefacesTextView typefacesTextView7 = ((ck0)this).findViewById(2131430444);
        if (typefacesTextView7 != null) {
            ((View)typefacesTextView7).setOnClickListener((View$OnClickListener)new fpf(this, 23));
        }
        if (b && djo.O()) {
            ((TextView)typefacesTextView2).setText(2131952477);
            ((TextView)typefacesTextView3).setText(2131952483);
            ((TextView)typefacesTextView4).setText(2131952481);
            ((AppCompatImageView)tintableImageView).setImageResource(2131232404);
            ((View)typefacesTextView6).setVisibility(8);
            ((View)typefacesTextView5).setVisibility(8);
            ((View)tintableImageView2).setVisibility(8);
            ((View)typefacesTextView).setVisibility(0);
            ((View)typefacesTextView).setOnClickListener((View$OnClickListener)new epf((Object)this, 25));
        }
        else {
            ((TextView)typefacesTextView2).setText(2131952478);
            ((TextView)typefacesTextView3).setText(2131952484);
            ((TextView)typefacesTextView4).setText(2131952482);
            ((AppCompatImageView)tintableImageView).setImageResource(2131232313);
            ((View)typefacesTextView6).setVisibility(0);
            ((View)typefacesTextView5).setVisibility(0);
            ((View)tintableImageView2).setVisibility(0);
            ((View)typefacesTextView).setVisibility(8);
        }
        this.o("", "impression");
    }
    
    public final void o(final String s, final String s2) {
        this.T0.c((elm)new af4(vba.Companion.e("audiospace", "nux", "clipping", s, s2)));
    }
}
