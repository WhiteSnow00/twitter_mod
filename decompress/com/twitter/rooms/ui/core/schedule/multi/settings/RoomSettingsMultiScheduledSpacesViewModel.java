// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.schedule.multi.settings;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/core/schedule/multi/settings/RoomSettingsMultiScheduledSpacesViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ls5o;", "", "Lp5o;", "feature.tfa.rooms.ui.core.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomSettingsMultiScheduledSpacesViewModel extends MviViewModel<s5o, Object, p5o>
{
    public static final /* synthetic */ soe<Object>[] O0;
    public final gyh N0;
    
    static {
        O0 = new soe[] { (soe)hi.m(RoomSettingsMultiScheduledSpacesViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomSettingsMultiScheduledSpacesViewModel(final jqn jqn, final ibm ibm) {
        zzd.f((Object)jqn, "roomMultiScheduledSpacesDispatcher");
        zzd.f((Object)ibm, "releaseCompletable");
        super((fae)ibm, (oax)new s5o((String)null, 1, (hg8)null));
        MviViewModel.M((MviViewModel)this, (b5j)jqn.b, (String)null, (qqx)null, (gub)new RoomSettingsMultiScheduledSpacesViewModel$a(this, (ap6)null), 3, (Object)null);
        this.N0 = oyz.f0(this, (rtb)new RoomSettingsMultiScheduledSpacesViewModel$b(this));
    }
    
    public final iyh<Object> v() {
        return (iyh<Object>)this.N0.a((soe)RoomSettingsMultiScheduledSpacesViewModel.O0[0]);
    }
}
