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

public class btx extends Drawable implements Drawable$Callback, atx, p9t
{
    public static final PorterDuff$Mode I0;
    public int C0;
    public PorterDuff$Mode D0;
    public boolean E0;
    public dtx F0;
    public boolean G0;
    public Drawable H0;
    
    static {
        I0 = PorterDuff$Mode.SRC_IN;
    }
    
    public btx(final Drawable drawable) {
        this.F0 = new dtx(this.F0);
        this.b(drawable);
    }
    
    public btx(final dtx f0, final Resources resources) {
        this.F0 = f0;
        if (f0 != null) {
            final Drawable$ConstantState b = f0.b;
            if (b != null) {
                this.b(b.newDrawable(resources));
            }
        }
    }
    
    public final Drawable a() {
        return this.H0;
    }
    
    public final void b(final Drawable h0) {
        final Drawable h2 = this.H0;
        if (h2 != null) {
            h2.setCallback((Drawable$Callback)null);
        }
        if ((this.H0 = h0) != null) {
            h0.setCallback((Drawable$Callback)this);
            this.setVisible(h0.isVisible(), true);
            this.setState(h0.getState());
            this.setLevel(h0.getLevel());
            this.setBounds(h0.getBounds());
            final dtx f0 = this.F0;
            if (f0 != null) {
                f0.b = h0.getConstantState();
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
        final dtx f0 = this.F0;
        final ColorStateList c = f0.c;
        final PorterDuff$Mode d = f0.d;
        if (c != null && d != null) {
            final int colorForState = c.getColorForState(array, c.getDefaultColor());
            if (!this.E0 || colorForState != this.C0 || d != this.D0) {
                this.setColorFilter(colorForState, d);
                this.C0 = colorForState;
                this.D0 = d;
                return this.E0 = true;
            }
        }
        else {
            this.E0 = false;
            this.clearColorFilter();
        }
        return false;
    }
    
    public final void draw(final Canvas canvas) {
        this.H0.draw(canvas);
    }
    
    public final int getChangingConfigurations() {
        final int changingConfigurations = super.getChangingConfigurations();
        final dtx f0 = this.F0;
        int changingConfigurations2;
        if (f0 != null) {
            changingConfigurations2 = f0.getChangingConfigurations();
        }
        else {
            changingConfigurations2 = 0;
        }
        return changingConfigurations | changingConfigurations2 | this.H0.getChangingConfigurations();
    }
    
    public final Drawable$ConstantState getConstantState() {
        final dtx f0 = this.F0;
        if (f0 != null && f0.b != null) {
            f0.a = this.getChangingConfigurations();
            return (Drawable$ConstantState)this.F0;
        }
        return null;
    }
    
    public final Drawable getCurrent() {
        return this.H0.getCurrent();
    }
    
    public final int getIntrinsicHeight() {
        return this.H0.getIntrinsicHeight();
    }
    
    public final int getIntrinsicWidth() {
        return this.H0.getIntrinsicWidth();
    }
    
    public final int getLayoutDirection() {
        return pd9.b(this.H0);
    }
    
    public final int getMinimumHeight() {
        return this.H0.getMinimumHeight();
    }
    
    public final int getMinimumWidth() {
        return this.H0.getMinimumWidth();
    }
    
    public final int getOpacity() {
        return this.H0.getOpacity();
    }
    
    public final boolean getPadding(final Rect rect) {
        return this.H0.getPadding(rect);
    }
    
    public final int[] getState() {
        return this.H0.getState();
    }
    
    public final Region getTransparentRegion() {
        return this.H0.getTransparentRegion();
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        this.invalidateSelf();
    }
    
    public final boolean isAutoMirrored() {
        return pd9.a.d(this.H0);
    }
    
    public final boolean isStateful() {
        if (this.c()) {
            final dtx f0 = this.F0;
            if (f0 != null) {
                final ColorStateList c = f0.c;
                return (c != null && c.isStateful()) || this.H0.isStateful();
            }
        }
        final ColorStateList c = null;
        return (c != null && c.isStateful()) || this.H0.isStateful();
    }
    
    public final void jumpToCurrentState() {
        this.H0.jumpToCurrentState();
    }
    
    public final Drawable mutate() {
        if (!this.G0 && super.mutate() == this) {
            this.F0 = new dtx(this.F0);
            final Drawable h0 = this.H0;
            if (h0 != null) {
                h0.mutate();
            }
            final dtx f0 = this.F0;
            if (f0 != null) {
                final Drawable h2 = this.H0;
                Drawable$ConstantState constantState;
                if (h2 != null) {
                    constantState = h2.getConstantState();
                }
                else {
                    constantState = null;
                }
                f0.b = constantState;
            }
            this.G0 = true;
        }
        return this;
    }
    
    public final void onBoundsChange(final Rect bounds) {
        final Drawable h0 = this.H0;
        if (h0 != null) {
            h0.setBounds(bounds);
        }
    }
    
    public final boolean onLayoutDirectionChanged(final int n) {
        return pd9.c(this.H0, n);
    }
    
    public final boolean onLevelChange(final int level) {
        return this.H0.setLevel(level);
    }
    
    public final void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        this.scheduleSelf(runnable, n);
    }
    
    public final void setAlpha(final int alpha) {
        this.H0.setAlpha(alpha);
    }
    
    public final void setAutoMirrored(final boolean b) {
        pd9.a.e(this.H0, b);
    }
    
    public final void setChangingConfigurations(final int changingConfigurations) {
        this.H0.setChangingConfigurations(changingConfigurations);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.H0.setColorFilter(colorFilter);
    }
    
    public final void setDither(final boolean dither) {
        this.H0.setDither(dither);
    }
    
    public final void setFilterBitmap(final boolean filterBitmap) {
        this.H0.setFilterBitmap(filterBitmap);
    }
    
    public boolean setState(final int[] state) {
        final boolean setState = this.H0.setState(state);
        return this.d(state) || setState;
    }
    
    public void setTint(final int n) {
        this.setTintList(ColorStateList.valueOf(n));
    }
    
    public void setTintList(final ColorStateList c) {
        this.F0.c = c;
        this.d(this.getState());
    }
    
    public void setTintMode(final PorterDuff$Mode d) {
        this.F0.d = d;
        this.d(this.getState());
    }
    
    public final boolean setVisible(final boolean b, final boolean b2) {
        return super.setVisible(b, b2) || this.H0.setVisible(b, b2);
    }
    
    public final void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}
