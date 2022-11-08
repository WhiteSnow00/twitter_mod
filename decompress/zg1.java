import com.twitter.tweetview.focal.ui.translation.TweetTranslateViewModel;
import com.twitter.rooms.docker.reaction.RoomDockerReactionViewModel;
import com.twitter.ui.components.announcement.di.AnnouncementOverlayViewGraph$a;
import com.twitter.rooms.docker.RoomDockerViewModel;
import com.twitter.tweetview.core.ui.trustedfriends.TrustedFriendsBannerViewStubDelegateBinder;
import com.twitter.tweetview.core.ui.socialcontext.SocialContextDelegateBinder;
import com.twitter.tweetview.core.ui.userimage.OuterUserImageViewDelegateBinder;
import com.twitter.ui.dock.di.dock.DockObjectGraph$a;
import android.graphics.Rect;
import android.view.WindowManager;
import com.twitter.tweetview.core.ui.TweetViewViewStubDelegateBinder;
import com.twitter.ui.user.a;
import androidx.fragment.app.p;
import com.twitter.onboarding.ocf.di.ToggleWrapperObjectGraph$a;
import java.text.DecimalFormat;
import com.twitter.longform.articles.implementation.di.ArticleSummaryObjectGraph$a;
import com.twitter.profiles.navigation.ImageActivityRetainedGraph$a;
import com.twitter.tweetview.core.ui.userimage.DmOuterUserImageViewDelegateBinder;
import com.twitter.tweetview.core.ui.additionalcontext.AdditionalContextViewDelegateBinder;
import android.content.Context;
import com.twitter.subsystems.interests.ui.aggressiveprompt.TopicContextAggressivePromptViewModel;
import com.twitter.tweetview.core.ui.tweetheader.TweetCompositeHeaderCollabViewStubDelegateBinder;
import com.twitter.tweetview.core.ui.inlinesocialproof.InlineSocialProofViewDelegateBinder;
import com.twitter.tweetview.focal.ui.textcontent.FocalTweetTextContentViewDelegateBinder;
import com.twitter.tweetview.focal.ui.tweetheader.FocalTweetCollaborationHeaderViewDelegateBinder;
import com.twitter.tweetview.focal.ui.combinedbyline.CombinedBylineViewDelegateBinder;
import java.util.Set;
import com.twitter.tweetview.core.ui.tweetheader.TweetCompositeHeaderViewDelegateBinder;
import com.twitter.tweetview.core.ui.edit.FocalEditOutdatedCalloutViewDelegateBinder;
import com.twitter.tweetview.core.ui.superfollow.ExclusiveTimelineTweetEducationViewStubDelegateBinder;
import com.twitter.tweetview.core.ui.TweetViewViewStubDelegateBinderKt;
import java.util.Objects;
import com.twitter.tweetview.screenshot.core.share.ui.timestamp.OffPlatformShareTweetTimestampViewBinder;
import com.twitter.features.nudges.privatetweetbanner.EducationBannerViewModel;
import android.app.Activity;
import android.view.View;
import com.twitter.revenue.di.PlayableViewObjectGraph$a;
import androidx.fragment.app.Fragment;
import com.twitter.util.user.UserIdentifier;
import com.twitter.tweetview.core.ui.birdwatch.BirdwatchIconViewDelegateBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zg1 implements wqa
{
    public static c5x A(final BirdwatchIconViewDelegateBinder birdwatchIconViewDelegateBinder) {
        final oz1$a companion = oz1.Companion;
        return (c5x)new d5x((g6x)birdwatchIconViewDelegateBinder, (f6x$a)nz1.D0);
    }
    
    public static rcu B(final gob gob, final scu scu, final ogm ogm, final zvh zvh, final vup vup, final zbf zbf, final jev jev, final ytm ytm, final zh7 zh7, final dsb dsb, final fxe fxe, final p3q p3q, final ost ost, final o42 o42, final ibm ibm, final psc psc, final aav aav, final UserIdentifier userIdentifier, final uew uew, final wbj wbj, final mbi mbi, final juu juu, final xuu xuu, final mtv mtv, final rsv rsv, final qeu qeu, final m5b m5b, final grq grq, final ee5 ee5, final jh5 jh5, final ytm ytm2, final bra bra, final fs5 fs5, final i9u i9u, final xjq xjq, final wv1 wv1, final rg5 rg5, final h5o h5o) {
        return new rcu(gob, (Fragment)null, scu, ogm, zvh, vup, zbf, jev, (mus)null, (jvh)null, (d4f)null, (zih)null, psc, aav, userIdentifier, zh7, (ejh)null, dsb, fxe, p3q, ytm, ost, o42, ibm, (pca)null, uew, wbj, (nca)null, mbi, juu, xuu, mtv, rsv, qeu, m5b, grq, ee5, jh5, ytm2, bra, fs5, i9u, xjq, (k5c)null, rg5, h5o);
    }
    
    public static mi3 C(final ii3 ii3, final ck3 ck3) {
        final PlayableViewObjectGraph$a playableViewObjectGraph$a = (PlayableViewObjectGraph$a)ca7.u((Class)PlayableViewObjectGraph$a.class);
        zzd.f((Object)ii3, "cardActionHandler");
        zzd.f((Object)ck3, "logger");
        return (mi3)new oi3(ii3, ck3, "");
    }
    
    public static lak D(final View a, final jre g, final yqg e, final thu f, final z7x c, final Activity b, final sso d, final CharSequence charSequence, final EducationBannerViewModel j, final mbi k, final azb l, final rb6 m, final gis n, final ibm o) {
        final lak$e lak$e = new lak$e();
        lak$e.a = a;
        final int a2 = w4j.a;
        lak$e.b = b;
        lak$e.c = c;
        lak$e.d = d;
        lak$e.e = e;
        lak$e.f = f;
        lak$e.g = g;
        lak$e.h = charSequence;
        lak$e.i = charSequence;
        lak$e.j = j;
        lak$e.k = k;
        lak$e.l = l;
        lak$e.m = m;
        lak$e.n = n;
        lak$e.o = o;
        return new lak(lak$e);
    }
    
    public static zml E() {
        final cmi cmi = (cmi)ca7.u((Class)cmi.class);
        return new zml();
    }
    
    public static c5x F(final OffPlatformShareTweetTimestampViewBinder offPlatformShareTweetTimestampViewBinder) {
        final lfj lfj = (lfj)ca7.u((Class)lfj.class);
        zzd.f((Object)offPlatformShareTweetTimestampViewBinder, "binder");
        Objects.requireNonNull(c9q.Companion);
        return e5x.a((g6x)offPlatformShareTweetTimestampViewBinder, (rtb)c9q.D0);
    }
    
    public static c5x G(final cor cor) {
        return (c5x)TweetViewViewStubDelegateBinderKt.a((gub)new owu((Object)cor, 1));
    }
    
    public static c5x H(final ExclusiveTimelineTweetEducationViewStubDelegateBinder exclusiveTimelineTweetEducationViewStubDelegateBinder) {
        final vax$a companion = vax.Companion;
        return (c5x)new d5x((g6x)exclusiveTimelineTweetEducationViewStubDelegateBinder, (f6x$a)bxg.M0);
    }
    
    public static hlr I(final ibm ibm) {
        final dmf dmf = (dmf)ca7.u((Class)dmf.class);
        zzd.f((Object)ibm, "releaseCompletable");
        final zml zml = new zml();
        f.b((hlr)zml, (raa)ibm);
        return (hlr)zml;
    }
    
    public static c5x J(final Activity activity) {
        final apq apq = (apq)ca7.u((Class)apq.class);
        zzd.f((Object)activity, "activity");
        return pkx.a((rtb)new xoq(activity));
    }
    
    public static c5x K(final FocalEditOutdatedCalloutViewDelegateBinder focalEditOutdatedCalloutViewDelegateBinder) {
        final ss9$a companion = ss9.Companion;
        return (c5x)new d5x((g6x)focalEditOutdatedCalloutViewDelegateBinder, (f6x$a)ch5.F0);
    }
    
    public static c5x L(final TweetCompositeHeaderViewDelegateBinder tweetCompositeHeaderViewDelegateBinder) {
        final eeu$a companion = eeu.Companion;
        return (c5x)new d5x((g6x)tweetCompositeHeaderViewDelegateBinder, (f6x$a)lha.I0);
    }
    
    public static Set M(final ujt ujt) {
        final olf olf = (olf)ca7.u((Class)olf.class);
        return or4.r2((Iterable)tdy.w0((Object)ujt));
    }
    
    public static yix N() {
        return e1.k((Class)CombinedBylineViewDelegateBinder.class, (String)null);
    }
    
    public static c5x O() {
        return (c5x)TweetViewViewStubDelegateBinderKt.a((gub)dwu.E0);
    }
    
    public static c5x P(final FocalTweetCollaborationHeaderViewDelegateBinder focalTweetCollaborationHeaderViewDelegateBinder) {
        final tcb$a companion = tcb.Companion;
        return (c5x)new d5x((g6x)focalTweetCollaborationHeaderViewDelegateBinder, (f6x$a)cht.F0);
    }
    
    public static yix Q() {
        return e1.k((Class)FocalTweetTextContentViewDelegateBinder.class, (String)null);
    }
    
    public static c5x R(final InlineSocialProofViewDelegateBinder inlineSocialProofViewDelegateBinder) {
        return (c5x)new d5x((g6x)inlineSocialProofViewDelegateBinder, (f6x$a)qqd.G0);
    }
    
    public static c5x S(final TweetCompositeHeaderCollabViewStubDelegateBinder tweetCompositeHeaderCollabViewStubDelegateBinder) {
        final vax$a companion = vax.Companion;
        return (c5x)new d5x((g6x)tweetCompositeHeaderCollabViewStubDelegateBinder, (f6x$a)bxg.M0);
    }
    
    public static yix T() {
        return new yix(new r8x((Class)TopicContextAggressivePromptViewModel.class), (g5x)new g5x$d("TopicContextAggressivePromptStubBinder"), (c9x)c9x$c.a);
    }
    
    public static bra U(final Context context, final jev jev) {
        final kyu kyu = (kyu)ca7.u((Class)kyu.class);
        zzd.f((Object)context, "context");
        zzd.f((Object)jev, "scribeAssociation");
        return (bra)new f1x((Object)context, (Object)jev, 1);
    }
    
    public static c5x V(final AdditionalContextViewDelegateBinder additionalContextViewDelegateBinder) {
        final int d0 = hs.D0;
        return (c5x)new d5x((g6x)additionalContextViewDelegateBinder, (f6x$a)gs.D0);
    }
    
    public static c5x W(final DmOuterUserImageViewDelegateBinder dmOuterUserImageViewDelegateBinder) {
        final soj$a companion = soj.Companion;
        return (c5x)new d5x((g6x)dmOuterUserImageViewDelegateBinder, (f6x$a)bxg.H0);
    }
    
    public static nxj a(final ku6 ku6, final Context context) {
        final jyj jyj = (jyj)ca7.u((Class)jyj.class);
        zzd.f((Object)ku6, "conversationTitleFactory");
        zzd.f((Object)context, "context");
        return new nxj(ku6, context);
    }
    
    public static c5x b() {
        final xfx xfx = (xfx)ca7.u((Class)xfx.class);
        return pkx.a((rtb)vfx.C0);
    }
    
    public static Set c(final cbv cbv, final fxe fxe) {
        Object value;
        if (cbv.f) {
            value = fxe.get();
        }
        else {
            value = null;
        }
        final Set s = nmp.s(value);
        Objects.requireNonNull(s, "Cannot return null from a non-@Nullable @Provides method");
        return s;
    }
    
    public static void d() {
        final dqd dqd = (dqd)ca7.u((Class)dqd.class);
    }
    
    public static cbv e() {
        final ImageActivityRetainedGraph$a imageActivityRetainedGraph$a = (ImageActivityRetainedGraph$a)ca7.u((Class)ImageActivityRetainedGraph$a.class);
        final cbv$b cbv$b = new cbv$b();
        ((y9$a)cbv$b).a = 2131624618;
        final int a = w4j.a;
        ((y9$a)cbv$b).b = false;
        ((cbv.a)cbv$b).d = false;
        ((y9$a)cbv$b).c = 6;
        return (cbv)((h4j)cbv$b).e();
    }
    
    public static y0c f(final msm msm) {
        return new y0c(msm.b);
    }
    
    public static ryo g(final ryo ryo) {
        final hqu hqu = (hqu)ca7.u((Class)hqu.class);
        zzd.f((Object)ryo, "bound");
        return ryo;
    }
    
    public static srs h(final r3e r3e) {
        final ArticleSummaryObjectGraph$a articleSummaryObjectGraph$a = (ArticleSummaryObjectGraph$a)ca7.u((Class)ArticleSummaryObjectGraph$a.class);
        zzd.f((Object)r3e, "item");
        final srs srs = (srs)r3e.a;
        Objects.requireNonNull(srs, "Cannot return null from a non-@Nullable @Provides method");
        return srs;
    }
    
    public static m9t i(final cl0 cl0, final xau xau) {
        final DecimalFormat b = nb8.b;
        cl0.t();
        return (m9t)m9t.a;
    }
    
    public static sft j(final r3e r3e) {
        final ToggleWrapperObjectGraph$a toggleWrapperObjectGraph$a = (ToggleWrapperObjectGraph$a)ca7.u((Class)ToggleWrapperObjectGraph$a.class);
        zzd.f((Object)r3e, "item");
        final sft sft = (sft)r3e.a;
        Objects.requireNonNull(sft, "Cannot return null from a non-@Nullable @Provides method");
        return sft;
    }
    
    public static a k(final Activity activity, final p p7, final oc1 oc1, final psc psc, final UserIdentifier userIdentifier, final mbi mbi, final jev jev) {
        return (a)new k8t((Context)activity, p7, oc1, psc, userIdentifier, new dsb(), mbi, (y81)null, jev, false, false);
    }
    
    public static fjx l(final h5x h5x, final zix zix, final m8x m8x, final Set set, final ibm ibm) {
        final xkx$a xkx$a = (xkx$a)ca7.u((Class)xkx$a.class);
        zzd.f((Object)h5x, "viewBinderRegistry");
        zzd.f((Object)zix, "componentConfigRegistry");
        zzd.f((Object)m8x, "viewModelFactory");
        zzd.f((Object)set, "plugins");
        zzd.f((Object)ibm, "releaseCompletable");
        return fjx.Companion.a(h5x, (fae)ibm, zix, m8x, set);
    }
    
    public static yix m() {
        return tok.f((Class)TweetViewViewStubDelegateBinder.class, "author_appeals_pivot");
    }
    
    public static k4c n(final Context context, final WindowManager windowManager, final Rect rect, final int n) {
        final DockObjectGraph$a dockObjectGraph$a = (DockObjectGraph$a)ca7.u((Class)DockObjectGraph$a.class);
        zzd.f((Object)context, "context");
        zzd.f((Object)windowManager, "windowManager");
        zzd.f((Object)rect, "margins");
        final umo umo = new umo(context);
        final int c0 = hab.C0;
        return new k4c(Integer.valueOf(n), rect, windowManager, (hab)new mab((jbb)umo));
    }
    
    public static yix o() {
        return tok.f((Class)TweetViewViewStubDelegateBinder.class, "TweetViewDoubleTapHeartViewStub");
    }
    
    public static yix p() {
        return tok.f((Class)TweetViewViewStubDelegateBinder.class, "ForwardPivotStub");
    }
    
    public static c5x q(final FocalTweetTextContentViewDelegateBinder focalTweetTextContentViewDelegateBinder) {
        return (c5x)new d5x((g6x)focalTweetTextContentViewDelegateBinder, (f6x$a)zsu.a);
    }
    
    public static yix r() {
        return tok.f((Class)OuterUserImageViewDelegateBinder.class, (String)null);
    }
    
    public static yix s() {
        return tok.f((Class)SocialContextDelegateBinder.class, (String)null);
    }
    
    public static yix t() {
        return tok.f((Class)TrustedFriendsBannerViewStubDelegateBinder.class, (String)null);
    }
    
    public static yix u() {
        return tok.f((Class)TweetViewViewStubDelegateBinder.class, "tweet_view_nux_container");
    }
    
    public static c5x v(final xio xio, final szn szn) {
        final z0o z0o = (z0o)ca7.u((Class)z0o.class);
        zzd.f((Object)xio, "dispatcher");
        zzd.f((Object)szn, "effectHandler");
        return pkx.a((rtb)new y0o(szn));
    }
    
    public static yix w() {
        final pfn pfn = (pfn)ca7.u((Class)pfn.class);
        return new yix(new r8x((Class)RoomDockerViewModel.class, ""), (g5x)new g5x$a("RoomDocker"), (c9x)c9x$c.a);
    }
    
    public static Object x(final de0 de0) {
        final AnnouncementOverlayViewGraph$a announcementOverlayViewGraph$a = (AnnouncementOverlayViewGraph$a)ca7.u((Class)AnnouncementOverlayViewGraph$a.class);
        zzd.f((Object)de0, "fragment");
        return de0;
    }
    
    public static yix y() {
        final fen fen = (fen)ca7.u((Class)fen.class);
        return new yix(new r8x((Class)RoomDockerReactionViewModel.class, ""), (g5x)new g5x$a("RoomDockerReaction"), (c9x)c9x$c.a);
    }
    
    public static yix z() {
        final utu utu = (utu)ca7.u((Class)utu.class);
        return new yix(new r8x((Class)TweetTranslateViewModel.class, ""), (g5x)new g5x$a("TweetTranslate"), (c9x)c9x$c.a);
    }
}
