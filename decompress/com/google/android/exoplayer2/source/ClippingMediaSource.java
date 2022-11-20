// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.e0$b;
import com.google.android.exoplayer2.e0;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.e0$d;
import java.util.ArrayList;

public final class ClippingMediaSource extends c<Void>
{
    public final i k;
    public final long l;
    public final long m;
    public final boolean n;
    public final ArrayList<b> o;
    public final e0$d p;
    public a q;
    public ClippingMediaSource$IllegalClippingException r;
    public long s;
    public long t;
    
    public ClippingMediaSource(final i k, final long m) {
        this.k = k;
        this.l = 0L;
        this.m = m;
        this.n = true;
        this.o = new ArrayList<b>();
        this.p = new e0$d();
    }
    
    public final q e() {
        return this.k.e();
    }
    
    public final h f(final i$b i$b, final rx rx, final long n) {
        final b b = new b(this.k.f(i$b, rx, n), this.n, this.s, this.t);
        this.o.add(b);
        return (h)b;
    }
    
    public final void g(final h h) {
        omy.k(this.o.remove(h));
        this.k.g(((b)h).D0);
        if (this.o.isEmpty()) {
            final a q = this.q;
            Objects.requireNonNull(q);
            this.y(q.E0);
        }
    }
    
    public final void l() throws IOException {
        final ClippingMediaSource$IllegalClippingException r = this.r;
        if (r == null) {
            final Iterator iterator = super.h.values().iterator();
            while (iterator.hasNext()) {
                ((c$b)iterator.next()).a.l();
            }
            return;
        }
        throw r;
    }
    
    public final void s(final pyt j) {
        super.j = j;
        super.i = cnw.l();
        this.x(this.k);
    }
    
    public final void u() {
        super.u();
        this.r = null;
        this.q = null;
    }
    
    public final void w(final Object o, final e0 e0) {
        final Void void1 = (Void)o;
        if (this.r == null) {
            this.y(e0);
        }
    }
    
    public final void y(final e0 e0) {
        final e0$d p = this.p;
        final int n = 0;
        e0.o(0, p);
        final long t0 = this.p.T0;
        final a q = this.q;
        long t2 = Long.MIN_VALUE;
        long n2;
        long m;
        if (q != null && !this.o.isEmpty()) {
            final long s = this.s;
            if (this.m != Long.MIN_VALUE) {
                t2 = this.t - t0;
            }
            n2 = s - t0;
            m = t2;
        }
        else {
            final long l = this.l;
            m = this.m;
            this.s = t0 + l;
            if (m != Long.MIN_VALUE) {
                t2 = t0 + m;
            }
            this.t = t2;
            for (int size = this.o.size(), i = 0; i < size; ++i) {
                final b b = this.o.get(i);
                final long s2 = this.s;
                final long t3 = this.t;
                b.H0 = s2;
                b.I0 = t3;
            }
            n2 = l;
        }
        try {
            ((com.google.android.exoplayer2.source.a)this).t((e0)(this.q = new a(e0, n2, m)));
        }
        catch (final ClippingMediaSource$IllegalClippingException r) {
            this.r = r;
            for (int j = n; j < this.o.size(); ++j) {
                this.o.get(j).J0 = this.r;
            }
        }
    }
    
    public static final class a extends cmb
    {
        public final long F0;
        public final long G0;
        public final long H0;
        public final boolean I0;
        
        public a(final e0 e0, long h0, long g0) throws ClippingMediaSource$IllegalClippingException {
            super(e0);
            final int j = e0.j();
            final boolean b = false;
            if (j != 1) {
                throw new ClippingMediaSource$IllegalClippingException(0);
            }
            final e0$d o = e0.o(0, new e0$d());
            final long max = Math.max(0L, h0);
            if (!o.O0 && max != 0L && !o.K0) {
                throw new ClippingMediaSource$IllegalClippingException(1);
            }
            if (g0 == Long.MIN_VALUE) {
                h0 = o.Q0;
            }
            else {
                h0 = Math.max(0L, g0);
            }
            final long q0 = o.Q0;
            g0 = h0;
            if (q0 != -9223372036854775807L) {
                g0 = h0;
                if (h0 > q0) {
                    g0 = q0;
                }
                if (max > g0) {
                    throw new ClippingMediaSource$IllegalClippingException(2);
                }
            }
            this.F0 = max;
            this.G0 = g0;
            final long n = lcmp(g0, -9223372036854775807L);
            if (n == 0) {
                h0 = -9223372036854775807L;
            }
            else {
                h0 = g0 - max;
            }
            this.H0 = h0;
            boolean i0 = b;
            Label_0236: {
                if (o.L0) {
                    if (n != 0) {
                        i0 = b;
                        if (q0 == -9223372036854775807L) {
                            break Label_0236;
                        }
                        i0 = b;
                        if (g0 != q0) {
                            break Label_0236;
                        }
                    }
                    i0 = true;
                }
            }
            this.I0 = i0;
        }
        
        public final e0$b h(final int n, final e0$b e0$b, final boolean b) {
            super.E0.h(0, e0$b, b);
            final long n2 = e0$b.H0 - this.F0;
            final long h0 = this.H0;
            long n3;
            if (h0 == -9223372036854775807L) {
                n3 = -9223372036854775807L;
            }
            else {
                n3 = h0 - n2;
            }
            e0$b.i(e0$b.D0, e0$b.E0, 0, n3, n2, qq.J0, false);
            return e0$b;
        }
        
        public final e0$d p(final int n, final e0$d e0$d, long p3) {
            super.E0.p(0, e0$d, 0L);
            final long t0 = e0$d.T0;
            p3 = this.F0;
            e0$d.T0 = t0 + p3;
            e0$d.Q0 = this.H0;
            e0$d.L0 = this.I0;
            final long p4 = e0$d.P0;
            if (p4 != -9223372036854775807L) {
                p3 = Math.max(p4, p3);
                e0$d.P0 = p3;
                final long g0 = this.G0;
                if (g0 != -9223372036854775807L) {
                    p3 = Math.min(p3, g0);
                }
                e0$d.P0 = p3 - this.F0;
            }
            p3 = cnw.T(this.F0);
            final long h0 = e0$d.H0;
            if (h0 != -9223372036854775807L) {
                e0$d.H0 = h0 + p3;
            }
            final long i0 = e0$d.I0;
            if (i0 != -9223372036854775807L) {
                e0$d.I0 = i0 + p3;
            }
            return e0$d;
        }
    }
}
