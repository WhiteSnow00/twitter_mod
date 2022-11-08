// 
// Decompiled by Procyon v0.6.0
// 

public final class g9c implements vnp
{
    public final i9c a;
    
    public g9c(final i9c a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && g9c.class == o.getClass() && w4j.a((Object)this.a, (Object)((g9c)o).a));
    }
    
    @Override
    public final int hashCode() {
        return w4j.f((Object)this.a);
    }
}
