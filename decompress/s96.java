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

public final class s96 implements m76
{
    public int A;
    public final yrb B;
    public boolean C;
    public veq D;
    public weq E;
    public yeq F;
    public boolean G;
    public k9k<re6<Object>, ? extends q7r<?>> H;
    public List<jub<xr0<?>, yeq, bcm, oyv>> I;
    public i10 J;
    public final List<jub<xr0<?>, yeq, bcm, oyv>> K;
    public boolean L;
    public int M;
    public int N;
    public yrb O;
    public int P;
    public boolean Q;
    public boolean R;
    public final jud S;
    public final yrb T;
    public int U;
    public int V;
    public int W;
    public int X;
    public final xr0<?> a;
    public final le6 b;
    public final weq c;
    public final Set<ccm> d;
    public List<jub<xr0<?>, yeq, bcm, oyv>> e;
    public List<jub<xr0<?>, yeq, bcm, oyv>> f;
    public final dq6 g;
    public final yrb h;
    public c1k i;
    public int j;
    public jud k;
    public int l;
    public jud m;
    public int[] n;
    public HashMap<Integer, Integer> o;
    public boolean p;
    public boolean q;
    public final List<n0e> r;
    public final jud s;
    public k9k<re6<Object>, ? extends q7r<?>> t;
    public final HashMap<Integer, k9k<re6<Object>, q7r<Object>>> u;
    public boolean v;
    public final jud w;
    public boolean x;
    public int y;
    public int z;
    
    public s96(xr0<?> j, final le6 b, final weq c, final Set<ccm> d, final List<jub<xr0<?>, yeq, bcm, oyv>> e, final List<jub<xr0<?>, yeq, bcm, oyv>> f, final dq6 g) {
        zzd.f((Object)b, "parentContext");
        zzd.f((Object)g, "composition");
        this.a = (xr0<?>)j;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = new yrb(1);
        this.k = new jud();
        this.m = new jud();
        this.r = new ArrayList();
        this.s = new jud();
        this.t = (k9k<re6<Object>, ? extends q7r<?>>)q0b.n();
        this.u = new HashMap<Integer, k9k<re6<Object>, q7r<Object>>>();
        this.w = new jud();
        this.y = -1;
        fhq.j();
        this.B = new yrb(1);
        final veq i = c.j();
        i.c();
        this.D = i;
        final weq e2 = new weq();
        this.E = e2;
        final yeq l = e2.l();
        l.f();
        this.F = l;
        j = this.E.j();
        try {
            final i10 a = j.a(0);
            j.c();
            this.J = a;
            this.K = new ArrayList();
            this.O = new yrb(1);
            this.R = true;
            this.S = new jud();
            this.T = new yrb(1);
            this.U = -1;
            this.V = -1;
            this.W = -1;
        }
        finally {
            j.c();
        }
    }
    
