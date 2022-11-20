// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.mediacodec;

import java.util.UUID;
import android.media.MediaCodec$CodecException;
import java.util.Collection;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import android.os.SystemClock;
import java.util.List;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer$InsufficientCapacityException;
import android.media.MediaCodec$CryptoException;
import android.annotation.TargetApi;
import android.util.Log;
import android.media.MediaCryptoException;
import android.os.Bundle;
import java.nio.ByteOrder;
import java.util.Objects;
import java.util.ArrayDeque;
import android.media.MediaFormat;
import android.media.MediaCrypto;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.ExoPlaybackException;
import android.media.MediaCodec$BufferInfo;
import java.util.ArrayList;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import com.google.android.exoplayer2.e;

public abstract class MediaCodecRenderer extends e
{
    public static final byte[] h2;
    public boolean A1;
    public boolean B1;
    public boolean C1;
    public boolean D1;
    public boolean E1;
    public n63 F1;
    public long G1;
    public int H1;
    public int I1;
    public ByteBuffer J1;
    public boolean K1;
    public boolean L1;
    public boolean M1;
    public boolean N1;
    public boolean O1;
    public final c$b P0;
    public boolean P1;
    public final com.google.android.exoplayer2.mediacodec.e Q0;
    public int Q1;
    public final boolean R0;
    public int R1;
    public final float S0;
    public int S1;
    public final DecoderInputBuffer T0;
    public boolean T1;
    public final DecoderInputBuffer U0;
    public boolean U1;
    public final DecoderInputBuffer V0;
    public boolean V1;
    public final ns1 W0;
    public long W1;
    public final urs<n> X0;
    public long X1;
    public final ArrayList<Long> Y0;
    public boolean Y1;
    public final MediaCodec$BufferInfo Z0;
    public boolean Z1;
    public final long[] a1;
    public boolean a2;
    public final long[] b1;
    public boolean b2;
    public final long[] c1;
    public ExoPlaybackException c2;
    public n d1;
    public zb8 d2;
    public n e1;
    public long e2;
    public DrmSession f1;
    public long f2;
    public DrmSession g1;
    public int g2;
    public MediaCrypto h1;
    public boolean i1;
    public long j1;
    public float k1;
    public float l1;
    public c m1;
    public n n1;
    public MediaFormat o1;
    public boolean p1;
    public float q1;
    public ArrayDeque<d> r1;
    public MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException s1;
    public d t1;
    public int u1;
    public boolean v1;
    public boolean w1;
    public boolean x1;
    public boolean y1;
    public boolean z1;
    
    static {
        h2 = new byte[] { 0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120 };
    }
    
    public MediaCodecRenderer(final int n, final c$b p4, final com.google.android.exoplayer2.mediacodec.e q0, final float s0) {
        super(n);
        this.P0 = p4;
        Objects.requireNonNull(q0);
        this.Q0 = q0;
        this.R0 = false;
        this.S0 = s0;
        this.T0 = new DecoderInputBuffer(0);
        this.U0 = new DecoderInputBuffer(0);
        this.V0 = new DecoderInputBuffer(2);
        final ns1 w0 = new ns1();
        this.W0 = w0;
        this.X0 = (urs<n>)new urs();
        this.Y0 = new ArrayList<Long>();
        this.Z0 = new MediaCodec$BufferInfo();
        this.k1 = 1.0f;
        this.l1 = 1.0f;
        this.j1 = -9223372036854775807L;
        this.a1 = new long[10];
        this.b1 = new long[10];
        this.c1 = new long[10];
        this.e2 = -9223372036854775807L;
        this.f2 = -9223372036854775807L;
        w0.s(0);
        w0.F0.order(ByteOrder.nativeOrder());
        this.q1 = -1.0f;
        this.u1 = 0;
        this.Q1 = 0;
        this.H1 = -1;
        this.I1 = -1;
        this.G1 = -9223372036854775807L;
        this.W1 = -9223372036854775807L;
        this.X1 = -9223372036854775807L;
        this.R1 = 0;
        this.S1 = 0;
    }
    
    public final boolean A0(final n n) throws ExoPlaybackException {
        if (cnw.a < 23) {
            return true;
        }
        if (this.m1 != null && this.S1 != 3) {
            if (super.I0 != 0) {
                final float l1 = this.l1;
                final n[] k0 = super.K0;
                Objects.requireNonNull(k0);
                final float w = this.W(l1, k0);
                final float q1 = this.q1;
                if (q1 == w) {
                    return true;
                }
                if (w == -1.0f) {
                    this.O();
                    return false;
                }
                if (q1 == -1.0f && w <= this.S0) {
                    return true;
                }
                final Bundle parameters = new Bundle();
                parameters.putFloat("operating-rate", w);
                this.m1.setParameters(parameters);
                this.q1 = w;
            }
        }
        return true;
    }
    
    public final void B0() throws ExoPlaybackException {
        try {
            this.h1.setMediaDrmSession(this.Y(this.g1).b);
            this.u0(this.g1);
            this.R1 = 0;
            this.S1 = 0;
        }
        catch (final MediaCryptoException ex) {
            throw this.A((Throwable)ex, this.d1, false, 6006);
        }
    }
    
    public void C() {
        this.d1 = null;
        this.e2 = -9223372036854775807L;
        this.f2 = -9223372036854775807L;
        this.g2 = 0;
        this.T();
    }
    
