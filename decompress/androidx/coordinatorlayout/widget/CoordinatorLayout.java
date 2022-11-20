// 
// Decompiled by Procyon v0.6.0
// 

package androidx.coordinatorlayout.widget;

import java.util.HashMap;
import android.text.TextUtils;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.util.HashSet;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable$Callback;
import android.util.Log;
import android.os.SystemClock;
import android.util.SparseArray;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.graphics.RectF;
import android.view.ViewParent;
import android.graphics.Matrix;
import java.util.Collections;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.Collection;
import java.util.Objects;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import java.util.WeakHashMap;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup$OnHierarchyChangeListener;
import android.graphics.drawable.Drawable;
import java.util.List;
import android.graphics.Rect;
import android.view.View;
import java.util.Comparator;
import java.lang.reflect.Constructor;
import java.util.Map;
import android.view.ViewGroup;

public class CoordinatorLayout extends ViewGroup implements cci, dci
{
    public static final String W0;
    public static final Class<?>[] X0;
    public static final ThreadLocal<Map<String, Constructor<c>>> Y0;
    public static final Comparator<View> Z0;
    public static final crk<Rect> a1;
    public final List<View> D0;
    public final bb7 E0;
    public final List<View> F0;
    public final List<View> G0;
    public final int[] H0;
    public final int[] I0;
    public boolean J0;
    public boolean K0;
    public int[] L0;
    public View M0;
    public View N0;
    public g O0;
    public boolean P0;
    public opx Q0;
    public boolean R0;
    public Drawable S0;
    public ViewGroup$OnHierarchyChangeListener T0;
    public CoordinatorLayout$a U0;
    public final ckc V0;
    
    static {
        final Package package1 = CoordinatorLayout.class.getPackage();
        String name;
        if (package1 != null) {
            name = package1.getName();
        }
        else {
            name = null;
        }
        W0 = name;
        CoordinatorLayout.Z0 = new h();
        X0 = new Class[] { Context.class, AttributeSet.class };
        Y0 = new ThreadLocal<Map<String, Constructor<c>>>();
        CoordinatorLayout.a1 = new grk(12);
    }
    
    public CoordinatorLayout(final Context context, final AttributeSet set) {
        this(context, set, 2130969035);
    }
    
