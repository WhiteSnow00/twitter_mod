import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vpj implements fqg
{
    public final qsb<ddq, fzv> a;
    public final boolean b;
    public final float c;
    public final zrj d;
    
    public vpj(final qsb<? super ddq, fzv> a, final boolean b, final float c, final zrj d) {
        czd.f((Object)a, "onLabelMeasured");
        czd.f((Object)d, "paddingValues");
        this.a = (qsb<ddq, fzv>)a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final int a(final zyd zyd, final List<? extends hyd> list, final int n) {
        czd.f((Object)zyd, "<this>");
        return this.g(zyd, list, n, (ftb<? super hyd, ? super Integer, Integer>)vpj$b.D0);
    }
    
    public final gqg b(final iqg iqg, final List<? extends cqg> list, final long n) {
        czd.f((Object)iqg, "$this$measure");
        czd.f((Object)list, "measurables");
        final int s = ((lo8)iqg).S(this.d.a());
        final long a = pi6.a(n, 0, 0, 0, 0, 10);
        while (true) {
            for (final cqg next : list) {
                if (czd.a(g63.A((cqg)next), (Object)"Leading")) {
                    final cqg cqg = next;
                    wgk w;
                    if (cqg != null) {
                        w = cqg.W(a);
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
                                    w2 = cqg2.W(uoz.Q(a, -n2, 0));
                                }
                                else {
                                    w2 = null;
                                }
                                final int n3 = lgs.e(w2) + n2;
                                final boolean b = this.c < 1.0f;
                                final int n4 = ((lo8)iqg).S(this.d.c(((zyd)iqg).getLayoutDirection())) + ((lo8)iqg).S(this.d.b(((zyd)iqg).getLayoutDirection()));
                                int n5;
                                if (b) {
                                    n5 = -n3 - n4;
                                }
                                else {
                                    n5 = -n4;
                                }
                                final int n6 = -s;
                                final long q = uoz.Q(a, n5, n6);
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
                                            if (w3 != null) {
                                                this.a.invoke((Object)new ddq(oj7.d((float)w3.D0, (float)w3.E0)));
                                            }
                                            final long a2 = pi6.a(uoz.Q(n, -n3, n6 - Math.max(lgs.d(w3) / 2, ((lo8)iqg).S(this.d.d()))), 0, 0, 0, 0, 11);
                                            for (final cqg cqg4 : list) {
                                                if (czd.a(g63.A(cqg4), (Object)"TextField")) {
                                                    final wgk w4 = cqg4.W(a2);
                                                    final long a3 = pi6.a(a2, 0, 0, 0, 0, 14);
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
                                                                final int c = tpj.c(lgs.e(w), lgs.e(w2), w4.D0, lgs.e(w3), lgs.e(w5), b, n, ((lo8)iqg).getDensity(), this.d);
                                                                final int b2 = tpj.b(lgs.d(w), lgs.d(w2), w4.E0, lgs.d(w3), lgs.d(w5), n, ((lo8)iqg).getDensity(), this.d);
                                                                for (final cqg cqg6 : list) {
                                                                    if (czd.a(g63.A(cqg6), (Object)"border")) {
                                                                        int n7;
                                                                        if (c != Integer.MAX_VALUE) {
                                                                            n7 = c;
                                                                        }
                                                                        else {
                                                                            n7 = 0;
                                                                        }
                                                                        int n8;
                                                                        if (b2 != Integer.MAX_VALUE) {
                                                                            n8 = b2;
                                                                        }
                                                                        else {
                                                                            n8 = 0;
                                                                        }
                                                                        return iqg.J(c, b2, (Map)k2a.D0, (qsb)new vpj$c(b2, c, w, w2, w4, w3, w5, cqg6.W(uoz.b(n7, c, n8, b2)), this, iqg));
                                                                    }
                                                                }
                                                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
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
        return this.g(zyd, list, n, (ftb<? super hyd, ? super Integer, Integer>)vpj$e.D0);
    }
    
    public final int d(final zyd zyd, final List<? extends hyd> list, final int n) {
        czd.f((Object)zyd, "<this>");
        return this.f(zyd, list, n, (ftb<? super hyd, ? super Integer, Integer>)vpj$a.D0);
    }
    
    public final int e(final zyd zyd, final List<? extends hyd> list, final int n) {
        czd.f((Object)zyd, "<this>");
        return this.f(zyd, list, n, (ftb<? super hyd, ? super Integer, Integer>)vpj$d.D0);
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
                                                    return tpj.b(intValue5, intValue4, intValue2, intValue3, intValue, lgs.a, ((zmi)zyd).getDensity(), this.d);
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
    
    public final int g(final zyd zyd, final List<? extends hyd> list, int intValue, final ftb<? super hyd, ? super Integer, Integer> ftb) {
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
                                                    return tpj.c(intValue5, intValue4, intValue2, intValue3, intValue, this.c < 1.0f, lgs.a, ((zmi)zyd).getDensity(), this.d);
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
