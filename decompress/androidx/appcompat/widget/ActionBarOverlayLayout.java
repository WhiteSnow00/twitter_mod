// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.ViewGroup$MarginLayoutParams;
import android.view.Window$Callback;
import android.content.res.TypedArray;
import androidx.appcompat.app.i;
import android.os.Build$VERSION;
import android.content.res.Configuration;
import java.util.WeakHashMap;
import android.view.WindowInsets;
import android.view.View;
import android.graphics.Canvas;
import androidx.appcompat.view.menu.i$a;
import android.view.Menu;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.OverScroller;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.annotation.SuppressLint;
import android.view.ViewGroup;

@SuppressLint({ "UnknownNullness" })
public class ActionBarOverlayLayout extends ViewGroup implements dc8, cci, dci
{
    public static final int[] e1;
    public int D0;
    public int E0;
    public ContentFrameLayout F0;
    public ActionBarContainer G0;
    public ec8 H0;
    public Drawable I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public int O0;
    public int P0;
    public final Rect Q0;
    public final Rect R0;
    public final Rect S0;
    public opx T0;
    public opx U0;
    public opx V0;
    public opx W0;
    public d X0;
    public OverScroller Y0;
    public ViewPropertyAnimator Z0;
    public final ActionBarOverlayLayout$a a1;
    public final ActionBarOverlayLayout$b b1;
    public final ActionBarOverlayLayout$c c1;
    public final ckc d1;
    
    static {
        e1 = new int[] { 2130968605, 16842841 };
    }
    
