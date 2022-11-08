// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.history;

import java.util.List;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/core/history/RoomHistoryManagementViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lumn;", "", "Luln;", "Companion", "b", "feature.tfa.rooms.ui.core.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomHistoryManagementViewModel extends MviViewModel<umn, Object, uln>
{
    public static final RoomHistoryManagementViewModel.RoomHistoryManagementViewModel$b Companion;
    public static final /* synthetic */ soe<Object>[] R0;
    public final xln N0;
    public final gjo O0;
    public final Context P0;
    public final gyh Q0;
    
    static {
        R0 = new soe[] { (soe)hi.m(RoomHistoryManagementViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new RoomHistoryManagementViewModel.RoomHistoryManagementViewModel$b();
    }
    
    public RoomHistoryManagementViewModel(final llc llc, final ibm ibm, final kwn kwn, final xln n0, final gjo o0, final ocw ocw, final Context p7) {
        zzd.f((Object)llc, "historyListEventDispatcher");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)kwn, "roomRecordingDeleteDispatcher");
        zzd.f((Object)n0, "repository");
        zzd.f((Object)o0, "scribeReporter");
        zzd.f((Object)ocw, "userInfo");
        zzd.f((Object)p7, "context");
        super((fae)ibm, (oax)new umn(ocw.b(), (mlc)mlc$c.a, (List<mlc$b>)v2a.C0, (mlc)mlc$a.a));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p7;
        MviViewModel.M((MviViewModel)this, (b5j)llc.b, (String)null, (qqx)null, (gub)new RoomHistoryManagementViewModel$a(this, (ap6)null), 3, (Object)null);
        this.Q((rtb)jmn.C0);
        this.C(n0.b((String)null), (rtb)new nmn(this));
        final zml a = ((laa)kwn).a;
        zzd.e((Object)a, "roomRecordingDeleteDispatcher.observe()");
        MviViewModel.M((MviViewModel)this, (b5j)a, (String)null, (qqx)null, (gub)new pmn(this, (ap6)null), 3, (Object)null);
        this.Q0 = oyz.f0(this, (rtb)new rtb<iyh<Object>, oyv>() {
            public final /* synthetic */ RoomHistoryManagementViewModel C0;
            
            public final Object invoke(final Object o) {
                final iyh iyh = (iyh)o;
                zzd.f((Object)iyh, "$this$weaver");
                iyh.a(g9m.a((Class)vln.class), (gub)new c(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)wln.class), (gub)new d(this.C0, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public final iyh<Object> v() {
        return (iyh<Object>)this.Q0.a((soe)RoomHistoryManagementViewModel.R0[0]);
    }
}
