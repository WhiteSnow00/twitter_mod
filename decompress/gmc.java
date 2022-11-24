import java.util.LinkedHashMap;
import java.util.AbstractMap;
import com.google.android.exoplayer2.source.o;
import java.io.EOFException;
import com.google.android.exoplayer2.source.p$a;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import com.google.android.exoplayer2.upstream.h$b;
import com.google.android.exoplayer2.upstream.h$c;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.Loader$b;
import java.util.concurrent.atomic.AtomicInteger;
import android.util.Pair;
import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.upstream.f;
import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.source.hls.playlist.c$c;
import com.google.android.exoplayer2.source.hls.playlist.c$d;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.upstream.Loader$d;
import java.util.Objects;
import java.io.IOException;
import android.net.Uri;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import java.util.Iterator;
import com.google.android.exoplayer2.n$a;
import android.util.Log;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import android.util.SparseIntArray;
import java.util.Map;
import android.os.Handler;
import java.util.List;
import java.util.ArrayList;
import com.google.android.exoplayer2.source.j$a;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.h;
import com.google.android.exoplayer2.drm.c$a;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.drm.b;
import java.util.Set;
import com.google.android.exoplayer2.source.o$c;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.upstream.Loader$e;
import com.google.android.exoplayer2.upstream.Loader$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmc implements Loader$a<pa4>, Loader$e, p, voa, o$c
{
    public static final Set<Integer> D1;
    public long A1;
    public com.google.android.exoplayer2.drm.b B1;
    public xlc C1;
    public final String F0;
    public final int G0;
    public final b H0;
    public final tlc I0;
    public final sx J0;
    public final n K0;
    public final com.google.android.exoplayer2.drm.d L0;
    public final c$a M0;
    public final h N0;
    public final Loader O0;
    public final j$a P0;
    public final int Q0;
    public final tlc.b R0;
    public final ArrayList<xlc> S0;
    public final List<xlc> T0;
    public final qjt U0;
    public final um6 V0;
    public final Handler W0;
    public final ArrayList<fmc> X0;
    public final Map<String, com.google.android.exoplayer2.drm.b> Y0;
    public pa4 Z0;
    public d[] a1;
    public int[] b1;
    public Set<Integer> c1;
    public SparseIntArray d1;
    public c e1;
    public int f1;
    public int g1;
    public boolean h1;
    public boolean i1;
    public int j1;
    public n k1;
    public n l1;
    public boolean m1;
    public twt n1;
    public Set<swt> o1;
    public int[] p1;
    public int q1;
    public boolean r1;
    public boolean[] s1;
    public boolean[] t1;
    public long u1;
    public long v1;
    public boolean w1;
    public boolean x1;
    public boolean y1;
    public boolean z1;
    
    static {
        D1 = Collections.unmodifiableSet((Set<? extends Integer>)new HashSet<Integer>(Arrays.asList(1, 2, 5)));
    }
    
    public gmc(final String f0, final int g0, final b h0, final tlc i0, final Map<String, com.google.android.exoplayer2.drm.b> y0, final sx j0, final long n, final n k0, final com.google.android.exoplayer2.drm.d l0, final c$a m0, final h n2, final j$a p13, final int q0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.Y0 = y0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n2;
        this.P0 = p13;
        this.Q0 = q0;
        this.O0 = new Loader("Loader:HlsSampleStreamWrapper");
        this.R0 = new tlc.b();
        this.b1 = new int[0];
        final Set<Integer> d1 = gmc.D1;
        this.c1 = new HashSet(d1.size());
        this.d1 = new SparseIntArray(d1.size());
        this.a1 = new d[0];
        this.t1 = new boolean[0];
        this.s1 = new boolean[0];
        final ArrayList s0 = new ArrayList();
        this.S0 = s0;
        this.T0 = (List<xlc>)Collections.unmodifiableList((List<?>)s0);
        this.X0 = new ArrayList<fmc>();
        this.U0 = new qjt((Object)this, 6);
        this.V0 = new um6((Object)this, 2);
        this.W0 = rnw.l();
        this.u1 = n;
        this.v1 = n;
    }
    
    public static int B(final int n) {
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 1;
    }
    
    public static lm9 u(final int n, final int n2) {
        final StringBuilder sb = new StringBuilder(54);
        sb.append("Unmapped track with id ");
        sb.append(n);
        sb.append(" of type ");
        sb.append(n2);
        Log.w("HlsSampleStreamWrapper", sb.toString());
        return new lm9();
    }
    
    public static n y(final n n, final n n2, final boolean b) {
        if (n == null) {
            return n2;
        }
        final int h = rbh.h(n2.Q0);
        String h2;
        String k;
        if (rnw.q(n.N0, h) == 1) {
            h2 = rnw.r(n.N0, h);
            k = rbh.d(h2);
        }
        else {
            h2 = rbh.b(n.N0, n2.Q0);
            k = n2.Q0;
        }
        final n$a n$a = new n$a(n2);
        n$a.a = n.F0;
        n$a.b = n.G0;
        n$a.c = n.H0;
        n$a.d = n.I0;
        n$a.e = n.J0;
        int k2;
        if (b) {
            k2 = n.K0;
        }
        else {
            k2 = -1;
        }
        n$a.f = k2;
        int l0;
        if (b) {
            l0 = n.L0;
        }
        else {
            l0 = -1;
        }
        n$a.g = l0;
        n$a.h = h2;
        if (h == 2) {
            n$a.p = n.V0;
            n$a.q = n.W0;
            n$a.r = n.X0;
        }
        if (k != null) {
            n$a.k = k;
        }
        final int d1 = n.d1;
        if (d1 != -1 && h == 1) {
            n$a.x = d1;
        }
        final q9h o0 = n.O0;
        if (o0 != null) {
            final q9h o2 = n2.O0;
            q9h b2 = o0;
            if (o2 != null) {
                b2 = o2.b(o0);
            }
            n$a.i = b2;
        }
        return new n(n$a);
    }
    
    public final xlc A() {
        final ArrayList<xlc> s0 = this.S0;
        return s0.get(s0.size() - 1);
    }
    
    public final boolean C() {
        return this.v1 != -9223372036854775807L;
    }
    
    public final void D() {
        if (!this.m1 && this.p1 == null) {
            if (this.h1) {
                final d[] a1 = this.a1;
                final int length = a1.length;
                boolean b = false;
                for (int i = 0; i < length; ++i) {
                    if (a1[i].q() == null) {
                        return;
                    }
                }
                final twt n1 = this.n1;
                if (n1 != null) {
                    final int f0 = n1.F0;
                    Arrays.fill(this.p1 = new int[f0], -1);
                    for (int j = 0; j < f0; ++j) {
                        int n2 = 0;
                        while (true) {
                            final d[] a2 = this.a1;
                            if (n2 >= a2.length) {
                                break;
                            }
                            final n q = a2[n2].q();
                            omi.r((Object)q);
                            final n n3 = this.n1.a(j).H0[0];
                            final String q2 = q.Q0;
                            final String q3 = n3.Q0;
                            final int h = rbh.h(q2);
                            boolean b2 = false;
                            Label_0242: {
                                Label_0240: {
                                    if (h != 3) {
                                        if (h != rbh.h(q3)) {
                                            break Label_0240;
                                        }
                                    }
                                    else {
                                        if (!rnw.a((Object)q2, (Object)q3)) {
                                            break Label_0240;
                                        }
                                        if (("application/cea-608".equals(q2) || "application/cea-708".equals(q2)) && q.i1 != n3.i1) {
                                            break Label_0240;
                                        }
                                    }
                                    b2 = true;
                                    break Label_0242;
                                }
                                b2 = false;
                            }
                            if (b2) {
                                this.p1[j] = n2;
                                break;
                            }
                            ++n2;
                        }
                    }
                    final Iterator<fmc> iterator = this.X0.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().a();
                    }
                }
                else {
                    final int length2 = this.a1.length;
                    int n4 = 0;
                    int n5 = -2;
                    int n6 = -1;
                    while (true) {
                        int n7 = 2;
                        if (n4 >= length2) {
                            break;
                        }
                        final n q4 = this.a1[n4].q();
                        omi.r((Object)q4);
                        final String q5 = q4.Q0;
                        if (!rbh.k(q5)) {
                            if (rbh.i(q5)) {
                                n7 = 1;
                            }
                            else if (rbh.j(q5)) {
                                n7 = 3;
                            }
                            else {
                                n7 = -2;
                            }
                        }
                        int n8;
                        int n9;
                        if (B(n7) > B(n5)) {
                            n8 = n4;
                            n9 = n7;
                        }
                        else {
                            n9 = n5;
                            n8 = n6;
                            if (n7 == n5) {
                                n9 = n5;
                                if ((n8 = n6) != -1) {
                                    n8 = -1;
                                    n9 = n5;
                                }
                            }
                        }
                        ++n4;
                        n5 = n9;
                        n6 = n8;
                    }
                    final swt h2 = this.I0.h;
                    final int f2 = h2.F0;
                    this.q1 = -1;
                    this.p1 = new int[length2];
                    for (int k = 0; k < length2; ++k) {
                        this.p1[k] = k;
                    }
                    final swt[] array = new swt[length2];
                    for (int l = 0; l < length2; ++l) {
                        final n q6 = this.a1[l].q();
                        omi.r((Object)q6);
                        if (l == n6) {
                            final n[] array2 = new n[f2];
                            for (int n10 = 0; n10 < f2; ++n10) {
                                n e;
                                final n n11 = e = h2.H0[n10];
                                if (n5 == 1) {
                                    final n k2 = this.K0;
                                    e = n11;
                                    if (k2 != null) {
                                        e = n11.e(k2);
                                    }
                                }
                                n n12;
                                if (f2 == 1) {
                                    n12 = q6.e(e);
                                }
                                else {
                                    n12 = y(e, q6, true);
                                }
                                array2[n10] = n12;
                            }
                            array[l] = new swt(this.F0, array2);
                            this.q1 = l;
                        }
                        else {
                            n k3;
                            if (n5 == 2 && rbh.i(q6.Q0)) {
                                k3 = this.K0;
                            }
                            else {
                                k3 = null;
                            }
                            final String f3 = this.F0;
                            int n13;
                            if (l < n6) {
                                n13 = l;
                            }
                            else {
                                n13 = l - 1;
                            }
                            final StringBuilder sb = new StringBuilder(l58.g(f3, 18));
                            sb.append(f3);
                            sb.append(":muxed:");
                            sb.append(n13);
                            array[l] = new swt(sb.toString(), new n[] { y(k3, q6, false) });
                        }
                    }
                    this.n1 = this.w(array);
                    if (this.o1 == null) {
                        b = true;
                    }
                    omi.p(b);
                    this.o1 = Collections.emptySet();
                    this.i1 = true;
                    ((zlc)this.H0).r();
                }
            }
        }
    }
    
    public final void E() throws IOException {
        this.O0.d();
        final tlc i0 = this.I0;
        final BehindLiveWindowException n = i0.n;
        if (n == null) {
            final Uri o = i0.o;
            if (o != null && i0.s) {
                i0.g.c(o);
            }
            return;
        }
        throw n;
    }
    
    public final void F(final swt[] array, final int... array2) {
        this.n1 = this.w(array);
        this.o1 = new HashSet<swt>();
        for (int length = array2.length, i = 0; i < length; ++i) {
            this.o1.add(this.n1.a(array2[i]));
        }
        this.q1 = 0;
        final Handler w0 = this.W0;
        final b h0 = this.H0;
        Objects.requireNonNull(h0);
        w0.post((Runnable)new x16((Object)h0, 6));
        this.i1 = true;
    }
    
    public final void G() {
        final d[] a1 = this.a1;
        for (int length = a1.length, i = 0; i < length; ++i) {
            a1[i].y(this.w1);
        }
        this.w1 = false;
    }
    
    public final boolean H(final long v1, final boolean b) {
        this.u1 = v1;
        if (this.C()) {
            this.v1 = v1;
            return true;
        }
        final boolean h1 = this.h1;
        final int n = 0;
        Label_0108: {
            if (h1 && !b) {
                final int length = this.a1.length;
                int i = 0;
                while (true) {
                    while (i < length) {
                        if (!this.a1[i].A(v1, false) && (this.t1[i] || !this.r1)) {
                            final boolean b2 = false;
                            if (b2) {
                                return false;
                            }
                            break Label_0108;
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
        this.v1 = v1;
        this.y1 = false;
        this.S0.clear();
        if (this.O0.c()) {
            if (this.h1) {
                final d[] a1 = this.a1;
                for (int length2 = a1.length, j = n; j < length2; ++j) {
                    a1[j].h();
                }
            }
            this.O0.a();
        }
        else {
            this.O0.c = null;
            this.G();
        }
        return true;
    }
    
    public final void I(final long n) {
        if (this.A1 != n) {
            this.A1 = n;
            for (final d d : this.a1) {
                if (d.F != n) {
                    d.F = n;
                    d.z = true;
                }
            }
        }
    }
    
    public final void a(final Loader$d loader$d, long a, final long n, final boolean b) {
        final pa4 pa4 = (pa4)loader$d;
        this.Z0 = null;
        a = pa4.a;
        final com.google.android.exoplayer2.upstream.b b2 = pa4.b;
        final agr i = pa4.i;
        final Uri c = i.c;
        final c3g c3g = new c3g(b2, i.d);
        Objects.requireNonNull(this.N0);
        this.P0.e(c3g, pa4.c, this.G0, pa4.d, pa4.e, pa4.f, pa4.g, pa4.h);
        if (!b) {
            if (this.C() || this.j1 == 0) {
                this.G();
            }
            if (this.j1 > 0) {
                ((zlc)this.H0).e((p)this);
            }
        }
    }
    
    public final boolean b() {
        return this.O0.c();
    }
    
    public final void c() {
        for (final d d : this.a1) {
            d.y(true);
            final DrmSession h = d.h;
            if (h != null) {
                h.b(d.e);
                d.h = null;
                d.g = null;
            }
        }
    }
    
    public final long d() {
        if (this.C()) {
            return this.v1;
        }
        long h;
        if (this.y1) {
            h = Long.MIN_VALUE;
        }
        else {
            h = ((pa4)this.A()).h;
        }
        return h;
    }
    
    public final void e(final Loader$d loader$d, long a, final long n) {
        final pa4 pa4 = (pa4)loader$d;
        this.Z0 = null;
        final tlc i0 = this.I0;
        Objects.requireNonNull(i0);
        if (pa4 instanceof tlc$a) {
            final tlc$a tlc$a = (tlc$a)pa4;
            i0.m = ((v78)tlc$a).j;
            final ctb j = i0.j;
            final Uri a2 = ((pa4)tlc$a).b.a;
            final byte[] l = tlc$a.l;
            Objects.requireNonNull(l);
            final btb a3 = j.a;
            Objects.requireNonNull(a2);
            final byte[] array = ((AbstractMap<Uri, byte[]>)a3).put(a2, l);
        }
        a = pa4.a;
        final com.google.android.exoplayer2.upstream.b b = pa4.b;
        final agr k = pa4.i;
        final Uri c = k.c;
        final c3g c3g = new c3g(b, k.d);
        Objects.requireNonNull(this.N0);
        this.P0.h(c3g, pa4.c, this.G0, pa4.d, pa4.e, pa4.f, pa4.g, pa4.h);
        if (!this.i1) {
            this.f(this.u1);
        }
        else {
            ((zlc)this.H0).e((p)this);
        }
    }
    
    public final boolean f(long g) {
        if (this.y1 || this.O0.c() || this.O0.b()) {
            return false;
        }
        Object t0;
        long n2;
        if (this.C()) {
            final List<Object> emptyList = Collections.emptyList();
            final long v1 = this.v1;
            final d[] a1 = this.a1;
            final int length = a1.length;
            int n = 0;
            while (true) {
                t0 = emptyList;
                n2 = v1;
                if (n >= length) {
                    break;
                }
                a1[n].t = this.v1;
                ++n;
            }
        }
        else {
            t0 = this.T0;
            final xlc a2 = this.A();
            if (a2.H) {
                n2 = ((pa4)a2).h;
            }
            else {
                n2 = Math.max(this.u1, ((pa4)a2).g);
            }
        }
        final tlc.b r0 = this.R0;
        r0.a = null;
        r0.b = false;
        r0.c = null;
        final tlc i0 = this.I0;
        final boolean b = this.i1 || !((List)t0).isEmpty();
        final tlc.b r2 = this.R0;
        Objects.requireNonNull(i0);
        xlc xlc;
        if (((List)t0).isEmpty()) {
            xlc = null;
        }
        else {
            xlc = (xlc)tpz.F((Iterable)t0);
        }
        int a3;
        if (xlc == null) {
            a3 = -1;
        }
        else {
            a3 = i0.h.a(((pa4)xlc).d);
        }
        long max = n2 - g;
        final long r3 = i0.r;
        long max2;
        if (r3 != -9223372036854775807L) {
            max2 = r3 - g;
        }
        else {
            max2 = -9223372036854775807L;
        }
        if (xlc != null && !i0.p) {
            final long n3 = ((pa4)xlc).h - ((pa4)xlc).g;
            final long n4 = max = Math.max(0L, max - n3);
            if (max2 != -9223372036854775807L) {
                max2 = Math.max(0L, max2 - n3);
                max = n4;
            }
        }
        i0.q.n(g, max, max2, (List<? extends fsg>)t0, i0.a(xlc, n2));
        int q = i0.q.q();
        final boolean b2 = a3 != q;
        Uri uri = i0.e[q];
        Label_0500: {
            if (!i0.g.j(uri)) {
                r2.c = uri;
                i0.s &= uri.equals((Object)i0.o);
                i0.o = uri;
            }
            else {
                com.google.android.exoplayer2.source.hls.playlist.c c = i0.g.o(uri, true);
                Objects.requireNonNull(c);
                i0.p = c.c;
                if (c.o) {
                    g = -9223372036854775807L;
                }
                else {
                    g = c.h + c.u - i0.g.d();
                }
                i0.r = g;
                g = c.h - i0.g.d();
                final Pair<Long, Integer> c2 = i0.c(xlc, b2, c, g, n2);
                final long longValue = (long)c2.first;
                final int intValue = (int)c2.second;
                long longValue2;
                int n5;
                if (longValue < c.k) {
                    if (xlc != null && b2) {
                        uri = i0.e[a3];
                        c = i0.g.o(uri, true);
                        Objects.requireNonNull(c);
                        g = c.h - i0.g.d();
                        final Pair<Long, Integer> c3 = i0.c(xlc, false, c, g, n2);
                        longValue2 = (long)c3.first;
                        final int intValue2 = (int)c3.second;
                        q = a3;
                        n5 = intValue2;
                    }
                    else {
                        n5 = intValue;
                        longValue2 = longValue;
                    }
                }
                else {
                    longValue2 = longValue;
                    n5 = intValue;
                }
                final long k = c.k;
                if (longValue2 < k) {
                    i0.n = new BehindLiveWindowException();
                }
                else {
                    final int n6 = (int)(longValue2 - k);
                    Object o = null;
                    Label_1057: {
                        Label_1054: {
                            if (n6 == c.r.size()) {
                                if (n5 == -1) {
                                    n5 = 0;
                                }
                                if (n5 >= c.s.size()) {
                                    break Label_1054;
                                }
                                o = new tlc.e((c$d)c.s.get(n5), longValue2, n5);
                            }
                            else {
                                final c$c c$c = (c$c)c.r.get(n6);
                                if (n5 == -1) {
                                    o = new tlc.e((c$d)c$c, longValue2, -1);
                                }
                                else if (n5 < c$c.R0.size()) {
                                    o = new tlc.e((c$d)c$c.R0.get(n5), longValue2, n5);
                                }
                                else {
                                    final int n7 = n6 + 1;
                                    if (n7 < c.r.size()) {
                                        o = new tlc.e((c$d)c.r.get(n7), longValue2 + 1L, -1);
                                    }
                                    else {
                                        if (c.s.isEmpty()) {
                                            break Label_1054;
                                        }
                                        o = new tlc.e((c$d)c.s.get(0), longValue2 + 1L, 0);
                                    }
                                }
                            }
                            break Label_1057;
                        }
                        o = null;
                    }
                    Object o2;
                    if (o == null) {
                        if (!c.o) {
                            r2.c = uri;
                            i0.s &= uri.equals((Object)i0.o);
                            i0.o = uri;
                            break Label_0500;
                        }
                        if (b || c.r.isEmpty()) {
                            r2.b = true;
                            break Label_0500;
                        }
                        o2 = new tlc.e((c$d)tpz.F(c.r), c.k + c.r.size() - 1L, -1);
                    }
                    else {
                        o2 = o;
                    }
                    i0.s = false;
                    i0.o = null;
                    final c$c g2 = ((tlc.e)o2).a.G0;
                    Uri d = null;
                    Label_1245: {
                        if (g2 != null) {
                            final String l0 = ((c$d)g2).L0;
                            if (l0 != null) {
                                d = n6w.d(c.a, l0);
                                break Label_1245;
                            }
                        }
                        d = null;
                    }
                    final pa4 d2 = i0.d(d, q);
                    r2.a = d2;
                    if (d2 == null) {
                        final c$d a4 = ((tlc.e)o2).a;
                        Uri d3 = null;
                        Label_1316: {
                            if (a4 != null) {
                                final String l2 = a4.L0;
                                if (l2 != null) {
                                    d3 = n6w.d(c.a, l2);
                                    break Label_1316;
                                }
                            }
                            d3 = null;
                        }
                        final pa4 d4 = i0.d(d3, q);
                        r2.a = d4;
                        if (d4 == null) {
                            final AtomicInteger j = xlc.L;
                            boolean b3 = false;
                            Label_1487: {
                                if (xlc != null) {
                                    if (!uri.equals((Object)xlc.m) || !xlc.H) {
                                        final c$d a5 = ((tlc.e)o2).a;
                                        final long j2 = a5.J0;
                                        boolean c4;
                                        if (a5 instanceof com.google.android.exoplayer2.source.hls.playlist.c$a) {
                                            c4 = (((com.google.android.exoplayer2.source.hls.playlist.c$a)a5).Q0 || (((tlc.e)o2).c == 0 && c.c));
                                        }
                                        else {
                                            c4 = c.c;
                                        }
                                        b3 = (!c4 || j2 + g < ((pa4)xlc).h);
                                        break Label_1487;
                                    }
                                }
                                b3 = false;
                            }
                            if (!b3 || !((tlc.e)o2).d) {
                                final vlc a6 = i0.a;
                                Object b4 = i0.b;
                                final n n8 = i0.f[q];
                                final List<n> m = i0.i;
                                final int s = i0.q.s();
                                final Object k2 = i0.q.k();
                                final boolean l3 = i0.l;
                                final sog d5 = i0.d;
                                final ctb j3 = i0.j;
                                Objects.requireNonNull(j3);
                                byte[] array;
                                if (d3 == null) {
                                    array = null;
                                }
                                else {
                                    array = ((LinkedHashMap<K, byte[]>)j3.a).get(d3);
                                }
                                final ctb j4 = i0.j;
                                Objects.requireNonNull(j4);
                                byte[] array2;
                                if (d == null) {
                                    array2 = null;
                                }
                                else {
                                    array2 = ((LinkedHashMap<K, byte[]>)j4.a).get(d);
                                }
                                final cok k3 = i0.k;
                                final c$d a7 = ((tlc.e)o2).a;
                                final Map<Object, Object> emptyMap = Collections.emptyMap();
                                final Uri d6 = n6w.d(c.a, a7.F0);
                                final long n9 = a7.N0;
                                final long o3 = a7.O0;
                                int n10;
                                if (((tlc.e)o2).d) {
                                    n10 = 8;
                                }
                                else {
                                    n10 = 0;
                                }
                                if (d6 == null) {
                                    throw new IllegalStateException("The uri must be set.");
                                }
                                final com.google.android.exoplayer2.upstream.b b5 = new com.google.android.exoplayer2.upstream.b(d6, 0L, 1, (byte[])null, (Map)emptyMap, n9, o3, (String)null, n10, (Object)null);
                                final boolean b6 = array != null;
                                byte[] d7;
                                if (b6) {
                                    final String m2 = a7.M0;
                                    Objects.requireNonNull(m2);
                                    d7 = xlc.d(m2);
                                }
                                else {
                                    d7 = null;
                                }
                                Object o4;
                                if (array != null) {
                                    Objects.requireNonNull(d7);
                                    o4 = new zv((a)b4, array, d7);
                                }
                                else {
                                    o4 = b4;
                                }
                                final c$c g3 = a7.G0;
                                boolean b7;
                                com.google.android.exoplayer2.upstream.b b9;
                                a a8;
                                if (g3 != null) {
                                    b7 = (array2 != null);
                                    byte[] d8;
                                    if (b7) {
                                        final String m3 = ((c$d)g3).M0;
                                        Objects.requireNonNull(m3);
                                        d8 = xlc.d(m3);
                                    }
                                    else {
                                        d8 = null;
                                    }
                                    final com.google.android.exoplayer2.upstream.b b8 = new com.google.android.exoplayer2.upstream.b(n6w.d(c.a, ((c$d)g3).F0), ((c$d)g3).N0, ((c$d)g3).O0);
                                    if (array2 != null) {
                                        Objects.requireNonNull(d8);
                                        b4 = new zv((a)b4, array2, d8);
                                    }
                                    b9 = b8;
                                    a8 = (a)b4;
                                }
                                else {
                                    b9 = null;
                                    a8 = null;
                                    b7 = false;
                                }
                                g += a7.J0;
                                final long h0 = a7.H0;
                                final int n11 = c.j + a7.I0;
                                g5d g5d;
                                ylc ylc;
                                gxj gxj;
                                if (xlc != null) {
                                    final com.google.android.exoplayer2.upstream.b q2 = xlc.q;
                                    final boolean b10 = b9 == q2 || (b9 != null && q2 != null && b9.a.equals((Object)q2.a) && b9.f == xlc.q.f);
                                    final boolean b11 = uri.equals((Object)xlc.m) && xlc.H;
                                    final g5d y = xlc.y;
                                    final gxj z = xlc.z;
                                    ylc c5;
                                    if (b10 && b11 && !xlc.J && xlc.l == n11) {
                                        c5 = xlc.C;
                                    }
                                    else {
                                        c5 = null;
                                    }
                                    g5d = y;
                                    ylc = c5;
                                    gxj = z;
                                }
                                else {
                                    g5d = new g5d();
                                    gxj = new gxj(10);
                                    ylc = null;
                                }
                                final long b12 = ((tlc.e)o2).b;
                                final int c6 = ((tlc.e)o2).c;
                                final boolean d9 = ((tlc.e)o2).d;
                                final boolean p = a7.P0;
                                tat tat;
                                if ((tat = (tat)((SparseArray)d5.F0).get(n11)) == null) {
                                    tat = new tat(9223372036854775806L);
                                    ((SparseArray)d5.F0).put(n11, (Object)tat);
                                }
                                r2.a = (pa4)new xlc(a6, (a)o4, b5, n8, b6, a8, b9, b7, uri, (List)m, s, k2, g, g + h0, b12, c6, d9 ^ true, n11, p, l3, tat, a7.K0, ylc, g5d, gxj, b3, k3);
                            }
                        }
                    }
                }
            }
        }
        final tlc.b r4 = this.R0;
        final boolean b13 = r4.b;
        final pa4 a9 = r4.a;
        final Uri c7 = r4.c;
        if (b13) {
            this.v1 = -9223372036854775807L;
            return this.y1 = true;
        }
        if (a9 == null) {
            if (c7 != null) {
                ((zlc)this.H0).G0.g(c7);
            }
            return false;
        }
        if (a9 instanceof xlc) {
            final xlc c8 = (xlc)a9;
            this.C1 = c8;
            this.k1 = ((pa4)c8).d;
            this.v1 = -9223372036854775807L;
            this.S0.add(c8);
            final eed.b g4 = eed.G0;
            iuk.y(4, "initialCapacity");
            Object[] array3 = new Object[4];
            final d[] a10 = this.a1;
            final int length2 = a10.length;
            int n12 = 0;
            int n14;
            Object[] copy;
            for (int n13 = 0; n13 < length2; ++n13, n12 = n14, array3 = copy) {
                final d d10 = a10[n13];
                final Integer value = d10.q + d10.p;
                Objects.requireNonNull(value);
                n14 = n12 + 1;
                copy = array3;
                if (array3.length < n14) {
                    copy = Arrays.copyOf(array3, xdd$b.b(array3.length, n14));
                }
                copy[n12] = value;
            }
            final eed<Object> o5 = eed.o(array3, n12);
            c8.D = this;
            c8.I = o5;
            for (final d d11 : this.a1) {
                Objects.requireNonNull(d11);
                d11.C = c8.k;
                if (c8.n) {
                    d11.G = true;
                }
            }
        }
        this.Z0 = a9;
        g = this.O0.g((Loader$d)a9, (Loader$a)this, ((f)this.N0).b(a9.c));
        this.P0.n(new c3g(a9.a, a9.b, g), a9.c, this.G0, a9.d, a9.e, a9.f, a9.g, a9.h);
        return true;
    }
    
    public final long g() {
        if (this.y1) {
            return Long.MIN_VALUE;
        }
        if (this.C()) {
            return this.v1;
        }
        final long u1 = this.u1;
        xlc a = this.A();
        if (!a.H) {
            if (this.S0.size() > 1) {
                final ArrayList<xlc> s0 = this.S0;
                a = s0.get(s0.size() - 2);
            }
            else {
                a = null;
            }
        }
        long n = u1;
        if (a != null) {
            n = Math.max(u1, ((pa4)a).h);
        }
        long n2 = n;
        if (this.h1) {
            final d[] a2 = this.a1;
            final int length = a2.length;
            int n3 = 0;
            while (true) {
                n2 = n;
                if (n3 >= length) {
                    break;
                }
                n = Math.max(n, a2[n3].m());
                ++n3;
            }
        }
        return n2;
    }
    
    public final void h(final long n) {
        if (!this.O0.b()) {
            if (!this.C()) {
                if (this.O0.c()) {
                    Objects.requireNonNull(this.Z0);
                    final tlc i0 = this.I0;
                    if (i0.n == null) {
                        i0.q.b();
                    }
                    return;
                }
                int j;
                int n2;
                for (j = this.T0.size(); j > 0; j = n2) {
                    final tlc i2 = this.I0;
                    final List<xlc> t0 = this.T0;
                    n2 = j - 1;
                    if (i2.b(t0.get(n2)) != 2) {
                        break;
                    }
                }
                if (j < this.T0.size()) {
                    this.z(j);
                }
                final tlc i3 = this.I0;
                final List<xlc> t2 = this.T0;
                int n3;
                if (i3.n == null && ((xwt)i3.q).length() >= 2) {
                    n3 = i3.q.p(n, (List<? extends fsg>)t2);
                }
                else {
                    n3 = t2.size();
                }
                if (n3 < this.S0.size()) {
                    this.z(n3);
                }
            }
        }
    }
    
    public final Loader$b i(final Loader$d loader$d, long n, long b, final IOException ex, final int n2) {
        final pa4 pa4 = (pa4)loader$d;
        final boolean b2 = pa4 instanceof xlc;
        if (b2 && !((xlc)pa4).K && ex instanceof HttpDataSource.InvalidResponseCodeException) {
            final int j0 = ((HttpDataSource.InvalidResponseCodeException)ex).J0;
            if (j0 == 410 || j0 == 404) {
                return Loader.d;
            }
        }
        n = pa4.i.b;
        final com.google.android.exoplayer2.upstream.b b3 = pa4.b;
        final agr i = pa4.i;
        final Uri c = i.c;
        final c3g c3g = new c3g(b3, i.d);
        rnw.T(pa4.g);
        rnw.T(pa4.h);
        final h$c h$c = new h$c(ex, n2);
        final h$b a = ((f)this.N0).a(bxt.a(this.I0.q), h$c);
        boolean b4 = false;
        boolean e;
        if (a != null && a.a == 2) {
            final tlc i2 = this.I0;
            b = a.b;
            final tha q = i2.q;
            e = q.e(((xwt)q).m(i2.h.a(pa4.d)), b);
        }
        else {
            e = false;
        }
        Loader$b loader$b;
        if (e) {
            if (b2 && n == 0L) {
                final ArrayList<xlc> s0 = this.S0;
                if ((xlc)s0.remove(s0.size() - 1) == pa4) {
                    b4 = true;
                }
                omi.p(b4);
                if (this.S0.isEmpty()) {
                    this.v1 = this.u1;
                }
                else {
                    ((xlc)tpz.F(this.S0)).J = true;
                }
            }
            loader$b = Loader.e;
        }
        else {
            n = ((f)this.N0).c(h$c);
            if (n != -9223372036854775807L) {
                loader$b = new Loader$b(0, n);
            }
            else {
                loader$b = Loader.f;
            }
        }
        final boolean b5 = loader$b.a() ^ true;
        this.P0.j(c3g, pa4.c, this.G0, pa4.d, pa4.e, pa4.f, pa4.g, pa4.h, ex, b5);
        if (b5) {
            this.Z0 = null;
            Objects.requireNonNull(this.N0);
        }
        if (e) {
            if (!this.i1) {
                this.f(this.u1);
            }
            else {
                ((zlc)this.H0).e((p)this);
            }
        }
        return loader$b;
    }
    
    public final void l(final qcp qcp) {
    }
    
    public final void p() {
        this.z1 = true;
        this.W0.post((Runnable)this.V0);
    }
    
    public final vwt r(int a, final int f1) {
        final Set<Integer> d1 = gmc.D1;
        final boolean contains = d1.contains(f1);
        boolean b = false;
        Object u = null;
        Label_0153: {
            if (contains) {
                omi.m(d1.contains(f1));
                final int value = this.d1.get(f1, -1);
                if (value != -1) {
                    if (this.c1.add(f1)) {
                        this.b1[value] = a;
                    }
                    if (this.b1[value] == a) {
                        u = this.a1[value];
                        break Label_0153;
                    }
                    u = u(a, f1);
                    break Label_0153;
                }
            }
            else {
                int n = 0;
                while (true) {
                    final d[] a2 = this.a1;
                    if (n >= a2.length) {
                        break;
                    }
                    if (this.b1[n] == a) {
                        u = a2[n];
                        break Label_0153;
                    }
                    ++n;
                }
            }
            u = null;
        }
        d d2 = (d)u;
        if (u == null) {
            if (this.z1) {
                return (vwt)u(a, f1);
            }
            final int length = this.a1.length;
            if (f1 == 1 || f1 == 2) {
                b = true;
            }
            d2 = new d(this.J0, this.L0, this.M0, this.Y0, null);
            d2.t = this.u1;
            if (b) {
                d2.I = this.B1;
                d2.z = true;
            }
            final long a3 = this.A1;
            if (d2.F != a3) {
                d2.F = a3;
                d2.z = true;
            }
            final xlc c1 = this.C1;
            if (c1 != null) {
                d2.C = c1.k;
            }
            d2.f = (o$c)this;
            final int[] b2 = this.b1;
            final int n2 = length + 1;
            (this.b1 = Arrays.copyOf(b2, n2))[length] = a;
            final d[] a4 = this.a1;
            a = rnw.a;
            final d[] copy = Arrays.copyOf(a4, a4.length + 1);
            copy[a4.length] = d2;
            this.a1 = copy;
            final boolean[] copy2 = Arrays.copyOf(this.t1, n2);
            (this.t1 = copy2)[length] = b;
            this.r1 |= copy2[length];
            this.c1.add(f1);
            this.d1.append(f1, length);
            if (B(f1) > B(this.f1)) {
                this.g1 = length;
                this.f1 = f1;
            }
            this.s1 = Arrays.copyOf(this.s1, n2);
        }
        if (f1 == 5) {
            if (this.e1 == null) {
                this.e1 = new c((vwt)d2, this.Q0);
            }
            return (vwt)this.e1;
        }
        return (vwt)d2;
    }
    
    public final void s() {
        this.W0.post((Runnable)this.U0);
    }
    
    @EnsuresNonNull({ "trackGroups", "optionalTrackGroups" })
    public final void t() {
        omi.p(this.i1);
        Objects.requireNonNull(this.n1);
        Objects.requireNonNull(this.o1);
    }
    
    public final twt w(final swt[] array) {
        for (int i = 0; i < array.length; ++i) {
            final swt swt = array[i];
            final n[] array2 = new n[swt.F0];
            for (int j = 0; j < swt.F0; ++j) {
                final n n = swt.H0[j];
                array2[j] = n.b(this.L0.a(n));
            }
            array[i] = new swt(swt.G0, array2);
        }
        return new twt(array);
    }
    
    public final void z(int i) {
        omi.p(this.O0.c() ^ true);
    Label_0144:
        while (true) {
            while (i < this.S0.size()) {
                int j = i;
                while (true) {
                Label_0053:
                    while (true) {
                        while (j < this.S0.size()) {
                            if (this.S0.get(j).n) {
                                final boolean b = false;
                                if (b) {
                                    break Label_0144;
                                }
                                ++i;
                                continue Label_0144;
                            }
                            else {
                                ++j;
                            }
                        }
                        final xlc xlc = this.S0.get(i);
                        for (int k = 0; k < this.a1.length; ++k) {
                            final int e = xlc.e(k);
                            final d d = this.a1[k];
                            if (d.q + d.s > e) {
                                continue Label_0053;
                            }
                        }
                        break;
                    }
                    final boolean b = true;
                    continue;
                }
                if (i == -1) {
                    return;
                }
                final long h = ((pa4)this.A()).h;
                final xlc xlc2 = this.S0.get(i);
                final ArrayList<xlc> s0 = this.S0;
                rnw.M((List)s0, i, s0.size());
                int e2;
                d d2;
                com.google.android.exoplayer2.source.n a;
                long l;
                com.google.android.exoplayer2.source.n$a n$a;
                com.google.android.exoplayer2.source.n$a d3;
                com.google.android.exoplayer2.source.n$a n$a2;
                com.google.android.exoplayer2.source.n$a f;
                com.google.android.exoplayer2.source.n$a f2;
                for (i = 0; i < this.a1.length; ++i) {
                    e2 = xlc2.e(i);
                    d2 = this.a1[i];
                    a = d2.a;
                    l = d2.j(e2);
                    omi.m(l <= a.g);
                    a.g = l;
                    if (l != 0L && l != (n$a = a.d).a) {
                        while (a.g > n$a.b) {
                            n$a = n$a.d;
                        }
                        d3 = n$a.d;
                        Objects.requireNonNull(d3);
                        a.a(d3);
                        n$a2 = new com.google.android.exoplayer2.source.n$a(n$a.b, a.b);
                        n$a.d = n$a2;
                        f = n$a;
                        if (a.g == n$a.b) {
                            f = n$a2;
                        }
                        a.f = f;
                        if (a.e == d3) {
                            a.e = n$a2;
                        }
                    }
                    else {
                        a.a(a.d);
                        f2 = new com.google.android.exoplayer2.source.n$a(a.g, a.b);
                        a.d = f2;
                        a.e = f2;
                        a.f = f2;
                    }
                }
                if (this.S0.isEmpty()) {
                    this.v1 = this.u1;
                }
                else {
                    ((xlc)tpz.F(this.S0)).J = true;
                }
                this.y1 = false;
                final j$a p = this.P0;
                p.p(new axg(1, this.f1, (n)null, 3, (Object)null, p.a(((pa4)xlc2).g), p.a(h)));
                return;
            }
            i = -1;
            continue Label_0144;
        }
    }
    
    public interface b extends p$a<gmc>
    {
    }
    
    public static final class c implements vwt
    {
        public static final n g;
        public static final n h;
        public final ada a;
        public final vwt b;
        public final n c;
        public n d;
        public byte[] e;
        public int f;
        
        static {
            final n$a n$a = new n$a();
            n$a.k = "application/id3";
            g = n$a.a();
            final n$a n$a2 = new n$a();
            n$a2.k = "application/x-emsg";
            h = n$a2.a();
        }
        
        public c(final vwt b, final int n) {
            this.a = new ada();
            this.b = b;
            if (n != 1) {
                if (n != 3) {
                    throw new IllegalArgumentException(go9.p(33, "Unknown metadataType: ", n));
                }
                this.c = c.h;
            }
            else {
                this.c = c.g;
            }
            this.e = new byte[0];
            this.f = 0;
        }
        
        public final void a(final gxj gxj, final int n) {
            final int n2 = this.f + n;
            final byte[] e = this.e;
            if (e.length < n2) {
                this.e = Arrays.copyOf(e, n2 / 2 + n2);
            }
            gxj.d(this.e, this.f, n);
            this.f += n;
        }
        
        public final void b(final long n, final int n2, int n3, final int f, final vwt$a vwt$a) {
            Objects.requireNonNull(this.d);
            final int n4 = this.f - f;
            gxj gxj = new gxj(Arrays.copyOfRange(this.e, n4 - n3, n4));
            final byte[] e = this.e;
            System.arraycopy(e, n4, e, 0, f);
            this.f = f;
            if (!rnw.a((Object)this.d.Q0, (Object)this.c.Q0)) {
                if (!"application/x-emsg".equals(this.d.Q0)) {
                    final String value = String.valueOf(this.d.Q0);
                    String concat;
                    if (value.length() != 0) {
                        concat = "Ignoring sample for unsupported format: ".concat(value);
                    }
                    else {
                        concat = new String("Ignoring sample for unsupported format: ");
                    }
                    Log.w("HlsSampleStreamWrapper", concat);
                    return;
                }
                final zca t0 = this.a.t0(gxj);
                final n r0 = t0.r0();
                if (r0 != null && rnw.a((Object)this.c.Q0, (Object)r0.Q0)) {
                    n3 = 1;
                }
                else {
                    n3 = 0;
                }
                if (n3 == 0) {
                    Log.w("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.c.Q0, t0.r0()));
                    return;
                }
                byte[] j0;
                if (t0.r0() != null) {
                    j0 = t0.J0;
                }
                else {
                    j0 = null;
                }
                Objects.requireNonNull(j0);
                gxj = new gxj(j0);
            }
            n3 = gxj.c - gxj.b;
            this.b.d(gxj, n3);
            this.b.b(n, n2, n3, f, vwt$a);
        }
        
        public final int c(final k88 k88, final int n, final boolean b) {
            return this.f(k88, n, b);
        }
        
        public final void d(final gxj gxj, final int n) {
            this.a(gxj, n);
        }
        
        public final void e(final n d) {
            this.d = d;
            this.b.e(this.c);
        }
        
        public final int f(final k88 k88, int b, final boolean b2) throws IOException {
            final int n = this.f + b;
            final byte[] e = this.e;
            if (e.length < n) {
                this.e = Arrays.copyOf(e, n / 2 + n);
            }
            b = k88.b(this.e, this.f, b);
            if (b != -1) {
                this.f += b;
                return b;
            }
            if (b2) {
                return -1;
            }
            throw new EOFException();
        }
    }
    
    public static final class d extends o
    {
        public final Map<String, com.google.android.exoplayer2.drm.b> H;
        public com.google.android.exoplayer2.drm.b I;
        
        public d(final sx sx, final com.google.android.exoplayer2.drm.d d, final c$a c$a, final Map h, final gmc$a gmc$a) {
            super(sx, d, c$a);
            this.H = h;
        }
        
        public final void b(final long n, final int n2, final int n3, final int n4, final vwt$a vwt$a) {
            super.b(n, n2, n3, n4, vwt$a);
        }
        
        public final n l(final n n) {
            com.google.android.exoplayer2.drm.b b = this.I;
            if (b == null) {
                b = n.T0;
            }
            com.google.android.exoplayer2.drm.b n2 = b;
            if (b != null) {
                final com.google.android.exoplayer2.drm.b b2 = this.H.get(b.H0);
                n2 = b;
                if (b2 != null) {
                    n2 = b2;
                }
            }
            q9h o0 = n.O0;
            Label_0228: {
                Label_0072: {
                    if (o0 != null) {
                        final int length = o0.F0.length;
                        final int n3 = 0;
                        int i = 0;
                        while (true) {
                            while (i < length) {
                                final q9h$b q9h$b = o0.F0[i];
                                if (q9h$b instanceof i0l && "com.apple.streaming.transportStreamTimestamp".equals(((i0l)q9h$b).G0)) {
                                    final int n4 = i;
                                    if (n4 == -1) {
                                        break Label_0228;
                                    }
                                    if (length == 1) {
                                        break Label_0072;
                                    }
                                    final q9h$b[] array = new q9h$b[length - 1];
                                    for (int j = n3; j < length; ++j) {
                                        if (j != n4) {
                                            int n5;
                                            if (j < n4) {
                                                n5 = j;
                                            }
                                            else {
                                                n5 = j - 1;
                                            }
                                            array[n5] = o0.F0[j];
                                        }
                                    }
                                    o0 = new q9h(array);
                                    break Label_0228;
                                }
                                else {
                                    ++i;
                                }
                            }
                            final int n4 = -1;
                            continue;
                        }
                    }
                }
                o0 = null;
            }
            if (n2 == n.T0) {
                final n a = n;
                if (o0 == n.O0) {
                    return super.l(a);
                }
            }
            final n$a a2 = n.a();
            a2.n = n2;
            a2.i = o0;
            final n a = a2.a();
            return super.l(a);
        }
    }
}
