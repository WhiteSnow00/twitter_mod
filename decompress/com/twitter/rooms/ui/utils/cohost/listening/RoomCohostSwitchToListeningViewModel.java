// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.cohost.listening;

import java.util.Objects;
import com.twitter.rooms.subsystem.api.args.RoomCohostSwitchToListeningArgs;
import com.twitter.rooms.manager.RoomStateManager;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/utils/cohost/listening/RoomCohostSwitchToListeningViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lw8n;", "Lu8n;", "Ls8n;", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomCohostSwitchToListeningViewModel extends MviViewModel<w8n, u8n, s8n>
{
    public static final coe<Object>[] T0;
    public final mjo O0;
    public final vln P0;
    public final RoomStateManager Q0;
    public final vjo R0;
    public final hyh S0;
    
    static {
        T0 = new coe[] { (coe)w9.f((Class)RoomCohostSwitchToListeningViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomCohostSwitchToListeningViewModel(final RoomCohostSwitchToListeningArgs roomCohostSwitchToListeningArgs, final mjo o0, final vln p6, final RoomStateManager q0, final vjo r0, final xbm xbm) {
        czd.f((Object)roomCohostSwitchToListeningArgs, "args");
        czd.f((Object)o0, "roomUtilsFragmentViewEventDispatcher");
        czd.f((Object)p6, "roomGuestActionsEventDispatcher");
        czd.f((Object)q0, "roomStateManager");
        czd.f((Object)r0, "roomsScribeReporter");
        czd.f((Object)xbm, "releaseCompletable");
        Objects.requireNonNull(w8n.Companion);
        super((k9e)xbm, (jbx)new w8n(roomCohostSwitchToListeningArgs.getPeriscopeId(), roomCohostSwitchToListeningArgs.getTwitterId(), roomCohostSwitchToListeningArgs.getBroadcastId(), roomCohostSwitchToListeningArgs.getPreviousView()));
        this.O0 = o0;
        this.P0 = p6;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = ewj.n(this, (qsb)new qsb<jyh<u8n>, fzv>(this) {
            public final RoomCohostSwitchToListeningViewModel D0;
            
            public final Object invoke(final Object o) {
                final jyh jyh = (jyh)o;
                czd.f((Object)jyh, "$this$weaver");
                jyh.a(v9m.a((Class)u8n$b.class), (ftb)new a(this.D0, (go6)null));
                jyh.a(v9m.a((Class)u8n$a.class), (ftb)new b(this.D0, (go6)null));
                return fzv.a;
            }
        });
    }
    
    public final jyh<u8n> v() {
        return (jyh<u8n>)this.S0.a((coe)RoomCohostSwitchToListeningViewModel.T0[0]);
    }
}
