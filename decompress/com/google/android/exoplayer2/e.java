// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import java.io.IOException;
import java.util.Objects;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

public abstract class e implements z, ffm
{
    public final int C0;
    public final v53 D0;
    public gfm E0;
    public int F0;
    public hnk G0;
    public int H0;
    public bro I0;
    public n[] J0;
    public long K0;
    public long L0;
    public boolean M0;
    public boolean N0;
    
    public e(final int c0) {
        this.C0 = c0;
        this.D0 = new v53(2);
        this.L0 = Long.MIN_VALUE;
    }
    
    public final ExoPlaybackException A(final Throwable t, final n n, final boolean b, final int n2) {
        int e = 0;
        Label_0058: {
            if (n != null && !this.N0) {
                this.N0 = true;
                try {
                    e = this.e(n);
                    e &= 0x7;
                    break Label_0058;
                }
                catch (final ExoPlaybackException ex) {
                    this.N0 = false;
                }
                finally {
                    this.N0 = false;
                }
            }
            e = 4;
        }
        final String name = this.getName();
        final int f0 = this.F0;
        if (n == null) {
            e = 4;
        }
        return new ExoPlaybackException(1, t, n2, name, f0, n, e, b);
    }
    
    public final v53 B() {
        this.D0.b();
        return this.D0;
    }
    
    public abstract void C();
    
    public void D(final boolean b) throws ExoPlaybackException {
    }
    
    public abstract void E(final long p0, final boolean p1) throws ExoPlaybackException;
    
    public void F() {
    }
    
    public void G() throws ExoPlaybackException {
    }
    
    public void H() {
    }
    
    public abstract void I(final n[] p0, final long p1, final long p2) throws ExoPlaybackException;
    
    public final int J(final v53 v53, final DecoderInputBuffer decoderInputBuffer, int n) {
        final bro i0 = this.I0;
        Objects.requireNonNull(i0);
        final int f = i0.f(v53, decoderInputBuffer, n);
        n = -4;
        if (f == -4) {
            if (((vq2)decoderInputBuffer).j(4)) {
                this.L0 = Long.MIN_VALUE;
                if (!this.M0) {
                    n = -3;
                }
                return n;
            }
            final long g0 = decoderInputBuffer.G0 + this.K0;
            decoderInputBuffer.G0 = g0;
            this.L0 = Math.max(this.L0, g0);
        }
        else if (f == -5) {
            final n n2 = (n)v53.E0;
            Objects.requireNonNull(n2);
            if (n2.R0 != Long.MAX_VALUE) {
                final n$a a = n2.a();
                a.o = n2.R0 + this.K0;
                v53.E0 = a.a();
            }
        }
        return f;
    }
    
    @Override
    public final void c() {
        ri4.t(this.H0 == 0);
        this.D0.b();
        this.F();
    }
    
    @Override
    public final void d() {
        final int h0 = this.H0;
        boolean b = true;
        if (h0 != 1) {
            b = false;
        }
        ri4.t(b);
        this.D0.b();
        this.H0 = 0;
        this.I0 = null;
        this.J0 = null;
        this.M0 = false;
        this.C();
    }
    
    @Override
    public final int getState() {
        return this.H0;
    }
    
    @Override
    public final int h() {
        return this.C0;
    }
    
    @Override
    public final bro i() {
        return this.I0;
    }
    
    @Override
    public final boolean j() {
        return this.L0 == Long.MIN_VALUE;
    }
    
    @Override
    public final void k() {
        this.M0 = true;
    }
    
    @Override
    public final void l(final gfm e0, final n[] array, final bro bro, final long l0, final boolean b, final boolean b2, final long n, final long n2) throws ExoPlaybackException {
        ri4.t(this.H0 == 0);
        this.E0 = e0;
        this.H0 = 1;
        this.D(b2);
        this.n(array, bro, n, n2);
        this.M0 = false;
        this.E(this.L0 = l0, b);
    }
    
    public void m(final int n, final Object o) throws ExoPlaybackException {
    }
    
    @Override
    public final void n(final n[] j0, final bro i0, final long l0, final long k0) throws ExoPlaybackException {
        ri4.t(this.M0 ^ true);
        this.I0 = i0;
        if (this.L0 == Long.MIN_VALUE) {
            this.L0 = l0;
        }
        this.I(this.J0 = j0, l0, this.K0 = k0);
    }
    
    @Override
    public final void o() throws IOException {
        final bro i0 = this.I0;
        Objects.requireNonNull(i0);
        i0.a();
    }
    
    @Override
    public final boolean p() {
        return this.M0;
    }
    
    @Override
    public final ffm q() {
        return this;
    }
    
    @Override
    public final void start() throws ExoPlaybackException {
        final int h0 = this.H0;
        boolean b = true;
        if (h0 != 1) {
            b = false;
        }
        ri4.t(b);
        this.H0 = 2;
        this.G();
    }
    
    @Override
    public final void stop() {
        ri4.t(this.H0 == 2);
        this.H0 = 1;
        this.H();
    }
    
    @Override
    public final void t(final int f0, final hnk g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public int u() throws ExoPlaybackException {
        return 0;
    }
    
    @Override
    public final long w() {
        return this.L0;
    }
    
    @Override
    public final void x(final long l0) throws ExoPlaybackException {
        this.M0 = false;
        this.E(this.L0 = l0, false);
    }
    
    @Override
    public prg y() {
        return null;
    }
    
    public final ExoPlaybackException z(final Throwable t, final n n) {
        return this.A(t, n, false, 4002);
    }
}
