import android.graphics.Paint;
import android.graphics.Color;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint$Style;
import android.graphics.RectF;
import android.graphics.ColorFilter;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kmq extends ym1
{
    public final lte A;
    public final float[] B;
    public final Path C;
    public final tve D;
    public wm1<ColorFilter, ColorFilter> E;
    public final RectF z;
    
    public kmq(final ceg ceg, final tve d) {
        super(ceg, d);
        this.z = new RectF();
        final lte a = new lte();
        this.A = a;
        this.B = new float[8];
        this.C = new Path();
        this.D = d;
        a.setAlpha(0);
        a.setStyle(Paint$Style.FILL);
        a.setColor(d.l);
    }
    
    @Override
    public final void c(final RectF rectF, final Matrix matrix, final boolean b) {
        super.c(rectF, matrix, b);
        final RectF z = this.z;
        final tve d = this.D;
        z.set(0.0f, 0.0f, (float)d.j, (float)d.k);
        super.m.mapRect(this.z);
        rectF.set(this.z);
    }
    
    @Override
    public final <T> void e(final T t, final seg seg) {
        super.e(t, seg);
        if (t == jeg.E) {
            if (seg == null) {
                this.E = null;
            }
            else {
                this.E = new xow(seg, (Object)null);
            }
        }
    }
    
    @Override
    public final void j(final Canvas canvas, final Matrix matrix, int alpha) {
        final int alpha2 = Color.alpha(this.D.l);
        if (alpha2 == 0) {
            return;
        }
        final wm1 j = super.v.j;
        int intValue;
        if (j == null) {
            intValue = 100;
        }
        else {
            intValue = (int)j.f();
        }
        alpha = (int)(alpha2 / 255.0f * intValue / 100.0f * (alpha / 255.0f) * 255.0f);
        this.A.setAlpha(alpha);
        final xow e = this.E;
        if (e != null) {
            this.A.setColorFilter((ColorFilter)e.f());
        }
        if (alpha > 0) {
            final float[] b = this.B;
            b[1] = (b[0] = 0.0f);
            final tve d = this.D;
            final float n = (float)d.j;
            b[2] = n;
            b[3] = 0.0f;
            b[4] = n;
            final float n2 = (float)d.k;
            b[5] = n2;
            b[6] = 0.0f;
            b[7] = n2;
            matrix.mapPoints(b);
            this.C.reset();
            final Path c = this.C;
            final float[] b2 = this.B;
            c.moveTo(b2[0], b2[1]);
            final Path c2 = this.C;
            final float[] b3 = this.B;
            c2.lineTo(b3[2], b3[3]);
            final Path c3 = this.C;
            final float[] b4 = this.B;
            c3.lineTo(b4[4], b4[5]);
            final Path c4 = this.C;
            final float[] b5 = this.B;
            c4.lineTo(b5[6], b5[7]);
            final Path c5 = this.C;
            final float[] b6 = this.B;
            c5.lineTo(b6[0], b6[1]);
            this.C.close();
            canvas.drawPath(this.C, (Paint)this.A);
        }
    }
}
