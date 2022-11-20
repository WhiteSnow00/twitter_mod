// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;

public class v extends h0
{
    public z d;
    public y e;
    
    public int[] c(final RecyclerView$m recyclerView$m, final View view) {
        final int[] array = new int[2];
        if (recyclerView$m.r()) {
            array[0] = this.h(view, this.k(recyclerView$m));
        }
        else {
            array[0] = 0;
        }
        if (recyclerView$m.s()) {
            array[1] = this.h(view, this.l(recyclerView$m));
        }
        else {
            array[1] = 0;
        }
        return array;
    }
    
    public View e(final RecyclerView$m recyclerView$m) {
        if (recyclerView$m.s()) {
            return this.j(recyclerView$m, this.l(recyclerView$m));
        }
        if (recyclerView$m.r()) {
            return this.j(recyclerView$m, this.k(recyclerView$m));
        }
        return null;
    }
    
    public int f(final RecyclerView$m recyclerView$m, int i, int j) {
        if (!(recyclerView$m instanceof RecyclerView$x$b)) {
            return -1;
        }
        final int w = recyclerView$m.W();
        if (w == 0) {
            return -1;
        }
        final View e = this.e(recyclerView$m);
        if (e == null) {
            return -1;
        }
        final int b0 = recyclerView$m.b0(e);
        if (b0 == -1) {
            return -1;
        }
        final RecyclerView$x$b recyclerView$x$b = (RecyclerView$x$b)recyclerView$m;
        final int n = w - 1;
        final PointF a = recyclerView$x$b.a(n);
        if (a == null) {
            return -1;
        }
        final boolean r = recyclerView$m.r();
        final int n2 = 0;
        if (r) {
            final int n3 = i = this.i(recyclerView$m, this.k(recyclerView$m), i, 0);
            if (a.x < 0.0f) {
                i = -n3;
            }
        }
        else {
            i = 0;
        }
        if (recyclerView$m.s()) {
            final int n4 = j = this.i(recyclerView$m, this.l(recyclerView$m), 0, j);
            if (a.y < 0.0f) {
                j = -n4;
            }
        }
        else {
            j = 0;
        }
        if (recyclerView$m.s()) {
            i = j;
        }
        if (i == 0) {
            return -1;
        }
        i += b0;
        if (i < 0) {
            i = n2;
        }
        if (i >= w) {
            i = n;
        }
        return i;
    }
    
    public final int h(final View view, final a0 a0) {
        return a0.c(view) / 2 + a0.e(view) - (a0.l() / 2 + a0.k());
    }
    
    public final int i(final RecyclerView$m recyclerView$m, final a0 a0, int n, int min) {
        final int[] array = new int[2];
        super.b.fling(0, 0, n, min, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        array[0] = super.b.getFinalX();
        array[1] = super.b.getFinalY();
        final int l = recyclerView$m.L();
        final float n2 = 1.0f;
        float n3;
        if (l == 0) {
            n3 = n2;
        }
        else {
            View view = null;
            View view2 = null;
            n = Integer.MAX_VALUE;
            int n4 = Integer.MIN_VALUE;
            View view3;
            int n5;
            for (int i = 0; i < l; ++i, view = view3, n4 = n5) {
                final View k = recyclerView$m.K(i);
                final int b0 = recyclerView$m.b0(k);
                if (b0 == -1) {
                    view3 = view;
                    n5 = n4;
                }
                else {
                    if (b0 < (min = n)) {
                        view = k;
                        min = b0;
                    }
                    view3 = view;
                    n = min;
                    if (b0 > (n5 = n4)) {
                        n5 = b0;
                        n = min;
                        view2 = k;
                        view3 = view;
                    }
                }
            }
            n3 = n2;
            if (view != null) {
                if (view2 == null) {
                    n3 = n2;
                }
                else {
                    min = Math.min(a0.e(view), a0.e(view2));
                    min = Math.max(a0.b(view), a0.b(view2)) - min;
                    if (min == 0) {
                        n3 = n2;
                    }
                    else {
                        n3 = min * 1.0f / (n4 - n + 1);
                    }
                }
            }
        }
        if (n3 <= 0.0f) {
            return 0;
        }
        if (Math.abs(array[0]) > Math.abs(array[1])) {
            n = array[0];
        }
        else {
            n = array[1];
        }
        return Math.round(n / n3);
    }
    
    public final View j(final RecyclerView$m recyclerView$m, final a0 a0) {
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
    
    public final a0 k(final RecyclerView$m recyclerView$m) {
        final y e = this.e;
        if (e == null || ((a0)e).a != recyclerView$m) {
            this.e = new y(recyclerView$m);
        }
        return (a0)this.e;
    }
    
    public final a0 l(final RecyclerView$m recyclerView$m) {
        final z d = this.d;
        if (d == null || ((a0)d).a != recyclerView$m) {
            this.d = new z(recyclerView$m);
        }
        return (a0)this.d;
    }
}
