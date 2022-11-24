// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.recording.edit_name;

import com.twitter.rooms.subsystem.api.args.RoomRecordingEditNameArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/utils/recording/edit_name/RoomRecordingEditNameViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lzxn;", "Lsxn;", "Lqxn;", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomRecordingEditNameViewModel extends MviViewModel<zxn, sxn, qxn>
{
    public static final ape<Object>[] T0;
    public final cw6 Q0;
    public final g2o R0;
    public final yyh S0;
    
    static {
        T0 = new ape[] { (ape)lb0.h(RoomRecordingEditNameViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomRecordingEditNameViewModel(final RoomRecordingEditNameArgs roomRecordingEditNameArgs, final cw6 q0, final g2o r0, final kcm kcm) {
        e0e.f((Object)roomRecordingEditNameArgs, "args");
        e0e.f((Object)q0, "cookieAuthedRepository");
        e0e.f((Object)r0, "roomReplayEventDispatcher");
        e0e.f((Object)kcm, "releaseCompletable");
        final String roomId = roomRecordingEditNameArgs.getRoomId();
        String spaceName = roomRecordingEditNameArgs.getSpaceName();
        if (spaceName == null) {
            spaceName = "";
        }
        String spaceName2 = roomRecordingEditNameArgs.getSpaceName();
        if (spaceName2 == null) {
            spaceName2 = "";
        }
        super((iae)kcm, (ccx)new zxn(roomId, spaceName, spaceName2, roomRecordingEditNameArgs.getTopicIds(), false));
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = hfe.v((MviViewModel)this, (stb)new RoomRecordingEditNameViewModel$a(this));
    }
    
    public final azh<sxn> v() {
        return (azh<sxn>)this.S0.a((ape)RoomRecordingEditNameViewModel.T0[0]);
    }
}
