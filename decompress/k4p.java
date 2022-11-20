import android.graphics.drawable.BitmapDrawable;
import android.view.animation.AccelerateInterpolator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k4p
{
    public final Rect a;
    public final Drawable b;
    public final Resources c;
    public LayerDrawable d;
    public int e;
    
    public k4p(final Resources c, final Drawable drawable, final Rect a) {
        this.e = 0;
        this.c = c;
        Object b = drawable;
        if (drawable == null) {
            b = new ColorDrawable(0);
        }
        this.b = (Drawable)b;
        this.a = a;
        new AccelerateInterpolator(3.0f);
    }
    
    public final void a() {
        final LayerDrawable d = this.d;
        if (d == null) {
            return;
        }
        final Drawable drawable = d.getDrawable(0);
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable)drawable).getBitmap().recycle();
        }
        this.d = null;
    }
    
    @xoe
    public int getOverlayColor() {
        return this.e;
    }
}
