import android.graphics.ColorFilter;
import java.util.Iterator;
import java.util.Map;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import java.util.Locale;
import android.graphics.RectF;
import android.graphics.Rect;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.HashMap;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qb8 extends Drawable implements y7d
{
    public String F0;
    public int G0;
    public int H0;
    public int I0;
    public ovo$b J0;
    public HashMap<String, String> K0;
    public int L0;
    public int M0;
    public int N0;
    public final Paint O0;
    public final Matrix P0;
    public final Rect Q0;
    public final RectF R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public int W0;
    public long X0;
    public String Y0;
    public int Z0;
    
    public qb8() {
        this.K0 = new HashMap<String, String>();
        this.N0 = 80;
        this.O0 = new Paint(1);
        this.P0 = new Matrix();
        this.Q0 = new Rect();
        this.R0 = new RectF();
        this.Z0 = -1;
        this.c();
    }
    
    public static String b(final String s, final Object... array) {
        return String.format(Locale.US, s, array);
    }
    
    public final void a(final Canvas canvas, String l, final String s, final int color) {
        l = mqb.l(l, ": ");
        final float measureText = this.O0.measureText(l);
        final float measureText2 = this.O0.measureText(s);
        this.O0.setColor(1711276032);
        final int v0 = this.V0;
        final float n = (float)(v0 - 4);
        final int w0 = this.W0;
        canvas.drawRect(n, (float)(w0 + 8), v0 + measureText + measureText2 + 4.0f, (float)(w0 + this.U0 + 8), this.O0);
        this.O0.setColor(-1);
        canvas.drawText(l, (float)this.V0, (float)this.W0, this.O0);
        this.O0.setColor(color);
        canvas.drawText(s, this.V0 + measureText, (float)this.W0, this.O0);
        this.W0 += this.U0;
    }
    
    public final void c() {
        this.G0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.K0 = new HashMap<String, String>();
        this.L0 = -1;
        this.M0 = -1;
        this.F0 = "none";
        this.invalidateSelf();
        this.X0 = -1L;
        this.Y0 = null;
        this.Z0 = -1;
        this.invalidateSelf();
    }
    
    public final void draw(final Canvas canvas) {
        final Rect bounds = this.getBounds();
        this.O0.setStyle(Paint$Style.STROKE);
        this.O0.setStrokeWidth(2.0f);
        this.O0.setColor(-26624);
        canvas.drawRect((float)bounds.left, (float)bounds.top, (float)bounds.right, (float)bounds.bottom, this.O0);
        this.O0.setStyle(Paint$Style.FILL);
        this.O0.setColor(0);
        canvas.drawRect((float)bounds.left, (float)bounds.top, (float)bounds.right, (float)bounds.bottom, this.O0);
        this.O0.setStyle(Paint$Style.FILL);
        this.O0.setStrokeWidth(0.0f);
        this.O0.setColor(-1);
        this.V0 = this.S0;
        this.W0 = this.T0;
        this.a(canvas, "ID", this.F0, -1);
        this.a(canvas, "D", b("%dx%d", bounds.width(), bounds.height()), -1);
        final int g0 = this.G0;
        final int h0 = this.H0;
        final ovo$b j0 = this.J0;
        int right = this.getBounds().width();
        int bottom = this.getBounds().height();
        int n6 = 0;
        Label_0522: {
            if (right > 0 && bottom > 0 && g0 > 0) {
                if (h0 > 0) {
                    if (j0 != null) {
                        final Rect q0 = this.Q0;
                        q0.top = 0;
                        q0.left = 0;
                        q0.right = right;
                        q0.bottom = bottom;
                        this.P0.reset();
                        ((ovo$a)j0).a(this.P0, this.Q0, g0, h0, 0.0f, 0.0f);
                        final RectF r0 = this.R0;
                        r0.top = 0.0f;
                        r0.left = 0.0f;
                        r0.right = (float)g0;
                        r0.bottom = (float)h0;
                        this.P0.mapRect(r0);
                        final int n = (int)this.R0.width();
                        final int n2 = (int)this.R0.height();
                        right = Math.min(right, n);
                        bottom = Math.min(bottom, n2);
                    }
                    final float n3 = (float)right;
                    final float n4 = (float)bottom;
                    final int abs = Math.abs(g0 - right);
                    final int abs2 = Math.abs(h0 - bottom);
                    final float n5 = (float)abs;
                    if (n5 < n3 * 0.1f && abs2 < 0.1f * n4) {
                        n6 = -16711936;
                        break Label_0522;
                    }
                    if (n5 < n3 * 0.5f && abs2 < n4 * 0.5f) {
                        n6 = -256;
                        break Label_0522;
                    }
                }
            }
            n6 = -65536;
        }
        this.a(canvas, "I", b("%dx%d", this.G0, this.H0), n6);
        this.a(canvas, "I", b("%d KiB", this.I0 / 1024), -1);
        final int l0 = this.L0;
        if (l0 > 0) {
            this.a(canvas, "anim", b("f %d, l %d", l0, this.M0), -1);
        }
        final ovo$b j2 = this.J0;
        if (j2 != null) {
            this.a(canvas, "scale", String.valueOf(j2), -1);
        }
        final long x0 = this.X0;
        if (x0 >= 0L) {
            this.a(canvas, "t", b("%d ms", x0), -1);
        }
        final String y0 = this.Y0;
        if (y0 != null) {
            this.a(canvas, "origin", y0, this.Z0);
        }
        for (final Map.Entry entry : this.K0.entrySet()) {
            this.a(canvas, (String)entry.getKey(), (String)entry.getValue(), -1);
        }
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    public final void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / 8, rect.height() / 9)));
        this.O0.setTextSize((float)min);
        min += 8;
        this.U0 = min;
        final int n0 = this.N0;
        if (n0 == 80) {
            this.U0 = min * -1;
        }
        this.S0 = rect.left + 10;
        int t0;
        if (n0 == 80) {
            t0 = rect.bottom - 10;
        }
        else {
            t0 = rect.top + 10 + 10;
        }
        this.T0 = t0;
    }
    
    public final void setAlpha(final int n) {
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
    }
}
