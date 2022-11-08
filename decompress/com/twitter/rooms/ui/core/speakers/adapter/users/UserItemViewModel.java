// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.speakers.adapter.users;

import com.twitter.rooms.manager.RoomStateManager;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/core/speakers/adapter/users/UserItemViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lfdw;", "Ledw;", "", "feature.tfa.rooms.ui.core.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class UserItemViewModel extends MviViewModel
{
    public static final /* synthetic */ soe<Object>[] T0;
    public final jig N0;
    public final gjo O0;
    public final xio P0;
    public final yl1 Q0;
    public final lxn R0;
    public final gyh S0;
    
    static {
        T0 = new soe[] { (soe)hi.m(UserItemViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public UserItemViewModel(final hig$c hig$c, final jig n0, final gjo o0, final xio p8, final yl1 q0, final RoomStateManager roomStateManager, final lxn r0, final ibm ibm) {
        zzd.f((Object)hig$c, "item");
        zzd.f((Object)n0, "dispatcher");
        zzd.f((Object)o0, "roomsScribeReporter");
        zzd.f((Object)p8, "roomUtilsFragmentViewEventDispatcher");
        zzd.f((Object)roomStateManager, "roomStateManager");
        zzd.f((Object)r0, "removedListEventDispatcher");
        zzd.f((Object)ibm, "releaseCompletable");
        super((fae)ibm, (oax)new fdw(hig$c, 6));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p8;
        this.Q0 = q0;
        this.R0 = r0;
        MviViewModel.M((MviViewModel)this, roomStateManager.D0((voe)UserItemViewModel$a.C0, new voe[] { (voe)UserItemViewModel$b.C0 }), (String)null, (qqx)null, (gub)new UserItemViewModel$c(this, (ap6)null), 3, (Object)null);
        this.S0 = oyz.f0(this, (rtb)new UserItemViewModel$d(this, hig$c));
    }
    
    public final iyh<edw> v() {
        return (iyh<edw>)this.S0.a((soe)UserItemViewModel.T0[0]);
    }
}
