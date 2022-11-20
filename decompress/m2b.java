import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Color;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m2b extends ste implements nsb<Paint>
{
    public static final m2b D0;
    
    static {
        D0 = new m2b();
    }
    
    public m2b() {
        super(0);
    }
    
    public final Object invoke() {
        final Paint paint = new Paint();
        paint.setColor(Color.argb(128, 0, 0, 0));
        paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
        return paint;
    }
}
