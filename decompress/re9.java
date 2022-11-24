import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Region;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public class re9 extends Drawable implements Drawable$Callback
{
    public Drawable F0;
    
    public re9(final Drawable f0) {
        final Drawable f2 = this.F0;
        if (f2 != null) {
            f2.setCallback((Drawable$Callback)null);
        }
        if ((this.F0 = f0) != null) {
            f0.setCallback((Drawable$Callback)this);
        }
    }
    
    public void draw(final Canvas canvas) {
        this.F0.draw(canvas);
    }
    
    public final int getChangingConfigurations() {
        return this.F0.getChangingConfigurations();
    }
    
    public final Drawable getCurrent() {
        return this.F0.getCurrent();
    }
    
    public int getIntrinsicHeight() {
        return this.F0.getIntrinsicHeight();
    }
    
    public int getIntrinsicWidth() {
        return this.F0.getIntrinsicWidth();
    }
    
    public final int getMinimumHeight() {
        return this.F0.getMinimumHeight();
    }
    
    public final int getMinimumWidth() {
        return this.F0.getMinimumWidth();
    }
    
    public final int getOpacity() {
        return this.F0.getOpacity();
    }
    
    public final boolean getPadding(final Rect rect) {
        return this.F0.getPadding(rect);
    }
    
    public final int[] getState() {
        return this.F0.getState();
    }
    
    public final Region getTransparentRegion() {
        return this.F0.getTransparentRegion();
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        this.invalidateSelf();
    }
    
    public final boolean isAutoMirrored() {
        return ae9$a.d(this.F0);
    }
    
    public final boolean isStateful() {
        return this.F0.isStateful();
    }
    
    public final void jumpToCurrentState() {
        this.F0.jumpToCurrentState();
    }
    
    public final void onBoundsChange(final Rect bounds) {
        this.F0.setBounds(bounds);
    }
    
    public final boolean onLevelChange(final int level) {
        return this.F0.setLevel(level);
    }
    
    public final void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        this.scheduleSelf(runnable, n);
    }
    
    public final void setAlpha(final int alpha) {
        this.F0.setAlpha(alpha);
    }
    
    public final void setAutoMirrored(final boolean b) {
        ae9$a.e(this.F0, b);
    }
    
    public final void setChangingConfigurations(final int changingConfigurations) {
        this.F0.setChangingConfigurations(changingConfigurations);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.F0.setColorFilter(colorFilter);
    }
    
    public final void setDither(final boolean dither) {
        this.F0.setDither(dither);
    }
    
    public final void setFilterBitmap(final boolean filterBitmap) {
        this.F0.setFilterBitmap(filterBitmap);
    }
    
    public void setHotspot(final float n, final float n2) {
        ae9$b.e(this.F0, n, n2);
    }
    
    public void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        ae9$b.f(this.F0, n, n2, n3, n4);
    }
    
    public boolean setState(final int[] state) {
        return this.F0.setState(state);
    }
    
    public void setTint(final int n) {
        ae9$b.g(this.F0, n);
    }
    
    public void setTintList(final ColorStateList list) {
        ae9$b.h(this.F0, list);
    }
    
    public final void setTintMode(final PorterDuff$Mode porterDuff$Mode) {
        ae9$b.i(this.F0, porterDuff$Mode);
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        return super.setVisible(b, b2) || this.F0.setVisible(b, b2);
    }
    
    public final void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}
