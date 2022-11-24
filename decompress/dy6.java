// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1", f = "CoreTextField.kt", l = { 302 }, m = "invokeSuspend")
public final class dy6 extends l1s implements hub<iz6, mp6<? super vzv>, Object>
{
    public int F0;
    public final oe2 G0;
    public final sis H0;
    public final pis I0;
    public final rjs J0;
    public final ngj K0;
    
    public dy6(final oe2 g0, final sis h0, final pis i0, final rjs j0, final ngj k0, final mp6<? super dy6> mp6) {
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new dy6(this.G0, this.H0, this.I0, this.J0, this.K0, (mp6<? super dy6>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((dy6)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
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
            final oe2 g0 = this.G0;
            final sis h0 = this.H0;
            final zfs a = this.I0.a;
            final qjs a2 = this.J0.a;
            final ngj k0 = this.K0;
            this.F0 = 1;
            final int b = k0.b(zjs.f(h0.b));
            p6m p6m;
            if (b < a2.a.a.length()) {
                p6m = a2.b(b);
            }
            else if (b != 0) {
                p6m = a2.b(b - 1);
            }
            else {
                p6m = new p6m(0.0f, 0.0f, 1.0f, (float)nud.b(ugs.a(a.b, a.f, a.g, ugs.a, 1)));
            }
            o = g0.a(p6m, (mp6<? super vzv>)this);
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
