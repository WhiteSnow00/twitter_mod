// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1", f = "LazyLayoutSemantics.kt", l = { 76 }, m = "invokeSuspend")
public final class g0f extends p0s implements ftb<cy6, go6<? super fzv>, Object>
{
    public int D0;
    public final d0f E0;
    public final float F0;
    
    public g0f(final d0f e0, final float f0, final go6<? super g0f> go6) {
        this.E0 = e0;
        this.F0 = f0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new g0f(this.E0, this.F0, (go6<? super g0f>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((g0f)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
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
            final d0f e0 = this.E0;
            final float f0 = this.F0;
            this.D0 = 1;
            if (e0.d(f0, (go6)this) == d0) {
                return d0;
            }
        }
        return fzv.a;
    }
}
