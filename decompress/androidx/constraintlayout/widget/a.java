// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.content.res.Resources$NotFoundException;
import android.view.ViewParent;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import java.util.Arrays;
import android.util.Log;
import android.util.AttributeSet;
import java.util.HashMap;
import android.content.Context;
import android.view.View;

public abstract class a extends View
{
    public int[] D0;
    public int E0;
    public Context F0;
    public ajc G0;
    public String H0;
    public String I0;
    public View[] J0;
    public HashMap<Integer, String> K0;
    
    public a(final Context f0) {
        super(f0);
        this.D0 = new int[32];
        this.J0 = null;
        this.K0 = new HashMap<Integer, String>();
        this.F0 = f0;
        this.m(null);
    }
    
    public a(final Context f0, final AttributeSet set) {
        super(f0, set);
        this.D0 = new int[32];
        this.J0 = null;
        this.K0 = new HashMap<Integer, String>();
        this.F0 = f0;
        this.m(set);
    }
    
    public a(final Context f0, final AttributeSet set, final int n) {
        super(f0, set, n);
        this.D0 = new int[32];
        this.J0 = null;
        this.K0 = new HashMap<Integer, String>();
        this.F0 = f0;
        this.m(set);
    }
    
    public final void e(String trim) {
        if (trim != null) {
            if (trim.length() != 0) {
                if (this.F0 == null) {
                    return;
                }
                trim = trim.trim();
                if (this.getParent() instanceof ConstraintLayout) {
                    final ConstraintLayout constraintLayout = (ConstraintLayout)this.getParent();
                }
                final int l = this.l(trim);
                if (l != 0) {
                    this.K0.put(l, trim);
                    this.f(l);
                }
                else {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Could not find id of \"");
                    sb.append(trim);
                    sb.append("\"");
                    Log.w("ConstraintHelper", sb.toString());
                }
            }
        }
    }
    
    public final void f(final int n) {
        if (n == this.getId()) {
            return;
        }
        final int e0 = this.E0;
        final int[] d0 = this.D0;
        if (e0 + 1 > d0.length) {
            this.D0 = Arrays.copyOf(d0, d0.length * 2);
        }
        final int[] d2 = this.D0;
        final int e2 = this.E0;
        d2[e2] = n;
        this.E0 = e2 + 1;
    }
    
    public final void g(final String s) {
        if (s != null) {
            if (s.length() != 0) {
                if (this.F0 == null) {
                    return;
                }
                final String trim = s.trim();
                ViewGroup viewGroup = null;
                if (this.getParent() instanceof ConstraintLayout) {
                    viewGroup = (ConstraintLayout)this.getParent();
                }
                if (viewGroup == null) {
                    Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                    return;
                }
                for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                    final View child = viewGroup.getChildAt(i);
                    final ViewGroup$LayoutParams layoutParams = child.getLayoutParams();
                    if (layoutParams instanceof ConstraintLayout.a && trim.equals(((ConstraintLayout.a)layoutParams).Y)) {
                        if (child.getId() == -1) {
                            final StringBuilder j = fu8.j("to use ConstraintTag view ");
                            j.append(child.getClass().getSimpleName());
                            j.append(" must have an ID");
                            Log.w("ConstraintHelper", j.toString());
                        }
                        else {
                            this.f(child.getId());
                        }
                    }
                }
            }
        }
    }
    
    public int[] getReferencedIds() {
        return Arrays.copyOf(this.D0, this.E0);
    }
    
    public final void h() {
        final ViewParent parent = this.getParent();
        if (parent != null && parent instanceof ConstraintLayout) {
            this.i((ConstraintLayout)parent);
        }
    }
    
    public final void i(final ConstraintLayout constraintLayout) {
        final int visibility = this.getVisibility();
        final float elevation = this.getElevation();
        for (int i = 0; i < this.E0; ++i) {
            final View p = constraintLayout.p(this.D0[i]);
            if (p != null) {
                p.setVisibility(visibility);
                if (elevation > 0.0f) {
                    p.setTranslationZ(p.getTranslationZ() + elevation);
                }
            }
        }
    }
    
    public void j(final ConstraintLayout constraintLayout) {
    }
    
    public final int k(final ConstraintLayout constraintLayout, final String s) {
        if (s != null) {
            if (constraintLayout != null) {
                final Resources resources = this.F0.getResources();
                if (resources == null) {
                    return 0;
                }
                for (int childCount = constraintLayout.getChildCount(), i = 0; i < childCount; ++i) {
                    final View child = constraintLayout.getChildAt(i);
                    if (child.getId() != -1) {
                        Object resourceEntryName = null;
                        try {
                            resourceEntryName = resources.getResourceEntryName(child.getId());
                        }
                        catch (final Resources$NotFoundException ex) {}
                        if (s.equals(resourceEntryName)) {
                            return child.getId();
                        }
                    }
                }
            }
        }
        return 0;
    }
    
    public final int l(final String s) {
        ConstraintLayout constraintLayout;
        if (this.getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout)this.getParent();
        }
        else {
            constraintLayout = null;
        }
        final boolean inEditMode = this.isInEditMode();
        int intValue;
        final int n = intValue = 0;
        if (inEditMode) {
            intValue = n;
            if (constraintLayout != null) {
                final Object l = constraintLayout.l(s);
                intValue = n;
                if (l instanceof Integer) {
                    intValue = (int)l;
                }
            }
        }
        int k;
        if ((k = intValue) == 0) {
            k = intValue;
            if (constraintLayout != null) {
                k = this.k(constraintLayout, s);
            }
        }
        int int1;
        if ((int1 = k) == 0) {
            try {
                int1 = yvl.class.getField(s).getInt(null);
            }
            catch (final Exception ex) {
                int1 = k;
            }
        }
        int identifier;
        if ((identifier = int1) == 0) {
            identifier = this.F0.getResources().getIdentifier(s, "id", this.F0.getPackageName());
        }
        return identifier;
    }
    
    public void m(final AttributeSet set) {
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, as2.Q0);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    this.setIds(this.H0 = obtainStyledAttributes.getString(index));
                }
                else if (index == 36) {
                    this.setReferenceTags(this.I0 = obtainStyledAttributes.getString(index));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
    
    public void n(final b.a a, final ajc ajc, final ConstraintLayout.a a2, final SparseArray<ni6> sparseArray) {
        final b.b e = a.e;
        final int[] j0 = e.j0;
        final int n = 0;
        if (j0 != null) {
            this.setReferencedIds(j0);
        }
        else {
            final String k0 = e.k0;
            if (k0 != null) {
                if (k0.length() > 0) {
                    final b.b e2 = a.e;
                    final String[] split = e2.k0.split(",");
                    this.getContext();
                    final int[] array = new int[split.length];
                    int i = 0;
                    int n2 = 0;
                    while (i < split.length) {
                        final int l = this.l(split[i].trim());
                        int n3 = n2;
                        if (l != 0) {
                            array[n2] = l;
                            n3 = n2 + 1;
                        }
                        ++i;
                        n2 = n3;
                    }
                    int[] copy = array;
                    if (n2 != split.length) {
                        copy = Arrays.copyOf(array, n2);
                    }
                    e2.j0 = copy;
                }
                else {
                    a.e.j0 = null;
                }
            }
        }
        ajc.b();
        if (a.e.j0 != null) {
            int n4 = n;
            while (true) {
                final int[] j2 = a.e.j0;
                if (n4 >= j2.length) {
                    break;
                }
                final ni6 ni6 = (ni6)sparseArray.get(j2[n4]);
                if (ni6 != null) {
                    ajc.a(ni6);
                }
                ++n4;
            }
        }
    }
    
    public final int o(final View view) {
        final int id = view.getId();
        final int n = -1;
        if (id == -1) {
            return -1;
        }
        this.H0 = null;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n;
            if (n2 >= this.E0) {
                break;
            }
            if (this.D0[n2] == id) {
                int n4 = n2;
                int e0;
                while (true) {
                    e0 = this.E0;
                    if (n4 >= e0 - 1) {
                        break;
                    }
                    final int[] d0 = this.D0;
                    final int n5 = n4 + 1;
                    d0[n4] = d0[n5];
                    n4 = n5;
                }
                this.D0[e0 - 1] = 0;
                this.E0 = e0 - 1;
                n3 = n2;
                break;
            }
            ++n2;
        }
        this.requestLayout();
        return n3;
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final String h0 = this.H0;
        if (h0 != null) {
            this.setIds(h0);
        }
        final String i0 = this.I0;
        if (i0 != null) {
            this.setReferenceTags(i0);
        }
    }
    
    public final void onDraw(final Canvas canvas) {
    }
    
    public void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(0, 0);
    }
    
    public void p(final ni6 ni6, final boolean b) {
    }
    
    public void q() {
    }
    
    public void r(final ConstraintLayout constraintLayout) {
        if (this.isInEditMode()) {
            this.setIds(this.H0);
        }
        final ajc g0 = this.G0;
        if (g0 == null) {
            return;
        }
        g0.b();
        for (int i = 0; i < this.E0; ++i) {
            final int n = this.D0[i];
            final View p = constraintLayout.p(n);
            View p2;
            if ((p2 = p) == null) {
                final String s = this.K0.get(n);
                final int k = this.k(constraintLayout, s);
                p2 = p;
                if (k != 0) {
                    this.D0[i] = k;
                    this.K0.put(k, s);
                    p2 = constraintLayout.p(k);
                }
            }
            if (p2 != null) {
                this.G0.a(constraintLayout.q(p2));
            }
        }
        final ajc g2 = this.G0;
        final oi6 f0 = constraintLayout.F0;
        ((yic)g2).c();
    }
    
    public final void s() {
        if (this.G0 == null) {
            return;
        }
        final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a)layoutParams).q0 = (ni6)this.G0;
        }
    }
    
    public void setIds(final String h0) {
        this.H0 = h0;
        if (h0 == null) {
            return;
        }
        int n = 0;
        this.E0 = 0;
        while (true) {
            final int index = h0.indexOf(44, n);
            if (index == -1) {
                break;
            }
            this.e(h0.substring(n, index));
            n = index + 1;
        }
        this.e(h0.substring(n));
    }
    
    public void setReferenceTags(final String i0) {
        this.I0 = i0;
        if (i0 == null) {
            return;
        }
        int n = 0;
        this.E0 = 0;
        while (true) {
            final int index = i0.indexOf(44, n);
            if (index == -1) {
                break;
            }
            this.g(i0.substring(n, index));
            n = index + 1;
        }
        this.g(i0.substring(n));
    }
    
    public void setReferencedIds(final int[] array) {
        this.H0 = null;
        int i = 0;
        this.E0 = 0;
        while (i < array.length) {
            this.f(array[i]);
            ++i;
        }
    }
    
    public final void setTag(final int n, final Object o) {
        super.setTag(n, o);
        if (o == null && this.H0 == null) {
            this.f(n);
        }
    }
}
