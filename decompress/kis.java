import android.text.Layout;
import kotlin.NoWhenBranchMatchedException;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import android.text.TextPaint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.style.LineBackgroundSpan;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kis implements LineBackgroundSpan
{
    public static final a Companion;
    public final float C0;
    public final float D0;
    public final RectF E0;
    public final Path F0;
    public float G0;
    public float H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;
    public final Paint M0;
    public int N0;
    
    static {
        Companion = new a();
    }
    
    public kis(final float n, final float n2) {
        this.C0 = n;
        this.D0 = n2;
        this.E0 = new RectF();
        this.F0 = new Path();
        this.G0 = -1.0f;
        this.H0 = -1.0f;
        this.I0 = -1.0f;
        this.J0 = -1.0f;
        this.K0 = n2;
        this.L0 = n;
        final Paint m0 = new Paint();
        m0.setAntiAlias(true);
        this.M0 = m0;
        this.N0 = 2;
    }
    
    public final void drawBackground(final Canvas canvas, final Paint paint, int n, final int n2, final int n3, int d, final int n4, final CharSequence charSequence, final int n5, final int n6, final int n7) {
        zzd.f((Object)canvas, "canvas");
        zzd.f((Object)paint, "paint");
        zzd.f((Object)charSequence, "text");
        n = n6 - 1;
        if (charSequence.charAt(n) != '\n') {
            n = n6;
        }
        final StaticLayout staticLayout = new StaticLayout(charSequence.subSequence(n5, n), (TextPaint)paint, Integer.MAX_VALUE, Layout$Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        n = 0;
        final float g0 = this.L0 * 2.0f + ((Layout)staticLayout).getLineWidth(0);
        d = nb0.D(this.N0);
        float n9;
        float n10;
        if (d != 0) {
            if (d != 1) {
                if (d != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                final float n8 = (float)n2;
                final float l0 = this.L0;
                n9 = n8 - g0 + l0;
                n10 = n8 + l0;
            }
            else {
                final float n11 = (float)n2;
                n9 = (n11 - g0) / 2;
                n10 = n11 - n9;
            }
        }
        else {
            n9 = 0.0f - this.L0;
            n10 = g0 + n9;
        }
        this.E0.set(n9, (float)n3, n10, (float)n4);
        Label_0929: {
            if (n7 != 0) {
                if (this.G0 == -1.0f) {
                    n = 1;
                }
                if (n == 0) {
                    this.F0.reset();
                    final float n12 = g0 - this.G0;
                    final float n13 = -Math.signum(n12);
                    final float n14 = this.K0 * 2.0f;
                    final float abs = Math.abs(n12 / 2.0f);
                    float n15 = n14;
                    if (n14 > abs) {
                        n15 = abs;
                    }
                    final float n16 = n13 * n15 / 2.0f;
                    this.F0.moveTo(this.H0, this.J0 - this.K0);
                    if (this.N0 != 1) {
                        final Path f0 = this.F0;
                        final float h0 = this.H0;
                        final float j0 = this.J0;
                        final float k0 = this.K0;
                        final float top = this.E0.top;
                        f0.cubicTo(h0, j0 - k0, h0, top, h0 + n16, top);
                        final Path f2 = this.F0;
                        final RectF e0 = this.E0;
                        f2.lineTo(e0.left - n16, e0.top);
                        final Path f3 = this.F0;
                        final RectF e2 = this.E0;
                        final float left = e2.left;
                        final float top2 = e2.top;
                        f3.cubicTo(left - n16, top2, left, top2, left, this.K0 + top2);
                    }
                    else {
                        this.F0.lineTo(this.H0, this.J0 + this.K0);
                    }
                    final Path f4 = this.F0;
                    final RectF e3 = this.E0;
                    f4.lineTo(e3.left, e3.bottom - this.K0);
                    final Path f5 = this.F0;
                    final RectF e4 = this.E0;
                    final float left2 = e4.left;
                    final float bottom = e4.bottom;
                    final float k2 = this.K0;
                    f5.cubicTo(left2, bottom - k2, left2, bottom, k2 + left2, bottom);
                    final Path f6 = this.F0;
                    final RectF e5 = this.E0;
                    f6.lineTo(e5.right - this.K0, e5.bottom);
                    final Path f7 = this.F0;
                    final RectF e6 = this.E0;
                    final float right = e6.right;
                    final float k3 = this.K0;
                    final float bottom2 = e6.bottom;
                    f7.cubicTo(right - k3, bottom2, right, bottom2, right, bottom2 - k3);
                    final Path f8 = this.F0;
                    final RectF e7 = this.E0;
                    f8.lineTo(e7.right, e7.top + this.K0);
                    if (this.N0 != 3) {
                        final Path f9 = this.F0;
                        final RectF e8 = this.E0;
                        final float right2 = e8.right;
                        final float top3 = e8.top;
                        f9.cubicTo(right2, this.K0 + top3, right2, top3, right2 + n16, top3);
                        this.F0.lineTo(this.I0 - n16, this.E0.top);
                        final Path f10 = this.F0;
                        final float i0 = this.I0;
                        final float top4 = this.E0.top;
                        f10.cubicTo(i0 - n16, top4, i0, top4, i0, this.J0 - this.K0);
                    }
                    else {
                        this.F0.lineTo(this.I0, this.J0 - this.K0);
                    }
                    this.F0.lineTo(this.I0 - this.K0, this.J0);
                    this.F0.lineTo(this.H0 + this.K0, this.J0);
                    this.F0.lineTo(this.H0, this.E0.top - this.K0);
                    canvas.drawPath(this.F0, this.M0);
                    break Label_0929;
                }
            }
            final RectF e9 = this.E0;
            final float k4 = this.K0;
            canvas.drawRoundRect(e9, k4, k4, this.M0);
        }
        this.G0 = g0;
        final RectF e10 = this.E0;
        this.H0 = e10.left;
        this.I0 = e10.right;
        this.J0 = e10.bottom - 1;
    }
    
    public static final class a
    {
    }
}
