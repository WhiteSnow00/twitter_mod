// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.flexbox;

import java.util.Collections;
import android.util.SparseIntArray;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.Iterator;
import java.util.Arrays;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import java.util.ArrayList;
import android.view.View$MeasureSpec;
import java.util.List;
import android.view.View;

public final class a
{
    public final q6b a;
    public boolean[] b;
    public int[] c;
    public long[] d;
    public long[] e;
    
    public a(final q6b a) {
        this.a = a;
    }
    
    public final void A(final int n, int measuredWidth, final int n2, final View view) {
        final long[] d = this.d;
        if (d != null) {
            d[n] = (((long)measuredWidth & 0xFFFFFFFFL) | (long)n2 << 32);
        }
        final long[] e = this.e;
        if (e != null) {
            measuredWidth = view.getMeasuredWidth();
            e[n] = (((long)measuredWidth & 0xFFFFFFFFL) | (long)view.getMeasuredHeight() << 32);
        }
    }
    
    public final void a(final List<s6b> list, final s6b s6b, final int p4, final int m) {
        s6b.m = m;
        this.a.g(s6b);
        s6b.p = p4;
        list.add(s6b);
    }
    
    public final void b(final a a, final int n, final int n2, final int n3, int flexItemCount, final int n4, List<s6b> a2) {
        final boolean l = this.a.l();
        final int mode = View$MeasureSpec.getMode(n);
        final int size = View$MeasureSpec.getSize(n);
        if (a2 == null) {
            a2 = new ArrayList<s6b>();
        }
        a.a = a2;
        int n5;
        if (n4 == -1) {
            n5 = 1;
        }
        else {
            n5 = 0;
        }
        int n6;
        if (l) {
            n6 = this.a.getPaddingStart();
        }
        else {
            n6 = this.a.getPaddingTop();
        }
        int n7;
        if (l) {
            n7 = this.a.getPaddingEnd();
        }
        else {
            n7 = this.a.getPaddingBottom();
        }
        int n8;
        if (l) {
            n8 = this.a.getPaddingTop();
        }
        else {
            n8 = this.a.getPaddingStart();
        }
        int n9;
        if (l) {
            n9 = this.a.getPaddingBottom();
        }
        else {
            n9 = this.a.getPaddingEnd();
        }
        s6b s6b = new s6b();
        int i = flexItemCount;
        s6b.o = i;
        final int n10 = n6 + n7;
        s6b.e = n10;
        flexItemCount = this.a.getFlexItemCount();
        final int n11 = 0;
        int n12 = 0;
        int b = 0;
        int n13 = Integer.MIN_VALUE;
        final int n14 = n9;
        final int n15 = size;
        int n16 = n11;
        while (i < flexItemCount) {
            final View j = this.a.i(i);
            int max = 0;
            int n32 = 0;
            int n33 = 0;
            int n34 = 0;
            Label_1967: {
                if (j == null) {
                    if (this.s(i, flexItemCount, s6b)) {
                        this.a(a2, s6b, i, n12);
                    }
                }
                else if (j.getVisibility() == 8) {
                    ++s6b.i;
                    ++s6b.h;
                    if (this.s(i, flexItemCount, s6b)) {
                        this.a(a2, s6b, i, n12);
                    }
                }
                else {
                    if (j instanceof CompoundButton) {
                        final CompoundButton compoundButton = (CompoundButton)j;
                        final r6b r6b = (r6b)((View)compoundButton).getLayoutParams();
                        final int x0 = r6b.x0();
                        final int q3 = r6b.q3();
                        final Drawable a3 = if6.a(compoundButton);
                        int minimumWidth;
                        if (a3 == null) {
                            minimumWidth = 0;
                        }
                        else {
                            minimumWidth = a3.getMinimumWidth();
                        }
                        int minimumHeight;
                        if (a3 == null) {
                            minimumHeight = 0;
                        }
                        else {
                            minimumHeight = a3.getMinimumHeight();
                        }
                        int n17 = x0;
                        if (x0 == -1) {
                            n17 = minimumWidth;
                        }
                        r6b.A2(n17);
                        int n18;
                        if ((n18 = q3) == -1) {
                            n18 = minimumHeight;
                        }
                        r6b.V0(n18);
                    }
                    final r6b r6b2 = (r6b)j.getLayoutParams();
                    if (r6b2.p0() == 4) {
                        s6b.n.add(i);
                    }
                    int n19;
                    if (l) {
                        n19 = r6b2.getWidth();
                    }
                    else {
                        n19 = r6b2.getHeight();
                    }
                    int round = n19;
                    if (r6b2.k1() != -1.0f) {
                        round = n19;
                        if (mode == 1073741824) {
                            round = Math.round(r6b2.k1() * n15);
                        }
                    }
                    int n20;
                    if (l) {
                        n20 = this.a.b(n, this.p(r6b2, true) + (this.r(r6b2, true) + n10), round);
                        final int e = this.a.e(n2, this.o(r6b2, true) + (this.q(r6b2, true) + (n8 + n14)) + n12, r6b2.getHeight());
                        j.measure(n20, e);
                        this.A(i, n20, e, j);
                    }
                    else {
                        final int b2 = this.a.b(n2, this.o(r6b2, false) + (this.q(r6b2, false) + (n8 + n14)) + n12, r6b2.getWidth());
                        n20 = this.a.e(n, this.p(r6b2, false) + (this.r(r6b2, false) + n10), round);
                        j.measure(b2, n20);
                        this.A(i, b2, n20, j);
                    }
                    this.a.j(i, j);
                    this.c(j, i);
                    final int combineMeasuredStates = View.combineMeasuredStates(b, j.getMeasuredState());
                    final int e2 = s6b.e;
                    int n21;
                    if (l) {
                        n21 = j.getMeasuredWidth();
                    }
                    else {
                        n21 = j.getMeasuredHeight();
                    }
                    final int n22 = this.p(r6b2, l) + (this.r(r6b2, l) + n21);
                    final int size2 = a2.size();
                    boolean b3 = false;
                    Label_1088: {
                        Label_1004: {
                            if (this.a.getFlexWrap() != 0) {
                                if (!r6b2.u1()) {
                                    if (mode == 0) {
                                        break Label_1004;
                                    }
                                    final int maxLine = this.a.getMaxLine();
                                    if (maxLine != -1 && maxLine <= size2 + 1) {
                                        break Label_1004;
                                    }
                                    final int k = this.a.k(j, i, n16);
                                    int n23 = n22;
                                    if (k > 0) {
                                        n23 = n22 + k;
                                    }
                                    if (n15 >= e2 + n23) {
                                        break Label_1004;
                                    }
                                }
                                b3 = true;
                                break Label_1088;
                            }
                        }
                        b3 = false;
                    }
                    b = combineMeasuredStates;
                    int n25;
                    int n26;
                    if (b3) {
                        if (s6b.h - s6b.i > 0) {
                            int n24;
                            if (i > 0) {
                                n24 = i - 1;
                            }
                            else {
                                n24 = 0;
                            }
                            this.a(a2, s6b, n24, n12);
                            n12 += s6b.g;
                        }
                        if (l) {
                            if (r6b2.getHeight() == -1) {
                                final q6b a4 = this.a;
                                j.measure(n20, a4.e(n2, r6b2.B2() + (r6b2.R0() + (this.a.getPaddingBottom() + a4.getPaddingTop())) + n12, r6b2.getHeight()));
                                this.c(j, i);
                            }
                        }
                        else if (r6b2.getWidth() == -1) {
                            final q6b a5 = this.a;
                            j.measure(a5.b(n2, r6b2.o3() + (r6b2.E2() + (this.a.getPaddingRight() + a5.getPaddingLeft())) + n12, r6b2.getWidth()), n20);
                            this.c(j, i);
                        }
                        s6b = new s6b();
                        s6b.h = 1;
                        s6b.e = n10;
                        s6b.o = i;
                        n25 = 0;
                        n26 = Integer.MIN_VALUE;
                    }
                    else {
                        ++s6b.h;
                        final int n27 = n16 + 1;
                        n26 = n13;
                        n25 = n27;
                    }
                    final ArrayList<s6b> list = a2;
                    s6b.q |= (r6b2.X0() != 0.0f);
                    s6b.r |= (r6b2.q0() != 0.0f);
                    final int[] c = this.c;
                    if (c != null) {
                        c[i] = list.size();
                    }
                    final int e3 = s6b.e;
                    int n28;
                    if (l) {
                        n28 = j.getMeasuredWidth();
                    }
                    else {
                        n28 = j.getMeasuredHeight();
                    }
                    s6b.e = this.p(r6b2, l) + (this.r(r6b2, l) + n28) + e3;
                    s6b.j += r6b2.X0();
                    s6b.k += r6b2.q0();
                    this.a.c(j, i, n25, s6b);
                    int n29;
                    if (l) {
                        n29 = j.getMeasuredHeight();
                    }
                    else {
                        n29 = j.getMeasuredWidth();
                    }
                    max = Math.max(n26, this.a.h(j) + (this.o(r6b2, l) + (this.q(r6b2, l) + n29)));
                    s6b.g = Math.max(s6b.g, max);
                    if (l) {
                        if (this.a.getFlexWrap() != 2) {
                            s6b.l = Math.max(s6b.l, r6b2.R0() + j.getBaseline());
                        }
                        else {
                            s6b.l = Math.max(s6b.l, r6b2.B2() + (j.getMeasuredHeight() - j.getBaseline()));
                        }
                    }
                    final int n30 = flexItemCount;
                    int n31 = n12;
                    if (this.s(i, n30, s6b)) {
                        this.a(list, s6b, i, n12);
                        n31 = n12 + s6b.g;
                    }
                    if (n4 != -1 && list.size() > 0 && ((s6b)list.get(list.size() - 1)).p >= n4 && i >= n4 && n5 == 0) {
                        n31 = -s6b.g;
                        n32 = 1;
                    }
                    else {
                        n32 = n5;
                    }
                    if (n31 > n3 && n32 != 0) {
                        break;
                    }
                    n33 = n25;
                    n34 = n31;
                    break Label_1967;
                }
                final int n35 = n5;
                n33 = n16;
                n34 = n12;
                n32 = n35;
                max = n13;
            }
            ++i;
            final int n36 = n32;
            n16 = n33;
            n12 = n34;
            n13 = max;
            n5 = n36;
        }
        a.b = b;
    }
    
