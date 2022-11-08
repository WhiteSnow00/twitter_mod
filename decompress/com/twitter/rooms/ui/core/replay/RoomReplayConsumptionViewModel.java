// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.replay;

import tv.periscope.model.NarrowcastSpaceType;
import java.util.Set;
import com.twitter.rooms.model.helpers.RoomUserItem;
import com.twitter.rooms.subsystem.api.args.DisplayMode$StationsTab;
import java.util.Objects;
import com.twitter.rooms.subsystem.api.args.RoomReplayFragmentContentViewArgs;
import com.twitter.rooms.manager.RoomStateManager;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/core/replay/RoomReplayConsumptionViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lqzn;", "Loxn;", "Lmxn;", "Companion", "w", "feature.tfa.rooms.ui.core.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomReplayConsumptionViewModel extends MviViewModel<qzn, oxn, mxn>
{
    public static final RoomReplayConsumptionViewModel.RoomReplayConsumptionViewModel$w Companion;
    public static final /* synthetic */ soe<Object>[] T0;
    public final Context N0;
    public final sv6 O0;
    public final UserIdentifier P0;
    public final q7n Q0;
    public final dbr R0;
    public final gyh S0;
    
    static {
        T0 = new soe[] { (soe)hi.m(RoomReplayConsumptionViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new RoomReplayConsumptionViewModel.RoomReplayConsumptionViewModel$w();
    }
    
    public RoomReplayConsumptionViewModel(final Context n0, final sv6 o0, final ibm ibm, final RoomStateManager roomStateManager, final b1o b1o, final a1o a1o, final vsn vsn, final ttn ttn, final c1o c1o, final gjo gjo, final UserIdentifier p16, final ocn ocn, final zml<x1> zml, final q7n q0, final dbr r0, final RoomReplayFragmentContentViewArgs roomReplayFragmentContentViewArgs) {
        zzd.f((Object)n0, "context");
        zzd.f((Object)o0, "authedRepository");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)roomStateManager, "roomStateManager");
        zzd.f((Object)b1o, "roomReplayPlaybackEventDispatcher");
        zzd.f((Object)a1o, "roomReplayEventDispatcher");
        zzd.f((Object)vsn, "roomOpenInviteViewEventDispatcher");
        zzd.f((Object)ttn, "roomPlaybackManager");
        zzd.f((Object)c1o, "roomReplayStateDispatcher");
        zzd.f((Object)gjo, "roomsScribeReporter");
        zzd.f((Object)p16, "userIdentifier");
        zzd.f((Object)ocn, "roomDismissFragmentViewEventDispatcher");
        zzd.f((Object)zml, "replayEventPublishSubject");
        zzd.f((Object)q0, "clippingRepository");
        zzd.f((Object)r0, "stationsPlaybackEventDispatcher");
        zzd.f((Object)roomReplayFragmentContentViewArgs, "args");
        Objects.requireNonNull(qzn.Companion);
        super((fae)ibm, (oax)new qzn(roomReplayFragmentContentViewArgs.getHostDisplayName(), roomReplayFragmentContentViewArgs.getHostAvatarUrl(), roomReplayFragmentContentViewArgs.getHostTwitterId(), roomReplayFragmentContentViewArgs.getTitle(), roomReplayFragmentContentViewArgs.getSpaceStartTimeMs(), roomReplayFragmentContentViewArgs.getRoomId(), zzd.a((Object)roomReplayFragmentContentViewArgs.getDisplayMode(), (Object)DisplayMode$StationsTab.INSTANCE), roomReplayFragmentContentViewArgs.getTotalNumParticipants(), 2147468415, 5));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p16;
        this.Q0 = q0;
        this.R0 = r0;
        final boolean a = zzd.a((Object)p16.getStringId(), (Object)roomReplayFragmentContentViewArgs.getHostTwitterId());
        final boolean spaceAvailableForClipping = roomReplayFragmentContentViewArgs.isSpaceAvailableForClipping();
        this.Q((rtb)new pzn(oio.C() && spaceAvailableForClipping, a));
        this.Q((rtb)new rtb<qzn, qzn>() {
            public final /* synthetic */ RoomReplayConsumptionViewModel D0;
            
            public final Object invoke(final Object o) {
                final qzn qzn = (qzn)o;
                zzd.f((Object)qzn, "$this$setState");
                final long p = ttn.p();
                final long d = ttn.d();
                final RoomReplayConsumptionViewModel d2 = this.D0;
                final float r0 = ttn.R0;
                final RoomReplayConsumptionViewModel.RoomReplayConsumptionViewModel$w companion = RoomReplayConsumptionViewModel.Companion;
                Objects.requireNonNull(d2);
                final int n = 1;
                Object o2;
                if (r0 == 0.5f) {
                    o2 = hmk$b.c;
                }
                else if (r0 == 1.5f) {
                    o2 = hmk$c.c;
                }
                else {
                    int n2;
                    if (r0 == 2.0f) {
                        n2 = n;
                    }
                    else {
                        n2 = 0;
                    }
                    if (n2 != 0) {
                        o2 = hmk$a.c;
                    }
                    else {
                        o2 = hmk$d.c;
                    }
                }
                final boolean e = xau.Companion.b(UserIdentifier.Companion.c()).e("room_transcription_display", false);
                final Context n3 = this.D0.N0;
                int n4;
                if (zzd.a((Object)roomReplayFragmentContentViewArgs.getDisplayMode(), (Object)DisplayMode$StationsTab.INSTANCE)) {
                    n4 = 2131952079;
                }
                else {
                    n4 = 2131952491;
                }
                final String string = n3.getString(n4);
                final boolean f0 = a;
                zzd.e((Object)string, "getString(\n             \u2026     },\n                )");
                return qzn.l(qzn, false, f0, false, (String)null, (String)null, (String)null, (String)null, (String)null, (String)null, (Long)null, (String)null, (hmk)o2, p, d, 0L, false, false, (RoomUserItem)null, (RoomUserItem)null, e, (Long)null, false, false, false, false, false, false, (Set)null, string, (NarrowcastSpaceType)null, -4308997, 6);
            }
        });
        MviViewModel.M((MviViewModel)this, (b5j)a1o.b, (String)null, (qqx)null, (gub)new RoomReplayConsumptionViewModel$l(this, (ap6)null), 3, (Object)null);
        final RoomUserItem roomUserItem = (RoomUserItem)((ggm)c1o).b();
        if (roomUserItem != null && zzd.a((Object)roomUserItem.getRoomId(), (Object)roomReplayFragmentContentViewArgs.getRoomId())) {
            this.Q((rtb)new rtb<qzn, qzn>() {
                public final /* synthetic */ RoomReplayConsumptionViewModel D0;
                
                public final Object invoke(final Object o) {
                    final qzn qzn = (qzn)o;
                    zzd.f((Object)qzn, "$this$setState");
                    return qzn.l(qzn, false, false, roomUserItem.isTalking(), RoomReplayConsumptionViewModel.W(this.D0, roomUserItem), roomUserItem.getName(), roomUserItem.getImageUrl(), (String)null, (String)null, (String)null, (Long)null, (String)null, (hmk)null, 0L, 0L, 0L, false, false, (RoomUserItem)null, roomUserItem, false, (Long)null, false, false, false, false, false, false, (Set)null, (String)null, (NarrowcastSpaceType)null, -2097273, 7);
                }
            });
        }
        else {
            this.Q((rtb)new rtb<qzn, qzn>() {
                public final /* synthetic */ RoomReplayConsumptionViewModel D0;
                
                public final Object invoke(final Object o) {
                    final qzn qzn = (qzn)o;
                    zzd.f((Object)qzn, "$this$setState");
                    final String hostAvatarUrl = roomReplayFragmentContentViewArgs.getHostAvatarUrl();
                    final String hostDisplayName = roomReplayFragmentContentViewArgs.getHostDisplayName();
                    final String string = this.D0.N0.getString(2131959440);
                    zzd.e((Object)string, "getString(CommonR.string.user_status_admin)");
                    return qzn.l(qzn, false, false, false, string, hostDisplayName, hostAvatarUrl, (String)null, (String)null, (String)null, (Long)null, (String)null, (hmk)null, 0L, 0L, 0L, false, false, (RoomUserItem)null, (RoomUserItem)null, false, (Long)null, false, false, false, false, false, false, (Set)null, (String)null, (NarrowcastSpaceType)null, -113, 7);
                }
            });
        }
        MviViewModel.M((MviViewModel)this, roomStateManager.D0((voe)RoomReplayConsumptionViewModel$r.C0, new voe[0]), (String)null, (qqx)null, (gub)new RoomReplayConsumptionViewModel$s(this, (ap6)null), 3, (Object)null);
        this.B((b5j)zml, (rtb)new rtb<oyh<qzn, x1>, oyv>() {
            public final /* synthetic */ RoomReplayConsumptionViewModel C0;
            
            public final Object invoke(final Object o) {
                final oyh oyh = (oyh)o;
                zzd.f((Object)oyh, "$this$intoWeaver");
                oyh.e((gub)new c(this.C0, (ap6)null));
                oyh.c((gub)new e(oyh, (ap6)null));
                return oyv.a;
            }
        });
        MviViewModel.M((MviViewModel)this, roomStateManager.D0((voe)RoomReplayConsumptionViewModel$u.C0, new voe[] { (voe)RoomReplayConsumptionViewModel$v.C0 }), (String)null, (qqx)null, (gub)new RoomReplayConsumptionViewModel$a(this, (ap6)null), 3, (Object)null);
        if (oio.C()) {
            MviViewModel.M((MviViewModel)this, roomStateManager.D0((voe)RoomReplayConsumptionViewModel$b.C0, new voe[] { (voe)RoomReplayConsumptionViewModel$c.C0, (voe)RoomReplayConsumptionViewModel$d.C0 }), (String)null, (qqx)null, (gub)new RoomReplayConsumptionViewModel$e(roomReplayFragmentContentViewArgs, this, (ap6)null), 3, (Object)null);
        }
        MviViewModel.M((MviViewModel)this, roomStateManager.D0((voe)RoomReplayConsumptionViewModel$f.C0, new voe[] { (voe)RoomReplayConsumptionViewModel$g.C0, (voe)RoomReplayConsumptionViewModel$h.C0, (voe)RoomReplayConsumptionViewModel$i.C0, (voe)RoomReplayConsumptionViewModel$j.C0, (voe)RoomReplayConsumptionViewModel$m.C0, (voe)RoomReplayConsumptionViewModel$n.C0 }), (String)null, (qqx)null, (gub)new RoomReplayConsumptionViewModel$o(roomReplayFragmentContentViewArgs, this, (ap6)null), 3, (Object)null);
        this.S0 = oyz.f0(this, (rtb)new rtb<iyh<oxn>, oyv>() {
            public final /* synthetic */ RoomReplayConsumptionViewModel C0;
            
            public final Object invoke(final Object o) {
                final iyh iyh = (iyh)o;
                zzd.f((Object)iyh, "$this$weaver");
                iyh.a(g9m.a((Class)oxn$r.class), (gub)new f(this.C0, b1o, gjo, (ap6)null));
                iyh.a(g9m.a((Class)oxn$b.class), (gub)new b0(this.C0, gjo, (ap6)null));
                iyh.a(g9m.a((Class)oxn$s.class), (gub)new d0(this.C0, b1o, gjo, (ap6)null));
                iyh.a(g9m.a((Class)oxn$o.class), (gub)new e0(this.C0, gjo, b1o, (ap6)null));
                iyh.a(g9m.a((Class)oxn$n.class), (gub)new f0(this.C0, gjo, (ap6)null));
                iyh.a(g9m.a((Class)oxn$j.class), (gub)new g0(gjo, this.C0, (ap6)null));
                iyh.a(g9m.a((Class)oxn$c.class), (gub)new h0(this.C0, gjo, roomStateManager, (ap6)null));
                iyh.a(g9m.a((Class)oxn$a.class), (gub)new i0(this.C0, gjo, (ap6)null));
                iyh.a(g9m.a((Class)oxn$e.class), (gub)new j0(this.C0, gjo, a1o, roomStateManager, (ap6)null));
                iyh.a(g9m.a((Class)oxn$f.class), (gub)new g(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)oxn$m.class), (gub)new n(this.C0, vsn, gjo, ocn, (ap6)null));
                iyh.a(g9m.a((Class)oxn$l.class), (gub)new o(b1o, this.C0, (ap6)null));
                iyh.a(g9m.a((Class)oxn$k.class), (gub)new p(b1o, this.C0, (ap6)null));
                iyh.a(g9m.a((Class)oxn$i.class), (gub)new q(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)oxn$p.class), (gub)new r(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)oxn$g.class), (gub)new t(this.C0, gjo, (ap6)null));
                iyh.a(g9m.a((Class)oxn$q.class), (gub)new w(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)oxn$h.class), (gub)new x(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)oxn$d.class), (gub)new a0(this.C0, ttn, gjo, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public static final String W(final RoomReplayConsumptionViewModel roomReplayConsumptionViewModel, final RoomUserItem roomUserItem) {
        Objects.requireNonNull(roomReplayConsumptionViewModel);
        boolean b = true;
        if (roomUserItem == null || !roomUserItem.isPrimaryAdmin()) {
            b = false;
        }
        String s;
        if (b) {
            s = roomReplayConsumptionViewModel.N0.getString(2131959440);
            zzd.e((Object)s, "{\n                contex\u2026atus_admin)\n            }");
        }
        else {
            final hio hio = null;
            hio userStatus;
            if (roomUserItem != null) {
                userStatus = roomUserItem.getUserStatus();
            }
            else {
                userStatus = null;
            }
            if (userStatus == hio.C0) {
                s = roomReplayConsumptionViewModel.N0.getString(2131959441);
                zzd.e((Object)s, "{\n                contex\u2026tus_cohost)\n            }");
            }
            else {
                hio userStatus2 = hio;
                if (roomUserItem != null) {
                    userStatus2 = roomUserItem.getUserStatus();
                }
                if (userStatus2 == hio.D0) {
                    s = roomReplayConsumptionViewModel.N0.getString(2131959446);
                    zzd.e((Object)s, "{\n                contex\u2026us_speaker)\n            }");
                }
                else {
                    s = "";
                }
            }
        }
        return s;
    }
    
    public static final void X(final RoomReplayConsumptionViewModel roomReplayConsumptionViewModel) {
        Objects.requireNonNull(roomReplayConsumptionViewModel);
        final xau b = xau.Companion.b(UserIdentifier.Companion.c());
        final boolean e = b.e("room_transcription_display", false);
        final xau$c i = b.i();
        ((xau$d)i).f("room_transcription_display", e ^ true);
        i.e();
        roomReplayConsumptionViewModel.Q((rtb)new ozn(e));
    }
    
    public final iyh<oxn> v() {
        return (iyh<oxn>)this.S0.a((soe)RoomReplayConsumptionViewModel.T0[0]);
    }
}
