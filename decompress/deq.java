// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "androidx.compose.animation.SizeAnimationModifier$animateTo$data$1$1", f = "AnimationModifier.kt", l = { 124 }, m = "invokeSuspend")
public final class deq extends l1s implements hub<iz6, mp6<? super vzv>, Object>
{
    public int F0;
    public final ceq.a G0;
    public final long H0;
    public final ceq I0;
    
    public deq(final ceq.a g0, final long h0, final ceq i0, final mp6<? super deq> mp6) {
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new deq(this.G0, this.H0, this.I0, (mp6<? super deq>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((deq)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
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
            final b80<nud, jc0> a = this.G0.a;
            final nud nud = new nud(this.H0);
            final ac0<nud> f3 = this.I0.F0;
            this.F0 = 1;
            if ((c = b80.c((b80)a, (Object)nud, (ac0)f3, (stb)null, (mp6)this, 12)) == f0) {
                return f0;
            }
        }
        final yb0 yb0 = (yb0)c;
        if (yb0.b == 2) {
            final hub<? super nud, ? super nud, vzv> h0 = this.I0.H0;
            if (h0 != null) {
                h0.invoke((Object)new nud(this.G0.b), yb0.a.getValue());
            }
        }
        return vzv.a;
    }
}
