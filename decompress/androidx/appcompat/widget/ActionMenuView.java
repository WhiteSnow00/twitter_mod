// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.widget.LinearLayout$LayoutParams;
import android.widget.ImageView;
import androidx.appcompat.view.menu.a;
import android.view.ViewDebug$ExportedProperty;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.accessibility.AccessibilityEvent;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.view.menu.i;
import android.view.MenuItem;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.ActionMenuItemView;
import android.view.View$MeasureSpec;
import android.view.View;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.e$a;
import androidx.appcompat.view.menu.i$a;
import android.content.Context;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.e$b;

public class ActionMenuView extends LinearLayoutCompat implements e$b, j
{
    public e R0;
    public Context S0;
    public int T0;
    public boolean U0;
    public ActionMenuPresenter V0;
    public i$a W0;
    public e$a X0;
    public boolean Y0;
    public int Z0;
    public int a1;
    public int b1;
    public ActionMenuView$e c1;
    
    public ActionMenuView(final Context s0, final AttributeSet set) {
        super(s0, set);
        this.setBaselineAligned(false);
        final float density = s0.getResources().getDisplayMetrics().density;
        this.a1 = (int)(56.0f * density);
        this.b1 = (int)(density * 4.0f);
        this.S0 = s0;
        this.T0 = 0;
    }
    
