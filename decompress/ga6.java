import java.util.HashSet;
import java.util.Comparator;
import android.os.Trace;
import java.util.Map;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ga6 implements d86
{
    public int A;
    public final r6r B;
    public boolean C;
    public kgq D;
    public lgq E;
    public ngq F;
    public boolean G;
    public dak<df6<Object>, ? extends l9r<?>> H;
    public List<kub<tr0<?>, ngq, cdm, vzv>> I;
    public j10 J;
    public final List<kub<tr0<?>, ngq, cdm, vzv>> K;
    public boolean L;
    public int M;
    public int N;
    public r6r O;
    public int P;
    public boolean Q;
    public boolean R;
    public final oud S;
    public final r6r T;
    public int U;
    public int V;
    public int W;
    public int X;
    public final tr0<?> a;
    public final xe6 b;
    public final lgq c;
    public final Set<ddm> d;
    public List<kub<tr0<?>, ngq, cdm, vzv>> e;
    public List<kub<tr0<?>, ngq, cdm, vzv>> f;
    public final pq6 g;
    public final r6r h;
    public v1k i;
    public int j;
    public oud k;
    public int l;
    public oud m;
    public int[] n;
    public HashMap<Integer, Integer> o;
    public boolean p;
    public boolean q;
    public final List<s0e> r;
    public final oud s;
    public dak<df6<Object>, ? extends l9r<?>> t;
    public final HashMap<Integer, dak<df6<Object>, l9r<Object>>> u;
    public boolean v;
    public final oud w;
    public boolean x;
    public int y;
    public int z;
    
    public ga6(tr0<?> j, final xe6 b, final lgq c, final Set<ddm> d, final List<kub<tr0<?>, ngq, cdm, vzv>> e, final List<kub<tr0<?>, ngq, cdm, vzv>> f, final pq6 g) {
        e0e.f((Object)b, "parentContext");
        e0e.f((Object)g, "composition");
        this.a = (tr0<?>)j;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = new r6r(0);
        this.k = new oud();
        this.m = new oud();
        this.r = new ArrayList();
        this.s = new oud();
        this.t = amz.y();
        this.u = new HashMap<Integer, dak<df6<Object>, l9r<Object>>>();
        this.w = new oud();
        this.y = -1;
        uiq.j();
        this.B = new r6r(0);
        final kgq i = c.j();
        i.c();
        this.D = i;
        final lgq e2 = new lgq();
        this.E = e2;
        final ngq k = e2.k();
        k.f();
        this.F = k;
        j = this.E.j();
        try {
            final j10 a = j.a(0);
            j.c();
            this.J = a;
            this.K = new ArrayList();
            this.O = new r6r(0);
            this.R = true;
            this.S = new oud();
            this.T = new r6r(0);
            this.U = -1;
            this.V = -1;
            this.W = -1;
        }
        finally {
            j.c();
        }
    }
    
    public static final int A0(final ga6 ga6, int n, final boolean b, final int n2) {
        final kgq d = ga6.D;
        final int[] b2 = d.b;
        final int n3 = 1;
        final int n4 = b2[n * 5 + 1];
        final int n5 = 0;
        if ((n4 & 0x8000000) != 0x0) {
            final int i = d.i(n);
            final Object j = ga6.D.j(n);
            if (i == 126665345 && j instanceof bsh) {
                final bsh bsh = (bsh)j;
                final Object h = ga6.D.h(n, 0);
                final j10 a = ga6.D.a(n);
                final int k = ga6.D.k(n);
                final ArrayList r = ga6.r;
                final sa6$b a2 = sa6.a;
                final ArrayList list = new ArrayList();
                final int e = sa6.e(r, n);
                int l;
                if ((l = e) < 0) {
                    l = -(e + 1);
                }
                while (l < r.size()) {
                    final s0e s0e = r.get(l);
                    if (s0e.b >= k + n) {
                        break;
                    }
                    list.add(s0e);
                    ++l;
                }
                final ArrayList list2 = new ArrayList<awj>(list.size());
                for (int size = list.size(), n6 = 0; n6 < size; ++n6) {
                    final s0e s0e2 = list.get(n6);
                    list2.add(new awj((Object)s0e2.a, (Object)s0e2.c));
                }
                final dsh dsh = new dsh(bsh, h, ga6.g, ga6.c, a, (List)list2, (dak)ga6.W(n));
                ga6.b.b(dsh);
                ga6.u0();
                ga6.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)new ga6$z(ga6, dsh));
                if (b) {
                    ga6.i0();
                    ga6.k0();
                    ga6.h0();
                    int o;
                    if (ga6.D.l(n)) {
                        o = n3;
                    }
                    else {
                        o = ga6.D.o(n);
                    }
                    n = n5;
                    if (o > 0) {
                        ga6.t0(n2, o);
                        n = n5;
                    }
                }
                else {
                    n = ga6.D.o(n);
                }
            }
            else if (i == 206 && e0e.a(j, (Object)sa6.k)) {
                final Object h2 = ga6.D.h(n, 0);
                a a3;
                if (h2 instanceof a) {
                    a3 = (a)h2;
                }
                else {
                    a3 = null;
                }
                if (a3 != null) {
                    final Iterator iterator = a3.F0.d.iterator();
                    while (iterator.hasNext()) {
                        ((ga6)iterator.next()).z0();
                    }
                }
                n = ga6.D.o(n);
            }
            else {
                n = ga6.D.o(n);
            }
        }
        else if (kqe.j(b2, n)) {
            final int m = ga6.D.k(n);
            int n7 = n + 1;
            int n8 = 0;
            while (n7 < m + n) {
                final boolean l2 = ga6.D.l(n7);
                if (l2) {
                    ga6.i0();
                    ga6.r0(ga6.D.n(n7));
                }
                final boolean b3 = l2 || b;
                int n9;
                if (l2) {
                    n9 = 0;
                }
                else {
                    n9 = n2 + n8;
                }
                n8 += A0(ga6, n7, b3, n9);
                if (l2) {
                    ga6.i0();
                    ga6.x0();
                }
                n7 += ga6.D.k(n7);
            }
            n = n8;
        }
        else {
            n = ga6.D.o(n);
        }
        return n;
    }
    
    public static final void R(final ga6 ga6, final bsh bsh, final dak dak, final Object o) {
        ga6.D(126665345, bsh);
        ga6.P(o);
        final int m = ga6.M;
        try {
            ga6.M = 126665345;
            if (ga6.L) {
                ngq.w(ga6.F);
            }
            boolean v = false;
            Label_0072: {
                if (!ga6.L) {
                    if (!e0e.a(ga6.D.e(), (Object)dak)) {
                        v = true;
                        break Label_0072;
                    }
                }
                v = false;
            }
            if (v) {
                ga6.u.put(ga6.D.g, dak);
            }
            ga6.D0(202, sa6.h, false, dak);
            final boolean l = ga6.L;
            final boolean v2 = ga6.v;
            ga6.v = v;
            v7q.r((d86)ga6, (hub)w9y.j(694380496, true, new ja6(bsh, o)));
            ga6.v = v2;
        }
        finally {
            ga6.a0(false);
            ga6.M = m;
            ga6.a0(false);
        }
    }
    
    public static final void f0(final ngq ngq, final tr0<Object> tr0, final int n) {
        while (true) {
            final int s = ngq.s;
            if ((n > s && n < ngq.g) || (s == 0 && n == 0)) {
                break;
            }
            ngq.K();
            if (ngq.v(ngq.s)) {
                tr0.j();
            }
            ngq.j();
        }
    }
    
    public static void w0(final ga6 ga6, final kub kub) {
        ga6.j0(false);
        ga6.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)kub);
    }
    
    public final <T> void A(final ptb<? extends T> ptb) {
        e0e.f((Object)ptb, "factory");
        if (!this.q) {
            sa6.d("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw null;
        }
        this.q = false;
        if (this.L) {
            final oud k = this.k;
            final int n = k.b[k.c - 1];
            final ngq f = this.F;
            final j10 b = f.b(f.s);
            ++this.l;
            this.K.add(new ga6$d((ptb)ptb, b, n));
            this.T.i((Object)new ga6$e(b, n));
            return;
        }
        sa6.d("createNode() can only be called when inserting".toString());
        throw null;
    }
    
    public final void B(final Object o) {
        if (this.D.f() == 207 && !e0e.a(this.D.e(), o) && this.y < 0) {
            this.y = this.D.g;
            this.x = true;
        }
        this.D0(207, null, false, o);
    }
    
    public final <T> T B0(final df6<T> df6, final dak<df6<Object>, ? extends l9r<?>> dak) {
        final sa6$b a = sa6.a;
        e0e.f((Object)dak, "<this>");
        e0e.f((Object)df6, "key");
        Object o;
        if (dak.containsKey(df6)) {
            final l9r l9r = (l9r)dak.get(df6);
            if (l9r != null) {
                o = l9r.getValue();
            }
            else {
                o = null;
            }
        }
        else {
            o = df6.a.getValue();
        }
        return (T)o;
    }
    
    public final void C() {
        this.D0(-127, null, false, null);
    }
    
    public final void C0() {
        final kgq d = this.D;
        final int i = d.i;
        int r;
        if (i >= 0) {
            r = kqe.r(d.b, i);
        }
        else {
            r = 0;
        }
        this.l = r;
        this.D.t();
    }
    
    public final void D(final int n, final Object o) {
        this.D0(n, o, false, null);
    }
    
    public final void D0(int n, Object o, final boolean b, Object o2) {
        final boolean q = this.q;
        final v1k v1k = null;
        if (!(q ^ true)) {
            sa6.d("A call to createNode(), emitNode() or useNode() expected".toString());
            throw null;
        }
        this.I0(n, o, o2);
        final boolean l = this.L;
        final int n2 = 0;
        if (l) {
            final kgq d = this.D;
            ++d.j;
            final ngq f = this.F;
            final int r = f.r;
            if (b) {
                Objects.requireNonNull(d86.Companion);
                final d86$a$a b2 = d86$a.b;
                f.P(125, (Object)b2, true, (Object)b2);
            }
            else if (o2 != null) {
                Object b3;
                if ((b3 = o) == null) {
                    Objects.requireNonNull(d86.Companion);
                    b3 = d86$a.b;
                }
                f.P(n, b3, false, o2);
            }
            else {
                if ((o2 = o) == null) {
                    Objects.requireNonNull(d86.Companion);
                    o2 = d86$a.b;
                }
                f.O(n, o2);
            }
            final v1k i = this.i;
            if (i != null) {
                o = new mqe(n, -1, -2 - r, -1);
                i.b((mqe)o, this.j - i.b);
                i.d.add(o);
            }
            this.c0(b, null);
            return;
        }
        Label_0468: {
            if (this.i == null) {
                if (this.D.f() == n) {
                    final kgq d2 = this.D;
                    final int g = d2.g;
                    Object p3;
                    if (g < d2.h) {
                        p3 = d2.p(d2.b, g);
                    }
                    else {
                        p3 = null;
                    }
                    if (e0e.a(o, p3)) {
                        this.F0(b, o2);
                        break Label_0468;
                    }
                }
                final kgq d3 = this.D;
                Objects.requireNonNull(d3);
                final ArrayList<mqe> list = new ArrayList<mqe>();
                if (d3.j <= 0) {
                    for (int j = d3.g; j < d3.h; j += kqe.m(d3.b, j)) {
                        final int[] b4 = d3.b;
                        final int n3 = b4[j * 5];
                        final Object p4 = d3.p(b4, j);
                        int r2;
                        if (kqe.p(d3.b, j)) {
                            r2 = 1;
                        }
                        else {
                            r2 = kqe.r(d3.b, j);
                        }
                        list.add(new mqe(n3, p4, j, r2));
                    }
                }
                this.i = new v1k(list, this.j);
            }
        }
        final v1k k = this.i;
        v1k v1k2 = v1k;
        if (k != null) {
            Object value;
            if (o != null) {
                value = new nce((Object)n, o);
            }
            else {
                value = n;
            }
            final HashMap hashMap = (HashMap)k.f.getValue();
            final sa6$b a = sa6.a;
            final LinkedHashSet set = hashMap.get(value);
            Object o3 = null;
            Label_0616: {
                if (set != null) {
                    final Object d4 = rr4.D1((Iterable)set);
                    if (d4 != null) {
                        final LinkedHashSet set2 = hashMap.get(value);
                        o3 = d4;
                        if (set2 == null) {
                            break Label_0616;
                        }
                        set2.remove(d4);
                        o3 = d4;
                        if (set2.isEmpty()) {
                            hashMap.remove(value);
                            o3 = d4;
                        }
                        break Label_0616;
                    }
                }
                o3 = null;
            }
            final mqe mqe = (mqe)o3;
            if (mqe != null) {
                k.d.add(mqe);
                final int c = mqe.c;
                this.j = k.a(mqe) + k.b;
                final c9c c9c = k.e.get(mqe.c);
                if (c9c != null) {
                    n = c9c.a;
                }
                else {
                    n = -1;
                }
                final int c2 = k.c;
                final int n4 = n - c2;
                if (n > c2) {
                    final Collection<c9c> values = k.e.values();
                    e0e.e((Object)values, "groupInfos.values");
                    for (final c9c c9c2 : values) {
                        final int a2 = c9c2.a;
                        if (a2 == n) {
                            c9c2.a = c2;
                        }
                        else {
                            if (c2 > a2 || a2 >= n) {
                                continue;
                            }
                            c9c2.a = a2 + 1;
                        }
                    }
                }
                else if (c2 > n) {
                    final Collection<c9c> values2 = k.e.values();
                    e0e.e((Object)values2, "groupInfos.values");
                    for (final c9c c9c3 : values2) {
                        final int a3 = c9c3.a;
                        if (a3 == n) {
                            c9c3.a = c2;
                        }
                        else {
                            if (n + 1 > a3 || a3 >= c2) {
                                continue;
                            }
                            c9c3.a = a3 - 1;
                        }
                    }
                }
                this.s0(c);
                this.D.r(c);
                if (n4 > 0) {
                    this.v0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)new ga6$a0(n4));
                }
                this.F0(b, o2);
                v1k2 = v1k;
            }
            else {
                final kgq d5 = this.D;
                ++d5.j;
                this.L = true;
                this.H = null;
                if (this.F.t) {
                    (this.F = this.E.k()).K();
                    this.G = false;
                    this.H = null;
                }
                this.F.e();
                final ngq f2 = this.F;
                final int r3 = f2.r;
                if (b) {
                    Objects.requireNonNull(d86.Companion);
                    final d86$a$a b5 = d86$a.b;
                    f2.P(125, (Object)b5, true, (Object)b5);
                }
                else if (o2 != null) {
                    Object b6;
                    if ((b6 = o) == null) {
                        Objects.requireNonNull(d86.Companion);
                        b6 = d86$a.b;
                    }
                    f2.P(n, b6, false, o2);
                }
                else {
                    if ((o2 = o) == null) {
                        Objects.requireNonNull(d86.Companion);
                        o2 = d86$a.b;
                    }
                    f2.O(n, o2);
                }
                this.J = this.F.b(r3);
                o = new mqe(n, -1, -2 - r3, -1);
                k.b((mqe)o, this.j - k.b);
                k.d.add(o);
                o = new ArrayList();
                if (b) {
                    n = n2;
                }
                else {
                    n = this.j;
                }
                v1k2 = new v1k((List<mqe>)o, n);
            }
        }
        this.c0(b, v1k2);
    }
    
    public final void E() {
        this.D0(125, null, true, null);
        this.q = true;
    }
    
    public final void E0(final int n, final Object o) {
        this.D0(n, o, false, null);
    }
    
    public final void F() {
        this.x = false;
    }
    
    public final void F0(final boolean b, final Object o) {
        if (b) {
            final kgq d = this.D;
            if (d.j <= 0) {
                if (!kqe.p(d.b, d.g)) {
                    throw new IllegalArgumentException("Expected a node group".toString());
                }
                d.u();
            }
        }
        else {
            if (o != null && this.D.e() != o) {
                final ga6$c0 ga6$c0 = new ga6$c0(o);
                this.j0(false);
                this.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)ga6$c0);
            }
            this.D.u();
        }
    }
    
    public final void G(final m5m m5m) {
        o5m o5m;
        if (m5m instanceof o5m) {
            o5m = (o5m)m5m;
        }
        else {
            o5m = null;
        }
        if (o5m != null) {
            o5m.a |= 0x1;
        }
    }
    
    public final void G0() {
        this.D = this.c.j();
        this.D0(100, null, false, null);
        this.b.m();
        this.t = this.b.e();
        final oud w = this.w;
        final int v = this.v ? 1 : 0;
        final sa6$b a = sa6.a;
        w.c(v);
        this.v = this.P(this.t);
        this.H = null;
        if (!this.p) {
            this.p = this.b.d();
        }
        final Set set = this.B0((df6<Set>)atd.a, this.t);
        if (set != null) {
            set.add(this.c);
            this.b.k((Set)set);
        }
        this.D0(this.b.f(), null, false, null);
    }
    
    public final void H() {
        if (this.l == 0) {
            final o5m d0 = this.d0();
            if (d0 != null) {
                d0.a |= 0x10;
            }
            if (this.r.isEmpty()) {
                this.C0();
            }
            else {
                this.n0();
            }
            return;
        }
        sa6.d("No nodes can be emitted before calling skipAndEndGroup".toString());
        throw null;
    }
    
    public final boolean H0(final o5m o5m, final Object o) {
        e0e.f((Object)o5m, "scope");
        final j10 c = o5m.c;
        if (c == null) {
            return false;
        }
        final int b = c.b(this.c);
        if (this.C && b >= this.D.g) {
            final ArrayList r = this.r;
            final int e = sa6.e(r, b);
            w5d w5d = null;
            if (e < 0) {
                final int n = -(e + 1);
                if (o != null) {
                    w5d = new w5d();
                    w5d.add(o);
                }
                r.add(n, new s0e(o5m, b, w5d));
            }
            else if (o == null) {
                ((s0e)r.get(e)).c = null;
            }
            else {
                final w5d c2 = r.get(e).c;
                if (c2 != null) {
                    c2.add(o);
                }
            }
            return true;
        }
        return false;
    }
    
    public final void I(final ptb<vzv> ptb) {
        e0e.f((Object)ptb, "effect");
        this.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)new ga6$x((ptb)ptb));
    }
    
    public final void I0(final int n, final Object o, final Object o2) {
        if (o == null) {
            if (o2 != null && n == 207) {
                Objects.requireNonNull(d86.Companion);
                if (!e0e.a(o2, (Object)d86$a.b)) {
                    this.J0(o2.hashCode());
                    return;
                }
            }
            this.J0(n);
        }
        else if (o instanceof Enum) {
            this.J0(((Enum)o).ordinal());
        }
        else {
            this.J0(o.hashCode());
        }
    }
    
    public final void J() {
        boolean v = false;
        this.a0(false);
        this.a0(false);
        final int b = this.w.b();
        final sa6$b a = sa6.a;
        if (b != 0) {
            v = true;
        }
        this.v = v;
        this.H = null;
    }
    
    public final void J0(final int n) {
        this.M = (n ^ Integer.rotateLeft(this.M, 3));
    }
    
    public final boolean K() {
        final boolean v = this.v;
        boolean b = false;
        if (!v) {
            final o5m d0 = this.d0();
            if (d0 == null || (d0.a & 0x4) == 0x0) {
                return b;
            }
        }
        b = true;
        return b;
    }
    
    public final void K0(final int n, final Object o, final Object o2) {
        if (o == null) {
            if (o2 != null && n == 207) {
                Objects.requireNonNull(d86.Companion);
                if (!e0e.a(o2, (Object)d86$a.b)) {
                    this.L0(o2.hashCode());
                    return;
                }
            }
            this.L0(n);
        }
        else if (o instanceof Enum) {
            this.L0(((Enum)o).ordinal());
        }
        else {
            this.L0(o.hashCode());
        }
    }
    
    public final int L() {
        return this.M;
    }
    
    public final void L0(final int n) {
        this.M = Integer.rotateRight(n ^ this.M, 3);
    }
    
    public final xe6 M() {
        this.E0(206, sa6.k);
        if (this.L) {
            ngq.w(this.F);
        }
        final Object g0 = this.g0();
        a a;
        if (g0 instanceof a) {
            a = (a)g0;
        }
        else {
            a = null;
        }
        a a2 = a;
        if (a == null) {
            a2 = new a(new b(this.M, this.p));
            this.P0(a2);
        }
        final b f0 = a2.F0;
        final dak<df6<Object>, l9r<Object>> w = this.W(null);
        Objects.requireNonNull(f0);
        e0e.f((Object)w, "scope");
        ((cjq<dak<df6<Object>, l9r<Object>>>)f0.e).setValue(w);
        this.a0(false);
        return a2.F0;
    }
    
    public final void M0(final int n, final int n2) {
        if (this.Q0(n) != n2) {
            if (n < 0) {
                HashMap<Integer, Integer> o;
                if ((o = this.o) == null) {
                    o = new HashMap<Integer, Integer>();
                    this.o = o;
                }
                o.put(n, n2);
            }
            else {
                int[] n3;
                if ((n3 = this.n) == null) {
                    n3 = new int[this.D.c];
                    et0.N0(n3, -1);
                    this.n = n3;
                }
                n3[n] = n2;
            }
        }
    }
    
    public final void N() {
        this.a0(false);
    }
    
    public final void N0(int n, final int n2) {
        final int q0 = this.Q0(n);
        if (q0 != n2) {
            final int n3 = this.h.d() - 1;
            int i = n;
            n = n3;
            while (i != -1) {
                final int n4 = this.Q0(i) + (n2 - q0);
                this.M0(i, n4);
                int n5 = n;
                int n6;
                while (true) {
                    n6 = n;
                    if (-1 >= n5) {
                        break;
                    }
                    final v1k v1k = ((ArrayList)this.h.F0).get(n5);
                    if (v1k != null && v1k.c(i, n4)) {
                        n6 = n5 - 1;
                        break;
                    }
                    --n5;
                }
                if (i < 0) {
                    i = this.D.i;
                    n = n6;
                }
                else {
                    if (this.D.l(i)) {
                        break;
                    }
                    i = this.D.q(i);
                    n = n6;
                }
            }
        }
    }
    
    public final void O() {
        this.a0(false);
    }
    
    public final dak<df6<Object>, l9r<Object>> O0(final dak<df6<Object>, ? extends l9r<?>> dak, final dak<df6<Object>, ? extends l9r<?>> dak2) {
        final dak.dak$a<df6<Object>, ? extends l9r<?>> l = dak.l();
        ((Map)l).putAll(dak2);
        final dak b = ((dak$a)l).b();
        this.E0(204, sa6.j);
        this.P(b);
        this.P(dak2);
        this.a0(false);
        return b;
    }
    
    public final boolean P(final Object o) {
        boolean b;
        if (!e0e.a(this.g0(), o)) {
            this.P0(o);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public final void P0(final Object o) {
        if (this.L) {
            this.F.Q(o);
            if (o instanceof ddm) {
                this.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)new ga6$d0(o));
                this.d.add((ddm)o);
            }
        }
        else {
            final kgq d = this.D;
            final int k = d.k;
            final int t = kqe.t(d.b, d.i);
            if (o instanceof ddm) {
                this.d.add((ddm)o);
            }
            final ga6$e0 ga6$e0 = new ga6$e0(o, k - t - 1);
            this.j0(true);
            this.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)ga6$e0);
        }
    }
    
    public final void Q() {
        this.S();
        this.h.c();
        this.k.c = 0;
        this.m.c = 0;
        this.s.c = 0;
        this.w.c = 0;
        this.u.clear();
        final kgq d = this.D;
        if (!d.f) {
            d.c();
        }
        final ngq f = this.F;
        if (!f.t) {
            f.f();
        }
        this.V();
        this.M = 0;
        this.z = 0;
        this.q = false;
        this.L = false;
        this.x = false;
        this.C = false;
    }
    
    public final int Q0(int intValue) {
        if (intValue < 0) {
            final HashMap<Integer, Integer> o = this.o;
            if (o != null) {
                final Integer n = o.get(intValue);
                if (n != null) {
                    intValue = n;
                    return intValue;
                }
            }
            intValue = 0;
            return intValue;
        }
        final int[] n2 = this.n;
        if (n2 != null) {
            final int n3 = n2[intValue];
            if (n3 >= 0) {
                return n3;
            }
        }
        return this.D.o(intValue);
    }
    
    public final void S() {
        this.i = null;
        this.j = 0;
        this.l = 0;
        this.P = 0;
        this.M = 0;
        this.q = false;
        this.Q = false;
        this.S.c = 0;
        this.B.c();
        this.n = null;
        this.o = null;
    }
    
    public final void T(final v5d v5d, final hub<? super d86, ? super Integer, vzv> hub) {
        e0e.f((Object)v5d, "invalidationsRequested");
        if (this.e.isEmpty()) {
            this.Y(v5d, hub);
            return;
        }
        sa6.d("Expected applyChanges() to have been called".toString());
        throw null;
    }
    
    public final int U(final int n, final int n2, int n3) {
        if (n != n2) {
            final kgq d = this.D;
            int n4;
            if (kqe.o(d.b, n)) {
                final Object j = d.j(n);
                if (j != null) {
                    if (j instanceof Enum) {
                        n4 = ((Enum)j).ordinal();
                    }
                    else if (j instanceof bsh) {
                        n4 = 126665345;
                    }
                    else {
                        n4 = j.hashCode();
                    }
                }
                else {
                    n4 = 0;
                }
            }
            else {
                n4 = d.i(n);
                if (n4 == 207) {
                    final Object g = d.g(n);
                    if (g != null) {
                        Objects.requireNonNull(d86.Companion);
                        if (!e0e.a(g, (Object)d86$a.b)) {
                            n4 = g.hashCode();
                        }
                    }
                }
            }
            if (n4 == 126665345) {
                n3 = n4;
            }
            else {
                n3 = (Integer.rotateLeft(this.U(this.D.q(n), n2, n3), 3) ^ n4);
            }
        }
        return n3;
    }
    
    public final void V() {
        sa6.g(this.F.t);
        final lgq e = new lgq();
        this.E = e;
        final ngq k = e.k();
        k.f();
        this.F = k;
    }
    
    public final dak<df6<Object>, l9r<Object>> W(final Integer n) {
        if (n == null) {
            final dak<df6<Object>, ? extends l9r<?>> h = this.H;
            if (h != null) {
                return (dak<df6<Object>, l9r<Object>>)h;
            }
        }
        if (this.L && this.G) {
            for (int i = this.F.s; i > 0; i = this.F.C(i)) {
                final ngq f = this.F;
                if (f.b[f.p(i) * 5] == 202 && e0e.a(this.F.q(i), (Object)sa6.h)) {
                    final Object o = this.F.o(i);
                    e0e.d(o, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                    return (dak<df6<Object>, l9r<Object>>)(this.H = (dak<df6<Object>, ? extends l9r<?>>)o);
                }
            }
        }
        final kgq d = this.D;
        if (d.c > 0) {
            int j;
            if (n != null) {
                j = n;
            }
            else {
                j = d.i;
            }
            while (j > 0) {
                if (this.D.i(j) == 202 && e0e.a(this.D.j(j), (Object)sa6.h)) {
                    dak h2;
                    if ((h2 = this.u.get(j)) == null) {
                        final Object g = this.D.g(j);
                        e0e.d(g, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        h2 = (dak)g;
                    }
                    return (dak<df6<Object>, l9r<Object>>)(this.H = h2);
                }
                j = this.D.q(j);
            }
        }
        return (dak<df6<Object>, l9r<Object>>)(this.H = this.t);
    }
    
    public final void X() {
        Trace.beginSection("Compose:Composer.dispose");
        try {
            this.b.n((d86)this);
            this.B.c();
            this.r.clear();
            this.e.clear();
            this.u.clear();
            this.a.clear();
        }
        finally {
            Trace.endSection();
        }
    }
    
    public final void Y(final v5d v5d, final hub<? super d86, ? super Integer, vzv> hub) {
        if (this.C ^ true) {
            Trace.beginSection("Compose:recompose");
            try {
                this.A = uiq.j().d();
                this.u.clear();
                for (int a = v5d.a, i = 0; i < a; ++i) {
                    final Object o = ((Object[])v5d.b)[i];
                    e0e.d(o, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    final w5d w5d = (w5d)((Object[])v5d.c)[i];
                    final o5m o5m = (o5m)o;
                    final j10 c = o5m.c;
                    if (c == null) {
                        return;
                    }
                    this.r.add(new s0e(o5m, c.a, w5d));
                }
                final ArrayList r = this.r;
                if (r.size() > 1) {
                    or4.g1((List)r, (Comparator)new ga6$j());
                }
                this.j = 0;
                this.C = true;
                try {
                    this.G0();
                    final Object g0 = this.g0();
                    if (g0 != hub && hub != null) {
                        this.P0(hub);
                    }
                    zzz.X((stb)new ga6$g(this), (stb)new ga6$h(this), (ptb)new ga6$i((hub)hub, this, g0));
                    this.b0();
                    this.C = false;
                    this.r.clear();
                    return;
                }
                finally {
                    this.C = false;
                    this.r.clear();
                    this.Q();
                }
            }
            finally {
                Trace.endSection();
            }
        }
        sa6.d("Reentrant composition is not supported".toString());
        throw null;
    }
    
    public final void Z(final int n, final int n2) {
        if (n > 0 && n != n2) {
            this.Z(this.D.q(n), n2);
            if (this.D.l(n)) {
                this.r0(this.D.n(n));
            }
        }
    }
    
    public final boolean a(final boolean b) {
        final Object g0 = this.g0();
        if (g0 instanceof Boolean && b == (boolean)g0) {
            return false;
        }
        this.P0(b);
        return true;
    }
    
    public final void a0(final boolean b) {
        if (this.L) {
            final ngq f = this.F;
            final int s = f.s;
            this.K0(f.b[f.p(s) * 5], this.F.q(s), this.F.o(s));
        }
        else {
            final kgq d = this.D;
            final int i = d.i;
            this.K0(d.i(i), this.D.j(i), this.D.g(i));
        }
        final int l = this.l;
        final v1k j = this.i;
        if (j != null && j.a.size() > 0) {
            final List<mqe> a = j.a;
            final ArrayList d2 = j.d;
            e0e.f((Object)d2, "<this>");
            final HashSet set = new HashSet<Object>(d2.size());
            for (int size = d2.size(), k = 0; k < size; ++k) {
                set.add(d2.get(k));
            }
            final LinkedHashSet set2 = new LinkedHashSet();
            final int size2 = d2.size();
            final int size3 = a.size();
            int n = 0;
            int n2 = 0;
            int n3 = 0;
            while (n < size3) {
                final mqe mqe = a.get(n);
                if (!set.contains(mqe)) {
                    this.t0(j.a(mqe) + j.b, mqe.d);
                    j.c(mqe.c, 0);
                    this.s0(mqe.c);
                    this.D.r(mqe.c);
                    this.q0();
                    this.D.s();
                    final ArrayList r = this.r;
                    final int c = mqe.c;
                    sa6.b(r, c, this.D.k(c) + c);
                }
                else if (!set2.contains(mqe)) {
                    if (n2 < size2) {
                        final mqe mqe2 = d2.get(n2);
                        int n4;
                        if (mqe2 != mqe) {
                            final int a2 = j.a(mqe2);
                            set2.add(mqe2);
                            if (a2 != n3) {
                                final int d3 = j.d(mqe2);
                                final int b2 = j.b;
                                final int v = a2 + b2;
                                final int w = b2 + n3;
                                if (d3 > 0) {
                                    final int x = this.X;
                                    if (x > 0 && this.V == v - x && this.W == w - x) {
                                        this.X = x + d3;
                                    }
                                    else {
                                        this.i0();
                                        this.V = v;
                                        this.W = w;
                                        this.X = d3;
                                    }
                                }
                                if (a2 > n3) {
                                    final Collection<c9c> values = j.e.values();
                                    e0e.e((Object)values, "groupInfos.values");
                                    final Iterator<Object> iterator = values.iterator();
                                    while (true) {
                                        n4 = n;
                                        if (!iterator.hasNext()) {
                                            break;
                                        }
                                        final c9c c9c = iterator.next();
                                        final int b3 = c9c.b;
                                        if (a2 <= b3 && b3 < a2 + d3) {
                                            c9c.b = b3 - a2 + n3;
                                        }
                                        else {
                                            if (n3 > b3 || b3 >= a2) {
                                                continue;
                                            }
                                            c9c.b = b3 + d3;
                                        }
                                    }
                                }
                                else {
                                    n4 = n;
                                    if (n3 > a2) {
                                        final Collection<c9c> values2 = j.e.values();
                                        e0e.e((Object)values2, "groupInfos.values");
                                        final Iterator<Object> iterator2 = values2.iterator();
                                        while (true) {
                                            n4 = n;
                                            if (!iterator2.hasNext()) {
                                                break;
                                            }
                                            final c9c c9c2 = iterator2.next();
                                            final int b4 = c9c2.b;
                                            if (a2 <= b4 && b4 < a2 + d3) {
                                                c9c2.b = b4 - a2 + n3;
                                            }
                                            else {
                                                if (a2 + 1 > b4 || b4 >= n3) {
                                                    continue;
                                                }
                                                c9c2.b = b4 - d3;
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                                n4 = n;
                            }
                        }
                        else {
                            n4 = n + 1;
                        }
                        ++n2;
                        n3 += j.d(mqe2);
                        n = n4;
                        continue;
                    }
                    continue;
                }
                ++n;
            }
            this.i0();
            if (a.size() > 0) {
                this.s0(this.D.h);
                this.D.t();
            }
        }
        final int m = this.j;
        while (true) {
            final kgq d4 = this.D;
            if (d4.j > 0 || d4.g == d4.h) {
                break;
            }
            final int g = d4.g;
            this.q0();
            this.t0(m, this.D.s());
            sa6.b(this.r, g, this.D.g);
        }
        final boolean l2 = this.L;
        int n6;
        if (l2) {
            int n5 = l;
            if (b) {
                this.K.add(this.T.h());
                n5 = 1;
            }
            final kgq d5 = this.D;
            final int j2 = d5.j;
            if (j2 <= 0) {
                throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
            }
            d5.j = j2 - 1;
            final ngq f2 = this.F;
            final int s2 = f2.s;
            f2.j();
            final boolean b5 = this.D.j > 0;
            n6 = n5;
            if (!b5) {
                final int n7 = -2 - s2;
                this.F.k();
                this.F.f();
                final j10 j3 = this.J;
                if (this.K.isEmpty()) {
                    this.v0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)new la6(this.E, j3));
                }
                else {
                    final List l3 = rr4.l2((Collection)this.K);
                    this.K.clear();
                    this.k0();
                    this.h0();
                    this.v0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)new ma6(this.E, j3, l3));
                }
                this.L = false;
                final boolean b6 = this.c.G0 == 0;
                n6 = n5;
                if (!b6) {
                    this.M0(n7, 0);
                    this.N0(n7, n5);
                    n6 = n5;
                }
            }
        }
        else {
            if (b) {
                this.x0();
            }
            final int i2 = this.D.i;
            if (this.S.a(-1) > i2) {
                sa6.d("Missed recording an endGroup".toString());
                throw null;
            }
            if (this.S.a(-1) == i2) {
                this.S.b();
                final sa6$b a3 = sa6.a;
                final sa6$a c2 = sa6.c;
                this.j0(false);
                this.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)c2);
            }
            final int i3 = this.D.i;
            if (l != this.Q0(i3)) {
                this.N0(i3, l);
            }
            int n8 = l;
            if (b) {
                n8 = 1;
            }
            this.D.d();
            this.i0();
            n6 = n8;
        }
        final v1k i4 = (v1k)this.h.h();
        if (i4 != null && !l2) {
            ++i4.c;
        }
        this.i = i4;
        this.j = this.k.b() + n6;
        this.l = this.m.b() + n6;
    }
    
    public final boolean b(final float n) {
        final Object g0 = this.g0();
        if (g0 instanceof Float && n == ((Number)g0).floatValue()) {
            return false;
        }
        this.P0(n);
        return true;
    }
    
    public final void b0() {
        boolean b = false;
        this.a0(false);
        this.b.c();
        this.a0(false);
        if (this.Q) {
            final sa6$b a = sa6.a;
            final sa6$a c = sa6.c;
            this.j0(false);
            this.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)c);
            this.Q = false;
        }
        this.k0();
        if (!((ArrayList)this.h.F0).isEmpty()) {
            sa6.d("Start/end imbalance".toString());
            throw null;
        }
        if (this.S.c == 0) {
            b = true;
        }
        if (b) {
            this.S();
            this.D.c();
            return;
        }
        sa6.d("Missed recording an endGroup()".toString());
        throw null;
    }
    
    public final void c() {
        this.x = (this.y >= 0);
    }
    
    public final void c0(final boolean b, final v1k i) {
        this.h.i((Object)this.i);
        this.i = i;
        this.k.c(this.j);
        if (b) {
            this.j = 0;
        }
        this.m.c(this.l);
        this.l = 0;
    }
    
    public final boolean d(final int n) {
        final Object g0 = this.g0();
        if (g0 instanceof Integer && n == ((Number)g0).intValue()) {
            return false;
        }
        this.P0(n);
        return true;
    }
    
    public final o5m d0() {
        final r6r b = this.B;
        o5m o5m;
        if (this.z == 0 && b.e()) {
            o5m = ((ArrayList)b.F0).get(b.d() - 1);
        }
        else {
            o5m = null;
        }
        return o5m;
    }
    
    public final boolean e(final long n) {
        final Object g0 = this.g0();
        if (g0 instanceof Long && n == ((Number)g0).longValue()) {
            return false;
        }
        this.P0(n);
        return true;
    }
    
    public final void e0(final List<awj<dsh, dsh>> list) {
        final List<kub<tr0<?>, ngq, cdm, vzv>> f = this.f;
        final List<kub<tr0<?>, ngq, cdm, vzv>> e = this.e;
        try {
            this.e = f;
            final sa6$b a = sa6.a;
            this.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)sa6.e);
            final ArrayList<?> list2 = (ArrayList<?>)list;
            final int size = list2.size();
            int i = 0;
            while (i < size) {
                final awj awj = (awj)list2.get(i);
                final dsh dsh = (dsh)awj.F0;
                final dsh dsh2 = (dsh)awj.G0;
                Object d = dsh.e;
                final int g = dsh.d.g((j10)d);
                final c8m c8m = new c8m();
                this.k0();
                this.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)new ga6$l(c8m, (j10)d));
                Label_0655: {
                    if (dsh2 == null) {
                        if (e0e.a((Object)dsh.d, (Object)this.E)) {
                            this.V();
                        }
                        final Object o = dsh.d.j();
                        try {
                            ((kgq)o).r(g);
                            this.P = g;
                            final ArrayList list3 = new ArrayList();
                            this.m0((pq6)null, (pq6)null, (Integer)null, (List<awj<o5m, w5d<Object>>>)h3a.F0, (ptb<?>)new ga6$m(this, (List)list3, (kgq)o, dsh));
                            Label_0247: {
                                if (list3.isEmpty() ^ true) {
                                    this.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)new ga6$n(c8m, (List)list3));
                                    break Label_0247;
                                }
                                break Label_0247;
                            }
                            break Label_0655;
                        }
                        finally {
                            ((kgq)o).c();
                        }
                    }
                    Object o2 = this.b.j(dsh2);
                    lgq lgq;
                    if (o2 == null || (lgq = ((csh)o2).a) == null) {
                        lgq = dsh2.d;
                    }
                    j10 j10 = null;
                    Label_0336: {
                        if (o2 != null) {
                            final lgq a2 = ((csh)o2).a;
                            if (a2 != null) {
                                j10 = a2.e();
                                break Label_0336;
                            }
                        }
                        j10 = dsh2.e;
                    }
                    final ArrayList list4 = new ArrayList();
                    Object o3 = lgq.j();
                    try {
                        sa6.c((kgq)o3, list4, lgq.g(j10));
                        ((kgq)o3).c();
                        if (list4.isEmpty() ^ true) {
                            o3 = new ga6$o(c8m, (List)list4);
                            this.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)o3);
                            if (e0e.a((Object)dsh.d, (Object)this.c)) {
                                final int g2 = this.c.g((j10)d);
                                this.M0(g2, this.Q0(g2) + list4.size());
                            }
                        }
                        this.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)new ga6$p((csh)o2, this, dsh2, dsh));
                        d = lgq.j();
                        try {
                            o2 = this.D;
                            o3 = this.n;
                            this.n = null;
                            try {
                                this.D = (kgq)d;
                                final int g3 = lgq.g(j10);
                                ((kgq)d).r(g3);
                                this.P = g3;
                                final ArrayList e2 = new ArrayList();
                                Object o = this.e;
                                try {
                                    this.e = e2;
                                    final pq6 c = dsh2.c;
                                    final pq6 c2 = dsh.c;
                                    final int g4 = ((kgq)d).g;
                                    final List f2 = dsh2.f;
                                    final ga6$q ga6$q = new ga6$q(this, dsh);
                                    try {
                                        this.m0(c, c2, Integer.valueOf(g4), (List<awj<o5m, w5d<Object>>>)f2, (ptb<?>)ga6$q);
                                        this.e = (List<kub<tr0<?>, ngq, cdm, vzv>>)o;
                                        if (e2.isEmpty() ^ true) {
                                            o = new ga6$r(c8m, (List)e2);
                                            this.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)o);
                                        }
                                        this.D = (kgq)o2;
                                        this.n = (int[])o3;
                                        ((kgq)d).c();
                                        o = sa6.a;
                                        this.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)sa6.b);
                                        ++i;
                                    }
                                    finally {}
                                }
                                finally {}
                                this.e = (List<kub<tr0<?>, ngq, cdm, vzv>>)o;
                            }
                            finally {
                                this.D = (kgq)o2;
                                this.n = (int[])o3;
                            }
                        }
                        finally {
                            ((kgq)d).c();
                        }
                    }
                    finally {
                        ((kgq)o3).c();
                    }
                }
                break;
            }
            this.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)ga6$s.F0);
            this.P = 0;
        }
        finally {
            this.e = e;
        }
    }
    
    public final boolean f() {
        return this.L;
    }
    
    public final void g(final boolean b) {
        if (this.l == 0) {
            if (!this.L) {
                if (!b) {
                    this.C0();
                    return;
                }
                final kgq d = this.D;
                final int g = d.g;
                final int h = d.h;
                int i = g;
                while (i < h) {
                    final kgq d2 = this.D;
                    final ga6$f ga6$f = new ga6$f(this, i);
                    Objects.requireNonNull(d2);
                    final int t = kqe.t(d2.b, i);
                    final int n = i + 1;
                    final lgq a = d2.a;
                    int n2;
                    if (n < a.G0) {
                        n2 = kqe.k(a.F0, n);
                    }
                    else {
                        n2 = a.I0;
                    }
                    int n3 = t;
                    while (true) {
                        i = n;
                        if (n3 >= n2) {
                            break;
                        }
                        ga6$f.invoke((Object)(n3 - t), d2.d[n3]);
                        ++n3;
                    }
                }
                sa6.b(this.r, g, h);
                this.D.r(g);
                this.D.t();
            }
            return;
        }
        sa6.d("No nodes can be emitted before calling dactivateToEndGroup".toString());
        throw null;
    }
    
    public final Object g0() {
        Object o;
        if (this.L) {
            if (!(this.q ^ true)) {
                sa6.d("A call to createNode(), emitNode() or useNode() expected".toString());
                throw null;
            }
            Objects.requireNonNull(d86.Companion);
            o = d86$a.b;
        }
        else {
            o = this.D.m();
            if (this.x) {
                Objects.requireNonNull(d86.Companion);
                o = d86$a.b;
            }
        }
        return o;
    }
    
    public final d86 h(int e) {
        s0e s0e = null;
        final int n = 0;
        this.D0(e, null, false, null);
        if (this.L) {
            final pq6 g = this.g;
            e0e.d((Object)g, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            final o5m o5m = new o5m((af6)g);
            this.B.i((Object)o5m);
            this.P0(o5m);
            o5m.e = this.A;
            o5m.a &= 0xFFFFFFEF;
        }
        else {
            final ArrayList r = this.r;
            e = sa6.e(r, this.D.i);
            if (e >= 0) {
                s0e = (s0e)r.remove(e);
            }
            final Object m = this.D.m();
            Objects.requireNonNull(d86.Companion);
            o5m o5m2;
            if (e0e.a(m, (Object)d86$a.b)) {
                final pq6 g2 = this.g;
                e0e.d((Object)g2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                o5m2 = new o5m((af6)g2);
                this.P0(o5m2);
            }
            else {
                e0e.d(m, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                o5m2 = (o5m)m;
            }
            e = n;
            if (s0e != null) {
                e = 1;
            }
            if (e != 0) {
                o5m2.a |= 0x8;
            }
            else {
                o5m2.a &= 0xFFFFFFF7;
            }
            this.B.i((Object)o5m2);
            o5m2.e = this.A;
            o5m2.a &= 0xFFFFFFEF;
        }
        return (d86)this;
    }
    
    public final void h0() {
        if (this.O.e()) {
            final r6r o = this.O;
            final int size = ((ArrayList)o.F0).size();
            final Object[] array = new Object[size];
            for (int i = 0; i < size; ++i) {
                array[i] = ((ArrayList)o.F0).get(i);
            }
            this.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)new ka6(array));
            this.O.c();
        }
    }
    
    public final boolean i() {
        final boolean l = this.L;
        boolean b2;
        final boolean b = b2 = false;
        if (!l) {
            b2 = b;
            if (!this.x) {
                b2 = b;
                if (!this.v) {
                    final o5m d0 = this.d0();
                    final boolean b3 = d0 != null && (d0.a & 0x8) == 0x0;
                    b2 = b;
                    if (b3) {
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    public final void i0() {
        final int x = this.X;
        this.X = 0;
        if (x > 0) {
            final int u = this.U;
            if (u >= 0) {
                this.U = -1;
                this.p0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)new ga6$t(u, x));
            }
            else {
                final int v = this.V;
                this.V = -1;
                final int w = this.W;
                this.W = -1;
                this.p0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)new ga6$u(v, w, x));
            }
        }
    }
    
    public final tr0<?> j() {
        return this.a;
    }
    
    public final void j0(final boolean b) {
        int p;
        if (b) {
            p = this.D.i;
        }
        else {
            p = this.D.g;
        }
        final int n = p - this.P;
        if (n >= 0) {
            if (n > 0) {
                this.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)new ga6$v(n));
                this.P = p;
            }
            return;
        }
        sa6.d("Tried to seek backward".toString());
        throw null;
    }
    
    public final gyo k() {
        final boolean e = this.B.e();
        final gyo gyo = null;
        o5m o5m;
        if (e) {
            o5m = (o5m)this.B.h();
        }
        else {
            o5m = null;
        }
        if (o5m != null) {
            o5m.a &= 0xFFFFFFF7;
        }
        final int n = 1;
        if (o5m != null) {
            final int a = this.A;
            final u5d f = o5m.f;
            Object o = null;
            Label_0192: {
                Label_0189: {
                    if (f != null && (o5m.a & 0x10) == 0x0) {
                        final int a2 = f.a;
                        int i = 0;
                        while (true) {
                            while (i < a2) {
                                e0e.d(f.b[i], "null cannot be cast to non-null type kotlin.Any");
                                if (f.c[i] != a) {
                                    final boolean b = true;
                                    if (b) {
                                        o = new n5m(o5m, a, f);
                                        break Label_0192;
                                    }
                                    break Label_0189;
                                }
                                else {
                                    ++i;
                                }
                            }
                            final boolean b = false;
                            continue;
                        }
                    }
                }
                o = null;
            }
            if (o != null) {
                this.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)new ga6$k((stb)o, this));
            }
        }
        gyo gyo2 = gyo;
        Label_0354: {
            if (o5m != null) {
                final int a3 = o5m.a;
                final boolean b2 = (a3 & 0x10) != 0x0;
                gyo2 = gyo;
                if (!b2) {
                    int n2;
                    if ((a3 & 0x1) != 0x0) {
                        n2 = n;
                    }
                    else {
                        n2 = 0;
                    }
                    if (n2 == 0) {
                        gyo2 = gyo;
                        if (!this.p) {
                            break Label_0354;
                        }
                    }
                    if (o5m.c == null) {
                        j10 c;
                        if (this.L) {
                            final ngq f2 = this.F;
                            c = f2.b(f2.s);
                        }
                        else {
                            final kgq d = this.D;
                            c = d.a(d.i);
                        }
                        o5m.c = c;
                    }
                    o5m.a &= 0xFFFFFFFB;
                    gyo2 = (gyo)o5m;
                }
            }
        }
        this.a0(false);
        return gyo2;
    }
    
    public final void k0() {
        final int n = this.N;
        if (n > 0) {
            this.N = 0;
            this.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)new ga6$w(n));
        }
    }
    
    public final void l() {
        final boolean l = this.L;
        int n = 126;
        Label_0052: {
            if (!l) {
                if (this.x) {
                    if (this.D.f() == 125) {
                        break Label_0052;
                    }
                }
                else if (this.D.f() == 126) {
                    break Label_0052;
                }
            }
            n = 125;
        }
        this.D0(n, null, true, null);
        this.q = true;
    }
    
    public final boolean l0(final v5d v5d) {
        e0e.f((Object)v5d, "invalidationsRequested");
        if (!this.e.isEmpty()) {
            sa6.d("Expected applyChanges() to have been called".toString());
            throw null;
        }
        if (v5d.a <= 0 && !(this.r.isEmpty() ^ true)) {
            return false;
        }
        this.Y(v5d, null);
        return this.e.isEmpty() ^ true;
    }
    
    public final <T> T m(final df6<T> df6) {
        e0e.f((Object)df6, "key");
        return this.B0(df6, this.W(null));
    }
    
    public final <R> R m0(final pq6 pq6, final pq6 pq7, final Integer n, final List<awj<o5m, w5d<Object>>> list, final ptb<? extends R> ptb) {
        final boolean r = this.R;
        final boolean c = this.C;
        final int j = this.j;
        try {
            this.R = false;
            this.C = true;
            this.j = 0;
            for (int size = list.size(), i = 0; i < size; ++i) {
                final awj awj = list.get(i);
                final o5m o5m = (o5m)awj.F0;
                final w5d w5d = (w5d)awj.G0;
                if (w5d != null) {
                    for (int f0 = w5d.F0, k = 0; k < f0; ++k) {
                        this.H0(o5m, w5d.get(k));
                    }
                }
                else {
                    this.H0(o5m, null);
                }
            }
            if (pq6 != null) {
                int intValue;
                if (n != null) {
                    intValue = n;
                }
                else {
                    intValue = -1;
                }
                final Object o;
                if ((o = pq6.c(pq7, intValue, (ptb<?>)ptb)) != null) {
                    return (R)o;
                }
            }
            Object o = ptb.invoke();
            return (R)o;
        }
        finally {
            this.R = r;
            this.C = c;
            this.j = j;
        }
    }
    
    public final yy6 n() {
        return this.b.g();
    }
    
    public final void n0() {
        final boolean c = this.C;
        this.C = true;
        final kgq d = this.D;
        final int i = d.i;
        final int n = d.k(i) + i;
        final int j = this.j;
        final int m = this.M;
        final int l = this.l;
        s0e s0e = sa6.a(this.r, this.D.g, n);
        int n2 = i;
        boolean b = false;
        while (s0e != null) {
            final int b2 = s0e.b;
            final ArrayList r = this.r;
            final int e = sa6.e(r, b2);
            if (e >= 0) {
                final s0e s0e2 = r.remove(e);
            }
            final o5m a = s0e.a;
            final w5d c2 = s0e.c;
            Objects.requireNonNull(a);
            boolean b5 = false;
            Label_0322: {
                if (c2 != null) {
                    final v5d g = a.g;
                    if (g != null) {
                        if (c2.g()) {
                            boolean b4 = false;
                            Label_0311: {
                                if (!c2.isEmpty()) {
                                    for (int k = 0; k < c2.F0; ++k) {
                                        final Object o = c2.G0[k];
                                        e0e.d(o, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                        boolean b3 = false;
                                        Label_0293: {
                                            if (o instanceof gq8) {
                                                final gq8 gq8 = (gq8)o;
                                                Object o2;
                                                if ((o2 = gq8.a()) == null) {
                                                    o2 = jmr.a;
                                                }
                                                if (((djq)o2).b(gq8.c(), g.c(gq8))) {
                                                    b3 = true;
                                                    break Label_0293;
                                                }
                                            }
                                            b3 = false;
                                        }
                                        if (!b3) {
                                            b4 = false;
                                            break Label_0311;
                                        }
                                    }
                                }
                                b4 = true;
                            }
                            if (b4) {
                                b5 = false;
                                break Label_0322;
                            }
                        }
                    }
                }
                b5 = true;
            }
            if (b5) {
                this.D.r(b2);
                final int g2 = this.D.g;
                this.y0(n2, g2, i);
                int n3;
                for (n3 = this.D.q(g2); n3 != i && !this.D.l(n3); n3 = this.D.q(n3)) {}
                int n4;
                if (this.D.l(n3)) {
                    n4 = 0;
                }
                else {
                    n4 = j;
                }
                int j2 = 0;
                Label_0527: {
                    if (n3 == g2) {
                        j2 = n4;
                    }
                    else {
                        final int q0 = this.Q0(n3);
                        final int o3 = this.D.o(g2);
                        int n5 = n4;
                        int n6 = n3;
                        while (true) {
                            int n7 = n5;
                            if ((j2 = n7) >= q0 - o3 + n4) {
                                break;
                            }
                            j2 = n7;
                            if (n6 == b2) {
                                break;
                            }
                            int n8 = n6 + 1;
                            while (true) {
                                j2 = n7;
                                if (n8 >= b2) {
                                    break Label_0527;
                                }
                                final int n9 = this.D.k(n8) + n8;
                                n6 = n8;
                                n5 = n7;
                                if (b2 < n9) {
                                    break;
                                }
                                n7 += this.Q0(n8);
                                n8 = n9;
                            }
                        }
                    }
                }
                this.j = j2;
                this.M = this.U(this.D.q(g2), i, m);
                this.H = null;
                final o5m a2 = s0e.a;
                Objects.requireNonNull(a2);
                final hub<? super d86, ? super Integer, vzv> d2 = a2.d;
                vzv a3;
                if (d2 != null) {
                    d2.invoke((Object)this, (Object)1);
                    a3 = vzv.a;
                }
                else {
                    a3 = null;
                }
                if (a3 == null) {
                    throw new IllegalStateException("Invalid restart scope".toString());
                }
                this.H = null;
                final kgq d3 = this.D;
                final int h = kqe.m(d3.b, i) + i;
                final int g3 = d3.g;
                if (g3 < i || g3 > h) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Index ");
                    sb.append(i);
                    sb.append(" is not a parent of ");
                    sb.append(g3);
                    sa6.d(sb.toString().toString());
                    throw null;
                }
                d3.i = i;
                d3.h = h;
                d3.k = 0;
                d3.l = 0;
                n2 = g2;
                b = true;
            }
            else {
                this.B.i((Object)s0e.a);
                final o5m a4 = s0e.a;
                final af6 b6 = a4.b;
                if (b6 != null) {
                    final u5d f = a4.f;
                    if (f != null) {
                        a4.d(true);
                        try {
                            for (int a5 = f.a, n10 = 0; n10 < a5; ++n10) {
                                final Object o4 = f.b[n10];
                                e0e.d(o4, "null cannot be cast to non-null type kotlin.Any");
                                final int n11 = f.c[n10];
                                b6.o(o4);
                            }
                        }
                        finally {
                            a4.d(false);
                        }
                    }
                }
                this.B.h();
            }
            s0e = sa6.a(this.r, this.D.g, n);
        }
        if (b) {
            this.y0(n2, i, i);
            this.D.t();
            final int q2 = this.Q0(i);
            this.j = j + q2;
            this.l = l + q2;
        }
        else {
            this.C0();
        }
        this.M = m;
        this.C = c;
    }
    
    public final void o() {
        if (!this.q) {
            sa6.d("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw null;
        }
        this.q = false;
        if (this.L ^ true) {
            final kgq d = this.D;
            this.r0(d.n(d.i));
            return;
        }
        sa6.d("useNode() called while inserting".toString());
        throw null;
    }
    
    public final void o0(final kub<? super tr0<?>, ? super ngq, ? super cdm, vzv> kub) {
        this.e.add((kub<tr0<?>, ngq, cdm, vzv>)kub);
    }
    
    public final void p(final Object o) {
        this.P0(o);
    }
    
    public final void p0(final kub<? super tr0<?>, ? super ngq, ? super cdm, vzv> kub) {
        this.k0();
        this.h0();
        this.o0(kub);
    }
    
    public final void q(final nml<?>[] array) {
        e0e.f((Object)array, "values");
        final dak<df6<Object>, l9r<Object>> w = this.W(null);
        this.E0(201, sa6.g);
        this.E0(203, sa6.i);
        final ga6$b0 ga6$b0 = new ga6$b0((nml[])array, (dak)w);
        okv.e((Object)ga6$b0, 2);
        final dak dak = (dak)ga6$b0.invoke((Object)this, (Object)1);
        this.a0(false);
        dak<df6<Object>, l9r<Object>> o0 = null;
        boolean v = false;
        Label_0220: {
            if (this.L) {
                o0 = this.O0(w, dak);
                this.G = true;
            }
            else {
                final kgq d = this.D;
                final Object h = d.h(d.g, 0);
                e0e.d(h, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                o0 = (dak<df6<Object>, l9r<Object>>)h;
                final kgq d2 = this.D;
                final Object h2 = d2.h(d2.g, 1);
                e0e.d(h2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                final dak dak2 = (dak)h2;
                if (!this.i() || !e0e.a((Object)dak2, (Object)dak)) {
                    final dak<df6<Object>, l9r<Object>> o2 = this.O0(w, dak);
                    v = (true ^ e0e.a((Object)o2, (Object)o0));
                    o0 = o2;
                    break Label_0220;
                }
                this.l += this.D.s();
            }
            v = false;
        }
        if (v && !this.L) {
            this.u.put(this.D.g, o0);
        }
        this.w.c((int)(this.v ? 1 : 0));
        this.v = v;
        this.H = o0;
        this.D0(202, sa6.h, false, o0);
    }
    
    public final void q0() {
        A0(this, this.D.g, false, 0);
        this.i0();
        final sa6$b a = sa6.a;
        this.v0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)sa6.a);
        final int p = this.P;
        final kgq d = this.D;
        this.P = kqe.m(d.b, d.g) + p;
    }
    
    public final void r() {
        this.a0(true);
    }
    
    public final void r0(final Object o) {
        this.O.i(o);
    }
    
    public final void s() {
        boolean b = false;
        this.a0(false);
        final o5m d0 = this.d0();
        if (d0 != null) {
            final int a = d0.a;
            if ((a & 0x1) != 0x0) {
                b = true;
            }
            if (b) {
                d0.a = (a | 0x2);
            }
        }
    }
    
    public final void s0(final int n) {
        this.P = n - (this.D.g - this.P);
    }
    
    public final <V, T> void t(final V v, final hub<? super T, ? super V, vzv> hub) {
        e0e.f((Object)hub, "block");
        final ga6$c ga6$c = new ga6$c((hub)hub, (Object)v);
        if (this.L) {
            this.K.add(ga6$c);
        }
        else {
            this.p0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)ga6$c);
        }
    }
    
    public final void t0(final int u, final int x) {
        if (x > 0) {
            if (u < 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid remove index ");
                sb.append(u);
                sa6.d(sb.toString().toString());
                throw null;
            }
            if (this.U == u) {
                this.X += x;
            }
            else {
                this.i0();
                this.U = u;
                this.X = x;
            }
        }
    }
    
    public final void u() {
        this.p = true;
    }
    
    public final void u0() {
        final kgq d = this.D;
        if (d.c > 0) {
            final int i = d.i;
            if (this.S.a(-2) != i) {
                if (!this.Q && this.R) {
                    final sa6$b a = sa6.a;
                    final sa6$e d2 = sa6.d;
                    this.j0(false);
                    this.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)d2);
                    this.Q = true;
                }
                if (i > 0) {
                    final j10 a2 = d.a(i);
                    this.S.c(i);
                    final ga6$y ga6$y = new ga6$y(a2);
                    this.j0(false);
                    this.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)ga6$y);
                }
            }
        }
    }
    
    public final m5m v() {
        return this.d0();
    }
    
    public final void v0(final kub<? super tr0<?>, ? super ngq, ? super cdm, vzv> kub) {
        this.j0(false);
        this.u0();
        this.o0(kub);
    }
    
    public final void w() {
        if (this.x && this.D.i == this.y) {
            this.y = -1;
            this.x = false;
        }
        this.a0(false);
    }
    
    public final void x(final int n) {
        this.D0(n, null, false, null);
    }
    
    public final void x0() {
        if (this.O.e()) {
            this.O.h();
        }
        else {
            ++this.N;
        }
    }
    
    public final Object y() {
        return this.g0();
    }
    
    public final void y0(final int n, final int n2, int n3) {
        final kgq d = this.D;
        final sa6$b a = sa6.a;
        while (true) {
            Label_0073: {
                if (n == n2) {
                    break Label_0073;
                }
                int q;
                int q2;
                if ((q = n) != (q2 = n3)) {
                    if (n2 == n3) {
                        q = n;
                        q2 = n3;
                    }
                    else if (d.q(n) == n2) {
                        q2 = n2;
                        q = n;
                    }
                    else {
                        if (d.q(n2) == n) {
                            break Label_0073;
                        }
                        if (d.q(n) == d.q(n2)) {
                            q2 = d.q(n);
                            q = n;
                        }
                        else {
                            int i = 0;
                            int q3;
                            int n4;
                            for (q3 = n, n4 = 0; q3 > 0 && q3 != n3; q3 = d.q(q3), ++n4) {}
                            int q4;
                            int n5;
                            for (q4 = n2, n5 = 0; q4 > 0 && q4 != n3; q4 = d.q(q4), ++n5) {}
                            n3 = n;
                            for (int j = 0; j < n4 - n5; ++j) {
                                n3 = d.q(n3);
                            }
                            int q5 = n2;
                            while (i < n5 - n4) {
                                q5 = d.q(q5);
                                ++i;
                            }
                            int q6 = q5;
                            while (true) {
                                q = n;
                                q2 = n3;
                                if (n3 == q6) {
                                    break;
                                }
                                n3 = d.q(n3);
                                q6 = d.q(q6);
                            }
                        }
                    }
                }
                while (q > 0 && q != q2) {
                    if (d.l(q)) {
                        this.x0();
                    }
                    q = d.q(q);
                }
                this.Z(n2, q2);
                return;
            }
            int q2 = n;
            int q = n;
            continue;
        }
    }
    
    public final ze6 z() {
        return (ze6)this.c;
    }
    
    public final void z0() {
        final lgq c = this.c;
        if (c.G0 > 0 && kqe.j(c.F0, 0)) {
            final ArrayList list = new ArrayList();
            this.I = list;
            final kgq j = this.c.j();
            try {
                this.D = j;
                final List<kub<tr0<?>, ngq, cdm, vzv>> e = this.e;
                Label_0156: {
                    try {
                        this.e = list;
                        A0(this, 0, false, 0);
                        this.i0();
                        this.k0();
                        if (this.Q) {
                            final sa6$b a = sa6.a;
                            this.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)sa6.b);
                            if (this.Q) {
                                final sa6$a c2 = sa6.c;
                                this.j0(false);
                                this.o0((kub<? super tr0<?>, ? super ngq, ? super cdm, vzv>)c2);
                                this.Q = false;
                            }
                        }
                    }
                    finally {
                        break Label_0156;
                    }
                    this.e = e;
                    return;
                }
                this.e = e;
            }
            finally {
                j.c();
            }
        }
    }
    
    public static final class a implements ddm
    {
        public final b F0;
        
        public a(final b f0) {
            this.F0 = f0;
        }
        
        public final void a() {
        }
        
        public final void c() {
            this.F0.p();
        }
        
        public final void d() {
            this.F0.p();
        }
    }
    
    public final class b extends xe6
    {
        public final int a;
        public final boolean b;
        public Set<Set<ze6>> c;
        public final Set<ga6> d;
        public final wwj e;
        public final ga6 f;
        
        public b(final ga6 f, final int a, final boolean b) {
            this.f = f;
            this.a = a;
            this.b = b;
            this.d = new LinkedHashSet();
            this.e = (wwj)zzz.W((Object)amz.y());
        }
        
        public final void a(final pq6 pq6, final hub<? super d86, ? super Integer, vzv> hub) {
            e0e.f((Object)pq6, "composition");
            this.f.b.a(pq6, (hub)hub);
        }
        
        public final void b(final dsh dsh) {
            this.f.b.b(dsh);
        }
        
        public final void c() {
            final ga6 f = this.f;
            --f.z;
        }
        
        public final boolean d() {
            return this.b;
        }
        
        public final dak<df6<Object>, l9r<Object>> e() {
            return ((cjq<dak<df6<Object>, l9r<Object>>>)this.e).getValue();
        }
        
        public final int f() {
            return this.a;
        }
        
        public final yy6 g() {
            return this.f.b.g();
        }
        
        public final void h(final pq6 pq6) {
            e0e.f((Object)pq6, "composition");
            final ga6 f = this.f;
            f.b.h(f.g);
            this.f.b.h(pq6);
        }
        
        public final void i(final dsh dsh, final csh csh) {
            this.f.b.i(dsh, csh);
        }
        
        public final csh j(final dsh dsh) {
            e0e.f((Object)dsh, "reference");
            return this.f.b.j(dsh);
        }
        
        public final void k(final Set<ze6> set) {
            HashSet c;
            if ((c = this.c) == null) {
                c = new HashSet();
                this.c = c;
            }
            c.add(set);
        }
        
        public final void l(final d86 d86) {
            this.d.add(d86);
        }
        
        public final void m() {
            final ga6 f = this.f;
            ++f.z;
        }
        
        public final void n(final d86 d86) {
            e0e.f((Object)d86, "composer");
            final HashSet c = this.c;
            if (c != null) {
                final Iterator iterator = c.iterator();
                while (iterator.hasNext()) {
                    ((Set)iterator.next()).remove(((ga6)d86).c);
                }
            }
            okv.a((Object)this.d).remove(d86);
        }
        
        public final void o(final pq6 pq6) {
            e0e.f((Object)pq6, "composition");
            this.f.b.o(pq6);
        }
        
        public final void p() {
            if (this.d.isEmpty() ^ true) {
                final HashSet c = this.c;
                if (c != null) {
                    for (final ga6 ga6 : this.d) {
                        final Iterator iterator2 = c.iterator();
                        while (iterator2.hasNext()) {
                            ((Set)iterator2.next()).remove(ga6.c);
                        }
                    }
                }
                this.d.clear();
            }
        }
    }
}
