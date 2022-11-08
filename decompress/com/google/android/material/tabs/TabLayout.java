// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.tabs;

import android.graphics.Paint;
import android.text.Layout;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.RippleDrawable;
import android.util.StateSet;
import android.view.View$OnLayoutChangeListener;
import android.widget.FrameLayout;
import android.view.PointerIcon;
import android.widget.ImageView;
import android.view.LayoutInflater;
import android.graphics.ColorFilter;
import android.os.Build$VERSION;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.Objects;
import android.database.DataSetObserver;
import android.animation.Animator$AnimatorListener;
import android.widget.TextView;
import android.annotation.SuppressLint;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo$CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import android.graphics.Canvas;
import android.view.ViewParent;
import java.util.Iterator;
import android.widget.LinearLayout;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.util.Log;
import android.widget.LinearLayout$LayoutParams;
import android.text.TextUtils;
import android.content.res.Resources;
import java.util.WeakHashMap;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.ValueAnimator;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import java.util.ArrayList;
import androidx.viewpager.widget.ViewPager;
import android.widget.HorizontalScrollView;

@ViewPager.d
public class TabLayout extends HorizontalScrollView
{
    public static final uqk<g> t1;
    public final ArrayList<g> C0;
    public g D0;
    public final f E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public ColorStateList K0;
    public ColorStateList L0;
    public ColorStateList M0;
    public Drawable N0;
    public int O0;
    public PorterDuff$Mode P0;
    public float Q0;
    public float R0;
    public final int S0;
    public int T0;
    public final int U0;
    public final int V0;
    public final int W0;
    public int X0;
    public int Y0;
    public int Z0;
    public int a1;
    public int b1;
    public boolean c1;
    public boolean d1;
    public int e1;
    public int f1;
    public boolean g1;
    public a h1;
    public c i1;
    public final ArrayList<c> j1;
    public TabLayout.TabLayout$j k1;
    public ValueAnimator l1;
    public ViewPager m1;
    public cuj n1;
    public e o1;
    public TabLayout.TabLayout$h p1;
    public TabLayout.TabLayout$b q1;
    public boolean r1;
    public final uqk<i> s1;
    
    static {
        TabLayout.t1 = new yqk(16);
    }
    
    public TabLayout(final Context context, final AttributeSet set) {
        this(context, set, 2130970800);
    }
    
    public TabLayout(Context context, final AttributeSet set, int j0) {
        super(ung.a(context, set, j0, 2132019177), set, j0);
        this.C0 = new ArrayList<g>();
        this.N0 = (Drawable)new GradientDrawable();
        this.O0 = 0;
        this.T0 = Integer.MAX_VALUE;
        this.e1 = -1;
        this.j1 = new ArrayList<c>();
        this.s1 = new wqk(12);
        context = ((View)this).getContext();
        ((View)this).setHorizontalScrollBarEnabled(false);
        final f e0 = new f(context);
        super.addView((View)(this.E0 = e0), 0, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -1));
        final TypedArray d = hks.d(context, set, rp2.z1, j0, 2132019177, new int[] { 23 });
        if (((View)this).getBackground() instanceof ColorDrawable) {
            final ColorDrawable colorDrawable = (ColorDrawable)((View)this).getBackground();
            final qng qng = new qng();
            qng.q(ColorStateList.valueOf(colorDrawable.getColor()));
            qng.n(context);
            final WeakHashMap a = p5x.a;
            qng.p(p5x$i.i((View)this));
            p5x$d.q((View)this, (Drawable)qng);
        }
        this.setSelectedTabIndicator(ong.d(context, d, 5));
        this.setSelectedTabIndicatorColor(d.getColor(8, 0));
        e0.b(d.getDimensionPixelSize(11, -1));
        this.setSelectedTabIndicatorGravity(d.getInt(10, 0));
        this.setTabIndicatorAnimationMode(d.getInt(7, 0));
        this.setTabIndicatorFullWidth(d.getBoolean(9, true));
        j0 = d.getDimensionPixelSize(16, 0);
        this.I0 = j0;
        this.H0 = j0;
        this.G0 = j0;
        this.F0 = j0;
        this.F0 = d.getDimensionPixelSize(19, j0);
        this.G0 = d.getDimensionPixelSize(20, this.G0);
        this.H0 = d.getDimensionPixelSize(18, this.H0);
        this.I0 = d.getDimensionPixelSize(17, this.I0);
        j0 = d.getResourceId(23, 2132018486);
        this.J0 = j0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(j0, ck1.c1);
        try {
            this.Q0 = (float)obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.K0 = ong.b(context, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (d.hasValue(24)) {
                this.K0 = ong.b(context, d, 24);
            }
            if (d.hasValue(22)) {
                j0 = d.getColor(22, 0);
                this.K0 = i(this.K0.getDefaultColor(), j0);
            }
            this.L0 = ong.b(context, d, 3);
            this.P0 = sbx.e(d.getInt(4, -1), (PorterDuff$Mode)null);
            this.M0 = ong.b(context, d, 21);
            this.Z0 = d.getInt(6, 300);
            this.U0 = d.getDimensionPixelSize(14, -1);
            this.V0 = d.getDimensionPixelSize(13, -1);
            this.S0 = d.getResourceId(0, 0);
            this.X0 = d.getDimensionPixelSize(1, 0);
            this.b1 = d.getInt(15, 1);
            this.Y0 = d.getInt(2, 0);
            this.c1 = d.getBoolean(12, false);
            this.g1 = d.getBoolean(25, false);
            d.recycle();
            final Resources resources = ((View)this).getResources();
            this.R0 = (float)resources.getDimensionPixelSize(2131165615);
            this.W0 = resources.getDimensionPixelSize(2131165613);
            this.g();
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    private int getDefaultHeight() {
        final int size = this.C0.size();
        final int n = 0;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n;
            if (n2 >= size) {
                break;
            }
            final g g = this.C0.get(n2);
            if (g != null && g.b != null && !TextUtils.isEmpty(g.c)) {
                n3 = 1;
                break;
            }
            ++n2;
        }
        int n4;
        if (n3 != 0 && !this.c1) {
            n4 = 72;
        }
        else {
            n4 = 48;
        }
        return n4;
    }
    
    private int getTabMinWidth() {
        final int u0 = this.U0;
        if (u0 != -1) {
            return u0;
        }
        final int b1 = this.b1;
        int w0;
        if (b1 != 0 && b1 != 2) {
            w0 = 0;
        }
        else {
            w0 = this.W0;
        }
        return w0;
    }
    
    private int getTabScrollRange() {
        return Math.max(0, ((View)this.E0).getWidth() - ((View)this).getWidth() - ((View)this).getPaddingLeft() - ((View)this).getPaddingRight());
    }
    
    public static ColorStateList i(final int n, final int n2) {
        return new ColorStateList(new int[][] { HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET }, new int[] { n2, n });
    }
    
    private void setSelectedTabView(final int n) {
        final int childCount = ((ViewGroup)this.E0).getChildCount();
        if (n < childCount) {
            for (int i = 0; i < childCount; ++i) {
                final View child = ((ViewGroup)this.E0).getChildAt(i);
                final boolean b = true;
                child.setSelected(i == n);
                child.setActivated(i == n && b);
            }
        }
    }
    
    @Deprecated
    public final void a(final c c) {
        if (!this.j1.contains(c)) {
            this.j1.add(c);
        }
    }
    
    public final void addView(final View view) {
        this.e(view);
    }
    
    public final void addView(final View view, final int n) {
        this.e(view);
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.e(view);
    }
    
    public final void addView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.e(view);
    }
    
