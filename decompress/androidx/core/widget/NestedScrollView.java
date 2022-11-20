// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.widget;

import android.view.AbsSavedState;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import android.os.Parcelable;
import android.util.Log;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.view.KeyEvent;
import java.util.WeakHashMap;
import android.widget.FrameLayout$LayoutParams;
import android.view.FocusFinder;
import android.view.ViewGroup$LayoutParams;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.util.TypedValue;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.content.Context;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import android.graphics.Rect;
import android.widget.FrameLayout;

public class NestedScrollView extends FrameLayout implements dci, aci
{
    public static final NestedScrollView.NestedScrollView$a b1;
    public static final int[] c1;
    public long D0;
    public final Rect E0;
    public OverScroller F0;
    public EdgeEffect G0;
    public EdgeEffect H0;
    public int I0;
    public boolean J0;
    public boolean K0;
    public View L0;
    public boolean M0;
    public VelocityTracker N0;
    public boolean O0;
    public boolean P0;
    public int Q0;
    public int R0;
    public final int[] S0;
    public final int[] T0;
    public int U0;
    public int V0;
    public NestedScrollView.NestedScrollView$SavedState W0;
    public final ckc X0;
    public final bci Y0;
    public float Z0;
    public NestedScrollView.NestedScrollView$c a1;
    private int mMinimumVelocity;
    private int mTouchSlop;
    
    static {
        b1 = new NestedScrollView.NestedScrollView$a();
        c1 = new int[] { 16843130 };
    }
    
    public NestedScrollView(final Context context, final AttributeSet set) {
        this(context, set, 2130970240);
    }
    
