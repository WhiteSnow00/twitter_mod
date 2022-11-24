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

public final class me7 extends jog
{
    public final RectF e1;
    
    public me7() {
        this(null);
    }
    
    public me7(bsp bsp) {
        if (bsp == null) {
            bsp = new bsp();
        }
        super(bsp);
        final Paint paint = new Paint(1);
        paint.setStyle(Paint$Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
        this.e1 = new RectF();
    }
    
    public final void C(final float n, final float n2, final float n3, final float n4) {
        final RectF e1 = this.e1;
        if (n != e1.left || n2 != e1.top || n3 != e1.right || n4 != e1.bottom) {
            e1.set(n, n2, n3, n4);
            this.invalidateSelf();
        }
    }
    
    public final void h(final Canvas canvas) {
        if (this.e1.isEmpty()) {
            super.h(canvas);
        }
        else {
            canvas.save();
            if (Build$VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.e1);
            }
            else {
                canvas.clipRect(this.e1, Region$Op.DIFFERENCE);
            }
            super.h(canvas);
            canvas.restore();
        }
    }
}
