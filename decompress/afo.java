import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afo implements ccx
{
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final long e;
    public final String f;
    public final boolean g;
    public final List<AudioSpaceTopicItem> h;
    public final boolean i;
    
    public afo(final String a, final String b, final int c, final String d, final long e, final String f, final boolean g, final List<AudioSpaceTopicItem> h, final boolean i) {
        e0e.f((Object)a, "title");
        e0e.f((Object)b, "creatorName");
        e0e.f((Object)f, "userHandle");
        e0e.f((Object)h, "taggedTopics");
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
        if (!(o instanceof afo)) {
            return false;
        }
        final afo afo = (afo)o;
        return e0e.a((Object)this.a, (Object)afo.a) && e0e.a((Object)this.b, (Object)afo.b) && this.c == afo.c && e0e.a((Object)this.d, (Object)afo.d) && this.e == afo.e && e0e.a((Object)this.f, (Object)afo.f) && this.g == afo.g && e0e.a((Object)this.h, (Object)afo.h) && this.i == afo.i;
    }
    
    @Override
    public final int hashCode() {
        final int d = brg.d(this.b, this.a.hashCode() * 31, 31);
        final int c = this.c;
        final String d2 = this.d;
        int hashCode;
        if (d2 == null) {
            hashCode = 0;
        }
        else {
            hashCode = d2.hashCode();
        }
        final long e = this.e;
        final int d3 = brg.d(this.f, (((d + c) * 31 + hashCode) * 31 + (int)(e ^ e >>> 32)) * 31, 31);
        final int g = this.g ? 1 : 0;
        final int n = 1;
        int n2 = g;
        if (g != 0) {
            n2 = 1;
        }
        final int o = go9.o((List)this.h, (d3 + n2) * 31, 31);
        int i = this.i ? 1 : 0;
        if (i != 0) {
            i = n;
        }
        return o + i;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final int c = this.c;
        final String d = this.d;
        final long e = this.e;
        final String f = this.f;
        final boolean g = this.g;
        final List<AudioSpaceTopicItem> h = this.h;
        final boolean i = this.i;
        final StringBuilder k = l58.k("RoomSubscriptionPromptViewState(title=", a, ", creatorName=", b, ", totalParticipated=");
        bj.A(k, c, ", profileImageUrl=", d, ", creatorId=");
        po.D(k, e, ", userHandle=", f);
        k.append(", isFollowing=");
        k.append(g);
        k.append(", taggedTopics=");
        k.append(h);
        k.append(", isEmployeeOnly=");
        k.append(i);
        k.append(")");
        return k.toString();
    }
}