    public ActionBarOverlayLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.E0 = 0;
        this.Q0 = new Rect();
        this.R0 = new Rect();
        this.S0 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        final opx b = opx.b;
        this.T0 = b;
        this.U0 = b;
        this.V0 = b;
        this.W0 = b;
        this.a1 = new ActionBarOverlayLayout$a(this);
        this.b1 = new ActionBarOverlayLayout$b(this);
        this.c1 = new ActionBarOverlayLayout$c(this);
        this.r(context);
        this.d1 = new ckc();
    }
    
    public final boolean a() {
        this.s();
        return this.H0.a();
    }
    
    public final boolean b() {
        this.s();
        return this.H0.b();
    }
    
    public final boolean c() {
        this.s();
        return this.H0.c();
    }
    
    public final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof e;
    }
    
    public final void d(final Menu menu, final i$a i$a) {
        this.s();
        this.H0.d(menu, i$a);
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        if (this.I0 != null && !this.J0) {
            int n;
            if (((View)this.G0).getVisibility() == 0) {
                n = (int)(((View)this.G0).getTranslationY() + ((View)this.G0).getBottom() + 0.5f);
            }
            else {
                n = 0;
            }
            this.I0.setBounds(0, n, ((View)this).getWidth(), this.I0.getIntrinsicHeight() + n);
            this.I0.draw(canvas);
        }
    }
    
    public final boolean e() {
        this.s();
        return this.H0.e();
    }
    
    public final void f() {
        this.s();
        this.H0.f();
    }
    
    public final boolean fitSystemWindows(final Rect rect) {
        return super.fitSystemWindows(rect);
    }
    
    public final boolean g() {
        this.s();
        return this.H0.g();
    }
    
    public final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new e();
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new e(((View)this).getContext(), set);
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new e(viewGroup$LayoutParams);
    }
    
    public int getActionBarHideOffset() {
        final ActionBarContainer g0 = this.G0;
        int n;
        if (g0 != null) {
            n = -(int)((View)g0).getTranslationY();
        }
        else {
            n = 0;
        }
        return n;
    }
    
    public int getNestedScrollAxes() {
        final ckc d1 = this.d1;
        return d1.b | d1.a;
    }
    
    public CharSequence getTitle() {
        this.s();
        return this.H0.getTitle();
    }
    
    public final void h(final int n) {
        this.s();
        if (n != 2) {
            if (n != 5) {
                if (n == 109) {
                    this.setOverlayMode(true);
                }
            }
            else {
                this.H0.r();
            }
        }
        else {
            this.H0.k();
        }
    }
    
    public final void i(final View view, final View view2, final int n, final int n2) {
        if (n2 == 0) {
            this.onNestedScrollAccepted(view, view2, n);
        }
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
    
    public final void l() {
        this.s();
        this.H0.m();
    }
    
    public final void m(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        if (n5 == 0) {
            this.onNestedScroll(view, n, n2, n3, n4);
        }
    }
    
    public final void n(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n5 == 0) {
            this.onNestedScroll(view, n, n2, n3, n4);
        }
    }
    
    public final boolean o(final View view, final View view2, final int n, final int n2) {
        return n2 == 0 && this.onStartNestedScroll(view, view2, n);
    }
    
    public final WindowInsets onApplyWindowInsets(final WindowInsets windowInsets) {
        this.s();
        final opx o = opx.o(windowInsets, (View)this);
        int p = this.p((View)this.G0, new Rect(o.g(), o.i(), o.h(), o.f()), false) ? 1 : 0;
        final Rect q0 = this.Q0;
        final WeakHashMap a = j6x.a;
        j6x$i.b((View)this, o, q0);
        final Rect q2 = this.Q0;
        final opx n = o.a.n(q2.left, q2.top, q2.right, q2.bottom);
        this.T0 = n;
        final boolean equals = this.U0.equals((Object)n);
        final int n2 = 1;
        if (!equals) {
            this.U0 = this.T0;
            p = 1;
        }
        if (!this.R0.equals((Object)this.Q0)) {
            this.R0.set(this.Q0);
            p = n2;
        }
        if (p != 0) {
            ((View)this).requestLayout();
        }
        return o.a.a().a().a.b().n();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.r(((View)this).getContext());
        final WeakHashMap a = j6x.a;
        j6x$h.c((View)this);
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q();
    }
    
    public final void onLayout(final boolean b, int i, int paddingLeft, int paddingTop, int childCount) {
        childCount = this.getChildCount();
        paddingLeft = ((View)this).getPaddingLeft();
        paddingTop = ((View)this).getPaddingTop();
        View child;
        e e;
        int measuredWidth;
        int measuredHeight;
        int n;
        int n2;
        for (i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                e = (e)child.getLayoutParams();
                measuredWidth = child.getMeasuredWidth();
                measuredHeight = child.getMeasuredHeight();
                n = e.leftMargin + paddingLeft;
                n2 = e.topMargin + paddingTop;
                child.layout(n, n2, measuredWidth + n, measuredHeight + n2);
            }
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        this.s();
        this.measureChildWithMargins((View)this.G0, n, 0, n2, 0);
        final e e = (e)((View)this.G0).getLayoutParams();
        final int max = Math.max(0, ((View)this.G0).getMeasuredWidth() + e.leftMargin + e.rightMargin);
        final int max2 = Math.max(0, ((View)this.G0).getMeasuredHeight() + e.topMargin + e.bottomMargin);
        final int combineMeasuredStates = View.combineMeasuredStates(0, ((View)this.G0).getMeasuredState());
        final WeakHashMap a = j6x.a;
        final boolean b = (j6x$d.g((View)this) & 0x100) != 0x0;
        int n4;
        if (b) {
            final int n3 = n4 = this.D0;
            if (this.L0) {
                n4 = n3;
                if (this.G0.getTabContainer() != null) {
                    n4 = n3 + this.D0;
                }
            }
        }
        else if (((View)this.G0).getVisibility() != 8) {
            n4 = ((View)this.G0).getMeasuredHeight();
        }
        else {
            n4 = 0;
        }
        this.S0.set(this.Q0);
        final opx t0 = this.T0;
        this.V0 = t0;
        if (!this.K0 && !b) {
            final Rect s0 = this.S0;
            s0.top += n4;
            s0.bottom += 0;
            this.V0 = t0.a.n(0, n4, 0, 0);
        }
        else {
            final jrd b2 = jrd.b(t0.g(), this.V0.i() + n4, this.V0.h(), this.V0.f() + 0);
            final opx v0 = this.V0;
            final int sdk_INT = Build$VERSION.SDK_INT;
            Object o;
            if (sdk_INT >= 30) {
                o = new opx.d(v0);
            }
            else if (sdk_INT >= 29) {
                o = new opx$c(v0);
            }
            else {
                o = new opx$b(v0);
            }
            ((opx$e)o).g(b2);
            this.V0 = ((opx$e)o).b();
        }
        this.p((View)this.F0, this.S0, true);
        if (!this.W0.equals((Object)this.V0)) {
            final opx v2 = this.V0;
            this.W0 = v2;
            j6x.f((View)this.F0, v2);
        }
        this.measureChildWithMargins((View)this.F0, n, 0, n2, 0);
        final e e2 = (e)((View)this.F0).getLayoutParams();
        final int max3 = Math.max(max, ((View)this.F0).getMeasuredWidth() + e2.leftMargin + e2.rightMargin);
        final int max4 = Math.max(max2, ((View)this.F0).getMeasuredHeight() + e2.topMargin + e2.bottomMargin);
        final int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, ((View)this.F0).getMeasuredState());
        ((View)this).setMeasuredDimension(View.resolveSizeAndState(Math.max(((View)this).getPaddingRight() + ((View)this).getPaddingLeft() + max3, ((View)this).getSuggestedMinimumWidth()), n, combineMeasuredStates2), View.resolveSizeAndState(Math.max(((View)this).getPaddingBottom() + ((View)this).getPaddingTop() + max4, ((View)this).getSuggestedMinimumHeight()), n2, combineMeasuredStates2 << 16));
    }
    
    public final boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        final boolean m0 = this.M0;
        boolean b2 = false;
        if (m0 && b) {
            this.Y0.fling(0, 0, 0, (int)n2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.Y0.getFinalY() > ((View)this.G0).getHeight()) {
                b2 = true;
            }
            if (b2) {
                this.q();
                this.c1.run();
            }
            else {
                this.q();
                this.b1.run();
            }
            return this.N0 = true;
        }
        return false;
    }
    
    public final boolean onNestedPreFling(final View view, final float n, final float n2) {
        return false;
    }
    
    public final void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
    }
    
    public final void onNestedScroll(final View view, int o0, final int n, final int n2, final int n3) {
        o0 = this.O0 + n;
        this.setActionBarHideOffset(this.O0 = o0);
    }
    
    public final void onNestedScrollAccepted(final View view, final View view2, final int n) {
        this.d1.a(n, 0);
        this.O0 = this.getActionBarHideOffset();
        this.q();
        final d x0 = this.X0;
        if (x0 != null) {
            final i i = (i)x0;
            final xax t = i.t;
            if (t != null) {
                t.a();
                i.t = null;
            }
        }
    }
    
    public final boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return (n & 0x2) != 0x0 && ((View)this.G0).getVisibility() == 0 && this.M0;
    }
    
    public final void onStopNestedScroll(final View view) {
        if (this.M0 && !this.N0) {
            if (this.O0 <= ((View)this.G0).getHeight()) {
                this.q();
                ((View)this).postDelayed((Runnable)this.b1, 600L);
            }
            else {
                this.q();
                ((View)this).postDelayed((Runnable)this.c1, 600L);
            }
        }
    }
    
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(final int p) {
        super.onWindowSystemUiVisibilityChanged(p);
        this.s();
        final int p2 = this.P0;
        this.P0 = p;
        final boolean b = (p & 0x4) == 0x0;
        final boolean b2 = (p & 0x100) != 0x0;
        final d x0 = this.X0;
        if (x0 != null) {
            ((i)x0).p = (b2 ^ true);
            if (!b && b2) {
                final i i = (i)x0;
                if (!i.q) {
                    i.A(i.q = true);
                }
            }
            else {
                final i j = (i)x0;
                if (j.q) {
                    j.q = false;
                    j.A(true);
                }
            }
        }
        if (((p2 ^ p) & 0x100) != 0x0 && this.X0 != null) {
            final WeakHashMap a = j6x.a;
            j6x$h.c((View)this);
        }
    }
    
    public final void onWindowVisibilityChanged(final int n) {
        super.onWindowVisibilityChanged(n);
        this.E0 = n;
        final d x0 = this.X0;
        if (x0 != null) {
            ((i)x0).o = n;
        }
    }
    
    public final boolean p(final View view, final Rect rect, final boolean b) {
        final e e = (e)view.getLayoutParams();
        final int leftMargin = e.leftMargin;
        final int left = rect.left;
        final boolean b2 = true;
        boolean b3;
        if (leftMargin != left) {
            e.leftMargin = left;
            b3 = true;
        }
        else {
            b3 = false;
        }
        final int topMargin = e.topMargin;
        final int top = rect.top;
        if (topMargin != top) {
            e.topMargin = top;
            b3 = true;
        }
        final int rightMargin = e.rightMargin;
        final int right = rect.right;
        if (rightMargin != right) {
            e.rightMargin = right;
            b3 = true;
        }
        if (b) {
            final int bottomMargin = e.bottomMargin;
            final int bottom = rect.bottom;
            if (bottomMargin != bottom) {
                e.bottomMargin = bottom;
                b3 = b2;
            }
        }
        return b3;
    }
    
    public final void q() {
        ((View)this).removeCallbacks((Runnable)this.b1);
        ((View)this).removeCallbacks((Runnable)this.c1);
        final ViewPropertyAnimator z0 = this.Z0;
        if (z0 != null) {
            z0.cancel();
        }
    }
    
    public final void r(final Context context) {
        final TypedArray obtainStyledAttributes = ((View)this).getContext().getTheme().obtainStyledAttributes(ActionBarOverlayLayout.e1);
        final boolean b = false;
        this.D0 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        final Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.I0 = drawable;
        ((View)this).setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        boolean j0 = b;
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            j0 = true;
        }
        this.J0 = j0;
        this.Y0 = new OverScroller(context);
    }
    
    public final void s() {
        if (this.F0 == null) {
            this.F0 = (ContentFrameLayout)((View)this).findViewById(2131427440);
            this.G0 = (ActionBarContainer)((View)this).findViewById(2131427441);
            final View viewById = ((View)this).findViewById(2131427439);
            ec8 wrapper;
            if (viewById instanceof ec8) {
                wrapper = (ec8)viewById;
            }
            else {
                if (!(viewById instanceof Toolbar)) {
                    final StringBuilder j = fu8.j("Can't make a decor toolbar out of ");
                    j.append(((Toolbar)viewById).getClass().getSimpleName());
                    throw new IllegalStateException(j.toString());
                }
                wrapper = ((Toolbar)viewById).getWrapper();
            }
            this.H0 = wrapper;
        }
    }
    
    public void setActionBarHideOffset(int max) {
        this.q();
        max = Math.max(0, Math.min(max, ((View)this.G0).getHeight()));
        ((View)this.G0).setTranslationY((float)(-max));
    }
    
    public void setActionBarVisibilityCallback(d x0) {
        this.X0 = x0;
        if (((View)this).getWindowToken() != null) {
            x0 = this.X0;
            ((i)x0).o = this.E0;
            final int p = this.P0;
            if (p != 0) {
                this.onWindowSystemUiVisibilityChanged(p);
                final WeakHashMap a = j6x.a;
                j6x$h.c((View)this);
            }
        }
    }
    
    public void setHasNonEmbeddedTabs(final boolean l0) {
        this.L0 = l0;
    }
    
    public void setHideOnContentScrollEnabled(final boolean m0) {
        if (m0 != this.M0 && !(this.M0 = m0)) {
            this.q();
            this.setActionBarHideOffset(0);
        }
    }
    
    public void setIcon(final int icon) {
        this.s();
        this.H0.setIcon(icon);
    }
    
    public void setIcon(final Drawable icon) {
        this.s();
        this.H0.setIcon(icon);
    }
    
    public void setLogo(final int n) {
        this.s();
        this.H0.p(n);
    }
    
    public void setOverlayMode(final boolean k0) {
        this.K0 = k0;
        this.J0 = (k0 && ((View)this).getContext().getApplicationInfo().targetSdkVersion < 19);
    }
    
    public void setShowingForActionMode(final boolean b) {
    }
    
    public void setUiOptions(final int n) {
    }
    
    public void setWindowCallback(final Window$Callback windowCallback) {
        this.s();
        this.H0.setWindowCallback(windowCallback);
    }
    
    public void setWindowTitle(final CharSequence windowTitle) {
        this.s();
        this.H0.setWindowTitle(windowTitle);
    }
    
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public interface d
    {
    }
    
    public static final class e extends ViewGroup$MarginLayoutParams
    {
        public e() {
            super(-1, -1);
        }
        
        public e(final Context context, final AttributeSet set) {
            super(context, set);
        }
        
        public e(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
        }
    }
}
