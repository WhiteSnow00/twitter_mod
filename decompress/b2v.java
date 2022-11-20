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

public final class b2v
{
    public static final Long a;
    public static List<String> b;
    
    static {
        a = 258901L;
    }
    
    public static boolean a(final xrc<?, ?> xrc, int a) {
        final Object h = xrc.h;
        Object o;
        if (h instanceof kbv) {
            o = h((kbv)h, a);
        }
        else {
            o = gdd.E0;
            a = c5j.a;
        }
        return fq4.s((Iterable)o) ^ true;
    }
    
    public static int b(final int n, final int n2) {
        if (n % n2 > 0) {
            return n / n2 + 1;
        }
        return n / n2;
    }
    
    public static List<String> c() {
        if (b2v.b == null) {
            final LinkedHashSet set = new LinkedHashSet();
            final zev a = neg.a();
            if (a != null) {
                final Iterator iterator = a.R6().iterator();
                while (iterator.hasNext()) {
                    set.addAll(((djr)iterator.next()).a());
                }
            }
            else {
                g97.j();
            }
            b2v.b = gdd.g((List)new ArrayList(set));
            ies.a((Class)b2v.class);
        }
        return b2v.b;
    }
    
    public static String d(final xrc<?, ?> xrc) {
        final Iterator<hbv> iterator = e(xrc).iterator();
        while (iterator.hasNext()) {
            final u9v g = iterator.next().g;
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
    
    public static Iterable<hbv> e(final xrc<?, ?> xrc) {
        final Object h = xrc.h;
        Object o;
        if (h instanceof kbv) {
            o = h((kbv)h, 326);
        }
        else {
            o = gdd.E0;
            final int a = c5j.a;
        }
        return (Iterable<hbv>)o;
    }
    
    public static int[] f(final Bundle bundle) {
        if (((BaseBundle)bundle).containsKey("custom_errors")) {
            final int[] intArray = ((BaseBundle)bundle).getIntArray("custom_errors");
            jee.l((Object)intArray);
            return intArray;
        }
        return kbv.F0;
    }
    
    public static Map<String, String> g() {
        final qjg t = qjg.t();
        final zev a = neg.a();
        if (a != null) {
            final Iterator iterator = a.a4().iterator();
            while (iterator.hasNext()) {
                t.x(((zvj)iterator.next()).b());
            }
        }
        else {
            g97.j();
        }
        return (Map)((n4j)t).e();
    }
    
    public static Iterable<hbv> h(final kbv kbv, final int n) {
        return (Iterable<hbv>)i5e.e((Iterable)kbv, (xtk)new a2v(n));
    }
    
    public static boolean i(final xrc<?, ?> xrc) {
        final Iterator<hbv> iterator = e(xrc).iterator();
        int i;
        do {
            final boolean hasNext = iterator.hasNext();
            i = 0;
            if (!hasNext) {
                return false;
            }
            final u9v g = iterator.next().g;
            if (g == null) {
                continue;
            }
            i = g.a;
        } while (i <= 0);
        return true;
    }
    
    public static boolean j(final xrc<?, ?> xrc) {
        return a(xrc, 326);
    }
}
