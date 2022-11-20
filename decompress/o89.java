import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o89
{
    public static final a Companion;
    public static final long b;
    public final long a;
    
    static {
        Companion = new a();
        final float n = 0;
        lp.e(n, n);
        Objects.requireNonNull(m89.Companion);
        b = lp.e(Float.NaN, Float.NaN);
    }
    
    public o89(final long a) {
        this.a = a;
    }
    
    public static final float a(final long n) {
        if (n != o89.b) {
            return Float.intBitsToFloat((int)(n >> 32));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }
    
    public static final float b(final long n) {
        if (n != o89.b) {
            return Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }
    
    public static String c(final long n) {
        Objects.requireNonNull(o89.Companion);
        String string;
        if (n != o89.b) {
            final StringBuilder a = ta0.A('(');
            a.append((Object)m89.e(a(n)));
            a.append(", ");
            a.append((Object)m89.e(b(n)));
            a.append(')');
            string = a.toString();
        }
        else {
            string = "DpOffset.Unspecified";
        }
        return string;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof o89;
        boolean b2 = false;
        if (b) {
            if (a == ((o89)o).a) {
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
        return c(this.a);
    }
    
    public static final class a
    {
    }
}
