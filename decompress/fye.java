// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$getAnimatedOffset$1", f = "LazyGridItemPlacementAnimator.kt", l = { 321 }, m = "invokeSuspend")
public final class fye extends l1s implements hub<iz6, mp6<? super vzv>, Object>
{
    public int F0;
    public final lhk G0;
    
    public fye(final lhk g0, final mp6<? super fye> mp6) {
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new fye(this.G0, (mp6<? super fye>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((fye)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final jz6 f0 = jz6.F0;
        final int f2 = this.F0;
        if (f2 != 0) {
            if (f2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jb2.M0(o);
        }
        else {
            jb2.M0(o);
            final lhk g0 = this.G0;
            final b80 b = g0.b;
            final hud hud = new hud(g0.c);
            this.F0 = 1;
            if (b.g((Object)hud, (mp6)this) == f0) {
                return f0;
            }
        }
        this.G0.a(false);
        return vzv.a;
    }
}
