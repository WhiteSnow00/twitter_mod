import android.os.BaseBundle;
import androidx.fragment.app.Fragment;
import androidx.preference.TwoStatePreference;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import android.os.Bundle;
import android.content.Intent;
import java.util.Iterator;
import androidx.preference.SwitchPreference;
import java.util.regex.Pattern;
import androidx.recyclerview.widget.RecyclerView;
import com.twitter.gallerygrid.api.GalleryGridContentViewArgs;
import com.twitter.gallerygrid.api.GalleryGridMediaAttachedResult;
import com.twitter.android.liveevent.landing.carousel.a$d;
import com.twitter.android.liveevent.landing.carousel.a;
import java.util.Collection;
import com.twitter.android.settings.DiscoverabilityActivity;
import androidx.fragment.app.Fragment$InstantiationException;
import java.util.List;
import com.twitter.app.common.timeline.cover.URTCoverController;
import com.twitter.dm.network.SendDMRequest;
import com.twitter.app.dm.DMConversationContentViewProvider;
import com.twitter.app.dm.GroupInfoEditContentViewProvider;
import com.twitter.permissions.PermissionContentViewResult;
import com.twitter.navigation.profile.TweetPromptContentViewArgs;
import com.twitter.report.subsystem.ReportFlowWebViewResultForAction;
import com.twitter.sensitivemedia.SensitiveMediaActivityContentViewResult;
import com.twitter.onboarding.ocf.media.SelectBannerSubtaskViewHost;
import android.view.View$OnKeyListener;
import com.twitter.ui.view.ShortcutEnabledRecyclerView;
import com.twitter.ui.widget.NewItemBannerView$b;
import android.view.View$OnClickListener;
import com.twitter.timeline.newtweetsbanner.BaseNewTweetsBannerPresenter;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpa implements fa3
{
    public final int a;
    public final Object b;
    
    public lpa(final Object b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(Object o) {
        final int a = this.a;
        final Object o2 = null;
        final ex9 ex9 = null;
        boolean l = false;
        final int n = 0;
        final boolean b = false;
        switch (a) {
            default: {
                final AtomicBoolean atomicBoolean = (AtomicBoolean)this.b;
                final Void void1 = (Void)o;
                atomicBoolean.set(true);
                return;
            }
            case 24: {
                final liu liu = (liu)this.b;
                final kni kni = (kni)o;
                liu.i.e((osc$a<? extends osc<?, ?>>)liu.o);
                return;
            }
            case 23: {
                final jiu jiu = (jiu)this.b;
                final c4e$b c4e$b = (c4e$b)o;
                Objects.requireNonNull(jiu);
                o = c4e$b.c;
                if (o instanceof kpv) {
                    final int a2 = o5j.a;
                    final zqv k = ((kpv)o).k;
                    final int b2 = k.b;
                    if (b2 == 9 || b2 == 10 || b2 == 7 || b2 == 11 || b2 == 12) {
                        jiu.x1.b(((idv)jiu).I0, k);
                    }
                }
                return;
            }
            case 22: {
                final yfw yfw = (yfw)this.b;
                final rf1 rf1 = (rf1)o;
                final xfw b3 = yfw.b;
                if (!((List)b3.a).isEmpty()) {
                    ((List<Object>)b3.a).remove(0);
                }
                return;
            }
            case 21: {
                final BaseNewTweetsBannerPresenter baseNewTweetsBannerPresenter = (BaseNewTweetsBannerPresenter)this.b;
                final l9x l9x = (l9x)o;
                final String s0 = BaseNewTweetsBannerPresenter.S0;
                Objects.requireNonNull(baseNewTweetsBannerPresenter);
                Objects.requireNonNull(l9x);
                final int ordinal = ((Enum)l9x).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                baseNewTweetsBannerPresenter.P0 = false;
                                baseNewTweetsBannerPresenter.Q0.dispose();
                            }
                        }
                        else {
                            ((View)baseNewTweetsBannerPresenter.J0).setVisibility(8);
                        }
                    }
                    else if (baseNewTweetsBannerPresenter.G0) {
                        ((View)baseNewTweetsBannerPresenter.J0).setVisibility(0);
                        baseNewTweetsBannerPresenter.i();
                    }
                }
                else {
                    baseNewTweetsBannerPresenter.P0 = true;
                    baseNewTweetsBannerPresenter.J0.setOnClickListener((View$OnClickListener)baseNewTweetsBannerPresenter.M0);
                    baseNewTweetsBannerPresenter.J0.setDisplayListener((NewItemBannerView$b)baseNewTweetsBannerPresenter.L0);
                    baseNewTweetsBannerPresenter.c(baseNewTweetsBannerPresenter.I0, baseNewTweetsBannerPresenter.F0, false);
                    if (baseNewTweetsBannerPresenter.G0) {
                        ((View)baseNewTweetsBannerPresenter.J0).setVisibility(0);
                        baseNewTweetsBannerPresenter.i();
                    }
                }
                return;
            }
            case 20: {
                final wys wys = (wys)this.b;
                final kni kni2 = (kni)o;
                final RecyclerView b4 = wys.G0.K0.b;
                if (b4 instanceof ShortcutEnabledRecyclerView) {
                    ((ShortcutEnabledRecyclerView)b4).setChildKeyListener((View$OnKeyListener)null);
                }
                else {
                    ((View)b4).setOnKeyListener((View$OnKeyListener)null);
                }
                return;
            }
            case 19: {
                final SelectBannerSubtaskViewHost selectBannerSubtaskViewHost = (SelectBannerSubtaskViewHost)this.b;
                final noj noj = (noj)o;
                final String[] x0 = SelectBannerSubtaskViewHost.X0;
                Objects.requireNonNull(selectBannerSubtaskViewHost);
                ex9 ex10 = ex9;
                if (noj.f()) {
                    ex10 = (ex9)noj.c();
                }
                selectBannerSubtaskViewHost.F1(ex10);
                return;
            }
            case 18: {
                final ebk ebk = (ebk)this.b;
                final SensitiveMediaActivityContentViewResult sensitiveMediaActivityContentViewResult = (SensitiveMediaActivityContentViewResult)o;
                Objects.requireNonNull(ebk);
                final jx9<?> editableMedia = sensitiveMediaActivityContentViewResult.getEditableMedia();
                if (editableMedia != null) {
                    ebk.O1(new prg(new x99(editableMedia)));
                }
                return;
            }
            case 17: {
                final upd upd = (upd)this.b;
                final ReportFlowWebViewResultForAction reportFlowWebViewResultForAction = (ReportFlowWebViewResultForAction)o;
                upd.I1();
                return;
            }
            case 16: {
                final yua yua = (yua)this.b;
                final kni kni3 = (kni)o;
                final Pattern f = yua.f;
                Objects.requireNonNull(yua);
                f.i(ita.b().n(), (fa3)new es2((Object)yua, 20));
                f.i(ita.d().n(), (fa3)new wgk((Object)yua, 18));
                return;
            }
            case 15: {
                final ba6 ba6 = (ba6)this.b;
                final SensitiveMediaActivityContentViewResult sensitiveMediaActivityContentViewResult2 = (SensitiveMediaActivityContentViewResult)o;
                final int j2 = ba6.j2;
                Objects.requireNonNull(ba6);
                if (sensitiveMediaActivityContentViewResult2.getEditableImage() != null) {
                    ba6.j2(ba6.i2, new prg(new x99((jx9)sensitiveMediaActivityContentViewResult2.getEditableImage())), (mx9)null);
                }
                if (sensitiveMediaActivityContentViewResult2.getEditableVideo() != null) {
                    ba6.k2(ba6.i2, new prg(new x99((jx9)sensitiveMediaActivityContentViewResult2.getEditableVideo())), false, (mx9)null);
                }
                return;
            }
            case 14: {
                final ncp ncp = (ncp)this.b;
                final pjw pjw = (pjw)o;
                final int e2 = ncp.e2;
                Objects.requireNonNull(ncp);
                if (!((osc)pjw).T().b) {
                    final int n2 = 2131952381;
                    final SwitchPreference d2 = ncp.d2;
                    if (d2 != null) {
                        ((TwoStatePreference)d2).Y(false);
                    }
                    o = ((osc)pjw).T().h;
                    final int a3 = o5j.a;
                    final zbv zbv = (zbv)o;
                    int n3 = n2;
                    if (zbv != null) {
                        final Iterator iterator = zbv.iterator();
                        n3 = n2;
                        if (iterator.hasNext()) {
                            n3 = n2;
                            if (((wbv)iterator.next()).a == 114) {
                                n3 = 2131959398;
                            }
                        }
                    }
                    ehk.c().a((CharSequence)((Fragment)ncp).W0(n3), 1);
                }
                return;
            }
            case 13: {
                final TweetPromptContentViewArgs tweetPromptContentViewArgs = (TweetPromptContentViewArgs)this.b;
                final rf1 rf2 = (rf1)o;
                final float e3 = wou.e1;
                final fg4 fg4 = new fg4();
                ((o1p)fg4).q(new String[] { tweetPromptContentViewArgs.getScribePage(), null, null, null, "cancel" });
                sbw.b((tlm)fg4);
                return;
            }
            case 12: {
                final lt9 lt9 = (lt9)this.b;
                final fo fo = (fo)o;
                final int e4 = lt9.e2;
                Objects.requireNonNull(lt9);
                if (fo.b == -1) {
                    ((u9)lt9).D4();
                }
                return;
            }
            case 11: {
                final il1 il1 = (il1)this.b;
                final noj noj2 = (noj)o;
                final String[] w1 = il1.w1;
                Objects.requireNonNull(il1);
                il1.Z4(((jx9)noj2.c()).F0);
                return;
            }
            case 10: {
                final idv idv = (idv)this.b;
                final nkf$b nkf$b = (nkf$b)o;
                Objects.requireNonNull(idv);
                final int a4 = nkf$b.a;
                if (a4 == 1) {
                    idv.a1.b2(false);
                }
                else if (a4 == 2) {
                    idv.T0.post((Runnable)new um6((Object)idv, 6));
                }
                if (a4 != 0 && idv.B0()) {
                    idv.T0.post((Runnable)new f26((Object)idv, 8));
                }
                return;
            }
            case 9: {
                final thv thv = (thv)this.b;
                final PermissionContentViewResult permissionContentViewResult = (PermissionContentViewResult)o;
                final thv.thv$b d3 = thv.d1;
                if (d3 != null) {
                    thv.f5(d3);
                }
                return;
            }
            case 8: {
                final u9 u9 = (u9)this.b;
                final kni kni4 = (kni)o;
                u9.Q4();
                return;
            }
            case 7: {
                final GroupInfoEditContentViewProvider groupInfoEditContentViewProvider = (GroupInfoEditContentViewProvider)this.b;
                final fo fo2 = (fo)o;
                final vn4 t1 = GroupInfoEditContentViewProvider.t1;
                Objects.requireNonNull(groupInfoEditContentViewProvider);
                if (fo2 != null) {
                    final int a5 = fo2.a;
                    final int b5 = fo2.b;
                    final Intent c = fo2.c;
                    final rrg g1 = groupInfoEditContentViewProvider.g1;
                    vmw.g((Object)g1);
                    g1.i(a5, b5, c, (qx0)new d9c(groupInfoEditContentViewProvider));
                }
                return;
            }
            case 6: {
                final DMConversationContentViewProvider dmConversationContentViewProvider = (DMConversationContentViewProvider)this.b;
                final dum dum = (dum)o;
                final sda d4 = DMConversationContentViewProvider.D3;
                dmConversationContentViewProvider.r1((SendDMRequest)dum);
                return;
            }
            case 5: {
                final URTCoverController urtCoverController = (URTCoverController)this.b;
                final nkf$b nkf$b2 = (nkf$b)o;
                Objects.requireNonNull(urtCoverController);
                final pnm b6 = nkf$b2.b;
                if (b6 instanceof yqv) {
                    final int a6 = o5j.a;
                    final nsm c2 = ((yqv)b6).C1;
                    if (c2 != null) {
                        if (urtCoverController.a == null) {
                            if (urtCoverController.b == null) {
                                final e5q$a e5q$a = (e5q$a)kr4.q(c2.c((Class)e5q$a.class));
                                if (e5q$a != null) {
                                    final b1p b7 = e5q$a.b;
                                    urtCoverController.c = b7;
                                    final apv a7 = e5q$a.a;
                                    if (a7 instanceof rpv) {
                                        final rpv a8 = (rpv)a7;
                                        urtCoverController.a = a8;
                                        final ww8 d5 = urtCoverController.d;
                                        final xsb$a xsb$a = new xsb$a();
                                        xsb$a.a = a8.a;
                                        xsb$a.b = a8.b.a;
                                        xsb$a.c = a8.d;
                                        xsb$a.f = a8.h;
                                        boolean g2 = b;
                                        if (a8.g != null) {
                                            g2 = true;
                                        }
                                        xsb$a.g = g2;
                                        final cpv e5 = a8.e;
                                        if (e5 != null) {
                                            xsb$a.d = e5.a;
                                        }
                                        final tsb$a tsb$a = new tsb$a(1);
                                        ((pmp$a)tsb$a).z((Object)((z4j)xsb$a).e());
                                        d5.a(((cl1$a)tsb$a).w());
                                        urtCoverController.d.H0 = (vw8)new bpv(urtCoverController, a7);
                                        urtCoverController.b((List)urtCoverController.a.i);
                                    }
                                    else if (a7 instanceof ypv) {
                                        boolean b8 = false;
                                        Label_1732: {
                                            if (b7 != null) {
                                                final String g3 = b7.g;
                                                if (g3 != null && g3.equals("double-tap-prompt") && (bh.f(urtCoverController.j) || !urtCoverController.k.a())) {
                                                    b8 = true;
                                                    break Label_1732;
                                                }
                                            }
                                            b8 = false;
                                        }
                                        if (!b8) {
                                            final ypv b9 = (ypv)a7;
                                            urtCoverController.b = b9;
                                            final ww8 e6 = urtCoverController.e;
                                            final acc$a acc$a = new acc$a();
                                            acc$a.h = b9.a;
                                            final cpv b10 = b9.b;
                                            acc$a.i = b10.a;
                                            acc$a.p = b10;
                                            acc$a.j = b9.d;
                                            if (b9.h != null) {
                                                l = true;
                                            }
                                            acc$a.l = l;
                                            acc$a.m = b9.g;
                                            acc$a.o = b9.c;
                                            final cpv e7 = b9.e;
                                            if (e7 != null) {
                                                acc$a.q = e7;
                                                acc$a.k = e7.a;
                                            }
                                            final acc$b r = acc.r;
                                            final Bundle t2 = m58.t("twitter:id", 2);
                                            swj.k(t2, "serializer_fragment_arg", (Object)((z4j)acc$a).e(), (nmp)r);
                                            if (!((BaseBundle)t2).containsKey("twitter:id")) {
                                                throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
                                            }
                                            final wbc wbc = new wbc();
                                            ((Fragment)wbc).N1(t2);
                                            e6.a((bl1)wbc);
                                            urtCoverController.e.H0 = (vw8)new bpv(urtCoverController, a7);
                                            urtCoverController.b(urtCoverController.b.f);
                                        }
                                    }
                                    urtCoverController.c(urtCoverController.c, (String)null, "impression");
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 4: {
                ((gda)this.b).e((Object)o);
                return;
            }
            case 3: {
                final DiscoverabilityActivity discoverabilityActivity = (DiscoverabilityActivity)this.b;
                final l7k l7k = (l7k)o;
                final int h1 = DiscoverabilityActivity.h1;
                Objects.requireNonNull(discoverabilityActivity);
                e0e.f((Object)l7k, "<this>");
                final Iterator<Object> iterator2 = l7k.b.iterator();
                int n4 = 0;
                o = null;
                while (true) {
                    while (iterator2.hasNext()) {
                        final q7k next = iterator2.next();
                        if (e0e.a((Object)next.a, (Object)"android.permission.READ_CONTACTS")) {
                            if (n4 != 0) {
                                o = o2;
                                final q7k q7k = (q7k)o;
                                int b11 = n;
                                if (q7k != null) {
                                    b11 = (q7k.b ? 1 : 0);
                                }
                                if (b11 != 0) {
                                    discoverabilityActivity.k();
                                }
                                return;
                            }
                            n4 = 1;
                            o = next;
                        }
                    }
                    if (n4 == 0) {
                        o = o2;
                    }
                    continue;
                }
            }
            case 2: {
                final rbg rbg = (rbg)this.b;
                final q2c q2c = (q2c)o;
                final rbg.rbg$a o3 = rbg.o1;
                Objects.requireNonNull(rbg);
                final int c3 = ((osc)q2c).T().c;
                fg4 fg5;
                if (c3 == 200) {
                    fg5 = new fg4(rbg.f1.f());
                    ((o1p)fg5).q(new String[] { "login_verification::get_requests::success" });
                }
                else {
                    fg5 = new fg4(rbg.f1.f());
                    ((o1p)fg5).q(new String[] { "login_verification::get_requests::failure" });
                }
                ((o1p)fg5).c = String.valueOf(c3);
                final int a9 = o5j.a;
                final List m1 = q2c.m1;
                if (c3 == 200 && m1 != null && !m1.isEmpty()) {
                    ((o1p)fg5).s((long)m1.size());
                    final List a10 = luh.a(0);
                    final Iterator iterator3 = m1.iterator();
                    while (iterator3.hasNext()) {
                        a10.add(new rbg$a((ybg)iterator3.next()));
                    }
                    final List a11 = luh.a(0);
                    a11.add(rbg.o1);
                    a11.addAll(a10);
                    rbg.i1.G0.d((p4e)new zkf((Iterable)a11));
                }
                else {
                    ((o1p)fg5).s(0L);
                    rbg.i1.G0.d((p4e)rbg.r1);
                    if (c3 != 200) {
                        final int e8 = rbg.e1(q2c.n1);
                        if (e8 == 88) {
                            final fg4 fg6 = new fg4(rbg.f1.f());
                            ((o1p)fg6).q(new String[] { "login_verification::get_requests::rate_limit" });
                            sbw.b((tlm)fg6);
                        }
                        ((o1p)fg5).t = String.valueOf(e8);
                        rbg.j1();
                    }
                }
                sbw.b((tlm)fg5);
                return;
            }
            case 1: {
                final a a12 = (a)this.b;
                final c4e$a c4e$a = (c4e$a)o;
                final n8x a13 = c4e$a.a;
                final mm3 mm3 = (mm3)c4e$a.b;
                final int c4 = c4e$a.c;
                Objects.requireNonNull(a12);
                e0e.f((Object)a13, "viewHolder");
                e0e.f((Object)mm3, "item");
                final ConcurrentHashMap e9 = a12.e;
                final String a14 = mm3.a;
                e0e.e((Object)a14, "item.id");
                e9.put((Object)a13, (Object)new a$d(a14, c4));
                return;
            }
            case 0: {
                final fci fci = (fci)this.b;
                final PermissionContentViewResult permissionContentViewResult2 = (PermissionContentViewResult)o;
                fci.a(GalleryGridMediaAttachedResult.class).d((Object)new GalleryGridContentViewArgs("composition", (cxw)cxw$d.h, 0));
            }
        }
    }
}
