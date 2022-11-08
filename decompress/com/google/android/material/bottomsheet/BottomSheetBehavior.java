// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.bottomsheet;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$MeasureSpec;
import android.os.Parcelable;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.view.View$OnAttachStateChangeListener;
import android.os.Build$VERSION;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.WeakHashMap;
import android.view.ViewParent;
import android.util.Log;
import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.util.TypedValue;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Objects;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import java.util.Map;
import android.view.VelocityTracker;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;

public class BottomSheetBehavior<V extends View> extends c<V>
{
    public int A;
    public int B;
    public int C;
    public float D;
    public int E;
    public float F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public i6x K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public WeakReference<V> R;
    public WeakReference<View> S;
    public final ArrayList<BottomSheetBehavior.BottomSheetBehavior$c> T;
    public VelocityTracker U;
    public int V;
    public int W;
    public boolean X;
    public Map<View, Integer> Y;
    public int Z;
    public int a;
    public final BottomSheetBehavior$b a0;
    public boolean b;
    public float c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public qng h;
    public ColorStateList i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public pqp w;
    public boolean x;
    public final BottomSheetBehavior.BottomSheetBehavior$d y;
    public ValueAnimator z;
    
    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.j = -1;
        this.k = -1;
        this.y = new BottomSheetBehavior.BottomSheetBehavior$d(this);
        this.D = 0.5f;
        this.F = -1.0f;
        this.I = true;
        this.J = 4;
        this.T = new ArrayList<BottomSheetBehavior.BottomSheetBehavior$c>();
        this.Z = -1;
        this.a0 = new i6x.c() {
            @Override
            public final int a(final View view, final int n) {
                return view.getLeft();
            }
            
            @Override
            public final int b(final View view, final int n, int n2) {
                final int a = BottomSheetBehavior.this.A();
                final BottomSheetBehavior a2 = BottomSheetBehavior.this;
                if (a2.G) {
                    n2 = a2.Q;
                }
                else {
                    n2 = a2.E;
                }
                return fk7.q(n, a, n2);
            }
            
            @Override
            public final int e(final View view) {
                final BottomSheetBehavior a = BottomSheetBehavior.this;
                if (a.G) {
                    return a.Q;
                }
                return a.E;
            }
            
            @Override
            public final void i(final int n) {
                if (n == 1) {
                    final BottomSheetBehavior a = BottomSheetBehavior.this;
                    if (a.I) {
                        a.I(1);
                    }
                }
            }
            
            @Override
            public final void j(final View view, final int n, final int n2, final int n3, final int n4) {
                BottomSheetBehavior.this.w(n2);
            }
            
            @Override
            public final void k(final View view, final float n, final float n2) {
                int n3 = 4;
                Label_0417: {
                    Label_0281: {
                        Label_0019: {
                            if (n2 < 0.0f) {
                                if (!BottomSheetBehavior.this.b) {
                                    final int top = view.getTop();
                                    System.currentTimeMillis();
                                    Objects.requireNonNull(BottomSheetBehavior.this);
                                    if (top > BottomSheetBehavior.this.C) {
                                        break Label_0281;
                                    }
                                }
                            }
                            else {
                                final BottomSheetBehavior a = BottomSheetBehavior.this;
                                if (a.G && a.J(view, n2)) {
                                    if (Math.abs(n) >= Math.abs(n2) || n2 <= 500.0f) {
                                        final int top2 = view.getTop();
                                        final BottomSheetBehavior a2 = BottomSheetBehavior.this;
                                        if (top2 <= (a2.A() + a2.Q) / 2) {
                                            if (BottomSheetBehavior.this.b) {
                                                break Label_0019;
                                            }
                                            if (Math.abs(view.getTop() - BottomSheetBehavior.this.A()) < Math.abs(view.getTop() - BottomSheetBehavior.this.C)) {
                                                break Label_0019;
                                            }
                                            break Label_0281;
                                        }
                                    }
                                    n3 = 5;
                                    break Label_0417;
                                }
                                if (n2 != 0.0f && Math.abs(n) <= Math.abs(n2)) {
                                    if (BottomSheetBehavior.this.b) {
                                        break Label_0417;
                                    }
                                    final int top3 = view.getTop();
                                    if (Math.abs(top3 - BottomSheetBehavior.this.C) < Math.abs(top3 - BottomSheetBehavior.this.E)) {
                                        Objects.requireNonNull(BottomSheetBehavior.this);
                                        break Label_0281;
                                    }
                                    break Label_0417;
                                }
                                else {
                                    final int top4 = view.getTop();
                                    final BottomSheetBehavior a3 = BottomSheetBehavior.this;
                                    if (a3.b) {
                                        if (Math.abs(top4 - a3.B) >= Math.abs(top4 - BottomSheetBehavior.this.E)) {
                                            break Label_0417;
                                        }
                                    }
                                    else {
                                        final int c = a3.C;
                                        if (top4 < c) {
                                            if (top4 >= Math.abs(top4 - a3.E)) {
                                                Objects.requireNonNull(BottomSheetBehavior.this);
                                                break Label_0281;
                                            }
                                        }
                                        else {
                                            if (Math.abs(top4 - c) < Math.abs(top4 - BottomSheetBehavior.this.E)) {
                                                Objects.requireNonNull(BottomSheetBehavior.this);
                                                break Label_0281;
                                            }
                                            break Label_0417;
                                        }
                                    }
                                }
                            }
                        }
                        n3 = 3;
                        break Label_0417;
                    }
                    n3 = 6;
                }
                final BottomSheetBehavior a4 = BottomSheetBehavior.this;
                Objects.requireNonNull(a4);
                a4.K(view, n3, true);
            }
            
            @Override
            public final boolean l(final View view, final int n) {
                final BottomSheetBehavior a = BottomSheetBehavior.this;
                final int j = a.J;
                final boolean b = false;
                if (j == 1) {
                    return false;
                }
                if (a.X) {
                    return false;
                }
                if (j == 3 && a.V == n) {
                    final WeakReference<View> s = a.S;
                    View view2;
                    if (s != null) {
                        view2 = s.get();
                    }
                    else {
                        view2 = null;
                    }
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                final WeakReference<V> r = BottomSheetBehavior.this.R;
                boolean b2 = b;
                if (r != null) {
                    b2 = b;
                    if (r.get() == view) {
                        b2 = true;
                    }
                }
                return b2;
            }
        };
    }
    
