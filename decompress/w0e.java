import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w0e
{
    public final xpn a;
    public final Integer b;
    public final Set<RoomUserItem> c;
    
    public w0e(final xpn a, Integer b, final int n) {
        Object f0 = null;
        if ((n & 0x2) != 0x0) {
            b = null;
        }
        if ((n & 0x4) != 0x0) {
            f0 = r3a.F0;
        }
        e0e.f(f0, "inviteList");
        this.a = a;
        this.b = b;
        this.c = (Set<RoomUserItem>)f0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof w0e)) {
            return false;
        }
        final w0e w0e = (w0e)o;
        return this.a == w0e.a && e0e.a((Object)this.b, (Object)w0e.b) && e0e.a((Object)this.c, (Object)w0e.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final Integer b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return this.c.hashCode() + (hashCode * 31 + hashCode2) * 31;
    }
    
    @Override
    public final String toString() {
        final xpn a = this.a;
        final Integer b = this.b;
        final Set<RoomUserItem> c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("Invite(inviteType=");
        sb.append(a);
        sb.append(", maxInvites=");
        sb.append(b);
        sb.append(", inviteList=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
