import android.graphics.Typeface;
import java.util.Objects;
import androidx.emoji2.text.c;
import android.graphics.Paint;
import android.annotation.SuppressLint;
import android.graphics.Canvas;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rmv extends b1a
{
    public rmv(final y0a y0a) {
        super(y0a);
    }
    
    public final void draw(final Canvas canvas, @SuppressLint({ "UnknownNullness" }) final CharSequence charSequence, int a, final int n, final float n2, final int n3, final int n4, final int n5, final Paint paint) {
        Objects.requireNonNull(c.a());
        final y0a e0 = super.E0;
        final float n6 = (float)n4;
        final Typeface d = e0.b.d;
        final Typeface typeface = paint.getTypeface();
        paint.setTypeface(d);
        a = e0.a;
        canvas.drawText(e0.b.b, a * 2, 2, n2, n6, paint);
        paint.setTypeface(typeface);
    }
}
