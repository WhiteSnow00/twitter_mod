// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import com.google.android.exoplayer2.mediacodec.c;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.v;
import android.view.Surface;
import com.google.android.exoplayer2.n$a;
import android.media.MediaFormat;
import com.google.android.exoplayer2.mediacodec.c$a;
import android.media.MediaCrypto;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.ExoPlaybackException;
import java.util.Objects;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.util.Collection;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.d;
import java.util.List;
import android.os.Handler;
import com.google.android.exoplayer2.mediacodec.e;
import com.google.android.exoplayer2.mediacodec.c$b;
import com.google.android.exoplayer2.z$a;
import com.google.android.exoplayer2.n;
import android.content.Context;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;

public final class g extends MediaCodecRenderer implements hsg
{
    public final Context k2;
    public final a$a l2;
    public final AudioSink m2;
    public int n2;
    public boolean o2;
    public n p2;
    public long q2;
    public boolean r2;
    public boolean s2;
    public boolean t2;
    public z$a u2;
    
    public g(final Context context, final c$b c$b, final com.google.android.exoplayer2.mediacodec.e e, final Handler handler, final a a, final AudioSink m2) {
        super(1, c$b, e, 44100.0f);
        this.k2 = context.getApplicationContext();
        this.m2 = m2;
        this.l2 = new a$a(handler, a);
        ((DefaultAudioSink)m2).r = (AudioSink$a)new g.g$a(this);
    }
    
    public static List<d> E0(final com.google.android.exoplayer2.mediacodec.e e, final n n, final boolean b, final AudioSink audioSink) throws MediaCodecUtil$DecoderQueryException {
        final String q0 = n.Q0;
        if (q0 == null) {
            final eed.b g0 = eed.G0;
            return nbm.J0;
        }
        if (audioSink.e(n)) {
            final d h = MediaCodecUtil.h();
            if (h != null) {
                return eed.t(h);
            }
        }
        final List b2 = e.b(q0, b, false);
        final String b3 = MediaCodecUtil.b(n);
        if (b3 == null) {
            return (List<d>)eed.q((Collection<?>)b2);
        }
        final List b4 = e.b(b3, b, false);
        final eed.b g2 = eed.G0;
        final eed.a a = new eed.a();
        ((xdd.a)a).d(b2);
        ((xdd.a)a).d(b4);
        return a.f();
    }
    
    @Override
    public final void C() {
        this.t2 = true;
        try {
            this.m2.flush();
            try {
                super.C();
            }
            finally {
                this.l2.a(super.f2);
            }
        }
        finally {
            try {
                super.C();
                this.l2.a(super.f2);
            }
            finally {
                this.l2.a(super.f2);
            }
        }
    }
    
    public final void D(final boolean b) throws ExoPlaybackException {
        final cd8 f2 = new cd8();
        super.f2 = f2;
        final a$a l2 = this.l2;
        final Handler a = l2.a;
        if (a != null) {
            a.post((Runnable)new m01((Object)l2, (Object)f2, 0));
        }
        final lgm h0 = super.H0;
        Objects.requireNonNull(h0);
        if (h0.a) {
            this.m2.u();
        }
        else {
            this.m2.k();
        }
        final AudioSink m2 = this.m2;
        final cok j0 = super.J0;
        Objects.requireNonNull(j0);
        m2.t(j0);
    }
    
    public final int D0(final d d, final n n) {
        if ("OMX.google.raw.decoder".equals(d.a)) {
            final int a = rnw.a;
            if (a < 24 && (a != 23 || !rnw.G(this.k2))) {
                return -1;
            }
        }
        return n.R0;
    }
    
    @Override
    public final void E(final long q2, final boolean b) throws ExoPlaybackException {
        super.E(q2, b);
        this.m2.flush();
        this.q2 = q2;
        this.r2 = true;
        this.s2 = true;
    }
    
    public final void F() {
        try {
            this.N();
            this.p0();
            try {
                this.v0(null);
                if (this.t2) {
                    this.t2 = false;
                    this.m2.b();
                }
            }
            finally {
                if (this.t2) {
                    this.t2 = false;
                    this.m2.b();
                }
            }
        }
        finally {}
    }
    
