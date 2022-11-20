// 
// Decompiled by Procyon v0.6.0
// 

public final class sqm
{
    public final String a;
    
    public sqm(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof sqm && czd.a((Object)this.a, (Object)((sqm)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return da8.j("Resource(id=", this.a, ")");
    }
}
