// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.endscreen;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.List;
import java.util.Date;
import java.text.DateFormat;
import com.twitter.rooms.subsystem.api.args.RoomEndScreenArgs;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.Set;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/utils/endscreen/RoomEndScreenViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lwhn;", "Ljgn;", "Lggn;", "Companion", "c", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomEndScreenViewModel extends MviViewModel<whn, jgn, ggn>
{
    public static final c Companion;
    public static final coe<Object>[] a1;
    public final Context O0;
    public final wu6 P0;
    public final u6n Q0;
    public final vjo R0;
    public final adw S0;
    public final qmw T0;
    public final sln U0;
    public final String V0;
    public final boolean W0;
    public final boolean X0;
    public final Set<AudioSpaceTopicItem> Y0;
    public final hyh Z0;
    
    static {
        a1 = new coe[] { (coe)w9.f((Class)RoomEndScreenViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new c();
    }
    
    public RoomEndScreenViewModel(final Context o0, final RoomEndScreenArgs roomEndScreenArgs, final wu6 p10, final u6n q0, final h0o h0o, final vjo r0, final adw s0, final qmw t0, final sln u0, final xbm xbm) {
        czd.f((Object)o0, "context");
        czd.f((Object)roomEndScreenArgs, "args");
        czd.f((Object)p10, "authedRepository");
        czd.f((Object)q0, "audioSpacesRepository");
        czd.f((Object)h0o, "roomReplayDockShownDispatcher");
        czd.f((Object)r0, "roomsScribeReporter");
        czd.f((Object)s0, "userInfo");
        czd.f((Object)t0, "usersRepository");
        czd.f((Object)u0, "friendshipRepository");
        czd.f((Object)xbm, "releaseCompletable");
        final String title = roomEndScreenArgs.getTitle();
        String s2;
        if ((title == null || title.length() == 0) && roomEndScreenArgs.isHost()) {
            s2 = o0.getString(2131956945);
        }
        else {
            s2 = roomEndScreenArgs.getTitle();
        }
        final Long started = roomEndScreenArgs.getStartedAt();
        String format;
        if (started != null) {
            format = DateFormat.getDateInstance(1).format(new Date(started.longValue()));
        }
        else {
            format = null;
        }
        final boolean b = roomEndScreenArgs.isAvailableForReplay() && roomEndScreenArgs.isHost();
        final boolean availableForReplay = roomEndScreenArgs.isAvailableForReplay();
        final c companion = RoomEndScreenViewModel.Companion;
        super((k9e)xbm, (jbx)new whn(s2, format, b, availableForReplay, c.a(companion, roomEndScreenArgs), (List)f2a.D0, mq4.m0((Iterable)mq4.R0((Iterable)roomEndScreenArgs.getTopics()), (CharSequence)" · ", (CharSequence)null, (CharSequence)null, (qsb)RoomEndScreenViewModel$a.D0, 30), (String)null, (t21)null, djo.C() && roomEndScreenArgs.isHost() && roomEndScreenArgs.isAvailableForClipping(), roomEndScreenArgs.isAvailableForClipping(), roomEndScreenArgs.isAvailableForReplay(), (tg5)null));
        this.O0 = o0;
        this.P0 = p10;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = u0;
        this.V0 = roomEndScreenArgs.getRoomId();
        this.W0 = roomEndScreenArgs.isHost();
        this.X0 = roomEndScreenArgs.getFromSpacesTab();
        this.Y0 = mq4.R0((Iterable)roomEndScreenArgs.getTopics());
        final String roomId = roomEndScreenArgs.getRoomId();
        final boolean availableForReplay2 = roomEndScreenArgs.isAvailableForReplay();
        czd.f((Object)roomId, "spaceId");
        String s3;
        if (availableForReplay2) {
            s3 = "live_recording";
        }
        else {
            s3 = "live_not_recording";
        }
        vjo.G(r0, "end_screen", "", "", "impression", u01.d(roomId, s3, false, r0.i.getScribeDetailFromType()), 32);
        MviViewModel.M((MviViewModel)this, (h5j)h0o.a, (String)null, (jrx)null, (ftb)new RoomEndScreenViewModel$b(this, (go6)null), 3, (Object)null);
        MviViewModel.N((MviViewModel)this, q0.h(roomEndScreenArgs.getRoomId()), (String)null, (jrx)null, (ftb)new lhn(this, null), 3, (Object)null);
        if (c.a(companion, roomEndScreenArgs)) {
            vjo.G(r0, "end_screen", "analytics", "", "impression", null, 48);
        }
        this.Z0 = ewj.n(this, (qsb)new qsb<jyh<jgn>, fzv>(this) {
            public final RoomEndScreenViewModel D0;
            
            public final Object invoke(final Object o) {
                final jyh jyh = (jyh)o;
                czd.f((Object)jyh, "$this$weaver");
                jyh.a(v9m.a((Class)jgn$f.class), (ftb)new a(this.D0, (go6)null));
                jyh.a(v9m.a((Class)jgn$a.class), (ftb)new f(this.D0, (go6)null));
                jyh.a(v9m.a((Class)jgn$h.class), (ftb)new g(this.D0, (go6)null));
                jyh.a(v9m.a((Class)jgn$e.class), (ftb)new h(this.D0, (go6)null));
                jyh.a(v9m.a((Class)jgn$g.class), (ftb)new i(this.D0, (go6)null));
                jyh.a(v9m.a((Class)jgn$d.class), (ftb)new j(this.D0, (go6)null));
                jyh.a(v9m.a((Class)jgn$c.class), (ftb)new k(this.D0, (go6)null));
                jyh.a(v9m.a((Class)jgn$b.class), (ftb)new n(this.D0, (go6)null));
                jyh.a(v9m.a((Class)jgn$j.class), (ftb)new o(this.D0, (go6)null));
                jyh.a(v9m.a((Class)jgn$k.class), (ftb)new b(this.D0, (go6)null));
                jyh.a(v9m.a((Class)jgn$l.class), (ftb)new com.twitter.rooms.ui.utils.endscreen.c(this.D0, (go6)null));
                jyh.a(v9m.a((Class)jgn$m.class), (ftb)new d(this.D0, (go6)null));
                jyh.a(v9m.a((Class)jgn$i.class), (ftb)new e(this.D0, (go6)null));
                return fzv.a;
            }
        });
    }
    
    public static final void W(final RoomEndScreenViewModel roomEndScreenViewModel, final long n, final boolean b, final boolean b2) {
        Objects.requireNonNull(roomEndScreenViewModel);
        roomEndScreenViewModel.T((qsb)new vhn(n, b, b2, roomEndScreenViewModel));
    }
    
    public final List<w0r$c> X(final List<s21> list, final Object o) {
        final HashSet set = new HashSet();
        final ArrayList list2 = new ArrayList();
        for (final s21 next : list) {
            if (set.add(next.d())) {
                list2.add(next);
            }
        }
        final ArrayList<s21> list3 = new ArrayList<s21>();
        for (final Object next2 : list2) {
            if (((s21)next2).e() != null) {
                list3.add((s21)next2);
            }
        }
        final ArrayList list4 = new ArrayList<w0r$c>(iq4.H((Iterable)list3, 10));
        final Iterator<s21> iterator3 = list3.iterator();
        while (iterator3.hasNext()) {
            list4.add(this.Y(iterator3.next(), (int)o));
        }
        return (List<w0r$c>)list4;
    }
    
    public final w0r$c Y(final s21 s21, final int n) {
        final cgv e = s21.e();
        czd.c((Object)e);
        return new w0r$c(e, !chw.Y(e.I1) && !chw.Z(e.I1), czd.a((Object)this.S0.getUser().e(), (Object)e.e()), chw.d0(e.I1), chw.b0(e.I1), e.M0, chw.Y(e.I1), chw.Z(e.I1), n);
    }
    
    public final jyh<jgn> v() {
        return (jyh<jgn>)this.Z0.a((coe)RoomEndScreenViewModel.a1[0]);
    }
    
    public static final class c
    {
        public static final boolean a(final c c, final RoomEndScreenArgs roomEndScreenArgs) {
            Objects.requireNonNull(c);
            final boolean host = roomEndScreenArgs.isHost();
            boolean b = false;
            if (host) {
                final djo a = djo.a;
                b = b;
                if (asa.b().b("android_audio_host_analytics_enabled", false)) {
                    b = true;
                }
            }
            return b;
        }
    }
}
