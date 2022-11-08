// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.schedule.details;

import java.util.Objects;
import com.twitter.rooms.subsystem.api.args.RoomScheduledSpaceMode;
import com.twitter.rooms.subsystem.api.args.RoomScheduledSpaceMode$Scheduling;
import com.twitter.rooms.subsystem.api.args.RoomScheduledSpaceMode$Scheduled;
import com.twitter.rooms.subsystem.api.args.RoomScheduledSpaceDetailsFragmentContentViewArgs;
import com.twitter.rooms.manager.RoomStateManager;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006" }, d2 = { "Lcom/twitter/rooms/ui/core/schedule/details/RoomScheduledSpaceDetailsViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lu3o;", "Ls2o;", "Lq2o;", "Lxim;", "feature.tfa.rooms.ui.core.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomScheduledSpaceDetailsViewModel extends MviViewModel<u3o, s2o, q2o> implements xim
{
    public static final /* synthetic */ soe<Object>[] f1;
    public final Context N0;
    public final y6k O0;
    public final g6n P0;
    public final ysn Q0;
    public final ocn R0;
    public final kvo S0;
    public final ocw T0;
    public final huo U0;
    public final RoomStateManager V0;
    public final t4o W0;
    public final gjo X0;
    public final aeo Y0;
    public final p1o Z0;
    public final yqn a1;
    public final lio b1;
    public final lwr c1;
    public boolean d1;
    public final gyh e1;
    
    static {
        f1 = new soe[] { (soe)hi.m(RoomScheduledSpaceDetailsViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomScheduledSpaceDetailsViewModel(final ibm ibm, final Context n0, final y6k o0, final g6n p18, final ysn q0, final ocn r0, final kvo s0, final ocw t0, final huo u0, final RoomStateManager v0, final t4o w0, final gjo x0, final aeo y0, final p1o z0, final yqn a1, final lio b1, final lwr c1, final RoomScheduledSpaceDetailsFragmentContentViewArgs roomScheduledSpaceDetailsFragmentContentViewArgs) {
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)n0, "context");
        zzd.f((Object)p18, "audioSpacesRepository");
        zzd.f((Object)q0, "roomOpenSpaceViewEventDispatcher");
        zzd.f((Object)r0, "roomDismissFragmentViewEventDispatcher");
        zzd.f((Object)s0, "scheduledSpaceSubscriptionRepository");
        zzd.f((Object)t0, "userInfo");
        zzd.f((Object)u0, "scheduleSpaceRepository");
        zzd.f((Object)v0, "roomStateManager");
        zzd.f((Object)w0, "roomScheduledSpaceEventReporter");
        zzd.f((Object)x0, "roomsScribeReporter");
        zzd.f((Object)y0, "roomTicketManager");
        zzd.f((Object)z0, "rsvpDispatcher");
        zzd.f((Object)a1, "roomNoAccessPreviewViewEventDispatcher");
        zzd.f((Object)b1, "roomUsersCache");
        zzd.f((Object)c1, "superFollowsScribeReporter");
        zzd.f((Object)roomScheduledSpaceDetailsFragmentContentViewArgs, "args");
        super((fae)ibm, (oax)new u3o.c(false));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p18;
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
        final RoomScheduledSpaceMode mode = roomScheduledSpaceDetailsFragmentContentViewArgs.getMode();
        if (mode instanceof RoomScheduledSpaceMode$Scheduled) {
            MviViewModel.M((MviViewModel)this, (b5j)y0.l, (String)null, (qqx)null, (gub)new j3o(this, (ap6)null), 3, (Object)null);
            final String roomId = mode.getRoomId();
            this.C((n9q)p18.h(roomId), (rtb)new f3o(this, roomId));
        }
        else if (mode instanceof RoomScheduledSpaceMode$Scheduling) {
            MviViewModel.N((MviViewModel)this, (n9q)u0.c(), (String)null, (qqx)null, (gub)new RoomScheduledSpaceDetailsViewModel$a(this, mode, (ap6)null), 3, (Object)null);
        }
        this.e1 = oyz.f0(this, (rtb)new RoomScheduledSpaceDetailsViewModel$c(this));
    }
    
    public static final u3o W(final RoomScheduledSpaceDetailsViewModel roomScheduledSpaceDetailsViewModel, final u3o u3o, final rtb rtb) {
        Objects.requireNonNull(roomScheduledSpaceDetailsViewModel);
        u3o l;
        if (u3o instanceof u3o.a) {
            final u3o.a a = (u3o.a)u3o;
            final mos mos = (mos)rtb.invoke((Object)a.c);
            final boolean a2 = a.a;
            final r57 b = a.b;
            final boolean d = a.d;
            zzd.f((Object)b, "scheduledBroadcast");
            l = new u3o.a(a2, b, mos, d);
        }
        else {
            l = u3o;
            if (u3o instanceof u3o.b) {
                final u3o.b b2 = (u3o.b)u3o;
                final mos mos2 = (mos)rtb.invoke((Object)b2.i);
                l = u3o.b.l(b2, false, mos2, lr0.j(mos2), 15615);
            }
        }
        return l;
    }
    
    public static final void X(final RoomScheduledSpaceDetailsViewModel roomScheduledSpaceDetailsViewModel, final ypp ypp) {
        final t4o w0 = roomScheduledSpaceDetailsViewModel.W0;
        final boolean d1 = roomScheduledSpaceDetailsViewModel.d1;
        Objects.requireNonNull(w0);
        zzd.f((Object)ypp, "settingsType");
        if (d1) {
            if (zzd.a((Object)ypp, (Object)ypp.i.b)) {
                w0.a.c((okm)y57$x.a);
            }
            else if (zzd.a((Object)ypp, (Object)ypp.q.b)) {
                w0.a.c((okm)y57$a0.a);
            }
            else if (zzd.a((Object)ypp, (Object)ypp.c.b)) {
                w0.a.c((okm)y57$y.a);
            }
        }
        else {
            w0.b.Q(ypp);
        }
        if (zzd.a((Object)ypp, (Object)ypp.h.b)) {
            roomScheduledSpaceDetailsViewModel.Z((rtb<? super String, ? extends q2o>)new h3o(roomScheduledSpaceDetailsViewModel));
        }
        else if (zzd.a((Object)ypp, (Object)ypp.i.b)) {
            roomScheduledSpaceDetailsViewModel.Z((rtb<? super String, ? extends q2o>)i3o.C0);
        }
        else if (zzd.a((Object)ypp, (Object)ypp.q.b)) {
            roomScheduledSpaceDetailsViewModel.Z((rtb<? super String, ? extends q2o>)p3o.C0);
        }
        else if (zzd.a((Object)ypp, (Object)ypp.c.b)) {
            roomScheduledSpaceDetailsViewModel.Z((rtb<? super String, ? extends q2o>)c3o.C0);
        }
    }
    
    public final void Y(final mos mos, final String s) {
        if (mos != null) {
            this.Q((rtb)new RoomScheduledSpaceDetailsViewModel$b(this, mos));
        }
        final int n = 1;
        final boolean b = s == null || ckr.h1((CharSequence)s);
        int n2;
        if (mos != null && !mos.c && this.Y0.g()) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (mos != null && (b || n2 != 0)) {
            final aeo y0 = this.Y0;
            String s2;
            if ((s2 = s) == null) {
                s2 = "";
            }
            y0.e(s2, mos.d);
        }
    }
    
    public final void Z(final rtb<? super String, ? extends q2o> rtb) {
        this.T((rtb)new RoomScheduledSpaceDetailsViewModel$d(this, (rtb)rtb));
    }
    
    public final void j() {
        this.V((Object)q2o$d.a);
    }
    
    public final iyh<s2o> v() {
        return (iyh<s2o>)this.e1.a((soe)RoomScheduledSpaceDetailsViewModel.f1[0]);
    }
}
