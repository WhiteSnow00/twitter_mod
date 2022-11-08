// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

import java.util.concurrent.TimeUnit;
import java.util.Objects;
import com.twitter.rooms.subsystem.api.args.RoomAudioSpaceFragmentContentViewArgs;
import java.util.List;
import com.twitter.rooms.manager.RoomStateManager;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/audiospace/RoomAudioSpaceViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lf6n;", "Lo0n;", "Le0n;", "feature.tfa.rooms.ui.audiospace.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomAudioSpaceViewModel extends MviViewModel<f6n, o0n, e0n>
{
    public static final /* synthetic */ soe<Object>[] m1;
    public final Context N0;
    public final y6k O0;
    public final RoomStateManager P0;
    public final wsn Q0;
    public final gjo R0;
    public final g0n S0;
    public final sv6 T0;
    public final bft U0;
    public final fxe<xou> V0;
    public final wmn W0;
    public final a11 X0;
    public final qfn Y0;
    public final qcn Z0;
    public final ocw a1;
    public final d9w b1;
    public final xrn c1;
    public final l7o d1;
    public final psc e1;
    public final ttn f1;
    public final lio g1;
    public final q7n h1;
    public final dbr i1;
    public final yml<List<d31>> j1;
    public boolean k1;
    public final gyh l1;
    
    static {
        m1 = new soe[] { (soe)hi.m(RoomAudioSpaceViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomAudioSpaceViewModel(final ibm ibm, final Context n0, final y6k o0, final RoomStateManager p36, final p0n p0n, final f0n f0n, final wsn q0, final m6o m6o, final f7o f7o, final vsn vsn, final xsn xsn, final gjo r0, final g0n s0, final sv6 t0, final bft u0, final fxe<xou> v0, final wmn w0, final gsn gsn, final a11 x0, final qfn y0, final kio kio, final a41 a41, final v6o v6o, final dwn dwn, final iln iln, final qcn z0, final ocw a42, final d9w b1, final xrn c1, final l7o d1, final psc e1, final ttn f1, final lio g1, final q7n h1, final dbr i1, final RoomAudioSpaceFragmentContentViewArgs roomAudioSpaceFragmentContentViewArgs) {
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)n0, "context");
        zzd.f((Object)p36, "roomStateManager");
        zzd.f((Object)p0n, "privateEmojiSentDispatcher");
        zzd.f((Object)f0n, "emojiReceivedDispatcher");
        zzd.f((Object)q0, "openManageSpeakersViewDispatcher");
        zzd.f((Object)m6o, "sharedContentEventDispatcher");
        zzd.f((Object)f7o, "sharingItemSelectionDispatcher");
        zzd.f((Object)vsn, "roomOpenInviteViewEventDispatcher");
        zzd.f((Object)xsn, "roomOpenSettingsViewEventDispatcher");
        zzd.f((Object)r0, "roomsScribeReporter");
        zzd.f((Object)s0, "emojiSentDispatcher");
        zzd.f((Object)t0, "authedRepository");
        zzd.f((Object)u0, "toaster");
        zzd.f((Object)v0, "tweetRepositoryLazy");
        zzd.f((Object)w0, "hostEventDispatcher");
        zzd.f((Object)gsn, "roomNuxStateManager");
        zzd.f((Object)x0, "contentSharingRepository");
        zzd.f((Object)y0, "roomEmojiColorRepository");
        zzd.f((Object)kio, "roomUserUnauthorizedErrorDispatcher");
        zzd.f((Object)a41, "audioSpaceListRepository");
        zzd.f((Object)v6o, "sharedContentManager");
        zzd.f((Object)dwn, "receivedInviteEventDispatcher");
        zzd.f((Object)iln, "roomGuestActionsEventDispatcher");
        zzd.f((Object)z0, "roomDmInvitesEventDispatcher");
        zzd.f((Object)a42, "userInfo");
        zzd.f((Object)b1, "userCache");
        zzd.f((Object)c1, "nudgeViewEventDispatcher");
        zzd.f((Object)d1, "roomSpaceEntityDelegate");
        zzd.f((Object)e1, "httpRequestController");
        zzd.f((Object)f1, "playbackManager");
        zzd.f((Object)g1, "roomUsersCache");
        zzd.f((Object)h1, "clippingRepository");
        zzd.f((Object)i1, "stationsPlaybackEventDispatcher");
        zzd.f((Object)roomAudioSpaceFragmentContentViewArgs, "args");
        super((fae)ibm, (oax)new f6n(roomAudioSpaceFragmentContentViewArgs.isFullscreen(), -2, 2097151));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p36;
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
        this.a1 = a42;
        this.b1 = b1;
        this.c1 = c1;
        this.d1 = d1;
        this.e1 = e1;
        this.f1 = f1;
        this.g1 = g1;
        this.h1 = h1;
        this.i1 = i1;
        final yml j1 = new yml();
        this.j1 = j1;
        MviViewModel.M((MviViewModel)this, p36.D0((voe)RoomAudioSpaceViewModel$k.C0, new voe[] { (voe)RoomAudioSpaceViewModel$v.C0 }), (String)null, (qqx)null, (gub)new RoomAudioSpaceViewModel$w(this, (ap6)null), 3, (Object)null);
        final oio a43 = oio.a;
        if (dta.b().b("spaces_2022_h2_entity_no_impression_enabled", false)) {
            MviViewModel.M((MviViewModel)this, p36.D0((voe)s5n.C0, new voe[] { (voe)t5n.C0, (voe)u5n.C0 }), (String)null, (qqx)null, (gub)new v5n(this, (ap6)null), 3, (Object)null);
        }
        this.U(new voe[] { (voe)w5n.C0 }, (rtb)new z5n(this));
        this.U(new voe[] { (voe)a6n.C0, (voe)b6n.C0 }, (rtb)new d6n(this));
        MviViewModel.N((MviViewModel)this, (n9q)y0.a(), (String)null, (qqx)null, (gub)new RoomAudioSpaceViewModel$h0(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)y0.c(), (String)null, (qqx)null, (gub)new RoomAudioSpaceViewModel$s0(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)gsn.b(qit.D0), (String)null, (qqx)null, (gub)new RoomAudioSpaceViewModel$u0(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)gsn.b(qit.E0), (String)null, (qqx)null, (gub)new RoomAudioSpaceViewModel$v0(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)gsn.b(qit.F0), (String)null, (qqx)null, (gub)new RoomAudioSpaceViewModel$w0(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)gsn.b(qit.I0), (String)null, (qqx)null, (gub)new RoomAudioSpaceViewModel$x0(this, (ap6)null), 3, (Object)null);
        final b5j filter = ((b5j)iln.a).filter((ptk)new jn0((rtb)RoomAudioSpaceViewModel$a.C0, 20));
        zzd.e((Object)filter, "roomGuestActionsEventDis\u2026ion.AddAsCoHost\n        }");
        MviViewModel.M((MviViewModel)this, filter, (String)null, (qqx)null, (gub)new RoomAudioSpaceViewModel$b(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)kio.C0, (String)null, (qqx)null, (gub)new RoomAudioSpaceViewModel$c(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)xsn.a, (String)null, (qqx)null, (gub)new RoomAudioSpaceViewModel$d(this, (ap6)null), 3, (Object)null);
        final b5j filter2 = ((b5j)i1.a).filter((ptk)new qo((rtb)RoomAudioSpaceViewModel$e.C0, 20));
        zzd.e((Object)filter2, "stationsPlaybackEventDis\u2026her.Action.CloseStation }");
        MviViewModel.M((MviViewModel)this, filter2, (String)null, (qqx)null, (gub)new RoomAudioSpaceViewModel$f(roomAudioSpaceFragmentContentViewArgs, this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)p36.z1, (String)null, (qqx)null, (gub)new RoomAudioSpaceViewModel$g(this, roomAudioSpaceFragmentContentViewArgs, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, p36.D0((voe)RoomAudioSpaceViewModel$h.C0, new voe[0]), (String)null, (qqx)null, (gub)new RoomAudioSpaceViewModel$i(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, p36.D0((voe)RoomAudioSpaceViewModel$j.C0, new voe[] { (voe)RoomAudioSpaceViewModel$l.C0, (voe)RoomAudioSpaceViewModel$m.C0, (voe)RoomAudioSpaceViewModel$n.C0, (voe)RoomAudioSpaceViewModel$o.C0, (voe)RoomAudioSpaceViewModel$p.C0, (voe)RoomAudioSpaceViewModel$q.C0, (voe)RoomAudioSpaceViewModel$r.C0, (voe)RoomAudioSpaceViewModel$s.C0, (voe)RoomAudioSpaceViewModel$t.C0, (voe)RoomAudioSpaceViewModel$u.C0, (voe)RoomAudioSpaceViewModel$x.C0, (voe)RoomAudioSpaceViewModel$y.C0 }), (String)null, (qqx)null, (gub)new RoomAudioSpaceViewModel$z(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, p36.D0((voe)RoomAudioSpaceViewModel$a0.C0, new voe[] { (voe)RoomAudioSpaceViewModel$b0.C0, (voe)RoomAudioSpaceViewModel$c0.C0, (voe)RoomAudioSpaceViewModel$d0.C0, (voe)RoomAudioSpaceViewModel$e0.C0, (voe)RoomAudioSpaceViewModel$f0.C0 }), (String)null, (qqx)null, (gub)new RoomAudioSpaceViewModel$g0(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, p36.D0((voe)RoomAudioSpaceViewModel$i0.C0, new voe[] { (voe)RoomAudioSpaceViewModel$j0.C0 }), (String)null, (qqx)null, (gub)new RoomAudioSpaceViewModel$k0(this, (ap6)null), 3, (Object)null);
        final b5j d2 = a41.d.D0((voe)r31.C0, new voe[] { (voe)s31.C0, (voe)t31.C0, (voe)u31.C0, (voe)v31.C0, (voe)w31.C0 });
        final zml d3 = a41.c.d;
        Objects.requireNonNull(i22.Companion);
        final b5j subscribeOn = b5j.combineLatest((naj)d2, (naj)((b5j)d3).startWith((Object)i22.c), (ew1)new i9((gub)x31.C0, 3)).filter((ptk)new dzf((rtb)y31.C0, 16)).map((qtb)new wpl((rtb)new z31(a41), 13)).distinctUntilChanged().subscribeOn(yvo.a());
        zzd.e((Object)subscribeOn, "fun getUsers(): Observab\u2026Schedulers.computation())");
        final b5j startWith = j1.flatMap((qtb)new q3m((rtb)new p5n(this), 24)).startWith((Object)v2a.C0);
        zzd.e((Object)startWith, "private fun getSharedCon\u2026dContent.TweetContent>())");
        final b5j throttleLatest = b5j.combineLatest((naj)subscribeOn, (naj)startWith, (ew1)new qhf((gub)RoomAudioSpaceViewModel$l0.C0, 5)).throttleLatest(100L, TimeUnit.MILLISECONDS);
        zzd.e((Object)throttleLatest, "combineLatest(\n         \u20260, TimeUnit.MILLISECONDS)");
        this.B(throttleLatest, (rtb)new RoomAudioSpaceViewModel$m0(this));
        MviViewModel.M((MviViewModel)this, (b5j)m6o.a, (String)null, (qqx)null, (gub)new RoomAudioSpaceViewModel$n0(this, (ap6)null), 3, (Object)null);
        final b5j distinctUntilChanged = ((b5j)f7o.C0).distinctUntilChanged();
        zzd.e((Object)distinctUntilChanged, "sharingItemSelectionDisp\u2026  .distinctUntilChanged()");
        MviViewModel.M((MviViewModel)this, distinctUntilChanged, (String)null, (qqx)null, (gub)new RoomAudioSpaceViewModel$o0(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)dwn.a, (String)null, (qqx)null, (gub)new RoomAudioSpaceViewModel$p0(this, (ap6)null), 3, (Object)null);
        if (oio.i()) {
            MviViewModel.M((MviViewModel)this, p36.D0((voe)RoomAudioSpaceViewModel$q0.C0, new voe[0]), (String)null, (qqx)null, (gub)new RoomAudioSpaceViewModel$r0(this, (ap6)null), 3, (Object)null);
        }
        MviViewModel.M((MviViewModel)this, (b5j)p0n.a, (String)null, (qqx)null, (gub)new l5n(this, (ap6)null), 3, (Object)null);
        final b5j filter3 = ((b5j)f0n.a).filter((ptk)new zt1((rtb)m5n.C0, 20));
        zzd.e((Object)filter3, "emojiReceivedDispatcher.\u2026d.filter { it.isPrivate }");
        MviViewModel.M((MviViewModel)this, filter3, (String)null, (qqx)null, (gub)new n5n(this, (ap6)null), 3, (Object)null);
        final b5j distinctUntilChanged2 = f1.U0.distinctUntilChanged();
        zzd.e((Object)distinctUntilChanged2, "playbackManager\n        \u2026  .distinctUntilChanged()");
        MviViewModel.M((MviViewModel)this, distinctUntilChanged2, (String)null, (qqx)null, (gub)new RoomAudioSpaceViewModel$t0(this, (ap6)null), 3, (Object)null);
        this.l1 = oyz.f0(this, (rtb)new rtb<iyh<o0n>, oyv>() {
            public final /* synthetic */ RoomAudioSpaceViewModel C0;
            
            public final Object invoke(final Object o) {
                final iyh iyh = (iyh)o;
                zzd.f((Object)iyh, "$this$weaver");
                iyh.a(g9m.a((Class)o0n$o.class), (gub)new v(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)o0n$j.class), (gub)new w(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)o0n$g.class), (gub)new b0(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)o0n$f.class), (gub)new c0(v6o, (ap6)null));
                iyh.a(g9m.a((Class)o0n$b.class), (gub)new d0(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)o0n$a.class), (gub)new f0(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)o0n$l.class), (gub)new g0(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)o0n$m.class), (gub)new i0(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)o0n$p.class), (gub)new j0(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)o0n$c.class), (gub)new c(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)o0n$q.class), (gub)new d(this.C0, vsn, (ap6)null));
                iyh.a(g9m.a((Class)o0n$r.class), (gub)new h(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)o0n$h.class), (gub)new k(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)o0n$k.class), (gub)new m(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)o0n$u.class), (gub)new n(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)o0n$i.class), (gub)new r(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)o0n$d.class), (gub)new s(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)o0n$e.class), (gub)new t(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)o0n$n.class), (gub)new u(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)o0n$s.class), (gub)new z(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)o0n$t.class), (gub)new a0(this.C0, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public static final b5j W(final RoomAudioSpaceViewModel roomAudioSpaceViewModel, final long n) {
        final b5j y2 = ((xou)roomAudioSpaceViewModel.V0.get()).y2(n);
        final snj b = snj.b;
        final int a = w4j.a;
        return y2.defaultIfEmpty((Object)b).onErrorReturnItem((Object)b);
    }
    
    public static final void X(final RoomAudioSpaceViewModel roomAudioSpaceViewModel, final f6n f6n, String h) {
        Objects.requireNonNull(roomAudioSpaceViewModel);
        List<? extends qgc> m2 = null;
        if (h != null) {
            Object b = vev.b(h);
            if (((p7a)b).isEmpty()) {
                b = null;
            }
            m2 = m2;
            if (b != null) {
                m2 = or4.m2((Iterable)b);
            }
        }
        h = f6n.h;
        if (h != null) {
            roomAudioSpaceViewModel.V((Object)new e0n.m(h, m2));
            if (f6n.m == hqn.D0 && oio.B()) {
                roomAudioSpaceViewModel.c1.a();
            }
        }
    }
    
    public final iyh<o0n> v() {
        return (iyh<o0n>)this.l1.a((soe)RoomAudioSpaceViewModel.m1[0]);
    }
}
