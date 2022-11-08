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
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.source.j;
import java.util.List;
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

public final class m implements Handler$Callback, h$a, vvt$a, t$d, com.google.android.exoplayer2.h$a, x$a
{
    public final z[] C0;
    public final Set<z> D0;
    public final ffm[] E0;
    public final vvt F0;
    public final wvt G0;
    public final q2g H0;
    public final ai1 I0;
    public final occ J0;
    public final HandlerThread K0;
    public final Looper L0;
    public final e0$d M0;
    public final e0$b N0;
    public final long O0;
    public final boolean P0;
    public final h Q0;
    public final ArrayList<m.m$c> R0;
    public final ki4 S0;
    public final m.m$e T0;
    public final s U0;
    public final t V0;
    public final p W0;
    public final long X0;
    public fbp Y0;
    public ulk Z0;
    public m.m$d a1;
    public boolean b1;
    public boolean c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public int g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public int l1;
    public m.m$g m1;
    public long n1;
    public int o1;
    public boolean p1;
    public ExoPlaybackException q1;
    public long r1;
    
    public m(final z[] c0, final vvt f0, final wvt g0, final q2g h0, final ai1 ai1, int i, final pz pz, final fbp y0, final p w0, final long x0, final boolean c2, final Looper looper, final ki4 s0, final m.m$e t0, final hnk hnk) {
        this.T0 = t0;
        this.C0 = c0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = ai1;
        this.g1 = i;
        i = 0;
        this.h1 = false;
        this.Y0 = y0;
        this.W0 = w0;
        this.X0 = x0;
        this.c1 = c2;
        this.S0 = s0;
        this.r1 = -9223372036854775807L;
        this.O0 = h0.b();
        this.P0 = h0.a();
        final ulk j = ulk.i(g0);
        this.Z0 = j;
        this.a1 = new m.m$d(j);
        this.E0 = new ffm[c0.length];
        while (i < c0.length) {
            c0[i].t(i, hnk);
            this.E0[i] = c0[i].q();
            ++i;
        }
        this.Q0 = new h((com.google.android.exoplayer2.h$a)this, s0);
        this.R0 = new ArrayList<m.m$c>();
        this.D0 = xmp.e();
        this.M0 = new e0$d();
        this.N0 = new e0$b();
        f0.a = (vvt$a)this;
        f0.b = ai1;
        this.p1 = true;
        final Handler handler = new Handler(looper);
        this.U0 = new s(pz, handler);
        this.V0 = new t((t$d)this, pz, handler, hnk);
        final HandlerThread k0 = new HandlerThread("ExoPlayer:Playback", -16);
        ((Thread)(this.K0 = k0)).start();
        final Looper looper2 = k0.getLooper();
        this.L0 = looper2;
        this.J0 = s0.b(looper2, (Handler$Callback)this);
    }
    
