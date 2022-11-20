import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hpu
{
    public final List<xou> a;
    public final mpu b;
    
    public hpu(final List<xou> a, final mpu b) {
        czd.f((Object)a, "tweetReactionTimelineEntries");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hpu)) {
            return false;
        }
        final hpu hpu = (hpu)o;
        return czd.a((Object)this.a, (Object)hpu.a) && czd.a((Object)this.b, (Object)hpu.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final List<xou> a = this.a;
        final mpu b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("TweetReactionTimelineResponse(tweetReactionTimelineEntries=");
        sb.append(a);
        sb.append(", reactionTypeMap=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
