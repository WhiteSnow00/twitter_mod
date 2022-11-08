import com.twitter.tweetview.core.ui.socialcontext.SocialContextEducationDelegateBinder;
import com.twitter.tweetview.core.ui.conversationcontrols.ConversationControlsViewDelegateBinder;
import com.twitter.tweetview.core.ui.TweetViewViewStubDelegateBinder;
import com.twitter.tweetview.core.ui.tombstone.SensitiveMediaNoPreviewInterstitialViewDelegateBinder;
import com.twitter.tweetview.focal.ui.replycontext.FocalTweetReplyContextViewDelegateBinder;
import com.twitter.tweetview.focal.ui.quote.FocalQuoteViewDelegateBinder;
import com.twitter.rooms.ui.topics.main.RoomTopicsTaggingViewModel;
import android.content.pm.PackageManager;
import android.app.Application;
import com.twitter.tweetview.focal.ui.replyfilter.ReplyFilterViewDelegateBinder;
import com.twitter.tweetview.focal.ui.badge.FocalTweetBadgeViewDelegateBinder;
import com.twitter.subsystems.interests.ui.topics.di.TopicLandingHeaderItemObjectGraph$a;
import androidx.fragment.app.Fragment;
import com.twitter.tweetview.focal.ui.reader.ReaderModeEntryButtonTweetViewDelegateBinder;
import com.twitter.android.liveevent.card.di.LiveEventCardObjectGraph$a;
import com.twitter.util.user.UserIdentifier;
import android.view.View;
import android.content.Context;
import com.twitter.tweetview.focal.ui.mediatags.FocalTweetMediaTagsViewDelegateBinder;
import com.twitter.ui.widget.EditTextViewModel;
import com.twitter.tweetview.screenshot.core.share.ui.tweetheader.OffPlatformShareTweetHeaderViewDelegateBinder;
import java.util.Objects;
import com.twitter.timeline.itembinder.di.TimelineTweetComposerObjectGraph$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nrf implements wqa
{
    public static rv1 a() {
        return rv1.e((Object)Boolean.FALSE);
    }
    
    public static k6t b(final r3e r3e) {
        final TimelineTweetComposerObjectGraph$a timelineTweetComposerObjectGraph$a = (TimelineTweetComposerObjectGraph$a)ca7.u((Class)TimelineTweetComposerObjectGraph$a.class);
        zzd.f((Object)r3e, "item");
        final k6t k6t = (k6t)r3e.a;
        Objects.requireNonNull(k6t, "Cannot return null from a non-@Nullable @Provides method");
        return k6t;
    }
    
    public static c5x c(final OffPlatformShareTweetHeaderViewDelegateBinder offPlatformShareTweetHeaderViewDelegateBinder) {
        final lfj lfj = (lfj)ca7.u((Class)lfj.class);
        zzd.f((Object)offPlatformShareTweetHeaderViewDelegateBinder, "binder");
        return e5x.a((g6x)offPlatformShareTweetHeaderViewDelegateBinder, (rtb)wej.F0);
    }
    
    public static yix d() {
        final gu9 gu9 = (gu9)ca7.u((Class)gu9.class);
        return new yix(new r8x((Class)EditTextViewModel.class, ""), (g5x)new g5x$a("EditText"), (c9x)new c9x$a((String)null, 1, (hg8)null));
    }
    
    public static c5x e(final FocalTweetMediaTagsViewDelegateBinder focalTweetMediaTagsViewDelegateBinder) {
        return (c5x)new d5x((g6x)focalTweetMediaTagsViewDelegateBinder, (f6x$a)e1h.D0);
    }
    
    public static emu f(final gob gob, final jev jev, final gew gew, final String s, final lcv lcv, final aws aws, final z7x z7x, final rnd rnd) {
        final dml dml = new dml();
        final k6m h0 = lcv.H0;
        return new emu((Context)gob, jev, gew, (oqu)dml, (View)h0.b, (gnf)h0, aws, (bra<UserIdentifier, zf4>)j1x.e, s, z7x, ((wl1)rnd).K1);
    }
    
    public static ak3 g(final krf krf) {
        final LiveEventCardObjectGraph$a liveEventCardObjectGraph$a = (LiveEventCardObjectGraph$a)ca7.u((Class)LiveEventCardObjectGraph$a.class);
        zzd.f((Object)krf, "cardLayoutFactory");
        ak3 ak3;
        if (krf.c == z19.k) {
            ak3 = (ak3)krf.b.get();
        }
        else {
            ak3 = (ak3)krf.a.get();
        }
        zzd.e((Object)ak3, "cardLayoutFactory.cardLifecycleEventListener");
        return ak3;
    }
    
    public static s60 h() {
        return new s60();
    }
    
    public static psa i() {
        return psa.e("pref_fatigue_reply_downvote_sheet_nux");
    }
    
    public static c5x j(final ReaderModeEntryButtonTweetViewDelegateBinder readerModeEntryButtonTweetViewDelegateBinder) {
        final a1m$a companion = a1m.Companion;
        return (c5x)new d5x((g6x)readerModeEntryButtonTweetViewDelegateBinder, (f6x$a)nz1.F0);
    }
    
    public static nl3 k(final rnd rnd, final ml3 ml3, final jva jva, final lwm lwm, final qvo qvo, final qvo qvo2, final ibm ibm) {
        return (nl3)new xf8((Fragment)rnd, ml3, jva, dta.b().b("module_header_feedback_bottom_sheet_enabled", false), lwm, qvo, qvo2, ibm);
    }
    
    public static daq l(final UserIdentifier userIdentifier, final kp1 kp1) {
        return (daq)new u83((daq<Object, Object>)new pf6(userIdentifier, (mmm)kp1));
    }
    
    public static umt m(final r3e r3e) {
        final TopicLandingHeaderItemObjectGraph$a topicLandingHeaderItemObjectGraph$a = (TopicLandingHeaderItemObjectGraph$a)ca7.u((Class)TopicLandingHeaderItemObjectGraph$a.class);
        zzd.f((Object)r3e, "item");
        final umt umt = (umt)r3e.a;
        Objects.requireNonNull(umt, "Cannot return null from a non-@Nullable @Provides method");
        return umt;
    }
    
    public static hox n(final xau xau, final wh6 wh6) {
        return new hox(xau, (n5f)wh6);
    }
    
    public static c5x o(final FocalTweetBadgeViewDelegateBinder focalTweetBadgeViewDelegateBinder) {
        final int e0 = qh1.E0;
        return (c5x)new d5x((g6x)focalTweetBadgeViewDelegateBinder, (f6x$a)ph1.D0);
    }
    
    public static c5x p(final ReplyFilterViewDelegateBinder replyFilterViewDelegateBinder) {
        final phm$a companion = phm.Companion;
        return (c5x)new d5x((g6x)replyFilterViewDelegateBinder, (f6x$a)bxg.J0);
    }
    
    public static PackageManager q(final Application application) {
        final q10$a q10$a = (q10$a)ca7.u((Class)q10$a.class);
        zzd.f((Object)application, "application");
        final PackageManager packageManager = ((Context)application).getPackageManager();
        zzd.e((Object)packageManager, "application.packageManager");
        return packageManager;
    }
    
    public static d8p r(final g8p g8p) {
        return (d8p)((h4j)new d8p$a(g8p.j1)).e();
    }
    
    public static yix s() {
        final fho fho = (fho)ca7.u((Class)fho.class);
        return new yix(new r8x((Class)RoomTopicsTaggingViewModel.class, "RoomScheduledTopicsTagging"), (g5x)new g5x$a("RoomTopicsTaggingViewBinder"), (c9x)c9x$c.a);
    }
    
    public static yix t() {
        return e1.k((Class)FocalQuoteViewDelegateBinder.class, (String)null);
    }
    
    public static yix u() {
        return e1.k((Class)FocalTweetReplyContextViewDelegateBinder.class, (String)null);
    }
    
    public static c5x v(final SensitiveMediaNoPreviewInterstitialViewDelegateBinder sensitiveMediaNoPreviewInterstitialViewDelegateBinder) {
        return (c5x)new d5x((g6x)sensitiveMediaNoPreviewInterstitialViewDelegateBinder, (f6x$a)uhp.F0);
    }
    
    public static yix w() {
        return e1.k((Class)TweetViewViewStubDelegateBinder.class, "enter_reader_mode_button");
    }
    
    public static zvu x(final dsb dsb, final wv1 wv1, final jev jev, final f6t f6t, final oxu oxu, final g89 g89) {
        final i7t i7t = (i7t)ca7.u((Class)i7t.class);
        zzd.f((Object)dsb, "friendshipCache");
        zzd.f((Object)wv1, "behavioralEventHelper");
        zzd.f((Object)jev, "scribeAssociation");
        zzd.f((Object)f6t, "focalTimelineTweetClickListener");
        zzd.f((Object)oxu, "tweetViewClickListener");
        zzd.f((Object)g89, "doubleTapToLikeConfig");
        return new zvu(dsb, wv1, jev, f6t, oxu, g89);
    }
    
    public static c5x y(final ConversationControlsViewDelegateBinder conversationControlsViewDelegateBinder) {
        final wr6$a companion = wr6.Companion;
        return (c5x)new d5x((g6x)conversationControlsViewDelegateBinder, (f6x$a)ijb.H0);
    }
    
    public static c5x z(final SocialContextEducationDelegateBinder socialContextEducationDelegateBinder) {
        final kiq$a companion = kiq.Companion;
        return (c5x)new d5x((g6x)socialContextEducationDelegateBinder, (f6x$a)lha.H0);
    }
}
