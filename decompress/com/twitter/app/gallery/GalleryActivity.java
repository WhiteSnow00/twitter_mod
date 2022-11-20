// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.gallery;

import android.view.ViewGroup$MarginLayoutParams;
import com.twitter.tweetview.core.TweetView;
import android.content.res.Resources;
import android.view.View;

public class GalleryActivity extends vmd
{
    public static void d0(final View view, final Resources resources, final TweetView tweetView, final int n) {
        final int dimensionPixelOffset = resources.getDimensionPixelOffset(2131165866);
        int dimensionPixelOffset2;
        int n2;
        if (((View)tweetView).getVisibility() == 0) {
            dimensionPixelOffset2 = resources.getDimensionPixelOffset(2131165871) + pcw.d(-3) + resources.getDimensionPixelOffset(2131167644);
            n2 = resources.getDimensionPixelOffset(2131165869);
        }
        else {
            dimensionPixelOffset2 = resources.getDimensionPixelOffset(2131165867);
            n2 = resources.getDimensionPixelOffset(2131165868);
        }
        ((ViewGroup$MarginLayoutParams)view.getLayoutParams()).setMargins(dimensionPixelOffset2, n2, n, dimensionPixelOffset);
    }
}
