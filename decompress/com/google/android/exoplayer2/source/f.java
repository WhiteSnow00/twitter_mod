// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source;

import java.io.IOException;
import java.util.Objects;

public final class f implements h, h$a
{
    public final i$b C0;
    public final long D0;
    public final qx E0;
    public i F0;
    public h G0;
    public h$a H0;
    public long I0;
    
    public f(final i$b c0, final qx e0, final long d0) {
        this.C0 = c0;
        this.E0 = e0;
        this.D0 = d0;
        this.I0 = -9223372036854775807L;
    }
    
    public final void a(final i$b i$b) {
        long d0 = this.D0;
        final long i0 = this.I0;
        if (i0 != -9223372036854775807L) {
            d0 = i0;
        }
        final i f0 = this.F0;
        Objects.requireNonNull(f0);
        final h f2 = f0.f(i$b, this.E0, d0);
        this.G0 = f2;
        if (this.H0 != null) {
            f2.l((h$a)this, d0);
        }
    }
    
    public final long b() {
        final h g0 = this.G0;
        final int a = imw.a;
        return g0.b();
    }
    
    public final boolean c() {
        final h g0 = this.G0;
        return g0 != null && g0.c();
    }
    
    public final boolean d(final long n) {
        final h g0 = this.G0;
        return g0 != null && g0.d(n);
    }
    
    public final long e() {
        final h g0 = this.G0;
        final int a = imw.a;
        return g0.e();
    }
    
    public final void f(final long n) {
        final h g0 = this.G0;
        final int a = imw.a;
        g0.f(n);
    }
    
    public final long g(final hha[] array, final boolean[] array2, final bro[] array3, final boolean[] array4, long n) {
        final long i0 = this.I0;
        if (i0 != -9223372036854775807L && n == this.D0) {
            this.I0 = -9223372036854775807L;
            n = i0;
        }
        final h g0 = this.G0;
        final int a = imw.a;
        return g0.g(array, array2, array3, array4, n);
    }
    
    public final long h(final long n, final fbp fbp) {
        final h g0 = this.G0;
        final int a = imw.a;
        return g0.h(n, fbp);
    }
    
    public final long j(final long n) {
        final h g0 = this.G0;
        final int a = imw.a;
        return g0.j(n);
    }
    
    public final long k() {
        final h g0 = this.G0;
        final int a = imw.a;
        return g0.k();
    }
    
    public final void l(final h$a h0, long d0) {
        this.H0 = h0;
        final h g0 = this.G0;
        if (g0 != null) {
            d0 = this.D0;
            final long i0 = this.I0;
            if (i0 != -9223372036854775807L) {
                d0 = i0;
            }
            g0.l((h$a)this, d0);
        }
    }
    
    public final void m(final p p) {
        final h h = (h)p;
        final h$a h2 = this.H0;
        final int a = imw.a;
        ((p$a)h2).m((p)this);
    }
    
    public final void n(final h h) {
        final h$a h2 = this.H0;
        final int a = imw.a;
        h2.n((h)this);
    }
    
    public final void p() throws IOException {
        try {
            final h g0 = this.G0;
            if (g0 != null) {
                g0.p();
            }
            else {
                final i f0 = this.F0;
                if (f0 != null) {
                    f0.l();
                }
            }
        }
        catch (final IOException ex) {
            throw ex;
        }
    }
    
    public final mvt r() {
        final h g0 = this.G0;
        final int a = imw.a;
        return g0.r();
    }
    
    public final void u(final long n, final boolean b) {
        final h g0 = this.G0;
        final int a = imw.a;
        g0.u(n, b);
    }
}