    public static int o(final View view, final int n, int b, int n2, int n3) {
        final c c = (c)view.getLayoutParams();
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n2) - n3, View$MeasureSpec.getMode(n2));
        ActionMenuItemView actionMenuItemView;
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView)view;
        }
        else {
            actionMenuItemView = null;
        }
        final boolean b2 = false;
        if (actionMenuItemView != null && actionMenuItemView.a()) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        n3 = 2;
        if (b > 0 && (n2 == 0 || b >= 2)) {
            view.measure(View$MeasureSpec.makeMeasureSpec(b * n, Integer.MIN_VALUE), measureSpec);
            final int measuredWidth = view.getMeasuredWidth();
            final int n4 = b = measuredWidth / n;
            if (measuredWidth % n != 0) {
                b = n4 + 1;
            }
            if (n2 != 0 && b < 2) {
                b = n3;
            }
        }
        else {
            b = 0;
        }
        boolean d = b2;
        if (!c.a) {
            d = b2;
            if (n2 != 0) {
                d = true;
            }
        }
        c.d = d;
        c.b = b;
        view.measure(View$MeasureSpec.makeMeasureSpec(n * b, 1073741824), measureSpec);
        return b;
    }
    
    public final void a(final e r0) {
        this.R0 = r0;
    }
    
    public final boolean c(final g g) {
        return this.R0.t((MenuItem)g, null, 0);
    }
    
    public final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof c;
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        return false;
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new c(((View)this).getContext(), set);
    }
    
    public Menu getMenu() {
        if (this.R0 == null) {
            final Context context = ((View)this).getContext();
            (this.R0 = new e(context)).y((e.e$a)new d());
            final ActionMenuPresenter v0 = new ActionMenuPresenter(context);
            this.V0 = v0;
            v0.N0 = true;
            v0.O0 = true;
            Object w0 = this.W0;
            if (w0 == null) {
                w0 = new b();
            }
            ((a)v0).G0 = (i$a)w0;
            this.R0.c((i)v0, this.S0);
            final ActionMenuPresenter v2 = this.V0;
            ((a)v2).J0 = (j)this;
            this.R0 = ((a)v2).E0;
        }
        return (Menu)this.R0;
    }
    
    public Drawable getOverflowIcon() {
        this.getMenu();
        final ActionMenuPresenter v0 = this.V0;
        final ActionMenuPresenter.d k0 = v0.K0;
        Drawable drawable;
        if (k0 != null) {
            drawable = ((ImageView)k0).getDrawable();
        }
        else if (v0.M0) {
            drawable = v0.L0;
        }
        else {
            drawable = null;
        }
        return drawable;
    }
    
    public int getPopupTheme() {
        return this.T0;
    }
    
    public int getWindowAnimations() {
        return 0;
    }
    
    public final LinearLayoutCompat$a i(final AttributeSet set) {
        return new c(((View)this).getContext(), set);
    }
    
    public final c l() {
        final c c = new c();
        ((LinearLayout$LayoutParams)c).gravity = 16;
        return c;
    }
    
    public final c m(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams != null) {
            c c;
            if (viewGroup$LayoutParams instanceof c) {
                c = new c((c)viewGroup$LayoutParams);
            }
            else {
                c = new c(viewGroup$LayoutParams);
            }
            if (((LinearLayout$LayoutParams)c).gravity <= 0) {
                ((LinearLayout$LayoutParams)c).gravity = 16;
            }
            return c;
        }
        return this.l();
    }
    
    public final boolean n(final int n) {
        final boolean b = false;
        if (n == 0) {
            return false;
        }
        final View child = ((ViewGroup)this).getChildAt(n - 1);
        final View child2 = ((ViewGroup)this).getChildAt(n);
        boolean b2 = b;
        if (n < ((ViewGroup)this).getChildCount()) {
            b2 = b;
            if (child instanceof ActionMenuView.ActionMenuView$a) {
                b2 = (false | ((ActionMenuView.ActionMenuView$a)child).b());
            }
        }
        boolean b3 = b2;
        if (n > 0) {
            b3 = b2;
            if (child2 instanceof ActionMenuView.ActionMenuView$a) {
                b3 = (b2 | ((ActionMenuView.ActionMenuView$a)child2).c());
            }
        }
        return b3;
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final ActionMenuPresenter v0 = this.V0;
        if (v0 != null) {
            v0.d();
            if (this.V0.l()) {
                this.V0.k();
                this.V0.m();
            }
        }
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final ActionMenuPresenter v0 = this.V0;
        if (v0 != null) {
            v0.i();
        }
    }
    
    public final void onLayout(final boolean b, int i, int n, int j, int n2) {
        if (!this.Y0) {
            super.onLayout(b, i, n, j, n2);
            return;
        }
        final int childCount = ((ViewGroup)this).getChildCount();
        final int n3 = (n2 - n) / 2;
        final int dividerWidth = this.getDividerWidth();
        final int n4 = j - i;
        i = n4 - ((View)this).getPaddingRight() - ((View)this).getPaddingLeft();
        final boolean b2 = vbx.b((View)this);
        j = 0;
        n2 = 0;
        n = 0;
        while (j < childCount) {
            final View child = ((ViewGroup)this).getChildAt(j);
            if (child.getVisibility() != 8) {
                final c c = (c)child.getLayoutParams();
                if (c.a) {
                    final int n5 = n2 = child.getMeasuredWidth();
                    if (this.n(j)) {
                        n2 = n5 + dividerWidth;
                    }
                    final int measuredHeight = child.getMeasuredHeight();
                    int n6;
                    int n7;
                    if (b2) {
                        n6 = ((View)this).getPaddingLeft() + ((LinearLayout$LayoutParams)c).leftMargin;
                        n7 = n6 + n2;
                    }
                    else {
                        n7 = ((View)this).getWidth() - ((View)this).getPaddingRight() - ((LinearLayout$LayoutParams)c).rightMargin;
                        n6 = n7 - n2;
                    }
                    final int n8 = n3 - measuredHeight / 2;
                    child.layout(n6, n8, n7, measuredHeight + n8);
                    i -= n2;
                    n2 = 1;
                }
                else {
                    i -= child.getMeasuredWidth() + ((LinearLayout$LayoutParams)c).leftMargin + ((LinearLayout$LayoutParams)c).rightMargin;
                    this.n(j);
                    ++n;
                }
            }
            ++j;
        }
        if (childCount == 1 && n2 == 0) {
            final View child2 = ((ViewGroup)this).getChildAt(0);
            n = child2.getMeasuredWidth();
            i = child2.getMeasuredHeight();
            j = n4 / 2 - n / 2;
            n2 = n3 - i / 2;
            child2.layout(j, n2, n + j, i + n2);
            return;
        }
        n -= (n2 ^ 0x1);
        if (n > 0) {
            i /= n;
        }
        else {
            i = 0;
        }
        n2 = Math.max(0, i);
        if (b2) {
            n = ((View)this).getWidth() - ((View)this).getPaddingRight();
            View child3;
            c c2;
            int n9;
            int measuredWidth;
            for (i = 0; i < childCount; ++i, n = j) {
                child3 = ((ViewGroup)this).getChildAt(i);
                c2 = (c)child3.getLayoutParams();
                j = n;
                if (child3.getVisibility() != 8) {
                    if (c2.a) {
                        j = n;
                    }
                    else {
                        n9 = n - ((LinearLayout$LayoutParams)c2).rightMargin;
                        measuredWidth = child3.getMeasuredWidth();
                        n = child3.getMeasuredHeight();
                        j = n3 - n / 2;
                        child3.layout(n9 - measuredWidth, j, n9, n + j);
                        j = n9 - (measuredWidth + ((LinearLayout$LayoutParams)c2).leftMargin + n2);
                    }
                }
            }
        }
        else {
            n = ((View)this).getPaddingLeft();
            View child4;
            c c3;
            int n10;
            int measuredWidth2;
            for (i = 0; i < childCount; ++i, n = j) {
                child4 = ((ViewGroup)this).getChildAt(i);
                c3 = (c)child4.getLayoutParams();
                j = n;
                if (child4.getVisibility() != 8) {
                    if (c3.a) {
                        j = n;
                    }
                    else {
                        n10 = n + ((LinearLayout$LayoutParams)c3).leftMargin;
                        measuredWidth2 = child4.getMeasuredWidth();
                        n = child4.getMeasuredHeight();
                        j = n3 - n / 2;
                        child4.layout(n10, j, n10 + measuredWidth2, n + j);
                        j = yk.c(measuredWidth2, ((LinearLayout$LayoutParams)c3).rightMargin, n2, n10);
                    }
                }
            }
        }
    }
    
    public final void onMeasure(int i, int a1) {
        final boolean y0 = this.Y0;
        int y2;
        if (View$MeasureSpec.getMode(i) == 1073741824) {
            y2 = 1;
        }
        else {
            y2 = 0;
        }
        this.Y0 = (y2 != 0);
        if ((y0 ? 1 : 0) != y2) {
            this.Z0 = 0;
        }
        final int size = View$MeasureSpec.getSize(i);
        if (this.Y0) {
            final e r0 = this.R0;
            if (r0 != null && size != this.Z0) {
                this.Z0 = size;
                r0.r(true);
            }
        }
        final int childCount = ((ViewGroup)this).getChildCount();
        if (this.Y0 && childCount > 0) {
            final int mode = View$MeasureSpec.getMode(a1);
            final int size2 = View$MeasureSpec.getSize(i);
            final int size3 = View$MeasureSpec.getSize(a1);
            final int paddingLeft = ((View)this).getPaddingLeft();
            i = ((View)this).getPaddingRight();
            final int n = ((View)this).getPaddingBottom() + ((View)this).getPaddingTop();
            final int childMeasureSpec = ViewGroup.getChildMeasureSpec(a1, n, -2);
            final int n2 = size2 - (i + paddingLeft);
            a1 = this.a1;
            i = n2 / a1;
            if (i == 0) {
                ((View)this).setMeasuredDimension(n2, 0);
            }
            else {
                final int n3 = n2 % a1 / i + a1;
                final int childCount2 = ((ViewGroup)this).getChildCount();
                int n4 = 0;
                int max = 0;
                int max2 = 0;
                a1 = 0;
                int j = 0;
                boolean b = false;
                long n5 = 0L;
                while (j < childCount2) {
                    final View child = ((ViewGroup)this).getChildAt(j);
                    if (child.getVisibility() != 8) {
                        final boolean b2 = child instanceof ActionMenuItemView;
                        ++n4;
                        if (b2) {
                            final int b3 = this.b1;
                            child.setPadding(b3, 0, b3, 0);
                        }
                        final c c = (c)child.getLayoutParams();
                        c.f = false;
                        c.c = 0;
                        c.b = 0;
                        c.d = false;
                        ((LinearLayout$LayoutParams)c).leftMargin = 0;
                        ((LinearLayout$LayoutParams)c).rightMargin = 0;
                        c.e = (b2 && ((ActionMenuItemView)child).a());
                        int n6;
                        if (c.a) {
                            n6 = 1;
                        }
                        else {
                            n6 = i;
                        }
                        final int o = o(child, n3, n6, childMeasureSpec, n);
                        max2 = Math.max(max2, o);
                        int n7 = a1;
                        if (c.d) {
                            n7 = a1 + 1;
                        }
                        if (c.a) {
                            b = true;
                        }
                        i -= o;
                        max = Math.max(max, child.getMeasuredHeight());
                        long n8 = n5;
                        if (o == 1) {
                            n8 = (n5 | (long)(1 << j));
                        }
                        n5 = n8;
                        a1 = n7;
                    }
                    ++j;
                }
                final boolean b4 = b && n4 == 2;
                final int n9 = 0;
                final int n10 = a1;
                int n11 = i;
                i = n9;
                a1 = max;
                while (n10 > 0 && n11 > 0) {
                    int n12 = Integer.MAX_VALUE;
                    int k = 0;
                    int n13 = 0;
                    long n14 = 0L;
                    while (k < childCount2) {
                        final c c2 = (c)((ViewGroup)this).getChildAt(k).getLayoutParams();
                        int n15;
                        int n16;
                        long n17;
                        if (!c2.d) {
                            n15 = n12;
                            n16 = n13;
                            n17 = n14;
                        }
                        else {
                            final int b5 = c2.b;
                            if (b5 < n12) {
                                n17 = 1L << k;
                                n15 = b5;
                                n16 = 1;
                            }
                            else {
                                n15 = n12;
                                n16 = n13;
                                n17 = n14;
                                if (b5 == n12) {
                                    n16 = n13 + 1;
                                    n17 = (n14 | 1L << k);
                                    n15 = n12;
                                }
                            }
                        }
                        ++k;
                        n12 = n15;
                        n13 = n16;
                        n14 = n17;
                    }
                    n5 |= n14;
                    if (n13 > n11) {
                        break;
                    }
                    View child2;
                    c c3;
                    long n18;
                    long n19;
                    int b6;
                    for (i = 0; i < childCount2; ++i) {
                        child2 = ((ViewGroup)this).getChildAt(i);
                        c3 = (c)child2.getLayoutParams();
                        n18 = 1 << i;
                        if ((n14 & n18) == 0x0L) {
                            n19 = n5;
                            if (c3.b == n12 + 1) {
                                n19 = (n5 | n18);
                            }
                            n5 = n19;
                        }
                        else {
                            if (b4 && c3.e && n11 == 1) {
                                b6 = this.b1;
                                child2.setPadding(b6 + n3, 0, b6, 0);
                            }
                            ++c3.b;
                            c3.f = true;
                            --n11;
                        }
                    }
                    i = 1;
                }
                final boolean b7 = !b && n4 == 1;
                int n20 = i;
                Label_1215: {
                    if (n11 > 0) {
                        n20 = i;
                        if (n5 != 0L) {
                            if (n11 >= n4 - 1 && !b7) {
                                n20 = i;
                                if (max2 <= 1) {
                                    break Label_1215;
                                }
                            }
                            float n22;
                            final float n21 = n22 = (float)Long.bitCount(n5);
                            if (!b7) {
                                float n23 = n21;
                                if ((n5 & 0x1L) != 0x0L) {
                                    n23 = n21;
                                    if (!((c)((ViewGroup)this).getChildAt(0).getLayoutParams()).e) {
                                        n23 = n21 - 0.5f;
                                    }
                                }
                                final int n24 = childCount2 - 1;
                                n22 = n23;
                                if ((n5 & (long)(1 << n24)) != 0x0L) {
                                    n22 = n23;
                                    if (!((c)((ViewGroup)this).getChildAt(n24).getLayoutParams()).e) {
                                        n22 = n23 - 0.5f;
                                    }
                                }
                            }
                            int n25;
                            if (n22 > 0.0f) {
                                n25 = (int)(n11 * n3 / n22);
                            }
                            else {
                                n25 = 0;
                            }
                            int n26 = 0;
                            while (true) {
                                n20 = i;
                                if (n26 >= childCount2) {
                                    break;
                                }
                                int n27 = 0;
                                Label_1206: {
                                    if ((n5 & (long)(1 << n26)) == 0x0L) {
                                        n27 = i;
                                    }
                                    else {
                                        final View child3 = ((ViewGroup)this).getChildAt(n26);
                                        final c c4 = (c)child3.getLayoutParams();
                                        if (child3 instanceof ActionMenuItemView) {
                                            c4.c = n25;
                                            c4.f = true;
                                            if (n26 == 0 && !c4.e) {
                                                ((LinearLayout$LayoutParams)c4).leftMargin = -n25 / 2;
                                            }
                                        }
                                        else if (c4.a) {
                                            c4.c = n25;
                                            c4.f = true;
                                            ((LinearLayout$LayoutParams)c4).rightMargin = -n25 / 2;
                                        }
                                        else {
                                            if (n26 != 0) {
                                                ((LinearLayout$LayoutParams)c4).leftMargin = n25 / 2;
                                            }
                                            n27 = i;
                                            if (n26 != childCount2 - 1) {
                                                ((LinearLayout$LayoutParams)c4).rightMargin = n25 / 2;
                                                n27 = i;
                                            }
                                            break Label_1206;
                                        }
                                        n27 = 1;
                                    }
                                }
                                ++n26;
                                i = n27;
                            }
                        }
                    }
                }
                if (n20 != 0) {
                    View child4;
                    c c5;
                    for (i = 0; i < childCount2; ++i) {
                        child4 = ((ViewGroup)this).getChildAt(i);
                        c5 = (c)child4.getLayoutParams();
                        if (c5.f) {
                            child4.measure(View$MeasureSpec.makeMeasureSpec(c5.b * n3 + c5.c, 1073741824), childMeasureSpec);
                        }
                    }
                }
                if (mode != 1073741824) {
                    i = a1;
                }
                else {
                    i = size3;
                }
                ((View)this).setMeasuredDimension(n2, i);
            }
        }
        else {
            for (int l = 0; l < childCount; ++l) {
                final c c6 = (c)((ViewGroup)this).getChildAt(l).getLayoutParams();
                ((LinearLayout$LayoutParams)c6).rightMargin = 0;
                ((LinearLayout$LayoutParams)c6).leftMargin = 0;
            }
            super.onMeasure(i, a1);
        }
    }
    
    public void setExpandedActionViewsExclusive(final boolean s0) {
        this.V0.S0 = s0;
    }
    
    public void setOnMenuItemClickListener(final ActionMenuView$e c1) {
        this.c1 = c1;
    }
    
    public void setOverflowIcon(final Drawable drawable) {
        this.getMenu();
        final ActionMenuPresenter v0 = this.V0;
        final ActionMenuPresenter.d k0 = v0.K0;
        if (k0 != null) {
            k0.setImageDrawable(drawable);
        }
        else {
            v0.M0 = true;
            v0.L0 = drawable;
        }
    }
    
    public void setOverflowReserved(final boolean u0) {
        this.U0 = u0;
    }
    
    public void setPopupTheme(final int t0) {
        if (this.T0 != t0) {
            if ((this.T0 = t0) == 0) {
                this.S0 = ((View)this).getContext();
            }
            else {
                this.S0 = (Context)new ContextThemeWrapper(((View)this).getContext(), t0);
            }
        }
    }
    
    public void setPresenter(final ActionMenuPresenter v0) {
        this.V0 = v0;
        ((a)v0).J0 = (j)this;
        this.R0 = ((a)v0).E0;
    }
    
    public static final class b implements i$a
    {
        public final void a(final e e, final boolean b) {
        }
        
        public final boolean b(final e e) {
            return false;
        }
    }
    
    public static final class c extends LinearLayoutCompat$a
    {
        @ViewDebug$ExportedProperty
        public boolean a;
        @ViewDebug$ExportedProperty
        public int b;
        @ViewDebug$ExportedProperty
        public int c;
        @ViewDebug$ExportedProperty
        public boolean d;
        @ViewDebug$ExportedProperty
        public boolean e;
        public boolean f;
        
        public c() {
            super(-2, -2);
            this.a = false;
        }
        
        public c(final Context context, final AttributeSet set) {
            super(context, set);
        }
        
        public c(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
        }
        
        public c(final c c) {
            super((ViewGroup$LayoutParams)c);
            this.a = c.a;
        }
    }
    
    public final class d implements e$a
    {
        public final boolean a(final e e, final MenuItem menuItem) {
            final ActionMenuView$e c1 = ActionMenuView.this.c1;
            boolean b = false;
            if (c1 != null) {
                final ActionMenuView$e actionMenuView$e = (ActionMenuView$e)c1;
                boolean b2;
                if (actionMenuView$e.a.i1.b(menuItem)) {
                    b2 = true;
                }
                else {
                    final Toolbar.Toolbar$f k1 = actionMenuView$e.a.k1;
                    b2 = (k1 != null && k1.onMenuItemClick(menuItem));
                }
                b = b;
                if (b2) {
                    b = true;
                }
            }
            return b;
        }
        
        public final void b(final e e) {
            final e$a x0 = ActionMenuView.this.X0;
            if (x0 != null) {
                x0.b(e);
            }
        }
    }
}
