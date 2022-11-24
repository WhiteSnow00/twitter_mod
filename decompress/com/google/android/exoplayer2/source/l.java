// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import java.io.FileNotFoundException;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.Loader$b;
import java.io.IOException;
import com.google.android.exoplayer2.drm.DrmSession;
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

public final class l implements h, voa, Loader$a<l.l$a>, Loader$e, o$c
{
    public static final Map<String, String> r1;
    public static final n s1;
    public final Uri F0;
    public final a G0;
    public final d H0;
    public final com.google.android.exoplayer2.upstream.h I0;
    public final j$a J0;
    public final c$a K0;
    public final l.l$b L0;
    public final sx M0;
    public final String N0;
    public final long O0;
    public final Loader P0;
    public final k Q0;
    public final vf6 R0;
    public final x16 S0;
    public final qjt T0;
    public final Handler U0;
    public h$a V0;
    public e5d W0;
    public o[] X0;
    public l.l$d[] Y0;
    public boolean Z0;
    public boolean a1;
    public boolean b1;
    public l.l$e c1;
    public qcp d1;
    public long e1;
    public boolean f1;
    public int g1;
    public boolean h1;
    public boolean i1;
    public int j1;
    public long k1;
    public long l1;
    public long m1;
    public boolean n1;
    public int o1;
    public boolean p1;
    public boolean q1;
    
    static {
        final HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        r1 = Collections.unmodifiableMap((Map<?, ?>)hashMap);
        final n$a n$a = new n$a();
        n$a.a = "icy";
        n$a.k = "application/x-icy";
        s1 = n$a.a();
    }
    
