// 
// Decompiled by Procyon v0.6.0
// 

public final class wis
{
    public static final a Companion;
    public static final wis c;
    public final float a;
    public final float b;
    
    static {
        Companion = new a();
        c = new wis(1.0f, 0.0f);
    }
    
    public wis() {
        this(1.0f, 0.0f);
    }
    
    public wis(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof wis)) {
            return false;
        }
        final float a = this.a;
        final wis wis = (wis)o;
        return a == wis.a && this.b == wis.b;
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.b) + Float.floatToIntBits(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("TextGeometricTransform(scaleX=");
        f.append(this.a);
        f.append(", skewX=");
        return dn.C(f, this.b, ')');
    }
    
    public static final class a
    {
    }
}
