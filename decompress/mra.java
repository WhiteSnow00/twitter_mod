import java.util.Objects;
import android.os.SystemClock;
import android.graphics.Canvas;
import java.util.Arrays;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mra extends ps0
{
    public final Drawable[] N0;
    public final int O0;
    public int P0;
    public int Q0;
    public long R0;
    public int[] S0;
    public int[] T0;
    public int U0;
    public boolean[] V0;
    public int W0;
    public a X0;
    public boolean Y0;
    public boolean Z0;
    
    public mra(final Drawable[] n0) {
        super(n0);
        this.Z0 = true;
        xd.N(n0.length >= 1, "At least one layer required!");
        this.N0 = n0;
        final int[] s0 = new int[n0.length];
        this.S0 = s0;
        this.T0 = new int[n0.length];
        this.U0 = 255;
        this.V0 = new boolean[n0.length];
        this.W0 = 0;
        this.O0 = 2;
        this.P0 = 2;
        Arrays.fill(s0, 0);
        this.S0[0] = 255;
        Arrays.fill(this.T0, 0);
        this.T0[0] = 255;
        Arrays.fill(this.V0, false);
        this.V0[0] = true;
    }
    
    public final void d() {
        ++this.W0;
    }
    
    @Override
    public final void draw(final Canvas canvas) {
        final int p = this.P0;
        int n = 2;
        boolean b;
        if (p != 0) {
            if (p != 1) {
                b = true;
            }
            else {
                xd.M(this.Q0 > 0);
                b = this.h((SystemClock.uptimeMillis() - this.R0) / (float)this.Q0);
                if (!b) {
                    n = 1;
                }
                this.P0 = n;
            }
        }
        else {
            System.arraycopy(this.T0, 0, this.S0, 0, this.N0.length);
            this.R0 = SystemClock.uptimeMillis();
            float n2;
            if (this.Q0 == 0) {
                n2 = 1.0f;
            }
            else {
                n2 = 0.0f;
            }
            b = this.h(n2);
            if (!this.Y0) {
                final int o0 = this.O0;
                if (o0 >= 0) {
                    final boolean[] v0 = this.V0;
                    if (o0 < v0.length) {
                        if (v0[o0]) {
                            this.Y0 = true;
                            final a x0 = this.X0;
                            if (x0 != null) {
                                Objects.requireNonNull(((rb)x0).a);
                            }
                        }
                    }
                }
            }
            if (!b) {
                n = 1;
            }
            this.P0 = n;
        }
        int n3 = 0;
        while (true) {
            final Drawable[] n4 = this.N0;
            if (n3 >= n4.length) {
                break;
            }
            final Drawable drawable = n4[n3];
            final int alpha = (int)Math.ceil(this.T0[n3] * this.U0 / 255.0);
            if (drawable != null && alpha > 0) {
                ++this.W0;
                if (this.Z0) {
                    drawable.mutate();
                }
                drawable.setAlpha(alpha);
                --this.W0;
                drawable.draw(canvas);
            }
            ++n3;
        }
        if (b) {
            if (this.Y0) {
                this.Y0 = false;
                final a x2 = this.X0;
                if (x2 != null) {
                    Objects.requireNonNull(((rb)x2).a);
                }
            }
        }
        else {
            this.invalidateSelf();
        }
    }
    
    public final void e() {
        --this.W0;
        this.invalidateSelf();
    }
    
    public final void g() {
        this.P0 = 2;
        for (int i = 0; i < this.N0.length; ++i) {
            final int[] t0 = this.T0;
            int n;
            if (this.V0[i]) {
                n = 255;
            }
            else {
                n = 0;
            }
            t0[i] = n;
        }
        this.invalidateSelf();
    }
    
    public final int getAlpha() {
        return this.U0;
    }
    
    public final boolean h(final float n) {
        int i = 0;
        boolean b = true;
        while (i < this.N0.length) {
            final boolean[] v0 = this.V0;
            int n2;
            if (v0[i]) {
                n2 = 1;
            }
            else {
                n2 = -1;
            }
            final int[] t0 = this.T0;
            t0[i] = (int)(n2 * 255 * n + this.S0[i]);
            if (t0[i] < 0) {
                t0[i] = 0;
            }
            if (t0[i] > 255) {
                t0[i] = 255;
            }
            boolean b2 = b;
            if (v0[i]) {
                b2 = b;
                if (t0[i] < 255) {
                    b2 = false;
                }
            }
            b = b2;
            if (!v0[i]) {
                b = b2;
                if (t0[i] > 0) {
                    b = false;
                }
            }
            ++i;
        }
        return b;
    }
    
    public final void invalidateSelf() {
        if (this.W0 == 0) {
            super.invalidateSelf();
        }
    }
    
    @Override
    public final void setAlpha(final int u0) {
        if (this.U0 != u0) {
            this.U0 = u0;
            this.invalidateSelf();
        }
    }
    
    public interface a
    {
    }
}
