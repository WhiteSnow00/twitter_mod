import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q2m
{
    public static final q2m a;
    public static final f9p b;
    public static final Map<String, Integer> c;
    
    static {
        a = new q2m();
        b = new f9p(f9p$a.L0, "", "", (String)null, (String)null, (String)null, (viw)null, "directly_typed");
        final LinkedHashMap c2 = new LinkedHashMap();
        (q2m.c = c2).put("news", 6);
        c2.put("users", 2);
        c2.put("images", 3);
        c2.put("videos", 5);
    }
    
    public static final f9p a(final Context context, final String s, String string) {
        czd.f((Object)context, "context");
        czd.f((Object)s, "currentQuery");
        czd.f((Object)string, "query");
        int n = string.length() - 1;
        int i = 0;
        int n2 = 0;
        while (i <= n) {
            int n3;
            if (n2 == 0) {
                n3 = i;
            }
            else {
                n3 = n;
            }
            final boolean b = czd.h((int)string.charAt(n3), 32) <= 0;
            if (n2 == 0) {
                if (!b) {
                    n2 = 1;
                }
                else {
                    ++i;
                }
            }
            else {
                if (!b) {
                    break;
                }
                --n;
            }
        }
        string = string.subSequence(i, n + 1).toString();
        final String string2 = context.getString(2131957465, new Object[] { string });
        czd.e((Object)string2, "context.getString(R.stri\u2026arch_go_to, trimmedQuery)");
        final f9p a = g9p.a(1, s, string, "com.twitter.android.action.USER_SHOW", string2, (viw)null, (rlv)null, (tqt)null);
        czd.c((Object)a);
        return a;
    }
}
