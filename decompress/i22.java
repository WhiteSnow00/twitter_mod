// 
// Decompiled by Procyon v0.6.0
// 

public final class i22
{
    public static final a Companion;
    public static final i22 c;
    public final long a;
    public final int b;
    
    static {
        Companion = new a();
        c = new i22(-1L, 3);
    }
    
    public i22(final long a, final int b) {
        k1b.i(b, "action");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i22)) {
            return false;
        }
        final i22 i22 = (i22)o;
        return this.a == i22.a && this.b == i22.b;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return nb0.D(this.b) + (int)(a ^ a >>> 32) * 31;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final int b = this.b;
        final StringBuilder d = c0.D("BlockedUser(id=", a, ", action=");
        d.append(rb0.D(b));
        d.append(")");
        return d.toString();
    }
    
    public static final class a
    {
    }
}
