// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.q$g;
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
    public final jb2 k;
    public final d l;
    public final h m;
    public final boolean n;
    public final int o;
    public final boolean p;
    public final HlsPlaylistTracker q;
    public final long r;
    public final q s;
    public q$f t;
    public hzt u;
    
    static {
        qha.a("goog.exo.hls");
    }
    
    public HlsMediaSource(final q s, final ulc j, final vlc h, final jb2 k, final d l, final h m, final HlsPlaylistTracker q, final long r, final boolean n, final int o) {
        final q$h g0 = s.G0;
        Objects.requireNonNull(g0);
        this.i = g0;
        this.s = s;
        this.t = s.I0;
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
            final long j0 = ((c$d)c$a).J0;
            if (j0 > n || !c$a.Q0) {
                c$a = (c$a)c$d;
                if (j0 > n) {
                    break;
                }
            }
        }
        return (c$a)c$d;
    }
    
    public final q e() {
        return this.s;
    }
    
    public final com.google.android.exoplayer2.source.h f(final i$b i$b, final sx sx, final long n) {
        final j$a p3 = this.p(i$b);
        final com.google.android.exoplayer2.drm.c$a o = this.o(i$b);
        final vlc h = this.h;
        final HlsPlaylistTracker q = this.q;
        final ulc j = this.j;
        final hzt u = this.u;
        final d l = this.l;
        final h m = this.m;
        final jb2 k = this.k;
        final boolean n2 = this.n;
        final int o2 = this.o;
        final boolean p4 = this.p;
        final cok g = super.g;
        omi.r((Object)g);
        return (com.google.android.exoplayer2.source.h)new zlc(h, q, j, u, l, o, m, p3, sx, k, n2, o2, p4, g);
    }
    
    public final void g(final com.google.android.exoplayer2.source.h h) {
        final zlc zlc = (zlc)h;
        zlc.G0.b((HlsPlaylistTracker$a)zlc);
        for (final gmc gmc : zlc.Y0) {
            if (gmc.i1) {
                for (final gmc.d d : gmc.a1) {
                    d.h();
                    final DrmSession h2 = d.h;
                    if (h2 != null) {
                        h2.b(d.e);
                        d.h = null;
                        d.g = null;
                    }
                }
            }
            gmc.O0.f((Loader$e)gmc);
            gmc.W0.removeCallbacksAndMessages((Object)null);
            gmc.m1 = true;
            gmc.X0.clear();
        }
        zlc.V0 = null;
    }
    
    public final void l() throws IOException {
        this.q.n();
    }
    
    public final void s(final hzt u) {
        this.u = u;
        this.l.k();
        final d l = this.l;
        final Looper myLooper = Looper.myLooper();
        Objects.requireNonNull(myLooper);
        final cok g = super.g;
        omi.r((Object)g);
        l.b(myLooper, g);
        this.q.m(((q$g)this.i).a, this.p((i$b)null), (HlsPlaylistTracker$b)this);
    }
    
    public final void u() {
        this.q.stop();
        this.l.release();
    }
    
    public final void w(final c c) {
        long t;
        if (c.p) {
            t = rnw.T(c.h);
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
        final com.google.android.exoplayer2.source.hls.playlist.d f = this.q.f();
        Objects.requireNonNull(f);
        final wlc wlc = new wlc(f, c);
        edq edq;
        if (this.q.k()) {
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
                final int a = rnw.a;
                long currentTimeMillis;
                if (r == -9223372036854775807L) {
                    currentTimeMillis = System.currentTimeMillis();
                }
                else {
                    currentTimeMillis = SystemClock.elapsedRealtime() + r;
                }
                n4 = rnw.H(currentTimeMillis) - (c.h + c.u);
            }
            else {
                n4 = 0L;
            }
            final long f2 = this.t.F0;
            long h;
            if (f2 != -9223372036854775807L) {
                h = rnw.H(f2);
            }
            else {
                final c.c$e v = c.v;
                final long e = c.e;
                long n5;
                if (e != -9223372036854775807L) {
                    n5 = c.u - e;
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
            final long j = rnw.j(h, n4, c.u + n4);
            final q$f i0 = this.s.I0;
            boolean b = false;
            Label_0419: {
                if (i0.I0 == -3.4028235E38f && i0.J0 == -3.4028235E38f) {
                    final c.c$e v2 = c.v;
                    if (v2.c == -9223372036854775807L && v2.d == -9223372036854775807L) {
                        b = true;
                        break Label_0419;
                    }
                }
                b = false;
            }
            final q$f$a q$f$a = new q$f$a();
            q$f$a.a = rnw.T(j);
            final float n6 = 1.0f;
            float i2;
            if (b) {
                i2 = 1.0f;
            }
            else {
                i2 = this.t.I0;
            }
            q$f$a.d = i2;
            float j2;
            if (b) {
                j2 = n6;
            }
            else {
                j2 = this.t.J0;
            }
            q$f$a.e = j2;
            final q$f t2 = new q$f(q$f$a);
            this.t = t2;
            long n7 = c.e;
            if (n7 == -9223372036854775807L) {
                n7 = c.u + n4 - rnw.H(t2.F0);
            }
            if (!c.g) {
                final c$a v3 = v(c.s, n7);
                if (v3 != null) {
                    n7 = ((c$d)v3).J0;
                }
                else if (c.r.isEmpty()) {
                    n7 = 0L;
                }
                else {
                    final eed r2 = c.r;
                    final c$c c$c = (c$c)r2.get(rnw.d((List)r2, (Comparable)n7, true));
                    final c$a v4 = v(c$c.R0, n7);
                    if (v4 != null) {
                        n7 = ((c$d)v4).J0;
                    }
                    else {
                        n7 = ((c$d)c$c).J0;
                    }
                }
            }
            edq = new edq(n, t, n3, c.u, n2, n7, true, c.o ^ true, c.d == 2 && c.f, wlc, this.s, this.t);
        }
        else {
            long n8 = 0L;
            if (c.e != -9223372036854775807L && !c.r.isEmpty()) {
                Label_0819: {
                    if (!c.g) {
                        final long e2 = c.e;
                        if (e2 != c.u) {
                            final eed r3 = c.r;
                            n8 = ((c$d)r3.get(rnw.d((List)r3, (Comparable)e2, true))).J0;
                            break Label_0819;
                        }
                    }
                    n8 = c.e;
                }
            }
            else {
                n8 = 0L;
            }
            final long u = c.u;
            edq = new edq(n, t, u, u, 0L, n8, true, false, true, wlc, this.s, null);
        }
        this.t((e0)edq);
    }
}
