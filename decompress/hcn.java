import android.app.Dialog;
import android.os.BaseBundle;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import com.twitter.util.user.UserIdentifier;
import android.os.Bundle;
import android.content.Context;
import androidx.fragment.app.Fragment$InstantiationException;
import android.view.View$OnClickListener;
import android.view.animation.Interpolator;
import android.text.TextWatcher;
import android.widget.TextView$OnEditorActionListener;
import android.view.ViewGroup;
import com.twitter.narrowcast.ui.StickyNarrowcastButton;
import android.widget.ImageView;
import androidx.appcompat.widget.SwitchCompat;
import com.twitter.ui.widget.TintableImageButton;
import com.twitter.subsystem.composer.ComposerCountProgressBarView;
import com.twitter.ui.widget.TwitterEditText;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import com.twitter.rooms.utils.RoomPrivacyCheckBox;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hcn implements ilx<rcn, fcn, dcn>
{
    public static final hcn.hcn$b Companion;
    public final View D0;
    public final ul1 E0;
    public final mjo F0;
    public final adn G0;
    public final adw H0;
    public final aw8 I0;
    public final ftn J0;
    public final vjo K0;
    public final lf5 L0;
    public final RoomPrivacyCheckBox M0;
    public final TypefacesTextView N0;
    public final TwitterEditText O0;
    public final View P0;
    public final ComposerCountProgressBarView Q0;
    public final TintableImageButton R0;
    public final TintableImageButton S0;
    public final View T0;
    public final View U0;
    public final SwitchCompat V0;
    public final ImageView W0;
    public final StickyNarrowcastButton X0;
    public final rhh<rcn> Y0;
    
    static {
        Companion = new hcn.hcn$b();
    }
    
    public hcn(View viewById, final ul1 e0, final mjo f0, final adn g0, final adw h0, final aw8 i0, final ftn j0, final vjo k0, final lf5 l0) {
        czd.f((Object)viewById, "rootView");
        czd.f((Object)f0, "roomUtilsFragmentViewEventDispatcher");
        czd.f((Object)g0, "roomDescriptionDispatcher");
        czd.f((Object)h0, "userInfo");
        czd.f((Object)i0, "dialogOpener");
        czd.f((Object)j0, "roomNuxTooltipController");
        czd.f((Object)k0, "roomsScribeReporter");
        czd.f((Object)l0, "communitiesSpaceNuxDispatcher");
        this.D0 = viewById;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        final View viewById2 = viewById.findViewById(2131431030);
        czd.e((Object)viewById2, "rootView.findViewById(R.\u2026eation_container_wrapper)");
        final ViewGroup viewGroup = (ViewGroup)viewById2;
        final View viewById3 = viewById.findViewById(2131431070);
        czd.e((Object)viewById3, "rootView.findViewById(R.id.room_privacy_check_box)");
        this.M0 = (RoomPrivacyCheckBox)viewById3;
        final View viewById4 = viewById.findViewById(2131431712);
        czd.e((Object)viewById4, "rootView.findViewById(R.id.start_room_button)");
        this.N0 = (TypefacesTextView)viewById4;
        final View viewById5 = viewById.findViewById(2131431033);
        czd.e((Object)viewById5, "rootView.findViewById(R.\u2026om_description_edit_text)");
        final TwitterEditText o0 = (TwitterEditText)viewById5;
        this.O0 = o0;
        final View viewById6 = viewById.findViewById(2131431029);
        czd.e((Object)viewById6, "rootView.findViewById(R.\u2026.room_creation_container)");
        this.P0 = viewById6;
        final View viewById7 = viewById.findViewById(2131431032);
        czd.e((Object)viewById7, "rootView.findViewById(R.\u2026scription_composer_count)");
        final ComposerCountProgressBarView q0 = (ComposerCountProgressBarView)viewById7;
        this.Q0 = q0;
        final View viewById8 = viewById.findViewById(2131427379);
        czd.e((Object)viewById8, "rootView.findViewById(R.id.about_spaces_link)");
        final TypefacesTextView typefacesTextView = (TypefacesTextView)viewById8;
        final View viewById9 = viewById.findViewById(2131431220);
        czd.e((Object)viewById9, "rootView.findViewById(R.id.scheduled_spaces_icon)");
        this.R0 = (TintableImageButton)viewById9;
        final View viewById10 = viewById.findViewById(2131431184);
        czd.e((Object)viewById10, "rootView.findViewById(R.\u2026hedule_room_image_button)");
        this.S0 = (TintableImageButton)viewById10;
        final View viewById11 = viewById.findViewById(2131432270);
        czd.e((Object)viewById11, "rootView.findViewById(co\u2026_character_warning_count)");
        this.T0 = viewById11;
        final View viewById12 = viewById.findViewById(2131430928);
        czd.e((Object)viewById12, "rootView.findViewById(R.id.recording_layout)");
        this.U0 = viewById12;
        final View viewById13 = viewById.findViewById(2131430925);
        czd.e((Object)viewById13, "rootView.findViewById(R.id.record_toggle)");
        this.V0 = (SwitchCompat)viewById13;
        final View viewById14 = viewById.findViewById(2131430927);
        czd.e((Object)viewById14, "rootView.findViewById(R.id.recording_info)");
        this.W0 = (ImageView)viewById14;
        viewById = viewById.findViewById(2131431765);
        czd.e((Object)viewById, "rootView.findViewById(R.\u2026sticky_narrowcast_button)");
        this.X0 = (StickyNarrowcastButton)viewById;
        int visibility = 8;
        viewById11.setVisibility(8);
        ((TextView)o0).setRawInputType(1);
        ((TextView)o0).setOnEditorActionListener((TextView$OnEditorActionListener)new i2c(this, 1));
        ((TextView)o0).addTextChangedListener((TextWatcher)new icn(this));
        ec0.b((View)q0, 300, (Interpolator)null, 0.0f, 1.0f);
        q0.setMaxWeightedCharacterCount(70);
        ((View)typefacesTextView).setVisibility(0);
        ((View)typefacesTextView).setOnClickListener((View$OnClickListener)new esk((Object)this, 28));
        if (djo.x()) {
            visibility = 0;
        }
        viewById12.setVisibility(visibility);
        uli.d((View)viewGroup, (qsb)hcn$a.D0);
        if (asa.b().b("voice_rooms_topics_tagging_creation_enabled", false)) {
            ((wgm)g0).a((Object)"");
        }
        this.Y0 = (rhh<rcn>)q3j.g0((qsb)new hcn$k(this));
    }
    
    public static final void a(final hcn hcn, final h9i h9i) {
        hcn.X0.c(h9i, true);
        hcn.X0.setOnStickyButtonClickListener((View$OnClickListener)new dip((Object)hcn, (Object)h9i, 20));
        final TypefacesTextView n0 = hcn.N0;
        int backgroundResource;
        if (czd.a((Object)h9i, (Object)h9i$e.b)) {
            backgroundResource = 2131233239;
        }
        else {
            backgroundResource = 2131233241;
        }
        ((AppCompatTextView)n0).setBackgroundResource(backgroundResource);
    }
    
    public final void T(final jbx jbx) {
        final rcn rcn = (rcn)jbx;
        czd.f((Object)rcn, "state");
        this.Y0.b((Object)rcn);
    }
    
    public final void q(final Object o) {
        final dcn dcn = (dcn)o;
        czd.f((Object)dcn, "effect");
        if (dcn instanceof dcn$c) {
            final Bundle a = nh.A("twitter:id", 874340);
            if (!((BaseBundle)a).containsKey("twitter:id")) {
                throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
            }
            final ejo k = m1f.k(a);
            final int a2 = c5j.a;
            this.F0.a((vmj)new vmj.g(null, 1, null));
            ((wk1)k).e2(((cnb)this.E0).P(), "TAG_ROOM_PROFILE_SHEET_FRAGMENT");
        }
        else if (dcn instanceof dcn$b) {
            are.c(this.D0);
        }
        else if (czd.a((Object)dcn, (Object)dcn$a.a)) {
            ((View)this.O0).requestFocus();
            are.d((View)this.O0);
        }
        else if (dcn instanceof dcn$e) {
            final UserIdentifier i = this.H0.k();
            czd.e((Object)i, "userInfo.userIdentifier");
            if (djo.Q(i)) {
                ((Dialog)new wwn((Context)this.E0, true)).show();
            }
        }
        else if (dcn instanceof dcn$d) {
            ((Dialog)new wwn((Context)this.E0, true)).show();
        }
    }
    
    public final h5j<fcn> w() {
        final h5j mergeArray = h5j.mergeArray(new taj[] { (taj)max.h((View)this.N0).map((psb)new b9n((qsb)new hcn$d(this), 1)), (taj)((h5j)this.M0.H0).map((psb)new wtn((qsb)hcn$e.D0, 4)), (taj)max.h(this.P0).map((psb)new ap((qsb)hcn$f.D0, 29)), (taj)max.h((View)this.S0).map((psb)new g0i((qsb)new hcn$g(this), 24)), (taj)max.h((View)this.V0).map((psb)new vt1((qsb)hcn$h.D0, 22)), (taj)max.h((View)this.W0).map((psb)new oyf((qsb)hcn$i.D0, 19)), (taj)max.h((View)this.R0).map((psb)new lql((qsb)hcn$j.D0, 29)) });
        czd.e((Object)mergeArray, "override fun userIntentO\u2026pacesLinkClicked },\n    )");
        return (h5j<fcn>)mergeArray;
    }
}
