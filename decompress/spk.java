// 
// Decompiled by Procyon v0.6.0
// 

public final class spk
{
    public final long a;
    
    public spk(final long a) {
        this.a = a;
    }
    
    public static final boolean a(final long n, final long n2) {
        return n == n2;
    }
    
    public static String b(final long n) {
        final StringBuilder sb = new StringBuilder();
        sb.append("PointerId(value=");
        sb.append(n);
        sb.append(')');
        return sb.toString();
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof spk;
        boolean b2 = false;
        if (b) {
            if (a == ((spk)o).a) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return (int)(a ^ a >>> 32);
    }
    
    @Override
    public final String toString() {
        return b(this.a);
    }
}
