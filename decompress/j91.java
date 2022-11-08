// 
// Decompiled by Procyon v0.6.0
// 

public final class j91 extends xf1
{
    public final int a;
    public final long b;
    
    public j91(final int a, final long b) {
        if (a != 0) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null status");
    }
    
    public final long b() {
        return this.b;
    }
    
    public final int c() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof xf1) {
            final xf1 xf1 = (xf1)o;
            if (!nb0.e(this.a, xf1.c()) || this.b != xf1.b()) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final int d = nb0.D(this.a);
        final long b = this.b;
        return (d ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32);
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("BackendResponse{status=");
        g.append(xk0.B(this.a));
        g.append(", nextRequestWaitMillis=");
        return b8b.r(g, this.b, "}");
    }
}
