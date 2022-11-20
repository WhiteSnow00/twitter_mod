// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.util.Log;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import java.util.Arrays;
import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.util.SparseIntArray;
import android.view.View;

public class GridLayoutManager extends LinearLayoutManager
{
    public boolean k1;
    public int l1;
    public int[] m1;
    public View[] n1;
    public final SparseIntArray o1;
    public final SparseIntArray p1;
    public GridLayoutManager.GridLayoutManager$c q1;
    public final Rect r1;
    
    public GridLayoutManager(final Context context, final int n) {
        super(context);
        this.k1 = false;
        this.l1 = -1;
        this.o1 = new SparseIntArray();
        this.p1 = new SparseIntArray();
        this.q1 = (GridLayoutManager.GridLayoutManager$c)new GridLayoutManager.GridLayoutManager$a();
        this.r1 = new Rect();
        this.W1(n);
    }
    
    public GridLayoutManager(final Context context, final int n, final int n2, final boolean b) {
        super(1);
        this.k1 = false;
        this.l1 = -1;
        this.o1 = new SparseIntArray();
        this.p1 = new SparseIntArray();
        this.q1 = (GridLayoutManager.GridLayoutManager$c)new GridLayoutManager.GridLayoutManager$a();
        this.r1 = new Rect();
        this.W1(n);
    }
    
    public GridLayoutManager(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.k1 = false;
        this.l1 = -1;
        this.o1 = new SparseIntArray();
        this.p1 = new SparseIntArray();
        this.q1 = (GridLayoutManager.GridLayoutManager$c)new GridLayoutManager.GridLayoutManager$a();
        this.r1 = new Rect();
        this.W1(RecyclerView$m.c0(context, set, n, n2).b);
    }
    
    public final int B(final RecyclerView$y recyclerView$y) {
        return this.j1(recyclerView$y);
    }
    
    public final void B0(final RecyclerView recyclerView, final int n, final int n2) {
        this.q1.e();
        this.q1.d();
    }
    
    public final int C(final RecyclerView$y recyclerView$y) {
        return this.k1(recyclerView$y);
    }
    
    public final void C0(final RecyclerView$t recyclerView$t, final RecyclerView$y recyclerView$y) {
        if (recyclerView$y.g) {
            for (int l = ((RecyclerView$m)this).L(), i = 0; i < l; ++i) {
                final GridLayoutManager.GridLayoutManager$b gridLayoutManager$b = (GridLayoutManager.GridLayoutManager$b)((RecyclerView$m)this).K(i).getLayoutParams();
                final int a = ((RecyclerView$n)gridLayoutManager$b).a();
                this.o1.put(a, gridLayoutManager$b.I0);
                this.p1.put(a, gridLayoutManager$b.H0);
            }
        }
        super.C0(recyclerView$t, recyclerView$y);
        this.o1.clear();
        this.p1.clear();
    }
    
