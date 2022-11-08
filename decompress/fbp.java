// 
// Decompiled by Procyon v0.6.0
// 

public final class fbp
{
    public static final fbp c;
    public final long a;
    public final long b;
    
    static {
        final fbp c2 = new fbp(0L, 0L);
        new fbp(Long.MAX_VALUE, Long.MAX_VALUE);
        new fbp(Long.MAX_VALUE, 0L);
        new fbp(0L, Long.MAX_VALUE);
        c = c2;
    }
    
    public fbp(final long a, final long b) {
        final boolean b2 = true;
        ri4.k(a >= 0L);
        ri4.k(b >= 0L && b2);
        this.a = a;
        this.b = b;
    }
    
    public final long a(final long n, final long n2, final long n3) {
        final long a = this.a;
        if (a == 0L && this.b == 0L) {
            return n;
        }
        long n4 = Long.MIN_VALUE;
        final int a2 = imw.a;
        final long n5 = n - a;
        if (((a ^ n) & (n ^ n5)) >= 0L) {
            n4 = n5;
        }
        final long b = this.b;
        final long n6 = Long.MAX_VALUE;
        long n7 = n + b;
        if (((b ^ n7) & (n ^ n7)) < 0L) {
            n7 = n6;
        }
        boolean b2 = true;
        final boolean b3 = n4 <= n2 && n2 <= n7;
        if (n4 > n3 || n3 > n7) {
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
            return n4;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && fbp.class == o.getClass()) {
            final fbp fbp = (fbp)o;
            if (this.a != fbp.a || this.b != fbp.b) {
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
