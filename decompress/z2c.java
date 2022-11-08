import android.graphics.Canvas;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.graphics.Paint;
import android.graphics.Matrix;
import android.view.View;
import android.annotation.SuppressLint;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "ViewConstructor" })
public final class z2c extends ViewGroup implements x2c
{
    public ViewGroup C0;
    public View D0;
    public final View E0;
    public int F0;
    public Matrix G0;
    public final z2c$a H0;
    
    public z2c(final View e0) {
        super(e0.getContext());
        this.H0 = new z2c$a(this);
        this.E0 = e0;
        ((View)this).setWillNotDraw(false);
        ((View)this).setLayerType(2, (Paint)null);
    }
    
    public static void b(final View view, final View view2) {
        rbx.b(view2, view2.getLeft(), view2.getTop(), view.getWidth() + view2.getLeft(), view.getHeight() + view2.getTop());
    }
    
    public static z2c c(final View view) {
        return (z2c)view.getTag(2131429332);
    }
    
    public final void a(final ViewGroup c0, final View d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E0.setTag(2131429332, (Object)this);
        this.E0.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.H0);
        rbx.d(this.E0, 4);
        if (this.E0.getParent() != null) {
            ((View)this.E0.getParent()).invalidate();
        }
    }
    
    public final void onDetachedFromWindow() {
        this.E0.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.H0);
        rbx.d(this.E0, 0);
        this.E0.setTag(2131429332, (Object)null);
        if (this.E0.getParent() != null) {
            ((View)this.E0.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }
    
    public final void onDraw(final Canvas canvas) {
        wg3.a(canvas, true);
        canvas.setMatrix(this.G0);
        rbx.d(this.E0, 0);
        this.E0.invalidate();
        rbx.d(this.E0, 4);
        this.drawChild(canvas, this.E0, ((View)this).getDrawingTime());
        wg3.a(canvas, false);
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
    }
    
    public final void setVisibility(int visibility) {
        super.setVisibility(visibility);
        if (c(this.E0) == this) {
            if (visibility == 0) {
                visibility = 4;
            }
            else {
                visibility = 0;
            }
            rbx.d(this.E0, visibility);
        }
    }
}
