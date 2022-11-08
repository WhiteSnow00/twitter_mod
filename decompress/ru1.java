import android.animation.ValueAnimator;
import java.lang.ref.WeakReference;
import android.app.Activity;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import tv.periscope.android.view.WaitingTextView;
import com.twitter.card.newsletter.base.NewsletterCardViewModel;
import androidx.recyclerview.widget.RecyclerView;
import com.twitter.card.unified.di.card.UnifiedCardObjectGraph$a;
import com.twitter.explore.immersive.ui.videoplayer.ImmersiveVideoViewDelegateBinder;
import tv.periscope.android.api.ApiManager;
import com.twitter.media.av.broadcast.view.fullscreen.a;
import android.os.Handler;
import android.content.res.Resources;
import com.twitter.media.ui.image.UserImageView;
import tv.periscope.android.view.BroadcastActionSheet$a;
import tv.periscope.android.view.ActionSheet;
import tv.periscope.android.view.BroadcastActionSheet;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ObjectAnimator;
import tv.periscope.android.ui.broadcast.moderator.ModeratorView;
import tv.periscope.android.ui.broadcast.ChatRoomView;
import com.twitter.android.liveevent.card.di.LiveEventCardObjectGraph$a;
import com.twitter.model.liveevent.LiveEventConfiguration;
import android.view.View;
import tv.periscope.android.view.RootDragLayout;
import java.util.Set;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ru1 implements wqa
{
    public static lt7 a(final rjq rjq, final fxe fxe, final fxe fxe2) {
        final y28 y28 = (y28)ca7.u((Class)y28.class);
        zzd.f((Object)rjq, "config");
        zzd.f((Object)fxe, "soft");
        zzd.f((Object)fxe2, "regular");
        final lt7 lt7 = (lt7)rjq.Companion.a(rjq, fxe, fxe2);
        Objects.requireNonNull(lt7, "Cannot return null from a non-@Nullable @Provides method");
        return lt7;
    }
    
    public static emu b(final gob gob, final jev jev, final jev jev2, final gew gew, final lcv lcv, final aws aws, final z7x z7x, final rnd rnd, final hja hja, final lja lja) {
        final aka aka = (aka)ca7.u((Class)aka.class);
        zzd.f((Object)jev, "association");
        zzd.f((Object)jev2, "prevScreenScribeAssociation");
        zzd.f((Object)gew, "userManager");
        zzd.f((Object)lcv, "viewHost");
        zzd.f((Object)aws, "timelineIdentifier");
        zzd.f((Object)z7x, "viewLifecycle");
        zzd.f((Object)hja, "exploreImmersiveDetailsItem");
        zzd.f((Object)lja, "exploreImmersiveItem");
        final UserIdentifier k1 = ((wl1)rnd).K1;
        zzd.e((Object)k1, "fragment.owner");
        return (emu)new mja((Context)gob, jev, jev2, gew, lcv, aws, z7x, k1, hja, lja);
    }
    
    public static Set c(final fxe fxe, final rt1 rt1) {
        final qu1 qu1 = (qu1)ca7.u((Class)qu1.class);
        zzd.f((Object)fxe, "impressionAutoInitializer");
        zzd.f((Object)rt1, "config");
        Object o;
        if (rt1.a && rt1.c) {
            o = rqu.K(fxe.get());
        }
        else {
            o = f3a.C0;
        }
        return (Set)o;
    }
    
    public static void d() {
        final et3 et3 = (et3)ca7.u((Class)et3.class);
        final ckf c0 = ckf.C0;
    }
    
    public static qvo e() {
        final s83 s83 = (s83)ca7.u((Class)s83.class);
        final qvo c = yvo.c();
        zzd.e((Object)c, "io()");
        return c;
    }
    
    public static void f() {
        final int a = gn2.a;
        Objects.requireNonNull(wyc.Companion);
    }
    
    public static icx g(final RootDragLayout rootDragLayout) {
        final int a = gn2.a;
        return (icx)new eaf((View)rootDragLayout);
    }
    
    public static ixf h(final LiveEventConfiguration liveEventConfiguration) {
        final LiveEventCardObjectGraph$a liveEventCardObjectGraph$a = (LiveEventCardObjectGraph$a)ca7.u((Class)LiveEventCardObjectGraph$a.class);
        zzd.f((Object)liveEventConfiguration, "liveEventConfiguration");
        return new ixf(liveEventConfiguration);
    }
    
    public static ChatRoomView i(final RootDragLayout rootDragLayout, final t14 chatMessageDelegate, final ba2 bottomTrayActionButtonPresenter, final i9d imageLoader, final giw giw, final qa7 customHeartCache, final r9f moderatorSelectionListener) {
        final int a = gn2.a;
        final ChatRoomView chatRoomView = (ChatRoomView)((View)rootDragLayout).findViewById(2131428194);
        if (u3k.c(giw)) {
            chatRoomView.j1 = true;
            final ModeratorView o0 = (ModeratorView)((View)chatRoomView).findViewById(2131430099);
            chatRoomView.O0 = o0;
            final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)o0, View.ALPHA, new float[] { 1.0f, 0.0f });
            final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)chatRoomView.F0, View.ALPHA, new float[] { 0.0f, 1.0f });
            final ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object)chatRoomView.H0, View.ALPHA, new float[] { 0.0f, 1.0f });
            final ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat((Object)chatRoomView.C0, View.TRANSLATION_Y, new float[] { 0.0f, 0.0f });
            final ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat((Object)chatRoomView.J0, View.TRANSLATION_Y, new float[] { 0.0f, 0.0f });
            ((ValueAnimator)ofFloat5).addUpdateListener((ValueAnimator$AnimatorUpdateListener)chatRoomView.I0);
            final long duration = 500;
            ((Animator)ofFloat).setDuration(duration);
            final AnimatorSet p7 = new AnimatorSet();
            p7.setDuration(duration);
            p7.playTogether(new Animator[] { (Animator)ofFloat, (Animator)ofFloat4, (Animator)ofFloat2, (Animator)ofFloat3 });
            ((Animator)p7).addListener((Animator$AnimatorListener)new o54(chatRoomView, ofFloat5, ofFloat4));
            chatRoomView.P0 = p7;
            final ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat((Object)chatRoomView.N0, View.ALPHA, new float[] { 1.0f, 0.0f });
            final ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat((Object)chatRoomView.F0, View.ALPHA, new float[] { 0.0f, 1.0f });
            final ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat((Object)chatRoomView.H0, View.ALPHA, new float[] { 0.0f, 1.0f });
            final ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat((Object)chatRoomView.C0, View.TRANSLATION_Y, new float[] { 0.0f, 0.0f });
            final ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat((Object)chatRoomView.J0, View.TRANSLATION_Y, new float[] { 0.0f, 0.0f });
            ((ValueAnimator)ofFloat10).addUpdateListener((ValueAnimator$AnimatorUpdateListener)chatRoomView.I0);
            final AnimatorSet r0 = new AnimatorSet();
            r0.setDuration(duration);
            r0.playTogether(new Animator[] { (Animator)ofFloat6, (Animator)ofFloat7, (Animator)ofFloat8, (Animator)ofFloat9, (Animator)ofFloat10 });
            ((Animator)r0).addListener((Animator$AnimatorListener)new t54(chatRoomView, ofFloat10, ofFloat9));
            chatRoomView.R0 = r0;
            final ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat((Object)chatRoomView.N0, View.ALPHA, new float[] { 1.0f, 0.0f });
            final ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat((Object)chatRoomView.H0, View.ALPHA, new float[] { 0.0f, 1.0f });
            final ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat((Object)chatRoomView.C0, View.TRANSLATION_Y, new float[] { 0.0f, 0.0f });
            final ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat((Object)chatRoomView.J0, View.TRANSLATION_Y, new float[] { 0.0f, 0.0f });
            ((ValueAnimator)ofFloat14).addUpdateListener((ValueAnimator$AnimatorUpdateListener)chatRoomView.I0);
            final AnimatorSet s0 = new AnimatorSet();
            s0.setDuration(duration);
            s0.playTogether(new Animator[] { (Animator)ofFloat11, (Animator)ofFloat12, (Animator)ofFloat13, (Animator)ofFloat14 });
            ((Animator)s0).addListener((Animator$AnimatorListener)new u54(chatRoomView, ofFloat13, ofFloat14));
            chatRoomView.S0 = s0;
            final ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat((Object)chatRoomView.N0, View.ALPHA, new float[] { 0.0f, 1.0f });
            final ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat((Object)chatRoomView.F0, View.ALPHA, new float[] { 1.0f, 0.0f });
            final ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat((Object)chatRoomView.H0, View.ALPHA, new float[] { 1.0f, 0.0f });
            final ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat((Object)chatRoomView.J0, View.TRANSLATION_Y, new float[] { 0.0f, 0.0f });
            ((ValueAnimator)ofFloat18).addUpdateListener((ValueAnimator$AnimatorUpdateListener)chatRoomView.I0);
            final ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat((Object)chatRoomView.C0, View.TRANSLATION_Y, new float[] { 0.0f, 0.0f });
            final AnimatorSet q0 = new AnimatorSet();
            q0.setDuration(duration);
            q0.playTogether(new Animator[] { (Animator)ofFloat15, (Animator)ofFloat16, (Animator)ofFloat17, (Animator)ofFloat19, (Animator)ofFloat18 });
            ((Animator)q0).addListener((Animator$AnimatorListener)new s54(chatRoomView, ofFloat19, ofFloat18));
            chatRoomView.Q0 = q0;
        }
        chatRoomView.setChatMessageDelegate((u14)chatMessageDelegate);
        chatRoomView.setModeratorSelectionListener((vjh)moderatorSelectionListener);
        chatRoomView.setBottomTrayActionButtonPresenter(bottomTrayActionButtonPresenter);
        chatRoomView.setImageLoader(imageLoader);
        chatRoomView.setCustomHeartCache(customHeartCache);
        return chatRoomView;
    }
    
    public static fac j(final e1d e1d) {
        final int a = gn2.a;
        return new fac(e1d);
    }
    
    public static dtj k(final qe2 qe2, final vtj vtj, final BroadcastActionSheet broadcastActionSheet) {
        final int a = gn2.a;
        final dtj dtj = new dtj(qe2, (ActionSheet)broadcastActionSheet, vtj);
        broadcastActionSheet.setEmptySpaceTouchListener((BroadcastActionSheet$a)new l71((Object)dtj, 14));
        return dtj;
    }
    
    public static UserImageView l(final View view) {
        final UserImageView userImageView = (UserImageView)view.findViewById(2131429789);
        Objects.requireNonNull(userImageView, "Cannot return null from a non-@Nullable @Provides method");
        return userImageView;
    }
    
    public static g44 m(final Context context, final Resources resources, final Handler handler, final ChatRoomView chatRoomView, final rv3 rv3, final u9f u9f, final gok gok, final pjc pjc, final z5h z5h, final fm2 fm2, final fib fib, final l5k l5k, final t14 t14, final s64 s64, final a a, final eix eix, final oof oof, final d9w d9w, final n5k n5k, final yph yph, final p3f p3f, final w9f w9f, final fwc fwc, final r5k r5k, final pn2 pn2, final ApiManager apiManager, final xq3 xq3, final i9d i9d, final zmd zmd) {
        final int a2 = gn2.a;
        final g44 h0 = new g44(context, resources, handler, apiManager, rv3, (g44$c)u9f, gok, pjc, new pxs((su3)new tu3(n5k, (xzo)r5k), d9w, oof.a(), pn2), d9w, z5h, fm2, fib, (trp)l5k, (o3c)yph.V0, p3f, i9d, (u14)t14, s64, (nu3)a, eix, t14, fwc, zmd);
        chatRoomView.setSendCommentDelegate((qgp)h0);
        chatRoomView.setPunishmentStatusDelegate((inl)h0);
        return (g44)(w9f.H0 = (e44)h0);
    }
    
    public static c5x n(final ImmersiveVideoViewDelegateBinder immersiveVideoViewDelegateBinder, final qgx qgx, final lja lja, final hja hja) {
        final oka oka = (oka)ca7.u((Class)oka.class);
        zzd.f((Object)immersiveVideoViewDelegateBinder, "viewBinder");
        zzd.f((Object)qgx, "volumeMuteState");
        zzd.f((Object)lja, "exploreImmersiveItem");
        zzd.f((Object)hja, "exploreImmersiveDetailsItem");
        return e5x.a((g6x)immersiveVideoViewDelegateBinder, (rtb)new mka(qgx, lja, hja));
    }
    
    public static urp o(final l5k l5k) {
        final int a = gn2.a;
        final oev g0 = l5k.G0;
        Objects.requireNonNull(g0, "Cannot return null from a non-@Nullable @Provides method");
        return (urp)g0;
    }
    
    public static nja p(final ybv ybv, final jev jev, final jev jev2, final UserIdentifier userIdentifier, final n7w n7w, final nd0 nd0, final hja hja, final lja lja, final jcd jcd, final ibm ibm) {
        final oka oka = (oka)ca7.u((Class)oka.class);
        zzd.f((Object)ybv, "dependencies");
        zzd.f((Object)jev, "scribeAssociation");
        zzd.f((Object)jev2, "prevScreenScribeAssociation");
        zzd.f((Object)userIdentifier, "userIdentifier");
        zzd.f((Object)n7w, "scribeItemFactory");
        zzd.f((Object)nd0, "lingerDelegate");
        zzd.f((Object)hja, "exploreImmersiveDetailsItem");
        zzd.f((Object)lja, "exploreImmersiveItem");
        zzd.f((Object)jcd, "contentViewProvider");
        zzd.f((Object)ibm, "releaseCompletable");
        Object o;
        if (tdf.a().a) {
            o = new oja(ybv, jev, jev2, userIdentifier, n7w, nd0, hja, lja, jcd, ibm);
        }
        else {
            o = new mli();
        }
        return (nja)o;
    }
    
    public static ibq q(final bbk bbk) {
        final h0k h0k = (h0k)ca7.u((Class)h0k.class);
        zzd.f((Object)bbk, "impl");
        return new ibq(bbk, "pctSpanNextSequenceNumber");
    }
    
    public static ky1 r(final wni wni) {
        final UnifiedCardObjectGraph$a unifiedCardObjectGraph$a = (UnifiedCardObjectGraph$a)ca7.u((Class)UnifiedCardObjectGraph$a.class);
        zzd.f((Object)wni, "nonNativeCardViewHost");
        return (ky1)wni;
    }
    
    public static RecyclerView s(final View view) {
        final RecyclerView recyclerView = (RecyclerView)view.findViewById(2131432395);
        Objects.requireNonNull(recyclerView, "Cannot return null from a non-@Nullable @Provides method");
        return recyclerView;
    }
    
    public static b5j t(final cbm cbm) {
        final ana ana = (ana)ca7.u((Class)ana.class);
        zzd.f((Object)cbm, "selectedIndexRelay");
        final b5j hide = cbm.hide();
        zzd.e((Object)hide, "selectedIndexRelay.hide()");
        return hide;
    }
    
    public static yix u() {
        final lgi lgi = (lgi)ca7.u((Class)lgi.class);
        return new yix(new r8x((Class)NewsletterCardViewModel.class, ""), (g5x)new g5x$a("NewsletterPublicationCardComponent"), (c9x)c9x$c.a);
    }
    
    public static WaitingTextView v(final View view) {
        final WaitingTextView waitingTextView = (WaitingTextView)view.findViewById(2131429503);
        Objects.requireNonNull(waitingTextView, "Cannot return null from a non-@Nullable @Provides method");
        return waitingTextView;
    }
    
    public static ConstraintLayout w(final RootDragLayout rootDragLayout) {
        final int a = gn2.a;
        final View inflate = ((ViewStub)((View)rootDragLayout).findViewById(2131429499)).inflate();
        final int a2 = w4j.a;
        final ConstraintLayout constraintLayout = (ConstraintLayout)inflate;
        Objects.requireNonNull(constraintLayout, "Cannot return null from a non-@Nullable @Provides method");
        return constraintLayout;
    }
    
    public static k9f x(final oof oof, final fxe fxe, final swc swc) {
        final int a = gn2.a;
        Object l;
        if (oof.f(oof).b() && swc.b()) {
            l = fxe.get();
        }
        else {
            l = k9f.L;
        }
        Objects.requireNonNull(l, "Cannot return null from a non-@Nullable @Provides method");
        return (k9f)l;
    }
    
    public static WeakReference y(final Activity activity) {
        final int a = gn2.a;
        return new WeakReference((T)activity);
    }
}
