import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mvm implements q8c
{
    public float F0;
    public float G0;
    public float H0;
    public float I0;
    public float J0;
    public float K0;
    public long L0;
    public long M0;
    public float N0;
    public float O0;
    public float P0;
    public float Q0;
    public long R0;
    public asp S0;
    public boolean T0;
    public rp8 U0;
    
    public mvm() {
        this.F0 = 1.0f;
        this.G0 = 1.0f;
        this.H0 = 1.0f;
        final long a = r8c.a;
        this.L0 = a;
        this.M0 = a;
        this.Q0 = 8.0f;
        Objects.requireNonNull(ozt.Companion);
        this.R0 = ozt.b;
        this.S0 = (asp)x6m.a;
        this.U0 = kqe.c();
    }
    
    public final long C(final float n) {
        return xj0.e((rp8)this, n);
    }
    
    public final long C0(final long n) {
        return xj0.d((rp8)this, n);
    }
    
    public final long D(final long n) {
        return xj0.b((rp8)this, n);
    }
    
    @Override
    public final void P(final long l0) {
        this.L0 = l0;
    }
    
    @Override
    public final void R(final boolean t0) {
        this.T0 = t0;
    }
    
    public final int S(final float n) {
        return xj0.a((rp8)this, n);
    }
    
    @Override
    public final void T(final long r0) {
        this.R0 = r0;
    }
    
    @Override
    public final void U(final long m0) {
        this.M0 = m0;
    }
    
    public final float V(final long n) {
        return xj0.c((rp8)this, n);
    }
    
    @Override
    public final void b(final float h0) {
        this.H0 = h0;
    }
    
    @Override
    public final void c0(final float k0) {
        this.K0 = k0;
    }
    
    public final float getDensity() {
        return this.U0.getDensity();
    }
    
    @Override
    public final void h(final float j0) {
        this.J0 = j0;
    }
    
    @Override
    public final void l(final float f0) {
        this.F0 = f0;
    }
    
    public final float m0(final int n) {
        return n / this.getDensity();
    }
    
    @Override
    public final void n(final float q0) {
        this.Q0 = q0;
    }
    
    public final float n0(final float n) {
        return n / this.getDensity();
    }
    
    @Override
    public final void o(final float n0) {
        this.N0 = n0;
    }
    
    @Override
    public final void p(final float o0) {
        this.O0 = o0;
    }
    
    public final float p0() {
        return this.U0.p0();
    }
    
    @Override
    public final void r() {
    }
    
    @Override
    public final void s(final float p) {
        this.P0 = p;
    }
    
    @Override
    public final void s0(final asp s0) {
        e0e.f((Object)s0, "<set-?>");
        this.S0 = s0;
    }
    
    @Override
    public final void t(final float g0) {
        this.G0 = g0;
    }
    
    public final float t0(final float n) {
        return this.getDensity() * n;
    }
    
    public final int w0(final long n) {
        return jb2.B0(this.V(n));
    }
    
    @Override
    public final void y(final float i0) {
        this.I0 = i0;
    }
}
