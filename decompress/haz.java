import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class haz
{
    public static double a(final double n) {
        if (Double.isNaN(n)) {
            return 0.0;
        }
        double n2 = n;
        if (!Double.isInfinite(n)) {
            final double n3 = dcmpl(n, 0.0);
            n2 = n;
            if (n3 != 0) {
                if (n3 == 0) {
                    n2 = n;
                }
                else {
                    int n4;
                    if (n3 > 0) {
                        n4 = 1;
                    }
                    else {
                        n4 = -1;
                    }
                    n2 = Math.floor(Math.abs(n)) * n4;
                }
            }
        }
        return n2;
    }
    
    public static int b(final double n) {
        if (!Double.isNaN(n) && !Double.isInfinite(n)) {
            final double n2 = dcmpl(n, 0.0);
            if (n2 != 0) {
                int n3;
                if (n2 > 0) {
                    n3 = 1;
                }
                else {
                    n3 = -1;
                }
                return (int)(Math.floor(Math.abs(n)) * n3 % 4.294967296E9);
            }
        }
        return 0;
    }
    
    public static int c(final k6z k6z) {
        final int b = b(k6z.d("runtime.counter").h() + 1.0);
        if (b <= 1000000) {
            k6z.f("runtime.counter", (aey)new tby(Double.valueOf(b)));
            return b;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }
    
    public static long d(final double n) {
        return (long)b(n) & 0xFFFFFFFFL;
    }
    
    public static gky e(final String s) {
        gky gky;
        if (s != null && !s.isEmpty()) {
            gky = gky.N1.get(Integer.parseInt(s));
        }
        else {
            gky = null;
        }
        if (gky != null) {
            return gky;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", s));
    }
    
    public static Object f(final aey aey) {
        if (aey.v0.equals(aey)) {
            return null;
        }
        if (aey.u0.equals(aey)) {
            return "";
        }
        if (aey instanceof edy) {
            return g((edy)aey);
        }
        if (aey instanceof qay) {
            final ArrayList list = new ArrayList();
            final qay qay = (qay)aey;
            Objects.requireNonNull(qay);
            for (int i = 0; i < qay.p(); ++i) {
                if (i >= qay.p()) {
                    throw new NoSuchElementException(yk.y("Out of bounds index: ", i));
                }
                final Object f = f(qay.q(i));
                if (f != null) {
                    list.add(f);
                }
            }
            return list;
        }
        if (!aey.h().isNaN()) {
            return aey.h();
        }
        return aey.j();
    }
    
    public static Map g(final edy edy) {
        final HashMap hashMap = new HashMap();
        Objects.requireNonNull(edy);
        for (final String s : new ArrayList(edy.C0.keySet())) {
            final Object f = f(edy.n(s));
            if (f != null) {
                hashMap.put(s, f);
            }
        }
        return hashMap;
    }
    
    public static void h(final String s, final int n, final List list) {
        if (list.size() == n) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", s, n, list.size()));
    }
    
    public static void i(final String s, final int n, final List list) {
        if (list.size() >= n) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", s, n, list.size()));
    }
    
    public static void j(final String s, final int n, final List list) {
        final ArrayList list2 = (ArrayList)list;
        if (list2.size() <= n) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", s, n, list2.size()));
    }
    
    public static boolean k(final aey aey) {
        if (aey == null) {
            return false;
        }
        final Double h = aey.h();
        return !h.isNaN() && h >= 0.0 && h.equals(Math.floor(h));
    }
    
    public static boolean l(final aey aey, final aey aey2) {
        if (!aey.getClass().equals(aey2.getClass())) {
            return false;
        }
        if (aey instanceof sfy || aey instanceof mdy) {
            return true;
        }
        if (aey instanceof tby) {
            return !Double.isNaN(aey.h()) && !Double.isNaN(aey2.h()) && aey.h().equals(aey2.h());
        }
        if (aey instanceof mfy) {
            return aey.j().equals(aey2.j());
        }
        if (aey instanceof yay) {
            return aey.i().equals(aey2.i());
        }
        return aey == aey2;
    }
}
