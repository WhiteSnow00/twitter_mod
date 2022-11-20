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

public class od9 extends Drawable implements Drawable$Callback
{
    public Drawable D0;
    
    public od9(final Drawable d0) {
        final Drawable d2 = this.D0;
        if (d2 != null) {
            d2.setCallback((Drawable$Callback)null);
        }
        if ((this.D0 = d0) != null) {
            d0.setCallback((Drawable$Callback)this);
        }
    }
    
    public void draw(final Canvas canvas) {
        this.D0.draw(canvas);
    }
    
    public final int getChangingConfigurations() {
        return this.D0.getChangingConfigurations();
    }
    
    public final Drawable getCurrent() {
        return this.D0.getCurrent();
    }
    
    public int getIntrinsicHeight() {
        return this.D0.getIntrinsicHeight();
    }
    
    public int getIntrinsicWidth() {
        return this.D0.getIntrinsicWidth();
    }
    
    public final int getMinimumHeight() {
        return this.D0.getMinimumHeight();
    }
    
    public final int getMinimumWidth() {
        return this.D0.getMinimumWidth();
    }
    
    public final int getOpacity() {
        return this.D0.getOpacity();
    }
    
    public final boolean getPadding(final Rect rect) {
        return this.D0.getPadding(rect);
    }
    
    public final int[] getState() {
        return this.D0.getState();
    }
    
    public final Region getTransparentRegion() {
        return this.D0.getTransparentRegion();
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        this.invalidateSelf();
    }
    
    public final boolean isAutoMirrored() {
        return xc9$a.d(this.D0);
    }
    
    public final boolean isStateful() {
        return this.D0.isStateful();
    }
    
    public final void jumpToCurrentState() {
        this.D0.jumpToCurrentState();
    }
    
    public final void onBoundsChange(final Rect bounds) {
        this.D0.setBounds(bounds);
    }
    
    public final boolean onLevelChange(final int level) {
        return this.D0.setLevel(level);
    }
    
    public final void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        this.scheduleSelf(runnable, n);
    }
    
    public final void setAlpha(final int alpha) {
        this.D0.setAlpha(alpha);
    }
    
    public final void setAutoMirrored(final boolean b) {
        xc9$a.e(this.D0, b);
    }
    
    public final void setChangingConfigurations(final int changingConfigurations) {
        this.D0.setChangingConfigurations(changingConfigurations);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.D0.setColorFilter(colorFilter);
    }
    
    public final void setDither(final boolean dither) {
        this.D0.setDither(dither);
    }
    
    public final void setFilterBitmap(final boolean filterBitmap) {
        this.D0.setFilterBitmap(filterBitmap);
    }
    
    public void setHotspot(final float n, final float n2) {
        xc9$b.e(this.D0, n, n2);
    }
    
    public void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        xc9$b.f(this.D0, n, n2, n3, n4);
    }
    
    public boolean setState(final int[] state) {
        return this.D0.setState(state);
    }
    
    public void setTint(final int n) {
        xc9$b.g(this.D0, n);
    }
    
    public void setTintList(final ColorStateList list) {
        xc9$b.h(this.D0, list);
    }
    
    public final void setTintMode(final PorterDuff$Mode porterDuff$Mode) {
        xc9$b.i(this.D0, porterDuff$Mode);
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        return super.setVisible(b, b2) || this.D0.setVisible(b, b2);
    }
    
    public final void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}
