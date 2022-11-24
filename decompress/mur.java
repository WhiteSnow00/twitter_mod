import android.text.style.RelativeSizeSpan;
import android.text.style.AbsoluteSizeSpan;
import java.util.Objects;
import android.text.SpannableString;
import android.text.Spannable;
import android.text.Spanned;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mur
{
    public static void a(final v87.a a) {
        a.k = -3.4028235E38f;
        a.j = Integer.MIN_VALUE;
        final CharSequence a2 = a.a;
        if (a2 instanceof Spanned) {
            if (!(a2 instanceof Spannable)) {
                a.a = (CharSequence)SpannableString.valueOf(a2);
            }
            final CharSequence a3 = a.a;
            Objects.requireNonNull(a3);
            final Spannable spannable = (Spannable)a3;
            for (final Object o : ((Spanned)spannable).getSpans(0, ((CharSequence)spannable).length(), (Class)Object.class)) {
                if (o instanceof AbsoluteSizeSpan || o instanceof RelativeSizeSpan) {
                    spannable.removeSpan(o);
                }
            }
        }
    }
    
    public static float b(final int n, final float n2, final int n3, final int n4) {
        if (n2 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        float n5;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    return -3.4028235E38f;
                }
                return n2;
            }
            else {
                n5 = (float)n3;
            }
        }
        else {
            n5 = (float)n4;
        }
        return n2 * n5;
    }
}
