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
        this.o = new a(new b(k.e()), e0$d.T0, a.G0);
    }
    
    public final q e() {
        return this.k.e();
    }
    
    public final void g(final h h) {
        final f f = (f)h;
        if (f.G0 != null) {
            final i f2 = f.F0;
            Objects.requireNonNull(f2);
            f2.g(f.G0);
        }
        if (h == this.p) {
            this.p = null;
        }
    }
    
    public final void l() {
    }
    
    public final void s(final zxt j) {
        super.j = j;
        super.i = imw.l();
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
    public final i$b v(Object g0, final i$b i$b) {
        final Void void1 = (Void)g0;
        final Object a = ((rxg)i$b).a;
        final Object f0 = this.o.F0;
        g0 = a;
        if (f0 != null) {
            g0 = a;
            if (f0.equals(a)) {
                g0 = g.a.G0;
            }
        }
        return i$b.b(g0);
    }
    
    public final void w(Object o, final e0 e0) {
        final Void void1 = (Void)o;
        i$b b = null;
        Label_0336: {
            if (this.r) {
                this.o = this.o.t(e0);
                final f p2 = this.p;
                if (p2 != null) {
                    this.z(p2.I0);
                }
            }
            else if (e0.r()) {
                a t;
                if (this.s) {
                    t = this.o.t(e0);
                }
                else {
                    t = new a(e0, e0$d.T0, a.G0);
                }
                this.o = t;
            }
            else {
                e0.o(0, this.m);
                final e0$d m = this.m;
                long o2 = m.O0;
                o = m.C0;
                final f p3 = this.p;
                if (p3 != null) {
                    final long d0 = p3.D0;
                    ((e0)this.o).i(((rxg)p3.C0).a, this.n);
                    final long n = this.n.G0 + d0;
                    if (n != ((e0)this.o).o(0, this.m).O0) {
                        o2 = n;
                    }
                }
                final Pair k = e0.k(this.m, this.n, 0, o2);
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
                    final i$b c0 = p4.C0;
                    final Object o3 = o = ((rxg)c0).a;
                    if (this.o.F0 != null) {
                        o = o3;
                        if (o3.equals(a.G0)) {
                            o = this.o.F0;
                        }
                    }
                    b = c0.b(o);
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
    
    public final f y(final i$b i$b, final qx qx, final long n) {
        final f p3 = new f(i$b, qx, n);
        final i k = this.k;
        ri4.t(p3.F0 == null);
        p3.F0 = k;
        if (this.r) {
            Object o2;
            final Object o = o2 = ((rxg)i$b).a;
            if (this.o.F0 != null) {
                o2 = o;
                if (o.equals(a.G0)) {
                    o2 = this.o.F0;
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
        final int c = this.o.c(((rxg)p.C0).a);
        if (c == -1) {
            return;
        }
        final a o = this.o;
        final e0$b n2 = this.n;
        o.h(c, n2, false);
        final long f0 = n2.F0;
        long max = n;
        if (f0 != -9223372036854775807L) {
            max = n;
            if (n >= f0) {
                max = Math.max(0L, f0 - 1L);
            }
        }
        p.I0 = max;
    }
    
    public static final class a extends enb
    {
        public static final Object G0;
        public final Object E0;
        public final Object F0;
        
        static {
            G0 = new Object();
        }
        
        public a(final e0 e0, final Object e2, final Object f0) {
            super(e0);
            this.E0 = e2;
            this.F0 = f0;
        }
        
        public final int c(final Object o) {
            final e0 d0 = super.D0;
            Object o2 = o;
            if (a.G0.equals(o)) {
                final Object f0 = this.F0;
                o2 = o;
                if (f0 != null) {
                    o2 = f0;
                }
            }
            return d0.c(o2);
        }
        
        public final e0$b h(final int n, final e0$b e0$b, final boolean b) {
            super.D0.h(n, e0$b, b);
            if (imw.a(e0$b.D0, this.F0) && b) {
                e0$b.D0 = a.G0;
            }
            return e0$b;
        }
        
        public final Object n(final int n) {
            Object o;
            if (imw.a(o = super.D0.n(n), this.F0)) {
                o = a.G0;
            }
            return o;
        }
        
        public final e0$d p(final int n, final e0$d e0$d, final long n2) {
            super.D0.p(n, e0$d, n2);
            if (imw.a(e0$d.C0, this.E0)) {
                e0$d.C0 = e0$d.T0;
            }
            return e0$d;
        }
        
        public final a t(final e0 e0) {
            return new a(e0, this.E0, this.F0);
        }
    }
    
    public static final class b extends e0
    {
        public final q D0;
        
        public b(final q d0) {
            this.D0 = d0;
        }
        
        public final int c(final Object o) {
            int n;
            if (o == a.G0) {
                n = 0;
            }
            else {
                n = -1;
            }
            return n;
        }
        
        public final e0$b h(final int n, final e0$b e0$b, final boolean b) {
            Object g0 = null;
            Integer value;
            if (b) {
                value = 0;
            }
            else {
                value = null;
            }
            if (b) {
                g0 = a.G0;
            }
            e0$b.i((Object)value, g0, 0, -9223372036854775807L, 0L, qq.I0, true);
            return e0$b;
        }
        
        public final int j() {
            return 1;
        }
        
        public final Object n(final int n) {
            return a.G0;
        }
        
        public final e0$d p(final int n, final e0$d e0$d, final long n2) {
            e0$d.f(e0$d.T0, this.D0, (Object)null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, (q$f)null, 0L, -9223372036854775807L, 0, 0, 0L);
            e0$d.N0 = true;
            return e0$d;
        }
        
        public final int q() {
            return 1;
        }
    }
}
