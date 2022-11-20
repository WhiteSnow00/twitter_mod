import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddq
{
    public static final a Companion;
    public static final long b;
    public static final long c;
    public final long a;
    
    static {
        Companion = new a();
        b = oj7.d(0.0f, 0.0f);
        c = oj7.d(Float.NaN, Float.NaN);
    }
    
    public ddq(final long a) {
        this.a = a;
    }
    
    public static final boolean a(final long n, final long n2) {
        return n == n2;
    }
    
    public static final float b(final long n) {
        if (n != ddq.c) {
            return Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }
    
    public static final float c(final long n) {
        return Math.min(Math.abs(d(n)), Math.abs(b(n)));
    }
    
    public static final float d(final long n) {
        if (n != ddq.c) {
            return Float.intBitsToFloat((int)(n >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }
    
    public static final boolean e(final long n) {
        return d(n) <= 0.0f || b(n) <= 0.0f;
    }
    
    public static String f(final long n) {
        Objects.requireNonNull(ddq.Companion);
        String string;
        if (n != ddq.c) {
            final StringBuilder j = fu8.j("Size(");
            j.append(max.H(d(n)));
            j.append(", ");
            j.append(max.H(b(n)));
            j.append(')');
            string = j.toString();
        }
        else {
            string = "Size.Unspecified";
        }
        return string;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof ddq;
        boolean b2 = false;
        if (b) {
            if (a == ((ddq)o).a) {
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
        return f(this.a);
    }
    
    public static final class a
    {
    }
}
