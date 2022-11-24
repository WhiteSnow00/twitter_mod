import android.app.Activity;
import com.twitter.weaver.mvi.MviViewModel;
import android.view.View;
import android.net.Uri;
import android.content.Context;
import com.twitter.trustedfriends.TrustedFriendsMembersContentViewResult;
import com.twitter.android.liveevent.landing.header.a$a;
import com.twitter.android.liveevent.landing.scribe.a;
import com.twitter.android.qrcodes.QRCodeContentViewProvider;
import android.content.Intent;
import com.twitter.account.api.RemoveAccountDialogSuccess;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.twitter.longform.twitterarticles.ui.ProfileTwitterArticlesViewModel$b;
import com.twitter.longform.twitterarticles.ui.ProfileTwitterArticlesViewModel;
import android.view.Surface;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ppa implements rk6
{
    public final int F0;
    public final Object G0;
    
    public ppa(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void accept(final Object o) {
        final int f0 = this.F0;
        final boolean b = false;
        final boolean b2 = false;
        switch (f0) {
            default: {
                final z2x$d z2x$d = (z2x$d)this.G0;
                final vzv vzv = (vzv)o;
                z2x$d.d.e(false);
                return;
            }
            case 28: {
                final xi1 xi1 = (xi1)this.G0;
                final noj noj = (noj)o;
                Objects.requireNonNull(xi1);
                xi1.f((Surface)noj.h((Object)null));
                return;
            }
            case 26: {
                final kh2 kh2 = (kh2)this.G0;
                final noj noj2 = (noj)o;
                kh2.d();
                return;
            }
            case 25: {
                final vkk vkk = (vkk)this.G0;
                final kni kni = (kni)o;
                vkk.h();
                return;
            }
            case 24: {
                final ProfileTwitterArticlesViewModel profileTwitterArticlesViewModel = (ProfileTwitterArticlesViewModel)this.G0;
                final btm btm = (btm)o;
                final ape[] v0 = ProfileTwitterArticlesViewModel.V0;
                e0e.f((Object)profileTwitterArticlesViewModel, "this$0");
                if (btm.d()) {
                    ((MviViewModel)profileTwitterArticlesViewModel).Q((stb)new ProfileTwitterArticlesViewModel$b(btm));
                }
                else {
                    if (!((zbv)btm.b()).k()) {
                        final q6s$a q6s$a = new q6s$a();
                        q6s$a.e = (rfd$c)rfd$c$b.b;
                        q6s$a.q(74);
                        q6s$a.s(2131955479);
                        q6s$a.r("");
                        profileTwitterArticlesViewModel.R0.a((dgd)((z4j)q6s$a).e());
                    }
                    ((MviViewModel)profileTwitterArticlesViewModel).T((stb)new hgl(profileTwitterArticlesViewModel));
                }
                return;
            }
            case 23: {
                final upd upd = (upd)this.G0;
                final noj noj3 = (noj)o;
                Objects.requireNonNull(upd);
                upd.S1((hp6)noj3.c());
                upd.Q1();
                return;
            }
            case 22: {
                final bn8 bn8 = (bn8)this.G0;
                final bn8 bn9 = (bn8)o;
                bn8.a.run();
                bn8.f = false;
                return;
            }
            case 21: {
                final fs6 fs6 = (fs6)this.G0;
                final String s = (String)o;
                Objects.requireNonNull(fs6);
                final fg4 fg4 = new fg4(fs6.b.k());
                ((o1p)fg4).T = dda.g("tweet", "", "conversation_control_prompt", s, "click").toString();
                final int a = o5j.a;
                sbw.b((tlm)fg4);
                return;
            }
            case 20: {
                final zvl zvl = (zvl)this.G0;
                final qc6$a qc6$a = (qc6$a)o;
                Objects.requireNonNull(zvl);
                final hp6 b3 = qc6$a.b;
                zvl.P().setVisibility(8);
                if (!o5j.a((Object)zvl.M0, (Object)b3) || ((View)zvl.Q()).getVisibility() != 0) {
                    zvl.M0 = b3;
                    final tfu tfu = new tfu(true, (xzr)i71.c1, zvl.L0);
                    ((View)zvl.Q()).setVisibility(0);
                    zvl.Q().k(zvl.M0, (sfu)tfu, (Integer)null);
                }
                if (((ac6)zvl).J() && b3 != null && xi4.O(b3)) {
                    boolean mediaForwardEnabled = b2;
                    if (!((ac6)zvl).I().m()) {
                        mediaForwardEnabled = b2;
                        if (b3.l().e.isEmpty()) {
                            mediaForwardEnabled = true;
                        }
                    }
                    if (mediaForwardEnabled != zvl.Q().v1 && ((View)zvl.Q()).getVisibility() == 0) {
                        b1u.a((ViewGroup)((View)zvl.Q()).getParent(), (g0u)new e91(1));
                    }
                    zvl.Q().setMediaForwardEnabled(mediaForwardEnabled);
                }
                return;
            }
            case 19: {
                final d98 d98 = (d98)this.G0;
                if (!((qdw)o).g()) {
                    d98.b();
                }
                return;
            }
            case 18: {
                final lxw lxw = (lxw)this.G0;
                final kni kni2 = (kni)o;
                final ayw b4 = lxw.j1.b;
                if (b4 != null) {
                    b4.i.a();
                }
                return;
            }
            case 17: {
                final fi3 fi3 = (fi3)this.G0;
                final boolean booleanValue = (boolean)o;
                final ssa g1 = fi3.g1;
                if (booleanValue) {
                    fi3.E1();
                    fi3.L0.g();
                    fi3.M0.e();
                }
                else {
                    fi3.G1();
                    fi3.L0.c();
                    fi3.M0.f();
                }
                return;
            }
            case 16: {
                final se3 se3 = (se3)this.G0;
                final MotionEvent motionEvent = (MotionEvent)o;
                se3.J0.b(motionEvent);
                se3.N0.c(motionEvent);
                return;
            }
            case 15: {
                final he3 he3 = (he3)this.G0;
                final kni kni3 = (kni)o;
                if (he3.H0.P0().getAVPlayerAttachment() != null) {
                    he3.H0.h0();
                    he3.H0.P0().getAutoPlayableItem().j1();
                }
                return;
            }
            case 14: {
                ((b8g)this.G0).p((noj)o);
                return;
            }
            case 13: {
                final xc3 xc3 = (xc3)this.G0;
                final kni kni4 = (kni)o;
                Objects.requireNonNull(xc3);
                return;
            }
            case 12: {
                ((vc3)this.G0).O3((float)o);
                return;
            }
            case 11: {
                final iyh iyh = (iyh)this.G0;
                final kni kni5 = (kni)o;
                iyh.Z0.G2();
                return;
            }
            case 10: {
                final uax uax = (uax)this.G0;
                final yjh yjh = (yjh)o;
                Objects.requireNonNull(uax);
                if (yjh.b && yjh.c) {
                    final q6s$a q6s$a2 = new q6s$a();
                    q6s$a2.s(2131959203);
                    q6s$a2.q(9);
                    q6s$a2.e = (rfd$c)rfd$c$b.b;
                    q6s$a2.r("reply_unhidden");
                    uax.v1.a((q6s)((z4j)q6s$a2).e());
                }
                else {
                    uax.v1.b(2131959202);
                }
                return;
            }
            case 9: {
                final t9l t9l = (t9l)this.G0;
                final m8l$a$a m8l$a$a = (m8l$a$a)o;
                final Uri a2 = t9l.a4;
                Objects.requireNonNull(t9l);
                final be1 g2 = be1.G0;
                t9l.W2 = m8l$a$a.b;
                t9l.X2 = m8l$a$a.d;
                be1 a3;
                if (m8l.Companion.a(t9l.w2)) {
                    a3 = m8l$a$a.a;
                }
                else {
                    a3 = g2;
                }
                final tal x3 = t9l.x3;
                final be1 be1 = (be1)t9l.V2.e((Object)g2);
                Objects.requireNonNull(s8l.Companion);
                e0e.f((Object)a3, "newAvatarPresenceState");
                boolean b5 = b;
                if (be1 == g2) {
                    b5 = b;
                    if (shw.y0((Object[])new be1[] { be1.F0, be1.H0, be1.I0 }).contains(a3)) {
                        b5 = true;
                    }
                }
                x3.a(b5, a3, t9l.X2);
                t9l.V2.a((Object)a3);
                return;
            }
            case 8: {
                ((l3a)o).g((lfs)this.G0);
                return;
            }
            case 7: {
                final rem rem = (rem)this.G0;
                final qdw qdw = (qdw)o;
                Objects.requireNonNull(rem);
                if (!qdw.g()) {
                    ((Activity)rem.G0).removeDialog(1);
                    rem.U0 = false;
                    rem.H0.c((ho6)RemoveAccountDialogSuccess.INSTANCE);
                }
                return;
            }
            case 6: {
                ((ug1)this.G0).a.startActivity(Intent.createChooser((Intent)o, (CharSequence)null));
                return;
            }
            case 5: {
                final QRCodeContentViewProvider qrCodeContentViewProvider = (QRCodeContentViewProvider)this.G0;
                final Boolean b6 = (Boolean)o;
                Objects.requireNonNull(qrCodeContentViewProvider);
                if (b6) {
                    qrCodeContentViewProvider.b1.c();
                    ((View)qrCodeContentViewProvider.b1).setVisibility(0);
                    qrCodeContentViewProvider.a5();
                }
                else {
                    ehk.c().c(2131955566, 0);
                }
                return;
            }
            case 4: {
                final a a4 = (a)this.G0;
                final noj noj4 = (noj)o;
                final jca l = a.l;
                Objects.requireNonNull(a4);
                String b7;
                if (noj4.f()) {
                    b7 = ((opf)noj4.c()).b;
                }
                else {
                    b7 = null;
                }
                a4.h = b7;
                a4.g = null;
                return;
            }
            case 3: {
                ((a$a)this.G0).e0((uuf)o);
                return;
            }
            case 2: {
                ((bwf)this.G0).Z4((Throwable)o);
                return;
            }
            case 1: {
                ((ofq)this.G0).F0.a.setSlate((afq)o);
                return;
            }
            case 0: {
                final qpa$a qpa$a = (qpa$a)this.G0;
                final TrustedFriendsMembersContentViewResult trustedFriendsMembersContentViewResult = (TrustedFriendsMembersContentViewResult)o;
                final y6u h0 = qpa$a.H0;
                final View i0 = qpa$a.I0;
                final long restId = trustedFriendsMembersContentViewResult.getRestId();
                Objects.requireNonNull(h0);
                e0e.f((Object)i0, "view");
                i0.setTag((Object)"trusted_friends_fab_tooltip");
                final zl1 a5 = h0.a;
                final int n1 = njt.N1;
                final njt$b njt$b = new njt$b((Context)a5, "trusted_friends_fab_tooltip");
                njt$b.b(2131959092);
                njt$b.g = "trusted_friends_fab_tooltip";
                njt$b.k = null;
                njt$b.a(0);
                njt$b.d = (njt$c)new x6u(h0, restId);
                njt$b.h = 2131430230;
                njt$b.c(((dob)h0.a).P(), "trusted_friends_fab_tooltip");
                h0.e.b();
            }
        }
    }
}
