// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.dm_invites;

import com.twitter.rooms.subsystem.api.args.RoomDmInvitesArgs;
import com.twitter.rooms.manager.RoomStateManager;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/utils/dm_invites/RoomDmInvitesViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Loen;", "Lxdn;", "Ludn;", "Companion", "k", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomDmInvitesViewModel extends MviViewModel<oen, xdn, udn>
{
    public static final RoomDmInvitesViewModel.RoomDmInvitesViewModel$k Companion;
    public static final ape<Object>[] W0;
    public static final String X0;
    public final RoomStateManager Q0;
    public final dun R0;
    public final pfv S0;
    public final bun T0;
    public final oko U0;
    public final yyh V0;
    
    static {
        W0 = new ape[] { (ape)lb0.h(RoomDmInvitesViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new RoomDmInvitesViewModel.RoomDmInvitesViewModel$k();
        X0 = "RoomDmInvitesViewModel";
    }
    
    public RoomDmInvitesViewModel(final RoomDmInvitesArgs roomDmInvitesArgs, final kcm kcm, final RoomStateManager q0, final aun aun, final dun r0, final pfv s0, final bun t0, final oko u0) {
        e0e.f((Object)roomDmInvitesArgs, "args");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)q0, "roomStateManager");
        e0e.f((Object)aun, "roomOpenInviteViewEventDispatcher");
        e0e.f((Object)r0, "roomOpenSpaceViewEventDispatcher");
        e0e.f((Object)s0, "roomInviteServiceInteractorDelegate");
        e0e.f((Object)t0, "roomOpenManageSpeakersViewDispatcher");
        e0e.f((Object)u0, "scribeReporter");
        super((iae)kcm, (ccx)new oen(roomDmInvitesArgs.getRoomId(), roomDmInvitesArgs.getInviteType(), roomDmInvitesArgs.getMaxInvites(), 1012));
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = u0;
        this.W(null);
        this.T((stb)new RoomDmInvitesViewModel$b(this));
        MviViewModel.M((MviViewModel)this, (t5j)aun.a, (String)null, (asx)null, (hub)new RoomDmInvitesViewModel$c(this, (mp6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (t5j)q0.C1, (String)null, (asx)null, (hub)new RoomDmInvitesViewModel$d(this, (mp6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, q0.D0((dpe)RoomDmInvitesViewModel$e.F0, new dpe[] { (dpe)RoomDmInvitesViewModel$f.F0, (dpe)RoomDmInvitesViewModel$g.F0, (dpe)RoomDmInvitesViewModel$h.F0, (dpe)RoomDmInvitesViewModel$i.F0, (dpe)RoomDmInvitesViewModel$j.F0 }), (String)null, (asx)null, (hub)new RoomDmInvitesViewModel$a(this, (mp6)null), 3, (Object)null);
        this.V0 = hfe.v((MviViewModel)this, (stb)new RoomDmInvitesViewModel$l(this));
    }
    
    public final void W(final String s) {
        this.C(this.S0.a.a(s).w((rtb)new x2i((stb)ofv.F0, 21)), (stb)new RoomDmInvitesViewModel$m(this));
    }
    
    public final azh<xdn> v() {
        return (azh<xdn>)this.V0.a((ape)RoomDmInvitesViewModel.W0[0]);
    }
}