    public final void c(final View view, final int n) {
        final r6b r6b = (r6b)view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        final int measuredHeight = view.getMeasuredHeight();
        final int x0 = r6b.x0();
        int n2 = 1;
        int n4 = 0;
        Label_0083: {
            int n3;
            if (measuredWidth < x0) {
                n3 = r6b.x0();
            }
            else {
                if (measuredWidth <= r6b.M1()) {
                    n4 = 0;
                    break Label_0083;
                }
                n3 = r6b.M1();
            }
            final int n5 = 1;
            measuredWidth = n3;
            n4 = n5;
        }
        int n6;
        if (measuredHeight < r6b.q3()) {
            n6 = r6b.q3();
        }
        else if (measuredHeight > r6b.x3()) {
            n6 = r6b.x3();
        }
        else {
            n2 = n4;
            n6 = measuredHeight;
        }
        if (n2 != 0) {
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(n6, 1073741824);
            view.measure(measureSpec, measureSpec2);
            this.A(n, measureSpec, measureSpec2, view);
            this.a.j(n, view);
        }
    }
    
    public final void d(final List<s6b> list, final int n) {
        int n2;
        if ((n2 = this.c[n]) == -1) {
            n2 = 0;
        }
        for (int i = list.size() - 1; i >= n2; --i) {
            list.remove(i);
        }
        final int[] c = this.c;
        final int n3 = c.length - 1;
        if (n > n3) {
            Arrays.fill(c, -1);
        }
        else {
            Arrays.fill(c, n, n3, -1);
        }
        final long[] d = this.d;
        final int n4 = d.length - 1;
        if (n > n4) {
            Arrays.fill(d, 0L);
        }
        else {
            Arrays.fill(d, n, n4, 0L);
        }
    }
    
