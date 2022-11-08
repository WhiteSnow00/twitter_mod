// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab;

import androidx.recyclerview.widget.RecyclerView$m;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.recyclerview.widget.RecyclerView$n;
import android.content.Context;
import kotlin.Metadata;
import androidx.recyclerview.widget.LinearLayoutManager;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "com/twitter/rooms/ui/stationstab/SpacesStationsTabViewDelegate$setUpCarousel$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "feature.tfa.rooms.ui.stationstab.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class SpacesStationsTabViewDelegate$setUpCarousel$1 extends LinearLayoutManager
{
    public SpacesStationsTabViewDelegate$setUpCarousel$1(final Context context) {
        super(0);
    }
    
    public final boolean t(final RecyclerView$n recyclerView$n) {
        zzd.f((Object)recyclerView$n, "lp");
        ((ViewGroup$MarginLayoutParams)recyclerView$n).width = (int)(((RecyclerView$m)this).S0 * 0.9);
        return true;
    }
}
