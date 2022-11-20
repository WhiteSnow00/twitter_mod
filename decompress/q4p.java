import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q4p
{
    public final ooj a;
    public final boolean b;
    public final m8r<tbi> c;
    public final g4p d;
    public final w5b e;
    public final vqj f;
    public final puh<Boolean> g;
    
    public q4p(final ooj a, final boolean b, final m8r<tbi> c, final g4p d, final w5b e, final vqj f) {
        czd.f((Object)a, "orientation");
        czd.f((Object)c, "nestedScrollDispatcher");
        czd.f((Object)d, "scrollableState");
        czd.f((Object)e, "flingBehavior");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = (hwj)blz.Q(Boolean.FALSE);
    }
    
    public final long a(final m3p m3p, long n, final int n2) {
        czd.f((Object)m3p, "$this$dispatchScroll");
        int n3;
        if (this.a == ooj.E0) {
            n3 = 1;
        }
        else {
            n3 = 2;
        }
        final long a = wfj.a(n, n3);
        final vqj f = this.f;
        if (f != null && f.isEnabled()) {
            n = this.f.e(a);
        }
        else {
            Objects.requireNonNull(wfj.Companion);
            n = wfj.b;
        }
        final long g = wfj.g(a, n);
        final tbi tbi = (tbi)this.c.getValue();
        final sbi c = tbi.c;
        if (c != null) {
            n = c.f(g, n2);
        }
        else {
            Objects.requireNonNull(wfj.Companion);
            n = wfj.b;
        }
        n = wfj.g(g, n);
        final long f2 = this.f(this.h(m3p.a(this.g(this.f(n)))));
        final long g2 = wfj.g(n, f2);
        final long b = tbi.b(f2, g2, n2);
        final long g3 = wfj.g(g2, b);
        final vqj f3 = this.f;
        if (f3 != null && f3.isEnabled()) {
            this.f.a(n, g3, n2);
        }
        return wfj.g(g2, b);
    }
    
    public final Object b(final long d0, final go6<? super mqw> go6) {
        q4p$a q4p$a2 = null;
        Label_0054: {
            if (go6 instanceof q4p$a) {
                final q4p$a q4p$a = (q4p$a)go6;
                final int g0 = q4p$a.G0;
                if ((g0 & Integer.MIN_VALUE) != 0x0) {
                    q4p$a.G0 = g0 + Integer.MIN_VALUE;
                    q4p$a2 = q4p$a;
                    break Label_0054;
                }
            }
            q4p$a2 = new q4p$a(this, (go6)go6);
        }
        final Object e0 = q4p$a2.E0;
        final dy6 d2 = dy6.D0;
        final int g2 = q4p$a2.G0;
        q7m d3;
        if (g2 != 0) {
            if (g2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d3 = q4p$a2.D0;
            b1n.u(e0);
        }
        else {
            b1n.u(e0);
            final q7m d4 = new q7m();
            d4.D0 = d0;
            final g4p d5 = this.d;
            final q4p$b q4p$b = new q4p$b(this, d4, d0, (go6)null);
            q4p$a2.D0 = d4;
            q4p$a2.G0 = 1;
            if (jxa.t(d5, null, (ftb)q4p$b, (go6)q4p$a2, 1, null) == d2) {
                return d2;
            }
            d3 = d4;
        }
        return new mqw(d3.D0);
    }
    
    public final Object c(long e0, final go6<? super fzv> go6) {
        q4p$c q4p$c = null;
        Label_0052: {
            if (go6 instanceof q4p$c) {
                q4p$c = (q4p$c)go6;
                final int h0 = q4p$c.H0;
                if ((h0 & Integer.MIN_VALUE) != 0x0) {
                    q4p$c.H0 = h0 + Integer.MIN_VALUE;
                    break Label_0052;
                }
            }
            q4p$c = new q4p$c(this, (go6)go6);
        }
        Object o = q4p$c.F0;
        final dy6 d0 = dy6.D0;
        final int h2 = q4p$c.H0;
        q4p q4p2 = null;
        Label_0623: {
            q4p d2 = null;
            Object a = null;
            Label_0545: {
                while (true) {
                    q4p q4p = null;
                    Label_0409: {
                        long n = 0L;
                        Label_0347: {
                            Label_0320: {
                                Object o2;
                                q4p d5;
                                if (h2 != 0) {
                                    if (h2 == 1) {
                                        e0 = q4p$c.E0;
                                        q4p = q4p$c.D0;
                                        b1n.u(o);
                                        break Label_0320;
                                    }
                                    if (h2 == 2) {
                                        e0 = q4p$c.E0;
                                        q4p = q4p$c.D0;
                                        b1n.u(o);
                                        break Label_0409;
                                    }
                                    if (h2 != 3) {
                                        if (h2 == 4) {
                                            e0 = q4p$c.E0;
                                            d2 = q4p$c.D0;
                                            b1n.u(o);
                                            a = o;
                                            break Label_0545;
                                        }
                                        if (h2 == 5) {
                                            final q4p d3 = q4p$c.D0;
                                            b1n.u(o);
                                            q4p2 = d3;
                                            break Label_0623;
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    else {
                                        e0 = q4p$c.E0;
                                        final q4p d4 = q4p$c.D0;
                                        b1n.u(o);
                                        o2 = o;
                                        d5 = d4;
                                    }
                                }
                                else {
                                    b1n.u(o);
                                    this.d(true);
                                    if (this.a == ooj.E0) {
                                        e0 = mqw.a(e0, 0.0f, 0.0f, 1);
                                    }
                                    else {
                                        e0 = mqw.a(e0, 0.0f, 0.0f, 2);
                                    }
                                    final vqj f = this.f;
                                    if (f == null || !f.isEnabled()) {
                                        Objects.requireNonNull(mqw.Companion);
                                        n = mqw.b;
                                        q4p = this;
                                        break Label_0347;
                                    }
                                    final vqj f2 = this.f;
                                    q4p$c.D0 = this;
                                    q4p$c.E0 = e0;
                                    q4p$c.H0 = 1;
                                    o = f2.b(e0);
                                    if (o == d0) {
                                        return d0;
                                    }
                                    q4p = this;
                                    break Label_0320;
                                }
                                final long a2 = ((mqw)o2).a;
                                final tbi tbi = (tbi)d5.c.getValue();
                                e0 = mqw.d(e0, a2);
                                q4p$c.D0 = d5;
                                q4p$c.E0 = a2;
                                q4p$c.H0 = 4;
                                a = tbi.a(e0, a2, (go6)q4p$c);
                                if (a == d0) {
                                    return d0;
                                }
                                e0 = a2;
                                d2 = d5;
                                break Label_0545;
                            }
                            n = ((mqw)o).a;
                        }
                        e0 = mqw.d(e0, n);
                        final tbi tbi2 = (tbi)q4p.c.getValue();
                        q4p$c.D0 = q4p;
                        q4p$c.E0 = e0;
                        q4p$c.H0 = 2;
                        if ((o = tbi2.c(e0, (go6)q4p$c)) == d0) {
                            return d0;
                        }
                    }
                    e0 = mqw.d(e0, ((mqw)o).a);
                    q4p$c.D0 = q4p;
                    q4p$c.E0 = e0;
                    q4p$c.H0 = 3;
                    final Object b = q4p.b(e0, (go6<? super mqw>)q4p$c);
                    q4p d5 = q4p;
                    Object o2;
                    if ((o2 = b) == d0) {
                        return d0;
                    }
                    continue;
                }
            }
            e0 = mqw.d(e0, ((mqw)a).a);
            final vqj f3 = d2.f;
            q4p2 = d2;
            if (f3 != null) {
                q4p2 = d2;
                if (f3.isEnabled()) {
                    final vqj f4 = d2.f;
                    q4p$c.D0 = d2;
                    q4p$c.H0 = 5;
                    if (f4.d(e0) == d0) {
                        return d0;
                    }
                    q4p2 = d2;
                }
            }
        }
        q4p2.d(false);
        return fzv.a;
    }
    
    public final void d(final boolean b) {
        this.g.setValue((Object)b);
    }
    
    public final float e(final float n) {
        float n2 = n;
        if (this.b) {
            n2 = n * -1;
        }
        return n2;
    }
    
    public final long f(final long n) {
        long i = n;
        if (this.b) {
            i = wfj.i(n, -1.0f);
        }
        return i;
    }
    
    public final float g(final long n) {
        float n2;
        if (this.a == ooj.E0) {
            n2 = wfj.d(n);
        }
        else {
            n2 = wfj.e(n);
        }
        return n2;
    }
    
    public final long h(final float n) {
        long n2;
        if (n == 0.0f) {
            Objects.requireNonNull(wfj.Companion);
            n2 = wfj.b;
        }
        else if (this.a == ooj.E0) {
            n2 = wj1.a(n, 0.0f);
        }
        else {
            n2 = wj1.a(0.0f, n);
        }
        return n2;
    }
}
