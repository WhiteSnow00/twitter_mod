import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n1f
{
    public final iz6 a;
    public final boolean b;
    public final Map<Object, a5e> c;
    public Map<Object, Integer> d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final Set<Object> i;
    
    public n1f(final iz6 a, final boolean b) {
        e0e.f((Object)a, "scope");
        this.a = a;
        this.b = b;
        this.c = new LinkedHashMap();
        this.d = (Map<Object, Integer>)m3a.F0;
        this.e = -1;
        this.g = -1;
        this.i = new LinkedHashSet();
    }
    
    public final int a(int n, int n2, final int n3, final long n4, final boolean b, int f0, int g0, final List<h2f> list) {
        final int g2 = this.g;
        final int n5 = 0;
        final int n6 = 0;
        final boolean b2 = b ? (g2 > n) : (g2 < n);
        final int e = this.e;
        final boolean b3 = b ? (e < n) : (e > n);
        if (b2) {
            kud kud;
            if (!b) {
                kud = jb2.T0(g2 + 1, n);
            }
            else {
                kud = jb2.T0(n + 1, g2);
            }
            n2 = ((iud)kud).F0;
            final int g3 = ((iud)kud).G0;
            n = n5;
            if (n2 <= g3) {
                g0 = n6;
                while (true) {
                    g0 = (n = g0 + this.b(list, n2, n3));
                    if (n2 == g3) {
                        break;
                    }
                    ++n2;
                }
            }
            n2 = this.h;
            g0 = this.c(n4) + (f0 + n2 + n);
        }
        else if (b3) {
            kud kud2;
            if (!b) {
                kud2 = jb2.T0(n + 1, e);
            }
            else {
                kud2 = jb2.T0(e + 1, n);
            }
            f0 = ((iud)kud2).F0;
            g0 = ((iud)kud2).G0;
            n = n2;
            if (f0 <= g0) {
                while (true) {
                    n2 = (n = n2 + this.b(list, f0, n3));
                    if (f0 == g0) {
                        break;
                    }
                    ++f0;
                }
            }
            n2 = this.f;
            g0 = this.c(n4) + (n2 - n);
        }
        return g0;
    }
    
    public final int b(final List<h2f> list, final int n, final int n2) {
        if (!list.isEmpty() && n >= ((h2f)rr4.C1((List)list)).b) {
            if (n <= ((h2f)rr4.K1((List)list)).b) {
                if (n - ((h2f)rr4.C1((List)list)).b < ((h2f)rr4.K1((List)list)).b - n) {
                    for (int i = 0; i < list.size(); ++i) {
                        final h2f h2f = list.get(i);
                        final int b = h2f.b;
                        if (b == n) {
                            return h2f.e;
                        }
                        if (b > n) {
                            break;
                        }
                    }
                }
                else {
                    for (int f = shw.F((List)list); -1 < f; --f) {
                        final h2f h2f2 = list.get(f);
                        final int b2 = h2f2.b;
                        if (b2 == n) {
                            return h2f2.e;
                        }
                        if (b2 < n) {
                            break;
                        }
                    }
                }
            }
        }
        return n2;
    }
    
    public final int c(final long n) {
        int c;
        if (this.b) {
            c = hud.c(n);
        }
        else {
            final hud$a companion = hud.Companion;
            c = (int)(n >> 32);
        }
        return c;
    }
    
    public final void d() {
        this.c.clear();
        this.d = (Map<Object, Integer>)m3a.F0;
        this.e = -1;
        this.f = 0;
        this.g = -1;
        this.h = 0;
    }
    
    public final void e(final h2f h2f, final a5e a5e) {
        while (a5e.b.size() > h2f.e()) {
            pr4.p1((List)a5e.b);
        }
        while (a5e.b.size() < h2f.e()) {
            final int size = a5e.b.size();
            final long d = h2f.d(size);
            final ArrayList b = a5e.b;
            final long a = a5e.a;
            final hud$a companion = hud.Companion;
            b.add(new mhk(kqe.d((int)(d >> 32) - (int)(a >> 32), hud.c(d) - hud.c(a)), h2f.c(size)));
        }
        final ArrayList b2 = a5e.b;
        for (int size2 = b2.size(), i = 0; i < size2; ++i) {
            final mhk mhk = (mhk)b2.get(i);
            final long c = mhk.c;
            final long a2 = a5e.a;
            final hud$a companion2 = hud.Companion;
            final long k = mqb.k(a2, hud.c(c), (int)(c >> 32) + (int)(a2 >> 32));
            final long d2 = h2f.d(i);
            mhk.a = h2f.c(i);
            final w0b<hud> b3 = h2f.b(i);
            if (!hud.b(k, d2)) {
                final long a3 = a5e.a;
                mhk.c = kqe.d((int)(d2 >> 32) - (int)(a3 >> 32), hud.c(d2) - hud.c(a3));
                if (b3 != null) {
                    mhk.a(true);
                    ma7.D(this.a, (yy6)null, 0, (hub)new n1f$a(mhk, (w0b)b3, (mp6)null), 3);
                }
            }
        }
    }
}
