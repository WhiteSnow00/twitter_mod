// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.card;

import android.view.accessibility.AccessibilityRecord;
import android.widget.FrameLayout;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.Rect;
import android.graphics.drawable.RippleDrawable;
import android.os.Build$VERSION;
import android.graphics.RectF;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;

public class MaterialCardView extends CardView implements Checkable, irp
{
    public static final int[] Q0;
    public static final int[] R0;
    public static final int[] S0;
    public final cng L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public MaterialCardView.MaterialCardView$a P0;
    
    static {
        Q0 = new int[] { 16842911 };
        R0 = new int[] { 16842912 };
        S0 = new int[] { 2130970703 };
    }
    
    public MaterialCardView(final Context context, final AttributeSet set) {
        super(ung.a(context, set, 2130970106, 2132019351), set, 2130970106);
        this.N0 = false;
        this.O0 = false;
        this.M0 = true;
        final TypedArray d = hks.d(((View)this).getContext(), set, rp2.k1, 2130970106, 2132019351, new int[0]);
        final cng l0 = new cng(this, set);
        (this.L0 = l0).g(super.getCardBackgroundColor());
        l0.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        l0.l();
        final ColorStateList b = ong.b(((View)l0.a).getContext(), d, 11);
        l0.n = b;
        if (b == null) {
            l0.n = ColorStateList.valueOf(-1);
        }
        l0.h = d.getDimensionPixelSize(12, 0);
        final boolean boolean1 = d.getBoolean(0, false);
        l0.s = boolean1;
        ((View)l0.a).setLongClickable(boolean1);
        l0.l = ong.b(((View)l0.a).getContext(), d, 6);
        l0.h(ong.d(((View)l0.a).getContext(), d, 2));
        l0.f = d.getDimensionPixelSize(5, 0);
        l0.e = d.getDimensionPixelSize(4, 0);
        l0.g = d.getInteger(3, 8388661);
        if ((l0.k = ong.b(((View)l0.a).getContext(), d, 7)) == null) {
            l0.k = ColorStateList.valueOf(dml.C((View)l0.a, 2130968954));
        }
        final ColorStateList b2 = ong.b(((View)l0.a).getContext(), d, 1);
        final qng d2 = l0.d;
        ColorStateList value;
        if ((value = b2) == null) {
            value = ColorStateList.valueOf(0);
        }
        d2.q(value);
        l0.n();
        l0.c.p(l0.a.getCardElevation());
        l0.o();
        l0.a.setBackgroundInternal(l0.e((Drawable)l0.c));
        Object i;
        if (((View)l0.a).isClickable()) {
            i = l0.d();
        }
        else {
            i = l0.d;
        }
        l0.i = (Drawable)i;
        ((FrameLayout)l0.a).setForeground(l0.e((Drawable)i));
        d.recycle();
    }
    
    private RectF getBoundsAsRectF() {
        final RectF rectF = new RectF();
        rectF.set(((Drawable)this.L0.c).getBounds());
        return rectF;
    }
    
    public final void d() {
        if (Build$VERSION.SDK_INT > 26) {
            final cng l0 = this.L0;
            final RippleDrawable o = l0.o;
            if (o != null) {
                final Rect bounds = ((Drawable)o).getBounds();
                final int bottom = bounds.bottom;
                ((Drawable)l0.o).setBounds(bounds.left, bounds.top, bounds.right, bottom - 1);
                ((Drawable)l0.o).setBounds(bounds.left, bounds.top, bounds.right, bottom);
            }
        }
    }
    
    public final boolean e() {
        final cng l0 = this.L0;
        return l0 != null && l0.s;
    }
    
    public ColorStateList getCardBackgroundColor() {
        return this.L0.c.C0.c;
    }
    
    public ColorStateList getCardForegroundColor() {
        return this.L0.d.C0.c;
    }
    
    public float getCardViewRadius() {
        return super.getRadius();
    }
    
    public Drawable getCheckedIcon() {
        return this.L0.j;
    }
    
    public int getCheckedIconGravity() {
        return this.L0.g;
    }
    
