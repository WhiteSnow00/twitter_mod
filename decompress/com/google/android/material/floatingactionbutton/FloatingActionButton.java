// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.floatingactionbutton;

import android.os.BaseBundle;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.appbar.AppBarLayout;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.graphics.ColorFilter;
import java.util.Iterator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.content.res.Resources;
import java.util.Objects;
import java.util.WeakHashMap;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import java.util.ArrayList;
import android.view.View$MeasureSpec;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class FloatingActionButton extends vdx implements aia, irp, CoordinatorLayout.b
{
    public ColorStateList D0;
    public PorterDuff$Mode E0;
    public ColorStateList F0;
    public PorterDuff$Mode G0;
    public ColorStateList H0;
    public int I0;
    public int J0;
    public int K0;
    public int L0;
    public int M0;
    public boolean N0;
    public final Rect O0;
    public final Rect P0;
    public final lk0 Q0;
    public final bia R0;
    public z7b S0;
    
    public FloatingActionButton(final Context context, final AttributeSet set) {
        super(ung.a(context, set, 2130969506, 2132019173), set, 2130969506);
        this.O0 = new Rect();
        this.P0 = new Rect();
        final Context context2 = ((View)this).getContext();
        final TypedArray d = hks.d(context2, set, rp2.a1, 2130969506, 2132019173, new int[0]);
        this.D0 = ong.b(context2, d, 1);
        this.E0 = sbx.e(d.getInt(2, -1), (PorterDuff$Mode)null);
        this.H0 = ong.b(context2, d, 12);
        this.J0 = d.getInt(7, -1);
        this.K0 = d.getDimensionPixelSize(6, 0);
        this.I0 = d.getDimensionPixelSize(3, 0);
        final float dimension = d.getDimension(4, 0.0f);
        final float dimension2 = d.getDimension(9, 0.0f);
        final float dimension3 = d.getDimension(11, 0.0f);
        this.N0 = d.getBoolean(16, false);
        final int dimensionPixelSize = ((View)this).getResources().getDimensionPixelSize(2131166603);
        this.setMaxImageSize(d.getDimensionPixelSize(10, 0));
        final erh a = erh.a(context2, d, 15);
        final erh a2 = erh.a(context2, d, 8);
        final pqp pqp = new pqp(pqp.c(context2, set, 2130969506, 2132019173, (ly6)pqp.m));
        final boolean boolean1 = d.getBoolean(5, false);
        ((View)this).setEnabled(d.getBoolean(0, true));
        d.recycle();
        (this.Q0 = new lk0((ImageView)this)).b(set, 2130969506);
        this.R0 = new bia((aia)this);
        this.getImpl().r(pqp);
        this.getImpl().g(this.D0, this.E0, this.H0, this.I0);
        this.getImpl().k = dimensionPixelSize;
        final d impl = this.getImpl();
        if (impl.h != dimension) {
            impl.m(impl.h = dimension, impl.i, impl.j);
        }
        final d impl2 = this.getImpl();
        if (impl2.i != dimension2) {
            impl2.i = dimension2;
            impl2.m(impl2.h, dimension2, impl2.j);
        }
        final d impl3 = this.getImpl();
        if (impl3.j != dimension3) {
            impl3.j = dimension3;
            impl3.m(impl3.h, impl3.i, dimension3);
        }
        this.getImpl().n = a;
        this.getImpl().o = a2;
        this.getImpl().f = boolean1;
        ((ImageView)this).setScaleType(ImageView$ScaleType.MATRIX);
    }
    
    private d getImpl() {
        if (this.S0 == null) {
            this.S0 = new z7b(this, (nqp)new b());
        }
        return this.S0;
    }
    
    public static int o(int min, int size) {
        final int mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    throw new IllegalArgumentException();
                }
                min = size;
            }
        }
        else {
            min = Math.min(min, size);
        }
        return min;
    }
    
    public final boolean a() {
        return this.R0.b;
    }
    
    public final void d() {
        final d impl = this.getImpl();
        if (impl.u == null) {
            impl.u = new ArrayList();
        }
        impl.u.add(null);
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.getImpl().l(((View)this).getDrawableState());
    }
    
    public final void e(final Animator$AnimatorListener animator$AnimatorListener) {
        final d impl = this.getImpl();
        if (impl.t == null) {
            impl.t = new ArrayList();
        }
        impl.t.add(animator$AnimatorListener);
    }
    
    public final void f(final iyt<? extends FloatingActionButton> iyt) {
        final d impl = this.getImpl();
        final c c = new c();
        if (impl.v == null) {
            impl.v = new ArrayList();
        }
        impl.v.add(c);
    }
    
    @Deprecated
    public final boolean g(final Rect rect) {
        final WeakHashMap a = p5x.a;
        if (p5x$g.c((View)this)) {
            rect.set(0, 0, ((View)this).getWidth(), ((View)this).getHeight());
            this.m(rect);
            return true;
        }
        return false;
    }
    
    public ColorStateList getBackgroundTintList() {
        return this.D0;
    }
    
    public PorterDuff$Mode getBackgroundTintMode() {
        return this.E0;
    }
    
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return (CoordinatorLayout.c<FloatingActionButton>)new FloatingActionButton.FloatingActionButton$Behavior();
    }
    
    public float getCompatElevation() {
        return this.getImpl().e();
    }
    
    public float getCompatHoveredFocusedTranslationZ() {
        return this.getImpl().i;
    }
    
    public float getCompatPressedTranslationZ() {
        return this.getImpl().j;
    }
    
    public Drawable getContentBackground() {
        return (Drawable)this.getImpl().e;
    }
    
    public int getCustomSize() {
        return this.K0;
    }
    
    public int getExpandedComponentIdHint() {
        return this.R0.c;
    }
    
    public erh getHideMotionSpec() {
        return this.getImpl().o;
    }
    
    @Deprecated
    public int getRippleColor() {
        final ColorStateList h0 = this.H0;
        int defaultColor;
        if (h0 != null) {
            defaultColor = h0.getDefaultColor();
        }
        else {
            defaultColor = 0;
        }
        return defaultColor;
    }
    
    public ColorStateList getRippleColorStateList() {
        return this.H0;
    }
    
    public pqp getShapeAppearanceModel() {
        final pqp a = this.getImpl().a;
        Objects.requireNonNull(a);
        return a;
    }
    
    public erh getShowMotionSpec() {
        return this.getImpl().n;
    }
    
    public int getSize() {
        return this.J0;
    }
    
    public int getSizeDimension() {
        return this.h(this.J0);
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        return this.getBackgroundTintList();
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        return this.getBackgroundTintMode();
    }
    
    public ColorStateList getSupportImageTintList() {
        return this.F0;
    }
    
    public PorterDuff$Mode getSupportImageTintMode() {
        return this.G0;
    }
    
    public boolean getUseCompatPadding() {
        return this.N0;
    }
    
    public final int h(int n) {
        final int k0 = this.K0;
        if (k0 != 0) {
            return k0;
        }
        final Resources resources = ((View)this).getResources();
        if (n == -1) {
            if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
                n = this.h(1);
            }
            else {
                n = this.h(0);
            }
            return n;
        }
        if (n != 1) {
            return resources.getDimensionPixelSize(2131165589);
        }
        return resources.getDimensionPixelSize(2131165588);
    }
    
    public final void i() {
        this.j(null, true);
    }
    
    public final void j(final FloatingActionButton.FloatingActionButton$a floatingActionButton$a, final boolean b) {
        final d impl = this.getImpl();
        a a;
        if (floatingActionButton$a == null) {
            a = null;
        }
        else {
            a = new a(this, floatingActionButton$a);
        }
        if (!impl.h()) {
            final Animator m = impl.m;
            if (m != null) {
                m.cancel();
            }
            if (impl.t()) {
                final erh o = impl.o;
                AnimatorSet set;
                if (o != null) {
                    set = impl.b(o, 0.0f, 0.0f, 0.0f);
                }
                else {
                    set = impl.c(0.0f, 0.4f, 0.4f);
                }
                ((Animator)set).addListener((Animator$AnimatorListener)new com.google.android.material.floatingactionbutton.b(impl, b, (d$g)a));
                final ArrayList u = impl.u;
                if (u != null) {
                    final Iterator iterator = u.iterator();
                    while (iterator.hasNext()) {
                        ((Animator)set).addListener((Animator$AnimatorListener)iterator.next());
                    }
                }
                set.start();
            }
            else {
                final FloatingActionButton w = impl.w;
                int n;
                if (b) {
                    n = 8;
                }
                else {
                    n = 4;
                }
                w.b(n, b);
                if (a != null) {
                    a.a.a(a.b);
                }
            }
        }
    }
    
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.getImpl().j();
    }
    
    public final boolean k() {
        return this.getImpl().h();
    }
    
    public final boolean l() {
        return this.getImpl().i();
    }
    
    public final void m(final Rect rect) {
        final int left = rect.left;
        final Rect o0 = this.O0;
        rect.left = left + o0.left;
        rect.top += o0.top;
        rect.right -= o0.right;
        rect.bottom -= o0.bottom;
    }
    
    public final void n() {
        final Drawable drawable = ((ImageView)this).getDrawable();
        if (drawable == null) {
            return;
        }
        final ColorStateList f0 = this.F0;
        if (f0 == null) {
            pd9.a(drawable);
            return;
        }
        final int colorForState = f0.getColorForState(((View)this).getDrawableState(), 0);
        PorterDuff$Mode porterDuff$Mode;
        if ((porterDuff$Mode = this.G0) == null) {
            porterDuff$Mode = PorterDuff$Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter((ColorFilter)ik0.c(colorForState, porterDuff$Mode));
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final d impl = this.getImpl();
        final qng b = impl.b;
        if (b != null) {
            ri4.b0((View)impl.w, b);
        }
        if (impl instanceof z7b ^ true) {
            final ViewTreeObserver viewTreeObserver = ((View)impl.w).getViewTreeObserver();
            if (impl.C == null) {
                impl.C = new y7b(impl);
            }
            viewTreeObserver.addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)impl.C);
        }
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final d impl = this.getImpl();
        final ViewTreeObserver viewTreeObserver = ((View)impl.w).getViewTreeObserver();
        final y7b c = impl.C;
        if (c != null) {
            viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)c);
            impl.C = null;
        }
    }
    
    public final void onMeasure(int min, final int n) {
        final int sizeDimension = this.getSizeDimension();
        this.L0 = (sizeDimension - this.M0) / 2;
        this.getImpl().v();
        min = Math.min(o(sizeDimension, min), o(sizeDimension, n));
        final Rect o0 = this.O0;
        ((View)this).setMeasuredDimension(o0.left + min + o0.right, min + o0.top + o0.bottom);
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof jna)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final jna jna = (jna)parcelable;
        super.onRestoreInstanceState(jna.getSuperState());
        final bia r0 = this.R0;
        final Object orDefault = jna.C0.getOrDefault((Object)"expandableWidgetHelper", (Object)null);
        Objects.requireNonNull(orDefault);
        final Bundle bundle = (Bundle)orDefault;
        Objects.requireNonNull(r0);
        r0.b = bundle.getBoolean("expanded", false);
        r0.c = ((BaseBundle)bundle).getInt("expandedComponentIdHint", 0);
        if (r0.b) {
            final ViewParent parent = r0.a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout)parent).e(r0.a);
            }
        }
    }
    
    public final Parcelable onSaveInstanceState() {
        Object onSaveInstanceState;
        if ((onSaveInstanceState = super.onSaveInstanceState()) == null) {
            onSaveInstanceState = new Bundle();
        }
        final jna jna = new jna((Parcelable)onSaveInstanceState);
        final l7q<String, Bundle> c0 = jna.C0;
        final bia r0 = this.R0;
        Objects.requireNonNull(r0);
        final Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", r0.b);
        ((BaseBundle)bundle).putInt("expandedComponentIdHint", r0.c);
        c0.put((Object)"expandableWidgetHelper", (Object)bundle);
        return (Parcelable)jna;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        return (motionEvent.getAction() != 0 || !this.g(this.P0) || this.P0.contains((int)motionEvent.getX(), (int)motionEvent.getY())) && super.onTouchEvent(motionEvent);
    }
    
    public final void p() {
        this.q(null, true);
    }
    
    public final void q(final FloatingActionButton.FloatingActionButton$a floatingActionButton$a, final boolean b) {
        final d impl = this.getImpl();
        a a;
        if (floatingActionButton$a == null) {
            a = null;
        }
        else {
            a = new a(this, floatingActionButton$a);
        }
        if (!impl.i()) {
            final Animator m = impl.m;
            if (m != null) {
                m.cancel();
            }
            final boolean b2 = impl.n == null;
            if (impl.t()) {
                if (((View)impl.w).getVisibility() != 0) {
                    final FloatingActionButton w = impl.w;
                    final float n = 0.0f;
                    ((View)w).setAlpha(0.0f);
                    final FloatingActionButton w2 = impl.w;
                    float scaleY;
                    if (b2) {
                        scaleY = 0.4f;
                    }
                    else {
                        scaleY = 0.0f;
                    }
                    w2.setScaleY(scaleY);
                    final FloatingActionButton w3 = impl.w;
                    float scaleX;
                    if (b2) {
                        scaleX = 0.4f;
                    }
                    else {
                        scaleX = 0.0f;
                    }
                    w3.setScaleX(scaleX);
                    float n2 = n;
                    if (b2) {
                        n2 = 0.4f;
                    }
                    impl.p(n2);
                }
                final erh n3 = impl.n;
                AnimatorSet set;
                if (n3 != null) {
                    set = impl.b(n3, 1.0f, 1.0f, 1.0f);
                }
                else {
                    set = impl.c(1.0f, 1.0f, 1.0f);
                }
                ((Animator)set).addListener((Animator$AnimatorListener)new com.google.android.material.floatingactionbutton.c(impl, b, (d$g)a));
                final ArrayList t = impl.t;
                if (t != null) {
                    final Iterator iterator = t.iterator();
                    while (iterator.hasNext()) {
                        ((Animator)set).addListener((Animator$AnimatorListener)iterator.next());
                    }
                }
                set.start();
            }
            else {
                impl.w.b(0, b);
                ((View)impl.w).setAlpha(1.0f);
                impl.w.setScaleY(1.0f);
                impl.w.setScaleX(1.0f);
                impl.p(1.0f);
                if (a != null) {
                    a.a.b();
                }
            }
        }
    }
    
    public void setBackgroundColor(final int n) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }
    
    public void setBackgroundDrawable(final Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }
    
    public void setBackgroundResource(final int n) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }
    
    public void setBackgroundTintList(final ColorStateList list) {
        if (this.D0 != list) {
            this.D0 = list;
            final d impl = this.getImpl();
            final qng b = impl.b;
            if (b != null) {
                b.setTintList(list);
            }
            final r72 d = impl.d;
            if (d != null) {
                d.b(list);
            }
        }
    }
    
    public void setBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        if (this.E0 != porterDuff$Mode) {
            this.E0 = porterDuff$Mode;
            final qng b = this.getImpl().b;
            if (b != null) {
                b.setTintMode(porterDuff$Mode);
            }
        }
    }
    
    public void setCompatElevation(final float h) {
        final d impl = this.getImpl();
        if (impl.h != h) {
            impl.m(impl.h = h, impl.i, impl.j);
        }
    }
    
    public void setCompatElevationResource(final int n) {
        this.setCompatElevation(((View)this).getResources().getDimension(n));
    }
    
    public void setCompatHoveredFocusedTranslationZ(final float i) {
        final d impl = this.getImpl();
        if (impl.i != i) {
            impl.i = i;
            impl.m(impl.h, i, impl.j);
        }
    }
    
    public void setCompatHoveredFocusedTranslationZResource(final int n) {
        this.setCompatHoveredFocusedTranslationZ(((View)this).getResources().getDimension(n));
    }
    
    public void setCompatPressedTranslationZ(final float j) {
        final d impl = this.getImpl();
        if (impl.j != j) {
            impl.j = j;
            impl.m(impl.h, impl.i, j);
        }
    }
    
    public void setCompatPressedTranslationZResource(final int n) {
        this.setCompatPressedTranslationZ(((View)this).getResources().getDimension(n));
    }
    
    public void setCustomSize(final int k0) {
        if (k0 >= 0) {
            if (k0 != this.K0) {
                this.K0 = k0;
                ((View)this).requestLayout();
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }
    
    public void setElevation(final float elevation) {
        super.setElevation(elevation);
        this.getImpl().w(elevation);
    }
    
    public void setEnsureMinTouchTargetSize(final boolean f) {
        if (f != this.getImpl().f) {
            this.getImpl().f = f;
            ((View)this).requestLayout();
        }
    }
    
    public void setExpandedComponentIdHint(final int c) {
        this.R0.c = c;
    }
    
    public void setHideMotionSpec(final erh o) {
        this.getImpl().o = o;
    }
    
    public void setHideMotionSpecResource(final int n) {
        this.setHideMotionSpec(erh.b(((View)this).getContext(), n));
    }
    
    public void setImageDrawable(final Drawable imageDrawable) {
        if (((ImageView)this).getDrawable() != imageDrawable) {
            super.setImageDrawable(imageDrawable);
            final d impl = this.getImpl();
            impl.p(impl.q);
            if (this.F0 != null) {
                this.n();
            }
        }
    }
    
    public void setImageResource(final int n) {
        this.Q0.c(n);
        this.n();
    }
    
    public void setMaxImageSize(final int n) {
        this.M0 = n;
        final d impl = this.getImpl();
        if (impl.r != n) {
            impl.r = n;
            impl.p(impl.q);
        }
    }
    
    public void setRippleColor(final int n) {
        this.setRippleColor(ColorStateList.valueOf(n));
    }
    
    public void setRippleColor(final ColorStateList h0) {
        if (this.H0 != h0) {
            this.H0 = h0;
            this.getImpl().q(this.H0);
        }
    }
    
    public void setScaleX(final float scaleX) {
        super.setScaleX(scaleX);
        this.getImpl().n();
    }
    
    public void setScaleY(final float scaleY) {
        super.setScaleY(scaleY);
        this.getImpl().n();
    }
    
    public void setShadowPaddingEnabled(final boolean g) {
        final d impl = this.getImpl();
        impl.g = g;
        impl.v();
    }
    
    public void setShapeAppearanceModel(final pqp pqp) {
        this.getImpl().r(pqp);
    }
    
    public void setShowMotionSpec(final erh n) {
        this.getImpl().n = n;
    }
    
    public void setShowMotionSpecResource(final int n) {
        this.setShowMotionSpec(erh.b(((View)this).getContext(), n));
    }
    
    public void setSize(final int j0) {
        this.K0 = 0;
        if (j0 != this.J0) {
            this.J0 = j0;
            ((View)this).requestLayout();
        }
    }
    
    public void setSupportBackgroundTintList(final ColorStateList backgroundTintList) {
        this.setBackgroundTintList(backgroundTintList);
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode backgroundTintMode) {
        this.setBackgroundTintMode(backgroundTintMode);
    }
    
    public void setSupportImageTintList(final ColorStateList f0) {
        if (this.F0 != f0) {
            this.F0 = f0;
            this.n();
        }
    }
    
    public void setSupportImageTintMode(final PorterDuff$Mode g0) {
        if (this.G0 != g0) {
            this.G0 = g0;
            this.n();
        }
    }
    
    public void setTranslationX(final float translationX) {
        super.setTranslationX(translationX);
        this.getImpl().o();
    }
    
    public void setTranslationY(final float translationY) {
        super.setTranslationY(translationY);
        this.getImpl().o();
    }
    
    public void setTranslationZ(final float translationZ) {
        super.setTranslationZ(translationZ);
        this.getImpl().o();
    }
    
    public void setUseCompatPadding(final boolean n0) {
        if (this.N0 != n0) {
            this.N0 = n0;
            this.getImpl().k();
        }
    }
    
    @Override
    public void setVisibility(final int visibility) {
        super.setVisibility(visibility);
    }
    
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T>
    {
        public Rect a;
        public boolean b;
        
        public BaseBehavior() {
            this.b = true;
        }
        
        public BaseBehavior(final Context context, final AttributeSet set) {
            super(context, set);
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, rp2.b1);
            this.b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
        
        public final boolean b(final View view, final Rect rect) {
            final FloatingActionButton floatingActionButton = (FloatingActionButton)view;
            final Rect o0 = floatingActionButton.O0;
            rect.set(((View)floatingActionButton).getLeft() + o0.left, ((View)floatingActionButton).getTop() + o0.top, ((View)floatingActionButton).getRight() - o0.right, ((View)floatingActionButton).getBottom() - o0.bottom);
            return true;
        }
        
        @Override
        public final void d(final CoordinatorLayout.f f) {
            if (f.h == 0) {
                f.h = 80;
            }
        }
        
        @Override
        public final boolean e(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
            final FloatingActionButton floatingActionButton = (FloatingActionButton)view;
            if (view2 instanceof AppBarLayout) {
                this.u(coordinatorLayout, (AppBarLayout)view2, floatingActionButton);
            }
            else {
                final ViewGroup$LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f && ((CoordinatorLayout.f)layoutParams).a instanceof BottomSheetBehavior) {
                    this.v(view2, floatingActionButton);
                }
            }
            return false;
        }
        
        @Override
        public final boolean i(final CoordinatorLayout coordinatorLayout, final View view, int right) {
            final FloatingActionButton floatingActionButton = (FloatingActionButton)view;
            final ArrayList list = (ArrayList)coordinatorLayout.g((View)floatingActionButton);
            final int size = list.size();
            final int n = 0;
            for (int i = 0; i < size; ++i) {
                final View view2 = (View)list.get(i);
                if (view2 instanceof AppBarLayout) {
                    if (this.u(coordinatorLayout, (AppBarLayout)view2, floatingActionButton)) {
                        break;
                    }
                }
                else {
                    final ViewGroup$LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f && ((CoordinatorLayout.f)layoutParams).a instanceof BottomSheetBehavior && this.v(view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.u((View)floatingActionButton, right);
            final Rect o0 = floatingActionButton.O0;
            if (o0 != null && o0.centerX() > 0 && o0.centerY() > 0) {
                final CoordinatorLayout.f f = (CoordinatorLayout.f)((View)floatingActionButton).getLayoutParams();
                if (((View)floatingActionButton).getRight() >= ((View)coordinatorLayout).getWidth() - f.rightMargin) {
                    right = o0.right;
                }
                else if (((View)floatingActionButton).getLeft() <= f.leftMargin) {
                    right = -o0.left;
                }
                else {
                    right = 0;
                }
                int bottom;
                if (((View)floatingActionButton).getBottom() >= ((View)coordinatorLayout).getHeight() - f.bottomMargin) {
                    bottom = o0.bottom;
                }
                else {
                    bottom = n;
                    if (((View)floatingActionButton).getTop() <= f.topMargin) {
                        bottom = -o0.top;
                    }
                }
                if (bottom != 0) {
                    p5x.s((View)floatingActionButton, bottom);
                }
                if (right != 0) {
                    p5x.r((View)floatingActionButton, right);
                }
            }
            return true;
        }
        
        public final boolean t(final View view, final FloatingActionButton floatingActionButton) {
            final CoordinatorLayout.f f = (CoordinatorLayout.f)((View)floatingActionButton).getLayoutParams();
            return this.b && f.f == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }
        
        public final boolean u(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, final FloatingActionButton floatingActionButton) {
            if (!this.t((View)appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            final Rect a = this.a;
            tp8.a((ViewGroup)coordinatorLayout, (View)appBarLayout, a);
            if (a.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.j(null, false);
            }
            else {
                floatingActionButton.q(null, false);
            }
            return true;
        }
        
        public final boolean v(final View view, final FloatingActionButton floatingActionButton) {
            if (!this.t(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < ((View)floatingActionButton).getHeight() / 2 + ((CoordinatorLayout.f)((View)floatingActionButton).getLayoutParams()).topMargin) {
                floatingActionButton.j(null, false);
            }
            else {
                floatingActionButton.q(null, false);
            }
            return true;
        }
    }
    
    public final class b implements nqp
    {
    }
    
    public final class c<T extends FloatingActionButton> implements d$f
    {
        public final iyt<T> a;
        
        public c() {
            this.a = null;
        }
        
        public final void a() {
            this.a.a();
        }
        
        public final void b() {
            this.a.b();
        }
        
        @Override
        public final boolean equals(final Object o) {
            return o instanceof c && ((c)o).a.equals(this.a);
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
    }
}
