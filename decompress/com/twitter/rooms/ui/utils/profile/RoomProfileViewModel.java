// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.profile;

import java.util.Objects;
import java.util.Map;
import com.twitter.rooms.model.helpers.RoomUserItem;
import com.twitter.rooms.manager.RoomStateManager;
import android.content.Context;
import com.twitter.rooms.subsystem.api.args.RoomProfileArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/utils/profile/RoomProfileViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lfxn;", "Lzvn;", "Lwvn;", "Companion", "e", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomProfileViewModel extends MviViewModel<fxn, zvn, wvn>
{
    public static final RoomProfileViewModel.RoomProfileViewModel$e Companion;
    public static final ape<Object>[] c1;
    public final RoomProfileArgs Q0;
    public final Context R0;
    public final u1n S0;
    public final eko T0;
    public final tsc U0;
    public final oko V0;
    public final tdn W0;
    public final nmn X0;
    public final sjo Y0;
    public final bon Z0;
    public final wgn a1;
    public final yyh b1;
    
    static {
        c1 = new ape[] { (ape)lb0.h(RoomProfileViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new RoomProfileViewModel.RoomProfileViewModel$e();
    }
    
    public RoomProfileViewModel(final RoomProfileArgs q0, final Context r0, final RoomStateManager roomStateManager, final u1n s0, final eko t0, final kcm kcm, final tsc u0, final oko v0, final viw viw, final tdn w0, final nmn x0, final sjo y0, final bon z0, final wgn a1) {
        e0e.f((Object)q0, "args");
        e0e.f((Object)r0, "context");
        e0e.f((Object)roomStateManager, "roomStateManager");
        e0e.f((Object)s0, "privateEmojiSentDispatcher");
        e0e.f((Object)t0, "roomUtilsFragmentViewEventDispatcher");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)u0, "httpRequestController");
        e0e.f((Object)v0, "scribeReporter");
        e0e.f((Object)viw, "userRepository");
        e0e.f((Object)w0, "roomDismissFragmentViewEventDispatcher");
        e0e.f((Object)x0, "roomGuestActionsEventDispatcher");
        e0e.f((Object)y0, "roomUsersCache");
        e0e.f((Object)z0, "roomHostEventDispatcher");
        e0e.f((Object)a1, "roomEmojiColorRepository");
        super((iae)kcm, (ccx)new fxn((RoomUserItem)null, (qgv)null, (String)null, (String)null, (Map)null, false, (ci6)null, false, false, false, false, false, false, false, false, (String)null, (Long)null, false, false, false, false, (zn4)null, 0, 0, false, false, false, 134217727, (wg8)null));
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = u0;
        this.V0 = v0;
        this.W0 = w0;
        this.X0 = x0;
        this.Y0 = y0;
        this.Z0 = z0;
        this.a1 = a1;
        MviViewModel.N((MviViewModel)this, (bbq)a1.a(), (String)null, (asx)null, (hub)new RoomProfileViewModel$a(this, (mp6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (t5j)a1.c(), (String)null, (asx)null, (hub)new RoomProfileViewModel$b(this, (mp6)null), 3, (Object)null);
        final t5j compose = viw.b(q0.getUser().getUserIdentifier()).compose((bcj)loj.F0);
        e0e.e((Object)compose, "userRepository.getUser(a\u2026tional.unwrapIfPresent())");
        MviViewModel.M((MviViewModel)this, compose, (String)null, (asx)null, (hub)new RoomProfileViewModel$c(this, roomStateManager, (mp6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (t5j)roomStateManager.C1, (String)null, (asx)null, (hub)new RoomProfileViewModel$d(this, (mp6)null), 3, (Object)null);
        this.b1 = hfe.v((MviViewModel)this, (stb)new RoomProfileViewModel$f(this));
    }
    
    public static final void W(final RoomProfileViewModel roomProfileViewModel, final fxn fxn, final String s) {
        Objects.requireNonNull(roomProfileViewModel);
        final RoomUserItem a = fxn.a;
        if (a != null) {
            roomProfileViewModel.X0.a.onNext((Object)new nmn$a.h(a.getPeriscopeUserId(), a.getTwitterUserId(), a));
            bng.h(s, (Integer)null, false, 6, roomProfileViewModel.T0);
        }
    }
    
    public final azh<zvn> v() {
        return (azh<zvn>)this.b1.a((ape)RoomProfileViewModel.c1[0]);
    }
}
