import android.content.Context;
import android.content.res.Resources;
import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.twitter.android.liveevent.landing.carousel.d$a;
import java.util.Set;
import java.util.Iterator;
import android.view.View;
import android.view.View$OnClickListener;
import com.twitter.android.liveevent.landing.carousel.d;
import android.os.SystemClock;
import tv.periscope.model.b;
import com.twitter.util.user.UserIdentifier;
import java.util.HashSet;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import com.twitter.app.common.account.a;
import com.twitter.app.common.account.AppAccountManager;
import com.twitter.app.dm.DMConversationContentViewProvider;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vgd implements lj6
{
    public final int D0;
    public final Object E0;
    
    public vgd(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void accept(Object f) {
        final int d0 = this.D0;
        final boolean b = false;
        final int n = 0;
        switch (d0) {
            default: {
                ((trc)this.E0).f((orc)f);
                return;
            }
            case 28: {
                ((rgv)this.E0).g((w4)f);
                return;
            }
            case 27: {
                final xta xta = (xta)this.E0;
                final Boolean b2 = (Boolean)f;
                Objects.requireNonNull(xta);
                if (b2) {
                    synchronized (xta) {
                        xta.b.a();
                        return;
                    }
                }
                synchronized (xta) {
                    if (xta.c) {
                        final long n2 = asa.b().f("feature_switches_configs_wait_before_kill_minutes", 0);
                        if (n2 > 0L) {
                            final w19 b3 = xta.b;
                            final gwo h = gmw.H();
                            final TimeUnit minutes = TimeUnit.MINUTES;
                            final ar0 a = xta.a;
                            Objects.requireNonNull(a);
                            b3.c(f.f((oj)new pvt((Object)a, 8), n2, minutes, h).p());
                        }
                    }
                }
            }
            case 26: {
                final oj6 oj6 = (oj6)this.E0;
                final tmi tmi = (tmi)f;
                oj6.n1.a();
                final com.twitter.media.av.autoplay.ui.a p = oj6.p1;
                if (p != null) {
                    p.i();
                }
                return;
            }
            case 25: {
                final eh3 eh3 = (eh3)this.E0;
                final boolean booleanValue = (boolean)f;
                final kra e1 = eh3.e1;
                eh3.I1(booleanValue);
                return;
            }
            case 24: {
                final vc3 vc3 = (vc3)this.E0;
                final ynj ynj = (ynj)f;
                Objects.requireNonNull(vc3);
                if (ynj.f()) {
                    vc3.h1.d((ym)ynj.c());
                }
                vc3.m1.g();
                vc3.i1.a();
                return;
            }
            case 23: {
                final cc3 cc3 = (cc3)this.E0;
                final tmi tmi2 = (tmi)f;
                cc3.D0.c();
                return;
            }
            case 22: {
                ((mv1)this.E0).onNext((Object)f);
                return;
            }
            case 21: {
                final o1r o1r = (o1r)this.E0;
                final tmi tmi3 = (tmi)f;
                cbw.b((elm)o1r.c.b("retake", "click"));
                o1r.a.onNext((Object)tmi.a);
                return;
            }
            case 20: {
                ((nog$a)this.E0).b((Object)f);
                return;
            }
            case 19: {
                final c7g c7g = (c7g)this.E0;
                final tmi tmi4 = (tmi)f;
                c7g.F0.P2();
                return;
            }
            case 18: {
                ((htk)this.E0).z((boolean)f);
                return;
            }
            case 17: {
                ((gtk)this.E0).s = (List)f;
                return;
            }
            case 16: {
                final mb3 mb3 = (mb3)this.E0;
                final boolean booleanValue2 = (boolean)f;
                Objects.requireNonNull(mb3);
                String s;
                if (booleanValue2) {
                    s = "start";
                }
                else {
                    s = "stop";
                }
                f = new af4(mb3.a, mb3.a("hands_free_video", s));
                ((u0p)f).A();
                cbw.b((elm)f);
                return;
            }
            case 15: {
                final x7x x7x = (x7x)this.E0;
                final tmi tmi5 = (tmi)f;
                x7x.x1();
                return;
            }
            case 14: {
                final smc smc = (smc)this.E0;
                if (smc.F0.equals((Object)((adw)f).k())) {
                    rw0.d(gmw.x(), (oj)new q00((Object)smc, 7));
                }
                return;
            }
            case 13: {
                final wvb wvb = (wvb)this.E0;
                final tmi tmi6 = (tmi)f;
                wvb.o.a(((h5j)wvb.i.j).subscribe((lj6)new jds((Object)wvb, 18)));
                return;
            }
            case 12: {
                ((DMConversationContentViewProvider)this.E0).g1 = (String)f;
                return;
            }
            case 11: {
                final AppAccountManager appAccountManager = (AppAccountManager)this.E0;
                final List list = (List)f;
                final int i = AppAccountManager.i;
                Objects.requireNonNull(appAccountManager);
                cj1.f();
                final qjg$b qjg$b = new qjg$b(list.size() + 1);
                for (final a a2 : list) {
                    ((qjg)qjg$b).w((Object)a2.b, (Object)a2);
                }
                final Map map = (Map)((n4j)qjg$b).e();
                final Set b4 = muh.b((Collection)appAccountManager.h.keySet());
                ((AbstractSet)b4).removeAll(map.keySet());
                appAccountManager.h.e(map);
                final Iterator iterator2 = ((HashSet)b4).iterator();
                while (iterator2.hasNext()) {
                    appAccountManager.g.s((UserIdentifier)iterator2.next()).e();
                }
                final wew g = appAccountManager.g;
                final Set keySet = map.keySet();
                Objects.requireNonNull(g);
                cj1.f();
                final Iterator iterator3 = keySet.iterator();
                while (iterator3.hasNext()) {
                    g.t((UserIdentifier)iterator3.next());
                }
                return;
            }
            case 10: {
                final wi8 wi8 = (wi8)this.E0;
                final tmi tmi7 = (tmi)f;
                wi8.G2();
                return;
            }
            case 9: {
                final d5k d5k = (d5k)this.E0;
                final b b5 = (b)f;
                d5k.l0(b5);
                Long n3;
                if (b5.F()) {
                    n3 = b5.f;
                }
                else {
                    n3 = b5.h;
                }
                Long value = n3;
                if (n3 == null) {
                    value = 0L;
                }
                final long longValue = value;
                if (longValue > 0L) {
                    final String h2 = o1d.h(d5k.E0, longValue, true);
                    final n9c h3 = d5k.H0;
                    final String string = d5k.E0.getString(2131955674, new Object[] { h2 });
                    final o9c o9c = (o9c)h3;
                    o9c.K0.setText((CharSequence)string);
                    ((View)o9c.K0).setVisibility(0);
                }
                else {
                    ((o9c)d5k.H0).b();
                }
                if (b5.F()) {
                    ((o9c)d5k.H0).l(d5k.E0.getString(2131956440));
                    ((o9c)d5k.H0).i(d5k.M0);
                    ((o9c)d5k.H0).j(1);
                }
                else {
                    if (b5.n()) {
                        final long b6 = b5.b;
                        if (b6 > 0L) {
                            ((o9c)d5k.H0).l(yqs.q(d5k.E0, b6));
                            ((o9c)d5k.H0).i(d5k.L0);
                            ((o9c)d5k.H0).j(0);
                            return;
                        }
                    }
                    ((o9c)d5k.H0).l(d5k.E0.getString(2131954805));
                    ((o9c)d5k.H0).i(d5k.L0);
                    ((o9c)d5k.H0).j(0);
                }
                return;
            }
            case 8: {
                final bq2 bq2 = (bq2)this.E0;
                final tmi tmi8 = (tmi)f;
                final cp2 y0 = bq2.Y0;
                y0.m.a(op2.D0, up2.E0, y0.t);
                return;
            }
            case 7: {
                final adi adi = (adi)this.E0;
                final Boolean b7 = (Boolean)f;
                Objects.requireNonNull(adi);
                if (b7) {
                    adi.c = SystemClock.elapsedRealtime();
                }
                else {
                    final long n4 = SystemClock.elapsedRealtime() - adi.c;
                    final boolean b8 = asa.b().b("collect_network_info", false);
                    final boolean b9 = SystemClock.elapsedRealtime() - adi.b > 3600000L;
                    int n5 = n;
                    if (n4 > 30000L) {
                        n5 = 1;
                    }
                    final boolean j = sds.a().j();
                    if (b8 && j && b9 && n5 != 0) {
                        f = new wv0((zv0<Object>)new adi$a(n4));
                        ((wv0)f).L0 = Integer.MAX_VALUE;
                        final int a3 = c5j.a;
                        ((wv0)f).Q(7);
                        xv0.a().d((wv0)f);
                        adi.b = SystemClock.elapsedRealtime();
                    }
                    adi.c = 0L;
                }
                return;
            }
            case 6: {
                ((qa8)this.E0).b.setText((CharSequence)String.valueOf(f));
                return;
            }
            case 5: {
                final com.twitter.android.liveevent.landing.scribe.a a4 = (com.twitter.android.liveevent.landing.scribe.a)this.E0;
                final o87 o87 = (o87)f;
                final cba l = com.twitter.android.liveevent.landing.scribe.a.l;
                Objects.requireNonNull(a4);
                a4.i = o87.a;
                a4.e = o87.f;
                a4.f = o87.g;
                return;
            }
            case 4: {
                ((com.twitter.android.liveevent.landing.refresh.a)this.E0).e.X0((boolean)f);
                return;
            }
            case 3: {
                final d d2 = (d)this.E0;
                final y9a y9a = (y9a)f;
                Objects.requireNonNull(d2);
                final int h4 = y9a.h;
                if (h4 != -1) {
                    final d$a i2 = d2.I0;
                    final LinearLayoutManager g2 = i2.G0;
                    int n6 = b ? 1 : 0;
                    Label_1858: {
                        if (g2 != null) {
                            final int o88 = g2.o1();
                            final int s2 = i2.G0.s1();
                            if (h4 >= o88) {
                                n6 = (b ? 1 : 0);
                                if (h4 <= s2) {
                                    break Label_1858;
                                }
                            }
                            n6 = 1;
                        }
                    }
                    if (n6 != 0) {
                        final d$a i3 = d2.I0;
                        if (i3.G0 != null) {
                            final RecyclerView f2 = i3.F0;
                            if (f2 != null) {
                                ((View)f2).post((Runnable)new qrm((Object)i3, h4, 1));
                            }
                        }
                    }
                }
                final com.twitter.android.liveevent.landing.scribe.a o89 = d2.O0;
                final int h5 = y9a.h;
                final int size = y9a.g.getSize();
                o89.k = h5;
                o89.j = size;
                if (d2.P0 != y9a.g.getSize()) {
                    final com.twitter.android.liveevent.landing.scribe.a o90 = d2.O0;
                    Objects.requireNonNull(o90);
                    o90.o(vba.g("live_event_timeline", "", "", "", "carousel_impression"), (j0p)o90.m(o90.i));
                    d2.P0 = y9a.g.getSize();
                }
                return;
            }
            case 2: {
                ((brf.a)this.E0).b((jqf)f);
                return;
            }
            case 1: {
                final pyw pyw = (pyw)this.E0;
                final qgj qgj = (qgj)f;
                Objects.requireNonNull(pyw);
                final Activity d3 = qgj.D0;
                final Iterator<Class<? extends ul1>> iterator4 = pyw.e.iterator();
                while (true) {
                    while (iterator4.hasNext()) {
                        if (iterator4.next().isInstance(d3)) {
                            final boolean b10 = true;
                            if (b10) {
                                pyw.d.a((f59)new wjc(pyw.a));
                                pyw.g = true;
                            }
                            else if (pyw.g) {
                                pyw.d.a((f59)new i4q(pyw.a));
                                pyw.g = false;
                            }
                            return;
                        }
                    }
                    final boolean b10 = false;
                    continue;
                }
            }
            case 0: {
                final xgd xgd = (xgd)this.E0;
                final xgd$b xgd$b = (xgd$b)f;
                final g3 h6 = xgd.H0;
                final int a5 = c5j.a;
                String h7;
                if ((h7 = fww.class.cast(h6).H0) == null) {
                    h7 = "";
                }
                boolean b11 = false;
                Label_2279: {
                    if (xgd.J0 != null) {
                        final g3 h8 = xgd.H0;
                        if (h8 != null && y6.d(h8.v0()) && max.t(xgd.J0.b.c1) != null) {
                            b11 = true;
                            break Label_2279;
                        }
                    }
                    b11 = false;
                }
                if (b11) {
                    final Resources f3 = xgd.F0;
                    final w4 j2 = xgd.J0;
                    jee.l((Object)j2);
                    final g3 h9 = xgd.H0;
                    j2.e.k0((x1)new yxw(h9));
                    final h3 v0 = h9.v0();
                    jee.l((Object)v0);
                    final i1 c1 = j2.b.c1;
                    final Context context = xgd$b.a.getContext();
                    final m6f a6 = m6f.a();
                    final ka8 g3 = xgd.G0;
                    final uil k = max.l(xgd.I0, c1);
                    final bo6 t = max.t(c1);
                    jee.l((Object)t);
                    final xx0 e2 = j2.e;
                    final mba d4 = j2.d;
                    if (d4 instanceof zdc) {
                        f = ((zdc)d4).f();
                    }
                    else {
                        f = new efv();
                    }
                    final bn a7 = an.a();
                    final hp2 m0 = nza.M0(t, k);
                    jee.l((Object)m0);
                    final jhf k2 = gdi.a().k6();
                    final h3 v2 = h9.v0();
                    jee.l((Object)v2);
                    cj1.b(y6.d(v2));
                    f = new fe4(g3, (y1)e2, h9, v2, context, a7, m0, c1, (efv)f, k2, a6);
                    xgd$b.a.setOnClickListener((View$OnClickListener)f);
                    final int ordinal = ((Enum)v0.getType()).ordinal();
                    String s3;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    if (ordinal != 5) {
                                        ho0.z("Method should be called only for eligible CTA types");
                                        s3 = "";
                                    }
                                    else if (ikr.g((CharSequence)h7)) {
                                        s3 = f3.getString(2131952476, new Object[] { h7 });
                                    }
                                    else {
                                        s3 = f3.getString(2131952475);
                                    }
                                }
                                else if (ikr.g((CharSequence)h7)) {
                                    s3 = f3.getString(2131952468, new Object[] { h7 });
                                }
                                else {
                                    s3 = f3.getString(2131952467);
                                }
                            }
                            else if (ikr.g((CharSequence)h7)) {
                                s3 = f3.getString(2131952470, new Object[] { h7 });
                            }
                            else {
                                s3 = f3.getString(2131952469);
                            }
                        }
                        else if (ikr.g((CharSequence)h7)) {
                            s3 = f3.getString(2131952472, new Object[] { h7 });
                        }
                        else {
                            s3 = f3.getString(2131952471);
                        }
                    }
                    else if (ikr.g((CharSequence)h7)) {
                        s3 = f3.getString(2131952474, new Object[] { h7 });
                    }
                    else {
                        s3 = f3.getString(2131952473);
                    }
                    xgd$b.a(s3, h7);
                }
                else {
                    xgd$b.a(h7, h7);
                }
                xgd$b.b.L(fww.class.cast(xgd.H0).I0);
                ghd.c(new View[] { xgd$b.a });
            }
        }
    }
}
