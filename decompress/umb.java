import android.annotation.TargetApi;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public class umb extends Drawable implements Drawable$Callback, mzt, lzt, ge9
{
    public static final Matrix I0;
    public Drawable F0;
    public final he9 G0;
    public mzt H0;
    
    static {
        I0 = new Matrix();
    }
    
    public umb(final Drawable f0) {
        this.G0 = new he9();
        ke9.c(this.F0 = f0, (Drawable$Callback)this, (mzt)this);
    }
    
    public void c(final Matrix matrix) {
        this.n(matrix);
    }
    
    public final Drawable d(final Drawable drawable) {
        return this.o(drawable);
    }
    
    public void draw(final Canvas canvas) {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            f0.draw(canvas);
        }
    }
    
    public final void f(final mzt h0) {
        this.H0 = h0;
    }
    
    public final Drawable$ConstantState getConstantState() {
        final Drawable f0 = this.F0;
        if (f0 == null) {
            return super.getConstantState();
        }
        return f0.getConstantState();
    }
    
    public final Drawable getCurrent() {
        return this.F0;
    }
    
    public int getIntrinsicHeight() {
        final Drawable f0 = this.F0;
        if (f0 == null) {
            return super.getIntrinsicHeight();
        }
        return f0.getIntrinsicHeight();
    }
    
    public int getIntrinsicWidth() {
        final Drawable f0 = this.F0;
        if (f0 == null) {
            return super.getIntrinsicWidth();
        }
        return f0.getIntrinsicWidth();
    }
    
    public final int getOpacity() {
        final Drawable f0 = this.F0;
        if (f0 == null) {
            return 0;
        }
        return f0.getOpacity();
    }
    
    public final boolean getPadding(final Rect rect) {
        final Drawable f0 = this.F0;
        if (f0 == null) {
            return super.getPadding(rect);
        }
        return f0.getPadding(rect);
    }
    
    public final void i(final RectF rectF) {
        final mzt h0 = this.H0;
        if (h0 != null) {
            h0.i(rectF);
        }
        else {
            rectF.set(this.getBounds());
        }
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        this.invalidateSelf();
    }
    
    public final boolean isStateful() {
        final Drawable f0 = this.F0;
        return f0 != null && f0.isStateful();
    }
    
    public final Drawable k() {
        return this.F0;
    }
    
    public final Drawable mutate() {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            f0.mutate();
        }
        return this;
    }
    
    public final void n(final Matrix matrix) {
        final mzt h0 = this.H0;
        if (h0 != null) {
            h0.c(matrix);
        }
        else {
            matrix.reset();
        }
    }
    
    public Drawable o(final Drawable f0) {
        final Drawable f2 = this.F0;
        ke9.c(f2, (Drawable$Callback)null, (mzt)null);
        ke9.c(f0, (Drawable$Callback)null, (mzt)null);
        ke9.d(f0, this.G0);
        ke9.a(f0, (Drawable)this);
        ke9.c(f0, (Drawable$Callback)this, (mzt)this);
        this.F0 = f0;
        this.invalidateSelf();
        return f2;
    }
    
    public void onBoundsChange(final Rect bounds) {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            f0.setBounds(bounds);
        }
    }
    
    public final boolean onLevelChange(final int level) {
        final Drawable f0 = this.F0;
        if (f0 == null) {
            return super.onLevelChange(level);
        }
        return f0.setLevel(level);
    }
    
    public final boolean onStateChange(final int[] state) {
        final Drawable f0 = this.F0;
        if (f0 == null) {
            return super.onStateChange(state);
        }
        return f0.setState(state);
    }
    
    public final void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        this.scheduleSelf(runnable, n);
    }
    
    public final void setAlpha(final int n) {
        this.G0.a = n;
        final Drawable f0 = this.F0;
        if (f0 != null) {
            f0.setAlpha(n);
        }
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.G0.a(colorFilter);
        final Drawable f0 = this.F0;
        if (f0 != null) {
            f0.setColorFilter(colorFilter);
        }
    }
    
    public final void setDither(final boolean b) {
        this.G0.d = (b ? 1 : 0);
        final Drawable f0 = this.F0;
        if (f0 != null) {
            f0.setDither(b);
        }
    }
    
    public final void setFilterBitmap(final boolean b) {
        this.G0.e = (b ? 1 : 0);
        final Drawable f0 = this.F0;
        if (f0 != null) {
            f0.setFilterBitmap(b);
        }
    }
    
    @TargetApi(21)
    public final void setHotspot(final float n, final float n2) {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            f0.setHotspot(n, n2);
        }
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        final boolean setVisible = super.setVisible(b, b2);
        final Drawable f0 = this.F0;
        if (f0 == null) {
            return setVisible;
        }
        return f0.setVisible(b, b2);
    }
    
    public final void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}
