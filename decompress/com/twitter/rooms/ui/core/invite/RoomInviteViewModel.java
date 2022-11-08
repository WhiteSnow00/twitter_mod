// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.invite;

import java.util.List;
import com.twitter.rooms.subsystem.api.args.RoomInviteFragmentContentViewArgs;
import com.twitter.rooms.manager.RoomStateManager;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/core/invite/RoomInviteViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lipn;", "Lkon;", "Lion;", "Companion", "l", "feature.tfa.rooms.ui.core.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomInviteViewModel extends MviViewModel<ipn, kon, ion>
{
    public static final RoomInviteViewModel.RoomInviteViewModel$l Companion;
    public static final /* synthetic */ soe<Object>[] X0;
    public static final String Y0;
    public final RoomStateManager N0;
    public final ysn O0;
    public final tsn P0;
    public final gev Q0;
    public final wsn R0;
    public final d1o S0;
    public final gjo T0;
    public final lio U0;
    public final leo V0;
    public final gyh W0;
    
    static {
        X0 = new soe[] { (soe)hi.m(RoomInviteViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new RoomInviteViewModel.RoomInviteViewModel$l();
        Y0 = "RoomInviteViewModel";
    }
    
    public RoomInviteViewModel(final RoomInviteFragmentContentViewArgs roomInviteFragmentContentViewArgs, final ibm ibm, final RoomStateManager n0, final ysn o0, final tsn p11, final gev q0, final wsn r0, final d1o s0, final gjo t0, final lio u0, final leo v0) {
        zzd.f((Object)roomInviteFragmentContentViewArgs, "args");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)n0, "roomStateManager");
        zzd.f((Object)o0, "roomOpenSpaceViewEventDispatcher");
        zzd.f((Object)p11, "roomOpenCreationViewEventDispatcher");
        zzd.f((Object)q0, "roomInviteServiceInteractorDelegate");
        zzd.f((Object)r0, "roomOpenManageSpeakersViewDispatcher");
        zzd.f((Object)s0, "roomReplayViewEventDispatcher");
        zzd.f((Object)t0, "scribeReporter");
        zzd.f((Object)u0, "roomUsersCache");
        zzd.f((Object)v0, "roomTicketRepository");
        super((fae)ibm, (oax)new ipn(262142));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p11;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = u0;
        this.V0 = v0;
        this.W(null);
        final boolean b = roomInviteFragmentContentViewArgs.getInviteType() == ton.F0;
        if (b) {
            this.W(null);
        }
        this.Q((rtb)new hpn(roomInviteFragmentContentViewArgs, b));
        MviViewModel.M((MviViewModel)this, (b5j)n0.z1, (String)null, (qqx)null, (gub)new RoomInviteViewModel$a(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, n0.D0((voe)RoomInviteViewModel$d.C0, new voe[] { (voe)RoomInviteViewModel$e.C0, (voe)RoomInviteViewModel$f.C0, (voe)RoomInviteViewModel$g.C0, (voe)RoomInviteViewModel$h.C0, (voe)RoomInviteViewModel$i.C0, (voe)RoomInviteViewModel$j.C0, (voe)RoomInviteViewModel$k.C0, (voe)RoomInviteViewModel$b.C0 }), (String)null, (qqx)null, (gub)new RoomInviteViewModel$c(this, (ap6)null), 3, (Object)null);
        this.W0 = oyz.f0(this, (rtb)new rtb<iyh<kon>, oyv>() {
            public final /* synthetic */ RoomInviteViewModel C0;
            
            public final Object invoke(final Object o) {
                final iyh iyh = (iyh)o;
                zzd.f((Object)iyh, "$this$weaver");
                iyh.a(g9m.a((Class)kon$a.class), (gub)new a(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)kon$b.class), (gub)new c(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)kon$d.class), (gub)new d(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)kon$c.class), (gub)new f(this.C0, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public final void W(final String s) {
        this.C(this.Q0.a.a(s).w((qtb)new ozb((rtb)fev.C0, 11)), (rtb)new rtb<oyh<ipn, List<? extends mon>>, oyv>() {
            public final /* synthetic */ RoomInviteViewModel C0;
            
            public final Object invoke(final Object o) {
                final oyh oyh = (oyh)o;
                zzd.f((Object)oyh, "$this$intoWeaver");
                oyh.e((gub)new g(this.C0, (ap6)null));
                oyh.c((gub)new h(this.C0, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public final iyh<kon> v() {
        return (iyh<kon>)this.W0.a((soe)RoomInviteViewModel.X0[0]);
    }
}
