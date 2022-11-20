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

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/utils/profile/RoomProfileViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lown;", "Livn;", "Lfvn;", "Companion", "e", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomProfileViewModel extends MviViewModel<own, ivn, fvn>
{
    public static final e Companion;
    public static final coe<Object>[] a1;
    public final RoomProfileArgs O0;
    public final Context P0;
    public final e1n Q0;
    public final mjo R0;
    public final trc S0;
    public final vjo T0;
    public final bdn U0;
    public final vln V0;
    public final ajo W0;
    public final jnn X0;
    public final dgn Y0;
    public final hyh Z0;
    
    static {
        a1 = new coe[] { (coe)w9.f((Class)RoomProfileViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new e();
    }
    
    public RoomProfileViewModel(final RoomProfileArgs o0, final Context p14, final RoomStateManager roomStateManager, final e1n q0, final mjo r0, final xbm xbm, final trc s0, final vjo t0, final giw giw, final bdn u0, final vln v0, final ajo w0, final jnn x0, final dgn y0) {
        czd.f((Object)o0, "args");
        czd.f((Object)p14, "context");
        czd.f((Object)roomStateManager, "roomStateManager");
        czd.f((Object)q0, "privateEmojiSentDispatcher");
        czd.f((Object)r0, "roomUtilsFragmentViewEventDispatcher");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)s0, "httpRequestController");
        czd.f((Object)t0, "scribeReporter");
        czd.f((Object)giw, "userRepository");
        czd.f((Object)u0, "roomDismissFragmentViewEventDispatcher");
        czd.f((Object)v0, "roomGuestActionsEventDispatcher");
        czd.f((Object)w0, "roomUsersCache");
        czd.f((Object)x0, "roomHostEventDispatcher");
        czd.f((Object)y0, "roomEmojiColorRepository");
        super((k9e)xbm, (jbx)new own((RoomUserItem)null, (cgv)null, (String)null, (String)null, (Map)null, false, (wg6)null, false, false, false, false, false, false, false, false, (String)null, (Long)null, false, false, false, false, (um4)null, 0, 0, false, false, false, 134217727, (rf8)null));
        this.O0 = o0;
        this.P0 = p14;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = u0;
        this.V0 = v0;
        this.W0 = w0;
        this.X0 = x0;
        this.Y0 = y0;
        MviViewModel.N((MviViewModel)this, (eaq)y0.a(), (String)null, (jrx)null, (ftb)new RoomProfileViewModel$a(this, (go6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (h5j)y0.c(), (String)null, (jrx)null, (ftb)new RoomProfileViewModel$b(this, (go6)null), 3, (Object)null);
        final h5j compose = giw.b(o0.getUser().getUserIdentifier()).compose((pbj)vnj.D0);
        czd.e((Object)compose, "userRepository.getUser(a\u2026tional.unwrapIfPresent())");
        MviViewModel.M((MviViewModel)this, compose, (String)null, (jrx)null, (ftb)new RoomProfileViewModel$c(this, roomStateManager, (go6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (h5j)roomStateManager.A1, (String)null, (jrx)null, (ftb)new RoomProfileViewModel$d(this, (go6)null), 3, (Object)null);
        this.Z0 = ewj.n(this, (qsb)new qsb<jyh<ivn>, fzv>(this) {
            public final RoomProfileViewModel D0;
            
            public final Object invoke(final Object o) {
                final jyh jyh = (jyh)o;
                czd.f((Object)jyh, "$this$weaver");
                jyh.a(v9m.a((Class)ivn$a.class), (ftb)new l(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$p.class), (ftb)new h0(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$n.class), (ftb)new o0(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$o.class), (ftb)new q0(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$f.class), (ftb)new s0(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$c.class), (ftb)new t0(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$r.class), (ftb)new u0(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$g.class), (ftb)new v0(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$i.class), (ftb)new w0(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$y.class), (ftb)new m(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$u.class), (ftb)new q(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$w.class), (ftb)new t(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$x.class), (ftb)new w(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$q.class), (ftb)new x(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$d.class), (ftb)new a0(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$v.class), (ftb)new d0(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$j.class), (ftb)new e0(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$k.class), (ftb)new f0(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$b.class), (ftb)new g0(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$e.class), (ftb)new i0(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$h.class), (ftb)new j0(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$s.class), (ftb)new k0((go6)null));
                jyh.a(v9m.a((Class)ivn$t.class), (ftb)new l0(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$m.class), (ftb)new m0(this.D0, (go6)null));
                jyh.a(v9m.a((Class)ivn$l.class), (ftb)new n0(this.D0, (go6)null));
                return fzv.a;
            }
        });
    }
    
    public static final void W(final RoomProfileViewModel roomProfileViewModel, final own own, final String s) {
        Objects.requireNonNull(roomProfileViewModel);
        final RoomUserItem a = own.a;
        if (a != null) {
            roomProfileViewModel.V0.a.onNext((Object)new vln.a.h(a.getPeriscopeUserId(), a.getTwitterUserId(), a));
            fu8.o(s, (Integer)null, false, 6, roomProfileViewModel.R0);
        }
    }
    
    public final jyh<ivn> v() {
        return (jyh<ivn>)this.Z0.a((coe)RoomProfileViewModel.a1[0]);
    }
    
    public static final class e
    {
        public final um4 a(final RoomUserItem roomUserItem) {
            um4 um4 = um4.D0;
            if (roomUserItem != null) {
                if (roomUserItem.isInvitedToCohost()) {
                    um4 = um4.E0;
                }
                else if (roomUserItem.isCohost()) {
                    um4 = um4.F0;
                }
            }
            return um4;
        }
    }
}
