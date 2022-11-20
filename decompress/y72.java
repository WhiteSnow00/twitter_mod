import android.text.TextDirectionHeuristic;
import android.text.BoringLayout;
import android.text.TextUtils$TruncateAt;
import android.text.BoringLayout$Metrics;
import android.text.Layout$Alignment;
import android.text.TextPaint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y72
{
    public static final BoringLayout a(final CharSequence charSequence, final TextPaint textPaint, final int n, final Layout$Alignment layout$Alignment, final float n2, final float n3, final BoringLayout$Metrics boringLayout$Metrics, final boolean b, final TextUtils$TruncateAt textUtils$TruncateAt, final int n4) {
        czd.f((Object)charSequence, "text");
        czd.f((Object)textPaint, "paint");
        czd.f((Object)layout$Alignment, "alignment");
        czd.f((Object)boringLayout$Metrics, "metrics");
        return new BoringLayout(charSequence, textPaint, n, layout$Alignment, n2, n3, boringLayout$Metrics, b, textUtils$TruncateAt, n4);
    }
    
    public static final BoringLayout$Metrics b(final CharSequence charSequence, final TextPaint textPaint, final TextDirectionHeuristic textDirectionHeuristic) {
        czd.f((Object)charSequence, "text");
        czd.f((Object)textPaint, "paint");
        czd.f((Object)textDirectionHeuristic, "textDir");
        if (!textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return BoringLayout.isBoring(charSequence, textPaint, (BoringLayout$Metrics)null);
        }
        return null;
    }
}
