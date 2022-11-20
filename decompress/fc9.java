import java.io.Serializable;
import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fc9
{
    public static final Object a(final le1 d0, final m8r e0, final m8r f0, final oqw g0, final ooj h0, final go6 go6) {
        tb9 tb9 = null;
        Label_0053: {
            if (go6 instanceof tb9) {
                tb9 = (tb9)go6;
                final int o0 = tb9.O0;
                if ((o0 & Integer.MIN_VALUE) != 0x0) {
                    tb9.O0 = o0 + Integer.MIN_VALUE;
                    break Label_0053;
                }
            }
            tb9 = new tb9(go6);
        }
        Object o2 = tb9.N0;
        Object d2 = dy6.D0;
        final int o3 = tb9.O0;
        while (true) {
            ftb ftb = null;
            Label_1669: {
                Object o11 = null;
                q7m q7m6 = null;
                Label_1604: {
                    float n = 0.0f;
                    Object e2 = null;
                    q7m d4 = null;
                    float k2 = 0.0f;
                    go6 go8 = null;
                    float n5 = 0.0f;
                    le1 le5 = null;
                    Object o14 = null;
                    Label_1451: {
                        Label_1425: {
                            float m2 = 0.0f;
                            hpk i0 = null;
                            Object o7 = null;
                            le1 le3 = null;
                            Object o8 = null;
                            Label_1417: {
                                float m0 = 0.0f;
                                float k0 = 0.0f;
                                int n2 = 0;
                                Object g2 = null;
                                Object o4 = null;
                                go6 go7 = null;
                                Object o5 = null;
                                le1 le2 = null;
                                Object o6 = null;
                                Label_0941: {
                                    ooj f2 = null;
                                    oqw oqw = null;
                                    le1 d3 = null;
                                    Label_0628: {
                                        oqw e3;
                                        m8r m8r;
                                        m8r m8r2;
                                        if (o3 != 0) {
                                            if (o3 != 1) {
                                                if (o3 == 2) {
                                                    f2 = (ooj)tb9.F0;
                                                    oqw = (oqw)tb9.E0;
                                                    d3 = (le1)tb9.D0;
                                                    b1n.u(o2);
                                                    break Label_0628;
                                                }
                                                if (o3 == 3) {
                                                    m0 = tb9.M0;
                                                    n = tb9.L0;
                                                    k0 = tb9.K0;
                                                    n2 = tb9.J0;
                                                    final q7m q7m = (q7m)tb9.H0;
                                                    g2 = tb9.G0;
                                                    final le1 le1 = (le1)tb9.F0;
                                                    e2 = tb9.E0;
                                                    final q7m q7m2 = (q7m)tb9.D0;
                                                    b1n.u(o2);
                                                    o4 = o2;
                                                    go7 = (go6)tb9;
                                                    o5 = d2;
                                                    d4 = q7m2;
                                                    le2 = le1;
                                                    o6 = q7m;
                                                    break Label_0941;
                                                }
                                                if (o3 == 4) {
                                                    m2 = tb9.M0;
                                                    n = tb9.L0;
                                                    k2 = tb9.K0;
                                                    n2 = tb9.J0;
                                                    i0 = tb9.I0;
                                                    final q7m q7m3 = (q7m)tb9.H0;
                                                    o7 = tb9.G0;
                                                    le3 = (le1)tb9.F0;
                                                    e2 = tb9.E0;
                                                    final q7m q7m4 = (q7m)tb9.D0;
                                                    b1n.u(o2);
                                                    go8 = (go6)tb9;
                                                    d4 = q7m4;
                                                    o8 = q7m3;
                                                    break Label_1417;
                                                }
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            else {
                                                f2 = (ooj)tb9.H0;
                                                e3 = (oqw)tb9.G0;
                                                m8r = (m8r)tb9.F0;
                                                m8r2 = (m8r)tb9.E0;
                                                d3 = (le1)tb9.D0;
                                                b1n.u(o2);
                                            }
                                        }
                                        else {
                                            b1n.u(o2);
                                            final bpk d5 = bpk.D0;
                                            tb9.D0 = d0;
                                            tb9.E0 = e0;
                                            tb9.F0 = f0;
                                            tb9.G0 = g0;
                                            tb9.H0 = (Serializable)h0;
                                            tb9.O0 = 1;
                                            final Object c = yas.c(d0, d5, false, (go6<? super hpk>)tb9);
                                            d3 = d0;
                                            o2 = c;
                                            m8r2 = e0;
                                            m8r = f0;
                                            e3 = g0;
                                            f2 = h0;
                                            if (c == d2) {
                                                return d2;
                                            }
                                        }
                                        final hpk hpk = (hpk)o2;
                                        if (!(boolean)((qsb)m8r2.getValue()).invoke((Object)hpk)) {
                                            return null;
                                        }
                                        if (((nsb)m8r.getValue()).invoke()) {
                                            hpk.a();
                                            mru.d(e3, hpk);
                                            Objects.requireNonNull(wfj.Companion);
                                            return new lvj((Object)hpk, (Object)new wfj(wfj.b));
                                        }
                                        tb9.D0 = d3;
                                        tb9.E0 = e3;
                                        tb9.F0 = f2;
                                        tb9.G0 = null;
                                        tb9.H0 = null;
                                        tb9.O0 = 2;
                                        o2 = yas.b(d3, false, (go6<? super hpk>)tb9);
                                        if (o2 == d2) {
                                            return d2;
                                        }
                                        oqw = e3;
                                    }
                                    final hpk hpk2 = (hpk)o2;
                                    mru.d(oqw, hpk2);
                                    final q7m q7m5 = new q7m();
                                    Objects.requireNonNull(wfj.Companion);
                                    q7m5.D0 = wfj.b;
                                    final ub9 ub9 = new ub9(oqw, q7m5);
                                    final long a = hpk2.a;
                                    final int h2 = hpk2.h;
                                    final hb9$a a2 = hb9.a;
                                    czd.f((Object)f2, "<this>");
                                    Object o10;
                                    if (f2 == ooj.D0) {
                                        o10 = hb9.b;
                                    }
                                    else {
                                        o10 = hb9.a;
                                    }
                                    if (hb9.f(d3.e0(), a)) {
                                        o11 = null;
                                        q7m6 = q7m5;
                                        break Label_1604;
                                    }
                                    final float g3 = hb9.g(d3.getViewConfiguration(), h2);
                                    final q7m q7m7 = new q7m();
                                    q7m7.D0 = a;
                                    final float l0 = 0.0f;
                                    n2 = 1;
                                    final le1 le4 = d3;
                                    final hpk hpk3 = (hpk)d2;
                                    final go6<? super hpk> go9 = (go6<? super hpk>)tb9;
                                    m0 = 0.0f;
                                    final Object e4 = ub9;
                                    final q7m d6 = q7m5;
                                    final le1 f3 = le4;
                                    o6 = q7m7;
                                    final Object o9 = hpk3;
                                    final Object o12 = go9;
                                    final Object g4 = o10;
                                    ((tb9)o12).D0 = d6;
                                    ((tb9)o12).E0 = e4;
                                    ((tb9)o12).F0 = f3;
                                    ((tb9)o12).G0 = g4;
                                    ((tb9)o12).H0 = (Serializable)o6;
                                    ((tb9)o12).I0 = null;
                                    ((tb9)o12).J0 = n2;
                                    ((tb9)o12).K0 = g3;
                                    ((tb9)o12).L0 = l0;
                                    ((tb9)o12).M0 = m0;
                                    ((tb9)o12).O0 = 3;
                                    final Object d7 = g4k.d(f3, (bpk)null, (go6)o12, 1, (Object)null);
                                    if (d7 == o9) {
                                        return o9;
                                    }
                                    g2 = g4;
                                    go7 = (go6)o12;
                                    final apk apk = (apk)o9;
                                    final float n3 = l0;
                                    d4 = d6;
                                    le2 = f3;
                                    e2 = e4;
                                    k0 = g3;
                                    n = n3;
                                    o5 = apk;
                                    o4 = d7;
                                }
                                final apk apk2 = (apk)o4;
                                final List a3 = apk2.a;
                                final int size = a3.size();
                                int j = 0;
                                final tb9 tb10 = (tb9)go7;
                                while (true) {
                                    while (j < size) {
                                        final Object value = a3.get(j);
                                        if (gpk.a(((hpk)value).a, ((q7m)o6).D0)) {
                                            final hpk i2 = (hpk)value;
                                            Label_1126: {
                                                if (i2 != null) {
                                                    if (!i2.d()) {
                                                        if (gmw.l(i2)) {
                                                            final List a4 = apk2.a;
                                                            final int size2 = a4.size();
                                                            int n4 = 0;
                                                            while (true) {
                                                                while (n4 < size2) {
                                                                    final Object value2 = a4.get(n4);
                                                                    if (((hpk)value2).d) {
                                                                        final hpk hpk4 = (hpk)value2;
                                                                        if (hpk4 == null) {
                                                                            break Label_1126;
                                                                        }
                                                                        ((q7m)o6).D0 = hpk4.a;
                                                                        final Object o13 = o5;
                                                                        go8 = (go6)tb10;
                                                                        n5 = m0;
                                                                        d2 = o13;
                                                                        k2 = k0;
                                                                        le5 = le2;
                                                                        o14 = g2;
                                                                        break Label_1451;
                                                                    }
                                                                    else {
                                                                        ++n4;
                                                                    }
                                                                }
                                                                final Object value2 = null;
                                                                continue;
                                                            }
                                                        }
                                                        final long c2 = i2.c;
                                                        final long f4 = i2.f;
                                                        final float a5 = ((zok)g2).a(c2);
                                                        final float a6 = ((zok)g2).a(f4);
                                                        final float c3 = ((zok)g2).c(c2);
                                                        final float c4 = ((zok)g2).c(f4);
                                                        final float l2 = n + (a5 - a6);
                                                        final float m3 = m0 + (c3 - c4);
                                                        float n6;
                                                        if (n2 != 0) {
                                                            n6 = Math.abs(l2);
                                                        }
                                                        else {
                                                            n6 = wfj.c(((zok)g2).b(l2, m3));
                                                        }
                                                        if (n6 < k0) {
                                                            final bpk f5 = bpk.F0;
                                                            tb10.D0 = d4;
                                                            tb10.E0 = e2;
                                                            final le1 f6 = le2;
                                                            tb10.F0 = f6;
                                                            tb10.G0 = g2;
                                                            tb10.H0 = (Serializable)o6;
                                                            tb10.I0 = i2;
                                                            tb10.J0 = n2;
                                                            tb10.K0 = k0;
                                                            tb10.L0 = l2;
                                                            tb10.M0 = m3;
                                                            tb10.O0 = 4;
                                                            if (f6.g0(f5, (go6)tb10) == o5) {
                                                                return o5;
                                                            }
                                                            o8 = o6;
                                                            i0 = i2;
                                                            final tb9 tb11 = tb10;
                                                            o7 = g2;
                                                            le3 = f6;
                                                            k2 = k0;
                                                            n = l2;
                                                            d2 = o5;
                                                            go8 = (go6)tb11;
                                                            m2 = m3;
                                                            break Label_1417;
                                                        }
                                                        else {
                                                            long n7;
                                                            if (n2 != 0) {
                                                                n7 = ((zok)g2).b(l2 - Math.signum(l2) * k0, m3);
                                                            }
                                                            else {
                                                                final long b = ((zok)g2).b(l2, m3);
                                                                n7 = wfj.g(b, wfj.i(wj1.a(wfj.d(b) / n6, wfj.e(b) / n6), k0));
                                                            }
                                                            ((ftb)e2).invoke((Object)i2, (Object)new wfj(n7));
                                                            if (i2.d()) {
                                                                q7m6 = d4;
                                                                o11 = i2;
                                                                break Label_1604;
                                                            }
                                                            final Object o15 = o5;
                                                            final float g3 = k0;
                                                            final zok zok = (zok)g2;
                                                            m0 = 0.0f;
                                                            final float l0 = 0.0f;
                                                            ftb = (ftb)e2;
                                                            final q7m d6 = d4;
                                                            final le1 f3 = le2;
                                                            final Object o9 = o15;
                                                            final Object o12 = tb10;
                                                            final Object g4 = zok;
                                                            break Label_1669;
                                                        }
                                                    }
                                                }
                                            }
                                            break Label_1425;
                                        }
                                        ++j;
                                    }
                                    final Object value = null;
                                    continue;
                                }
                            }
                            if (!i0.d()) {
                                final Object o16 = o8;
                                o14 = o7;
                                final Object o6 = o16;
                                le5 = le3;
                                n5 = m2;
                                break Label_1451;
                            }
                        }
                        q7m6 = d4;
                        o11 = null;
                        break Label_1604;
                    }
                    final q7m q7m8 = d4;
                    final le1 le6 = le5;
                    final float n8 = k2;
                    final ftb ftb2 = (ftb)e2;
                    final float n9 = n;
                    final Object o9 = d2;
                    final Object g4 = o14;
                    float m0 = n5;
                    final float g3 = n8;
                    final Object o12 = go8;
                    final float l0 = n9;
                    final le1 f3 = le6;
                    final q7m d6 = q7m8;
                    ftb = ftb2;
                    break Label_1669;
                }
                Object o9;
                if (o11 != null) {
                    o9 = new lvj(o11, (Object)new wfj(q7m6.D0));
                }
                else {
                    o9 = null;
                }
                return o9;
            }
            final Object e4 = ftb;
            continue;
        }
    }
    
    public static final Object b(final le1 le1, final hpk hpk, final long n, final oqw oqw, final hhp hhp, final boolean b, final ooj ooj, final go6 go6) {
        hhp.n((Object)new gb9$c(wfj.g(hpk.c, wj1.a(wfj.d(n) * Math.signum(wfj.d(hpk.c)), wfj.e(n) * Math.signum(wfj.e(hpk.c))))));
        long i = n;
        if (b) {
            i = wfj.i(n, -1.0f);
        }
        hhp.n((Object)new gb9$b(i));
        final vb9 vb9 = new vb9(oqw, hhp, b);
        Object o;
        if (ooj == ooj.D0) {
            o = hb9.h(le1, hpk.a, (qsb<? super hpk, fzv>)vb9, (go6<? super Boolean>)go6);
        }
        else {
            o = hb9.e(le1, hpk.a, (qsb<? super hpk, fzv>)vb9, (go6<? super Boolean>)go6);
        }
        return o;
    }
    
    public static final okh c(final okh okh, final gc9 gc9, final qsb<? super hpk, Boolean> qsb, final ooj ooj, final boolean b, final sth sth, final nsb<Boolean> nsb, final itb<? super cy6, ? super wfj, ? super go6<? super fzv>, ?> itb, final itb<? super cy6, ? super mqw, ? super go6<? super fzv>, ?> itb2, final boolean b2) {
        czd.f((Object)okh, "<this>");
        czd.f((Object)gc9, "state");
        czd.f((Object)qsb, "canDrag");
        czd.f((Object)nsb, "startDragImmediately");
        czd.f((Object)itb, "onDragStarted");
        czd.f((Object)itb2, "onDragStopped");
        final wrd$a a = wrd.a;
        return w66.a(okh, (qsb)wrd.a, (itb)new fc9$a(sth, (nsb)nsb, (qsb)qsb, (itb)itb, (itb)itb2, gc9, ooj, b, b2));
    }
}
