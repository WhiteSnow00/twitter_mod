import android.view.accessibility.CaptioningManager$CaptionStyle;
import android.graphics.Typeface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ph3
{
    public static final ph3 g;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Typeface f;
    
    static {
        g = new ph3(-1, -16777216, 0, 0, -1, null);
    }
    
    public ph3(final int a, final int b, final int c, final int d, final int e, final Typeface f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static ph3 a(final CaptioningManager$CaptionStyle captioningManager$CaptionStyle) {
        if (rnw.a >= 21) {
            int foregroundColor;
            if (captioningManager$CaptionStyle.hasForegroundColor()) {
                foregroundColor = captioningManager$CaptionStyle.foregroundColor;
            }
            else {
                foregroundColor = -1;
            }
            int backgroundColor;
            if (captioningManager$CaptionStyle.hasBackgroundColor()) {
                backgroundColor = captioningManager$CaptionStyle.backgroundColor;
            }
            else {
                backgroundColor = -16777216;
            }
            int windowColor;
            if (captioningManager$CaptionStyle.hasWindowColor()) {
                windowColor = captioningManager$CaptionStyle.windowColor;
            }
            else {
                windowColor = 0;
            }
            int edgeType;
            if (captioningManager$CaptionStyle.hasEdgeType()) {
                edgeType = captioningManager$CaptionStyle.edgeType;
            }
            else {
                edgeType = 0;
            }
            int edgeColor;
            if (captioningManager$CaptionStyle.hasEdgeColor()) {
                edgeColor = captioningManager$CaptionStyle.edgeColor;
            }
            else {
                edgeColor = -1;
            }
            return new ph3(foregroundColor, backgroundColor, windowColor, edgeType, edgeColor, captioningManager$CaptionStyle.getTypeface());
        }
        return new ph3(captioningManager$CaptionStyle.foregroundColor, captioningManager$CaptionStyle.backgroundColor, 0, captioningManager$CaptionStyle.edgeType, captioningManager$CaptionStyle.edgeColor, captioningManager$CaptionStyle.getTypeface());
    }
}
