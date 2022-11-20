// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import android.annotation.TargetApi;
import android.content.res.TypedArray;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;
import android.content.res.Resources$NotFoundException;
import java.util.Iterator;
import android.util.Log;
import android.graphics.Paint;
import java.util.Objects;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import java.util.HashMap;
import java.util.ArrayList;
import android.view.View;
import android.util.SparseArray;
import android.view.ViewGroup;

public class ConstraintLayout extends ViewGroup
{
    public static dyp U0;
    public SparseArray<View> D0;
    public ArrayList<androidx.constraintlayout.widget.a> E0;
    public oi6 F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public boolean K0;
    public int L0;
    public b M0;
    public ii6 N0;
    public int O0;
    public HashMap<String, Integer> P0;
    public SparseArray<ni6> Q0;
    public ConstraintLayout.ConstraintLayout$b R0;
    public int S0;
    public int T0;
    
    public ConstraintLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.D0 = (SparseArray<View>)new SparseArray();
        this.E0 = new ArrayList<androidx.constraintlayout.widget.a>(4);
        this.F0 = new oi6();
        this.G0 = 0;
        this.H0 = 0;
        this.I0 = Integer.MAX_VALUE;
        this.J0 = Integer.MAX_VALUE;
        this.K0 = true;
        this.L0 = 257;
        this.M0 = null;
        this.N0 = null;
        this.O0 = -1;
        this.P0 = new HashMap<String, Integer>();
        this.Q0 = (SparseArray<ni6>)new SparseArray();
        this.R0 = new ConstraintLayout.ConstraintLayout$b(this, this);
        this.S0 = 0;
        this.r(set, this.T0 = 0);
    }
    
    public ConstraintLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.D0 = (SparseArray<View>)new SparseArray();
        this.E0 = new ArrayList<androidx.constraintlayout.widget.a>(4);
        this.F0 = new oi6();
        this.G0 = 0;
        this.H0 = 0;
        this.I0 = Integer.MAX_VALUE;
        this.J0 = Integer.MAX_VALUE;
        this.K0 = true;
        this.L0 = 257;
        this.M0 = null;
        this.N0 = null;
        this.O0 = -1;
        this.P0 = new HashMap<String, Integer>();
        this.Q0 = (SparseArray<ni6>)new SparseArray();
        this.R0 = new ConstraintLayout.ConstraintLayout$b(this, this);
        this.S0 = 0;
        this.T0 = 0;
        this.r(set, n);
    }
    
    private int getPaddingWidth() {
        int n = Math.max(0, ((View)this).getPaddingRight()) + Math.max(0, ((View)this).getPaddingLeft());
        final int n2 = Math.max(0, ((View)this).getPaddingEnd()) + Math.max(0, ((View)this).getPaddingStart());
        if (n2 > 0) {
            n = n2;
        }
        return n;
    }
    
    public static dyp getSharedValues() {
        if (ConstraintLayout.U0 == null) {
            ConstraintLayout.U0 = new dyp();
        }
        return ConstraintLayout.U0;
    }
    
    public final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof a;
    }
    
    public void dispatchDraw(final Canvas canvas) {
        final ArrayList<androidx.constraintlayout.widget.a> e0 = this.E0;
        if (e0 != null) {
            final int size = e0.size();
            if (size > 0) {
                for (int i = 0; i < size; ++i) {
                    Objects.requireNonNull(this.E0.get(i));
                }
            }
        }
        super.dispatchDraw(canvas);
        if (((View)this).isInEditMode()) {
            final float n = (float)((View)this).getWidth();
            final float n2 = (float)((View)this).getHeight();
            for (int childCount = this.getChildCount(), j = 0; j < childCount; ++j) {
                final View child = this.getChildAt(j);
                if (child.getVisibility() != 8) {
                    final Object tag = child.getTag();
                    if (tag != null && tag instanceof String) {
                        final String[] split = ((String)tag).split(",");
                        if (split.length == 4) {
                            final int int1 = Integer.parseInt(split[0]);
                            final int int2 = Integer.parseInt(split[1]);
                            final int int3 = Integer.parseInt(split[2]);
                            final int int4 = Integer.parseInt(split[3]);
                            final int n3 = (int)(int1 / 1080.0f * n);
                            final int n4 = (int)(int2 / 1920.0f * n2);
                            final int n5 = (int)(int3 / 1080.0f * n);
                            final int n6 = (int)(int4 / 1920.0f * n2);
                            final Paint paint = new Paint();
                            paint.setColor(-65536);
                            final float n7 = (float)n3;
                            final float n8 = (float)n4;
                            final float n9 = (float)(n3 + n5);
                            canvas.drawLine(n7, n8, n9, n8, paint);
                            final float n10 = (float)(n4 + n6);
                            canvas.drawLine(n9, n8, n9, n10, paint);
                            canvas.drawLine(n9, n10, n7, n10, paint);
                            canvas.drawLine(n7, n10, n7, n8, paint);
                            paint.setColor(-16711936);
                            canvas.drawLine(n7, n8, n9, n10, paint);
                            canvas.drawLine(n7, n10, n9, n8, paint);
                        }
                    }
                }
            }
        }
    }
    
    public final void forceLayout() {
        this.K0 = true;
        super.forceLayout();
    }
    
    public final void g(final boolean b, final View h0, final ni6 ni6, final a a, final SparseArray<ni6> sparseArray) {
        final ni6$a g0 = ni6$a.G0;
        final ni6$a e0 = ni6$a.E0;
        final ni6$a d0 = ni6$a.D0;
        final ni6$a f0 = ni6$a.F0;
        final ei6$a f2 = ei6$a.F0;
        final ei6$a d2 = ei6$a.D0;
        final ei6$a g2 = ei6$a.G0;
        final ei6$a e2 = ei6$a.E0;
        a.a();
        ni6.i0 = h0.getVisibility();
        if (a.f0) {
            ni6.F = true;
            ni6.i0 = 8;
        }
        ni6.h0 = h0;
        if (h0 instanceof androidx.constraintlayout.widget.a) {
            ((androidx.constraintlayout.widget.a)h0).p(ni6, this.F0.z0);
        }
    Label_1391_Outer:
        while (true) {
            int n;
            int o0;
            String substring2;
            String substring3;
            if (a.d0) {
                final bac bac = (bac)ni6;
                n = a.n0;
                o0 = a.o0;
                final float p5 = a.p0;
                final float n2 = fcmpl(p5, -1.0f);
                if (n2 != 0) {
                    if (n2 > 0) {
                        bac.u0 = p5;
                        bac.v0 = -1;
                        bac.w0 = -1;
                    }
                    return;
                }
                else if (n != -1) {
                    if (n > -1) {
                        bac.u0 = -1.0f;
                        bac.v0 = n;
                        bac.w0 = -1;
                    }
                    return;
                }
                else {
                    if (o0 != -1 && o0 > -1) {
                        bac.u0 = -1.0f;
                        bac.v0 = -1;
                        bac.w0 = o0;
                    }
                    return;
                }
            }
            else {
                final int g3 = a.g0;
                final int h2 = a.h0;
                final int i0 = a.i0;
                final int j0 = a.j0;
                final int k0 = a.k0;
                final int l0 = a.l0;
                final float m0 = a.m0;
                final int p6 = a.p;
                if (p6 != -1) {
                    final ni6 ni7 = (ni6)sparseArray.get(p6);
                    if (ni7 != null) {
                        final float r = a.r;
                        final int q = a.q;
                        final ei6$a i2 = ei6$a.I0;
                        ni6.C(i2, ni7, i2, q, 0);
                        ni6.D = r;
                    }
                }
                else {
                    if (g3 != -1) {
                        final ni6 ni8 = (ni6)sparseArray.get(g3);
                        if (ni8 != null) {
                            ni6.C(d2, ni8, d2, a.leftMargin, k0);
                        }
                    }
                    else if (h2 != -1) {
                        final ni6 ni9 = (ni6)sparseArray.get(h2);
                        if (ni9 != null) {
                            ni6.C(d2, ni9, f2, a.leftMargin, k0);
                        }
                    }
                    if (i0 != -1) {
                        final ni6 ni10 = (ni6)sparseArray.get(i0);
                        if (ni10 != null) {
                            ni6.C(f2, ni10, d2, a.rightMargin, l0);
                        }
                    }
                    else if (j0 != -1) {
                        final ni6 ni11 = (ni6)sparseArray.get(j0);
                        if (ni11 != null) {
                            ni6.C(f2, ni11, f2, a.rightMargin, l0);
                        }
                    }
                    final int i3 = a.i;
                    if (i3 != -1) {
                        final ni6 ni12 = (ni6)sparseArray.get(i3);
                        if (ni12 != null) {
                            ni6.C(e2, ni12, e2, a.topMargin, a.x);
                        }
                    }
                    else {
                        final int j2 = a.j;
                        if (j2 != -1) {
                            final ni6 ni13 = (ni6)sparseArray.get(j2);
                            if (ni13 != null) {
                                ni6.C(e2, ni13, g2, a.topMargin, a.x);
                            }
                        }
                    }
                    final int k2 = a.k;
                    if (k2 != -1) {
                        final ni6 ni14 = (ni6)sparseArray.get(k2);
                        if (ni14 != null) {
                            ni6.C(g2, ni14, e2, a.bottomMargin, a.z);
                        }
                    }
                    else {
                        final int l2 = a.l;
                        if (l2 != -1) {
                            final ni6 ni15 = (ni6)sparseArray.get(l2);
                            if (ni15 != null) {
                                ni6.C(g2, ni15, g2, a.bottomMargin, a.z);
                            }
                        }
                    }
                    final int m2 = a.m;
                    if (m2 != -1) {
                        this.y(ni6, a, sparseArray, m2, ei6$a.H0);
                    }
                    else {
                        final int n3 = a.n;
                        if (n3 != -1) {
                            this.y(ni6, a, sparseArray, n3, e2);
                        }
                        else {
                            final int o2 = a.o;
                            if (o2 != -1) {
                                this.y(ni6, a, sparseArray, o2, g2);
                            }
                        }
                    }
                    if (m0 >= 0.0f) {
                        ni6.f0 = m0;
                    }
                    final float f3 = a.F;
                    if (f3 >= 0.0f) {
                        ni6.g0 = f3;
                    }
                }
                n = -1;
                if (b) {
                    final int t = a.T;
                    if (t != -1 || a.U != -1) {
                        final int u = a.U;
                        ni6.a0 = t;
                        ni6.b0 = u;
                    }
                }
                final boolean a2 = a.a0;
                o0 = 0;
                if (!a2) {
                    if (a.width == -1) {
                        if (a.W) {
                            ni6.T(f0);
                        }
                        else {
                            ni6.T(g0);
                        }
                        ni6.n(d2).g = a.leftMargin;
                        ni6.n(f2).g = a.rightMargin;
                    }
                    else {
                        ni6.T(f0);
                        ni6.X(0);
                    }
                }
                else {
                    ni6.T(d0);
                    ni6.X(a.width);
                    if (a.width == -2) {
                        ni6.T(e0);
                    }
                }
                if (!a.b0) {
                    if (a.height == -1) {
                        if (a.X) {
                            ni6.W(f0);
                        }
                        else {
                            ni6.W(g0);
                        }
                        ni6.n(e2).g = a.topMargin;
                        ni6.n(g2).g = a.bottomMargin;
                    }
                    else {
                        ni6.W(f0);
                        ni6.S(0);
                    }
                }
                else {
                    ni6.W(d0);
                    ni6.S(a.height);
                    if (a.height == -2) {
                        ni6.W(e0);
                    }
                }
                final String g4 = a.G;
                if (g4 == null || g4.length() == 0) {
                    break Label_1391_Outer;
                }
                final int length = g4.length();
                int index = g4.indexOf(44);
                if (index > 0 && index < length - 1) {
                    final String substring = g4.substring(0, index);
                    if (substring.equalsIgnoreCase("W")) {
                        n = 0;
                    }
                    else if (substring.equalsIgnoreCase("H")) {
                        n = 1;
                    }
                    ++index;
                }
                else {
                    index = 0;
                }
                final int index2 = g4.indexOf(58);
                if (index2 < 0 || index2 >= length - 1) {
                    break Label_1391_Outer;
                }
                substring2 = g4.substring(index, index2);
                substring3 = g4.substring(index2 + 1);
                if (substring2.length() <= 0 || substring3.length() <= 0) {
                    break Label_1361;
                }
            }
            try {
                final float float1 = Float.parseFloat(substring2);
                final float float2 = Float.parseFloat(substring3);
            Block_57_Outer:
                while (true) {
                    while (true) {
                        while (true) {
                            float y = 0.0f;
                            Label_1364: {
                                if (float1 > 0.0f && float2 > 0.0f) {
                                    if (n == 1) {
                                        y = Math.abs(float2 / float1);
                                    }
                                    else {
                                        y = Math.abs(float1 / float2);
                                    }
                                    break Label_1364;
                                }
                                y = 0.0f;
                            }
                            if (y > 0.0f) {
                                ni6.Y = y;
                                ni6.Z = n;
                            }
                            final float h3 = a.H;
                            final float[] n4 = ni6.n0;
                            n4[0] = h3;
                            n4[1] = a.I;
                            ni6.l0 = a.J;
                            ni6.m0 = a.K;
                            n = a.Z;
                            if (n >= 0 && n <= 3) {
                                ni6.q = n;
                            }
                            final int l3 = a.L;
                            n = a.N;
                            final int p7 = a.P;
                            final float r2 = a.R;
                            ni6.r = l3;
                            ni6.u = n;
                            if ((n = p7) == Integer.MAX_VALUE) {
                                n = 0;
                            }
                            ni6.v = n;
                            ni6.w = r2;
                            if (r2 > 0.0f && r2 < 1.0f && l3 == 0) {
                                ni6.r = 2;
                            }
                            final int m3 = a.M;
                            final int o3 = a.O;
                            n = a.Q;
                            final float s = a.S;
                            ni6.s = m3;
                            ni6.x = o3;
                            if (n == Integer.MAX_VALUE) {
                                n = o0;
                            }
                            ni6.y = n;
                            ni6.z = s;
                            if (s > 0.0f && s < 1.0f && m3 == 0) {
                                ni6.s = 2;
                            }
                            return;
                            final String substring4;
                            y = Float.parseFloat(substring4);
                            continue Label_1391_Outer;
                        }
                        final String g4;
                        final int index;
                        final String substring4 = g4.substring(index);
                        iftrue(Label_1361:)(substring4.length() <= 0);
                        continue;
                    }
                    ni6.Y = 0.0f;
                    continue Block_57_Outer;
                }
            }
            catch (final NumberFormatException ex) {
                continue;
            }
            break;
        }
    }
    
    public final /* bridge */ ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)this.h();
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new a(((View)this).getContext(), set);
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new a(viewGroup$LayoutParams);
    }
    
    public int getMaxHeight() {
        return this.J0;
    }
    
    public int getMaxWidth() {
        return this.I0;
    }
    
    public int getMinHeight() {
        return this.H0;
    }
    
    public int getMinWidth() {
        return this.G0;
    }
    
    public int getOptimizationLevel() {
        return this.F0.H0;
    }
    
    public String getSceneString() {
        final StringBuilder sb = new StringBuilder();
        if (((ni6)this.F0).j == null) {
            final int id = ((View)this).getId();
            if (id != -1) {
                ((ni6)this.F0).j = ((View)this).getContext().getResources().getResourceEntryName(id);
            }
            else {
                ((ni6)this.F0).j = "parent";
            }
        }
        final oi6 f0 = this.F0;
        if (((ni6)f0).j0 == null) {
            ((ni6)f0).j0 = ((ni6)f0).j;
            final StringBuilder j = fu8.j(" setDebugName ");
            j.append(((ni6)this.F0).j0);
            Log.v("ConstraintLayout", j.toString());
        }
        for (final ni6 ni6 : this.F0.u0) {
            final View view = (View)ni6.h0;
            if (view != null) {
                if (ni6.j == null) {
                    final int id2 = view.getId();
                    if (id2 != -1) {
                        ni6.j = ((View)this).getContext().getResources().getResourceEntryName(id2);
                    }
                }
                if (ni6.j0 != null) {
                    continue;
                }
                ni6.j0 = ni6.j;
                final StringBuilder i = fu8.j(" setDebugName ");
                i.append(ni6.j0);
                Log.v("ConstraintLayout", i.toString());
            }
        }
        this.F0.u(sb);
        return sb.toString();
    }
    
    public final a h() {
        return new a(-2, -2);
    }
    
    public final Object l(final Object o) {
        if (o instanceof String) {
            final String s = (String)o;
            final HashMap<String, Integer> p = this.P0;
            if (p != null && p.containsKey(s)) {
                return this.P0.get(s);
            }
        }
        return null;
    }
    
    public void onLayout(final boolean b, int i, int n, int n2, int n3) {
        n2 = this.getChildCount();
        final boolean inEditMode = ((View)this).isInEditMode();
        n = 0;
        View child;
        a a;
        ni6 q0;
        int y;
        int z;
        int n4;
        View content;
        for (i = 0; i < n2; ++i) {
            child = this.getChildAt(i);
            a = (a)child.getLayoutParams();
            q0 = a.q0;
            if (child.getVisibility() != 8 || a.d0 || a.e0 || inEditMode) {
                if (!a.f0) {
                    y = q0.y();
                    z = q0.z();
                    n3 = q0.x() + y;
                    n4 = q0.q() + z;
                    child.layout(y, z, n3, n4);
                    if (child instanceof d) {
                        content = ((d)child).getContent();
                        if (content != null) {
                            content.setVisibility(0);
                            content.layout(y, z, n3, n4);
                        }
                    }
                }
            }
        }
        n2 = this.E0.size();
        if (n2 > 0) {
            for (i = n; i < n2; ++i) {
                this.E0.get(i).q();
            }
        }
    }
    
    public void onMeasure(final int s0, final int t0) {
        boolean b = this.K0;
        final int n = 0;
        if (!b) {
            for (int i = this.getChildCount(), j = 0; j < i; ++j) {
                if (this.getChildAt(j).isLayoutRequested()) {
                    this.K0 = true;
                    break;
                }
            }
        }
        this.S0 = s0;
        this.T0 = t0;
        this.F0.z0 = this.s();
        int i;
        int j;
        int k;
        int childCount;
        ni6 q;
        View child;
        String resourceName;
        int index;
        String substring;
        int id;
        Object o;
        View view;
        View viewById;
        View child2;
        d d;
        int n2;
        View viewById2;
        oi6 f0;
        View child3;
        b m0;
        int size;
        View child4;
        a a;
        ni6 q2;
        View child5;
        Label_0189:Label_0825_Outer:
        while (true) {
            Label_0408: {
                if (this.K0) {
                    this.K0 = false;
                    i = this.getChildCount();
                    k = 0;
                    while (true) {
                        while (k < i) {
                            if (this.getChildAt(k).isLayoutRequested()) {
                                j = 1;
                                if (j == 0) {
                                    break Label_0189;
                                }
                                b = ((View)this).isInEditMode();
                                for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                                    q = this.q(this.getChildAt(i));
                                    if (q != null) {
                                        q.J();
                                    }
                                }
                                if (b) {
                                    i = 0;
                                    break Label_0189;
                                }
                                break Label_0408;
                            }
                            else {
                                ++k;
                            }
                        }
                        j = 0;
                        continue Label_0825_Outer;
                    }
                }
            Label_0402_Outer:
                while (true) {
                    break Label_0825;
                    if (i >= childCount) {
                        break Label_0408;
                    }
                    child = this.getChildAt(i);
                Label_0513_Outer:
                    while (true) {
                        try {
                            resourceName = ((View)this).getResources().getResourceName(child.getId());
                            this.x(resourceName, child.getId());
                            index = resourceName.indexOf(47);
                            substring = resourceName;
                            if (index != -1) {
                                substring = resourceName.substring(index + 1);
                            }
                            id = child.getId();
                            if (id == 0) {
                                o = this.F0;
                            }
                            else {
                                if ((view = (View)this.D0.get(id)) == null) {
                                    viewById = ((View)this).findViewById(id);
                                    if ((view = viewById) != null && (view = viewById) != this) {
                                        view = viewById;
                                        if (viewById.getParent() == this) {
                                            this.onViewAdded(viewById);
                                            view = viewById;
                                        }
                                    }
                                }
                                if (view == this) {
                                    o = this.F0;
                                }
                                else if (view == null) {
                                    o = null;
                                }
                                else {
                                    o = ((a)view.getLayoutParams()).q0;
                                }
                            }
                            ((ni6)o).j0 = substring;
                            ++i;
                            continue Label_0189;
                        Label_0513:
                            while (true) {
                                Block_30_Outer:Block_28_Outer:Block_36_Outer:
                                while (true) {
                                    iftrue(Label_0658:)(i >= childCount);
                                    Label_0652: {
                                        while (true) {
                                        Block_35:
                                            while (true) {
                                                Block_34:Label_0419_Outer:Label_0466_Outer:
                                                while (true) {
                                                    while (true) {
                                                        Block_25: {
                                                        Label_0419:
                                                            while (true) {
                                                                while (true) {
                                                                Block_37_Outer:
                                                                    while (true) {
                                                                        Block_29: {
                                                                            break Block_29;
                                                                            d = (d)child2;
                                                                            iftrue(Label_0602:)(d.D0 != -1 || d.isInEditMode());
                                                                            Block_32: {
                                                                                break Block_32;
                                                                                this.E0.get(i).r(this);
                                                                                ++i;
                                                                                break Label_0513;
                                                                            }
                                                                            d.setVisibility(d.F0);
                                                                            while (true) {
                                                                                while (true) {
                                                                                Label_0808:
                                                                                    while (true) {
                                                                                        while (true) {
                                                                                            Label_0602: {
                                                                                                break Label_0602;
                                                                                                n2 = n;
                                                                                                iftrue(Label_0742:)(i >= childCount);
                                                                                                break Block_34;
                                                                                                i = 0;
                                                                                                break Label_0419;
                                                                                            }
                                                                                            viewById2 = ((View)this).findViewById(d.D0);
                                                                                            iftrue(Label_0652:)((d.E0 = viewById2) == null);
                                                                                            ((a)viewById2.getLayoutParams()).f0 = true;
                                                                                            d.E0.setVisibility(0);
                                                                                            d.setVisibility(0);
                                                                                            break Label_0652;
                                                                                            ++n2;
                                                                                            Label_0742: {
                                                                                                iftrue(Label_0814:)(n2 >= childCount);
                                                                                            }
                                                                                            break Block_35;
                                                                                            continue Label_0808;
                                                                                            this.w(this.F0, this.L0, s0, t0);
                                                                                            j = ((ni6)this.F0).x();
                                                                                            i = ((ni6)this.F0).q();
                                                                                            f0 = this.F0;
                                                                                            this.v(s0, t0, j, i, f0.I0, f0.J0);
                                                                                            return;
                                                                                            child3 = this.getChildAt(i);
                                                                                            iftrue(Label_0466:)(child3.getId() != this.O0 || !(child3 instanceof c));
                                                                                            break Block_25;
                                                                                            iftrue(Label_0472:)(this.O0 == -1);
                                                                                            continue Label_0419_Outer;
                                                                                        }
                                                                                        m0.c(this);
                                                                                        Label_0489: {
                                                                                            this.F0.b0();
                                                                                        }
                                                                                        size = this.E0.size();
                                                                                        iftrue(Label_0542:)(size <= 0);
                                                                                        break Block_30_Outer;
                                                                                        Label_0773:
                                                                                        a = (a)child4.getLayoutParams();
                                                                                        this.F0.a(q2);
                                                                                        this.g(b, child4, q2, a, this.Q0);
                                                                                        continue Label_0808;
                                                                                    }
                                                                                    this.F0.o0();
                                                                                    continue Label_0402_Outer;
                                                                                    Label_0472: {
                                                                                        m0 = this.M0;
                                                                                    }
                                                                                    iftrue(Label_0489:)(m0 == null);
                                                                                    continue Block_37_Outer;
                                                                                }
                                                                                iftrue(Label_0825:)(j == 0);
                                                                                continue Label_0466_Outer;
                                                                            }
                                                                        }
                                                                        child2 = this.getChildAt(i);
                                                                        iftrue(Label_0652:)(!(child2 instanceof d));
                                                                        continue Block_28_Outer;
                                                                    }
                                                                    iftrue(Label_0472:)(i >= childCount);
                                                                    continue Label_0466_Outer;
                                                                }
                                                                ++i;
                                                                continue Label_0419;
                                                            }
                                                            Label_0542: {
                                                                i = 0;
                                                            }
                                                            continue Block_30_Outer;
                                                        }
                                                        this.M0 = ((c)child3).getConstraintSet();
                                                        continue;
                                                    }
                                                    iftrue(Label_0542:)(i >= size);
                                                    continue Label_0513_Outer;
                                                }
                                                child5 = this.getChildAt(i);
                                                this.Q0.put(child5.getId(), (Object)this.q(child5));
                                                ++i;
                                                continue Block_36_Outer;
                                                Label_0658: {
                                                    this.Q0.clear();
                                                }
                                                this.Q0.put(0, (Object)this.F0);
                                                this.Q0.put(((View)this).getId(), (Object)this.F0);
                                                i = 0;
                                                continue Block_36_Outer;
                                            }
                                            child4 = this.getChildAt(n2);
                                            q2 = this.q(child4);
                                            iftrue(Label_0773:)(q2 != null);
                                            continue;
                                        }
                                    }
                                    ++i;
                                    continue Block_30_Outer;
                                }
                                i = 0;
                                continue Label_0513;
                            }
                        }
                        catch (final Resources$NotFoundException ex) {
                            continue;
                        }
                        break;
                    }
                    break;
                }
            }
            break;
        }
    }
    
    public void onViewAdded(final View view) {
        super.onViewAdded(view);
        final ni6 q = this.q(view);
        if (view instanceof Guideline && !(q instanceof bac)) {
            final a a = (a)view.getLayoutParams();
            final bac q2 = new bac();
            a.q0 = q2;
            a.d0 = true;
            q2.b0(a.V);
        }
        if (view instanceof androidx.constraintlayout.widget.a) {
            final androidx.constraintlayout.widget.a a2 = (androidx.constraintlayout.widget.a)view;
            a2.s();
            ((a)view.getLayoutParams()).e0 = true;
            if (!this.E0.contains(a2)) {
                this.E0.add(a2);
            }
        }
        this.D0.put(view.getId(), (Object)view);
        this.K0 = true;
    }
    
    public void onViewRemoved(final View view) {
        super.onViewRemoved(view);
        this.D0.remove(view.getId());
        final ni6 q = this.q(view);
        this.F0.u0.remove(q);
        q.J();
        this.E0.remove(view);
        this.K0 = true;
    }
    
    public final View p(final int n) {
        return (View)this.D0.get(n);
    }
    
    public final ni6 q(final View view) {
        if (view == this) {
            return (ni6)this.F0;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof a) {
                return ((a)view.getLayoutParams()).q0;
            }
            view.setLayoutParams(this.generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof a) {
                return ((a)view.getLayoutParams()).q0;
            }
        }
        return null;
    }
    
    public final void r(AttributeSet obtainStyledAttributes, int i) {
        final oi6 f0 = this.F0;
        ((ni6)f0).h0 = this;
        f0.m0((fs1$b)this.R0);
        this.D0.put(((View)this).getId(), (Object)this);
        this.M0 = null;
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes = (AttributeSet)((View)this).getContext().obtainStyledAttributes(obtainStyledAttributes, as2.Q0, i, 0);
            int indexCount;
            int index;
            int resourceId;
            int resourceId2;
            for (indexCount = ((TypedArray)obtainStyledAttributes).getIndexCount(), i = 0; i < indexCount; ++i) {
                index = ((TypedArray)obtainStyledAttributes).getIndex(i);
                if (index == 16) {
                    this.G0 = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.G0);
                }
                else if (index == 17) {
                    this.H0 = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.H0);
                }
                else if (index == 14) {
                    this.I0 = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.I0);
                }
                else if (index == 15) {
                    this.J0 = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.J0);
                }
                else if (index == 113) {
                    this.L0 = ((TypedArray)obtainStyledAttributes).getInt(index, this.L0);
                }
                else if (index == 56) {
                    resourceId = ((TypedArray)obtainStyledAttributes).getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.t(resourceId);
                        }
                        catch (final Resources$NotFoundException ex) {
                            this.N0 = null;
                        }
                    }
                }
                else if (index == 34) {
                    resourceId2 = ((TypedArray)obtainStyledAttributes).getResourceId(index, 0);
                    try {
                        (this.M0 = new b()).o(((View)this).getContext(), resourceId2);
                    }
                    catch (final Resources$NotFoundException ex2) {
                        this.M0 = null;
                    }
                    this.O0 = resourceId2;
                }
            }
            ((TypedArray)obtainStyledAttributes).recycle();
        }
        this.F0.n0(this.L0);
    }
    
    public void requestLayout() {
        this.K0 = true;
        super.requestLayout();
    }
    
    public final boolean s() {
        final int flags = ((View)this).getContext().getApplicationInfo().flags;
        final boolean b = false;
        final boolean b2 = (flags & 0x400000) != 0x0;
        boolean b3 = b;
        if (b2) {
            b3 = b;
            if (1 == ((View)this).getLayoutDirection()) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public void setConstraintSet(final b m0) {
        this.M0 = m0;
    }
    
    public void setId(final int id) {
        this.D0.remove(((View)this).getId());
        super.setId(id);
        this.D0.put(((View)this).getId(), (Object)this);
    }
    
    public void setMaxHeight(final int j0) {
        if (j0 == this.J0) {
            return;
        }
        this.J0 = j0;
        this.requestLayout();
    }
    
    public void setMaxWidth(final int i0) {
        if (i0 == this.I0) {
            return;
        }
        this.I0 = i0;
        this.requestLayout();
    }
    
    public void setMinHeight(final int h0) {
        if (h0 == this.H0) {
            return;
        }
        this.H0 = h0;
        this.requestLayout();
    }
    
    public void setMinWidth(final int g0) {
        if (g0 == this.G0) {
            return;
        }
        this.G0 = g0;
        this.requestLayout();
    }
    
    public void setOnConstraintsChanged(final ri6 ri6) {
    }
    
    public void setOptimizationLevel(final int l0) {
        this.L0 = l0;
        this.F0.n0(l0);
    }
    
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public void t(final int n) {
        this.N0 = new ii6(((View)this).getContext(), this, n);
    }
    
    public final void v(int resolveSizeAndState, int min, int n, final int n2, final boolean b, final boolean b2) {
        final ConstraintLayout.ConstraintLayout$b r0 = this.R0;
        final int e = r0.e;
        resolveSizeAndState = View.resolveSizeAndState(n + r0.d, resolveSizeAndState, 0);
        n = View.resolveSizeAndState(n2 + e, min, 0);
        min = Math.min(this.I0, resolveSizeAndState & 0xFFFFFF);
        n = Math.min(this.J0, n & 0xFFFFFF);
        resolveSizeAndState = min;
        if (b) {
            resolveSizeAndState = (min | 0x1000000);
        }
        min = n;
        if (b2) {
            min = (n | 0x1000000);
        }
        ((View)this).setMeasuredDimension(resolveSizeAndState, min);
    }
    
    public final void w(final oi6 oi6, int i, int f, int n) {
        final int mode = View$MeasureSpec.getMode(f);
        final int size = View$MeasureSpec.getSize(f);
        final int mode2 = View$MeasureSpec.getMode(n);
        final int size2 = View$MeasureSpec.getSize(n);
        final int max = Math.max(0, ((View)this).getPaddingTop());
        final int max2 = Math.max(0, ((View)this).getPaddingBottom());
        final int e = max + max2;
        final int paddingWidth = this.getPaddingWidth();
        final ConstraintLayout.ConstraintLayout$b r0 = this.R0;
        r0.b = max;
        r0.c = max2;
        r0.d = paddingWidth;
        r0.e = e;
        r0.f = f;
        r0.g = n;
        n = Math.max(0, ((View)this).getPaddingStart());
        f = Math.max(0, ((View)this).getPaddingEnd());
        if (n <= 0 && f <= 0) {
            n = Math.max(0, ((View)this).getPaddingLeft());
        }
        else if (this.s()) {
            n = f;
        }
        final int n2 = size - paddingWidth;
        final int n3 = size2 - e;
        final ni6$a e2 = ni6$a.E0;
        final ConstraintLayout.ConstraintLayout$b r2 = this.R0;
        final int e3 = r2.e;
        final int d = r2.d;
        final ni6$a d2 = ni6$a.D0;
        final int childCount = this.getChildCount();
        int min = 0;
        ni6$a ni6$a2 = null;
        Label_0314: {
            ni6$a ni6$a = null;
            Label_0307: {
                if (mode != Integer.MIN_VALUE) {
                    if (mode != 0) {
                        if (mode != 1073741824) {
                            ni6$a = d2;
                            f = 0;
                            break Label_0307;
                        }
                        min = Math.min(this.I0 - d, n2);
                        ni6$a2 = d2;
                        break Label_0314;
                    }
                    else if (childCount == 0) {
                        f = Math.max(0, this.G0);
                    }
                    else {
                        f = 0;
                    }
                }
                else if (childCount == 0) {
                    f = Math.max(0, this.G0);
                }
                else {
                    f = n2;
                }
                ni6$a = e2;
            }
            ni6$a2 = ni6$a;
            min = f;
        }
        ni6$a ni6$a3 = null;
        Label_0416: {
            if (mode2 != Integer.MIN_VALUE) {
                if (mode2 != 0) {
                    if (mode2 == 1073741824) {
                        f = Math.min(this.J0 - e3, n3);
                        ni6$a3 = d2;
                        break Label_0416;
                    }
                    ni6$a3 = d2;
                }
                else {
                    if (childCount == 0) {
                        f = Math.max(0, this.H0);
                        ni6$a3 = e2;
                        break Label_0416;
                    }
                    ni6$a3 = e2;
                }
                f = 0;
            }
            else {
                if (childCount == 0) {
                    f = Math.max(0, this.H0);
                }
                else {
                    f = n3;
                }
                ni6$a3 = e2;
            }
        }
        final ni6$a ni6$a4 = e2;
        if (min != ((ni6)oi6).x() || f != ((ni6)oi6).q()) {
            oi6.w0.c = true;
        }
        ((ni6)oi6).a0 = 0;
        ((ni6)oi6).b0 = 0;
        final int i2 = this.I0;
        final int[] c = ((ni6)oi6).C;
        c[0] = i2 - d;
        c[1] = this.J0 - e3;
        ((ni6)oi6).V(0);
        ((ni6)oi6).U(0);
        ((ni6)oi6).T(ni6$a2);
        ((ni6)oi6).X(min);
        ((ni6)oi6).W(ni6$a3);
        ((ni6)oi6).S(f);
        ((ni6)oi6).V(this.G0 - d);
        ((ni6)oi6).U(this.H0 - e3);
        oi6.B0 = n;
        oi6.C0 = max;
        final fs1 v0 = oi6.v0;
        Objects.requireNonNull(v0);
        final ei6$a g0 = ei6$a.G0;
        final ei6$a f2 = ei6$a.F0;
        final ni6$a f3 = ni6$a.F0;
        final fs1$b y0 = oi6.y0;
        final int size3 = oi6.u0.size();
        final int x = ((ni6)oi6).x();
        final int q = ((ni6)oi6).q();
        final boolean b = snj.b(i, 128);
        if (!b && !snj.b(i, 64)) {
            i = 0;
        }
        else {
            i = 1;
        }
        f = i;
        Label_0813: {
            Label_0811: {
                if (i != 0) {
                    n = 0;
                    while (true) {
                        f = i;
                        if (n >= size3) {
                            break Label_0811;
                        }
                        final ni6 ni6 = oi6.u0.get(n);
                        final ni6$a[] u = ni6.U;
                        if (u[0] == f3) {
                            f = 1;
                        }
                        else {
                            f = 0;
                        }
                        final boolean b2 = u[1] == f3;
                        if (f != 0 && b2 && ni6.Y > 0.0f) {
                            f = 1;
                        }
                        else {
                            f = 0;
                        }
                        if (ni6.E() && f != 0) {
                            break;
                        }
                        if (ni6.F() && f != 0) {
                            break;
                        }
                        if (ni6 instanceof jex) {
                            break;
                        }
                        if (ni6.E()) {
                            break;
                        }
                        if (ni6.F()) {
                            break;
                        }
                        ++n;
                    }
                    i = 0;
                    break Label_0813;
                }
            }
            i = f;
        }
        if ((mode == 1073741824 && mode2 == 1073741824) || b) {
            f = 1;
        }
        else {
            f = 0;
        }
        i &= f;
        int n5;
        int n6;
        int n7;
        if (i != 0) {
            f = Math.min(((ni6)oi6).C[0], n2);
            n = Math.min(((ni6)oi6).C[1], n3);
            if (mode == 1073741824 && ((ni6)oi6).x() != f) {
                ((ni6)oi6).X(f);
                oi6.j0();
            }
            if (mode2 == 1073741824 && ((ni6)oi6).q() != n) {
                ((ni6)oi6).S(n);
                oi6.j0();
            }
            Label_2109: {
                if (mode == 1073741824 && mode2 == 1073741824) {
                    final so8 w0 = oi6.w0;
                    final ni6$a g2 = ni6$a.G0;
                    final int n4 = (b & true) ? 1 : 0;
                    if (!w0.b && !w0.c) {
                        n = i;
                    }
                    else {
                        for (final ni6 ni7 : w0.a.u0) {
                            ni7.m();
                            ni7.a = false;
                            ni7.d.n();
                            ni7.e.m();
                        }
                        ((ni6)w0.a).m();
                        final oi6 a = w0.a;
                        ((ni6)a).a = false;
                        ((ni6)a).d.n();
                        ((ni6)w0.a).e.m();
                        w0.c = false;
                        n = i;
                    }
                    w0.b(w0.d);
                    final oi6 a2 = w0.a;
                    ((ni6)a2).a0 = 0;
                    ((ni6)a2).b0 = 0;
                    final ni6$a p4 = ((ni6)a2).p(0);
                    final ni6$a p5 = ((ni6)w0.a).p(1);
                    if (w0.b) {
                        w0.c();
                    }
                    final int y2 = ((ni6)w0.a).y();
                    final int z = ((ni6)w0.a).z();
                    ((sox)((ni6)w0.a).d).h.d(y2);
                    ((ni6)w0.a).e.h.d(z);
                    w0.g();
                    if (p4 == ni6$a4 || p5 == ni6$a4) {
                        i = (f = n4);
                        Label_1286: {
                            if (n4 != 0) {
                                final Iterator iterator2 = w0.e.iterator();
                                do {
                                    f = i;
                                    if (iterator2.hasNext()) {
                                        continue;
                                    }
                                    break Label_1286;
                                } while (((sox)iterator2.next()).k());
                                f = 0;
                            }
                        }
                        if (f != 0 && p4 == ni6$a4) {
                            ((ni6)w0.a).T(d2);
                            final oi6 a3 = w0.a;
                            ((ni6)a3).X(w0.d(a3, 0));
                            final oi6 a4 = w0.a;
                            ((sox)((ni6)a4).d).e.d(((ni6)a4).x());
                        }
                        if (f != 0 && p5 == ni6$a4) {
                            ((ni6)w0.a).W(d2);
                            final oi6 a5 = w0.a;
                            ((ni6)a5).S(w0.d(a5, 1));
                            final oi6 a6 = w0.a;
                            ((ni6)a6).e.e.d(((ni6)a6).q());
                        }
                    }
                    final oi6 a7 = w0.a;
                    final ni6$a[] u2 = ((ni6)a7).U;
                    if (u2[0] != d2 && u2[0] != g2) {
                        i = 0;
                    }
                    else {
                        i = ((ni6)a7).x() + y2;
                        ((sox)((ni6)w0.a).d).i.d(i);
                        ((sox)((ni6)w0.a).d).e.d(i - y2);
                        w0.g();
                        final oi6 a8 = w0.a;
                        final ni6$a[] u3 = ((ni6)a8).U;
                        if (u3[1] == d2 || u3[1] == g2) {
                            i = ((ni6)a8).q() + z;
                            ((ni6)w0.a).e.i.d(i);
                            ((ni6)w0.a).e.e.d(i - z);
                        }
                        w0.g();
                        i = 1;
                    }
                    for (final sox sox : w0.e) {
                        if (sox.b == w0.a && !sox.g) {
                            continue;
                        }
                        sox.e();
                    }
                    while (true) {
                        for (final sox sox2 : w0.e) {
                            if (i == 0 && sox2.b == w0.a) {
                                continue;
                            }
                            if (sox2.h.j) {
                                if (sox2.i.j || sox2 instanceof cac) {
                                    if (((to8)sox2.e).j || sox2 instanceof do3 || sox2 instanceof cac) {
                                        continue;
                                    }
                                }
                            }
                            f = 0;
                            ((ni6)w0.a).T(p4);
                            ((ni6)w0.a).W(p5);
                            i = 2;
                            break Label_2109;
                        }
                        f = 1;
                        continue;
                    }
                }
                n = i;
                final so8 w2 = oi6.w0;
                if (w2.b) {
                    for (final ni6 ni8 : w2.a.u0) {
                        ni8.m();
                        ni8.a = false;
                        final bqc d3 = ni8.d;
                        ((to8)((sox)d3).e).j = false;
                        ((sox)d3).g = false;
                        d3.n();
                        final utw e4 = ni8.e;
                        ((to8)e4.e).j = false;
                        e4.g = false;
                        e4.m();
                    }
                    ((ni6)w2.a).m();
                    final oi6 a9 = w2.a;
                    ((ni6)a9).a = false;
                    final bqc d4 = ((ni6)a9).d;
                    ((to8)((sox)d4).e).j = false;
                    ((sox)d4).g = false;
                    d4.n();
                    final utw e5 = ((ni6)w2.a).e;
                    ((to8)e5.e).j = false;
                    e5.g = false;
                    e5.m();
                    w2.c();
                }
                w2.b(w2.d);
                final oi6 a10 = w2.a;
                ((ni6)a10).a0 = 0;
                ((ni6)a10).b0 = 0;
                ((sox)((ni6)a10).d).h.d(0);
                ((ni6)w2.a).e.h.d(0);
                if (mode == 1073741824) {
                    f = ((oi6.i0(b, 0) & true) ? 1 : 0);
                    i = 1;
                }
                else {
                    i = 0;
                    f = 1;
                }
                if (mode2 == 1073741824) {
                    f &= (oi6.i0(b, 1) ? 1 : 0);
                    ++i;
                }
            }
            n5 = i;
            n6 = f;
            n7 = n;
            if (f != 0) {
                oi6.Y(mode == 1073741824, mode2 == 1073741824);
                n5 = i;
                n6 = f;
                n7 = n;
            }
        }
        else {
            n5 = 0;
            n6 = 0;
            n7 = i;
        }
        final ni6$a ni6$a5 = e2;
        final fs1 fs1 = v0;
        final fs1$b fs1$b = y0;
        final ei6$a ei6$a = f2;
        if (n6 == 0 || n5 != 2) {
            n = oi6.H0;
            fs1 fs2;
            if (size3 > 0) {
                final int size4 = oi6.u0.size();
                final boolean l0 = oi6.l0(64);
                final fs1$b y3 = oi6.y0;
                for (int j = 0; j < size4; ++j) {
                    final ni6 ni9 = oi6.u0.get(j);
                    if (!(ni9 instanceof bac)) {
                        if (!(ni9 instanceof ni1)) {
                            if (!ni9.G) {
                                if (l0) {
                                    final bqc d5 = ni9.d;
                                    if (d5 != null) {
                                        final utw e6 = ni9.e;
                                        if (e6 != null && ((to8)((sox)d5).e).j && ((to8)e6.e).j) {
                                            continue;
                                        }
                                    }
                                }
                                final ni6$a p6 = ni9.p(0);
                                final ni6$a p7 = ni9.p(1);
                                if (p6 == f3 && ni9.r != 1 && p7 == f3 && ni9.s != 1) {
                                    i = 1;
                                }
                                else {
                                    i = 0;
                                }
                                f = i;
                                Label_2557: {
                                    Label_2555: {
                                        if (i == 0) {
                                            f = i;
                                            if (oi6.l0(1)) {
                                                f = i;
                                                if (!(ni9 instanceof jex)) {
                                                    f = i;
                                                    if (p6 == f3) {
                                                        f = i;
                                                        if (ni9.r == 0) {
                                                            f = i;
                                                            if (p7 != f3) {
                                                                f = i;
                                                                if (!ni9.E()) {
                                                                    f = 1;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i = f;
                                                    if (p7 == f3) {
                                                        i = f;
                                                        if (ni9.s == 0) {
                                                            i = f;
                                                            if (p6 != f3) {
                                                                i = f;
                                                                if (!ni9.E()) {
                                                                    i = 1;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (p6 != f3) {
                                                        f = i;
                                                        if (p7 != f3) {
                                                            break Label_2555;
                                                        }
                                                    }
                                                    if (ni9.Y > 0.0f) {
                                                        i = 1;
                                                    }
                                                    break Label_2557;
                                                }
                                            }
                                        }
                                    }
                                    i = f;
                                }
                                if (i == 0) {
                                    fs1.a(y3, ni9, 0);
                                }
                            }
                        }
                    }
                }
                final ConstraintLayout.ConstraintLayout$b constraintLayout$b = (ConstraintLayout.ConstraintLayout$b)y3;
                View child;
                d d6;
                a a11;
                a a12;
                ni6 q2;
                ni6 q3;
                ni6 q4;
                for (f = constraintLayout$b.a.getChildCount(), i = 0; i < f; ++i) {
                    child = constraintLayout$b.a.getChildAt(i);
                    if (child instanceof d) {
                        d6 = (d)child;
                        if (d6.E0 != null) {
                            a11 = (a)d6.getLayoutParams();
                            a12 = (a)d6.E0.getLayoutParams();
                            q2 = a12.q0;
                            q2.i0 = 0;
                            q3 = a11.q0;
                            if (q3.U[0] != d2) {
                                q3.X(q2.x());
                            }
                            q4 = a11.q0;
                            if (q4.U[1] != d2) {
                                q4.S(a12.q0.q());
                            }
                            a12.q0.i0 = 8;
                        }
                    }
                }
                f = constraintLayout$b.a.E0.size();
                fs2 = fs1;
                if (f > 0) {
                    i = 0;
                    while (true) {
                        fs2 = fs1;
                        if (i >= f) {
                            break;
                        }
                        Objects.requireNonNull(constraintLayout$b.a.E0.get(i));
                        ++i;
                    }
                }
            }
            else {
                fs2 = fs1;
            }
            fs2.c(oi6);
            final int size5 = fs2.a.size();
            final int n8 = x;
            if (size3 > 0) {
                fs2.b(oi6, 0, n8, q);
            }
            int n13;
            if (size5 > 0) {
                final ni6$a[] u4 = ((ni6)oi6).U;
                final boolean b3 = u4[0] == ni6$a5;
                final boolean b4 = u4[1] == ni6$a5;
                f = Math.max(((ni6)oi6).x(), ((ni6)fs2.c).d0);
                i = Math.max(((ni6)oi6).q(), ((ni6)fs2.c).e0);
                int k = 0;
                boolean b5 = false;
                final fs1$b fs1$b2 = fs1$b;
                while (k < size5) {
                    final ni6 ni10 = fs2.a.get(k);
                    if (ni10 instanceof jex) {
                        final int x2 = ni10.x();
                        final int q5 = ni10.q();
                        final boolean a13 = fs2.a(fs1$b2, ni10, 1);
                        final int x3 = ni10.x();
                        final int q6 = ni10.q();
                        boolean b6;
                        if (x3 != x2) {
                            ni10.X(x3);
                            if (b3 && ni10.t() > f) {
                                f = Math.max(f, ni10.n(ei6$a).e() + ni10.t());
                            }
                            b6 = true;
                        }
                        else {
                            b6 = (b5 | a13);
                        }
                        if (q6 != q5) {
                            ni10.S(q6);
                            if (b4 && ni10.o() > i) {
                                i = Math.max(i, ni10.n(g0).e() + ni10.o());
                            }
                            b6 = true;
                        }
                        b5 = (((jex)ni10).C0 | b6);
                    }
                    ++k;
                }
                final int n9 = n;
                final int n10 = 0;
                boolean b7 = b5;
                final int n11 = q;
                n = size5;
                int n12 = n10;
                while (true) {
                    n13 = n9;
                    if (n12 >= 2) {
                        break;
                    }
                    int n14 = 0;
                    boolean b8 = b7;
                    while (n14 < n) {
                        final ni6 ni11 = fs2.a.get(n14);
                        int max3 = 0;
                        Label_3531: {
                            if ((ni11 instanceof yic || ni11 instanceof jex) && !(ni11 instanceof bac)) {
                                if (ni11.i0 != 8) {
                                    if (n7 == 0 || !((to8)((sox)ni11.d).e).j || !((to8)ni11.e.e).j) {
                                        if (!(ni11 instanceof jex)) {
                                            final int x4 = ni11.x();
                                            final int q7 = ni11.q();
                                            final int c2 = ni11.c0;
                                            int n15 = 1;
                                            if (n12 == 1) {
                                                n15 = 2;
                                            }
                                            b8 |= fs2.a(fs1$b2, ni11, n15);
                                            final int x5 = ni11.x();
                                            final int q8 = ni11.q();
                                            max3 = f;
                                            if (x5 != x4) {
                                                ni11.X(x5);
                                                max3 = f;
                                                if (b3 && ni11.t() > (max3 = f)) {
                                                    max3 = Math.max(f, ni11.n(ei6$a).e() + ni11.t());
                                                }
                                                b8 = true;
                                            }
                                            f = i;
                                            if (q8 != q7) {
                                                ni11.S(q8);
                                                f = i;
                                                if (b4 && ni11.o() > (f = i)) {
                                                    f = ni11.o();
                                                    f = Math.max(i, ni11.n(g0).e() + f);
                                                }
                                                b8 = true;
                                            }
                                            if (ni11.E && c2 != ni11.c0) {
                                                b8 = true;
                                                i = f;
                                                break Label_3531;
                                            }
                                            i = f;
                                            break Label_3531;
                                        }
                                    }
                                }
                            }
                            max3 = f;
                        }
                        ++n14;
                        f = max3;
                    }
                    if (!b8) {
                        n13 = n9;
                        break;
                    }
                    ++n12;
                    fs2.b(oi6, n12, n8, n11);
                    b7 = false;
                }
            }
            else {
                n13 = n;
            }
            oi6.n0(n13);
        }
    }
    
    public final void x(final Object o, final Object o2) {
        if (o instanceof String && o2 instanceof Integer) {
            if (this.P0 == null) {
                this.P0 = new HashMap<String, Integer>();
            }
            final String s = (String)o;
            final int index = s.indexOf("/");
            String substring = s;
            if (index != -1) {
                substring = s.substring(index + 1);
            }
            this.P0.put(substring, (int)o2);
        }
    }
    
    public final void y(final ni6 ni6, final a a, final SparseArray<ni6> sparseArray, final int n, final ei6$a ei6$a) {
        final View view = (View)this.D0.get(n);
        final ni6 ni7 = (ni6)sparseArray.get(n);
        if (ni7 != null && view != null && view.getLayoutParams() instanceof a) {
            a.c0 = true;
            final ei6$a h0 = ei6$a.H0;
            if (ei6$a == h0) {
                final a a2 = (a)view.getLayoutParams();
                a2.c0 = true;
                a2.q0.E = true;
            }
            ni6.n(h0).b(ni7.n(ei6$a), a.D, a.C, true);
            ni6.E = true;
            ni6.n(ei6$a.E0).k();
            ni6.n(ei6$a.G0).k();
        }
    }
    
    public static class a extends ViewGroup$MarginLayoutParams
    {
        public int A;
        public int B;
        public int C;
        public int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;
        public int a;
        public boolean a0;
        public int b;
        public boolean b0;
        public float c;
        public boolean c0;
        public boolean d;
        public boolean d0;
        public int e;
        public boolean e0;
        public int f;
        public boolean f0;
        public int g;
        public int g0;
        public int h;
        public int h0;
        public int i;
        public int i0;
        public int j;
        public int j0;
        public int k;
        public int k0;
        public int l;
        public int l0;
        public int m;
        public float m0;
        public int n;
        public int n0;
        public int o;
        public int o0;
        public int p;
        public float p0;
        public int q;
        public ni6 q0;
        public float r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public int x;
        public int y;
        public int z;
        
        public a(final int n, final int n2) {
            super(n, n2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new ni6();
        }
        
        public a(Context obtainStyledAttributes, final AttributeSet set) {
            super(obtainStyledAttributes, set);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new ni6();
            obtainStyledAttributes = (Context)obtainStyledAttributes.obtainStyledAttributes(set, as2.Q0);
            for (int indexCount = ((TypedArray)obtainStyledAttributes).getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = ((TypedArray)obtainStyledAttributes).getIndex(i);
                final int value = ConstraintLayout.a.a.a.get(index);
                switch (value) {
                    default: {
                        switch (value) {
                            default: {
                                switch (value) {
                                    default: {
                                        continue;
                                    }
                                    case 67: {
                                        this.d = ((TypedArray)obtainStyledAttributes).getBoolean(index, this.d);
                                        continue;
                                    }
                                    case 66: {
                                        this.Z = ((TypedArray)obtainStyledAttributes).getInt(index, this.Z);
                                        continue;
                                    }
                                    case 65: {
                                        b.r(this, (TypedArray)obtainStyledAttributes, index, 1);
                                        continue;
                                    }
                                    case 64: {
                                        b.r(this, (TypedArray)obtainStyledAttributes, index, 0);
                                        continue;
                                    }
                                }
                                break;
                            }
                            case 55: {
                                this.C = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.C);
                                continue;
                            }
                            case 54: {
                                this.D = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.D);
                                continue;
                            }
                            case 53: {
                                final int resourceId = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.o);
                                this.o = resourceId;
                                if (resourceId == -1) {
                                    this.o = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                                    continue;
                                }
                                continue;
                            }
                            case 52: {
                                final int resourceId2 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.n);
                                this.n = resourceId2;
                                if (resourceId2 == -1) {
                                    this.n = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                                    continue;
                                }
                                continue;
                            }
                            case 51: {
                                this.Y = ((TypedArray)obtainStyledAttributes).getString(index);
                                continue;
                            }
                            case 50: {
                                this.U = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.U);
                                continue;
                            }
                            case 49: {
                                this.T = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.T);
                                continue;
                            }
                            case 48: {
                                this.K = ((TypedArray)obtainStyledAttributes).getInt(index, 0);
                                continue;
                            }
                            case 47: {
                                this.J = ((TypedArray)obtainStyledAttributes).getInt(index, 0);
                                continue;
                            }
                            case 46: {
                                this.I = ((TypedArray)obtainStyledAttributes).getFloat(index, this.I);
                                continue;
                            }
                            case 45: {
                                this.H = ((TypedArray)obtainStyledAttributes).getFloat(index, this.H);
                                continue;
                            }
                            case 44: {
                                b.s(this, ((TypedArray)obtainStyledAttributes).getString(index));
                                continue;
                            }
                        }
                        break;
                    }
                    case 38: {
                        this.S = Math.max(0.0f, ((TypedArray)obtainStyledAttributes).getFloat(index, this.S));
                        this.M = 2;
                        break;
                    }
                    case 37: {
                        try {
                            this.Q = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.Q);
                        }
                        catch (final Exception ex) {
                            if (((TypedArray)obtainStyledAttributes).getInt(index, this.Q) == -2) {
                                this.Q = -2;
                            }
                        }
                        break;
                    }
                    case 36: {
                        try {
                            this.O = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.O);
                        }
                        catch (final Exception ex2) {
                            if (((TypedArray)obtainStyledAttributes).getInt(index, this.O) == -2) {
                                this.O = -2;
                            }
                        }
                        break;
                    }
                    case 35: {
                        this.R = Math.max(0.0f, ((TypedArray)obtainStyledAttributes).getFloat(index, this.R));
                        this.L = 2;
                        break;
                    }
                    case 34: {
                        try {
                            this.P = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.P);
                        }
                        catch (final Exception ex3) {
                            if (((TypedArray)obtainStyledAttributes).getInt(index, this.P) == -2) {
                                this.P = -2;
                            }
                        }
                        break;
                    }
                    case 33: {
                        try {
                            this.N = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.N);
                        }
                        catch (final Exception ex4) {
                            if (((TypedArray)obtainStyledAttributes).getInt(index, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                        break;
                    }
                    case 32: {
                        final int int1 = ((TypedArray)obtainStyledAttributes).getInt(index, 0);
                        this.M = int1;
                        if (int1 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                        break;
                    }
                    case 31: {
                        final int int2 = ((TypedArray)obtainStyledAttributes).getInt(index, 0);
                        this.L = int2;
                        if (int2 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                        break;
                    }
                    case 30: {
                        this.F = ((TypedArray)obtainStyledAttributes).getFloat(index, this.F);
                        break;
                    }
                    case 29: {
                        this.E = ((TypedArray)obtainStyledAttributes).getFloat(index, this.E);
                        break;
                    }
                    case 28: {
                        this.X = ((TypedArray)obtainStyledAttributes).getBoolean(index, this.X);
                        break;
                    }
                    case 27: {
                        this.W = ((TypedArray)obtainStyledAttributes).getBoolean(index, this.W);
                        break;
                    }
                    case 26: {
                        this.B = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.B);
                        break;
                    }
                    case 25: {
                        this.A = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.A);
                        break;
                    }
                    case 24: {
                        this.z = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.z);
                        break;
                    }
                    case 23: {
                        this.y = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.y);
                        break;
                    }
                    case 22: {
                        this.x = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.x);
                        break;
                    }
                    case 21: {
                        this.w = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.w);
                        break;
                    }
                    case 20: {
                        final int resourceId3 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.v);
                        this.v = resourceId3;
                        if (resourceId3 == -1) {
                            this.v = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                            break;
                        }
                        break;
                    }
                    case 19: {
                        final int resourceId4 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.u);
                        this.u = resourceId4;
                        if (resourceId4 == -1) {
                            this.u = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                            break;
                        }
                        break;
                    }
                    case 18: {
                        final int resourceId5 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.t);
                        this.t = resourceId5;
                        if (resourceId5 == -1) {
                            this.t = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                            break;
                        }
                        break;
                    }
                    case 17: {
                        final int resourceId6 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.s);
                        this.s = resourceId6;
                        if (resourceId6 == -1) {
                            this.s = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                            break;
                        }
                        break;
                    }
                    case 16: {
                        final int resourceId7 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.m);
                        this.m = resourceId7;
                        if (resourceId7 == -1) {
                            this.m = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                            break;
                        }
                        break;
                    }
                    case 15: {
                        final int resourceId8 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.l);
                        this.l = resourceId8;
                        if (resourceId8 == -1) {
                            this.l = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                            break;
                        }
                        break;
                    }
                    case 14: {
                        final int resourceId9 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.k);
                        this.k = resourceId9;
                        if (resourceId9 == -1) {
                            this.k = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                            break;
                        }
                        break;
                    }
                    case 13: {
                        final int resourceId10 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.j);
                        this.j = resourceId10;
                        if (resourceId10 == -1) {
                            this.j = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                            break;
                        }
                        break;
                    }
                    case 12: {
                        final int resourceId11 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.i);
                        this.i = resourceId11;
                        if (resourceId11 == -1) {
                            this.i = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                            break;
                        }
                        break;
                    }
                    case 11: {
                        final int resourceId12 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.h);
                        this.h = resourceId12;
                        if (resourceId12 == -1) {
                            this.h = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                            break;
                        }
                        break;
                    }
                    case 10: {
                        final int resourceId13 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.g);
                        this.g = resourceId13;
                        if (resourceId13 == -1) {
                            this.g = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                            break;
                        }
                        break;
                    }
                    case 9: {
                        final int resourceId14 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.f);
                        this.f = resourceId14;
                        if (resourceId14 == -1) {
                            this.f = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                            break;
                        }
                        break;
                    }
                    case 8: {
                        final int resourceId15 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.e);
                        this.e = resourceId15;
                        if (resourceId15 == -1) {
                            this.e = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                            break;
                        }
                        break;
                    }
                    case 7: {
                        this.c = ((TypedArray)obtainStyledAttributes).getFloat(index, this.c);
                        break;
                    }
                    case 6: {
                        this.b = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.b);
                        break;
                    }
                    case 5: {
                        this.a = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.a);
                        break;
                    }
                    case 4: {
                        final float r = ((TypedArray)obtainStyledAttributes).getFloat(index, this.r) % 360.0f;
                        this.r = r;
                        if (r < 0.0f) {
                            this.r = (360.0f - r) % 360.0f;
                            break;
                        }
                        break;
                    }
                    case 3: {
                        this.q = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.q);
                        break;
                    }
                    case 2: {
                        final int resourceId16 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.p);
                        this.p = resourceId16;
                        if (resourceId16 == -1) {
                            this.p = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                            break;
                        }
                        break;
                    }
                    case 1: {
                        this.V = ((TypedArray)obtainStyledAttributes).getInt(index, this.V);
                        break;
                    }
                }
            }
            ((TypedArray)obtainStyledAttributes).recycle();
            this.a();
        }
        
        public a(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new ni6();
        }
        
        public final void a() {
            this.d0 = false;
            this.a0 = true;
            this.b0 = true;
            final int width = super.width;
            if (width == -2 && this.W) {
                this.a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            final int height = super.height;
            if (height == -2 && this.X) {
                this.b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (width == 0 || width == -1) {
                this.a0 = false;
                if (width == 0 && this.L == 1) {
                    super.width = -2;
                    this.W = true;
                }
            }
            if (height == 0 || height == -1) {
                this.b0 = false;
                if (height == 0 && this.M == 1) {
                    super.height = -2;
                    this.X = true;
                }
            }
            if (this.c != -1.0f || this.a != -1 || this.b != -1) {
                this.d0 = true;
                this.a0 = true;
                this.b0 = true;
                if (!(this.q0 instanceof bac)) {
                    this.q0 = new bac();
                }
                ((bac)this.q0).b0(this.V);
            }
        }
        
        @TargetApi(17)
        public final void resolveLayoutDirection(int h0) {
            final int leftMargin = super.leftMargin;
            final int rightMargin = super.rightMargin;
            super.resolveLayoutDirection(h0);
            h0 = this.getLayoutDirection();
            final int n = 0;
            if (1 == h0) {
                h0 = 1;
            }
            else {
                h0 = 0;
            }
            this.i0 = -1;
            this.j0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.k0 = this.w;
            this.l0 = this.y;
            final float e = this.E;
            this.m0 = e;
            final int a = this.a;
            this.n0 = a;
            final int b = this.b;
            this.o0 = b;
            final float c = this.c;
            this.p0 = c;
            if (h0 != 0) {
                h0 = this.s;
                Label_0165: {
                    if (h0 != -1) {
                        this.i0 = h0;
                    }
                    else {
                        final int t = this.t;
                        h0 = n;
                        if (t == -1) {
                            break Label_0165;
                        }
                        this.j0 = t;
                    }
                    h0 = 1;
                }
                final int u = this.u;
                if (u != -1) {
                    this.h0 = u;
                    h0 = 1;
                }
                final int v = this.v;
                if (v != -1) {
                    this.g0 = v;
                    h0 = 1;
                }
                final int a2 = this.A;
                if (a2 != Integer.MIN_VALUE) {
                    this.l0 = a2;
                }
                final int b2 = this.B;
                if (b2 != Integer.MIN_VALUE) {
                    this.k0 = b2;
                }
                if (h0 != 0) {
                    this.m0 = 1.0f - e;
                }
                if (this.d0 && this.V == 1 && this.d) {
                    if (c != -1.0f) {
                        this.p0 = 1.0f - c;
                        this.n0 = -1;
                        this.o0 = -1;
                    }
                    else if (a != -1) {
                        this.o0 = a;
                        this.n0 = -1;
                        this.p0 = -1.0f;
                    }
                    else if (b != -1) {
                        this.n0 = b;
                        this.o0 = -1;
                        this.p0 = -1.0f;
                    }
                }
            }
            else {
                h0 = this.s;
                if (h0 != -1) {
                    this.h0 = h0;
                }
                h0 = this.t;
                if (h0 != -1) {
                    this.g0 = h0;
                }
                h0 = this.u;
                if (h0 != -1) {
                    this.i0 = h0;
                }
                h0 = this.v;
                if (h0 != -1) {
                    this.j0 = h0;
                }
                h0 = this.A;
                if (h0 != Integer.MIN_VALUE) {
                    this.k0 = h0;
                }
                h0 = this.B;
                if (h0 != Integer.MIN_VALUE) {
                    this.l0 = h0;
                }
            }
            if (this.u == -1 && this.v == -1 && this.t == -1 && this.s == -1) {
                h0 = this.g;
                if (h0 != -1) {
                    this.i0 = h0;
                    if (super.rightMargin <= 0 && rightMargin > 0) {
                        super.rightMargin = rightMargin;
                    }
                }
                else {
                    h0 = this.h;
                    if (h0 != -1) {
                        this.j0 = h0;
                        if (super.rightMargin <= 0 && rightMargin > 0) {
                            super.rightMargin = rightMargin;
                        }
                    }
                }
                h0 = this.e;
                if (h0 != -1) {
                    this.g0 = h0;
                    if (super.leftMargin <= 0 && leftMargin > 0) {
                        super.leftMargin = leftMargin;
                    }
                }
                else {
                    h0 = this.f;
                    if (h0 != -1) {
                        this.h0 = h0;
                        if (super.leftMargin <= 0 && leftMargin > 0) {
                            super.leftMargin = leftMargin;
                        }
                    }
                }
            }
        }
        
        public static final class a
        {
            public static final SparseIntArray a;
            
            static {
                final SparseIntArray a2 = new SparseIntArray();
                (a = a2).append(98, 64);
                a2.append(75, 65);
                a2.append(84, 8);
                a2.append(85, 9);
                a2.append(87, 10);
                a2.append(88, 11);
                a2.append(94, 12);
                a2.append(93, 13);
                a2.append(65, 14);
                a2.append(64, 15);
                a2.append(60, 16);
                a2.append(62, 52);
                a2.append(61, 53);
                a2.append(66, 2);
                a2.append(68, 3);
                a2.append(67, 4);
                a2.append(103, 49);
                a2.append(104, 50);
                a2.append(72, 5);
                a2.append(73, 6);
                a2.append(74, 7);
                a2.append(55, 67);
                a2.append(0, 1);
                a2.append(89, 17);
                a2.append(90, 18);
                a2.append(71, 19);
                a2.append(70, 20);
                a2.append(108, 21);
                a2.append(111, 22);
                a2.append(109, 23);
                a2.append(106, 24);
                a2.append(110, 25);
                a2.append(107, 26);
                a2.append(105, 55);
                a2.append(112, 54);
                a2.append(80, 29);
                a2.append(95, 30);
                a2.append(69, 44);
                a2.append(82, 45);
                a2.append(97, 46);
                a2.append(81, 47);
                a2.append(96, 48);
                a2.append(58, 27);
                a2.append(57, 28);
                a2.append(99, 31);
                a2.append(76, 32);
                a2.append(101, 33);
                a2.append(100, 34);
                a2.append(102, 35);
                a2.append(78, 36);
                a2.append(77, 37);
                a2.append(79, 38);
                a2.append(83, 39);
                a2.append(92, 40);
                a2.append(86, 41);
                a2.append(63, 42);
                a2.append(59, 43);
                a2.append(91, 51);
                a2.append(114, 66);
            }
        }
    }
}
