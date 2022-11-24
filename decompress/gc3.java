import com.twitter.tweetview.core.ui.TweetViewViewStubDelegateBinder;
import com.twitter.tweetview.core.ui.analyticsbar.AnalyticsBarViewDelegateBinder;
import com.twitter.card.unified.di.card.UnifiedCardObjectGraph$a;
import com.twitter.card.di.BaseCardObjectGraph$a;
import com.twitter.tweetview.focal.ui.tweetstats.FocalTweetStatsViewDelegateBinder;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.accounts.AccountManager;
import android.app.Application;
import java.util.Set;
import com.twitter.tweetview.screenshot.core.share.ui.tweetheader.OffPlatformShareTweetCollaborationHeaderViewDelegateBinder;
import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.p;
import android.content.Context;
import com.twitter.app.profiles.di.retained.ProfileEmptyStateViewGraph$a;
import com.twitter.tweetview.screenshot.core.share.ui.inlineactions.OffPlatformShareTweetReplyCountViewBinder;
import com.twitter.tweetview.core.TweetViewViewModel;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import com.twitter.tweetview.core.ui.moderatedreplies.ModeratedRepliesIconViewDelegateBinder;
import com.twitter.tweetview.focal.ui.tweetheader.FocalTweetHeaderViewStubDelegateBinder;
import java.util.Objects;
import com.twitter.ui.adapters.inject.ItemObjectGraph$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gc3 implements bra
{
    public static Object A(final pkx pkx, final eo6 eo6) {
        final ItemObjectGraph$a itemObjectGraph$a = (ItemObjectGraph$a)lp7.m0((Class)ItemObjectGraph$a.class);
        e0e.f((Object)pkx, "factory");
        e0e.f((Object)eo6, "contentViewProvider");
        final u9x b = pkx.b(eo6.c().getView());
        Objects.requireNonNull(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
    
    public static ikx B() {
        return rk0.d((Class)FocalTweetHeaderViewStubDelegateBinder.class, (String)null);
    }
    
    public static ikx C() {
        return rk0.d((Class)ModeratedRepliesIconViewDelegateBinder.class, (String)null);
    }
    
    public static t6x D(final Map map) {
        final hmx$a hmx$a = (hmx$a)lp7.m0((Class)hmx$a.class);
        return dw8.a(map);
    }
    
    public static Map E(final Map map) {
        final HashMap hashMap = new HashMap();
        for (final Map.Entry<dmx, V> entry : map.entrySet()) {
            hashMap.put(new fax(((y61)entry.getKey()).b, ((y61)entry.getKey()).c), entry.getValue());
        }
        return hashMap;
    }
    
    public static ikx F() {
        final egj egj = (egj)lp7.m0((Class)egj.class);
        return new ikx(new fax((Class)TweetViewViewModel.class, ""), (s6x)new s6x$c((Class)OffPlatformShareTweetReplyCountViewBinder.class, (String)null), (qax)qax$c.a);
    }
    
    public static vu1 a(final nu1 nu1) {
        final ol ol = (ol)lp7.m0((Class)ol.class);
        e0e.f((Object)nu1, "config");
        return (vu1)new nl(nu1);
    }
    
    public static vn6 b(final eo6 eo6, final tlx tlx) {
        final ProfileEmptyStateViewGraph$a profileEmptyStateViewGraph$a = (ProfileEmptyStateViewGraph$a)lp7.m0((Class)ProfileEmptyStateViewGraph$a.class);
        e0e.f((Object)eo6, "provider");
        final sml a = sml.Companion.a(eo6);
        tlx.a((vn6)a);
        return (vn6)a;
    }
    
    public static i3a c() {
        final bmf$a bmf$a = (bmf$a)lp7.m0((Class)bmf$a.class);
        return (i3a)((z4j)new i3a$a()).e();
    }
    
    public static hyj d(final vu6 vu6, final Context context) {
        final dzj dzj = (dzj)lp7.m0((Class)dzj.class);
        e0e.f((Object)vu6, "conversationTitleFactory");
        e0e.f((Object)context, "context");
        return new hyj(vu6, context);
    }
    
    public static c8p e(final c8p c8p, final mxe mxe) {
        return (c8p)new dhg(mxe, c8p);
    }
    
    public static rbq f(final j1u j1u) {
        final puu puu = (puu)lp7.m0((Class)puu.class);
        e0e.f((Object)j1u, "dataSource");
        return new f93((rbq)j1u, 0, 2, null);
    }
    
    public static w9t g(final Context context, final p p11, final oc1 oc1, final UserIdentifier userIdentifier, final tsc tsc, final dsb dsb, final fci fci, final sfv sfv, final c4j c4j, final glq glq, final nlq nlq) {
        return new h4j(context, p11, oc1, tsc, userIdentifier, dsb, fci, sfv, c4j, glq, nlq);
    }
    
    public static o6x h(final OffPlatformShareTweetCollaborationHeaderViewDelegateBinder offPlatformShareTweetCollaborationHeaderViewDelegateBinder) {
        final egj egj = (egj)lp7.m0((Class)egj.class);
        e0e.f((Object)offPlatformShareTweetCollaborationHeaderViewDelegateBinder, "binder");
        return q6x.a((r7x)offPlatformShareTweetCollaborationHeaderViewDelegateBinder, (stb)lfj.N0);
    }
    
    public static Set i(final mcv mcv, final mxe mxe) {
        Object value;
        if (mcv.f) {
            value = mxe.get();
        }
        else {
            value = null;
        }
        final Set s = aop.s(value);
        Objects.requireNonNull(s, "Cannot return null from a non-@Nullable @Provides method");
        return s;
    }
    
    public static void j() {
        final iqd iqd = (iqd)lp7.m0((Class)iqd.class);
    }
    
    public static fca k(final jkf jkf) {
        final mt3 mt3 = (mt3)lp7.m0((Class)mt3.class);
        e0e.f((Object)jkf, "eventBroadcaster");
        return (fca)jkf;
    }
    
    public static AccountManager l(final Application application) {
        final r10$a r10$a = (r10$a)lp7.m0((Class)r10$a.class);
        e0e.f((Object)application, "application");
        final AccountManager value = AccountManager.get((Context)application);
        e0e.e((Object)value, "get(application)");
        return value;
    }
    
    public static View m(View viewById) {
        viewById = viewById.findViewById(2131428054);
        Objects.requireNonNull(viewById, "Cannot return null from a non-@Nullable @Provides method");
        return viewById;
    }
    
    public static mgd n() {
        final ugd ugd = (ugd)lp7.m0((Class)ugd.class);
        return new mgd(16908290);
    }
    
    public static yzr o(final udv udv) {
        Objects.requireNonNull(udv);
        return (yzr)new biw((Object)udv, 1);
    }
    
    public static xdu p(final dob dob, final ydu ydu, final thm thm, final swh swh, final iwp iwp, final hcf hcf, final sfv sfv, final evm evm, final ii7 ii7, final dsb dsb, final mxe mxe, final d5q d5q, final vtt vtt, final t42 t42, final kcm kcm, final tsc tsc, final kbv kbv, final UserIdentifier userIdentifier, final xfw xfw, final ocj ocj, final fci fci, final qvu qvu, final ewu ewu, final quv quv, final wtv wtv, final yfu yfu, final l5b l5b, final ysq ysq, final oe5 oe5, final wh5 wh5, final evm evm2, final gra gra, final us5 us5, final rau rau, final nlq nlq, final zv1 zv1, final eh5 eh5, final p6o p6o) {
        return new xdu(dob, (Fragment)null, ydu, thm, swh, iwp, hcf, sfv, (vvs)null, (cwh)null, (k4f)null, (sjh)null, tsc, kbv, userIdentifier, ii7, (xjh)null, dsb, mxe, d5q, evm, vtt, t42, kcm, (fda)null, xfw, ocj, (dda)null, fci, qvu, ewu, quv, wtv, yfu, l5b, ysq, oe5, wh5, evm2, gra, us5, rau, nlq, (o5c)null, eh5, p6o);
    }
    
    public static v9a q(final Set set) {
        return new v9a((pml)new w9a(set));
    }
    
    public static vbi r(final Set set) {
        final yit yit = (yit)lp7.m0((Class)yit.class);
        final vbi vbi = (vbi)rr4.B1((Iterable)set);
        Objects.requireNonNull(vbi, "Cannot return null from a non-@Nullable @Provides method");
        return vbi;
    }
    
    public static Context s(final Activity activity) {
        final tfj tfj = (tfj)lp7.m0((Class)tfj.class);
        e0e.f((Object)activity, "activity");
        return (Context)new zo6((Context)activity, 2132018941);
    }
    
    public static o6x t(final FocalTweetStatsViewDelegateBinder focalTweetStatsViewDelegateBinder) {
        return (o6x)new p6x((r7x)focalTweetStatsViewDelegateBinder, (q7x$a)vdb.M0);
    }
    
    public static f88 u(final w8q w8q, final ii6 ii6) {
        return new f88(w8q.b(), ii6);
    }
    
    public static kcm v(final y06 y06) {
        final BaseCardObjectGraph$a baseCardObjectGraph$a = (BaseCardObjectGraph$a)lp7.m0((Class)BaseCardObjectGraph$a.class);
        e0e.f((Object)y06, "subject");
        return kcm.Companion.a((yz5)y06);
    }
    
    public static ny1 w(final i7r i7r) {
        final UnifiedCardObjectGraph$a unifiedCardObjectGraph$a = (UnifiedCardObjectGraph$a)lp7.m0((Class)UnifiedCardObjectGraph$a.class);
        e0e.f((Object)i7r, "standardViewHost");
        return (ny1)i7r;
    }
    
    public static ikx x() {
        return rk0.d((Class)AnalyticsBarViewDelegateBinder.class, (String)null);
    }
    
    public static ikx y() {
        return rk0.d((Class)TweetViewViewStubDelegateBinder.class, "focal_tweet_education_banner");
    }
    
    public static t5j z(final ecm ecm) {
        final ina ina = (ina)lp7.m0((Class)ina.class);
        e0e.f((Object)ecm, "relay");
        final t5j hide = ((t5j)ecm).hide();
        e0e.e((Object)hide, "relay.hide()");
        return hide;
    }
}
