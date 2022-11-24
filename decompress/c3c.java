import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.WeakHashMap;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.graphics.Matrix;
import android.view.View;
import android.annotation.SuppressLint;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "ViewConstructor" })
public final class c3c extends ViewGroup implements a3c
{
    public static final int L0 = 0;
    public ViewGroup F0;
    public View G0;
    public final View H0;
    public int I0;
    public Matrix J0;
    public final c3c$a K0;
    
    public c3c(final View h0) {
        super(h0.getContext());
        this.K0 = new ViewTreeObserver$OnPreDrawListener(this) {
            public final c3c F0;
            
            public final boolean onPreDraw() {
                final c3c f0 = this.F0;
                final WeakHashMap a = b7x.a;
                b7x$d.k((View)f0);
                final c3c f2 = this.F0;
                final ViewGroup f3 = f2.F0;
                if (f3 != null) {
                    final View g0 = f2.G0;
                    if (g0 != null) {
                        f3.endViewTransition(g0);
                        b7x$d.k((View)this.F0.F0);
                        final c3c f4 = this.F0;
                        f4.F0 = null;
                        f4.G0 = null;
                    }
                }
                return true;
            }
        };
        this.H0 = h0;
        ((View)this).setWillNotDraw(false);
        ((View)this).setLayerType(2, (Paint)null);
    }
    
    public static void b(final View view, final View view2) {
        fdx.b(view2, view2.getLeft(), view2.getTop(), view.getWidth() + view2.getLeft(), view.getHeight() + view2.getTop());
    }
    
    public static c3c c(final View view) {
        return (c3c)view.getTag(2131429333);
    }
    
    public final void a(final ViewGroup f0, final View g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H0.setTag(2131429333, (Object)this);
        this.H0.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.K0);
        fdx.d(this.H0, 4);
        if (this.H0.getParent() != null) {
            ((View)this.H0.getParent()).invalidate();
        }
    }
    
    public final void onDetachedFromWindow() {
        this.H0.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.K0);
        fdx.d(this.H0, 0);
        this.H0.setTag(2131429333, (Object)null);
        if (this.H0.getParent() != null) {
            ((View)this.H0.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }
    
    public final void onDraw(final Canvas canvas) {
        fh3.a(canvas, true);
        canvas.setMatrix(this.J0);
        fdx.d(this.H0, 0);
        this.H0.invalidate();
        fdx.d(this.H0, 4);
        this.drawChild(canvas, this.H0, ((View)this).getDrawingTime());
        fh3.a(canvas, false);
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
    }
    
    public final void setVisibility(int visibility) {
        super.setVisibility(visibility);
        if (c(this.H0) == this) {
            if (visibility == 0) {
                visibility = 4;
            }
            else {
                visibility = 0;
            }
            fdx.d(this.H0, visibility);
        }
    }
}
