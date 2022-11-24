import android.app.Dialog;
import android.os.BaseBundle;
import androidx.recyclerview.widget.GridLayoutManager$c;
import android.os.Bundle;
import android.widget.ImageView;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.superfollows.SuperFollowsSubscriptionContentViewArgs;
import com.twitter.util.user.UserIdentifier;
import com.twitter.rooms.model.helpers.RoomUserItem;
import android.app.Activity;
import android.content.DialogInterface$OnClickListener;
import androidx.fragment.app.Fragment$InstantiationException;
import com.twitter.narrowcast.ui.StickyNarrowcastButton;
import com.twitter.common.ui.RoomRecordingAnimationView;
import android.content.res.Resources;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import android.view.ViewStub;
import android.view.View$AccessibilityDelegate;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import android.net.Uri;
import android.widget.PopupWindow$OnDismissListener;
import android.widget.PopupWindow;
import java.util.Objects;
import com.twitter.common.ui.settings.ConsumptionPreviewSettingsView;
import com.twitter.rooms.utils.RoomGuestTypeCheckBox;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import com.twitter.rooms.ticket.ui.RoomTicketPurchaseButton;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t9n implements xlx<dbn, r9n, p9n>
{
    public final zl1 F0;
    public final s4e<mmn> G0;
    public final eko H0;
    public final p2o I0;
    public final kcm J0;
    public final fci<?> K0;
    public final jfo L0;
    public final fxr M0;
    public final tmu N0;
    public final ViewGroup O0;
    public final View P0;
    public final View Q0;
    public final RecyclerView R0;
    public final RoomTicketPurchaseButton S0;
    public final TypefacesTextView T0;
    public final TypefacesTextView U0;
    public final RoomGuestTypeCheckBox V0;
    public final ymn W0;
    public final ynl<vzv> X0;
    public final hvn<ConsumptionPreviewSettingsView> Y0;
    public final t9n$h Z0;
    public final znl<Boolean> a1;
    public final TypefacesTextView b1;
    public final h5s c1;
    public final h5s d1;
    public final h5s e1;
    public final h5s f1;
    public final h5s g1;
    public final yaq<View> h1;
    public final fih<dbn> i1;
    
    public t9n(final View view, final j4e<mmn> adapter, final zl1 f0, final s4e<mmn> g0, final eko h0, final p2o i0, final ltn ltn, final kcm j0, final fci<?> k0, final jfo l0, final fxr m0, final tmu n0) {
        e0e.f((Object)view, "rootView");
        e0e.f((Object)adapter, "adapter");
        e0e.f((Object)g0, "provider");
        e0e.f((Object)h0, "roomUtilsFragmentViewEventDispatcher");
        e0e.f((Object)i0, "roomReportSpaceHelper");
        e0e.f((Object)ltn, "roomNuxDialogLauncher");
        e0e.f((Object)j0, "releaseCompletable");
        e0e.f((Object)k0, "navigator");
        e0e.f((Object)l0, "roomTicketManager");
        e0e.f((Object)m0, "sfBottomSheetPresenter");
        e0e.f((Object)n0, "pivotViewDelegate");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        final View viewById = view.findViewById(2131430682);
        e0e.e((Object)viewById, "rootView.findViewById(R.id.preview_content)");
        final ViewGroup o0 = (ViewGroup)viewById;
        this.O0 = o0;
        final View viewById2 = view.findViewById(2131431024);
        e0e.e((Object)viewById2, "rootView.findViewById(R.\u2026onsumption_error_message)");
        this.P0 = viewById2;
        final View viewById3 = view.findViewById(2131431025);
        e0e.e((Object)viewById3, "rootView.findViewById(R.\u2026_consumption_error_retry)");
        this.Q0 = viewById3;
        final View viewById4 = view.findViewById(2131431028);
        e0e.e((Object)viewById4, "rootView.findViewById(R.\u2026on_preview_recycler_view)");
        final RecyclerView r0 = (RecyclerView)viewById4;
        this.R0 = r0;
        final View viewById5 = view.findViewById(2131431027);
        e0e.e((Object)viewById5, "rootView.findViewById(R.\u2026ption_preview_join_space)");
        final RoomTicketPurchaseButton s0 = (RoomTicketPurchaseButton)viewById5;
        this.S0 = s0;
        final View viewById6 = view.findViewById(2131431957);
        e0e.e((Object)viewById6, "rootView.findViewById(R.id.text_description)");
        this.T0 = (TypefacesTextView)viewById6;
        final View viewById7 = view.findViewById(2131431023);
        e0e.e((Object)viewById7, "rootView.findViewById(R.\u2026nsumption_button_subtext)");
        this.U0 = (TypefacesTextView)viewById7;
        final View viewById8 = view.findViewById(2131431026);
        e0e.e((Object)viewById8, "rootView\n        .findVi\u2026view_guest_type_checkbox)");
        this.V0 = (RoomGuestTypeCheckBox)viewById8;
        final ymn w0 = new ymn(view);
        this.W0 = w0;
        final ynl x0 = new ynl();
        this.X0 = (ynl<vzv>)x0;
        final hvn$a companion = hvn.Companion;
        final Context context = view.getContext();
        e0e.e((Object)context, "rootView.context");
        Objects.requireNonNull(companion);
        final View inflate = View.inflate(context, 2131625479, (ViewGroup)null);
        final d7o d7o = (d7o)inflate.findViewById(2131430679);
        final PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, true);
        popupWindow.setElevation(inflate.getElevation());
        popupWindow.setOnDismissListener((PopupWindow$OnDismissListener)new gvn(x0));
        e0e.e((Object)d7o, "roomSettingsView");
        this.Y0 = (hvn<ConsumptionPreviewSettingsView>)new hvn(popupWindow, d7o);
        final Context context2 = view.getContext();
        e0e.e((Object)context2, "rootView.context");
        final int b = b1b.B(context2, 2130969074);
        final Context context3 = view.getContext();
        e0e.e((Object)context3, "rootView.context");
        this.Z0 = new gf4(view, b, b1b.B(context3, 2130969104)) {
            public final View L0;
            
            public final void onClick(final View view) {
                e0e.f((Object)view, "widget");
                final Context context = this.L0.getContext();
                e0e.e((Object)context, "rootView.context");
                final Uri parse = Uri.parse(this.L0.getContext().getString(2131959506));
                e0e.e((Object)parse, "parse(rootView.context.g\u2026string.using_spaces_url))");
                p70.p(context, parse);
            }
        };
        this.a1 = (znl<Boolean>)new znl();
        final View viewById9 = view.findViewById(2131427827);
        e0e.e((Object)viewById9, "rootView.findViewById(R.id.blocked_warning)");
        this.b1 = (TypefacesTextView)viewById9;
        this.c1 = (h5s)jty.N((ptb)new t9n$k(view));
        this.d1 = (h5s)jty.N((ptb)new t9n$i(view));
        this.e1 = (h5s)jty.N((ptb)new t9n$j(view));
        this.f1 = (h5s)jty.N((ptb)new t9n$f(view));
        this.g1 = (h5s)jty.N((ptb)new t9n$g(view));
        this.h1 = (yaq<View>)new yaq(view, 2131431070, 2131431070);
        final float n2 = 4;
        float fontScale;
        if ((fontScale = view.getResources().getConfiguration().fontScale) < 1.0f) {
            fontScale = 1.0f;
        }
        final int b2 = jb2.B0(n2 / fontScale);
        final GridLayoutManager layoutManager = new GridLayoutManager(view.getContext(), b2);
        layoutManager.s1 = (GridLayoutManager$c)new t9n$a((j4e)adapter, b2);
        r0.setLayoutManager((RecyclerView$m)layoutManager);
        r0.h((RecyclerView$l)new t9n$b((j4e)adapter));
        r0.setAdapter((RecyclerView$e)adapter);
        j0.i((sj)new kgc(w0.c, 24));
        qjy.c((View)o0, (stb)t9n$c.F0);
        ((View)w0.a).setVisibility(4);
        if (w0.h != 1) {
            w0.h = 1;
            ((View)w0.d).setVisibility(8);
            ((View)w0.g).setVisibility(0);
            w0.a((View)w0.g);
        }
        ((View)s0.getButtonView()).setAccessibilityDelegate((View$AccessibilityDelegate)new t9n$d(this));
        ltn.a();
        this.i1 = (fih<dbn>)ma7.S((stb)new t9n$t(this, view));
    }
    
    public static final ViewStub a(final t9n t9n) {
        final Object value = t9n.g1.getValue();
        e0e.e(value, "<get-disallowSFJoinStateStub>(...)");
        return (ViewStub)value;
    }
    
    public static final void b(final t9n t9n, final Set set, final List list) {
        t9n.G0.d((p4e)new zkf((Iterable)rr4.T1((Collection)rr4.b2((Iterable)set, (Comparator)new w9n()), (Iterable)list)));
    }
    
    public final void T(final ccx ccx) {
        final dbn dbn = (dbn)ccx;
        e0e.f((Object)dbn, "state");
        this.i1.b((Object)dbn);
    }
    
    public final void c(final Resources resources) {
        final Object value = this.d1.getValue();
        e0e.e(value, "<get-recordIcon>(...)");
        ((RoomRecordingAnimationView)value).a(resources.getDimensionPixelSize(2131165847), resources.getDimensionPixelSize(2131167439), resources.getDimensionPixelSize(2131167439));
    }
    
    public final StickyNarrowcastButton d() {
        final Object value = this.f1.getValue();
        e0e.e(value, "<get-communityNarrowCastButton>(...)");
        return (StickyNarrowcastButton)value;
    }
    
    public final TypefacesTextView e() {
        final Object value = this.e1.getValue();
        e0e.e(value, "<get-superFollowerLabel>(...)");
        return (TypefacesTextView)value;
    }
    
    public final void r(final Object o) {
        final p9n p9n = (p9n)o;
        e0e.f((Object)p9n, "effect");
        if (p9n instanceof p9n$b) {
            r9a.d(((p9n$b)p9n).a);
        }
        else if (p9n instanceof p9n$k) {
            final hvn<ConsumptionPreviewSettingsView> y0 = this.Y0;
            final ImageView f = this.W0.f;
            y0.b((View)f, (View)f, (hub)v9n.F0);
        }
        else if (p9n instanceof p9n$a) {
            this.Y0.a();
        }
        else if (p9n instanceof p9n$c) {
            final p2o i0 = this.I0;
            final p9n$c p9n$c = (p9n$c)p9n;
            p2o.a(i0, p9n$c.b, p9n$c.a, Long.valueOf(p9n$c.c), (String)null, false, false, false, (ckm)null, (Long)null, (String)null, (dda)null, 2008);
        }
        else if (p9n instanceof p9n$d) {
            final Bundle t = m58.t("twitter:id", 874340);
            if (!((BaseBundle)t).containsKey("twitter:id")) {
                throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
            }
            final wjo e = ehk.e(t);
            final int a = o5j.a;
            this.H0.a((lnj)new lnj.g(null, 1, null));
            ((bl1)e).e2(((dob)this.F0).P(), "TAG_ROOM_PROFILE_SHEET_FRAGMENT");
        }
        else if (p9n instanceof p9n$i) {
            final boolean a2 = ((p9n$i)p9n).a;
            final jng jng = new jng((Context)this.F0, 0);
            jng.s(2131952782);
            jng.m(2131952780);
            ((Dialog)jng.n(2131955430, (DialogInterface$OnClickListener)yva.H0).p(2131952783, (DialogInterface$OnClickListener)new s9n((Object)this, a2, 0)).create()).show();
        }
        else if (p9n instanceof p9n$h) {
            this.L0.f(((p9n$h)p9n).a, (Activity)this.F0);
        }
        else if (p9n instanceof p9n$e) {
            final Bundle t2 = m58.t("twitter:id", 874340);
            if (!((BaseBundle)t2).containsKey("twitter:id")) {
                throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
            }
            final wjo e2 = ehk.e(t2);
            final int a3 = o5j.a;
            final eko h0 = this.H0;
            final v1r h2 = v1r.H0;
            final p9n$e p9n$e = (p9n$e)p9n;
            h0.a((lnj)new lnj.k(h2, p9n$e.b, p9n$e.a, p9n$e.c, p9n$e.d, p9n$e.e, p9n$e.f, p9n$e.g, p9n$e.h));
            ((bl1)e2).e2(((dob)this.F0).P(), "TAG_ROOM_PROFILE_SHEET_FRAGMENT");
        }
        else if (p9n instanceof p9n$g) {
            jfo.Companion.a((Activity)this.F0);
        }
        else if (p9n instanceof p9n$j) {
            final fxr m0 = this.M0;
            final p9n$j p9n$j = (p9n$j)p9n;
            m0.f(p9n$j.a, p9n$j.b);
        }
        else if (p9n instanceof p9n$f) {
            final qxr a4 = ((p9n$f)p9n).a;
            this.K0.b((ContentViewArgs)new SuperFollowsSubscriptionContentViewArgs(UserIdentifier.Companion.a(a4.a), a4.b, a4.c, a4.d, a4.e));
        }
    }
    
    public final t5j<r9n> w() {
        final t5j mergeArray = t5j.mergeArray(new fbj[] { (fbj)too.f((View)this.W0.g).map((rtb)new x0i((stb)t9n$l.F0, 23)), (fbj)too.f((View)this.W0.f).map((rtb)new kzf((stb)t9n$m.F0, 22)), (fbj)((t5j)((d7o)this.Y0.b).H0).map((rtb)new wsn((stb)t9n$n.F0, 16)), (fbj)((t5j)this.X0).map((rtb)new t8o((stb)t9n$o.F0, 1)), (fbj)too.f((View)this.S0.getButtonView()).map((rtb)new dql((stb)new t9n$p(this), 25)), (fbj)((t5j)this.a1).map((rtb)new uti((stb)t9n$q.F0, 26)), (fbj)too.f(this.Q0).map((rtb)new d6i((stb)t9n$r.F0, 26)), (fbj)too.f((View)this.e()).map((rtb)new w1n((stb)t9n$s.F0, 2)) });
        e0e.e((Object)mergeArray, "override fun userIntentO\u2026lowerLabelClicked }\n    )");
        return (t5j<r9n>)mergeArray;
    }
}
