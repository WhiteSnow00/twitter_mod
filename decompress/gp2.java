import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gp2
{
    public final List<o31> a;
    
    public gp2(final List<o31> a) {
        zzd.f((Object)a, "categories");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof gp2 && zzd.a((Object)this.a, (Object)((gp2)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return du1.x("BrowseSpaceTopics(categories=", (List)this.a, ")");
    }
}
