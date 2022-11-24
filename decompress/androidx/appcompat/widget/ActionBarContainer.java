// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.ViewGroup;
import android.view.ActionMode;
import android.view.ActionMode$Callback;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable$Callback;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import android.widget.FrameLayout$LayoutParams;
import android.content.res.TypedArray;
import java.util.WeakHashMap;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;

public class ActionBarContainer extends FrameLayout
{
    public boolean F0;
    public b G0;
    public View H0;
    public View I0;
    public Drawable J0;
    public Drawable K0;
    public Drawable L0;
    public boolean M0;
    public boolean N0;
    public int O0;
    
    public ActionBarContainer(final Context context, final AttributeSet set) {
        super(context, set);
        final vj vj = new vj(this);
        final WeakHashMap a = b7x.a;
        b7x$d.q((View)this, (Drawable)vj);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, fr0.H0);
        final boolean b = false;
        this.J0 = obtainStyledAttributes.getDrawable(0);
        this.K0 = obtainStyledAttributes.getDrawable(2);
        this.O0 = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (((View)this).getId() == 2131431676) {
            this.M0 = true;
            this.L0 = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        boolean willNotDraw = false;
        Label_0140: {
            if (this.M0) {
                willNotDraw = b;
                if (this.L0 != null) {
                    break Label_0140;
                }
            }
            else {
                willNotDraw = b;
                if (this.J0 != null) {
                    break Label_0140;
                }
                willNotDraw = b;
                if (this.K0 != null) {
                    break Label_0140;
                }
            }
            willNotDraw = true;
        }
        ((View)this).setWillNotDraw(willNotDraw);
    }
    
