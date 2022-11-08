// 
// Decompiled by Procyon v0.6.0
// 

package androidx.drawerlayout.widget;

import android.view.accessibility.AccessibilityRecord;
import android.os.SystemClock;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Objects;
import android.view.accessibility.AccessibilityEvent;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.graphics.drawable.ColorDrawable;
import android.os.Parcelable;
import android.annotation.SuppressLint;
import android.view.View$MeasureSpec;
import android.view.KeyEvent;
import android.view.WindowInsets;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.Gravity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import java.util.WeakHashMap;
import android.view.View$OnApplyWindowInsetsListener;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import android.graphics.drawable.Drawable;
import java.util.List;
import android.graphics.Paint;
import android.view.ViewGroup;

public class DrawerLayout extends ViewGroup
{
    public static final int[] e1;
    public static final int[] f1;
    public static final boolean g1;
    public static final boolean h1;
    public static boolean i1;
    public final c C0;
    public float D0;
    public int E0;
    public float F0;
    public Paint G0;
    public final i6x H0;
    public final i6x I0;
    public final g J0;
    public final g K0;
    public int L0;
    public boolean M0;
    public boolean N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public boolean S0;
    public d T0;
    public List<d> U0;
    public float V0;
    public float W0;
    public Drawable X0;
    public Object Y0;
    public boolean Z0;
    public final ArrayList<View> a1;
    public Rect b1;
    public Matrix c1;
    public final DrawerLayout$a d1;
    private int mMinDrawerMargin;
    
    static {
        boolean i1 = true;
        e1 = new int[] { 16843828 };
        f1 = new int[] { 16842931 };
        final int sdk_INT = Build$VERSION.SDK_INT;
        g1 = true;
        h1 = true;
        if (sdk_INT < 29) {
            i1 = false;
        }
        DrawerLayout.i1 = i1;
    }
    
