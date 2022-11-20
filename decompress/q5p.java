import android.app.Activity;
import java.util.List;
import java.util.Collections;
import android.content.Context;
import android.view.MenuItem;
import java.util.Objects;
import android.view.View$OnClickListener;
import android.view.Menu;
import android.os.Bundle;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q5p extends vbv implements uai<n5p>
{
    public final o5p X0;
    public final dap Y0;
    
    public q5p(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final o5p x0, final dap y0, final Bundle bundle, final t8p t8p) {
        super(intent, r8x, resources, kas, (pwe)pwe, jn, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, t8p);
        this.X0 = x0;
        this.Y0 = y0;
        ((u9)this).R4(x0.b.D0);
        if (bundle == null) {
            cbw.b((elm)x0.e.e("", "", "", "impression"));
        }
        f.i(r8x.d(), (n93)new csf((Object)this, 4));
        f.i(r8x.g(), (n93)new hg1((Object)this, 4));
    }
    
    public final boolean N2(final hai hai, final Menu menu) {
        super.N2(hai, menu);
        final dap y0 = this.Y0;
        final bai f4 = ((u9)this).F4();
        final v8p t0 = super.T0;
        y0.r = f4;
        final hai f5 = f4.f();
        jee.l((Object)f5);
        t0.k(f5, menu, 2131689481);
        f5.z(2131689531, menu);
        f5.z(2131689530, menu);
        f5.z(2131689543, menu);
        y0.p.b.R((Object)tmi.a).G((lj6)new y0p((Object)y0, 9), (lj6)jub.e);
        if (asa.b().b("search_features_bad_search_report_enabled", false)) {
            f5.z(2131689535, menu);
        }
        final String a = y0.b.a;
        y0.s = a;
        y0.a.s(a);
        f5.d().E(((r6f)y0.a).getView());
        y0.a.p((View$OnClickListener)new yag((Object)y0, (Object)t0, 2));
        final yso c = y0.c;
        final cap o = y0.o;
        final wso b = c.b;
        final xso xso = new xso(c, (lba)o);
        ((u2g)b).D0.b((lba)xso);
        if (!((u2g)b).H0) {
            ((u2g)b).E0.d(((u2g)b).F0, (Bundle)null, (r2g$a)b);
            ((u2g)b).H0 = true;
        }
        final Object g0 = ((u2g)b).G0;
        if (g0 != null) {
            xso.onEvent(g0);
        }
        return true;
    }
    
    public final int d2(final hai hai) {
        final dap y0 = this.Y0;
        final m7p m7p = y0.x.get(y0.b.q);
        final boolean b = m7p != null && m7p.a;
        if (y0.l.p()) {
            if (b) {
                final int[] z = dap.z;
                for (int i = 0; i < 7; ++i) {
                    final MenuItem item = hai.findItem(z[i]);
                    if (item != null) {
                        item.setVisible(false);
                    }
                }
            }
            else if (!y0.q.a()) {
                final MenuItem item2 = hai.findItem(2131430029);
                final MenuItem item3 = hai.findItem(2131430010);
                final MenuItem item4 = hai.findItem(2131430033);
                final MenuItem item5 = hai.findItem(2131430030);
                final String a = y0.b.a;
                final boolean containsKey = y0.c.a.containsKey(a.toLowerCase(m5s.d()));
                jee.l((Object)item2);
                item2.setVisible(containsKey ^ true);
                jee.l((Object)item3);
                item3.setVisible(containsKey);
                final UserIdentifier k = y0.l.k();
                if (p0f.m(nri.Companion, k, "userIdentifier", k, "android_notification_search_subscribe_enabled", false)) {
                    final k8p v = y0.v;
                    Objects.requireNonNull(v);
                    v.d.b(a).G((lj6)new gxw((Object)y0, (Object)item4, (Object)a, 1), (lj6)jub.e);
                }
                y0.h.e = item5;
            }
            else {
                final int[] y2 = dap.y;
                for (int j = 0; j < 5; ++j) {
                    final MenuItem item6 = hai.findItem(y2[j]);
                    if (item6 != null) {
                        item6.setVisible(false);
                    }
                }
            }
        }
        return 2;
    }
    
    public final boolean j4(final ym ym) {
        final n5p n5p = (n5p)ym;
        final o5p x0 = this.X0;
        final boolean equals = x0.d.a.equals(n5p.a);
        boolean b = false;
        boolean b2 = false;
        Label_0096: {
            if (equals) {
                final String c = n5p.c;
                if (!"spelling_expansion_revert_click".equalsIgnoreCase(c) && !"spelling_correction_revert_click".equalsIgnoreCase(c) && !"spelling_suggestion_click".equalsIgnoreCase(c)) {
                    b2 = true;
                    break Label_0096;
                }
            }
            b2 = false;
        }
        if (b2) {
            x0.b.F0.setCurrentItem(x0.c.a(n5p.h));
            b = true;
        }
        if (b) {
            super.T0.b();
        }
        return b;
    }
    
    public final boolean n(final MenuItem menuItem) {
        final dap y0 = this.Y0;
        final n5p b = y0.b;
        final String a = b.a;
        String s;
        if (ikr.g((CharSequence)b.b)) {
            s = b.b;
        }
        else {
            s = b.a;
        }
        final String n = y0.b.n;
        long b2 = 0L;
        final vso vso = y0.c.a.get(a.toLowerCase(m5s.d()));
        if (vso != null) {
            b2 = vso.b;
        }
        final int itemId = menuItem.getItemId();
        boolean b3 = false;
        boolean b5 = false;
        Label_0999: {
            Label_0992: {
                if (itemId == 2131430029) {
                    final lso d = y0.d;
                    final dap$a m = y0.m;
                    Objects.requireNonNull(d);
                    final bto bto = new bto((Context)d.a, d.b, a);
                    final trc d2 = d.d;
                    ((anm)bto).U((wv0$b)m);
                    d2.f((orc)bto);
                    cbw.b((elm)d.c.e("universal", "", "saved_search", "add"));
                }
                else if (itemId == 2131430010) {
                    final bo8 e = y0.e;
                    final dap$b n2 = y0.n;
                    Objects.requireNonNull(e);
                    final cto cto = new cto((Context)e.a, e.b, b2);
                    final trc d3 = e.d;
                    ((anm)cto).U((wv0$b)n2);
                    d3.f((orc)cto);
                    cbw.b((elm)e.c.e("universal", "", "saved_search", "remove"));
                }
                else if (itemId == 2131430034) {
                    final wtp f = y0.f;
                    Long value;
                    if (vso != null) {
                        value = vso.b;
                    }
                    else {
                        value = null;
                    }
                    f.c.b((Context)f.a, (cxp)new zxp(a, s, value, n), (bba)y7p.c, new btp(), (List)Collections.emptyList());
                    cbw.b((elm)f.b.e("universal", "", "query", "share_via"));
                }
                else if (itemId == 2131427762) {
                    final rg1 g = y0.g;
                    Objects.requireNonNull(g);
                    final int a2 = kr2.a;
                    final lr2 a3 = lr2.Companion.a();
                    final String string = ((Context)g.a).getResources().getString(2131957047);
                    final String j = da8.j("Bad search for [", a, "] from Android");
                    final StringBuilder i = fu8.j("Thanks for submitting a bad search!\n\nWhat (user, tweet, image, etc): \n\nExpected results: \n\nActual results: \n\n\n\n-------------------------\n\n");
                    i.append(a3.i());
                    i.append("\n\n");
                    i.append(dgv.a());
                    a3.a(string, j, i.toString(), false).G((lj6)new hoa(g, 7), (lj6)jub.e);
                }
                else if (itemId == 2131430030) {
                    final kv h = y0.h;
                    cbw.b((elm)h.b.c("filter_icon", "click"));
                    final qv$a qv$a = new qv$a(h.d);
                    qv$a.a = a;
                    final qv d4 = (qv)((n4j)qv$a).e();
                    h.d = d4;
                    h.a.d((Object)new sv(d4));
                    cbw.b((elm)h.b.c("", "impression"));
                }
                else {
                    if (itemId == 2131430032) {
                        final z7p t = y0.t;
                        if (t != null) {
                            final d8p k = y0.i;
                            final n5p b4 = y0.b;
                            Objects.requireNonNull(k);
                            czd.f((Object)b4, "searchActivityArgs");
                            k.a.d((ym)new b8p(t));
                            final af4 e2 = k.b.e("universal", "safe_search_settings", "", "impression");
                            ((u0p)e2).i((j0p)ze4.m(b4.j, b4.a, 12, b4.i, b4.o));
                            cbw.b((elm)e2);
                            break Label_0992;
                        }
                    }
                    if (itemId != 2131430033) {
                        b5 = false;
                        break Label_0999;
                    }
                    final k8p v = y0.v;
                    if (v.e.a((Activity)v.f, new kv8(2131957503, 2131957504, 2131952374, 2131957590), new kv8(2131957503, 2131957502, 2131952374, 2131957590))) {
                        final k8p v2 = y0.v;
                        final boolean u = y0.u;
                        Objects.requireNonNull(v2);
                        if (u) {
                            v2.d.a(a).D();
                            v2.b.a(menuItem, joc.G0.getDrawableRes());
                            v2.a.o(a, "notifications_subscribing", "click");
                        }
                        else {
                            v2.d.c(a).D();
                            v2.b.a(menuItem, joc.H0.getDrawableRes());
                            v2.a.o(a, "notifications_subscribe", "click");
                        }
                        v2.c.a(u, a);
                        y0.u ^= true;
                    }
                }
            }
            b5 = true;
        }
        if (b5 || super.n(menuItem)) {
            b3 = true;
        }
        return b3;
    }
}
