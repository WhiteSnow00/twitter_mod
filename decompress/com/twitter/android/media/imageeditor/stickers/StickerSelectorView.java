// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.media.imageeditor.stickers;

import androidx.viewpager.widget.ViewPager;
import java.util.List;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView$l;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.GridLayoutManager;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import com.twitter.ui.view.RtlViewPager;
import android.widget.FrameLayout;

public class StickerSelectorView extends FrameLayout implements c
{
    public final RtlViewPager C0;
    public final StickerTabLayout D0;
    public final View E0;
    public final RecyclerView F0;
    public final ProgressBar G0;
    public final View H0;
    public a I0;
    public com.twitter.android.media.imageeditor.stickers.b.b J0;
    public b K0;
    public String L0;
    
    public StickerSelectorView(final Context context, final AttributeSet set) {
        super(context, set, 0);
        final View inflate = LayoutInflater.from(context).inflate(2131625731, (ViewGroup)this);
        this.C0 = (RtlViewPager)inflate.findViewById(2131428138);
        final StickerTabLayout d0 = (StickerTabLayout)inflate.findViewById(2131428142);
        (this.D0 = d0).setTabMode(0);
        d0.setTabGravity(1);
        final View viewById = ((View)this).findViewById(2131430942);
        this.E0 = viewById;
        final RecyclerView f0 = (RecyclerView)((View)this).findViewById(2131432523);
        this.F0 = f0;
        this.G0 = (ProgressBar)((View)this).findViewById(2131430775);
        final View viewById2 = ((View)this).findViewById(2131431749);
        this.H0 = viewById2;
        viewById2.findViewById(2131430982).setOnClickListener((View$OnClickListener)new u0p((Object)this, 5));
        f0.setLayoutManager((RecyclerView$m)new GridLayoutManager(context, 3, 1, false));
        final Resources resources = context.getResources();
        f0.h((RecyclerView$l)new wgr((tbx.m((WindowManager)context.getSystemService("window")).x - resources.getDimensionPixelSize(2131167278) * 3) / 8, resources.getDimensionPixelSize(2131167277)));
        ((View)f0).setClickable(true);
        viewById.setOnClickListener((View$OnClickListener)new yrf((Object)this, 1));
    }
    
    public void setRetryStickerCatalogListener(final b k0) {
        this.K0 = k0;
    }
    
    public void setScribeSection(final String l0) {
        this.L0 = l0;
    }
    
    public void setShouldShowRecentlyUsedFirstIfExists(final boolean shouldShowRecentlyUsedFirstIfExists) {
        this.D0.setShouldShowRecentlyUsedFirstIfExists(shouldShowRecentlyUsedFirstIfExists);
    }
    
    public void setStickerFeaturedCategoryData(final List<hhr> list) {
        if (this.H0.getVisibility() == 0) {
            return;
        }
        this.C0.c((ViewPager.i)new StickerSelectorView$a(this, (List)list));
    }
    
    public void setStickerSelectedListener(final com.twitter.android.media.imageeditor.stickers.b.b b) {
        this.J0 = b;
        final a i0 = this.I0;
        if (i0 != null) {
            i0.K0 = b;
        }
    }
    
    public interface b
    {
    }
}
