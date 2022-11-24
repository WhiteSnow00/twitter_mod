// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.media.imageeditor;

import com.twitter.ui.widget.MultiTouchImageView;
import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.ui.widget.CroppableImageView;
import com.twitter.media.ui.image.MediaImageView;

public class CropMediaImageView extends MediaImageView
{
    public final CroppableImageView r1;
    public CropMediaImageView.CropMediaImageView$a s1;
    
    public CropMediaImageView(final Context context, final AttributeSet set) {
        super(context, set, 0, (ImageView)View.inflate(context, 2131624226, (ViewGroup)null), true);
        this.r1 = this.getImageView();
    }
    
    public CropMediaImageView.CropMediaImageView$a getCropState() {
        return new CropMediaImageView.CropMediaImageView$a(((MultiTouchImageView)this.r1).getImageRotation(), ((MultiTouchImageView)this.r1).getNormalizedImageSelection());
    }
    
    public /* bridge */ View getImageView() {
        return (View)this.getImageView();
    }
    
    public /* bridge */ ImageView getImageView() {
        return (ImageView)this.getImageView();
    }
    
    public CroppableImageView getImageView() {
        return (CroppableImageView)super.getImageView();
    }
    
    public final void i(final d9d d9d, final Drawable drawable) {
        super.i(d9d, drawable);
        this.r1.setShowCrop(true);
        final CropMediaImageView.CropMediaImageView$a s1 = this.s1;
        if (s1 != null) {
            ((MultiTouchImageView)this.r1).setImageSelection(s1.b);
            this.r1.setRotation(this.s1.a);
        }
        if (!this.r1.h1) {
            final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            ((Animation)alphaAnimation).setDuration(200L);
            ((View)this.r1).startAnimation((Animation)alphaAnimation);
        }
    }
    
    public void setZoomDisabled(final boolean zoomDisabled) {
        ((MultiTouchImageView)this.r1).setZoomDisabled(zoomDisabled);
    }
}
