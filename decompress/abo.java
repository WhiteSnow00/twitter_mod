import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.manager.RoomStateManager$k0;
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

public final class abo extends ste implements qsb<vqn, fzv>
{
    public final String D0;
    public final long E0;
    public final RoomStateManager F0;
    
    public abo(final String d0, final long e0, final RoomStateManager f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vqn vqn = (vqn)o;
        czd.f((Object)vqn, "state");
        final Map x0 = tkg.x0((Map)vqn.C);
        x0.put(this.D0, this.E0);
        final Set<RoomUserItem> l = vqn.l;
        final String d0 = this.D0;
        final RoomStateManager f0 = this.F0;
        final ArrayList list = new ArrayList<RoomUserItem>(iq4.H((Iterable)l, 10));
        for (final RoomUserItem roomUserItem : l) {
            final boolean b = roomUserItem.getUserStatus() == wio.H0;
            RoomUserItem copy$default = roomUserItem;
            Label_0203: {
                if (b) {
                    if (!czd.a((Object)d0, (Object)roomUserItem.getPeriscopeUserId())) {
                        copy$default = roomUserItem;
                        if (!czd.a((Object)d0, (Object)roomUserItem.getTwitterUserId())) {
                            break Label_0203;
                        }
                    }
                    if (roomUserItem.isFollowing()) {
                        final zao d2 = zao.D0;
                        final RoomStateManager$k0 companion = RoomStateManager.Companion;
                        f0.G0((qsb)d2);
                    }
                    copy$default = RoomUserItem.copy$default(roomUserItem, null, null, null, false, null, wio.G0, false, false, false, null, null, null, null, false, null, false, false, false, false, null, null, 2097119, null);
                }
            }
            list.add(copy$default);
        }
        final Set g0 = fli.G0((Collection)list, x0);
        final RoomStateManager f2 = this.F0;
        final yao yao = new yao(g0, x0);
        final RoomStateManager$k0 companion2 = RoomStateManager.Companion;
        ((MviViewModel)f2).Q((qsb)yao);
        return fzv.a;
    }
}
