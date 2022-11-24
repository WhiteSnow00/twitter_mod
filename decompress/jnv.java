import android.graphics.Paint;
import android.text.TextPaint;
import android.graphics.Typeface;
import android.text.style.MetricAffectingSpan;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jnv extends MetricAffectingSpan
{
    public final Typeface F0;
    
    public jnv(final Typeface f0) {
        e0e.f((Object)f0, "typeface");
        this.F0 = f0;
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        e0e.f((Object)textPaint, "ds");
        ((Paint)textPaint).setTypeface(this.F0);
    }
    
    public final void updateMeasureState(final TextPaint textPaint) {
        e0e.f((Object)textPaint, "paint");
        ((Paint)textPaint).setTypeface(this.F0);
    }
}
