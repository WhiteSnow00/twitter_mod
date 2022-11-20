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

public final class b96 implements x66
{
    public int A;
    public final s5r B;
    public boolean C;
    public nfq D;
    public ofq E;
    public qfq F;
    public boolean G;
    public r9k<wd6<Object>, ? extends m8r<?>> H;
    public List<itb<qr0<?>, qfq, qcm, fzv>> I;
    public j10 J;
    public final List<itb<qr0<?>, qfq, qcm, fzv>> K;
    public boolean L;
    public int M;
    public int N;
    public s5r O;
    public int P;
    public boolean Q;
    public boolean R;
    public final mtd S;
    public final s5r T;
    public int U;
    public int V;
    public int W;
    public int X;
    public final qr0<?> a;
    public final qd6 b;
    public final ofq c;
    public final Set<rcm> d;
    public List<itb<qr0<?>, qfq, qcm, fzv>> e;
    public List<itb<qr0<?>, qfq, qcm, fzv>> f;
    public final jp6 g;
    public final s5r h;
    public f1k i;
    public int j;
    public mtd k;
    public int l;
    public mtd m;
    public int[] n;
    public HashMap<Integer, Integer> o;
    public boolean p;
    public boolean q;
    public final List<qzd> r;
    public final mtd s;
    public r9k<wd6<Object>, ? extends m8r<?>> t;
    public final HashMap<Integer, r9k<wd6<Object>, m8r<Object>>> u;
    public boolean v;
    public final mtd w;
    public boolean x;
    public int y;
    public int z;
    
    public b96(qr0<?> j, final qd6 b, final ofq c, final Set<rcm> d, final List<itb<qr0<?>, qfq, qcm, fzv>> e, final List<itb<qr0<?>, qfq, qcm, fzv>> f, final jp6 g) {
        czd.f((Object)b, "parentContext");
        czd.f((Object)g, "composition");
        this.a = (qr0<?>)j;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = new s5r(0);
        this.k = new mtd();
        this.m = new mtd();
        this.r = new ArrayList();
        this.s = new mtd();
        this.t = chw.A0();
        this.u = new HashMap<Integer, r9k<wd6<Object>, m8r<Object>>>();
        this.w = new mtd();
        this.y = -1;
        yhq.j();
        this.B = new s5r(0);
        final nfq i = c.j();
        i.c();
        this.D = i;
        final ofq e2 = new ofq();
        this.E = e2;
        final qfq l = e2.l();
        l.f();
        this.F = l;
        j = this.E.j();
        try {
            final j10 a = j.a(0);
            j.c();
            this.J = a;
            this.K = new ArrayList();
            this.O = new s5r(0);
            this.R = true;
            this.S = new mtd();
            this.T = new s5r(0);
            this.U = -1;
            this.V = -1;
            this.W = -1;
        }
        finally {
            j.c();
        }
    }
    