    public final void C1(final RecyclerView$t recyclerView$t, final RecyclerView$y recyclerView$y, final LinearLayoutManager$c linearLayoutManager$c, final LinearLayoutManager$b linearLayoutManager$b) {
        final int j = super.X0.j();
        final boolean b = j != 1073741824;
        int n;
        if (((RecyclerView$m)this).L() > 0) {
            n = this.m1[this.l1];
        }
        else {
            n = 0;
        }
        if (b) {
            this.X1();
        }
        final boolean b2 = linearLayoutManager$c.e == 1;
        int l1 = this.l1;
        if (!b2) {
            l1 = this.S1(recyclerView$t, recyclerView$y, linearLayoutManager$c.d) + this.T1(recyclerView$t, recyclerView$y, linearLayoutManager$c.d);
        }
        int n2;
        for (n2 = 0; n2 < this.l1 && linearLayoutManager$c.b(recyclerView$y) && l1 > 0; ++n2) {
            final int d = linearLayoutManager$c.d;
            final int t1 = this.T1(recyclerView$t, recyclerView$y, d);
            if (t1 > this.l1) {
                throw new IllegalArgumentException(wc0.A(shc.f("Item at position ", d, " requires ", t1, " spans but GridLayoutManager has only "), this.l1, " spans."));
            }
            l1 -= t1;
            if (l1 < 0) {
                break;
            }
            final View c = linearLayoutManager$c.c(recyclerView$t);
            if (c == null) {
                break;
            }
            this.n1[n2] = c;
        }
        if (n2 == 0) {
            linearLayoutManager$b.b = true;
            return;
        }
        int i;
        int n3;
        int h0;
        int n4;
        if (b2) {
            i = 0;
            n3 = n2;
            h0 = 0;
            n4 = 1;
        }
        else {
            i = n2 - 1;
            n3 = -1;
            h0 = 0;
            n4 = -1;
        }
        while (i != n3) {
            final View view = this.n1[i];
            final GridLayoutManager.GridLayoutManager$b gridLayoutManager$b = (GridLayoutManager.GridLayoutManager$b)view.getLayoutParams();
            final int t2 = this.T1(recyclerView$t, recyclerView$y, ((RecyclerView$m)this).b0(view));
            gridLayoutManager$b.I0 = t2;
            gridLayoutManager$b.H0 = h0;
            h0 += t2;
            i += n4;
        }
        float n5 = 0.0f;
        int k = 0;
        int n6 = 0;
        while (k < n2) {
            final View view2 = this.n1[k];
            if (linearLayoutManager$c.k == null) {
                if (b2) {
                    ((RecyclerView$m)this).m(view2);
                }
                else {
                    ((RecyclerView$m)this).n(view2, 0, false);
                }
            }
            else if (b2) {
                ((RecyclerView$m)this).n(view2, -1, true);
            }
            else {
                ((RecyclerView$m)this).n(view2, 0, true);
            }
            ((RecyclerView$m)this).q(view2, this.r1);
            this.U1(view2, j, false);
            final int c2 = super.X0.c(view2);
            int n7 = n6;
            if (c2 > n6) {
                n7 = c2;
            }
            final float n8 = super.X0.d(view2) * 1.0f / ((GridLayoutManager.GridLayoutManager$b)view2.getLayoutParams()).I0;
            float n9 = n5;
            if (n8 > n5) {
                n9 = n8;
            }
            ++k;
            n5 = n9;
            n6 = n7;
        }
        int a = n6;
        if (b) {
            this.O1(Math.max(Math.round(n5 * this.l1), n));
            int n10 = 0;
            int n11 = 0;
            while (true) {
                a = n11;
                if (n10 >= n2) {
                    break;
                }
                final View view3 = this.n1[n10];
                this.U1(view3, 1073741824, true);
                final int c3 = super.X0.c(view3);
                int n12;
                if (c3 > (n12 = n11)) {
                    n12 = c3;
                }
                ++n10;
                n11 = n12;
            }
        }
        for (int n13 = 0; n13 < n2; ++n13) {
            final View view4 = this.n1[n13];
            if (super.X0.c(view4) != a) {
                final GridLayoutManager.GridLayoutManager$b gridLayoutManager$b2 = (GridLayoutManager.GridLayoutManager$b)view4.getLayoutParams();
                final Rect e0 = ((RecyclerView$n)gridLayoutManager$b2).E0;
                final int n14 = e0.top + e0.bottom + ((ViewGroup$MarginLayoutParams)gridLayoutManager$b2).topMargin + ((ViewGroup$MarginLayoutParams)gridLayoutManager$b2).bottomMargin;
                final int n15 = e0.left + e0.right + ((ViewGroup$MarginLayoutParams)gridLayoutManager$b2).leftMargin + ((ViewGroup$MarginLayoutParams)gridLayoutManager$b2).rightMargin;
                final int q1 = this.Q1(gridLayoutManager$b2.H0, gridLayoutManager$b2.I0);
                int n16;
                int n17;
                if (super.V0 == 1) {
                    n16 = RecyclerView$m.M(q1, 1073741824, n15, ((ViewGroup$MarginLayoutParams)gridLayoutManager$b2).width, false);
                    n17 = View$MeasureSpec.makeMeasureSpec(a - n14, 1073741824);
                }
                else {
                    n16 = View$MeasureSpec.makeMeasureSpec(a - n15, 1073741824);
                    n17 = RecyclerView$m.M(q1, 1073741824, n14, ((ViewGroup$MarginLayoutParams)gridLayoutManager$b2).height, false);
                }
                this.V1(view4, n16, n17, true);
            }
        }
        linearLayoutManager$b.a = a;
        int b3;
        int b4;
        int n18;
        int b5;
        if (super.V0 == 1) {
            if (linearLayoutManager$c.f == -1) {
                b3 = linearLayoutManager$c.b;
                b4 = b3 - a;
            }
            else {
                b4 = linearLayoutManager$c.b;
                b3 = a + b4;
            }
            n18 = 0;
            b5 = 0;
        }
        else {
            if (linearLayoutManager$c.f == -1) {
                final int b6;
                b5 = (b6 = linearLayoutManager$c.b) - a;
                n18 = b6;
            }
            else {
                n18 = a + (b5 = linearLayoutManager$c.b);
            }
            b4 = 0;
            b3 = 0;
        }
        for (int n19 = 0; n19 < n2; ++n19) {
            final View view5 = this.n1[n19];
            final GridLayoutManager.GridLayoutManager$b gridLayoutManager$b3 = (GridLayoutManager.GridLayoutManager$b)view5.getLayoutParams();
            if (super.V0 == 1) {
                if (this.B1()) {
                    n18 = ((RecyclerView$m)this).getPaddingLeft() + this.m1[this.l1 - gridLayoutManager$b3.H0];
                    b5 = n18 - super.X0.d(view5);
                }
                else {
                    b5 = this.m1[gridLayoutManager$b3.H0] + ((RecyclerView$m)this).getPaddingLeft();
                    n18 = super.X0.d(view5) + b5;
                }
            }
            else {
                final int n20 = ((RecyclerView$m)this).getPaddingTop() + this.m1[gridLayoutManager$b3.H0];
                final int d2 = super.X0.d(view5);
                b4 = n20;
                b3 = d2 + n20;
            }
            ((RecyclerView$m)this).k0(view5, b5, b4, n18, b3);
            if (((RecyclerView$n)gridLayoutManager$b3).c() || ((RecyclerView$n)gridLayoutManager$b3).b()) {
                linearLayoutManager$b.c = true;
            }
            linearLayoutManager$b.d |= view5.hasFocusable();
        }
        Arrays.fill(this.n1, null);
    }
    
