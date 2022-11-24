import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.ImageView;
import com.twitter.media.ui.image.UserImageView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import com.twitter.common.ui.isTalkingView.IsTalkingView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wyq extends vwq
{
    public final int f;
    public final View g;
    public final IsTalkingView h;
    public final TypefacesTextView i;
    public final TypefacesTextView j;
    public final TypefacesTextView k;
    public final UserImageView l;
    public final TypefacesTextView m;
    public final TypefacesTextView n;
    public final TypefacesTextView o;
    public final View p;
    public final ImageView q;
    public final TypefacesTextView r;
    public final ImageView s;
    public final ConstraintLayout t;
    public final ImageView u;
    public final fih<exq> v;
    
    public wyq(View viewById, final hpq hpq) {
        e0e.f((Object)viewById, "rootView");
        e0e.f((Object)hpq, "spacesCardUtils");
        super(viewById, hpq);
        this.f = qo6.b(super.d, 2131100709);
        final View viewById2 = viewById.findViewById(2131431597);
        e0e.e((Object)viewById2, "rootView.findViewById(R.\u2026paces_tab_card_container)");
        this.g = viewById2;
        final View viewById3 = viewById.findViewById(2131431599);
        e0e.e((Object)viewById3, "rootView.findViewById(R.\u2026aces_tab_card_is_talking)");
        this.h = (IsTalkingView)viewById3;
        final View viewById4 = viewById.findViewById(2131431608);
        e0e.e((Object)viewById4, "rootView.findViewById(R.id.spaces_tab_card_status)");
        this.i = (TypefacesTextView)viewById4;
        final View viewById5 = viewById.findViewById(2131431610);
        e0e.e((Object)viewById5, "rootView.findViewById(R.id.spaces_tab_card_title)");
        this.j = (TypefacesTextView)viewById5;
        final View viewById6 = viewById.findViewById(2131431611);
        e0e.e((Object)viewById6, "rootView.findViewById(R.id.spaces_tab_card_topics)");
        this.k = (TypefacesTextView)viewById6;
        final View viewById7 = viewById.findViewById(2131431595);
        e0e.e((Object)viewById7, "rootView.findViewById(R.id.spaces_tab_card_avatar)");
        this.l = (UserImageView)viewById7;
        final View viewById8 = viewById.findViewById(2131431604);
        e0e.e((Object)viewById8, "rootView.findViewById(R.id.spaces_tab_card_name)");
        this.m = (TypefacesTextView)viewById8;
        final View viewById9 = viewById.findViewById(2131431596);
        e0e.e((Object)viewById9, "rootView.findViewById(R.id.spaces_tab_card_badge)");
        this.n = (TypefacesTextView)viewById9;
        final View viewById10 = viewById.findViewById(2131431606);
        e0e.e((Object)viewById10, "rootView.findViewById(R.\u2026es_tab_card_profile_text)");
        this.o = (TypefacesTextView)viewById10;
        final View viewById11 = viewById.findViewById(2131431603);
        e0e.e((Object)viewById11, "rootView.findViewById(R.\u2026tab_card_loading_shimmer)");
        this.p = viewById11;
        final View viewById12 = viewById.findViewById(2131431598);
        e0e.e((Object)viewById12, "rootView.findViewById(R.id.spaces_tab_card_icon)");
        this.q = (ImageView)viewById12;
        final View viewById13 = viewById.findViewById(2131431601);
        e0e.e((Object)viewById13, "rootView.findViewById(R.\u2026aces_tab_card_label_text)");
        this.r = (TypefacesTextView)viewById13;
        final View viewById14 = viewById.findViewById(2131431600);
        e0e.e((Object)viewById14, "rootView.findViewById(R.\u2026ces_tab_card_label_image)");
        this.s = (ImageView)viewById14;
        final View viewById15 = viewById.findViewById(2131431607);
        e0e.e((Object)viewById15, "rootView.findViewById(R.\u2026_tab_card_root_container)");
        this.t = (ConstraintLayout)viewById15;
        viewById = viewById.findViewById(2131431605);
        e0e.e((Object)viewById, "rootView.findViewById(R.\u2026spaces_tab_card_overflow)");
        this.u = (ImageView)viewById;
        this.v = (fih<exq>)ma7.S((stb)new wyq$a(this));
    }
    
    public final qkq b() {
        final LinearLayout linearLayout = (LinearLayout)super.a.findViewById(2131431637);
        final TypefacesTextView typefacesTextView = (TypefacesTextView)super.a.findViewById(2131431638);
        e0e.e((Object)typefacesTextView, "findViewById(R.id.spaces_tab_social_proof_text)");
        return new qkq(typefacesTextView, linearLayout);
    }
}
