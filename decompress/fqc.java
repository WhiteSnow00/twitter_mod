import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1$1", f = "HoverInteraction.kt", l = { 69 }, m = "invokeSuspend")
public final class fqc extends p0s implements ftb<cy6, go6<? super fzv>, Object>
{
    public int D0;
    public final fud E0;
    public final puh<Boolean> F0;
    
    public fqc(final fud e0, final puh<Boolean> f0, final go6<? super fqc> go6) {
        this.E0 = e0;
        this.F0 = f0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new fqc(this.E0, this.F0, (go6<? super fqc>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((fqc)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
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
            final ArrayList list = new ArrayList();
            final d7b b = this.E0.b();
            final fqc$a fqc$a = new fqc$a((List)list, (puh)this.F0);
            this.D0 = 1;
            if (b.b((e7b)fqc$a, (go6)this) == d0) {
                return d0;
            }
        }
        return fzv.a;
    }
}
