// 
// Decompiled by Procyon v0.6.0
// 

public final class jra
{
    public final float a;
    public final w0b<Float> b;
    
    public jra(final float a, final w0b<Float> b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof jra)) {
            return false;
        }
        final jra jra = (jra)o;
        return e0e.a((Object)this.a, (Object)jra.a) && e0e.a((Object)this.b, (Object)jra.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + Float.floatToIntBits(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("Fade(alpha=");
        f.append(this.a);
        f.append(", animationSpec=");
        f.append(this.b);
        f.append(')');
        return f.toString();
    }
}