    public static final int A0(final b96 b96, int n, final boolean b97, final int n2) {
        final nfq d = b96.D;
        final int[] b98 = d.b;
        final int n3 = 1;
        final int n4 = b98[n * 5 + 1];
        final int n5 = 0;
        if ((n4 & 0x8000000) != 0x0) {
            final int i = d.i(n);
            final Object j = b96.D.j(n);
            if (i == 126665345 && j instanceof mrh) {
                final mrh mrh = (mrh)j;
                final Object h = b96.D.h(n, 0);
                final j10 a = b96.D.a(n);
                final int k = b96.D.k(n);
                final ArrayList r = b96.r;
                final n96$b a2 = n96.a;
                final ArrayList list = new ArrayList();
                final int e = n96.e((List)r, n);
                int l;
                if ((l = e) < 0) {
                    l = -(e + 1);
                }
                while (l < r.size()) {
                    final qzd qzd = r.get(l);
                    if (qzd.b >= k + n) {
                        break;
                    }
                    list.add(qzd);
                    ++l;
                }
                final ArrayList list2 = new ArrayList<lvj>(list.size());
                for (int size = list.size(), n6 = 0; n6 < size; ++n6) {
                    final qzd qzd2 = list.get(n6);
                    list2.add(new lvj((Object)qzd2.a, (Object)qzd2.c));
                }
                final orh orh = new orh(mrh, h, b96.g, b96.c, a, (List)list2, (r9k)b96.W(n));
                b96.b.b(orh);
                b96.u0();
                b96.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)new b96$z(b96, orh));
                if (b97) {
                    b96.i0();
                    b96.k0();
                    b96.h0();
                    int o;
                    if (b96.D.l(n)) {
                        o = n3;
                    }
                    else {
                        o = b96.D.o(n);
                    }
                    n = n5;
                    if (o > 0) {
                        b96.t0(n2, o);
                        n = n5;
                    }
                }
                else {
                    n = b96.D.o(n);
                }
            }
            else if (i == 206 && czd.a(j, (Object)n96.k)) {
                final Object h2 = b96.D.h(n, 0);
                a a3;
                if (h2 instanceof a) {
                    a3 = (a)h2;
                }
                else {
                    a3 = null;
                }
                if (a3 != null) {
                    final Iterator iterator = a3.D0.d.iterator();
                    while (iterator.hasNext()) {
                        ((b96)iterator.next()).z0();
                    }
                }
                n = b96.D.o(n);
            }
            else {
                n = b96.D.o(n);
            }
        }
        else if (lp.g(b98, n)) {
            final int m = b96.D.k(n);
            int n7 = n + 1;
            int n8 = 0;
            while (n7 < m + n) {
                final boolean l2 = b96.D.l(n7);
                if (l2) {
                    b96.i0();
                    b96.r0(b96.D.n(n7));
                }
                final boolean b99 = l2 || b97;
                int n9;
                if (l2) {
                    n9 = 0;
                }
                else {
                    n9 = n2 + n8;
                }
                n8 += A0(b96, n7, b99, n9);
                if (l2) {
                    b96.i0();
                    b96.x0();
                }
                n7 += b96.D.k(n7);
            }
            n = n8;
        }
        else {
            n = b96.D.o(n);
        }
        return n;
    }
    
    public static final void R(final b96 b96, final mrh mrh, final r9k r9k, final Object o) {
        b96.D(126665345, mrh);
        b96.P(o);
        final int m = b96.M;
        try {
            b96.M = 126665345;
            if (b96.L) {
                qfq.w(b96.F);
            }
            boolean v = false;
            Label_0072: {
                if (!b96.L) {
                    if (!czd.a(b96.D.e(), (Object)r9k)) {
                        v = true;
                        break Label_0072;
                    }
                }
                v = false;
            }
            if (v) {
                b96.u.put(b96.D.g, r9k);
            }
            b96.D0(202, n96.h, false, r9k);
            final boolean l = b96.L;
            final boolean v2 = b96.v;
            b96.v = v;
            nza.n1((x66)b96, (ftb)io7.h(694380496, true, (Object)new e96(mrh, o)));
            b96.v = v2;
        }
        finally {
            b96.a0(false);
            b96.M = m;
            b96.a0(false);
        }
    }
    
    public static final void f0(final qfq qfq, final qr0<Object> qr0, final int n) {
        while (true) {
            final int s = qfq.s;
            if ((n > s && n < qfq.g) || (s == 0 && n == 0)) {
                break;
            }
            qfq.K();
            if (qfq.v(qfq.s)) {
                qr0.j();
            }
            qfq.j();
        }
    }
    
    public static void w0(final b96 b96, final itb itb) {
        b96.j0(false);
        b96.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)itb);
    }
    
    public final <T> void A(final nsb<? extends T> nsb) {
        czd.f((Object)nsb, "factory");
        if (!this.q) {
            n96.d("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw null;
        }
        this.q = false;
        if (this.L) {
            final mtd k = this.k;
            final int n = k.b[k.c - 1];
            final qfq f = this.F;
            final j10 b = f.b(f.s);
            ++this.l;
            this.K.add(new b96$d((nsb)nsb, b, n));
            this.T.k(new b96$e(b, n));
            return;
        }
        n96.d("createNode() can only be called when inserting".toString());
        throw null;
    }
    
    public final void B(final Object o) {
        if (this.D.f() == 207 && !czd.a(this.D.e(), o) && this.y < 0) {
            this.y = this.D.g;
            this.x = true;
        }
        this.D0(207, null, false, o);
    }
    
    public final <T> T B0(final wd6<T> wd6, final r9k<wd6<Object>, ? extends m8r<?>> r9k) {
        final n96$b a = n96.a;
        czd.f((Object)r9k, "<this>");
        czd.f((Object)wd6, "key");
        Object o;
        if (r9k.containsKey(wd6)) {
            final m8r m8r = (m8r)r9k.get(wd6);
            if (m8r != null) {
                o = m8r.getValue();
            }
            else {
                o = null;
            }
        }
        else {
            o = wd6.a.getValue();
        }
        return (T)o;
    }
    
    public final void C() {
        this.D0(-127, null, false, null);
    }
    
    public final void C0() {
        final nfq d = this.D;
        final int i = d.i;
        int n;
        if (i >= 0) {
            n = lp.n(d.b, i);
        }
        else {
            n = 0;
        }
        this.l = n;
        this.D.t();
    }
    
    public final void D(final int n, final Object o) {
        this.D0(n, o, false, null);
    }
    
    public final void D0(int n, Object o, final boolean b, Object o2) {
        final boolean q = this.q;
        final f1k f1k = null;
        if (!(q ^ true)) {
            n96.d("A call to createNode(), emitNode() or useNode() expected".toString());
            throw null;
        }
        this.I0(n, o, o2);
        final boolean l = this.L;
        final int n2 = 0;
        if (l) {
            final nfq d = this.D;
            ++d.j;
            final qfq f = this.F;
            final int r = f.r;
            if (b) {
                Objects.requireNonNull(x66.Companion);
                final x66$a$a b2 = x66$a.b;
                f.P(125, b2, true, b2);
            }
            else if (o2 != null) {
                Object b3;
                if ((b3 = o) == null) {
                    Objects.requireNonNull(x66.Companion);
                    b3 = x66$a.b;
                }
                f.P(n, b3, false, o2);
            }
            else {
                if ((o2 = o) == null) {
                    Objects.requireNonNull(x66.Companion);
                    o2 = x66$a.b;
                }
                f.O(n, o2);
            }
            final f1k i = this.i;
            if (i != null) {
                o2 = new ppe(n, (Object)(-1), -2 - r, -1);
                i.b((ppe)o2, this.j - i.b);
                i.d.add(o2);
            }
            this.c0(b, null);
            return;
        }
        Label_0466: {
            if (this.i == null) {
                if (this.D.f() == n) {
                    final nfq d2 = this.D;
                    final int g = d2.g;
                    Object p3;
                    if (g < d2.h) {
                        p3 = d2.p(d2.b, g);
                    }
                    else {
                        p3 = null;
                    }
                    if (czd.a(o, p3)) {
                        this.F0(b, o2);
                        break Label_0466;
                    }
                }
                final nfq d3 = this.D;
                Objects.requireNonNull(d3);
                final ArrayList<ppe> list = new ArrayList<ppe>();
                if (d3.j <= 0) {
                    for (int j = d3.g; j < d3.h; j += lp.i(d3.b, j)) {
                        final int[] b4 = d3.b;
                        final int n3 = b4[j * 5];
                        final Object p4 = d3.p(b4, j);
                        int n4;
                        if (lp.l(d3.b, j)) {
                            n4 = 1;
                        }
                        else {
                            n4 = lp.n(d3.b, j);
                        }
                        list.add(new ppe(n3, p4, j, n4));
                    }
                }
                this.i = new f1k(list, this.j);
            }
        }
        final f1k k = this.i;
        f1k f1k2 = f1k;
        if (k != null) {
            Object value;
            if (o != null) {
                value = new obe(n, o);
            }
            else {
                value = n;
            }
            final HashMap hashMap = (HashMap)k.f.getValue();
            final n96$b a = n96.a;
            final LinkedHashSet set = hashMap.get(value);
            Object o3 = null;
            Label_0614: {
                if (set != null) {
                    final Object h0 = mq4.h0((Iterable)set);
                    if (h0 != null) {
                        final LinkedHashSet set2 = hashMap.get(value);
                        o3 = h0;
                        if (set2 == null) {
                            break Label_0614;
                        }
                        set2.remove(h0);
                        o3 = h0;
                        if (set2.isEmpty()) {
                            hashMap.remove(value);
                            o3 = h0;
                        }
                        break Label_0614;
                    }
                }
                o3 = null;
            }
            final ppe ppe = (ppe)o3;
            if (ppe != null) {
                k.d.add(ppe);
                final int c = ppe.c;
                this.j = k.a(ppe) + k.b;
                final a8c a8c = k.e.get(ppe.c);
                if (a8c != null) {
                    n = a8c.a;
                }
                else {
                    n = -1;
                }
                final int c2 = k.c;
                final int n5 = n - c2;
                if (n > c2) {
                    final Collection<a8c> values = k.e.values();
                    czd.e((Object)values, "groupInfos.values");
                    for (final a8c a8c2 : values) {
                        final int a2 = a8c2.a;
                        if (a2 == n) {
                            a8c2.a = c2;
                        }
                        else {
                            if (c2 > a2 || a2 >= n) {
                                continue;
                            }
                            a8c2.a = a2 + 1;
                        }
                    }
                }
                else if (c2 > n) {
                    final Collection<a8c> values2 = k.e.values();
                    czd.e((Object)values2, "groupInfos.values");
                    for (final a8c a8c3 : values2) {
                        final int a3 = a8c3.a;
                        if (a3 == n) {
                            a8c3.a = c2;
                        }
                        else {
                            if (n + 1 > a3 || a3 >= c2) {
                                continue;
                            }
                            a8c3.a = a3 - 1;
                        }
                    }
                }
                this.s0(c);
                this.D.r(c);
                if (n5 > 0) {
                    this.v0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)new b96$a0(n5));
                }
                this.F0(b, o2);
                f1k2 = f1k;
            }
            else {
                final nfq d4 = this.D;
                ++d4.j;
                this.L = true;
                this.H = null;
                if (this.F.t) {
                    (this.F = this.E.l()).K();
                    this.G = false;
                    this.H = null;
                }
                this.F.e();
                final qfq f2 = this.F;
                final int r2 = f2.r;
                if (b) {
                    Objects.requireNonNull(x66.Companion);
                    final x66$a$a b5 = x66$a.b;
                    f2.P(125, b5, true, b5);
                }
                else if (o2 != null) {
                    Object b6;
                    if ((b6 = o) == null) {
                        Objects.requireNonNull(x66.Companion);
                        b6 = x66$a.b;
                    }
                    f2.P(n, b6, false, o2);
                }
                else {
                    if ((o2 = o) == null) {
                        Objects.requireNonNull(x66.Companion);
                        o2 = x66$a.b;
                    }
                    f2.O(n, o2);
                }
                this.J = this.F.b(r2);
                o = new ppe(n, (Object)(-1), -2 - r2, -1);
                k.b((ppe)o, this.j - k.b);
                k.d.add(o);
                o = new ArrayList();
                if (b) {
                    n = n2;
                }
                else {
                    n = this.j;
                }
                f1k2 = new f1k((List<ppe>)o, n);
            }
        }
        this.c0(b, f1k2);
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
            final nfq d = this.D;
            if (d.j <= 0) {
                if (!lp.l(d.b, d.g)) {
                    throw new IllegalArgumentException("Expected a node group".toString());
                }
                d.u();
            }
        }
        else {
            if (o != null && this.D.e() != o) {
                final b96$c0 b96$c0 = new b96$c0(o);
                this.j0(false);
                this.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)b96$c0);
            }
            this.D.u();
        }
    }
    
    public final void G(final a5m a5m) {
        c5m c5m;
        if (a5m instanceof c5m) {
            c5m = (c5m)a5m;
        }
        else {
            c5m = null;
        }
        if (c5m != null) {
            c5m.a |= 0x1;
        }
    }
    
    public final void G0() {
        this.D = this.c.j();
        this.D0(100, null, false, null);
        this.b.m();
        this.t = this.b.e();
        final mtd w = this.w;
        final int v = this.v ? 1 : 0;
        final n96$b a = n96.a;
        w.c(v);
        this.v = this.P(this.t);
        this.H = null;
        if (!this.p) {
            this.p = this.b.d();
        }
        final Set set = this.B0((wd6<Set>)yrd.a, this.t);
        if (set != null) {
            set.add(this.c);
            this.b.k(set);
        }
        this.D0(this.b.f(), null, false, null);
    }
    
    public final void H() {
        if (this.l == 0) {
            final c5m d0 = this.d0();
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
        n96.d("No nodes can be emitted before calling skipAndEndGroup".toString());
        throw null;
    }
    
    public final boolean H0(final c5m c5m, final Object o) {
        czd.f((Object)c5m, "scope");
        final j10 c = c5m.c;
        if (c == null) {
            return false;
        }
        final int b = c.b(this.c);
        if (this.C && b >= this.D.g) {
            final ArrayList r = this.r;
            final int e = n96.e((List)r, b);
            w4d<Object> w4d = null;
            if (e < 0) {
                final int n = -(e + 1);
                if (o != null) {
                    w4d = new w4d<Object>();
                    w4d.add(o);
                }
                r.add(n, new qzd(c5m, b, (w4d)w4d));
            }
            else if (o == null) {
                ((qzd)r.get(e)).c = null;
            }
            else {
                final w4d c2 = r.get(e).c;
                if (c2 != null) {
                    c2.add(o);
                }
            }
            return true;
        }
        return false;
    }
    
    public final void I(final nsb<fzv> nsb) {
        czd.f((Object)nsb, "effect");
        this.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)new b96$x((nsb)nsb));
    }
    
    public final void I0(final int n, final Object o, final Object o2) {
        if (o == null) {
            if (o2 != null && n == 207) {
                Objects.requireNonNull(x66.Companion);
                if (!czd.a(o2, (Object)x66$a.b)) {
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
        final n96$b a = n96.a;
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
            final c5m d0 = this.d0();
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
                Objects.requireNonNull(x66.Companion);
                if (!czd.a(o2, (Object)x66$a.b)) {
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
    
    public final qd6 M() {
        this.E0(206, n96.k);
        if (this.L) {
            qfq.w(this.F);
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
        final b d0 = a2.D0;
        final r9k<wd6<Object>, m8r<Object>> w = this.W(null);
        Objects.requireNonNull(d0);
        czd.f((Object)w, "scope");
        d0.e.setValue((Object)w);
        this.a0(false);
        return a2.D0;
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
                    bt0.E0(n3, -1);
                    this.n = n3;
                }
                n3[n] = n2;
            }
        }
    }
    
    public final void N() {
        this.a0(false);
    }
    
    public final void N0(int i, final int n) {
        final int q0 = this.Q0(i);
        if (q0 != n) {
            int n2 = this.h.g() - 1;
            while (i != -1) {
                final int n3 = this.Q0(i) + (n - q0);
                this.M0(i, n3);
                int n4 = n2;
                int n5;
                while (true) {
                    n5 = n2;
                    if (-1 >= n4) {
                        break;
                    }
                    final f1k f1k = ((ArrayList)this.h.E0).get(n4);
                    if (f1k != null && f1k.c(i, n3)) {
                        n5 = n4 - 1;
                        break;
                    }
                    --n4;
                }
                if (i < 0) {
                    i = this.D.i;
                    n2 = n5;
                }
                else {
                    if (this.D.l(i)) {
                        break;
                    }
                    i = this.D.q(i);
                    n2 = n5;
                }
            }
        }
    }
    
    public final void O() {
        this.a0(false);
    }
    
    public final r9k<wd6<Object>, m8r<Object>> O0(final r9k<wd6<Object>, ? extends m8r<?>> r9k, final r9k<wd6<Object>, ? extends m8r<?>> r9k2) {
        final r9k.r9k$a<wd6<Object>, ? extends m8r<?>> k = r9k.k();
        ((Map)k).putAll(r9k2);
        final r9k b = ((r9k$a)k).b();
        this.E0(204, n96.j);
        this.P(b);
        this.P(r9k2);
        this.a0(false);
        return b;
    }
    
    public final boolean P(final Object o) {
        boolean b;
        if (!czd.a(this.g0(), o)) {
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
            if (o instanceof rcm) {
                this.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)new b96$d0(o));
                this.d.add((rcm)o);
            }
        }
        else {
            final nfq d = this.D;
            final int k = d.k;
            final int q = lp.q(d.b, d.i);
            if (o instanceof rcm) {
                this.d.add((rcm)o);
            }
            final b96$e0 b96$e0 = new b96$e0(o, k - q - 1);
            this.j0(true);
            this.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)b96$e0);
        }
    }
    
    public final void Q() {
        this.S();
        this.h.f();
        this.k.c = 0;
        this.m.c = 0;
        this.s.c = 0;
        this.w.c = 0;
        this.u.clear();
        final nfq d = this.D;
        if (!d.f) {
            d.c();
        }
        final qfq f = this.F;
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
        this.B.f();
        this.n = null;
        this.o = null;
    }
    
    public final void T(final v4d<c5m, w4d<Object>> v4d, final ftb<? super x66, ? super Integer, fzv> ftb) {
        czd.f((Object)v4d, "invalidationsRequested");
        if (this.e.isEmpty()) {
            this.Y(v4d, ftb);
            return;
        }
        n96.d("Expected applyChanges() to have been called".toString());
        throw null;
    }
    
    public final int U(final int n, final int n2, int n3) {
        if (n != n2) {
            final nfq d = this.D;
            int n4;
            if (lp.k(d.b, n)) {
                final Object j = d.j(n);
                if (j != null) {
                    if (j instanceof Enum) {
                        n4 = ((Enum)j).ordinal();
                    }
                    else if (j instanceof mrh) {
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
                        Objects.requireNonNull(x66.Companion);
                        if (!czd.a(g, (Object)x66$a.b)) {
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
        n96.g(this.F.t);
        final ofq e = new ofq();
        this.E = e;
        final qfq l = e.l();
        l.f();
        this.F = l;
    }
    
    public final r9k<wd6<Object>, m8r<Object>> W(final Integer n) {
        if (n == null) {
            final r9k<wd6<Object>, ? extends m8r<?>> h = this.H;
            if (h != null) {
                return (r9k<wd6<Object>, m8r<Object>>)h;
            }
        }
        if (this.L && this.G) {
            for (int i = this.F.s; i > 0; i = this.F.C(i)) {
                final qfq f = this.F;
                if (f.b[f.p(i) * 5] == 202 && czd.a(this.F.q(i), (Object)n96.h)) {
                    final Object o = this.F.o(i);
                    czd.d(o, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                    return (r9k<wd6<Object>, m8r<Object>>)(this.H = (r9k<wd6<Object>, ? extends m8r<?>>)o);
                }
            }
        }
        final nfq d = this.D;
        if (d.c > 0) {
            int j;
            if (n != null) {
                j = n;
            }
            else {
                j = d.i;
            }
            while (j > 0) {
                if (this.D.i(j) == 202 && czd.a(this.D.j(j), (Object)n96.h)) {
                    r9k h2;
                    if ((h2 = this.u.get(j)) == null) {
                        final Object g = this.D.g(j);
                        czd.d(g, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        h2 = (r9k)g;
                    }
                    return (r9k<wd6<Object>, m8r<Object>>)(this.H = h2);
                }
                j = this.D.q(j);
            }
        }
        return (r9k<wd6<Object>, m8r<Object>>)(this.H = this.t);
    }
    
    public final void X() {
        Trace.beginSection("Compose:Composer.dispose");
        try {
            this.b.n((x66)this);
            this.B.f();
            this.r.clear();
            this.e.clear();
            this.u.clear();
            this.a.clear();
        }
        finally {
            Trace.endSection();
        }
    }
    
    public final void Y(final v4d<c5m, w4d<Object>> v4d, final ftb<? super x66, ? super Integer, fzv> ftb) {
        if (this.C ^ true) {
            Trace.beginSection("Compose:recompose");
            try {
                this.A = yhq.j().d();
                this.u.clear();
                for (int c = v4d.c, i = 0; i < c; ++i) {
                    final Object o = v4d.a[i];
                    czd.d(o, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    final w4d w4d = (w4d)v4d.b[i];
                    final c5m c5m = (c5m)o;
                    final j10 c2 = c5m.c;
                    if (c2 == null) {
                        return;
                    }
                    this.r.add(new qzd(c5m, c2.a, w4d));
                }
                final ArrayList r = this.r;
                if (r.size() > 1) {
                    jq4.K((List)r, (Comparator)new b96$j());
                }
                this.j = 0;
                this.C = true;
                try {
                    this.G0();
                    final Object g0 = this.g0();
                    if (g0 != ftb && ftb != null) {
                        this.P0(ftb);
                    }
                    blz.R((qsb)new b96$g(this), (qsb)new b96$h(this), (nsb)new b96$i((ftb)ftb, this, g0));
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
        n96.d("Reentrant composition is not supported".toString());
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
            final qfq f = this.F;
            final int s = f.s;
            this.K0(f.b[f.p(s) * 5], this.F.q(s), this.F.o(s));
        }
        else {
            final nfq d = this.D;
            final int i = d.i;
            this.K0(d.i(i), this.D.j(i), this.D.g(i));
        }
        final int l = this.l;
        final f1k j = this.i;
        if (j != null && j.a.size() > 0) {
            final List<ppe> a = j.a;
            final ArrayList d2 = j.d;
            czd.f((Object)d2, "<this>");
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
                final ppe ppe = a.get(n);
                if (!set.contains(ppe)) {
                    this.t0(j.a(ppe) + j.b, ppe.d);
                    j.c(ppe.c, 0);
                    this.s0(ppe.c);
                    this.D.r(ppe.c);
                    this.q0();
                    this.D.s();
                    final ArrayList r = this.r;
                    final int c = ppe.c;
                    n96.b((List)r, c, this.D.k(c) + c);
                }
                else if (!set2.contains(ppe)) {
                    if (n2 < size2) {
                        final ppe ppe2 = d2.get(n2);
                        int n4;
                        if (ppe2 != ppe) {
                            final int a2 = j.a(ppe2);
                            set2.add(ppe2);
                            if (a2 != n3) {
                                final int d3 = j.d(ppe2);
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
                                    final Collection<a8c> values = j.e.values();
                                    czd.e((Object)values, "groupInfos.values");
                                    final Iterator<Object> iterator = values.iterator();
                                    while (true) {
                                        n4 = n;
                                        if (!iterator.hasNext()) {
                                            break;
                                        }
                                        final a8c a8c = iterator.next();
                                        final int b3 = a8c.b;
                                        if (a2 <= b3 && b3 < a2 + d3) {
                                            a8c.b = b3 - a2 + n3;
                                        }
                                        else {
                                            if (n3 > b3 || b3 >= a2) {
                                                continue;
                                            }
                                            a8c.b = b3 + d3;
                                        }
                                    }
                                }
                                else {
                                    n4 = n;
                                    if (n3 > a2) {
                                        final Collection<a8c> values2 = j.e.values();
                                        czd.e((Object)values2, "groupInfos.values");
                                        final Iterator<Object> iterator2 = values2.iterator();
                                        while (true) {
                                            n4 = n;
                                            if (!iterator2.hasNext()) {
                                                break;
                                            }
                                            final a8c a8c2 = iterator2.next();
                                            final int b4 = a8c2.b;
                                            if (a2 <= b4 && b4 < a2 + d3) {
                                                a8c2.b = b4 - a2 + n3;
                                            }
                                            else {
                                                if (a2 + 1 > b4 || b4 >= n3) {
                                                    continue;
                                                }
                                                a8c2.b = b4 - d3;
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
                        n3 += j.d(ppe2);
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
            final nfq d4 = this.D;
            if (d4.j > 0 || d4.g == d4.h) {
                break;
            }
            final int g = d4.g;
            this.q0();
            this.t0(m, this.D.s());
            n96.b((List)this.r, g, this.D.g);
        }
        final boolean l2 = this.L;
        int n6;
        if (l2) {
            int n5 = l;
            if (b) {
                this.K.add(this.T.j());
                n5 = 1;
            }
            final nfq d5 = this.D;
            final int j2 = d5.j;
            if (j2 <= 0) {
                throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
            }
            d5.j = j2 - 1;
            final qfq f2 = this.F;
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
                    this.v0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)new g96(this.E, j3));
                }
                else {
                    final List p = mq4.P0((Collection)this.K);
                    this.K.clear();
                    this.k0();
                    this.h0();
                    this.v0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)new h96(this.E, j3, p));
                }
                this.L = false;
                final boolean b6 = this.c.E0 == 0;
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
                n96.d("Missed recording an endGroup".toString());
                throw null;
            }
            if (this.S.a(-1) == i2) {
                this.S.b();
                final n96$b a3 = n96.a;
                final n96$a c2 = n96.c;
                this.j0(false);
                this.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)c2);
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
        final f1k i4 = (f1k)this.h.j();
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
            final n96$b a = n96.a;
            final n96$a c = n96.c;
            this.j0(false);
            this.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)c);
            this.Q = false;
        }
        this.k0();
        if (!((ArrayList)this.h.E0).isEmpty()) {
            n96.d("Start/end imbalance".toString());
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
        n96.d("Missed recording an endGroup()".toString());
        throw null;
    }
    
    public final void c() {
        this.x = (this.y >= 0);
    }
    
    public final void c0(final boolean b, final f1k i) {
        this.h.k(this.i);
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
    
    public final c5m d0() {
        final s5r b = this.B;
        c5m c5m;
        if (this.z == 0 && b.i()) {
            c5m = ((ArrayList)b.E0).get(b.g() - 1);
        }
        else {
            c5m = null;
        }
        return c5m;
    }
    
    public final boolean e(final long n) {
        final Object g0 = this.g0();
        if (g0 instanceof Long && n == ((Number)g0).longValue()) {
            return false;
        }
        this.P0(n);
        return true;
    }
    
    public final void e0(final List<lvj<orh, orh>> list) {
        final List<itb<qr0<?>, qfq, qcm, fzv>> f = this.f;
        final List<itb<qr0<?>, qfq, qcm, fzv>> e = this.e;
        try {
            this.e = f;
            final n96$b a = n96.a;
            this.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)n96.e);
            final ArrayList<?> list2 = (ArrayList<?>)list;
            final int size = list2.size();
            int i = 0;
            while (i < size) {
                final lvj lvj = (lvj)list2.get(i);
                final orh orh = (orh)lvj.D0;
                final orh orh2 = (orh)lvj.E0;
                Object o = orh.e;
                final int g = orh.d.g((j10)o);
                final p7m p7m = new p7m();
                this.k0();
                this.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)new b96$l(p7m, (j10)o));
                Label_0655: {
                    if (orh2 == null) {
                        if (czd.a((Object)orh.d, (Object)this.E)) {
                            this.V();
                        }
                        final Object o2 = orh.d.j();
                        try {
                            ((nfq)o2).r(g);
                            this.P = g;
                            final ArrayList list3 = new ArrayList();
                            this.m0((jp6)null, (jp6)null, (Integer)null, (List<lvj<c5m, w4d<Object>>>)f2a.D0, (nsb<?>)new b96$m(this, (List)list3, (nfq)o2, orh));
                            Label_0247: {
                                if (list3.isEmpty() ^ true) {
                                    this.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)new b96$n(p7m, (List)list3));
                                    break Label_0247;
                                }
                                break Label_0247;
                            }
                            break Label_0655;
                        }
                        finally {
                            ((nfq)o2).c();
                        }
                    }
                    Object d = this.b.j(orh2);
                    ofq ofq;
                    if (d == null || (ofq = ((nrh)d).a) == null) {
                        ofq = orh2.d;
                    }
                    j10 j10 = null;
                    Label_0336: {
                        if (d != null) {
                            final ofq a2 = ((nrh)d).a;
                            if (a2 != null) {
                                j10 = a2.e();
                                break Label_0336;
                            }
                        }
                        j10 = orh2.e;
                    }
                    int[] n = (Object)new ArrayList();
                    Object o3 = ofq.j();
                    try {
                        n96.c((nfq)o3, (List)(Object)n, ofq.g(j10));
                        ((nfq)o3).c();
                        if (((ArrayList)(Object)n).isEmpty() ^ true) {
                            o3 = new b96$o(p7m, (List)(Object)n);
                            this.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)o3);
                            if (czd.a((Object)orh.d, (Object)this.c)) {
                                final int g2 = this.c.g((j10)o);
                                this.M0(g2, this.Q0(g2) + ((ArrayList)(Object)n).size());
                            }
                        }
                        this.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)new b96$p((nrh)d, this, orh2, orh));
                        d = ofq.j();
                        try {
                            o = this.D;
                            n = this.n;
                            this.n = null;
                            try {
                                this.D = (nfq)d;
                                final int g3 = ofq.g(j10);
                                ((nfq)d).r(g3);
                                this.P = g3;
                                final ArrayList e2 = new ArrayList();
                                Object o2 = this.e;
                                try {
                                    this.e = e2;
                                    final jp6 c = orh2.c;
                                    o3 = orh.c;
                                    final int g4 = ((nfq)d).g;
                                    final List f2 = orh2.f;
                                    final b96$q b96$q = new b96$q(this, orh);
                                    try {
                                        this.m0(c, (jp6)o3, Integer.valueOf(g4), (List<lvj<c5m, w4d<Object>>>)f2, (nsb<?>)b96$q);
                                        this.e = (List<itb<qr0<?>, qfq, qcm, fzv>>)o2;
                                        if (e2.isEmpty() ^ true) {
                                            o2 = new b96$r(p7m, (List)e2);
                                            this.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)o2);
                                        }
                                        this.D = (nfq)o;
                                        this.n = n;
                                        ((nfq)d).c();
                                        o2 = n96.a;
                                        this.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)n96.b);
                                        ++i;
                                    }
                                    finally {}
                                }
                                finally {}
                                this.e = (List<itb<qr0<?>, qfq, qcm, fzv>>)o2;
                            }
                            finally {
                                this.D = (nfq)o;
                                this.n = n;
                            }
                        }
                        finally {
                            ((nfq)d).c();
                        }
                    }
                    finally {
                        ((nfq)o3).c();
                    }
                }
                break;
            }
            this.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)b96$s.D0);
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
                final nfq d = this.D;
                final int g = d.g;
                final int h = d.h;
                int i = g;
                while (i < h) {
                    final nfq d2 = this.D;
                    final b96$f b96$f = new b96$f(this, i);
                    Objects.requireNonNull(d2);
                    final int q = lp.q(d2.b, i);
                    final int n = i + 1;
                    final ofq a = d2.a;
                    int n2;
                    if (n < a.E0) {
                        n2 = lp.h(a.D0, n);
                    }
                    else {
                        n2 = a.G0;
                    }
                    int n3 = q;
                    while (true) {
                        i = n;
                        if (n3 >= n2) {
                            break;
                        }
                        b96$f.invoke((Object)(n3 - q), d2.d[n3]);
                        ++n3;
                    }
                }
                n96.b((List)this.r, g, h);
                this.D.r(g);
                this.D.t();
            }
            return;
        }
        n96.d("No nodes can be emitted before calling dactivateToEndGroup".toString());
        throw null;
    }
    
    public final Object g0() {
        Object o;
        if (this.L) {
            if (!(this.q ^ true)) {
                n96.d("A call to createNode(), emitNode() or useNode() expected".toString());
                throw null;
            }
            Objects.requireNonNull(x66.Companion);
            o = x66$a.b;
        }
        else {
            o = this.D.m();
            if (this.x) {
                Objects.requireNonNull(x66.Companion);
                o = x66$a.b;
            }
        }
        return o;
    }
    
    public final x66 h(int e) {
        qzd qzd = null;
        final int n = 0;
        this.D0(e, null, false, null);
        if (this.L) {
            final jp6 g = this.g;
            czd.d((Object)g, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            final c5m c5m = new c5m((td6)g);
            this.B.k(c5m);
            this.P0(c5m);
            c5m.e = this.A;
            c5m.a &= 0xFFFFFFEF;
        }
        else {
            final ArrayList r = this.r;
            e = n96.e((List)r, this.D.i);
            if (e >= 0) {
                qzd = (qzd)r.remove(e);
            }
            final Object m = this.D.m();
            Objects.requireNonNull(x66.Companion);
            c5m c5m2;
            if (czd.a(m, (Object)x66$a.b)) {
                final jp6 g2 = this.g;
                czd.d((Object)g2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                c5m2 = new c5m((td6)g2);
                this.P0(c5m2);
            }
            else {
                czd.d(m, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                c5m2 = (c5m)m;
            }
            e = n;
            if (qzd != null) {
                e = 1;
            }
            if (e != 0) {
                c5m2.a |= 0x8;
            }
            else {
                c5m2.a &= 0xFFFFFFF7;
            }
            this.B.k(c5m2);
            c5m2.e = this.A;
            c5m2.a &= 0xFFFFFFEF;
        }
        return (x66)this;
    }
    
    public final void h0() {
        if (this.O.i()) {
            final s5r o = this.O;
            final int size = ((ArrayList)o.E0).size();
            final Object[] array = new Object[size];
            for (int i = 0; i < size; ++i) {
                array[i] = ((ArrayList)o.E0).get(i);
            }
            this.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)new f96(array));
            this.O.f();
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
                    final c5m d0 = this.d0();
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
                this.p0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)new b96$t(u, x));
            }
            else {
                final int v = this.V;
                this.V = -1;
                final int w = this.W;
                this.W = -1;
                this.p0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)new b96$u(v, w, x));
            }
        }
    }
    
    public final qr0<?> j() {
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
                this.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)new b96$v(n));
                this.P = p;
            }
            return;
        }
        n96.d("Tried to seek backward".toString());
        throw null;
    }
    
    public final lxo k() {
        final boolean i = this.B.i();
        final lxo lxo = null;
        c5m c5m;
        if (i) {
            c5m = (c5m)this.B.j();
        }
        else {
            c5m = null;
        }
        if (c5m != null) {
            c5m.a &= 0xFFFFFFF7;
        }
        final int n = 1;
        if (c5m != null) {
            final int a = this.A;
            final u4d f = c5m.f;
            Object o = null;
            Label_0192: {
                Label_0189: {
                    if (f != null && (c5m.a & 0x10) == 0x0) {
                        final int a2 = f.a;
                        int j = 0;
                        while (true) {
                            while (j < a2) {
                                czd.d(f.b[j], "null cannot be cast to non-null type kotlin.Any");
                                if (f.c[j] != a) {
                                    final boolean b = true;
                                    if (b) {
                                        o = new b5m(c5m, a, f);
                                        break Label_0192;
                                    }
                                    break Label_0189;
                                }
                                else {
                                    ++j;
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
                this.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)new b96$k((qsb)o, this));
            }
        }
        lxo lxo2 = lxo;
        Label_0354: {
            if (c5m != null) {
                final int a3 = c5m.a;
                final boolean b2 = (a3 & 0x10) != 0x0;
                lxo2 = lxo;
                if (!b2) {
                    int n2;
                    if ((a3 & 0x1) != 0x0) {
                        n2 = n;
                    }
                    else {
                        n2 = 0;
                    }
                    if (n2 == 0) {
                        lxo2 = lxo;
                        if (!this.p) {
                            break Label_0354;
                        }
                    }
                    if (c5m.c == null) {
                        j10 c;
                        if (this.L) {
                            final qfq f2 = this.F;
                            c = f2.b(f2.s);
                        }
                        else {
                            final nfq d = this.D;
                            c = d.a(d.i);
                        }
                        c5m.c = c;
                    }
                    c5m.a &= 0xFFFFFFFB;
                    lxo2 = (lxo)c5m;
                }
            }
        }
        this.a0(false);
        return lxo2;
    }
    
    public final void k0() {
        final int n = this.N;
        if (n > 0) {
            this.N = 0;
            this.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)new b96$w(n));
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
    
    public final boolean l0(final v4d<c5m, w4d<Object>> v4d) {
        czd.f((Object)v4d, "invalidationsRequested");
        if (!this.e.isEmpty()) {
            n96.d("Expected applyChanges() to have been called".toString());
            throw null;
        }
        if (v4d.c <= 0 && !(this.r.isEmpty() ^ true)) {
            return false;
        }
        this.Y(v4d, null);
        return this.e.isEmpty() ^ true;
    }
    
    public final <T> T m(final wd6<T> wd6) {
        czd.f((Object)wd6, "key");
        return this.B0(wd6, this.W(null));
    }
    
    public final <R> R m0(final jp6 jp6, final jp6 jp7, final Integer n, final List<lvj<c5m, w4d<Object>>> list, final nsb<? extends R> nsb) {
        final boolean r = this.R;
        final boolean c = this.C;
        final int j = this.j;
        try {
            this.R = false;
            this.C = true;
            this.j = 0;
            for (int size = list.size(), i = 0; i < size; ++i) {
                final lvj lvj = list.get(i);
                final c5m c5m = (c5m)lvj.D0;
                final w4d w4d = (w4d)lvj.E0;
                if (w4d != null) {
                    for (int d0 = w4d.D0, k = 0; k < d0; ++k) {
                        this.H0(c5m, w4d.get(k));
                    }
                }
                else {
                    this.H0(c5m, null);
                }
            }
            if (jp6 != null) {
                int intValue;
                if (n != null) {
                    intValue = n;
                }
                else {
                    intValue = -1;
                }
                final Object o;
                if ((o = jp6.c(jp7, intValue, (nsb)nsb)) != null) {
                    return (R)o;
                }
            }
            Object o = nsb.invoke();
            return (R)o;
        }
        finally {
            this.R = r;
            this.C = c;
            this.j = j;
        }
    }
    
    public final sx6 n() {
        return this.b.g();
    }
    
    public final void n0() {
        final boolean c = this.C;
        this.C = true;
        final nfq d = this.D;
        final int i = d.i;
        final int n = d.k(i) + i;
        final int j = this.j;
        final int m = this.M;
        final int l = this.l;
        qzd qzd = n96.a((List)this.r, this.D.g, n);
        int n2 = i;
        boolean b = false;
        while (qzd != null) {
            final int b2 = qzd.b;
            final ArrayList r = this.r;
            final int e = n96.e((List)r, b2);
            if (e >= 0) {
                final qzd qzd2 = r.remove(e);
            }
            final c5m a = qzd.a;
            final w4d c2 = qzd.c;
            Objects.requireNonNull(a);
            boolean b5 = false;
            Label_0322: {
                if (c2 != null) {
                    final v4d g = a.g;
                    if (g != null) {
                        if (c2.g()) {
                            boolean b4 = false;
                            Label_0311: {
                                if (!c2.isEmpty()) {
                                    for (int k = 0; k < c2.D0; ++k) {
                                        final Object o = c2.E0[k];
                                        czd.d(o, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                        boolean b3 = false;
                                        Label_0293: {
                                            if (o instanceof ap8) {
                                                final ap8 ap8 = (ap8)o;
                                                Object o2;
                                                if ((o2 = ap8.a()) == null) {
                                                    o2 = mlr.a;
                                                }
                                                if (((hiq)o2).b(ap8.c(), g.b((Object)ap8))) {
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
                final c5m a2 = qzd.a;
                Objects.requireNonNull(a2);
                final ftb d2 = a2.d;
                fzv a3;
                if (d2 != null) {
                    d2.invoke((Object)this, (Object)1);
                    a3 = fzv.a;
                }
                else {
                    a3 = null;
                }
                if (a3 == null) {
                    throw new IllegalStateException("Invalid restart scope".toString());
                }
                this.H = null;
                final nfq d3 = this.D;
                final int h = lp.i(d3.b, i) + i;
                final int g3 = d3.g;
                if (g3 < i || g3 > h) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Index ");
                    sb.append(i);
                    sb.append(" is not a parent of ");
                    sb.append(g3);
                    n96.d(sb.toString().toString());
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
                this.B.k(qzd.a);
                final c5m a4 = qzd.a;
                final td6 b6 = a4.b;
                if (b6 != null) {
                    final u4d f = a4.f;
                    if (f != null) {
                        a4.d(true);
                        try {
                            for (int a5 = f.a, n10 = 0; n10 < a5; ++n10) {
                                final Object o4 = f.b[n10];
                                czd.d(o4, "null cannot be cast to non-null type kotlin.Any");
                                final int n11 = f.c[n10];
                                b6.o(o4);
                            }
                        }
                        finally {
                            a4.d(false);
                        }
                    }
                }
                this.B.j();
            }
            qzd = n96.a((List)this.r, this.D.g, n);
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
            n96.d("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw null;
        }
        this.q = false;
        if (this.L ^ true) {
            final nfq d = this.D;
            this.r0(d.n(d.i));
            return;
        }
        n96.d("useNode() called while inserting".toString());
        throw null;
    }
    
    public final void o0(final itb<? super qr0<?>, ? super qfq, ? super qcm, fzv> itb) {
        this.e.add((itb<qr0<?>, qfq, qcm, fzv>)itb);
    }
    
    public final void p(final Object o) {
        this.P0(o);
    }
    
    public final void p0(final itb<? super qr0<?>, ? super qfq, ? super qcm, fzv> itb) {
        this.k0();
        this.h0();
        this.o0(itb);
    }
    
    public final void q(final bml<?>[] array) {
        czd.f((Object)array, "values");
        final r9k<wd6<Object>, m8r<Object>> w = this.W(null);
        this.E0(201, n96.g);
        this.E0(203, n96.i);
        final b96$b0 b96$b0 = new b96$b0((bml[])array, (r9k)w);
        ckv.e((Object)b96$b0, 2);
        final r9k r9k = (r9k)b96$b0.invoke((Object)this, (Object)1);
        this.a0(false);
        r9k<wd6<Object>, m8r<Object>> o0 = null;
        boolean v = false;
        Label_0220: {
            if (this.L) {
                o0 = this.O0(w, r9k);
                this.G = true;
            }
            else {
                final nfq d = this.D;
                final Object h = d.h(d.g, 0);
                czd.d(h, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                o0 = (r9k<wd6<Object>, m8r<Object>>)h;
                final nfq d2 = this.D;
                final Object h2 = d2.h(d2.g, 1);
                czd.d(h2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                final r9k r9k2 = (r9k)h2;
                if (!this.i() || !czd.a((Object)r9k2, (Object)r9k)) {
                    final r9k<wd6<Object>, m8r<Object>> o2 = this.O0(w, r9k);
                    v = (true ^ czd.a((Object)o2, (Object)o0));
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
        this.D0(202, n96.h, false, o0);
    }
    
    public final void q0() {
        A0(this, this.D.g, false, 0);
        this.i0();
        final n96$b a = n96.a;
        this.v0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)n96.a);
        final int p = this.P;
        final nfq d = this.D;
        this.P = lp.i(d.b, d.g) + p;
    }
    
    public final void r() {
        this.a0(true);
    }
    
    public final void r0(final Object o) {
        this.O.k(o);
    }
    
    public final void s() {
        boolean b = false;
        this.a0(false);
        final c5m d0 = this.d0();
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
    
    public final <V, T> void t(final V v, final ftb<? super T, ? super V, fzv> ftb) {
        czd.f((Object)ftb, "block");
        final b96$c b96$c = new b96$c((ftb)ftb, (Object)v);
        if (this.L) {
            this.K.add(b96$c);
        }
        else {
            this.p0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)b96$c);
        }
    }
    
    public final void t0(final int u, final int x) {
        if (x > 0) {
            if (u < 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid remove index ");
                sb.append(u);
                n96.d(sb.toString().toString());
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
        final nfq d = this.D;
        if (d.c > 0) {
            final int i = d.i;
            if (this.S.a(-2) != i) {
                if (!this.Q && this.R) {
                    final n96$b a = n96.a;
                    final n96$e d2 = n96.d;
                    this.j0(false);
                    this.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)d2);
                    this.Q = true;
                }
                if (i > 0) {
                    final j10 a2 = d.a(i);
                    this.S.c(i);
                    final b96$y b96$y = new b96$y(a2);
                    this.j0(false);
                    this.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)b96$y);
                }
            }
        }
    }
    
    public final a5m v() {
        return (a5m)this.d0();
    }
    
    public final void v0(final itb<? super qr0<?>, ? super qfq, ? super qcm, fzv> itb) {
        this.j0(false);
        this.u0();
        this.o0(itb);
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
        if (this.O.i()) {
            this.O.j();
        }
        else {
            ++this.N;
        }
    }
    
    public final Object y() {
        return this.g0();
    }
    
    public final void y0(final int n, final int n2, int n3) {
        final nfq d = this.D;
        final n96$b a = n96.a;
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
    
    public final sd6 z() {
        return (sd6)this.c;
    }
    
    public final void z0() {
        final ofq c = this.c;
        if (c.E0 > 0 && lp.g(c.D0, 0)) {
            final ArrayList list = new ArrayList();
            this.I = list;
            final nfq j = this.c.j();
            try {
                this.D = j;
                final List<itb<qr0<?>, qfq, qcm, fzv>> e = this.e;
                Label_0156: {
                    try {
                        this.e = list;
                        A0(this, 0, false, 0);
                        this.i0();
                        this.k0();
                        if (this.Q) {
                            final n96$b a = n96.a;
                            this.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)n96.b);
                            if (this.Q) {
                                final n96$a c2 = n96.c;
                                this.j0(false);
                                this.o0((itb<? super qr0<?>, ? super qfq, ? super qcm, fzv>)c2);
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
    
    public static final class a implements rcm
    {
        public final b D0;
        
        public a(final b d0) {
            this.D0 = d0;
        }
        
        @Override
        public final void a() {
        }
        
        @Override
        public final void c() {
            this.D0.p();
        }
        
        @Override
        public final void d() {
            this.D0.p();
        }
    }
    
    public final class b extends qd6
    {
        public final int a;
        public final boolean b;
        public Set<Set<sd6>> c;
        public final Set<b96> d;
        public final hwj e;
        public final b96 f;
        
        public b(final b96 f, final int a, final boolean b) {
            this.f = f;
            this.a = a;
            this.b = b;
            this.d = new LinkedHashSet();
            this.e = (hwj)blz.Q(chw.A0());
        }
        
        @Override
        public final void a(final jp6 jp6, final ftb<? super x66, ? super Integer, fzv> ftb) {
            czd.f((Object)jp6, "composition");
            this.f.b.a(jp6, ftb);
        }
        
        @Override
        public final void b(final orh orh) {
            this.f.b.b(orh);
        }
        
        @Override
        public final void c() {
            final b96 f = this.f;
            --f.z;
        }
        
        @Override
        public final boolean d() {
            return this.b;
        }
        
        @Override
        public final r9k<wd6<Object>, m8r<Object>> e() {
            return (r9k)this.e.getValue();
        }
        
        @Override
        public final int f() {
            return this.a;
        }
        
        @Override
        public final sx6 g() {
            return this.f.b.g();
        }
        
        @Override
        public final void h(final jp6 jp6) {
            czd.f((Object)jp6, "composition");
            final b96 f = this.f;
            f.b.h(f.g);
            this.f.b.h(jp6);
        }
        
        @Override
        public final void i(final orh orh, final nrh nrh) {
            this.f.b.i(orh, nrh);
        }
        
        @Override
        public final nrh j(final orh orh) {
            czd.f((Object)orh, "reference");
            return this.f.b.j(orh);
        }
        
        @Override
        public final void k(final Set<sd6> set) {
            HashSet c;
            if ((c = this.c) == null) {
                c = new HashSet();
                this.c = c;
            }
            c.add(set);
        }
        
        @Override
        public final void l(final x66 x66) {
            this.d.add(x66);
        }
        
        @Override
        public final void m() {
            final b96 f = this.f;
            ++f.z;
        }
        
        @Override
        public final void n(final x66 x66) {
            czd.f((Object)x66, "composer");
            final HashSet c = this.c;
            if (c != null) {
                final Iterator iterator = c.iterator();
                while (iterator.hasNext()) {
                    ((Set)iterator.next()).remove(((b96)x66).c);
                }
            }
            ckv.a((Object)this.d).remove(x66);
        }
        
        @Override
        public final void o(final jp6 jp6) {
            czd.f((Object)jp6, "composition");
            this.f.b.o(jp6);
        }
        
        public final void p() {
            if (this.d.isEmpty() ^ true) {
                final HashSet c = this.c;
                if (c != null) {
                    for (final b96 b96 : this.d) {
                        final Iterator iterator2 = c.iterator();
                        while (iterator2.hasNext()) {
                            ((Set)iterator2.next()).remove(b96.c);
                        }
                    }
                }
                this.d.clear();
            }
        }
    }
}