    public final void C0(final long n) throws ExoPlaybackException {
        n e1;
        final n n2 = e1 = (n)this.X0.e(n);
        if (n2 == null) {
            e1 = n2;
            if (this.p1) {
                final urs<n> x0 = this.X0;
                synchronized (x0) {
                    Object f;
                    if (x0.d == 0) {
                        f = null;
                    }
                    else {
                        f = x0.f();
                    }
                    monitorexit(x0);
                    final n n3 = (n)f;
                }
            }
        }
        boolean b;
        if (e1 != null) {
            this.e1 = e1;
            b = true;
        }
        else {
            b = false;
        }
        if (b || (this.p1 && this.e1 != null)) {
            this.i0(this.e1, this.o1);
            this.p1 = false;
        }
    }
    
    public void E(final long n, final boolean b) throws ExoPlaybackException {
        this.Y1 = false;
        this.Z1 = false;
        this.b2 = false;
        if (this.M1) {
            this.W0.q();
            this.V0.q();
            this.N1 = false;
        }
        else if (this.T()) {
            this.c0();
        }
        final urs<n> x0 = this.X0;
        synchronized (x0) {
            final int d = x0.d;
            monitorexit(x0);
            if (d > 0) {
                this.a2 = true;
            }
            this.X0.b();
            final int g2 = this.g2;
            if (g2 != 0) {
                this.f2 = this.b1[g2 - 1];
                this.e2 = this.a1[g2 - 1];
                this.g2 = 0;
            }
        }
    }
    
    public final void I(final n[] array, final long e2, final long f2) throws ExoPlaybackException {
        final long f3 = this.f2;
        boolean b = true;
        if (f3 == -9223372036854775807L) {
            if (this.e2 != -9223372036854775807L) {
                b = false;
            }
            omy.k(b);
            this.e2 = e2;
            this.f2 = f2;
        }
        else {
            final int g2 = this.g2;
            final long[] b2 = this.b1;
            if (g2 == b2.length) {
                final long n = b2[g2 - 1];
                final StringBuilder sb = new StringBuilder(65);
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(n);
                Log.w("MediaCodecRenderer", sb.toString());
            }
            else {
                this.g2 = g2 + 1;
            }
            final long[] a1 = this.a1;
            final int g3 = this.g2;
            final int n2 = g3 - 1;
            a1[n2] = e2;
            this.b1[n2] = f2;
            this.c1[g3 - 1] = this.W1;
        }
    }
    
    public final boolean K(final long n, final long n2) throws ExoPlaybackException {
        omy.k(this.Z1 ^ true);
        if (this.W0.w()) {
            final ns1 w0 = this.W0;
            if (!this.n0(n, n2, null, w0.F0, this.I1, 0, w0.M0, w0.H0, ((mq2)w0).p(), ((mq2)this.W0).j(4), this.e1)) {
                return false;
            }
            this.j0(this.W0.L0);
            this.W0.q();
        }
        if (this.Y1) {
            this.Z1 = true;
            return false;
        }
        if (this.N1) {
            omy.k(this.W0.v(this.V0));
            this.N1 = false;
        }
        if (this.O1) {
            if (this.W0.w()) {
                return true;
            }
            this.N();
            this.O1 = false;
            this.c0();
            if (!this.M1) {
                return false;
            }
        }
        omy.k(this.Y1 ^ true);
        final a8r b = this.B();
        this.V0.q();
        while (true) {
            do {
                this.V0.q();
                final int j = this.J(b, this.V0, 0);
                if (j != -5) {
                    if (j != -4) {
                        if (j != -3) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        if (!((mq2)this.V0).j(4)) {
                            if (this.a2) {
                                final n d1 = this.d1;
                                Objects.requireNonNull(d1);
                                this.i0(this.e1 = d1, null);
                                this.a2 = false;
                            }
                            this.V0.t();
                            continue;
                        }
                        this.Y1 = true;
                    }
                }
                else {
                    this.h0(b);
                }
                if (this.W0.w()) {
                    this.W0.t();
                }
                return this.W0.w() || this.Y1 || this.O1;
            } while (this.W0.v(this.V0));
            this.N1 = true;
            continue;
        }
    }
    
    public abstract cc8 L(final d p0, final n p1, final n p2);
    
    public MediaCodecDecoderException M(final Throwable t, final d d) {
        return new MediaCodecDecoderException(t, d);
    }
    
    public final void N() {
        this.O1 = false;
        this.W0.q();
        this.V0.q();
        this.N1 = false;
        this.M1 = false;
    }
    
    public final void O() throws ExoPlaybackException {
        if (this.T1) {
            this.R1 = 1;
            this.S1 = 3;
        }
        else {
            this.p0();
            this.c0();
        }
    }
    
    @TargetApi(23)
    public final boolean P() throws ExoPlaybackException {
        if (this.T1) {
            this.R1 = 1;
            if (this.w1 || this.y1) {
                this.S1 = 3;
                return false;
            }
            this.S1 = 2;
        }
        else {
            this.B0();
        }
        return true;
    }
    
