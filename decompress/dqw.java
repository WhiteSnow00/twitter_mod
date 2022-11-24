import android.graphics.PorterDuff$Mode;
import android.graphics.Region;
import android.graphics.Rect;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dqw extends Drawable implements bbt
{
    public Drawable F0;
    
    public void applyTheme(final Resources$Theme resources$Theme) {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            ae9$b.a(f0, resources$Theme);
        }
    }
    
    public final void clearColorFilter() {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            f0.clearColorFilter();
            return;
        }
        super.clearColorFilter();
    }
    
    public final Drawable getCurrent() {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            return f0.getCurrent();
        }
        return super.getCurrent();
    }
    
    public final int getMinimumHeight() {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            return f0.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }
    
    public final int getMinimumWidth() {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            return f0.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }
    
    public final boolean getPadding(final Rect rect) {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            return f0.getPadding(rect);
        }
        return super.getPadding(rect);
    }
    
    public final int[] getState() {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            return f0.getState();
        }
        return super.getState();
    }
    
    public final Region getTransparentRegion() {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            return f0.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }
    
    public final void jumpToCurrentState() {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            f0.jumpToCurrentState();
        }
    }
    
    public boolean onLevelChange(final int level) {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            return f0.setLevel(level);
        }
        return super.onLevelChange(level);
    }
    
    public final void setChangingConfigurations(final int n) {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            f0.setChangingConfigurations(n);
            return;
        }
        super.setChangingConfigurations(n);
    }
    
    public final void setColorFilter(final int n, final PorterDuff$Mode porterDuff$Mode) {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            f0.setColorFilter(n, porterDuff$Mode);
            return;
        }
        super.setColorFilter(n, porterDuff$Mode);
    }
    
    public final void setFilterBitmap(final boolean filterBitmap) {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            f0.setFilterBitmap(filterBitmap);
        }
    }
    
    public final void setHotspot(final float n, final float n2) {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            ae9$b.e(f0, n, n2);
        }
    }
    
    public final void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            ae9$b.f(f0, n, n2, n3, n4);
        }
    }
    
    public final boolean setState(final int[] array) {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            return f0.setState(array);
        }
        return super.setState(array);
    }
}
