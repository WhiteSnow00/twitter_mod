// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.ui;

import android.view.View;
import android.content.res.TypedArray;
import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public final class AspectRatioFrameLayout extends FrameLayout
{
    public final b D0;
    public a E0;
    public float F0;
    public int G0;
    
    public AspectRatioFrameLayout(Context obtainStyledAttributes, final AttributeSet set) {
        super(obtainStyledAttributes, set);
        this.G0 = 0;
        if (set != null) {
            obtainStyledAttributes = (Context)obtainStyledAttributes.getTheme().obtainStyledAttributes(set, q3j.K0, 0, 0);
            try {
                this.G0 = ((TypedArray)obtainStyledAttributes).getInt(5, 0);
            }
            finally {
                ((TypedArray)obtainStyledAttributes).recycle();
            }
        }
        this.D0 = new b();
    }
    
    public int getResizeMode() {
        return this.G0;
    }
    
    public final void onMeasure(int measuredHeight, int measuredWidth) {
        super.onMeasure(measuredHeight, measuredWidth);
        if (this.F0 <= 0.0f) {
            return;
        }
        measuredWidth = ((View)this).getMeasuredWidth();
        measuredHeight = ((View)this).getMeasuredHeight();
        final float n = (float)measuredWidth;
        final float n2 = (float)measuredHeight;
        final float n3 = n / n2;
        final float n4 = this.F0 / n3 - 1.0f;
        if (Math.abs(n4) <= 0.01f) {
            final b d0 = this.D0;
            d0.D0 = this.F0;
            d0.E0 = n3;
            d0.F0 = false;
            if (!d0.G0) {
                d0.G0 = true;
                ((View)d0.H0).post((Runnable)d0);
            }
            return;
        }
        final int g0 = this.G0;
        Label_0219: {
            float n5 = 0.0f;
            Label_0188: {
                float n6;
                if (g0 != 0) {
                    if (g0 == 1) {
                        n5 = this.F0;
                        break Label_0188;
                    }
                    if (g0 != 2) {
                        if (g0 != 4) {
                            break Label_0219;
                        }
                        if (n4 <= 0.0f) {
                            n5 = this.F0;
                            break Label_0188;
                        }
                        n6 = this.F0;
                    }
                    else {
                        n6 = this.F0;
                    }
                }
                else {
                    if (n4 > 0.0f) {
                        n5 = this.F0;
                        break Label_0188;
                    }
                    n6 = this.F0;
                }
                measuredWidth = (int)(n2 * n6);
                break Label_0219;
            }
            measuredHeight = (int)(n / n5);
        }
        final b d2 = this.D0;
        d2.D0 = this.F0;
        d2.E0 = n3;
        d2.F0 = true;
        if (!d2.G0) {
            d2.G0 = true;
            ((View)d2.H0).post((Runnable)d2);
        }
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View$MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }
    
    public void setAspectRatio(final float f0) {
        if (this.F0 != f0) {
            this.F0 = f0;
            ((View)this).requestLayout();
        }
    }
    
    public void setAspectRatioListener(final a e0) {
        this.E0 = e0;
    }
    
    public void setResizeMode(final int g0) {
        if (this.G0 != g0) {
            this.G0 = g0;
            ((View)this).requestLayout();
        }
    }
    
    public interface a
    {
        void a();
    }
    
    public final class b implements Runnable
    {
        public float D0;
        public float E0;
        public boolean F0;
        public boolean G0;
        public final AspectRatioFrameLayout H0;
        
        public b(final AspectRatioFrameLayout h0) {
            this.H0 = h0;
        }
        
        @Override
        public final void run() {
            this.G0 = false;
            final a e0 = this.H0.E0;
            if (e0 == null) {
                return;
            }
            e0.a();
        }
    }
}
