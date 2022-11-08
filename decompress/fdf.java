import android.graphics.Paint$FontMetricsInt;
import android.text.style.LineHeightSpan;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fdf implements LineHeightSpan
{
    public final float C0;
    public final int D0;
    public final int E0;
    public final boolean F0;
    public final boolean G0;
    public final float H0;
    public int I0;
    public int J0;
    public int K0;
    public int L0;
    public int M0;
    public int N0;
    
    public fdf(final float c0, int e0, final boolean f0, final boolean g0, final float h0) {
        this.C0 = c0;
        boolean b = false;
        this.D0 = 0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        if (0.0f <= h0 && h0 <= 1.0f) {
            e0 = 1;
        }
        else {
            e0 = 0;
        }
        Label_0086: {
            if (e0 == 0) {
                if (h0 == -1.0f) {
                    e0 = 1;
                }
                else {
                    e0 = 0;
                }
                if (e0 == 0) {
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
        zzd.f((Object)charSequence, "text");
        zzd.f((Object)paint$FontMetricsInt, "fontMetricsInt");
        if (q0b.l(paint$FontMetricsInt) <= 0) {
            return;
        }
        n3 = this.D0;
        ascent = 0;
        if (n == n3) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n2 == this.E0) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n != 0 && n2 != 0 && this.F0 && this.G0) {
            return;
        }
        if (n != 0) {
            n3 = q0b.l(paint$FontMetricsInt);
            final int n4 = (int)(float)Math.ceil(this.C0);
            n3 = n4 - n3;
            float h0 = this.H0;
            if (h0 == -1.0f) {
                ascent = 1;
            }
            if (ascent != 0) {
                h0 = Math.abs((float)paint$FontMetricsInt.ascent) / q0b.l(paint$FontMetricsInt);
            }
            double n5;
            if (n3 <= 0) {
                n5 = Math.ceil(n3 * h0);
            }
            else {
                n5 = Math.ceil((1.0f - h0) * n3);
            }
            ascent = (int)(float)n5;
            final int descent = paint$FontMetricsInt.descent;
            n3 = ascent + descent;
            this.K0 = n3;
            ascent = n3 - n4;
            this.J0 = ascent;
            if (this.F0) {
                ascent = paint$FontMetricsInt.ascent;
            }
            this.I0 = ascent;
            if (this.G0) {
                n3 = descent;
            }
            this.L0 = n3;
            this.M0 = paint$FontMetricsInt.ascent - ascent;
            this.N0 = n3 - descent;
        }
        if (n != 0) {
            n = this.I0;
        }
        else {
            n = this.J0;
        }
        paint$FontMetricsInt.ascent = n;
        if (n2 != 0) {
            n = this.L0;
        }
        else {
            n = this.K0;
        }
        paint$FontMetricsInt.descent = n;
    }
}
