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

public final class zko extends hlo
{
    public final Paint g1;
    public final Paint h1;
    public final Bitmap i1;
    public WeakReference<Bitmap> j1;
    
    public zko(final Resources resources, final Bitmap i1, final Paint paint) {
        super((Drawable)new BitmapDrawable(resources, i1));
        final Paint g1 = new Paint();
        this.g1 = g1;
        final Paint h1 = new Paint(1);
        this.h1 = h1;
        this.i1 = i1;
        if (paint != null) {
            g1.set(paint);
        }
        g1.setFlags(1);
        h1.setStyle(Paint$Style.STROKE);
    }
    
    public final void draw(final Canvas canvas) {
        pqb.b();
        if (!this.i()) {
            super.draw(canvas);
            pqb.b();
            return;
        }
        this.d();
        this.c();
        final WeakReference<Bitmap> j1 = this.j1;
        if (j1 == null || j1.get() != this.i1) {
            this.j1 = new WeakReference<Bitmap>(this.i1);
            final Paint g1 = this.g1;
            final Bitmap i1 = this.i1;
            final Shader$TileMode clamp = Shader$TileMode.CLAMP;
            g1.setShader((Shader)new BitmapShader(i1, clamp, clamp));
            super.I0 = true;
        }
        if (super.I0) {
            this.g1.getShader().setLocalMatrix(super.a1);
            super.I0 = false;
        }
        this.g1.setFilterBitmap(super.d1);
        final int save = canvas.save();
        canvas.concat(super.X0);
        canvas.drawPath(super.H0, this.g1);
        final float g2 = super.G0;
        if (g2 > 0.0f) {
            this.h1.setStrokeWidth(g2);
            this.h1.setColor(hd9.b(super.J0, this.g1.getAlpha()));
            canvas.drawPath(super.K0, this.h1);
        }
        canvas.restoreToCount(save);
        pqb.b();
    }
    
    public final boolean i() {
        final boolean e0 = super.E0;
        final boolean b = false;
        final boolean b2 = e0 || super.F0 || super.G0 > 0.0f;
        boolean b3 = b;
        if (b2) {
            b3 = b;
            if (this.i1 != null) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public final void setAlpha(final int alpha) {
        super.setAlpha(alpha);
        if (alpha != this.g1.getAlpha()) {
            this.g1.setAlpha(alpha);
            super.setAlpha(alpha);
            ((Drawable)this).invalidateSelf();
        }
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.g1.setColorFilter(colorFilter);
    }
}
