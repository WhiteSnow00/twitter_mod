// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.animation.Interpolator;
import android.content.Context;
import android.view.View;

public class b0 extends h0
{
    public z d;
    public y e;
    
    public int[] c(final RecyclerView$m recyclerView$m, final View view) {
        final int[] array = new int[2];
        if (recyclerView$m.r()) {
            array[0] = this.h(view, this.j(recyclerView$m));
        }
        else {
            array[0] = 0;
        }
        if (recyclerView$m.s()) {
            array[1] = this.h(view, this.k(recyclerView$m));
        }
        else {
            array[1] = 0;
        }
        return array;
    }
    
    public RecyclerView$x d(final RecyclerView$m recyclerView$m) {
        if (!(recyclerView$m instanceof RecyclerView$x$b)) {
            return null;
        }
        return (RecyclerView$x)new u(this, ((View)super.a).getContext()) {
            public final b0 q;
            
            public final void f(final View view, final RecyclerView$x$a recyclerView$x$a) {
                final b0 q = this.q;
                final int[] c = q.c(q.a.getLayoutManager(), view);
                final int n = c[0];
                final int n2 = c[1];
                final int l = this.l(Math.max(Math.abs(n), Math.abs(n2)));
                if (l > 0) {
                    recyclerView$x$a.b(n, n2, l, (Interpolator)super.j);
                }
            }
            
            public final float k(final DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }
            
            public final int m(final int n) {
                return Math.min(100, super.m(n));
            }
        };
    }
    
    public View e(final RecyclerView$m recyclerView$m) {
        if (recyclerView$m.s()) {
            return this.i(recyclerView$m, this.k(recyclerView$m));
        }
        if (recyclerView$m.r()) {
            return this.i(recyclerView$m, this.j(recyclerView$m));
        }
        return null;
    }
    
    public int f(final RecyclerView$m recyclerView$m, int n, int n2) {
        final int w = recyclerView$m.W();
        if (w == 0) {
            return -1;
        }
        final boolean s = recyclerView$m.s();
        View view = null;
        a0 a0;
        if (s) {
            a0 = this.k(recyclerView$m);
        }
        else if (recyclerView$m.r()) {
            a0 = this.j(recyclerView$m);
        }
        else {
            a0 = null;
        }
        if (a0 == null) {
            return -1;
        }
        final int l = recyclerView$m.L();
        final int n3 = 0;
        View view2 = null;
        int n4 = Integer.MIN_VALUE;
        int n5 = Integer.MAX_VALUE;
        View view3;
        int n6;
        for (int i = 0; i < l; ++i, view = view3, n5 = n6) {
            final View k = recyclerView$m.K(i);
            if (k == null) {
                view3 = view;
                n6 = n5;
            }
            else {
                final int h = this.h(k, a0);
                View view4 = view2;
                int n7 = n4;
                if (h <= 0) {
                    view4 = view2;
                    if (h > (n7 = n4)) {
                        view4 = k;
                        n7 = h;
                    }
                }
                view3 = view;
                view2 = view4;
                n4 = n7;
                n6 = n5;
                if (h >= 0) {
                    view3 = view;
                    view2 = view4;
                    n4 = n7;
                    if (h < (n6 = n5)) {
                        n6 = h;
                        n4 = n7;
                        view2 = view4;
                        view3 = k;
                    }
                }
            }
        }
        final boolean r = recyclerView$m.r();
        int n8 = 1;
        n = ((r ? (n > 0) : (n2 > 0)) ? 1 : 0);
        if (n != 0 && view != null) {
            return recyclerView$m.b0(view);
        }
        if (n == 0 && view2 != null) {
            return recyclerView$m.b0(view2);
        }
        if (n != 0) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        final int b0 = recyclerView$m.b0(view);
        final int w2 = recyclerView$m.W();
        n2 = n3;
        Label_0385: {
            if (recyclerView$m instanceof RecyclerView$x$b) {
                final PointF a2 = ((RecyclerView$x$b)recyclerView$m).a(w2 - 1);
                n2 = n3;
                if (a2 != null) {
                    if (a2.x >= 0.0f) {
                        n2 = n3;
                        if (a2.y >= 0.0f) {
                            break Label_0385;
                        }
                    }
                    n2 = 1;
                }
            }
        }
        if (n2 == n) {
            n8 = -1;
        }
        n = b0 + n8;
        if (n >= 0 && n < w) {
            return n;
        }
        return -1;
    }
    
    public final int h(final View view, final a0 a0) {
        return a0.c(view) / 2 + a0.e(view) - (a0.l() / 2 + a0.k());
    }
    
    public final View i(final RecyclerView$m recyclerView$m, final a0 a0) {
        final int l = recyclerView$m.L();
        View view = null;
        if (l == 0) {
            return null;
        }
        final int k = a0.k();
        final int n = a0.l() / 2;
        int n2 = Integer.MAX_VALUE;
        int n3;
        for (int i = 0; i < l; ++i, n2 = n3) {
            final View j = recyclerView$m.K(i);
            final int abs = Math.abs(a0.c(j) / 2 + a0.e(j) - (n + k));
            if (abs < (n3 = n2)) {
                view = j;
                n3 = abs;
            }
        }
        return view;
    }
    
    public final a0 j(final RecyclerView$m recyclerView$m) {
        final y e = this.e;
        if (e == null || ((a0)e).a != recyclerView$m) {
            this.e = new y(recyclerView$m);
        }
        return (a0)this.e;
    }
    
    public final a0 k(final RecyclerView$m recyclerView$m) {
        final z d = this.d;
        if (d == null || ((a0)d).a != recyclerView$m) {
            this.d = new z(recyclerView$m);
        }
        return (a0)this.d;
    }
}
