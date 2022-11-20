import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqk
{
    public final List<Float> a;
    public final float b;
    
    public kqk(final List<Float> a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof kqk)) {
            return false;
        }
        final kqk kqk = (kqk)o;
        return czd.a((Object)this.a, (Object)kqk.a) && czd.a((Object)this.b, (Object)kqk.b);
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("PolynomialFit(coefficients=");
        j.append(this.a);
        j.append(", confidence=");
        return wnj.C(j, this.b, ')');
    }
}
