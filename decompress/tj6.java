import java.util.Arrays;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Objects;
import java.util.HashMap;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class tj6
{
    public int A;
    public float B;
    public int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public kj6 J;
    public kj6 K;
    public kj6 L;
    public kj6 M;
    public kj6 N;
    public kj6 O;
    public kj6 P;
    public kj6 Q;
    public kj6[] R;
    public ArrayList<kj6> S;
    public boolean[] T;
    public a[] U;
    public tj6 V;
    public int W;
    public int X;
    public float Y;
    public int Z;
    public boolean a;
    public int a0;
    public cp3 b;
    public int b0;
    public cp3 c;
    public int c0;
    public brc d;
    public int d0;
    public juw e;
    public int e0;
    public boolean[] f;
    public float f0;
    public boolean g;
    public float g0;
    public int h;
    public Object h0;
    public int i;
    public int i0;
    public String j;
    public String j0;
    public boolean k;
    public String k0;
    public boolean l;
    public int l0;
    public boolean m;
    public int m0;
    public boolean n;
    public float[] n0;
    public int o;
    public tj6[] o0;
    public int p;
    public tj6[] p0;
    public int q;
    public tj6 q0;
    public int r;
    public tj6 r0;
    public int s;
    public int s0;
    public int[] t;
    public int t0;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    
    public tj6() {
        this.a = false;
        this.d = null;
        this.e = null;
        this.f = new boolean[] { true, true };
        this.g = true;
        this.h = -1;
        this.i = -1;
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE };
        this.D = 0.0f;
        this.E = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        final kj6 j = new kj6(this, kj6$a.F0);
        this.J = j;
        final kj6 k = new kj6(this, kj6$a.G0);
        this.K = k;
        final kj6 l = new kj6(this, kj6$a.H0);
        this.L = l;
        final kj6 m = new kj6(this, kj6$a.I0);
        this.M = m;
        final kj6 n = new kj6(this, kj6$a.J0);
        this.N = n;
        this.O = new kj6(this, kj6$a.L0);
        this.P = new kj6(this, kj6$a.M0);
        final kj6 q = new kj6(this, kj6$a.K0);
        this.Q = q;
        this.R = new kj6[] { j, l, k, m, n, q };
        final ArrayList s = new ArrayList();
        this.S = s;
        this.T = new boolean[2];
        final a f0 = tj6.a.F0;
        this.U = new a[] { f0, f0 };
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        this.i0 = 0;
        this.j0 = null;
        this.k0 = null;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = new float[] { -1.0f, -1.0f };
        this.o0 = new tj6[] { null, null };
        this.p0 = new tj6[] { null, null };
        this.q0 = null;
        this.r0 = null;
        this.s0 = -1;
        this.t0 = -1;
        s.add(this.J);
        this.S.add(this.K);
        this.S.add(this.L);
        this.S.add(this.M);
        this.S.add(this.O);
        this.S.add(this.P);
        this.S.add(this.Q);
        this.S.add(this.N);
    }
    
    public final boolean A(int n) {
        boolean b = true;
        final boolean b2 = true;
        if (n == 0) {
            if (this.J.f != null) {
                n = 1;
            }
            else {
                n = 0;
            }
            int n2;
            if (this.L.f != null) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            return n + n2 < 2 && b2;
        }
        if (this.K.f != null) {
            n = 1;
        }
        else {
            n = 0;
        }
        int n3;
        if (this.M.f != null) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        int n4;
        if (this.N.f != null) {
            n4 = 1;
        }
        else {
            n4 = 0;
        }
        if (n + n3 + n4 >= 2) {
            b = false;
        }
        return b;
    }
    
    public final boolean B(int n, final int n2) {
        final boolean b = true;
        boolean b2 = true;
        if (n == 0) {
            final kj6 f = this.J.f;
            if (f != null && f.c) {
                final kj6 f2 = this.L.f;
                if (f2 != null && f2.c) {
                    final int d = f2.d();
                    n = this.L.e();
                    if (d - n - (this.J.e() + this.J.f.d()) < n2) {
                        b2 = false;
                    }
                    return b2;
                }
            }
        }
        else {
            final kj6 f3 = this.K.f;
            if (f3 != null && f3.c) {
                final kj6 f4 = this.M.f;
                if (f4 != null && f4.c) {
                    final int d2 = f4.d();
                    final int e = this.M.e();
                    n = this.K.f.d();
                    return d2 - e - (this.K.e() + n) >= n2 && b;
                }
            }
        }
        return false;
    }
    
    public final void C(final kj6$a kj6$a, final tj6 tj6, final kj6$a kj6$a2, final int n, final int n2) {
        this.n(kj6$a).b(tj6.n(kj6$a2), n, n2, true);
    }
    
    public final boolean D(int n) {
        n *= 2;
        final kj6[] r = this.R;
        final kj6 f = r[n].f;
        boolean b = true;
        if (f != null && r[n].f.f != r[n]) {
            ++n;
            if (r[n].f != null && r[n].f.f == r[n]) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public final boolean E() {
        final kj6 j = this.J;
        final kj6 f = j.f;
        if (f == null || f.f != j) {
            final kj6 l = this.L;
            final kj6 f2 = l.f;
            if (f2 == null || f2.f != l) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean F() {
        final kj6 k = this.K;
        final kj6 f = k.f;
        if (f == null || f.f != k) {
            final kj6 m = this.M;
            final kj6 f2 = m.f;
            if (f2 == null || f2.f != m) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean G() {
        return this.g && this.i0 != 8;
    }
    
    public boolean H() {
        return this.k || (this.J.c && this.L.c);
    }
    
    public boolean I() {
        return this.l || (this.K.c && this.M.c);
    }
    
    public void J() {
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.O.k();
        this.P.k();
        this.Q.k();
        this.V = null;
        this.D = 0.0f;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        final a[] u = this.U;
        u[1] = (u[0] = tj6.a.F0);
        this.h0 = null;
        this.i0 = 0;
        this.k0 = null;
        this.l0 = 0;
        this.m0 = 0;
        final float[] n0 = this.n0;
        n0[1] = (n0[0] = -1.0f);
        this.o = -1;
        this.p = -1;
        final int[] c = this.C;
        c[1] = (c[0] = Integer.MAX_VALUE);
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        final boolean[] f = this.f;
        f[1] = (f[0] = true);
        this.G = false;
        final boolean[] t = this.T;
        t[1] = (t[0] = false);
        this.g = true;
        final int[] t2 = this.t;
        t2[1] = (t2[0] = 0);
        this.h = -1;
        this.i = -1;
    }
    
    public final void K() {
        final tj6 v = this.V;
        if (v != null && v instanceof uj6) {
            Objects.requireNonNull((uj6)v);
        }
        for (int i = 0; i < this.S.size(); ++i) {
            this.S.get(i).k();
        }
    }
    
    public final void L() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        for (int size = this.S.size(), i = 0; i < size; ++i) {
            final kj6 kj6 = this.S.get(i);
            kj6.c = false;
            kj6.b = 0;
        }
    }
    
    public void M(final gc7 gc7) {
        this.J.l();
        this.K.l();
        this.L.l();
        this.M.l();
        this.N.l();
        this.Q.l();
        this.O.l();
        this.P.l();
    }
    
    public final void N(final StringBuilder sb, final String s, final float n, final float n2) {
        if (n == n2) {
            return;
        }
        sb.append(s);
        sb.append(" :   ");
        sb.append(n);
        sb.append(",\n");
    }
    
    public final void O(final StringBuilder sb, final String s, final int n, final int n2) {
        if (n == n2) {
            return;
        }
        m51.z(sb, s, " :   ", n, ",\n");
    }
    
    public final void P(final int c0) {
        this.c0 = c0;
        this.E = (c0 > 0);
    }
    
    public final void Q(final int a0, final int n) {
        if (this.k) {
            return;
        }
        this.J.m(a0);
        this.L.m(n);
        this.a0 = a0;
        this.W = n - a0;
        this.k = true;
    }
    
    public final void R(final int b0, final int n) {
        if (this.l) {
            return;
        }
        this.K.m(b0);
        this.M.m(n);
        this.b0 = b0;
        this.X = n - b0;
        if (this.E) {
            this.N.m(b0 + this.c0);
        }
        this.l = true;
    }
    
    public final void S(final int x) {
        this.X = x;
        final int e0 = this.e0;
        if (x < e0) {
            this.X = e0;
        }
    }
    
    public final void T(final a a) {
        this.U[0] = a;
    }
    
    public final void U(final int e0) {
        if (e0 < 0) {
            this.e0 = 0;
        }
        else {
            this.e0 = e0;
        }
    }
    
    public final void V(final int d0) {
        if (d0 < 0) {
            this.d0 = 0;
        }
        else {
            this.d0 = d0;
        }
    }
    
    public final void W(final a a) {
        this.U[1] = a;
    }
    
    public final void X(final int w) {
        this.W = w;
        final int d0 = this.d0;
        if (w < d0) {
            this.W = d0;
        }
    }
    
    public void Y(final boolean b, final boolean b2) {
        final a f0 = tj6.a.F0;
        final brc d = this.d;
        final boolean b3 = b & d.g;
        final juw e = this.e;
        final boolean b4 = b2 & ((jpx)e).g;
        int g = d.h.g;
        int g2 = ((jpx)e).h.g;
        int g3 = d.i.g;
        final int g4 = ((jpx)e).i.g;
        int n;
        if (g3 - g < 0 || g4 - g2 < 0 || g == Integer.MIN_VALUE || g == Integer.MAX_VALUE || g2 == Integer.MIN_VALUE || g2 == Integer.MAX_VALUE || g3 == Integer.MIN_VALUE || g3 == Integer.MAX_VALUE || g4 == Integer.MIN_VALUE || (n = g4) == Integer.MAX_VALUE) {
            g3 = 0;
            n = 0;
            g = 0;
            g2 = 0;
        }
        final int n2 = g3 - g;
        final int n3 = n - g2;
        if (b3) {
            this.a0 = g;
        }
        if (b4) {
            this.b0 = g2;
        }
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        if (b3) {
            int w = n2;
            if (this.U[0] == f0) {
                final int w2 = this.W;
                if ((w = n2) < w2) {
                    w = w2;
                }
            }
            this.W = w;
            final int d2 = this.d0;
            if (w < d2) {
                this.W = d2;
            }
        }
        if (b4) {
            int x = n3;
            if (this.U[1] == f0) {
                final int x2 = this.X;
                if ((x = n3) < x2) {
                    x = x2;
                }
            }
            this.X = x;
            final int e2 = this.e0;
            if (x < e2) {
                this.X = e2;
            }
        }
    }
    
    public void Z(final ydf ydf, final boolean b) {
        final int o = ydf.o((Object)this.J);
        final int o2 = ydf.o((Object)this.K);
        final int o3 = ydf.o((Object)this.L);
        final int o4 = ydf.o((Object)this.M);
        int g = o;
        int g2 = o3;
        if (b) {
            final brc d = this.d;
            g = o;
            g2 = o3;
            if (d != null) {
                final zp8 h = d.h;
                g = o;
                g2 = o3;
                if (h.j) {
                    final zp8 i = d.i;
                    g = o;
                    g2 = o3;
                    if (i.j) {
                        g = h.g;
                        g2 = i.g;
                    }
                }
            }
        }
        int g3 = o2;
        int g4 = o4;
        if (b) {
            final juw e = this.e;
            g3 = o2;
            g4 = o4;
            if (e != null) {
                final zp8 h2 = ((jpx)e).h;
                g3 = o2;
                g4 = o4;
                if (h2.j) {
                    final zp8 j = ((jpx)e).i;
                    g3 = o2;
                    g4 = o4;
                    if (j.j) {
                        g3 = h2.g;
                        g4 = j.g;
                    }
                }
            }
        }
        int n = 0;
        int n2 = 0;
        Label_0301: {
            if (g2 - g >= 0 && g4 - g3 >= 0 && g != Integer.MIN_VALUE && g != Integer.MAX_VALUE && g3 != Integer.MIN_VALUE && g3 != Integer.MAX_VALUE && g2 != Integer.MIN_VALUE && g2 != Integer.MAX_VALUE && g4 != Integer.MIN_VALUE) {
                n = g2;
                if ((n2 = g4) != Integer.MAX_VALUE) {
                    break Label_0301;
                }
            }
            n2 = 0;
            g = 0;
            g3 = 0;
            n = 0;
        }
        final a h3 = tj6.a.H0;
        final int n3 = n - g;
        final int n4 = n2 - g3;
        this.a0 = g;
        this.b0 = g3;
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
        }
        else {
            final a[] u = this.U;
            final a a = u[0];
            final a f0 = tj6.a.F0;
            int w = n3;
            if (a == f0) {
                final int w2 = this.W;
                if ((w = n3) < w2) {
                    w = w2;
                }
            }
            int x = n4;
            if (u[1] == f0) {
                final int x2 = this.X;
                if ((x = n4) < x2) {
                    x = x2;
                }
            }
            this.W = w;
            this.X = x;
            final int e2 = this.e0;
            if (x < e2) {
                this.X = e2;
            }
            final int d2 = this.d0;
            if (w < d2) {
                this.W = d2;
            }
            final int v = this.v;
            if (v > 0 && u[0] == h3) {
                this.W = Math.min(this.W, v);
            }
            final int y = this.y;
            if (y > 0 && this.U[1] == h3) {
                this.X = Math.min(this.X, y);
            }
            final int w3 = this.W;
            if (w != w3) {
                this.h = w3;
            }
            final int x3 = this.X;
            if (x != x3) {
                this.i = x3;
            }
        }
    }
    
    public final void d(final uj6 uj6, final ydf ydf, final HashSet<tj6> set, final int n, final boolean b) {
        if (b) {
            if (!set.contains(this)) {
                return;
            }
            ioj.a(uj6, ydf, this);
            set.remove(this);
            this.f(ydf, uj6.l0(64));
        }
        if (n == 0) {
            final HashSet a = this.J.a;
            if (a != null) {
                final Iterator iterator = a.iterator();
                while (iterator.hasNext()) {
                    ((kj6)iterator.next()).d.d(uj6, ydf, set, n, true);
                }
            }
            final HashSet a2 = this.L.a;
            if (a2 != null) {
                final Iterator iterator2 = a2.iterator();
                while (iterator2.hasNext()) {
                    ((kj6)iterator2.next()).d.d(uj6, ydf, set, n, true);
                }
            }
        }
        else {
            final HashSet a3 = this.K.a;
            if (a3 != null) {
                final Iterator iterator3 = a3.iterator();
                while (iterator3.hasNext()) {
                    ((kj6)iterator3.next()).d.d(uj6, ydf, set, n, true);
                }
            }
            final HashSet a4 = this.M.a;
            if (a4 != null) {
                final Iterator iterator4 = a4.iterator();
                while (iterator4.hasNext()) {
                    ((kj6)iterator4.next()).d.d(uj6, ydf, set, n, true);
                }
            }
            final HashSet a5 = this.N.a;
            if (a5 != null) {
                final Iterator iterator5 = a5.iterator();
                while (iterator5.hasNext()) {
                    final tj6 d = ((kj6)iterator5.next()).d;
                    try {
                        d.d(uj6, ydf, set, n, true);
                        continue;
                    }
                    finally {}
                    break;
                }
            }
        }
    }
    
    public final boolean e() {
        return this instanceof bfx || this instanceof dbc;
    }
    
    public void f(final ydf ydf, final boolean b) {
        final a g0 = tj6.a.G0;
        final lmq l = ydf.l((Object)this.J);
        final lmq i = ydf.l((Object)this.L);
        final lmq j = ydf.l((Object)this.K);
        final lmq k = ydf.l((Object)this.M);
        final lmq m = ydf.l((Object)this.N);
        final tj6 v = this.V;
        boolean b4 = false;
        boolean b5 = false;
        Label_0172: {
            boolean b6 = false;
            Label_0165: {
                if (v != null) {
                    final a[] u = v.U;
                    final boolean b2 = u[0] == g0;
                    final boolean b3 = u[1] == g0;
                    final int q = this.q;
                    if (q == 1) {
                        b4 = b2;
                        b5 = false;
                        break Label_0172;
                    }
                    b6 = b3;
                    if (q == 2) {
                        break Label_0165;
                    }
                    if (q != 3) {
                        final boolean b7 = b3;
                        b4 = b2;
                        b5 = b7;
                        break Label_0172;
                    }
                }
                b6 = false;
            }
            b5 = b6;
            b4 = false;
        }
        Label_0259: {
            if (this.i0 == 8) {
                final int size = this.S.size();
                int n = 0;
                while (true) {
                    while (n < size) {
                        if (this.S.get(n).h()) {
                            final boolean b8 = true;
                            if (b8) {
                                break Label_0259;
                            }
                            final boolean[] t = this.T;
                            if (!t[0] && !t[1]) {
                                return;
                            }
                            break Label_0259;
                        }
                        else {
                            ++n;
                        }
                    }
                    final boolean b8 = false;
                    continue;
                }
            }
        }
        final boolean k2 = this.k;
        if (k2 || this.l) {
            if (k2) {
                ydf.e(l, this.a0);
                ydf.e(i, this.a0 + this.W);
                if (b4) {
                    final tj6 v2 = this.V;
                    if (v2 != null) {
                        final uj6 uj6 = (uj6)v2;
                        uj6.f0(this.J);
                        uj6.e0(this.L);
                    }
                }
            }
            if (this.l) {
                ydf.e(j, this.b0);
                ydf.e(k, this.b0 + this.X);
                if (this.N.h()) {
                    ydf.e(m, this.b0 + this.c0);
                }
                if (b5) {
                    final tj6 v3 = this.V;
                    if (v3 != null) {
                        final uj6 uj7 = (uj6)v3;
                        uj7.h0(this.K);
                        uj7.g0(this.M);
                    }
                }
            }
            if (this.k && this.l) {
                this.k = false;
                this.l = false;
                return;
            }
        }
        if (b) {
            final brc d = this.d;
            if (d != null) {
                final juw e = this.e;
                if (e != null) {
                    final zp8 h = d.h;
                    if (h.j && d.i.j && ((jpx)e).h.j && ((jpx)e).i.j) {
                        ydf.e(l, h.g);
                        ydf.e(i, this.d.i.g);
                        ydf.e(j, ((jpx)this.e).h.g);
                        ydf.e(k, ((jpx)this.e).i.g);
                        ydf.e(m, this.e.k.g);
                        if (this.V != null) {
                            if (b4 && this.f[0] && !this.E()) {
                                ydf.f(ydf.l((Object)this.V.L), i, 0, 8);
                            }
                            if (b5 && this.f[1] && !this.F()) {
                                ydf.f(ydf.l((Object)this.V.M), k, 0, 8);
                            }
                        }
                        this.k = false;
                        this.l = false;
                        return;
                    }
                }
            }
        }
        int n3;
        int n4;
        if (this.V != null) {
            int e2;
            if (this.D(0)) {
                ((uj6)this.V).c0(this, 0);
                e2 = 1;
            }
            else {
                e2 = (this.E() ? 1 : 0);
            }
            int f;
            if (this.D(1)) {
                ((uj6)this.V).c0(this, 1);
                f = 1;
            }
            else {
                f = (this.F() ? 1 : 0);
            }
            if (e2 == 0 && b4 && this.i0 != 8 && this.J.f == null && this.L.f == null) {
                ydf.f(ydf.l((Object)this.V.L), i, 0, 1);
            }
            if (f == 0 && b5 && this.i0 != 8 && this.K.f == null && this.M.f == null && this.N == null) {
                ydf.f(ydf.l((Object)this.V.M), k, 0, 1);
            }
            final int n2 = e2;
            n3 = f;
            n4 = n2;
        }
        else {
            n3 = 0;
            n4 = 0;
        }
        final int w = this.W;
        int d2 = this.d0;
        if (w >= d2) {
            d2 = w;
        }
        final int x = this.X;
        int e3 = this.e0;
        if (x >= e3) {
            e3 = x;
        }
        final a[] u2 = this.U;
        final a a = u2[0];
        final a h2 = tj6.a.H0;
        final boolean b9 = a != h2;
        final boolean b10 = u2[1] != h2;
        final int z = this.Z;
        this.A = z;
        final float y = this.Y;
        this.B = y;
        final int r = this.r;
        final int s = this.s;
        int n6 = 0;
        boolean b11 = false;
        int n8 = 0;
        Label_1673: {
            if (y > 0.0f && this.i0 != 8) {
                int n5 = r;
                if (u2[0] == h2 && (n5 = r) == 0) {
                    n5 = 3;
                }
                n6 = s;
                if (u2[1] == h2 && (n6 = s) == 0) {
                    n6 = 3;
                }
                int n9 = 0;
                int n10 = 0;
                Label_1640: {
                    int n7;
                    if (u2[0] == h2 && u2[1] == h2 && n5 == 3 && n6 == 3) {
                        if (z == -1) {
                            if (b9 && !b10) {
                                this.A = 0;
                            }
                            else if (!b9 && b10) {
                                this.A = 1;
                                if (z == -1) {
                                    this.B = 1.0f / y;
                                }
                            }
                        }
                        if (this.A == 0 && (!this.K.i() || !this.M.i())) {
                            this.A = 1;
                        }
                        else if (this.A == 1 && (!this.J.i() || !this.L.i())) {
                            this.A = 0;
                        }
                        if (this.A == -1 && (!this.K.i() || !this.M.i() || !this.J.i() || !this.L.i())) {
                            if (this.K.i() && this.M.i()) {
                                this.A = 0;
                            }
                            else if (this.J.i() && this.L.i()) {
                                this.B = 1.0f / this.B;
                                this.A = 1;
                            }
                        }
                        n7 = d2;
                        if (this.A == -1) {
                            final int u3 = this.u;
                            if (u3 > 0 && this.x == 0) {
                                this.A = 0;
                                n7 = d2;
                            }
                            else {
                                n7 = d2;
                                if (u3 == 0) {
                                    n7 = d2;
                                    if (this.x > 0) {
                                        this.B = 1.0f / this.B;
                                        this.A = 1;
                                        n7 = d2;
                                    }
                                }
                            }
                        }
                    }
                    else if (u2[0] == h2 && n5 == 3) {
                        this.A = 0;
                        d2 = (int)(y * x);
                        final a a2 = u2[1];
                        n7 = d2;
                        if (a2 != h2) {
                            b11 = false;
                            n8 = 4;
                            break Label_1673;
                        }
                    }
                    else {
                        n7 = d2;
                        if (u2[1] == h2) {
                            n7 = d2;
                            if (n6 == 3) {
                                this.A = 1;
                                if (z == -1) {
                                    this.B = 1.0f / y;
                                }
                                n9 = (int)(this.B * w);
                                n10 = d2;
                                if (u2[0] != h2) {
                                    e3 = n9;
                                    n8 = n5;
                                    b11 = false;
                                    n6 = 4;
                                    break Label_1673;
                                }
                                break Label_1640;
                            }
                        }
                    }
                    final int n11 = e3;
                    n10 = n7;
                    n9 = n11;
                }
                final int n12 = n9;
                n8 = n5;
                b11 = true;
                d2 = n10;
                e3 = n12;
            }
            else {
                b11 = false;
                n8 = r;
                n6 = s;
            }
        }
        final int[] t2 = this.t;
        t2[0] = n8;
        t2[1] = n6;
        boolean b12 = false;
        Label_1722: {
            if (b11) {
                final int a3 = this.A;
                if (a3 == 0 || a3 == -1) {
                    b12 = true;
                    break Label_1722;
                }
            }
            b12 = false;
        }
        boolean b13 = false;
        Label_1754: {
            if (b11) {
                final int a4 = this.A;
                if (a4 == 1 || a4 == -1) {
                    b13 = true;
                    break Label_1754;
                }
            }
            b13 = false;
        }
        final boolean b14 = this.U[0] == g0 && this instanceof uj6;
        if (b14) {
            d2 = 0;
        }
        final boolean b15 = this.Q.i() ^ true;
        final boolean[] t3 = this.T;
        final boolean b16 = t3[0];
        final boolean b17 = t3[1];
        Label_2159: {
            if (this.o != 2 && !this.k) {
                if (b) {
                    final brc d3 = this.d;
                    if (d3 != null) {
                        final zp8 h3 = d3.h;
                        if (h3.j) {
                            if (d3.i.j) {
                                if (b) {
                                    ydf.e(l, h3.g);
                                    ydf.e(i, this.d.i.g);
                                    if (this.V != null && b4 && this.f[0] && !this.E()) {
                                        ydf.f(ydf.l((Object)this.V.L), i, 0, 8);
                                    }
                                }
                                break Label_2159;
                            }
                        }
                    }
                }
                final tj6 v4 = this.V;
                lmq l2;
                if (v4 != null) {
                    l2 = ydf.l((Object)v4.L);
                }
                else {
                    l2 = null;
                }
                final tj6 v5 = this.V;
                lmq l3;
                if (v5 != null) {
                    l3 = ydf.l((Object)v5.J);
                }
                else {
                    l3 = null;
                }
                final boolean b18 = this.f[0];
                final a[] u4 = this.U;
                this.h(ydf, true, b4, b5, b18, l3, l2, u4[0], b14, this.J, this.L, this.a0, d2, this.d0, this.C[0], this.f0, b12, u4[1] == h2, (boolean)(n4 != 0), (boolean)(n3 != 0), b16, n8, n6, this.u, this.v, this.w, b15);
            }
        }
        boolean b19 = false;
        Label_2317: {
            if (b) {
                final juw e4 = this.e;
                if (e4 != null) {
                    final zp8 h4 = ((jpx)e4).h;
                    if (h4.j && ((jpx)e4).i.j) {
                        ydf.e(j, h4.g);
                        ydf.e(k, ((jpx)this.e).i.g);
                        ydf.e(m, this.e.k.g);
                        final tj6 v6 = this.V;
                        if (v6 != null && n3 == 0 && b5) {
                            if (this.f[1]) {
                                ydf.f(ydf.l((Object)v6.M), k, 0, 8);
                            }
                        }
                        b19 = false;
                        break Label_2317;
                    }
                }
            }
            b19 = true;
        }
        if (this.p == 2) {
            b19 = false;
        }
        if (b19 && !this.l) {
            final boolean b20 = this.U[1] == g0 && this instanceof uj6;
            if (b20) {
                e3 = 0;
            }
            final tj6 v7 = this.V;
            lmq l4;
            if (v7 != null) {
                l4 = ydf.l((Object)v7.M);
            }
            else {
                l4 = null;
            }
            final tj6 v8 = this.V;
            lmq l5;
            if (v8 != null) {
                l5 = ydf.l((Object)v8.K);
            }
            else {
                l5 = null;
            }
            final int c0 = this.c0;
            boolean b21 = false;
            Label_2577: {
                if (c0 > 0 || this.i0 == 8) {
                    final kj6 n13 = this.N;
                    if (n13.f != null) {
                        ydf.d(m, j, c0, 8);
                        ydf.d(m, ydf.l((Object)this.N.f), this.N.e(), 8);
                        if (b5) {
                            ydf.f(l4, ydf.l((Object)this.M), 0, 5);
                        }
                        b21 = false;
                        break Label_2577;
                    }
                    if (this.i0 == 8) {
                        ydf.d(m, j, n13.e(), 8);
                    }
                    else {
                        ydf.d(m, j, c0, 8);
                    }
                }
                b21 = b15;
            }
            final boolean b22 = this.f[1];
            final a[] u5 = this.U;
            this.h(ydf, false, b5, b4, b22, l5, l4, u5[1], b20, this.K, this.M, this.b0, e3, this.e0, this.C[1], this.g0, b13, u5[0] == h2, (boolean)(n3 != 0), (boolean)(n4 != 0), b17, n6, n8, this.x, this.y, this.z, b21);
        }
        if (b11) {
            if (this.A == 1) {
                ydf.h(k, j, i, l, this.B);
            }
            else {
                ydf.h(i, l, k, j, this.B);
            }
        }
        if (this.Q.i()) {
            final tj6 d4 = this.Q.f.d;
            final float n14 = (float)Math.toRadians(this.D + 90.0f);
            final int e5 = this.Q.e();
            final kj6$a f2 = kj6$a.F0;
            final lmq l6 = ydf.l((Object)this.n(f2));
            final kj6$a g2 = kj6$a.G0;
            final lmq l7 = ydf.l((Object)this.n(g2));
            final kj6$a h5 = kj6$a.H0;
            final lmq l8 = ydf.l((Object)this.n(h5));
            final kj6$a i2 = kj6$a.I0;
            final lmq l9 = ydf.l((Object)this.n(i2));
            final lmq l10 = ydf.l((Object)d4.n(f2));
            final lmq l11 = ydf.l((Object)d4.n(g2));
            final lmq l12 = ydf.l((Object)d4.n(h5));
            final lmq l13 = ydf.l((Object)d4.n(i2));
            final at0 m2 = ydf.m();
            final double n15 = n14;
            final double sin = Math.sin(n15);
            final double n16 = e5;
            m2.f(l7, l9, l11, l13, (float)(sin * n16));
            ydf.c(m2);
            final at0 m3 = ydf.m();
            m3.f(l6, l8, l10, l12, (float)(Math.cos(n15) * n16));
            ydf.c(m3);
        }
        this.k = false;
        this.l = false;
    }
    
    public boolean g() {
        return this.i0 != 8;
    }
    
    public final void h(final ydf ydf, final boolean b, final boolean b2, final boolean b3, boolean b4, lmq lmq, final lmq lmq2, a h0, final boolean b5, final kj6 kj6, final kj6 kj7, int n, int n2, final int n3, int n4, final float n5, final boolean b6, final boolean b7, final boolean b8, final boolean b9, final boolean b10, int ordinal, int n6, int n7, int n8, final float n9, final boolean b11) {
        final kj6$a i0 = kj6$a.I0;
        final lmq l = ydf.l((Object)kj6);
        final lmq j = ydf.l((Object)kj7);
        final lmq k = ydf.l((Object)kj6.f);
        final lmq m = ydf.l((Object)kj7.f);
        final int i2 = kj6.i() ? 1 : 0;
        final boolean i3 = kj7.i();
        final boolean i4 = this.Q.i();
        int n10;
        if (i3) {
            n10 = i2 + 1;
        }
        else {
            n10 = i2;
        }
        int n11 = n10;
        if (i4) {
            n11 = n10 + 1;
        }
        int n12;
        if (b6) {
            n12 = 3;
        }
        else {
            n12 = ordinal;
        }
        ordinal = h0.ordinal();
        final boolean b12 = ordinal != 0 && ordinal != 1 && ordinal == 2 && n12 != 4;
        final int h2 = this.h;
        int n13 = b12 ? 1 : 0;
        ordinal = n2;
        if (h2 != -1) {
            n13 = (b12 ? 1 : 0);
            ordinal = n2;
            if (b) {
                this.h = -1;
                ordinal = h2;
                n13 = 0;
            }
        }
        n2 = this.i;
        if (n2 != -1 && !b) {
            this.i = -1;
            n13 = 0;
        }
        else {
            n2 = ordinal;
        }
        if (this.i0 == 8) {
            ordinal = 0;
            n2 = 0;
        }
        else {
            ordinal = n13;
        }
        if (b11) {
            if (i2 == 0 && !i3 && !i4) {
                ydf.e(l, n);
            }
            else if (i2 != 0 && !i3) {
                ydf.d(l, k, kj6.e(), 8);
            }
        }
        int n16 = 0;
        Label_0938: {
            int n14;
            int n15;
            if (ordinal == 0) {
                if (b5) {
                    ydf.d(j, l, 0, 3);
                    if (n3 > 0) {
                        ydf.f(j, l, n3, 8);
                    }
                    n14 = n7;
                    n2 = n8;
                    n15 = ordinal;
                    if (n4 < Integer.MAX_VALUE) {
                        ydf.g(j, l, n4, 8);
                        n14 = n7;
                        n2 = n8;
                        n15 = ordinal;
                    }
                }
                else {
                    ydf.d(j, l, n2, 8);
                    n15 = ordinal;
                    n2 = n8;
                    n14 = n7;
                }
            }
            else {
                if (n11 != 2 && !b6 && (n12 == 1 || n12 == 0)) {
                    n2 = (n = Math.max(n7, n2));
                    if (n8 > 0) {
                        n = Math.min(n8, n2);
                    }
                    ydf.d(j, l, n, 8);
                    n16 = 0;
                    n = n8;
                    n8 = n7;
                    break Label_0938;
                }
                if ((n4 = n7) == -2) {
                    n4 = n2;
                }
                if ((n = n8) == -2) {
                    n = n2;
                }
                if ((n7 = n2) > 0) {
                    n7 = n2;
                    if (n12 != 1) {
                        n7 = 0;
                    }
                }
                n2 = n7;
                if (n4 > 0) {
                    ydf.f(j, l, n4, 8);
                    n2 = Math.max(n7, n4);
                }
                if (n > 0) {
                    if (b2 && n12 == 1) {
                        n7 = 0;
                    }
                    else {
                        n7 = 1;
                    }
                    if (n7 != 0) {
                        ydf.g(j, l, n, 8);
                    }
                    n2 = Math.min(n2, n);
                }
                if (n12 == 1) {
                    if (b2) {
                        ydf.d(j, l, n2, 8);
                        n14 = n4;
                        n2 = n;
                        n15 = ordinal;
                    }
                    else if (b8) {
                        ydf.d(j, l, n2, 5);
                        ydf.g(j, l, n2, 8);
                        n14 = n4;
                        n2 = n;
                        n15 = ordinal;
                    }
                    else {
                        ydf.d(j, l, n2, 5);
                        ydf.g(j, l, n2, 8);
                        n14 = n4;
                        n2 = n;
                        n15 = ordinal;
                    }
                }
                else {
                    if (n12 != 2) {
                        b4 = true;
                        n16 = ordinal;
                        n8 = n4;
                        break Label_0938;
                    }
                    final kj6$a e = kj6.e;
                    final kj6$a g0 = kj6$a.G0;
                    lmq lmq3;
                    lmq lmq4;
                    if (e != g0 && e != i0) {
                        lmq3 = ydf.l((Object)this.V.n(kj6$a.F0));
                        lmq4 = ydf.l((Object)this.V.n(kj6$a.H0));
                    }
                    else {
                        lmq3 = ydf.l((Object)this.V.n(g0));
                        lmq4 = ydf.l((Object)this.V.n(i0));
                    }
                    final at0 m2 = ydf.m();
                    m2.c(j, l, lmq4, lmq3, n9);
                    ydf.c(m2);
                    n14 = n4;
                    n2 = n;
                    n15 = ordinal;
                    if (b2) {
                        n15 = 0;
                        n14 = n4;
                        n2 = n;
                    }
                }
            }
            n8 = n14;
            n16 = n15;
            n = n2;
        }
        if (b11 && !b8) {
            boolean b13 = false;
            Label_2343: {
                Label_2332: {
                    if (i2 == 0 && !i3 && !i4) {
                        lmq = m;
                    }
                    else {
                        if (i2 != 0 && !i3) {
                            final tj6 d = kj6.f.d;
                            if (b2 && d instanceof pi1) {
                                n = 8;
                            }
                            else {
                                n = 5;
                            }
                            lmq = j;
                            lmq = m;
                            b13 = b2;
                            break Label_2343;
                        }
                        if (i2 == 0 && i3) {
                            ydf.d(j, m, -kj7.e(), 8);
                            if (b2) {
                                ydf.f(l, lmq, 0, 5);
                            }
                        }
                        else if (i2 != 0 && i3) {
                            final tj6 d2 = kj6.f.d;
                            final tj6 d3 = kj7.f.d;
                            final tj6 v = this.V;
                            final int n17 = 6;
                            Label_1704: {
                                Label_1698: {
                                    Label_1691: {
                                        Label_1688: {
                                            if (n16 != 0) {
                                                if (n12 == 0) {
                                                    if (n == 0 && n8 == 0) {
                                                        if (k.K0 && m.K0) {
                                                            ydf.d(l, k, kj6.e(), 8);
                                                            ydf.d(j, m, -kj7.e(), 8);
                                                            return;
                                                        }
                                                        n2 = 8;
                                                        n6 = 8;
                                                        n = 0;
                                                        ordinal = 1;
                                                        n4 = 0;
                                                    }
                                                    else {
                                                        n2 = 5;
                                                        n6 = 5;
                                                        n = 1;
                                                        ordinal = 0;
                                                        n4 = 1;
                                                    }
                                                    if (!(d2 instanceof pi1) && !(d3 instanceof pi1)) {
                                                        final int n18 = n4;
                                                        n4 = 6;
                                                        n7 = n2;
                                                        final int n19 = n;
                                                        n2 = n6;
                                                        n = n7;
                                                        n7 = n19;
                                                        n6 = ordinal;
                                                        ordinal = n18;
                                                        break Label_1704;
                                                    }
                                                    final int n20 = n4;
                                                    n4 = 6;
                                                    n6 = n2;
                                                    n7 = n;
                                                    n2 = 4;
                                                    n = n6;
                                                    n6 = ordinal;
                                                    ordinal = n20;
                                                    break Label_1704;
                                                }
                                                else if (n12 == 2) {
                                                    if (!(d2 instanceof pi1) && !(d3 instanceof pi1)) {
                                                        n2 = 5;
                                                        break Label_1688;
                                                    }
                                                }
                                                else {
                                                    if (n12 == 1) {
                                                        n2 = 4;
                                                        n = 8;
                                                        break Label_1691;
                                                    }
                                                    if (n12 == 3) {
                                                        Label_1405: {
                                                            if (this.A == -1) {
                                                                if (b9) {
                                                                    if (b2) {
                                                                        n4 = 5;
                                                                    }
                                                                    else {
                                                                        n4 = 4;
                                                                    }
                                                                }
                                                                else {
                                                                    n4 = 8;
                                                                }
                                                                n2 = 5;
                                                                n = 8;
                                                            }
                                                            else {
                                                                if (b6) {
                                                                    if (n6 != 2 && n6 != 1) {
                                                                        n = 0;
                                                                    }
                                                                    else {
                                                                        n = 1;
                                                                    }
                                                                    if (n == 0) {
                                                                        n2 = 8;
                                                                        n = 5;
                                                                    }
                                                                    else {
                                                                        n2 = 5;
                                                                        n = 4;
                                                                    }
                                                                    ordinal = n2;
                                                                    n4 = 6;
                                                                    n7 = 1;
                                                                    n6 = 1;
                                                                    final int n21 = 1;
                                                                    n2 = n;
                                                                    n = ordinal;
                                                                    ordinal = n21;
                                                                    break Label_1704;
                                                                }
                                                                if (n > 0) {
                                                                    n2 = 5;
                                                                }
                                                                else if (n == 0 && n8 == 0) {
                                                                    if (b9) {
                                                                        if (d2 != v && d3 != v) {
                                                                            n = 4;
                                                                        }
                                                                        else {
                                                                            n = 5;
                                                                        }
                                                                        n4 = 6;
                                                                        n2 = 4;
                                                                        break Label_1405;
                                                                    }
                                                                    n2 = 8;
                                                                }
                                                                else {
                                                                    n2 = 4;
                                                                }
                                                                n4 = 6;
                                                                n = 5;
                                                            }
                                                        }
                                                        n6 = 1;
                                                        break Label_1698;
                                                    }
                                                    n4 = 6;
                                                    n2 = 4;
                                                    n = 5;
                                                    n7 = 0;
                                                    n6 = 0;
                                                    ordinal = 0;
                                                    break Label_1704;
                                                }
                                            }
                                            else if (k.K0 && m.K0) {
                                                ydf.b(l, k, kj6.e(), n5, m, j, kj7.e(), 8);
                                                if (b2 && b4) {
                                                    if (kj7.f != null) {
                                                        n = kj7.e();
                                                    }
                                                    else {
                                                        n = 0;
                                                    }
                                                    if (m != lmq2) {
                                                        ydf.f(lmq2, j, n, 5);
                                                    }
                                                }
                                                return;
                                            }
                                            n2 = 4;
                                        }
                                        n = 5;
                                    }
                                    n4 = 6;
                                    n6 = 0;
                                }
                                n7 = 1;
                                ordinal = 1;
                            }
                            int n22;
                            if (ordinal != 0 && k == m && d2 != v) {
                                ordinal = 0;
                                n22 = 0;
                            }
                            else {
                                final int n23 = 1;
                                n22 = ordinal;
                                ordinal = n23;
                            }
                            if (n7 != 0) {
                                if (n16 == 0 && !b7 && !b9 && k == lmq && m == lmq2) {
                                    b13 = false;
                                    n = 8;
                                    ordinal = 8;
                                    n4 = 0;
                                }
                                else {
                                    b13 = b2;
                                    n7 = n4;
                                    n4 = ordinal;
                                    ordinal = n7;
                                }
                                ydf.b(l, k, kj6.e(), n5, m, j, kj7.e(), ordinal);
                            }
                            else {
                                n4 = ordinal;
                                b13 = b2;
                            }
                            if (this.i0 == 8 && !kj7.h()) {
                                return;
                            }
                            final lmq lmq5 = m;
                            ordinal = n;
                            if (n22 != 0) {
                                if (b13 && k != lmq5 && n16 == 0 && (d2 instanceof pi1 || d3 instanceof pi1)) {
                                    n = 6;
                                }
                                ydf.f(l, k, kj6.e(), n);
                                ydf.g(j, lmq5, -kj7.e(), n);
                                ordinal = n;
                            }
                            if (b13 && b10 && !(d2 instanceof pi1) && !(d3 instanceof pi1) && d3 != v) {
                                n = 6;
                                n4 = 6;
                                n2 = 1;
                            }
                            else {
                                n = n2;
                                n2 = n4;
                                n4 = ordinal;
                            }
                            if (n2 != 0) {
                                n2 = n;
                                Label_2120: {
                                    if (n6 != 0) {
                                        if (b9) {
                                            n2 = n;
                                            if (!b3) {
                                                break Label_2120;
                                            }
                                        }
                                        n2 = n17;
                                        if (d2 != v) {
                                            if (d3 == v) {
                                                n2 = n17;
                                            }
                                            else {
                                                n2 = n;
                                            }
                                        }
                                        if (d2 instanceof dbc || d3 instanceof dbc) {
                                            n2 = 5;
                                        }
                                        if (d2 instanceof pi1 || d3 instanceof pi1) {
                                            n2 = 5;
                                        }
                                        if (b9) {
                                            n2 = 5;
                                        }
                                        n2 = Math.max(n2, n);
                                    }
                                }
                                n = n2;
                                Label_2176: {
                                    if (b13) {
                                        n2 = (n = Math.min(n4, n2));
                                        if (b6) {
                                            n = n2;
                                            if (!b9) {
                                                if (d2 != v) {
                                                    n = n2;
                                                    if (d3 != v) {
                                                        break Label_2176;
                                                    }
                                                }
                                                n = 4;
                                            }
                                        }
                                    }
                                }
                                ydf.d(l, k, kj6.e(), n);
                                ydf.d(j, lmq5, -kj7.e(), n);
                            }
                            if (b13) {
                                if (lmq == k) {
                                    n = kj6.e();
                                }
                                else {
                                    n = 0;
                                }
                                if (k != lmq) {
                                    ydf.f(l, lmq, n, 5);
                                }
                            }
                            lmq = j;
                            if (b13 && n16 != 0 && n3 == 0 && n8 == 0) {
                                if (n16 != 0 && n12 == 3) {
                                    ydf.f(lmq, l, 0, 8);
                                }
                                else {
                                    ydf.f(lmq, l, 0, 5);
                                }
                            }
                            break Label_2332;
                        }
                        lmq = m;
                    }
                    lmq = m;
                    lmq = j;
                    b13 = b2;
                }
                lmq = j;
                lmq = m;
                n = 5;
            }
            if (b13 && b4) {
                if (kj7.f != null) {
                    n2 = kj7.e();
                }
                else {
                    n2 = 0;
                }
                if (m != lmq2) {
                    ydf.f(lmq2, j, n2, n);
                }
            }
            return;
        }
        if (n11 < 2 && b2 && b4) {
            ydf.f(l, lmq, 0, 8);
            if (!b && this.N.f != null) {
                n2 = 0;
            }
            else {
                n2 = 1;
            }
            n = n2;
            Label_2531: {
                if (!b) {
                    final kj6 f = this.N.f;
                    n = n2;
                    if (f != null) {
                        final tj6 d4 = f.d;
                        if (d4.Y != 0.0f) {
                            final a[] u = d4.U;
                            final a a = u[0];
                            h0 = tj6.a.H0;
                            if (a == h0 && u[1] == h0) {
                                n = 1;
                                break Label_2531;
                            }
                        }
                        n = 0;
                    }
                }
            }
            if (n != 0) {
                ydf.f(lmq2, j, 0, 8);
            }
        }
    }
    
    public final void i(final kj6$a kj6$a, final tj6 tj6, kj6$a j0, int n) {
        final kj6$a m0 = kj6$a.M0;
        final kj6$a l0 = kj6$a.L0;
        final kj6$a f0 = kj6$a.F0;
        final kj6$a g0 = kj6$a.G0;
        final kj6$a h0 = kj6$a.H0;
        final kj6$a i0 = kj6$a.I0;
        final kj6$a k0 = kj6$a.K0;
        if (kj6$a == k0) {
            if (j0 == k0) {
                final kj6 n2 = this.n(f0);
                final kj6 n3 = this.n(h0);
                final kj6 n4 = this.n(g0);
                final kj6 n5 = this.n(i0);
                boolean b = true;
                if ((n2 != null && n2.i()) || (n3 != null && n3.i())) {
                    n = 0;
                }
                else {
                    this.i(f0, tj6, f0, 0);
                    this.i(h0, tj6, h0, 0);
                    n = 1;
                }
                if ((n4 != null && n4.i()) || (n5 != null && n5.i())) {
                    b = false;
                }
                else {
                    this.i(g0, tj6, g0, 0);
                    this.i(i0, tj6, i0, 0);
                }
                if (n != 0 && b) {
                    this.n(k0).a(tj6.n(k0), 0);
                    return;
                }
                if (n != 0) {
                    this.n(l0).a(tj6.n(l0), 0);
                    return;
                }
                if (b) {
                    this.n(m0).a(tj6.n(m0), 0);
                }
                return;
            }
            else if (j0 != f0 && j0 != h0) {
                if (j0 == g0 || j0 == i0) {
                    this.i(g0, tj6, j0, 0);
                    this.i(i0, tj6, j0, 0);
                    this.n(k0).a(tj6.n(j0), 0);
                }
                return;
            }
            else {
                this.i(f0, tj6, j0, 0);
                try {
                    this.i(h0, tj6, j0, 0);
                    this.n(k0).a(tj6.n(j0), 0);
                    return;
                }
                finally {}
            }
        }
        if (kj6$a == l0 && (j0 == f0 || j0 == h0)) {
            final kj6 n6 = this.n(f0);
            final kj6 n7 = tj6.n(j0);
            final kj6 n8 = this.n(h0);
            n6.a(n7, 0);
            n8.a(n7, 0);
            this.n(l0).a(n7, 0);
        }
        else if (kj6$a == m0 && (j0 == g0 || j0 == i0)) {
            final kj6 n9 = tj6.n(j0);
            this.n(g0).a(n9, 0);
            this.n(i0).a(n9, 0);
            this.n(m0).a(n9, 0);
        }
        else if (kj6$a == l0 && j0 == l0) {
            this.n(f0).a(tj6.n(f0), 0);
            this.n(h0).a(tj6.n(h0), 0);
            this.n(l0).a(tj6.n(j0), 0);
        }
        else if (kj6$a == m0 && j0 == m0) {
            this.n(g0).a(tj6.n(g0), 0);
            this.n(i0).a(tj6.n(i0), 0);
            this.n(m0).a(tj6.n(j0), 0);
        }
        else {
            final kj6 n10 = this.n(kj6$a);
            final kj6 n11 = tj6.n(j0);
            if (n10.j(n11)) {
                j0 = kj6$a.J0;
                if (kj6$a == j0) {
                    final kj6 n12 = this.n(g0);
                    final kj6 n13 = this.n(i0);
                    if (n12 != null) {
                        n12.k();
                    }
                    if (n13 != null) {
                        n13.k();
                    }
                }
                else if (kj6$a != g0 && kj6$a != i0) {
                    if (kj6$a == f0 || kj6$a == h0) {
                        final kj6 n14 = this.n(k0);
                        if (n14.f != n11) {
                            n14.k();
                        }
                        final kj6 f2 = this.n(kj6$a).f();
                        final kj6 n15 = this.n(l0);
                        if (n15.i()) {
                            f2.k();
                            n15.k();
                        }
                    }
                }
                else {
                    final kj6 n16 = this.n(j0);
                    if (n16 != null) {
                        n16.k();
                    }
                    final kj6 n17 = this.n(k0);
                    if (n17.f != n11) {
                        n17.k();
                    }
                    final kj6 f3 = this.n(kj6$a).f();
                    final kj6 n18 = this.n(m0);
                    if (n18.i()) {
                        f3.k();
                        n18.k();
                    }
                }
                n10.a(n11, n);
            }
        }
    }
    
    public final void j(final kj6 kj6, final kj6 kj7, final int n) {
        if (kj6.d == this) {
            this.i(kj6.e, kj7.d, kj7.e, n);
        }
    }
    
    public void k(tj6 r0, final HashMap<tj6, tj6> hashMap) {
        this.o = r0.o;
        this.p = r0.p;
        this.r = r0.r;
        this.s = r0.s;
        final int[] t = this.t;
        final int[] t2 = r0.t;
        t[0] = t2[0];
        t[1] = t2[1];
        this.u = r0.u;
        this.v = r0.v;
        this.x = r0.x;
        this.y = r0.y;
        this.z = r0.z;
        this.A = r0.A;
        this.B = r0.B;
        final int[] c = r0.C;
        this.C = Arrays.copyOf(c, c.length);
        this.D = r0.D;
        this.E = r0.E;
        this.F = r0.F;
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.O.k();
        this.P.k();
        this.Q.k();
        this.U = Arrays.copyOf(this.U, 2);
        final tj6 v = this.V;
        final tj6 tj6 = null;
        tj6 v2;
        if (v == null) {
            v2 = null;
        }
        else {
            v2 = hashMap.get(r0.V);
        }
        this.V = v2;
        this.W = r0.W;
        this.X = r0.X;
        this.Y = r0.Y;
        this.Z = r0.Z;
        this.a0 = r0.a0;
        this.b0 = r0.b0;
        this.c0 = r0.c0;
        this.d0 = r0.d0;
        this.e0 = r0.e0;
        this.f0 = r0.f0;
        this.g0 = r0.g0;
        this.h0 = r0.h0;
        this.i0 = r0.i0;
        this.j0 = r0.j0;
        this.k0 = r0.k0;
        this.l0 = r0.l0;
        this.m0 = r0.m0;
        final float[] n0 = this.n0;
        final float[] n2 = r0.n0;
        n0[0] = n2[0];
        n0[1] = n2[1];
        final tj6[] o0 = this.o0;
        final tj6[] o2 = r0.o0;
        o0[0] = o2[0];
        o0[1] = o2[1];
        final tj6[] p2 = this.p0;
        final tj6[] p3 = r0.p0;
        p2[0] = p3[0];
        p2[1] = p3[1];
        final tj6 q0 = r0.q0;
        tj6 q2;
        if (q0 == null) {
            q2 = null;
        }
        else {
            q2 = hashMap.get(q0);
        }
        this.q0 = q2;
        r0 = r0.r0;
        if (r0 == null) {
            r0 = tj6;
        }
        else {
            r0 = hashMap.get(r0);
        }
        this.r0 = r0;
    }
    
    public final void l(final ydf ydf) {
        ydf.l((Object)this.J);
        ydf.l((Object)this.K);
        ydf.l((Object)this.L);
        ydf.l((Object)this.M);
        if (this.c0 > 0) {
            ydf.l((Object)this.N);
        }
    }
    
    public final void m() {
        if (this.d == null) {
            this.d = new brc(this);
        }
        if (this.e == null) {
            this.e = new juw(this);
        }
    }
    
    public kj6 n(final kj6$a kj6$a) {
        switch (((Enum)kj6$a).ordinal()) {
            default: {
                throw new AssertionError((Object)((Enum)kj6$a).name());
            }
            case 8: {
                return this.P;
            }
            case 7: {
                return this.O;
            }
            case 6: {
                return this.Q;
            }
            case 5: {
                return this.N;
            }
            case 4: {
                return this.M;
            }
            case 3: {
                return this.L;
            }
            case 2: {
                return this.K;
            }
            case 1: {
                return this.J;
            }
            case 0: {
                return null;
            }
        }
    }
    
    public final int o() {
        return this.z() + this.X;
    }
    
    public final a p(final int n) {
        if (n == 0) {
            return this.U[0];
        }
        if (n == 1) {
            return this.U[1];
        }
        return null;
    }
    
    public final int q() {
        if (this.i0 == 8) {
            return 0;
        }
        return this.X;
    }
    
    public final tj6 r(final int n) {
        if (n == 0) {
            final kj6 l = this.L;
            final kj6 f = l.f;
            if (f != null && f.f == l) {
                return f.d;
            }
        }
        else if (n == 1) {
            final kj6 m = this.M;
            final kj6 f2 = m.f;
            if (f2 != null && f2.f == m) {
                return f2.d;
            }
        }
        return null;
    }
    
    public final tj6 s(final int n) {
        if (n == 0) {
            final kj6 j = this.J;
            final kj6 f = j.f;
            if (f != null && f.f == j) {
                return f.d;
            }
        }
        else if (n == 1) {
            final kj6 k = this.K;
            final kj6 f2 = k.f;
            if (f2 != null && f2.f == k) {
                return f2.d;
            }
        }
        return null;
    }
    
    public final int t() {
        return this.y() + this.W;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        final String k0 = this.k0;
        final String s = "";
        String y;
        if (k0 != null) {
            y = m51.y(ehk.f("type: "), this.k0, " ");
        }
        else {
            y = "";
        }
        sb.append(y);
        String y2 = s;
        if (this.j0 != null) {
            y2 = m51.y(ehk.f("id: "), this.j0, " ");
        }
        sb.append(y2);
        sb.append("(");
        sb.append(this.a0);
        sb.append(", ");
        sb.append(this.b0);
        sb.append(") - (");
        sb.append(this.W);
        sb.append(" x ");
        return ad.y(sb, this.X, ")");
    }
    
    public void u(final StringBuilder sb) {
        final StringBuilder f = ehk.f("  ");
        f.append(this.j);
        f.append(":{\n");
        sb.append(f.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("    actualWidth:");
        sb2.append(this.W);
        sb.append(sb2.toString());
        sb.append("\n");
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("    actualHeight:");
        sb3.append(this.X);
        sb.append(sb3.toString());
        sb.append("\n");
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("    actualLeft:");
        sb4.append(this.a0);
        sb.append(sb4.toString());
        sb.append("\n");
        final StringBuilder sb5 = new StringBuilder();
        sb5.append("    actualTop:");
        sb5.append(this.b0);
        sb.append(sb5.toString());
        sb.append("\n");
        this.w(sb, "left", this.J);
        this.w(sb, "top", this.K);
        this.w(sb, "right", this.L);
        this.w(sb, "bottom", this.M);
        this.w(sb, "baseline", this.N);
        this.w(sb, "centerX", this.O);
        this.w(sb, "centerY", this.P);
        final int w = this.W;
        final int d0 = this.d0;
        final int n = this.C[0];
        final int u = this.u;
        final int r = this.r;
        final float w2 = this.w;
        final float n2 = this.n0[0];
        this.v(sb, "    width", w, d0, n, u, r, w2);
        final int x = this.X;
        final int e0 = this.e0;
        final int n3 = this.C[1];
        final int x2 = this.x;
        final int s = this.s;
        final float z = this.z;
        final float n4 = this.n0[1];
        this.v(sb, "    height", x, e0, n3, x2, s, z);
        final float y = this.Y;
        final int z2 = this.Z;
        if (y != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(y);
            sb.append(",");
            sb.append(z2);
            sb.append("");
            sb.append("],\n");
        }
        this.N(sb, "    horizontalBias", this.f0, 0.5f);
        this.N(sb, "    verticalBias", this.g0, 0.5f);
        this.O(sb, "    horizontalChainStyle", this.l0, 0);
        this.O(sb, "    verticalChainStyle", this.m0, 0);
        sb.append("  }");
    }
    
    public final void v(final StringBuilder sb, final String s, final int n, final int n2, final int n3, final int n4, final int n5, final float n6) {
        sb.append(s);
        sb.append(" :  {\n");
        this.O(sb, "      size", n, 0);
        this.O(sb, "      min", n2, 0);
        this.O(sb, "      max", n3, Integer.MAX_VALUE);
        this.O(sb, "      matchMin", n4, 0);
        this.O(sb, "      matchDef", n5, 0);
        this.N(sb, "      matchPercent", n6, 1.0f);
        sb.append("    },\n");
    }
    
    public final void w(final StringBuilder sb, final String s, final kj6 kj6) {
        if (kj6.f == null) {
            return;
        }
        ffe.q(sb, "    ", s, " : [ '");
        sb.append(kj6.f);
        sb.append("'");
        if (kj6.h != Integer.MIN_VALUE || kj6.g != 0) {
            sb.append(",");
            sb.append(kj6.g);
            if (kj6.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(kj6.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }
    
    public final int x() {
        if (this.i0 == 8) {
            return 0;
        }
        return this.W;
    }
    
    public final int y() {
        final tj6 v = this.V;
        if (v != null && v instanceof uj6) {
            return ((uj6)v).B0 + this.a0;
        }
        return this.a0;
    }
    
    public final int z() {
        final tj6 v = this.V;
        if (v != null && v instanceof uj6) {
            return ((uj6)v).C0 + this.b0;
        }
        return this.b0;
    }
    
    public enum a
    {
        F0, 
        G0, 
        H0, 
        I0;
        
        public static final a[] J0;
    }
}
