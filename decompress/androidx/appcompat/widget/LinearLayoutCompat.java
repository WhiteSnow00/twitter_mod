// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.accessibility.AccessibilityRecord;
import android.widget.LinearLayout$LayoutParams;
import android.view.View$MeasureSpec;
import java.util.WeakHashMap;
import android.view.Gravity;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

public class LinearLayoutCompat extends ViewGroup
{
    public boolean D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public boolean K0;
    public int[] L0;
    public int[] M0;
    public Drawable N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    
    public LinearLayoutCompat(final Context context) {
        this(context, null);
    }
    
    public LinearLayoutCompat(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public LinearLayoutCompat(final Context context, final AttributeSet set, int n) {
        super(context, set, n);
        this.D0 = true;
        this.E0 = -1;
        this.F0 = 0;
        this.H0 = 8388659;
        final int[] v0 = jee.V0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, v0, n, 0);
        j6x.y((View)this, context, v0, set, obtainStyledAttributes, n);
        n = obtainStyledAttributes.getInt(1, -1);
        if (n >= 0) {
            this.setOrientation(n);
        }
        n = obtainStyledAttributes.getInt(0, -1);
        if (n >= 0) {
            this.setGravity(n);
        }
        final boolean boolean1 = obtainStyledAttributes.getBoolean(2, true);
        if (!boolean1) {
            this.setBaselineAligned(boolean1);
        }
        this.J0 = obtainStyledAttributes.getFloat(4, -1.0f);
        this.E0 = obtainStyledAttributes.getInt(3, -1);
        this.K0 = obtainStyledAttributes.getBoolean(7, false);
        Drawable dividerDrawable = null;
        Label_0181: {
            if (obtainStyledAttributes.hasValue(5)) {
                n = obtainStyledAttributes.getResourceId(5, 0);
                if (n != 0) {
                    dividerDrawable = v68.x(context, n);
                    break Label_0181;
                }
            }
            dividerDrawable = obtainStyledAttributes.getDrawable(5);
        }
        this.setDividerDrawable(dividerDrawable);
        this.Q0 = obtainStyledAttributes.getInt(8, 0);
        this.R0 = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }
    
