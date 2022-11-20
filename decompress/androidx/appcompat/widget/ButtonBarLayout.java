// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import android.widget.LinearLayout$LayoutParams;
import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;

public class ButtonBarLayout extends LinearLayout
{
    public boolean D0;
    public boolean E0;
    public int F0;
    
    public ButtonBarLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.F0 = -1;
        final int[] s0 = jee.S0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, s0);
        j6x.y((View)this, context, s0, set, obtainStyledAttributes, 0);
        this.D0 = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (this.getOrientation() == 1) {
            this.setStacked(this.D0);
        }
    }
    
    private void setStacked(final boolean e0) {
        if (this.E0 != e0 && (!e0 || this.D0)) {
            this.setOrientation((int)((this.E0 = e0) ? 1 : 0));
            int gravity;
            if (e0) {
                gravity = 8388613;
            }
            else {
                gravity = 80;
            }
            this.setGravity(gravity);
            final View viewById = ((View)this).findViewById(2131431574);
            if (viewById != null) {
                int visibility;
                if (e0) {
                    visibility = 8;
                }
                else {
                    visibility = 4;
                }
                viewById.setVisibility(visibility);
            }
            for (int i = ((ViewGroup)this).getChildCount() - 2; i >= 0; --i) {
                ((ViewGroup)this).bringChildToFront(((ViewGroup)this).getChildAt(i));
            }
        }
    }
    
    public final int a(int i) {
        while (i < ((ViewGroup)this).getChildCount()) {
            if (((ViewGroup)this).getChildAt(i).getVisibility() == 0) {
                return i;
            }
            ++i;
        }
        return -1;
    }
    
    public final void onMeasure(final int n, final int n2) {
        final int size = View$MeasureSpec.getSize(n);
        final boolean d0 = this.D0;
        final int n3 = 0;
        if (d0) {
            if (size > this.F0 && this.E0) {
                this.setStacked(false);
            }
            this.F0 = size;
        }
        int measureSpec;
        boolean b;
        if (!this.E0 && View$MeasureSpec.getMode(n) == 1073741824) {
            measureSpec = View$MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            b = true;
        }
        else {
            measureSpec = n;
            b = false;
        }
        super.onMeasure(measureSpec, n2);
        boolean b2 = b;
        if (this.D0) {
            b2 = b;
            if (!this.E0) {
                final boolean b3 = (((View)this).getMeasuredWidthAndState() & 0xFF000000) == 0x1000000;
                b2 = b;
                if (b3) {
                    this.setStacked(true);
                    b2 = true;
                }
            }
        }
        if (b2) {
            super.onMeasure(n, n2);
        }
        final int a = this.a(0);
        int minimumHeight = n3;
        if (a >= 0) {
            final View child = ((ViewGroup)this).getChildAt(a);
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)child.getLayoutParams();
            minimumHeight = child.getMeasuredHeight() + ((View)this).getPaddingTop() + linearLayout$LayoutParams.topMargin + linearLayout$LayoutParams.bottomMargin + 0;
            if (this.E0) {
                final int a2 = this.a(a + 1);
                if (a2 >= 0) {
                    minimumHeight += ((ViewGroup)this).getChildAt(a2).getPaddingTop() + (int)(((View)this).getResources().getDisplayMetrics().density * 16.0f);
                }
            }
            else {
                minimumHeight += ((View)this).getPaddingBottom();
            }
        }
        final WeakHashMap a3 = j6x.a;
        if (j6x$d.d((View)this) != minimumHeight) {
            ((View)this).setMinimumHeight(minimumHeight);
            if (n2 == 0) {
                super.onMeasure(n, n2);
            }
        }
    }
    
    public void setAllowStacking(final boolean d0) {
        if (this.D0 != d0) {
            this.D0 = d0;
            if (!d0 && this.E0) {
                this.setStacked(false);
            }
            ((View)this).requestLayout();
        }
    }
}
