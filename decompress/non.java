import tv.periscope.model.NarrowcastSpaceType;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class non implements ccx
{
    public final String a;
    public final String b;
    public final Long c;
    public final Set<AudioSpaceTopicItem> d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final NarrowcastSpaceType i;
    
    public non(final String a, final String b, final Long c, final Set<AudioSpaceTopicItem> d, final boolean e, final boolean f, final String g, final String h, final NarrowcastSpaceType i) {
        e0e.f((Object)a, "roomId");
        e0e.f((Object)d, "topics");
        e0e.f((Object)i, "narrowCastSpaceType");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof non)) {
            return false;
        }
        final non non = (non)o;
        return e0e.a((Object)this.a, (Object)non.a) && e0e.a((Object)this.b, (Object)non.b) && e0e.a((Object)this.c, (Object)non.c) && e0e.a((Object)this.d, (Object)non.d) && this.e == non.e && this.f == non.f && e0e.a((Object)this.g, (Object)non.g) && e0e.a((Object)this.h, (Object)non.h) && e0e.a((Object)this.i, (Object)non.i);
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
        final int q = z9a.q((Set)this.d, ((hashCode * 31 + hashCode3) * 31 + hashCode2) * 31, 31);
        final int e = this.e ? 1 : 0;
        int n = 1;
        int n2 = e;
        if (e != 0) {
            n2 = 1;
        }
        final int f = this.f ? 1 : 0;
        if (f == 0) {
            n = f;
        }
        return this.i.hashCode() + brg.d(this.h, brg.d(this.g, ((q + n2) * 31 + n) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final Long c = this.c;
        final Set<AudioSpaceTopicItem> d = this.d;
        final boolean e = this.e;
        final boolean f = this.f;
        final String g = this.g;
        final String h = this.h;
        final NarrowcastSpaceType i = this.i;
        final StringBuilder k = l58.k("RoomHostKudosViewState(roomId=", a, ", title=", b, ", startedAt=");
        k.append(c);
        k.append(", topics=");
        k.append(d);
        k.append(", isAvailableForReplay=");
        l58.l(k, e, ", isAvailableForClipping=", f, ", titleViewText=");
        jba.s(k, g, ", subtitleViewText=", h, ", narrowCastSpaceType=");
        k.append(i);
        k.append(")");
        return k.toString();
    }
}
