// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.media.stickers;

import com.twitter.media.ui.image.d;
import android.graphics.Canvas;
import android.view.View;
import com.twitter.media.ui.image.b$c;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.annotation.SuppressLint;
import com.twitter.media.ui.image.MediaImageView;

@SuppressLint({ "ViewConstructor" })
public final class b extends MediaImageView
{
    public final b.b$a r1;
    public final int s1;
    public final Drawable t1;
    public boolean u1;
    
    public b(final Context context, final b.b$a r1, final Drawable defaultDrawable) {
        super(context, (AttributeSet)null, 2130970141, (ImageView)null, false);
        this.x();
        this.r1 = r1;
        ((View)this).setRotation(r1.e);
        final z8d$a g = z8d.g(r1.a.N0.b.b);
        g.u = "stickers";
        g.k = (z6w)new air(r1.a.N0);
        ((d)this).p(g);
        ((d)this).setDefaultDrawableScaleType(ImageView$ScaleType.FIT_CENTER);
        ((d)this).setDefaultDrawable(defaultDrawable);
        ((View)this).setWillNotDraw(false);
        this.s1 = ((View)this).getResources().getDimensionPixelSize(2131167279);
        ((d)this).setScaleType(b$c.G0);
        this.t1 = zrm.Companion.b((View)this).j(2131233457);
        ((d)this).setUpdateOnResize(true);
    }
    
    public b.b$a getDisplayInfo() {
        return this.r1;
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.u1) {
            final Drawable t1 = this.t1;
            final int s1 = this.s1;
            t1.setBounds(-s1, -s1, ((View)this).getWidth() + this.s1, ((View)this).getHeight() + this.s1);
            this.t1.draw(canvas);
        }
    }
    
    public void setIsActive(final boolean u1) {
        this.u1 = u1;
    }
}
