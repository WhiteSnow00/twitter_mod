import android.app.Dialog;
import android.os.BaseBundle;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import com.twitter.util.user.UserIdentifier;
import android.os.Bundle;
import android.content.Context;
import androidx.fragment.app.Fragment;
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

public final class ubn implements okx<ecn, rbn, pbn>
{
    public static final ubn.ubn$b Companion;
    public final View C0;
    public final yl1 D0;
    public final xio E0;
    public final ncn F0;
    public final ocw G0;
    public final qw8 H0;
    public final rsn I0;
    public final gjo J0;
    public final dg5 K0;
    public final RoomPrivacyCheckBox L0;
    public final TypefacesTextView M0;
    public final TwitterEditText N0;
    public final View O0;
    public final ComposerCountProgressBarView P0;
    public final TintableImageButton Q0;
    public final TintableImageButton R0;
    public final View S0;
    public final View T0;
    public final SwitchCompat U0;
    public final ImageView V0;
    public final StickyNarrowcastButton W0;
    public final mhh<ecn> X0;
    
    static {
        Companion = new ubn.ubn$b();
    }
    
    public ubn(View viewById, final yl1 d0, final xio e0, final ncn f0, final ocw g0, final qw8 h0, final rsn i0, final gjo j0, final dg5 k0) {
        zzd.f((Object)viewById, "rootView");
        zzd.f((Object)e0, "roomUtilsFragmentViewEventDispatcher");
        zzd.f((Object)f0, "roomDescriptionDispatcher");
        zzd.f((Object)g0, "userInfo");
        zzd.f((Object)h0, "dialogOpener");
        zzd.f((Object)i0, "roomNuxTooltipController");
        zzd.f((Object)j0, "roomsScribeReporter");
        zzd.f((Object)k0, "communitiesSpaceNuxDispatcher");
        this.C0 = viewById;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        final View viewById2 = viewById.findViewById(2131431028);
        zzd.e((Object)viewById2, "rootView.findViewById(R.\u2026eation_container_wrapper)");
        final ViewGroup viewGroup = (ViewGroup)viewById2;
        final View viewById3 = viewById.findViewById(2131431068);
        zzd.e((Object)viewById3, "rootView.findViewById(R.id.room_privacy_check_box)");
        this.L0 = (RoomPrivacyCheckBox)viewById3;
        final View viewById4 = viewById.findViewById(2131431709);
        zzd.e((Object)viewById4, "rootView.findViewById(R.id.start_room_button)");
        this.M0 = (TypefacesTextView)viewById4;
        final View viewById5 = viewById.findViewById(2131431031);
        zzd.e((Object)viewById5, "rootView.findViewById(R.\u2026om_description_edit_text)");
        final TwitterEditText n0 = (TwitterEditText)viewById5;
        this.N0 = n0;
        final View viewById6 = viewById.findViewById(2131431027);
        zzd.e((Object)viewById6, "rootView.findViewById(R.\u2026.room_creation_container)");
        this.O0 = viewById6;
        final View viewById7 = viewById.findViewById(2131431030);
        zzd.e((Object)viewById7, "rootView.findViewById(R.\u2026scription_composer_count)");
        final ComposerCountProgressBarView p9 = (ComposerCountProgressBarView)viewById7;
        this.P0 = p9;
        final View viewById8 = viewById.findViewById(2131427379);
        zzd.e((Object)viewById8, "rootView.findViewById(R.id.about_spaces_link)");
        final TypefacesTextView typefacesTextView = (TypefacesTextView)viewById8;
        final View viewById9 = viewById.findViewById(2131431218);
        zzd.e((Object)viewById9, "rootView.findViewById(R.id.scheduled_spaces_icon)");
        this.Q0 = (TintableImageButton)viewById9;
        final View viewById10 = viewById.findViewById(2131431182);
        zzd.e((Object)viewById10, "rootView.findViewById(R.\u2026hedule_room_image_button)");
        this.R0 = (TintableImageButton)viewById10;
        final View viewById11 = viewById.findViewById(2131432267);
        zzd.e((Object)viewById11, "rootView.findViewById(co\u2026_character_warning_count)");
        this.S0 = viewById11;
        final View viewById12 = viewById.findViewById(2131430926);
        zzd.e((Object)viewById12, "rootView.findViewById(R.id.recording_layout)");
        this.T0 = viewById12;
        final View viewById13 = viewById.findViewById(2131430923);
        zzd.e((Object)viewById13, "rootView.findViewById(R.id.record_toggle)");
        this.U0 = (SwitchCompat)viewById13;
        final View viewById14 = viewById.findViewById(2131430925);
        zzd.e((Object)viewById14, "rootView.findViewById(R.id.recording_info)");
        this.V0 = (ImageView)viewById14;
        viewById = viewById.findViewById(2131431762);
        zzd.e((Object)viewById, "rootView.findViewById(R.\u2026sticky_narrowcast_button)");
        this.W0 = (StickyNarrowcastButton)viewById;
        int visibility = 8;
        viewById11.setVisibility(8);
        ((TextView)n0).setRawInputType(1);
        ((TextView)n0).setOnEditorActionListener((TextView$OnEditorActionListener)new rpk((Object)this, 1));
        ((TextView)n0).addTextChangedListener((TextWatcher)new vbn(this));
        ic0.b((View)p9, 300, (Interpolator)null, 0.0f, 1.0f);
        p9.setMaxWeightedCharacterCount(70);
        ((View)typefacesTextView).setVisibility(0);
        ((View)typefacesTextView).setOnClickListener((View$OnClickListener)new n39((Object)this, 6));
        if (oio.x()) {
            visibility = 0;
        }
        viewById12.setVisibility(visibility);
        drz.a((View)viewGroup, (rtb)ubn$a.C0);
        if (dta.b().b("voice_rooms_topics_tagging_creation_enabled", false)) {
            ((ggm)f0).a((Object)"");
        }
        this.X0 = (mhh<ecn>)ajy.a0((rtb)new ubn$k(this));
    }
    
