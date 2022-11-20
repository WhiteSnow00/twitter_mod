import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drp extends CharacterStyle
{
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    
    public drp(final int a, final float b, final float c, final float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        czd.f((Object)textPaint, "tp");
        ((Paint)textPaint).setShadowLayer(this.d, this.b, this.c, this.a);
    }
}
