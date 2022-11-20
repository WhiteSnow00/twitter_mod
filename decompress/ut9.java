import android.text.Spannable;
import android.text.TextUtils;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.InputFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ut9 implements InputFilter
{
    public final ktb a;
    public final String b;
    
    public ut9(final ktb a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final CharSequence filter(final CharSequence charSequence, final int n, final int n2, final Spanned spanned, final int n3, int i) {
        final ktb a = this.a;
        final String b = this.b;
        czd.f((Object)a, "$exemption");
        czd.f((Object)b, "$allowedChars");
        final StringBuilder sb = new StringBuilder(n2 - n);
        boolean b2 = true;
        char char1;
        for (i = n; i < n2; ++i) {
            char1 = charSequence.charAt(i);
            if (!(boolean)a.I((Object)char1, (Object)i, (Object)n3, (Object)spanned.toString()) && !zkr.d0((CharSequence)b, char1)) {
                b2 = false;
            }
            else {
                sb.append(char1);
            }
        }
        Object o;
        if (b2) {
            o = null;
        }
        else {
            o = sb;
            if (charSequence instanceof Spanned) {
                o = new SpannableString((CharSequence)sb);
                TextUtils.copySpansFrom((Spanned)charSequence, n, sb.length(), (Class)null, (Spannable)o, 0);
            }
        }
        return (CharSequence)o;
    }
}
