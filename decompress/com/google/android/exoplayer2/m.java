// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import android.os.Message;
import java.io.IOException;
import android.os.SystemClock;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.i$b;
import android.util.Pair;
import java.util.Objects;
import android.os.Handler;
import java.util.ArrayList;
import android.os.Looper;
import android.os.HandlerThread;
import java.util.Set;
import com.google.android.exoplayer2.source.h$a;
import android.os.Handler$Callback;

public final class m implements Handler$Callback, h$a, cxt$a, t$d, com.google.android.exoplayer2.h$a, x$a
{
    public final z[] F0;
    public final Set<z> G0;
    public final kgm[] H0;
    public final cxt I0;
    public final dxt J0;
    public final y2g K0;
    public final xh1 L0;
    public final qcc M0;
    public final HandlerThread N0;
    public final Looper O0;
    public final e0$d P0;
    public final e0$b Q0;
    public final long R0;
    public final boolean S0;
    public final h T0;
    public final ArrayList<m.m$c> U0;
    public final qi4 V0;
    public final m.m$e W0;
    public final s X0;
    public final t Y0;
    public final p Z0;
    public final long a1;
    public rcp b1;
    public pmk c1;
    public m.m$d d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public int j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public int o1;
    public m.m$g p1;
    public long q1;
    public int r1;
    public boolean s1;
    public ExoPlaybackException t1;
    public long u1;
    
    public m(final z[] f0, final cxt i0, final dxt j0, final y2g k0, final xh1 xh1, int l, final oz oz, final rcp b1, final p z0, final long a1, final boolean f2, final Looper looper, final qi4 v0, final m.m$e w0, final cok cok) {
        this.W0 = w0;
        this.F0 = f0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = xh1;
        this.j1 = l;
        l = 0;
        this.k1 = false;
        this.b1 = b1;
        this.Z0 = z0;
        this.a1 = a1;
        this.f1 = f2;
        this.V0 = v0;
        this.u1 = -9223372036854775807L;
        this.R0 = k0.b();
        this.S0 = k0.a();
        final pmk m = pmk.i(j0);
        this.c1 = m;
        this.d1 = new m.m$d(m);
        this.H0 = new kgm[f0.length];
        while (l < f0.length) {
            f0[l].t(l, cok);
            this.H0[l] = f0[l].q();
            ++l;
        }
        this.T0 = new h((com.google.android.exoplayer2.h$a)this, v0);
        this.U0 = new ArrayList<m.m$c>();
        this.G0 = kop.e();
        this.P0 = new e0$d();
        this.Q0 = new e0$b();
        i0.a = (cxt$a)this;
        i0.b = xh1;
        this.s1 = true;
        final Handler handler = new Handler(looper);
        this.X0 = new s(oz, handler);
        this.Y0 = new t((t$d)this, oz, handler, cok);
        final HandlerThread n0 = new HandlerThread("ExoPlayer:Playback", -16);
        ((Thread)(this.N0 = n0)).start();
        final Looper looper2 = n0.getLooper();
        this.O0 = looper2;
        this.M0 = v0.b(looper2, (Handler$Callback)this);
    }
    
    public static boolean J(final m.m$c m$c, final e0 e0, final e0 e2, int c, final boolean b, final e0$d e0$d, final e0$b e0$b) {
        final Object i0 = m$c.I0;
        if (i0 == null) {
            Objects.requireNonNull(m$c.F0);
            Objects.requireNonNull(m$c.F0);
            final long h = rnw.H(-9223372036854775807L);
            final x f0 = m$c.F0;
            final Pair<Object, Long> l = L(e0, new m.m$g(f0.d, f0.h, h), false, c, b, e0$d, e0$b);
            if (l == null) {
                return false;
            }
            m$c.b(e0.c(l.first), (long)l.second, l.first);
            Objects.requireNonNull(m$c.F0);
            return true;
        }
        else {
            c = e0.c(i0);
            if (c == -1) {
                return false;
            }
            Objects.requireNonNull(m$c.F0);
            m$c.G0 = c;
            e2.i(m$c.I0, e0$b);
            if (e0$b.K0 && e2.o(e0$b.H0, e0$d).T0 == e2.c(m$c.I0)) {
                final Pair k = e0.k(e0$d, e0$b, e0.i(m$c.I0, e0$b).H0, m$c.H0 + e0$b.J0);
                m$c.b(e0.c(k.first), (long)k.second, k.first);
            }
            return true;
        }
    }
    
    public static Pair<Object, Long> L(final e0 e0, final m.m$g m$g, final boolean b, final int n, final boolean b2, final e0$d e0$d, final e0$b e0$b) {
        e0 a = m$g.a;
        if (e0.r()) {
            return null;
        }
        if (a.r()) {
            a = e0;
        }
        try {
            final Pair k = a.k(e0$d, e0$b, m$g.b, m$g.c);
            if (e0.equals((Object)a)) {
                return (Pair<Object, Long>)k;
            }
            if (e0.c(k.first) != -1) {
                Pair i = k;
                if (a.i(k.first, e0$b).K0) {
                    i = k;
                    if (a.o(e0$b.H0, e0$d).T0 == a.c(k.first)) {
                        i = e0.k(e0$d, e0$b, e0.i(k.first, e0$b).H0, m$g.c);
                    }
                }
                return (Pair<Object, Long>)i;
            }
            if (b) {
                final Object m = M(e0$d, e0$b, n, b2, k.first, a, e0);
                if (m != null) {
                    return (Pair<Object, Long>)e0.k(e0$d, e0$b, e0.i(m, e0$b).H0, -9223372036854775807L);
                }
            }
            return null;
        }
        catch (final IndexOutOfBoundsException ex) {
            return null;
        }
    }
    
    public static Object M(final e0$d e0$d, final e0$b e0$b, final int n, final boolean b, final Object o, final e0 e0, final e0 e2) {
        int n2;
        int j;
        int n3;
        int c;
        for (n2 = e0.c(o), j = e0.j(), n3 = 0, c = -1; n3 < j && c == -1; c = e2.c(e0.n(n2)), ++n3) {
            n2 = e0.e(n2, e0$b, e0$d, n, b);
            if (n2 == -1) {
                break;
            }
        }
        Object n4;
        if (c == -1) {
            n4 = null;
        }
        else {
            n4 = e2.n(c);
        }
        return n4;
    }
    
    public static n[] h(final tha tha) {
        int i = 0;
        int length;
        if (tha != null) {
            length = ((xwt)tha).length();
        }
        else {
            length = 0;
        }
        final n[] array = new n[length];
        while (i < length) {
            array[i] = ((xwt)tha).g(i);
            ++i;
        }
        return array;
    }
    
    public static boolean v(final z z) {
        return z.getState() != 0;
    }
    
    public static boolean x(final pmk pmk, final e0$b e0$b) {
        final i$b b = pmk.b;
        final e0 a = pmk.a;
        return a.r() || a.i(((jyg)b).a, e0$b).K0;
    }
    
    public final void A() throws ExoPlaybackException {
        this.q(this.Y0.c(), true);
    }
    
    public final void B(final m.m$b m$b) throws ExoPlaybackException {
        final m.m$d d1 = this.d1;
        boolean b = true;
        d1.a(1);
        final t y0 = this.Y0;
        Objects.requireNonNull(m$b);
        Objects.requireNonNull(y0);
        if (y0.e() < 0) {
            b = false;
        }
        omi.m(b);
        y0.j = null;
        this.q(y0.c(), false);
    }
    
    public final void C() {
        this.d1.a(1);
        final int n = 0;
        this.G(false, false, false, true);
        this.K0.c();
        int n2;
        if (this.c1.a.r()) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        this.e0(n2);
        final t y0 = this.Y0;
        final hzt d = this.L0.d();
        omi.p(y0.k ^ true);
        y0.l = d;
        for (int i = n; i < y0.b.size(); ++i) {
            final t$c t$c = y0.b.get(i);
            y0.g(t$c);
            y0.i.add(t$c);
        }
        y0.k = true;
        this.M0.k(2);
    }
    
    public final void D() {
        this.G(true, false, true, false);
        this.K0.g();
        this.e0(1);
        this.N0.quit();
        synchronized (this) {
            this.e1 = true;
            this.notifyAll();
        }
    }
    
    public final void E(final int n, final int n2, final y6q j) throws ExoPlaybackException {
        final m.m$d d1 = this.d1;
        boolean b = true;
        d1.a(1);
        final t y0 = this.Y0;
        Objects.requireNonNull(y0);
        if (n < 0 || n > n2 || n2 > y0.e()) {
            b = false;
        }
        omi.m(b);
        y0.j = j;
        y0.i(n, n2);
        this.q(y0.c(), false);
    }
    
