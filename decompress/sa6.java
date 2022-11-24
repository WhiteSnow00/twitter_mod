import androidx.compose.runtime.ComposeRuntimeError;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sa6
{
    public static final kub<tr0<?>, ngq, cdm, vzv> a;
    public static final kub<tr0<?>, ngq, cdm, vzv> b;
    public static final kub<tr0<?>, ngq, cdm, vzv> c;
    public static final kub<tr0<?>, ngq, cdm, vzv> d;
    public static final kub<tr0<?>, ngq, cdm, vzv> e;
    public static final imj f;
    public static final imj g;
    public static final imj h;
    public static final imj i;
    public static final imj j;
    public static final imj k;
    
    static {
        sa6.a = sa6$b.F0;
        sa6.b = sa6$d.F0;
        sa6.c = sa6$a.F0;
        sa6.d = sa6$e.F0;
        sa6.e = sa6$c.F0;
        f = new imj("provider");
        g = new imj("provider");
        h = new imj("compositionLocalMap");
        i = new imj("providerValues");
        j = new imj("providers");
        k = new imj("reference");
    }
    
    public static final s0e a(final List list, int e, final int n) {
        final int n2 = e = e(list, e);
        if (n2 < 0) {
            e = -(n2 + 1);
        }
        if (e < list.size()) {
            final s0e s0e = list.get(e);
            if (s0e.b < n) {
                return s0e;
            }
        }
        return null;
    }
    
    public static final void b(final List list, int e, final int n) {
        final int n2 = e = e(list, e);
        if (n2 < 0) {
            e = -(n2 + 1);
        }
        while (e < list.size() && list.get(e).b < n) {
            list.remove(e);
        }
    }
    
    public static final void c(final kgq kgq, final List<Object> list, final int n) {
        if (kgq.l(n)) {
            list.add(kgq.n(n));
        }
        else {
            for (int i = n + 1; i < kgq.k(n) + n; i += kgq.k(i)) {
                c(kgq, list, i);
            }
        }
    }
    
    public static final Void d(final String s) {
        e0e.f((Object)s, "message");
        throw new ComposeRuntimeError(c0e.h("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", s, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }
    
    public static final int e(final List<s0e> list, final int n) {
        int n2 = list.size() - 1;
        int i = 0;
        while (i <= n2) {
            final int n3 = i + n2 >>> 1;
            final int h = e0e.h(list.get(n3).b, n);
            if (h < 0) {
                i = n3 + 1;
            }
            else {
                if (h <= 0) {
                    return n3;
                }
                n2 = n3 - 1;
            }
        }
        return -(i + 1);
    }
    
    public static final void f(final ngq ngq, final cdm cdm) {
        e0e.f((Object)ngq, "<this>");
        e0e.f((Object)cdm, "rememberManager");
        final int g = ngq.g(ngq.b, ngq.p(ngq.r));
        final int[] b = ngq.b;
        final int r = ngq.r;
        final ogq ogq = new ogq(g, ngq.g(b, ngq.p(ngq.r(r) + r)), ngq);
        while (ogq.hasNext()) {
            final Object next = ogq.next();
            if (next instanceof ddm) {
                cdm.c((ddm)next);
            }
            else {
                if (!(next instanceof o5m)) {
                    continue;
                }
                final o5m o5m = (o5m)next;
                final af6 b2 = o5m.b;
                if (b2 == null) {
                    continue;
                }
                b2.S0 = true;
                o5m.c();
            }
        }
        ngq.F();
    }
    
    public static final void g(final boolean b) {
        if (b) {
            return;
        }
        d("Check failed".toString());
        throw null;
    }
}
