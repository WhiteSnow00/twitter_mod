// 
// Decompiled by Procyon v0.6.0
// 

public final class vzg
{
    public final long a;
    
    public vzg(final long a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof vzg && this.a == ((vzg)o).a);
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return (int)(a ^ a >>> 32);
    }
    
    @Override
    public final String toString() {
        return k5b.m("MediaResponse(mediaIdString=", this.a, ")");
    }
}
