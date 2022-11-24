// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.anonymous_users;

import java.util.Objects;
import com.twitter.rooms.audiospace.anonymous_users.RoomAnonymousUsersSettingsArgs;
import com.twitter.rooms.manager.RoomStateManager;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/utils/anonymous_users/RoomAnonymousUsersSettingsViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lh1n;", "Ld1n;", "Lb1n;", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomAnonymousUsersSettingsViewModel extends MviViewModel<h1n, d1n, b1n>
{
    public static final ape<Object>[] R0;
    public final yyh Q0;
    
    static {
        R0 = new ape[] { (ape)lb0.h(RoomAnonymousUsersSettingsViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomAnonymousUsersSettingsViewModel(final RoomStateManager roomStateManager, final RoomAnonymousUsersSettingsArgs roomAnonymousUsersSettingsArgs, final kcm kcm) {
        e0e.f((Object)roomStateManager, "roomStateManager");
        e0e.f((Object)roomAnonymousUsersSettingsArgs, "args");
        e0e.f((Object)kcm, "releaseCompletable");
        Objects.requireNonNull(h1n.Companion);
        super((iae)kcm, (ccx)new h1n(roomAnonymousUsersSettingsArgs.getRoomId(), roomAnonymousUsersSettingsArgs.getRemainingUsersCount()));
        this.Q0 = hfe.v((MviViewModel)this, (stb)new RoomAnonymousUsersSettingsViewModel$a(this));
    }
    
    public final azh<d1n> v() {
        return (azh<d1n>)this.Q0.a((ape)RoomAnonymousUsersSettingsViewModel.R0[0]);
    }
}
