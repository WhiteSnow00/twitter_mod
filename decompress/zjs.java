// 
// Decompiled by Procyon v0.6.0
// 

public final class zjs
{
    public static final a Companion;
    public static final long b;
    public final long a;
    
    static {
        Companion = new a();
        b = p4j.f(0, 0);
    }
    
    public zjs(final long a) {
        this.a = a;
    }
    
    public static final boolean a(final long n, final long n2) {
        return g(n) <= g(n2) && f(n2) <= f(n);
    }
    
    public static final boolean b(final long n, final long n2) {
        return n == n2;
    }
    
    public static final boolean c(final long n) {
        return (int)(n >> 32) == d(n);
    }
    
    public static final int d(final long n) {
        return (int)(n & 0xFFFFFFFFL);
    }
    
    public static final int e(final long n) {
        return f(n) - g(n);
    }
    
    public static final int f(final long n) {
        int d = (int)(n >> 32);
        if (d <= d(n)) {
            d = d(n);
        }
        return d;
    }
    
    public static final int g(final long n) {
        int d;
        if ((d = (int)(n >> 32)) > d(n)) {
            d = d(n);
        }
        return d;
    }
    
    public static final boolean h(final long n) {
        return (int)(n >> 32) > d(n);
    }
    
    public static int i(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    public static String j(final long n) {
        final StringBuilder f = ehk.f("TextRange(");
        f.append((int)(n >> 32));
        f.append(", ");
        f.append(d(n));
        f.append(')');
        return f.toString();
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof zjs;
        boolean b2 = false;
        if (b) {
            if (a == ((zjs)o).a) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return i(this.a);
    }
    
    @Override
    public final String toString() {
        return j(this.a);
    }
    
    public static final class a
    {
    }
}
