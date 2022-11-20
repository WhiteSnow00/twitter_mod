import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgn
{
    public final String a;
    public final String b;
    public final Long c;
    public final boolean d;
    public final Set<AudioSpaceTopicItem> e;
    public final boolean f;
    public final boolean g;
    
    public kgn(final String a, final String b, final Long c, final boolean d, final Set<AudioSpaceTopicItem> e, final boolean f, final boolean g) {
        czd.f((Object)a, "roomId");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof kgn)) {
            return false;
        }
        final kgn kgn = (kgn)o;
        return czd.a((Object)this.a, (Object)kgn.a) && czd.a((Object)this.b, (Object)kgn.b) && czd.a((Object)this.c, (Object)kgn.c) && this.d == kgn.d && czd.a((Object)this.e, (Object)kgn.e) && this.f == kgn.f && this.g == kgn.g;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Long c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        final int d = this.d ? 1 : 0;
        final int n = 1;
        int n2 = d;
        if (d != 0) {
            n2 = 1;
        }
        final int b2 = zip.b((Set)this.e, (((hashCode * 31 + hashCode3) * 31 + hashCode2) * 31 + n2) * 31, 31);
        int f;
        if ((f = (this.f ? 1 : 0)) != 0) {
            f = 1;
        }
        int g = this.g ? 1 : 0;
        if (g != 0) {
            g = n;
        }
        return (b2 + f) * 31 + g;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final Long c = this.c;
        final boolean d = this.d;
        final Set<AudioSpaceTopicItem> e = this.e;
        final boolean f = this.f;
        final boolean g = this.g;
        final StringBuilder q = tqf.q("RoomEndScreenOpenEvent(roomId=", a, ", title=", b, ", startedAt=");
        q.append(c);
        q.append(", isHost=");
        q.append(d);
        q.append(", topics=");
        q.append(e);
        q.append(", isAvailableForReplay=");
        q.append(f);
        q.append(", isAvailableForClipping=");
        return wnj.D(q, g, ")");
    }
}
