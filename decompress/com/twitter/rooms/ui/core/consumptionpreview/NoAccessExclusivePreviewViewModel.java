// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.consumptionpreview;

import java.util.Set;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004" }, d2 = { "Lcom/twitter/rooms/ui/core/consumptionpreview/NoAccessExclusivePreviewViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lyji;", "", "feature.tfa.rooms.ui.core.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class NoAccessExclusivePreviewViewModel extends MviViewModel
{
    public NoAccessExclusivePreviewViewModel(final ibm ibm, final yqn yqn) {
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)yqn, "roomNoAccessPreviewViewEventDispatcher");
        super((fae)ibm, (oax)new yji((Set)null, 0, 3, (hg8)null));
        MviViewModel.M((MviViewModel)this, (b5j)yqn.a, (String)null, (qqx)null, (gub)new NoAccessExclusivePreviewViewModel$a(this, (ap6)null), 3, (Object)null);
    }
}
