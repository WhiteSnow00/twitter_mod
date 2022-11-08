import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fdm extends k1t
{
    public final Map<String, String> b;
    public final int c;
    
    public fdm(final Map<String, String> b, final int c) {
        zzd.f((Object)b, "requestParams");
        this.b = b;
        Math.max(0, this.c = c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fdm)) {
            return false;
        }
        final fdm fdm = (fdm)o;
        return zzd.a((Object)this.b, (Object)fdm.b) && this.c == fdm.c;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() * 31 + this.c;
    }
    
    @Override
    public final String toString() {
        final Map<String, String> b = this.b;
        final int c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("RemoteTimelineReaction(requestParams=");
        sb.append(b);
        sb.append(", timeoutInSeconds=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
