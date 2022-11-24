import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ths implements zqg
{
    public final boolean a;
    public final float b;
    public final osj c;
    
    public ths(final boolean a, final float b, final osj c) {
        e0e.f((Object)c, "paddingValues");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final int a(final b0e b0e, final List<? extends jzd> list, final int n) {
        e0e.f((Object)b0e, "<this>");
        return this.g(list, n, (hub<? super jzd, ? super Integer, Integer>)ths$b.F0);
    }
    
    @Override
    public final arg b(final crg crg, final List<? extends wqg> list, final long n) {
        e0e.f((Object)crg, "$this$measure");
        e0e.f((Object)list, "measurables");
        final int s = ((rp8)crg).S(this.c.d());
        final int s2 = ((rp8)crg).S(this.c.a());
        final float a = rhs.a;
        final int s3 = ((rp8)crg).S(rhs.c);
        final long a2 = vj6.a(n, 0, 0, 0, 0, 10);
        while (true) {
            for (final wqg next : list) {
                if (e0e.a(egz.m(next), (Object)"Leading")) {
                    final wqg wqg = next;
                    khk w;
                    if (wqg != null) {
                        w = wqg.W(a2);
                    }
                    else {
                        w = null;
                    }
                    final int n2 = dhs.e(w) + 0;
                    while (true) {
                        for (final wqg next2 : list) {
                            if (e0e.a(egz.m(next2), (Object)"Trailing")) {
                                final wqg wqg2 = next2;
                                khk w2;
                                if (wqg2 != null) {
                                    w2 = wqg2.W(xd.P0(a2, -n2, 0));
                                }
                                else {
                                    w2 = null;
                                }
                                final int e = dhs.e(w2);
                                final int n3 = -s2;
                                final int n4 = -(e + n2);
                                final long p3 = xd.P0(a2, n4, n3);
                                while (true) {
                                    for (final wqg next3 : list) {
                                        if (e0e.a(egz.m(next3), (Object)"Label")) {
                                            final wqg wqg3 = next3;
                                            khk w3;
                                            if (wqg3 != null) {
                                                w3 = wqg3.W(p3);
                                            }
                                            else {
                                                w3 = null;
                                            }
                                            int n5;
                                            if (w3 != null) {
                                                n5 = ((drg)w3).i0((fx)hx.b);
                                                if (n5 == Integer.MIN_VALUE) {
                                                    n5 = w3.G0;
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
                                            final long p4 = xd.P0(vj6.a(n, 0, 0, 0, 0, 11), n4, n6);
                                            for (final wqg wqg4 : list) {
                                                if (e0e.a(egz.m(wqg4), (Object)"TextField")) {
                                                    final khk w4 = wqg4.W(p4);
                                                    final long a3 = vj6.a(p4, 0, 0, 0, 0, 14);
                                                    while (true) {
                                                        for (final wqg next4 : list) {
                                                            if (e0e.a(egz.m(next4), (Object)"Hint")) {
                                                                final wqg wqg5 = next4;
                                                                khk w5;
                                                                if (wqg5 != null) {
                                                                    w5 = wqg5.W(a3);
                                                                }
                                                                else {
                                                                    w5 = null;
                                                                }
                                                                final int max2 = Math.max(Math.max(w4.F0, Math.max(dhs.e(w3), dhs.e(w5))) + dhs.e(w) + dhs.e(w2), vj6.j(n));
                                                                final int c = rhs.c(w4.G0, w3 != null, max, dhs.d(w), dhs.d(w2), dhs.d(w5), n, ((rp8)crg).getDensity(), this.c);
                                                                return crg.J(max2, c, (Map)m3a.F0, (stb)new ths$c(w3, s, n5, max2, c, w4, w5, w, w2, this, max, s3, crg));
                                                            }
                                                        }
                                                        wqg next4 = null;
                                                        continue;
                                                    }
                                                }
                                            }
                                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                        }
                                    }
                                    wqg next3 = null;
                                    continue;
                                }
                            }
                        }
                        wqg next2 = null;
                        continue;
                    }
                }
            }
            wqg next = null;
            continue;
        }
    }
    
    @Override
    public final int c(final b0e b0e, final List<? extends jzd> list, final int n) {
        e0e.f((Object)b0e, "<this>");
        return this.g(list, n, (hub<? super jzd, ? super Integer, Integer>)ths$e.F0);
    }
    
    @Override
    public final int d(final b0e b0e, final List<? extends jzd> list, final int n) {
        e0e.f((Object)b0e, "<this>");
        return this.f(b0e, list, n, (hub<? super jzd, ? super Integer, Integer>)ths$a.F0);
    }
    
    @Override
    public final int e(final b0e b0e, final List<? extends jzd> list, final int n) {
        e0e.f((Object)b0e, "<this>");
        return this.f(b0e, list, n, (hub<? super jzd, ? super Integer, Integer>)ths$d.F0);
    }
    
    public final int f(final b0e b0e, final List<? extends jzd> list, int intValue, final hub<? super jzd, ? super Integer, Integer> hub) {
        for (final jzd next : list) {
            if (e0e.a(dhs.c((jzd)next), (Object)"TextField")) {
                final int intValue2 = ((Number)hub.invoke((Object)next, (Object)intValue)).intValue();
                final Iterator<jzd> iterator2 = list.iterator();
                while (true) {
                    jzd next2;
                    do {
                        final boolean hasNext = iterator2.hasNext();
                        final jzd jzd = null;
                        if (!hasNext) {
                            next2 = null;
                            final jzd jzd2 = next2;
                            int intValue3;
                            if (jzd2 != null) {
                                intValue3 = ((Number)hub.invoke((Object)jzd2, (Object)intValue)).intValue();
                            }
                            else {
                                intValue3 = 0;
                            }
                            while (true) {
                                for (final jzd next3 : list) {
                                    if (e0e.a(dhs.c((jzd)next3), (Object)"Trailing")) {
                                        final jzd jzd3 = next3;
                                        int intValue4;
                                        if (jzd3 != null) {
                                            intValue4 = ((Number)hub.invoke((Object)jzd3, (Object)intValue)).intValue();
                                        }
                                        else {
                                            intValue4 = 0;
                                        }
                                        while (true) {
                                            for (final jzd next4 : list) {
                                                if (e0e.a(dhs.c((jzd)next4), (Object)"Leading")) {
                                                    final jzd jzd4 = next4;
                                                    int intValue5;
                                                    if (jzd4 != null) {
                                                        intValue5 = ((Number)hub.invoke((Object)jzd4, (Object)intValue)).intValue();
                                                    }
                                                    else {
                                                        intValue5 = 0;
                                                    }
                                                    final Iterator<jzd> iterator5 = list.iterator();
                                                    jzd next5;
                                                    do {
                                                        next5 = jzd;
                                                        if (!iterator5.hasNext()) {
                                                            break;
                                                        }
                                                        next5 = iterator5.next();
                                                    } while (!e0e.a(dhs.c((jzd)next5), (Object)"Hint"));
                                                    final jzd jzd5 = next5;
                                                    if (jzd5 != null) {
                                                        intValue = ((Number)hub.invoke((Object)jzd5, (Object)intValue)).intValue();
                                                    }
                                                    else {
                                                        intValue = 0;
                                                    }
                                                    return rhs.c(intValue2, intValue3 > 0, intValue3, intValue5, intValue4, intValue, dhs.a, ((qni)b0e).getDensity(), this.c);
                                                }
                                            }
                                            jzd next4 = null;
                                            continue;
                                        }
                                    }
                                }
                                jzd next3 = null;
                                continue;
                            }
                        }
                        next2 = iterator2.next();
                    } while (!e0e.a(dhs.c((jzd)next2), (Object)"Label"));
                    continue;
                }
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
    
    public final int g(final List<? extends jzd> list, final int n, final hub<? super jzd, ? super Integer, Integer> hub) {
        for (final jzd next : list) {
            if (e0e.a(dhs.c((jzd)next), (Object)"TextField")) {
                final int intValue = ((Number)hub.invoke((Object)next, (Object)n)).intValue();
                final Iterator<jzd> iterator2 = list.iterator();
                while (true) {
                    jzd next2;
                    do {
                        final boolean hasNext = iterator2.hasNext();
                        final jzd jzd = null;
                        if (!hasNext) {
                            next2 = null;
                            final jzd jzd2 = next2;
                            int intValue2 = 0;
                            int intValue3;
                            if (jzd2 != null) {
                                intValue3 = ((Number)hub.invoke((Object)jzd2, (Object)n)).intValue();
                            }
                            else {
                                intValue3 = 0;
                            }
                            while (true) {
                                for (final jzd next3 : list) {
                                    if (e0e.a(dhs.c((jzd)next3), (Object)"Trailing")) {
                                        final jzd jzd3 = next3;
                                        int intValue4;
                                        if (jzd3 != null) {
                                            intValue4 = ((Number)hub.invoke((Object)jzd3, (Object)n)).intValue();
                                        }
                                        else {
                                            intValue4 = 0;
                                        }
                                        while (true) {
                                            for (final jzd next4 : list) {
                                                if (e0e.a(dhs.c((jzd)next4), (Object)"Leading")) {
                                                    final jzd jzd4 = next4;
                                                    int intValue5;
                                                    if (jzd4 != null) {
                                                        intValue5 = ((Number)hub.invoke((Object)jzd4, (Object)n)).intValue();
                                                    }
                                                    else {
                                                        intValue5 = 0;
                                                    }
                                                    final Iterator<jzd> iterator5 = list.iterator();
                                                    jzd next5;
                                                    do {
                                                        next5 = jzd;
                                                        if (!iterator5.hasNext()) {
                                                            break;
                                                        }
                                                        next5 = iterator5.next();
                                                    } while (!e0e.a(dhs.c((jzd)next5), (Object)"Hint"));
                                                    final jzd jzd5 = next5;
                                                    if (jzd5 != null) {
                                                        intValue2 = ((Number)hub.invoke((Object)jzd5, (Object)n)).intValue();
                                                    }
                                                    final long a = dhs.a;
                                                    final float a2 = rhs.a;
                                                    return Math.max(Math.max(intValue, Math.max(intValue3, intValue2)) + intValue5 + intValue4, vj6.j(a));
                                                }
                                            }
                                            jzd next4 = null;
                                            continue;
                                        }
                                    }
                                }
                                jzd next3 = null;
                                continue;
                            }
                        }
                        next2 = iterator2.next();
                    } while (!e0e.a(dhs.c((jzd)next2), (Object)"Label"));
                    continue;
                }
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
