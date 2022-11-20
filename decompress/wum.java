import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wum implements o7c
{
    public float D0;
    public float E0;
    public float F0;
    public float G0;
    public float H0;
    public float I0;
    public long J0;
    public long K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public long P0;
    public frp Q0;
    public boolean R0;
    public lo8 S0;
    
    public wum() {
        this.D0 = 1.0f;
        this.E0 = 1.0f;
        this.F0 = 1.0f;
        final long a = p7c.a;
        this.J0 = a;
        this.K0 = a;
        this.O0 = 8.0f;
        Objects.requireNonNull(vyt.Companion);
        this.P0 = vyt.b;
        this.Q0 = (frp)k6m.a;
        this.S0 = rp9.s();
    }
    
    public final long C(final float n) {
        return x68.g((lo8)this, n);
    }
    
    public final long C0(final long n) {
        return x68.f((lo8)this, n);
    }
    
    public final long D(final long n) {
        return x68.d((lo8)this, n);
    }
    
    public final void P(final long j0) {
        this.J0 = j0;
    }
    
    public final void R(final boolean r0) {
        this.R0 = r0;
    }
    
    public final int S(final float n) {
        return x68.c((lo8)this, n);
    }
    
    public final void T(final long p) {
        this.P0 = p;
    }
    
    public final void U(final long k0) {
        this.K0 = k0;
    }
    
    public final float V(final long n) {
        return x68.e((lo8)this, n);
    }
    
    public final void b(final float f0) {
        this.F0 = f0;
    }
    
    public final void c0(final float i0) {
        this.I0 = i0;
    }
    
    public final float getDensity() {
        return this.S0.getDensity();
    }
    
    public final void h(final float h0) {
        this.H0 = h0;
    }
    
    public final void l(final float d0) {
        this.D0 = d0;
    }
    
    public final float m0(final int n) {
        return n / this.getDensity();
    }
    
    public final void n(final float o0) {
        this.O0 = o0;
    }
    
    public final float n0(final float n) {
        return n / this.getDensity();
    }
    
    public final void o(final float l0) {
        this.L0 = l0;
    }
    
    public final void p(final float m0) {
        this.M0 = m0;
    }
    
    public final float p0() {
        return this.S0.p0();
    }
    
    public final void r() {
    }
    
    public final void s(final float n0) {
        this.N0 = n0;
    }
    
    public final void s0(final frp q0) {
        czd.f((Object)q0, "<set-?>");
        this.Q0 = q0;
    }
    
    public final void t(final float e0) {
        this.E0 = e0;
    }
    
    public final float t0(final float n) {
        return this.getDensity() * n;
    }
    
    public final int w0(final long n) {
        return zyz.n(this.V(n));
    }
    
    public final void y(final float g0) {
        this.G0 = g0;
    }
}
