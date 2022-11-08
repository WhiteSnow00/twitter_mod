// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.schedule.multi;

import java.util.List;
import com.twitter.rooms.subsystem.api.args.RoomMultiScheduledSpacesArgs;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/core/schedule/multi/RoomMultiScheduledSpacesViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Luqn;", "Lmqn;", "Lkqn;", "Companion", "b", "feature.tfa.rooms.ui.core.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomMultiScheduledSpacesViewModel extends MviViewModel<uqn, mqn, kqn>
{
    public static final RoomMultiScheduledSpacesViewModel.RoomMultiScheduledSpacesViewModel$b Companion;
    public static final /* synthetic */ soe<Object>[] Q0;
    public final Context N0;
    public final huo O0;
    public final gyh P0;
    
    static {
        Q0 = new soe[] { (soe)hi.m(RoomMultiScheduledSpacesViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new RoomMultiScheduledSpacesViewModel.RoomMultiScheduledSpacesViewModel$b();
    }
    
    public RoomMultiScheduledSpacesViewModel(final Context n0, final RoomMultiScheduledSpacesArgs roomMultiScheduledSpacesArgs, final huo o0, final g6n g6n, final gjo gjo, final ibm ibm) {
        zzd.f((Object)n0, "context");
        zzd.f((Object)roomMultiScheduledSpacesArgs, "args");
        zzd.f((Object)o0, "scheduleSpaceRepository");
        zzd.f((Object)g6n, "audioSpacesRepository");
        zzd.f((Object)gjo, "roomsScribeReporter");
        zzd.f((Object)ibm, "releaseCompletable");
        super((fae)ibm, (oax)new uqn((List<? extends ksh>)v2a.C0, false, roomMultiScheduledSpacesArgs.getShowHeader()));
        this.N0 = n0;
        this.O0 = o0;
        gjo.K("", "impression");
        this.W();
        MviViewModel.M((MviViewModel)this, (b5j)g6n.b(), (String)null, (qqx)null, (gub)new RoomMultiScheduledSpacesViewModel$a(this, (ap6)null), 3, (Object)null);
        this.P0 = oyz.f0(this, (rtb)new RoomMultiScheduledSpacesViewModel$d(this));
    }
    
    public final void W() {
        MviViewModel.N((MviViewModel)this, (n9q)this.O0.c(), (String)null, (qqx)null, (gub)new RoomMultiScheduledSpacesViewModel$c(this, (ap6)null), 3, (Object)null);
    }
    
    public final iyh<mqn> v() {
        return (iyh<mqn>)this.P0.a((soe)RoomMultiScheduledSpacesViewModel.Q0[0]);
    }
}
