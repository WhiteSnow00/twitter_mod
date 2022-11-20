// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.permissions;

import java.util.Objects;
import com.twitter.rooms.subsystem.api.args.RoomPermissionsArgs;
import com.twitter.util.user.UserIdentifier;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/utils/permissions/RoomPermissionsViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lbun;", "Ld6o;", "Lb6o;", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomPermissionsViewModel extends MviViewModel<bun, d6o, b6o>
{
    public static final coe<Object>[] Q0;
    public final UserIdentifier O0;
    public final hyh P0;
    
    static {
        Q0 = new coe[] { (coe)w9.f((Class)RoomPermissionsViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomPermissionsViewModel(final RoomPermissionsArgs roomPermissionsArgs, final mjo mjo, final vln vln, final UserIdentifier o0, final xbm xbm) {
        czd.f((Object)roomPermissionsArgs, "args");
        czd.f((Object)mjo, "utilsFragmentViewEventDispatcher");
        czd.f((Object)vln, "guestActionsEventDispatcher");
        czd.f((Object)o0, "userIdentifier");
        czd.f((Object)xbm, "releaseCompletable");
        Objects.requireNonNull(bun.Companion);
        super((k9e)xbm, (jbx)new bun(roomPermissionsArgs.getPreviousView()));
        this.O0 = o0;
        this.P0 = ewj.n(this, (qsb)new qsb<jyh<d6o>, fzv>(this, vln, mjo) {
            public final RoomPermissionsViewModel D0;
            public final vln E0;
            public final mjo F0;
            
            public final Object invoke(final Object o) {
                final jyh jyh = (jyh)o;
                czd.f((Object)jyh, "$this$weaver");
                jyh.a(v9m.a((Class)d6o$c.class), (ftb)new a((go6)null));
                jyh.a(v9m.a((Class)d6o$a.class), (ftb)new b(this.D0, (go6)null));
                jyh.a(v9m.a((Class)d6o$b.class), (ftb)new c(this.D0, this.E0, this.F0, (go6)null));
                return fzv.a;
            }
        });
    }
    
    public final jyh<d6o> v() {
        return (jyh<d6o>)this.P0.a((coe)RoomPermissionsViewModel.Q0[0]);
    }
}
