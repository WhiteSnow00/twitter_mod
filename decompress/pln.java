import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pln implements ccx
{
    public final List<sjn> a;
    
    public pln(final List<sjn> a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof pln && e0e.a((Object)this.a, (Object)((pln)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return rh.x("RoomFollowPodcastWrapperViewState(listItems=", (List)this.a, ")");
    }
}
