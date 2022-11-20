// 
// Decompiled by Procyon v0.6.0
// 

package androidx.cardview.widget;

import android.view.View;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.widget.FrameLayout;

public class CardView extends FrameLayout
{
    public static final int[] K0;
    public static final j8a L0;
    public boolean D0;
    public boolean E0;
    public int F0;
    public int G0;
    public final Rect H0;
    public final Rect I0;
    public final CardView$a J0;
    
    static {
        K0 = new int[] { 16842801 };
        L0 = new j8a();
    }
    
    public CardView(final Context context, final AttributeSet set) {
        this(context, set, 2130968837);
    }
    
    public CardView(final Context context, final AttributeSet set, int n) {
        super(context, set, n);
        final Rect h0 = new Rect();
        this.H0 = h0;
        this.I0 = new Rect();
        final CardView$a j0 = new CardView$a(this);
        this.J0 = j0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ffz.h1, n, 2132017533);
        ColorStateList list;
        if (obtainStyledAttributes.hasValue(2)) {
            list = obtainStyledAttributes.getColorStateList(2);
        }
        else {
            final TypedArray obtainStyledAttributes2 = ((View)this).getContext().obtainStyledAttributes(CardView.K0);
            n = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            final float[] array = new float[3];
            Color.colorToHSV(n, array);
            if (array[2] > 0.5f) {
                n = ((View)this).getResources().getColor(2131099758);
            }
            else {
                n = ((View)this).getResources().getColor(2131099757);
            }
            list = ColorStateList.valueOf(n);
        }
        final float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        final float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        final float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.D0 = obtainStyledAttributes.getBoolean(7, false);
        this.E0 = obtainStyledAttributes.getBoolean(6, true);
        n = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        h0.left = obtainStyledAttributes.getDimensionPixelSize(10, n);
        h0.top = obtainStyledAttributes.getDimensionPixelSize(12, n);
        h0.right = obtainStyledAttributes.getDimensionPixelSize(11, n);
        h0.bottom = obtainStyledAttributes.getDimensionPixelSize(9, n);
        float n2 = dimension3;
        if (dimension2 > dimension3) {
            n2 = dimension2;
        }
        this.F0 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.G0 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        final j8a l0 = CardView.L0;
        ((View)this).setBackgroundDrawable(j0.a = new uko(list, dimension));
        ((View)this).setClipToOutline(true);
        ((View)this).setElevation(dimension2);
        l0.L((ok3)j0, n2);
    }
    
    public static void c(final CardView cardView, final int n, final int n2, final int n3, final int n4) {
        ((View)cardView).setPadding(n, n2, n3, n4);
    }
    
    public ColorStateList getCardBackgroundColor() {
        return CardView.L0.q((ok3)this.J0).h;
    }
    
    public float getCardElevation() {
        return ((View)this.J0.b).getElevation();
    }
    
    public int getContentPaddingBottom() {
        return this.H0.bottom;
    }
    
    public int getContentPaddingLeft() {
        return this.H0.left;
    }
    
    public int getContentPaddingRight() {
        return this.H0.right;
    }
    
    public int getContentPaddingTop() {
        return this.H0.top;
    }
    
    public float getMaxCardElevation() {
        return CardView.L0.t((ok3)this.J0);
    }
    
    public boolean getPreventCornerOverlap() {
        return this.E0;
    }
    
    public float getRadius() {
        return CardView.L0.u((ok3)this.J0);
    }
    
    public boolean getUseCompatPadding() {
        return this.D0;
    }
    
    public void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
    }
    
    public void setCardBackgroundColor(final int n) {
        final j8a l0 = CardView.L0;
        final CardView$a j0 = this.J0;
        final ColorStateList value = ColorStateList.valueOf(n);
        final uko q = l0.q((ok3)j0);
        q.b(value);
        q.invalidateSelf();
    }
    
    public void setCardBackgroundColor(final ColorStateList list) {
        final uko q = CardView.L0.q((ok3)this.J0);
        q.b(list);
        q.invalidateSelf();
    }
    
    public void setCardElevation(final float elevation) {
        ((View)this.J0.b).setElevation(elevation);
    }
    
    public void setMaxCardElevation(final float n) {
        CardView.L0.L((ok3)this.J0, n);
    }
    
    public void setMinimumHeight(final int g0) {
        super.setMinimumHeight(this.G0 = g0);
    }
    
    public void setMinimumWidth(final int f0) {
        super.setMinimumWidth(this.F0 = f0);
    }
    
    public final void setPadding(final int n, final int n2, final int n3, final int n4) {
    }
    
    public final void setPaddingRelative(final int n, final int n2, final int n3, final int n4) {
    }
    
    public void setPreventCornerOverlap(final boolean e0) {
        if (e0 != this.E0) {
            this.E0 = e0;
            final j8a l0 = CardView.L0;
            final CardView$a j0 = this.J0;
            l0.L((ok3)j0, l0.t((ok3)j0));
        }
    }
    
    public void setRadius(final float a) {
        final uko q = CardView.L0.q((ok3)this.J0);
        if (a != q.a) {
            q.a = a;
            q.c(null);
            q.invalidateSelf();
        }
    }
    
    public void setUseCompatPadding(final boolean d0) {
        if (this.D0 != d0) {
            this.D0 = d0;
            final j8a l0 = CardView.L0;
            final CardView$a j0 = this.J0;
            l0.L((ok3)j0, l0.t((ok3)j0));
        }
    }
}
