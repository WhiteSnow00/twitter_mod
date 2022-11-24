// 
// Decompiled by Procyon v0.6.0
// 

public final class k22
{
    public static final a Companion;
    public static final k22 c;
    public final long a;
    public final int b;
    
    static {
        Companion = new a();
        c = new k22(-1L, 3);
    }
    
    public k22(final long a, final int b) {
        mqb.n(b, "action");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof k22)) {
            return false;
        }
        final k22 k22 = (k22)o;
        return this.a == k22.a && this.b == k22.b;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return lb0.G(this.b) + (int)(a ^ a >>> 32) * 31;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final int b = this.b;
        final StringBuilder c = qd.C("BlockedUser(id=", a, ", action=");
        c.append(xj0.E(b));
        c.append(")");
        return c.toString();
    }
    
    public static final class a
    {
    }
}
