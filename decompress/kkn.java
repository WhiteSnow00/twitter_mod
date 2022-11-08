import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kkn implements oax
{
    public final List<min> a;
    
    public kkn(final List<min> a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof kkn && zzd.a((Object)this.a, (Object)((kkn)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return du1.x("RoomFollowPodcastWrapperViewState(listItems=", (List)this.a, ")");
    }
}
