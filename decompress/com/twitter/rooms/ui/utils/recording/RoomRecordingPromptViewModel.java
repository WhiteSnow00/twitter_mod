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

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/utils/recording/RoomRecordingPromptViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ltxn;", "Lnxn;", "Llxn;", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomRecordingPromptViewModel extends MviViewModel<txn, nxn, lxn>
{
    public static final coe<Object>[] V0;
    public final Context O0;
    public final mjo P0;
    public final RoomStateManager Q0;
    public final g7k R0;
    public final vjo S0;
    public final xpn T0;
    public final hyh U0;
    
    static {
        V0 = new coe[] { (coe)w9.f((Class)RoomRecordingPromptViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomRecordingPromptViewModel(final RoomRecordingPromptArgs roomRecordingPromptArgs, final Context o0, final mjo p8, final RoomStateManager q0, final g7k r0, final vjo s0, final xpn t0, final xbm xbm) {
        czd.f((Object)roomRecordingPromptArgs, "args");
        czd.f((Object)o0, "context");
        czd.f((Object)p8, "roomUtilsFragmentViewEventDispatcher");
        czd.f((Object)q0, "roomStateManager");
        czd.f((Object)s0, "roomsScribeReporter");
        czd.f((Object)t0, "roomJoinSpaceEventDispatcher");
        czd.f((Object)xbm, "releaseCompletable");
        Objects.requireNonNull(txn.Companion);
        super((k9e)xbm, (jbx)new txn(roomRecordingPromptArgs.getRoomId(), roomRecordingPromptArgs.getState(), roomRecordingPromptArgs.getRecordingState(), roomRecordingPromptArgs.getAdmins(), roomRecordingPromptArgs.getSpeakers(), roomRecordingPromptArgs.getListeners(), roomRecordingPromptArgs.getRemainingParticipants(), roomRecordingPromptArgs.getPrimaryAdminId(), roomRecordingPromptArgs.getMaxAdminCapacity()));
        this.O0 = o0;
        this.P0 = p8;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = ewj.n(this, (qsb)new qsb<jyh<nxn>, fzv>(this) {
            public final RoomRecordingPromptViewModel D0;
            
            public final Object invoke(final Object o) {
                final jyh jyh = (jyh)o;
                czd.f((Object)jyh, "$this$weaver");
                jyh.a(v9m.a((Class)nxn$a.class), (ftb)new a(this.D0, (go6)null));
                jyh.a(v9m.a((Class)nxn$b.class), (ftb)new b(this.D0, (go6)null));
                return fzv.a;
            }
        });
    }
    
    public static final void W(final RoomRecordingPromptViewModel roomRecordingPromptViewModel, final txn txn, final boolean b) {
        RoomStateManager.q0(roomRecordingPromptViewModel.Q0, txn.d, txn.e, txn.f, txn.g, b, txn.a, txn.h, txn.i, true, false, false, 1536);
        roomRecordingPromptViewModel.T0.a.onNext((Object)tmi.a);
    }
    
    public final jyh<nxn> v() {
        return (jyh<nxn>)this.U0.a((coe)RoomRecordingPromptViewModel.V0[0]);
    }
}
