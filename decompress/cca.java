// 
// Decompiled by Procyon v0.6.0
// 

public final class cca implements bca
{
    public final String f;
    
    public cca(final String f) {
        this.f = f;
    }
    
    @Override
    public final String b() {
        return this.f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof cca && czd.a((Object)this.f, (Object)((cca)o).f));
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode();
    }
    
    @Override
    public final String toString() {
        return da8.j("EventPagePrefixImpl(page=", this.f, ")");
    }
}
