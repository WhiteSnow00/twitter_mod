// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.media.imageeditor;

import android.view.ViewGroup$MarginLayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import com.twitter.android.media.stickers.StickerFilteredImageView;
import android.widget.FrameLayout;

public class EditBadgeLayout extends FrameLayout
{
    public StickerFilteredImageView C0;
    public View D0;
    public View E0;
    
    public EditBadgeLayout(final Context context, final AttributeSet set) {
        super(context, set, 0);
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.C0 = (StickerFilteredImageView)((View)this).findViewById(2131429135);
        this.D0 = ((View)this).findViewById(2131427771);
        final View viewById = ((View)this).findViewById(2131428467);
        this.E0 = viewById;
        if (this.C0 != null && this.D0 != null && viewById != null) {
            return;
        }
        throw new RuntimeException("Required view is null");
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (pf8.n()) {
            final ncq orientedImageSize = this.C0.getOrientedImageSize();
            int n5 = (((View)this.C0).getMeasuredWidth() - orientedImageSize.a) / 2;
            final int max = Math.max((((View)this.C0).getMeasuredHeight() - orientedImageSize.b) / 2, this.E0.getMeasuredHeight());
            final int layoutDirection = ((View)this).getLayoutDirection();
            boolean b2 = true;
            if (layoutDirection != 1) {
                b2 = false;
            }
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)this.D0.getLayoutParams();
            int n6;
            if (b2) {
                n6 = 0;
            }
            else {
                n6 = n5;
            }
            if (!b2) {
                n5 = 0;
            }
            viewGroup$MarginLayoutParams.setMargins(n6, 0, n5, max);
        }
        super.onLayout(b, n, n2, n3, n4);
    }
}
