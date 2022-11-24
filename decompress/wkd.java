import android.text.Layout$Alignment;
import android.graphics.Paint;
import android.text.Layout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wkd
{
    public static final float a(final Layout layout, int n, final Paint paint) {
        e0e.f((Object)layout, "<this>");
        e0e.f((Object)paint, "paint");
        final float lineLeft = layout.getLineLeft(n);
        if (pjs.b(layout, n) && layout.getParagraphDirection(n) == 1 && lineLeft < 0.0f) {
            final float n2 = paint.measureText("\u2026") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(n) + layout.getLineStart(n)) - lineLeft);
            final Layout$Alignment paragraphAlignment = layout.getParagraphAlignment(n);
            if (paragraphAlignment == null) {
                n = -1;
            }
            else {
                n = a.a[((Enum)paragraphAlignment).ordinal()];
            }
            float n3;
            float n4;
            if (n == 1) {
                n3 = Math.abs(lineLeft);
                n4 = (layout.getWidth() - n2) / 2.0f;
            }
            else {
                n3 = Math.abs(lineLeft);
                n4 = layout.getWidth() - n2;
            }
            return n4 + n3;
        }
        return 0.0f;
    }
    
    public static final float b(final Layout layout, final int n, final Paint paint) {
        e0e.f((Object)layout, "<this>");
        e0e.f((Object)paint, "paint");
        if (pjs.b(layout, n)) {
            final int paragraphDirection = layout.getParagraphDirection(n);
            int n2 = -1;
            if (paragraphDirection == -1 && layout.getWidth() < layout.getLineRight(n)) {
                final float n3 = paint.measureText("\u2026") + (layout.getLineRight(n) - layout.getPrimaryHorizontal(layout.getEllipsisStart(n) + layout.getLineStart(n)));
                final Layout$Alignment paragraphAlignment = layout.getParagraphAlignment(n);
                if (paragraphAlignment != null) {
                    n2 = a.a[((Enum)paragraphAlignment).ordinal()];
                }
                float n4;
                float n5;
                if (n2 == 1) {
                    n4 = layout.getWidth() - layout.getLineRight(n);
                    n5 = (layout.getWidth() - n3) / 2.0f;
                }
                else {
                    n4 = layout.getWidth() - layout.getLineRight(n);
                    n5 = layout.getWidth() - n3;
                }
                return n4 - n5;
            }
        }
        return 0.0f;
    }
    
    public final class a
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[Layout$Alignment.values().length];
            a2[((Enum)Layout$Alignment.ALIGN_CENTER).ordinal()] = 1;
            a = a2;
        }
    }
}
