// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.tab.tabItem.sectionHeader;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001?\u0006\u0004" }, d2 = { "Lcom/twitter/rooms/ui/tab/tabItem/sectionHeader/SpacesTabSectionHeaderViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lezq;", "", "feature.tfa.rooms.ui.tab.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class SpacesTabSectionHeaderViewModel extends MviViewModel
{
    public SpacesTabSectionHeaderViewModel(final oxq$b oxq$b, final kcm kcm) {
        e0e.f((Object)oxq$b, "item");
        e0e.f((Object)kcm, "releaseCompletable");
        super((iae)kcm, (ccx)new ezq(oxq$b.a, oxq$b.b));
    }
}
