import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zng extends tlb
{
    public int H0;
    public int I0;
    
    public final void c(final Matrix matrix) {
        this.n(matrix);
    }
    
    public final void draw(final Canvas canvas) {
        if (this.H0 != super.D0.getIntrinsicWidth() || this.I0 != super.D0.getIntrinsicHeight()) {
            this.p();
        }
        super.draw(canvas);
    }
    
    public final Drawable o(Drawable o) {
        o = super.o(o);
        this.p();
        return o;
    }
    
    public final void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        this.p();
    }
    
    public final void p() {
        final Drawable d0 = super.D0;
        final Rect bounds = ((Drawable)this).getBounds();
        final int intrinsicWidth = d0.getIntrinsicWidth();
        this.H0 = intrinsicWidth;
        final int intrinsicHeight = d0.getIntrinsicHeight();
        this.I0 = intrinsicHeight;
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            d0.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        else {
            d0.setBounds(bounds);
        }
    }
}
