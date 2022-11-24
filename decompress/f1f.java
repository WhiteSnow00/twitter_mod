// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2", f = "LazyLayoutSemantics.kt", l = { 92 }, m = "invokeSuspend")
public final class f1f extends l1s implements hub<iz6, mp6<? super vzv>, Object>
{
    public int F0;
    public final a1f G0;
    public final int H0;
    
    public f1f(final a1f g0, final int h0, final mp6<? super f1f> mp6) {
        this.G0 = g0;
        this.H0 = h0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new f1f(this.G0, this.H0, (mp6<? super f1f>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((f1f)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
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
            final a1f g0 = this.G0;
            final int h0 = this.H0;
            this.F0 = 1;
            if (g0.b(h0, (mp6)this) == f0) {
                return f0;
            }
        }
        return vzv.a;
    }
}
