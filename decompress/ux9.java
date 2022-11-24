// 
// Decompiled by Procyon v0.6.0
// 

public final class ux9
{
    public static final a Companion;
    public static final ux9.ux9$b b;
    public final long a;
    
    static {
        Companion = new a();
        b = new ux9.ux9$b();
    }
    
    public ux9(final long a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ux9 && this.a == ((ux9)o).a);
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return (int)(a ^ a >>> 32);
    }
    
    @Override
    public final String toString() {
        return k5b.m("EditedTweetInformation(initialTweetId=", this.a, ")");
    }
    
    public static final class a
    {
    }
}
