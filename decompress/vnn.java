import tv.periscope.model.NarrowcastSpaceType;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vnn implements jbx
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
    
    public vnn(final String a, final String b, final Long c, final Set<AudioSpaceTopicItem> d, final boolean e, final boolean f, final String g, final String h, final NarrowcastSpaceType i) {
        czd.f((Object)a, "roomId");
        czd.f((Object)d, "topics");
        czd.f((Object)i, "narrowCastSpaceType");
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
        if (!(o instanceof vnn)) {
            return false;
        }
        final vnn vnn = (vnn)o;
        return czd.a((Object)this.a, (Object)vnn.a) && czd.a((Object)this.b, (Object)vnn.b) && czd.a((Object)this.c, (Object)vnn.c) && czd.a((Object)this.d, (Object)vnn.d) && this.e == vnn.e && this.f == vnn.f && czd.a((Object)this.g, (Object)vnn.g) && czd.a((Object)this.h, (Object)vnn.h) && czd.a((Object)this.i, (Object)vnn.i);
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
        final int b2 = zip.b((Set)this.d, ((hashCode * 31 + hashCode3) * 31 + hashCode2) * 31, 31);
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
        return this.i.hashCode() + hmg.f(this.h, hmg.f(this.g, ((b2 + n2) * 31 + n) * 31, 31), 31);
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
        final StringBuilder q = tqf.q("RoomHostKudosViewState(roomId=", a, ", title=", b, ", startedAt=");
        q.append(c);
        q.append(", topics=");
        q.append(d);
        q.append(", isAvailableForReplay=");
        jg9.u(q, e, ", isAvailableForClipping=", f, ", titleViewText=");
        nb0.z(q, g, ", subtitleViewText=", h, ", narrowCastSpaceType=");
        q.append(i);
        q.append(")");
        return q.toString();
    }
}
