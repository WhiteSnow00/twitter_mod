import android.os.BaseBundle;
import java.util.Map;
import android.os.Bundle;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f1v
{
    public static final Long a;
    public static List<String> b;
    
    static {
        a = 258901L;
    }
    
    public static boolean a(final tsc<?, ?> tsc, int a) {
        final Object h = tsc.h;
        Object o;
        if (h instanceof pav) {
            o = h((pav)h, a);
        }
        else {
            o = ced.D0;
            a = w4j.a;
        }
        return hr4.s((Iterable)o) ^ true;
    }
    
    public static int b(final int n, final int n2) {
        if (n % n2 > 0) {
            return n / n2 + 1;
        }
        return n / n2;
    }
    
    public static List<String> c() {
        if (f1v.b == null) {
            final LinkedHashSet set = new LinkedHashSet();
            final eev f = o1a.f();
            if (f != null) {
                final Iterator<jir> iterator = f.R6().iterator();
                while (iterator.hasNext()) {
                    set.addAll(iterator.next().a());
                }
            }
            else {
                ca7.e();
            }
            f1v.b = ced.g((List)new ArrayList(set));
            nds.a((Class)f1v.class);
        }
        return f1v.b;
    }
    
    public static String d(final tsc<?, ?> tsc) {
        final Iterator<mav> iterator = e(tsc).iterator();
        while (iterator.hasNext()) {
            final y8v g = iterator.next().g;
            if (g != null) {
                final String b = g.b;
                if (b != null) {
                    return b;
                }
                continue;
            }
        }
        return null;
    }
    
    public static Iterable<mav> e(final tsc<?, ?> tsc) {
        final Object h = tsc.h;
        Object o;
        if (h instanceof pav) {
            o = h((pav)h, 326);
        }
        else {
            o = ced.D0;
            final int a = w4j.a;
        }
        return (Iterable<mav>)o;
    }
    
    public static int[] f(final Bundle bundle) {
        if (((BaseBundle)bundle).containsKey("custom_errors")) {
            final int[] intArray = ((BaseBundle)bundle).getIntArray("custom_errors");
            pf8.r(intArray);
            return intArray;
        }
        return pav.E0;
    }
    
    public static Map<String, String> g() {
        final sjg t = sjg.t();
        final eev f = o1a.f();
        if (f != null) {
            final Iterator<uvj> iterator = f.a4().iterator();
            while (iterator.hasNext()) {
                t.x(iterator.next().b());
            }
        }
        else {
            ca7.e();
        }
        return (Map)((h4j)t).e();
    }
    
    public static Iterable<mav> h(final pav pav, final int n) {
        return (Iterable<mav>)c6e.e((Iterable)pav, (otk)new e1v(n, 0));
    }
    
    public static boolean i(final tsc<?, ?> tsc) {
        final Iterator<mav> iterator = e(tsc).iterator();
        int i;
        do {
            final boolean hasNext = iterator.hasNext();
            i = 0;
            if (!hasNext) {
                return false;
            }
            final y8v g = iterator.next().g;
            if (g == null) {
                continue;
            }
            i = g.a;
        } while (i <= 0);
        return true;
    }
    
    public static boolean j(final tsc<?, ?> tsc) {
        return a(tsc, 326);
    }
}
