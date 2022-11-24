// 
// Decompiled by Procyon v0.6.0
// 

public final class tx implements uaa
{
    public final long a;
    public final boolean b;
    
    public tx(final long a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof tx)) {
            return false;
        }
        final tx tx = (tx)o;
        return this.a == tx.a && this.b == tx.b;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        return n * 31 + b;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final boolean b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("AllowedSensitiveMediaChangeEvent(tweetId=");
        sb.append(a);
        sb.append(", allowed=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
