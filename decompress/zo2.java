// 
// Decompiled by Procyon v0.6.0
// 

public final class zo2
{
    public final xo2 a;
    
    public zo2(final xo2 a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof zo2 && czd.a((Object)this.a, (Object)((zo2)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final xo2 a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("BrowseSpaceTopicsResponse(browseSpaceTopics=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