    public NestedScrollView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.E0 = new Rect();
        this.J0 = true;
        this.K0 = false;
        this.L0 = null;
        this.M0 = false;
        this.P0 = true;
        this.R0 = -1;
        this.S0 = new int[2];
        this.T0 = new int[2];
        final int sdk_INT = Build$VERSION.SDK_INT;
        EdgeEffect a;
        if (sdk_INT >= 31) {
            a = pp9$b.a(context, set);
        }
        else {
            a = new EdgeEffect(context);
        }
        this.G0 = a;
        EdgeEffect a2;
        if (sdk_INT >= 31) {
            a2 = pp9$b.a(context, set);
        }
        else {
            a2 = new EdgeEffect(context);
        }
        this.H0 = a2;
        this.F0 = new OverScroller(((View)this).getContext());
        ((View)this).setFocusable(true);
        ((ViewGroup)this).setDescendantFocusability(262144);
        ((View)this).setWillNotDraw(false);
        final ViewConfiguration value = ViewConfiguration.get(((View)this).getContext());
        this.mTouchSlop = value.getScaledTouchSlop();
        this.mMinimumVelocity = value.getScaledMinimumFlingVelocity();
        this.Q0 = value.getScaledMaximumFlingVelocity();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, NestedScrollView.c1, n, 0);
        this.setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.X0 = new ckc();
        this.Y0 = new bci((View)this);
        this.setNestedScrollingEnabled(true);
        j6x.z((View)this, (vf)NestedScrollView.b1);
    }
    
    public static int c(final int n, final int n2, final int n3) {
        if (n2 >= n3 || n < 0) {
            return 0;
        }
        if (n2 + n > n3) {
            return n3 - n2;
        }
        return n;
    }
    
    private float getVerticalScrollFactorCompat() {
        if (this.Z0 == 0.0f) {
            final TypedValue typedValue = new TypedValue();
            final Context context = ((View)this).getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.Z0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.Z0;
    }
    
    public static boolean q(final View view, final View view2) {
        boolean b = true;
        if (view == view2) {
            return true;
        }
        final ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !q((View)parent, view2)) {
            b = false;
        }
        return b;
    }
    
    public final boolean A(final int n, final int n2) {
        return this.Y0.j(n, n2);
    }
    
    public final boolean B(final MotionEvent motionEvent) {
        final float a = pp9.a(this.G0);
        final boolean b = true;
        boolean b2;
        if (a != 0.0f) {
            pp9.b(this.G0, 0.0f, motionEvent.getX() / ((View)this).getWidth());
            b2 = true;
        }
        else {
            b2 = false;
        }
        if (pp9.a(this.H0) != 0.0f) {
            pp9.b(this.H0, 0.0f, 1.0f - motionEvent.getX() / ((View)this).getWidth());
            b2 = b;
        }
        return b2;
    }
    
    public final void C(final int n) {
        this.Y0.k(n);
    }
    
    public final void a() {
        this.F0.abortAnimation();
        this.C(1);
    }
    
    public final void addView(final View view) {
        if (((ViewGroup)this).getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
    
    public final void addView(final View view, final int n) {
        if (((ViewGroup)this).getChildCount() <= 0) {
            super.addView(view, n);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (((ViewGroup)this).getChildCount() <= 0) {
            super.addView(view, n, viewGroup$LayoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
    
    public final void addView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (((ViewGroup)this).getChildCount() <= 0) {
            super.addView(view, viewGroup$LayoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
    
    public final boolean b(int descendantFocusability) {
        View focus;
        if ((focus = ((View)this).findFocus()) == this) {
            focus = null;
        }
        final View nextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup)this, focus, descendantFocusability);
        final int maxScrollAmount = this.getMaxScrollAmount();
        if (nextFocus != null && this.r(nextFocus, maxScrollAmount, ((View)this).getHeight())) {
            nextFocus.getDrawingRect(this.E0);
            ((ViewGroup)this).offsetDescendantRectToMyCoords(nextFocus, this.E0);
            this.f(this.d(this.E0));
            nextFocus.requestFocus(descendantFocusability);
        }
        else {
            int n;
            if (descendantFocusability == 33 && ((View)this).getScrollY() < maxScrollAmount) {
                n = ((View)this).getScrollY();
            }
            else {
                n = maxScrollAmount;
                if (descendantFocusability == 130) {
                    n = maxScrollAmount;
                    if (((ViewGroup)this).getChildCount() > 0) {
                        final View child = ((ViewGroup)this).getChildAt(0);
                        n = Math.min(child.getBottom() + ((FrameLayout$LayoutParams)child.getLayoutParams()).bottomMargin - (((View)this).getHeight() + ((View)this).getScrollY() - ((View)this).getPaddingBottom()), maxScrollAmount);
                    }
                }
            }
            if (n == 0) {
                return false;
            }
            if (descendantFocusability != 130) {
                n = -n;
            }
            this.f(n);
        }
        if (focus != null && focus.isFocused() && (this.r(focus, 0, ((View)this).getHeight()) ^ true)) {
            descendantFocusability = ((ViewGroup)this).getDescendantFocusability();
            ((ViewGroup)this).setDescendantFocusability(131072);
            ((View)this).requestFocus();
            ((ViewGroup)this).setDescendantFocusability(descendantFocusability);
        }
        return true;
    }
    
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }
    
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }
    
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }
    
    public final void computeScroll() {
        if (this.F0.isFinished()) {
            return;
        }
        this.F0.computeScrollOffset();
        final int currY = this.F0.getCurrY();
        final int n = currY - this.V0;
        this.V0 = currY;
        final int[] t0 = this.T0;
        final boolean b = false;
        this.e(t0[1] = 0, n, t0, null, 1);
        final int n2 = n - this.T0[1];
        final int scrollRange = this.getScrollRange();
        int n3;
        if ((n3 = n2) != 0) {
            final int scrollY = ((View)this).getScrollY();
            this.u(n2, ((View)this).getScrollX(), scrollY, scrollRange);
            final int n4 = ((View)this).getScrollY() - scrollY;
            final int n5 = n2 - n4;
            final int[] t2 = this.T0;
            t2[1] = 0;
            this.Y0.f(0, n4, 0, n5, this.S0, 1, t2);
            n3 = n5 - this.T0[1];
        }
        if (n3 != 0) {
            final int overScrollMode = ((View)this).getOverScrollMode();
            int n6 = 0;
            Label_0188: {
                if (overScrollMode != 0) {
                    n6 = (b ? 1 : 0);
                    if (overScrollMode != 1) {
                        break Label_0188;
                    }
                    n6 = (b ? 1 : 0);
                    if (scrollRange <= 0) {
                        break Label_0188;
                    }
                }
                n6 = 1;
            }
            if (n6 != 0) {
                if (n3 < 0) {
                    if (this.G0.isFinished()) {
                        this.G0.onAbsorb((int)this.F0.getCurrVelocity());
                    }
                }
                else if (this.H0.isFinished()) {
                    this.H0.onAbsorb((int)this.F0.getCurrVelocity());
                }
            }
            this.a();
        }
        if (!this.F0.isFinished()) {
            final WeakHashMap a = j6x.a;
            j6x$d.k((View)this);
        }
        else {
            this.C(1);
        }
    }
    
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }
    
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }
    
    public final int computeVerticalScrollRange() {
        final int childCount = ((ViewGroup)this).getChildCount();
        final int n = ((View)this).getHeight() - ((View)this).getPaddingBottom() - ((View)this).getPaddingTop();
        if (childCount == 0) {
            return n;
        }
        final View child = ((ViewGroup)this).getChildAt(0);
        final int n2 = child.getBottom() + ((FrameLayout$LayoutParams)child.getLayoutParams()).bottomMargin;
        final int scrollY = ((View)this).getScrollY();
        final int max = Math.max(0, n2 - n);
        int n3;
        if (scrollY < 0) {
            n3 = n2 - scrollY;
        }
        else {
            n3 = n2;
            if (scrollY > max) {
                n3 = n2 + (scrollY - max);
            }
        }
        return n3;
    }
    
    public final int d(final Rect rect) {
        final int childCount = ((ViewGroup)this).getChildCount();
        final boolean b = false;
        if (childCount == 0) {
            return 0;
        }
        final int height = ((View)this).getHeight();
        final int scrollY = ((View)this).getScrollY();
        final int n = scrollY + height;
        final int verticalFadingEdgeLength = ((View)this).getVerticalFadingEdgeLength();
        int n2 = scrollY;
        if (rect.top > 0) {
            n2 = scrollY + verticalFadingEdgeLength;
        }
        final View child = ((ViewGroup)this).getChildAt(0);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
        int n3;
        if (rect.bottom < child.getHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin) {
            n3 = n - verticalFadingEdgeLength;
        }
        else {
            n3 = n;
        }
        final int bottom = rect.bottom;
        int n5;
        if (bottom > n3 && rect.top > n2) {
            int n4;
            if (rect.height() > height) {
                n4 = rect.top - n2;
            }
            else {
                n4 = rect.bottom - n3;
            }
            n5 = Math.min(n4 + 0, child.getBottom() + frameLayout$LayoutParams.bottomMargin - n);
        }
        else {
            n5 = (b ? 1 : 0);
            if (rect.top < n2) {
                n5 = (b ? 1 : 0);
                if (bottom < n3) {
                    int n6;
                    if (rect.height() > height) {
                        n6 = 0 - (n3 - rect.bottom);
                    }
                    else {
                        n6 = 0 - (n2 - rect.top);
                    }
                    n5 = Math.max(n6, -((View)this).getScrollY());
                }
            }
        }
        return n5;
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || this.g(keyEvent);
    }
    
    public final boolean dispatchNestedFling(final float n, final float n2, final boolean b) {
        return this.Y0.a(n, n2, b);
    }
    
    public final boolean dispatchNestedPreFling(final float n, final float n2) {
        return this.Y0.b(n, n2);
    }
    
    public final boolean dispatchNestedPreScroll(final int n, final int n2, final int[] array, final int[] array2) {
        return this.e(n, n2, array, array2, 0);
    }
    
    public final boolean dispatchNestedScroll(final int n, final int n2, final int n3, final int n4, final int[] array) {
        return this.Y0.e(n, n2, n3, n4, array);
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        final int scrollY = ((View)this).getScrollY();
        final boolean finished = this.G0.isFinished();
        final int n = 0;
        if (!finished) {
            final int save = canvas.save();
            int width = ((View)this).getWidth();
            final int height = ((View)this).getHeight();
            final int min = Math.min(0, scrollY);
            int n2;
            if (NestedScrollView.NestedScrollView$b.a((ViewGroup)this)) {
                width -= ((View)this).getPaddingRight() + ((View)this).getPaddingLeft();
                n2 = ((View)this).getPaddingLeft() + 0;
            }
            else {
                n2 = 0;
            }
            int n3 = height;
            int n4 = min;
            if (NestedScrollView.NestedScrollView$b.a((ViewGroup)this)) {
                n3 = height - (((View)this).getPaddingBottom() + ((View)this).getPaddingTop());
                n4 = min + ((View)this).getPaddingTop();
            }
            canvas.translate((float)n2, (float)n4);
            this.G0.setSize(width, n3);
            if (this.G0.draw(canvas)) {
                final WeakHashMap a = j6x.a;
                j6x$d.k((View)this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.H0.isFinished()) {
            final int save2 = canvas.save();
            final int width2 = ((View)this).getWidth();
            final int height2 = ((View)this).getHeight();
            final int n5 = Math.max(this.getScrollRange(), scrollY) + height2;
            int n6 = n;
            int n7 = width2;
            if (NestedScrollView.NestedScrollView$b.a((ViewGroup)this)) {
                n7 = width2 - (((View)this).getPaddingRight() + ((View)this).getPaddingLeft());
                n6 = 0 + ((View)this).getPaddingLeft();
            }
            int n8 = n5;
            int n9 = height2;
            if (NestedScrollView.NestedScrollView$b.a((ViewGroup)this)) {
                n9 = height2 - (((View)this).getPaddingBottom() + ((View)this).getPaddingTop());
                n8 = n5 - ((View)this).getPaddingBottom();
            }
            canvas.translate((float)(n6 - n7), (float)n8);
            canvas.rotate(180.0f, (float)n7, 0.0f);
            this.H0.setSize(n7, n9);
            if (this.H0.draw(canvas)) {
                final WeakHashMap a2 = j6x.a;
                j6x$d.k((View)this);
            }
            canvas.restoreToCount(save2);
        }
    }
    
    public final boolean e(final int n, final int n2, final int[] array, final int[] array2, final int n3) {
        return this.Y0.d(n, n2, array, array2, n3);
    }
    
    public final void f(final int n) {
        if (n != 0) {
            if (this.P0) {
                this.z(0, n, false);
            }
            else {
                ((View)this).scrollBy(0, n);
            }
        }
    }
    
    public final boolean g(final KeyEvent keyEvent) {
        this.E0.setEmpty();
        final int childCount = ((ViewGroup)this).getChildCount();
        boolean b = true;
        final boolean b2 = false;
        boolean b3 = false;
        Label_0080: {
            if (childCount > 0) {
                final View child = ((ViewGroup)this).getChildAt(0);
                final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
                if (child.getHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin > ((View)this).getHeight() - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom()) {
                    b3 = true;
                    break Label_0080;
                }
            }
            b3 = false;
        }
        if (b3) {
            boolean b4 = b2;
            if (keyEvent.getAction() == 0) {
                final int keyCode = keyEvent.getKeyCode();
                int n = 33;
                if (keyCode != 19) {
                    if (keyCode != 20) {
                        if (keyCode != 62) {
                            b4 = b2;
                        }
                        else {
                            if (!keyEvent.isShiftPressed()) {
                                n = 130;
                            }
                            final boolean b5 = n == 130;
                            final int height = ((View)this).getHeight();
                            if (b5) {
                                this.E0.top = ((View)this).getScrollY() + height;
                                final int childCount2 = ((ViewGroup)this).getChildCount();
                                if (childCount2 > 0) {
                                    final View child2 = ((ViewGroup)this).getChildAt(childCount2 - 1);
                                    final int n2 = ((View)this).getPaddingBottom() + (child2.getBottom() + ((FrameLayout$LayoutParams)child2.getLayoutParams()).bottomMargin);
                                    final Rect e0 = this.E0;
                                    if (e0.top + height > n2) {
                                        e0.top = n2 - height;
                                    }
                                }
                            }
                            else {
                                this.E0.top = ((View)this).getScrollY() - height;
                                final Rect e2 = this.E0;
                                if (e2.top < 0) {
                                    e2.top = 0;
                                }
                            }
                            final Rect e3 = this.E0;
                            final int top = e3.top;
                            this.x(n, top, e3.bottom = height + top);
                            b4 = b2;
                        }
                    }
                    else if (!keyEvent.isAltPressed()) {
                        b4 = this.b(130);
                    }
                    else {
                        b4 = this.l(130);
                    }
                }
                else if (!keyEvent.isAltPressed()) {
                    b4 = this.b(33);
                }
                else {
                    b4 = this.l(33);
                }
            }
            return b4;
        }
        if (((View)this).isFocused() && keyEvent.getKeyCode() != 4) {
            View focus;
            if ((focus = ((View)this).findFocus()) == this) {
                focus = null;
            }
            final View nextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup)this, focus, 130);
            if (nextFocus == null || nextFocus == this || !nextFocus.requestFocus(130)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public float getBottomFadingEdgeStrength() {
        if (((ViewGroup)this).getChildCount() == 0) {
            return 0.0f;
        }
        final View child = ((ViewGroup)this).getChildAt(0);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
        final int verticalFadingEdgeLength = ((View)this).getVerticalFadingEdgeLength();
        final int n = child.getBottom() + frameLayout$LayoutParams.bottomMargin - ((View)this).getScrollY() - (((View)this).getHeight() - ((View)this).getPaddingBottom());
        if (n < verticalFadingEdgeLength) {
            return n / (float)verticalFadingEdgeLength;
        }
        return 1.0f;
    }
    
    public int getMaxScrollAmount() {
        return (int)(((View)this).getHeight() * 0.5f);
    }
    
    public int getNestedScrollAxes() {
        final ckc x0 = this.X0;
        return x0.b | x0.a;
    }
    
    public int getScrollRange() {
        final int childCount = ((ViewGroup)this).getChildCount();
        int max = 0;
        if (childCount > 0) {
            final View child = ((ViewGroup)this).getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            max = Math.max(0, child.getHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin - (((View)this).getHeight() - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom()));
        }
        return max;
    }
    
    public float getTopFadingEdgeStrength() {
        if (((ViewGroup)this).getChildCount() == 0) {
            return 0.0f;
        }
        final int verticalFadingEdgeLength = ((View)this).getVerticalFadingEdgeLength();
        final int scrollY = ((View)this).getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / (float)verticalFadingEdgeLength;
        }
        return 1.0f;
    }
    
    public final void h(final int n) {
        if (((ViewGroup)this).getChildCount() > 0) {
            this.F0.fling(((View)this).getScrollX(), ((View)this).getScrollY(), 0, n, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.w(true);
        }
    }
    
    public final boolean hasNestedScrollingParent() {
        return this.p(0);
    }
    
    public final void i(final View view, final View view2, final int n, final int n2) {
        this.X0.a(n, n2);
        this.A(2, n2);
    }
    
    public boolean isNestedScrollingEnabled() {
        return this.Y0.d;
    }
    
    public final void j(final View view, final int n) {
        this.X0.b(n);
        this.C(n);
    }
    
    public final void k(final View view, final int n, final int n2, final int[] array, final int n3) {
        this.e(n, n2, array, null, n3);
    }
    
    public final boolean l(final int n) {
        final boolean b = n == 130;
        final int height = ((View)this).getHeight();
        final Rect e0 = this.E0;
        e0.top = 0;
        e0.bottom = height;
        if (b) {
            final int childCount = ((ViewGroup)this).getChildCount();
            if (childCount > 0) {
                final View child = ((ViewGroup)this).getChildAt(childCount - 1);
                this.E0.bottom = ((View)this).getPaddingBottom() + (child.getBottom() + ((FrameLayout$LayoutParams)child.getLayoutParams()).bottomMargin);
                final Rect e2 = this.E0;
                e2.top = e2.bottom - height;
            }
        }
        final Rect e3 = this.E0;
        return this.x(n, e3.top, e3.bottom);
    }
    
    public final void m(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        this.s(n4, n5, array);
    }
    
    public final void measureChild(final View view, final int n, int paddingLeft) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        paddingLeft = ((View)this).getPaddingLeft();
        view.measure(ViewGroup.getChildMeasureSpec(n, ((View)this).getPaddingRight() + paddingLeft, layoutParams.width), View$MeasureSpec.makeMeasureSpec(0, 0));
    }
    
    public final void measureChildWithMargins(final View view, final int n, final int n2, int paddingLeft, final int n3) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        paddingLeft = ((View)this).getPaddingLeft();
        view.measure(ViewGroup.getChildMeasureSpec(n, ((View)this).getPaddingRight() + paddingLeft + viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin + n2, viewGroup$MarginLayoutParams.width), View$MeasureSpec.makeMeasureSpec(viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin, 0));
    }
    
    public final void n(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        this.s(n4, n5, null);
    }
    
    public final boolean o(final View view, final View view2, final int n, final int n2) {
        return (n & 0x2) != 0x0;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K0 = false;
    }
    
    public final boolean onGenericMotionEvent(final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        final int n = 0;
        final int n2 = 0;
        boolean b = false;
        if (action == 8 && !this.M0) {
            float n3;
            if (rp9.k0(motionEvent, 2)) {
                n3 = motionEvent.getAxisValue(9);
            }
            else if (rp9.k0(motionEvent, 4194304)) {
                n3 = motionEvent.getAxisValue(26);
            }
            else {
                n3 = 0.0f;
            }
            if (n3 != 0.0f) {
                final int n4 = (int)(n3 * this.getVerticalScrollFactorCompat());
                final int scrollRange = this.getScrollRange();
                final int scrollY = ((View)this).getScrollY();
                final int n5 = scrollY - n4;
                int n6 = 0;
                Label_0319: {
                    if (n5 < 0) {
                        final int overScrollMode = ((View)this).getOverScrollMode();
                        final boolean b2 = (overScrollMode == 0 || (overScrollMode == 1 && this.getScrollRange() > 0)) && !rp9.k0(motionEvent, 8194);
                        n6 = n;
                        if (b2) {
                            pp9.b(this.G0, -(float)n5 / ((View)this).getHeight(), 0.5f);
                            this.G0.onRelease();
                            ((View)this).invalidate();
                            b = true;
                            n6 = n2;
                            break Label_0319;
                        }
                    }
                    else {
                        if (n5 > scrollRange) {
                            final int overScrollMode2 = ((View)this).getOverScrollMode();
                            if ((overScrollMode2 == 0 || (overScrollMode2 == 1 && this.getScrollRange() > 0)) && !rp9.k0(motionEvent, 8194)) {
                                pp9.b(this.H0, (n5 - scrollRange) / (float)((View)this).getHeight(), 0.5f);
                                this.H0.onRelease();
                                ((View)this).invalidate();
                                b = true;
                            }
                            n6 = scrollRange;
                            break Label_0319;
                        }
                        n6 = n5;
                    }
                    b = false;
                }
                if (n6 != scrollY) {
                    super.scrollTo(((View)this).getScrollX(), n6);
                    return true;
                }
                return b;
            }
        }
        return false;
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        final boolean b = true;
        final boolean b2 = true;
        if (action == 2 && this.M0) {
            return true;
        }
        final int n = action & 0xFF;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 6) {
                            return this.M0;
                        }
                        this.t(motionEvent);
                        return this.M0;
                    }
                }
                else {
                    final int r0 = this.R0;
                    if (r0 == -1) {
                        return this.M0;
                    }
                    final int pointerIndex = motionEvent.findPointerIndex(r0);
                    if (pointerIndex == -1) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Invalid pointerId=");
                        sb.append(r0);
                        sb.append(" in onInterceptTouchEvent");
                        Log.e("NestedScrollView", sb.toString());
                        return this.M0;
                    }
                    final int i0 = (int)motionEvent.getY(pointerIndex);
                    if (Math.abs(i0 - this.I0) <= this.mTouchSlop || (0x2 & this.getNestedScrollAxes()) != 0x0) {
                        return this.M0;
                    }
                    this.M0 = true;
                    this.I0 = i0;
                    if (this.N0 == null) {
                        this.N0 = VelocityTracker.obtain();
                    }
                    this.N0.addMovement(motionEvent);
                    this.U0 = 0;
                    final ViewParent parent = ((View)this).getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                        return this.M0;
                    }
                    return this.M0;
                }
            }
            this.M0 = false;
            this.R0 = -1;
            this.v();
            if (this.F0.springBack(((View)this).getScrollX(), ((View)this).getScrollY(), 0, 0, 0, this.getScrollRange())) {
                final WeakHashMap a = j6x.a;
                j6x$d.k((View)this);
            }
            this.C(0);
        }
        else {
            final int i2 = (int)motionEvent.getY();
            final int n2 = (int)motionEvent.getX();
            boolean b3 = false;
            Label_0359: {
                if (((ViewGroup)this).getChildCount() > 0) {
                    final int scrollY = ((View)this).getScrollY();
                    final View child = ((ViewGroup)this).getChildAt(0);
                    if (i2 >= child.getTop() - scrollY && i2 < child.getBottom() - scrollY && n2 >= child.getLeft() && n2 < child.getRight()) {
                        b3 = true;
                        break Label_0359;
                    }
                }
                b3 = false;
            }
            if (!b3) {
                boolean m0 = b2;
                if (!this.B(motionEvent)) {
                    m0 = (!this.F0.isFinished() && b2);
                }
                this.M0 = m0;
                this.v();
            }
            else {
                this.I0 = i2;
                this.R0 = motionEvent.getPointerId(0);
                final VelocityTracker n3 = this.N0;
                if (n3 == null) {
                    this.N0 = VelocityTracker.obtain();
                }
                else {
                    n3.clear();
                }
                this.N0.addMovement(motionEvent);
                this.F0.computeScrollOffset();
                boolean m2 = b;
                if (!this.B(motionEvent)) {
                    m2 = (!this.F0.isFinished() && b);
                }
                this.M0 = m2;
                this.A(2, 0);
            }
        }
        return this.M0;
    }
    
    public final void onLayout(final boolean b, int c, final int n, int scrollY, final int n2) {
        super.onLayout(b, c, n, scrollY, n2);
        c = 0;
        this.J0 = false;
        final View l0 = this.L0;
        if (l0 != null && q(l0, (View)this)) {
            this.y(this.L0);
        }
        this.L0 = null;
        if (!this.K0) {
            if (this.W0 != null) {
                this.scrollTo(((View)this).getScrollX(), this.W0.scrollPosition);
                this.W0 = null;
            }
            if (((ViewGroup)this).getChildCount() > 0) {
                final View child = ((ViewGroup)this).getChildAt(0);
                final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
                c = child.getMeasuredHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin;
            }
            final int paddingTop = ((View)this).getPaddingTop();
            final int paddingBottom = ((View)this).getPaddingBottom();
            scrollY = ((View)this).getScrollY();
            c = c(scrollY, n2 - n - paddingTop - paddingBottom, c);
            if (c != scrollY) {
                this.scrollTo(((View)this).getScrollX(), c);
            }
        }
        this.scrollTo(((View)this).getScrollX(), ((View)this).getScrollY());
        this.K0 = true;
    }
    
    public final void onMeasure(final int n, int n2) {
        super.onMeasure(n, n2);
        if (!this.O0) {
            return;
        }
        if (View$MeasureSpec.getMode(n2) == 0) {
            return;
        }
        if (((ViewGroup)this).getChildCount() > 0) {
            final View child = ((ViewGroup)this).getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            final int measuredHeight = child.getMeasuredHeight();
            n2 = ((View)this).getMeasuredHeight() - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom() - frameLayout$LayoutParams.topMargin - frameLayout$LayoutParams.bottomMargin;
            if (measuredHeight < n2) {
                child.measure(ViewGroup.getChildMeasureSpec(n, ((View)this).getPaddingRight() + ((View)this).getPaddingLeft() + frameLayout$LayoutParams.leftMargin + frameLayout$LayoutParams.rightMargin, frameLayout$LayoutParams.width), View$MeasureSpec.makeMeasureSpec(n2, 1073741824));
            }
        }
    }
    
    public final boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        if (!b) {
            this.dispatchNestedFling(0.0f, n2, true);
            this.h((int)n2);
            return true;
        }
        return false;
    }
    
    public final boolean onNestedPreFling(final View view, final float n, final float n2) {
        return this.dispatchNestedPreFling(n, n2);
    }
    
    public final void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
        this.e(n, n2, array, null, 0);
    }
    
    public final void onNestedScroll(final View view, final int n, final int n2, final int n3, final int n4) {
        this.s(n4, 0, null);
    }
    
    public final void onNestedScrollAccepted(final View view, final View view2, final int n) {
        this.X0.a(n, 0);
        this.A(2, 0);
    }
    
    public final void onOverScrolled(final int n, final int n2, final boolean b, final boolean b2) {
        super.scrollTo(n, n2);
    }
    
    public final boolean onRequestFocusInDescendants(final int n, final Rect rect) {
        int n2;
        if (n == 2) {
            n2 = 130;
        }
        else if ((n2 = n) == 1) {
            n2 = 33;
        }
        View view;
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus((ViewGroup)this, (View)null, n2);
        }
        else {
            view = FocusFinder.getInstance().findNextFocusFromRect((ViewGroup)this, rect, n2);
        }
        return view != null && !(true ^ this.r(view, 0, ((View)this).getHeight())) && view.requestFocus(n2, rect);
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof NestedScrollView.NestedScrollView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final NestedScrollView.NestedScrollView$SavedState w0 = (NestedScrollView.NestedScrollView$SavedState)parcelable;
        super.onRestoreInstanceState(((AbsSavedState)w0).getSuperState());
        this.W0 = w0;
        this.requestLayout();
    }
    
    public final Parcelable onSaveInstanceState() {
        final NestedScrollView.NestedScrollView$SavedState nestedScrollView$SavedState = new NestedScrollView.NestedScrollView$SavedState(super.onSaveInstanceState());
        nestedScrollView$SavedState.scrollPosition = ((View)this).getScrollY();
        return (Parcelable)nestedScrollView$SavedState;
    }
    
    public final void onScrollChanged(final int n, final int n2, final int n3, final int n4) {
        super.onScrollChanged(n, n2, n3, n4);
        final NestedScrollView.NestedScrollView$c a1 = this.a1;
        if (a1 != null) {
            a1.c(this, n, n2, n3, n4);
        }
    }
    
    public final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        final View focus = ((View)this).findFocus();
        if (focus != null) {
            if (this != focus) {
                if (this.r(focus, 0, n4)) {
                    focus.getDrawingRect(this.E0);
                    ((ViewGroup)this).offsetDescendantRectToMyCoords(focus, this.E0);
                    this.f(this.d(this.E0));
                }
            }
        }
    }
    
    public final boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return (n & 0x2) != 0x0;
    }
    
    public final void onStopNestedScroll(final View view) {
        this.X0.b(0);
        this.C(0);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.N0 == null) {
            this.N0 = VelocityTracker.obtain();
        }
        final int actionMasked = motionEvent.getActionMasked();
        final int n = 0;
        if (actionMasked == 0) {
            this.U0 = 0;
        }
        final MotionEvent obtain = MotionEvent.obtain(motionEvent);
        final float n2 = (float)this.U0;
        float b = 0.0f;
        obtain.offsetLocation(0.0f, n2);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                this.t(motionEvent);
                                this.I0 = (int)motionEvent.getY(motionEvent.findPointerIndex(this.R0));
                            }
                        }
                        else {
                            final int actionIndex = motionEvent.getActionIndex();
                            this.I0 = (int)motionEvent.getY(actionIndex);
                            this.R0 = motionEvent.getPointerId(actionIndex);
                        }
                    }
                    else {
                        if (this.M0 && ((ViewGroup)this).getChildCount() > 0 && this.F0.springBack(((View)this).getScrollX(), ((View)this).getScrollY(), 0, 0, 0, this.getScrollRange())) {
                            final WeakHashMap a = j6x.a;
                            j6x$d.k((View)this);
                        }
                        this.R0 = -1;
                        this.M0 = false;
                        this.v();
                        this.C(0);
                        this.G0.onRelease();
                        this.H0.onRelease();
                    }
                }
                else {
                    final int pointerIndex = motionEvent.findPointerIndex(this.R0);
                    if (pointerIndex == -1) {
                        final StringBuilder j = fu8.j("Invalid pointerId=");
                        j.append(this.R0);
                        j.append(" in onTouchEvent");
                        Log.e("NestedScrollView", j.toString());
                    }
                    else {
                        final int n3 = (int)motionEvent.getY(pointerIndex);
                        final int n4 = this.I0 - n3;
                        final float n5 = motionEvent.getX(pointerIndex) / ((View)this).getWidth();
                        final float n6 = n4 / (float)((View)this).getHeight();
                        if (pp9.a(this.G0) != 0.0f) {
                            b = -pp9.b(this.G0, -n6, n5);
                            if (pp9.a(this.G0) == 0.0f) {
                                this.G0.onRelease();
                                b = b;
                            }
                        }
                        else if (pp9.a(this.H0) != 0.0f) {
                            final float n7 = b = pp9.b(this.H0, n6, 1.0f - n5);
                            if (pp9.a(this.H0) == 0.0f) {
                                this.H0.onRelease();
                                b = n7;
                            }
                        }
                        final int round = Math.round(b * ((View)this).getHeight());
                        if (round != 0) {
                            ((View)this).invalidate();
                        }
                        int n9;
                        final int n8 = n9 = n4 - round;
                        if (!this.M0) {
                            n9 = n8;
                            if (Math.abs(n8) > this.mTouchSlop) {
                                final ViewParent parent = ((View)this).getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                this.M0 = true;
                                if (n8 > 0) {
                                    n9 = n8 - this.mTouchSlop;
                                }
                                else {
                                    n9 = n8 + this.mTouchSlop;
                                }
                            }
                        }
                        if (this.M0) {
                            int n10 = n9;
                            if (this.e(0, n9, this.T0, this.S0, 0)) {
                                n10 = n9 - this.T0[1];
                                this.U0 += this.S0[1];
                            }
                            this.I0 = n3 - this.S0[1];
                            final int scrollY = ((View)this).getScrollY();
                            final int scrollRange = this.getScrollRange();
                            final int overScrollMode = ((View)this).getOverScrollMode();
                            final boolean b2 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                            int n11;
                            if (this.u(n10, 0, ((View)this).getScrollY(), scrollRange) && !this.p(0)) {
                                n11 = 1;
                            }
                            else {
                                n11 = 0;
                            }
                            final int n12 = ((View)this).getScrollY() - scrollY;
                            final int[] t0 = this.T0;
                            t0[1] = 0;
                            this.Y0.f(0, n12, 0, n10 - n12, this.S0, 0, t0);
                            final int i0 = this.I0;
                            final int[] s0 = this.S0;
                            this.I0 = i0 - s0[1];
                            this.U0 += s0[1];
                            if (b2) {
                                final int n13 = n10 - this.T0[1];
                                final int n14 = scrollY + n13;
                                if (n14 < 0) {
                                    pp9.b(this.G0, -n13 / (float)((View)this).getHeight(), motionEvent.getX(pointerIndex) / ((View)this).getWidth());
                                    if (!this.H0.isFinished()) {
                                        this.H0.onRelease();
                                    }
                                }
                                else if (n14 > scrollRange) {
                                    pp9.b(this.H0, n13 / (float)((View)this).getHeight(), 1.0f - motionEvent.getX(pointerIndex) / ((View)this).getWidth());
                                    if (!this.G0.isFinished()) {
                                        this.G0.onRelease();
                                    }
                                }
                                if (!this.G0.isFinished() || !this.H0.isFinished()) {
                                    final WeakHashMap a2 = j6x.a;
                                    j6x$d.k((View)this);
                                    n11 = n;
                                }
                            }
                            if (n11 != 0) {
                                this.N0.clear();
                            }
                        }
                    }
                }
            }
            else {
                final VelocityTracker n15 = this.N0;
                n15.computeCurrentVelocity(1000, (float)this.Q0);
                final int n16 = (int)n15.getYVelocity(this.R0);
                if (Math.abs(n16) >= this.mMinimumVelocity) {
                    boolean b3 = false;
                    Label_1044: {
                        if (pp9.a(this.G0) != 0.0f) {
                            this.G0.onAbsorb(n16);
                        }
                        else {
                            if (pp9.a(this.H0) == 0.0f) {
                                b3 = false;
                                break Label_1044;
                            }
                            this.H0.onAbsorb(-n16);
                        }
                        b3 = true;
                    }
                    if (!b3) {
                        final int n17 = -n16;
                        final float n18 = (float)n17;
                        if (!this.dispatchNestedPreFling(0.0f, n18)) {
                            this.dispatchNestedFling(0.0f, n18, true);
                            this.h(n17);
                        }
                    }
                }
                else if (this.F0.springBack(((View)this).getScrollX(), ((View)this).getScrollY(), 0, 0, 0, this.getScrollRange())) {
                    final WeakHashMap a3 = j6x.a;
                    j6x$d.k((View)this);
                }
                this.R0 = -1;
                this.M0 = false;
                this.v();
                this.C(0);
                this.G0.onRelease();
                this.H0.onRelease();
            }
        }
        else {
            if (((ViewGroup)this).getChildCount() == 0) {
                return false;
            }
            if (this.M0) {
                final ViewParent parent2 = ((View)this).getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
            }
            if (!this.F0.isFinished()) {
                this.a();
            }
            this.I0 = (int)motionEvent.getY();
            this.R0 = motionEvent.getPointerId(0);
            this.A(2, 0);
        }
        final VelocityTracker n19 = this.N0;
        if (n19 != null) {
            n19.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }
    
    public final boolean p(final int n) {
        return this.Y0.h(n);
    }
    
    public final boolean r(final View view, final int n, final int n2) {
        view.getDrawingRect(this.E0);
        ((ViewGroup)this).offsetDescendantRectToMyCoords(view, this.E0);
        return this.E0.bottom + n >= ((View)this).getScrollY() && this.E0.top - n <= ((View)this).getScrollY() + n2;
    }
    
    public final void requestChildFocus(final View view, final View l0) {
        if (!this.J0) {
            this.y(l0);
        }
        else {
            this.L0 = l0;
        }
        super.requestChildFocus(view, l0);
    }
    
    public final boolean requestChildRectangleOnScreen(final View view, final Rect rect, final boolean b) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        final int d = this.d(rect);
        final boolean b2 = d != 0;
        if (b2) {
            if (b) {
                ((View)this).scrollBy(0, d);
            }
            else {
                this.z(0, d, false);
            }
        }
        return b2;
    }
    
    public final void requestDisallowInterceptTouchEvent(final boolean b) {
        if (b) {
            this.v();
        }
        super.requestDisallowInterceptTouchEvent(b);
    }
    
    public final void requestLayout() {
        this.J0 = true;
        super.requestLayout();
    }
    
    public final void s(final int n, final int n2, final int[] array) {
        final int scrollY = ((View)this).getScrollY();
        ((View)this).scrollBy(0, n);
        final int n3 = ((View)this).getScrollY() - scrollY;
        if (array != null) {
            array[1] += n3;
        }
        this.Y0.f(0, n3, 0, n - n3, (int[])null, n2, array);
    }
    
    public final void scrollTo(int c, int c2) {
        if (((ViewGroup)this).getChildCount() > 0) {
            final View child = ((ViewGroup)this).getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            final int width = ((View)this).getWidth();
            final int paddingLeft = ((View)this).getPaddingLeft();
            final int paddingRight = ((View)this).getPaddingRight();
            final int width2 = child.getWidth();
            final int leftMargin = frameLayout$LayoutParams.leftMargin;
            final int rightMargin = frameLayout$LayoutParams.rightMargin;
            final int height = ((View)this).getHeight();
            final int paddingTop = ((View)this).getPaddingTop();
            final int paddingBottom = ((View)this).getPaddingBottom();
            final int height2 = child.getHeight();
            final int topMargin = frameLayout$LayoutParams.topMargin;
            final int bottomMargin = frameLayout$LayoutParams.bottomMargin;
            c = c(c, width - paddingLeft - paddingRight, width2 + leftMargin + rightMargin);
            c2 = c(c2, height - paddingTop - paddingBottom, height2 + topMargin + bottomMargin);
            if (c != ((View)this).getScrollX() || c2 != ((View)this).getScrollY()) {
                super.scrollTo(c, c2);
            }
        }
    }
    
    public void setFillViewport(final boolean o0) {
        if (o0 != this.O0) {
            this.O0 = o0;
            this.requestLayout();
        }
    }
    
    public void setNestedScrollingEnabled(final boolean b) {
        this.Y0.i(b);
    }
    
    public void setOnScrollChangeListener(final NestedScrollView.NestedScrollView$c a1) {
        this.a1 = a1;
    }
    
    public void setSmoothScrollingEnabled(final boolean p) {
        this.P0 = p;
    }
    
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
    
    public final boolean startNestedScroll(final int n) {
        return this.A(n, 0);
    }
    
    public final void stopNestedScroll() {
        this.C(0);
    }
    
    public final void t(final MotionEvent motionEvent) {
        final int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.R0) {
            int n;
            if (actionIndex == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.I0 = (int)motionEvent.getY(n);
            this.R0 = motionEvent.getPointerId(n);
            final VelocityTracker n2 = this.N0;
            if (n2 != null) {
                n2.clear();
            }
        }
    }
    
    public final boolean u(int n, int n2, int n3, final int n4) {
        ((View)this).getOverScrollMode();
        this.computeHorizontalScrollRange();
        this.computeHorizontalScrollExtent();
        this.computeVerticalScrollRange();
        this.computeVerticalScrollExtent();
        final boolean b = true;
        n2 += 0;
        n += n3;
        n3 = n4 + 0;
        boolean b2 = false;
        Label_0062: {
            if (n2 <= 0) {
                if (n2 >= 0) {
                    b2 = false;
                    break Label_0062;
                }
            }
            b2 = true;
            n2 = 0;
        }
        boolean b3 = false;
        Label_0087: {
            if (n > n3) {
                n = n3;
            }
            else {
                if (n >= 0) {
                    b3 = false;
                    break Label_0087;
                }
                n = 0;
            }
            b3 = true;
        }
        if (b3 && !this.p(1)) {
            this.F0.springBack(n2, n, 0, 0, 0, this.getScrollRange());
        }
        this.onOverScrolled(n2, n, b2, b3);
        boolean b4 = b;
        if (!b2) {
            b4 = (b3 && b);
        }
        return b4;
    }
    
    public final void v() {
        final VelocityTracker n0 = this.N0;
        if (n0 != null) {
            n0.recycle();
            this.N0 = null;
        }
    }
    
    public final void w(final boolean b) {
        if (b) {
            this.A(2, 1);
        }
        else {
            this.C(1);
        }
        this.V0 = ((View)this).getScrollY();
        final WeakHashMap a = j6x.a;
        j6x$d.k((View)this);
    }
    
    public final boolean x(final int n, int n2, final int n3) {
        final int height = ((View)this).getHeight();
        final int scrollY = ((View)this).getScrollY();
        final int n4 = height + scrollY;
        final boolean b = n == 33;
        final ArrayList focusables = ((View)this).getFocusables(2);
        final int size = focusables.size();
        View view = null;
        int i = 0;
        int n5 = 0;
        while (i < size) {
            final View view2 = (View)focusables.get(i);
            final int top = view2.getTop();
            final int bottom = view2.getBottom();
            View view3 = view;
            int n6 = n5;
            Label_0268: {
                if (n2 < bottom) {
                    view3 = view;
                    n6 = n5;
                    if (top < n3) {
                        final boolean b2 = n2 < top && bottom < n3;
                        if (view == null) {
                            view3 = view2;
                            n6 = (b2 ? 1 : 0);
                        }
                        else {
                            final boolean b3 = (b && top < view.getTop()) || (!b && bottom > view.getBottom());
                            if (n5 != 0) {
                                view3 = view;
                                n6 = n5;
                                if (!b2) {
                                    break Label_0268;
                                }
                                view3 = view;
                                n6 = n5;
                                if (!b3) {
                                    break Label_0268;
                                }
                            }
                            else {
                                if (b2) {
                                    view3 = view2;
                                    n6 = 1;
                                    break Label_0268;
                                }
                                view3 = view;
                                n6 = n5;
                                if (!b3) {
                                    break Label_0268;
                                }
                            }
                            view3 = view2;
                            n6 = n5;
                        }
                    }
                }
            }
            ++i;
            view = view3;
            n5 = n6;
        }
        Object o;
        if ((o = view) == null) {
            o = this;
        }
        boolean b4;
        if (n2 >= scrollY && n3 <= n4) {
            b4 = false;
        }
        else {
            if (b) {
                n2 -= scrollY;
            }
            else {
                n2 = n3 - n4;
            }
            this.f(n2);
            b4 = true;
        }
        if (o != ((View)this).findFocus()) {
            ((View)o).requestFocus(n);
        }
        return b4;
    }
    
    public final void y(final View view) {
        view.getDrawingRect(this.E0);
        ((ViewGroup)this).offsetDescendantRectToMyCoords(view, this.E0);
        final int d = this.d(this.E0);
        if (d != 0) {
            ((View)this).scrollBy(0, d);
        }
    }
    
    public final void z(int scrollY, int max, final boolean b) {
        if (((ViewGroup)this).getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.D0 > 250L) {
            final View child = ((ViewGroup)this).getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            final int height = child.getHeight();
            final int topMargin = frameLayout$LayoutParams.topMargin;
            final int bottomMargin = frameLayout$LayoutParams.bottomMargin;
            final int height2 = ((View)this).getHeight();
            final int paddingTop = ((View)this).getPaddingTop();
            final int paddingBottom = ((View)this).getPaddingBottom();
            scrollY = ((View)this).getScrollY();
            max = Math.max(0, Math.min(max + scrollY, Math.max(0, height + topMargin + bottomMargin - (height2 - paddingTop - paddingBottom))));
            this.F0.startScroll(((View)this).getScrollX(), scrollY, 0, max - scrollY, 250);
            this.w(b);
        }
        else {
            if (!this.F0.isFinished()) {
                this.a();
            }
            ((View)this).scrollBy(scrollY, max);
        }
        this.D0 = AnimationUtils.currentAnimationTimeMillis();
    }
}
