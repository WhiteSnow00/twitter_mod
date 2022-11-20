import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vzm extends Drawable implements zrp, fat
{
    public vzm.vzm$b D0;
    
    public vzm(final grp grp) {
        final vzm.vzm$b d0 = new vzm.vzm$b(new png(grp));
        this.D0 = d0;
    }
    
    public vzm(final vzm.vzm$b d0, final vzm$a vzm$a) {
        this.D0 = d0;
    }
    
    public final void draw(final Canvas canvas) {
        final vzm.vzm$b d0 = this.D0;
        if (d0.b) {
            d0.a.draw(canvas);
        }
    }
    
    public final Drawable$ConstantState getConstantState() {
        return (Drawable$ConstantState)this.D0;
    }
    
    public final int getOpacity() {
        return this.D0.a.getOpacity();
    }
    
    public final boolean isStateful() {
        return true;
    }
    
    public final Drawable mutate() {
        this.D0 = new vzm.vzm$b(this.D0);
        return this;
    }
    
    public final void onBoundsChange(final Rect bounds) {
        super.onBoundsChange(bounds);
        ((Drawable)this.D0.a).setBounds(bounds);
    }
    
    public final boolean onStateChange(final int[] state) {
        boolean onStateChange = super.onStateChange(state);
        final boolean setState = ((Drawable)this.D0.a).setState(state);
        final boolean b = true;
        if (setState) {
            onStateChange = true;
        }
        final boolean c = b0n.c(state);
        final vzm.vzm$b d0 = this.D0;
        if (d0.b != c) {
            d0.b = c;
            onStateChange = b;
        }
        return onStateChange;
    }
    
    public final void setAlpha(final int alpha) {
        this.D0.a.setAlpha(alpha);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.D0.a.setColorFilter(colorFilter);
    }
    
    public final void setShapeAppearanceModel(final grp shapeAppearanceModel) {
        this.D0.a.setShapeAppearanceModel(shapeAppearanceModel);
    }
    
    public final void setTint(final int tint) {
        this.D0.a.setTint(tint);
    }
    
    public final void setTintList(final ColorStateList tintList) {
        this.D0.a.setTintList(tintList);
    }
    
    public final void setTintMode(final PorterDuff$Mode tintMode) {
        this.D0.a.setTintMode(tintMode);
    }
}
