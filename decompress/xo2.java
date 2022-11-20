import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xo2
{
    public final List<j31> a;
    
    public xo2(final List<j31> a) {
        czd.f((Object)a, "categories");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof xo2 && czd.a((Object)this.a, (Object)((xo2)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return wc0.z("BrowseSpaceTopics(categories=", (List)this.a, ")");
    }
}