    public final void F0() {
        long q2 = this.m2.r(this.f());
        if (q2 != Long.MIN_VALUE) {
            if (!this.s2) {
                q2 = Math.max(this.q2, q2);
            }
            this.q2 = q2;
            this.s2 = false;
        }
    }
    
    public final void G() {
        this.m2.p();
    }
    
    public final void H() {
        this.F0();
        this.m2.g();
    }
    
    @Override
    public final fd8 L(final d d, final n n, final n n2) {
        final fd8 c = d.c(n, n2);
        int e;
        final int n3 = e = c.e;
        if (this.D0(d, n2) > this.n2) {
            e = (n3 | 0x40);
        }
        final String a = d.a;
        int d2;
        if (e != 0) {
            d2 = 0;
        }
        else {
            d2 = c.d;
        }
        return new fd8(a, n, n2, d2, e);
    }
    
    @Override
    public final float W(float n, final n[] array) {
        final int length = array.length;
        int i = 0;
        int n2 = -1;
        while (i < length) {
            final int e1 = array[i].e1;
            int max = n2;
            if (e1 != -1) {
                max = Math.max(n2, e1);
            }
            ++i;
            n2 = max;
        }
        if (n2 == -1) {
            n = -1.0f;
        }
        else {
            n *= n2;
        }
        return n;
    }
    
    @Override
    public final List<d> X(final com.google.android.exoplayer2.mediacodec.e e, final n n, final boolean b) throws MediaCodecUtil$DecoderQueryException {
        return MediaCodecUtil.g((List)E0(e, n, b, this.m2), n);
    }
    
