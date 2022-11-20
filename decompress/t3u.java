// 
// Decompiled by Procyon v0.6.0
// 

public final class t3u
{
    public final long a;
    public final cvs b;
    public final ynj<r2t> c;
    
    public t3u(final long a, final cvs b, final ynj<r2t> c) {
        czd.f((Object)b, "timelineEntityInfo");
        czd.f((Object)c, "timelineResponse");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof t3u)) {
            return false;
        }
        final t3u t3u = (t3u)o;
        return this.a == t3u.a && czd.a((Object)this.b, (Object)t3u.b) && czd.a((Object)this.c, (Object)t3u.c);
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return this.c.hashCode() + (this.b.hashCode() + (int)(a ^ a >>> 32) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final cvs b = this.b;
        final ynj<r2t> c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("TriggerEventResponse(reactionId=");
        sb.append(a);
        sb.append(", timelineEntityInfo=");
        sb.append(b);
        sb.append(", timelineResponse=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
