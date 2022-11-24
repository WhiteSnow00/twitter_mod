import java.util.List;
import android.webkit.CookieManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u51
{
    public static String a(final CookieManager cookieManager, final String s) {
        final String cookie = cookieManager.getCookie(s);
        if (flr.e((CharSequence)cookie)) {
            return null;
        }
        final List y = ojf.y((Object[])cookie.split(";"));
        for (int i = 0; i < y.size(); ++i) {
            final String[] split = y.get(i).split("=");
            if (split.length >= 2 && "att".equals(split[0].trim())) {
                return split[1].trim();
            }
        }
        return null;
    }
    
    public static String b() {
        return fcu.c().j("att", "");
    }
    
    public static void c(final String s) {
        fcu.c().i().b("att", s).e();
    }
}
