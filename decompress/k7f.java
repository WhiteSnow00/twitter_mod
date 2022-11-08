import android.graphics.PathEffect;
import java.util.Objects;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.graphics.Paint$Align;
import java.util.ArrayList;
import android.graphics.Path;
import android.graphics.Paint$FontMetrics;
import java.util.List;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k7f extends r7b
{
    public Paint c;
    public Paint d;
    public i7f e;
    public List<j7f> f;
    public Paint$FontMetrics g;
    public Path h;
    
    public k7f(final t9x t9x, final i7f e) {
        super((Object)t9x, 3);
        this.f = new ArrayList(16);
        this.g = new Paint$FontMetrics();
        this.h = new Path();
        this.e = e;
        (this.c = new Paint(1)).setTextSize(nmw.c(9.0f));
        this.c.setTextAlign(Paint$Align.LEFT);
        (this.d = new Paint(1)).setStyle(Paint$Style.FILL);
    }
    
    public final void e(final Canvas canvas, final float n, final float n2, final j7f j7f, final i7f i7f) {
        final int f = j7f.f;
        if (f != 1122868 && f != 1122867) {
            if (f != 0) {
                final int save = canvas.save();
                int b;
                if ((b = j7f.b) == 3) {
                    Objects.requireNonNull(i7f);
                    b = 4;
                }
                this.d.setColor(j7f.f);
                float c;
                if (Float.isNaN(j7f.c)) {
                    Objects.requireNonNull(i7f);
                    c = 8.0f;
                }
                else {
                    c = j7f.c;
                }
                final float c2 = nmw.c(c);
                final float n3 = c2 / 2.0f;
                final int d = nb0.D(b);
                Label_0345: {
                    if (d != 2) {
                        if (d == 3) {
                            this.d.setStyle(Paint$Style.FILL);
                            canvas.drawRect(n, n2 - n3, n + c2, n2 + n3, this.d);
                            break Label_0345;
                        }
                        if (d != 4) {
                            if (d != 5) {
                                break Label_0345;
                            }
                            float d2;
                            if (Float.isNaN(j7f.d)) {
                                Objects.requireNonNull(i7f);
                                d2 = 3.0f;
                            }
                            else {
                                d2 = j7f.d;
                            }
                            final float c3 = nmw.c(d2);
                            Object e;
                            if ((e = j7f.e) == null) {
                                Objects.requireNonNull(i7f);
                                e = null;
                            }
                            this.d.setStyle(Paint$Style.STROKE);
                            this.d.setStrokeWidth(c3);
                            this.d.setPathEffect((PathEffect)e);
                            this.h.reset();
                            this.h.moveTo(n, n2);
                            this.h.lineTo(n + c2, n2);
                            canvas.drawPath(this.h, this.d);
                            break Label_0345;
                        }
                    }
                    this.d.setStyle(Paint$Style.FILL);
                    canvas.drawCircle(n + n3, n2, n3, this.d);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