    public final void D0() {
        super.f1 = null;
        super.d1 = -1;
        super.e1 = Integer.MIN_VALUE;
        super.g1.d();
        this.k1 = false;
    }
    
    public final void D1(final RecyclerView$t recyclerView$t, final RecyclerView$y recyclerView$y, final LinearLayoutManager$a linearLayoutManager$a, int i) {
        this.X1();
        if (recyclerView$y.b() > 0 && !recyclerView$y.g) {
            if (i == 1) {
                i = 1;
            }
            else {
                i = 0;
            }
            int j = this.S1(recyclerView$t, recyclerView$y, linearLayoutManager$a.b);
            if (i != 0) {
                while (j > 0) {
                    i = linearLayoutManager$a.b;
                    if (i <= 0) {
                        break;
                    }
                    --i;
                    linearLayoutManager$a.b = i;
                    j = this.S1(recyclerView$t, recyclerView$y, i);
                }
            }
            else {
                int b;
                int n;
                int s1;
                for (b = recyclerView$y.b(), i = linearLayoutManager$a.b; i < b - 1; i = n, j = s1) {
                    n = i + 1;
                    s1 = this.S1(recyclerView$t, recyclerView$y, n);
                    if (s1 <= j) {
                        break;
                    }
                }
                linearLayoutManager$a.b = i;
            }
        }
        this.P1();
    }
    
    public final RecyclerView$n G() {
        if (super.V0 == 0) {
            return (RecyclerView$n)new GridLayoutManager.GridLayoutManager$b(-2, -1);
        }
        return (RecyclerView$n)new GridLayoutManager.GridLayoutManager$b(-1, -2);
    }
    