    public int getCheckedIconMargin() {
        return this.L0.e;
    }
    
    public int getCheckedIconSize() {
        return this.L0.f;
    }
    
    public ColorStateList getCheckedIconTint() {
        return this.L0.l;
    }
    
    public int getContentPaddingBottom() {
        return this.L0.b.bottom;
    }
    
    public int getContentPaddingLeft() {
        return this.L0.b.left;
    }
    
    public int getContentPaddingRight() {
        return this.L0.b.right;
    }
    
    public int getContentPaddingTop() {
        return this.L0.b.top;
    }
    
    public float getProgress() {
        return this.L0.c.C0.j;
    }
    
    public float getRadius() {
        return this.L0.c.l();
    }
    
    public ColorStateList getRippleColor() {
        return this.L0.k;
    }
    
    public pqp getShapeAppearanceModel() {
        return this.L0.m;
    }
    
    @Deprecated
    public int getStrokeColor() {
        final ColorStateList n = this.L0.n;
        int defaultColor;
        if (n == null) {
            defaultColor = -1;
        }
        else {
            defaultColor = n.getDefaultColor();
        }
        return defaultColor;
    }
    
    public ColorStateList getStrokeColorStateList() {
        return this.L0.n;
    }
    
    public int getStrokeWidth() {
        return this.L0.h;
    }
    
    public final boolean isChecked() {
        return this.N0;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ri4.b0((View)this, this.L0.c);
    }
    