    public final void F() throws ExoPlaybackException {
        final float f0 = this.T0.a().F0;
        final s x0 = this.X0;
        iyg iyg = x0.h;
        final iyg i = x0.i;
        int n = 1;
        while (iyg != null && iyg.d) {
            final dxt j = iyg.i(f0, this.c1.a);
            final dxt n2 = iyg.n;
            boolean b = false;
            Label_0133: {
                Label_0131: {
                    if (n2 != null) {
                        if (n2.c.length == j.c.length) {
                            for (int k = 0; k < j.c.length; ++k) {
                                if (!j.a(n2, k)) {
                                    break Label_0131;
                                }
                            }
                            b = true;
                            break Label_0133;
                        }
                    }
                }
                b = false;
            }
            if (!b) {
                if (n != 0) {
                    final s x2 = this.X0;
                    final iyg h = x2.h;
                    final boolean n3 = x2.n(h);
                    final boolean[] array = new boolean[this.F0.length];
                    final long a = h.a(j, this.c1.s, n3, array);
                    final pmk c1 = this.c1;
                    final boolean b2 = c1.e != 4 && a != c1.s;
                    final pmk c2 = this.c1;
                    this.c1 = this.t(c2.b, a, c2.c, c2.d, b2, 5);
                    if (b2) {
                        this.I(a);
                    }
                    final boolean[] array2 = new boolean[this.F0.length];
                    int n4 = 0;
                    while (true) {
                        final z[] f2 = this.F0;
                        if (n4 >= f2.length) {
                            break;
                        }
                        final z z = f2[n4];
                        array2[n4] = v(z);
                        final mso mso = h.c[n4];
                        if (array2[n4]) {
                            if (mso != z.h()) {
                                this.c(z);
                            }
                            else if (array[n4]) {
                                z.x(this.q1);
                            }
                        }
                        ++n4;
                    }
                    this.g(array2);
                }
                else {
                    this.X0.n(iyg);
                    if (iyg.d) {
                        iyg.a(j, Math.max(iyg.f.b, this.q1 - iyg.o), false, new boolean[iyg.i.length]);
                    }
                }
                this.p(true);
                if (this.c1.e != 4) {
                    this.y();
                    this.l0();
                    this.M0.k(2);
                }
                return;
            }
            if (iyg == i) {
                n = 0;
            }
            iyg = iyg.l;
        }
    }
    
    public final void G(final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        this.M0.h();
        final ExoPlaybackException ex = null;
        this.t1 = null;
        this.h1 = false;
        final h t0 = this.T0;
        t0.K0 = false;
        final b7r f0 = t0.F0;
        if (f0.G0) {
            f0.b(f0.r());
            f0.G0 = false;
        }
        this.q1 = 1000000000000L;
        for (final z z : this.F0) {
            Label_0127: {
                try {
                    this.c(z);
                    break Label_0127;
                }
                catch (final RuntimeException z) {}
                catch (final ExoPlaybackException ex2) {}
                tqb.y("ExoPlayerImplInternal", "Disable failed.", (Throwable)z);
            }
        }
        if (b) {
            for (final z z2 : this.F0) {
                if (this.G0.remove(z2)) {
                    try {
                        z2.b();
                    }
                    catch (final RuntimeException ex3) {
                        tqb.y("ExoPlayerImplInternal", "Reset failed.", ex3);
                    }
                }
            }
        }
        this.o1 = 0;
        final pmk c1 = this.c1;
        i$b b5 = c1.b;
        long s = c1.s;
        long n;
        if (!((jyg)this.c1.b).a() && !x(this.c1, this.Q0)) {
            n = this.c1.s;
        }
        else {
            n = this.c1.c;
        }
        boolean b6 = false;
        Label_0382: {
            if (b2) {
                this.p1 = null;
                final Pair<i$b, Long> l = this.l(this.c1.a);
                final i$b i$b = (i$b)l.first;
                final long longValue = (long)l.second;
                final long n2 = -9223372036854775807L;
                b5 = i$b;
                s = longValue;
                n = n2;
                if (!((jyg)i$b).equals((Object)this.c1.b)) {
                    b6 = true;
                    b5 = i$b;
                    s = longValue;
                    n = n2;
                    break Label_0382;
                }
            }
            b6 = false;
        }
        this.X0.b();
        this.i1 = false;
        final pmk c2 = this.c1;
        final e0 a = c2.a;
        final int e = c2.e;
        ExoPlaybackException f4;
        if (b4) {
            f4 = ex;
        }
        else {
            f4 = c2.f;
        }
        twt twt;
        if (b6) {
            twt = twt.I0;
        }
        else {
            twt = c2.h;
        }
        dxt dxt;
        if (b6) {
            dxt = this.J0;
        }
        else {
            dxt = c2.i;
        }
        List<q9h> list;
        if (b6) {
            final eed.b g0 = eed.G0;
            list = nbm.J0;
        }
        else {
            list = c2.j;
        }
        this.c1 = new pmk(a, b5, n, s, e, f4, false, twt, dxt, list, b5, c2.l, c2.m, c2.n, s, 0L, s, this.n1, false);
        if (b3) {
            final t y0 = this.Y0;
            for (final t$b t$b : y0.h.values()) {
                try {
                    t$b.a.b(t$b.b);
                }
                catch (final RuntimeException ex4) {
                    tqb.y("MediaSourceList", "Failed to release child source.", ex4);
                }
                t$b.a.d((j)t$b.c);
                t$b.a.k((c)t$b.c);
            }
            y0.h.clear();
            y0.i.clear();
            y0.k = false;
        }
    }
    
    public final void H() {
        final iyg h = this.X0.h;
        this.g1 = (h != null && h.f.h && this.f1);
    }
    
    public final void I(long q1) throws ExoPlaybackException {
        final iyg h = this.X0.h;
        long o;
        if (h == null) {
            o = 1000000000000L;
        }
        else {
            o = h.o;
        }
        q1 += o;
        this.q1 = q1;
        this.T0.F0.b(q1);
        for (final z z : this.F0) {
            if (v(z)) {
                z.x(this.q1);
            }
        }
        for (iyg iyg = this.X0.h; iyg != null; iyg = iyg.l) {
            for (final tha tha : iyg.n.c) {
                if (tha != null) {
                    tha.l();
                }
            }
        }
    }
    
    public final void K(final e0 e0, final e0 e2) {
        if (e0.r() && e2.r()) {
            return;
        }
        int size = this.U0.size();
        while (true) {
            final int n = size - 1;
            if (n < 0) {
                break;
            }
            size = n;
            if (J(this.U0.get(n), e0, e2, this.j1, this.k1, this.P0, this.Q0)) {
                continue;
            }
            this.U0.get(n).F0.b(false);
            this.U0.remove(n);
            size = n;
        }
        Collections.sort(this.U0);
    }
    
    public final void N(final long n, final long n2) {
        this.M0.h();
        this.M0.j(n + n2);
    }
    
    public final void O(final boolean b) throws ExoPlaybackException {
        final i$b a = this.X0.h.f.a;
        final long r = this.R(a, this.c1.s, true, false);
        if (r != this.c1.s) {
            final pmk c1 = this.c1;
            this.c1 = this.t(a, r, c1.c, c1.d, b, 5);
        }
    }
    
    public final void P(final m.m$g p) throws ExoPlaybackException {
        final m.m$d d1 = this.d1;
        int n = 1;
        d1.a(1);
        final Pair<Object, Long> l = L(this.c1.a, p, true, this.j1, this.k1, this.P0, this.Q0);
        i$b p2 = null;
        int n3 = 0;
        long n5 = 0L;
        long n6 = 0L;
        Label_0281: {
            long n2;
            long n4;
            if (l == null) {
                final Pair<i$b, Long> i = this.l(this.c1.a);
                p2 = (i$b)i.first;
                n2 = (long)i.second;
                n3 = ((this.c1.a.r() ^ true) ? 1 : 0);
                n4 = -9223372036854775807L;
            }
            else {
                final Object first = l.first;
                n2 = (long)l.second;
                if (p.c == -9223372036854775807L) {
                    n4 = -9223372036854775807L;
                }
                else {
                    n4 = n2;
                }
                p2 = this.X0.p(this.c1.a, first, n2);
                if (((jyg)p2).a()) {
                    this.c1.a.i(((jyg)p2).a, this.Q0);
                    long h0;
                    if (this.Q0.f(((jyg)p2).b) == ((jyg)p2).c) {
                        h0 = this.Q0.L0.H0;
                    }
                    else {
                        h0 = 0L;
                    }
                    n5 = n4;
                    n3 = 1;
                    n6 = h0;
                    break Label_0281;
                }
                if (p.c == -9223372036854775807L) {
                    n3 = 1;
                }
                else {
                    n3 = 0;
                }
            }
            n5 = n4;
            n6 = n2;
            try {
                Label_0558: {
                    long q = 0L;
                    Label_0525: {
                        if (this.c1.a.r()) {
                            this.p1 = p;
                        }
                        else if (l == null) {
                            if (this.c1.e != 1) {
                                this.e0(4);
                            }
                            this.G(false, true, false, true);
                        }
                        else {
                            long n7 = 0L;
                            Label_0480: {
                                if (((jyg)p2).equals((Object)this.c1.b)) {
                                    final iyg h2 = this.X0.h;
                                    long k;
                                    if (h2 != null && h2.d && n6 != 0L) {
                                        k = h2.a.k(n6, this.b1);
                                    }
                                    else {
                                        k = n6;
                                    }
                                    n7 = k;
                                    if (rnw.T(k) == rnw.T(this.c1.s)) {
                                        final pmk c1 = this.c1;
                                        final int e = c1.e;
                                        if (e != 2) {
                                            n7 = k;
                                            if (e != 3) {
                                                break Label_0480;
                                            }
                                        }
                                        final long s = c1.s;
                                        this.c1 = this.t(p2, s, n5, s, (boolean)(n3 != 0), 2);
                                        return;
                                    }
                                }
                                else {
                                    n7 = n6;
                                }
                            }
                            q = this.Q(p2, n7, this.c1.e == 4);
                            if (n6 != q) {
                                break Label_0525;
                            }
                            n = 0;
                            break Label_0525;
                        }
                        q = n6;
                        break Label_0558;
                    }
                    n3 |= n;
                    try {
                        final pmk c2 = this.c1;
                        final e0 a = c2.a;
                        this.m0(a, p2, a, c2.b, n5);
                        this.c1 = this.t(p2, q, n5, q, (boolean)(n3 != 0), 2);
                        return;
                    }
                    finally {
                        n6 = q;
                    }
                }
            }
            finally {}
        }
        this.c1 = this.t(p2, n6, n5, n6, (boolean)(n3 != 0), 2);
    }
    
    public final long Q(final i$b i$b, final long n, final boolean b) throws ExoPlaybackException {
        final s x0 = this.X0;
        return this.R(i$b, n, x0.h != x0.i, b);
    }
    
