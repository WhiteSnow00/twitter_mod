import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wpu implements ccx
{
    public final List<jpu> a;
    
    public wpu(final List<jpu> a) {
        e0e.f((Object)a, "items");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof wpu && e0e.a((Object)this.a, (Object)((wpu)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return rh.x("TweetReactionTimelineViewState(items=", (List)this.a, ")");
    }
}
