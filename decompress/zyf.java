import android.os.BaseBundle;
import java.util.List;
import com.twitter.ui.list.CustomizableSmoothScrollLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.fragment.app.p;
import com.twitter.android.liveevent.landing.timeline.di.view.LiveEventTimelineViewGraph;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$k;
import java.util.Objects;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$d;
import android.view.View;
import android.net.Uri;
import com.twitter.android.liveevent.landing.scribe.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zyf extends e7x implements a, ryf, zjt
{
    public final myf H0;
    public final yyf I0;
    public final t7s<esj> J0;
    public final com.twitter.android.liveevent.landing.scribe.a K0;
    public final m29 L0;
    public final auf M0;
    public final com.twitter.android.liveevent.landing.refresh.a N0;
    public final mtf O0;
    public final qyf P0;
    public final gyf Q0;
    public Uri R0;
    public final zyf$a S0;
    public final zyf$b T0;
    
    public zyf(final z7x z7x, final sso sso, final yyf i0, final myf h0, final t7s<esj> j0, final com.twitter.android.liveevent.landing.scribe.a k0, final com.twitter.android.liveevent.landing.refresh.a n0, final auf auf, final mtf o0, final qyf p15, final vxf vxf, final oyf oyf, final gyf q0, final nuf nuf, final View view) {
        super(z7x);
        final m29 l0 = new m29();
        this.L0 = l0;
        this.S0 = new TabLayout$d() {
            public final void C2(final TabLayout.g g) {
                zyf.this.I1(g.e, true);
            }
            
            public final void J0(final TabLayout.g g) {
                final zyf c0 = zyf.this;
                final esj a = ((fsj)c0.M0).A(g.e);
                final esj w = ((fsj)c0.M0).w();
                if (a != null) {
                    if (w != null) {
                        final zl1 m = a.m;
                        final int a2 = w4j.a;
                        final cyf cyf = (cyf)m;
                        final cyf cyf2 = (cyf)w.m;
                        final String r = cyf.r();
                        final String r2 = cyf2.r();
                        final com.twitter.android.liveevent.landing.scribe.a k0 = c0.K0;
                        final int e = g.e;
                        Objects.requireNonNull(k0);
                        final nca g2 = nca.g("live_event_timeline", "", r, "tab", "selected");
                        final txf l = k0.l(r2);
                        l.g = e;
                        k0.o(g2, (szo)l.a());
                    }
                }
            }
            
            public final void K1(final TabLayout.g g) {
            }
        };
        final ViewPager$k t0 = new ViewPager$k() {
            public final void E(final int n) {
                zyf.this.G1(n);
            }
        };
        this.T0 = t0;
        this.C1(((View)nuf).findViewById(2131427548));
        this.P0 = p15;
        this.I0 = i0;
        this.H0 = h0;
        this.N0 = n0;
        h0.a = (myf.a)this;
        this.J0 = j0;
        this.K0 = k0;
        this.O0 = o0;
        this.M0 = auf;
        this.Q0 = q0;
        Objects.requireNonNull(oyf);
        oyf.a = (zjt)this;
        Objects.requireNonNull(vxf);
        p15.b = new ue8((Object)vxf, 12);
        i0.b.setAdapter((cuj)auf);
        i0.b.c((ViewPager.i)t0);
        i0.b.c((ViewPager.i)auf);
        ((TabLayout)i0.c).setupWithViewPager(i0.b);
        sso.a((vro)new azf(this));
        final b5j map = asy.T((View)i0.b).map((qtb)new di((rtb)new xyf(i0), 4));
        zzd.e((Object)map, "fun onPagerLayoutChanged\u2026uts().map { pager }\n    }");
        l0.c(map.subscribe((fk6)new gdm((Object)this, 7)));
    }
    
    public final fyf E1() {
        fyf f1;
        if (((fsj)this.M0).S() instanceof jyf) {
            f1 = this.F1((jyf)((fsj)this.M0).S());
        }
        else {
            f1 = null;
        }
        return f1;
    }
    
    public final fyf F1(final jyf jyf) {
        Objects.requireNonNull(jyf);
        if (jhd.g((t2e)jyf)) {
            return ((LiveEventTimelineViewGraph)jhd.d((t2e)jyf)).k2();
        }
        return null;
    }
    
    public final void G1(int i) {
        final esj a = ((fsj)this.M0).A(i);
        if (a == null) {
            return;
        }
        final zl1 m = a.m;
        i = w4j.a;
        final cyf cyf = (cyf)m;
        final mtf o0 = this.O0;
        final String c = ((qrs)cyf).c;
        String string;
        if ((string = ((BaseBundle)((zl1)cyf).a).getString("hashtag")) == null) {
            string = "";
        }
        final String string2 = ((BaseBundle)((zl1)cyf).a).getString("compose_semantic_core_id");
        final String r = cyf.r();
        final String string3 = ((BaseBundle)((zl1)cyf).a).getString("compose_timeline_id");
        final String s = cyf.s();
        final String t = cyf.t();
        Objects.requireNonNull(o0);
        ((ggm)o0).a((Object)new k97(r, c, string, string2, string3, s, t));
        this.N0.f = cyf.r();
        final fyf e1 = this.E1();
        if (e1 != null) {
            final k6m h0 = ((acv)e1).X0.H0;
            final eki j1 = new eki();
            final RecyclerView$m layoutManager = h0.b.getLayoutManager();
            final CustomizableSmoothScrollLinearLayoutManager h2 = h0.h;
            i = 0;
            ij1.b(layoutManager == h2);
            h0.h.j1 = (pfq)j1;
            while (i < ((fsj)this.M0).getCount()) {
                final esj a2 = ((fsj)this.M0).A(i);
                if (a2 != null) {
                    final wl1 a3 = a2.a((p)((fsj)this.M0).L0);
                    if (a3 instanceof jyf) {
                        final fyf f1 = this.F1((jyf)a3);
                        if (f1 != null) {
                            ((acv)f1).X0.H0.a((gnf$b)this.P0.a);
                        }
                    }
                }
                ++i;
            }
            ((acv)e1).h0((gnf$b)this.P0.a);
        }
    }
    
    @Override
    public final void H0(final boolean b) {
        if (b) {
            final yyf i0 = this.I0;
            ((TabLayout)i0.c).setSelectedTabIndicatorHeight(i0.a.getDimensionPixelSize(2131166695));
        }
        else {
            ((TabLayout)this.I0.c).setSelectedTabIndicator(0);
        }
    }
    
    public final void I1(final int n, final boolean b) {
        final esj a = ((fsj)this.M0).A(n);
        if (a == null) {
            return;
        }
        final wl1 a2 = a.a((p)((fsj)this.M0).L0);
        if (a2 instanceof jyf) {
            final fyf f1 = this.F1((jyf)a2);
            if (f1 != null) {
                ((acv)f1).X1(b);
            }
        }
    }
    
    public final void J1(final boolean b) {
        final wl1 s = ((fsj)this.M0).S();
        final boolean b2 = s instanceof jyf;
        final boolean b3 = false;
        int n;
        if (!b2) {
            n = (b3 ? 1 : 0);
        }
        else {
            final zmf e1 = ((acv)this.F1((jyf)s)).X0.E1();
            final qyf p = this.P0;
            Objects.requireNonNull(p);
            n = (b3 ? 1 : 0);
            if (e1.c == 0) {
                n = (b3 ? 1 : 0);
                if (e1.b == 0) {
                    final ue8 b4 = p.b;
                    n = (b3 ? 1 : 0);
                    if (b4 != null) {
                        b4.n();
                        n = 1;
                    }
                }
            }
        }
        if (n != 0) {
            return;
        }
        this.P0.c = true;
        this.I1(((fsj)this.M0).k(), b);
    }
    
    public final boolean X1(final boolean b) {
        this.J1(b);
        return true;
    }
    
    @Override
    public final void Y0(final boolean b) {
        if (b) {
            final yyf i0 = this.I0;
            ((View)i0.c).setVisibility(0);
            i0.d.setVisibility(8);
        }
        else {
            final yyf i2 = this.I0;
            ((View)i2.c).setVisibility(8);
            i2.d.setVisibility(0);
        }
    }
    
    @Override
    public final void k0() {
        final fyf e1 = this.E1();
        if (e1 != null && ((wl1)((acv)e1).D0).Q1) {
            ((mts)e1).d1(2);
        }
    }
    
    @Override
    public final void n0(final int n) {
        final esj a = ((fsj)this.M0).A(n);
        final TabLayout.g l = ((TabLayout)this.I0.c).l(n);
        if (a != null) {
            if (l != null) {
                l.e(this.J0.a((Object)a));
            }
        }
    }
    
    public final boolean n1() {
        final fyf e1 = this.E1();
        return e1 != null && ((acv)e1).n1();
    }
    
    @Override
    public final void o1(final List<esj> list, final String s) {
        this.Q0.a = list.size();
        ((fsj)this.M0).z((List)list);
        int n = 0;
        Label_0071: {
            if (s != null && this.R0 == null) {
                n = this.M0.V(s);
                if (n >= 0) {
                    break Label_0071;
                }
            }
            else {
                final Uri r0 = this.R0;
                if (r0 != null) {
                    n = ((fsj)this.M0).t(r0);
                    break Label_0071;
                }
            }
            n = 0;
        }
        if (n != this.I0.b.getCurrentItem()) {
            this.I0.b.A(n, false);
        }
        this.G1(n);
        final auf m0 = this.M0;
        if (((fsj)m0).l() == null) {
            m0.E(n);
        }
        final yyf i0 = this.I0;
        final TabLayout$d s2 = (TabLayout$d)this.S0;
        Objects.requireNonNull(i0);
        zzd.f((Object)s2, "tabSelectedListener");
        ((TabLayout)i0.c).a((TabLayout.c)s2);
    }
    
    @Override
    public final void w1() {
        this.L0.a();
        final yyf i0 = this.I0;
        final ViewPager$k t0 = this.T0;
        final TabLayout$d s0 = (TabLayout$d)this.S0;
        Objects.requireNonNull(i0);
        zzd.f((Object)t0, "pageChangeListener");
        zzd.f((Object)s0, "tabSelectedListener");
        i0.b.w((ViewPager.i)t0);
        ((TabLayout)i0.c).p((TabLayout.c)s0);
    }
    
    public final boolean y0() {
        this.X1(true);
        return true;
    }
    
    public final boolean z0(final String s) {
        final int v = this.M0.V(s);
        if (v >= 0) {
            this.I0.b.setCurrentItem(v);
            return true;
        }
        return false;
    }
}
