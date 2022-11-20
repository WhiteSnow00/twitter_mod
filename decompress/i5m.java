import java.util.ArrayList;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = { 882 }, m = "invokeSuspend")
public final class i5m extends p0s implements ftb<cy6, go6<? super fzv>, Object>
{
    public thq$a$a D0;
    public int E0;
    public Object F0;
    public final d5m G0;
    public final itb<cy6, hqh, go6<? super fzv>, Object> H0;
    public final hqh I0;
    
    public i5m(final d5m g0, final itb<? super cy6, ? super hqh, ? super go6<? super fzv>, ?> h0, final hqh i0, final go6<? super i5m> go6) {
        this.G0 = g0;
        this.H0 = (itb<cy6, hqh, go6<? super fzv>, Object>)h0;
        this.I0 = i0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object f0, final go6<?> go6) {
        final i5m i5m = new i5m(this.G0, this.H0, this.I0, (go6<? super i5m>)go6);
        i5m.F0 = f0;
        return (go6<fzv>)i5m;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((i5m)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
    }
    
    public final Object invokeSuspend(Object l) {
        final dy6 d0 = dy6.D0;
        final int e0 = this.E0;
        Label_0454: {
            if (e0 != 0) {
                if (e0 == 1) {
                    final Object o = this.D0;
                    final k9e k9e = (k9e)this.F0;
                    try {
                        b1n.u(l);
                        break Label_0454;
                    }
                    finally {
                        l = k9e;
                        final Throwable t;
                        final Object o2 = t;
                        break Label_0454;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b1n.u(l);
            l = b1n.l(((cy6)this.F0).A());
            final d5m g0 = this.G0;
            Object o2 = g0.d;
            synchronized (o2) {
                final Throwable f = g0.f;
                if (f != null) {
                    throw f;
                }
                if (((Enum<d5m$d>)g0.q.getValue()).compareTo(d5m$d.E0) > 0) {
                    if (g0.e == null) {
                        g0.e = (k9e)l;
                        g0.u();
                        monitorexit(o2);
                        o2 = thq.Companion.d((ftb)new i5m$b(this.G0));
                        final d5m$a companion = d5m.Companion;
                        final d5m$c r = this.G0.r;
                        Objects.requireNonNull(companion);
                        o8r s;
                        sak sak;
                        sak add;
                        do {
                            s = d5m.s;
                            sak = (sak)s.getValue();
                            add = sak.add((Object)r);
                            if (sak != add) {
                                continue;
                            }
                            break;
                        } while (!s.compareAndSet((Object)sak, (Object)add));
                        try {
                            final d5m g2 = this.G0;
                            Object o = g2.d;
                            synchronized (o) {
                                final ArrayList g3 = g2.g;
                                for (int i = 0; i < g3.size(); ++i) {
                                    ((jp6)g3.get(i)).w();
                                }
                                monitorexit(o);
                                o = new ftb<cy6, go6<? super fzv>, Object>(this.H0, this.I0, null) {
                                    public int D0;
                                    public Object E0;
                                    public final itb<cy6, hqh, go6<? super fzv>, Object> F0;
                                    public final hqh G0;
                                    
                                    public final go6<fzv> create(final Object e0, final go6<?> go6) {
                                        final ftb<cy6, go6<? super fzv>, Object> ftb = (ftb<cy6, go6<? super fzv>, Object>)new ftb<cy6, go6<? super fzv>, Object>(this.F0, this.G0, go6) {
                                            public int D0;
                                            public Object E0;
                                            public final itb<cy6, hqh, go6<? super fzv>, Object> F0;
                                            public final hqh G0;
                                        };
                                        ftb.E0 = e0;
                                        return (go6<fzv>)ftb;
                                    }
                                    
                                    public final Object invoke(final Object o, final Object o2) {
                                        return ((i5m$a)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
                                    }
                                    
                                    public final Object invokeSuspend(final Object o) {
                                        final dy6 d0 = dy6.D0;
                                        final int d2 = this.D0;
                                        if (d2 != 0) {
                                            if (d2 != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            b1n.u(o);
                                        }
                                        else {
                                            b1n.u(o);
                                            final cy6 cy6 = (cy6)this.E0;
                                            final itb<cy6, hqh, go6<? super fzv>, Object> f0 = this.F0;
                                            final hqh g0 = this.G0;
                                            this.D0 = 1;
                                            if (f0.h0((Object)cy6, (Object)g0, (Object)this) == d0) {
                                                return d0;
                                            }
                                        }
                                        return fzv.a;
                                    }
                                };
                                this.F0 = l;
                                this.D0 = (thq$a$a)o2;
                                this.E0 = 1;
                                o = sh4.h((ftb)o, (go6)this);
                                if (o == d0) {
                                    return d0;
                                }
                                o = o2;
                                ((ecj)o2).dispose();
                                final d5m g4 = this.G0;
                                synchronized (g4.d) {
                                    if (g4.e == l) {
                                        g4.e = null;
                                    }
                                    g4.u();
                                    monitorexit(g4.d);
                                    d5m$a.a(d5m.Companion, this.G0.r);
                                    return fzv.a;
                                }
                            }
                        }
                        finally {
                            final Object o;
                            final ftb ftb;
                            o2 = (o = ftb);
                        }
                        ((ecj)o2).dispose();
                        final d5m g5 = this.G0;
                        synchronized (g5.d) {
                            if (g5.e == l) {
                                g5.e = null;
                            }
                            g5.u();
                            monitorexit(g5.d);
                            d5m$a.a(d5m.Companion, this.G0.r);
                            throw o2;
                        }
                    }
                    l = new IllegalStateException("Recomposer already running".toString());
                    throw l;
                }
                l = new IllegalStateException("Recomposer shut down".toString());
                throw l;
            }
        }
    }
}
