// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.anonymous_users;

import java.util.Objects;
import com.twitter.rooms.audiospace.anonymous_users.RoomAnonymousUsersSettingsArgs;
import com.twitter.rooms.manager.RoomStateManager;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/utils/anonymous_users/RoomAnonymousUsersSettingsViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lr0n;", "Ln0n;", "Ll0n;", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomAnonymousUsersSettingsViewModel extends MviViewModel<r0n, n0n, l0n>
{
    public static final coe<Object>[] P0;
    public final hyh O0;
    
    static {
        P0 = new coe[] { (coe)w9.f((Class)RoomAnonymousUsersSettingsViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomAnonymousUsersSettingsViewModel(final RoomStateManager roomStateManager, final RoomAnonymousUsersSettingsArgs roomAnonymousUsersSettingsArgs, final xbm xbm) {
        czd.f((Object)roomStateManager, "roomStateManager");
        czd.f((Object)roomAnonymousUsersSettingsArgs, "args");
        czd.f((Object)xbm, "releaseCompletable");
        Objects.requireNonNull(r0n.Companion);
        super((k9e)xbm, (jbx)new r0n(roomAnonymousUsersSettingsArgs.getRoomId(), roomAnonymousUsersSettingsArgs.getRemainingUsersCount()));
        this.O0 = ewj.n(this, (qsb)new qsb<jyh<n0n>, fzv>(this) {
            public final RoomAnonymousUsersSettingsViewModel D0;
            
            public final Object invoke(final Object o) {
                final jyh jyh = (jyh)o;
                czd.f((Object)jyh, "$this$weaver");
                jyh.a(v9m.a((Class)n0n$a.class), (ftb)new a(this.D0, (go6)null));
                return fzv.a;
            }
        });
    }
    
    public final jyh<n0n> v() {
        return (jyh<n0n>)this.O0.a((coe)RoomAnonymousUsersSettingsViewModel.P0[0]);
    }
}
