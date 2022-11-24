// 
// Decompiled by Procyon v0.6.0
// 

public final class fnd
{
    public final long a;
    public final String b;
    
    public fnd(final long a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fnd)) {
            return false;
        }
        final fnd fnd = (fnd)o;
        return this.a == fnd.a && e0e.a((Object)this.b, (Object)fnd.b);
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
        final StringBuilder b = snp.b("InitialUserArguments(userId=", this.a, ", username=", this.b);
        b.append(")");
        return b.toString();
    }
}
