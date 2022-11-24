// 
// Decompiled by Procyon v0.6.0
// 

public final class ox4
{
    public final String a;
    
    public ox4(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ox4 && e0e.a((Object)this.a, (Object)((ox4)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return c0e.h("CommerceShopReportingMetadata(restId=", this.a, ")");
    }
}
