import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d82 extends pue implements stb<em6, vzv>
{
    public final boolean F0;
    public final wq2 G0;
    public final long H0;
    public final float I0;
    public final float J0;
    public final long K0;
    public final long L0;
    public final fmr M0;
    
    public d82(final boolean f0, final wq2 g0, final long h0, final float i0, final float j0, final long k0, final long l0, final fmr m0) {
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
        final em6 em6 = (em6)o;
        e0e.f((Object)em6, "$this$onDrawWithContent");
        em6.E0();
        if (this.F0) {
            vd9.k(em6, this.G0, 0L, 0L, this.H0, 0.0f, null, null, 0, 246, null);
        }
        else {
            final float b = ty6.b(this.H0);
            final float i0 = this.I0;
            if (b < i0) {
                final float j0 = this.J0;
                final float d = aeq.d(em6.c());
                final float j2 = this.J0;
                final float b2 = aeq.b(em6.c());
                final float j3 = this.J0;
                Objects.requireNonNull(mi4.Companion);
                final wq2 g0 = this.G0;
                final long h0 = this.H0;
                final pd9 u0 = em6.u0();
                final long c = u0.c();
                u0.b().p();
                u0.a().a(j0, j0, d - j2, b2 - j3, 0);
                vd9.k(em6, g0, 0L, 0L, h0, 0.0f, null, null, 0, 246, null);
                u0.b().c();
                u0.d(c);
            }
            else {
                vd9.k(em6, this.G0, this.K0, this.L0, y72.e(this.H0, i0), 0.0f, this.M0, null, 0, 208, null);
            }
        }
        return vzv.a;
    }
}
