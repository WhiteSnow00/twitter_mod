// 
// Decompiled by Procyon v0.6.0
// 

public final class eis
{
    public static final eis.eis$a Companion;
    public static final eis c;
    public final float a;
    public final float b;
    
    static {
        Companion = new eis.eis$a();
        c = new eis(1.0f, 0.0f);
    }
    
    public eis() {
        this(1.0f, 0.0f);
    }
    
    public eis(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof eis)) {
            return false;
        }
        final float a = this.a;
        final eis eis = (eis)o;
        return a == eis.a && this.b == eis.b;
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.b) + Float.floatToIntBits(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("TextGeometricTransform(scaleX=");
        j.append(this.a);
        j.append(", skewX=");
        return wnj.C(j, this.b, ')');
    }
}