    public l(final Uri f0, final a g0, final k q0, final d h0, final c$a k0, final com.google.android.exoplayer2.upstream.h i0, final j$a j0, final l.l$b l0, final sx m0, final String n0, final int n2) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.K0 = k0;
        this.I0 = i0;
        this.J0 = j0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        this.O0 = n2;
        this.P0 = new Loader("ProgressiveMediaPeriod");
        this.Q0 = q0;
        this.R0 = new vf6();
        this.S0 = new x16((Object)this, 5);
        this.T0 = new qjt((Object)this, 5);
        this.U0 = rnw.l();
        this.Y0 = new l.l$d[0];
        this.X0 = new o[0];
        this.m1 = -9223372036854775807L;
        this.k1 = -1L;
        this.e1 = -9223372036854775807L;
        this.g1 = 1;
    }
    
    public final void A() {
        if (!this.q1 && !this.a1 && this.Z0) {
            if (this.d1 != null) {
                final o[] x0 = this.X0;
                for (int length = x0.length, i = 0; i < length; ++i) {
                    if (x0[i].q() == null) {
                        return;
                    }
                }
                this.R0.b();
                final int length2 = this.X0.length;
                final swt[] array = new swt[length2];
                final boolean[] array2 = new boolean[length2];
                for (int j = 0; j < length2; ++j) {
                    final n q = this.X0[j].q();
                    Objects.requireNonNull(q);
                    final String q2 = q.Q0;
                    final boolean k = rbh.i(q2);
                    final boolean b = k || rbh.k(q2);
                    array2[j] = b;
                    this.b1 |= b;
                    final e5d w0 = this.W0;
                    n a = q;
                    if (w0 != null) {
                        n a2 = null;
                        Label_0272: {
                            if (!k) {
                                a2 = q;
                                if (!this.Y0[j].b) {
                                    break Label_0272;
                                }
                            }
                            final q9h o0 = q.O0;
                            q9h a3;
                            if (o0 == null) {
                                a3 = new q9h(new q9h$b[] { (q9h$b)w0 });
                            }
                            else {
                                a3 = o0.a(new q9h$b[] { (q9h$b)w0 });
                            }
                            final n$a a4 = q.a();
                            a4.i = a3;
                            a2 = a4.a();
                        }
                        a = a2;
                        if (k) {
                            a = a2;
                            if (a2.K0 == -1) {
                                a = a2;
                                if (a2.L0 == -1) {
                                    a = a2;
                                    if (w0.F0 != -1) {
                                        final n$a a5 = a2.a();
                                        a5.f = w0.F0;
                                        a = a5.a();
                                    }
                                }
                            }
                        }
                    }
                    array[j] = new swt(Integer.toString(j), new n[] { a.b(this.H0.a(a)) });
                }
                this.c1 = new l.l$e(new twt(array), array2);
                this.a1 = true;
                final h$a v0 = this.V0;
                Objects.requireNonNull(v0);
                v0.i((h)this);
            }
        }
    }
    
    public final void B(final int n) {
        this.t();
        final l.l$e c1 = this.c1;
        final boolean[] d = c1.d;
        if (!d[n]) {
            final n n2 = c1.a.a(n).H0[0];
            this.J0.b(rbh.h(n2.Q0), n2, 0, (Object)null, this.l1);
            d[n] = true;
        }
    }
    
    public final void C(int i) {
        this.t();
        final boolean[] b = this.c1.b;
        if (this.n1 && b[i]) {
            if (!this.X0[i].s(false)) {
                this.m1 = 0L;
                this.n1 = false;
                this.i1 = true;
                this.l1 = 0L;
                this.o1 = 0;
                final o[] x0 = this.X0;
                int length;
                for (length = x0.length, i = 0; i < length; ++i) {
                    x0[i].y(false);
                }
                final h$a v0 = this.V0;
                Objects.requireNonNull(v0);
                ((p$a)v0).e((p)this);
            }
        }
    }
    
    public final vwt D(final l.l$d l$d) {
        final int length = this.X0.length;
        for (int i = 0; i < length; ++i) {
            if (l$d.equals((Object)this.Y0[i])) {
                return (vwt)this.X0[i];
            }
        }
        final sx m0 = this.M0;
        final d h0 = this.H0;
        final c$a k0 = this.K0;
        Objects.requireNonNull(h0);
        Objects.requireNonNull(k0);
        final o o = new o(m0, h0, k0);
        o.f = (o$c)this;
        final l.l$d[] y0 = this.Y0;
        final int n = length + 1;
        final l.l$d[] y2 = Arrays.copyOf(y0, n);
        y2[length] = l$d;
        final int a = rnw.a;
        this.Y0 = y2;
        final o[] x0 = Arrays.copyOf(this.X0, n);
        x0[length] = o;
        this.X0 = x0;
        return (vwt)o;
    }
    
    public final void E() {
        final l.l$a l$a = new l.l$a(this, this.F0, this.G0, this.Q0, (voa)this, this.R0);
        if (this.a1) {
            omi.p(this.z());
            final long e1 = this.e1;
            if (e1 != -9223372036854775807L && this.m1 > e1) {
                this.p1 = true;
                this.m1 = -9223372036854775807L;
                return;
            }
            final qcp d1 = this.d1;
            Objects.requireNonNull(d1);
            final long b = d1.d(this.m1).a.b;
            final long m1 = this.m1;
            l$a.g.a = b;
            l$a.j = m1;
            l$a.i = true;
            int i = 0;
            l$a.n = false;
            for (o[] x0 = this.X0; i < x0.length; ++i) {
                x0[i].t = this.m1;
            }
            this.m1 = -9223372036854775807L;
        }
        this.o1 = this.w();
        this.J0.n(new c3g(l$a.a, l$a.k, this.P0.g((Loader$d)l$a, (Loader$a)this, ((f)this.I0).b(this.g1))), 1, -1, (n)null, 0, (Object)null, l$a.j, this.e1);
    }
    
    public final boolean F() {
        return this.i1 || this.z();
    }
    
    public final void a(final Loader$d loader$d, final long n, final long n2, final boolean b) {
        final l.l$a l$a = (l.l$a)loader$d;
        final agr c = l$a.c;
        final b k = l$a.k;
        final Uri c2 = c.c;
        final c3g c3g = new c3g(k, c.d);
        Objects.requireNonNull(this.I0);
        this.J0.e(c3g, 1, -1, (n)null, 0, (Object)null, l$a.j, this.e1);
        if (!b) {
            this.u(l$a);
            final o[] x0 = this.X0;
            for (int length = x0.length, i = 0; i < length; ++i) {
                x0[i].y(false);
            }
            if (this.j1 > 0) {
                final h$a v0 = this.V0;
                Objects.requireNonNull(v0);
                ((p$a)v0).e((p)this);
            }
        }
    }
    
    public final boolean b() {
        if (this.P0.c()) {
            final vf6 r0 = this.R0;
            synchronized (r0) {
                boolean a = r0.a;
                monitorexit(r0);
                if (a) {
                    a = true;
                    return a;
                }
            }
        }
        return false;
    }
    
    public final void c() {
        for (final o o : this.X0) {
            o.y(true);
            final DrmSession h = o.h;
            if (h != null) {
                h.b(o.e);
                o.h = null;
                o.g = null;
            }
        }
        final wt2 wt2 = (wt2)this.Q0;
        final qoa b = wt2.b;
        if (b != null) {
            b.release();
            wt2.b = null;
        }
        wt2.c = null;
    }
    
    public final long d() {
        long g;
        if (this.j1 == 0) {
            g = Long.MIN_VALUE;
        }
        else {
            g = this.g();
        }
        return g;
    }
    
    public final void e(final Loader$d loader$d, long y, final long n) {
        final l.l$a l$a = (l.l$a)loader$d;
        if (this.e1 == -9223372036854775807L) {
            final qcp d1 = this.d1;
            if (d1 != null) {
                final boolean f = d1.f();
                y = this.y();
                if (y == Long.MIN_VALUE) {
                    y = 0L;
                }
                else {
                    y += 10000L;
                }
                this.e1 = y;
                ((m)this.L0).w(y, f, this.f1);
            }
        }
        final agr c = l$a.c;
        final b k = l$a.k;
        final Uri c2 = c.c;
        final c3g c3g = new c3g(k, c.d);
        Objects.requireNonNull(this.I0);
        this.J0.h(c3g, 1, -1, (n)null, 0, (Object)null, l$a.j, this.e1);
        this.u(l$a);
        this.p1 = true;
        final h$a v0 = this.V0;
        Objects.requireNonNull(v0);
        ((p$a)v0).e((p)this);
    }
    
    public final boolean f(final long n) {
        if (!this.p1 && !this.P0.b() && !this.n1 && (!this.a1 || this.j1 != 0)) {
            boolean c = this.R0.c();
            if (!this.P0.c()) {
                this.E();
                c = true;
            }
            return c;
        }
        return false;
    }
    
    public final long g() {
        this.t();
        final boolean[] b = this.c1.b;
        if (this.p1) {
            return Long.MIN_VALUE;
        }
        if (this.z()) {
            return this.m1;
        }
        long n3;
        if (this.b1) {
            final int length = this.X0.length;
            int n = 0;
            long n2 = Long.MAX_VALUE;
            while (true) {
                n3 = n2;
                if (n >= length) {
                    break;
                }
                long min = n2;
                if (b[n]) {
                    final o o = this.X0[n];
                    synchronized (o) {
                        final boolean w = o.w;
                        monitorexit(o);
                        min = n2;
                        if (!w) {
                            min = Math.min(n2, this.X0[n].m());
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
        long l1 = y;
        if (y == Long.MIN_VALUE) {
            l1 = this.l1;
        }
        return l1;
    }
    
    public final void h(final long n) {
    }
    
    public final Loader$b i(final Loader$d loader$d, long n, final long n2, final IOException ex, int n3) {
        final l.l$a l$a = (l.l$a)loader$d;
        this.u(l$a);
        final agr c = l$a.c;
        final b k = l$a.k;
        final Uri c2 = c.c;
        final c3g c3g = new c3g(k, c.d);
        rnw.T(l$a.j);
        rnw.T(this.e1);
        final boolean b = ex instanceof ParserException;
        final int n4 = 0;
        Label_0184: {
            Label_0180: {
                if (!b && !(ex instanceof FileNotFoundException) && !(ex instanceof HttpDataSource.CleartextNotPermittedException) && !(ex instanceof Loader$UnexpectedLoaderException)) {
                    final int g0 = DataSourceException.G0;
                    Throwable cause = ex;
                    while (true) {
                        while (cause != null) {
                            if (cause instanceof DataSourceException && ((DataSourceException)cause).F0 == 2008) {
                                final boolean b2 = true;
                                if (b2) {
                                    break Label_0180;
                                }
                                n = Math.min((n3 - 1) * 1000, 5000);
                                break Label_0184;
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
            final int w = this.w();
            if (w > this.o1) {
                n3 = 1;
            }
            else {
                n3 = 0;
            }
            int n5 = 0;
            Label_0375: {
                Label_0372: {
                    if (this.k1 == -1L) {
                        final qcp d1 = this.d1;
                        if (d1 == null || d1.h() == -9223372036854775807L) {
                            if (this.a1 && !this.F()) {
                                this.n1 = true;
                                n5 = n4;
                                break Label_0375;
                            }
                            this.i1 = this.a1;
                            this.l1 = 0L;
                            this.o1 = 0;
                            final o[] x0 = this.X0;
                            for (int length = x0.length, i = 0; i < length; ++i) {
                                x0[i].y(false);
                            }
                            l$a.g.a = 0L;
                            l$a.j = 0L;
                            l$a.i = true;
                            l$a.n = false;
                            break Label_0372;
                        }
                    }
                    this.o1 = w;
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
        this.J0.j(c3g, 1, -1, (n)null, 0, (Object)null, l$a.j, this.e1, ex, b3);
        if (b3) {
            Objects.requireNonNull(this.I0);
        }
        return loader$b;
    }
    
    public final long j(final tha[] array, final boolean[] array2, final mso[] array3, final boolean[] array4, long m) {
        this.t();
        final l.l$e c1 = this.c1;
        final twt a = c1.a;
        final boolean[] c2 = c1.c;
        final int j1 = this.j1;
        final int n = 0;
        final int n2 = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array3[i] != null && (array[i] == null || !array2[i])) {
                final int f0 = ((l.l$c)array3[i]).F0;
                omi.p(c2[f0]);
                --this.j1;
                c2[f0] = false;
                array3[i] = null;
            }
        }
        final boolean b = this.h1 ? (j1 == 0) : (m != 0L);
        int k = 0;
        int n3 = b ? 1 : 0;
        while (k < array.length) {
            int n4 = n3;
            if (array3[k] == null) {
                n4 = n3;
                if (array[k] != null) {
                    final tha tha = array[k];
                    omi.p(((xwt)tha).length() == 1);
                    omi.p(((xwt)tha).i(0) == 0);
                    final int b2 = a.b(((xwt)tha).o());
                    omi.p(c2[b2] ^ true);
                    ++this.j1;
                    c2[b2] = true;
                    array3[k] = (mso)new l.l$c(this, b2);
                    array4[k] = true;
                    if ((n4 = n3) == 0) {
                        final o o = this.X0[b2];
                        if (!o.A(m, true) && o.q + o.s != 0) {
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
        if (this.j1 == 0) {
            this.n1 = false;
            this.i1 = false;
            if (this.P0.c()) {
                final o[] x0 = this.X0;
                for (int length = x0.length, l = n2; l < length; ++l) {
                    x0[l].h();
                }
                this.P0.a();
                n5 = m;
            }
            else {
                final o[] x2 = this.X0;
                final int length2 = x2.length;
                int n6 = 0;
                while (true) {
                    n5 = m;
                    if (n6 >= length2) {
                        break;
                    }
                    x2[n6].y(false);
                    ++n6;
                }
            }
        }
        else {
            n5 = m;
            if (n3 != 0) {
                m = this.m(m);
                int n7 = n;
                while (true) {
                    n5 = m;
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
        this.h1 = true;
        return n5;
    }
    
    public final long k(final long n, final rcp rcp) {
        this.t();
        if (!this.d1.f()) {
            return 0L;
        }
        final qcp$a d = this.d1.d(n);
        return rcp.a(n, d.a.a, d.b.a);
    }
    
    public final void l(final qcp qcp) {
        this.U0.post((Runnable)new opb(this, qcp, 3));
    }
    
    public final long m(long m1) {
        this.t();
        final boolean[] b = this.c1.b;
        if (!this.d1.f()) {
            m1 = 0L;
        }
        final int n = 0;
        this.i1 = false;
        this.l1 = m1;
        if (this.z()) {
            return this.m1 = m1;
        }
        Label_0128: {
            if (this.g1 != 7) {
                final int length = this.X0.length;
                int i = 0;
                while (true) {
                    while (i < length) {
                        if (!this.X0[i].A(m1, false) && (b[i] || !this.b1)) {
                            final boolean b2 = false;
                            if (b2) {
                                return m1;
                            }
                            break Label_0128;
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
        this.n1 = false;
        this.m1 = m1;
        this.p1 = false;
        if (this.P0.c()) {
            final o[] x0 = this.X0;
            for (int length2 = x0.length, j = n; j < length2; ++j) {
                x0[j].h();
            }
            this.P0.a();
        }
        else {
            this.P0.c = null;
            final o[] x2 = this.X0;
            for (int length3 = x2.length, k = 0; k < length3; ++k) {
                x2[k].y(false);
            }
        }
        return m1;
    }
    
    public final long n() {
        if (this.i1 && (this.p1 || this.w() > this.o1)) {
            this.i1 = false;
            return this.l1;
        }
        return -9223372036854775807L;
    }
    
    public final void o(final h$a v0, final long n) {
        this.V0 = v0;
        this.R0.c();
        this.E();
    }
    
    public final void p() {
        this.Z0 = true;
        this.U0.post((Runnable)this.S0);
    }
    
    public final void q() throws IOException {
        this.P0.e(((f)this.I0).b(this.g1));
        if (this.p1 && !this.a1) {
            throw ParserException.a("Loading finished before preparation is complete.", (Throwable)null);
        }
    }
    
    public final vwt r(final int n, final int n2) {
        return this.D(new l.l$d(n, false));
    }
    
    public final void s() {
        this.U0.post((Runnable)this.S0);
    }
    
    @EnsuresNonNull({ "trackState", "seekMap" })
    public final void t() {
        omi.p(this.a1);
        Objects.requireNonNull(this.c1);
        Objects.requireNonNull(this.d1);
    }
    
    public final void u(final l.l$a l$a) {
        if (this.k1 == -1L) {
            this.k1 = l$a.l;
        }
    }
    
    public final twt v() {
        this.t();
        return this.c1.a;
    }
    
    public final int w() {
        final o[] x0 = this.X0;
        final int length = x0.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final o o = x0[i];
            n += o.q + o.p;
            ++i;
        }
        return n;
    }
    
    public final void x(final long n, final boolean b) {
        this.t();
        if (this.z()) {
            return;
        }
        final boolean[] c = this.c1.c;
        for (int length = this.X0.length, i = 0; i < length; ++i) {
            this.X0[i].g(n, b, c[i]);
        }
    }
    
    public final long y() {
        final o[] x0 = this.X0;
        final int length = x0.length;
        long max = Long.MIN_VALUE;
        for (int i = 0; i < length; ++i) {
            max = Math.max(max, x0[i].m());
        }
        return max;
    }
    
    public final boolean z() {
        return this.m1 != -9223372036854775807L;
    }
}
