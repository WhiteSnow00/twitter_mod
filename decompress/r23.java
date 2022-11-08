import com.google.i18n.phonenumbers.NumberParseException;
import java.util.Objects;
import android.telephony.PhoneNumberUtils;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r23
{
    public final xbk a;
    public final Context b;
    
    public r23(final xbk a, final Context b) {
        zzd.f((Object)a, "phoneNumberUtilProvider");
        zzd.f((Object)b, "context");
        this.a = a;
        this.b = b;
    }
    
    public final String a(final int n, String s, final boolean b, String string) {
        zzd.f((Object)s, "phoneNumber");
        zzd.f((Object)string, "isoString");
        final String normalizeNumber = PhoneNumberUtils.normalizeNumber(s);
        zzd.e((Object)normalizeNumber, "normalizeNumber(phoneNumber)");
        if (normalizeNumber.length() == 0) {
            s = this.b.getString(2131955704);
            zzd.e((Object)s, "{\n            context.ge\u2026number_subtext)\n        }");
        }
        else {
            Objects.requireNonNull(this.a);
            final wbk i = wbk.i();
            zzd.e((Object)i, "phoneNumberUtilProvider.get()");
            try {
                final jck y = i.y((CharSequence)s, string);
                int n2;
                if (b) {
                    n2 = 2;
                }
                else {
                    n2 = 3;
                }
                string = (s = i.e(y, n2));
            }
            catch (final NumberParseException ex) {
                string = s;
                if (b) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("+");
                    sb.append(n);
                    sb.append(" ");
                    sb.append(s);
                    string = sb.toString();
                }
                s = string;
            }
            zzd.e((Object)s, "{\n            val util =\u2026)\n            }\n        }");
        }
        return s;
    }
}
