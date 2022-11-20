// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.accessibility.AccessibilityRecord;
import java.util.Objects;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.app.a$c;
import android.widget.LinearLayout;
import android.view.View$MeasureSpec;
import android.view.View;
import android.widget.AdapterView;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Configuration;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.HorizontalScrollView;

public final class b extends HorizontalScrollView implements AdapterView$OnItemSelectedListener
{
    static {
        new DecelerateInterpolator();
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final Context context = ((View)this).getContext();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet)null, jee.I0, 2130968607, 0);
        final int layoutDimension = obtainStyledAttributes.getLayoutDimension(13, 0);
        final Resources resources = context.getResources();
        int min = layoutDimension;
        if (!context.getResources().getBoolean(2131034113)) {
            min = Math.min(layoutDimension, resources.getDimensionPixelSize(2131165193));
        }
        obtainStyledAttributes.recycle();
        this.setContentHeight(min);
        context.getResources().getDimensionPixelSize(2131165194);
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
    
    public final void onItemSelected(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
        ((a)view).D0.a();
    }
    
    public final void onMeasure(final int n, final int n2) {
        this.setFillViewport(View$MeasureSpec.getMode(n) == 1073741824);
        throw null;
    }
    
    public final void onNothingSelected(final AdapterView<?> adapterView) {
    }
    
    public void setAllowCollapse(final boolean b) {
    }
    
    public void setContentHeight(final int n) {
        ((View)this).requestLayout();
    }
    
    public void setTabSelected(final int n) {
        throw null;
    }
    
    public final class a extends LinearLayout
    {
        public a$c D0;
        public final b E0;
        
        public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ((AccessibilityRecord)accessibilityEvent).setClassName((CharSequence)"androidx.appcompat.app.ActionBar$Tab");
        }
        
        public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName((CharSequence)"androidx.appcompat.app.ActionBar$Tab");
        }
        
        public final void onMeasure(final int n, final int n2) {
            super.onMeasure(n, n2);
            Objects.requireNonNull(this.E0);
        }
        
        public final void setSelected(final boolean selected) {
            final boolean b = ((View)this).isSelected() != selected;
            super.setSelected(selected);
            if (b && selected) {
                ((View)this).sendAccessibilityEvent(4);
            }
        }
    }
}
