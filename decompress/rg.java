import android.view.View;
import com.twitter.android.av.video.TwitterMediaPlayerArgs;
import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import com.twitter.revenue.di.PlayableViewObjectGraph$a;
import android.content.res.Resources;
import tv.periscope.android.ui.broadcast.view.MenuViewPager;
import tv.periscope.android.view.RootDragLayout;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import tv.periscope.android.api.ApiManager;
import tv.periscope.model.b;
import tv.periscope.android.api.AuthedApiService;
import android.content.Context;
import com.twitter.rooms.replay.RoomReplayDockStubViewModel;
import com.twitter.onboarding.ocf.di.ButtonComponentObjectGraph$a;
import android.app.Activity;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rg implements wqa
{
    public static jev A() {
        final int a = gn2.a;
        return new jev();
    }
    
    public static tpv B(final qrs qrs) {
        final tpv o = qrs.o();
        Objects.requireNonNull(o, "Cannot return null from a non-@Nullable @Provides method");
        return o;
    }
    
    public static oof C(final u4 u4) {
        final int a = gn2.a;
        final i1 b1 = u4.b.b1;
        final int a2 = w4j.a;
        final oof oof = (oof)b1;
        Objects.requireNonNull(oof, "Cannot return null from a non-@Nullable @Provides method");
        return oof;
    }
    
    public static qn D(qn w, final Activity activity) {
        w = w.w(activity);
        Objects.requireNonNull(w, "Cannot return null from a non-@Nullable @Provides method");
        return w;
    }
    
    public static jz E() {
        final int a = gn2.a;
        return (jz)new yki();
    }
    
    public static void a() {
        final kyu kyu = (kyu)ca7.u((Class)kyu.class);
        final qm9 a = (qm9)qm9.a;
    }
    
    public static h53 b(final r3e r3e) {
        final ButtonComponentObjectGraph$a buttonComponentObjectGraph$a = (ButtonComponentObjectGraph$a)ca7.u((Class)ButtonComponentObjectGraph$a.class);
        zzd.f((Object)r3e, "item");
        final h53 h53 = (h53)r3e.a;
        Objects.requireNonNull(h53, "Cannot return null from a non-@Nullable @Provides method");
        return h53;
    }
    
    public static fai c(final snj snj) {
        final qht qht = (qht)ca7.u((Class)qht.class);
        zzd.f((Object)snj, "optional");
        final fai fai = (fai)snj.c();
        Objects.requireNonNull(fai, "Cannot return null from a non-@Nullable @Provides method");
        return fai;
    }
    
    public static xau d(final gvk gvk) {
        final xau b = gvk.b();
        Objects.requireNonNull(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
    
    public static c5x e() {
        final z0o z0o = (z0o)ca7.u((Class)z0o.class);
        return (c5x)goz.k(g9m.a((Class)RoomReplayDockStubViewModel.class), (rtb)x0o.C0);
    }
    
    public static uyc f(final Context context, final AuthedApiService authedApiService, final hmp hmp, final d9w d9w, final jac jac) {
        final int a = gn2.a;
        zzd.f((Object)authedApiService, "apiService");
        zzd.f((Object)hmp, "sessionCache");
        zzd.f((Object)jac, "guestServiceSessionRepository");
        zzd.f((Object)d9w, "userCache");
        zzd.f((Object)context, "context");
        return (uyc)new vyc(new szc(), new pzc(), (tzc)new uzc(), (qzc)new rzc(), new nyc(authedApiService, hmp), jac, d9w, context);
    }
    
    public static al g(final oof oof, final d9w d9w, final dtj dtj, final aj2 aj2, final eib eib, final q9f q9f, final e5k e5k, final eac eac, final swc swc, final rq9 rq9, final i9d i9d, final mf2 mf2, final boolean b) {
        final int a = gn2.a;
        final b f = oof.f(oof);
        final boolean equals = f.j0().equals(d9w.n());
        final boolean b2 = iw6.b();
        Object o;
        if (equals) {
            o = new qk2((ol)dtj, i9d, aj2, rq9, d9w, mf2, (mtm)new fk7(), true, true, b, b2, false, true);
        }
        else {
            Object o2;
            if (swc.b()) {
                o2 = null;
            }
            else {
                o2 = new aef(f.w(), aj2);
            }
            o = new se2((ol)dtj, i9d, aj2, (ojh)q9f, d9w, mf2, new fj4((Object)oof, 9), eib, e5k.a, eac, (pe2)o2, b2);
        }
        return (al)o;
    }
    
    public static rq9 h(final br9 br9) {
        final int a = gn2.a;
        Objects.requireNonNull(br9);
        return (rq9)new cn2(br9);
    }
    
    public static v09 i(final Context context, final rnd rnd) {
        return new v09(((wl1)rnd).K1);
    }
    
    public static iw6 j(final Context context, final ApiManager apiManager, final maa maa, final d9w d9w, final jw6 o0) {
        final int a = gn2.a;
        final iw6 iw6 = new iw6(context, apiManager, maa, d9w, iw6.b());
        iw6.O0 = o0;
        if (!iw6.F0.d((Object)iw6)) {
            iw6.F0.i((Object)iw6);
        }
        return iw6;
    }
    
    public static Map k(final Map map) {
        final HashMap hashMap = new HashMap();
        for (final Map.Entry<ykx, V> entry : map.entrySet()) {
            hashMap.put(new f5x(((y61)entry.getKey()).b, ((y61)entry.getKey()).c), entry.getValue());
        }
        return hashMap;
    }
    
    public static vtj l(final RootDragLayout rootDragLayout, final fnk d) {
        final int a = gn2.a;
        final vtj vtj = new vtj((wtj)new xtj(rootDragLayout, (MenuViewPager)((View)rootDragLayout).findViewById(2131430043)));
        vtj.d = d;
        return vtj;
    }
    
    public static s64 m(final Activity activity, final gp6 gp6, final d9w d9w, final i9d i9d) {
        final int a = gn2.a;
        return (s64)new t64(activity, d9w, gp6, i9d);
    }
    
    public static f1s n(final Resources resources, final d9w d9w, final e22 e22, final gp6 gp6, final oof oof, final nxh nxh, final scx scx, final l04 l04, final i9d i9d) {
        final int a = gn2.a;
        return new f1s(resources, d9w.b(), d9w.u(), e22, i9d, d9w, gp6, oof.a(), nxh, (f04$b)l04, (f1s$a)scx);
    }
    
    public static ii3 o(final gob gob, final ck3 ck3, final mbi mbi) {
        final PlayableViewObjectGraph$a playableViewObjectGraph$a = (PlayableViewObjectGraph$a)ca7.u((Class)PlayableViewObjectGraph$a.class);
        zzd.f((Object)ck3, "logger");
        zzd.f((Object)mbi, "navigator");
        return (ii3)new li3((Activity)gob, (qeu)new reu((Context)gob), mbi);
    }
    
    public static kyr p(final kyr kyr) {
        final int a = w4j.a;
        Objects.requireNonNull(kyr, "Cannot return null from a non-@Nullable @Provides method");
        return kyr;
    }
    
    public static dzv q(final Context context, final LayoutInflater layoutInflater) {
        return new dzv((bra)new jus(context, layoutInflater));
    }
    
    public static nl3 r(final rnd rnd, final ml3 ml3, final jva jva, final lwm lwm, final qvo qvo, final qvo qvo2, final ibm ibm) {
        return (nl3)new xf8((Fragment)rnd, ml3, jva, dta.b().b("module_header_feedback_bottom_sheet_enabled", false), lwm, qvo, qvo2, ibm);
    }
    
    public static n5f s() {
        return new n5f();
    }
    
    public static c5x t(final UserIdentifier userIdentifier, final Activity activity, final mbi mbi, final Resources resources, final qnq qnq, final seo seo, final hxn hxn) {
        final apq apq = (apq)ca7.u((Class)apq.class);
        zzd.f((Object)userIdentifier, "currentUser");
        zzd.f((Object)activity, "activity");
        zzd.f((Object)mbi, "navigator");
        zzd.f((Object)resources, "resources");
        zzd.f((Object)qnq, "spacesCardUtils");
        zzd.f((Object)seo, "roomToaster");
        zzd.f((Object)hxn, "reminderToaster");
        return pkx.a((rtb)new yoq(qnq, userIdentifier, activity, resources, mbi, seo, hxn));
    }
    
    public static void u() {
        final h0k h0k = (h0k)ca7.u((Class)h0k.class);
        Objects.requireNonNull(k0k.Companion);
    }
    
    public static c5x v(final Resources resources) {
        return pkx.a((rtb)new kvs(resources));
    }
    
    public static ami w(final Context context, final LayoutInflater layoutInflater) {
        return new ami((bra)new jus(context, layoutInflater));
    }
    
    public static i1 x(final TwitterMediaPlayerArgs twitterMediaPlayerArgs) {
        final n3 n3 = (n3)ca7.u((Class)n3.class);
        zzd.f((Object)twitterMediaPlayerArgs, "args");
        final i1 dataSource = twitterMediaPlayerArgs.getDataSource();
        zzd.c((Object)dataSource);
        return dataSource;
    }
    
    public static pca y(final adc adc) {
        final kax kax = (kax)ca7.u((Class)kax.class);
        return ((bdc)adc).K();
    }
    
    public static y8x z(final t8x t8x) {
        final tkx$a tkx$a = (tkx$a)ca7.u((Class)tkx$a.class);
        zzd.f((Object)t8x, "provider");
        return new y8x(t8x);
    }
}
