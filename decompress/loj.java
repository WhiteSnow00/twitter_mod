import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.RectF;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

public final class loj extends vmb
{
    public final Matrix G0;
    public int H0;
    public int I0;
    public final Matrix J0;
    public final RectF K0;
    
    public loj(final Drawable drawable, final int n, int i0) {
        super(drawable);
        this.J0 = new Matrix();
        this.K0 = new RectF();
        this.G0 = new Matrix();
        this.H0 = n - n % 90;
        if (i0 < 0 || i0 > 8) {
            i0 = 0;
        }
        this.I0 = i0;
    }
    
    public final void c(final Matrix matrix) {
        this.n(matrix);
        if (!this.G0.isIdentity()) {
            matrix.preConcat(this.G0);
        }
    }
    
    public final void draw(final Canvas canvas) {
        if (this.H0 <= 0) {
            final int i0 = this.I0;
            if (i0 == 0 || i0 == 1) {
                super.draw(canvas);
                return;
            }
        }
        final int save = canvas.save();
        canvas.concat(this.G0);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }
    
    public final int getIntrinsicHeight() {
        final int i0 = this.I0;
        if (i0 != 5 && i0 != 7 && this.H0 % 180 == 0) {
            return super.getIntrinsicHeight();
        }
        return super.getIntrinsicWidth();
    }
    
    public final int getIntrinsicWidth() {
        final int i0 = this.I0;
        if (i0 != 5 && i0 != 7 && this.H0 % 180 == 0) {
            return super.getIntrinsicWidth();
        }
        return super.getIntrinsicHeight();
    }
    
    public final void onBoundsChange(final Rect bounds) {
        final Drawable c0 = super.C0;
        final int h0 = this.H0;
        if (h0 <= 0) {
            final int i0 = this.I0;
            if (i0 == 0 || i0 == 1) {
                c0.setBounds(bounds);
                return;
            }
        }
        final int i2 = this.I0;
        if (i2 != 2) {
            if (i2 != 7) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        this.G0.setRotate((float)h0, (float)bounds.centerX(), (float)bounds.centerY());
                    }
                    else {
                        this.G0.setRotate(270.0f, (float)bounds.centerX(), (float)bounds.centerY());
                        this.G0.postScale(1.0f, -1.0f);
                    }
                }
                else {
                    this.G0.setScale(1.0f, -1.0f);
                }
            }
            else {
                this.G0.setRotate(270.0f, (float)bounds.centerX(), (float)bounds.centerY());
                this.G0.postScale(-1.0f, 1.0f);
            }
        }
        else {
            this.G0.setScale(-1.0f, 1.0f);
        }
        this.J0.reset();
        this.G0.invert(this.J0);
        this.K0.set(bounds);
        this.J0.mapRect(this.K0);
        final RectF k0 = this.K0;
        c0.setBounds((int)k0.left, (int)k0.top, (int)k0.right, (int)k0.bottom);
    }
}
