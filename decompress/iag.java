import com.twitter.app.common.account.AppAccountManager;
import com.twitter.media.ui.image.c;
import com.twitter.media.ui.image.AspectRatioFrameLayout;
import android.app.Activity;
import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.media.av.ui.ClosedCaptionsView;
import android.view.View;
import android.preference.PreferenceManager;
import android.net.Uri;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import com.twitter.account.api.RemoveAccountDialogSuccess;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Objects;
import com.twitter.longform.twitterarticles.ui.ProfileTwitterArticlesViewModel$b;
import com.twitter.longform.twitterarticles.ui.ProfileTwitterArticlesViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iag implements lj6
{
    public final int D0;
    public final Object E0;
    
    public iag(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void accept(final Object o) {
        final int d0 = this.D0;
        final boolean b = false;
        boolean b2 = false;
        final boolean b3 = false;
        final boolean b4 = false;
        switch (d0) {
            default: {
                final ProfileTwitterArticlesViewModel profileTwitterArticlesViewModel = (ProfileTwitterArticlesViewModel)this.E0;
                final msm msm = (msm)o;
                final coe[] t0 = ProfileTwitterArticlesViewModel.T0;
                czd.f((Object)profileTwitterArticlesViewModel, "this$0");
                if (msm.d()) {
                    ((MviViewModel)profileTwitterArticlesViewModel).Q((qsb)new ProfileTwitterArticlesViewModel$b(msm));
                }
                else {
                    if (!((kbv)msm.b()).l()) {
                        final w5s$a w5s$a = new w5s$a();
                        w5s$a.e = (red$c)red$c$b.b;
                        w5s$a.q(74);
                        w5s$a.s(2131955479);
                        w5s$a.r("");
                        profileTwitterArticlesViewModel.P0.a((dfd)((n4j)w5s$a).e());
                    }
                    ((MviViewModel)profileTwitterArticlesViewModel).T((qsb)new vfl(profileTwitterArticlesViewModel));
                }
                return;
            }
            case 28: {
                final sod sod = (sod)this.E0;
                final ynj ynj = (ynj)o;
                Objects.requireNonNull(sod);
                sod.S1((bo6)ynj.c());
                sod.Q1();
                return;
            }
            case 27: {
                final vl8 vl8 = (vl8)this.E0;
                final vl8 vl9 = (vl8)o;
                vl8.a.run();
                vl8.f = false;
                return;
            }
            case 26: {
                final zq6 zq6 = (zq6)this.E0;
                final String s = (String)o;
                Objects.requireNonNull(zq6);
                final af4 af4 = new af4(zq6.b.k());
                ((u0p)af4).T = vba.g("tweet", "", "conversation_control_prompt", s, "click").toString();
                final int a = c5j.a;
                cbw.b((elm)af4);
                return;
            }
            case 25: {
                final qvl qvl = (qvl)this.E0;
                final lb6$a lb6$a = (lb6$a)o;
                Objects.requireNonNull(qvl);
                final bo6 b5 = lb6$a.b;
                qvl.P().setVisibility(8);
                if (!c5j.a((Object)qvl.K0, (Object)b5) || ((View)qvl.Q()).getVisibility() != 0) {
                    qvl.K0 = b5;
                    final efu efu = new efu(true, (bzr)z61.W0, qvl.J0);
                    ((View)qvl.Q()).setVisibility(0);
                    qvl.Q().k(qvl.K0, (dfu)efu, (Integer)null);
                }
                if (((ua6)qvl).J() && b5 != null && fli.g0(b5)) {
                    boolean mediaForwardEnabled = b4;
                    if (!((ua6)qvl).I().m()) {
                        mediaForwardEnabled = b4;
                        if (b5.l().e.isEmpty()) {
                            mediaForwardEnabled = true;
                        }
                    }
                    if (mediaForwardEnabled != qvl.Q().t1 && ((View)qvl.Q()).getVisibility() == 0) {
                        i0u.a((ViewGroup)((View)qvl.Q()).getParent(), (nzt)new gb6());
                    }
                    qvl.Q().setMediaForwardEnabled(mediaForwardEnabled);
                }
                return;
            }
            case 24: {
                final b88 b6 = (b88)this.E0;
                if (!((adw)o).g()) {
                    b6.b();
                }
                return;
            }
            case 23: {
                final vww vww = (vww)this.E0;
                final tmi tmi = (tmi)o;
                final kxw b7 = vww.h1.b;
                if (b7 != null) {
                    b7.i.a();
                }
                return;
            }
            case 22: {
                final eh3 eh3 = (eh3)this.E0;
                final boolean booleanValue = (boolean)o;
                final kra e1 = eh3.e1;
                if (booleanValue) {
                    eh3.E1();
                    eh3.J0.g();
                    eh3.K0.e();
                }
                else {
                    eh3.G1();
                    eh3.J0.c();
                    eh3.K0.f();
                }
                return;
            }
            case 21: {
                final qd3 qd3 = (qd3)this.E0;
                final MotionEvent motionEvent = (MotionEvent)o;
                qd3.H0.b(motionEvent);
                qd3.L0.g(motionEvent);
                return;
            }
            case 20: {
                final gd3 gd3 = (gd3)this.E0;
                final tmi tmi2 = (tmi)o;
                if (gd3.F0.P0().getAVPlayerAttachment() != null) {
                    gd3.F0.h0();
                    gd3.F0.P0().getAutoPlayableItem().j1();
                }
                return;
            }
            case 19: {
                ((g7g)this.E0).p((ynj)o);
                return;
            }
            case 18: {
                final zb3 zb3 = (zb3)this.E0;
                final tmi tmi3 = (tmi)o;
                Objects.requireNonNull(zb3);
                return;
            }
            case 17: {
                ((xb3)this.E0).O3((float)o);
                return;
            }
            case 16: {
                final rxh rxh = (rxh)this.E0;
                final tmi tmi4 = (tmi)o;
                rxh.X0.G2();
                return;
            }
            case 15: {
                final bax bax = (bax)this.E0;
                final kjh kjh = (kjh)o;
                Objects.requireNonNull(bax);
                if (kjh.b && kjh.c) {
                    final w5s$a w5s$a2 = new w5s$a();
                    w5s$a2.s(2131959203);
                    w5s$a2.q(9);
                    w5s$a2.e = (red$c)red$c$b.b;
                    w5s$a2.r("reply_unhidden");
                    bax.t1.a((w5s)((n4j)w5s$a2).e());
                }
                else {
                    bax.t1.b(2131959202);
                }
                return;
            }
            case 14: {
                final d9l d9l = (d9l)this.E0;
                final u7l$a$a u7l$a$a = (u7l$a$a)o;
                final Uri y3 = d9l.Y3;
                Objects.requireNonNull(d9l);
                final yd1 e2 = yd1.E0;
                d9l.U2 = u7l$a$a.b;
                d9l.V2 = u7l$a$a.d;
                yd1 a2;
                if (u7l.Companion.a(d9l.u2)) {
                    a2 = u7l$a$a.a;
                }
                else {
                    a2 = e2;
                }
                final gal v3 = d9l.v3;
                final yd1 yd1 = (yd1)d9l.T2.c((Object)e2);
                Objects.requireNonNull(a8l.Companion);
                czd.f((Object)a2, "newAvatarPresenceState");
                boolean b8 = b;
                if (yd1 == e2) {
                    b8 = b;
                    if (s9i.s(yd1.D0, yd1.F0, yd1.G0).contains(a2)) {
                        b8 = true;
                    }
                }
                v3.a(b8, a2, d9l.V2);
                d9l.T2.a((Object)a2);
                return;
            }
            case 13: {
                ((j2a)o).g((tes)this.E0);
                return;
            }
            case 12: {
                final cem cem = (cem)this.E0;
                final adw adw = (adw)o;
                Objects.requireNonNull(cem);
                if (!adw.g()) {
                    ((Activity)((u9)cem).E0).removeDialog(1);
                    cem.S0 = false;
                    ((u9)cem).F0.c((bn6)RemoveAccountDialogSuccess.INSTANCE);
                }
                return;
            }
            case 11: {
                final rue rue = (rue)this.E0;
                final tmi tmi5 = (tmi)o;
                final fca<elm> h = rue.h;
                final UserIdentifier current = UserIdentifier.getCurrent();
                final af4 af5 = new af4();
                ((u0p)af5).q(new String[] { "::::app_open_warm" });
                h.b(current, (elm)af5);
                return;
            }
            case 10: {
                final i7t i7t = (i7t)this.E0;
                final tmi tmi6 = (tmi)o;
                i7t.g.b();
                return;
            }
            case 9: {
                final gpf gpf = (gpf)this.E0;
                final Float n = (Float)o;
                final uof h2 = gpf.H0;
                final float floatValue = n;
                if (n == 1.0f) {
                    b2 = true;
                }
                h2.e(floatValue, b2);
                return;
            }
            case 8: {
                final txf txf = (txf)this.E0;
                final hxf$a hxf$a = (hxf$a)o;
                final View b9 = txf.b;
                if (b9 != null) {
                    final int b10 = hxf$a.b;
                    if (b10 > 0) {
                        txf.b.setTranslationY(-(b9.getHeight() / 2) - b10 * hxf$a.a / 2.0f);
                    }
                }
                return;
            }
            case 7: {
                final n0x n0x = (n0x)this.E0;
                final tmi tmi7 = (tmi)o;
                n0x.e1 = true;
                n0x.i();
                return;
            }
            case 6: {
                final gvf gvf = (gvf)this.E0;
                final jxf jxf = (jxf)o;
                int n2 = b3 ? 1 : 0;
                if (gvf.v1.a()) {
                    n2 = (b3 ? 1 : 0);
                    if (jxf == jxf.D0) {
                        final cof x1 = gvf.x1;
                        n2 = (b3 ? 1 : 0);
                        if (x1 != null) {
                            n2 = (b3 ? 1 : 0);
                            if (x1.l) {
                                n2 = (b3 ? 1 : 0);
                                if (ikr.g((CharSequence)x1.a)) {
                                    n2 = 1;
                                }
                            }
                        }
                    }
                }
                if (n2 != 0) {
                    final bcp t2 = gvf.t1;
                    final String a3 = gvf.x1.a;
                    Objects.requireNonNull(t2);
                    czd.f((Object)a3, "eventId");
                    t2.b.e((Object)t2.a, (Object)a3).w((psb)new x55((qsb)dcp.D0, 23)).D();
                }
                return;
            }
            case 5: {
                final htf htf = (htf)this.E0;
                final qg3 style = (qg3)o;
                final ClosedCaptionsView p = htf.P0;
                if (p != null) {
                    p.setStyle(style);
                }
                return;
            }
            case 4: {
                final aqf aqf = (aqf)this.E0;
                final tmi tmi8 = (tmi)o;
                aqf.b1.d();
                return;
            }
            case 3: {
                final v9s v9s = (v9s)this.E0;
                final tmi tmi9 = (tmi)o;
                if (v9s.E0.N0.isEmpty()) {
                    final wi8 e3 = v9s.E0;
                    final t9s f0 = v9s.F0;
                    if (f0.b.isEmpty()) {
                        f0.b = (List)f0.a.get();
                    }
                    e3.z(f0.b);
                }
                v9s.E0.o2();
                return;
            }
            case 2: {
                final chd chd = (chd)this.E0;
                final suo suo = (suo)o;
                final w4 g0 = chd.G0;
                if (g0 != null) {
                    final oos x2 = g0.b.c1.X2();
                    Objects.requireNonNull(suo);
                    if (x2 != null) {
                        final float c = bv0.c(x2.getSize().h());
                        ((AspectRatioFrameLayout)suo.E0).setAspectRatio(c);
                        if (c == 1.0f) {
                            ((View)suo.E0).getLayoutParams().height = (int)suo.D0.getResources().getDimension(2131165948);
                        }
                        ((c)suo.E0).p(z7d.a().b(x2.p(), x2.getSize()));
                    }
                }
                return;
            }
            case 1: {
                final to3 to3 = (to3)this.E0;
                final niw niw = (niw)o;
                ((vbv)to3).R0.d((ym)mfg.b((Uri)null));
                ((u9)to3).F0.a();
                return;
            }
            case 0: {
                final jag jag = (jag)this.E0;
                final UserIdentifier userIdentifier = (UserIdentifier)o;
                if (((AppAccountManager)jag.c).h.size() == 0) {
                    PreferenceManager.getDefaultSharedPreferences(jag.a).edit().putBoolean("has_completed_signin_flow", false).apply();
                }
                jag.a(userIdentifier);
            }
        }
    }
}
