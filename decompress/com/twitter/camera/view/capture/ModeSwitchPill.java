// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.camera.view.capture;

import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

public class ModeSwitchPill extends View
{
    public final Drawable D0;
    public int E0;
    
    public ModeSwitchPill(final Context context, final AttributeSet set) {
        super(context, set, 0);
        this.D0 = krm.Companion.b((View)this).j(2131232688);
    }
    
    public final void a() {
        final int measuredWidth = this.getMeasuredWidth();
        final int e0 = this.E0;
        final int n = (measuredWidth - e0) / 2;
        this.D0.setBounds(n, 0, e0 + n, this.getMeasuredHeight());
    }
    
    public final void onDraw(final Canvas canvas) {
        this.D0.draw(canvas);
    }
    
    public final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        this.a();
        this.invalidate();
    }
    
    public void setWidthExcludingPadding(final int n) {
        this.E0 = this.getPaddingEnd() + (this.getPaddingStart() + n);
        this.a();
        this.invalidate();
    }
}
