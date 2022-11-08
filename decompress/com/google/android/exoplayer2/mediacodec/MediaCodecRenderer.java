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
    public static final byte[] g2;
    public boolean A1;
    public boolean B1;
    public boolean C1;
    public boolean D1;
    public w63 E1;
    public long F1;
    public int G1;
    public int H1;
    public ByteBuffer I1;
    public boolean J1;
    public boolean K1;
    public boolean L1;
    public boolean M1;
    public boolean N1;
    public final c$b O0;
    public boolean O1;
    public final com.google.android.exoplayer2.mediacodec.e P0;
    public int P1;
    public final boolean Q0;
    public int Q1;
    public final float R0;
    public int R1;
    public final DecoderInputBuffer S0;
    public boolean S1;
    public final DecoderInputBuffer T0;
    public boolean T1;
    public final DecoderInputBuffer U0;
    public boolean U1;
    public final rs1 V0;
    public long V1;
    public final drs<n> W0;
    public long W1;
    public final ArrayList<Long> X0;
    public boolean X1;
    public final MediaCodec$BufferInfo Y0;
    public boolean Y1;
    public final long[] Z0;
    public boolean Z1;
    public final long[] a1;
    public boolean a2;
    public final long[] b1;
    public ExoPlaybackException b2;
    public n c1;
    public oc8 c2;
    public n d1;
    public long d2;
    public DrmSession e1;
    public long e2;
    public DrmSession f1;
    public int f2;
    public MediaCrypto g1;
    public boolean h1;
    public long i1;
    public float j1;
    public float k1;
    public c l1;
    public n m1;
    public MediaFormat n1;
    public boolean o1;
    public float p1;
    public ArrayDeque<d> q1;
    public MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException r1;
    public d s1;
    public int t1;
    public boolean u1;
    public boolean v1;
    public boolean w1;
    public boolean x1;
    public boolean y1;
    public boolean z1;
    
    static {
        g2 = new byte[] { 0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120 };
    }
    
    public MediaCodecRenderer(final int n, final c$b o0, final com.google.android.exoplayer2.mediacodec.e p4, final float r0) {
        super(n);
        this.O0 = o0;
        Objects.requireNonNull(p4);
        this.P0 = p4;
        this.Q0 = false;
        this.R0 = r0;
        this.S0 = new DecoderInputBuffer(0);
        this.T0 = new DecoderInputBuffer(0);
        this.U0 = new DecoderInputBuffer(2);
        final rs1 v0 = new rs1();
        this.V0 = v0;
        this.W0 = (drs<n>)new drs();
        this.X0 = new ArrayList<Long>();
        this.Y0 = new MediaCodec$BufferInfo();
        this.j1 = 1.0f;
        this.k1 = 1.0f;
        this.i1 = -9223372036854775807L;
        this.Z0 = new long[10];
        this.a1 = new long[10];
        this.b1 = new long[10];
        this.d2 = -9223372036854775807L;
        this.e2 = -9223372036854775807L;
        ((DecoderInputBuffer)v0).s(0);
        ((DecoderInputBuffer)v0).E0.order(ByteOrder.nativeOrder());
        this.p1 = -1.0f;
        this.t1 = 0;
        this.P1 = 0;
        this.G1 = -1;
        this.H1 = -1;
        this.F1 = -9223372036854775807L;
        this.V1 = -9223372036854775807L;
        this.W1 = -9223372036854775807L;
        this.Q1 = 0;
        this.R1 = 0;
    }
    
    public final boolean A0(final n n) throws ExoPlaybackException {
        if (imw.a < 23) {
            return true;
        }
        if (this.l1 != null && this.R1 != 3) {
            if (super.H0 != 0) {
                final float k1 = this.k1;
                final n[] j0 = super.J0;
                Objects.requireNonNull(j0);
                final float w = this.W(k1, j0);
                final float p = this.p1;
                if (p == w) {
                    return true;
                }
                if (w == -1.0f) {
                    this.O();
                    return false;
                }
                if (p == -1.0f && w <= this.R0) {
                    return true;
                }
                final Bundle parameters = new Bundle();
                parameters.putFloat("operating-rate", w);
                this.l1.setParameters(parameters);
                this.p1 = w;
            }
        }
        return true;
    }
    
    public final void B0() throws ExoPlaybackException {
        try {
            this.g1.setMediaDrmSession(this.Y(this.f1).b);
            this.u0(this.f1);
            this.Q1 = 0;
            this.R1 = 0;
        }
        catch (final MediaCryptoException ex) {
            throw this.A((Throwable)ex, this.c1, false, 6006);
        }
    }
    
    @Override
    public void C() {
        this.c1 = null;
        this.d2 = -9223372036854775807L;
        this.e2 = -9223372036854775807L;
        this.f2 = 0;
        this.T();
    }
    
    public final void C0(final long n) throws ExoPlaybackException {
        n d1;
        final n n2 = d1 = (n)this.W0.e(n);
        if (n2 == null) {
            d1 = n2;
            if (this.o1) {
                final drs<n> w0 = this.W0;
                synchronized (w0) {
                    Object f;
                    if (w0.d == 0) {
                        f = null;
                    }
                    else {
                        f = w0.f();
                    }
                    monitorexit(w0);
                    final n n3 = (n)f;
                }
            }
        }
        boolean b;
        if (d1 != null) {
            this.d1 = d1;
            b = true;
        }
        else {
            b = false;
        }
        if (b || (this.o1 && this.d1 != null)) {
            this.i0(this.d1, this.n1);
            this.o1 = false;
        }
    }
    
    @Override
    public void E(final long n, final boolean b) throws ExoPlaybackException {
        this.X1 = false;
        this.Y1 = false;
        this.a2 = false;
        if (this.L1) {
            this.V0.q();
            this.U0.q();
            this.M1 = false;
        }
        else if (this.T()) {
            this.c0();
        }
        final drs<n> w0 = this.W0;
        synchronized (w0) {
            final int d = w0.d;
            monitorexit(w0);
            if (d > 0) {
                this.Z1 = true;
            }
            this.W0.b();
            final int f2 = this.f2;
            if (f2 != 0) {
                this.e2 = this.a1[f2 - 1];
                this.d2 = this.Z0[f2 - 1];
                this.f2 = 0;
            }
        }
    }
    
    @Override
    public final void I(final n[] array, final long d2, final long e2) throws ExoPlaybackException {
        final long e3 = this.e2;
        boolean b = true;
        if (e3 == -9223372036854775807L) {
            if (this.d2 != -9223372036854775807L) {
                b = false;
            }
            ri4.t(b);
            this.d2 = d2;
            this.e2 = e2;
        }
        else {
            final int f2 = this.f2;
            final long[] a1 = this.a1;
            if (f2 == a1.length) {
                final long n = a1[f2 - 1];
                final StringBuilder sb = new StringBuilder(65);
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(n);
                Log.w("MediaCodecRenderer", sb.toString());
            }
            else {
                this.f2 = f2 + 1;
            }
            final long[] z0 = this.Z0;
            final int f3 = this.f2;
            final int n2 = f3 - 1;
            z0[n2] = d2;
            this.a1[n2] = e2;
            this.b1[f3 - 1] = this.V1;
        }
    }
    
    public final boolean K(final long n, final long n2) throws ExoPlaybackException {
        ri4.t(this.Y1 ^ true);
        if (this.V0.w()) {
            final rs1 v0 = this.V0;
            if (!this.n0(n, n2, null, ((DecoderInputBuffer)v0).E0, this.H1, 0, v0.L0, ((DecoderInputBuffer)v0).G0, ((vq2)v0).p(), ((vq2)this.V0).j(4), this.d1)) {
                return false;
            }
            this.j0(this.V0.K0);
            this.V0.q();
        }
        if (this.X1) {
            this.Y1 = true;
            return false;
        }
        if (this.M1) {
            ri4.t(this.V0.v(this.U0));
            this.M1 = false;
        }
        if (this.N1) {
            if (this.V0.w()) {
                return true;
            }
            this.N();
            this.N1 = false;
            this.c0();
            if (!this.L1) {
                return false;
            }
        }
        ri4.t(this.X1 ^ true);
        final v53 b = this.B();
        this.U0.q();
        while (true) {
            do {
                this.U0.q();
                final int j = this.J(b, this.U0, 0);
                if (j != -5) {
                    if (j != -4) {
                        if (j != -3) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        if (!((vq2)this.U0).j(4)) {
                            if (this.Z1) {
                                final n c1 = this.c1;
                                Objects.requireNonNull(c1);
                                this.i0(this.d1 = c1, null);
                                this.Z1 = false;
                            }
                            this.U0.t();
                            continue;
                        }
                        this.X1 = true;
                    }
                }
                else {
                    this.h0(b);
                }
                if (this.V0.w()) {
                    ((DecoderInputBuffer)this.V0).t();
                }
                return this.V0.w() || this.X1 || this.N1;
            } while (this.V0.v(this.U0));
            this.M1 = true;
            continue;
        }
    }
    
    public abstract rc8 L(final d p0, final n p1, final n p2);
    
    public MediaCodecDecoderException M(final Throwable t, final d d) {
        return new MediaCodecDecoderException(t, d);
    }
    
    public final void N() {
        this.N1 = false;
        this.V0.q();
        this.U0.q();
        this.M1 = false;
        this.L1 = false;
    }
    
    public final void O() throws ExoPlaybackException {
        if (this.S1) {
            this.Q1 = 1;
            this.R1 = 3;
        }
        else {
            this.p0();
            this.c0();
        }
    }
    
    @TargetApi(23)
    public final boolean P() throws ExoPlaybackException {
        if (this.S1) {
            this.Q1 = 1;
            if (this.v1 || this.x1) {
                this.R1 = 3;
                return false;
            }
            this.R1 = 2;
        }
        else {
            this.B0();
        }
        return true;
    }
    
    public final boolean Q(final long n, final long n2) throws ExoPlaybackException {
        Label_0520: {
            if (this.H1 < 0) {
                int h1 = 0;
                Label_0087: {
                    if (this.y1 && this.T1) {
                        try {
                            h1 = this.l1.j(this.Y0);
                            break Label_0087;
                        }
                        catch (final IllegalStateException ex) {
                            this.m0();
                            if (this.Y1) {
                                this.p0();
                            }
                            return false;
                        }
                    }
                    h1 = this.l1.j(this.Y0);
                }
                if (h1 < 0) {
                    if (h1 == -2) {
                        this.U1 = true;
                        final MediaFormat outputFormat = this.l1.getOutputFormat();
                        if (this.t1 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                            this.C1 = true;
                        }
                        else {
                            if (this.A1) {
                                outputFormat.setInteger("channel-count", 1);
                            }
                            this.n1 = outputFormat;
                            this.o1 = true;
                        }
                        return true;
                    }
                    if (this.D1 && (this.X1 || this.Q1 == 2)) {
                        this.m0();
                    }
                    return false;
                }
                else {
                    if (this.C1) {
                        this.C1 = false;
                        this.l1.releaseOutputBuffer(h1, false);
                        return true;
                    }
                    final MediaCodec$BufferInfo y0 = this.Y0;
                    if (y0.size == 0 && (y0.flags & 0x4) != 0x0) {
                        this.m0();
                        return false;
                    }
                    this.H1 = h1;
                    final ByteBuffer b = this.l1.b(h1);
                    if ((this.I1 = b) != null) {
                        b.position(this.Y0.offset);
                        final ByteBuffer i1 = this.I1;
                        final MediaCodec$BufferInfo y2 = this.Y0;
                        i1.limit(y2.offset + y2.size);
                    }
                    if (this.z1) {
                        final MediaCodec$BufferInfo y3 = this.Y0;
                        if (y3.presentationTimeUs == 0L && (y3.flags & 0x4) != 0x0) {
                            final long v1 = this.V1;
                            if (v1 != -9223372036854775807L) {
                                y3.presentationTimeUs = v1;
                            }
                        }
                    }
                    final long presentationTimeUs = this.Y0.presentationTimeUs;
                    while (true) {
                        for (int size = this.X0.size(), j = 0; j < size; ++j) {
                            if (this.X0.get(j) == presentationTimeUs) {
                                this.X0.remove(j);
                                final boolean j2 = true;
                                this.J1 = j2;
                                final long w1 = this.W1;
                                final long presentationTimeUs2 = this.Y0.presentationTimeUs;
                                this.K1 = (w1 == presentationTimeUs2);
                                this.C0(presentationTimeUs2);
                                break Label_0520;
                            }
                        }
                        final boolean j2 = false;
                        continue;
                    }
                }
            }
        }
        if (this.y1 && this.T1) {
            try {
                final c l1 = this.l1;
                final ByteBuffer i2 = this.I1;
                final int h2 = this.H1;
                final MediaCodec$BufferInfo y4 = this.Y0;
                final int flags = y4.flags;
                final long presentationTimeUs3 = y4.presentationTimeUs;
                final boolean j3 = this.J1;
                final boolean k1 = this.K1;
                final n d1 = this.d1;
                try {
                    final boolean b2 = this.n0(n, n2, l1, i2, h2, flags, 1, presentationTimeUs3, j3, k1, d1);
                }
                catch (final IllegalStateException ex2) {}
            }
            catch (final IllegalStateException ex3) {}
            this.m0();
            if (this.Y1) {
                this.p0();
            }
            return false;
        }
        final c l2 = this.l1;
        final ByteBuffer i3 = this.I1;
        final int h3 = this.H1;
        final MediaCodec$BufferInfo y5 = this.Y0;
        final boolean b2 = this.n0(n, n2, l2, i3, h3, y5.flags, 1, y5.presentationTimeUs, this.J1, this.K1, this.d1);
        if (b2) {
            this.j0(this.Y0.presentationTimeUs);
            final boolean b3 = (this.Y0.flags & 0x4) != 0x0;
            this.H1 = -1;
            this.I1 = null;
            if (!b3) {
                return true;
            }
            this.m0();
        }
        return false;
    }
    
    public final boolean R() throws ExoPlaybackException {
        final c l1 = this.l1;
        if (l1 != null && this.Q1 != 2) {
            if (!this.X1) {
                if (this.G1 < 0) {
                    final int i = l1.i();
                    if ((this.G1 = i) < 0) {
                        return false;
                    }
                    this.T0.E0 = this.l1.a(i);
                    this.T0.q();
                }
                if (this.Q1 == 1) {
                    if (!this.D1) {
                        this.T1 = true;
                        this.l1.k(this.G1, 0, 0L, 4);
                        this.t0();
                    }
                    this.Q1 = 2;
                    return false;
                }
                if (this.B1) {
                    this.B1 = false;
                    this.T0.E0.put(MediaCodecRenderer.g2);
                    this.l1.k(this.G1, 38, 0L, 0);
                    this.t0();
                    return this.S1 = true;
                }
                if (this.P1 == 1) {
                    for (int j = 0; j < this.m1.P0.size(); ++j) {
                        this.T0.E0.put((byte[])this.m1.P0.get(j));
                    }
                    this.P1 = 2;
                }
                final int position = this.T0.E0.position();
                final v53 b = this.B();
                try {
                    final int k = this.J(b, this.T0, 0);
                    if (this.j()) {
                        this.W1 = this.V1;
                    }
                    if (k == -3) {
                        return false;
                    }
                    if (k == -5) {
                        if (this.P1 == 2) {
                            this.T0.q();
                            this.P1 = 1;
                        }
                        this.h0(b);
                        return true;
                    }
                    if (((vq2)this.T0).j(4)) {
                        if (this.P1 == 2) {
                            this.T0.q();
                            this.P1 = 1;
                        }
                        this.X1 = true;
                        if (!this.S1) {
                            this.m0();
                            return false;
                        }
                        try {
                            if (!this.D1) {
                                this.T1 = true;
                                this.l1.k(this.G1, 0, 0L, 4);
                                this.t0();
                            }
                            return false;
                        }
                        catch (final MediaCodec$CryptoException ex) {
                            throw this.A((Throwable)ex, this.c1, false, imw.u(ex.getErrorCode()));
                        }
                    }
                    if (!this.S1 && !((vq2)this.T0).j(1)) {
                        this.T0.q();
                        if (this.P1 == 2) {
                            this.P1 = 1;
                        }
                        return true;
                    }
                    final boolean u = this.T0.u();
                    if (u) {
                        final r77 d0 = this.T0.D0;
                        Objects.requireNonNull(d0);
                        if (position != 0) {
                            if (d0.d == null) {
                                final int[] array = { 0 };
                                d0.d = array;
                                d0.i.numBytesOfClearData = array;
                            }
                            final int[] d2 = d0.d;
                            d2[0] += position;
                        }
                    }
                    if (this.u1 && !u) {
                        final ByteBuffer e0 = this.T0.E0;
                        final byte[] a = e6i.a;
                        final int position2 = e0.position();
                        int n = 0;
                        int n2 = 0;
                        while (true) {
                            final int n3 = n + 1;
                            if (n3 >= position2) {
                                e0.clear();
                                break;
                            }
                            final int n4 = e0.get(n) & 0xFF;
                            int n5;
                            if (n2 == 3) {
                                n5 = n2;
                                if (n4 == 1) {
                                    n5 = n2;
                                    if ((e0.get(n3) & 0x1F) == 0x7) {
                                        final ByteBuffer duplicate = e0.duplicate();
                                        duplicate.position(n - 3);
                                        duplicate.limit(position2);
                                        e0.position(0);
                                        e0.put(duplicate);
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
                        if (this.T0.E0.position() == 0) {
                            return true;
                        }
                        this.u1 = false;
                    }
                    final DecoderInputBuffer t0 = this.T0;
                    long a2 = t0.G0;
                    final w63 e2 = this.E1;
                    long n6 = a2;
                    if (e2 != null) {
                        final n c1 = this.c1;
                        if (e2.b == 0L) {
                            e2.a = a2;
                        }
                        if (!e2.c) {
                            final ByteBuffer e3 = t0.E0;
                            Objects.requireNonNull(e3);
                            int n7 = 0;
                            int n8 = 0;
                            while (n7 < 4) {
                                n8 = (n8 << 8 | (e3.get(n7) & 0xFF));
                                ++n7;
                            }
                            final int d3 = rrh.d(n8);
                            if (d3 == -1) {
                                e2.c = true;
                                e2.b = 0L;
                                e2.a = t0.G0;
                                Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                a2 = t0.G0;
                            }
                            else {
                                a2 = e2.a((long)c1.b1);
                                e2.b += d3;
                            }
                        }
                        final long v1 = this.V1;
                        final w63 e4 = this.E1;
                        final n c2 = this.c1;
                        Objects.requireNonNull(e4);
                        this.V1 = Math.max(v1, e4.a((long)c2.b1));
                        n6 = a2;
                    }
                    if (((vq2)this.T0).p()) {
                        this.X0.add(n6);
                    }
                    if (this.Z1) {
                        this.W0.a(n6, (Object)this.c1);
                        this.Z1 = false;
                    }
                    this.V1 = Math.max(this.V1, n6);
                    this.T0.t();
                    if (((vq2)this.T0).m()) {
                        this.a0(this.T0);
                    }
                    this.l0(this.T0);
                    Label_1077: {
                        if (!u) {
                            break Label_1077;
                        }
                        try {
                            this.l1.d(this.G1, this.T0.D0, n6);
                            this.t0();
                            this.S1 = true;
                            this.P1 = 0;
                            final oc8 c3 = this.c2;
                            ++c3.c;
                            return true;
                            this.l1.k(this.G1, this.T0.E0.limit(), n6, 0);
                        }
                        catch (final MediaCodec$CryptoException ex2) {
                            throw this.A((Throwable)ex2, this.c1, false, imw.u(ex2.getErrorCode()));
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
            this.l1.flush();
        }
        finally {
            this.r0();
        }
    }
    
    public final boolean T() {
        if (this.l1 == null) {
            return false;
        }
        if (this.R1 != 3 && !this.v1 && (!this.w1 || this.U1) && (!this.x1 || !this.T1)) {
            this.S();
            return false;
        }
        this.p0();
        return true;
    }
    
    public final List<d> U(final boolean b) throws MediaCodecUtil$DecoderQueryException {
        List<d> list2;
        final List<d> list = list2 = this.X(this.P0, this.c1, b);
        if (list.isEmpty()) {
            list2 = list;
            if (b) {
                final List<d> list3 = list2 = this.X(this.P0, this.c1, (boolean)(0 != 0));
                if (!list3.isEmpty()) {
                    final String n0 = this.c1.N0;
                    final String value = String.valueOf(list3);
                    final StringBuilder n2 = xpa.n(value.length() + dia.o(n0, 99), "Drm session requires secure decoder for ", n0, ", but no secure decoder available. Trying to proceed with ", value);
                    n2.append(".");
                    Log.w("MediaCodecRenderer", n2.toString());
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
    
    public final lqb Y(final DrmSession drmSession) throws ExoPlaybackException {
        final q77 e = drmSession.e();
        if (e != null && !(e instanceof lqb)) {
            final String value = String.valueOf(e);
            final StringBuilder sb = new StringBuilder(value.length() + 43);
            sb.append("Expecting FrameworkCryptoConfig but found: ");
            sb.append(value);
            throw this.A(new IllegalArgumentException(sb.toString()), this.c1, false, 6001);
        }
        return (lqb)e;
    }
    
    public abstract c$a Z(final d p0, final n p1, final MediaCrypto p2, final float p3);
    
    public void a0(final DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }
    
    @Override
    public boolean b() {
        final n c1 = this.c1;
        final boolean b = true;
        if (c1 != null) {
            boolean b2;
            if (this.j()) {
                b2 = super.M0;
            }
            else {
                final bro i0 = super.I0;
                Objects.requireNonNull(i0);
                b2 = i0.b();
            }
            boolean b3 = b;
            if (b2) {
                return b3;
            }
            final boolean b4 = this.H1 >= 0;
            b3 = b;
            if (b4) {
                return b3;
            }
            if (this.F1 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.F1) {
                b3 = b;
                return b3;
            }
        }
        return false;
    }
    
    public final void b0(final d s1, final MediaCrypto mediaCrypto) throws Exception {
        final String a = s1.a;
        final int a2 = imw.a;
        final float n = -1.0f;
        float w;
        if (a2 < 23) {
            w = -1.0f;
        }
        else {
            final float k1 = this.k1;
            final n[] j0 = super.J0;
            Objects.requireNonNull(j0);
            w = this.W(k1, j0);
        }
        if (w <= this.R0) {
            w = n;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final c$a z = this.Z(s1, this.c1, mediaCrypto, w);
        if (a2 >= 31) {
            final hnk g0 = super.G0;
            Objects.requireNonNull(g0);
            MediaCodecRenderer.MediaCodecRenderer$a.a(z, g0);
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
            nkz.h(concat);
            this.l1 = this.O0.a(z);
            nkz.l();
            final long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.s1 = s1;
            this.p1 = w;
            this.m1 = this.c1;
            int t1 = 0;
            Label_0342: {
                if (a2 <= 25 && "OMX.Exynos.avc.dec.secure".equals(a)) {
                    final String d = imw.d;
                    if (d.startsWith("SM-T585") || d.startsWith("SM-A510") || d.startsWith("SM-A520") || d.startsWith("SM-J700")) {
                        t1 = 2;
                        break Label_0342;
                    }
                }
                if (a2 < 24 && ("OMX.Nvidia.h264.decode".equals(a) || "OMX.Nvidia.h264.decode.secure".equals(a))) {
                    final String b = imw.b;
                    if ("flounder".equals(b) || "flounder_lte".equals(b) || "grouper".equals(b) || "tilapia".equals(b)) {
                        t1 = 1;
                        break Label_0342;
                    }
                }
                t1 = 0;
            }
            this.t1 = t1;
            final n m1 = this.m1;
            this.u1 = (a2 < 21 && m1.P0.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(a));
            boolean v1 = false;
            Label_0482: {
                Label_0479: {
                    if (a2 >= 18 && (a2 != 18 || (!"OMX.SEC.avc.dec".equals(a) && !"OMX.SEC.avc.dec.secure".equals(a)))) {
                        if (a2 == 19 && imw.d.startsWith("SM-G800")) {
                            if ("OMX.Exynos.avc.dec".equals(a)) {
                                break Label_0479;
                            }
                            if ("OMX.Exynos.avc.dec.secure".equals(a)) {
                                break Label_0479;
                            }
                        }
                        v1 = false;
                        break Label_0482;
                    }
                }
                v1 = true;
            }
            this.v1 = v1;
            this.w1 = (a2 == 29 && "c2.android.aac.decoder".equals(a));
            boolean x1 = false;
            Label_0597: {
                Label_0588: {
                    if (a2 > 23 || !"OMX.google.vorbis.decoder".equals(a)) {
                        if (a2 <= 19) {
                            final String b2 = imw.b;
                            if (("hb2000".equals(b2) || "stvm8".equals(b2)) && ("OMX.amlogic.avc.decoder.awesome".equals(a) || "OMX.amlogic.avc.decoder.awesome.secure".equals(a))) {
                                break Label_0588;
                            }
                        }
                        x1 = false;
                        break Label_0597;
                    }
                }
                x1 = true;
            }
            this.x1 = x1;
            this.y1 = (a2 == 21 && "OMX.google.aac.decoder".equals(a));
            boolean z2 = false;
            Label_0737: {
                if (a2 < 21 && "OMX.SEC.mp3.dec".equals(a) && "samsung".equals(imw.c)) {
                    final String b3 = imw.b;
                    if (b3.startsWith("baffin") || b3.startsWith("grand") || b3.startsWith("fortuna") || b3.startsWith("gprimelte") || b3.startsWith("j2y18lte") || b3.startsWith("ms01")) {
                        z2 = true;
                        break Label_0737;
                    }
                }
                z2 = false;
            }
            this.z1 = z2;
            final n m2 = this.m1;
            this.A1 = (a2 <= 18 && m2.a1 == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(a));
            final String a3 = s1.a;
            this.D1 = ((a2 <= 25 && "OMX.rk.video_decoder.avc".equals(a3)) || (a2 <= 17 && "OMX.allwinner.video.decoder.avc".equals(a3)) || (a2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(a3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(a3))) || ("Amazon".equals(imw.c) && "AFTS".equals(imw.d) && s1.f) || this.V());
            this.l1.g();
            if ("c2.android.mp3.decoder".equals(s1.a)) {
                this.E1 = new w63();
            }
            if (super.H0 == 2) {
                this.F1 = SystemClock.elapsedRealtime() + 1000L;
            }
            final oc8 c2 = this.c2;
            ++c2.a;
            this.f0(a, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        }
        finally {
            nkz.l();
        }
    }
    
    public final void c0() throws ExoPlaybackException {
        if (this.l1 == null && !this.L1) {
            final n c1 = this.c1;
            if (c1 != null) {
                if (this.f1 == null && this.y0(c1)) {
                    final n c2 = this.c1;
                    this.N();
                    final String n0 = c2.N0;
                    if (!"audio/mp4a-latm".equals(n0) && !"audio/mpeg".equals(n0) && !"audio/opus".equals(n0)) {
                        final rs1 v0 = this.V0;
                        Objects.requireNonNull(v0);
                        v0.M0 = 1;
                    }
                    else {
                        final rs1 v2 = this.V0;
                        Objects.requireNonNull(v2);
                        v2.M0 = 32;
                    }
                    this.L1 = true;
                    return;
                }
                this.u0(this.f1);
                final String n2 = this.c1.N0;
                final DrmSession e1 = this.e1;
                if (e1 != null) {
                    if (this.g1 == null) {
                        final lqb y = this.Y(e1);
                        if (y == null) {
                            if (this.e1.K() == null) {
                                return;
                            }
                        }
                        else {
                            try {
                                final MediaCrypto g1 = new MediaCrypto(y.a, y.b);
                                this.g1 = g1;
                                this.h1 = (!y.c && g1.requiresSecureDecoderComponent(n2));
                            }
                            catch (final MediaCryptoException ex) {
                                throw this.A((Throwable)ex, this.c1, false, 6006);
                            }
                        }
                    }
                    if (lqb.d) {
                        final int state = this.e1.getState();
                        if (state == 1) {
                            final DrmSession$DrmSessionException k = this.e1.K();
                            Objects.requireNonNull(k);
                            throw this.A((Throwable)k, this.c1, false, k.C0);
                        }
                        if (state != 4) {
                            return;
                        }
                    }
                }
                try {
                    this.d0(this.g1, this.h1);
                }
                catch (final MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException ex2) {
                    throw this.A((Throwable)ex2, this.c1, false, 4001);
                }
            }
        }
    }
    
    public final void d0(final MediaCrypto mediaCrypto, final boolean b) throws MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException {
        if (this.q1 == null) {
            try {
                final List<d> u = this.U(b);
                final ArrayDeque<Object> q1 = new ArrayDeque<Object>();
                this.q1 = (ArrayDeque<d>)q1;
                if (this.Q0) {
                    q1.addAll(u);
                }
                else if (!u.isEmpty()) {
                    this.q1.add((d)u.get(0));
                }
                this.r1 = null;
            }
            catch (final MediaCodecUtil$DecoderQueryException ex) {
                throw new MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException(this.c1, (Throwable)ex, b, -49998);
            }
        }
        if (!this.q1.isEmpty()) {
            final d d = this.q1.peekFirst();
            while (this.l1 == null) {
                final d d2 = this.q1.peekFirst();
                if (!this.x0(d2)) {
                    return;
                }
                try {
                    this.b0(d2, mediaCrypto);
                    continue;
                }
                catch (final Exception ex2) {
                    Label_0193: {
                        if (d2 != d) {
                            break Label_0193;
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
                            dml.F0("MediaCodecRenderer", sb.toString(), (Throwable)ex3);
                            this.q1.removeFirst();
                            final n c1 = this.c1;
                            final String a = d2.a;
                            final String value2 = String.valueOf(c1);
                            final StringBuilder sb2 = new StringBuilder(value2.length() + dia.o(a, 23));
                            sb2.append("Decoder init failed: ");
                            sb2.append(a);
                            sb2.append(", ");
                            sb2.append(value2);
                            final String string = sb2.toString();
                            final String n0 = c1.N0;
                            String diagnosticInfo;
                            if (imw.a >= 21 && ex3 instanceof MediaCodec$CodecException) {
                                diagnosticInfo = ((MediaCodec$CodecException)ex3).getDiagnosticInfo();
                            }
                            else {
                                diagnosticInfo = null;
                            }
                            final MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException r1 = new MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException(string, (Throwable)ex3, n0, b, d2, diagnosticInfo);
                            this.e0((Exception)r1);
                            final MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException r2 = this.r1;
                            if (r2 == null) {
                                this.r1 = r1;
                            }
                            else {
                                this.r1 = new MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException(((Throwable)r2).getMessage(), ((Throwable)r2).getCause(), r2.C0, r2.D0, r2.E0, r2.F0);
                            }
                            if (!this.q1.isEmpty()) {
                                continue;
                            }
                            throw this.r1;
                        }
                    }
                }
                break;
            }
            this.q1 = null;
            return;
        }
        throw new MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException(this.c1, (Throwable)null, b, -49999);
    }
    
    @Override
    public final int e(final n n) throws ExoPlaybackException {
        try {
            return this.z0(this.P0, n);
        }
        catch (final MediaCodecUtil$DecoderQueryException ex) {
            throw this.z((Throwable)ex, n);
        }
    }
    
    public abstract void e0(final Exception p0);
    
    @Override
    public boolean f() {
        return this.Y1;
    }
    
    public abstract void f0(final String p0, final long p1, final long p2);
    
    public abstract void g0(final String p0);
    
    public rc8 h0(final v53 v53) throws ExoPlaybackException {
        final boolean b = true;
        final boolean b2 = true;
        this.Z1 = true;
        final n n = (n)v53.E0;
        Objects.requireNonNull(n);
        if (n.N0 == null) {
            throw this.A(new IllegalArgumentException(), n, false, 4005);
        }
        this.v0((DrmSession)v53.D0);
        this.c1 = n;
        if (this.L1) {
            this.N1 = true;
            return null;
        }
        final c l1 = this.l1;
        if (l1 == null) {
            this.q1 = null;
            this.c0();
            return null;
        }
        final d s1 = this.s1;
        final n m1 = this.m1;
        final DrmSession e1 = this.e1;
        final DrmSession f1 = this.f1;
        boolean b4 = false;
        Label_0242: {
            Label_0114: {
                if (e1 != f1) {
                    if (f1 != null) {
                        if (e1 != null) {
                            if (imw.a >= 23) {
                                final UUID e2 = x63.e;
                                if (!e2.equals(e1.c())) {
                                    if (!e2.equals(f1.c())) {
                                        final lqb y = this.Y(f1);
                                        if (y != null) {
                                            final boolean b3 = !y.c && f1.f(n.N0);
                                            if (s1.f || !b3) {
                                                break Label_0114;
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
            return new rc8(s1.a, m1, n, 0, 128);
        }
        final boolean b5 = this.f1 != this.e1;
        ri4.t(!b5 || imw.a >= 23);
        final rc8 i = this.L(s1, m1, n);
        final int d = i.d;
        int n3 = 0;
        Label_0613: {
            Label_0610: {
                if (d != 0) {
                    Label_0600: {
                        if (d != 1) {
                            if (d != 2) {
                                if (d != 3) {
                                    throw new IllegalStateException();
                                }
                                if (this.A0(n)) {
                                    this.m1 = n;
                                    if (b5 && !this.P()) {
                                        break Label_0600;
                                    }
                                    break Label_0610;
                                }
                            }
                            else if (this.A0(n)) {
                                this.O1 = true;
                                this.P1 = 1;
                                final int t1 = this.t1;
                                boolean b6 = b2;
                                if (t1 != 2) {
                                    b6 = (t1 == 1 && n.S0 == m1.S0 && n.T0 == m1.T0 && b2);
                                }
                                this.B1 = b6;
                                this.m1 = n;
                                if (b5 && !this.P()) {
                                    break Label_0600;
                                }
                                break Label_0610;
                            }
                        }
                        else if (this.A0(n)) {
                            this.m1 = n;
                            if (b5) {
                                if (!this.P()) {
                                    break Label_0600;
                                }
                                break Label_0610;
                            }
                            else {
                                int n2 = b ? 1 : 0;
                                if (this.S1) {
                                    this.Q1 = 1;
                                    if (!this.v1 && !this.x1) {
                                        this.R1 = 1;
                                        n2 = (b ? 1 : 0);
                                    }
                                    else {
                                        this.R1 = 3;
                                        n2 = 0;
                                    }
                                }
                                if (n2 == 0) {
                                    break Label_0600;
                                }
                                break Label_0610;
                            }
                        }
                        n3 = 16;
                        break Label_0613;
                    }
                    n3 = 2;
                    break Label_0613;
                }
                this.O();
            }
            n3 = 0;
        }
        if (i.d != 0 && (this.l1 != l1 || this.R1 == 3)) {
            return new rc8(s1.a, m1, n, 0, n3);
        }
        return i;
    }
    
    public abstract void i0(final n p0, final MediaFormat p1) throws ExoPlaybackException;
    
    public void j0(final long n) {
        while (true) {
            int f2 = this.f2;
            if (f2 == 0 || n < this.b1[0]) {
                break;
            }
            final long[] z0 = this.Z0;
            this.d2 = z0[0];
            this.e2 = this.a1[0];
            --f2;
            System.arraycopy(z0, 1, z0, 0, this.f2 = f2);
            final long[] a1 = this.a1;
            System.arraycopy(a1, 1, a1, 0, this.f2);
            final long[] b1 = this.b1;
            System.arraycopy(b1, 1, b1, 0, this.f2);
            this.k0();
        }
    }
    
    public abstract void k0();
    
    public abstract void l0(final DecoderInputBuffer p0) throws ExoPlaybackException;
    
    @TargetApi(23)
    public final void m0() throws ExoPlaybackException {
        final int r1 = this.R1;
        if (r1 != 1) {
            if (r1 != 2) {
                if (r1 != 3) {
                    this.Y1 = true;
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
        final v53 b = this.B();
        this.S0.q();
        j = this.J(b, this.S0, j | 0x4);
        if (j == -5) {
            this.h0(b);
            return true;
        }
        if (j == -4 && ((vq2)this.S0).j(4)) {
            this.X1 = true;
            this.m0();
        }
        return false;
    }
    
    public final void p0() {
        try {
            final c l1 = this.l1;
            if (l1 != null) {
                l1.release();
                final oc8 c2 = this.c2;
                ++c2.b;
                this.g0(this.s1.a);
            }
            this.l1 = null;
            try {
                final MediaCrypto g1 = this.g1;
                if (g1 != null) {
                    g1.release();
                }
            }
            finally {
                this.g1 = null;
                this.u0(null);
                this.s0();
            }
        }
        finally {
            this.l1 = null;
            try {
                final MediaCrypto g2 = this.g1;
                if (g2 != null) {
                    g2.release();
                }
                this.g1 = null;
                this.u0(null);
                this.s0();
            }
            finally {
                this.g1 = null;
                this.u0(null);
                this.s0();
            }
        }
    }
    
    public void q0() throws ExoPlaybackException {
    }
    
    public void r0() {
        this.t0();
        this.H1 = -1;
        this.I1 = null;
        this.F1 = -9223372036854775807L;
        this.T1 = false;
        this.S1 = false;
        this.B1 = false;
        this.C1 = false;
        this.J1 = false;
        this.K1 = false;
        this.X0.clear();
        this.V1 = -9223372036854775807L;
        this.W1 = -9223372036854775807L;
        final w63 e1 = this.E1;
        if (e1 != null) {
            e1.a = 0L;
            e1.b = 0L;
            e1.c = false;
        }
        this.Q1 = 0;
        this.R1 = 0;
        this.P1 = (this.O1 ? 1 : 0);
    }
    
    @Override
    public void s(final float j1, final float k1) throws ExoPlaybackException {
        this.j1 = j1;
        this.k1 = k1;
        this.A0(this.m1);
    }
    
    public final void s0() {
        this.r0();
        this.b2 = null;
        this.E1 = null;
        this.q1 = null;
        this.s1 = null;
        this.m1 = null;
        this.n1 = null;
        this.o1 = false;
        this.U1 = false;
        this.p1 = -1.0f;
        this.t1 = 0;
        this.u1 = false;
        this.v1 = false;
        this.w1 = false;
        this.x1 = false;
        this.y1 = false;
        this.z1 = false;
        this.A1 = false;
        this.D1 = false;
        this.O1 = false;
        this.P1 = 0;
        this.h1 = false;
    }
    
    public final void t0() {
        this.G1 = -1;
        this.T0.E0 = null;
    }
    
    @Override
    public final int u() {
        return 8;
    }
    
    public final void u0(final DrmSession e1) {
        final DrmSession e2 = this.e1;
        if (e2 != e1) {
            if (e1 != null) {
                e1.a((com.google.android.exoplayer2.drm.c$a)null);
            }
            if (e2 != null) {
                e2.b((com.google.android.exoplayer2.drm.c$a)null);
            }
        }
        this.e1 = e1;
    }
    
    @Override
    public final void v(final long n, final long n2) throws ExoPlaybackException {
        final boolean a2 = this.a2;
        final boolean b = false;
        if (a2) {
            this.a2 = false;
            this.m0();
        }
        final ExoPlaybackException b2 = this.b2;
        if (b2 == null) {
            try {
                if (this.Y1) {
                    this.q0();
                    return;
                }
                if (this.c1 == null && !this.o0(2)) {
                    return;
                }
                this.c0();
                if (this.L1) {
                    nkz.h("bypassRender");
                    while (this.K(n, n2)) {}
                    nkz.l();
                }
                else if (this.l1 != null) {
                    final long elapsedRealtime = SystemClock.elapsedRealtime();
                    nkz.h("drainAndFeed");
                    while (this.Q(n, n2) && this.w0(elapsedRealtime)) {}
                    while (this.R() && this.w0(elapsedRealtime)) {}
                    nkz.l();
                }
                else {
                    final oc8 c2 = this.c2;
                    final int d = c2.d;
                    final bro i0 = super.I0;
                    Objects.requireNonNull(i0);
                    c2.d = d + i0.e(n - super.K0);
                    this.o0(1);
                }
                final oc8 c3 = this.c2;
                monitorenter(c3);
                monitorexit(c3);
                return;
            }
            catch (final IllegalStateException ex) {
                final int a3 = imw.a;
                boolean b3 = false;
                Label_0289: {
                    if (a3 < 21 || !(ex instanceof MediaCodec$CodecException)) {
                        final StackTraceElement[] stackTrace = ex.getStackTrace();
                        if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                            b3 = false;
                            break Label_0289;
                        }
                    }
                    b3 = true;
                }
                if (b3) {
                    this.e0(ex);
                    boolean b4 = b;
                    if (a3 >= 21) {
                        final boolean b5 = ex instanceof MediaCodec$CodecException && ((MediaCodec$CodecException)ex).isRecoverable();
                        b4 = b;
                        if (b5) {
                            b4 = true;
                        }
                    }
                    if (b4) {
                        this.p0();
                    }
                    throw this.A((Throwable)this.M(ex, this.s1), this.c1, b4, 4003);
                }
                throw ex;
            }
        }
        this.b2 = null;
        throw b2;
    }
    
    public final void v0(final DrmSession f1) {
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
    
    public final boolean w0(final long n) {
        return this.i1 == -9223372036854775807L || SystemClock.elapsedRealtime() - n < this.i1;
    }
    
    public boolean x0(final d d) {
        return true;
    }
    
    public boolean y0(final n n) {
        return false;
    }
    
    public abstract int z0(final com.google.android.exoplayer2.mediacodec.e p0, final n p1) throws MediaCodecUtil$DecoderQueryException;
}
