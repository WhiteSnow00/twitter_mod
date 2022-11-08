// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.widget.ImageView;
import android.view.ViewParent;
import java.util.Objects;
import androidx.appcompat.view.menu.l;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$MeasureSpec;
import android.text.TextUtils$TruncateAt;
import android.view.ContextThemeWrapper;
import java.util.Iterator;
import java.util.Collection;
import androidx.appcompat.view.menu.g;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.appcompat.app.a$a;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.e;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import java.util.WeakHashMap;
import android.view.Gravity;
import java.util.List;
import android.view.MenuInflater;
import android.view.Menu;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.e$a;
import androidx.appcompat.view.menu.i$a;
import android.view.MenuItem;
import java.util.ArrayList;
import android.content.res.ColorStateList;
import android.content.Context;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

public class Toolbar extends ViewGroup implements s4h
{
    public ActionMenuView C0;
    public AppCompatTextView D0;
    public AppCompatTextView E0;
    public AppCompatImageButton F0;
    public AppCompatImageView G0;
    public Drawable H0;
    public CharSequence I0;
    public AppCompatImageButton J0;
    public View K0;
    public Context L0;
    public int M0;
    public int N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public plo V0;
    public int W0;
    public int X0;
    public int Y0;
    public CharSequence Z0;
    public CharSequence a1;
    public ColorStateList b1;
    public ColorStateList c1;
    public boolean d1;
    public boolean e1;
    public final ArrayList<View> f1;
    public final ArrayList<View> g1;
    public final int[] h1;
    public final t4h i1;
    public ArrayList<MenuItem> j1;
    public Toolbar.Toolbar$f k1;
    public final Toolbar$a l1;
    public c m1;
    public ActionMenuPresenter n1;
    public d o1;
    public i$a p1;
    public e$a q1;
    public boolean r1;
    public final Toolbar$b s1;
    
    public Toolbar(final Context context, final AttributeSet set) {
        this(context, set, 2130970980);
    }
    
    public Toolbar(final Context context, final AttributeSet set, int n) {
        super(context, set, n);
        this.Y0 = 8388627;
        this.f1 = new ArrayList<View>();
        this.g1 = new ArrayList<View>();
        this.h1 = new int[2];
        this.i1 = new t4h((Runnable)new ght((Object)this, 0));
        this.j1 = new ArrayList<MenuItem>();
        this.l1 = new ActionMenuView$e() {};
        this.s1 = new Toolbar$b(this);
        final Context context2 = ((View)this).getContext();
        final int[] d1 = ck1.d1;
        final u9t q = u9t.q(context2, set, d1, n);
        p5x.y((View)this, context, d1, set, q.b, n);
        this.N0 = q.l(28, 0);
        this.O0 = q.l(19, 0);
        n = this.Y0;
        this.Y0 = q.b.getInteger(0, n);
        this.P0 = q.b.getInteger(2, 48);
        final int n2 = n = q.e(22, 0);
        if (q.o(27)) {
            n = q.e(27, n2);
        }
        this.U0 = n;
        this.T0 = n;
        this.S0 = n;
        this.R0 = n;
        n = q.e(25, -1);
        if (n >= 0) {
            this.R0 = n;
        }
        n = q.e(24, -1);
        if (n >= 0) {
            this.S0 = n;
        }
        n = q.e(26, -1);
        if (n >= 0) {
            this.T0 = n;
        }
        n = q.e(23, -1);
        if (n >= 0) {
            this.U0 = n;
        }
        this.Q0 = q.f(13, -1);
        final int e = q.e(9, Integer.MIN_VALUE);
        final int e2 = q.e(5, Integer.MIN_VALUE);
        n = q.f(7, 0);
        final int f = q.f(8, 0);
        this.d();
        final plo v0 = this.V0;
        v0.h = false;
        if (n != Integer.MIN_VALUE) {
            v0.e = n;
            v0.a = n;
        }
        if (f != Integer.MIN_VALUE) {
            v0.f = f;
            v0.b = f;
        }
        if (e != Integer.MIN_VALUE || e2 != Integer.MIN_VALUE) {
            v0.a(e, e2);
        }
        this.W0 = q.e(10, Integer.MIN_VALUE);
        this.X0 = q.e(6, Integer.MIN_VALUE);
        this.H0 = q.g(4);
        this.I0 = q.n(3);
        final CharSequence n3 = q.n(21);
        if (!TextUtils.isEmpty(n3)) {
            this.setTitle(n3);
        }
        final CharSequence n4 = q.n(18);
        if (!TextUtils.isEmpty(n4)) {
            this.setSubtitle(n4);
        }
        this.L0 = ((View)this).getContext();
        this.setPopupTheme(q.l(17, 0));
        final Drawable g = q.g(16);
        if (g != null) {
            this.setNavigationIcon(g);
        }
        final CharSequence n5 = q.n(15);
        if (!TextUtils.isEmpty(n5)) {
            this.setNavigationContentDescription(n5);
        }
        final Drawable g2 = q.g(11);
        if (g2 != null) {
            this.setLogo(g2);
        }
        final CharSequence n6 = q.n(12);
        if (!TextUtils.isEmpty(n6)) {
            this.setLogoDescription(n6);
        }
        if (q.o(29)) {
            this.setTitleTextColor(q.c(29));
        }
        if (q.o(20)) {
            this.setSubtitleTextColor(q.c(20));
        }
        if (q.o(14)) {
            this.p(q.l(14, 0));
        }
        q.r();
    }
    
    private ArrayList<MenuItem> getCurrentMenuItems() {
        final ArrayList list = new ArrayList();
        final Menu menu = this.getMenu();
        for (int i = 0; i < menu.size(); ++i) {
            list.add(menu.getItem(i));
        }
        return list;
    }
    
    private MenuInflater getMenuInflater() {
        return (MenuInflater)new ryr(((View)this).getContext());
    }
    
    public final void X(final h5h h5h) {
        this.i1.d(h5h);
    }
    
    public final void a(final List<View> list, int i) {
        final WeakHashMap a = p5x.a;
        final int d = p5x$e.d((View)this);
        final int n = 0;
        final boolean b = d == 1;
        final int childCount = this.getChildCount();
        final int absoluteGravity = Gravity.getAbsoluteGravity(i, p5x$e.d((View)this));
        list.clear();
        i = n;
        if (b) {
            View child;
            e e;
            for (i = childCount - 1; i >= 0; --i) {
                child = this.getChildAt(i);
                e = (e)child.getLayoutParams();
                if (e.b == 0 && this.x(child) && this.k(e.a) == absoluteGravity) {
                    list.add(child);
                }
            }
        }
        else {
            while (i < childCount) {
                final View child2 = this.getChildAt(i);
                final e e2 = (e)child2.getLayoutParams();
                if (e2.b == 0 && this.x(child2) && this.k(e2.a) == absoluteGravity) {
                    list.add(child2);
                }
                ++i;
            }
        }
    }
    