    public final void b(final g g) {
        this.d(g, this.C0.isEmpty());
    }
    
    public void c(final g g, int e, final boolean b) {
        if (g.g == this) {
            g.e = e;
            this.C0.add(e, g);
            while (++e < this.C0.size()) {
                this.C0.get(e).e = e;
            }
            final i h = g.h;
            h.setSelected(false);
            ((View)h).setActivated(false);
            final f e2 = this.E0;
            e = g.e;
            final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -1);
            this.x(linearLayout$LayoutParams);
            ((ViewGroup)e2).addView((View)h, e, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
            if (b) {
                g.b();
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }
    
    public void d(final g g, final boolean b) {
        this.c(g, this.C0.size(), b);
    }
    
    public final void e(final View view) {
        if (view instanceof TabItem) {
            final TabItem tabItem = (TabItem)view;
            final g m = this.m();
            final CharSequence c0 = tabItem.C0;
            if (c0 != null) {
                m.g(c0);
            }
            final Drawable d0 = tabItem.D0;
            if (d0 != null) {
                m.f(d0);
            }
            final int e0 = tabItem.E0;
            if (e0 != 0) {
                m.d(e0);
            }
            if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
                m.c(tabItem.getContentDescription());
            }
            this.b(m);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }
    
    public final void f(final int n) {
        if (n == -1) {
            return;
        }
        Label_0174: {
            if (((View)this).getWindowToken() != null) {
                final WeakHashMap a = p5x.a;
                if (p5x$g.c((View)this)) {
                    final f e0 = this.E0;
                    final int childCount = ((ViewGroup)e0).getChildCount();
                    int i = 0;
                    while (true) {
                        while (i < childCount) {
                            if (((ViewGroup)e0).getChildAt(i).getWidth() <= 0) {
                                final boolean b = true;
                                if (b) {
                                    break Label_0174;
                                }
                                final int scrollX = ((View)this).getScrollX();
                                final int h = this.h(n, 0.0f);
                                if (scrollX != h) {
                                    this.k();
                                    this.l1.setIntValues(new int[] { scrollX, h });
                                    this.l1.start();
                                }
                                final f e2 = this.E0;
                                final int z0 = this.Z0;
                                final ValueAnimator c0 = e2.C0;
                                if (c0 != null && c0.isRunning()) {
                                    e2.C0.cancel();
                                }
                                e2.d(true, n, z0);
                                return;
                            }
                            else {
                                ++i;
                            }
                        }
                        final boolean b = false;
                        continue;
                    }
                }
            }
        }
        this.u(n, 0.0f, true, true);
    }
    
    public final void g() {
        final int b1 = this.b1;
        int max;
        if (b1 != 0 && b1 != 2) {
            max = 0;
        }
        else {
            max = Math.max(0, this.X0 - this.F0);
        }
        final f e0 = this.E0;
        final WeakHashMap a = p5x.a;
        p5x$e.k((View)e0, max, 0, 0, 0);
        final int b2 = this.b1;
        Label_0157: {
            if (b2 != 0) {
                if (b2 == 1 || b2 == 2) {
                    if (this.Y0 == 2) {
                        Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                    }
                    this.E0.setGravity(1);
                }
            }
            else {
                final int y0 = this.Y0;
                if (y0 != 0) {
                    if (y0 == 1) {
                        this.E0.setGravity(1);
                        break Label_0157;
                    }
                    if (y0 != 2) {
                        break Label_0157;
                    }
                }
                else {
                    Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
                }
                this.E0.setGravity(8388611);
            }
        }
        this.y(true);
    }
    
    public final FrameLayout$LayoutParams generateLayoutParams(final AttributeSet set) {
        return ((FrameLayout)this).generateDefaultLayoutParams();
    }
    
    public int getSelectedTabPosition() {
        final g d0 = this.D0;
        int e;
        if (d0 != null) {
            e = d0.e;
        }
        else {
            e = -1;
        }
        return e;
    }
    
    public int getTabCount() {
        return this.C0.size();
    }
    
    public int getTabGravity() {
        return this.Y0;
    }
    
    public ColorStateList getTabIconTint() {
        return this.L0;
    }
    
    public int getTabIndicatorAnimationMode() {
        return this.f1;
    }
    
    public int getTabIndicatorGravity() {
        return this.a1;
    }
    
    public int getTabMaxWidth() {
        return this.T0;
    }
    
    public int getTabMode() {
        return this.b1;
    }
    
    public ColorStateList getTabRippleColor() {
        return this.M0;
    }
    
    public Drawable getTabSelectedIndicator() {
        return this.N0;
    }
    
    public ColorStateList getTabTextColors() {
        return this.K0;
    }
    
    public final int h(int width, final float n) {
        final int b1 = this.b1;
        final int n2 = 0;
        if (b1 != 0 && b1 != 2) {
            return 0;
        }
        final View child = ((ViewGroup)this.E0).getChildAt(width);
        if (child == null) {
            return 0;
        }
        View child2;
        if (++width < ((ViewGroup)this.E0).getChildCount()) {
            child2 = ((ViewGroup)this.E0).getChildAt(width);
        }
        else {
            child2 = null;
        }
        final int width2 = child.getWidth();
        width = n2;
        if (child2 != null) {
            width = child2.getWidth();
        }
        final int n3 = width2 / 2 + child.getLeft() - ((View)this).getWidth() / 2;
        width = (int)((width2 + width) * 0.5f * n);
        final WeakHashMap a = p5x.a;
        if (p5x$e.d((View)this) == 0) {
            width += n3;
        }
        else {
            width = n3 - width;
        }
        return width;
    }
    
    public g j() {
        g g;
        if ((g = TabLayout.t1.a()) == null) {
            g = new g();
        }
        return g;
    }
    
    public final void k() {
        if (this.l1 == null) {
            (this.l1 = new ValueAnimator()).setInterpolator((TimeInterpolator)kc0.b);
            this.l1.setDuration((long)this.Z0);
            this.l1.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
                public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                    ((View)TabLayout.this).scrollTo((int)valueAnimator.getAnimatedValue(), 0);
                }
            });
        }
    }
    
    public final g l(final int n) {
        g g;
        if (n >= 0 && n < this.getTabCount()) {
            g = this.C0.get(n);
        }
        else {
            g = null;
        }
        return g;
    }
    
    public g m() {
        final g j = this.j();
        j.g = this;
        final wqk s1 = this.s1;
        i i;
        if (s1 != null) {
            i = s1.a();
        }
        else {
            i = null;
        }
        LinearLayout h = i;
        if (i == null) {
            h = new i(((View)this).getContext());
        }
        ((i)h).setTab(j);
        ((View)h).setFocusable(true);
        ((View)h).setMinimumWidth(this.getTabMinWidth());
        if (TextUtils.isEmpty(j.d)) {
            ((View)h).setContentDescription(j.c);
        }
        else {
            ((View)h).setContentDescription(j.d);
        }
        j.h = (i)h;
        final int k = j.i;
        if (k != -1) {
            ((View)h).setId(k);
        }
        return j;
    }
    
    public final void n() {
        this.o();
        final cuj n1 = this.n1;
        if (n1 != null) {
            final int count = n1.getCount();
            for (int i = 0; i < count; ++i) {
                final g m = this.m();
                m.g(this.n1.u(i));
                this.d(m, false);
            }
            final ViewPager m2 = this.m1;
            if (m2 != null && count > 0) {
                final int currentItem = m2.getCurrentItem();
                if (currentItem != this.getSelectedTabPosition() && currentItem < this.getTabCount()) {
                    this.s(this.l(currentItem), true);
                }
            }
        }
    }
    
    public final void o() {
        int childCount = ((ViewGroup)this.E0).getChildCount();
        while (--childCount >= 0) {
            this.r(childCount);
        }
        final Iterator<g> iterator = this.C0.iterator();
        while (iterator.hasNext()) {
            final g g = iterator.next();
            iterator.remove();
            g.a();
            TabLayout.t1.b(g);
        }
        this.D0 = null;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ri4.a0((View)this);
        if (this.m1 == null) {
            final ViewParent parent = ((View)this).getParent();
            if (parent instanceof ViewPager) {
                this.v((ViewPager)parent, true);
            }
        }
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r1) {
            this.setupWithViewPager(null);
            this.r1 = false;
        }
    }
    
    public final void onDraw(final Canvas canvas) {
        for (int i = 0; i < ((ViewGroup)this.E0).getChildCount(); ++i) {
            final View child = ((ViewGroup)this.E0).getChildAt(i);
            if (child instanceof i) {
                final i j = (i)child;
                final Drawable k0 = j.K0;
                if (k0 != null) {
                    k0.setBounds(((View)j).getLeft(), ((View)j).getTop(), ((View)j).getRight(), ((View)j).getBottom());
                    j.K0.draw(canvas);
                }
            }
        }
        super.onDraw(canvas);
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo$CollectionInfo)ng$b.a(1, this.getTabCount(), 1).a);
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int tabMode = this.getTabMode();
        final boolean b = false;
        final boolean b2 = tabMode == 0 || this.getTabMode() == 2;
        boolean b3 = b;
        if (b2) {
            b3 = b;
            if (super.onInterceptTouchEvent(motionEvent)) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public final void onMeasure(int n, int t0) {
        final int round = Math.round(sbx.a(((View)this).getContext(), this.getDefaultHeight()));
        final int mode = View$MeasureSpec.getMode(t0);
        final int n2 = 0;
        int measureSpec;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                measureSpec = t0;
            }
            else {
                t0 = ((View)this).getPaddingTop();
                measureSpec = View$MeasureSpec.makeMeasureSpec(((View)this).getPaddingBottom() + (t0 + round), 1073741824);
            }
        }
        else {
            measureSpec = t0;
            if (((ViewGroup)this).getChildCount() == 1) {
                measureSpec = t0;
                if (View$MeasureSpec.getSize(t0) >= round) {
                    ((ViewGroup)this).getChildAt(0).setMinimumHeight(round);
                    measureSpec = t0;
                }
            }
        }
        final int size = View$MeasureSpec.getSize(n);
        if (View$MeasureSpec.getMode(n) != 0) {
            t0 = this.V0;
            if (t0 <= 0) {
                t0 = (int)(size - sbx.a(((View)this).getContext(), 56));
            }
            this.T0 = t0;
        }
        super.onMeasure(n, measureSpec);
        if (((ViewGroup)this).getChildCount() == 1) {
            final View child = ((ViewGroup)this).getChildAt(0);
            n = this.b1;
            Label_0229: {
                while (true) {
                    Label_0211: {
                        if (n == 0) {
                            break Label_0211;
                        }
                        if (n != 1) {
                            if (n != 2) {
                                n = n2;
                                break Label_0229;
                            }
                            break Label_0211;
                        }
                        else {
                            n = n2;
                            if (child.getMeasuredWidth() == ((View)this).getMeasuredWidth()) {
                                break Label_0229;
                            }
                        }
                        n = 1;
                        break Label_0229;
                    }
                    n = n2;
                    if (child.getMeasuredWidth() < ((View)this).getMeasuredWidth()) {
                        continue;
                    }
                    break;
                }
            }
            if (n != 0) {
                n = ((View)this).getPaddingTop();
                n = ViewGroup.getChildMeasureSpec(measureSpec, ((View)this).getPaddingBottom() + n, child.getLayoutParams().height);
                child.measure(View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredWidth(), 1073741824), n);
            }
        }
    }
    
    @SuppressLint({ "ClickableViewAccessibility" })
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        return (motionEvent.getActionMasked() != 8 || this.getTabMode() == 0 || this.getTabMode() == 2) && super.onTouchEvent(motionEvent);
    }
    
    @Deprecated
    public final void p(final c c) {
        this.j1.remove(c);
    }
    
    public void q(final int n) {
        final g d0 = this.D0;
        int e;
        if (d0 != null) {
            e = d0.e;
        }
        else {
            e = 0;
        }
        this.r(n);
        final g g = this.C0.remove(n);
        if (g != null) {
            g.a();
            TabLayout.t1.b(g);
        }
        for (int size = this.C0.size(), i = n; i < size; ++i) {
            this.C0.get(i).e = i;
        }
        if (e == n) {
            g g2;
            if (this.C0.isEmpty()) {
                g2 = null;
            }
            else {
                g2 = this.C0.get(Math.max(0, n - 1));
            }
            this.s(g2, true);
        }
    }
    
    public final void r(final int n) {
        final i i = (i)((ViewGroup)this.E0).getChildAt(n);
        ((ViewGroup)this.E0).removeViewAt(n);
        if (i != null) {
            i.setTab(null);
            i.setSelected(false);
            this.s1.b(i);
        }
        ((View)this).requestLayout();
    }
    
    public void s(final g d0, final boolean b) {
        final g d2 = this.D0;
        if (d2 == d0) {
            if (d2 != null) {
                for (int i = this.j1.size() - 1; i >= 0; --i) {
                    this.j1.get(i).C2(d0);
                }
                this.f(d0.e);
            }
        }
        else {
            int e;
            if (d0 != null) {
                e = d0.e;
            }
            else {
                e = -1;
            }
            if (b) {
                if ((d2 == null || d2.e == -1) && e != -1) {
                    this.u(e, 0.0f, true, true);
                }
                else {
                    this.f(e);
                }
                if (e != -1) {
                    this.setSelectedTabView(e);
                }
            }
            this.D0 = d0;
            if (d2 != null) {
                for (int j = this.j1.size() - 1; j >= 0; --j) {
                    this.j1.get(j).K1(d2);
                }
            }
            if (d0 != null) {
                for (int k = this.j1.size() - 1; k >= 0; --k) {
                    this.j1.get(k).J0(d0);
                }
            }
        }
    }
    
    public void setElevation(final float elevation) {
        super.setElevation(elevation);
        ri4.Z((View)this, elevation);
    }
    
    public void setInlineLabel(final boolean c1) {
        if (this.c1 != c1) {
            this.c1 = c1;
            for (int i = 0; i < ((ViewGroup)this.E0).getChildCount(); ++i) {
                final View child = ((ViewGroup)this.E0).getChildAt(i);
                if (child instanceof i) {
                    final i j = (i)child;
                    j.setOrientation((int)((j.M0.c1 ^ true) ? 1 : 0));
                    final TextView i2 = j.I0;
                    if (i2 == null && j.J0 == null) {
                        j.i(j.D0, j.E0);
                    }
                    else {
                        j.i(i2, j.J0);
                    }
                }
            }
            this.g();
        }
    }
    
    public void setInlineLabelResource(final int n) {
        this.setInlineLabel(((View)this).getResources().getBoolean(n));
    }
    
    @Deprecated
    public void setOnTabSelectedListener(final c i1) {
        final c i2 = this.i1;
        if (i2 != null) {
            this.p(i2);
        }
        if ((this.i1 = i1) != null) {
            this.a(i1);
        }
    }
    
    @Deprecated
    public void setOnTabSelectedListener(final TabLayout.TabLayout$d onTabSelectedListener) {
        this.setOnTabSelectedListener((c)onTabSelectedListener);
    }
    
    public void setScrollAnimatorListener(final Animator$AnimatorListener animator$AnimatorListener) {
        this.k();
        ((Animator)this.l1).addListener(animator$AnimatorListener);
    }
    
    public void setSelectedTabIndicator(final int n) {
        if (n != 0) {
            this.setSelectedTabIndicator(qli.g(((View)this).getContext(), n));
        }
        else {
            this.setSelectedTabIndicator(null);
        }
    }
    
    public void setSelectedTabIndicator(Drawable n0) {
        if (this.N0 != n0) {
            if (n0 == null) {
                n0 = (Drawable)new GradientDrawable();
            }
            this.N0 = n0;
            int n2 = this.e1;
            if (n2 == -1) {
                n2 = n0.getIntrinsicHeight();
            }
            this.E0.b(n2);
        }
    }
    
    public void setSelectedTabIndicatorColor(final int o0) {
        this.O0 = o0;
        this.y(false);
    }
    
    public void setSelectedTabIndicatorGravity(final int a1) {
        if (this.a1 != a1) {
            this.a1 = a1;
            final f e0 = this.E0;
            final WeakHashMap a2 = p5x.a;
            p5x$d.k((View)e0);
        }
    }
    
    @Deprecated
    public void setSelectedTabIndicatorHeight(final int e1) {
        this.e1 = e1;
        this.E0.b(e1);
    }
    
    public void setTabGravity(final int y0) {
        if (this.Y0 != y0) {
            this.Y0 = y0;
            this.g();
        }
    }
    
    public void setTabIconTint(final ColorStateList l0) {
        if (this.L0 != l0) {
            this.L0 = l0;
            this.w();
        }
    }
    
    public void setTabIconTintResource(final int n) {
        this.setTabIconTint(qli.f(((View)this).getContext(), n));
    }
    
    public void setTabIndicatorAnimationMode(final int f1) {
        this.f1 = f1;
        if (f1 != 0) {
            if (f1 != 1) {
                if (f1 != 2) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(f1);
                    sb.append(" is not a valid TabIndicatorAnimationMode");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.h1 = (a)new ura();
            }
            else {
                this.h1 = (a)new ky9();
            }
        }
        else {
            this.h1 = new a();
        }
    }
    
    public void setTabIndicatorFullWidth(final boolean d1) {
        this.d1 = d1;
        final f e0 = this.E0;
        final int h0 = f.H0;
        e0.a();
        final f e2 = this.E0;
        final WeakHashMap a = p5x.a;
        p5x$d.k((View)e2);
    }
    
    public void setTabMode(final int b1) {
        if (b1 != this.b1) {
            this.b1 = b1;
            this.g();
        }
    }
    
    public void setTabRippleColor(final ColorStateList m0) {
        if (this.M0 != m0) {
            this.M0 = m0;
            for (int i = 0; i < ((ViewGroup)this.E0).getChildCount(); ++i) {
                final View child = ((ViewGroup)this.E0).getChildAt(i);
                if (child instanceof i) {
                    final i j = (i)child;
                    final Context context = ((View)this).getContext();
                    final int n0 = i.N0;
                    j.h(context);
                }
            }
        }
    }
    
    public void setTabRippleColorResource(final int n) {
        this.setTabRippleColor(qli.f(((View)this).getContext(), n));
    }
    
    public void setTabTextColors(final ColorStateList k0) {
        if (this.K0 != k0) {
            this.K0 = k0;
            this.w();
        }
    }
    
    @Deprecated
    public void setTabsFromPagerAdapter(final cuj cuj) {
        this.t(cuj, false);
    }
    
    public void setUnboundedRipple(final boolean g1) {
        if (this.g1 != g1) {
            this.g1 = g1;
            for (int i = 0; i < ((ViewGroup)this.E0).getChildCount(); ++i) {
                final View child = ((ViewGroup)this.E0).getChildAt(i);
                if (child instanceof i) {
                    final i j = (i)child;
                    final Context context = ((View)this).getContext();
                    final int n0 = i.N0;
                    j.h(context);
                }
            }
        }
    }
    
    public void setUnboundedRippleResource(final int n) {
        this.setUnboundedRipple(((View)this).getResources().getBoolean(n));
    }
    
    public void setupWithViewPager(final ViewPager viewPager) {
        this.v(viewPager, false);
    }
    
    public final boolean shouldDelayChildPressedState() {
        return this.getTabScrollRange() > 0;
    }
    
    public final void t(final cuj n1, final boolean b) {
        final cuj n2 = this.n1;
        if (n2 != null) {
            final e o1 = this.o1;
            if (o1 != null) {
                n2.P((DataSetObserver)o1);
            }
        }
        this.n1 = n1;
        if (b && n1 != null) {
            if (this.o1 == null) {
                this.o1 = new e();
            }
            n1.K((DataSetObserver)this.o1);
        }
        this.n();
    }
    
    public final void u(int h, final float e0, final boolean b, final boolean b2) {
        final int round = Math.round(h + e0);
        if (round >= 0) {
            if (round < ((ViewGroup)this.E0).getChildCount()) {
                if (b2) {
                    final f e2 = this.E0;
                    final ValueAnimator c0 = e2.C0;
                    if (c0 != null && c0.isRunning()) {
                        e2.C0.cancel();
                    }
                    e2.D0 = h;
                    e2.E0 = e0;
                    e2.c(((ViewGroup)e2).getChildAt(h), ((ViewGroup)e2).getChildAt(e2.D0 + 1), e2.E0);
                }
                final ValueAnimator l1 = this.l1;
                if (l1 != null && l1.isRunning()) {
                    this.l1.cancel();
                }
                if (h < 0) {
                    h = 0;
                }
                else {
                    h = this.h(h, e0);
                }
                ((View)this).scrollTo(h, 0);
                if (b) {
                    this.setSelectedTabView(round);
                }
            }
        }
    }
    
    public final void v(final ViewPager m1, final boolean r1) {
        final ViewPager m2 = this.m1;
        if (m2 != null) {
            final TabLayout.TabLayout$h p2 = this.p1;
            if (p2 != null) {
                m2.w((ViewPager.i)p2);
            }
            final TabLayout.TabLayout$b q1 = this.q1;
            if (q1 != null) {
                this.m1.v((ViewPager.h)q1);
            }
        }
        final TabLayout.TabLayout$j k1 = this.k1;
        if (k1 != null) {
            this.p((c)k1);
            this.k1 = null;
        }
        if (m1 != null) {
            this.m1 = m1;
            if (this.p1 == null) {
                this.p1 = new TabLayout.TabLayout$h(this);
            }
            final TabLayout.TabLayout$h p3 = this.p1;
            p3.E0 = 0;
            p3.D0 = 0;
            m1.c((ViewPager.i)p3);
            this.a((c)(this.k1 = new TabLayout.TabLayout$j(m1)));
            final cuj adapter = m1.getAdapter();
            if (adapter != null) {
                this.t(adapter, true);
            }
            if (this.q1 == null) {
                this.q1 = new TabLayout.TabLayout$b(this);
            }
            final TabLayout.TabLayout$b q2 = this.q1;
            q2.a = true;
            m1.b((ViewPager.h)q2);
            this.u(m1.getCurrentItem(), 0.0f, true, true);
        }
        else {
            this.m1 = null;
            this.t(null, false);
        }
        this.r1 = r1;
    }
    
    public final void w() {
        for (int size = this.C0.size(), i = 0; i < size; ++i) {
            this.C0.get(i).h();
        }
    }
    
    public final void x(final LinearLayout$LayoutParams linearLayout$LayoutParams) {
        if (this.b1 == 1 && this.Y0 == 0) {
            linearLayout$LayoutParams.width = 0;
            linearLayout$LayoutParams.weight = 1.0f;
        }
        else {
            linearLayout$LayoutParams.width = -2;
            linearLayout$LayoutParams.weight = 0.0f;
        }
    }
    
    public final void y(final boolean b) {
        for (int i = 0; i < ((ViewGroup)this.E0).getChildCount(); ++i) {
            final View child = ((ViewGroup)this.E0).getChildAt(i);
            child.setMinimumWidth(this.getTabMinWidth());
            this.x((LinearLayout$LayoutParams)child.getLayoutParams());
            if (b) {
                child.requestLayout();
            }
        }
    }
    
    @Deprecated
    public interface c<T extends g>
    {
        void C2(final T p0);
        
        void J0(final T p0);
        
        void K1(final T p0);
    }
    
    public final class e extends DataSetObserver
    {
        public final void onChanged() {
            TabLayout.this.n();
        }
        
        public final void onInvalidated() {
            TabLayout.this.n();
        }
    }
    
    public final class f extends LinearLayout
    {
        public static final /* synthetic */ int H0 = 0;
        public ValueAnimator C0;
        public int D0;
        public float E0;
        public int F0;
        
        public f(final Context context) {
            super(context);
            this.D0 = -1;
            this.F0 = -1;
            ((View)this).setWillNotDraw(false);
        }
        
        public final void a() {
            final View child = ((ViewGroup)this).getChildAt(this.D0);
            final TabLayout g0 = TabLayout.this;
            final a h1 = g0.h1;
            final Drawable n0 = g0.N0;
            Objects.requireNonNull(h1);
            final RectF a = com.google.android.material.tabs.a.a(g0, child);
            n0.setBounds((int)a.left, n0.getBounds().top, (int)a.right, n0.getBounds().bottom);
        }
        
        public final void b(final int n) {
            final Rect bounds = TabLayout.this.N0.getBounds();
            TabLayout.this.N0.setBounds(bounds.left, 0, bounds.right, n);
            ((View)this).requestLayout();
        }
        
        public final void c(final View view, final View view2, final float n) {
            if (view != null && view.getWidth() > 0) {
                final TabLayout g0 = TabLayout.this;
                g0.h1.b(g0, view, view2, n, g0.N0);
            }
            else {
                final Drawable n2 = TabLayout.this.N0;
                n2.setBounds(-1, n2.getBounds().top, -1, TabLayout.this.N0.getBounds().bottom);
            }
            final WeakHashMap a = p5x.a;
            p5x$d.k((View)this);
        }
        
        public final void d(final boolean b, final int n, final int n2) {
            final View child = ((ViewGroup)this).getChildAt(this.D0);
            final View child2 = ((ViewGroup)this).getChildAt(n);
            if (child2 == null) {
                this.a();
                return;
            }
            final ValueAnimator$AnimatorUpdateListener valueAnimator$AnimatorUpdateListener = (ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
                public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                    f.this.c(child, child2, valueAnimator.getAnimatedFraction());
                }
            };
            if (b) {
                final ValueAnimator c0 = new ValueAnimator();
                (this.C0 = c0).setInterpolator((TimeInterpolator)kc0.b);
                c0.setDuration((long)n2);
                c0.setFloatValues(new float[] { 0.0f, 1.0f });
                c0.addUpdateListener((ValueAnimator$AnimatorUpdateListener)valueAnimator$AnimatorUpdateListener);
                ((Animator)c0).addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(final Animator animator) {
                        f.this.D0 = n;
                    }
                    
                    public final void onAnimationStart(final Animator animator) {
                        f.this.D0 = n;
                    }
                });
                c0.start();
            }
            else {
                this.C0.removeAllUpdateListeners();
                this.C0.addUpdateListener((ValueAnimator$AnimatorUpdateListener)valueAnimator$AnimatorUpdateListener);
            }
        }
        
        public final void draw(final Canvas canvas) {
            int n;
            if ((n = TabLayout.this.N0.getBounds().height()) < 0) {
                n = TabLayout.this.N0.getIntrinsicHeight();
            }
            final int a1 = TabLayout.this.a1;
            final int n2 = 0;
            int n3;
            if (a1 != 0) {
                if (a1 != 1) {
                    n3 = n2;
                    if (a1 != 2) {
                        if (a1 != 3) {
                            n = 0;
                            n3 = n2;
                        }
                        else {
                            n = ((View)this).getHeight();
                            n3 = n2;
                        }
                    }
                }
                else {
                    n3 = (((View)this).getHeight() - n) / 2;
                    n = (((View)this).getHeight() + n) / 2;
                }
            }
            else {
                n3 = ((View)this).getHeight() - n;
                n = ((View)this).getHeight();
            }
            if (TabLayout.this.N0.getBounds().width() > 0) {
                final Rect bounds = TabLayout.this.N0.getBounds();
                TabLayout.this.N0.setBounds(bounds.left, n3, bounds.right, n);
                final TabLayout g0 = TabLayout.this;
                Drawable drawable = g0.N0;
                if (g0.O0 != 0) {
                    drawable = pd9.e(drawable);
                    if (Build$VERSION.SDK_INT == 21) {
                        drawable.setColorFilter(TabLayout.this.O0, PorterDuff$Mode.SRC_IN);
                    }
                    else {
                        pd9.b.g(drawable, TabLayout.this.O0);
                    }
                }
                else if (Build$VERSION.SDK_INT == 21) {
                    drawable.setColorFilter((ColorFilter)null);
                }
                else {
                    pd9.b.h(drawable, null);
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }
        
        public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
            super.onLayout(b, n, n2, n3, n4);
            final ValueAnimator c0 = this.C0;
            if (c0 != null && c0.isRunning()) {
                this.d(false, this.D0, -1);
            }
            else {
                this.a();
            }
        }
        
        public final void onMeasure(final int n, final int n2) {
            super.onMeasure(n, n2);
            if (View$MeasureSpec.getMode(n) != 1073741824) {
                return;
            }
            final TabLayout g0 = TabLayout.this;
            final int y0 = g0.Y0;
            final int n3 = 1;
            if (y0 == 1 || g0.b1 == 2) {
                final int childCount = ((ViewGroup)this).getChildCount();
                final int n4 = 0;
                int i = 0;
                int width = 0;
                while (i < childCount) {
                    final View child = ((ViewGroup)this).getChildAt(i);
                    int max = width;
                    if (child.getVisibility() == 0) {
                        max = Math.max(width, child.getMeasuredWidth());
                    }
                    ++i;
                    width = max;
                }
                if (width <= 0) {
                    return;
                }
                int n5;
                if (width * childCount <= ((View)this).getMeasuredWidth() - (int)sbx.a(((View)this).getContext(), 16) * 2) {
                    n5 = 0;
                    for (int j = n4; j < childCount; ++j) {
                        final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)((ViewGroup)this).getChildAt(j).getLayoutParams();
                        if (linearLayout$LayoutParams.width != width || linearLayout$LayoutParams.weight != 0.0f) {
                            linearLayout$LayoutParams.width = width;
                            linearLayout$LayoutParams.weight = 0.0f;
                            n5 = 1;
                        }
                    }
                }
                else {
                    final TabLayout g2 = TabLayout.this;
                    g2.Y0 = 0;
                    g2.y(false);
                    n5 = n3;
                }
                if (n5 != 0) {
                    super.onMeasure(n, n2);
                }
            }
        }
        
        public final void onRtlPropertiesChanged(final int f0) {
            super.onRtlPropertiesChanged(f0);
            if (Build$VERSION.SDK_INT < 23 && this.F0 != f0) {
                ((View)this).requestLayout();
                this.F0 = f0;
            }
        }
    }
    
    public static final class g
    {
        public Object a;
        public Drawable b;
        public CharSequence c;
        public CharSequence d;
        public int e;
        public View f;
        public TabLayout g;
        public i h;
        public int i;
        
        public g() {
            this.e = -1;
            this.i = -1;
        }
        
        public final void a() {
            this.g = null;
            this.h = null;
            this.a = null;
            this.b = null;
            this.i = -1;
            this.c = null;
            this.d = null;
            this.e = -1;
            this.f = null;
        }
        
        public final void b() {
            final TabLayout g = this.g;
            if (g != null) {
                g.s(this, true);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        
        public final g c(final CharSequence d) {
            this.d = d;
            this.h();
            return this;
        }
        
        public final g d(final int n) {
            this.f = LayoutInflater.from(((View)this.h).getContext()).inflate(n, (ViewGroup)this.h, false);
            this.h();
            return this;
        }
        
        public final g e(final View f) {
            this.f = f;
            this.h();
            return this;
        }
        
        public final g f(final Drawable b) {
            this.b = b;
            final TabLayout g = this.g;
            if (g.Y0 == 1 || g.b1 == 2) {
                g.y(true);
            }
            this.h();
            return this;
        }
        
        public final g g(final CharSequence charSequence) {
            if (TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(charSequence)) {
                ((View)this.h).setContentDescription(charSequence);
            }
            this.c = charSequence;
            this.h();
            return this;
        }
        
        public final void h() {
            final i h = this.h;
            if (h != null) {
                h.g();
            }
        }
    }
    
    public final class i extends LinearLayout
    {
        public static final /* synthetic */ int N0 = 0;
        public g C0;
        public TextView D0;
        public ImageView E0;
        public View F0;
        public hh1 G0;
        public View H0;
        public TextView I0;
        public ImageView J0;
        public Drawable K0;
        public int L0;
        public final /* synthetic */ TabLayout M0;
        
        public i(final Context context) {
            super(context);
            this.L0 = 2;
            this.h(context);
            final int f0 = TabLayout.this.F0;
            final int g0 = TabLayout.this.G0;
            final int h0 = TabLayout.this.H0;
            final int i0 = TabLayout.this.I0;
            final WeakHashMap a = p5x.a;
            p5x$e.k((View)this, f0, g0, h0, i0);
            this.setGravity(17);
            this.setOrientation((int)((TabLayout.this.c1 ^ true) ? 1 : 0));
            ((View)this).setClickable(true);
            final Context context2 = ((View)this).getContext();
            final int sdk_INT = Build$VERSION.SDK_INT;
            wok wok;
            if (sdk_INT >= 24) {
                wok = new wok(wok$a.b(context2, 1002));
            }
            else {
                wok = new wok((PointerIcon)null);
            }
            if (sdk_INT >= 24) {
                p5x$k.d((View)this, wok.a);
            }
        }
        
        private hh1 getBadge() {
            return this.G0;
        }
        
        private hh1 getOrCreateBadge() {
            if (this.G0 == null) {
                this.G0 = new hh1(((View)this).getContext());
            }
            this.e();
            final hh1 g0 = this.G0;
            if (g0 != null) {
                return g0;
            }
            throw new IllegalStateException("Unable to create badge");
        }
        
        public final void a(final boolean b) {
            ((ViewGroup)this).setClipChildren(b);
            ((ViewGroup)this).setClipToPadding(b);
            final ViewGroup viewGroup = (ViewGroup)((View)this).getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(b);
                viewGroup.setClipToPadding(b);
            }
        }
        
        public final boolean b() {
            return this.G0 != null;
        }
        
        public final void c(final View f0) {
            if (!this.b()) {
                return;
            }
            if (f0 != null) {
                this.a(false);
                oh1.b(this.G0, f0, (FrameLayout)null);
                this.F0 = f0;
            }
        }
        
        public final void d() {
            if (!this.b()) {
                return;
            }
            this.a(true);
            final View f0 = this.F0;
            if (f0 != null) {
                oh1.c(this.G0, f0);
                this.F0 = null;
            }
        }
        
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            final int[] drawableState = ((View)this).getDrawableState();
            final Drawable k0 = this.K0;
            int n = 0;
            if (k0 != null) {
                n = n;
                if (k0.isStateful()) {
                    n = ((false | this.K0.setState(drawableState)) ? 1 : 0);
                }
            }
            if (n != 0) {
                ((View)this).invalidate();
                ((View)TabLayout.this).invalidate();
            }
        }
        
        public final void e() {
            if (!this.b()) {
                return;
            }
            if (this.H0 != null) {
                this.d();
            }
            else {
                final ImageView e0 = this.E0;
                if (e0 != null) {
                    final g c0 = this.C0;
                    if (c0 != null && c0.b != null) {
                        if (this.F0 != e0) {
                            this.d();
                            this.c((View)this.E0);
                            return;
                        }
                        this.f((View)e0);
                        return;
                    }
                }
                if (this.D0 != null) {
                    final g c2 = this.C0;
                    if (c2 != null) {
                        Objects.requireNonNull(c2);
                        final View f0 = this.F0;
                        final TextView d0 = this.D0;
                        if (f0 != d0) {
                            this.d();
                            this.c((View)this.D0);
                            return;
                        }
                        this.f((View)d0);
                        return;
                    }
                }
                this.d();
            }
        }
        
        public final void f(final View view) {
            if (this.b() && view == this.F0) {
                final hh1 g0 = this.G0;
                final Rect bounds = new Rect();
                view.getDrawingRect(bounds);
                ((Drawable)g0).setBounds(bounds);
                g0.k(view, (FrameLayout)null);
            }
        }
        
        public final void g() {
            final g c0 = this.C0;
            View f;
            if (c0 != null) {
                f = c0.f;
            }
            else {
                f = null;
            }
            if (f != null) {
                final ViewParent parent = f.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup)parent).removeView(f);
                    }
                    ((ViewGroup)this).addView(f);
                }
                this.H0 = f;
                final TextView d0 = this.D0;
                if (d0 != null) {
                    ((View)d0).setVisibility(8);
                }
                final ImageView e0 = this.E0;
                if (e0 != null) {
                    e0.setVisibility(8);
                    this.E0.setImageDrawable((Drawable)null);
                }
                final TextView i0 = (TextView)f.findViewById(16908308);
                if ((this.I0 = i0) != null) {
                    this.L0 = hjs$a.b(i0);
                }
                this.J0 = (ImageView)f.findViewById(16908294);
            }
            else {
                final View h0 = this.H0;
                if (h0 != null) {
                    ((ViewGroup)this).removeView(h0);
                    this.H0 = null;
                }
                this.I0 = null;
                this.J0 = null;
            }
            final View h2 = this.H0;
            final boolean b = false;
            if (h2 == null) {
                if (this.E0 == null) {
                    ((ViewGroup)this).addView((View)(this.E0 = (ImageView)LayoutInflater.from(((View)this).getContext()).inflate(2131624268, (ViewGroup)this, false)), 0);
                }
                if (this.D0 == null) {
                    ((ViewGroup)this).addView((View)(this.D0 = (TextView)LayoutInflater.from(((View)this).getContext()).inflate(2131624269, (ViewGroup)this, false)));
                    this.L0 = hjs$a.b(this.D0);
                }
                hjs.f(this.D0, TabLayout.this.J0);
                final ColorStateList k0 = TabLayout.this.K0;
                if (k0 != null) {
                    this.D0.setTextColor(k0);
                }
                this.i(this.D0, this.E0);
                this.e();
                final ImageView e2 = this.E0;
                if (e2 != null) {
                    ((View)e2).addOnLayoutChangeListener((View$OnLayoutChangeListener)new b(this, (View)e2));
                }
                final TextView d2 = this.D0;
                if (d2 != null) {
                    ((View)d2).addOnLayoutChangeListener((View$OnLayoutChangeListener)new b(this, (View)d2));
                }
            }
            else {
                final TextView i2 = this.I0;
                if (i2 != null || this.J0 != null) {
                    this.i(i2, this.J0);
                }
            }
            if (c0 != null && !TextUtils.isEmpty(c0.d)) {
                ((View)this).setContentDescription(c0.d);
            }
            boolean selected = b;
            if (c0 != null) {
                final TabLayout g = c0.g;
                if (g == null) {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                final int selectedTabPosition = g.getSelectedTabPosition();
                final boolean b2 = selectedTabPosition != -1 && selectedTabPosition == c0.e;
                selected = b;
                if (b2) {
                    selected = true;
                }
            }
            this.setSelected(selected);
        }
        
        public int getContentHeight() {
            final TextView d0 = this.D0;
            int i = 0;
            final ImageView e0 = this.E0;
            final View h0 = this.H0;
            int n = 0;
            int n2 = 0;
            int n3 = 0;
            while (i < 3) {
                final View view = (new View[] { (View)d0, (View)e0, h0 })[i];
                int n4 = n;
                int n5 = n2;
                int n6 = n3;
                if (view != null) {
                    n4 = n;
                    n5 = n2;
                    n6 = n3;
                    if (view.getVisibility() == 0) {
                        int n7;
                        if (n3 != 0) {
                            n7 = Math.min(n2, view.getTop());
                        }
                        else {
                            n7 = view.getTop();
                        }
                        int n8;
                        if (n3 != 0) {
                            n8 = Math.max(n, view.getBottom());
                        }
                        else {
                            n8 = view.getBottom();
                        }
                        n6 = 1;
                        n5 = n7;
                        n4 = n8;
                    }
                }
                ++i;
                n = n4;
                n2 = n5;
                n3 = n6;
            }
            return n - n2;
        }
        
        public int getContentWidth() {
            final TextView d0 = this.D0;
            int i = 0;
            final ImageView e0 = this.E0;
            final View h0 = this.H0;
            int n = 0;
            int n2 = 0;
            int n3 = 0;
            while (i < 3) {
                final View view = (new View[] { (View)d0, (View)e0, h0 })[i];
                int n4 = n;
                int n5 = n2;
                int n6 = n3;
                if (view != null) {
                    n4 = n;
                    n5 = n2;
                    n6 = n3;
                    if (view.getVisibility() == 0) {
                        if (n3 != 0) {
                            n5 = Math.min(n2, view.getLeft());
                        }
                        else {
                            n5 = view.getLeft();
                        }
                        int n7;
                        if (n3 != 0) {
                            n7 = Math.max(n, view.getRight());
                        }
                        else {
                            n7 = view.getRight();
                        }
                        n6 = 1;
                        n4 = n7;
                    }
                }
                ++i;
                n = n4;
                n2 = n5;
                n3 = n6;
            }
            return n - n2;
        }
        
        public g getTab() {
            return this.C0;
        }
        
        public final void h(final Context context) {
            final int s0 = TabLayout.this.S0;
            final GradientDrawable gradientDrawable = null;
            if (s0 != 0) {
                final Drawable g = qli.g(context, s0);
                this.K0 = g;
                if (g != null && g.isStateful()) {
                    this.K0.setState(((View)this).getDrawableState());
                }
            }
            else {
                this.K0 = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            Object o = gradientDrawable2;
            if (TabLayout.this.M0 != null) {
                Object o2 = new GradientDrawable();
                ((GradientDrawable)o2).setCornerRadius(1.0E-5f);
                ((GradientDrawable)o2).setColor(-1);
                final ColorStateList m0 = TabLayout.this.M0;
                final ColorStateList list = new ColorStateList(new int[][] { mzm.c, StateSet.NOTHING }, new int[] { mzm.a(m0, mzm.b), mzm.a(m0, mzm.a) });
                final boolean g2 = TabLayout.this.g1;
                if (g2) {
                    gradientDrawable2 = null;
                }
                if (g2) {
                    o2 = gradientDrawable;
                }
                o = new RippleDrawable(list, (Drawable)gradientDrawable2, (Drawable)o2);
            }
            final WeakHashMap a = p5x.a;
            p5x$d.q((View)this, (Drawable)o);
            ((View)TabLayout.this).invalidate();
        }
        
        public final void i(final TextView textView, final ImageView imageView) {
            final g c0 = this.C0;
            final CharSequence charSequence = null;
            Drawable mutate = null;
            Label_0036: {
                if (c0 != null) {
                    final Drawable b = c0.b;
                    if (b != null) {
                        mutate = pd9.e(b).mutate();
                        break Label_0036;
                    }
                }
                mutate = null;
            }
            if (mutate != null) {
                pd9.b.h(mutate, TabLayout.this.L0);
                final PorterDuff$Mode p2 = TabLayout.this.P0;
                if (p2 != null) {
                    pd9.b.i(mutate, p2);
                }
            }
            final g c2 = this.C0;
            CharSequence c3;
            if (c2 != null) {
                c3 = c2.c;
            }
            else {
                c3 = null;
            }
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    ((View)this).setVisibility(0);
                }
                else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable((Drawable)null);
                }
            }
            final boolean b2 = TextUtils.isEmpty(c3) ^ true;
            if (textView != null) {
                if (b2) {
                    textView.setText(c3);
                    Objects.requireNonNull(this.C0);
                    ((View)textView).setVisibility(0);
                    ((View)this).setVisibility(0);
                }
                else {
                    ((View)textView).setVisibility(8);
                    textView.setText((CharSequence)null);
                }
            }
            if (imageView != null) {
                final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)((View)imageView).getLayoutParams();
                int bottomMargin;
                if (b2 && ((View)imageView).getVisibility() == 0) {
                    bottomMargin = (int)sbx.a(((View)this).getContext(), 8);
                }
                else {
                    bottomMargin = 0;
                }
                if (TabLayout.this.c1) {
                    if (bottomMargin != wkg.b(viewGroup$MarginLayoutParams)) {
                        wkg.g(viewGroup$MarginLayoutParams, bottomMargin);
                        viewGroup$MarginLayoutParams.bottomMargin = 0;
                        ((View)imageView).setLayoutParams((ViewGroup$LayoutParams)viewGroup$MarginLayoutParams);
                        ((View)imageView).requestLayout();
                    }
                }
                else if (bottomMargin != viewGroup$MarginLayoutParams.bottomMargin) {
                    viewGroup$MarginLayoutParams.bottomMargin = bottomMargin;
                    wkg.g(viewGroup$MarginLayoutParams, 0);
                    ((View)imageView).setLayoutParams((ViewGroup$LayoutParams)viewGroup$MarginLayoutParams);
                    ((View)imageView).requestLayout();
                }
            }
            final g c4 = this.C0;
            CharSequence d = charSequence;
            if (c4 != null) {
                d = c4.d;
            }
            if (Build$VERSION.SDK_INT > 23) {
                if (!b2) {
                    c3 = d;
                }
                hit.a((View)this, c3);
            }
        }
        
        public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            final hh1 g0 = this.G0;
            if (g0 != null && ((Drawable)g0).isVisible()) {
                final CharSequence contentDescription = ((View)this).getContentDescription();
                final StringBuilder sb = new StringBuilder();
                sb.append((Object)contentDescription);
                sb.append(", ");
                sb.append((Object)this.G0.c());
                accessibilityNodeInfo.setContentDescription((CharSequence)sb.toString());
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo$CollectionItemInfo)ng$c.a(0, 1, this.C0.e, 1, false, ((View)this).isSelected()).a);
            if (((View)this).isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo$AccessibilityAction)ng$a.g.a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", (CharSequence)((View)this).getResources().getString(2131954491));
        }
        
        public final void onMeasure(int maxLines, final int n) {
            final int size = View$MeasureSpec.getSize(maxLines);
            final int mode = View$MeasureSpec.getMode(maxLines);
            final int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            int measureSpec = maxLines;
            Label_0057: {
                if (tabMaxWidth > 0) {
                    if (mode != 0) {
                        measureSpec = maxLines;
                        if (size <= tabMaxWidth) {
                            break Label_0057;
                        }
                    }
                    measureSpec = View$MeasureSpec.makeMeasureSpec(TabLayout.this.T0, Integer.MIN_VALUE);
                }
            }
            super.onMeasure(measureSpec, n);
            if (this.D0 != null) {
                final float q0 = TabLayout.this.Q0;
                final int l0 = this.L0;
                final ImageView e0 = this.E0;
                final boolean b = true;
                float r0;
                if (e0 != null && ((View)e0).getVisibility() == 0) {
                    maxLines = 1;
                    r0 = q0;
                }
                else {
                    final TextView d0 = this.D0;
                    r0 = q0;
                    maxLines = l0;
                    if (d0 != null) {
                        r0 = q0;
                        maxLines = l0;
                        if (d0.getLineCount() > 1) {
                            r0 = TabLayout.this.R0;
                            maxLines = l0;
                        }
                    }
                }
                final float textSize = this.D0.getTextSize();
                final int lineCount = this.D0.getLineCount();
                final int b2 = hjs$a.b(this.D0);
                final float n2 = fcmpl(r0, textSize);
                if (n2 != 0 || (b2 >= 0 && maxLines != b2)) {
                    int n3 = b ? 1 : 0;
                    Label_0304: {
                        if (TabLayout.this.b1 == 1) {
                            n3 = (b ? 1 : 0);
                            if (n2 > 0) {
                                n3 = (b ? 1 : 0);
                                if (lineCount == 1) {
                                    final Layout layout = this.D0.getLayout();
                                    if (layout != null) {
                                        final float lineWidth = layout.getLineWidth(0);
                                        n3 = (b ? 1 : 0);
                                        if (r0 / ((Paint)layout.getPaint()).getTextSize() * lineWidth <= ((View)this).getMeasuredWidth() - ((View)this).getPaddingLeft() - ((View)this).getPaddingRight()) {
                                            break Label_0304;
                                        }
                                    }
                                    n3 = 0;
                                }
                            }
                        }
                    }
                    if (n3 != 0) {
                        this.D0.setTextSize(0, r0);
                        this.D0.setMaxLines(maxLines);
                        super.onMeasure(measureSpec, n);
                    }
                }
            }
        }
        
        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.C0 != null) {
                if (!performClick) {
                    ((View)this).playSoundEffect(0);
                }
                this.C0.b();
                performClick = true;
            }
            return performClick;
        }
        
        public void setSelected(final boolean b) {
            if (((View)this).isSelected() != b) {}
            super.setSelected(b);
            final TextView d0 = this.D0;
            if (d0 != null) {
                d0.setSelected(b);
            }
            final ImageView e0 = this.E0;
            if (e0 != null) {
                e0.setSelected(b);
            }
            final View h0 = this.H0;
            if (h0 != null) {
                h0.setSelected(b);
            }
        }
        
        public void setTab(final g c0) {
            if (c0 != this.C0) {
                this.C0 = c0;
                this.g();
            }
        }
    }
}
