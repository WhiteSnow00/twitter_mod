import java.util.Objects;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "androidx.compose.material.SwipeableKt$swipeable$3$3", f = "Swipeable.kt", l = { 607 }, m = "invokeSuspend")
public final class c3s extends l1s implements hub<iz6, mp6<? super vzv>, Object>
{
    public int F0;
    public final o3s<Object> G0;
    public final Map<Float, Object> H0;
    public final wqm I0;
    public final rp8 J0;
    public final hub<Object, Object, ros> K0;
    public final float L0;
    
    public c3s(final o3s<Object> g0, final Map<Float, Object> h0, final wqm i0, final rp8 j0, final hub<Object, Object, ? extends ros> k0, final float l0, final mp6<? super c3s> mp6) {
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = (hub<Object, Object, ros>)k0;
        this.L0 = l0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new c3s(this.G0, this.H0, this.I0, this.J0, this.K0, this.L0, (mp6<? super c3s>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((c3s)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
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
            final Map e = this.G0.e();
            final o3s<Object> g0 = this.G0;
            final Map<Float, Object> h0 = this.H0;
            Objects.requireNonNull(g0);
            e0e.f((Object)h0, "<set-?>");
            ((cjq<Map<Float, Object>>)g0.i).setValue(h0);
            ((cjq<wqm>)this.G0.o).setValue(this.I0);
            final o3s<Object> g2 = this.G0;
            final c3s$a value = new c3s$a((Map)this.H0, (hub)this.K0, this.J0);
            Objects.requireNonNull(g2);
            ((cjq<c3s$a>)g2.m).setValue(value);
            ((cjq<Float>)this.G0.n).setValue(Float.valueOf(this.J0.t0(this.L0)));
            final o3s<Object> g3 = this.G0;
            final Map<Float, Object> h2 = this.H0;
            this.F0 = 1;
            if (g3.g(e, (Map)h2, (mp6)this) == f0) {
                return f0;
            }
        }
        return vzv.a;
    }
}
