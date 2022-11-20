import java.util.Objects;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.material.SwipeableKt$swipeable$3$3", f = "Swipeable.kt", l = { 607 }, m = "invokeSuspend")
public final class h2s extends p0s implements ftb<cy6, go6<? super fzv>, Object>
{
    public int D0;
    public final u2s<Object> E0;
    public final Map<Float, Object> F0;
    public final iqm G0;
    public final lo8 H0;
    public final ftb<Object, Object, yns> I0;
    public final float J0;
    
    public h2s(final u2s<Object> e0, final Map<Float, Object> f0, final iqm g0, final lo8 h0, final ftb<Object, Object, ? extends yns> i0, final float j0, final go6<? super h2s> go6) {
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = (ftb<Object, Object, yns>)i0;
        this.J0 = j0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new h2s(this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, (go6<? super h2s>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((h2s)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
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
            final Map e = this.E0.e();
            final u2s<Object> e2 = this.E0;
            final Map<Float, Object> f0 = this.F0;
            Objects.requireNonNull(e2);
            czd.f((Object)f0, "<set-?>");
            e2.i.setValue((Object)f0);
            this.E0.o.setValue((Object)this.G0);
            final u2s<Object> e3 = this.E0;
            final h2s$a value = new h2s$a((Map)this.F0, (ftb)this.I0, this.H0);
            Objects.requireNonNull(e3);
            e3.m.setValue((Object)value);
            this.E0.n.setValue((Object)this.H0.t0(this.J0));
            final u2s<Object> e4 = this.E0;
            final Map<Float, Object> f2 = this.F0;
            this.D0 = 1;
            if (e4.g(e, (Map)f2, (go6)this) == d0) {
                return d0;
            }
        }
        return fzv.a;
    }
}
