// 
// Decompiled by Procyon v0.6.0
// 

public final class scp
{
    public static final scp c;
    public final long a;
    public final long b;
    
    static {
        c = new scp(0L, 0L);
    }
    
    public scp(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && scp.class == o.getClass()) {
            final scp scp = (scp)o;
            if (this.a != scp.a || this.b != scp.b) {
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
    
    @Override
    public final String toString() {
        final long a = this.a;
        final long b = this.b;
        final StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(a);
        sb.append(", position=");
        return ang.c(sb, b, "]");
    }
}
