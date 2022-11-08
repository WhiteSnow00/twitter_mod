import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tmw
{
    public static final Map<String, Integer> a;
    public static final Set<Integer> b;
    
    static {
        final HashMap a2 = new HashMap();
        q1a.i(-1073741824, tmw.a = a2, "v21_generic", -1073741823, "v30_generic", -1073741820, "v21_europe", -1073741819, "v30_europe");
        final Integer value = -1073741816;
        a2.put("v21_japanese_utf8", value);
        final Integer value2 = -1073741815;
        a2.put("v30_japanese_utf8", value2);
        final Integer value3 = 402653192;
        a2.put("v21_japanese_mobile", value3);
        final Integer value4 = 939524104;
        a2.put("docomo", value4);
        final HashSet b2 = new HashSet();
        (tmw.b = b2).add(value);
        b2.add(value2);
        b2.add(value3);
        b2.add(value4);
    }
    
    public static boolean a(final int n) {
        boolean b = true;
        if ((n & 0x3) != 0x1) {
            b = false;
        }
        return b;
    }
    
    public static boolean b(final int n) {
        return (n & 0x3) == 0x2;
    }
}
