import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1", f = "SelectionManager.kt", l = { 630 }, m = "invokeSuspend")
public final class jfp extends p0s implements ftb<ppk, go6<? super fzv>, Object>
{
    public int D0;
    public Object E0;
    public final cfp F0;
    public final nsb<fzv> G0;
    
    public jfp(final cfp f0, final nsb<fzv> g0, final go6<? super jfp> go6) {
        this.F0 = f0;
        this.G0 = g0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object e0, final go6<?> go6) {
        final jfp jfp = new jfp(this.F0, this.G0, (go6<? super jfp>)go6);
        jfp.E0 = e0;
        return (go6<fzv>)jfp;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((jfp)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
    }
    
    public final Object invokeSuspend(Object o) {
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
            final ppk ppk = (ppk)this.E0;
            final cfp f0 = this.F0;
            final jfp$a jfp$a = new jfp$a((nsb)this.G0);
            this.D0 = 1;
            Objects.requireNonNull(f0);
            o = wkb.b(ppk, (ftb)new dfp((qsb)jfp$a, (go6)null), (go6)this);
            if (o != d0) {
                o = fzv.a;
            }
            if (o == d0) {
                return d0;
            }
        }
        return fzv.a;
    }
}
