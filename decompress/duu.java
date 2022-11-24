import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.UnderlineSpan;

// 
// Decompiled by Procyon v0.6.0
// 

public final class duu extends UnderlineSpan
{
    public final euu F0;
    
    public duu(final euu f0) {
        this.F0 = f0;
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        super.updateDrawState(textPaint);
        ((Paint)textPaint).setColor(this.F0.a);
    }
}
