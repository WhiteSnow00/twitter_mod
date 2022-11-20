// 
// Decompiled by Procyon v0.6.0
// 

public final class lxl
{
    public static final b Companion;
    public static final rlp<lxl> c;
    public final float a;
    public final long b;
    
    static {
        Companion = new b();
        lxl.c = new lxl.lxl$c();
    }
    
    public lxl(final float a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lxl)) {
            return false;
        }
        final lxl lxl = (lxl)o;
        return Float.compare(this.a, lxl.a) == 0 && this.b == lxl.b;
    }
    
    @Override
    public final int hashCode() {
        final int floatToIntBits = Float.floatToIntBits(this.a);
        final long b = this.b;
        return floatToIntBits * 31 + (int)(b ^ b >>> 32);
    }
    
    @Override
    public final String toString() {
        final float a = this.a;
        final long b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("RatingsData(stars=");
        sb.append(a);
        sb.append(", count=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class b
    {
    }
}
