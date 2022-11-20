import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t8r extends Drawable
{
    public int a;
    public BitmapDrawable[] b;
    
    public t8r(final BitmapDrawable[] b) {
        this.b = b;
    }
    
    public final void draw(final Canvas canvas) {
        final BitmapDrawable[] b = this.b;
        if (b != null) {
            b[this.a].draw(canvas);
        }
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    public final void onBoundsChange(final Rect bounds) {
        final BitmapDrawable[] b = this.b;
        for (int length = b.length, i = 0; i < length; ++i) {
            ((Drawable)b[i]).setBounds(bounds);
        }
    }
    
    public final void setAlpha(final int alpha) {
        final BitmapDrawable[] b = this.b;
        for (int length = b.length, i = 0; i < length; ++i) {
            ((Drawable)b[i]).setAlpha(alpha);
        }
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        final BitmapDrawable[] b = this.b;
        for (int length = b.length, i = 0; i < length; ++i) {
            ((Drawable)b[i]).setColorFilter(colorFilter);
        }
    }
}
