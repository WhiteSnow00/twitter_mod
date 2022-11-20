// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.cohost.invite;

import java.util.Objects;
import com.twitter.rooms.cohost.invite.RoomCohostInviteArgs;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/utils/cohost/invite/RoomCohostInviteViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lr8n;", "Lk8n;", "Li8n;", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomCohostInviteViewModel extends MviViewModel<r8n, k8n, i8n>
{
    public static final coe<Object>[] W0;
    public final Context O0;
    public final mjo P0;
    public final jnn Q0;
    public final vln R0;
    public final g7k S0;
    public final vjo T0;
    public final adw U0;
    public final hyh V0;
    
    static {
        W0 = new coe[] { (coe)w9.f((Class)RoomCohostInviteViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomCohostInviteViewModel(final RoomCohostInviteArgs roomCohostInviteArgs, final Context o0, final xbm xbm, final mjo p9, final jnn q0, final vln r0, final g7k s0, final vjo t0, final adw u0) {
        czd.f((Object)roomCohostInviteArgs, "args");
        czd.f((Object)o0, "context");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)p9, "roomUtilsFragmentViewEventDispatcher");
        czd.f((Object)q0, "hostEventDispatcher");
        czd.f((Object)r0, "guestActionsEventDispatcher");
        czd.f((Object)t0, "roomsScribeReporter");
        czd.f((Object)u0, "userInfo");
        Objects.requireNonNull(r8n.Companion);
        super((k9e)xbm, (jbx)new r8n(roomCohostInviteArgs.getInvites(), roomCohostInviteArgs.isHost(), roomCohostInviteArgs.isSpaceRecording(), 1));
        this.O0 = o0;
        this.P0 = p9;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = u0;
        this.V0 = ewj.n(this, (qsb)new qsb<jyh<k8n>, fzv>(this) {
            public final RoomCohostInviteViewModel D0;
            
            public final Object invoke(final Object o) {
                final jyh jyh = (jyh)o;
                czd.f((Object)jyh, "$this$weaver");
                jyh.a(v9m.a((Class)k8n$b.class), (ftb)new a(this.D0, (go6)null));
                jyh.a(v9m.a((Class)k8n$a.class), (ftb)new b(this.D0, (go6)null));
                return fzv.a;
            }
        });
    }
    
    public final jyh<k8n> v() {
        return (jyh<k8n>)this.V0.a((coe)RoomCohostInviteViewModel.W0[0]);
    }
}
