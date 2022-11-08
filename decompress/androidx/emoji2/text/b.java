// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

import android.graphics.Rect;
import android.graphics.Paint;
import android.os.Build$VERSION;
import android.text.TextPaint;

public final class b implements d
{
    public static final ThreadLocal<StringBuilder> b;
    public final TextPaint a;
    
    static {
        b = new ThreadLocal<StringBuilder>();
    }
    
    public b() {
        ((Paint)(this.a = new TextPaint())).setTextSize(10.0f);
    }
    
    public final boolean a(final CharSequence charSequence, int i, int n, int length) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean a = false;
        if (sdk_INT < 23 && length > sdk_INT) {
            return false;
        }
        final ThreadLocal<StringBuilder> b = androidx.emoji2.text.b.b;
        if (b.get() == null) {
            b.set(new StringBuilder());
        }
        final StringBuilder sb = b.get();
        sb.setLength(0);
        while (i < n) {
            sb.append(charSequence.charAt(i));
            ++i;
        }
        final TextPaint a2 = this.a;
        final String string = sb.toString();
        final ThreadLocal a3 = bvj.a;
        if (Build$VERSION.SDK_INT >= 23) {
            a = bvj$a.a((Paint)a2, string);
        }
        else {
            length = string.length();
            if (length != 1 || !Character.isWhitespace(string.charAt(0))) {
                final float measureText = ((Paint)a2).measureText("\udb3f\udffd");
                final float measureText2 = ((Paint)a2).measureText("m");
                final float measureText3 = ((Paint)a2).measureText(string);
                float n2 = 0.0f;
                if (measureText3 == 0.0f) {
                    return a;
                }
                if (string.codePointCount(0, string.length()) > 1) {
                    if (measureText3 > measureText2 * 2.0f) {
                        return a;
                    }
                    for (i = 0; i < length; i = n) {
                        n = Character.charCount(string.codePointAt(i)) + i;
                        n2 += ((Paint)a2).measureText(string, i, n);
                    }
                    if (measureText3 >= n2) {
                        return a;
                    }
                }
                if (measureText3 == measureText) {
                    final ThreadLocal a4 = bvj.a;
                    hvj hvj = a4.get();
                    if (hvj == null) {
                        hvj = new hvj(new Rect(), new Rect());
                        a4.set(hvj);
                    }
                    else {
                        ((Rect)hvj.a).setEmpty();
                        ((Rect)hvj.b).setEmpty();
                    }
                    ((Paint)a2).getTextBounds("\udb3f\udffd", 0, 2, (Rect)hvj.a);
                    ((Paint)a2).getTextBounds(string, 0, length, (Rect)hvj.b);
                    a = (((Rect)hvj.a).equals((Object)hvj.b) ^ true);
                    return a;
                }
            }
            a = true;
        }
        return a;
    }
}
