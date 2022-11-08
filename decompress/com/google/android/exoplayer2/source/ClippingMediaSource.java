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
    
    public final h f(final i$b i$b, final qx qx, final long n) {
        final b b = new b(this.k.f(i$b, qx, n), this.n, this.s, this.t);
        this.o.add(b);
        return (h)b;
    }
    
    public final void g(final h h) {
        ri4.t(this.o.remove(h));
        this.k.g(((b)h).C0);
        if (this.o.isEmpty()) {
            final a q = this.q;
            Objects.requireNonNull(q);
            this.y(q.D0);
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
    
    public final void s(final zxt j) {
        super.j = j;
        super.i = imw.l();
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
        final long s0 = this.p.S0;
        final a q = this.q;
        long t = Long.MIN_VALUE;
        long n2;
        long m;
        if (q != null && !this.o.isEmpty()) {
            final long s2 = this.s;
            if (this.m != Long.MIN_VALUE) {
                t = this.t - s0;
            }
            n2 = s2 - s0;
            m = t;
        }
        else {
            final long l = this.l;
            m = this.m;
            this.s = s0 + l;
            if (m != Long.MIN_VALUE) {
                t = s0 + m;
            }
            this.t = t;
            for (int size = this.o.size(), i = 0; i < size; ++i) {
                final b b = this.o.get(i);
                final long s3 = this.s;
                final long t2 = this.t;
                b.G0 = s3;
                b.H0 = t2;
            }
            n2 = l;
        }
        try {
            this.t((e0)(this.q = new a(e0, n2, m)));
        }
        catch (final ClippingMediaSource$IllegalClippingException r) {
            this.r = r;
            for (int j = n; j < this.o.size(); ++j) {
                this.o.get(j).I0 = this.r;
            }
        }
    }
    
    public static final class a extends enb
    {
        public final long E0;
        public final long F0;
        public final long G0;
        public final boolean H0;
        
        public a(final e0 e0, long g0, long f0) throws ClippingMediaSource$IllegalClippingException {
            super(e0);
            final int j = e0.j();
            final boolean b = false;
            if (j != 1) {
                throw new ClippingMediaSource$IllegalClippingException(0);
            }
            final e0$d o = e0.o(0, new e0$d());
            final long max = Math.max(0L, g0);
            if (!o.N0 && max != 0L && !o.J0) {
                throw new ClippingMediaSource$IllegalClippingException(1);
            }
            if (f0 == Long.MIN_VALUE) {
                g0 = o.P0;
            }
            else {
                g0 = Math.max(0L, f0);
            }
            final long p3 = o.P0;
            f0 = g0;
            if (p3 != -9223372036854775807L) {
                f0 = g0;
                if (g0 > p3) {
                    f0 = p3;
                }
                if (max > f0) {
                    throw new ClippingMediaSource$IllegalClippingException(2);
                }
            }
            this.E0 = max;
            this.F0 = f0;
            final long n = lcmp(f0, -9223372036854775807L);
            if (n == 0) {
                g0 = -9223372036854775807L;
            }
            else {
                g0 = f0 - max;
            }
            this.G0 = g0;
            boolean h0 = b;
            Label_0236: {
                if (o.K0) {
                    if (n != 0) {
                        h0 = b;
                        if (p3 == -9223372036854775807L) {
                            break Label_0236;
                        }
                        h0 = b;
                        if (f0 != p3) {
                            break Label_0236;
                        }
                    }
                    h0 = true;
                }
            }
            this.H0 = h0;
        }
        
        public final e0$b h(final int n, final e0$b e0$b, final boolean b) {
            super.D0.h(0, e0$b, b);
            final long n2 = e0$b.G0 - this.E0;
            final long g0 = this.G0;
            long n3;
            if (g0 == -9223372036854775807L) {
                n3 = -9223372036854775807L;
            }
            else {
                n3 = g0 - n2;
            }
            e0$b.i(e0$b.C0, e0$b.D0, 0, n3, n2, qq.I0, false);
            return e0$b;
        }
        
        public final e0$d p(final int n, final e0$d e0$d, long o0) {
            super.D0.p(0, e0$d, 0L);
            final long s0 = e0$d.S0;
            o0 = this.E0;
            e0$d.S0 = s0 + o0;
            e0$d.P0 = this.G0;
            e0$d.K0 = this.H0;
            final long o2 = e0$d.O0;
            if (o2 != -9223372036854775807L) {
                o0 = Math.max(o2, o0);
                e0$d.O0 = o0;
                final long f0 = this.F0;
                if (f0 != -9223372036854775807L) {
                    o0 = Math.min(o0, f0);
                }
                e0$d.O0 = o0 - this.E0;
            }
            o0 = imw.T(this.E0);
            final long g0 = e0$d.G0;
            if (g0 != -9223372036854775807L) {
                e0$d.G0 = g0 + o0;
            }
            final long h0 = e0$d.H0;
            if (h0 != -9223372036854775807L) {
                e0$d.H0 = h0 + o0;
            }
            return e0$d;
        }
    }
}
