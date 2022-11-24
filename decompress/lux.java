import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.Log;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Build$VERSION;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lux extends kux
{
    public static Method M0;
    
    public lux(final Drawable drawable) {
        super(drawable);
        this.e();
    }
    
    public lux(final mux mux, final Resources resources) {
        super(mux, resources);
        this.e();
    }
    
    @Override
    public final boolean c() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = false;
        if (sdk_INT == 21) {
            final Drawable k0 = super.K0;
            if (!(k0 instanceof GradientDrawable) && !(k0 instanceof DrawableContainer) && !(k0 instanceof InsetDrawable)) {
                b = b;
                if (!(k0 instanceof RippleDrawable)) {
                    return b;
                }
            }
            b = true;
        }
        return b;
    }
    
    public final void e() {
        if (lux.M0 == null) {
            try {
                lux.M0 = Drawable.class.getDeclaredMethod("isProjected", (Class<?>[])new Class[0]);
            }
            catch (final Exception ex) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", (Throwable)ex);
            }
        }
    }
    
    public final Rect getDirtyBounds() {
        return super.K0.getDirtyBounds();
    }
    
    public final void getOutline(final Outline outline) {
        super.K0.getOutline(outline);
    }
    
    public final boolean isProjected() {
        final Drawable k0 = super.K0;
        if (k0 != null) {
            final Method m0 = lux.M0;
            if (m0 != null) {
                try {
                    return (boolean)m0.invoke(k0, new Object[0]);
                }
                catch (final Exception ex) {
                    Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", (Throwable)ex);
                }
            }
        }
        return false;
    }
    
    public final void setHotspot(final float n, final float n2) {
        super.K0.setHotspot(n, n2);
    }
    
    public final void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        super.K0.setHotspotBounds(n, n2, n3, n4);
    }
    
    @Override
    public final boolean setState(final int[] state) {
        if (super.setState(state)) {
            this.invalidateSelf();
            return true;
        }
        return false;
    }
    
    @Override
    public final void setTint(final int n) {
        if (this.c()) {
            super.setTint(n);
        }
        else {
            super.K0.setTint(n);
        }
    }
    
    @Override
    public final void setTintList(final ColorStateList list) {
        if (this.c()) {
            super.setTintList(list);
        }
        else {
            super.K0.setTintList(list);
        }
    }
    
    @Override
    public final void setTintMode(final PorterDuff$Mode porterDuff$Mode) {
        if (this.c()) {
            super.setTintMode(porterDuff$Mode);
        }
        else {
            super.K0.setTintMode(porterDuff$Mode);
        }
    }
}
