// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.schedule.main;

import java.util.Calendar;
import com.twitter.rooms.subsystem.api.args.RoomScheduledSpaceFragmentContentViewArgs;
import com.twitter.util.user.UserIdentifier;
import com.twitter.rooms.manager.RoomScheduleSpaceDelegate;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/core/schedule/main/RoomScheduleViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lp2o;", "Ls1o;", "Lr1o;", "feature.tfa.rooms.ui.core.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomScheduleViewModel extends MviViewModel<p2o, s1o, r1o>
{
    public static final /* synthetic */ soe<Object>[] V0;
    public final w1o N0;
    public final v1o O0;
    public final gjo P0;
    public final RoomScheduleSpaceDelegate Q0;
    public final wdo R0;
    public final saw S0;
    public final UserIdentifier T0;
    public final gyh U0;
    
    static {
        V0 = new soe[] { (soe)hi.m(RoomScheduleViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomScheduleViewModel(final RoomScheduledSpaceFragmentContentViewArgs roomScheduledSpaceFragmentContentViewArgs, final ibm ibm, final w1o n0, final v1o o0, final gjo p10, final RoomScheduleSpaceDelegate q0, final wdo r0, final aeo aeo, final saw s0, final UserIdentifier t0) {
        zzd.f((Object)roomScheduledSpaceFragmentContentViewArgs, "args");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)n0, "roomScheduleSpaceViewDispatcher");
        zzd.f((Object)o0, "roomScheduleSpaceDetailsViewDispatcher");
        zzd.f((Object)p10, "roomsScribeReporter");
        zzd.f((Object)q0, "roomScheduleSpaceDelegate");
        zzd.f((Object)r0, "roomTaggedTopicsDispatcher");
        zzd.f((Object)aeo, "roomTicketManager");
        zzd.f((Object)s0, "userReporter");
        zzd.f((Object)t0, "userIdentifier");
        final hqs$a c = hqs.c;
        final Calendar instance = Calendar.getInstance();
        zzd.e((Object)instance, "getCalendarInstance()");
        final Calendar instance2 = Calendar.getInstance();
        zzd.e((Object)instance2, "getCalendarInstance()");
        instance2.set(instance.get(1), instance.get(2), instance.get(5), instance.get(11), 0);
        instance2.add(10, 1);
        super((fae)ibm, (oax)new p2o(false, 0, null, instance2, false, false, false, false, false, roomScheduledSpaceFragmentContentViewArgs.getHasMaxScheduledSpaces(), roomScheduledSpaceFragmentContentViewArgs.getNarrowCastSpaceType()));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p10;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.Q((rtb)new RoomScheduleViewModel$a(roomScheduledSpaceFragmentContentViewArgs));
        MviViewModel.N((MviViewModel)this, aeo.h(), (String)null, (qqx)null, (gub)new RoomScheduleViewModel$b(this, (ap6)null), 3, (Object)null);
        this.V((Object)r1o$a.a);
        this.U0 = oyz.f0(this, (rtb)new RoomScheduleViewModel$c(this));
    }
    
    public final iyh<s1o> v() {
        return (iyh<s1o>)this.U0.a((soe)RoomScheduleViewModel.V0[0]);
    }
}
