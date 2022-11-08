import androidx.fragment.app.Fragment;
import android.content.res.Resources;
import android.view.View;
import android.content.Context;
import android.view.MenuItem;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import androidx.fragment.app.p;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import java.util.List;
import android.view.View$OnLayoutChangeListener;
import java.util.Objects;
import android.app.Activity;
import android.os.Looper;
import android.os.Handler;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public class acv<T> implements lcv$c, cbi, y81, n0s$a, xzt, zjt, n0s$b, bec<T>, sn6
{
    public final gob C0;
    public final rnd D0;
    public final UserIdentifier E0;
    public final UserIdentifier F0;
    public final nkf G0;
    public final b81 H0;
    public final lev I0;
    public final j6x J0;
    public final enf K0;
    public final boolean L0;
    public final kcv M0;
    public ba9 N0;
    public final ibm O0;
    public final swa P0;
    public final Handler Q0;
    public final qhd R0;
    public final z7x S0;
    public final z9i T0;
    public final f6j<pmi, t2g<i4e<T>>> U0;
    public final i3g V0;
    public final orm W0;
    public lcv<T> X0;
    public jev Y0;
    public boolean Z0;
    public final aah a1;
    
    public acv(final ybv ybv) {
        final Handler q0 = new Handler(Looper.getMainLooper());
        this.Q0 = q0;
        final qhd r0 = new qhd();
        this.R0 = r0;
        this.Z0 = false;
        final gob f = ybv.f;
        this.C0 = f;
        this.D0 = ybv.g;
        this.E0 = ybv.i;
        this.F0 = ybv.h;
        final kcv t = ybv.t;
        this.M0 = t;
        final z7x a = ybv.a;
        final ibm c = ybv.c;
        final c5w d = ybv.d;
        final LayoutInflater e = ybv.e;
        final vjt r2 = ybv.r;
        final q82 s = ybv.s;
        final lcv$b lcv$b = new lcv$b();
        final y2a.d b = lcv$b.b;
        b.c = new y2a.e(t.a);
        b.b();
        b.e = this.u0();
        boolean b2 = true;
        final boolean b3 = r2 != null;
        if (s == null) {
            b2 = false;
        }
        lcv$b.a = this.getClass().getSimpleName();
        lcv$b.c = 2131624723;
        lcv$b.e = t.b;
        lcv$b.i = t.c;
        int f2;
        if (b3) {
            f2 = 2131624724;
        }
        else {
            f2 = 0;
        }
        lcv$b.f = f2;
        int g;
        if (b2) {
            g = 2131624722;
        }
        else {
            g = 0;
        }
        lcv$b.g = g;
        lcv$b.d = 2131625751;
        lcv$b.k = this.i0();
        this.X0 = new lcv<T>(a, c, d, e, (Activity)f, this.m0(lcv$b), ybv.u);
        if (f instanceof mec) {
            final z9i f3 = ((mec)f).z0(fbi.class).f2();
            final z9i$a a2 = z9i.a;
            Object t2;
            if ((t2 = f3) == null) {
                t2 = a2;
            }
            this.T0 = (z9i)t2;
        }
        else {
            this.T0 = (z9i)z9i.a;
        }
        this.I0 = ybv.j;
        final b81 k = ybv.k;
        this.H0 = k;
        final k6m h0 = this.X0.H0;
        Objects.requireNonNull(k);
        zzd.f((Object)h0, "listWrapper");
        final RecyclerView b4 = h0.b;
        zzd.e((Object)b4, "listWrapper.view");
        final ViewGroup t3 = k.T0;
        if (t3 != null) {
            ((View)t3).removeOnLayoutChangeListener((View$OnLayoutChangeListener)k.Q0);
        }
        ((View)(k.T0 = (ViewGroup)b4)).addOnLayoutChangeListener((View$OnLayoutChangeListener)k.Q0);
        h0.c((gnf$b)k);
        final f6j l = ybv.l;
        final int a3 = w4j.a;
        this.U0 = l;
        this.V0 = ybv.m;
        this.W0 = ybv.n;
        this.O0 = ybv.c;
        this.P0 = ybv.p;
        this.S0 = ybv.a;
        this.G0 = ybv.o;
        this.L0 = this.a1();
        this.a1 = ybv.v;
        this.X0.L0.add(this);
        this.X0.V0 = (n0s$a)this;
        if (this.I0()) {
            final j6x j0 = new j6x(dta.b().e("ad_formats_tweet_view_visibility_threshold", 0.5f), dta.b().c("ad_formats_tweet_view_dwell_threshold", 0.01));
            this.J0 = j0;
            this.X0.H0.c((gnf$b)j0);
        }
        else {
            this.J0 = null;
        }
        if (dta.b().m("ad_formats_android_display_session_7316")) {
            final enf k2 = new enf();
            this.K0 = k2;
            this.X0.H0.c((gnf$b)k2);
        }
        else {
            this.K0 = null;
        }
        final Bundle q2 = ybv.q;
        if (q2 != null) {
            r0.b = (List)yvj.g(q2, "scroll_position", (alp)anf.a, (Object)ced.D0);
        }
        this.N0 = new ba9(this.o0(), (y81)this);
        q0.post((Runnable)new ebx((Object)this, (Object)ybv, 6));
    }
    
    private void b1(final int n) {
        final lcv<T> x0 = this.X0;
        if (n == 1) {
            x0.b2(true);
        }
        else if (n == 2) {
            x0.d2();
        }
        else if (n == 4 && this.p0() == 2) {
            x0.a2();
        }
    }
    
    public static void g0(final acv acv, final gkf$c gkf$c) {
        Objects.requireNonNull(acv);
        acv.b1(gkf$c.a);
    }
    
    public final p A0() {
        return this.C0.Q();
    }
    
    public final boolean B0() {
        return this.X0.L1();
    }
    
    public final boolean C0(final int n) {
        final swa p = this.P0;
        zzd.f((Object)p, "<this>");
        return p.a().contains(n);
    }
    
    public final boolean D0() {
        return ((wl1)this.D0).a2();
    }
    
    public final void E(final boolean b) {
    }
    
    public final boolean E0() {
        return !this.v0().c() || ((y4e)this.v0()).a() == 0;
    }
    
    public boolean F0() {
        return this.B0() && this.v0().c();
    }
    
    public final boolean G0() {
        if (this.D0()) {
            final i3g v0 = this.V0;
            if (v0 != null && v0.a()) {
                return true;
            }
        }
        return false;
    }
    
    public final void I(final n0s$a v0) {
        this.X0.V0 = v0;
    }
    
    public boolean I0() {
        return this instanceof knc;
    }
    
    public void J0() {
    }
    
    public void K0() {
    }
    
    public void L0() {
        this.H0.i();
        final j6x j0 = this.J0;
        if (j0 != null) {
            final Iterator iterator = new HashSet(j0.D0.keySet()).iterator();
            while (iterator.hasNext()) {
                j0.a((long)iterator.next());
            }
            j0.D0.clear();
        }
        this.Q0.removeCallbacksAndMessages((Object)null);
    }
    
    public void M0() {
        final Iterator iterator = this.P0.a().iterator();
        while (iterator.hasNext()) {
            this.b1((int)iterator.next());
        }
        this.W0();
        this.X0();
        if (!this.F0()) {
            this.c1();
        }
    }
    
    public final void N(final int n) {
        this.X0.N(n);
    }
    
    public void N0() {
        this.H0.a();
    }
    
    public void O0(final i4e<T> i4e) {
        rzh.a(6, 1, this.u0());
        final List<zmf> t0 = this.t0();
        final zmf zmf = t0.get(0);
        this.Z0(i4e);
        if (!this.C0(2)) {
            this.X0.e2();
        }
        if (!this.L0) {
            if (zmf.a()) {
                if (!this.V0(t0)) {
                    this.P0(zmf);
                }
            }
            else {
                this.W0();
            }
        }
    }
    
    public void P0(final zmf zmf) {
        this.X0.V1(0, 0, false);
    }
    
    public final void Q() {
        this.J0();
    }
    
    public void Q0(final Bundle bundle) {
        yvj.k(bundle, "scroll_position", (Object)this.R0.b, (alp)anf.a);
    }
    
    public void R0() {
        final b81 h0 = this.H0;
        if (h0.G0.b()) {
            h0.e();
        }
    }
    
    public void S0() {
        this.Y0();
        final b81 h0 = this.H0;
        if (!h0.G0.b()) {
            h0.e();
        }
        final enf k0 = this.K0;
        if (k0 != null) {
            final Iterator<gcx> iterator = k0.C0.iterator();
            while (iterator.hasNext()) {
                iterator.next().b();
            }
        }
    }
    
    public void T0() {
    }
    
    public void U0(final boolean b) {
        rzh.a(7, 1, this.u0());
        if (b) {
            this.k0();
        }
        final orm w0 = this.W0;
        if (w0 != null) {
            w0.d();
        }
    }
    
    public final void V() {
        this.K0();
    }
    
    public final boolean V0(final List<zmf> list) {
        for (final zmf zmf : list) {
            if (zmf.a()) {
                final int x0 = this.x0(zmf.a);
                if (x0 != -1) {
                    this.X0.V1(x0, zmf.b, false);
                    return true;
                }
                continue;
            }
        }
        return false;
    }
    
    public void W0() {
        if (!this.V0(this.R0.b) && this.s0() > 0) {
            final qhd r0 = this.R0;
            Objects.requireNonNull(r0);
            final ced$b d0 = ced.D0;
            final int a = w4j.a;
            r0.b = (List)d0;
        }
    }
    
    public void X0() {
        final ba9 n0 = this.N0;
        if (((v4f)n0.D0).a()) {
            n0.e(true);
        }
        this.H0.h();
    }
    
    public boolean X1(final boolean b) {
        return this.X0.f2(b);
    }
    
    public void Y0() {
        this.R0.b = this.t0();
    }
    
    public final void Z0(final i4e<T> i4e) {
        if (!this.F0() && i4e.isEmpty()) {
            if (this.B0()) {
                this.Q0.post((Runnable)new s20((Object)this, 7));
            }
        }
        else {
            this.X0.T1(i4e);
            this.H0.a();
        }
    }
    
    public void a() {
        this.T0();
    }
    
    public boolean a1() {
        return this instanceof xfk;
    }
    
    public final void a3() {
    }
    
    public final lcv<T> b() {
        return this.X0;
    }
    
    public final jn6 c() {
        return this.X0.c();
    }
    
    public void c1() {
        rzh.a(5, 1, this.u0());
        final f6j<pmi, t2g<i4e<T>>> u0 = this.U0;
        if (u0 != null && !this.Z0) {
            f.j((b5j)u0.v(pmi.a), (u93)new k3((Object)this, 13), (raa)this.O0);
            this.Z0 = true;
            this.O0.i((rj)new aq1((Object)this, 11));
        }
    }
    
    public final void h0(final gnf$b gnf$b) {
        this.X0.H0.c(gnf$b);
    }
    
    public boolean i0() {
        return false;
    }
    
    public void k0() {
        this.X0.T1(null);
    }
    
    public lcv$b m0(final lcv$b lcv$b) {
        return lcv$b;
    }
    
    public final void n0(final j29 j29) {
        final ibm o0 = this.O0;
        Objects.requireNonNull(j29);
        o0.i((rj)new zbv(j29, 0));
    }
    
    public boolean n1() {
        final zmf e1 = this.X0.E1();
        final int c = e1.c;
        return (c == -1 || c == 0) && e1.b == 0;
    }
    
    public v4f o0() {
        return (v4f)new a();
    }
    
    public int p0() {
        return 1;
    }
    
    public boolean q(final MenuItem menuItem) {
        return false;
    }
    
    public final p q0() {
        return ((Fragment)this.D0).M0();
    }
    
    public final Context r0() {
        return ((Fragment)this.D0).J1();
    }
    
    public final int s0() {
        int a;
        if (this.B0()) {
            a = ((y4e)this.v0()).a();
        }
        else {
            a = 0;
        }
        return a;
    }
    
    public final List<zmf> t0() {
        final lcv<T> x0 = this.X0;
        final zmf e1 = x0.E1();
        final k6m h0 = x0.H0;
        final RecyclerView b = h0.b;
        final int a = h0.v().a;
        final ijf$a ijf$a = new ijf$a(((ViewGroup)b).getChildCount());
        ((ijf)ijf$a).p((Object)e1);
        for (int i = 1; i < ((ViewGroup)b).getChildCount(); ++i) {
            final View child = ((ViewGroup)b).getChildAt(i);
            final int n = a + i;
            final int top = child.getTop();
            final int d = x0.H0.d();
            int n2 = 0;
            int n3 = 0;
            Label_0192: {
                if (n >= 0) {
                    if (n >= d) {
                        n2 = top;
                        n3 = n;
                        break Label_0192;
                    }
                    if (x0.P0.a) {
                        final View child2 = ((ViewGroup)x0.H0.b).getChildAt(d - n);
                        if (child2 != null) {
                            final int top2 = child2.getTop();
                            n3 = d;
                            n2 = top2;
                            break Label_0192;
                        }
                        n3 = d;
                        n2 = 0;
                        break Label_0192;
                    }
                }
                n2 = 0;
                n3 = -1;
            }
            long t;
            if (n3 > -1) {
                t = x0.H0.t(n3);
            }
            else {
                t = -1L;
            }
            final zmf zmf = new zmf(t, n2, n3);
            if (zmf.a() && zmf.a > 0L) {
                ((ijf)ijf$a).p((Object)zmf);
            }
        }
        return (List)((h4j)ijf$a).e();
    }
    
    public final String u0() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" @");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }
    
    public final l4e<T> v0() {
        return this.X0.G1();
    }
    
    public final p w0() {
        return ((Fragment)this.D0).R0();
    }
    
    public int x0(final long n) {
        return this.X0.I1(n);
    }
    
    public final boolean y0() {
        return ((zjt)this).X1(true);
    }
    
    public final Resources z0() {
        return this.r0().getResources();
    }
    
    public class a implements v4f
    {
        public boolean a;
        
        public final boolean a() {
            return acv.this.F0.isRegularUser();
        }
        
        public final boolean b(final boolean b) {
            if (!acv.this.B0()) {
                return true;
            }
            if (!acv.this.F0()) {
                return this.a = true;
            }
            return (!this.a && !b) || (this.a = false);
        }
        
        public boolean c() {
            return false;
        }
        
        public boolean d() {
            return true;
        }
        
        public boolean e() {
            return this instanceof mts.b;
        }
    }
}
