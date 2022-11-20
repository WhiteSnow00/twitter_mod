// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.recording.edit_name;

import java.util.Set;
import com.twitter.rooms.subsystem.api.args.RoomRecordingEditNameArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/utils/recording/edit_name/RoomRecordingEditNameViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lhxn;", "Laxn;", "Lywn;", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomRecordingEditNameViewModel extends MviViewModel<hxn, axn, ywn>
{
    public static final coe<Object>[] R0;
    public final wu6 O0;
    public final n1o P0;
    public final hyh Q0;
    
    static {
        R0 = new coe[] { (coe)w9.f((Class)RoomRecordingEditNameViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomRecordingEditNameViewModel(final RoomRecordingEditNameArgs roomRecordingEditNameArgs, final wu6 o0, final n1o p4, final xbm xbm) {
        czd.f((Object)roomRecordingEditNameArgs, "args");
        czd.f((Object)o0, "cookieAuthedRepository");
        czd.f((Object)p4, "roomReplayEventDispatcher");
        czd.f((Object)xbm, "releaseCompletable");
        final String roomId = roomRecordingEditNameArgs.getRoomId();
        String spaceName = roomRecordingEditNameArgs.getSpaceName();
        if (spaceName == null) {
            spaceName = "";
        }
        String spaceName2 = roomRecordingEditNameArgs.getSpaceName();
        if (spaceName2 == null) {
            spaceName2 = "";
        }
        super((k9e)xbm, (jbx)new hxn(roomId, spaceName, spaceName2, roomRecordingEditNameArgs.getTopicIds(), false));
        this.O0 = o0;
        this.P0 = p4;
        this.Q0 = ewj.n(this, (qsb)new qsb<jyh<axn>, fzv>(this) {
            public final RoomRecordingEditNameViewModel D0;
            
            public final Object invoke(final Object o) {
                final jyh jyh = (jyh)o;
                czd.f((Object)jyh, "$this$weaver");
                jyh.a(v9m.a((Class)axn$c.class), (ftb)new a(this.D0, (go6)null));
                jyh.a(v9m.a((Class)axn$b.class), (ftb)new b(this.D0, (go6)null));
                jyh.a(v9m.a((Class)axn$a.class), (ftb)new c(this.D0, (go6)null));
                return fzv.a;
            }
        });
    }
    
    public final jyh<axn> v() {
        return (jyh<axn>)this.Q0.a((coe)RoomRecordingEditNameViewModel.R0[0]);
    }
}
