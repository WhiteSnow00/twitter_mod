// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.cohost.invite;

import java.util.Objects;
import com.twitter.rooms.cohost.invite.RoomCohostInviteArgs;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/utils/cohost/invite/RoomCohostInviteViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Li9n;", "Lb9n;", "Lz8n;", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomCohostInviteViewModel extends MviViewModel<i9n, b9n, z8n>
{
    public static final ape<Object>[] Y0;
    public final Context Q0;
    public final eko R0;
    public final bon S0;
    public final nmn T0;
    public final u7k U0;
    public final oko V0;
    public final qdw W0;
    public final yyh X0;
    
    static {
        Y0 = new ape[] { (ape)lb0.h(RoomCohostInviteViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomCohostInviteViewModel(final RoomCohostInviteArgs roomCohostInviteArgs, final Context q0, final kcm kcm, final eko r0, final bon s0, final nmn t0, final u7k u0, final oko v0, final qdw w0) {
        e0e.f((Object)roomCohostInviteArgs, "args");
        e0e.f((Object)q0, "context");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)r0, "roomUtilsFragmentViewEventDispatcher");
        e0e.f((Object)s0, "hostEventDispatcher");
        e0e.f((Object)t0, "guestActionsEventDispatcher");
        e0e.f((Object)v0, "roomsScribeReporter");
        e0e.f((Object)w0, "userInfo");
        Objects.requireNonNull(i9n.Companion);
        super((iae)kcm, (ccx)new i9n(roomCohostInviteArgs.getInvites(), roomCohostInviteArgs.isHost(), roomCohostInviteArgs.isSpaceRecording(), 1));
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = u0;
        this.V0 = v0;
        this.W0 = w0;
        this.X0 = hfe.v((MviViewModel)this, (stb)new RoomCohostInviteViewModel$a(this));
    }
    
    public final azh<b9n> v() {
        return (azh<b9n>)this.X0.a((ape)RoomCohostInviteViewModel.Y0[0]);
    }
}
