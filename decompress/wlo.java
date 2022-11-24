import android.graphics.ColorFilter;
import android.graphics.Rect;
import java.util.Arrays;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import android.graphics.Path$Direction;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wlo extends Drawable implements slo
{
    public final float[] F0;
    public final float[] G0;
    public float[] H0;
    public final Paint I0;
    public boolean J0;
    public float K0;
    public float L0;
    public int M0;
    public boolean N0;
    public boolean O0;
    public final Path P0;
    public final Path Q0;
    public int R0;
    public final RectF S0;
    public int T0;
    
    public wlo(final int r0) {
        this.F0 = new float[8];
        this.G0 = new float[8];
        this.I0 = new Paint(1);
        this.J0 = false;
        this.K0 = 0.0f;
        this.L0 = 0.0f;
        this.M0 = 0;
        this.N0 = false;
        this.O0 = false;
        this.P0 = new Path();
        this.Q0 = new Path();
        this.R0 = 0;
        this.S0 = new RectF();
        this.T0 = 255;
        if (this.R0 != r0) {
            this.R0 = r0;
            this.invalidateSelf();
        }
    }
    
    public final void a(final int m0, final float k0) {
        if (this.M0 != m0) {
            this.M0 = m0;
            this.invalidateSelf();
        }
        if (this.K0 != k0) {
            this.K0 = k0;
            this.c();
            this.invalidateSelf();
        }
    }
    
    public final void b(final boolean j0) {
        this.J0 = j0;
        this.c();
        this.invalidateSelf();
    }
    
    public final void c() {
        this.P0.reset();
        this.Q0.reset();
        this.S0.set(this.getBounds());
        final RectF s0 = this.S0;
        final float k0 = this.K0;
        s0.inset(k0 / 2.0f, k0 / 2.0f);
        final boolean j0 = this.J0;
        final int n = 0;
        if (j0) {
            this.Q0.addCircle(this.S0.centerX(), this.S0.centerY(), Math.min(this.S0.width(), this.S0.height()) / 2.0f, Path$Direction.CW);
        }
        else {
            int n2 = 0;
            float[] g0;
            while (true) {
                g0 = this.G0;
                if (n2 >= g0.length) {
                    break;
                }
                g0[n2] = this.F0[n2] + this.L0 - this.K0 / 2.0f;
                ++n2;
            }
            this.Q0.addRoundRect(this.S0, g0, Path$Direction.CW);
        }
        final RectF s2 = this.S0;
        final float k2 = this.K0;
        s2.inset(-k2 / 2.0f, -k2 / 2.0f);
        final float l0 = this.L0;
        float k3;
        if (this.N0) {
            k3 = this.K0;
        }
        else {
            k3 = 0.0f;
        }
        final float n3 = l0 + k3;
        this.S0.inset(n3, n3);
        if (this.J0) {
            this.P0.addCircle(this.S0.centerX(), this.S0.centerY(), Math.min(this.S0.width(), this.S0.height()) / 2.0f, Path$Direction.CW);
        }
        else if (this.N0) {
            int n4 = n;
            if (this.H0 == null) {
                this.H0 = new float[8];
                n4 = n;
            }
            float[] h0;
            while (true) {
                h0 = this.H0;
                if (n4 >= h0.length) {
                    break;
                }
                h0[n4] = this.F0[n4] - this.K0;
                ++n4;
            }
            this.P0.addRoundRect(this.S0, h0, Path$Direction.CW);
        }
        else {
            this.P0.addRoundRect(this.S0, this.F0, Path$Direction.CW);
        }
        final RectF s3 = this.S0;
        final float n5 = -n3;
        s3.inset(n5, n5);
    }
    
    public final void draw(final Canvas canvas) {
        this.I0.setColor(ke9.b(this.R0, this.T0));
        this.I0.setStyle(Paint$Style.FILL);
        this.I0.setFilterBitmap(this.O0);
        canvas.drawPath(this.P0, this.I0);
        if (this.K0 != 0.0f) {
            this.I0.setColor(ke9.b(this.M0, this.T0));
            this.I0.setStyle(Paint$Style.STROKE);
            this.I0.setStrokeWidth(this.K0);
            canvas.drawPath(this.Q0, this.I0);
        }
    }
    
    public final void e(final float l0) {
        if (this.L0 != l0) {
            this.L0 = l0;
            this.c();
            this.invalidateSelf();
        }
    }
    
    public final void g() {
        Arrays.fill(this.F0, 0.0f);
        this.c();
        this.invalidateSelf();
    }
    
    public final int getAlpha() {
        return this.T0;
    }
    
    public final int getOpacity() {
        final int n = ke9.b(this.R0, this.T0) >>> 24;
        int n2;
        if (n == 255) {
            n2 = -1;
        }
        else if (n == 0) {
            n2 = -2;
        }
        else {
            n2 = -3;
        }
        return n2;
    }
    
    public final void h(final boolean n0) {
        if (this.N0 != n0) {
            this.N0 = n0;
            this.c();
            this.invalidateSelf();
        }
    }
    
    public final void j() {
        if (this.O0) {
            this.O0 = false;
            this.invalidateSelf();
        }
    }
    
    public final void m(final float[] array) {
        if (array == null) {
            Arrays.fill(this.F0, 0.0f);
        }
        else {
            xd.F(array.length == 8, "radii should have exactly 8 values");
            System.arraycopy(array, 0, this.F0, 0, 8);
        }
        this.c();
        this.invalidateSelf();
    }
    
    public final void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        this.c();
    }
    
    public final void setAlpha(final int t0) {
        if (t0 != this.T0) {
            this.T0 = t0;
            this.invalidateSelf();
        }
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
    }
}