    @Override
    public final c$a Z(final d d, final n n, final MediaCrypto mediaCrypto, final float n2) {
        final n[] m0 = super.M0;
        Objects.requireNonNull(m0);
        int d2 = this.D0(d, n);
        final int length = m0.length;
        final boolean b = false;
        int n3;
        if (length == 1) {
            n3 = d2;
        }
        else {
            final int length2 = m0.length;
            int n4 = 0;
            while (true) {
                n3 = d2;
                if (n4 >= length2) {
                    break;
                }
                final n n5 = m0[n4];
                int max = d2;
                if (d.c(n, n5).d != 0) {
                    max = Math.max(d2, this.D0(d, n5));
                }
                ++n4;
                d2 = max;
            }
        }
        this.n2 = n3;
        final String a = d.a;
        final int a2 = rnw.a;
        boolean o2 = false;
        Label_0202: {
            if (a2 < 24 && "OMX.SEC.aac.dec".equals(a) && "samsung".equals(rnw.c)) {
                final String b2 = rnw.b;
                if (b2.startsWith("zeroflte") || b2.startsWith("herolte") || b2.startsWith("heroqlte")) {
                    o2 = true;
                    break Label_0202;
                }
            }
            o2 = false;
        }
        this.o2 = o2;
        final String c = d.c;
        final int n6 = this.n2;
        final MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", c);
        mediaFormat.setInteger("channel-count", n.d1);
        mediaFormat.setInteger("sample-rate", n.e1);
        yru.F(mediaFormat, n.S0);
        yru.A(mediaFormat, "max-input-size", n6);
        if (a2 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (n2 != -1.0f) {
                boolean b3 = false;
                Label_0350: {
                    if (a2 == 23) {
                        final String d3 = rnw.d;
                        if ("ZTE B2017G".equals(d3) || "AXON 7 mini".equals(d3)) {
                            b3 = true;
                            break Label_0350;
                        }
                    }
                    b3 = false;
                }
                if (!b3) {
                    mediaFormat.setFloat("operating-rate", n2);
                }
            }
        }
        if (a2 <= 28 && "audio/ac4".equals(n.Q0)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (a2 >= 24) {
            final AudioSink m2 = this.m2;
            final int d4 = n.d1;
            final int e1 = n.e1;
            final n$a n$a = new n$a();
            n$a.k = "audio/raw";
            n$a.x = d4;
            n$a.y = e1;
            n$a.z = 4;
            if (m2.o(new n(n$a)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (a2 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        int n7 = b ? 1 : 0;
        if ("audio/raw".equals(d.b)) {
            n7 = (b ? 1 : 0);
            if (!"audio/raw".equals(n.Q0)) {
                n7 = 1;
            }
        }
        n p4;
        if (n7 != 0) {
            p4 = n;
        }
        else {
            p4 = null;
        }
        this.p2 = p4;
        return new c$a(d, mediaFormat, n, (Surface)null, mediaCrypto);
    }
    
    public final v a() {
        return this.m2.a();
    }
    
    @Override
    public final boolean c() {
        return this.m2.c() || super.c();
    }
    
    @Override
    public final void e0(final Exception ex) {
        tqb.y("MediaCodecAudioRenderer", "Audio codec error", ex);
        final a$a l2 = this.l2;
        final Handler a = l2.a;
        if (a != null) {
            a.post((Runnable)new npb((Object)l2, (Object)ex, 4));
        }
    }
    
    @Override
    public final boolean f() {
        return super.b2 && this.m2.f();
    }
    
    @Override
    public final void f0(final String s, final long n, final long n2) {
        final a$a l2 = this.l2;
        final Handler a = l2.a;
        if (a != null) {
            a.post((Runnable)new p01(l2, s, n, n2));
        }
    }
    
    @Override
    public final void g0(final String s) {
        final a$a l2 = this.l2;
        final Handler a = l2.a;
        if (a != null) {
            a.post((Runnable)new z2r((Object)l2, (Object)s, 2));
        }
    }
    
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }
    
    @Override
    public final fd8 h0(final y8r y8r) throws ExoPlaybackException {
        final fd8 h0 = super.h0(y8r);
        final a$a l2 = this.l2;
        final n n = (n)y8r.H0;
        final Handler a = l2.a;
        if (a != null) {
            a.post((Runnable)new jtl((Object)l2, (Object)n, (Object)h0, 1));
        }
        return h0;
    }
    
    public final void i(final v v) {
        this.m2.i(v);
    }
    
    @Override
    public final void i0(n o, final MediaFormat mediaFormat) throws ExoPlaybackException {
        final n p2 = this.p2;
        final int[] array = null;
        final int[] array2 = null;
        int[] array3;
        if (p2 != null) {
            o = p2;
            array3 = array;
        }
        else if (super.o1 == null) {
            array3 = array;
        }
        else {
            int z;
            if ("audio/raw".equals(((n)o).Q0)) {
                z = ((n)o).f1;
            }
            else if (rnw.a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                z = mediaFormat.getInteger("pcm-encoding");
            }
            else if (mediaFormat.containsKey("v-bits-per-sample")) {
                z = rnw.w(mediaFormat.getInteger("v-bits-per-sample"));
            }
            else {
                z = 2;
            }
            final n$a n$a = new n$a();
            n$a.k = "audio/raw";
            n$a.z = z;
            n$a.A = ((n)o).g1;
            n$a.B = ((n)o).h1;
            n$a.x = mediaFormat.getInteger("channel-count");
            n$a.y = mediaFormat.getInteger("sample-rate");
            final n n = new n(n$a);
            array3 = array2;
            if (this.o2) {
                array3 = array2;
                if (n.d1 == 6) {
                    final int d1 = ((n)o).d1;
                    array3 = array2;
                    if (d1 < 6) {
                        array3 = new int[d1];
                        for (int i = 0; i < ((n)o).d1; ++i) {
                            array3[i] = i;
                        }
                    }
                }
            }
            o = n;
        }
        try {
            this.m2.j((n)o, array3);
        }
        catch (final AudioSink$ConfigurationException ex) {
            throw this.A((Throwable)ex, ex.F0, false, 5001);
        }
    }
    
    @Override
    public final void k0() {
        this.m2.s();
    }
    
    @Override
    public final void l0(final DecoderInputBuffer decoderInputBuffer) {
        if (this.r2 && !((dr2)decoderInputBuffer).p()) {
            if (Math.abs(decoderInputBuffer.J0 - this.q2) > 500000L) {
                this.q2 = decoderInputBuffer.J0;
            }
            this.r2 = false;
        }
    }
    
    public final void m(final int n, final Object o) throws ExoPlaybackException {
        if (n != 2) {
            if (n != 3) {
                if (n != 6) {
                    switch (n) {
                        case 11: {
                            this.u2 = (z$a)o;
                            break;
                        }
                        case 10: {
                            this.m2.d((int)o);
                            break;
                        }
                        case 9: {
                            this.m2.v((boolean)o);
                            break;
                        }
                    }
                }
                else {
                    this.m2.m((od1)o);
                }
            }
            else {
                this.m2.l((ty0)o);
            }
        }
        else {
            this.m2.h((float)o);
        }
    }
    
    @Override
    public final boolean n0(final long n, final long n2, final c c, final ByteBuffer byteBuffer, final int n3, final int n4, final int n5, final long n6, final boolean b, final boolean b2, final n n7) throws ExoPlaybackException {
        Objects.requireNonNull(byteBuffer);
        if (this.p2 != null && (n4 & 0x2) != 0x0) {
            Objects.requireNonNull(c);
            c.releaseOutputBuffer(n3, false);
            return true;
        }
        if (b) {
            if (c != null) {
                c.releaseOutputBuffer(n3, false);
            }
            final cd8 f2 = super.f2;
            f2.f += n5;
            this.m2.s();
            return true;
        }
        try {
            if (this.m2.n(byteBuffer, n6, n5)) {
                if (c != null) {
                    c.releaseOutputBuffer(n3, false);
                }
                final cd8 f3 = super.f2;
                f3.e += n5;
                return true;
            }
            return false;
        }
        catch (final AudioSink$WriteException ex) {
            throw this.A((Throwable)ex, n7, ex.F0, 5002);
        }
        catch (final AudioSink$InitializationException ex2) {
            throw this.A((Throwable)ex2, ex2.G0, ex2.F0, 5001);
        }
    }
    
    @Override
    public final void q0() throws ExoPlaybackException {
        try {
            this.m2.q();
        }
        catch (final AudioSink$WriteException ex) {
            throw this.A((Throwable)ex, ex.G0, ex.F0, 5002);
        }
    }
    
    public final long r() {
        if (super.K0 == 2) {
            this.F0();
        }
        return this.q2;
    }
    
    public final hsg y() {
        return (hsg)this;
    }
    
    @Override
    public final boolean y0(final n n) {
        return this.m2.e(n);
    }
    
    @Override
    public final int z0(final com.google.android.exoplayer2.mediacodec.e e, final n n) throws MediaCodecUtil$DecoderQueryException {
        final boolean i = rbh.i(n.Q0);
        int n2 = 0;
        if (!i) {
            return c0e.b(0);
        }
        int n3;
        if (rnw.a >= 21) {
            n3 = 32;
        }
        else {
            n3 = 0;
        }
        final int j1 = n.j1;
        int n4 = 1;
        final boolean b = j1 != 0;
        final boolean b2 = j1 == 0 || j1 == 2;
        if (b2 && this.m2.e(n) && (!b || MediaCodecUtil.h() != null)) {
            return 0xC | n3 | 0x0 | 0x80;
        }
        if ("audio/raw".equals(n.Q0) && !this.m2.e(n)) {
            return c0e.b(1);
        }
        final AudioSink m2 = this.m2;
        final int d1 = n.d1;
        final int e2 = n.e1;
        final n$a n$a = new n$a();
        n$a.k = "audio/raw";
        n$a.x = d1;
        n$a.y = e2;
        n$a.z = 2;
        if (!m2.e(n$a.a())) {
            return c0e.b(1);
        }
        final List<d> e3 = E0(e, n, false, this.m2);
        if (e3.isEmpty()) {
            return c0e.b(1);
        }
        if (!b2) {
            return c0e.b(2);
        }
        final d d2 = e3.get(0);
        final boolean e4 = d2.e(n);
        d d3 = null;
        boolean b3 = false;
        Label_0351: {
            if (!e4) {
                for (int k = 1; k < e3.size(); ++k) {
                    d3 = e3.get(k);
                    if (d3.e(n)) {
                        b3 = false;
                        break Label_0351;
                    }
                }
            }
            n4 = (e4 ? 1 : 0);
            b3 = true;
            d3 = d2;
        }
        int n5;
        if (n4 != 0) {
            n5 = 4;
        }
        else {
            n5 = 3;
        }
        int n6;
        if (n4 != 0 && d3.f(n)) {
            n6 = 16;
        }
        else {
            n6 = 8;
        }
        int n7;
        if (d3.g) {
            n7 = 64;
        }
        else {
            n7 = 0;
        }
        if (b3) {
            n2 = 128;
        }
        return n5 | n6 | n3 | n7 | n2;
    }
}
