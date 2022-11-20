import android.graphics.ColorFilter;
import android.graphics.Region;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable$ConstantState;
import android.content.res.Resources;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public class rtx extends Drawable implements Drawable$Callback, qtx, fat
{
    public static final PorterDuff$Mode J0;
    public int D0;
    public PorterDuff$Mode E0;
    public boolean F0;
    public ttx G0;
    public boolean H0;
    public Drawable I0;
    
    static {
        J0 = PorterDuff$Mode.SRC_IN;
    }
    
    public rtx(final Drawable drawable) {
        this.G0 = new ttx(this.G0);
        this.b(drawable);
    }
    
    public rtx(final ttx g0, final Resources resources) {
        this.G0 = g0;
        if (g0 != null) {
            final Drawable$ConstantState b = g0.b;
            if (b != null) {
                this.b(b.newDrawable(resources));
            }
        }
    }
    
    public final Drawable a() {
        return this.I0;
    }
    
    public final void b(final Drawable i0) {
        final Drawable i2 = this.I0;
        if (i2 != null) {
            i2.setCallback((Drawable$Callback)null);
        }
        if ((this.I0 = i0) != null) {
            i0.setCallback((Drawable$Callback)this);
            this.setVisible(i0.isVisible(), true);
            this.setState(i0.getState());
            this.setLevel(i0.getLevel());
            this.setBounds(i0.getBounds());
            final ttx g0 = this.G0;
            if (g0 != null) {
                g0.b = i0.getConstantState();
            }
        }
        this.invalidateSelf();
    }
    
    public boolean c() {
        throw null;
    }
    
    public final boolean d(final int[] array) {
        if (!this.c()) {
            return false;
        }
        final ttx g0 = this.G0;
        final ColorStateList c = g0.c;
        final PorterDuff$Mode d = g0.d;
        if (c != null && d != null) {
            final int colorForState = c.getColorForState(array, c.getDefaultColor());
            if (!this.F0 || colorForState != this.D0 || d != this.E0) {
                this.setColorFilter(colorForState, d);
                this.D0 = colorForState;
                this.E0 = d;
                return this.F0 = true;
            }
        }
        else {
            this.F0 = false;
            this.clearColorFilter();
        }
        return false;
    }
    
    public final void draw(final Canvas canvas) {
        this.I0.draw(canvas);
    }
    
    public final int getChangingConfigurations() {
        final int changingConfigurations = super.getChangingConfigurations();
        final ttx g0 = this.G0;
        int changingConfigurations2;
        if (g0 != null) {
            changingConfigurations2 = g0.getChangingConfigurations();
        }
        else {
            changingConfigurations2 = 0;
        }
        return changingConfigurations | changingConfigurations2 | this.I0.getChangingConfigurations();
    }
    
    public final Drawable$ConstantState getConstantState() {
        final ttx g0 = this.G0;
        if (g0 != null && g0.b != null) {
            g0.a = this.getChangingConfigurations();
            return (Drawable$ConstantState)this.G0;
        }
        return null;
    }
    
    public final Drawable getCurrent() {
        return this.I0.getCurrent();
    }
    
    public final int getIntrinsicHeight() {
        return this.I0.getIntrinsicHeight();
    }
    
    public final int getIntrinsicWidth() {
        return this.I0.getIntrinsicWidth();
    }
    
    public final int getLayoutDirection() {
        return xc9.b(this.I0);
    }
    
    public final int getMinimumHeight() {
        return this.I0.getMinimumHeight();
    }
    
    public final int getMinimumWidth() {
        return this.I0.getMinimumWidth();
    }
    
    public final int getOpacity() {
        return this.I0.getOpacity();
    }
    
    public final boolean getPadding(final Rect rect) {
        return this.I0.getPadding(rect);
    }
    
    public final int[] getState() {
        return this.I0.getState();
    }
    
    public final Region getTransparentRegion() {
        return this.I0.getTransparentRegion();
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        this.invalidateSelf();
    }
    
    public final boolean isAutoMirrored() {
        return xc9$a.d(this.I0);
    }
    
    public final boolean isStateful() {
        if (this.c()) {
            final ttx g0 = this.G0;
            if (g0 != null) {
                final ColorStateList c = g0.c;
                return (c != null && c.isStateful()) || this.I0.isStateful();
            }
        }
        final ColorStateList c = null;
        return (c != null && c.isStateful()) || this.I0.isStateful();
    }
    
    public final void jumpToCurrentState() {
        this.I0.jumpToCurrentState();
    }
    
    public final Drawable mutate() {
        if (!this.H0 && super.mutate() == this) {
            this.G0 = new ttx(this.G0);
            final Drawable i0 = this.I0;
            if (i0 != null) {
                i0.mutate();
            }
            final ttx g0 = this.G0;
            if (g0 != null) {
                final Drawable i2 = this.I0;
                Drawable$ConstantState constantState;
                if (i2 != null) {
                    constantState = i2.getConstantState();
                }
                else {
                    constantState = null;
                }
                g0.b = constantState;
            }
            this.H0 = true;
        }
        return this;
    }
    
    public final void onBoundsChange(final Rect bounds) {
        final Drawable i0 = this.I0;
        if (i0 != null) {
            i0.setBounds(bounds);
        }
    }
    
    public final boolean onLayoutDirectionChanged(final int n) {
        return xc9.c(this.I0, n);
    }
    
    public final boolean onLevelChange(final int level) {
        return this.I0.setLevel(level);
    }
    
    public final void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        this.scheduleSelf(runnable, n);
    }
    
    public final void setAlpha(final int alpha) {
        this.I0.setAlpha(alpha);
    }
    
    public final void setAutoMirrored(final boolean b) {
        xc9$a.e(this.I0, b);
    }
    
    public final void setChangingConfigurations(final int changingConfigurations) {
        this.I0.setChangingConfigurations(changingConfigurations);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.I0.setColorFilter(colorFilter);
    }
    
    public final void setDither(final boolean dither) {
        this.I0.setDither(dither);
    }
    
    public final void setFilterBitmap(final boolean filterBitmap) {
        this.I0.setFilterBitmap(filterBitmap);
    }
    
    public boolean setState(final int[] state) {
        final boolean setState = this.I0.setState(state);
        return this.d(state) || setState;
    }
    
    public void setTint(final int n) {
        this.setTintList(ColorStateList.valueOf(n));
    }
    
    public void setTintList(final ColorStateList c) {
        this.G0.c = c;
        this.d(this.getState());
    }
    
    public void setTintMode(final PorterDuff$Mode d) {
        this.G0.d = d;
        this.d(this.getState());
    }
    
    public final boolean setVisible(final boolean b, final boolean b2) {
        return super.setVisible(b, b2) || this.I0.setVisible(b, b2);
    }
    
    public final void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}
