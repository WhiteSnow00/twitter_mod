import android.graphics.Rect;
import android.os.SystemClock;
import android.graphics.Canvas;
import java.util.Objects;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z81 extends vmb implements Runnable
{
    public int G0;
    public boolean H0;
    public float I0;
    public boolean J0;
    
    public z81(final Drawable drawable, final int g0) {
        Objects.requireNonNull(drawable);
        super(drawable);
        this.I0 = 0.0f;
        this.J0 = false;
        this.G0 = g0;
        this.H0 = true;
    }
    
    public final void draw(final Canvas canvas) {
        final int save = canvas.save();
        final Rect bounds = ((Drawable)this).getBounds();
        final int right = bounds.right;
        final int left = bounds.left;
        final int bottom = bounds.bottom;
        final int top = bounds.top;
        float i0 = this.I0;
        if (!this.H0) {
            i0 = 360.0f - i0;
        }
        canvas.rotate(i0, (float)((right - left) / 2 + left), (float)((bottom - top) / 2 + top));
        super.draw(canvas);
        canvas.restoreToCount(save);
        if (!this.J0) {
            this.J0 = true;
            ((Drawable)this).scheduleSelf((Runnable)this, SystemClock.uptimeMillis() + 20L);
        }
    }
    
    public final void run() {
        this.J0 = false;
        this.I0 += (int)(20.0f / this.G0 * 360.0f);
        ((Drawable)this).invalidateSelf();
    }
}
