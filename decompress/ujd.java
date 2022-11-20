import android.text.Layout;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.text.style.LeadingMarginSpan;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ujd implements LeadingMarginSpan
{
    public final void drawLeadingMargin(final Canvas canvas, final Paint paint, int n, int lineCount, int lineForOffset, final int n2, final int n3, final CharSequence charSequence, final int n4, final int n5, final boolean b, final Layout layout) {
        if (layout != null && paint != null) {
            lineForOffset = layout.getLineForOffset(n4);
            lineCount = layout.getLineCount();
            n = 1;
            if (lineForOffset == lineCount - 1 && xis.b(layout, lineForOffset)) {
                final float n6 = vjd.b(layout, lineForOffset, paint) + vjd.a(layout, lineForOffset, paint);
                if (n6 != 0.0f) {
                    n = 0;
                }
                if (n == 0) {
                    czd.c((Object)canvas);
                    canvas.translate(n6, 0.0f);
                }
            }
        }
    }
    
    public final int getLeadingMargin(final boolean b) {
        return 0;
    }
}
