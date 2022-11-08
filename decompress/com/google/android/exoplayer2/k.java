// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import java.util.Objects;
import java.util.HashSet;
import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.net.Uri;
import java.util.Iterator;
import java.util.concurrent.TimeoutException;
import java.util.Collection;
import com.google.android.exoplayer2.source.i$b;
import android.util.Pair;
import android.annotation.SuppressLint;
import android.media.AudioManager;
import android.os.Handler$Callback;
import android.util.SparseBooleanArray;
import java.util.Random;
import java.util.ArrayList;
import com.google.android.exoplayer2.audio.a;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import android.media.AudioTrack;
import android.os.Looper;
import com.google.android.exoplayer2.source.i$a;
import java.util.concurrent.CopyOnWriteArraySet;
import android.content.Context;
import java.util.List;

public final class k extends d implements j
{
    public float A1;
    public boolean B1;
    public List<m87> C1;
    public final wvt D0;
    public boolean D1;
    public final w$a E0;
    public boolean E1;
    public final jf6 F0;
    public i F1;
    public final Context G0;
    public x2x G1;
    public final w H0;
    public r H1;
    public final z[] I0;
    public ulk I1;
    public final vvt J0;
    public int J1;
    public final occ K0;
    public long K1;
    public final p4w L0;
    public final m M0;
    public final mnf<w$c> N0;
    public final CopyOnWriteArraySet<j$a> O0;
    public final e0$b P0;
    public final List<k.k$d> Q0;
    public final boolean R0;
    public final i$a S0;
    public final df8 T0;
    public final Looper U0;
    public final ai1 V0;
    public final long W0;
    public final long X0;
    public final s4s Y0;
    public final k.k$b Z0;
    public final k.k$c a1;
    public final b b1;
    public final c c1;
    public final c0 d1;
    public final jhx e1;
    public final dox f1;
    public final long g1;
    public int h1;
    public int i1;
    public int j1;
    public boolean k1;
    public int l1;
    public fbp m1;
    public k5q n1;
    public boolean o1;
    public w$a p1;
    public r q1;
    public r r1;
    public AudioTrack s1;
    public Object t1;
    public Surface u1;
    public int v1;
    public int w1;
    public int x1;
    public int y1;
    public uy0 z1;
    
    static {
        eha.a("goog.exo.exoplayer");
    }
    
