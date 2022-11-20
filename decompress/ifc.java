import android.view.MenuItem;
import com.twitter.database.schema.GlobalSchema;
import com.twitter.android.liveevent.landing.toolbar.a;
import com.twitter.app.dm.DMConversationContentViewProvider;
import android.widget.CompoundButton$OnCheckedChangeListener;
import java.io.Closeable;
import com.twitter.timeline.newtweetsbanner.BaseNewTweetsBannerPresenter;
import android.view.MotionEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ifc implements oj
{
    public final int D0;
    public final Object E0;
    
    public ifc(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void run() {
        final int d0 = this.D0;
        boolean b = true;
        switch (d0) {
            default: {
                final efv d2 = ((ga)this.E0).D0;
                if (d2 != null) {
                    final efv a = l48.a;
                    final vba$a companion = vba.Companion;
                    final String d3 = ((lzo)d2).d;
                    czd.e((Object)d3, "scribeAssociation.page");
                    final String e = ((lzo)d2).e;
                    czd.e((Object)e, "scribeAssociation.section");
                    final String f = ((lzo)d2).f;
                    czd.e((Object)f, "scribeAssociation.component");
                    cbw.b((elm)new af4(companion.e(d3, e, f, "dark_mode_switch", "cancel")));
                }
                return;
            }
            case 28: {
                final hzu hzu = (hzu)this.E0;
                czd.f((Object)hzu, "this$0");
                hzu.I0.a((MotionEvent)null);
                return;
            }
            case 27: {
                ((BaseNewTweetsBannerPresenter)this.E0).d();
                return;
            }
            case 26: {
                final y0k y0k = (y0k)this.E0;
                if (y0k != null) {
                    y0k.stop();
                }
                return;
            }
            case 25: {
                final z2b z2b = (z2b)this.E0;
                czd.f((Object)z2b, "this$0");
                final i2b k0 = z2b.K0;
                if (k0 != null) {
                    k0.c();
                }
                z2b.T0.a();
                return;
            }
            case 24: {
                final k7o k7o = (k7o)this.E0;
                czd.f((Object)k7o, "this$0");
                k7o.d.dispose();
                return;
            }
            case 23: {
                final uaq uaq = (uaq)this.E0;
                czd.f((Object)uaq, "this$0");
                h1e.Companion.b((Closeable)uaq);
                return;
            }
            case 22: {
                ((m74)this.E0).o0((CompoundButton$OnCheckedChangeListener)null);
                return;
            }
            case 21: {
                final fqi fqi = (fqi)this.E0;
                final fqi.b companion2 = fqi.Companion;
                czd.f((Object)fqi, "this$0");
                fqi.b.dispose();
                return;
            }
            case 20: {
                final t4i t4i = (t4i)this.E0;
                czd.f((Object)t4i, "this$0");
                t4i.n.a();
                return;
            }
            case 19: {
                ((lq0)this.E0).a(true);
                return;
            }
            case 18: {
                final ymc ymc = (ymc)this.E0;
                czd.f((Object)ymc, "this$0");
                ymc.d.f((taf)taf$p.a);
                return;
            }
            case 17: {
                final swa swa = (swa)this.E0;
                czd.f((Object)swa, "this$0");
                swa.c = true;
                swa.b.accept(b3g$a.a);
                return;
            }
            case 16: {
                final y51 y51 = (y51)this.E0;
                czd.f((Object)y51, "this$0");
                y51.o.dispose();
                return;
            }
            case 15: {
                final hm0 hm0 = (hm0)this.E0;
                czd.f((Object)hm0, "this$0");
                hm0.d.dispose();
                return;
            }
            case 14: {
                final jfq jfq = (jfq)this.E0;
                czd.f((Object)jfq, "this$0");
                jfq.c.dispose();
                return;
            }
            case 13: {
                final xr6 xr6 = (xr6)((gl7)this.E0).t1.get();
                if (xr6 != null) {
                    xr6.a();
                }
                return;
            }
            case 12: {
                final gnf gnf = (gnf)this.E0;
                czd.f((Object)gnf, "this$0");
                gnf.N0.dispose();
                return;
            }
            case 11: {
                final dh3 dh3 = (dh3)this.E0;
                if (dh3.F0 != z3u.E0) {
                    b = false;
                }
                if (b) {
                    dh3.F0 = z3u.F0;
                    if (dh3.E0) {
                        final eh3 h0 = dh3.H0;
                        final m4s a2 = hq1.a;
                        h0.F1(System.currentTimeMillis() - dh3.G0);
                    }
                }
                else {
                    dh3.b();
                }
                return;
            }
            case 10: {
                ((jhx)this.E0).b = false;
                return;
            }
            case 9: {
                final d9l d9l = (d9l)this.E0;
                final kgl x3 = d9l.X3;
                final hai g4 = ((u9)d9l).G4();
                jee.l((Object)g4);
                final cgv o1 = d9l.O1;
                final int a3 = d9l.a2;
                final boolean n1 = d9l.N1;
                final tu m2 = d9l.M2;
                final boolean n2 = d9l.N2;
                final boolean b2 = d9l.u2 == q19.K0;
                final boolean b3 = d9l.b2;
                final boolean c2 = d9l.c2;
                final int q2 = d9l.Q2;
                x3.e = ngl.z(n1, a3);
                x3.f = chw.Y(a3);
                x3.g = (chw.m0(a3) == Boolean.TRUE);
                final boolean h2 = chw.h0(a3);
                final boolean r = ngl.r(n1, o1, a3);
                x3.i = (o1 != null && !x3.f && ((n1 ^ true) & (r ^ true)));
                x3.j = (o1 != null && (o1.i1 & 0x80) == 0x0 && !n1);
                x3.k = (o1 != null && n1);
                x3.l = (o1 != null && !r && !n1);
                x3.m = (o1 != null && chw.d0(a3) && !h2);
                x3.h = chw.O0(a3);
                x3.n = (o1 != null && !n1);
                x3.o = (o1 != null && (ngl.A(a3, n1) && !ngl.A(a3, false)));
                final adw d4 = x3.d;
                x3.p = (fli.z0(d4, o1, m2) && !fli.A0(d4, o1, m2, n2));
                x3.c = (!r && !b2);
                x3.q = (o1 != null && n1);
                x3.a = (asa.e(x3.d.k()).b("topics_profile_entry_point_enabled", false) && !x3.e && !r && !n1 && !b2);
                x3.s = (o1 != null && n1 && asa.b().b("home_timeline_spheres_lists_youre_on_profile_shortcut_enabled", false));
                x3.r = (o1 != null && x3.l && asa.b().b("home_timeline_spheres_lists_theyre_on_profile_shortcut_enabled", false));
                x3.b = (b2 ^ true);
                final boolean t = asa.b().b("search_features_account_search_enabled", false) && !x3.e && !b2 && !r;
                x3.t = t;
                if (t && o1 != null && !x3.w) {
                    final af4 af4 = new af4();
                    ((u0p)af4).i((j0p)ze4.h(o1.D0, (uil)null, (h0p)null, a3, o1.i1));
                    ((u0p)af4).C = String.valueOf(o1.D0);
                    final int a4 = c5j.a;
                    ((u0p)af4).T = vba.g("profile", "", "", "search_icon", "impression").toString();
                    cbw.b((elm)af4);
                    x3.w = true;
                }
                final boolean b4 = true;
                x3.u = b3;
                x3.v = c2;
                cj1.f();
                final MenuItem item = g4.findItem(2131430034);
                jee.l((Object)item);
                item.setVisible(x3.b && !x3.v);
                final MenuItem item2 = g4.findItem(2131430005);
                jee.l((Object)item2);
                item2.setVisible(x3.a(x3.o));
                final MenuItem item3 = g4.findItem(2131429998);
                jee.l((Object)item3);
                item3.setVisible(x3.a(x3.i && !x3.e)).setTitle(2131959458);
                final MenuItem item4 = g4.findItem(2131430036);
                jee.l((Object)item4);
                item4.setVisible(x3.a(x3.l && !x3.e)).setTitle(2131955961);
                final MenuItem item5 = g4.findItem(2131430035);
                jee.l((Object)item5);
                final MenuItem setVisible = item5.setVisible(x3.a(x3.r || x3.s));
                int title;
                if (x3.s) {
                    title = 2131954730;
                }
                else {
                    title = 2131954727;
                }
                setVisible.setTitle(title);
                final MenuItem item6 = g4.findItem(2131430041);
                jee.l((Object)item6);
                item6.setVisible(x3.a(x3.m && x3.h && !x3.e));
                final MenuItem item7 = g4.findItem(2131430042);
                jee.l((Object)item7);
                item7.setVisible(x3.a(x3.m && !x3.h && !x3.e));
                final MenuItem item8 = g4.findItem(2131430014);
                jee.l((Object)item8);
                item8.setVisible(x3.a(x3.k));
                final MenuItem item9 = g4.findItem(2131430043);
                jee.l((Object)item9);
                item9.setVisible(x3.a(x3.j && x3.f && !x3.g));
                final MenuItem item10 = g4.findItem(2131430002);
                jee.l((Object)item10);
                item10.setVisible(x3.a(x3.j && (!x3.f || x3.g)));
                final MenuItem item11 = g4.findItem(2131430024);
                jee.l((Object)item11);
                item11.setVisible(x3.a(x3.g));
                final MenuItem item12 = g4.findItem(2131430025);
                jee.l((Object)item12);
                item12.setVisible(x3.a(x3.n));
                final MenuItem item13 = g4.findItem(2131430001);
                jee.l((Object)item13);
                item13.setVisible(x3.a(x3.p));
                final MenuItem item14 = g4.findItem(2131430037);
                jee.l((Object)item14);
                item14.setVisible(x3.a(x3.c && !x3.e && b4));
                final MenuItem item15 = g4.findItem(2131430023);
                jee.l((Object)item15);
                item15.setVisible(x3.a(x3.q));
                final MenuItem item16 = g4.findItem(2131430046);
                jee.l((Object)item16);
                item16.setVisible(x3.a(x3.a));
                final MenuItem item17 = g4.findItem(2131430031);
                jee.l((Object)item17);
                item17.setVisible(x3.a(x3.t));
                if (q2 != 0) {
                    g4.d().F(q2);
                }
                d9l.E2.c();
                return;
            }
            case 8: {
                ((ucv)this.E0).a1 = false;
                return;
            }
            case 7: {
                final fw7 fw7 = (fw7)this.E0;
                final fw7$g companion3 = fw7.Companion;
                czd.f((Object)fw7, "this$0");
                fw7.i.dispose();
                fw7.j.a();
                return;
            }
            case 6: {
                final DMConversationContentViewProvider dmConversationContentViewProvider = (DMConversationContentViewProvider)this.E0;
                final kca b5 = DMConversationContentViewProvider.B3;
                h28.a(((ucv)dmConversationContentViewProvider).G0).M().l0(dmConversationContentViewProvider.e1);
                return;
            }
            case 5: {
                final vm6 vm6 = (vm6)this.E0;
                czd.f((Object)vm6, "this$0");
                vm6.c();
                return;
            }
            case 4: {
                final b51 b6 = (b51)this.E0;
                final b51.b h3 = b6.h;
                if (h3 != null) {
                    ((bj0)h3).X4(b6.f, b6.g);
                }
                return;
            }
            case 3: {
                final jkg g5 = ((a1t)this.E0).g;
                if (g5 != null) {
                    g5.d();
                }
                return;
            }
            case 2: {
                final a a5 = (a)this.E0;
                czd.f((Object)a5, "this$0");
                a5.e.a();
                a5.c.e();
                return;
            }
            case 1: {
                final ioa$a ioa$a = (ioa$a)this.E0;
                ioa$a.E0.b(ejt.E0, new ftn.b("", 2131958392), ioa$a.G0, null, 2131430229, 0, 0);
                return;
            }
            case 0: {
                final mfc mfc = (mfc)this.E0;
                ((arm)mfc.Z0).H0.a();
                final gz8 i0 = ((arm)mfc.Z0).I0;
                if (i0 != null) {
                    i0.a();
                }
                final kqe g6 = ((arm)mfc.Z0).G0;
                if (g6 != null) {
                    g6.a();
                }
                cjh.c((two)((np1)mfc.a1).T()).b((Class)efc$b.class);
                mfc.Y0.b().y(gmw.H()).G((lj6)new jds((Object)mfc, 3), (lj6)jub.e);
            }
        }
    }
}