    public final boolean Q(final long n, final long n2) throws ExoPlaybackException {
        Label_0520: {
            if (this.I1 < 0) {
                int i1 = 0;
                Label_0087: {
                    if (this.z1 && this.U1) {
                        try {
                            i1 = this.m1.j(this.Z0);
                            break Label_0087;
                        }
                        catch (final IllegalStateException ex) {
                            this.m0();
                            if (this.Z1) {
                                this.p0();
                            }
                            return false;
                        }
                    }
                    i1 = this.m1.j(this.Z0);
                }
                if (i1 < 0) {
                    if (i1 == -2) {
                        this.V1 = true;
                        final MediaFormat outputFormat = this.m1.getOutputFormat();
                        if (this.u1 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                            this.D1 = true;
                        }
                        else {
                            if (this.B1) {
                                outputFormat.setInteger("channel-count", 1);
                            }
                            this.o1 = outputFormat;
                            this.p1 = true;
                        }
                        return true;
                    }
                    if (this.E1 && (this.Y1 || this.R1 == 2)) {
                        this.m0();
                    }
                    return false;
                }
                else {
                    if (this.D1) {
                        this.D1 = false;
                        this.m1.releaseOutputBuffer(i1, false);
                        return true;
                    }
                    final MediaCodec$BufferInfo z0 = this.Z0;
                    if (z0.size == 0 && (z0.flags & 0x4) != 0x0) {
                        this.m0();
                        return false;
                    }
                    this.I1 = i1;
                    final ByteBuffer b = this.m1.b(i1);
                    if ((this.J1 = b) != null) {
                        b.position(this.Z0.offset);
                        final ByteBuffer j1 = this.J1;
                        final MediaCodec$BufferInfo z2 = this.Z0;
                        j1.limit(z2.offset + z2.size);
                    }
                    if (this.A1) {
                        final MediaCodec$BufferInfo z3 = this.Z0;
                        if (z3.presentationTimeUs == 0L && (z3.flags & 0x4) != 0x0) {
                            final long w1 = this.W1;
                            if (w1 != -9223372036854775807L) {
                                z3.presentationTimeUs = w1;
                            }
                        }
                    }
                    final long presentationTimeUs = this.Z0.presentationTimeUs;
                    while (true) {
                        for (int size = this.Y0.size(), k = 0; k < size; ++k) {
                            if (this.Y0.get(k) == presentationTimeUs) {
                                this.Y0.remove(k);
                                final boolean k2 = true;
                                this.K1 = k2;
                                final long x1 = this.X1;
                                final long presentationTimeUs2 = this.Z0.presentationTimeUs;
                                this.L1 = (x1 == presentationTimeUs2);
                                this.C0(presentationTimeUs2);
                                break Label_0520;
                            }
                        }
                        final boolean k2 = false;
                        continue;
                    }
                }
            }
        }
        if (this.z1 && this.U1) {
            try {
                final c m1 = this.m1;
                final ByteBuffer j2 = this.J1;
                final int i2 = this.I1;
                final MediaCodec$BufferInfo z4 = this.Z0;
                final int flags = z4.flags;
                final long presentationTimeUs3 = z4.presentationTimeUs;
                final boolean k3 = this.K1;
                final boolean l1 = this.L1;
                final n e1 = this.e1;
                try {
                    final boolean b2 = this.n0(n, n2, m1, j2, i2, flags, 1, presentationTimeUs3, k3, l1, e1);
                }
                catch (final IllegalStateException ex2) {}
            }
            catch (final IllegalStateException ex3) {}
            this.m0();
            if (this.Z1) {
                this.p0();
            }
            return false;
        }
        final c m2 = this.m1;
        final ByteBuffer j3 = this.J1;
        final int i3 = this.I1;
        final MediaCodec$BufferInfo z5 = this.Z0;
        final boolean b2 = this.n0(n, n2, m2, j3, i3, z5.flags, 1, z5.presentationTimeUs, this.K1, this.L1, this.e1);
        if (b2) {
            this.j0(this.Z0.presentationTimeUs);
            final boolean b3 = (this.Z0.flags & 0x4) != 0x0;
            this.I1 = -1;
            this.J1 = null;
            if (!b3) {
                return true;
            }
            this.m0();
        }
        return false;
    }
    
