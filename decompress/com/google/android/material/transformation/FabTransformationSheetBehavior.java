// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.transformation;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout$f;
import java.util.HashMap;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import java.util.Map;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior
{
    public Map<View, Integer> i;
    
    public FabTransformationSheetBehavior() {
    }
    
    public FabTransformationSheetBehavior(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    @Override
    public final FabTransformationBehavior$b B(final Context context, final boolean b) {
        int n;
        if (b) {
            n = 2130837555;
        }
        else {
            n = 2130837554;
        }
        final FabTransformationBehavior$b fabTransformationBehavior$b = new FabTransformationBehavior$b();
        fabTransformationBehavior$b.a = yrh.b(context, n);
        fabTransformationBehavior$b.b = new xd();
        return fabTransformationBehavior$b;
    }
    
    public final void t(final View view, final View view2, final boolean b, final boolean b2) {
        final ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            final CoordinatorLayout coordinatorLayout = (CoordinatorLayout)parent;
            final int childCount = ((ViewGroup)coordinatorLayout).getChildCount();
            if (b) {
                this.i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; ++i) {
                final View child = ((ViewGroup)coordinatorLayout).getChildAt(i);
                final boolean b3 = child.getLayoutParams() instanceof CoordinatorLayout$f && ((CoordinatorLayout$f)child.getLayoutParams()).a instanceof FabTransformationScrimBehavior;
                if (child != view2) {
                    if (!b3) {
                        if (!b) {
                            final HashMap j = this.i;
                            if (j != null && j.containsKey(child)) {
                                final int intValue = this.i.get(child);
                                final WeakHashMap a = b7x.a;
                                b7x$d.s(child, intValue);
                            }
                        }
                        else {
                            this.i.put(child, child.getImportantForAccessibility());
                            final WeakHashMap a2 = b7x.a;
                            b7x$d.s(child, 4);
                        }
                    }
                }
            }
            if (!b) {
                this.i = null;
            }
        }
        super.t(view, view2, b, b2);
    }
}
