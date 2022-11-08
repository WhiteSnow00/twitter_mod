import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nou
{
    public final List<dou> a;
    public final sou b;
    
    public nou(final List<dou> a, final sou b) {
        zzd.f((Object)a, "tweetReactionTimelineEntries");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof nou)) {
            return false;
        }
        final nou nou = (nou)o;
        return zzd.a((Object)this.a, (Object)nou.a) && zzd.a((Object)this.b, (Object)nou.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final List<dou> a = this.a;
        final sou b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("TweetReactionTimelineResponse(tweetReactionTimelineEntries=");
        sb.append(a);
        sb.append(", reactionTypeMap=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
