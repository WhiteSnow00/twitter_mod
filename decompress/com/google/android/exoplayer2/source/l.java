// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import java.io.FileNotFoundException;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.Loader$b;
import java.io.IOException;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.upstream.Loader$d;
import com.google.android.exoplayer2.upstream.f;
import java.util.Arrays;
import java.util.Objects;
import com.google.android.exoplayer2.n$a;
import java.util.Collections;
import java.util.HashMap;
import android.os.Handler;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.drm.c$a;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.upstream.a;
import android.net.Uri;
import com.google.android.exoplayer2.n;
import java.util.Map;
import com.google.android.exoplayer2.upstream.Loader$e;
import com.google.android.exoplayer2.upstream.Loader$a;

public final class l implements h, ooa, Loader$a<l.l$a>, Loader$e, o$c
{
    public static final Map<String, String> o1;
    public static final n p1;
    public final Uri C0;
    public final a D0;
    public final d E0;
    public final com.google.android.exoplayer2.upstream.h F0;
    public final j$a G0;
    public final c$a H0;
    public final l.l$b I0;
    public final qx J0;
    public final String K0;
    public final long L0;
    public final Loader M0;
    public final k N0;
    public final jf6 O0;
    public final h16 P0;
    public final iit Q0;
    public final Handler R0;
    public h$a S0;
    public z4d T0;
    public o[] U0;
    public l.l$d[] V0;
    public boolean W0;
    public boolean X0;
    public boolean Y0;
    public l.l$e Z0;
    public ebp a1;
    public long b1;
    public boolean c1;
    public int d1;
    public boolean e1;
    public boolean f1;
    public int g1;
    public long h1;
    public long i1;
    public long j1;
    public boolean k1;
    public int l1;
    public boolean m1;
    public boolean n1;
    
    static {
        final HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        o1 = Collections.unmodifiableMap((Map<?, ?>)hashMap);
        final n$a n$a = new n$a();
        n$a.a = "icy";
        n$a.k = "application/x-icy";
        p1 = n$a.a();
    }
    
