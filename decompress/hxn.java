import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxn implements jbx
{
    public final String a;
    public final String b;
    public final String c;
    public final Set<String> d;
    public final boolean e;
    
    public hxn(final String a, final String b, final String c, final Set<String> d, final boolean e) {
        czd.f((Object)a, "roomId");
        czd.f((Object)d, "topicIds");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hxn)) {
            return false;
        }
        final hxn hxn = (hxn)o;
        return czd.a((Object)this.a, (Object)hxn.a) && czd.a((Object)this.b, (Object)hxn.b) && czd.a((Object)this.c, (Object)hxn.c) && czd.a((Object)this.d, (Object)hxn.d) && this.e == hxn.e;
    }
    
    @Override
    public final int hashCode() {
        final int b = zip.b((Set)this.d, hmg.f(this.c, hmg.f(this.b, this.a.hashCode() * 31, 31), 31), 31);
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        return b + e;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final Set<String> d = this.d;
        final boolean e = this.e;
        final StringBuilder q = tqf.q("RoomRecordingEditNameViewState(roomId=", a, ", initialTitle=", b, ", newTitle=");
        q.append(c);
        q.append(", topicIds=");
        q.append(d);
        q.append(", saveButtonEnabled=");
        return wnj.D(q, e, ")");
    }
}
