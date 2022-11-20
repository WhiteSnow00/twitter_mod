import android.widget.TextView;
import android.widget.CompoundButton;
import android.app.Dialog;
import android.os.Bundle;
import com.twitter.composer.view.ComposerFooterActionBar$b;
import com.twitter.dm.widget.UntrustedConversationComposer$a;
import androidx.recyclerview.widget.RecyclerView;
import com.twitter.onboarding.ocf.NavigationHandler;
import tv.periscope.model.b;
import com.twitter.ui.widget.timeline.a$a;
import com.twitter.android.login.LoginContentViewProvider;
import android.app.Activity;
import android.util.DisplayMetrics;
import com.twitter.android.qrcodes.QRCodeContentViewProvider;
import com.twitter.android.revenue.card.VideoWebsiteCardFullscreenChromeView;
import com.twitter.app.dm.DMAvatarFullViewActivity;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.util.user.UserIdentifier;
import com.twitter.app.dm.widget.DMAvatarPreference;
import com.twitter.navigation.safety.MuteKeywordComposerContentViewArgs;
import com.twitter.composer.view.ComposerFooterActionBar;
import androidx.fragment.app.Fragment;
import java.util.List;
import com.twitter.app.dm.DMConversationContentViewProvider;
import com.twitter.dm.widget.UntrustedConversationComposer;
import android.content.Context;
import com.twitter.onboarding.ocf.userrecommendation.userrecommendationurt.OCFUserRecommendationsURTViewHost;
import com.twitter.navigation.profile.ImageActivityEditResult;
import com.twitter.ui.widget.timeline.a;
import com.twitter.ui.widget.timeline.TimelineLargePromptView;
import android.content.Intent;
import android.net.Uri;
import java.util.Objects;
import tv.periscope.android.common.PeriscopeInterstitialActivity;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fpf implements View$OnClickListener
{
    public final int D0;
    public final Object E0;
    
    public fpf(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void onClick(final View view) {
        switch (this.D0) {
            default: {
                final v82 v82 = (v82)this.E0;
                final int v83 = v82.v1;
                czd.f((Object)v82, "this$0");
                final bdl h1 = v82.h1;
                if (h1 != null) {
                    ((pyp)h1).c();
                }
                return;
            }
            case 28: {
                final jxc jxc = (jxc)this.E0;
                czd.f((Object)jxc, "this$0");
                jxc.a();
                return;
            }
            case 27: {
                final PeriscopeInterstitialActivity periscopeInterstitialActivity = (PeriscopeInterstitialActivity)this.E0;
                final int w0 = PeriscopeInterstitialActivity.W0;
                Objects.requireNonNull(periscopeInterstitialActivity);
                ((Context)periscopeInterstitialActivity).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((Context)periscopeInterstitialActivity).getString(2131956766))));
                return;
            }
            case 26: {
                final TimelineLargePromptView timelineLargePromptView = (TimelineLargePromptView)this.E0;
                final int k0 = TimelineLargePromptView.K0;
                final a$a d0 = ((a)timelineLargePromptView).D0;
                if (d0 != null) {
                    d0.b((a)view);
                }
                return;
            }
            case 25: {
                final ebi ebi = (ebi)this.E0;
                if (ebi != null) {
                    ebi.a3();
                }
                return;
            }
            case 24: {
                final owq owq = (owq)this.E0;
                final owq$a companion = owq.Companion;
                czd.f((Object)owq, "this$0");
                vjo.T(owq.E0, "tab", "prompt", "ok", "click", null, null, null, null, 496);
                owq.D0.d((ym)mfg.b(mfg.h));
                ((Dialog)owq).dismiss();
                return;
            }
            case 23: {
                final h8n h8n = (h8n)this.E0;
                final int v84 = h8n.V0;
                czd.f((Object)h8n, "this$0");
                h8n.o("confirm", "click");
                ((ck0)h8n).dismiss();
                return;
            }
            case 22: {
                final s5d s5d = (s5d)this.E0;
                final String[] l1 = s5d.l1;
                ((u9)s5d).F0.c((bn6)ImageActivityEditResult.INSTANCE);
                return;
            }
            case 21: {
                final qj2 qj2 = (qj2)this.E0;
                Objects.requireNonNull(qj2);
                final Object tag = view.getTag();
                final int a = c5j.a;
                final b f1 = ((dn2)tag).f1;
                if (f1 != null) {
                    qj2.I0.onNext((Object)f1);
                }
                return;
            }
            case 20: {
                final OCFUserRecommendationsURTViewHost ocfUserRecommendationsURTViewHost = (OCFUserRecommendationsURTViewHost)this.E0;
                final NavigationHandler j0 = ocfUserRecommendationsURTViewHost.J0;
                final ssv a2 = ((dtr)ocfUserRecommendationsURTViewHost.K0).a;
                jee.l((Object)a2);
                j0.d(new pqd(a2, ocfUserRecommendationsURTViewHost.h3()), (String)null);
                return;
            }
            case 19: {
                final RecyclerView e0 = ((aqc)this.E0).E0;
                e0.z0(e0.O(view));
                return;
            }
            case 18: {
                ((CompoundButton)((m74)this.E0).G0).toggle();
                return;
            }
            case 17: {
                final wyj wyj = (wyj)this.E0;
                final NavigationHandler k2 = wyj.K0;
                final ssv a3 = ((dtr)wyj.J0).a;
                jee.l((Object)a3);
                k2.d(new pqd(a3, (tqd)new yjr(wyj.I0.s0())), (String)null);
                return;
            }
            case 16: {
                view.getContext().startActivity((Intent)((ypa)rsi.a()).a((Object)this.E0));
                return;
            }
            case 15: {
                final o2c o2c = (o2c)this.E0;
                final yqg x1 = o2c.X1;
                if (x1 != null) {
                    x1.g();
                }
                final cnb l2 = ((Fragment)o2c).L0();
                final vqg w2 = o2c.W1;
                if (w2 == null) {
                    ((Activity)l2).setResult(0);
                }
                else {
                    ((Activity)l2).setResult(-1, new Intent().putExtra("media", klp.e((Object)w2.b, (rlp)r89.O0)));
                }
                ((Activity)l2).finish();
                return;
            }
            case 14: {
                final qak qak = (qak)this.E0;
                final nak f2 = qak.f1;
                if (f2 != null) {
                    ((sod)f2).R0.f();
                }
                final cnb i0 = qak.I0;
                final String[] u2 = iwb.u2;
                if (mwb.a((Context)i0)) {
                    qak.T1();
                }
                else {
                    final x6k$a a4 = x6k.a(((Context)qak.I0).getString(2131954188), (Context)qak.I0, iwb.u2);
                    a4.s(aba.c("", "composition", "", "add_photo"));
                    qak.i1.d((Object)((n4j)a4).e());
                }
                return;
            }
            case 13: {
                final UntrustedConversationComposer$a y0 = ((UntrustedConversationComposer)this.E0).Y0;
                if (y0 != null) {
                    final UntrustedConversationComposer$a untrustedConversationComposer$a = (UntrustedConversationComposer$a)y0;
                    final DMConversationContentViewProvider a5 = untrustedConversationComposer$a.a;
                    String s;
                    if (a5.j1) {
                        s = "leave_group";
                    }
                    else {
                        s = "delete_thread";
                    }
                    cbw.b((elm)a5.p1(s));
                    final DMConversationContentViewProvider a6 = untrustedConversationComposer$a.a;
                    final sm8 n2 = sm8.n2(((ucv)a6).G0, 769, a6.j1, a6.e1, "thread", a6.m1, a6.n1, (List)a6.c1.h, "request_action_sheet", a6.A1, a6.q3);
                    ((wk1)n2).k2((Fragment)((ucv)a6).E0);
                    ((wk1)n2).U1 = (xv8)new ki7((Object)a6, 0);
                    final int a7 = c5j.a;
                    ((wk1)n2).e2(((ucv)a6).A0(), null);
                }
                return;
            }
            case 12: {
                final gd7 gd7 = (gd7)this.E0;
                final int k3 = gd7.K0;
                ((xj1)gd7).a("submit");
                ((ln7)((xj1)gd7).E0).a();
                final z66 z66 = new z66();
                z66.r(((xj1)gd7).D0.g, 0);
                z66.q(false);
                gd7.J0.d((ym)z66);
                return;
            }
            case 11: {
                final ComposerFooterActionBar$b v85 = ((ComposerFooterActionBar)this.E0).V0;
                if (v85 != null) {
                    v85.p2();
                }
                return;
            }
            case 10: {
                ((ixh)this.E0).c1.d((Object)new MuteKeywordComposerContentViewArgs());
                return;
            }
            case 9: {
                final DMAvatarPreference dmAvatarPreference = (DMAvatarPreference)this.E0;
                final qo7 q1 = dmAvatarPreference.q1;
                if (!q1.g) {
                    final af4 af4 = new af4(dmAvatarPreference.o1);
                    ((u0p)af4).q(new String[] { "messages:conversation_settings:::view_profile" });
                    cbw.b((elm)af4);
                    ecl.d(dmAvatarPreference.D0, UserIdentifier.fromId(chw.V(dmAvatarPreference.q1.a, dmAvatarPreference.o1.getId())));
                }
                else {
                    final soj d2 = q1.d;
                    if (d2 != null) {
                        dmAvatarPreference.D0.startActivity(sm6.a().x8().a(dmAvatarPreference.D0, (ContentViewArgs)ed.E(d2)));
                    }
                    else {
                        final Context d3 = dmAvatarPreference.D0;
                        final Intent intent = new Intent(dmAvatarPreference.D0, (Class)DMAvatarFullViewActivity.class);
                        final Bundle a8 = nh.A("intent_type", 2);
                        dwj.k(a8, "inbox_item", (Object)dmAvatarPreference.q1, (rlp)qo7.w);
                        final int a9 = c5j.a;
                        d3.startActivity(intent.putExtras(((vl1)new tj7(a8)).a));
                    }
                }
                return;
            }
            case 8: {
                final o18 o18 = (o18)this.E0;
                czd.f((Object)o18, "this$0");
                ((TextView)o18.E0).setText((CharSequence)"");
                are.a((View)o18.E0);
                return;
            }
            case 7: {
                final wmx wmx = (wmx)this.E0;
                czd.f((Object)wmx, "this$0");
                wmx.X4();
                return;
            }
            case 6: {
                final iei iei = (iei)this.E0;
                czd.f((Object)iei, "this$0");
                iei.a();
                return;
            }
            case 5: {
                VideoWebsiteCardFullscreenChromeView.l((VideoWebsiteCardFullscreenChromeView)this.E0);
                return;
            }
            case 4: {
                ((bq2)this.E0).m0();
                return;
            }
            case 3: {
                final QRCodeContentViewProvider qrCodeContentViewProvider = (QRCodeContentViewProvider)this.E0;
                Objects.requireNonNull(qrCodeContentViewProvider);
                final af4 af5 = new af4(((u9)qrCodeContentViewProvider).K0);
                ((u0p)af5).T = vba.Companion.b(qrCodeContentViewProvider.W4(), "qr_scan", "click").toString();
                final int a10 = c5j.a;
                cbw.b((elm)af5);
                qrCodeContentViewProvider.c1.A(1, true);
                return;
            }
            case 2: {
                final rtt rtt = (rtt)this.E0;
                Objects.requireNonNull(rtt);
                final int[] array = new int[2];
                view.getLocationOnScreen(array);
                final int n3 = array[1];
                final DisplayMetrics displayMetrics = new DisplayMetrics();
                ((Activity)view.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                final int n4 = displayMetrics.heightPixels / 2;
                if (n3 > n4) {
                    ((View)rtt.H0).postDelayed((Runnable)new qtt((Object)rtt, n3, n4, 0), 100L);
                }
                return;
            }
            case 1: {
                ((LoginContentViewProvider)this.E0).b5();
                return;
            }
            case 0: {
                ((gpf)this.E0).H0.d();
            }
        }
    }
}
