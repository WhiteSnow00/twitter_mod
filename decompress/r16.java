// 
// Decompiled by Procyon v0.6.0
// 

public final class r16
{
    public double a;
    public double b;
    
    public r16(final double a, final double b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof r16)) {
            return false;
        }
        final r16 r16 = (r16)o;
        return e0e.a((Object)this.a, (Object)r16.a) && e0e.a((Object)this.b, (Object)r16.b);
    }
    
    @Override
    public final int hashCode() {
        final long doubleToLongBits = Double.doubleToLongBits(this.a);
        final int n = (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
        final long doubleToLongBits2 = Double.doubleToLongBits(this.b);
        return n * 31 + (int)(doubleToLongBits2 ^ doubleToLongBits2 >>> 32);
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("ComplexDouble(_real=");
        f.append(this.a);
        f.append(", _imaginary=");
        f.append(this.b);
        f.append(')');
        return f.toString();
    }
}
