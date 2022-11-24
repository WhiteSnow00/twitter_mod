// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.q$g;
import com.google.android.exoplayer2.q$f;
import com.google.android.exoplayer2.e0$d;
import com.google.android.exoplayer2.e0$b;
import com.google.android.exoplayer2.e0;
import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.upstream.Loader$e;
import android.net.Uri;
import java.util.Objects;
import com.google.android.exoplayer2.upstream.h;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.upstream.a$a;
import com.google.android.exoplayer2.q$h;
import com.google.android.exoplayer2.q;

public final class m extends a implements l$b
{
    public final q h;
    public final q$h i;
    public final a$a j;
    public final k$a k;
    public final d l;
    public final h m;
    public final int n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public hzt s;
    
    public m(final q h, final a$a j, final k$a k, final d l, final h m, final int n) {
        final q$h g0 = h.G0;
        Objects.requireNonNull(g0);
        this.i = g0;
        this.h = h;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = true;
        this.p = -9223372036854775807L;
    }
    
    public final q e() {
        return this.h;
    }
    
    public final com.google.android.exoplayer2.source.h f(final i$b i$b, final sx sx, final long n) {
        final com.google.android.exoplayer2.upstream.a b = this.j.b();
        final hzt s = this.s;
        if (s != null) {
            b.g(s);
        }
        final Uri a = ((q$g)this.i).a;
        final k$a k = this.k;
        omi.r((Object)super.g);
        return (com.google.android.exoplayer2.source.h)new l(a, b, (k)new wt2((xoa)((l71)k).G0), this.l, this.o(i$b), this.m, this.p(i$b), (l.l$b)this, sx, ((q$g)this.i).e, this.n);
    }
    
    public final void g(final com.google.android.exoplayer2.source.h h) {
        final l l = (l)h;
        if (l.a1) {
            for (final o o : l.X0) {
                o.h();
                final DrmSession h2 = o.h;
                if (h2 != null) {
                    h2.b(o.e);
                    o.h = null;
                    o.g = null;
                }
            }
        }
        l.P0.f((Loader$e)l);
        l.U0.removeCallbacksAndMessages((Object)null);
        l.V0 = null;
        l.q1 = true;
    }
    
    public final void l() {
    }
    
    public final void s(final hzt s) {
        this.s = s;
        this.l.k();
        final d l = this.l;
        final Looper myLooper = Looper.myLooper();
        Objects.requireNonNull(myLooper);
        final cok g = super.g;
        omi.r((Object)g);
        l.b(myLooper, g);
        this.v();
    }
    
    public final void u() {
        this.l.release();
    }
    
    public final void v() {
        final long p = this.p;
        final boolean q = this.q;
        final boolean r = this.r;
        final q h = this.h;
        q$f i0;
        if (r) {
            i0 = h.I0;
        }
        else {
            i0 = null;
        }
        Object o = new edq(-9223372036854775807L, -9223372036854775807L, p, p, 0L, 0L, q, false, false, null, h, i0);
        if (this.o) {
            o = new dnb(o) {
                public final e0$b h(final int n, final e0$b e0$b, final boolean b) {
                    super.G0.h(n, e0$b, b);
                    e0$b.K0 = true;
                    return e0$b;
                }
                
                public final e0$d p(final int n, final e0$d e0$d, final long n2) {
                    super.G0.p(n, e0$d, n2);
                    e0$d.Q0 = true;
                    return e0$d;
                }
            };
        }
        this.t((e0)o);
    }
    
    public final void w(final long n, final boolean q, final boolean r) {
        long p3 = n;
        if (n == -9223372036854775807L) {
            p3 = this.p;
        }
        if (!this.o && this.p == p3 && this.q == q && this.r == r) {
            return;
        }
        this.p = p3;
        this.q = q;
        this.r = r;
        this.o = false;
        this.v();
    }
}
