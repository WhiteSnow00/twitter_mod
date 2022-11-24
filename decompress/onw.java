import java.util.Locale;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class onw
{
    public static final Map<String, String> a;
    
    static {
        final HashMap a2 = new HashMap();
        (onw.a = a2).put("AE", "ar");
        a2.put("AM", "hy");
        a2.put("CN", "zh");
        a2.put("EG", "ar");
        a2.put("HK", "zh");
        a2.put("JP", "ja");
        a2.put("KP", "ko");
        a2.put("KR", "ko");
        a2.put("MO", "zh");
        a2.put("RU", "ru");
        a2.put("TH", "th");
        a2.put("TW", "zh");
        a2.put("UA", "uk");
        a2.put("VN", "vi");
    }
    
    public static String a(String lowerCase) {
        if (lowerCase != null) {
            lowerCase = lowerCase.toLowerCase(Locale.ENGLISH);
        }
        else {
            lowerCase = null;
        }
        return lowerCase;
    }
    
    public static String b(String trim) {
        final String s = null;
        if (trim == null) {
            return null;
        }
        trim = trim.trim();
        if (trim.length() == 0) {
            trim = s;
        }
        return trim;
    }
}
