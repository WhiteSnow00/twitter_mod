// 
// Decompiled by Procyon v0.6.0
// 

public final class bnd
{
    public final long a;
    public final String b;
    
    public bnd(final long a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof bnd)) {
            return false;
        }
        final bnd bnd = (bnd)o;
        return this.a == bnd.a && zzd.a((Object)this.b, (Object)bnd.b);
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
        final StringBuilder h = w48.h("InitialUserArguments(userId=", this.a, ", username=", this.b);
        h.append(")");
        return h.toString();
    }
}
