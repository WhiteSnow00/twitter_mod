import java.util.Iterator;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zx8
{
    public static ms1.a a;
    
    static {
        zx8.a = new ms1.a();
    }
    
    public static boolean a(final tj6 tj6) {
        final tj6.a h0 = tj6.a.H0;
        final tj6.a g0 = tj6.a.G0;
        final tj6.a f0 = tj6.a.F0;
        final tj6.a[] u = tj6.U;
        final boolean b = false;
        final tj6.a a = u[0];
        final tj6.a a2 = u[1];
        final tj6 v = tj6.V;
        Object o;
        if (v != null) {
            o = v;
        }
        else {
            o = null;
        }
        if (o != null) {
            final tj6.a a3 = ((tj6)o).U[0];
        }
        if (o != null) {
            final tj6.a a4 = ((tj6)o).U[1];
        }
        final boolean b2 = a == f0 || tj6.H() || a == g0 || (a == h0 && tj6.r == 0 && tj6.Y == 0.0f && tj6.A(0)) || (a == h0 && tj6.r == 1 && tj6.B(0, tj6.x()));
        final boolean b3 = a2 == f0 || tj6.I() || a2 == g0 || (a2 == h0 && tj6.s == 0 && tj6.Y == 0.0f && tj6.A(1)) || (a2 == h0 && tj6.s == 1 && tj6.B(1, tj6.q()));
        if (tj6.Y > 0.0f && (b2 || b3)) {
            return true;
        }
        boolean b4 = b;
        if (b2) {
            b4 = b;
            if (b3) {
                b4 = true;
            }
        }
        return b4;
    }
    
    public static void b(final int n, final tj6 tj6, final ms1.b b, final boolean b2) {
        final tj6.a h0 = tj6.a.H0;
        if (tj6.m) {
            return;
        }
        if (!(tj6 instanceof uj6) && tj6.G() && a(tj6)) {
            uj6.k0(tj6, b, new ms1.a());
        }
        final kj6 n2 = tj6.n(kj6$a.F0);
        final kj6 n3 = tj6.n(kj6$a.H0);
        final int d = n2.d();
        final int d2 = n3.d();
        final HashSet a = n2.a;
        if (a != null && n2.c) {
            for (final kj6 kj6 : a) {
                final tj6 d3 = kj6.d;
                final int n4 = n + 1;
                final boolean a2 = a(d3);
                if (d3.G() && a2) {
                    uj6.k0(d3, b, new ms1.a());
                }
                final kj6 j = d3.J;
                boolean b3 = false;
                Label_0250: {
                    Label_0241: {
                        if (kj6 == j) {
                            final kj6 f = d3.L.f;
                            if (f != null && f.c) {
                                break Label_0241;
                            }
                        }
                        if (kj6 == d3.L) {
                            final kj6 f2 = j.f;
                            if (f2 != null && f2.c) {
                                break Label_0241;
                            }
                        }
                        b3 = false;
                        break Label_0250;
                    }
                    b3 = true;
                }
                final tj6.a[] u = d3.U;
                if (u[0] == h0 && !a2) {
                    if (u[0] != h0 || d3.v < 0 || d3.u < 0 || (d3.i0 != 8 && (d3.r != 0 || d3.Y != 0.0f)) || d3.E() || d3.G || !b3 || d3.E()) {
                        continue;
                    }
                    d(n4, tj6, b, d3, b2);
                }
                else {
                    if (d3.G()) {
                        continue;
                    }
                    final kj6 i = d3.J;
                    if (kj6 == i && d3.L.f == null) {
                        final int n5 = i.e() + d;
                        d3.Q(n5, d3.x() + n5);
                        b(n4, d3, b, b2);
                    }
                    else {
                        final kj6 l = d3.L;
                        if (kj6 == l && i.f == null) {
                            final int n6 = d - l.e();
                            d3.Q(n6 - d3.x(), n6);
                            b(n4, d3, b, b2);
                        }
                        else {
                            if (!b3 || d3.E()) {
                                continue;
                            }
                            c(n4, b, d3, b2);
                        }
                    }
                }
            }
        }
        if (tj6 instanceof dbc) {
            return;
        }
        final HashSet a3 = n3.a;
        if (a3 != null && n3.c) {
            for (final kj6 kj7 : a3) {
                final tj6 d4 = kj7.d;
                final int n7 = n + 1;
                final boolean a4 = a(d4);
                if (d4.G() && a4) {
                    uj6.k0(d4, b, new ms1.a());
                }
                final kj6 k = d4.J;
                boolean b4 = false;
                Label_0705: {
                    Label_0696: {
                        if (kj7 == k) {
                            final kj6 f3 = d4.L.f;
                            if (f3 != null && f3.c) {
                                break Label_0696;
                            }
                        }
                        if (kj7 == d4.L) {
                            final kj6 f4 = k.f;
                            if (f4 != null && f4.c) {
                                break Label_0696;
                            }
                        }
                        b4 = false;
                        break Label_0705;
                    }
                    b4 = true;
                }
                final tj6.a[] u2 = d4.U;
                if (u2[0] == h0 && !a4) {
                    if (u2[0] != h0 || d4.v < 0 || d4.u < 0) {
                        continue;
                    }
                    if (d4.i0 != 8) {
                        if (d4.r != 0) {
                            continue;
                        }
                        if (d4.Y != 0.0f) {
                            continue;
                        }
                    }
                    if (d4.E() || d4.G || !b4 || d4.E()) {
                        continue;
                    }
                    d(n7, tj6, b, d4, b2);
                }
                else {
                    if (d4.G()) {
                        continue;
                    }
                    final kj6 m = d4.J;
                    if (kj7 == m && d4.L.f == null) {
                        final int n8 = m.e() + d2;
                        d4.Q(n8, d4.x() + n8);
                        b(n7, d4, b, b2);
                    }
                    else {
                        final kj6 l2 = d4.L;
                        if (kj7 == l2 && m.f == null) {
                            final int n9 = d2 - l2.e();
                            d4.Q(n9 - d4.x(), n9);
                            b(n7, d4, b, b2);
                        }
                        else {
                            if (!b4 || d4.E()) {
                                continue;
                            }
                            c(n7, b, d4, b2);
                        }
                    }
                }
            }
        }
        tj6.m = true;
    }
    
    public static void c(final int n, final ms1.b b, final tj6 tj6, final boolean b2) {
        float f0 = tj6.f0;
        int d = tj6.J.f.d();
        int d2 = tj6.L.f.d();
        final int e = tj6.J.e();
        final int e2 = tj6.L.e();
        if (d == d2) {
            f0 = 0.5f;
        }
        else {
            d += e;
            d2 -= e2;
        }
        final int x = tj6.x();
        int n2 = d2 - d - x;
        if (d > d2) {
            n2 = d - d2 - x;
        }
        float n3;
        if (n2 > 0) {
            n3 = f0 * n2 + 0.5f;
        }
        else {
            n3 = f0 * n2;
        }
        final int n4 = (int)n3 + d;
        int n5 = n4 + x;
        if (d > d2) {
            n5 = n4 - x;
        }
        tj6.Q(n4, n5);
        b(n + 1, tj6, b, b2);
    }
    
    public static void d(final int n, final tj6 tj6, final ms1.b b, final tj6 tj7, final boolean b2) {
        final float f0 = tj7.f0;
        final int n2 = tj7.J.e() + tj7.J.f.d();
        final int n3 = tj7.L.f.d() - tj7.L.e();
        if (n3 >= n2) {
            int n5;
            final int n4 = n5 = tj7.x();
            if (tj7.i0 != 8) {
                final int r = tj7.r;
                int n7;
                if (r == 2) {
                    int n6;
                    if (tj6 instanceof uj6) {
                        n6 = tj6.x();
                    }
                    else {
                        n6 = tj6.V.x();
                    }
                    n7 = (int)(tj7.f0 * 0.5f * n6);
                }
                else {
                    n7 = n4;
                    if (r == 0) {
                        n7 = n3 - n2;
                    }
                }
                final int max = Math.max(tj7.u, n7);
                final int v = tj7.v;
                n5 = max;
                if (v > 0) {
                    n5 = Math.min(v, max);
                }
            }
            final int n8 = n2 + (int)(f0 * (n3 - n2 - n5) + 0.5f);
            tj7.Q(n8, n5 + n8);
            b(n + 1, tj7, b, b2);
        }
    }
    
    public static void e(final int n, final ms1.b b, final tj6 tj6) {
        float g0 = tj6.g0;
        int d = tj6.K.f.d();
        int d2 = tj6.M.f.d();
        final int e = tj6.K.e();
        final int e2 = tj6.M.e();
        if (d == d2) {
            g0 = 0.5f;
        }
        else {
            d += e;
            d2 -= e2;
        }
        final int q = tj6.q();
        int n2 = d2 - d - q;
        if (d > d2) {
            n2 = d - d2 - q;
        }
        float n3;
        if (n2 > 0) {
            n3 = g0 * n2 + 0.5f;
        }
        else {
            n3 = g0 * n2;
        }
        final int n4 = (int)n3;
        int n5 = d + n4;
        int n6 = n5 + q;
        if (d > d2) {
            n5 = d - n4;
            n6 = n5 - q;
        }
        tj6.R(n5, n6);
        g(n + 1, tj6, b);
    }
    
    public static void f(final int n, final tj6 tj6, final ms1.b b, final tj6 tj7) {
        final float g0 = tj7.g0;
        final int n2 = tj7.K.e() + tj7.K.f.d();
        final int n3 = tj7.M.f.d() - tj7.M.e();
        if (n3 >= n2) {
            int n5;
            final int n4 = n5 = tj7.q();
            if (tj7.i0 != 8) {
                final int s = tj7.s;
                int n7;
                if (s == 2) {
                    int n6;
                    if (tj6 instanceof uj6) {
                        n6 = tj6.q();
                    }
                    else {
                        n6 = tj6.V.q();
                    }
                    n7 = (int)(g0 * 0.5f * n6);
                }
                else {
                    n7 = n4;
                    if (s == 0) {
                        n7 = n3 - n2;
                    }
                }
                final int max = Math.max(tj7.x, n7);
                final int y = tj7.y;
                n5 = max;
                if (y > 0) {
                    n5 = Math.min(y, max);
                }
            }
            final int n8 = n2 + (int)(g0 * (n3 - n2 - n5) + 0.5f);
            tj7.R(n8, n5 + n8);
            g(n + 1, tj7, b);
        }
    }
    
    public static void g(final int n, final tj6 tj6, final ms1.b b) {
        final tj6.a h0 = tj6.a.H0;
        if (tj6.n) {
            return;
        }
        if (!(tj6 instanceof uj6) && tj6.G() && a(tj6)) {
            uj6.k0(tj6, b, new ms1.a());
        }
        final kj6 n2 = tj6.n(kj6$a.G0);
        final kj6 n3 = tj6.n(kj6$a.I0);
        final int d = n2.d();
        final int d2 = n3.d();
        final HashSet a = n2.a;
        if (a != null && n2.c) {
            for (final kj6 kj6 : a) {
                final tj6 d3 = kj6.d;
                final int n4 = n + 1;
                final boolean a2 = a(d3);
                if (d3.G() && a2) {
                    uj6.k0(d3, b, new ms1.a());
                }
                final kj6 k = d3.K;
                boolean b2 = false;
                Label_0248: {
                    Label_0241: {
                        if (kj6 == k) {
                            final kj6 f = d3.M.f;
                            if (f != null && f.c) {
                                break Label_0241;
                            }
                        }
                        if (kj6 == d3.M) {
                            final kj6 f2 = k.f;
                            if (f2 != null && f2.c) {
                                break Label_0241;
                            }
                        }
                        b2 = false;
                        break Label_0248;
                    }
                    b2 = true;
                }
                final tj6.a[] u = d3.U;
                if (u[1] == h0 && !a2) {
                    if (u[1] != h0 || d3.y < 0 || d3.x < 0 || (d3.i0 != 8 && (d3.s != 0 || d3.Y != 0.0f)) || d3.F() || d3.G || !b2 || d3.F()) {
                        continue;
                    }
                    f(n4, tj6, b, d3);
                }
                else {
                    if (d3.G()) {
                        continue;
                    }
                    final kj6 i = d3.K;
                    if (kj6 == i && d3.M.f == null) {
                        final int n5 = i.e() + d;
                        d3.R(n5, d3.q() + n5);
                        g(n4, d3, b);
                    }
                    else {
                        final kj6 m = d3.M;
                        if (kj6 == m && i.f == null) {
                            final int n6 = d - m.e();
                            d3.R(n6 - d3.q(), n6);
                            g(n4, d3, b);
                        }
                        else {
                            if (!b2 || d3.F()) {
                                continue;
                            }
                            e(n4, b, d3);
                        }
                    }
                }
            }
        }
        if (tj6 instanceof dbc) {
            return;
        }
        final HashSet a3 = n3.a;
        if (a3 != null && n3.c) {
            for (final kj6 kj7 : a3) {
                final tj6 d4 = kj7.d;
                final int n7 = n + 1;
                final boolean a4 = a(d4);
                if (d4.G() && a4) {
                    uj6.k0(d4, b, new ms1.a());
                }
                final kj6 j = d4.K;
                boolean b3 = false;
                Label_0689: {
                    Label_0682: {
                        if (kj7 == j) {
                            final kj6 f3 = d4.M.f;
                            if (f3 != null && f3.c) {
                                break Label_0682;
                            }
                        }
                        if (kj7 == d4.M) {
                            final kj6 f4 = j.f;
                            if (f4 != null && f4.c) {
                                break Label_0682;
                            }
                        }
                        b3 = false;
                        break Label_0689;
                    }
                    b3 = true;
                }
                final tj6.a[] u2 = d4.U;
                if (u2[1] == h0 && !a4) {
                    if (u2[1] != h0 || d4.y < 0 || d4.x < 0) {
                        continue;
                    }
                    if (d4.i0 != 8) {
                        if (d4.s != 0) {
                            continue;
                        }
                        if (d4.Y != 0.0f) {
                            continue;
                        }
                    }
                    if (d4.F() || d4.G || !b3 || d4.F()) {
                        continue;
                    }
                    f(n7, tj6, b, d4);
                }
                else {
                    if (d4.G()) {
                        continue;
                    }
                    final kj6 l = d4.K;
                    if (kj7 == l && d4.M.f == null) {
                        final int n8 = l.e() + d2;
                        d4.R(n8, d4.q() + n8);
                        g(n7, d4, b);
                    }
                    else {
                        final kj6 m2 = d4.M;
                        if (kj7 == m2 && l.f == null) {
                            final int n9 = d2 - m2.e();
                            d4.R(n9 - d4.q(), n9);
                            g(n7, d4, b);
                        }
                        else {
                            if (!b3 || d4.F()) {
                                continue;
                            }
                            e(n7, b, d4);
                        }
                    }
                }
            }
        }
        final kj6 n10 = tj6.n(kj6$a.J0);
        if (n10.a != null && n10.c) {
            final int d5 = n10.d();
            for (final kj6 kj8 : n10.a) {
                final tj6 d6 = kj8.d;
                final boolean a5 = a(d6);
                if (d6.G() && a5) {
                    uj6.k0(d6, b, new ms1.a());
                }
                if (d6.U[1] != h0 || a5) {
                    if (d6.G()) {
                        continue;
                    }
                    if (kj8 == d6.N) {
                        final int n11 = kj8.e() + d5;
                        if (d6.E) {
                            final int b4 = n11 - d6.c0;
                            final int x = d6.X;
                            d6.b0 = b4;
                            d6.K.m(b4);
                            d6.M.m(x + b4);
                            d6.N.m(n11);
                            d6.l = true;
                        }
                        try {
                            g(n + 1, d6, b);
                            continue;
                        }
                        finally {}
                        break;
                    }
                    continue;
                }
            }
        }
        tj6.n = true;
    }
}
