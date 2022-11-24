import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import com.twitter.util.user.UserIdentifier;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qwu
{
    public static final int a;
    
    static {
        a = ita.b().f("conversations_autopopulated_max_users_cap", 50);
    }
    
    public static void a(final Map<Long, z4h> map, final long d, final String f, final String e, final UserIdentifier userIdentifier, final Collection<Long> collection, final boolean b) {
        if (l(map, d, userIdentifier, collection)) {
            z4h z4h;
            if (b) {
                z4h = null;
            }
            else {
                final z4h$a z4h$a = new z4h$a();
                z4h$a.d = d;
                z4h$a.f = f;
                z4h$a.e = e;
                z4h = (z4h)((z4j)z4h$a).e();
            }
            map.put(d, z4h);
        }
    }
    
    public static List<z4h> b(final hp6 hp6) {
        fj1.b(hp6.C0());
        final rfu n0 = hp6.F0.N0;
        fj1.b(hp6.C0());
        final z4h e = hp6.l().e(hp6.F0.Q0);
        z4h z4h;
        if (e != null) {
            z4h = e;
        }
        else if (h(hp6) && hp6.l().e(hp6.w()) == null) {
            final z4h$a z4h$a = new z4h$a();
            z4h$a.f = hp6.u();
            z4h$a.d = hp6.w();
            z4h$a.e = hp6.x();
            z4h = (z4h)((z4j)z4h$a).e();
        }
        else if (!flr.e((CharSequence)hp6.F0.S0)) {
            final z4h$a z4h$a2 = new z4h$a();
            final vg3 f0 = hp6.F0;
            z4h$a2.e = f0.S0;
            z4h$a2.d = f0.Q0;
            z4h = (z4h)((z4j)z4h$a2).e();
        }
        else {
            z4h = null;
        }
        final ojf h = ojf.H();
        long k0;
        if (z4h != null) {
            k0 = z4h.K0;
        }
        else {
            k0 = 0L;
        }
        if (z4h != null) {
            h.p((Object)z4h);
        }
        for (final z4h z4h2 : n0.K0.b) {
            final fxl b = n0.b((kgs)z4h2);
            if (b != null && b.F0 == b.G0 && z4h2.K0 != k0) {
                h.p((Object)z4h2);
            }
        }
        return (List)((z4j)h).e();
    }
    
    public static Set<Long> c(final hp6 hp6, final UserIdentifier userIdentifier, final Collection<Long> collection) {
        return qed.g((Set)((LinkedHashMap)e(hp6, userIdentifier, collection, true)).keySet());
    }
    
    public static List<z4h> d(final hp6 hp6, final UserIdentifier userIdentifier, final Collection<Long> collection) {
        return ojf.u((Iterable)((LinkedHashMap)e(hp6, userIdentifier, collection, false)).values());
    }
    
    public static Map<Long, z4h> e(final hp6 hp6, final UserIdentifier userIdentifier, final Collection<Long> collection, final boolean b) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final qku l = hp6.l();
        a(linkedHashMap, hp6.w(), hp6.u(), hp6.x(), UserIdentifier.LOGGED_OUT, null, b);
        if (hp6.D0()) {
            a(linkedHashMap, hp6.J(), hp6.t(), hp6.M(), userIdentifier, collection, b);
        }
        for (final z4h z4h : l.f()) {
            if (l(linkedHashMap, z4h.K0, userIdentifier, collection)) {
                Object o;
                if (b) {
                    o = null;
                }
                else {
                    final z4h$a z4h$a = new z4h$a(z4h);
                    ((r7a.a)z4h$a).b = 0;
                    final int a = o5j.a;
                    ((r7a.a)z4h$a).c = 0;
                    o = ((z4j)z4h$a).e();
                }
                linkedHashMap.put(z4h.K0, o);
            }
        }
        for (final m1h m1h : w1h.b(l.g)) {
            a(linkedHashMap, m1h.a, m1h.b, m1h.c, userIdentifier, collection, b);
        }
        return linkedHashMap;
    }
    
    public static boolean f(final String s, final Context context) {
        return s != null && p70.i(context, s);
    }
    
    public static boolean g(final hp6 hp6) {
        return hp6 != null && (hp6.l0() || hp6.h0());
    }
    
    public static boolean h(final hp6 hp6) {
        return hp6.C0() && hp6.w() == hp6.F0.Q0;
    }
    
    public static boolean i(final hp6 hp6) {
        boolean b = true;
        if (hp6 != null) {
            boolean b2 = false;
            Label_0036: {
                if (!hp6.D0()) {
                    final gjl g0 = hp6.G0;
                    if (g0 != null && g0.i) {
                        b2 = true;
                        break Label_0036;
                    }
                }
                b2 = false;
            }
            if (b2) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public static boolean j(final hp6 hp6) {
        final int l = k6e.l((Iterable)hp6.f());
        boolean b = true;
        if (l <= 0 && !hp6.V() && !hp6.K0() && !hp6.B0()) {
            final vg3 f0 = hp6.F0;
            if (f0.Z0 == null && f0.a1 == null && !hp6.O2()) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public static boolean k(final hp6 hp6, final UserIdentifier userIdentifier) {
        final long g = hp6.G();
        boolean b = false;
        final boolean b2 = g > 0L;
        if (userIdentifier.hasId(hp6.J()) || !hp6.z0()) {
            b = true;
        }
        return (hp6.K0() ^ true) & (b2 & b);
    }
    
    public static boolean l(final Map<Long, z4h> map, final long n, final UserIdentifier userIdentifier, final Collection<Long> collection) {
        return !userIdentifier.hasId(n) && (collection == null || !collection.contains(n)) && map.size() < qwu.a;
    }
    
    public static boolean m(final hp6 hp6) {
        final ck3 z0 = hp6.F0.Z0;
        return z0 != null && "628899279:survey_card".equals(z0.a);
    }
    
    public static Boolean n(final hp6 hp6) {
        final gjl g0 = hp6.G0;
        if (g0 != null) {
            final rq k = g0.k;
            if (k != null) {
                return k.a;
            }
        }
        return null;
    }
}
