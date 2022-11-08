// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.cohost.invite;

import java.util.Objects;
import com.twitter.rooms.cohost.invite.RoomCohostInviteArgs;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/utils/cohost/invite/RoomCohostInviteViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ld8n;", "Lw7n;", "Lu7n;", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomCohostInviteViewModel extends MviViewModel<d8n, w7n, u7n>
{
    public static final /* synthetic */ soe<Object>[] V0;
    public final Context N0;
    public final xio O0;
    public final wmn P0;
    public final iln Q0;
    public final y6k R0;
    public final gjo S0;
    public final ocw T0;
    public final gyh U0;
    
    static {
        V0 = new soe[] { (soe)hi.m(RoomCohostInviteViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomCohostInviteViewModel(final RoomCohostInviteArgs roomCohostInviteArgs, final Context n0, final ibm ibm, final xio o0, final wmn p9, final iln q0, final y6k r0, final gjo s0, final ocw t0) {
        zzd.f((Object)roomCohostInviteArgs, "args");
        zzd.f((Object)n0, "context");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)o0, "roomUtilsFragmentViewEventDispatcher");
        zzd.f((Object)p9, "hostEventDispatcher");
        zzd.f((Object)q0, "guestActionsEventDispatcher");
        zzd.f((Object)s0, "roomsScribeReporter");
        zzd.f((Object)t0, "userInfo");
        Objects.requireNonNull(d8n.Companion);
        super((fae)ibm, (oax)new d8n(roomCohostInviteArgs.getInvites(), roomCohostInviteArgs.isHost(), roomCohostInviteArgs.isSpaceRecording(), 1));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p9;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = oyz.f0(this, (rtb)new RoomCohostInviteViewModel$a(this));
    }
    
    public final iyh<w7n> v() {
        return (iyh<w7n>)this.U0.a((soe)RoomCohostInviteViewModel.V0[0]);
    }
}