    public CoordinatorLayout(final Context context, final AttributeSet set, int i) {
        super(context, set, i);
        this.D0 = new ArrayList();
        final int n = 0;
        this.E0 = new bb7(0);
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new int[2];
        this.I0 = new int[2];
        this.V0 = new ckc();
        TypedArray typedArray;
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(set, nza.I0, 0, 2132019443);
        }
        else {
            typedArray = context.obtainStyledAttributes(set, nza.I0, i, 0);
        }
        if (Build$VERSION.SDK_INT >= 29) {
            if (i == 0) {
                this.saveAttributeDataForStyleable(context, nza.I0, set, typedArray, 0, 2132019443);
            }
            else {
                this.saveAttributeDataForStyleable(context, nza.I0, set, typedArray, i, 0);
            }
        }
        i = typedArray.getResourceId(0, 0);
        if (i != 0) {
            final Resources resources = context.getResources();
            this.L0 = resources.getIntArray(i);
            final float density = resources.getDisplayMetrics().density;
            int length;
            int[] l0;
            for (length = this.L0.length, i = n; i < length; ++i) {
                l0 = this.L0;
                l0[i] *= (int)density;
            }
        }
        this.S0 = typedArray.getDrawable(1);
        typedArray.recycle();
        this.B();
        super.setOnHierarchyChangeListener((ViewGroup$OnHierarchyChangeListener)new e());
        final WeakHashMap a = j6x.a;
        if (j6x$d.c((View)this) == 0) {
            j6x$d.s((View)this, 1);
        }
    }
    
    public static Rect c() {
        Rect rect;
        if ((rect = CoordinatorLayout.a1.a()) == null) {
            rect = new Rect();
        }
        return rect;
    }
    
    public final void A(final View view, final int j) {
        final f f = (f)view.getLayoutParams();
        final int i = f.j;
        if (i != j) {
            j6x.s(view, j - i);
            f.j = j;
        }
    }
    
    public final void B() {
        final WeakHashMap a = j6x.a;
        if (j6x$d.b((View)this)) {
            if (this.U0 == null) {
                this.U0 = new CoordinatorLayout$a(this);
            }
            j6x$i.u((View)this, (ugj)this.U0);
            ((View)this).setSystemUiVisibility(1280);
        }
        else {
            j6x$i.u((View)this, (ugj)null);
        }
    }
    
    public final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof f && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public final void d(final f f, final Rect rect, final int n, final int n2) {
        final int width = ((View)this).getWidth();
        final int height = ((View)this).getHeight();
        final int max = Math.max(((View)this).getPaddingLeft() + f.leftMargin, Math.min(rect.left, width - ((View)this).getPaddingRight() - n - f.rightMargin));
        final int max2 = Math.max(((View)this).getPaddingTop() + f.topMargin, Math.min(rect.top, height - ((View)this).getPaddingBottom() - n2 - f.bottomMargin));
        rect.set(max, max2, n + max, n2 + max2);
    }
    
    public final boolean drawChild(final Canvas canvas, final View view, final long n) {
        final c a = ((f)view.getLayoutParams()).a;
        if (a != null) {
            Objects.requireNonNull(a);
        }
        return super.drawChild(canvas, view, n);
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = ((View)this).getDrawableState();
        final Drawable s0 = this.S0;
        int n = 0;
        if (s0 != null) {
            n = n;
            if (s0.isStateful()) {
                n = ((false | s0.setState(drawableState)) ? 1 : 0);
            }
        }
        if (n != 0) {
            ((View)this).invalidate();
        }
    }
    
    public final void e(final View view) {
        final List list = ((d8q)this.E0.c).getOrDefault(view, null);
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); ++i) {
                final View view2 = (View)list.get(i);
                final c a = ((f)view2.getLayoutParams()).a;
                if (a != null) {
                    a.e(this, view2, view);
                }
            }
        }
    }
    
    public final void f(final View view, final boolean b, final Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (b) {
                this.l(view, rect);
            }
            else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            return;
        }
        rect.setEmpty();
    }
    
    public final List<View> g(final View view) {
        final bb7 e0 = this.E0;
        final int f0 = ((d8q)e0.c).F0;
        Collection<Object> collection = null;
        Collection<Object> collection2;
        for (int i = 0; i < f0; ++i, collection = collection2) {
            final ArrayList list = ((d8q)e0.c).m(i);
            collection2 = collection;
            if (list != null) {
                collection2 = collection;
                if (list.contains(view)) {
                    if ((collection2 = collection) == null) {
                        collection2 = new ArrayList<Object>();
                    }
                    ((ArrayList<Object>)collection2).add(((d8q)e0.c).i(i));
                }
            }
        }
        this.G0.clear();
        if (collection != null) {
            this.G0.addAll(collection);
        }
        return this.G0;
    }
    
    public final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new f();
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new f(((View)this).getContext(), set);
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        f f;
        if (viewGroup$LayoutParams instanceof f) {
            f = new f((f)viewGroup$LayoutParams);
        }
        else if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            f = new f((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        else {
            f = new f(viewGroup$LayoutParams);
        }
        return (ViewGroup$LayoutParams)f;
    }
    
    public final List<View> getDependencySortedChildren() {
        this.x();
        return Collections.unmodifiableList((List<? extends View>)this.D0);
    }
    
    public final opx getLastWindowInsets() {
        return this.Q0;
    }
    
    public int getNestedScrollAxes() {
        final ckc v0 = this.V0;
        return v0.b | v0.a;
    }
    
    public Drawable getStatusBarBackground() {
        return this.S0;
    }
    
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), ((View)this).getPaddingBottom() + ((View)this).getPaddingTop());
    }
    
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), ((View)this).getPaddingRight() + ((View)this).getPaddingLeft());
    }
    
    public final List<View> h(final View view) {
        final List list = ((d8q)this.E0.c).getOrDefault(view, null);
        this.G0.clear();
        if (list != null) {
            this.G0.addAll(list);
        }
        return this.G0;
    }
    
    public final void i(final View view, final View n0, int i, int childCount) {
        this.V0.a(i, childCount);
        this.N0 = n0;
        for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            Objects.requireNonNull((f)this.getChildAt(i).getLayoutParams());
        }
    }
    
    public void j(final View view, final int n) {
        this.V0.b(n);
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final f f = (f)child.getLayoutParams();
            if (f.a(n)) {
                final c a = f.a;
                if (a != null) {
                    a.r(this, child, view, n);
                }
                f.c(n, false);
                f.p = false;
            }
        }
        this.N0 = null;
    }
    
    public void k(final View view, final int n, final int n2, final int[] array, final int n3) {
        final int childCount = this.getChildCount();
        boolean b = false;
        int i = 0;
        int n4 = 0;
        int n5 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            int n6;
            int n7;
            if (child.getVisibility() == 8) {
                n6 = n4;
                n7 = n5;
            }
            else {
                final f f = (f)child.getLayoutParams();
                if (!f.a(n3)) {
                    n6 = n4;
                    n7 = n5;
                }
                else {
                    final c a = f.a;
                    n6 = n4;
                    n7 = n5;
                    if (a != null) {
                        final int[] h0 = this.H0;
                        h0[1] = (h0[0] = 0);
                        a.l(this, child, view, n, n2, h0, n3);
                        final int[] h2 = this.H0;
                        int n8;
                        if (n > 0) {
                            n8 = Math.max(n4, h2[0]);
                        }
                        else {
                            n8 = Math.min(n4, h2[0]);
                        }
                        final int n9 = n8;
                        final int[] h3 = this.H0;
                        if (n2 > 0) {
                            n7 = Math.max(n5, h3[1]);
                        }
                        else {
                            n7 = Math.min(n5, h3[1]);
                        }
                        b = true;
                        n6 = n9;
                    }
                }
            }
            ++i;
            n4 = n6;
            n5 = n7;
        }
        array[0] = n4;
        array[1] = n5;
        if (b) {
            this.t(1);
        }
    }
    
    public final void l(final View view, final Rect rect) {
        final ThreadLocal<Matrix> a = u7x.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        final ThreadLocal<Matrix> a2 = u7x.a;
        Matrix matrix = a2.get();
        if (matrix == null) {
            matrix = new Matrix();
            a2.set(matrix);
        }
        else {
            matrix.reset();
        }
        u7x.a((ViewParent)this, view, matrix);
        final ThreadLocal<RectF> b = u7x.b;
        RectF rectF;
        if ((rectF = b.get()) == null) {
            rectF = new RectF();
            b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int)(rectF.left + 0.5f), (int)(rectF.top + 0.5f), (int)(rectF.right + 0.5f), (int)(rectF.bottom + 0.5f));
    }
    
    public void m(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        final int childCount = this.getChildCount();
        boolean b = false;
        int i = 0;
        int n6 = 0;
        int n7 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            int n8;
            int n9;
            if (child.getVisibility() == 8) {
                n8 = n6;
                n9 = n7;
            }
            else {
                final f f = (f)child.getLayoutParams();
                if (!f.a(n5)) {
                    n8 = n6;
                    n9 = n7;
                }
                else {
                    final c a = f.a;
                    n8 = n6;
                    n9 = n7;
                    if (a != null) {
                        final int[] h0 = this.H0;
                        h0[1] = (h0[0] = 0);
                        a.m(this, child, view, n, n2, n3, n4, n5, h0);
                        final int[] h2 = this.H0;
                        int n10;
                        if (n3 > 0) {
                            n10 = Math.max(n6, h2[0]);
                        }
                        else {
                            n10 = Math.min(n6, h2[0]);
                        }
                        final int n11 = n10;
                        if (n4 > 0) {
                            n9 = Math.max(n7, this.H0[1]);
                        }
                        else {
                            n9 = Math.min(n7, this.H0[1]);
                        }
                        b = true;
                        n8 = n11;
                    }
                }
            }
            ++i;
            n6 = n8;
            n7 = n9;
        }
        array[0] += n6;
        array[1] += n7;
        if (b) {
            this.t(1);
        }
    }
    
    public void n(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        this.m(view, n, n2, n3, n4, 0, this.I0);
    }
    
    public boolean o(final View view, final View view2, final int n, final int n2) {
        final int childCount = this.getChildCount();
        int i = 0;
        boolean b = false;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final f f = (f)child.getLayoutParams();
                final c a = f.a;
                if (a != null) {
                    final boolean q = a.q(this, child, view, n, n2);
                    b |= q;
                    f.c(n2, q);
                }
                else {
                    f.c(n2, false);
                }
            }
            ++i;
        }
        return b;
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y(false);
        if (this.P0) {
            if (this.O0 == null) {
                this.O0 = new g();
            }
            ((View)this).getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.O0);
        }
        if (this.Q0 == null) {
            final WeakHashMap a = j6x.a;
            if (j6x$d.b((View)this)) {
                j6x$h.c((View)this);
            }
        }
        this.K0 = true;
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y(false);
        if (this.P0 && this.O0 != null) {
            ((View)this).getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.O0);
        }
        final View n0 = this.N0;
        if (n0 != null) {
            this.onStopNestedScroll(n0);
        }
        this.K0 = false;
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.R0 && this.S0 != null) {
            final opx q0 = this.Q0;
            int i;
            if (q0 != null) {
                i = q0.i();
            }
            else {
                i = 0;
            }
            if (i > 0) {
                this.S0.setBounds(0, 0, ((View)this).getWidth(), i);
                this.S0.draw(canvas);
            }
        }
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.y(true);
        }
        final boolean w = this.w(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.y(true);
        }
        return w;
    }
    
    public final void onLayout(final boolean b, int i, int size, int d, final int n) {
        final WeakHashMap a = j6x.a;
        d = j6x$e.d((View)this);
        View view;
        c a2;
        for (size = this.D0.size(), i = 0; i < size; ++i) {
            view = this.D0.get(i);
            if (view.getVisibility() != 8) {
                a2 = ((f)view.getLayoutParams()).a;
                if (a2 == null || !a2.i(this, view, d)) {
                    this.u(view, d);
                }
            }
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        this.x();
        final int childCount = this.getChildCount();
        int i = 0;
    Label_0122:
        while (true) {
            while (i < childCount) {
                final View child = this.getChildAt(i);
                final bb7 e0 = this.E0;
                final int f0 = ((d8q)e0.c).F0;
                int j = 0;
                boolean b2;
                while (true) {
                    while (j < f0) {
                        final ArrayList list = ((d8q)e0.c).m(j);
                        if (list != null && list.contains(child)) {
                            final boolean b = true;
                            if (b) {
                                b2 = true;
                                break Label_0122;
                            }
                            ++i;
                            continue Label_0122;
                        }
                        else {
                            ++j;
                        }
                    }
                    final boolean b = false;
                    continue;
                }
                if (b2 != this.P0) {
                    if (b2) {
                        if (this.K0) {
                            if (this.O0 == null) {
                                this.O0 = new g();
                            }
                            ((View)this).getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.O0);
                        }
                        this.P0 = true;
                    }
                    else {
                        if (this.K0 && this.O0 != null) {
                            ((View)this).getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.O0);
                        }
                        this.P0 = false;
                    }
                }
                final int paddingLeft = ((View)this).getPaddingLeft();
                final int paddingTop = ((View)this).getPaddingTop();
                final int paddingRight = ((View)this).getPaddingRight();
                final int paddingBottom = ((View)this).getPaddingBottom();
                final WeakHashMap a = j6x.a;
                final int d = j6x$e.d((View)this);
                final boolean b3 = d == 1;
                final int mode = View$MeasureSpec.getMode(n);
                final int size = View$MeasureSpec.getSize(n);
                final int mode2 = View$MeasureSpec.getMode(n2);
                final int size2 = View$MeasureSpec.getSize(n2);
                int n3 = this.getSuggestedMinimumWidth();
                int n4 = this.getSuggestedMinimumHeight();
                final boolean b4 = this.Q0 != null && j6x$d.b((View)this);
                final int size3 = this.D0.size();
                int combineMeasuredStates = 0;
                int n5 = 0;
                final int n6 = paddingRight;
                int n7 = paddingLeft;
                while (true) {
                    final int n8 = n7;
                    if (n5 >= size3) {
                        break;
                    }
                    final View view = this.D0.get(n5);
                    if (view.getVisibility() != 8) {
                        final f f2 = (f)view.getLayoutParams();
                        final int e2 = f2.e;
                        int n10 = 0;
                        Label_0533: {
                            if (e2 >= 0 && mode != 0) {
                                final int q = this.q(e2);
                                int c;
                                if ((c = f2.c) == 0) {
                                    c = 8388661;
                                }
                                final int n9 = Gravity.getAbsoluteGravity(c, d) & 0x7;
                                if ((n9 == 3 && !b3) || (n9 == 5 && b3)) {
                                    n10 = Math.max(0, size - n6 - q);
                                    break Label_0533;
                                }
                                if ((n9 == 5 && !b3) || (n9 == 3 && b3)) {
                                    n10 = Math.max(0, q - n8);
                                    break Label_0533;
                                }
                            }
                            n10 = 0;
                        }
                        int measureSpec;
                        int measureSpec2;
                        if (b4 && !j6x$d.b(view)) {
                            final int g = this.Q0.g();
                            final int h = this.Q0.h();
                            final int k = this.Q0.i();
                            final int f3 = this.Q0.f();
                            measureSpec = View$MeasureSpec.makeMeasureSpec(size - (h + g), mode);
                            measureSpec2 = View$MeasureSpec.makeMeasureSpec(size2 - (f3 + k), mode2);
                        }
                        else {
                            measureSpec = n;
                            measureSpec2 = n2;
                        }
                        final c a2 = f2.a;
                        if (a2 == null || !a2.j(this, view, measureSpec, n10, measureSpec2)) {
                            this.measureChildWithMargins(view, measureSpec, n10, measureSpec2, 0);
                        }
                        n3 = Math.max(n3, view.getMeasuredWidth() + (paddingLeft + paddingRight) + f2.leftMargin + f2.rightMargin);
                        n4 = Math.max(n4, view.getMeasuredHeight() + (paddingTop + paddingBottom) + f2.topMargin + f2.bottomMargin);
                        combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, view.getMeasuredState());
                    }
                    ++n5;
                    n7 = n8;
                }
                ((View)this).setMeasuredDimension(View.resolveSizeAndState(n3, n, 0xFF000000 & combineMeasuredStates), View.resolveSizeAndState(n4, n2, combineMeasuredStates << 16));
                return;
            }
            boolean b2 = false;
            continue Label_0122;
        }
    }
    
    public boolean onNestedFling(View child, final float n, final float n2, final boolean b) {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                ((f)child.getLayoutParams()).a(0);
            }
        }
        return false;
    }
    
    public boolean onNestedPreFling(final View view, final float n, final float n2) {
        final int childCount = this.getChildCount();
        int i = 0;
        int n3 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            boolean b;
            if (child.getVisibility() == 8) {
                b = (n3 != 0);
            }
            else {
                final f f = (f)child.getLayoutParams();
                if (!f.a(0)) {
                    b = (n3 != 0);
                }
                else {
                    final c a = f.a;
                    b = (n3 != 0);
                    if (a != null) {
                        b = ((n3 | (a.k(view) ? 1 : 0)) != 0x0);
                    }
                }
            }
            ++i;
            n3 = (b ? 1 : 0);
        }
        return n3 != 0;
    }
    
    public void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
        this.k(view, n, n2, array, 0);
    }
    
    public void onNestedScroll(final View view, final int n, final int n2, final int n3, final int n4) {
        this.n(view, n, n2, n3, n4, 0);
    }
    
    public final void onNestedScrollAccepted(final View view, final View view2, final int n) {
        this.i(view, view2, n, 0);
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof CoordinatorLayout.CoordinatorLayout$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final CoordinatorLayout.CoordinatorLayout$SavedState coordinatorLayout$SavedState = (CoordinatorLayout.CoordinatorLayout$SavedState)parcelable;
        super.onRestoreInstanceState(((da)coordinatorLayout$SavedState).getSuperState());
        final SparseArray behaviorStates = coordinatorLayout$SavedState.behaviorStates;
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            final int id = child.getId();
            final c a = this.r(child).a;
            if (id != -1 && a != null) {
                final Parcelable parcelable2 = (Parcelable)behaviorStates.get(id);
                if (parcelable2 != null) {
                    a.o(child, parcelable2);
                }
            }
        }
    }
    
    public Parcelable onSaveInstanceState() {
        final CoordinatorLayout.CoordinatorLayout$SavedState coordinatorLayout$SavedState = new CoordinatorLayout.CoordinatorLayout$SavedState(super.onSaveInstanceState());
        final SparseArray behaviorStates = new SparseArray();
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final int id = child.getId();
            final c a = ((f)child.getLayoutParams()).a;
            if (id != -1 && a != null) {
                final Parcelable p = a.p(child);
                if (p != null) {
                    behaviorStates.append(id, (Object)p);
                }
            }
        }
        coordinatorLayout$SavedState.behaviorStates = behaviorStates;
        return (Parcelable)coordinatorLayout$SavedState;
    }
    
    public boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return this.o(view, view2, n, 0);
    }
    
    public void onStopNestedScroll(final View view) {
        this.j(view, 0);
    }
    
    public final boolean onTouchEvent(MotionEvent obtain) {
        final int actionMasked = obtain.getActionMasked();
        int n = 0;
        int n2 = 0;
        Label_0086: {
            Label_0083: {
                int w;
                if (this.M0 == null) {
                    w = (this.w(obtain, 1) ? 1 : 0);
                    if ((n = w) == 0) {
                        break Label_0083;
                    }
                }
                else {
                    w = 0;
                }
                final c a = ((f)this.M0.getLayoutParams()).a;
                n = w;
                if (a != null) {
                    final boolean s = a.s(this, this.M0, obtain);
                    n = w;
                    n2 = (s ? 1 : 0);
                    break Label_0086;
                }
            }
            n2 = 0;
        }
        final View m0 = this.M0;
        final MotionEvent motionEvent = null;
        boolean b;
        if (m0 == null) {
            b = ((n2 | (super.onTouchEvent(obtain) ? 1 : 0)) != 0x0);
            obtain = motionEvent;
        }
        else {
            b = (n2 != 0);
            obtain = motionEvent;
            if (n != 0) {
                final long uptimeMillis = SystemClock.uptimeMillis();
                obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                b = (n2 != 0);
            }
        }
        if (obtain != null) {
            obtain.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.y(false);
        }
        return b;
    }
    
    public final void p(int n, final Rect rect, final Rect rect2, final f f, final int n2, final int n3) {
        int c;
        if ((c = f.c) == 0) {
            c = 17;
        }
        final int absoluteGravity = Gravity.getAbsoluteGravity(c, n);
        int d;
        final int n4 = d = f.d;
        if ((n4 & 0x7) == 0x0) {
            d = (n4 | 0x800003);
        }
        int n5 = d;
        if ((d & 0x70) == 0x0) {
            n5 = (d | 0x30);
        }
        n = Gravity.getAbsoluteGravity(n5, n);
        final int n6 = absoluteGravity & 0x7;
        final int n7 = absoluteGravity & 0x70;
        final int n8 = n & 0x7;
        final int n9 = n & 0x70;
        if (n8 != 1) {
            if (n8 != 5) {
                n = rect.left;
            }
            else {
                n = rect.right;
            }
        }
        else {
            n = rect.left + rect.width() / 2;
        }
        int n10;
        if (n9 != 16) {
            if (n9 != 80) {
                n10 = rect.top;
            }
            else {
                n10 = rect.bottom;
            }
        }
        else {
            n10 = rect.top + rect.height() / 2;
        }
        int n11;
        if (n6 != 1) {
            n11 = n;
            if (n6 != 5) {
                n11 = n - n2;
            }
        }
        else {
            n11 = n - n2 / 2;
        }
        if (n7 != 16) {
            n = n10;
            if (n7 != 80) {
                n = n10 - n3;
            }
        }
        else {
            n = n10 - n3 / 2;
        }
        rect2.set(n11, n, n2 + n11, n3 + n);
    }
    
    public final int q(final int n) {
        final int[] l0 = this.L0;
        if (l0 == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(n);
            Log.e("CoordinatorLayout", sb.toString());
            return 0;
        }
        if (n >= 0 && n < l0.length) {
            return l0[n];
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Keyline index ");
        sb2.append(n);
        sb2.append(" out of range for ");
        sb2.append(this);
        Log.e("CoordinatorLayout", sb2.toString());
        return 0;
    }
    
    public final f r(View o) {
        final f f = (f)((View)o).getLayoutParams();
        if (!f.b) {
            if (o instanceof b) {
                final c behavior = ((b)o).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                f.b(behavior);
                f.b = true;
            }
            else {
                Class<?> clazz = o.getClass();
                o = null;
                while (clazz != null) {
                    final d d = clazz.getAnnotation(d.class);
                    if ((o = d) != null) {
                        break;
                    }
                    clazz = clazz.getSuperclass();
                    o = d;
                }
                if (o != null) {
                    try {
                        f.b((c)((d)o).value().getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]));
                    }
                    catch (final Exception ex) {
                        final StringBuilder j = fu8.j("Default behavior class ");
                        j.append(((d)o).value().getName());
                        j.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", j.toString(), (Throwable)ex);
                    }
                }
                f.b = true;
            }
        }
        return f;
    }
    
    public final boolean requestChildRectangleOnScreen(final View view, final Rect rect, final boolean b) {
        final c a = ((f)view.getLayoutParams()).a;
        return (a != null && a.n(this, view, rect, b)) || super.requestChildRectangleOnScreen(view, rect, b);
    }
    
    public final void requestDisallowInterceptTouchEvent(final boolean b) {
        super.requestDisallowInterceptTouchEvent(b);
        if (b && !this.J0) {
            this.y(false);
            this.J0 = true;
        }
    }
    
    public final boolean s(final View view, final int n, final int n2) {
        final Rect c = c();
        this.l(view, c);
        try {
            return c.contains(n, n2);
        }
        finally {
            c.setEmpty();
            CoordinatorLayout.a1.b(c);
        }
    }
    
    public void setFitsSystemWindows(final boolean fitsSystemWindows) {
        super.setFitsSystemWindows(fitsSystemWindows);
        this.B();
    }
    
    public void setOnHierarchyChangeListener(final ViewGroup$OnHierarchyChangeListener t0) {
        this.T0 = t0;
    }
    
    public void setStatusBarBackground(Drawable s0) {
        final Drawable s2 = this.S0;
        if (s2 != s0) {
            Drawable mutate = null;
            if (s2 != null) {
                s2.setCallback((Drawable$Callback)null);
            }
            if (s0 != null) {
                mutate = s0.mutate();
            }
            if ((this.S0 = mutate) != null) {
                if (mutate.isStateful()) {
                    this.S0.setState(((View)this).getDrawableState());
                }
                final Drawable s3 = this.S0;
                final WeakHashMap a = j6x.a;
                xc9.c(s3, j6x$e.d((View)this));
                s0 = this.S0;
                s0.setVisible(((View)this).getVisibility() == 0, false);
                this.S0.setCallback((Drawable$Callback)this);
            }
            final WeakHashMap a2 = j6x.a;
            j6x$d.k((View)this);
        }
    }
    
    public void setStatusBarBackgroundColor(final int n) {
        this.setStatusBarBackground((Drawable)new ColorDrawable(n));
    }
    
    public void setStatusBarBackgroundResource(final int n) {
        Drawable b;
        if (n != 0) {
            final Context context = ((View)this).getContext();
            final Object a = kn6.a;
            b = kn6.c.b(context, n);
        }
        else {
            b = null;
        }
        this.setStatusBarBackground(b);
    }
    
    public void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        final boolean b = visibility == 0;
        final Drawable s0 = this.S0;
        if (s0 != null && s0.isVisible() != b) {
            this.S0.setVisible(b, false);
        }
    }
    
    public final void t(final int n) {
        final WeakHashMap a = j6x.a;
        final int d = j6x$e.d((View)this);
        int size = this.D0.size();
        final Rect c = c();
        final Rect c2 = c();
        final Rect c3 = c();
        int n2 = n;
        int n5;
        int n15;
        for (int i = 0; i < size; size = n5, i = n15) {
            final View view = this.D0.get(i);
            final f f = (f)view.getLayoutParams();
            int n4;
            if (n2 == 0 && view.getVisibility() == 8) {
                final int n3 = size;
                n4 = i;
                n5 = n3;
            }
            else {
                for (int j = 0; j < i; ++j) {
                    if (f.l == this.D0.get(j)) {
                        final f f2 = (f)view.getLayoutParams();
                        if (f2.k != null) {
                            final Rect c4 = c();
                            final Rect c5 = c();
                            final Rect c6 = c();
                            this.l(f2.k, c4);
                            this.f(view, false, c5);
                            final int measuredWidth = view.getMeasuredWidth();
                            final int measuredHeight = view.getMeasuredHeight();
                            this.p(d, c4, c6, f2, measuredWidth, measuredHeight);
                            final boolean b = c6.left != c5.left || c6.top != c5.top;
                            this.d(f2, c6, measuredWidth, measuredHeight);
                            final int n6 = c6.left - c5.left;
                            final int n7 = c6.top - c5.top;
                            if (n6 != 0) {
                                j6x.r(view, n6);
                            }
                            if (n7 != 0) {
                                j6x.s(view, n7);
                            }
                            if (b) {
                                final c a2 = f2.a;
                                if (a2 != null) {
                                    a2.e(this, view, f2.k);
                                }
                            }
                            c4.setEmpty();
                            final grk a3 = CoordinatorLayout.a1;
                            a3.b(c4);
                            c5.setEmpty();
                            a3.b(c5);
                            c6.setEmpty();
                            a3.b(c6);
                        }
                    }
                }
                final int n8 = i;
                this.f(view, true, c2);
                if (f.g != 0 && !c2.isEmpty()) {
                    final int absoluteGravity = Gravity.getAbsoluteGravity(f.g, d);
                    final int n9 = absoluteGravity & 0x70;
                    if (n9 != 48) {
                        if (n9 == 80) {
                            c.bottom = Math.max(c.bottom, ((View)this).getHeight() - c2.top);
                        }
                    }
                    else {
                        c.top = Math.max(c.top, c2.bottom);
                    }
                    final int n10 = absoluteGravity & 0x7;
                    if (n10 != 3) {
                        if (n10 == 5) {
                            c.right = Math.max(c.right, ((View)this).getWidth() - c2.left);
                        }
                    }
                    else {
                        c.left = Math.max(c.left, c2.right);
                    }
                }
                if (f.h != 0 && view.getVisibility() == 0) {
                    final WeakHashMap a4 = j6x.a;
                    if (j6x$g.c(view)) {
                        if (view.getWidth() > 0) {
                            if (view.getHeight() > 0) {
                                final f f3 = (f)view.getLayoutParams();
                                final c a5 = f3.a;
                                final Rect c7 = c();
                                final Rect c8 = c();
                                c8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                                if (a5 != null && a5.b(view, c7)) {
                                    if (!c8.contains(c7)) {
                                        final StringBuilder k = fu8.j("Rect should be within the child's bounds. Rect:");
                                        k.append(c7.toShortString());
                                        k.append(" | Bounds:");
                                        k.append(c8.toShortString());
                                        throw new IllegalArgumentException(k.toString());
                                    }
                                }
                                else {
                                    c7.set(c8);
                                }
                                c8.setEmpty();
                                final grk a6 = CoordinatorLayout.a1;
                                a6.b(c8);
                                if (c7.isEmpty()) {
                                    c7.setEmpty();
                                    a6.b(c7);
                                }
                                else {
                                    final int absoluteGravity2 = Gravity.getAbsoluteGravity(f3.h, d);
                                    boolean b2 = false;
                                    Label_0865: {
                                        if ((absoluteGravity2 & 0x30) == 0x30) {
                                            final int n11 = c7.top - f3.topMargin - f3.j;
                                            final int top = c.top;
                                            if (n11 < top) {
                                                this.A(view, top - n11);
                                                b2 = true;
                                                break Label_0865;
                                            }
                                        }
                                        b2 = false;
                                    }
                                    boolean b3 = b2;
                                    if ((absoluteGravity2 & 0x50) == 0x50) {
                                        final int n12 = ((View)this).getHeight() - c7.bottom - f3.bottomMargin + f3.j;
                                        final int bottom = c.bottom;
                                        b3 = b2;
                                        if (n12 < bottom) {
                                            this.A(view, n12 - bottom);
                                            b3 = true;
                                        }
                                    }
                                    if (!b3) {
                                        this.A(view, 0);
                                    }
                                    boolean b4 = false;
                                    Label_1001: {
                                        if ((absoluteGravity2 & 0x3) == 0x3) {
                                            final int n13 = c7.left - f3.leftMargin - f3.i;
                                            final int left = c.left;
                                            if (n13 < left) {
                                                this.z(view, left - n13);
                                                b4 = true;
                                                break Label_1001;
                                            }
                                        }
                                        b4 = false;
                                    }
                                    boolean b5 = b4;
                                    if ((absoluteGravity2 & 0x5) == 0x5) {
                                        final int n14 = ((View)this).getWidth() - c7.right - f3.rightMargin + f3.i;
                                        final int right = c.right;
                                        b5 = b4;
                                        if (n14 < right) {
                                            this.z(view, n14 - right);
                                            b5 = true;
                                        }
                                    }
                                    if (!b5) {
                                        this.z(view, 0);
                                    }
                                    c7.setEmpty();
                                    a6.b(c7);
                                }
                            }
                        }
                    }
                }
                Label_1279: {
                    if (n != 2) {
                        c3.set(((f)view.getLayoutParams()).q);
                        if (c3.equals((Object)c2)) {
                            break Label_1279;
                        }
                        ((f)view.getLayoutParams()).q.set(c2);
                    }
                    for (int l = n8 + 1; l < size; ++l) {
                        final View view2 = this.D0.get(l);
                        final f f4 = (f)view2.getLayoutParams();
                        final c a7 = f4.a;
                        if (a7 != null && a7.c(this, view2, view)) {
                            if (n == 0 && f4.p) {
                                f4.p = false;
                            }
                            else {
                                boolean e;
                                if (n != 2) {
                                    e = a7.e(this, view2, view);
                                }
                                else {
                                    a7.f(this, view2, view);
                                    e = true;
                                }
                                if (n == 1) {
                                    f4.p = e;
                                }
                            }
                        }
                    }
                }
                n5 = size;
                n4 = n8;
                n2 = n;
            }
            n15 = n4 + 1;
        }
        c.setEmpty();
        final grk a8 = CoordinatorLayout.a1;
        a8.b(c);
        c2.setEmpty();
        a8.b(c2);
        c3.setEmpty();
        a8.b(c3);
    }
    
    public final void u(final View view, int max) {
        final f f = (f)view.getLayoutParams();
        final View k = f.k;
        final int n = 0;
        if (k != null || f.f == -1) {
            if (k != null) {
                final Rect c = c();
                final Rect c2 = c();
                try {
                    this.l(k, c);
                    final f f2 = (f)view.getLayoutParams();
                    final int measuredWidth = view.getMeasuredWidth();
                    final int measuredHeight = view.getMeasuredHeight();
                    this.p(max, c, c2, f2, measuredWidth, measuredHeight);
                    this.d(f2, c2, measuredWidth, measuredHeight);
                    view.layout(c2.left, c2.top, c2.right, c2.bottom);
                    return;
                }
                finally {
                    c.setEmpty();
                    final grk a1 = CoordinatorLayout.a1;
                    a1.b(c);
                    c2.setEmpty();
                    a1.b(c2);
                }
            }
            final int e = f.e;
            if (e >= 0) {
                final f f3 = (f)view.getLayoutParams();
                int c3;
                if ((c3 = f3.c) == 0) {
                    c3 = 8388661;
                }
                final int absoluteGravity = Gravity.getAbsoluteGravity(c3, max);
                final int n2 = absoluteGravity & 0x7;
                final int n3 = absoluteGravity & 0x70;
                final int width = ((View)this).getWidth();
                final int height = ((View)this).getHeight();
                final int measuredWidth2 = view.getMeasuredWidth();
                final int measuredHeight2 = view.getMeasuredHeight();
                int n4 = e;
                if (max == 1) {
                    n4 = width - e;
                }
                max = this.q(n4) - measuredWidth2;
                if (n2 != 1) {
                    if (n2 == 5) {
                        max += measuredWidth2;
                    }
                }
                else {
                    max += measuredWidth2 / 2;
                }
                int n5;
                if (n3 != 16) {
                    if (n3 != 80) {
                        n5 = n;
                    }
                    else {
                        n5 = measuredHeight2 + 0;
                    }
                }
                else {
                    n5 = 0 + measuredHeight2 / 2;
                }
                max = Math.max(((View)this).getPaddingLeft() + f3.leftMargin, Math.min(max, width - ((View)this).getPaddingRight() - measuredWidth2 - f3.rightMargin));
                final int max2 = Math.max(((View)this).getPaddingTop() + f3.topMargin, Math.min(n5, height - ((View)this).getPaddingBottom() - measuredHeight2 - f3.bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            }
            else {
                final f f4 = (f)view.getLayoutParams();
                final Rect c4 = c();
                c4.set(((View)this).getPaddingLeft() + f4.leftMargin, ((View)this).getPaddingTop() + f4.topMargin, ((View)this).getWidth() - ((View)this).getPaddingRight() - f4.rightMargin, ((View)this).getHeight() - ((View)this).getPaddingBottom() - f4.bottomMargin);
                if (this.Q0 != null) {
                    final WeakHashMap a2 = j6x.a;
                    if (j6x$d.b((View)this) && !j6x$d.b(view)) {
                        c4.left += this.Q0.g();
                        c4.top += this.Q0.i();
                        c4.right -= this.Q0.h();
                        c4.bottom -= this.Q0.f();
                    }
                }
                final Rect c5 = c();
                int c6;
                final int n6 = c6 = f4.c;
                if ((n6 & 0x7) == 0x0) {
                    c6 = (n6 | 0x800003);
                }
                int n7 = c6;
                if ((c6 & 0x70) == 0x0) {
                    n7 = (c6 | 0x30);
                }
                q7c.b(n7, view.getMeasuredWidth(), view.getMeasuredHeight(), c4, c5, max);
                view.layout(c5.left, c5.top, c5.right, c5.bottom);
                c4.setEmpty();
                final grk a3 = CoordinatorLayout.a1;
                a3.b(c4);
                c5.setEmpty();
                a3.b(c5);
            }
            return;
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }
    
    public final void v(final View view, final int n, final int n2, final int n3) {
        this.measureChildWithMargins(view, n, n2, n3, 0);
    }
    
    public final boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.S0;
    }
    
    public final boolean w(final MotionEvent motionEvent, final int n) {
        final int actionMasked = motionEvent.getActionMasked();
        final ArrayList f0 = this.F0;
        f0.clear();
        final boolean childrenDrawingOrderEnabled = this.isChildrenDrawingOrderEnabled();
        final int childCount = this.getChildCount();
        for (int i = childCount - 1; i >= 0; --i) {
            int childDrawingOrder;
            if (childrenDrawingOrderEnabled) {
                childDrawingOrder = this.getChildDrawingOrder(childCount, i);
            }
            else {
                childDrawingOrder = i;
            }
            f0.add(this.getChildAt(childDrawingOrder));
        }
        final h z0 = CoordinatorLayout.Z0;
        if (z0 != null) {
            Collections.sort((List<Object>)f0, (Comparator<? super Object>)z0);
        }
        final int size = f0.size();
        MotionEvent motionEvent2 = null;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5;
        while (true) {
            n5 = n3;
            if (n2 >= size) {
                break;
            }
            final View m0 = (View)f0.get(n2);
            final f f2 = (f)m0.getLayoutParams();
            final c a = f2.a;
            MotionEvent obtain;
            int n6;
            int n7;
            if ((n3 || n4 != 0) && actionMasked != 0) {
                obtain = motionEvent2;
                n6 = n3;
                n7 = n4;
                if (a != null) {
                    if ((obtain = motionEvent2) == null) {
                        final long uptimeMillis = SystemClock.uptimeMillis();
                        obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (n != 0) {
                        if (n != 1) {
                            n6 = n3;
                            n7 = n4;
                        }
                        else {
                            a.s(this, m0, obtain);
                            n6 = n3;
                            n7 = n4;
                        }
                    }
                    else {
                        a.h(this, m0, obtain);
                        n6 = n3;
                        n7 = n4;
                    }
                }
            }
            else {
                n5 = n3;
                if (n3 == 0) {
                    n5 = n3;
                    if (a != null) {
                        if (n != 0) {
                            if (n == 1) {
                                n3 = (a.s(this, m0, motionEvent) ? 1 : 0);
                            }
                        }
                        else {
                            n3 = (a.h(this, m0, motionEvent) ? 1 : 0);
                        }
                        n5 = n3;
                        if (n3 != 0) {
                            this.M0 = m0;
                            n5 = n3;
                        }
                    }
                }
                if (f2.a == null) {
                    f2.m = false;
                }
                final boolean j = f2.m;
                boolean k;
                if (j) {
                    k = true;
                }
                else {
                    k = (j | false);
                    f2.m = k;
                }
                final boolean b = k && !j;
                obtain = motionEvent2;
                n6 = n5;
                n7 = (b ? 1 : 0);
                if (k) {
                    obtain = motionEvent2;
                    n6 = n5;
                    if ((n7 = (b ? 1 : 0)) == 0) {
                        break;
                    }
                }
            }
            ++n2;
            motionEvent2 = obtain;
            n3 = n6;
            n4 = n7;
        }
        f0.clear();
        return n5 != 0;
    }
    
    public final void x() {
        this.D0.clear();
        final bb7 e0 = this.E0;
        final int f0 = ((d8q)e0.c).F0;
        final int n = 0;
        for (int i = 0; i < f0; ++i) {
            final ArrayList list = ((d8q)e0.c).m(i);
            if (list != null) {
                list.clear();
                ((crk)e0.b).b((Object)list);
            }
        }
        ((d8q)e0.c).clear();
        for (int childCount = this.getChildCount(), j = 0; j < childCount; ++j) {
            final View child = this.getChildAt(j);
            final f r = this.r(child);
            Label_0444: {
                if (r.f == -1) {
                    r.l = null;
                    r.k = null;
                }
                else {
                    final View k = r.k;
                    if (k != null) {
                        boolean b = false;
                        Label_0264: {
                            Label_0250: {
                                if (k.getId() == r.f) {
                                    View l = r.k;
                                    for (ViewParent viewParent = l.getParent(); viewParent != this; viewParent = viewParent.getParent()) {
                                        if (viewParent == null || viewParent == child) {
                                            r.l = null;
                                            r.k = null;
                                            break Label_0250;
                                        }
                                        if (viewParent instanceof View) {
                                            l = (View)viewParent;
                                        }
                                    }
                                    r.l = l;
                                    b = true;
                                    break Label_0264;
                                }
                            }
                            b = false;
                        }
                        if (b) {
                            break Label_0444;
                        }
                    }
                    View viewById = ((View)this).findViewById(r.f);
                    if ((r.k = viewById) != null) {
                        if (viewById == this) {
                            if (!((View)this).isInEditMode()) {
                                throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                            }
                            r.l = null;
                            r.k = null;
                        }
                        else {
                            ViewParent viewParent2 = viewById.getParent();
                            while (viewParent2 != this && viewParent2 != null) {
                                if (viewParent2 == child) {
                                    if (((View)this).isInEditMode()) {
                                        r.l = null;
                                        r.k = null;
                                        break Label_0444;
                                    }
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                                else {
                                    if (viewParent2 instanceof View) {
                                        viewById = (View)viewParent2;
                                    }
                                    viewParent2 = viewParent2.getParent();
                                }
                            }
                            r.l = viewById;
                        }
                    }
                    else {
                        if (!((View)this).isInEditMode()) {
                            final StringBuilder m = fu8.j("Could not find CoordinatorLayout descendant view with id ");
                            m.append(((View)this).getResources().getResourceName(r.f));
                            m.append(" to anchor view ");
                            m.append(child);
                            throw new IllegalStateException(m.toString());
                        }
                        r.l = null;
                        r.k = null;
                    }
                }
            }
            final bb7 e2 = this.E0;
            if (!((d8q)e2.c).containsKey(child)) {
                ((d8q)e2.c).put(child, null);
            }
            for (int n2 = 0; n2 < childCount; ++n2) {
                if (n2 != j) {
                    final View child2 = this.getChildAt(n2);
                    boolean b2 = false;
                    Label_0608: {
                        if (child2 != r.l) {
                            final WeakHashMap a = j6x.a;
                            final int d = j6x$e.d((View)this);
                            final int absoluteGravity = Gravity.getAbsoluteGravity(((f)child2.getLayoutParams()).g, d);
                            if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(r.h, d) & absoluteGravity) != absoluteGravity) {
                                final c a2 = r.a;
                                if (a2 == null || !a2.c(this, child, child2)) {
                                    b2 = false;
                                    break Label_0608;
                                }
                            }
                        }
                        b2 = true;
                    }
                    if (b2) {
                        if (!((d8q)this.E0.c).containsKey(child2)) {
                            final bb7 e3 = this.E0;
                            if (!((d8q)e3.c).containsKey(child2)) {
                                ((d8q)e3.c).put(child2, null);
                            }
                        }
                        final bb7 e4 = this.E0;
                        if (!((d8q)e4.c).containsKey(child2) || !((d8q)e4.c).containsKey(child)) {
                            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                        }
                        ArrayList list2;
                        if ((list2 = ((d8q)e4.c).getOrDefault(child2, null)) == null) {
                            if ((list2 = (ArrayList)((crk)e4.b).a()) == null) {
                                list2 = new ArrayList();
                            }
                            ((d8q)e4.c).put(child2, list2);
                        }
                        list2.add(child);
                    }
                }
            }
        }
        final ArrayList d2 = this.D0;
        final bb7 e5 = this.E0;
        ((ArrayList)e5.a).clear();
        ((HashSet)e5.d).clear();
        for (int f2 = ((d8q)e5.c).F0, n3 = n; n3 < f2; ++n3) {
            e5.c(((d8q)e5.c).i(n3), (ArrayList)e5.a, (HashSet)e5.d);
        }
        d2.addAll((Collection)e5.a);
        Collections.reverse(this.D0);
    }
    
    public final void y(final boolean b) {
        final int childCount = this.getChildCount();
        for (int i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final c a = ((f)child.getLayoutParams()).a;
            if (a != null) {
                final long uptimeMillis = SystemClock.uptimeMillis();
                final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (b) {
                    a.h(this, child, obtain);
                }
                else {
                    a.s(this, child, obtain);
                }
                obtain.recycle();
            }
        }
        for (int j = 0; j < childCount; ++j) {
            ((f)this.getChildAt(j).getLayoutParams()).m = false;
        }
        this.M0 = null;
        this.J0 = false;
    }
    
    public final void z(final View view, final int i) {
        final f f = (f)view.getLayoutParams();
        final int j = f.i;
        if (j != i) {
            j6x.r(view, i - j);
            f.i = i;
        }
    }
    
    public interface b
    {
        c getBehavior();
    }
    
    public abstract static class c<V extends View>
    {
        public c() {
        }
        
        public c(final Context context, final AttributeSet set) {
        }
        
        public boolean b(final CoordinatorLayout p0, final V p1, final Rect p2) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ireturn        
            //    Signature:
            //  (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;Landroid/graphics/Rect;)Z
            // 
            // The error that occurred was:
            // 
            // java.lang.ArrayIndexOutOfBoundsException: 3
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public boolean c(final CoordinatorLayout coordinatorLayout, final V v, final View view) {
            return false;
        }
        
        public void d(final f f) {
        }
        
        public boolean e(final CoordinatorLayout coordinatorLayout, final V v, final View view) {
            return false;
        }
        
        public void f(final CoordinatorLayout coordinatorLayout, final V v, final View view) {
        }
        
        public void g() {
        }
        
        public boolean h(final CoordinatorLayout coordinatorLayout, final V v, final MotionEvent motionEvent) {
            return false;
        }
        
        public boolean i(final CoordinatorLayout coordinatorLayout, final V v, final int n) {
            return false;
        }
        
        public boolean j(final CoordinatorLayout p0, final V p1, final int p2, final int p3, final int p4, final int p5) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ireturn        
            //    Signature:
            //  (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;IIII)Z
            // 
            // The error that occurred was:
            // 
            // java.lang.ArrayIndexOutOfBoundsException: 6
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2016)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public boolean k(final CoordinatorLayout p0, final V p1, final View p2, final float p3, final float p4) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ireturn        
            //    Signature:
            //  (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;Landroid/view/View;FF)Z
            // 
            // The error that occurred was:
            // 
            // java.lang.ArrayIndexOutOfBoundsException: 2
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public void l(final CoordinatorLayout coordinatorLayout, final V v, final View view, final int n, final int n2, final int[] array, final int n3) {
        }
        
        public void m(final CoordinatorLayout coordinatorLayout, final V v, final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
            array[0] += n3;
            array[1] += n4;
        }
        
        public boolean n(final CoordinatorLayout coordinatorLayout, final V v, final Rect rect, final boolean b) {
            return false;
        }
        
        public void o(final CoordinatorLayout p0, final V p1, final Parcelable p2) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //    Signature:
            //  (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;Landroid/os/Parcelable;)V
            // 
            // The error that occurred was:
            // 
            // java.lang.ArrayIndexOutOfBoundsException: 3
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public Parcelable p(final CoordinatorLayout p0, final V p1) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: areturn        
            //    Signature:
            //  (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;)Landroid/os/Parcelable;
            // 
            // The error that occurred was:
            // 
            // java.lang.ArrayIndexOutOfBoundsException: 2
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public boolean q(final CoordinatorLayout p0, final V p1, final View p2, final View p3, final int p4, final int p5) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ireturn        
            //    Signature:
            //  (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;Landroid/view/View;Landroid/view/View;II)Z
            // 
            // The error that occurred was:
            // 
            // java.lang.ArrayIndexOutOfBoundsException: 6
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2016)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public void r(final CoordinatorLayout coordinatorLayout, final V v, final View view, final int n) {
        }
        
        public boolean s(final CoordinatorLayout coordinatorLayout, final V v, final MotionEvent motionEvent) {
            return false;
        }
    }
    
    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class<? extends c> value();
    }
    
    public final class e implements ViewGroup$OnHierarchyChangeListener
    {
        public final CoordinatorLayout D0;
        
        public e(final CoordinatorLayout d0) {
            this.D0 = d0;
        }
        
        public final void onChildViewAdded(final View view, final View view2) {
            final ViewGroup$OnHierarchyChangeListener t0 = this.D0.T0;
            if (t0 != null) {
                t0.onChildViewAdded(view, view2);
            }
        }
        
        public final void onChildViewRemoved(final View view, final View view2) {
            this.D0.t(2);
            final ViewGroup$OnHierarchyChangeListener t0 = this.D0.T0;
            if (t0 != null) {
                t0.onChildViewRemoved(view, view2);
            }
        }
    }
    
    public static final class f extends ViewGroup$MarginLayoutParams
    {
        public c a;
        public boolean b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public View k;
        public View l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public final Rect q;
        
        public f() {
            super(-2, -2);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }
        
        public f(final Context context, final AttributeSet set) {
            super(context, set);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, nza.J0);
            this.c = obtainStyledAttributes.getInteger(0, 0);
            this.f = obtainStyledAttributes.getResourceId(1, -1);
            this.d = obtainStyledAttributes.getInteger(2, 0);
            this.e = obtainStyledAttributes.getInteger(6, -1);
            this.g = obtainStyledAttributes.getInt(5, 0);
            this.h = obtainStyledAttributes.getInt(4, 0);
            final boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.b = hasValue;
            if (hasValue) {
                final String string = obtainStyledAttributes.getString(3);
                String s = CoordinatorLayout.W0;
                Label_0413: {
                    if (TextUtils.isEmpty((CharSequence)string)) {
                        final c a = null;
                        break Label_0413;
                    }
                    if (string.startsWith(".")) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(context.getPackageName());
                        sb.append(string);
                        s = sb.toString();
                    }
                    else if (string.indexOf(46) >= 0) {
                        s = string;
                    }
                    else {
                        final String w0 = CoordinatorLayout.W0;
                        s = string;
                        if (!TextUtils.isEmpty((CharSequence)w0)) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(w0);
                            sb2.append('.');
                            sb2.append(string);
                            s = sb2.toString();
                        }
                    }
                    try {
                        final ThreadLocal<Map<String, Constructor<c>>> y0 = CoordinatorLayout.Y0;
                        Map map;
                        if ((map = y0.get()) == null) {
                            map = new HashMap();
                            y0.set(map);
                        }
                        Constructor<?> constructor;
                        if ((constructor = (Constructor)map.get(s)) == null) {
                            constructor = Class.forName(s, false, context.getClassLoader()).getConstructor(CoordinatorLayout.X0);
                            constructor.setAccessible(true);
                            map.put(s, constructor);
                        }
                        final c a = (c)constructor.newInstance(context, set);
                        this.a = a;
                    }
                    catch (final Exception ex) {
                        throw new RuntimeException(hmg.h("Could not inflate Behavior subclass ", s), ex);
                    }
                }
            }
            obtainStyledAttributes.recycle();
            final c a2 = this.a;
            if (a2 != null) {
                a2.d(this);
            }
        }
        
        public f(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }
        
        public f(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super(viewGroup$MarginLayoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }
        
        public f(final f f) {
            super((ViewGroup$MarginLayoutParams)f);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }
        
        public final boolean a(final int n) {
            if (n != 0) {
                return n == 1 && this.o;
            }
            return this.n;
        }
        
        public final void b(final c a) {
            final c a2 = this.a;
            if (a2 != a) {
                if (a2 != null) {
                    a2.g();
                }
                this.a = a;
                this.b = true;
                if (a != null) {
                    a.d(this);
                }
            }
        }
        
        public final void c(final int n, final boolean b) {
            if (n != 0) {
                if (n == 1) {
                    this.o = b;
                }
            }
            else {
                this.n = b;
            }
        }
    }
    
    public final class g implements ViewTreeObserver$OnPreDrawListener
    {
        public final CoordinatorLayout D0;
        
        public g(final CoordinatorLayout d0) {
            this.D0 = d0;
        }
        
        public final boolean onPreDraw() {
            this.D0.t(0);
            return true;
        }
    }
    
    public static final class h implements Comparator<View>
    {
        @Override
        public final int compare(final Object o, final Object o2) {
            final View view = (View)o;
            final View view2 = (View)o2;
            final WeakHashMap a = j6x.a;
            final float m = j6x$i.m(view);
            final float i = j6x$i.m(view2);
            int n;
            if (m > i) {
                n = -1;
            }
            else if (m < i) {
                n = 1;
            }
            else {
                n = 0;
            }
            return n;
        }
    }
}
