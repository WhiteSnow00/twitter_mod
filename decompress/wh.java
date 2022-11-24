import androidx.fragment.app.Fragment;
import com.twitter.tweetview.core.ui.contenthost.ContentHostContainerViewDelegateBinder;
import com.twitter.tweetview.core.TweetViewViewModel;
import com.twitter.explore.immersive.ui.textcontent.ImmersiveTextContentViewDelegateBinder;
import com.twitter.business.moduledisplay.nomodule.NoModuleViewModel;
import com.twitter.subsystems.interests.ui.topics.di.TopicLandingHeaderItemObjectGraph$a;
import com.twitter.android.search.implementation.results.di.SearchResultsTimelineViewGraph$a;
import com.twitter.database.schema.TwitterSchema;
import com.twitter.tweetview.core.ui.userlabel.UserLabelViewDelegateBinder;
import com.twitter.explore.immersive.ui.videoplayer.ImmersiveVideoViewDelegateBinder;
import com.twitter.tweetview.core.ui.collab.CollabFacePileViewStubBinder;
import com.twitter.explore.immersive.ui.stub.VideoTweetViewStubDelegateBinder;
import com.twitter.tweetview.core.ui.socialcontext.SocialContextBadgeDelegateBinder;
import com.twitter.tweetview.core.ui.TweetViewViewStubDelegateBinder;
import com.twitter.tweetview.core.ui.TweetViewViewDelegateBinder;
import com.twitter.tweetview.core.ui.birdwatch.BirdwatchPivotViewStubDelegateBinder;
import com.twitter.creator.impl.settings.itemBinder.earningItem.DashboardEarningItemViewModel;
import com.twitter.longform.threadreader.implementation.di.ThreadReaderHeaderObjectGraph$a;
import com.twitter.timeline.itembinder.di.IconLabelItemBinderObjectGraph$a;
import android.content.res.Resources;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.app.Activity;
import java.util.Objects;
import com.twitter.android.topiccarousel.followtoggle.FollowToggleViewDelegateBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wh implements bra
{
    public static o6x A(final FollowToggleViewDelegateBinder followToggleViewDelegateBinder) {
        final qlt qlt = (qlt)lp7.m0((Class)qlt.class);
        e0e.f((Object)followToggleViewDelegateBinder, "viewBinder");
        Objects.requireNonNull(gjb.Companion);
        final gjb$a companion = gjb.Companion;
        return (o6x)new p6x((r7x)followToggleViewDelegateBinder, (q7x$a)fjb.G0);
    }
    
    public static rrg B(final Activity activity, final k9x k9x, final kcm kcm, final UserIdentifier userIdentifier) {
        return new rrg((Context)activity, (rn)new qo((Object)activity, 24), "reply_composition", e2h.Q0, userIdentifier, k9x, kcm, 0);
    }
    
    public static Resources C(final Context context) {
        final b48 b48 = (b48)lp7.m0((Class)b48.class);
        e0e.f((Object)context, "context");
        final Resources resources = context.getResources();
        e0e.e((Object)resources, "context.resources");
        return resources;
    }
    
    public static p9p D(final s9p s9p) {
        return (p9p)((z4j)new p9p$a(s9p.m1)).e();
    }
    
    public static zih a(final a93 a93) {
        final d93 d93 = (d93)lp7.m0((Class)d93.class);
        e0e.f((Object)a93, "modelPrefetcher");
        return (zih)a93;
    }
    
    public static r7t b(final dob dob, final sfv sfv, final yfu yfu, final pcu pcu, final boolean b, final ufv ufv, final zxv zxv, final o5c o5c) {
        yfu.l(sfv);
        yfu.o(ufv);
        return (r7t)new q7t((Context)dob, sfv, yfu, pcu, zxv, b, o5c);
    }
    
    public static o6x c(final dob dob, final dc6 dc6) {
        final p96 p2 = (p96)lp7.m0((Class)p96.class);
        e0e.f((Object)dc6, "composerScribeHelper");
        return ylx.a((stb)new n96(dob, dc6));
    }
    
    public static s4d d(final x3e x3e) {
        final IconLabelItemBinderObjectGraph$a iconLabelItemBinderObjectGraph$a = (IconLabelItemBinderObjectGraph$a)lp7.m0((Class)IconLabelItemBinderObjectGraph$a.class);
        e0e.f((Object)x3e, "item");
        final s4d s4d = (s4d)x3e.a;
        Objects.requireNonNull(s4d, "Cannot return null from a non-@Nullable @Provides method");
        return s4d;
    }
    
    public static d7t e(final x3e x3e) {
        final ThreadReaderHeaderObjectGraph$a threadReaderHeaderObjectGraph$a = (ThreadReaderHeaderObjectGraph$a)lp7.m0((Class)ThreadReaderHeaderObjectGraph$a.class);
        e0e.f((Object)x3e, "item");
        final d7t d7t = (d7t)x3e.a;
        Objects.requireNonNull(d7t, "Cannot return null from a non-@Nullable @Provides method");
        return d7t;
    }
    
    public static ikx f() {
        final c68 c68 = (c68)lp7.m0((Class)c68.class);
        return new ikx(new fax((Class)DashboardEarningItemViewModel.class, ""), (s6x)new s6x$a("DashboardEarningItem"), (qax)qax$c.a);
    }
    
    public static ikx g() {
        return m58.q((Class)BirdwatchPivotViewStubDelegateBinder.class, (String)null);
    }
    
    public static ikx h() {
        return m58.q((Class)TweetViewViewDelegateBinder.class, "TweetViewDoubleTapViewDelegateBinder");
    }
    
    public static ikx i() {
        return m58.q((Class)TweetViewViewStubDelegateBinder.class, "hidden_communities_callout");
    }
    
    public static ikx j() {
        return m58.q((Class)TweetViewViewStubDelegateBinder.class, "promoted_badge");
    }
    
    public static ikx k() {
        return m58.q((Class)SocialContextBadgeDelegateBinder.class, (String)null);
    }
    
    public static o6x l(final VideoTweetViewStubDelegateBinder videoTweetViewStubDelegateBinder) {
        final vka vka = (vka)lp7.m0((Class)vka.class);
        e0e.f((Object)videoTweetViewStubDelegateBinder, "viewBinder");
        final jcx$a companion = jcx.Companion;
        return (o6x)new p6x((r7x)videoTweetViewStubDelegateBinder, (q7x$a)mm.Q0);
    }
    
    public static ikx m() {
        return m58.q((Class)CollabFacePileViewStubBinder.class, "TweetCollabProfileImageBinder");
    }
    
    public static o6x n(final ImmersiveVideoViewDelegateBinder immersiveVideoViewDelegateBinder, final cix cix, final uja uja, final qja qja) {
        final vka vka = (vka)lp7.m0((Class)vka.class);
        e0e.f((Object)immersiveVideoViewDelegateBinder, "viewBinder");
        e0e.f((Object)cix, "volumeMuteState");
        e0e.f((Object)uja, "exploreImmersiveItem");
        e0e.f((Object)qja, "exploreImmersiveDetailsItem");
        return q6x.a((r7x)immersiveVideoViewDelegateBinder, (stb)new tka(cix, uja, qja));
    }
    
    public static ikx o() {
        return m58.q((Class)UserLabelViewDelegateBinder.class, (String)null);
    }
    
    public static t19 p(final und und, final sfv sfv) {
        return new t19(((xl1)und).N1, sfv);
    }
    
    public static mpg q(final Context context, final UserIdentifier userIdentifier, final TwitterSchema twitterSchema, final kcm kcm) {
        final ghu ghu = (ghu)lp7.m0((Class)ghu.class);
        e0e.f((Object)context, "appContext");
        e0e.f((Object)userIdentifier, "userIdentifier");
        e0e.f((Object)twitterSchema, "schema");
        e0e.f((Object)kcm, "releaseCompletable");
        final n1v n1v = new n1v(new yg3(userIdentifier), m1v.a(context, (oxo)twitterSchema));
        qee.a((rbq)n1v, kcm);
        return (mpg)new ehu((rbq)n1v);
    }
    
    public static x7p r(final o8w o8w) {
        final SearchResultsTimelineViewGraph$a searchResultsTimelineViewGraph$a = (SearchResultsTimelineViewGraph$a)lp7.m0((Class)SearchResultsTimelineViewGraph$a.class);
        e0e.f((Object)o8w, "fragment");
        return x7p.a(((Fragment)o8w).J1(), UserIdentifier.Companion.c());
    }
    
    public static k7t s(final eot eot) {
        final TopicLandingHeaderItemObjectGraph$a topicLandingHeaderItemObjectGraph$a = (TopicLandingHeaderItemObjectGraph$a)lp7.m0((Class)TopicLandingHeaderItemObjectGraph$a.class);
        e0e.f((Object)eot, "headerItem");
        final k7t k = eot.k;
        e0e.e((Object)k, "headerItem.topicLandingHeader");
        return k;
    }
    
    public static o6x t(final hfh hfh, final j4e j4e, final nfh nfh, final kdh kdh) {
        final bgh bgh = (bgh)lp7.m0((Class)bgh.class);
        e0e.f((Object)hfh, "mobileAppModuleEffectHandler");
        e0e.f((Object)j4e, "mobileAppModuleItemAdapter");
        e0e.f((Object)nfh, "mobileAppModuleCollectionProvider");
        e0e.f((Object)kdh, "mobileAppModuleActionDispatcher");
        return ylx.a((stb)new zfh(hfh, j4e, nfh, kdh));
    }
    
    public static ikx u() {
        final rli rli = (rli)lp7.m0((Class)rli.class);
        return new ikx(new fax((Class)NoModuleViewModel.class, ""), (s6x)new s6x$a("NoModule"), (qax)qax$c.a);
    }
    
    public static o6x v(final ImmersiveTextContentViewDelegateBinder immersiveTextContentViewDelegateBinder, final zv1 zv1) {
        final vka vka = (vka)lp7.m0((Class)vka.class);
        e0e.f((Object)immersiveTextContentViewDelegateBinder, "viewBinder");
        e0e.f((Object)zv1, "behavioralEventHelper");
        return (o6x)new p6x((r7x)immersiveTextContentViewDelegateBinder, (q7x$a)new mka(zv1, 0));
    }
    
    public static ikx w() {
        final vka vka = (vka)lp7.m0((Class)vka.class);
        return new ikx(new fax((Class)TweetViewViewModel.class, ""), (s6x)new s6x$c((Class)ContentHostContainerViewDelegateBinder.class, "ImmersiveContentHostContainer"), (qax)qax$c.a);
    }
    
    public static xdu x(final und und, final ydu ydu, final thm thm, final swh swh, final iwp iwp, final hcf hcf, final sfv sfv, final vvs vvs, final k4f k4f, final evm evm, final ii7 ii7, final xjh xjh, final dsb dsb, final mxe mxe, final d5q d5q, final vtt vtt, final t42 t42, final kcm kcm, final xfw xfw, final ocj ocj, final dda dda, final fci fci, final qvu qvu, final ewu ewu, final quv quv, final wtv wtv, final yfu yfu, final l5b l5b, final ysq ysq, final oe5 oe5, final wh5 wh5, final evm evm2, final gra gra, final us5 us5, final rau rau, final nlq nlq, final zv1 zv1, final eh5 eh5, final p6o p6o) {
        return new xdu(und, ydu, thm, swh, iwp, hcf, sfv, vvs, (cwh)null, k4f, (sjh)null, ii7, xjh, dsb, mxe, d5q, evm, vtt, t42, kcm, xfw, ocj, dda, fci, qvu, ewu, quv, wtv, yfu, (fda)new bvs(und), l5b, ysq, oe5, wh5, evm2, gra, us5, rau, nlq, (o5c)null, zv1, eh5, p6o);
    }
    
    public static rbq y(final UserIdentifier userIdentifier, final mp1 mp1) {
        return new f93((rbq)new bg6(userIdentifier, (rnm)mp1));
    }
    
    public static r7t z(final dob dob, final sfv sfv, final sfv sfv2, final yfu yfu, final pcu pcu, final ufv ufv, final zxv zxv, final o5c o5c) {
        final xiu xiu = (xiu)lp7.m0((Class)xiu.class);
        e0e.f((Object)yfu, "tweetDetailActivityLauncher");
        e0e.f((Object)pcu, "dialogPresenter");
        e0e.f((Object)zxv, "unifiedCardNavigator");
        e0e.f((Object)o5c, "goodTweetsManager");
        yfu.l(sfv2);
        yfu.o(ufv);
        return (r7t)new viu((Activity)dob, sfv2, sfv, yfu, pcu, zxv, o5c);
    }
}
