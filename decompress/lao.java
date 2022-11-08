import com.twitter.weaver.mvi.MviViewModel;
import java.util.Iterator;
import java.util.Set;
import java.util.Collection;
import com.twitter.rooms.model.AudioSpaceCommunityRoleType;
import com.twitter.rooms.model.RaisedHand;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.ArrayList;
import java.util.Map;
import com.twitter.rooms.manager.RoomStateManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lao extends gue implements rtb<gqn, oyv>
{
    public final /* synthetic */ String C0;
    public final /* synthetic */ long D0;
    public final /* synthetic */ RoomStateManager E0;
    
    public lao(final String c0, final long d0, final RoomStateManager e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final gqn gqn = (gqn)o;
        zzd.f((Object)gqn, "state");
        final Map u1 = vkg.u1((Map)gqn.C);
        u1.put(this.C0, this.D0);
        final Set<RoomUserItem> l = gqn.l;
        final String c0 = this.C0;
        final RoomStateManager e0 = this.E0;
        final ArrayList list = new ArrayList<RoomUserItem>(kr4.h1((Iterable)l, 10));
        for (final RoomUserItem roomUserItem : l) {
            final boolean b = roomUserItem.getUserStatus() == hio.G0;
            RoomUserItem copy$default = roomUserItem;
            Label_0208: {
                if (b) {
                    if (!zzd.a((Object)c0, (Object)roomUserItem.getPeriscopeUserId())) {
                        copy$default = roomUserItem;
                        if (!zzd.a((Object)c0, (Object)roomUserItem.getTwitterUserId())) {
                            break Label_0208;
                        }
                    }
                    if (roomUserItem.isFollowing()) {
                        final kao c2 = kao.C0;
                        final RoomStateManager.k0 companion = RoomStateManager.Companion;
                        e0.G0((rtb)c2);
                    }
                    copy$default = RoomUserItem.copy$default(roomUserItem, (String)null, (String)null, (String)null, false, (String)null, hio.F0, false, false, false, (String)null, (String)null, (Boolean)null, (Boolean)null, false, (RaisedHand)null, false, false, false, false, (Integer)null, (AudioSpaceCommunityRoleType)null, 2097119, (Object)null);
                }
            }
            list.add(copy$default);
        }
        final Set r = ajy.R((Collection)list, u1);
        final RoomStateManager e2 = this.E0;
        final jao jao = new jao(r, u1);
        final RoomStateManager.k0 companion2 = RoomStateManager.Companion;
        ((MviViewModel)e2).Q((rtb)jao);
        return oyv.a;
    }
}
