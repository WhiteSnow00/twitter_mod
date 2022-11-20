import android.util.Log;
import android.graphics.Paint;
import android.graphics.Paint$FontMetrics;
import android.graphics.Rect;
import android.util.DisplayMetrics;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class inw
{
    public static DisplayMetrics a;
    public static int b = 50;
    public static int c = 8000;
    public static Rect d;
    public static Paint$FontMetrics e;
    public static Rect f;
    public static ipw g;
    public static Rect h;
    public static Paint$FontMetrics i;
    
    static {
        Double.longBitsToDouble(Double.doubleToLongBits(1.0) + 1L);
        Float.intBitsToFloat(Float.floatToIntBits(1.0f) + 1);
        inw.d = new Rect();
        inw.e = new Paint$FontMetrics();
        inw.f = new Rect();
        inw.g = new ipw(1, 3);
        inw.h = new Rect();
        inw.i = new Paint$FontMetrics();
    }
    
    public static int a(final Paint paint, final String s) {
        final Rect d = inw.d;
        d.set(0, 0, 0, 0);
        paint.getTextBounds(s, 0, s.length(), d);
        return d.height();
    }
    
    public static wna b(final Paint paint, final String s) {
        final wna b = wna.b(0.0f, 0.0f);
        final Rect f = inw.f;
        f.set(0, 0, 0, 0);
        paint.getTextBounds(s, 0, s.length(), f);
        b.b = (float)f.width();
        b.c = (float)f.height();
        return b;
    }
    
    public static float c(final float n) {
        final DisplayMetrics a = inw.a;
        if (a == null) {
            Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.");
            return n;
        }
        return a.densityDpi / 160.0f * n;
    }
    
    public static wna d(float abs, final float n) {
        final double n2 = 0.0f;
        final float abs2 = Math.abs((float)Math.cos(n2) * abs);
        final float abs3 = Math.abs((float)Math.sin(n2) * n);
        abs = Math.abs(abs * (float)Math.sin(n2));
        return wna.b(abs3 + abs2, Math.abs(n * (float)Math.cos(n2)) + abs);
    }
    
    public static float e(final double n) {
        if (!Double.isInfinite(n) && !Double.isNaN(n) && n != 0.0) {
            double n2;
            if (n < 0.0) {
                n2 = -n;
            }
            else {
                n2 = n;
            }
            final float n3 = (float)Math.pow(10.0, 1 - (int)(float)Math.ceil((float)Math.log10(n2)));
            return Math.round(n * n3) / n3;
        }
        return 0.0f;
    }
}
