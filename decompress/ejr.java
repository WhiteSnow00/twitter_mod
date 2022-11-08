// 
// Decompiled by Procyon v0.6.0
// 

public final class ejr implements prd
{
    public final String b;
    
    public ejr(final String b) {
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ejr && w4j.a((Object)this.b, (Object)((ejr)o).b));
    }
    
    @Override
    public final int hashCode() {
        return w4j.f((Object)this.b);
    }
}
