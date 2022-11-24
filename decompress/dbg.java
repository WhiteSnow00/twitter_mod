import com.twitter.app.common.account.AppAccountManager;
import com.twitter.media.ui.image.c;
import com.twitter.media.ui.image.AspectRatioFrameLayout;
import android.app.Activity;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.twitter.media.av.ui.ClosedCaptionsView;
import android.content.res.Resources;
import com.google.android.material.snackbar.Snackbar;
import android.view.View;
import android.preference.PreferenceManager;
import android.net.Uri;
import com.twitter.util.user.UserIdentifier;
import java.lang.ref.WeakReference;
import com.twitter.app.dm.DMConversationContentViewProvider;
import android.content.res.Resources$Theme;
import android.view.View$OnClickListener;
import java.util.List;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dbg implements rk6
{
    public final int F0;
    public final Object G0;
    
    public dbg(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void accept(Object b) {
        final int f0 = this.F0;
        final boolean b2 = false;
        boolean b3 = false;
        boolean b4 = true;
        switch (f0) {
            default: {
                final yf2 yf2 = (yf2)this.G0;
                final kni kni = (kni)b;
                yf2.b1.d();
                return;
            }
            case 28: {
                final bc2 bc2 = (bc2)this.G0;
                final kni kni2 = (kni)b;
                bc2.O1();
                return;
            }
            case 27: {
                final fi3 fi3 = (fi3)this.G0;
                final kni kni3 = (kni)b;
                fi3.K0.Y3();
                ((te3)fi3.M0).b();
                fi3.Q0.b();
                return;
            }
            case 26: {
                final od3 od3 = (od3)this.G0;
                final u6m u6m = (u6m)b;
                od3.I0.setPadding(u6m.a, 0, u6m.c, u6m.d);
                od3.N0.setPadding(u6m.a, 0, u6m.c, u6m.d);
                final u6m u6m2 = (u6m)od3.F0.b.f();
                int b5;
                if (u6m2 != null) {
                    b5 = u6m2.b;
                }
                else {
                    b5 = 0;
                }
                final beq g = beq.g(od3.G0.getWidth(), od3.G0.getHeight() - b5);
                od3.J0.setAspectRatio(Math.max(0.5625f, g.h()));
                if (u6m.d <= 0) {
                    b4 = false;
                }
                final View o0 = od3.O0;
                int visibility;
                if (b4) {
                    visibility = 0;
                }
                else {
                    visibility = 8;
                }
                o0.setVisibility(visibility);
                final int intValue = (int)od3.T0.a();
                final int n = g.b - ((View)od3.J0).getHeight() - u6m.d;
                if (od3.S0.C0() && n >= intValue) {
                    od3.H0.setPadding(0, b5, 0, 0);
                    od3.P0.setGuidelineEnd(n - intValue);
                }
                else {
                    final int max = Math.max(n / 2, 0);
                    od3.H0.setPadding(0, b5 + max, 0, 0);
                    od3.P0.setGuidelineEnd(max);
                }
                return;
            }
            case 25: {
                final RecyclerView recyclerView = (RecyclerView)this.G0;
                final u6m u6m3 = (u6m)b;
                ((View)recyclerView).setPadding(u6m3.a, 0, u6m3.c, u6m3.d);
                return;
            }
            case 24: {
                final o6m o6m = (o6m)this.G0;
                o6m.a.setTextColor(js4.b(o6m.c, o6m.d, (float)b));
                return;
            }
            case 23: {
                final w7g w7g = (w7g)this.G0;
                final kni kni4 = (kni)b;
                final znl l0 = w7g.L0;
                final noj b6 = noj.b;
                final int a = o5j.a;
                l0.onNext((Object)b6);
                return;
            }
            case 22: {
                final vc3$a vc3$a = (vc3$a)this.G0;
                final Throwable t = (Throwable)b;
                vc3$a.a();
                return;
            }
            case 21: {
                final ic3 ic3 = (ic3)this.G0;
                final boolean booleanValue = (boolean)b;
                Objects.requireNonNull(ic3);
                final UserIdentifier a2 = ic3.a;
                String s;
                if (booleanValue) {
                    s = "on";
                }
                else {
                    s = "off";
                }
                sbw.b((tlm)new fg4(a2, ic3.a("flash", s)));
                return;
            }
            case 20: {
                final p8x p8x = (p8x)this.G0;
                final kni kni5 = (kni)b;
                p8x.y1();
                return;
            }
            case 19: {
                final cyh$c cyh$c = (cyh$c)this.G0;
                final btm btm = (btm)b;
                if (cyh$c != null) {
                    if (btm.d()) {
                        final p4e p4e = (p4e)btm.c();
                        final ayh$a ayh$a = (ayh$a)cyh$c;
                        final ayh a3 = ayh$a.a;
                        ((List)a3.c).clear();
                        Objects.requireNonNull(p4e);
                        final p4e$b p4e$b = new p4e$b(p4e);
                        while (p4e$b.hasNext()) {
                            ((List<nxh>)a3.c).add(new nxh((cxh)((ohz)p4e$b).next()));
                        }
                        final ayh a4 = ayh$a.a;
                        final byh d = a4.d;
                        if (d != null) {
                            ((yxh)d).X4((List)a4.c);
                            ((u9)ayh$a.a.d).F4().invalidate();
                        }
                    }
                    else {
                        final mxh mxh = (mxh)btm.b();
                        final ayh$a ayh$a2 = (ayh$a)cyh$c;
                        final byh d2 = ayh$a2.a.d;
                        if (d2 != null) {
                            final qsk qsk = new qsk((Object)ayh$a2, 7);
                            final yxh yxh = (yxh)d2;
                            yxh.W4((cxh)null);
                            final View g2 = ((sml$a$b)((u9)yxh).c()).G0;
                            final Snackbar a5 = f6p.a(g2.getContext(), g2, (CharSequence)mxh.a, -2);
                            a5.k(((BaseTransientBottomBar)a5).b.getText(2131957162), (View$OnClickListener)qsk);
                            a5.l();
                        }
                    }
                }
                return;
            }
            case 18: {
                final hel hel = (hel)this.G0;
                final vgv vgv = (vgv)b;
                hel.S0.b(vgv.a, Integer.valueOf(vgv.b));
                return;
            }
            case 17: {
                final lt9 lt9 = (lt9)this.G0;
                final Throwable t2 = (Throwable)b;
                final int e2 = lt9.e2;
                lt9.o5();
                return;
            }
            case 16: {
                final noc noc = (noc)this.G0;
                final boolean booleanValue2 = (boolean)b;
                Objects.requireNonNull(noc);
                if (booleanValue2 && ita.b().b("subscriptions_blue_premium_labeling_htl_logo_replacement_enabled", false)) {
                    final rt3 b7 = noc.b;
                    final Resources resources = b7.F0.getResources();
                    final int drawableRes = jpc.H1.getDrawableRes();
                    final Resources$Theme theme = b7.F0.getContext().getTheme();
                    final ThreadLocal a6 = dsm.a;
                    b7.a(dsm$a.a(resources, drawableRes, theme));
                }
                else {
                    final rt3 b8 = noc.b;
                    final Resources resources2 = b8.F0.getResources();
                    final int drawableRes2 = jpc.G1.getDrawableRes();
                    final ThreadLocal a7 = dsm.a;
                    b8.a(dsm$a.a(resources2, drawableRes2, (Resources$Theme)null));
                }
                return;
            }
            case 15: {
                final ugg ugg = (ugg)this.G0;
                final zvj zvj = (zvj)b;
                Objects.requireNonNull(ugg);
                final Object a8 = ((z2j)zvj).a;
                vmw.g(a8);
                final xl1 xl1 = (xl1)a8;
                b = ((z2j)zvj).b;
                vmw.g(b);
                if ((int)b == ((dtj)ugg.b).l()) {
                    ugg.c.D(((dtj)ugg.b).l());
                }
                return;
            }
            case 14: {
                ((l3a)b).d((lfs)this.G0);
                return;
            }
            case 13: {
                final DMConversationContentViewProvider dmConversationContentViewProvider = (DMConversationContentViewProvider)this.G0;
                final hm7 hm7 = (hm7)b;
                final vnv j2 = dmConversationContentViewProvider.j2;
                if (j2 != null) {
                    Objects.requireNonNull(hm7);
                    hm7.u1 = new WeakReference(j2);
                }
                final ek7 ek7 = new ek7(dmConversationContentViewProvider);
                Objects.requireNonNull(hm7);
                hm7.v1 = new WeakReference(ek7);
                dmConversationContentViewProvider.X2.d((pnm)hm7);
                return;
            }
            case 12: {
                final rem rem = (rem)this.G0;
                final zvv zvv = (zvv)b;
                if (rem.T0) {
                    ((Activity)rem.G0).removeDialog(2);
                    rem.T0 = false;
                    if (((osc)zvv).T().b) {
                        rem.S4();
                    }
                    else {
                        ((Activity)rem.G0).showDialog(4);
                    }
                }
                return;
            }
            case 11: {
                final ove ove = (ove)this.G0;
                final kni kni6 = (kni)b;
                final nda<tlm> h = ove.h;
                final UserIdentifier current = UserIdentifier.getCurrent();
                final fg4 fg4 = new fg4();
                ((o1p)fg4).q(new String[] { "::::app_open_warm" });
                h.b(current, (tlm)fg4);
                return;
            }
            case 10: {
                final c8t c8t = (c8t)this.G0;
                final kni kni7 = (kni)b;
                c8t.g.b();
                return;
            }
            case 9: {
                final dqf dqf = (dqf)this.G0;
                final Float n2 = (Float)b;
                final rpf j3 = dqf.J0;
                final float floatValue = n2;
                if (n2 == 1.0f) {
                    b3 = true;
                }
                j3.e(floatValue, b3);
                return;
            }
            case 8: {
                final oyf oyf = (oyf)this.G0;
                final cyf$a cyf$a = (cyf$a)b;
                final View b9 = oyf.b;
                if (b9 != null) {
                    final int b10 = cyf$a.b;
                    if (b10 > 0) {
                        oyf.b.setTranslationY(-(b9.getHeight() / 2) - b10 * cyf$a.a / 2.0f);
                    }
                }
                return;
            }
            case 7: {
                final e1x e1x = (e1x)this.G0;
                final kni kni8 = (kni)b;
                e1x.g1 = true;
                e1x.i();
                return;
            }
            case 6: {
                final bwf bwf = (bwf)this.G0;
                final eyf eyf = (eyf)b;
                int n3 = b2 ? 1 : 0;
                if (bwf.x1.a()) {
                    n3 = (b2 ? 1 : 0);
                    if (eyf == eyf.F0) {
                        final zof z1 = bwf.z1;
                        n3 = (b2 ? 1 : 0);
                        if (z1 != null) {
                            n3 = (b2 ? 1 : 0);
                            if (z1.l) {
                                n3 = (b2 ? 1 : 0);
                                if (flr.g((CharSequence)z1.a)) {
                                    n3 = 1;
                                }
                            }
                        }
                    }
                }
                if (n3 != 0) {
                    final wcp v1 = bwf.v1;
                    final String a9 = bwf.z1.a;
                    Objects.requireNonNull(v1);
                    e0e.f((Object)a9, "eventId");
                    v1.b.e((Object)v1.a, (Object)a9).w((rtb)new pe5((stb)ycp.F0, 22)).D();
                }
                return;
            }
            case 5: {
                final cuf cuf = (cuf)this.G0;
                final qh3 style = (qh3)b;
                final ClosedCaptionsView r0 = cuf.R0;
                if (r0 != null) {
                    r0.setStyle(style);
                }
                return;
            }
            case 4: {
                final xqf xqf = (xqf)this.G0;
                final kni kni9 = (kni)b;
                xqf.d1.d();
                return;
            }
            case 3: {
                final oas oas = (oas)this.G0;
                final kni kni10 = (kni)b;
                if (oas.G0.P0.isEmpty()) {
                    final ak8 g3 = oas.G0;
                    final mas h2 = oas.H0;
                    if (h2.b.isEmpty()) {
                        h2.b = (List)h2.a.get();
                    }
                    g3.A(h2.b);
                }
                oas.G0.o2();
                return;
            }
            case 2: {
                final cid cid = (cid)this.G0;
                final mvo mvo = (mvo)b;
                final q4 i0 = cid.I0;
                if (i0 != null) {
                    final hps y2 = i0.b.e1.Y2();
                    Objects.requireNonNull(mvo);
                    if (y2 != null) {
                        final float c = fv0.c(y2.getSize().h());
                        ((AspectRatioFrameLayout)mvo.G0).setAspectRatio(c);
                        if (c == 1.0f) {
                            ((View)mvo.G0).getLayoutParams().height = (int)mvo.F0.getResources().getDimension(2131165948);
                        }
                        ((c)mvo.G0).p(b9d.a().b(y2.q(), y2.getSize()));
                    }
                }
                return;
            }
            case 1: {
                final sp3 sp3 = (sp3)this.G0;
                final cjw cjw = (cjw)b;
                ((kcv)sp3).T0.d((cn)fgg.b((Uri)null));
                ((u9)sp3).H0.a();
                return;
            }
            case 0: {
                final ebg ebg = (ebg)this.G0;
                final UserIdentifier userIdentifier = (UserIdentifier)b;
                if (((AppAccountManager)ebg.c).h.size() == 0) {
                    PreferenceManager.getDefaultSharedPreferences(ebg.a).edit().putBoolean("has_completed_signin_flow", false).apply();
                }
                ebg.a(userIdentifier);
            }
        }
    }
}
