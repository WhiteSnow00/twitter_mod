// 
// Decompiled by Procyon v0.6.0
// 

package androidx.swiperefreshlayout.widget;

import android.view.AbsSavedState;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;
import android.view.ViewParent;
import java.util.WeakHashMap;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.widget.ListView;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import java.util.Objects;
import android.view.animation.Transformation;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;
import android.util.AttributeSet;
import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import android.view.View;
import android.view.ViewGroup;

public class SwipeRefreshLayout extends ViewGroup implements dci, cci, aci
{
    public static final int[] o1;
    public View D0;
    public h E0;
    public boolean F0;
    public int G0;
    public float H0;
    public float I0;
    public final ckc J0;
    public final bci K0;
    public final int[] L0;
    public final int[] M0;
    public final int[] N0;
    public boolean O0;
    public int P0;
    public int Q0;
    public float R0;
    public float S0;
    public boolean T0;
    public int U0;
    public final DecelerateInterpolator V0;
    public q94 W0;
    public int X0;
    public int Y0;
    public int Z0;
    public int a1;
    public int b1;
    public ca4 c1;
    public k1s d1;
    public SwipeRefreshLayout$b e1;
    public SwipeRefreshLayout$c f1;
    public SwipeRefreshLayout$c g1;
    public boolean h1;
    public int i1;
    public g j1;
    public boolean k1;
    public SwipeRefreshLayout$a l1;
    public final SwipeRefreshLayout$e m1;
    public final SwipeRefreshLayout$f n1;
    
    static {
        o1 = new int[] { 16842766 };
    }
    
