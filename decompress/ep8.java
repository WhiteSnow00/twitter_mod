// 
// Decompiled by Procyon v0.6.0
// 

public final class ep8 implements dp8
{
    public final float C0;
    public final float D0;
    
    public ep8(final float c0, final float d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final /* synthetic */ float V(final long n) {
        return x30.f((dp8)this, n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ep8)) {
            return false;
        }
        final ep8 ep8 = (ep8)o;
        return zzd.a((Object)this.C0, (Object)ep8.C0) && zzd.a((Object)this.D0, (Object)ep8.D0);
    }
    
    public final float getDensity() {
        return this.C0;
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.D0) + Float.floatToIntBits(this.C0) * 31;
    }
    
    public final float m0(final int n) {
        return n / this.getDensity();
    }
    
    public final float n0(final float n) {
        return n / this.getDensity();
    }
    
    public final float p0() {
        return this.D0;
    }
    
    public final float t0(final float n) {
        return this.getDensity() * n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("DensityImpl(density=");
        g.append(this.C0);
        g.append(", fontScale=");
        return x30.E(g, this.D0, ')');
    }
    
    public final int w0(final long n) {
        return q0b.p(this.V(n));
    }
}
