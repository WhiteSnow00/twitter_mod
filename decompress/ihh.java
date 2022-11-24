import com.twitter.tweetview.core.ui.tombstone.NonCompliantTombstoneViewDelegateBinder;
import android.content.Intent;
import com.twitter.ui.components.button.legacy.TwitterButton;
import com.twitter.ui.autocomplete.SuggestionEditText;
import com.twitter.business.moduledisplay.linkmodule.LinkModuleViewModel;
import com.twitter.tweetview.core.ui.tweetheader.TweetCompositeHeaderNonCollabViewStubDelegateBinder;
import android.view.ViewGroup;
import com.twitter.tweetview.core.ui.tweetheader.TweetHeaderViewStubDelegateBinder;
import com.twitter.tweetview.core.ui.textcontent.TextContentViewDelegateBinder;
import com.twitter.tweetview.core.ui.superfollow.ExclusiveTimelineTweetEducationViewStubDelegateBinder;
import com.twitter.tweetview.core.ui.curation.CurationViewDelegateBinder;
import com.twitter.tweetview.core.ui.conversationcontrols.ConversationControlsViewStubDelegateBinder;
import com.twitter.tweetview.core.ui.trustedfriends.TrustedFriendsBannerViewDelegateBinder;
import com.twitter.tweetview.core.ui.trustedfriends.TrustedFriendsBannerViewStubDelegateBinder;
import com.twitter.tweetview.screenshot.core.share.ui.timestamp.OffPlatformShareTweetTimestampViewBinder;
import android.widget.TextView;
import com.twitter.card.broadcast.di.BroadcastCardObjectGraph$a;
import com.twitter.tweetview.focal.ui.quotetweetspivot.FocalTweetQuoteTweetsTimelinePivotViewStubDelegateBinder;
import com.twitter.onboarding.ocf.settings.ButtonItemComponentViewModel;
import java.util.Set;
import com.twitter.tweetview.core.ui.ConstraintsViewDelegateBinder;
import com.twitter.tweetview.focal.ui.actionbar.FocalTweetInlineActionBarViewDelegateBinder;
import com.twitter.card.di.BaseCardObjectGraph$a;
import com.twitter.tweetview.focal.ui.mediatags.FocalTweetMediaTagsViewDelegateBinder;
import java.util.Objects;
import tv.periscope.android.ui.broadcaster.CameraPreviewLayout;
import com.twitter.tweetview.core.ui.tombstone.InnerTombstoneViewStubDelegateBinder;
import com.twitter.tweetview.core.ui.birdwatch.BirdwatchIconViewDelegateBinder;
import tv.periscope.android.view.RootDragLayout;
import tv.periscope.android.ui.broadcast.view.MenuViewPager;
import android.view.View;
import com.twitter.card.unified.di.card.UnifiedCardObjectGraph$a;
import com.twitter.tweetview.core.ui.userimage.avatarring.RingedUserImageViewDelegateBinder;
import com.twitter.tweetview.core.ui.userimage.UserImageViewDelegateBinder;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import com.twitter.database.schema.TwitterSchema;
import android.view.LayoutInflater;
import com.twitter.tweetview.core.ui.TweetViewViewStubDelegateBinderKt;
import android.content.res.Resources;
import com.twitter.tweetdetail.newreplies.TweetDetailNewRepliesBannerViewStubModel;
import com.twitter.onboarding.ocf.di.TweetComponentObjectGraph;
import com.twitter.tweetview.core.TweetViewViewModel;
import com.twitter.business.moduledisplay.nomodule.NoModuleViewModel;
import com.twitter.business.moduledisplay.mobileappmodule.MobileAppModuleViewModel;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.app.Activity;
import com.twitter.tweetview.focal.ui.tweetheader.FocalTweetHeaderViewDelegateBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihh implements bra
{
    public static o6x A(final FocalTweetHeaderViewDelegateBinder focalTweetHeaderViewDelegateBinder) {
        final bdb$a companion = bdb.Companion;
        return (o6x)new p6x((r7x)focalTweetHeaderViewDelegateBinder, (q7x$a)hs.N0);
    }
    
    public static viw B(final Activity activity, final UserIdentifier userIdentifier) {
        return viw.a((Context)activity, userIdentifier);
    }
    
    public static o6x C(final MobileAppModuleViewModel mobileAppModuleViewModel) {
        final bgh bgh = (bgh)lp7.m0((Class)bgh.class);
        e0e.f((Object)mobileAppModuleViewModel, "viewModel");
        return (o6x)ac8.l((Class)MobileAppModuleViewModel.class, (stb)agh.F0);
    }
    
    public static ikx D() {
        final rli rli = (rli)lp7.m0((Class)rli.class);
        return new ikx(new fax((Class)NoModuleViewModel.class, ""), (s6x)new s6x$d("NoModuleStub"), (qax)qax$c.a);
    }
    
    public static TweetViewViewModel E() {
        final TweetComponentObjectGraph.a a = (TweetComponentObjectGraph.a)lp7.m0((Class)TweetComponentObjectGraph.a.class);
        return new TweetViewViewModel();
    }
    
    public static ikx F() {
        final rhu rhu = (rhu)lp7.m0((Class)rhu.class);
        return new ikx(new fax((Class)TweetDetailNewRepliesBannerViewStubModel.class, ""), (s6x)new s6x$d("TweetDetailNewRepliesBannerStub"), (qax)qax$c.a);
    }
    
    public static o6x G(final Resources resources) {
        return ylx.a((stb)new pws((Object)resources, 0));
    }
    
    public static eo2 H() {
        final eo2 eo2 = new eo2();
        eo2.a.add(new ag8());
        return eo2;
    }
    
    public static wb3 I(final Context context, final eo2 eo2, final ksg ksg, final me3 me3, final jc3 jc3) {
        final w4a a = me3.a();
        boolean b;
        if (jc3.c) {
            b = true;
        }
        else {
            b = false;
        }
        return (wb3)new zb3(context, eo2, (isg)ksg, a, (int)(b ? 1 : 0));
    }
    
    public static o6x J(final Boolean b, final Boolean b2, final glq glq) {
        return (o6x)TweetViewViewStubDelegateBinderKt.a((hub)new ceb(glq, b2, b));
    }
    
    public static vmi K(final Context context, final LayoutInflater layoutInflater) {
        return new vmi((gra)new svs(context, layoutInflater));
    }
    
    public static dqu L(final Context context, final UserIdentifier userIdentifier, final TwitterSchema twitterSchema, final kcm kcm) {
        final tfj tfj = (tfj)lp7.m0((Class)tfj.class);
        e0e.f((Object)context, "context");
        e0e.f((Object)userIdentifier, "owner");
        e0e.f((Object)twitterSchema, "schema");
        e0e.f((Object)kcm, "releaseCompletable");
        return (dqu)ve6.b(context, userIdentifier, (oxo)twitterSchema, kcm);
    }
    
    public static Map M(final Map map) {
        final HashMap hashMap = new HashMap();
        for (final Map.Entry<q8x, V> entry : map.entrySet()) {
            hashMap.put(new r8x(((x61)entry.getKey()).b), entry.getValue());
        }
        return hashMap;
    }
    
    public static o6x N(final UserImageViewDelegateBinder userImageViewDelegateBinder, final RingedUserImageViewDelegateBinder ringedUserImageViewDelegateBinder, final zv1 zv1) {
        p6x p6x;
        if (qjy.u()) {
            p6x = new p6x((r7x)ringedUserImageViewDelegateBinder, (q7x$a)new nxu((Object)zv1, 1));
        }
        else {
            p6x = new p6x((r7x)userImageViewDelegateBinder, (q7x$a)new kxu(zv1, 2));
        }
        return (o6x)p6x;
    }
    
    public static yzr O(final kt1 kt1) {
        final UnifiedCardObjectGraph$a unifiedCardObjectGraph$a = (UnifiedCardObjectGraph$a)lp7.m0((Class)UnifiedCardObjectGraph$a.class);
        e0e.f((Object)kt1, "batteryUsage");
        return (yzr)new gkb(kt1, 2);
    }
    
    public static yzr P(final kv8 kv8) {
        final UnifiedCardObjectGraph$a unifiedCardObjectGraph$a = (UnifiedCardObjectGraph$a)lp7.m0((Class)UnifiedCardObjectGraph$a.class);
        e0e.f((Object)kv8, "deviceStorageStats");
        return (yzr)new yjb((Object)kv8, 2);
    }
    
    public static quj Q(final View view, final MenuViewPager menuViewPager) {
        final int a = o5j.a;
        return (quj)new ruj((RootDragLayout)view, menuViewPager);
    }
    
    public static ikx R() {
        return rk0.d((Class)BirdwatchIconViewDelegateBinder.class, (String)null);
    }
    
    public static o6x S(final InnerTombstoneViewStubDelegateBinder innerTombstoneViewStubDelegateBinder) {
        final jcx$a companion = jcx.Companion;
        return (o6x)new p6x((r7x)innerTombstoneViewStubDelegateBinder, (q7x$a)mm.Q0);
    }
    
    public static CameraPreviewLayout T(final View view) {
        final CameraPreviewLayout cameraPreviewLayout = (CameraPreviewLayout)view.findViewById(2131428066);
        Objects.requireNonNull(cameraPreviewLayout, "Cannot return null from a non-@Nullable @Provides method");
        return cameraPreviewLayout;
    }
    
    public static ikx U() {
        return rk0.d((Class)FocalTweetMediaTagsViewDelegateBinder.class, (String)null);
    }
    
    public static fda V(final cdc cdc) {
        final ybx ybx = (ybx)lp7.m0((Class)ybx.class);
        return ((ddc)cdc).J();
    }
    
    public static hli W() {
        final ubl ubl = (ubl)lp7.m0((Class)ubl.class);
        return new hli(qda.Companion.a("profile", "profile_modules"), UserIdentifier.Companion.c());
    }
    
    public static jkx X(final Map map) {
        final BaseCardObjectGraph$a baseCardObjectGraph$a = (BaseCardObjectGraph$a)lp7.m0((Class)BaseCardObjectGraph$a.class);
        return dw8.c(map);
    }
    
    public static o6x Y() {
        return (o6x)TweetViewViewStubDelegateBinderKt.a((hub)zxu.G0);
    }
    
    public static ikx Z() {
        return rk0.d((Class)FocalTweetInlineActionBarViewDelegateBinder.class, (String)null);
    }
    
    public static ConstraintsViewDelegateBinder a() {
        return new ConstraintsViewDelegateBinder(2131624487);
    }
    
    public static sfu a0(final ggm ggm, final gwg gwg) {
        final o64 o64 = (o64)lp7.m0((Class)o64.class);
        e0e.f((Object)ggm, "factories");
        e0e.f((Object)gwg, "mediaForwardConfig");
        return (sfu)new tfu(gwg.a(), (r29)r29.c, ggm);
    }
    
    public static cqu b() {
        final cqu$a cqu$a = new cqu$a();
        cqu$a.o(new Integer[] { 52 });
        cqu$a.b = false;
        return (cqu)((z4j)cqu$a).e();
    }
    
    public static arv b0(final bts bts) {
        final arv o = bts.o();
        Objects.requireNonNull(o, "Cannot return null from a non-@Nullable @Provides method");
        return o;
    }
    
    public static o6x c(final ygf ygf) {
        final eif eif = (eif)lp7.m0((Class)eif.class);
        e0e.f((Object)ygf, "linkModuleEffectHandler");
        return ylx.a((stb)new cif(ygf));
    }
    
    public static pkx c0(final t6x t6x, final jkx jkx, final y9x y9x, final kcm kcm, final Set set) {
        final BaseCardObjectGraph$a baseCardObjectGraph$a = (BaseCardObjectGraph$a)lp7.m0((Class)BaseCardObjectGraph$a.class);
        e0e.f((Object)t6x, "viewBinderRegistry");
        e0e.f((Object)jkx, "configRegistry");
        e0e.f((Object)y9x, "viewModelFactory");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)set, "bindingPlugins");
        return pkx.Companion.a(t6x, (iae)kcm, jkx, y9x, set);
    }
    
    public static ikx d() {
        final g53 g53 = (g53)lp7.m0((Class)g53.class);
        return new ikx(new fax((Class)ButtonItemComponentViewModel.class, ""), (s6x)new s6x$a("ButtonItemComponent"), (qax)qax$c.a);
    }
    
    public static ikx d0() {
        return rk0.d((Class)FocalTweetQuoteTweetsTimelinePivotViewStubDelegateBinder.class, (String)null);
    }
    
    public static gra e(final Context context, final sfv sfv) {
        final tru tru = (tru)lp7.m0((Class)tru.class);
        e0e.f((Object)context, "context");
        e0e.f((Object)sfv, "scribeAssociation");
        return (gra)new pru(context, sfv);
    }
    
    public static fga e0(final qdi qdi) {
        Objects.requireNonNull(qdi, "Cannot return null from a non-@Nullable @Provides method");
        return (fga)qdi;
    }
    
    public static yzr f(final kt1 kt1) {
        final BroadcastCardObjectGraph$a broadcastCardObjectGraph$a = (BroadcastCardObjectGraph$a)lp7.m0((Class)BroadcastCardObjectGraph$a.class);
        e0e.f((Object)kt1, "batteryUsage");
        return (yzr)new yjb((Object)kt1, 1);
    }
    
    public static TextView f0(final View view) {
        final TextView textView = (TextView)view.findViewById(2131429840);
        Objects.requireNonNull(textView, "Cannot return null from a non-@Nullable @Provides method");
        return textView;
    }
    
    public static ikx g() {
        final egj egj = (egj)lp7.m0((Class)egj.class);
        return new ikx(new fax((Class)TweetViewViewModel.class, ""), (s6x)new s6x$c((Class)OffPlatformShareTweetTimestampViewBinder.class, (String)null), (qax)qax$c.a);
    }
    
    public static UserImageViewDelegateBinder g0(final tyu tyu) {
        return new UserImageViewDelegateBinder(tyu, false);
    }
    
    public static o6x h(final TrustedFriendsBannerViewStubDelegateBinder trustedFriendsBannerViewStubDelegateBinder) {
        final jcx$a companion = jcx.Companion;
        return (o6x)new p6x((r7x)trustedFriendsBannerViewStubDelegateBinder, (q7x$a)mm.Q0);
    }
    
    public static o6x h0(final TrustedFriendsBannerViewDelegateBinder trustedFriendsBannerViewDelegateBinder) {
        final g5u$a companion = g5u.Companion;
        return (o6x)new p6x((r7x)trustedFriendsBannerViewDelegateBinder, (q7x$a)uxg.J0);
    }
    
    public static yzr i(final kv8 kv8) {
        final BroadcastCardObjectGraph$a broadcastCardObjectGraph$a = (BroadcastCardObjectGraph$a)lp7.m0((Class)BroadcastCardObjectGraph$a.class);
        e0e.f((Object)kv8, "deviceStorageStats");
        return (yzr)new ig2((Object)kv8, 0);
    }
    
    public static un i0(un w, final Activity activity) {
        w = w.w(activity);
        Objects.requireNonNull(w, "Cannot return null from a non-@Nullable @Provides method");
        return w;
    }
    
    public static ikx j() {
        return m58.q((Class)ConversationControlsViewStubDelegateBinder.class, (String)null);
    }
    
    public static o6x j0(final CurationViewDelegateBinder curationViewDelegateBinder, final zv1 zv1) {
        return (o6x)new p6x((r7x)curationViewDelegateBinder, (q7x$a)new kxu(zv1, 0));
    }
    
    public static ikx k() {
        return m58.q((Class)ExclusiveTimelineTweetEducationViewStubDelegateBinder.class, (String)null);
    }
    
    public static ikx l() {
        return m58.q((Class)InnerTombstoneViewStubDelegateBinder.class, (String)null);
    }
    
    public static o6x m(final TextContentViewDelegateBinder textContentViewDelegateBinder) {
        return (o6x)new p6x((r7x)textContentViewDelegateBinder, (q7x$a)rfs.I0);
    }
    
    public static ikx n() {
        return m58.q((Class)UserImageViewDelegateBinder.class, "RingedUserImageViewDelegateBinder");
    }
    
    public static View o(View viewById) {
        viewById = viewById.findViewById(2131427932);
        Objects.requireNonNull(viewById, "Cannot return null from a non-@Nullable @Provides method");
        return viewById;
    }
    
    public static ikx p() {
        return m58.q((Class)TweetHeaderViewStubDelegateBinder.class, (String)null);
    }
    
    public static View q(final LayoutInflater layoutInflater) {
        final View inflate = layoutInflater.inflate(2131624154, (ViewGroup)null);
        Objects.requireNonNull(inflate, "Cannot return null from a non-@Nullable @Provides method");
        return inflate;
    }
    
    public static o6x r(final TweetCompositeHeaderNonCollabViewStubDelegateBinder tweetCompositeHeaderNonCollabViewStubDelegateBinder) {
        final jcx$a companion = jcx.Companion;
        return (o6x)new p6x((r7x)tweetCompositeHeaderNonCollabViewStubDelegateBinder, (q7x$a)mm.Q0);
    }
    
    public static yzr s(final yzr yzr) {
        final int a = o5j.a;
        Objects.requireNonNull(yzr, "Cannot return null from a non-@Nullable @Provides method");
        return yzr;
    }
    
    public static ikx t() {
        final eif eif = (eif)lp7.m0((Class)eif.class);
        return new ikx(new fax((Class)LinkModuleViewModel.class, ""), (s6x)new s6x$a("LinkModule"), (qax)qax$c.a);
    }
    
    public static SuggestionEditText u(final View view) {
        final SuggestionEditText suggestionEditText = (SuggestionEditText)view.findViewById(2131429844);
        Objects.requireNonNull(suggestionEditText, "Cannot return null from a non-@Nullable @Provides method");
        return suggestionEditText;
    }
    
    public static TwitterButton v(final View view) {
        final TwitterButton twitterButton = (TwitterButton)view.findViewById(2131428063);
        Objects.requireNonNull(twitterButton, "Cannot return null from a non-@Nullable @Provides method");
        return twitterButton;
    }
    
    public static k0w w(final Context context, final LayoutInflater layoutInflater) {
        return new k0w((gra)new svs(context, layoutInflater));
    }
    
    public static sb3 x(sb3 sb3, final Intent intent) {
        if (sb3 == null) {
            final pb3 pb3 = new pb3(intent);
            final Object b = swj.b(((aj1)pb3).mIntent, "extra_activity_argument", ((dbq)pb3).a);
            vmw.g(b);
            sb3 = (sb3)b;
        }
        Objects.requireNonNull(sb3, "Cannot return null from a non-@Nullable @Provides method");
        return sb3;
    }
    
    public static c7k y(final jc3 jc3, final wd3 wd3, final u7k u7k, final zl1 zl1, final fci fci) {
        return new jf3((b7k)wd3, u7k, zl1, fci, jc3);
    }
    
    public static o6x z(final NonCompliantTombstoneViewDelegateBinder nonCompliantTombstoneViewDelegateBinder) {
        final int g0 = mit.G0;
        return (o6x)new p6x((r7x)nonCompliantTombstoneViewDelegateBinder, (q7x$a)kit.G0);
    }
}
