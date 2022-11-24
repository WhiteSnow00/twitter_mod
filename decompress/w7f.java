import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w7f extends MetricAffectingSpan
{
    public final float F0;
    
    public w7f(final float f0) {
        this.F0 = f0;
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        e0e.f((Object)textPaint, "textPaint");
        ((Paint)textPaint).setLetterSpacing(this.F0);
    }
    
    public final void updateMeasureState(final TextPaint textPaint) {
        e0e.f((Object)textPaint, "textPaint");
        ((Paint)textPaint).setLetterSpacing(this.F0);
    }
}