    @SuppressLint({ "HandlerLeak" })
    public k(final j$b j$b, w h0) {
        this.F0 = new jf6();
        try {
            final String hexString = Integer.toHexString(System.identityHashCode(this));
            final String e = imw.e;
            final StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(e).length());
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [");
            sb.append("ExoPlayerLib/2.17.1");
            sb.append("] [");
            sb.append(e);
            sb.append("]");
            Log.i("ExoPlayerImpl", sb.toString());
            this.G0 = j$b.a.getApplicationContext();
            this.T0 = new df8((ki4)j$b.b);
            this.z1 = j$b.i;
            this.v1 = j$b.j;
            this.B1 = false;
            this.g1 = j$b.q;
            final k.k$b z0 = new k.k$b(this);
            this.Z0 = z0;
            this.a1 = new k.k$c();
            final Handler handler = new Handler(j$b.h);
            final z[] a = j$b.c.get().a(handler, (k2x)z0, (a)z0, (iis)z0, (m9h)z0);
            this.I0 = a;
            ri4.t(a.length > 0);
            this.J0 = j$b.e.get();
            this.S0 = j$b.d.get();
            this.V0 = j$b.g.get();
            this.R0 = j$b.k;
            this.m1 = j$b.l;
            this.W0 = j$b.m;
            this.X0 = j$b.n;
            this.o1 = false;
            final Looper h2 = j$b.h;
            this.U0 = h2;
            final s4s b = j$b.b;
            this.Y0 = b;
            if (h0 == null) {
                h0 = (w)this;
            }
            this.H0 = h0;
            this.N0 = new mnf<w$c>(new CopyOnWriteArraySet<mnf.c<Object>>(), h2, (ki4)b, (mnf.b<Object>)new fj4((Object)this, 2));
            this.O0 = new CopyOnWriteArraySet<j$a>();
            this.Q0 = new ArrayList();
            this.n1 = (k5q)new k5q$a(new Random());
            this.D0 = new wvt(new gfm[a.length], new hha[a.length], f0.D0, (Object)null);
            this.P0 = new e0$b();
            final SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            for (int i = 0; i < 20; ++i) {
                final int n = (new int[] { 1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28 })[i];
                ri4.t(false ^ true);
                sparseBooleanArray.append(n, true);
            }
            if (this.J0.c()) {
                ri4.t(false ^ true);
                sparseBooleanArray.append(29, true);
            }
            ri4.t(false ^ true);
            final r2b r2b = new r2b(sparseBooleanArray);
            this.E0 = new w$a(r2b);
            final SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int j = 0; j < r2b.b(); ++j) {
                final int a2 = r2b.a(j);
                ri4.t(false ^ true);
                sparseBooleanArray2.append(a2, true);
            }
            ri4.t(false ^ true);
            sparseBooleanArray2.append(4, true);
            ri4.t(false ^ true);
            sparseBooleanArray2.append(10, true);
            ri4.t(false ^ true);
            this.p1 = new w$a(new r2b(sparseBooleanArray2));
            this.K0 = this.Y0.b(this.U0, (Handler$Callback)null);
            final p4w l0 = new p4w((Object)this, 1);
            this.L0 = l0;
            this.I1 = ulk.i(this.D0);
            this.T0.L(this.H0, this.U0);
            final int a3 = imw.a;
            hnk a4;
            if (a3 < 31) {
                a4 = new hnk();
            }
            else {
                a4 = k.k$a.a();
            }
            this.M0 = new m(this.I0, this.J0, this.D0, j$b.f.get(), this.V0, this.h1, (pz)this.T0, this.m1, (p)j$b.o, j$b.p, this.o1, this.U0, (ki4)this.Y0, (m.m$e)l0, a4);
            this.A1 = 1.0f;
            this.h1 = 0;
            final r j2 = r.j1;
            this.q1 = j2;
            this.r1 = j2;
            this.H1 = j2;
            int generateAudioSessionId = -1;
            this.J1 = -1;
            if (a3 < 21) {
                final AudioTrack s1 = this.s1;
                if (s1 != null && s1.getAudioSessionId() != 0) {
                    this.s1.release();
                    this.s1 = null;
                }
                if (this.s1 == null) {
                    this.s1 = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.y1 = this.s1.getAudioSessionId();
            }
            else {
                final AudioManager audioManager = (AudioManager)this.G0.getSystemService("audio");
                if (audioManager != null) {
                    generateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.y1 = generateAudioSessionId;
            }
            this.C1 = (List<m87>)lam.G0;
            this.D1 = true;
            this.x0((w$c)this.T0);
            this.V0.f(new Handler(this.U0), (ai1$a)this.T0);
            this.O0.add((j$a)this.Z0);
            (this.b1 = new b(j$b.a, handler, (b$b)this.Z0)).a();
            (this.c1 = new c(j$b.a, handler, (c$b)this.Z0)).c();
            final c0 d1 = new c0(j$b.a, handler, (c0$a)this.Z0);
            (this.d1 = d1).d(imw.z(this.z1.E0));
            final jhx e2 = new jhx(j$b.a);
            this.e1 = e2;
            e2.a = false;
            final dox f1 = new dox(j$b.a);
            this.f1 = f1;
            f1.a = false;
            this.F1 = new i(0, d1.a(), d1.d.getStreamMaxVolume(d1.f));
            this.G1 = x2x.G0;
            this.b0(1, 10, this.y1);
            this.b0(2, 10, this.y1);
            this.b0(1, 3, this.z1);
            this.b0(2, 4, this.v1);
            this.b0(2, 5, 0);
            this.b0(1, 9, this.B1);
            this.b0(2, 7, this.a1);
            this.b0(6, 8, this.a1);
        }
        finally {
            this.F0.c();
        }
    }
    
    public static long A(final ulk ulk) {
        final e0$d e0$d = new e0$d();
        final e0$b e0$b = new e0$b();
        ulk.a.i(((rxg)ulk.b).a, e0$b);
        final long c = ulk.c;
        long o0;
        if (c == -9223372036854775807L) {
            o0 = ulk.a.o(e0$b.E0, e0$d).O0;
        }
        else {
            o0 = e0$b.G0 + c;
        }
        return o0;
    }
    
    public static boolean C(final ulk ulk) {
        return ulk.e == 3 && ulk.l && ulk.m == 0;
    }
    
    public static int z(final boolean b, final int n) {
        int n2 = 1;
        if (b) {
            n2 = n2;
            if (n != 1) {
                n2 = 2;
            }
        }
        return n2;
    }
    
    public final r A0() {
        this.E0();
        return this.r1;
    }
    
    public final int B() {
        this.E0();
        return this.h1;
    }
    
    public final void B0() {
        final int n = this.n();
        boolean b = true;
        if (n != 1) {
            if (n == 2 || n == 3) {
                this.E0();
                final boolean p = this.I1.p;
                final jhx e1 = this.e1;
                if (!this.e0() || p) {
                    b = false;
                }
                e1.a(b);
                this.f1.a(this.e0());
                return;
            }
            if (n != 4) {
                throw new IllegalStateException();
            }
        }
        this.e1.a(false);
        this.f1.a(false);
    }
    
    public final int C0() {
        this.E0();
        int w;
        if ((w = this.w()) == -1) {
            w = 0;
        }
        return w;
    }
    
    public final ulk D(ulk ulk, final e0 e0, final Pair<Object, Long> pair) {
        ri4.k(e0.r() || pair != null);
        final e0 a = ulk.a;
        final ulk h = ulk.h(e0);
        if (e0.r()) {
            final i$b t = ulk.t;
            final i$b t2 = ulk.t;
            final long h2 = imw.H(this.K1);
            ulk = h.b(t2, h2, h2, h2, 0L, mvt.F0, this.D0, (List)lam.G0).a(t2);
            ulk.q = ulk.s;
            return ulk;
        }
        final Object a2 = ((rxg)h.b).a;
        final int a3 = imw.a;
        final boolean b = a2.equals(pair.first) ^ true;
        i$b b2;
        if (b) {
            b2 = new i$b(pair.first);
        }
        else {
            b2 = h.b;
        }
        final long longValue = (long)pair.second;
        long h3;
        final long n = h3 = imw.H(this.w0());
        if (!a.r()) {
            h3 = n - a.i(a2, this.P0).G0;
        }
        if (!b) {
            final long n2 = lcmp(longValue, h3);
            if (n2 >= 0) {
                if (n2 == 0) {
                    final int c = e0.c(((rxg)h.k).a);
                    if (c != -1) {
                        ulk = h;
                        if (e0.h(c, this.P0, false).E0 == e0.i(((rxg)b2).a, this.P0).E0) {
                            return ulk;
                        }
                    }
                    e0.i(((rxg)b2).a, this.P0);
                    long q;
                    if (((rxg)b2).a()) {
                        q = this.P0.a(((rxg)b2).b, ((rxg)b2).c);
                    }
                    else {
                        q = this.P0.F0;
                    }
                    ulk = h.b(b2, h.s, h.s, h.d, q - h.s, h.h, h.i, h.j).a(b2);
                    ulk.q = q;
                }
                else {
                    ri4.t(((rxg)b2).a() ^ true);
                    final long max = Math.max(0L, h.r - (longValue - h3));
                    long q2 = h.q;
                    if (((rxg)h.k).equals((Object)h.b)) {
                        q2 = longValue + max;
                    }
                    ulk = h.b(b2, longValue, longValue, longValue, max, h.h, h.i, h.j);
                    ulk.q = q2;
                }
                return ulk;
            }
        }
        ri4.t(((rxg)b2).a() ^ true);
        mvt mvt;
        if (b) {
            mvt = mvt.F0;
        }
        else {
            mvt = h.h;
        }
        wvt wvt;
        if (b) {
            wvt = this.D0;
        }
        else {
            wvt = h.i;
        }
        Object o;
        if (b) {
            final aed$b d0 = aed.D0;
            o = lam.G0;
        }
        else {
            o = h.j;
        }
        ulk = h.b(b2, longValue, longValue, longValue, 0L, mvt, wvt, (List)o).a(b2);
        ulk.q = longValue;
        return ulk;
    }
    
    public final boolean D0() {
        this.E0();
        return this.d1.h;
    }
    
    public final void E0() {
        this.F0.a();
        if (Thread.currentThread() != this.U0.getThread()) {
            final String m = imw.m("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", new Object[] { Thread.currentThread().getName(), this.U0.getThread().getName() });
            if (this.D1) {
                throw new IllegalStateException(m);
            }
            Throwable t;
            if (this.E1) {
                t = null;
            }
            else {
                t = new IllegalStateException();
            }
            dml.F0("ExoPlayerImpl", m, t);
            this.E1 = true;
        }
    }
    
    public final Pair<Object, Long> F(final e0 e0, final int j1, long b) {
        if (e0.r()) {
            this.J1 = j1;
            long k1 = b;
            if (b == -9223372036854775807L) {
                k1 = 0L;
            }
            this.K1 = k1;
            return null;
        }
        int b2;
        if (j1 == -1 || (b2 = j1) >= e0.q()) {
            b2 = e0.b(false);
            b = e0.o(b2, super.C0).b();
        }
        return (Pair<Object, Long>)e0.k(super.C0, this.P0, b2, imw.H(b));
    }
    
    public final void F0() {
        this.E0();
    }
    
    public final i G() {
        this.E0();
        return this.F1;
    }
    
    public final ExoPlaybackException H() {
        this.E0();
        return this.I1.f;
    }
    
    public final long H0() {
        this.E0();
        if (this.I1.a.r()) {
            return this.K1;
        }
        final ulk i1 = this.I1;
        if (((rxg)i1.k).d != ((rxg)i1.b).d) {
            return i1.a.o(this.C0(), super.C0).c();
        }
        long n = i1.q;
        if (((rxg)this.I1.k).a()) {
            final ulk i2 = this.I1;
            final e0$b j = i2.a.i(((rxg)i2.k).a, this.P0);
            n = j.d(((rxg)this.I1.k).b);
            if (n == Long.MIN_VALUE) {
                n = j.F0;
            }
        }
        final ulk i3 = this.I1;
        return imw.T(this.V(i3.a, i3.k, n));
    }
    
    public final void I(final boolean b) {
        this.E0();
        final int e = this.c1.e(b, this.n());
        this.p0(b, e, z(b, e));
    }
    
    public final void J(final List<com.google.android.exoplayer2.source.i> list, final boolean b) {
        this.E0();
        int n = this.w();
        long k = this.k();
        ++this.i1;
        if (!this.Q0.isEmpty()) {
            this.W(this.Q0.size());
        }
        final ArrayList list2 = new ArrayList();
        for (int i = 0; i < list.size(); ++i) {
            final t$c t$c = new t$c((com.google.android.exoplayer2.source.i)list.get(i), this.R0);
            list2.add(t$c);
            this.Q0.add(i + 0, new k.k$d(t$c.b, (e0)t$c.a.o));
        }
        final k5q g = this.n1.g(list2.size());
        this.n1 = g;
        final dok dok = new dok((Collection)this.Q0, g);
        if (!((e0)dok).r() && -1 >= dok.G0) {
            throw new IllegalSeekPositionException();
        }
        if (b) {
            n = ((com.google.android.exoplayer2.a)dok).b(false);
            k = -9223372036854775807L;
        }
        final ulk d = this.D(this.I1, (e0)dok, this.F((e0)dok, n, k));
        int e = d.e;
        if (n != -1 && (e = e) != 1) {
            if (!((e0)dok).r() && n < dok.G0) {
                e = 2;
            }
            else {
                e = 4;
            }
        }
        final ulk g2 = d.g(e);
        ((z4s.a)this.M0.J0.d(17, (Object)new m$a((List)list2, this.n1, n, imw.H(k), (l)null))).b();
        this.t0(g2, 0, 1, false, !((rxg)this.I1.b).a.equals(((rxg)g2.b).a) && !this.I1.a.r(), 4, this.u(g2), -1);
    }
    
    public final void K(final int w1, final int x1) {
        if (w1 != this.w1 || x1 != this.x1) {
            this.w1 = w1;
            this.x1 = x1;
            this.N0.e(24, (mnf.a<w$c>)new wga(w1, x1));
        }
    }
    
    public final r K0() {
        this.E0();
        return this.q1;
    }
    
    public final long L0() {
        this.E0();
        return this.W0;
    }
    
    public final List<m87> M() {
        this.E0();
        return this.C1;
    }
    
    public final int N() {
        this.E0();
        int b;
        if (this.r()) {
            b = ((rxg)this.I1.b).b;
        }
        else {
            b = -1;
        }
        return b;
    }
    
    public final void P(final boolean o1) {
        this.E0();
        if (this.o1 == o1) {
            return;
        }
        this.o1 = o1;
        ((z4s.a)this.M0.J0.e(23, (int)(o1 ? 1 : 0), 0)).b();
    }
    
    public final int R() {
        this.E0();
        return this.I1.m;
    }
    
    public final f0 S() {
        this.E0();
        return this.I1.i.d;
    }
    
    public final mvt T() {
        this.E0();
        return this.I1.h;
    }
    
    public final e0 U() {
        this.E0();
        return this.I1.a;
    }
    
    public final long V(final e0 e0, final i$b i$b, final long n) {
        e0.i(((rxg)i$b).a, this.P0);
        return n + this.P0.G0;
    }
    
    public final void W(final int n) {
        for (int i = n - 1; i >= 0; --i) {
            this.Q0.remove(i);
        }
        this.n1 = this.n1.a(n);
    }
    
    public final tvt X() {
        this.E0();
        return this.J0.a();
    }
    
    public final rvt Z() {
        this.E0();
        return new rvt((qvt[])this.I1.i.c);
    }
    
    public final v a() {
        this.E0();
        return this.I1.n;
    }
    
    public final int a0() {
        this.E0();
        return this.d1.g;
    }
    
    public final void b0(final int n, final int n2, final Object o) {
        for (final z z : this.I0) {
            if (z.h() == n) {
                final x s = this.s((x$b)z);
                s.e(n2);
                s.d(o);
                s.c();
            }
        }
    }
    
    public final boolean c() {
        this.E0();
        return this.I1.g;
    }
    
    public final void c0(final int n, long h) {
        this.E0();
        final df8 t0 = this.T0;
        final boolean k0 = t0.K0;
        int n2 = 1;
        if (!k0) {
            final f00$a x = t0.x();
            t0.K0 = true;
            t0.J(x, -1, (mnf.a)new xd8(x, 0));
        }
        final e0 a = this.I1.a;
        if (n < 0 || (!a.r() && n >= a.q())) {
            throw new IllegalSeekPositionException();
        }
        ++this.i1;
        if (this.r()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            final m$d m$d = new m$d(this.I1);
            m$d.a(1);
            final k i = (k)this.L0.D0;
            i.K0.i((Runnable)new qpb(i, m$d, 3));
            return;
        }
        if (this.n() != 1) {
            n2 = 2;
        }
        final int c0 = this.C0();
        final ulk d = this.D(this.I1.g(n2), a, this.F(a, n, h));
        final m m0 = this.M0;
        h = imw.H(h);
        ((z4s.a)m0.J0.d(3, (Object)new m$g(a, n, h))).b();
        this.t0(d, 0, 1, true, true, 1, this.u(d), c0);
    }
    
    public final void d(float h) {
        this.E0();
        h = imw.h(h, 0.0f, 1.0f);
        if (this.A1 == h) {
            return;
        }
        this.A1 = h;
        this.b0(1, 2, this.c1.g * h);
        this.N0.e(22, (mnf.a<w$c>)new vga(h));
    }
    
    public final w$a d0() {
        this.E0();
        return this.p1;
    }
    
    public final boolean e0() {
        this.E0();
        return this.I1.l;
    }
    
    public final void f0(final boolean b) {
        this.E0();
        this.c1.e(this.e0(), 1);
        this.n0(b, null);
        final aed$b d0 = aed.D0;
        this.C1 = (List<m87>)lam.G0;
    }
    
    public final void g(final v v) {
        this.E0();
        if (this.I1.n.equals((Object)v)) {
            return;
        }
        final ulk f = this.I1.f(v);
        ++this.i1;
        ((z4s.a)this.M0.J0.d(4, (Object)v)).b();
        this.t0(f, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }
    
    public final void g0() {
        this.E0();
    }
    
    public final int h0() {
        this.E0();
        if (this.I1.a.r()) {
            return 0;
        }
        final ulk i1 = this.I1;
        return i1.a.c(((rxg)i1.b).a);
    }
    
    public final long i() {
        this.E0();
        if (this.r()) {
            final ulk i1 = this.I1;
            final i$b b = i1.b;
            i1.a.i(((rxg)b).a, this.P0);
            return imw.T(this.P0.a(((rxg)b).b, ((rxg)b).c));
        }
        return this.e();
    }
    
    public final void i0(final Object t1) {
        final ArrayList list = new ArrayList();
        final z[] i0 = this.I0;
        final int length = i0.length;
        int n = 0;
        int n2;
        while (true) {
            n2 = 1;
            if (n >= length) {
                break;
            }
            final z z = i0[n];
            if (z.h() == 2) {
                final x s = this.s((x$b)z);
                s.e(1);
                s.d(t1);
                s.c();
                list.add(s);
            }
            ++n;
        }
        final Object t2 = this.t1;
        int n4;
        if (t2 != null && t2 != t1) {
            int n3 = 0;
            Label_0154: {
                try {
                    final Iterator iterator = list.iterator();
                    while (iterator.hasNext()) {
                        ((x)iterator.next()).a(this.g1);
                    }
                }
                catch (final TimeoutException ex) {
                    n3 = n2;
                    break Label_0154;
                }
                catch (final InterruptedException ex2) {
                    Thread.currentThread().interrupt();
                }
                n3 = 0;
            }
            final Object t3 = this.t1;
            final Surface u1 = this.u1;
            n4 = n3;
            if (t3 == u1) {
                u1.release();
                this.u1 = null;
                n4 = n3;
            }
        }
        else {
            n4 = 0;
        }
        this.t1 = t1;
        if (n4 != 0) {
            this.n0(false, ExoPlaybackException.c((RuntimeException)new ExoTimeoutException(3), 1003));
        }
    }
    
    public final x2x j0() {
        this.E0();
        return this.G1;
    }
    
    public final long k() {
        this.E0();
        return imw.T(this.u(this.I1));
    }
    
    public final float k0() {
        this.E0();
        return this.A1;
    }
    
    public final void l() {
        this.E0();
        final boolean e0 = this.e0();
        final c c1 = this.c1;
        int n = 2;
        final int e2 = c1.e(e0, 2);
        this.p0(e0, e2, z(e0, e2));
        final ulk i1 = this.I1;
        if (i1.e != 1) {
            return;
        }
        final ulk e3 = i1.e((ExoPlaybackException)null);
        if (e3.a.r()) {
            n = 4;
        }
        final ulk g = e3.g(n);
        ++this.i1;
        ((z4s.a)this.M0.J0.b(0)).b();
        this.t0(g, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }
    
    public final uy0 l0() {
        this.E0();
        return this.z1;
    }
    
    public final int n() {
        this.E0();
        return this.I1.e;
    }
    
    public final void n0(final boolean b, final ExoPlaybackException ex) {
        ulk ulk;
        if (b) {
            final int size = this.Q0.size();
            ri4.k(size >= 0 && size <= this.Q0.size());
            final int c0 = this.C0();
            final e0 u = this.U();
            final int size2 = this.Q0.size();
            ++this.i1;
            this.W(size);
            final dok dok = new dok((Collection)this.Q0, this.n1);
            final ulk i1 = this.I1;
            long w0 = this.w0();
            Pair pair;
            if (!u.r() && !((e0)dok).r()) {
                pair = u.k(super.C0, this.P0, this.C0(), imw.H(w0));
                final Object first = pair.first;
                if (((com.google.android.exoplayer2.a)dok).c(first) == -1) {
                    final Object m = com.google.android.exoplayer2.m.M(super.C0, this.P0, this.h1, false, first, u, (e0)dok);
                    if (m != null) {
                        ((com.google.android.exoplayer2.a)dok).i(m, this.P0);
                        final int e0 = this.P0.E0;
                        pair = this.F((e0)dok, e0, ((e0)dok).o(e0, super.C0).b());
                    }
                    else {
                        pair = this.F((e0)dok, -1, -9223372036854775807L);
                    }
                }
            }
            else {
                final boolean b2 = !u.r() && ((e0)dok).r();
                int w2;
                if (b2) {
                    w2 = -1;
                }
                else {
                    w2 = this.w();
                }
                if (b2) {
                    w0 = -9223372036854775807L;
                }
                pair = this.F((e0)dok, w2, w0);
            }
            final ulk d = this.D(i1, (e0)dok, (Pair<Object, Long>)pair);
            final int e2 = d.e;
            final boolean b3 = e2 != 1 && e2 != 4 && size > 0 && size == size2 && c0 >= d.a.q();
            ulk g = d;
            if (b3) {
                g = d.g(4);
            }
            ((z4s.a)this.M0.J0.f(size, (Object)this.n1)).b();
            ulk = g.e((ExoPlaybackException)null);
        }
        else {
            final ulk i2 = this.I1;
            ulk = i2.a(i2.b);
            ulk.q = ulk.s;
            ulk.r = 0L;
        }
        ulk ulk3;
        final ulk ulk2 = ulk3 = ulk.g(1);
        if (ex != null) {
            ulk3 = ulk2.e(ex);
        }
        ++this.i1;
        ((z4s.a)this.M0.J0.b(6)).b();
        this.t0(ulk3, 0, 1, false, ulk3.a.r() && !this.I1.a.r(), 4, this.u(ulk3), -1);
    }
    
    public final r o() {
        final e0 u = this.U();
        if (u.r()) {
            return this.H1;
        }
        final q e0 = u.o(this.C0(), super.C0).E0;
        final r$a a = this.H1.a();
        final r g0 = e0.G0;
        if (g0 != null) {
            final CharSequence c0 = g0.C0;
            if (c0 != null) {
                a.a = c0;
            }
            final CharSequence d0 = g0.D0;
            if (d0 != null) {
                a.b = d0;
            }
            final CharSequence e2 = g0.E0;
            if (e2 != null) {
                a.c = e2;
            }
            final CharSequence f0 = g0.F0;
            if (f0 != null) {
                a.d = f0;
            }
            final CharSequence g2 = g0.G0;
            if (g2 != null) {
                a.e = g2;
            }
            final CharSequence h0 = g0.H0;
            if (h0 != null) {
                a.f = h0;
            }
            final CharSequence i0 = g0.I0;
            if (i0 != null) {
                a.g = i0;
            }
            final Uri j0 = g0.J0;
            if (j0 != null) {
                a.h = j0;
            }
            final y k0 = g0.K0;
            if (k0 != null) {
                a.i = k0;
            }
            final y l0 = g0.L0;
            if (l0 != null) {
                a.j = l0;
            }
            final byte[] m0 = g0.M0;
            if (m0 != null) {
                final Integer n0 = g0.N0;
                a.k = m0.clone();
                a.l = n0;
            }
            final Uri o0 = g0.O0;
            if (o0 != null) {
                a.m = o0;
            }
            final Integer p0 = g0.P0;
            if (p0 != null) {
                a.n = p0;
            }
            final Integer q0 = g0.Q0;
            if (q0 != null) {
                a.o = q0;
            }
            final Integer r0 = g0.R0;
            if (r0 != null) {
                a.p = r0;
            }
            final Boolean s0 = g0.S0;
            if (s0 != null) {
                a.q = s0;
            }
            final Integer t0 = g0.T0;
            if (t0 != null) {
                a.r = t0;
            }
            final Integer u2 = g0.U0;
            if (u2 != null) {
                a.r = u2;
            }
            final Integer v0 = g0.V0;
            if (v0 != null) {
                a.s = v0;
            }
            final Integer w0 = g0.W0;
            if (w0 != null) {
                a.t = w0;
            }
            final Integer x0 = g0.X0;
            if (x0 != null) {
                a.u = x0;
            }
            final Integer y0 = g0.Y0;
            if (y0 != null) {
                a.v = y0;
            }
            final Integer z0 = g0.Z0;
            if (z0 != null) {
                a.w = z0;
            }
            final CharSequence a2 = g0.a1;
            if (a2 != null) {
                a.x = a2;
            }
            final CharSequence b1 = g0.b1;
            if (b1 != null) {
                a.y = b1;
            }
            final CharSequence c2 = g0.c1;
            if (c2 != null) {
                a.z = c2;
            }
            final Integer d2 = g0.d1;
            if (d2 != null) {
                a.A = d2;
            }
            final Integer e3 = g0.e1;
            if (e3 != null) {
                a.B = e3;
            }
            final CharSequence f2 = g0.f1;
            if (f2 != null) {
                a.C = f2;
            }
            final CharSequence g3 = g0.g1;
            if (g3 != null) {
                a.D = g3;
            }
            final CharSequence h2 = g0.h1;
            if (h2 != null) {
                a.E = h2;
            }
            final Bundle i2 = g0.i1;
            if (i2 != null) {
                a.F = i2;
            }
        }
        return a.a();
    }
    
    public final void o0() {
        final w$a p1 = this.p1;
        final w h0 = this.H0;
        final w$a e0 = this.E0;
        final int a = imw.a;
        final boolean r = h0.r();
        final boolean z0 = h0.z0();
        final boolean m0 = h0.m0();
        final boolean l = h0.L();
        final boolean m2 = h0.M0();
        final boolean q = h0.Q();
        final boolean r2 = h0.U().r();
        final w$a$a w$a$a = new w$a$a();
        w$a$a.a(e0);
        final boolean b = r ^ true;
        w$a$a.b(4, b);
        final boolean b2 = false;
        w$a$a.b(5, z0 && !r);
        w$a$a.b(6, m0 && !r);
        w$a$a.b(7, !r2 && (m0 || !m2 || z0) && !r);
        w$a$a.b(8, l && !r);
        w$a$a.b(9, !r2 && (l || (m2 && q)) && !r);
        w$a$a.b(10, b);
        w$a$a.b(11, z0 && !r);
        boolean b3 = b2;
        if (z0) {
            b3 = b2;
            if (!r) {
                b3 = true;
            }
        }
        w$a$a.b(12, b3);
        final w$a c = w$a$a.c();
        this.p1 = c;
        if (!c.equals((Object)p1)) {
            this.N0.b(13, (mnf.a<w$c>)new cg8((Object)this, 3));
        }
    }
    
    public final void p0(final boolean b, final int n, final int n2) {
        final int n3 = 0;
        int n4;
        if (b && n != -1) {
            n4 = 1;
        }
        else {
            n4 = 0;
        }
        int n5 = n3;
        if (n4 != 0) {
            n5 = n3;
            if (n != 1) {
                n5 = 1;
            }
        }
        final ulk i1 = this.I1;
        if ((i1.l ? 1 : 0) == n4 && i1.m == n5) {
            return;
        }
        ++this.i1;
        final ulk d = i1.d((boolean)(n4 != 0), n5);
        ((z4s.a)this.M0.J0.e(1, n4, n5)).b();
        this.t0(d, 0, n2, false, false, 5, -9223372036854775807L, -1);
    }
    
    public final void q(final Surface surface) {
        this.E0();
        this.i0(surface);
        int n;
        if (surface == null) {
            n = 0;
        }
        else {
            n = -1;
        }
        this.K(n, n);
    }
    
    public final int q0() {
        this.E0();
        int c;
        if (this.r()) {
            c = ((rxg)this.I1.b).c;
        }
        else {
            c = -1;
        }
        return c;
    }
    
    public final boolean r() {
        this.E0();
        return ((rxg)this.I1.b).a();
    }
    
    public final void r0(final f00 f00) {
        this.T0.H0.d(f00);
    }
    
    public final void release() {
        final String hexString = Integer.toHexString(System.identityHashCode(this));
        final String e = imw.e;
        final HashSet a = eha.a;
        synchronized (eha.class) {
            final String b = eha.b;
            monitorexit(eha.class);
            final StringBuilder n = xpa.n(dia.o(b, dia.o(e, dia.o(hexString, 36))), "Release ", hexString, " [", "ExoPlayerLib/2.17.1");
            mag.m(n, "] [", e, "] [", b);
            n.append("]");
            Log.i("ExoPlayerImpl", n.toString());
            this.E0();
            if (imw.a < 21) {
                final AudioTrack s1 = this.s1;
                if (s1 != null) {
                    s1.release();
                    this.s1 = null;
                }
            }
            this.b1.a();
            final c0 d1 = this.d1;
            final c0$b e2 = d1.e;
            if (e2 != null) {
                try {
                    d1.a.unregisterReceiver((BroadcastReceiver)e2);
                }
                catch (final RuntimeException ex) {
                    dml.F0("StreamVolumeManager", "Error unregistering stream volume receiver", (Throwable)ex);
                }
                d1.e = null;
            }
            this.e1.b = false;
            this.f1.b = false;
            final c c1 = this.c1;
            c1.c = null;
            c1.a();
            Object o = this.M0;
            synchronized (o) {
                boolean b2;
                if (!((m)o).b1 && ((Thread)((m)o).K0).isAlive()) {
                    ((m)o).J0.k(7);
                    ((m)o).n0((iyr<Boolean>)new mga(o, 1), ((m)o).X0);
                    b2 = ((m)o).b1;
                    monitorexit(o);
                }
                else {
                    monitorexit(o);
                    b2 = true;
                }
                if (!b2) {
                    this.N0.e(10, (mnf.a<w$c>)m71.H0);
                }
                this.N0.c();
                this.K0.c();
                this.V0.h((ai1$a)this.T0);
                o = this.I1.g(1);
                this.I1 = (ulk)o;
                o = ((ulk)o).a(((ulk)o).b);
                this.I1 = (ulk)o;
                ((ulk)o).q = ((ulk)o).s;
                this.I1.r = 0L;
                o = this.T0;
                final occ j0 = ((df8)o).J0;
                ri4.y((Object)j0);
                j0.i((Runnable)new nsl(o, 1));
                o = this.u1;
                if (o != null) {
                    ((Surface)o).release();
                    this.u1 = null;
                }
                o = aed.D0;
                this.C1 = (List<m87>)lam.G0;
            }
        }
    }
    
    public final x s(final x$b x$b) {
        int w = this.w();
        final m m0 = this.M0;
        final e0 a = this.I1.a;
        if (w == -1) {
            w = 0;
        }
        return new x((x$a)m0, x$b, a, w, (ki4)this.Y0, m0.L0);
    }
    
    public final void s0(final f00 f00) {
        final df8 t0 = this.T0;
        Objects.requireNonNull(t0);
        final mnf h0 = t0.H0;
        if (!h0.g) {
            h0.d.add((mnf.c<T>)new mnf.c<Object>((T)f00));
        }
    }
    
    public final long t() {
        this.E0();
        return imw.T(this.I1.r);
    }
    
    public final void t0(final ulk i1, int n, final int n2, final boolean b, final boolean b2, final int n3, long t, int n4) {
        final ulk i2 = this.I1;
        this.I1 = i1;
        final boolean equals = i2.a.equals((Object)i1.a);
        final e0 a = i2.a;
        final e0 a2 = i1.a;
        final boolean r = a2.r();
        final Integer value = -1;
        Pair pair;
        if (r && a.r()) {
            pair = new Pair((Object)Boolean.FALSE, (Object)value);
        }
        else if (a2.r() != a.r()) {
            pair = new Pair((Object)Boolean.TRUE, (Object)3);
        }
        else if (!a.o(a.i(((rxg)i2.b).a, this.P0).E0, super.C0).C0.equals(a2.o(a2.i(((rxg)i1.b).a, this.P0).E0, super.C0).C0)) {
            int n5;
            if (b2 && n3 == 0) {
                n5 = 1;
            }
            else if (b2 && n3 == 1) {
                n5 = 2;
            }
            else {
                if (!(equals ^ true)) {
                    throw new IllegalStateException();
                }
                n5 = 3;
            }
            pair = new Pair((Object)Boolean.TRUE, (Object)n5);
        }
        else if (b2 && n3 == 0 && ((rxg)i2.b).d < ((rxg)i1.b).d) {
            pair = new Pair((Object)Boolean.TRUE, (Object)0);
        }
        else {
            pair = new Pair((Object)Boolean.FALSE, (Object)value);
        }
        final boolean booleanValue = (boolean)pair.first;
        final int intValue = (int)pair.second;
        r q1 = this.q1;
        q e0;
        if (booleanValue) {
            if (!i1.a.r()) {
                e0 = i1.a.o(i1.a.i(((rxg)i1.b).a, this.P0).E0, super.C0).E0;
            }
            else {
                e0 = null;
            }
            this.H1 = com.google.android.exoplayer2.r.j1;
        }
        else {
            e0 = null;
        }
        if (booleanValue || !i2.j.equals(i1.j)) {
            final r$a r$a = new r$a(this.H1);
            final List j = i1.j;
            for (int k = 0; k < j.size(); ++k) {
                final x8h x8h = j.get(k);
                int n6 = 0;
                while (true) {
                    final x8h$b[] c0 = x8h.C0;
                    if (n6 >= c0.length) {
                        break;
                    }
                    c0[n6].P1(r$a);
                    ++n6;
                }
            }
            this.H1 = new r(r$a);
            q1 = this.o();
        }
        final boolean equals2 = q1.equals((Object)this.q1);
        this.q1 = q1;
        final boolean b3 = i2.l != i1.l;
        final boolean b4 = i2.e != i1.e;
        if (b4 || b3) {
            this.B0();
        }
        final boolean b5 = i2.g != i1.g;
        if (!i2.a.equals((Object)i1.a)) {
            this.N0.b(0, (mnf.a<w$c>)new bha((Object)i1, n));
        }
        if (b2) {
            final e0$b e0$b = new e0$b();
            Object a3;
            Object c2;
            q e2;
            if (!i2.a.r()) {
                a3 = ((rxg)i2.b).a;
                i2.a.i(a3, e0$b);
                n4 = e0$b.E0;
                n = i2.a.c(a3);
                c2 = i2.a.o(n4, super.C0).C0;
                e2 = super.C0.E0;
            }
            else {
                c2 = null;
                e2 = null;
                a3 = null;
                n = -1;
            }
            long n7 = 0L;
            long n8 = 0L;
            Label_0922: {
                if (n3 == 0) {
                    if (((rxg)i2.b).a()) {
                        final i$b b6 = i2.b;
                        n7 = e0$b.a(((rxg)b6).b, ((rxg)b6).c);
                        n8 = A(i2);
                        break Label_0922;
                    }
                    if (((rxg)i2.b).e != -1) {
                        n7 = A(this.I1);
                    }
                    else {
                        n7 = e0$b.G0 + e0$b.F0;
                    }
                }
                else {
                    if (((rxg)i2.b).a()) {
                        n7 = i2.s;
                        n8 = A(i2);
                        break Label_0922;
                    }
                    n7 = e0$b.G0 + i2.s;
                }
                n8 = n7;
            }
            final long t2 = imw.T(n7);
            final long t3 = imw.T(n8);
            final i$b b7 = i2.b;
            final w.d d = new w.d(c2, n4, e2, a3, n, t2, t3, ((rxg)b7).b, ((rxg)b7).c);
            n4 = this.C0();
            Object a4;
            Object c3;
            q e3;
            if (!this.I1.a.r()) {
                final ulk i3 = this.I1;
                a4 = ((rxg)i3.b).a;
                i3.a.i(a4, this.P0);
                n = this.I1.a.c(a4);
                c3 = this.I1.a.o(n4, super.C0).C0;
                e3 = super.C0.E0;
            }
            else {
                c3 = null;
                e3 = null;
                a4 = null;
                n = -1;
            }
            final long t4 = imw.T(t);
            if (((rxg)this.I1.b).a()) {
                t = imw.T(A(this.I1));
            }
            else {
                t = t4;
            }
            final i$b b8 = this.I1.b;
            this.N0.b(11, (mnf.a<w$c>)new d71(n3, d, new w.d(c3, n4, e3, a4, n, t4, t, ((rxg)b8).b, ((rxg)b8).c)));
        }
        if (booleanValue) {
            this.N0.b(1, (mnf.a<w$c>)new ye8((Object)e0, intValue, 2));
        }
        if (i2.f != i1.f) {
            this.N0.b(10, (mnf.a<w$c>)new fcn((Object)i1, 1));
            if (i1.f != null) {
                this.N0.b(10, (mnf.a<w$c>)new on3((Object)i1, 2));
            }
        }
        final wvt l = i2.i;
        final wvt m = i1.i;
        if (l != m) {
            this.J0.d(m.e);
            this.N0.b(2, new zga(i1, new rvt((qvt[])i1.i.c), 0));
            this.N0.b(2, (mnf.a<w$c>)new yga((Object)i1, 0));
        }
        if (equals2 ^ true) {
            this.N0.b(14, (mnf.a<w$c>)new yqx((Object)this.q1, 2));
        }
        if (b5) {
            this.N0.b(3, (mnf.a<w$c>)new tga(i1, 1));
        }
        if (b4 || b3) {
            this.N0.b(-1, new uga(i1, 1));
        }
        if (b4) {
            this.N0.b(4, (mnf.a<w$c>)new l71((Object)i1, 4));
        }
        if (b3) {
            this.N0.b(5, (mnf.a<w$c>)new xga(i1, n2));
        }
        if (i2.m != i1.m) {
            this.N0.b(6, (mnf.a<w$c>)new yqx((Object)i1, 1));
        }
        if (C(i2) != C(i1)) {
            this.N0.b(7, (mnf.a<w$c>)new tga(i1, 0));
        }
        if (!i2.n.equals((Object)i1.n)) {
            this.N0.b(12, new uga(i1, 0));
        }
        if (b) {
            this.N0.b(-1, (mnf.a<w$c>)m71.G0);
        }
        this.o0();
        this.N0.a();
        if (i2.o != i1.o) {
            final Iterator<j$a> iterator = this.O0.iterator();
            while (iterator.hasNext()) {
                iterator.next().o();
            }
        }
        if (i2.p != i1.p) {
            final Iterator<j$a> iterator2 = this.O0.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().s();
            }
        }
    }
    
    public final long u(final ulk ulk) {
        if (ulk.a.r()) {
            return imw.H(this.K1);
        }
        if (((rxg)ulk.b).a()) {
            return ulk.s;
        }
        return this.V(ulk.a, ulk.b, ulk.s);
    }
    
    public final long v0() {
        this.E0();
        return this.X0;
    }
    
    public final int w() {
        if (this.I1.a.r()) {
            return this.J1;
        }
        final ulk i1 = this.I1;
        return i1.a.i(((rxg)i1.b).a, this.P0).E0;
    }
    
    public final long w0() {
        this.E0();
        if (this.r()) {
            final ulk i1 = this.I1;
            i1.a.i(((rxg)i1.b).a, this.P0);
            final ulk i2 = this.I1;
            long b;
            if (i2.c == -9223372036854775807L) {
                b = i2.a.o(this.C0(), super.C0).b();
            }
            else {
                b = imw.T(this.P0.G0) + imw.T(this.I1.c);
            }
            return b;
        }
        return this.k();
    }
    
    public final void x(final w$c w$c) {
        Objects.requireNonNull(w$c);
        this.N0.d(w$c);
    }
    
    public final void x0(final w$c w$c) {
        Objects.requireNonNull(w$c);
        final mnf<w$c> n0 = this.N0;
        if (!n0.g) {
            n0.d.add(new mnf.c<w$c>(w$c));
        }
    }
    
    public final void y(final int h1) {
        this.E0();
        if (this.h1 != h1) {
            this.h1 = h1;
            ((z4s.a)this.M0.J0.e(11, h1, 0)).b();
            this.N0.b(8, new aha(h1));
            this.o0();
            this.N0.a();
        }
    }
    
    public final long y0() {
        this.E0();
        if (this.r()) {
            final ulk i1 = this.I1;
            long n;
            if (((rxg)i1.k).equals((Object)i1.b)) {
                n = imw.T(this.I1.q);
            }
            else {
                n = this.i();
            }
            return n;
        }
        return this.H0();
    }
}
