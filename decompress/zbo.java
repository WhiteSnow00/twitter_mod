import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.manager.RoomStateManager$k0;
import java.util.Iterator;
import java.util.Set;
import com.twitter.rooms.model.AudioSpaceCommunityRoleType;
import com.twitter.rooms.model.RaisedHand;
import java.util.Collection;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Map;
import com.twitter.rooms.manager.RoomStateManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zbo extends ste implements qsb<vqn, fzv>
{
    public final String D0;
    public final RoomStateManager E0;
    public final long F0;
    
    public zbo(final String d0, final RoomStateManager e0, final long f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(Object next) {
        final vqn vqn = (vqn)next;
        czd.f((Object)vqn, "state");
        final Map x0 = tkg.x0((Map)vqn.q);
        final Map x2 = tkg.x0((Map)vqn.C);
        x2.remove(this.D0);
        final Set q0 = mq4.Q0((Iterable)vqn.m);
        final String d0 = this.D0;
        czd.f((Object)d0, "userId");
        final Iterator iterator = q0.iterator();
        while (true) {
            while (iterator.hasNext()) {
                next = iterator.next();
                if (czd.a((Object)d0, (Object)((RoomUserItem)next).getPeriscopeUserId())) {
                    final RoomUserItem roomUserItem = (RoomUserItem)next;
                    next = new ttn(d0);
                    boolean b = true;
                    kq4.Q((Iterable)q0, (qsb)next);
                    final Map x3 = tkg.x0((Map)vqn.r);
                    Long value;
                    if (roomUserItem != null) {
                        value = roomUserItem.getTwitterUserIdLong();
                    }
                    else {
                        value = null;
                    }
                    final Long n = ckv.c((Object)x3).remove(value);
                    final Set<RoomUserItem> l = vqn.l;
                    final RoomStateManager e0 = this.E0;
                    final String d2 = this.D0;
                    Label_0276: {
                        if (!(l instanceof Collection) || !l.isEmpty()) {
                            for (final RoomUserItem roomUserItem2 : l) {
                                final RoomStateManager$k0 companion = RoomStateManager.Companion;
                                if (e0.t0(roomUserItem2, d2, (Long)null)) {
                                    break Label_0276;
                                }
                            }
                        }
                        b = false;
                    }
                    if (!b && roomUserItem != null) {
                        x0.put(this.D0, new lvj((Object)RoomUserItem.copy$default(roomUserItem, null, null, null, false, null, wio.F0, false, false, false, null, null, null, null, false, null, false, false, false, false, null, null, 2097119, null), (Object)(this.F0 + 15000L)));
                    }
                    final RoomStateManager e2 = this.E0;
                    final ybo ybo = new ybo(q0, x0, x3, x2);
                    final RoomStateManager$k0 companion2 = RoomStateManager.Companion;
                    ((MviViewModel)e2).Q((qsb)ybo);
                    return fzv.a;
                }
            }
            next = null;
            continue;
        }
    }
}
