import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yqi
{
    public final mqi a;
    public final List<kqi> b;
    
    public yqi(final mqi a, final List<kqi> b) {
        e0e.f((Object)a, "group");
        e0e.f((Object)b, "channelList");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof yqi)) {
            return false;
        }
        final yqi yqi = (yqi)o;
        return e0e.a((Object)this.a, (Object)yqi.a) && e0e.a((Object)this.b, (Object)yqi.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final mqi a = this.a;
        final List<kqi> b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("NotificationChannelsResponse(group=");
        sb.append(a);
        sb.append(", channelList=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