    public final RecyclerView$n H(final Context context, final AttributeSet set) {
        return (RecyclerView$n)new GridLayoutManager.GridLayoutManager$b(context, set);
    }
    
    public final RecyclerView$n I(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return (RecyclerView$n)new GridLayoutManager.GridLayoutManager$b((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return (RecyclerView$n)new GridLayoutManager.GridLayoutManager$b(viewGroup$LayoutParams);
    }
    
    public final void K1(final boolean b) {
        if (!b) {
            super.K1(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }
    
    public final int O(final RecyclerView$t recyclerView$t, final RecyclerView$y recyclerView$y) {
        if (super.V0 == 1) {
            return this.l1;
        }
        if (recyclerView$y.b() < 1) {
            return 0;
        }
        return this.R1(recyclerView$t, recyclerView$y, recyclerView$y.b() - 1) + 1;
    }
    
    public final void O1(int n) {
        final int[] m1 = this.m1;
        final int l1 = this.l1;
        int i = 1;
        int[] m2 = null;
        Label_0053: {
            if (m1 != null && m1.length == l1 + 1) {
                m2 = m1;
                if (m1[m1.length - 1] == n) {
                    break Label_0053;
                }
            }
            m2 = new int[l1 + 1];
        }
        final int n2 = 0;
        m2[0] = 0;
        final int n3 = n / l1;
        final int n4 = n % l1;
        int n5 = 0;
        n = n2;
        while (i <= l1) {
            n += n4;
            int n6;
            if (n > 0 && l1 - n < n4) {
                n6 = n3 + 1;
                n -= l1;
            }
            else {
                n6 = n3;
            }
            n5 += n6;
            m2[i] = n5;
            ++i;
        }
        this.m1 = m2;
    }
    
    public final void P1() {
        final View[] n1 = this.n1;
        if (n1 == null || n1.length != this.l1) {
            this.n1 = new View[this.l1];
        }
    }
    
    public final int Q1(final int n, final int n2) {
        if (super.V0 == 1 && this.B1()) {
            final int[] m1 = this.m1;
            final int l1 = this.l1;
            return m1[l1 - n] - m1[l1 - n - n2];
        }
        final int[] m2 = this.m1;
        return m2[n2 + n] - m2[n];
    }
    
    public final int R0(int h1, final RecyclerView$t recyclerView$t, final RecyclerView$y recyclerView$y) {
        this.X1();
        this.P1();
        if (super.V0 == 1) {
            h1 = 0;
        }
        else {
            h1 = this.H1(h1, recyclerView$t, recyclerView$y);
        }
        return h1;
    }
    
    public final int R1(final RecyclerView$t recyclerView$t, final RecyclerView$y recyclerView$y, final int n) {
        if (!recyclerView$y.g) {
            return this.q1.a(n, this.l1);
        }
        final int c = recyclerView$t.c(n);
        if (c == -1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot find span size for pre layout position. ");
            sb.append(n);
            Log.w("GridLayoutManager", sb.toString());
            return 0;
        }
        return this.q1.a(c, this.l1);
    }
    
    public final int S1(final RecyclerView$t recyclerView$t, final RecyclerView$y recyclerView$y, final int n) {
        if (!recyclerView$y.g) {
            return this.q1.b(n, this.l1);
        }
        final int value = this.p1.get(n, -1);
        if (value != -1) {
            return value;
        }
        final int c = recyclerView$t.c(n);
        if (c == -1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
            sb.append(n);
            Log.w("GridLayoutManager", sb.toString());
            return 0;
        }
        return this.q1.b(c, this.l1);
    }
    
    public final int T0(final int n, final RecyclerView$t recyclerView$t, final RecyclerView$y recyclerView$y) {
        this.X1();
        this.P1();
        return super.T0(n, recyclerView$t, recyclerView$y);
    }
    
    public final int T1(final RecyclerView$t recyclerView$t, final RecyclerView$y recyclerView$y, final int n) {
        if (!recyclerView$y.g) {
            return this.q1.c(n);
        }
        final int value = this.o1.get(n, -1);
        if (value != -1) {
            return value;
        }
        final int c = recyclerView$t.c(n);
        if (c == -1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
            sb.append(n);
            Log.w("GridLayoutManager", sb.toString());
            return 1;
        }
        return this.q1.c(c);
    }
    
    public final void U1(final View view, int n, final boolean b) {
        final GridLayoutManager.GridLayoutManager$b gridLayoutManager$b = (GridLayoutManager.GridLayoutManager$b)view.getLayoutParams();
        final Rect e0 = ((RecyclerView$n)gridLayoutManager$b).E0;
        final int n2 = e0.top + e0.bottom + ((ViewGroup$MarginLayoutParams)gridLayoutManager$b).topMargin + ((ViewGroup$MarginLayoutParams)gridLayoutManager$b).bottomMargin;
        final int n3 = e0.left + e0.right + ((ViewGroup$MarginLayoutParams)gridLayoutManager$b).leftMargin + ((ViewGroup$MarginLayoutParams)gridLayoutManager$b).rightMargin;
        final int q1 = this.Q1(gridLayoutManager$b.H0, gridLayoutManager$b.I0);
        int n4;
        if (super.V0 == 1) {
            n4 = RecyclerView$m.M(q1, n, n3, ((ViewGroup$MarginLayoutParams)gridLayoutManager$b).width, false);
            n = RecyclerView$m.M(super.X0.l(), ((RecyclerView$m)this).S0, n2, ((ViewGroup$MarginLayoutParams)gridLayoutManager$b).height, true);
        }
        else {
            n = RecyclerView$m.M(q1, n, n2, ((ViewGroup$MarginLayoutParams)gridLayoutManager$b).height, false);
            n4 = RecyclerView$m.M(super.X0.l(), ((RecyclerView$m)this).R0, n3, ((ViewGroup$MarginLayoutParams)gridLayoutManager$b).width, true);
        }
        this.V1(view, n4, n, b);
    }
    
    public final void V1(final View view, final int n, final int n2, final boolean b) {
        final RecyclerView$n recyclerView$n = (RecyclerView$n)view.getLayoutParams();
        boolean b2;
        if (b) {
            b2 = ((RecyclerView$m)this).c1(view, n, n2, recyclerView$n);
        }
        else {
            b2 = ((RecyclerView$m)this).a1(view, n, n2, recyclerView$n);
        }
        if (b2) {
            view.measure(n, n2);
        }
    }
    
    public final void W1(final int l1) {
        if (l1 == this.l1) {
            return;
        }
        this.k1 = true;
        if (l1 >= 1) {
            this.l1 = l1;
            this.q1.e();
            ((RecyclerView$m)this).P0();
            return;
        }
        throw new IllegalArgumentException(udu.z("Span count should be at least 1. Provided ", l1));
    }
    
    public final void X0(final Rect rect, int n, int n2) {
        if (this.m1 == null) {
            super.X0(rect, n, n2);
        }
        final int n3 = ((RecyclerView$m)this).getPaddingRight() + ((RecyclerView$m)this).getPaddingLeft();
        final int n4 = ((RecyclerView$m)this).getPaddingBottom() + ((RecyclerView$m)this).getPaddingTop();
        if (super.V0 == 1) {
            n2 = RecyclerView$m.u(n2, rect.height() + n4, ((RecyclerView$m)this).Z());
            final int[] m1 = this.m1;
            n = RecyclerView$m.u(n, m1[m1.length - 1] + n3, ((RecyclerView$m)this).a0());
        }
        else {
            n = RecyclerView$m.u(n, rect.width() + n3, ((RecyclerView$m)this).a0());
            final int[] m2 = this.m1;
            n2 = RecyclerView$m.u(n2, m2[m2.length - 1] + n4, ((RecyclerView$m)this).Z());
        }
        ((RecyclerView$m)this).W0(n, n2);
    }
    
    public final void X1() {
        int n;
        int n2;
        if (super.V0 == 1) {
            n = ((RecyclerView$m)this).T0 - ((RecyclerView$m)this).getPaddingRight();
            n2 = ((RecyclerView$m)this).getPaddingLeft();
        }
        else {
            n = ((RecyclerView$m)this).U0 - ((RecyclerView$m)this).getPaddingBottom();
            n2 = ((RecyclerView$m)this).getPaddingTop();
        }
        this.O1(n - n2);
    }
    
    public final int e0(final RecyclerView$t recyclerView$t, final RecyclerView$y recyclerView$y) {
        if (super.V0 == 0) {
            return this.l1;
        }
        if (recyclerView$y.b() < 1) {
            return 0;
        }
        return this.R1(recyclerView$t, recyclerView$y, recyclerView$y.b() - 1) + 1;
    }
    
    public final boolean f1() {
        return super.f1 == null && !this.k1;
    }
    
    public final void h1(final RecyclerView$y recyclerView$y, final LinearLayoutManager$c linearLayoutManager$c, final RecyclerView$m$c recyclerView$m$c) {
        int d;
        for (int l1 = this.l1, n = 0; n < this.l1 && linearLayoutManager$c.b(recyclerView$y) && l1 > 0; l1 -= this.q1.c(d), linearLayoutManager$c.d += linearLayoutManager$c.e, ++n) {
            d = linearLayoutManager$c.d;
            ((p$b)recyclerView$m$c).a(d, Math.max(0, linearLayoutManager$c.g));
        }
    }
    
    public final View r0(View view, int l, final RecyclerView$t recyclerView$t, final RecyclerView$y recyclerView$y) {
        final View e = ((RecyclerView$m)this).E(view);
        View view2 = null;
        if (e == null) {
            return null;
        }
        final GridLayoutManager.GridLayoutManager$b gridLayoutManager$b = (GridLayoutManager.GridLayoutManager$b)e.getLayoutParams();
        final int h0 = gridLayoutManager$b.H0;
        final int n = gridLayoutManager$b.I0 + h0;
        if (super.r0(view, l, recyclerView$t, recyclerView$y) == null) {
            return null;
        }
        if (this.l1(l) == 1 != super.a1) {
            l = 1;
        }
        else {
            l = 0;
        }
        int n2;
        int n3;
        if (l != 0) {
            n2 = ((RecyclerView$m)this).L() - 1;
            l = -1;
            n3 = -1;
        }
        else {
            l = ((RecyclerView$m)this).L();
            n2 = 0;
            n3 = 1;
        }
        final boolean b = super.V0 == 1 && this.B1();
        final int r1 = this.R1(recyclerView$t, recyclerView$y, n2);
        int h2 = -1;
        final int n4 = 0;
        int n5 = 0;
        int h3 = -1;
        view = null;
        final int n6 = l;
        int i = n2;
        l = n4;
        while (i != n6) {
            final int r2 = this.R1(recyclerView$t, recyclerView$y, i);
            final View k = ((RecyclerView$m)this).K(i);
            if (k == e) {
                break;
            }
            if (k.hasFocusable() && r2 != r1) {
                if (view2 != null) {
                    break;
                }
            }
            else {
                final GridLayoutManager.GridLayoutManager$b gridLayoutManager$b2 = (GridLayoutManager.GridLayoutManager$b)k.getLayoutParams();
                final int h4 = gridLayoutManager$b2.H0;
                final int n7 = gridLayoutManager$b2.I0 + h4;
                if (k.hasFocusable() && h4 == h0 && n7 == n) {
                    return k;
                }
                boolean b2 = false;
                Label_0491: {
                    Label_0391: {
                        if ((k.hasFocusable() || view2 != null) && (k.hasFocusable() || view != null)) {
                            final int n8 = Math.min(n7, n) - Math.max(h4, h0);
                            Label_0488: {
                                if (k.hasFocusable()) {
                                    if (n8 > l) {
                                        break Label_0391;
                                    }
                                    if (n8 == l && b == h4 > h3) {
                                        break Label_0391;
                                    }
                                }
                                else if (view2 == null && ((((RecyclerView$m)this).H0.b(k) && ((RecyclerView$m)this).I0.b(k)) ^ true)) {
                                    if (n8 <= n5) {
                                        if (n8 != n5 || b != h4 > h2) {
                                            break Label_0488;
                                        }
                                    }
                                    b2 = true;
                                    break Label_0491;
                                }
                            }
                            b2 = false;
                            break Label_0491;
                        }
                    }
                    b2 = true;
                }
                if (b2) {
                    if (k.hasFocusable()) {
                        h3 = gridLayoutManager$b2.H0;
                        l = Math.min(n7, n) - Math.max(h4, h0);
                        view2 = k;
                    }
                    else {
                        h2 = gridLayoutManager$b2.H0;
                        n5 = Math.min(n7, n) - Math.max(h4, h0);
                        view = k;
                    }
                }
            }
            i += n3;
        }
        if (view2 != null) {
            view = view2;
        }
        return view;
    }
    
    public final boolean t(final RecyclerView$n recyclerView$n) {
        return recyclerView$n instanceof GridLayoutManager.GridLayoutManager$b;
    }
    
    public final void v0(final RecyclerView$t recyclerView$t, final RecyclerView$y recyclerView$y, final View view, final mg mg) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof GridLayoutManager.GridLayoutManager$b)) {
            ((RecyclerView$m)this).u0(view, mg);
            return;
        }
        final GridLayoutManager.GridLayoutManager$b gridLayoutManager$b = (GridLayoutManager.GridLayoutManager$b)layoutParams;
        final int r1 = this.R1(recyclerView$t, recyclerView$y, ((RecyclerView$n)gridLayoutManager$b).a());
        if (super.V0 == 0) {
            mg.H((Object)mg$c.a(gridLayoutManager$b.H0, gridLayoutManager$b.I0, r1, 1, false, false));
        }
        else {
            mg.H((Object)mg$c.a(r1, 1, gridLayoutManager$b.H0, gridLayoutManager$b.I0, false, false));
        }
    }
    
    public final void w0(final int n, final int n2) {
        this.q1.e();
        this.q1.d();
    }
    
    public final View w1(final RecyclerView$t recyclerView$t, final RecyclerView$y recyclerView$y, final boolean b, final boolean b2) {
        int l = ((RecyclerView$m)this).L();
        int n = -1;
        int i;
        if (b2) {
            i = ((RecyclerView$m)this).L() - 1;
            l = -1;
        }
        else {
            i = 0;
            n = 1;
        }
        final int b3 = recyclerView$y.b();
        this.m1();
        final int k = super.X0.k();
        final int g = super.X0.g();
        View view = null;
        View view2 = null;
        while (i != l) {
            final View j = ((RecyclerView$m)this).K(i);
            final int b4 = ((RecyclerView$m)this).b0(j);
            View view3 = view;
            View view4 = view2;
            if (b4 >= 0) {
                view3 = view;
                view4 = view2;
                if (b4 < b3) {
                    if (this.S1(recyclerView$t, recyclerView$y, b4) != 0) {
                        view3 = view;
                        view4 = view2;
                    }
                    else if (((RecyclerView$n)j.getLayoutParams()).c()) {
                        view3 = view;
                        if ((view4 = view2) == null) {
                            view4 = j;
                            view3 = view;
                        }
                    }
                    else {
                        if (super.X0.e(j) < g && super.X0.b(j) >= k) {
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
            i += n;
            view = view3;
            view2 = view4;
        }
        if (view == null) {
            view = view2;
        }
        return view;
    }
    
    public final void x0() {
        this.q1.e();
        this.q1.d();
    }
    
    public final int y(final RecyclerView$y recyclerView$y) {
        return this.j1(recyclerView$y);
    }
    
    public final void y0(final int n, final int n2) {
        this.q1.e();
        this.q1.d();
    }
    
    public final int z(final RecyclerView$y recyclerView$y) {
        return this.k1(recyclerView$y);
    }
    
    public final void z0(final int n, final int n2) {
        this.q1.e();
        this.q1.d();
    }
}
