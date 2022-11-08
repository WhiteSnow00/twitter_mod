// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$MeasureSpec;
import java.util.WeakHashMap;
import java.util.Iterator;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import java.util.List;
import android.util.SparseIntArray;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

public class FlexboxLayout extends ViewGroup implements r6b
{
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public Drawable I0;
    public Drawable J0;
    public int K0;
    public int L0;
    public int M0;
    public int N0;
    public int[] O0;
    public SparseIntArray P0;
    public com.google.android.flexbox.a Q0;
    public List<t6b> R0;
    public a$a S0;
    
    public FlexboxLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public FlexboxLayout(final Context context, final AttributeSet set, int n) {
        super(context, set, n);
        this.H0 = -1;
        this.Q0 = new com.google.android.flexbox.a((r6b)this);
        this.R0 = new ArrayList<t6b>();
        this.S0 = new a$a();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, cli.F0, n, 0);
        this.C0 = obtainStyledAttributes.getInt(5, 0);
        this.D0 = obtainStyledAttributes.getInt(6, 0);
        this.E0 = obtainStyledAttributes.getInt(7, 0);
        this.F0 = obtainStyledAttributes.getInt(1, 0);
        this.G0 = obtainStyledAttributes.getInt(0, 0);
        this.H0 = obtainStyledAttributes.getInt(8, -1);
        final Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            this.setDividerDrawableHorizontal(drawable);
            this.setDividerDrawableVertical(drawable);
        }
        final Drawable drawable2 = obtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            this.setDividerDrawableHorizontal(drawable2);
        }
        final Drawable drawable3 = obtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            this.setDividerDrawableVertical(drawable3);
        }
        n = obtainStyledAttributes.getInt(9, 0);
        if (n != 0) {
            this.L0 = n;
            this.K0 = n;
        }
        n = obtainStyledAttributes.getInt(11, 0);
        if (n != 0) {
            this.L0 = n;
        }
        n = obtainStyledAttributes.getInt(10, 0);
        if (n != 0) {
            this.K0 = n;
        }
        obtainStyledAttributes.recycle();
    }
    
    public final void a(final Canvas canvas, final boolean b, final boolean b2) {
        final int paddingLeft = ((View)this).getPaddingLeft();
        final int max = Math.max(0, ((View)this).getWidth() - ((View)this).getPaddingRight() - paddingLeft);
        for (int size = this.R0.size(), i = 0; i < size; ++i) {
            final t6b t6b = this.R0.get(i);
            for (int j = 0; j < t6b.h; ++j) {
                final int n = t6b.o + j;
                final View o = this.o(n);
                if (o != null) {
                    if (o.getVisibility() != 8) {
                        final a a = (a)o.getLayoutParams();
                        if (this.p(n, j)) {
                            int n2;
                            if (b) {
                                n2 = o.getRight() + a.rightMargin;
                            }
                            else {
                                n2 = o.getLeft() - a.leftMargin - this.N0;
                            }
                            this.n(canvas, n2, t6b.b, t6b.g);
                        }
                        if (j == t6b.h - 1 && (this.L0 & 0x4) > 0) {
                            int n3;
                            if (b) {
                                n3 = o.getLeft() - a.leftMargin - this.N0;
                            }
                            else {
                                n3 = o.getRight() + a.rightMargin;
                            }
                            this.n(canvas, n3, t6b.b, t6b.g);
                        }
                    }
                }
            }
            if (this.q(i)) {
                int d;
                if (b2) {
                    d = t6b.d;
                }
                else {
                    d = t6b.b - this.M0;
                }
                this.m(canvas, paddingLeft, d, max);
            }
            if (this.r(i) && (this.K0 & 0x4) > 0) {
                int d2;
                if (b2) {
                    d2 = t6b.b - this.M0;
                }
                else {
                    d2 = t6b.d;
                }
                this.m(canvas, paddingLeft, d2, max);
            }
        }
    }
    
    public final void addView(final View view, final int c0, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (this.P0 == null) {
            this.P0 = new SparseIntArray(this.getChildCount());
        }
        final com.google.android.flexbox.a q0 = this.Q0;
        final SparseIntArray p3 = this.P0;
        final int flexItemCount = q0.a.getFlexItemCount();
        final List f = q0.f(flexItemCount);
        final a$b a$b = new a$b();
        if (view != null && viewGroup$LayoutParams instanceof s6b) {
            a$b.D0 = ((s6b)viewGroup$LayoutParams).getOrder();
        }
        else {
            a$b.D0 = 1;
        }
        if (c0 != -1 && c0 != flexItemCount) {
            if (c0 < q0.a.getFlexItemCount()) {
                a$b.C0 = c0;
                for (int i = c0; i < flexItemCount; ++i) {
                    final a$b a$b2 = ((ArrayList<a$b>)f).get(i);
                    ++a$b2.C0;
                }
            }
            else {
                a$b.C0 = flexItemCount;
            }
        }
        else {
            a$b.C0 = flexItemCount;
        }
        ((ArrayList<a$b>)f).add(a$b);
        this.O0 = q0.w(flexItemCount + 1, f, p3);
        super.addView(view, c0, viewGroup$LayoutParams);
    }
    
    public final int b(final int n, final int n2, final int n3) {
        return ViewGroup.getChildMeasureSpec(n, n2, n3);
    }
    
    public final void c(final View view, int n, int n2, final t6b t6b) {
        if (this.p(n, n2)) {
            if (this.l()) {
                n = t6b.e;
                n2 = this.N0;
                t6b.e = n + n2;
                t6b.f += n2;
            }
            else {
                n = t6b.e;
                n2 = this.M0;
                t6b.e = n + n2;
                t6b.f += n2;
            }
        }
    }
    
    public final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof a;
    }
    
    public final View d(final int n) {
        return this.getChildAt(n);
    }
    
    public final int e(final int n, final int n2, final int n3) {
        return ViewGroup.getChildMeasureSpec(n, n2, n3);
    }
    
    public final void f(final Canvas canvas, final boolean b, final boolean b2) {
        final int paddingTop = ((View)this).getPaddingTop();
        final int max = Math.max(0, ((View)this).getHeight() - ((View)this).getPaddingBottom() - paddingTop);
        for (int size = this.R0.size(), i = 0; i < size; ++i) {
            final t6b t6b = this.R0.get(i);
            for (int j = 0; j < t6b.h; ++j) {
                final int n = t6b.o + j;
                final View o = this.o(n);
                if (o != null) {
                    if (o.getVisibility() != 8) {
                        final a a = (a)o.getLayoutParams();
                        if (this.p(n, j)) {
                            int n2;
                            if (b2) {
                                n2 = o.getBottom() + a.bottomMargin;
                            }
                            else {
                                n2 = o.getTop() - a.topMargin - this.M0;
                            }
                            this.m(canvas, t6b.a, n2, t6b.g);
                        }
                        if (j == t6b.h - 1 && (this.K0 & 0x4) > 0) {
                            int n3;
                            if (b2) {
                                n3 = o.getTop() - a.topMargin - this.M0;
                            }
                            else {
                                n3 = o.getBottom() + a.bottomMargin;
                            }
                            this.m(canvas, t6b.a, n3, t6b.g);
                        }
                    }
                }
            }
            if (this.q(i)) {
                int c;
                if (b) {
                    c = t6b.c;
                }
                else {
                    c = t6b.a - this.N0;
                }
                this.n(canvas, c, paddingTop, max);
            }
            if (this.r(i) && (this.L0 & 0x4) > 0) {
                int c2;
                if (b) {
                    c2 = t6b.a - this.N0;
                }
                else {
                    c2 = t6b.c;
                }
                this.n(canvas, c2, paddingTop, max);
            }
        }
    }
    
    public final void g(final t6b t6b) {
        if (this.l()) {
            if ((this.L0 & 0x4) > 0) {
                final int e = t6b.e;
                final int n0 = this.N0;
                t6b.e = e + n0;
                t6b.f += n0;
            }
        }
        else if ((this.K0 & 0x4) > 0) {
            final int e2 = t6b.e;
            final int m0 = this.M0;
            t6b.e = e2 + m0;
            t6b.f += m0;
        }
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new a(((View)this).getContext(), set);
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof a) {
            return (ViewGroup$LayoutParams)new a((a)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return (ViewGroup$LayoutParams)new a((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return (ViewGroup$LayoutParams)new a(viewGroup$LayoutParams);
    }
    
    public int getAlignContent() {
        return this.G0;
    }
    
    public int getAlignItems() {
        return this.F0;
    }
    
    public Drawable getDividerDrawableHorizontal() {
        return this.I0;
    }
    
    public Drawable getDividerDrawableVertical() {
        return this.J0;
    }
    
    public int getFlexDirection() {
        return this.C0;
    }
    
    public int getFlexItemCount() {
        return this.getChildCount();
    }
    
    public List<t6b> getFlexLines() {
        final ArrayList list = new ArrayList(this.R0.size());
        for (final t6b t6b : this.R0) {
            if (t6b.h - t6b.i == 0) {
                continue;
            }
            list.add(t6b);
        }
        return list;
    }
    
    public List<t6b> getFlexLinesInternal() {
        return this.R0;
    }
    
    public int getFlexWrap() {
        return this.D0;
    }
    
    public int getJustifyContent() {
        return this.E0;
    }
    
    public int getLargestMainSize() {
        final Iterator<t6b> iterator = this.R0.iterator();
        int max = Integer.MIN_VALUE;
        while (iterator.hasNext()) {
            max = Math.max(max, iterator.next().e);
        }
        return max;
    }
    
    public int getMaxLine() {
        return this.H0;
    }
    
    public int getShowDividerHorizontal() {
        return this.K0;
    }
    
    public int getShowDividerVertical() {
        return this.L0;
    }
    
    public int getSumOfCrossSize() {
        final int size = this.R0.size();
        int i = 0;
        int n = 0;
        while (i < size) {
            final t6b t6b = this.R0.get(i);
            int n2 = n;
            if (this.q(i)) {
                int n3;
                if (this.l()) {
                    n3 = this.M0;
                }
                else {
                    n3 = this.N0;
                }
                n2 = n + n3;
            }
            int n4 = n2;
            if (this.r(i)) {
                int n5;
                if (this.l()) {
                    n5 = this.M0;
                }
                else {
                    n5 = this.N0;
                }
                n4 = n2 + n5;
            }
            n = n4 + t6b.g;
            ++i;
        }
        return n;
    }
    
    public final int h(final View view) {
        return 0;
    }
    
    public final View i(final int n) {
        return this.o(n);
    }
    
    public final void j(final int n, final View view) {
    }
    
    public final int k(final View view, int n, final int n2) {
        final boolean l = this.l();
        final int n3 = 0;
        int n4 = 0;
        if (l) {
            if (this.p(n, n2)) {
                n4 = 0 + this.N0;
            }
            n = n4;
            if ((this.L0 & 0x4) <= 0) {
                return n;
            }
            n = this.N0;
        }
        else {
            n4 = n3;
            if (this.p(n, n2)) {
                n4 = 0 + this.M0;
            }
            n = n4;
            if ((this.K0 & 0x4) <= 0) {
                return n;
            }
            n = this.M0;
        }
        n += n4;
        return n;
    }
    
    public final boolean l() {
        final int c0 = this.C0;
        boolean b = true;
        if (c0 != 0) {
            b = (c0 == 1 && b);
        }
        return b;
    }
    
    public final void m(final Canvas canvas, final int n, final int n2, final int n3) {
        final Drawable i0 = this.I0;
        if (i0 == null) {
            return;
        }
        i0.setBounds(n, n2, n3 + n, this.M0 + n2);
        this.I0.draw(canvas);
    }
    
    public final void n(final Canvas canvas, final int n, final int n2, final int n3) {
        final Drawable j0 = this.J0;
        if (j0 == null) {
            return;
        }
        j0.setBounds(n, n2, this.N0 + n, n3 + n2);
        this.J0.draw(canvas);
    }
    
    public final View o(final int n) {
        if (n >= 0) {
            final int[] o0 = this.O0;
            if (n < o0.length) {
                return this.getChildAt(o0[n]);
            }
        }
        return null;
    }
    
    public final void onDraw(final Canvas canvas) {
        if (this.J0 == null && this.I0 == null) {
            return;
        }
        if (this.K0 == 0 && this.L0 == 0) {
            return;
        }
        final WeakHashMap a = p5x.a;
        final int d = p5x$e.d((View)this);
        final int c0 = this.C0;
        boolean b = false;
        final boolean b2 = false;
        final boolean b3 = false;
        boolean b4 = true;
        if (c0 != 0) {
            if (c0 != 1) {
                if (c0 != 2) {
                    if (c0 == 3) {
                        boolean b5 = b3;
                        if (d == 1) {
                            b5 = true;
                        }
                        boolean b6 = b5;
                        if (this.D0 == 2) {
                            b6 = (b5 ^ true);
                        }
                        this.f(canvas, b6, true);
                    }
                }
                else {
                    if (d != 1) {
                        b4 = false;
                    }
                    boolean b7 = b4;
                    if (this.D0 == 2) {
                        b7 = (b4 ^ true);
                    }
                    this.f(canvas, b7, false);
                }
            }
            else {
                final boolean b8 = d != 1;
                if (this.D0 == 2) {
                    b = true;
                }
                this.a(canvas, b8, b);
            }
        }
        else {
            final boolean b9 = d == 1;
            boolean b10 = b2;
            if (this.D0 == 2) {
                b10 = true;
            }
            this.a(canvas, b9, b10);
        }
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final WeakHashMap a = p5x.a;
        final int d = p5x$e.d((View)this);
        final int c0 = this.C0;
        final boolean b2 = false;
        boolean b3 = false;
        if (c0 != 0) {
            if (c0 != 1) {
                if (c0 != 2) {
                    if (c0 != 3) {
                        final StringBuilder g = w48.g("Invalid flex direction is set: ");
                        g.append(this.C0);
                        throw new IllegalStateException(g.toString());
                    }
                    if (d == 1) {
                        b3 = true;
                    }
                    boolean b4 = b3;
                    if (this.D0 == 2) {
                        b4 = (b3 ^ true);
                    }
                    this.t(b4, true, n, n2, n3, n4);
                }
                else {
                    boolean b5 = b2;
                    if (d == 1) {
                        b5 = true;
                    }
                    boolean b6 = b5;
                    if (this.D0 == 2) {
                        b6 = (b5 ^ true);
                    }
                    this.t(b6, false, n, n2, n3, n4);
                }
            }
            else {
                this.s(d != 1, n, n2, n3, n4);
            }
        }
        else {
            this.s(d == 1, n, n2, n3, n4);
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        if (this.P0 == null) {
            this.P0 = new SparseIntArray(this.getChildCount());
        }
        final com.google.android.flexbox.a q0 = this.Q0;
        final SparseIntArray p2 = this.P0;
        final int flexItemCount = q0.a.getFlexItemCount();
        boolean b = false;
        Label_0126: {
            Label_0111: {
                if (p2.size() == flexItemCount) {
                    for (int i = 0; i < flexItemCount; ++i) {
                        final View d = q0.a.d(i);
                        if (d != null) {
                            if (((s6b)d.getLayoutParams()).getOrder() != p2.get(i)) {
                                break Label_0111;
                            }
                        }
                    }
                    b = false;
                    break Label_0126;
                }
            }
            b = true;
        }
        if (b) {
            final com.google.android.flexbox.a q2 = this.Q0;
            final SparseIntArray p3 = this.P0;
            final int flexItemCount2 = q2.a.getFlexItemCount();
            this.O0 = q2.w(flexItemCount2, q2.f(flexItemCount2), p3);
        }
        final int c0 = this.C0;
        if (c0 != 0 && c0 != 1) {
            if (c0 != 2 && c0 != 3) {
                final StringBuilder g = w48.g("Invalid value for the flex direction is set: ");
                g.append(this.C0);
                throw new IllegalStateException(g.toString());
            }
            this.R0.clear();
            this.S0.a();
            this.Q0.b(this.S0, n2, n, Integer.MAX_VALUE, 0, -1, (List)null);
            this.R0 = this.S0.a;
            this.Q0.h(n, n2, 0);
            this.Q0.g(n, n2, ((View)this).getPaddingRight() + ((View)this).getPaddingLeft());
            this.Q0.z(0);
            this.u(this.C0, n, n2, this.S0.b);
        }
        else {
            this.R0.clear();
            this.S0.a();
            this.Q0.b(this.S0, n, n2, Integer.MAX_VALUE, 0, -1, (List)null);
            this.R0 = this.S0.a;
            this.Q0.h(n, n2, 0);
            if (this.F0 == 3) {
                for (final t6b t6b : this.R0) {
                    int g2 = Integer.MIN_VALUE;
                    int n3;
                    for (int j = 0; j < t6b.h; ++j, g2 = n3) {
                        final View o = this.o(t6b.o + j);
                        n3 = g2;
                        if (o != null) {
                            if (o.getVisibility() == 8) {
                                n3 = g2;
                            }
                            else {
                                final a a = (a)o.getLayoutParams();
                                if (this.D0 != 2) {
                                    n3 = Math.max(g2, o.getMeasuredHeight() + Math.max(t6b.l - o.getBaseline(), a.topMargin) + a.bottomMargin);
                                }
                                else {
                                    n3 = Math.max(g2, o.getMeasuredHeight() + a.topMargin + Math.max(o.getBaseline() + (t6b.l - o.getMeasuredHeight()), a.bottomMargin));
                                }
                            }
                        }
                    }
                    t6b.g = g2;
                }
            }
            this.Q0.g(n, n2, ((View)this).getPaddingBottom() + ((View)this).getPaddingTop());
            this.Q0.z(0);
            this.u(this.C0, n, n2, this.S0.b);
        }
    }
    
    public final boolean p(int n, final int n2) {
        final boolean b = true;
        final boolean b2 = true;
        final boolean b3 = true;
        boolean b4 = true;
        int i = 1;
        while (true) {
            while (i <= n2) {
                final View o = this.o(n - i);
                if (o != null && o.getVisibility() != 8) {
                    n = 0;
                    if (n != 0) {
                        if (this.l()) {
                            if ((this.L0 & 0x1) == 0x0) {
                                b4 = false;
                            }
                            return b4;
                        }
                        return (this.K0 & 0x1) != 0x0 && b;
                    }
                    else {
                        if (this.l()) {
                            return (this.L0 & 0x2) != 0x0 && b2;
                        }
                        return (this.K0 & 0x2) != 0x0 && b3;
                    }
                }
                else {
                    ++i;
                }
            }
            n = 1;
            continue;
        }
    }
    
    public final boolean q(int n) {
        final boolean b = false;
        final boolean b2 = false;
        final boolean b3 = false;
        final boolean b4 = false;
        boolean b5 = b3;
        if (n >= 0) {
            if (n < this.R0.size()) {
                int i = 0;
                while (true) {
                    while (i < n) {
                        final t6b t6b = this.R0.get(i);
                        if (t6b.h - t6b.i > 0) {
                            n = 0;
                            if (n != 0) {
                                if (this.l()) {
                                    boolean b6 = b4;
                                    if ((this.K0 & 0x1) != 0x0) {
                                        b6 = true;
                                    }
                                    return b6;
                                }
                                boolean b7 = b;
                                if ((this.L0 & 0x1) != 0x0) {
                                    b7 = true;
                                }
                                return b7;
                            }
                            else {
                                if (this.l()) {
                                    boolean b8 = b2;
                                    if ((this.K0 & 0x2) != 0x0) {
                                        b8 = true;
                                    }
                                    return b8;
                                }
                                b5 = b3;
                                if ((this.L0 & 0x2) != 0x0) {
                                    b5 = true;
                                    return b5;
                                }
                                return b5;
                            }
                        }
                        else {
                            ++i;
                        }
                    }
                    n = 1;
                    continue;
                }
            }
            b5 = b3;
        }
        return b5;
    }
    
    public final boolean r(int i) {
        final boolean b = false;
        final boolean b2 = false;
        boolean b3 = b;
        if (i >= 0) {
            if (i >= this.R0.size()) {
                b3 = b;
            }
            else {
                ++i;
                while (i < this.R0.size()) {
                    final t6b t6b = this.R0.get(i);
                    if (t6b.h - t6b.i > 0) {
                        return false;
                    }
                    ++i;
                }
                if (this.l()) {
                    boolean b4 = b2;
                    if ((this.K0 & 0x4) != 0x0) {
                        b4 = true;
                    }
                    return b4;
                }
                b3 = b;
                if ((this.L0 & 0x4) != 0x0) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    public final void s(final boolean b, int n, int i, int n2, int j) {
        final int paddingLeft = ((View)this).getPaddingLeft();
        final int paddingRight = ((View)this).getPaddingRight();
        final int n3 = n2 - n;
        n2 = j - i - ((View)this).getPaddingBottom();
        i = ((View)this).getPaddingTop();
        final int size = this.R0.size();
        j = 0;
        n = paddingLeft;
        while (j < size) {
            final t6b t6b = this.R0.get(j);
            int n4 = n2;
            int n5 = i;
            if (this.q(j)) {
                final int m0 = this.M0;
                n4 = n2 - m0;
                n5 = i + m0;
            }
            i = this.E0;
            float n8 = 0.0f;
            float n10 = 0.0f;
            float n11 = 0.0f;
            Label_0451: {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                final float n6 = (float)n;
                                i = t6b.h - t6b.i;
                                float n7;
                                if (i != 1) {
                                    n7 = (float)(i - 1);
                                }
                                else {
                                    n7 = 1.0f;
                                }
                                n8 = (n3 - t6b.e) / n7;
                                final float n9 = (float)(n3 - paddingRight);
                                n10 = n6;
                                n11 = n9;
                                break Label_0451;
                            }
                            if (i == 4) {
                                i = t6b.h - t6b.i;
                                if (i != 0) {
                                    n8 = (n3 - t6b.e) / (float)i;
                                }
                                else {
                                    n8 = 0.0f;
                                }
                                final float n12 = (float)n;
                                final float n13 = n8 / 2.0f;
                                n10 = n12 + n13;
                                n11 = n3 - paddingRight - n13;
                                break Label_0451;
                            }
                            if (i == 5) {
                                i = t6b.h - t6b.i;
                                if (i != 0) {
                                    n8 = (n3 - t6b.e) / (float)(i + 1);
                                }
                                else {
                                    n8 = 0.0f;
                                }
                                n10 = n + n8;
                                n11 = n3 - paddingRight - n8;
                                break Label_0451;
                            }
                            final StringBuilder g = w48.g("Invalid justifyContent is set: ");
                            g.append(this.E0);
                            throw new IllegalStateException(g.toString());
                        }
                        else {
                            final float n14 = (float)n;
                            i = t6b.e;
                            final float n15 = (n3 - i) / 2.0f;
                            n11 = n3 - paddingRight - (n3 - i) / 2.0f;
                            n10 = n15 + n14;
                        }
                    }
                    else {
                        i = t6b.e;
                        n10 = (float)(n3 - i + paddingRight);
                        n11 = (float)(i - n);
                    }
                }
                else {
                    n10 = (float)n;
                    n11 = (float)(n3 - paddingRight);
                }
                n8 = 0.0f;
            }
            final float max = Math.max(n8, 0.0f);
            View o;
            a a;
            float n16;
            float n17;
            float n18;
            float n19;
            int n20;
            float n21;
            float n22;
            float n23;
            float n24;
            float n25;
            float n26;
            for (i = 0; i < t6b.h; ++i) {
                n2 = t6b.o + i;
                o = this.o(n2);
                if (o != null) {
                    if (o.getVisibility() != 8) {
                        a = (a)o.getLayoutParams();
                        n16 = n10 + a.leftMargin;
                        n17 = n11 - a.rightMargin;
                        if (this.p(n2, i)) {
                            n2 = this.N0;
                            n18 = (float)n2;
                            n19 = n16 + n18;
                            n17 -= n18;
                        }
                        else {
                            n19 = n16;
                            n2 = 0;
                        }
                        if (i == t6b.h - 1 && (this.L0 & 0x4) > 0) {
                            n20 = this.N0;
                        }
                        else {
                            n20 = 0;
                        }
                        if (this.D0 == 2) {
                            if (b) {
                                this.Q0.t(o, t6b, Math.round(n17) - o.getMeasuredWidth(), n4 - o.getMeasuredHeight(), Math.round(n17), n4);
                            }
                            else {
                                this.Q0.t(o, t6b, Math.round(n19), n4 - o.getMeasuredHeight(), o.getMeasuredWidth() + Math.round(n19), n4);
                            }
                        }
                        else if (b) {
                            this.Q0.t(o, t6b, Math.round(n17) - o.getMeasuredWidth(), n5, Math.round(n17), o.getMeasuredHeight() + n5);
                        }
                        else {
                            this.Q0.t(o, t6b, Math.round(n19), n5, o.getMeasuredWidth() + Math.round(n19), o.getMeasuredHeight() + n5);
                        }
                        n21 = (float)o.getMeasuredWidth();
                        n22 = (float)a.rightMargin;
                        n23 = (float)o.getMeasuredWidth();
                        n24 = (float)a.leftMargin;
                        if (b) {
                            t6b.a(o, n20, 0, n2, 0);
                        }
                        else {
                            t6b.a(o, n2, 0, n20, 0);
                        }
                        n25 = n21 + max + n22 + n19;
                        n26 = n17 - (n23 + max + n24);
                        n10 = n25;
                        n11 = n26;
                    }
                }
            }
            n2 = t6b.g;
            i = n5 + n2;
            n2 = n4 - n2;
            ++j;
        }
    }
    
    public void setAlignContent(final int g0) {
        if (this.G0 != g0) {
            this.G0 = g0;
            ((View)this).requestLayout();
        }
    }
    
    public void setAlignItems(final int f0) {
        if (this.F0 != f0) {
            this.F0 = f0;
            ((View)this).requestLayout();
        }
    }
    
    public void setDividerDrawable(final Drawable drawable) {
        this.setDividerDrawableHorizontal(drawable);
        this.setDividerDrawableVertical(drawable);
    }
    
    public void setDividerDrawableHorizontal(final Drawable i0) {
        if (i0 == this.I0) {
            return;
        }
        if ((this.I0 = i0) != null) {
            this.M0 = i0.getIntrinsicHeight();
        }
        else {
            this.M0 = 0;
        }
        if (this.I0 == null && this.J0 == null) {
            ((View)this).setWillNotDraw(true);
        }
        else {
            ((View)this).setWillNotDraw(false);
        }
        ((View)this).requestLayout();
    }
    
    public void setDividerDrawableVertical(final Drawable j0) {
        if (j0 == this.J0) {
            return;
        }
        if ((this.J0 = j0) != null) {
            this.N0 = j0.getIntrinsicWidth();
        }
        else {
            this.N0 = 0;
        }
        if (this.I0 == null && this.J0 == null) {
            ((View)this).setWillNotDraw(true);
        }
        else {
            ((View)this).setWillNotDraw(false);
        }
        ((View)this).requestLayout();
    }
    
    public void setFlexDirection(final int c0) {
        if (this.C0 != c0) {
            this.C0 = c0;
            ((View)this).requestLayout();
        }
    }
    
    public void setFlexLines(final List<t6b> r0) {
        this.R0 = r0;
    }
    
    public void setFlexWrap(final int d0) {
        if (this.D0 != d0) {
            this.D0 = d0;
            ((View)this).requestLayout();
        }
    }
    
    public void setJustifyContent(final int e0) {
        if (this.E0 != e0) {
            this.E0 = e0;
            ((View)this).requestLayout();
        }
    }
    
    public void setMaxLine(final int h0) {
        if (this.H0 != h0) {
            this.H0 = h0;
            ((View)this).requestLayout();
        }
    }
    
    public void setShowDivider(final int n) {
        this.setShowDividerVertical(n);
        this.setShowDividerHorizontal(n);
    }
    
    public void setShowDividerHorizontal(final int k0) {
        if (k0 != this.K0) {
            this.K0 = k0;
            ((View)this).requestLayout();
        }
    }
    
    public void setShowDividerVertical(final int l0) {
        if (l0 != this.L0) {
            this.L0 = l0;
            ((View)this).requestLayout();
        }
    }
    
    public final void t(final boolean b, final boolean b2, int i, int m0, int j, int n0) {
        final int paddingTop = ((View)this).getPaddingTop();
        final int paddingBottom = ((View)this).getPaddingBottom();
        final int paddingRight = ((View)this).getPaddingRight();
        final int paddingLeft = ((View)this).getPaddingLeft();
        final int n2 = n0 - m0;
        i = j - i - paddingRight;
        final int size = this.R0.size();
        j = 0;
        m0 = paddingLeft;
        while (j < size) {
            final t6b t6b = this.R0.get(j);
            int n3 = m0;
            n0 = i;
            if (this.q(j)) {
                n0 = this.N0;
                n3 = m0 + n0;
                n0 = i - n0;
            }
            i = this.E0;
            float n6 = 0.0f;
            float n7 = 0.0f;
            float n10 = 0.0f;
            Label_0463: {
                Label_0460: {
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                final float n4 = (float)paddingTop;
                                i = t6b.e;
                                final float n5 = (n2 - i) / 2.0f;
                                n6 = n2 - paddingBottom - (n2 - i) / 2.0f;
                                n7 = n5 + n4;
                                break Label_0460;
                            }
                            if (i == 3) {
                                final float n8 = (float)paddingTop;
                                i = t6b.h - t6b.i;
                                float n9;
                                if (i != 1) {
                                    n9 = (float)(i - 1);
                                }
                                else {
                                    n9 = 1.0f;
                                }
                                n10 = (n2 - t6b.e) / n9;
                                final float n11 = (float)(n2 - paddingBottom);
                                n7 = n8;
                                n6 = n11;
                                break Label_0463;
                            }
                            if (i == 4) {
                                i = t6b.h - t6b.i;
                                if (i != 0) {
                                    n10 = (n2 - t6b.e) / (float)i;
                                }
                                else {
                                    n10 = 0.0f;
                                }
                                final float n12 = (float)paddingTop;
                                final float n13 = n10 / 2.0f;
                                n7 = n12 + n13;
                                n6 = n2 - paddingBottom - n13;
                                break Label_0463;
                            }
                            if (i == 5) {
                                i = t6b.h - t6b.i;
                                if (i != 0) {
                                    n10 = (n2 - t6b.e) / (float)(i + 1);
                                }
                                else {
                                    n10 = 0.0f;
                                }
                                n7 = paddingTop + n10;
                                n6 = n2 - paddingBottom - n10;
                                break Label_0463;
                            }
                            final StringBuilder g = w48.g("Invalid justifyContent is set: ");
                            g.append(this.E0);
                            throw new IllegalStateException(g.toString());
                        }
                        else {
                            i = t6b.e;
                            n7 = (float)(n2 - i + paddingBottom);
                            i -= paddingTop;
                        }
                    }
                    else {
                        n7 = (float)paddingTop;
                        i = n2 - paddingBottom;
                    }
                    n6 = (float)i;
                }
                n10 = 0.0f;
            }
            final float max = Math.max(n10, 0.0f);
            View o;
            a a;
            float n14;
            float n15;
            float n16;
            float n17;
            int m2;
            float n18;
            float n19;
            float n20;
            float n21;
            float n22;
            float n23;
            for (i = 0; i < t6b.h; ++i) {
                m0 = t6b.o + i;
                o = this.o(m0);
                if (o != null) {
                    if (o.getVisibility() != 8) {
                        a = (a)o.getLayoutParams();
                        n14 = n7 + a.topMargin;
                        n15 = n6 - a.bottomMargin;
                        if (this.p(m0, i)) {
                            m0 = this.M0;
                            n16 = (float)m0;
                            n17 = n14 + n16;
                            n15 -= n16;
                        }
                        else {
                            n17 = n14;
                            m0 = 0;
                        }
                        if (i == t6b.h - 1 && (this.K0 & 0x4) > 0) {
                            m2 = this.M0;
                        }
                        else {
                            m2 = 0;
                        }
                        if (b) {
                            if (b2) {
                                this.Q0.u(o, t6b, true, n0 - o.getMeasuredWidth(), Math.round(n15) - o.getMeasuredHeight(), n0, Math.round(n15));
                            }
                            else {
                                this.Q0.u(o, t6b, true, n0 - o.getMeasuredWidth(), Math.round(n17), n0, o.getMeasuredHeight() + Math.round(n17));
                            }
                        }
                        else if (b2) {
                            this.Q0.u(o, t6b, false, n3, Math.round(n15) - o.getMeasuredHeight(), o.getMeasuredWidth() + n3, Math.round(n15));
                        }
                        else {
                            this.Q0.u(o, t6b, false, n3, Math.round(n17), o.getMeasuredWidth() + n3, o.getMeasuredHeight() + Math.round(n17));
                        }
                        n18 = (float)o.getMeasuredHeight();
                        n19 = (float)a.bottomMargin;
                        n20 = (float)o.getMeasuredHeight();
                        n21 = (float)a.topMargin;
                        if (b2) {
                            t6b.a(o, 0, m2, 0, m0);
                        }
                        else {
                            t6b.a(o, 0, m0, 0, m2);
                        }
                        n22 = n18 + max + n19 + n17;
                        n23 = n15 - (n20 + max + n21);
                        n7 = n22;
                        n6 = n23;
                    }
                }
            }
            i = t6b.g;
            m0 = n3 + i;
            i = n0 - i;
            ++j;
        }
    }
    
    public final void u(int n, int n2, final int n3, int n4) {
        final int mode = View$MeasureSpec.getMode(n2);
        final int size = View$MeasureSpec.getSize(n2);
        final int mode2 = View$MeasureSpec.getMode(n3);
        final int size2 = View$MeasureSpec.getSize(n3);
        int largestMainSize;
        if (n != 0 && n != 1) {
            if (n != 2 && n != 3) {
                throw new IllegalArgumentException(yk.y("Invalid flex direction: ", n));
            }
            n = this.getLargestMainSize();
            largestMainSize = ((View)this).getPaddingRight() + (((View)this).getPaddingLeft() + this.getSumOfCrossSize());
        }
        else {
            final int sumOfCrossSize = this.getSumOfCrossSize();
            n = ((View)this).getPaddingTop();
            n = ((View)this).getPaddingBottom() + (n + sumOfCrossSize);
            largestMainSize = this.getLargestMainSize();
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    throw new IllegalStateException(yk.y("Unknown width mode is set: ", mode));
                }
                int combineMeasuredStates = n4;
                if (size < largestMainSize) {
                    combineMeasuredStates = View.combineMeasuredStates(n4, 16777216);
                }
                n2 = View.resolveSizeAndState(size, n2, combineMeasuredStates);
                n4 = combineMeasuredStates;
            }
            else {
                n2 = View.resolveSizeAndState(largestMainSize, n2, n4);
            }
        }
        else {
            if (size < largestMainSize) {
                n4 = View.combineMeasuredStates(n4, 16777216);
                largestMainSize = size;
            }
            n2 = View.resolveSizeAndState(largestMainSize, n2, n4);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    throw new IllegalStateException(yk.y("Unknown height mode is set: ", mode2));
                }
                int combineMeasuredStates2 = n4;
                if (size2 < n) {
                    combineMeasuredStates2 = View.combineMeasuredStates(n4, 256);
                }
                n = View.resolveSizeAndState(size2, n3, combineMeasuredStates2);
            }
            else {
                n = View.resolveSizeAndState(n, n3, n4);
            }
        }
        else {
            if (size2 < n) {
                n4 = View.combineMeasuredStates(n4, 256);
                n = size2;
            }
            n = View.resolveSizeAndState(n, n3, n4);
        }
        ((View)this).setMeasuredDimension(n2, n);
    }
    
    public static final class a extends ViewGroup$MarginLayoutParams implements s6b
    {
        public static final Parcelable$Creator<a> CREATOR;
        public int C0;
        public float D0;
        public float E0;
        public int F0;
        public float G0;
        public int H0;
        public int I0;
        public int J0;
        public int K0;
        public boolean L0;
        
        static {
            CREATOR = (Parcelable$Creator)new FlexboxLayout$a$a();
        }
        
        public a(final Context context, final AttributeSet set) {
            super(context, set);
            this.C0 = 1;
            this.D0 = 0.0f;
            this.E0 = 1.0f;
            this.F0 = -1;
            this.G0 = -1.0f;
            this.H0 = -1;
            this.I0 = -1;
            this.J0 = 16777215;
            this.K0 = 16777215;
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, cli.G0);
            this.C0 = obtainStyledAttributes.getInt(8, 1);
            this.D0 = obtainStyledAttributes.getFloat(2, 0.0f);
            this.E0 = obtainStyledAttributes.getFloat(3, 1.0f);
            this.F0 = obtainStyledAttributes.getInt(0, -1);
            this.G0 = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
            this.H0 = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            this.I0 = obtainStyledAttributes.getDimensionPixelSize(6, -1);
            this.J0 = obtainStyledAttributes.getDimensionPixelSize(5, 16777215);
            this.K0 = obtainStyledAttributes.getDimensionPixelSize(4, 16777215);
            this.L0 = obtainStyledAttributes.getBoolean(9, false);
            obtainStyledAttributes.recycle();
        }
        
        public a(final Parcel parcel) {
            boolean l0 = false;
            super(0, 0);
            this.C0 = 1;
            this.D0 = 0.0f;
            this.E0 = 1.0f;
            this.F0 = -1;
            this.G0 = -1.0f;
            this.H0 = -1;
            this.I0 = -1;
            this.J0 = 16777215;
            this.K0 = 16777215;
            this.C0 = parcel.readInt();
            this.D0 = parcel.readFloat();
            this.E0 = parcel.readFloat();
            this.F0 = parcel.readInt();
            this.G0 = parcel.readFloat();
            this.H0 = parcel.readInt();
            this.I0 = parcel.readInt();
            this.J0 = parcel.readInt();
            this.K0 = parcel.readInt();
            if (parcel.readByte() != 0) {
                l0 = true;
            }
            this.L0 = l0;
            super.bottomMargin = parcel.readInt();
            super.leftMargin = parcel.readInt();
            super.rightMargin = parcel.readInt();
            super.topMargin = parcel.readInt();
            super.height = parcel.readInt();
            super.width = parcel.readInt();
        }
        
        public a(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.C0 = 1;
            this.D0 = 0.0f;
            this.E0 = 1.0f;
            this.F0 = -1;
            this.G0 = -1.0f;
            this.H0 = -1;
            this.I0 = -1;
            this.J0 = 16777215;
            this.K0 = 16777215;
        }
        
        public a(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super(viewGroup$MarginLayoutParams);
            this.C0 = 1;
            this.D0 = 0.0f;
            this.E0 = 1.0f;
            this.F0 = -1;
            this.G0 = -1.0f;
            this.H0 = -1;
            this.I0 = -1;
            this.J0 = 16777215;
            this.K0 = 16777215;
        }
        
        public a(final a a) {
            super((ViewGroup$MarginLayoutParams)a);
            this.C0 = 1;
            this.D0 = 0.0f;
            this.E0 = 1.0f;
            this.F0 = -1;
            this.G0 = -1.0f;
            this.H0 = -1;
            this.I0 = -1;
            this.J0 = 16777215;
            this.K0 = 16777215;
            this.C0 = a.C0;
            this.D0 = a.D0;
            this.E0 = a.E0;
            this.F0 = a.F0;
            this.G0 = a.G0;
            this.H0 = a.H0;
            this.I0 = a.I0;
            this.J0 = a.J0;
            this.K0 = a.K0;
            this.L0 = a.L0;
        }
        
        public final void A2(final int h0) {
            this.H0 = h0;
        }
        
        public final int B2() {
            return super.bottomMargin;
        }
        
        public final int E2() {
            return super.leftMargin;
        }
        
        public final int M1() {
            return this.J0;
        }
        
        public final int R0() {
            return super.topMargin;
        }
        
        public final void V0(final int i0) {
            this.I0 = i0;
        }
        
        public final float X0() {
            return this.D0;
        }
        
        public final int describeContents() {
            return 0;
        }
        
        public final int getHeight() {
            return super.height;
        }
        
        public final int getOrder() {
            return this.C0;
        }
        
        public final int getWidth() {
            return super.width;
        }
        
        public final float k1() {
            return this.G0;
        }
        
        public final int o3() {
            return super.rightMargin;
        }
        
        public final int p0() {
            return this.F0;
        }
        
        public final float q0() {
            return this.E0;
        }
        
        public final int q3() {
            return this.I0;
        }
        
        public final boolean u1() {
            return this.L0;
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeInt(this.C0);
            parcel.writeFloat(this.D0);
            parcel.writeFloat(this.E0);
            parcel.writeInt(this.F0);
            parcel.writeFloat(this.G0);
            parcel.writeInt(this.H0);
            parcel.writeInt(this.I0);
            parcel.writeInt(this.J0);
            parcel.writeInt(this.K0);
            parcel.writeByte((byte)(byte)(this.L0 ? 1 : 0));
            parcel.writeInt(super.bottomMargin);
            parcel.writeInt(super.leftMargin);
            parcel.writeInt(super.rightMargin);
            parcel.writeInt(super.topMargin);
            parcel.writeInt(super.height);
            parcel.writeInt(super.width);
        }
        
        public final int x0() {
            return this.H0;
        }
        
        public final int x3() {
            return this.K0;
        }
    }
}
