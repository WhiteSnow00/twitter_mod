// 
// Decompiled by Procyon v0.6.0
// 

public final class s2k implements qx6
{
    public final float a;
    
    public s2k(final float a) {
        this.a = a;
        if (a >= 0.0f && a <= 100.0f) {
            return;
        }
        throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
    }
    
    public final float a(final long n, final lo8 lo8) {
        czd.f((Object)lo8, "density");
        return this.a / 100.0f * ddq.c(n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof s2k && czd.a((Object)this.a, (Object)((s2k)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("CornerSize(size = ");
        j.append(this.a);
        j.append("%)");
        return j.toString();
    }
}
