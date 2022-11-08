// 
// Decompiled by Procyon v0.6.0
// 

public final class kxs
{
    public final String a;
    
    public kxs(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof kxs && zzd.a((Object)this.a, (Object)((kxs)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return zi.y("TimelineKey(id=", this.a, ")");
    }
}
