import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pi0
{
    public final int a;
    public final List<oi0> b;
    
    public pi0(final int a, final List<oi0> b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof pi0)) {
            return false;
        }
        final pi0 pi0 = (pi0)o;
        return this.a == pi0.a && czd.a((Object)this.b, (Object)pi0.b);
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final List<oi0> b = this.b;
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        return a * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final List<oi0> b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("ApolloErrors(statusCode=");
        sb.append(a);
        sb.append(", jsonErrors=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