    public final boolean R() throws ExoPlaybackException {
        final c m1 = this.m1;
        if (m1 != null && this.R1 != 2) {
            if (!this.Y1) {
                if (this.H1 < 0) {
                    final int i = m1.i();
                    if ((this.H1 = i) < 0) {
                        return false;
                    }
                    this.U0.F0 = this.m1.a(i);
                    this.U0.q();
                }
                if (this.R1 == 1) {
                    if (!this.E1) {
                        this.U1 = true;
                        this.m1.k(this.H1, 0, 0L, 4);
                        this.t0();
                    }
                    this.R1 = 2;
                    return false;
                }
                if (this.C1) {
                    this.C1 = false;
                    this.U0.F0.put(MediaCodecRenderer.h2);
                    this.m1.k(this.H1, 38, 0L, 0);
                    this.t0();
                    return this.T1 = true;
                }
                if (this.Q1 == 1) {
                    for (int j = 0; j < this.n1.Q0.size(); ++j) {
                        this.U0.F0.put((byte[])this.n1.Q0.get(j));
                    }
                    this.Q1 = 2;
                }
                final int position = this.U0.F0.position();
                final a8r b = this.B();
                try {
                    final int k = this.J(b, this.U0, 0);
                    if (this.j()) {
                        this.X1 = this.W1;
                    }
                    if (k == -3) {
                        return false;
                    }
                    if (k == -5) {
                        if (this.Q1 == 2) {
                            this.U0.q();
                            this.Q1 = 1;
                        }
                        this.h0(b);
                        return true;
                    }
                    if (((mq2)this.U0).j(4)) {
                        if (this.Q1 == 2) {
                            this.U0.q();
                            this.Q1 = 1;
                        }
                        this.Y1 = true;
                        if (!this.T1) {
                            this.m0();
                            return false;
                        }
                        try {
                            if (!this.E1) {
                                this.U1 = true;
                                this.m1.k(this.H1, 0, 0L, 4);
                                this.t0();
                            }
                            return false;
                        }
                        catch (final MediaCodec$CryptoException ex) {
                            throw this.A((Throwable)ex, this.d1, false, cnw.u(ex.getErrorCode()));
                        }
                    }
                    if (!this.T1 && !((mq2)this.U0).j(1)) {
                        this.U0.q();
                        if (this.Q1 == 2) {
                            this.Q1 = 1;
                        }
                        return true;
                    }
                    final boolean u = this.U0.u();
                    if (u) {
                        final v67 e0 = this.U0.E0;
                        Objects.requireNonNull(e0);
                        if (position != 0) {
                            if (e0.d == null) {
                                final int[] array = { 0 };
                                e0.d = array;
                                e0.i.numBytesOfClearData = array;
                            }
                            final int[] d = e0.d;
                            d[0] += position;
                        }
                    }
                    if (this.v1 && !u) {
                        final ByteBuffer f0 = this.U0.F0;
                        final byte[] a = g6i.a;
                        final int position2 = f0.position();
                        int n = 0;
                        int n2 = 0;
                        while (true) {
                            final int n3 = n + 1;
                            if (n3 >= position2) {
                                f0.clear();
                                break;
                            }
                            final int n4 = f0.get(n) & 0xFF;
                            int n5;
                            if (n2 == 3) {
                                n5 = n2;
                                if (n4 == 1) {
                                    n5 = n2;
                                    if ((f0.get(n3) & 0x1F) == 0x7) {
                                        final ByteBuffer duplicate = f0.duplicate();
                                        duplicate.position(n - 3);
                                        duplicate.limit(position2);
                                        f0.position(0);
                                        f0.put(duplicate);
                                        break;
                                    }
                                }
                            }
                            else {
                                n5 = n2;
                                if (n4 == 0) {
                                    n5 = n2 + 1;
                                }
                            }
                            n2 = n5;
                            if (n4 != 0) {
                                n2 = 0;
                            }
                            n = n3;
                        }
                        if (this.U0.F0.position() == 0) {
                            return true;
                        }
                        this.v1 = false;
                    }
                    final DecoderInputBuffer u2 = this.U0;
                    final long h0 = u2.H0;
                    final n63 f2 = this.F1;
                    long n6 = h0;
                    if (f2 != null) {
                        final n d2 = this.d1;
                        if (f2.b == 0L) {
                            f2.a = h0;
                        }
                        if (f2.c) {
                            n6 = h0;
                        }
                        else {
                            final ByteBuffer f3 = u2.F0;
                            Objects.requireNonNull(f3);
                            int l = 0;
                            int n7 = 0;
                            while (l < 4) {
                                n7 = (n7 << 8 | (f3.get(l) & 0xFF));
                                ++l;
                            }
                            final int d3 = wrh.d(n7);
                            if (d3 == -1) {
                                f2.c = true;
                                f2.b = 0L;
                                f2.a = u2.H0;
                                Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                n6 = u2.H0;
                            }
                            else {
                                n6 = f2.a((long)d2.c1);
                                f2.b += d3;
                            }
                        }
                        final long w1 = this.W1;
                        final n63 f4 = this.F1;
                        final n d4 = this.d1;
                        Objects.requireNonNull(f4);
                        this.W1 = Math.max(w1, f4.a((long)d4.c1));
                    }
                    if (((mq2)this.U0).p()) {
                        this.Y0.add(n6);
                    }
                    if (this.a2) {
                        this.X0.a(n6, (Object)this.d1);
                        this.a2 = false;
                    }
                    this.W1 = Math.max(this.W1, n6);
                    this.U0.t();
                    if (((mq2)this.U0).m()) {
                        this.a0(this.U0);
                    }
                    this.l0(this.U0);
                    Label_1110: {
                        if (!u) {
                            break Label_1110;
                        }
                        try {
                            this.m1.d(this.H1, this.U0.E0, n6);
                            this.t0();
                            this.T1 = true;
                            this.Q1 = 0;
                            final zb8 d5 = this.d2;
                            ++d5.c;
                            return true;
                            this.m1.k(this.H1, this.U0.F0.limit(), n6, 0);
                        }
                        catch (final MediaCodec$CryptoException ex2) {
                            throw this.A((Throwable)ex2, this.d1, false, cnw.u(ex2.getErrorCode()));
                        }
                    }
                }
                catch (final DecoderInputBuffer$InsufficientCapacityException ex3) {
                    this.e0((Exception)ex3);
                    this.o0(0);
                    this.S();
                    return true;
                }
            }
        }
        return false;
    }
    
    public final void S() {
        try {
            this.m1.flush();
        }
        finally {
            this.r0();
        }
    }
    
    public final boolean T() {
        if (this.m1 == null) {
            return false;
        }
        if (this.S1 != 3 && !this.w1 && (!this.x1 || this.V1) && (!this.y1 || !this.U1)) {
            this.S();
            return false;
        }
        this.p0();
        return true;
    }
    
    public final List<d> U(final boolean b) throws MediaCodecUtil$DecoderQueryException {
        List<d> list2;
        final List<d> list = list2 = this.X(this.Q0, this.d1, b);
        if (list.isEmpty()) {
            list2 = list;
            if (b) {
                final List<d> list3 = list2 = this.X(this.Q0, this.d1, (boolean)(0 != 0));
                if (!list3.isEmpty()) {
                    final String o0 = this.d1.O0;
                    final String value = String.valueOf(list3);
                    final StringBuilder d = x70.D(value.length() + wnj.f(o0, 99), "Drm session requires secure decoder for ", o0, ", but no secure decoder available. Trying to proceed with ", value);
                    d.append(".");
                    Log.w("MediaCodecRenderer", d.toString());
                    list2 = list3;
                }
            }
        }
        return list2;
    }
    
    public boolean V() {
        return false;
    }
    
    public abstract float W(final float p0, final n[] p1);
    
    public abstract List<d> X(final com.google.android.exoplayer2.mediacodec.e p0, final n p1, final boolean p2) throws MediaCodecUtil$DecoderQueryException;
    
    public final hpb Y(final DrmSession drmSession) throws ExoPlaybackException {
        final u67 e = drmSession.e();
        if (e != null && !(e instanceof hpb)) {
            final String value = String.valueOf(e);
            final StringBuilder sb = new StringBuilder(value.length() + 43);
            sb.append("Expecting FrameworkCryptoConfig but found: ");
            sb.append(value);
            throw this.A((Throwable)new IllegalArgumentException(sb.toString()), this.d1, false, 6001);
        }
        return (hpb)e;
    }
    
