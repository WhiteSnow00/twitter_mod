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
    
    public final h f(final i$b i$b, final sx sx, final long n) {
        final b b = new b(this.k.f(i$b, sx, n), this.n, this.s, this.t);
        this.o.add(b);
        return (h)b;
    }
    
    public final void g(final h h) {
        omi.p(this.o.remove(h));
        this.k.g(((b)h).F0);
        if (this.o.isEmpty()) {
            final a q = this.q;
            Objects.requireNonNull(q);
            this.y(q.G0);
        }
    }
    
    public final void l() throws IOException {
        final ClippingMediaSource$IllegalClippingException r = this.r;
        if (r == null) {
            final Iterator<c$b<T>> iterator = super.h.values().iterator();
            while (iterator.hasNext()) {
                ((c$b)iterator.next()).a.l();
            }
            return;
        }
        throw r;
    }
    
    public final void s(final hzt j) {
        super.j = j;
        super.i = rnw.l();
        this.x(this.k);
    }
    
    @Override
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
        final long v0 = this.p.V0;
        final a q = this.q;
        long t = Long.MIN_VALUE;
        long n2;
        long m;
        if (q != null && !this.o.isEmpty()) {
            final long s = this.s;
            if (this.m != Long.MIN_VALUE) {
                t = this.t - v0;
            }
            n2 = s - v0;
            m = t;
        }
        else {
            final long l = this.l;
            m = this.m;
            this.s = v0 + l;
            if (m != Long.MIN_VALUE) {
                t = v0 + m;
            }
            this.t = t;
            for (int size = this.o.size(), i = 0; i < size; ++i) {
                final b b = this.o.get(i);
                final long s2 = this.s;
                final long t2 = this.t;
                b.J0 = s2;
                b.K0 = t2;
            }
            n2 = l;
        }
        try {
            this.t((e0)(this.q = new a(e0, n2, m)));
        }
        catch (final ClippingMediaSource$IllegalClippingException r) {
            this.r = r;
            for (int j = n; j < this.o.size(); ++j) {
                this.o.get(j).L0 = this.r;
            }
        }
    }
    
    public static final class a extends dnb
    {
        public final long H0;
        public final long I0;
        public final long J0;
        public final boolean K0;
        
        public a(final e0 e0, long j0, long i0) throws ClippingMediaSource$IllegalClippingException {
            super(e0);
            final int k = e0.j();
            final boolean b = false;
            if (k != 1) {
                throw new ClippingMediaSource$IllegalClippingException(0);
            }
            final e0$d o = e0.o(0, new e0$d());
            final long max = Math.max(0L, j0);
            if (!o.Q0 && max != 0L && !o.M0) {
                throw new ClippingMediaSource$IllegalClippingException(1);
            }
            if (i0 == Long.MIN_VALUE) {
                j0 = o.S0;
            }
            else {
                j0 = Math.max(0L, i0);
            }
            final long s0 = o.S0;
            i0 = j0;
            if (s0 != -9223372036854775807L) {
                i0 = j0;
                if (j0 > s0) {
                    i0 = s0;
                }
                if (max > i0) {
                    throw new ClippingMediaSource$IllegalClippingException(2);
                }
            }
            this.H0 = max;
            this.I0 = i0;
            final long n = lcmp(i0, -9223372036854775807L);
            if (n == 0) {
                j0 = -9223372036854775807L;
            }
            else {
                j0 = i0 - max;
            }
            this.J0 = j0;
            boolean k2 = b;
            Label_0236: {
                if (o.N0) {
                    if (n != 0) {
                        k2 = b;
                        if (s0 == -9223372036854775807L) {
                            break Label_0236;
                        }
                        k2 = b;
                        if (i0 != s0) {
                            break Label_0236;
                        }
                    }
                    k2 = true;
                }
            }
            this.K0 = k2;
        }
        
        public final e0$b h(final int n, final e0$b e0$b, final boolean b) {
            super.G0.h(0, e0$b, b);
            final long n2 = e0$b.J0 - this.H0;
            final long j0 = this.J0;
            long n3;
            if (j0 == -9223372036854775807L) {
                n3 = -9223372036854775807L;
            }
            else {
                n3 = j0 - n2;
            }
            e0$b.i(e0$b.F0, e0$b.G0, 0, n3, n2, sq.L0, false);
            return e0$b;
        }
        
        public final e0$d p(final int n, final e0$d e0$d, long r0) {
            super.G0.p(0, e0$d, 0L);
            final long v0 = e0$d.V0;
            r0 = this.H0;
            e0$d.V0 = v0 + r0;
            e0$d.S0 = this.J0;
            e0$d.N0 = this.K0;
            final long r2 = e0$d.R0;
            if (r2 != -9223372036854775807L) {
                r0 = Math.max(r2, r0);
                e0$d.R0 = r0;
                final long i0 = this.I0;
                if (i0 != -9223372036854775807L) {
                    r0 = Math.min(r0, i0);
                }
                e0$d.R0 = r0 - this.H0;
            }
            r0 = rnw.T(this.H0);
            final long j0 = e0$d.J0;
            if (j0 != -9223372036854775807L) {
                e0$d.J0 = j0 + r0;
            }
            final long k0 = e0$d.K0;
            if (k0 != -9223372036854775807L) {
                e0$d.K0 = k0 + r0;
            }
            return e0$d;
        }
    }
}
