// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.progressindicator;

import android.view.View;
import java.util.Objects;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.content.Context;

public final class CircularProgressIndicator extends gp1<za4>
{
    public CircularProgressIndicator(Context context, final AttributeSet set) {
        super(context, set);
        context = ((View)this).getContext();
        final za4 za4 = (za4)super.C0;
        this.setIndeterminateDrawable((Drawable)new tkd(context, (hp1)za4, (bj9)new ra4(za4), (rn1)new va4(za4)));
        final Context context2 = ((View)this).getContext();
        final za4 za5 = (za4)super.C0;
        this.setProgressDrawable((Drawable)new rt8(context2, (hp1)za5, (bj9)new ra4(za5)));
    }
    
    public int getIndicatorDirection() {
        return ((za4)super.C0).i;
    }
    
    public int getIndicatorInset() {
        return ((za4)super.C0).h;
    }
    
    public int getIndicatorSize() {
        return ((za4)super.C0).g;
    }
    
    public void setIndicatorDirection(final int i) {
        ((za4)super.C0).i = i;
        this.invalidate();
    }
    
    public void setIndicatorInset(final int h) {
        final hp1 c0 = super.C0;
        if (((za4)c0).h != h) {
            ((za4)c0).h = h;
            this.invalidate();
        }
    }
    
    public void setIndicatorSize(int max) {
        max = Math.max(max, this.getTrackThickness() * 2);
        final hp1 c0 = super.C0;
        if (((za4)c0).g != max) {
            ((za4)c0).g = max;
            Objects.requireNonNull(c0);
            this.invalidate();
        }
    }
    
    @Override
    public void setTrackThickness(final int trackThickness) {
        super.setTrackThickness(trackThickness);
        Objects.requireNonNull(super.C0);
    }
}
