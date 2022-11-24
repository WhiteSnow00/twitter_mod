import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.RectF;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpj extends umb
{
    public final Matrix J0;
    public int K0;
    public int L0;
    public final Matrix M0;
    public final RectF N0;
    
    public gpj(final Drawable drawable, final int n, int l0) {
        super(drawable);
        this.M0 = new Matrix();
        this.N0 = new RectF();
        this.J0 = new Matrix();
        this.K0 = n - n % 90;
        if (l0 < 0 || l0 > 8) {
            l0 = 0;
        }
        this.L0 = l0;
    }
    
    @Override
    public final void c(final Matrix matrix) {
        this.n(matrix);
        if (!this.J0.isIdentity()) {
            matrix.preConcat(this.J0);
        }
    }
    
    @Override
    public final void draw(final Canvas canvas) {
        if (this.K0 <= 0) {
            final int l0 = this.L0;
            if (l0 == 0 || l0 == 1) {
                super.draw(canvas);
                return;
            }
        }
        final int save = canvas.save();
        canvas.concat(this.J0);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }
    
    @Override
    public final int getIntrinsicHeight() {
        final int l0 = this.L0;
        if (l0 != 5 && l0 != 7 && this.K0 % 180 == 0) {
            return super.getIntrinsicHeight();
        }
        return super.getIntrinsicWidth();
    }
    
    @Override
    public final int getIntrinsicWidth() {
        final int l0 = this.L0;
        if (l0 != 5 && l0 != 7 && this.K0 % 180 == 0) {
            return super.getIntrinsicWidth();
        }
        return super.getIntrinsicHeight();
    }
    
    @Override
    public final void onBoundsChange(final Rect bounds) {
        final Drawable f0 = super.F0;
        final int k0 = this.K0;
        if (k0 <= 0) {
            final int l0 = this.L0;
            if (l0 == 0 || l0 == 1) {
                f0.setBounds(bounds);
                return;
            }
        }
        final int l2 = this.L0;
        if (l2 != 2) {
            if (l2 != 7) {
                if (l2 != 4) {
                    if (l2 != 5) {
                        this.J0.setRotate((float)k0, (float)bounds.centerX(), (float)bounds.centerY());
                    }
                    else {
                        this.J0.setRotate(270.0f, (float)bounds.centerX(), (float)bounds.centerY());
                        this.J0.postScale(1.0f, -1.0f);
                    }
                }
                else {
                    this.J0.setScale(1.0f, -1.0f);
                }
            }
            else {
                this.J0.setRotate(270.0f, (float)bounds.centerX(), (float)bounds.centerY());
                this.J0.postScale(-1.0f, 1.0f);
            }
        }
        else {
            this.J0.setScale(-1.0f, 1.0f);
        }
        this.M0.reset();
        this.J0.invert(this.M0);
        this.N0.set(bounds);
        this.M0.mapRect(this.N0);
        final RectF n0 = this.N0;
        f0.setBounds((int)n0.left, (int)n0.top, (int)n0.right, (int)n0.bottom);
    }
}
