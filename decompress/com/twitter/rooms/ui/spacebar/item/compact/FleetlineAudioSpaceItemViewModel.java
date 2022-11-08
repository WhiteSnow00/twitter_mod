// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.spacebar.item.compact;

import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0005\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/spacebar/item/compact/FleetlineAudioSpaceItemViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lcom/twitter/rooms/ui/spacebar/item/compact/FleetlineAudioSpaceItemViewModel$b;", "Lf4b$d;", "Lf4b$c;", "a", "b", "feature.tfa.rooms.ui.spacebar.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class FleetlineAudioSpaceItemViewModel extends MviViewModel<FleetlineAudioSpaceItemViewModel.FleetlineAudioSpaceItemViewModel$b, f4b$d, f4b$c>
{
    public static final /* synthetic */ soe<Object>[] P0;
    public xy5 N0;
    public final gyh O0;
    
    static {
        P0 = new soe[] { (soe)hi.m(FleetlineAudioSpaceItemViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public FleetlineAudioSpaceItemViewModel(final xy5 n0, final ibm ibm) {
        zzd.f((Object)n0, "fleetThread");
        zzd.f((Object)ibm, "releaseCompletable");
        final s01 m = n0.m;
        final String b = m.b;
        final hfv h = n0.h;
        final List k = n0.k;
        final List l = n0.l;
        final Integer j = m.j;
        Date parse = null;
        Label_0109: {
            if (zzd.a((Object)m.l, (Object)"NOT_STARTED") && m.o != null) {
                final knq a = knq.a;
                final String o = n0.m.o;
                if (o != null) {
                    parse = knq.b.parse(o);
                    break Label_0109;
                }
            }
            parse = null;
        }
        final s01 i = n0.m;
        super((fae)ibm, (oax)new FleetlineAudioSpaceItemViewModel.FleetlineAudioSpaceItemViewModel$b(b, h, k, l, j, parse, pf8.b0(i), i.m, n0.m.p));
        this.N0 = n0;
        this.O0 = oyz.f0(this, (rtb)new FleetlineAudioSpaceItemViewModel$c(this));
    }
    
    public final iyh<f4b$d> v() {
        return (iyh<f4b$d>)this.O0.a((soe)FleetlineAudioSpaceItemViewModel.P0[0]);
    }
}