    public final long R(final i$b i$b, long n, final boolean b, final boolean b2) throws ExoPlaybackException {
        this.j0();
        this.h1 = false;
        if (b2 || this.c1.e == 3) {
            this.e0(2);
        }
        iyg iyg2;
        iyg iyg;
        for (iyg = (iyg2 = this.X0.h); iyg2 != null && !((jyg)i$b).equals((Object)iyg2.f.a); iyg2 = iyg2.l) {}
        if (b || iyg != iyg2 || (iyg2 != null && iyg2.o + n < 0L)) {
            final z[] f0 = this.F0;
            for (int length = f0.length, i = 0; i < length; ++i) {
                this.c(f0[i]);
            }
            if (iyg2 != null) {
                s x0;
                while (true) {
                    x0 = this.X0;
                    if (x0.h == iyg2) {
                        break;
                    }
                    x0.a();
                }
                x0.n(iyg2);
                iyg2.o = 1000000000000L;
                this.f();
            }
        }
        if (iyg2 != null) {
            this.X0.n(iyg2);
            long m;
            if (!iyg2.d) {
                iyg2.f = iyg2.f.b(n);
                m = n;
            }
            else {
                m = n;
                if (iyg2.e) {
                    m = iyg2.a.m(n);
                    iyg2.a.x(m - this.R0, this.S0);
                }
            }
            this.I(m);
            this.y();
            n = m;
        }
        else {
            this.X0.b();
            this.I(n);
        }
        this.p(false);
        this.M0.k(2);
        return n;
    }
    
    public final void S(final x x) throws ExoPlaybackException {
        if (x.g == this.O0) {
            this.b(x);
            final int e = this.c1.e;
            if (e == 3 || e == 2) {
                this.M0.k(2);
            }
        }
        else {
            ((m6s$a)this.M0.d(15, (Object)x)).b();
        }
    }
    
    public final void T(final x x) {
        final Looper g = x.g;
        if (!g.getThread().isAlive()) {
            Log.w("TAG", "Trying to send message on a dead thread.");
            x.b(false);
            return;
        }
        this.V0.b(g, (Handler$Callback)null).i((Runnable)new esm((Object)this, (Object)x, 2));
    }
    
    public final void U(final z z, final long f1) {
        z.k();
        if (z instanceof eks) {
            final eks eks = (eks)z;
            omi.p(eks.P0);
            eks.f1 = f1;
        }
    }
    
