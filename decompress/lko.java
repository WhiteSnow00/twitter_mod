import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import android.graphics.Bitmap;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lko extends tko
{
    public final Paint f1;
    public final Paint g1;
    public final Bitmap h1;
    public WeakReference<Bitmap> i1;
    
    public lko(final Resources resources, final Bitmap h1, final Paint paint) {
        super((Drawable)new BitmapDrawable(resources, h1));
        final Paint f1 = new Paint();
        this.f1 = f1;
        final Paint g1 = new Paint(1);
        this.g1 = g1;
        this.h1 = h1;
        if (paint != null) {
            f1.set(paint);
        }
        f1.setFlags(1);
        g1.setStyle(Paint$Style.STROKE);
    }
    
    public final void draw(final Canvas canvas) {
        srb.b();
        if (!this.i()) {
            super.draw(canvas);
            srb.b();
            return;
        }
        this.d();
        this.c();
        final WeakReference<Bitmap> i1 = this.i1;
        if (i1 == null || i1.get() != this.h1) {
            this.i1 = new WeakReference<Bitmap>(this.h1);
            final Paint f1 = this.f1;
            final Bitmap h1 = this.h1;
            final Shader$TileMode clamp = Shader$TileMode.CLAMP;
            f1.setShader((Shader)new BitmapShader(h1, clamp, clamp));
            super.H0 = true;
        }
        if (super.H0) {
            this.f1.getShader().setLocalMatrix(super.Z0);
            super.H0 = false;
        }
        this.f1.setFilterBitmap(super.c1);
        final int save = canvas.save();
        canvas.concat(super.W0);
        canvas.drawPath(super.G0, this.f1);
        final float f2 = super.F0;
        if (f2 > 0.0f) {
            this.g1.setStrokeWidth(f2);
            this.g1.setColor(zd9.b(super.I0, this.f1.getAlpha()));
            canvas.drawPath(super.J0, this.g1);
        }
        canvas.restoreToCount(save);
        srb.b();
    }
    
    public final boolean i() {
        final boolean d0 = super.D0;
        final boolean b = false;
        final boolean b2 = d0 || super.E0 || super.F0 > 0.0f;
        boolean b3 = b;
        if (b2) {
            b3 = b;
            if (this.h1 != null) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public final void setAlpha(final int alpha) {
        super.setAlpha(alpha);
        if (alpha != this.f1.getAlpha()) {
            this.f1.setAlpha(alpha);
            super.setAlpha(alpha);
            ((Drawable)this).invalidateSelf();
        }
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f1.setColorFilter(colorFilter);
    }
}
