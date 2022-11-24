// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.schedule.edit;

import java.util.Set;
import java.util.Calendar;
import com.twitter.rooms.subsystem.api.args.RoomScheduledSpaceEditArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/utils/schedule/edit/RoomScheduledSpaceEditViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lz5o;", "Lh5o;", "Lf5o;", "Companion", "b", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomScheduledSpaceEditViewModel extends MviViewModel<z5o, h5o, f5o>
{
    public static final RoomScheduledSpaceEditViewModel.RoomScheduledSpaceEditViewModel$b Companion;
    public static final ape<Object>[] X0;
    public final svo Q0;
    public final tdn R0;
    public final m7n S0;
    public final oko T0;
    public final sdn U0;
    public final z5o V0;
    public final yyh W0;
    
    static {
        X0 = new ape[] { (ape)lb0.h(RoomScheduledSpaceEditViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new RoomScheduledSpaceEditViewModel.RoomScheduledSpaceEditViewModel$b();
    }
    
    public RoomScheduledSpaceEditViewModel(final RoomScheduledSpaceEditArgs roomScheduledSpaceEditArgs, final kcm kcm, final svo q0, final tdn r0, final m7n s0, final oko t0, final sdn u0, final ffo ffo) {
        e0e.f((Object)roomScheduledSpaceEditArgs, "args");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)q0, "scheduleSpaceRepository");
        e0e.f((Object)r0, "roomDismissFragmentViewEventDispatcher");
        e0e.f((Object)s0, "audioSpacesRepository");
        e0e.f((Object)t0, "scribeReporter");
        e0e.f((Object)u0, "roomDescriptionDispatcher");
        e0e.f((Object)ffo, "roomTaggedTopicsDispatcher");
        final RoomScheduledSpaceEditViewModel.RoomScheduledSpaceEditViewModel$b companion = RoomScheduledSpaceEditViewModel.Companion;
        super((iae)kcm, (ccx)RoomScheduledSpaceEditViewModel.RoomScheduledSpaceEditViewModel$b.a(companion, roomScheduledSpaceEditArgs));
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = u0;
        this.V0 = RoomScheduledSpaceEditViewModel.RoomScheduledSpaceEditViewModel$b.a(companion, roomScheduledSpaceEditArgs);
        oko.G(t0, "creation", "schedule_edit_detail", "", "impression", (ufv)null, 48);
        if (vjo.H()) {
            ((lhm)u0).a((Object)roomScheduledSpaceEditArgs.getSpaceName());
            ffo.a((Object)rr4.n2((Iterable)roomScheduledSpaceEditArgs.getTopics()));
            MviViewModel.M((MviViewModel)this, (t5j)ffo.F0, (String)null, (asx)null, (hub)new RoomScheduledSpaceEditViewModel$a(this, (mp6)null), 3, (Object)null);
        }
        this.W0 = hfe.v((MviViewModel)this, (stb)new RoomScheduledSpaceEditViewModel$c(this));
    }
    
    public static boolean W(final RoomScheduledSpaceEditViewModel roomScheduledSpaceEditViewModel, z5o v0, String b, Calendar c, Set e, boolean f, final int n) {
        if ((n & 0x1) != 0x0) {
            b = v0.b;
        }
        if ((n & 0x2) != 0x0) {
            c = v0.c;
        }
        if ((n & 0x4) != 0x0) {
            e = v0.e;
        }
        if ((n & 0x8) != 0x0) {
            f = v0.f;
        }
        v0 = roomScheduledSpaceEditViewModel.V0;
        return !e0e.a((Object)b, (Object)v0.b) || c.getTimeInMillis() != v0.c.getTimeInMillis() || !e0e.a((Object)e, (Object)roomScheduledSpaceEditViewModel.V0.e) || f != v0.f;
    }
    
    public final azh<h5o> v() {
        return (azh<h5o>)this.W0.a((ape)RoomScheduledSpaceEditViewModel.X0[0]);
    }
}
