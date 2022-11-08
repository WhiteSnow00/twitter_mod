// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.widget.LinearLayout$LayoutParams;
import android.view.View$MeasureSpec;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.WeakHashMap;
import android.view.ViewGroup;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

public class AlertDialogLayout extends LinearLayoutCompat
{
    public AlertDialogLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public static int l(final View view) {
        final WeakHashMap a = p5x.a;
        final int d = p5x$d.d(view);
        if (d > 0) {
            return d;
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            if (viewGroup.getChildCount() == 1) {
                return l(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }
    
    public final void onLayout(final boolean b, int n, int intrinsicHeight, int i, int gravity) {
        final int paddingLeft = ((View)this).getPaddingLeft();
        final int n2 = i - n;
        final int paddingRight = ((View)this).getPaddingRight();
        final int paddingRight2 = ((View)this).getPaddingRight();
        n = ((View)this).getMeasuredHeight();
        final int childCount = ((ViewGroup)this).getChildCount();
        final int gravity2 = this.getGravity();
        i = (gravity2 & 0x70);
        if (i != 16) {
            if (i != 80) {
                n = ((View)this).getPaddingTop();
            }
            else {
                n = ((View)this).getPaddingTop() + gravity - intrinsicHeight - n;
            }
        }
        else {
            i = ((View)this).getPaddingTop();
            n = (gravity - intrinsicHeight - n) / 2 + i;
        }
        final Drawable dividerDrawable = this.getDividerDrawable();
        i = 0;
        if (dividerDrawable == null) {
            intrinsicHeight = 0;
        }
        else {
            intrinsicHeight = dividerDrawable.getIntrinsicHeight();
        }
        while (i < childCount) {
            final View child = ((ViewGroup)this).getChildAt(i);
            gravity = n;
            if (child != null) {
                gravity = n;
                if (child.getVisibility() != 8) {
                    final int measuredWidth = child.getMeasuredWidth();
                    final int measuredHeight = child.getMeasuredHeight();
                    final LinearLayoutCompat$a linearLayoutCompat$a = (LinearLayoutCompat$a)child.getLayoutParams();
                    if ((gravity = ((LinearLayout$LayoutParams)linearLayoutCompat$a).gravity) < 0) {
                        gravity = (gravity2 & 0x800007);
                    }
                    final WeakHashMap a = p5x.a;
                    gravity = (Gravity.getAbsoluteGravity(gravity, p5x$e.d((View)this)) & 0x7);
                    Label_0313: {
                        int n3;
                        if (gravity != 1) {
                            if (gravity != 5) {
                                gravity = ((LinearLayout$LayoutParams)linearLayoutCompat$a).leftMargin + paddingLeft;
                                break Label_0313;
                            }
                            gravity = n2 - paddingRight - measuredWidth;
                            n3 = ((LinearLayout$LayoutParams)linearLayoutCompat$a).rightMargin;
                        }
                        else {
                            gravity = (n2 - paddingLeft - paddingRight2 - measuredWidth) / 2 + paddingLeft + ((LinearLayout$LayoutParams)linearLayoutCompat$a).leftMargin;
                            n3 = ((LinearLayout$LayoutParams)linearLayoutCompat$a).rightMargin;
                        }
                        gravity -= n3;
                    }
                    int n4 = n;
                    if (this.k(i)) {
                        n4 = n + intrinsicHeight;
                    }
                    n = n4 + ((LinearLayout$LayoutParams)linearLayoutCompat$a).topMargin;
                    child.layout(gravity, n, measuredWidth + gravity, measuredHeight + n);
                    gravity = measuredHeight + ((LinearLayout$LayoutParams)linearLayoutCompat$a).bottomMargin + n;
                }
            }
            ++i;
            n = gravity;
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        final int childCount = ((ViewGroup)this).getChildCount();
        View view = null;
        final int n3 = 0;
        View view3;
        View view2 = view3 = null;
        while (true) {
            for (int i = 0; i < childCount; ++i) {
                final View child = ((ViewGroup)this).getChildAt(i);
                if (child.getVisibility() != 8) {
                    final int id = child.getId();
                    if (id == 2131432131) {
                        view = child;
                    }
                    else if (id == 2131427976) {
                        view2 = child;
                    }
                    else {
                        if ((id != 2131428433 && id != 2131428561) || view3 != null) {
                            final int n4 = n3;
                            if (n4 == 0) {
                                super.onMeasure(n, n2);
                            }
                            return;
                        }
                        view3 = child;
                    }
                }
            }
            final int mode = View$MeasureSpec.getMode(n2);
            final int size = View$MeasureSpec.getSize(n2);
            final int mode2 = View$MeasureSpec.getMode(n);
            int n5 = ((View)this).getPaddingBottom() + ((View)this).getPaddingTop();
            int n6;
            if (view != null) {
                view.measure(n, 0);
                n5 += view.getMeasuredHeight();
                n6 = View.combineMeasuredStates(0, view.getMeasuredState());
            }
            else {
                n6 = 0;
            }
            int l;
            int n7;
            if (view2 != null) {
                view2.measure(n, 0);
                l = l(view2);
                n7 = view2.getMeasuredHeight() - l;
                n5 += l;
                n6 = View.combineMeasuredStates(n6, view2.getMeasuredState());
            }
            else {
                l = 0;
                n7 = 0;
            }
            int measuredHeight;
            if (view3 != null) {
                int measureSpec;
                if (mode == 0) {
                    measureSpec = 0;
                }
                else {
                    measureSpec = View$MeasureSpec.makeMeasureSpec(Math.max(0, size - n5), mode);
                }
                view3.measure(n, measureSpec);
                measuredHeight = view3.getMeasuredHeight();
                n5 += measuredHeight;
                n6 = View.combineMeasuredStates(n6, view3.getMeasuredState());
            }
            else {
                measuredHeight = 0;
            }
            final int n8 = size - n5;
            int n9 = n6;
            int n10 = n8;
            int n11 = n5;
            if (view2 != null) {
                final int min = Math.min(n8, n7);
                int n12 = n8;
                int n13 = l;
                if (min > 0) {
                    n12 = n8 - min;
                    n13 = l + min;
                }
                view2.measure(n, View$MeasureSpec.makeMeasureSpec(n13, 1073741824));
                n11 = n5 - l + view2.getMeasuredHeight();
                final int combineMeasuredStates = View.combineMeasuredStates(n6, view2.getMeasuredState());
                n10 = n12;
                n9 = combineMeasuredStates;
            }
            int combineMeasuredStates2 = n9;
            int n14 = n11;
            if (view3 != null) {
                combineMeasuredStates2 = n9;
                n14 = n11;
                if (n10 > 0) {
                    view3.measure(n, View$MeasureSpec.makeMeasureSpec(measuredHeight + n10, mode));
                    n14 = n11 - measuredHeight + view3.getMeasuredHeight();
                    combineMeasuredStates2 = View.combineMeasuredStates(n9, view3.getMeasuredState());
                }
            }
            int j = 0;
            int n15 = 0;
            while (j < childCount) {
                final View child2 = ((ViewGroup)this).getChildAt(j);
                int max = n15;
                if (child2.getVisibility() != 8) {
                    max = Math.max(n15, child2.getMeasuredWidth());
                }
                ++j;
                n15 = max;
            }
            ((View)this).setMeasuredDimension(View.resolveSizeAndState(((View)this).getPaddingRight() + ((View)this).getPaddingLeft() + n15, n, combineMeasuredStates2), View.resolveSizeAndState(n14, n2, 0));
            if (mode2 != 1073741824) {
                final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredWidth(), 1073741824);
                for (int k = 0; k < childCount; ++k) {
                    final View child3 = ((ViewGroup)this).getChildAt(k);
                    if (child3.getVisibility() != 8) {
                        final LinearLayoutCompat$a linearLayoutCompat$a = (LinearLayoutCompat$a)child3.getLayoutParams();
                        if (((LinearLayout$LayoutParams)linearLayoutCompat$a).width == -1) {
                            final int height = ((LinearLayout$LayoutParams)linearLayoutCompat$a).height;
                            ((LinearLayout$LayoutParams)linearLayoutCompat$a).height = child3.getMeasuredHeight();
                            ((ViewGroup)this).measureChildWithMargins(child3, measureSpec2, 0, n2, 0);
                            ((LinearLayout$LayoutParams)linearLayoutCompat$a).height = height;
                        }
                    }
                }
            }
            final int n4 = 1;
            continue;
        }
    }
}
