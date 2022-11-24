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

public final class l0n extends Drawable implements usp, bbt
{
    public l0n.l0n$b F0;
    
    public l0n(final bsp bsp) {
        final l0n.l0n$b f0 = new l0n.l0n$b(new jog(bsp));
        this.F0 = f0;
    }
    
    public l0n(final l0n.l0n$b f0, final l0n$a l0n$a) {
        this.F0 = f0;
    }
    
    public final void draw(final Canvas canvas) {
        final l0n.l0n$b f0 = this.F0;
        if (f0.b) {
            f0.a.draw(canvas);
        }
    }
    
    public final Drawable$ConstantState getConstantState() {
        return (Drawable$ConstantState)this.F0;
    }
    
    public final int getOpacity() {
        return this.F0.a.getOpacity();
    }
    
    public final boolean isStateful() {
        return true;
    }
    
    public final Drawable mutate() {
        this.F0 = new l0n.l0n$b(this.F0);
        return this;
    }
    
    public final void onBoundsChange(final Rect bounds) {
        super.onBoundsChange(bounds);
        ((Drawable)this.F0.a).setBounds(bounds);
    }
    
    public final boolean onStateChange(final int[] state) {
        boolean onStateChange = super.onStateChange(state);
        final boolean setState = ((Drawable)this.F0.a).setState(state);
        final boolean b = true;
        if (setState) {
            onStateChange = true;
        }
        final boolean c = r0n.c(state);
        final l0n.l0n$b f0 = this.F0;
        if (f0.b != c) {
            f0.b = c;
            onStateChange = b;
        }
        return onStateChange;
    }
    
    public final void setAlpha(final int alpha) {
        this.F0.a.setAlpha(alpha);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.F0.a.setColorFilter(colorFilter);
    }
    
    public final void setShapeAppearanceModel(final bsp shapeAppearanceModel) {
        this.F0.a.setShapeAppearanceModel(shapeAppearanceModel);
    }
    
    public final void setTint(final int tint) {
        this.F0.a.setTint(tint);
    }
    
    public final void setTintList(final ColorStateList tintList) {
        this.F0.a.setTintList(tintList);
    }
    
    public final void setTintMode(final PorterDuff$Mode tintMode) {
        this.F0.a.setTintMode(tintMode);
    }
}
