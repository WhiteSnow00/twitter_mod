// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.foundation.HoverableKt$hoverable$2$2$1", f = "Hoverable.kt", l = { 88 }, m = "invokeSuspend")
public final class iqc extends p0s implements ftb<cy6, go6<? super fzv>, Object>
{
    public int D0;
    public final boolean E0;
    public final puh<dqc> F0;
    public final sth G0;
    
    public iqc(final boolean e0, final puh<dqc> f0, final sth g0, final go6<? super iqc> go6) {
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new iqc(this.E0, this.F0, this.G0, (go6<? super iqc>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((iqc)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
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
            if (!this.E0) {
                final puh<dqc> f0 = this.F0;
                final sth g0 = this.G0;
                this.D0 = 1;
                if (mqc.b((puh)f0, g0, (go6)this) == d0) {
                    return d0;
                }
            }
        }
        return fzv.a;
    }
}
