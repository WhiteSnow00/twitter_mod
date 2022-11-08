// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.flexbox;

import android.view.ViewGroup$MarginLayoutParams;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.recyclerview.widget.z;
import androidx.recyclerview.widget.y;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.u;
import android.graphics.PointF;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View$MeasureSpec;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$m$d;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.content.Context;
import android.view.View;
import android.util.SparseArray;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$t;
import java.util.List;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView$x$b;
import androidx.recyclerview.widget.RecyclerView$m;

public class FlexboxLayoutManager extends RecyclerView$m implements r6b, RecyclerView$x$b
{
    public static final Rect t1;
    public int U0;
    public int V0;
    public int W0;
    public int X0;
    public int Y0;
    public boolean Z0;
    public boolean a1;
    public List<t6b> b1;
    public final a c1;
    public RecyclerView$t d1;
    public RecyclerView$y e1;
    public FlexboxLayoutManager.FlexboxLayoutManager$d f1;
    public FlexboxLayoutManager.FlexboxLayoutManager$b g1;
    public a0 h1;
    public a0 i1;
    public FlexboxLayoutManager.FlexboxLayoutManager$SavedState j1;
    public int k1;
    public int l1;
    public int m1;
    public int n1;
    public SparseArray<View> o1;
    public final Context p1;
    public View q1;
    public int r1;
    public a$a s1;
    
    static {
        t1 = new Rect();
    }
    
    public FlexboxLayoutManager(final Context p) {
        this.Y0 = -1;
        this.b1 = new ArrayList<t6b>();
        this.c1 = new a((r6b)this);
        this.g1 = new FlexboxLayoutManager.FlexboxLayoutManager$b(this);
        this.k1 = -1;
        this.l1 = Integer.MIN_VALUE;
        this.m1 = Integer.MIN_VALUE;
        this.n1 = Integer.MIN_VALUE;
        this.o1 = (SparseArray<View>)new SparseArray();
        this.r1 = -1;
        this.s1 = new a$a();
        this.z1(0);
        this.A1(1);
        this.y1(4);
        super.L0 = true;
        this.p1 = p;
    }
    
    public FlexboxLayoutManager(final Context p4, final AttributeSet set, int a, final int n) {
        this.Y0 = -1;
        this.b1 = new ArrayList<t6b>();
        this.c1 = new a((r6b)this);
        this.g1 = new FlexboxLayoutManager.FlexboxLayoutManager$b(this);
        this.k1 = -1;
        this.l1 = Integer.MIN_VALUE;
        this.m1 = Integer.MIN_VALUE;
        this.n1 = Integer.MIN_VALUE;
        this.o1 = (SparseArray<View>)new SparseArray();
        this.r1 = -1;
        this.s1 = new a$a();
        final RecyclerView$m$d c0 = RecyclerView$m.c0(p4, set, a, n);
        a = c0.a;
        if (a != 0) {
            if (a == 1) {
                if (c0.c) {
                    this.z1(3);
                }
                else {
                    this.z1(2);
                }
            }
        }
        else if (c0.c) {
            this.z1(1);
        }
        else {
            this.z1(0);
        }
        this.A1(1);
        this.y1(4);
        super.L0 = true;
        this.p1 = p4;
    }
    
    private boolean a1(final View view, final int n, final int n2, final RecyclerView$n recyclerView$n) {
        return view.isLayoutRequested() || !super.M0 || !i0(view.getWidth(), n, ((ViewGroup$MarginLayoutParams)recyclerView$n).width) || !i0(view.getHeight(), n2, ((ViewGroup$MarginLayoutParams)recyclerView$n).height);
    }
    
