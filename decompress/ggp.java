import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1", f = "SelectionManager.kt", l = { 630 }, m = "invokeSuspend")
public final class ggp extends l1s implements hub<bqk, mp6<? super vzv>, Object>
{
    public int F0;
    public Object G0;
    public final zfp H0;
    public final ptb<vzv> I0;
    
    public ggp(final zfp h0, final ptb<vzv> i0, final mp6<? super ggp> mp6) {
        this.H0 = h0;
        this.I0 = i0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object g0, final mp6<?> mp6) {
        final ggp ggp = new ggp(this.H0, this.I0, (mp6<? super ggp>)mp6);
        ggp.G0 = g0;
        return (mp6<vzv>)ggp;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((ggp)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
    }
    
    public final Object invokeSuspend(Object o) {
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
            final bqk bqk = (bqk)this.G0;
            final zfp h0 = this.H0;
            final ggp$a ggp$a = new ggp$a((ptb)this.I0);
            this.F0 = 1;
            Objects.requireNonNull(h0);
            o = xlb.b(bqk, (hub)new agp((stb)ggp$a, (mp6)null), (mp6)this);
            if (o != f0) {
                o = vzv.a;
            }
            if (o == f0) {
                return f0;
            }
        }
        return vzv.a;
    }
}
