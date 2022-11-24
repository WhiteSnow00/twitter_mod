import android.graphics.Rect;
import android.os.SystemClock;
import android.graphics.Canvas;
import java.util.Objects;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z81 extends umb implements Runnable
{
    public int J0;
    public boolean K0;
    public float L0;
    public boolean M0;
    
    public z81(final Drawable drawable, final int j0) {
        Objects.requireNonNull(drawable);
        super(drawable);
        this.L0 = 0.0f;
        this.M0 = false;
        this.J0 = j0;
        this.K0 = true;
    }
    
    @Override
    public final void draw(final Canvas canvas) {
        final int save = canvas.save();
        final Rect bounds = this.getBounds();
        final int right = bounds.right;
        final int left = bounds.left;
        final int bottom = bounds.bottom;
        final int top = bounds.top;
        float l0 = this.L0;
        if (!this.K0) {
            l0 = 360.0f - l0;
        }
        canvas.rotate(l0, (float)((right - left) / 2 + left), (float)((bottom - top) / 2 + top));
        super.draw(canvas);
        canvas.restoreToCount(save);
        if (!this.M0) {
            this.M0 = true;
            this.scheduleSelf((Runnable)this, SystemClock.uptimeMillis() + 20L);
        }
    }
    
    @Override
    public final void run() {
        this.M0 = false;
        this.L0 += (int)(20.0f / this.J0 * 360.0f);
        this.invalidateSelf();
    }
}
