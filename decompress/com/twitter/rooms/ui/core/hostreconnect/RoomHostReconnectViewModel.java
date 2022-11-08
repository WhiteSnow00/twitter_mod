// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.hostreconnect;

import com.twitter.rooms.subsystem.api.args.RoomHostReconnectFragmentArgs;
import com.twitter.rooms.manager.RoomStateManager;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/core/hostreconnect/RoomHostReconnectViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lcon;", "Lnnn;", "Lknn;", "feature.tfa.rooms.ui.core.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomHostReconnectViewModel extends MviViewModel<con, nnn, knn>
{
    public static final /* synthetic */ soe<Object>[] U0;
    public final RoomStateManager N0;
    public final lnn O0;
    public final gjo P0;
    public final g6n Q0;
    public final ocw R0;
    public final lio S0;
    public final gyh T0;
    
    static {
        U0 = new soe[] { (soe)hi.m(RoomHostReconnectViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomHostReconnectViewModel(final ibm ibm, final RoomStateManager n0, final lnn o0, final gjo p8, final g6n q0, final ocw r0, final lio s0, final RoomHostReconnectFragmentArgs roomHostReconnectFragmentArgs) {
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)n0, "roomStateManager");
        zzd.f((Object)o0, "roomHostReconnectEventDispatcher");
        zzd.f((Object)p8, "roomsScribeReporter");
        zzd.f((Object)q0, "audioSpacesRepository");
        zzd.f((Object)r0, "userInfo");
        zzd.f((Object)s0, "roomUsersCache");
        zzd.f((Object)roomHostReconnectFragmentArgs, "args");
        super((fae)ibm, (oax)new con(roomHostReconnectFragmentArgs.getRoomId(), 4094));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p8;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        final String roomId = roomHostReconnectFragmentArgs.getRoomId();
        this.C((n9q)q0.h(roomId), (rtb)new znn(this, roomId));
        MviViewModel.M((MviViewModel)this, (b5j)o0.b, (String)null, (qqx)null, (gub)new RoomHostReconnectViewModel$a(this, (ap6)null), 3, (Object)null);
        this.T0 = oyz.f0(this, (rtb)new rtb<iyh<nnn>, oyv>() {
            public final /* synthetic */ RoomHostReconnectViewModel C0;
            
            public final Object invoke(final Object o) {
                final iyh iyh = (iyh)o;
                zzd.f((Object)iyh, "$this$weaver");
                iyh.a(g9m.a((Class)nnn$c.class), (gub)new a(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)nnn$b.class), (gub)new b(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)nnn$a.class), (gub)new c(this.C0, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public final iyh<nnn> v() {
        return (iyh<nnn>)this.T0.a((soe)RoomHostReconnectViewModel.U0[0]);
    }
}
