import android.view.ViewGroup;
import androidx.preference.Preference;
import com.twitter.weaver.mvi.MviViewModel;
import android.app.Activity;
import android.app.Dialog;
import com.twitter.composer.view.ComposerFooterActionBar$b;
import java.lang.ref.WeakReference;
import com.twitter.ui.widget.timeline.a$a;
import android.app.AlertDialog;
import com.twitter.android.qrcodes.QRCodeContentViewProvider;
import java.util.Arrays;
import com.twitter.composer.poll.PollComposeView;
import com.twitter.composer.view.ComposerFooterActionBar;
import com.twitter.util.user.UserIdentifier;
import com.twitter.dm.conversation.widget.DMAdminPreference;
import com.twitter.dm.ui.widget.DMAudioPlayerSentView;
import com.twitter.onboarding.ocf.entertext.LocationEditTextViewPresenter;
import com.twitter.onboarding.ocf.signup.PrivacyOptionsPresenter;
import com.twitter.ui.navigation.drawer.implementation.header.DrawerHeaderViewModel;
import android.content.Context;
import com.twitter.ui.widget.timeline.a;
import com.twitter.ui.widget.timeline.TimelineCompactPromptView;
import android.content.Intent;
import android.net.Uri;
import java.util.Objects;
import tv.periscope.android.common.PeriscopeInterstitialActivity;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vtf implements View$OnClickListener
{
    public final int D0;
    public final Object E0;
    
    public vtf(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void onClick(final View view) {
        final int d0 = this.D0;
        final String s = "";
        switch (d0) {
            default: {
                ((mv6)this.E0).a(true);
                return;
            }
            case 28: {
                final ilo ilo = (ilo)this.E0;
                czd.f((Object)ilo, "this$0");
                final AlertDialog c = ((tv.periscope.android.ui.a)ilo).c;
                if (c != null) {
                    ((Dialog)c).cancel();
                }
                return;
            }
            case 27: {
                final PeriscopeInterstitialActivity periscopeInterstitialActivity = (PeriscopeInterstitialActivity)this.E0;
                final int w0 = PeriscopeInterstitialActivity.W0;
                Objects.requireNonNull(periscopeInterstitialActivity);
                Uri parse = Uri.parse("https://b.pscp.live/g97c");
                if (((Activity)periscopeInterstitialActivity).getIntent() != null) {
                    parse = parse;
                    if (((Activity)periscopeInterstitialActivity).getIntent().getParcelableExtra("create_broadcast") != null) {
                        parse = (Uri)((Activity)periscopeInterstitialActivity).getIntent().getParcelableExtra("create_broadcast");
                    }
                }
                ((Activity)periscopeInterstitialActivity).setResult(3310, new Intent("android.intent.action.VIEW", parse));
                ((Activity)periscopeInterstitialActivity).finish();
                return;
            }
            case 26: {
                final TimelineCompactPromptView timelineCompactPromptView = (TimelineCompactPromptView)this.E0;
                final int l0 = TimelineCompactPromptView.L0;
                final a$a d2 = ((a)timelineCompactPromptView).D0;
                if (d2 != null) {
                    d2.b((a)view);
                }
                return;
            }
            case 25: {
                final Context context = (Context)this.E0;
                o70.p(context, Uri.parse(context.getString(2131959541)));
                return;
            }
            case 24: {
                ((MviViewModel)this.E0).O((cdw)mf9.a);
                return;
            }
            case 23: {
                ((yv8)this.E0).T(-2);
                return;
            }
            case 22: {
                final tht tht = (tht)this.E0;
                czd.f((Object)tht, "this$0");
                tht.G0.onNext((Object)oht$b.a);
                return;
            }
            case 21: {
                final bqn bqn = (bqn)this.E0;
                final int t0 = bqn.T0;
                czd.f((Object)bqn, "this$0");
                ((ck0)bqn).dismiss();
                return;
            }
            case 20: {
                ((PrivacyOptionsPresenter)this.E0).a();
                return;
            }
            case 19: {
                final LocationEditTextViewPresenter locationEditTextViewPresenter = (LocationEditTextViewPresenter)this.E0;
                final String s2 = locationEditTextViewPresenter.G0.s0();
                final r6g i0 = locationEditTextViewPresenter.I0;
                if (i0 != null) {
                    i0.g(s2);
                }
                return;
            }
            case 18: {
                final i5i i5i = (i5i)this.E0;
                final int t2 = i5i.T0;
                czd.f((Object)i5i, "this$0");
                ((ck0)i5i).dismiss();
                return;
            }
            case 17: {
                final WeakReference x1 = ((k2c)this.E0).X1;
                if (x1 != null) {
                    final k2c$d k2c$d = (k2c$d)x1.get();
                    if (k2c$d != null) {
                        k2c$d.i1(true);
                    }
                }
                return;
            }
            case 16: {
                final nsb nsb = (nsb)this.E0;
                final int r2 = DMAudioPlayerSentView.r2;
                czd.f((Object)nsb, "$clickAction");
                nsb.invoke();
                return;
            }
            case 15: {
                final dt7 dt7 = (dt7)this.E0;
                czd.f((Object)dt7, "this$0");
                if (((View)dt7.V0).hasFocus()) {
                    dt7.s0();
                }
                return;
            }
            case 14: {
                final DMAdminPreference dmAdminPreference = (DMAdminPreference)this.E0;
                ecl.d(((Preference)dmAdminPreference).D0, UserIdentifier.fromId(dmAdminPreference.o1.D0));
                final af4 af4 = new af4();
                ((u0p)af4).q(new String[] { "messages:conversation_settings::admin_pref:click" });
                cbw.b((elm)af4);
                return;
            }
            case 13: {
                final hld hld = (hld)this.E0;
                czd.f((Object)hld, "this$0");
                hld.d.a.onNext((Object)fld$a$b.a);
                return;
            }
            case 12: {
                final ComposerFooterActionBar$b v0 = ((ComposerFooterActionBar)this.E0).V0;
                if (v0 != null) {
                    v0.u4();
                }
                return;
            }
            case 11: {
                final bqk d3 = ((PollComposeView)this.E0).D0;
                if (d3 != null) {
                    final cqk cqk = (cqk)d3;
                    if (cqk.T() && ((ua6)cqk).J()) {
                        cqk.R().a.add("");
                        final PollComposeView s3 = cqk.S();
                        s3.a(((ViewGroup)s3.E0).getChildCount(), (String)null).requestFocus();
                        ((ua6)cqk).K();
                    }
                }
                return;
            }
            case 10: {
                final lif lif = (lif)this.E0;
                czd.f((Object)lif, "this$0");
                final cnb g0 = lif.G0;
                final String[] u2 = iwb.u2;
                if (mwb.a((Context)g0)) {
                    lif.c();
                }
                else {
                    final dn6 q0 = lif.Q0;
                    final String string = ((Context)lif.G0).getString(2131954188);
                    final cnb g2 = lif.G0;
                    final String[] u3 = iwb.u2;
                    final x6k$a a = x6k.a(string, (Context)g2, (String[])Arrays.copyOf(u3, u3.length));
                    a.x();
                    q0.d((Object)((n4j)a).e());
                }
                return;
            }
            case 9: {
                final wup wup = (wup)this.E0;
                czd.f((Object)wup, "this$0");
                wup.b.E0();
                return;
            }
            case 8: {
                ((f8p)this.E0).a1.c(asa.b().k("search_features_safe_search_learn_more_help_link"));
                return;
            }
            case 7: {
                final d4f d4f = (d4f)this.E0;
                d4f.G0.b(d4f.H0, (Object)d4f.D0).a();
                d4f.F0.j((qv)null);
                return;
            }
            case 6: {
                final bim bim = (bim)this.E0;
                czd.f((Object)bim, "this$0");
                ((ck0)bim.c.getValue()).dismiss();
                return;
            }
            case 5: {
                final QRCodeContentViewProvider qrCodeContentViewProvider = (QRCodeContentViewProvider)this.E0;
                Objects.requireNonNull(qrCodeContentViewProvider);
                final af4 af5 = new af4(((u9)qrCodeContentViewProvider).K0);
                ((u0p)af5).T = vba.Companion.b(qrCodeContentViewProvider.W4(), "image_picker", "click").toString();
                final int a2 = c5j.a;
                cbw.b((elm)af5);
                ((u9)qrCodeContentViewProvider).E0.startActivityForResult(nzg.a(), 2);
                return;
            }
            case 4: {
                final mzf mzf = (mzf)this.E0;
                final mzf.mzf$a companion = mzf.Companion;
                czd.f((Object)mzf, "this$0");
                final w4 j0 = mzf.J0;
                if (j0 != null) {
                    j0.p(false);
                }
                mzf.D0.a();
                return;
            }
            case 3: {
                final xpf xpf = (xpf)this.E0;
                Objects.requireNonNull(xpf);
                final int id = view.getId();
                if (id == 2131429821) {
                    final w4 l2 = xpf.L0;
                    if (l2 != null) {
                        l2.r();
                    }
                }
                else if (id == 2131431531) {
                    final w4 l3 = xpf.L0;
                    if (l3 != null) {
                        if (l3.b.m1) {
                            l3.s();
                        }
                        else {
                            l3.f();
                        }
                    }
                }
                else if (id == 2131429816) {
                    xpf.n();
                }
                xpf.o();
                return;
            }
            case 2: {
                final gvf gvf = (gvf)this.E0;
                final cof x2 = gvf.x1;
                if (x2 != null) {
                    final lvf s4 = gvf.s1;
                    Objects.requireNonNull(s4);
                    s4.b.a(x2, "share_moment_floating_button");
                    final com.twitter.android.liveevent.landing.scribe.a d4 = s4.d;
                    Objects.requireNonNull(d4);
                    d4.o(vba.g("live_event_timeline", "", "", "share_moment_floating_button", "click"), (j0p)d4.m((String)null));
                }
                return;
            }
            case 1: {
                final grf grf = (grf)this.E0;
                final erf e0 = grf.E0;
                final efv f = grf.G0.f();
                String d5;
                if (f == null) {
                    m8a.d(new Throwable("No event page given to the reminder button scribe"));
                    d5 = s;
                }
                else {
                    d5 = ((lzo)f).d;
                }
                if (e0.h != null) {
                    final vwf b = e0.b();
                    if (b != null) {
                        final String c2 = b.c;
                        if (!ikr.e((CharSequence)c2)) {
                            final String c3 = e0.h.c;
                            final boolean b2 = true ^ b.a();
                            e0.d.a((t19)e0.a.a(c3, c2, b2).doOnSubscribe((lj6)new kds((Object)e0, 5)).doFinally((oj)new dt1((Object)e0, 2)).subscribeWith((ccj)new drf(e0, b.a())));
                            if (b2 && !e0.b.a()) {
                                e0.b.b();
                            }
                            e0.c.a(b, d5);
                        }
                    }
                }
                return;
            }
            case 0: {
                ((xtf)this.E0).c.p();
            }
        }
    }
}
