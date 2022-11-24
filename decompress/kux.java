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

public class kux extends Drawable implements Drawable$Callback, jux, bbt
{
    public static final PorterDuff$Mode L0;
    public int F0;
    public PorterDuff$Mode G0;
    public boolean H0;
    public mux I0;
    public boolean J0;
    public Drawable K0;
    
    static {
        L0 = PorterDuff$Mode.SRC_IN;
    }
    
    public kux(final Drawable drawable) {
        this.I0 = new mux(this.I0);
        this.b(drawable);
    }
    
    public kux(final mux i0, final Resources resources) {
        this.I0 = i0;
        if (i0 != null) {
            final Drawable$ConstantState b = i0.b;
            if (b != null) {
                this.b(b.newDrawable(resources));
            }
        }
    }
    
    public final Drawable a() {
        return this.K0;
    }
    
    public final void b(final Drawable k0) {
        final Drawable k2 = this.K0;
        if (k2 != null) {
            k2.setCallback((Drawable$Callback)null);
        }
        if ((this.K0 = k0) != null) {
            k0.setCallback((Drawable$Callback)this);
            this.setVisible(k0.isVisible(), true);
            this.setState(k0.getState());
            this.setLevel(k0.getLevel());
            this.setBounds(k0.getBounds());
            final mux i0 = this.I0;
            if (i0 != null) {
                i0.b = k0.getConstantState();
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
        final mux i0 = this.I0;
        final ColorStateList c = i0.c;
        final PorterDuff$Mode d = i0.d;
        if (c != null && d != null) {
            final int colorForState = c.getColorForState(array, c.getDefaultColor());
            if (!this.H0 || colorForState != this.F0 || d != this.G0) {
                this.setColorFilter(colorForState, d);
                this.F0 = colorForState;
                this.G0 = d;
                return this.H0 = true;
            }
        }
        else {
            this.H0 = false;
            this.clearColorFilter();
        }
        return false;
    }
    
    public final void draw(final Canvas canvas) {
        this.K0.draw(canvas);
    }
    
    public final int getChangingConfigurations() {
        final int changingConfigurations = super.getChangingConfigurations();
        final mux i0 = this.I0;
        int changingConfigurations2;
        if (i0 != null) {
            changingConfigurations2 = i0.getChangingConfigurations();
        }
        else {
            changingConfigurations2 = 0;
        }
        return changingConfigurations | changingConfigurations2 | this.K0.getChangingConfigurations();
    }
    
    public final Drawable$ConstantState getConstantState() {
        final mux i0 = this.I0;
        if (i0 != null && i0.b != null) {
            i0.a = this.getChangingConfigurations();
            return this.I0;
        }
        return null;
    }
    
    public final Drawable getCurrent() {
        return this.K0.getCurrent();
    }
    
    public final int getIntrinsicHeight() {
        return this.K0.getIntrinsicHeight();
    }
    
    public final int getIntrinsicWidth() {
        return this.K0.getIntrinsicWidth();
    }
    
    public final int getLayoutDirection() {
        return ae9.b(this.K0);
    }
    
    public final int getMinimumHeight() {
        return this.K0.getMinimumHeight();
    }
    
    public final int getMinimumWidth() {
        return this.K0.getMinimumWidth();
    }
    
    public final int getOpacity() {
        return this.K0.getOpacity();
    }
    
    public final boolean getPadding(final Rect rect) {
        return this.K0.getPadding(rect);
    }
    
    public final int[] getState() {
        return this.K0.getState();
    }
    
    public final Region getTransparentRegion() {
        return this.K0.getTransparentRegion();
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        this.invalidateSelf();
    }
    
    public final boolean isAutoMirrored() {
        return ae9$a.d(this.K0);
    }
    
    public final boolean isStateful() {
        if (this.c()) {
            final mux i0 = this.I0;
            if (i0 != null) {
                final ColorStateList c = i0.c;
                return (c != null && c.isStateful()) || this.K0.isStateful();
            }
        }
        final ColorStateList c = null;
        return (c != null && c.isStateful()) || this.K0.isStateful();
    }
    
    public final void jumpToCurrentState() {
        this.K0.jumpToCurrentState();
    }
    
    public final Drawable mutate() {
        if (!this.J0 && super.mutate() == this) {
            this.I0 = new mux(this.I0);
            final Drawable k0 = this.K0;
            if (k0 != null) {
                k0.mutate();
            }
            final mux i0 = this.I0;
            if (i0 != null) {
                final Drawable k2 = this.K0;
                Drawable$ConstantState constantState;
                if (k2 != null) {
                    constantState = k2.getConstantState();
                }
                else {
                    constantState = null;
                }
                i0.b = constantState;
            }
            this.J0 = true;
        }
        return this;
    }
    
    public final void onBoundsChange(final Rect bounds) {
        final Drawable k0 = this.K0;
        if (k0 != null) {
            k0.setBounds(bounds);
        }
    }
    
    public final boolean onLayoutDirectionChanged(final int n) {
        return ae9.c(this.K0, n);
    }
    
    public final boolean onLevelChange(final int level) {
        return this.K0.setLevel(level);
    }
    
    public final void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        this.scheduleSelf(runnable, n);
    }
    
    public final void setAlpha(final int alpha) {
        this.K0.setAlpha(alpha);
    }
    
    public final void setAutoMirrored(final boolean b) {
        ae9$a.e(this.K0, b);
    }
    
    public final void setChangingConfigurations(final int changingConfigurations) {
        this.K0.setChangingConfigurations(changingConfigurations);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.K0.setColorFilter(colorFilter);
    }
    
    public final void setDither(final boolean dither) {
        this.K0.setDither(dither);
    }
    
    public final void setFilterBitmap(final boolean filterBitmap) {
        this.K0.setFilterBitmap(filterBitmap);
    }
    
    public boolean setState(final int[] state) {
        final boolean setState = this.K0.setState(state);
        return this.d(state) || setState;
    }
    
    public void setTint(final int n) {
        this.setTintList(ColorStateList.valueOf(n));
    }
    
    public void setTintList(final ColorStateList c) {
        this.I0.c = c;
        this.d(this.getState());
    }
    
    public void setTintMode(final PorterDuff$Mode d) {
        this.I0.d = d;
        this.d(this.getState());
    }
    
    public final boolean setVisible(final boolean b, final boolean b2) {
        return super.setVisible(b, b2) || this.K0.setVisible(b, b2);
    }
    
    public final void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}
