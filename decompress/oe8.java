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
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Objects;
import com.google.android.exoplayer2.w;
import android.util.SparseArray;
import com.google.android.exoplayer2.e0$d;
import com.google.android.exoplayer2.e0$b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oe8 implements qz
{
    public final lh4 D0;
    public final e0$b E0;
    public final e0$d F0;
    public final a G0;
    public final SparseArray<g00$a> H0;
    public ymf<g00> I0;
    public w J0;
    public obc K0;
    public boolean L0;
    
    public oe8(final lh4 d0) {
        Objects.requireNonNull(d0);
        this.D0 = d0;
        this.I0 = (ymf<g00>)new ymf(new CopyOnWriteArraySet(), cnw.t(), d0, (ymf$b)c71.I0);
        final e0$b e0 = new e0$b();
        this.E0 = e0;
        this.F0 = new e0$d();
        this.G0 = new a(e0);
        this.H0 = (SparseArray<g00$a>)new SparseArray();
    }
    
    public final void A(final int n) {
        final g00$a x = this.x();
        this.J(x, 4, (ymf$a<g00>)new ke8((Object)x, n, 0));
    }
    
    public final g00$a B(final i$b i$b) {
        Objects.requireNonNull(this.J0);
        e0 e0;
        if (i$b == null) {
            e0 = null;
        }
        else {
            e0 = this.G0.c.get(i$b);
        }
        if (i$b != null && e0 != null) {
            return this.y(e0, e0.i(((rxg)i$b).a, this.E0).F0, i$b);
        }
        final int c0 = this.J0.C0();
        Object o = this.J0.U();
        if (c0 >= ((e0)o).q()) {
            o = com.google.android.exoplayer2.e0.D0;
        }
        return this.y((e0)o, c0, null);
    }
    
    public final void B0(final w w, final w.b b) {
    }
    
    public final void C(final i i) {
        final g00$a x = this.x();
        this.J(x, 29, (ymf$a<g00>)new ge8((Object)x, (Object)i, 2));
    }
    
    public final void D(final r r) {
        final g00$a x = this.x();
        this.J(x, 14, (ymf$a<g00>)new h71((Object)x, (Object)r, 2));
    }
    
    public final g00$a E(final int n, final i$b i$b) {
        Objects.requireNonNull(this.J0);
        final int n2 = 0;
        boolean b = false;
        if (i$b != null) {
            if (this.G0.c.get(i$b) != null) {
                b = true;
            }
            g00$a g00$a;
            if (b) {
                g00$a = this.B(i$b);
            }
            else {
                g00$a = this.y((e0)e0.D0, n, i$b);
            }
            return g00$a;
        }
        Object o = this.J0.U();
        int n3 = n2;
        if (n < ((e0)o).q()) {
            n3 = 1;
        }
        if (n3 == 0) {
            o = e0.D0;
        }
        return this.y((e0)o, n, null);
    }
    
    public final void E0(final List<i$b> list, final i$b f) {
        final a g0 = this.G0;
        final w j0 = this.J0;
        Objects.requireNonNull(j0);
        Objects.requireNonNull(g0);
        g0.b = edd.q((Collection<? extends i$b>)list);
        if (!list.isEmpty()) {
            g0.e = list.get(0);
            Objects.requireNonNull(f);
            g0.f = f;
        }
        if (g0.d == null) {
            g0.d = a.b(j0, g0.b, g0.e, g0.a);
        }
        g0.d(j0.U());
    }
    
    public final void F(final int n, final boolean b) {
        final g00$a x = this.x();
        this.J(x, 30, (ymf$a<g00>)new nd8(x, n, b));
    }
    
    public final g00$a G() {
        return this.B(this.G0.e);
    }
    
    public final void G0(final boolean b, final int n) {
        final g00$a x = this.x();
        this.J(x, -1, (ymf$a<g00>)new zd8(x, b, n));
    }
    
    public final g00$a H() {
        return this.B(this.G0.f);
    }
    
    public final g00$a I(final PlaybackException ex) {
        if (ex instanceof ExoPlaybackException) {
            final rxg k0 = ((ExoPlaybackException)ex).K0;
            if (k0 != null) {
                return this.B(new i$b(k0));
            }
        }
        return this.x();
    }
    
    public final void J(final g00$a g00$a, final int n, final ymf$a<g00> ymf$a) {
        this.H0.put(n, (Object)g00$a);
        this.I0.e(n, (ymf$a)ymf$a);
    }
    
    public final void K() {
    }
    
    public final void L(final w j0, final Looper looper) {
        omy.k(this.J0 == null || ((AbstractCollection)this.G0.b).isEmpty());
        Objects.requireNonNull(j0);
        this.J0 = j0;
        this.K0 = this.D0.b(looper, (Handler$Callback)null);
        final ymf<g00> i0 = this.I0;
        this.I0 = (ymf<g00>)new ymf(i0.d, looper, i0.a, (ymf$b)new ge8((Object)this, (Object)j0, 0));
    }
    
    public final void O0(final int n) {
        final g00$a x = this.x();
        this.J(x, 8, (ymf$a<g00>)new ke8((Object)x, n, 1));
    }
    
    public final void Q0(final q q, final int n) {
        final g00$a x = this.x();
        this.J(x, 1, (ymf$a<g00>)new rd8(x, q, n));
    }
    
    public final void U0(final cwt cwt, final hwt hwt) {
        final g00$a x = this.x();
        this.J(x, 2, (ymf$a<g00>)new de8((Object)x, (Object)cwt, (Object)hwt));
    }
    
    public final void V(final int n, final int n2) {
        final g00$a h = this.H();
        this.J(h, 24, (ymf$a<g00>)new ne8(h, n, n2));
    }
    
    public final void W(final v v) {
        final g00$a x = this.x();
        this.J(x, 12, (ymf$a<g00>)new be8((Object)x, (Object)v, 2));
    }
    
    public final void a(final int n, final i$b i$b, final hwg hwg) {
        final g00$a e = this.E(n, i$b);
        this.J(e, 1004, (ymf$a<g00>)new be8((Object)e, (Object)hwg, 0));
    }
    
    public final void a1(final boolean b, final int n) {
        final g00$a x = this.x();
        this.J(x, 5, (ymf$a<g00>)new ae8(x, b, n));
    }
    
    public final void b(final int n, final i$b i$b) {
        final g00$a e = this.E(n, i$b);
        this.J(e, 1026, (ymf$a<g00>)new rrx((Object)e, 4));
    }
    
    public final void b0(final PlaybackException ex) {
        final g00$a i = this.I(ex);
        this.J(i, 10, (ymf$a<g00>)new be8((Object)i, (Object)ex, 1));
    }
    
    public final void c(final int n, final long n2, final long n3) {
        final a g0 = this.G0;
        i$b i$b;
        if (((AbstractCollection)g0.b).isEmpty()) {
            i$b = null;
        }
        else {
            i$b = (i$b)rp9.Z(g0.b);
        }
        final g00$a b = this.B(i$b);
        this.J(b, 1006, (ymf$a<g00>)new ld8(b, n, n2, n3));
    }
    
    public final void d(final int n, final i$b i$b, final f2g f2g, final hwg hwg) {
        final g00$a e = this.E(n, i$b);
        this.J(e, 1001, (ymf$a<g00>)new ie8(e, f2g, hwg, 1));
    }
    
    public final void e(final boolean b) {
        final g00$a h = this.H();
        this.J(h, 23, (ymf$a<g00>)new yd8(h, b));
    }
    
    public final void f(final List<q77> list) {
        final g00$a x = this.x();
        this.J(x, 27, (ymf$a<g00>)new poo((Object)x, (Object)list, 3));
    }
    
    public final void g() {
    }
    
    public final void h(final z8h z8h) {
        final g00$a x = this.x();
        this.J(x, 28, (ymf$a<g00>)new z4w((Object)x, (Object)z8h, 2));
    }
    
    public final void i(final int n, final i$b i$b, final hwg hwg) {
        final g00$a e = this.E(n, i$b);
        this.J(e, 1005, (ymf$a<g00>)new z4w((Object)e, (Object)hwg, 1));
    }
    
    public final void i0(final int n) {
    }
    
    public final void i1(final boolean b) {
        final g00$a x = this.x();
        this.J(x, 7, (ymf$a<g00>)new xd8(x, b));
    }
    
    public final void j(final r3x r3x) {
        final g00$a h = this.H();
        this.J(h, 25, (ymf$a<g00>)new h71((Object)h, (Object)r3x, 3));
    }
    
    public final void k(final int n, final i$b i$b, final Exception ex) {
        final g00$a e = this.E(n, i$b);
        this.J(e, 1024, (ymf$a<g00>)new poo((Object)e, (Object)ex, 1));
    }
    
    public final void l(final int n, final i$b i$b, final f2g f2g, final hwg hwg) {
        final g00$a e = this.E(n, i$b);
        this.J(e, 1002, (ymf$a<g00>)new ie8(e, f2g, hwg, 0));
    }
    
    public final void m(final w$d w$d, final w$d w$d2, final int n) {
        if (n == 1) {
            this.L0 = false;
        }
        final a g0 = this.G0;
        final w j0 = this.J0;
        Objects.requireNonNull(j0);
        g0.d = a.b(j0, g0.b, g0.e, g0.a);
        final g00$a x = this.x();
        this.J(x, 11, (ymf$a<g00>)new md8(x, n, w$d, w$d2));
    }
    
    public final void n(final int n, final i$b i$b, final f2g f2g, final hwg hwg) {
        final g00$a e = this.E(n, i$b);
        this.J(e, 1000, (ymf$a<g00>)new gj8((Object)e, (Object)f2g, (Object)hwg));
    }
    
    public final void n0(final boolean b) {
        final g00$a x = this.x();
        this.J(x, 3, (ymf$a<g00>)new wd8(x, b));
    }
    
    public final void o(final int n) {
        final g00$a x = this.x();
        this.J(x, 6, (ymf$a<g00>)new me8(x, n));
    }
    
    public final void o0() {
        final g00$a x = this.x();
        this.J(x, -1, (ymf$a<g00>)new fe8((Object)x, 0));
    }
    
    public final void p(final int n, final i$b i$b, final f2g f2g, final hwg hwg, final IOException ex, final boolean b) {
        final g00$a e = this.E(n, i$b);
        this.J(e, 1003, (ymf$a<g00>)new qd8(e, f2g, hwg, ex, b));
    }
    
    public final void p0(final PlaybackException ex) {
        final g00$a i = this.I(ex);
        this.J(i, 10, (ymf$a<g00>)new poo((Object)i, (Object)ex, 2));
    }
    
    public final void q(final int n, final i$b i$b) {
        final g00$a e = this.E(n, i$b);
        this.J(e, 1023, (ymf$a<g00>)new eu4((Object)e, 4));
    }
    
    public final void r(final int n, final i$b i$b, final int n2) {
        final g00$a e = this.E(n, i$b);
        this.J(e, 1022, (ymf$a<g00>)new ee8(e, n2, 0));
    }
    
    public final void s(final boolean b) {
    }
    
    public final void t(final int n, final i$b i$b) {
        final g00$a e = this.E(n, i$b);
        this.J(e, 1027, (ymf$a<g00>)new td8(e, 0));
    }
    
    public final void t0(final float n) {
        final g00$a h = this.H();
        this.J(h, 22, (ymf$a<g00>)new le8(h, n));
    }
    
    public final void u(final f0 f0) {
        final g00$a x = this.x();
        this.J(x, 2, (ymf$a<g00>)new ooo((Object)x, (Object)f0));
    }
    
    public final void v(final int n, final i$b i$b) {
        final g00$a e = this.E(n, i$b);
        this.J(e, 1025, (ymf$a<g00>)new td8(e, 1));
    }
    
    public final void w(final w$a w$a) {
        final g00$a x = this.x();
        this.J(x, 13, (ymf$a<g00>)new z4w((Object)x, (Object)w$a, 3));
    }
    
    public final g00$a x() {
        return this.B(this.G0.d);
    }
    
    @RequiresNonNull({ "player" })
    public final g00$a y(final e0 e0, final int n, i$b i$b) {
        if (e0.r()) {
            i$b = null;
        }
        final long c = this.D0.c();
        final boolean equals = e0.equals((Object)this.J0.U());
        final boolean b = false;
        final boolean b2 = equals && n == this.J0.C0();
        long n2 = 0L;
        if (i$b != null && ((rxg)i$b).a()) {
            int n3 = b ? 1 : 0;
            if (b2) {
                n3 = (b ? 1 : 0);
                if (this.J0.N() == ((rxg)i$b).b) {
                    n3 = (b ? 1 : 0);
                    if (this.J0.q0() == ((rxg)i$b).c) {
                        n3 = 1;
                    }
                }
            }
            if (n3 != 0) {
                n2 = this.J0.k();
            }
        }
        else if (b2) {
            n2 = this.J0.w0();
        }
        else if (!e0.r()) {
            n2 = e0.o(n, this.F0).b();
        }
        return new g00$a(c, e0, n, i$b, n2, this.J0.U(), this.J0.C0(), this.G0.d, this.J0.k(), this.J0.t());
    }
    
    public final void z(final e0 e0, final int n) {
        final a g0 = this.G0;
        final w j0 = this.J0;
        Objects.requireNonNull(j0);
        g0.d = a.b(j0, g0.b, g0.e, g0.a);
        g0.d(j0.U());
        final g00$a x = this.x();
        this.J(x, 0, (ymf$a<g00>)new ee8(x, n, 1));
    }
    
    public static final class a
    {
        public final e0$b a;
        public edd<i$b> b;
        public jdd<i$b, e0> c;
        public i$b d;
        public i$b e;
        public i$b f;
        
        public a(final e0$b a) {
            this.a = a;
            final edd.b e0 = edd.E0;
            this.b = (edd<i$b>)abm.H0;
            this.c = bbm.J0;
        }
        
        public static i$b b(final w w, final edd<i$b> edd, final i$b i$b, final e0$b e0$b) {
            final e0 u = w.U();
            final int h0 = w.h0();
            Object n;
            if (u.r()) {
                n = null;
            }
            else {
                n = u.n(h0);
            }
            int b;
            if (!w.r() && !u.r()) {
                b = u.h(h0, e0$b, false).b(cnw.H(w.k()) - e0$b.H0);
            }
            else {
                b = -1;
            }
            for (int i = 0; i < ((AbstractCollection)edd).size(); ++i) {
                final i$b i$b2 = edd.get(i);
                if (c(i$b2, n, w.r(), w.N(), w.q0(), b)) {
                    return i$b2;
                }
            }
            if (((AbstractCollection)edd).isEmpty() && i$b != null && c(i$b, n, w.r(), w.N(), w.q0(), b)) {
                return i$b;
            }
            return null;
        }
        
        public static boolean c(final i$b i$b, final Object o, final boolean b, final int n, final int n2, final int n3) {
            final boolean equals = ((rxg)i$b).a.equals(o);
            final boolean b2 = false;
            if (!equals) {
                return false;
            }
            if (!b || ((rxg)i$b).b != n || ((rxg)i$b).c != n2) {
                boolean b3 = b2;
                if (b) {
                    return b3;
                }
                b3 = b2;
                if (((rxg)i$b).b != -1) {
                    return b3;
                }
                b3 = b2;
                if (((rxg)i$b).e != n3) {
                    return b3;
                }
            }
            return true;
        }
        
        public final void a(final jdd$a<i$b, e0> jdd$a, final i$b i$b, e0 e0) {
            if (i$b == null) {
                return;
            }
            if (e0.c(((rxg)i$b).a) != -1) {
                jdd$a.d((Object)i$b, (Object)e0);
            }
            else {
                e0 = this.c.get(i$b);
                if (e0 != null) {
                    jdd$a.d((Object)i$b, (Object)e0);
                }
            }
        }
        
        public final void d(final e0 e0) {
            final jdd$a jdd$a = new jdd$a(4);
            if (((AbstractCollection)this.b).isEmpty()) {
                this.a((jdd$a<i$b, e0>)jdd$a, this.e, e0);
                if (!af8.o((Object)this.f, (Object)this.e)) {
                    this.a((jdd$a<i$b, e0>)jdd$a, this.f, e0);
                }
                if (!af8.o((Object)this.d, (Object)this.e) && !af8.o((Object)this.d, (Object)this.f)) {
                    this.a((jdd$a<i$b, e0>)jdd$a, this.d, e0);
                }
            }
            else {
                for (int i = 0; i < ((AbstractCollection)this.b).size(); ++i) {
                    this.a((jdd$a<i$b, e0>)jdd$a, (i$b)this.b.get(i), e0);
                }
                if (!this.b.contains(this.d)) {
                    this.a((jdd$a<i$b, e0>)jdd$a, this.d, e0);
                }
            }
            this.c = (bbm)jdd$a.b();
        }
    }
}
