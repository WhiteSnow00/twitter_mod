// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3", f = "ProduceState.kt", l = { 153 }, m = "invokeSuspend")
public final class kiq extends p0s implements ftb<cy6, go6<? super fzv>, Object>
{
    public int D0;
    public Object E0;
    public final ftb<w0l<Object>, go6<? super fzv>, Object> F0;
    public final puh<Object> G0;
    
    public kiq(final ftb<? super w0l<Object>, ? super go6<? super fzv>, ?> f0, final puh<Object> g0, final go6<? super kiq> go6) {
        this.F0 = (ftb<w0l<Object>, go6<? super fzv>, Object>)f0;
        this.G0 = g0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object e0, final go6<?> go6) {
        final kiq kiq = new kiq(this.F0, this.G0, (go6<? super kiq>)go6);
        kiq.E0 = e0;
        return (go6<fzv>)kiq;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((kiq)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
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
            final cy6 cy6 = (cy6)this.E0;
            final ftb<w0l<Object>, go6<? super fzv>, Object> f0 = this.F0;
            final x0l x0l = new x0l((puh)this.G0, cy6.A());
            this.D0 = 1;
            if (f0.invoke((Object)x0l, (Object)this) == d0) {
                return d0;
            }
        }
        return fzv.a;
    }
}
