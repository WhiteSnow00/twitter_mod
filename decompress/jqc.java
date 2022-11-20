import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3", f = "Hoverable.kt", l = { 102 }, m = "invokeSuspend")
public final class jqc extends p0s implements ftb<ppk, go6<? super fzv>, Object>
{
    public int D0;
    public Object E0;
    public final cy6 F0;
    public final sth G0;
    public final puh<dqc> H0;
    
    public jqc(final cy6 f0, final sth g0, final puh<dqc> h0, final go6<? super jqc> go6) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object e0, final go6<?> go6) {
        final jqc jqc = new jqc(this.F0, this.G0, this.H0, (go6<? super jqc>)go6);
        jqc.E0 = e0;
        return (go6<fzv>)jqc;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((jqc)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
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
            final ppk ppk = (ppk)this.E0;
            final ftb<le1, go6<? super fzv>, Object> ftb = (ftb<le1, go6<? super fzv>, Object>)new ftb<le1, go6<? super fzv>, Object>(((go6)this).getContext(), this.F0, this.G0, this.H0, null) {
                public int E0;
                public Object F0;
                public final sx6 G0;
                public final cy6 H0;
                public final sth I0;
                public final puh<dqc> J0;
                
                public final go6<fzv> create(final Object f0, final go6<?> go6) {
                    final ftb<le1, go6<? super fzv>, Object> ftb = (ftb<le1, go6<? super fzv>, Object>)new ftb<le1, go6<? super fzv>, Object>(this.G0, this.H0, this.I0, this.J0, go6) {
                        public int E0;
                        public Object F0;
                        public final sx6 G0;
                        public final cy6 H0;
                        public final sth I0;
                        public final puh<dqc> J0;
                    };
                    ftb.F0 = f0;
                    return (go6<fzv>)ftb;
                }
                
                public final Object invoke(final Object o, final Object o2) {
                    return ((jqc$a)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
                }
                
                public final Object invokeSuspend(Object o) {
                    final dy6 d0 = dy6.D0;
                    final int e0 = this.E0;
                    while (true) {
                        dy6 dy6 = null;
                        ftb<le1, go6<? super fzv>, Object> ftb = null;
                        Label_0125: {
                            le1 f0;
                            ftb<le1, go6<? super fzv>, Object> ftb2;
                            dy6 dy7;
                            if (e0 != 0) {
                                if (e0 == 1) {
                                    f0 = (le1)this.F0;
                                    b1n.u(o);
                                    dy6 = d0;
                                    ftb = this;
                                    break Label_0125;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                b1n.u(o);
                                f0 = (le1)this.F0;
                                ftb2 = this;
                                dy7 = d0;
                            }
                            if (!b1n.n(ftb2.G0)) {
                                return fzv.a;
                            }
                            ftb2.F0 = f0;
                            ftb2.E0 = 1;
                            final Object d2 = g4k.d(f0, (bpk)null, (go6)ftb2, 1, (Object)null);
                            if (d2 == dy7) {
                                return dy7;
                            }
                            ftb = ftb2;
                            dy6 = dy7;
                            o = d2;
                        }
                        final int d3 = ((apk)o).d;
                        Objects.requireNonNull(cpk.Companion);
                        if (d3 == 4) {
                            as2.M(ftb.H0, (sx6)null, 0, (ftb)new ftb<cy6, go6<? super fzv>, Object>(ftb.I0, ftb.J0, null) {
                                public int D0;
                                public final sth E0;
                                public final puh<dqc> F0;
                                
                                public final go6<fzv> create(final Object o, final go6<?> go6) {
                                    return (go6<fzv>)new ftb<cy6, go6<? super fzv>, Object>(this.E0, this.F0, go6) {
                                        public int D0;
                                        public final sth E0;
                                        public final puh<dqc> F0;
                                    };
                                }
                                
                                public final Object invoke(final Object o, final Object o2) {
                                    return ((jqc$a$a)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
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
                                        final sth e0 = this.E0;
                                        final puh<dqc> f0 = this.F0;
                                        this.D0 = 1;
                                        if (mqc.a(e0, (puh)f0, (go6)this) == d0) {
                                            return d0;
                                        }
                                    }
                                    return fzv.a;
                                }
                            }, 3);
                        }
                        else if (d3 == 5) {
                            as2.M(ftb.H0, (sx6)null, 0, (ftb)new ftb<cy6, go6<? super fzv>, Object>(ftb.J0, ftb.I0, null) {
                                public int D0;
                                public final puh<dqc> E0;
                                public final sth F0;
                                
                                public final go6<fzv> create(final Object o, final go6<?> go6) {
                                    return (go6<fzv>)new ftb<cy6, go6<? super fzv>, Object>(this.E0, this.F0, go6) {
                                        public int D0;
                                        public final puh<dqc> E0;
                                        public final sth F0;
                                    };
                                }
                                
                                public final Object invoke(final Object o, final Object o2) {
                                    return ((jqc$a$b)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
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
                                        final puh<dqc> e0 = this.E0;
                                        final sth f0 = this.F0;
                                        this.D0 = 1;
                                        if (mqc.b((puh)e0, f0, (go6)this) == d0) {
                                            return d0;
                                        }
                                    }
                                    return fzv.a;
                                }
                            }, 3);
                        }
                        dy6 dy7 = dy6;
                        ftb<le1, go6<? super fzv>, Object> ftb2 = (ftb<le1, go6<? super fzv>, Object>)ftb;
                        continue;
                    }
                }
            };
            this.D0 = 1;
            if (ppk.Z((ftb)ftb, (go6)this) == d0) {
                return d0;
            }
        }
        return fzv.a;
    }
}
