// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.google.accompanist.swiperefresh.SwipeRefreshState$animateOffsetTo$2", f = "SwipeRefresh.kt", l = { 104 }, m = "invokeSuspend")
public final class n1s extends p0s implements qsb<go6<? super xb0<Float, hc0>>, Object>
{
    public int D0;
    public final p1s E0;
    public final float F0;
    
    public n1s(final p1s e0, final float f0, final go6<? super n1s> go6) {
        this.E0 = e0;
        this.F0 = f0;
        super(1, (go6)go6);
    }
    
    public final go6<fzv> create(final go6<?> go6) {
        return (go6<fzv>)new n1s(this.E0, this.F0, (go6<? super n1s>)go6);
    }
    
    public final Object invoke(final Object o) {
        return ((n1s)this.create((go6<?>)o)).invokeSuspend(fzv.a);
    }
    
    public final Object invokeSuspend(Object c) {
        final dy6 d0 = dy6.D0;
        final int d2 = this.D0;
        if (d2 != 0) {
            if (d2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b1n.u(c);
        }
        else {
            b1n.u(c);
            final b80 a = this.E0.a;
            final Float n = new Float(this.F0);
            this.D0 = 1;
            if ((c = b80.c(a, (Object)n, (zb0)null, (qsb)null, (go6)this, 14)) == d0) {
                return d0;
            }
        }
        return c;
    }
}
