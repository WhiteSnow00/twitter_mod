// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.widget;

import android.view.View;
import java.util.Objects;
import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;

public final class c extends ViewGroup
{
    public b D0;
    
    public final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new c.c$a();
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new c.c$a(((View)this).getContext(), set);
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new ConstraintLayout.a(viewGroup$LayoutParams);
    }
    
    public b getConstraintSet() {
        if (this.D0 == null) {
            this.D0 = new b();
        }
        final b d0 = this.D0;
        Objects.requireNonNull(d0);
        final int childCount = this.getChildCount();
        d0.f.clear();
        for (int i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final c.c$a c$a = (c.c$a)child.getLayoutParams();
            final int id = child.getId();
            if (d0.e && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!d0.f.containsKey(id)) {
                d0.f.put(id, new b.a());
            }
            final b.a a = d0.f.get(id);
            if (a != null) {
                if (child instanceof a) {
                    final a a2 = (a)child;
                    a.d(id, c$a);
                    if (a2 instanceof Barrier) {
                        final b.b e = a.e;
                        e.i0 = 1;
                        final Barrier barrier = (Barrier)a2;
                        e.g0 = barrier.getType();
                        a.e.j0 = ((a)barrier).getReferencedIds();
                        a.e.h0 = barrier.getMargin();
                    }
                }
                a.d(id, c$a);
            }
        }
        return this.D0;
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
    }
}
