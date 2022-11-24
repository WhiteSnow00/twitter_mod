// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "com.google.accompanist.swiperefresh.SwipeRefreshState$animateOffsetTo$2", f = "SwipeRefresh.kt", l = { 104 }, m = "invokeSuspend")
public final class j2s extends l1s implements stb<mp6<? super yb0<Float, ic0>>, Object>
{
    public int F0;
    public final l2s G0;
    public final float H0;
    
    public j2s(final l2s g0, final float h0, final mp6<? super j2s> mp6) {
        this.G0 = g0;
        this.H0 = h0;
        super(1, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final mp6<?> mp6) {
        return (mp6<vzv>)new j2s(this.G0, this.H0, (mp6<? super j2s>)mp6);
    }
    
    public final Object invoke(final Object o) {
        return ((j2s)this.create((mp6<?>)o)).invokeSuspend(vzv.a);
    }
    
    public final Object invokeSuspend(Object c) {
        final jz6 f0 = jz6.F0;
        final int f2 = this.F0;
        if (f2 != 0) {
            if (f2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jb2.M0(c);
        }
        else {
            jb2.M0(c);
            final b80 a = this.G0.a;
            final Float n = new Float(this.H0);
            this.F0 = 1;
            if ((c = b80.c(a, (Object)n, (ac0)null, (stb)null, (mp6)this, 14)) == f0) {
                return f0;
            }
        }
        return c;
    }
}
