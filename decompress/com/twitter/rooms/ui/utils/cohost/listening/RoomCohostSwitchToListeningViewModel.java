// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.cohost.listening;

import java.util.Objects;
import com.twitter.rooms.subsystem.api.args.RoomCohostSwitchToListeningArgs;
import com.twitter.rooms.manager.RoomStateManager;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/utils/cohost/listening/RoomCohostSwitchToListeningViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ln9n;", "Ll9n;", "Lj9n;", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomCohostSwitchToListeningViewModel extends MviViewModel<n9n, l9n, j9n>
{
    public static final ape<Object>[] V0;
    public final eko Q0;
    public final nmn R0;
    public final RoomStateManager S0;
    public final oko T0;
    public final yyh U0;
    
    static {
        V0 = new ape[] { (ape)lb0.h(RoomCohostSwitchToListeningViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomCohostSwitchToListeningViewModel(final RoomCohostSwitchToListeningArgs roomCohostSwitchToListeningArgs, final eko q0, final nmn r0, final RoomStateManager s0, final oko t0, final kcm kcm) {
        e0e.f((Object)roomCohostSwitchToListeningArgs, "args");
        e0e.f((Object)q0, "roomUtilsFragmentViewEventDispatcher");
        e0e.f((Object)r0, "roomGuestActionsEventDispatcher");
        e0e.f((Object)s0, "roomStateManager");
        e0e.f((Object)t0, "roomsScribeReporter");
        e0e.f((Object)kcm, "releaseCompletable");
        Objects.requireNonNull(n9n.Companion);
        super((iae)kcm, (ccx)new n9n(roomCohostSwitchToListeningArgs.getPeriscopeId(), roomCohostSwitchToListeningArgs.getTwitterId(), roomCohostSwitchToListeningArgs.getBroadcastId(), roomCohostSwitchToListeningArgs.getPreviousView()));
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = hfe.v((MviViewModel)this, (stb)new RoomCohostSwitchToListeningViewModel$a(this));
    }
    
    public final azh<l9n> v() {
        return (azh<l9n>)this.U0.a((ape)RoomCohostSwitchToListeningViewModel.V0[0]);
    }
}
