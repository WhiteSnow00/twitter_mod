// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "androidx.compose.foundation.HoverableKt$hoverable$2$2$1", f = "Hoverable.kt", l = { 88 }, m = "invokeSuspend")
public final class irc extends l1s implements hub<iz6, mp6<? super vzv>, Object>
{
    public int F0;
    public final boolean G0;
    public final fvh<drc> H0;
    public final iuh I0;
    
    public irc(final boolean g0, final fvh<drc> h0, final iuh i0, final mp6<? super irc> mp6) {
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new irc(this.G0, this.H0, this.I0, (mp6<? super irc>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((irc)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
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
            if (!this.G0) {
                final fvh<drc> h0 = this.H0;
                final iuh i0 = this.I0;
                this.F0 = 1;
                if (mrc.b((fvh)h0, i0, (mp6)this) == f0) {
                    return f0;
                }
            }
        }
        return vzv.a;
    }
}
