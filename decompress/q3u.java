// 
// Decompiled by Procyon v0.6.0
// 

public final class q3u
{
    public final long a;
    public final cvs b;
    public final bba c;
    
    public q3u(final long a, final cvs b, final bba c) {
        czd.f((Object)b, "timelineEntityInfo");
        czd.f((Object)c, "eventElementPrefix");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof q3u)) {
            return false;
        }
        final q3u q3u = (q3u)o;
        return this.a == q3u.a && czd.a((Object)this.b, (Object)q3u.b) && czd.a((Object)this.c, (Object)q3u.c);
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
        final bba c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("TriggerEvent(reactionId=");
        sb.append(a);
        sb.append(", timelineEntityInfo=");
        sb.append(b);
        sb.append(", eventElementPrefix=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
