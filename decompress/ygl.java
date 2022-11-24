// 
// Decompiled by Procyon v0.6.0
// 

public final class ygl
{
    public static final a Companion;
    public final long a;
    public final int b;
    
    static {
        Companion = new a();
    }
    
    public ygl(final long a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ygl)) {
            return false;
        }
        final ygl ygl = (ygl)o;
        return this.a == ygl.a && this.b == ygl.b;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return (int)(a ^ a >>> 32) * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final int b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("ProfileUserFriendshipResult(userId=");
        sb.append(a);
        sb.append(", friendship=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
