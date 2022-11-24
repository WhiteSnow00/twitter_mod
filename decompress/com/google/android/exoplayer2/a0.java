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
    public final k G0;
    public final vf6 H0;
    
    public a0(final j$b j$b) {
        final vf6 h0 = new vf6();
        this.H0 = h0;
        try {
            this.G0 = new k(j$b, (w)this);
            h0.c();
        }
        finally {
            this.H0.c();
        }
    }
    
    public final int B() {
        this.o();
        final k g0 = this.G0;
        g0.D0();
        return g0.k1;
    }
    
    public final r B0() {
        this.o();
        final k g0 = this.G0;
        g0.D0();
        return g0.u1;
    }
    
    public final int C0() {
        this.o();
        return this.G0.C0();
    }
    
    public final boolean E0() {
        this.o();
        final k g0 = this.G0;
        g0.D0();
        return g0.g1.h;
    }
    
    public final void F0() {
        this.o();
        this.G0.D0();
    }
    
    public final i G() {
        this.o();
        final k g0 = this.G0;
        g0.D0();
        return g0.I1;
    }
    
    public final ExoPlaybackException H() {
        this.o();
        final k g0 = this.G0;
        g0.D0();
        return g0.L1.f;
    }
    
    public final long H0() {
        this.o();
        return this.G0.H0();
    }
    
    public final void I(final boolean b) {
        this.o();
        this.G0.I(b);
    }
    
    public final void J(final List<com.google.android.exoplayer2.source.i> list, final boolean b) {
        this.o();
        this.G0.J(list, b);
    }
    
    public final r K0() {
        this.o();
        final k g0 = this.G0;
        g0.D0();
        return g0.t1;
    }
    
    public final long L0() {
        this.o();
        final k g0 = this.G0;
        g0.D0();
        return g0.Z0;
    }
    
    public final List<v87> M() {
        this.o();
        final k g0 = this.G0;
        g0.D0();
        return g0.F1;
    }
    
    public final int N() {
        this.o();
        return this.G0.N();
    }
    
    public final void P(final boolean b) {
        this.o();
        this.G0.P(b);
    }
    
    public final int R() {
        this.o();
        return this.G0.R();
    }
    
    public final f0 S() {
        this.o();
        final k g0 = this.G0;
        g0.D0();
        return g0.L1.i.d;
    }
    
    public final twt T() {
        this.o();
        final k g0 = this.G0;
        g0.D0();
        return g0.L1.h;
    }
    
    public final e0 U() {
        this.o();
        return this.G0.U();
    }
    
    public final axt X() {
        this.o();
        final k g0 = this.G0;
        g0.D0();
        return g0.M0.a();
    }
    
    public final ywt Z() {
        this.o();
        final k g0 = this.G0;
        g0.D0();
        return new ywt((xwt[])g0.L1.i.c);
    }
    
    public final v a() {
        this.o();
        return this.G0.a();
    }
    
    public final boolean b() {
        this.o();
        final k g0 = this.G0;
        g0.D0();
        return g0.L1.g;
    }
    
    public final int b0() {
        this.o();
        final k g0 = this.G0;
        g0.D0();
        return g0.g1.g;
    }
    
    public final void c0(final int n, final long n2) {
        this.o();
        this.G0.c0(n, n2);
    }
    
    public final w$a d0() {
        this.o();
        final k g0 = this.G0;
        g0.D0();
        return g0.s1;
    }
    
    public final boolean e0() {
        this.o();
        return this.G0.e0();
    }
    
    public final long f() {
        this.o();
        return this.G0.f();
    }
    
    @Deprecated
    public final void f0(final boolean b) {
        this.o();
        this.G0.f0(b);
    }
    
    public final void g0() {
        this.o();
        this.G0.D0();
    }
    
    public final void h(final float n) {
        this.o();
        this.G0.h(n);
    }
    
    public final void i(final v v) {
        this.o();
        this.G0.i(v);
    }
    
    public final int i0() {
        this.o();
        return this.G0.i0();
    }
    
    public final j4x j0() {
        this.o();
        final k g0 = this.G0;
        g0.D0();
        return g0.J1;
    }
    
    public final void k() {
        this.o();
        this.G0.k();
    }
    
    public final float k0() {
        this.o();
        final k g0 = this.G0;
        g0.D0();
        return g0.D1;
    }
    
    public final long l() {
        this.o();
        return this.G0.l();
    }
    
    public final ty0 l0() {
        this.o();
        final k g0 = this.G0;
        g0.D0();
        return g0.C1;
    }
    
    public final int n() {
        this.o();
        return this.G0.n();
    }
    
    public final void o() {
        this.H0.a();
    }
    
    public final void q(final Surface surface) {
        this.o();
        final k g0 = this.G0;
        g0.D0();
        g0.h0(surface);
        int n;
        if (surface == null) {
            n = 0;
        }
        else {
            n = -1;
        }
        g0.K(n, n);
    }
    
    public final int q0() {
        this.o();
        return this.G0.q0();
    }
    
    public final boolean r() {
        this.o();
        return this.G0.r();
    }
    
    public final void r0(final e00 e00) {
        this.o();
        this.G0.W0.K0.d((Object)e00);
    }
    
    public final void release() {
        this.o();
        this.G0.release();
    }
    
    public final long t() {
        this.o();
        return this.G0.t();
    }
    
    public final void t0(final e00 e00) {
        this.o();
        this.G0.t0(e00);
    }
    
    public final long v0() {
        this.o();
        final k g0 = this.G0;
        g0.D0();
        return g0.a1;
    }
    
    public final long w0() {
        this.o();
        return this.G0.w0();
    }
    
    public final void x(final w$c w$c) {
        this.o();
        final k g0 = this.G0;
        Objects.requireNonNull(g0);
        Objects.requireNonNull(w$c);
        g0.Q0.d((Object)w$c);
    }
    
    public final void x0(final w$c w$c) {
        this.o();
        this.G0.x0(w$c);
    }
    
    public final void y(final int n) {
        this.o();
        this.G0.y(n);
    }
    
    public final long y0() {
        this.o();
        return this.G0.y0();
    }
}
