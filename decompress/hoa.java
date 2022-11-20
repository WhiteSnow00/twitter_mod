import android.app.Activity;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import android.content.res.Resources;
import com.google.android.material.snackbar.Snackbar;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import com.twitter.trustedfriends.TrustedFriendsMembersContentViewResult;
import android.widget.Button;
import com.twitter.android.liveevent.landing.scribe.a;
import com.twitter.android.qrcodes.QRCodeContentViewProvider;
import android.content.Intent;
import java.lang.ref.WeakReference;
import com.twitter.app.dm.DMConversationContentViewProvider;
import android.content.res.Resources$Theme;
import android.view.View$OnClickListener;
import java.util.List;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hoa implements lj6
{
    public final int D0;
    public final Object E0;
    
    public hoa(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void accept(Object b) {
        switch (this.D0) {
            default: {
                final rhh rhh = (rhh)this.E0;
                final doo$b a = doo.a;
                czd.f((Object)rhh, "$watch");
                czd.e(b, "it");
                rhh.b(b);
                return;
            }
            case 28: {
                final w9w w9w = (w9w)this.E0;
                final cgv user = (cgv)b;
                w9w.K0.setUser(user);
                w9w.O0.l(user.D0, user.I1);
                w9w.P0.E0.setToggledOn(chw.d0(user.I1));
                return;
            }
            case 27: {
                final oj6 oj6 = (oj6)this.E0;
                final View view = (View)b;
                ((wv6)oj6).L1(oj6.q1, oj6.Y0, oj6.g1);
                return;
            }
            case 26: {
                ((TextView)b).setText((CharSequence)this.E0);
                return;
            }
            case 25: {
                final kf2 kf2 = (kf2)this.E0;
                final tmi tmi = (tmi)b;
                kf2.Z0.d();
                return;
            }
            case 24: {
                final ob2 ob2 = (ob2)this.E0;
                final tmi tmi2 = (tmi)b;
                ob2.O1();
                return;
            }
            case 23: {
                final eh3 eh3 = (eh3)this.E0;
                final tmi tmi3 = (tmi)b;
                eh3.I0.Y3();
                eh3.K0.c();
                eh3.O0.c();
                return;
            }
            case 22: {
                final pc3 pc3 = (pc3)this.E0;
                final h6m h6m = (h6m)b;
                pc3.G0.setPadding(h6m.a, 0, h6m.c, h6m.d);
                pc3.L0.setPadding(h6m.a, 0, h6m.c, h6m.d);
                final h6m h6m2 = (h6m)pc3.D0.b.f();
                int b2;
                if (h6m2 != null) {
                    b2 = h6m2.b;
                }
                else {
                    b2 = 0;
                }
                final edq g = edq.g(pc3.E0.getWidth(), pc3.E0.getHeight() - b2);
                pc3.H0.setAspectRatio(Math.max(0.5625f, g.h()));
                final boolean b3 = h6m.d > 0;
                final View m0 = pc3.M0;
                int visibility;
                if (b3) {
                    visibility = 0;
                }
                else {
                    visibility = 8;
                }
                m0.setVisibility(visibility);
                final int intValue = (int)pc3.R0.a();
                final int n = g.b - ((View)pc3.H0).getHeight() - h6m.d;
                if (pc3.Q0.C0() && n >= intValue) {
                    pc3.F0.setPadding(0, b2, 0, 0);
                    pc3.N0.setGuidelineEnd(n - intValue);
                }
                else {
                    final int max = Math.max(n / 2, 0);
                    pc3.F0.setPadding(0, b2 + max, 0, 0);
                    pc3.N0.setGuidelineEnd(max);
                }
                return;
            }
            case 21: {
                final RecyclerView recyclerView = (RecyclerView)this.E0;
                final h6m h6m3 = (h6m)b;
                ((View)recyclerView).setPadding(h6m3.a, 0, h6m3.c, h6m3.d);
                return;
            }
            case 20: {
                final b6m b6m = (b6m)this.E0;
                b6m.a.setTextColor(dr4.b(b6m.c, b6m.d, (float)b));
                return;
            }
            case 19: {
                final c7g c7g = (c7g)this.E0;
                final tmi tmi4 = (tmi)b;
                final nnl<ynj<p6g>> j0 = c7g.J0;
                final ynj b4 = ynj.b;
                final int a2 = c5j.a;
                j0.onNext((Object)b4);
                return;
            }
            case 18: {
                final xb3$a xb3$a = (xb3$a)this.E0;
                final Throwable t = (Throwable)b;
                xb3$a.a();
                return;
            }
            case 17: {
                final mb3 mb3 = (mb3)this.E0;
                final boolean booleanValue = (boolean)b;
                Objects.requireNonNull(mb3);
                final UserIdentifier a3 = mb3.a;
                String s;
                if (booleanValue) {
                    s = "on";
                }
                else {
                    s = "off";
                }
                cbw.b((elm)new af4(a3, mb3.a("flash", s)));
                return;
            }
            case 16: {
                final x7x x7x = (x7x)this.E0;
                final tmi tmi5 = (tmi)b;
                x7x.y1();
                return;
            }
            case 15: {
                final mxh$c mxh$c = (mxh$c)this.E0;
                final msm msm = (msm)b;
                if (mxh$c != null) {
                    if (msm.d()) {
                        final n3e n3e = (n3e)msm.c();
                        final kxh$a kxh$a = (kxh$a)mxh$c;
                        final kxh a4 = kxh$a.a;
                        ((List)a4.c).clear();
                        Objects.requireNonNull(n3e);
                        final n3e$b n3e$b = new n3e$b(n3e);
                        while (n3e$b.hasNext()) {
                            ((List<xwh>)a4.c).add(new xwh((mwh)((pgz)n3e$b).next()));
                        }
                        final kxh a5 = kxh$a.a;
                        final lxh d = a5.d;
                        if (d != null) {
                            ((ixh)d).X4((List<pwh>)a5.c);
                            ((u9)kxh$a.a.d).F4().invalidate();
                        }
                    }
                    else {
                        final wwh wwh = (wwh)msm.b();
                        final kxh$a kxh$a2 = (kxh$a)mxh$c;
                        final lxh d2 = kxh$a2.a.d;
                        if (d2 != null) {
                            final j1p j1p = new j1p((Object)kxh$a2, 6);
                            final ixh ixh = (ixh)d2;
                            ixh.W4(null);
                            final View e0 = ((gml$a$b)((u9)ixh).c()).E0;
                            final Snackbar a6 = l5p.a(e0.getContext(), e0, (CharSequence)wwh.a, -2);
                            a6.k(((BaseTransientBottomBar)a6).b.getText(2131957162), (View$OnClickListener)j1p);
                            a6.l();
                        }
                    }
                }
                return;
            }
            case 14: {
                final tdl tdl = (tdl)this.E0;
                final hgv hgv = (hgv)b;
                tdl.Q0.b(hgv.a, hgv.b);
                return;
            }
            case 13: {
                final ks9 ks9 = (ks9)this.E0;
                final Throwable t2 = (Throwable)b;
                final int c2 = ks9.c2;
                ks9.o5();
                return;
            }
            case 12: {
                final nnc nnc = (nnc)this.E0;
                final boolean booleanValue2 = (boolean)b;
                Objects.requireNonNull(nnc);
                if (booleanValue2 && asa.b().b("subscriptions_blue_premium_labeling_htl_logo_replacement_enabled", false)) {
                    final rs3 b5 = nnc.b;
                    final Resources resources = b5.D0.getResources();
                    final int drawableRes = joc.H1.getDrawableRes();
                    final Resources$Theme theme = b5.D0.getContext().getTheme();
                    final ThreadLocal a7 = orm.a;
                    b5.a(orm$a.a(resources, drawableRes, theme));
                }
                else {
                    final rs3 b6 = nnc.b;
                    final Resources resources2 = b6.D0.getResources();
                    final int drawableRes2 = joc.G1.getDrawableRes();
                    final ThreadLocal a8 = orm.a;
                    b6.a(orm$a.a(resources2, drawableRes2, (Resources$Theme)null));
                }
                return;
            }
            case 11: {
                final agg agg = (agg)this.E0;
                final kvj kvj = (kvj)b;
                Objects.requireNonNull(agg);
                final Object a9 = ((m2j)kvj).a;
                jee.l(a9);
                final sl1 sl1 = (sl1)a9;
                b = ((m2j)kvj).b;
                jee.l(b);
                if ((int)b == ((osj)agg.b).k()) {
                    agg.c.D(((osj)agg.b).k());
                }
                return;
            }
            case 10: {
                ((j2a)b).d((tes)this.E0);
                return;
            }
            case 9: {
                final DMConversationContentViewProvider dmConversationContentViewProvider = (DMConversationContentViewProvider)this.E0;
                final gl7 gl7 = (gl7)b;
                final jnv h2 = dmConversationContentViewProvider.h2;
                if (h2 != null) {
                    Objects.requireNonNull(gl7);
                    gl7.s1 = new WeakReference(h2);
                }
                final dj7 dj7 = new dj7(dmConversationContentViewProvider);
                Objects.requireNonNull(gl7);
                gl7.t1 = new WeakReference(dj7);
                dmConversationContentViewProvider.V2.d((anm)gl7);
                return;
            }
            case 8: {
                final cem cem = (cem)this.E0;
                final mvv mvv = (mvv)b;
                if (cem.R0) {
                    ((Activity)((u9)cem).E0).removeDialog(2);
                    cem.R0 = false;
                    if (((orc)mvv).T().b) {
                        cem.S4();
                    }
                    else {
                        ((Activity)((u9)cem).E0).showDialog(4);
                    }
                }
                return;
            }
            case 7: {
                ((rg1)this.E0).a.startActivity(Intent.createChooser((Intent)b, (CharSequence)null));
                return;
            }
            case 6: {
                final QRCodeContentViewProvider qrCodeContentViewProvider = (QRCodeContentViewProvider)this.E0;
                final Boolean b7 = (Boolean)b;
                Objects.requireNonNull(qrCodeContentViewProvider);
                if (b7) {
                    qrCodeContentViewProvider.Z0.c();
                    ((View)qrCodeContentViewProvider.Z0).setVisibility(0);
                    qrCodeContentViewProvider.a5();
                }
                else {
                    m1f.e().c(2131955566, 0);
                }
                return;
            }
            case 5: {
                final a a10 = (a)this.E0;
                final ynj ynj = (ynj)b;
                final cba l = a.l;
                Objects.requireNonNull(a10);
                String b8;
                if (ynj.f()) {
                    b8 = ((rof)ynj.c()).b;
                }
                else {
                    b8 = null;
                }
                a10.h = b8;
                a10.g = null;
                return;
            }
            case 4: {
                ((com.twitter.android.liveevent.landing.header.a.a)this.E0).e0((ztf)b);
                return;
            }
            case 3: {
                ((gvf)this.E0).Z4((Throwable)b);
                return;
            }
            case 2: {
                ((req)this.E0).D0.a.setSlate((deq)b);
                return;
            }
            case 1: {
                ((View)b).setOnClickListener((View$OnClickListener)new esk((Object)this.E0, 0));
                return;
            }
            case 0: {
                final ioa$a ioa$a = (ioa$a)this.E0;
                final TrustedFriendsMembersContentViewResult trustedFriendsMembersContentViewResult = (TrustedFriendsMembersContentViewResult)b;
                final f6u f0 = ioa$a.F0;
                final View g2 = ioa$a.G0;
                final long restId = trustedFriendsMembersContentViewResult.getRestId();
                Objects.requireNonNull(f0);
                czd.f((Object)g2, "view");
                g2.setTag((Object)"trusted_friends_fab_tooltip");
                final ul1 a11 = f0.a;
                final int l2 = vit.L1;
                final vit$b vit$b = new vit$b((Context)a11, "trusted_friends_fab_tooltip");
                vit$b.b(2131959092);
                vit$b.g = "trusted_friends_fab_tooltip";
                vit$b.k = null;
                vit$b.a(0);
                vit$b.d = (vit$c)new e6u(f0, restId);
                vit$b.h = 2131430229;
                vit$b.c(((cnb)f0.a).P(), "trusted_friends_fab_tooltip");
                f0.e.b();
            }
        }
    }
}
