import com.twitter.util.user.UserIdentifier;
import com.twitter.commerce.shopmodule.core.ShopModuleViewModel;
import com.twitter.android.broadcast.di.view.f;
import tv.periscope.android.view.ActionSheet;
import android.view.ViewStub;
import tv.periscope.android.view.RootDragLayout;
import tv.periscope.model.b;
import com.twitter.android.liveevent.card.di.LiveEventCardObjectGraph$a;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.res.Resources;
import android.content.Context;
import com.twitter.weaver.base.WeaverViewStubDelegateBinder;
import java.util.Objects;
import com.twitter.rooms.ui.topics.item.RoomTopicItemObjectGraph$a;
import com.twitter.android.settings.DeactivateAccountActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fm7 implements wqa
{
    public static rv3 A(final gqx gqx) {
        final int a = gn2.a;
        return (rv3)new sv3(gqx);
    }
    
    public static kp1 a() {
        Object o;
        if (dta.b().b("graphql_amr_enabled", false)) {
            o = new bjh();
        }
        else {
            o = new cjh();
        }
        return (kp1)o;
    }
    
    public static su1 b() {
        final jy4 jy4 = (jy4)ca7.u((Class)jy4.class);
        return (su1)new iy4();
    }
    
    public static w2a c(final fnc fnc, final jev g) {
        w2a w2a = (w2a)yvj.f(((zl1)fnc).a, "home_timeline_arg_empty_config", (alp)w2a.i);
        if (w2a == null) {
            final w2a$a w2a$a = new w2a$a();
            final jx6 a = yds.a;
            w2a$a.a = (yds)new jjr(2131953865);
            w2a$a.b = (yds)new jjr(2131953870);
            w2a$a.c = (yds)new jjr(2131953817);
            w2a$a.e = 0;
            w2a$a.g = g;
            w2a = (w2a)((h4j)w2a$a).e();
        }
        return w2a;
    }
    
    public static void d() {
        final zbl zbl = (zbl)ca7.u((Class)zbl.class);
    }
    
    public static void e() {
        final aw9 aw9 = (aw9)ca7.u((Class)aw9.class);
    }
    
    public static Class f() {
        return DeactivateAccountActivity.class;
    }
    
    public static ofo g(final r3e r3e) {
        final RoomTopicItemObjectGraph$a roomTopicItemObjectGraph$a = (RoomTopicItemObjectGraph$a)ca7.u((Class)RoomTopicItemObjectGraph$a.class);
        zzd.f((Object)r3e, "item");
        final ofo ofo = (ofo)r3e.a;
        Objects.requireNonNull(ofo, "Cannot return null from a non-@Nullable @Provides method");
        return ofo;
    }
    
    public static d0q h(final c0q c0q) {
        final e0q e0q = (e0q)ca7.u((Class)e0q.class);
        zzd.f((Object)c0q, "shopIdDispatcher");
        return new d0q((b5j)((ggm)c0q).C0);
    }
    
    public static c5x i() {
        final duv duv = (duv)ca7.u((Class)duv.class);
        final WeaverViewStubDelegateBinder weaverViewStubDelegateBinder = new WeaverViewStubDelegateBinder((rtb)cuv.C0);
        final vax$a companion = vax.Companion;
        return (c5x)new d5x((g6x)weaverViewStubDelegateBinder, (f6x$a)bxg.M0);
    }
    
    public static Resources j(final Context context) {
        final xy7 xy7 = (xy7)ca7.u((Class)xy7.class);
        zzd.f((Object)context, "context");
        final Resources resources = context.getResources();
        zzd.e((Object)resources, "context.resources");
        return resources;
    }
    
    public static c0d k(final i9d i9d, final ConstraintLayout constraintLayout, final j0d j0d) {
        final int a = gn2.a;
        final c0d c0d = new c0d(j0d, i9d);
        c0d.a(constraintLayout);
        return c0d;
    }
    
    public static rtb l(final oxu oxu, final bfm bfm, final wv1 wv1) {
        final bw7 bw7 = (bw7)ca7.u((Class)bw7.class);
        zzd.f((Object)bfm, "factories");
        zzd.f((Object)wv1, "behavioralEventHelper");
        return (rtb)new zv7(oxu, bfm, wv1);
    }
    
    public static asf m(final View view, final prf prf, final aeq aeq, final xm2 xm2, final vrf vrf, final muf muf, final v0g v0g) {
        final LiveEventCardObjectGraph$a liveEventCardObjectGraph$a = (LiveEventCardObjectGraph$a)ca7.u((Class)LiveEventCardObjectGraph$a.class);
        zzd.f((Object)view, "rootView");
        zzd.f((Object)prf, "presenter");
        zzd.f((Object)aeq, "slateView");
        zzd.f((Object)xm2, "broadcastView");
        zzd.f((Object)vrf, "eventCardTypeHelper");
        zzd.f((Object)muf, "gifView");
        zzd.f((Object)v0g, "vodView");
        return new asf(new asf$b(view), prf, aeq, xm2, vrf, muf, v0g);
    }
    
    public static e5k n(final yph yph, final p3f p3f, final vtj vtj, final hmp hmp, final oof oof) {
        final int a = gn2.a;
        final b f = oof.f(oof);
        final p3c v0 = yph.V0;
        Object o;
        if (jgw.n0(hmp, f) && !f.g0()) {
            o = new gef(f.w());
        }
        else {
            o = null;
        }
        return new e5k((pe2)o, (zxp)yph.S0, p3f);
    }
    
    public static pk2 o(final RootDragLayout rootDragLayout) {
        final int a = gn2.a;
        final ViewStub viewStub = (ViewStub)((View)rootDragLayout).findViewById(2131427897);
        View view = ((View)rootDragLayout).findViewById(2131427894);
        if (view == null) {
            view = viewStub.inflate();
        }
        return (pk2)new lk2(view);
    }
    
    public static lcx p(final RootDragLayout rootDragLayout, final c8w c8w, final apo apo, final g44 a, final oof oof, final giw giw, final gp6 gp6, final sg2 sg2, final nxh nxh, final xjh xjh, final njh njh, final d9w d9w, final mf2 mf2, final xjq xjq, final i9d i9d, final i9d i9d2) {
        final int a2 = gn2.a;
        final ActionSheet actionSheet = (ActionSheet)((View)rootDragLayout).findViewById(2131432602);
        final lcx lcx = new lcx(rootDragLayout, actionSheet, c8w, apo, d9w, mf2, i9d, (mcx)sg2, nxh, xjh, njh, xjq, u3k.c(giw));
        final kcx e = lcx.e;
        if (e != null) {
            ((al)e).a = (jhm)a;
        }
        actionSheet.e(d9w, i9d2, gp6, nxh);
        actionSheet.setCarouselScrollListener((qv3)new xj8((Object)a, (Object)lcx, (Object)oof, 3));
        return lcx;
    }
    
    public static jm2 q(final RootDragLayout rootDragLayout, final qcl qcl, final fnk fnk, final oof oof, final g44 g44, final yjs yjs, final i9d i9d) {
        final int a = gn2.a;
        final km2 km2 = new km2(((View)rootDragLayout).findViewById(2131427910), i9d);
        km2.p = (jm2$a)new f(oof, qcl, g44, fnk, yjs);
        return (jm2)km2;
    }
    
    public static xqa r(final z19 z19) {
        final LiveEventCardObjectGraph$a liveEventCardObjectGraph$a = (LiveEventCardObjectGraph$a)ca7.u((Class)LiveEventCardObjectGraph$a.class);
        zzd.f((Object)z19, "displayMode");
        return (xqa)new mrf(z19);
    }
    
    public static l04 s(final g44 g44, final t14 t14) {
        final int a = gn2.a;
        return new l04((l04$a)new bn2(g44), t14);
    }
    
    public static nxh t() {
        final int a = gn2.a;
        return (nxh)new oxh();
    }
    
    public static zxp u(final yph yph) {
        final int a = gn2.a;
        final np6 s0 = yph.S0;
        Objects.requireNonNull(s0, "Cannot return null from a non-@Nullable @Provides method");
        return (zxp)s0;
    }
    
    public static g01 v() {
        final xw3$a xw3$a = (xw3$a)ca7.u((Class)xw3$a.class);
        return (g01)new m7q();
    }
    
    public static c5x w() {
        return pkx.a((rtb)jd6.D0);
    }
    
    public static keu x(final bfm bfm, final nvg nvg) {
        final h64 h64 = (h64)ca7.u((Class)h64.class);
        zzd.f((Object)bfm, "contentHostFactories");
        zzd.f((Object)nvg, "mediaForwardConfig");
        return (keu)new leu(nvg.a(), (z19)z19.n, bfm);
    }
    
    public static c5x y(final ShopModuleViewModel shopModuleViewModel) {
        final q1q q1q = (q1q)ca7.u((Class)q1q.class);
        zzd.f((Object)shopModuleViewModel, "viewModel");
        return (c5x)goz.j((Class)ShopModuleViewModel.class, (rtb)p1q.C0);
    }
    
    public static nhw z(final Context context, final UserIdentifier userIdentifier) {
        final int a = gn2.a;
        return nhw.a(context, userIdentifier);
    }
}