    public static final int A0(final s96 s96, int n, final boolean b, final int n2) {
        final veq d = s96.D;
        final int[] b2 = d.b;
        final int n3 = 1;
        final int n4 = b2[n * 5 + 1];
        final int n5 = 0;
        if ((n4 & 0x8000000) != 0x0) {
            final int i = d.i(n);
            final Object j = s96.D.j(n);
            if (i == 126665345 && j instanceof hrh) {
                final hrh hrh = (hrh)j;
                final Object h = s96.D.h(n, 0);
                final i10 a = s96.D.a(n);
                final int k = s96.D.k(n);
                final ArrayList r = s96.r;
                final ea6$b a2 = ea6.a;
                final ArrayList list = new ArrayList();
                final int e = ea6.e((List)r, n);
                int l;
                if ((l = e) < 0) {
                    l = -(e + 1);
                }
                while (l < r.size()) {
                    final n0e n0e = r.get(l);
                    if (n0e.b >= k + n) {
                        break;
                    }
                    list.add(n0e);
                    ++l;
                }
                final ArrayList list2 = new ArrayList<gvj<o4m, r5d<Object>>>(list.size());
                for (int size = list.size(), n6 = 0; n6 < size; ++n6) {
                    final n0e n0e2 = list.get(n6);
                    list2.add((gvj<o4m, r5d<Object>>)new gvj((Object)n0e2.a, (Object)n0e2.c));
                }
                final jrh jrh = new jrh(hrh, h, s96.g, s96.c, a, (List<gvj<o4m, r5d<Object>>>)list2, s96.W(n));
                s96.b.b(jrh);
                s96.u0();
                s96.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)new s96$z(s96, jrh));
                if (b) {
                    s96.i0();
                    s96.k0();
                    s96.h0();
                    int o;
                    if (s96.D.l(n)) {
                        o = n3;
                    }
                    else {
                        o = s96.D.o(n);
                    }
                    n = n5;
                    if (o > 0) {
                        s96.t0(n2, o);
                        n = n5;
                    }
                }
                else {
                    n = s96.D.o(n);
                }
            }
            else if (i == 206 && zzd.a(j, (Object)ea6.k)) {
                final Object h2 = s96.D.h(n, 0);
                a a3;
                if (h2 instanceof a) {
                    a3 = (a)h2;
                }
                else {
                    a3 = null;
                }
                if (a3 != null) {
                    final Iterator iterator = a3.C0.d.iterator();
                    while (iterator.hasNext()) {
                        ((s96)iterator.next()).z0();
                    }
                }
                n = s96.D.o(n);
            }
            else {
                n = s96.D.o(n);
            }
        }
        else if (tdy.f(b2, n)) {
            final int m = s96.D.k(n);
            int n7 = n + 1;
            int n8 = 0;
            while (n7 < m + n) {
                final boolean l2 = s96.D.l(n7);
                if (l2) {
                    s96.i0();
                    s96.r0(s96.D.n(n7));
                }
                final boolean b3 = l2 || b;
                int n9;
                if (l2) {
                    n9 = 0;
                }
                else {
                    n9 = n2 + n8;
                }
                n8 += A0(s96, n7, b3, n9);
                if (l2) {
                    s96.i0();
                    s96.x0();
                }
                n7 += s96.D.k(n7);
            }
            n = n8;
        }
        else {
            n = s96.D.o(n);
        }
        return n;
    }
    
    public static final void R(final s96 s96, final hrh hrh, final k9k k9k, final Object o) {
        s96.D(126665345, hrh);
        s96.P(o);
        final int m = s96.M;
        try {
            s96.M = 126665345;
            if (s96.L) {
                yeq.w(s96.F);
            }
            boolean v = false;
            Label_0072: {
                if (!s96.L) {
                    if (!zzd.a(s96.D.e(), (Object)k9k)) {
                        v = true;
                        break Label_0072;
                    }
                }
                v = false;
            }
            if (v) {
                s96.u.put(s96.D.g, (k9k<re6<Object>, q7r<Object>>)k9k);
            }
            s96.D0(202, ea6.h, false, k9k);
            final boolean l = s96.L;
            final boolean v2 = s96.v;
            s96.v = v;
            j78.y((m76)s96, (gub)m8y.k(694380496, true, new v96(hrh, o)));
            s96.v = v2;
        }
        finally {
            s96.a0(false);
            s96.M = m;
            s96.a0(false);
        }
    }
    
    public static final void f0(final yeq yeq, final xr0<Object> xr0, final int n) {
        while (true) {
            final int s = yeq.s;
            if ((n > s && n < yeq.g) || (s == 0 && n == 0)) {
                break;
            }
            yeq.K();
            if (yeq.v(yeq.s)) {
                xr0.j();
            }
            yeq.j();
        }
    }
    
    public static void w0(final s96 s96, final jub jub) {
        s96.j0(false);
        s96.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)jub);
    }
    
    public final <T> void A(final otb<? extends T> otb) {
        zzd.f((Object)otb, "factory");
        if (!this.q) {
            ea6.d("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw null;
        }
        this.q = false;
        if (this.L) {
            final jud k = this.k;
            final int n = k.b[k.c - 1];
            final yeq f = this.F;
            final i10 b = f.b(f.s);
            ++this.l;
            this.K.add(new s96$d((otb)otb, b, n));
            this.T.i(new s96$e(b, n));
            return;
        }
        ea6.d("createNode() can only be called when inserting".toString());
        throw null;
    }
    
    public final void B(final Object o) {
        if (this.D.f() == 207 && !zzd.a(this.D.e(), o) && this.y < 0) {
            this.y = this.D.g;
            this.x = true;
        }
        this.D0(207, null, false, o);
    }
    
    public final <T> T B0(final re6<T> re6, final k9k<re6<Object>, ? extends q7r<?>> k9k) {
        final ea6$b a = ea6.a;
        zzd.f((Object)k9k, "<this>");
        zzd.f((Object)re6, "key");
        Object o;
        if (((Map)k9k).containsKey(re6)) {
            final q7r q7r = (q7r)((Map)k9k).get(re6);
            if (q7r != null) {
                o = q7r.getValue();
            }
            else {
                o = null;
            }
        }
        else {
            o = re6.a.getValue();
        }
        return (T)o;
    }
    
    public final void C() {
        this.D0(-127, null, false, null);
    }
    
    public final void C0() {
        final veq d = this.D;
        final int i = d.i;
        int m;
        if (i >= 0) {
            m = tdy.m(d.b, i);
        }
        else {
            m = 0;
        }
        this.l = m;
        this.D.t();
    }
    
    public final void D(final int n, final Object o) {
        this.D0(n, o, false, null);
    }
    
    public final void D0(int n, Object o, final boolean b, Object o2) {
        final boolean q = this.q;
        final c1k c1k = null;
        if (!(q ^ true)) {
            ea6.d("A call to createNode(), emitNode() or useNode() expected".toString());
            throw null;
        }
        this.I0(n, o, o2);
        final boolean l = this.L;
        final int n2 = 0;
        if (l) {
            final veq d = this.D;
            ++d.j;
            final yeq f = this.F;
            final int r = f.r;
            if (b) {
                Objects.requireNonNull(m76.Companion);
                final m76$a$a b2 = m76$a.b;
                f.P(125, (Object)b2, true, (Object)b2);
            }
            else if (o2 != null) {
                Object b3;
                if ((b3 = o) == null) {
                    Objects.requireNonNull(m76.Companion);
                    b3 = m76$a.b;
                }
                f.P(n, b3, false, o2);
            }
            else {
                if ((o2 = o) == null) {
                    Objects.requireNonNull(m76.Companion);
                    o2 = m76$a.b;
                }
                f.O(n, o2);
            }
            final c1k i = this.i;
            if (i != null) {
                o = new dqe(n, (Object)(-1), -2 - r, -1);
                i.b((dqe)o, this.j - i.b);
                i.d.add(o);
            }
            this.c0(b, null);
            return;
        }
        Label_0468: {
            if (this.i == null) {
                if (this.D.f() == n) {
                    final veq d2 = this.D;
                    final int g = d2.g;
                    Object p3;
                    if (g < d2.h) {
                        p3 = d2.p(d2.b, g);
                    }
                    else {
                        p3 = null;
                    }
                    if (zzd.a(o, p3)) {
                        this.F0(b, o2);
                        break Label_0468;
                    }
                }
                final veq d3 = this.D;
                Objects.requireNonNull(d3);
                final ArrayList<dqe> list = new ArrayList<dqe>();
                if (d3.j <= 0) {
                    for (int j = d3.g; j < d3.h; j += tdy.h(d3.b, j)) {
                        final int[] b4 = d3.b;
                        final int n3 = b4[j * 5];
                        final Object p4 = d3.p(b4, j);
                        int m;
                        if (tdy.k(d3.b, j)) {
                            m = 1;
                        }
                        else {
                            m = tdy.m(d3.b, j);
                        }
                        list.add(new dqe(n3, p4, j, m));
                    }
                }
                this.i = new c1k((List)list, this.j);
            }
        }
        final c1k k = this.i;
        c1k c1k2 = c1k;
        if (k != null) {
            Object value;
            if (o != null) {
                value = new jce(n, o);
            }
            else {
                value = n;
            }
            final HashMap hashMap = (HashMap)k.f.getValue();
            final ea6$b a = ea6.a;
            final LinkedHashSet set = hashMap.get(value);
            Object o3 = null;
            Label_0616: {
                if (set != null) {
                    final Object h1 = or4.H1((Iterable)set);
                    if (h1 != null) {
                        final LinkedHashSet set2 = hashMap.get(value);
                        o3 = h1;
                        if (set2 == null) {
                            break Label_0616;
                        }
                        set2.remove(h1);
                        o3 = h1;
                        if (set2.isEmpty()) {
                            hashMap.remove(value);
                            o3 = h1;
                        }
                        break Label_0616;
                    }
                }
                o3 = null;
            }
            final dqe dqe = (dqe)o3;
            if (dqe != null) {
                k.d.add(dqe);
                final int c = dqe.c;
                this.j = k.a(dqe) + k.b;
                final z8c z8c = k.e.get(dqe.c);
                if (z8c != null) {
                    n = z8c.a;
                }
                else {
                    n = -1;
                }
                final int c2 = k.c;
                final int n4 = n - c2;
                if (n > c2) {
                    final Collection values = k.e.values();
                    zzd.e((Object)values, "groupInfos.values");
                    for (final z8c z8c2 : values) {
                        final int a2 = z8c2.a;
                        if (a2 == n) {
                            z8c2.a = c2;
                        }
                        else {
                            if (c2 > a2 || a2 >= n) {
                                continue;
                            }
                            z8c2.a = a2 + 1;
                        }
                    }
                }
                else if (c2 > n) {
                    final Collection values2 = k.e.values();
                    zzd.e((Object)values2, "groupInfos.values");
                    for (final z8c z8c3 : values2) {
                        final int a3 = z8c3.a;
                        if (a3 == n) {
                            z8c3.a = c2;
                        }
                        else {
                            if (n + 1 > a3 || a3 >= c2) {
                                continue;
                            }
                            z8c3.a = a3 - 1;
                        }
                    }
                }
                this.s0(c);
                this.D.r(c);
                if (n4 > 0) {
                    this.v0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)new s96$a0(n4));
                }
                this.F0(b, o2);
                c1k2 = c1k;
            }
            else {
                final veq d4 = this.D;
                ++d4.j;
                this.L = true;
                this.H = null;
                if (this.F.t) {
                    (this.F = this.E.l()).K();
                    this.G = false;
                    this.H = null;
                }
                this.F.e();
                final yeq f2 = this.F;
                final int r2 = f2.r;
                if (b) {
                    Objects.requireNonNull(m76.Companion);
                    final m76$a$a b5 = m76$a.b;
                    f2.P(125, (Object)b5, true, (Object)b5);
                }
                else if (o2 != null) {
                    Object b6;
                    if ((b6 = o) == null) {
                        Objects.requireNonNull(m76.Companion);
                        b6 = m76$a.b;
                    }
                    f2.P(n, b6, false, o2);
                }
                else {
                    if ((o2 = o) == null) {
                        Objects.requireNonNull(m76.Companion);
                        o2 = m76$a.b;
                    }
                    f2.O(n, o2);
                }
                this.J = this.F.b(r2);
                o = new dqe(n, (Object)(-1), -2 - r2, -1);
                k.b((dqe)o, this.j - k.b);
                k.d.add(o);
                o = new ArrayList();
                if (b) {
                    n = n2;
                }
                else {
                    n = this.j;
                }
                c1k2 = new c1k((List)o, n);
            }
        }
        this.c0(b, c1k2);
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
            final veq d = this.D;
            if (d.j <= 0) {
                if (!tdy.k(d.b, d.g)) {
                    throw new IllegalArgumentException("Expected a node group".toString());
                }
                d.u();
            }
        }
        else {
            if (o != null && this.D.e() != o) {
                final s96$c0 s96$c0 = new s96$c0(o);
                this.j0(false);
                this.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)s96$c0);
            }
            this.D.u();
        }
    }
    
    public final void G(final m4m m4m) {
        o4m o4m;
        if (m4m instanceof o4m) {
            o4m = (o4m)m4m;
        }
        else {
            o4m = null;
        }
        if (o4m != null) {
            o4m.a |= 0x1;
        }
    }
    
    public final void G0() {
        this.D = this.c.j();
        this.D0(100, null, false, null);
        this.b.m();
        this.t = (k9k<re6<Object>, ? extends q7r<?>>)this.b.e();
        final jud w = this.w;
        final int v = this.v ? 1 : 0;
        final ea6$b a = ea6.a;
        w.c(v);
        this.v = this.P(this.t);
        this.H = null;
        if (!this.p) {
            this.p = this.b.d();
        }
        final Set set = this.B0((re6<Set>)usd.a, this.t);
        if (set != null) {
            set.add(this.c);
            this.b.k((Set)set);
        }
        this.D0(this.b.f(), null, false, null);
    }
    
    public final void H() {
        if (this.l == 0) {
            final o4m d0 = this.d0();
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
        ea6.d("No nodes can be emitted before calling skipAndEndGroup".toString());
        throw null;
    }
    
    public final boolean H0(final o4m o4m, final Object o) {
        zzd.f((Object)o4m, "scope");
        final i10 c = o4m.c;
        if (c == null) {
            return false;
        }
        final int b = c.b(this.c);
        if (this.C && b >= this.D.g) {
            final ArrayList r = this.r;
            final int e = ea6.e((List)r, b);
            r5d r5d = null;
            if (e < 0) {
                final int n = -(e + 1);
                if (o != null) {
                    r5d = new r5d();
                    r5d.add(o);
                }
                r.add(n, new n0e(o4m, b, r5d));
            }
            else if (o == null) {
                ((n0e)r.get(e)).c = null;
            }
            else {
                final r5d c2 = r.get(e).c;
                if (c2 != null) {
                    c2.add(o);
                }
            }
            return true;
        }
        return false;
    }
    
    public final void I(final otb<oyv> otb) {
        zzd.f((Object)otb, "effect");
        this.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)new s96$x((otb)otb));
    }
    
    public final void I0(final int n, final Object o, final Object o2) {
        if (o == null) {
            if (o2 != null && n == 207) {
                Objects.requireNonNull(m76.Companion);
                if (!zzd.a(o2, (Object)m76$a.b)) {
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
        final ea6$b a = ea6.a;
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
            final o4m d0 = this.d0();
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
                Objects.requireNonNull(m76.Companion);
                if (!zzd.a(o2, (Object)m76$a.b)) {
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
    
    public final le6 M() {
        this.E0(206, ea6.k);
        if (this.L) {
            yeq.w(this.F);
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
        final b c0 = a2.C0;
        final k9k<re6<Object>, q7r<Object>> w = this.W(null);
        Objects.requireNonNull(c0);
        zzd.f((Object)w, "scope");
        ((nhq)c0.e).setValue((Object)w);
        this.a0(false);
        return a2.C0;
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
                    it0.t0(n3, -1);
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
                    final c1k c1k = ((ArrayList)this.h.C0).get(n5);
                    if (c1k != null && c1k.c(i, n4)) {
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
    
    public final k9k<re6<Object>, q7r<Object>> O0(final k9k<re6<Object>, ? extends q7r<?>> k9k, final k9k<re6<Object>, ? extends q7r<?>> k9k2) {
        final k9k.a k = k9k.k();
        k.putAll((Map)k9k2);
        final k9k b = k.b();
        this.E0(204, ea6.j);
        this.P(b);
        this.P(k9k2);
        this.a0(false);
        return b;
    }
    
    public final boolean P(final Object o) {
        boolean b;
        if (!zzd.a(this.g0(), o)) {
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
            if (o instanceof ccm) {
                this.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)new s96$d0(o));
                this.d.add((ccm)o);
            }
        }
        else {
            final veq d = this.D;
            final int k = d.k;
            final int o2 = tdy.o(d.b, d.i);
            if (o instanceof ccm) {
                this.d.add((ccm)o);
            }
            final s96$e0 s96$e0 = new s96$e0(o, k - o2 - 1);
            this.j0(true);
            this.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)s96$e0);
        }
    }
    
    public final void Q() {
        this.S();
        this.h.b();
        this.k.c = 0;
        this.m.c = 0;
        this.s.c = 0;
        this.w.c = 0;
        this.u.clear();
        final veq d = this.D;
        if (!d.f) {
            d.c();
        }
        final yeq f = this.F;
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
        this.B.b();
        this.n = null;
        this.o = null;
    }
    
    public final void T(final q5d q5d, final gub<? super m76, ? super Integer, oyv> gub) {
        zzd.f((Object)q5d, "invalidationsRequested");
        if (this.e.isEmpty()) {
            this.Y(q5d, gub);
            return;
        }
        ea6.d("Expected applyChanges() to have been called".toString());
        throw null;
    }
    
    public final int U(final int n, final int n2, int n3) {
        if (n != n2) {
            final veq d = this.D;
            int n4;
            if (tdy.j(d.b, n)) {
                final Object j = d.j(n);
                if (j != null) {
                    if (j instanceof Enum) {
                        n4 = ((Enum)j).ordinal();
                    }
                    else if (j instanceof hrh) {
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
                        Objects.requireNonNull(m76.Companion);
                        if (!zzd.a(g, (Object)m76$a.b)) {
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
        ea6.g(this.F.t);
        final weq e = new weq();
        this.E = e;
        final yeq l = e.l();
        l.f();
        this.F = l;
    }
    
    public final k9k<re6<Object>, q7r<Object>> W(final Integer n) {
        if (n == null) {
            final k9k<re6<Object>, ? extends q7r<?>> h = this.H;
            if (h != null) {
                return (k9k<re6<Object>, q7r<Object>>)h;
            }
        }
        if (this.L && this.G) {
            for (int i = this.F.s; i > 0; i = this.F.C(i)) {
                final yeq f = this.F;
                if (f.b[f.p(i) * 5] == 202 && zzd.a(this.F.q(i), (Object)ea6.h)) {
                    final Object o = this.F.o(i);
                    zzd.d(o, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                    return (k9k<re6<Object>, q7r<Object>>)(this.H = (k9k<re6<Object>, ? extends q7r<?>>)o);
                }
            }
        }
        final veq d = this.D;
        if (d.c > 0) {
            int j;
            if (n != null) {
                j = n;
            }
            else {
                j = d.i;
            }
            while (j > 0) {
                if (this.D.i(j) == 202 && zzd.a(this.D.j(j), (Object)ea6.h)) {
                    k9k h2;
                    if ((h2 = this.u.get(j)) == null) {
                        final Object g = this.D.g(j);
                        zzd.d(g, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        h2 = (k9k)g;
                    }
                    return (k9k<re6<Object>, q7r<Object>>)(this.H = (k9k<re6<Object>, ? extends q7r<?>>)h2);
                }
                j = this.D.q(j);
            }
        }
        return (k9k<re6<Object>, q7r<Object>>)(this.H = this.t);
    }
    
    public final void X() {
        Trace.beginSection("Compose:Composer.dispose");
        try {
            this.b.n((m76)this);
            this.B.b();
            this.r.clear();
            this.e.clear();
            this.u.clear();
            this.a.clear();
        }
        finally {
            Trace.endSection();
        }
    }
    
    public final void Y(final q5d q5d, final gub<? super m76, ? super Integer, oyv> gub) {
        if (this.C ^ true) {
            Trace.beginSection("Compose:recompose");
            try {
                this.A = fhq.j().d();
                this.u.clear();
                for (int a = q5d.a, i = 0; i < a; ++i) {
                    final Object o = ((Object[])q5d.b)[i];
                    zzd.d(o, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    final r5d r5d = (r5d)((Object[])q5d.c)[i];
                    final o4m o4m = (o4m)o;
                    final i10 c = o4m.c;
                    if (c == null) {
                        return;
                    }
                    this.r.add(new n0e(o4m, c.a, r5d));
                }
                final ArrayList r = this.r;
                if (r.size() > 1) {
                    lr4.k1((List)r, (Comparator)new s96$j());
                }
                this.j = 0;
                this.C = true;
                try {
                    this.G0();
                    final Object g0 = this.g0();
                    if (g0 != gub && gub != null) {
                        this.P0(gub);
                    }
                    nkz.s((rtb)new s96$g(this), (rtb)new s96$h(this), (otb)new s96$i((gub)gub, this, g0));
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
        ea6.d("Reentrant composition is not supported".toString());
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
            final yeq f = this.F;
            final int s = f.s;
            this.K0(f.b[f.p(s) * 5], this.F.q(s), this.F.o(s));
        }
        else {
            final veq d = this.D;
            final int i = d.i;
            this.K0(d.i(i), this.D.j(i), this.D.g(i));
        }
        final int l = this.l;
        final c1k j = this.i;
        if (j != null && j.a.size() > 0) {
            final List a = j.a;
            final ArrayList d2 = j.d;
            zzd.f((Object)d2, "<this>");
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
                final dqe dqe = a.get(n);
                if (!set.contains(dqe)) {
                    this.t0(j.a(dqe) + j.b, dqe.d);
                    j.c(dqe.c, 0);
                    this.s0(dqe.c);
                    this.D.r(dqe.c);
                    this.q0();
                    this.D.s();
                    final ArrayList r = this.r;
                    final int c = dqe.c;
                    ea6.b((List)r, c, this.D.k(c) + c);
                }
                else if (!set2.contains(dqe)) {
                    if (n2 < size2) {
                        final dqe dqe2 = d2.get(n2);
                        int n4;
                        if (dqe2 != dqe) {
                            final int a2 = j.a(dqe2);
                            set2.add(dqe2);
                            if (a2 != n3) {
                                final int d3 = j.d(dqe2);
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
                                    final Collection values = j.e.values();
                                    zzd.e((Object)values, "groupInfos.values");
                                    final Iterator iterator = values.iterator();
                                    while (true) {
                                        n4 = n;
                                        if (!iterator.hasNext()) {
                                            break;
                                        }
                                        final z8c z8c = (z8c)iterator.next();
                                        final int b3 = z8c.b;
                                        if (a2 <= b3 && b3 < a2 + d3) {
                                            z8c.b = b3 - a2 + n3;
                                        }
                                        else {
                                            if (n3 > b3 || b3 >= a2) {
                                                continue;
                                            }
                                            z8c.b = b3 + d3;
                                        }
                                    }
                                }
                                else {
                                    n4 = n;
                                    if (n3 > a2) {
                                        final Collection values2 = j.e.values();
                                        zzd.e((Object)values2, "groupInfos.values");
                                        final Iterator iterator2 = values2.iterator();
                                        while (true) {
                                            n4 = n;
                                            if (!iterator2.hasNext()) {
                                                break;
                                            }
                                            final z8c z8c2 = (z8c)iterator2.next();
                                            final int b4 = z8c2.b;
                                            if (a2 <= b4 && b4 < a2 + d3) {
                                                z8c2.b = b4 - a2 + n3;
                                            }
                                            else {
                                                if (a2 + 1 > b4 || b4 >= n3) {
                                                    continue;
                                                }
                                                z8c2.b = b4 - d3;
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
                        n3 += j.d(dqe2);
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
            final veq d4 = this.D;
            if (d4.j > 0 || d4.g == d4.h) {
                break;
            }
            final int g = d4.g;
            this.q0();
            this.t0(m, this.D.s());
            ea6.b((List)this.r, g, this.D.g);
        }
        final boolean l2 = this.L;
        int n6;
        if (l2) {
            int n5 = l;
            if (b) {
                this.K.add(this.T.h());
                n5 = 1;
            }
            final veq d5 = this.D;
            final int j2 = d5.j;
            if (j2 <= 0) {
                throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
            }
            d5.j = j2 - 1;
            final yeq f2 = this.F;
            final int s2 = f2.s;
            f2.j();
            final boolean b5 = this.D.j > 0;
            n6 = n5;
            if (!b5) {
                final int n7 = -2 - s2;
                this.F.k();
                this.F.f();
                final i10 j3 = this.J;
                if (this.K.isEmpty()) {
                    this.v0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)new x96(this.E, j3));
                }
                else {
                    final List p = or4.p2((Collection)this.K);
                    this.K.clear();
                    this.k0();
                    this.h0();
                    this.v0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)new y96(this.E, j3, p));
                }
                this.L = false;
                final boolean b6 = this.c.D0 == 0;
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
                ea6.d("Missed recording an endGroup".toString());
                throw null;
            }
            if (this.S.a(-1) == i2) {
                this.S.b();
                final ea6$b a3 = ea6.a;
                final ea6$a c2 = ea6.c;
                this.j0(false);
                this.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)c2);
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
        final c1k i4 = (c1k)this.h.h();
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
            final ea6$b a = ea6.a;
            final ea6$a c = ea6.c;
            this.j0(false);
            this.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)c);
            this.Q = false;
        }
        this.k0();
        if (!((ArrayList)this.h.C0).isEmpty()) {
            ea6.d("Start/end imbalance".toString());
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
        ea6.d("Missed recording an endGroup()".toString());
        throw null;
    }
    
    public final void c() {
        this.x = (this.y >= 0);
    }
    
    public final void c0(final boolean b, final c1k i) {
        this.h.i(this.i);
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
    
    public final o4m d0() {
        final yrb b = this.B;
        o4m o4m;
        if (this.z == 0 && b.f()) {
            o4m = ((ArrayList)b.C0).get(b.d() - 1);
        }
        else {
            o4m = null;
        }
        return o4m;
    }
    
    public final boolean e(final long n) {
        final Object g0 = this.g0();
        if (g0 instanceof Long && n == ((Number)g0).longValue()) {
            return false;
        }
        this.P0(n);
        return true;
    }
    
    public final void e0(final List<gvj<jrh, jrh>> list) {
        final List<jub<xr0<?>, yeq, bcm, oyv>> f = this.f;
        final List<jub<xr0<?>, yeq, bcm, oyv>> e = this.e;
        try {
            this.e = f;
            final ea6$b a = ea6.a;
            this.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)ea6.e);
            final ArrayList<?> list2 = (ArrayList<?>)list;
            final int size = list2.size();
            int i = 0;
            while (i < size) {
                final gvj gvj = (gvj)list2.get(i);
                final jrh jrh = (jrh)gvj.C0;
                final jrh jrh2 = (jrh)gvj.D0;
                Object o = jrh.e;
                final int g = jrh.d.g((i10)o);
                final z6m z6m = new z6m();
                this.k0();
                this.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)new s96$l(z6m, (i10)o));
                Label_0634: {
                    if (jrh2 == null) {
                        if (zzd.a((Object)jrh.d, (Object)this.E)) {
                            this.V();
                        }
                        final Object o2 = jrh.d.j();
                        try {
                            ((veq)o2).r(g);
                            this.P = g;
                            final ArrayList list3 = new ArrayList();
                            this.m0((dq6)null, (dq6)null, (Integer)null, (List<gvj<o4m, r5d<Object>>>)v2a.C0, (otb<?>)new s96$m(this, (List)list3, (veq)o2, jrh));
                            Label_0239: {
                                if (list3.isEmpty() ^ true) {
                                    this.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)new s96$n(z6m, (List)list3));
                                    break Label_0239;
                                }
                                break Label_0239;
                            }
                            break Label_0634;
                        }
                        finally {
                            ((veq)o2).c();
                        }
                    }
                    Object d = this.b.j(jrh2);
                    weq weq;
                    if (d == null || (weq = ((irh)d).a) == null) {
                        weq = jrh2.d;
                    }
                    i10 i2 = null;
                    Label_0324: {
                        if (d != null) {
                            final weq a2 = ((irh)d).a;
                            if (a2 != null) {
                                i2 = a2.e();
                                break Label_0324;
                            }
                        }
                        i2 = jrh2.e;
                    }
                    int[] n = (Object)new ArrayList();
                    Object o3 = weq.j();
                    try {
                        ea6.c((veq)o3, (List)(Object)n, weq.g(i2));
                        ((veq)o3).c();
                        if (((ArrayList)(Object)n).isEmpty() ^ true) {
                            o3 = new s96$o(z6m, (List)(Object)n);
                            this.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)o3);
                            if (zzd.a((Object)jrh.d, (Object)this.c)) {
                                final int g2 = this.c.g((i10)o);
                                this.M0(g2, this.Q0(g2) + ((ArrayList)(Object)n).size());
                            }
                        }
                        this.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)new s96$p((irh)d, this, jrh2, jrh));
                        d = weq.j();
                        try {
                            o = this.D;
                            n = this.n;
                            this.n = null;
                            try {
                                this.D = (veq)d;
                                final int g3 = weq.g(i2);
                                ((veq)d).r(g3);
                                this.P = g3;
                                final ArrayList e2 = new ArrayList();
                                Object o2 = this.e;
                                try {
                                    this.e = e2;
                                    o3 = jrh2.c;
                                    final dq6 c = jrh.c;
                                    final int g4 = ((veq)d).g;
                                    final List<gvj<o4m, r5d<Object>>> f2 = jrh2.f;
                                    final s96$q s96$q = new s96$q(this, jrh);
                                    try {
                                        this.m0((dq6)o3, c, Integer.valueOf(g4), f2, (otb<?>)s96$q);
                                        this.e = (List<jub<xr0<?>, yeq, bcm, oyv>>)o2;
                                        if (e2.isEmpty() ^ true) {
                                            o2 = new s96$r(z6m, (List)e2);
                                            this.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)o2);
                                        }
                                        this.D = (veq)o;
                                        this.n = n;
                                        ((veq)d).c();
                                        o2 = ea6.a;
                                        this.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)ea6.b);
                                        ++i;
                                    }
                                    finally {}
                                }
                                finally {}
                                this.e = (List<jub<xr0<?>, yeq, bcm, oyv>>)o2;
                            }
                            finally {
                                this.D = (veq)o;
                                this.n = n;
                            }
                        }
                        finally {
                            ((veq)d).c();
                        }
                    }
                    finally {
                        ((veq)o3).c();
                    }
                }
                break;
            }
            this.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)s96$s.C0);
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
                final veq d = this.D;
                final int g = d.g;
                final int h = d.h;
                int i = g;
                while (i < h) {
                    final veq d2 = this.D;
                    final s96$f s96$f = new s96$f(this, i);
                    Objects.requireNonNull(d2);
                    final int o = tdy.o(d2.b, i);
                    final int n = i + 1;
                    final weq a = d2.a;
                    int n2;
                    if (n < a.D0) {
                        n2 = tdy.g(a.C0, n);
                    }
                    else {
                        n2 = a.F0;
                    }
                    int n3 = o;
                    while (true) {
                        i = n;
                        if (n3 >= n2) {
                            break;
                        }
                        s96$f.invoke((Object)(n3 - o), d2.d[n3]);
                        ++n3;
                    }
                }
                ea6.b((List)this.r, g, h);
                this.D.r(g);
                this.D.t();
            }
            return;
        }
        ea6.d("No nodes can be emitted before calling dactivateToEndGroup".toString());
        throw null;
    }
    
    public final Object g0() {
        Object o;
        if (this.L) {
            if (!(this.q ^ true)) {
                ea6.d("A call to createNode(), emitNode() or useNode() expected".toString());
                throw null;
            }
            Objects.requireNonNull(m76.Companion);
            o = m76$a.b;
        }
        else {
            o = this.D.m();
            if (this.x) {
                Objects.requireNonNull(m76.Companion);
                o = m76$a.b;
            }
        }
        return o;
    }
    
    public final m76 h(int e) {
        n0e n0e = null;
        final int n = 0;
        this.D0(e, null, false, null);
        if (this.L) {
            final dq6 g = this.g;
            zzd.d((Object)g, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            final o4m o4m = new o4m((oe6)g);
            this.B.i(o4m);
            this.P0(o4m);
            o4m.e = this.A;
            o4m.a &= 0xFFFFFFEF;
        }
        else {
            final ArrayList r = this.r;
            e = ea6.e((List)r, this.D.i);
            if (e >= 0) {
                n0e = (n0e)r.remove(e);
            }
            final Object m = this.D.m();
            Objects.requireNonNull(m76.Companion);
            o4m o4m2;
            if (zzd.a(m, (Object)m76$a.b)) {
                final dq6 g2 = this.g;
                zzd.d((Object)g2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                o4m2 = new o4m((oe6)g2);
                this.P0(o4m2);
            }
            else {
                zzd.d(m, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                o4m2 = (o4m)m;
            }
            e = n;
            if (n0e != null) {
                e = 1;
            }
            if (e != 0) {
                o4m2.a |= 0x8;
            }
            else {
                o4m2.a &= 0xFFFFFFF7;
            }
            this.B.i(o4m2);
            o4m2.e = this.A;
            o4m2.a &= 0xFFFFFFEF;
        }
        return (m76)this;
    }
    
    public final void h0() {
        if (this.O.f()) {
            final yrb o = this.O;
            final int size = ((ArrayList)o.C0).size();
            final Object[] array = new Object[size];
            for (int i = 0; i < size; ++i) {
                array[i] = ((ArrayList)o.C0).get(i);
            }
            this.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)new w96(array));
            this.O.b();
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
                    final o4m d0 = this.d0();
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
                this.p0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)new s96$t(u, x));
            }
            else {
                final int v = this.V;
                this.V = -1;
                final int w = this.W;
                this.W = -1;
                this.p0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)new s96$u(v, w, x));
            }
        }
    }
    
    public final xr0<?> j() {
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
                this.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)new s96$v(n));
                this.P = p;
            }
            return;
        }
        ea6.d("Tried to seek backward".toString());
        throw null;
    }
    
    public final vwo k() {
        final boolean f = this.B.f();
        final vwo vwo = null;
        o4m o4m;
        if (f) {
            o4m = (o4m)this.B.h();
        }
        else {
            o4m = null;
        }
        if (o4m != null) {
            o4m.a &= 0xFFFFFFF7;
        }
        final int n = 1;
        if (o4m != null) {
            final int a = this.A;
            final p5d f2 = o4m.f;
            Object o = null;
            Label_0194: {
                Label_0191: {
                    if (f2 != null && (o4m.a & 0x10) == 0x0) {
                        final int a2 = f2.a;
                        int i = 0;
                        while (true) {
                            while (i < a2) {
                                zzd.d(f2.b[i], "null cannot be cast to non-null type kotlin.Any");
                                if (f2.c[i] != a) {
                                    final boolean b = true;
                                    if (b) {
                                        o = new n4m(o4m, a, f2);
                                        break Label_0194;
                                    }
                                    break Label_0191;
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
                this.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)new s96$k((rtb)o, this));
            }
        }
        vwo vwo2 = vwo;
        Label_0356: {
            if (o4m != null) {
                final int a3 = o4m.a;
                final boolean b2 = (a3 & 0x10) != 0x0;
                vwo2 = vwo;
                if (!b2) {
                    int n2;
                    if ((a3 & 0x1) != 0x0) {
                        n2 = n;
                    }
                    else {
                        n2 = 0;
                    }
                    if (n2 == 0) {
                        vwo2 = vwo;
                        if (!this.p) {
                            break Label_0356;
                        }
                    }
                    if (o4m.c == null) {
                        i10 c;
                        if (this.L) {
                            final yeq f3 = this.F;
                            c = f3.b(f3.s);
                        }
                        else {
                            final veq d = this.D;
                            c = d.a(d.i);
                        }
                        o4m.c = c;
                    }
                    o4m.a &= 0xFFFFFFFB;
                    vwo2 = (vwo)o4m;
                }
            }
        }
        this.a0(false);
        return vwo2;
    }
    
    public final void k0() {
        final int n = this.N;
        if (n > 0) {
            this.N = 0;
            this.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)new s96$w(n));
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
    
    public final boolean l0(final q5d q5d) {
        zzd.f((Object)q5d, "invalidationsRequested");
        if (!this.e.isEmpty()) {
            ea6.d("Expected applyChanges() to have been called".toString());
            throw null;
        }
        if (q5d.a <= 0 && !(this.r.isEmpty() ^ true)) {
            return false;
        }
        this.Y(q5d, null);
        return this.e.isEmpty() ^ true;
    }
    
    public final <T> T m(final re6<T> re6) {
        zzd.f((Object)re6, "key");
        return this.B0(re6, this.W(null));
    }
    
    public final <R> R m0(final dq6 dq6, final dq6 dq7, final Integer n, final List<gvj<o4m, r5d<Object>>> list, final otb<? extends R> otb) {
        final boolean r = this.R;
        final boolean c = this.C;
        final int j = this.j;
        try {
            this.R = false;
            this.C = true;
            this.j = 0;
            for (int size = list.size(), i = 0; i < size; ++i) {
                final gvj gvj = list.get(i);
                final o4m o4m = (o4m)gvj.C0;
                final r5d r5d = (r5d)gvj.D0;
                if (r5d != null) {
                    for (int c2 = r5d.C0, k = 0; k < c2; ++k) {
                        this.H0(o4m, r5d.get(k));
                    }
                }
                else {
                    this.H0(o4m, null);
                }
            }
            if (dq6 != null) {
                int intValue;
                if (n != null) {
                    intValue = n;
                }
                else {
                    intValue = -1;
                }
                final Object o;
                if ((o = dq6.b(dq7, intValue, (otb<?>)otb)) != null) {
                    return (R)o;
                }
            }
            Object o = otb.invoke();
            return (R)o;
        }
        finally {
            this.R = r;
            this.C = c;
            this.j = j;
        }
    }
    
    public final oy6 n() {
        return this.b.g();
    }
    
    public final void n0() {
        final boolean c = this.C;
        this.C = true;
        final veq d = this.D;
        final int i = d.i;
        final int n = d.k(i) + i;
        final int j = this.j;
        final int m = this.M;
        final int l = this.l;
        n0e n0e = ea6.a((List)this.r, this.D.g, n);
        int n2 = i;
        boolean b = false;
        while (n0e != null) {
            final int b2 = n0e.b;
            final ArrayList r = this.r;
            final int e = ea6.e((List)r, b2);
            if (e >= 0) {
                final n0e n0e2 = r.remove(e);
            }
            final o4m a = n0e.a;
            final r5d c2 = n0e.c;
            Objects.requireNonNull(a);
            boolean b5 = false;
            Label_0322: {
                if (c2 != null) {
                    final q5d g = a.g;
                    if (g != null) {
                        if (c2.g()) {
                            boolean b4 = false;
                            Label_0308: {
                                if (!c2.isEmpty()) {
                                    for (int k = 0; k < c2.C0; ++k) {
                                        final Object o = c2.D0[k];
                                        zzd.d(o, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                        boolean b3 = false;
                                        Label_0288: {
                                            if (o instanceof sp8) {
                                                final sp8 sp8 = (sp8)o;
                                                Object o2;
                                                if ((o2 = sp8.a()) == null) {
                                                    o2 = tkr.a;
                                                }
                                                if (((ohq)o2).b(sp8.c(), g.d((Object)sp8))) {
                                                    b3 = true;
                                                    break Label_0288;
                                                }
                                            }
                                            b3 = false;
                                        }
                                        if (!b3) {
                                            b4 = false;
                                            break Label_0308;
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
                Label_0556: {
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
                                    break Label_0556;
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
                final o4m a2 = n0e.a;
                Objects.requireNonNull(a2);
                final gub d2 = a2.d;
                oyv a3;
                if (d2 != null) {
                    d2.invoke((Object)this, (Object)1);
                    a3 = oyv.a;
                }
                else {
                    a3 = null;
                }
                if (a3 == null) {
                    throw new IllegalStateException("Invalid restart scope".toString());
                }
                this.H = null;
                final veq d3 = this.D;
                final int h = tdy.h(d3.b, i) + i;
                final int g3 = d3.g;
                if (g3 < i || g3 > h) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Index ");
                    sb.append(i);
                    sb.append(" is not a parent of ");
                    sb.append(g3);
                    ea6.d(sb.toString().toString());
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
                this.B.i(n0e.a);
                final o4m a4 = n0e.a;
                final oe6 b6 = a4.b;
                if (b6 != null) {
                    final p5d f = a4.f;
                    if (f != null) {
                        a4.d(true);
                        try {
                            for (int a5 = f.a, n10 = 0; n10 < a5; ++n10) {
                                final Object o4 = f.b[n10];
                                zzd.d(o4, "null cannot be cast to non-null type kotlin.Any");
                                final int n11 = f.c[n10];
                                b6.n(o4);
                            }
                        }
                        finally {
                            a4.d(false);
                        }
                    }
                }
                this.B.h();
            }
            n0e = ea6.a((List)this.r, this.D.g, n);
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
            ea6.d("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw null;
        }
        this.q = false;
        if (this.L ^ true) {
            final veq d = this.D;
            this.r0(d.n(d.i));
            return;
        }
        ea6.d("useNode() called while inserting".toString());
        throw null;
    }
    
    public final void o0(final jub<? super xr0<?>, ? super yeq, ? super bcm, oyv> jub) {
        this.e.add((jub<xr0<?>, yeq, bcm, oyv>)jub);
    }
    
    public final void p(final Object o) {
        this.P0(o);
    }
    
    public final void p0(final jub<? super xr0<?>, ? super yeq, ? super bcm, oyv> jub) {
        this.k0();
        this.h0();
        this.o0(jub);
    }
    
    public final void q(final oll<?>[] array) {
        zzd.f((Object)array, "values");
        final k9k<re6<Object>, q7r<Object>> w = this.W(null);
        this.E0(201, ea6.g);
        this.E0(203, ea6.i);
        final s96$b0 s96$b0 = new s96$b0((oll[])array, (k9k)w);
        fjv.e((Object)s96$b0, 2);
        final k9k k9k = (k9k)s96$b0.invoke((Object)this, (Object)1);
        this.a0(false);
        k9k o0 = null;
        boolean v = false;
        Label_0213: {
            if (this.L) {
                o0 = this.O0(w, (k9k<re6<Object>, ? extends q7r<?>>)k9k);
                this.G = true;
            }
            else {
                final veq d = this.D;
                final Object h = d.h(d.g, 0);
                zzd.d(h, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                o0 = (k9k)h;
                final veq d2 = this.D;
                final Object h2 = d2.h(d2.g, 1);
                zzd.d(h2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                final k9k k9k2 = (k9k)h2;
                if (!this.i() || !zzd.a((Object)k9k2, (Object)k9k)) {
                    final k9k<re6<Object>, q7r<Object>> o2 = this.O0(w, (k9k<re6<Object>, ? extends q7r<?>>)k9k);
                    v = (true ^ zzd.a((Object)o2, (Object)o0));
                    o0 = o2;
                    break Label_0213;
                }
                this.l += this.D.s();
            }
            v = false;
        }
        if (v && !this.L) {
            this.u.put(this.D.g, (k9k<re6<Object>, q7r<Object>>)o0);
        }
        this.w.c(this.v ? 1 : 0);
        this.v = v;
        this.H = (k9k<re6<Object>, ? extends q7r<?>>)o0;
        this.D0(202, ea6.h, false, o0);
    }
    
    public final void q0() {
        A0(this, this.D.g, false, 0);
        this.i0();
        final ea6$b a = ea6.a;
        this.v0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)ea6.a);
        final int p = this.P;
        final veq d = this.D;
        this.P = tdy.h(d.b, d.g) + p;
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
        final o4m d0 = this.d0();
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
    
    public final <V, T> void t(final V v, final gub<? super T, ? super V, oyv> gub) {
        zzd.f((Object)gub, "block");
        final s96$c s96$c = new s96$c((gub)gub, (Object)v);
        if (this.L) {
            this.K.add(s96$c);
        }
        else {
            this.p0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)s96$c);
        }
    }
    
    public final void t0(final int u, final int x) {
        if (x > 0) {
            if (u < 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid remove index ");
                sb.append(u);
                ea6.d(sb.toString().toString());
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
        final veq d = this.D;
        if (d.c > 0) {
            final int i = d.i;
            if (this.S.a(-2) != i) {
                if (!this.Q && this.R) {
                    final ea6$b a = ea6.a;
                    final ea6$e d2 = ea6.d;
                    this.j0(false);
                    this.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)d2);
                    this.Q = true;
                }
                if (i > 0) {
                    final i10 a2 = d.a(i);
                    this.S.c(i);
                    final s96$y s96$y = new s96$y(a2);
                    this.j0(false);
                    this.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)s96$y);
                }
            }
        }
    }
    
    public final m4m v() {
        return (m4m)this.d0();
    }
    
    public final void v0(final jub<? super xr0<?>, ? super yeq, ? super bcm, oyv> jub) {
        this.j0(false);
        this.u0();
        this.o0(jub);
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
        if (this.O.f()) {
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
        final veq d = this.D;
        final ea6$b a = ea6.a;
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
    
    public final ne6 z() {
        return (ne6)this.c;
    }
    
    public final void z0() {
        final weq c = this.c;
        if (c.D0 > 0 && tdy.f(c.C0, 0)) {
            final ArrayList list = new ArrayList();
            this.I = list;
            final veq j = this.c.j();
            try {
                this.D = j;
                final List<jub<xr0<?>, yeq, bcm, oyv>> e = this.e;
                Label_0151: {
                    try {
                        this.e = list;
                        A0(this, 0, false, 0);
                        this.i0();
                        this.k0();
                        if (this.Q) {
                            final ea6$b a = ea6.a;
                            this.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)ea6.b);
                            if (this.Q) {
                                final ea6$a c2 = ea6.c;
                                this.j0(false);
                                this.o0((jub<? super xr0<?>, ? super yeq, ? super bcm, oyv>)c2);
                                this.Q = false;
                            }
                        }
                    }
                    finally {
                        break Label_0151;
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
    
    public static final class a implements ccm
    {
        public final b C0;
        
        public a(final b c0) {
            this.C0 = c0;
        }
        
        public final void a() {
        }
        
        public final void c() {
            this.C0.p();
        }
        
        public final void d() {
            this.C0.p();
        }
    }
    
    public final class b extends le6
    {
        public final int a;
        public final boolean b;
        public Set<Set<ne6>> c;
        public final Set<s96> d;
        public final cwj e;
        
        public b(final int a, final boolean b) {
            this.a = a;
            this.b = b;
            this.d = new LinkedHashSet();
            this.e = (cwj)nkz.r((Object)q0b.n());
        }
        
        public final void a(final dq6 dq6, final gub<? super m76, ? super Integer, oyv> gub) {
            zzd.f((Object)dq6, "composition");
            s96.this.b.a(dq6, (gub)gub);
        }
        
        public final void b(final jrh jrh) {
            s96.this.b.b(jrh);
        }
        
        public final void c() {
            final s96 f = s96.this;
            --f.z;
        }
        
        public final boolean d() {
            return this.b;
        }
        
        public final k9k<re6<Object>, q7r<Object>> e() {
            return (k9k<re6<Object>, q7r<Object>>)((nhq)this.e).getValue();
        }
        
        public final int f() {
            return this.a;
        }
        
        public final oy6 g() {
            return s96.this.b.g();
        }
        
        public final void h(final dq6 dq6) {
            zzd.f((Object)dq6, "composition");
            final s96 f = s96.this;
            f.b.h(f.g);
            s96.this.b.h(dq6);
        }
        
        public final void i(final jrh jrh, final irh irh) {
            s96.this.b.i(jrh, irh);
        }
        
        public final irh j(final jrh jrh) {
            zzd.f((Object)jrh, "reference");
            return s96.this.b.j(jrh);
        }
        
        public final void k(final Set<ne6> set) {
            HashSet c;
            if ((c = this.c) == null) {
                c = new HashSet();
                this.c = c;
            }
            c.add(set);
        }
        
        public final void l(final m76 m76) {
            this.d.add(m76);
        }
        
        public final void m() {
            final s96 f = s96.this;
            ++f.z;
        }
        
        public final void n(final m76 m76) {
            zzd.f((Object)m76, "composer");
            final HashSet c = this.c;
            if (c != null) {
                final Iterator iterator = c.iterator();
                while (iterator.hasNext()) {
                    ((Set)iterator.next()).remove(((s96)m76).c);
                }
            }
            fjv.a((Object)this.d).remove(m76);
        }
        
        public final void o(final dq6 dq6) {
            zzd.f((Object)dq6, "composition");
            s96.this.b.o(dq6);
        }
        
        public final void p() {
            if (this.d.isEmpty() ^ true) {
                final HashSet c = this.c;
                if (c != null) {
                    for (final s96 s96 : this.d) {
                        final Iterator iterator2 = c.iterator();
                        while (iterator2.hasNext()) {
                            ((Set)iterator2.next()).remove(s96.c);
                        }
                    }
                }
                this.d.clear();
            }
        }
    }
}