    public final void V(final boolean l1, final AtomicBoolean atomicBoolean) {
        if (this.l1 != l1 && !(this.l1 = l1)) {
            for (final z z : this.F0) {
                if (!v(z) && this.G0.remove(z)) {
                    z.b();
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                this.notifyAll();
            }
        }
    }
    
    public final void W(final m.m$a m$a) throws ExoPlaybackException {
        this.d1.a(1);
        if (m$a.c != -1) {
            this.p1 = new m.m$g((e0)new zok((Collection)m$a.a, m$a.b), m$a.c, m$a.d);
        }
        final t y0 = this.Y0;
        final List a = m$a.a;
        final y6q b = m$a.b;
        y0.i(0, y0.b.size());
        this.q(y0.a(y0.b.size(), a, b), false);
    }
    
    public final void X(final boolean n1) {
        if (n1 == this.n1) {
            return;
        }
        this.n1 = n1;
        final pmk c1 = this.c1;
        final int e = c1.e;
        if (!n1 && e != 4 && e != 1) {
            this.M0.k(2);
        }
        else {
            this.c1 = c1.c(n1);
        }
    }
    
    public final void Y(final boolean f1) throws ExoPlaybackException {
        this.f1 = f1;
        this.H();
        if (this.g1) {
            final s x0 = this.X0;
            if (x0.i != x0.h) {
                this.O(true);
                this.p(false);
            }
        }
    }
    
    public final void Z(final boolean b, int i, final boolean b2, final int g) throws ExoPlaybackException {
        this.d1.a((int)(b2 ? 1 : 0));
        final m.m$d d1 = this.d1;
        d1.a = true;
        d1.f = true;
        d1.g = g;
        this.c1 = this.c1.d(b, i);
        this.h1 = false;
        for (iyg iyg = this.X0.h; iyg != null; iyg = iyg.l) {
            final tha[] c = iyg.n.c;
            int length;
            tha tha;
            for (length = c.length, i = 0; i < length; ++i) {
                tha = c[i];
                if (tha != null) {
                    tha.a();
                }
            }
        }
        if (!this.f0()) {
            this.j0();
            this.l0();
        }
        else {
            i = this.c1.e;
            if (i == 3) {
                this.h0();
                this.M0.k(2);
            }
            else if (i == 2) {
                this.M0.k(2);
            }
        }
    }
    
    public final void a(final m.m$a m$a, final int n) throws ExoPlaybackException {
        this.d1.a(1);
        final t y0 = this.Y0;
        int e = n;
        if (n == -1) {
            e = y0.e();
        }
        this.q(y0.a(e, m$a.a, m$a.b), false);
    }
    
    public final void a0(v a) throws ExoPlaybackException {
        this.T0.i(a);
        a = this.T0.a();
        this.s(a, a.F0, true, true);
    }
    
    public final void b(final x x) throws ExoPlaybackException {
        monitorenter(x);
        monitorexit(x);
        try {
            x.a.m(x.e, x.f);
        }
        finally {
            x.b(true);
        }
    }
    
    public final void b0(final int n) throws ExoPlaybackException {
        this.j1 = n;
        final s x0 = this.X0;
        final e0 a = this.c1.a;
        x0.f = n;
        if (!x0.q(a)) {
            this.O(true);
        }
        this.p(false);
    }
    
    public final void c(final z z) throws ExoPlaybackException {
        if (z.getState() == 0) {
            return;
        }
        final h t0 = this.T0;
        if (z == t0.H0) {
            t0.I0 = null;
            t0.H0 = null;
            t0.J0 = true;
        }
        if (z.getState() == 2) {
            z.stop();
        }
        z.d();
        --this.o1;
    }
    
    public final void c0(final boolean b) throws ExoPlaybackException {
        this.k1 = b;
        final s x0 = this.X0;
        final e0 a = this.c1.a;
        x0.g = b;
        if (!x0.q(a)) {
            this.O(true);
        }
        this.p(false);
    }
    
    public final void d() throws ExoPlaybackException, IOException {
        final long a = this.V0.a();
        if (!this.c1.a.r()) {
            if (this.Y0.k) {
                this.X0.m(this.q1);
                final s x0 = this.X0;
                final iyg j = x0.j;
                if (j == null || (!j.f.i && j.f() && x0.j.f.e != -9223372036854775807L && x0.k < 100)) {
                    final s x2 = this.X0;
                    final long q1 = this.q1;
                    final pmk c1 = this.c1;
                    final iyg i = x2.j;
                    kyg kyg;
                    if (i == null) {
                        kyg = x2.d(c1.a, c1.b, c1.c, c1.s);
                    }
                    else {
                        kyg = x2.c(c1.a, i, q1);
                    }
                    if (kyg != null) {
                        final s x3 = this.X0;
                        final kgm[] h0 = this.H0;
                        final cxt i2 = this.I0;
                        final sx e = this.K0.e();
                        final t y0 = this.Y0;
                        final dxt j2 = this.J0;
                        final iyg k = x3.j;
                        long n;
                        if (k == null) {
                            n = 1000000000000L;
                        }
                        else {
                            n = k.o + k.f.e - kyg.b;
                        }
                        final iyg iyg = new iyg(h0, n, i2, e, y0, kyg, j2);
                        final iyg l = x3.j;
                        if (l != null) {
                            if (iyg != l.l) {
                                l.b();
                                l.l = iyg;
                                l.c();
                            }
                        }
                        else {
                            x3.h = iyg;
                            x3.i = iyg;
                        }
                        x3.l = null;
                        x3.j = iyg;
                        ++x3.k;
                        x3.l();
                        iyg.a.o((h$a)this, kyg.b);
                        if (this.X0.h == iyg) {
                            this.I(kyg.b);
                        }
                        this.p(false);
                    }
                }
                if (this.i1) {
                    this.i1 = this.u();
                    this.k0();
                }
                else {
                    this.y();
                }
                final iyg m = this.X0.i;
                if (m != null) {
                    if (m.l != null && !this.g1) {
                        boolean b = false;
                        Label_0659: {
                            Label_0652: {
                                if (m.d) {
                                    int n2 = 0;
                                    while (true) {
                                        final z[] f0 = this.F0;
                                        if (n2 >= f0.length) {
                                            break;
                                        }
                                        final z z = f0[n2];
                                        final mso mso = m.c[n2];
                                        if (z.h() != mso) {
                                            break Label_0652;
                                        }
                                        if (mso != null && !z.j()) {
                                            final iyg l2 = m.l;
                                            if (!m.f.f || !l2.d || (!(z instanceof eks) && !(z instanceof hah) && z.w() < l2.e())) {
                                                break Label_0652;
                                            }
                                        }
                                        ++n2;
                                    }
                                    b = true;
                                    break Label_0659;
                                }
                            }
                            b = false;
                        }
                        if (b) {
                            final iyg l3 = m.l;
                            if (l3.d || this.q1 >= l3.e()) {
                                final dxt n3 = m.n;
                                final s x4 = this.X0;
                                final iyg i3 = x4.i;
                                omi.p(i3 != null && i3.l != null);
                                x4.i = x4.i.l;
                                x4.l();
                                final iyg i4 = x4.i;
                                final dxt n4 = i4.n;
                                final e0 a2 = this.c1.a;
                                this.m0(a2, i4.f.a, a2, m.f.a, -9223372036854775807L);
                                if (i4.d && i4.a.n() != -9223372036854775807L) {
                                    final long e2 = i4.e();
                                    for (final z z2 : this.F0) {
                                        if (z2.h() != null) {
                                            this.U(z2, e2);
                                        }
                                    }
                                }
                                else {
                                    for (int n6 = 0; n6 < this.F0.length; ++n6) {
                                        final boolean b2 = n3.b(n6);
                                        final boolean b3 = n4.b(n6);
                                        if (b2 && !this.F0[n6].p()) {
                                            final boolean b4 = ((e)this.H0[n6]).F0 == -2;
                                            final lgm lgm = n3.b[n6];
                                            final lgm lgm2 = n4.b[n6];
                                            if (!b3 || !lgm2.equals((Object)lgm) || b4) {
                                                this.U(this.F0[n6], i4.e());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else if (m.f.i || this.g1) {
                        int n7 = 0;
                        while (true) {
                            final z[] f3 = this.F0;
                            if (n7 >= f3.length) {
                                break;
                            }
                            final z z3 = f3[n7];
                            final mso mso2 = m.c[n7];
                            if (mso2 != null && z3.h() == mso2 && z3.j()) {
                                final long e3 = m.f.e;
                                long n8;
                                if (e3 != -9223372036854775807L && e3 != Long.MIN_VALUE) {
                                    n8 = e3 + m.o;
                                }
                                else {
                                    n8 = -9223372036854775807L;
                                }
                                this.U(z3, n8);
                            }
                            ++n7;
                        }
                    }
                }
                final s x5 = this.X0;
                final iyg i5 = x5.i;
                if (i5 != null && x5.h != i5) {
                    if (!i5.g) {
                        final dxt n9 = i5.n;
                        int n10 = 0;
                        int n11 = 0;
                        while (true) {
                            final z[] f4 = this.F0;
                            if (n10 >= f4.length) {
                                break;
                            }
                            final z z4 = f4[n10];
                            if (v(z4)) {
                                final boolean b5 = z4.h() != i5.c[n10];
                                if (!n9.b(n10) || b5) {
                                    if (!z4.p()) {
                                        z4.n(h(n9.c[n10]), i5.c[n10], i5.e(), i5.o);
                                    }
                                    else if (z4.f()) {
                                        this.c(z4);
                                    }
                                    else {
                                        n11 = 1;
                                    }
                                }
                            }
                            ++n10;
                        }
                        if ((n11 ^ 0x1) != 0x0) {
                            this.f();
                        }
                    }
                }
                int n12 = 0;
                while (true) {
                    boolean b6 = false;
                    Label_1437: {
                        if (this.f0()) {
                            if (!this.g1) {
                                final iyg h2 = this.X0.h;
                                if (h2 != null) {
                                    final iyg l4 = h2.l;
                                    if (l4 != null && this.q1 >= l4.e() && l4.g) {
                                        b6 = true;
                                        break Label_1437;
                                    }
                                }
                            }
                        }
                        b6 = false;
                    }
                    if (!b6) {
                        break;
                    }
                    if (n12 != 0) {
                        this.z();
                    }
                    final iyg a3 = this.X0.a();
                    Objects.requireNonNull(a3);
                    boolean b8 = false;
                    Label_1548: {
                        if (((jyg)this.c1.b).a.equals(((jyg)a3.f.a).a)) {
                            final i$b b7 = this.c1.b;
                            if (((jyg)b7).b == -1) {
                                final i$b a4 = a3.f.a;
                                if (((jyg)a4).b == -1 && ((jyg)b7).e != ((jyg)a4).e) {
                                    b8 = true;
                                    break Label_1548;
                                }
                            }
                        }
                        b8 = false;
                    }
                    final kyg f5 = a3.f;
                    final i$b a5 = f5.a;
                    final long b9 = f5.b;
                    this.c1 = this.t(a5, b9, f5.c, b9, b8 ^ true, 0);
                    this.H();
                    this.l0();
                    n12 = 1;
                }
            }
        }
        final int e4 = this.c1.e;
        if (e4 == 1 || e4 == 4) {
            this.M0.h();
            return;
        }
        final iyg h3 = this.X0.h;
        if (h3 == null) {
            this.N(a, 10L);
            return;
        }
        amz.m("doSomeWork");
        this.l0();
        int n13;
        int n14;
        if (h3.d) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            h3.a.x(this.c1.s - this.R0, this.S0);
            n13 = 1;
            n14 = 1;
            int n15 = 0;
            while (true) {
                final z[] f6 = this.F0;
                if (n15 >= f6.length) {
                    break;
                }
                final z z5 = f6[n15];
                int n16;
                int n17;
                if (!v(z5)) {
                    n16 = n13;
                    n17 = n14;
                }
                else {
                    z5.v(this.q1, elapsedRealtime * 1000L);
                    int n18;
                    if (n13 != 0 && z5.f()) {
                        n18 = 1;
                    }
                    else {
                        n18 = 0;
                    }
                    final boolean b10 = h3.c[n15] != z5.h();
                    final boolean b11 = !b10 && z5.j();
                    final boolean b12 = b10 || b11 || z5.c() || z5.f();
                    int n19;
                    if (n14 != 0 && b12) {
                        n19 = 1;
                    }
                    else {
                        n19 = 0;
                    }
                    n16 = n18;
                    n17 = n19;
                    if (!b12) {
                        z5.o();
                        n17 = n19;
                        n16 = n18;
                    }
                }
                ++n15;
                n13 = n16;
                n14 = n17;
            }
        }
        else {
            h3.a.q();
            n14 = 1;
            n13 = 1;
        }
        final long e5 = h3.f.e;
        final boolean b13 = n13 != 0 && h3.d && (e5 == -9223372036854775807L || e5 <= this.c1.s);
        if (b13 && this.g1) {
            this.Z(this.g1 = false, this.c1.m, false, 5);
        }
        Label_2496: {
            if (b13 && h3.f.i) {
                this.e0(4);
                this.j0();
            }
            else {
                final pmk c2 = this.c1;
                if (c2.e == 2) {
                    boolean w = false;
                    Label_2258: {
                        if (this.o1 == 0) {
                            w = this.w();
                        }
                        else {
                            Label_2249: {
                                if (n14 != 0) {
                                    if (c2.g) {
                                        long i6;
                                        if (this.g0(c2.a, this.X0.h.f.a)) {
                                            i6 = ((g)this.Z0).i;
                                        }
                                        else {
                                            i6 = -9223372036854775807L;
                                        }
                                        final iyg j3 = this.X0.j;
                                        final boolean b14 = j3.f() && j3.f.i;
                                        final boolean b15 = ((jyg)j3.f.a).a() && !j3.d;
                                        if (!b14 && !b15) {
                                            if (!this.K0.d(this.m(), this.T0.a().F0, this.h1, i6)) {
                                                break Label_2249;
                                            }
                                        }
                                    }
                                    w = true;
                                    break Label_2258;
                                }
                            }
                            w = false;
                        }
                    }
                    if (w) {
                        this.e0(3);
                        this.t1 = null;
                        if (this.f0()) {
                            this.h0();
                        }
                        break Label_2496;
                    }
                }
                if (this.c1.e == 3) {
                    if (this.o1 == 0) {
                        if (this.w()) {
                            break Label_2496;
                        }
                    }
                    else if (n14 != 0) {
                        break Label_2496;
                    }
                    this.h1 = this.f0();
                    this.e0(2);
                    if (this.h1) {
                        for (iyg iyg2 = this.X0.h; iyg2 != null; iyg2 = iyg2.l) {
                            for (final tha tha : iyg2.n.c) {
                                if (tha != null) {
                                    tha.t();
                                }
                            }
                        }
                        final g g = (g)this.Z0;
                        final long i7 = g.i;
                        if (i7 != -9223372036854775807L) {
                            final long i8 = i7 + g.b;
                            g.i = i8;
                            final long h4 = g.h;
                            if (h4 != -9223372036854775807L && i8 > h4) {
                                g.i = h4;
                            }
                            g.m = -9223372036854775807L;
                        }
                    }
                    this.j0();
                }
            }
        }
        boolean b16 = false;
        Label_2610: {
            if (this.c1.e == 2) {
                int n21 = 0;
                while (true) {
                    final z[] f7 = this.F0;
                    if (n21 >= f7.length) {
                        break;
                    }
                    if (v(f7[n21]) && this.F0[n21].h() == h3.c[n21]) {
                        this.F0[n21].o();
                    }
                    ++n21;
                }
                final pmk c4 = this.c1;
                if (!c4.g && c4.r < 500000L && this.u()) {
                    b16 = true;
                    break Label_2610;
                }
            }
            b16 = false;
        }
        if (!b16) {
            this.u1 = -9223372036854775807L;
        }
        else if (this.u1 == -9223372036854775807L) {
            this.u1 = this.V0.c();
        }
        else if (this.V0.c() - this.u1 >= 4000L) {
            throw new IllegalStateException("Playback stuck buffering and not loading");
        }
        final boolean n22 = this.n1;
        final pmk c5 = this.c1;
        if (n22 != c5.o) {
            this.c1 = c5.c(n22);
        }
        int n23 = 0;
        Label_2810: {
            if (!this.f0() || this.c1.e != 3) {
                final int e6 = this.c1.e;
                if (e6 != 2) {
                    if (this.o1 != 0 && e6 != 4) {
                        this.N(a, 1000L);
                    }
                    else {
                        this.M0.h();
                    }
                    n23 = 0;
                    break Label_2810;
                }
            }
            boolean b17;
            if (this.n1 && this.m1) {
                b17 = false;
            }
            else {
                this.N(a, 10L);
                b17 = true;
            }
            n23 = ((b17 ^ true) ? 1 : 0);
        }
        final pmk c6 = this.c1;
        if ((c6.p ? 1 : 0) != n23) {
            this.c1 = new pmk(c6.a, c6.b, c6.c, c6.d, c6.e, c6.f, c6.g, c6.h, c6.i, c6.j, c6.k, c6.l, c6.m, c6.n, c6.q, c6.r, c6.s, c6.o, (boolean)(n23 != 0));
        }
        this.m1 = false;
        amz.s();
    }
    
    public final void d0(final y6q y6q) throws ExoPlaybackException {
        this.d1.a(1);
        final t y0 = this.Y0;
        final int e = y0.e();
        y6q g = y6q;
        if (y6q.getLength() != e) {
            g = y6q.e().g(e);
        }
        y0.j = g;
        this.q(y0.c(), false);
    }
    
    public final void e(final com.google.android.exoplayer2.source.p p) {
        ((m6s$a)this.M0.d(9, (Object)p)).b();
    }
    
    public final void e0(final int n) {
        final pmk c1 = this.c1;
        if (c1.e != n) {
            if (n != 2) {
                this.u1 = -9223372036854775807L;
            }
            this.c1 = c1.g(n);
        }
    }
    
    public final void f() throws ExoPlaybackException {
        this.g(new boolean[this.F0.length]);
    }
    
    public final boolean f0() {
        final pmk c1 = this.c1;
        return c1.l && c1.m == 0;
    }
    
    public final void g(final boolean[] array) throws ExoPlaybackException {
        final iyg i = this.X0.i;
        final dxt n = i.n;
        for (int j = 0; j < this.F0.length; ++j) {
            if (!n.b(j) && this.G0.remove(this.F0[j])) {
                this.F0[j].b();
            }
        }
        for (int k = 0; k < this.F0.length; ++k) {
            if (n.b(k)) {
                final boolean b = array[k];
                final z h0 = this.F0[k];
                if (!v(h0)) {
                    final s x0 = this.X0;
                    final iyg l = x0.i;
                    final boolean b2 = l == x0.h;
                    final dxt n2 = l.n;
                    final lgm lgm = n2.b[k];
                    final n[] h2 = h(n2.c[k]);
                    final boolean b3 = this.f0() && this.c1.e == 3;
                    final boolean b4 = !b && b3;
                    ++this.o1;
                    this.G0.add(h0);
                    h0.l(lgm, h2, l.c[k], this.q1, b4, b2, l.e(), l.o);
                    ((x$b)h0).m(11, (Object)new l(this));
                    final h t0 = this.T0;
                    Objects.requireNonNull(t0);
                    final hsg y = h0.y();
                    if (y != null) {
                        final hsg i2 = t0.I0;
                        if (y != i2) {
                            if (i2 != null) {
                                throw ExoPlaybackException.c(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                            }
                            t0.I0 = y;
                            t0.H0 = h0;
                            y.i(t0.F0.J0);
                        }
                    }
                    if (b3) {
                        h0.start();
                    }
                }
            }
        }
        i.g = true;
    }
    
    public final boolean g0(final e0 e0, final i$b i$b) {
        final boolean a = ((jyg)i$b).a();
        boolean b2;
        final boolean b = b2 = false;
        if (!a) {
            if (e0.r()) {
                b2 = b;
            }
            else {
                e0.o(e0.i(((jyg)i$b).a, this.Q0).H0, this.P0);
                b2 = b;
                if (this.P0.d()) {
                    final e0$d p2 = this.P0;
                    b2 = b;
                    if (p2.N0) {
                        b2 = b;
                        if (p2.K0 != -9223372036854775807L) {
                            b2 = true;
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    public final void h0() throws ExoPlaybackException {
        int i = 0;
        this.h1 = false;
        final h t0 = this.T0;
        t0.K0 = true;
        t0.F0.c();
        for (z[] f0 = this.F0; i < f0.length; ++i) {
            final z z = f0[i];
            if (v(z)) {
                z.start();
            }
        }
    }
    
    public final boolean handleMessage(final Message message) {
        int n = 1000;
        try {
            switch (message.what) {
                default: {
                    return false;
                }
                case 25: {
                    this.O(true);
                    break;
                }
                case 24: {
                    this.X(message.arg1 == 1);
                    break;
                }
                case 23: {
                    this.Y(message.arg1 != 0);
                    break;
                }
                case 22: {
                    this.A();
                    break;
                }
                case 21: {
                    this.d0((y6q)message.obj);
                    break;
                }
                case 20: {
                    this.E(message.arg1, message.arg2, (y6q)message.obj);
                    break;
                }
                case 19: {
                    this.B((m.m$b)message.obj);
                    break;
                }
                case 18: {
                    this.a((m.m$a)message.obj, message.arg1);
                    break;
                }
                case 17: {
                    this.W((m.m$a)message.obj);
                    break;
                }
                case 16: {
                    final v v = (v)message.obj;
                    this.s(v, v.F0, true, false);
                    break;
                }
                case 15: {
                    this.T((x)message.obj);
                    break;
                }
                case 14: {
                    final x x = (x)message.obj;
                    Objects.requireNonNull(x);
                    this.S(x);
                    break;
                }
                case 13: {
                    this.V(message.arg1 != 0, (AtomicBoolean)message.obj);
                    break;
                }
                case 12: {
                    this.c0(message.arg1 != 0);
                    break;
                }
                case 11: {
                    this.b0(message.arg1);
                    break;
                }
                case 10: {
                    this.F();
                    break;
                }
                case 9: {
                    this.n((com.google.android.exoplayer2.source.h)message.obj);
                    break;
                }
                case 8: {
                    this.r((com.google.android.exoplayer2.source.h)message.obj);
                    break;
                }
                case 7: {
                    this.D();
                    return true;
                }
                case 6: {
                    this.i0(false, true);
                    break;
                }
                case 5: {
                    this.b1 = (rcp)message.obj;
                    break;
                }
                case 4: {
                    this.a0((v)message.obj);
                    break;
                }
                case 3: {
                    this.P((m.m$g)message.obj);
                    break;
                }
                case 2: {
                    this.d();
                    break;
                }
                case 1: {
                    this.Z(message.arg1 != 0, message.arg2, true, 1);
                    break;
                }
                case 0: {
                    this.C();
                    break;
                }
            }
        }
        catch (final RuntimeException ex) {
            if (ex instanceof IllegalStateException || ex instanceof IllegalArgumentException) {
                n = 1004;
            }
            final ExoPlaybackException c = ExoPlaybackException.c(ex, n);
            tqb.y("ExoPlayerImplInternal", "Playback error", (Throwable)c);
            this.i0(true, false);
            this.c1 = this.c1.e(c);
        }
        catch (final IOException ex2) {
            this.o(ex2, 2000);
        }
        catch (final BehindLiveWindowException ex3) {
            this.o((IOException)ex3, 1002);
        }
        catch (final DataSourceException ex4) {
            this.o((IOException)ex4, ex4.F0);
        }
        catch (final ParserException ex5) {
            final int g0 = ex5.G0;
            if (g0 == 1) {
                if (ex5.F0) {
                    n = 3001;
                }
                else {
                    n = 3003;
                }
            }
            else if (g0 == 4) {
                if (ex5.F0) {
                    n = 3002;
                }
                else {
                    n = 3004;
                }
            }
            this.o((IOException)ex5, n);
        }
        catch (final DrmSession$DrmSessionException ex6) {
            this.o((IOException)ex6, ex6.F0);
        }
        catch (final ExoPlaybackException ex7) {
            ExoPlaybackException b = ex7;
            if (ex7.H0 != 0) {
                final iyg i = this.X0.i;
                b = ex7;
                if (i != null) {
                    b = ex7.b((jyg)i.f.a);
                }
            }
            if (b.N0 && this.t1 == null) {
                tqb.b0("ExoPlayerImplInternal", "Recoverable renderer error", (Throwable)b);
                this.t1 = b;
                final qcc m0 = this.M0;
                m0.g(m0.d(25, (Object)b));
            }
            else {
                final ExoPlaybackException t1 = this.t1;
                ExoPlaybackException t2 = b;
                if (t1 != null) {
                    ((Throwable)t1).addSuppressed((Throwable)b);
                    t2 = this.t1;
                }
                tqb.y("ExoPlayerImplInternal", "Playback error", (Throwable)t2);
                this.i0(true, false);
                this.c1 = this.c1.e(t2);
            }
        }
        this.z();
        return true;
    }
    
    public final void i(final com.google.android.exoplayer2.source.h h) {
        ((m6s$a)this.M0.d(8, (Object)h)).b();
    }
    
    public final void i0(final boolean b, final boolean b2) {
        this.G(b || !this.l1, false, true, false);
        this.d1.a((int)(b2 ? 1 : 0));
        this.K0.f();
        this.e0(1);
    }
    
    public final long j(final e0 e0, final Object o, final long n) {
        e0.o(e0.i(o, this.Q0).H0, this.P0);
        final e0$d p3 = this.P0;
        if (p3.K0 != -9223372036854775807L && p3.d()) {
            final e0$d p4 = this.P0;
            if (p4.N0) {
                return rnw.H(p4.a() - this.P0.K0) - (n + this.Q0.J0);
            }
        }
        return -9223372036854775807L;
    }
    
    public final void j0() throws ExoPlaybackException {
        final h t0 = this.T0;
        int i = 0;
        t0.K0 = false;
        final b7r f0 = t0.F0;
        if (f0.G0) {
            f0.b(f0.r());
            f0.G0 = false;
        }
        for (z[] f2 = this.F0; i < f2.length; ++i) {
            final z z = f2[i];
            if (v(z) && z.getState() == 2) {
                z.stop();
            }
        }
    }
    
    public final long k() {
        final iyg i = this.X0.i;
        if (i == null) {
            return 0L;
        }
        long o = i.o;
        if (!i.d) {
            return o;
        }
        int n = 0;
        while (true) {
            final z[] f0 = this.F0;
            if (n >= f0.length) {
                return o;
            }
            long max = o;
            if (v(f0[n])) {
                if (this.F0[n].h() != i.c[n]) {
                    max = o;
                }
                else {
                    final long w = this.F0[n].w();
                    if (w == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    max = Math.max(w, o);
                }
            }
            ++n;
            o = max;
        }
    }
    
    public final void k0() {
        final iyg j = this.X0.j;
        final boolean b = this.i1 || (j != null && j.a.b());
        final pmk c1 = this.c1;
        if (b != c1.g) {
            this.c1 = new pmk(c1.a, c1.b, c1.c, c1.d, c1.e, c1.f, b, c1.h, c1.i, c1.j, c1.k, c1.l, c1.m, c1.n, c1.q, c1.r, c1.s, c1.o, c1.p);
        }
    }
    
    public final Pair<i$b, Long> l(final e0 e0) {
        final boolean r = e0.r();
        final long n = 0L;
        if (r) {
            final i$b t = pmk.t;
            return (Pair<i$b, Long>)Pair.create((Object)pmk.t, (Object)0L);
        }
        final Pair k = e0.k(this.P0, this.Q0, e0.b(this.k1), -9223372036854775807L);
        final i$b p = this.X0.p(e0, k.first, 0L);
        long n2 = (long)k.second;
        if (((jyg)p).a()) {
            e0.i(((jyg)p).a, this.Q0);
            n2 = n;
            if (((jyg)p).c == this.Q0.f(((jyg)p).b)) {
                n2 = this.Q0.L0.H0;
            }
        }
        return (Pair<i$b, Long>)Pair.create((Object)p, (Object)n2);
    }
    
    public final void l0() throws ExoPlaybackException {
        final iyg h = this.X0.h;
        if (h == null) {
            return;
        }
        long n;
        if (h.d) {
            n = h.a.n();
        }
        else {
            n = -9223372036854775807L;
        }
        if (n != -9223372036854775807L) {
            this.I(n);
            if (n != this.c1.s) {
                final pmk c1 = this.c1;
                this.c1 = this.t(c1.b, n, c1.c, n, true, 5);
            }
        }
        else {
            final h t0 = this.T0;
            final boolean b = h != this.X0.i;
            final z h2 = t0.H0;
            boolean b2 = false;
            Label_0191: {
                Label_0189: {
                    if (h2 != null && !h2.f()) {
                        if (!t0.H0.c()) {
                            if (b) {
                                break Label_0189;
                            }
                            if (t0.H0.j()) {
                                break Label_0189;
                            }
                        }
                        b2 = false;
                        break Label_0191;
                    }
                }
                b2 = true;
            }
            Label_0391: {
                if (b2) {
                    t0.J0 = true;
                    if (t0.K0) {
                        t0.F0.c();
                    }
                }
                else {
                    final hsg i0 = t0.I0;
                    Objects.requireNonNull(i0);
                    final long r = i0.r();
                    if (t0.J0) {
                        if (r < t0.F0.r()) {
                            final b7r f0 = t0.F0;
                            if (f0.G0) {
                                f0.b(f0.r());
                                f0.G0 = false;
                            }
                            break Label_0391;
                        }
                        else {
                            t0.J0 = false;
                            if (t0.K0) {
                                t0.F0.c();
                            }
                        }
                    }
                    t0.F0.b(r);
                    final v a = i0.a();
                    if (!a.equals((Object)t0.F0.J0)) {
                        t0.F0.i(a);
                        ((m6s$a)((m)t0.G0).M0.d(16, (Object)a)).b();
                    }
                }
            }
            final long r2 = t0.r();
            this.q1 = r2;
            final long s = r2 - h.o;
            final long s2 = this.c1.s;
            Label_0924: {
                if (!this.U0.isEmpty()) {
                    if (!((jyg)this.c1.b).a()) {
                        long n2 = s2;
                        if (this.s1) {
                            n2 = s2 - 1L;
                            this.s1 = false;
                        }
                        final pmk c2 = this.c1;
                        final int c3 = c2.a.c(((jyg)c2.b).a);
                        int min = Math.min(this.r1, this.U0.size());
                    Label_0677_Outer:
                        while (true) {
                            Label_0546: {
                                if (min <= 0) {
                                    final long n3 = s;
                                    final m m = this;
                                    break Label_0546;
                                }
                                m.m$c m$c = this.U0.get(min - 1);
                                long n3 = s;
                                final m m = this;
                                while (m$c != null) {
                                    final int g0 = m$c.G0;
                                    if (g0 <= c3 && (g0 != c3 || m$c.H0 <= n2)) {
                                        break;
                                    }
                                    if (--min <= 0) {
                                        break Label_0546;
                                    }
                                    m$c = m.U0.get(min - 1);
                                }
                                long n4 = n2;
                                int n5 = min;
                                m j = m;
                                long n6 = n3;
                                while (true) {
                                    Label_0663: {
                                        if (min >= m.U0.size()) {
                                            break Label_0663;
                                        }
                                        m.m$c m$c2 = m.U0.get(min);
                                        j = m;
                                        m.m$c m$c3;
                                        while (true) {
                                            m$c3 = m$c2;
                                            if (m$c2 == null) {
                                                break;
                                            }
                                            m$c3 = m$c2;
                                            if (m$c2.I0 == null) {
                                                break;
                                            }
                                            final int g2 = m$c2.G0;
                                            if (g2 >= c3) {
                                                m$c3 = m$c2;
                                                if (g2 != c3) {
                                                    break;
                                                }
                                                m$c3 = m$c2;
                                                if (m$c2.H0 > n2) {
                                                    break;
                                                }
                                            }
                                            if (++min >= j.U0.size()) {
                                                n4 = n2;
                                                n5 = min;
                                                n6 = n3;
                                                break Label_0663;
                                            }
                                            m$c2 = j.U0.get(min);
                                        }
                                        while (m$c3 != null && m$c3.I0 != null && m$c3.G0 == c3) {
                                            final long h3 = m$c3.H0;
                                            if (h3 > n2 && h3 <= n3) {
                                                try {
                                                    j.S(m$c3.F0);
                                                    Objects.requireNonNull(m$c3.F0);
                                                    j.U0.remove(min);
                                                    if (min < j.U0.size()) {
                                                        m$c3 = j.U0.get(min);
                                                        continue Label_0677_Outer;
                                                    }
                                                    m$c3 = null;
                                                    continue Label_0677_Outer;
                                                }
                                                finally {
                                                    Objects.requireNonNull(m$c3.F0);
                                                    j.U0.remove(min);
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        j.r1 = min;
                                        break Label_0924;
                                    }
                                    m.m$c m$c2 = null;
                                    n3 = n6;
                                    min = n5;
                                    n2 = n4;
                                    continue;
                                }
                            }
                            m.m$c m$c = null;
                            continue;
                        }
                    }
                }
            }
            this.c1.s = s;
        }
        this.c1.q = this.X0.j.d();
        this.c1.r = this.m();
        final pmk c4 = this.c1;
        if (c4.l && c4.e == 3 && this.g0(c4.a, c4.b)) {
            final pmk c5 = this.c1;
            final float f2 = c5.n.F0;
            float n7 = 1.0f;
            if (f2 == 1.0f) {
                final p z0 = this.Z0;
                final long k = this.j(c5.a, ((jyg)c5.b).a, c5.s);
                final long l = this.m();
                final g g3 = (g)z0;
                if (g3.d != -9223372036854775807L) {
                    final long n8 = k - l;
                    final long n9 = g3.n;
                    if (n9 == -9223372036854775807L) {
                        g3.n = n8;
                        g3.o = 0L;
                    }
                    else {
                        final float c6 = g3.c;
                        final long max = Math.max(n8, (long)((1.0f - c6) * n8 + n9 * c6));
                        g3.n = max;
                        final long abs = Math.abs(n8 - max);
                        final long o = g3.o;
                        final float c7 = g3.c;
                        g3.o = (long)((1.0f - c7) * abs + o * c7);
                    }
                    if (g3.m != -9223372036854775807L && SystemClock.elapsedRealtime() - g3.m < 1000L) {
                        n7 = g3.l;
                    }
                    else {
                        g3.m = SystemClock.elapsedRealtime();
                        final long n10 = g3.o * 3L + g3.n;
                        if (g3.i > n10) {
                            final long h4 = rnw.H(1000L);
                            final float l2 = g3.l;
                            final float n11 = (float)h4;
                            final long[] array = { n10, g3.f, g3.i - ((long)((l2 - 1.0f) * n11) + (long)((g3.j - 1.0f) * n11)) };
                            long i2 = array[0];
                            long n13;
                            for (int n12 = 1; n12 < 3; ++n12, i2 = n13) {
                                n13 = i2;
                                if (array[n12] > i2) {
                                    n13 = array[n12];
                                }
                            }
                            g3.i = i2;
                        }
                        else {
                            final long j2 = rnw.j(k - (long)(Math.max(0.0f, g3.l - 1.0f) / 1.0E-7f), g3.i, n10);
                            g3.i = j2;
                            final long h5 = g3.h;
                            if (h5 != -9223372036854775807L && j2 > h5) {
                                g3.i = h5;
                            }
                        }
                        final long n14 = k - g3.i;
                        if (Math.abs(n14) < g3.a) {
                            g3.l = 1.0f;
                        }
                        else {
                            g3.l = rnw.h(1.0E-7f * n14 + 1.0f, g3.k, g3.j);
                        }
                        n7 = g3.l;
                    }
                }
                if (this.T0.a().F0 != n7) {
                    this.T0.i(new v(n7, this.c1.n.G0));
                    this.s(this.c1.n, this.T0.a().F0, false, false);
                }
            }
        }
    }
    
    public final long m() {
        final long q = this.c1.q;
        final iyg j = this.X0.j;
        long max = 0L;
        if (j != null) {
            max = Math.max(0L, q - (this.q1 - j.o));
        }
        return max;
    }
    
    public final void m0(final e0 e0, final i$b i$b, final e0 e2, final i$b i$b2, long j) {
        if (!this.g0(e0, i$b)) {
            v v;
            if (((jyg)i$b).a()) {
                v = com.google.android.exoplayer2.v.I0;
            }
            else {
                v = this.c1.n;
            }
            if (!this.T0.a().equals((Object)v)) {
                this.T0.i(v);
            }
            return;
        }
        e0.o(e0.i(((jyg)i$b).a, this.Q0).H0, this.P0);
        final p z0 = this.Z0;
        final q$f p5 = this.P0.P0;
        final int a = rnw.a;
        final g g = (g)z0;
        Objects.requireNonNull(g);
        g.d = rnw.H(p5.F0);
        g.g = rnw.H(p5.G0);
        g.h = rnw.H(p5.H0);
        float i0 = p5.I0;
        if (i0 == -3.4028235E38f) {
            i0 = 0.97f;
        }
        g.k = i0;
        float j2 = p5.J0;
        if (j2 == -3.4028235E38f) {
            j2 = 1.03f;
        }
        g.j = j2;
        if (i0 == 1.0f && j2 == 1.0f) {
            g.d = -9223372036854775807L;
        }
        g.a();
        if (j != -9223372036854775807L) {
            final p z2 = this.Z0;
            j = this.j(e0, ((jyg)i$b).a, j);
            final g g2 = (g)z2;
            g2.e = j;
            g2.a();
        }
        else {
            final Object f0 = this.P0.F0;
            Object f2 = null;
            if (!e2.r()) {
                f2 = e2.o(e2.i(((jyg)i$b2).a, this.Q0).H0, this.P0).F0;
            }
            if (!rnw.a(f2, f0)) {
                final g g3 = (g)this.Z0;
                g3.e = -9223372036854775807L;
                g3.a();
            }
        }
    }
    
    public final void n(final com.google.android.exoplayer2.source.h h) {
        final s x0 = this.X0;
        final iyg j = x0.j;
        if (j == null || j.a != h) {
            return;
        }
        x0.m(this.q1);
        this.y();
    }
    
    public final void n0(final wzr<Boolean> wzr, final long n) {
        synchronized (this) {
            final long c = this.V0.c();
            boolean b = false;
            for (long n2 = n; !(boolean)((zga)wzr).get() && n2 > 0L; n2 = c + n - this.V0.c()) {
                try {
                    this.V0.d();
                    this.wait(n2);
                }
                catch (final InterruptedException ex) {
                    b = true;
                }
            }
            if (b) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    public final void o(final IOException ex, final int n) {
        final ExoPlaybackException ex2 = new ExoPlaybackException(0, ex, n, null, -1, null, 4, false);
        final iyg h = this.X0.h;
        ExoPlaybackException b = ex2;
        if (h != null) {
            b = ex2.b((jyg)h.f.a);
        }
        tqb.y("ExoPlayerImplInternal", "Playback error", (Throwable)b);
        this.i0(false, false);
        this.c1 = this.c1.e(b);
    }
    
    public final void p(final boolean b) {
        final iyg j = this.X0.j;
        i$b i$b;
        if (j == null) {
            i$b = this.c1.b;
        }
        else {
            i$b = j.f.a;
        }
        final boolean b2 = ((jyg)this.c1.k).equals((Object)i$b) ^ true;
        if (b2) {
            this.c1 = this.c1.a(i$b);
        }
        final pmk c1 = this.c1;
        long q;
        if (j == null) {
            q = c1.s;
        }
        else {
            q = j.d();
        }
        c1.q = q;
        this.c1.r = this.m();
        if ((b2 || b) && j != null && j.d) {
            this.K0.h(this.F0, j.m, j.n.c);
        }
    }
    
    public final void q(final e0 e0, boolean n) throws ExoPlaybackException {
        final pmk c1 = this.c1;
        final m.m$g p2 = this.p1;
        final s x0 = this.X0;
        final int j1 = this.j1;
        final boolean k1 = this.k1;
        final e0$d p3 = this.P0;
        final e0$b q0 = this.Q0;
        Object o;
        if (e0.r()) {
            final i$b t = pmk.t;
            o = new m.m$f(pmk.t, 0L, -9223372036854775807L, false, true, false);
        }
        else {
            final i$b b = c1.b;
            Object o2 = ((jyg)b).a;
            final boolean x2 = x(c1, q0);
            long n2;
            if (!((jyg)c1.b).a() && !x2) {
                n2 = c1.s;
            }
            else {
                n2 = c1.c;
            }
            int n3 = 0;
            long n4 = 0L;
            boolean b2 = false;
            boolean b8 = false;
            boolean b9 = false;
            Label_0556: {
                if (p2 != null) {
                    final Pair<Object, Long> l = L(e0, p2, true, j1, k1, p3, q0);
                    boolean b3;
                    boolean b4;
                    if (l == null) {
                        n3 = e0.b(k1);
                        n4 = n2;
                        b2 = false;
                        b3 = false;
                        b4 = true;
                    }
                    else {
                        boolean b5;
                        if (p2.c == -9223372036854775807L) {
                            n3 = e0.i(l.first, q0).H0;
                            n4 = n2;
                            b5 = false;
                        }
                        else {
                            o2 = l.first;
                            n4 = (long)l.second;
                            b5 = true;
                            n3 = -1;
                        }
                        b3 = (c1.e == 4);
                        final boolean b6 = false;
                        b2 = b5;
                        b4 = b6;
                    }
                    final boolean b7 = b4;
                    b8 = b3;
                    b9 = b7;
                }
                else {
                    boolean b10 = false;
                    Label_0538: {
                        if (c1.a.r()) {
                            n3 = e0.b(k1);
                        }
                        else {
                            if (e0.c(o2) == -1) {
                                final Object m = M(p3, q0, j1, k1, o2, c1.a, e0);
                                if (m == null) {
                                    n3 = e0.b(k1);
                                    b10 = true;
                                }
                                else {
                                    n3 = e0.i(m, q0).H0;
                                    b10 = false;
                                }
                                break Label_0538;
                            }
                            if (n2 == -9223372036854775807L) {
                                n3 = e0.i(o2, q0).H0;
                            }
                            else {
                                if (x2) {
                                    c1.a.i(((jyg)b).a, q0);
                                    if (c1.a.o(q0.H0, p3).T0 == c1.a.c(((jyg)b).a)) {
                                        final Pair i = e0.k(p3, q0, e0.i(o2, q0).H0, n2 + q0.J0);
                                        o2 = i.first;
                                        n4 = (long)i.second;
                                    }
                                    else {
                                        n4 = n2;
                                    }
                                    n3 = -1;
                                    b8 = false;
                                    b9 = false;
                                    b2 = true;
                                    break Label_0556;
                                }
                                n3 = -1;
                            }
                        }
                        b10 = false;
                    }
                    n4 = n2;
                    final boolean b11 = false;
                    b2 = false;
                    b9 = b10;
                    b8 = b11;
                }
            }
            long n5;
            if (n3 != -1) {
                final Pair k2 = e0.k(p3, q0, n3, -9223372036854775807L);
                o2 = k2.first;
                n4 = (long)k2.second;
                n5 = -9223372036854775807L;
            }
            else {
                n5 = n4;
            }
            final i$b p4 = x0.p(e0, o2, n4);
            final int e2 = ((jyg)p4).e;
            boolean b12 = false;
            Label_0659: {
                if (e2 != -1) {
                    final int e3 = ((jyg)b).e;
                    if (e3 == -1 || e2 < e3) {
                        b12 = false;
                        break Label_0659;
                    }
                }
                b12 = true;
            }
            final boolean b13 = ((jyg)b).a.equals(o2) && !((jyg)b).a() && !((jyg)p4).a() && b12;
            final e0$b i2 = e0.i(o2, q0);
            boolean b14 = false;
            Label_0833: {
                if (!x2 && n2 == n5) {
                    if (((jyg)b).a.equals(((jyg)p4).a)) {
                        if ((!((jyg)b).a() || !i2.g(((jyg)b).b)) ? (((jyg)p4).a() && i2.g(((jyg)p4).b)) : (i2.e(((jyg)b).b, ((jyg)b).c) != 4 && i2.e(((jyg)b).b, ((jyg)b).c) != 2)) {
                            b14 = true;
                            break Label_0833;
                        }
                    }
                }
                b14 = false;
            }
            i$b i$b = null;
            Label_0850: {
                if (!b13) {
                    i$b = p4;
                    if (!b14) {
                        break Label_0850;
                    }
                }
                i$b = b;
            }
            long n6;
            if (((jyg)i$b).a()) {
                if (((jyg)i$b).equals((Object)b)) {
                    n6 = c1.s;
                }
                else {
                    e0.i(((jyg)i$b).a, q0);
                    if (((jyg)i$b).c == q0.f(((jyg)i$b).b)) {
                        n6 = q0.L0.H0;
                    }
                    else {
                        n6 = 0L;
                    }
                }
            }
            else {
                n6 = n4;
            }
            o = new m.m$f(i$b, n6, n5, b8, b9, b2);
        }
        final i$b a = ((m.m$f)o).a;
        final long c2 = ((m.m$f)o).c;
        final boolean d = ((m.m$f)o).d;
        long n7 = ((m.m$f)o).b;
        final boolean b15 = !((jyg)this.c1.b).equals((Object)a) || n7 != this.c1.s;
        int n8 = 3;
        try {
            if (((m.m$f)o).e) {
                if (this.c1.e != 1) {
                    this.e0(4);
                }
                this.G(false, false, false, true);
            }
            Label_1118: {
                if (b15) {
                    break Label_1118;
                }
                Label_1204: {
                    s x3;
                    long q2;
                    long k3;
                    long q3;
                    try {
                        x3 = this.X0;
                        q2 = this.q1;
                        k3 = this.k();
                        q3 = n7;
                        final s s = x3;
                        final e0 e4 = e0;
                        final long n9 = q2;
                        final long n10 = k3;
                        final boolean b16 = s.r(e4, n9, n10);
                        if (!b16) {
                            final m m2 = this;
                            final boolean b17 = false;
                            m2.O(b17);
                            q3 = n7;
                            break Label_1204;
                        }
                        break Label_1204;
                    }
                    finally {}
                    try {
                        final s s = x3;
                        final e0 e4 = e0;
                        final long n9 = q2;
                        final long n10 = k3;
                        final boolean b16 = s.r(e4, n9, n10);
                        if (!b16) {
                            final m m2 = this;
                            final boolean b17 = false;
                            m2.O(b17);
                            q3 = n7;
                        }
                        final int n11 = 1;
                        final pmk c3 = this.c1;
                        final e0 a2 = c3.a;
                        final i$b b18 = c3.b;
                        if (((m.m$f)o).f) {
                            n7 = q3;
                        }
                        else {
                            n7 = -9223372036854775807L;
                        }
                        this.m0(e0, a, a2, b18, n7);
                        if (b15 || c2 != this.c1.c) {
                            o = this.c1;
                            final Object a3 = ((jyg)((pmk)o).b).a;
                            o = ((pmk)o).a;
                            if (b15 && n != 0 && !((e0)o).r() && !((e0)o).i(a3, this.Q0).K0) {
                                n = n11;
                            }
                            else {
                                n = 0;
                            }
                            n7 = this.c1.d;
                            if (e0.c(a3) == -1) {
                                n8 = 4;
                            }
                            this.c1 = this.t(a, q3, c2, n7, (boolean)(n != 0), n8);
                        }
                        this.H();
                        this.K(e0, this.c1.a);
                        this.c1 = this.c1.h(e0);
                        if (!e0.r()) {
                            this.p1 = null;
                        }
                        this.p(false);
                        return;
                        while (true) {
                            iyg iyg = null;
                            Label_1138: {
                            Block_56:
                                while (true) {
                                    while (true) {
                                        iyg = iyg.l;
                                        break Label_1138;
                                        iyg.f = this.X0.h(e0, iyg.f);
                                        iyg.j();
                                        continue;
                                    }
                                    q3 = n7;
                                    iftrue(Label_1204:)(e0.r());
                                    break Block_56;
                                    iftrue(Label_1182:)(!((jyg)iyg.f.a).equals((Object)a));
                                    continue;
                                }
                                iyg = this.X0.h;
                                break Label_1138;
                            }
                            iftrue(Label_1192:)(iyg == null);
                            continue;
                        }
                        Label_1192: {
                            q3 = this.Q(a, n7, d);
                        }
                    }
                    finally {}
                }
            }
        }
        finally {}
        final boolean b19 = true;
        final pmk c4 = this.c1;
        final e0 a4 = c4.a;
        final i$b b20 = c4.b;
        long n12;
        if (((m.m$f)o).f) {
            n12 = n7;
        }
        else {
            n12 = -9223372036854775807L;
        }
        this.m0(e0, a, a4, b20, n12);
        if (b15 || c2 != this.c1.c) {
            final pmk c5 = this.c1;
            final Object a5 = ((jyg)c5.b).a;
            final e0 a6 = c5.a;
            final boolean b21 = b15 && n != 0 && !a6.r() && !a6.i(a5, this.Q0).K0 && b19;
            final long d2 = this.c1.d;
            if (e0.c(a5) == -1) {
                n8 = 4;
            }
            this.c1 = this.t(a, n7, c2, d2, b21, n8);
        }
        this.H();
        this.K(e0, this.c1.a);
        this.c1 = this.c1.h(e0);
        if (!e0.r()) {
            this.p1 = null;
        }
        this.p(false);
    }
    
    public final void r(final com.google.android.exoplayer2.source.h h) throws ExoPlaybackException {
        final iyg j = this.X0.j;
        if (j == null || j.a != h) {
            return;
        }
        final float f0 = this.T0.a().F0;
        final e0 a = this.c1.a;
        j.d = true;
        j.m = j.a.v();
        final dxt i = j.i(f0, a);
        final kyg f2 = j.f;
        final long b = f2.b;
        final long e = f2.e;
        long max = b;
        if (e != -9223372036854775807L) {
            max = b;
            if (b >= e) {
                max = Math.max(0L, e - 1L);
            }
        }
        final long a2 = j.a(i, max, false, new boolean[j.i.length]);
        final long o = j.o;
        final kyg f3 = j.f;
        j.o = f3.b - a2 + o;
        j.f = f3.b(a2);
        this.K0.h(this.F0, j.m, j.n.c);
        if (j == this.X0.h) {
            this.I(j.f.b);
            this.f();
            final pmk c1 = this.c1;
            final i$b b2 = c1.b;
            final long b3 = j.f.b;
            this.c1 = this.t(b2, b3, c1.c, b3, false, 5);
        }
        this.y();
    }
    
    public final void s(final v v, final float n, final boolean b, final boolean b2) throws ExoPlaybackException {
        if (b) {
            if (b2) {
                this.d1.a(1);
            }
            this.c1 = this.c1.f(v);
        }
        final float f0 = v.F0;
        iyg iyg = this.X0.h;
        int n2;
        while (true) {
            n2 = 0;
            int i = 0;
            if (iyg == null) {
                break;
            }
            for (tha[] c = iyg.n.c; i < c.length; ++i) {
                final tha tha = c[i];
                if (tha != null) {
                    tha.j(f0);
                }
            }
            iyg = iyg.l;
        }
        final z[] f2 = this.F0;
        for (int length = f2.length, j = n2; j < length; ++j) {
            final z z = f2[j];
            if (z != null) {
                z.s(n, v.F0);
            }
        }
    }
    
    public final pmk t(final i$b i$b, final long n, final long n2, final long n3, final boolean b, final int e) {
        this.s1 = (this.s1 || n != this.c1.s || !((jyg)i$b).equals((Object)this.c1.b));
        this.H();
        final pmk c1 = this.c1;
        twt twt = c1.h;
        dxt dxt = c1.i;
        Object o = c1.j;
        if (this.Y0.k) {
            final iyg h = this.X0.h;
            if (h == null) {
                twt = twt.I0;
            }
            else {
                twt = h.m;
            }
            if (h == null) {
                dxt = this.J0;
            }
            else {
                dxt = h.n;
            }
            final tha[] c2 = dxt.c;
            final eed.a<Object> a = new eed.a<Object>();
            final int length = c2.length;
            int i = 0;
            int n4 = 0;
            while (i < length) {
                final tha tha = c2[i];
                int n5 = n4;
                if (tha != null) {
                    final q9h o2 = ((xwt)tha).g(0).O0;
                    if (o2 == null) {
                        a.c(new q9h(new q9h$b[0]));
                        n5 = n4;
                    }
                    else {
                        a.c(o2);
                        n5 = 1;
                    }
                }
                ++i;
                n4 = n5;
            }
            if (n4 != 0) {
                o = a.f();
            }
            else {
                final eed.b g0 = eed.G0;
                o = nbm.J0;
            }
            if (h != null) {
                final kyg f = h.f;
                if (f.c != n2) {
                    h.f = f.a(n2);
                }
            }
        }
        else if (!((jyg)i$b).equals((Object)c1.b)) {
            twt = twt.I0;
            dxt = this.J0;
            o = nbm.J0;
        }
        if (b) {
            final m.m$d d1 = this.d1;
            if (d1.d && d1.e != 5) {
                omi.m(e == 5);
            }
            else {
                d1.a = true;
                d1.d = true;
                d1.e = e;
            }
        }
        return this.c1.b(i$b, n, n2, n3, this.m(), twt, dxt, (List<q9h>)o);
    }
    
    public final boolean u() {
        final iyg j = this.X0.j;
        if (j == null) {
            return false;
        }
        long d;
        if (!j.d) {
            d = 0L;
        }
        else {
            d = j.a.d();
        }
        return d != Long.MIN_VALUE;
    }
    
    public final boolean w() {
        final iyg h = this.X0.h;
        final long e = h.f.e;
        return h.d && (e == -9223372036854775807L || this.c1.s < e || !this.f0());
    }
    
    public final void y() {
        boolean i;
        if (!this.u()) {
            i = false;
        }
        else {
            final iyg j = this.X0.j;
            final boolean d = j.d;
            final long n = 0L;
            long d2;
            if (!d) {
                d2 = 0L;
            }
            else {
                d2 = j.a.d();
            }
            final iyg k = this.X0.j;
            long max;
            if (k == null) {
                max = n;
            }
            else {
                max = Math.max(0L, d2 - (this.q1 - k.o));
            }
            long q1;
            long n2;
            if (j == this.X0.h) {
                q1 = this.q1;
                n2 = j.o;
            }
            else {
                q1 = this.q1 - j.o;
                n2 = j.f.b;
            }
            i = this.K0.i(q1 - n2, max, this.T0.a().F0);
        }
        this.i1 = i;
        if (i) {
            final iyg l = this.X0.j;
            final long q2 = this.q1;
            omi.p(l.g());
            l.a.f(q2 - l.o);
        }
        this.k0();
    }
    
    public final void z() {
        final m.m$d d1 = this.d1;
        final pmk c1 = this.c1;
        final boolean a = d1.a | d1.b != c1;
        d1.a = a;
        d1.b = c1;
        if (a) {
            final k k = (k)((q5w)this.W0).G0;
            k.N0.i((Runnable)new npb((Object)k, (Object)d1, 3));
            this.d1 = new m.m$d(this.c1);
        }
    }
}
