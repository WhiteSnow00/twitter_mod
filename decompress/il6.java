// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.foundation.gestures.ContentInViewModifier$onSizeChanged$1", f = "ContentInViewModifier.kt", l = { 195 }, m = "invokeSuspend")
public final class il6 extends p0s implements ftb<cy6, go6<? super fzv>, Object>
{
    public int D0;
    public Object E0;
    public final hl6 F0;
    public final c6m G0;
    public final c6m H0;
    
    public il6(final hl6 f0, final c6m g0, final c6m h0, final go6<? super il6> go6) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object e0, final go6<?> go6) {
        final il6 il6 = new il6(this.F0, this.G0, this.H0, (go6<? super il6>)go6);
        il6.E0 = e0;
        return (go6<fzv>)il6;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((il6)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
    }
    
    public final Object invokeSuspend(Object o) {
        final dy6 d0 = dy6.D0;
        final int d2 = this.D0;
        Object o2 = null;
        Label_0123: {
            if (d2 != 0) {
                if (d2 == 1) {
                    o2 = this.E0;
                    try {
                        b1n.u(o);
                        break Label_0123;
                    }
                    finally {
                        break Label_0123;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b1n.u(o);
            o = as2.M((cy6)this.E0, (sx6)null, 0, (ftb)new ftb<cy6, go6<? super fzv>, Object>(this.F0, this.G0, this.H0, null) {
                public int D0;
                public final hl6 E0;
                public final c6m F0;
                public final c6m G0;
                
                public final go6<fzv> create(final Object o, final go6<?> go6) {
                    return (go6<fzv>)new ftb<cy6, go6<? super fzv>, Object>(this.E0, this.F0, this.G0, go6) {
                        public int D0;
                        public final hl6 E0;
                        public final c6m F0;
                        public final c6m G0;
                    };
                }
                
                public final Object invoke(final Object o, final Object o2) {
                    return ((il6$a)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
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
                        final hl6 e0 = this.E0;
                        final c6m f0 = this.F0;
                        final c6m g0 = this.G0;
                        this.D0 = 1;
                        if (e0.f(f0, g0, (go6)this) == d0) {
                            return d0;
                        }
                    }
                    return fzv.a;
                }
            }, 3);
            this.F0.M0 = (k9e)o;
            try {
                this.E0 = o;
                this.D0 = 1;
                if (((s9e)o).h((go6)this) == d0) {
                    return d0;
                }
                o2 = o;
                o = this.F0;
                if (((hl6)o).M0 == o2) {
                    ((hl6)o).K0 = null;
                    ((hl6)o).L0.setValue((Object)null);
                    this.F0.M0 = null;
                }
                return fzv.a;
            }
            finally {
                o2 = o;
                final Throwable t;
                o = t;
            }
        }
        final hl6 f0 = this.F0;
        if (f0.M0 == o2) {
            f0.K0 = null;
            f0.L0.setValue((Object)null);
            this.F0.M0 = null;
        }
        throw o;
    }
}
