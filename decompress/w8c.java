// 
// Decompiled by Procyon v0.6.0
// 

public final class w8c
{
    public final long a;
    
    public w8c(final long a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof w8c;
        boolean b2 = false;
        if (b) {
            if (a == ((w8c)o).a) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return (int)(a ^ a >>> 32);
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("GridItemSpan(packedValue=");
        sb.append(a);
        sb.append(')');
        return sb.toString();
    }
}
