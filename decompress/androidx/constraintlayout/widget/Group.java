// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.widget;

import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

public class Group extends a
{
    public Group(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final void j(final ConstraintLayout constraintLayout) {
        this.i(constraintLayout);
    }
    
    public final void m(final AttributeSet set) {
        super.m(set);
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h();
    }
    
    public final void q() {
        final ConstraintLayout$a constraintLayout$a = (ConstraintLayout$a)((View)this).getLayoutParams();
        constraintLayout$a.q0.X(0);
        constraintLayout$a.q0.S(0);
    }
    
    public void setElevation(final float elevation) {
        super.setElevation(elevation);
        this.h();
    }
    
    public void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        this.h();
    }
}
