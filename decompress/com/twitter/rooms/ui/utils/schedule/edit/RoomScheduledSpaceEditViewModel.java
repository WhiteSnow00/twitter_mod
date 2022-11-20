// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.schedule.edit;

import java.util.Objects;
import java.util.Set;
import java.util.Calendar;
import com.twitter.rooms.subsystem.api.args.RoomScheduledSpaceEditArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/utils/schedule/edit/RoomScheduledSpaceEditViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lg5o;", "Lo4o;", "Lm4o;", "Companion", "b", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomScheduledSpaceEditViewModel extends MviViewModel<g5o, o4o, m4o>
{
    public static final b Companion;
    public static final coe<Object>[] V0;
    public final yuo O0;
    public final bdn P0;
    public final u6n Q0;
    public final vjo R0;
    public final adn S0;
    public final g5o T0;
    public final hyh U0;
    
    static {
        V0 = new coe[] { (coe)w9.f((Class)RoomScheduledSpaceEditViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new b();
    }
    
    public RoomScheduledSpaceEditViewModel(final RoomScheduledSpaceEditArgs roomScheduledSpaceEditArgs, final xbm xbm, final yuo o0, final bdn p8, final u6n q0, final vjo r0, final adn s0, final leo leo) {
        czd.f((Object)roomScheduledSpaceEditArgs, "args");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)o0, "scheduleSpaceRepository");
        czd.f((Object)p8, "roomDismissFragmentViewEventDispatcher");
        czd.f((Object)q0, "audioSpacesRepository");
        czd.f((Object)r0, "scribeReporter");
        czd.f((Object)s0, "roomDescriptionDispatcher");
        czd.f((Object)leo, "roomTaggedTopicsDispatcher");
        final b companion = RoomScheduledSpaceEditViewModel.Companion;
        super((k9e)xbm, (jbx)b.a(companion, roomScheduledSpaceEditArgs));
        this.O0 = o0;
        this.P0 = p8;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = b.a(companion, roomScheduledSpaceEditArgs);
        vjo.G(r0, "creation", "schedule_edit_detail", "", "impression", null, 48);
        if (djo.H()) {
            ((wgm)s0).a((Object)roomScheduledSpaceEditArgs.getSpaceName());
            ((wgm)leo).a((Object)mq4.R0((Iterable)roomScheduledSpaceEditArgs.getTopics()));
            MviViewModel.M((MviViewModel)this, (h5j)((wgm)leo).D0, (String)null, (jrx)null, (ftb)new RoomScheduledSpaceEditViewModel$a(this, (go6)null), 3, (Object)null);
        }
        this.U0 = ewj.n(this, (qsb)new qsb<jyh<o4o>, fzv>(this) {
            public final RoomScheduledSpaceEditViewModel D0;
            
            public final Object invoke(final Object o) {
                final jyh jyh = (jyh)o;
                czd.f((Object)jyh, "$this$weaver");
                jyh.a(v9m.a((Class)o4o$k.class), (ftb)new a(this.D0, (go6)null));
                jyh.a(v9m.a((Class)o4o$d.class), (ftb)new f(this.D0, (go6)null));
                jyh.a(v9m.a((Class)o4o$f.class), (ftb)new g(this.D0, (go6)null));
                jyh.a(v9m.a((Class)o4o$l.class), (ftb)new h(this.D0, (go6)null));
                jyh.a(v9m.a((Class)o4o$j.class), (ftb)new i(this.D0, (go6)null));
                jyh.a(v9m.a((Class)o4o$c.class), (ftb)new j(this.D0, (go6)null));
                jyh.a(v9m.a((Class)o4o$b.class), (ftb)new k(this.D0, (go6)null));
                jyh.a(v9m.a((Class)o4o$a.class), (ftb)new l(this.D0, (go6)null));
                jyh.a(v9m.a((Class)o4o$i.class), (ftb)new m(this.D0, (go6)null));
                jyh.a(v9m.a((Class)o4o$g.class), (ftb)new c(this.D0, (go6)null));
                jyh.a(v9m.a((Class)o4o$h.class), (ftb)new d(this.D0, (go6)null));
                jyh.a(v9m.a((Class)o4o$e.class), (ftb)new e(this.D0, (go6)null));
                return fzv.a;
            }
        });
    }
    
    public static boolean W(final RoomScheduledSpaceEditViewModel roomScheduledSpaceEditViewModel, g5o t0, String b, Calendar c, Set e, boolean f, final int n) {
        if ((n & 0x1) != 0x0) {
            b = t0.b;
        }
        if ((n & 0x2) != 0x0) {
            c = t0.c;
        }
        if ((n & 0x4) != 0x0) {
            e = t0.e;
        }
        if ((n & 0x8) != 0x0) {
            f = t0.f;
        }
        t0 = roomScheduledSpaceEditViewModel.T0;
        return !czd.a((Object)b, (Object)t0.b) || c.getTimeInMillis() != t0.c.getTimeInMillis() || !czd.a((Object)e, (Object)roomScheduledSpaceEditViewModel.T0.e) || f != t0.f;
    }
    
    public final jyh<o4o> v() {
        return (jyh<o4o>)this.U0.a((coe)RoomScheduledSpaceEditViewModel.V0[0]);
    }
    
    public static final class b
    {
        public static final g5o a(final b b, final RoomScheduledSpaceEditArgs roomScheduledSpaceEditArgs) {
            Objects.requireNonNull(b);
            final String broadcastId = roomScheduledSpaceEditArgs.getBroadcastId();
            final String spaceName = roomScheduledSpaceEditArgs.getSpaceName();
            final Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(roomScheduledSpaceEditArgs.getScheduledStartAtInMillis());
            return new g5o(broadcastId, spaceName, instance, mq4.R0((Iterable)roomScheduledSpaceEditArgs.getTopics()), roomScheduledSpaceEditArgs.isRecording(), roomScheduledSpaceEditArgs.getNarrowcastSpaceType(), 8);
        }
    }
}
