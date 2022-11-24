// 
// Decompiled by Procyon v0.6.0
// 

public final class krs
{
    public static final krs c;
    public final long a;
    public final long b;
    
    static {
        c = new krs(0L, Long.MAX_VALUE);
    }
    
    public krs(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public static krs a(final long n, final long n2) {
        if (n <= 0L) {
            krs c;
            if (n2 > 0L && n2 != Long.MAX_VALUE) {
                c = new krs(0L, n2);
            }
            else {
                c = krs.c;
            }
            return c;
        }
        long n3 = n2;
        if (n2 <= 0L) {
            n3 = Long.MAX_VALUE;
        }
        return new krs(n, n3);
    }
}
