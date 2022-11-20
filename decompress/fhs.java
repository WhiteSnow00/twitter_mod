// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", f = "TextFieldPressGestureFilter.kt", l = { 55 }, m = "invokeSuspend")
public final class fhs extends p0s implements ftb<ppk, go6<? super fzv>, Object>
{
    public int D0;
    public Object E0;
    public final cy6 F0;
    public final puh<bxk> G0;
    public final sth H0;
    public final m8r<qsb<wfj, fzv>> I0;
    
    public fhs(final cy6 f0, final puh<bxk> g0, final sth h0, final m8r<? extends qsb<? super wfj, fzv>> i0, final go6<? super fhs> go6) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = (m8r<qsb<wfj, fzv>>)i0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object e0, final go6<?> go6) {
        final fhs fhs = new fhs(this.F0, this.G0, this.H0, this.I0, (go6<? super fhs>)go6);
        fhs.E0 = e0;
        return (go6<fzv>)fhs;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((fhs)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
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
            final itb<ywk, wfj, go6<? super fzv>, Object> itb = (itb<ywk, wfj, go6<? super fzv>, Object>)new itb<ywk, wfj, go6<? super fzv>, Object>(this.F0, this.G0, this.H0, null) {
                public int D0;
                public ywk E0;
                public long F0;
                public final cy6 G0;
                public final puh<bxk> H0;
                public final sth I0;
                
                public final Object h0(final Object o, final Object o2, final Object o3) {
                    final ywk e0 = (ywk)o;
                    final long a = ((wfj)o2).a;
                    final itb<ywk, wfj, go6<? super fzv>, Object> itb = (itb<ywk, wfj, go6<? super fzv>, Object>)new itb<ywk, wfj, go6<? super fzv>, Object>(this.G0, this.H0, this.I0, (go6)o3) {
                        public int D0;
                        public ywk E0;
                        public long F0;
                        public final cy6 G0;
                        public final puh<bxk> H0;
                        public final sth I0;
                    };
                    itb.E0 = e0;
                    itb.F0 = a;
                    return itb.invokeSuspend(fzv.a);
                }
                
                public final Object invokeSuspend(Object f) {
                    final dy6 d0 = dy6.D0;
                    final int d2 = this.D0;
                    if (d2 != 0) {
                        if (d2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        b1n.u(f);
                    }
                    else {
                        b1n.u(f);
                        final ywk e0 = this.E0;
                        as2.M(this.G0, (sx6)null, 0, (ftb)new ftb<cy6, go6<? super fzv>, Object>(this.H0, this.F0, this.I0, null) {
                            public Object D0;
                            public int E0;
                            public final puh<bxk> F0;
                            public final long G0;
                            public final sth H0;
                            
                            public final go6<fzv> create(final Object o, final go6<?> go6) {
                                return (go6<fzv>)new ftb<cy6, go6<? super fzv>, Object>(this.F0, this.G0, this.H0, go6) {
                                    public Object D0;
                                    public int E0;
                                    public final puh<bxk> F0;
                                    public final long G0;
                                    public final sth H0;
                                };
                            }
                            
                            public final Object invoke(final Object o, final Object o2) {
                                return ((fhs$a$a)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
                            }
                            
                            public final Object invokeSuspend(Object value) {
                                final dy6 d0 = dy6.D0;
                                final int e0 = this.E0;
                                Label_0208: {
                                    Label_0154: {
                                        puh puh2 = null;
                                        Label_0147: {
                                            puh f0;
                                            if (e0 != 0) {
                                                if (e0 != 1) {
                                                    if (e0 == 2) {
                                                        final bxk bxk = (bxk)this.D0;
                                                        b1n.u(value);
                                                        value = bxk;
                                                        break Label_0208;
                                                    }
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                else {
                                                    final puh puh = (puh)this.D0;
                                                    b1n.u(value);
                                                    f0 = puh;
                                                }
                                            }
                                            else {
                                                b1n.u(value);
                                                final bxk bxk2 = (bxk)this.F0.getValue();
                                                if (bxk2 == null) {
                                                    break Label_0154;
                                                }
                                                final sth h0 = this.H0;
                                                f0 = this.F0;
                                                final axk axk = new axk(bxk2);
                                                puh2 = f0;
                                                if (h0 == null) {
                                                    break Label_0147;
                                                }
                                                this.D0 = f0;
                                                this.E0 = 1;
                                                if (h0.a((dud)axk, (go6)this) == d0) {
                                                    return d0;
                                                }
                                            }
                                            puh2 = f0;
                                        }
                                        puh2.setValue((Object)null);
                                    }
                                    final dud d2 = new bxk(this.G0);
                                    final sth h2 = this.H0;
                                    value = d2;
                                    if (h2 != null) {
                                        this.D0 = d2;
                                        this.E0 = 2;
                                        if (h2.a(d2, (go6)this) == d0) {
                                            return d0;
                                        }
                                        value = d2;
                                    }
                                }
                                this.F0.setValue(value);
                                return fzv.a;
                            }
                        }, 3);
                        this.D0 = 1;
                        if ((f = e0.F((go6)this)) == d0) {
                            return d0;
                        }
                    }
                    as2.M(this.G0, (sx6)null, 0, (ftb)new ftb<cy6, go6<? super fzv>, Object>(this.H0, (boolean)f, this.I0, null) {
                        public puh D0;
                        public int E0;
                        public final puh<bxk> F0;
                        public final boolean G0;
                        public final sth H0;
                        
                        public final go6<fzv> create(final Object o, final go6<?> go6) {
                            return (go6<fzv>)new ftb<cy6, go6<? super fzv>, Object>(this.F0, this.G0, this.H0, go6) {
                                public puh D0;
                                public int E0;
                                public final puh<bxk> F0;
                                public final boolean G0;
                                public final sth H0;
                            };
                        }
                        
                        public final Object invoke(final Object o, final Object o2) {
                            return ((fhs$a$b)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
                        }
                        
                        public final Object invokeSuspend(final Object o) {
                            final dy6 d0 = dy6.D0;
                            final int e0 = this.E0;
                            puh puh = null;
                            Label_0152: {
                                puh f0;
                                if (e0 != 0) {
                                    if (e0 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    final puh d2 = this.D0;
                                    b1n.u(o);
                                    f0 = d2;
                                }
                                else {
                                    b1n.u(o);
                                    final bxk bxk = (bxk)this.F0.getValue();
                                    if (bxk == null) {
                                        return fzv.a;
                                    }
                                    final boolean g0 = this.G0;
                                    final sth h0 = this.H0;
                                    f0 = this.F0;
                                    Object o2;
                                    if (g0) {
                                        o2 = new cxk(bxk);
                                    }
                                    else {
                                        o2 = new axk(bxk);
                                    }
                                    puh = f0;
                                    if (h0 == null) {
                                        break Label_0152;
                                    }
                                    this.D0 = f0;
                                    this.E0 = 1;
                                    if (h0.a((dud)o2, (go6)this) == d0) {
                                        return d0;
                                    }
                                }
                                puh = f0;
                            }
                            puh.setValue((Object)null);
                            return fzv.a;
                        }
                    }, 3);
                    return fzv.a;
                }
            };
            final fhs$b fhs$b = new fhs$b((m8r)this.I0);
            this.D0 = 1;
            if (yas.d(ppk, (itb<? super ywk, ? super wfj, ? super go6<? super fzv>, ?>)itb, (qsb<? super wfj, fzv>)fhs$b, (go6<? super fzv>)this) == d0) {
                return d0;
            }
        }
        return fzv.a;
    }
}
