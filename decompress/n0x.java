import android.view.View$OnClickListener;
import com.twitter.android.liveevent.video.InvalidCarouselItemException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import com.twitter.media.av.autoplay.ui.VideoContainerHost;
import android.os.Build$VERSION;
import com.twitter.android.liveevent.video.VideoDataUnsupportedException;
import android.view.View;
import java.util.Objects;
import com.twitter.model.liveevent.LiveEventConfiguration;
import java.util.List;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n0x implements h0x$b, bjc, gjc$a
{
    public boolean D0;
    public final s0x E0;
    public final h0x F0;
    public final hxf G0;
    public final hvf H0;
    public final xm I0;
    public final djc J0;
    public final ouf K0;
    public final j2x L0;
    public final c5d M0;
    public final euf N0;
    public final Rect O0;
    public final opf P0;
    public final f0x Q0;
    public final puf R0;
    public final xtk<bzf> S0;
    public final w19 T0;
    public final w19 U0;
    public final w19 V0;
    public final gjc W0;
    public final wc6 X0;
    public final r8x Y0;
    public n0x.n0x$b Z0;
    public z3u a1;
    public hnk b1;
    public List<f2> c1;
    public boolean d1;
    public boolean e1;
    
    public n0x(final r8x y0, final s0x e0, final h0x f0, final hxf g0, final hvf h0, final xm i0, final djc j0, final ouf k0, final jto jto, final j2x l0, final f0x q0, final euf n0, final c5d m0, final opf p19, final LiveEventConfiguration liveEventConfiguration, final puf r0, final xtk<bzf> s0, final gjc w0, final xbm xbm) {
        this.D0 = false;
        this.O0 = new Rect();
        final w19 t0 = new w19();
        this.T0 = t0;
        this.U0 = new w19();
        this.V0 = new w19();
        final wc6 x0 = new wc6();
        this.X0 = x0;
        this.Z0 = (n0x.n0x$b)n0x.n0x$b.j0;
        final z3u f2 = z3u.F0;
        this.a1 = f2;
        this.b1 = new hnk();
        this.d1 = true;
        this.e1 = true;
        this.Y0 = y0;
        this.R0 = r0;
        this.E0 = e0;
        this.F0 = f0;
        this.P0 = p19;
        this.Q0 = q0;
        this.S0 = s0;
        this.W0 = w0;
        w0.c = (gjc$a)this;
        f0.j = (h0x$b)this;
        this.M0 = m0;
        this.N0 = n0;
        this.J0 = j0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.K0 = k0;
        this.L0 = l0;
        Objects.requireNonNull(r0);
        if (asa.b().b("live_event_video_initially_muted_enabled", false) && q0.e == z3u.D0) {
            z3u e2 = f2;
            if (liveEventConfiguration.shouldStartUnmuted()) {
                e2 = z3u.E0;
            }
            q0.e = e2;
        }
        f0.p = (ypa)new l0x((Object)this, 0);
        t0.c(jto.a((mso)new n0x$a(this)));
        e0.a(0);
        xbm.i((oj)new dt1((Object)this, 3));
        x0.d(new t19[] { y0.k().subscribe((lj6)new iag(this, 7)), y0.d().subscribe((lj6)new k0x(this, 0)), y0.g().subscribe((lj6)new z0p((Object)this, 6)), y0.o().subscribe((lj6)new y0p((Object)this, 7)), y0.b().subscribe((lj6)new hd1((Object)this, 6)) });
    }
    
    public final ynj<i5x> a() {
        ((View)this.E0.b).onWindowFocusChanged(true);
        return (ynj<i5x>)new ynj((Object)((sjj)this.M0).b((View)this.E0.b, this.O0));
    }
    
    public final void b(final bzf bzf) {
        final boolean apply = this.S0.apply((Object)bzf);
        final s0x e0 = this.E0;
        final int c = e0.c;
        e0.a(1);
        final h0x f0 = this.F0;
        final boolean c2 = f0.c();
        final bzf bzf2 = (bzf)f0.m.h((Object)null);
        final boolean b = c2 && ((bzf)f0.m.c()).getId().equals(bzf.getId());
        f0.m = new ynj((Object)bzf);
        if (bzf2 != null && f0.a.d(bzf2.getId())) {
            final oyw b2 = f0.a.b(bzf2.getId());
            if (b2 != null) {
                if (f0.h.apply((Object)bzf)) {
                    try {
                        b2.l((i1)bzf.e());
                    }
                    catch (final VideoDataUnsupportedException ex) {
                        f0.a.e(b2.i());
                        m8a.d((Throwable)ex);
                    }
                }
                else {
                    f0.a.e(b2.i());
                }
            }
        }
        if (f0.h.apply((Object)bzf)) {
            f0.n = ynj.b((Object)f0.a.b(((bzf)f0.m.c()).getId()));
        }
        if (b) {
            return;
        }
        this.V0.a();
        if (apply) {
            if (Build$VERSION.SDK_INT >= 26) {
                final wc6 x0 = this.X0;
                final h0x f2 = this.F0;
                Objects.requireNonNull(f2);
                x0.a(rw0.k(600L, (oj)new g0x(f2, 1)));
            }
            else {
                this.F0.f();
            }
            if (this.d1 && this.F0.n.f()) {
                this.G0.c.a.f(true, false, true);
                this.F0.h(this.d());
            }
            this.d1 = false;
        }
        final VideoContainerHost b3 = this.E0.b;
        final mxw$a d = bzf.d(this.P0.a);
        d.b = (mba)this.H0;
        d.f = (bv0)new bv0$a(1.7777778f);
        d.h = this.L0;
        d.e = (View$OnClickListener)new m0x((Object)this, 0);
        d.m = true;
        final mxw videoContainerConfig = (mxw)((n4j)d).e();
        this.U0.c(b3.getSubscriptionToAttachment().doOnDispose((oj)new cbk((Object)this, 3)).subscribe((lj6)new k0x(this, 1), (lj6)ff2.G0));
        ((View)b3).setVisibility(0);
        b3.setVideoContainerConfig(videoContainerConfig);
        this.i();
        if (!this.F0.b() && this.G0.c() && c != 0) {
            this.E0.b.getAutoPlayableItem().a1();
        }
        if (apply) {
            final gjc w0 = this.W0;
            w0.d = false;
            this.V0.c(w0.b.d().filter((ytk)new eu4((Object)w0, 12)).map((psb)new mf8((Object)w0, 0)).filter((ytk)a71.L0).map((psb)fjc.E0).map((psb)new ejc((Object)w0, 0)).distinctUntilChanged().skip(1L).filter((ytk)new fe8((Object)this, 11)).subscribe((lj6)new ydm((Object)this, 5)));
        }
        final xm i0 = this.I0;
        Objects.requireNonNull(i0);
        ((wgm)i0).a((Object)ynj.b((Object)bzf));
    }
    
    public final void c() {
        final w4 d = this.d();
        if (d != null) {
            final ArrayList c1 = this.c1;
            if (c1 != null) {
                d.e.Y((Collection)c1);
                this.c1.clear();
                this.c1 = null;
            }
        }
    }
    
    public final w4 d() {
        return this.E0.b.getAVPlayerAttachment();
    }
    
    public final boolean e(final int n) {
        boolean b = true;
        if (n != 1) {
            b = (n == 3 && b);
        }
        return b;
    }
    
    public final void f(final boolean b) {
        if (!this.F0.c()) {
            return;
        }
        this.E0.b.getAutoPlayableItem().a1();
        this.U0.a();
        final w4 d = this.d();
        if (d != null) {
            final euf n0 = this.N0;
            Objects.requireNonNull(n0);
            d.e.W((f2)n0.D0);
            n0.G0 = null;
        }
        this.E0.b.d();
        if (b && this.F0.b()) {
            this.F0.h(this.d());
        }
        final h0x f0 = this.F0;
        Objects.requireNonNull(f0);
        final ynj b2 = ynj.b;
        final int a = c5j.a;
        f0.m = b2;
    }
    
    public final void g() {
        this.k(true);
    }
    
    public final void h() {
        this.j();
        this.e1 = true;
        this.i();
    }
    
    public final void i() {
        if (this.P0.a) {
            this.F0.g(this.d());
        }
    }
    
    public final void j() {
        Objects.requireNonNull(this.R0);
        if (asa.b().b("live_event_video_initially_muted_enabled", false)) {
            final f0x q0 = this.Q0;
            q0.c.c(q0.b.c.map((psb)fjc.F0).subscribe((lj6)new hd1((Object)q0, 5)));
        }
    }
    
    public final void k(final boolean b) {
        this.T0.a();
        this.f(b);
        this.c();
        this.E0.b.d();
        this.F0.e();
        this.V0.a();
        final gjc w0 = this.W0;
        Objects.requireNonNull(w0);
        w0.c = (gjc$a)gjc$a.F;
        this.J0.c.dispose();
        this.Z0 = (n0x.n0x$b)n0x.n0x$b.j0;
    }
    
    public final void l() {
        final w4 d = this.d();
        this.b1 = new hnk(this.F0.a(d), d != null && d.b.m1);
    }
    
    public final void o(final boolean b) {
        if (this.e1) {
            final h0x f0 = this.F0;
            boolean b5 = false;
            Label_0137: {
                if (!f0.m.e()) {
                    final oyw b2 = f0.a.b(((bzf)f0.m.c()).getId());
                    if (b2 != null && b2.g.b) {
                        final pyw m = b2.m;
                        boolean b4 = false;
                        Label_0126: {
                            Label_0124: {
                                if (m != null) {
                                    final Iterator iterator = m.f.iterator();
                                    while (true) {
                                        while (iterator.hasNext()) {
                                            if (hea.class.isAssignableFrom((Class<?>)iterator.next())) {
                                                final boolean b3 = true;
                                                if (b3) {
                                                    b4 = true;
                                                    break Label_0126;
                                                }
                                                break Label_0124;
                                            }
                                        }
                                        final boolean b3 = false;
                                        continue;
                                    }
                                }
                            }
                            b4 = false;
                        }
                        if (!b4) {
                            b5 = true;
                            break Label_0137;
                        }
                    }
                }
                b5 = false;
            }
            if (b5) {
                this.J0.d = true;
                this.G0.b();
            }
        }
        this.e1 = false;
    }
    
    public final void p(final ll3 o) {
        final h0x f0 = this.F0;
        Objects.requireNonNull(f0);
        try {
            ynj ynj = null;
            Label_0087: {
                if (o.j == 3) {
                    final lnu g = o.g;
                    if (g != null) {
                        ynj = ynj.b((Object)f0.g.a.J0((xtk)new prf(g.a, 2)));
                        break Label_0087;
                    }
                }
                ynj = ynj.b;
                final int a = c5j.a;
            }
            final bzf a2 = f0.e.a(o, f0.c, ynj);
            if (!f0.m.f() || !((bzf)f0.m.c()).getId().equals(a2.getId())) {
                f0.j.b(a2);
            }
            f0.o = o;
        }
        catch (final InvalidCarouselItemException ex) {
            m8a.d((Throwable)ex);
        }
    }
}
