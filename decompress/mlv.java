import java.util.List;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mlv
{
    public static final mlv a;
    public static ThreadLocal<Paint> b;
    
    static {
        mlv.b = new ThreadLocal<Paint>();
    }
    
    public static final Typeface a(final Typeface typeface, final qlb qlb, final Context context) {
        zzd.f((Object)qlb, "variationSettings");
        if (typeface == null) {
            return null;
        }
        if (qlb.a.isEmpty()) {
            return typeface;
        }
        Paint paint;
        if ((paint = mlv.b.get()) == null) {
            paint = new Paint();
            mlv.b.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(nkz.m((List)qlb.a, (CharSequence)null, (rtb)new llv(h6q.e(context)), 31));
        return paint.getTypeface();
    }
}
