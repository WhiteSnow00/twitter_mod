import android.graphics.Path$Direction;
import android.graphics.Rect;
import java.util.Arrays;
import android.graphics.Path$FillType;
import android.graphics.Paint$Style;
import android.graphics.Matrix$ScaleToFit;
import android.graphics.Canvas;
import java.util.Objects;
import android.graphics.drawable.Drawable;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.Matrix;
import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class glo extends tlb implements yko
{
    public int H0;
    public final RectF I0;
    public RectF J0;
    public Matrix K0;
    public final float[] L0;
    public final float[] M0;
    public final Paint N0;
    public boolean O0;
    public float P0;
    public int Q0;
    public int R0;
    public float S0;
    public boolean T0;
    public boolean U0;
    public final Path V0;
    public final Path W0;
    public final RectF X0;
    
    public glo(final Drawable drawable) {
        Objects.requireNonNull(drawable);
        super(drawable);
        this.H0 = 1;
        this.I0 = new RectF();
        this.L0 = new float[8];
        this.M0 = new float[8];
        this.N0 = new Paint(1);
        this.O0 = false;
        this.P0 = 0.0f;
        this.Q0 = 0;
        this.R0 = 0;
        this.S0 = 0.0f;
        this.T0 = false;
        this.U0 = false;
        this.V0 = new Path();
        this.W0 = new Path();
        this.X0 = new RectF();
    }
    
    public final void a(final int q0, final float p2) {
        this.Q0 = q0;
        this.P0 = p2;
        this.p();
        ((Drawable)this).invalidateSelf();
    }
    
    public final void b(final boolean o0) {
        this.O0 = o0;
        this.p();
        ((Drawable)this).invalidateSelf();
    }
    
    public final void draw(final Canvas canvas) {
        this.I0.set(((Drawable)this).getBounds());
        final int e = ib0.E(this.H0);
        if (e != 0) {
            if (e == 1) {
                final int save = canvas.save();
                canvas.clipPath(this.V0);
                super.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        else {
            if (this.T0) {
                final RectF j0 = this.J0;
                if (j0 == null) {
                    this.J0 = new RectF(this.I0);
                    this.K0 = new Matrix();
                }
                else {
                    j0.set(this.I0);
                }
                final RectF j2 = this.J0;
                final float p = this.P0;
                j2.inset(p, p);
                this.K0.setRectToRect(this.I0, this.J0, Matrix$ScaleToFit.FILL);
                final int save2 = canvas.save();
                canvas.clipRect(this.I0);
                canvas.concat(this.K0);
                super.draw(canvas);
                canvas.restoreToCount(save2);
            }
            else {
                super.draw(canvas);
            }
            this.N0.setStyle(Paint$Style.FILL);
            this.N0.setColor(this.R0);
            this.N0.setStrokeWidth(0.0f);
            this.N0.setFilterBitmap(this.U0);
            this.V0.setFillType(Path$FillType.EVEN_ODD);
            canvas.drawPath(this.V0, this.N0);
            if (this.O0) {
                final float n = (this.I0.width() - this.I0.height() + this.P0) / 2.0f;
                final float n2 = (this.I0.height() - this.I0.width() + this.P0) / 2.0f;
                if (n > 0.0f) {
                    final RectF i0 = this.I0;
                    final float left = i0.left;
                    canvas.drawRect(left, i0.top, left + n, i0.bottom, this.N0);
                    final RectF i2 = this.I0;
                    final float right = i2.right;
                    canvas.drawRect(right - n, i2.top, right, i2.bottom, this.N0);
                }
                if (n2 > 0.0f) {
                    final RectF i3 = this.I0;
                    final float left2 = i3.left;
                    final float top = i3.top;
                    canvas.drawRect(left2, top, i3.right, top + n2, this.N0);
                    final RectF i4 = this.I0;
                    final float left3 = i4.left;
                    final float bottom = i4.bottom;
                    canvas.drawRect(left3, bottom - n2, i4.right, bottom, this.N0);
                }
            }
        }
        if (this.Q0 != 0) {
            this.N0.setStyle(Paint$Style.STROKE);
            this.N0.setColor(this.Q0);
            this.N0.setStrokeWidth(this.P0);
            this.V0.setFillType(Path$FillType.EVEN_ODD);
            canvas.drawPath(this.W0, this.N0);
        }
    }
    
    public final void e(final float s0) {
        this.S0 = s0;
        this.p();
        ((Drawable)this).invalidateSelf();
    }
    
    public final void g() {
        Arrays.fill(this.L0, 0.0f);
        this.p();
        ((Drawable)this).invalidateSelf();
    }
    
    public final void h(final boolean t0) {
        this.T0 = t0;
        this.p();
        ((Drawable)this).invalidateSelf();
    }
    
    public final void j() {
        if (this.U0) {
            this.U0 = false;
            ((Drawable)this).invalidateSelf();
        }
    }
    
    public final void m(final float[] array) {
        if (array == null) {
            Arrays.fill(this.L0, 0.0f);
        }
        else {
            fli.o(array.length == 8, (Object)"radii should have exactly 8 values");
            System.arraycopy(array, 0, this.L0, 0, 8);
        }
        this.p();
        ((Drawable)this).invalidateSelf();
    }
    
    public final void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        this.p();
    }
    
    public final void p() {
        this.V0.reset();
        this.W0.reset();
        this.X0.set(((Drawable)this).getBounds());
        final RectF x0 = this.X0;
        final float s0 = this.S0;
        x0.inset(s0, s0);
        if (this.H0 == 1) {
            this.V0.addRect(this.X0, Path$Direction.CW);
        }
        if (this.O0) {
            this.V0.addCircle(this.X0.centerX(), this.X0.centerY(), Math.min(this.X0.width(), this.X0.height()) / 2.0f, Path$Direction.CW);
        }
        else {
            this.V0.addRoundRect(this.X0, this.L0, Path$Direction.CW);
        }
        final RectF x2 = this.X0;
        final float n = -this.S0;
        x2.inset(n, n);
        final RectF x3 = this.X0;
        final float n2 = this.P0 / 2.0f;
        x3.inset(n2, n2);
        if (this.O0) {
            this.W0.addCircle(this.X0.centerX(), this.X0.centerY(), Math.min(this.X0.width(), this.X0.height()) / 2.0f, Path$Direction.CW);
        }
        else {
            int n3 = 0;
            float[] m0;
            while (true) {
                m0 = this.M0;
                if (n3 >= m0.length) {
                    break;
                }
                m0[n3] = this.L0[n3] + this.S0 - this.P0 / 2.0f;
                ++n3;
            }
            this.W0.addRoundRect(this.X0, m0, Path$Direction.CW);
        }
        final RectF x4 = this.X0;
        final float n4 = -this.P0 / 2.0f;
        x4.inset(n4, n4);
    }
}