    public BottomSheetBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 0;
        this.b = true;
        this.j = -1;
        this.k = -1;
        this.y = new BottomSheetBehavior.BottomSheetBehavior$d(this);
        this.D = 0.5f;
        this.F = -1.0f;
        this.I = true;
        this.J = 4;
        this.T = new ArrayList<BottomSheetBehavior.BottomSheetBehavior$c>();
        this.Z = -1;
        this.a0 = new i6x.c() {
            @Override
            public final int a(final View view, final int n) {
                return view.getLeft();
            }
            
            @Override
            public final int b(final View view, final int n, int n2) {
                final int a = BottomSheetBehavior.this.A();
                final BottomSheetBehavior a2 = BottomSheetBehavior.this;
                if (a2.G) {
                    n2 = a2.Q;
                }
                else {
                    n2 = a2.E;
                }
                return fk7.q(n, a, n2);
            }
            
            @Override
            public final int e(final View view) {
                final BottomSheetBehavior a = BottomSheetBehavior.this;
                if (a.G) {
                    return a.Q;
                }
                return a.E;
            }
            
            @Override
            public final void i(final int n) {
                if (n == 1) {
                    final BottomSheetBehavior a = BottomSheetBehavior.this;
                    if (a.I) {
                        a.I(1);
                    }
                }
            }
            
            @Override
            public final void j(final View view, final int n, final int n2, final int n3, final int n4) {
                BottomSheetBehavior.this.w(n2);
            }
            
            @Override
            public final void k(final View view, final float n, final float n2) {
                int n3 = 4;
                Label_0417: {
                    Label_0281: {
                        Label_0019: {
                            if (n2 < 0.0f) {
                                if (!BottomSheetBehavior.this.b) {
                                    final int top = view.getTop();
                                    System.currentTimeMillis();
                                    Objects.requireNonNull(BottomSheetBehavior.this);
                                    if (top > BottomSheetBehavior.this.C) {
                                        break Label_0281;
                                    }
                                }
                            }
                            else {
                                final BottomSheetBehavior a = BottomSheetBehavior.this;
                                if (a.G && a.J(view, n2)) {
                                    if (Math.abs(n) >= Math.abs(n2) || n2 <= 500.0f) {
                                        final int top2 = view.getTop();
                                        final BottomSheetBehavior a2 = BottomSheetBehavior.this;
                                        if (top2 <= (a2.A() + a2.Q) / 2) {
                                            if (BottomSheetBehavior.this.b) {
                                                break Label_0019;
                                            }
                                            if (Math.abs(view.getTop() - BottomSheetBehavior.this.A()) < Math.abs(view.getTop() - BottomSheetBehavior.this.C)) {
                                                break Label_0019;
                                            }
                                            break Label_0281;
                                        }
                                    }
                                    n3 = 5;
                                    break Label_0417;
                                }
                                if (n2 != 0.0f && Math.abs(n) <= Math.abs(n2)) {
                                    if (BottomSheetBehavior.this.b) {
                                        break Label_0417;
                                    }
                                    final int top3 = view.getTop();
                                    if (Math.abs(top3 - BottomSheetBehavior.this.C) < Math.abs(top3 - BottomSheetBehavior.this.E)) {
                                        Objects.requireNonNull(BottomSheetBehavior.this);
                                        break Label_0281;
                                    }
                                    break Label_0417;
                                }
                                else {
                                    final int top4 = view.getTop();
                                    final BottomSheetBehavior a3 = BottomSheetBehavior.this;
                                    if (a3.b) {
                                        if (Math.abs(top4 - a3.B) >= Math.abs(top4 - BottomSheetBehavior.this.E)) {
                                            break Label_0417;
                                        }
                                    }
                                    else {
                                        final int c = a3.C;
                                        if (top4 < c) {
                                            if (top4 >= Math.abs(top4 - a3.E)) {
                                                Objects.requireNonNull(BottomSheetBehavior.this);
                                                break Label_0281;
                                            }
                                        }
                                        else {
                                            if (Math.abs(top4 - c) < Math.abs(top4 - BottomSheetBehavior.this.E)) {
                                                Objects.requireNonNull(BottomSheetBehavior.this);
                                                break Label_0281;
                                            }
                                            break Label_0417;
                                        }
                                    }
                                }
                            }
                        }
                        n3 = 3;
                        break Label_0417;
                    }
                    n3 = 6;
                }
                final BottomSheetBehavior a4 = BottomSheetBehavior.this;
                Objects.requireNonNull(a4);
                a4.K(view, n3, true);
            }
            
            @Override
            public final boolean l(final View view, final int n) {
                final BottomSheetBehavior a = BottomSheetBehavior.this;
                final int j = a.J;
                final boolean b = false;
                if (j == 1) {
                    return false;
                }
                if (a.X) {
                    return false;
                }
                if (j == 3 && a.V == n) {
                    final WeakReference<View> s = a.S;
                    View view2;
                    if (s != null) {
                        view2 = s.get();
                    }
                    else {
                        view2 = null;
                    }
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                final WeakReference<V> r = BottomSheetBehavior.this.R;
                boolean b2 = b;
                if (r != null) {
                    b2 = b;
                    if (r.get() == view) {
                        b2 = true;
                    }
                }
                return b2;
            }
        };
        this.g = context.getResources().getDimensionPixelSize(2131166615);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, rp2.Q0);
        if (obtainStyledAttributes.hasValue(3)) {
            this.i = ong.b(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(20)) {
            this.w = new pqp(pqp.b(context, set, 2130968787, 2132019171));
        }
        if (this.w != null) {
            (this.h = new qng(this.w)).n(context);
            final ColorStateList i = this.i;
            if (i != null) {
                this.h.q(i);
            }
            else {
                final TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.h.setTint(typedValue.data);
            }
        }
        (this.z = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f })).setDuration(500L);
        this.z.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new f92(this));
        this.F = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.k = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        final TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        Label_0373: {
            if (peekValue != null) {
                final int data = peekValue.data;
                if (data == -1) {
                    this.G(data);
                    break Label_0373;
                }
            }
            this.G(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        this.F(obtainStyledAttributes.getBoolean(8, false));
        this.m = obtainStyledAttributes.getBoolean(12, false);
        this.E(obtainStyledAttributes.getBoolean(6, true));
        this.H = obtainStyledAttributes.getBoolean(11, false);
        this.I = obtainStyledAttributes.getBoolean(4, true);
        this.a = obtainStyledAttributes.getInt(10, 0);
        final float float1 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (float1 > 0.0f && float1 < 1.0f) {
            this.D = float1;
            if (this.R != null) {
                this.C = (int)((1.0f - float1) * this.Q);
            }
            final TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                final int data2 = peekValue2.data;
                if (data2 < 0) {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
                this.A = data2;
            }
            else {
                final int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset < 0) {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
                this.A = dimensionPixelOffset;
            }
            this.n = obtainStyledAttributes.getBoolean(16, false);
            this.o = obtainStyledAttributes.getBoolean(17, false);
            this.p = obtainStyledAttributes.getBoolean(18, false);
            this.q = obtainStyledAttributes.getBoolean(19, true);
            this.r = obtainStyledAttributes.getBoolean(13, false);
            this.s = obtainStyledAttributes.getBoolean(14, false);
            this.t = obtainStyledAttributes.getBoolean(15, false);
            obtainStyledAttributes.recycle();
            this.c = (float)ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
    
    public static <V extends View> BottomSheetBehavior<V> y(final V v) {
        final ViewGroup$LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        final c a = ((CoordinatorLayout.f)layoutParams).a;
        if (a instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior<V>)a;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }
    
    public final int A() {
        int n;
        if (this.b) {
            n = this.B;
        }
        else {
            final int a = this.A;
            int v;
            if (this.q) {
                v = 0;
            }
            else {
                v = this.v;
            }
            n = Math.max(a, v);
        }
        return n;
    }
    
    public final int B(final int n) {
        if (n == 3) {
            return this.A();
        }
        if (n == 4) {
            return this.E;
        }
        if (n == 5) {
            return this.Q;
        }
        if (n == 6) {
            return this.C;
        }
        throw new IllegalArgumentException(yk.y("Invalid state to get top offset: ", n));
    }
    
    public final void C(final V v, final ng$a ng$a, final int n) {
        p5x.x((View)v, ng$a, (CharSequence)null, (bh)new h92(this, n));
    }
    
    @Deprecated
    public final void D(final BottomSheetBehavior.BottomSheetBehavior$c bottomSheetBehavior$c) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.T.clear();
        if (bottomSheetBehavior$c != null) {
            this.T.add(bottomSheetBehavior$c);
        }
    }
    
    public final void E(final boolean b) {
        if (this.b == b) {
            return;
        }
        this.b = b;
        if (this.R != null) {
            this.u();
        }
        int j;
        if (this.b && this.J == 6) {
            j = 3;
        }
        else {
            j = this.J;
        }
        this.I(j);
        this.L();
    }
    
    public final void F(final boolean g) {
        if (this.G != g) {
            this.G = g;
            if (!g && this.J == 5) {
                this.H(4);
            }
            this.L();
        }
    }
    
    public final void G(final int n) {
        boolean b = false;
        Label_0053: {
            if (n == -1) {
                if (this.e) {
                    break Label_0053;
                }
                this.e = true;
            }
            else {
                if (!this.e && this.d == n) {
                    break Label_0053;
                }
                this.e = false;
                this.d = Math.max(0, n);
            }
            b = true;
        }
        if (b) {
            this.O();
        }
    }
    
    public final void H(int n) {
        final int n2 = 1;
        if (n == 1 || n == 2) {
            final StringBuilder g = w48.g("STATE_");
            String s;
            if (n == 1) {
                s = "DRAGGING";
            }
            else {
                s = "SETTLING";
            }
            throw new IllegalArgumentException(hi.I(g, s, " should not be set externally."));
        }
        if (!this.G && n == 5) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot set state: ");
            sb.append(n);
            Log.w("BottomSheetBehavior", sb.toString());
            return;
        }
        int n3;
        if (n == 6 && this.b && this.B(n) <= this.B) {
            n3 = 3;
        }
        else {
            n3 = n;
        }
        final WeakReference<V> r = this.R;
        if (r != null && r.get() != null) {
            final View view = this.R.get();
            final BottomSheetBehavior$a bottomSheetBehavior$a = new BottomSheetBehavior$a(this, view, n3);
            final ViewParent parent = view.getParent();
            Label_0181: {
                if (parent != null && parent.isLayoutRequested()) {
                    final WeakHashMap a = p5x.a;
                    if (p5x$g.b(view)) {
                        n = n2;
                        break Label_0181;
                    }
                }
                n = 0;
            }
            if (n != 0) {
                view.post((Runnable)bottomSheetBehavior$a);
            }
            else {
                bottomSheetBehavior$a.run();
            }
        }
        else {
            this.I(n);
        }
    }
    
    public final void I(final int j) {
        if (this.J == j) {
            return;
        }
        this.J = j;
        if (j != 4 && j != 3 && j != 6) {
            final boolean g = this.G;
        }
        final WeakReference<V> r = this.R;
        if (r == null) {
            return;
        }
        final View view = r.get();
        if (view == null) {
            return;
        }
        int i = 0;
        if (j == 3) {
            this.N(true);
        }
        else if (j == 6 || j == 5 || j == 4) {
            this.N(false);
        }
        this.M(j);
        while (i < this.T.size()) {
            this.T.get(i).c(view, j);
            ++i;
        }
        this.L();
    }
    
    public final boolean J(final View view, final float n) {
        final boolean h = this.H;
        boolean b = true;
        if (h) {
            return true;
        }
        if (view.getTop() < this.E) {
            return false;
        }
        if (Math.abs(n * 0.1f + view.getTop() - this.E) / this.v() <= 0.5f) {
            b = false;
        }
        return b;
    }
    
    public final void K(final View view, final int n, final boolean b) {
        final int b2 = this.B(n);
        final i6x k = this.K;
        if (k != null && (b ? k.v(view.getLeft(), b2) : k.x(view, view.getLeft(), b2))) {
            this.I(2);
            this.M(n);
            this.y.a(n);
        }
        else {
            this.I(n);
        }
    }
    
    public final void L() {
        final WeakReference<V> r = this.R;
        if (r == null) {
            return;
        }
        final View view = r.get();
        if (view == null) {
            return;
        }
        p5x.w(524288, view);
        p5x.q(view, 0);
        p5x.w(262144, view);
        p5x.q(view, 0);
        p5x.w(1048576, view);
        p5x.q(view, 0);
        final int z = this.Z;
        if (z != -1) {
            p5x.w(z, view);
            p5x.q(view, 0);
        }
        final boolean b = this.b;
        int n = 6;
        if (!b && this.J != 6) {
            this.Z = p5x.a(view, (CharSequence)view.getResources().getString(2131952244), (bh)new h92(this, 6));
        }
        if (this.G && this.J != 5) {
            this.C((V)view, ng$a.n, 5);
        }
        final int j = this.J;
        if (j != 3) {
            if (j != 4) {
                if (j == 6) {
                    this.C((V)view, ng$a.m, 4);
                    this.C((V)view, ng$a.l, 3);
                }
            }
            else {
                if (this.b) {
                    n = 3;
                }
                this.C((V)view, ng$a.l, n);
            }
        }
        else {
            if (this.b) {
                n = 4;
            }
            this.C((V)view, ng$a.m, n);
        }
    }
    
    public final void M(final int n) {
        if (n == 2) {
            return;
        }
        final boolean x = n == 3;
        if (this.x != x) {
            this.x = x;
            if (this.h != null) {
                final ValueAnimator z = this.z;
                if (z != null) {
                    if (z.isRunning()) {
                        this.z.reverse();
                    }
                    else {
                        float n2;
                        if (x) {
                            n2 = 0.0f;
                        }
                        else {
                            n2 = 1.0f;
                        }
                        this.z.setFloatValues(new float[] { 1.0f - n2, n2 });
                        this.z.start();
                    }
                }
            }
        }
    }
    
    public final void N(final boolean b) {
        final WeakReference<V> r = this.R;
        if (r == null) {
            return;
        }
        final ViewParent parent = r.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        final CoordinatorLayout coordinatorLayout = (CoordinatorLayout)parent;
        final int childCount = ((ViewGroup)coordinatorLayout).getChildCount();
        if (b) {
            if (this.Y != null) {
                return;
            }
            this.Y = new HashMap(childCount);
        }
        for (int i = 0; i < childCount; ++i) {
            final View child = ((ViewGroup)coordinatorLayout).getChildAt(i);
            if (child != this.R.get()) {
                if (b) {
                    this.Y.put(child, child.getImportantForAccessibility());
                }
            }
        }
        if (!b) {
            this.Y = null;
        }
    }
    
    public final void O() {
        if (this.R != null) {
            this.u();
            if (this.J == 4) {
                final View view = this.R.get();
                if (view != null) {
                    view.requestLayout();
                }
            }
        }
    }
    
    @Override
    public void d(final CoordinatorLayout.f f) {
        this.R = null;
        this.K = null;
    }
    
    @Override
    public final void g() {
        this.R = null;
        this.K = null;
    }
    
    @Override
    public final boolean h(final CoordinatorLayout coordinatorLayout, final V v, final MotionEvent motionEvent) {
        final boolean shown = v.isShown();
        final boolean b = false;
        if (shown && this.I) {
            final int actionMasked = motionEvent.getActionMasked();
            final View view = null;
            if (actionMasked == 0) {
                this.V = -1;
                final VelocityTracker u = this.U;
                if (u != null) {
                    u.recycle();
                    this.U = null;
                }
            }
            if (this.U == null) {
                this.U = VelocityTracker.obtain();
            }
            this.U.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.X = false;
                    this.V = -1;
                    if (this.L) {
                        return this.L = false;
                    }
                }
            }
            else {
                final int n = (int)motionEvent.getX();
                this.W = (int)motionEvent.getY();
                if (this.J != 2) {
                    final WeakReference<View> s = this.S;
                    View view2;
                    if (s != null) {
                        view2 = s.get();
                    }
                    else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.s(view2, n, this.W)) {
                        this.V = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.X = true;
                    }
                }
                this.L = (this.V == -1 && !coordinatorLayout.s((View)v, n, this.W));
            }
            if (!this.L) {
                final i6x k = this.K;
                if (k != null && k.w(motionEvent)) {
                    return true;
                }
            }
            final WeakReference<View> s2 = this.S;
            View view3 = view;
            if (s2 != null) {
                view3 = s2.get();
            }
            boolean b2 = b;
            if (actionMasked == 2) {
                b2 = b;
                if (view3 != null) {
                    b2 = b;
                    if (!this.L) {
                        b2 = b;
                        if (this.J != 1) {
                            b2 = b;
                            if (!coordinatorLayout.s(view3, (int)motionEvent.getX(), (int)motionEvent.getY())) {
                                b2 = b;
                                if (this.K != null) {
                                    b2 = b;
                                    if (Math.abs(this.W - motionEvent.getY()) > this.K.b) {
                                        b2 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return b2;
        }
        this.L = true;
        return false;
    }
    
    @Override
    public boolean i(final CoordinatorLayout coordinatorLayout, final V v, int i) {
        final WeakHashMap a = p5x.a;
        if (p5x$d.b((View)coordinatorLayout) && !p5x$d.b((View)v)) {
            v.setFitsSystemWindows(true);
        }
        final WeakReference<V> r = this.R;
        final int n = 0;
        if (r == null) {
            this.f = ((View)coordinatorLayout).getResources().getDimensionPixelSize(2131165584);
            final boolean b = Build$VERSION.SDK_INT >= 29 && !this.m && !this.e;
            if (this.n || this.o || this.p || this.r || this.s || this.t || b) {
                p5x$i.u((View)v, (ogj)new pbx((sbx$a)new g92(this, b), new sbx$b(p5x$e.f((View)v), v.getPaddingTop(), p5x$e.e((View)v), v.getPaddingBottom())));
                if (p5x$g.b((View)v)) {
                    p5x$h.c((View)v);
                }
                else {
                    v.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new qbx());
                }
            }
            this.R = new WeakReference<V>(v);
            final qng h = this.h;
            if (h != null) {
                p5x$d.q((View)v, (Drawable)h);
                final qng h2 = this.h;
                float n2;
                if ((n2 = this.F) == -1.0f) {
                    n2 = p5x$i.i((View)v);
                }
                h2.p(n2);
                final boolean x = this.J == 3;
                this.x = x;
                final qng h3 = this.h;
                float n3;
                if (x) {
                    n3 = 0.0f;
                }
                else {
                    n3 = 1.0f;
                }
                h3.r(n3);
            }
            else {
                final ColorStateList j = this.i;
                if (j != null) {
                    p5x.C((View)v, j);
                }
            }
            this.L();
            if (p5x$d.c((View)v) == 0) {
                p5x$d.s((View)v, 1);
            }
        }
        if (this.K == null) {
            this.K = new i6x(((View)coordinatorLayout).getContext(), (ViewGroup)coordinatorLayout, (i6x.c)this.a0);
        }
        final int top = v.getTop();
        coordinatorLayout.u((View)v, i);
        this.P = ((View)coordinatorLayout).getWidth();
        this.Q = ((View)coordinatorLayout).getHeight();
        final int height = v.getHeight();
        this.O = height;
        final int q = this.Q;
        i = this.v;
        if (q - height < i) {
            if (this.q) {
                this.O = q;
            }
            else {
                this.O = q - i;
            }
        }
        this.B = Math.max(0, q - this.O);
        this.C = (int)((1.0f - this.D) * this.Q);
        this.u();
        i = this.J;
        if (i == 3) {
            p5x.s((View)v, this.A());
        }
        else if (i == 6) {
            p5x.s((View)v, this.C);
        }
        else if (this.G && i == 5) {
            p5x.s((View)v, this.Q);
        }
        else if (i == 4) {
            p5x.s((View)v, this.E);
        }
        else if (i == 1 || i == 2) {
            p5x.s((View)v, top - v.getTop());
        }
        this.S = new WeakReference<View>(this.x(v));
        for (i = n; i < this.T.size(); ++i) {
            this.T.get(i).a((View)v);
        }
        return true;
    }
    
    @Override
    public final boolean j(final CoordinatorLayout coordinatorLayout, final V v, int z, int paddingTop, final int n, final int n2) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)v.getLayoutParams();
        z = this.z(z, ((View)coordinatorLayout).getPaddingRight() + ((View)coordinatorLayout).getPaddingLeft() + viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin + paddingTop, this.j, viewGroup$MarginLayoutParams.width);
        paddingTop = ((View)coordinatorLayout).getPaddingTop();
        v.measure(z, this.z(n, ((View)coordinatorLayout).getPaddingBottom() + paddingTop + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin + 0, this.k, viewGroup$MarginLayoutParams.height));
        return true;
    }
    
    @Override
    public final boolean k(final CoordinatorLayout p0, final V p1, final View p2, final float p3, final float p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/material/bottomsheet/BottomSheetBehavior.S:Ljava/lang/ref/WeakReference;
        //     4: astore_2       
        //     5: aload_2        
        //     6: ifnull          33
        //     9: aload_1        
        //    10: aload_2        
        //    11: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //    14: if_acmpne       33
        //    17: aload_0        
        //    18: getfield        com/google/android/material/bottomsheet/BottomSheetBehavior.J:I
        //    21: iconst_3       
        //    22: if_icmpne       28
        //    25: goto            33
        //    28: iconst_1       
        //    29: istore_3       
        //    30: goto            35
        //    33: iconst_0       
        //    34: istore_3       
        //    35: iload_3        
        //    36: ireturn        
        //    Signature:
        //  (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;Landroid/view/View;FF)Z
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 4
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2023)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
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
    
    @Override
    public final void l(final CoordinatorLayout coordinatorLayout, final V v, final View view, int n, final int m, final int[] array, int e) {
        if (e == 1) {
            return;
        }
        final WeakReference<View> s = this.S;
        View view2;
        if (s != null) {
            view2 = s.get();
        }
        else {
            view2 = null;
        }
        if (view != view2) {
            return;
        }
        final int top = v.getTop();
        n = top - m;
        if (m > 0) {
            if (n < this.A()) {
                array[1] = top - this.A();
                p5x.s((View)v, -array[1]);
                this.I(3);
            }
            else {
                if (!this.I) {
                    return;
                }
                p5x.s((View)v, -(array[1] = m));
                this.I(1);
            }
        }
        else if (m < 0 && !view.canScrollVertically(-1)) {
            e = this.E;
            if (n > e && !this.G) {
                array[1] = top - e;
                p5x.s((View)v, -array[1]);
                this.I(4);
            }
            else {
                if (!this.I) {
                    return;
                }
                p5x.s((View)v, -(array[1] = m));
                this.I(1);
            }
        }
        this.w(v.getTop());
        this.M = m;
        this.N = true;
    }
    
    @Override
    public final void m(final CoordinatorLayout coordinatorLayout, final V v, final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
    }
    
    @Override
    public final void o(final CoordinatorLayout coordinatorLayout, final V v, final Parcelable parcelable) {
        final SavedState savedState = (SavedState)v;
        savedState.getSuperState();
        final int a = this.a;
        if (a != 0) {
            if (a == -1 || (a & 0x1) == 0x1) {
                this.d = savedState.peekHeight;
            }
            if (a == -1 || (a & 0x2) == 0x2) {
                this.b = savedState.fitToContents;
            }
            if (a == -1 || (a & 0x4) == 0x4) {
                this.G = savedState.hideable;
            }
            if (a == -1 || (a & 0x8) == 0x8) {
                this.H = savedState.skipCollapsed;
            }
        }
        final int state = savedState.state;
        if (state != 1 && state != 2) {
            this.J = state;
        }
        else {
            this.J = 4;
        }
    }
    
    @Override
    public final Parcelable p(final CoordinatorLayout p0, final V p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: getstatic       android/view/View$BaseSavedState.EMPTY_STATE:Landroid/view/AbsSavedState;
        //     7: aload_0        
        //     8: invokespecial   com/google/android/material/bottomsheet/BottomSheetBehavior$SavedState.<init>:(Landroid/os/Parcelable;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
        //    11: areturn        
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
    
    @Override
    public final boolean q(final CoordinatorLayout coordinatorLayout, final V v, final View view, final View view2, final int n, int n2) {
        n2 = 0;
        this.M = 0;
        this.N = false;
        if ((view2 & 0x2) != 0x0) {
            n2 = 1;
        }
        return n2 != 0;
    }
    
    @Override
    public final void r(final CoordinatorLayout coordinatorLayout, final V v, final View view, int top) {
        final int top2 = v.getTop();
        final int a = this.A();
        top = 3;
        if (top2 == a) {
            this.I(3);
            return;
        }
        final WeakReference<View> s = this.S;
        if (s != null && view == s.get()) {
            if (this.N) {
                Label_0298: {
                    Label_0288: {
                        if (this.M <= 0) {
                            if (this.G) {
                                final VelocityTracker u = this.U;
                                float yVelocity;
                                if (u == null) {
                                    yVelocity = 0.0f;
                                }
                                else {
                                    u.computeCurrentVelocity(1000, this.c);
                                    yVelocity = this.U.getYVelocity(this.V);
                                }
                                if (this.J(v, yVelocity)) {
                                    top = 5;
                                    break Label_0298;
                                }
                            }
                            if (this.M == 0) {
                                final int top3 = v.getTop();
                                if (this.b) {
                                    if (Math.abs(top3 - this.B) < Math.abs(top3 - this.E)) {
                                        break Label_0298;
                                    }
                                }
                                else {
                                    final int c = this.C;
                                    if (top3 < c) {
                                        if (top3 < Math.abs(top3 - this.E)) {
                                            break Label_0298;
                                        }
                                        break Label_0288;
                                    }
                                    else if (Math.abs(top3 - c) < Math.abs(top3 - this.E)) {
                                        break Label_0288;
                                    }
                                }
                            }
                            else if (!this.b) {
                                top = v.getTop();
                                if (Math.abs(top - this.C) < Math.abs(top - this.E)) {
                                    break Label_0288;
                                }
                            }
                            top = 4;
                            break Label_0298;
                        }
                        if (this.b) {
                            break Label_0298;
                        }
                        if (v.getTop() <= this.C) {
                            break Label_0298;
                        }
                    }
                    top = 6;
                }
                this.K(v, top, false);
                this.N = false;
            }
        }
    }
    
    @Override
    public final boolean s(final CoordinatorLayout coordinatorLayout, final V v, final MotionEvent motionEvent) {
        final boolean shown = v.isShown();
        final int n = 0;
        if (!shown) {
            return false;
        }
        final int actionMasked = motionEvent.getActionMasked();
        final int j = this.J;
        if (j == 1 && actionMasked == 0) {
            return true;
        }
        final i6x k = this.K;
        if (k != null && (this.I || j == 1)) {
            k.p(motionEvent);
        }
        if (actionMasked == 0) {
            this.V = -1;
            final VelocityTracker u = this.U;
            if (u != null) {
                u.recycle();
                this.U = null;
            }
        }
        if (this.U == null) {
            this.U = VelocityTracker.obtain();
        }
        this.U.addMovement(motionEvent);
        int n2 = n;
        Label_0165: {
            if (this.K != null) {
                if (!this.I) {
                    n2 = n;
                    if (this.J != 1) {
                        break Label_0165;
                    }
                }
                n2 = 1;
            }
        }
        if (n2 != 0 && actionMasked == 2 && !this.L) {
            final float abs = Math.abs(this.W - motionEvent.getY());
            final i6x i = this.K;
            if (abs > i.b) {
                i.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return this.L ^ true;
    }
    
    public final void t(final BottomSheetBehavior.BottomSheetBehavior$c bottomSheetBehavior$c) {
        if (!this.T.contains(bottomSheetBehavior$c)) {
            this.T.add(bottomSheetBehavior$c);
        }
    }
    
    public final void u() {
        final int v = this.v();
        if (this.b) {
            this.E = Math.max(this.Q - v, this.B);
        }
        else {
            this.E = this.Q - v;
        }
    }
    
    public final int v() {
        if (this.e) {
            return Math.min(Math.max(this.f, this.Q - this.P * 9 / 16), this.O) + this.u;
        }
        if (!this.m && !this.n) {
            final int l = this.l;
            if (l > 0) {
                return Math.max(this.d, l + this.g);
            }
        }
        return this.d + this.u;
    }
    
    public final void w(int i) {
        final View view = this.R.get();
        if (view != null && !this.T.isEmpty()) {
            final int e = this.E;
            float n;
            float n2;
            if (i <= e && e != this.A()) {
                final int e2 = this.E;
                n = (float)(e2 - i);
                n2 = (float)(e2 - this.A());
            }
            else {
                final int e3 = this.E;
                n = (float)(e3 - i);
                n2 = (float)(this.Q - e3);
            }
            final float n3 = n / n2;
            for (i = 0; i < this.T.size(); ++i) {
                this.T.get(i).b(view, n3);
            }
        }
    }
    
    public final View x(View x) {
        final WeakHashMap a = p5x.a;
        if (p5x$i.p(x)) {
            return x;
        }
        if (x instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)x;
            for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                x = this.x(viewGroup.getChildAt(i));
                if (x != null) {
                    return x;
                }
            }
        }
        return null;
    }
    
    public final int z(int mode, int n, int min, final int n2) {
        n = ViewGroup.getChildMeasureSpec(mode, n, n2);
        if (min == -1) {
            return n;
        }
        mode = View$MeasureSpec.getMode(n);
        n = View$MeasureSpec.getSize(n);
        if (mode != 1073741824) {
            if (n != 0) {
                min = Math.min(n, min);
            }
            return View$MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE);
        }
        return View$MeasureSpec.makeMeasureSpec(Math.min(n, min), 1073741824);
    }
    
    public static class SavedState extends fa
    {
        public static final Parcelable$Creator<SavedState> CREATOR;
        public boolean fitToContents;
        public boolean hideable;
        public int peekHeight;
        public boolean skipCollapsed;
        public final int state;
        
        static {
            CREATOR = (Parcelable$Creator)new BottomSheetBehavior$SavedState$a();
        }
        
        public SavedState(final Parcel parcel) {
            this(parcel, null);
        }
        
        public SavedState(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            final int int1 = parcel.readInt();
            final boolean b = false;
            this.fitToContents = (int1 == 1);
            this.hideable = (parcel.readInt() == 1);
            boolean skipCollapsed = b;
            if (parcel.readInt() == 1) {
                skipCollapsed = true;
            }
            this.skipCollapsed = skipCollapsed;
        }
        
        @Deprecated
        public SavedState(final Parcelable parcelable, final int state) {
            super(parcelable);
            this.state = state;
        }
        
        public SavedState(final Parcelable parcelable, final BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.J;
            this.peekHeight = bottomSheetBehavior.d;
            this.fitToContents = bottomSheetBehavior.b;
            this.hideable = bottomSheetBehavior.G;
            this.skipCollapsed = bottomSheetBehavior.H;
        }
        
        @Override
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt((int)(this.fitToContents ? 1 : 0));
            parcel.writeInt((int)(this.hideable ? 1 : 0));
            parcel.writeInt((int)(this.skipCollapsed ? 1 : 0));
        }
    }
}
