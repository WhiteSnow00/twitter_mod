import java.util.concurrent.CancellationException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = { 305 }, m = "invokeSuspend")
public final class b80 extends xzr implements rtb<ap6<? super bc0<Object, oc0>>, Object>
{
    public ec0 C0;
    public x6m D0;
    public int E0;
    public final /* synthetic */ c80<Object, oc0> F0;
    public final /* synthetic */ Object G0;
    public final /* synthetic */ hb0<Object, oc0> H0;
    public final /* synthetic */ long I0;
    public final /* synthetic */ rtb<c80<Object, oc0>, oyv> J0;
    
    public b80(final c80<Object, oc0> f0, final Object g0, final hb0<Object, oc0> h0, final long i0, final rtb<? super c80<Object, oc0>, oyv> j0, final ap6<? super b80> ap6) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = (rtb<c80<Object, oc0>, oyv>)j0;
        super(1, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final ap6<?> ap6) {
        return (ap6<oyv>)new b80(this.F0, this.G0, this.H0, this.I0, this.J0, (ap6<? super b80>)ap6);
    }
    
    public final Object invoke(final Object o) {
        return ((b80)this.create((ap6<?>)o)).invokeSuspend(oyv.a);
    }
    
    public final Object invokeSuspend(Object o) {
        final zy6 c0 = zy6.C0;
        final int e0 = this.E0;
        int n = 1;
        Label_0051: {
            if (e0 == 0) {
                break Label_0051;
            }
            Label_0041: {
                if (e0 != 1) {
                    break Label_0041;
                }
                final x6m d0 = this.D0;
                ec0 c2 = this.C0;
                try {
                    kq9.b1(o);
                    o = d0;
                    Label_0286: {
                        if (!((x6m)o).C0) {
                            n = 2;
                        }
                    }
                    c80.b((c80)this.F0);
                    o = new bc0(c2, n);
                    return o;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    kq9.b1(o);
                    final c80<Object, oc0> f0 = this.F0;
                    final ec0 c3 = f0.c;
                    final oc0 e2 = (oc0)f0.a.a().invoke(this.G0);
                    Objects.requireNonNull(c3);
                    zzd.f((Object)e2, "<set-?>");
                    c3.E0 = (V)e2;
                    final c80<Object, oc0> f2 = this.F0;
                    o = this.H0.g();
                    ((nhq)f2.e).setValue(o);
                    ((nhq)this.F0.d).setValue((Object)Boolean.TRUE);
                    final ec0 c4 = this.F0.c;
                    o = c4.getValue();
                    c2 = new ec0((chv<Object, oc0>)c4.C0, o, dml.q((oc0)c4.E0), c4.F0, Long.MIN_VALUE, c4.H0);
                    o = new x6m();
                    final hb0<Object, oc0> h0 = this.H0;
                    final long i0 = this.I0;
                    final b80$a b80$a = new b80$a((c80)this.F0, c2, (rtb)this.J0, (x6m)o);
                    this.C0 = c2;
                    this.D0 = (x6m)o;
                    this.E0 = 1;
                    iftrue(Label_0286:)(szr.a(c2, (hb0)h0, i0, (rtb)b80$a, (ap6)this) != c0);
                    return c0;
                }
                catch (final CancellationException ex) {
                    c80.b((c80)this.F0);
                    throw ex;
                }
            }
        }
    }
}
