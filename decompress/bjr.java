import java.util.Locale;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bjr
{
    static {
        zzd.e((Object)MessageDigest.getInstance("MD5"), "getInstance(\"MD5\")");
    }
    
    public static final String a(String substring) {
        zzd.f((Object)substring, "<this>");
        final Locale us = Locale.US;
        zzd.e((Object)us, "US");
        final boolean b = substring.length() > 0;
        String string = substring;
        if (b) {
            final StringBuilder sb = new StringBuilder();
            final char char1 = substring.charAt(0);
            String s;
            if (Character.isLowerCase(char1)) {
                s = tdy.X0(char1, us);
            }
            else {
                s = String.valueOf(char1);
            }
            sb.append((Object)s);
            substring = substring.substring(1);
            zzd.e((Object)substring, "this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            string = sb.toString();
        }
        return string;
    }
}
