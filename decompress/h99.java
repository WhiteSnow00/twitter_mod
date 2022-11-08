import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h99
{
    public static final a Companion;
    public static final long b;
    public static final long c;
    public final long a = a;
    
    static {
        Companion = new a();
        final float n = 0;
        b = zi8.j(n, n);
        Objects.requireNonNull(e99.Companion);
        c = zi8.j(Float.NaN, Float.NaN);
    }
    
    public static final float a(final long n) {
        if (n != h99.c) {
            return Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }
    
    public static final float b(final long n) {
        if (n != h99.c) {
            return Float.intBitsToFloat((int)(n >> 32));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }
    
    public static int c(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    public static String d(final long n) {
        Objects.requireNonNull(h99.Companion);
        String string;
        if (n != h99.c) {
            final StringBuilder sb = new StringBuilder();
            sb.append((Object)e99.e(b(n)));
            sb.append(" x ");
            sb.append((Object)e99.e(a(n)));
            string = sb.toString();
        }
        else {
            string = "DpSize.Unspecified";
        }
        return string;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof h99;
        boolean b2 = false;
        if (b) {
            if (a == ((h99)o).a) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return c(this.a);
    }
    
    @Override
    public final String toString() {
        return d(this.a);
    }
    
    public static final class a
    {
    }
}