    public static final void a(final ubn ubn, final g9i g9i) {
        ubn.W0.c(g9i, true);
        ubn.W0.setOnStickyButtonClickListener((View$OnClickListener)new bas((Object)ubn, (Object)g9i, 21));
        final TypefacesTextView m0 = ubn.M0;
        int backgroundResource;
        if (zzd.a((Object)g9i, (Object)g9i.e.b)) {
            backgroundResource = 2131233237;
        }
        else {
            backgroundResource = 2131233239;
        }
        ((AppCompatTextView)m0).setBackgroundResource(backgroundResource);
    }
    
    public final void T(final oax oax) {
        final ecn ecn = (ecn)oax;
        zzd.f((Object)ecn, "state");
        this.X0.b((Object)ecn);
    }
    
    public final void s(final Object o) {
        final pbn pbn = (pbn)o;
        zzd.f((Object)pbn, "effect");
        if (pbn instanceof pbn$c) {
            final Bundle w = zi.w("twitter:id", 874340);
            if (!((BaseBundle)w).containsKey("twitter:id")) {
                throw new Fragment.InstantiationException("Missing fragment id", null);
            }
            final pio f = xha.f(w);
            final int a = w4j.a;
            this.E0.a((qmj)new qmj$g((byk)null, 1, (hg8)null));
            ((cl1)f).e2(((gob)this.D0).Q(), "TAG_ROOM_PROFILE_SHEET_FRAGMENT");
        }
        else if (pbn instanceof pbn$b) {
            ore.c(this.C0);
        }
        else if (zzd.a((Object)pbn, (Object)pbn$a.a)) {
            ((View)this.N0).requestFocus();
            ore.d((View)this.N0);
        }
        else if (pbn instanceof pbn$e) {
            final UserIdentifier k = this.G0.k();
            zzd.e((Object)k, "userInfo.userIdentifier");
            if (oio.Q(k)) {
                ((Dialog)new jwn((Context)this.D0, true)).show();
            }
        }
        else if (pbn instanceof pbn$d) {
            ((Dialog)new jwn((Context)this.D0, true)).show();
        }
    }
    
    public final b5j<rbn> x() {
        final b5j mergeArray = b5j.mergeArray(new naj[] { (naj)asy.q((View)this.M0).map((qtb)new ozb((rtb)new ubn$d(this), 23)), (naj)((b5j)this.L0.G0).map((qtb)new sbn((rtb)ubn$e.C0, 0)), (naj)asy.q(this.O0).map((qtb)new wpl((rtb)ubn$f.C0, 29)), (naj)asy.q((View)this.R0).map((qtb)new uii((rtb)new ubn$g(this), 26)), (naj)asy.q((View)this.U0).map((qtb)new i5i((rtb)ubn$h.C0, 27)), (naj)asy.q((View)this.V0).map((qtb)new naf((rtb)ubn$i.C0, 21)), (naj)asy.q((View)this.Q0).map((qtb)new r0n((rtb)ubn$j.C0, 5)) });
        zzd.e((Object)mergeArray, "override fun userIntentO\u2026pacesLinkClicked },\n    )");
        return (b5j<rbn>)mergeArray;
    }
}
