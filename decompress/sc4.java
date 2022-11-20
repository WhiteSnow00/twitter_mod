// 
// Decompiled by Procyon v0.6.0
// 

public final class sc4
{
    public final float a;
    public final float b;
    
    public sc4(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof sc4)) {
            return false;
        }
        final sc4 sc4 = (sc4)o;
        return Float.compare(this.a, sc4.a) == 0 && Float.compare(this.b, sc4.b) == 0;
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.b) + Float.floatToIntBits(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final float a = this.a;
        final float b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("ClickCoordinate(xValue=");
        sb.append(a);
        sb.append(", yValue=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
