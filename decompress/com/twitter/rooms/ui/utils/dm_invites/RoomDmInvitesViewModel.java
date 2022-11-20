// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.dm_invites;

import java.util.List;
import com.twitter.rooms.subsystem.api.args.RoomDmInvitesArgs;
import com.twitter.rooms.manager.RoomStateManager;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/utils/dm_invites/RoomDmInvitesViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lvdn;", "Lfdn;", "Lcdn;", "Companion", "k", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomDmInvitesViewModel extends MviViewModel<vdn, fdn, cdn>
{
    public static final k Companion;
    public static final coe<Object>[] U0;
    public static final String V0;
    public final RoomStateManager O0;
    public final mtn P0;
    public final bfv Q0;
    public final ktn R0;
    public final vjo S0;
    public final hyh T0;
    
    static {
        U0 = new coe[] { (coe)w9.f((Class)RoomDmInvitesViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new k();
        V0 = "RoomDmInvitesViewModel";
    }
    
    public RoomDmInvitesViewModel(final RoomDmInvitesArgs roomDmInvitesArgs, final xbm xbm, final RoomStateManager o0, final jtn jtn, final mtn p8, final bfv q0, final ktn r0, final vjo s0) {
        czd.f((Object)roomDmInvitesArgs, "args");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)o0, "roomStateManager");
        czd.f((Object)jtn, "roomOpenInviteViewEventDispatcher");
        czd.f((Object)p8, "roomOpenSpaceViewEventDispatcher");
        czd.f((Object)q0, "roomInviteServiceInteractorDelegate");
        czd.f((Object)r0, "roomOpenManageSpeakersViewDispatcher");
        czd.f((Object)s0, "scribeReporter");
        super((k9e)xbm, (jbx)new vdn(roomDmInvitesArgs.getRoomId(), roomDmInvitesArgs.getInviteType(), roomDmInvitesArgs.getMaxInvites(), 1012));
        this.O0 = o0;
        this.P0 = p8;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.W(null);
        this.T((qsb)new qsb<vdn, fzv>(this) {
            public final RoomDmInvitesViewModel D0;
            
            public final Object invoke(final Object o) {
                final vdn vdn = (vdn)o;
                czd.f((Object)vdn, "state");
                final boolean b = vdn.b == gpn.G0;
                final RoomDmInvitesViewModel d0 = this.D0;
                final a a = new a(b);
                final k companion = RoomDmInvitesViewModel.Companion;
                d0.Q((qsb)a);
                return fzv.a;
            }
        });
        MviViewModel.M((MviViewModel)this, (h5j)jtn.a, (String)null, (jrx)null, (ftb)new RoomDmInvitesViewModel$c(this, (go6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (h5j)o0.A1, (String)null, (jrx)null, (ftb)new RoomDmInvitesViewModel$d(this, (go6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, o0.D0((foe)RoomDmInvitesViewModel$e.D0, new foe[] { (foe)RoomDmInvitesViewModel$f.D0, (foe)RoomDmInvitesViewModel$g.D0, (foe)RoomDmInvitesViewModel$h.D0, (foe)RoomDmInvitesViewModel$i.D0, (foe)RoomDmInvitesViewModel$j.D0 }), (String)null, (jrx)null, (ftb)new RoomDmInvitesViewModel$a(this, (go6)null), 3, (Object)null);
        this.T0 = ewj.n(this, (qsb)new qsb<jyh<fdn>, fzv>(this) {
            public final RoomDmInvitesViewModel D0;
            
            public final Object invoke(final Object o) {
                final jyh jyh = (jyh)o;
                czd.f((Object)jyh, "$this$weaver");
                jyh.a(v9m.a((Class)fdn$a.class), (ftb)new b(this.D0, (go6)null));
                jyh.a(v9m.a((Class)fdn$b.class), (ftb)new d(this.D0, (go6)null));
                jyh.a(v9m.a((Class)fdn$d.class), (ftb)new e(this.D0, (go6)null));
                jyh.a(v9m.a((Class)fdn$c.class), (ftb)new g(this.D0, (go6)null));
                return fzv.a;
            }
        });
    }
    
    public final void W(final String s) {
        this.C(this.Q0.a.a(s).w((psb)new s4i((qsb)afv.D0, 19)), (qsb)new qsb<pyh<vdn, List<? extends zon>>, fzv>(this) {
            public final RoomDmInvitesViewModel D0;
            
            public final Object invoke(final Object o) {
                final pyh pyh = (pyh)o;
                czd.f((Object)pyh, "$this$intoWeaver");
                pyh.e((ftb)new h(this.D0, (go6)null));
                pyh.c((ftb)new i(this.D0, (go6)null));
                return fzv.a;
            }
        });
    }
    
    public final jyh<fdn> v() {
        return (jyh<fdn>)this.T0.a((coe)RoomDmInvitesViewModel.U0[0]);
    }
    
    public static final class k
    {
    }
}
