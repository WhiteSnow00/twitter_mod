// 
// Decompiled by Procyon v0.6.0
// 

public final class emd
{
    public final long a;
    public final String b;
    
    public emd(final long a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof emd)) {
            return false;
        }
        final emd emd = (emd)o;
        return this.a == emd.a && czd.a((Object)this.b, (Object)emd.b);
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final String b = this.b;
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        return n * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder p = gw8.p("InitialUserArguments(userId=", this.a, ", username=", this.b);
        p.append(")");
        return p.toString();
    }
}
