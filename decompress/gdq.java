// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.animation.SizeAnimationModifier$animateTo$data$1$1", f = "AnimationModifier.kt", l = { 124 }, m = "invokeSuspend")
public final class gdq extends p0s implements ftb<cy6, go6<? super fzv>, Object>
{
    public int D0;
    public final fdq.a E0;
    public final long F0;
    public final fdq G0;
    
    public gdq(final fdq.a e0, final long f0, final fdq g0, final go6<? super gdq> go6) {
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new gdq(this.E0, this.F0, this.G0, (go6<? super gdq>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((gdq)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
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
            final b80<ltd, ic0> a = this.E0.a;
            final ltd ltd = new ltd(this.F0);
            final zb0 d3 = this.G0.D0;
            this.D0 = 1;
            if ((c = b80.c((b80)a, (Object)ltd, d3, (qsb)null, (go6)this, 12)) == d0) {
                return d0;
            }
        }
        final xb0 xb0 = (xb0)c;
        if (xb0.b == 2) {
            final ftb f0 = this.G0.F0;
            if (f0 != null) {
                f0.invoke((Object)new ltd(this.E0.b), xb0.a.getValue());
            }
        }
        return fzv.a;
    }
}
