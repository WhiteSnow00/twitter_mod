// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", l = { 65, 66 }, m = "invokeSuspend")
public final class liq extends p0s implements ftb<w0l<Object>, go6<? super fzv>, Object>
{
    public int D0;
    public Object E0;
    public final sx6 F0;
    public final d7b<Object> G0;
    
    public liq(final sx6 f0, final d7b<Object> g0, final go6<? super liq> go6) {
        this.F0 = f0;
        this.G0 = g0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object e0, final go6<?> go6) {
        final liq liq = new liq(this.F0, this.G0, (go6<? super liq>)go6);
        liq.E0 = e0;
        return (go6<fzv>)liq;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((liq)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final dy6 d0 = dy6.D0;
        final int d2 = this.D0;
        if (d2 != 0) {
            if (d2 != 1 && d2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b1n.u(o);
        }
        else {
            b1n.u(o);
            final w0l w0l = (w0l)this.E0;
            if (czd.a((Object)this.F0, (Object)u1a.D0)) {
                final d7b<Object> g0 = this.G0;
                final liq$a liq$a = new liq$a(w0l);
                this.D0 = 1;
                if (g0.b((e7b)liq$a, (go6)this) == d0) {
                    return d0;
                }
            }
            else {
                final sx6 f0 = this.F0;
                final ftb<cy6, go6<? super fzv>, Object> ftb = (ftb<cy6, go6<? super fzv>, Object>)new ftb<cy6, go6<? super fzv>, Object>(this.G0, w0l, null) {
                    public int D0;
                    public final d7b<Object> E0;
                    public final w0l<Object> F0;
                    
                    public final go6<fzv> create(final Object o, final go6<?> go6) {
                        return (go6<fzv>)new ftb<cy6, go6<? super fzv>, Object>(this.E0, this.F0, go6) {
                            public int D0;
                            public final d7b<Object> E0;
                            public final w0l<Object> F0;
                        };
                    }
                    
                    public final Object invoke(final Object o, final Object o2) {
                        return ((liq$b)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
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
                            final d7b<Object> e0 = this.E0;
                            final liq$b$a liq$b$a = new liq$b$a((w0l)this.F0);
                            this.D0 = 1;
                            if (e0.b((e7b)liq$b$a, (go6)this) == d0) {
                                return d0;
                            }
                        }
                        return fzv.a;
                    }
                };
                this.D0 = 2;
                if (as2.X(f0, (ftb)ftb, (go6)this) == d0) {
                    return d0;
                }
            }
        }
        return fzv.a;
    }
}
