import com.twitter.timeline.newtweetsbanner.BaseNewTweetsBannerPresenter;
import androidx.fragment.app.Fragment;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Iterator;
import android.content.Intent;
import com.airbnb.lottie.LottieAnimationView;
import com.twitter.android.liveevent.landing.carousel.a$d;
import com.twitter.android.liveevent.landing.carousel.a;
import com.twitter.android.onboarding.legacy.userrecommendationurt.OCFUserRecommendationsContentViewProvider;
import com.twitter.android.qrcodes.a$a;
import android.content.BroadcastReceiver;
import com.twitter.app.dm.DMConversationContentViewProvider;
import com.twitter.report.subsystem.ReportFlowWebViewResultForAction;
import com.twitter.app.dm.DMConversationSettingsPreferenceFragment;
import android.net.Uri;
import java.util.List;
import java.util.Collection;
import com.twitter.users.UsersActivityContentViewResult;
import com.twitter.alttext.AltTextActivityContentViewResult;
import android.content.Context;
import com.twitter.permissions.PermissionContentViewResult;
import com.twitter.onboarding.ocf.media.SelectAvatarSubtaskViewProvider;
import android.graphics.drawable.BitmapDrawable;
import com.twitter.profiles.scrollingheader.b;
import android.app.Activity;
import com.twitter.profiles.scrollingheader.SwipeRefreshObserverLayout$a;
import com.twitter.profiles.scrollingheader.e;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pgc implements fa3
{
    public final int a;
    public final Object b;
    
    public pgc(final Object b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(Object o) {
        final int a = this.a;
        final jx9 jx9 = null;
        final BitmapDrawable[] array = null;
        int n = 0;
        switch (a) {
            default: {
                final liu liu = (liu)this.b;
                final kni kni = (kni)o;
                liu.i.g((osc$a<? extends osc<?, ?>>)liu.o);
                return;
            }
            case 24: {
                final cgu cgu = (cgu)this.b;
                final fo fo = (fo)o;
                Objects.requireNonNull(cgu);
                final Intent c = fo.c;
                final noj d = cgu.b1.d();
                if (c != null && c.hasExtra("deleted") && d.f() && (long)d.c() == c.getLongExtra("deleted", 0L)) {
                    ((Activity)((u9)cgu).G0).finish();
                }
                return;
            }
            case 23: {
                final e e = (e)this.b;
                final nkf$b nkf$b = (nkf$b)o;
                final SwipeRefreshObserverLayout$a swipeRefreshObserverLayout$a = (SwipeRefreshObserverLayout$a)tqb.A((Activity)((idv)e).F0, SwipeRefreshObserverLayout$a.class);
                if (swipeRefreshObserverLayout$a != null) {
                    swipeRefreshObserverLayout$a.L1(false);
                }
                return;
            }
            case 22: {
                final b b = (b)this.b;
                final noj noj = (noj)o;
                Objects.requireNonNull(b);
                BitmapDrawable[] array2;
                if (noj == null) {
                    array2 = array;
                }
                else {
                    array2 = (BitmapDrawable[])noj.h((Object)null);
                }
                if (array2 != null) {
                    b.a(array2);
                }
                return;
            }
            case 21: {
                final SelectAvatarSubtaskViewProvider selectAvatarSubtaskViewProvider = (SelectAvatarSubtaskViewProvider)this.b;
                final PermissionContentViewResult permissionContentViewResult = (PermissionContentViewResult)o;
                final String[] v0 = SelectAvatarSubtaskViewProvider.V0;
                Objects.requireNonNull(selectAvatarSubtaskViewProvider);
                if (u7k.d().a((Context)selectAvatarSubtaskViewProvider.H0, SelectAvatarSubtaskViewProvider.V0)) {
                    final jo6 t0 = selectAvatarSubtaskViewProvider.T0;
                    final sfv sfv = new sfv();
                    ((f0p)sfv).c("onboarding");
                    t0.d((Object)ed3.a(true, sfv));
                }
                return;
            }
            case 20: {
                final ebk ebk = (ebk)this.b;
                final AltTextActivityContentViewResult altTextActivityContentViewResult = (AltTextActivityContentViewResult)o;
                Objects.requireNonNull(ebk);
                Object o2;
                if (altTextActivityContentViewResult == null) {
                    o2 = jx9;
                }
                else if (altTextActivityContentViewResult.getEditableImage() != null) {
                    o2 = altTextActivityContentViewResult.getEditableImage();
                }
                else {
                    o2 = altTextActivityContentViewResult.getEditableGif();
                }
                if (o2 != null) {
                    ebk.O1(new prg(new x99((jx9)o2)));
                }
                return;
            }
            case 19: {
                final upd upd = (upd)this.b;
                final fo fo2 = (fo)o;
                Objects.requireNonNull(upd);
                final int b2 = fo2.b;
                final Intent c2 = fo2.c;
                if (b2 == -1) {
                    if (c2 != null) {
                        Objects.requireNonNull(upd.S0);
                        final x99 i = iwl.i(c2);
                        vmw.g((Object)i);
                        if (w9y.p()) {
                            upd.N1(upd.E1(upd.F1(), ojf.v((Object)i)));
                        }
                        else {
                            upd.Q0.b(new prg(i), (qx0)upd.M0);
                            upd.Q0.i(0, b2, c2, (qx0)upd.M0);
                        }
                    }
                    Objects.requireNonNull(upd.S0);
                    iwl.o(sc6.H0, c2);
                }
                return;
            }
            case 18: {
                final ad6 ad6 = (ad6)this.b;
                final UsersActivityContentViewResult usersActivityContentViewResult = (UsersActivityContentViewResult)o;
                final ad6$m companion = ad6.Companion;
                e0e.f((Object)ad6, "this$0");
                if (usersActivityContentViewResult != null) {
                    final j84$a checkboxConfig = usersActivityContentViewResult.getCheckboxConfig();
                    if (checkboxConfig != null) {
                        final luh$a g0 = checkboxConfig.G0;
                        if (g0 != null) {
                            for (final w3e w3e : ad6.k1.b) {
                                if (w3e instanceof eim) {
                                    final eim eim = (eim)w3e;
                                    eim.d.clear();
                                    eim.d.addAll((Collection)g0);
                                    ad6.k1.p(w3e);
                                    break;
                                }
                            }
                            final ArrayList c3 = ad6.k1.c;
                            e0e.e((Object)c3, "itemManager.composeItems");
                            if (c3.isEmpty() ^ true) {
                                final chp chp = c3.get(0);
                                chp.b.a.r = (List)g0;
                                ad6.k1.p((w3e)chp);
                            }
                            final hp6 l2 = ad6.l2;
                            if (l2 != null) {
                                ad6.C5(l2, ad6.Y1, (List)g0);
                            }
                        }
                    }
                }
                return;
            }
            case 17: {
                final ba6 ba6 = (ba6)this.b;
                final AltTextActivityContentViewResult altTextActivityContentViewResult2 = (AltTextActivityContentViewResult)o;
                final int j2 = ba6.j2;
                Objects.requireNonNull(ba6);
                if (altTextActivityContentViewResult2.getEditableImage() != null) {
                    ba6.j2(ba6.i2, new prg(new x99((jx9)altTextActivityContentViewResult2.getEditableImage())), (mx9)null);
                }
                if (altTextActivityContentViewResult2.getEditableGif() != null) {
                    ba6.i2(ba6.i2, new prg(new x99(altTextActivityContentViewResult2.getEditableGif())));
                }
                return;
            }
            case 16: {
                final usc usc = (usc)this.b;
                final osc osc = (osc)o;
                final bw0 a2 = usc.a;
                final usc$b b3 = usc.b;
                final int a3 = o5j.a;
                final osc osc2 = (osc)a2.d((aw0)((aw0)osc).F((aw0.aw0$b)b3));
                return;
            }
            case 15: {
                final mt9 mt9 = (mt9)this.b;
                final noj noj2 = (noj)o;
                final String[] i2 = mt9.i1;
                Objects.requireNonNull(mt9);
                if (noj2.f()) {
                    mt9.W4((dwg)noj2.c());
                }
                else {
                    mt9.g1.c(2131955901, 0);
                    mt9.D4();
                }
                return;
            }
            case 14: {
                final iwh iwh = (iwh)this.b;
                final xsc xsc = (xsc)o;
                Objects.requireNonNull(iwh);
                if (xsc != null && !xsc.b) {
                    final vgl f0 = iwh.F0;
                    f0.f(fbx.j0(f0.b(), 8192));
                    iwh.G0.N();
                }
                return;
            }
            case 13: {
                final idv idv = (idv)this.b;
                final b3g b3g = (b3g)o;
                Objects.requireNonNull(idv);
                if (b3g instanceof b3g$c) {
                    idv.j0();
                }
                else if (b3g instanceof b3g$a) {
                    idv.O0((p4e)((b3g$a)b3g).a);
                }
                return;
            }
            case 12: {
                final thv thv = (thv)this.b;
                final fo fo3 = (fo)o;
                if (thv.c1 != null) {
                    Uri[] array3 = null;
                    Label_1239: {
                        if (fo3.b == -1) {
                            final Intent c4 = fo3.c;
                            if (c4 != null) {
                                final String dataString = c4.getDataString();
                                if (dataString != null) {
                                    array3 = new Uri[] { Uri.parse(dataString) };
                                    break Label_1239;
                                }
                            }
                        }
                        array3 = null;
                    }
                    thv.c1.onReceiveValue((Object)array3);
                    thv.c1 = null;
                }
                return;
            }
            case 11: {
                final u9 u9 = (u9)this.b;
                final kni kni2 = (kni)o;
                u9.P4();
                return;
            }
            case 10: {
                final lnc lnc = (lnc)this.b;
                final nkf$b nkf$b2 = (nkf$b)o;
                lnc.D1().F4().a((nkf)nkf$b2, ((xus)lnc).g1);
                final pnm b4 = nkf$b2.b;
                final int a4 = nkf$b2.a;
                if (a4 == 2) {
                    ((wjg)gmb.A("home:refresh", ((idv)lnc).d1, ((idv)lnc).I0)).i();
                }
                else if (a4 == 4) {
                    lnc.F1.f(pbf.d.a);
                }
                else if (a4 == 1 && lnc.y1) {
                    ++lnc.x1;
                    lnc.y1 = false;
                }
                if (b4 instanceof cqv) {
                    if (a4 == 1) {
                        ((wjg)gmb.A("home:get_older", ((idv)lnc).d1, ((idv)lnc).I0)).i();
                    }
                    if (((yqv)b4).B1.a == 0) {
                        lnc.F1.f(pbf.h.a);
                    }
                    final int a5 = nnc.a;
                    Objects.requireNonNull(onc.Companion);
                    ((onc)((n5j)dr0.Companion.a()).B((Class)onc.class)).p0().a.onNext((Object)((idv)lnc).I0);
                    if (!((idv)lnc).a1.O1() && a4 == 4) {
                        final baq z1 = lnc.z1;
                        vmw.g((Object)z1);
                        final int a6 = o5j.a;
                        final cqv cqv = (cqv)b4;
                        Objects.requireNonNull(z1);
                        z1.b = ((yqv)cqv).A1;
                    }
                    final cqv cqv2 = (cqv)b4;
                    lnc.L1.t();
                }
                if (a4 == 3 || a4 == 4) {
                    final Pattern f2 = yua.f;
                    ((zua)((n5j)cr0.a()).B((Class)zua.class)).V5().d(((idv)lnc).I0);
                }
                lnc.v1 = false;
                if (((osc)b4).T().b) {
                    xw0.c((sj)new eck((Object)lnc, 7));
                }
                else {
                    lnc.F1.f(pbf.e.a);
                }
                if (((xus)lnc).t1 && lnc.B1()) {
                    lnc.y1 = true;
                    ((xus)lnc).d1(1);
                    mnc.b(((xus)lnc).g1);
                }
                return;
            }
            case 9: {
                final DMConversationSettingsPreferenceFragment dmConversationSettingsPreferenceFragment = (DMConversationSettingsPreferenceFragment)this.b;
                final ReportFlowWebViewResultForAction reportFlowWebViewResultForAction = (ReportFlowWebViewResultForAction)o;
                if (!dmConversationSettingsPreferenceFragment.f2) {
                    final dob l3 = ((Fragment)dmConversationSettingsPreferenceFragment).L0();
                    ((Activity)l3).setResult(1);
                    ((Activity)l3).finish();
                }
                return;
            }
            case 8: {
                final DMConversationContentViewProvider dmConversationContentViewProvider = (DMConversationContentViewProvider)this.b;
                final PermissionContentViewResult permissionContentViewResult2 = (PermissionContentViewResult)o;
                final sda d2 = DMConversationContentViewProvider.D3;
                dmConversationContentViewProvider.A1();
                return;
            }
            case 7: {
                final xus xus = (xus)this.b;
                final nkf$b nkf$b3 = (nkf$b)o;
                Objects.requireNonNull(xus);
                final pnm b5 = nkf$b3.b;
                final int a7 = nkf$b3.a;
                final xsc t2 = ((osc)b5).T();
                xus.r1();
                if (!t2.b) {
                    xus.k1(t2, a7);
                }
                if (b5 instanceof lpj) {
                    final lpj lpj = (lpj)b5;
                    final int t3 = lpj.t();
                    final int g2 = lpj.g();
                    if (a7 == 3) {
                        if (t3 != 0) {
                            if (t3 == 1) {
                                xus.t1 = true;
                            }
                            else if (t3 == 2) {
                                xus.t1 = false;
                            }
                        }
                        if (g2 != 0) {
                            if (g2 == 3) {
                                xus.u1 = true;
                            }
                            else if (g2 == 4) {
                                xus.u1 = false;
                            }
                        }
                    }
                    else if (a7 == 14) {
                        if (g2 != 0) {
                            if (g2 == 3) {
                                xus.u1 = true;
                            }
                            else if (g2 == 4) {
                                xus.u1 = false;
                            }
                        }
                    }
                    else if (t3 != 0) {
                        if (t3 == 1) {
                            xus.t1 = true;
                        }
                        else if (t3 == 2) {
                            xus.t1 = false;
                        }
                    }
                }
                if (b5 instanceof yqv) {
                    final p0t y1 = ((yqv)b5).y1;
                    if (y1 != null) {
                        final String a8 = y1.a;
                        if (a8 != null) {
                            ((idv)xus).W0.setTitle((CharSequence)a8);
                        }
                    }
                }
                if ((nkf$b3.a == 4 && xus.g1().q()) || nkf$b3.a == 3) {
                    xus.u1();
                }
                return;
            }
            case 6: {
                final h1c h1c = (h1c)this.b;
                final nkf$b nkf$b4 = (nkf$b)o;
                Objects.requireNonNull(h1c);
                final pnm b6 = nkf$b4.b;
                final int a9 = nkf$b4.a;
                if (b6 instanceof yqv) {
                    final yqv yqv = (yqv)b6;
                    final wss z2 = yqv.z1;
                    if (z2 != null) {
                        final ats h = z2.h;
                        if (h != null) {
                            h1c.I0 = h.a;
                        }
                        ((BaseNewTweetsBannerPresenter)h1c.G0).g(yqv, a9);
                    }
                }
                return;
            }
            case 5: {
                final k6p k6p = (k6p)this.b;
                final kni kni3 = (kni)o;
                final i6p z3 = k6p.Z0;
                final v8p f3 = z3.f;
                f3.a.b((BroadcastReceiver)z3.g, f3.b);
                final wap a10 = k6p.a1;
                final v8p k = a10.j;
                k.a.b((BroadcastReceiver)a10.k, k.b);
                return;
            }
            case 4: {
                final com.twitter.android.qrcodes.b b7 = (com.twitter.android.qrcodes.b)this.b;
                final cjw cjw = (cjw)o;
                final Pattern l4 = com.twitter.android.qrcodes.b.l2;
                Objects.requireNonNull(b7);
                if (cjw.l1 != null && ((Fragment)b7).L0() != null) {
                    final a$a a$a = (a$a)tqb.A((Activity)((Fragment)b7).L0(), a$a.class);
                    if (a$a != null) {
                        a$a.n3(cjw.l1);
                    }
                }
                else {
                    final zbv m1 = cjw.m1;
                    if (m1 != null) {
                        final int[] g3 = zbv.g(m1);
                        if (g3.length != 0) {
                            n = g3[0];
                        }
                        if (n != 50) {
                            if (n != 63) {
                                b7.j2(2131959431);
                            }
                            else {
                                b7.j2(2131958635);
                            }
                        }
                        else {
                            b7.j2(2131959432);
                        }
                    }
                    else {
                        b7.j2(2131959431);
                    }
                }
                return;
            }
            case 3: {
                final OCFUserRecommendationsContentViewProvider ocfUserRecommendationsContentViewProvider = (OCFUserRecommendationsContentViewProvider)this.b;
                final nkf$c nkf$c = (nkf$c)o;
                Objects.requireNonNull(ocfUserRecommendationsContentViewProvider);
                if (nkf$c.a == 1) {
                    ocfUserRecommendationsContentViewProvider.x1 = false;
                    ocfUserRecommendationsContentViewProvider.z1.clear();
                    ocfUserRecommendationsContentViewProvider.z1.addAll(ocfUserRecommendationsContentViewProvider.A1.b);
                }
                return;
            }
            case 2: {
                final rbg rbg = (rbg)this.b;
                final mf mf = (mf)o;
                final rbg.rbg$a o3 = rbg.o1;
                rbg.f1();
                final int c5 = ((osc)mf).T().c;
                if (c5 == 200) {
                    final fg4 fg4 = new fg4(rbg.f1.f());
                    ((o1p)fg4).q(new String[] { "login_verification::request:accept:success" });
                    sbw.b((tlm)fg4);
                    rbg.i1(2131954873);
                    rbg.g1(mf.l1.a);
                }
                else {
                    final int[] m2 = mf.m1;
                    rbg.h1(m2);
                    final int e2 = rbg.e1(m2);
                    if (e2 == 88) {
                        final fg4 fg5 = new fg4(rbg.f1.f());
                        ((o1p)fg5).q(new String[] { "login_verification::request:accept:rate_limit" });
                        sbw.b((tlm)fg5);
                    }
                    o = new fg4(rbg.f1.f());
                    ((o1p)o).q(new String[] { "login_verification::request:accept:failure" });
                    ((o1p)o).c = String.valueOf(c5);
                    final int a11 = o5j.a;
                    ((o1p)o).t = String.valueOf(e2);
                    sbw.b((tlm)o);
                }
                return;
            }
            case 1: {
                final a a12 = (a)this.b;
                final n8x a13 = ((c4e$f)o).a;
                Objects.requireNonNull(a12);
                e0e.f((Object)a13, "viewHolder");
                final a$d a$d = (a$d)a12.e.remove((Object)a13);
                if (a$d != null) {
                    a12.g.remove(a$d.a);
                }
                return;
            }
            case 0: {
                final LottieAnimationView lottieAnimationView = (LottieAnimationView)this.b;
                lottieAnimationView.setComposition(((neg)o).e);
                lottieAnimationView.k();
            }
        }
    }
}
