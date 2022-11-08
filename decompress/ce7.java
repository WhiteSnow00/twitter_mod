import android.graphics.Region$Op;
import android.os.Build$VERSION;
import android.graphics.Canvas;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ce7 extends qng
{
    public final RectF b1;
    
    public ce7() {
        this(null);
    }
    
    public ce7(pqp pqp) {
        if (pqp == null) {
            pqp = new pqp();
        }
        super(pqp);
        final Paint paint = new Paint(1);
        paint.setStyle(Paint$Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
        this.b1 = new RectF();
    }
    
    public final void C(final float n, final float n2, final float n3, final float n4) {
        final RectF b1 = this.b1;
        if (n != b1.left || n2 != b1.top || n3 != b1.right || n4 != b1.bottom) {
            b1.set(n, n2, n3, n4);
            this.invalidateSelf();
        }
    }
    
    public final void h(final Canvas canvas) {
        if (this.b1.isEmpty()) {
            super.h(canvas);
        }
        else {
            canvas.save();
            if (Build$VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.b1);
            }
            else {
                canvas.clipRect(this.b1, Region$Op.DIFFERENCE);
            }
            super.h(canvas);
            canvas.restore();
        }
    }
}
