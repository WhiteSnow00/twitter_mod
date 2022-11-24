import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class op2
{
    public final List<p31> a;
    
    public op2(final List<p31> a) {
        e0e.f((Object)a, "categories");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof op2 && e0e.a((Object)this.a, (Object)((op2)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return rh.x("BrowseSpaceTopics(categories=", (List)this.a, ")");
    }
}
