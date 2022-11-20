import java.util.List;
import com.twitter.tweetview.screenshot.core.share.ui.timestamp.OffPlatformShareTweetTimestampViewBinder;
import com.twitter.tweetview.core.ui.birdwatch.BirdwatchIconViewDelegateBinder;
import com.twitter.subscriptions.core.UndoSendViewModel;
import com.twitter.ui.components.announcement.di.AnnouncementOverlayViewGraph$a;
import com.twitter.tweetview.focal.ui.translation.TweetTranslateViewModel;
import com.twitter.ui.dock.di.dock.DockObjectGraph$a;
import android.graphics.Rect;
import android.view.WindowManager;
import android.view.ViewConfiguration;
import com.twitter.subsystems.nudges.standardized.StandardizedNudgeSheetViewModel;
import com.twitter.subsystems.nudges.standardized.di.StandardizedNudgeSheetViewObjectGraph$a;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import com.twitter.rooms.model.helpers.RoomUserItem;
import com.twitter.android.settings.DeactivateAccountActivity;
import androidx.fragment.app.Fragment;
import com.twitter.tweetview.core.ui.userimage.DmOuterUserImageViewDelegateBinder;
import com.twitter.tweetview.core.ui.additionalcontext.AdditionalContextViewDelegateBinder;
import com.twitter.subsystems.interests.ui.aggressiveprompt.TopicContextAggressivePromptViewModel;
import com.twitter.tweetview.core.ui.tweetheader.TweetCompositeHeaderCollabViewStubDelegateBinder;
import com.twitter.tweetview.core.ui.inlinesocialproof.InlineSocialProofViewDelegateBinder;
import com.twitter.tweetview.focal.ui.textcontent.FocalTweetTextContentViewDelegateBinder;
import com.twitter.tweetview.focal.ui.tweetheader.FocalTweetCollaborationHeaderViewDelegateBinder;
import com.twitter.revenue.di.PlayableViewObjectGraph$a;
import com.twitter.tweetview.core.ui.TweetViewViewStubDelegateBinderKt;
import com.twitter.tweetview.focal.ui.combinedbyline.CombinedBylineViewDelegateBinder;
import java.util.Set;
import android.content.Context;
import com.twitter.onboarding.ocf.NavigationHandler;
import com.twitter.tweetview.core.ui.tweetheader.TweetCompositeHeaderViewDelegateBinder;
import com.twitter.tweetview.core.ui.edit.FocalEditOutdatedCalloutViewDelegateBinder;
import android.content.Intent;
import java.util.Objects;
import android.app.Activity;
import com.twitter.tweetview.core.ui.superfollow.ExclusiveTimelineTweetEducationViewStubDelegateBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rag implements tpa
{
    public static w5x A(final ExclusiveTimelineTweetEducationViewStubDelegateBinder exclusiveTimelineTweetEducationViewStubDelegateBinder) {
        final qbx$a companion = qbx.Companion;
        return (w5x)new x5x((z6x)exclusiveTimelineTweetEducationViewStubDelegateBinder, (y6x$a)jm.O0);
    }
    
    public static w5x B(final lrt lrt, final htw htw) {
        return htw.f((a3e)lrt);
    }
    
    public static ljl C(final Activity activity) {
        final v6a v6a = (v6a)chw.w0((Class)v6a.class);
        czd.f((Object)activity, "activity");
        final bzv$b companion = bzv.Companion;
        final Intent intent = activity.getIntent();
        czd.e((Object)intent, "activity.intent");
        Objects.requireNonNull(companion);
        final Intent mIntent = ((xi1)new bzv(intent)).mIntent;
        czd.e((Object)mIntent, "mIntent");
        final vba x = xli.X(mIntent);
        ljl ljl;
        if (x != null) {
            ljl = new ljl(x);
        }
        else {
            final hpt.a companion2 = hpt.Companion;
            final Intent intent2 = activity.getIntent();
            czd.e((Object)intent2, "activity.intent");
            Objects.requireNonNull(companion2);
            ljl = new ljl((vba)klp.a(new hpt(intent2).mIntent.getByteArrayExtra("arg_referring_event_namespace"), (rlp)vba$b.b));
        }
        return ljl;
    }
    
    public static dfu D(final rfm rfm) {
        final fzu fzu = (fzu)chw.w0((Class)fzu.class);
        czd.f((Object)rfm, "contentHostFactories");
        return (dfu)new efu(false, (bzr)f71.Z0, rfm);
    }
    
    public static w5x E() {
        final uvd uvd = (uvd)chw.w0((Class)uvd.class);
        return jlx.a((qsb)svd.D0);
    }
    
    public static w5x F(final FocalEditOutdatedCalloutViewDelegateBinder focalEditOutdatedCalloutViewDelegateBinder) {
        final as9$a companion = as9.Companion;
        return (w5x)new x5x((z6x)focalEditOutdatedCalloutViewDelegateBinder, (y6x$a)zr9.E0);
    }
    
    public static w5x G(final TweetCompositeHeaderViewDelegateBinder tweetCompositeHeaderViewDelegateBinder) {
        final xeu$a companion = xeu.Companion;
        return (w5x)new x5x((z6x)tweetCompositeHeaderViewDelegateBinder, (y6x$a)jm.I0);
    }
    
    public static id6 H(final Activity activity, final NavigationHandler navigationHandler, final cdj cdj) {
        final id6 id6 = new id6();
        final s19 s19 = new s19((s19$a)cdj);
        final c0r c0r = new c0r((c0r$a)new bdj((Context)activity, (ie4$b)new scn((Object)navigationHandler, 29)));
        final nej nej = new nej();
        ((List<s19>)id6.a).add(s19);
        ((List<c0r>)id6.a).add(c0r);
        ((List<nej>)id6.a).add(nej);
        return id6;
    }
    
    public static Set I(final lkt lkt) {
        final zkf zkf = (zkf)chw.w0((Class)zkf.class);
        return mq4.R0((Iterable)s9i.t(lkt));
    }
    
    public static tjx J() {
        return fu8.f((Class)CombinedBylineViewDelegateBinder.class, (String)null);
    }
    
    public static w5x K() {
        return (w5x)TweetViewViewStubDelegateBinderKt.a((ftb)wwu.F0);
    }
    
    public static dj3 L(final cnb cnb, final vxs vxs, final sxs sxs, final rfm rfm) {
        return new dj3((ypa)new hof(cnb, rfm, 1), vxs, sxs);
    }
    
    public static nx9 M(final uh3 uh3, final qh3 qh3, final kj3 kj3, final qjk qjk) {
        final PlayableViewObjectGraph$a playableViewObjectGraph$a = (PlayableViewObjectGraph$a)chw.w0((Class)PlayableViewObjectGraph$a.class);
        czd.f((Object)uh3, "actionHelper");
        czd.f((Object)qh3, "actionHandler");
        czd.f((Object)kj3, "cardLogger");
        czd.f((Object)qjk, "playableCloseHandler");
        return (nx9)new xjk(uh3, qh3, kj3, qjk);
    }
    
    public static w5x N(final FocalTweetCollaborationHeaderViewDelegateBinder focalTweetCollaborationHeaderViewDelegateBinder) {
        final pbb$a companion = pbb.Companion;
        return (w5x)new x5x((z6x)focalTweetCollaborationHeaderViewDelegateBinder, (y6x$a)rht.G0);
    }
    
    public static tjx O() {
        return fu8.f((Class)FocalTweetTextContentViewDelegateBinder.class, (String)null);
    }
    
    public static w5x P(final InlineSocialProofViewDelegateBinder inlineSocialProofViewDelegateBinder) {
        return (w5x)new x5x((z6x)inlineSocialProofViewDelegateBinder, (y6x$a)tpd.H0);
    }
    
    public static w5x Q(final TweetCompositeHeaderCollabViewStubDelegateBinder tweetCompositeHeaderCollabViewStubDelegateBinder) {
        final qbx$a companion = qbx.Companion;
        return (w5x)new x5x((z6x)tweetCompositeHeaderCollabViewStubDelegateBinder, (y6x$a)jm.O0);
    }
    
    public static tjx R() {
        return new tjx(new m9x((Class)TopicContextAggressivePromptViewModel.class), (a6x)new a6x$d("TopicContextAggressivePromptStubBinder"), (x9x)x9x$c.a);
    }
    
    public static w5x S(final AdditionalContextViewDelegateBinder additionalContextViewDelegateBinder) {
        final int e0 = hs.E0;
        return (w5x)new x5x((z6x)additionalContextViewDelegateBinder, (y6x$a)gs.E0);
    }
    
    public static gdf T(final cnb cnb, final efv efv, final w7w w7w) {
        return (gdf)new ld6(dnp.t((Object)hdf.a((Context)cnb, efv, w7w), (Object[])new gdf[] { (gdf)new jdf((Context)cnb, (gdf$a)new jd0(efv), fdf.a(), (ypa)bhd.l) }));
    }
    
    public static w5x U(final DmOuterUserImageViewDelegateBinder dmOuterUserImageViewDelegateBinder) {
        final yoj$a companion = yoj.Companion;
        return (w5x)new x5x((z6x)dmOuterUserImageViewDelegateBinder, (y6x$a)eib.J0);
    }
    
    public static nj8 a(final Activity activity, final t6p t6p, final y7p y7p, final g6p g6p, final obi obi) {
        return new nj8(activity, t6p, y7p, g6p, obi);
    }
    
    public static yo b(final Activity activity, final Fragment fragment, final bn bn, final um6 um6, final xba xba) {
        final bp bp = (bp)chw.w0((Class)bp.class);
        czd.f((Object)activity, "activity");
        czd.f((Object)bn, "activityArgsIntentFactory");
        czd.f((Object)um6, "contentViewArgsIntentFactory");
        czd.f((Object)xba, "resultStream");
        zo zo;
        if (fragment != null) {
            zo = new zo(bn, um6, (Activity)null, fragment, xba);
        }
        else {
            zo = new zo(bn, um6, activity, (Fragment)null, xba);
        }
        return (yo)zo;
    }
    
    public static bgt c(final Set set) {
        final aht aht = (aht)chw.w0((Class)aht.class);
        czd.f((Object)set, "actionedItems");
        return (bgt)new ygt(set);
    }
    
    public static void d() {
        final jx9 jx9 = (jx9)chw.w0((Class)jx9.class);
    }
    
    public static Class e() {
        return DeactivateAccountActivity.class;
    }
    
    public static c3e f(final hio hio, final ptn ptn, final m7o m7o) {
        final sio sio = (sio)chw.w0((Class)sio.class);
        czd.f((Object)hio, "roomUserItemBinder");
        czd.f((Object)ptn, "roomOverflowCountItemBinder");
        czd.f((Object)m7o, "roomSharingItemBinder");
        return (c3e)new zjg(tkg.n0(new lvj[] { new lvj((Object)RoomUserItem.class, (Object)hio), new lvj((Object)ntn.class, (Object)ptn), new lvj((Object)l7o.class, (Object)m7o) }));
    }
    
    public static hzo g(final hzo hzo) {
        final bru bru = (bru)chw.w0((Class)bru.class);
        czd.f((Object)hzo, "bound");
        return hzo;
    }
    
    public static acs h(final etm etm) {
        final acs a = dcs.a(etm.a);
        Objects.requireNonNull(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
    
    public static vxs i(final ica ica, final w7w w7w) {
        return (vxs)new wxs(new op1(ica), new uxs(tqf.i()), w7w);
    }
    
    public static efv j(final hss hss) {
        final efv efv = new efv();
        ((lzo)efv).a = 6;
        final int a = c5j.a;
        ((lzo)efv).c(hss.j());
        ((lzo)efv).d(hss.l());
        ((lzo)efv).b = hss.c;
        ((lzo)efv).c = 6;
        return efv;
    }
    
    public static RecyclerView k(final View view) {
        final RecyclerView recyclerView = (RecyclerView)view.findViewById(2131429765);
        Objects.requireNonNull(recyclerView, "Cannot return null from a non-@Nullable @Provides method");
        return recyclerView;
    }
    
    public static tjx l() {
        final StandardizedNudgeSheetViewObjectGraph$a standardizedNudgeSheetViewObjectGraph$a = (StandardizedNudgeSheetViewObjectGraph$a)chw.w0((Class)StandardizedNudgeSheetViewObjectGraph$a.class);
        return new tjx(new m9x((Class)StandardizedNudgeSheetViewModel.class, ""), (a6x)new a6x$a("StandardizedNudgeSheet"), (x9x)x9x$c.a);
    }
    
    public static zx5 m(final cnb cnb, final bai bai, final rl3 rl3, final uc6 uc6) {
        return new zx5(rl3, uc6, bai, ViewConfiguration.get((Context)cnb).getScaledTouchSlop(), new jl3(rl3));
    }
    
    public static m3c n(final Context context, final WindowManager windowManager, final Rect rect, final int n) {
        final DockObjectGraph$a dockObjectGraph$a = (DockObjectGraph$a)chw.w0((Class)DockObjectGraph$a.class);
        czd.f((Object)context, "context");
        czd.f((Object)windowManager, "windowManager");
        czd.f((Object)rect, "margins");
        final jno jno = new jno(context);
        final int d0 = e9b.D0;
        return new m3c(Integer.valueOf(n), rect, windowManager, (e9b)new j9b((gab)jno));
    }
    
    public static krm o(final Activity activity) {
        return krm.Companion.a(activity);
    }
    
    public static w5x p(final FocalTweetTextContentViewDelegateBinder focalTweetTextContentViewDelegateBinder) {
        return (w5x)new x5x((z6x)focalTweetTextContentViewDelegateBinder, (y6x$a)utu.a);
    }
    
    public static f09 q(final Context context, final umd umd) {
        return new f09(((sl1)umd).L1);
    }
    
    public static ypt r() {
        return new ypt(1);
    }
    
    public static tjx s() {
        final ouu ouu = (ouu)chw.w0((Class)ouu.class);
        return new tjx(new m9x((Class)TweetTranslateViewModel.class, ""), (a6x)new a6x$a("TweetTranslate"), (x9x)x9x$c.a);
    }
    
    public static Object t(final zd0 zd0) {
        final AnnouncementOverlayViewGraph$a announcementOverlayViewGraph$a = (AnnouncementOverlayViewGraph$a)chw.w0((Class)AnnouncementOverlayViewGraph$a.class);
        czd.f((Object)zd0, "fragment");
        return zd0;
    }
    
    public static tjx u() {
        final wuv wuv = (wuv)chw.w0((Class)wuv.class);
        return new tjx(new m9x((Class)UndoSendViewModel.class, ""), (a6x)new a6x$d("UndoSendStub"), (x9x)x9x$c.a);
    }
    
    public static w5x v(final BirdwatchIconViewDelegateBinder birdwatchIconViewDelegateBinder) {
        final iz1$a companion = iz1.Companion;
        return (w5x)new x5x((z6x)birdwatchIconViewDelegateBinder, (y6x$a)n2x.F0);
    }
    
    public static vk3 w(final umd umd, final uk3 uk3, final dua dua, final cxm cxm, final gwo gwo, final gwo gwo2, final xbm xbm) {
        return (vk3)new hf8((Fragment)umd, uk3, dua, asa.b().b("module_header_feedback_bottom_sheet_enabled", false), cxm, gwo, gwo2, xbm);
    }
    
    public static dfu x(final rfm rfm, final qk3 qk3, final boolean b) {
        return (dfu)new efu(b, (bzr)new wm3((Object)qk3, 15), rfm);
    }
    
    public static w5x y(final OffPlatformShareTweetTimestampViewBinder offPlatformShareTweetTimestampViewBinder) {
        final rfj rfj = (rfj)chw.w0((Class)rfj.class);
        czd.f((Object)offPlatformShareTweetTimestampViewBinder, "binder");
        Objects.requireNonNull(t9q.Companion);
        return y5x.a((z6x)offPlatformShareTweetTimestampViewBinder, (qsb)t9q.E0);
    }
    
    public static w5x z(final uor uor) {
        return (w5x)TweetViewViewStubDelegateBinderKt.a((ftb)new rvb((Object)uor, 2));
    }
}
