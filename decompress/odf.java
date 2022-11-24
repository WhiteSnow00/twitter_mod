import android.graphics.Paint$FontMetricsInt;
import android.text.style.LineHeightSpan;

// 
// Decompiled by Procyon v0.6.0
// 

public final class odf implements LineHeightSpan
{
    public final float F0;
    public final int G0;
    public final int H0;
    public final boolean I0;
    public final boolean J0;
    public final float K0;
    public int L0;
    public int M0;
    public int N0;
    public int O0;
    public int P0;
    public int Q0;
    
    public odf(final float f0, int h0, final boolean i0, final boolean j0, final float k0) {
        this.F0 = f0;
        boolean b = false;
        this.G0 = 0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        if (0.0f <= k0 && k0 <= 1.0f) {
            h0 = 1;
        }
        else {
            h0 = 0;
        }
        Label_0086: {
            if (h0 == 0) {
                if (k0 == -1.0f) {
                    h0 = 1;
                }
                else {
                    h0 = 0;
                }
                if (h0 == 0) {
                    break Label_0086;
                }
            }
            b = true;
        }
        if (b) {
            return;
        }
        throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
    }
    
    public final void chooseHeight(final CharSequence charSequence, int descent, int ascent, int g0, int n, final Paint$FontMetricsInt paint$FontMetricsInt) {
        e0e.f((Object)charSequence, "text");
        e0e.f((Object)paint$FontMetricsInt, "fontMetricsInt");
        if (amz.w(paint$FontMetricsInt) <= 0) {
            return;
        }
        g0 = this.G0;
        n = 0;
        if (descent == g0) {
            g0 = 1;
        }
        else {
            g0 = 0;
        }
        if (ascent == this.H0) {
            descent = 1;
        }
        else {
            descent = 0;
        }
        if (g0 != 0 && descent != 0 && this.I0 && this.J0) {
            return;
        }
        if (g0 != 0) {
            ascent = amz.w(paint$FontMetricsInt);
            final int n2 = (int)(float)Math.ceil(this.F0);
            final int n3 = n2 - ascent;
            float k0 = this.K0;
            ascent = n;
            if (k0 == -1.0f) {
                ascent = 1;
            }
            if (ascent != 0) {
                k0 = Math.abs((float)paint$FontMetricsInt.ascent) / amz.w(paint$FontMetricsInt);
            }
            double n4;
            if (n3 <= 0) {
                n4 = Math.ceil(n3 * k0);
            }
            else {
                n4 = Math.ceil((1.0f - k0) * n3);
            }
            ascent = (int)(float)n4;
            final int descent2 = paint$FontMetricsInt.descent;
            n = ascent + descent2;
            this.N0 = n;
            ascent = n - n2;
            this.M0 = ascent;
            if (this.I0) {
                ascent = paint$FontMetricsInt.ascent;
            }
            this.L0 = ascent;
            if (this.J0) {
                n = descent2;
            }
            this.O0 = n;
            this.P0 = paint$FontMetricsInt.ascent - ascent;
            this.Q0 = n - descent2;
        }
        if (g0 != 0) {
            ascent = this.L0;
        }
        else {
            ascent = this.M0;
        }
        paint$FontMetricsInt.ascent = ascent;
        if (descent != 0) {
            descent = this.O0;
        }
        else {
            descent = this.N0;
        }
        paint$FontMetricsInt.descent = descent;
    }
}
