import java.util.HashSet;
import java.util.List;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.Iterator;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$e;
import android.content.res.Resources$NotFoundException;
import android.media.SoundPool;
import androidx.recyclerview.widget.RecyclerView$g;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewStub;
import android.view.ViewGroup;
import android.view.ContextThemeWrapper;
import java.util.LinkedHashSet;
import android.app.Activity;
import android.view.LayoutInflater;
import android.content.Context;
import java.util.Set;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lcv<T> extends e7x implements xzt, pca<ljf<T>>
{
    public final k6m H0;
    public boolean I0;
    public final View J0;
    public final lcv.lcv$e K0;
    public final Set<lcv.lcv$c> L0;
    public final Set<lcv.lcv$d> M0;
    public final Context N0;
    public final y2a O0;
    public final t2p P0;
    public final zml<ljf<T>> Q0;
    public l4e<T> R0;
    public fjg S0;
    public ctj T0;
    public n0s U0;
    public n0s$a V0;
    
    public lcv(final z7x z7x, final ibm ibm, final c5w c5w, final LayoutInflater layoutInflater, final Activity activity, final lcv.lcv$b lcv$b, final zkf zkf) {
        super(z7x);
        this.I0 = true;
        this.L0 = new LinkedHashSet();
        this.M0 = (iuh$a)iuh.a(2);
        this.Q0 = (zml<ljf<T>>)new zml();
        this.N0 = ((Context)activity).getApplicationContext();
        View view;
        if (lcv$b.h != 0) {
            view = LayoutInflater.from((Context)new ContextThemeWrapper((Context)activity, lcv$b.h)).inflate(lcv$b.c, (ViewGroup)null, false);
        }
        else {
            view = layoutInflater.inflate(lcv$b.c, (ViewGroup)null, false);
        }
        this.C1(view);
        final ViewStub viewStub = (ViewStub)view.findViewById(2131429783);
        final int e = lcv$b.e;
        if (viewStub != null) {
            viewStub.setLayoutResource(lcv$b.d);
            viewStub.setInflatedId(e);
            viewStub.inflate();
        }
        final k6m h0 = new k6m((Context)activity, (RecyclerView)view.findViewById(e));
        this.H0 = h0;
        final RecyclerView b = h0.b;
        if (lcv$b.k) {
            h0.q();
        }
        ((View)b).setScrollbarFadingEnabled(true);
        ((View)b).post((Runnable)new o20((Object)b, 12));
        this.O0 = new y2a((Context)activity, c5w, lcv$b.b, view);
        final lcv$a lcv$a = new lcv$a(this);
        final k6m$c m = h0.m;
        if (m != null) {
            m.y((RecyclerView$g)new k6m$b((gnf$a)lcv$a));
        }
        else {
            ((List<gnf$a>)h0.e).add((gnf$a)lcv$a);
        }
        final ViewStub viewStub2 = (ViewStub)view.findViewById(2131429777);
        if (viewStub2 != null) {
            final View viewById = view.findViewById(2131429776);
            if (viewById != null) {
                ((ViewGroup)viewById.getParent()).removeView(viewById);
            }
            viewStub2.setLayoutResource(zkf.a);
            this.J0 = viewStub2.inflate();
        }
        else {
            this.J0 = view.findViewById(2131429776);
        }
        this.P0 = lcv$b.j;
        final int f = lcv$b.f;
        final int g = lcv$b.g;
        View inflate;
        if (f != 0) {
            inflate = layoutInflater.inflate(f, (ViewGroup)null);
        }
        else {
            inflate = null;
        }
        View inflate2;
        if (g != 0) {
            inflate2 = layoutInflater.inflate(g, (ViewGroup)null);
        }
        else {
            inflate2 = null;
        }
        this.T0 = new ctj((gnf)h0, ibm, inflate, inflate2);
        if (lcv$b.i) {
            final n0s u0 = new n0s((Context)activity, (gnf)h0);
            this.U0 = u0;
            u0.b = (n0s$a)new fj4((Object)this, 15);
        }
        if (dta.b().b("home_timeline_scroll_framerate_enabled", false)) {
            h0.c((gnf$b)(this.K0 = new lcv.lcv$e(this, lcv$b.a)));
        }
        else {
            this.K0 = null;
        }
        final rd6 rd6 = new rd6(new j29[] { z7x.g().subscribe((fk6)new ocs((Object)this, 15)), z7x.b().subscribe((fk6)new tag((Object)this, 18)) });
        final View j0 = this.J0;
        if (j0 != null) {
            j0.setVisibility(8);
            rd6.d(new j29[] { z7x.d().subscribe((fk6)new i0p((Object)this, 17)), z7x.g().subscribe((fk6)new k0p((Object)this, 13)) });
        }
        ibm.i((rj)new eve(rd6, 3));
    }
    
    public final zmf E1() {
        return this.J1(this.H0.v());
    }
    
    public final int F1() {
        int a;
        if (this.L1()) {
            a = ((y4e)this.G1()).a();
        }
        else {
            a = 0;
        }
        return a;
    }
    
    public final l4e<T> G1() {
        if (this.L1()) {
            return this.R0;
        }
        throw new IllegalStateException("The item provider has not been set.");
    }
    
    public final int I1(final long n) {
        if (dta.c().b("android_optimize_position_restoration_lookup", false)) {
            final l4e<T> r0 = this.R0;
            if (r0 != null && r0.c() && this.R0.f() instanceof ykd) {
                int e = ((ykd)this.R0.f()).e(n);
                if (e == -1) {
                    e = -1;
                }
                return e;
            }
        }
        return this.H0.e(n);
    }
    
    public final zmf J1(final dnf dnf) {
        final int d = this.H0.d();
        final int a = dnf.a;
        int n = 0;
        int n2 = 0;
        Label_0097: {
            if (a >= 0) {
                if (a >= d) {
                    n = dnf.b;
                    n2 = a;
                    break Label_0097;
                }
                if (this.P0.a) {
                    final View child = ((ViewGroup)this.H0.b).getChildAt(d - a);
                    n2 = d;
                    if (child != null) {
                        n = child.getTop();
                        n2 = d;
                    }
                    break Label_0097;
                }
            }
            n2 = -1;
        }
        long t;
        if (n2 > -1) {
            t = this.H0.t(n2);
        }
        else {
            t = -1L;
        }
        return new zmf(t, n, n2);
    }
    
    public final boolean L1() {
        return this.R0 != null;
    }
    
    public final void N(final int n) {
        this.c().getView().setTranslationY((float)n);
    }
    
    public final void N1() {
        final View j0 = this.J0;
        if (j0 != null && this.I0) {
            j0.setVisibility(8);
            final l4e<T> r0 = this.R0;
            final boolean b = r0 != null && r0.c() && hr4.a((Iterable)this.R0.f(), (Class)aov.class);
            final boolean b2 = this.O1() || b;
            if (!b2) {
                ((View)this.H0.b).setVisibility(0);
            }
            this.O0.b(b2);
        }
    }
    
    public final boolean O1() {
        return this.H0.y();
    }
    
    public final void Q1() {
        if (this.L1() && this.G1().c()) {
            this.N1();
        }
        else {
            this.a2();
        }
    }
    
    public final void R1(final int n) {
        if (!super.G0 && wau.c().e("sound_effects", true)) {
            if (this.S0 == null) {
                final Context n2 = this.N0;
                synchronized (fjg.class) {
                    final Context applicationContext = n2.getApplicationContext();
                    if (fjg.e == null) {
                        fjg.e = new fjg(applicationContext);
                        nds.a((Class)fjg.class);
                    }
                    final fjg e = fjg.e;
                    if (e.d == 0) {
                        try {
                            final SoundPool b = new SoundPool(2, 5, 0);
                            e.c = new int[] { b.load(applicationContext, 2131886113, 1), b.load(applicationContext, 2131886114, 1) };
                            e.b = b;
                        }
                        catch (final Resources$NotFoundException ex) {
                            e9a.d(new Throwable("Failed to load sound", (Throwable)ex));
                        }
                    }
                    ++e.d;
                    monitorexit(fjg.class);
                    this.S0 = e;
                }
            }
            final fjg s0 = this.S0;
            if (s0.b != null && !s0.a.isMusicActive()) {
                s0.b.play(s0.c[n], 1.0f, 1.0f, 0, 0, 1.0f);
            }
        }
    }
    
    @Deprecated
    public final <ADAPTER extends cz5<T> & zdc<T>> void S1(final ADAPTER adapter) {
        this.Z1((RecyclerView$e)new ez5((cz5)adapter), (l4e<T>)adapter.q());
    }
    
    public final void T1(final i4e<T> i4e) {
        this.G1().d((i4e)i4e);
        this.Q1();
        final zml<ljf<T>> q0 = this.Q0;
        Object a;
        if (i4e != null) {
            a = new hm6((i4e)i4e);
        }
        else {
            a = vm6.a;
        }
        q0.onNext(a);
    }
    
    public final void V1(final int n, final int n2, final boolean b) {
        final k6m h0 = this.H0;
        Objects.requireNonNull(h0);
        h0.B(new dnf(n, n2), b);
        final Iterator<Object> iterator = ((HashSet<Object>)this.M0).iterator();
        while (iterator.hasNext()) {
            iterator.next().a(n);
        }
    }
    
    public final void Z1(final RecyclerView$e recyclerView$e, final l4e<T> r0) {
        this.H0.z(recyclerView$e);
        this.R0 = r0;
    }
    
    public final void a2() {
        if (super.F0 && this.J0 != null) {
            ((View)this.H0.b).setVisibility(8);
            this.O0.c();
            this.J0.setVisibility(0);
        }
    }
    
    public final void b2(final boolean b) {
        this.T0.a(b);
    }
    
    public final void c2(final boolean b) {
        this.T0.b(b);
    }
    
    public final void d2() {
        final n0s u0 = this.U0;
        if (u0 != null) {
            final SwipeRefreshLayout a = u0.a;
            if (!a.E0) {
                a.setRefreshing(true);
                final n0s$a b = u0.b;
                if (b != null) {
                    b.E(true);
                }
                this.R1(0);
            }
        }
    }
    
    public final void e2() {
        final n0s u0 = this.U0;
        if (u0 != null) {
            final SwipeRefreshLayout a = u0.a;
            if (a.E0) {
                a.setRefreshing(false);
                final n0s$a b = u0.b;
                if (b != null) {
                    b.E(false);
                }
                this.R1(1);
            }
        }
    }
    
    public final boolean f2(final boolean b) {
        final k6m h0 = this.H0;
        final RecyclerView b2 = h0.b;
        b2.stopNestedScroll();
        h0.b.F0();
        if (b2 instanceof zjt) {
            final boolean x1 = ((zjt)b2).X1(b);
            if (!x1) {
                this.H0.x();
            }
            return x1;
        }
        final int c = this.E1().c;
        if (c != -1) {
            this.V1(0, 0, b && c <= 15);
            return true;
        }
        this.H0.x();
        return false;
    }
    
    public final b5j<ljf<T>> v0() {
        return (b5j<ljf<T>>)this.Q0;
    }
}