    public SwipeRefreshLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.F0 = false;
        this.H0 = -1.0f;
        this.L0 = new int[2];
        this.M0 = new int[2];
        this.N0 = new int[2];
        this.U0 = -1;
        this.X0 = -1;
        this.l1 = new Animation$AnimationListener(this) {
            public final SwipeRefreshLayout D0;
            
            public final void onAnimationEnd(final Animation animation) {
                final SwipeRefreshLayout d0 = this.D0;
                if (d0.F0) {
                    d0.c1.setAlpha(255);
                    this.D0.c1.start();
                    final SwipeRefreshLayout d2 = this.D0;
                    if (d2.h1) {
                        final h e0 = d2.E0;
                        if (e0 != null) {
                            e0.a();
                        }
                    }
                    final SwipeRefreshLayout d3 = this.D0;
                    d3.Q0 = ((View)d3.W0).getTop();
                }
                else {
                    d0.g();
                }
            }
            
            public final void onAnimationRepeat(final Animation animation) {
            }
            
            public final void onAnimationStart(final Animation animation) {
            }
        };
        this.m1 = new Animation(this) {
            public final SwipeRefreshLayout D0;
            
            public final void applyTransformation(float p2, final Transformation transformation) {
                Objects.requireNonNull(this.D0);
                final SwipeRefreshLayout d0 = this.D0;
                final int a1 = d0.a1;
                final int abs = Math.abs(d0.Z0);
                final SwipeRefreshLayout d2 = this.D0;
                final int y0 = d2.Y0;
                this.D0.setTargetOffsetTopAndBottom(y0 + (int)((a1 - abs - y0) * p2) - ((View)d2.W0).getTop());
                final ca4 c1 = this.D0.c1;
                p2 = 1.0f - p2;
                final ca4.a d3 = c1.D0;
                if (p2 != d3.p) {
                    d3.p = p2;
                }
                c1.invalidateSelf();
            }
        };
        this.n1 = new Animation(this) {
            public final SwipeRefreshLayout D0;
            
            public final void applyTransformation(final float n, final Transformation transformation) {
                this.D0.e(n);
            }
        };
        this.G0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.P0 = ((View)this).getResources().getInteger(17694721);
        ((View)this).setWillNotDraw(false);
        this.V0 = new DecelerateInterpolator(2.0f);
        final DisplayMetrics displayMetrics = ((View)this).getResources().getDisplayMetrics();
        this.i1 = (int)(displayMetrics.density * 40.0f);
        this.W0 = new q94(((View)this).getContext());
        (this.c1 = new ca4(((View)this).getContext())).c(1);
        this.W0.setImageDrawable((Drawable)this.c1);
        ((View)this.W0).setVisibility(8);
        this.addView((View)this.W0);
        this.setChildrenDrawingOrderEnabled(true);
        final int a1 = (int)(displayMetrics.density * 64.0f);
        this.a1 = a1;
        this.H0 = (float)a1;
        this.J0 = new ckc();
        this.K0 = new bci((View)this);
        this.setNestedScrollingEnabled(true);
        final int n = -this.i1;
        this.Q0 = n;
        this.Z0 = n;
        this.e(1.0f);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, SwipeRefreshLayout.o1);
        this.setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }
    
    private void setColorViewAlpha(final int n) {
        ((View)this.W0).getBackground().setAlpha(n);
        this.c1.setAlpha(n);
    }
    
    public final boolean a() {
        final g j1 = this.j1;
        if (j1 != null) {
            return j1.a();
        }
        final View d0 = this.D0;
        if (d0 instanceof ListView) {
            return hmf.a((ListView)d0, -1);
        }
        return d0.canScrollVertically(-1);
    }
    
    public final void b() {
        if (this.D0 == null) {
            for (int i = 0; i < this.getChildCount(); ++i) {
                final View child = this.getChildAt(i);
                if (!child.equals(this.W0)) {
                    this.D0 = child;
                    break;
                }
            }
        }
    }
    
    public final void c(final float n) {
        if (n > this.H0) {
            this.h(true, true);
        }
        else {
            this.F0 = false;
            final ca4 c1 = this.c1;
            final ca4.a d0 = c1.D0;
            d0.e = 0.0f;
            d0.f = 0.0f;
            c1.invalidateSelf();
            final Animation$AnimationListener d2 = (Animation$AnimationListener)new Animation$AnimationListener(this) {
                public final SwipeRefreshLayout D0;
                
                public final void onAnimationEnd(final Animation animation) {
                    Objects.requireNonNull(this.D0);
                    this.D0.q(null);
                }
                
                public final void onAnimationRepeat(final Animation animation) {
                }
                
                public final void onAnimationStart(final Animation animation) {
                }
            };
            this.Y0 = this.Q0;
            this.n1.reset();
            this.n1.setDuration(200L);
            this.n1.setInterpolator((Interpolator)this.V0);
            final q94 w0 = this.W0;
            w0.D0 = (Animation$AnimationListener)d2;
            ((View)w0).clearAnimation();
            ((View)this.W0).startAnimation((Animation)this.n1);
            final ca4 c2 = this.c1;
            c2.D0.b(false);
            c2.invalidateSelf();
        }
    }
    
    public final void d(float g) {
        final ca4 c1 = this.c1;
        final ca4.a d0 = c1.D0;
        final int n = 1;
        final int n2 = 1;
        d0.b(true);
        c1.invalidateSelf();
        final float min = Math.min(1.0f, Math.abs(g / this.H0));
        final float n3 = (float)Math.max(min - 0.4, 0.0) * 5.0f / 3.0f;
        final float abs = Math.abs(g);
        final float h0 = this.H0;
        int n4 = this.b1;
        if (n4 <= 0) {
            n4 = this.a1;
        }
        final float n5 = (float)n4;
        final double n6 = Math.max(0.0f, Math.min(abs - h0, n5 * 2.0f) / n5) / 4.0f;
        final float n7 = (float)(n6 - Math.pow(n6, 2.0)) * 2.0f;
        final int z0 = this.Z0;
        final int n8 = (int)(n5 * min + n5 * n7 * 2.0f);
        if (((View)this.W0).getVisibility() != 0) {
            ((View)this.W0).setVisibility(0);
        }
        ((View)this.W0).setScaleX(1.0f);
        ((View)this.W0).setScaleY(1.0f);
        if (g < this.H0) {
            if (this.c1.D0.t > 76) {
                final Animation f1 = this.f1;
                int n9;
                if (f1 != null && f1.hasStarted() && !f1.hasEnded()) {
                    n9 = n2;
                }
                else {
                    n9 = 0;
                }
                if (n9 == 0) {
                    this.f1 = (SwipeRefreshLayout$c)this.l(this.c1.D0.t, 76);
                }
            }
        }
        else if (this.c1.D0.t < 255) {
            final Animation g2 = this.g1;
            int n10;
            if (g2 != null && g2.hasStarted() && !g2.hasEnded()) {
                n10 = n;
            }
            else {
                n10 = 0;
            }
            if (n10 == 0) {
                this.g1 = (SwipeRefreshLayout$c)this.l(this.c1.D0.t, 255);
            }
        }
        final ca4 c2 = this.c1;
        g = Math.min(0.8f, n3 * 0.8f);
        final ca4.a d2 = c2.D0;
        d2.e = 0.0f;
        d2.f = g;
        c2.invalidateSelf();
        final ca4 c3 = this.c1;
        g = Math.min(1.0f, n3);
        final ca4.a d3 = c3.D0;
        if (g != d3.p) {
            d3.p = g;
        }
        c3.invalidateSelf();
        g = ed.e(n7, 2.0f, n3 * 0.4f - 0.25f, 0.5f);
        final ca4 c4 = this.c1;
        c4.D0.g = g;
        c4.invalidateSelf();
        this.setTargetOffsetTopAndBottom(z0 + n8 - this.Q0);
    }
    
    public final boolean dispatchNestedFling(final float n, final float n2, final boolean b) {
        return this.K0.a(n, n2, b);
    }
    
    public final boolean dispatchNestedPreFling(final float n, final float n2) {
        return this.K0.b(n, n2);
    }
    
    public final boolean dispatchNestedPreScroll(final int n, final int n2, final int[] array, final int[] array2) {
        return this.K0.c(n, n2, array, array2);
    }
    
    public final boolean dispatchNestedScroll(final int n, final int n2, final int n3, final int n4, final int[] array) {
        return this.K0.e(n, n2, n3, n4, array);
    }
    
    public final void e(final float n) {
        final int y0 = this.Y0;
        this.setTargetOffsetTopAndBottom(y0 + (int)((this.Z0 - y0) * n) - ((View)this.W0).getTop());
    }
    
    public final void f(final MotionEvent motionEvent) {
        final int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.U0) {
            int n;
            if (actionIndex == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.U0 = motionEvent.getPointerId(n);
        }
    }
    
    public final void g() {
        ((View)this.W0).clearAnimation();
        this.c1.stop();
        ((View)this.W0).setVisibility(8);
        this.setColorViewAlpha(255);
        this.setTargetOffsetTopAndBottom(this.Z0 - this.Q0);
        this.Q0 = ((View)this.W0).getTop();
    }
    
    public final int getChildDrawingOrder(int n, final int n2) {
        final int x0 = this.X0;
        if (x0 < 0) {
            return n2;
        }
        if (n2 == n - 1) {
            return x0;
        }
        if ((n = n2) >= x0) {
            n = n2 + 1;
        }
        return n;
    }
    
    public int getNestedScrollAxes() {
        final ckc j0 = this.J0;
        return j0.b | j0.a;
    }
    
    public int getProgressCircleDiameter() {
        return this.i1;
    }
    
    public int getProgressViewEndOffset() {
        return this.a1;
    }
    
    public int getProgressViewStartOffset() {
        return this.Z0;
    }
    
    public final void h(final boolean f0, final boolean h1) {
        if (this.F0 != f0) {
            this.h1 = h1;
            this.b();
            this.F0 = f0;
            if (f0) {
                final int q0 = this.Q0;
                final Animation$AnimationListener l1 = (Animation$AnimationListener)this.l1;
                this.Y0 = q0;
                this.m1.reset();
                this.m1.setDuration(200L);
                this.m1.setInterpolator((Interpolator)this.V0);
                if (l1 != null) {
                    this.W0.D0 = (Animation$AnimationListener)l1;
                }
                ((View)this.W0).clearAnimation();
                ((View)this.W0).startAnimation((Animation)this.m1);
            }
            else {
                this.q((Animation$AnimationListener)this.l1);
            }
        }
    }
    
    public final boolean hasNestedScrollingParent() {
        return this.K0.h(0);
    }
    
    public final void i(final View view, final View view2, final int n, final int n2) {
        if (n2 == 0) {
            this.onNestedScrollAccepted(view, view2, n);
        }
    }
    
    public final boolean isNestedScrollingEnabled() {
        return this.K0.d;
    }
    
    public final void j(final View view, final int n) {
        if (n == 0) {
            this.onStopNestedScroll(view);
        }
    }
    
    public final void k(final View view, final int n, final int n2, final int[] array, final int n3) {
        if (n3 == 0) {
            this.onNestedPreScroll(view, n, n2, array);
        }
    }
    
    public final Animation l(final int n, final int n2) {
        final Animation animation = new Animation(this, n, n2) {
            public final int D0;
            public final int E0;
            public final SwipeRefreshLayout F0;
            
            public final void applyTransformation(final float n, final Transformation transformation) {
                final ca4 c1 = this.F0.c1;
                final int d0 = this.D0;
                c1.setAlpha((int)((this.E0 - d0) * n + d0));
            }
        };
        animation.setDuration(300L);
        final q94 w0 = this.W0;
        w0.D0 = null;
        ((View)w0).clearAnimation();
        ((View)this.W0).startAnimation((Animation)animation);
        return animation;
    }
    
    public final void m(final View view, int n, int n2, final int n3, final int n4, final int n5, final int[] array) {
        if (n5 != 0) {
            return;
        }
        final int n6 = array[1];
        final int[] m0 = this.M0;
        if (n5 == 0) {
            this.K0.f(n, n2, n3, n4, m0, n5, array);
        }
        n2 = n4 - (array[1] - n6);
        if (n2 == 0) {
            n = n4 + this.M0[1];
        }
        else {
            n = n2;
        }
        if (n < 0 && !this.a()) {
            this.d(this.I0 += Math.abs(n));
            array[1] += n2;
        }
    }
    
    public final void n(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        this.m(view, n, n2, n3, n4, n5, this.N0);
    }
    
    public final boolean o(final View view, final View view2, final int n, final int n2) {
        return n2 == 0 && this.onStartNestedScroll(view, view2, n);
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g();
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        this.b();
        final int actionMasked = motionEvent.getActionMasked();
        if (((View)this).isEnabled() && !this.a() && !this.F0 && !this.O0) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                return this.T0;
                            }
                            this.f(motionEvent);
                            return this.T0;
                        }
                    }
                    else {
                        final int u0 = this.U0;
                        if (u0 == -1) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        final int pointerIndex = motionEvent.findPointerIndex(u0);
                        if (pointerIndex < 0) {
                            return false;
                        }
                        this.p(motionEvent.getY(pointerIndex));
                        return this.T0;
                    }
                }
                this.T0 = false;
                this.U0 = -1;
            }
            else {
                this.setTargetOffsetTopAndBottom(this.Z0 - ((View)this.W0).getTop());
                final int pointerId = motionEvent.getPointerId(0);
                this.U0 = pointerId;
                this.T0 = false;
                final int pointerIndex2 = motionEvent.findPointerIndex(pointerId);
                if (pointerIndex2 < 0) {
                    return false;
                }
                this.S0 = motionEvent.getY(pointerIndex2);
            }
            return this.T0;
        }
        return false;
    }
    
    public final void onLayout(final boolean b, int n, int measuredWidth, int n2, int paddingLeft) {
        measuredWidth = ((View)this).getMeasuredWidth();
        n = ((View)this).getMeasuredHeight();
        if (this.getChildCount() == 0) {
            return;
        }
        if (this.D0 == null) {
            this.b();
        }
        final View d0 = this.D0;
        if (d0 == null) {
            return;
        }
        paddingLeft = ((View)this).getPaddingLeft();
        n2 = ((View)this).getPaddingTop();
        d0.layout(paddingLeft, n2, measuredWidth - ((View)this).getPaddingLeft() - ((View)this).getPaddingRight() + paddingLeft, n - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom() + n2);
        n2 = ((View)this.W0).getMeasuredWidth();
        n = ((View)this.W0).getMeasuredHeight();
        final q94 w0 = this.W0;
        measuredWidth /= 2;
        paddingLeft = n2 / 2;
        n2 = this.Q0;
        ((View)w0).layout(measuredWidth - paddingLeft, n2, measuredWidth + paddingLeft, n + n2);
    }
    
    public final void onMeasure(int i, final int n) {
        super.onMeasure(i, n);
        if (this.D0 == null) {
            this.b();
        }
        final View d0 = this.D0;
        if (d0 == null) {
            return;
        }
        d0.measure(View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredWidth() - ((View)this).getPaddingLeft() - ((View)this).getPaddingRight(), 1073741824), View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredHeight() - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom(), 1073741824));
        ((View)this.W0).measure(View$MeasureSpec.makeMeasureSpec(this.i1, 1073741824), View$MeasureSpec.makeMeasureSpec(this.i1, 1073741824));
        this.X0 = -1;
        for (i = 0; i < this.getChildCount(); ++i) {
            if (this.getChildAt(i) == this.W0) {
                this.X0 = i;
                break;
            }
        }
    }
    
    public final boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        return this.dispatchNestedFling(n, n2, b);
    }
    
    public final boolean onNestedPreFling(final View view, final float n, final float n2) {
        return this.dispatchNestedPreFling(n, n2);
    }
    
    public final void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
        if (n2 > 0) {
            final float i0 = this.I0;
            if (i0 > 0.0f) {
                final float n3 = (float)n2;
                if (n3 > i0) {
                    array[1] = (int)i0;
                    this.I0 = 0.0f;
                }
                else {
                    this.I0 = i0 - n3;
                    array[1] = n2;
                }
                this.d(this.I0);
            }
        }
        final int[] l0 = this.L0;
        if (this.dispatchNestedPreScroll(n - array[0], n2 - array[1], l0, null)) {
            array[0] += l0[0];
            array[1] += l0[1];
        }
    }
    
    public final void onNestedScroll(final View view, final int n, final int n2, final int n3, final int n4) {
        this.m(view, n, n2, n3, n4, 0, this.N0);
    }
    
    public final void onNestedScrollAccepted(final View view, final View view2, final int n) {
        this.J0.a(n, 0);
        this.startNestedScroll(n & 0x2);
        this.I0 = 0.0f;
        this.O0 = true;
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        final SavedState savedState = (SavedState)parcelable;
        super.onRestoreInstanceState(((AbsSavedState)savedState).getSuperState());
        this.setRefreshing(savedState.mRefreshing);
    }
    
    public final Parcelable onSaveInstanceState() {
        return (Parcelable)new SavedState(super.onSaveInstanceState(), this.F0);
    }
    
    public final boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return ((View)this).isEnabled() && !this.F0 && (n & 0x2) != 0x0;
    }
    
    public final void onStopNestedScroll(final View view) {
        this.J0.b(0);
        this.O0 = false;
        final float i0 = this.I0;
        if (i0 > 0.0f) {
            this.c(i0);
            this.I0 = 0.0f;
        }
        this.stopNestedScroll();
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (((View)this).isEnabled() && !this.a() && !this.F0 && !this.O0) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            return false;
                        }
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                this.f(motionEvent);
                            }
                        }
                        else {
                            final int actionIndex = motionEvent.getActionIndex();
                            if (actionIndex < 0) {
                                Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            this.U0 = motionEvent.getPointerId(actionIndex);
                        }
                    }
                    else {
                        final int pointerIndex = motionEvent.findPointerIndex(this.U0);
                        if (pointerIndex < 0) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                            return false;
                        }
                        final float y = motionEvent.getY(pointerIndex);
                        this.p(y);
                        if (this.T0) {
                            final float n = (y - this.R0) * 0.5f;
                            if (n <= 0.0f) {
                                return false;
                            }
                            ((View)this).getParent().requestDisallowInterceptTouchEvent(true);
                            this.d(n);
                        }
                    }
                }
                else {
                    final int pointerIndex2 = motionEvent.findPointerIndex(this.U0);
                    if (pointerIndex2 < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                        return false;
                    }
                    if (this.T0) {
                        final float y2 = motionEvent.getY(pointerIndex2);
                        final float r0 = this.R0;
                        this.T0 = false;
                        this.c((y2 - r0) * 0.5f);
                    }
                    this.U0 = -1;
                    return false;
                }
            }
            else {
                this.U0 = motionEvent.getPointerId(0);
                this.T0 = false;
            }
            return true;
        }
        return false;
    }
    
    public final void p(final float n) {
        final float s0 = this.S0;
        final int g0 = this.G0;
        if (n - s0 > g0 && !this.T0) {
            this.R0 = s0 + g0;
            this.T0 = true;
            this.c1.setAlpha(76);
        }
    }
    
    public final void q(final Animation$AnimationListener d0) {
        (this.e1 = new Animation(this) {
            public final SwipeRefreshLayout D0;
            
            public final void applyTransformation(final float n, final Transformation transformation) {
                this.D0.setAnimationProgress(1.0f - n);
            }
        }).setDuration(150L);
        final q94 w0 = this.W0;
        w0.D0 = d0;
        ((View)w0).clearAnimation();
        ((View)this.W0).startAnimation((Animation)this.e1);
    }
    
    public final void requestDisallowInterceptTouchEvent(final boolean b) {
        final View d0 = this.D0;
        if (d0 != null) {
            final WeakHashMap a = j6x.a;
            if (!j6x$i.p(d0)) {
                if (this.k1) {
                    return;
                }
                final ViewParent parent = ((View)this).getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(b);
                }
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(b);
    }
    
    public void setAnimationProgress(final float n) {
        ((View)this.W0).setScaleX(n);
        ((View)this.W0).setScaleY(n);
    }
    
    @Deprecated
    public void setColorScheme(final int... colorSchemeResources) {
        this.setColorSchemeResources(colorSchemeResources);
    }
    
    public void setColorSchemeColors(final int... i) {
        this.b();
        final ca4 c1 = this.c1;
        final ca4.a d0 = c1.D0;
        d0.i = i;
        d0.a(0);
        c1.D0.a(0);
        c1.invalidateSelf();
    }
    
    public void setColorSchemeResources(final int... array) {
        final Context context = ((View)this).getContext();
        final int[] colorSchemeColors = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            colorSchemeColors[i] = kn6.b(context, array[i]);
        }
        this.setColorSchemeColors(colorSchemeColors);
    }
    
    public void setDistanceToTriggerSync(final int n) {
        this.H0 = (float)n;
    }
    
    public void setEnabled(final boolean enabled) {
        super.setEnabled(enabled);
        if (!enabled) {
            this.g();
        }
    }
    
    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(final boolean k1) {
        this.k1 = k1;
    }
    
    public void setNestedScrollingEnabled(final boolean b) {
        this.K0.i(b);
    }
    
    public void setOnChildScrollUpCallback(final g j1) {
        this.j1 = j1;
    }
    
    public void setOnRefreshListener(final h e0) {
        this.E0 = e0;
    }
    
    @Deprecated
    public void setProgressBackgroundColor(final int progressBackgroundColorSchemeResource) {
        this.setProgressBackgroundColorSchemeResource(progressBackgroundColorSchemeResource);
    }
    
    public void setProgressBackgroundColorSchemeColor(final int backgroundColor) {
        this.W0.setBackgroundColor(backgroundColor);
    }
    
    public void setProgressBackgroundColorSchemeResource(final int n) {
        this.setProgressBackgroundColorSchemeColor(kn6.b(((View)this).getContext(), n));
    }
    
    public void setRefreshing(final boolean f0) {
        if (f0 && this.F0 != f0) {
            this.F0 = f0;
            this.setTargetOffsetTopAndBottom(this.a1 + this.Z0 - this.Q0);
            this.h1 = false;
            final Animation$AnimationListener l1 = (Animation$AnimationListener)this.l1;
            ((View)this.W0).setVisibility(0);
            this.c1.setAlpha(255);
            ((Animation)(this.d1 = new k1s(this))).setDuration((long)this.P0);
            if (l1 != null) {
                this.W0.D0 = (Animation$AnimationListener)l1;
            }
            ((View)this.W0).clearAnimation();
            ((View)this.W0).startAnimation((Animation)this.d1);
        }
        else {
            this.h(f0, false);
        }
    }
    
    public void setSize(final int n) {
        if (n != 0 && n != 1) {
            return;
        }
        final DisplayMetrics displayMetrics = ((View)this).getResources().getDisplayMetrics();
        if (n == 0) {
            this.i1 = (int)(displayMetrics.density * 56.0f);
        }
        else {
            this.i1 = (int)(displayMetrics.density * 40.0f);
        }
        this.W0.setImageDrawable((Drawable)null);
        this.c1.c(n);
        this.W0.setImageDrawable((Drawable)this.c1);
    }
    
    public void setSlingshotDistance(final int b1) {
        this.b1 = b1;
    }
    
    public void setTargetOffsetTopAndBottom(final int n) {
        ((View)this.W0).bringToFront();
        j6x.s((View)this.W0, n);
        this.Q0 = ((View)this.W0).getTop();
    }
    
    public final boolean startNestedScroll(final int n) {
        return this.K0.j(n, 0);
    }
    
    public final void stopNestedScroll() {
        this.K0.k(0);
    }
    
    public static class SavedState extends View$BaseSavedState
    {
        public static final Parcelable$Creator<SavedState> CREATOR;
        public final boolean mRefreshing;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<SavedState>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new SavedState(parcel);
                }
                
                public final Object[] newArray(final int n) {
                    return new SavedState[n];
                }
            };
        }
        
        public SavedState(final Parcel parcel) {
            super(parcel);
            this.mRefreshing = (parcel.readByte() != 0);
        }
        
        public SavedState(final Parcelable parcelable, final boolean mRefreshing) {
            super(parcelable);
            this.mRefreshing = mRefreshing;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeByte((byte)(byte)(this.mRefreshing ? 1 : 0));
        }
    }
    
    public interface g
    {
        boolean a();
    }
    
    public interface h
    {
        void a();
    }
}
