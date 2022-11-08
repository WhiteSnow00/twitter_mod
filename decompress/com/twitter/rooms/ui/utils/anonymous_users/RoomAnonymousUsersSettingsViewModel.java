// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.anonymous_users;

import java.util.Objects;
import com.twitter.rooms.audiospace.anonymous_users.RoomAnonymousUsersSettingsArgs;
import com.twitter.rooms.manager.RoomStateManager;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/utils/anonymous_users/RoomAnonymousUsersSettingsViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lc0n;", "Lyzm;", "Lwzm;", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomAnonymousUsersSettingsViewModel extends MviViewModel<c0n, yzm, wzm>
{
    public static final /* synthetic */ soe<Object>[] O0;
    public final gyh N0;
    
    static {
        O0 = new soe[] { (soe)hi.m(RoomAnonymousUsersSettingsViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomAnonymousUsersSettingsViewModel(final RoomStateManager roomStateManager, final RoomAnonymousUsersSettingsArgs roomAnonymousUsersSettingsArgs, final ibm ibm) {
        zzd.f((Object)roomStateManager, "roomStateManager");
        zzd.f((Object)roomAnonymousUsersSettingsArgs, "args");
        zzd.f((Object)ibm, "releaseCompletable");
        Objects.requireNonNull(c0n.Companion);
        super((fae)ibm, (oax)new c0n(roomAnonymousUsersSettingsArgs.getRoomId(), roomAnonymousUsersSettingsArgs.getRemainingUsersCount()));
        this.N0 = oyz.f0(this, (rtb)new RoomAnonymousUsersSettingsViewModel$a(this));
    }
    
    public final iyh<yzm> v() {
        return (iyh<yzm>)this.N0.a((soe)RoomAnonymousUsersSettingsViewModel.O0[0]);
    }
}
