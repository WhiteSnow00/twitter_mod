import android.graphics.Paint;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvj
{
    public static final ThreadLocal<mvj<Rect, Rect>> a;
    
    static {
        a = new ThreadLocal<mvj<Rect, Rect>>();
    }
    
    public static final class a
    {
        public static boolean a(final Paint paint, final String s) {
            return paint.hasGlyph(s);
        }
    }
}
