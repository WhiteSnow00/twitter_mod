// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.consumptionpreview;

import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceJoinAudioSpaceRequest;
import tv.periscope.chatman.api.IdempotenceHeaderMapImpl;
import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceJoinResponse;
import java.util.Arrays;
import java.util.Objects;
import tv.periscope.model.NarrowcastSpaceType;
import java.util.List;
import java.util.Set;
import tv.periscope.android.api.service.GuestServiceApi;
import com.twitter.rooms.manager.RoomStateManager;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/core/consumptionpreview/RoomConsumptionPreviewViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ly9n;", "Lm8n;", "Lk8n;", "feature.tfa.rooms.ui.core.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomConsumptionPreviewViewModel extends MviViewModel<y9n, m8n, k8n>
{
    public static final /* synthetic */ soe<Object>[] f1;
    public Context N0;
    public final RoomStateManager O0;
    public final y6k P0;
    public final yqn Q0;
    public final ocn R0;
    public final jpn S0;
    public final gjo T0;
    public final lwr U0;
    public final GuestServiceApi V0;
    public final h11 W0;
    public final sv6 X0;
    public final ee5 Y0;
    public final htn Z0;
    public final ocw a1;
    public final lio b1;
    public final aeo c1;
    public final vdo d1;
    public final gyh e1;
    
    static {
        f1 = new soe[] { (soe)hi.m(RoomConsumptionPreviewViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomConsumptionPreviewViewModel(final Context n0, final ibm ibm, final RoomStateManager o0, final y6k p19, final ssn ssn, final yqn q0, final ocn r0, final jpn s0, final gjo t0, final lwr u0, final GuestServiceApi v0, final h11 w0, final sv6 x0, final ee5 y0, final htn z0, final ocw a1, final lio b1, final aeo c1, final vdo d1) {
        zzd.f((Object)n0, "context");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)o0, "roomStateManager");
        zzd.f((Object)ssn, "roomOpenConsumptionPreviewViewEventDispatcher");
        zzd.f((Object)q0, "roomNoAccessPreviewViewEventDispatcher");
        zzd.f((Object)r0, "roomDismissFragmentViewEventDispatcher");
        zzd.f((Object)s0, "roomJoinSpaceEventDispatcher");
        zzd.f((Object)t0, "roomsScribeReporter");
        zzd.f((Object)u0, "superFollowsScribeReporter");
        zzd.f((Object)v0, "guestServiceApi");
        zzd.f((Object)w0, "audioSpaceDataSource");
        zzd.f((Object)x0, "authedRepository");
        zzd.f((Object)y0, "communitiesRepository");
        zzd.f((Object)z0, "roomPeriscopeAuthenticator");
        zzd.f((Object)a1, "userInfo");
        zzd.f((Object)b1, "roomUsersCache");
        zzd.f((Object)c1, "roomTicketManager");
        zzd.f((Object)d1, "roomTabUuidDispatcher");
        super((fae)ibm, (oax)new y9n(false, false, (String)null, (pf3)null, (Set)null, (Set)null, (Set)null, (String)null, (String)null, (Long)null, 0, false, (String)null, false, (String)null, 0, (mos)null, (knl)null, (List)null, false, false, false, false, false, (NarrowcastSpaceType)null, false, false, (elu)null, (lh5)null, 536870911, (hg8)null));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p19;
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
        this.b1 = b1;
        this.c1 = c1;
        this.d1 = d1;
        MviViewModel.M((MviViewModel)this, o0.D0((voe)RoomConsumptionPreviewViewModel$a.C0, new voe[] { (voe)RoomConsumptionPreviewViewModel$b.C0 }), (String)null, (qqx)null, (gub)new RoomConsumptionPreviewViewModel$c(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)b1.d, (String)null, (qqx)null, (gub)new RoomConsumptionPreviewViewModel$d(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)ssn.a, (String)null, (qqx)null, (gub)new RoomConsumptionPreviewViewModel$e(this, (ap6)null), 3, (Object)null);
        this.e1 = oyz.f0(this, (rtb)new rtb<iyh<m8n>, oyv>() {
            public final /* synthetic */ RoomConsumptionPreviewViewModel C0;
            
            public final Object invoke(final Object o) {
                final iyh iyh = (iyh)o;
                zzd.f((Object)iyh, "$this$weaver");
                iyh.a(g9m.a((Class)m8n.c.class), (gub)new g(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)m8n.b.class), (gub)new h(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)m8n.e.class), (gub)new i(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)m8n.f.class), (gub)new j(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)m8n.g.class), (gub)new k(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)m8n.a.class), (gub)new l(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)m8n.d.class), (gub)new m(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)m8n.h.class), (gub)new n(this.C0, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public static final void W(final RoomConsumptionPreviewViewModel roomConsumptionPreviewViewModel, final String s, final Set set, final Set set2, final Set set3, final int n, final boolean b, final String s2, final int n2, final boolean b2, final boolean b3) {
        RoomStateManager.q0(roomConsumptionPreviewViewModel.O0, set, set2, set3, n, b, s, s2, n2, b2, false, b3, 512);
        roomConsumptionPreviewViewModel.S0.a.onNext((Object)pmi.a);
    }
    
    public static final void X(final RoomConsumptionPreviewViewModel roomConsumptionPreviewViewModel, final int n, final String s, final boolean b, final boolean b2, final boolean b3) {
        Objects.requireNonNull(roomConsumptionPreviewViewModel);
        Label_0073: {
            if (n != 0) {
                final y6k p6 = roomConsumptionPreviewViewModel.P0;
                final Context n2 = roomConsumptionPreviewViewModel.N0;
                final String[] a = vi6.a;
                if (!p6.a(n2, (String[])Arrays.copyOf(a, a.length))) {
                    roomConsumptionPreviewViewModel.V((Object)k8n.d.a);
                    break Label_0073;
                }
            }
            roomConsumptionPreviewViewModel.T((rtb)new u9n(n, roomConsumptionPreviewViewModel));
        }
        String s2;
        if (b) {
            s2 = (String)((ggm)roomConsumptionPreviewViewModel.d1).b();
        }
        else {
            s2 = null;
        }
        roomConsumptionPreviewViewModel.T0.J(n == 0, s2, b3);
        final gjo t0 = roomConsumptionPreviewViewModel.T0;
        final z01 b4 = t0.b;
        final tba d0 = z01.D0;
        if (zzd.a(b4.c((Object)d0), (Object)d0) ^ true) {
            final sba sba = (sba)t0.b.b();
            String b5;
            if (sba == null || (b5 = ((tca)sba).b()) == null) {
                b5 = "SPACE_JOIN_INVALID_EVENT_PAGE";
            }
            final String d2 = t0.b.d();
            final sba sba2 = (sba)t0.b.b();
            String a2;
            if (sba2 == null || (a2 = ((taa)sba2).a()) == null) {
                a2 = "SPACE_JOIN_INVALID_EVENT_COMPONENT";
            }
            final sba sba3 = (sba)t0.b.b();
            String c;
            if (sba3 == null || (c = sba3.c()) == null) {
                c = "SPACE_JOIN_INVALID_ELEMENT_COMPONENT";
            }
            gjo.H(t0, b5, d2, a2, c, "join", s, null, null, null, null, null, null, b2, null, null, null, null, null, null, 520128);
        }
    }
    
    public final void Y(final String s) {
        zzd.f((Object)s, "roomId");
        this.C(this.Z0.b().p((qtb)new r0n((rtb)new rtb<u3k$b, ubq<? extends i3u<? extends GuestServiceJoinResponse, ? extends t01, ? extends x21>>>() {
            public final /* synthetic */ RoomConsumptionPreviewViewModel D0;
            
            public final Object invoke(Object n) {
                final u3k$b u3k$b = (u3k$b)n;
                zzd.f((Object)u3k$b, "results");
                if (u3k$b.b.f()) {
                    n = n9q.n((Throwable)u3k$b.b.c());
                }
                else {
                    final n9q joinAudioSpace = this.D0.V0.joinAudioSpace(IdempotenceHeaderMapImpl.Companion.create().getHeaderMap(), new GuestServiceJoinAudioSpaceRequest(s, false, false, (String)null, 8, (hg8)null));
                    final n9q<t01> h = this.D0.W0.h(new h11$a(s));
                    final RoomConsumptionPreviewViewModel d0 = this.D0;
                    final String c0 = s;
                    Objects.requireNonNull(d0);
                    n9q n9q;
                    if (oio.u()) {
                        Objects.requireNonNull(x21.Companion);
                        n9q = n9q.v((Object)x21.e);
                    }
                    else {
                        n9q = d0.X0.a(c0);
                    }
                    n = new taq((ubq)n9q.R((ubq)joinAudioSpace, (ubq)h, (ubq)n9q, (iub)new rhh((Object)b.C0, 3)), (qtb)new l5l((rtb)new d(this.D0), 22));
                }
                return n;
            }
        }, 4)).f((dcq)this.Z0.c()), (rtb)new rtb<oyh<y9n, i3u<? extends GuestServiceJoinResponse, ? extends t01, ? extends x21>>, oyv>() {
            public final /* synthetic */ RoomConsumptionPreviewViewModel C0;
            
            public final Object invoke(final Object o) {
                final oyh oyh = (oyh)o;
                zzd.f((Object)oyh, "$this$intoWeaver");
                oyh.e((gub)new e(this.C0, s, (ap6)null));
                oyh.c((gub)new f(this.C0, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public final iyh<m8n> v() {
        return (iyh<m8n>)this.e1.a((soe)RoomConsumptionPreviewViewModel.f1[0]);
    }
}
