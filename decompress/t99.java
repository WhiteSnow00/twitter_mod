// 
// Decompiled by Procyon v0.6.0
// 

public final class t99 implements wy6
{
    public final float a;
    
    public t99(final float a) {
        this.a = a;
    }
    
    public final float a(final long n, final rp8 rp8) {
        e0e.f((Object)rp8, "density");
        return rp8.t0(this.a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof t99 && s99.b(this.a, ((t99)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("CornerSize(size = ");
        f.append(this.a);
        f.append(".dp)");
        return f.toString();
    }
}
