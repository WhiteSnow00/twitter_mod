// 
// Decompiled by Procyon v0.6.0
// 

package androidx.viewpager.widget;

import android.database.DataSetObserver;
import android.content.res.TypedArray;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Inherited;
import android.content.res.Resources$NotFoundException;
import java.util.Objects;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import java.util.Collections;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityEvent;
import android.view.KeyEvent;
import android.view.ViewParent;
import android.view.SoundEffectConstants;
import android.view.FocusFinder;
import android.util.Log;
import java.util.WeakHashMap;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import java.util.List;
import android.widget.EdgeEffect;
import android.view.VelocityTracker;
import android.graphics.drawable.Drawable;
import android.widget.Scroller;
import android.os.Parcelable;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Comparator;
import android.view.animation.Interpolator;
import android.view.ViewGroup;

public class ViewPager extends ViewGroup
{
    public static final Interpolator A1;
    public static final int[] y1;
    public static final Comparator<e> z1;
    public int C0;
    public final ArrayList<e> D0;
    public final e E0;
    public final Rect F0;
    public cuj G0;
    public int H0;
    public int I0;
    public Parcelable J0;
    public ClassLoader K0;
    public Scroller L0;
    public boolean M0;
    public j N0;
    public int O0;
    public Drawable P0;
    public int Q0;
    public int R0;
    public float S0;
    public float T0;
    public int U0;
    public boolean V0;
    public boolean W0;
    public boolean X0;
    public int Y0;
    public boolean Z0;
    public boolean a1;
    public int b1;
    public int c1;
    public int d1;
    public float e1;
    public float f1;
    public float g1;
    public float h1;
    public int i1;
    public VelocityTracker j1;
    public int k1;
    public int l1;
    public int m1;
    public int n1;
    public EdgeEffect o1;
    public EdgeEffect p1;
    public boolean q1;
    public boolean r1;
    public int s1;
    public List<i> t1;
    public i u1;
    public List<h> v1;
    public final ViewPager$c w1;
    public int x1;
    
    static {
        y1 = new int[] { 16842931 };
        ViewPager.z1 = new Comparator<e>() {
            @Override
            public final int compare(final Object o, final Object o2) {
                return ((e)o).b - ((e)o2).b;
            }
        };
        A1 = (Interpolator)new Interpolator() {
            public final float getInterpolation(float n) {
                --n;
                return n * n * n * n * n + 1.0f;
            }
        };
    }
    
