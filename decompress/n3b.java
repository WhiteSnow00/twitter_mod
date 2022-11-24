import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Color;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n3b extends pue implements ptb<Paint>
{
    public static final n3b F0;
    
    static {
        F0 = new n3b();
    }
    
    public n3b() {
        super(0);
    }
    
    public final Object invoke() {
        final Paint paint = new Paint();
        paint.setColor(Color.argb(128, 0, 0, 0));
        paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
        return paint;
    }
}