    public boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof a;
    }
    
    public final void f(final Canvas canvas, final int n) {
        this.N0.setBounds(((View)this).getPaddingLeft() + this.R0, n, ((View)this).getWidth() - ((View)this).getPaddingRight() - this.R0, this.P0 + n);
        this.N0.draw(canvas);
    }
    
    public final void g(final Canvas canvas, final int n) {
        this.N0.setBounds(n, ((View)this).getPaddingTop() + this.R0, this.O0 + n, ((View)this).getHeight() - ((View)this).getPaddingBottom() - this.R0);
        this.N0.draw(canvas);
    }
    
    public /* bridge */ ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)this.h();
    }
    
    public /* bridge */ ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)this.i(set);
    }
    
    public /* bridge */ ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)this.j(viewGroup$LayoutParams);
    }
    
    public int getBaseline() {
        if (this.E0 < 0) {
            return super.getBaseline();
        }
        final int childCount = this.getChildCount();
        final int e0 = this.E0;
        if (childCount <= e0) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        final View child = this.getChildAt(e0);
        final int baseline = child.getBaseline();
        if (baseline != -1) {
            int f0;
            final int n = f0 = this.F0;
            if (this.G0 == 1) {
                final int n2 = this.H0 & 0x70;
                f0 = n;
                if (n2 != 48) {
                    if (n2 != 16) {
                        if (n2 != 80) {
                            f0 = n;
                        }
                        else {
                            f0 = ((View)this).getBottom() - ((View)this).getTop() - ((View)this).getPaddingBottom() - this.I0;
                        }
                    }
                    else {
                        f0 = n + (((View)this).getBottom() - ((View)this).getTop() - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom() - this.I0) / 2;
                    }
                }
            }
            return f0 + ((a)child.getLayoutParams()).topMargin + baseline;
        }
        if (this.E0 == 0) {
            return -1;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
    }
    
    public int getBaselineAlignedChildIndex() {
        return this.E0;
    }
    
    public Drawable getDividerDrawable() {
        return this.N0;
    }
    
    public int getDividerPadding() {
        return this.R0;
    }
    
    public int getDividerWidth() {
        return this.O0;
    }
    
    public int getGravity() {
        return this.H0;
    }
    
    public int getOrientation() {
        return this.G0;
    }
    
    public int getShowDividers() {
        return this.Q0;
    }
    
    public int getVirtualChildCount() {
        return this.getChildCount();
    }
    
    public float getWeightSum() {
        return this.J0;
    }
    
    public a h() {
        final int g0 = this.G0;
        if (g0 == 0) {
            return new a(-2, -2);
        }
        if (g0 == 1) {
            return new a(-1, -2);
        }
        return null;
    }
    
    public a i(final AttributeSet set) {
        return new a(((View)this).getContext(), set);
    }
    
    public a j(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return new a(viewGroup$LayoutParams);
    }
    
    public final boolean k(int n) {
        final boolean b = false;
        final boolean b2 = false;
        boolean b3 = false;
        if (n == 0) {
            if ((this.Q0 & 0x1) != 0x0) {
                b3 = true;
            }
            return b3;
        }
        if (n == this.getChildCount()) {
            boolean b4 = b;
            if ((this.Q0 & 0x4) != 0x0) {
                b4 = true;
            }
            return b4;
        }
        boolean b5 = b2;
        if ((this.Q0 & 0x2) != 0x0) {
            --n;
            while (true) {
                b5 = b2;
                if (n < 0) {
                    break;
                }
                if (this.getChildAt(n).getVisibility() != 8) {
                    b5 = true;
                    break;
                }
                --n;
            }
        }
        return b5;
    }
    
    public final void onDraw(final Canvas canvas) {
        if (this.N0 == null) {
            return;
        }
        final int g0 = this.G0;
        final int n = 0;
        int i = 0;
        if (g0 == 1) {
            int virtualChildCount;
            for (virtualChildCount = this.getVirtualChildCount(); i < virtualChildCount; ++i) {
                final View child = this.getChildAt(i);
                if (child != null && child.getVisibility() != 8 && this.k(i)) {
                    this.f(canvas, child.getTop() - ((a)child.getLayoutParams()).topMargin - this.P0);
                }
            }
            if (this.k(virtualChildCount)) {
                final View child2 = this.getChildAt(virtualChildCount - 1);
                int n2;
                if (child2 == null) {
                    n2 = ((View)this).getHeight() - ((View)this).getPaddingBottom() - this.P0;
                }
                else {
                    n2 = child2.getBottom() + ((a)child2.getLayoutParams()).bottomMargin;
                }
                this.f(canvas, n2);
            }
        }
        else {
            final int virtualChildCount2 = this.getVirtualChildCount();
            final boolean b = rcx.b((View)this);
            for (int j = n; j < virtualChildCount2; ++j) {
                final View child3 = this.getChildAt(j);
                if (child3 != null && child3.getVisibility() != 8 && this.k(j)) {
                    final a a = (a)child3.getLayoutParams();
                    int n3;
                    if (b) {
                        n3 = child3.getRight() + a.rightMargin;
                    }
                    else {
                        n3 = child3.getLeft() - a.leftMargin - this.O0;
                    }
                    this.g(canvas, n3);
                }
            }
            if (this.k(virtualChildCount2)) {
                final View child4 = this.getChildAt(virtualChildCount2 - 1);
                int paddingLeft = 0;
                Label_0387: {
                    int n4;
                    int n5;
                    if (child4 == null) {
                        if (b) {
                            paddingLeft = ((View)this).getPaddingLeft();
                            break Label_0387;
                        }
                        n4 = ((View)this).getWidth() - ((View)this).getPaddingRight();
                        n5 = this.O0;
                    }
                    else {
                        final a a2 = (a)child4.getLayoutParams();
                        if (!b) {
                            paddingLeft = child4.getRight() + a2.rightMargin;
                            break Label_0387;
                        }
                        n4 = child4.getLeft() - a2.leftMargin;
                        n5 = this.O0;
                    }
                    paddingLeft = n4 - n5;
                }
                this.g(canvas, paddingLeft);
            }
        }
    }
    
    public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ((AccessibilityRecord)accessibilityEvent).setClassName((CharSequence)"androidx.appcompat.widget.LinearLayoutCompat");
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"androidx.appcompat.widget.LinearLayoutCompat");
    }
    
    public void onLayout(final boolean b, int n, int i, int e, int j) {
        if (this.G0 == 1) {
            final int paddingLeft = ((View)this).getPaddingLeft();
            final int n2 = e - n;
            final int paddingRight = ((View)this).getPaddingRight();
            final int paddingRight2 = ((View)this).getPaddingRight();
            final int virtualChildCount = this.getVirtualChildCount();
            final int h0 = this.H0;
            n = (h0 & 0x70);
            if (n != 16) {
                if (n != 80) {
                    n = ((View)this).getPaddingTop();
                }
                else {
                    n = ((View)this).getPaddingTop() + j - i - this.I0;
                }
            }
            else {
                n = ((View)this).getPaddingTop() + (j - i - this.I0) / 2;
            }
            View child;
            int measuredWidth;
            int measuredHeight;
            a a;
            WeakHashMap a2;
            for (i = 0; i < virtualChildCount; i = j + 1, n = e) {
                child = this.getChildAt(i);
                if (child == null) {
                    e = n + 0;
                    j = i;
                }
                else {
                    e = n;
                    j = i;
                    if (child.getVisibility() != 8) {
                        measuredWidth = child.getMeasuredWidth();
                        measuredHeight = child.getMeasuredHeight();
                        a = (a)child.getLayoutParams();
                        j = a.gravity;
                        if ((e = j) < 0) {
                            e = (0x800007 & h0);
                        }
                        a2 = j6x.a;
                        e = (Gravity.getAbsoluteGravity(e, j6x$e.d((View)this)) & 0x7);
                        Label_0302: {
                            if (e != 1) {
                                if (e != 5) {
                                    e = a.leftMargin + paddingLeft;
                                    break Label_0302;
                                }
                                e = n2 - paddingRight - measuredWidth;
                                j = a.rightMargin;
                            }
                            else {
                                e = (n2 - paddingLeft - paddingRight2 - measuredWidth) / 2 + paddingLeft + a.leftMargin;
                                j = a.rightMargin;
                            }
                            e -= j;
                        }
                        j = n;
                        if (this.k(i)) {
                            j = n + this.P0;
                        }
                        j += a.topMargin;
                        n = j + 0;
                        child.layout(e, n, measuredWidth + e, measuredHeight + n);
                        e = udu.e(measuredHeight, a.bottomMargin, 0, j);
                        j = i + 0;
                    }
                }
            }
        }
        else {
            final boolean b2 = rcx.b((View)this);
            final int paddingTop = ((View)this).getPaddingTop();
            final int n3 = j - i;
            final int paddingBottom = ((View)this).getPaddingBottom();
            final int paddingBottom2 = ((View)this).getPaddingBottom();
            final int virtualChildCount2 = this.getVirtualChildCount();
            i = this.H0;
            final int n4 = i & 0x70;
            final boolean d0 = this.D0;
            final int[] l0 = this.L0;
            final int[] m0 = this.M0;
            final WeakHashMap a3 = j6x.a;
            i = Gravity.getAbsoluteGravity(0x800007 & i, j6x$e.d((View)this));
            if (i != 1) {
                if (i != 5) {
                    i = ((View)this).getPaddingLeft();
                }
                else {
                    i = ((View)this).getPaddingLeft() + e - n - this.I0;
                }
            }
            else {
                i = ((View)this).getPaddingLeft() + (e - n - this.I0) / 2;
            }
            int n5;
            if (b2) {
                n = virtualChildCount2 - 1;
                n5 = -1;
            }
            else {
                n = 0;
                n5 = 1;
            }
            j = 0;
            e = n4;
            final int n6 = n;
            while (j < virtualChildCount2) {
                final int n7 = n5 * j + n6;
                final View child2 = this.getChildAt(n7);
                Label_0875: {
                    if (child2 == null) {
                        n = i + 0;
                    }
                    else {
                        n = i;
                        if (child2.getVisibility() != 8) {
                            final int measuredWidth2 = child2.getMeasuredWidth();
                            final int measuredHeight2 = child2.getMeasuredHeight();
                            final a a4 = (a)child2.getLayoutParams();
                            int baseline;
                            if (d0 && a4.height != -1) {
                                baseline = child2.getBaseline();
                            }
                            else {
                                baseline = -1;
                            }
                            if ((n = a4.gravity) < 0) {
                                n = e;
                            }
                            n &= 0x70;
                            if (n != 16) {
                                if (n != 48) {
                                    if (n != 80) {
                                        n = paddingTop;
                                    }
                                    else {
                                        final int n8 = n = n3 - paddingBottom - measuredHeight2 - a4.bottomMargin;
                                        if (baseline != -1) {
                                            n = child2.getMeasuredHeight();
                                            n = n8 - (m0[2] - (n - baseline));
                                        }
                                    }
                                }
                                else {
                                    n = a4.topMargin + paddingTop;
                                    if (baseline != -1) {
                                        n += l0[1] - baseline;
                                    }
                                }
                            }
                            else {
                                n = (n3 - paddingTop - paddingBottom2 - measuredHeight2) / 2 + paddingTop + a4.topMargin - a4.bottomMargin;
                            }
                            int n9 = i;
                            if (this.k(n7)) {
                                n9 = i + this.O0;
                            }
                            i = n9 + a4.leftMargin;
                            final int n10 = i + 0;
                            child2.layout(n10, n, measuredWidth2 + n10, measuredHeight2 + n);
                            i = udu.e(measuredWidth2, a4.rightMargin, 0, i);
                            j += 0;
                            break Label_0875;
                        }
                    }
                    i = n;
                }
                ++j;
            }
        }
    }
    
    public void onMeasure(int i, int j) {
        if (this.G0 == 1) {
            this.I0 = 0;
            final int virtualChildCount = this.getVirtualChildCount();
            final int mode = View$MeasureSpec.getMode(i);
            final int mode2 = View$MeasureSpec.getMode(j);
            final int e0 = this.E0;
            final boolean k0 = this.K0;
            float n = 0.0f;
            int n2 = 0;
            int n3 = 1;
            boolean b = false;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            int l = 0;
            int n7 = 0;
            int n8 = 0;
            while (l < virtualChildCount) {
                final View child = this.getChildAt(l);
                int n16 = 0;
                Label_0633: {
                    if (child == null) {
                        this.I0 += 0;
                    }
                    else if (child.getVisibility() == 8) {
                        l += 0;
                    }
                    else {
                        if (this.k(l)) {
                            this.I0 += this.P0;
                        }
                        final a a = (a)child.getLayoutParams();
                        final float weight = a.weight;
                        n += weight;
                        int n9;
                        int max;
                        if (mode2 == 1073741824 && a.height == 0 && weight > 0.0f) {
                            final int i2 = this.I0;
                            this.I0 = Math.max(i2, a.topMargin + i2 + a.bottomMargin);
                            n9 = 1;
                            max = n5;
                        }
                        else {
                            int height;
                            if (a.height == 0 && weight > 0.0f) {
                                a.height = -2;
                                height = 0;
                            }
                            else {
                                height = Integer.MIN_VALUE;
                            }
                            int i3;
                            if (n == 0.0f) {
                                i3 = this.I0;
                            }
                            else {
                                i3 = 0;
                            }
                            this.measureChildWithMargins(child, i, 0, j, i3);
                            if (height != Integer.MIN_VALUE) {
                                a.height = height;
                            }
                            final int measuredHeight = child.getMeasuredHeight();
                            final int i4 = this.I0;
                            this.I0 = Math.max(i4, i4 + measuredHeight + a.topMargin + a.bottomMargin + 0);
                            max = n5;
                            n9 = n2;
                            if (k0) {
                                max = Math.max(measuredHeight, n5);
                                n9 = n2;
                            }
                        }
                        if (e0 >= 0 && e0 == l + 1) {
                            this.F0 = this.I0;
                        }
                        if (l < e0 && a.weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        boolean b2;
                        if (mode != 1073741824 && a.width == -1) {
                            b2 = true;
                            b = true;
                        }
                        else {
                            b2 = false;
                        }
                        int n10 = a.leftMargin + a.rightMargin;
                        final int n11 = child.getMeasuredWidth() + n10;
                        final int max2 = Math.max(n4, n11);
                        final int combineMeasuredStates = View.combineMeasuredStates(n6, child.getMeasuredState());
                        if (n3 != 0 && a.width == -1) {
                            n3 = 1;
                        }
                        else {
                            n3 = 0;
                        }
                        int max4;
                        int n12;
                        if (a.weight > 0.0f) {
                            if (!b2) {
                                n10 = n11;
                            }
                            final int max3 = Math.max(n8, n10);
                            max4 = n7;
                            n12 = max3;
                        }
                        else {
                            if (!b2) {
                                n10 = n11;
                            }
                            max4 = Math.max(n7, n10);
                            n12 = n8;
                        }
                        final int n13 = l + 0;
                        final int n14 = max2;
                        final int n15 = combineMeasuredStates;
                        n2 = n9;
                        n8 = n12;
                        n7 = max4;
                        n16 = n13;
                        n6 = n15;
                        n5 = max;
                        n4 = n14;
                        break Label_0633;
                    }
                    n16 = l;
                }
                l = n16 + 1;
            }
            if (this.I0 > 0 && this.k(virtualChildCount)) {
                this.I0 += this.P0;
            }
            if (k0 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
                this.I0 = 0;
                for (int n17 = 0; n17 < virtualChildCount; ++n17) {
                    final View child2 = this.getChildAt(n17);
                    if (child2 == null) {
                        this.I0 += 0;
                    }
                    else if (child2.getVisibility() == 8) {
                        n17 += 0;
                    }
                    else {
                        final a a2 = (a)child2.getLayoutParams();
                        final int i5 = this.I0;
                        this.I0 = Math.max(i5, i5 + n5 + a2.topMargin + a2.bottomMargin + 0);
                    }
                }
            }
            final int i6 = ((View)this).getPaddingBottom() + ((View)this).getPaddingTop() + this.I0;
            this.I0 = i6;
            final int resolveSizeAndState = View.resolveSizeAndState(Math.max(i6, ((View)this).getSuggestedMinimumHeight()), j, 0);
            final int n18 = (0xFFFFFF & resolveSizeAndState) - this.I0;
            int n20;
            int n21;
            if (n2 == 0 && (n18 == 0 || n <= 0.0f)) {
                final int max5 = Math.max(n7, n8);
                if (k0 && mode2 != 1073741824) {
                    for (int n19 = 0; n19 < virtualChildCount; ++n19) {
                        final View child3 = this.getChildAt(n19);
                        if (child3 != null) {
                            if (child3.getVisibility() != 8) {
                                if (((a)child3.getLayoutParams()).weight > 0.0f) {
                                    child3.measure(View$MeasureSpec.makeMeasureSpec(child3.getMeasuredWidth(), 1073741824), View$MeasureSpec.makeMeasureSpec(n5, 1073741824));
                                }
                            }
                        }
                    }
                }
                n20 = n4;
                n21 = max5;
            }
            else {
                final float j2 = this.J0;
                if (j2 > 0.0f) {
                    n = j2;
                }
                int n22 = 0;
                this.I0 = 0;
                final int n23 = n7;
                final int n24 = n6;
                int n25 = n3;
                n20 = n4;
                int max6 = n23;
                int n26 = n18;
                int combineMeasuredStates2 = n24;
                while (n22 < virtualChildCount) {
                    final View child4 = this.getChildAt(n22);
                    if (child4.getVisibility() != 8) {
                        final a a3 = (a)child4.getLayoutParams();
                        final float weight2 = a3.weight;
                        if (weight2 > 0.0f) {
                            final int n27 = (int)(n26 * weight2 / n);
                            n -= weight2;
                            final int n28 = n26 - n27;
                            final int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, ((View)this).getPaddingRight() + ((View)this).getPaddingLeft() + a3.leftMargin + a3.rightMargin, a3.width);
                            if (a3.height == 0 && mode2 == 1073741824) {
                                int n29;
                                if (n27 > 0) {
                                    n29 = n27;
                                }
                                else {
                                    n29 = 0;
                                }
                                child4.measure(childMeasureSpec, View$MeasureSpec.makeMeasureSpec(n29, 1073741824));
                            }
                            else {
                                int n30 = child4.getMeasuredHeight() + n27;
                                if (n30 < 0) {
                                    n30 = 0;
                                }
                                child4.measure(childMeasureSpec, View$MeasureSpec.makeMeasureSpec(n30, 1073741824));
                            }
                            combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates2, child4.getMeasuredState() & 0xFFFFFF00);
                            n26 = n28;
                        }
                        final int n31 = a3.leftMargin + a3.rightMargin;
                        final int n32 = child4.getMeasuredWidth() + n31;
                        final int max7 = Math.max(n20, n32);
                        int n33;
                        if (mode != 1073741824 && a3.width == -1) {
                            n33 = n31;
                        }
                        else {
                            n33 = n32;
                        }
                        max6 = Math.max(max6, n33);
                        if (n25 != 0 && a3.width == -1) {
                            n25 = 1;
                        }
                        else {
                            n25 = 0;
                        }
                        final int i7 = this.I0;
                        this.I0 = Math.max(i7, child4.getMeasuredHeight() + i7 + a3.topMargin + a3.bottomMargin + 0);
                        n20 = max7;
                    }
                    ++n22;
                }
                this.I0 += ((View)this).getPaddingBottom() + ((View)this).getPaddingTop();
                final int n34 = combineMeasuredStates2;
                final int n35 = max6;
                n3 = n25;
                n6 = n34;
                n21 = n35;
            }
            if (n3 != 0 || mode == 1073741824) {
                n21 = n20;
            }
            ((View)this).setMeasuredDimension(View.resolveSizeAndState(Math.max(((View)this).getPaddingRight() + ((View)this).getPaddingLeft() + n21, ((View)this).getSuggestedMinimumWidth()), i, n6), resolveSizeAndState);
            if (b) {
                final int measureSpec = View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredWidth(), 1073741824);
                View child5;
                a a4;
                int height2;
                for (i = 0; i < virtualChildCount; ++i) {
                    child5 = this.getChildAt(i);
                    if (child5.getVisibility() != 8) {
                        a4 = (a)child5.getLayoutParams();
                        if (a4.width == -1) {
                            height2 = a4.height;
                            a4.height = child5.getMeasuredHeight();
                            this.measureChildWithMargins(child5, measureSpec, 0, j, 0);
                            a4.height = height2;
                        }
                    }
                }
            }
        }
        else {
            this.I0 = 0;
            final int virtualChildCount2 = this.getVirtualChildCount();
            final int mode3 = View$MeasureSpec.getMode(i);
            final int mode4 = View$MeasureSpec.getMode(j);
            if (this.L0 == null || this.M0 == null) {
                this.L0 = new int[4];
                this.M0 = new int[4];
            }
            final int[] l2 = this.L0;
            final int[] m0 = this.M0;
            l2[2] = (l2[3] = -1);
            l2[0] = (l2[1] = -1);
            m0[2] = (m0[3] = -1);
            m0[0] = (m0[1] = -1);
            final boolean d0 = this.D0;
            final boolean k2 = this.K0;
            final boolean b3 = mode3 == 1073741824;
            float n36 = 0.0f;
            boolean b4 = false;
            int n37 = 1;
            boolean b5 = false;
            int max8 = 0;
            int n38 = 0;
            int max9 = 0;
            int n39 = 0;
            int n40 = 0;
            int combineMeasuredStates3 = 0;
            while (n38 < virtualChildCount2) {
                final View child6 = this.getChildAt(n38);
                int n48 = 0;
                Label_2457: {
                    if (child6 == null) {
                        this.I0 += 0;
                    }
                    else {
                        if (child6.getVisibility() != 8) {
                            if (this.k(n38)) {
                                this.I0 += this.O0;
                            }
                            final a a5 = (a)child6.getLayoutParams();
                            final float weight3 = a5.weight;
                            n36 += weight3;
                            if (mode3 == 1073741824 && a5.width == 0 && weight3 > 0.0f) {
                                if (b3) {
                                    this.I0 += a5.leftMargin + a5.rightMargin;
                                }
                                else {
                                    final int i8 = this.I0;
                                    this.I0 = Math.max(i8, a5.leftMargin + i8 + a5.rightMargin);
                                }
                                if (d0) {
                                    final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(0, 0);
                                    child6.measure(measureSpec2, measureSpec2);
                                }
                                else {
                                    b4 = true;
                                }
                            }
                            else {
                                int width;
                                if (a5.width == 0 && weight3 > 0.0f) {
                                    a5.width = -2;
                                    width = 0;
                                }
                                else {
                                    width = Integer.MIN_VALUE;
                                }
                                int i9;
                                if (n36 == 0.0f) {
                                    i9 = this.I0;
                                }
                                else {
                                    i9 = 0;
                                }
                                this.measureChildWithMargins(child6, i, i9, j, 0);
                                if (width != Integer.MIN_VALUE) {
                                    a5.width = width;
                                }
                                final int measuredWidth = child6.getMeasuredWidth();
                                if (b3) {
                                    this.I0 = udu.e(a5.leftMargin + measuredWidth, a5.rightMargin, 0, this.I0);
                                }
                                else {
                                    final int i10 = this.I0;
                                    this.I0 = Math.max(i10, i10 + measuredWidth + a5.leftMargin + a5.rightMargin + 0);
                                }
                                if (k2) {
                                    max8 = Math.max(measuredWidth, max8);
                                }
                            }
                            final int n41 = n38;
                            boolean b6;
                            if (mode4 != 1073741824 && a5.height == -1) {
                                b6 = true;
                                b5 = true;
                            }
                            else {
                                b6 = false;
                            }
                            int n42 = a5.topMargin + a5.bottomMargin;
                            final int n43 = child6.getMeasuredHeight() + n42;
                            combineMeasuredStates3 = View.combineMeasuredStates(combineMeasuredStates3, child6.getMeasuredState());
                            if (d0) {
                                final int baseline = child6.getBaseline();
                                if (baseline != -1) {
                                    int n44;
                                    if ((n44 = a5.gravity) < 0) {
                                        n44 = this.H0;
                                    }
                                    final int n45 = ((n44 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
                                    l2[n45] = Math.max(l2[n45], baseline);
                                    m0[n45] = Math.max(m0[n45], n43 - baseline);
                                }
                            }
                            n40 = Math.max(n40, n43);
                            int n46;
                            if (n37 != 0 && a5.height == -1) {
                                n46 = 1;
                            }
                            else {
                                n46 = 0;
                            }
                            int max10;
                            if (a5.weight > 0.0f) {
                                if (!b6) {
                                    n42 = n43;
                                }
                                max10 = Math.max(n39, n42);
                            }
                            else {
                                if (!b6) {
                                    n42 = n43;
                                }
                                max9 = Math.max(max9, n42);
                                max10 = n39;
                            }
                            final int n47 = n41 + 0;
                            n48 = n46;
                            n39 = max10;
                            n38 = n47;
                            break Label_2457;
                        }
                        n38 += 0;
                    }
                    n48 = n37;
                }
                ++n38;
                n37 = n48;
            }
            if (this.I0 > 0 && this.k(virtualChildCount2)) {
                this.I0 += this.O0;
            }
            if (l2[1] != -1 || l2[0] != -1 || l2[2] != -1 || l2[3] != -1) {
                n40 = Math.max(n40, Math.max(m0[3], Math.max(m0[0], Math.max(m0[1], m0[2]))) + Math.max(l2[3], Math.max(l2[0], Math.max(l2[1], l2[2]))));
            }
            if (k2 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                this.I0 = 0;
                for (int n49 = 0; n49 < virtualChildCount2; ++n49) {
                    final View child7 = this.getChildAt(n49);
                    if (child7 == null) {
                        this.I0 += 0;
                    }
                    else if (child7.getVisibility() == 8) {
                        n49 += 0;
                    }
                    else {
                        final a a6 = (a)child7.getLayoutParams();
                        if (b3) {
                            this.I0 = udu.e(a6.leftMargin + max8, a6.rightMargin, 0, this.I0);
                        }
                        else {
                            final int i11 = this.I0;
                            this.I0 = Math.max(i11, i11 + max8 + a6.leftMargin + a6.rightMargin + 0);
                        }
                    }
                }
            }
            final int n50 = mode3;
            final int i12 = ((View)this).getPaddingRight() + ((View)this).getPaddingLeft() + this.I0;
            this.I0 = i12;
            int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(i12, ((View)this).getSuggestedMinimumWidth()), i, 0);
            final int n51 = (0xFFFFFF & resolveSizeAndState2) - this.I0;
            int combineMeasuredStates4 = 0;
            int n54 = 0;
            int max12 = 0;
            int n55 = 0;
            Label_3734: {
                int n53;
                if (!b4 && (n51 == 0 || n36 <= 0.0f)) {
                    final int max11 = Math.max(max9, n39);
                    if (k2 && n50 != 1073741824) {
                        for (int n52 = 0; n52 < virtualChildCount2; ++n52) {
                            final View child8 = this.getChildAt(n52);
                            if (child8 != null) {
                                if (child8.getVisibility() != 8) {
                                    if (((a)child8.getLayoutParams()).weight > 0.0f) {
                                        child8.measure(View$MeasureSpec.makeMeasureSpec(max8, 1073741824), View$MeasureSpec.makeMeasureSpec(child8.getMeasuredHeight(), 1073741824));
                                    }
                                }
                            }
                        }
                    }
                    n53 = resolveSizeAndState2;
                    combineMeasuredStates4 = combineMeasuredStates3;
                    n54 = max11;
                    max12 = n40;
                    n55 = virtualChildCount2;
                }
                else {
                    final float j3 = this.J0;
                    if (j3 > 0.0f) {
                        n36 = j3;
                    }
                    l2[2] = (l2[3] = -1);
                    l2[0] = (l2[1] = -1);
                    m0[2] = (m0[3] = -1);
                    m0[0] = (m0[1] = -1);
                    this.I0 = 0;
                    max12 = -1;
                    int n56 = 0;
                    combineMeasuredStates4 = combineMeasuredStates3;
                    n55 = virtualChildCount2;
                    int n57 = n51;
                    final int n58 = n50;
                    while (n56 < n55) {
                        final View child9 = this.getChildAt(n56);
                        int n68;
                        int n69;
                        if (child9 != null && child9.getVisibility() != 8) {
                            final a a7 = (a)child9.getLayoutParams();
                            final float weight4 = a7.weight;
                            if (weight4 > 0.0f) {
                                final int n59 = (int)(n57 * weight4 / n36);
                                final int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(j, ((View)this).getPaddingBottom() + ((View)this).getPaddingTop() + a7.topMargin + a7.bottomMargin, a7.height);
                                if (a7.width == 0 && n58 == 1073741824) {
                                    int n60;
                                    if (n59 > 0) {
                                        n60 = n59;
                                    }
                                    else {
                                        n60 = 0;
                                    }
                                    child9.measure(View$MeasureSpec.makeMeasureSpec(n60, 1073741824), childMeasureSpec2);
                                }
                                else {
                                    int n61 = child9.getMeasuredWidth() + n59;
                                    if (n61 < 0) {
                                        n61 = 0;
                                    }
                                    child9.measure(View$MeasureSpec.makeMeasureSpec(n61, 1073741824), childMeasureSpec2);
                                }
                                combineMeasuredStates4 = View.combineMeasuredStates(combineMeasuredStates4, child9.getMeasuredState() & 0xFF000000);
                                n36 -= weight4;
                                n57 -= n59;
                            }
                            if (b3) {
                                this.I0 = udu.e(child9.getMeasuredWidth() + a7.leftMargin, a7.rightMargin, 0, this.I0);
                            }
                            else {
                                final int i13 = this.I0;
                                this.I0 = Math.max(i13, child9.getMeasuredWidth() + i13 + a7.leftMargin + a7.rightMargin + 0);
                            }
                            final boolean b7 = mode4 != 1073741824 && a7.height == -1;
                            final int n62 = a7.topMargin + a7.bottomMargin;
                            final int n63 = child9.getMeasuredHeight() + n62;
                            final int max13 = Math.max(max12, n63);
                            int n64;
                            if (b7) {
                                n64 = n62;
                            }
                            else {
                                n64 = n63;
                            }
                            final int max14 = Math.max(max9, n64);
                            int n65;
                            if (n37 != 0 && a7.height == -1) {
                                n65 = 1;
                            }
                            else {
                                n65 = 0;
                            }
                            if (d0) {
                                final int baseline2 = child9.getBaseline();
                                if (baseline2 != -1) {
                                    int n66;
                                    if ((n66 = a7.gravity) < 0) {
                                        n66 = this.H0;
                                    }
                                    final int n67 = ((n66 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
                                    l2[n67] = Math.max(l2[n67], baseline2);
                                    m0[n67] = Math.max(m0[n67], n63 - baseline2);
                                }
                            }
                            n37 = n65;
                            n68 = n57;
                            n69 = max14;
                            max12 = max13;
                        }
                        else {
                            final int n70 = n57;
                            n69 = max9;
                            n68 = n70;
                        }
                        ++n56;
                        final int n71 = n68;
                        max9 = n69;
                        n57 = n71;
                    }
                    this.I0 += ((View)this).getPaddingRight() + ((View)this).getPaddingLeft();
                    if (l2[1] != -1 || l2[0] != -1 || l2[2] != -1 || l2[3] != -1) {
                        max12 = Math.max(max12, Math.max(m0[3], Math.max(m0[0], Math.max(m0[1], m0[2]))) + Math.max(l2[3], Math.max(l2[0], Math.max(l2[1], l2[2]))));
                        n54 = max9;
                        break Label_3734;
                    }
                    n54 = max9;
                    n53 = resolveSizeAndState2;
                }
                resolveSizeAndState2 = n53;
            }
            if (n37 != 0 || mode4 == 1073741824) {
                n54 = max12;
            }
            ((View)this).setMeasuredDimension((0xFF000000 & combineMeasuredStates4) | resolveSizeAndState2, View.resolveSizeAndState(Math.max(((View)this).getPaddingBottom() + ((View)this).getPaddingTop() + n54, ((View)this).getSuggestedMinimumHeight()), j, combineMeasuredStates4 << 16));
            if (b5) {
                final int measureSpec3 = View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredHeight(), 1073741824);
                View child10;
                a a8;
                int width2;
                for (j = 0; j < n55; ++j) {
                    child10 = this.getChildAt(j);
                    if (child10.getVisibility() != 8) {
                        a8 = (a)child10.getLayoutParams();
                        if (a8.height == -1) {
                            width2 = a8.width;
                            a8.width = child10.getMeasuredWidth();
                            this.measureChildWithMargins(child10, i, 0, measureSpec3, 0);
                            a8.width = width2;
                        }
                    }
                }
            }
        }
    }
    
    public void setBaselineAligned(final boolean d0) {
        this.D0 = d0;
    }
    
    public void setBaselineAlignedChildIndex(final int e0) {
        if (e0 >= 0 && e0 < this.getChildCount()) {
            this.E0 = e0;
            return;
        }
        final StringBuilder j = fu8.j("base aligned child index out of range (0, ");
        j.append(this.getChildCount());
        j.append(")");
        throw new IllegalArgumentException(j.toString());
    }
    
    public void setDividerDrawable(final Drawable n0) {
        if (n0 == this.N0) {
            return;
        }
        this.N0 = n0;
        boolean willNotDraw = false;
        if (n0 != null) {
            this.O0 = n0.getIntrinsicWidth();
            this.P0 = n0.getIntrinsicHeight();
        }
        else {
            this.O0 = 0;
            this.P0 = 0;
        }
        if (n0 == null) {
            willNotDraw = true;
        }
        ((View)this).setWillNotDraw(willNotDraw);
        ((View)this).requestLayout();
    }
    
    public void setDividerPadding(final int r0) {
        this.R0 = r0;
    }
    
    public void setGravity(int h0) {
        if (this.H0 != h0) {
            int n = h0;
            if ((0x800007 & h0) == 0x0) {
                n = (h0 | 0x800003);
            }
            h0 = n;
            if ((n & 0x70) == 0x0) {
                h0 = (n | 0x30);
            }
            this.H0 = h0;
            ((View)this).requestLayout();
        }
    }
    
    public void setHorizontalGravity(int n) {
        n &= 0x800007;
        final int h0 = this.H0;
        if ((0x800007 & h0) != n) {
            this.H0 = (n | (0xFF7FFFF8 & h0));
            ((View)this).requestLayout();
        }
    }
    
    public void setMeasureWithLargestChildEnabled(final boolean k0) {
        this.K0 = k0;
    }
    
    public void setOrientation(final int g0) {
        if (this.G0 != g0) {
            this.G0 = g0;
            ((View)this).requestLayout();
        }
    }
    
    public void setShowDividers(final int q0) {
        if (q0 != this.Q0) {
            ((View)this).requestLayout();
        }
        this.Q0 = q0;
    }
    
    public void setVerticalGravity(int h0) {
        final int n = h0 & 0x70;
        h0 = this.H0;
        if ((h0 & 0x70) != n) {
            this.H0 = (n | (h0 & 0xFFFFFF8F));
            ((View)this).requestLayout();
        }
    }
    
    public void setWeightSum(final float n) {
        this.J0 = Math.max(0.0f, n);
    }
    
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public static class a extends LinearLayout$LayoutParams
    {
        public a(final int n, final int n2) {
            super(n, n2);
        }
        
        public a(final Context context, final AttributeSet set) {
            super(context, set);
        }
        
        public a(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
        }
    }
}
