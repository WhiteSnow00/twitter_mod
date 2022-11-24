import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Map;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqj implements zqg
{
    public final stb<aeq, vzv> a;
    public final boolean b;
    public final float c;
    public final osj d;
    
    public kqj(final stb<? super aeq, vzv> a, final boolean b, final float c, final osj d) {
        e0e.f((Object)a, "onLabelMeasured");
        e0e.f((Object)d, "paddingValues");
        this.a = (stb<aeq, vzv>)a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final int a(final b0e b0e, final List<? extends jzd> list, final int n) {
        e0e.f((Object)b0e, "<this>");
        return this.g(b0e, list, n, (hub<? super jzd, ? super Integer, Integer>)kqj$b.F0);
    }
    
    @Override
    public final arg b(final crg crg, final List<? extends wqg> list, final long n) {
        e0e.f((Object)crg, "$this$measure");
        e0e.f((Object)list, "measurables");
        final int s = ((rp8)crg).S(this.d.a());
        final long a = vj6.a(n, 0, 0, 0, 0, 10);
        while (true) {
            for (final wqg next : list) {
                if (e0e.a(egz.m(next), (Object)"Leading")) {
                    final wqg wqg = next;
                    khk w;
                    if (wqg != null) {
                        w = wqg.W(a);
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
                                    w2 = wqg2.W(xd.P0(a, -n2, 0));
                                }
                                else {
                                    w2 = null;
                                }
                                final int n3 = dhs.e(w2) + n2;
                                final boolean b = this.c < 1.0f;
                                final int n4 = ((rp8)crg).S(this.d.c(((b0e)crg).getLayoutDirection())) + ((rp8)crg).S(this.d.b(((b0e)crg).getLayoutDirection()));
                                int n5;
                                if (b) {
                                    n5 = -n3 - n4;
                                }
                                else {
                                    n5 = -n4;
                                }
                                final int n6 = -s;
                                final long p3 = xd.P0(a, n5, n6);
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
                                            if (w3 != null) {
                                                this.a.invoke((Object)new aeq(jty.g((float)w3.F0, (float)w3.G0)));
                                            }
                                            final long a2 = vj6.a(xd.P0(n, -n3, n6 - Math.max(dhs.d(w3) / 2, ((rp8)crg).S(this.d.d()))), 0, 0, 0, 0, 11);
                                            for (final wqg wqg4 : list) {
                                                if (e0e.a(egz.m(wqg4), (Object)"TextField")) {
                                                    final khk w4 = wqg4.W(a2);
                                                    final long a3 = vj6.a(a2, 0, 0, 0, 0, 14);
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
                                                                final int c = iqj.c(dhs.e(w), dhs.e(w2), w4.F0, dhs.e(w3), dhs.e(w5), b, n, ((rp8)crg).getDensity(), this.d);
                                                                final int b2 = iqj.b(dhs.d(w), dhs.d(w2), w4.G0, dhs.d(w3), dhs.d(w5), n, ((rp8)crg).getDensity(), this.d);
                                                                for (final wqg wqg6 : list) {
                                                                    if (e0e.a(egz.m(wqg6), (Object)"border")) {
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
                                                                        return crg.J(c, b2, (Map)m3a.F0, (stb)new stb<khk$a, vzv>(b2, c, w, w2, w4, w3, w5, wqg6.W(xd.h(n7, c, n8, b2)), this, crg) {
                                                                            public final int F0;
                                                                            public final int G0;
                                                                            public final khk H0;
                                                                            public final khk I0;
                                                                            public final khk J0;
                                                                            public final khk K0;
                                                                            public final khk L0;
                                                                            public final khk M0;
                                                                            public final kqj N0;
                                                                            public final crg O0;
                                                                            
                                                                            public final Object invoke(final Object o) {
                                                                                final khk$a khk$a = (khk$a)o;
                                                                                e0e.f((Object)khk$a, "$this$layout");
                                                                                final int f0 = this.F0;
                                                                                final int g0 = this.G0;
                                                                                final khk h0 = this.H0;
                                                                                final khk i0 = this.I0;
                                                                                final khk j0 = this.J0;
                                                                                final khk k0 = this.K0;
                                                                                final khk l0 = this.L0;
                                                                                final khk m0 = this.M0;
                                                                                final kqj n0 = this.N0;
                                                                                final float c = n0.c;
                                                                                final boolean b = n0.b;
                                                                                final float density = ((rp8)this.O0).getDensity();
                                                                                final cwe layoutDirection = ((b0e)this.O0).getLayoutDirection();
                                                                                final osj d = this.N0.d;
                                                                                final float a = iqj.a;
                                                                                int n2 = jb2.B0(d.d() * density);
                                                                                final int b2 = jb2.B0(zzz.y(d, layoutDirection) * density);
                                                                                final float c2 = dhs.c;
                                                                                if (h0 != null) {
                                                                                    Objects.requireNonNull(ex.Companion);
                                                                                    khk$a.h(khk$a, h0, 0, jb2.B0((1 + 0.0f) * ((f0 - h0.G0) / 2.0f)), 0.0f, 4, (Object)null);
                                                                                }
                                                                                if (i0 != null) {
                                                                                    final int f2 = i0.F0;
                                                                                    Objects.requireNonNull(ex.Companion);
                                                                                    khk$a.h(khk$a, i0, g0 - f2, jb2.B0((1 + 0.0f) * ((f0 - i0.G0) / 2.0f)), 0.0f, 4, (Object)null);
                                                                                }
                                                                                if (k0 != null) {
                                                                                    int b3;
                                                                                    if (b) {
                                                                                        Objects.requireNonNull(ex.Companion);
                                                                                        b3 = jb2.B0((1 + 0.0f) * ((f0 - k0.G0) / 2.0f));
                                                                                    }
                                                                                    else {
                                                                                        b3 = n2;
                                                                                    }
                                                                                    final float n3 = (float)b3;
                                                                                    final float n4 = 1 - c;
                                                                                    final float n5 = (float)(k0.G0 / 2);
                                                                                    float n6;
                                                                                    if (h0 == null) {
                                                                                        n6 = 0.0f;
                                                                                    }
                                                                                    else {
                                                                                        n6 = (dhs.e(h0) - c2 * density) * n4;
                                                                                    }
                                                                                    khk$a.h(khk$a, k0, jb2.B0(n6) + b2, jb2.B0(n3 * n4 - n5 * c), 0.0f, 4, (Object)null);
                                                                                }
                                                                                int b4;
                                                                                if (b) {
                                                                                    Objects.requireNonNull(ex.Companion);
                                                                                    b4 = jb2.B0((1 + 0.0f) * ((f0 - j0.G0) / 2.0f));
                                                                                }
                                                                                else {
                                                                                    b4 = n2;
                                                                                }
                                                                                khk$a.h(khk$a, j0, dhs.e(h0), Math.max(b4, dhs.d(k0) / 2), 0.0f, 4, (Object)null);
                                                                                if (l0 != null) {
                                                                                    if (b) {
                                                                                        Objects.requireNonNull(ex.Companion);
                                                                                        n2 = jb2.B0((1 + 0.0f) * ((f0 - l0.G0) / 2.0f));
                                                                                    }
                                                                                    khk$a.h(khk$a, l0, dhs.e(h0), n2, 0.0f, 4, (Object)null);
                                                                                }
                                                                                Objects.requireNonNull(hud.Companion);
                                                                                khk$a.f(khk$a, m0, hud.b, 0.0f, 2, (Object)null);
                                                                                return vzv.a;
                                                                            }
                                                                        });
                                                                    }
                                                                }
                                                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
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
        return this.g(b0e, list, n, (hub<? super jzd, ? super Integer, Integer>)kqj$e.F0);
    }
    
    @Override
    public final int d(final b0e b0e, final List<? extends jzd> list, final int n) {
        e0e.f((Object)b0e, "<this>");
        return this.f(b0e, list, n, (hub<? super jzd, ? super Integer, Integer>)kqj$a.F0);
    }
    
    @Override
    public final int e(final b0e b0e, final List<? extends jzd> list, final int n) {
        e0e.f((Object)b0e, "<this>");
        return this.f(b0e, list, n, (hub<? super jzd, ? super Integer, Integer>)kqj$d.F0);
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
                                                    return iqj.b(intValue5, intValue4, intValue2, intValue3, intValue, dhs.a, ((qni)b0e).getDensity(), this.d);
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
    
    public final int g(final b0e b0e, final List<? extends jzd> list, int intValue, final hub<? super jzd, ? super Integer, Integer> hub) {
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
                                                    return iqj.c(intValue5, intValue4, intValue2, intValue3, intValue, this.c < 1.0f, dhs.a, ((qni)b0e).getDensity(), this.d);
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
