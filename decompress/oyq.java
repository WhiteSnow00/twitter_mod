import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.LinearLayout;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.twitter.media.ui.image.UserImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oyq extends fvq
{
    public final View f;
    public final UserImageView g;
    public final AppCompatImageView h;
    public final TypefacesTextView i;
    public final TypefacesTextView j;
    public final TypefacesTextView k;
    public final LinearLayout l;
    public final TypefacesTextView m;
    public final View n;
    public final ConstraintLayout o;
    public final ImageView p;
    public final View q;
    public final mhh<ovq> r;
    
    public oyq(View viewById, final qnq qnq) {
        zzd.f((Object)viewById, "rootView");
        zzd.f((Object)qnq, "spacesCardUtils");
        super(viewById, qnq);
        final View viewById2 = viewById.findViewById(2131431635);
        zzd.e((Object)viewById2, "rootView.findViewById(R.\u2026upcoming_host_background)");
        this.f = viewById2;
        final View viewById3 = viewById.findViewById(2131431608);
        zzd.e((Object)viewById3, "rootView.findViewById(R.\u2026tab_card_upcoming_avatar)");
        this.g = (UserImageView)viewById3;
        final View viewById4 = viewById.findViewById(2131431640);
        zzd.e((Object)viewById4, "rootView.findViewById(R.\u2026b_upcoming_verified_icon)");
        this.h = (AppCompatImageView)viewById4;
        final View viewById5 = viewById.findViewById(2131431636);
        zzd.e((Object)viewById5, "rootView.findViewById(R.\u2026s_tab_upcoming_host_name)");
        this.i = (TypefacesTextView)viewById5;
        final View viewById6 = viewById.findViewById(2131431613);
        zzd.e((Object)viewById6, "rootView.findViewById(R.\u2026_tab_card_upcoming_title)");
        this.j = (TypefacesTextView)viewById6;
        final View viewById7 = viewById.findViewById(2131431610);
        zzd.e((Object)viewById7, "rootView.findViewById(R.\u2026s_tab_card_upcoming_date)");
        this.k = (TypefacesTextView)viewById7;
        final View viewById8 = viewById.findViewById(2131431612);
        zzd.e((Object)viewById8, "rootView.findViewById(R.\u2026rd_upcoming_ticket_group)");
        this.l = (LinearLayout)viewById8;
        final View viewById9 = viewById.findViewById(2131431605);
        zzd.e((Object)viewById9, "rootView.findViewById(R.\u2026es_tab_card_ticket_price)");
        this.m = (TypefacesTextView)viewById9;
        final View viewById10 = viewById.findViewById(2131431611);
        zzd.e((Object)viewById10, "rootView.findViewById(R.\u2026upcoming_loading_shimmer)");
        this.n = viewById10;
        final View viewById11 = viewById.findViewById(2131431609);
        zzd.e((Object)viewById11, "rootView.findViewById(R.\u2026_card_upcoming_container)");
        this.o = (ConstraintLayout)viewById11;
        final View viewById12 = viewById.findViewById(2131431638);
        zzd.e((Object)viewById12, "rootView.findViewById(R.\u2026tab_upcoming_notify_icon)");
        this.p = (ImageView)viewById12;
        viewById = viewById.findViewById(2131431637);
        zzd.e((Object)viewById, "rootView.findViewById(R.\u2026coming_notify_background)");
        this.q = viewById;
        this.r = (mhh<ovq>)ajy.a0((rtb)new oyq$a(this));
    }
    
    @Override
    public final cjq b() {
        final View viewById = super.a.findViewById(2131431639);
        zzd.e((Object)viewById, "rootView.findViewById(R.\u2026coming_social_proof_text)");
        return new cjq((TypefacesTextView)viewById);
    }
}
