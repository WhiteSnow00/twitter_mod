// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source;

import java.io.IOException;
import java.util.Objects;

public final class f implements h, h$a
{
    public final i$b F0;
    public final long G0;
    public final sx H0;
    public i I0;
    public h J0;
    public h$a K0;
    public long L0;
    
    public f(final i$b f0, final sx h0, final long g0) {
        this.F0 = f0;
        this.H0 = h0;
        this.G0 = g0;
        this.L0 = -9223372036854775807L;
    }
    
    public final void a(final i$b i$b) {
        long g0 = this.G0;
        final long l0 = this.L0;
        if (l0 != -9223372036854775807L) {
            g0 = l0;
        }
        final i i0 = this.I0;
        Objects.requireNonNull(i0);
        final h f = i0.f(i$b, this.H0, g0);
        this.J0 = f;
        if (this.K0 != null) {
            f.o((h$a)this, g0);
        }
    }
    
    public final boolean b() {
        final h j0 = this.J0;
        return j0 != null && j0.b();
    }
    
    public final long d() {
        final h j0 = this.J0;
        final int a = rnw.a;
        return j0.d();
    }
    
    public final void e(final p p) {
        final h h = (h)p;
        final h$a k0 = this.K0;
        final int a = rnw.a;
        ((p$a)k0).e((p)this);
    }
    
    public final boolean f(final long n) {
        final h j0 = this.J0;
        return j0 != null && j0.f(n);
    }
    
    public final long g() {
        final h j0 = this.J0;
        final int a = rnw.a;
        return j0.g();
    }
    
    public final void h(final long n) {
        final h j0 = this.J0;
        final int a = rnw.a;
        j0.h(n);
    }
    
    public final void i(final h h) {
        final h$a k0 = this.K0;
        final int a = rnw.a;
        k0.i((h)this);
    }
    
    public final long j(final tha[] array, final boolean[] array2, final mso[] array3, final boolean[] array4, long n) {
        final long l0 = this.L0;
        if (l0 != -9223372036854775807L && n == this.G0) {
            this.L0 = -9223372036854775807L;
            n = l0;
        }
        final h j0 = this.J0;
        final int a = rnw.a;
        return j0.j(array, array2, array3, array4, n);
    }
    
    public final long k(final long n, final rcp rcp) {
        final h j0 = this.J0;
        final int a = rnw.a;
        return j0.k(n, rcp);
    }
    
    public final long m(final long n) {
        final h j0 = this.J0;
        final int a = rnw.a;
        return j0.m(n);
    }
    
    public final long n() {
        final h j0 = this.J0;
        final int a = rnw.a;
        return j0.n();
    }
    
    public final void o(final h$a k0, long g0) {
        this.K0 = k0;
        final h j0 = this.J0;
        if (j0 != null) {
            g0 = this.G0;
            final long l0 = this.L0;
            if (l0 != -9223372036854775807L) {
                g0 = l0;
            }
            j0.o((h$a)this, g0);
        }
    }
    
    public final void q() throws IOException {
        try {
            final h j0 = this.J0;
            if (j0 != null) {
                j0.q();
            }
            else {
                final i i0 = this.I0;
                if (i0 != null) {
                    i0.l();
                }
            }
        }
        catch (final IOException ex) {
            throw ex;
        }
    }
    
    public final twt v() {
        final h j0 = this.J0;
        final int a = rnw.a;
        return j0.v();
    }
    
    public final void x(final long n, final boolean b) {
        final h j0 = this.J0;
        final int a = rnw.a;
        j0.x(n, b);
    }
}
