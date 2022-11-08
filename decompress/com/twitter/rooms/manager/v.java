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

public final class v extends gue implements rtb<gqn, oyv>
{
    public final /* synthetic */ Boolean C0;
    public final /* synthetic */ boolean D0;
    public final /* synthetic */ RoomObjectGraph E0;
    public final /* synthetic */ RoomStateManager F0;
    
    public v(final Boolean c0, final boolean d0, final RoomObjectGraph e0, final RoomStateManager f0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final gqn gqn = (gqn)o;
        zzd.f((Object)gqn, "state");
        final Boolean c0 = this.C0;
        boolean booleanValue;
        if (c0 != null) {
            booleanValue = c0;
        }
        else {
            booleanValue = !gqn.c;
        }
        if (!zzd.a((Object)gqn.A, (Object)Boolean.TRUE) || tdy.V(gqn) || !this.D0) {
            if (booleanValue) {
                this.E0.h0().q();
            }
            else {
                this.E0.h0().l();
            }
            final Set<RoomUserItem> m = gqn.m;
            final RoomStateManager f0 = this.F0;
            final ArrayList list = new ArrayList<RoomUserItem>(kr4.h1((Iterable)m, 10));
            for (RoomUserItem copy$default : m) {
                final RoomUserItem roomUserItem = copy$default;
                if (f0.t0(roomUserItem, f0.T0.n(), Long.valueOf(f0.m0().getId()))) {
                    copy$default = RoomUserItem.copy$default(roomUserItem, (String)null, (String)null, (String)null, false, (String)null, (hio)null, false, false, false, (String)null, (String)null, (Boolean)null, Boolean.valueOf(booleanValue), false, (RaisedHand)null, false, false, false, false, (Integer)null, (AudioSpaceCommunityRoleType)null, 2093047, (Object)null);
                }
                list.add(copy$default);
            }
            final Set<RoomUserItem> n = gqn.n;
            final RoomStateManager f2 = this.F0;
            final ArrayList list2 = new ArrayList<RoomUserItem>(kr4.h1((Iterable)n, 10));
            for (RoomUserItem copy$default2 : n) {
                final RoomUserItem roomUserItem2 = copy$default2;
                if (f2.t0(roomUserItem2, f2.T0.n(), Long.valueOf(f2.m0().getId()))) {
                    copy$default2 = RoomUserItem.copy$default(roomUserItem2, (String)null, (String)null, (String)null, false, (String)null, (hio)null, false, false, false, (String)null, (String)null, (Boolean)null, Boolean.valueOf(booleanValue), false, (RaisedHand)null, false, false, false, false, (Integer)null, (AudioSpaceCommunityRoleType)null, 2093047, (Object)null);
                }
                list2.add(copy$default2);
            }
            final oio a = oio.a;
            if (dta.b().b("android_audio_room_admin_mute_speakers_enabled", false)) {
                final String id = this.F0.T0.q().id;
                zzd.e((Object)id, "userCache.currentUser.id");
                o = new rho$a$e(booleanValue, id, gqn.b, gqn.i);
                this.F0.d1.a((rho$a)o);
            }
            final RoomStateManager f3 = this.F0;
            final u u = new u(booleanValue, gqn, (List<RoomUserItem>)list, (List<RoomUserItem>)list2);
            final RoomStateManager.k0 companion = RoomStateManager.Companion;
            ((MviViewModel)f3).Q((rtb)u);
        }
        return oyv.a;
    }
}
