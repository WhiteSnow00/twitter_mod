// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$getAnimatedOffset$1", f = "LazyGridItemPlacementAnimator.kt", l = { 321 }, m = "invokeSuspend")
public final class ixe extends p0s implements ftb<cy6, go6<? super fzv>, Object>
{
    public int D0;
    public final xgk E0;
    
    public ixe(final xgk e0, final go6<? super ixe> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new ixe(this.E0, (go6<? super ixe>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((ixe)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
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
            final xgk e0 = this.E0;
            final b80 b = e0.b;
            final ftd ftd = new ftd(e0.c);
            this.D0 = 1;
            if (b.g((Object)ftd, (go6)this) == d0) {
                return d0;
            }
        }
        this.E0.a(false);
        return fzv.a;
    }
}
