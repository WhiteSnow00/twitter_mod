// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.decline;

import com.twitter.rooms.audiospace.nudge.RoomDeclineInviteReasonsArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/utils/decline/RoomDeclineInviteReasonsViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lzcn;", "", "Lucn;", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomDeclineInviteReasonsViewModel extends MviViewModel<zcn, Object, ucn>
{
    public RoomDeclineInviteReasonsViewModel(final RoomDeclineInviteReasonsArgs roomDeclineInviteReasonsArgs, final xbm xbm) {
        czd.f((Object)roomDeclineInviteReasonsArgs, "args");
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)new zcn(roomDeclineInviteReasonsArgs.getRoomId(), roomDeclineInviteReasonsArgs.getInvitedBy()));
    }
}