    public ViewPager(Context context, final AttributeSet set) {
        super(context, set);
        this.D0 = new ArrayList<e>();
        this.E0 = new e();
        this.F0 = new Rect();
        this.I0 = -1;
        this.J0 = null;
        this.K0 = null;
        this.S0 = -3.4028235E38f;
        this.T0 = Float.MAX_VALUE;
        this.Y0 = 1;
        this.i1 = -1;
        this.q1 = true;
        this.w1 = new Runnable() {
            @Override
            public final void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.s();
            }
        };
        this.x1 = 0;
        ((View)this).setWillNotDraw(false);
        this.setDescendantFocusability(262144);
        ((View)this).setFocusable(true);
        context = ((View)this).getContext();
        this.L0 = new Scroller(context, ViewPager.A1);
        final ViewConfiguration value = ViewConfiguration.get(context);
        final float density = context.getResources().getDisplayMetrics().density;
        this.d1 = value.getScaledPagingTouchSlop();
        this.k1 = (int)(400.0f * density);
        this.l1 = value.getScaledMaximumFlingVelocity();
        this.o1 = new EdgeEffect(context);
        this.p1 = new EdgeEffect(context);
        this.m1 = (int)(25.0f * density);
        this.n1 = (int)(2.0f * density);
        this.b1 = (int)(density * 16.0f);
        p5x.z((View)this, (wf)new ViewPager.ViewPager$g(this));
        if (p5x$d.c((View)this) == 0) {
            p5x$d.s((View)this, 1);
        }
        p5x$i.u((View)this, (ogj)new o9x(this));
    }
    
    private int getClientWidth() {
        return ((View)this).getMeasuredWidth() - ((View)this).getPaddingLeft() - ((View)this).getPaddingRight();
    }
    
    private void setScrollingCacheEnabled(final boolean w0) {
        if (this.W0 != w0) {
            this.W0 = w0;
        }
    }
    
    public void A(final int n, final boolean b) {
        this.B(n, b, this.X0 = false, 0);
    }
    
    public final void B(int i, final boolean b, final boolean b2, final int n) {
        final cuj g0 = this.G0;
        final boolean b3 = false;
        if (g0 == null || g0.getCount() <= 0) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        if (!b2 && this.H0 == i && this.D0.size() != 0) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        int h0;
        if (i < 0) {
            h0 = 0;
        }
        else if ((h0 = i) >= this.G0.getCount()) {
            h0 = this.G0.getCount() - 1;
        }
        final int y0 = this.Y0;
        i = this.H0;
        if (h0 > i + y0 || h0 < i - y0) {
            for (i = 0; i < this.D0.size(); ++i) {
                this.D0.get(i).c = true;
            }
        }
        boolean b4 = b3;
        if (this.H0 != h0) {
            b4 = true;
        }
        if (this.q1) {
            this.H0 = h0;
            if (b4) {
                this.h(h0);
            }
            ((View)this).requestLayout();
        }
        else {
            this.t(h0);
            this.z(h0, b, n, b4);
        }
    }
    
    public final e a(final int b, final int n) {
        final e e = new e();
        e.b = b;
        e.a = this.G0.F((ViewGroup)this, b);
        e.d = this.G0.D(b);
        if (n >= 0 && n < this.D0.size()) {
            this.D0.add(n, e);
        }
        else {
            this.D0.add(e);
        }
        return e;
    }
    
    public final void addFocusables(final ArrayList<View> list, final int n, final int n2) {
        final int size = list.size();
        final int descendantFocusability = this.getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i = 0; i < this.getChildCount(); ++i) {
                final View child = this.getChildAt(i);
                if (child.getVisibility() == 0) {
                    final e j = this.j(child);
                    if (j != null && j.b == this.H0) {
                        child.addFocusables((ArrayList)list, n, n2);
                    }
                }
            }
        }
        if (descendantFocusability != 262144 || size == list.size()) {
            if (!((View)this).isFocusable()) {
                return;
            }
            if ((n2 & 0x1) == 0x1 && ((View)this).isInTouchMode() && !((View)this).isFocusableInTouchMode()) {
                return;
            }
            list.add((View)this);
        }
    }
    
    public final void addTouchables(final ArrayList<View> list) {
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() == 0) {
                final e j = this.j(child);
                if (j != null && j.b == this.H0) {
                    child.addTouchables((ArrayList)list);
                }
            }
        }
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        ViewGroup$LayoutParams generateLayoutParams = viewGroup$LayoutParams;
        if (!this.checkLayoutParams(viewGroup$LayoutParams)) {
            generateLayoutParams = this.generateLayoutParams(viewGroup$LayoutParams);
        }
        final f f = (f)generateLayoutParams;
        final boolean a = f.a | view.getClass().getAnnotation(d.class) != null;
        f.a = a;
        if (this.V0) {
            if (a) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            f.d = true;
            this.addViewInLayout(view, n, generateLayoutParams);
        }
        else {
            super.addView(view, n, generateLayoutParams);
        }
    }
    
    public void b(final h h) {
        if (this.v1 == null) {
            this.v1 = new ArrayList();
        }
        this.v1.add(h);
    }
    
    public void c(final i i) {
        if (this.t1 == null) {
            this.t1 = new ArrayList();
        }
        this.t1.add(i);
    }
    
    public boolean canScrollHorizontally(final int n) {
        final cuj g0 = this.G0;
        final boolean b = false;
        boolean b2 = false;
        if (g0 == null) {
            return false;
        }
        final int clientWidth = this.getClientWidth();
        final int scrollX = ((View)this).getScrollX();
        if (n < 0) {
            if (scrollX > (int)(clientWidth * this.S0)) {
                b2 = true;
            }
            return b2;
        }
        boolean b3 = b;
        if (n > 0) {
            b3 = b;
            if (scrollX < (int)(clientWidth * this.T0)) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof f && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public final void computeScroll() {
        this.M0 = true;
        if (!this.L0.isFinished() && this.L0.computeScrollOffset()) {
            final int scrollX = ((View)this).getScrollX();
            final int scrollY = ((View)this).getScrollY();
            final int currX = this.L0.getCurrX();
            final int currY = this.L0.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                ((View)this).scrollTo(currX, currY);
                if (!this.q(currX)) {
                    this.L0.abortAnimation();
                    ((View)this).scrollTo(0, currY);
                }
            }
            final WeakHashMap a = p5x.a;
            p5x$d.k((View)this);
            return;
        }
        this.f(true);
    }
    
    public final boolean d(final int n) {
        final View focus = ((View)this).findFocus();
        boolean b = false;
        View view = null;
        Label_0176: {
            Label_0173: {
                if (focus != this) {
                    if ((view = focus) != null) {
                        ViewParent viewParent = focus.getParent();
                        while (true) {
                            while (viewParent instanceof ViewGroup) {
                                if (viewParent == this) {
                                    final boolean b2 = true;
                                    view = focus;
                                    if (!b2) {
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append(focus.getClass().getSimpleName());
                                        for (ViewParent viewParent2 = focus.getParent(); viewParent2 instanceof ViewGroup; viewParent2 = viewParent2.getParent()) {
                                            sb.append(" => ");
                                            sb.append(viewParent2.getClass().getSimpleName());
                                        }
                                        final StringBuilder g = w48.g("arrowScroll tried to find focus based on non-child current focused view ");
                                        g.append(sb.toString());
                                        Log.e("ViewPager", g.toString());
                                        break Label_0173;
                                    }
                                    break Label_0176;
                                }
                                else {
                                    viewParent = viewParent.getParent();
                                }
                            }
                            final boolean b2 = false;
                            continue;
                        }
                    }
                    break Label_0176;
                }
            }
            view = null;
        }
        final View nextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup)this, view, n);
        if (nextFocus != null && nextFocus != view) {
            if (n == 17) {
                final int left = this.i(this.F0, nextFocus).left;
                final int left2 = this.i(this.F0, view).left;
                if (view != null && left >= left2) {
                    b = this.o();
                }
                else {
                    b = nextFocus.requestFocus();
                }
            }
            else if (n == 66) {
                final int left3 = this.i(this.F0, nextFocus).left;
                final int left4 = this.i(this.F0, view).left;
                if (view != null && left3 <= left4) {
                    b = this.p();
                }
                else {
                    b = nextFocus.requestFocus();
                }
            }
        }
        else if (n != 17 && n != 1) {
            if (n == 66 || n == 2) {
                b = this.p();
            }
        }
        else {
            b = this.o();
        }
        if (b) {
            ((View)this).playSoundEffect(SoundEffectConstants.getContantForFocusDirection(n));
        }
        return b;
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        boolean b = false;
        if (!dispatchKeyEvent) {
            boolean b2 = false;
            Label_0136: {
                if (keyEvent.getAction() == 0) {
                    final int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 21) {
                        if (keyCode != 22) {
                            if (keyCode == 61) {
                                if (keyEvent.hasNoModifiers()) {
                                    b2 = this.d(2);
                                    break Label_0136;
                                }
                                if (keyEvent.hasModifiers(1)) {
                                    b2 = this.d(1);
                                    break Label_0136;
                                }
                            }
                        }
                        else {
                            if (keyEvent.hasModifiers(2)) {
                                b2 = this.p();
                                break Label_0136;
                            }
                            b2 = this.d(66);
                            break Label_0136;
                        }
                    }
                    else {
                        if (keyEvent.hasModifiers(2)) {
                            b2 = this.o();
                            break Label_0136;
                        }
                        b2 = this.d(17);
                        break Label_0136;
                    }
                }
                b2 = false;
            }
            if (!b2) {
                return b;
            }
        }
        b = true;
        return b;
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() == 0) {
                final e j = this.j(child);
                if (j != null && j.b == this.H0 && child.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        final int overScrollMode = ((View)this).getOverScrollMode();
        int n = 0;
        int n2 = 0;
        Label_0261: {
            Label_0064: {
                if (overScrollMode != 0) {
                    if (overScrollMode == 1) {
                        final cuj g0 = this.G0;
                        if (g0 != null && g0.getCount() > 1) {
                            break Label_0064;
                        }
                    }
                    this.o1.finish();
                    this.p1.finish();
                    break Label_0261;
                }
            }
            if (!this.o1.isFinished()) {
                final int save = canvas.save();
                final int n3 = ((View)this).getHeight() - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom();
                final int width = ((View)this).getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float)(((View)this).getPaddingTop() + -n3), this.S0 * width);
                this.o1.setSize(n3, width);
                n2 = ((false | this.o1.draw(canvas)) ? 1 : 0);
                canvas.restoreToCount(save);
            }
            n = n2;
            if (!this.p1.isFinished()) {
                final int save2 = canvas.save();
                final int width2 = ((View)this).getWidth();
                final int height = ((View)this).getHeight();
                final int paddingTop = ((View)this).getPaddingTop();
                final int paddingBottom = ((View)this).getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float)(-((View)this).getPaddingTop()), -(this.T0 + 1.0f) * width2);
                this.p1.setSize(height - paddingTop - paddingBottom, width2);
                n = (n2 | (this.p1.draw(canvas) ? 1 : 0));
                canvas.restoreToCount(save2);
            }
        }
        if (n != 0) {
            final WeakHashMap a = p5x.a;
            p5x$d.k((View)this);
        }
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        final Drawable p0 = this.P0;
        if (p0 != null && p0.isStateful()) {
            p0.setState(((View)this).getDrawableState());
        }
    }
    
    public final boolean e(final View view, final boolean b, final int n, final int n2, final int n3) {
        final boolean b2 = view instanceof ViewGroup;
        final boolean b3 = true;
        if (b2) {
            final ViewGroup viewGroup = (ViewGroup)view;
            final int scrollX = view.getScrollX();
            final int scrollY = view.getScrollY();
            for (int i = viewGroup.getChildCount() - 1; i >= 0; --i) {
                final View child = viewGroup.getChildAt(i);
                final int n4 = n2 + scrollX;
                if (n4 >= child.getLeft() && n4 < child.getRight()) {
                    final int n5 = n3 + scrollY;
                    if (n5 >= child.getTop() && n5 < child.getBottom() && this.e(child, true, n, n4 - child.getLeft(), n5 - child.getTop())) {
                        return true;
                    }
                }
            }
        }
        return b && view.canScrollHorizontally(-n) && b3;
    }
    
    public final void f(final boolean b) {
        int n;
        if (this.x1 == 2) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            this.setScrollingCacheEnabled(false);
            if (this.L0.isFinished() ^ true) {
                this.L0.abortAnimation();
                final int scrollX = ((View)this).getScrollX();
                final int scrollY = ((View)this).getScrollY();
                final int currX = this.L0.getCurrX();
                final int currY = this.L0.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    ((View)this).scrollTo(currX, currY);
                    if (currX != scrollX) {
                        this.q(currX);
                    }
                }
            }
        }
        this.X0 = false;
        for (int i = 0; i < this.D0.size(); ++i) {
            final e e = this.D0.get(i);
            if (e.c) {
                e.c = false;
                n = 1;
            }
        }
        if (n != 0) {
            if (b) {
                final Runnable w1 = this.w1;
                final WeakHashMap a = p5x.a;
                p5x$d.m((View)this, (Runnable)w1);
            }
            else {
                this.w1.run();
            }
        }
    }
    
    public final void g() {
        final int count = this.G0.getCount();
        this.C0 = count;
        final boolean b = this.D0.size() < this.Y0 * 2 + 1 && this.D0.size() < count;
        int n = this.H0;
        int i = 0;
        int n2 = 0;
        boolean b2 = b;
        while (i < this.D0.size()) {
            final e e = this.D0.get(i);
            final int b3 = this.G0.B(e.a);
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            Label_0283: {
                if (b3 == -1) {
                    n3 = n;
                    n4 = i;
                    n5 = n2;
                }
                else {
                    if (b3 == -2) {
                        this.D0.remove(i);
                        final int n6 = i - 1;
                        int n7;
                        if ((n7 = n2) == 0) {
                            this.G0.O((ViewGroup)this);
                            n7 = 1;
                        }
                        this.G0.i((ViewGroup)this, e.b, e.a);
                        final int h0 = this.H0;
                        i = n6;
                        n2 = n7;
                        if (h0 == e.b) {
                            n = Math.max(0, Math.min(h0, -1 + count));
                            i = n6;
                            n2 = n7;
                        }
                    }
                    else {
                        final int b4 = e.b;
                        n3 = n;
                        n4 = i;
                        n5 = n2;
                        if (b4 == b3) {
                            break Label_0283;
                        }
                        if (b4 == this.H0) {
                            n = b3;
                        }
                        e.b = b3;
                    }
                    b2 = true;
                    n5 = n2;
                    n4 = i;
                    n3 = n;
                }
            }
            i = n4 + 1;
            n = n3;
            n2 = n5;
        }
        if (n2 != 0) {
            this.G0.j((ViewGroup)this);
        }
        Collections.sort(this.D0, (Comparator<? super e>)ViewPager.z1);
        if (b2) {
            for (int childCount = this.getChildCount(), j = 0; j < childCount; ++j) {
                final f f = (f)this.getChildAt(j).getLayoutParams();
                if (!f.a) {
                    f.c = 0.0f;
                }
            }
            this.B(n, false, true, 0);
            ((View)this).requestLayout();
        }
    }
    
    public final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return new f();
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return new f(((View)this).getContext(), set);
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return this.generateDefaultLayoutParams();
    }
    
    public cuj getAdapter() {
        return this.G0;
    }
    
    public final int getChildDrawingOrder(final int n, final int n2) {
        throw null;
    }
    
    public int getCurrentItem() {
        return this.H0;
    }
    
    public int getOffscreenPageLimit() {
        return this.Y0;
    }
    
    public int getPageMargin() {
        return this.O0;
    }
    
    public final void h(final int n) {
        final i u1 = this.u1;
        if (u1 != null) {
            u1.E(n);
        }
        final ArrayList t1 = this.t1;
        if (t1 != null) {
            for (int i = 0; i < t1.size(); ++i) {
                final i j = this.t1.get(i);
                if (j != null) {
                    j.E(n);
                }
            }
        }
    }
    
    public final Rect i(final Rect rect, final View view) {
        Rect rect2 = rect;
        if (rect == null) {
            rect2 = new Rect();
        }
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewGroup viewGroup;
        for (ViewParent viewParent = view.getParent(); viewParent instanceof ViewGroup && viewParent != this; viewParent = ((View)viewGroup).getParent()) {
            viewGroup = (ViewGroup)viewParent;
            rect2.left += ((View)viewGroup).getLeft();
            rect2.right += ((View)viewGroup).getRight();
            rect2.top += ((View)viewGroup).getTop();
            rect2.bottom += ((View)viewGroup).getBottom();
        }
        return rect2;
    }
    
    public final e j(final View view) {
        for (int i = 0; i < this.D0.size(); ++i) {
            final e e = this.D0.get(i);
            if (this.G0.I(view, e.a)) {
                return e;
            }
        }
        return null;
    }
    
    public final e k() {
        final int clientWidth = this.getClientWidth();
        float e = 0.0f;
        float n;
        if (clientWidth > 0) {
            n = ((View)this).getScrollX() / (float)clientWidth;
        }
        else {
            n = 0.0f;
        }
        float n2;
        if (clientWidth > 0) {
            n2 = this.O0 / (float)clientWidth;
        }
        else {
            n2 = 0.0f;
        }
        e e2 = null;
        float d = 0.0f;
        int b = -1;
        int i = 0;
        int n3 = 1;
        while (i < this.D0.size()) {
            final e e3 = this.D0.get(i);
            int n4 = i;
            e e4 = e3;
            if (n3 == 0) {
                final int b2 = e3.b;
                ++b;
                n4 = i;
                e4 = e3;
                if (b2 != b) {
                    e4 = this.E0;
                    e4.e = e + d + n2;
                    e4.b = b;
                    e4.d = this.G0.D(b);
                    n4 = i - 1;
                }
            }
            e = e4.e;
            final float d2 = e4.d;
            if (n3 == 0 && n < e) {
                return e2;
            }
            if (n < d2 + e + n2 || n4 == this.D0.size() - 1) {
                return e4;
            }
            b = e4.b;
            d = e4.d;
            i = n4 + 1;
            n3 = 0;
            e2 = e4;
        }
        return e2;
    }
    
    public final e l(final int n) {
        for (int i = 0; i < this.D0.size(); ++i) {
            final e e = this.D0.get(i);
            if (e.b == n) {
                return e;
            }
        }
        return null;
    }
    
    public final void m(final int n, final float n2, final int n3) {
        final int s1 = this.s1;
        final int n4 = 0;
        if (s1 > 0) {
            final int scrollX = ((View)this).getScrollX();
            int paddingLeft = ((View)this).getPaddingLeft();
            int paddingRight = ((View)this).getPaddingRight();
            final int width = ((View)this).getWidth();
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                final View child = this.getChildAt(i);
                final f f = (f)child.getLayoutParams();
                if (f.a) {
                    final int n5 = f.b & 0x7;
                    int max;
                    if (n5 != 1) {
                        if (n5 != 3) {
                            if (n5 != 5) {
                                final int n6 = paddingLeft;
                                max = paddingLeft;
                                paddingLeft = n6;
                            }
                            else {
                                max = width - paddingRight - child.getMeasuredWidth();
                                paddingRight += child.getMeasuredWidth();
                            }
                        }
                        else {
                            final int n7 = child.getWidth() + paddingLeft;
                            max = paddingLeft;
                            paddingLeft = n7;
                        }
                    }
                    else {
                        max = Math.max((width - child.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    final int n8 = max + scrollX - child.getLeft();
                    if (n8 != 0) {
                        child.offsetLeftAndRight(n8);
                    }
                }
            }
        }
        final i u1 = this.u1;
        if (u1 != null) {
            u1.h2(n, n2, n3);
        }
        final ArrayList t1 = this.t1;
        if (t1 != null) {
            for (int size = t1.size(), j = n4; j < size; ++j) {
                final i k = this.t1.get(j);
                if (k != null) {
                    k.h2(n, n2, n3);
                }
            }
        }
        this.r1 = true;
    }
    
    public final void n(final MotionEvent motionEvent) {
        final int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.i1) {
            int n;
            if (actionIndex == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.e1 = motionEvent.getX(n);
            this.i1 = motionEvent.getPointerId(n);
            final VelocityTracker j1 = this.j1;
            if (j1 != null) {
                j1.clear();
            }
        }
    }
    
    public final boolean o() {
        final int h0 = this.H0;
        if (h0 > 0) {
            this.A(h0 - 1, true);
            return true;
        }
        return false;
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q1 = true;
    }
    
    public void onDetachedFromWindow() {
        ((View)this).removeCallbacks((Runnable)this.w1);
        final Scroller l0 = this.L0;
        if (l0 != null && !l0.isFinished()) {
            this.L0.abortAnimation();
        }
        super.onDetachedFromWindow();
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.O0 > 0 && this.P0 != null && this.D0.size() > 0 && this.G0 != null) {
            final int scrollX = ((View)this).getScrollX();
            final int width = ((View)this).getWidth();
            final float n = (float)this.O0;
            final float n2 = (float)width;
            final float n3 = n / n2;
            final ArrayList<e> d0 = this.D0;
            int n4 = 0;
            e e = d0.get(0);
            float e2 = e.e;
            for (int size = this.D0.size(), i = e.b; i < this.D0.get(size - 1).b; ++i) {
                int b;
                while (true) {
                    b = e.b;
                    if (i <= b || n4 >= size) {
                        break;
                    }
                    final ArrayList<e> d2 = this.D0;
                    ++n4;
                    e = d2.get(n4);
                }
                float n5;
                if (i == b) {
                    final float e3 = e.e;
                    final float d3 = e.d;
                    n5 = (e3 + d3) * n2;
                    e2 = e3 + d3 + n3;
                }
                else {
                    final float d4 = this.G0.D(i);
                    n5 = (e2 + d4) * n2;
                    e2 += d4 + n3;
                }
                if (this.O0 + n5 > scrollX) {
                    this.P0.setBounds(Math.round(n5), this.Q0, Math.round(this.O0 + n5), this.R0);
                    this.P0.draw(canvas);
                }
                if (n5 > scrollX + width) {
                    break;
                }
            }
        }
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int n = motionEvent.getAction() & 0xFF;
        if (n != 3 && n != 1) {
            if (n != 0) {
                if (this.Z0) {
                    return true;
                }
                if (this.a1) {
                    return false;
                }
            }
            if (n != 0) {
                if (n != 2) {
                    if (n == 6) {
                        this.n(motionEvent);
                    }
                }
                else {
                    final int i1 = this.i1;
                    if (i1 != -1) {
                        final int pointerIndex = motionEvent.findPointerIndex(i1);
                        final float x = motionEvent.getX(pointerIndex);
                        final float n2 = x - this.e1;
                        final float abs = Math.abs(n2);
                        final float y = motionEvent.getY(pointerIndex);
                        final float abs2 = Math.abs(y - this.h1);
                        final float n3 = fcmpl(n2, 0.0f);
                        if (n3 != 0) {
                            final float e1 = this.e1;
                            if ((e1 >= this.c1 || n3 <= 0) && (e1 <= ((View)this).getWidth() - this.c1 || n2 >= 0.0f) && this.e((View)this, false, (int)n2, (int)x, (int)y)) {
                                this.e1 = x;
                                this.f1 = y;
                                this.a1 = true;
                                return false;
                            }
                        }
                        final float n4 = (float)this.d1;
                        if (abs > n4 && abs * 0.5f > abs2) {
                            this.Z0 = true;
                            this.x();
                            this.setScrollState(1);
                            final float g1 = this.g1;
                            final float n5 = (float)this.d1;
                            float e2;
                            if (n3 > 0) {
                                e2 = g1 + n5;
                            }
                            else {
                                e2 = g1 - n5;
                            }
                            this.e1 = e2;
                            this.f1 = y;
                            this.setScrollingCacheEnabled(true);
                        }
                        else if (abs2 > n4) {
                            this.a1 = true;
                        }
                        if (this.Z0 && this.r(x)) {
                            final WeakHashMap a = p5x.a;
                            p5x$d.k((View)this);
                        }
                    }
                }
            }
            else {
                final float x2 = motionEvent.getX();
                this.g1 = x2;
                this.e1 = x2;
                final float y2 = motionEvent.getY();
                this.h1 = y2;
                this.f1 = y2;
                this.i1 = motionEvent.getPointerId(0);
                this.a1 = false;
                this.M0 = true;
                this.L0.computeScrollOffset();
                if (this.x1 == 2 && Math.abs(this.L0.getFinalX() - this.L0.getCurrX()) > this.n1) {
                    this.L0.abortAnimation();
                    this.X0 = false;
                    this.s();
                    this.Z0 = true;
                    this.x();
                    this.setScrollState(1);
                }
                else {
                    this.f(false);
                    this.Z0 = false;
                }
            }
            if (this.j1 == null) {
                this.j1 = VelocityTracker.obtain();
            }
            this.j1.addMovement(motionEvent);
            return this.Z0;
        }
        this.y();
        return false;
    }
    
    public final void onLayout(final boolean b, int paddingTop, int paddingLeft, int paddingBottom, int paddingRight) {
        final int childCount = this.getChildCount();
        final int n = paddingBottom - paddingTop;
        final int n2 = paddingRight - paddingLeft;
        paddingLeft = ((View)this).getPaddingLeft();
        paddingTop = ((View)this).getPaddingTop();
        paddingRight = ((View)this).getPaddingRight();
        paddingBottom = ((View)this).getPaddingBottom();
        final int scrollX = ((View)this).getScrollX();
        int i = 0;
        int s1 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            int n3 = paddingLeft;
            int n4 = paddingTop;
            int n5 = paddingRight;
            int n6 = paddingBottom;
            int n7 = s1;
            if (child.getVisibility() != 8) {
                final f f = (f)child.getLayoutParams();
                n3 = paddingLeft;
                n4 = paddingTop;
                n5 = paddingRight;
                n6 = paddingBottom;
                n7 = s1;
                if (f.a) {
                    final int b2 = f.b;
                    final int n8 = b2 & 0x7;
                    final int n9 = b2 & 0x70;
                    int n11 = 0;
                    Label_0246: {
                        int max;
                        if (n8 != 1) {
                            if (n8 == 3) {
                                final int n10 = child.getMeasuredWidth() + paddingLeft;
                                n11 = paddingLeft;
                                paddingLeft = n10;
                                break Label_0246;
                            }
                            if (n8 != 5) {
                                final int n12 = paddingLeft;
                                n11 = paddingLeft;
                                paddingLeft = n12;
                                break Label_0246;
                            }
                            max = n - paddingRight - child.getMeasuredWidth();
                            paddingRight += child.getMeasuredWidth();
                        }
                        else {
                            max = Math.max((n - child.getMeasuredWidth()) / 2, paddingLeft);
                        }
                        n11 = max;
                    }
                    int max2;
                    if (n9 != 16) {
                        if (n9 != 48) {
                            if (n9 != 80) {
                                final int n13 = paddingTop;
                                max2 = paddingTop;
                                paddingTop = n13;
                            }
                            else {
                                max2 = n2 - paddingBottom - child.getMeasuredHeight();
                                paddingBottom += child.getMeasuredHeight();
                            }
                        }
                        else {
                            final int n14 = child.getMeasuredHeight() + paddingTop;
                            max2 = paddingTop;
                            paddingTop = n14;
                        }
                    }
                    else {
                        max2 = Math.max((n2 - child.getMeasuredHeight()) / 2, paddingTop);
                    }
                    final int n15 = n11 + scrollX;
                    child.layout(n15, max2, child.getMeasuredWidth() + n15, child.getMeasuredHeight() + max2);
                    n7 = s1 + 1;
                    n6 = paddingBottom;
                    n5 = paddingRight;
                    n4 = paddingTop;
                    n3 = paddingLeft;
                }
            }
            ++i;
            paddingLeft = n3;
            paddingTop = n4;
            paddingRight = n5;
            paddingBottom = n6;
            s1 = n7;
        }
        for (int j = 0; j < childCount; ++j) {
            final View child2 = this.getChildAt(j);
            if (child2.getVisibility() != 8) {
                final f f2 = (f)child2.getLayoutParams();
                if (!f2.a) {
                    final e k = this.j(child2);
                    if (k != null) {
                        final float n16 = (float)(n - paddingLeft - paddingRight);
                        final int n17 = (int)(k.e * n16) + paddingLeft;
                        if (f2.d) {
                            f2.d = false;
                            child2.measure(View$MeasureSpec.makeMeasureSpec((int)(n16 * f2.c), 1073741824), View$MeasureSpec.makeMeasureSpec(n2 - paddingTop - paddingBottom, 1073741824));
                        }
                        child2.layout(n17, paddingTop, child2.getMeasuredWidth() + n17, child2.getMeasuredHeight() + paddingTop);
                    }
                }
            }
        }
        this.Q0 = paddingTop;
        this.R0 = n2 - paddingBottom;
        this.s1 = s1;
        if (this.q1) {
            this.z(this.H0, false, 0, false);
        }
        this.q1 = false;
    }
    
    public void onMeasure(int measuredWidth, int i) {
        final int n = 0;
        ((View)this).setMeasuredDimension(View.getDefaultSize(0, measuredWidth), View.getDefaultSize(0, i));
        measuredWidth = ((View)this).getMeasuredWidth();
        this.c1 = Math.min(measuredWidth / 10, this.b1);
        measuredWidth = measuredWidth - ((View)this).getPaddingLeft() - ((View)this).getPaddingRight();
        i = ((View)this).getMeasuredHeight() - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom();
        final int childCount = this.getChildCount();
        int n2 = 0;
        while (true) {
            final int n3 = 1;
            int n4 = 1073741824;
            if (n2 >= childCount) {
                break;
            }
            final View child = this.getChildAt(n2);
            int n5 = measuredWidth;
            int n6 = i;
            if (child.getVisibility() != 8) {
                final f f = (f)child.getLayoutParams();
                n5 = measuredWidth;
                n6 = i;
                if (f != null) {
                    n5 = measuredWidth;
                    n6 = i;
                    if (f.a) {
                        final int b = f.b;
                        final int n7 = b & 0x7;
                        final int n8 = b & 0x70;
                        final boolean b2 = n8 == 48 || n8 == 80;
                        int n9 = n3;
                        if (n7 != 3) {
                            if (n7 == 5) {
                                n9 = n3;
                            }
                            else {
                                n9 = 0;
                            }
                        }
                        final int n10 = Integer.MIN_VALUE;
                        int n11 = 0;
                        int n13 = 0;
                        Label_0267: {
                            if (b2) {
                                n11 = 1073741824;
                            }
                            else {
                                n11 = n10;
                                if (n9 != 0) {
                                    final int n12 = 1073741824;
                                    n11 = n10;
                                    n13 = n12;
                                    break Label_0267;
                                }
                            }
                            n13 = Integer.MIN_VALUE;
                        }
                        final int width = f.width;
                        int n15;
                        int n16;
                        if (width != -2) {
                            int n14;
                            if (width != -1) {
                                n14 = width;
                            }
                            else {
                                n14 = measuredWidth;
                            }
                            n15 = 1073741824;
                            n16 = n14;
                        }
                        else {
                            n16 = measuredWidth;
                            n15 = n11;
                        }
                        final int height = f.height;
                        int n17;
                        if (height != -2) {
                            if (height != -1) {
                                n17 = height;
                            }
                            else {
                                n17 = i;
                            }
                        }
                        else {
                            final int n18 = i;
                            n4 = n13;
                            n17 = n18;
                        }
                        child.measure(View$MeasureSpec.makeMeasureSpec(n16, n15), View$MeasureSpec.makeMeasureSpec(n17, n4));
                        if (b2) {
                            n6 = i - child.getMeasuredHeight();
                            n5 = measuredWidth;
                        }
                        else {
                            n5 = measuredWidth;
                            n6 = i;
                            if (n9 != 0) {
                                n5 = measuredWidth - child.getMeasuredWidth();
                                n6 = i;
                            }
                        }
                    }
                }
            }
            ++n2;
            measuredWidth = n5;
            i = n6;
        }
        View$MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        this.U0 = View$MeasureSpec.makeMeasureSpec(i, 1073741824);
        this.V0 = true;
        this.s();
        this.V0 = false;
        int childCount2;
        View child2;
        f f2;
        for (childCount2 = this.getChildCount(), i = n; i < childCount2; ++i) {
            child2 = this.getChildAt(i);
            if (child2.getVisibility() != 8) {
                f2 = (f)child2.getLayoutParams();
                if (f2 == null || !f2.a) {
                    child2.measure(View$MeasureSpec.makeMeasureSpec((int)(measuredWidth * f2.c), 1073741824), this.U0);
                }
            }
        }
    }
    
    public final boolean onRequestFocusInDescendants(final int n, final Rect rect) {
        int i = this.getChildCount();
        int n2 = -1;
        int n3;
        if ((n & 0x2) != 0x0) {
            n2 = i;
            i = 0;
            n3 = 1;
        }
        else {
            --i;
            n3 = -1;
        }
        while (i != n2) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() == 0) {
                final e j = this.j(child);
                if (j != null && j.b == this.H0 && child.requestFocus(n, rect)) {
                    return true;
                }
            }
            i += n3;
        }
        return false;
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof ViewPager.ViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final ViewPager.ViewPager$SavedState viewPager$SavedState = (ViewPager.ViewPager$SavedState)parcelable;
        super.onRestoreInstanceState(((fa)viewPager$SavedState).getSuperState());
        final cuj g0 = this.G0;
        if (g0 != null) {
            g0.L(viewPager$SavedState.adapterState, viewPager$SavedState.loader);
            this.B(viewPager$SavedState.position, false, true, 0);
        }
        else {
            this.I0 = viewPager$SavedState.position;
            this.J0 = viewPager$SavedState.adapterState;
            this.K0 = viewPager$SavedState.loader;
        }
    }
    
    public final Parcelable onSaveInstanceState() {
        final ViewPager.ViewPager$SavedState viewPager$SavedState = new ViewPager.ViewPager$SavedState(super.onSaveInstanceState());
        viewPager$SavedState.position = this.H0;
        final cuj g0 = this.G0;
        if (g0 != null) {
            viewPager$SavedState.adapterState = g0.M();
        }
        return (Parcelable)viewPager$SavedState;
    }
    
    public void onSizeChanged(final int n, int o0, final int n2, final int n3) {
        super.onSizeChanged(n, o0, n2, n3);
        if (n != n2) {
            o0 = this.O0;
            this.u(n, n2, o0, o0);
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        boolean b = false;
        if (action == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        final cuj g0 = this.G0;
        if (g0 != null && g0.getCount() != 0) {
            if (this.j1 == null) {
                this.j1 = VelocityTracker.obtain();
            }
            this.j1.addMovement(motionEvent);
            final int n = motionEvent.getAction() & 0xFF;
            Label_0722: {
                if (n != 0) {
                    if (n != 1) {
                        if (n != 2) {
                            if (n != 3) {
                                if (n != 5) {
                                    if (n == 6) {
                                        this.n(motionEvent);
                                        this.e1 = motionEvent.getX(motionEvent.findPointerIndex(this.i1));
                                    }
                                }
                                else {
                                    final int actionIndex = motionEvent.getActionIndex();
                                    this.e1 = motionEvent.getX(actionIndex);
                                    this.i1 = motionEvent.getPointerId(actionIndex);
                                }
                            }
                            else if (this.Z0) {
                                this.z(this.H0, true, 0, false);
                                b = this.y();
                            }
                        }
                        else {
                            if (!this.Z0) {
                                final int pointerIndex = motionEvent.findPointerIndex(this.i1);
                                if (pointerIndex == -1) {
                                    b = this.y();
                                    break Label_0722;
                                }
                                final float x = motionEvent.getX(pointerIndex);
                                final float abs = Math.abs(x - this.e1);
                                final float y = motionEvent.getY(pointerIndex);
                                final float abs2 = Math.abs(y - this.f1);
                                if (abs > this.d1 && abs > abs2) {
                                    this.Z0 = true;
                                    this.x();
                                    final float g2 = this.g1;
                                    float e1;
                                    if (x - g2 > 0.0f) {
                                        e1 = g2 + this.d1;
                                    }
                                    else {
                                        e1 = g2 - this.d1;
                                    }
                                    this.e1 = e1;
                                    this.f1 = y;
                                    this.setScrollState(1);
                                    this.setScrollingCacheEnabled(true);
                                    final ViewParent parent = ((View)this).getParent();
                                    if (parent != null) {
                                        parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                }
                            }
                            if (this.Z0) {
                                b = (false | this.r(motionEvent.getX(motionEvent.findPointerIndex(this.i1))));
                            }
                        }
                    }
                    else if (this.Z0) {
                        final VelocityTracker j1 = this.j1;
                        j1.computeCurrentVelocity(1000, (float)this.l1);
                        final int n2 = (int)j1.getXVelocity(this.i1);
                        this.X0 = true;
                        final int clientWidth = this.getClientWidth();
                        final int scrollX = ((View)this).getScrollX();
                        final e k = this.k();
                        final float n3 = (float)this.O0;
                        final float n4 = (float)clientWidth;
                        final float n5 = n3 / n4;
                        int b2 = k.b;
                        final float n6 = (scrollX / n4 - k.e) / (k.d + n5);
                        if (Math.abs((int)(motionEvent.getX(motionEvent.findPointerIndex(this.i1)) - this.g1)) > this.m1 && Math.abs(n2) > this.k1) {
                            if (n2 <= 0) {
                                ++b2;
                            }
                        }
                        else {
                            float n7;
                            if (b2 >= this.H0) {
                                n7 = 0.4f;
                            }
                            else {
                                n7 = 0.6f;
                            }
                            b2 += (int)(n6 + n7);
                        }
                        int max = b2;
                        if (this.D0.size() > 0) {
                            final e e2 = this.D0.get(0);
                            final ArrayList<e> d0 = this.D0;
                            max = Math.max(e2.b, Math.min(b2, ((e)d0.get(d0.size() - 1)).b));
                        }
                        this.B(max, true, true, n2);
                        b = this.y();
                    }
                }
                else {
                    this.L0.abortAnimation();
                    this.X0 = false;
                    this.s();
                    final float x2 = motionEvent.getX();
                    this.g1 = x2;
                    this.e1 = x2;
                    final float y2 = motionEvent.getY();
                    this.h1 = y2;
                    this.f1 = y2;
                    this.i1 = motionEvent.getPointerId(0);
                }
            }
            if (b) {
                final WeakHashMap a = p5x.a;
                p5x$d.k((View)this);
            }
            return true;
        }
        return false;
    }
    
    public final boolean p() {
        final cuj g0 = this.G0;
        if (g0 != null && this.H0 < g0.getCount() - 1) {
            this.A(this.H0 + 1, true);
            return true;
        }
        return false;
    }
    
    public final boolean q(int n) {
        if (this.D0.size() == 0) {
            if (this.q1) {
                return false;
            }
            this.r1 = false;
            this.m(0, 0.0f, 0);
            if (this.r1) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        else {
            final e k = this.k();
            final int clientWidth = this.getClientWidth();
            final int o0 = this.O0;
            final float n2 = (float)o0;
            final float n3 = (float)clientWidth;
            final float n4 = n2 / n3;
            final int b = k.b;
            final float n5 = (n / n3 - k.e) / (k.d + n4);
            n = (int)((clientWidth + o0) * n5);
            this.r1 = false;
            this.m(b, n5, n);
            if (this.r1) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }
    
    public final boolean r(float e1) {
        final float e2 = this.e1;
        this.e1 = e1;
        final float n = ((View)this).getScrollX() + (e2 - e1);
        final float n2 = (float)this.getClientWidth();
        e1 = this.S0 * n2;
        float n3 = this.T0 * n2;
        final ArrayList<e> d0 = this.D0;
        final boolean b = false;
        final boolean b2 = false;
        boolean b3 = false;
        final e e3 = d0.get(0);
        final ArrayList<e> d2 = this.D0;
        final e e4 = d2.get(d2.size() - 1);
        boolean b4;
        if (e3.b != 0) {
            e1 = e3.e * n2;
            b4 = false;
        }
        else {
            b4 = true;
        }
        boolean b5;
        if (e4.b != this.G0.getCount() - 1) {
            n3 = e4.e * n2;
            b5 = false;
        }
        else {
            b5 = true;
        }
        if (n < e1) {
            if (b4) {
                this.o1.onPull(Math.abs(e1 - n) / n2);
                b3 = true;
            }
        }
        else {
            b3 = b2;
            e1 = n;
            if (n > n3) {
                b3 = b;
                if (b5) {
                    this.p1.onPull(Math.abs(n - n3) / n2);
                    b3 = true;
                }
                e1 = n3;
            }
        }
        final float e5 = this.e1;
        final int n4 = (int)e1;
        this.e1 = e1 - n4 + e5;
        ((View)this).scrollTo(n4, ((View)this).getScrollY());
        this.q(n4);
        return b3;
    }
    
    public final void removeView(final View view) {
        if (this.V0) {
            this.removeViewInLayout(view);
        }
        else {
            super.removeView(view);
        }
    }
    
    public final void s() {
        this.t(this.H0);
    }
    
    public void setAdapter(final cuj g0) {
        Object g2 = this.G0;
        final int n = 0;
        if (g2 != null) {
            synchronized (g2) {
                ((cuj)g2).D0 = null;
                monitorexit(g2);
                this.G0.O((ViewGroup)this);
                for (int i = 0; i < this.D0.size(); ++i) {
                    g2 = this.D0.get(i);
                    this.G0.i((ViewGroup)this, ((e)g2).b, ((e)g2).a);
                }
                this.G0.j((ViewGroup)this);
                this.D0.clear();
                int n2;
                for (int j = 0; j < this.getChildCount(); j = n2 + 1) {
                    n2 = j;
                    if (!((f)this.getChildAt(j).getLayoutParams()).a) {
                        this.removeViewAt(j);
                        n2 = j - 1;
                    }
                }
                ((View)this).scrollTo(this.H0 = 0, 0);
            }
        }
        this.G0 = g0;
        this.C0 = 0;
        if (g0 != null) {
            if (this.N0 == null) {
                this.N0 = new j();
            }
            final cuj g3 = this.G0;
            final j n3 = this.N0;
            synchronized (g3) {
                g3.D0 = n3;
                monitorexit(g3);
                this.X0 = false;
                final boolean q1 = this.q1;
                this.q1 = true;
                this.C0 = this.G0.getCount();
                if (this.I0 >= 0) {
                    this.G0.L(this.J0, this.K0);
                    this.B(this.I0, false, true, 0);
                    this.I0 = -1;
                    this.J0 = null;
                    this.K0 = null;
                }
                else if (!q1) {
                    this.s();
                }
                else {
                    ((View)this).requestLayout();
                }
            }
        }
        final ArrayList v1 = this.v1;
        if (v1 != null && !v1.isEmpty()) {
            for (int size = this.v1.size(), k = n; k < size; ++k) {
                ((h)this.v1.get(k)).a(this, g0);
            }
        }
    }
    
    public void setCurrentItem(final int n) {
        this.X0 = false;
        this.B(n, this.q1 ^ true, false, 0);
    }
    
    public void setOffscreenPageLimit(final int n) {
        int y0 = n;
        if (n < 1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Requested offscreen page limit ");
            sb.append(n);
            sb.append(" too small; defaulting to ");
            sb.append(1);
            Log.w("ViewPager", sb.toString());
            y0 = 1;
        }
        if (y0 != this.Y0) {
            this.Y0 = y0;
            this.s();
        }
    }
    
    @Deprecated
    public void setOnPageChangeListener(final i u1) {
        this.u1 = u1;
    }
    
    public void setPageMargin(final int o0) {
        final int o2 = this.O0;
        this.O0 = o0;
        final int width = ((View)this).getWidth();
        this.u(width, width, o0, o2);
        ((View)this).requestLayout();
    }
    
    public void setPageMarginDrawable(final int n) {
        final Context context = ((View)this).getContext();
        final Object a = eo6.a;
        this.setPageMarginDrawable(eo6$c.b(context, n));
    }
    
    public void setPageMarginDrawable(final Drawable p) {
        this.P0 = p;
        if (p != null) {
            ((View)this).refreshDrawableState();
        }
        ((View)this).setWillNotDraw(p == null);
        ((View)this).invalidate();
    }
    
    public void setScrollState(final int x1) {
        if (this.x1 == x1) {
            return;
        }
        this.x1 = x1;
        final i u1 = this.u1;
        if (u1 != null) {
            u1.B3(x1);
        }
        final ArrayList t1 = this.t1;
        if (t1 != null) {
            for (int i = 0; i < t1.size(); ++i) {
                final i j = this.t1.get(i);
                if (j != null) {
                    j.B3(x1);
                }
            }
        }
    }
    
    public final void t(int i) {
        final int h0 = this.H0;
        e l;
        if (h0 != i) {
            l = this.l(h0);
            this.H0 = i;
        }
        else {
            l = null;
        }
        if (this.G0 == null) {
            return;
        }
        if (this.X0) {
            return;
        }
        if (((View)this).getWindowToken() == null) {
            return;
        }
        this.G0.O((ViewGroup)this);
        i = this.Y0;
        final int max = Math.max(0, this.H0 - i);
        final int count = this.G0.getCount();
        final int min = Math.min(count - 1, this.H0 + i);
        if (count == this.C0) {
            int j = 0;
            while (true) {
                while (j < this.D0.size()) {
                    final e e = this.D0.get(j);
                    final int b = e.b;
                    i = this.H0;
                    if (b >= i) {
                        if (b == i) {
                            e a = e;
                            if (e == null) {
                                a = e;
                                if (count > 0) {
                                    a = this.a(this.H0, j);
                                }
                            }
                            if (a != null) {
                                int n = j - 1;
                                e e2;
                                if (n >= 0) {
                                    e2 = this.D0.get(n);
                                }
                                else {
                                    e2 = null;
                                }
                                final int clientWidth = this.getClientWidth();
                                float n2;
                                if (clientWidth <= 0) {
                                    n2 = 0.0f;
                                }
                                else {
                                    n2 = 2.0f - a.d + ((View)this).getPaddingLeft() / (float)clientWidth;
                                }
                                int k = this.H0 - 1;
                                float n3 = 0.0f;
                                e e3 = e2;
                                while (k >= 0) {
                                    int n4 = 0;
                                    e e4 = null;
                                    float n5 = 0.0f;
                                    Label_0570: {
                                        if (n3 >= n2 && k < max) {
                                            if (e3 == null) {
                                                break;
                                            }
                                            i = j;
                                            n4 = n;
                                            e4 = e3;
                                            n5 = n3;
                                            if (k != e3.b) {
                                                break Label_0570;
                                            }
                                            i = j;
                                            n4 = n;
                                            e4 = e3;
                                            n5 = n3;
                                            if (e3.c) {
                                                break Label_0570;
                                            }
                                            this.D0.remove(n);
                                            this.G0.i((ViewGroup)this, k, e3.a);
                                            --n;
                                            i = --j;
                                            n4 = n;
                                            n5 = n3;
                                            if (n >= 0) {
                                                e4 = this.D0.get(n);
                                                i = j;
                                                n4 = n;
                                                n5 = n3;
                                                break Label_0570;
                                            }
                                        }
                                        else if (e3 != null && k == e3.b) {
                                            final float n6 = n3 + e3.d;
                                            --n;
                                            i = j;
                                            n4 = n;
                                            n5 = n6;
                                            if (n >= 0) {
                                                e4 = this.D0.get(n);
                                                i = j;
                                                n4 = n;
                                                n5 = n6;
                                                break Label_0570;
                                            }
                                        }
                                        else {
                                            final float n7 = n3 + this.a(k, n + 1).d;
                                            i = ++j;
                                            n4 = n;
                                            n5 = n7;
                                            if (n >= 0) {
                                                e4 = this.D0.get(n);
                                                i = j;
                                                n4 = n;
                                                n5 = n7;
                                                break Label_0570;
                                            }
                                        }
                                        e4 = null;
                                    }
                                    --k;
                                    j = i;
                                    n = n4;
                                    e3 = e4;
                                    n3 = n5;
                                }
                                float d = a.d;
                                int n8 = j + 1;
                                if (d < 2.0f) {
                                    e e5;
                                    if (n8 < this.D0.size()) {
                                        e5 = this.D0.get(n8);
                                    }
                                    else {
                                        e5 = null;
                                    }
                                    float n9;
                                    if (clientWidth <= 0) {
                                        n9 = 0.0f;
                                    }
                                    else {
                                        n9 = ((View)this).getPaddingRight() / (float)clientWidth + 2.0f;
                                    }
                                    int n10 = this.H0 + 1;
                                    int n11 = n8;
                                    e e6 = e5;
                                    while (n10 < count) {
                                        float n12 = 0.0f;
                                        e e7 = null;
                                        Label_0943: {
                                            if (d >= n9 && n10 > min) {
                                                if (e6 == null) {
                                                    break;
                                                }
                                                n12 = d;
                                                e7 = e6;
                                                i = n11;
                                                if (n10 != e6.b) {
                                                    break Label_0943;
                                                }
                                                n12 = d;
                                                e7 = e6;
                                                i = n11;
                                                if (e6.c) {
                                                    break Label_0943;
                                                }
                                                this.D0.remove(n11);
                                                this.G0.i((ViewGroup)this, n10, e6.a);
                                                n12 = d;
                                                if ((i = n11) < this.D0.size()) {
                                                    e7 = this.D0.get(n11);
                                                    n12 = d;
                                                    i = n11;
                                                    break Label_0943;
                                                }
                                            }
                                            else if (e6 != null && n10 == e6.b) {
                                                final float n13 = d + e6.d;
                                                ++n11;
                                                n12 = n13;
                                                if ((i = n11) < this.D0.size()) {
                                                    e7 = this.D0.get(n11);
                                                    n12 = n13;
                                                    i = n11;
                                                    break Label_0943;
                                                }
                                            }
                                            else {
                                                final e a2 = this.a(n10, n11);
                                                ++n11;
                                                n12 = d + a2.d;
                                                if ((i = n11) < this.D0.size()) {
                                                    e7 = this.D0.get(n11);
                                                    n12 = n12;
                                                    i = n11;
                                                    break Label_0943;
                                                }
                                            }
                                            e7 = null;
                                        }
                                        ++n10;
                                        d = n12;
                                        e6 = e7;
                                        n11 = i;
                                    }
                                }
                                int count2 = this.G0.getCount();
                                i = this.getClientWidth();
                                float n14;
                                if (i > 0) {
                                    n14 = this.O0 / (float)i;
                                }
                                else {
                                    n14 = 0.0f;
                                }
                                if (l != null) {
                                    i = l.b;
                                    final int b2 = a.b;
                                    if (i < b2) {
                                        float n15 = l.e + l.d + n14;
                                        int n16 = 0;
                                        while (true) {
                                            final int n17 = i + 1;
                                            if (n17 > a.b || n16 >= this.D0.size()) {
                                                break;
                                            }
                                            e e8 = this.D0.get(n16);
                                            float e9;
                                            while (true) {
                                                i = n17;
                                                e9 = n15;
                                                if (n17 <= e8.b) {
                                                    break;
                                                }
                                                i = n17;
                                                e9 = n15;
                                                if (n16 >= this.D0.size() - 1) {
                                                    break;
                                                }
                                                ++n16;
                                                e8 = this.D0.get(n16);
                                            }
                                            while (i < e8.b) {
                                                e9 += this.G0.D(i) + n14;
                                                ++i;
                                            }
                                            e8.e = e9;
                                            n15 = e9 + (e8.d + n14);
                                        }
                                    }
                                    else if (i > b2) {
                                        int n18 = this.D0.size() - 1;
                                        float e10 = l.e;
                                        while (true) {
                                            final int n19 = i - 1;
                                            if (n19 < a.b || n18 < 0) {
                                                break;
                                            }
                                            e e11 = this.D0.get(n18);
                                            float n20;
                                            while (true) {
                                                n20 = e10;
                                                i = n19;
                                                if (n19 >= e11.b) {
                                                    break;
                                                }
                                                n20 = e10;
                                                i = n19;
                                                if (n18 <= 0) {
                                                    break;
                                                }
                                                --n18;
                                                e11 = this.D0.get(n18);
                                            }
                                            while (i > e11.b) {
                                                n20 -= this.G0.D(i) + n14;
                                                --i;
                                            }
                                            e10 = n20 - (e11.d + n14);
                                            e11.e = e10;
                                        }
                                    }
                                }
                                final int size = this.D0.size();
                                float e12 = a.e;
                                final int b3 = a.b;
                                i = b3 - 1;
                                float s0;
                                if (b3 == 0) {
                                    s0 = e12;
                                }
                                else {
                                    s0 = -3.4028235E38f;
                                }
                                this.S0 = s0;
                                --count2;
                                float t0;
                                if (b3 == count2) {
                                    t0 = a.d + e12 - 1.0f;
                                }
                                else {
                                    t0 = Float.MAX_VALUE;
                                }
                                this.T0 = t0;
                                for (int n21 = j - 1; n21 >= 0; --n21, --i) {
                                    final e e13 = this.D0.get(n21);
                                    int b4;
                                    while (true) {
                                        b4 = e13.b;
                                        if (i <= b4) {
                                            break;
                                        }
                                        e12 -= this.G0.D(i) + n14;
                                        --i;
                                    }
                                    e12 -= e13.d + n14;
                                    e13.e = e12;
                                    if (b4 == 0) {
                                        this.S0 = e12;
                                    }
                                }
                                float e14 = a.e + a.d + n14;
                                i = a.b;
                                while (true) {
                                    ++i;
                                    if (n8 >= size) {
                                        break;
                                    }
                                    final e e15 = this.D0.get(n8);
                                    int b5;
                                    while (true) {
                                        b5 = e15.b;
                                        if (i >= b5) {
                                            break;
                                        }
                                        e14 += this.G0.D(i) + n14;
                                        ++i;
                                    }
                                    if (b5 == count2) {
                                        this.T0 = e15.d + e14 - 1.0f;
                                    }
                                    e15.e = e14;
                                    e14 += e15.d + n14;
                                    ++n8;
                                }
                                this.G0.N((ViewGroup)this, this.H0, a.a);
                            }
                            this.G0.j((ViewGroup)this);
                            int childCount;
                            View child;
                            f f;
                            e m;
                            for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                                child = this.getChildAt(i);
                                f = (f)child.getLayoutParams();
                                Objects.requireNonNull(f);
                                if (!f.a && f.c == 0.0f) {
                                    m = this.j(child);
                                    if (m != null) {
                                        f.c = m.d;
                                        f.e = m.b;
                                    }
                                }
                            }
                            if (((View)this).hasFocus()) {
                                View focus = ((View)this).findFocus();
                                e j2 = null;
                                Label_1823: {
                                    if (focus != null) {
                                        while (true) {
                                            final ViewParent parent = focus.getParent();
                                            if (parent == this) {
                                                j2 = this.j(focus);
                                                break Label_1823;
                                            }
                                            if (parent == null) {
                                                break;
                                            }
                                            if (!(parent instanceof View)) {
                                                break;
                                            }
                                            focus = (View)parent;
                                        }
                                    }
                                    j2 = null;
                                }
                                if (j2 == null || j2.b != this.H0) {
                                    View child2;
                                    e j3;
                                    for (i = 0; i < this.getChildCount(); ++i) {
                                        child2 = this.getChildAt(i);
                                        j3 = this.j(child2);
                                        if (j3 != null && j3.b == this.H0 && child2.requestFocus(2)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        break;
                    }
                    else {
                        ++j;
                    }
                }
                final e e = null;
                continue;
            }
        }
        String s2;
        try {
            s2 = ((View)this).getResources().getResourceName(((View)this).getId());
        }
        catch (final Resources$NotFoundException ex) {
            s2 = Integer.toHexString(((View)this).getId());
        }
        final StringBuilder g = w48.g("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
        k1b.j(g, this.C0, ", found: ", count, " Pager id: ");
        g.append(s2);
        g.append(" Pager class: ");
        g.append(this.getClass());
        g.append(" Problematic adapter: ");
        g.append(this.G0.getClass());
        throw new IllegalStateException(g.toString());
    }
    
    public final void u(int n, final int n2, final int n3, final int n4) {
        if (n2 > 0 && !this.D0.isEmpty()) {
            if (!this.L0.isFinished()) {
                this.L0.setFinalX(this.getCurrentItem() * this.getClientWidth());
            }
            else {
                ((View)this).scrollTo((int)(((View)this).getScrollX() / (float)(n2 - ((View)this).getPaddingLeft() - ((View)this).getPaddingRight() + n4) * (n - ((View)this).getPaddingLeft() - ((View)this).getPaddingRight() + n3)), ((View)this).getScrollY());
            }
        }
        else {
            final e l = this.l(this.H0);
            float min;
            if (l != null) {
                min = Math.min(l.e, this.T0);
            }
            else {
                min = 0.0f;
            }
            n = (int)(min * (n - ((View)this).getPaddingLeft() - ((View)this).getPaddingRight()));
            if (n != ((View)this).getScrollX()) {
                this.f(false);
                ((View)this).scrollTo(n, ((View)this).getScrollY());
            }
        }
    }
    
    public void v(final h h) {
        final ArrayList v1 = this.v1;
        if (v1 != null) {
            v1.remove(h);
        }
    }
    
    public final boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.P0;
    }
    
    public void w(final i i) {
        final ArrayList t1 = this.t1;
        if (t1 != null) {
            t1.remove(i);
        }
    }
    
    public final void x() {
        final ViewParent parent = ((View)this).getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
    
    public final boolean y() {
        this.i1 = -1;
        boolean b = false;
        this.Z0 = false;
        this.a1 = false;
        final VelocityTracker j1 = this.j1;
        if (j1 != null) {
            j1.recycle();
            this.j1 = null;
        }
        this.o1.onRelease();
        this.p1.onRelease();
        if (this.o1.isFinished() || this.p1.isFinished()) {
            b = true;
        }
        return b;
    }
    
    public final void z(final int n, final boolean b, int n2, final boolean b2) {
        final e l = this.l(n);
        int n3;
        if (l != null) {
            n3 = (int)(Math.max(this.S0, Math.min(l.e, this.T0)) * this.getClientWidth());
        }
        else {
            n3 = 0;
        }
        if (b) {
            if (this.getChildCount() == 0) {
                this.setScrollingCacheEnabled(false);
            }
            else {
                final Scroller l2 = this.L0;
                int n4;
                if (l2 != null && !l2.isFinished()) {
                    if (this.M0) {
                        n4 = this.L0.getCurrX();
                    }
                    else {
                        n4 = this.L0.getStartX();
                    }
                    this.L0.abortAnimation();
                    this.setScrollingCacheEnabled(false);
                }
                else {
                    n4 = ((View)this).getScrollX();
                }
                final int scrollY = ((View)this).getScrollY();
                final int n5 = n3 - n4;
                final int n6 = 0 - scrollY;
                if (n5 == 0 && n6 == 0) {
                    this.f(false);
                    this.s();
                    this.setScrollState(0);
                }
                else {
                    this.setScrollingCacheEnabled(true);
                    this.setScrollState(2);
                    final int clientWidth = this.getClientWidth();
                    final int n7 = clientWidth / 2;
                    final float n8 = (float)Math.abs(n5);
                    final float n9 = (float)clientWidth;
                    final float min = Math.min(1.0f, n8 * 1.0f / n9);
                    final float n10 = (float)n7;
                    final float n11 = (float)Math.sin((min - 0.5f) * 0.47123894f);
                    n2 = Math.abs(n2);
                    if (n2 > 0) {
                        n2 = Math.round(Math.abs((n11 * n10 + n10) / n2) * 1000.0f) * 4;
                    }
                    else {
                        n2 = (int)((Math.abs(n5) / (this.G0.D(this.H0) * n9 + this.O0) + 1.0f) * 100.0f);
                    }
                    n2 = Math.min(n2, 600);
                    this.M0 = false;
                    this.L0.startScroll(n4, scrollY, n5, n6, n2);
                    final WeakHashMap a = p5x.a;
                    p5x$d.k((View)this);
                }
            }
            if (b2) {
                this.h(n);
            }
        }
        else {
            if (b2) {
                this.h(n);
            }
            this.f(false);
            ((View)this).scrollTo(n3, 0);
            this.q(n3);
        }
    }
    
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ ElementType.TYPE })
    public @interface d {
    }
    
    public static final class e
    {
        public Object a;
        public int b;
        public boolean c;
        public float d;
        public float e;
    }
    
    public static final class f extends ViewGroup$LayoutParams
    {
        public boolean a;
        public int b;
        public float c;
        public boolean d;
        public int e;
        
        public f() {
            super(-1, -1);
            this.c = 0.0f;
        }
        
        public f(final Context context, final AttributeSet set) {
            super(context, set);
            this.c = 0.0f;
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ViewPager.y1);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }
    
    public interface h
    {
        void a(final ViewPager p0, final cuj p1);
    }
    
    public interface i
    {
        void B3(final int p0);
        
        void E(final int p0);
        
        void h2(final int p0, final float p1, final int p2);
    }
    
    public final class j extends DataSetObserver
    {
        public final void onChanged() {
            ViewPager.this.g();
        }
        
        public final void onInvalidated() {
            ViewPager.this.g();
        }
    }
}
