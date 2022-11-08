// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source;

import java.io.IOException;
import java.util.Objects;
import com.google.android.exoplayer2.n;

public final class b implements h, h$a
{
    public final h C0;
    public h$a D0;
    public b.b$a[] E0;
    public long F0;
    public long G0;
    public long H0;
    public ClippingMediaSource$IllegalClippingException I0;
    
    public b(final h c0, final boolean b, final long g0, final long h0) {
        this.C0 = c0;
        this.E0 = new b.b$a[0];
        long f0;
        if (b) {
            f0 = g0;
        }
        else {
            f0 = -9223372036854775807L;
        }
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final boolean a() {
        return this.F0 != -9223372036854775807L;
    }
    
    public final long b() {
        final long b = this.C0.b();
        if (b != Long.MIN_VALUE) {
            final long h0 = this.H0;
            if (h0 == Long.MIN_VALUE || b < h0) {
                return b;
            }
        }
        return Long.MIN_VALUE;
    }
    
    public final boolean c() {
        return this.C0.c();
    }
    
    public final boolean d(final long n) {
        return this.C0.d(n);
    }
    
    public final long e() {
        final long e = this.C0.e();
        if (e != Long.MIN_VALUE) {
            final long h0 = this.H0;
            if (h0 == Long.MIN_VALUE || e < h0) {
                return e;
            }
        }
        return Long.MIN_VALUE;
    }
    
    public final void f(final long n) {
        this.C0.f(n);
    }
    
    public final long g(final hha[] array, final boolean[] array2, final bro[] array3, final boolean[] array4, long h0) {
        this.E0 = new b.b$a[array3.length];
        final bro[] array5 = new bro[array3.length];
        final int n = 0;
        int n2 = 0;
        while (true) {
            final int length = array3.length;
            bro c0 = null;
            if (n2 >= length) {
                break;
            }
            final b.b$a[] e0 = this.E0;
            e0[n2] = (b.b$a)array3[n2];
            if (e0[n2] != null) {
                c0 = e0[n2].C0;
            }
            array5[n2] = c0;
            ++n2;
        }
        final long g = this.C0.g(array, array2, array5, array4, h0);
        final boolean a = this.a();
        final boolean b = true;
        long f0 = 0L;
        Label_0215: {
            if (a) {
                final long g2 = this.G0;
                if (h0 == g2) {
                    boolean b2 = false;
                    Label_0198: {
                        if (g2 != 0L) {
                            for (final hha hha : array) {
                                if (hha != null) {
                                    final n r = hha.r();
                                    if (!zah.a(r.N0, r.K0)) {
                                        b2 = true;
                                        break Label_0198;
                                    }
                                }
                            }
                        }
                        b2 = false;
                    }
                    if (b2) {
                        f0 = g;
                        break Label_0215;
                    }
                }
            }
            f0 = -9223372036854775807L;
        }
        this.F0 = f0;
        boolean b3 = b;
        Label_0280: {
            if (g != h0) {
                if (g >= this.G0) {
                    h0 = this.H0;
                    b3 = b;
                    if (h0 == Long.MIN_VALUE) {
                        break Label_0280;
                    }
                    if (g <= h0) {
                        b3 = b;
                        break Label_0280;
                    }
                }
                b3 = false;
            }
        }
        ri4.t(b3);
        for (int j = n; j < array3.length; ++j) {
            if (array5[j] == null) {
                this.E0[j] = null;
            }
            else {
                final b.b$a[] e2 = this.E0;
                if (e2[j] == null || e2[j].C0 != array5[j]) {
                    e2[j] = new b.b$a(this, array5[j]);
                }
            }
            array3[j] = (bro)this.E0[j];
        }
        return g;
    }
    
    public final long h(final long n, fbp fbp) {
        final long g0 = this.G0;
        if (n == g0) {
            return g0;
        }
        final long j = imw.j(fbp.a, 0L, n - g0);
        final long b = fbp.b;
        final long h0 = this.H0;
        long n2;
        if (h0 == Long.MIN_VALUE) {
            n2 = Long.MAX_VALUE;
        }
        else {
            n2 = h0 - n;
        }
        final long i = imw.j(b, 0L, n2);
        if (j != fbp.a || i != fbp.b) {
            fbp = new fbp(j, i);
        }
        return this.C0.h(n, fbp);
    }
    
    public final long j(long h0) {
        this.F0 = -9223372036854775807L;
        final b.b$a[] e0 = this.E0;
        final int length = e0.length;
        final boolean b = false;
        for (final b.b$a b$a : e0) {
            if (b$a != null) {
                b$a.D0 = false;
            }
        }
        final long j = this.C0.j(h0);
        boolean b2 = false;
        Label_0112: {
            if (j != h0) {
                b2 = b;
                if (j < this.G0) {
                    break Label_0112;
                }
                h0 = this.H0;
                if (h0 != Long.MIN_VALUE) {
                    b2 = b;
                    if (j > h0) {
                        break Label_0112;
                    }
                }
            }
            b2 = true;
        }
        ri4.t(b2);
        return j;
    }
    
    public final long k() {
        if (this.a()) {
            long f0 = this.F0;
            this.F0 = -9223372036854775807L;
            final long k = this.k();
            if (k != -9223372036854775807L) {
                f0 = k;
            }
            return f0;
        }
        final long i = this.C0.k();
        if (i == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        final long g0 = this.G0;
        final boolean b = false;
        ri4.t(i >= g0);
        final long h0 = this.H0;
        boolean b2 = false;
        Label_0112: {
            if (h0 != Long.MIN_VALUE) {
                b2 = b;
                if (i > h0) {
                    break Label_0112;
                }
            }
            b2 = true;
        }
        ri4.t(b2);
        return i;
    }
    
    public final void l(final h$a d0, final long n) {
        this.D0 = d0;
        this.C0.l((h$a)this, n);
    }
    
    public final void m(final p p) {
        final h h = (h)p;
        final h$a d0 = this.D0;
        Objects.requireNonNull(d0);
        ((p$a)d0).m((p)this);
    }
    
    public final void n(final h h) {
        if (this.I0 != null) {
            return;
        }
        final h$a d0 = this.D0;
        Objects.requireNonNull(d0);
        d0.n((h)this);
    }
    
    public final void p() throws IOException {
        final ClippingMediaSource$IllegalClippingException i0 = this.I0;
        if (i0 == null) {
            this.C0.p();
            return;
        }
        throw i0;
    }
    
    public final mvt r() {
        return this.C0.r();
    }
    
    public final void u(final long n, final boolean b) {
        this.C0.u(n, b);
    }
}
