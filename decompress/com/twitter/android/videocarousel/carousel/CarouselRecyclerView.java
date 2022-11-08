// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.videocarousel.carousel;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import androidx.recyclerview.widget.RecyclerView$e;
import android.util.AttributeSet;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.ui.view.TimelineRecyclerView;

@Metadata(bv = {}, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e" }, d2 = { "Lcom/twitter/android/videocarousel/carousel/CarouselRecyclerView;", "Lcom/twitter/ui/view/TimelineRecyclerView;", "Lm81;", "Lvl3;", "autoPlayManager", "Lvl3;", "getAutoPlayManager", "()Lvl3;", "setAutoPlayManager", "(Lvl3;)V", "Lk81;", "getAutoPlayableItem", "()Lk81;", "autoPlayableItem", "subsystem.tfa.videocarousel.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class CarouselRecyclerView extends TimelineRecyclerView implements m81
{
    public vl3 i2;
    
    public CarouselRecyclerView(final Context context, final AttributeSet set) {
        zzd.f((Object)context, "context");
        super(context, set, 0);
    }
    
    public final vl3 getAutoPlayManager() {
        final vl3 i2 = this.i2;
        if (i2 != null) {
            return i2;
        }
        zzd.m("autoPlayManager");
        throw null;
    }
    
    public k81 getAutoPlayableItem() {
        Object o;
        if (this.i2 != null) {
            o = this.getAutoPlayManager().a();
            if (o == null) {
                o = k81.g;
            }
        }
        else {
            o = k81.g;
        }
        return (k81)o;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final RecyclerView$e adapter = ((RecyclerView)this).getAdapter();
        if (adapter != null) {
            adapter.f();
        }
        final vl3.a a = this.getAutoPlayManager().a();
        if (a != null) {
            a.j1();
        }
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final vl3 autoPlayManager = this.getAutoPlayManager();
        final Iterator iterator = autoPlayManager.a.iterator();
        while (iterator.hasNext()) {
            ((vl3.a)iterator.next()).D0.dispose();
        }
        autoPlayManager.a.clear();
    }
    
    public final void setAutoPlayManager(final vl3 i2) {
        zzd.f((Object)i2, "<set-?>");
        this.i2 = i2;
    }
}
