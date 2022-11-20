import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Canvas;
import androidx.appcompat.widget.ActionBarContainer;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rj extends Drawable
{
    public final ActionBarContainer a;
    
    public rj(final ActionBarContainer a) {
        this.a = a;
    }
    
    public final void draw(final Canvas canvas) {
        final ActionBarContainer a = this.a;
        if (a.K0) {
            final Drawable j0 = a.J0;
            if (j0 != null) {
                j0.draw(canvas);
            }
        }
        else {
            final Drawable h0 = a.H0;
            if (h0 != null) {
                h0.draw(canvas);
            }
            final ActionBarContainer a2 = this.a;
            final Drawable i0 = a2.I0;
            if (i0 != null && a2.L0) {
                i0.draw(canvas);
            }
        }
    }
    
    public final int getOpacity() {
        return 0;
    }
    
    public final void getOutline(final Outline outline) {
        final ActionBarContainer a = this.a;
        if (a.K0) {
            if (a.J0 != null) {
                a.H0.getOutline(outline);
            }
        }
        else {
            final Drawable h0 = a.H0;
            if (h0 != null) {
                h0.getOutline(outline);
            }
        }
    }
    
    public final void setAlpha(final int n) {
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
    }
}