    public abstract c$a Z(final d p0, final n p1, final MediaCrypto p2, final float p3);
    
    public void a0(final DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }
    
    public boolean b() {
        final n d1 = this.d1;
        final boolean b = true;
        if (d1 != null) {
            boolean b2;
            if (this.j()) {
                b2 = super.N0;
            }
            else {
                final tro j0 = super.J0;
                Objects.requireNonNull(j0);
                b2 = j0.b();
            }
            boolean b3 = b;
            if (b2) {
                return b3;
            }
            final boolean b4 = this.I1 >= 0;
            b3 = b;
            if (b4) {
                return b3;
            }
            if (this.G1 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.G1) {
                b3 = b;
                return b3;
            }
        }
        return false;
    }
    
    public final void b0(final d t1, final MediaCrypto mediaCrypto) throws Exception {
        final String a = t1.a;
        final int a2 = cnw.a;
        final float n = -1.0f;
        float w;
        if (a2 < 23) {
            w = -1.0f;
        }
        else {
            final float l1 = this.l1;
            final n[] k0 = super.K0;
            Objects.requireNonNull(k0);
            w = this.W(l1, k0);
        }
        if (w <= this.S0) {
            w = n;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final c$a z = this.Z(t1, this.d1, mediaCrypto, w);
        if (a2 >= 31) {
            final onk h0 = super.H0;
            Objects.requireNonNull(h0);
            MediaCodecRenderer.MediaCodecRenderer$a.a(z, h0);
        }
        try {
            final String value = String.valueOf(a);
            String concat;
            if (value.length() != 0) {
                concat = "createCodec:".concat(value);
            }
            else {
                concat = new String("createCodec:");
            }
            blz.e(concat);
            this.m1 = this.P0.a(z);
            blz.o();
            final long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.t1 = t1;
            this.q1 = w;
            this.n1 = this.d1;
            int u1 = 0;
            Label_0339: {
                if (a2 <= 25 && "OMX.Exynos.avc.dec.secure".equals(a)) {
                    final String d = cnw.d;
                    if (d.startsWith("SM-T585") || d.startsWith("SM-A510") || d.startsWith("SM-A520") || d.startsWith("SM-J700")) {
                        u1 = 2;
                        break Label_0339;
                    }
                }
                if (a2 < 24 && ("OMX.Nvidia.h264.decode".equals(a) || "OMX.Nvidia.h264.decode.secure".equals(a))) {
                    final String b = cnw.b;
                    if ("flounder".equals(b) || "flounder_lte".equals(b) || "grouper".equals(b) || "tilapia".equals(b)) {
                        u1 = 1;
                        break Label_0339;
                    }
                }
                u1 = 0;
            }
            this.u1 = u1;
            final n n2 = this.n1;
            this.v1 = (a2 < 21 && n2.Q0.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(a));
            boolean w2 = false;
            Label_0484: {
                Label_0481: {
                    if (a2 >= 18 && (a2 != 18 || (!"OMX.SEC.avc.dec".equals(a) && !"OMX.SEC.avc.dec.secure".equals(a)))) {
                        if (a2 == 19 && cnw.d.startsWith("SM-G800")) {
                            if ("OMX.Exynos.avc.dec".equals(a)) {
                                break Label_0481;
                            }
                            if ("OMX.Exynos.avc.dec.secure".equals(a)) {
                                break Label_0481;
                            }
                        }
                        w2 = false;
                        break Label_0484;
                    }
                }
                w2 = true;
            }
            this.w1 = w2;
            this.x1 = (a2 == 29 && "c2.android.aac.decoder".equals(a));
            boolean y1 = false;
            Label_0603: {
                Label_0594: {
                    if (a2 > 23 || !"OMX.google.vorbis.decoder".equals(a)) {
                        if (a2 <= 19) {
                            final String b2 = cnw.b;
                            if (("hb2000".equals(b2) || "stvm8".equals(b2)) && ("OMX.amlogic.avc.decoder.awesome".equals(a) || "OMX.amlogic.avc.decoder.awesome.secure".equals(a))) {
                                break Label_0594;
                            }
                        }
                        y1 = false;
                        break Label_0603;
                    }
                }
                y1 = true;
            }
            this.y1 = y1;
            this.z1 = (a2 == 21 && "OMX.google.aac.decoder".equals(a));
            boolean a3 = false;
            Label_0745: {
                if (a2 < 21 && "OMX.SEC.mp3.dec".equals(a) && "samsung".equals(cnw.c)) {
                    final String b3 = cnw.b;
                    if (b3.startsWith("baffin") || b3.startsWith("grand") || b3.startsWith("fortuna") || b3.startsWith("gprimelte") || b3.startsWith("j2y18lte") || b3.startsWith("ms01")) {
                        a3 = true;
                        break Label_0745;
                    }
                }
                a3 = false;
            }
            this.A1 = a3;
            final n n3 = this.n1;
            this.B1 = (a2 <= 18 && n3.b1 == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(a));
            final String a4 = t1.a;
            this.E1 = ((a2 <= 25 && "OMX.rk.video_decoder.avc".equals(a4)) || (a2 <= 17 && "OMX.allwinner.video.decoder.avc".equals(a4)) || (a2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(a4) || "OMX.broadcom.video_decoder.tunnel.secure".equals(a4))) || ("Amazon".equals(cnw.c) && "AFTS".equals(cnw.d) && t1.f) || this.V());
            this.m1.g();
            if ("c2.android.mp3.decoder".equals(t1.a)) {
                this.F1 = new n63();
            }
            if (super.I0 == 2) {
                this.G1 = SystemClock.elapsedRealtime() + 1000L;
            }
            final zb8 d2 = this.d2;
            ++d2.a;
            this.f0(a, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        }
        finally {
            blz.o();
        }
    }
    
    public final void c0() throws ExoPlaybackException {
        if (this.m1 == null && !this.M1) {
            final n d1 = this.d1;
            if (d1 != null) {
                if (this.g1 == null && this.y0(d1)) {
                    final n d2 = this.d1;
                    this.N();
                    final String o0 = d2.O0;
                    if (!"audio/mp4a-latm".equals(o0) && !"audio/mpeg".equals(o0) && !"audio/opus".equals(o0)) {
                        final ns1 w0 = this.W0;
                        Objects.requireNonNull(w0);
                        w0.N0 = 1;
                    }
                    else {
                        final ns1 w2 = this.W0;
                        Objects.requireNonNull(w2);
                        w2.N0 = 32;
                    }
                    this.M1 = true;
                    return;
                }
                this.u0(this.g1);
                final String o2 = this.d1.O0;
                final DrmSession f1 = this.f1;
                if (f1 != null) {
                    if (this.h1 == null) {
                        final hpb y = this.Y(f1);
                        if (y == null) {
                            if (this.f1.J() == null) {
                                return;
                            }
                        }
                        else {
                            try {
                                final MediaCrypto h1 = new MediaCrypto(y.a, y.b);
                                this.h1 = h1;
                                this.i1 = (!y.c && h1.requiresSecureDecoderComponent(o2));
                            }
                            catch (final MediaCryptoException ex) {
                                throw this.A((Throwable)ex, this.d1, false, 6006);
                            }
                        }
                    }
                    if (hpb.d) {
                        final int state = this.f1.getState();
                        if (state == 1) {
                            final DrmSession$DrmSessionException j = this.f1.J();
                            Objects.requireNonNull(j);
                            throw this.A((Throwable)j, this.d1, false, j.D0);
                        }
                        if (state != 4) {
                            return;
                        }
                    }
                }
                try {
                    this.d0(this.h1, this.i1);
                }
                catch (final MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException ex2) {
                    throw this.A((Throwable)ex2, this.d1, false, 4001);
                }
            }
        }
    }
    
    public final void d0(final MediaCrypto mediaCrypto, final boolean b) throws MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException {
        if (this.r1 == null) {
            try {
                final List<d> u = this.U(b);
                final ArrayDeque<Object> r1 = new ArrayDeque<Object>();
                this.r1 = (ArrayDeque<d>)r1;
                if (this.R0) {
                    r1.addAll(u);
                }
                else if (!u.isEmpty()) {
                    this.r1.add((d)u.get(0));
                }
                this.s1 = null;
            }
            catch (final MediaCodecUtil$DecoderQueryException ex) {
                throw new MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException(this.d1, (Throwable)ex, b, -49998);
            }
        }
        if (!this.r1.isEmpty()) {
            final d d = this.r1.peekFirst();
            while (this.m1 == null) {
                final d d2 = this.r1.peekFirst();
                if (!this.x0(d2)) {
                    return;
                }
                try {
                    this.b0(d2, mediaCrypto);
                    continue;
                }
                catch (final Exception ex2) {
                    Label_0199: {
                        if (d2 != d) {
                            break Label_0199;
                        }
                        try {
                            Log.w("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                            Thread.sleep(50L);
                            this.b0(d2, mediaCrypto);
                            continue;
                            throw ex2;
                        }
                        catch (final Exception ex3) {
                            final String value = String.valueOf(d2);
                            final StringBuilder sb = new StringBuilder(value.length() + 30);
                            sb.append("Failed to initialize decoder: ");
                            sb.append(value);
                            g63.f0("MediaCodecRenderer", sb.toString(), (Throwable)ex3);
                            this.r1.removeFirst();
                            final n d3 = this.d1;
                            final String a = d2.a;
                            final String value2 = String.valueOf(d3);
                            final StringBuilder sb2 = new StringBuilder(value2.length() + wnj.f(a, 23));
                            sb2.append("Decoder init failed: ");
                            sb2.append(a);
                            sb2.append(", ");
                            sb2.append(value2);
                            final String string = sb2.toString();
                            final String o0 = d3.O0;
                            String diagnosticInfo;
                            if (cnw.a >= 21 && ex3 instanceof MediaCodec$CodecException) {
                                diagnosticInfo = ((MediaCodec$CodecException)ex3).getDiagnosticInfo();
                            }
                            else {
                                diagnosticInfo = null;
                            }
                            final MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException s1 = new MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException(string, (Throwable)ex3, o0, b, d2, diagnosticInfo);
                            this.e0((Exception)s1);
                            final MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException s2 = this.s1;
                            if (s2 == null) {
                                this.s1 = s1;
                            }
                            else {
                                this.s1 = new MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException(((Throwable)s2).getMessage(), ((Throwable)s2).getCause(), s2.D0, s2.E0, s2.F0, s2.G0);
                            }
                            if (!this.r1.isEmpty()) {
                                continue;
                            }
                            throw this.s1;
                        }
                    }
                }
                break;
            }
            this.r1 = null;
            return;
        }
        throw new MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException(this.d1, (Throwable)null, b, -49999);
    }
    
    public final int e(final n n) throws ExoPlaybackException {
        try {
            return this.z0(this.Q0, n);
        }
        catch (final MediaCodecUtil$DecoderQueryException ex) {
            throw this.z((Throwable)ex, n);
        }
    }
    
    public abstract void e0(final Exception p0);
    
    public boolean f() {
        return this.Z1;
    }
    
    public abstract void f0(final String p0, final long p1, final long p2);
    
    public abstract void g0(final String p0);
    
    public cc8 h0(final a8r a8r) throws ExoPlaybackException {
        final boolean b = true;
        final boolean b2 = true;
        this.a2 = true;
        final n n = (n)a8r.F0;
        Objects.requireNonNull(n);
        if (n.O0 == null) {
            throw this.A((Throwable)new IllegalArgumentException(), n, false, 4005);
        }
        this.v0((DrmSession)a8r.E0);
        this.d1 = n;
        if (this.M1) {
            this.O1 = true;
            return null;
        }
        final c m1 = this.m1;
        if (m1 == null) {
            this.r1 = null;
            this.c0();
            return null;
        }
        final d t1 = this.t1;
        final n n2 = this.n1;
        final DrmSession f1 = this.f1;
        final DrmSession g1 = this.g1;
        boolean b4 = false;
        Label_0242: {
            Label_0116: {
                if (f1 != g1) {
                    if (g1 != null) {
                        if (f1 != null) {
                            if (cnw.a >= 23) {
                                final UUID e = o63.e;
                                if (!e.equals(f1.c())) {
                                    if (!e.equals(g1.c())) {
                                        final hpb y = this.Y(g1);
                                        if (y != null) {
                                            final boolean b3 = !y.c && g1.f(n.O0);
                                            if (t1.f || !b3) {
                                                break Label_0116;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    b4 = true;
                    break Label_0242;
                }
            }
            b4 = false;
        }
        if (b4) {
            this.O();
            return new cc8(t1.a, n2, n, 0, 128);
        }
        final boolean b5 = this.g1 != this.f1;
        omy.k(!b5 || cnw.a >= 23);
        final cc8 l = this.L(t1, n2, n);
        final int d = l.d;
        int n4 = 0;
        Label_0597: {
            Label_0595: {
                if (d != 0) {
                    Label_0586: {
                        if (d != 1) {
                            if (d != 2) {
                                if (d != 3) {
                                    throw new IllegalStateException();
                                }
                                if (this.A0(n)) {
                                    this.n1 = n;
                                    if (b5 && !this.P()) {
                                        break Label_0586;
                                    }
                                    break Label_0595;
                                }
                            }
                            else if (this.A0(n)) {
                                this.P1 = true;
                                this.Q1 = 1;
                                final int u1 = this.u1;
                                boolean c1 = b2;
                                if (u1 != 2) {
                                    c1 = (u1 == 1 && n.T0 == n2.T0 && n.U0 == n2.U0 && b2);
                                }
                                this.C1 = c1;
                                this.n1 = n;
                                if (b5 && !this.P()) {
                                    break Label_0586;
                                }
                                break Label_0595;
                            }
                        }
                        else if (this.A0(n)) {
                            this.n1 = n;
                            if (b5) {
                                if (!this.P()) {
                                    break Label_0586;
                                }
                                break Label_0595;
                            }
                            else {
                                int n3 = b ? 1 : 0;
                                if (this.T1) {
                                    this.R1 = 1;
                                    if (!this.w1 && !this.y1) {
                                        this.S1 = 1;
                                        n3 = (b ? 1 : 0);
                                    }
                                    else {
                                        this.S1 = 3;
                                        n3 = 0;
                                    }
                                }
                                if (n3 == 0) {
                                    break Label_0586;
                                }
                                break Label_0595;
                            }
                        }
                        n4 = 16;
                        break Label_0597;
                    }
                    n4 = 2;
                    break Label_0597;
                }
                this.O();
            }
            n4 = 0;
        }
        if (l.d != 0 && (this.m1 != m1 || this.S1 == 3)) {
            return new cc8(t1.a, n2, n, 0, n4);
        }
        return l;
    }
    
    public abstract void i0(final n p0, final MediaFormat p1) throws ExoPlaybackException;
    
    public void j0(final long n) {
        while (true) {
            int g2 = this.g2;
            if (g2 == 0 || n < this.c1[0]) {
                break;
            }
            final long[] a1 = this.a1;
            this.e2 = a1[0];
            this.f2 = this.b1[0];
            --g2;
            System.arraycopy(a1, 1, a1, 0, this.g2 = g2);
            final long[] b1 = this.b1;
            System.arraycopy(b1, 1, b1, 0, this.g2);
            final long[] c1 = this.c1;
            System.arraycopy(c1, 1, c1, 0, this.g2);
            this.k0();
        }
    }
    
    public abstract void k0();
    
    public abstract void l0(final DecoderInputBuffer p0) throws ExoPlaybackException;
    
    @TargetApi(23)
    public final void m0() throws ExoPlaybackException {
        final int s1 = this.S1;
        if (s1 != 1) {
            if (s1 != 2) {
                if (s1 != 3) {
                    this.Z1 = true;
                    this.q0();
                }
                else {
                    this.p0();
                    this.c0();
                }
            }
            else {
                this.S();
                this.B0();
            }
        }
        else {
            this.S();
        }
    }
    
    public abstract boolean n0(final long p0, final long p1, final c p2, final ByteBuffer p3, final int p4, final int p5, final int p6, final long p7, final boolean p8, final boolean p9, final n p10) throws ExoPlaybackException;
    
    public final boolean o0(int j) throws ExoPlaybackException {
        final a8r b = this.B();
        this.T0.q();
        j = this.J(b, this.T0, j | 0x4);
        if (j == -5) {
            this.h0(b);
            return true;
        }
        if (j == -4 && ((mq2)this.T0).j(4)) {
            this.Y1 = true;
            this.m0();
        }
        return false;
    }
    
    public final void p0() {
        try {
            final c m1 = this.m1;
            if (m1 != null) {
                m1.release();
                final zb8 d2 = this.d2;
                ++d2.b;
                this.g0(this.t1.a);
            }
            this.m1 = null;
            try {
                final MediaCrypto h1 = this.h1;
                if (h1 != null) {
                    h1.release();
                }
            }
            finally {
                this.h1 = null;
                this.u0(null);
                this.s0();
            }
        }
        finally {
            this.m1 = null;
            try {
                final MediaCrypto h2 = this.h1;
                if (h2 != null) {
                    h2.release();
                }
                this.h1 = null;
                this.u0(null);
                this.s0();
            }
            finally {
                this.h1 = null;
                this.u0(null);
                this.s0();
            }
        }
    }
    
    public void q0() throws ExoPlaybackException {
    }
    
    public void r0() {
        this.t0();
        this.I1 = -1;
        this.J1 = null;
        this.G1 = -9223372036854775807L;
        this.U1 = false;
        this.T1 = false;
        this.C1 = false;
        this.D1 = false;
        this.K1 = false;
        this.L1 = false;
        this.Y0.clear();
        this.W1 = -9223372036854775807L;
        this.X1 = -9223372036854775807L;
        final n63 f1 = this.F1;
        if (f1 != null) {
            f1.a = 0L;
            f1.b = 0L;
            f1.c = false;
        }
        this.R1 = 0;
        this.S1 = 0;
        this.Q1 = (this.P1 ? 1 : 0);
    }
    
    public void s(final float k1, final float l1) throws ExoPlaybackException {
        this.k1 = k1;
        this.l1 = l1;
        this.A0(this.n1);
    }
    
    public final void s0() {
        this.r0();
        this.c2 = null;
        this.F1 = null;
        this.r1 = null;
        this.t1 = null;
        this.n1 = null;
        this.o1 = null;
        this.p1 = false;
        this.V1 = false;
        this.q1 = -1.0f;
        this.u1 = 0;
        this.v1 = false;
        this.w1 = false;
        this.x1 = false;
        this.y1 = false;
        this.z1 = false;
        this.A1 = false;
        this.B1 = false;
        this.E1 = false;
        this.P1 = false;
        this.Q1 = 0;
        this.i1 = false;
    }
    
    public final void t0() {
        this.H1 = -1;
        this.U0.F0 = null;
    }
    
    public final int u() {
        return 8;
    }
    
    public final void u0(final DrmSession f1) {
        final DrmSession f2 = this.f1;
        if (f2 != f1) {
            if (f1 != null) {
                f1.a((com.google.android.exoplayer2.drm.c$a)null);
            }
            if (f2 != null) {
                f2.b((com.google.android.exoplayer2.drm.c$a)null);
            }
        }
        this.f1 = f1;
    }
    
    public final void v(final long n, final long n2) throws ExoPlaybackException {
        final boolean b2 = this.b2;
        final boolean b3 = false;
        if (b2) {
            this.b2 = false;
            this.m0();
        }
        final ExoPlaybackException c2 = this.c2;
        if (c2 == null) {
            try {
                if (this.Z1) {
                    this.q0();
                    return;
                }
                if (this.d1 == null && !this.o0(2)) {
                    return;
                }
                this.c0();
                if (this.M1) {
                    blz.e("bypassRender");
                    while (this.K(n, n2)) {}
                    blz.o();
                }
                else if (this.m1 != null) {
                    final long elapsedRealtime = SystemClock.elapsedRealtime();
                    blz.e("drainAndFeed");
                    while (this.Q(n, n2) && this.w0(elapsedRealtime)) {}
                    while (this.R() && this.w0(elapsedRealtime)) {}
                    blz.o();
                }
                else {
                    final zb8 d2 = this.d2;
                    final int d3 = d2.d;
                    final tro j0 = super.J0;
                    Objects.requireNonNull(j0);
                    d2.d = d3 + j0.h(n - super.L0);
                    this.o0(1);
                }
                final zb8 d4 = this.d2;
                monitorenter(d4);
                monitorexit(d4);
                return;
            }
            catch (final IllegalStateException ex) {
                final int a = cnw.a;
                boolean b4 = false;
                Label_0289: {
                    if (a < 21 || !(ex instanceof MediaCodec$CodecException)) {
                        final StackTraceElement[] stackTrace = ex.getStackTrace();
                        if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                            b4 = false;
                            break Label_0289;
                        }
                    }
                    b4 = true;
                }
                if (b4) {
                    this.e0(ex);
                    boolean b5 = b3;
                    if (a >= 21) {
                        final boolean b6 = ex instanceof MediaCodec$CodecException && ((MediaCodec$CodecException)ex).isRecoverable();
                        b5 = b3;
                        if (b6) {
                            b5 = true;
                        }
                    }
                    if (b5) {
                        this.p0();
                    }
                    throw this.A((Throwable)this.M(ex, this.t1), this.d1, b5, 4003);
                }
                throw ex;
            }
        }
        this.c2 = null;
        throw c2;
    }
    
    public final void v0(final DrmSession g1) {
        final DrmSession g2 = this.g1;
        if (g2 != g1) {
            if (g1 != null) {
                g1.a((com.google.android.exoplayer2.drm.c$a)null);
            }
            if (g2 != null) {
                g2.b((com.google.android.exoplayer2.drm.c$a)null);
            }
        }
        this.g1 = g1;
    }
    
    public final boolean w0(final long n) {
        return this.j1 == -9223372036854775807L || SystemClock.elapsedRealtime() - n < this.j1;
    }
    
    public boolean x0(final d d) {
        return true;
    }
    
    public boolean y0(final n n) {
        return false;
    }
    
    public abstract int z0(final com.google.android.exoplayer2.mediacodec.e p0, final n p1) throws MediaCodecUtil$DecoderQueryException;
}
