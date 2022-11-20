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

public final class u6f extends p6b
{
    public Paint F0;
    public Paint G0;
    public s6f H0;
    public List<t6f> I0;
    public Paint$FontMetrics J0;
    public Path K0;
    
    public u6f(final oax oax, final s6f h0) {
        super((Object)oax, 3);
        this.I0 = new ArrayList(16);
        this.J0 = new Paint$FontMetrics();
        this.K0 = new Path();
        this.H0 = h0;
        (this.F0 = new Paint(1)).setTextSize(inw.c(9.0f));
        this.F0.setTextAlign(Paint$Align.LEFT);
        (this.G0 = new Paint(1)).setStyle(Paint$Style.FILL);
    }
    
    public final void e(final Canvas canvas, final float n, final float n2, final t6f t6f, final s6f s6f) {
        final int f = t6f.f;
        if (f != 1122868 && f != 1122867) {
            if (f != 0) {
                final int save = canvas.save();
                int b;
                if ((b = t6f.b) == 3) {
                    Objects.requireNonNull(s6f);
                    b = 4;
                }
                this.G0.setColor(t6f.f);
                float c;
                if (Float.isNaN(t6f.c)) {
                    Objects.requireNonNull(s6f);
                    c = 8.0f;
                }
                else {
                    c = t6f.c;
                }
                final float c2 = inw.c(c);
                final float n3 = c2 / 2.0f;
                final int e = ib0.E(b);
                Label_0345: {
                    if (e != 2) {
                        if (e == 3) {
                            this.G0.setStyle(Paint$Style.FILL);
                            canvas.drawRect(n, n2 - n3, n + c2, n2 + n3, this.G0);
                            break Label_0345;
                        }
                        if (e != 4) {
                            if (e != 5) {
                                break Label_0345;
                            }
                            float d;
                            if (Float.isNaN(t6f.d)) {
                                Objects.requireNonNull(s6f);
                                d = 3.0f;
                            }
                            else {
                                d = t6f.d;
                            }
                            final float c3 = inw.c(d);
                            Object e2;
                            if ((e2 = t6f.e) == null) {
                                Objects.requireNonNull(s6f);
                                e2 = null;
                            }
                            this.G0.setStyle(Paint$Style.STROKE);
                            this.G0.setStrokeWidth(c3);
                            this.G0.setPathEffect((PathEffect)e2);
                            this.K0.reset();
                            this.K0.moveTo(n, n2);
                            this.K0.lineTo(n + c2, n2);
                            canvas.drawPath(this.K0, this.G0);
                            break Label_0345;
                        }
                    }
                    this.G0.setStyle(Paint$Style.FILL);
                    canvas.drawCircle(n + n3, n2, n3, this.G0);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
