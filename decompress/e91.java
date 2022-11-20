// 
// Decompiled by Procyon v0.6.0
// 

public final class e91 extends tf1
{
    public final int a;
    public final long b;
    
    public e91(final int a, final long b) {
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
        if (o instanceof tf1) {
            final tf1 tf1 = (tf1)o;
            if (!ib0.e(this.a, tf1.c()) || this.b != tf1.b()) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final int e = ib0.E(this.a);
        final long b = this.b;
        return (e ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32);
    }
    
    public final String toString() {
        final StringBuilder j = fu8.j("BackendResponse{status=");
        j.append(sk0.F(this.a));
        j.append(", nextRequestWaitMillis=");
        return hmg.i(j, this.b, "}");
    }
}
