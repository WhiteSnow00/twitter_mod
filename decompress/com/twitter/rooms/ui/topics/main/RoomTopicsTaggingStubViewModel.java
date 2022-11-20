// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.topics.main;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004" }, d2 = { "Lcom/twitter/rooms/ui/topics/main/RoomTopicsTaggingStubViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Leho;", "", "feature.tfa.rooms.ui.topics.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomTopicsTaggingStubViewModel extends MviViewModel
{
    public static final int O0 = 0;
    
    public RoomTopicsTaggingStubViewModel(final xbm xbm, final adn adn) {
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)adn, "roomDescriptionDispatcher");
        super((k9e)xbm, (jbx)new eho(false, 1, (rf8)null));
        MviViewModel.M((MviViewModel)this, (h5j)((wgm)adn).D0, (String)null, (jrx)null, (ftb)new RoomTopicsTaggingStubViewModel$a(this, (go6)null), 3, (Object)null);
    }
}
