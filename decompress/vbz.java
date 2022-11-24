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

public final class vbz
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
    
    public static int c(final y7z y7z) {
        final int b = b(y7z.f("runtime.counter").h() + 1.0);
        if (b <= 1000000) {
            y7z.h("runtime.counter", (kfy)new ddy((double)b));
            return b;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }
    
    public static long d(final double n) {
        return (long)b(n) & 0xFFFFFFFFL;
    }
    
    public static qly e(final String s) {
        qly qly;
        if (s != null && !s.isEmpty()) {
            qly = qly.Q1.get(Integer.parseInt(s));
        }
        else {
            qly = null;
        }
        if (qly != null) {
            return qly;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", s));
    }
    
    public static Object f(final kfy kfy) {
        if (kfy.y0.equals(kfy)) {
            return null;
        }
        if (kfy.x0.equals((Object)kfy)) {
            return "";
        }
        if (kfy instanceof oey) {
            return g((oey)kfy);
        }
        if (kfy instanceof acy) {
            final ArrayList list = new ArrayList();
            final acy acy = (acy)kfy;
            Objects.requireNonNull(acy);
            for (int i = 0; i < acy.p(); ++i) {
                if (i >= acy.p()) {
                    throw new NoSuchElementException(rk0.B("Out of bounds index: ", i));
                }
                final Object f = f(acy.q(i));
                if (f != null) {
                    list.add(f);
                }
            }
            return list;
        }
        if (!kfy.h().isNaN()) {
            return kfy.h();
        }
        return kfy.k();
    }
    
    public static Map g(final oey oey) {
        final HashMap hashMap = new HashMap();
        Objects.requireNonNull(oey);
        for (final String s : new ArrayList(oey.F0.keySet())) {
            final Object f = f(oey.n(s));
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
    
    public static boolean k(final kfy kfy) {
        if (kfy == null) {
            return false;
        }
        final Double h = kfy.h();
        return !h.isNaN() && h >= 0.0 && h.equals(Math.floor(h));
    }
    
    public static boolean l(final kfy kfy, final kfy kfy2) {
        if (!kfy.getClass().equals(kfy2.getClass())) {
            return false;
        }
        if (kfy instanceof chy || kfy instanceof wey) {
            return true;
        }
        if (kfy instanceof ddy) {
            return !Double.isNaN(kfy.h()) && !Double.isNaN(kfy2.h()) && kfy.h().equals(kfy2.h());
        }
        if (kfy instanceof wgy) {
            return kfy.k().equals(kfy2.k());
        }
        if (kfy instanceof icy) {
            return kfy.j().equals(kfy2.j());
        }
        return kfy == kfy2;
    }
}
