// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.q$g;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.source.hls.playlist.c$c;
import com.google.android.exoplayer2.q$f$a;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.hls.playlist.c;
import android.os.Looper;
import java.io.IOException;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.upstream.Loader$e;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$a;
import com.google.android.exoplayer2.source.j$a;
import com.google.android.exoplayer2.source.i$b;
import com.google.android.exoplayer2.source.hls.playlist.c$d;
import com.google.android.exoplayer2.source.hls.playlist.c$a;
import java.util.List;
import java.util.Objects;
import com.google.android.exoplayer2.q$f;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.h;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.q$h;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$b;
import com.google.android.exoplayer2.source.a;

public final class HlsMediaSource extends a implements HlsPlaylistTracker$b
{
    public final vlc h;
    public final q$h i;
    public final ulc j;
    public final b9a k;
    public final d l;
    public final h m;
    public final boolean n;
    public final int o;
    public final boolean p;
    public final HlsPlaylistTracker q;
    public final long r;
    public final q s;
    public q$f t;
    public zxt u;
    
    static {
        eha.a("goog.exo.hls");
    }
    
    public HlsMediaSource(final q s, final ulc j, final vlc h, final b9a k, final d l, final h m, final HlsPlaylistTracker q, final long r, final boolean n, final int o) {
        final q$h d0 = s.D0;
        Objects.requireNonNull(d0);
        this.i = d0;
        this.s = s;
        this.t = s.F0;
        this.j = j;
        this.h = h;
        this.k = k;
        this.l = l;
        this.m = m;
        this.q = q;
        this.r = r;
        this.n = n;
        this.o = o;
        this.p = false;
    }
    
    public static c$a v(final List<c$a> list, final long n) {
        c$d c$d = null;
        c$a c$a;
        for (int i = 0; i < list.size(); ++i, c$d = (c$d)c$a) {
            c$a = list.get(i);
            final long g0 = ((c$d)c$a).G0;
            if (g0 > n || !c$a.N0) {
                c$a = (c$a)c$d;
                if (g0 > n) {
                    break;
                }
            }
        }
        return (c$a)c$d;
    }
    
    public final q e() {
        return this.s;
    }
    
    public final com.google.android.exoplayer2.source.h f(final i$b i$b, final qx qx, final long n) {
        final j$a p3 = this.p(i$b);
        final com.google.android.exoplayer2.drm.c$a o = this.o(i$b);
        final vlc h = this.h;
        final HlsPlaylistTracker q = this.q;
        final ulc j = this.j;
        final zxt u = this.u;
        final d l = this.l;
        final h m = this.m;
        final b9a k = this.k;
        final boolean n2 = this.n;
        final int o2 = this.o;
        final boolean p4 = this.p;
        final hnk g = super.g;
        ri4.y((Object)g);
        return (com.google.android.exoplayer2.source.h)new zlc(h, q, j, u, l, o, m, p3, qx, k, n2, o2, p4, g);
    }
    
    public final void g(final com.google.android.exoplayer2.source.h h) {
        final zlc zlc = (zlc)h;
        zlc.D0.b((HlsPlaylistTracker$a)zlc);
        for (final gmc gmc : zlc.V0) {
            if (gmc.f1) {
                for (final gmc$d gmc$d : gmc.X0) {
                    ((o)gmc$d).h();
                    final DrmSession h2 = ((o)gmc$d).h;
                    if (h2 != null) {
                        h2.b(((o)gmc$d).e);
                        ((o)gmc$d).h = null;
                        ((o)gmc$d).g = null;
                    }
                }
            }
            gmc.L0.f((Loader$e)gmc);
            gmc.T0.removeCallbacksAndMessages((Object)null);
            gmc.j1 = true;
            gmc.U0.clear();
        }
        zlc.S0 = null;
    }
    
    public final void l() throws IOException {
        this.q.n();
    }
    
    public final void s(final zxt u) {
        this.u = u;
        this.l.l();
        final d l = this.l;
        final Looper myLooper = Looper.myLooper();
        Objects.requireNonNull(myLooper);
        final hnk g = super.g;
        ri4.y((Object)g);
        l.b(myLooper, g);
        this.q.l(((q$g)this.i).a, this.p((i$b)null), (HlsPlaylistTracker$b)this);
    }
    
    public final void u() {
        this.q.stop();
        this.l.release();
    }
    
