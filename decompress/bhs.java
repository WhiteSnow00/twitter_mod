import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bhs implements fqg
{
    public final boolean a;
    public final float b;
    public final zrj c;
    
    public bhs(final boolean a, final float b, final zrj c) {
        czd.f((Object)c, "paddingValues");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final int a(final zyd zyd, final List<? extends hyd> list, final int n) {
        czd.f((Object)zyd, "<this>");
        return this.g(list, n, (ftb<? super hyd, ? super Integer, Integer>)bhs$b.D0);
    }
    
    public final gqg b(final iqg iqg, final List<? extends cqg> list, final long n) {
        czd.f((Object)iqg, "$this$measure");
        czd.f((Object)list, "measurables");
        final int s = ((lo8)iqg).S(this.c.d());
        final int s2 = ((lo8)iqg).S(this.c.a());
        final float a = zgs.a;
        final int s3 = ((lo8)iqg).S(zgs.c);
        final long a2 = pi6.a(n, 0, 0, 0, 0, 10);
        while (true) {
            for (final cqg next : list) {
                if (czd.a(g63.A((cqg)next), (Object)"Leading")) {
                    final cqg cqg = next;
                    wgk w;
                    if (cqg != null) {
                        w = cqg.W(a2);
                    }
                    else {
                        w = null;
                    }
                    final int n2 = lgs.e(w) + 0;
                    while (true) {
                        for (final cqg next2 : list) {
                            if (czd.a(g63.A((cqg)next2), (Object)"Trailing")) {
                                final cqg cqg2 = next2;
                                wgk w2;
                                if (cqg2 != null) {
                                    w2 = cqg2.W(uoz.Q(a2, -n2, 0));
                                }
                                else {
                                    w2 = null;
                                }
                                final int e = lgs.e(w2);
                                final int n3 = -s2;
                                final int n4 = -(e + n2);
                                final long q = uoz.Q(a2, n4, n3);
                                while (true) {
                                    for (final cqg next3 : list) {
                                        if (czd.a(g63.A((cqg)next3), (Object)"Label")) {
                                            final cqg cqg3 = next3;
                                            wgk w3;
                                            if (cqg3 != null) {
                                                w3 = cqg3.W(q);
                                            }
                                            else {
                                                w3 = null;
                                            }
                                            int n5;
                                            if (w3 != null) {
                                                n5 = ((jqg)w3).i0((fx)hx.b);
                                                if (n5 == Integer.MIN_VALUE) {
                                                    n5 = w3.E0;
                                                }
                                            }
                                            else {
                                                n5 = 0;
                                            }
                                            final int max = Math.max(n5, s);
                                            int n6;
                                            if (w3 != null) {
                                                n6 = n3 - s3 - max;
                                            }
                                            else {
                                                n6 = -s - s2;
                                            }
                                            final long q2 = uoz.Q(pi6.a(n, 0, 0, 0, 0, 11), n4, n6);
                                            for (final cqg cqg4 : list) {
                                                if (czd.a(g63.A(cqg4), (Object)"TextField")) {
                                                    final wgk w4 = cqg4.W(q2);
                                                    final long a3 = pi6.a(q2, 0, 0, 0, 0, 14);
                                                    while (true) {
                                                        for (final cqg next4 : list) {
                                                            if (czd.a(g63.A((cqg)next4), (Object)"Hint")) {
                                                                final cqg cqg5 = next4;
                                                                wgk w5;
                                                                if (cqg5 != null) {
                                                                    w5 = cqg5.W(a3);
                                                                }
                                                                else {
                                                                    w5 = null;
                                                                }
                                                                final int max2 = Math.max(Math.max(w4.D0, Math.max(lgs.e(w3), lgs.e(w5))) + lgs.e(w) + lgs.e(w2), pi6.j(n));
                                                                final int c = zgs.c(w4.E0, w3 != null, max, lgs.d(w), lgs.d(w2), lgs.d(w5), n, ((lo8)iqg).getDensity(), this.c);
                                                                return iqg.J(max2, c, (Map)k2a.D0, (qsb)new bhs$c(w3, s, n5, max2, c, w4, w5, w, w2, this, max, s3, iqg));
                                                            }
                                                        }
                                                        cqg next4 = null;
                                                        continue;
                                                    }
                                                }
                                            }
                                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                        }
                                    }
                                    cqg next3 = null;
                                    continue;
                                }
                            }
                        }
                        cqg next2 = null;
                        continue;
                    }
                }
            }
            cqg next = null;
            continue;
        }
    }
    
    public final int c(final zyd zyd, final List<? extends hyd> list, final int n) {
        czd.f((Object)zyd, "<this>");
        return this.g(list, n, (ftb<? super hyd, ? super Integer, Integer>)bhs$e.D0);
    }
    
    public final int d(final zyd zyd, final List<? extends hyd> list, final int n) {
        czd.f((Object)zyd, "<this>");
        return this.f(zyd, list, n, (ftb<? super hyd, ? super Integer, Integer>)bhs$a.D0);
    }
    
    public final int e(final zyd zyd, final List<? extends hyd> list, final int n) {
        czd.f((Object)zyd, "<this>");
        return this.f(zyd, list, n, (ftb<? super hyd, ? super Integer, Integer>)bhs$d.D0);
    }
    
    public final int f(final zyd zyd, final List<? extends hyd> list, int intValue, final ftb<? super hyd, ? super Integer, Integer> ftb) {
        for (final hyd next : list) {
            if (czd.a(lgs.c((hyd)next), (Object)"TextField")) {
                final int intValue2 = ((Number)ftb.invoke((Object)next, (Object)intValue)).intValue();
                final Iterator<hyd> iterator2 = list.iterator();
                while (true) {
                    hyd next2;
                    do {
                        final boolean hasNext = iterator2.hasNext();
                        final hyd hyd = null;
                        if (!hasNext) {
                            next2 = null;
                            final hyd hyd2 = next2;
                            int intValue3;
                            if (hyd2 != null) {
                                intValue3 = ((Number)ftb.invoke((Object)hyd2, (Object)intValue)).intValue();
                            }
                            else {
                                intValue3 = 0;
                            }
                            while (true) {
                                for (final hyd next3 : list) {
                                    if (czd.a(lgs.c((hyd)next3), (Object)"Trailing")) {
                                        final hyd hyd3 = next3;
                                        int intValue4;
                                        if (hyd3 != null) {
                                            intValue4 = ((Number)ftb.invoke((Object)hyd3, (Object)intValue)).intValue();
                                        }
                                        else {
                                            intValue4 = 0;
                                        }
                                        while (true) {
                                            for (final hyd next4 : list) {
                                                if (czd.a(lgs.c((hyd)next4), (Object)"Leading")) {
                                                    final hyd hyd4 = next4;
                                                    int intValue5;
                                                    if (hyd4 != null) {
                                                        intValue5 = ((Number)ftb.invoke((Object)hyd4, (Object)intValue)).intValue();
                                                    }
                                                    else {
                                                        intValue5 = 0;
                                                    }
                                                    final Iterator<hyd> iterator5 = list.iterator();
                                                    hyd next5;
                                                    do {
                                                        next5 = hyd;
                                                        if (!iterator5.hasNext()) {
                                                            break;
                                                        }
                                                        next5 = iterator5.next();
                                                    } while (!czd.a(lgs.c((hyd)next5), (Object)"Hint"));
                                                    final hyd hyd5 = next5;
                                                    if (hyd5 != null) {
                                                        intValue = ((Number)ftb.invoke((Object)hyd5, (Object)intValue)).intValue();
                                                    }
                                                    else {
                                                        intValue = 0;
                                                    }
                                                    return zgs.c(intValue2, intValue3 > 0, intValue3, intValue5, intValue4, intValue, lgs.a, ((zmi)zyd).getDensity(), this.c);
                                                }
                                            }
                                            hyd next4 = null;
                                            continue;
                                        }
                                    }
                                }
                                hyd next3 = null;
                                continue;
                            }
                        }
                        next2 = iterator2.next();
                    } while (!czd.a(lgs.c((hyd)next2), (Object)"Label"));
                    continue;
                }
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
    
    public final int g(final List<? extends hyd> list, final int n, final ftb<? super hyd, ? super Integer, Integer> ftb) {
        for (final hyd next : list) {
            if (czd.a(lgs.c((hyd)next), (Object)"TextField")) {
                final int intValue = ((Number)ftb.invoke((Object)next, (Object)n)).intValue();
                final Iterator<hyd> iterator2 = list.iterator();
                while (true) {
                    hyd next2;
                    do {
                        final boolean hasNext = iterator2.hasNext();
                        final hyd hyd = null;
                        if (!hasNext) {
                            next2 = null;
                            final hyd hyd2 = next2;
                            int intValue2 = 0;
                            int intValue3;
                            if (hyd2 != null) {
                                intValue3 = ((Number)ftb.invoke((Object)hyd2, (Object)n)).intValue();
                            }
                            else {
                                intValue3 = 0;
                            }
                            while (true) {
                                for (final hyd next3 : list) {
                                    if (czd.a(lgs.c((hyd)next3), (Object)"Trailing")) {
                                        final hyd hyd3 = next3;
                                        int intValue4;
                                        if (hyd3 != null) {
                                            intValue4 = ((Number)ftb.invoke((Object)hyd3, (Object)n)).intValue();
                                        }
                                        else {
                                            intValue4 = 0;
                                        }
                                        while (true) {
                                            for (final hyd next4 : list) {
                                                if (czd.a(lgs.c((hyd)next4), (Object)"Leading")) {
                                                    final hyd hyd4 = next4;
                                                    int intValue5;
                                                    if (hyd4 != null) {
                                                        intValue5 = ((Number)ftb.invoke((Object)hyd4, (Object)n)).intValue();
                                                    }
                                                    else {
                                                        intValue5 = 0;
                                                    }
                                                    final Iterator<hyd> iterator5 = list.iterator();
                                                    hyd next5;
                                                    do {
                                                        next5 = hyd;
                                                        if (!iterator5.hasNext()) {
                                                            break;
                                                        }
                                                        next5 = iterator5.next();
                                                    } while (!czd.a(lgs.c((hyd)next5), (Object)"Hint"));
                                                    final hyd hyd5 = next5;
                                                    if (hyd5 != null) {
                                                        intValue2 = ((Number)ftb.invoke((Object)hyd5, (Object)n)).intValue();
                                                    }
                                                    final long a = lgs.a;
                                                    final float a2 = zgs.a;
                                                    return Math.max(Math.max(intValue, Math.max(intValue3, intValue2)) + intValue5 + intValue4, pi6.j(a));
                                                }
                                            }
                                            hyd next4 = null;
                                            continue;
                                        }
                                    }
                                }
                                hyd next3 = null;
                                continue;
                            }
                        }
                        next2 = iterator2.next();
                    } while (!czd.a(lgs.c((hyd)next2), (Object)"Label"));
                    continue;
                }
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
