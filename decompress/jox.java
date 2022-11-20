// 
// Decompiled by Procyon v0.6.0
// 

public final class jox
{
    public final float a;
    public final float b;
    
    public jox(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    public final float[] a() {
        final float a = this.a;
        final float b = this.b;
        return new float[] { a / b, 1.0f, (1.0f - a - b) / b };
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof jox)) {
            return false;
        }
        final jox jox = (jox)o;
        return czd.a((Object)this.a, (Object)jox.a) && czd.a((Object)this.b, (Object)jox.b);
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.b) + Float.floatToIntBits(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("WhitePoint(x=");
        j.append(this.a);
        j.append(", y=");
        return wnj.C(j, this.b, ')');
    }
}
