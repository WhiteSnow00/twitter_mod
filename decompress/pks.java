import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pks
{
    public static final a Companion;
    public static final qks[] b;
    public static final long c;
    public final long a;
    
    static {
        Companion = new a();
        Objects.requireNonNull(qks.Companion);
        b = new qks[] { new qks(0L), new qks(4294967296L), new qks(8589934592L) };
        c = ma7.I(0L, Float.NaN);
    }
    
    public pks(final long a) {
        this.a = a;
    }
    
    public static final boolean a(final long n, final long n2) {
        return n == n2;
    }
    
    public static final long b(final long n) {
        return n & 0xFF00000000L;
    }
    
    public static final long c(final long n) {
        return pks.b[(int)(b(n) >>> 32)].a;
    }
    
    public static final float d(final long n) {
        return Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
    }
    
    public static int e(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    public static String f(final long n) {
        final long c = c(n);
        final qks$a companion = qks.Companion;
        Objects.requireNonNull(companion);
        String s;
        if (qks.a(c, 0L)) {
            s = "Unspecified";
        }
        else {
            Objects.requireNonNull(companion);
            if (qks.a(c, 4294967296L)) {
                final StringBuilder sb = new StringBuilder();
                sb.append(d(n));
                sb.append(".sp");
                s = sb.toString();
            }
            else {
                Objects.requireNonNull(companion);
                if (qks.a(c, 8589934592L)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(d(n));
                    sb2.append(".em");
                    s = sb2.toString();
                }
                else {
                    s = "Invalid";
                }
            }
        }
        return s;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof pks;
        boolean b2 = false;
        if (b) {
            if (a == ((pks)o).a) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return e(this.a);
    }
    
    @Override
    public final String toString() {
        return f(this.a);
    }
    
    public static final class a
    {
    }
}
