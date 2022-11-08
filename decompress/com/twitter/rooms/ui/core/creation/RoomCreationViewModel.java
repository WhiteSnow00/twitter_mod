// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.creation;

import java.util.concurrent.TimeUnit;
import tv.periscope.android.api.CreateBroadcastResponse;
import java.util.List;
import com.twitter.rooms.manager.RoomStateManager;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/core/creation/RoomCreationViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lecn;", "Lrbn;", "Lpbn;", "Companion", "h", "feature.tfa.rooms.ui.core.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomCreationViewModel extends MviViewModel<ecn, rbn, pbn>
{
    public static final RoomCreationViewModel.RoomCreationViewModel$h Companion;
    public static final /* synthetic */ soe<Object>[] c1;
    public final Context N0;
    public final y6k O0;
    public final RoomStateManager P0;
    public final vsn Q0;
    public final ysn R0;
    public final gjo S0;
    public final w1o T0;
    public final v1o U0;
    public final wdo V0;
    public final iwn W0;
    public final z01 X0;
    public final jqn Y0;
    public final ocw Z0;
    public final d9w a1;
    public final gyh b1;
    
    static {
        c1 = new soe[] { (soe)hi.m(RoomCreationViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new RoomCreationViewModel.RoomCreationViewModel$h();
    }
    
    public RoomCreationViewModel(final ibm ibm, final Context n0, final y6k o0, final RoomStateManager p20, final vsn q0, final ysn r0, final tsn tsn, final gjo s0, final w1o t0, final huo huo, final v1o u0, final wdo v0, final z7x z7x, final iwn w0, final z01 x0, final zml<g9i> zml, final rv1<g9i> rv1, final jqn y0, final ocw z0, final d9w a1) {
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)n0, "context");
        zzd.f((Object)p20, "roomStateManager");
        zzd.f((Object)q0, "roomOpenInviteViewEventDispatcher");
        zzd.f((Object)r0, "roomOpenSpaceViewEventDispatcher");
        zzd.f((Object)tsn, "roomOpenCreationViewEventDispatcher");
        zzd.f((Object)s0, "roomsScribeReporter");
        zzd.f((Object)t0, "roomScheduleSpaceViewDispatcher");
        zzd.f((Object)huo, "scheduleSpaceRepository");
        zzd.f((Object)u0, "roomScheduleSpaceDetailsViewDispatcher");
        zzd.f((Object)v0, "roomTaggedTopicsDispatcher");
        zzd.f((Object)z7x, "viewLifecycle");
        zzd.f((Object)w0, "roomRecentTopicsRepository");
        zzd.f((Object)x0, "componentPrefixDispatcher");
        zzd.f((Object)zml, "superFollowNarrowcastObserver");
        zzd.f((Object)rv1, "spaceNarrowcastObserver");
        zzd.f((Object)y0, "roomMultiScheduledSpacesDispatcher");
        zzd.f((Object)z0, "userInfo");
        zzd.f((Object)a1, "userCache");
        super((fae)ibm, (oax)new ecn(oio.j() ^ true, 62));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p20;
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
        MviViewModel.M((MviViewModel)this, (b5j)zml, (String)null, (qqx)null, (gub)new RoomCreationViewModel$a(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)rv1, (String)null, (qqx)null, (gub)new RoomCreationViewModel$b(this, (ap6)null), 3, (Object)null);
        s0.I(z0.k().getStringId(), a1.n(), rv1.f() instanceof g9i.a);
        MviViewModel.M((MviViewModel)this, (b5j)tsn.a, (String)null, (qqx)null, (gub)new RoomCreationViewModel$c(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)p20.z1, (String)null, (qqx)null, (gub)new RoomCreationViewModel$d(this, (ap6)null), 3, (Object)null);
        this.C((n9q)huo.c(), (rtb)new rtb<oyh<ecn, List<? extends CreateBroadcastResponse>>, oyv>() {
            public final /* synthetic */ RoomCreationViewModel C0;
            
            public final Object invoke(final Object o) {
                final oyh oyh = (oyh)o;
                zzd.f((Object)oyh, "$this$intoWeaver");
                oyh.e((gub)new a(this.C0, (ap6)null));
                oyh.c((gub)new b((ap6)null));
                return oyv.a;
            }
        });
        final b5j delay = z7x.l().delay(500L, TimeUnit.MILLISECONDS);
        zzd.e((Object)delay, "viewLifecycle.observeSho\u2026Y, TimeUnit.MILLISECONDS)");
        MviViewModel.M((MviViewModel)this, delay, (String)null, (qqx)null, (gub)new RoomCreationViewModel$f(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)z7x.l(), (String)null, (qqx)null, (gub)new RoomCreationViewModel$g(this, (ap6)null), 3, (Object)null);
        this.b1 = oyz.f0(this, (rtb)new rtb<iyh<rbn>, oyv>() {
            public final /* synthetic */ RoomCreationViewModel C0;
            
            public final Object invoke(final Object o) {
                final iyh iyh = (iyh)o;
                zzd.f((Object)iyh, "$this$weaver");
                iyh.a(g9m.a((Class)rbn$b.class), (gub)new c(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)rbn$c.class), (gub)new d(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)rbn$a.class), (gub)new e(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)rbn$e.class), (gub)new f(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)rbn$d.class), (gub)new g(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)rbn$f.class), (gub)new h(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)rbn$g.class), (gub)new i(this.C0, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public final iyh<rbn> v() {
        return (iyh<rbn>)this.b1.a((soe)RoomCreationViewModel.c1[0]);
    }
}
