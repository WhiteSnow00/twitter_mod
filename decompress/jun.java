import com.twitter.rooms.model.helpers.RoomUserItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jun extends pue implements stb<RoomUserItem, Boolean>
{
    public final String F0;
    
    public jun(final String f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final RoomUserItem roomUserItem = (RoomUserItem)o;
        e0e.f((Object)roomUserItem, "it");
        return e0e.a((Object)this.F0, (Object)roomUserItem.getTwitterUserId());
    }
}
