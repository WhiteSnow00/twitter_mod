// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "androidx.compose.foundation.FocusableKt$focusable$2$2$1", f = "Focusable.kt", l = { 105 }, m = "invokeSuspend")
public final class dgb extends l1s implements hub<iz6, mp6<? super vzv>, Object>
{
    public fvh F0;
    public int G0;
    public final fvh<yeb> H0;
    public final iuh I0;
    
    public dgb(final fvh<yeb> h0, final iuh i0, final mp6<? super dgb> mp6) {
        this.H0 = h0;
        this.I0 = i0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new dgb(this.H0, this.I0, (mp6<? super dgb>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((dgb)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final jz6 f0 = jz6.F0;
        final int g0 = this.G0;
        fvh fvh = null;
        Label_0122: {
            fvh h0;
            if (g0 != 0) {
                if (g0 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                final fvh f2 = this.F0;
                jb2.M0(o);
                h0 = f2;
            }
            else {
                jb2.M0(o);
                final yeb yeb = (yeb)this.H0.getValue();
                if (yeb == null) {
                    return vzv.a;
                }
                final iuh i0 = this.I0;
                h0 = this.H0;
                final zeb zeb = new zeb(yeb);
                fvh = h0;
                if (i0 == null) {
                    break Label_0122;
                }
                this.F0 = h0;
                this.G0 = 1;
                if (i0.a((fvd)zeb, (mp6)this) == f0) {
                    return f0;
                }
            }
            fvh = h0;
        }
        fvh.setValue((Object)null);
        return vzv.a;
    }
}
