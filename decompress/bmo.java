import android.graphics.PorterDuff$Mode;
import android.graphics.Rect;
import android.graphics.ColorFilter;
import java.util.Arrays;
import android.graphics.Canvas;
import android.graphics.Matrix$ScaleToFit;
import android.graphics.Path$FillType;
import android.graphics.Path$Direction;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bmo extends Drawable implements slo, lzt
{
    public final Drawable F0;
    public boolean G0;
    public boolean H0;
    public float I0;
    public final Path J0;
    public boolean K0;
    public int L0;
    public final Path M0;
    public final float[] N0;
    public final float[] O0;
    public float[] P0;
    public final RectF Q0;
    public final RectF R0;
    public final RectF S0;
    public final RectF T0;
    public RectF U0;
    public final Matrix V0;
    public final Matrix W0;
    public final Matrix X0;
    public final Matrix Y0;
    public final Matrix Z0;
    public Matrix a1;
    public Matrix b1;
    public final Matrix c1;
    public float d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public mzt h1;
    
    public bmo(final Drawable f0) {
        this.G0 = false;
        this.H0 = false;
        this.I0 = 0.0f;
        this.J0 = new Path();
        this.K0 = true;
        this.L0 = 0;
        this.M0 = new Path();
        this.N0 = new float[8];
        this.O0 = new float[8];
        this.Q0 = new RectF();
        this.R0 = new RectF();
        this.S0 = new RectF();
        this.T0 = new RectF();
        this.V0 = new Matrix();
        this.W0 = new Matrix();
        this.X0 = new Matrix();
        this.Y0 = new Matrix();
        this.Z0 = new Matrix();
        this.c1 = new Matrix();
        this.d1 = 0.0f;
        this.e1 = false;
        this.f1 = false;
        this.g1 = true;
        this.F0 = f0;
    }
    
    public final void a(final int l0, final float i0) {
        if (this.L0 != l0 || this.I0 != i0) {
            this.L0 = l0;
            this.I0 = i0;
            this.g1 = true;
            this.invalidateSelf();
        }
    }
    
    public final void b(final boolean g0) {
        this.G0 = g0;
        this.g1 = true;
        this.invalidateSelf();
    }
    
    public final void c() {
        if (this.g1) {
            this.M0.reset();
            final RectF q0 = this.Q0;
            final float i0 = this.I0;
            q0.inset(i0 / 2.0f, i0 / 2.0f);
            if (this.G0) {
                this.M0.addCircle(this.Q0.centerX(), this.Q0.centerY(), Math.min(this.Q0.width(), this.Q0.height()) / 2.0f, Path$Direction.CW);
            }
            else {
                int n = 0;
                float[] o0;
                while (true) {
                    o0 = this.O0;
                    if (n >= o0.length) {
                        break;
                    }
                    o0[n] = this.N0[n] + this.d1 - this.I0 / 2.0f;
                    ++n;
                }
                this.M0.addRoundRect(this.Q0, o0, Path$Direction.CW);
            }
            final RectF q2 = this.Q0;
            final float i2 = this.I0;
            q2.inset(-i2 / 2.0f, -i2 / 2.0f);
            this.J0.reset();
            final float d1 = this.d1;
            float i3;
            if (this.e1) {
                i3 = this.I0;
            }
            else {
                i3 = 0.0f;
            }
            final float n2 = d1 + i3;
            this.Q0.inset(n2, n2);
            if (this.G0) {
                this.J0.addCircle(this.Q0.centerX(), this.Q0.centerY(), Math.min(this.Q0.width(), this.Q0.height()) / 2.0f, Path$Direction.CW);
            }
            else if (this.e1) {
                if (this.P0 == null) {
                    this.P0 = new float[8];
                }
                for (int j = 0; j < this.O0.length; ++j) {
                    this.P0[j] = this.N0[j] - this.I0;
                }
                this.J0.addRoundRect(this.Q0, this.P0, Path$Direction.CW);
            }
            else {
                this.J0.addRoundRect(this.Q0, this.N0, Path$Direction.CW);
            }
            final RectF q3 = this.Q0;
            final float n3 = -n2;
            q3.inset(n3, n3);
            this.J0.setFillType(Path$FillType.WINDING);
            this.g1 = false;
        }
    }
    
    public final void clearColorFilter() {
        this.F0.clearColorFilter();
    }
    
    public final void d() {
        final mzt h1 = this.h1;
        if (h1 != null) {
            h1.c(this.X0);
            this.h1.i(this.Q0);
        }
        else {
            this.X0.reset();
            this.Q0.set(this.getBounds());
        }
        this.S0.set(0.0f, 0.0f, (float)this.getIntrinsicWidth(), (float)this.getIntrinsicHeight());
        this.T0.set(this.F0.getBounds());
        this.V0.setRectToRect(this.S0, this.T0, Matrix$ScaleToFit.FILL);
        if (this.e1) {
            final RectF u0 = this.U0;
            if (u0 == null) {
                this.U0 = new RectF(this.Q0);
            }
            else {
                u0.set(this.Q0);
            }
            final RectF u2 = this.U0;
            final float i0 = this.I0;
            u2.inset(i0, i0);
            if (this.a1 == null) {
                this.a1 = new Matrix();
            }
            this.a1.setRectToRect(this.Q0, this.U0, Matrix$ScaleToFit.FILL);
        }
        else {
            final Matrix a1 = this.a1;
            if (a1 != null) {
                a1.reset();
            }
        }
        Label_0403: {
            if (this.X0.equals((Object)this.Y0) && this.V0.equals((Object)this.W0)) {
                final Matrix a2 = this.a1;
                if (a2 == null || a2.equals((Object)this.b1)) {
                    break Label_0403;
                }
            }
            this.K0 = true;
            this.X0.invert(this.Z0);
            this.c1.set(this.X0);
            if (this.e1) {
                this.c1.postConcat(this.a1);
            }
            this.c1.preConcat(this.V0);
            this.Y0.set(this.X0);
            this.W0.set(this.V0);
            if (this.e1) {
                final Matrix b1 = this.b1;
                if (b1 == null) {
                    this.b1 = new Matrix(this.a1);
                }
                else {
                    b1.set(this.a1);
                }
            }
            else {
                final Matrix b2 = this.b1;
                if (b2 != null) {
                    b2.reset();
                }
            }
        }
        if (!this.Q0.equals((Object)this.R0)) {
            this.g1 = true;
            this.R0.set(this.Q0);
        }
    }
    
    public void draw(final Canvas canvas) {
        rrb.b();
        this.F0.draw(canvas);
        rrb.b();
    }
    
    public final void e(final float d1) {
        if (this.d1 != d1) {
            this.d1 = d1;
            this.g1 = true;
            this.invalidateSelf();
        }
    }
    
    public final void f(final mzt h1) {
        this.h1 = h1;
    }
    
    public final void g() {
        Arrays.fill(this.N0, 0.0f);
        this.H0 = false;
        this.g1 = true;
        this.invalidateSelf();
    }
    
    public final int getAlpha() {
        return this.F0.getAlpha();
    }
    
    public final ColorFilter getColorFilter() {
        return this.F0.getColorFilter();
    }
    
    public final int getIntrinsicHeight() {
        return this.F0.getIntrinsicHeight();
    }
    
    public final int getIntrinsicWidth() {
        return this.F0.getIntrinsicWidth();
    }
    
    public final int getOpacity() {
        return this.F0.getOpacity();
    }
    
    public final void h(final boolean e1) {
        if (this.e1 != e1) {
            this.e1 = e1;
            this.g1 = true;
            this.invalidateSelf();
        }
    }
    
    public final void j() {
        if (this.f1) {
            this.f1 = false;
            this.invalidateSelf();
        }
    }
    
    public final void m(final float[] array) {
        if (array == null) {
            Arrays.fill(this.N0, 0.0f);
            this.H0 = false;
        }
        else {
            xd.F(array.length == 8, "radii should have exactly 8 values");
            System.arraycopy(array, 0, this.N0, 0, 8);
            this.H0 = false;
            for (int i = 0; i < 8; ++i) {
                this.H0 |= (array[i] > 0.0f);
            }
        }
        this.g1 = true;
        this.invalidateSelf();
    }
    
    public final void onBoundsChange(final Rect bounds) {
        this.F0.setBounds(bounds);
    }
    
    public void setAlpha(final int alpha) {
        this.F0.setAlpha(alpha);
    }
    
    public final void setColorFilter(final int n, final PorterDuff$Mode porterDuff$Mode) {
        this.F0.setColorFilter(n, porterDuff$Mode);
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.F0.setColorFilter(colorFilter);
    }
}
