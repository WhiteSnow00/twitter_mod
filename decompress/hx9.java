// 
// Decompiled by Procyon v0.6.0
// 

public final class hx9
{
    public static final a Companion;
    public static final hx9.hx9$b b;
    public final long a;
    
    static {
        Companion = new a();
        b = new hx9.hx9$b();
    }
    
    public hx9(final long a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof hx9 && this.a == ((hx9)o).a);
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return (int)(a ^ a >>> 32);
    }
    
    @Override
    public final String toString() {
        return tok.g("EditedTweetInformation(initialTweetId=", this.a, ")");
    }
    
    public static final class a
    {
    }
}
