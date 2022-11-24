import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w9n<T> implements Comparator
{
    @Override
    public final int compare(final T t, final T t2) {
        return tqb.r((Comparable)((RoomUserItem)t).getUserStatus(), (Comparable)((RoomUserItem)t2).getUserStatus());
    }
}