    public DrawerLayout(Context obtainStyledAttributes, final AttributeSet set) {
        super(obtainStyledAttributes, set, 2130969259);
        this.C0 = new c();
        this.E0 = -1728053248;
        this.G0 = new Paint();
        this.N0 = true;
        this.O0 = 3;
        this.P0 = 3;
        this.Q0 = 3;
        this.R0 = 3;
        this.d1 = new bh() {
            public final boolean p(final View view) {
                if (DrawerLayout.this.m(view) && DrawerLayout.this.h(view) != 2) {
                    DrawerLayout.this.c(view);
                    return true;
                }
                return false;
            }
        };
        this.setDescendantFocusability(262144);
        final float density = ((View)this).getResources().getDisplayMetrics().density;
        this.mMinDrawerMargin = (int)(64.0f * density + 0.5f);
        final float n = density * 400.0f;
        final g j0 = new g(3);
        this.J0 = j0;
        final g k0 = new g(5);
        this.K0 = k0;
        final i6x i = i6x.j(this, (i6x.c)j0);
        this.H0 = i;
        i.q = 1;
        i.n = n;
        j0.b = i;
        final i6x l = i6x.j(this, (i6x.c)k0);
        this.I0 = l;
        l.q = 2;
        l.n = n;
        k0.b = l;
        ((View)this).setFocusableInTouchMode(true);
        final WeakHashMap a = p5x.a;
        p5x$d.s((View)this, 1);
        p5x.z((View)this, (wf)new b());
        this.setMotionEventSplittingEnabled(false);
        if (p5x$d.b((View)this)) {
            ((View)this).setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)new ei9());
            ((View)this).setSystemUiVisibility(1280);
            final TypedArray obtainStyledAttributes2 = obtainStyledAttributes.obtainStyledAttributes(DrawerLayout.e1);
            try {
                this.X0 = obtainStyledAttributes2.getDrawable(0);
            }
            finally {
                obtainStyledAttributes2.recycle();
            }
        }
        obtainStyledAttributes = (Context)obtainStyledAttributes.obtainStyledAttributes(set, mb8.D0, 2130969259, 0);
        try {
            if (((TypedArray)obtainStyledAttributes).hasValue(0)) {
                this.D0 = ((TypedArray)obtainStyledAttributes).getDimension(0, 0.0f);
            }
            else {
                this.D0 = ((View)this).getResources().getDimension(2131165561);
            }
            ((TypedArray)obtainStyledAttributes).recycle();
            this.a1 = new ArrayList<View>();
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    public static String j(final int n) {
        if ((n & 0x3) == 0x3) {
            return "LEFT";
        }
        if ((n & 0x5) == 0x5) {
            return "RIGHT";
        }
        return Integer.toHexString(n);
    }
    
    public static boolean k(final View view) {
        final WeakHashMap a = p5x.a;
        return p5x$d.c(view) != 4 && p5x$d.c(view) != 2;
    }
    
    public final void a(final d d) {
        if (d == null) {
            return;
        }
        if (this.U0 == null) {
            this.U0 = new ArrayList();
        }
        this.U0.add(d);
    }
    
    public final void addFocusables(final ArrayList<View> list, final int n, final int n2) {
        if (this.getDescendantFocusability() == 393216) {
            return;
        }
        final int childCount = this.getChildCount();
        final int n3 = 0;
        int i = 0;
        boolean b = false;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            if (this.n(child)) {
                if (this.m(child)) {
                    child.addFocusables((ArrayList)list, n, n2);
                    b = true;
                }
            }
            else {
                this.a1.add(child);
            }
            ++i;
        }
        if (!b) {
            for (int size = this.a1.size(), j = n3; j < size; ++j) {
                final View view = this.a1.get(j);
                if (view.getVisibility() == 0) {
                    view.addFocusables((ArrayList)list, n, n2);
                }
            }
        }
        this.a1.clear();
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super.addView(view, n, viewGroup$LayoutParams);
        if (this.f() == null && !this.n(view)) {
            final WeakHashMap a = p5x.a;
            p5x$d.s(view, 1);
        }
        else {
            final WeakHashMap a2 = p5x.a;
            p5x$d.s(view, 4);
        }
        if (!DrawerLayout.g1) {
            p5x.z(view, (wf)this.C0);
        }
    }
    
    public final boolean b(final View view, final int n) {
        return (this.i(view) & n) == n;
    }
    
    public final void c(final View view) {
        if (this.n(view)) {
            final e e = (e)view.getLayoutParams();
            if (this.N0) {
                e.b = 0.0f;
                e.d = 0;
            }
            else {
                e.d |= 0x4;
                if (this.b(view, 3)) {
                    this.H0.x(view, -view.getWidth(), view.getTop());
                }
                else {
                    this.I0.x(view, ((View)this).getWidth(), view.getTop());
                }
            }
            ((View)this).invalidate();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof e && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public final void computeScroll() {
        final int childCount = this.getChildCount();
        float max = 0.0f;
        for (int i = 0; i < childCount; ++i) {
            max = Math.max(max, ((e)this.getChildAt(i).getLayoutParams()).b);
        }
        this.F0 = max;
        final boolean j = this.H0.i();
        final boolean k = this.I0.i();
        if (j || k) {
            final WeakHashMap a = p5x.a;
            p5x$d.k((View)this);
        }
    }
    
    public final void d(final boolean b) {
        final int childCount = this.getChildCount();
        int i = 0;
        int n = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            final e e = (e)child.getLayoutParams();
            int n2 = n;
            if (this.n(child)) {
                if (b && !e.c) {
                    n2 = n;
                }
                else {
                    final int width = child.getWidth();
                    boolean b2;
                    if (this.b(child, 3)) {
                        b2 = this.H0.x(child, -width, child.getTop());
                    }
                    else {
                        b2 = this.I0.x(child, ((View)this).getWidth(), child.getTop());
                    }
                    n2 = (n | (b2 ? 1 : 0));
                    e.c = false;
                }
            }
            ++i;
            n = n2;
        }
        this.J0.n();
        this.K0.n();
        if (n != 0) {
            ((View)this).invalidate();
        }
    }
    
    public final boolean dispatchGenericMotionEvent(final MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 0x2) != 0x0 && motionEvent.getAction() != 10 && this.F0 > 0.0f) {
            int i = this.getChildCount();
            if (i != 0) {
                final float x = motionEvent.getX();
                final float y = motionEvent.getY();
                --i;
                while (i >= 0) {
                    final View child = this.getChildAt(i);
                    if (this.b1 == null) {
                        this.b1 = new Rect();
                    }
                    child.getHitRect(this.b1);
                    if (this.b1.contains((int)x, (int)y)) {
                        if (!this.l(child)) {
                            boolean b;
                            if (!child.getMatrix().isIdentity()) {
                                final float n = (float)(((View)this).getScrollX() - child.getLeft());
                                final float n2 = (float)(((View)this).getScrollY() - child.getTop());
                                final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                                obtain.offsetLocation(n, n2);
                                final Matrix matrix = child.getMatrix();
                                if (!matrix.isIdentity()) {
                                    if (this.c1 == null) {
                                        this.c1 = new Matrix();
                                    }
                                    matrix.invert(this.c1);
                                    obtain.transform(this.c1);
                                }
                                b = child.dispatchGenericMotionEvent(obtain);
                                obtain.recycle();
                            }
                            else {
                                final float n3 = (float)(((View)this).getScrollX() - child.getLeft());
                                final float n4 = (float)(((View)this).getScrollY() - child.getTop());
                                motionEvent.offsetLocation(n3, n4);
                                b = child.dispatchGenericMotionEvent(motionEvent);
                                motionEvent.offsetLocation(-n3, -n4);
                            }
                            if (b) {
                                return true;
                            }
                        }
                    }
                    --i;
                }
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }
    
    public final boolean drawChild(final Canvas canvas, final View view, final long n) {
        final int height = ((View)this).getHeight();
        final boolean l = this.l(view);
        int width = ((View)this).getWidth();
        final int save = canvas.save();
        int n2 = 0;
        int n3 = width;
        if (l) {
            final int childCount = this.getChildCount();
            int i = 0;
            int n4 = 0;
            while (i < childCount) {
                final View child = this.getChildAt(i);
                int n5 = width;
                int n6 = n4;
                if (child != view) {
                    n5 = width;
                    n6 = n4;
                    if (child.getVisibility() == 0) {
                        final Drawable background = child.getBackground();
                        final boolean b = background != null && background.getOpacity() == -1;
                        n5 = width;
                        n6 = n4;
                        if (b) {
                            n5 = width;
                            n6 = n4;
                            if (this.n(child)) {
                                if (child.getHeight() < height) {
                                    n5 = width;
                                    n6 = n4;
                                }
                                else if (this.b(child, 3)) {
                                    final int right = child.getRight();
                                    n5 = width;
                                    if (right > (n6 = n4)) {
                                        n6 = right;
                                        n5 = width;
                                    }
                                }
                                else {
                                    final int left = child.getLeft();
                                    n5 = width;
                                    n6 = n4;
                                    if (left < width) {
                                        n5 = left;
                                        n6 = n4;
                                    }
                                }
                            }
                        }
                    }
                }
                ++i;
                width = n5;
                n4 = n6;
            }
            canvas.clipRect(n4, 0, width, ((View)this).getHeight());
            n2 = n4;
            n3 = width;
        }
        final boolean drawChild = super.drawChild(canvas, view, n);
        canvas.restoreToCount(save);
        final float f0 = this.F0;
        if (f0 > 0.0f && l) {
            final int e0 = this.E0;
            this.G0.setColor((int)(((0xFF000000 & e0) >>> 24) * f0) << 24 | (e0 & 0xFFFFFF));
            canvas.drawRect((float)n2, 0.0f, (float)n3, (float)((View)this).getHeight(), this.G0);
        }
        return drawChild;
    }
    
    public final View e(int i) {
        final WeakHashMap a = p5x.a;
        final int absoluteGravity = Gravity.getAbsoluteGravity(i, p5x$e.d((View)this));
        int childCount;
        View child;
        for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if ((this.i(child) & 0x7) == (absoluteGravity & 0x7)) {
                return child;
            }
        }
        return null;
    }
    
    public final View f() {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if ((((e)child.getLayoutParams()).d & 0x1) == 0x1) {
                return child;
            }
        }
        return null;
    }
    
    public final View g() {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (this.n(child)) {
                if (!this.n(child)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("View ");
                    sb.append(child);
                    sb.append(" is not a drawer");
                    throw new IllegalArgumentException(sb.toString());
                }
                if (((e)child.getLayoutParams()).b > 0.0f) {
                    return child;
                }
            }
        }
        return null;
    }
    
    public final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new e();
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new e(((View)this).getContext(), set);
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        e e;
        if (viewGroup$LayoutParams instanceof e) {
            e = new e((e)viewGroup$LayoutParams);
        }
        else if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            e = new e((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        else {
            e = new e(viewGroup$LayoutParams);
        }
        return (ViewGroup$LayoutParams)e;
    }
    
    public float getDrawerElevation() {
        if (DrawerLayout.h1) {
            return this.D0;
        }
        return 0.0f;
    }
    
    public Drawable getStatusBarBackgroundDrawable() {
        return this.X0;
    }
    
    public final int h(final View view) {
        if (this.n(view)) {
            final int a = ((e)view.getLayoutParams()).a;
            final WeakHashMap a2 = p5x.a;
            final int d = p5x$e.d((View)this);
            if (a != 3) {
                if (a != 5) {
                    if (a != 8388611) {
                        if (a == 8388613) {
                            int n = this.R0;
                            if (n != 3) {
                                return n;
                            }
                            if (d == 0) {
                                n = this.P0;
                            }
                            else {
                                n = this.O0;
                            }
                            if (n != 3) {
                                return n;
                            }
                        }
                    }
                    else {
                        int n = this.Q0;
                        if (n != 3) {
                            return n;
                        }
                        if (d == 0) {
                            n = this.O0;
                        }
                        else {
                            n = this.P0;
                        }
                        if (n != 3) {
                            return n;
                        }
                    }
                }
                else {
                    int n = this.P0;
                    if (n != 3) {
                        return n;
                    }
                    if (d == 0) {
                        n = this.R0;
                    }
                    else {
                        n = this.Q0;
                    }
                    if (n != 3) {
                        return n;
                    }
                }
            }
            else {
                int n = this.O0;
                if (n != 3) {
                    return n;
                }
                if (d == 0) {
                    n = this.Q0;
                }
                else {
                    n = this.R0;
                }
                if (n != 3) {
                    return n;
                }
            }
            return 0;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final int i(final View view) {
        final int a = ((e)view.getLayoutParams()).a;
        final WeakHashMap a2 = p5x.a;
        return Gravity.getAbsoluteGravity(a, p5x$e.d((View)this));
    }
    
    public final boolean l(final View view) {
        return ((e)view.getLayoutParams()).a == 0;
    }
    
    public final boolean m(final View view) {
        if (this.n(view)) {
            final int d = ((e)view.getLayoutParams()).d;
            boolean b = true;
            if ((d & 0x1) != 0x1) {
                b = false;
            }
            return b;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final boolean n(final View view) {
        final int a = ((e)view.getLayoutParams()).a;
        final WeakHashMap a2 = p5x.a;
        final int absoluteGravity = Gravity.getAbsoluteGravity(a, p5x$e.d(view));
        return (absoluteGravity & 0x3) != 0x0 || (absoluteGravity & 0x5) != 0x0;
    }
    
    public final void o(final View view) {
        if (this.n(view)) {
            final e e = (e)view.getLayoutParams();
            if (this.N0) {
                e.b = 1.0f;
                e.d = 1;
                this.s(view, true);
                this.r(view);
            }
            else {
                e.d |= 0x2;
                if (this.b(view, 3)) {
                    this.H0.x(view, 0, view.getTop());
                }
                else {
                    this.I0.x(view, ((View)this).getWidth() - view.getWidth(), view.getTop());
                }
            }
            ((View)this).invalidate();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N0 = true;
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.N0 = true;
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.Z0 && this.X0 != null) {
            final Object y0 = this.Y0;
            int systemWindowInsetTop;
            if (y0 != null) {
                systemWindowInsetTop = ((WindowInsets)y0).getSystemWindowInsetTop();
            }
            else {
                systemWindowInsetTop = 0;
            }
            if (systemWindowInsetTop > 0) {
                this.X0.setBounds(0, 0, ((View)this).getWidth(), systemWindowInsetTop);
                this.X0.draw(canvas);
            }
        }
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final boolean w = this.H0.w(motionEvent);
        final boolean w2 = this.I0.w(motionEvent);
        final boolean b = true;
        boolean b3;
        if (actionMasked != 0) {
            Label_0122: {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        final i6x h0 = this.H0;
                        final int length = h0.d.length;
                        int i = 0;
                        while (true) {
                            while (i < length) {
                                if (h0.d(3, i)) {
                                    final boolean b2 = true;
                                    if (b2) {
                                        this.J0.n();
                                        this.K0.n();
                                    }
                                    break Label_0122;
                                }
                                else {
                                    ++i;
                                }
                            }
                            final boolean b2 = false;
                            continue;
                        }
                    }
                    if (actionMasked != 3) {
                        break Label_0122;
                    }
                }
                this.d(true);
                this.S0 = false;
            }
            b3 = false;
        }
        else {
            final float x = motionEvent.getX();
            final float y = motionEvent.getY();
            this.V0 = x;
            this.W0 = y;
            Label_0193: {
                if (this.F0 > 0.0f) {
                    final View l = this.H0.l((int)x, (int)y);
                    if (l != null && this.l(l)) {
                        b3 = true;
                        break Label_0193;
                    }
                }
                b3 = false;
            }
            this.S0 = false;
        }
        boolean b4 = b;
        if (!(w | w2)) {
            b4 = b;
            if (!b3) {
                final int childCount = this.getChildCount();
                int j = 0;
                while (true) {
                    while (j < childCount) {
                        if (((e)this.getChildAt(j).getLayoutParams()).c) {
                            final boolean b5 = true;
                            b4 = b;
                            if (!b5) {
                                b4 = (this.S0 && b);
                                return b4;
                            }
                            return b4;
                        }
                        else {
                            ++j;
                        }
                    }
                    final boolean b5 = false;
                    continue;
                }
            }
        }
        return b4;
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        if (n == 4 && this.g() != null) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        if (n == 4) {
            final View g = this.g();
            boolean b = false;
            if (g != null && this.h(g) == 0) {
                this.d(false);
            }
            if (g != null) {
                b = true;
            }
            return b;
        }
        return super.onKeyUp(n, keyEvent);
    }
    
    public final void onLayout(final boolean b, int visibility, final int n, int i, final int n2) {
        this.M0 = true;
        final int n3 = i - visibility;
        int childCount;
        View child;
        e e;
        int measuredWidth;
        int measuredHeight;
        float n4;
        int n5;
        float n6;
        float n7;
        boolean b2;
        int n8;
        int n9;
        int n10;
        for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                e = (e)child.getLayoutParams();
                if (this.l(child)) {
                    visibility = e.leftMargin;
                    child.layout(visibility, e.topMargin, child.getMeasuredWidth() + visibility, child.getMeasuredHeight() + e.topMargin);
                }
                else {
                    measuredWidth = child.getMeasuredWidth();
                    measuredHeight = child.getMeasuredHeight();
                    if (this.b(child, 3)) {
                        visibility = -measuredWidth;
                        n4 = (float)measuredWidth;
                        n5 = visibility + (int)(e.b * n4);
                        n6 = (measuredWidth + n5) / n4;
                    }
                    else {
                        n7 = (float)measuredWidth;
                        n5 = n3 - (int)(e.b * n7);
                        n6 = (n3 - n5) / n7;
                    }
                    b2 = (n6 != e.b);
                    visibility = (e.a & 0x70);
                    if (visibility != 16) {
                        if (visibility != 80) {
                            visibility = e.topMargin;
                            child.layout(n5, visibility, measuredWidth + n5, measuredHeight + visibility);
                        }
                        else {
                            visibility = n2 - n;
                            child.layout(n5, visibility - e.bottomMargin - child.getMeasuredHeight(), measuredWidth + n5, visibility - e.bottomMargin);
                        }
                    }
                    else {
                        n8 = n2 - n;
                        n9 = (n8 - measuredHeight) / 2;
                        visibility = e.topMargin;
                        if (n9 >= visibility) {
                            n10 = n8 - e.bottomMargin;
                            visibility = n9;
                            if (n9 + measuredHeight > n10) {
                                visibility = n10 - measuredHeight;
                            }
                        }
                        child.layout(n5, visibility, measuredWidth + n5, measuredHeight + visibility);
                    }
                    if (b2) {
                        this.q(child, n6);
                    }
                    if (e.b > 0.0f) {
                        visibility = 0;
                    }
                    else {
                        visibility = 4;
                    }
                    if (child.getVisibility() != visibility) {
                        child.setVisibility(visibility);
                    }
                }
            }
        }
        if (DrawerLayout.i1) {
            final WindowInsets rootWindowInsets = this.getRootWindowInsets();
            if (rootWindowInsets != null) {
                final fsd k = vox.o(rootWindowInsets, (View)null).a.k();
                final i6x h0 = this.H0;
                h0.o = Math.max(h0.p, k.a);
                final i6x i2 = this.I0;
                i2.o = Math.max(i2.p, k.c);
            }
        }
        this.M0 = false;
        this.N0 = false;
    }
    
    @SuppressLint({ "WrongConstant" })
    public final void onMeasure(final int n, final int n2) {
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        int size = View$MeasureSpec.getSize(n);
        final int size2 = View$MeasureSpec.getSize(n2);
        int n3 = 0;
        int n4 = 0;
        Label_0084: {
            if (mode == 1073741824) {
                n3 = size;
                n4 = size2;
                if (mode2 == 1073741824) {
                    break Label_0084;
                }
            }
            if (!((View)this).isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            n3 = size;
            n4 = size2;
            if (mode2 == 0) {
                n4 = 300;
                n3 = size;
            }
        }
        ((View)this).setMeasuredDimension(n3, n4);
        boolean b = false;
        Label_0120: {
            if (this.Y0 != null) {
                final WeakHashMap a = p5x.a;
                if (p5x$d.b((View)this)) {
                    b = true;
                    break Label_0120;
                }
            }
            b = false;
        }
        final WeakHashMap a2 = p5x.a;
        final int d = p5x$e.d((View)this);
        final int childCount = this.getChildCount();
        int i = 0;
        int n5 = 0;
        int n6 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final e e = (e)child.getLayoutParams();
                if (b) {
                    final int absoluteGravity = Gravity.getAbsoluteGravity(e.a, d);
                    if (p5x$d.b(child)) {
                        final WindowInsets windowInsets = (WindowInsets)this.Y0;
                        WindowInsets windowInsets2;
                        if (absoluteGravity == 3) {
                            windowInsets2 = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        }
                        else {
                            windowInsets2 = windowInsets;
                            if (absoluteGravity == 5) {
                                windowInsets2 = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                        }
                        child.dispatchApplyWindowInsets(windowInsets2);
                    }
                    else {
                        final WindowInsets windowInsets3 = (WindowInsets)this.Y0;
                        WindowInsets windowInsets4;
                        if (absoluteGravity == 3) {
                            windowInsets4 = windowInsets3.replaceSystemWindowInsets(windowInsets3.getSystemWindowInsetLeft(), windowInsets3.getSystemWindowInsetTop(), 0, windowInsets3.getSystemWindowInsetBottom());
                        }
                        else {
                            windowInsets4 = windowInsets3;
                            if (absoluteGravity == 5) {
                                windowInsets4 = windowInsets3.replaceSystemWindowInsets(0, windowInsets3.getSystemWindowInsetTop(), windowInsets3.getSystemWindowInsetRight(), windowInsets3.getSystemWindowInsetBottom());
                            }
                        }
                        e.leftMargin = windowInsets4.getSystemWindowInsetLeft();
                        e.topMargin = windowInsets4.getSystemWindowInsetTop();
                        e.rightMargin = windowInsets4.getSystemWindowInsetRight();
                        e.bottomMargin = windowInsets4.getSystemWindowInsetBottom();
                    }
                }
                if (this.l(child)) {
                    child.measure(View$MeasureSpec.makeMeasureSpec(n3 - e.leftMargin - e.rightMargin, 1073741824), View$MeasureSpec.makeMeasureSpec(n4 - e.topMargin - e.bottomMargin, 1073741824));
                }
                else {
                    if (!this.n(child)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Child ");
                        sb.append(child);
                        sb.append(" at index ");
                        sb.append(i);
                        sb.append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (DrawerLayout.h1) {
                        final float j = p5x$i.i(child);
                        final float d2 = this.D0;
                        if (j != d2) {
                            p5x$i.s(child, d2);
                        }
                    }
                    final int n7 = this.i(child) & 0x7;
                    final boolean b2 = n7 == 3;
                    if ((b2 && n5 != 0) || (!b2 && n6 != 0)) {
                        final StringBuilder g = w48.g("Child drawer has absolute gravity ");
                        g.append(j(n7));
                        g.append(" but this ");
                        g.append("DrawerLayout");
                        g.append(" already has a drawer view along that edge");
                        throw new IllegalStateException(g.toString());
                    }
                    if (b2) {
                        n5 = 1;
                    }
                    else {
                        n6 = 1;
                    }
                    child.measure(ViewGroup.getChildMeasureSpec(n, this.mMinDrawerMargin + e.leftMargin + e.rightMargin, e.width), ViewGroup.getChildMeasureSpec(n2, e.topMargin + e.bottomMargin, e.height));
                }
            }
            ++i;
        }
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final SavedState savedState = (SavedState)parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        final int openDrawerGravity = savedState.openDrawerGravity;
        if (openDrawerGravity != 0) {
            final View e = this.e(openDrawerGravity);
            if (e != null) {
                this.o(e);
            }
        }
        final int lockModeLeft = savedState.lockModeLeft;
        if (lockModeLeft != 3) {
            this.p(lockModeLeft, 3);
        }
        final int lockModeRight = savedState.lockModeRight;
        if (lockModeRight != 3) {
            this.p(lockModeRight, 5);
        }
        final int lockModeStart = savedState.lockModeStart;
        if (lockModeStart != 3) {
            this.p(lockModeStart, 8388611);
        }
        final int lockModeEnd = savedState.lockModeEnd;
        if (lockModeEnd != 3) {
            this.p(lockModeEnd, 8388613);
        }
    }
    
    public final void onRtlPropertiesChanged(final int n) {
        if (!DrawerLayout.h1) {
            final WeakHashMap a = p5x.a;
            p5x$e.d((View)this);
            p5x$e.d((View)this);
        }
    }
    
    public final Parcelable onSaveInstanceState() {
        final SavedState savedState = new SavedState(super.onSaveInstanceState());
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final e e = (e)this.getChildAt(i).getLayoutParams();
            final int d = e.d;
            boolean b = true;
            final boolean b2 = d == 1;
            if (d != 2) {
                b = false;
            }
            if (b2 || b) {
                savedState.openDrawerGravity = e.a;
                break;
            }
        }
        savedState.lockModeLeft = this.O0;
        savedState.lockModeRight = this.P0;
        savedState.lockModeStart = this.Q0;
        savedState.lockModeEnd = this.R0;
        return (Parcelable)savedState;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        this.H0.p(motionEvent);
        this.I0.p(motionEvent);
        final int n = motionEvent.getAction() & 0xFF;
        boolean b = false;
        if (n != 0) {
            if (n != 1) {
                if (n == 3) {
                    this.d(true);
                    this.S0 = false;
                }
            }
            else {
                final float x = motionEvent.getX();
                final float y = motionEvent.getY();
                final View l = this.H0.l((int)x, (int)y);
                Label_0160: {
                    if (l != null && this.l(l)) {
                        final float n2 = x - this.V0;
                        final float n3 = y - this.W0;
                        final int b2 = this.H0.b;
                        if (n3 * n3 + n2 * n2 < b2 * b2) {
                            final View f = this.f();
                            if (f != null && this.h(f) != 2) {
                                break Label_0160;
                            }
                        }
                    }
                    b = true;
                }
                this.d(b);
            }
        }
        else {
            final float x2 = motionEvent.getX();
            final float y2 = motionEvent.getY();
            this.V0 = x2;
            this.W0 = y2;
            this.S0 = false;
        }
        return true;
    }
    
    public final void p(final int n, final int n2) {
        final WeakHashMap a = p5x.a;
        final int absoluteGravity = Gravity.getAbsoluteGravity(n2, p5x$e.d((View)this));
        if (n2 != 3) {
            if (n2 != 5) {
                if (n2 != 8388611) {
                    if (n2 == 8388613) {
                        this.R0 = n;
                    }
                }
                else {
                    this.Q0 = n;
                }
            }
            else {
                this.P0 = n;
            }
        }
        else {
            this.O0 = n;
        }
        if (n != 0) {
            i6x i6x;
            if (absoluteGravity == 3) {
                i6x = this.H0;
            }
            else {
                i6x = this.I0;
            }
            i6x.a();
        }
        if (n != 1) {
            if (n == 2) {
                final View e = this.e(absoluteGravity);
                if (e != null) {
                    this.o(e);
                }
            }
        }
        else {
            final View e2 = this.e(absoluteGravity);
            if (e2 != null) {
                this.c(e2);
            }
        }
    }
    
    public final void q(final View view, final float b) {
        final e e = (e)view.getLayoutParams();
        if (b == e.b) {
            return;
        }
        e.b = b;
        final ArrayList u0 = this.U0;
        if (u0 != null) {
            int size = u0.size();
            while (--size >= 0) {
                ((d)this.U0.get(size)).d(view, b);
            }
        }
    }
    
    public final void r(final View view) {
        final ng$a n = ng$a.n;
        p5x.w(n.a(), view);
        p5x.q(view, 0);
        if (this.m(view) && this.h(view) != 2) {
            p5x.x(view, n, (CharSequence)null, (bh)this.d1);
        }
    }
    
    public void requestDisallowInterceptTouchEvent(final boolean b) {
        super.requestDisallowInterceptTouchEvent(b);
        if (b) {
            this.d(true);
        }
    }
    
    public final void requestLayout() {
        if (!this.M0) {
            super.requestLayout();
        }
    }
    
    public final void s(final View view, final boolean b) {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if ((!b && !this.n(child)) || (b && child == view)) {
                final WeakHashMap a = p5x.a;
                p5x$d.s(child, 1);
            }
            else {
                final WeakHashMap a2 = p5x.a;
                p5x$d.s(child, 4);
            }
        }
    }
    
    public void setDrawerElevation(float d0) {
        this.D0 = d0;
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            if (this.n(child)) {
                d0 = this.D0;
                final WeakHashMap a = p5x.a;
                p5x$i.s(child, d0);
            }
        }
    }
    
    @Deprecated
    public void setDrawerListener(final d t0) {
        final d t2 = this.T0;
        if (t2 != null) {
            final ArrayList u0 = this.U0;
            if (u0 != null) {
                u0.remove(t2);
            }
        }
        if (t0 != null) {
            this.a(t0);
        }
        this.T0 = t0;
    }
    
    public void setDrawerLockMode(final int n) {
        this.p(n, 3);
        this.p(n, 5);
    }
    
    public void setScrimColor(final int e0) {
        this.E0 = e0;
        ((View)this).invalidate();
    }
    
    public void setStatusBarBackground(final int n) {
        Drawable b;
        if (n != 0) {
            final Context context = ((View)this).getContext();
            final Object a = eo6.a;
            b = eo6$c.b(context, n);
        }
        else {
            b = null;
        }
        this.X0 = b;
        ((View)this).invalidate();
    }
    
    public void setStatusBarBackground(final Drawable x0) {
        this.X0 = x0;
        ((View)this).invalidate();
    }
    
    public void setStatusBarBackgroundColor(final int n) {
        this.X0 = (Drawable)new ColorDrawable(n);
        ((View)this).invalidate();
    }
    
    public final void t(int i, View rootView) {
        final int a = this.H0.a;
        final int a2 = this.I0.a;
        final int n = 2;
        int l0;
        if (a != 1 && a2 != 1) {
            l0 = n;
            if (a != 2) {
                if (a2 == 2) {
                    l0 = n;
                }
                else {
                    l0 = 0;
                }
            }
        }
        else {
            l0 = 1;
        }
        if (rootView != null && i == 0) {
            final float b = ((e)rootView.getLayoutParams()).b;
            if (b == 0.0f) {
                final e e = (e)rootView.getLayoutParams();
                if ((e.d & 0x1) == 0x1) {
                    e.d = 0;
                    final ArrayList u0 = this.U0;
                    if (u0 != null) {
                        for (i = u0.size() - 1; i >= 0; --i) {
                            this.U0.get(i).c(rootView);
                        }
                    }
                    this.s(rootView, false);
                    this.r(rootView);
                    if (((View)this).hasWindowFocus()) {
                        rootView = ((View)this).getRootView();
                        if (rootView != null) {
                            rootView.sendAccessibilityEvent(32);
                        }
                    }
                }
            }
            else if (b == 1.0f) {
                final e e2 = (e)rootView.getLayoutParams();
                if ((e2.d & 0x1) == 0x0) {
                    e2.d = 1;
                    final ArrayList u2 = this.U0;
                    if (u2 != null) {
                        for (i = u2.size() - 1; i >= 0; --i) {
                            this.U0.get(i).b(rootView);
                        }
                    }
                    this.s(rootView, true);
                    this.r(rootView);
                    if (((View)this).hasWindowFocus()) {
                        ((View)this).sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (l0 != this.L0) {
            this.L0 = l0;
            final ArrayList u3 = this.U0;
            if (u3 != null) {
                for (i = u3.size() - 1; i >= 0; --i) {
                    this.U0.get(i).a();
                }
            }
        }
    }
    
    public static class SavedState extends fa
    {
        public static final Parcelable$Creator<SavedState> CREATOR;
        public int lockModeEnd;
        public int lockModeLeft;
        public int lockModeRight;
        public int lockModeStart;
        public int openDrawerGravity;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<SavedState>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new SavedState(parcel, null);
                }
                
                public final Object createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }
                
                public final Object[] newArray(final int n) {
                    return new SavedState[n];
                }
            };
        }
        
        public SavedState(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.openDrawerGravity = 0;
            this.openDrawerGravity = parcel.readInt();
            this.lockModeLeft = parcel.readInt();
            this.lockModeRight = parcel.readInt();
            this.lockModeStart = parcel.readInt();
            this.lockModeEnd = parcel.readInt();
        }
        
        public SavedState(final Parcelable parcelable) {
            super(parcelable);
            this.openDrawerGravity = 0;
        }
        
        @Override
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt(this.openDrawerGravity);
            parcel.writeInt(this.lockModeLeft);
            parcel.writeInt(this.lockModeRight);
            parcel.writeInt(this.lockModeStart);
            parcel.writeInt(this.lockModeEnd);
        }
    }
    
    public final class b extends wf
    {
        public final Rect d;
        
        public b() {
            this.d = new Rect();
        }
        
        public final boolean a(View g, final AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                ((AccessibilityRecord)accessibilityEvent).getText();
                g = DrawerLayout.this.g();
                if (g != null) {
                    final int i = DrawerLayout.this.i(g);
                    final DrawerLayout e = DrawerLayout.this;
                    Objects.requireNonNull(e);
                    final WeakHashMap a = p5x.a;
                    Gravity.getAbsoluteGravity(i, p5x$e.d((View)e));
                }
                return true;
            }
            return super.a(g, accessibilityEvent);
        }
        
        public final void c(final View view, final AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            ((AccessibilityRecord)accessibilityEvent).setClassName((CharSequence)"androidx.drawerlayout.widget.DrawerLayout");
        }
        
        public final void d(View child, final ng ng) {
            if (DrawerLayout.g1) {
                super.a.onInitializeAccessibilityNodeInfo(child, ng.a);
            }
            else {
                final AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(ng.a);
                super.a.onInitializeAccessibilityNodeInfo(child, obtain);
                ng.c = -1;
                ng.a.setSource(child);
                final WeakHashMap a = p5x.a;
                final ViewParent f = p5x$d.f(child);
                if (f instanceof View) {
                    ng.T((View)f);
                }
                final Rect d = this.d;
                obtain.getBoundsInScreen(d);
                ng.B(d);
                ng.c0(obtain.isVisibleToUser());
                ng.R(obtain.getPackageName());
                ng.E(obtain.getClassName());
                ng.I(obtain.getContentDescription());
                ng.K(obtain.isEnabled());
                ng.M(obtain.isFocused());
                ng.y(obtain.isAccessibilityFocused());
                ng.a.setSelected(obtain.isSelected());
                ng.a(obtain.getActions());
                obtain.recycle();
                final ViewGroup viewGroup = (ViewGroup)child;
                for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                    child = viewGroup.getChildAt(i);
                    if (DrawerLayout.k(child)) {
                        ng.a.addChild(child);
                    }
                }
            }
            ng.E((CharSequence)"androidx.drawerlayout.widget.DrawerLayout");
            ng.L(false);
            ng.M(false);
            ng.x(ng$a.e);
            ng.x(ng$a.f);
        }
        
        public final boolean f(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
            return (DrawerLayout.g1 || DrawerLayout.k(view)) && super.f(viewGroup, view, accessibilityEvent);
        }
    }
    
    public static final class c extends wf
    {
        public final void d(final View view, final ng ng) {
            super.a.onInitializeAccessibilityNodeInfo(view, ng.a);
            if (!DrawerLayout.k(view)) {
                ng.T((View)null);
            }
        }
    }
    
    public interface d
    {
        void a();
        
        void b(final View p0);
        
        void c(final View p0);
        
        void d(final View p0, final float p1);
    }
    
    public static final class e extends ViewGroup$MarginLayoutParams
    {
        public int a;
        public float b;
        public boolean c;
        public int d;
        
        public e() {
            super(-1, -1);
            this.a = 0;
        }
        
        public e(final Context context, final AttributeSet set) {
            super(context, set);
            this.a = 0;
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, DrawerLayout.f1);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
        
        public e(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.a = 0;
        }
        
        public e(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super(viewGroup$MarginLayoutParams);
            this.a = 0;
        }
        
        public e(final e e) {
            super((ViewGroup$MarginLayoutParams)e);
            this.a = 0;
            this.a = e.a;
        }
    }
    
    public abstract static class f implements d
    {
        @Override
        public final void a() {
        }
        
        @Override
        public void d(final View view, final float n) {
        }
    }
    
    public final class g extends i6x.c
    {
        public final int a;
        public i6x b;
        public final DrawerLayout$g$a c;
        public final /* synthetic */ DrawerLayout d;
        
        public g(final int a) {
            this.c = new Runnable() {
                @Override
                public final void run() {
                    final g c0 = g.this;
                    final int o = c0.b.o;
                    final int a = c0.a;
                    final int n = 0;
                    final boolean b = a == 3;
                    View view;
                    int n3;
                    if (b) {
                        view = c0.d.e(3);
                        int n2;
                        if (view != null) {
                            n2 = -view.getWidth();
                        }
                        else {
                            n2 = 0;
                        }
                        n3 = n2 + o;
                    }
                    else {
                        view = c0.d.e(5);
                        n3 = ((View)c0.d).getWidth() - o;
                    }
                    if (view != null && ((b && view.getLeft() < n3) || (!b && view.getLeft() > n3)) && c0.d.h(view) == 0) {
                        final e e = (e)view.getLayoutParams();
                        c0.b.x(view, n3, view.getTop());
                        e.c = true;
                        ((View)c0.d).invalidate();
                        c0.m();
                        final DrawerLayout d = c0.d;
                        if (!d.S0) {
                            final long uptimeMillis = SystemClock.uptimeMillis();
                            final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                            for (int childCount = d.getChildCount(), i = n; i < childCount; ++i) {
                                d.getChildAt(i).dispatchTouchEvent(obtain);
                            }
                            obtain.recycle();
                            d.S0 = true;
                        }
                    }
                }
            };
            this.a = a;
        }
        
        @Override
        public final int a(final View view, final int n) {
            if (DrawerLayout.this.b(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(n, 0));
            }
            final int width = ((View)DrawerLayout.this).getWidth();
            return Math.max(width - view.getWidth(), Math.min(n, width));
        }
        
        @Override
        public final int b(final View view, final int n, final int n2) {
            return view.getTop();
        }
        
        @Override
        public final int d(final View view) {
            int width;
            if (DrawerLayout.this.n(view)) {
                width = view.getWidth();
            }
            else {
                width = 0;
            }
            return width;
        }
        
        @Override
        public final void f(final int n, final int n2) {
            View view;
            if ((n & 0x1) == 0x1) {
                view = DrawerLayout.this.e(3);
            }
            else {
                view = DrawerLayout.this.e(5);
            }
            if (view != null && DrawerLayout.this.h(view) == 0) {
                this.b.b(view, n2);
            }
        }
        
        @Override
        public final void g() {
            ((View)DrawerLayout.this).postDelayed((Runnable)this.c, 160L);
        }
        
        @Override
        public final void h(final View view, final int n) {
            ((e)view.getLayoutParams()).c = false;
            this.m();
        }
        
        @Override
        public final void i(final int n) {
            DrawerLayout.this.t(n, this.b.t);
        }
        
        @Override
        public final void j(final View view, int visibility, int width, final int n, final int n2) {
            width = view.getWidth();
            float n3;
            if (DrawerLayout.this.b(view, 3)) {
                n3 = (float)(visibility + width);
            }
            else {
                n3 = (float)(((View)DrawerLayout.this).getWidth() - visibility);
            }
            final float n4 = n3 / width;
            DrawerLayout.this.q(view, n4);
            if (n4 == 0.0f) {
                visibility = 4;
            }
            else {
                visibility = 0;
            }
            view.setVisibility(visibility);
            ((View)DrawerLayout.this).invalidate();
        }
        
        @Override
        public final void k(final View view, final float n, float b) {
            Objects.requireNonNull(DrawerLayout.this);
            b = ((e)view.getLayoutParams()).b;
            final int width = view.getWidth();
            int n3 = 0;
            Label_0119: {
                if (DrawerLayout.this.b(view, 3)) {
                    final float n2 = fcmpl(n, 0.0f);
                    if (n2 <= 0 && (n2 != 0 || b <= 0.5f)) {
                        n3 = -width;
                    }
                    else {
                        n3 = 0;
                    }
                }
                else {
                    final int width2 = ((View)DrawerLayout.this).getWidth();
                    if (n >= 0.0f) {
                        n3 = width2;
                        if (n != 0.0f) {
                            break Label_0119;
                        }
                        n3 = width2;
                        if (b <= 0.5f) {
                            break Label_0119;
                        }
                    }
                    n3 = width2 - width;
                }
            }
            this.b.v(n3, view.getTop());
            ((View)DrawerLayout.this).invalidate();
        }
        
        @Override
        public final boolean l(final View view, final int n) {
            return DrawerLayout.this.n(view) && DrawerLayout.this.b(view, this.a) && DrawerLayout.this.h(view) == 0;
        }
        
        public final void m() {
            final int a = this.a;
            int n = 3;
            if (a == 3) {
                n = 5;
            }
            final View e = DrawerLayout.this.e(n);
            if (e != null) {
                DrawerLayout.this.c(e);
            }
        }
        
        public final void n() {
            ((View)DrawerLayout.this).removeCallbacks((Runnable)this.c);
        }
    }
}
