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
    public static final int O1 = 0;
    public int A1;
    public int B1;
    public ty0 C1;
    public float D1;
    public boolean E1;
    public List<v87> F1;
    public final dxt G0;
    public boolean G1;
    public final w$a H0;
    public boolean H1;
    public final vf6 I0;
    public i I1;
    public final Context J0;
    public j4x J1;
    public final w K0;
    public r K1;
    public final z[] L0;
    public pmk L1;
    public final cxt M0;
    public int M1;
    public final qcc N0;
    public long N1;
    public final q5w O0;
    public final m P0;
    public final unf<w$c> Q0;
    public final CopyOnWriteArraySet<j$a> R0;
    public final e0$b S0;
    public final List<k.k$d> T0;
    public final boolean U0;
    public final i$a V0;
    public final rf8 W0;
    public final Looper X0;
    public final xh1 Y0;
    public final long Z0;
    public final long a1;
    public final f6s b1;
    public final k.k$b c1;
    public final k.k$c d1;
    public final b e1;
    public final c f1;
    public final c0 g1;
    public final tix h1;
    public final mpx i1;
    public final long j1;
    public int k1;
    public int l1;
    public int m1;
    public boolean n1;
    public int o1;
    public rcp p1;
    public y6q q1;
    public boolean r1;
    public w$a s1;
    public r t1;
    public r u1;
    public AudioTrack v1;
    public Object w1;
    public Surface x1;
    public int y1;
    public int z1;
    
    static {
        qha.a("goog.exo.exoplayer");
    }
    
    @SuppressLint({ "HandlerLeak" })
    public k(final j$b j$b, w k0) {
        this.I0 = new vf6();
        try {
            final String hexString = Integer.toHexString(System.identityHashCode(this));
            final String e = rnw.e;
            final StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(e).length());
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [");
            sb.append("ExoPlayerLib/2.17.1");
            sb.append("] [");
            sb.append(e);
            sb.append("]");
            Log.i("ExoPlayerImpl", sb.toString());
            this.J0 = j$b.a.getApplicationContext();
            this.W0 = new rf8((qi4)j$b.b);
            this.C1 = j$b.i;
            this.y1 = j$b.j;
            this.E1 = false;
            this.j1 = j$b.q;
            final k.k$b c1 = new k.k$b(this);
            this.c1 = c1;
            this.d1 = new k.k$c();
            final Handler handler = new Handler(j$b.h);
            final z[] a = ((mgm)j$b.c.get()).a(handler, (w3x)c1, (a)c1, (vjs)c1, (fah)c1);
            this.L0 = a;
            omi.p(a.length > 0);
            this.M0 = (cxt)j$b.e.get();
            this.V0 = (i$a)j$b.d.get();
            this.Y0 = (xh1)j$b.g.get();
            this.U0 = j$b.k;
            this.p1 = j$b.l;
            this.Z0 = j$b.m;
            this.a1 = j$b.n;
            this.r1 = false;
            final Looper h = j$b.h;
            this.X0 = h;
            final f6s b = j$b.b;
            this.b1 = b;
            if (k0 == null) {
                k0 = (w)this;
            }
            this.K0 = k0;
            this.Q0 = (unf<w$c>)new unf(new CopyOnWriteArraySet(), h, (qi4)b, (unf$b)new srd((Object)this, 2));
            this.R0 = new CopyOnWriteArraySet<j$a>();
            this.T0 = new ArrayList();
            this.q1 = (y6q)new y6q$a(new Random());
            this.G0 = new dxt(new lgm[a.length], new tha[a.length], f0.G0, (Object)null);
            this.S0 = new e0$b();
            final SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            for (int i = 0; i < 20; ++i) {
                final int n = (new int[] { 1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28 })[i];
                omi.p(false ^ true);
                sparseBooleanArray.append(n, true);
            }
            if (this.M0.c()) {
                omi.p(false ^ true);
                sparseBooleanArray.append(29, true);
            }
            omi.p(false ^ true);
            final n2b n2b = new n2b(sparseBooleanArray);
            this.H0 = new w$a(n2b);
            final SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int j = 0; j < n2b.b(); ++j) {
                final int a2 = n2b.a(j);
                omi.p(false ^ true);
                sparseBooleanArray2.append(a2, true);
            }
            omi.p(false ^ true);
            sparseBooleanArray2.append(4, true);
            omi.p(false ^ true);
            sparseBooleanArray2.append(10, true);
            omi.p(false ^ true);
            this.s1 = new w$a(new n2b(sparseBooleanArray2));
            this.N0 = this.b1.b(this.X0, (Handler$Callback)null);
            final q5w o0 = new q5w((Object)this, 1);
            this.O0 = o0;
            this.L1 = pmk.i(this.G0);
            this.W0.L(this.K0, this.X0);
            final int a3 = rnw.a;
            cok a4;
            if (a3 < 31) {
                a4 = new cok();
            }
            else {
                a4 = k.k$a.a();
            }
            this.P0 = new m(this.L0, this.M0, this.G0, (y2g)j$b.f.get(), this.Y0, this.k1, (oz)this.W0, this.p1, (p)j$b.o, j$b.p, this.r1, this.X0, (qi4)this.b1, (m.m$e)o0, a4);
            this.D1 = 1.0f;
            this.k1 = 0;
            final r m1 = r.m1;
            this.t1 = m1;
            this.u1 = m1;
            this.K1 = m1;
            int generateAudioSessionId = -1;
            this.M1 = -1;
            if (a3 < 21) {
                final AudioTrack v1 = this.v1;
                if (v1 != null && v1.getAudioSessionId() != 0) {
                    this.v1.release();
                    this.v1 = null;
                }
                if (this.v1 == null) {
                    this.v1 = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.B1 = this.v1.getAudioSessionId();
            }
            else {
                final AudioManager audioManager = (AudioManager)this.J0.getSystemService("audio");
                if (audioManager != null) {
                    generateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.B1 = generateAudioSessionId;
            }
            this.F1 = nbm.J0;
            this.G1 = true;
            this.x0((w$c)this.W0);
            this.Y0.f(new Handler(this.X0), (xh1$a)this.W0);
            this.R0.add((j$a)this.c1);
            (this.e1 = new b(j$b.a, handler, (b$b)this.c1)).a();
            (this.f1 = new c(j$b.a, handler, (c$b)this.c1)).c();
            final c0 g1 = new c0(j$b.a, handler, (c0$a)this.c1);
            (this.g1 = g1).d(rnw.z(this.C1.H0));
            final tix h2 = new tix(j$b.a);
            this.h1 = h2;
            h2.a = false;
            final mpx i2 = new mpx(j$b.a);
            this.i1 = i2;
            i2.a = false;
            this.I1 = new i(0, g1.a(), g1.d.getStreamMaxVolume(g1.f));
            this.J1 = j4x.J0;
            this.a0(1, 10, this.B1);
            this.a0(2, 10, this.B1);
            this.a0(1, 3, this.C1);
            this.a0(2, 4, this.y1);
            this.a0(2, 5, 0);
            this.a0(1, 9, this.E1);
            this.a0(2, 7, this.d1);
            this.a0(6, 8, this.d1);
        }
        finally {
            this.I0.c();
        }
    }
    
    public static long A(final pmk pmk) {
        final e0$d e0$d = new e0$d();
        final e0$b e0$b = new e0$b();
        pmk.a.i(((jyg)pmk.b).a, e0$b);
        final long c = pmk.c;
        long r0;
        if (c == -9223372036854775807L) {
            r0 = pmk.a.o(e0$b.H0, e0$d).R0;
        }
        else {
            r0 = e0$b.J0 + c;
        }
        return r0;
    }
    
    public static boolean C(final pmk pmk) {
        return pmk.e == 3 && pmk.l && pmk.m == 0;
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
    
    public final void A0() {
        final int n = this.n();
        boolean b = true;
        if (n != 1) {
            if (n == 2 || n == 3) {
                this.D0();
                final boolean p = this.L1.p;
                final tix h1 = this.h1;
                if (!this.e0() || p) {
                    b = false;
                }
                h1.a(b);
                this.i1.a(this.e0());
                return;
            }
            if (n != 4) {
                throw new IllegalStateException();
            }
        }
        this.h1.a(false);
        this.i1.a(false);
    }
    
    public final int B() {
        this.D0();
        return this.k1;
    }
    
    public final r B0() {
        this.D0();
        return this.u1;
    }
    
    public final int C0() {
        this.D0();
        int w;
        if ((w = this.w()) == -1) {
            w = 0;
        }
        return w;
    }
    
    public final pmk D(pmk pmk, final e0 e0, final Pair<Object, Long> pair) {
        omi.m(e0.r() || pair != null);
        final e0 a = pmk.a;
        final pmk h = pmk.h(e0);
        if (e0.r()) {
            final i$b t = pmk.t;
            final i$b t2 = pmk.t;
            final long h2 = rnw.H(this.N1);
            pmk = h.b(t2, h2, h2, h2, 0L, twt.I0, this.G0, nbm.J0).a(t2);
            pmk.q = pmk.s;
            return pmk;
        }
        final Object a2 = ((jyg)h.b).a;
        final int a3 = rnw.a;
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
        final long n = h3 = rnw.H(this.w0());
        if (!a.r()) {
            h3 = n - a.i(a2, this.S0).J0;
        }
        if (!b) {
            final long n2 = lcmp(longValue, h3);
            if (n2 >= 0) {
                if (n2 == 0) {
                    final int c = e0.c(((jyg)h.k).a);
                    if (c != -1) {
                        pmk = h;
                        if (e0.h(c, this.S0, false).H0 == e0.i(((jyg)b2).a, this.S0).H0) {
                            return pmk;
                        }
                    }
                    e0.i(((jyg)b2).a, this.S0);
                    long q;
                    if (((jyg)b2).a()) {
                        q = this.S0.a(((jyg)b2).b, ((jyg)b2).c);
                    }
                    else {
                        q = this.S0.I0;
                    }
                    pmk = h.b(b2, h.s, h.s, h.d, q - h.s, h.h, h.i, h.j).a(b2);
                    pmk.q = q;
                }
                else {
                    omi.p(((jyg)b2).a() ^ true);
                    final long max = Math.max(0L, h.r - (longValue - h3));
                    long q2 = h.q;
                    if (((jyg)h.k).equals((Object)h.b)) {
                        q2 = longValue + max;
                    }
                    pmk = h.b(b2, longValue, longValue, longValue, max, h.h, h.i, h.j);
                    pmk.q = q2;
                }
                return pmk;
            }
        }
        omi.p(((jyg)b2).a() ^ true);
        twt twt;
        if (b) {
            twt = twt.I0;
        }
        else {
            twt = h.h;
        }
        dxt dxt;
        if (b) {
            dxt = this.G0;
        }
        else {
            dxt = h.i;
        }
        List<q9h> list;
        if (b) {
            final eed.b g0 = eed.G0;
            list = nbm.J0;
        }
        else {
            list = h.j;
        }
        pmk = h.b(b2, longValue, longValue, longValue, 0L, twt, dxt, list).a(b2);
        pmk.q = longValue;
        return pmk;
    }
    
    public final void D0() {
        this.I0.a();
        if (Thread.currentThread() != this.X0.getThread()) {
            final String m = rnw.m("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", new Object[] { Thread.currentThread().getName(), this.X0.getThread().getName() });
            if (this.G1) {
                throw new IllegalStateException(m);
            }
            Throwable t;
            if (this.H1) {
                t = null;
            }
            else {
                t = new IllegalStateException();
            }
            tqb.b0("ExoPlayerImpl", m, t);
            this.H1 = true;
        }
    }
    
    public final boolean E0() {
        this.D0();
        return this.g1.h;
    }
    
    public final Pair<Object, Long> F(final e0 e0, final int m1, long b) {
        if (e0.r()) {
            this.M1 = m1;
            long n1 = b;
            if (b == -9223372036854775807L) {
                n1 = 0L;
            }
            this.N1 = n1;
            return null;
        }
        int b2;
        if (m1 == -1 || (b2 = m1) >= e0.q()) {
            b2 = e0.b(false);
            b = e0.o(b2, super.F0).b();
        }
        return (Pair<Object, Long>)e0.k(super.F0, this.S0, b2, rnw.H(b));
    }
    
    public final void F0() {
        this.D0();
    }
    
    public final i G() {
        this.D0();
        return this.I1;
    }
    
    public final ExoPlaybackException H() {
        this.D0();
        return this.L1.f;
    }
    
    public final long H0() {
        this.D0();
        if (this.L1.a.r()) {
            return this.N1;
        }
        final pmk l1 = this.L1;
        if (((jyg)l1.k).d != ((jyg)l1.b).d) {
            return l1.a.o(this.C0(), super.F0).c();
        }
        long n = l1.q;
        if (((jyg)this.L1.k).a()) {
            final pmk l2 = this.L1;
            final e0$b i = l2.a.i(((jyg)l2.k).a, this.S0);
            n = i.d(((jyg)this.L1.k).b);
            if (n == Long.MIN_VALUE) {
                n = i.I0;
            }
        }
        final pmk l3 = this.L1;
        return rnw.T(this.V(l3.a, l3.k, n));
    }
    
    public final void I(final boolean b) {
        this.D0();
        final int e = this.f1.e(b, this.n());
        this.o0(b, e, z(b, e));
    }
    
    public final void J(final List<com.google.android.exoplayer2.source.i> list, final boolean b) {
        this.D0();
        int n = this.w();
        long l = this.l();
        ++this.l1;
        if (!this.T0.isEmpty()) {
            this.W(this.T0.size());
        }
        final ArrayList list2 = new ArrayList();
        for (int i = 0; i < list.size(); ++i) {
            final t$c t$c = new t$c((com.google.android.exoplayer2.source.i)list.get(i), this.U0);
            list2.add(t$c);
            this.T0.add(i + 0, new k.k$d(t$c.b, (e0)t$c.a.o));
        }
        final y6q g = this.q1.g(list2.size());
        this.q1 = g;
        final zok zok = new zok((Collection)this.T0, g);
        if (!((e0)zok).r() && -1 >= zok.J0) {
            throw new IllegalSeekPositionException();
        }
        if (b) {
            n = ((com.google.android.exoplayer2.a)zok).b(false);
            l = -9223372036854775807L;
        }
        final pmk d = this.D(this.L1, (e0)zok, this.F((e0)zok, n, l));
        int e = d.e;
        if (n != -1 && (e = e) != 1) {
            if (!((e0)zok).r() && n < zok.J0) {
                e = 2;
            }
            else {
                e = 4;
            }
        }
        final pmk g2 = d.g(e);
        ((m6s$a)this.P0.M0.d(17, (Object)new m$a((List)list2, this.q1, n, rnw.H(l), (l)null))).b();
        this.s0(g2, 0, 1, false, !((jyg)this.L1.b).a.equals(((jyg)g2.b).a) && !this.L1.a.r(), 4, this.u(g2), -1);
    }
    
    public final void K(final int z1, final int a1) {
        if (z1 != this.z1 || a1 != this.A1) {
            this.z1 = z1;
            this.A1 = a1;
            this.Q0.e(24, (unf$a)new jha(z1, a1));
        }
    }
    
    public final r K0() {
        this.D0();
        return this.t1;
    }
    
    public final long L0() {
        this.D0();
        return this.Z0;
    }
    
    public final List<v87> M() {
        this.D0();
        return this.F1;
    }
    
    public final int N() {
        this.D0();
        int b;
        if (this.r()) {
            b = ((jyg)this.L1.b).b;
        }
        else {
            b = -1;
        }
        return b;
    }
    
    public final void P(final boolean r1) {
        this.D0();
        if (this.r1 == r1) {
            return;
        }
        this.r1 = r1;
        ((m6s$a)this.P0.M0.e(23, (int)(r1 ? 1 : 0), 0)).b();
    }
    
    public final int R() {
        this.D0();
        return this.L1.m;
    }
    
    public final f0 S() {
        this.D0();
        return this.L1.i.d;
    }
    
    public final twt T() {
        this.D0();
        return this.L1.h;
    }
    
    public final e0 U() {
        this.D0();
        return this.L1.a;
    }
    
    public final long V(final e0 e0, final i$b i$b, final long n) {
        e0.i(((jyg)i$b).a, this.S0);
        return n + this.S0.J0;
    }
    
    public final void W(final int n) {
        for (int i = n - 1; i >= 0; --i) {
            this.T0.remove(i);
        }
        this.q1 = this.q1.a(n);
    }
    
    public final axt X() {
        this.D0();
        return this.M0.a();
    }
    
    public final ywt Z() {
        this.D0();
        return new ywt((xwt[])this.L1.i.c);
    }
    
    public final v a() {
        this.D0();
        return this.L1.n;
    }
    
    public final void a0(final int n, final int n2, final Object o) {
        for (final z z : this.L0) {
            if (z.g() == n) {
                final x s = this.s((x$b)z);
                s.e(n2);
                s.d(o);
                s.c();
            }
        }
    }
    
    public final boolean b() {
        this.D0();
        return this.L1.g;
    }
    
    public final int b0() {
        this.D0();
        return this.g1.g;
    }
    
    public final void c0(final int n, long h) {
        this.D0();
        final rf8 w0 = this.W0;
        final boolean n2 = w0.N0;
        int n3 = 1;
        if (!n2) {
            final e00$a x = w0.x();
            w0.N0 = true;
            w0.J(x, -1, (unf$a<e00>)new le8(x, 0));
        }
        final e0 a = this.L1.a;
        if (n < 0 || (!a.r() && n >= a.q())) {
            throw new IllegalSeekPositionException();
        }
        ++this.l1;
        if (this.r()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            final m$d m$d = new m$d(this.L1);
            m$d.a(1);
            final k k = (k)this.O0.G0;
            k.N0.i((Runnable)new npb((Object)k, (Object)m$d, 3));
            return;
        }
        if (this.n() != 1) {
            n3 = 2;
        }
        final int c0 = this.C0();
        final pmk d = this.D(this.L1.g(n3), a, this.F(a, n, h));
        final m p2 = this.P0;
        h = rnw.H(h);
        ((m6s$a)p2.M0.d(3, (Object)new m$g(a, n, h))).b();
        this.s0(d, 0, 1, true, true, 1, this.u(d), c0);
    }
    
    public final w$a d0() {
        this.D0();
        return this.s1;
    }
    
    public final boolean e0() {
        this.D0();
        return this.L1.l;
    }
    
    public final long f() {
        this.D0();
        if (this.r()) {
            final pmk l1 = this.L1;
            final i$b b = l1.b;
            l1.a.i(((jyg)b).a, this.S0);
            return rnw.T(this.S0.a(((jyg)b).b, ((jyg)b).c));
        }
        return this.c();
    }
    
    public final void f0(final boolean b) {
        this.D0();
        this.f1.e(this.e0(), 1);
        this.m0(b, null);
        final eed.b g0 = eed.G0;
        this.F1 = nbm.J0;
    }
    
    public final void g0() {
        this.D0();
    }
    
    public final void h(float h) {
        this.D0();
        h = rnw.h(h, 0.0f, 1.0f);
        if (this.D1 == h) {
            return;
        }
        this.D1 = h;
        this.a0(1, 2, this.f1.g * h);
        this.Q0.e(22, (unf$a)new iha(h));
    }
    
    public final void h0(final Object w1) {
        final ArrayList list = new ArrayList();
        final z[] l0 = this.L0;
        final int length = l0.length;
        int n = 0;
        int n2;
        while (true) {
            n2 = 1;
            if (n >= length) {
                break;
            }
            final z z = l0[n];
            if (z.g() == 2) {
                final x s = this.s((x$b)z);
                s.e(1);
                s.d(w1);
                s.c();
                list.add(s);
            }
            ++n;
        }
        final Object w2 = this.w1;
        int n4;
        if (w2 != null && w2 != w1) {
            int n3 = 0;
            Label_0161: {
                try {
                    final Iterator iterator = list.iterator();
                    while (iterator.hasNext()) {
                        ((x)iterator.next()).a(this.j1);
                    }
                }
                catch (final TimeoutException ex) {
                    n3 = n2;
                    break Label_0161;
                }
                catch (final InterruptedException ex2) {
                    Thread.currentThread().interrupt();
                }
                n3 = 0;
            }
            final Object w3 = this.w1;
            final Surface x1 = this.x1;
            n4 = n3;
            if (w3 == x1) {
                x1.release();
                this.x1 = null;
                n4 = n3;
            }
        }
        else {
            n4 = 0;
        }
        this.w1 = w1;
        if (n4 != 0) {
            this.m0(false, ExoPlaybackException.c((RuntimeException)new ExoTimeoutException(3), 1003));
        }
    }
    
    public final void i(final v v) {
        this.D0();
        if (this.L1.n.equals((Object)v)) {
            return;
        }
        final pmk f = this.L1.f(v);
        ++this.l1;
        ((m6s$a)this.P0.M0.d(4, (Object)v)).b();
        this.s0(f, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }
    
    public final int i0() {
        this.D0();
        if (this.L1.a.r()) {
            return 0;
        }
        final pmk l1 = this.L1;
        return l1.a.c(((jyg)l1.b).a);
    }
    
    public final j4x j0() {
        this.D0();
        return this.J1;
    }
    
    public final void k() {
        this.D0();
        final boolean e0 = this.e0();
        final c f1 = this.f1;
        int n = 2;
        final int e2 = f1.e(e0, 2);
        this.o0(e0, e2, z(e0, e2));
        final pmk l1 = this.L1;
        if (l1.e != 1) {
            return;
        }
        final pmk e3 = l1.e(null);
        if (e3.a.r()) {
            n = 4;
        }
        final pmk g = e3.g(n);
        ++this.l1;
        ((m6s$a)this.P0.M0.b(0)).b();
        this.s0(g, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }
    
    public final float k0() {
        this.D0();
        return this.D1;
    }
    
    public final long l() {
        this.D0();
        return rnw.T(this.u(this.L1));
    }
    
    public final ty0 l0() {
        this.D0();
        return this.C1;
    }
    
    public final void m0(final boolean b, final ExoPlaybackException ex) {
        pmk pmk;
        if (b) {
            final int size = this.T0.size();
            omi.m(size >= 0 && size <= this.T0.size());
            final int c0 = this.C0();
            final e0 u = this.U();
            final int size2 = this.T0.size();
            ++this.l1;
            this.W(size);
            final zok zok = new zok((Collection)this.T0, this.q1);
            final pmk l1 = this.L1;
            long w0 = this.w0();
            Pair pair;
            if (!u.r() && !((e0)zok).r()) {
                pair = u.k(super.F0, this.S0, this.C0(), rnw.H(w0));
                final Object first = pair.first;
                if (((com.google.android.exoplayer2.a)zok).c(first) == -1) {
                    final Object m = com.google.android.exoplayer2.m.M(super.F0, this.S0, this.k1, false, first, u, (e0)zok);
                    if (m != null) {
                        ((com.google.android.exoplayer2.a)zok).i(m, this.S0);
                        final int h0 = this.S0.H0;
                        pair = this.F((e0)zok, h0, ((e0)zok).o(h0, super.F0).b());
                    }
                    else {
                        pair = this.F((e0)zok, -1, -9223372036854775807L);
                    }
                }
            }
            else {
                final boolean b2 = !u.r() && ((e0)zok).r();
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
                pair = this.F((e0)zok, w2, w0);
            }
            final pmk d = this.D(l1, (e0)zok, (Pair<Object, Long>)pair);
            final int e = d.e;
            final boolean b3 = e != 1 && e != 4 && size > 0 && size == size2 && c0 >= d.a.q();
            pmk g = d;
            if (b3) {
                g = d.g(4);
            }
            ((m6s$a)this.P0.M0.f(size, (Object)this.q1)).b();
            pmk = g.e(null);
        }
        else {
            final pmk l2 = this.L1;
            pmk = l2.a(l2.b);
            pmk.q = pmk.s;
            pmk.r = 0L;
        }
        pmk pmk3;
        final pmk pmk2 = pmk3 = pmk.g(1);
        if (ex != null) {
            pmk3 = pmk2.e(ex);
        }
        ++this.l1;
        ((m6s$a)this.P0.M0.b(6)).b();
        this.s0(pmk3, 0, 1, false, pmk3.a.r() && !this.L1.a.r(), 4, this.u(pmk3), -1);
    }
    
    public final int n() {
        this.D0();
        return this.L1.e;
    }
    
    public final void n0() {
        final w$a s1 = this.s1;
        final w k0 = this.K0;
        final w$a h0 = this.H0;
        final int a = rnw.a;
        final boolean r = k0.r();
        final boolean z0 = k0.z0();
        final boolean p0 = k0.p0();
        final boolean l = k0.L();
        final boolean m0 = k0.M0();
        final boolean q = k0.Q();
        final boolean r2 = k0.U().r();
        final w$a$a w$a$a = new w$a$a();
        w$a$a.a(h0);
        final boolean b = r ^ true;
        w$a$a.b(4, b);
        final boolean b2 = false;
        w$a$a.b(5, z0 && !r);
        w$a$a.b(6, p0 && !r);
        w$a$a.b(7, !r2 && (p0 || !m0 || z0) && !r);
        w$a$a.b(8, l && !r);
        w$a$a.b(9, !r2 && (l || (m0 && q)) && !r);
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
        this.s1 = c;
        if (!c.equals((Object)s1)) {
            this.Q0.b(13, (unf$a)new yi0((Object)this, 3));
        }
    }
    
    public final r o() {
        final e0 u = this.U();
        if (u.r()) {
            return this.K1;
        }
        final q h0 = u.o(this.C0(), super.F0).H0;
        final r$a a = this.K1.a();
        final r j0 = h0.J0;
        if (j0 != null) {
            final CharSequence f0 = j0.F0;
            if (f0 != null) {
                a.a = f0;
            }
            final CharSequence g0 = j0.G0;
            if (g0 != null) {
                a.b = g0;
            }
            final CharSequence h2 = j0.H0;
            if (h2 != null) {
                a.c = h2;
            }
            final CharSequence i0 = j0.I0;
            if (i0 != null) {
                a.d = i0;
            }
            final CharSequence j2 = j0.J0;
            if (j2 != null) {
                a.e = j2;
            }
            final CharSequence k0 = j0.K0;
            if (k0 != null) {
                a.f = k0;
            }
            final CharSequence l0 = j0.L0;
            if (l0 != null) {
                a.g = l0;
            }
            final Uri m0 = j0.M0;
            if (m0 != null) {
                a.h = m0;
            }
            final y n0 = j0.N0;
            if (n0 != null) {
                a.i = n0;
            }
            final y o0 = j0.O0;
            if (o0 != null) {
                a.j = o0;
            }
            final byte[] p0 = j0.P0;
            if (p0 != null) {
                final Integer q0 = j0.Q0;
                a.k = p0.clone();
                a.l = q0;
            }
            final Uri r0 = j0.R0;
            if (r0 != null) {
                a.m = r0;
            }
            final Integer s0 = j0.S0;
            if (s0 != null) {
                a.n = s0;
            }
            final Integer t0 = j0.T0;
            if (t0 != null) {
                a.o = t0;
            }
            final Integer u2 = j0.U0;
            if (u2 != null) {
                a.p = u2;
            }
            final Boolean v0 = j0.V0;
            if (v0 != null) {
                a.q = v0;
            }
            final Integer w0 = j0.W0;
            if (w0 != null) {
                a.r = w0;
            }
            final Integer x0 = j0.X0;
            if (x0 != null) {
                a.r = x0;
            }
            final Integer y0 = j0.Y0;
            if (y0 != null) {
                a.s = y0;
            }
            final Integer z0 = j0.Z0;
            if (z0 != null) {
                a.t = z0;
            }
            final Integer a2 = j0.a1;
            if (a2 != null) {
                a.u = a2;
            }
            final Integer b1 = j0.b1;
            if (b1 != null) {
                a.v = b1;
            }
            final Integer c1 = j0.c1;
            if (c1 != null) {
                a.w = c1;
            }
            final CharSequence d1 = j0.d1;
            if (d1 != null) {
                a.x = d1;
            }
            final CharSequence e1 = j0.e1;
            if (e1 != null) {
                a.y = e1;
            }
            final CharSequence f2 = j0.f1;
            if (f2 != null) {
                a.z = f2;
            }
            final Integer g2 = j0.g1;
            if (g2 != null) {
                a.A = g2;
            }
            final Integer h3 = j0.h1;
            if (h3 != null) {
                a.B = h3;
            }
            final CharSequence i2 = j0.i1;
            if (i2 != null) {
                a.C = i2;
            }
            final CharSequence j3 = j0.j1;
            if (j3 != null) {
                a.D = j3;
            }
            final CharSequence k2 = j0.k1;
            if (k2 != null) {
                a.E = k2;
            }
            final Bundle l2 = j0.l1;
            if (l2 != null) {
                a.F = l2;
            }
        }
        return a.a();
    }
    
    public final void o0(final boolean b, final int n, final int n2) {
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
        final pmk l1 = this.L1;
        if ((l1.l ? 1 : 0) == n4 && l1.m == n5) {
            return;
        }
        ++this.l1;
        final pmk d = l1.d((boolean)(n4 != 0), n5);
        ((m6s$a)this.P0.M0.e(1, n4, n5)).b();
        this.s0(d, 0, n2, false, false, 5, -9223372036854775807L, -1);
    }
    
    public final void q(final Surface surface) {
        this.D0();
        this.h0(surface);
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
        this.D0();
        int c;
        if (this.r()) {
            c = ((jyg)this.L1.b).c;
        }
        else {
            c = -1;
        }
        return c;
    }
    
    public final boolean r() {
        this.D0();
        return ((jyg)this.L1.b).a();
    }
    
    public final void r0(final e00 e00) {
        this.W0.K0.d((Object)e00);
    }
    
    public final void release() {
        final String hexString = Integer.toHexString(System.identityHashCode(this));
        final String e = rnw.e;
        final HashSet a = qha.a;
        synchronized (qha.class) {
            final String b = qha.b;
            monitorexit(qha.class);
            final StringBuilder k = tf8.k(l58.g(b, l58.g(e, l58.g(hexString, 36))), "Release ", hexString, " [", "ExoPlayerLib/2.17.1");
            jba.s(k, "] [", e, "] [", b);
            k.append("]");
            Log.i("ExoPlayerImpl", k.toString());
            this.D0();
            if (rnw.a < 21) {
                final AudioTrack v1 = this.v1;
                if (v1 != null) {
                    v1.release();
                    this.v1 = null;
                }
            }
            this.e1.a();
            final c0 g1 = this.g1;
            final c0$b e2 = g1.e;
            if (e2 != null) {
                try {
                    g1.a.unregisterReceiver((BroadcastReceiver)e2);
                }
                catch (final RuntimeException ex) {
                    tqb.b0("StreamVolumeManager", "Error unregistering stream volume receiver", ex);
                }
                g1.e = null;
            }
            this.h1.b = false;
            this.i1.b = false;
            final c f1 = this.f1;
            f1.c = null;
            f1.a();
            Object o = this.P0;
            synchronized (o) {
                boolean e3;
                if (!((m)o).e1 && ((Thread)((m)o).N0).isAlive()) {
                    ((m)o).M0.k(7);
                    ((m)o).n0((wzr<Boolean>)new zga(o, 1), ((m)o).a1);
                    e3 = ((m)o).e1;
                    monitorexit(o);
                }
                else {
                    monitorexit(o);
                    e3 = true;
                }
                if (!e3) {
                    this.Q0.e(10, (unf$a)m71.K0);
                }
                this.Q0.c();
                this.N0.c();
                this.Y0.h((xh1$a)this.W0);
                o = this.L1.g(1);
                this.L1 = (pmk)o;
                o = ((pmk)o).a(((pmk)o).b);
                this.L1 = (pmk)o;
                ((pmk)o).q = ((pmk)o).s;
                this.L1.r = 0L;
                o = this.W0;
                final qcc m0 = ((rf8)o).M0;
                omi.r((Object)m0);
                m0.i((Runnable)new ntl(o, 1));
                o = this.x1;
                if (o != null) {
                    ((Surface)o).release();
                    this.x1 = null;
                }
                o = eed.G0;
                this.F1 = nbm.J0;
            }
        }
    }
    
    public final x s(final x$b x$b) {
        int w = this.w();
        final m p = this.P0;
        final e0 a = this.L1.a;
        if (w == -1) {
            w = 0;
        }
        return new x((x$a)p, x$b, a, w, (qi4)this.b1, p.O0);
    }
    
    public final void s0(final pmk l1, int n, final int n2, final boolean b, final boolean b2, final int n3, long t, int n4) {
        final pmk l2 = this.L1;
        this.L1 = l1;
        final boolean equals = l2.a.equals((Object)l1.a);
        final e0 a = l2.a;
        final e0 a2 = l1.a;
        final boolean r = a2.r();
        final Integer value = -1;
        Pair pair;
        if (r && a.r()) {
            pair = new Pair((Object)Boolean.FALSE, (Object)value);
        }
        else if (a2.r() != a.r()) {
            pair = new Pair((Object)Boolean.TRUE, (Object)3);
        }
        else if (!a.o(a.i(((jyg)l2.b).a, this.S0).H0, super.F0).F0.equals(a2.o(a2.i(((jyg)l1.b).a, this.S0).H0, super.F0).F0)) {
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
        else if (b2 && n3 == 0 && ((jyg)l2.b).d < ((jyg)l1.b).d) {
            pair = new Pair((Object)Boolean.TRUE, (Object)0);
        }
        else {
            pair = new Pair((Object)Boolean.FALSE, (Object)value);
        }
        final boolean booleanValue = (boolean)pair.first;
        final int intValue = (int)pair.second;
        r t2 = this.t1;
        q h0;
        if (booleanValue) {
            if (!l1.a.r()) {
                h0 = l1.a.o(l1.a.i(((jyg)l1.b).a, this.S0).H0, super.F0).H0;
            }
            else {
                h0 = null;
            }
            this.K1 = com.google.android.exoplayer2.r.m1;
        }
        else {
            h0 = null;
        }
        if (booleanValue || !l2.j.equals(l1.j)) {
            final r$a r$a = new r$a(this.K1);
            final List<q9h> j = l1.j;
            for (int i = 0; i < j.size(); ++i) {
                final q9h q9h = j.get(i);
                int n6 = 0;
                while (true) {
                    final q9h$b[] f0 = q9h.F0;
                    if (n6 >= f0.length) {
                        break;
                    }
                    f0[n6].P1(r$a);
                    ++n6;
                }
            }
            this.K1 = new r(r$a);
            t2 = this.o();
        }
        final boolean equals2 = t2.equals((Object)this.t1);
        this.t1 = t2;
        final boolean b3 = l2.l != l1.l;
        final boolean b4 = l2.e != l1.e;
        if (b4 || b3) {
            this.A0();
        }
        final boolean b5 = l2.g != l1.g;
        if (!l2.a.equals((Object)l1.a)) {
            this.Q0.b(0, (unf$a)new kha(l1, n));
        }
        if (b2) {
            final e0$b e0$b = new e0$b();
            Object a3;
            Object f2;
            q h2;
            if (!l2.a.r()) {
                a3 = ((jyg)l2.b).a;
                l2.a.i(a3, e0$b);
                n4 = e0$b.H0;
                n = l2.a.c(a3);
                f2 = l2.a.o(n4, super.F0).F0;
                h2 = super.F0.H0;
            }
            else {
                f2 = null;
                h2 = null;
                a3 = null;
                n = -1;
            }
            long n7 = 0L;
            long n8 = 0L;
            Label_0922: {
                if (n3 == 0) {
                    if (((jyg)l2.b).a()) {
                        final i$b b6 = l2.b;
                        n7 = e0$b.a(((jyg)b6).b, ((jyg)b6).c);
                        n8 = A(l2);
                        break Label_0922;
                    }
                    if (((jyg)l2.b).e != -1) {
                        n7 = A(this.L1);
                    }
                    else {
                        n7 = e0$b.J0 + e0$b.I0;
                    }
                }
                else {
                    if (((jyg)l2.b).a()) {
                        n7 = l2.s;
                        n8 = A(l2);
                        break Label_0922;
                    }
                    n7 = e0$b.J0 + l2.s;
                }
                n8 = n7;
            }
            final long t3 = rnw.T(n7);
            final long t4 = rnw.T(n8);
            final i$b b7 = l2.b;
            final w$d w$d = new w$d(f2, n4, h2, a3, n, t3, t4, ((jyg)b7).b, ((jyg)b7).c);
            n4 = this.C0();
            Object a4;
            Object f3;
            q h3;
            if (!this.L1.a.r()) {
                final pmk l3 = this.L1;
                a4 = ((jyg)l3.b).a;
                l3.a.i(a4, this.S0);
                n = this.L1.a.c(a4);
                f3 = this.L1.a.o(n4, super.F0).F0;
                h3 = super.F0.H0;
            }
            else {
                f3 = null;
                h3 = null;
                a4 = null;
                n = -1;
            }
            final long t5 = rnw.T(t);
            if (((jyg)this.L1.b).a()) {
                t = rnw.T(A(this.L1));
            }
            else {
                t = t5;
            }
            final i$b b8 = this.L1.b;
            this.Q0.b(11, (unf$a)new mha(n3, w$d, new w$d(f3, n4, h3, a4, n, t5, t, ((jyg)b8).b, ((jyg)b8).c)));
        }
        if (booleanValue) {
            this.Q0.b(1, (unf$a)new nf8((Object)h0, intValue, 2));
        }
        if (l2.f != l1.f) {
            this.Q0.b(10, (unf$a)new kdn((Object)l1, 1));
            if (l1.f != null) {
                this.Q0.b(10, (unf$a)new pn1((Object)l1, 2));
            }
        }
        final dxt k = l2.i;
        final dxt m = l1.i;
        if (k != m) {
            this.M0.d(m.e);
            this.Q0.b(2, (unf$a)new x83((Object)l1, (Object)new ywt((xwt[])l1.i.c), 0));
            this.Q0.b(2, (unf$a)new vrx((Object)l1, 2));
        }
        if (equals2 ^ true) {
            this.Q0.b(14, (unf$a)new isx((Object)this.t1, 2));
        }
        if (b5) {
            this.Q0.b(3, (unf$a)new gha(l1, 1));
        }
        if (b4 || b3) {
            this.Q0.b(-1, (unf$a)new hha(l1, 1));
        }
        if (b4) {
            this.Q0.b(4, (unf$a)new l71((Object)l1, 4));
        }
        if (b3) {
            this.Q0.b(5, (unf$a)new lha(l1, n2));
        }
        if (l2.m != l1.m) {
            this.Q0.b(6, (unf$a)new isx((Object)l1, 1));
        }
        if (C(l2) != C(l1)) {
            this.Q0.b(7, (unf$a)new gha(l1, 0));
        }
        if (!l2.n.equals((Object)l1.n)) {
            this.Q0.b(12, (unf$a)new hha(l1, 0));
        }
        if (b) {
            this.Q0.b(-1, (unf$a)m71.J0);
        }
        this.n0();
        this.Q0.a();
        if (l2.o != l1.o) {
            final Iterator<j$a> iterator = this.R0.iterator();
            while (iterator.hasNext()) {
                iterator.next().o();
            }
        }
        if (l2.p != l1.p) {
            final Iterator<j$a> iterator2 = this.R0.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().s();
            }
        }
    }
    
    public final long t() {
        this.D0();
        return rnw.T(this.L1.r);
    }
    
    public final void t0(final e00 e00) {
        final rf8 w0 = this.W0;
        Objects.requireNonNull(w0);
        final unf<e00> k0 = w0.K0;
        if (!k0.g) {
            k0.d.add(new unf$c((Object)e00));
        }
    }
    
    public final long u(final pmk pmk) {
        if (pmk.a.r()) {
            return rnw.H(this.N1);
        }
        if (((jyg)pmk.b).a()) {
            return pmk.s;
        }
        return this.V(pmk.a, pmk.b, pmk.s);
    }
    
    public final long v0() {
        this.D0();
        return this.a1;
    }
    
    public final int w() {
        if (this.L1.a.r()) {
            return this.M1;
        }
        final pmk l1 = this.L1;
        return l1.a.i(((jyg)l1.b).a, this.S0).H0;
    }
    
    public final long w0() {
        this.D0();
        if (this.r()) {
            final pmk l1 = this.L1;
            l1.a.i(((jyg)l1.b).a, this.S0);
            final pmk l2 = this.L1;
            long b;
            if (l2.c == -9223372036854775807L) {
                b = l2.a.o(this.C0(), super.F0).b();
            }
            else {
                b = rnw.T(this.S0.J0) + rnw.T(this.L1.c);
            }
            return b;
        }
        return this.l();
    }
    
    public final void x(final w$c w$c) {
        Objects.requireNonNull(w$c);
        this.Q0.d((Object)w$c);
    }
    
    public final void x0(final w$c w$c) {
        Objects.requireNonNull(w$c);
        final unf<w$c> q0 = this.Q0;
        if (!q0.g) {
            q0.d.add(new unf$c((Object)w$c));
        }
    }
    
    public final void y(final int k1) {
        this.D0();
        if (this.k1 != k1) {
            this.k1 = k1;
            ((m6s$a)this.P0.M0.e(11, k1, 0)).b();
            this.Q0.b(8, (unf$a)new nha(k1, 0));
            this.n0();
            this.Q0.a();
        }
    }
    
    public final long y0() {
        this.D0();
        if (this.r()) {
            final pmk l1 = this.L1;
            long n;
            if (((jyg)l1.k).equals((Object)l1.b)) {
                n = rnw.T(this.L1.q);
            }
            else {
                n = this.f();
            }
            return n;
        }
        return this.H0();
    }
}
