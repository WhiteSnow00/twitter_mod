// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.q$f;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import android.util.Pair;
import java.util.Objects;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.e0$b;
import com.google.android.exoplayer2.e0$d;

public final class g extends c<Void>
{
    public final i k;
    public final boolean l;
    public final e0$d m;
    public final e0$b n;
    public a o;
    public f p;
    public boolean q;
    public boolean r;
    public boolean s;
    
    public g(final i k, final boolean b) {
        this.k = k;
        boolean l;
        if (b) {
            k.m();
            l = true;
        }
        else {
            l = false;
        }
        this.l = l;
        this.m = new e0$d();
        this.n = new e0$b();
        k.a();
        this.o = new a(new b(k.e()), e0$d.W0, a.J0);
    }
    
    public final q e() {
        return this.k.e();
    }
    
    public final /* bridge */ h f(final i$b i$b, final sx sx, final long n) {
        return (h)this.y(i$b, sx, n);
    }
    
    public final void g(final h h) {
        final f f = (f)h;
        if (f.J0 != null) {
            final i i0 = f.I0;
            Objects.requireNonNull(i0);
            i0.g(f.J0);
        }
        if (h == this.p) {
            this.p = null;
        }
    }
    
    public final void l() {
    }
    
    public final void s(final hzt j) {
        super.j = j;
        super.i = rnw.l();
        if (!this.l) {
            this.q = true;
            this.x(this.k);
        }
    }
    
    @Override
    public final void u() {
        this.r = false;
        this.q = false;
        super.u();
    }
    
    @Override
    public final i$b v(Object j0, final i$b i$b) {
        final Void void1 = (Void)j0;
        final Object a = ((jyg)i$b).a;
        final Object i0 = this.o.I0;
        j0 = a;
        if (i0 != null) {
            j0 = a;
            if (i0.equals(a)) {
                j0 = g.a.J0;
            }
        }
        return i$b.b(j0);
    }
    
    public final void w(Object o, final e0 e0) {
        final Void void1 = (Void)o;
        i$b b = null;
        Label_0336: {
            if (this.r) {
                this.o = this.o.t(e0);
                final f p2 = this.p;
                if (p2 != null) {
                    this.z(p2.L0);
                }
            }
            else if (e0.r()) {
                a t;
                if (this.s) {
                    t = this.o.t(e0);
                }
                else {
                    t = new a(e0, e0$d.W0, a.J0);
                }
                this.o = t;
            }
            else {
                e0.o(0, this.m);
                final e0$d m = this.m;
                long r0 = m.R0;
                o = m.F0;
                final f p3 = this.p;
                if (p3 != null) {
                    final long g0 = p3.G0;
                    ((e0)this.o).i(((jyg)p3.F0).a, this.n);
                    final long n = this.n.J0 + g0;
                    if (n != ((e0)this.o).o(0, this.m).R0) {
                        r0 = n;
                    }
                }
                final Pair k = e0.k(this.m, this.n, 0, r0);
                final Object first = k.first;
                final long longValue = (long)k.second;
                if (this.s) {
                    o = this.o.t(e0);
                }
                else {
                    o = new a(e0, o, first);
                }
                this.o = (a)o;
                final f p4 = this.p;
                if (p4 != null) {
                    this.z(longValue);
                    final i$b f0 = p4.F0;
                    final Object o2 = o = ((jyg)f0).a;
                    if (this.o.I0 != null) {
                        o = o2;
                        if (o2.equals(a.J0)) {
                            o = this.o.I0;
                        }
                    }
                    b = f0.b(o);
                    break Label_0336;
                }
            }
            b = null;
        }
        this.s = true;
        this.r = true;
        this.t((e0)this.o);
        if (b != null) {
            final f p5 = this.p;
            Objects.requireNonNull(p5);
            p5.a(b);
        }
    }
    
    public final f y(final i$b i$b, final sx sx, final long n) {
        final f p3 = new f(i$b, sx, n);
        final i k = this.k;
        omi.p(p3.I0 == null);
        p3.I0 = k;
        if (this.r) {
            Object o2;
            final Object o = o2 = ((jyg)i$b).a;
            if (this.o.I0 != null) {
                o2 = o;
                if (o.equals(a.J0)) {
                    o2 = this.o.I0;
                }
            }
            p3.a(i$b.b(o2));
        }
        else {
            this.p = p3;
            if (!this.q) {
                this.q = true;
                this.x(this.k);
            }
        }
        return p3;
    }
    
    @RequiresNonNull({ "unpreparedMaskingMediaPeriod" })
    public final void z(final long n) {
        final f p = this.p;
        final int c = this.o.c(((jyg)p.F0).a);
        if (c == -1) {
            return;
        }
        final a o = this.o;
        final e0$b n2 = this.n;
        o.h(c, n2, false);
        final long i0 = n2.I0;
        long max = n;
        if (i0 != -9223372036854775807L) {
            max = n;
            if (n >= i0) {
                max = Math.max(0L, i0 - 1L);
            }
        }
        p.L0 = max;
    }
    
    public static final class a extends dnb
    {
        public static final Object J0;
        public final Object H0;
        public final Object I0;
        
        static {
            J0 = new Object();
        }
        
        public a(final e0 e0, final Object h0, final Object i0) {
            super(e0);
            this.H0 = h0;
            this.I0 = i0;
        }
        
        public final int c(final Object o) {
            final e0 g0 = super.G0;
            Object o2 = o;
            if (a.J0.equals(o)) {
                final Object i0 = this.I0;
                o2 = o;
                if (i0 != null) {
                    o2 = i0;
                }
            }
            return g0.c(o2);
        }
        
        public final e0$b h(final int n, final e0$b e0$b, final boolean b) {
            super.G0.h(n, e0$b, b);
            if (rnw.a(e0$b.G0, this.I0) && b) {
                e0$b.G0 = a.J0;
            }
            return e0$b;
        }
        
        public final Object n(final int n) {
            Object o;
            if (rnw.a(o = super.G0.n(n), this.I0)) {
                o = a.J0;
            }
            return o;
        }
        
        public final e0$d p(final int n, final e0$d e0$d, final long n2) {
            super.G0.p(n, e0$d, n2);
            if (rnw.a(e0$d.F0, this.H0)) {
                e0$d.F0 = e0$d.W0;
            }
            return e0$d;
        }
        
        public final a t(final e0 e0) {
            return new a(e0, this.H0, this.I0);
        }
    }
    
    public static final class b extends e0
    {
        public final q G0;
        
        public b(final q g0) {
            this.G0 = g0;
        }
        
        public final int c(final Object o) {
            int n;
            if (o == a.J0) {
                n = 0;
            }
            else {
                n = -1;
            }
            return n;
        }
        
        public final e0$b h(final int n, final e0$b e0$b, final boolean b) {
            Object j0 = null;
            Integer value;
            if (b) {
                value = 0;
            }
            else {
                value = null;
            }
            if (b) {
                j0 = a.J0;
            }
            e0$b.i((Object)value, j0, 0, -9223372036854775807L, 0L, sq.L0, true);
            return e0$b;
        }
        
        public final int j() {
            return 1;
        }
        
        public final Object n(final int n) {
            return a.J0;
        }
        
        public final e0$d p(final int n, final e0$d e0$d, final long n2) {
            e0$d.f(e0$d.W0, this.G0, (Object)null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, (q$f)null, 0L, -9223372036854775807L, 0, 0, 0L);
            e0$d.Q0 = true;
            return e0$d;
        }
        
        public final int q() {
            return 1;
        }
    }
}
