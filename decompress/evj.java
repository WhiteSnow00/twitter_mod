import android.graphics.Rect;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class evj
{
    public static final void a(final Paint paint, final CharSequence charSequence, final int n, final int n2, final Rect rect) {
        czd.f((Object)paint, "paint");
        czd.f((Object)charSequence, "text");
        czd.f((Object)rect, "rect");
        paint.getTextBounds(charSequence, n, n2, rect);
    }
}
