// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import java.util.Objects;
import android.view.Surface;
import java.util.List;

@Deprecated
public final class a0 extends d implements j
{
    public final k D0;
    public final jf6 E0;
    
    public a0(final j$b j$b) {
        final jf6 e0 = new jf6();
        this.E0 = e0;
        try {
            this.D0 = new k(j$b, (w)this);
            e0.c();
        }
        finally {
            this.E0.c();
        }
    }
    
    public final r A0() {
        this.o();
        final k d0 = this.D0;
        d0.E0();
        return d0.r1;
    }
    
    public final int B() {
        this.o();
        final k d0 = this.D0;
        d0.E0();
        return d0.h1;
    }
    
    public final int C0() {
        this.o();
        return this.D0.C0();
    }
    
    public final boolean D0() {
        this.o();
        final k d0 = this.D0;
        d0.E0();
        return d0.d1.h;
    }
    
    public final void F0() {
        this.o();
        this.D0.E0();
    }
    
    public final i G() {
        this.o();
        final k d0 = this.D0;
        d0.E0();
        return d0.F1;
    }
    
    public final ExoPlaybackException H() {
        this.o();
        final k d0 = this.D0;
        d0.E0();
        return d0.I1.f;
    }
    
    public final long H0() {
        this.o();
        return this.D0.H0();
    }
    
    public final void I(final boolean b) {
        this.o();
        this.D0.I(b);
    }
    
    public final void J(final List<com.google.android.exoplayer2.source.i> list, final boolean b) {
        this.o();
        this.D0.J(list, b);
    }
    
    public final r K0() {
        this.o();
        final k d0 = this.D0;
        d0.E0();
        return d0.q1;
    }
    
    public final long L0() {
        this.o();
        final k d0 = this.D0;
        d0.E0();
        return d0.W0;
    }
    
    public final List<m87> M() {
        this.o();
        final k d0 = this.D0;
        d0.E0();
        return d0.C1;
    }
    
    public final int N() {
        this.o();
        return this.D0.N();
    }
    
    public final void P(final boolean b) {
        this.o();
        this.D0.P(b);
    }
    
    public final int R() {
        this.o();
        return this.D0.R();
    }
    
    public final f0 S() {
        this.o();
        final k d0 = this.D0;
        d0.E0();
        return d0.I1.i.d;
    }
    
    public final mvt T() {
        this.o();
        final k d0 = this.D0;
        d0.E0();
        return d0.I1.h;
    }
    
    public final e0 U() {
        this.o();
        return this.D0.U();
    }
    
    public final tvt X() {
        this.o();
        final k d0 = this.D0;
        d0.E0();
        return d0.J0.a();
    }
    
    public final rvt Z() {
        this.o();
        final k d0 = this.D0;
        d0.E0();
        return new rvt((qvt[])d0.I1.i.c);
    }
    
    public final v a() {
        this.o();
        return this.D0.a();
    }
    
    public final int a0() {
        this.o();
        final k d0 = this.D0;
        d0.E0();
        return d0.d1.g;
    }
    
    public final boolean c() {
        this.o();
        final k d0 = this.D0;
        d0.E0();
        return d0.I1.g;
    }
    
    public final void c0(final int n, final long n2) {
        this.o();
        this.D0.c0(n, n2);
    }
    
    public final void d(final float n) {
        this.o();
        this.D0.d(n);
    }
    
    public final w$a d0() {
        this.o();
        final k d0 = this.D0;
        d0.E0();
        return d0.p1;
    }
    
    public final boolean e0() {
        this.o();
        return this.D0.e0();
    }
    
    @Deprecated
    public final void f0(final boolean b) {
        this.o();
        this.D0.f0(b);
    }
    
    public final void g(final v v) {
        this.o();
        this.D0.g(v);
    }
    
    public final void g0() {
        this.o();
        this.D0.E0();
    }
    
    public final int h0() {
        this.o();
        return this.D0.h0();
    }
    
    public final long i() {
        this.o();
        return this.D0.i();
    }
    
    public final x2x j0() {
        this.o();
        final k d0 = this.D0;
        d0.E0();
        return d0.G1;
    }
    
    public final long k() {
        this.o();
        return this.D0.k();
    }
    
    public final float k0() {
        this.o();
        final k d0 = this.D0;
        d0.E0();
        return d0.A1;
    }
    
    public final void l() {
        this.o();
        this.D0.l();
    }
    
    public final uy0 l0() {
        this.o();
        final k d0 = this.D0;
        d0.E0();
        return d0.z1;
    }
    
    public final int n() {
        this.o();
        return this.D0.n();
    }
    
    public final void o() {
        this.E0.a();
    }
    
    public final void q(final Surface surface) {
        this.o();
        final k d0 = this.D0;
        d0.E0();
        d0.i0(surface);
        int n;
        if (surface == null) {
            n = 0;
        }
        else {
            n = -1;
        }
        d0.K(n, n);
    }
    
    public final int q0() {
        this.o();
        return this.D0.q0();
    }
    
    public final boolean r() {
        this.o();
        return this.D0.r();
    }
    
    public final void r0(final f00 f00) {
        this.o();
        this.D0.T0.H0.d(f00);
    }
    
    public final void release() {
        this.o();
        this.D0.release();
    }
    
    public final void s0(final f00 f00) {
        this.o();
        this.D0.s0(f00);
    }
    
    public final long t() {
        this.o();
        return this.D0.t();
    }
    
    public final long v0() {
        this.o();
        final k d0 = this.D0;
        d0.E0();
        return d0.X0;
    }
    
    public final long w0() {
        this.o();
        return this.D0.w0();
    }
    
    public final void x(final w$c w$c) {
        this.o();
        final k d0 = this.D0;
        Objects.requireNonNull(d0);
        Objects.requireNonNull(w$c);
        d0.N0.d(w$c);
    }
    
    public final void x0(final w$c w$c) {
        this.o();
        this.D0.x0(w$c);
    }
    
    public final void y(final int n) {
        this.o();
        this.D0.y(n);
    }
    
    public final long y0() {
        this.o();
        return this.D0.y0();
    }
}