    public final int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 3);
        if (this.e()) {
            View.mergeDrawableStates(onCreateDrawableState, MaterialCardView.Q0);
        }
        if (this.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, MaterialCardView.R0);
        }
        if (this.O0) {
            View.mergeDrawableStates(onCreateDrawableState, MaterialCardView.S0);
        }
        return onCreateDrawableState;
    }
    
    public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ((AccessibilityRecord)accessibilityEvent).setClassName((CharSequence)"androidx.cardview.widget.CardView");
        ((AccessibilityRecord)accessibilityEvent).setChecked(this.isChecked());
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(this.e());
        accessibilityNodeInfo.setClickable(((View)this).isClickable());
        accessibilityNodeInfo.setChecked(this.isChecked());
    }
    
    public final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        this.L0.f(((View)this).getMeasuredWidth(), ((View)this).getMeasuredHeight());
    }
    
    public void setBackground(final Drawable backgroundDrawable) {
        this.setBackgroundDrawable(backgroundDrawable);
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        if (this.M0) {
            if (!this.L0.r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.L0.r = true;
            }
            super.setBackgroundDrawable(backgroundDrawable);
        }
    }
    
    public void setBackgroundInternal(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
    }
    
    public void setCardBackgroundColor(final int n) {
        this.L0.g(ColorStateList.valueOf(n));
    }
    
    public void setCardBackgroundColor(final ColorStateList list) {
        this.L0.g(list);
    }
    
    public void setCardElevation(final float cardElevation) {
        super.setCardElevation(cardElevation);
        final cng l0 = this.L0;
        l0.c.p(l0.a.getCardElevation());
    }
    
    public void setCardForegroundColor(final ColorStateList list) {
        final qng d = this.L0.d;
        ColorStateList value = list;
        if (list == null) {
            value = ColorStateList.valueOf(0);
        }
        d.q(value);
    }
    
    public void setCheckable(final boolean s) {
        this.L0.s = s;
    }
    
    public void setChecked(final boolean b) {
        if (this.N0 != b) {
            this.toggle();
        }
    }
    
    public void setCheckedIcon(final Drawable drawable) {
        this.L0.h(drawable);
    }
    
    public void setCheckedIconGravity(final int g) {
        final cng l0 = this.L0;
        if (l0.g != g) {
            l0.g = g;
            l0.f(((View)l0.a).getMeasuredWidth(), ((View)l0.a).getMeasuredHeight());
        }
    }
    
    public void setCheckedIconMargin(final int e) {
        this.L0.e = e;
    }
    
    public void setCheckedIconMarginResource(final int n) {
        if (n != -1) {
            this.L0.e = ((View)this).getResources().getDimensionPixelSize(n);
        }
    }
    
    public void setCheckedIconResource(final int n) {
        this.L0.h(qli.g(((View)this).getContext(), n));
    }
    
    public void setCheckedIconSize(final int f) {
        this.L0.f = f;
    }
    
    public void setCheckedIconSizeResource(final int n) {
        if (n != 0) {
            this.L0.f = ((View)this).getResources().getDimensionPixelSize(n);
        }
    }
    
    public void setCheckedIconTint(final ColorStateList l) {
        final cng l2 = this.L0;
        l2.l = l;
        final Drawable j = l2.j;
        if (j != null) {
            pd9.b.h(j, l);
        }
    }
    
    public void setClickable(final boolean clickable) {
        super.setClickable(clickable);
        final cng l0 = this.L0;
        if (l0 != null) {
            l0.k();
        }
    }
    
    public void setDragged(final boolean o0) {
        if (this.O0 != o0) {
            this.O0 = o0;
            ((View)this).refreshDrawableState();
            this.d();
            ((View)this).invalidate();
        }
    }
    
    public void setMaxCardElevation(final float maxCardElevation) {
        super.setMaxCardElevation(maxCardElevation);
        this.L0.m();
    }
    
    public void setOnCheckedChangeListener(final MaterialCardView.MaterialCardView$a p) {
        this.P0 = p;
    }
    
    public void setPreventCornerOverlap(final boolean preventCornerOverlap) {
        super.setPreventCornerOverlap(preventCornerOverlap);
        this.L0.m();
        this.L0.l();
    }
    
    public void setProgress(final float n) {
        final cng l0 = this.L0;
        l0.c.r(n);
        final qng d = l0.d;
        if (d != null) {
            d.r(n);
        }
        final qng q = l0.q;
        if (q != null) {
            q.r(n);
        }
    }
    
    public void setRadius(final float radius) {
        super.setRadius(radius);
        final cng l0 = this.L0;
        l0.i(l0.m.f(radius));
        l0.i.invalidateSelf();
        if (l0.j() || (l0.a.getPreventCornerOverlap() && !l0.c.o())) {
            l0.l();
        }
        if (l0.j()) {
            l0.m();
        }
    }
    
    public void setRippleColor(final ColorStateList k) {
        final cng l0 = this.L0;
        l0.k = k;
        l0.n();
    }
    
    public void setRippleColorResource(final int n) {
        final cng l0 = this.L0;
        l0.k = qli.f(((View)this).getContext(), n);
        l0.n();
    }
    
    public void setShapeAppearanceModel(final pqp pqp) {
        ((View)this).setClipToOutline(pqp.e(this.getBoundsAsRectF()));
        this.L0.i(pqp);
    }
    
    public void setStrokeColor(final int n) {
        this.setStrokeColor(ColorStateList.valueOf(n));
    }
    
    public void setStrokeColor(final ColorStateList n) {
        final cng l0 = this.L0;
        if (l0.n != n) {
            l0.n = n;
            l0.o();
        }
        ((View)this).invalidate();
    }
    
    public void setStrokeWidth(final int h) {
        final cng l0 = this.L0;
        if (h != l0.h) {
            l0.h = h;
            l0.o();
        }
        ((View)this).invalidate();
    }
    
    public void setUseCompatPadding(final boolean useCompatPadding) {
        super.setUseCompatPadding(useCompatPadding);
        this.L0.m();
        this.L0.l();
    }
    
    public final void toggle() {
        if (this.e() && ((View)this).isEnabled()) {
            this.N0 ^= true;
            ((View)this).refreshDrawableState();
            this.d();
            final cng l0 = this.L0;
            final boolean n0 = this.N0;
            final Drawable j = l0.j;
            if (j != null) {
                int alpha;
                if (n0) {
                    alpha = 255;
                }
                else {
                    alpha = 0;
                }
                j.setAlpha(alpha);
            }
            final MaterialCardView.MaterialCardView$a p0 = this.P0;
            if (p0 != null) {
                p0.a();
            }
        }
    }
}
