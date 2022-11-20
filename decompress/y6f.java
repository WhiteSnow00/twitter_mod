import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y6f extends MetricAffectingSpan
{
    public final float D0;
    
    public y6f(final float d0) {
        this.D0 = d0;
    }
    
    public final void a(final TextPaint textPaint) {
        final float n = ((Paint)textPaint).getTextScaleX() * ((Paint)textPaint).getTextSize();
        if (n != 0.0f) {
            ((Paint)textPaint).setLetterSpacing(this.D0 / n);
        }
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        czd.f((Object)textPaint, "textPaint");
        this.a(textPaint);
    }
    
    public final void updateMeasureState(final TextPaint textPaint) {
        czd.f((Object)textPaint, "textPaint");
        this.a(textPaint);
    }
}
