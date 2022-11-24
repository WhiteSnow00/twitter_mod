// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.floatingactionbutton;

import android.widget.TextView;
import android.view.View;
import android.content.res.ColorStateList;
import androidx.coordinatorlayout.widget.CoordinatorLayout$c;
import androidx.coordinatorlayout.widget.CoordinatorLayout$b;
import com.google.android.material.button.MaterialButton;

public final class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout$b
{
    public static final int Y0 = 0;
    public boolean X0;
    
    static {
        new ExtendedFloatingActionButton$a();
        new ExtendedFloatingActionButton$b();
        new ExtendedFloatingActionButton$c();
        new ExtendedFloatingActionButton$d();
    }
    
    public CoordinatorLayout$c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }
    
    public int getCollapsedPadding() {
        return (this.getCollapsedSize() - this.getIconSize()) / 2;
    }
    
    public int getCollapsedSize() {
        return 0;
    }
    
    public yrh getExtendMotionSpec() {
        throw null;
    }
    
    public yrh getHideMotionSpec() {
        throw null;
    }
    
    public yrh getShowMotionSpec() {
        throw null;
    }
    
    public yrh getShrinkMotionSpec() {
        throw null;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }
    
    public void setAnimateShowBeforeLayout(final boolean x0) {
        this.X0 = x0;
    }
    
    public void setExtendMotionSpec(final yrh yrh) {
        throw null;
    }
    
    public void setExtendMotionSpecResource(final int n) {
        this.setExtendMotionSpec(yrh.b(((View)this).getContext(), n));
    }
    
    public void setExtended(final boolean b) {
        if (!b) {
            return;
        }
        throw null;
    }
    
    public void setHideMotionSpec(final yrh yrh) {
        throw null;
    }
    
    public void setHideMotionSpecResource(final int n) {
        this.setHideMotionSpec(yrh.b(((View)this).getContext(), n));
    }
    
    public final void setPadding(final int n, final int n2, final int n3, final int n4) {
        super.setPadding(n, n2, n3, n4);
    }
    
    public final void setPaddingRelative(final int n, final int n2, final int n3, final int n4) {
        super.setPaddingRelative(n, n2, n3, n4);
    }
    
    public void setShowMotionSpec(final yrh yrh) {
        throw null;
    }
    
    public void setShowMotionSpecResource(final int n) {
        this.setShowMotionSpec(yrh.b(((View)this).getContext(), n));
    }
    
    public void setShrinkMotionSpec(final yrh yrh) {
        throw null;
    }
    
    public void setShrinkMotionSpecResource(final int n) {
        this.setShrinkMotionSpec(yrh.b(((View)this).getContext(), n));
    }
    
    public void setTextColor(final int textColor) {
        super.setTextColor(textColor);
        ((TextView)this).getTextColors();
    }
    
    public void setTextColor(final ColorStateList textColor) {
        super.setTextColor(textColor);
        ((TextView)this).getTextColors();
    }
}
