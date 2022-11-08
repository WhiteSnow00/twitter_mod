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
    public final CroppableImageView o1;
    public a p1;
    
    public CropMediaImageView(final Context context, final AttributeSet set) {
        super(context, set, 0, (ImageView)View.inflate(context, 2131624226, (ViewGroup)null), true);
        this.o1 = this.getImageView();
    }
    
    public a getCropState() {
        return new a(((MultiTouchImageView)this.o1).getImageRotation(), ((MultiTouchImageView)this.o1).getNormalizedImageSelection());
    }
    
    public CroppableImageView getImageView() {
        return (CroppableImageView)super.getImageView();
    }
    
    public final void i(final x8d x8d, final Drawable drawable) {
        super.i(x8d, drawable);
        this.o1.setShowCrop(true);
        final a p2 = this.p1;
        if (p2 != null) {
            ((MultiTouchImageView)this.o1).setImageSelection(p2.b);
            this.o1.setRotation(this.p1.a);
        }
        if (!this.o1.e1) {
            final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            ((Animation)alphaAnimation).setDuration(200L);
            ((View)this.o1).startAnimation((Animation)alphaAnimation);
        }
    }
    
    public void setZoomDisabled(final boolean zoomDisabled) {
        ((MultiTouchImageView)this.o1).setZoomDisabled(zoomDisabled);
    }
    
    public static final class a
    {
        public final int a;
        public final abm b;
        
        public a(final int a, final abm b) {
            this.a = a;
            this.b = b;
        }
    }
}
