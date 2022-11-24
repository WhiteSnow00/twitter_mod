// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.topics.main;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004" }, d2 = { "Lcom/twitter/rooms/ui/topics/main/RoomTopicsTaggingStubViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lxho;", "", "feature.tfa.rooms.ui.topics.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomTopicsTaggingStubViewModel extends MviViewModel
{
    public static final int Q0 = 0;
    
    public RoomTopicsTaggingStubViewModel(final kcm kcm, final sdn sdn) {
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)sdn, "roomDescriptionDispatcher");
        super((iae)kcm, (ccx)new xho(false, 1, null));
        MviViewModel.M((MviViewModel)this, (t5j)((lhm)sdn).F0, (String)null, (asx)null, (hub)new RoomTopicsTaggingStubViewModel$a(this, (mp6)null), 3, (Object)null);
    }
}
