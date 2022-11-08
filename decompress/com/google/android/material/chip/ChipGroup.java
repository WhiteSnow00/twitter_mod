// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.chip;

import java.util.Iterator;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo$CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.ViewGroup;
import java.util.List;
import android.view.ViewGroup$LayoutParams;
import java.util.WeakHashMap;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup$OnHierarchyChangeListener;
import android.util.AttributeSet;
import android.content.Context;

public class ChipGroup extends aab
{
    public int G0;
    public int H0;
    public ChipGroup$d I0;
    public final k74<Chip> J0;
    public final int K0;
    public final ChipGroup.ChipGroup$e L0;
    
    public ChipGroup(final Context context, final AttributeSet set) {
        super(ung.a(context, set, 2130968887, 2132019357), set, 2130968887);
        final k74 j0 = new k74();
        this.J0 = (k74<Chip>)j0;
        final ChipGroup.ChipGroup$e chipGroup$e = new ChipGroup.ChipGroup$e(this);
        this.L0 = chipGroup$e;
        final TypedArray d = hks.d(((View)this).getContext(), set, rp2.T0, 2130968887, 2132019357, new int[0]);
        final int dimensionPixelOffset = d.getDimensionPixelOffset(1, 0);
        this.setChipSpacingHorizontal(d.getDimensionPixelOffset(2, dimensionPixelOffset));
        this.setChipSpacingVertical(d.getDimensionPixelOffset(3, dimensionPixelOffset));
        this.setSingleLine(d.getBoolean(5, false));
        this.setSingleSelection(d.getBoolean(6, false));
        this.setSelectionRequired(d.getBoolean(4, false));
        this.K0 = d.getResourceId(0, -1);
        d.recycle();
        j0.c = (k74$a)new b(this);
        super.setOnHierarchyChangeListener((ViewGroup$OnHierarchyChangeListener)chipGroup$e);
        final WeakHashMap a = p5x.a;
        p5x$d.s((View)this, 1);
    }
    
    private int getChipCount() {
        int i = 0;
        int n = 0;
        while (i < ((ViewGroup)this).getChildCount()) {
            int n2 = n;
            if (((ViewGroup)this).getChildAt(i) instanceof Chip) {
                n2 = n + 1;
            }
            ++i;
            n = n2;
        }
        return n;
    }
    
    public final boolean a() {
        return super.E0;
    }
    
    public final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return super.checkLayoutParams(viewGroup$LayoutParams) && viewGroup$LayoutParams instanceof ChipGroup.ChipGroup$b;
    }
    
    public final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new ChipGroup.ChipGroup$b();
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new ChipGroup.ChipGroup$b(((View)this).getContext(), set);
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new ChipGroup.ChipGroup$b(viewGroup$LayoutParams);
    }
    
    public int getCheckedChipId() {
        return this.J0.c();
    }
    
    public List<Integer> getCheckedChipIds() {
        return this.J0.b((ViewGroup)this);
    }
    
    public int getChipSpacingHorizontal() {
        return this.G0;
    }
    
    public int getChipSpacingVertical() {
        return this.H0;
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        final int k0 = this.K0;
        if (k0 != -1) {
            final k74<Chip> j0 = this.J0;
            final eng eng = j0.a.get(k0);
            if (eng != null) {
                if (j0.a(eng)) {
                    j0.d();
                }
            }
        }
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int chipCount;
        if (super.E0) {
            chipCount = this.getChipCount();
        }
        else {
            chipCount = -1;
        }
        final int rowCount = this.getRowCount();
        int n;
        if (this.J0.d) {
            n = 1;
        }
        else {
            n = 2;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo$CollectionInfo)ng$b.a(rowCount, chipCount, n).a);
    }
    
    public void setChipSpacing(final int n) {
        this.setChipSpacingHorizontal(n);
        this.setChipSpacingVertical(n);
    }
    
    public void setChipSpacingHorizontal(final int g0) {
        if (this.G0 != g0) {
            this.setItemSpacing(this.G0 = g0);
            ((View)this).requestLayout();
        }
    }
    
    public void setChipSpacingHorizontalResource(final int n) {
        this.setChipSpacingHorizontal(((View)this).getResources().getDimensionPixelOffset(n));
    }
    
    public void setChipSpacingResource(final int n) {
        this.setChipSpacing(((View)this).getResources().getDimensionPixelOffset(n));
    }
    
    public void setChipSpacingVertical(final int h0) {
        if (this.H0 != h0) {
            this.setLineSpacing(this.H0 = h0);
            ((View)this).requestLayout();
        }
    }
    
    public void setChipSpacingVerticalResource(final int n) {
        this.setChipSpacingVertical(((View)this).getResources().getDimensionPixelOffset(n));
    }
    
    @Deprecated
    public void setDividerDrawableHorizontal(final Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }
    
    @Deprecated
    public void setDividerDrawableVertical(final Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }
    
    @Deprecated
    public void setFlexWrap(final int n) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }
    
    @Deprecated
    public void setOnCheckedChangeListener(final ChipGroup$c chipGroup$c) {
        if (chipGroup$c == null) {
            this.setOnCheckedStateChangeListener(null);
            return;
        }
        this.setOnCheckedStateChangeListener((ChipGroup$d)new ChipGroup$d() {});
    }
    
    public void setOnCheckedStateChangeListener(final ChipGroup$d i0) {
        this.I0 = i0;
    }
    
    public void setOnHierarchyChangeListener(final ViewGroup$OnHierarchyChangeListener c0) {
        this.L0.C0 = c0;
    }
    
    public void setSelectionRequired(final boolean e) {
        this.J0.e = e;
    }
    
    @Deprecated
    public void setShowDividerHorizontal(final int n) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }
    
    @Deprecated
    public void setShowDividerVertical(final int n) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }
    
    public void setSingleLine(final int n) {
        this.setSingleLine(((View)this).getResources().getBoolean(n));
    }
    
    public void setSingleLine(final boolean singleLine) {
        super.setSingleLine(singleLine);
    }
    
    public void setSingleSelection(final int n) {
        this.setSingleSelection(((View)this).getResources().getBoolean(n));
    }
    
    public void setSingleSelection(final boolean d) {
        final k74<Chip> j0 = this.J0;
        if (j0.d != d) {
            j0.d = d;
            final boolean empty = j0.b.isEmpty();
            final Iterator iterator = j0.a.values().iterator();
            while (iterator.hasNext()) {
                j0.e((eng)iterator.next(), false);
            }
            if (empty ^ true) {
                j0.d();
            }
        }
    }
}
