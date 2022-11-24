import java.util.AbstractCollection;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import com.google.android.exoplayer2.w$a;
import com.google.android.exoplayer2.f0;
import java.io.IOException;
import com.google.android.exoplayer2.w$d;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.q;
import android.os.Handler$Callback;
import android.os.Looper;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackException;
import java.util.Collection;
import java.util.List;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.i;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.source.i$b;
import com.google.android.exoplayer2.w$b;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Objects;
import com.google.android.exoplayer2.w;
import android.util.SparseArray;
import com.google.android.exoplayer2.e0$d;
import com.google.android.exoplayer2.e0$b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rf8 implements oz
{
    public final qi4 F0;
    public final e0$b G0;
    public final e0$d H0;
    public final a I0;
    public final SparseArray<e00$a> J0;
    public unf<e00> K0;
    public w L0;
    public qcc M0;
    public boolean N0;
    
    public rf8(final qi4 f0) {
        Objects.requireNonNull(f0);
        this.F0 = f0;
        this.K0 = (unf<e00>)new unf(new CopyOnWriteArraySet(), rnw.t(), f0, (unf$b)j71.K0);
        final e0$b g0 = new e0$b();
        this.G0 = g0;
        this.H0 = new e0$d();
        this.I0 = new a(g0);
        this.J0 = (SparseArray<e00$a>)new SparseArray();
    }
    
    public final void A(final int n) {
        final e00$a x = this.x();
        this.J(x, 4, (unf$a<e00>)new nf8((Object)x, n, 0));
    }
    
    public final void A0(final w w, final w$b w$b) {
    }
    
    public final e00$a B(final i$b i$b) {
        Objects.requireNonNull(this.L0);
        e0 e0;
        if (i$b == null) {
            e0 = null;
        }
        else {
            e0 = (e0)this.I0.c.get((Object)i$b);
        }
        if (i$b != null && e0 != null) {
            return this.y(e0, e0.i(((jyg)i$b).a, this.G0).H0, i$b);
        }
        final int c0 = this.L0.C0();
        e0 e2 = this.L0.U();
        if (c0 >= e2.q()) {
            e2 = com.google.android.exoplayer2.e0.F0;
        }
        return this.y(e2, c0, null);
    }
    
    public final void C(final i i) {
        final e00$a x = this.x();
        this.J(x, 29, (unf$a<e00>)new jf8((Object)x, (Object)i, 2));
    }
    
    public final void D(final r r) {
        final e00$a x = this.x();
        this.J(x, 14, (unf$a<e00>)new o71((Object)x, (Object)r, 2));
    }
    
    public final void D0(final List<i$b> list, final i$b f) {
        final a i0 = this.I0;
        final w l0 = this.L0;
        Objects.requireNonNull(l0);
        Objects.requireNonNull(i0);
        i0.b = eed.q((Collection<? extends i$b>)list);
        if (!list.isEmpty()) {
            i0.e = list.get(0);
            Objects.requireNonNull(f);
            i0.f = f;
        }
        if (i0.d == null) {
            i0.d = a.b(l0, i0.b, i0.e, i0.a);
        }
        i0.d(l0.U());
    }
    
    public final e00$a E(final int n, final i$b i$b) {
        Objects.requireNonNull(this.L0);
        boolean b = false;
        final int n2 = 0;
        if (i$b != null) {
            int n3 = n2;
            if (this.I0.c.get((Object)i$b) != null) {
                n3 = 1;
            }
            e00$a e00$a;
            if (n3 != 0) {
                e00$a = this.B(i$b);
            }
            else {
                e00$a = this.y(e0.F0, n, i$b);
            }
            return e00$a;
        }
        e0 e0 = this.L0.U();
        if (n < e0.q()) {
            b = true;
        }
        if (!b) {
            e0 = com.google.android.exoplayer2.e0.F0;
        }
        return this.y(e0, n, null);
    }
    
    public final void F(final int n, final boolean b) {
        final e00$a x = this.x();
        this.J(x, 30, (unf$a<e00>)new pe8(x, n, b));
    }
    
    public final e00$a G() {
        return this.B(this.I0.e);
    }
    
    public final void G0(final boolean b, final int n) {
        final e00$a x = this.x();
        this.J(x, -1, (unf$a<e00>)new af8(x, b, n));
    }
    
    public final e00$a H() {
        return this.B(this.I0.f);
    }
    
    public final e00$a I(final PlaybackException ex) {
        if (ex instanceof ExoPlaybackException) {
            final jyg m0 = ((ExoPlaybackException)ex).M0;
            if (m0 != null) {
                return this.B(new i$b(m0));
            }
        }
        return this.x();
    }
    
    public final void J(final e00$a e00$a, final int n, final unf$a<e00> unf$a) {
        this.J0.put(n, (Object)e00$a);
        this.K0.e(n, (unf$a)unf$a);
    }
    
    public final void K() {
    }
    
    public final void L(final w l0, final Looper looper) {
        omi.p(this.L0 == null || ((AbstractCollection)this.I0.b).isEmpty());
        Objects.requireNonNull(l0);
        this.L0 = l0;
        this.M0 = this.F0.b(looper, (Handler$Callback)null);
        final unf<e00> k0 = this.K0;
        this.K0 = (unf<e00>)new unf(k0.d, looper, k0.a, (unf$b)new jf8((Object)this, (Object)l0, 0));
    }
    
    public final void O0(final int n) {
        final e00$a x = this.x();
        this.J(x, 8, (unf$a<e00>)new nf8((Object)x, n, 1));
    }
    
    public final void Q0(final q q, final int n) {
        final e00$a x = this.x();
        this.J(x, 1, (unf$a<e00>)new te8(x, q, n));
    }
    
    public final void U0(final twt twt, final ywt ywt) {
        final e00$a x = this.x();
        this.J(x, 2, (unf$a<e00>)new ff8((Object)x, (Object)twt, (Object)ywt));
    }
    
    public final void V(final int n, final int n2) {
        final e00$a h = this.H();
        this.J(h, 24, (unf$a<e00>)new pf8(h, n, n2));
    }
    
    public final void W(final v v) {
        final e00$a x = this.x();
        this.J(x, 12, (unf$a<e00>)new cf8((Object)x, (Object)v, 2));
    }
    
    public final void a(final int n, final i$b i$b, final axg axg) {
        final e00$a e = this.E(n, i$b);
        this.J(e, 1004, (unf$a<e00>)new cf8((Object)e, (Object)axg, 0));
    }
    
    public final void a0(final PlaybackException ex) {
        final e00$a i = this.I(ex);
        this.J(i, 10, (unf$a<e00>)new cf8((Object)i, (Object)ex, 1));
    }
    
    public final void a1(final boolean b, final int n) {
        final e00$a x = this.x();
        this.J(x, 5, (unf$a<e00>)new bf8(x, b, n));
    }
    
    public final void b(final int n, final long n2, final long n3) {
        final a i0 = this.I0;
        i$b i$b;
        if (((AbstractCollection)i0.b).isEmpty()) {
            i$b = null;
        }
        else {
            i$b = (i$b)tpz.F(i0.b);
        }
        final e00$a b = this.B(i$b);
        this.J(b, 1006, (unf$a<e00>)new ne8(b, n, n2, n3));
    }
    
    public final void c(final boolean b) {
        final e00$a h = this.H();
        this.J(h, 23, (unf$a<e00>)new ze8(h, b));
    }
    
    public final void d(final List<v87> list) {
        final e00$a x = this.x();
        this.J(x, 27, (unf$a<e00>)new hpo((Object)x, (Object)list, 3));
    }
    
    public final void e(final q9h q9h) {
        final e00$a x = this.x();
        this.J(x, 28, (unf$a<e00>)new n5w((Object)x, (Object)q9h, 2));
    }
    
    public final void f(final int n, final i$b i$b) {
        final e00$a e = this.E(n, i$b);
        this.J(e, 1026, (unf$a<e00>)new isx((Object)e, 4));
    }
    
    public final void g(final int n, final i$b i$b, final c3g c3g, final axg axg) {
        final e00$a e = this.E(n, i$b);
        this.J(e, 1001, (unf$a<e00>)new lf8(e, c3g, axg, 1));
    }
    
    public final void h() {
    }
    
    public final void h0(final int n) {
    }
    
    public final void i(final int n, final i$b i$b, final axg axg) {
        final e00$a e = this.E(n, i$b);
        this.J(e, 1005, (unf$a<e00>)new n5w((Object)e, (Object)axg, 1));
    }
    
    public final void i1(final boolean b) {
        final e00$a x = this.x();
        this.J(x, 7, (unf$a<e00>)new ye8(x, b));
    }
    
    public final void j(final j4x j4x) {
        final e00$a h = this.H();
        this.J(h, 25, (unf$a<e00>)new o71((Object)h, (Object)j4x, 3));
    }
    
    public final void k(final int n, final i$b i$b, final Exception ex) {
        final e00$a e = this.E(n, i$b);
        this.J(e, 1024, (unf$a<e00>)new hpo((Object)e, (Object)ex, 1));
    }
    
    public final void l(final int n, final i$b i$b, final c3g c3g, final axg axg) {
        final e00$a e = this.E(n, i$b);
        this.J(e, 1002, (unf$a<e00>)new lf8(e, c3g, axg, 0));
    }
    
    public final void m(final w$d w$d, final w$d w$d2, final int n) {
        if (n == 1) {
            this.N0 = false;
        }
        final a i0 = this.I0;
        final w l0 = this.L0;
        Objects.requireNonNull(l0);
        i0.d = a.b(l0, i0.b, i0.e, i0.a);
        final e00$a x = this.x();
        this.J(x, 11, (unf$a<e00>)new oe8(x, n, w$d, w$d2));
    }
    
    public final void m0(final boolean b) {
        final e00$a x = this.x();
        this.J(x, 3, (unf$a<e00>)new xe8(x, b));
    }
    
    public final void n(final int n, final i$b i$b, final c3g c3g, final axg axg) {
        final e00$a e = this.E(n, i$b);
        this.J(e, 1000, (unf$a<e00>)new lk8((Object)e, (Object)c3g, (Object)axg));
    }
    
    public final void n0() {
        final e00$a x = this.x();
        this.J(x, -1, (unf$a<e00>)new gf8((Object)x, 0));
    }
    
    public final void o(final int n) {
        final e00$a x = this.x();
        this.J(x, 6, (unf$a<e00>)new if8((Object)x, n));
    }
    
    public final void o0(final PlaybackException ex) {
        final e00$a i = this.I(ex);
        this.J(i, 10, (unf$a<e00>)new hpo((Object)i, (Object)ex, 2));
    }
    
    public final void p(final int n, final i$b i$b, final c3g c3g, final axg axg, final IOException ex, final boolean b) {
        final e00$a e = this.E(n, i$b);
        this.J(e, 1003, (unf$a<e00>)new se8(e, c3g, axg, ex, b));
    }
    
    public final void q(final int n, final i$b i$b) {
        final e00$a e = this.E(n, i$b);
        this.J(e, 1023, (unf$a<e00>)new yi0((Object)e, 4));
    }
    
    public final void r(final int n, final i$b i$b, final int n2) {
        final e00$a e = this.E(n, i$b);
        this.J(e, 1022, (unf$a<e00>)new hf8(e, n2, 0));
    }
    
    public final void s(final boolean b) {
    }
    
    public final void s0(final float n) {
        final e00$a h = this.H();
        this.J(h, 22, (unf$a<e00>)new of8(h, n));
    }
    
    public final void t(final int n, final i$b i$b) {
        final e00$a e = this.E(n, i$b);
        this.J(e, 1027, (unf$a<e00>)new we8(e, 0));
    }
    
    public final void u(final f0 f0) {
        final e00$a x = this.x();
        this.J(x, 2, (unf$a<e00>)new gpo((Object)x, (Object)f0));
    }
    
    public final void v(final int n, final i$b i$b) {
        final e00$a e = this.E(n, i$b);
        this.J(e, 1025, (unf$a<e00>)new we8(e, 1));
    }
    
    public final void w(final w$a w$a) {
        final e00$a x = this.x();
        this.J(x, 13, (unf$a<e00>)new n5w((Object)x, (Object)w$a, 3));
    }
    
    public final e00$a x() {
        return this.B(this.I0.d);
    }
    
    @RequiresNonNull({ "player" })
    public final e00$a y(final e0 e0, final int n, i$b i$b) {
        if (e0.r()) {
            i$b = null;
        }
        final long c = this.F0.c();
        final boolean equals = e0.equals((Object)this.L0.U());
        final boolean b = false;
        final boolean b2 = equals && n == this.L0.C0();
        long n2 = 0L;
        if (i$b != null && ((jyg)i$b).a()) {
            int n3 = b ? 1 : 0;
            if (b2) {
                n3 = (b ? 1 : 0);
                if (this.L0.N() == ((jyg)i$b).b) {
                    n3 = (b ? 1 : 0);
                    if (this.L0.q0() == ((jyg)i$b).c) {
                        n3 = 1;
                    }
                }
            }
            if (n3 != 0) {
                n2 = this.L0.l();
            }
        }
        else if (b2) {
            n2 = this.L0.w0();
        }
        else if (!e0.r()) {
            n2 = e0.o(n, this.H0).b();
        }
        return new e00$a(c, e0, n, i$b, n2, this.L0.U(), this.L0.C0(), this.I0.d, this.L0.l(), this.L0.t());
    }
    
    public final void z(final e0 e0, final int n) {
        final a i0 = this.I0;
        final w l0 = this.L0;
        Objects.requireNonNull(l0);
        i0.d = a.b(l0, i0.b, i0.e, i0.a);
        i0.d(l0.U());
        final e00$a x = this.x();
        this.J(x, 0, (unf$a<e00>)new hf8(x, n, 1));
    }
    
    public static final class a
    {
        public final e0$b a;
        public eed<i$b> b;
        public jed<i$b, e0> c;
        public i$b d;
        public i$b e;
        public i$b f;
        
        public a(final e0$b a) {
            this.a = a;
            final eed.b g0 = eed.G0;
            this.b = nbm.J0;
            this.c = obm.L0;
        }
        
        public static i$b b(final w w, final eed<i$b> eed, final i$b i$b, final e0$b e0$b) {
            final e0 u = w.U();
            final int i0 = w.i0();
            Object n;
            if (u.r()) {
                n = null;
            }
            else {
                n = u.n(i0);
            }
            int b;
            if (!w.r() && !u.r()) {
                b = u.h(i0, e0$b, false).b(rnw.H(w.l()) - e0$b.J0);
            }
            else {
                b = -1;
            }
            for (int j = 0; j < ((AbstractCollection)eed).size(); ++j) {
                final i$b i$b2 = eed.get(j);
                if (c(i$b2, n, w.r(), w.N(), w.q0(), b)) {
                    return i$b2;
                }
            }
            if (((AbstractCollection)eed).isEmpty() && i$b != null && c(i$b, n, w.r(), w.N(), w.q0(), b)) {
                return i$b;
            }
            return null;
        }
        
        public static boolean c(final i$b i$b, final Object o, final boolean b, final int n, final int n2, final int n3) {
            final boolean equals = ((jyg)i$b).a.equals(o);
            final boolean b2 = false;
            if (!equals) {
                return false;
            }
            if (!b || ((jyg)i$b).b != n || ((jyg)i$b).c != n2) {
                boolean b3 = b2;
                if (b) {
                    return b3;
                }
                b3 = b2;
                if (((jyg)i$b).b != -1) {
                    return b3;
                }
                b3 = b2;
                if (((jyg)i$b).e != n3) {
                    return b3;
                }
            }
            return true;
        }
        
        public final void a(final jed.a<i$b, e0> a, final i$b i$b, e0 e0) {
            if (i$b == null) {
                return;
            }
            if (e0.c(((jyg)i$b).a) != -1) {
                a.d(i$b, e0);
            }
            else {
                e0 = (e0)this.c.get((Object)i$b);
                if (e0 != null) {
                    a.d(i$b, e0);
                }
            }
        }
        
        public final void d(final e0 e0) {
            final jed.a<i$b, e0> a = new jed.a<i$b, e0>(4);
            if (((AbstractCollection)this.b).isEmpty()) {
                this.a(a, this.e, e0);
                if (!vq9.c((Object)this.f, (Object)this.e)) {
                    this.a(a, this.f, e0);
                }
                if (!vq9.c((Object)this.d, (Object)this.e) && !vq9.c((Object)this.d, (Object)this.f)) {
                    this.a(a, this.d, e0);
                }
            }
            else {
                for (int i = 0; i < ((AbstractCollection)this.b).size(); ++i) {
                    this.a(a, (i$b)this.b.get(i), e0);
                }
                if (!this.b.contains(this.d)) {
                    this.a(a, this.d, e0);
                }
            }
            this.c = (obm)a.b();
        }
    }
}
