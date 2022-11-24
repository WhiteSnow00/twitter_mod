import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n2q extends pue implements stb<View, xlx<? super f3q, g2q, b2q>>
{
    public final d2q F0;
    public final j4e<c1q> G0;
    public final h3q H0;
    public final v1q I0;
    public final x1q J0;
    public final e2q K0;
    public final a0q L0;
    public final w1q M0;
    
    public n2q(final d2q f0, final j4e<c1q> g0, final h3q h0, final v1q i0, final x1q j0, final e2q k0, final a0q l0, final w1q m0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        e0e.f((Object)view, "it");
        final d2q f0 = this.F0;
        final j4e<c1q> g0 = this.G0;
        final h3q h0 = this.H0;
        final v1q i0 = this.I0;
        final x1q j0 = this.J0;
        final t5j empty = t5j.empty();
        e0e.e((Object)empty, "empty()");
        return new r2q(view, f0, (j4e)g0, h0, i0, j0, empty, this.K0, this.L0, this.M0, true);
    }
}
