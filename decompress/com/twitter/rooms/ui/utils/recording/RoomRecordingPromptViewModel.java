// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.recording;

import java.util.Objects;
import com.twitter.rooms.subsystem.api.args.RoomRecordingPromptArgs;
import com.twitter.rooms.manager.RoomStateManager;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/utils/recording/RoomRecordingPromptViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Llyn;", "Lfyn;", "Ldyn;", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomRecordingPromptViewModel extends MviViewModel<lyn, fyn, dyn>
{
    public static final ape<Object>[] X0;
    public final Context Q0;
    public final eko R0;
    public final RoomStateManager S0;
    public final u7k T0;
    public final oko U0;
    public final nqn V0;
    public final yyh W0;
    
    static {
        X0 = new ape[] { (ape)lb0.h(RoomRecordingPromptViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomRecordingPromptViewModel(final RoomRecordingPromptArgs roomRecordingPromptArgs, final Context q0, final eko r0, final RoomStateManager s0, final u7k t0, final oko u0, final nqn v0, final kcm kcm) {
        e0e.f((Object)roomRecordingPromptArgs, "args");
        e0e.f((Object)q0, "context");
        e0e.f((Object)r0, "roomUtilsFragmentViewEventDispatcher");
        e0e.f((Object)s0, "roomStateManager");
        e0e.f((Object)u0, "roomsScribeReporter");
        e0e.f((Object)v0, "roomJoinSpaceEventDispatcher");
        e0e.f((Object)kcm, "releaseCompletable");
        Objects.requireNonNull(lyn.Companion);
        super((iae)kcm, (ccx)new lyn(roomRecordingPromptArgs.getRoomId(), roomRecordingPromptArgs.getState(), roomRecordingPromptArgs.getRecordingState(), roomRecordingPromptArgs.getAdmins(), roomRecordingPromptArgs.getSpeakers(), roomRecordingPromptArgs.getListeners(), roomRecordingPromptArgs.getRemainingParticipants(), roomRecordingPromptArgs.getPrimaryAdminId(), roomRecordingPromptArgs.getMaxAdminCapacity()));
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = u0;
        this.V0 = v0;
        this.W0 = hfe.v((MviViewModel)this, (stb)new RoomRecordingPromptViewModel$a(this));
    }
    
    public static final void W(final RoomRecordingPromptViewModel roomRecordingPromptViewModel, final lyn lyn, final boolean b) {
        RoomStateManager.q0(roomRecordingPromptViewModel.S0, lyn.d, lyn.e, lyn.f, lyn.g, b, lyn.a, lyn.h, lyn.i, true, false, false, 1536);
        roomRecordingPromptViewModel.V0.a.onNext((Object)kni.a);
    }
    
    public final azh<fyn> v() {
        return (azh<fyn>)this.W0.a((ape)RoomRecordingPromptViewModel.X0[0]);
    }
}
