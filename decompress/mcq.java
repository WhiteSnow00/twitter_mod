import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mcq
{
    public static final a Companion;
    public static final long b;
    public static final long c;
    public final long a = a;
    
    static {
        Companion = new a();
        b = x3j.f(0.0f, 0.0f);
        c = x3j.f(Float.NaN, Float.NaN);
    }
    
    public static final boolean a(final long n, final long n2) {
        return n == n2;
    }
    
    public static final float b(final long n) {
        if (n != mcq.c) {
            return Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }
    
    public static final float c(final long n) {
        return Math.min(Math.abs(d(n)), Math.abs(b(n)));
    }
    
    public static final float d(final long n) {
        if (n != mcq.c) {
            return Float.intBitsToFloat((int)(n >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }
    
    public static final boolean e(final long n) {
        return d(n) <= 0.0f || b(n) <= 0.0f;
    }
    
    public static String f(final long n) {
        Objects.requireNonNull(mcq.Companion);
        String string;
        if (n != mcq.c) {
            final StringBuilder g = w48.g("Size(");
            g.append(oyz.c0(d(n)));
            g.append(", ");
            g.append(oyz.c0(b(n)));
            g.append(')');
            string = g.toString();
        }
        else {
            string = "Size.Unspecified";
        }
        return string;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof mcq;
        boolean b2 = false;
        if (b) {
            if (a == ((mcq)o).a) {
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
