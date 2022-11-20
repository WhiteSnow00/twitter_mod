import java.util.Objects;
import android.os.SystemClock;
import android.graphics.Canvas;
import java.util.Arrays;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eqa extends ms0
{
    public final Drawable[] L0;
    public final int M0;
    public int N0;
    public int O0;
    public long P0;
    public int[] Q0;
    public int[] R0;
    public int S0;
    public boolean[] T0;
    public int U0;
    public a V0;
    public boolean W0;
    public boolean X0;
    
    public eqa(final Drawable[] l0) {
        super(l0);
        this.X0 = true;
        fli.v(l0.length >= 1, (Object)"At least one layer required!");
        this.L0 = l0;
        final int[] q0 = new int[l0.length];
        this.Q0 = q0;
        this.R0 = new int[l0.length];
        this.S0 = 255;
        this.T0 = new boolean[l0.length];
        this.U0 = 0;
        this.M0 = 2;
        this.N0 = 2;
        Arrays.fill(q0, 0);
        this.Q0[0] = 255;
        Arrays.fill(this.R0, 0);
        this.R0[0] = 255;
        Arrays.fill(this.T0, false);
        this.T0[0] = true;
    }
    
    public final void d() {
        ++this.U0;
    }
    
    public final void draw(final Canvas canvas) {
        final int n0 = this.N0;
        int n2 = 2;
        boolean b;
        if (n0 != 0) {
            if (n0 != 1) {
                b = true;
            }
            else {
                fli.u(this.O0 > 0);
                b = this.h((SystemClock.uptimeMillis() - this.P0) / (float)this.O0);
                if (!b) {
                    n2 = 1;
                }
                this.N0 = n2;
            }
        }
        else {
            System.arraycopy(this.R0, 0, this.Q0, 0, this.L0.length);
            this.P0 = SystemClock.uptimeMillis();
            float n3;
            if (this.O0 == 0) {
                n3 = 1.0f;
            }
            else {
                n3 = 0.0f;
            }
            b = this.h(n3);
            if (!this.W0) {
                final int m0 = this.M0;
                if (m0 >= 0) {
                    final boolean[] t0 = this.T0;
                    if (m0 < t0.length) {
                        if (t0[m0]) {
                            this.W0 = true;
                            final a v0 = this.V0;
                            if (v0 != null) {
                                Objects.requireNonNull(((qb)v0).a);
                            }
                        }
                    }
                }
            }
            if (!b) {
                n2 = 1;
            }
            this.N0 = n2;
        }
        int n4 = 0;
        while (true) {
            final Drawable[] l0 = this.L0;
            if (n4 >= l0.length) {
                break;
            }
            final Drawable drawable = l0[n4];
            final int alpha = (int)Math.ceil(this.R0[n4] * this.S0 / 255.0);
            if (drawable != null && alpha > 0) {
                ++this.U0;
                if (this.X0) {
                    drawable.mutate();
                }
                drawable.setAlpha(alpha);
                --this.U0;
                drawable.draw(canvas);
            }
            ++n4;
        }
        if (b) {
            if (this.W0) {
                this.W0 = false;
                final a v2 = this.V0;
                if (v2 != null) {
                    Objects.requireNonNull(((qb)v2).a);
                }
            }
        }
        else {
            this.invalidateSelf();
        }
    }
    
    public final void e() {
        --this.U0;
        this.invalidateSelf();
    }
    
    public final void g() {
        this.N0 = 2;
        for (int i = 0; i < this.L0.length; ++i) {
            final int[] r0 = this.R0;
            int n;
            if (this.T0[i]) {
                n = 255;
            }
            else {
                n = 0;
            }
            r0[i] = n;
        }
        this.invalidateSelf();
    }
    
    public final int getAlpha() {
        return this.S0;
    }
    
    public final boolean h(final float n) {
        int i = 0;
        boolean b = true;
        while (i < this.L0.length) {
            final boolean[] t0 = this.T0;
            int n2;
            if (t0[i]) {
                n2 = 1;
            }
            else {
                n2 = -1;
            }
            final int[] r0 = this.R0;
            r0[i] = (int)(n2 * 255 * n + this.Q0[i]);
            if (r0[i] < 0) {
                r0[i] = 0;
            }
            if (r0[i] > 255) {
                r0[i] = 255;
            }
            boolean b2 = b;
            if (t0[i]) {
                b2 = b;
                if (r0[i] < 255) {
                    b2 = false;
                }
            }
            b = b2;
            if (!t0[i]) {
                b = b2;
                if (r0[i] > 0) {
                    b = false;
                }
            }
            ++i;
        }
        return b;
    }
    
    public final void invalidateSelf() {
        if (this.U0 == 0) {
            super.invalidateSelf();
        }
    }
    
    public final void setAlpha(final int s0) {
        if (this.S0 != s0) {
            this.S0 = s0;
            this.invalidateSelf();
        }
    }
    
    public interface a
    {
    }
}
