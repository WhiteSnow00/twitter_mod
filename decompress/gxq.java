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

public final class gxq extends fvq
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
    public final mhh<ovq> v;
    
    public gxq(View viewById, final qnq qnq) {
        zzd.f((Object)viewById, "rootView");
        zzd.f((Object)qnq, "spacesCardUtils");
        super(viewById, qnq);
        this.f = eo6.b(super.d, 2131100709);
        final View viewById2 = viewById.findViewById(2131431593);
        zzd.e((Object)viewById2, "rootView.findViewById(R.\u2026paces_tab_card_container)");
        this.g = viewById2;
        final View viewById3 = viewById.findViewById(2131431595);
        zzd.e((Object)viewById3, "rootView.findViewById(R.\u2026aces_tab_card_is_talking)");
        this.h = (IsTalkingView)viewById3;
        final View viewById4 = viewById.findViewById(2131431604);
        zzd.e((Object)viewById4, "rootView.findViewById(R.id.spaces_tab_card_status)");
        this.i = (TypefacesTextView)viewById4;
        final View viewById5 = viewById.findViewById(2131431606);
        zzd.e((Object)viewById5, "rootView.findViewById(R.id.spaces_tab_card_title)");
        this.j = (TypefacesTextView)viewById5;
        final View viewById6 = viewById.findViewById(2131431607);
        zzd.e((Object)viewById6, "rootView.findViewById(R.id.spaces_tab_card_topics)");
        this.k = (TypefacesTextView)viewById6;
        final View viewById7 = viewById.findViewById(2131431591);
        zzd.e((Object)viewById7, "rootView.findViewById(R.id.spaces_tab_card_avatar)");
        this.l = (UserImageView)viewById7;
        final View viewById8 = viewById.findViewById(2131431600);
        zzd.e((Object)viewById8, "rootView.findViewById(R.id.spaces_tab_card_name)");
        this.m = (TypefacesTextView)viewById8;
        final View viewById9 = viewById.findViewById(2131431592);
        zzd.e((Object)viewById9, "rootView.findViewById(R.id.spaces_tab_card_badge)");
        this.n = (TypefacesTextView)viewById9;
        final View viewById10 = viewById.findViewById(2131431602);
        zzd.e((Object)viewById10, "rootView.findViewById(R.\u2026es_tab_card_profile_text)");
        this.o = (TypefacesTextView)viewById10;
        final View viewById11 = viewById.findViewById(2131431599);
        zzd.e((Object)viewById11, "rootView.findViewById(R.\u2026tab_card_loading_shimmer)");
        this.p = viewById11;
        final View viewById12 = viewById.findViewById(2131431594);
        zzd.e((Object)viewById12, "rootView.findViewById(R.id.spaces_tab_card_icon)");
        this.q = (ImageView)viewById12;
        final View viewById13 = viewById.findViewById(2131431597);
        zzd.e((Object)viewById13, "rootView.findViewById(R.\u2026aces_tab_card_label_text)");
        this.r = (TypefacesTextView)viewById13;
        final View viewById14 = viewById.findViewById(2131431596);
        zzd.e((Object)viewById14, "rootView.findViewById(R.\u2026ces_tab_card_label_image)");
        this.s = (ImageView)viewById14;
        final View viewById15 = viewById.findViewById(2131431603);
        zzd.e((Object)viewById15, "rootView.findViewById(R.\u2026_tab_card_root_container)");
        this.t = (ConstraintLayout)viewById15;
        viewById = viewById.findViewById(2131431601);
        zzd.e((Object)viewById, "rootView.findViewById(R.\u2026spaces_tab_card_overflow)");
        this.u = (ImageView)viewById;
        this.v = (mhh<ovq>)ajy.a0((rtb)new rtb<mhh$a<ovq>, oyv>() {
            public final /* synthetic */ gxq C0;
            
            public final Object invoke(final Object o) {
                final mhh$a mhh$a = (mhh$a)o;
                zzd.f((Object)mhh$a, "$this$watch");
                mhh$a.c(new voe[] { (voe)kwq.C0, (voe)vwq.C0 }, (rtb)new zwq(this.C0));
                mhh$a.c(new voe[] { (voe)axq.C0, (voe)bxq.C0, (voe)cxq.C0, (voe)dxq.C0, (voe)exq.C0, (voe)fxq.C0 }, (rtb)new awq(this.C0));
                mhh$a.c(new voe[] { (voe)bwq.C0, (voe)cwq.C0 }, (rtb)new dwq(this.C0));
                mhh$a.c(new voe[] { (voe)ewq.C0 }, (rtb)new fwq(this.C0));
                mhh$a.c(new voe[] { (voe)gwq.C0, (voe)hwq.C0, (voe)iwq.C0, (voe)jwq.C0, (voe)lwq.C0, (voe)mwq.C0, (voe)nwq.C0, (voe)owq.C0 }, (rtb)new pwq(this.C0));
                mhh$a.c(new voe[] { (voe)qwq.C0 }, (rtb)new rwq(this.C0));
                mhh$a.c(new voe[] { (voe)swq.C0 }, (rtb)new twq(this.C0));
                mhh$a.c(new voe[] { (voe)uwq.C0 }, (rtb)new wwq(this.C0));
                mhh$a.c(new voe[] { (voe)xwq.C0 }, (rtb)new ywq(this.C0));
                return oyv.a;
            }
        });
    }
    
    @Override
    public final cjq b() {
        final LinearLayout linearLayout = (LinearLayout)super.a.findViewById(2131431633);
        final TypefacesTextView typefacesTextView = (TypefacesTextView)super.a.findViewById(2131431634);
        zzd.e((Object)typefacesTextView, "findViewById(R.id.spaces_tab_social_proof_text)");
        return new cjq(typefacesTextView, linearLayout);
    }
}
