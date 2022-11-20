import android.graphics.RectF;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import android.graphics.Canvas;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v94 extends ki9<da4>
{
    public int c;
    public float d;
    public float e;
    public float f;
    
    public v94(final da4 da4) {
        super((dp1)da4);
        this.c = 1;
    }
    
    @Override
    public final void a(final Canvas canvas, final Paint paint, float n, float f, final int color) {
        if (n == f) {
            return;
        }
        paint.setStyle(Paint$Style.STROKE);
        paint.setStrokeCap(Paint$Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(color);
        paint.setStrokeWidth(this.d);
        final float n2 = (float)this.c;
        final float n3 = n * 360.0f * n2;
        if (f >= n) {
            n = f - n;
        }
        else {
            n = 1.0f + f - n;
        }
        final float n4 = n * 360.0f * n2;
        f = this.f;
        n = -f;
        canvas.drawArc(new RectF(n, n, f, f), n3, n4, false, paint);
        if (this.e > 0.0f && Math.abs(n4) < 360.0f) {
            paint.setStyle(Paint$Style.FILL);
            this.f(canvas, paint, this.d, this.e, n3);
            this.f(canvas, paint, this.d, this.e, n3 + n4);
        }
    }
    
    @Override
    public final void b(final Canvas canvas, final Paint paint) {
        final int f = rp9.F(((dp1)super.a).d, super.b.M0);
        paint.setStyle(Paint$Style.STROKE);
        paint.setStrokeCap(Paint$Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(f);
        paint.setStrokeWidth(this.d);
        final float f2 = this.f;
        canvas.drawArc(new RectF(-f2, -f2, f2, f2), 0.0f, 360.0f, false, paint);
    }
    
    @Override
    public final int c() {
        final da4 da4 = (da4)super.a;
        return da4.h * 2 + da4.g;
    }
    
    @Override
    public final int d() {
        final da4 da4 = (da4)super.a;
        return da4.h * 2 + da4.g;
    }
    
    public final void f(final Canvas canvas, final Paint paint, float n, final float n2, float f) {
        canvas.save();
        canvas.rotate(f);
        f = this.f;
        n /= 2.0f;
        canvas.drawRoundRect(new RectF(f - n, n2, f + n, -n2), n2, n2, paint);
        canvas.restore();
    }
}