    public static boolean i0(final int n, int size, final int n2) {
        final int mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        final boolean b = false;
        boolean b2 = false;
        if (n2 > 0 && n != n2) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            boolean b3 = b;
            if (size >= n) {
                b3 = true;
            }
            return b3;
        }
        if (mode == 0) {
            return true;
        }
        if (mode != 1073741824) {
            return false;
        }
        if (size == n) {
            b2 = true;
        }
        return b2;
    }
    
    public final int A(final RecyclerView$y recyclerView$y) {
        return this.h1(recyclerView$y);
    }
    
    public final void A0(final int n) {
        this.B1(n);
    }
    
    public final void A1(int v0) {
        v0 = this.V0;
        if (v0 != 1) {
            if (v0 == 0) {
                this.J0();
                this.g1();
            }
            this.V0 = 1;
            this.h1 = null;
            this.i1 = null;
            this.P0();
        }
    }
    
    public final int B(final RecyclerView$y recyclerView$y) {
        return this.i1(recyclerView$y);
    }
    
    public final void B0(final RecyclerView recyclerView, final int n, final int n2) {
        this.B1(n);
        this.B1(n);
    }
    
    public final void B1(int b) {
        final int l = this.L();
        int b2 = -1;
        final View q1 = this.q1(l - 1, -1);
        if (q1 != null) {
            b2 = this.b0(q1);
        }
        if (b >= b2) {
            return;
        }
        final int i = this.L();
        this.c1.j(i);
        this.c1.k(i);
        this.c1.i(i);
        if (b >= this.c1.c.length) {
            return;
        }
        this.r1 = b;
        final View k = this.K(0);
        if (k == null) {
            return;
        }
        this.k1 = this.b0(k);
        if (!this.l() && this.Z0) {
            b = this.h1.b(k);
            this.l1 = this.h1.h() + b;
        }
        else {
            this.l1 = this.h1.e(k) - this.h1.k();
        }
    }
    
    public final int C(final RecyclerView$y recyclerView$y) {
        return this.j1(recyclerView$y);
    }
    
    public final void C0(final RecyclerView$t d1, final RecyclerView$y e1) {
        this.d1 = d1;
        this.e1 = e1;
        final int b = e1.b();
        if (b == 0 && e1.g) {
            return;
        }
        final int x = this.X();
        final int u0 = this.U0;
        if (u0 != 0) {
            if (u0 != 1) {
                if (u0 != 2) {
                    if (u0 != 3) {
                        this.Z0 = false;
                        this.a1 = false;
                    }
                    else {
                        final boolean z0 = x == 1;
                        this.Z0 = z0;
                        if (this.V0 == 2) {
                            this.Z0 = (z0 ^ true);
                        }
                        this.a1 = true;
                    }
                }
                else {
                    final boolean z2 = x == 1;
                    this.Z0 = z2;
                    if (this.V0 == 2) {
                        this.Z0 = (z2 ^ true);
                    }
                    this.a1 = false;
                }
            }
            else {
                this.Z0 = (x != 1);
                this.a1 = (this.V0 == 2);
            }
        }
        else {
            this.Z0 = (x == 1);
            this.a1 = (this.V0 == 2);
        }
        this.k1();
        if (this.f1 == null) {
            this.f1 = new FlexboxLayoutManager.FlexboxLayoutManager$d();
        }
        this.c1.j(b);
        this.c1.k(b);
        this.c1.i(b);
        this.f1.j = false;
        final FlexboxLayoutManager.FlexboxLayoutManager$SavedState j1 = this.j1;
        if (j1 != null && FlexboxLayoutManager.FlexboxLayoutManager$SavedState.access$600(j1, b)) {
            this.k1 = FlexboxLayoutManager.FlexboxLayoutManager$SavedState.access$200(this.j1);
        }
        final FlexboxLayoutManager.FlexboxLayoutManager$b g1 = this.g1;
        if (!g1.f || this.k1 != -1 || this.j1 != null) {
            FlexboxLayoutManager.FlexboxLayoutManager$b.b(g1);
            final FlexboxLayoutManager.FlexboxLayoutManager$b g2 = this.g1;
            final FlexboxLayoutManager.FlexboxLayoutManager$SavedState j2 = this.j1;
            boolean b2 = false;
            Label_0820: {
                if (!e1.g) {
                    final int k1 = this.k1;
                    if (k1 != -1) {
                        if (k1 >= 0 && k1 < e1.b()) {
                            final int k2 = this.k1;
                            g2.a = k2;
                            g2.b = this.c1.c[k2];
                            final FlexboxLayoutManager.FlexboxLayoutManager$SavedState j3 = this.j1;
                            if (j3 != null && FlexboxLayoutManager.FlexboxLayoutManager$SavedState.access$600(j3, e1.b())) {
                                g2.c = this.h1.k() + FlexboxLayoutManager.FlexboxLayoutManager$SavedState.access$300(j2);
                                g2.g = true;
                                g2.b = -1;
                            }
                            else if (this.l1 == Integer.MIN_VALUE) {
                                final View f = this.F(this.k1);
                                if (f != null) {
                                    if (this.h1.c(f) > this.h1.l()) {
                                        FlexboxLayoutManager.FlexboxLayoutManager$b.a(g2);
                                    }
                                    else if (this.h1.e(f) - this.h1.k() < 0) {
                                        g2.c = this.h1.k();
                                        g2.e = false;
                                    }
                                    else if (this.h1.g() - this.h1.b(f) < 0) {
                                        g2.c = this.h1.g();
                                        g2.e = true;
                                    }
                                    else {
                                        int e2;
                                        if (g2.e) {
                                            e2 = this.h1.m() + this.h1.b(f);
                                        }
                                        else {
                                            e2 = this.h1.e(f);
                                        }
                                        g2.c = e2;
                                    }
                                }
                                else {
                                    if (this.L() > 0) {
                                        g2.e = (this.k1 < this.b0(this.K(0)));
                                    }
                                    FlexboxLayoutManager.FlexboxLayoutManager$b.a(g2);
                                }
                            }
                            else if (!this.l() && this.Z0) {
                                g2.c = this.l1 - this.h1.h();
                            }
                            else {
                                g2.c = this.h1.k() + this.l1;
                            }
                            b2 = true;
                            break Label_0820;
                        }
                        this.k1 = -1;
                        this.l1 = Integer.MIN_VALUE;
                    }
                }
                b2 = false;
            }
            if (!b2) {
                boolean b6 = false;
                Label_1159: {
                    if (this.L() != 0) {
                        View view;
                        if (g2.e) {
                            view = this.o1(e1.b());
                        }
                        else {
                            view = this.m1(e1.b());
                        }
                        if (view != null) {
                            final FlexboxLayoutManager h = g2.h;
                            a0 a0;
                            if (h.V0 == 0) {
                                a0 = h.i1;
                            }
                            else {
                                a0 = h.h1;
                            }
                            if (!h.l() && g2.h.Z0) {
                                if (g2.e) {
                                    g2.c = a0.m() + a0.e(view);
                                }
                                else {
                                    g2.c = a0.b(view);
                                }
                            }
                            else if (g2.e) {
                                g2.c = a0.m() + a0.b(view);
                            }
                            else {
                                g2.c = a0.e(view);
                            }
                            int b3 = g2.h.b0(view);
                            g2.a = b3;
                            g2.g = false;
                            final FlexboxLayoutManager h2 = g2.h;
                            final int[] c = h2.c1.c;
                            if (b3 == -1) {
                                b3 = 0;
                            }
                            int b4 = c[b3];
                            if (b4 == -1) {
                                b4 = 0;
                            }
                            g2.b = b4;
                            final int size = h2.b1.size();
                            final int b5 = g2.b;
                            if (size > b5) {
                                g2.a = g2.h.b1.get(b5).o;
                            }
                            b6 = true;
                            break Label_1159;
                        }
                    }
                    b6 = false;
                }
                if (!b6) {
                    FlexboxLayoutManager.FlexboxLayoutManager$b.a(g2);
                    g2.a = 0;
                    g2.b = 0;
                }
            }
            this.g1.f = true;
        }
        this.D(d1);
        final FlexboxLayoutManager.FlexboxLayoutManager$b g3 = this.g1;
        if (g3.e) {
            this.D1(g3, false, true);
        }
        else {
            this.C1(g3, false, true);
        }
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(super.S0, super.Q0);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(super.T0, super.R0);
        final int s0 = super.S0;
        final int t0 = super.T0;
        boolean b8;
        int n;
        if (this.l()) {
            final int m1 = this.m1;
            final boolean b7 = m1 != Integer.MIN_VALUE && m1 != s0;
            final FlexboxLayoutManager.FlexboxLayoutManager$d f2 = this.f1;
            if (f2.b) {
                final int heightPixels = this.p1.getResources().getDisplayMetrics().heightPixels;
                b8 = b7;
                n = heightPixels;
            }
            else {
                final int a2 = f2.a;
                b8 = b7;
                n = a2;
            }
        }
        else {
            final int n2 = this.n1;
            b8 = (n2 != Integer.MIN_VALUE && n2 != t0);
            final FlexboxLayoutManager.FlexboxLayoutManager$d f3 = this.f1;
            if (f3.b) {
                n = this.p1.getResources().getDisplayMetrics().widthPixels;
            }
            else {
                n = f3.a;
            }
        }
        this.m1 = s0;
        this.n1 = t0;
        final int r1 = this.r1;
        if (r1 == -1 && (this.k1 != -1 || b8)) {
            if (!this.g1.e) {
                this.b1.clear();
                this.s1.a();
                if (this.l()) {
                    this.c1.b(this.s1, measureSpec, measureSpec2, n, 0, this.g1.a, (List)this.b1);
                }
                else {
                    this.c1.b(this.s1, measureSpec2, measureSpec, n, 0, this.g1.a, (List)this.b1);
                }
                this.b1 = this.s1.a;
                this.c1.h(measureSpec, measureSpec2, 0);
                this.c1.z(0);
                final FlexboxLayoutManager.FlexboxLayoutManager$b g4 = this.g1;
                final int n3 = this.c1.c[g4.a];
                g4.b = n3;
                this.f1.c = n3;
            }
        }
        else {
            int n4;
            if (r1 != -1) {
                n4 = Math.min(r1, this.g1.a);
            }
            else {
                n4 = this.g1.a;
            }
            this.s1.a();
            if (this.l()) {
                if (this.b1.size() > 0) {
                    this.c1.d((List)this.b1, n4);
                    this.c1.b(this.s1, measureSpec, measureSpec2, n, n4, this.g1.a, (List)this.b1);
                }
                else {
                    this.c1.i(b);
                    this.c1.b(this.s1, measureSpec, measureSpec2, n, 0, -1, (List)this.b1);
                }
            }
            else if (this.b1.size() > 0) {
                this.c1.d((List)this.b1, n4);
                this.c1.b(this.s1, measureSpec2, measureSpec, n, n4, this.g1.a, (List)this.b1);
            }
            else {
                this.c1.i(b);
                this.c1.b(this.s1, measureSpec2, measureSpec, n, 0, -1, (List)this.b1);
            }
            this.b1 = this.s1.a;
            this.c1.h(measureSpec, measureSpec2, n4);
            this.c1.z(n4);
        }
        int n5;
        int n6;
        if (this.g1.e) {
            this.l1(d1, e1, this.f1);
            n5 = this.f1.e;
            this.C1(this.g1, true, false);
            this.l1(d1, e1, this.f1);
            n6 = this.f1.e;
        }
        else {
            this.l1(d1, e1, this.f1);
            n6 = this.f1.e;
            this.D1(this.g1, true, false);
            this.l1(d1, e1, this.f1);
            n5 = this.f1.e;
        }
        if (this.L() > 0) {
            if (this.g1.e) {
                this.t1(this.s1(n6, d1, e1, true) + n5, d1, e1, false);
            }
            else {
                this.s1(this.t1(n5, d1, e1, true) + n6, d1, e1, false);
            }
        }
    }
    
    public final void C1(final FlexboxLayoutManager.FlexboxLayoutManager$b flexboxLayoutManager$b, final boolean b, final boolean b2) {
        if (b2) {
            this.x1();
        }
        else {
            this.f1.b = false;
        }
        if (!this.l() && this.Z0) {
            this.f1.a = flexboxLayoutManager$b.c - this.getPaddingRight();
        }
        else {
            this.f1.a = this.h1.g() - flexboxLayoutManager$b.c;
        }
        final FlexboxLayoutManager.FlexboxLayoutManager$d f1 = this.f1;
        f1.d = flexboxLayoutManager$b.a;
        f1.h = 1;
        f1.i = 1;
        f1.e = flexboxLayoutManager$b.c;
        f1.f = Integer.MIN_VALUE;
        f1.c = flexboxLayoutManager$b.b;
        if (b && this.b1.size() > 1) {
            final int b3 = flexboxLayoutManager$b.b;
            if (b3 >= 0 && b3 < this.b1.size() - 1) {
                final t6b t6b = this.b1.get(flexboxLayoutManager$b.b);
                final FlexboxLayoutManager.FlexboxLayoutManager$d f2 = this.f1;
                ++f2.c;
                f2.d += t6b.h;
            }
        }
    }
    
    public final void D0() {
        this.j1 = null;
        this.k1 = -1;
        this.l1 = Integer.MIN_VALUE;
        this.r1 = -1;
        FlexboxLayoutManager.FlexboxLayoutManager$b.b(this.g1);
        this.o1.clear();
    }
    
    public final void D1(final FlexboxLayoutManager.FlexboxLayoutManager$b flexboxLayoutManager$b, final boolean b, final boolean b2) {
        if (b2) {
            this.x1();
        }
        else {
            this.f1.b = false;
        }
        if (!this.l() && this.Z0) {
            this.f1.a = this.q1.getWidth() - flexboxLayoutManager$b.c - this.h1.k();
        }
        else {
            this.f1.a = flexboxLayoutManager$b.c - this.h1.k();
        }
        final FlexboxLayoutManager.FlexboxLayoutManager$d f1 = this.f1;
        f1.d = flexboxLayoutManager$b.a;
        f1.h = 1;
        f1.i = -1;
        f1.e = flexboxLayoutManager$b.c;
        f1.f = Integer.MIN_VALUE;
        final int b3 = flexboxLayoutManager$b.b;
        f1.c = b3;
        if (b && b3 > 0) {
            final int size = this.b1.size();
            final int b4 = flexboxLayoutManager$b.b;
            if (size > b4) {
                final t6b t6b = this.b1.get(b4);
                final FlexboxLayoutManager.FlexboxLayoutManager$d f2 = this.f1;
                --f2.c;
                f2.d -= t6b.h;
            }
        }
    }
    
    public final void F0(final Parcelable parcelable) {
        if (parcelable instanceof FlexboxLayoutManager.FlexboxLayoutManager$SavedState) {
            this.j1 = (FlexboxLayoutManager.FlexboxLayoutManager$SavedState)parcelable;
            this.P0();
        }
    }
    
    public final RecyclerView$n G() {
        return new c();
    }
    
    public final Parcelable G0() {
        final FlexboxLayoutManager.FlexboxLayoutManager$SavedState j1 = this.j1;
        if (j1 != null) {
            return (Parcelable)new FlexboxLayoutManager.FlexboxLayoutManager$SavedState(j1, (FlexboxLayoutManager$a)null);
        }
        final FlexboxLayoutManager.FlexboxLayoutManager$SavedState flexboxLayoutManager$SavedState = new FlexboxLayoutManager.FlexboxLayoutManager$SavedState();
        if (this.L() > 0) {
            final View k = this.K(0);
            FlexboxLayoutManager.FlexboxLayoutManager$SavedState.access$202(flexboxLayoutManager$SavedState, this.b0(k));
            FlexboxLayoutManager.FlexboxLayoutManager$SavedState.access$302(flexboxLayoutManager$SavedState, this.h1.e(k) - this.h1.k());
        }
        else {
            FlexboxLayoutManager.FlexboxLayoutManager$SavedState.access$400(flexboxLayoutManager$SavedState);
        }
        return (Parcelable)flexboxLayoutManager$SavedState;
    }
    
    public final RecyclerView$n H(final Context context, final AttributeSet set) {
        return new c(context, set);
    }
    
    public final int R0(int n, final RecyclerView$t recyclerView$t, final RecyclerView$y recyclerView$y) {
        if (this.l() && (this.V0 != 0 || !this.l())) {
            n = this.v1(n);
            final FlexboxLayoutManager.FlexboxLayoutManager$b g1 = this.g1;
            g1.d += n;
            this.i1.p(-n);
            return n;
        }
        n = this.u1(n, recyclerView$t, recyclerView$y);
        this.o1.clear();
        return n;
    }
    
    public final void S0(final int k1) {
        this.k1 = k1;
        this.l1 = Integer.MIN_VALUE;
        final FlexboxLayoutManager.FlexboxLayoutManager$SavedState j1 = this.j1;
        if (j1 != null) {
            FlexboxLayoutManager.FlexboxLayoutManager$SavedState.access$400(j1);
        }
        this.P0();
    }
    
    public final int T0(int n, final RecyclerView$t recyclerView$t, final RecyclerView$y recyclerView$y) {
        if (!this.l() && (this.V0 != 0 || this.l())) {
            n = this.v1(n);
            final FlexboxLayoutManager.FlexboxLayoutManager$b g1 = this.g1;
            g1.d += n;
            this.i1.p(-n);
            return n;
        }
        n = this.u1(n, recyclerView$t, recyclerView$y);
        this.o1.clear();
        return n;
    }
    
    public final PointF a(int n) {
        if (this.L() == 0) {
            return null;
        }
        if (n < this.b0(this.K(0))) {
            n = -1;
        }
        else {
            n = 1;
        }
        if (this.l()) {
            return new PointF(0.0f, (float)n);
        }
        return new PointF((float)n, 0.0f);
    }
    
    public final int b(final int n, final int n2, final int n3) {
        return RecyclerView$m.M(super.S0, super.Q0, n2, n3, this.r());
    }
    
    public final void c(final View view, int n, final int n2, final t6b t6b) {
        this.q(view, FlexboxLayoutManager.t1);
        if (this.l()) {
            n = this.Y(view);
            n += this.d0(view);
            t6b.e += n;
            t6b.f += n;
        }
        else {
            n = this.f0(view);
            n += this.J(view);
            t6b.e += n;
            t6b.f += n;
        }
    }
    
    public final View d(final int n) {
        final View view = (View)this.o1.get(n);
        if (view != null) {
            return view;
        }
        return this.d1.e(n);
    }
    
    public final void d1(final RecyclerView recyclerView, final RecyclerView$y recyclerView$y, final int a) {
        final u u = new u(((View)recyclerView).getContext());
        ((RecyclerView$x)u).a = a;
        this.e1((RecyclerView$x)u);
    }
    
    public final int e(final int n, final int n2, final int n3) {
        return RecyclerView$m.M(super.T0, super.R0, n2, n3, this.s());
    }
    
    public final void g(final t6b t6b) {
    }
    
    public final void g1() {
        this.b1.clear();
        FlexboxLayoutManager.FlexboxLayoutManager$b.b(this.g1);
        this.g1.d = 0;
    }
    
    public final int getAlignContent() {
        return 5;
    }
    
    public final int getAlignItems() {
        return this.X0;
    }
    
    public final int getFlexDirection() {
        return this.U0;
    }
    
    public final int getFlexItemCount() {
        return this.e1.b();
    }
    
    public final List<t6b> getFlexLinesInternal() {
        return this.b1;
    }
    
    public final int getFlexWrap() {
        return this.V0;
    }
    
    public final int getLargestMainSize() {
        final int size = this.b1.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        while (i < this.b1.size()) {
            max = Math.max(max, this.b1.get(i).e);
            ++i;
        }
        return max;
    }
    
    public final int getMaxLine() {
        return this.Y0;
    }
    
    public final int getSumOfCrossSize() {
        final int size = this.b1.size();
        int i = 0;
        int n = 0;
        while (i < size) {
            n += this.b1.get(i).g;
            ++i;
        }
        return n;
    }
    
    public final int h(final View view) {
        int n;
        int n2;
        if (this.l()) {
            n = this.f0(view);
            n2 = this.J(view);
        }
        else {
            n = this.Y(view);
            n2 = this.d0(view);
        }
        return n2 + n;
    }
    
    public final int h1(final RecyclerView$y recyclerView$y) {
        if (this.L() == 0) {
            return 0;
        }
        final int b = recyclerView$y.b();
        this.k1();
        final View m1 = this.m1(b);
        final View o1 = this.o1(b);
        if (recyclerView$y.b() != 0 && m1 != null && o1 != null) {
            return Math.min(this.h1.l(), this.h1.b(o1) - this.h1.e(m1));
        }
        return 0;
    }
    
    public final View i(final int n) {
        return this.d(n);
    }
    
    public final int i1(final RecyclerView$y recyclerView$y) {
        if (this.L() == 0) {
            return 0;
        }
        final int b = recyclerView$y.b();
        final View m1 = this.m1(b);
        final View o1 = this.o1(b);
        if (recyclerView$y.b() != 0 && m1 != null) {
            if (o1 != null) {
                final int b2 = this.b0(m1);
                final int b3 = this.b0(o1);
                final int abs = Math.abs(this.h1.b(o1) - this.h1.e(m1));
                final int[] c = this.c1.c;
                final int n = c[b2];
                if (n != 0) {
                    if (n != -1) {
                        return Math.round(n * (abs / (float)(c[b3] - n + 1)) + (this.h1.k() - this.h1.e(m1)));
                    }
                }
            }
        }
        return 0;
    }
    
    public final void j(final int n, final View view) {
        this.o1.put(n, (Object)view);
    }
    
    public final int j1(final RecyclerView$y recyclerView$y) {
        if (this.L() == 0) {
            return 0;
        }
        final int b = recyclerView$y.b();
        final View m1 = this.m1(b);
        final View o1 = this.o1(b);
        if (recyclerView$y.b() != 0 && m1 != null && o1 != null) {
            final View q1 = this.q1(0, this.L());
            int b2 = -1;
            int b3;
            if (q1 == null) {
                b3 = -1;
            }
            else {
                b3 = this.b0(q1);
            }
            final View q2 = this.q1(this.L() - 1, -1);
            if (q2 != null) {
                b2 = this.b0(q2);
            }
            return (int)(Math.abs(this.h1.b(o1) - this.h1.e(m1)) / (float)(b2 - b3 + 1) * recyclerView$y.b());
        }
        return 0;
    }
    
    public final int k(final View view, int n, int n2) {
        if (this.l()) {
            n = this.Y(view);
            n2 = this.d0(view);
        }
        else {
            n = this.f0(view);
            n2 = this.J(view);
        }
        return n2 + n;
    }
    
    public final void k1() {
        if (this.h1 != null) {
            return;
        }
        if (this.l()) {
            if (this.V0 == 0) {
                this.h1 = (a0)new y((RecyclerView$m)this);
                this.i1 = (a0)new z((RecyclerView$m)this);
            }
            else {
                this.h1 = (a0)new z((RecyclerView$m)this);
                this.i1 = (a0)new y((RecyclerView$m)this);
            }
        }
        else if (this.V0 == 0) {
            this.h1 = (a0)new z((RecyclerView$m)this);
            this.i1 = (a0)new y((RecyclerView$m)this);
        }
        else {
            this.h1 = (a0)new y((RecyclerView$m)this);
            this.i1 = (a0)new z((RecyclerView$m)this);
        }
    }
    
    public final boolean l() {
        final int u0 = this.U0;
        boolean b = true;
        if (u0 != 0) {
            b = (u0 == 1 && b);
        }
        return b;
    }
    
    public final int l1(final RecyclerView$t recyclerView$t, final RecyclerView$y recyclerView$y, final FlexboxLayoutManager.FlexboxLayoutManager$d flexboxLayoutManager$d) {
        final int f = flexboxLayoutManager$d.f;
        if (f != Integer.MIN_VALUE) {
            final int a = flexboxLayoutManager$d.a;
            if (a < 0) {
                flexboxLayoutManager$d.f = f + a;
            }
            this.w1(recyclerView$t, flexboxLayoutManager$d);
        }
        int a2 = flexboxLayoutManager$d.a;
        final boolean l = this.l();
        int n = 0;
        t6b t6b;
        for (int n2 = a2; n2 > 0 || this.f1.b; n2 -= t6b.g) {
            final List<t6b> b1 = this.b1;
            final int d = flexboxLayoutManager$d.d;
            boolean b2 = false;
            Label_0137: {
                if (d >= 0 && d < recyclerView$y.b()) {
                    final int c = flexboxLayoutManager$d.c;
                    if (c >= 0 && c < b1.size()) {
                        b2 = true;
                        break Label_0137;
                    }
                }
                b2 = false;
            }
            if (!b2) {
                break;
            }
            t6b = this.b1.get(flexboxLayoutManager$d.c);
            flexboxLayoutManager$d.d = t6b.o;
            int g2;
            if (this.l()) {
                final int paddingLeft = this.getPaddingLeft();
                final int paddingRight = this.getPaddingRight();
                final int s0 = super.S0;
                int e = flexboxLayoutManager$d.e;
                if (flexboxLayoutManager$d.i == -1) {
                    e -= t6b.g;
                }
                final int d2 = flexboxLayoutManager$d.d;
                final int w0 = this.W0;
                float n5 = 0.0f;
                float n7 = 0.0f;
                float n8 = 0.0f;
                Label_0567: {
                    if (w0 != 0) {
                        if (w0 != 1) {
                            if (w0 != 2) {
                                if (w0 == 3) {
                                    final float n3 = (float)paddingLeft;
                                    final int h = t6b.h;
                                    float n4;
                                    if (h != 1) {
                                        n4 = (float)(h - 1);
                                    }
                                    else {
                                        n4 = 1.0f;
                                    }
                                    n5 = (s0 - t6b.e) / n4;
                                    final float n6 = (float)(s0 - paddingRight);
                                    n7 = n3;
                                    n8 = n6;
                                    break Label_0567;
                                }
                                if (w0 == 4) {
                                    final int h2 = t6b.h;
                                    if (h2 != 0) {
                                        n5 = (s0 - t6b.e) / (float)h2;
                                    }
                                    else {
                                        n5 = 0.0f;
                                    }
                                    final float n9 = (float)paddingLeft;
                                    final float n10 = n5 / 2.0f;
                                    n7 = n9 + n10;
                                    n8 = s0 - paddingRight - n10;
                                    break Label_0567;
                                }
                                if (w0 == 5) {
                                    final int h3 = t6b.h;
                                    if (h3 != 0) {
                                        n5 = (s0 - t6b.e) / (float)(h3 + 1);
                                    }
                                    else {
                                        n5 = 0.0f;
                                    }
                                    n7 = paddingLeft + n5;
                                    n8 = s0 - paddingRight - n5;
                                    break Label_0567;
                                }
                                final StringBuilder g = w48.g("Invalid justifyContent is set: ");
                                g.append(this.W0);
                                throw new IllegalStateException(g.toString());
                            }
                            else {
                                final float n11 = (float)paddingLeft;
                                final float n12 = (s0 - t6b.e) / 2.0f;
                                n7 = n11 + n12;
                                n8 = s0 - paddingRight - n12;
                            }
                        }
                        else {
                            final int e2 = t6b.e;
                            n7 = (float)(s0 - e2 + paddingRight);
                            n8 = (float)(e2 - paddingLeft);
                        }
                    }
                    else {
                        n7 = (float)paddingLeft;
                        n8 = (float)(s0 - paddingRight);
                    }
                    n5 = 0.0f;
                }
                final float n13 = (float)this.g1.d;
                final float n14 = n7 - n13;
                float n15 = n8 - n13;
                final float max = Math.max(n5, 0.0f);
                final int h4 = t6b.h;
                int n16 = 0;
                int i = d2;
                float n17 = n14;
                while (i < d2 + h4) {
                    final View d3 = this.d(i);
                    if (d3 != null) {
                        if (flexboxLayoutManager$d.i == 1) {
                            this.q(d3, FlexboxLayoutManager.t1);
                            this.m(d3);
                        }
                        else {
                            this.q(d3, FlexboxLayoutManager.t1);
                            this.n(d3, n16, false);
                            ++n16;
                        }
                        final long n18 = this.c1.d[i];
                        final int n19 = (int)n18;
                        final int n20 = (int)(n18 >> 32);
                        final c c2 = (c)d3.getLayoutParams();
                        if (this.a1(d3, n19, n20, c2)) {
                            d3.measure(n19, n20);
                        }
                        final float n21 = n17 + (this.Y(d3) + ((ViewGroup$MarginLayoutParams)c2).leftMargin);
                        final float n22 = n15 - (this.d0(d3) + ((ViewGroup$MarginLayoutParams)c2).rightMargin);
                        final int n23 = this.f0(d3) + e;
                        if (this.Z0) {
                            this.c1.t(d3, t6b, Math.round(n22) - d3.getMeasuredWidth(), n23, Math.round(n22), d3.getMeasuredHeight() + n23);
                        }
                        else {
                            final View view = d3;
                            this.c1.t(view, t6b, Math.round(n21), n23, view.getMeasuredWidth() + Math.round(n21), view.getMeasuredHeight() + n23);
                        }
                        final float n24 = (float)(this.d0(d3) + (d3.getMeasuredWidth() + ((ViewGroup$MarginLayoutParams)c2).rightMargin));
                        n15 = n22 - (this.Y(d3) + (d3.getMeasuredWidth() + ((ViewGroup$MarginLayoutParams)c2).leftMargin) + max);
                        n17 = n24 + max + n21;
                    }
                    ++i;
                }
                flexboxLayoutManager$d.c += this.f1.i;
                g2 = t6b.g;
            }
            else {
                final int n25 = a2;
                final int paddingTop = this.getPaddingTop();
                final int paddingBottom = this.getPaddingBottom();
                final int t0 = super.T0;
                final int e3 = flexboxLayoutManager$d.e;
                int n26;
                int n27;
                if (flexboxLayoutManager$d.i == -1) {
                    final int g3 = t6b.g;
                    n26 = e3 + g3;
                    n27 = e3 - g3;
                }
                else {
                    n26 = e3;
                    n27 = e3;
                }
                final int d4 = flexboxLayoutManager$d.d;
                final int w2 = this.W0;
                float n30 = 0.0f;
                float n32 = 0.0f;
                float n33 = 0.0f;
                Label_1423: {
                    if (w2 != 0) {
                        if (w2 != 1) {
                            if (w2 != 2) {
                                if (w2 == 3) {
                                    final float n28 = (float)paddingTop;
                                    final int h5 = t6b.h;
                                    float n29;
                                    if (h5 != 1) {
                                        n29 = (float)(h5 - 1);
                                    }
                                    else {
                                        n29 = 1.0f;
                                    }
                                    n30 = (t0 - t6b.e) / n29;
                                    final float n31 = (float)(t0 - paddingBottom);
                                    n32 = n28;
                                    n33 = n31;
                                    break Label_1423;
                                }
                                if (w2 == 4) {
                                    final int h6 = t6b.h;
                                    if (h6 != 0) {
                                        n30 = (t0 - t6b.e) / (float)h6;
                                    }
                                    else {
                                        n30 = 0.0f;
                                    }
                                    final float n34 = (float)paddingTop;
                                    final float n35 = n30 / 2.0f;
                                    n32 = n34 + n35;
                                    n33 = t0 - paddingBottom - n35;
                                    break Label_1423;
                                }
                                if (w2 == 5) {
                                    final int h7 = t6b.h;
                                    if (h7 != 0) {
                                        n30 = (t0 - t6b.e) / (float)(h7 + 1);
                                    }
                                    else {
                                        n30 = 0.0f;
                                    }
                                    n32 = paddingTop + n30;
                                    n33 = t0 - paddingBottom - n30;
                                    break Label_1423;
                                }
                                final StringBuilder g4 = w48.g("Invalid justifyContent is set: ");
                                g4.append(this.W0);
                                throw new IllegalStateException(g4.toString());
                            }
                            else {
                                final float n36 = (float)paddingTop;
                                final float n37 = (t0 - t6b.e) / 2.0f;
                                n32 = n36 + n37;
                                n33 = t0 - paddingBottom - n37;
                            }
                        }
                        else {
                            final int e4 = t6b.e;
                            n32 = (float)(t0 - e4 + paddingBottom);
                            n33 = (float)(e4 - paddingTop);
                        }
                    }
                    else {
                        n32 = (float)paddingTop;
                        n33 = (float)(t0 - paddingBottom);
                    }
                    n30 = 0.0f;
                }
                final float n38 = (float)this.g1.d;
                final float n39 = n32 - n38;
                float n40 = n33 - n38;
                final float max2 = Math.max(n30, 0.0f);
                final int h8 = t6b.h;
                int n41 = 0;
                int j = d4;
                float n42 = n39;
                while (j < d4 + h8) {
                    final View d5 = this.d(j);
                    if (d5 != null) {
                        final long n43 = this.c1.d[j];
                        final int n44 = (int)n43;
                        final int n45 = (int)(n43 >> 32);
                        final c c3 = (c)d5.getLayoutParams();
                        if (this.a1(d5, n44, n45, c3)) {
                            d5.measure(n44, n45);
                        }
                        final float n46 = n42 + (this.f0(d5) + ((ViewGroup$MarginLayoutParams)c3).topMargin);
                        final float n47 = n40 - (this.J(d5) + ((ViewGroup$MarginLayoutParams)c3).rightMargin);
                        if (flexboxLayoutManager$d.i == 1) {
                            this.q(d5, FlexboxLayoutManager.t1);
                            this.m(d5);
                        }
                        else {
                            this.q(d5, FlexboxLayoutManager.t1);
                            this.n(d5, n41, false);
                            ++n41;
                        }
                        final int n48 = this.Y(d5) + n27;
                        final int n49 = n26 - this.d0(d5);
                        final boolean z0 = this.Z0;
                        if (z0) {
                            if (this.a1) {
                                this.c1.u(d5, t6b, z0, n49 - d5.getMeasuredWidth(), Math.round(n47) - d5.getMeasuredHeight(), n49, Math.round(n47));
                            }
                            else {
                                final View view2 = d5;
                                this.c1.u(view2, t6b, z0, n49 - view2.getMeasuredWidth(), Math.round(n46), n49, view2.getMeasuredHeight() + Math.round(n46));
                            }
                        }
                        else {
                            final View view3 = d5;
                            if (this.a1) {
                                this.c1.u(view3, t6b, z0, n48, Math.round(n47) - view3.getMeasuredHeight(), view3.getMeasuredWidth() + n48, Math.round(n47));
                            }
                            else {
                                this.c1.u(view3, t6b, z0, n48, Math.round(n46), view3.getMeasuredWidth() + n48, view3.getMeasuredHeight() + Math.round(n46));
                            }
                        }
                        final float n50 = (float)(this.J(d5) + (d5.getMeasuredHeight() + ((ViewGroup$MarginLayoutParams)c3).topMargin));
                        n40 = n47 - (this.f0(d5) + (d5.getMeasuredHeight() + ((ViewGroup$MarginLayoutParams)c3).bottomMargin) + max2);
                        n42 = n50 + max2 + n46;
                    }
                    ++j;
                }
                flexboxLayoutManager$d.c += this.f1.i;
                final int g5 = t6b.g;
                a2 = n25;
                g2 = g5;
            }
            n += g2;
            if (!l && this.Z0) {
                flexboxLayoutManager$d.e -= t6b.g * flexboxLayoutManager$d.i;
            }
            else {
                flexboxLayoutManager$d.e += t6b.g * flexboxLayoutManager$d.i;
            }
        }
        final int a3 = flexboxLayoutManager$d.a - n;
        flexboxLayoutManager$d.a = a3;
        final int f2 = flexboxLayoutManager$d.f;
        if (f2 != Integer.MIN_VALUE) {
            final int f3 = f2 + n;
            flexboxLayoutManager$d.f = f3;
            if (a3 < 0) {
                flexboxLayoutManager$d.f = f3 + a3;
            }
            this.w1(recyclerView$t, flexboxLayoutManager$d);
        }
        return a2 - flexboxLayoutManager$d.a;
    }
    
    public final View m1(int b0) {
        final View r1 = this.r1(0, this.L(), b0);
        if (r1 == null) {
            return null;
        }
        b0 = this.b0(r1);
        b0 = this.c1.c[b0];
        if (b0 == -1) {
            return null;
        }
        return this.n1(r1, this.b1.get(b0));
    }
    
    public final View n1(View view, final t6b t6b) {
        final boolean l = this.l();
        View view2;
        for (int h = t6b.h, i = 1; i < h; ++i, view = view2) {
            final View k = this.K(i);
            view2 = view;
            if (k != null) {
                if (k.getVisibility() == 8) {
                    view2 = view;
                }
                else {
                    if (this.Z0 && !l) {
                        view2 = view;
                        if (this.h1.b(view) >= this.h1.b(k)) {
                            continue;
                        }
                    }
                    else {
                        view2 = view;
                        if (this.h1.e(view) <= this.h1.e(k)) {
                            continue;
                        }
                    }
                    view2 = k;
                }
            }
        }
        return view;
    }
    
    public final void o0() {
        this.J0();
    }
    
    public final View o1(int b0) {
        final View r1 = this.r1(this.L() - 1, -1, b0);
        if (r1 == null) {
            return null;
        }
        b0 = this.b0(r1);
        b0 = this.c1.c[b0];
        return this.p1(r1, this.b1.get(b0));
    }
    
    public final void p0(final RecyclerView recyclerView) {
        this.q1 = (View)((View)recyclerView).getParent();
    }
    
    public final View p1(View view, final t6b t6b) {
        final boolean l = this.l();
        View view2;
        for (int i = this.L() - 2; i > this.L() - t6b.h - 1; --i, view = view2) {
            final View k = this.K(i);
            view2 = view;
            if (k != null) {
                if (k.getVisibility() == 8) {
                    view2 = view;
                }
                else {
                    if (this.Z0 && !l) {
                        view2 = view;
                        if (this.h1.e(view) <= this.h1.e(k)) {
                            continue;
                        }
                    }
                    else {
                        view2 = view;
                        if (this.h1.b(view) >= this.h1.b(k)) {
                            continue;
                        }
                    }
                    view2 = k;
                }
            }
        }
        return view;
    }
    
    public final void q0(final RecyclerView recyclerView) {
    }
    
    public final View q1(int i, final int n) {
        int n2;
        if (n > i) {
            n2 = 1;
        }
        else {
            n2 = -1;
        }
        while (i != n) {
            final View k = this.K(i);
            final int paddingLeft = this.getPaddingLeft();
            final int paddingTop = this.getPaddingTop();
            final int s0 = super.S0;
            final int paddingRight = this.getPaddingRight();
            final int t0 = super.T0;
            final int paddingBottom = this.getPaddingBottom();
            final RecyclerView$n recyclerView$n = (RecyclerView$n)k.getLayoutParams();
            final int left = k.getLeft();
            final int y = this.Y(k);
            final int leftMargin = ((ViewGroup$MarginLayoutParams)recyclerView$n).leftMargin;
            final RecyclerView$n recyclerView$n2 = (RecyclerView$n)k.getLayoutParams();
            final int top = k.getTop();
            final int f0 = this.f0(k);
            final int topMargin = ((ViewGroup$MarginLayoutParams)recyclerView$n2).topMargin;
            final RecyclerView$n recyclerView$n3 = (RecyclerView$n)k.getLayoutParams();
            final int right = k.getRight();
            final int d0 = this.d0(k);
            final int rightMargin = ((ViewGroup$MarginLayoutParams)recyclerView$n3).rightMargin;
            final RecyclerView$n recyclerView$n4 = (RecyclerView$n)k.getLayoutParams();
            final int bottom = k.getBottom();
            final int j = this.J(k);
            final int bottomMargin = ((ViewGroup$MarginLayoutParams)recyclerView$n4).bottomMargin;
            final boolean b = false;
            final boolean b2 = left - y - leftMargin >= s0 - paddingRight || d0 + right + rightMargin >= paddingLeft;
            final boolean b3 = top - f0 - topMargin >= t0 - paddingBottom || j + bottom + bottomMargin >= paddingTop;
            int n3 = b ? 1 : 0;
            if (b2) {
                n3 = (b ? 1 : 0);
                if (b3) {
                    n3 = 1;
                }
            }
            if (n3 != 0) {
                return k;
            }
            i += n2;
        }
        return null;
    }
    
    public final boolean r() {
        if (this.V0 == 0) {
            return this.l();
        }
        final boolean l = this.l();
        boolean b = false;
        if (l) {
            final int s0 = super.S0;
            final View q1 = this.q1;
            int width;
            if (q1 != null) {
                width = q1.getWidth();
            }
            else {
                width = 0;
            }
            if (s0 <= width) {
                return b;
            }
        }
        b = true;
        return b;
    }
    
    public final View r1(int i, final int n, final int n2) {
        this.k1();
        if (this.f1 == null) {
            this.f1 = new FlexboxLayoutManager.FlexboxLayoutManager$d();
        }
        final int k = this.h1.k();
        final int g = this.h1.g();
        int n3;
        if (n > i) {
            n3 = 1;
        }
        else {
            n3 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != n) {
            final View j = this.K(i);
            final int b0 = this.b0(j);
            View view3 = view;
            View view4 = view2;
            if (b0 >= 0) {
                view3 = view;
                view4 = view2;
                if (b0 < n2) {
                    if (((RecyclerView$n)j.getLayoutParams()).c()) {
                        view3 = view;
                        if ((view4 = view2) == null) {
                            view4 = j;
                            view3 = view;
                        }
                    }
                    else {
                        if (this.h1.e(j) >= k && this.h1.b(j) <= g) {
                            return j;
                        }
                        view3 = view;
                        view4 = view2;
                        if (view == null) {
                            view3 = j;
                            view4 = view2;
                        }
                    }
                }
            }
            i += n3;
            view = view3;
            view2 = view4;
        }
        if (view == null) {
            view = view2;
        }
        return view;
    }
    
    public final boolean s() {
        final int v0 = this.V0;
        final boolean b = true;
        if (v0 == 0) {
            return this.l() ^ true;
        }
        boolean b2 = b;
        if (!this.l()) {
            final int t0 = super.T0;
            final View q1 = this.q1;
            int height;
            if (q1 != null) {
                height = q1.getHeight();
            }
            else {
                height = 0;
            }
            b2 = (t0 > height && b);
        }
        return b2;
    }
    
    public final int s1(int n, final RecyclerView$t recyclerView$t, final RecyclerView$y recyclerView$y, final boolean b) {
        int u1;
        if (!this.l() && this.Z0) {
            final int n2 = n - this.h1.k();
            if (n2 <= 0) {
                return 0;
            }
            u1 = this.u1(n2, recyclerView$t, recyclerView$y);
        }
        else {
            final int n3 = this.h1.g() - n;
            if (n3 <= 0) {
                return 0;
            }
            u1 = -this.u1(-n3, recyclerView$t, recyclerView$y);
        }
        if (b) {
            n = this.h1.g() - (n + u1);
            if (n > 0) {
                this.h1.p(n);
                return n + u1;
            }
        }
        return u1;
    }
    
    public final void setFlexLines(final List<t6b> b1) {
        this.b1 = b1;
    }
    
    public final boolean t(final RecyclerView$n recyclerView$n) {
        return recyclerView$n instanceof c;
    }
    
    public final int t1(int n, final RecyclerView$t recyclerView$t, final RecyclerView$y recyclerView$y, final boolean b) {
        int u1;
        if (!this.l() && this.Z0) {
            final int n2 = this.h1.g() - n;
            if (n2 <= 0) {
                return 0;
            }
            u1 = this.u1(-n2, recyclerView$t, recyclerView$y);
        }
        else {
            final int n3 = n - this.h1.k();
            if (n3 <= 0) {
                return 0;
            }
            u1 = -this.u1(n3, recyclerView$t, recyclerView$y);
        }
        int n4 = u1;
        if (b) {
            n = n + u1 - this.h1.k();
            n4 = u1;
            if (n > 0) {
                this.h1.p(-n);
                n4 = u1 - n;
            }
        }
        return n4;
    }
    
    public final int u1(int g, final RecyclerView$t recyclerView$t, final RecyclerView$y recyclerView$y) {
        if (this.L() == 0 || g == 0) {
            return 0;
        }
        this.k1();
        this.f1.j = true;
        final boolean b = !this.l() && this.Z0;
        int i;
        if (b ? (g < 0) : (g > 0)) {
            i = 1;
        }
        else {
            i = -1;
        }
        final int abs = Math.abs(g);
        this.f1.i = i;
        final boolean l = this.l();
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(super.S0, super.Q0);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(super.T0, super.R0);
        final boolean b2 = !l && this.Z0;
        if (i == 1) {
            final View k = this.K(this.L() - 1);
            this.f1.e = this.h1.b(k);
            final int b3 = this.b0(k);
            final View p3 = this.p1(k, this.b1.get(this.c1.c[b3]));
            final FlexboxLayoutManager.FlexboxLayoutManager$d f1 = this.f1;
            f1.h = 1;
            final int d = b3 + 1;
            f1.d = d;
            final int[] c = this.c1.c;
            if (c.length <= d) {
                f1.c = -1;
            }
            else {
                f1.c = c[d];
            }
            if (b2) {
                f1.e = this.h1.e(p3);
                this.f1.f = this.h1.k() + -this.h1.e(p3);
                final FlexboxLayoutManager.FlexboxLayoutManager$d f2 = this.f1;
                int f3 = f2.f;
                if (f3 < 0) {
                    f3 = 0;
                }
                f2.f = f3;
            }
            else {
                f1.e = this.h1.b(p3);
                this.f1.f = this.h1.b(p3) - this.h1.g();
            }
            final int c2 = this.f1.c;
            if ((c2 == -1 || c2 > this.b1.size() - 1) && this.f1.d <= this.getFlexItemCount()) {
                final int n = abs - this.f1.f;
                this.s1.a();
                if (n > 0) {
                    if (l) {
                        this.c1.b(this.s1, measureSpec, measureSpec2, n, this.f1.d, -1, (List)this.b1);
                    }
                    else {
                        this.c1.b(this.s1, measureSpec2, measureSpec, n, this.f1.d, -1, (List)this.b1);
                    }
                    this.c1.h(measureSpec, measureSpec2, this.f1.d);
                    this.c1.z(this.f1.d);
                }
            }
        }
        else {
            final View j = this.K(0);
            this.f1.e = this.h1.e(j);
            final int b4 = this.b0(j);
            final View n2 = this.n1(j, this.b1.get(this.c1.c[b4]));
            final FlexboxLayoutManager.FlexboxLayoutManager$d f4 = this.f1;
            f4.h = 1;
            int c3;
            if ((c3 = this.c1.c[b4]) == -1) {
                c3 = 0;
            }
            if (c3 > 0) {
                this.f1.d = b4 - this.b1.get(c3 - 1).h;
            }
            else {
                f4.d = -1;
            }
            final FlexboxLayoutManager.FlexboxLayoutManager$d f5 = this.f1;
            if (c3 > 0) {
                --c3;
            }
            else {
                c3 = 0;
            }
            f5.c = c3;
            if (b2) {
                f5.e = this.h1.b(n2);
                this.f1.f = this.h1.b(n2) - this.h1.g();
                final FlexboxLayoutManager.FlexboxLayoutManager$d f6 = this.f1;
                int f7 = f6.f;
                if (f7 < 0) {
                    f7 = 0;
                }
                f6.f = f7;
            }
            else {
                f5.e = this.h1.e(n2);
                this.f1.f = this.h1.k() + -this.h1.e(n2);
            }
        }
        final FlexboxLayoutManager.FlexboxLayoutManager$d f8 = this.f1;
        final int f9 = f8.f;
        f8.a = abs - f9;
        final int n3 = this.l1(recyclerView$t, recyclerView$y, f8) + f9;
        if (n3 < 0) {
            return 0;
        }
        if (b) {
            if (abs > n3) {
                g = -i * n3;
            }
        }
        else if (abs > n3) {
            g = i * n3;
        }
        this.h1.p(-g);
        return this.f1.g = g;
    }
    
    public final int v1(final int n) {
        final int l = this.L();
        boolean b = false;
        if (l != 0 && n != 0) {
            this.k1();
            final boolean i = this.l();
            final View q1 = this.q1;
            int n2;
            if (i) {
                n2 = q1.getWidth();
            }
            else {
                n2 = q1.getHeight();
            }
            int n3;
            if (i) {
                n3 = super.S0;
            }
            else {
                n3 = super.T0;
            }
            if (this.X() == 1) {
                b = true;
            }
            int d2;
            if (b) {
                final int abs = Math.abs(n);
                if (n < 0) {
                    return -Math.min(n3 + this.g1.d - n2, abs);
                }
                final int d = this.g1.d;
                final int min = n;
                if (d + n <= 0) {
                    return min;
                }
                d2 = d;
            }
            else {
                if (n > 0) {
                    return Math.min(n3 - this.g1.d - n2, n);
                }
                if ((d2 = this.g1.d) + n >= 0) {
                    return n;
                }
            }
            return -d2;
        }
        return 0;
    }
    
    public final void w0(final int n, final int n2) {
        this.B1(n);
    }
    
    public final void w1(final RecyclerView$t recyclerView$t, final FlexboxLayoutManager.FlexboxLayoutManager$d flexboxLayoutManager$d) {
        if (!flexboxLayoutManager$d.j) {
            return;
        }
        final int i = flexboxLayoutManager$d.i;
        int n = -1;
        if (i == -1) {
            if (flexboxLayoutManager$d.f >= 0) {
                this.h1.f();
                int l = this.L();
                if (l != 0) {
                    final int n2 = l - 1;
                    int n3 = this.c1.c[this.b0(this.K(n2))];
                    if (n3 != -1) {
                        t6b t6b = this.b1.get(n3);
                        int n4 = n2;
                        int n5;
                        int j;
                        while (true) {
                            n5 = l;
                            j = n2;
                            if (n4 < 0) {
                                break;
                            }
                            final View k = this.K(n4);
                            final int f = flexboxLayoutManager$d.f;
                            final boolean b = (!this.l() && this.Z0) ? (this.h1.b(k) <= f) : (this.h1.e(k) >= this.h1.f() - f);
                            n5 = l;
                            j = n2;
                            if (!b) {
                                break;
                            }
                            t6b t6b2 = t6b;
                            int n6 = n3;
                            if (t6b.o == this.b0(k)) {
                                if (n3 <= 0) {
                                    n5 = n4;
                                    j = n2;
                                    break;
                                }
                                n6 = n3 + flexboxLayoutManager$d.i;
                                t6b2 = this.b1.get(n6);
                                l = n4;
                            }
                            --n4;
                            t6b = t6b2;
                            n3 = n6;
                        }
                        while (j >= n5) {
                            this.N0(j, recyclerView$t);
                            --j;
                        }
                    }
                }
            }
        }
        else if (flexboxLayoutManager$d.f >= 0) {
            final int m = this.L();
            if (m != 0) {
                int n7 = this.c1.c[this.b0(this.K(0))];
                if (n7 != -1) {
                    t6b t6b3 = this.b1.get(n7);
                    int n8 = 0;
                    int n9;
                    while (true) {
                        n9 = n;
                        if (n8 >= m) {
                            break;
                        }
                        final View k2 = this.K(n8);
                        final int f2 = flexboxLayoutManager$d.f;
                        final boolean b2 = (!this.l() && this.Z0) ? (this.h1.f() - this.h1.e(k2) <= f2) : (this.h1.b(k2) <= f2);
                        n9 = n;
                        if (!b2) {
                            break;
                        }
                        int n10 = n7;
                        t6b t6b4 = t6b3;
                        if (t6b3.p == this.b0(k2)) {
                            if (n7 >= this.b1.size() - 1) {
                                n9 = n8;
                                break;
                            }
                            n10 = n7 + flexboxLayoutManager$d.i;
                            t6b4 = this.b1.get(n10);
                            n = n8;
                        }
                        ++n8;
                        n7 = n10;
                        t6b3 = t6b4;
                    }
                    while (n9 >= 0) {
                        this.N0(n9, recyclerView$t);
                        --n9;
                    }
                }
            }
        }
    }
    
    public final int x(final RecyclerView$y recyclerView$y) {
        return this.h1(recyclerView$y);
    }
    
    public final void x1() {
        int n;
        if (this.l()) {
            n = super.R0;
        }
        else {
            n = super.Q0;
        }
        this.f1.b = (n == 0 || n == Integer.MIN_VALUE);
    }
    
    public final int y(final RecyclerView$y recyclerView$y) {
        return this.i1(recyclerView$y);
    }
    
    public final void y0(final int n, final int n2) {
        this.B1(Math.min(n, n2));
    }
    
    public final void y1(final int n) {
        if (this.X0 != 4) {
            this.J0();
            this.g1();
            this.X0 = 4;
            this.P0();
        }
    }
    
    public final int z(final RecyclerView$y recyclerView$y) {
        return this.j1(recyclerView$y);
    }
    
    public final void z0(final int n, final int n2) {
        this.B1(n);
    }
    
    public final void z1(final int u0) {
        if (this.U0 != u0) {
            this.J0();
            this.U0 = u0;
            this.h1 = null;
            this.i1 = null;
            this.g1();
            this.P0();
        }
    }
    
    public static final class c extends RecyclerView$n implements s6b
    {
        public static final Parcelable$Creator<c> CREATOR;
        public float G0;
        public float H0;
        public int I0;
        public float J0;
        public int K0;
        public int L0;
        public int M0;
        public int N0;
        public boolean O0;
        
        static {
            CREATOR = (Parcelable$Creator)new FlexboxLayoutManager$c$a();
        }
        
        public c() {
            super(-2, -2);
            this.G0 = 0.0f;
            this.H0 = 1.0f;
            this.I0 = -1;
            this.J0 = -1.0f;
            this.M0 = 16777215;
            this.N0 = 16777215;
        }
        
        public c(final Context context, final AttributeSet set) {
            super(context, set);
            this.G0 = 0.0f;
            this.H0 = 1.0f;
            this.I0 = -1;
            this.J0 = -1.0f;
            this.M0 = 16777215;
            this.N0 = 16777215;
        }
        
        public c(final Parcel parcel) {
            super(-2, -2);
            this.G0 = 0.0f;
            this.H0 = 1.0f;
            this.I0 = -1;
            this.J0 = -1.0f;
            this.M0 = 16777215;
            this.N0 = 16777215;
            this.G0 = parcel.readFloat();
            this.H0 = parcel.readFloat();
            this.I0 = parcel.readInt();
            this.J0 = parcel.readFloat();
            this.K0 = parcel.readInt();
            this.L0 = parcel.readInt();
            this.M0 = parcel.readInt();
            this.N0 = parcel.readInt();
            this.O0 = (parcel.readByte() != 0);
            ((ViewGroup$MarginLayoutParams)this).bottomMargin = parcel.readInt();
            ((ViewGroup$MarginLayoutParams)this).leftMargin = parcel.readInt();
            ((ViewGroup$MarginLayoutParams)this).rightMargin = parcel.readInt();
            ((ViewGroup$MarginLayoutParams)this).topMargin = parcel.readInt();
            ((ViewGroup$MarginLayoutParams)this).height = parcel.readInt();
            ((ViewGroup$MarginLayoutParams)this).width = parcel.readInt();
        }
        
        public final void A2(final int k0) {
            this.K0 = k0;
        }
        
        public final int B2() {
            return ((ViewGroup$MarginLayoutParams)this).bottomMargin;
        }
        
        public final int E2() {
            return ((ViewGroup$MarginLayoutParams)this).leftMargin;
        }
        
        public final int M1() {
            return this.M0;
        }
        
        public final int R0() {
            return ((ViewGroup$MarginLayoutParams)this).topMargin;
        }
        
        public final void V0(final int l0) {
            this.L0 = l0;
        }
        
        public final float X0() {
            return this.G0;
        }
        
        public final int describeContents() {
            return 0;
        }
        
        public final int getHeight() {
            return ((ViewGroup$MarginLayoutParams)this).height;
        }
        
        public final int getOrder() {
            return 1;
        }
        
        public final int getWidth() {
            return ((ViewGroup$MarginLayoutParams)this).width;
        }
        
        public final float k1() {
            return this.J0;
        }
        
        public final int o3() {
            return ((ViewGroup$MarginLayoutParams)this).rightMargin;
        }
        
        public final int p0() {
            return this.I0;
        }
        
        public final float q0() {
            return this.H0;
        }
        
        public final int q3() {
            return this.L0;
        }
        
        public final boolean u1() {
            return this.O0;
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeFloat(this.G0);
            parcel.writeFloat(this.H0);
            parcel.writeInt(this.I0);
            parcel.writeFloat(this.J0);
            parcel.writeInt(this.K0);
            parcel.writeInt(this.L0);
            parcel.writeInt(this.M0);
            parcel.writeInt(this.N0);
            parcel.writeByte((byte)(byte)(this.O0 ? 1 : 0));
            parcel.writeInt(((ViewGroup$MarginLayoutParams)this).bottomMargin);
            parcel.writeInt(((ViewGroup$MarginLayoutParams)this).leftMargin);
            parcel.writeInt(((ViewGroup$MarginLayoutParams)this).rightMargin);
            parcel.writeInt(((ViewGroup$MarginLayoutParams)this).topMargin);
            parcel.writeInt(((ViewGroup$MarginLayoutParams)this).height);
            parcel.writeInt(((ViewGroup$MarginLayoutParams)this).width);
        }
        
        public final int x0() {
            return this.K0;
        }
        
        public final int x3() {
            return this.N0;
        }
    }
}
