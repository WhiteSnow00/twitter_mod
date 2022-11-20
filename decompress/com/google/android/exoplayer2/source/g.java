// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source;

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
        this.o = new a((e0)new g.g$b(k.e()), e0$d.U0, a.H0);
    }
    
    public final q e() {
        return this.k.e();
    }
    
    public final /* bridge */ h f(final i$b i$b, final rx rx, final long n) {
        return (h)this.y(i$b, rx, n);
    }
    
    public final void g(final h h) {
        final f f = (f)h;
        if (f.H0 != null) {
            final i g0 = f.G0;
            Objects.requireNonNull(g0);
            g0.g(f.H0);
        }
        if (h == this.p) {
            this.p = null;
        }
    }
    
    public final void l() {
    }
    
    public final void s(final pyt j) {
        super.j = j;
        super.i = cnw.l();
        if (!this.l) {
            this.q = true;
            this.x(this.k);
        }
    }
    
    public final void u() {
        this.r = false;
        this.q = false;
        super.u();
    }
    
    public final i$b v(Object h0, final i$b i$b) {
        final Void void1 = (Void)h0;
        final Object a = ((rxg)i$b).a;
        final Object g0 = this.o.G0;
        h0 = a;
        if (g0 != null) {
            h0 = a;
            if (g0.equals(a)) {
                h0 = g.a.H0;
            }
        }
        return i$b.b(h0);
    }
    
    public final void w(Object o, final e0 e0) {
        final Void void1 = (Void)o;
        i$b b = null;
        Label_0336: {
            if (this.r) {
                this.o = this.o.t(e0);
                final f p2 = this.p;
                if (p2 != null) {
                    this.z(p2.J0);
                }
            }
            else if (e0.r()) {
                a t;
                if (this.s) {
                    t = this.o.t(e0);
                }
                else {
                    t = new a(e0, e0$d.U0, a.H0);
                }
                this.o = t;
            }
            else {
                e0.o(0, this.m);
                final e0$d m = this.m;
                long p3 = m.P0;
                o = m.D0;
                final f p4 = this.p;
                if (p4 != null) {
                    final long e2 = p4.E0;
                    ((e0)this.o).i(((rxg)p4.D0).a, this.n);
                    final long n = this.n.H0 + e2;
                    if (n != ((e0)this.o).o(0, this.m).P0) {
                        p3 = n;
                    }
                }
                final Pair k = e0.k(this.m, this.n, 0, p3);
                final Object first = k.first;
                final long longValue = (long)k.second;
                if (this.s) {
                    o = this.o.t(e0);
                }
                else {
                    o = new a(e0, o, first);
                }
                this.o = (a)o;
                final f p5 = this.p;
                if (p5 != null) {
                    this.z(longValue);
                    final i$b d0 = p5.D0;
                    final Object o2 = o = ((rxg)d0).a;
                    if (this.o.G0 != null) {
                        o = o2;
                        if (o2.equals(a.H0)) {
                            o = this.o.G0;
                        }
                    }
                    b = d0.b(o);
                    break Label_0336;
                }
            }
            b = null;
        }
        this.s = true;
        this.r = true;
        ((com.google.android.exoplayer2.source.a)this).t((e0)this.o);
        if (b != null) {
            final f p6 = this.p;
            Objects.requireNonNull(p6);
            p6.a(b);
        }
    }
    
    public final f y(final i$b i$b, final rx rx, final long n) {
        final f p3 = new f(i$b, rx, n);
        final i k = this.k;
        omy.k(p3.G0 == null);
        p3.G0 = k;
        if (this.r) {
            Object o2;
            final Object o = o2 = ((rxg)i$b).a;
            if (this.o.G0 != null) {
                o2 = o;
                if (o.equals(a.H0)) {
                    o2 = this.o.G0;
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
        final int c = this.o.c(((rxg)p.D0).a);
        if (c == -1) {
            return;
        }
        final a o = this.o;
        final e0$b n2 = this.n;
        o.h(c, n2, false);
        final long g0 = n2.G0;
        long max = n;
        if (g0 != -9223372036854775807L) {
            max = n;
            if (n >= g0) {
                max = Math.max(0L, g0 - 1L);
            }
        }
        p.J0 = max;
    }
    
    public static final class a extends cmb
    {
        public static final Object H0;
        public final Object F0;
        public final Object G0;
        
        static {
            H0 = new Object();
        }
        
        public a(final e0 e0, final Object f0, final Object g0) {
            super(e0);
            this.F0 = f0;
            this.G0 = g0;
        }
        
        public final int c(final Object o) {
            final e0 e0 = super.E0;
            Object o2 = o;
            if (a.H0.equals(o)) {
                final Object g0 = this.G0;
                o2 = o;
                if (g0 != null) {
                    o2 = g0;
                }
            }
            return e0.c(o2);
        }
        
        public final e0$b h(final int n, final e0$b e0$b, final boolean b) {
            super.E0.h(n, e0$b, b);
            if (cnw.a(e0$b.E0, this.G0) && b) {
                e0$b.E0 = a.H0;
            }
            return e0$b;
        }
        
        public final Object n(final int n) {
            Object o;
            if (cnw.a(o = super.E0.n(n), this.G0)) {
                o = a.H0;
            }
            return o;
        }
        
        public final e0$d p(final int n, final e0$d e0$d, final long n2) {
            super.E0.p(n, e0$d, n2);
            if (cnw.a(e0$d.D0, this.F0)) {
                e0$d.D0 = e0$d.U0;
            }
            return e0$d;
        }
        
        public final a t(final e0 e0) {
            return new a(e0, this.F0, this.G0);
        }
    }
}