    public final void b(final View view, final boolean b) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        e layoutParams2;
        if (layoutParams == null) {
            layoutParams2 = this.i();
        }
        else if (!this.checkLayoutParams(layoutParams)) {
            layoutParams2 = this.j(layoutParams);
        }
        else {
            layoutParams2 = (e)layoutParams;
        }
        layoutParams2.b = 1;
        if (b && this.K0 != null) {
            view.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
            this.g1.add(view);
        }
        else {
            this.addView(view, (ViewGroup$LayoutParams)layoutParams2);
        }
    }
    
    public final void c() {
        if (this.J0 == null) {
            (this.J0 = new AppCompatImageButton(((View)this).getContext(), (AttributeSet)null, 2130970975)).setImageDrawable(this.H0);
            ((View)this.J0).setContentDescription(this.I0);
            final e layoutParams = new e();
            layoutParams.a = (0x800003 | (this.P0 & 0x70));
            layoutParams.b = 2;
            ((View)this.J0).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            ((View)this.J0).setOnClickListener((View$OnClickListener)new Toolbar$c(this));
        }
    }
    
    public final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return super.checkLayoutParams(viewGroup$LayoutParams) && viewGroup$LayoutParams instanceof e;
    }
    
    public final void d() {
        if (this.V0 == null) {
            this.V0 = new plo();
        }
    }
    
    public final void e() {
        this.f();
        final ActionMenuView c0 = this.C0;
        if (c0.R0 == null) {
            final androidx.appcompat.view.menu.e e = (androidx.appcompat.view.menu.e)c0.getMenu();
            if (this.o1 == null) {
                this.o1 = new d();
            }
            this.C0.setExpandedActionViewsExclusive(true);
            e.c((i)this.o1, this.L0);
        }
    }
    
    public final void f() {
        if (this.C0 == null) {
            (this.C0 = new ActionMenuView(((View)this).getContext(), null)).setPopupTheme(this.M0);
            this.C0.setOnMenuItemClickListener((ActionMenuView.ActionMenuView$e)this.l1);
            final ActionMenuView c0 = this.C0;
            final i$a p1 = this.p1;
            final e$a q1 = this.q1;
            c0.W0 = p1;
            c0.X0 = q1;
            final e layoutParams = new e();
            layoutParams.a = (0x800005 | (this.P0 & 0x70));
            ((View)this.C0).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            this.b((View)this.C0, false);
        }
    }
    
    public final void g() {
        if (this.F0 == null) {
            this.F0 = new AppCompatImageButton(((View)this).getContext(), (AttributeSet)null, 2130970975);
            final e layoutParams = new e();
            layoutParams.a = (0x800003 | (this.P0 & 0x70));
            ((View)this.F0).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        }
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new e(((View)this).getContext(), set);
    }
    
    public CharSequence getCollapseContentDescription() {
        final AppCompatImageButton j0 = this.J0;
        CharSequence contentDescription;
        if (j0 != null) {
            contentDescription = ((View)j0).getContentDescription();
        }
        else {
            contentDescription = null;
        }
        return contentDescription;
    }
    
    public Drawable getCollapseIcon() {
        final AppCompatImageButton j0 = this.J0;
        Drawable drawable;
        if (j0 != null) {
            drawable = ((ImageView)j0).getDrawable();
        }
        else {
            drawable = null;
        }
        return drawable;
    }
    
    public int getContentInsetEnd() {
        final plo v0 = this.V0;
        int n;
        if (v0 != null) {
            if (v0.g) {
                n = v0.a;
            }
            else {
                n = v0.b;
            }
        }
        else {
            n = 0;
        }
        return n;
    }
    
    public int getContentInsetEndWithActions() {
        int n = this.X0;
        if (n == Integer.MIN_VALUE) {
            n = this.getContentInsetEnd();
        }
        return n;
    }
    
    public int getContentInsetLeft() {
        final plo v0 = this.V0;
        int a;
        if (v0 != null) {
            a = v0.a;
        }
        else {
            a = 0;
        }
        return a;
    }
    
    public int getContentInsetRight() {
        final plo v0 = this.V0;
        int b;
        if (v0 != null) {
            b = v0.b;
        }
        else {
            b = 0;
        }
        return b;
    }
    
    public int getContentInsetStart() {
        final plo v0 = this.V0;
        int n;
        if (v0 != null) {
            if (v0.g) {
                n = v0.b;
            }
            else {
                n = v0.a;
            }
        }
        else {
            n = 0;
        }
        return n;
    }
    
    public int getContentInsetStartWithNavigation() {
        int n = this.W0;
        if (n == Integer.MIN_VALUE) {
            n = this.getContentInsetStart();
        }
        return n;
    }
    
    public int getCurrentContentInsetEnd() {
        final ActionMenuView c0 = this.C0;
        boolean b = false;
        Label_0032: {
            if (c0 != null) {
                final androidx.appcompat.view.menu.e r0 = c0.R0;
                if (r0 != null && r0.hasVisibleItems()) {
                    b = true;
                    break Label_0032;
                }
            }
            b = false;
        }
        int n;
        if (b) {
            n = Math.max(this.getContentInsetEnd(), Math.max(this.X0, 0));
        }
        else {
            n = this.getContentInsetEnd();
        }
        return n;
    }
    
    public int getCurrentContentInsetLeft() {
        final WeakHashMap a = p5x.a;
        int n;
        if (p5x$e.d((View)this) == 1) {
            n = this.getCurrentContentInsetEnd();
        }
        else {
            n = this.getCurrentContentInsetStart();
        }
        return n;
    }
    
    public int getCurrentContentInsetRight() {
        final WeakHashMap a = p5x.a;
        int n;
        if (p5x$e.d((View)this) == 1) {
            n = this.getCurrentContentInsetStart();
        }
        else {
            n = this.getCurrentContentInsetEnd();
        }
        return n;
    }
    
    public int getCurrentContentInsetStart() {
        int n;
        if (this.getNavigationIcon() != null) {
            n = Math.max(this.getContentInsetStart(), Math.max(this.W0, 0));
        }
        else {
            n = this.getContentInsetStart();
        }
        return n;
    }
    
    public Drawable getLogo() {
        final AppCompatImageView g0 = this.G0;
        Drawable drawable;
        if (g0 != null) {
            drawable = ((ImageView)g0).getDrawable();
        }
        else {
            drawable = null;
        }
        return drawable;
    }
    
    public CharSequence getLogoDescription() {
        final AppCompatImageView g0 = this.G0;
        CharSequence contentDescription;
        if (g0 != null) {
            contentDescription = ((View)g0).getContentDescription();
        }
        else {
            contentDescription = null;
        }
        return contentDescription;
    }
    
    public Menu getMenu() {
        this.e();
        return this.C0.getMenu();
    }
    
    public View getNavButtonView() {
        return (View)this.F0;
    }
    
    public CharSequence getNavigationContentDescription() {
        final AppCompatImageButton f0 = this.F0;
        CharSequence contentDescription;
        if (f0 != null) {
            contentDescription = ((View)f0).getContentDescription();
        }
        else {
            contentDescription = null;
        }
        return contentDescription;
    }
    
    public Drawable getNavigationIcon() {
        final AppCompatImageButton f0 = this.F0;
        Drawable drawable;
        if (f0 != null) {
            drawable = ((ImageView)f0).getDrawable();
        }
        else {
            drawable = null;
        }
        return drawable;
    }
    
    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.n1;
    }
    
    public Drawable getOverflowIcon() {
        this.e();
        return this.C0.getOverflowIcon();
    }
    
    Context getPopupContext() {
        return this.L0;
    }
    
    public int getPopupTheme() {
        return this.M0;
    }
    
    public CharSequence getSubtitle() {
        return this.a1;
    }
    
    public final TextView getSubtitleTextView() {
        return this.E0;
    }
    
    public CharSequence getTitle() {
        return this.Z0;
    }
    
    public int getTitleMarginBottom() {
        return this.U0;
    }
    
    public int getTitleMarginEnd() {
        return this.S0;
    }
    
    public int getTitleMarginStart() {
        return this.R0;
    }
    
    public int getTitleMarginTop() {
        return this.T0;
    }
    
    public final TextView getTitleTextView() {
        return this.D0;
    }
    
    public tc8 getWrapper() {
        if (this.m1 == null) {
            this.m1 = new c(this, true);
        }
        return this.m1;
    }
    
    public final void h(final h5h h5h) {
        final t4h i1 = this.i1;
        i1.b.add(h5h);
        i1.a.run();
    }
    
    public final e i() {
        return new e();
    }
    
    public final e j(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof e) {
            return new e((e)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof a$a) {
            return new e((a$a)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return new e((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return new e(viewGroup$LayoutParams);
    }
    
    public final int k(int n) {
        final WeakHashMap a = p5x.a;
        final int d = p5x$e.d((View)this);
        final int n2 = Gravity.getAbsoluteGravity(n, d) & 0x7;
        if (n2 != 1) {
            n = 3;
            if (n2 != 3 && n2 != 5) {
                if (d == 1) {
                    n = 5;
                }
                return n;
            }
        }
        return n2;
    }
    
    public final int l(final View view, int n) {
        final e e = (e)view.getLayoutParams();
        final int measuredHeight = view.getMeasuredHeight();
        if (n > 0) {
            n = (measuredHeight - n) / 2;
        }
        else {
            n = 0;
        }
        int n3;
        final int n2 = n3 = (e.a & 0x70);
        if (n2 != 16 && (n3 = n2) != 48 && (n3 = n2) != 80) {
            n3 = (this.Y0 & 0x70);
        }
        if (n3 == 48) {
            return ((View)this).getPaddingTop() - n;
        }
        if (n3 != 80) {
            final int paddingTop = ((View)this).getPaddingTop();
            final int paddingBottom = ((View)this).getPaddingBottom();
            final int height = ((View)this).getHeight();
            final int n4 = (height - paddingTop - paddingBottom - measuredHeight) / 2;
            n = ((ViewGroup$MarginLayoutParams)e).topMargin;
            if (n4 >= n) {
                final int n5 = height - paddingBottom - measuredHeight - n4 - paddingTop;
                final int bottomMargin = ((ViewGroup$MarginLayoutParams)e).bottomMargin;
                n = n4;
                if (n5 < bottomMargin) {
                    n = Math.max(0, n4 - (bottomMargin - n5));
                }
            }
            return paddingTop + n;
        }
        return ((View)this).getHeight() - ((View)this).getPaddingBottom() - measuredHeight - ((ViewGroup$MarginLayoutParams)e).bottomMargin - n;
    }
    
    public final int m(final View view) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        return wkg.b(viewGroup$MarginLayoutParams) + wkg.c(viewGroup$MarginLayoutParams);
    }
    
    public final int n(final View view) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        return viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin;
    }
    
    public final boolean o() {
        final ActionMenuView c0 = this.C0;
        boolean b = true;
        if (c0 != null) {
            final ActionMenuPresenter v0 = c0.V0;
            if (v0 != null && v0.k()) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((View)this).removeCallbacks((Runnable)this.s1);
    }
    
    public final boolean onHoverEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.e1 = false;
        }
        if (!this.e1) {
            final boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.e1 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.e1 = false;
        }
        return true;
    }
    
    public void onLayout(final boolean b, int i, int n, int j, int k) {
        final WeakHashMap a = p5x.a;
        final boolean b2 = p5x$e.d((View)this) == 1;
        final int width = ((View)this).getWidth();
        final int height = ((View)this).getHeight();
        j = ((View)this).getPaddingLeft();
        final int paddingRight = ((View)this).getPaddingRight();
        final int paddingTop = ((View)this).getPaddingTop();
        final int paddingBottom = ((View)this).getPaddingBottom();
        final int n2 = width - paddingRight;
        final int[] h1 = this.h1;
        h1[h1[1] = 0] = 0;
        i = p5x$d.d((View)this);
        if (i >= 0) {
            k = Math.min(i, k - n);
        }
        else {
            k = 0;
        }
        int u = 0;
        int t = 0;
        Label_0172: {
            if (this.x((View)this.F0)) {
                if (b2) {
                    u = this.u((View)this.F0, n2, h1, k);
                    t = j;
                    break Label_0172;
                }
                t = this.t((View)this.F0, j, h1, k);
            }
            else {
                t = j;
            }
            u = n2;
        }
        i = t;
        n = u;
        if (this.x((View)this.J0)) {
            if (b2) {
                n = this.u((View)this.J0, u, h1, k);
                i = t;
            }
            else {
                i = this.t((View)this.J0, t, h1, k);
                n = u;
            }
        }
        int t2 = i;
        int u2 = n;
        if (this.x((View)this.C0)) {
            if (b2) {
                t2 = this.t((View)this.C0, i, h1, k);
                u2 = n;
            }
            else {
                u2 = this.u((View)this.C0, n, h1, k);
                t2 = i;
            }
        }
        n = this.getCurrentContentInsetLeft();
        i = this.getCurrentContentInsetRight();
        h1[0] = Math.max(0, n - t2);
        h1[1] = Math.max(0, i - (n2 - u2));
        final int max = Math.max(t2, n);
        final int min = Math.min(u2, n2 - i);
        i = max;
        n = min;
        if (this.x(this.K0)) {
            if (b2) {
                n = this.u(this.K0, min, h1, k);
                i = max;
            }
            else {
                i = this.t(this.K0, max, h1, k);
                n = min;
            }
        }
        int t3 = i;
        int u3 = n;
        if (this.x((View)this.G0)) {
            if (b2) {
                u3 = this.u((View)this.G0, n, h1, k);
                t3 = i;
            }
            else {
                t3 = this.t((View)this.G0, i, h1, k);
                u3 = n;
            }
        }
        final boolean x = this.x((View)this.D0);
        final boolean x2 = this.x((View)this.E0);
        if (x) {
            final e e = (e)((View)this.D0).getLayoutParams();
            i = ((ViewGroup$MarginLayoutParams)e).topMargin;
            i = ((View)this.D0).getMeasuredHeight() + i + ((ViewGroup$MarginLayoutParams)e).bottomMargin + 0;
        }
        else {
            i = 0;
        }
        if (x2) {
            final e e2 = (e)((View)this.E0).getLayoutParams();
            n = ((ViewGroup$MarginLayoutParams)e2).topMargin;
            i += ((View)this.E0).getMeasuredHeight() + n + ((ViewGroup$MarginLayoutParams)e2).bottomMargin;
        }
        if (!x && !x2) {
            n = t3;
            i = u3;
        }
        else {
            AppCompatTextView appCompatTextView;
            if (x) {
                appCompatTextView = this.D0;
            }
            else {
                appCompatTextView = this.E0;
            }
            AppCompatTextView appCompatTextView2;
            if (x2) {
                appCompatTextView2 = this.E0;
            }
            else {
                appCompatTextView2 = this.D0;
            }
            final e e3 = (e)((View)appCompatTextView).getLayoutParams();
            final e e4 = (e)((View)appCompatTextView2).getLayoutParams();
            final boolean b3 = (x && ((View)this.D0).getMeasuredWidth() > 0) || (x2 && ((View)this.E0).getMeasuredWidth() > 0);
            n = (this.Y0 & 0x70);
            if (n != 48) {
                if (n != 80) {
                    n = (height - paddingTop - paddingBottom - i) / 2;
                    final int n3 = ((ViewGroup$MarginLayoutParams)e3).topMargin + this.T0;
                    if (n < n3) {
                        i = n3;
                    }
                    else {
                        final int n4 = height - paddingBottom - i - n - paddingTop;
                        final int bottomMargin = ((ViewGroup$MarginLayoutParams)e3).bottomMargin;
                        final int u4 = this.U0;
                        i = n;
                        if (n4 < bottomMargin + u4) {
                            i = Math.max(0, n - (((ViewGroup$MarginLayoutParams)e4).bottomMargin + u4 - n4));
                        }
                    }
                    i += paddingTop;
                }
                else {
                    i = height - paddingBottom - ((ViewGroup$MarginLayoutParams)e4).bottomMargin - this.U0 - i;
                }
            }
            else {
                i = ((View)this).getPaddingTop() + ((ViewGroup$MarginLayoutParams)e3).topMargin + this.T0;
            }
            if (b2) {
                if (b3) {
                    n = this.R0;
                }
                else {
                    n = 0;
                }
                n -= h1[1];
                final int n5 = u3 - Math.max(0, n);
                h1[1] = Math.max(0, -n);
                int n7;
                if (x) {
                    final e e5 = (e)((View)this.D0).getLayoutParams();
                    final int n6 = n5 - ((View)this.D0).getMeasuredWidth();
                    n = ((View)this.D0).getMeasuredHeight() + i;
                    ((View)this.D0).layout(n6, i, n5, n);
                    n7 = n6 - this.S0;
                    i = n + ((ViewGroup$MarginLayoutParams)e5).bottomMargin;
                }
                else {
                    n7 = n5;
                }
                int n8;
                if (x2) {
                    n = i + ((ViewGroup$MarginLayoutParams)((View)this.E0).getLayoutParams()).topMargin;
                    final int measuredWidth = ((View)this.E0).getMeasuredWidth();
                    i = ((View)this.E0).getMeasuredHeight();
                    ((View)this.E0).layout(n5 - measuredWidth, n, n5, i + n);
                    n8 = n5 - this.S0;
                }
                else {
                    n8 = n5;
                }
                n = t3;
                i = n5;
                if (b3) {
                    i = Math.min(n7, n8);
                    n = t3;
                }
            }
            else {
                if (b3) {
                    n = this.R0;
                }
                else {
                    n = 0;
                }
                final int n9 = n - h1[0];
                n = t3 + Math.max(0, n9);
                h1[0] = Math.max(0, -n9);
                int n12;
                if (x) {
                    final e e6 = (e)((View)this.D0).getLayoutParams();
                    final int n10 = ((View)this.D0).getMeasuredWidth() + n;
                    final int n11 = ((View)this.D0).getMeasuredHeight() + i;
                    ((View)this.D0).layout(n, i, n10, n11);
                    n12 = n10 + this.S0;
                    i = n11 + ((ViewGroup$MarginLayoutParams)e6).bottomMargin;
                }
                else {
                    n12 = n;
                }
                int n14;
                if (x2) {
                    i += ((ViewGroup$MarginLayoutParams)((View)this.E0).getLayoutParams()).topMargin;
                    final int n13 = ((View)this.E0).getMeasuredWidth() + n;
                    ((View)this.E0).layout(n, i, n13, ((View)this.E0).getMeasuredHeight() + i);
                    n14 = n13 + this.S0;
                }
                else {
                    n14 = n;
                }
                i = u3;
                if (b3) {
                    n = Math.max(n12, n14);
                    i = u3;
                }
            }
        }
        final int n15 = k;
        final int n16 = j;
        this.a(this.f1, 3);
        for (k = this.f1.size(), j = 0; j < k; ++j) {
            n = this.t(this.f1.get(j), n, h1, n15);
        }
        this.a(this.f1, 5);
        for (k = this.f1.size(), j = 0; j < k; ++j) {
            i = this.u(this.f1.get(j), i, h1, n15);
        }
        this.a(this.f1, 1);
        final ArrayList<View> f1 = this.f1;
        int max2 = h1[0];
        int max3 = h1[1];
        final int size = f1.size();
        k = 0;
        j = 0;
        while (k < size) {
            final View view = f1.get(k);
            final e e7 = (e)view.getLayoutParams();
            final int n17 = ((ViewGroup$MarginLayoutParams)e7).leftMargin - max2;
            final int n18 = ((ViewGroup$MarginLayoutParams)e7).rightMargin - max3;
            final int max4 = Math.max(0, n17);
            final int max5 = Math.max(0, n18);
            max2 = Math.max(0, -n17);
            max3 = Math.max(0, -n18);
            j += view.getMeasuredWidth() + max4 + max5;
            ++k;
        }
        k = (width - n16 - paddingRight) / 2 + n16 - j / 2;
        j += k;
        if (k < n) {
            i = n;
        }
        else if (j > i) {
            i = k - (j - i);
        }
        else {
            i = k;
        }
        j = this.f1.size();
        n = i;
        for (i = 0; i < j; ++i) {
            n = this.t(this.f1.get(i), n, h1, n15);
        }
        this.f1.clear();
    }
    
    public final void onMeasure(int i, int resolveSizeAndState) {
        final int[] h1 = this.h1;
        final int b = vbx.b((View)this) ? 1 : 0;
        final boolean x = this.x((View)this.F0);
        final int n = 0;
        int n2;
        int max;
        int combineMeasuredStates;
        if (x) {
            this.w((View)this.F0, i, 0, resolveSizeAndState, this.Q0);
            n2 = this.m((View)this.F0) + ((View)this.F0).getMeasuredWidth();
            max = Math.max(0, this.n((View)this.F0) + ((View)this.F0).getMeasuredHeight());
            combineMeasuredStates = View.combineMeasuredStates(0, ((View)this.F0).getMeasuredState());
        }
        else {
            n2 = 0;
            max = 0;
            combineMeasuredStates = 0;
        }
        int n3 = n2;
        int n4 = max;
        int n5 = combineMeasuredStates;
        if (this.x((View)this.J0)) {
            this.w((View)this.J0, i, 0, resolveSizeAndState, this.Q0);
            n3 = this.m((View)this.J0) + ((View)this.J0).getMeasuredWidth();
            n4 = Math.max(max, this.n((View)this.J0) + ((View)this.J0).getMeasuredHeight());
            n5 = View.combineMeasuredStates(combineMeasuredStates, ((View)this.J0).getMeasuredState());
        }
        final int currentContentInsetStart = this.getCurrentContentInsetStart();
        final int n6 = Math.max(currentContentInsetStart, n3) + 0;
        h1[b] = Math.max(0, currentContentInsetStart - n3);
        int n7;
        if (this.x((View)this.C0)) {
            this.w((View)this.C0, i, n6, resolveSizeAndState, this.Q0);
            n7 = this.m((View)this.C0) + ((View)this.C0).getMeasuredWidth();
            n4 = Math.max(n4, this.n((View)this.C0) + ((View)this.C0).getMeasuredHeight());
            n5 = View.combineMeasuredStates(n5, ((View)this.C0).getMeasuredState());
        }
        else {
            n7 = 0;
        }
        final int currentContentInsetEnd = this.getCurrentContentInsetEnd();
        final int n8 = n6 + Math.max(currentContentInsetEnd, n7);
        h1[b ^ 0x1] = Math.max(0, currentContentInsetEnd - n7);
        int max2 = n4;
        int combineMeasuredStates2 = n5;
        int n9 = n8;
        if (this.x(this.K0)) {
            n9 = n8 + this.v(this.K0, i, n8, resolveSizeAndState, 0, h1);
            max2 = Math.max(n4, this.n(this.K0) + this.K0.getMeasuredHeight());
            combineMeasuredStates2 = View.combineMeasuredStates(n5, this.K0.getMeasuredState());
        }
        int max3 = max2;
        int combineMeasuredStates3 = combineMeasuredStates2;
        int n10 = n9;
        if (this.x((View)this.G0)) {
            n10 = n9 + this.v((View)this.G0, i, n9, resolveSizeAndState, 0, h1);
            max3 = Math.max(max2, this.n((View)this.G0) + ((View)this.G0).getMeasuredHeight());
            combineMeasuredStates3 = View.combineMeasuredStates(combineMeasuredStates2, ((View)this.G0).getMeasuredState());
        }
        final int childCount = this.getChildCount();
        int j = 0;
        int n11 = n10;
        int n12 = combineMeasuredStates3;
        while (j < childCount) {
            final View child = this.getChildAt(j);
            int max4 = max3;
            int combineMeasuredStates4 = n12;
            int n13 = n11;
            if (((e)child.getLayoutParams()).b == 0) {
                if (!this.x(child)) {
                    max4 = max3;
                    combineMeasuredStates4 = n12;
                    n13 = n11;
                }
                else {
                    n13 = n11 + this.v(child, i, n11, resolveSizeAndState, 0, h1);
                    max4 = Math.max(max3, this.n(child) + child.getMeasuredHeight());
                    combineMeasuredStates4 = View.combineMeasuredStates(n12, child.getMeasuredState());
                }
            }
            ++j;
            max3 = max4;
            n12 = combineMeasuredStates4;
            n11 = n13;
        }
        final int n14 = this.T0 + this.U0;
        final int n15 = this.R0 + this.S0;
        int n17;
        int max5;
        if (this.x((View)this.D0)) {
            this.v((View)this.D0, i, n11 + n15, resolveSizeAndState, n14, h1);
            final int measuredWidth = ((View)this.D0).getMeasuredWidth();
            final int m = this.m((View)this.D0);
            final int measuredHeight = ((View)this.D0).getMeasuredHeight();
            final int n16 = this.n((View)this.D0);
            n12 = View.combineMeasuredStates(n12, ((View)this.D0).getMeasuredState());
            n17 = n16 + measuredHeight;
            max5 = m + measuredWidth;
        }
        else {
            max5 = 0;
            n17 = 0;
        }
        if (this.x((View)this.E0)) {
            max5 = Math.max(max5, this.v((View)this.E0, i, n11 + n15, resolveSizeAndState, n17 + n14, h1));
            n17 += this.n((View)this.E0) + ((View)this.E0).getMeasuredHeight();
            n12 = View.combineMeasuredStates(n12, ((View)this.E0).getMeasuredState());
        }
        final int max6 = Math.max(max3, n17);
        final int paddingLeft = ((View)this).getPaddingLeft();
        final int paddingRight = ((View)this).getPaddingRight();
        final int paddingTop = ((View)this).getPaddingTop();
        final int paddingBottom = ((View)this).getPaddingBottom();
        final int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight + paddingLeft + (n11 + max5), ((View)this).getSuggestedMinimumWidth()), i, 0xFF000000 & n12);
        resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom + paddingTop + max6, ((View)this).getSuggestedMinimumHeight()), resolveSizeAndState, n12 << 16);
        Label_1056: {
            Label_1043: {
                if (this.r1) {
                    int childCount2;
                    View child2;
                    for (childCount2 = this.getChildCount(), i = 0; i < childCount2; ++i) {
                        child2 = this.getChildAt(i);
                        if (this.x(child2) && child2.getMeasuredWidth() > 0 && child2.getMeasuredHeight() > 0) {
                            break Label_1043;
                        }
                    }
                    i = 1;
                    break Label_1056;
                }
            }
            i = 0;
        }
        if (i != 0) {
            i = n;
        }
        else {
            i = resolveSizeAndState;
        }
        ((View)this).setMeasuredDimension(resolveSizeAndState2, i);
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final SavedState savedState = (SavedState)parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        final ActionMenuView c0 = this.C0;
        androidx.appcompat.view.menu.e r0;
        if (c0 != null) {
            r0 = c0.R0;
        }
        else {
            r0 = null;
        }
        final int expandedMenuItemId = savedState.expandedMenuItemId;
        if (expandedMenuItemId != 0 && this.o1 != null && r0 != null) {
            final MenuItem item = r0.findItem(expandedMenuItemId);
            if (item != null) {
                item.expandActionView();
            }
        }
        if (savedState.isOverflowOpen) {
            ((View)this).removeCallbacks((Runnable)this.s1);
            ((View)this).post((Runnable)this.s1);
        }
    }
    
    public final void onRtlPropertiesChanged(int n) {
        super.onRtlPropertiesChanged(n);
        this.d();
        final plo v0 = this.V0;
        boolean g = true;
        if (n != 1) {
            g = false;
        }
        if (g != v0.g) {
            v0.g = g;
            if (v0.h) {
                if (g) {
                    n = v0.d;
                    if (n == Integer.MIN_VALUE) {
                        n = v0.e;
                    }
                    v0.a = n;
                    n = v0.c;
                    if (n == Integer.MIN_VALUE) {
                        n = v0.f;
                    }
                    v0.b = n;
                }
                else {
                    n = v0.c;
                    if (n == Integer.MIN_VALUE) {
                        n = v0.e;
                    }
                    v0.a = n;
                    n = v0.d;
                    if (n == Integer.MIN_VALUE) {
                        n = v0.f;
                    }
                    v0.b = n;
                }
            }
            else {
                v0.a = v0.e;
                v0.b = v0.f;
            }
        }
    }
    
    public Parcelable onSaveInstanceState() {
        final SavedState savedState = new SavedState(super.onSaveInstanceState());
        final d o1 = this.o1;
        if (o1 != null) {
            final g d0 = o1.D0;
            if (d0 != null) {
                savedState.expandedMenuItemId = d0.a;
            }
        }
        savedState.isOverflowOpen = this.s();
        return (Parcelable)savedState;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.d1 = false;
        }
        if (!this.d1) {
            final boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.d1 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.d1 = false;
        }
        return true;
    }
    
    public final void p(final int n) {
        this.getMenuInflater().inflate(n, this.getMenu());
    }
    
    public final void q() {
        final Iterator<MenuItem> iterator = this.j1.iterator();
        while (iterator.hasNext()) {
            this.getMenu().removeItem(iterator.next().getItemId());
        }
        final Menu menu = this.getMenu();
        final ArrayList<MenuItem> currentMenuItems = this.getCurrentMenuItems();
        this.i1.a(menu, this.getMenuInflater());
        final ArrayList<MenuItem> currentMenuItems2 = this.getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.j1 = currentMenuItems2;
        this.i1.c(menu);
    }
    
    public final boolean r(final View view) {
        return view.getParent() == this || this.g1.contains(view);
    }
    
    public final boolean s() {
        final ActionMenuView c0 = this.C0;
        boolean b = true;
        if (c0 != null) {
            final ActionMenuPresenter v0 = c0.V0;
            if (v0 != null && v0.l()) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public void setCollapseContentDescription(final int n) {
        CharSequence text;
        if (n != 0) {
            text = ((View)this).getContext().getText(n);
        }
        else {
            text = null;
        }
        this.setCollapseContentDescription(text);
    }
    
    public void setCollapseContentDescription(final CharSequence contentDescription) {
        if (!TextUtils.isEmpty(contentDescription)) {
            this.c();
        }
        final AppCompatImageButton j0 = this.J0;
        if (j0 != null) {
            ((View)j0).setContentDescription(contentDescription);
        }
    }
    
    public void setCollapseIcon(final int n) {
        this.setCollapseIcon(qli.g(((View)this).getContext(), n));
    }
    
    public void setCollapseIcon(final Drawable imageDrawable) {
        if (imageDrawable != null) {
            this.c();
            this.J0.setImageDrawable(imageDrawable);
        }
        else {
            final AppCompatImageButton j0 = this.J0;
            if (j0 != null) {
                j0.setImageDrawable(this.H0);
            }
        }
    }
    
    public void setCollapsible(final boolean r1) {
        this.r1 = r1;
        ((View)this).requestLayout();
    }
    
    public void setContentInsetEndWithActions(final int n) {
        int x0 = n;
        if (n < 0) {
            x0 = Integer.MIN_VALUE;
        }
        if (x0 != this.X0) {
            this.X0 = x0;
            if (this.getNavigationIcon() != null) {
                ((View)this).requestLayout();
            }
        }
    }
    
    public void setContentInsetStartWithNavigation(final int n) {
        int w0 = n;
        if (n < 0) {
            w0 = Integer.MIN_VALUE;
        }
        if (w0 != this.W0) {
            this.W0 = w0;
            if (this.getNavigationIcon() != null) {
                ((View)this).requestLayout();
            }
        }
    }
    
    public void setLogo(final int n) {
        this.setLogo(qli.g(((View)this).getContext(), n));
    }
    
    public void setLogo(final Drawable imageDrawable) {
        if (imageDrawable != null) {
            if (this.G0 == null) {
                this.G0 = new AppCompatImageView(((View)this).getContext(), (AttributeSet)null);
            }
            if (!this.r((View)this.G0)) {
                this.b((View)this.G0, true);
            }
        }
        else {
            final AppCompatImageView g0 = this.G0;
            if (g0 != null && this.r((View)g0)) {
                this.removeView((View)this.G0);
                this.g1.remove(this.G0);
            }
        }
        final AppCompatImageView g2 = this.G0;
        if (g2 != null) {
            g2.setImageDrawable(imageDrawable);
        }
    }
    
    public void setLogoDescription(final int n) {
        this.setLogoDescription(((View)this).getContext().getText(n));
    }
    
    public void setLogoDescription(final CharSequence contentDescription) {
        if (!TextUtils.isEmpty(contentDescription) && this.G0 == null) {
            this.G0 = new AppCompatImageView(((View)this).getContext(), (AttributeSet)null);
        }
        final AppCompatImageView g0 = this.G0;
        if (g0 != null) {
            ((View)g0).setContentDescription(contentDescription);
        }
    }
    
    public void setNavigationContentDescription(final int n) {
        CharSequence text;
        if (n != 0) {
            text = ((View)this).getContext().getText(n);
        }
        else {
            text = null;
        }
        this.setNavigationContentDescription(text);
    }
    
    public void setNavigationContentDescription(final CharSequence contentDescription) {
        if (!TextUtils.isEmpty(contentDescription)) {
            this.g();
        }
        final AppCompatImageButton f0 = this.F0;
        if (f0 != null) {
            ((View)f0).setContentDescription(contentDescription);
            hit.a((View)this.F0, contentDescription);
        }
    }
    
    public void setNavigationIcon(final int n) {
        this.setNavigationIcon(qli.g(((View)this).getContext(), n));
    }
    
    public void setNavigationIcon(final Drawable imageDrawable) {
        if (imageDrawable != null) {
            this.g();
            if (!this.r((View)this.F0)) {
                this.b((View)this.F0, true);
            }
        }
        else {
            final AppCompatImageButton f0 = this.F0;
            if (f0 != null && this.r((View)f0)) {
                this.removeView((View)this.F0);
                this.g1.remove(this.F0);
            }
        }
        final AppCompatImageButton f2 = this.F0;
        if (f2 != null) {
            f2.setImageDrawable(imageDrawable);
        }
    }
    
    public void setNavigationOnClickListener(final View$OnClickListener onClickListener) {
        this.g();
        ((View)this.F0).setOnClickListener(onClickListener);
    }
    
    public void setOnMenuItemClickListener(final Toolbar.Toolbar$f k1) {
        this.k1 = k1;
    }
    
    public void setOverflowIcon(final Drawable overflowIcon) {
        this.e();
        this.C0.setOverflowIcon(overflowIcon);
    }
    
    public void setPopupTheme(final int m0) {
        if (this.M0 != m0) {
            if ((this.M0 = m0) == 0) {
                this.L0 = ((View)this).getContext();
            }
            else {
                this.L0 = (Context)new ContextThemeWrapper(((View)this).getContext(), m0);
            }
        }
    }
    
    public void setSubtitle(final int n) {
        this.setSubtitle(((View)this).getContext().getText(n));
    }
    
    public void setSubtitle(final CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.E0 == null) {
                final Context context = ((View)this).getContext();
                (this.E0 = new AppCompatTextView(context, null)).setSingleLine();
                this.E0.setEllipsize(TextUtils$TruncateAt.END);
                final int o0 = this.O0;
                if (o0 != 0) {
                    this.E0.setTextAppearance(context, o0);
                }
                final ColorStateList c1 = this.c1;
                if (c1 != null) {
                    this.E0.setTextColor(c1);
                }
            }
            if (!this.r((View)this.E0)) {
                this.b((View)this.E0, true);
            }
        }
        else {
            final AppCompatTextView e0 = this.E0;
            if (e0 != null && this.r((View)e0)) {
                this.removeView((View)this.E0);
                this.g1.remove(this.E0);
            }
        }
        final AppCompatTextView e2 = this.E0;
        if (e2 != null) {
            e2.setText(charSequence);
        }
        this.a1 = charSequence;
    }
    
    public void setSubtitleTextColor(final int n) {
        this.setSubtitleTextColor(ColorStateList.valueOf(n));
    }
    
    public void setSubtitleTextColor(final ColorStateList list) {
        this.c1 = list;
        final AppCompatTextView e0 = this.E0;
        if (e0 != null) {
            e0.setTextColor(list);
        }
    }
    
    public void setTitle(final int n) {
        this.setTitle(((View)this).getContext().getText(n));
    }
    
    public void setTitle(final CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.D0 == null) {
                final Context context = ((View)this).getContext();
                (this.D0 = new AppCompatTextView(context, null)).setSingleLine();
                this.D0.setEllipsize(TextUtils$TruncateAt.END);
                final int n0 = this.N0;
                if (n0 != 0) {
                    this.D0.setTextAppearance(context, n0);
                }
                final ColorStateList b1 = this.b1;
                if (b1 != null) {
                    this.D0.setTextColor(b1);
                }
            }
            if (!this.r((View)this.D0)) {
                this.b((View)this.D0, true);
            }
        }
        else {
            final AppCompatTextView d0 = this.D0;
            if (d0 != null && this.r((View)d0)) {
                this.removeView((View)this.D0);
                this.g1.remove(this.D0);
            }
        }
        final AppCompatTextView d2 = this.D0;
        if (d2 != null) {
            d2.setText(charSequence);
        }
        this.Z0 = charSequence;
    }
    
    public void setTitleMarginBottom(final int u0) {
        this.U0 = u0;
        ((View)this).requestLayout();
    }
    
    public void setTitleMarginEnd(final int s0) {
        this.S0 = s0;
        ((View)this).requestLayout();
    }
    
    public void setTitleMarginStart(final int r0) {
        this.R0 = r0;
        ((View)this).requestLayout();
    }
    
    public void setTitleMarginTop(final int t0) {
        this.T0 = t0;
        ((View)this).requestLayout();
    }
    
    public void setTitleTextColor(final int n) {
        this.setTitleTextColor(ColorStateList.valueOf(n));
    }
    
    public void setTitleTextColor(final ColorStateList list) {
        this.b1 = list;
        final AppCompatTextView d0 = this.D0;
        if (d0 != null) {
            d0.setTextColor(list);
        }
    }
    
    public final int t(final View view, int n, final int[] array, int l) {
        final e e = (e)view.getLayoutParams();
        final int n2 = ((ViewGroup$MarginLayoutParams)e).leftMargin - array[0];
        n += Math.max(0, n2);
        array[0] = Math.max(0, -n2);
        l = this.l(view, l);
        final int measuredWidth = view.getMeasuredWidth();
        view.layout(n, l, n + measuredWidth, view.getMeasuredHeight() + l);
        return measuredWidth + ((ViewGroup$MarginLayoutParams)e).rightMargin + n;
    }
    
    public final int u(final View view, int n, final int[] array, int l) {
        final e e = (e)view.getLayoutParams();
        final int n2 = ((ViewGroup$MarginLayoutParams)e).rightMargin - array[1];
        n -= Math.max(0, n2);
        array[1] = Math.max(0, -n2);
        l = this.l(view, l);
        final int measuredWidth = view.getMeasuredWidth();
        view.layout(n - measuredWidth, l, n, view.getMeasuredHeight() + l);
        return n - (measuredWidth + ((ViewGroup$MarginLayoutParams)e).leftMargin);
    }
    
    public final int v(final View view, int childMeasureSpec, int paddingTop, final int n, final int n2, final int[] array) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        final int n3 = viewGroup$MarginLayoutParams.leftMargin - array[0];
        final int n4 = viewGroup$MarginLayoutParams.rightMargin - array[1];
        final int n5 = Math.max(0, n4) + Math.max(0, n3);
        array[0] = Math.max(0, -n3);
        array[1] = Math.max(0, -n4);
        childMeasureSpec = ViewGroup.getChildMeasureSpec(childMeasureSpec, ((View)this).getPaddingRight() + ((View)this).getPaddingLeft() + n5 + paddingTop, viewGroup$MarginLayoutParams.width);
        paddingTop = ((View)this).getPaddingTop();
        view.measure(childMeasureSpec, ViewGroup.getChildMeasureSpec(n, ((View)this).getPaddingBottom() + paddingTop + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin + n2, viewGroup$MarginLayoutParams.height));
        return view.getMeasuredWidth() + n5;
    }
    
    public final void w(final View view, int n, int childMeasureSpec, int mode, final int n2) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        final int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(n, ((View)this).getPaddingRight() + ((View)this).getPaddingLeft() + viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin + childMeasureSpec, viewGroup$MarginLayoutParams.width);
        n = ((View)this).getPaddingTop();
        childMeasureSpec = ViewGroup.getChildMeasureSpec(mode, ((View)this).getPaddingBottom() + n + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin + 0, viewGroup$MarginLayoutParams.height);
        mode = View$MeasureSpec.getMode(childMeasureSpec);
        n = childMeasureSpec;
        if (mode != 1073741824) {
            n = childMeasureSpec;
            if (n2 >= 0) {
                n = n2;
                if (mode != 0) {
                    n = Math.min(View$MeasureSpec.getSize(childMeasureSpec), n2);
                }
                n = View$MeasureSpec.makeMeasureSpec(n, 1073741824);
            }
        }
        view.measure(childMeasureSpec2, n);
    }
    
    public final boolean x(final View view) {
        return view != null && view.getParent() == this && view.getVisibility() != 8;
    }
    
    public final boolean y() {
        final ActionMenuView c0 = this.C0;
        boolean b = true;
        if (c0 != null) {
            final ActionMenuPresenter v0 = c0.V0;
            if (v0 != null && v0.m()) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public static class SavedState extends fa
    {
        public static final Parcelable$Creator<SavedState> CREATOR;
        public int expandedMenuItemId;
        public boolean isOverflowOpen;
        
        static {
            CREATOR = (Parcelable$Creator)new Toolbar$SavedState$a();
        }
        
        public SavedState(final Parcel parcel) {
            this(parcel, null);
        }
        
        public SavedState(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.expandedMenuItemId = parcel.readInt();
            this.isOverflowOpen = (parcel.readInt() != 0);
        }
        
        public SavedState(final Parcelable parcelable) {
            super(parcelable);
        }
        
        @Override
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt(this.expandedMenuItemId);
            parcel.writeInt((int)(this.isOverflowOpen ? 1 : 0));
        }
    }
    
    public final class d implements i
    {
        public androidx.appcompat.view.menu.e C0;
        public g D0;
        
        public final void a(final androidx.appcompat.view.menu.e e, final boolean b) {
        }
        
        public final boolean c(final g g) {
            final View k0 = Toolbar.this.K0;
            if (k0 instanceof hq4) {
                ((hq4)k0).e();
            }
            final Toolbar e0 = Toolbar.this;
            e0.removeView(e0.K0);
            final Toolbar e2 = Toolbar.this;
            e2.removeView((View)e2.J0);
            final Toolbar e3 = Toolbar.this;
            e3.K0 = null;
            int size = e3.g1.size();
            while (--size >= 0) {
                e3.addView((View)e3.g1.get(size));
            }
            e3.g1.clear();
            this.D0 = null;
            ((View)Toolbar.this).requestLayout();
            g.C = false;
            g.n.r(false);
            return true;
        }
        
        public final void d() {
            if (this.D0 != null) {
                final androidx.appcompat.view.menu.e c0 = this.C0;
                int n = 0;
                if (c0 != null) {
                    final int size = c0.size();
                    int n2 = 0;
                    while (true) {
                        n = n;
                        if (n2 >= size) {
                            break;
                        }
                        if (this.C0.getItem(n2) == this.D0) {
                            n = 1;
                            break;
                        }
                        ++n2;
                    }
                }
                if (n == 0) {
                    this.c(this.D0);
                }
            }
        }
        
        public final boolean e(final l l) {
            return false;
        }
        
        public final boolean f(final g d0) {
            Toolbar.this.c();
            final ViewParent parent = ((View)Toolbar.this.J0).getParent();
            final Toolbar e0 = Toolbar.this;
            if (parent != e0) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup)parent).removeView((View)e0.J0);
                }
                final Toolbar e2 = Toolbar.this;
                e2.addView((View)e2.J0);
            }
            Toolbar.this.K0 = d0.getActionView();
            this.D0 = d0;
            final ViewParent parent2 = Toolbar.this.K0.getParent();
            final Toolbar e3 = Toolbar.this;
            if (parent2 != e3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup)parent2).removeView(e3.K0);
                }
                Objects.requireNonNull(Toolbar.this);
                final e layoutParams = new e();
                final Toolbar e4 = Toolbar.this;
                layoutParams.a = (0x800003 | (e4.P0 & 0x70));
                layoutParams.b = 2;
                e4.K0.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                final Toolbar e5 = Toolbar.this;
                e5.addView(e5.K0);
            }
            final Toolbar e6 = Toolbar.this;
            int childCount = e6.getChildCount();
            while (true) {
                final int n = childCount - 1;
                if (n < 0) {
                    break;
                }
                final View child = e6.getChildAt(n);
                childCount = n;
                if (((e)child.getLayoutParams()).b == 2) {
                    continue;
                }
                childCount = n;
                if (child == e6.C0) {
                    continue;
                }
                e6.removeViewAt(n);
                e6.g1.add(child);
                childCount = n;
            }
            ((View)Toolbar.this).requestLayout();
            d0.C = true;
            d0.n.r(false);
            final View k0 = Toolbar.this.K0;
            if (k0 instanceof hq4) {
                ((hq4)k0).b();
            }
            return true;
        }
        
        public final boolean g() {
            return false;
        }
        
        public final void h(final Context context, final androidx.appcompat.view.menu.e c0) {
            final androidx.appcompat.view.menu.e c2 = this.C0;
            if (c2 != null) {
                final g d0 = this.D0;
                if (d0 != null) {
                    c2.e(d0);
                }
            }
            this.C0 = c0;
        }
    }
    
    public static final class e extends a$a
    {
        public int b;
        
        public e() {
            super(-2, -2);
            this.b = 0;
            super.a = 8388627;
        }
        
        public e(final Context context, final AttributeSet set) {
            super(context, set);
            this.b = 0;
        }
        
        public e(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.b = 0;
        }
        
        public e(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super((ViewGroup$LayoutParams)viewGroup$MarginLayoutParams);
            this.b = 0;
            ((ViewGroup$MarginLayoutParams)this).leftMargin = viewGroup$MarginLayoutParams.leftMargin;
            ((ViewGroup$MarginLayoutParams)this).topMargin = viewGroup$MarginLayoutParams.topMargin;
            ((ViewGroup$MarginLayoutParams)this).rightMargin = viewGroup$MarginLayoutParams.rightMargin;
            ((ViewGroup$MarginLayoutParams)this).bottomMargin = viewGroup$MarginLayoutParams.bottomMargin;
        }
        
        public e(final a$a a$a) {
            super(a$a);
            this.b = 0;
        }
        
        public e(final e e) {
            super((a$a)e);
            this.b = 0;
            this.b = e.b;
        }
    }
}
