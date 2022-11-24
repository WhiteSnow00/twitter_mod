// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source;

import java.io.IOException;
import com.google.android.exoplayer2.n;
import java.util.Objects;

public final class b implements h, h$a
{
    public final h F0;
    public h$a G0;
    public b.b$a[] H0;
    public long I0;
    public long J0;
    public long K0;
    public ClippingMediaSource$IllegalClippingException L0;
    
    public b(final h f0, final boolean b, final long j0, final long k0) {
        this.F0 = f0;
        this.H0 = new b.b$a[0];
        long i0;
        if (b) {
            i0 = j0;
        }
        else {
            i0 = -9223372036854775807L;
        }
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
    }
    
    public final boolean a() {
        return this.I0 != -9223372036854775807L;
    }
    
    public final boolean b() {
        return this.F0.b();
    }
    
    public final long d() {
        final long d = this.F0.d();
        if (d != Long.MIN_VALUE) {
            final long k0 = this.K0;
            if (k0 == Long.MIN_VALUE || d < k0) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }
    
    public final void e(final p p) {
        final h h = (h)p;
        final h$a g0 = this.G0;
        Objects.requireNonNull(g0);
        ((p$a)g0).e((p)this);
    }
    
    public final boolean f(final long n) {
        return this.F0.f(n);
    }
    
    public final long g() {
        final long g = this.F0.g();
        if (g != Long.MIN_VALUE) {
            final long k0 = this.K0;
            if (k0 == Long.MIN_VALUE || g < k0) {
                return g;
            }
        }
        return Long.MIN_VALUE;
    }
    
    public final void h(final long n) {
        this.F0.h(n);
    }
    
    public final void i(final h h) {
        if (this.L0 != null) {
            return;
        }
        final h$a g0 = this.G0;
        Objects.requireNonNull(g0);
        g0.i((h)this);
    }
    
    public final long j(final tha[] array, final boolean[] array2, final mso[] array3, final boolean[] array4, long k0) {
        this.H0 = new b.b$a[array3.length];
        final mso[] array5 = new mso[array3.length];
        final int n = 0;
        int n2 = 0;
        while (true) {
            final int length = array3.length;
            mso f0 = null;
            if (n2 >= length) {
                break;
            }
            final b.b$a[] h0 = this.H0;
            h0[n2] = (b.b$a)array3[n2];
            if (h0[n2] != null) {
                f0 = h0[n2].F0;
            }
            array5[n2] = f0;
            ++n2;
        }
        final long j = this.F0.j(array, array2, array5, array4, k0);
        final boolean a = this.a();
        final boolean b = true;
        long i2 = 0L;
        Label_0215: {
            if (a) {
                final long j2 = this.J0;
                if (k0 == j2) {
                    boolean b2 = false;
                    Label_0198: {
                        if (j2 != 0L) {
                            for (final tha tha : array) {
                                if (tha != null) {
                                    final n r = tha.r();
                                    if (!rbh.a(r.Q0, r.N0)) {
                                        b2 = true;
                                        break Label_0198;
                                    }
                                }
                            }
                        }
                        b2 = false;
                    }
                    if (b2) {
                        i2 = j;
                        break Label_0215;
                    }
                }
            }
            i2 = -9223372036854775807L;
        }
        this.I0 = i2;
        boolean b3 = b;
        Label_0280: {
            if (j != k0) {
                if (j >= this.J0) {
                    k0 = this.K0;
                    b3 = b;
                    if (k0 == Long.MIN_VALUE) {
                        break Label_0280;
                    }
                    if (j <= k0) {
                        b3 = b;
                        break Label_0280;
                    }
                }
                b3 = false;
            }
        }
        omi.p(b3);
        for (int l = n; l < array3.length; ++l) {
            if (array5[l] == null) {
                this.H0[l] = null;
            }
            else {
                final b.b$a[] h2 = this.H0;
                if (h2[l] == null || h2[l].F0 != array5[l]) {
                    h2[l] = new b.b$a(this, array5[l]);
                }
            }
            array3[l] = (mso)this.H0[l];
        }
        return j;
    }
    
    public final long k(final long n, rcp rcp) {
        final long j0 = this.J0;
        if (n == j0) {
            return j0;
        }
        final long i = rnw.j(rcp.a, 0L, n - j0);
        final long b = rcp.b;
        final long k0 = this.K0;
        long n2;
        if (k0 == Long.MIN_VALUE) {
            n2 = Long.MAX_VALUE;
        }
        else {
            n2 = k0 - n;
        }
        final long l = rnw.j(b, 0L, n2);
        if (i != rcp.a || l != rcp.b) {
            rcp = new rcp(i, l);
        }
        return this.F0.k(n, rcp);
    }
    
    public final long m(long k0) {
        this.I0 = -9223372036854775807L;
        final b.b$a[] h0 = this.H0;
        final int length = h0.length;
        final boolean b = false;
        for (final b.b$a b$a : h0) {
            if (b$a != null) {
                b$a.G0 = false;
            }
        }
        final long m = this.F0.m(k0);
        boolean b2 = false;
        Label_0112: {
            if (m != k0) {
                b2 = b;
                if (m < this.J0) {
                    break Label_0112;
                }
                k0 = this.K0;
                if (k0 != Long.MIN_VALUE) {
                    b2 = b;
                    if (m > k0) {
                        break Label_0112;
                    }
                }
            }
            b2 = true;
        }
        omi.p(b2);
        return m;
    }
    
    public final long n() {
        if (this.a()) {
            long i0 = this.I0;
            this.I0 = -9223372036854775807L;
            final long n = this.n();
            if (n != -9223372036854775807L) {
                i0 = n;
            }
            return i0;
        }
        final long n2 = this.F0.n();
        if (n2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        final long j0 = this.J0;
        final boolean b = false;
        omi.p(n2 >= j0);
        final long k0 = this.K0;
        boolean b2 = false;
        Label_0113: {
            if (k0 != Long.MIN_VALUE) {
                b2 = b;
                if (n2 > k0) {
                    break Label_0113;
                }
            }
            b2 = true;
        }
        omi.p(b2);
        return n2;
    }
    
    public final void o(final h$a g0, final long n) {
        this.G0 = g0;
        this.F0.o((h$a)this, n);
    }
    
    public final void q() throws IOException {
        final ClippingMediaSource$IllegalClippingException l0 = this.L0;
        if (l0 == null) {
            this.F0.q();
            return;
        }
        throw l0;
    }
    
    public final twt v() {
        return this.F0.v();
    }
    
    public final void x(final long n, final boolean b) {
        this.F0.x(n, b);
    }
}
