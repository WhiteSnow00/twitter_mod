import com.twitter.tweetview.focal.ui.follownudge.FollowNudgeButtonViewDelegateBinder;
import android.content.res.Resources;
import com.twitter.core.ui.styles.icons.implementation.Icon;
import com.twitter.app.bookmarks.folders.create.CreateFolderViewModel;
import android.content.Intent;
import com.twitter.tweetview.core.ui.analyticsbar.AnalyticsBarViewDelegateBinder;
import java.util.Iterator;
import java.util.HashMap;
import androidx.fragment.app.p;
import com.twitter.android.topiccarousel.stub.StatsBarViewStubDelegateBinder;
import java.util.Set;
import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.Fragment;
import com.twitter.tweetview.core.ui.mediatags.MediaTagsViewDelegateBinder;
import com.twitter.ui.dock.di.dock.DockObjectGraph$a;
import com.twitter.tweetview.core.ui.quote.QuoteViewDelegateBinder;
import com.twitter.tweetview.core.TweetViewViewModel;
import com.twitter.rooms.ui.topics.main.RoomTopicsTaggingViewModel;
import com.twitter.tweetview.core.ui.monetization.MediaMonetizationMetadataViewDelegateBinder;
import android.app.Activity;
import com.twitter.tweetview.focal.ui.tweetheader.FocalTweetHeaderViewDelegateBinder;
import com.twitter.tweetview.core.ui.edit.FocalEditOutdatedCalloutViewDelegateBinder;
import com.twitter.ui.adapters.inject.ItemObjectGraph$a;
import java.util.Map;
import java.util.Objects;
import com.twitter.tweetview.focal.ui.conversationcontrols.FocalTweetConversationControlsViewDelegateBinder;
import com.twitter.timeline.itembinder.ui.ShowMoreCursorViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wk implements bra
{
    public static fda A(final cdc cdc) {
        final ybx ybx = (ybx)lp7.m0((Class)ybx.class);
        return ((ddc)cdc).D();
    }
    
    public static ikx B() {
        return new ikx(new fax((Class)ShowMoreCursorViewModel.class), (s6x)new s6x$a("ShowMoreCursorViewDelegate"), (qax)qax$c.a);
    }
    
    public static o6x C(final FocalTweetConversationControlsViewDelegateBinder focalTweetConversationControlsViewDelegateBinder) {
        final xcb$a companion = xcb.Companion;
        return (o6x)new p6x((r7x)focalTweetConversationControlsViewDelegateBinder, (q7x$a)hs.L0);
    }
    
    public static udv D(final udv udv) {
        final int a = o5j.a;
        Objects.requireNonNull(udv, "Cannot return null from a non-@Nullable @Provides method");
        return udv;
    }
    
    public static max E(final Map map) {
        final ItemObjectGraph$a itemObjectGraph$a = (ItemObjectGraph$a)lp7.m0((Class)ItemObjectGraph$a.class);
        return new max(dw8.b(map));
    }
    
    public static ikx F() {
        return rk0.d((Class)FocalEditOutdatedCalloutViewDelegateBinder.class, (String)null);
    }
    
    public static max G(final hax hax) {
        final cmx$a cmx$a = (cmx$a)lp7.m0((Class)cmx$a.class);
        e0e.f((Object)hax, "provider");
        return new max(hax);
    }
    
    public static ikx H() {
        return rk0.d((Class)FocalTweetHeaderViewDelegateBinder.class, (String)null);
    }
    
    public static vnd I(final Activity activity) {
        final int a = o5j.a;
        final vnd vnd = vnd.class.cast(activity);
        Objects.requireNonNull(vnd, "Cannot return null from a non-@Nullable @Provides method");
        return vnd;
    }
    
    public static ikx J() {
        return rk0.d((Class)MediaMonetizationMetadataViewDelegateBinder.class, (String)null);
    }
    
    public static ikx K() {
        final mio mio = (mio)lp7.m0((Class)mio.class);
        return new ikx(new fax((Class)RoomTopicsTaggingViewModel.class, "RoomTopicsTagging"), (s6x)new s6x$a("RoomTopicsTaggingViewBinder"), (qax)qax$c.a);
    }
    
    public static ikx L() {
        final egj egj = (egj)lp7.m0((Class)egj.class);
        return new ikx(new fax((Class)TweetViewViewModel.class, ""), (s6x)new s6x$c((Class)QuoteViewDelegateBinder.class, (String)null), (qax)qax$c.a);
    }
    
    public static i69 M(final o69 o69, final e79 e79) {
        final DockObjectGraph$a dockObjectGraph$a = (DockObjectGraph$a)lp7.m0((Class)DockObjectGraph$a.class);
        e0e.f((Object)o69, "eventManager");
        e0e.f((Object)e79, "scribingController");
        return new i69(o69, e79);
    }
    
    public static o6x N(final MediaTagsViewDelegateBinder mediaTagsViewDelegateBinder) {
        return (o6x)new p6x((r7x)mediaTagsViewDelegateBinder, (q7x$a)x1h.G0);
    }
    
    public static ex8 a(final Fragment fragment) {
        final int a = o5j.a;
        final ex8 ex8 = (ex8)fragment;
        vmw.g((Object)ex8);
        Objects.requireNonNull(ex8, "Cannot return null from a non-@Nullable @Provides method");
        return ex8;
    }
    
    public static bn9 b(final bts bts) {
        return s1.Companion.a(bts.n());
    }
    
    public static r2t c(final fxs b, final UserIdentifier a) {
        final r2t$a r2t$a = new r2t$a();
        r2t$a.b = b;
        r2t$a.a = a;
        return (r2t)((z4j)r2t$a).e();
    }
    
    public static Set d(final udv udv, final pwu pwu) {
        final owu a = pwu.a();
        Object g2;
        if (a != null) {
            final anf anf = new anf(udv, a);
            final qed$b g0 = qed.G0;
            g2 = new qed$c((Object)anf);
        }
        else {
            g2 = qed.G0;
            final int a2 = o5j.a;
        }
        Objects.requireNonNull(g2, "Cannot return null from a non-@Nullable @Provides method");
        return (Set)g2;
    }
    
    public static r9 e(final jzv jzv) {
        final izv izv = (izv)lp7.m0((Class)izv.class);
        e0e.f((Object)jzv, "endpointFactory");
        final kzv kzv = jzv.a.get(jzv.b);
        Object a;
        if (kzv != null) {
            a = kzv.a();
        }
        else {
            a = null;
        }
        e0e.c(a);
        return (r9)a;
    }
    
    public static gcu f(final fwk fwk) {
        final gcu b = fwk.b();
        Objects.requireNonNull(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
    
    public static qow g(final mdq mdq, final rbq rbq, final kcm kcm) {
        return new qow(rbq, (iow)new low(mdq.L0), kcm);
    }
    
    public static o6x h(final StatsBarViewStubDelegateBinder statsBarViewStubDelegateBinder) {
        final qlt qlt = (qlt)lp7.m0((Class)qlt.class);
        e0e.f((Object)statsBarViewStubDelegateBinder, "viewBinder");
        final jcx$a companion = jcx.Companion;
        return (o6x)new p6x((r7x)statsBarViewStubDelegateBinder, (q7x$a)mm.Q0);
    }
    
    public static void i() {
        final csw csw = (csw)lp7.m0((Class)csw.class);
    }
    
    public static zlx j(final pkx pkx, final kcm kcm) {
        final hmx$a hmx$a = (hmx$a)lp7.m0((Class)hmx$a.class);
        e0e.f((Object)pkx, "factory");
        e0e.f((Object)kcm, "releaseCompletable");
        return (zlx)new amx(pkx, (iae)kcm, (ptb)gmx.F0);
    }
    
    public static ww8 k(final p p) {
        return new ww8(p, "URTCoverController_FullCover_Tag");
    }
    
    public static Map l(final Map map) {
        final HashMap hashMap = new HashMap();
        for (final Map.Entry<imx, V> entry : map.entrySet()) {
            hashMap.put(new r6x(((z61)entry.getKey()).b, ((z61)entry.getKey()).c), entry.getValue());
        }
        return hashMap;
    }
    
    public static ww8 m(final p p) {
        return new ww8(p, "URTCoverController_HalfCover_Tag");
    }
    
    public static o6x n(final AnalyticsBarViewDelegateBinder analyticsBarViewDelegateBinder) {
        return (o6x)new p6x((r7x)analyticsBarViewDelegateBinder, (q7x$a)nz.G0);
    }
    
    public static fo9 o(final ttm ttm) {
        return new fo9(ttm.b);
    }
    
    public static abi p(final Set set) {
        final yit yit = (yit)lp7.m0((Class)yit.class);
        final abi abi = (abi)rr4.B1((Iterable)set);
        Objects.requireNonNull(abi, "Cannot return null from a non-@Nullable @Provides method");
        return abi;
    }
    
    public static rzv q(final ttm ttm) {
        final wpt wpt = (wpt)lp7.m0((Class)wpt.class);
        e0e.f((Object)ttm, "retainedArgs");
        final Intent a = ttm.a;
        e0e.e((Object)a, "retainedArgs.intent");
        return new rzv(a);
    }
    
    public static ikx r() {
        final x47 x47 = (x47)lp7.m0((Class)x47.class);
        return new ikx(new fax((Class)CreateFolderViewModel.class, ""), (s6x)new s6x$a("FolderCreate"), (qax)qax$c.a);
    }
    
    public static kva s(final hys hys) {
        return (kva)hys.f(Integer.valueOf(2));
    }
    
    public static kva t(final hys hys) {
        return (kva)hys.f(Integer.valueOf(1));
    }
    
    public static o6x u() {
        return ylx.a((stb)beb.G0);
    }
    
    public static u5f v() {
        return new u5f();
    }
    
    public static ikx w() {
        final x47 x47 = (x47)lp7.m0((Class)x47.class);
        return new ikx(new fax((Class)CreateFolderViewModel.class, ""), (s6x)new s6x$d("FolderCreateStub"), (qax)qax$c.a);
    }
    
    public static Set x() {
        final a9s a9s = (a9s)lp7.m0((Class)a9s.class);
        final j8s j8s = new j8s(k8s.G0, jpc.i0, jpc.h0, 2131954305, 0, 2, 2131954306);
        boolean b = false;
        final j8s j8s2 = new j8s(k8s.H0, jpc.q1, jpc.p1, 2131954008, 1, 2, 2131954009);
        if (vjo.m() || rpr.Companion.b()) {
            b = true;
        }
        final k8s i0 = k8s.I0;
        final Icon u1 = jpc.u1;
        final Icon t1 = jpc.t1;
        int n;
        if (b) {
            n = 2131952073;
        }
        else {
            n = 2131958293;
        }
        int n2;
        if (b) {
            n2 = 2131952074;
        }
        else {
            n2 = 2131958294;
        }
        return fr0.Q((Object[])new j8s[] { j8s, j8s2, new j8s(i0, u1, t1, n, 2, 2, n2), new j8s(k8s.J0, jpc.F, jpc.E, 2131952570, 3, 2, 2131952571), new j8s(k8s.K0, jpc.J0, jpc.F0, 2131955517, 4, 2, 2131955518), new j8s(k8s.L0, jpc.A0, jpc.y0, 2131955066, 5, 2, 2131955067) });
    }
    
    public static o6x y(final Resources resources) {
        return ylx.a((stb)new lg1((Object)resources, 1));
    }
    
    public static o6x z(final FollowNudgeButtonViewDelegateBinder followNudgeButtonViewDelegateBinder) {
        final iib$a companion = iib.Companion;
        return (o6x)new p6x((r7x)followNudgeButtonViewDelegateBinder, (q7x$a)mm.N0);
    }
}
