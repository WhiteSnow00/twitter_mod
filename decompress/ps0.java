import android.annotation.TargetApi;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public class ps0 extends Drawable implements Drawable$Callback, mzt, lzt
{
    public mzt F0;
    public final he9 G0;
    public final Drawable[] H0;
    public final ge9[] I0;
    public final Rect J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    
    public ps0(Drawable[] h0) {
        this.G0 = new he9();
        this.J0 = new Rect();
        int n = 0;
        this.K0 = false;
        this.L0 = false;
        this.M0 = false;
        this.H0 = h0;
        while (true) {
            h0 = this.H0;
            if (n >= h0.length) {
                break;
            }
            ke9.c(h0[n], (Drawable$Callback)this, (mzt)this);
            ++n;
        }
        this.I0 = new ge9[h0.length];
    }
    
    public final Drawable a(final int n) {
        final boolean b = true;
        xd.D(n >= 0);
        xd.D(n < this.H0.length && b);
        return this.H0[n];
    }
    
    public final Drawable b(final int n, final Drawable drawable) {
        final boolean b = true;
        xd.D(n >= 0);
        xd.D(n < this.H0.length && b);
        final Drawable drawable2 = this.H0[n];
        if (drawable != drawable2) {
            if (drawable != null && this.M0) {
                drawable.mutate();
            }
            ke9.c(this.H0[n], (Drawable$Callback)null, (mzt)null);
            ke9.c(drawable, (Drawable$Callback)null, (mzt)null);
            ke9.d(drawable, this.G0);
            ke9.a(drawable, (Drawable)this);
            ke9.c(drawable, (Drawable$Callback)this, (mzt)this);
            this.L0 = false;
            this.H0[n] = drawable;
            this.invalidateSelf();
        }
        return drawable2;
    }
    
    public final void c(final Matrix matrix) {
        final mzt f0 = this.F0;
        if (f0 != null) {
            f0.c(matrix);
        }
        else {
            matrix.reset();
        }
    }
    
    public void draw(final Canvas canvas) {
        int n = 0;
        while (true) {
            final Drawable[] h0 = this.H0;
            if (n >= h0.length) {
                break;
            }
            final Drawable drawable = h0[n];
            if (drawable != null) {
                drawable.draw(canvas);
            }
            ++n;
        }
    }
    
    public final void f(final mzt f0) {
        this.F0 = f0;
    }
    
    public final int getIntrinsicHeight() {
        final int n = -1;
        int n2 = 0;
        int n3 = -1;
        while (true) {
            final Drawable[] h0 = this.H0;
            if (n2 >= h0.length) {
                break;
            }
            final Drawable drawable = h0[n2];
            int max = n3;
            if (drawable != null) {
                max = Math.max(n3, drawable.getIntrinsicHeight());
            }
            ++n2;
            n3 = max;
        }
        int n4 = n;
        if (n3 > 0) {
            n4 = n3;
        }
        return n4;
    }
    
    public final int getIntrinsicWidth() {
        final int n = -1;
        int n2 = 0;
        int n3 = -1;
        while (true) {
            final Drawable[] h0 = this.H0;
            if (n2 >= h0.length) {
                break;
            }
            final Drawable drawable = h0[n2];
            int max = n3;
            if (drawable != null) {
                max = Math.max(n3, drawable.getIntrinsicWidth());
            }
            ++n2;
            n3 = max;
        }
        int n4 = n;
        if (n3 > 0) {
            n4 = n3;
        }
        return n4;
    }
    
    public final int getOpacity() {
        if (this.H0.length == 0) {
            return -2;
        }
        int n = -1;
        int n2 = 1;
        while (true) {
            final Drawable[] h0 = this.H0;
            if (n2 >= h0.length) {
                break;
            }
            final Drawable drawable = h0[n2];
            int resolveOpacity = n;
            if (drawable != null) {
                resolveOpacity = Drawable.resolveOpacity(n, drawable.getOpacity());
            }
            ++n2;
            n = resolveOpacity;
        }
        return n;
    }
    
    public final boolean getPadding(final Rect rect) {
        int n = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        final Rect j0 = this.J0;
        while (true) {
            final Drawable[] h0 = this.H0;
            if (n >= h0.length) {
                break;
            }
            final Drawable drawable = h0[n];
            if (drawable != null) {
                drawable.getPadding(j0);
                rect.left = Math.max(rect.left, j0.left);
                rect.top = Math.max(rect.top, j0.top);
                rect.right = Math.max(rect.right, j0.right);
                rect.bottom = Math.max(rect.bottom, j0.bottom);
            }
            ++n;
        }
        return true;
    }
    
    public final void i(final RectF rectF) {
        final mzt f0 = this.F0;
        if (f0 != null) {
            f0.i(rectF);
        }
        else {
            rectF.set(this.getBounds());
        }
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        this.invalidateSelf();
    }
    
    public final boolean isStateful() {
        if (!this.L0) {
            this.K0 = false;
            int n = 0;
            while (true) {
                final Drawable[] h0 = this.H0;
                final int length = h0.length;
                boolean b = true;
                if (n >= length) {
                    break;
                }
                final Drawable drawable = h0[n];
                final boolean k0 = this.K0;
                if (drawable == null || !drawable.isStateful()) {
                    b = false;
                }
                this.K0 = (k0 | b);
                ++n;
            }
            this.L0 = true;
        }
        return this.K0;
    }
    
    public final Drawable mutate() {
        int n = 0;
        while (true) {
            final Drawable[] h0 = this.H0;
            if (n >= h0.length) {
                break;
            }
            final Drawable drawable = h0[n];
            if (drawable != null) {
                drawable.mutate();
            }
            ++n;
        }
        this.M0 = true;
        return this;
    }
    
    public final void onBoundsChange(final Rect bounds) {
        int n = 0;
        while (true) {
            final Drawable[] h0 = this.H0;
            if (n >= h0.length) {
                break;
            }
            final Drawable drawable = h0[n];
            if (drawable != null) {
                drawable.setBounds(bounds);
            }
            ++n;
        }
    }
    
    public final boolean onLevelChange(final int level) {
        int n = 0;
        boolean b = false;
        while (true) {
            final Drawable[] h0 = this.H0;
            if (n >= h0.length) {
                break;
            }
            final Drawable drawable = h0[n];
            boolean b2 = b;
            if (drawable != null) {
                b2 = b;
                if (drawable.setLevel(level)) {
                    b2 = true;
                }
            }
            ++n;
            b = b2;
        }
        return b;
    }
    
    public final boolean onStateChange(final int[] state) {
        int n = 0;
        boolean b = false;
        while (true) {
            final Drawable[] h0 = this.H0;
            if (n >= h0.length) {
                break;
            }
            final Drawable drawable = h0[n];
            boolean b2 = b;
            if (drawable != null) {
                b2 = b;
                if (drawable.setState(state)) {
                    b2 = true;
                }
            }
            ++n;
            b = b2;
        }
        return b;
    }
    
    public final void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        this.scheduleSelf(runnable, n);
    }
    
    public void setAlpha(final int n) {
        this.G0.a = n;
        int n2 = 0;
        while (true) {
            final Drawable[] h0 = this.H0;
            if (n2 >= h0.length) {
                break;
            }
            final Drawable drawable = h0[n2];
            if (drawable != null) {
                drawable.setAlpha(n);
            }
            ++n2;
        }
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.G0.a(colorFilter);
        int n = 0;
        while (true) {
            final Drawable[] h0 = this.H0;
            if (n >= h0.length) {
                break;
            }
            final Drawable drawable = h0[n];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            ++n;
        }
    }
    
    public final void setDither(final boolean b) {
        this.G0.d = (b ? 1 : 0);
        int n = 0;
        while (true) {
            final Drawable[] h0 = this.H0;
            if (n >= h0.length) {
                break;
            }
            final Drawable drawable = h0[n];
            if (drawable != null) {
                drawable.setDither(b);
            }
            ++n;
        }
    }
    
    public final void setFilterBitmap(final boolean b) {
        this.G0.e = (b ? 1 : 0);
        int n = 0;
        while (true) {
            final Drawable[] h0 = this.H0;
            if (n >= h0.length) {
                break;
            }
            final Drawable drawable = h0[n];
            if (drawable != null) {
                drawable.setFilterBitmap(b);
            }
            ++n;
        }
    }
    
    @TargetApi(21)
    public final void setHotspot(final float n, final float n2) {
        int n3 = 0;
        while (true) {
            final Drawable[] h0 = this.H0;
            if (n3 >= h0.length) {
                break;
            }
            final Drawable drawable = h0[n3];
            if (drawable != null) {
                drawable.setHotspot(n, n2);
            }
            ++n3;
        }
    }
    
    public final boolean setVisible(final boolean b, final boolean b2) {
        final boolean setVisible = super.setVisible(b, b2);
        int n = 0;
        while (true) {
            final Drawable[] h0 = this.H0;
            if (n >= h0.length) {
                break;
            }
            final Drawable drawable = h0[n];
            if (drawable != null) {
                drawable.setVisible(b, b2);
            }
            ++n;
        }
        return setVisible;
    }
    
    public final void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}
