// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.subscription;

import com.twitter.rooms.subsystem.api.args.RoomSubscriptionPromptArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/core/subscription/RoomSubscriptionPromptViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lrdo;", "", "Lyco;", "feature.tfa.rooms.ui.core.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomSubscriptionPromptViewModel extends MviViewModel<rdo, Object, yco>
{
    public static final /* synthetic */ soe<Object>[] O0;
    public final gyh N0;
    
    static {
        O0 = new soe[] { (soe)hi.m(RoomSubscriptionPromptViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomSubscriptionPromptViewModel(final RoomSubscriptionPromptArgs roomSubscriptionPromptArgs, final ibm ibm) {
        zzd.f((Object)roomSubscriptionPromptArgs, "args");
        zzd.f((Object)ibm, "releaseCompletable");
        super((fae)ibm, (oax)new rdo(roomSubscriptionPromptArgs.getTitle(), roomSubscriptionPromptArgs.getCreatorName(), roomSubscriptionPromptArgs.getTotalParticipated(), roomSubscriptionPromptArgs.getProfileImageUrl(), roomSubscriptionPromptArgs.getCreatorId(), roomSubscriptionPromptArgs.getUserHandle(), roomSubscriptionPromptArgs.isFollowing(), roomSubscriptionPromptArgs.getTaggedTopics(), roomSubscriptionPromptArgs.isEmployeeOnly()));
        this.N0 = oyz.f0(this, (rtb)new RoomSubscriptionPromptViewModel$a(this));
    }
    
    public final iyh<Object> v() {
        return (iyh<Object>)this.N0.a((soe)RoomSubscriptionPromptViewModel.O0[0]);
    }
}