    public final void w(final c c) {
        long t;
        if (c.p) {
            t = imw.T(c.h);
        }
        else {
            t = -9223372036854775807L;
        }
        final int d = c.d;
        long n;
        if (d != 2 && d != 1) {
            n = -9223372036854775807L;
        }
        else {
            n = t;
        }
        final com.google.android.exoplayer2.source.hls.playlist.d e = this.q.e();
        Objects.requireNonNull(e);
        final wlc wlc = new wlc(e, c);
        qbq qbq;
        if (this.q.j()) {
            final long n2 = c.h - this.q.d();
            long n3;
            if (c.o) {
                n3 = n2 + c.u;
            }
            else {
                n3 = -9223372036854775807L;
            }
            long n4;
            if (c.p) {
                final long r = this.r;
                final int a = imw.a;
                long currentTimeMillis;
                if (r == -9223372036854775807L) {
                    currentTimeMillis = System.currentTimeMillis();
                }
                else {
                    currentTimeMillis = SystemClock.elapsedRealtime() + r;
                }
                n4 = imw.H(currentTimeMillis) - (c.h + c.u);
            }
            else {
                n4 = 0L;
            }
            final long c2 = this.t.C0;
            long h;
            if (c2 != -9223372036854775807L) {
                h = imw.H(c2);
            }
            else {
                final c.c$e v = c.v;
                final long e2 = c.e;
                long n5;
                if (e2 != -9223372036854775807L) {
                    n5 = c.u - e2;
                }
                else {
                    n5 = v.d;
                    if (n5 == -9223372036854775807L || c.n == -9223372036854775807L) {
                        n5 = v.c;
                        if (n5 == -9223372036854775807L) {
                            n5 = 3L * c.m;
                        }
                    }
                }
                h = n5 + n4;
            }
            final long j = imw.j(h, n4, c.u + n4);
            final q$f f0 = this.s.F0;
            boolean b = false;
            Label_0416: {
                if (f0.F0 == -3.4028235E38f && f0.G0 == -3.4028235E38f) {
                    final c.c$e v2 = c.v;
                    if (v2.c == -9223372036854775807L && v2.d == -9223372036854775807L) {
                        b = true;
                        break Label_0416;
                    }
                }
                b = false;
            }
            final q$f$a q$f$a = new q$f$a();
            q$f$a.a = imw.T(j);
            final float n6 = 1.0f;
            float f2;
            if (b) {
                f2 = 1.0f;
            }
            else {
                f2 = this.t.F0;
            }
            q$f$a.d = f2;
            float g0;
            if (b) {
                g0 = n6;
            }
            else {
                g0 = this.t.G0;
            }
            q$f$a.e = g0;
            final q$f t2 = new q$f(q$f$a);
            this.t = t2;
            long n7 = c.e;
            if (n7 == -9223372036854775807L) {
                n7 = c.u + n4 - imw.H(t2.C0);
            }
            if (!c.g) {
                final c$a v3 = v((List<c$a>)c.s, n7);
                if (v3 != null) {
                    n7 = ((c$d)v3).G0;
                }
                else if (((List)c.r).isEmpty()) {
                    n7 = 0L;
                }
                else {
                    final aed r2 = c.r;
                    final c$c c$c = (c$c)((List)r2).get(imw.d((List)r2, (Comparable)n7, true));
                    final c$a v4 = v((List<c$a>)c$c.O0, n7);
                    if (v4 != null) {
                        n7 = ((c$d)v4).G0;
                    }
                    else {
                        n7 = ((c$d)c$c).G0;
                    }
                }
            }
            qbq = new qbq(n, t, n3, c.u, n2, n7, true, c.o ^ true, c.d == 2 && c.f, (Object)wlc, this.s, this.t);
        }
        else {
            long n8 = 0L;
            if (c.e != -9223372036854775807L && !((List)c.r).isEmpty()) {
                Label_0823: {
                    if (!c.g) {
                        final long e3 = c.e;
                        if (e3 != c.u) {
                            final aed r3 = c.r;
                            n8 = ((c$d)((List)r3).get(imw.d((List)r3, (Comparable)e3, true))).G0;
                            break Label_0823;
                        }
                    }
                    n8 = c.e;
                }
            }
            else {
                n8 = 0L;
            }
            final long u = c.u;
            qbq = new qbq(n, t, u, u, 0L, n8, true, false, true, (Object)wlc, this.s, (q$f)null);
        }
        this.t((e0)qbq);
    }
}
