// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.schedule.ticketing;

import com.twitter.rooms.subsystem.api.args.RoomScheduledSpaceTicketFragmentContentViewArgs;
import com.twitter.util.user.UserIdentifier;
import com.twitter.rooms.manager.RoomScheduleSpaceDelegate;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/core/schedule/ticketing/RoomScheduledSpaceTicketViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lf5o;", "Le5o;", "Ld5o;", "feature.tfa.rooms.ui.core.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomScheduledSpaceTicketViewModel extends MviViewModel<f5o, e5o, d5o>
{
    public static final /* synthetic */ soe<Object>[] V0;
    public final w1o N0;
    public final RoomScheduleSpaceDelegate O0;
    public final v1o P0;
    public final UserIdentifier Q0;
    public final aeo R0;
    public final saw S0;
    public final RoomScheduledSpaceTicketFragmentContentViewArgs T0;
    public final gyh U0;
    
    static {
        V0 = new soe[] { (soe)hi.m(RoomScheduledSpaceTicketViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomScheduledSpaceTicketViewModel(final ibm ibm, final w1o n0, final RoomScheduleSpaceDelegate o0, final v1o p8, final UserIdentifier q0, final aeo r0, final saw s0, final RoomScheduledSpaceTicketFragmentContentViewArgs t0) {
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)n0, "roomScheduleSpaceViewDispatcher");
        zzd.f((Object)o0, "roomScheduleSpaceDelegate");
        zzd.f((Object)p8, "roomScheduleSpaceDetailsViewDispatcher");
        zzd.f((Object)q0, "userIdentifier");
        zzd.f((Object)r0, "roomTicketManager");
        zzd.f((Object)s0, "userReporter");
        zzd.f((Object)t0, "args");
        super((fae)ibm, (oax)new f5o(0, (f5o$a)null, false, 7, (hg8)null));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p8;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = oyz.f0(this, (rtb)new RoomScheduledSpaceTicketViewModel$c(this));
        MviViewModel.N((MviViewModel)this, (n9q)new taq((ubq)r0.h(), (qtb)new xuo((rtb)new RoomScheduledSpaceTicketViewModel$a(this), 2)), (String)null, (qqx)null, (gub)new RoomScheduledSpaceTicketViewModel$b(this, (ap6)null), 3, (Object)null);
    }
    
    public final iyh<e5o> v() {
        return (iyh<e5o>)this.U0.a((soe)RoomScheduledSpaceTicketViewModel.V0[0]);
    }
}
