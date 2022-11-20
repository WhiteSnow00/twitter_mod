import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k0s
{
    public static final <T, V extends kc0> Object a(ac0<T, V> d0, db0<T, V> db0, final long n, final qsb<? super yb0<T, V>, fzv> f0, go6<? super fzv> g0) {
        db0<T, V> e0 = db0;
        k0s$a k0s$a = null;
        Label_0057: {
            if (g0 instanceof k0s$a) {
                k0s$a = (k0s$a)g0;
                final int i0 = k0s$a.I0;
                if ((i0 & Integer.MIN_VALUE) != 0x0) {
                    k0s$a.I0 = i0 + Integer.MIN_VALUE;
                    break Label_0057;
                }
            }
            k0s$a = new k0s$a((go6)g0);
        }
        final Object h0 = k0s$a.H0;
        final dy6 d2 = dy6.D0;
        final int i2 = k0s$a.I0;
        boolean b = true;
        Object o = null;
        CancellationException ex2 = null;
        Label_0623: {
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g0 = k0s$a.G0;
                final qsb f2 = k0s$a.F0;
                e0 = k0s$a.E0;
                final ac0 d3 = d0 = k0s$a.D0;
                db0 = (db0<T, V>)g0;
                try {
                    b1n.u(h0);
                    break Label_0623;
                }
                catch (final CancellationException ex) {
                    break Label_0623;
                }
            }
            b1n.u(h0);
            final T f3 = e0.f(0L);
            final kc0 b2 = e0.b(0L);
            g0 = new r7m();
            Label_0430: {
                if (n == Long.MIN_VALUE) {
                    o = g0;
                    try {
                        final float g2 = g(((go6)k0s$a).getContext());
                        o = g0;
                        o = g0;
                        final k0s$b k0s$b = new k0s$b(g0, (Object)f3, (db0)db0, b2, d0, g2, (qsb)f0);
                        o = g0;
                        k0s$a.D0 = d0;
                        o = g0;
                        k0s$a.E0 = e0;
                        o = g0;
                        k0s$a.F0 = f0;
                        o = g0;
                        k0s$a.G0 = g0;
                        o = g0;
                        k0s$a.I0 = 1;
                        o = g0;
                        if (e(e0, (qsb<? super Long, ?>)k0s$b, (go6<? super Object>)k0s$a) == d2) {
                            return d2;
                        }
                        break Label_0430;
                    }
                    catch (final CancellationException ex2) {
                        break Label_0623;
                    }
                }
                final zhv<T, V> e2 = db0.e();
                final T g3 = db0.g();
                final k0s$c k0s$c = new k0s$c(d0);
                try {
                    final yb0 d4 = new yb0<T, V>((Object)f3, (zhv)e2, b2, n, (Object)g3, n, (nsb)k0s$c);
                    f(d4, n, g(((go6)k0s$a).getContext()), db0, (ac0<T, V>)d0, f0);
                    g0.D0 = d4;
                    final qsb f2 = f0;
                    final ac0 d3 = d0;
                    k0s$d k0s$d;
                    do {
                        d0 = d3;
                        final Object d5 = g0.D0;
                        d0 = d3;
                        czd.c(d5);
                        d0 = d3;
                        if (!((yb0)d5).d()) {
                            return fzv.a;
                        }
                        d0 = d3;
                        final float g4 = g(((go6)k0s$a).getContext());
                        d0 = d3;
                        d0 = d3;
                        k0s$d = new k0s$d(g0, g4, (db0)e0, d3, f2);
                        d0 = d3;
                        k0s$a.D0 = d3;
                        d0 = d3;
                        k0s$a.E0 = e0;
                        d0 = d3;
                        k0s$a.F0 = f2;
                        d0 = d3;
                        k0s$a.G0 = g0;
                        d0 = d3;
                        k0s$a.I0 = 2;
                        d0 = d3;
                    } while (e(e0, (qsb<? super Long, ?>)k0s$d, (go6<? super Object>)k0s$a) != d2);
                    return d2;
                    o = db0;
                    final CancellationException ex;
                    ex2 = ex;
                }
                catch (final CancellationException ex2) {
                    o = g0;
                }
            }
        }
        final yb0 yb0 = (yb0)((r7m)o).D0;
        if (yb0 != null) {
            yb0.e();
        }
        final yb0 yb2 = (yb0)((r7m)o).D0;
        if (yb2 == null || yb2.g != d0.G0) {
            b = false;
        }
        if (b) {
            d0.I0 = false;
        }
        throw ex2;
    }
    
    public static Object b(final float n, final float n2, zb0 m0, final ftb ftb, final go6 go6, final int n3) {
        if ((n3 & 0x8) != 0x0) {
            m0 = (zb0)rp9.M0(0.0f, null, 7);
        }
        final aiv a = npw.a;
        final aiv a2 = npw.a;
        final Float n4 = new Float(n);
        final Float n5 = new Float(n2);
        kc0 u0;
        if ((u0 = (kc0)a2.a.invoke((Object)new Float(0.0f))) == null) {
            u0 = rp9.u0((kc0)a2.a.invoke((Object)n4));
        }
        Object o = a((ac0<Object, kc0>)new ac0((zhv)a2, (Object)n4, u0, 56), (db0<Object, kc0>)new ibs(m0, (zhv)a2, (Object)n4, (Object)n5, u0), Long.MIN_VALUE, (qsb<? super yb0<Object, kc0>, fzv>)new j0s(ftb, (zhv)a2), (go6<? super fzv>)go6);
        final dy6 d0 = dy6.D0;
        if (o != d0) {
            o = fzv.a;
        }
        if (o != d0) {
            o = fzv.a;
        }
        return o;
    }
    
    public static Object c(final ac0 ac0, final bb8 bb8, final qsb qsb, final go6 go6) {
        Object o = a((ac0<Object, kc0>)ac0, (db0<Object, kc0>)new ab8(bb8, ac0.D0, ac0.getValue(), ac0.F0), Long.MIN_VALUE, (qsb<? super yb0<Object, kc0>, fzv>)qsb, (go6<? super fzv>)go6);
        if (o != dy6.D0) {
            o = fzv.a;
        }
        return o;
    }
    
    public static Object d(final ac0 ac0, Object o, zb0 m0, boolean b, qsb d0, final go6 go6, final int n) {
        if ((n & 0x2) != 0x0) {
            m0 = (zb0)rp9.M0(0.0f, null, 7);
        }
        if ((n & 0x4) != 0x0) {
            b = false;
        }
        if ((n & 0x8) != 0x0) {
            d0 = (qsb)m0s.D0;
        }
        o = new ibs(m0, ac0.D0, ac0.getValue(), o, ac0.F0);
        long g0;
        if (b) {
            g0 = ac0.G0;
        }
        else {
            g0 = Long.MIN_VALUE;
        }
        Object o2 = a((ac0<Object, kc0>)ac0, (db0<Object, kc0>)o, g0, (qsb<? super yb0<Object, kc0>, fzv>)d0, (go6<? super fzv>)go6);
        if (o2 != dy6.D0) {
            o2 = fzv.a;
        }
        return o2;
    }
    
    public static final <R, T, V extends kc0> Object e(final db0<T, V> db0, final qsb<? super Long, ? extends R> qsb, final go6<? super R> go6) {
        if (db0.a()) {
            return tkd.a((qsb)qsb, (go6)go6);
        }
        return q3j.h0((qsb)new k0s$e((qsb)qsb), (go6)go6);
    }
    
    public static final <T, V extends kc0> void f(final yb0<T, V> yb0, final long g, final float n, final db0<T, V> db0, final ac0<T, V> ac0, final qsb<? super yb0<T, V>, fzv> qsb) {
        long d;
        if (n == 0.0f) {
            d = db0.d();
        }
        else {
            d = (long)((g - yb0.c) / n);
        }
        yb0.g = g;
        yb0.e.setValue(db0.f(d));
        final kc0 b = db0.b(d);
        czd.f((Object)b, "<set-?>");
        yb0.f = (V)b;
        if (db0.c(d)) {
            yb0.h = yb0.g;
            yb0.e();
        }
        h(yb0, ac0);
        qsb.invoke((Object)yb0);
    }
    
    public static final float g(final sx6 sx6) {
        czd.f((Object)sx6, "<this>");
        final int y = yqh.Y;
        final yqh yqh = (yqh)sx6.c((sx6$b)yqh$a.D0);
        float y2;
        if (yqh != null) {
            y2 = yqh.y();
        }
        else {
            y2 = 1.0f;
        }
        if (y2 >= 0.0f) {
            return y2;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public static final <T, V extends kc0> void h(final yb0<T, V> yb0, final ac0<T, V> ac0) {
        czd.f((Object)yb0, "<this>");
        czd.f((Object)ac0, "state");
        ac0.g(yb0.b());
        final kc0 f0 = ac0.F0;
        final kc0 f2 = yb0.f;
        czd.f((Object)f0, "<this>");
        czd.f((Object)f2, "source");
        for (int b = f0.b(), i = 0; i < b; ++i) {
            f0.e(i, f2.a(i));
        }
        ac0.H0 = yb0.h;
        ac0.G0 = yb0.g;
        ac0.I0 = yb0.d();
    }
}
