import android.os.BaseBundle;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$c;
import java.util.List;
import com.twitter.ui.list.CustomizableSmoothScrollLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.fragment.app.p;
import com.twitter.android.liveevent.landing.timeline.di.view.LiveEventTimelineViewGraph;
import androidx.viewpager.widget.ViewPager$i;
import androidx.viewpager.widget.ViewPager$k;
import java.util.Objects;
import com.google.android.material.tabs.TabLayout$g;
import com.google.android.material.tabs.TabLayout$d;
import android.view.View;
import android.net.Uri;
import com.twitter.android.liveevent.landing.scribe.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzf extends p8x implements a, yyf, hlt
{
    public final tyf K0;
    public final fzf L0;
    public final g9s<ysj> M0;
    public final com.twitter.android.liveevent.landing.scribe.a N0;
    public final e39 O0;
    public final guf P0;
    public final com.twitter.android.liveevent.landing.refresh.a Q0;
    public final ttf R0;
    public final xyf S0;
    public final nyf T0;
    public Uri U0;
    public final gzf$a V0;
    public final gzf$b W0;
    
    public gzf(final k9x k9x, final duo duo, final fzf l0, final tyf k0, final g9s<ysj> m0, final com.twitter.android.liveevent.landing.scribe.a n0, final com.twitter.android.liveevent.landing.refresh.a q0, final guf guf, final ttf r0, final xyf s0, final cyf cyf, final vyf vyf, final nyf t0, final tuf tuf, final View view) {
        super(k9x);
        final e39 o0 = new e39();
        this.O0 = o0;
        this.V0 = new TabLayout$d(this) {
            public final gzf F0;
            
            public final void C2(final TabLayout$g tabLayout$g) {
                this.F0.I1(tabLayout$g.e, true);
            }
            
            public final void J0(final TabLayout$g tabLayout$g) {
                final gzf f0 = this.F0;
                final ysj c = ((zsj)f0.P0).C(tabLayout$g.e);
                final ysj x = ((zsj)f0.P0).x();
                if (c != null) {
                    if (x != null) {
                        final am1 m = c.m;
                        final int a = o5j.a;
                        final jyf jyf = (jyf)m;
                        final jyf jyf2 = (jyf)x.m;
                        final String r = jyf.r();
                        final String r2 = jyf2.r();
                        final com.twitter.android.liveevent.landing.scribe.a n0 = f0.N0;
                        final int e = tabLayout$g.e;
                        Objects.requireNonNull(n0);
                        final dda g = dda.g("live_event_timeline", "", r, "tab", "selected");
                        final ayf l = n0.l(r2);
                        l.g = e;
                        n0.o(g, (d1p)l.a());
                    }
                }
            }
            
            public final void K1(final TabLayout$g tabLayout$g) {
            }
        };
        final ViewPager$k w0 = new ViewPager$k(this) {
            public final gzf F0;
            
            public final void D(final int n) {
                this.F0.G1(n);
            }
        };
        this.W0 = w0;
        this.C1(((View)tuf).findViewById(2131427548));
        this.S0 = s0;
        this.L0 = l0;
        this.K0 = k0;
        this.Q0 = q0;
        k0.a = (tyf.a)this;
        this.M0 = m0;
        this.N0 = n0;
        this.R0 = r0;
        this.P0 = guf;
        this.T0 = t0;
        Objects.requireNonNull(vyf);
        vyf.a = (hlt)this;
        Objects.requireNonNull(cyf);
        s0.b = new gf8((Object)cyf, 12);
        l0.b.setAdapter((wuj)guf);
        l0.b.c((ViewPager$i)w0);
        l0.b.c((ViewPager$i)guf);
        ((TabLayout)l0.c).setupWithViewPager(l0.b);
        duo.a((gto<?>)new hzf(this));
        final t5j map = vq9.h((View)l0.b).map((rtb)new ei((stb)new ezf(l0), 4));
        e0e.e((Object)map, "fun onPagerLayoutChanged\u2026uts().map { pager }\n    }");
        o0.c(map.subscribe((rk6)new lem((Object)this, 7)));
    }
    
    public final myf E1() {
        myf f1;
        if (((zsj)this.P0).S() instanceof qyf) {
            f1 = this.F1((qyf)((zsj)this.P0).S());
        }
        else {
            f1 = null;
        }
        return f1;
    }
    
    public final myf F1(final qyf qyf) {
        Objects.requireNonNull(qyf);
        if (k5b.h((y2e)qyf)) {
            return ((LiveEventTimelineViewGraph)k5b.f((y2e)qyf)).k2();
        }
        return null;
    }
    
    public final void G1(int i) {
        final ysj c = ((zsj)this.P0).C(i);
        if (c == null) {
            return;
        }
        final am1 m = c.m;
        i = o5j.a;
        final jyf jyf = (jyf)m;
        final ttf r0 = this.R0;
        final String c2 = ((bts)jyf).c;
        String string;
        if ((string = ((BaseBundle)((am1)jyf).a).getString("hashtag")) == null) {
            string = "";
        }
        final String string2 = ((BaseBundle)((am1)jyf).a).getString("compose_semantic_core_id");
        final String r2 = jyf.r();
        final String string3 = ((BaseBundle)((am1)jyf).a).getString("compose_timeline_id");
        final String s = jyf.s();
        final String t = jyf.t();
        Objects.requireNonNull(r0);
        ((lhm)r0).a((Object)new u97(r2, c2, string, string2, string3, s, t));
        this.Q0.f = jyf.r();
        final myf e1 = this.E1();
        if (e1 != null) {
            final n7m k0 = ((idv)e1).a1.K0;
            final yki m2 = new yki();
            final RecyclerView$m layoutManager = k0.b.getLayoutManager();
            final CustomizableSmoothScrollLinearLayoutManager h = k0.h;
            i = 0;
            fj1.b(layoutManager == h);
            k0.h.m1 = (ehq)m2;
            while (i < ((zsj)this.P0).getCount()) {
                final ysj c3 = ((zsj)this.P0).C(i);
                if (c3 != null) {
                    final xl1 a = c3.a((p)((zsj)this.P0).O0);
                    if (a instanceof qyf) {
                        final myf f1 = this.F1((qyf)a);
                        if (f1 != null) {
                            ((idv)f1).a1.K0.a((onf$b)this.S0.a);
                        }
                    }
                }
                ++i;
            }
            ((idv)e1).h0((onf$b)this.S0.a);
        }
    }
    
    @Override
    public final void H0(final boolean b) {
        if (b) {
            final fzf l0 = this.L0;
            ((TabLayout)l0.c).setSelectedTabIndicatorHeight(l0.a.getDimensionPixelSize(2131166695));
        }
        else {
            ((TabLayout)this.L0.c).setSelectedTabIndicator(0);
        }
    }
    
    public final void I1(final int n, final boolean b) {
        final ysj c = ((zsj)this.P0).C(n);
        if (c == null) {
            return;
        }
        final xl1 a = c.a((p)((zsj)this.P0).O0);
        if (a instanceof qyf) {
            final myf f1 = this.F1((qyf)a);
            if (f1 != null) {
                ((idv)f1).X1(b);
            }
        }
    }
    
    public final void J1(final boolean b) {
        final xl1 s = ((zsj)this.P0).S();
        final boolean b2 = s instanceof qyf;
        final boolean b3 = false;
        int n;
        if (!b2) {
            n = (b3 ? 1 : 0);
        }
        else {
            final hnf e1 = ((idv)this.F1((qyf)s)).a1.E1();
            final xyf s2 = this.S0;
            Objects.requireNonNull(s2);
            n = (b3 ? 1 : 0);
            if (e1.c == 0) {
                n = (b3 ? 1 : 0);
                if (e1.b == 0) {
                    final gf8 b4 = s2.b;
                    n = (b3 ? 1 : 0);
                    if (b4 != null) {
                        b4.e();
                        n = 1;
                    }
                }
            }
        }
        if (n != 0) {
            return;
        }
        this.S0.c = true;
        this.I1(((zsj)this.P0).l(), b);
    }
    
    public final boolean X1(final boolean b) {
        this.J1(b);
        return true;
    }
    
    @Override
    public final void Y0(final boolean b) {
        if (b) {
            final fzf l0 = this.L0;
            ((View)l0.c).setVisibility(0);
            l0.d.setVisibility(8);
        }
        else {
            final fzf l2 = this.L0;
            ((View)l2.c).setVisibility(8);
            l2.d.setVisibility(0);
        }
    }
    
    @Override
    public final void l0() {
        final myf e1 = this.E1();
        if (e1 != null && ((xl1)((idv)e1).G0).T1) {
            e1.d1(2);
        }
    }
    
    @Override
    public final void n0(final int n) {
        final ysj c = ((zsj)this.P0).C(n);
        final TabLayout$g l = ((TabLayout)this.L0.c).l(n);
        if (c != null) {
            if (l != null) {
                l.e(this.M0.a((Object)c));
            }
        }
    }
    
    public final boolean n1() {
        final myf e1 = this.E1();
        return e1 != null && ((idv)e1).n1();
    }
    
    @Override
    public final void o1(final List<ysj> list, final String s) {
        this.T0.a = list.size();
        ((zsj)this.P0).A((List)list);
        int n = 0;
        Label_0071: {
            if (s != null && this.U0 == null) {
                n = this.P0.V(s);
                if (n >= 0) {
                    break Label_0071;
                }
            }
            else {
                final Uri u0 = this.U0;
                if (u0 != null) {
                    n = ((zsj)this.P0).u(u0);
                    break Label_0071;
                }
            }
            n = 0;
        }
        if (n != this.L0.b.getCurrentItem()) {
            this.L0.b.A(n, false);
        }
        this.G1(n);
        final guf p2 = this.P0;
        if (((zsj)p2).m() == null) {
            p2.D(n);
        }
        final fzf l0 = this.L0;
        final TabLayout$d v0 = (TabLayout$d)this.V0;
        Objects.requireNonNull(l0);
        e0e.f((Object)v0, "tabSelectedListener");
        ((TabLayout)l0.c).a((TabLayout$c)v0);
    }
    
    @Override
    public final void w1() {
        this.O0.a();
        final fzf l0 = this.L0;
        final ViewPager$k w0 = this.W0;
        final TabLayout$d v0 = (TabLayout$d)this.V0;
        Objects.requireNonNull(l0);
        e0e.f((Object)w0, "pageChangeListener");
        e0e.f((Object)v0, "tabSelectedListener");
        l0.b.w((ViewPager$i)w0);
        ((TabLayout)l0.c).p((TabLayout$c)v0);
    }
    
    public final boolean y0() {
        this.X1(true);
        return true;
    }
    
    public final boolean z0(final String s) {
        final int v = this.P0.V(s);
        if (v >= 0) {
            this.L0.b.setCurrentItem(v);
            return true;
        }
        return false;
    }
}
