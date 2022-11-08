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
    public final a o1;
    public final int p1;
    public final Drawable q1;
    public boolean r1;
    
    public b(final Context context, final a o1, final Drawable defaultDrawable) {
        super(context, (AttributeSet)null, 2130970141, (ImageView)null, false);
        this.x();
        this.o1 = o1;
        ((View)this).setRotation(o1.e);
        final t8d$a g = t8d.g(o1.a.K0.b.b);
        g.u = "stickers";
        g.k = (z5w)new kgr(o1.a.K0);
        ((d)this).p(g);
        ((d)this).setDefaultDrawableScaleType(ImageView$ScaleType.FIT_CENTER);
        ((d)this).setDefaultDrawable(defaultDrawable);
        ((View)this).setWillNotDraw(false);
        this.p1 = ((View)this).getResources().getDimensionPixelSize(2131167279);
        ((d)this).setScaleType(b$c.D0);
        this.q1 = tqm.Companion.b((View)this).j(2131233455);
        ((d)this).setUpdateOnResize(true);
    }
    
    public a getDisplayInfo() {
        return this.o1;
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.r1) {
            final Drawable q1 = this.q1;
            final int p = this.p1;
            q1.setBounds(-p, -p, ((View)this).getWidth() + this.p1, ((View)this).getHeight() + this.p1);
            this.q1.draw(canvas);
        }
    }
    
    public void setIsActive(final boolean r1) {
        this.r1 = r1;
    }
    
    public static final class a
    {
        public final rfr a;
        public float b;
        public float c;
        public float d;
        public float e;
        
        public a(final rfr a, final float e) {
            this.a = a;
            this.e = e;
        }
        
        public a(final xgr xgr) {
            this.a = xgr.a;
            final ygr b = xgr.b;
            this.d = b.a;
            this.b = b.c;
            this.c = b.d;
            this.e = b.b;
        }
        
        public final float a() {
            return this.a.K0.a;
        }
        
        public final ncq b(final float n) {
            return ncq.e(this.d * n, this.a() * n * this.d);
        }
    }
}
