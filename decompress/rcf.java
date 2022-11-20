import android.graphics.Paint$FontMetricsInt;
import android.text.style.LineHeightSpan;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rcf implements LineHeightSpan
{
    public final float D0;
    public final int E0;
    public final int F0;
    public final boolean G0;
    public final boolean H0;
    public final float I0;
    public int J0;
    public int K0;
    public int L0;
    public int M0;
    public int N0;
    public int O0;
    
    public rcf(final float d0, int f0, final boolean g0, final boolean h0, final float i0) {
        this.D0 = d0;
        boolean b = false;
        this.E0 = 0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        if (0.0f <= i0 && i0 <= 1.0f) {
            f0 = 1;
        }
        else {
            f0 = 0;
        }
        Label_0086: {
            if (f0 == 0) {
                if (i0 == -1.0f) {
                    f0 = 1;
                }
                else {
                    f0 = 0;
                }
                if (f0 == 0) {
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
    
    public final void chooseHeight(final CharSequence charSequence, int n, int n2, int ascent, int n3, final Paint$FontMetricsInt paint$FontMetricsInt) {
        czd.f((Object)charSequence, "text");
        czd.f((Object)paint$FontMetricsInt, "fontMetricsInt");
        if (chw.r0(paint$FontMetricsInt) <= 0) {
            return;
        }
        n3 = this.E0;
        ascent = 0;
        if (n == n3) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n2 == this.F0) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n != 0 && n2 != 0 && this.G0 && this.H0) {
            return;
        }
        if (n != 0) {
            n3 = chw.r0(paint$FontMetricsInt);
            final int n4 = (int)(float)Math.ceil(this.D0);
            n3 = n4 - n3;
            float i0 = this.I0;
            if (i0 == -1.0f) {
                ascent = 1;
            }
            if (ascent != 0) {
                i0 = Math.abs((float)paint$FontMetricsInt.ascent) / chw.r0(paint$FontMetricsInt);
            }
            double n5;
            if (n3 <= 0) {
                n5 = Math.ceil(n3 * i0);
            }
            else {
                n5 = Math.ceil((1.0f - i0) * n3);
            }
            ascent = (int)(float)n5;
            final int descent = paint$FontMetricsInt.descent;
            n3 = ascent + descent;
            this.L0 = n3;
            ascent = n3 - n4;
            this.K0 = ascent;
            if (this.G0) {
                ascent = paint$FontMetricsInt.ascent;
            }
            this.J0 = ascent;
            if (this.H0) {
                n3 = descent;
            }
            this.M0 = n3;
            this.N0 = paint$FontMetricsInt.ascent - ascent;
            this.O0 = n3 - descent;
        }
        if (n != 0) {
            n = this.J0;
        }
        else {
            n = this.K0;
        }
        paint$FontMetricsInt.ascent = n;
        if (n2 != 0) {
            n = this.M0;
        }
        else {
            n = this.L0;
        }
        paint$FontMetricsInt.descent = n;
    }
}
