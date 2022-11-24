// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.permissions;

import java.util.Objects;
import com.twitter.rooms.subsystem.api.args.RoomPermissionsArgs;
import com.twitter.util.user.UserIdentifier;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/utils/permissions/RoomPermissionsViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lrun;", "Lw6o;", "Lu6o;", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomPermissionsViewModel extends MviViewModel<run, w6o, u6o>
{
    public static final ape<Object>[] S0;
    public final UserIdentifier Q0;
    public final yyh R0;
    
    static {
        S0 = new ape[] { (ape)lb0.h(RoomPermissionsViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomPermissionsViewModel(final RoomPermissionsArgs roomPermissionsArgs, final eko eko, final nmn nmn, final UserIdentifier q0, final kcm kcm) {
        e0e.f((Object)roomPermissionsArgs, "args");
        e0e.f((Object)eko, "utilsFragmentViewEventDispatcher");
        e0e.f((Object)nmn, "guestActionsEventDispatcher");
        e0e.f((Object)q0, "userIdentifier");
        e0e.f((Object)kcm, "releaseCompletable");
        Objects.requireNonNull(run.Companion);
        super((iae)kcm, (ccx)new run(roomPermissionsArgs.getPreviousView()));
        this.Q0 = q0;
        this.R0 = hfe.v((MviViewModel)this, (stb)new RoomPermissionsViewModel$a(this, nmn, eko));
    }
    
    public final azh<w6o> v() {
        return (azh<w6o>)this.R0.a((ape)RoomPermissionsViewModel.S0[0]);
    }
}
