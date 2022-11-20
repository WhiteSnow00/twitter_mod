import com.twitter.android.av.video.TwitterMediaPlayerArgs;
import com.twitter.card.unified.di.card.UnifiedCardObjectGraph$a;
import com.twitter.card.di.BaseCardObjectGraph$a;
import com.twitter.longform.twitterarticles.card.TwitterArticleCardViewModel;
import android.content.res.Resources;
import com.twitter.util.user.UserIdentifier;
import android.app.Activity;
import tv.periscope.android.ui.broadcast.view.MenuViewPager;
import tv.periscope.android.view.RootDragLayout;
import tv.periscope.android.api.ApiManager;
import android.view.View;
import tv.periscope.model.b;
import tv.periscope.android.api.AuthedApiService;
import android.content.Context;
import com.twitter.newsletters.NewsletterProfileModuleViewModel;
import java.util.Objects;
import com.twitter.longform.threadreader.implementation.di.ThreadReaderHeaderObjectGraph$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qg implements tpa
{
    public static lih a(final i83 i83) {
        final l83 l83 = (l83)chw.w0((Class)l83.class);
        czd.f((Object)i83, "modelPrefetcher");
        return (lih)i83;
    }
    
    public static w5x b() {
        final lgc lgc = (lgc)chw.w0((Class)lgc.class);
        return jlx.a((qsb)kgc.D0);
    }
    
    public static yaa c(final ljf ljf) {
        final ms3 ms3 = (ms3)chw.w0((Class)ms3.class);
        czd.f((Object)ljf, "eventBroadcaster");
        return (yaa)ljf;
    }
    
    public static j6t d(final w2e w2e) {
        final ThreadReaderHeaderObjectGraph$a threadReaderHeaderObjectGraph$a = (ThreadReaderHeaderObjectGraph$a)chw.w0((Class)ThreadReaderHeaderObjectGraph$a.class);
        czd.f((Object)w2e, "item");
        final j6t j6t = (j6t)w2e.a;
        Objects.requireNonNull(j6t, "Cannot return null from a non-@Nullable @Provides method");
        return j6t;
    }
    
    public static w5x e(final NewsletterProfileModuleViewModel newsletterProfileModuleViewModel) {
        final xhi xhi = (xhi)chw.w0((Class)xhi.class);
        czd.f((Object)newsletterProfileModuleViewModel, "viewModel");
        return (w5x)ffz.J(NewsletterProfileModuleViewModel.class, (qsb)whi.D0);
    }
    
    public static yxc f(final Context context, final AuthedApiService authedApiService, final xmp xmp, final l9w l9w, final j9c j9c) {
        final int a = wm2.a;
        czd.f((Object)authedApiService, "apiService");
        czd.f((Object)xmp, "sessionCache");
        czd.f((Object)j9c, "guestServiceSessionRepository");
        czd.f((Object)l9w, "userCache");
        czd.f((Object)context, "context");
        return (yxc)new zxc(new zyc(), new wyc(), (azc)new bzc(), (xyc)new yyc(), new rxc(authedApiService, xmp), j9c, l9w, context);
    }
    
    public static wk g(final aof aof, final l9w l9w, final itj itj, final ti2 ti2, final bhb bhb, final d9f d9f, final l5k l5k, final e9c e9c, final wvc wvc, final yp9 yp9, final m8d m8d, final hf2 hf2, final boolean b) {
        final int a = wm2.a;
        final b f = aof.f(aof);
        final boolean equals = f.j0().equals(l9w.n());
        final boolean b2 = mv6.b();
        Object o;
        if (equals) {
            o = new gk2((ll)itj, m8d, ti2, yp9, l9w, hf2, (dum)new rrz(), true, true, b, b2, false, true);
        }
        else {
            Object o2;
            if (wvc.b()) {
                o2 = null;
            }
            else {
                o2 = new mdf(f.w(), ti2);
            }
            o = new oe2((ll)itj, m8d, ti2, (tjh)d9f, l9w, hf2, new qqd(aof, 9), bhb, l5k.a, e9c, (le2)o2, b2);
        }
        return (wk)o;
    }
    
    public static View h(View viewById) {
        viewById = viewById.findViewById(2131428054);
        Objects.requireNonNull(viewById, "Cannot return null from a non-@Nullable @Provides method");
        return viewById;
    }
    
    public static yp9 i(final jq9 jq9) {
        final int a = wm2.a;
        Objects.requireNonNull(jq9);
        return (yp9)new sm2(jq9);
    }
    
    public static mv6 j(final Context context, final ApiManager apiManager, final u9a u9a, final l9w l9w, final nv6 p5) {
        final int a = wm2.a;
        final mv6 mv6 = new mv6(context, apiManager, u9a, l9w, mv6.b());
        mv6.P0 = p5;
        if (!mv6.G0.d((Object)mv6)) {
            mv6.G0.i((Object)mv6);
        }
        return mv6;
    }
    
    public static auj k(final RootDragLayout rootDragLayout, final mnk d) {
        final int a = wm2.a;
        final auj auj = new auj((buj)new cuj(rootDragLayout, (MenuViewPager)((View)rootDragLayout).findViewById(2131430045)));
        auj.d = d;
        return auj;
    }
    
    public static v54 l(final Activity activity, final mo6 mo6, final l9w l9w, final m8d m8d) {
        final int a = wm2.a;
        return (v54)new w54(activity, l9w, mo6, m8d);
    }
    
    public static s3k m(final UserIdentifier userIdentifier) {
        return new s3k(userIdentifier, (String)null);
    }
    
    public static x1s n(final Resources resources, final l9w l9w, final y12 y12, final mo6 mo6, final aof aof, final oxh oxh, final odx odx, final sz3 sz3, final m8d m8d) {
        final int a = wm2.a;
        return new x1s(resources, l9w.b(), l9w.u(), y12, m8d, l9w, mo6, aof.a(), oxh, (mz3$b)sz3, (x1s$a)odx);
    }
    
    public static tjx o() {
        final v3v v3v = (v3v)chw.w0((Class)v3v.class);
        return new tjx(new m9x((Class)TwitterArticleCardViewModel.class, ""), (a6x)new a6x$a("TwitterArticleCard"), (x9x)x9x$c.a);
    }
    
    public static void p() {
        final l0k l0k = (l0k)chw.w0((Class)l0k.class);
        Objects.requireNonNull(o0k.Companion);
    }
    
    public static yqg q(final Activity activity, final r8x r8x, final xbm xbm, final UserIdentifier userIdentifier) {
        return new yqg((Context)activity, (nn)new wm3((Object)activity, 26), "reply_composition", m1h.O0, userIdentifier, r8x, xbm, 0);
    }
    
    public static xbm r(final sz5 sz5) {
        final BaseCardObjectGraph$a baseCardObjectGraph$a = (BaseCardObjectGraph$a)chw.w0((Class)BaseCardObjectGraph$a.class);
        czd.f((Object)sz5, "subject");
        return xbm.Companion.a((sy5)sz5);
    }
    
    public static fy1 s(final j6r j6r) {
        final UnifiedCardObjectGraph$a unifiedCardObjectGraph$a = (UnifiedCardObjectGraph$a)chw.w0((Class)UnifiedCardObjectGraph$a.class);
        czd.f((Object)j6r, "standardViewHost");
        return (fy1)j6r;
    }
    
    public static i1 t(final TwitterMediaPlayerArgs twitterMediaPlayerArgs) {
        final q3 q3 = (q3)chw.w0((Class)q3.class);
        czd.f((Object)twitterMediaPlayerArgs, "args");
        final i1 dataSource = twitterMediaPlayerArgs.getDataSource();
        czd.c((Object)dataSource);
        return dataSource;
    }
    
    public static h5j u(final rbm rbm) {
        final bma bma = (bma)chw.w0((Class)bma.class);
        czd.f((Object)rbm, "relay");
        final h5j hide = rbm.hide();
        czd.e((Object)hide, "relay.hide()");
        return hide;
    }
    
    public static efv v() {
        final int a = wm2.a;
        return new efv();
    }
    
    public static aof w(final w4 w4) {
        final int a = wm2.a;
        final i1 c1 = w4.b.c1;
        final int a2 = c5j.a;
        final aof aof = (aof)c1;
        Objects.requireNonNull(aof, "Cannot return null from a non-@Nullable @Provides method");
        return aof;
    }
    
    public static lz x() {
        final int a = wm2.a;
        return (lz)new ali();
    }
}
