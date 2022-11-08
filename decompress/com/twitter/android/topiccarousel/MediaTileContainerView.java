// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.topiccarousel;

import android.view.View$OnTouchListener;
import android.view.ViewGroup;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.GridView;
import kotlin.Metadata;
import androidx.cardview.widget.CardView;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t" }, d2 = { "Lcom/twitter/android/topiccarousel/MediaTileContainerView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "subsystem.tfa.topiccarousel.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class MediaTileContainerView extends CardView
{
    public GridView L0;
    public int M0;
    public int N0;
    
    public MediaTileContainerView(final Context context, final AttributeSet set) {
        zzd.f((Object)context, "context");
        zzd.f((Object)set, "attrs");
        super(context, set, 0);
        View.inflate(context, 2131624235, (ViewGroup)this);
        final View viewById = ((View)this).findViewById(2131429356);
        zzd.e((Object)viewById, "findViewById(R.id.grd)");
        ((View)(this.L0 = (GridView)viewById)).setOnTouchListener((View$OnTouchListener)f1h.C0);
        this.N0 = (int)context.getResources().getDimension(2131165500);
        this.M0 = (int)context.getResources().getDimension(2131165498);
    }
}
