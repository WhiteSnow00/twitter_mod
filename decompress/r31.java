import java.util.Comparator;
import java.util.List;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r31
{
    public static final a Companion;
    public static final r31 g;
    public final Set<RoomUserItem> a;
    public final Set<RoomUserItem> b;
    public final Set<RoomUserItem> c;
    public final Set<RoomUserItem> d;
    public final int e;
    public final List<RoomUserItem> f;
    
    static {
        Companion = new a();
        final r3a f0 = r3a.F0;
        g = new r31((Set<RoomUserItem>)f0, (Set<RoomUserItem>)f0, (Set<RoomUserItem>)f0, (Set<RoomUserItem>)f0, 0);
    }
    
    public r31(final Set<RoomUserItem> a, final Set<RoomUserItem> b, final Set<RoomUserItem> c, final Set<RoomUserItem> d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = rr4.b2((Iterable)lop.t0(lop.t0(lop.t0((Set)a, (Iterable)b), (Iterable)c), (Iterable)d), (Comparator)new Comparator() {
            @Override
            public final int compare(final T t, final T t2) {
                return tqb.r((Comparable)((RoomUserItem)t).getUserStatus(), (Comparable)((RoomUserItem)t2).getUserStatus());
            }
        });
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof r31)) {
            return false;
        }
        final r31 r31 = (r31)o;
        return e0e.a((Object)this.a, (Object)r31.a) && e0e.a((Object)this.b, (Object)r31.b) && e0e.a((Object)this.c, (Object)r31.c) && e0e.a((Object)this.d, (Object)r31.d) && this.e == r31.e;
    }
    
    @Override
    public final int hashCode() {
        return z9a.q((Set)this.d, z9a.q((Set)this.c, z9a.q((Set)this.b, this.a.hashCode() * 31, 31), 31), 31) + this.e;
    }
    
    @Override
    public final String toString() {
        final Set<RoomUserItem> a = this.a;
        final Set<RoomUserItem> b = this.b;
        final Set<RoomUserItem> c = this.c;
        final Set<RoomUserItem> d = this.d;
        final int e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("AudioSpaceUserList(admins=");
        sb.append(a);
        sb.append(", speakers=");
        sb.append(b);
        sb.append(", listeners=");
        sb.append(c);
        sb.append(", connectingUsers=");
        sb.append(d);
        sb.append(", remainingParticipants=");
        return ad.y(sb, e, ")");
    }
    
    public static final class a
    {
    }
}
