// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.floatingactionbutton;

import android.widget.TextView;
import android.view.View;
import android.content.res.ColorStateList;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.button.MaterialButton;

public final class ExtendedFloatingActionButton extends MaterialButton implements b
{
    public static final int W0 = 0;
    public boolean V0;
    
    static {
        new ExtendedFloatingActionButton$a();
        new ExtendedFloatingActionButton$b();
        new ExtendedFloatingActionButton$c();
        new ExtendedFloatingActionButton$d();
    }
    
    public c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }
    
    public int getCollapsedPadding() {
        return (this.getCollapsedSize() - this.getIconSize()) / 2;
    }
    
    public int getCollapsedSize() {
        return 0;
    }
    
    public jrh getExtendMotionSpec() {
        throw null;
    }
    
    public jrh getHideMotionSpec() {
        throw null;
    }
    
    public jrh getShowMotionSpec() {
        throw null;
    }
    
    public jrh getShrinkMotionSpec() {
        throw null;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }
    
    public void setAnimateShowBeforeLayout(final boolean v0) {
        this.V0 = v0;
    }
    
    public void setExtendMotionSpec(final jrh jrh) {
        throw null;
    }
    
    public void setExtendMotionSpecResource(final int n) {
        this.setExtendMotionSpec(jrh.b(((View)this).getContext(), n));
    }
    
    public void setExtended(final boolean b) {
        if (!b) {
            return;
        }
        throw null;
    }
    
    public void setHideMotionSpec(final jrh jrh) {
        throw null;
    }
    
    public void setHideMotionSpecResource(final int n) {
        this.setHideMotionSpec(jrh.b(((View)this).getContext(), n));
    }
    
    public final void setPadding(final int n, final int n2, final int n3, final int n4) {
        super.setPadding(n, n2, n3, n4);
    }
    
    public final void setPaddingRelative(final int n, final int n2, final int n3, final int n4) {
        super.setPaddingRelative(n, n2, n3, n4);
    }
    
    public void setShowMotionSpec(final jrh jrh) {
        throw null;
    }
    
    public void setShowMotionSpecResource(final int n) {
        this.setShowMotionSpec(jrh.b(((View)this).getContext(), n));
    }
    
    public void setShrinkMotionSpec(final jrh jrh) {
        throw null;
    }
    
    public void setShrinkMotionSpecResource(final int n) {
        this.setShrinkMotionSpec(jrh.b(((View)this).getContext(), n));
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
