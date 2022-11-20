// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2", f = "BringIntoViewResponder.kt", l = { 284 }, m = "invokeSuspend")
public final class ke2 extends p0s implements ftb<cy6, go6<? super fzv>, Object>
{
    public int D0;
    public Object E0;
    public final je2 F0;
    public final eve G0;
    public final c6m H0;
    public final c6m I0;
    
    public ke2(final je2 f0, final eve g0, final c6m h0, final c6m i0, final go6<? super ke2> go6) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object e0, final go6<?> go6) {
        final ke2 ke2 = new ke2(this.F0, this.G0, this.H0, this.I0, (go6<? super ke2>)go6);
        ke2.E0 = e0;
        return (go6<fzv>)ke2;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((ke2)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
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
            as2.M((cy6)this.E0, (sx6)null, 0, (ftb)new ftb<cy6, go6<? super fzv>, Object>(this.F0, this.H0, null) {
                public int D0;
                public final je2 E0;
                public final c6m F0;
                
                public final go6<fzv> create(final Object o, final go6<?> go6) {
                    return (go6<fzv>)new ftb<cy6, go6<? super fzv>, Object>(this.E0, this.F0, go6) {
                        public int D0;
                        public final je2 E0;
                        public final c6m F0;
                    };
                }
                
                public final Object invoke(final Object o, final Object o2) {
                    return ((ke2$a)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
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
                        final he2 g0 = this.E0.G0;
                        if (g0 == null) {
                            czd.m("responder");
                            throw null;
                        }
                        final ke2$a$a ke2$a$a = new ke2$a$a(this.F0);
                        this.D0 = 1;
                        if (g0.b((nsb<c6m>)ke2$a$a, (go6<? super fzv>)this) == d0) {
                            return d0;
                        }
                    }
                    return fzv.a;
                }
            }, 3);
            final je2 f0 = this.F0;
            zd2 zd2;
            if ((zd2 = f0.E0) == null) {
                zd2 = f0.D0;
            }
            final eve g0 = this.G0;
            final ke2$b ke2$b = new ke2$b(this.I0);
            this.D0 = 1;
            if (zd2.a(g0, (nsb)ke2$b, (go6)this) == d0) {
                return d0;
            }
        }
        return fzv.a;
    }
}
