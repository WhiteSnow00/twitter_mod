import android.view.ViewGroup;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = { 406, 408 }, m = "invokeSuspend")
public final class i8x extends ksm implements ftb<bkp<? super View>, go6<? super fzv>, Object>
{
    public int E0;
    public Object F0;
    public final View G0;
    
    public i8x(final View g0, final go6<? super i8x> go6) {
        this.G0 = g0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object f0, final go6<?> go6) {
        final i8x i8x = new i8x(this.G0, (go6<? super i8x>)go6);
        i8x.F0 = f0;
        return (go6<fzv>)i8x;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((i8x)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final dy6 d0 = dy6.D0;
        final int e0 = this.E0;
        if (e0 != 0) {
            if (e0 != 1) {
                if (e0 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b1n.u(o);
            }
            else {
                final bkp bkp = (bkp)this.F0;
                b1n.u(o);
                final View g0 = this.G0;
                if (g0 instanceof ViewGroup) {
                    final xjp<View> c = r7x.c((ViewGroup)g0);
                    this.F0 = null;
                    this.E0 = 2;
                    if (bkp.c((xjp)c, (go6)this) == d0) {
                        return d0;
                    }
                }
            }
            return fzv.a;
        }
        b1n.u(o);
        final bkp f0 = (bkp)this.F0;
        final View g2 = this.G0;
        this.F0 = f0;
        this.E0 = 1;
        f0.a((Object)g2, (go6)this);
        return d0;
    }
}
