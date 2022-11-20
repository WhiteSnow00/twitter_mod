// 
// Decompiled by Procyon v0.6.0
// 

public final class uu2
{
    public final double a;
    public final double b;
    
    public uu2(final double a, final double b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof uu2)) {
            return false;
        }
        final uu2 uu2 = (uu2)o;
        return Double.compare(this.a, uu2.a) == 0 && Double.compare(this.b, uu2.b) == 0;
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
        final double a = this.a;
        final double b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("BusinessGeoInput(latitude=");
        sb.append(a);
        sb.append(", longitude=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
