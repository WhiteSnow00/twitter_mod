import java.util.Collection;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qfq
{
    public static final a Companion;
    public final ofq a;
    public int[] b;
    public Object[] c;
    public ArrayList<j10> d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public final mtd o;
    public final mtd p;
    public final mtd q;
    public int r;
    public int s;
    public boolean t;
    public ozk u;
    
    static {
        Companion = new a();
    }
    
    public qfq(final ofq a) {
        czd.f((Object)a, "table");
        this.a = a;
        final int[] d0 = a.D0;
        this.b = d0;
        final Object[] f0 = a.F0;
        this.c = f0;
        this.d = a.K0;
        final int e0 = a.E0;
        this.e = e0;
        this.f = d0.length / 5 - e0;
        this.g = e0;
        final int g0 = a.G0;
        this.j = g0;
        this.k = f0.length - g0;
        this.l = e0;
        this.o = new mtd();
        this.p = new mtd();
        this.q = new mtd();
        this.s = -1;
    }
    
    public static void w(final qfq qfq) {
        final int s = qfq.s;
        final int p = qfq.p(s);
        final int[] b = qfq.b;
        boolean b2 = true;
        final int n = p * 5 + 1;
        if ((b[n] & 0x8000000) == 0x0) {
            b2 = false;
        }
        if (!b2) {
            b[n] |= 0x8000000;
            if (!lp.g(b, p)) {
                qfq.S(qfq.C(s));
            }
        }
    }
    
    public final List<j10> A(final j10 j10, final int n, final qfq qfq) {
        czd.f((Object)j10, "anchor");
        final int m = ((qfq)n).m;
        final boolean b = false;
        n96.g(m > 0);
        n96.g(this.m == 0);
        n96.g(j10.a());
        final int n2 = this.c(j10) + 1;
        final int r = this.r;
        n96.g(r <= n2 && n2 < this.g);
        int i = this.C(n2);
        final int r2 = this.r(n2);
        int n3;
        if (this.v(n2)) {
            n3 = 1;
        }
        else {
            n3 = lp.n(this.b, this.p(n2));
        }
        final List a = qfq.a.a(qfq.Companion, this, n2, (qfq)n, false, false);
        this.S(i);
        int n4;
        if (n3 > 0) {
            n4 = 1;
        }
        else {
            n4 = 0;
        }
        while (i >= r) {
            final int p3 = this.p(i);
            final int[] b2 = this.b;
            lp.s(b2, p3, lp.i(b2, p3) - r2);
            int n5;
            if ((n5 = n4) != 0) {
                if (lp.l(this.b, p3)) {
                    n5 = 0;
                }
                else {
                    final int[] b3 = this.b;
                    lp.t(b3, p3, lp.n(b3, p3) - n3);
                    n5 = n4;
                }
            }
            i = this.C(i);
            n4 = n5;
        }
        if (n4 != 0) {
            boolean b4 = b;
            if (this.n >= n3) {
                b4 = true;
            }
            n96.g(b4);
            this.n -= n3;
        }
        return a;
    }
    
    public final Object B(int p) {
        p = this.p(p);
        Object o;
        if (lp.l(this.b, p)) {
            o = this.c[this.h(this.g(this.b, p))];
        }
        else {
            o = null;
        }
        return o;
    }
    
    public final int C(final int n) {
        return this.D(this.b, n);
    }
    
    public final int D(final int[] array, int n) {
        n = array[this.p(n) * 5 + 2];
        if (n <= -2) {
            n = this.n() + n + 2;
        }
        return n;
    }
    
    public final void E() {
        final ozk u = this.u;
        if (u != null) {
            while (u.a.isEmpty() ^ true) {
                final int d = u.d();
                final int p = this.p(d);
                int n = d + 1;
                final int r = this.r(d);
                int n2;
                boolean b;
                while (true) {
                    n2 = 0;
                    if (n >= r + d) {
                        b = false;
                        break;
                    }
                    if ((this.b[this.p(n) * 5 + 1] & 0xC000000) != 0x0) {
                        b = true;
                        break;
                    }
                    n += this.r(n);
                }
                int n3 = n2;
                if (lp.g(this.b, p) != b) {
                    n3 = 1;
                }
                if (n3 != 0) {
                    final int[] b2 = this.b;
                    final int n4 = p * 5 + 1;
                    if (b) {
                        b2[n4] |= 0x4000000;
                    }
                    else {
                        b2[n4] &= 0xFBFFFFFF;
                    }
                    final int c = this.C(d);
                    if (c < 0) {
                        continue;
                    }
                    u.a(c);
                }
            }
        }
    }
    
    public final boolean F() {
        if (this.m == 0) {
            final int r = this.r;
            final int h = this.h;
            final int j = this.J();
            final ozk u = this.u;
            if (u != null) {
                while ((u.a.isEmpty() ^ true) && ((Number)mq4.g0(u.a)).intValue() >= r) {
                    u.d();
                }
            }
            final boolean g = this.G(r, this.r - r);
            this.H(h, this.h - h, r - 1);
            this.r = r;
            this.h = h;
            this.n -= j;
            return g;
        }
        n96.d("Cannot remove group while inserting".toString());
        throw null;
    }
    
    public final boolean G(int g, int s) {
        boolean b = false;
        final int n = 0;
        if (s > 0) {
            final ArrayList<j10> d = this.d;
            this.y(g);
            boolean b3;
            if (d.isEmpty() ^ true) {
                final int f = this.f;
                final int n2 = s + g;
                final int m = lp.m((ArrayList)this.d, n2, this.b.length / 5 - f);
                int i;
                if ((i = m) >= this.d.size()) {
                    i = m - 1;
                }
                int n3 = i + 1;
                int n4 = 0;
                while (i >= 0) {
                    final j10 value = this.d.get(i);
                    czd.e((Object)value, "anchors[index]");
                    final j10 j10 = value;
                    final int c = this.c(j10);
                    if (c < g) {
                        break;
                    }
                    int n5 = n4;
                    if (c < n2) {
                        j10.a = Integer.MIN_VALUE;
                        if ((n5 = n4) == 0) {
                            n5 = i + 1;
                        }
                        n3 = i;
                    }
                    --i;
                    n4 = n5;
                }
                final boolean b2 = b3 = (n3 < n4);
                if (b2) {
                    this.d.subList(n3, n4).clear();
                    b3 = b2;
                }
            }
            else {
                b3 = false;
            }
            this.e = g;
            this.f += s;
            final int l = this.l;
            if (l > g) {
                this.l = Math.max(g, l - s);
            }
            g = this.g;
            if (g >= this.e) {
                this.g = g - s;
            }
            s = this.s;
            g = n;
            if (s >= 0) {
                g = n;
                if (lp.g(this.b, this.p(s))) {
                    g = 1;
                }
            }
            if (g != 0) {
                this.S(this.s);
            }
            b = b3;
        }
        return b;
    }
    
    public final void H(final int j, final int n, int i) {
        if (n > 0) {
            final int k = this.k;
            final int n2 = j + n;
            this.z(n2, i);
            this.j = j;
            this.k = k + n;
            bt0.D0(this.c, j, n2);
            i = this.i;
            if (i >= j) {
                this.i = i - n;
            }
        }
    }
    
    public final Object I(int h, final Object o) {
        final int m = this.M(this.b, this.p(this.r));
        final int[] b = this.b;
        final int r = this.r;
        boolean b2 = true;
        final int g = this.g(b, this.p(r + 1));
        final int n = m + h;
        if (n < m || n >= g) {
            b2 = false;
        }
        if (b2) {
            h = this.h(n);
            final Object[] c = this.c;
            final Object o2 = c[h];
            c[h] = o;
            return o2;
        }
        final StringBuilder l = da8.l("Write to an invalid slot index ", h, " for group ");
        l.append(this.r);
        n96.d(l.toString().toString());
        throw null;
    }
    
    public final int J() {
        final int p = this.p(this.r);
        final int r = lp.i(this.b, p) + this.r;
        this.r = r;
        this.h = this.g(this.b, this.p(r));
        int n;
        if (lp.l(this.b, p)) {
            n = 1;
        }
        else {
            n = lp.n(this.b, p);
        }
        return n;
    }
    
    public final void K() {
        final int g = this.g;
        this.r = g;
        this.h = this.g(this.b, this.p(g));
    }
    
    public final Object L(int n, int n2) {
        final int m = this.M(this.b, this.p(n));
        final int[] b = this.b;
        final int n3 = 1;
        n = this.g(b, this.p(n + 1));
        n2 += m;
        if (m <= n2 && n2 < n) {
            n = n3;
        }
        else {
            n = 0;
        }
        if (n == 0) {
            Objects.requireNonNull(x66.Companion);
            return x66$a.b;
        }
        n = this.h(n2);
        return this.c[n];
    }
    
    public final int M(final int[] array, int n) {
        if (n >= this.b.length / 5) {
            n = this.c.length - this.k;
        }
        else {
            final int q = lp.q(array, n);
            final int k = this.k;
            final int length = this.c.length;
            if ((n = q) < 0) {
                n = length - k + q + 1;
            }
        }
        return n;
    }
    
    public final void N() {
        if (this.m == 0) {
            Objects.requireNonNull(x66.Companion);
            final x66$a$a b = x66$a.b;
            this.P(0, b, false, b);
            return;
        }
        n96.d("Key must be supplied when inserting".toString());
        throw null;
    }
    
    public final void O(final int n, final Object o) {
        Objects.requireNonNull(x66.Companion);
        this.P(n, o, false, x66$a.b);
    }
    
    public final void P(int n, final Object o, final boolean b, final Object o2) {
        final int m = this.m;
        final int n2 = 1;
        final boolean b2 = m > 0;
        this.q.c(this.n);
        if (b2) {
            this.t(1);
            final int r = this.r;
            final int p4 = this.p(r);
            Objects.requireNonNull(x66.Companion);
            final x66$a$a b3 = x66$a.b;
            int n3;
            if (o != b3) {
                n3 = 1;
            }
            else {
                n3 = 0;
            }
            int n4;
            if (!b && o2 != b3) {
                n4 = n2;
            }
            else {
                n4 = 0;
            }
            final int[] b4 = this.b;
            final int s = this.s;
            final int h = this.h;
            int n5;
            if (b) {
                n5 = 1073741824;
            }
            else {
                n5 = 0;
            }
            int n6;
            if (n3 != 0) {
                n6 = 536870912;
            }
            else {
                n6 = 0;
            }
            int n7;
            if (n4 != 0) {
                n7 = 268435456;
            }
            else {
                n7 = 0;
            }
            final int n8 = p4 * 5;
            b4[n8 + 0] = n;
            b4[n8 + 1] = (n5 | n6 | n7);
            b4[n8 + 2] = s;
            b4[n8 + 3] = 0;
            b4[n8 + 4] = h;
            this.i = h;
            n = (b ? 1 : 0) + n3 + n4;
            if (n > 0) {
                this.u(n, r);
                final Object[] c = this.c;
                final int n9 = n = this.h;
                if ((b ? 1 : 0) != 0) {
                    c[n9] = o2;
                    n = n9 + 1;
                }
                int n10 = n;
                if (n3 != 0) {
                    c[n] = o;
                    n10 = n + 1;
                }
                n = n10;
                if (n4 != 0) {
                    c[n10] = o2;
                    n = n10 + 1;
                }
                this.h = n;
            }
            this.n = 0;
            n = r + 1;
            this.s = r;
            this.r = n;
        }
        else {
            n = this.s;
            this.o.c(n);
            this.p.c(this.b.length / 5 - this.f - this.g);
            n = this.r;
            final int p5 = this.p(n);
            Objects.requireNonNull(x66.Companion);
            if (!czd.a(o2, (Object)x66$a.b)) {
                if ((b ? 1 : 0) != 0) {
                    this.T(this.r, o2);
                }
                else {
                    this.R(o2);
                }
            }
            this.h = this.M(this.b, p5);
            this.i = this.g(this.b, this.p(this.r + 1));
            this.n = lp.n(this.b, p5);
            this.s = n;
            this.r = n + 1;
            n += lp.i(this.b, p5);
        }
        this.g = n;
    }
    
    public final Object Q(final Object o) {
        if (this.m > 0) {
            this.u(1, this.s);
        }
        final Object o2 = this.c[this.h(this.h++)];
        final int h = this.h;
        if (h <= this.i) {
            this.c[this.h(h - 1)] = o;
            return o2;
        }
        n96.d("Writing to an invalid slot".toString());
        throw null;
    }
    
    public final void R(final Object o) {
        final int p = this.p(this.r);
        if (lp.j(this.b, p)) {
            this.c[this.h(this.d(this.b, p))] = o;
            return;
        }
        n96.d("Updating the data of a group that was not created with a data slot".toString());
        throw null;
    }
    
    public final void S(final int n) {
        if (n >= 0) {
            ozk u;
            if ((u = this.u) == null) {
                u = new ozk((List)null, 1, (rf8)null);
                this.u = u;
            }
            u.a(n);
        }
    }
    
    public final void T(final int n, Object o) {
        final int p2 = this.p(n);
        final int[] b = this.b;
        if (p2 < b.length && lp.l(b, p2)) {
            this.c[this.h(this.g(this.b, p2))] = o;
            return;
        }
        o = new StringBuilder();
        ((StringBuilder)o).append("Updating the node of a group at ");
        ((StringBuilder)o).append(n);
        ((StringBuilder)o).append(" that was not created with as a node group");
        n96.d(((StringBuilder)o).toString().toString());
        throw null;
    }
    
    public final void a(int g) {
        final int n = 1;
        if (g < 0) {
            n96.d("Cannot seek backwards".toString());
            throw null;
        }
        if (this.m > 0) {
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        if (g == 0) {
            return;
        }
        final int r = this.r + g;
        if (r >= this.s && r <= this.g) {
            g = n;
        }
        else {
            g = 0;
        }
        if (g != 0) {
            this.r = r;
            g = this.g(this.b, this.p(r));
            this.h = g;
            this.i = g;
            return;
        }
        final StringBuilder j = fu8.j("Cannot seek outside the current group (");
        j.append(this.s);
        j.append('-');
        j.append(this.g);
        j.append(')');
        n96.d(j.toString().toString());
        throw null;
    }
    
    public final j10 b(int n) {
        final ArrayList<j10> d = this.d;
        final int f0 = lp.f0((ArrayList)d, n, this.n());
        j10 j10;
        if (f0 < 0) {
            if (n > this.e) {
                n = -(this.n() - n);
            }
            j10 = new j10(n);
            d.add(-(f0 + 1), j10);
        }
        else {
            final j10 value = d.get(f0);
            czd.e((Object)value, "get(location)");
            j10 = value;
        }
        return j10;
    }
    
    public final int c(final j10 j10) {
        czd.f((Object)j10, "anchor");
        int a;
        final int n = a = j10.a;
        if (n < 0) {
            a = n + this.n();
        }
        return a;
    }
    
    public final int d(final int[] array, final int n) {
        return lp.C(array[n * 5 + 1] >> 29) + this.g(array, n);
    }
    
    public final void e() {
        if (this.m++ == 0) {
            this.p.c(this.b.length / 5 - this.f - this.g);
        }
    }
    
    public final void f() {
        final int n = 1;
        this.t = true;
        if (this.o.c == 0) {
            this.y(this.n());
            this.z(this.c.length - this.k, this.e);
            this.E();
        }
        final ofq a = this.a;
        final int[] b = this.b;
        final int e = this.e;
        final Object[] c = this.c;
        final int j = this.j;
        final ArrayList<j10> d = this.d;
        Objects.requireNonNull(a);
        czd.f((Object)b, "groups");
        czd.f((Object)c, "slots");
        czd.f((Object)d, "anchors");
        int n2;
        if (this.a == a && a.I0) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            a.I0 = false;
            a.o(b, e, c, j, (ArrayList)d);
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }
    
    public final int g(final int[] array, int n) {
        if (n >= this.b.length / 5) {
            n = this.c.length - this.k;
        }
        else {
            final int n2 = array[n * 5 + 4];
            final int k = this.k;
            final int length = this.c.length;
            if ((n = n2) < 0) {
                n = length - k + n2 + 1;
            }
        }
        return n;
    }
    
    public final int h(int n) {
        if (n >= this.j) {
            n += this.k;
        }
        return n;
    }
    
    public final int i(final int n, final int n2, final int n3, final int n4) {
        int n5 = n;
        if (n > n2) {
            n5 = -(n4 - n3 - n + 1);
        }
        return n5;
    }
    
    public final int j() {
        final int m = this.m;
        final int n = 1;
        final int n2 = 1;
        final int n3 = 0;
        final boolean b = m > 0;
        final int r = this.r;
        final int g = this.g;
        final int s = this.s;
        final int p = this.p(s);
        final int n4 = this.n;
        final int n5 = r - s;
        final boolean l = lp.l(this.b, p);
        if (b) {
            lp.s(this.b, p, n5);
            lp.t(this.b, p, n4);
            final int b2 = this.q.b();
            int n6;
            if (l) {
                n6 = n2;
            }
            else {
                n6 = n4;
            }
            this.n = b2 + n6;
            this.s = this.D(this.b, s);
        }
        else {
            int n7;
            if (r == g) {
                n7 = n;
            }
            else {
                n7 = 0;
            }
            if (n7 == 0) {
                n96.d("Expected to be at the end of a group".toString());
                throw null;
            }
            final int i = lp.i(this.b, p);
            final int n8 = lp.n(this.b, p);
            lp.s(this.b, p, n5);
            lp.t(this.b, p, n4);
            final int b3 = this.o.b();
            this.g = this.b.length / 5 - this.f - this.p.b();
            this.s = b3;
            final int d = this.D(this.b, s);
            final int b4 = this.q.b();
            this.n = b4;
            if (d == b3) {
                int n9;
                if (l) {
                    n9 = n3;
                }
                else {
                    n9 = n4 - n8;
                }
                this.n = b4 + n9;
            }
            else {
                final int n10 = n5 - i;
                int n11;
                if (l) {
                    n11 = 0;
                }
                else {
                    n11 = n4 - n8;
                }
                int n12 = n11;
                int d2 = d;
                int n13 = 0;
                Label_0458: {
                    if (n10 == 0) {
                        if ((n13 = n11) == 0) {
                            break Label_0458;
                        }
                        d2 = d;
                        n12 = n11;
                    }
                    while (true) {
                        n13 = n12;
                        if (d2 == 0) {
                            break;
                        }
                        n13 = n12;
                        if (d2 == b3) {
                            break;
                        }
                        if (n12 == 0) {
                            n13 = n12;
                            if (n10 == 0) {
                                break;
                            }
                        }
                        final int p2 = this.p(d2);
                        if (n10 != 0) {
                            lp.s(this.b, p2, lp.i(this.b, p2) + n10);
                        }
                        if (n12 != 0) {
                            final int[] b5 = this.b;
                            lp.t(b5, p2, lp.n(b5, p2) + n12);
                        }
                        if (lp.l(this.b, p2)) {
                            n12 = 0;
                        }
                        d2 = this.D(this.b, d2);
                    }
                }
                this.n += n13;
            }
        }
        return n4;
    }
    
    public final void k() {
        final int m = this.m;
        final int n = 1;
        if (m > 0) {
            if ((this.m = m - 1) == 0) {
                int n2;
                if (this.q.c == this.o.c) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (n2 == 0) {
                    n96.d("startGroup/endGroup mismatch while inserting".toString());
                    throw null;
                }
                this.g = this.b.length / 5 - this.f - this.p.b();
            }
            return;
        }
        throw new IllegalStateException("Unbalanced begin/end insert".toString());
    }
    
    public final void l(final int r) {
        final int m = this.m;
        final int n = 1;
        if (m <= 0) {
            final int s = this.s;
            if (s != r) {
                int n2;
                if (r >= s && r < this.g) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (n2 == 0) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Started group at ");
                    sb.append(r);
                    sb.append(" must be a subgroup of the group at ");
                    sb.append(s);
                    n96.d(sb.toString().toString());
                    throw null;
                }
                final int r2 = this.r;
                final int h = this.h;
                final int i = this.i;
                this.r = r;
                this.N();
                this.r = r2;
                this.h = h;
                this.i = i;
            }
            return;
        }
        n96.d("Cannot call ensureStarted() while inserting".toString());
        throw null;
    }
    
    public final void m(int n, final int n2, int i) {
        if (n >= this.e) {
            n = -(this.n() - n + 2);
        }
        while (i < n2) {
            lp.u(this.b, this.p(i), n);
            final int n3 = lp.i(this.b, this.p(i)) + i;
            this.m(i, n3, i + 1);
            i = n3;
        }
    }
    
    public final int n() {
        return this.b.length / 5 - this.f;
    }
    
    public final Object o(int p) {
        p = this.p(p);
        Object b;
        if (lp.j(this.b, p)) {
            b = this.c[this.d(this.b, p)];
        }
        else {
            Objects.requireNonNull(x66.Companion);
            b = x66$a.b;
        }
        return b;
    }
    
    public final int p(int n) {
        if (n >= this.e) {
            n += this.f;
        }
        return n;
    }
    
    public final Object q(int p) {
        p = this.p(p);
        Object o;
        if (lp.k(this.b, p)) {
            final Object[] c = this.c;
            final int[] b = this.b;
            p *= 5;
            o = c[lp.C(b[p + 1] >> 30) + b[p + 4]];
        }
        else {
            o = null;
        }
        return o;
    }
    
    public final int r(final int n) {
        return lp.i(this.b, this.p(n));
    }
    
    public final boolean s(final int n, final int n2) {
        final int s = this.s;
        final boolean b = false;
        int g = 0;
        Label_0125: {
            if (n2 == s) {
                g = this.g;
            }
            else {
                int n3 = 0;
                Label_0039: {
                    if (n2 <= this.o.a(0)) {
                        final mtd o = this.o;
                        final int c = o.c;
                        int i = 0;
                        while (true) {
                            while (i < c) {
                                if (o.b[i] == n2) {
                                    if (i < 0) {
                                        n3 = this.r(n2);
                                        break Label_0039;
                                    }
                                    g = this.b.length / 5 - this.f - this.p.b[i];
                                    break Label_0125;
                                }
                                else {
                                    ++i;
                                }
                            }
                            i = -1;
                            continue;
                        }
                    }
                    n3 = this.r(n2);
                }
                g = n3 + n2;
            }
        }
        boolean b2 = b;
        if (n > n2) {
            b2 = b;
            if (n < g) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final void t(final int n) {
        if (n > 0) {
            final int r = this.r;
            this.y(r);
            final int e = this.e;
            final int f = this.f;
            final int[] b = this.b;
            final int n2 = b.length / 5;
            final int n3 = n2 - f;
            int j = 0;
            int n4;
            if ((n4 = f) < n) {
                final int max = Math.max(Math.max(n2 * 2, n3 + n), 32);
                final int[] b2 = new int[max * 5];
                n4 = max - n3;
                bt0.x0(b, b2, 0, 0, e * 5);
                bt0.x0(b, b2, (e + n4) * 5, (f + e) * 5, n2 * 5);
                this.b = b2;
            }
            final int g = this.g;
            if (g >= e) {
                this.g = g + n;
            }
            final int e2 = e + n;
            this.e = e2;
            this.f = n4 - n;
            int g2;
            if (n3 > 0) {
                g2 = this.g(this.b, this.p(r + n));
            }
            else {
                g2 = 0;
            }
            if (this.l >= e) {
                j = this.j;
            }
            final int i = this.i(g2, j, this.k, this.c.length);
            for (int k = e; k < e2; ++k) {
                lp.r(this.b, k, i);
            }
            final int l = this.l;
            if (l >= e) {
                this.l = l + n;
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("SlotWriter(current = ");
        j.append(this.r);
        j.append(" end=");
        j.append(this.g);
        j.append(" size = ");
        j.append(this.n());
        j.append(" gap=");
        j.append(this.e);
        j.append('-');
        j.append(this.e + this.f);
        j.append(')');
        return j.toString();
    }
    
    public final void u(final int n, int i) {
        if (n > 0) {
            this.z(this.h, i);
            final int j = this.j;
            final int k = this.k;
            if ((i = k) < n) {
                final Object[] c = this.c;
                final int length = c.length;
                final int n2 = length - k;
                final int max = Math.max(Math.max(length * 2, n2 + n), 32);
                final Object[] c2 = new Object[max];
                for (i = 0; i < max; ++i) {
                    c2[i] = null;
                }
                i = max - n2;
                bt0.y0(c, c2, 0, 0, j);
                bt0.y0(c, c2, j + i, k + j, length);
                this.c = c2;
            }
            final int l = this.i;
            if (l >= j) {
                this.i = l + n;
            }
            this.j = j + n;
            this.k = i - n;
        }
    }
    
    public final boolean v(final int n) {
        return lp.l(this.b, this.p(n));
    }
    
    public final List<j10> x(ofq l, int g0) {
        czd.f((Object)l, "table");
        n96.g(this.m > 0);
        if (g0 == 0 && this.r == 0 && this.a.E0 == 0) {
            final int[] b = this.b;
            final Object[] c = this.c;
            final ArrayList<j10> d = this.d;
            final int[] d2 = l.D0;
            final int e0 = l.E0;
            final Object[] f0 = l.F0;
            g0 = l.G0;
            this.b = d2;
            this.c = f0;
            this.d = l.K0;
            this.e = e0;
            this.f = d2.length / 5 - e0;
            this.j = g0;
            this.k = f0.length - g0;
            this.l = e0;
            l.o(b, 0, c, 0, (ArrayList)d);
            return this.d;
        }
        l = (ofq)l.l();
        try {
            return qfq.a.a(qfq.Companion, (qfq)l, g0, this, true, true);
        }
        finally {
            ((qfq)l).f();
        }
    }
    
    public final void y(final int e) {
        final int f = this.f;
        final int e2 = this.e;
        if (e2 != e) {
            final boolean empty = this.d.isEmpty();
            boolean b = true;
            if (empty ^ true) {
                final int n = this.b.length / 5 - this.f;
                if (e2 < e) {
                    for (int i = lp.m((ArrayList)this.d, e2, n); i < this.d.size(); ++i) {
                        final j10 value = this.d.get(i);
                        czd.e((Object)value, "anchors[index]");
                        final j10 j10 = value;
                        final int a = j10.a;
                        if (a >= 0) {
                            break;
                        }
                        final int a2 = a + n;
                        if (a2 >= e) {
                            break;
                        }
                        j10.a = a2;
                    }
                }
                else {
                    for (int k = lp.m((ArrayList)this.d, e, n); k < this.d.size(); ++k) {
                        final j10 value2 = this.d.get(k);
                        czd.e((Object)value2, "anchors[index]");
                        final j10 j11 = value2;
                        final int a3 = j11.a;
                        if (a3 < 0) {
                            break;
                        }
                        j11.a = -(n - a3);
                    }
                }
            }
            if (f > 0) {
                final int[] b2 = this.b;
                final int n2 = e * 5;
                final int n3 = f * 5;
                final int n4 = e2 * 5;
                if (e < e2) {
                    bt0.x0(b2, b2, n3 + n2, n2, n4);
                }
                else {
                    bt0.x0(b2, b2, n4, n4 + n3, n2 + n3);
                }
            }
            int l;
            if (e < (l = e2)) {
                l = e + f;
            }
            final int n5 = this.b.length / 5;
            if (l >= n5) {
                b = false;
            }
            n96.g(b);
            while (l < n5) {
                final int o = lp.o(this.b, l);
                int n6;
                if (o > -2) {
                    n6 = o;
                }
                else {
                    n6 = this.n() + o + 2;
                }
                if (n6 >= e) {
                    n6 = -(this.n() - n6 + 2);
                }
                if (n6 != o) {
                    lp.u(this.b, l, n6);
                }
                final int n7 = l + 1;
                if ((l = n7) == e) {
                    l = n7 + f;
                }
            }
        }
        this.e = e;
    }
    
    public final void z(final int j, int i) {
        final int k = this.k;
        final int l = this.j;
        final int m = this.l;
        if (l != j) {
            final Object[] c = this.c;
            if (j < l) {
                bt0.y0(c, c, j + k, j, l);
            }
            else {
                bt0.y0(c, c, l, l + k, j + k);
            }
            bt0.D0(c, j, j + k);
        }
        final int min = Math.min(i + 1, this.n());
        if (m != min) {
            final int n = this.c.length - k;
            if (min < m) {
                i = this.p(min);
                final int p2 = this.p(m);
                final int e = this.e;
                while (i < p2) {
                    final int h = lp.h(this.b, i);
                    if (h < 0) {
                        n96.d("Unexpected anchor value, expected a positive anchor".toString());
                        throw null;
                    }
                    lp.r(this.b, i, -(n - h + 1));
                    final int n2 = i + 1;
                    if ((i = n2) != e) {
                        continue;
                    }
                    i = n2 + this.f;
                }
            }
            else {
                i = this.p(m);
                while (i < this.p(min)) {
                    final int h2 = lp.h(this.b, i);
                    if (h2 >= 0) {
                        n96.d("Unexpected anchor value, expected a negative anchor".toString());
                        throw null;
                    }
                    lp.r(this.b, i, h2 + n + 1);
                    final int n3 = i + 1;
                    if ((i = n3) != this.e) {
                        continue;
                    }
                    i = n3 + this.f;
                }
            }
            this.l = min;
        }
        this.j = j;
    }
    
    public static final class a
    {
        public static final List a(final a a, final qfq qfq, int n, final qfq qfq2, final boolean b, final boolean b2) {
            Objects.requireNonNull(a);
            final int r = qfq.r(n);
            final int n2 = n + r;
            final int g = qfq.g(qfq.b, qfq.p(n));
            final int g2 = qfq.g(qfq.b, qfq.p(n2));
            final int n3 = g2 - g;
            final boolean b3 = n >= 0 && (qfq.b[qfq.p(n) * 5 + 1] & 0xC000000) != 0x0;
            qfq2.t(r);
            qfq2.u(n3, qfq2.r);
            if (qfq.e < n2) {
                qfq.y(n2);
            }
            if (qfq.j < g2) {
                qfq.z(g2, n2);
            }
            final int[] b4 = qfq2.b;
            final int r2 = qfq2.r;
            final int[] b5 = qfq.b;
            final int n4 = r2 * 5;
            bt0.x0(b5, b4, n4, n * 5, n2 * 5);
            final Object[] c = qfq2.c;
            final int h = qfq2.h;
            bt0.y0(qfq.c, c, h, g, g2);
            final int s = qfq2.s;
            b4[n4 + 2] = s;
            final int n5 = r2 - n;
            final int r3 = r2 + r;
            final int g3 = qfq2.g(b4, r2);
            int l = qfq2.l;
            final int k = qfq2.k;
            final int length = c.length;
            int i = r2;
            final int n6 = h;
            while (i < r3) {
                if (i != r2) {
                    final int n7 = i * 5 + 2;
                    b4[n7] += n5;
                }
                final int g4 = qfq2.g(b4, i);
                int j;
                if (l < i) {
                    j = 0;
                }
                else {
                    j = qfq2.j;
                }
                b4[i * 5 + 4] = qfq2.i(g4 + (h - g3), j, k, length);
                int n8 = l;
                if (i == l) {
                    n8 = l + 1;
                }
                ++i;
                l = n8;
            }
            qfq2.l = l;
            final int m = lp.m((ArrayList)qfq.d, n, qfq.n());
            final int m2 = lp.m((ArrayList)qfq.d, n2, qfq.n());
            Object d2;
            if (m < m2) {
                final ArrayList<j10> d = qfq.d;
                d2 = new ArrayList<j10>(m2 - m);
                for (int n9 = m; n9 < m2; ++n9) {
                    final j10 value = d.get(n9);
                    czd.e((Object)value, "sourceAnchors[anchorIndex]");
                    final j10 j2 = value;
                    j2.a += n5;
                    ((ArrayList<j10>)d2).add(j2);
                }
                qfq2.d.addAll(lp.m((ArrayList)qfq2.d, qfq2.r, qfq2.n()), (Collection<? extends j10>)d2);
                d.subList(m, m2).clear();
            }
            else {
                d2 = f2a.D0;
            }
            final int c2 = qfq.C(n);
            boolean b7;
            if (b) {
                final boolean b6 = c2 >= 0;
                if (b6) {
                    qfq.N();
                    qfq.a(c2 - qfq.r);
                    qfq.N();
                }
                qfq.a(n - qfq.r);
                b7 = qfq.F();
                if (b6) {
                    qfq.K();
                    qfq.j();
                    qfq.K();
                    qfq.j();
                }
            }
            else {
                b7 = qfq.G(n, r);
                qfq.H(g, n3, n - 1);
            }
            if (b7 ^ true) {
                final int n10 = qfq2.n;
                if (lp.l(b4, r2)) {
                    n = 1;
                }
                else {
                    n = lp.n(b4, r2);
                }
                qfq2.n = n10 + n;
                if (b2) {
                    qfq2.r = r3;
                    qfq2.h = n6 + n3;
                }
                if (b3) {
                    qfq2.S(s);
                }
                return (List)d2;
            }
            n96.d("Unexpectedly removed anchors".toString());
            throw null;
        }
    }
}
