// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.imageview;

import android.view.View;
import android.graphics.Canvas;
import android.graphics.Path$Direction;
import android.content.res.TypedArray;
import android.view.ViewOutlineProvider;
import android.graphics.Paint$Style;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.util.AttributeSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.appcompat.widget.AppCompatImageView;

public class ShapeableImageView extends AppCompatImageView implements irp
{
    public final qqp F0;
    public final RectF G0;
    public final RectF H0;
    public final Paint I0;
    public final Paint J0;
    public final Path K0;
    public ColorStateList L0;
    public qng M0;
    public pqp N0;
    public float O0;
    public Path P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public boolean W0;
    
    public ShapeableImageView(Context context, final AttributeSet set) {
        super(ung.a(context, set, 0, 2132019407), set, 0);
        this.F0 = qqp$a.a;
        this.K0 = new Path();
        this.W0 = false;
        context = ((View)this).getContext();
        final Paint j0 = new Paint();
        (this.J0 = j0).setAntiAlias(true);
        j0.setColor(-1);
        j0.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
        this.G0 = new RectF();
        this.H0 = new RectF();
        this.P0 = new Path();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, rp2.v1, 0, 2132019407);
        this.L0 = ong.b(context, obtainStyledAttributes, 9);
        this.O0 = (float)obtainStyledAttributes.getDimensionPixelSize(10, 0);
        final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.Q0 = dimensionPixelSize;
        this.R0 = dimensionPixelSize;
        this.S0 = dimensionPixelSize;
        this.T0 = dimensionPixelSize;
        this.Q0 = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.R0 = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.S0 = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.T0 = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.U0 = obtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.V0 = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        final Paint i0 = new Paint();
        (this.I0 = i0).setStyle(Paint$Style.STROKE);
        i0.setAntiAlias(true);
        this.N0 = pqp.b(context, set, 0, 2132019407).a();
        ((View)this).setOutlineProvider((ViewOutlineProvider)new ShapeableImageView.ShapeableImageView$a(this));
    }
    
    public final boolean e() {
        return this.U0 != Integer.MIN_VALUE || this.V0 != Integer.MIN_VALUE;
    }
    
    public final boolean f() {
        final int layoutDirection = ((View)this).getLayoutDirection();
        boolean b = true;
        if (layoutDirection != 1) {
            b = false;
        }
        return b;
    }
    
    public final void g(final int n, final int n2) {
        this.G0.set((float)this.getPaddingLeft(), (float)this.getPaddingTop(), (float)(n - this.getPaddingRight()), (float)(n2 - this.getPaddingBottom()));
        this.F0.b(this.N0, 1.0f, this.G0, this.K0);
        this.P0.rewind();
        this.P0.addPath(this.K0);
        this.H0.set(0.0f, 0.0f, (float)n, (float)n2);
        this.P0.addRect(this.H0, Path$Direction.CCW);
    }
    
    public int getContentPaddingBottom() {
        return this.T0;
    }
    
    public final int getContentPaddingEnd() {
        final int v0 = this.V0;
        if (v0 != Integer.MIN_VALUE) {
            return v0;
        }
        int n;
        if (this.f()) {
            n = this.Q0;
        }
        else {
            n = this.S0;
        }
        return n;
    }
    
    public int getContentPaddingLeft() {
        if (this.e()) {
            if (this.f()) {
                final int v0 = this.V0;
                if (v0 != Integer.MIN_VALUE) {
                    return v0;
                }
            }
            if (!this.f()) {
                final int u0 = this.U0;
                if (u0 != Integer.MIN_VALUE) {
                    return u0;
                }
            }
        }
        return this.Q0;
    }
    
    public int getContentPaddingRight() {
        if (this.e()) {
            if (this.f()) {
                final int u0 = this.U0;
                if (u0 != Integer.MIN_VALUE) {
                    return u0;
                }
            }
            if (!this.f()) {
                final int v0 = this.V0;
                if (v0 != Integer.MIN_VALUE) {
                    return v0;
                }
            }
        }
        return this.S0;
    }
    
    public final int getContentPaddingStart() {
        final int u0 = this.U0;
        if (u0 != Integer.MIN_VALUE) {
            return u0;
        }
        int n;
        if (this.f()) {
            n = this.S0;
        }
        else {
            n = this.Q0;
        }
        return n;
    }
    
    public int getContentPaddingTop() {
        return this.R0;
    }
    
    public int getPaddingBottom() {
        return super.getPaddingBottom() - this.getContentPaddingBottom();
    }
    
    public int getPaddingEnd() {
        return super.getPaddingEnd() - this.getContentPaddingEnd();
    }
    
    public int getPaddingLeft() {
        return super.getPaddingLeft() - this.getContentPaddingLeft();
    }
    
    public int getPaddingRight() {
        return super.getPaddingRight() - this.getContentPaddingRight();
    }
    
    public int getPaddingStart() {
        return super.getPaddingStart() - this.getContentPaddingStart();
    }
    
    public int getPaddingTop() {
        return super.getPaddingTop() - this.getContentPaddingTop();
    }
    
    public pqp getShapeAppearanceModel() {
        return this.N0;
    }
    
    public ColorStateList getStrokeColor() {
        return this.L0;
    }
    
    public float getStrokeWidth() {
        return this.O0;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((View)this).setLayerType(2, (Paint)null);
    }
    
    public final void onDetachedFromWindow() {
        ((View)this).setLayerType(0, (Paint)null);
        super.onDetachedFromWindow();
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.P0, this.J0);
        if (this.L0 != null) {
            this.I0.setStrokeWidth(this.O0);
            final int colorForState = this.L0.getColorForState(((View)this).getDrawableState(), this.L0.getDefaultColor());
            if (this.O0 > 0.0f && colorForState != 0) {
                this.I0.setColor(colorForState);
                canvas.drawPath(this.K0, this.I0);
            }
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        if (this.W0) {
            return;
        }
        if (!((View)this).isLayoutDirectionResolved()) {
            return;
        }
        this.W0 = true;
        if (!((View)this).isPaddingRelative() && !this.e()) {
            this.setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            return;
        }
        this.setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
    }
    
    public final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.g(n, n2);
    }
    
    public final void setPadding(final int n, final int n2, final int n3, final int n4) {
        super.setPadding(this.getContentPaddingLeft() + n, this.getContentPaddingTop() + n2, this.getContentPaddingRight() + n3, this.getContentPaddingBottom() + n4);
    }
    
    public final void setPaddingRelative(final int n, final int n2, final int n3, final int n4) {
        super.setPaddingRelative(this.getContentPaddingStart() + n, this.getContentPaddingTop() + n2, this.getContentPaddingEnd() + n3, this.getContentPaddingBottom() + n4);
    }
    
    public void setShapeAppearanceModel(final pqp pqp) {
        this.N0 = pqp;
        final qng m0 = this.M0;
        if (m0 != null) {
            m0.setShapeAppearanceModel(pqp);
        }
        this.g(((View)this).getWidth(), ((View)this).getHeight());
        ((View)this).invalidate();
        ((View)this).invalidateOutline();
    }
    
    public void setStrokeColor(final ColorStateList l0) {
        this.L0 = l0;
        ((View)this).invalidate();
    }
    
    public void setStrokeColorResource(final int n) {
        this.setStrokeColor(qli.f(((View)this).getContext(), n));
    }
    
    public void setStrokeWidth(final float o0) {
        if (this.O0 != o0) {
            this.O0 = o0;
            ((View)this).invalidate();
        }
    }
    
    public void setStrokeWidthResource(final int n) {
        this.setStrokeWidth((float)((View)this).getResources().getDimensionPixelSize(n));
    }
}