    public final List<s6b> e(final List<s6b> list, int i, int size) {
        i = (i - size) / 2;
        final ArrayList list2 = new ArrayList();
        final s6b s6b = new s6b();
        s6b.g = i;
        for (size = list.size(), i = 0; i < size; ++i) {
            if (i == 0) {
                list2.add(s6b);
            }
            list2.add(list.get(i));
            if (i == list.size() - 1) {
                list2.add(s6b);
            }
        }
        return list2;
    }
    
    public final List<b> f(final int n) {
        final ArrayList list = new ArrayList(n);
        for (int i = 0; i < n; ++i) {
            final r6b r6b = (r6b)this.a.d(i).getLayoutParams();
            final b b = new b();
            b.G0 = r6b.getOrder();
            b.F0 = i;
            list.add(b);
        }
        return list;
    }
    
    public final void g(int i, int j, int n) {
        final int flexDirection = this.a.getFlexDirection();
        int mode;
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException(rk0.B("Invalid flex direction: ", flexDirection));
            }
            mode = View$MeasureSpec.getMode(i);
            i = View$MeasureSpec.getSize(i);
        }
        else {
            i = View$MeasureSpec.getMode(j);
            j = View$MeasureSpec.getSize(j);
            mode = i;
            i = j;
        }
        final List flexLinesInternal = this.a.getFlexLinesInternal();
        if (mode == 1073741824) {
            final int n2 = this.a.getSumOfCrossSize() + n;
            final int size = flexLinesInternal.size();
            final int n3 = 0;
            j = 0;
            if (size == 1) {
                ((s6b)flexLinesInternal.get(0)).g = i - n;
            }
            else if (flexLinesInternal.size() >= 2) {
                n = this.a.getAlignContent();
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                if (n == 5) {
                                    if (n2 < i) {
                                        final float n4 = (i - n2) / (float)flexLinesInternal.size();
                                        final int size2 = flexLinesInternal.size();
                                        float n5 = 0.0f;
                                        while (j < size2) {
                                            final s6b s6b = flexLinesInternal.get(j);
                                            float n7;
                                            final float n6 = n7 = s6b.g + n4;
                                            float n8 = n5;
                                            if (j == flexLinesInternal.size() - 1) {
                                                n7 = n6 + n5;
                                                n8 = 0.0f;
                                            }
                                            n = Math.round(n7);
                                            final float n9 = n7 - n + n8;
                                            if (n9 > 1.0f) {
                                                i = n + 1;
                                                n5 = n9 - 1.0f;
                                            }
                                            else {
                                                n5 = n9;
                                                i = n;
                                                if (n9 < -1.0f) {
                                                    i = n - 1;
                                                    n5 = n9 + 1.0f;
                                                }
                                            }
                                            s6b.g = i;
                                            ++j;
                                        }
                                    }
                                }
                            }
                            else if (n2 >= i) {
                                this.a.setFlexLines((List)this.e(flexLinesInternal, i, n2));
                            }
                            else {
                                i = (i - n2) / (flexLinesInternal.size() * 2);
                                final ArrayList flexLines = new ArrayList();
                                final s6b s6b2 = new s6b();
                                s6b2.g = i;
                                for (final s6b s6b3 : flexLinesInternal) {
                                    flexLines.add(s6b2);
                                    flexLines.add(s6b3);
                                    flexLines.add(s6b2);
                                }
                                this.a.setFlexLines((List)flexLines);
                            }
                        }
                        else if (n2 < i) {
                            final float n10 = (i - n2) / (float)(flexLinesInternal.size() - 1);
                            final ArrayList<s6b> flexLines2 = new ArrayList<s6b>();
                            j = flexLinesInternal.size();
                            float n11 = 0.0f;
                            float n12;
                            s6b s6b4;
                            float n13;
                            float n14;
                            for (i = n3; i < j; ++i, n11 = n12) {
                                flexLines2.add(flexLinesInternal.get(i));
                                n12 = n11;
                                if (i != flexLinesInternal.size() - 1) {
                                    s6b4 = new s6b();
                                    if (i == flexLinesInternal.size() - 2) {
                                        s6b4.g = Math.round(n11 + n10);
                                        n11 = 0.0f;
                                    }
                                    else {
                                        s6b4.g = Math.round(n10);
                                    }
                                    n = s6b4.g;
                                    n13 = n10 - n + n11;
                                    if (n13 > 1.0f) {
                                        s6b4.g = n + 1;
                                        n14 = n13 - 1.0f;
                                    }
                                    else {
                                        n14 = n13;
                                        if (n13 < -1.0f) {
                                            s6b4.g = n - 1;
                                            n14 = n13 + 1.0f;
                                        }
                                    }
                                    flexLines2.add(s6b4);
                                    n12 = n14;
                                }
                            }
                            this.a.setFlexLines((List)flexLines2);
                        }
                    }
                    else {
                        this.a.setFlexLines((List)this.e(flexLinesInternal, i, n2));
                    }
                }
                else {
                    final s6b s6b5 = new s6b();
                    s6b5.g = i - n2;
                    flexLinesInternal.add(0, s6b5);
                }
            }
        }
    }
    
    public final void h(final int n, final int n2, int size) {
        final int flexItemCount = this.a.getFlexItemCount();
        final boolean[] b = this.b;
        final int n3 = 0;
        if (b == null) {
            int n4;
            if ((n4 = flexItemCount) < 10) {
                n4 = 10;
            }
            this.b = new boolean[n4];
        }
        else if (b.length < flexItemCount) {
            final int n5 = b.length * 2;
            int n6;
            if (n5 >= (n6 = flexItemCount)) {
                n6 = n5;
            }
            this.b = new boolean[n6];
        }
        else {
            Arrays.fill(b, false);
        }
        if (size >= this.a.getFlexItemCount()) {
            return;
        }
        final int flexDirection = this.a.getFlexDirection();
        final int flexDirection2 = this.a.getFlexDirection();
        int n8;
        int n9;
        int n10;
        if (flexDirection2 != 0 && flexDirection2 != 1) {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException(rk0.B("Invalid flex direction: ", flexDirection));
            }
            final int mode = View$MeasureSpec.getMode(n2);
            int n7 = View$MeasureSpec.getSize(n2);
            if (mode != 1073741824) {
                n7 = this.a.getLargestMainSize();
            }
            n8 = this.a.getPaddingTop();
            n9 = this.a.getPaddingBottom();
            n10 = n7;
        }
        else {
            final int mode2 = View$MeasureSpec.getMode(n);
            final int size2 = View$MeasureSpec.getSize(n);
            int largestMainSize = this.a.getLargestMainSize();
            if (mode2 == 1073741824) {
                largestMainSize = size2;
            }
            else if (largestMainSize > size2) {
                largestMainSize = size2;
            }
            n8 = this.a.getPaddingLeft();
            n9 = this.a.getPaddingRight();
            n10 = largestMainSize;
        }
        final int n11 = n9 + n8;
        final int[] c = this.c;
        int i = n3;
        if (c != null) {
            i = c[size];
        }
        final List flexLinesInternal = this.a.getFlexLinesInternal();
        s6b s6b;
        int e;
        for (size = flexLinesInternal.size(); i < size; ++i) {
            s6b = flexLinesInternal.get(i);
            e = s6b.e;
            if (e < n10 && s6b.q) {
                this.l(n, n2, s6b, n10, n11, false);
            }
            else if (e > n10 && s6b.r) {
                this.v(n, n2, s6b, n10, n11, false);
            }
        }
    }
    
    public final void i(final int n) {
        final int[] c = this.c;
        if (c == null) {
            int n2;
            if ((n2 = n) < 10) {
                n2 = 10;
            }
            this.c = new int[n2];
        }
        else if (c.length < n) {
            final int n3 = c.length * 2;
            int n4;
            if (n3 >= (n4 = n)) {
                n4 = n3;
            }
            this.c = Arrays.copyOf(c, n4);
        }
    }
    
    public final void j(final int n) {
        final long[] d = this.d;
        if (d == null) {
            int n2;
            if ((n2 = n) < 10) {
                n2 = 10;
            }
            this.d = new long[n2];
        }
        else if (d.length < n) {
            final int n3 = d.length * 2;
            int n4;
            if (n3 >= (n4 = n)) {
                n4 = n3;
            }
            this.d = Arrays.copyOf(d, n4);
        }
    }
    
    public final void k(final int n) {
        final long[] e = this.e;
        if (e == null) {
            int n2;
            if ((n2 = n) < 10) {
                n2 = 10;
            }
            this.e = new long[n2];
        }
        else if (e.length < n) {
            final int n3 = e.length * 2;
            int n4;
            if (n3 >= (n4 = n)) {
                n4 = n3;
            }
            this.e = Arrays.copyOf(e, n4);
        }
    }
    
    public final void l(final int n, final int n2, final s6b s6b, final int n3, final int n4, final boolean b) {
        final float j = s6b.j;
        if (j > 0.0f) {
            final int e = s6b.e;
            if (n3 >= e) {
                final float n5 = (n3 - e) / j;
                s6b.e = n4 + s6b.f;
                if (!b) {
                    s6b.g = Integer.MIN_VALUE;
                }
                int i = 0;
                boolean b2 = false;
                int n6 = 0;
                float n7 = 0.0f;
                while (i < s6b.h) {
                    final int n8 = s6b.o + i;
                    final View k = this.a.i(n8);
                    if (k != null && k.getVisibility() != 8) {
                        final r6b r6b = (r6b)k.getLayoutParams();
                        final int flexDirection = this.a.getFlexDirection();
                        int n18;
                        if (flexDirection != 0 && flexDirection != 1) {
                            int n9 = k.getMeasuredHeight();
                            final long[] e2 = this.e;
                            if (e2 != null) {
                                n9 = (int)(e2[n8] >> 32);
                            }
                            int n10 = k.getMeasuredWidth();
                            final long[] e3 = this.e;
                            if (e3 != null) {
                                n10 = (int)e3[n8];
                            }
                            if (!this.b[n8] && r6b.X0() > 0.0f) {
                                final float n11 = r6b.X0() * n5 + n9;
                                float n12 = n7;
                                float n13 = n11;
                                if (i == s6b.h - 1) {
                                    n13 = n11 + n7;
                                    n12 = 0.0f;
                                }
                                int n14 = Math.round(n13);
                                Label_0407: {
                                    if (n14 > r6b.x3()) {
                                        n14 = r6b.x3();
                                        this.b[n8] = true;
                                        s6b.j -= r6b.X0();
                                        b2 = true;
                                        n7 = n12;
                                    }
                                    else {
                                        n7 = n13 - n14 + n12;
                                        final double n15 = n7;
                                        double n16;
                                        if (n15 > 1.0) {
                                            ++n14;
                                            n16 = n15 - 1.0;
                                        }
                                        else {
                                            if (n15 >= -1.0) {
                                                break Label_0407;
                                            }
                                            --n14;
                                            n16 = n15 + 1.0;
                                        }
                                        n7 = (float)n16;
                                    }
                                }
                                final int n17 = this.n(n, r6b, s6b.m);
                                final int measureSpec = View$MeasureSpec.makeMeasureSpec(n14, 1073741824);
                                k.measure(n17, measureSpec);
                                n10 = k.getMeasuredWidth();
                                n9 = k.getMeasuredHeight();
                                this.A(n8, n17, measureSpec, k);
                                this.a.j(n8, k);
                            }
                            final int max = Math.max(n6, this.a.h(k) + (r6b.o3() + (r6b.E2() + n10)));
                            s6b.e += r6b.B2() + (r6b.R0() + n9);
                            n18 = max;
                        }
                        else {
                            int n19 = k.getMeasuredWidth();
                            final long[] e4 = this.e;
                            if (e4 != null) {
                                n19 = (int)e4[n8];
                            }
                            int n20 = k.getMeasuredHeight();
                            final long[] e5 = this.e;
                            if (e5 != null) {
                                n20 = (int)(e5[n8] >> 32);
                            }
                            if (!this.b[n8] && r6b.X0() > 0.0f) {
                                final float n21 = r6b.X0() * n5 + n19;
                                float n22 = n7;
                                float n23 = n21;
                                if (i == s6b.h - 1) {
                                    n23 = n21 + n7;
                                    n22 = 0.0f;
                                }
                                final int round = Math.round(n23);
                                int m1 = 0;
                                Label_0831: {
                                    if (round > r6b.M1()) {
                                        m1 = r6b.M1();
                                        this.b[n8] = true;
                                        s6b.j -= r6b.X0();
                                        b2 = true;
                                        n7 = n22;
                                    }
                                    else {
                                        n7 = n23 - round + n22;
                                        final double n24 = n7;
                                        double n25;
                                        if (n24 > 1.0) {
                                            m1 = round + 1;
                                            n25 = n24 - 1.0;
                                        }
                                        else {
                                            m1 = round;
                                            if (n24 >= -1.0) {
                                                break Label_0831;
                                            }
                                            m1 = round - 1;
                                            n25 = n24 + 1.0;
                                        }
                                        n7 = (float)n25;
                                    }
                                }
                                final int l = this.m(n2, r6b, s6b.m);
                                final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(m1, 1073741824);
                                k.measure(measureSpec2, l);
                                n19 = k.getMeasuredWidth();
                                n20 = k.getMeasuredHeight();
                                this.A(n8, measureSpec2, l, k);
                                this.a.j(n8, k);
                            }
                            final int max2 = Math.max(n6, this.a.h(k) + (r6b.B2() + (r6b.R0() + n20)));
                            s6b.e += r6b.o3() + (r6b.E2() + n19);
                            n18 = max2;
                        }
                        s6b.g = Math.max(s6b.g, n18);
                        n6 = n18;
                    }
                    ++i;
                }
                if (b2 && e != s6b.e) {
                    this.l(n, n2, s6b, n3, n4, true);
                }
            }
        }
    }
    
    public final int m(int n, final r6b r6b, int e) {
        final q6b a = this.a;
        e = a.e(n, r6b.B2() + (r6b.R0() + (this.a.getPaddingBottom() + a.getPaddingTop())) + e, r6b.getHeight());
        final int size = View$MeasureSpec.getSize(e);
        if (size > r6b.x3()) {
            n = View$MeasureSpec.makeMeasureSpec(r6b.x3(), View$MeasureSpec.getMode(e));
        }
        else {
            n = e;
            if (size < r6b.q3()) {
                n = View$MeasureSpec.makeMeasureSpec(r6b.q3(), View$MeasureSpec.getMode(e));
            }
        }
        return n;
    }
    
    public final int n(int n, final r6b r6b, int b) {
        final q6b a = this.a;
        b = a.b(n, r6b.o3() + (r6b.E2() + (this.a.getPaddingRight() + a.getPaddingLeft())) + b, r6b.getWidth());
        final int size = View$MeasureSpec.getSize(b);
        if (size > r6b.M1()) {
            n = View$MeasureSpec.makeMeasureSpec(r6b.M1(), View$MeasureSpec.getMode(b));
        }
        else {
            n = b;
            if (size < r6b.x0()) {
                n = View$MeasureSpec.makeMeasureSpec(r6b.x0(), View$MeasureSpec.getMode(b));
            }
        }
        return n;
    }
    
    public final int o(final r6b r6b, final boolean b) {
        if (b) {
            return r6b.B2();
        }
        return r6b.o3();
    }
    
    public final int p(final r6b r6b, final boolean b) {
        if (b) {
            return r6b.o3();
        }
        return r6b.B2();
    }
    
    public final int q(final r6b r6b, final boolean b) {
        if (b) {
            return r6b.R0();
        }
        return r6b.E2();
    }
    
    public final int r(final r6b r6b, final boolean b) {
        if (b) {
            return r6b.E2();
        }
        return r6b.R0();
    }
    
    public final boolean s(final int n, final int n2, final s6b s6b) {
        boolean b = true;
        if (n != n2 - 1 || s6b.h - s6b.i == 0) {
            b = false;
        }
        return b;
    }
    
    public final void t(final View view, final s6b s6b, final int n, int n2, final int n3, int measuredHeight) {
        final r6b r6b = (r6b)view.getLayoutParams();
        int n4 = this.a.getAlignItems();
        if (r6b.p0() != -1) {
            n4 = r6b.p0();
        }
        final int g = s6b.g;
        if (n4 != 0) {
            if (n4 != 1) {
                if (n4 != 2) {
                    if (n4 != 3) {
                        if (n4 != 4) {
                            return;
                        }
                    }
                    else {
                        if (this.a.getFlexWrap() != 2) {
                            final int max = Math.max(s6b.l - view.getBaseline(), r6b.R0());
                            view.layout(n, n2 + max, n3, measuredHeight + max);
                            return;
                        }
                        final int max2 = Math.max(view.getBaseline() + (s6b.l - view.getMeasuredHeight()), r6b.B2());
                        view.layout(n, n2 - max2, n3, measuredHeight - max2);
                        return;
                    }
                }
                else {
                    measuredHeight = view.getMeasuredHeight();
                    measuredHeight = (r6b.R0() + (g - measuredHeight) - r6b.B2()) / 2;
                    if (this.a.getFlexWrap() != 2) {
                        n2 += measuredHeight;
                        view.layout(n, n2, n3, view.getMeasuredHeight() + n2);
                        return;
                    }
                    n2 -= measuredHeight;
                    view.layout(n, n2, n3, view.getMeasuredHeight() + n2);
                    return;
                }
            }
            else {
                if (this.a.getFlexWrap() != 2) {
                    n2 += g;
                    view.layout(n, n2 - view.getMeasuredHeight() - r6b.B2(), n3, n2 - r6b.B2());
                    return;
                }
                view.layout(n, r6b.R0() + (view.getMeasuredHeight() + (n2 - g)), n3, r6b.R0() + (view.getMeasuredHeight() + (measuredHeight - g)));
                return;
            }
        }
        if (this.a.getFlexWrap() != 2) {
            view.layout(n, r6b.R0() + n2, n3, r6b.R0() + measuredHeight);
        }
        else {
            view.layout(n, n2 - r6b.B2(), n3, measuredHeight - r6b.B2());
        }
    }
    
    public final void u(final View view, final s6b s6b, final boolean b, final int n, final int n2, final int n3, final int n4) {
        final r6b r6b = (r6b)view.getLayoutParams();
        int n5 = this.a.getAlignItems();
        if (r6b.p0() != -1) {
            n5 = r6b.p0();
        }
        final int g = s6b.g;
        if (n5 != 0) {
            if (n5 != 1) {
                if (n5 != 2) {
                    if (n5 != 3 && n5 != 4) {
                        return;
                    }
                }
                else {
                    final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
                    final int n6 = (nlg.c(viewGroup$MarginLayoutParams) + (g - view.getMeasuredWidth()) - nlg.b(viewGroup$MarginLayoutParams)) / 2;
                    if (!b) {
                        view.layout(n + n6, n2, n3 + n6, n4);
                        return;
                    }
                    view.layout(n - n6, n2, n3 - n6, n4);
                    return;
                }
            }
            else {
                if (!b) {
                    view.layout(n + g - view.getMeasuredWidth() - r6b.o3(), n2, n3 + g - view.getMeasuredWidth() - r6b.o3(), n4);
                    return;
                }
                view.layout(r6b.E2() + (view.getMeasuredWidth() + (n - g)), n2, r6b.E2() + (view.getMeasuredWidth() + (n3 - g)), n4);
                return;
            }
        }
        if (!b) {
            view.layout(r6b.E2() + n, n2, r6b.E2() + n3, n4);
        }
        else {
            view.layout(n - r6b.o3(), n2, n3 - r6b.o3(), n4);
        }
    }
    
    public final void v(final int n, final int n2, final s6b s6b, final int n3, final int n4, final boolean b) {
        final int e = s6b.e;
        final float k = s6b.k;
        if (k > 0.0f) {
            if (n3 <= e) {
                final float n5 = (e - n3) / k;
                s6b.e = n4 + s6b.f;
                if (!b) {
                    s6b.g = Integer.MIN_VALUE;
                }
                int i = 0;
                boolean b2 = false;
                int n6 = 0;
                float n7 = 0.0f;
                while (i < s6b.h) {
                    final int n8 = s6b.o + i;
                    final View j = this.a.i(n8);
                    if (j != null) {
                        if (j.getVisibility() != 8) {
                            final r6b r6b = (r6b)j.getLayoutParams();
                            final int flexDirection = this.a.getFlexDirection();
                            int n18;
                            if (flexDirection != 0 && flexDirection != 1) {
                                int n9 = j.getMeasuredHeight();
                                final long[] e2 = this.e;
                                if (e2 != null) {
                                    n9 = (int)(e2[n8] >> 32);
                                }
                                int n10 = j.getMeasuredWidth();
                                final long[] e3 = this.e;
                                if (e3 != null) {
                                    n10 = (int)e3[n8];
                                }
                                if (!this.b[n8] && r6b.q0() > 0.0f) {
                                    final float n11 = n9 - r6b.q0() * n5;
                                    float n12 = n7;
                                    float n13 = n11;
                                    if (i == s6b.h - 1) {
                                        n13 = n11 + n7;
                                        n12 = 0.0f;
                                    }
                                    final int round = Math.round(n13);
                                    int q3;
                                    if (round < r6b.q3()) {
                                        q3 = r6b.q3();
                                        this.b[n8] = true;
                                        s6b.k -= r6b.q0();
                                        b2 = true;
                                    }
                                    else {
                                        final float n14 = n13 - round + n12;
                                        final double n15 = n14;
                                        float n16;
                                        if (n15 > 1.0) {
                                            q3 = round + 1;
                                            n16 = n14 - 1.0f;
                                        }
                                        else {
                                            n16 = n14;
                                            q3 = round;
                                            if (n15 < -1.0) {
                                                q3 = round - 1;
                                                n16 = n14 + 1.0f;
                                            }
                                        }
                                        n12 = n16;
                                    }
                                    final int n17 = this.n(n, r6b, s6b.m);
                                    final int measureSpec = View$MeasureSpec.makeMeasureSpec(q3, 1073741824);
                                    j.measure(n17, measureSpec);
                                    n10 = j.getMeasuredWidth();
                                    n9 = j.getMeasuredHeight();
                                    this.A(n8, n17, measureSpec, j);
                                    this.a.j(n8, j);
                                    n7 = n12;
                                }
                                final int max = Math.max(n6, this.a.h(j) + (r6b.o3() + (r6b.E2() + n10)));
                                s6b.e += r6b.B2() + (r6b.R0() + n9);
                                n18 = max;
                            }
                            else {
                                int n19 = j.getMeasuredWidth();
                                final long[] e4 = this.e;
                                if (e4 != null) {
                                    n19 = (int)e4[n8];
                                }
                                int n20 = j.getMeasuredHeight();
                                final long[] e5 = this.e;
                                if (e5 != null) {
                                    n20 = (int)(e5[n8] >> 32);
                                }
                                if (!this.b[n8] && r6b.q0() > 0.0f) {
                                    float n22;
                                    final float n21 = n22 = n19 - r6b.q0() * n5;
                                    float n23 = n7;
                                    if (i == s6b.h - 1) {
                                        n22 = n21 + n7;
                                        n23 = 0.0f;
                                    }
                                    final int round2 = Math.round(n22);
                                    int x0;
                                    if (round2 < r6b.x0()) {
                                        x0 = r6b.x0();
                                        this.b[n8] = true;
                                        s6b.k -= r6b.q0();
                                        b2 = true;
                                    }
                                    else {
                                        final float n24 = n22 - round2 + n23;
                                        final double n25 = n24;
                                        float n26;
                                        if (n25 > 1.0) {
                                            x0 = round2 + 1;
                                            n26 = n24 - 1.0f;
                                        }
                                        else {
                                            n26 = n24;
                                            x0 = round2;
                                            if (n25 < -1.0) {
                                                x0 = round2 - 1;
                                                n26 = n24 + 1.0f;
                                            }
                                        }
                                        n23 = n26;
                                    }
                                    final int m = this.m(n2, r6b, s6b.m);
                                    final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(x0, 1073741824);
                                    j.measure(measureSpec2, m);
                                    n19 = j.getMeasuredWidth();
                                    n20 = j.getMeasuredHeight();
                                    this.A(n8, measureSpec2, m, j);
                                    this.a.j(n8, j);
                                    n7 = n23;
                                }
                                final int max2 = Math.max(n6, this.a.h(j) + (r6b.B2() + (r6b.R0() + n20)));
                                s6b.e += r6b.o3() + (r6b.E2() + n19);
                                n18 = max2;
                            }
                            s6b.g = Math.max(s6b.g, n18);
                            n6 = n18;
                        }
                    }
                    ++i;
                }
                if (b2 && e != s6b.e) {
                    this.v(n, n2, s6b, n3, n4, true);
                }
            }
        }
    }
    
    public final int[] w(int n, final List<b> list, final SparseIntArray sparseIntArray) {
        Collections.sort((List<Comparable>)list);
        sparseIntArray.clear();
        final int[] array = new int[n];
        final Iterator<Comparable> iterator = (Iterator<Comparable>)list.iterator();
        n = 0;
        while (iterator.hasNext()) {
            final b b = iterator.next();
            sparseIntArray.append(array[n] = b.F0, b.G0);
            ++n;
        }
        return array;
    }
    
    public final void x(final View view, int n, final int n2) {
        final r6b r6b = (r6b)view.getLayoutParams();
        final int min = Math.min(Math.max(n - r6b.E2() - r6b.o3() - this.a.h(view), r6b.x0()), r6b.M1());
        final long[] e = this.e;
        if (e != null) {
            n = (int)(e[n2] >> 32);
        }
        else {
            n = view.getMeasuredHeight();
        }
        n = View$MeasureSpec.makeMeasureSpec(n, 1073741824);
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(measureSpec, n);
        this.A(n2, measureSpec, n, view);
        this.a.j(n2, view);
    }
    
    public final void y(final View view, int n, final int n2) {
        final r6b r6b = (r6b)view.getLayoutParams();
        final int min = Math.min(Math.max(n - r6b.R0() - r6b.B2() - this.a.h(view), r6b.q3()), r6b.x3());
        final long[] e = this.e;
        if (e != null) {
            n = (int)e[n2];
        }
        else {
            n = view.getMeasuredWidth();
        }
        n = View$MeasureSpec.makeMeasureSpec(n, 1073741824);
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(n, measureSpec);
        this.A(n2, n, measureSpec, view);
        this.a.j(n2, view);
    }
    
    public final void z(int i) {
        if (i >= this.a.getFlexItemCount()) {
            return;
        }
        final int flexDirection = this.a.getFlexDirection();
        if (this.a.getAlignItems() == 4) {
            final int[] c = this.c;
            if (c != null) {
                i = c[i];
            }
            else {
                i = 0;
            }
            for (List flexLinesInternal = this.a.getFlexLinesInternal(); i < flexLinesInternal.size(); ++i) {
                final s6b s6b = flexLinesInternal.get(i);
                for (int h = s6b.h, j = 0; j < h; ++j) {
                    final int n = s6b.o + j;
                    if (j < this.a.getFlexItemCount()) {
                        final View k = this.a.i(n);
                        if (k != null) {
                            if (k.getVisibility() != 8) {
                                final r6b r6b = (r6b)k.getLayoutParams();
                                if (r6b.p0() == -1 || r6b.p0() == 4) {
                                    if (flexDirection != 0 && flexDirection != 1) {
                                        if (flexDirection != 2 && flexDirection != 3) {
                                            throw new IllegalArgumentException(rk0.B("Invalid flex direction: ", flexDirection));
                                        }
                                        this.x(k, s6b.g, n);
                                    }
                                    else {
                                        this.y(k, s6b.g, n);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else {
            for (final s6b s6b2 : this.a.getFlexLinesInternal()) {
                for (final Integer n2 : s6b2.n) {
                    final View l = this.a.i((int)n2);
                    if (flexDirection != 0 && flexDirection != 1) {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException(rk0.B("Invalid flex direction: ", flexDirection));
                        }
                        this.x(l, s6b2.g, n2);
                    }
                    else {
                        this.y(l, s6b2.g, n2);
                    }
                }
            }
        }
    }
    
    public static final class a
    {
        public List<s6b> a;
        public int b;
        
        public final void a() {
            this.a = null;
            this.b = 0;
        }
    }
    
    public static final class b implements Comparable<b>
    {
        public int F0;
        public int G0;
        
        @Override
        public final int compareTo(final Object o) {
            final b b = (b)o;
            final int g0 = this.G0;
            final int g2 = b.G0;
            int n;
            if (g0 != g2) {
                n = g0 - g2;
            }
            else {
                n = this.F0 - b.F0;
            }
            return n;
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("Order{order=");
            f.append(this.G0);
            f.append(", index=");
            return gwl.x(f, this.F0, '}');
        }
    }
}
