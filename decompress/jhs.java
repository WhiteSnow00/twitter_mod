// 
// Decompiled by Procyon v0.6.0
// 

public final class jhs
{
    public static final a Companion;
    public static final jhs c;
    public final float a;
    public final float b;
    
    static {
        Companion = new a();
        c = new jhs(1.0f, 0.0f);
    }
    
    public jhs() {
        this(1.0f, 0.0f);
    }
    
    public jhs(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof jhs)) {
            return false;
        }
        final float a = this.a;
        final jhs jhs = (jhs)o;
        return a == jhs.a && this.b == jhs.b;
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.b) + Float.floatToIntBits(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("TextGeometricTransform(scaleX=");
        g.append(this.a);
        g.append(", skewX=");
        return x30.E(g, this.b, ')');
    }
    
    public static final class a
    {
    }
}
