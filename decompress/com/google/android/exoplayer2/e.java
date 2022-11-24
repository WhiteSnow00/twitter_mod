// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import java.io.IOException;
import java.util.Objects;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

public abstract class e implements z, kgm
{
    public final int F0;
    public final y8r G0;
    public lgm H0;
    public int I0;
    public cok J0;
    public int K0;
    public mso L0;
    public n[] M0;
    public long N0;
    public long O0;
    public boolean P0;
    public boolean Q0;
    
    public e(final int f0) {
        this.F0 = f0;
        this.G0 = new y8r(1);
        this.O0 = Long.MIN_VALUE;
    }
    
    public final ExoPlaybackException A(final Throwable t, final n n, final boolean b, final int n2) {
        int e = 0;
        Label_0058: {
            if (n != null && !this.Q0) {
                this.Q0 = true;
                try {
                    e = ((kgm)this).e(n);
                    e &= 0x7;
                    break Label_0058;
                }
                catch (final ExoPlaybackException ex) {
                    this.Q0 = false;
                }
                finally {
                    this.Q0 = false;
                }
            }
            e = 4;
        }
        final String name = ((z)this).getName();
        final int i0 = this.I0;
        if (n == null) {
            e = 4;
        }
        return new ExoPlaybackException(1, t, n2, name, i0, n, e, b);
    }
    
    public final y8r B() {
        this.G0.d();
        return this.G0;
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
    
    public final int J(final y8r y8r, final DecoderInputBuffer decoderInputBuffer, int n) {
        final mso l0 = this.L0;
        Objects.requireNonNull(l0);
        final int b = l0.b(y8r, decoderInputBuffer, n);
        n = -4;
        if (b == -4) {
            if (((dr2)decoderInputBuffer).j(4)) {
                this.O0 = Long.MIN_VALUE;
                if (!this.P0) {
                    n = -3;
                }
                return n;
            }
            final long j0 = decoderInputBuffer.J0 + this.N0;
            decoderInputBuffer.J0 = j0;
            this.O0 = Math.max(this.O0, j0);
        }
        else if (b == -5) {
            final n n2 = (n)y8r.H0;
            Objects.requireNonNull(n2);
            if (n2.U0 != Long.MAX_VALUE) {
                final n$a a = n2.a();
                a.o = n2.U0 + this.N0;
                y8r.H0 = a.a();
            }
        }
        return b;
    }
    
    public final void b() {
        omi.p(this.K0 == 0);
        this.G0.d();
        this.F();
    }
    
    public final void d() {
        final int k0 = this.K0;
        boolean b = true;
        if (k0 != 1) {
            b = false;
        }
        omi.p(b);
        this.G0.d();
        this.K0 = 0;
        this.L0 = null;
        this.M0 = null;
        this.P0 = false;
        this.C();
    }
    
    public final int g() {
        return this.F0;
    }
    
    public final int getState() {
        return this.K0;
    }
    
    public final mso h() {
        return this.L0;
    }
    
    public final boolean j() {
        return this.O0 == Long.MIN_VALUE;
    }
    
    public final void k() {
        this.P0 = true;
    }
    
    public final void l(final lgm h0, final n[] array, final mso mso, final long o0, final boolean b, final boolean b2, final long n, final long n2) throws ExoPlaybackException {
        omi.p(this.K0 == 0);
        this.H0 = h0;
        this.K0 = 1;
        this.D(b2);
        this.n(array, mso, n, n2);
        this.P0 = false;
        this.E(this.O0 = o0, b);
    }
    
    public void m(final int n, final Object o) throws ExoPlaybackException {
    }
    
    public final void n(final n[] m0, final mso l0, final long o0, final long n0) throws ExoPlaybackException {
        omi.p(this.P0 ^ true);
        this.L0 = l0;
        if (this.O0 == Long.MIN_VALUE) {
            this.O0 = o0;
        }
        this.I(this.M0 = m0, o0, this.N0 = n0);
    }
    
    public final void o() throws IOException {
        final mso l0 = this.L0;
        Objects.requireNonNull(l0);
        l0.d();
    }
    
    public final boolean p() {
        return this.P0;
    }
    
    public final kgm q() {
        return (kgm)this;
    }
    
    public void s(final float n, final float n2) {
    }
    
    public final void start() throws ExoPlaybackException {
        final int k0 = this.K0;
        boolean b = true;
        if (k0 != 1) {
            b = false;
        }
        omi.p(b);
        this.K0 = 2;
        this.G();
    }
    
    public final void stop() {
        omi.p(this.K0 == 2);
        this.K0 = 1;
        this.H();
    }
    
    public final void t(final int i0, final cok j0) {
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public int u() throws ExoPlaybackException {
        return 0;
    }
    
    public final long w() {
        return this.O0;
    }
    
    public final void x(final long o0) throws ExoPlaybackException {
        this.P0 = false;
        this.E(this.O0 = o0, false);
    }
    
    public hsg y() {
        return null;
    }
    
    public final ExoPlaybackException z(final Throwable t, final n n) {
        return this.A(t, n, false, 4002);
    }
}
