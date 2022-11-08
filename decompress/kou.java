import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kou implements oax
{
    public final List<aou> a;
    
    public kou(final List<aou> a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof kou && zzd.a((Object)this.a, (Object)((kou)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return du1.x("TweetReactionTimelinePagerViewState(items=", (List)this.a, ")");
    }
}
