import com.twitter.tweetview.core.ui.tweetheader.TweetHeaderE2EViewDelegateBinder;
import tv.periscope.android.api.AuthedApiService;
import android.os.Handler;
import tv.periscope.android.ui.broadcast.ChatRoomView;
import com.twitter.tweetview.core.ui.translation.InlineTranslateDelegateBinder;
import com.twitter.tweetview.core.ui.forwardpivot.ForwardPivotViewDelegateBinder;
import com.twitter.tweetview.core.ui.superfollow.ExclusiveTimelineTweetEducationViewDelegateBinder;
import com.twitter.tweetview.core.ui.TweetViewViewStubDelegateBinder;
import com.twitter.explore.immersive.ui.overlay.ExpandOverlayViewDelegateBinder;
import com.twitter.onboarding.ocf.settings.ButtonItemComponentViewModel;
import com.twitter.timeline.itembinder.ui.IconLabelViewModel;
import com.twitter.app.legacy.client.di.TwitterWebViewRetainedGraph;
import com.twitter.tweetview.core.ui.userimage.UserImageViewDelegateBinder;
import tv.periscope.android.api.service.hydra.GuestServiceInteractor;
import tv.periscope.android.api.service.GuestServiceApi;
import com.twitter.tweetview.core.ui.tweetheader.TweetHeaderViewStubDelegateBinder;
import tv.periscope.model.b;
import com.twitter.android.av.dock.di.dock.VideoDockObjectGraph$a;
import android.view.ViewStub;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.LayoutInflater;
import com.twitter.android.liveevent.card.di.LiveEventCardObjectGraph$a;
import android.view.View;
import com.twitter.util.user.UserIdentifier;
import android.app.Activity;
import com.twitter.tweetview.core.ui.tweetheader.TweetHeaderFollowButtonDelegateBinder;
import com.twitter.android.broadcast.di.view.c;
import com.twitter.tweetview.core.ui.TweetViewViewStubDelegateBinderKt;
import com.twitter.tweetview.core.ui.conversationcontrols.ConversationControlsViewStubDelegateBinder;
import com.twitter.onboarding.ocf.di.TweetComponentObjectGraph$a;
import com.twitter.tweetview.core.TweetViewViewModel;
import java.util.Objects;
import com.twitter.tweetview.core.ui.curation.CurationSocialContextDelegateBinder;
import com.twitter.tweetdetail.newreplies.TweetDetailNewRepliesBannerViewModel;
import com.twitter.tweetdetail.destinationoverlay.TweetDetailDestinationOverLayViewModel;
import androidx.fragment.app.Fragment;
import com.twitter.android.broadcast.di.view.e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ci implements wqa
{
    public static njh A(final g44 g44) {
        final int a = gn2.a;
        return (njh)new e(g44);
    }
    
    public static uob B(final Fragment fragment, final kyr kyr, final ibm ibm) {
        pf8.r(fragment);
        final g3g b = g3g.b((lbf)fragment);
        zzd.f((Object)kyr, "loaderSupplier");
        zzd.f((Object)ibm, "releaseCompletable");
        return new uob(b, kyr, ibm, 0, 8, null);
    }
    
    public static daq C(final psc psc) {
        final y5f$a y5f$a = (y5f$a)ca7.u((Class)y5f$a.class);
        zzd.f((Object)psc, "requestController");
        return (daq)new x5f(psc);
    }
    
    public static yix D() {
        final pgu pgu = (pgu)ca7.u((Class)pgu.class);
        return new yix(new r8x((Class)TweetDetailDestinationOverLayViewModel.class, ""), (g5x)new g5x$a("TweetDetailDestinationOverLay"), (c9x)c9x$c.a);
    }
    
    public static yix E() {
        final igu igu = (igu)ca7.u((Class)igu.class);
        return new yix(new r8x((Class)TweetDetailNewRepliesBannerViewModel.class, ""), (g5x)new g5x$a("TweetDetailNewRepliesBanner"), (c9x)c9x$c.a);
    }
    
    public static c5x F(final CurationSocialContextDelegateBinder curationSocialContextDelegateBinder, final wv1 wv1) {
        return (c5x)new d5x((g6x)curationSocialContextDelegateBinder, (f6x$a)new hwu(wv1, 1));
    }
    
    public static f6j G(final uob uob, final z7x z7x) {
        Objects.requireNonNull(uob);
        return hfe.c((f6j)uob, z7x, true);
    }
    
    public static TweetViewViewModel H() {
        final TweetComponentObjectGraph$a tweetComponentObjectGraph$a = (TweetComponentObjectGraph$a)ca7.u((Class)TweetComponentObjectGraph$a.class);
        return new TweetViewViewModel();
    }
    
    public static c5x I(final ConversationControlsViewStubDelegateBinder conversationControlsViewStubDelegateBinder) {
        final vax$a companion = vax.Companion;
        return (c5x)new d5x((g6x)conversationControlsViewStubDelegateBinder, (f6x$a)bxg.M0);
    }
    
    public static c5x J() {
        return (c5x)TweetViewViewStubDelegateBinderKt.a((gub)swu.C0);
    }
    
    public static p7f K(final y8f y8f, final pcl pcl) {
        final int a = gn2.a;
        return (p7f)new c(new rd6(), y8f, pcl);
    }
    
    public static c5x L(final TweetHeaderFollowButtonDelegateBinder tweetHeaderFollowButtonDelegateBinder) {
        final qlu$a companion = qlu.Companion;
        return (c5x)new d5x((g6x)tweetHeaderFollowButtonDelegateBinder, (f6x$a)ph1.F0);
    }
    
    public static c5w M(final Activity activity) {
        return new c5w(activity, UserIdentifier.getCurrent());
    }
    
    public static sfa N(final wci wci) {
        Objects.requireNonNull(wci, "Cannot return null from a non-@Nullable @Provides method");
        return (sfa)wci;
    }
    
    public static gnf O(final lcv lcv) {
        final k6m h0 = lcv.H0;
        Objects.requireNonNull(h0, "Cannot return null from a non-@Nullable @Provides method");
        return (gnf)h0;
    }
    
    public static View P(final Activity activity, final krf krf, final z19 z19) {
        final n2x d0 = n2x.D0;
        final LiveEventCardObjectGraph$a liveEventCardObjectGraph$a = (LiveEventCardObjectGraph$a)ca7.u((Class)LiveEventCardObjectGraph$a.class);
        zzd.f((Object)activity, "activity");
        zzd.f((Object)krf, "cardLayoutFactory");
        zzd.f((Object)z19, "displayMode");
        final boolean b = z19 instanceof a29;
        int n;
        if (b) {
            n = 2131624912;
        }
        else {
            n = 2131624911;
        }
        final LayoutInflater from = LayoutInflater.from((Context)activity);
        final FrameLayout frameLayout = new FrameLayout((Context)activity);
        final boolean b2 = false;
        final View inflate = from.inflate(n, (ViewGroup)frameLayout, false);
        zzd.e((Object)inflate, "from(activity).inflate(l\u2026eLayout(activity), false)");
        final z19$l k = z19.k;
        int n2 = b2 ? 1 : 0;
        if (z19 != k) {
            n2 = (b2 ? 1 : 0);
            if (!b) {
                n2 = 1;
            }
        }
        n2x c0;
        if (n2 != 0) {
            c0 = n2x.C0;
        }
        else {
            c0 = d0;
        }
        Object o;
        if (c0 != d0) {
            o = new mpj(n2x.b(((Context)activity).getResources()));
        }
        else {
            o = new lmi();
        }
        ((jax)o).a(inflate);
        final ViewStub viewStub = (ViewStub)inflate.findViewById(2131431155);
        int layoutResource;
        if (krf.c == k) {
            layoutResource = 2131624922;
        }
        else {
            layoutResource = 2131624919;
        }
        viewStub.setLayoutResource(layoutResource);
        viewStub.inflate();
        return inflate;
    }
    
    public static ViewGroup Q(final Context context) {
        final VideoDockObjectGraph$a videoDockObjectGraph$a = (VideoDockObjectGraph$a)ca7.u((Class)VideoDockObjectGraph$a.class);
        zzd.f((Object)context, "context");
        final View inflate = LayoutInflater.from(context).inflate(2131625978, (ViewGroup)null);
        zzd.d((Object)inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup)inflate;
    }
    
    public static l5k R(final Context context, final tqm tqm, final UserIdentifier userIdentifier, final oof oof, final n5k n5k, final r5k r5k, final xou xou, final xjq xjq) {
        final int a = gn2.a;
        final b f = oof.f(oof);
        vo6 i;
        if (oof instanceof wec) {
            i = ((wec)oof).i();
        }
        else {
            i = null;
        }
        return new l5k(context, tqm, userIdentifier, i, n5k, r5k, xou, pjr.o(f.d0(), 0L), xjq);
    }
    
    public static c5x S(final TweetHeaderViewStubDelegateBinder tweetHeaderViewStubDelegateBinder) {
        final vax$a companion = vax.Companion;
        return (c5x)new d5x((g6x)tweetHeaderViewStubDelegateBinder, (f6x$a)bxg.M0);
    }
    
    public static GuestServiceInteractor T(final GuestServiceApi guestServiceApi) {
        final int a = gn2.a;
        return new GuestServiceInteractor(guestServiceApi);
    }
    
    public static c5x U(final UserImageViewDelegateBinder userImageViewDelegateBinder, final wv1 wv1) {
        return (c5x)new d5x((g6x)userImageViewDelegateBinder, (f6x$a)new mwu(wv1));
    }
    
    public static su1 a(final ku1 ku1) {
        final e7l e7l = (e7l)ca7.u((Class)e7l.class);
        zzd.f((Object)ku1, "internalConfig");
        return (su1)new d7l(ku1);
    }
    
    public static pca b(final lcv lcv) {
        final ctj t0 = lcv.T0;
        Objects.requireNonNull(t0, "Cannot return null from a non-@Nullable @Provides method");
        return (pca)t0;
    }
    
    public static cbv c() {
        final TwitterWebViewRetainedGraph.a a = (TwitterWebViewRetainedGraph.a)ca7.u((Class)TwitterWebViewRetainedGraph.a.class);
        final cbv$b cbv$b = new cbv$b();
        ((y9$a)cbv$b).a = 2131625473;
        final int a2 = w4j.a;
        ((cbv.a)cbv$b).d = false;
        ((y9$a)cbv$b).b = true;
        return (cbv)((h4j)cbv$b).e();
    }
    
    public static c5x d() {
        final wxt wxt = (wxt)ca7.u((Class)wxt.class);
        return pkx.a((rtb)vxt.C0);
    }
    
    public static yix e() {
        final v4d v4d = (v4d)ca7.u((Class)v4d.class);
        return new yix(new r8x((Class)IconLabelViewModel.class, ""), (g5x)new g5x$a("IconLabel"), (c9x)c9x$c.a);
    }
    
    public static void f() {
        final wx9 wx9 = (wx9)ca7.u((Class)wx9.class);
    }
    
    public static c5x g() {
        final lhc lhc = (lhc)ca7.u((Class)lhc.class);
        return pkx.a((rtb)khc.C0);
    }
    
    public static w2a h(final y0c y0c) {
        w2a w2a = (w2a)yvj.f(((zl1)y0c).a, "empty_config", (alp)w2a.i);
        if (w2a == null) {
            final w2a$a w2a$a = new w2a$a();
            w2a$a.h = h3a.J0;
            final jx6 a = yds.a;
            w2a$a.a = (yds)new jjr(2131953816);
            w2a = (w2a)((h4j)w2a$a).e();
        }
        return w2a;
    }
    
    public static mda i(au1 au1, final kli kli, final rt1 rt1) {
        final cu1 cu1 = (cu1)ca7.u((Class)cu1.class);
        zzd.f((Object)au1, "processor");
        zzd.f((Object)rt1, "configuration");
        if (!rt1.a) {
            au1 = (au1)kli;
        }
        return (mda)au1;
    }
    
    public static jcd j(final mts mts) {
        final oka oka = (oka)ca7.u((Class)oka.class);
        zzd.f((Object)mts, "contentViewProvider");
        return (jcd)mts;
    }
    
    public static yix k() {
        final w43 w43 = (w43)ca7.u((Class)w43.class);
        return new yix(new r8x((Class)ButtonItemComponentViewModel.class, ""), (g5x)new g5x$a("ButtonItemComponent"), (c9x)c9x$c.a);
    }
    
    public static c5x l(final ExpandOverlayViewDelegateBinder expandOverlayViewDelegateBinder) {
        final oka oka = (oka)ca7.u((Class)oka.class);
        zzd.f((Object)expandOverlayViewDelegateBinder, "viewBinder");
        Objects.requireNonNull(mha.Companion);
        final mha$a companion = mha.Companion;
        return (c5x)new d5x((g6x)expandOverlayViewDelegateBinder, (f6x$a)lha.D0);
    }
    
    public static qa7 m() {
        final int a = gn2.a;
        return new qa7();
    }
    
    public static c5x n(final de6 de6, final owd owd) {
        return pkx.a((rtb)new awu((Object)de6, (Object)owd, 1));
    }
    
    public static yix o() {
        return tok.f((Class)TweetViewViewStubDelegateBinder.class, "ConversationBannerViewStubBinder");
    }
    
    public static yix p() {
        return tok.f((Class)ExclusiveTimelineTweetEducationViewDelegateBinder.class, (String)null);
    }
    
    public static zi2 q(final Context context, final aj2 aj2, final tj2 tj2, final d9w d9w, final i9d i9d) {
        final int a = gn2.a;
        final qut e = kz.e;
        return new zi2(context, tj2, aj2, d9w, i9d);
    }
    
    public static c5x r(final ForwardPivotViewDelegateBinder forwardPivotViewDelegateBinder) {
        return (c5x)new d5x((g6x)forwardPivotViewDelegateBinder, (f6x$a)jlu.H0);
    }
    
    public static yix s() {
        return tok.f((Class)InlineTranslateDelegateBinder.class, (String)null);
    }
    
    public static eok t(final ChatRoomView chatRoomView, final t9f t9f, final bl2 bl2, final Handler handler) {
        final int a = gn2.a;
        return (eok)new fok(chatRoomView.getPlaytimeViewModule(), t9f, (gok)bl2, new mlw(), handler);
    }
    
    public static zml u() {
        final gy6 gy6 = (gy6)ca7.u((Class)gy6.class);
        return new zml();
    }
    
    public static zq9 v(final LayoutInflater layoutInflater, final ar9 ar9, final lgm lgm, final vtj vtj, final Activity activity, final i9d i9d, final AuthedApiService authedApiService, final hmp hmp, final mf2 mf2) {
        final int a = gn2.a;
        final View inflate = layoutInflater.inflate(2131625329, (ViewGroup)null);
        final Context context = inflate.getContext();
        final gr9 gr9 = new gr9(inflate);
        final b a2 = ar9.a();
        fr9 fr9;
        if (a2 == null) {
            fr9 = new fr9((Long)null, (Long)null, "");
        }
        else {
            fr9 = new fr9(a2.O(), a2.P(), nkz.n(inflate.getResources(), a2));
        }
        return new zq9(context, lgm, gr9, i9d, ar9, vtj, (er9)fr9, authedApiService, hmp, mf2, (tq9)new vq9(activity));
    }
    
    public static yix w() {
        return tok.f((Class)TweetViewViewStubDelegateBinder.class, "super_follower_label");
    }
    
    public static yix x() {
        return tok.f((Class)TweetHeaderE2EViewDelegateBinder.class, (String)null);
    }
    
    public static vzc y(final i9d i9d) {
        final int a = gn2.a;
        return new vzc(i9d);
    }
    
    public static Boolean z() {
        final Boolean value = drz.n();
        Objects.requireNonNull(value, "Cannot return null from a non-@Nullable @Provides method");
        return value;
    }
}
