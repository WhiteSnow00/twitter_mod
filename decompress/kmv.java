import java.util.List;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kmv
{
    public static final kmv a;
    public static ThreadLocal<Paint> b;
    
    static {
        kmv.b = new ThreadLocal<Paint>();
    }
    
    public static final Typeface a(final Typeface typeface, final okb okb, final Context context) {
        czd.f((Object)okb, "variationSettings");
        if (typeface == null) {
            return null;
        }
        if (okb.a.isEmpty()) {
            return typeface;
        }
        Paint paint;
        if ((paint = kmv.b.get()) == null) {
            paint = new Paint();
            kmv.b.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(blz.p(okb.a, null, (qsb)new jmv(af8.b(context)), 31));
        return paint.getTypeface();
    }
}