    public l(final Uri c0, final a d0, final k n0, final d e0, final c$a h0, final com.google.android.exoplayer2.upstream.h f0, final j$a g0, final l.l$b i0, final qx j0, final String k0, final int n2) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.H0 = h0;
        this.F0 = f0;
        this.G0 = g0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = n2;
        this.M0 = new Loader("ProgressiveMediaPeriod");
        this.N0 = n0;
        this.O0 = new jf6();
        this.P0 = new h16((Object)this, 5);
        this.Q0 = new iit((Object)this, 5);
        this.R0 = imw.l();
        this.V0 = new l.l$d[0];
        this.U0 = new o[0];
        this.j1 = -9223372036854775807L;
        this.h1 = -1L;
        this.b1 = -9223372036854775807L;
        this.d1 = 1;
    }
    
    public final void A() {
        if (!this.n1 && !this.X0 && this.W0) {
            if (this.a1 != null) {
                final o[] u0 = this.U0;
                for (int length = u0.length, i = 0; i < length; ++i) {
                    if (u0[i].q() == null) {
                        return;
                    }
                }
                this.O0.b();
                final int length2 = this.U0.length;
                final lvt[] array = new lvt[length2];
                final boolean[] array2 = new boolean[length2];
                for (int j = 0; j < length2; ++j) {
                    final n q = this.U0[j].q();
                    Objects.requireNonNull(q);
                    final String n0 = q.N0;
                    final boolean k = zah.i(n0);
                    final boolean b = k || zah.k(n0);
                    array2[j] = b;
                    this.Y0 |= b;
                    final z4d t0 = this.T0;
                    n a = q;
                    if (t0 != null) {
                        n a2 = null;
                        Label_0263: {
                            if (!k) {
                                a2 = q;
                                if (!this.V0[j].b) {
                                    break Label_0263;
                                }
                            }
                            final x8h l0 = q.L0;
                            x8h a3;
                            if (l0 == null) {
                                a3 = new x8h(new x8h$b[] { (x8h$b)t0 });
                            }
                            else {
                                a3 = l0.a(new x8h$b[] { (x8h$b)t0 });
                            }
                            final n$a a4 = q.a();
                            a4.i = a3;
                            a2 = a4.a();
                        }
                        a = a2;
                        if (k) {
                            a = a2;
                            if (a2.H0 == -1) {
                                a = a2;
                                if (a2.I0 == -1) {
                                    a = a2;
                                    if (t0.C0 != -1) {
                                        final n$a a5 = a2.a();
                                        a5.f = t0.C0;
                                        a = a5.a();
                                    }
                                }
                            }
                        }
                    }
                    array[j] = new lvt(Integer.toString(j), new n[] { a.b(this.E0.a(a)) });
                }
                this.Z0 = new l.l$e(new mvt(array), array2);
                this.X0 = true;
                final h$a s0 = this.S0;
                Objects.requireNonNull(s0);
                s0.n((h)this);
            }
        }
    }
    
    public final void B(final int n) {
        this.v();
        final l.l$e z0 = this.Z0;
        final boolean[] d = z0.d;
        if (!d[n]) {
            final n n2 = z0.a.a(n).E0[0];
            this.G0.b(zah.h(n2.N0), n2, 0, (Object)null, this.i1);
            d[n] = true;
        }
    }
    
    public final void C(int i) {
        this.v();
        final boolean[] b = this.Z0.b;
        if (this.k1 && b[i]) {
            if (!this.U0[i].s(false)) {
                this.j1 = 0L;
                this.k1 = false;
                this.f1 = true;
                this.i1 = 0L;
                this.l1 = 0;
                final o[] u0 = this.U0;
                int length;
                for (length = u0.length, i = 0; i < length; ++i) {
                    u0[i].y(false);
                }
                final h$a s0 = this.S0;
                Objects.requireNonNull(s0);
                ((p$a)s0).m((p)this);
            }
        }
    }
    
    public final ovt D(final l.l$d l$d) {
        final int length = this.U0.length;
        for (int i = 0; i < length; ++i) {
            if (l$d.equals((Object)this.V0[i])) {
                return (ovt)this.U0[i];
            }
        }
        final qx j0 = this.J0;
        final d e0 = this.E0;
        final c$a h0 = this.H0;
        Objects.requireNonNull(e0);
        Objects.requireNonNull(h0);
        final o o = new o(j0, e0, h0);
        o.f = (o$c)this;
        final l.l$d[] v0 = this.V0;
        final int n = length + 1;
        final l.l$d[] v2 = Arrays.copyOf(v0, n);
        v2[length] = l$d;
        final int a = imw.a;
        this.V0 = v2;
        final o[] u0 = Arrays.copyOf(this.U0, n);
        u0[length] = o;
        this.U0 = u0;
        return (ovt)o;
    }
    
    public final void E() {
        final l.l$a l$a = new l.l$a(this, this.C0, this.D0, this.N0, (ooa)this, this.O0);
        if (this.X0) {
            ri4.t(this.z());
            final long b1 = this.b1;
            if (b1 != -9223372036854775807L && this.j1 > b1) {
                this.m1 = true;
                this.j1 = -9223372036854775807L;
                return;
            }
            final ebp a1 = this.a1;
            Objects.requireNonNull(a1);
            final long b2 = a1.d(this.j1).a.b;
            final long j1 = this.j1;
            l$a.g.a = b2;
            l$a.j = j1;
            l$a.i = true;
            int i = 0;
            l$a.n = false;
            for (o[] u0 = this.U0; i < u0.length; ++i) {
                u0[i].t = this.j1;
            }
            this.j1 = -9223372036854775807L;
        }
        this.l1 = this.x();
        this.G0.n(new u2g(l$a.a, l$a.k, this.M0.g((Loader$d)l$a, (Loader$a)this, ((f)this.F0).b(this.d1))), 1, -1, (n)null, 0, (Object)null, l$a.j, this.b1);
    }
    
    public final boolean F() {
        return this.f1 || this.z();
    }
    
    public final void a(final Loader$d loader$d, final long n, final long n2, final boolean b) {
        final l.l$a l$a = (l.l$a)loader$d;
        final jer c = l$a.c;
        final b k = l$a.k;
        final Uri c2 = c.c;
        final u2g u2g = new u2g(k, (Map)c.d);
        Objects.requireNonNull(this.F0);
        this.G0.e(u2g, 1, -1, (n)null, 0, (Object)null, l$a.j, this.b1);
        if (!b) {
            this.w(l$a);
            final o[] u0 = this.U0;
            for (int length = u0.length, i = 0; i < length; ++i) {
                u0[i].y(false);
            }
            if (this.g1 > 0) {
                final h$a s0 = this.S0;
                Objects.requireNonNull(s0);
                ((p$a)s0).m((p)this);
            }
        }
    }
    
    public final long b() {
        long e;
        if (this.g1 == 0) {
            e = Long.MIN_VALUE;
        }
        else {
            e = this.e();
        }
        return e;
    }
    
    public final boolean c() {
        if (this.M0.c()) {
            final jf6 o0 = this.O0;
            synchronized (o0) {
                boolean a = o0.a;
                monitorexit(o0);
                if (a) {
                    a = true;
                    return a;
                }
            }
        }
        return false;
    }
    
    public final boolean d(final long n) {
        if (!this.m1 && !this.M0.b() && !this.k1 && (!this.X0 || this.g1 != 0)) {
            boolean c = this.O0.c();
            if (!this.M0.c()) {
                this.E();
                c = true;
            }
            return c;
        }
        return false;
    }
    
    public final long e() {
        this.v();
        final boolean[] b = this.Z0.b;
        if (this.m1) {
            return Long.MIN_VALUE;
        }
        if (this.z()) {
            return this.j1;
        }
        long n3;
        if (this.Y0) {
            final int length = this.U0.length;
            int n = 0;
            long n2 = Long.MAX_VALUE;
            while (true) {
                n3 = n2;
                if (n >= length) {
                    break;
                }
                long min = n2;
                if (b[n]) {
                    final o o = this.U0[n];
                    synchronized (o) {
                        final boolean w = o.w;
                        monitorexit(o);
                        min = n2;
                        if (!w) {
                            min = Math.min(n2, this.U0[n].m());
                        }
                    }
                }
                ++n;
                n2 = min;
            }
        }
        else {
            n3 = Long.MAX_VALUE;
        }
        long y = n3;
        if (n3 == Long.MAX_VALUE) {
            y = this.y();
        }
        long i1 = y;
        if (y == Long.MIN_VALUE) {
            i1 = this.i1;
        }
        return i1;
    }
    
    public final void f(final long n) {
    }
    
    public final long g(final hha[] array, final boolean[] array2, final bro[] array3, final boolean[] array4, long j) {
        this.v();
        final l.l$e z0 = this.Z0;
        final mvt a = z0.a;
        final boolean[] c = z0.c;
        final int g1 = this.g1;
        final int n = 0;
        final int n2 = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array3[i] != null && (array[i] == null || !array2[i])) {
                final int c2 = ((l.l$c)array3[i]).C0;
                ri4.t(c[c2]);
                --this.g1;
                c[c2] = false;
                array3[i] = null;
            }
        }
        final boolean b = this.e1 ? (g1 == 0) : (j != 0L);
        int k = 0;
        int n3 = b ? 1 : 0;
        while (k < array.length) {
            int n4 = n3;
            if (array3[k] == null) {
                n4 = n3;
                if (array[k] != null) {
                    final hha hha = array[k];
                    ri4.t(((qvt)hha).length() == 1);
                    ri4.t(((qvt)hha).i(0) == 0);
                    final int b2 = a.b(((qvt)hha).o());
                    ri4.t(c[b2] ^ true);
                    ++this.g1;
                    c[b2] = true;
                    array3[k] = (bro)new l.l$c(this, b2);
                    array4[k] = true;
                    if ((n4 = n3) == 0) {
                        final o o = this.U0[b2];
                        if (!o.A(j, true) && o.q + o.s != 0) {
                            n4 = 1;
                        }
                        else {
                            n4 = 0;
                        }
                    }
                }
            }
            ++k;
            n3 = n4;
        }
        long n5;
        if (this.g1 == 0) {
            this.k1 = false;
            this.f1 = false;
            if (this.M0.c()) {
                final o[] u0 = this.U0;
                for (int length = u0.length, l = n2; l < length; ++l) {
                    u0[l].h();
                }
                this.M0.a();
                n5 = j;
            }
            else {
                final o[] u2 = this.U0;
                final int length2 = u2.length;
                int n6 = 0;
                while (true) {
                    n5 = j;
                    if (n6 >= length2) {
                        break;
                    }
                    u2[n6].y(false);
                    ++n6;
                }
            }
        }
        else {
            n5 = j;
            if (n3 != 0) {
                j = this.j(j);
                int n7 = n;
                while (true) {
                    n5 = j;
                    if (n7 >= array3.length) {
                        break;
                    }
                    if (array3[n7] != null) {
                        array4[n7] = true;
                    }
                    ++n7;
                }
            }
        }
        this.e1 = true;
        return n5;
    }
    
    public final long h(final long n, final fbp fbp) {
        this.v();
        if (!this.a1.f()) {
            return 0L;
        }
        final ebp$a d = this.a1.d(n);
        return fbp.a(n, d.a.a, d.b.a);
    }
    
    public final void i(final Loader$d loader$d, long y, final long n) {
        final l.l$a l$a = (l.l$a)loader$d;
        if (this.b1 == -9223372036854775807L) {
            final ebp a1 = this.a1;
            if (a1 != null) {
                final boolean f = a1.f();
                y = this.y();
                if (y == Long.MIN_VALUE) {
                    y = 0L;
                }
                else {
                    y += 10000L;
                }
                this.b1 = y;
                ((m)this.I0).w(y, f, this.c1);
            }
        }
        final jer c = l$a.c;
        final b k = l$a.k;
        final Uri c2 = c.c;
        final u2g u2g = new u2g(k, (Map)c.d);
        Objects.requireNonNull(this.F0);
        this.G0.h(u2g, 1, -1, (n)null, 0, (Object)null, l$a.j, this.b1);
        this.w(l$a);
        this.m1 = true;
        final h$a s0 = this.S0;
        Objects.requireNonNull(s0);
        ((p$a)s0).m((p)this);
    }
    
    public final long j(long j1) {
        this.v();
        final boolean[] b = this.Z0.b;
        if (!this.a1.f()) {
            j1 = 0L;
        }
        final int n = 0;
        this.f1 = false;
        this.i1 = j1;
        if (this.z()) {
            return this.j1 = j1;
        }
        Label_0133: {
            if (this.d1 != 7) {
                final int length = this.U0.length;
                int i = 0;
                while (true) {
                    while (i < length) {
                        if (!this.U0[i].A(j1, false) && (b[i] || !this.Y0)) {
                            final boolean b2 = false;
                            if (b2) {
                                return j1;
                            }
                            break Label_0133;
                        }
                        else {
                            ++i;
                        }
                    }
                    final boolean b2 = true;
                    continue;
                }
            }
        }
        this.k1 = false;
        this.j1 = j1;
        this.m1 = false;
        if (this.M0.c()) {
            final o[] u0 = this.U0;
            for (int length2 = u0.length, k = n; k < length2; ++k) {
                u0[k].h();
            }
            this.M0.a();
        }
        else {
            this.M0.c = null;
            final o[] u2 = this.U0;
            for (int length3 = u2.length, l = 0; l < length3; ++l) {
                u2[l].y(false);
            }
        }
        return j1;
    }
    
    public final long k() {
        if (this.f1 && (this.m1 || this.x() > this.l1)) {
            this.f1 = false;
            return this.i1;
        }
        return -9223372036854775807L;
    }
    
    public final void l(final h$a s0, final long n) {
        this.S0 = s0;
        this.O0.c();
        this.E();
    }
    
    public final Loader$b m(final Loader$d loader$d, long n, final long n2, final IOException ex, int n3) {
        final l.l$a l$a = (l.l$a)loader$d;
        this.w(l$a);
        final jer c = l$a.c;
        final b k = l$a.k;
        final Uri c2 = c.c;
        final u2g u2g = new u2g(k, (Map)c.d);
        imw.T(l$a.j);
        imw.T(this.b1);
        final boolean b = ex instanceof ParserException;
        final int n4 = 0;
        Label_0182: {
            Label_0178: {
                if (!b && !(ex instanceof FileNotFoundException) && !(ex instanceof HttpDataSource.CleartextNotPermittedException) && !(ex instanceof Loader$UnexpectedLoaderException)) {
                    final int d0 = DataSourceException.D0;
                    Throwable cause = ex;
                    while (true) {
                        while (cause != null) {
                            if (cause instanceof DataSourceException && ((DataSourceException)cause).C0 == 2008) {
                                final boolean b2 = true;
                                if (b2) {
                                    break Label_0178;
                                }
                                n = Math.min((n3 - 1) * 1000, 5000);
                                break Label_0182;
                            }
                            else {
                                cause = cause.getCause();
                            }
                        }
                        final boolean b2 = false;
                        continue;
                    }
                }
            }
            n = -9223372036854775807L;
        }
        Loader$b loader$b;
        if (n == -9223372036854775807L) {
            loader$b = Loader.f;
        }
        else {
            final int x = this.x();
            if (x > this.l1) {
                n3 = 1;
            }
            else {
                n3 = 0;
            }
            int n5 = 0;
            Label_0373: {
                Label_0370: {
                    if (this.h1 == -1L) {
                        final ebp a1 = this.a1;
                        if (a1 == null || a1.h() == -9223372036854775807L) {
                            if (this.X0 && !this.F()) {
                                this.k1 = true;
                                n5 = n4;
                                break Label_0373;
                            }
                            this.f1 = this.X0;
                            this.i1 = 0L;
                            this.l1 = 0;
                            final o[] u0 = this.U0;
                            for (int length = u0.length, i = 0; i < length; ++i) {
                                u0[i].y(false);
                            }
                            l$a.g.a = 0L;
                            l$a.j = 0L;
                            l$a.i = true;
                            l$a.n = false;
                            break Label_0370;
                        }
                    }
                    this.l1 = x;
                }
                n5 = 1;
            }
            if (n5 != 0) {
                loader$b = new Loader$b(n3, n);
            }
            else {
                loader$b = Loader.e;
            }
        }
        final boolean b3 = loader$b.a() ^ true;
        this.G0.j(u2g, 1, -1, (n)null, 0, (Object)null, l$a.j, this.b1, ex, b3);
        if (b3) {
            Objects.requireNonNull(this.F0);
        }
        return loader$b;
    }
    
    public final void n(final ebp ebp) {
        this.R0.post((Runnable)new rpb((Object)this, (Object)ebp, 3));
    }
    
    public final void o() {
        for (final o o : this.U0) {
            o.y(true);
            final DrmSession h = o.h;
            if (h != null) {
                h.b(o.e);
                o.h = null;
                o.g = null;
            }
        }
        final mt2 mt2 = (mt2)this.N0;
        final joa b = mt2.b;
        if (b != null) {
            b.release();
            mt2.b = null;
        }
        mt2.c = null;
    }
    
    public final void p() throws IOException {
        this.M0.e(((f)this.F0).b(this.d1));
        if (this.m1 && !this.X0) {
            throw ParserException.a("Loading finished before preparation is complete.", (Throwable)null);
        }
    }
    
    public final void q() {
        this.W0 = true;
        this.R0.post((Runnable)this.P0);
    }
    
    public final mvt r() {
        this.v();
        return this.Z0.a;
    }
    
    public final ovt s(final int n, final int n2) {
        return this.D(new l.l$d(n, false));
    }
    
    public final void t() {
        this.R0.post((Runnable)this.P0);
    }
    
    public final void u(final long n, final boolean b) {
        this.v();
        if (this.z()) {
            return;
        }
        final boolean[] c = this.Z0.c;
        for (int length = this.U0.length, i = 0; i < length; ++i) {
            this.U0[i].g(n, b, c[i]);
        }
    }
    
    @EnsuresNonNull({ "trackState", "seekMap" })
    public final void v() {
        ri4.t(this.X0);
        Objects.requireNonNull(this.Z0);
        Objects.requireNonNull(this.a1);
    }
    
    public final void w(final l.l$a l$a) {
        if (this.h1 == -1L) {
            this.h1 = l$a.l;
        }
    }
    
    public final int x() {
        final o[] u0 = this.U0;
        final int length = u0.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final o o = u0[i];
            n += o.q + o.p;
            ++i;
        }
        return n;
    }
    
    public final long y() {
        final o[] u0 = this.U0;
        final int length = u0.length;
        long max = Long.MIN_VALUE;
        for (int i = 0; i < length; ++i) {
            max = Math.max(max, u0[i].m());
        }
        return max;
    }
    
    public final boolean z() {
        return this.j1 != -9223372036854775807L;
    }
}
