import android.text.Spanned;
import android.text.InputFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zog implements InputFilter
{
    public int a;
    
    public zog(final int a) {
        this.a = a;
    }
    
    public final CharSequence filter(final CharSequence charSequence, int a, int int1, final Spanned spanned, final int n, final int n2) {
        try {
            final StringBuilder sb = new StringBuilder((CharSequence)spanned);
            sb.replace(n, n2, charSequence.subSequence(a, int1).toString());
            int1 = Integer.parseInt(sb.toString());
            a = this.a;
            if (int1 <= a) {
                return null;
            }
            return "";
        }
        catch (final NumberFormatException ex) {
            return "";
        }
    }
}
