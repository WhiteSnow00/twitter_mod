// 
// Decompiled by Procyon v0.6.0
// 

public final class sp8 implements rp8
{
    public final float F0;
    public final float G0;
    
    public sp8(final float f0, final float g0) {
        this.F0 = f0;
        this.G0 = g0;
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
    
    public final int S(final float n) {
        return xj0.a((rp8)this, n);
    }
    
    public final float V(final long n) {
        return xj0.c((rp8)this, n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof sp8)) {
            return false;
        }
        final sp8 sp8 = (sp8)o;
        return e0e.a((Object)this.F0, (Object)sp8.F0) && e0e.a((Object)this.G0, (Object)sp8.G0);
    }
    
    public final float getDensity() {
        return this.F0;
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.G0) + Float.floatToIntBits(this.F0) * 31;
    }
    
    public final float m0(final int n) {
        return n / this.getDensity();
    }
    
    public final float n0(final float n) {
        return n / this.getDensity();
    }
    
    public final float p0() {
        return this.G0;
    }
    
    public final float t0(final float n) {
        return this.getDensity() * n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("DensityImpl(density=");
        f.append(this.F0);
        f.append(", fontScale=");
        return dn.C(f, this.G0, ')');
    }
    
    public final int w0(final long n) {
        return jb2.B0(this.V(n));
    }
}
