import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Paint$FontMetricsInt;
import android.text.style.ReplacementSpan;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chk extends ReplacementSpan
{
    public static final a Companion;
    public final float D0;
    public final int E0;
    public final float F0;
    public final int G0;
    public final float H0;
    public final int I0;
    public Paint$FontMetricsInt J0;
    public int K0;
    public int L0;
    public boolean M0;
    
    static {
        Companion = new a();
    }
    
    public final Paint$FontMetricsInt a() {
        final Paint$FontMetricsInt j0 = this.J0;
        if (j0 != null) {
            return j0;
        }
        czd.m("fontMetrics");
        throw null;
    }
    
    public final int b() {
        if (this.M0) {
            return this.L0;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }
    
    public final int c() {
        if (this.M0) {
            return this.K0;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }
    
    public final void draw(final Canvas canvas, final CharSequence charSequence, final int n, final int n2, final float n3, final int n4, final int n5, final int n6, final Paint paint) {
        czd.f((Object)canvas, "canvas");
        czd.f((Object)paint, "paint");
    }
    
    @SuppressLint({ "DocumentExceptions" })
    public final int getSize(final Paint paint, final CharSequence charSequence, int n, final int n2, final Paint$FontMetricsInt paint$FontMetricsInt) {
        czd.f((Object)paint, "paint");
        this.M0 = true;
        final float textSize = paint.getTextSize();
        final Paint$FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        czd.e((Object)fontMetricsInt, "paint.fontMetricsInt");
        this.J0 = fontMetricsInt;
        if (this.a().descent > this.a().ascent) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            n = this.E0;
            float n3;
            if (n != 0) {
                if (n != 1) {
                    throw new IllegalArgumentException("Unsupported unit.");
                }
                n3 = this.D0 * textSize;
            }
            else {
                n3 = this.D0 * this.H0;
            }
            this.K0 = uoz.n(n3);
            n = this.G0;
            if (n != 0) {
                if (n != 1) {
                    throw new IllegalArgumentException("Unsupported unit.");
                }
                n = uoz.n(this.F0 * textSize);
            }
            else {
                n = uoz.n(this.F0 * this.H0);
            }
            this.L0 = n;
            if (paint$FontMetricsInt != null) {
                paint$FontMetricsInt.ascent = this.a().ascent;
                paint$FontMetricsInt.descent = this.a().descent;
                paint$FontMetricsInt.leading = this.a().leading;
                switch (this.I0) {
                    default: {
                        throw new IllegalArgumentException("Unknown verticalAlign.");
                    }
                    case 3:
                    case 6: {
                        if (paint$FontMetricsInt.descent - paint$FontMetricsInt.ascent < this.b()) {
                            n = paint$FontMetricsInt.ascent - (this.b() - (paint$FontMetricsInt.descent - paint$FontMetricsInt.ascent)) / 2;
                            paint$FontMetricsInt.ascent = n;
                            paint$FontMetricsInt.descent = this.b() + n;
                            break;
                        }
                        break;
                    }
                    case 2:
                    case 5: {
                        if (paint$FontMetricsInt.ascent > paint$FontMetricsInt.descent - this.b()) {
                            paint$FontMetricsInt.ascent = paint$FontMetricsInt.descent - this.b();
                            break;
                        }
                        break;
                    }
                    case 1:
                    case 4: {
                        n = paint$FontMetricsInt.ascent;
                        if (this.b() + n > paint$FontMetricsInt.descent) {
                            n = paint$FontMetricsInt.ascent;
                            paint$FontMetricsInt.descent = this.b() + n;
                            break;
                        }
                        break;
                    }
                    case 0: {
                        if (paint$FontMetricsInt.ascent > -this.b()) {
                            paint$FontMetricsInt.ascent = -this.b();
                            break;
                        }
                        break;
                    }
                }
                paint$FontMetricsInt.top = Math.min(this.a().top, paint$FontMetricsInt.ascent);
                paint$FontMetricsInt.bottom = Math.max(this.a().bottom, paint$FontMetricsInt.descent);
            }
            return this.c();
        }
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
    }
    
    public static final class a
    {
    }
}
