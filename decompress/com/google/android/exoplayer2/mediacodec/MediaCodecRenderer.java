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
    public static final byte[] j2;
    public boolean A1;
    public boolean B1;
    public boolean C1;
    public boolean D1;
    public boolean E1;
    public boolean F1;
    public boolean G1;
    public f73 H1;
    public long I1;
    public int J1;
    public int K1;
    public ByteBuffer L1;
    public boolean M1;
    public boolean N1;
    public boolean O1;
    public boolean P1;
    public boolean Q1;
    public final c$b R0;
    public boolean R1;
    public final com.google.android.exoplayer2.mediacodec.e S0;
    public int S1;
    public final boolean T0;
    public int T1;
    public final float U0;
    public int U1;
    public final DecoderInputBuffer V0;
    public boolean V1;
    public final DecoderInputBuffer W0;
    public boolean W1;
    public final DecoderInputBuffer X0;
    public boolean X1;
    public final us1 Y0;
    public long Y1;
    public final oss<n> Z0;
    public long Z1;
    public final ArrayList<Long> a1;
    public boolean a2;
    public final MediaCodec$BufferInfo b1;
    public boolean b2;
    public final long[] c1;
    public boolean c2;
    public final long[] d1;
    public boolean d2;
    public final long[] e1;
    public ExoPlaybackException e2;
    public n f1;
    public cd8 f2;
    public n g1;
    public long g2;
    public DrmSession h1;
    public long h2;
    public DrmSession i1;
    public int i2;
    public MediaCrypto j1;
    public boolean k1;
    public long l1;
    public float m1;
    public float n1;
    public c o1;
    public n p1;
    public MediaFormat q1;
    public boolean r1;
    public float s1;
    public ArrayDeque<d> t1;
    public MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException u1;
    public d v1;
    public int w1;
    public boolean x1;
    public boolean y1;
    public boolean z1;
    
    static {
        j2 = new byte[] { 0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120 };
    }
    
    public MediaCodecRenderer(final int n, final c$b r0, final com.google.android.exoplayer2.mediacodec.e s0, final float u0) {
        super(n);
        this.R0 = r0;
        Objects.requireNonNull(s0);
        this.S0 = s0;
        this.T0 = false;
        this.U0 = u0;
        this.V0 = new DecoderInputBuffer(0);
        this.W0 = new DecoderInputBuffer(0);
        this.X0 = new DecoderInputBuffer(2);
        final us1 y0 = new us1();
        this.Y0 = y0;
        this.Z0 = (oss<n>)new oss();
        this.a1 = new ArrayList<Long>();
        this.b1 = new MediaCodec$BufferInfo();
        this.m1 = 1.0f;
        this.n1 = 1.0f;
        this.l1 = -9223372036854775807L;
        this.c1 = new long[10];
        this.d1 = new long[10];
        this.e1 = new long[10];
        this.g2 = -9223372036854775807L;
        this.h2 = -9223372036854775807L;
        ((DecoderInputBuffer)y0).s(0);
        ((DecoderInputBuffer)y0).H0.order(ByteOrder.nativeOrder());
        this.s1 = -1.0f;
        this.w1 = 0;
        this.S1 = 0;
        this.J1 = -1;
        this.K1 = -1;
        this.I1 = -9223372036854775807L;
        this.Y1 = -9223372036854775807L;
        this.Z1 = -9223372036854775807L;
        this.T1 = 0;
        this.U1 = 0;
    }
    
    public final boolean A0(final n n) throws ExoPlaybackException {
        if (rnw.a < 23) {
            return true;
        }
        if (this.o1 != null && this.U1 != 3) {
            if (super.K0 != 0) {
                final float n2 = this.n1;
                final n[] m0 = super.M0;
                Objects.requireNonNull(m0);
                final float w = this.W(n2, m0);
                final float s1 = this.s1;
                if (s1 == w) {
                    return true;
                }
                if (w == -1.0f) {
                    this.O();
                    return false;
                }
                if (s1 == -1.0f && w <= this.U0) {
                    return true;
                }
                final Bundle parameters = new Bundle();
                parameters.putFloat("operating-rate", w);
                this.o1.setParameters(parameters);
                this.s1 = w;
            }
        }
        return true;
    }
    
    public final void B0() throws ExoPlaybackException {
        try {
            this.j1.setMediaDrmSession(this.Y(this.i1).b);
            this.u0(this.i1);
            this.T1 = 0;
            this.U1 = 0;
        }
        catch (final MediaCryptoException ex) {
            throw this.A((Throwable)ex, this.f1, false, 6006);
        }
    }
    
    @Override
    public void C() {
        this.f1 = null;
        this.g2 = -9223372036854775807L;
        this.h2 = -9223372036854775807L;
        this.i2 = 0;
        this.T();
    }
    
    public final void C0(final long n) throws ExoPlaybackException {
        n g1;
        final n n2 = g1 = (n)this.Z0.e(n);
        if (n2 == null) {
            g1 = n2;
            if (this.r1) {
                final oss<n> z0 = this.Z0;
                synchronized (z0) {
                    Object f;
                    if (z0.d == 0) {
                        f = null;
                    }
                    else {
                        f = z0.f();
                    }
                    monitorexit(z0);
                    final n n3 = (n)f;
                }
            }
        }
        boolean b;
        if (g1 != null) {
            this.g1 = g1;
            b = true;
        }
        else {
            b = false;
        }
        if (b || (this.r1 && this.g1 != null)) {
            this.i0(this.g1, this.q1);
            this.r1 = false;
        }
    }
    
    @Override
    public void E(final long n, final boolean b) throws ExoPlaybackException {
        this.a2 = false;
        this.b2 = false;
        this.d2 = false;
        if (this.O1) {
            this.Y0.q();
            this.X0.q();
            this.P1 = false;
        }
        else if (this.T()) {
            this.c0();
        }
        final oss<n> z0 = this.Z0;
        synchronized (z0) {
            final int d = z0.d;
            monitorexit(z0);
            if (d > 0) {
                this.c2 = true;
            }
            this.Z0.b();
            final int i2 = this.i2;
            if (i2 != 0) {
                this.h2 = this.d1[i2 - 1];
                this.g2 = this.c1[i2 - 1];
                this.i2 = 0;
            }
        }
    }
    
    @Override
    public final void I(final n[] array, final long g2, final long h2) throws ExoPlaybackException {
        final long h3 = this.h2;
        boolean b = true;
        if (h3 == -9223372036854775807L) {
            if (this.g2 != -9223372036854775807L) {
                b = false;
            }
            omi.p(b);
            this.g2 = g2;
            this.h2 = h2;
        }
        else {
            final int i2 = this.i2;
            final long[] d1 = this.d1;
            if (i2 == d1.length) {
                final long n = d1[i2 - 1];
                final StringBuilder sb = new StringBuilder(65);
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(n);
                Log.w("MediaCodecRenderer", sb.toString());
            }
            else {
                this.i2 = i2 + 1;
            }
            final long[] c1 = this.c1;
            final int i3 = this.i2;
            final int n2 = i3 - 1;
            c1[n2] = g2;
            this.d1[n2] = h2;
            this.e1[i3 - 1] = this.Y1;
        }
    }
    
    public final boolean K(final long n, final long n2) throws ExoPlaybackException {
        omi.p(this.b2 ^ true);
        if (this.Y0.w()) {
            final us1 y0 = this.Y0;
            if (!this.n0(n, n2, null, ((DecoderInputBuffer)y0).H0, this.K1, 0, y0.O0, ((DecoderInputBuffer)y0).J0, ((dr2)y0).p(), ((dr2)this.Y0).j(4), this.g1)) {
                return false;
            }
            this.j0(this.Y0.N0);
            this.Y0.q();
        }
        if (this.a2) {
            this.b2 = true;
            return false;
        }
        if (this.P1) {
            omi.p(this.Y0.v(this.X0));
            this.P1 = false;
        }
        if (this.Q1) {
            if (this.Y0.w()) {
                return true;
            }
            this.N();
            this.Q1 = false;
            this.c0();
            if (!this.O1) {
                return false;
            }
        }
        omi.p(this.a2 ^ true);
        final y8r b = this.B();
        this.X0.q();
        while (true) {
            do {
                this.X0.q();
                final int j = this.J(b, this.X0, 0);
                if (j != -5) {
                    if (j != -4) {
                        if (j != -3) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        if (!((dr2)this.X0).j(4)) {
                            if (this.c2) {
                                final n f1 = this.f1;
                                Objects.requireNonNull(f1);
                                this.i0(this.g1 = f1, null);
                                this.c2 = false;
                            }
                            this.X0.t();
                            continue;
                        }
                        this.a2 = true;
                    }
                }
                else {
                    this.h0(b);
                }
                if (this.Y0.w()) {
                    ((DecoderInputBuffer)this.Y0).t();
                }
                return this.Y0.w() || this.a2 || this.Q1;
            } while (this.Y0.v(this.X0));
            this.P1 = true;
            continue;
        }
    }
    
    public abstract fd8 L(final d p0, final n p1, final n p2);
    
    public MediaCodecDecoderException M(final Throwable t, final d d) {
        return new MediaCodecDecoderException(t, d);
    }
    
    public final void N() {
        this.Q1 = false;
        this.Y0.q();
        this.X0.q();
        this.P1 = false;
        this.O1 = false;
    }
    
    public final void O() throws ExoPlaybackException {
        if (this.V1) {
            this.T1 = 1;
            this.U1 = 3;
        }
        else {
            this.p0();
            this.c0();
        }
    }
    
    @TargetApi(23)
    public final boolean P() throws ExoPlaybackException {
        if (this.V1) {
            this.T1 = 1;
            if (this.y1 || this.A1) {
                this.U1 = 3;
                return false;
            }
            this.U1 = 2;
        }
        else {
            this.B0();
        }
        return true;
    }
    
    public final boolean Q(final long n, final long n2) throws ExoPlaybackException {
        Label_0520: {
            if (this.K1 < 0) {
                int k1 = 0;
                Label_0087: {
                    if (this.B1 && this.W1) {
                        try {
                            k1 = this.o1.j(this.b1);
                            break Label_0087;
                        }
                        catch (final IllegalStateException ex) {
                            this.m0();
                            if (this.b2) {
                                this.p0();
                            }
                            return false;
                        }
                    }
                    k1 = this.o1.j(this.b1);
                }
                if (k1 < 0) {
                    if (k1 == -2) {
                        this.X1 = true;
                        final MediaFormat outputFormat = this.o1.getOutputFormat();
                        if (this.w1 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                            this.F1 = true;
                        }
                        else {
                            if (this.D1) {
                                outputFormat.setInteger("channel-count", 1);
                            }
                            this.q1 = outputFormat;
                            this.r1 = true;
                        }
                        return true;
                    }
                    if (this.G1 && (this.a2 || this.T1 == 2)) {
                        this.m0();
                    }
                    return false;
                }
                else {
                    if (this.F1) {
                        this.F1 = false;
                        this.o1.releaseOutputBuffer(k1, false);
                        return true;
                    }
                    final MediaCodec$BufferInfo b1 = this.b1;
                    if (b1.size == 0 && (b1.flags & 0x4) != 0x0) {
                        this.m0();
                        return false;
                    }
                    this.K1 = k1;
                    final ByteBuffer b2 = this.o1.b(k1);
                    if ((this.L1 = b2) != null) {
                        b2.position(this.b1.offset);
                        final ByteBuffer l1 = this.L1;
                        final MediaCodec$BufferInfo b3 = this.b1;
                        l1.limit(b3.offset + b3.size);
                    }
                    if (this.C1) {
                        final MediaCodec$BufferInfo b4 = this.b1;
                        if (b4.presentationTimeUs == 0L && (b4.flags & 0x4) != 0x0) {
                            final long y1 = this.Y1;
                            if (y1 != -9223372036854775807L) {
                                b4.presentationTimeUs = y1;
                            }
                        }
                    }
                    final long presentationTimeUs = this.b1.presentationTimeUs;
                    while (true) {
                        for (int size = this.a1.size(), i = 0; i < size; ++i) {
                            if (this.a1.get(i) == presentationTimeUs) {
                                this.a1.remove(i);
                                final boolean m1 = true;
                                this.M1 = m1;
                                final long z1 = this.Z1;
                                final long presentationTimeUs2 = this.b1.presentationTimeUs;
                                this.N1 = (z1 == presentationTimeUs2);
                                this.C0(presentationTimeUs2);
                                break Label_0520;
                            }
                        }
                        final boolean m1 = false;
                        continue;
                    }
                }
            }
        }
        if (this.B1 && this.W1) {
            try {
                final c o1 = this.o1;
                final ByteBuffer l2 = this.L1;
                final int k2 = this.K1;
                final MediaCodec$BufferInfo b5 = this.b1;
                final int flags = b5.flags;
                final long presentationTimeUs3 = b5.presentationTimeUs;
                final boolean m2 = this.M1;
                final boolean n3 = this.N1;
                final n g1 = this.g1;
                try {
                    final boolean b6 = this.n0(n, n2, o1, l2, k2, flags, 1, presentationTimeUs3, m2, n3, g1);
                }
                catch (final IllegalStateException ex2) {}
            }
            catch (final IllegalStateException ex3) {}
            this.m0();
            if (this.b2) {
                this.p0();
            }
            return false;
        }
        final c o2 = this.o1;
        final ByteBuffer l3 = this.L1;
        final int k3 = this.K1;
        final MediaCodec$BufferInfo b7 = this.b1;
        final boolean b6 = this.n0(n, n2, o2, l3, k3, b7.flags, 1, b7.presentationTimeUs, this.M1, this.N1, this.g1);
        if (b6) {
            this.j0(this.b1.presentationTimeUs);
            final boolean b8 = (this.b1.flags & 0x4) != 0x0;
            this.K1 = -1;
            this.L1 = null;
            if (!b8) {
                return true;
            }
            this.m0();
        }
        return false;
    }
    
    public final boolean R() throws ExoPlaybackException {
        final c o1 = this.o1;
        if (o1 != null && this.T1 != 2) {
            if (!this.a2) {
                if (this.J1 < 0) {
                    final int i = o1.i();
                    if ((this.J1 = i) < 0) {
                        return false;
                    }
                    this.W0.H0 = this.o1.a(i);
                    this.W0.q();
                }
                if (this.T1 == 1) {
                    if (!this.G1) {
                        this.W1 = true;
                        this.o1.k(this.J1, 0, 0L, 4);
                        this.t0();
                    }
                    this.T1 = 2;
                    return false;
                }
                if (this.E1) {
                    this.E1 = false;
                    this.W0.H0.put(MediaCodecRenderer.j2);
                    this.o1.k(this.J1, 38, 0L, 0);
                    this.t0();
                    return this.V1 = true;
                }
                if (this.S1 == 1) {
                    for (int j = 0; j < this.p1.S0.size(); ++j) {
                        this.W0.H0.put((byte[])this.p1.S0.get(j));
                    }
                    this.S1 = 2;
                }
                final int position = this.W0.H0.position();
                final y8r b = this.B();
                try {
                    final int k = this.J(b, this.W0, 0);
                    if (this.j()) {
                        this.Z1 = this.Y1;
                    }
                    if (k == -3) {
                        return false;
                    }
                    if (k == -5) {
                        if (this.S1 == 2) {
                            this.W0.q();
                            this.S1 = 1;
                        }
                        this.h0(b);
                        return true;
                    }
                    if (((dr2)this.W0).j(4)) {
                        if (this.S1 == 2) {
                            this.W0.q();
                            this.S1 = 1;
                        }
                        this.a2 = true;
                        if (!this.V1) {
                            this.m0();
                            return false;
                        }
                        try {
                            if (!this.G1) {
                                this.W1 = true;
                                this.o1.k(this.J1, 0, 0L, 4);
                                this.t0();
                            }
                            return false;
                        }
                        catch (final MediaCodec$CryptoException ex) {
                            throw this.A((Throwable)ex, this.f1, false, rnw.u(ex.getErrorCode()));
                        }
                    }
                    if (!this.V1 && !((dr2)this.W0).j(1)) {
                        this.W0.q();
                        if (this.S1 == 2) {
                            this.S1 = 1;
                        }
                        return true;
                    }
                    final boolean u = this.W0.u();
                    if (u) {
                        final a87 g0 = this.W0.G0;
                        Objects.requireNonNull(g0);
                        if (position != 0) {
                            if (g0.d == null) {
                                final int[] array = { 0 };
                                g0.d = array;
                                g0.i.numBytesOfClearData = array;
                            }
                            final int[] d = g0.d;
                            d[0] += position;
                        }
                    }
                    if (this.x1 && !u) {
                        final ByteBuffer h0 = this.W0.H0;
                        final byte[] a = z6i.a;
                        final int position2 = h0.position();
                        int n = 0;
                        int n2 = 0;
                        while (true) {
                            final int n3 = n + 1;
                            if (n3 >= position2) {
                                h0.clear();
                                break;
                            }
                            final int n4 = h0.get(n) & 0xFF;
                            int n5;
                            if (n2 == 3) {
                                n5 = n2;
                                if (n4 == 1) {
                                    n5 = n2;
                                    if ((h0.get(n3) & 0x1F) == 0x7) {
                                        final ByteBuffer duplicate = h0.duplicate();
                                        duplicate.position(n - 3);
                                        duplicate.limit(position2);
                                        h0.position(0);
                                        h0.put(duplicate);
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
                        if (this.W0.H0.position() == 0) {
                            return true;
                        }
                        this.x1 = false;
                    }
                    final DecoderInputBuffer w0 = this.W0;
                    long a2 = w0.J0;
                    final f73 h2 = this.H1;
                    long n6 = a2;
                    if (h2 != null) {
                        final n f1 = this.f1;
                        if (h2.b == 0L) {
                            h2.a = a2;
                        }
                        if (!h2.c) {
                            final ByteBuffer h3 = w0.H0;
                            Objects.requireNonNull(h3);
                            int l = 0;
                            int n7 = 0;
                            while (l < 4) {
                                n7 = (n7 << 8 | (h3.get(l) & 0xFF));
                                ++l;
                            }
                            final int d2 = lsh.d(n7);
                            if (d2 == -1) {
                                h2.c = true;
                                h2.b = 0L;
                                h2.a = w0.J0;
                                Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                a2 = w0.J0;
                            }
                            else {
                                a2 = h2.a((long)f1.e1);
                                h2.b += d2;
                            }
                        }
                        final long y1 = this.Y1;
                        final f73 h4 = this.H1;
                        final n f2 = this.f1;
                        Objects.requireNonNull(h4);
                        this.Y1 = Math.max(y1, h4.a((long)f2.e1));
                        n6 = a2;
                    }
                    if (((dr2)this.W0).p()) {
                        this.a1.add(n6);
                    }
                    if (this.c2) {
                        this.Z0.a(n6, (Object)this.f1);
                        this.c2 = false;
                    }
                    this.Y1 = Math.max(this.Y1, n6);
                    this.W0.t();
                    if (((dr2)this.W0).m()) {
                        this.a0(this.W0);
                    }
                    this.l0(this.W0);
                    Label_1110: {
                        if (!u) {
                            break Label_1110;
                        }
                        try {
                            this.o1.d(this.J1, this.W0.G0, n6);
                            this.t0();
                            this.V1 = true;
                            this.S1 = 0;
                            final cd8 f3 = this.f2;
                            ++f3.c;
                            return true;
                            this.o1.k(this.J1, this.W0.H0.limit(), n6, 0);
                        }
                        catch (final MediaCodec$CryptoException ex2) {
                            throw this.A((Throwable)ex2, this.f1, false, rnw.u(ex2.getErrorCode()));
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
            this.o1.flush();
        }
        finally {
            this.r0();
        }
    }
    
    public final boolean T() {
        if (this.o1 == null) {
            return false;
        }
        if (this.U1 != 3 && !this.y1 && (!this.z1 || this.X1) && (!this.A1 || !this.W1)) {
            this.S();
            return false;
        }
        this.p0();
        return true;
    }
    
    public final List<d> U(final boolean b) throws MediaCodecUtil$DecoderQueryException {
        List<d> list2;
        final List<d> list = list2 = this.X(this.S0, this.f1, b);
        if (list.isEmpty()) {
            list2 = list;
            if (b) {
                final List<d> list3 = list2 = this.X(this.S0, this.f1, (boolean)(0 != 0));
                if (!list3.isEmpty()) {
                    final String q0 = this.f1.Q0;
                    final String value = String.valueOf(list3);
                    final StringBuilder k = tf8.k(value.length() + l58.g(q0, 99), "Drm session requires secure decoder for ", q0, ", but no secure decoder available. Trying to proceed with ", value);
                    k.append(".");
                    Log.w("MediaCodecRenderer", k.toString());
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
    
    public final iqb Y(final DrmSession drmSession) throws ExoPlaybackException {
        final z77 e = drmSession.e();
        if (e != null && !(e instanceof iqb)) {
            final String value = String.valueOf(e);
            final StringBuilder sb = new StringBuilder(value.length() + 43);
            sb.append("Expecting FrameworkCryptoConfig but found: ");
            sb.append(value);
            throw this.A(new IllegalArgumentException(sb.toString()), this.f1, false, 6001);
        }
        return (iqb)e;
    }
    
    public abstract c$a Z(final d p0, final n p1, final MediaCrypto p2, final float p3);
    
    public void a0(final DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }
    
    public final void b0(final d v1, final MediaCrypto mediaCrypto) throws Exception {
        final String a = v1.a;
        final int a2 = rnw.a;
        final float n = -1.0f;
        float w;
        if (a2 < 23) {
            w = -1.0f;
        }
        else {
            final float n2 = this.n1;
            final n[] m0 = super.M0;
            Objects.requireNonNull(m0);
            w = this.W(n2, m0);
        }
        if (w <= this.U0) {
            w = n;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final c$a z = this.Z(v1, this.f1, mediaCrypto, w);
        if (a2 >= 31) {
            final cok j0 = super.J0;
            Objects.requireNonNull(j0);
            MediaCodecRenderer.MediaCodecRenderer$a.a(z, j0);
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
            amz.m(concat);
            this.o1 = this.R0.a(z);
            amz.s();
            final long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.v1 = v1;
            this.s1 = w;
            this.p1 = this.f1;
            int w2 = 0;
            Label_0339: {
                if (a2 <= 25 && "OMX.Exynos.avc.dec.secure".equals(a)) {
                    final String d = rnw.d;
                    if (d.startsWith("SM-T585") || d.startsWith("SM-A510") || d.startsWith("SM-A520") || d.startsWith("SM-J700")) {
                        w2 = 2;
                        break Label_0339;
                    }
                }
                if (a2 < 24 && ("OMX.Nvidia.h264.decode".equals(a) || "OMX.Nvidia.h264.decode.secure".equals(a))) {
                    final String b = rnw.b;
                    if ("flounder".equals(b) || "flounder_lte".equals(b) || "grouper".equals(b) || "tilapia".equals(b)) {
                        w2 = 1;
                        break Label_0339;
                    }
                }
                w2 = 0;
            }
            this.w1 = w2;
            final n p2 = this.p1;
            this.x1 = (a2 < 21 && p2.S0.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(a));
            boolean y1 = false;
            Label_0484: {
                Label_0481: {
                    if (a2 >= 18 && (a2 != 18 || (!"OMX.SEC.avc.dec".equals(a) && !"OMX.SEC.avc.dec.secure".equals(a)))) {
                        if (a2 == 19 && rnw.d.startsWith("SM-G800")) {
                            if ("OMX.Exynos.avc.dec".equals(a)) {
                                break Label_0481;
                            }
                            if ("OMX.Exynos.avc.dec.secure".equals(a)) {
                                break Label_0481;
                            }
                        }
                        y1 = false;
                        break Label_0484;
                    }
                }
                y1 = true;
            }
            this.y1 = y1;
            this.z1 = (a2 == 29 && "c2.android.aac.decoder".equals(a));
            boolean a3 = false;
            Label_0603: {
                Label_0594: {
                    if (a2 > 23 || !"OMX.google.vorbis.decoder".equals(a)) {
                        if (a2 <= 19) {
                            final String b2 = rnw.b;
                            if (("hb2000".equals(b2) || "stvm8".equals(b2)) && ("OMX.amlogic.avc.decoder.awesome".equals(a) || "OMX.amlogic.avc.decoder.awesome.secure".equals(a))) {
                                break Label_0594;
                            }
                        }
                        a3 = false;
                        break Label_0603;
                    }
                }
                a3 = true;
            }
            this.A1 = a3;
            this.B1 = (a2 == 21 && "OMX.google.aac.decoder".equals(a));
            boolean c1 = false;
            Label_0745: {
                if (a2 < 21 && "OMX.SEC.mp3.dec".equals(a) && "samsung".equals(rnw.c)) {
                    final String b3 = rnw.b;
                    if (b3.startsWith("baffin") || b3.startsWith("grand") || b3.startsWith("fortuna") || b3.startsWith("gprimelte") || b3.startsWith("j2y18lte") || b3.startsWith("ms01")) {
                        c1 = true;
                        break Label_0745;
                    }
                }
                c1 = false;
            }
            this.C1 = c1;
            final n p3 = this.p1;
            this.D1 = (a2 <= 18 && p3.d1 == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(a));
            final String a4 = v1.a;
            this.G1 = ((a2 <= 25 && "OMX.rk.video_decoder.avc".equals(a4)) || (a2 <= 17 && "OMX.allwinner.video.decoder.avc".equals(a4)) || (a2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(a4) || "OMX.broadcom.video_decoder.tunnel.secure".equals(a4))) || ("Amazon".equals(rnw.c) && "AFTS".equals(rnw.d) && v1.f) || this.V());
            this.o1.g();
            if ("c2.android.mp3.decoder".equals(v1.a)) {
                this.H1 = new f73();
            }
            if (super.K0 == 2) {
                this.I1 = SystemClock.elapsedRealtime() + 1000L;
            }
            final cd8 f2 = this.f2;
            ++f2.a;
            this.f0(a, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        }
        finally {
            amz.s();
        }
    }
    
    public boolean c() {
        final n f1 = this.f1;
        final boolean b = true;
        if (f1 != null) {
            boolean b2;
            if (this.j()) {
                b2 = super.P0;
            }
            else {
                final mso l0 = super.L0;
                Objects.requireNonNull(l0);
                b2 = l0.c();
            }
            boolean b3 = b;
            if (b2) {
                return b3;
            }
            final boolean b4 = this.K1 >= 0;
            b3 = b;
            if (b4) {
                return b3;
            }
            if (this.I1 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.I1) {
                b3 = b;
                return b3;
            }
        }
        return false;
    }
    
    public final void c0() throws ExoPlaybackException {
        if (this.o1 == null && !this.O1) {
            final n f1 = this.f1;
            if (f1 != null) {
                if (this.i1 == null && this.y0(f1)) {
                    final n f2 = this.f1;
                    this.N();
                    final String q0 = f2.Q0;
                    if (!"audio/mp4a-latm".equals(q0) && !"audio/mpeg".equals(q0) && !"audio/opus".equals(q0)) {
                        final us1 y0 = this.Y0;
                        Objects.requireNonNull(y0);
                        y0.P0 = 1;
                    }
                    else {
                        final us1 y2 = this.Y0;
                        Objects.requireNonNull(y2);
                        y2.P0 = 32;
                    }
                    this.O1 = true;
                    return;
                }
                this.u0(this.i1);
                final String q2 = this.f1.Q0;
                final DrmSession h1 = this.h1;
                if (h1 != null) {
                    if (this.j1 == null) {
                        final iqb y3 = this.Y(h1);
                        if (y3 == null) {
                            if (this.h1.K() == null) {
                                return;
                            }
                        }
                        else {
                            try {
                                final MediaCrypto j1 = new MediaCrypto(y3.a, y3.b);
                                this.j1 = j1;
                                this.k1 = (!y3.c && j1.requiresSecureDecoderComponent(q2));
                            }
                            catch (final MediaCryptoException ex) {
                                throw this.A((Throwable)ex, this.f1, false, 6006);
                            }
                        }
                    }
                    if (iqb.d) {
                        final int state = this.h1.getState();
                        if (state == 1) {
                            final DrmSession$DrmSessionException k = this.h1.K();
                            Objects.requireNonNull(k);
                            throw this.A((Throwable)k, this.f1, false, k.F0);
                        }
                        if (state != 4) {
                            return;
                        }
                    }
                }
                try {
                    this.d0(this.j1, this.k1);
                }
                catch (final MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException ex2) {
                    throw this.A((Throwable)ex2, this.f1, false, 4001);
                }
            }
        }
    }
    
    public final void d0(final MediaCrypto mediaCrypto, final boolean b) throws MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException {
        if (this.t1 == null) {
            try {
                final List<d> u = this.U(b);
                final ArrayDeque<Object> t1 = new ArrayDeque<Object>();
                this.t1 = (ArrayDeque<d>)t1;
                if (this.T0) {
                    t1.addAll(u);
                }
                else if (!u.isEmpty()) {
                    this.t1.add((d)u.get(0));
                }
                this.u1 = null;
            }
            catch (final MediaCodecUtil$DecoderQueryException ex) {
                throw new MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException(this.f1, (Throwable)ex, b, -49998);
            }
        }
        if (!this.t1.isEmpty()) {
            final d d = this.t1.peekFirst();
            while (this.o1 == null) {
                final d d2 = this.t1.peekFirst();
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
                            tqb.b0("MediaCodecRenderer", sb.toString(), ex3);
                            this.t1.removeFirst();
                            final n f1 = this.f1;
                            final String a = d2.a;
                            final String value2 = String.valueOf(f1);
                            final StringBuilder sb2 = new StringBuilder(value2.length() + l58.g(a, 23));
                            sb2.append("Decoder init failed: ");
                            sb2.append(a);
                            sb2.append(", ");
                            sb2.append(value2);
                            final String string = sb2.toString();
                            final String q0 = f1.Q0;
                            String diagnosticInfo;
                            if (rnw.a >= 21 && ex3 instanceof MediaCodec$CodecException) {
                                diagnosticInfo = ((MediaCodec$CodecException)ex3).getDiagnosticInfo();
                            }
                            else {
                                diagnosticInfo = null;
                            }
                            final MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException u2 = new MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException(string, (Throwable)ex3, q0, b, d2, diagnosticInfo);
                            this.e0((Exception)u2);
                            final MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException u3 = this.u1;
                            if (u3 == null) {
                                this.u1 = u2;
                            }
                            else {
                                this.u1 = new MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException(((Throwable)u3).getMessage(), ((Throwable)u3).getCause(), u3.F0, u3.G0, u3.H0, u3.I0);
                            }
                            if (!this.t1.isEmpty()) {
                                continue;
                            }
                            throw this.u1;
                        }
                    }
                }
                break;
            }
            this.t1 = null;
            return;
        }
        throw new MediaCodecRenderer.MediaCodecRenderer$DecoderInitializationException(this.f1, (Throwable)null, b, -49999);
    }
    
    public final int e(final n n) throws ExoPlaybackException {
        try {
            return this.z0(this.S0, n);
        }
        catch (final MediaCodecUtil$DecoderQueryException ex) {
            throw this.z((Throwable)ex, n);
        }
    }
    
    public abstract void e0(final Exception p0);
    
    public boolean f() {
        return this.b2;
    }
    
    public abstract void f0(final String p0, final long p1, final long p2);
    
    public abstract void g0(final String p0);
    
    public fd8 h0(final y8r y8r) throws ExoPlaybackException {
        final boolean b = true;
        final boolean b2 = true;
        this.c2 = true;
        final n n = (n)y8r.H0;
        Objects.requireNonNull(n);
        if (n.Q0 == null) {
            throw this.A(new IllegalArgumentException(), n, false, 4005);
        }
        this.v0((DrmSession)y8r.G0);
        this.f1 = n;
        if (this.O1) {
            this.Q1 = true;
            return null;
        }
        final c o1 = this.o1;
        if (o1 == null) {
            this.t1 = null;
            this.c0();
            return null;
        }
        final d v1 = this.v1;
        final n p = this.p1;
        final DrmSession h1 = this.h1;
        final DrmSession i1 = this.i1;
        boolean b4 = false;
        Label_0241: {
            Label_0115: {
                if (h1 != i1) {
                    if (i1 != null) {
                        if (h1 != null) {
                            if (rnw.a >= 23) {
                                final UUID e = g73.e;
                                if (!e.equals(h1.c())) {
                                    if (!e.equals(i1.c())) {
                                        final iqb y = this.Y(i1);
                                        if (y != null) {
                                            final boolean b3 = !y.c && i1.f(n.Q0);
                                            if (v1.f || !b3) {
                                                break Label_0115;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    b4 = true;
                    break Label_0241;
                }
            }
            b4 = false;
        }
        if (b4) {
            this.O();
            return new fd8(v1.a, p, n, 0, 128);
        }
        final boolean b5 = this.i1 != this.h1;
        omi.p(!b5 || rnw.a >= 23);
        final fd8 l = this.L(v1, p, n);
        final int d = l.d;
        int n3 = 0;
        Label_0600: {
            Label_0598: {
                if (d != 0) {
                    Label_0589: {
                        if (d != 1) {
                            if (d != 2) {
                                if (d != 3) {
                                    throw new IllegalStateException();
                                }
                                if (this.A0(n)) {
                                    this.p1 = n;
                                    if (b5 && !this.P()) {
                                        break Label_0589;
                                    }
                                    break Label_0598;
                                }
                            }
                            else if (this.A0(n)) {
                                this.R1 = true;
                                this.S1 = 1;
                                final int w1 = this.w1;
                                boolean e2 = b2;
                                if (w1 != 2) {
                                    e2 = (w1 == 1 && n.V0 == p.V0 && n.W0 == p.W0 && b2);
                                }
                                this.E1 = e2;
                                this.p1 = n;
                                if (b5 && !this.P()) {
                                    break Label_0589;
                                }
                                break Label_0598;
                            }
                        }
                        else if (this.A0(n)) {
                            this.p1 = n;
                            if (b5) {
                                if (!this.P()) {
                                    break Label_0589;
                                }
                                break Label_0598;
                            }
                            else {
                                int n2 = b ? 1 : 0;
                                if (this.V1) {
                                    this.T1 = 1;
                                    if (!this.y1 && !this.A1) {
                                        this.U1 = 1;
                                        n2 = (b ? 1 : 0);
                                    }
                                    else {
                                        this.U1 = 3;
                                        n2 = 0;
                                    }
                                }
                                if (n2 == 0) {
                                    break Label_0589;
                                }
                                break Label_0598;
                            }
                        }
                        n3 = 16;
                        break Label_0600;
                    }
                    n3 = 2;
                    break Label_0600;
                }
                this.O();
            }
            n3 = 0;
        }
        if (l.d != 0 && (this.o1 != o1 || this.U1 == 3)) {
            return new fd8(v1.a, p, n, 0, n3);
        }
        return l;
    }
    
    public abstract void i0(final n p0, final MediaFormat p1) throws ExoPlaybackException;
    
    public void j0(final long n) {
        while (true) {
            int i2 = this.i2;
            if (i2 == 0 || n < this.e1[0]) {
                break;
            }
            final long[] c1 = this.c1;
            this.g2 = c1[0];
            this.h2 = this.d1[0];
            --i2;
            System.arraycopy(c1, 1, c1, 0, this.i2 = i2);
            final long[] d1 = this.d1;
            System.arraycopy(d1, 1, d1, 0, this.i2);
            final long[] e1 = this.e1;
            System.arraycopy(e1, 1, e1, 0, this.i2);
            this.k0();
        }
    }
    
    public abstract void k0();
    
    public abstract void l0(final DecoderInputBuffer p0) throws ExoPlaybackException;
    
    @TargetApi(23)
    public final void m0() throws ExoPlaybackException {
        final int u1 = this.U1;
        if (u1 != 1) {
            if (u1 != 2) {
                if (u1 != 3) {
                    this.b2 = true;
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
        final y8r b = this.B();
        this.V0.q();
        j = this.J(b, this.V0, j | 0x4);
        if (j == -5) {
            this.h0(b);
            return true;
        }
        if (j == -4 && ((dr2)this.V0).j(4)) {
            this.a2 = true;
            this.m0();
        }
        return false;
    }
    
    public final void p0() {
        try {
            final c o1 = this.o1;
            if (o1 != null) {
                o1.release();
                final cd8 f2 = this.f2;
                ++f2.b;
                this.g0(this.v1.a);
            }
            this.o1 = null;
            try {
                final MediaCrypto j1 = this.j1;
                if (j1 != null) {
                    j1.release();
                }
            }
            finally {
                this.j1 = null;
                this.u0(null);
                this.s0();
            }
        }
        finally {
            this.o1 = null;
            try {
                final MediaCrypto j2 = this.j1;
                if (j2 != null) {
                    j2.release();
                }
                this.j1 = null;
                this.u0(null);
                this.s0();
            }
            finally {
                this.j1 = null;
                this.u0(null);
                this.s0();
            }
        }
    }
    
    public void q0() throws ExoPlaybackException {
    }
    
    public void r0() {
        this.t0();
        this.K1 = -1;
        this.L1 = null;
        this.I1 = -9223372036854775807L;
        this.W1 = false;
        this.V1 = false;
        this.E1 = false;
        this.F1 = false;
        this.M1 = false;
        this.N1 = false;
        this.a1.clear();
        this.Y1 = -9223372036854775807L;
        this.Z1 = -9223372036854775807L;
        final f73 h1 = this.H1;
        if (h1 != null) {
            h1.a = 0L;
            h1.b = 0L;
            h1.c = false;
        }
        this.T1 = 0;
        this.U1 = 0;
        this.S1 = (this.R1 ? 1 : 0);
    }
    
    @Override
    public void s(final float m1, final float n1) throws ExoPlaybackException {
        this.m1 = m1;
        this.n1 = n1;
        this.A0(this.p1);
    }
    
    public final void s0() {
        this.r0();
        this.e2 = null;
        this.H1 = null;
        this.t1 = null;
        this.v1 = null;
        this.p1 = null;
        this.q1 = null;
        this.r1 = false;
        this.X1 = false;
        this.s1 = -1.0f;
        this.w1 = 0;
        this.x1 = false;
        this.y1 = false;
        this.z1 = false;
        this.A1 = false;
        this.B1 = false;
        this.C1 = false;
        this.D1 = false;
        this.G1 = false;
        this.R1 = false;
        this.S1 = 0;
        this.k1 = false;
    }
    
    public final void t0() {
        this.J1 = -1;
        this.W0.H0 = null;
    }
    
    @Override
    public final int u() {
        return 8;
    }
    
    public final void u0(final DrmSession h1) {
        final DrmSession h2 = this.h1;
        if (h2 != h1) {
            if (h1 != null) {
                h1.a((com.google.android.exoplayer2.drm.c$a)null);
            }
            if (h2 != null) {
                h2.b((com.google.android.exoplayer2.drm.c$a)null);
            }
        }
        this.h1 = h1;
    }
    
    public final void v(final long n, final long n2) throws ExoPlaybackException {
        final boolean d2 = this.d2;
        final boolean b = false;
        if (d2) {
            this.d2 = false;
            this.m0();
        }
        final ExoPlaybackException e2 = this.e2;
        if (e2 == null) {
            try {
                if (this.b2) {
                    this.q0();
                    return;
                }
                if (this.f1 == null && !this.o0(2)) {
                    return;
                }
                this.c0();
                if (this.O1) {
                    amz.m("bypassRender");
                    while (this.K(n, n2)) {}
                    amz.s();
                }
                else if (this.o1 != null) {
                    final long elapsedRealtime = SystemClock.elapsedRealtime();
                    amz.m("drainAndFeed");
                    while (this.Q(n, n2) && this.w0(elapsedRealtime)) {}
                    while (this.R() && this.w0(elapsedRealtime)) {}
                    amz.s();
                }
                else {
                    final cd8 f2 = this.f2;
                    final int d3 = f2.d;
                    final mso l0 = super.L0;
                    Objects.requireNonNull(l0);
                    f2.d = d3 + l0.f(n - super.N0);
                    this.o0(1);
                }
                final cd8 f3 = this.f2;
                monitorenter(f3);
                monitorexit(f3);
                return;
            }
            catch (final IllegalStateException ex) {
                final int a = rnw.a;
                boolean b2 = false;
                Label_0289: {
                    if (a < 21 || !(ex instanceof MediaCodec$CodecException)) {
                        final StackTraceElement[] stackTrace = ex.getStackTrace();
                        if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                            b2 = false;
                            break Label_0289;
                        }
                    }
                    b2 = true;
                }
                if (b2) {
                    this.e0(ex);
                    boolean b3 = b;
                    if (a >= 21) {
                        final boolean b4 = ex instanceof MediaCodec$CodecException && ((MediaCodec$CodecException)ex).isRecoverable();
                        b3 = b;
                        if (b4) {
                            b3 = true;
                        }
                    }
                    if (b3) {
                        this.p0();
                    }
                    throw this.A((Throwable)this.M(ex, this.v1), this.f1, b3, 4003);
                }
                throw ex;
            }
        }
        this.e2 = null;
        throw e2;
    }
    
    public final void v0(final DrmSession i1) {
        final DrmSession i2 = this.i1;
        if (i2 != i1) {
            if (i1 != null) {
                i1.a((com.google.android.exoplayer2.drm.c$a)null);
            }
            if (i2 != null) {
                i2.b((com.google.android.exoplayer2.drm.c$a)null);
            }
        }
        this.i1 = i1;
    }
    
    public final boolean w0(final long n) {
        return this.l1 == -9223372036854775807L || SystemClock.elapsedRealtime() - n < this.l1;
    }
    
    public boolean x0(final d d) {
        return true;
    }
    
    public boolean y0(final n n) {
        return false;
    }
    
    public abstract int z0(final com.google.android.exoplayer2.mediacodec.e p0, final n p1) throws MediaCodecUtil$DecoderQueryException;
}
