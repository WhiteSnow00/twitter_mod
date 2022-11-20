import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Map;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uio<T> implements Comparator
{
    public final Map D0;
    
    public uio(final Map d0) {
        this.D0 = d0;
    }
    
    @Override
    public final int compare(final T t, final T t2) {
        final RoomUserItem roomUserItem = (RoomUserItem)t;
        final Long n = this.D0.get(roomUserItem.getTwitterUserId());
        long n2 = 0L;
        long n3;
        if (n != null) {
            n3 = n;
        }
        else {
            final Long n4 = this.D0.get(roomUserItem.getPeriscopeUserId());
            if (n4 != null) {
                n3 = n4;
            }
            else {
                n3 = 0L;
            }
        }
        final RoomUserItem roomUserItem2 = (RoomUserItem)t2;
        final Long n5 = this.D0.get(roomUserItem2.getTwitterUserId());
        if (n5 != null) {
            n2 = n5;
        }
        else {
            final Long n6 = this.D0.get(roomUserItem2.getPeriscopeUserId());
            if (n6 != null) {
                n2 = n6;
            }
        }
        return pev.b((Comparable)n3, (Comparable)n2);
    }
}
