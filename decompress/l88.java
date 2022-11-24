import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.Paint$Align;
import android.graphics.Color;
import android.graphics.Paint$Style;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class l88 extends q7b
{
    public ku3 H0;
    public Paint I0;
    public Paint J0;
    public Paint K0;
    
    public l88(final ku3 h0, final hbx hbx) {
        super(hbx, 3);
        this.H0 = h0;
        (this.I0 = new Paint(1)).setStyle(Paint$Style.FILL);
        new Paint(4);
        (this.K0 = new Paint(1)).setColor(Color.rgb(63, 63, 63));
        this.K0.setTextAlign(Paint$Align.CENTER);
        this.K0.setTextSize(xnw.c(9.0f));
        (this.J0 = new Paint(1)).setStyle(Paint$Style.STROKE);
        this.J0.setStrokeWidth(2.0f);
        this.J0.setColor(Color.rgb(255, 187, 115));
    }
    
    public final void e(final x2d x2d) {
        final Paint k0 = this.K0;
        x2d.q();
        k0.setTypeface((Typeface)null);
        this.K0.setTextSize(x2d.L());
    }
    
    public abstract void i(final Canvas p0);
    
    public abstract void j(final Canvas p0);
    
    public abstract void k(final Canvas p0, final flc[] p1);
    
    public final void l(final Canvas canvas, final e4d e4d, final float n, final n8a n8a, final int n2, final float n3, final float n4, final int color) {
        this.K0.setColor(color);
        canvas.drawText(((xpw)e4d).i(n), n3, n4, this.K0);
    }
    
    public abstract void m(final Canvas p0);
    
    public abstract void n();
    
    public boolean o(final nu3 nu3) {
        return nu3.getData().e() < nu3.getMaxVisibleCount() * ((hbx)super.G0).i;
    }
}
