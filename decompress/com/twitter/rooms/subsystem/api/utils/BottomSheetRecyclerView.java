// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.subsystem.api.utils;

import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/twitter/rooms/subsystem/api/utils/BottomSheetRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "subsystem.tfa.rooms.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class BottomSheetRecyclerView extends RecyclerView
{
    public BottomSheetRecyclerView(final Context context, final AttributeSet set) {
        zzd.f((Object)context, "context");
        super(context, set, 0);
    }
    
    public final boolean isNestedScrollingEnabled() {
        return rp2.p((ViewGroup)this) && super.isNestedScrollingEnabled();
    }
}
