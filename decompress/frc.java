import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1$1", f = "HoverInteraction.kt", l = { 69 }, m = "invokeSuspend")
public final class frc extends l1s implements hub<iz6, mp6<? super vzv>, Object>
{
    public int F0;
    public final hvd G0;
    public final fvh<Boolean> H0;
    
    public frc(final hvd g0, final fvh<Boolean> h0, final mp6<? super frc> mp6) {
        this.G0 = g0;
        this.H0 = h0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new frc(this.G0, this.H0, (mp6<? super frc>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((frc)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
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
            final ArrayList list = new ArrayList();
            final e8b b = this.G0.b();
            final frc$a frc$a = new frc$a((List)list, (fvh)this.H0);
            this.F0 = 1;
            if (b.b((f8b)frc$a, (mp6)this) == f0) {
                return f0;
            }
        }
        return vzv.a;
    }
}
