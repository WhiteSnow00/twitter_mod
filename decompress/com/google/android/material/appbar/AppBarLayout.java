// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;
import android.widget.ScrollView;
import android.widget.ListView;
import android.view.animation.Interpolator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$Callback;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import java.util.WeakHashMap;
import android.os.Parcelable;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.animation.AnimatorInflater;
import android.view.ViewOutlineProvider;
import android.os.Build$VERSION;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.widget.LinearLayout;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b
{
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public boolean G0;
    public int H0;
    public vox I0;
    public List<AppBarLayout$BaseOnOffsetChangedListener> J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public int O0;
    public WeakReference<View> P0;
    public ValueAnimator Q0;
    public final List<AppBarLayout.AppBarLayout$d> R0;
    public int[] S0;
    public Drawable T0;
    public AppBarLayout.AppBarLayout$Behavior U0;
    
    public AppBarLayout(Context context, final AttributeSet set) {
        super(ung.a(context, set, 2130968684, 2132019169), set, 2130968684);
        this.D0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.H0 = 0;
        this.R0 = new ArrayList();
        context = ((View)this).getContext();
        this.setOrientation(1);
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (((View)this).getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            ((View)this).setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        final Context context2 = ((View)this).getContext();
        Object o = hks.d(context2, set, ccx.a, 2130968684, 2132019169, new int[0]);
        try {
            if (((TypedArray)o).hasValue(0)) {
                ((View)this).setStateListAnimator(AnimatorInflater.loadStateListAnimator(context2, ((TypedArray)o).getResourceId(0, 0)));
            }
            ((TypedArray)o).recycle();
            final TypedArray d = hks.d(context, set, rp2.M0, 2130968684, 2132019169, new int[0]);
            final Drawable drawable = d.getDrawable(0);
            o = p5x.a;
            p5x$d.q((View)this, drawable);
            if (((View)this).getBackground() instanceof ColorDrawable) {
                final ColorDrawable colorDrawable = (ColorDrawable)((View)this).getBackground();
                o = new qng();
                ((qng)o).q(ColorStateList.valueOf(colorDrawable.getColor()));
                ((qng)o).n(context);
                p5x$d.q((View)this, (Drawable)o);
            }
            if (d.hasValue(4)) {
                this.f(d.getBoolean(4, false), false, false);
            }
            if (d.hasValue(3)) {
                ccx.a((View)this, (float)d.getDimensionPixelSize(3, 0));
            }
            if (sdk_INT >= 26) {
                if (d.hasValue(2)) {
                    this.setKeyboardNavigationCluster(d.getBoolean(2, false));
                }
                if (d.hasValue(1)) {
                    ((ViewGroup)this).setTouchscreenBlocksFocus(d.getBoolean(1, false));
                }
            }
            this.N0 = d.getBoolean(5, false);
            this.O0 = d.getResourceId(6, -1);
            this.setStatusBarForeground(d.getDrawable(7));
            d.recycle();
            p5x$i.u((View)this, (ogj)new pj0(this));
        }
        finally {
            ((TypedArray)o).recycle();
        }
    }
    
    public final void a(final OnOffsetChangedListener onOffsetChangedListener) {
        if (this.J0 == null) {
            this.J0 = new ArrayList();
        }
        if (onOffsetChangedListener != null && !this.J0.contains(onOffsetChangedListener)) {
            this.J0.add(onOffsetChangedListener);
        }
    }
    
    public final AppBarLayout$c b(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof LinearLayout$LayoutParams) {
            return new AppBarLayout$c((LinearLayout$LayoutParams)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return new AppBarLayout$c((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return new AppBarLayout$c(viewGroup$LayoutParams);
    }
    
    public final void c() {
        final AppBarLayout.AppBarLayout$Behavior u0 = this.U0;
        fa l;
        if (u0 != null && this.D0 != -1 && this.H0 == 0) {
            l = ((BaseBehavior<AppBarLayout>)u0).L((Parcelable)fa.EMPTY_STATE, this);
        }
        else {
            l = null;
        }
        this.D0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        if (l != null) {
            final AppBarLayout.AppBarLayout$Behavior u2 = this.U0;
            if (((BaseBehavior)u2).m == null) {
                ((BaseBehavior)u2).m = (SavedState)l;
            }
        }
    }
    
    public final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof AppBarLayout$c;
    }
    
    public final void d(final int c0) {
        this.C0 = c0;
        if (!((View)this).willNotDraw()) {
            final WeakHashMap a = p5x.a;
            p5x$d.k((View)this);
        }
        final ArrayList j0 = this.J0;
        if (j0 != null) {
            for (int i = 0; i < j0.size(); ++i) {
                final AppBarLayout$BaseOnOffsetChangedListener appBarLayout$BaseOnOffsetChangedListener = this.J0.get(i);
                if (appBarLayout$BaseOnOffsetChangedListener != null) {
                    appBarLayout$BaseOnOffsetChangedListener.onOffsetChanged(this, c0);
                }
            }
        }
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        if (this.T0 != null && this.getTopInset() > 0) {
            final int save = canvas.save();
            canvas.translate(0.0f, (float)(-this.C0));
            this.T0.draw(canvas);
            canvas.restoreToCount(save);
        }
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = ((View)this).getDrawableState();
        final Drawable t0 = this.T0;
        if (t0 != null && t0.isStateful() && t0.setState(drawableState)) {
            ((View)this).invalidateDrawable(t0);
        }
    }
    
    public final void e(final OnOffsetChangedListener onOffsetChangedListener) {
        final ArrayList j0 = this.J0;
        if (j0 != null && onOffsetChangedListener != null) {
            j0.remove(onOffsetChangedListener);
        }
    }
    
    public final void f(final boolean b, final boolean b2, final boolean b3) {
        int n;
        if (b) {
            n = 1;
        }
        else {
            n = 2;
        }
        int n2 = 0;
        int n3;
        if (b2) {
            n3 = 4;
        }
        else {
            n3 = 0;
        }
        if (b3) {
            n2 = 8;
        }
        this.H0 = (n | n3 | n2);
        ((View)this).requestLayout();
    }
    
    public final boolean g(final boolean m0) {
        final boolean k0 = this.K0;
        final boolean b = true;
        boolean b2;
        if ((k0 ^ true) && this.M0 != m0) {
            this.M0 = m0;
            ((View)this).refreshDrawableState();
            b2 = b;
            if (this.N0) {
                b2 = b;
                if (((View)this).getBackground() instanceof qng) {
                    final qng qng = (qng)((View)this).getBackground();
                    float dimension = ((View)this).getResources().getDimension(2131165569);
                    float n;
                    if (m0) {
                        n = 0.0f;
                    }
                    else {
                        n = dimension;
                    }
                    if (!m0) {
                        dimension = 0.0f;
                    }
                    final ValueAnimator q0 = this.Q0;
                    if (q0 != null) {
                        q0.cancel();
                    }
                    (this.Q0 = ValueAnimator.ofFloat(new float[] { n, dimension })).setDuration((long)((View)this).getResources().getInteger(2131492870));
                    this.Q0.setInterpolator((TimeInterpolator)kc0.a);
                    this.Q0.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new a(this, qng));
                    this.Q0.start();
                    b2 = b;
                }
            }
        }
        else {
            b2 = false;
        }
        return b2;
    }
    
    public final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new AppBarLayout$c();
    }
    
    public final LinearLayout$LayoutParams generateDefaultLayoutParams() {
        return (LinearLayout$LayoutParams)new AppBarLayout$c();
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new AppBarLayout$c(((View)this).getContext(), set);
    }
    
    public final LinearLayout$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (LinearLayout$LayoutParams)new AppBarLayout$c(((View)this).getContext(), set);
    }
    
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        return (CoordinatorLayout.c<AppBarLayout>)(this.U0 = new AppBarLayout.AppBarLayout$Behavior());
    }
    
    public int getDownNestedPreScrollRange() {
        final int e0 = this.E0;
        if (e0 != -1) {
            return e0;
        }
        int i = ((ViewGroup)this).getChildCount() - 1;
        int n = 0;
        while (i >= 0) {
            final View child = ((ViewGroup)this).getChildAt(i);
            final AppBarLayout$c appBarLayout$c = (AppBarLayout$c)child.getLayoutParams();
            final int measuredHeight = child.getMeasuredHeight();
            final int a = appBarLayout$c.a;
            int n4;
            if ((a & 0x5) == 0x5) {
                final int n2 = ((LinearLayout$LayoutParams)appBarLayout$c).topMargin + ((LinearLayout$LayoutParams)appBarLayout$c).bottomMargin;
                int n3 = 0;
                Label_0130: {
                    int d;
                    if ((a & 0x8) != 0x0) {
                        final WeakHashMap a2 = p5x.a;
                        d = p5x$d.d(child);
                    }
                    else {
                        if ((a & 0x2) == 0x0) {
                            n3 = n2 + measuredHeight;
                            break Label_0130;
                        }
                        final WeakHashMap a3 = p5x.a;
                        d = measuredHeight - p5x$d.d(child);
                    }
                    n3 = d + n2;
                }
                int min = n3;
                if (i == 0) {
                    final WeakHashMap a4 = p5x.a;
                    min = n3;
                    if (p5x$d.b(child)) {
                        min = Math.min(n3, measuredHeight - this.getTopInset());
                    }
                }
                n4 = n + min;
            }
            else if ((n4 = n) > 0) {
                break;
            }
            --i;
            n = n4;
        }
        return this.E0 = Math.max(0, n);
    }
    
    public int getDownNestedScrollRange() {
        final int f0 = this.F0;
        if (f0 != -1) {
            return f0;
        }
        final int childCount = ((ViewGroup)this).getChildCount();
        int n = 0;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n2;
            if (n >= childCount) {
                break;
            }
            final View child = ((ViewGroup)this).getChildAt(n);
            final AppBarLayout$c appBarLayout$c = (AppBarLayout$c)child.getLayoutParams();
            final int measuredHeight = child.getMeasuredHeight();
            final int topMargin = ((LinearLayout$LayoutParams)appBarLayout$c).topMargin;
            final int bottomMargin = ((LinearLayout$LayoutParams)appBarLayout$c).bottomMargin;
            final int a = appBarLayout$c.a;
            n3 = n2;
            if ((a & 0x1) == 0x0) {
                break;
            }
            n2 += topMargin + bottomMargin + measuredHeight;
            if ((a & 0x2) != 0x0) {
                final WeakHashMap a2 = p5x.a;
                n3 = n2 - p5x$d.d(child);
                break;
            }
            ++n;
        }
        return this.F0 = Math.max(0, n3);
    }
    
    public int getLiftOnScrollTargetViewId() {
        return this.O0;
    }
    
    public final int getMinimumHeightForVisibleOverlappingContent() {
        final int topInset = this.getTopInset();
        final WeakHashMap a = p5x.a;
        int n = p5x$d.d((View)this);
        if (n == 0) {
            final int childCount = ((ViewGroup)this).getChildCount();
            if (childCount >= 1) {
                n = p5x$d.d(((ViewGroup)this).getChildAt(childCount - 1));
            }
            else {
                n = 0;
            }
            if (n == 0) {
                return ((View)this).getHeight() / 3;
            }
        }
        return n * 2 + topInset;
    }
    
    public int getPendingAction() {
        return this.H0;
    }
    
    public Drawable getStatusBarForeground() {
        return this.T0;
    }
    
    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }
    
    public final int getTopInset() {
        final vox i0 = this.I0;
        int j;
        if (i0 != null) {
            j = i0.i();
        }
        else {
            j = 0;
        }
        return j;
    }
    
    public final int getTotalScrollRange() {
        final int d0 = this.D0;
        if (d0 != -1) {
            return d0;
        }
        final int childCount = ((ViewGroup)this).getChildCount();
        int n = 0;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n2;
            if (n >= childCount) {
                break;
            }
            final View child = ((ViewGroup)this).getChildAt(n);
            final AppBarLayout$c appBarLayout$c = (AppBarLayout$c)child.getLayoutParams();
            final int measuredHeight = child.getMeasuredHeight();
            final int a = appBarLayout$c.a;
            n3 = n2;
            if ((a & 0x1) == 0x0) {
                break;
            }
            final int n4 = n2 += measuredHeight + ((LinearLayout$LayoutParams)appBarLayout$c).topMargin + ((LinearLayout$LayoutParams)appBarLayout$c).bottomMargin;
            if (n == 0) {
                final WeakHashMap a2 = p5x.a;
                n2 = n4;
                if (p5x$d.b(child)) {
                    n2 = n4 - this.getTopInset();
                }
            }
            if ((a & 0x2) != 0x0) {
                final WeakHashMap a3 = p5x.a;
                n3 = n2 - p5x$d.d(child);
                break;
            }
            ++n;
        }
        return this.D0 = Math.max(0, n3);
    }
    
    public int getUpNestedPreScrollRange() {
        return this.getTotalScrollRange();
    }
    
    public final boolean h(View view) {
        final WeakReference<View> p = this.P0;
        final View view2 = null;
        if (p == null) {
            final int o0 = this.O0;
            if (o0 != -1) {
                View viewById;
                if (view != null) {
                    viewById = view.findViewById(o0);
                }
                else {
                    viewById = null;
                }
                View viewById2 = viewById;
                if (viewById == null) {
                    viewById2 = viewById;
                    if (((View)this).getParent() instanceof ViewGroup) {
                        viewById2 = ((View)((View)this).getParent()).findViewById(this.O0);
                    }
                }
                if (viewById2 != null) {
                    this.P0 = new WeakReference<View>(viewById2);
                }
            }
        }
        final WeakReference<View> p2 = this.P0;
        View view3 = view2;
        if (p2 != null) {
            view3 = p2.get();
        }
        if (view3 != null) {
            view = view3;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }
    
    public final boolean i() {
        final int childCount = ((ViewGroup)this).getChildCount();
        boolean b2;
        final boolean b = b2 = false;
        if (childCount > 0) {
            final View child = ((ViewGroup)this).getChildAt(0);
            b2 = b;
            if (child.getVisibility() != 8) {
                final WeakHashMap a = p5x.a;
                b2 = b;
                if (!p5x$d.b(child)) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ri4.a0((View)this);
    }
    
    public final int[] onCreateDrawableState(int n) {
        if (this.S0 == null) {
            this.S0 = new int[4];
        }
        final int[] s0 = this.S0;
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + s0.length);
        final boolean l0 = this.L0;
        if (l0) {
            n = 2130970707;
        }
        else {
            n = -2130970707;
        }
        s0[0] = n;
        if (l0 && this.M0) {
            n = 2130970708;
        }
        else {
            n = -2130970708;
        }
        s0[1] = n;
        if (l0) {
            n = 2130970700;
        }
        else {
            n = -2130970700;
        }
        s0[2] = n;
        if (l0 && this.M0) {
            n = 2130970699;
        }
        else {
            n = -2130970699;
        }
        s0[3] = n;
        return View.mergeDrawableStates(onCreateDrawableState, s0);
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final WeakReference<View> p0 = this.P0;
        if (p0 != null) {
            p0.clear();
        }
        this.P0 = null;
    }
    
    public final void onLayout(final boolean b, int i, int n, int childCount, final int n2) {
        super.onLayout(b, i, n, childCount, n2);
        final WeakHashMap a = p5x.a;
        final boolean b2 = p5x$d.b((View)this);
        final boolean b3 = true;
        if (b2 && this.i()) {
            n = this.getTopInset();
            for (i = ((ViewGroup)this).getChildCount() - 1; i >= 0; --i) {
                p5x.s(((ViewGroup)this).getChildAt(i), n);
            }
        }
        this.c();
        this.G0 = false;
        for (n = ((ViewGroup)this).getChildCount(), i = 0; i < n; ++i) {
            if (((AppBarLayout$c)((ViewGroup)this).getChildAt(i).getLayoutParams()).c != null) {
                this.G0 = true;
                break;
            }
        }
        final Drawable t0 = this.T0;
        if (t0 != null) {
            t0.setBounds(0, 0, ((View)this).getWidth(), this.getTopInset());
        }
        if (!this.K0) {
            boolean l0 = b3;
            Label_0240: {
                if (!this.N0) {
                    while (true) {
                        for (childCount = ((ViewGroup)this).getChildCount(), i = 0; i < childCount; ++i) {
                            n = ((AppBarLayout$c)((ViewGroup)this).getChildAt(i).getLayoutParams()).a;
                            if ((n & 0x1) == 0x1 && (n & 0xA) != 0x0) {
                                n = 1;
                            }
                            else {
                                n = 0;
                            }
                            if (n != 0) {
                                i = 1;
                                l0 = (i != 0 && b3);
                                break Label_0240;
                            }
                        }
                        i = 0;
                        continue;
                    }
                }
            }
            if (this.L0 != l0) {
                this.L0 = l0;
                ((View)this).refreshDrawableState();
            }
        }
    }
    
    public final void onMeasure(int n, final int n2) {
        super.onMeasure(n, n2);
        final int mode = View$MeasureSpec.getMode(n2);
        if (mode != 1073741824) {
            final WeakHashMap a = p5x.a;
            if (p5x$d.b((View)this) && this.i()) {
                n = ((View)this).getMeasuredHeight();
                if (mode != Integer.MIN_VALUE) {
                    if (mode == 0) {
                        n += this.getTopInset();
                    }
                }
                else {
                    n = ((View)this).getMeasuredHeight();
                    n = fk7.q(this.getTopInset() + n, 0, View$MeasureSpec.getSize(n2));
                }
                ((View)this).setMeasuredDimension(((View)this).getMeasuredWidth(), n);
            }
        }
        this.c();
    }
    
    public void setElevation(final float elevation) {
        super.setElevation(elevation);
        ri4.Z((View)this, elevation);
    }
    
    public void setExpanded(final boolean b) {
        final WeakHashMap a = p5x.a;
        this.f(b, p5x$g.c((View)this), true);
    }
    
    public void setLiftOnScroll(final boolean n0) {
        this.N0 = n0;
    }
    
    public void setLiftOnScrollTargetViewId(final int o0) {
        this.O0 = o0;
        final WeakReference<View> p = this.P0;
        if (p != null) {
            p.clear();
        }
        this.P0 = null;
    }
    
    public void setLiftableOverrideEnabled(final boolean k0) {
        this.K0 = k0;
    }
    
    public void setOrientation(final int orientation) {
        if (orientation == 1) {
            super.setOrientation(orientation);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }
    
    public void setStatusBarForeground(Drawable drawable) {
        final Drawable t0 = this.T0;
        if (t0 != drawable) {
            Drawable mutate = null;
            if (t0 != null) {
                t0.setCallback((Drawable$Callback)null);
            }
            if (drawable != null) {
                mutate = drawable.mutate();
            }
            this.T0 = mutate;
            final int n = 0;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.T0.setState(((View)this).getDrawableState());
                }
                drawable = this.T0;
                final WeakHashMap a = p5x.a;
                pd9.c(drawable, p5x$e.d((View)this));
                drawable = this.T0;
                drawable.setVisible(((View)this).getVisibility() == 0, false);
                this.T0.setCallback((Drawable$Callback)this);
            }
            int n2 = n;
            if (this.T0 != null) {
                n2 = n;
                if (this.getTopInset() > 0) {
                    n2 = 1;
                }
            }
            ((View)this).setWillNotDraw((boolean)((n2 ^ 0x1) != 0x0));
            final WeakHashMap a2 = p5x.a;
            p5x$d.k((View)this);
        }
    }
    
    public void setStatusBarForegroundColor(final int n) {
        this.setStatusBarForeground((Drawable)new ColorDrawable(n));
    }
    
    public void setStatusBarForegroundResource(final int n) {
        this.setStatusBarForeground(qli.g(((View)this).getContext(), n));
    }
    
    @Deprecated
    public void setTargetElevation(final float n) {
        ccx.a((View)this, n);
    }
    
    public void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        final boolean b = visibility == 0;
        final Drawable t0 = this.T0;
        if (t0 != null) {
            t0.setVisible(b, false);
        }
    }
    
    public final boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.T0;
    }
    
    public static class BaseBehavior<T extends AppBarLayout> extends eic<T>
    {
        public int j;
        public int k;
        public ValueAnimator l;
        public SavedState m;
        public WeakReference<View> n;
        public boolean o;
        
        public BaseBehavior() {
        }
        
        public BaseBehavior(final Context context, final AttributeSet set) {
            super(context, set);
        }
        
        public static boolean F(final int n, final int n2) {
            return (n & n2) == n2;
        }
        
        public final void A(final CoordinatorLayout coordinatorLayout, final View view) {
            final AppBarLayout appBarLayout = (AppBarLayout)view;
            this.M(coordinatorLayout, (T)appBarLayout);
            if (appBarLayout.N0) {
                appBarLayout.g(appBarLayout.h(this.G(coordinatorLayout)));
            }
        }
        
        public final int D(final CoordinatorLayout coordinatorLayout, final View view, int i, int n, int q) {
            final AppBarLayout appBarLayout = (AppBarLayout)view;
            final int z = this.z();
            final int n2 = 0;
            if (n != 0 && z >= n && z <= q) {
                q = fk7.q(i, n, q);
                i = n2;
                if (z != q) {
                    Label_0286: {
                        if (appBarLayout.G0) {
                            final int abs = Math.abs(q);
                            n = ((ViewGroup)appBarLayout).getChildCount();
                            i = 0;
                            while (i < n) {
                                final View child = ((ViewGroup)appBarLayout).getChildAt(i);
                                final AppBarLayout$c appBarLayout$c = (AppBarLayout$c)child.getLayoutParams();
                                final Interpolator c = appBarLayout$c.c;
                                if (abs >= child.getTop() && abs <= child.getBottom()) {
                                    if (c == null) {
                                        break;
                                    }
                                    final int a = appBarLayout$c.a;
                                    if ((a & 0x1) != 0x0) {
                                        n = (i = child.getHeight() + ((LinearLayout$LayoutParams)appBarLayout$c).topMargin + ((LinearLayout$LayoutParams)appBarLayout$c).bottomMargin + 0);
                                        if ((a & 0x2) != 0x0) {
                                            final WeakHashMap a2 = p5x.a;
                                            i = n - p5x$d.d(child);
                                        }
                                    }
                                    else {
                                        i = 0;
                                    }
                                    final WeakHashMap a3 = p5x.a;
                                    n = i;
                                    if (p5x$d.b(child)) {
                                        n = i - appBarLayout.getTopInset();
                                    }
                                    if (n > 0) {
                                        i = child.getTop();
                                        final float n3 = (float)n;
                                        i = Math.round(((TimeInterpolator)c).getInterpolation((abs - i) / n3) * n3);
                                        n = Integer.signum(q);
                                        i = (child.getTop() + i) * n;
                                        break Label_0286;
                                    }
                                    break;
                                }
                                else {
                                    ++i;
                                }
                            }
                        }
                        i = q;
                    }
                    final boolean v = ((j9x)this).v(i);
                    this.j = q - i;
                    if (v) {
                        AppBarLayout$c appBarLayout$c2;
                        AppBarLayout$a b;
                        View child2;
                        float n4;
                        b b2;
                        Rect a4;
                        float n5;
                        float p5;
                        float n6;
                        float n7;
                        float translationY;
                        Rect b3;
                        WeakHashMap a5;
                        WeakHashMap a6;
                        for (i = 0; i < ((ViewGroup)appBarLayout).getChildCount(); ++i) {
                            appBarLayout$c2 = (AppBarLayout$c)((ViewGroup)appBarLayout).getChildAt(i).getLayoutParams();
                            b = appBarLayout$c2.b;
                            if (b != null && (appBarLayout$c2.a & 0x1) != 0x0) {
                                child2 = ((ViewGroup)appBarLayout).getChildAt(i);
                                n4 = (float)((j9x)this).t();
                                b2 = (b)b;
                                a4 = b2.a;
                                child2.getDrawingRect(a4);
                                ((ViewGroup)appBarLayout).offsetDescendantRectToMyCoords(child2, a4);
                                a4.offset(0, -appBarLayout.getTopInset());
                                n5 = b2.a.top - Math.abs(n4);
                                if (n5 <= 0.0f) {
                                    p5 = fk7.p(Math.abs(n5 / b2.a.height()), 0.0f, 1.0f);
                                    n6 = -n5;
                                    n7 = 1.0f - p5;
                                    translationY = n6 - b2.a.height() * 0.3f * (1.0f - n7 * n7);
                                    child2.setTranslationY(translationY);
                                    child2.getDrawingRect(b2.b);
                                    b2.b.offset(0, (int)(-translationY));
                                    b3 = b2.b;
                                    a5 = p5x.a;
                                    p5x$f.c(child2, b3);
                                }
                                else {
                                    a6 = p5x.a;
                                    p5x$f.c(child2, (Rect)null);
                                    child2.setTranslationY(0.0f);
                                }
                            }
                        }
                    }
                    if (!v && appBarLayout.G0) {
                        coordinatorLayout.e((View)appBarLayout);
                    }
                    appBarLayout.d(((j9x)this).t());
                    if (q < z) {
                        i = -1;
                    }
                    else {
                        i = 1;
                    }
                    this.O(coordinatorLayout, (T)appBarLayout, q, i, false);
                    i = z - q;
                }
            }
            else {
                this.j = 0;
                i = n2;
            }
            this.N(coordinatorLayout, (T)appBarLayout);
            return i;
        }
        
        public final void E(final CoordinatorLayout coordinatorLayout, final T t, final int n, final float n2) {
            final int abs = Math.abs(this.z() - n);
            final float abs2 = Math.abs(0.0f);
            int n3;
            if (abs2 > 0.0f) {
                n3 = Math.round(abs / abs2 * 1000.0f) * 3;
            }
            else {
                n3 = (int)((abs / (float)((View)t).getHeight() + 1.0f) * 150.0f);
            }
            final int z = this.z();
            if (z == n) {
                final ValueAnimator l = this.l;
                if (l != null && l.isRunning()) {
                    this.l.cancel();
                }
            }
            else {
                final ValueAnimator i = this.l;
                if (i == null) {
                    (this.l = new ValueAnimator()).setInterpolator((TimeInterpolator)kc0.e);
                    this.l.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new com.google.android.material.appbar.b(this, coordinatorLayout, (AppBarLayout)t));
                }
                else {
                    i.cancel();
                }
                this.l.setDuration((long)Math.min(n3, 600));
                this.l.setIntValues(new int[] { z, n });
                this.l.start();
            }
        }
        
        public final View G(final CoordinatorLayout coordinatorLayout) {
            for (int childCount = ((ViewGroup)coordinatorLayout).getChildCount(), i = 0; i < childCount; ++i) {
                final View child = ((ViewGroup)coordinatorLayout).getChildAt(i);
                if (child instanceof ybi || child instanceof ListView || child instanceof ScrollView) {
                    return child;
                }
            }
            return null;
        }
        
        public boolean H(final CoordinatorLayout coordinatorLayout, final T t, int n) {
            super.i(coordinatorLayout, t, n);
            final int pendingAction = t.getPendingAction();
            final SavedState m = this.m;
            if (m != null && (pendingAction & 0x8) == 0x0) {
                if (m.fullyScrolled) {
                    this.C(coordinatorLayout, (View)t, -t.getTotalScrollRange());
                }
                else if (m.fullyExpanded) {
                    this.C(coordinatorLayout, (View)t, 0);
                }
                else {
                    final View child = ((ViewGroup)t).getChildAt(m.firstVisibleChildIndex);
                    n = -child.getBottom();
                    if (this.m.firstVisibleChildAtMinimumHeight) {
                        n += t.getTopInset() + p5x$d.d(child);
                    }
                    else {
                        n += Math.round(child.getHeight() * this.m.firstVisibleChildPercentageShown);
                    }
                    this.C(coordinatorLayout, (View)t, n);
                }
            }
            else if (pendingAction != 0) {
                if ((pendingAction & 0x4) != 0x0) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if ((pendingAction & 0x2) != 0x0) {
                    final int n2 = -t.getUpNestedPreScrollRange();
                    if (n != 0) {
                        this.E(coordinatorLayout, (AppBarLayout)t, n2);
                    }
                    else {
                        this.C(coordinatorLayout, (View)t, n2);
                    }
                }
                else if ((pendingAction & 0x1) != 0x0) {
                    if (n != 0) {
                        this.E(coordinatorLayout, (AppBarLayout)t, 0);
                    }
                    else {
                        this.C(coordinatorLayout, (View)t, 0);
                    }
                }
            }
            t.H0 = 0;
            this.m = null;
            ((j9x)this).v(fk7.q(((j9x)this).t(), -t.getTotalScrollRange(), 0));
            this.O(coordinatorLayout, t, ((j9x)this).t(), 0, true);
            t.d(((j9x)this).t());
            this.N(coordinatorLayout, t);
        }
        
        public void I(final CoordinatorLayout coordinatorLayout, final T t, final View view, int n, final int n2, final int[] array, int n3) {
            if (n2 != 0) {
                if (n2 < 0) {
                    n3 = -t.getTotalScrollRange();
                    final int downNestedPreScrollRange = t.getDownNestedPreScrollRange();
                    n = n3;
                    final int n4 = downNestedPreScrollRange + n3;
                    n3 = n;
                    n = n4;
                }
                else {
                    n3 = -t.getUpNestedPreScrollRange();
                    n = 0;
                }
                if (n3 != n) {
                    array[1] = this.B(coordinatorLayout, (View)t, n2, n3, n);
                }
            }
            if (t.N0) {
                t.g(t.h(view));
            }
        }
        
        public void J(final CoordinatorLayout coordinatorLayout, final T t, final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
            if (n4 < 0) {
                array[1] = this.B(coordinatorLayout, (View)t, n4, -t.getDownNestedScrollRange(), 0);
            }
            if (n4 == 0) {
                this.N(coordinatorLayout, t);
            }
        }
        
        public void K(final CoordinatorLayout coordinatorLayout, final T t, final View view, final int n) {
            if (this.k == 0 || n == 1) {
                this.M(coordinatorLayout, t);
                if (t.N0) {
                    t.g(t.h(view));
                }
            }
            this.n = new WeakReference<View>(view);
        }
        
        public final SavedState L(final Parcelable parcelable, final T t) {
            final int t2 = ((j9x)this).t();
            final int childCount = ((ViewGroup)t).getChildCount();
            final boolean b = false;
            for (int i = 0; i < childCount; ++i) {
                final View child = ((ViewGroup)t).getChildAt(i);
                final int n = child.getBottom() + t2;
                if (child.getTop() + t2 <= 0 && n >= 0) {
                    Object empty_STATE;
                    if ((empty_STATE = parcelable) == null) {
                        empty_STATE = fa.EMPTY_STATE;
                    }
                    final SavedState savedState = new SavedState((Parcelable)empty_STATE);
                    final boolean fullyExpanded = t2 == 0;
                    savedState.fullyExpanded = fullyExpanded;
                    savedState.fullyScrolled = (!fullyExpanded && -t2 >= t.getTotalScrollRange());
                    savedState.firstVisibleChildIndex = i;
                    final WeakHashMap a = p5x.a;
                    final int d = p5x$d.d(child);
                    boolean firstVisibleChildAtMinimumHeight = b;
                    if (n == t.getTopInset() + d) {
                        firstVisibleChildAtMinimumHeight = true;
                    }
                    savedState.firstVisibleChildAtMinimumHeight = firstVisibleChildAtMinimumHeight;
                    savedState.firstVisibleChildPercentageShown = n / (float)child.getHeight();
                    return savedState;
                }
            }
            return null;
        }
        
        public final void M(final CoordinatorLayout coordinatorLayout, final T t) {
            final int n = ((View)t).getPaddingTop() + t.getTopInset();
            final int n2 = this.z() - n;
            while (true) {
                for (int childCount = ((ViewGroup)t).getChildCount(), i = 0; i < childCount; ++i) {
                    final View child = ((ViewGroup)t).getChildAt(i);
                    final int top = child.getTop();
                    final int bottom = child.getBottom();
                    final AppBarLayout$c appBarLayout$c = (AppBarLayout$c)child.getLayoutParams();
                    int n3 = top;
                    int n4 = bottom;
                    if (F(appBarLayout$c.a, 32)) {
                        n3 = top - ((LinearLayout$LayoutParams)appBarLayout$c).topMargin;
                        n4 = bottom + ((LinearLayout$LayoutParams)appBarLayout$c).bottomMargin;
                    }
                    final int n5 = -n2;
                    if (n3 <= n5 && n4 >= n5) {
                        if (i >= 0) {
                            final View child2 = ((ViewGroup)t).getChildAt(i);
                            final AppBarLayout$c appBarLayout$c2 = (AppBarLayout$c)child2.getLayoutParams();
                            final int a = appBarLayout$c2.a;
                            if ((a & 0x11) == 0x11) {
                                final int n6 = -child2.getTop();
                                final int n7 = -child2.getBottom();
                                int n8 = n6;
                                if (i == 0) {
                                    final WeakHashMap a2 = p5x.a;
                                    n8 = n6;
                                    if (p5x$d.b((View)t)) {
                                        n8 = n6;
                                        if (p5x$d.b(child2)) {
                                            n8 = n6 - t.getTopInset();
                                        }
                                    }
                                }
                                int n9;
                                int n10;
                                if (F(a, 2)) {
                                    final WeakHashMap a3 = p5x.a;
                                    n9 = n7 + p5x$d.d(child2);
                                    n10 = n8;
                                }
                                else {
                                    n10 = n8;
                                    n9 = n7;
                                    if (F(a, 5)) {
                                        final WeakHashMap a4 = p5x.a;
                                        n9 = p5x$d.d(child2) + n7;
                                        if (n2 < n9) {
                                            n10 = n9;
                                            n9 = n7;
                                        }
                                        else {
                                            n10 = n8;
                                        }
                                    }
                                }
                                int n11 = n10;
                                int n12 = n9;
                                if (F(a, 32)) {
                                    n11 = n10 + ((LinearLayout$LayoutParams)appBarLayout$c2).topMargin;
                                    n12 = n9 - ((LinearLayout$LayoutParams)appBarLayout$c2).bottomMargin;
                                }
                                int n13 = n11;
                                if (n2 < (n12 + n11) / 2) {
                                    n13 = n12;
                                }
                                this.E(coordinatorLayout, (AppBarLayout)t, fk7.q(n13 + n, -t.getTotalScrollRange(), 0));
                            }
                        }
                        return;
                    }
                }
                int i = -1;
                continue;
            }
        }
        
        public final void N(final CoordinatorLayout coordinatorLayout, final T t) {
            p5x.w(ng$a.j.a(), (View)coordinatorLayout);
            boolean o = false;
            p5x.q((View)coordinatorLayout, 0);
            p5x.w(ng$a.k.a(), (View)coordinatorLayout);
            p5x.q((View)coordinatorLayout, 0);
            if (t.getTotalScrollRange() == 0) {
                return;
            }
            final int childCount = ((ViewGroup)coordinatorLayout).getChildCount();
            int i = 0;
            while (true) {
                while (i < childCount) {
                    final View child = ((ViewGroup)coordinatorLayout).getChildAt(i);
                    if (((CoordinatorLayout.f)child.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                        if (child == null) {
                            return;
                        }
                        final int childCount2 = ((ViewGroup)t).getChildCount();
                        int n = 0;
                        boolean b;
                        boolean b2;
                        while (true) {
                            b = true;
                            if (n >= childCount2) {
                                b2 = false;
                                break;
                            }
                            if (((AppBarLayout$c)((ViewGroup)t).getChildAt(n).getLayoutParams()).a != 0) {
                                b2 = true;
                                break;
                            }
                            ++n;
                        }
                        if (!b2) {
                            return;
                        }
                        if (!p5x.p((View)coordinatorLayout)) {
                            p5x.z((View)coordinatorLayout, (wf)new wf() {
                                public final void d(final View view, final ng ng) {
                                    super.a.onInitializeAccessibilityNodeInfo(view, ng.a);
                                    ng.W(BaseBehavior.this.o);
                                    ng.E((CharSequence)ScrollView.class.getName());
                                }
                            });
                        }
                        if (this.z() != -t.getTotalScrollRange()) {
                            p5x.x((View)coordinatorLayout, ng$a.j, (CharSequence)null, (bh)new d(t, false));
                            o = true;
                        }
                        if (this.z() != 0) {
                            if (child.canScrollVertically(-1)) {
                                final int n2 = -t.getDownNestedPreScrollRange();
                                if (n2 != 0) {
                                    p5x.x((View)coordinatorLayout, ng$a.k, (CharSequence)null, (bh)new c(this, coordinatorLayout, t, child, n2));
                                    o = b;
                                }
                            }
                            else {
                                p5x.x((View)coordinatorLayout, ng$a.k, (CharSequence)null, (bh)new d(t, true));
                                o = b;
                            }
                        }
                        this.o = o;
                        return;
                    }
                    else {
                        ++i;
                    }
                }
                final View child = null;
                continue;
            }
        }
        
        public final void O(final CoordinatorLayout coordinatorLayout, final T t, int n, int n2, final boolean b) {
            final int abs = Math.abs(n);
            final int childCount = ((ViewGroup)t).getChildCount();
            final int n3 = 0;
            while (true) {
                for (int i = 0; i < childCount; ++i) {
                    final View child = ((ViewGroup)t).getChildAt(i);
                    if (abs >= child.getTop() && abs <= child.getBottom()) {
                        boolean h = false;
                        Label_0173: {
                            if (child != null) {
                                final int a = ((AppBarLayout$c)child.getLayoutParams()).a;
                                if ((a & 0x1) != 0x0) {
                                    final WeakHashMap a2 = p5x.a;
                                    final int d = p5x$d.d(child);
                                    if ((n2 <= 0 || (a & 0xC) == 0x0) ? ((a & 0x2) != 0x0 && -n >= child.getBottom() - d - t.getTopInset()) : (-n >= child.getBottom() - d - t.getTopInset())) {
                                        h = true;
                                        break Label_0173;
                                    }
                                }
                            }
                            h = false;
                        }
                        if (t.N0) {
                            h = t.h(this.G(coordinatorLayout));
                        }
                        final boolean g = t.g(h);
                        if (!b) {
                            if (!g) {
                                return;
                            }
                            final ArrayList list = (ArrayList)coordinatorLayout.h((View)t);
                            final int size = list.size();
                            n2 = 0;
                            while (true) {
                                n = n3;
                                if (n2 >= size) {
                                    break;
                                }
                                final CoordinatorLayout.c a3 = ((CoordinatorLayout.f)((View)list.get(n2)).getLayoutParams()).a;
                                if (a3 instanceof ScrollingViewBehavior) {
                                    n = n3;
                                    if (((ScrollingViewBehavior)a3).f != 0) {
                                        n = 1;
                                        break;
                                    }
                                    break;
                                }
                                else {
                                    ++n2;
                                }
                            }
                            if (n == 0) {
                                return;
                            }
                        }
                        ((View)t).jumpDrawablesToCurrentState();
                        return;
                    }
                }
                final View child = null;
                continue;
            }
        }
        
        public final boolean j(final CoordinatorLayout coordinatorLayout, final View view, final int n, final int n2, int height) {
            final AppBarLayout appBarLayout = (AppBarLayout)view;
            height = ((CoordinatorLayout.f)((View)appBarLayout).getLayoutParams()).height;
            boolean b = false;
            if (height == -2) {
                coordinatorLayout.v((View)appBarLayout, n, n2, View$MeasureSpec.makeMeasureSpec(0, 0));
                b = true;
            }
            return b;
        }
        
        public final void o(final View view, final Parcelable parcelable) {
            final AppBarLayout appBarLayout = (AppBarLayout)view;
            if (parcelable instanceof SavedState) {
                (this.m = (SavedState)parcelable).getSuperState();
            }
            else {
                this.m = null;
            }
        }
        
        public final Parcelable p(final View view) {
            final AppBarLayout appBarLayout = (AppBarLayout)view;
            Object empty_STATE = View$BaseSavedState.EMPTY_STATE;
            final SavedState l = this.L((Parcelable)empty_STATE, (T)appBarLayout);
            if (l != null) {
                empty_STATE = l;
            }
            return (Parcelable)empty_STATE;
        }
        
        public final boolean q(final CoordinatorLayout coordinatorLayout, final View view, final View view2, int n, final int k) {
            final AppBarLayout appBarLayout = (AppBarLayout)view;
            final boolean b = true;
            boolean b2 = false;
            Label_0087: {
                if ((n & 0x2) != 0x0) {
                    b2 = b;
                    if (appBarLayout.N0) {
                        break Label_0087;
                    }
                    if (appBarLayout.getTotalScrollRange() != 0) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    if (n != 0 && ((View)coordinatorLayout).getHeight() - view2.getHeight() <= ((View)appBarLayout).getHeight()) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    if (n != 0) {
                        b2 = b;
                        break Label_0087;
                    }
                }
                b2 = false;
            }
            if (b2) {
                final ValueAnimator l = this.l;
                if (l != null) {
                    l.cancel();
                }
            }
            this.n = null;
            this.k = k;
            return b2;
        }
        
        public final boolean w(View view) {
            final AppBarLayout appBarLayout = (AppBarLayout)view;
            final WeakReference<View> n = this.n;
            if (n != null) {
                view = n.get();
                if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                    return false;
                }
            }
            return true;
        }
        
        public final int x(final View view) {
            return -((AppBarLayout)view).getDownNestedScrollRange();
        }
        
        public final int y(final View view) {
            return ((AppBarLayout)view).getTotalScrollRange();
        }
        
        public final int z() {
            return ((j9x)this).t() + this.j;
        }
        
        public static class SavedState extends fa
        {
            public static final Parcelable$Creator<SavedState> CREATOR;
            public boolean firstVisibleChildAtMinimumHeight;
            public int firstVisibleChildIndex;
            public float firstVisibleChildPercentageShown;
            public boolean fullyExpanded;
            public boolean fullyScrolled;
            
            static {
                CREATOR = (Parcelable$Creator)new AppBarLayout$BaseBehavior$SavedState$a();
            }
            
            public SavedState(final Parcel parcel, final ClassLoader classLoader) {
                super(parcel, classLoader);
                final byte byte1 = parcel.readByte();
                final boolean b = true;
                this.fullyScrolled = (byte1 != 0);
                this.fullyExpanded = (parcel.readByte() != 0);
                this.firstVisibleChildIndex = parcel.readInt();
                this.firstVisibleChildPercentageShown = parcel.readFloat();
                this.firstVisibleChildAtMinimumHeight = (parcel.readByte() != 0 && b);
            }
            
            public SavedState(final Parcelable parcelable) {
                super(parcelable);
            }
            
            @Override
            public void writeToParcel(final Parcel parcel, final int n) {
                super.writeToParcel(parcel, n);
                parcel.writeByte((byte)(byte)(this.fullyScrolled ? 1 : 0));
                parcel.writeByte((byte)(byte)(this.fullyExpanded ? 1 : 0));
                parcel.writeInt(this.firstVisibleChildIndex);
                parcel.writeFloat(this.firstVisibleChildPercentageShown);
                parcel.writeByte((byte)(byte)(this.firstVisibleChildAtMinimumHeight ? 1 : 0));
            }
        }
    }
    
    public interface OnOffsetChangedListener extends AppBarLayout$BaseOnOffsetChangedListener<AppBarLayout>
    {
        void onOffsetChanged(final AppBarLayout p0, final int p1);
    }
    
    public static class ScrollingViewBehavior extends uic
    {
        public ScrollingViewBehavior() {
        }
        
        public ScrollingViewBehavior(final Context context, final AttributeSet set) {
            super(context, set);
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, rp2.t1);
            super.f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
        
        public final AppBarLayout A(final List<View> list) {
            for (int size = list.size(), i = 0; i < size; ++i) {
                final View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout)view;
                }
            }
            return null;
        }
        
        public boolean c(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
            return view2 instanceof AppBarLayout;
        }
        
        public boolean e(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
            final CoordinatorLayout.c a = ((CoordinatorLayout.f)view2.getLayoutParams()).a;
            if (a instanceof BaseBehavior) {
                p5x.s(view, view2.getBottom() - view.getTop() + ((BaseBehavior)a).j + super.e - this.x(view2));
            }
            if (view2 instanceof AppBarLayout) {
                final AppBarLayout appBarLayout = (AppBarLayout)view2;
                if (appBarLayout.N0) {
                    appBarLayout.g(appBarLayout.h(view));
                }
            }
            return false;
        }
        
        public final void f(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
            if (view2 instanceof AppBarLayout) {
                p5x.w(ng$a.j.a(), (View)coordinatorLayout);
                p5x.q((View)coordinatorLayout, 0);
                p5x.w(ng$a.k.a(), (View)coordinatorLayout);
                p5x.q((View)coordinatorLayout, 0);
                p5x.z((View)coordinatorLayout, (wf)null);
            }
        }
        
        public final boolean n(final CoordinatorLayout coordinatorLayout, final View view, final Rect rect, final boolean b) {
            final AppBarLayout a = this.A(coordinatorLayout.g(view));
            if (a != null) {
                rect.offset(view.getLeft(), view.getTop());
                final Rect c = super.c;
                c.set(0, 0, ((View)coordinatorLayout).getWidth(), ((View)coordinatorLayout).getHeight());
                if (!c.contains(rect)) {
                    a.f(false, b ^ true, true);
                    return true;
                }
            }
            return false;
        }
        
        public final float y(final View view) {
            if (view instanceof AppBarLayout) {
                final AppBarLayout appBarLayout = (AppBarLayout)view;
                final int totalScrollRange = appBarLayout.getTotalScrollRange();
                final int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                final CoordinatorLayout.c a = ((CoordinatorLayout.f)((View)appBarLayout).getLayoutParams()).a;
                int z;
                if (a instanceof BaseBehavior) {
                    z = ((BaseBehavior)a).z();
                }
                else {
                    z = 0;
                }
                if (downNestedPreScrollRange != 0 && totalScrollRange + z <= downNestedPreScrollRange) {
                    return 0.0f;
                }
                final int n = totalScrollRange - downNestedPreScrollRange;
                if (n != 0) {
                    return z / (float)n + 1.0f;
                }
            }
            return 0.0f;
        }
        
        public final int z(final View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout)view).getTotalScrollRange();
            }
            return view.getMeasuredHeight();
        }
    }
    
    public static final class b extends AppBarLayout$a
    {
        public final Rect a;
        public final Rect b;
        
        public b() {
            this.a = new Rect();
            this.b = new Rect();
        }
    }
}
