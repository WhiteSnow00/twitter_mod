import android.view.View;
import com.twitter.tweetview.core.ui.ConstraintsViewDelegateBinder;
import com.twitter.tweetview.core.di.TweetHostObjectGraph$a;
import java.util.Map;
import com.twitter.tweetview.core.ui.communities.CommunitiesHiddenTweetViewDelegateBinder;
import android.content.res.Resources;
import android.app.Activity;
import tv.periscope.android.ui.broadcast.view.MenuViewPager;
import tv.periscope.android.view.RootDragLayout;
import com.twitter.tweetview.core.ui.textcontent.TextContentViewDelegateBinder;
import tv.periscope.android.api.ApiManager;
import com.twitter.tweetview.core.ui.mediatags.MediaTagsViewDelegateBinder;
import com.twitter.tweetview.core.ui.curation.CurationViewDelegateBinder;
import tv.periscope.model.b;
import com.twitter.tweetview.core.ui.curation.CurationSocialContextDelegateBinder;
import tv.periscope.android.api.AuthedApiService;
import com.twitter.tweetview.core.ui.forwardpivot.SoftInterventionForwardPivotV2ViewDelegateBinder;
import com.twitter.tweetview.focal.ui.mediatags.FocalTweetMediaTagsViewDelegateBinder;
import com.twitter.tweetview.screenshot.core.share.ui.tweetheader.OffPlatformShareTweetHeaderViewDelegateBinder;
import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.p;
import android.content.Context;
import com.twitter.tweetview.core.ui.socialcontext.SocialContextEducationDelegateBinder;
import com.twitter.tweetview.core.ui.conversationcontrols.ConversationControlsViewDelegateBinder;
import com.twitter.tweetview.core.ui.TweetViewViewStubDelegateBinder;
import com.twitter.tweetview.core.ui.tombstone.SensitiveMediaNoPreviewInterstitialViewDelegateBinder;
import com.twitter.tweetview.focal.ui.replycontext.FocalTweetReplyContextViewDelegateBinder;
import com.twitter.subsystems.interests.ui.topics.implicitprompt.ImplicitTopicPromptViewModel;
import com.twitter.commerce.shopmodule.core.ShopModuleViewModel;
import com.twitter.tweetview.focal.ui.quote.FocalQuoteViewDelegateBinder;
import com.twitter.tweetview.core.ui.TweetViewViewStubDelegateBinderKt;
import com.twitter.android.av.video.TwitterMediaPlayerArgs;
import com.twitter.tweetview.core.ui.superfollow.SuperFollowerLabelViewDelegateBinder;
import com.twitter.tweetview.focal.ui.replyfilter.ReplyFilterViewDelegateBinder;
import com.twitter.tweetview.focal.ui.badge.FocalTweetBadgeViewDelegateBinder;
import com.twitter.communities.tweetanatomy.ui.CommunitiesTweetFacepileViewDelegateBinder;
import com.twitter.tweetview.core.TweetViewViewModel;
import com.twitter.communities.toolbarsearch.CommunitiesSearchToolbarViewModel;
import java.util.Objects;
import com.twitter.tweetview.focal.ui.reader.ReaderModeEntryButtonTweetViewDelegateBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rg implements bra
{
    public static o6x A(final ReaderModeEntryButtonTweetViewDelegateBinder readerModeEntryButtonTweetViewDelegateBinder) {
        final a2m$a companion = a2m.Companion;
        return (o6x)new p6x((r7x)readerModeEntryButtonTweetViewDelegateBinder, (q7x$a)f3x.J0);
    }
    
    public static d4e B(final h2q h2q) {
        final d3q d3q = (d3q)lp7.m0((Class)d3q.class);
        e0e.f((Object)h2q, "shopModuleItemBinder");
        return (d4e)new skg(vmw.F(new awj((Object)c1q$b.class, (Object)h2q)));
    }
    
    public static void C() {
        final b1k b1k = (b1k)lp7.m0((Class)b1k.class);
        Objects.requireNonNull(e1k.Companion);
    }
    
    public static ikx D() {
        final rf5 rf5 = (rf5)lp7.m0((Class)rf5.class);
        return new ikx(new fax((Class)CommunitiesSearchToolbarViewModel.class, ""), (s6x)new s6x$a("CommunitiesSearchToolbar"), (qax)qax$c.a);
    }
    
    public static ikx E() {
        final oh5 oh5 = (oh5)lp7.m0((Class)oh5.class);
        return new ikx(new fax((Class)TweetViewViewModel.class, (String)null, 2, (wg8)null), (s6x)new s6x$c((Class)CommunitiesTweetFacepileViewDelegateBinder.class, "CommunitiesConversationFacepileContainer"), (qax)qax$c.a);
    }
    
    public static o6x F(final FocalTweetBadgeViewDelegateBinder focalTweetBadgeViewDelegateBinder) {
        return (o6x)new p6x((r7x)focalTweetBadgeViewDelegateBinder, (q7x$a)nh1.H0);
    }
    
    public static o6x G(final ReplyFilterViewDelegateBinder replyFilterViewDelegateBinder) {
        final uim$a companion = uim.Companion;
        return (o6x)new p6x((r7x)replyFilterViewDelegateBinder, (q7x$a)uxg.M0);
    }
    
    public static o6x H(final SuperFollowerLabelViewDelegateBinder superFollowerLabelViewDelegateBinder, final fxr fxr) {
        Objects.requireNonNull(zwr.Companion);
        e0e.f((Object)fxr, "superFollowsBottomSheetPresenter");
        return (o6x)new p6x((r7x)superFollowerLabelViewDelegateBinder, (q7x$a)new oka((Object)fxr, 2));
    }
    
    public static h1 I(final TwitterMediaPlayerArgs twitterMediaPlayerArgs) {
        final k3 k3 = (k3)lp7.m0((Class)k3.class);
        e0e.f((Object)twitterMediaPlayerArgs, "args");
        final h1 dataSource = twitterMediaPlayerArgs.getDataSource();
        e0e.c((Object)dataSource);
        return dataSource;
    }
    
    public static o6x J() {
        return (o6x)TweetViewViewStubDelegateBinderKt.a((hub)yxu.G0);
    }
    
    public static ikx K() {
        return rk0.d((Class)FocalQuoteViewDelegateBinder.class, (String)null);
    }
    
    public static sfu L(final ggm ggm, final gwg gwg) {
        final o64 o64 = (o64)lp7.m0((Class)o64.class);
        e0e.f((Object)ggm, "contentHostFactories");
        e0e.f((Object)gwg, "mediaForwardConfig");
        return (sfu)new tfu(gwg.a(), (r29)r29.n, ggm);
    }
    
    public static o6x M(final ShopModuleViewModel shopModuleViewModel) {
        final d3q d3q = (d3q)lp7.m0((Class)d3q.class);
        e0e.f((Object)shopModuleViewModel, "viewModel");
        return (o6x)ac8.l((Class)ShopModuleViewModel.class, (stb)c3q.F0);
    }
    
    public static o6x N() {
        return (o6x)ac8.l((Class)ImplicitTopicPromptViewModel.class, (stb)txu.F0);
    }
    
    public static sfv O() {
        final int a = mn2.a;
        return new sfv();
    }
    
    public static ikx P() {
        return rk0.d((Class)FocalTweetReplyContextViewDelegateBinder.class, (String)null);
    }
    
    public static o6x Q(final SensitiveMediaNoPreviewInterstitialViewDelegateBinder sensitiveMediaNoPreviewInterstitialViewDelegateBinder) {
        return (o6x)new p6x((r7x)sensitiveMediaNoPreviewInterstitialViewDelegateBinder, (q7x$a)ijp.I0);
    }
    
    public static xof R(final q4 q4) {
        final int a = mn2.a;
        final h1 e1 = q4.b.e1;
        final int a2 = o5j.a;
        final xof xof = (xof)e1;
        Objects.requireNonNull(xof, "Cannot return null from a non-@Nullable @Provides method");
        return xof;
    }
    
    public static ikx S() {
        return rk0.d((Class)TweetViewViewStubDelegateBinder.class, "enter_reader_mode_button");
    }
    
    public static o6x T(final ConversationControlsViewDelegateBinder conversationControlsViewDelegateBinder) {
        final hs6$a companion = hs6.Companion;
        return (o6x)new p6x((r7x)conversationControlsViewDelegateBinder, (q7x$a)qh5.K0);
    }
    
    public static o6x U(final SocialContextEducationDelegateBinder socialContextEducationDelegateBinder) {
        final yjq$a companion = yjq.Companion;
        return (o6x)new p6x((r7x)socialContextEducationDelegateBinder, (q7x$a)mm.J0);
    }
    
    public static jz V() {
        final int a = mn2.a;
        return (jz)new sli();
    }
    
    public static vu1 a() {
        final ty4 ty4 = (ty4)lp7.m0((Class)ty4.class);
        return (vu1)new sy4();
    }
    
    public static uv1 b() {
        return uv1.e((Object)Boolean.FALSE);
    }
    
    public static w9t c(final Context context, final p p11, final oc1 oc1, final UserIdentifier userIdentifier, final tsc tsc, final dsb dsb, final fci fci, final sfv sfv, final c4j c4j, final glq glq, final nlq nlq) {
        return new h4j(context, p11, oc1, tsc, userIdentifier, dsb, fci, sfv, c4j, glq, nlq);
    }
    
    public static r1q d(final q1q q1q) {
        final s1q s1q = (s1q)lp7.m0((Class)s1q.class);
        e0e.f((Object)q1q, "shopIdDispatcher");
        return new r1q((t5j)((lhm)q1q).F0);
    }
    
    public static o6x e(final OffPlatformShareTweetHeaderViewDelegateBinder offPlatformShareTweetHeaderViewDelegateBinder) {
        final egj egj = (egj)lp7.m0((Class)egj.class);
        e0e.f((Object)offPlatformShareTweetHeaderViewDelegateBinder, "binder");
        return q6x.a((r7x)offPlatformShareTweetHeaderViewDelegateBinder, (stb)ofj.I0);
    }
    
    public static o6x f(final FocalTweetMediaTagsViewDelegateBinder focalTweetMediaTagsViewDelegateBinder) {
        return (o6x)new p6x((r7x)focalTweetMediaTagsViewDelegateBinder, (q7x$a)x1h.G0);
    }
    
    public static UserIdentifier g(final und und) {
        final UserIdentifier fromId = UserIdentifier.fromId(((xl1)und).N1.getId());
        Objects.requireNonNull(fromId, "Cannot return null from a non-@Nullable @Provides method");
        return fromId;
    }
    
    public static o6x h(final SoftInterventionForwardPivotV2ViewDelegateBinder softInterventionForwardPivotV2ViewDelegateBinder) {
        final int m0 = qmu.M0;
        return (o6x)new p6x((r7x)softInterventionForwardPivotV2ViewDelegateBinder, (q7x$a)ct9.H0);
    }
    
    public static zyc i(final Context context, final AuthedApiService authedApiService, final unp unp, final baw baw, final lac lac) {
        final int a = mn2.a;
        e0e.f((Object)authedApiService, "apiService");
        e0e.f((Object)unp, "sessionCache");
        e0e.f((Object)lac, "guestServiceSessionRepository");
        e0e.f((Object)baw, "userCache");
        e0e.f((Object)context, "context");
        return (zyc)new azc(new yzc(), new vzc(), (zzc)new a0d(), (wzc)new xzc(), new syc(authedApiService, unp), lac, baw, context);
    }
    
    public static ikx j() {
        return m58.q((Class)CurationSocialContextDelegateBinder.class, (String)null);
    }
    
    public static bl k(final xof xof, final baw baw, final xtj xtj, final jj2 jj2, final cib cib, final aaf aaf, final z5k z5k, final gac gac, final ywc ywc, final cr9 cr9, final n9d n9d, final vf2 vf2, final boolean b) {
        final int a = mn2.a;
        final b f = xof.f(xof);
        final boolean equals = f.j0().equals(baw.n());
        final boolean b2 = sw6.b();
        Object o;
        if (equals) {
            o = new wk2((pl)xtj, n9d, jj2, cr9, baw, vf2, (sum)new tqb(), true, true, b, b2, false, true);
        }
        else {
            Object o2;
            if (ywc.b()) {
                o2 = null;
            }
            else {
                o2 = new jef(f.w(), jj2);
            }
            o = new cf2((pl)xtj, n9d, jj2, (hkh)aaf, baw, vf2, new srd((Object)xof, 9), cib, z5k.a, gac, (ze2)o2, b2);
        }
        return (bl)o;
    }
    
    public static ikx l() {
        return m58.q((Class)CurationViewDelegateBinder.class, (String)null);
    }
    
    public static cr9 m(final mr9 mr9) {
        final int a = mn2.a;
        Objects.requireNonNull(mr9);
        return (cr9)new in2(mr9);
    }
    
    public static ikx n() {
        return m58.q((Class)MediaTagsViewDelegateBinder.class, (String)null);
    }
    
    public static ikx o() {
        return m58.q((Class)TweetViewViewStubDelegateBinder.class, "room_entity_label");
    }
    
    public static sw6 p(final Context context, final ApiManager apiManager, final aba aba, final baw baw, final tw6 r0) {
        final int a = mn2.a;
        final sw6 sw6 = new sw6(context, apiManager, aba, baw, sw6.b());
        sw6.R0 = r0;
        if (!sw6.I0.d((Object)sw6)) {
            sw6.I0.i((Object)sw6);
        }
        return sw6;
    }
    
    public static ikx q() {
        return m58.q((Class)TextContentViewDelegateBinder.class, (String)null);
    }
    
    public static puj r(final RootDragLayout rootDragLayout, final aok d) {
        final int a = mn2.a;
        final puj puj = new puj((quj)new ruj(rootDragLayout, (MenuViewPager)((View)rootDragLayout).findViewById(2131430046)));
        puj.d = d;
        return puj;
    }
    
    public static ikx s() {
        return m58.q((Class)TweetViewViewStubDelegateBinder.class, "TweetMediaAndQuoteContainerStub");
    }
    
    public static a74 t(final Activity activity, final sp6 sp6, final baw baw, final n9d n9d) {
        final int a = mn2.a;
        return (a74)new b74(activity, baw, sp6, n9d);
    }
    
    public static s2s u(final Resources resources, final baw baw, final g22 g22, final sp6 sp6, final xof xof, final fyh fyh, final gex gex, final t04 t04, final n9d n9d) {
        final int a = mn2.a;
        return new s2s(resources, baw.b(), baw.u(), g22, n9d, baw, sp6, xof.a(), fyh, (n04$b)t04, (s2s$a)gex);
    }
    
    public static o6x v(final CommunitiesHiddenTweetViewDelegateBinder communitiesHiddenTweetViewDelegateBinder) {
        final nm$a companion = nm.Companion;
        return (o6x)new p6x((r7x)communitiesHiddenTweetViewDelegateBinder, (q7x$a)mm.G0);
    }
    
    public static i01 w() {
        final fx3$a fx3$a = (fx3$a)lp7.m0((Class)fx3$a.class);
        return (i01)new a9q();
    }
    
    public static usa x() {
        return usa.e("pref_fatigue_reply_downvote_sheet_nux");
    }
    
    public static max y(final Map map) {
        final TweetHostObjectGraph$a tweetHostObjectGraph$a = (TweetHostObjectGraph$a)lp7.m0((Class)TweetHostObjectGraph$a.class);
        return new max(dw8.b(map));
    }
    
    public static ConstraintsViewDelegateBinder z() {
        return new ConstraintsViewDelegateBinder(2131625894);
    }
}