    public static boolean J(final m.m$c m$c, final e0 e0, final e0 e2, int c, final boolean b, final e0$d e0$d, final e0$b e0$b) {
        final Object f0 = m$c.F0;
        if (f0 == null) {
            Objects.requireNonNull(m$c.C0);
            Objects.requireNonNull(m$c.C0);
            final long h = imw.H(-9223372036854775807L);
            final x c2 = m$c.C0;
            final Pair<Object, Long> l = L(e0, new m.m$g(c2.d, c2.h, h), false, c, b, e0$d, e0$b);
            if (l == null) {
                return false;
            }
            m$c.b(e0.c(l.first), (long)l.second, l.first);
            Objects.requireNonNull(m$c.C0);
            return true;
        }
        else {
            c = e0.c(f0);
            if (c == -1) {
                return false;
            }
            Objects.requireNonNull(m$c.C0);
            m$c.D0 = c;
            e2.i(m$c.F0, e0$b);
            if (e0$b.H0 && e2.o(e0$b.E0, e0$d).Q0 == e2.c(m$c.F0)) {
                final Pair k = e0.k(e0$d, e0$b, e0.i(m$c.F0, e0$b).E0, m$c.E0 + e0$b.G0);
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
                if (a.i(k.first, e0$b).H0) {
                    i = k;
                    if (a.o(e0$b.E0, e0$d).Q0 == a.c(k.first)) {
                        i = e0.k(e0$d, e0$b, e0.i(k.first, e0$b).E0, m$g.c);
                    }
                }
                return (Pair<Object, Long>)i;
            }
            if (b) {
                final Object m = M(e0$d, e0$b, n, b2, k.first, a, e0);
                if (m != null) {
                    return (Pair<Object, Long>)e0.k(e0$d, e0$b, e0.i(m, e0$b).E0, -9223372036854775807L);
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
    
    public static n[] g(final hha hha) {
        int i = 0;
        int length;
        if (hha != null) {
            length = ((qvt)hha).length();
        }
        else {
            length = 0;
        }
        final n[] array = new n[length];
        while (i < length) {
            array[i] = ((qvt)hha).g(i);
            ++i;
        }
        return array;
    }
    
    public static boolean v(final z z) {
        return z.getState() != 0;
    }
    
    public static boolean x(final ulk ulk, final e0$b e0$b) {
        final i$b b = ulk.b;
        final e0 a = ulk.a;
        return a.r() || a.i(((rxg)b).a, e0$b).H0;
    }
    
    public final void A() throws ExoPlaybackException {
        this.q(this.V0.c(), true);
    }
    
    public final void B(final m.m$b m$b) throws ExoPlaybackException {
        final m.m$d a1 = this.a1;
        boolean b = true;
        a1.a(1);
        final t v0 = this.V0;
        Objects.requireNonNull(m$b);
        Objects.requireNonNull(v0);
        if (v0.e() < 0) {
            b = false;
        }
        ri4.k(b);
        v0.j = null;
        this.q(v0.c(), false);
    }
    
    public final void C() {
        this.a1.a(1);
        final int n = 0;
        this.G(false, false, false, true);
        this.H0.c();
        int n2;
        if (this.Z0.a.r()) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        this.e0(n2);
        final t v0 = this.V0;
        final zxt d = this.I0.d();
        ri4.t(v0.k ^ true);
        v0.l = d;
        for (int i = n; i < v0.b.size(); ++i) {
            final t$c t$c = v0.b.get(i);
            v0.g(t$c);
            v0.i.add(t$c);
        }
        v0.k = true;
        this.J0.k(2);
    }
    
    public final void D() {
        this.G(true, false, true, false);
        this.H0.g();
        this.e0(1);
        this.K0.quit();
        synchronized (this) {
            this.b1 = true;
            this.notifyAll();
        }
    }
    
    public final void E(final int n, final int n2, final k5q j) throws ExoPlaybackException {
        final m.m$d a1 = this.a1;
        boolean b = true;
        a1.a(1);
        final t v0 = this.V0;
        Objects.requireNonNull(v0);
        if (n < 0 || n > n2 || n2 > v0.e()) {
            b = false;
        }
        ri4.k(b);
        v0.j = j;
        v0.i(n, n2);
        this.q(v0.c(), false);
    }
    
    public final void F() throws ExoPlaybackException {
        final float c0 = this.Q0.a().C0;
        final s u0 = this.U0;
        qxg qxg = u0.h;
        final qxg i = u0.i;
        int n = 1;
        while (qxg != null && qxg.d) {
            final wvt j = qxg.i(c0, this.Z0.a);
            final wvt n2 = qxg.n;
            boolean b = false;
            Label_0130: {
                Label_0127: {
                    if (n2 != null) {
                        if (n2.c.length == j.c.length) {
                            for (int k = 0; k < j.c.length; ++k) {
                                if (!j.a(n2, k)) {
                                    break Label_0127;
                                }
                            }
                            b = true;
                            break Label_0130;
                        }
                    }
                }
                b = false;
            }
            if (!b) {
                if (n != 0) {
                    final s u2 = this.U0;
                    final qxg h = u2.h;
                    final boolean n3 = u2.n(h);
                    final boolean[] array = new boolean[this.C0.length];
                    final long a = h.a(j, this.Z0.s, n3, array);
                    final ulk z0 = this.Z0;
                    final boolean b2 = z0.e != 4 && a != z0.s;
                    final ulk z2 = this.Z0;
                    this.Z0 = this.t(z2.b, a, z2.c, z2.d, b2, 5);
                    if (b2) {
                        this.I(a);
                    }
                    final boolean[] array2 = new boolean[this.C0.length];
                    int n4 = 0;
                    while (true) {
                        final z[] c2 = this.C0;
                        if (n4 >= c2.length) {
                            break;
                        }
                        final z z3 = c2[n4];
                        array2[n4] = v(z3);
                        final bro bro = h.c[n4];
                        if (array2[n4]) {
                            if (bro != z3.i()) {
                                this.c(z3);
                            }
                            else if (array[n4]) {
                                z3.x(this.n1);
                            }
                        }
                        ++n4;
                    }
                    this.f(array2);
                }
                else {
                    this.U0.n(qxg);
                    if (qxg.d) {
                        qxg.a(j, Math.max(qxg.f.b, this.n1 - qxg.o), false, new boolean[qxg.i.length]);
                    }
                }
                this.p(true);
                if (this.Z0.e != 4) {
                    this.y();
                    this.l0();
                    this.J0.k(2);
                }
                return;
            }
            if (qxg == i) {
                n = 0;
            }
            qxg = qxg.l;
        }
    }
    
    public final void G(final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        this.J0.h();
        final ExoPlaybackException ex = null;
        this.q1 = null;
        this.e1 = false;
        final h q0 = this.Q0;
        q0.H0 = false;
        final i5r c0 = q0.C0;
        if (c0.D0) {
            c0.b(c0.r());
            c0.D0 = false;
        }
        this.n1 = 1000000000000L;
        for (final z z : this.C0) {
            Label_0127: {
                try {
                    this.c(z);
                    break Label_0127;
                }
                catch (final RuntimeException z) {}
                catch (final ExoPlaybackException ex2) {}
                dml.s("ExoPlayerImplInternal", "Disable failed.", (Throwable)z);
            }
        }
        if (b) {
            for (final z z2 : this.C0) {
                if (this.D0.remove(z2)) {
                    try {
                        z2.c();
                    }
                    catch (final RuntimeException ex3) {
                        dml.s("ExoPlayerImplInternal", "Reset failed.", (Throwable)ex3);
                    }
                }
            }
        }
        this.l1 = 0;
        final ulk z3 = this.Z0;
        i$b b5 = z3.b;
        long s = z3.s;
        long n;
        if (!((rxg)this.Z0.b).a() && !x(this.Z0, this.N0)) {
            n = this.Z0.s;
        }
        else {
            n = this.Z0.c;
        }
        long longValue = 0L;
        boolean b6 = false;
        Label_0382: {
            if (b2) {
                this.m1 = null;
                final Pair<i$b, Long> k = this.j(this.Z0.a);
                final i$b i$b = (i$b)k.first;
                longValue = (long)k.second;
                final long n2 = -9223372036854775807L;
                b5 = i$b;
                s = longValue;
                n = n2;
                if (!((rxg)i$b).equals((Object)this.Z0.b)) {
                    b6 = true;
                    b5 = i$b;
                    n = n2;
                    break Label_0382;
                }
            }
            b6 = false;
            longValue = s;
        }
        this.U0.b();
        this.f1 = false;
        final ulk z4 = this.Z0;
        final e0 a = z4.a;
        final int e = z4.e;
        ExoPlaybackException f;
        if (b4) {
            f = ex;
        }
        else {
            f = z4.f;
        }
        mvt mvt;
        if (b6) {
            mvt = mvt.F0;
        }
        else {
            mvt = z4.h;
        }
        wvt wvt;
        if (b6) {
            wvt = this.G0;
        }
        else {
            wvt = z4.i;
        }
        Object o;
        if (b6) {
            final aed$b d0 = aed.D0;
            o = lam.G0;
        }
        else {
            o = z4.j;
        }
        this.Z0 = new ulk(a, b5, n, longValue, e, f, false, mvt, wvt, (List)o, b5, z4.l, z4.m, z4.n, longValue, 0L, longValue, this.k1, false);
        if (b3) {
            final t v0 = this.V0;
            for (final t$b t$b : v0.h.values()) {
                try {
                    t$b.a.b(t$b.b);
                }
                catch (final RuntimeException ex4) {
                    dml.s("MediaSourceList", "Failed to release child source.", (Throwable)ex4);
                }
                t$b.a.d((j)t$b.c);
                t$b.a.k((c)t$b.c);
            }
            v0.h.clear();
            v0.i.clear();
            v0.k = false;
        }
    }
    
    public final void H() {
        final qxg h = this.U0.h;
        this.d1 = (h != null && h.f.h && this.c1);
    }
    
    public final void I(long n1) throws ExoPlaybackException {
        final qxg h = this.U0.h;
        long o;
        if (h == null) {
            o = 1000000000000L;
        }
        else {
            o = h.o;
        }
        n1 += o;
        this.n1 = n1;
        this.Q0.C0.b(n1);
        for (final z z : this.C0) {
            if (v(z)) {
                z.x(this.n1);
            }
        }
        for (qxg qxg = this.U0.h; qxg != null; qxg = qxg.l) {
            for (final hha hha : qxg.n.c) {
                if (hha != null) {
                    hha.l();
                }
            }
        }
    }
    
    public final void K(final e0 e0, final e0 e2) {
        if (e0.r() && e2.r()) {
            return;
        }
        int size = this.R0.size();
        while (true) {
            final int n = size - 1;
            if (n < 0) {
                break;
            }
            size = n;
            if (J(this.R0.get(n), e0, e2, this.g1, this.h1, this.M0, this.N0)) {
                continue;
            }
            this.R0.get(n).C0.b(false);
            this.R0.remove(n);
            size = n;
        }
        Collections.sort(this.R0);
    }
    
    public final void N(final long n, final long n2) {
        this.J0.h();
        this.J0.j(n + n2);
    }
    
    public final void O(final boolean b) throws ExoPlaybackException {
        final i$b a = this.U0.h.f.a;
        final long r = this.R(a, this.Z0.s, true, false);
        if (r != this.Z0.s) {
            final ulk z0 = this.Z0;
            this.Z0 = this.t(a, r, z0.c, z0.d, b, 5);
        }
    }
    
    public final void P(final m.m$g m1) throws ExoPlaybackException {
        final m.m$d a1 = this.a1;
        int n = 1;
        a1.a(1);
        final Pair<Object, Long> l = L(this.Z0.a, m1, true, this.g1, this.h1, this.M0, this.N0);
        i$b p = null;
        int n3 = 0;
        long n5 = 0L;
        long n8 = 0L;
        Label_0271: {
            long n2;
            long n4;
            if (l == null) {
                final Pair<i$b, Long> j = this.j(this.Z0.a);
                p = (i$b)j.first;
                n2 = (long)j.second;
                n3 = ((this.Z0.a.r() ^ true) ? 1 : 0);
                n4 = -9223372036854775807L;
            }
            else {
                final Object first = l.first;
                n2 = (long)l.second;
                if (m1.c == -9223372036854775807L) {
                    n4 = -9223372036854775807L;
                }
                else {
                    n4 = n2;
                }
                p = this.U0.p(this.Z0.a, first, n2);
                if (((rxg)p).a()) {
                    this.Z0.a.i(((rxg)p).a, this.N0);
                    long e0;
                    if (this.N0.f(((rxg)p).b) == ((rxg)p).c) {
                        e0 = this.N0.I0.E0;
                    }
                    else {
                        e0 = 0L;
                    }
                    n5 = n4;
                    n3 = 1;
                    final long n6 = e0;
                    break Label_0271;
                }
                if (m1.c == -9223372036854775807L) {
                    n3 = 1;
                }
                else {
                    n3 = 0;
                }
            }
            n5 = n4;
            long n6 = n2;
            try {
                Label_0547: {
                    final long q;
                    Label_0511: {
                        Label_0321: {
                            if (this.Z0.a.r()) {
                                this.m1 = m1;
                                break Label_0321;
                            }
                            if (l == null) {
                                if (this.Z0.e != 1) {
                                    this.e0(4);
                                }
                                this.G(false, true, false, true);
                                break Label_0321;
                            }
                            long n7 = 0L;
                            Label_0467: {
                                if (((rxg)p).equals((Object)this.Z0.b)) {
                                    final qxg h = this.U0.h;
                                    long h2;
                                    if (h != null && h.d && n6 != 0L) {
                                        h2 = h.a.h(n6, this.Y0);
                                    }
                                    else {
                                        h2 = n6;
                                    }
                                    n7 = h2;
                                    if (imw.T(h2) == imw.T(this.Z0.s)) {
                                        final ulk z0 = this.Z0;
                                        final int e2 = z0.e;
                                        if (e2 != 2) {
                                            n7 = h2;
                                            if (e2 != 3) {
                                                break Label_0467;
                                            }
                                        }
                                        final long s = z0.s;
                                        this.Z0 = this.t(p, s, n5, s, (boolean)(n3 != 0), 2);
                                        return;
                                    }
                                }
                                else {
                                    n7 = n6;
                                }
                            }
                            q = this.Q(p, n7, this.Z0.e == 4);
                            if (n6 != q) {
                                break Label_0511;
                            }
                            n = 0;
                            break Label_0511;
                        }
                        break Label_0547;
                    }
                    n3 |= n;
                    try {
                        final ulk z2 = this.Z0;
                        final e0 a2 = z2.a;
                        this.m0(a2, p, a2, z2.b, n5);
                        n6 = q;
                        this.Z0 = this.t(p, n6, n5, n6, (boolean)(n3 != 0), 2);
                        return;
                    }
                    finally {}
                }
            }
            finally {
                n8 = n6;
            }
        }
        this.Z0 = this.t(p, n8, n5, n8, (boolean)(n3 != 0), 2);
    }
    
    public final long Q(final i$b i$b, final long n, final boolean b) throws ExoPlaybackException {
        final s u0 = this.U0;
        return this.R(i$b, n, u0.h != u0.i, b);
    }
    
    public final long R(final i$b i$b, long n, final boolean b, final boolean b2) throws ExoPlaybackException {
        this.j0();
        this.e1 = false;
        if (b2 || this.Z0.e == 3) {
            this.e0(2);
        }
        qxg qxg2;
        qxg qxg;
        for (qxg = (qxg2 = this.U0.h); qxg2 != null && !((rxg)i$b).equals((Object)qxg2.f.a); qxg2 = qxg2.l) {}
        if (b || qxg != qxg2 || (qxg2 != null && qxg2.o + n < 0L)) {
            final z[] c0 = this.C0;
            for (int length = c0.length, i = 0; i < length; ++i) {
                this.c(c0[i]);
            }
            if (qxg2 != null) {
                s u0;
                while (true) {
                    u0 = this.U0;
                    if (u0.h == qxg2) {
                        break;
                    }
                    u0.a();
                }
                u0.n(qxg2);
                qxg2.o = 1000000000000L;
                this.e();
            }
        }
        if (qxg2 != null) {
            this.U0.n(qxg2);
            long j;
            if (!qxg2.d) {
                qxg2.f = qxg2.f.b(n);
                j = n;
            }
            else {
                j = n;
                if (qxg2.e) {
                    j = qxg2.a.j(n);
                    qxg2.a.u(j - this.O0, this.P0);
                }
            }
            this.I(j);
            this.y();
            n = j;
        }
        else {
            this.U0.b();
            this.I(n);
        }
        this.p(false);
        this.J0.k(2);
        return n;
    }
    
    public final void S(final x x) throws ExoPlaybackException {
        if (x.g == this.L0) {
            this.b(x);
            final int e = this.Z0.e;
            if (e == 3 || e == 2) {
                this.J0.k(2);
            }
        }
        else {
            ((z4s.a)this.J0.d(15, (Object)x)).b();
        }
    }
    
    public final void T(final x x) {
        final Looper g = x.g;
        if (!g.getThread().isAlive()) {
            Log.w("TAG", "Trying to send message on a dead thread.");
            x.b(false);
            return;
        }
        this.S0.b(g, (Handler$Callback)null).i((Runnable)new yqm((Object)this, (Object)x, 2));
    }
    
    public final void U(final z z, final long c1) {
        z.k();
        if (z instanceof ris) {
            final ris ris = (ris)z;
            ri4.t(((e)ris).M0);
            ris.c1 = c1;
        }
    }
    
    public final void V(final boolean i1, final AtomicBoolean atomicBoolean) {
        if (this.i1 != i1 && !(this.i1 = i1)) {
            for (final z z : this.C0) {
                if (!v(z) && this.D0.remove(z)) {
                    z.c();
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
        this.a1.a(1);
        if (m$a.c != -1) {
            this.m1 = new m.m$g((e0)new dok((Collection)m$a.a, m$a.b), m$a.c, m$a.d);
        }
        final t v0 = this.V0;
        final List a = m$a.a;
        final k5q b = m$a.b;
        v0.i(0, v0.b.size());
        this.q(v0.a(v0.b.size(), a, b), false);
    }
    
    public final void X(final boolean k1) {
        if (k1 == this.k1) {
            return;
        }
        this.k1 = k1;
        final ulk z0 = this.Z0;
        final int e = z0.e;
        if (!k1 && e != 4 && e != 1) {
            this.J0.k(2);
        }
        else {
            this.Z0 = z0.c(k1);
        }
    }
    
    public final void Y(final boolean c1) throws ExoPlaybackException {
        this.c1 = c1;
        this.H();
        if (this.d1) {
            final s u0 = this.U0;
            if (u0.i != u0.h) {
                this.O(true);
                this.p(false);
            }
        }
    }
    
    public final void Z(final boolean b, int i, final boolean b2, final int g) throws ExoPlaybackException {
        this.a1.a((int)(b2 ? 1 : 0));
        final m.m$d a1 = this.a1;
        a1.a = true;
        a1.f = true;
        a1.g = g;
        this.Z0 = this.Z0.d(b, i);
        this.e1 = false;
        for (qxg qxg = this.U0.h; qxg != null; qxg = qxg.l) {
            final hha[] c = qxg.n.c;
            int length;
            hha hha;
            for (length = c.length, i = 0; i < length; ++i) {
                hha = c[i];
                if (hha != null) {
                    hha.a();
                }
            }
        }
        if (!this.f0()) {
            this.j0();
            this.l0();
        }
        else {
            i = this.Z0.e;
            if (i == 3) {
                this.h0();
                this.J0.k(2);
            }
            else if (i == 2) {
                this.J0.k(2);
            }
        }
    }
    
    public final void a(final m.m$a m$a, final int n) throws ExoPlaybackException {
        this.a1.a(1);
        final t v0 = this.V0;
        int e = n;
        if (n == -1) {
            e = v0.e();
        }
        this.q(v0.a(e, m$a.a, m$a.b), false);
    }
    
    public final void a0(v a) throws ExoPlaybackException {
        this.Q0.g(a);
        a = this.Q0.a();
        this.s(a, a.C0, true, true);
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
        this.g1 = n;
        final s u0 = this.U0;
        final e0 a = this.Z0.a;
        u0.f = n;
        if (!u0.q(a)) {
            this.O(true);
        }
        this.p(false);
    }
    
    public final void c(final z z) throws ExoPlaybackException {
        if (z.getState() == 0) {
            return;
        }
        final h q0 = this.Q0;
        if (z == q0.E0) {
            q0.F0 = null;
            q0.E0 = null;
            q0.G0 = true;
        }
        if (z.getState() == 2) {
            z.stop();
        }
        z.d();
        --this.l1;
    }
    
    public final void c0(final boolean b) throws ExoPlaybackException {
        this.h1 = b;
        final s u0 = this.U0;
        final e0 a = this.Z0.a;
        u0.g = b;
        if (!u0.q(a)) {
            this.O(true);
        }
        this.p(false);
    }
    
    public final void d() throws ExoPlaybackException, IOException {
        final long a = this.S0.a();
        if (!this.Z0.a.r()) {
            if (this.V0.k) {
                this.U0.m(this.n1);
                final s u0 = this.U0;
                final qxg j = u0.j;
                if (j == null || (!j.f.i && j.f() && u0.j.f.e != -9223372036854775807L && u0.k < 100)) {
                    final s u2 = this.U0;
                    final long n1 = this.n1;
                    final ulk z0 = this.Z0;
                    final qxg i = u2.j;
                    sxg sxg;
                    if (i == null) {
                        sxg = u2.d(z0.a, z0.b, z0.c, z0.s);
                    }
                    else {
                        sxg = u2.c(z0.a, i, n1);
                    }
                    if (sxg != null) {
                        final s u3 = this.U0;
                        final ffm[] e0 = this.E0;
                        final vvt f0 = this.F0;
                        final qx e2 = this.H0.e();
                        final t v0 = this.V0;
                        final wvt g0 = this.G0;
                        final qxg k = u3.j;
                        long n2;
                        if (k == null) {
                            n2 = 1000000000000L;
                        }
                        else {
                            n2 = k.o + k.f.e - sxg.b;
                        }
                        final qxg qxg = new qxg(e0, n2, f0, e2, v0, sxg, g0);
                        final qxg l = u3.j;
                        if (l != null) {
                            if (qxg != l.l) {
                                l.b();
                                l.l = qxg;
                                l.c();
                            }
                        }
                        else {
                            u3.h = qxg;
                            u3.i = qxg;
                        }
                        u3.l = null;
                        u3.j = qxg;
                        ++u3.k;
                        u3.l();
                        qxg.a.l((h$a)this, sxg.b);
                        if (this.U0.h == qxg) {
                            this.I(sxg.b);
                        }
                        this.p(false);
                    }
                }
                if (this.f1) {
                    this.f1 = this.u();
                    this.k0();
                }
                else {
                    this.y();
                }
                final qxg m = this.U0.i;
                if (m != null) {
                    if (m.l != null && !this.d1) {
                        boolean b = false;
                        Label_0646: {
                            Label_0637: {
                                if (m.d) {
                                    int n3 = 0;
                                    while (true) {
                                        final z[] c0 = this.C0;
                                        if (n3 >= c0.length) {
                                            break;
                                        }
                                        final z z2 = c0[n3];
                                        final bro bro = m.c[n3];
                                        if (z2.i() != bro) {
                                            break Label_0637;
                                        }
                                        if (bro != null && !z2.j()) {
                                            final qxg l2 = m.l;
                                            if (!m.f.f || !l2.d || (!(z2 instanceof ris) && !(z2 instanceof o9h) && z2.w() < l2.e())) {
                                                break Label_0637;
                                            }
                                        }
                                        ++n3;
                                    }
                                    b = true;
                                    break Label_0646;
                                }
                            }
                            b = false;
                        }
                        if (b) {
                            final qxg l3 = m.l;
                            if (l3.d || this.n1 >= l3.e()) {
                                final wvt n4 = m.n;
                                final s u4 = this.U0;
                                final qxg i2 = u4.i;
                                ri4.t(i2 != null && i2.l != null);
                                u4.i = u4.i.l;
                                u4.l();
                                final qxg i3 = u4.i;
                                final wvt n5 = i3.n;
                                final e0 a2 = this.Z0.a;
                                this.m0(a2, i3.f.a, a2, m.f.a, -9223372036854775807L);
                                if (i3.d && i3.a.k() != -9223372036854775807L) {
                                    final long e3 = i3.e();
                                    for (final z z3 : this.C0) {
                                        if (z3.i() != null) {
                                            this.U(z3, e3);
                                        }
                                    }
                                }
                                else {
                                    for (int n7 = 0; n7 < this.C0.length; ++n7) {
                                        final boolean b2 = n4.b(n7);
                                        final boolean b3 = n5.b(n7);
                                        if (b2 && !this.C0[n7].p()) {
                                            final boolean b4 = ((e)this.E0[n7]).C0 == -2;
                                            final gfm gfm = n4.b[n7];
                                            final gfm gfm2 = n5.b[n7];
                                            if (!b3 || !gfm2.equals((Object)gfm) || b4) {
                                                this.U(this.C0[n7], i3.e());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else if (m.f.i || this.d1) {
                        int n8 = 0;
                        while (true) {
                            final z[] c3 = this.C0;
                            if (n8 >= c3.length) {
                                break;
                            }
                            final z z4 = c3[n8];
                            final bro bro2 = m.c[n8];
                            if (bro2 != null && z4.i() == bro2 && z4.j()) {
                                final long e4 = m.f.e;
                                long n9;
                                if (e4 != -9223372036854775807L && e4 != Long.MIN_VALUE) {
                                    n9 = e4 + m.o;
                                }
                                else {
                                    n9 = -9223372036854775807L;
                                }
                                this.U(z4, n9);
                            }
                            ++n8;
                        }
                    }
                }
                final s u5 = this.U0;
                final qxg i4 = u5.i;
                if (i4 != null && u5.h != i4) {
                    if (!i4.g) {
                        final wvt n10 = i4.n;
                        int n11 = 0;
                        int n12 = 0;
                        while (true) {
                            final z[] c4 = this.C0;
                            if (n11 >= c4.length) {
                                break;
                            }
                            final z z5 = c4[n11];
                            if (v(z5)) {
                                final boolean b5 = z5.i() != i4.c[n11];
                                if (!n10.b(n11) || b5) {
                                    if (!z5.p()) {
                                        z5.n(g(n10.c[n11]), i4.c[n11], i4.e(), i4.o);
                                    }
                                    else if (z5.f()) {
                                        this.c(z5);
                                    }
                                    else {
                                        n12 = 1;
                                    }
                                }
                            }
                            ++n11;
                        }
                        if ((n12 ^ 0x1) != 0x0) {
                            this.e();
                        }
                    }
                }
                int n13 = 0;
                while (true) {
                    boolean b6 = false;
                    Label_1434: {
                        if (this.f0()) {
                            if (!this.d1) {
                                final qxg h = this.U0.h;
                                if (h != null) {
                                    final qxg l4 = h.l;
                                    if (l4 != null && this.n1 >= l4.e() && l4.g) {
                                        b6 = true;
                                        break Label_1434;
                                    }
                                }
                            }
                        }
                        b6 = false;
                    }
                    if (!b6) {
                        break;
                    }
                    if (n13 != 0) {
                        this.z();
                    }
                    final qxg a3 = this.U0.a();
                    Objects.requireNonNull(a3);
                    boolean b8 = false;
                    Label_1546: {
                        if (((rxg)this.Z0.b).a.equals(((rxg)a3.f.a).a)) {
                            final i$b b7 = this.Z0.b;
                            if (((rxg)b7).b == -1) {
                                final i$b a4 = a3.f.a;
                                if (((rxg)a4).b == -1 && ((rxg)b7).e != ((rxg)a4).e) {
                                    b8 = true;
                                    break Label_1546;
                                }
                            }
                        }
                        b8 = false;
                    }
                    final sxg f2 = a3.f;
                    final i$b a5 = f2.a;
                    final long b9 = f2.b;
                    this.Z0 = this.t(a5, b9, f2.c, b9, b8 ^ true, 0);
                    this.H();
                    this.l0();
                    n13 = 1;
                }
            }
        }
        final int e5 = this.Z0.e;
        if (e5 == 1 || e5 == 4) {
            this.J0.h();
            return;
        }
        final qxg h2 = this.U0.h;
        if (h2 == null) {
            this.N(a, 10L);
            return;
        }
        nkz.h("doSomeWork");
        this.l0();
        int n14;
        int n15;
        if (h2.d) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            h2.a.u(this.Z0.s - this.O0, this.P0);
            n14 = 1;
            n15 = 1;
            int n16 = 0;
            while (true) {
                final z[] c5 = this.C0;
                if (n16 >= c5.length) {
                    break;
                }
                final z z6 = c5[n16];
                int n17;
                int n18;
                if (!v(z6)) {
                    n17 = n14;
                    n18 = n15;
                }
                else {
                    z6.v(this.n1, elapsedRealtime * 1000L);
                    int n19;
                    if (n14 != 0 && z6.f()) {
                        n19 = 1;
                    }
                    else {
                        n19 = 0;
                    }
                    final boolean b10 = h2.c[n16] != z6.i();
                    final boolean b11 = !b10 && z6.j();
                    final boolean b12 = b10 || b11 || z6.b() || z6.f();
                    int n20;
                    if (n15 != 0 && b12) {
                        n20 = 1;
                    }
                    else {
                        n20 = 0;
                    }
                    n17 = n19;
                    n18 = n20;
                    if (!b12) {
                        z6.o();
                        n18 = n20;
                        n17 = n19;
                    }
                }
                ++n16;
                n14 = n17;
                n15 = n18;
            }
        }
        else {
            h2.a.p();
            n15 = 1;
            n14 = 1;
        }
        final long e6 = h2.f.e;
        final boolean b13 = n14 != 0 && h2.d && (e6 == -9223372036854775807L || e6 <= this.Z0.s);
        if (b13 && this.d1) {
            this.Z(this.d1 = false, this.Z0.m, false, 5);
        }
        Label_2503: {
            if (b13 && h2.f.i) {
                this.e0(4);
                this.j0();
            }
            else {
                final ulk z7 = this.Z0;
                if (z7.e == 2) {
                    boolean w = false;
                    Label_2271: {
                        if (this.l1 == 0) {
                            w = this.w();
                        }
                        else {
                            Label_2262: {
                                if (n15 != 0) {
                                    if (z7.g) {
                                        long i5;
                                        if (this.g0(z7.a, this.U0.h.f.a)) {
                                            i5 = ((g)this.W0).i;
                                        }
                                        else {
                                            i5 = -9223372036854775807L;
                                        }
                                        final qxg j2 = this.U0.j;
                                        final boolean b14 = j2.f() && j2.f.i;
                                        final boolean b15 = ((rxg)j2.f.a).a() && !j2.d;
                                        if (!b14 && !b15) {
                                            if (!this.H0.d(this.k(), this.Q0.a().C0, this.e1, i5)) {
                                                break Label_2262;
                                            }
                                        }
                                    }
                                    w = true;
                                    break Label_2271;
                                }
                            }
                            w = false;
                        }
                    }
                    if (w) {
                        this.e0(3);
                        this.q1 = null;
                        if (this.f0()) {
                            this.h0();
                        }
                        break Label_2503;
                    }
                }
                if (this.Z0.e == 3) {
                    if (this.l1 == 0) {
                        if (this.w()) {
                            break Label_2503;
                        }
                    }
                    else if (n15 != 0) {
                        break Label_2503;
                    }
                    this.e1 = this.f0();
                    this.e0(2);
                    if (this.e1) {
                        for (qxg qxg2 = this.U0.h; qxg2 != null; qxg2 = qxg2.l) {
                            for (final hha hha : qxg2.n.c) {
                                if (hha != null) {
                                    hha.t();
                                }
                            }
                        }
                        final g g2 = (g)this.W0;
                        final long i6 = g2.i;
                        if (i6 != -9223372036854775807L) {
                            final long i7 = i6 + g2.b;
                            g2.i = i7;
                            final long h3 = g2.h;
                            if (h3 != -9223372036854775807L && i7 > h3) {
                                g2.i = h3;
                            }
                            g2.m = -9223372036854775807L;
                        }
                    }
                    this.j0();
                }
            }
        }
        boolean b16 = false;
        Label_2619: {
            if (this.Z0.e == 2) {
                int n22 = 0;
                while (true) {
                    final z[] c7 = this.C0;
                    if (n22 >= c7.length) {
                        break;
                    }
                    if (v(c7[n22]) && this.C0[n22].i() == h2.c[n22]) {
                        this.C0[n22].o();
                    }
                    ++n22;
                }
                final ulk z8 = this.Z0;
                if (!z8.g && z8.r < 500000L && this.u()) {
                    b16 = true;
                    break Label_2619;
                }
            }
            b16 = false;
        }
        if (!b16) {
            this.r1 = -9223372036854775807L;
        }
        else if (this.r1 == -9223372036854775807L) {
            this.r1 = this.S0.c();
        }
        else if (this.S0.c() - this.r1 >= 4000L) {
            throw new IllegalStateException("Playback stuck buffering and not loading");
        }
        final boolean k2 = this.k1;
        final ulk z9 = this.Z0;
        if (k2 != z9.o) {
            this.Z0 = z9.c(k2);
        }
        int n23 = 0;
        Label_2821: {
            if (!this.f0() || this.Z0.e != 3) {
                final int e7 = this.Z0.e;
                if (e7 != 2) {
                    if (this.l1 != 0 && e7 != 4) {
                        this.N(a, 1000L);
                    }
                    else {
                        this.J0.h();
                    }
                    n23 = 0;
                    break Label_2821;
                }
            }
            boolean b17;
            if (this.k1 && this.j1) {
                b17 = false;
            }
            else {
                this.N(a, 10L);
                b17 = true;
            }
            n23 = ((b17 ^ true) ? 1 : 0);
        }
        final ulk z10 = this.Z0;
        if ((z10.p ? 1 : 0) != n23) {
            this.Z0 = new ulk(z10.a, z10.b, z10.c, z10.d, z10.e, z10.f, z10.g, z10.h, z10.i, z10.j, z10.k, z10.l, z10.m, z10.n, z10.q, z10.r, z10.s, z10.o, (boolean)(n23 != 0));
        }
        this.j1 = false;
        nkz.l();
    }
    
    public final void d0(final k5q k5q) throws ExoPlaybackException {
        this.a1.a(1);
        final t v0 = this.V0;
        final int e = v0.e();
        k5q g = k5q;
        if (k5q.getLength() != e) {
            g = k5q.e().g(e);
        }
        v0.j = g;
        this.q(v0.c(), false);
    }
    
    public final void e() throws ExoPlaybackException {
        this.f(new boolean[this.C0.length]);
    }
    
    public final void e0(final int n) {
        final ulk z0 = this.Z0;
        if (z0.e != n) {
            if (n != 2) {
                this.r1 = -9223372036854775807L;
            }
            this.Z0 = z0.g(n);
        }
    }
    
    public final void f(final boolean[] array) throws ExoPlaybackException {
        final qxg i = this.U0.i;
        final wvt n = i.n;
        for (int j = 0; j < this.C0.length; ++j) {
            if (!n.b(j) && this.D0.remove(this.C0[j])) {
                this.C0[j].c();
            }
        }
        for (int k = 0; k < this.C0.length; ++k) {
            if (n.b(k)) {
                final boolean b = array[k];
                final z e0 = this.C0[k];
                if (!v(e0)) {
                    final s u0 = this.U0;
                    final qxg l = u0.i;
                    final boolean b2 = l == u0.h;
                    final wvt n2 = l.n;
                    final gfm gfm = n2.b[k];
                    final n[] g = g(n2.c[k]);
                    final boolean b3 = this.f0() && this.Z0.e == 3;
                    final boolean b4 = !b && b3;
                    ++this.l1;
                    this.D0.add(e0);
                    e0.l(gfm, g, l.c[k], this.n1, b4, b2, l.e(), l.o);
                    ((x$b)e0).m(11, (Object)new l(this));
                    final h q0 = this.Q0;
                    Objects.requireNonNull(q0);
                    final prg y = e0.y();
                    if (y != null) {
                        final prg f0 = q0.F0;
                        if (y != f0) {
                            if (f0 != null) {
                                throw ExoPlaybackException.c(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                            }
                            q0.F0 = y;
                            q0.E0 = e0;
                            y.g(q0.C0.G0);
                        }
                    }
                    if (b3) {
                        e0.start();
                    }
                }
            }
        }
        i.g = true;
    }
    
    public final boolean f0() {
        final ulk z0 = this.Z0;
        return z0.l && z0.m == 0;
    }
    
    public final boolean g0(final e0 e0, final i$b i$b) {
        final boolean a = ((rxg)i$b).a();
        boolean b2;
        final boolean b = b2 = false;
        if (!a) {
            if (e0.r()) {
                b2 = b;
            }
            else {
                e0.o(e0.i(((rxg)i$b).a, this.N0).E0, this.M0);
                b2 = b;
                if (this.M0.d()) {
                    final e0$d m0 = this.M0;
                    b2 = b;
                    if (m0.K0) {
                        b2 = b;
                        if (m0.H0 != -9223372036854775807L) {
                            b2 = true;
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    public final long h(final e0 e0, final Object o, final long n) {
        e0.o(e0.i(o, this.N0).E0, this.M0);
        final e0$d m0 = this.M0;
        if (m0.H0 != -9223372036854775807L && m0.d()) {
            final e0$d m2 = this.M0;
            if (m2.K0) {
                return imw.H(m2.a() - this.M0.H0) - (n + this.N0.G0);
            }
        }
        return -9223372036854775807L;
    }
    
    public final void h0() throws ExoPlaybackException {
        int i = 0;
        this.e1 = false;
        final h q0 = this.Q0;
        q0.H0 = true;
        q0.C0.c();
        for (z[] c0 = this.C0; i < c0.length; ++i) {
            final z z = c0[i];
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
                    this.d0((k5q)message.obj);
                    break;
                }
                case 20: {
                    this.E(message.arg1, message.arg2, (k5q)message.obj);
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
                    this.s(v, v.C0, true, false);
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
                    this.l((com.google.android.exoplayer2.source.h)message.obj);
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
                    this.Y0 = (fbp)message.obj;
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
            dml.s("ExoPlayerImplInternal", "Playback error", (Throwable)c);
            this.i0(true, false);
            this.Z0 = this.Z0.e(c);
        }
        catch (final IOException ex2) {
            this.o(ex2, 2000);
        }
        catch (final BehindLiveWindowException ex3) {
            this.o((IOException)ex3, 1002);
        }
        catch (final DataSourceException ex4) {
            this.o((IOException)ex4, ex4.C0);
        }
        catch (final ParserException ex5) {
            final int d0 = ex5.D0;
            if (d0 == 1) {
                if (ex5.C0) {
                    n = 3001;
                }
                else {
                    n = 3003;
                }
            }
            else if (d0 == 4) {
                if (ex5.C0) {
                    n = 3002;
                }
                else {
                    n = 3004;
                }
            }
            this.o((IOException)ex5, n);
        }
        catch (final DrmSession$DrmSessionException ex6) {
            this.o((IOException)ex6, ex6.C0);
        }
        catch (final ExoPlaybackException ex7) {
            ExoPlaybackException b = ex7;
            if (ex7.E0 != 0) {
                final qxg i = this.U0.i;
                b = ex7;
                if (i != null) {
                    b = ex7.b((rxg)i.f.a);
                }
            }
            if (b.K0 && this.q1 == null) {
                dml.F0("ExoPlayerImplInternal", "Recoverable renderer error", (Throwable)b);
                this.q1 = b;
                final occ j0 = this.J0;
                j0.g(j0.d(25, (Object)b));
            }
            else {
                final ExoPlaybackException q1 = this.q1;
                ExoPlaybackException q2 = b;
                if (q1 != null) {
                    ((Throwable)q1).addSuppressed((Throwable)b);
                    q2 = this.q1;
                }
                dml.s("ExoPlayerImplInternal", "Playback error", (Throwable)q2);
                this.i0(true, false);
                this.Z0 = this.Z0.e(q2);
            }
        }
        this.z();
        return true;
    }
    
    public final long i() {
        final qxg i = this.U0.i;
        if (i == null) {
            return 0L;
        }
        long o = i.o;
        if (!i.d) {
            return o;
        }
        int n = 0;
        while (true) {
            final z[] c0 = this.C0;
            if (n >= c0.length) {
                return o;
            }
            long max = o;
            if (v(c0[n])) {
                if (this.C0[n].i() != i.c[n]) {
                    max = o;
                }
                else {
                    final long w = this.C0[n].w();
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
    
    public final void i0(final boolean b, final boolean b2) {
        this.G(b || !this.i1, false, true, false);
        this.a1.a((int)(b2 ? 1 : 0));
        this.H0.f();
        this.e0(1);
    }
    
    public final Pair<i$b, Long> j(final e0 e0) {
        final boolean r = e0.r();
        final long n = 0L;
        if (r) {
            final i$b t = ulk.t;
            return (Pair<i$b, Long>)Pair.create((Object)ulk.t, (Object)0L);
        }
        final Pair k = e0.k(this.M0, this.N0, e0.b(this.h1), -9223372036854775807L);
        final i$b p = this.U0.p(e0, k.first, 0L);
        long n2 = (long)k.second;
        if (((rxg)p).a()) {
            e0.i(((rxg)p).a, this.N0);
            n2 = n;
            if (((rxg)p).c == this.N0.f(((rxg)p).b)) {
                n2 = this.N0.I0.E0;
            }
        }
        return (Pair<i$b, Long>)Pair.create((Object)p, (Object)n2);
    }
    
    public final void j0() throws ExoPlaybackException {
        final h q0 = this.Q0;
        int i = 0;
        q0.H0 = false;
        final i5r c0 = q0.C0;
        if (c0.D0) {
            c0.b(c0.r());
            c0.D0 = false;
        }
        for (z[] c2 = this.C0; i < c2.length; ++i) {
            final z z = c2[i];
            if (v(z) && z.getState() == 2) {
                z.stop();
            }
        }
    }
    
    public final long k() {
        final long q = this.Z0.q;
        final qxg j = this.U0.j;
        long max = 0L;
        if (j != null) {
            max = Math.max(0L, q - (this.n1 - j.o));
        }
        return max;
    }
    
    public final void k0() {
        final qxg j = this.U0.j;
        final boolean b = this.f1 || (j != null && j.a.c());
        final ulk z0 = this.Z0;
        if (b != z0.g) {
            this.Z0 = new ulk(z0.a, z0.b, z0.c, z0.d, z0.e, z0.f, b, z0.h, z0.i, z0.j, z0.k, z0.l, z0.m, z0.n, z0.q, z0.r, z0.s, z0.o, z0.p);
        }
    }
    
    public final void l(final com.google.android.exoplayer2.source.h h) {
        final s u0 = this.U0;
        final qxg j = u0.j;
        if (j == null || j.a != h) {
            return;
        }
        u0.m(this.n1);
        this.y();
    }
    
    public final void l0() throws ExoPlaybackException {
        final qxg h = this.U0.h;
        if (h == null) {
            return;
        }
        long k;
        if (h.d) {
            k = h.a.k();
        }
        else {
            k = -9223372036854775807L;
        }
        if (k != -9223372036854775807L) {
            this.I(k);
            if (k != this.Z0.s) {
                final ulk z0 = this.Z0;
                this.Z0 = this.t(z0.b, k, z0.c, k, true, 5);
            }
        }
        else {
            final h q0 = this.Q0;
            final boolean b = h != this.U0.i;
            final z e0 = q0.E0;
            boolean b2 = false;
            Label_0184: {
                Label_0181: {
                    if (e0 != null && !e0.f()) {
                        if (!q0.E0.b()) {
                            if (b) {
                                break Label_0181;
                            }
                            if (q0.E0.j()) {
                                break Label_0181;
                            }
                        }
                        b2 = false;
                        break Label_0184;
                    }
                }
                b2 = true;
            }
            Label_0382: {
                if (b2) {
                    q0.G0 = true;
                    if (q0.H0) {
                        q0.C0.c();
                    }
                }
                else {
                    final prg f0 = q0.F0;
                    Objects.requireNonNull(f0);
                    final long r = f0.r();
                    if (q0.G0) {
                        if (r < q0.C0.r()) {
                            final i5r c0 = q0.C0;
                            if (c0.D0) {
                                c0.b(c0.r());
                                c0.D0 = false;
                            }
                            break Label_0382;
                        }
                        else {
                            q0.G0 = false;
                            if (q0.H0) {
                                q0.C0.c();
                            }
                        }
                    }
                    q0.C0.b(r);
                    final v a = f0.a();
                    if (!a.equals((Object)q0.C0.G0)) {
                        q0.C0.g(a);
                        ((z4s.a)((m)q0.D0).J0.d(16, (Object)a)).b();
                    }
                }
            }
            final long r2 = q0.r();
            this.n1 = r2;
            final long s = r2 - h.o;
            final long s2 = this.Z0.s;
            Label_0900: {
                if (!this.R0.isEmpty()) {
                    if (!((rxg)this.Z0.b).a()) {
                        long n = s2;
                        if (this.p1) {
                            n = s2 - 1L;
                            this.p1 = false;
                        }
                        final ulk z2 = this.Z0;
                        final int c2 = z2.a.c(((rxg)z2.b).a);
                        int min = Math.min(this.o1, this.R0.size());
                    Label_0658_Outer:
                        while (true) {
                            Label_0530: {
                                if (min <= 0) {
                                    final long n2 = s;
                                    final m m = this;
                                    break Label_0530;
                                }
                                m.m$c m$c = this.R0.get(min - 1);
                                long n2 = s;
                                final m m = this;
                                while (m$c != null) {
                                    final int d0 = m$c.D0;
                                    if (d0 <= c2 && (d0 != c2 || m$c.E0 <= n)) {
                                        break;
                                    }
                                    if (--min <= 0) {
                                        break Label_0530;
                                    }
                                    m$c = m.R0.get(min - 1);
                                }
                                long n3 = n;
                                int n4 = min;
                                m i = m;
                                long n5 = n2;
                                while (true) {
                                    Label_0645: {
                                        if (min >= m.R0.size()) {
                                            break Label_0645;
                                        }
                                        m.m$c m$c2 = m.R0.get(min);
                                        i = m;
                                        m.m$c m$c3;
                                        while (true) {
                                            m$c3 = m$c2;
                                            if (m$c2 == null) {
                                                break;
                                            }
                                            m$c3 = m$c2;
                                            if (m$c2.F0 == null) {
                                                break;
                                            }
                                            final int d2 = m$c2.D0;
                                            if (d2 >= c2) {
                                                m$c3 = m$c2;
                                                if (d2 != c2) {
                                                    break;
                                                }
                                                m$c3 = m$c2;
                                                if (m$c2.E0 > n) {
                                                    break;
                                                }
                                            }
                                            if (++min >= i.R0.size()) {
                                                n3 = n;
                                                n4 = min;
                                                n5 = n2;
                                                break Label_0645;
                                            }
                                            m$c2 = i.R0.get(min);
                                        }
                                        while (m$c3 != null && m$c3.F0 != null && m$c3.D0 == c2) {
                                            final long e2 = m$c3.E0;
                                            if (e2 > n && e2 <= n2) {
                                                try {
                                                    i.S(m$c3.C0);
                                                    Objects.requireNonNull(m$c3.C0);
                                                    i.R0.remove(min);
                                                    if (min < i.R0.size()) {
                                                        m$c3 = i.R0.get(min);
                                                        continue Label_0658_Outer;
                                                    }
                                                    m$c3 = null;
                                                    continue Label_0658_Outer;
                                                }
                                                finally {
                                                    Objects.requireNonNull(m$c3.C0);
                                                    i.R0.remove(min);
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        i.o1 = min;
                                        break Label_0900;
                                    }
                                    m.m$c m$c2 = null;
                                    n2 = n5;
                                    min = n4;
                                    n = n3;
                                    continue;
                                }
                            }
                            m.m$c m$c = null;
                            continue;
                        }
                    }
                }
            }
            this.Z0.s = s;
        }
        this.Z0.q = this.U0.j.d();
        this.Z0.r = this.k();
        final ulk z3 = this.Z0;
        if (z3.l && z3.e == 3 && this.g0(z3.a, z3.b)) {
            final ulk z4 = this.Z0;
            final float c3 = z4.n.C0;
            float n6 = 1.0f;
            if (c3 == 1.0f) {
                final p w0 = this.W0;
                final long h2 = this.h(z4.a, ((rxg)z4.b).a, z4.s);
                final long j = this.k();
                final g g = (g)w0;
                if (g.d != -9223372036854775807L) {
                    final long n7 = h2 - j;
                    final long n8 = g.n;
                    if (n8 == -9223372036854775807L) {
                        g.n = n7;
                        g.o = 0L;
                    }
                    else {
                        final float c4 = g.c;
                        final long max = Math.max(n7, (long)((1.0f - c4) * n7 + n8 * c4));
                        g.n = max;
                        final long abs = Math.abs(n7 - max);
                        final long o = g.o;
                        final float c5 = g.c;
                        g.o = (long)((1.0f - c5) * abs + o * c5);
                    }
                    if (g.m != -9223372036854775807L && SystemClock.elapsedRealtime() - g.m < 1000L) {
                        n6 = g.l;
                    }
                    else {
                        g.m = SystemClock.elapsedRealtime();
                        final long n9 = g.o * 3L + g.n;
                        if (g.i > n9) {
                            final long h3 = imw.H(1000L);
                            final float l = g.l;
                            final float n10 = (float)h3;
                            final long[] array = { n9, g.f, g.i - ((long)((l - 1.0f) * n10) + (long)((g.j - 1.0f) * n10)) };
                            long i2 = array[0];
                            long n12;
                            for (int n11 = 1; n11 < 3; ++n11, i2 = n12) {
                                n12 = i2;
                                if (array[n11] > i2) {
                                    n12 = array[n11];
                                }
                            }
                            g.i = i2;
                        }
                        else {
                            final long j2 = imw.j(h2 - (long)(Math.max(0.0f, g.l - 1.0f) / 1.0E-7f), g.i, n9);
                            g.i = j2;
                            final long h4 = g.h;
                            if (h4 != -9223372036854775807L && j2 > h4) {
                                g.i = h4;
                            }
                        }
                        final long n13 = h2 - g.i;
                        if (Math.abs(n13) < g.a) {
                            g.l = 1.0f;
                        }
                        else {
                            g.l = imw.h(1.0E-7f * n13 + 1.0f, g.k, g.j);
                        }
                        n6 = g.l;
                    }
                }
                if (this.Q0.a().C0 != n6) {
                    this.Q0.g(new v(n6, this.Z0.n.D0));
                    this.s(this.Z0.n, this.Q0.a().C0, false, false);
                }
            }
        }
    }
    
    public final void m(final com.google.android.exoplayer2.source.p p) {
        ((z4s.a)this.J0.d(9, (Object)p)).b();
    }
    
    public final void m0(final e0 e0, final i$b i$b, final e0 e2, final i$b i$b2, long h) {
        if (!this.g0(e0, i$b)) {
            v v;
            if (((rxg)i$b).a()) {
                v = com.google.android.exoplayer2.v.F0;
            }
            else {
                v = this.Z0.n;
            }
            if (!this.Q0.a().equals((Object)v)) {
                this.Q0.g(v);
            }
            return;
        }
        e0.o(e0.i(((rxg)i$b).a, this.N0).E0, this.M0);
        final p w0 = this.W0;
        final q$f m0 = this.M0.M0;
        final int a = imw.a;
        final g g = (g)w0;
        Objects.requireNonNull(g);
        g.d = imw.H(m0.C0);
        g.g = imw.H(m0.D0);
        g.h = imw.H(m0.E0);
        float f0 = m0.F0;
        if (f0 == -3.4028235E38f) {
            f0 = 0.97f;
        }
        g.k = f0;
        float g2 = m0.G0;
        if (g2 == -3.4028235E38f) {
            g2 = 1.03f;
        }
        g.j = g2;
        if (f0 == 1.0f && g2 == 1.0f) {
            g.d = -9223372036854775807L;
        }
        g.a();
        if (h != -9223372036854775807L) {
            final p w2 = this.W0;
            h = this.h(e0, ((rxg)i$b).a, h);
            final g g3 = (g)w2;
            g3.e = h;
            g3.a();
        }
        else {
            final Object c0 = this.M0.C0;
            Object c2 = null;
            if (!e2.r()) {
                c2 = e2.o(e2.i(((rxg)i$b2).a, this.N0).E0, this.M0).C0;
            }
            if (!imw.a(c2, c0)) {
                final g g4 = (g)this.W0;
                g4.e = -9223372036854775807L;
                g4.a();
            }
        }
    }
    
    public final void n(final com.google.android.exoplayer2.source.h h) {
        ((z4s.a)this.J0.d(8, (Object)h)).b();
    }
    
    public final void n0(final iyr<Boolean> iyr, final long n) {
        synchronized (this) {
            final long c = this.S0.c();
            boolean b = false;
            for (long n2 = n; !(boolean)((mga)iyr).get() && n2 > 0L; n2 = c + n - this.S0.c()) {
                try {
                    this.S0.d();
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
        final qxg h = this.U0.h;
        ExoPlaybackException b = ex2;
        if (h != null) {
            b = ex2.b((rxg)h.f.a);
        }
        dml.s("ExoPlayerImplInternal", "Playback error", (Throwable)b);
        this.i0(false, false);
        this.Z0 = this.Z0.e(b);
    }
    
    public final void p(final boolean b) {
        final qxg j = this.U0.j;
        i$b i$b;
        if (j == null) {
            i$b = this.Z0.b;
        }
        else {
            i$b = j.f.a;
        }
        final boolean b2 = ((rxg)this.Z0.k).equals((Object)i$b) ^ true;
        if (b2) {
            this.Z0 = this.Z0.a(i$b);
        }
        final ulk z0 = this.Z0;
        long q;
        if (j == null) {
            q = z0.s;
        }
        else {
            q = j.d();
        }
        z0.q = q;
        this.Z0.r = this.k();
        if ((b2 || b) && j != null && j.d) {
            this.H0.h(this.C0, j.m, j.n.c);
        }
    }
    
    public final void q(final e0 e0, boolean n) throws ExoPlaybackException {
        final ulk z0 = this.Z0;
        final m.m$g m1 = this.m1;
        final s u0 = this.U0;
        final int g1 = this.g1;
        final boolean h1 = this.h1;
        final e0$d m2 = this.M0;
        final e0$b n2 = this.N0;
        Object o;
        if (e0.r()) {
            final i$b t = ulk.t;
            o = new m.m$f(ulk.t, 0L, -9223372036854775807L, false, true, false);
        }
        else {
            final i$b b = z0.b;
            Object o2 = ((rxg)b).a;
            final boolean x = x(z0, n2);
            long n3;
            if (!((rxg)z0.b).a() && !x) {
                n3 = z0.s;
            }
            else {
                n3 = z0.c;
            }
            int n4 = 0;
            long n5 = 0L;
            boolean b2 = false;
            boolean b8 = false;
            boolean b9 = false;
            Label_0568: {
                if (m1 != null) {
                    final Pair<Object, Long> l = L(e0, m1, true, g1, h1, m2, n2);
                    boolean b3;
                    boolean b4;
                    if (l == null) {
                        n4 = e0.b(h1);
                        n5 = n3;
                        b2 = false;
                        b3 = false;
                        b4 = true;
                    }
                    else {
                        boolean b5;
                        if (m1.c == -9223372036854775807L) {
                            n4 = e0.i(l.first, n2).E0;
                            n5 = n3;
                            b5 = false;
                        }
                        else {
                            o2 = l.first;
                            n5 = (long)l.second;
                            b5 = true;
                            n4 = -1;
                        }
                        b3 = (z0.e == 4);
                        final boolean b6 = false;
                        b2 = b5;
                        b4 = b6;
                    }
                    final boolean b7 = b3;
                    b8 = b4;
                    b9 = b7;
                }
                else {
                    boolean b10 = false;
                    Label_0550: {
                        if (z0.a.r()) {
                            n4 = e0.b(h1);
                        }
                        else {
                            if (e0.c(o2) == -1) {
                                final Object i = M(m2, n2, g1, h1, o2, z0.a, e0);
                                if (i == null) {
                                    n4 = e0.b(h1);
                                    b10 = true;
                                }
                                else {
                                    n4 = e0.i(i, n2).E0;
                                    b10 = false;
                                }
                                break Label_0550;
                            }
                            final Object o3 = o2;
                            if (n3 == -9223372036854775807L) {
                                n4 = e0.i(o3, n2).E0;
                            }
                            else {
                                if (x) {
                                    final e0 a = z0.a;
                                    final i$b i$b = b;
                                    a.i(((rxg)i$b).a, n2);
                                    if (z0.a.o(n2.E0, m2).Q0 == z0.a.c(((rxg)i$b).a)) {
                                        final Pair k = e0.k(m2, n2, e0.i(o3, n2).E0, n3 + n2.G0);
                                        o2 = k.first;
                                        n5 = (long)k.second;
                                    }
                                    else {
                                        o2 = o3;
                                        n5 = n3;
                                    }
                                    n4 = -1;
                                    b9 = false;
                                    b8 = false;
                                    b2 = true;
                                    break Label_0568;
                                }
                                n4 = -1;
                            }
                        }
                        b10 = false;
                    }
                    n5 = n3;
                    final boolean b11 = false;
                    b2 = false;
                    b8 = b10;
                    b9 = b11;
                }
            }
            long n6;
            if (n4 != -1) {
                final Pair j = e0.k(m2, n2, n4, -9223372036854775807L);
                o2 = j.first;
                n5 = (long)j.second;
                n6 = -9223372036854775807L;
            }
            else {
                n6 = n5;
            }
            final i$b p2 = u0.p(e0, o2, n5);
            final int e2 = ((rxg)p2).e;
            boolean b12 = false;
            Label_0678: {
                if (e2 != -1) {
                    final int e3 = ((rxg)b).e;
                    if (e3 == -1 || e2 < e3) {
                        b12 = false;
                        break Label_0678;
                    }
                }
                b12 = true;
            }
            final boolean b13 = ((rxg)b).a.equals(o2) && !((rxg)b).a() && !((rxg)p2).a() && b12;
            final e0$b i2 = e0.i(o2, n2);
            boolean b14 = false;
            Label_0855: {
                if (!x && n3 == n6) {
                    if (((rxg)b).a.equals(((rxg)p2).a)) {
                        if ((!((rxg)b).a() || !i2.g(((rxg)b).b)) ? (((rxg)p2).a() && i2.g(((rxg)p2).b)) : (i2.e(((rxg)b).b, ((rxg)b).c) != 4 && i2.e(((rxg)b).b, ((rxg)b).c) != 2)) {
                            b14 = true;
                            break Label_0855;
                        }
                    }
                }
                b14 = false;
            }
            i$b i$b2 = null;
            Label_0873: {
                if (!b13) {
                    i$b2 = p2;
                    if (!b14) {
                        break Label_0873;
                    }
                }
                i$b2 = b;
            }
            long n7;
            if (((rxg)i$b2).a()) {
                if (((rxg)i$b2).equals((Object)b)) {
                    n7 = z0.s;
                }
                else {
                    e0.i(((rxg)i$b2).a, n2);
                    if (((rxg)i$b2).c == n2.f(((rxg)i$b2).b)) {
                        n7 = n2.I0.E0;
                    }
                    else {
                        n7 = 0L;
                    }
                }
            }
            else {
                n7 = n5;
            }
            o = new m.m$f(i$b2, n7, n6, b9, b8, b2);
        }
        final i$b a2 = ((m.m$f)o).a;
        final long c = ((m.m$f)o).c;
        final boolean d = ((m.m$f)o).d;
        long n8 = ((m.m$f)o).b;
        final boolean b15 = !((rxg)this.Z0.b).equals((Object)a2) || n8 != this.Z0.s;
        int n9 = 3;
        try {
            if (((m.m$f)o).e) {
                if (this.Z0.e != 1) {
                    this.e0(4);
                }
                this.G(false, false, false, true);
            }
            Label_1143: {
                if (b15) {
                    break Label_1143;
                }
            Block_56_Outer:
                while (true) {
                    s u2;
                    long n10;
                    long i3;
                    long q;
                    try {
                        u2 = this.U0;
                        n10 = this.n1;
                        i3 = this.i();
                        q = n8;
                        final s s = u2;
                        final e0 e4 = e0;
                        final long n11 = n10;
                        final long n12 = i3;
                        final boolean b16 = s.r(e4, n11, n12);
                        if (!b16) {
                            final m m3 = this;
                            final boolean b17 = false;
                            m3.O(b17);
                            q = n8;
                            break Label_1229;
                        }
                        break Label_1229;
                    }
                    finally {}
                    try {
                        final s s = u2;
                        final e0 e4 = e0;
                        final long n11 = n10;
                        final long n12 = i3;
                        final boolean b16 = s.r(e4, n11, n12);
                        if (!b16) {
                            final m m3 = this;
                            final boolean b17 = false;
                            m3.O(b17);
                            q = n8;
                        }
                        final int n13 = 1;
                        final ulk z2 = this.Z0;
                        final e0 a3 = z2.a;
                        final i$b b18 = z2.b;
                        if (((m.m$f)o).f) {
                            n8 = q;
                        }
                        else {
                            n8 = -9223372036854775807L;
                        }
                        this.m0(e0, a2, a3, b18, n8);
                        if (b15 || c != this.Z0.c) {
                            o = this.Z0;
                            final Object a4 = ((rxg)((ulk)o).b).a;
                            o = ((ulk)o).a;
                            if (b15 && n != 0 && !((e0)o).r() && !((e0)o).i(a4, this.N0).H0) {
                                n = n13;
                            }
                            else {
                                n = 0;
                            }
                            n8 = this.Z0.d;
                            if (e0.c(a4) == -1) {
                                n9 = 4;
                            }
                            this.Z0 = this.t(a2, q, c, n8, (boolean)(n != 0), n9);
                        }
                        this.H();
                        this.K(e0, this.Z0.a);
                        this.Z0 = this.Z0.h(e0);
                        if (!e0.r()) {
                            this.m1 = null;
                        }
                        this.p(false);
                        return;
                        qxg qxg = null;
                        qxg.f = this.U0.h(e0, qxg.f);
                        qxg.j();
                        Label_1207: {
                            break Label_1207;
                            Label_1217: {
                                q = this.Q(a2, n8, d);
                            }
                            continue Block_56_Outer;
                        }
                        qxg = qxg.l;
                    Block_57:
                        while (true) {
                            Label_1163: {
                                break Label_1163;
                                qxg = this.U0.h;
                            }
                            iftrue(Label_1217:)(qxg == null);
                            break Block_57;
                            q = n8;
                            iftrue(Label_1229:)(e0.r());
                            continue;
                        }
                        iftrue(Label_1207:)(!((rxg)qxg.f.a).equals((Object)a2));
                    }
                    finally {}
                    break;
                }
            }
        }
        finally {}
        final boolean b19 = true;
        final ulk z3 = this.Z0;
        final e0 a5 = z3.a;
        final i$b b20 = z3.b;
        long n14;
        if (((m.m$f)o).f) {
            n14 = n8;
        }
        else {
            n14 = -9223372036854775807L;
        }
        this.m0(e0, a2, a5, b20, n14);
        if (b15 || c != this.Z0.c) {
            final ulk z4 = this.Z0;
            final Object a6 = ((rxg)z4.b).a;
            final e0 a7 = z4.a;
            final boolean b21 = b15 && n != 0 && !a7.r() && !a7.i(a6, this.N0).H0 && b19;
            final long d2 = this.Z0.d;
            if (e0.c(a6) == -1) {
                n9 = 4;
            }
            this.Z0 = this.t(a2, n8, c, d2, b21, n9);
        }
        this.H();
        this.K(e0, this.Z0.a);
        this.Z0 = this.Z0.h(e0);
        if (!e0.r()) {
            this.m1 = null;
        }
        this.p(false);
    }
    
    public final void r(final com.google.android.exoplayer2.source.h h) throws ExoPlaybackException {
        final qxg j = this.U0.j;
        if (j == null || j.a != h) {
            return;
        }
        final float c0 = this.Q0.a().C0;
        final e0 a = this.Z0.a;
        j.d = true;
        j.m = j.a.r();
        final wvt i = j.i(c0, a);
        final sxg f = j.f;
        final long b = f.b;
        final long e = f.e;
        long max = b;
        if (e != -9223372036854775807L) {
            max = b;
            if (b >= e) {
                max = Math.max(0L, e - 1L);
            }
        }
        final long a2 = j.a(i, max, false, new boolean[j.i.length]);
        final long o = j.o;
        final sxg f2 = j.f;
        j.o = f2.b - a2 + o;
        j.f = f2.b(a2);
        this.H0.h(this.C0, j.m, j.n.c);
        if (j == this.U0.h) {
            this.I(j.f.b);
            this.e();
            final ulk z0 = this.Z0;
            final i$b b2 = z0.b;
            final long b3 = j.f.b;
            this.Z0 = this.t(b2, b3, z0.c, b3, false, 5);
        }
        this.y();
    }
    
    public final void s(final v v, final float n, final boolean b, final boolean b2) throws ExoPlaybackException {
        if (b) {
            if (b2) {
                this.a1.a(1);
            }
            this.Z0 = this.Z0.f(v);
        }
        final float c0 = v.C0;
        qxg qxg = this.U0.h;
        int n2;
        while (true) {
            n2 = 0;
            int i = 0;
            if (qxg == null) {
                break;
            }
            for (hha[] c2 = qxg.n.c; i < c2.length; ++i) {
                final hha hha = c2[i];
                if (hha != null) {
                    hha.j(c0);
                }
            }
            qxg = qxg.l;
        }
        final z[] c3 = this.C0;
        for (int length = c3.length, j = n2; j < length; ++j) {
            final z z = c3[j];
            if (z != null) {
                z.s(n, v.C0);
            }
        }
    }
    
    public final ulk t(final i$b i$b, final long n, final long n2, final long n3, final boolean b, final int e) {
        this.p1 = (this.p1 || n != this.Z0.s || !((rxg)i$b).equals((Object)this.Z0.b));
        this.H();
        final ulk z0 = this.Z0;
        mvt mvt = z0.h;
        wvt wvt = z0.i;
        Object o = z0.j;
        if (this.V0.k) {
            final qxg h = this.U0.h;
            if (h == null) {
                mvt = mvt.F0;
            }
            else {
                mvt = h.m;
            }
            if (h == null) {
                wvt = this.G0;
            }
            else {
                wvt = h.n;
            }
            final hha[] c = wvt.c;
            final aed$a aed$a = new aed$a();
            final int length = c.length;
            int i = 0;
            int n4 = 0;
            while (i < length) {
                final hha hha = c[i];
                int n5 = n4;
                if (hha != null) {
                    final x8h l0 = ((qvt)hha).g(0).L0;
                    if (l0 == null) {
                        ((tdd$a)aed$a).c((Object)new x8h(new x8h$b[0]));
                        n5 = n4;
                    }
                    else {
                        ((tdd$a)aed$a).c((Object)l0);
                        n5 = 1;
                    }
                }
                ++i;
                n4 = n5;
            }
            if (n4 != 0) {
                o = aed$a.f();
            }
            else {
                final aed$b d0 = aed.D0;
                o = lam.G0;
            }
            if (h != null) {
                final sxg f = h.f;
                if (f.c != n2) {
                    h.f = f.a(n2);
                }
            }
        }
        else if (!((rxg)i$b).equals((Object)z0.b)) {
            mvt = mvt.F0;
            wvt = this.G0;
            o = lam.G0;
        }
        if (b) {
            final m.m$d a1 = this.a1;
            if (a1.d && a1.e != 5) {
                ri4.k(e == 5);
            }
            else {
                a1.a = true;
                a1.d = true;
                a1.e = e;
            }
        }
        return this.Z0.b(i$b, n, n2, n3, this.k(), mvt, wvt, (List)o);
    }
    
    public final boolean u() {
        final qxg j = this.U0.j;
        if (j == null) {
            return false;
        }
        long b;
        if (!j.d) {
            b = 0L;
        }
        else {
            b = j.a.b();
        }
        return b != Long.MIN_VALUE;
    }
    
    public final boolean w() {
        final qxg h = this.U0.h;
        final long e = h.f.e;
        return h.d && (e == -9223372036854775807L || this.Z0.s < e || !this.f0());
    }
    
    public final void y() {
        boolean i;
        if (!this.u()) {
            i = false;
        }
        else {
            final qxg j = this.U0.j;
            final boolean d = j.d;
            final long n = 0L;
            long b;
            if (!d) {
                b = 0L;
            }
            else {
                b = j.a.b();
            }
            final qxg k = this.U0.j;
            long max;
            if (k == null) {
                max = n;
            }
            else {
                max = Math.max(0L, b - (this.n1 - k.o));
            }
            long n2;
            long n3;
            if (j == this.U0.h) {
                n2 = this.n1;
                n3 = j.o;
            }
            else {
                n2 = this.n1 - j.o;
                n3 = j.f.b;
            }
            i = this.H0.i(n2 - n3, max, this.Q0.a().C0);
        }
        this.f1 = i;
        if (i) {
            final qxg l = this.U0.j;
            final long n4 = this.n1;
            ri4.t(l.g());
            l.a.d(n4 - l.o);
        }
        this.k0();
    }
    
    public final void z() {
        final m.m$d a1 = this.a1;
        final ulk z0 = this.Z0;
        final boolean a2 = a1.a | a1.b != z0;
        a1.a = a2;
        a1.b = z0;
        if (a2) {
            final k k = (k)((p4w)this.T0).D0;
            k.K0.i((Runnable)new qpb(k, a1, 3));
            this.a1 = new m.m$d(this.Z0);
        }
    }
}
