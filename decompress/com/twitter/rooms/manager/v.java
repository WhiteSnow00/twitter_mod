// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import com.twitter.rooms.model.AudioSpaceCommunityRoleType;
import com.twitter.rooms.model.RaisedHand;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.ArrayList;
import com.twitter.rooms.di.room.RoomObjectGraph;

public final class v extends ste implements qsb<vqn, fzv>
{
    public final Boolean D0;
    public final boolean E0;
    public final RoomObjectGraph F0;
    public final RoomStateManager G0;
    
    public v(final Boolean d0, final boolean e0, final RoomObjectGraph f0, final RoomStateManager g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final vqn vqn = (vqn)o;
        czd.f((Object)vqn, "state");
        final Boolean d0 = this.D0;
        boolean booleanValue;
        if (d0 != null) {
            booleanValue = d0;
        }
        else {
            booleanValue = !vqn.c;
        }
        if (!czd.a((Object)vqn.A, (Object)Boolean.TRUE) || blz.I(vqn) || !this.E0) {
            if (booleanValue) {
                this.F0.h0().p();
            }
            else {
                this.F0.h0().k();
            }
            final Set<RoomUserItem> m = vqn.m;
            final RoomStateManager g0 = this.G0;
            final ArrayList list = new ArrayList<RoomUserItem>(iq4.H((Iterable)m, 10));
            for (RoomUserItem copy$default : m) {
                final RoomUserItem roomUserItem = copy$default;
                if (g0.t0(roomUserItem, g0.U0.n(), Long.valueOf(g0.m0().getId()))) {
                    copy$default = RoomUserItem.copy$default(roomUserItem, null, null, null, false, null, null, false, false, false, null, null, null, booleanValue, false, null, false, false, false, false, null, null, 2093047, null);
                }
                list.add(copy$default);
            }
            final Set<RoomUserItem> n = vqn.n;
            final RoomStateManager g2 = this.G0;
            final ArrayList list2 = new ArrayList<RoomUserItem>(iq4.H((Iterable)n, 10));
            for (RoomUserItem copy$default2 : n) {
                final RoomUserItem roomUserItem2 = copy$default2;
                if (g2.t0(roomUserItem2, g2.U0.n(), Long.valueOf(g2.m0().getId()))) {
                    copy$default2 = RoomUserItem.copy$default(roomUserItem2, null, null, null, false, null, null, false, false, false, null, null, null, booleanValue, false, null, false, false, false, false, null, null, 2093047, null);
                }
                list2.add(copy$default2);
            }
            final djo a = djo.a;
            if (asa.b().b("android_audio_room_admin_mute_speakers_enabled", false)) {
                final String id = this.G0.U0.q().id;
                czd.e((Object)id, "userCache.currentUser.id");
                o = new gio$a$e(booleanValue, id, vqn.b, vqn.i);
                this.G0.e1.a((gio$a)o);
            }
            final RoomStateManager g3 = this.G0;
            final u u = new u(booleanValue, vqn, (List<RoomUserItem>)list, (List<RoomUserItem>)list2);
            final RoomStateManager$k0 companion = RoomStateManager.Companion;
            ((MviViewModel)g3).Q((qsb)u);
        }
        return fzv.a;
    }
}
