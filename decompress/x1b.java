// 
// Decompiled by Procyon v0.6.0
// 

public final class x1b implements kn6
{
    public final float a;
    
    public x1b() {
        this.a = 1.0f;
    }
    
    public final long a(final long n, final long n2) {
        final float a = this.a;
        return omi.j(a, a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof x1b && e0e.a((Object)this.a, (Object)((x1b)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }
    
    @Override
    public final String toString() {
        return dn.C(ehk.f("FixedScale(value="), this.a, ')');
    }
}
