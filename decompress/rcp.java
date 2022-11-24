// 
// Decompiled by Procyon v0.6.0
// 

public final class rcp
{
    public static final rcp c;
    public final long a;
    public final long b;
    
    static {
        final rcp c2 = new rcp(0L, 0L);
        new rcp(Long.MAX_VALUE, Long.MAX_VALUE);
        new rcp(Long.MAX_VALUE, 0L);
        new rcp(0L, Long.MAX_VALUE);
        c = c2;
    }
    
    public rcp(final long a, final long b) {
        final boolean b2 = true;
        omi.m(a >= 0L);
        omi.m(b >= 0L && b2);
        this.a = a;
        this.b = b;
    }
    
    public final long a(final long n, final long n2, final long n3) {
        final long a = this.a;
        if (a == 0L && this.b == 0L) {
            return n;
        }
        final long n4 = Long.MIN_VALUE;
        final int a2 = rnw.a;
        long n5 = n - a;
        if (((a ^ n) & (n ^ n5)) < 0L) {
            n5 = n4;
        }
        final long b = this.b;
        long n6 = Long.MAX_VALUE;
        final long n7 = n + b;
        if (((b ^ n7) & (n ^ n7)) >= 0L) {
            n6 = n7;
        }
        boolean b2 = true;
        final boolean b3 = n5 <= n2 && n2 <= n6;
        if (n5 > n3 || n3 > n6) {
            b2 = false;
        }
        if (b3 && b2) {
            if (Math.abs(n2 - n) <= Math.abs(n3 - n)) {
                return n2;
            }
            return n3;
        }
        else {
            if (b3) {
                return n2;
            }
            if (b2) {
                return n3;
            }
            return n5;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && rcp.class == o.getClass()) {
            final rcp rcp = (rcp)o;
            if (this.a != rcp.a || this.b != rcp.b) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (int)this.a * 31 + (int)this.b;
    }
}
