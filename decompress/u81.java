import android.graphics.Rect;
import android.os.SystemClock;
import android.graphics.Canvas;
import java.util.Objects;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u81 extends tlb implements Runnable
{
    public int H0;
    public boolean I0;
    public float J0;
    public boolean K0;
    
    public u81(final Drawable drawable, final int h0) {
        Objects.requireNonNull(drawable);
        super(drawable);
        this.J0 = 0.0f;
        this.K0 = false;
        this.H0 = h0;
        this.I0 = true;
    }
    
    public final void draw(final Canvas canvas) {
        final int save = canvas.save();
        final Rect bounds = ((Drawable)this).getBounds();
        final int right = bounds.right;
        final int left = bounds.left;
        final int bottom = bounds.bottom;
        final int top = bounds.top;
        float j0 = this.J0;
        if (!this.I0) {
            j0 = 360.0f - j0;
        }
        canvas.rotate(j0, (float)((right - left) / 2 + left), (float)((bottom - top) / 2 + top));
        super.draw(canvas);
        canvas.restoreToCount(save);
        if (!this.K0) {
            this.K0 = true;
            ((Drawable)this).scheduleSelf((Runnable)this, SystemClock.uptimeMillis() + 20L);
        }
    }
    
    public final void run() {
        this.K0 = false;
        this.J0 += (int)(20.0f / this.H0 * 360.0f);
        ((Drawable)this).invalidateSelf();
    }
}