    public final int a(final View view) {
        final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)view.getLayoutParams();
        return view.getMeasuredHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin;
    }
    
    public final boolean b(final View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        final Drawable j0 = this.J0;
        if (j0 != null && j0.isStateful()) {
            this.J0.setState(((View)this).getDrawableState());
        }
        final Drawable k0 = this.K0;
        if (k0 != null && k0.isStateful()) {
            this.K0.setState(((View)this).getDrawableState());
        }
        final Drawable l0 = this.L0;
        if (l0 != null && l0.isStateful()) {
            this.L0.setState(((View)this).getDrawableState());
        }
    }
    
    public View getTabContainer() {
        return (View)this.G0;
    }
    
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final Drawable j0 = this.J0;
        if (j0 != null) {
            j0.jumpToCurrentState();
        }
        final Drawable k0 = this.K0;
        if (k0 != null) {
            k0.jumpToCurrentState();
        }
        final Drawable l0 = this.L0;
        if (l0 != null) {
            l0.jumpToCurrentState();
        }
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.H0 = ((View)this).findViewById(2131427439);
        this.I0 = ((View)this).findViewById(2131427457);
    }
    
    public final boolean onHoverEvent(final MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return this.F0 || super.onInterceptTouchEvent(motionEvent);
    }
    
    public final void onLayout(final boolean b, int n, int n2, final int n3, int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final b g0 = this.G0;
        n4 = 0;
        n2 = 0;
        final boolean n5 = g0 != null && ((View)g0).getVisibility() != 8;
        if (g0 != null && ((View)g0).getVisibility() != 8) {
            final int measuredHeight = ((View)this).getMeasuredHeight();
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)((View)g0).getLayoutParams();
            final int measuredHeight2 = ((View)g0).getMeasuredHeight();
            final int bottomMargin = frameLayout$LayoutParams.bottomMargin;
            ((View)g0).layout(n, measuredHeight - measuredHeight2 - bottomMargin, n3, measuredHeight - bottomMargin);
        }
        Label_0325: {
            if (this.M0) {
                final Drawable l0 = this.L0;
                n = n4;
                if (l0 == null) {
                    break Label_0325;
                }
                l0.setBounds(0, 0, ((View)this).getMeasuredWidth(), ((View)this).getMeasuredHeight());
            }
            else {
                if (this.J0 != null) {
                    if (this.H0.getVisibility() == 0) {
                        this.J0.setBounds(this.H0.getLeft(), this.H0.getTop(), this.H0.getRight(), this.H0.getBottom());
                    }
                    else {
                        final View i0 = this.I0;
                        if (i0 != null && i0.getVisibility() == 0) {
                            this.J0.setBounds(this.I0.getLeft(), this.I0.getTop(), this.I0.getRight(), this.I0.getBottom());
                        }
                        else {
                            this.J0.setBounds(0, 0, 0, 0);
                        }
                    }
                    n2 = 1;
                }
                this.N0 = n5;
                n = n2;
                if (!n5) {
                    break Label_0325;
                }
                final Drawable k0 = this.K0;
                n = n2;
                if (k0 == null) {
                    break Label_0325;
                }
                k0.setBounds(((View)g0).getLeft(), ((View)g0).getTop(), ((View)g0).getRight(), ((View)g0).getBottom());
            }
            n = 1;
        }
        if (n != 0) {
            ((View)this).invalidate();
        }
    }
    
    public final void onMeasure(int n, int n2) {
        int measureSpec = n2;
        if (this.H0 == null) {
            measureSpec = n2;
            if (View$MeasureSpec.getMode(n2) == Integer.MIN_VALUE) {
                final int o0 = this.O0;
                measureSpec = n2;
                if (o0 >= 0) {
                    measureSpec = View$MeasureSpec.makeMeasureSpec(Math.min(o0, View$MeasureSpec.getSize(n2)), Integer.MIN_VALUE);
                }
            }
        }
        super.onMeasure(n, measureSpec);
        if (this.H0 == null) {
            return;
        }
        n2 = View$MeasureSpec.getMode(measureSpec);
        final b g0 = this.G0;
        if (g0 != null && ((View)g0).getVisibility() != 8 && n2 != 1073741824) {
            if (!this.b(this.H0)) {
                n = this.a(this.H0);
            }
            else if (!this.b(this.I0)) {
                n = this.a(this.I0);
            }
            else {
                n = 0;
            }
            if (n2 == Integer.MIN_VALUE) {
                n2 = View$MeasureSpec.getSize(measureSpec);
            }
            else {
                n2 = Integer.MAX_VALUE;
            }
            ((View)this).setMeasuredDimension(((View)this).getMeasuredWidth(), Math.min(this.a((View)this.G0) + n, n2));
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }
    
    public void setPrimaryBackground(final Drawable j0) {
        final Drawable j2 = this.J0;
        if (j2 != null) {
            j2.setCallback((Drawable$Callback)null);
            ((View)this).unscheduleDrawable(this.J0);
        }
        if ((this.J0 = j0) != null) {
            j0.setCallback((Drawable$Callback)this);
            final View h0 = this.H0;
            if (h0 != null) {
                this.J0.setBounds(h0.getLeft(), this.H0.getTop(), this.H0.getRight(), this.H0.getBottom());
            }
        }
        final boolean m0 = this.M0;
        boolean willNotDraw = true;
        Label_0120: {
            if (m0) {
                if (this.L0 == null) {
                    break Label_0120;
                }
            }
            else if (this.J0 == null && this.K0 == null) {
                break Label_0120;
            }
            willNotDraw = false;
        }
        ((View)this).setWillNotDraw(willNotDraw);
        ((View)this).invalidate();
        ((View)this).invalidateOutline();
    }
    
    public void setSplitBackground(Drawable l0) {
        final Drawable l2 = this.L0;
        if (l2 != null) {
            l2.setCallback((Drawable$Callback)null);
            ((View)this).unscheduleDrawable(this.L0);
        }
        this.L0 = l0;
        final boolean b = false;
        if (l0 != null) {
            l0.setCallback((Drawable$Callback)this);
            if (this.M0) {
                l0 = this.L0;
                if (l0 != null) {
                    l0.setBounds(0, 0, ((View)this).getMeasuredWidth(), ((View)this).getMeasuredHeight());
                }
            }
        }
        boolean willNotDraw = false;
        Label_0113: {
            if (this.M0) {
                willNotDraw = b;
                if (this.L0 != null) {
                    break Label_0113;
                }
            }
            else {
                willNotDraw = b;
                if (this.J0 != null) {
                    break Label_0113;
                }
                willNotDraw = b;
                if (this.K0 != null) {
                    break Label_0113;
                }
            }
            willNotDraw = true;
        }
        ((View)this).setWillNotDraw(willNotDraw);
        ((View)this).invalidate();
        ((View)this).invalidateOutline();
    }
    
    public void setStackedBackground(Drawable k0) {
        final Drawable k2 = this.K0;
        if (k2 != null) {
            k2.setCallback((Drawable$Callback)null);
            ((View)this).unscheduleDrawable(this.K0);
        }
        if ((this.K0 = k0) != null) {
            k0.setCallback((Drawable$Callback)this);
            if (this.N0) {
                k0 = this.K0;
                if (k0 != null) {
                    k0.setBounds(((View)this.G0).getLeft(), ((View)this.G0).getTop(), ((View)this.G0).getRight(), ((View)this.G0).getBottom());
                }
            }
        }
        final boolean m0 = this.M0;
        boolean willNotDraw = true;
        Label_0127: {
            if (m0) {
                if (this.L0 == null) {
                    break Label_0127;
                }
            }
            else if (this.J0 == null && this.K0 == null) {
                break Label_0127;
            }
            willNotDraw = false;
        }
        ((View)this).setWillNotDraw(willNotDraw);
        ((View)this).invalidate();
        ((View)this).invalidateOutline();
    }
    
    public void setTabContainer(final b g0) {
        final b g2 = this.G0;
        if (g2 != null) {
            ((ViewGroup)this).removeView((View)g2);
        }
        if ((this.G0 = g0) != null) {
            ((ViewGroup)this).addView((View)g0);
            final ViewGroup$LayoutParams layoutParams = ((View)g0).getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            g0.setAllowCollapse(false);
        }
    }
    
    public void setTransitioning(final boolean f0) {
        this.F0 = f0;
        int descendantFocusability;
        if (f0) {
            descendantFocusability = 393216;
        }
        else {
            descendantFocusability = 262144;
        }
        ((ViewGroup)this).setDescendantFocusability(descendantFocusability);
    }
    
    public void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        final boolean b = visibility == 0;
        final Drawable j0 = this.J0;
        if (j0 != null) {
            j0.setVisible(b, false);
        }
        final Drawable k0 = this.K0;
        if (k0 != null) {
            k0.setVisible(b, false);
        }
        final Drawable l0 = this.L0;
        if (l0 != null) {
            l0.setVisible(b, false);
        }
    }
    
    public final ActionMode startActionModeForChild(final View view, final ActionMode$Callback actionMode$Callback) {
        return null;
    }
    
    public final ActionMode startActionModeForChild(final View view, final ActionMode$Callback actionMode$Callback, final int n) {
        if (n != 0) {
            return super.startActionModeForChild(view, actionMode$Callback, n);
        }
        return null;
    }
    
    public final boolean verifyDrawable(final Drawable drawable) {
        return (drawable == this.J0 && !this.M0) || (drawable == this.K0 && this.N0) || (drawable == this.L0 && this.M0) || super.verifyDrawable(drawable);
    }
}
