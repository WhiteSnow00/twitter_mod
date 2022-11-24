// 
// Decompiled by Procyon v0.6.0
// 

public final class c2b implements ros
{
    public final float a;
    
    public c2b(final float a) {
        this.a = a;
    }
    
    public final float a(final rp8 rp8, final float n, final float n2) {
        e0e.f((Object)rp8, "<this>");
        return Math.signum(n2 - n) * rp8.t0(this.a) + n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof c2b && s99.b(this.a, ((c2b)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("FixedThreshold(offset=");
        f.append((Object)s99.e(this.a));
        f.append(')');
        return f.toString();
    }
}
