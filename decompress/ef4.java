// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1", f = "Clickable.kt", l = { 549 }, m = "invokeSuspend")
public final class ef4 extends l1s implements hub<iz6, mp6<? super vzv>, Object>
{
    public int F0;
    public final iuh G0;
    public final sxk H0;
    
    public ef4(final iuh g0, final sxk h0, final mp6<? super ef4> mp6) {
        this.G0 = g0;
        this.H0 = h0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new ef4(this.G0, this.H0, (mp6<? super ef4>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((ef4)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
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
            final iuh g0 = this.G0;
            final txk txk = new txk(this.H0);
            this.F0 = 1;
            if (g0.a((fvd)txk, (mp6)this) == f0) {
                return f0;
            }
        }
        return vzv.a;
    }
}
